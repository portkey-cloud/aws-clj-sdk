(ns portkey.aws.mediastore-data.-2017-09-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.delete-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/delete-object-request (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.-2017-09-01.delete-object-request/Path] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.list-items-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/list-path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.list-items-request/max-results (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/list-limit))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.list-items-request/next-token (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/list-items-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.list-items-request/Path :portkey.aws.mediastore-data.-2017-09-01.list-items-request/MaxResults :portkey.aws.mediastore-data.-2017-09-01.list-items-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/content-range-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^bytes=\d+\-\d+/\d+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.put-object-request/body (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/payload-blob))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.put-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.put-object-request/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/put-object-request (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.-2017-09-01.put-object-request/Body :portkey.aws.mediastore-data.-2017-09-01.put-object-request/Path] :opt-un [:portkey.aws.mediastore-data.-2017-09-01/ContentType :portkey.aws.mediastore-data.-2017-09-01.put-object-request/CacheControl :portkey.aws.mediastore-data.-2017-09-01/StorageClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/list-limit (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__)) (fn* [p1__16204__16205__auto__] (clojure.core/<= p1__16204__16205__auto__ 1000))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.container-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/container-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.container-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/sha256-hash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 64 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 64)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[0-9A-Fa-f]{64}" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/pagination-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/item-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mediastore-data.-2017-09-01/item) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.get-object-response/body (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/payload-blob))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.get-object-response/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.get-object-response/content-range (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/content-range-pattern))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.get-object-response/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.get-object-response/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.get-object-response/status-code (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/status-code))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/get-object-response (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.-2017-09-01.get-object-response/StatusCode] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.get-object-response/Body :portkey.aws.mediastore-data.-2017-09-01.get-object-response/CacheControl :portkey.aws.mediastore-data.-2017-09-01.get-object-response/ContentRange :portkey.aws.mediastore-data.-2017-09-01.get-object-response/ContentLength :portkey.aws.mediastore-data.-2017-09-01/ContentType :portkey.aws.mediastore-data.-2017-09-01/ETag :portkey.aws.mediastore-data.-2017-09-01.get-object-response/LastModified] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 255)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[ \w:\.\?-]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/etag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 64)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[0-9A-Fa-f]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/item-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[A-Za-z0-9_\.\-\~]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[\w\-\/\.]{1,255}$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/item-type (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"OBJECT" "OBJECT", :object "OBJECT", "FOLDER" "FOLDER", :folder "FOLDER"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/status-code (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.requested-range-not-satisfiable-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/requested-range-not-satisfiable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.requested-range-not-satisfiable-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/non-negative-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.put-object-response/contentsha256 (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/sha256-hash))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/put-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.put-object-response/ContentSHA256 :portkey.aws.mediastore-data.-2017-09-01/ETag :portkey.aws.mediastore-data.-2017-09-01/StorageClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/string-primitive (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.list-items-response/items (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/item-list))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.list-items-response/next-token (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/list-items-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.list-items-response/Items :portkey.aws.mediastore-data.-2017-09-01.list-items-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.get-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.get-object-request/range (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/range-pattern))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/get-object-request (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.-2017-09-01.get-object-request/Path] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.get-object-request/Range] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.describe-object-request/path (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/path-naming))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/describe-object-request (portkey.aws/json-keys :req-un [:portkey.aws.mediastore-data.-2017-09-01.describe-object-request/Path] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/path-naming (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 900)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"(?:[A-Za-z0-9_\.\-\~]+/){0,10}[A-Za-z0-9_\.\-\~]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/range-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^bytes=(?:\d+\-\d*|\d*\-\d+)$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/payload-blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/internal-server-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.internal-server-error/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/storage-class (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"TEMPORAL" "TEMPORAL", :temporal "TEMPORAL"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.object-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/object-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.object-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/delete-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.item/name (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/item-name))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.item/type (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/item-type))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.item/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.item/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01.item/Name :portkey.aws.mediastore-data.-2017-09-01.item/Type :portkey.aws.mediastore-data.-2017-09-01/ETag :portkey.aws.mediastore-data.-2017-09-01.item/LastModified :portkey.aws.mediastore-data.-2017-09-01/ContentType :portkey.aws.mediastore-data.-2017-09-01.item/ContentLength] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/list-path-naming (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 0 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 900)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"/?(?:[A-Za-z0-9_\.\-\~]+/){0,10}(?:[A-Za-z0-9_\.\-\~]+)?/?" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.describe-object-response/content-length (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.describe-object-response/cache-control (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/string-primitive))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01.describe-object-response/last-modified (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore-data.-2017-09-01/describe-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediastore-data.-2017-09-01/ETag :portkey.aws.mediastore-data.-2017-09-01/ContentType :portkey.aws.mediastore-data.-2017-09-01.describe-object-response/ContentLength :portkey.aws.mediastore-data.-2017-09-01.describe-object-response/CacheControl :portkey.aws.mediastore-data.-2017-09-01.describe-object-response/LastModified] :locations {}))

(clojure.core/defn delete-object "Deletes an object at the specified path." ([delete-object-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data.-2017-09-01/endpoints "DELETE" "/{Path+}" delete-object-request :portkey.aws.mediastore-data.-2017-09-01/delete-object-request {:payload nil, :move {}, :headers {}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.mediastore-data.-2017-09-01/delete-object-response {"ContainerNotFoundException" :portkey.aws.mediastore-data.-2017-09-01/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data.-2017-09-01/object-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data.-2017-09-01/internal-server-error})))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data.-2017-09-01/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/delete-object-response))

(clojure.core/defn describe-object "Gets the headers for an object at the specified path." ([describe-object-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data.-2017-09-01/endpoints "HEAD" "/{Path+}" describe-object-request :portkey.aws.mediastore-data.-2017-09-01/describe-object-request {:payload nil, :move {}, :headers {}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.mediastore-data.-2017-09-01/describe-object-response {"ContainerNotFoundException" :portkey.aws.mediastore-data.-2017-09-01/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data.-2017-09-01/object-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data.-2017-09-01/internal-server-error})))
(clojure.spec.alpha/fdef describe-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data.-2017-09-01/describe-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/describe-object-response))

(clojure.core/defn get-object "Downloads the object at the specified path." ([get-object-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data.-2017-09-01/endpoints "GET" "/{Path+}" get-object-request :portkey.aws.mediastore-data.-2017-09-01/get-object-request {:payload nil, :move {}, :headers {"Range" ["Range" nil]}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.mediastore-data.-2017-09-01/get-object-response {"ContainerNotFoundException" :portkey.aws.mediastore-data.-2017-09-01/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.mediastore-data.-2017-09-01/object-not-found-exception, "RequestedRangeNotSatisfiableException" :portkey.aws.mediastore-data.-2017-09-01/requested-range-not-satisfiable-exception, "InternalServerError" :portkey.aws.mediastore-data.-2017-09-01/internal-server-error})))
(clojure.spec.alpha/fdef get-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data.-2017-09-01/get-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/get-object-response))

(clojure.core/defn list-items "Provides a list of metadata entries about folders and objects in the specified\nfolder." ([] (list-items {})) ([list-items-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data.-2017-09-01/endpoints "GET" "/" list-items-request :portkey.aws.mediastore-data.-2017-09-01/list-items-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"Path" "Path", "MaxResults" "MaxResults", "NextToken" "NextToken"}} nil :portkey.aws.mediastore-data.-2017-09-01/list-items-response {"ContainerNotFoundException" :portkey.aws.mediastore-data.-2017-09-01/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data.-2017-09-01/internal-server-error})))
(clojure.spec.alpha/fdef list-items :args (clojure.spec.alpha/? :portkey.aws.mediastore-data.-2017-09-01/list-items-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/list-items-response))

(clojure.core/defn put-object "Uploads an object to the specified path. Object sizes are limited to 10 MB." ([put-object-request] (portkey.aws/-rest-json-call portkey.aws.mediastore-data.-2017-09-01/endpoints "PUT" "/{Path+}" put-object-request :portkey.aws.mediastore-data.-2017-09-01/put-object-request {:payload "Body", :move {}, :headers {"ContentType" ["Content-Type" nil], "CacheControl" ["Cache-Control" nil], "StorageClass" ["x-amz-storage-class" nil]}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.mediastore-data.-2017-09-01/put-object-response {"ContainerNotFoundException" :portkey.aws.mediastore-data.-2017-09-01/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore-data.-2017-09-01/internal-server-error})))
(clojure.spec.alpha/fdef put-object :args (clojure.spec.alpha/tuple :portkey.aws.mediastore-data.-2017-09-01/put-object-request) :ret (clojure.spec.alpha/and :portkey.aws.mediastore-data.-2017-09-01/put-object-response))
