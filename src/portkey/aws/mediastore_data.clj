(ns portkey.aws.mediastore-data (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-list-limit)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-string-primitive)

(clojure.core/declare ser-path-naming)

(clojure.core/declare ser-range-pattern)

(clojure.core/declare ser-payload-blob)

(clojure.core/declare ser-storage-class)

(clojure.core/declare ser-list-path-naming)

(clojure.core/defn- ser-list-limit [input] #:http.request.field{:value input, :shape "ListLimit"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value input, :shape "ContentType"})

(clojure.core/defn- ser-string-primitive [input] #:http.request.field{:value input, :shape "StringPrimitive"})

(clojure.core/defn- ser-path-naming [input] #:http.request.field{:value input, :shape "PathNaming"})

(clojure.core/defn- ser-range-pattern [input] #:http.request.field{:value input, :shape "RangePattern"})

(clojure.core/defn- ser-payload-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "PayloadBlob"})

(clojure.core/defn- ser-storage-class [input] #:http.request.field{:value (clojure.core/get {"TEMPORAL" "TEMPORAL", :temporal "TEMPORAL"} input), :shape "StorageClass"})

(clojure.core/defn- ser-list-path-naming [input] #:http.request.field{:value input, :shape "ListPathNaming"})

(clojure.core/defn- req-delete-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-path-naming (input :path)) #:http.request.field{:name "Path", :shape "PathNaming", :location "uri", :location-name "Path"})]}))

(clojure.core/defn- req-list-items-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-path-naming (input :path)) #:http.request.field{:name "Path", :shape "ListPathNaming", :location "querystring", :location-name "Path"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListLimit", :location "querystring", :location-name "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken", :location "querystring", :location-name "NextToken"}))))

(clojure.core/defn- req-put-object-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-payload-blob (input :body)) #:http.request.field{:name "Body", :shape "PayloadBlob"})], :uri [(clojure.core/into (ser-path-naming (input :path)) #:http.request.field{:name "Path", :shape "PathNaming", :location "uri", :location-name "Path"})]} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType", :location "header", :location-name "Content-Type"})) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-primitive (input :cache-control)) #:http.request.field{:name "CacheControl", :shape "StringPrimitive", :location "header", :location-name "Cache-Control"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass", :location "header", :location-name "x-amz-storage-class"}))))

(clojure.core/defn- req-get-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-path-naming (input :path)) #:http.request.field{:name "Path", :shape "PathNaming", :location "uri", :location-name "Path"})]} (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-range-pattern (input :range)) #:http.request.field{:name "Range", :shape "RangePattern", :location "header", :location-name "Range"}))))

(clojure.core/defn- req-describe-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-path-naming (input :path)) #:http.request.field{:name "Path", :shape "PathNaming", :location "uri", :location-name "Path"})]}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.delete-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/delete-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore-data.delete-object-request/path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/list-path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-request/max-results (clojure.spec.alpha/and :portkey.aws.mediastore-data/list-limit))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-request/next-token (clojure.spec.alpha/and :portkey.aws.mediastore-data/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/list-items-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data.list-items-request/path :portkey.aws.mediastore-data.list-items-request/max-results :portkey.aws.mediastore-data.list-items-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/content-range-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^bytes=\d+\-\d+/\d+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.put-object-request/body (clojure.spec.alpha/and :portkey.aws.mediastore-data/payload-blob))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.put-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.put-object-request/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/put-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore-data.put-object-request/body :portkey.aws.mediastore-data.put-object-request/path] :opt-un [:portkey.aws.mediastore-data/content-type :portkey.aws.mediastore-data.put-object-request/cache-control :portkey.aws.mediastore-data/storage-class]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/list-limit (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.container-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/container-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data.container-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/sha-256-hash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 64 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9A-Fa-f]{64}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/pagination-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/item-list (clojure.spec.alpha/coll-of :portkey.aws.mediastore-data/item))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/body (clojure.spec.alpha/and :portkey.aws.mediastore-data/payload-blob))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/content-range (clojure.spec.alpha/and :portkey.aws.mediastore-data/content-range-pattern))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/status-code (clojure.spec.alpha/and :portkey.aws.mediastore-data/status-code))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/get-object-response (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore-data.get-object-response/status-code] :opt-un [:portkey.aws.mediastore-data.get-object-response/body :portkey.aws.mediastore-data.get-object-response/cache-control :portkey.aws.mediastore-data.get-object-response/content-range :portkey.aws.mediastore-data.get-object-response/content-length :portkey.aws.mediastore-data/content-type :portkey.aws.mediastore-data/e-tag :portkey.aws.mediastore-data.get-object-response/last-modified]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[ \w:\.\?-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/e-tag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9A-Fa-f]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/item-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[A-Za-z0-9_\.\-\~]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[\w\-\/\.]{1,255}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/item-type #{"OBJECT" :folder "FOLDER" :object})

(clojure.spec.alpha/def :portkey.aws.mediastore-data/status-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediastore-data.requested-range-not-satisfiable-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/requested-range-not-satisfiable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data.requested-range-not-satisfiable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/non-negative-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediastore-data.put-object-response/content-sha-256 (clojure.spec.alpha/and :portkey.aws.mediastore-data/sha-256-hash))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/put-object-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data.put-object-response/content-sha-256 :portkey.aws.mediastore-data/e-tag :portkey.aws.mediastore-data/storage-class]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/string-primitive (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-response/items (clojure.spec.alpha/and :portkey.aws.mediastore-data/item-list))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-response/next-token (clojure.spec.alpha/and :portkey.aws.mediastore-data/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/list-items-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data.list-items-response/items :portkey.aws.mediastore-data.list-items-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-request/range (clojure.spec.alpha/and :portkey.aws.mediastore-data/range-pattern))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/get-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore-data.get-object-request/path] :opt-un [:portkey.aws.mediastore-data.get-object-request/range]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.describe-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/describe-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore-data.describe-object-request/path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/path-naming (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 900)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(?:[A-Za-z0-9_\.\-\~]+/){0,10}[A-Za-z0-9_\.\-\~]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/range-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^bytes=(?:\d+\-\d*|\d*\-\d+)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/payload-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.mediastore-data.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.mediastore-data/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/storage-class #{"TEMPORAL" :temporal})

(clojure.spec.alpha/def :portkey.aws.mediastore-data.object-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/object-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data.object-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/delete-object-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.item/name (clojure.spec.alpha/and :portkey.aws.mediastore-data/item-name))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.item/type (clojure.spec.alpha/and :portkey.aws.mediastore-data/item-type))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.item/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.item/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data.item/name :portkey.aws.mediastore-data.item/type :portkey.aws.mediastore-data/e-tag :portkey.aws.mediastore-data.item/last-modified :portkey.aws.mediastore-data/content-type :portkey.aws.mediastore-data.item/content-length]))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediastore-data/list-path-naming (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 900)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"/?(?:[A-Za-z0-9_\.\-\~]+/){0,10}(?:[A-Za-z0-9_\.\-\~]+)?/?" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.describe-object-response/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.describe-object-response/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.describe-object-response/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/describe-object-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore-data/e-tag :portkey.aws.mediastore-data/content-type :portkey.aws.mediastore-data.describe-object-response/content-length :portkey.aws.mediastore-data.describe-object-response/cache-control :portkey.aws.mediastore-data.describe-object-response/last-modified]))

(clojure.core/defn delete-object ([delete-object-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-object-request delete-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediastore-data/delete-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{Path+}", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore Data", :http.request.spec/input-spec :portkey.aws.mediastore-data/delete-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteObject", :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data/object-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/delete-object-response))

(clojure.core/defn describe-object ([describe-object-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-object-request describe-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediastore-data/describe-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{Path+}", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore Data", :http.request.spec/input-spec :portkey.aws.mediastore-data/describe-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeObject", :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data/object-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data/describe-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/describe-object-response))

(clojure.core/defn get-object ([get-object-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-object-request get-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediastore-data/get-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{Path+}", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore Data", :http.request.spec/input-spec :portkey.aws.mediastore-data/get-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetObject", :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data/object-not-found-exception, "RequestedRangeNotSatisfiableException" :portkey.aws.mediastore-data/requested-range-not-satisfiable-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error}})))))
(clojure.spec.alpha/fdef get-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data/get-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/get-object-response))

(clojure.core/defn list-items ([] (list-items {})) ([list-items-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-items-request list-items-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediastore-data/list-items-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore Data", :http.request.spec/input-spec :portkey.aws.mediastore-data/list-items-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListItems", :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error}})))))
(clojure.spec.alpha/fdef list-items :args (clojure.spec.alpha/? :portkey.aws.mediastore-data/list-items-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/list-items-response))

(clojure.core/defn put-object ([put-object-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-object-request put-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediastore-data/put-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{Path+}", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore Data", :http.request.spec/input-spec :portkey.aws.mediastore-data/put-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutObject", :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error}})))))
(clojure.spec.alpha/fdef put-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data/put-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/put-object-response))
