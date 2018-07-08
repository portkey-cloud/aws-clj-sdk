(ns portkey.aws
  (:refer-clojure :exclude [cond])
  (:require [clojure.string :as str]
    [clojure.java.io :as io]
    [clj-http.client :as http]
    [cheshire.core :as json]
    [clojure.spec.alpha :as spec]
    [clojure.core.async :as async]
    [ring.util.codec :as codec]
    [net.cgrand.xforms :as x]
    [portkey.awssig :as sig]))

(def ^:dynamic *region* nil)
(def ^:dynamic *credentials*
  "A map with keys :access-key, :secret-key and optionally :token"
  nil)

(defmacro cond
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
  (when-some [[a s t]
              (cond
               ^:some [id (System/getenv "AWS_ACCESS_KEY_ID")]
               [id (System/getenv "AWS_SECRET_ACCESS_KEY") (System/getenv "AWS_SECURITY_TOKEN")]

               ^:some [id (System/getProperty "aws.accessKeyId")]
               [id (System/getProperty "aws.secretKey")]

               :let [file (or (some-> (System/getenv "AWS_CREDENTIAL_PROFILES_FILE") java.io.File.)
                            (java.io.File. (System/getProperty "user.home") ".aws/credentials"))
                     profile (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")
                     {:strs [aws_access_key_id aws_secret_access_key aws_session_token]}
                     (parse-profile file profile)]
               (some? aws_access_key_id)
               [aws_access_key_id aws_secret_access_key aws_session_token]
    
               #_(TODO
                   curl "169.254.170.2$AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"
                   {
                    "AccessKeyId" "ACCESS_KEY_ID",
                    "Expiration" "EXPIRATION_DATE",
                    "RoleArn" "TASK_ROLE_ARN",
                    "SecretAccessKey" "SECRET_ACCESS_KEY",
                    "Token" "SECURITY_TOKEN_STRING"
                    }))]
    (cond-> {:access-key a :secret-key s}
      t (assoc :token t))))

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

; Java 8
(defn base64-encode [bytes] (.encodeToString (java.util.Base64/getEncoder) bytes))
(defn base64-decode [^String s] (.decode (java.util.Base64/getDecoder) s))

(defn- params-to-header [{:as req :keys [body header headers]} param-to-headers]
  (-> req
      (assoc :headers (reduce-kv (fn [headers param [h jsonvalue]]
                                   (if-some [v (get header param)]
                                     (assoc headers h
                                            (cond-> v
                                              jsonvalue (-> json/generate-string base64-encode)))
                                     headers))
                                 headers param-to-headers))
      (dissoc :header)))

(defn- flatten-form-input
  "Given a form input composed of possibly nested map, flatten the input and concatenate
  keys when there is nested maps.

  For example, (flatten-form-input {a b c {d e} e {t {f p}}}) returns
  {a b c.d e e.t.f p}"
  [form-input]
  (let [flattened-input (tree-seq map?
                                  #(for [[k v] %]
                                     (if (map? v)
                                       (into {} (map (fn [[k1 v1]] [(str k "." k1) v1])) v)
                                       v))
                                  form-input)]
    (into {} (comp (filter map?)
                   (x/for [entry %
                           :let [k v] entry
                           :when (not (map? v))]
                     [k v]))
          flattened-input)))

(defn- params-to-uri [{:as req :keys [body url uri]} uri-to-param]
  (-> req
      (assoc :url (str/replace url #"\{([^\}]*)}" (fn [[_ name]]

                                                    (if-some [v (get uri (uri-to-param name))]
                                                      (codec/url-encode v)
                                                      (throw (ex-info (str "Missing parameter " name)
                                                                      {:url url :url-to-param uri-to-param :input body}))))))
      (dissoc :uri)))

(defn- params-to-querystring [{:as req :keys [body querystring ^String url]} querystring-to-param]
  (cond-> req
    (not-empty querystring-to-param) (assoc :url
                                            (apply str url (if (neg? (.indexOf url "?")) "?" "&")
                                                   (interpose "&"
                                                              (keep (fn [[qs name]]
                                                                      (when-some [v (get querystring name)]
                                                                        (str (http/url-encode-illegal-characters qs) "=" (http/url-encode-illegal-characters v))))
                                                                    querystring-to-param))))
    true (dissoc :querystring)))

(defn- params-to-payload [{:as req :keys [body]} param]
  (if param
    (assoc req :body (base64-decode (get body param))) ; proof that conforming & transformation must be decoupled
    req))

(defn- move-params [{:as req :keys [body url]} moves]
  (assoc req :body 
    (into (reduce dissoc body (vals moves))
      (keep (fn [[to from]] (when-some [v (get body from)] [to v])) moves))))

(defn conform-or-throw [spec x]
  (let [x' (spec/conform spec x)]
    (if (spec/invalid? x')
      (throw (ex-info (spec/explain-str spec x) {:spec spec :x x}))
      x')))

#_(extend-protocol buddy.core.hash/IDigest
   org.apache.http.entity.ByteArrayEntity
   (-digest [input engine]
     (buddy.core.hash/-digest (.getContent input) engine)))

(defn- unhal
  "Remove hypermedia affordances from a HAL payload."
  [x]
  (cond
    (map? x)
    (let [embeddeds (get x "_embedded")
          x (dissoc x "_links" "_embedded")]
      (x/into x (x/by-key (map unhal)) embeddeds))
    (vector? x)
    (into [] (map unhal) x)
    :else x))

(defn- coerce-body [content-type body]
  (case content-type
    "application/hal+json" (unhal body)
    body))

(defn -rest-json-call [endpoints method uri input input-spec
                       {headers-params :headers uri-params :uri querystring-params :querystring payload :payload move :move}
                       ok-code output-spec error-specs]
  (let [{:keys [endpoint credential-scope signature-version]} (endpoints (region))]
    (->
     (merge {:method method
             ::credential-scope credential-scope
             ::signature-version signature-version
             :url (str endpoint uri)
             :headers {"content-type" "application/x-amz-json-1.0"
                       "x-amz-security-token" (:token (credentials))}
             :as :json-string-keys}
            input)
     (params-to-header headers-params)
     (params-to-uri uri-params)
     (params-to-querystring querystring-params)
     (move-params move)
     (params-to-payload payload)
     (update :body #(cond-> % (coll? %) json/generate-string))
     (*http-client*
      (fn [{:as response {content-type "Content-Type"} :headers}]
        (if (if ok-code (= ok-code (:status response)) (<= 200 (:status response) 299))
          [:result (if output-spec
                     (spec/unform output-spec (coerce-body content-type (:body response)))
                     true)]
          (if-some [[type spec] (find error-specs (get-in response [:headers "x-amzn-ErrorType"]))]
            [:exception (let [m (spec/unform spec (json/parse-string (coerce-body content-type (:body response))))]
                          (ex-info (str type ": " (:message m)) m))]
            (case (:status response)
              404 [:result nil]
              [:exception (ex-info "Unexpected response" {:response response})]))))))))



(defn -query-call [endpoints method uri input input-spec
                   {headers-params :headers uri-params :uri querystring-params :querystring payload :payload move :move}
                   ok-code output-spec error-specs]
  (let [{:keys [endpoint credential-scope signature-version]} (endpoints (region))]
    (->
     (merge {:method method
             ::credential-scope credential-scope
             ::signature-version signature-version
             :url (str endpoint uri)
             :headers {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}}
            input)
     (params-to-header headers-params)
     (params-to-uri uri-params)
     (params-to-querystring querystring-params)
     (move-params move)
     (params-to-payload payload)
     (update :body #(cond-> (flatten-form-input %) (coll? %) codec/form-encode))
     (*http-client*
      (fn [{:as response {content-type "Content-Type"} :headers}]
        (if (if ok-code (= ok-code (:status response)) (<= 200 (:status response) 299))
          [:result response]
          (if-some [[type spec] (find error-specs (get-in response [:headers "x-amzn-ErrorType"]))]
            [:exception (let [m (spec/unform spec (json/parse-string (coerce-body content-type (:body response))))]
                          (ex-info (str type ": " (:message m)) m))]
            (case (:status response)
              404 [:result nil]
              [:exception (ex-info "Unexpected response" {:response response})]))))))))

;; spec utils
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

(defmacro json-keys [& {:keys [req-un opt-un locations]}]
  (let [to-string (into {} (comp (mapcat flatten) (map (fn [k] [(keyword (dashed (name k))) (name k)]))) [req-un opt-un])
        to-keys (-> {} (into (map (fn [[k v]] [v k])) to-string) (into (map (fn [[from to]] [from (keyword (dashed to))]))  locations))]
    `(spec/and
       (spec/keys :req-un ~(dash-keys req-un) :opt-un ~(dash-keys opt-un))
       #_(spec/conformer (keep-keys ~to-string) (keep-keys ~to-keys)))))

(defmacro doc [docstring spec]
  `(doc-impl ~docstring '~spec (delay (spec/spec ~spec))))

(defn doc-impl [docstring form delayed-spec]
  (reify spec/Spec
    (conform* [_ x] (spec/conform* @delayed-spec x))
    (unform* [_ y] (spec/unform* @delayed-spec y))
    (explain* [_ path via in x] (spec/explain* @delayed-spec path via in x))
    (gen* [_ overrides path rmap] (spec/gen* @delayed-spec overrides path rmap))
    (with-gen* [_ gfn] (spec/with-gen* @delayed-spec gfn))
    (describe* [_]
      `(doc ~docstring ~(if (keyword? form) form (spec/describe* @delayed-spec))))))
