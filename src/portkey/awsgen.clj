(ns portkey.awsgen
  (:require [clojure.spec.alpha :as spec]
    [cheshire.core :as json]
    [clojure.java.io :as io]
    [net.cgrand.xforms :as x]
    [clojure.string :as str]
    [portkey.aws :as aws]
    [clj-http.client :as http]
    [clojure.string :as str]
    [clojure.pprint]))

#_ (def all-apis 
     (->> (java.io.File. "resources/aws-sdk-core/apis/")
       file-seq
       (filter #(= "api-2.json" (.getName ^java.io.File %)))
       (map #(with-open [i (io/reader %)] (json/parse-stream i)))))

(defn keep-keys [f]
  #(into {} (keep (fn [[k v]] (when-some [k (f k)] [k v]))) %))

(defn dashed [^String s]
  (-> s (.replaceAll "(?<=[a-z0-9])(?=[A-Z]([a-z]|$))|_" "-") .toLowerCase))

(defn- dash-keys [e]
  (cond
    (vector? e)
    (into [] (map dash-keys) e)
    (sequential? e)
    (map dash-keys e)
    (keyword? e)
    (keyword (namespace e) (dashed (name e)))
    :else e))

(defmacro json-keys [& {:keys [req-un opt-un]}]
  (let [to-string (into {} (comp (mapcat flatten) (map (fn [k] [(keyword (dashed (name k))) (name k)]))) [req-un opt-un])
        to-keys (into {} (map (fn [[k v]] [v k])) to-string)]
    `(spec/and
       (spec/keys :req-un ~(dash-keys req-un) :opt-un ~(dash-keys opt-un))
       (spec/conformer (keep-keys ~to-string) (keep-keys ~to-keys)))))

(defmulti ^:private shape-to-spec (fn [ns [name {:strs [type]}]] type))

(defn- gen-shape-spec [ns [name shape :as e]]
  (let [form (shape-to-spec ns e)]
    (if (and (seq? form) (= 'do (first form)))
      `(~@(butlast form) ; includes do
         (spec/def ~(keyword ns (dashed name)) ~(last form)))
      `(spec/def ~(keyword ns (dashed name)) ~form))))

(defmacro strict-strs [& {:keys [req opt]}]
  `(spec/and
     (spec/every
       (spec/or 
         ~@(mapcat (fn [[field spec]]
                     [(keyword field)
                      `(spec/tuple #{~field} ~spec)]) (concat req opt)))
       :kind map?)
     (fn [m#]
       (every? #(contains? m# %) [~@(keys req)]))))

;; :portkey.awsgen/shape is a strict (it fails to validate when unexpected attributes)
;; retro spec 
(defmulti shape-type-spec #(get % "type"))
(spec/def ::shape (spec/multi-spec shape-type-spec #(assoc %1 "type" %2)))

(defmethod shape-to-spec :default [ns [name _ :as kv]]
  (throw (ex-info (str "unsupported shape " name) {:shape kv})))

(defmethod shape-type-spec "structure" [_]
  (strict-strs
    :req {"type" string?
          "members" (spec/map-of string? 
                      (strict-strs
                        :req {"shape" string?}
                        :opt {"location" #{"uri" "querystring" "header" "headers" "statusCode"}
                              "locationName" string?
                              "queryName" string?
                              "deprecated" boolean?
                              "idempotencyToken" boolean?
                              "xmlNamespace"
                              (strict-strs :req {"uri" string?}) ; TODO validate
                              "xmlAttribute" boolean?
                              "box" boolean?
                              "jsonValue" boolean?
                              "jsonvalue" boolean?
                              "streaming" boolean?
                              "flattened" boolean?}))}
    :opt {"required" (spec/coll-of string?)
          "error" (strict-strs
                    :req {"httpStatusCode" int?}
                    :opt {"code" string? "senderFault" boolean?})
          "exception" boolean?
          "fault" boolean?
          "payload" string?
          "deprecated" boolean?
          "locationName" string?
          "sensitive" boolean?
          "wrapper" boolean?
          "xmlOrder" (spec/coll-of string?)
          "xmlNamespace"
          (strict-strs :req {"uri" string?} ; TODO validate
            :opt {"prefix" string?})}))

(defmethod shape-to-spec "structure" [ns [name {:strs [members required payload deprecated error exception]}]]
  (let [spec-names 
        (into {} (for [[k {:strs [shape] :as v}] members]
                   [k (keyword (if (not= shape k) (str ns "." (dashed name)) ns) k)]))]
    `(do
       ~@(for [[k {:strs [shape] :as v}] members
               :when (not= shape k)]
           `(spec/def ~(keyword (str ns "." (dashed name)) (dashed k)) (spec/and ~(keyword ns (dashed shape))))) ; spec/and is a hack to delay resolution
       (json-keys :req-un ~(into [] (map spec-names) required)
         :opt-un ~(into []  (comp (remove (set required)) (map spec-names))
                    (keys members))))))

(defmethod shape-type-spec "list" [_]
  `(strict-strs
     :req {"type" string?
           "member" (strict-strs :req {"shape" string?}
                      :opt {"locationName" string?})}
     :opt {"max" int?
           "min" int?
           "deprecated" boolean?
           "flattened" boolean?
           "sensitive" boolean?}))

(defmethod shape-to-spec "list" [ns [name {{:strs [shape]} "member" :strs [max]}]]
  `(spec/coll-of ~(keyword ns (dashed shape)) :max-count ~max))

(defmethod shape-type-spec "boolean" [_]
  `(strict-strs :req {"type" string?}
     :opt {"box" boolean?}))

(defmethod shape-to-spec "boolean" [ns [name _]] `boolean?)

(defmethod shape-type-spec "map" [_]
  (strict-strs
    :req {"type" string?
          "key" (strict-strs :req {"shape" string?} :opt {"locationName" string?})
          "value" (strict-strs :req {"shape" string?} :opt {"locationName" string?})}
    :opt {"sensitive" boolean?
          "max" int?
          "min" int?
          "flattened" boolean?
          "locationName" string?}))

(defmethod shape-to-spec "map" [ns [name {:strs [key value sensitive]}]]
  `(spec/map-of ~(keyword ns (dashed (key "shape"))) ~(keyword ns (dashed (value "shape")))))

(defmethod shape-type-spec "string" [_]
  `(strict-strs
     :req {"type" string?}
     :opt {"max" int?
           "min" int?
           "pattern" string?
           "enum" (spec/coll-of string?)
           "sensitive" boolean?}))

(defmethod shape-to-spec "string" [ns [name {:strs [min max sensitive pattern enum]}]] 
  (if enum
    `(spec/conformer
       (let [m# ~(into {} (mapcat (fn [s] [[s s] [(keyword (dashed s)) s]])) enum)]
         (fn [s#] (m# s# ::spec/invalid)))
       (comp keyword dashed))
    `(spec/and string?
       ~@(when min [`(fn [s#] (<= ~min (count s#)))])
       ~@(when max [`(fn [s#] (< (count s#) ~max))])
       ~@(when pattern [`(fn [s#] (re-matches ~(re-pattern pattern) s#))]))))

; Java 8µ
(defn base64-encode [bytes] (.encodeToString (java.util.Base64/getEncoder) bytes))
(defn base64-decode [^String s] (.decode (java.util.Base64/getDecoder) s))

(defmethod shape-type-spec "blob" [_]
  `(strict-strs
     :req {"type" string?}
     :opt {"streaming" boolean?
           "max" int?
           "min" int?
           "sensitive" boolean?}))

(defmethod shape-to-spec "blob" [ns [name {:strs [streaming sensitive]}]]
  `(spec/and bytes? (spec/conformer base64-encode base64-decode)))

(defmethod shape-type-spec "long" [_]
  `(strict-strs
     :req {"type" string?}
     :opt {"max" int?
           "min" int?}))

(defmethod shape-to-spec "long" [ns _] `int?)

(defmethod shape-type-spec "integer" [_]
  `(strict-strs
     :req {"type" string?}
     :opt {"max" int?
           "min" int?
           "box" boolean?
           "deprecated" boolean?}))

(defmethod shape-to-spec "integer" [ns [name {:strs [min max]}]]
  `(spec/and int? ~@(when min [`#(<= ~min %)]) ~@(when max [`#(<= % ~max)])))

(defmethod shape-type-spec "timestamp" [_]
  `(strict-strs :req {"type" string?}
     :opt {"timestampFormat" #{"iso8601"}})) ; TODO pattern

(defmethod shape-to-spec "timestamp" [ns _] `inst?)

(defmethod shape-type-spec "double" [_]
  `(strict-strs :req {"type" string?}
     :opt {"min" number?
           "max" number?
           "box" boolean?}))

(defmethod shape-to-spec "double" [ns _] `double?)

(defmethod shape-type-spec "float" [_]
  `(strict-strs :req {"type" string?}
     :opt {"min" number?
           "max" number?}))

(defmethod shape-to-spec "double" [ns _] `double?)

(spec/def ::operation
  (strict-strs
    :req {"name" string?
          "http" (strict-strs
                   :req {"method" #{"POST" "DELETE" "GET" "PATCH" "PUT" "HEAD"}
                         "requestUri" string?}
                   :opt {"responseCode" int?})}
    :opt {"input" (strict-strs :req {"shape" string?}
                    :opt {"xmlNamespace"
                          (strict-strs :req {"uri" string?})
                          "locationName" string?}) ; TODO validate
          "output" (strict-strs :req {"shape" string?}
                     :opt {"resultWrapper" string?})
          "idempotent" boolean?
          "errors"
          (spec/coll-of
            (strict-strs :req {"shape" string?}
              :opt {"exception" boolean?
                    "fault" true?
                    "error" (strict-strs
                              :req {"httpStatusCode" int?}
                              :opt {"code" string?, "senderFault" boolean?})}))
          "documentationUrl" string? ; TODO
          "alias" string?
          "authtype" #{"none" "v4-unsigned-body"}
          "deprecated" boolean?}))

(defn conform-or-throw [spec x]
  (let [x' (spec/conform spec x)]
    (if (spec/invalid? x')
      (throw (ex-info (spec/explain-str spec x) {:spec spec :x x}))
      x')))

#_(str/replace uri #"\{(.*)}" (fn [[_ name]]))

(defn params-to-header [{:as req :keys [body headers]} param-to-headers]
  (-> req
    (assoc :headers (reduce-kv (fn [headers param [header jsonvalue]]
                                 (if-some [v (get body param)]
                                   (assoc headers header 
                                     (cond-> v
                                       jsonvalue (-> json/generate-string base64-encode)))
                                   headers))
                      headers param-to-headers))
           (assoc :body (reduce dissoc body (keys param-to-headers)))))

(defn params-to-uri [{:as req :keys [body url]} uri-to-param]
  (-> req
    (assoc :url (str/replace url #"\{(.*)}" (fn [[_ name]]
                                              (if-some [v (get body (uri-to-param name))]
                                                (http/url-encode-illegal-characters v)
                                                (throw (ex-info (str "Missing parameter " name)
                                                         {:url url :url-to-param uri-to-param :input body}))))))
    (assoc :body (reduce dissoc body (vals uri-to-param)))))

(defn params-to-querystring [{:as req :keys [body url]} querystring-to-param]
  (-> req
    (assoc :url 
      (apply str url "?"
        (keep (fn [[qs name]]
                (when-some [v (get body name)]
                  (str (http/url-encode-illegal-characters qs) "=" (http/url-encode-illegal-characters v))))
          querystring-to-param)))
    (assoc :body (reduce dissoc body (vals querystring-to-param)))))

(defn params-to-payload [{:as req :keys [body]} param]
  (if param
    (assoc req :body (get body param))
    req))

(defn gen-operation [ns {:as operation
                         :strs [name errors]
                         {input-shape "shape"} "input"
                         {output-shape "shape"} "output"
                         {:strs [method requestUri responseCode]} "http"}
                     shapes]
  (let [error-spec (into {}
                     (map (fn [{:strs [shape] {:strs [httpStatusCode]} "error"}]
                            [shape (keyword ns (dashed shape))]))
                     errors)
        response (gensym 'response)
        input (gensym 'input)]
    (when input-shape
      (conform-or-throw (strict-strs ; validat only what we knows how to map
                         :req {"type" #{"structure"}
                               "members" (spec/map-of string? 
                                           (spec/or
                                             :atomic
                                             (strict-strs
                                              :req {"shape" string?}
                                              :opt {"location" #{"uri" "querystring" "header" #_#_"headers" "statusCode"}
                                                    "locationName" string?
                                                    "deprecated" boolean?})
                                             :json-value
                                             (strict-strs
                                               :req {"shape" string?
                                                   "location" #{"header"}
                                                   "locationName" string?
                                                   "jsonvalue" true?})))}
                         :opt {"required" (spec/coll-of string?)
                               "payload" string?
                               "deprecated" boolean?}) (shapes input-shape)))
    `(do
       (defn ~(symbol (dashed name)) ; TODO add deprecated flag 
         [~input]
         (let [endpoint# (~(symbol ns "endpoints") aws/*region*)]
           (->
             {:method ~method
              ::aws/credential-scope (:credential-scope endpoint#)
              ::aws/signature-version (:signature-version endpoint#)
              :url (str (:endpoint (~'endpoints aws/*region*)) ~requestUri)
              :headers {"content-type" "application/json"}
              :as :json-string-keys
              :body
              ~(when input-shape
                 `(spec/unform ~(keyword ns (dashed input-shape)) ~input))}
             (params-to-header ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                               :when (= "header" (member "location"))]
                                           [name [(member "locationName") (member "jsonvalue")]])))
             (params-to-uri ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                            :when (= "uri" (member "location"))]
                                        [(member "locationName") name])))
             (params-to-querystring ~(into {} (for [[name member] (get-in shapes [input-shape "members"])
                                                    :when (= "querystring" (member "location"))]
                                                [(member "locationName") name])))
             (params-to-payload ~(get-in shapes [input-shape "payload"]))
             (update :body #(some-> % json/generate-string))
             (aws/*http-client* 
               (fn [~response]
                 (let [errors# ~error-spec]
                   (if (= ~responseCode (:status ~response))
                     [:result ~(if output-shape
                                 `(spec/unform ~(keyword ns (dashed output-shape)) (:body ~response))
                                 true)]
                     [:exception
                      (if-some [[type# spec#] (find errors# (get-in ~response [:headers "x-amzn-ErrorType"]))]
                        (let [m# (spec/unform spec# (json/parse-string (:body ~response)))]
                          (ex-info (str type# ": " (:message m#)) m#))
                        (ex-info "Unexpected response" {:response ~response}))])))))))
       (spec/fdef ~(symbol (dashed name))
         ~@(when input-shape
             [:args `(spec/cat
                       :sync (spec/tuple ~(keyword ns (dashed input-shape)))
                       :async (spec/tuple ~(keyword ns (dashed input-shape))
                                (spec/fspec :args (spec/cat :result any? :exception ex-data))))])
         ~@(when output-shape [:ret `(spec/and ~(keyword ns (dashed output-shape)))])))))

(defn gen-api [ns-sym resource-name]
  (let [api (json/parse-stream (-> resource-name io/resource io/reader))]
    (case (get-in api ["metadata" "protocol"])
      "rest-json" (for [[k gen] {"shapes" gen-shape-spec
                                 "operations" (fn [ns [_ op]] (gen-operation ns op (api "shapes")))}
                        desc (api k)]
                    (gen (name ns-sym) desc))
      (do
        (binding [*out* *err*] (prn 'skipping ns-sym 'protocol (get-in api ["metadata" "protocol"])))
        [(list 'comment 'TODO 'support (get-in api ["metadata" "protocol"]))])
      #_"json"
      #_"ec2"
      #_"query"
      #_"rest-xml")))

(defn parse-endpoints! [src]
  (let [endpoints (with-open [r (io/reader src)] (json/parse-stream r))]
    (reduce (fn [m [p v]] (assoc-in m p v)) {}
      (for [{:as partition
             :strs [defaults services regions dnsSuffix]} (endpoints "partitions")
            :let [regions (set (keys regions))]
            [service {defaults' "defaults" :strs [endpoints partitionEndpoint]}] services
            :let [defaults (into defaults defaults')]
            region (into regions (keys endpoints))
            :let [desc (or (endpoints region) (endpoints partitionEndpoint))]
            :when desc
            :let [{:strs [hostname sslCommonName protocols credentialScope signatureVersions]} (into defaults desc)
                  protocol (or (some #{"https"} protocols) (first protocols)) ; prefer https
                  credentialScope (into {"service" service "region" region} credentialScope)
                  sslCommonName (or sslCommonName hostname) 
                  env #(case % "{region}" region "{service}" service "{dnsSuffix}" dnsSuffix)
                  hostname (str/replace hostname #"\{(?:region|service|dnsSuffix)}" env)
                  sslCommonName (str/replace sslCommonName #"\{(?:region|service|dnsSuffix)}" env)
                  endpoint (str protocol "://" hostname)
                  signature-version (some->
                                      (or (some (set signatureVersions) ["v4" "s3v4" "v2" "s3"]) ; most recent first
                                        (first signatureVersions))
                                      keyword)]]
        [[service region] {:credential-scope (x/into {} (x/for [[k v] %] [(keyword k) v]) credentialScope)
                           :ssl-common-name sslCommonName :endpoint endpoint :signature-version signature-version}]))))

(defn generate-files! []
  (let [endpoints (parse-endpoints! "resources/aws-partitions/partitions.json")]
    (->> (java.io.File. "resources/aws-sdk-core/apis/")
      file-seq
      (into []
        (comp
          (filter #(= "api-2.json" (.getName ^java.io.File %)))
          (x/by-key (fn [^java.io.File f] (-> f .getParentFile .getParentFile .getName))
            (comp (x/for [^java.io.File f %]
                    [(-> f .getParentFile .getName) (.getPath f)])
              (x/into (sorted-map))))
          (x/for [[api versions] %
                  :let [apifile (str/replace api #"[-.]" "_")
                        apins (str/replace api #"[.]" "-")
                        [latest f] (first (rseq versions))]
                  [version json] (cons [nil f] versions)
                  :let [_ (prn 'generating api (or version 'LATEST))
                        [_ json] (re-matches #"resources/(.*)" json)
                        [file ns]
                        (if version
                          [(java.io.File. (str "src/portkey/aws/" apifile "/_" version ".clj"))
                           (symbol (str "portkey.aws." apins ".-" version))]
                          [(java.io.File. (str "src/portkey/aws/" apifile ".clj"))
                           (symbol (str "portkey.aws." apins))])]]
            (with-open [w (io/writer (doto file (-> .getParentFile .mkdirs)))]
              (binding [*out* w]
                (prn (list 'ns ns '(:require [portkey.aws])))
                (newline)
                (clojure.pprint/pprint (list 'def 'endpoints (list 'quote (get endpoints apins))))
                (doseq [form (gen-api ns json)]
                  (newline)
                  (if (and (seq? form) (= 'do (first form)))
                    (run! prn (next form))
                    (prn form))))
              file)))))))

#_(client/with-additional-middleware
  [wrap-aws-auth aws-sig4/wrap-aws-date]
  (binding [aws/*http-client*
          (fn [req cont]
            (cont (client/request (assoc req :throw-exceptions false))))]
  (create-function {:function-name "fromrepl"
       :handler "portkey.LambdaStub"
       :code {:zip-file (.getBytes "random bytes")}
       :role "arn:aws:iam::238568392557:role/portkey"
       :runtime "java8"
       :memory-size 1536
       :timeout 30
       :environment {:variables {}}})))