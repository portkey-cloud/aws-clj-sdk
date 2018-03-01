(ns portkey.aws
  (:refer-clojure :exclude [cond])
  (:require [clojure.string :as str]
    [clojure.java.io :as io]
    [clj-http.client :as http]
    [cheshire.core :as json]
    [clojure.spec.alpha :as spec]
    [clojure.core.async :as async]
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
  (when-some [[a s]
              (cond
               ^:some [id (System/getenv "AWS_ACCESS_KEY_ID")]
               [id (System/getenv "AWS_SECRET_ACCESS_KEY")]

               ^:some [id (System/getProperty "aws.accessKeyId")]
               [id (System/getProperty "aws.secretKey")]

               :let [file (or (some-> (System/getenv "AWS_CREDENTIAL_PROFILES_FILE") java.io.File.)
                            (java.io.File. (System/getProperty "user.home") ".aws/credentials"))
                     profile (or (System/getenv "AWS_PROFILE") (System/getProperty "aws.profile") "default")
                     {:strs [aws_access_key_id aws_secret_access_key]}
                     (parse-profile file profile)]
               (some? aws_access_key_id)
               [aws_access_key_id aws_secret_access_key]

               #_(TODO
                   curl "169.254.170.2$AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"
                   {
                    "AccessKeyId" "ACCESS_KEY_ID",
                    "Expiration" "EXPIRATION_DATE",
                    "RoleArn" "TASK_ROLE_ARN",
                    "SecretAccessKey" "SECRET_ACCESS_KEY",
                    "Token" "SECURITY_TOKEN_STRING"
                    }))]
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

(defn- params-to-header [{:as req :keys [body headers]} param-to-headers]
  (-> req
    (assoc :headers (reduce-kv (fn [headers param [header jsonvalue]]
                                 (if-some [v (get body param)]
                                   (assoc headers header
                                     (cond-> v
                                       jsonvalue (-> json/generate-string base64-encode)))
                                   headers))
                      headers param-to-headers))
           (assoc :body (reduce dissoc body (keys param-to-headers)))))

(defn- params-to-uri [{:as req :keys [body url]} uri-to-param]
  (-> req
    (assoc :url (str/replace url #"\{([^\}]*)}" (fn [[_ name]]
                                                  (if-some [v (get body (uri-to-param name))]
                                                    (http/url-encode-illegal-characters v)
                                                    (throw (ex-info (str "Missing parameter " name)
                                                                    {:url url :url-to-param uri-to-param :input body}))))))
    (assoc :body (reduce dissoc body (vals uri-to-param)))))

(defn- params-to-querystring [{:as req :keys [body ^String url]} querystring-to-param]
  (-> req
    (assoc :url
      (apply str url (if (neg? (.indexOf url "?")) "?" "&")
        (interpose "&"
          (keep (fn [[qs name]]
                 (when-some [v (get body name)]
                   (str (http/url-encode-illegal-characters qs) "=" (http/url-encode-illegal-characters v))))
           querystring-to-param))))
    (assoc :body (reduce dissoc body (vals querystring-to-param)))))

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
      {:method method
       ::credential-scope credential-scope
       ::signature-version signature-version
       :url (str endpoint uri)
       :headers {"content-type" "application/x-amz-json-1.0"}
       :as :json-string-keys
       :body (some-> input-spec (conform-or-throw input))}
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
       (spec/conformer (keep-keys ~to-string) (keep-keys ~to-keys)))))

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


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; QUERY PROTOCOL - WIP
;; 1) Focus on one endpoint => SimpleDB as a starting one
;; 2) Take one method and try to sign it => CreateDomain action
;; 3) Generate operations based on query protocol rules
;; 4) Generalize to all query protocol


;; SimpleDB operations
(def sdb-operations
  {"ListDomains"           {"name"   "ListDomains",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "ListDomainsRequest"},
                            "output" {"shape" "ListDomainsResult", "resultWrapper" "ListDomainsResult"},
                            "errors" [{"shape"     "InvalidParameterValue",
                                       "error"     {"code" "InvalidParameterValue", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "InvalidNextToken",
                                       "error"     {"code" "InvalidNextToken", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}]},
   "GetAttributes"         {"name"   "GetAttributes",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "GetAttributesRequest"},
                            "output" {"shape" "GetAttributesResult", "resultWrapper" "GetAttributesResult"},
                            "errors" [{"shape"     "InvalidParameterValue",
                                       "error"     {"code" "InvalidParameterValue", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "MissingParameter",
                                       "error"     {"code" "MissingParameter", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NoSuchDomain",
                                       "error"     {"code" "NoSuchDomain", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}]},
   "BatchDeleteAttributes" {"name"  "BatchDeleteAttributes",
                            "http"  {"method" "POST", "requestUri" "/"},
                            "input" {"shape" "BatchDeleteAttributesRequest"}},
   "DomainMetadata"        {"name"   "DomainMetadata",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "DomainMetadataRequest"},
                            "output" {"shape" "DomainMetadataResult", "resultWrapper" "DomainMetadataResult"},
                            "errors" [{"shape"     "MissingParameter",
                                       "error"     {"code" "MissingParameter", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NoSuchDomain",
                                       "error"     {"code" "NoSuchDomain", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}]},
   "DeleteAttributes"      {"name"   "DeleteAttributes",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "DeleteAttributesRequest"},
                            "errors" [{"shape"     "InvalidParameterValue",
                                       "error"     {"code" "InvalidParameterValue", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "MissingParameter",
                                       "error"     {"code" "MissingParameter", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NoSuchDomain",
                                       "error"     {"code" "NoSuchDomain", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "AttributeDoesNotExist",
                                       "error"     {"code" "AttributeDoesNotExist", "httpStatusCode" 404, "senderFault" true},
                                       "exception" true}]},
   "PutAttributes"         {"name"   "PutAttributes",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "PutAttributesRequest"},
                            "errors" [{"shape"     "InvalidParameterValue",
                                       "error"     {"code" "InvalidParameterValue", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "MissingParameter",
                                       "error"     {"code" "MissingParameter", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NoSuchDomain",
                                       "error"     {"code" "NoSuchDomain", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NumberDomainAttributesExceeded",
                                       "error"     {"code" "NumberDomainAttributesExceeded", "httpStatusCode" 409, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NumberDomainBytesExceeded",
                                       "error"     {"code" "NumberDomainBytesExceeded", "httpStatusCode" 409, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NumberItemAttributesExceeded",
                                       "error"     {"code" "NumberItemAttributesExceeded", "httpStatusCode" 409, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "AttributeDoesNotExist",
                                       "error"     {"code" "AttributeDoesNotExist", "httpStatusCode" 404, "senderFault" true},
                                       "exception" true}]},
   "CreateDomain"          {"name"   "CreateDomain",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "CreateDomainRequest"},
                            "errors" [{"shape"     "InvalidParameterValue",
                                       "error"     {"code" "InvalidParameterValue", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "MissingParameter",
                                       "error"     {"code" "MissingParameter", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NumberDomainsExceeded",
                                       "error"     {"code" "NumberDomainsExceeded", "httpStatusCode" 409, "senderFault" true},
                                       "exception" true}]},
   "BatchPutAttributes"    {"name"   "BatchPutAttributes",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "BatchPutAttributesRequest"},
                            "errors" [{"shape"     "DuplicateItemName",
                                       "error"     {"code" "DuplicateItemName", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "InvalidParameterValue",
                                       "error"     {"code" "InvalidParameterValue", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "MissingParameter",
                                       "error"     {"code" "MissingParameter", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NoSuchDomain",
                                       "error"     {"code" "NoSuchDomain", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NumberItemAttributesExceeded",
                                       "error"     {"code"           "NumberItemAttributesExceeded",
                                                    "httpStatusCode" 409,
                                                    "senderFault"    true},
                                       "exception" true}
                                      {"shape"     "NumberDomainAttributesExceeded",
                                       "error"     {"code"           "NumberDomainAttributesExceeded",
                                                    "httpStatusCode" 409,
                                                    "senderFault"    true},
                                       "exception" true}
                                      {"shape"     "NumberDomainBytesExceeded",
                                       "error"     {"code" "NumberDomainBytesExceeded", "httpStatusCode" 409, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NumberSubmittedItemsExceeded",
                                       "error"     {"code"           "NumberSubmittedItemsExceeded",
                                                    "httpStatusCode" 409,
                                                    "senderFault"    true},
                                       "exception" true}
                                      {"shape"     "NumberSubmittedAttributesExceeded",
                                       "error"     {"code"           "NumberSubmittedAttributesExceeded",
                                                    "httpStatusCode" 409,
                                                    "senderFault"    true},
                                       "exception" true}]},
   "DeleteDomain"          {"name"   "DeleteDomain",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "DeleteDomainRequest"},
                            "errors" [{"shape"     "MissingParameter",
                                       "error"     {"code" "MissingParameter", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}]},
   "Select"                {"name"   "Select",
                            "http"   {"method" "POST", "requestUri" "/"},
                            "input"  {"shape" "SelectRequest"},
                            "output" {"shape" "SelectResult", "resultWrapper" "SelectResult"},
                            "errors" [{"shape"     "InvalidParameterValue",
                                       "error"     {"code" "InvalidParameterValue", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "InvalidNextToken",
                                       "error"     {"code" "InvalidNextToken", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "InvalidNumberPredicates",
                                       "error"     {"code" "InvalidNumberPredicates", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "InvalidNumberValueTests",
                                       "error"     {"code" "InvalidNumberValueTests", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "InvalidQueryExpression",
                                       "error"     {"code" "InvalidQueryExpression", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "MissingParameter",
                                       "error"     {"code" "MissingParameter", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "NoSuchDomain",
                                       "error"     {"code" "NoSuchDomain", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "RequestTimeout",
                                       "error"     {"code" "RequestTimeout", "httpStatusCode" 408, "senderFault" true},
                                       "exception" true}
                                      {"shape"     "TooManyRequestedAttributes",
                                       "error"     {"code" "TooManyRequestedAttributes", "httpStatusCode" 400, "senderFault" true},
                                       "exception" true}]}})

;; SimpleDB Shapes
(def sdb-shapes
  {"InvalidQueryExpression"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "InvalidQueryExpression",
                           "httpStatusCode" 400,
                           "senderFault"    true},
              "exception" true},
   "DeleteAttributesRequest"
             {"type"     "structure",
              "required" ["DomainName" "ItemName"],
              "members"
                         {"DomainName" {"shape" "String"},
                          "ItemName"   {"shape" "String"},
                          "Attributes" {"shape" "AttributeList"},
                          "Expected"   {"shape" "UpdateCondition"}}},
   "AttributeList"
             {"type"      "list",
              "member"    {"shape" "Attribute", "locationName" "Attribute"},
              "flattened" true},
   "DuplicateItemName"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "DuplicateItemName",
                           "httpStatusCode" 400,
                           "senderFault"    true},
              "exception" true},
   "InvalidNumberPredicates"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "InvalidNumberPredicates",
                           "httpStatusCode" 400,
                           "senderFault"    true},
              "exception" true},
   "DeletableItemList"
             {"type"      "list",
              "member"    {"shape" "DeletableItem", "locationName" "Item"},
              "flattened" true},
   "DeletableItem"
             {"type"     "structure",
              "required" ["Name"],
              "members"
                         {"Name"       {"shape" "String", "locationName" "ItemName"},
                          "Attributes" {"shape" "AttributeList"}}},
   "NumberSubmittedAttributesExceeded"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "NumberSubmittedAttributesExceeded",
                           "httpStatusCode" 409,
                           "senderFault"    true},
              "exception" true},
   "SelectResult"
             {"type" "structure",
              "members"
                     {"Items" {"shape" "ItemList"}, "NextToken" {"shape" "String"}}},
   "ReplaceableItem"
             {"type"     "structure",
              "required" ["Name" "Attributes"],
              "members"
                         {"Name"       {"shape" "String", "locationName" "ItemName"},
                          "Attributes" {"shape" "ReplaceableAttributeList"}}},
   "DomainMetadataRequest"
             {"type"     "structure",
              "required" ["DomainName"],
              "members"  {"DomainName" {"shape" "String"}}},
   "InvalidParameterValue"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "InvalidParameterValue",
                           "httpStatusCode" 400,
                           "senderFault"    true},
              "exception" true},
   "BatchPutAttributesRequest"
             {"type"     "structure",
              "required" ["DomainName" "Items"],
              "members"
                         {"DomainName" {"shape" "String"},
                          "Items"      {"shape" "ReplaceableItemList"}}},
   "PutAttributesRequest"
             {"type"     "structure",
              "required" ["DomainName" "ItemName" "Attributes"],
              "members"
                         {"DomainName" {"shape" "String"},
                          "ItemName"   {"shape" "String"},
                          "Attributes" {"shape" "ReplaceableAttributeList"},
                          "Expected"   {"shape" "UpdateCondition"}}},
   "CreateDomainRequest"
             {"type"     "structure",
              "required" ["DomainName"],
              "members"  {"DomainName" {"shape" "String"}}},
   "NumberDomainBytesExceeded"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "NumberDomainBytesExceeded",
                           "httpStatusCode" 409,
                           "senderFault"    true},
              "exception" true},
   "NumberDomainAttributesExceeded"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "NumberDomainAttributesExceeded",
                           "httpStatusCode" 409,
                           "senderFault"    true},
              "exception" true},
   "ItemList"
             {"type"      "list",
              "member"    {"shape" "Item", "locationName" "Item"},
              "flattened" true},
   "BatchDeleteAttributesRequest"
             {"type"     "structure",
              "required" ["DomainName" "Items"],
              "members"
                         {"DomainName" {"shape" "String"},
                          "Items"      {"shape" "DeletableItemList"}}},
   "Attribute"
             {"type"     "structure",
              "required" ["Name" "Value"],
              "members"
                         {"Name"                   {"shape" "String"},
                          "AlternateNameEncoding"  {"shape" "String"},
                          "Value"                  {"shape" "String"},
                          "AlternateValueEncoding" {"shape" "String"}}},
   "ReplaceableAttributeList"
             {"type"      "list",
              "member"
                          {"shape" "ReplaceableAttribute", "locationName" "Attribute"},
              "flattened" true},
   "DomainNameList"
             {"type"      "list",
              "member"    {"shape" "String", "locationName" "DomainName"},
              "flattened" true},
   "UpdateCondition"
             {"type" "structure",
              "members"
                     {"Name"   {"shape" "String"},
                      "Value"  {"shape" "String"},
                      "Exists" {"shape" "Boolean"}}},
   "DeleteDomainRequest"
             {"type"     "structure",
              "required" ["DomainName"],
              "members"  {"DomainName" {"shape" "String"}}},
   "NoSuchDomain"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code" "NoSuchDomain", "httpStatusCode" 400, "senderFault" true},
              "exception" true},
   "ListDomainsRequest"
             {"type" "structure",
              "members"
                     {"MaxNumberOfDomains" {"shape" "Integer"},
                      "NextToken"          {"shape" "String"}}},
   "NumberDomainsExceeded"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "NumberDomainsExceeded",
                           "httpStatusCode" 409,
                           "senderFault"    true},
              "exception" true},
   "ListDomainsResult"
             {"type" "structure",
              "members"
                     {"DomainNames" {"shape" "DomainNameList"},
                      "NextToken"   {"shape" "String"}}},
   "AttributeNameList"
             {"type"      "list",
              "member"    {"shape" "String", "locationName" "AttributeName"},
              "flattened" true},
   "Integer" {"type" "integer"},
   "String"  {"type" "string"},
   "ReplaceableAttribute"
             {"type"     "structure",
              "required" ["Name" "Value"],
              "members"
                         {"Name"    {"shape" "String"},
                          "Value"   {"shape" "String"},
                          "Replace" {"shape" "Boolean"}}},
   "GetAttributesRequest"
             {"type"     "structure",
              "required" ["DomainName" "ItemName"],
              "members"
                         {"DomainName"     {"shape" "String"},
                          "ItemName"       {"shape" "String"},
                          "AttributeNames" {"shape" "AttributeNameList"},
                          "ConsistentRead" {"shape" "Boolean"}}},
   "Long"    {"type" "long"},
   "ReplaceableItemList"
             {"type"      "list",
              "member"    {"shape" "ReplaceableItem", "locationName" "Item"},
              "flattened" true},
   "SelectRequest"
             {"type"     "structure",
              "required" ["SelectExpression"],
              "members"
                         {"SelectExpression" {"shape" "String"},
                          "NextToken"        {"shape" "String"},
                          "ConsistentRead"   {"shape" "Boolean"}}},
   "AttributeDoesNotExist"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "AttributeDoesNotExist",
                           "httpStatusCode" 404,
                           "senderFault"    true},
              "exception" true},
   "NumberSubmittedItemsExceeded"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "NumberSubmittedItemsExceeded",
                           "httpStatusCode" 409,
                           "senderFault"    true},
              "exception" true},
   "InvalidNumberValueTests"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "InvalidNumberValueTests",
                           "httpStatusCode" 400,
                           "senderFault"    true},
              "exception" true},
   "NumberItemAttributesExceeded"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "NumberItemAttributesExceeded",
                           "httpStatusCode" 409,
                           "senderFault"    true},
              "exception" true},
   "DomainMetadataResult"
             {"type" "structure",
              "members"
                     {"ItemCount"                {"shape" "Integer"},
                      "ItemNamesSizeBytes"       {"shape" "Long"},
                      "AttributeNameCount"       {"shape" "Integer"},
                      "AttributeNamesSizeBytes"  {"shape" "Long"},
                      "AttributeValueCount"      {"shape" "Integer"},
                      "AttributeValuesSizeBytes" {"shape" "Long"},
                      "Timestamp"                {"shape" "Integer"}}},
   "GetAttributesResult"
             {"type"    "structure",
              "members" {"Attributes" {"shape" "AttributeList"}}},
   "TooManyRequestedAttributes"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "TooManyRequestedAttributes",
                           "httpStatusCode" 400,
                           "senderFault"    true},
              "exception" true},
   "RequestTimeout"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code" "RequestTimeout", "httpStatusCode" 408, "senderFault" true},
              "exception" true},
   "Item"
             {"type"     "structure",
              "required" ["Name" "Attributes"],
              "members"
                         {"Name"                  {"shape" "String"},
                          "AlternateNameEncoding" {"shape" "String"},
                          "Attributes"            {"shape" "AttributeList"}}},
   "Float"   {"type" "float"},
   "MissingParameter"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "MissingParameter",
                           "httpStatusCode" 400,
                           "senderFault"    true},
              "exception" true},
   "InvalidNextToken"
             {"type"      "structure",
              "members"   {"BoxUsage" {"shape" "Float"}},
              "error"
                          {"code"           "InvalidNextToken",
                           "httpStatusCode" 400,
                           "senderFault"    true},
              "exception" true},
   "Boolean" {"type" "boolean"}})

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Query Protocol requirements
{"query_params" {:req         {"Action"           "NOT DONE"
                               "DomainName"       "NOT DONE"
                               "AWSAccessKeyId"   "AWS Access KEY"
                               "Signature"        "HMAC-SHA256 signature with secret key"
                               "SignatureVersion" "NOT DONE"
                               "Timestamp"        "timestamp of the request"
                               "Version"          "NOT DONE"}
                 :opt         {"Attribute.X.Replace" "NOT DONE"
                               "MaxNumberOfDomains"  "NOT DONE"
                               "MaxNumberOfItems"    "NOT DONE"
                               "NextToken"           "NOT DONE"
                               "SelectExpression"    "NOT DONE"}
                 :conditional {"Attribute.X.Name"  "NOT DONE"
                               "Attribute.X.Value" "NOT DONE"
                               "AttributeName"     "NOT DONE"
                               "ItemName"          "NOT DONE"
                               "SignatureMethod"   "NOT DONE"}}}

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Signing a request v2 :

;; utils
(def x-amz-date-formatter
  (java.time.format.DateTimeFormatter/ofPattern "yyyy-MM-dd'T'HH:mm:ss'Z'"))

(defn hmac-sha-256
  [^bytes secret ^String s]
  (-> (javax.crypto.Mac/getInstance "HmacSHA256")
      (doto (.init (javax.crypto.spec.SecretKeySpec. secret "HmacSHA256")))
      (.doFinal (.getBytes s "UTF8"))))

;; step 1
(defn create-canonicalized-query-string-v2
  "Create a canonicalized query-string for building the signature."
  [& {:keys [query-params]}]
  (x/str
    (comp
      (x/sort)
      (x/for [[k v] %]
             (str (codec/url-encode k) "=" (codec/url-encode v)))
      (interpose "&"))
    query-params))

;; step 2
(defn create-string-to-sign-v2 [verb host uri qs]
  (->> [verb "\n" host "\n" uri "\n" qs]
       (apply str)))

;; step 3
(defn create-base-64-hmac-signature [secret-key string-to-sign]
  (-> secret-key
      (.getBytes "UTF8")
      (hmac-sha-256 string-to-sign)
      base64-encode))

(comment

  ;; this is where I am testing my request
  ;; And it' not WORKING !!!
  (let [host "sdb.amazonaws.com"
        access-key "YOUR-ACCESS-KEY"
        secret-key "YOUR-SECRET-KEY"
        domain-name "Name1"
        qp {"Action"           "CreateDomain"
            "AWSAccessKeyId"   access-key
            "DomainName"       domain-name
            "SignatureVersion" "2"
            "SignatureMethod"  "HmacSHA256"
            "Timestamp"        (.format (java.time.LocalDateTime/now (java.time.ZoneId/of "Z")) x-amz-date-formatter)
            "Version"          "2009-04-15"}]
    (->> qp
         (create-canonicalized-query-string-v2 :query-params)
         (create-string-to-sign-v2 "POST" host "/")
         (create-base-64-hmac-signature secret-key)
         codec/url-encode
         (assoc qp "Signature")
         (assoc {:debug true :debug-body true :content-type "application/x-www-form-urlencoded"} :form-params)
         (http/post (str "https://" host))))

  )








