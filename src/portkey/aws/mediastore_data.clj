(ns portkey.aws.mediastore-data (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.mediastore-data.delete-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/delete-object-request (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.delete-object-request/Path] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/list-path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-request/max-results (clojure.spec.alpha/and :portkey.aws.mediastore-data/list-limit))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-request/next-token (clojure.spec.alpha/and :portkey.aws.mediastore-data/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/list-items-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.list-items-request/Path :portkey.aws.mediastore-data.list-items-request/MaxResults :portkey.aws.mediastore-data.list-items-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/content-range-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^bytes=\d+\-\d+/\d+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.put-object-request/body (clojure.spec.alpha/and :portkey.aws.mediastore-data/payload-blob))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.put-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.put-object-request/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/put-object-request (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.put-object-request/Body :portkey.aws.mediastore-data.put-object-request/Path] :opt-un [:portkey.aws.mediastore-data/ContentType :portkey.aws.mediastore-data.put-object-request/CacheControl :portkey.aws.mediastore-data/StorageClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/list-limit (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 1 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 1000))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.container-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/container-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.container-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/sha256-hash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 64 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 64)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[0-9A-Fa-f]{64}" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/pagination-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/item-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mediastore-data/item) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/body (clojure.spec.alpha/and :portkey.aws.mediastore-data/payload-blob))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/content-range (clojure.spec.alpha/and :portkey.aws.mediastore-data/content-range-pattern))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-response/status-code (clojure.spec.alpha/and :portkey.aws.mediastore-data/status-code))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/get-object-response (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.get-object-response/StatusCode] :opt-un [:portkey.aws.mediastore-data.get-object-response/Body :portkey.aws.mediastore-data.get-object-response/CacheControl :portkey.aws.mediastore-data.get-object-response/ContentRange :portkey.aws.mediastore-data.get-object-response/ContentLength :portkey.aws.mediastore-data/ContentType :portkey.aws.mediastore-data/ETag :portkey.aws.mediastore-data.get-object-response/LastModified] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 255)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[ \w:\.\?-]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/etag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 64)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[0-9A-Fa-f]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/item-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[A-Za-z0-9_\.\-\~]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^[\w\-\/\.]{1,255}$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/item-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"OBJECT" "OBJECT", :object "OBJECT", "FOLDER" "FOLDER", :folder "FOLDER"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/status-code (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.requested-range-not-satisfiable-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/requested-range-not-satisfiable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.requested-range-not-satisfiable-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/non-negative-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediastore-data.put-object-response/contentsha256 (clojure.spec.alpha/and :portkey.aws.mediastore-data/sha256-hash))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/put-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.put-object-response/ContentSHA256 :portkey.aws.mediastore-data/ETag :portkey.aws.mediastore-data/StorageClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/string-primitive (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-response/items (clojure.spec.alpha/and :portkey.aws.mediastore-data/item-list))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.list-items-response/next-token (clojure.spec.alpha/and :portkey.aws.mediastore-data/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/list-items-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.list-items-response/Items :portkey.aws.mediastore-data.list-items-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.get-object-request/range (clojure.spec.alpha/and :portkey.aws.mediastore-data/range-pattern))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/get-object-request (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.get-object-request/Path] :opt-un [:portkey.aws.mediastore-data.get-object-request/Range] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.describe-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/describe-object-request (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.describe-object-request/Path] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/path-naming (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 900)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(?:[A-Za-z0-9_\.\-\~]+/){0,10}[A-Za-z0-9_\.\-\~]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/range-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^bytes=(?:\d+\-\d*|\d*\-\d+)$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/payload-blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.mediastore-data/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/internal-server-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.internal-server-error/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/storage-class (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"TEMPORAL" "TEMPORAL", :temporal "TEMPORAL"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.object-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/object-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.object-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/delete-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.item/name (clojure.spec.alpha/and :portkey.aws.mediastore-data/item-name))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.item/type (clojure.spec.alpha/and :portkey.aws.mediastore-data/item-type))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.item/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.item/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.item/Name :portkey.aws.mediastore-data.item/Type :portkey.aws.mediastore-data/ETag :portkey.aws.mediastore-data.item/LastModified :portkey.aws.mediastore-data/ContentType :portkey.aws.mediastore-data.item/ContentLength] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediastore-data/list-path-naming (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 0 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 900)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"/?(?:[A-Za-z0-9_\.\-\~]+/){0,10}(?:[A-Za-z0-9_\.\-\~]+)?/?" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.describe-object-response/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.describe-object-response/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.describe-object-response/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data/describe-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data/ETag :portkey.aws.mediastore-data/ContentType :portkey.aws.mediastore-data.describe-object-response/ContentLength :portkey.aws.mediastore-data.describe-object-response/CacheControl :portkey.aws.mediastore-data.describe-object-response/LastModified] :locations {}))

(clojure.core/defn delete-object ([delete-object-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data/endpoints "DELETE" "/{Path+}" delete-object-request :portkey.aws.mediastore-data/delete-object-request {:payload nil, :move {}, :headers {}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.mediastore-data/delete-object-response {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data/object-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error})))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/delete-object-response))

(clojure.core/defn describe-object ([describe-object-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data/endpoints "HEAD" "/{Path+}" describe-object-request :portkey.aws.mediastore-data/describe-object-request {:payload nil, :move {}, :headers {}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.mediastore-data/describe-object-response {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data/object-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error})))
(clojure.spec.alpha/fdef describe-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data/describe-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/describe-object-response))

(clojure.core/defn get-object ([get-object-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data/endpoints "GET" "/{Path+}" get-object-request :portkey.aws.mediastore-data/get-object-request {:payload nil, :move {}, :headers {"Range" ["Range" nil]}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.mediastore-data/get-object-response {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data/object-not-found-exception, "RequestedRangeNotSatisfiableException" :portkey.aws.mediastore-data/requested-range-not-satisfiable-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error})))
(clojure.spec.alpha/fdef get-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data/get-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/get-object-response))

(clojure.core/defn list-items ([] (list-items {})) ([list-items-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data/endpoints "GET" "/" list-items-request :portkey.aws.mediastore-data/list-items-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"Path" "Path", "MaxResults" "MaxResults", "NextToken" "NextToken"}} nil :portkey.aws.mediastore-data/list-items-response {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error})))
(clojure.spec.alpha/fdef list-items :args (clojure.spec.alpha/? :portkey.aws.mediastore-data/list-items-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/list-items-response))

(clojure.core/defn put-object ([put-object-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data/endpoints "PUT" "/{Path+}" put-object-request :portkey.aws.mediastore-data/put-object-request {:payload "Body", :move {}, :headers {"ContentType" ["Content-Type" nil], "CacheControl" ["Cache-Control" nil], "StorageClass" ["x-amz-storage-class" nil]}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.mediastore-data/put-object-response {"ContainerNotFoundException" :portkey.aws.mediastore-data/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data/internal-server-error})))
(clojure.spec.alpha/fdef put-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data/put-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data/put-object-response))
