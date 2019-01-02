(ns portkey.aws
  (:refer-clojure :exclude [cond])
  (:require [camel-snake-kebab.core :as kebab]
            [clj-http.client :as http]
            [clojure.core.async :as async]
            [clojure.data.xml :as xml]
            [clojure.java.io :as io]
            [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [portkey.awssig :as sig]
            [ring.util.codec :as codec]))


(defn dashed [^String s]
  (-> s
      (str/replace #"[\W]*" "")
      kebab/->kebab-case-string))


; Java 8
(defn base64-encode [bytes] (.encodeToString (java.util.Base64/getEncoder) bytes))
(defn base64-decode [^String s] (.decode (java.util.Base64/getDecoder) s))


;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                    ___            _         _   _      _                     ┃
;; ┃                   / __|_ _ ___ __| |___ _ _| |_(_)__ _| |___                 ┃
;; ┃                  | (__| '_/ -_) _` / -_) ' \  _| / _` | (_-<                 ┃
;; ┃                   \___|_| \___\__,_\___|_||_\__|_\__,_|_/__/                 ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


(def ^:dynamic *region* nil)


(def ^:dynamic *credentials*
  "A map with keys :access-key, :secret-key and optionally :token"
  nil)


(defmacro cond
  "This macro is used mainly in the guess-credentials! function."
  ([] nil)
  ([c e & etc]
   (case c
     :let `(let ~e (cond ~@etc))
     :when-let `(when-let ~e (cond ~@etc))
     :when-some `(when-some ~e (cond ~@etc))
     (case (and (vector? c) (some #{:let :some} (keys (meta c))))
       :let `(if-let ~(vary-meta c dissoc :let) ~e (cond ~@etc))
       :some `(if-some ~(vary-meta c dissoc :some) ~e (cond ~@etc))
       `(if ~c ~e (cond ~@etc))))))


(defn- parse-profile [file profile]
  (when (.exists file)
    (with-open [rdr (io/reader file)]
      (into {}
            (comp
             (remove #(re-matches #"\s*(?:;.*)?" %))
             (map str/trim)
             (drop-while #(not= profile (second (re-matches #"\s*\[\s*(.+?)\s*]\s*" %))))
             (drop 1)
             (map #(when-some [[_ k v] (re-matches #"\s*([^\[=][^=]*?)\s*=\s*(\S.*?)\s*" %)] [k v]))
             (take-while some?))
            (->> rdr java.io.BufferedReader. line-seq)))))


(defn- guess-credentials!
  "Returns a map with keys :access-key :secret-key or nil."
  []
  (when-some [[a s]
              (cond
                ^:some [id (System/getenv "AWS_ACCESS_KEY_ID")]
                [id (System/getenv "AWS_SECRET_ACCESS_KEY")]

                ^:some [id (System/getProperty "aws.accessKeyId")]
                [id (System/getProperty "aws.secretKey")]

                :let [file                                              (or (some-> (System/getenv "AWS_CREDENTIAL_PROFILES_FILE") java.io.File.)
                                                                            (java.io.File. (System/getProperty "user.home") ".aws/credentials"))
                      profile                                           (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")
                      {:strs [aws_access_key_id aws_secret_access_key]} (parse-profile file profile)]
                (some? aws_access_key_id)                                [aws_access_key_id aws_secret_access_key])]
    {:access-key a :secret-key s}))


(defn- guess-region!
  "Returns a map with keys :access-key :secret-key or nil."
  []
  (or
   (System/getenv "AWS_REGION")
   (let [file (or (some-> (System/getenv "AWS_CONFIG_FILE") java.io.File.)
                  (java.io.File. (System/getProperty "user.home") ".aws/config"))
         profile (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")]
     (get (parse-profile file profile) "region"))
   #_(TODO see "http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html")
   "us-east-1"))


(defn credentials []
  (or *credentials* (guess-credentials!)
    (throw (RuntimeException. "No AWS credentials found!"))))


(defn region []
  (or *region* (guess-region!)))



;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃      _  _ _____ _____ ___   ___                      _      ___      _ _     ┃
;; ┃     | || |_   _|_   _| _ \ | _ \___ __ _ _  _ ___ __| |_   / __|__ _| | |    ┃
;; ┃     | __ | | |   | | |  _/ |   / -_) _` | || / -_|_-<  _| | (__/ _` | | |    ┃
;; ┃     |_||_| |_|   |_| |_|   |_|_\___\__, |\_,_\___/__/\__|  \___\__,_|_|_|    ┃
;; ┃                                       |_|                                    ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


(defn- sign-v4 [req credential-scope]
  (sig/sigv4 req (into (credentials) credential-scope)))


(defn wrap-sign [client]
  (fn [{:as req :keys [::credential-scope ::signature-version]} & args]
    (let [req (dissoc req ::credential-scope ::signature-version)
          req (case signature-version
                (:v4 :s3v4) (sign-v4 req credential-scope))]
        (apply client req args))))


(defn sync-http-client [req coerce-resp]
  (http/with-additional-middleware [wrap-sign]
    (let [[tag v] (-> req
                    (assoc :throw-exceptions false)
                    http/request
                    coerce-resp)]
      (case tag
        :result v
        :exception (throw v)))))


(defn async-http-client
  "When this function is bound as *http-client* then AWS functions returns
   a core.async channel which will eventually receives either [:result r] or
   [:exception ex]."
  [req coerce-resp]
  (let [chan (async/chan 1)]
    (http/with-additional-middleware [wrap-sign]
      (-> req
        (assoc :throw-exceptions false :async? true)
        (http/request
          (fn [resp]
            (async/>!! chan (coerce-resp resp)))
          (fn [exception]
            (async/>!! chan [:exception exception])))))
    chan))


(def ^:dynamic *http-client* sync-http-client)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; RUNTIME REQUEST TRANSFORMATION ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn- params-to-uri
  "Given the url of the form '/{Bucket}/delete' and
  the :http.request.configuration/uri vector of user values, returns
  the final url in the request."
  [{:as req
    {url :url} :ring.request
    :keys [:http.request.configuration/uri]}]
  (assoc-in req
            [:ring.request :url]
            (str/replace url
                         #"\{([^\}\+]*)[+]*}"
                         (fn [[_ n]]
                           (if-some [v (some #(and (= n (:http.request.field/location-name %))
                                                   (:http.request.field/value %))
                                             uri)]
                             ;; @TODO : verify if url encoding is
                             ;; automatic with clj-http
                             v
                             (throw (ex-info (str "Missing parameter " n)
                                             {:url url :uri uri})))))))


(defn- params-to-header
  "Compute all headers for the ring request."
  [{:as   req
    :keys [:http.request.configuration/header]}]
  (update-in req
             [:ring.request :headers]
             (fnil into {})
             (into {}
                   (map (fn [{:http.request.field/keys [value name location-name]}]
                          [(or location-name name) value]))
                   header)))


(defn- params-to-headers
  "Compute all headers for the ring request. Comes from map type where
  we have to generate several headers."
  [{:as   req
    :keys [:http.request.configuration/headers]}]
  (update-in req
             [:ring.request :headers]
             (fnil into {})
             (into {}
                   (comp (mapcat (fn [{:http.request.field/keys [type location-name] :as v}]
                                   ;; @NOTE - @dupuchba : in case of map, we have to duplicate location-name with it's key name and value
                                   (if (= "map" type)
                                     (into []
                                           (map (fn [[k v]]
                                                  #:http.request.field{:location-name (str location-name (:http.request.field/value k))
                                                                       :value         (:http.request.field/value v)})
                                                (v :http.request.field/value)))
                                     [v])))
                         (map (fn [{:http.request.field/keys [value name location-name]}]
                                [(or location-name name) value])))
                   headers)))


(defn params-to-body-rest-xml
  "to complete"
  [{:keys [:http.request.configuration/method] :as req}]
  (if (contains? #{:put :post :patch} method)
    ;; @TODO - @dupuchba : body should be a map and not a collection of field, to check
    (let [{:http.request.field/keys [streaming value] :as body} (-> req :http.request.configuration/body first)
          map->xml                                              (fn map->xml
                                                                  ([all]
                                                                   (map->xml all nil))
                                                                  ([{:http.request.field/keys [name shape value type location-name flattened xml-namespace xml-attribute] :as all} pre]
                                                                   (let [template-fn (fn template-fn
                                                                                       ([content]
                                                                                        (template-fn content nil))
                                                                                       ([content xml-attrs]
                                                                                        (let [{prefix "prefix" uri "uri"} xml-namespace]
                                                                                          (cond-> {:tag     (or pre location-name name shape)
                                                                                                   :content content}
                                                                                            xml-namespace (assoc :attrs (into {(if prefix (str "xmlns:" prefix) "xmlns") uri}
                                                                                                                              (when-let [attrs (seq xml-attrs)]
                                                                                                                                (into {}
                                                                                                                                      (map (fn [{:http.request.field/keys [location-name value]}]
                                                                                                                                             [location-name value]))
                                                                                                                                      attrs))))))))]
                                                                     (clojure.core/cond 
                                                                       (= type "structure") (template-fn (into []
                                                                                                               (comp (remove #(:http.request.field/xml-attribute %))
                                                                                                                     (map map->xml)) value)
                                                                                                         ;; @NOTE -  @dupuchba : used to fill xml-attribute on it's direct parent
                                                                                                         (sequence (keep (fn [{:http.request.field/keys [xml-attribute] :as val}]
                                                                                                                           (and xml-attribute val)))
                                                                                                                   value))
                                                                       (= type "map" (throw (Exception. "AWS map type is not handled as we never saw any cases in xml body from rest-xml protocol.")))
                                                                       (= type "list")      (if flattened
                                                                                              ;; if list is flattened, then we ignore root tag
                                                                                              (into [] (map #(map->xml % location-name) value))
                                                                                              (template-fn (into [] (map map->xml) value)))
                                                                       :else                (template-fn value)))))]
      (assoc-in req
                [:ring.request :body]
                ;; @NOTE : streaming doesn't need to be xmlfied
                (if (not (true? streaming)) 
                  (xml/emit-str (map->xml body))
                  value)))
    req))


(defn- params-to-body-ec2
  "to complete"
  ;; @TODO - @dupuchba: flatten from sdb is not handled yet.
  [{:keys [:http.request.configuration/method
           :http.request.configuration/action
           :http.request.configuration/version
           :http.request.configuration/body] :as req}]
  (if (contains? #{:put :post :patch} method)
    (assoc-in req
              [:ring.request :body]
              (-> (let [template-fn      (fn template-fn
                                           ([field]
                                            (template-fn nil nil field))
                                           ([parent-type prefix {:http.request.field/keys [name value location-name shape type flattened] :as field}]
                                            (clojure.core/cond
                                              (and (= parent-type "list") flattened) [(str (or location-name name shape)
                                                                                           "."
                                                                                           (or 
                                                                                            prefix
                                                                                            ""))
                                                                                      value]
                                              (= parent-type "map")                  (let [[k v] field]
                                                                                       {(str (or prefix "") "." (:http.request.field/map-info k))
                                                                                        (:http.request.field/value k)
                                                                                        (str (or prefix "") "." (:http.request.field/map-info v))
                                                                                        (:http.request.field/value v)})
                                              :else                                  [(str (or (when (= parent-type "structure") (str prefix "."))
                                                                                               prefix
                                                                                               "")
                                                                                           (when-not (= parent-type "list") name))
                                                                                      value])))
                        map->flatten-map (fn map->flatten-map
                                           ([field]
                                            (map->flatten-map nil nil field))
                                           ([parent-type prefix {:http.request.field/keys [name value location-name type flattened] :as field}]
                                            (cond
                                              (= type "list")      (into {}
                                                                         (map-indexed (fn [idx item]
                                                                                        (map->flatten-map "list"
                                                                                                          (cond
                                                                                                            (true? flattened) (inc idx)
                                                                                                            prefix            (str prefix "." (or location-name name) "." (inc idx))
                                                                                                            :else             (str (or location-name name) "." (inc idx)))
                                                                                                          (cond-> item
                                                                                                            flattened (assoc :http.request.field/flattened true)))))
                                                                         value)
                                              (= type "map")       (into {}
                                                                         (map-indexed (fn [idx item]
                                                                                        (map->flatten-map "map" (if prefix
                                                                                                                  (str prefix "." (or location-name name) ".entry." (inc idx))
                                                                                                                  (str (or location-name name) ".entry." (inc idx))) item))) value)
                                              (= type "structure") (into {} (map (partial map->flatten-map "structure" prefix)) value)
                                              :else                (template-fn parent-type prefix field))))]
                    (into {"Action"  action
                           "Version" version}
                          (map map->flatten-map) body))
                  codec/form-encode))
    req))


(comment


  (declare map->flatten-map)

  (sc.api/letsc
   1
   (-> req params-to-body))

  (xml/parse-str "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ListAllMyBucketsResult xmlns=\"http://s3.amazonaws.com/doc/2006-03-01/\"><Owner><ID>2dffe649db8c484ba0c1ba118f090cacc78c0cd90a05515723be21038964cb42</ID><DisplayName>baptiste.dupuch</DisplayName></Owner><Buckets><Bucket><Name>baptistedupuchtest</Name><CreationDate>2018-08-30T18:48:27.000Z</CreationDate></Bucket><Bucket><Name>cf-templates-wrikh2g1easj-eu-west-1</Name><CreationDate>2018-11-06T08:45:01.000Z</CreationDate></Bucket><Bucket><Name>elasticbeanstalk-eu-west-1-239519826177</Name><CreationDate>2017-10-17T09:48:41.000Z</CreationDate></Bucket><Bucket><Name>fdksfdsfjfdsofjsdf</Name><CreationDate>2018-10-24T15:01:46.000Z</CreationDate></Bucket><Bucket><Name>legacy-to-epiphany-test-my-little</Name><CreationDate>2018-06-22T13:30:09.000Z</CreationDate></Bucket><Bucket><Name>pegase-appdeve</Name><CreationDate>2017-05-29T15:15:29.000Z</CreationDate></Bucket><Bucket><Name>pegase-appprode</Name><CreationDate>2017-11-09T10:07:28.000Z</CreationDate></Bucket><Bucket><Name>sdfdsfojojjsfdt</Name><CreationDate>2018-10-24T14:22:07.000Z</CreationDate></Bucket><Bucket><Name>terraform_getting_started_guide_baptiste</Name><CreationDate>2017-11-28T14:54:11.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj</Name><CreationDate>2018-10-24T16:57:21.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj1</Name><CreationDate>2018-10-28T10:40:25.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj2</Name><CreationDate>2018-10-28T10:54:52.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj34</Name><CreationDate>2018-10-28T11:04:09.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj345</Name><CreationDate>2018-10-28T21:41:45.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj346</Name><CreationDate>2018-11-04T11:29:12.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj3461</Name><CreationDate>2018-11-04T10:59:06.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj3462</Name><CreationDate>2018-11-04T11:10:35.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj34621</Name><CreationDate>2018-11-04T11:20:52.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj34622</Name><CreationDate>2018-11-04T19:59:00.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj346221</Name><CreationDate>2018-11-04T20:41:00.000Z</CreationDate></Bucket><Bucket><Name>testbucketforawsclj346223</Name><CreationDate>2018-11-07T15:37:19.000Z</CreationDate></Bucket></Buckets></ListAllMyBucketsResult>")


  (sc.api/letsc
   2
   (-> req params-to-body))


  ;; Si structure pas flattened alors location-name du members mais pas de l'enfant
  ;; Si list pas flattened alors location-name du parent mais pas de l'enfant direct
  (sc.api/letsc
   1
   (let [body (-> req :http.request.configuration/body)]
     
     (let [a (fn a [prefix suffix type1 flattened1 {:http.request.field/keys [value shape name location-name type flattened] :as field}]
               (let [conj (fnil conj [])]
                 (cond
                   (= type "structure") (into {}
                                              (map (fn [item]
                                                     (let [prefix (conj prefix (when-not flattened (or location-name name)))]                                                       
                                                       (a prefix suffix type flattened item))))
                                              value)
                   (= type "map")       (into {}
                                              (map-indexed (fn [idx item]
                                                             (let [prefix (conj prefix
                                                                                (when-not flattened  (or location-name name))
                                                                                (when-not flattened  "entry")
                                                                                (inc idx))]
                                                               (into {}
                                                                     (map #(a prefix suffix type flattened %))
                                                                     item))))
                                              value)
                   (= type "list")      (into {}
                                              (map-indexed (fn [idx item]
                                                             (let [prefix (if-not flattened
                                                                            (conj prefix (or location-name name) "member" (inc idx))
                                                                            prefix)
                                                                   suffix (if-not flattened
                                                                            suffix
                                                                            (inc idx))]
                                                               (a prefix suffix type flattened item))))
                                              value)
                   :else                (let [prefix (conj prefix (when-not (and (= type1 "list") (nil? flattened1)) (or location-name name)) suffix)
                                              prefix (x/str (comp (remove nil?)
                                                                  (map str)
                                                                  (remove #(str/blank? %))
                                                                  (interpose "."))
                                                            prefix)]
                                          (hash-map prefix value)))))]
       (into {}
             (map (partial a nil nil nil nil))
             body))))



  (require '[net.cgrand.xforms :as x])
  (dir x)
  (x/str)
  (let [prefix ["" "a" "b" "c" "" "a" 1]]
    (x/str (comp (remove nil?)
                 (map str)
                 (remove #(str/blank? %))
                 (interpose "."))
           prefix))
  (conj [1 2] 3 4)
  
  (sc.api/letsc
   1
   (let [body (-> req :http.request.configuration/body)]


     (let [a (fn a [prefix flattened1 {:http.request.field/keys [value shape name location-name type flattened] :as field}]
               (let [template-fn (fn template-fn [prefix value]
                                   (hash-map prefix value))]
                 (cond
                   (= type "structure") (into {}
                                              (map (fn [item]
                                                     (let [prefix (str (or (and prefix (str prefix ".")) "")
                                                                       (when-not flattened (or location-name name)))]
                                                       (a prefix flattened item))))
                                              value)
                   (= type "map")       (into {}
                                              (map-indexed (fn [idx item]
                                                             (let [prefix (str (or (and prefix (str prefix ".")) "")
                                                                               (str (or location-name name) ".")
                                                                               (inc idx))]
                                                               (into {}
                                                                     (map #(a prefix flattened %))
                                                                     item))))
                                              value)
                   (= type "list")      (into {}
                                              (map-indexed (fn [idx item]
                                                             (let [prefix (str (or (and prefix (str prefix ".")) "")
                                                                               (when-not flattened (str (or location-name name) "."))
                                                                               (inc idx))]
                                                               (a prefix flattened item))))
                                              value)
                   :else                (template-fn (str (or (and prefix (str prefix ".")) "")
                                                          (when-not flattened1 (or location-name name)))
                                                     value))))]
       (into {}
             (map (partial a nil nil))
             body))))

  {"DelaySeconds"                               0,
   "MessageAttribute.1.Value.DataType"          "String",
   "MessageAttribute.1.Value.2.StringListValue" "B"
   "MessageBody"                                "body"
   "QueueUrl"                                   "http://google.fr"
   "MessageAttribute.1.Name"                    "KeyNameCACA"
   "MessageAttribute.1.Value.StringValue"       "StringValueCACA"
   "MessageAttribute.1.Value.1.StringListValue" "A"
   "MessageAttribute.1.Value.3.StringListValue" "C"}
  
  

  ;; flattened ou pas
  ;; tous les compound types peuvent être récursif

  "Action=SendMessage
Version=2012-11-05
QueueUrl=http%3A%2F%2Fgoogle.fr
MessageBody=body
DelaySeconds=0
MessageAttribute.entry.1.key=KeyNameCACA
MessageAttribute.entry.1.value=value=String
shape=String
name=DataType
MessageAttribute.entry.1.value=value=StringValueCACA
shape=String
name=StringValue
MessageAttribute.entry.1.value=value=value=A
shape=String
location-name=StringListValue
value=value=B
shape=String
location-name=StringListValue
value=value=C
shape=String
location-name=StringListValue
shape=StringList
type=list
name=StringListValues
flattened=true
location-name=StringListValue")


(defn- params-to-body
  "to complete"
  [{:keys [:http.request.configuration/protocol] :as req}]
  (case protocol
    "rest-xml" (params-to-body-rest-xml req)
    "ec2"      (params-to-body-ec2 req)
    "query"    (params-to-body-ec2 req)))


(defn- content-md5 [{{:keys [body]} :ring.request :as req}]
  (let [message-digest (java.security.MessageDigest/getInstance "MD5")
        _              (.update message-digest (.getBytes body))
        bytes'         (.digest message-digest)]
    (base64-encode bytes')))


(defn- params-to-content-md5-header
  "Add the Contente-MD5 header to the request for S3 service."
  [{:as req :http.request.configuration/keys [protocol method service-id]}]
  (if (and (= protocol "rest-xml") (= service-id "S3") (contains? #{:put :post :patch} method))
    (-> req
        (update :http.request.configuration/header
                (fnil conj [])
                #:http.request.field{:value         (content-md5 req)
                                     :shape-name    "ContentMD5"
                                     :location-name "Content-MD5"}))
    req))


;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃      ___          _   _             _  _ _____ _____ ___    ___      _ _     ┃
;; ┃     | _ \_  _ _ _| |_(_)_ __  ___  | || |_   _|_   _| _ \  / __|__ _| | |    ┃
;; ┃     |   / || | ' \  _| | '  \/ -_) | __ | | |   | | |  _/ | (__/ _` | | |    ┃
;; ┃     |_|_\\_,_|_||_\__|_|_|_|_\___| |_||_| |_|   |_| |_|    \___\__,_|_|_|    ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


;; @TODO - @dupuchba : remove this as it's only god is to break on
;; un-supported fields when developping the sdks. Already exist in
;; awsgen
(defmacro ^:private strict-strs
  "Allows to specify a string-keyed map in a strict manner (any unknown key
   triggers a validation error).
   This brittle behavior is on purpose: strict-strs is meant to be used to
   validate the API json files and we want to know when something new appears
   in a json file."
  [& {:keys [req opt]}]
  `(spec/and
    (spec/every
     (spec/or 
      ~@(mapcat (fn [[field spec]]
                  [(keyword field)
                   `(spec/tuple #{~field} ~spec)]) (concat req opt)))
     :kind map?)
    (fn [m#]
      (every? #(contains? m# %) [~@(keys req)]))))


(spec/def :http.request.field/field (strict-strs :req {:http.request.field/shape-name    string?
                                                       :http.request.field/value         any?}
                                                 :opt {:http.request.field/streaming boolean?
                                                       :http.request.field/location-name string?}))

(spec/def :http.request.configuration/values (spec/coll-of :http.request.field/field :kind vector?))
  
(spec/def :http.request.configuration/uri :http.request.configuration/values)
(spec/def :http.request.configuration/header :http.request.configuration/values)
(spec/def :http.request.configuration/querystring :http.request.configuration/values)
(spec/def :http.request.configuration/body :http.request.configuration/values)

  
(spec/def :http.request.configuration/generate-request-function-part
  (spec/keys :opt [:http.request.configuration/uri
                   :http.request.configuration/header
                   :http.request.configuration/querystring
                   :http.request.configuration/body]))


(spec/def :http.request.configuration/method #{:get :put :patch})
(spec/def :http.request.configuration/version string?)
(spec/def :http.request.configuration/action string?)
(spec/def :http.request.configuration/request-uri string?)
(spec/def :http.request.configuration/endpoints map?)
(spec/def :http.request.configuration/mime-type (spec/map-of #(= "content-type" %) string?))
(spec/def :http.request.configuration/protocol #{"rest-xml" "ec2"})
(spec/def :http.request.configuration/service-id string?)
;; @TODO - @dupuchba : might be more precise
(spec/def :http.request.configuration/response-code (spec/nilable int?))
(spec/def :http.request.spec/input-spec (spec/nilable keyword?))
(spec/def :http.request.spec/output-spec (spec/nilable keyword?))
;; @TODO - @dupuchba : specifie something usefull as spec for this
;; one
(spec/def :http.request.spec/error-spec (spec/nilable any?))

(spec/def :http.request.configuration/generate-operation-function-part
  (spec/keys :req [:http.request.configuration/method
                   :http.request.configuration/endpoints
                   :http.request.configuration/request-uri
                   :http.request.configuration/mime-type
                   :http.request.configuration/response-code
                   :http.request.configuration/protocol
                   :http.request.configuration/action
                   :http.request.configuration/version
                   :http.request.configuration/service-id
                   :http.request.spec/input-spec
                   :http.request.spec/output-spec
                   :http.request.spec/error-spec]))

  
(spec/def :http.request.configuration/configuration
  (spec/merge :http.request.configuration/generate-request-function-part
              :http.request.configuration/generate-operation-function-part))


(defn -call-http
  "The HTTP Call function.
  Takes a map of inputs / configuration and compute a ring-request to
  make the HTTP call."
  [{:keys [:http.request.configuration/endpoints
           :http.request.configuration/method
           :http.request.configuration/request-uri
           :http.request.configuration/mime-type] :as req}]
  (sc.api/spy 1)
  #_(spec/check-asserts true)
  #_(binding [spec/*compile-asserts* true]
    (spec/assert :http.request.configuration/configuration req))
  (let [{:keys [endpoint credential-scope signature-version]} (endpoints (region))]
    (->
     (into req
           {:ring.request {:method             method
                           ::credential-scope  credential-scope
                           ::signature-version signature-version
                           :url                (str endpoint request-uri)
                           :headers            mime-type}})
     params-to-uri
     params-to-body
     ;; @NOTE - @dupucba : must be placed before params-to-header and
     ;; after params-to-body as it rely on both to compute content-md5
     ;; value
     params-to-content-md5-header
     params-to-header
     params-to-headers
     :ring.request
     (*http-client* (fn [resp]
                      [:result resp])))))


