(ns portkey.aws.data-mediastore (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.data-mediastore.delete-object-request/path (clojure.spec.alpha/and :portkey.aws.data-mediastore/path-naming))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/delete-object-request (portkey.aws/json-keys :req-un [:portkey.aws.data-mediastore.delete-object-request/Path] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.list-items-request/path (clojure.spec.alpha/and :portkey.aws.data-mediastore/list-path-naming))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.list-items-request/max-results (clojure.spec.alpha/and :portkey.aws.data-mediastore/list-limit))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.list-items-request/next-token (clojure.spec.alpha/and :portkey.aws.data-mediastore/pagination-token))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/list-items-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore.list-items-request/Path :portkey.aws.data-mediastore.list-items-request/MaxResults :portkey.aws.data-mediastore.list-items-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/content-range-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^bytes=\d+\-\d+/\d+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.put-object-request/body (clojure.spec.alpha/and :portkey.aws.data-mediastore/payload-blob))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.put-object-request/path (clojure.spec.alpha/and :portkey.aws.data-mediastore/path-naming))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.put-object-request/cache-control (clojure.spec.alpha/and :portkey.aws.data-mediastore/string-primitive))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/put-object-request (portkey.aws/json-keys :req-un [:portkey.aws.data-mediastore.put-object-request/Body :portkey.aws.data-mediastore.put-object-request/Path] :opt-un [:portkey.aws.data-mediastore/ContentType :portkey.aws.data-mediastore.put-object-request/CacheControl :portkey.aws.data-mediastore/StorageClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/list-limit (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 1000))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.container-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.data-mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/container-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore.container-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/sha256-hash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 64 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 64)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[0-9A-Fa-f]{64}" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/pagination-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/item-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.data-mediastore/item) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.get-object-response/body (clojure.spec.alpha/and :portkey.aws.data-mediastore/payload-blob))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.get-object-response/cache-control (clojure.spec.alpha/and :portkey.aws.data-mediastore/string-primitive))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.get-object-response/content-range (clojure.spec.alpha/and :portkey.aws.data-mediastore/content-range-pattern))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.get-object-response/content-length (clojure.spec.alpha/and :portkey.aws.data-mediastore/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.get-object-response/last-modified (clojure.spec.alpha/and :portkey.aws.data-mediastore/time-stamp))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.get-object-response/status-code (clojure.spec.alpha/and :portkey.aws.data-mediastore/status-code))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/get-object-response (portkey.aws/json-keys :req-un [:portkey.aws.data-mediastore.get-object-response/StatusCode] :opt-un [:portkey.aws.data-mediastore.get-object-response/Body :portkey.aws.data-mediastore.get-object-response/CacheControl :portkey.aws.data-mediastore.get-object-response/ContentRange :portkey.aws.data-mediastore.get-object-response/ContentLength :portkey.aws.data-mediastore/ContentType :portkey.aws.data-mediastore/ETag :portkey.aws.data-mediastore.get-object-response/LastModified] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 255)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[ \w:\.\?-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/etag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 64)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[0-9A-Fa-f]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/item-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[A-Za-z0-9_\.\-\~]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^[\w\-\/\.]{1,255}$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/item-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"OBJECT" "OBJECT", :object "OBJECT", "FOLDER" "FOLDER", :folder "FOLDER"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/status-code (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.requested-range-not-satisfiable-exception/message (clojure.spec.alpha/and :portkey.aws.data-mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/requested-range-not-satisfiable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore.requested-range-not-satisfiable-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/non-negative-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.data-mediastore.put-object-response/contentsha256 (clojure.spec.alpha/and :portkey.aws.data-mediastore/sha256-hash))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/put-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore.put-object-response/ContentSHA256 :portkey.aws.data-mediastore/ETag :portkey.aws.data-mediastore/StorageClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/string-primitive (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.list-items-response/items (clojure.spec.alpha/and :portkey.aws.data-mediastore/item-list))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.list-items-response/next-token (clojure.spec.alpha/and :portkey.aws.data-mediastore/pagination-token))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/list-items-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore.list-items-response/Items :portkey.aws.data-mediastore.list-items-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.get-object-request/path (clojure.spec.alpha/and :portkey.aws.data-mediastore/path-naming))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.get-object-request/range (clojure.spec.alpha/and :portkey.aws.data-mediastore/range-pattern))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/get-object-request (portkey.aws/json-keys :req-un [:portkey.aws.data-mediastore.get-object-request/Path] :opt-un [:portkey.aws.data-mediastore.get-object-request/Range] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.describe-object-request/path (clojure.spec.alpha/and :portkey.aws.data-mediastore/path-naming))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/describe-object-request (portkey.aws/json-keys :req-un [:portkey.aws.data-mediastore.describe-object-request/Path] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/path-naming (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 900)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"(?:[A-Za-z0-9_\.\-\~]+/){0,10}[A-Za-z0-9_\.\-\~]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/range-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^bytes=(?:\d+\-\d*|\d*\-\d+)$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/payload-blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.data-mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/internal-server-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore.internal-server-error/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/storage-class (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"TEMPORAL" "TEMPORAL", :temporal "TEMPORAL"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.object-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.data-mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/object-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore.object-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/delete-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.item/name (clojure.spec.alpha/and :portkey.aws.data-mediastore/item-name))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.item/type (clojure.spec.alpha/and :portkey.aws.data-mediastore/item-type))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.item/last-modified (clojure.spec.alpha/and :portkey.aws.data-mediastore/time-stamp))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.item/content-length (clojure.spec.alpha/and :portkey.aws.data-mediastore/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore.item/Name :portkey.aws.data-mediastore.item/Type :portkey.aws.data-mediastore/ETag :portkey.aws.data-mediastore.item/LastModified :portkey.aws.data-mediastore/ContentType :portkey.aws.data-mediastore.item/ContentLength] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-mediastore/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.data-mediastore/list-path-naming (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 0 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 900)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"/?(?:[A-Za-z0-9_\.\-\~]+/){0,10}(?:[A-Za-z0-9_\.\-\~]+)?/?" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-mediastore.describe-object-response/content-length (clojure.spec.alpha/and :portkey.aws.data-mediastore/non-negative-long))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.describe-object-response/cache-control (clojure.spec.alpha/and :portkey.aws.data-mediastore/string-primitive))
(clojure.spec.alpha/def :portkey.aws.data-mediastore.describe-object-response/last-modified (clojure.spec.alpha/and :portkey.aws.data-mediastore/time-stamp))
(clojure.spec.alpha/def :portkey.aws.data-mediastore/describe-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-mediastore/ETag :portkey.aws.data-mediastore/ContentType :portkey.aws.data-mediastore.describe-object-response/ContentLength :portkey.aws.data-mediastore.describe-object-response/CacheControl :portkey.aws.data-mediastore.describe-object-response/LastModified] :locations {}))

(clojure.core/defn delete-object "<p>Deletes an object at the specified path.</p>" ([delete-object-request] (portkey.aws/-rest-json-call portkey.aws.data-mediastore/endpoints "DELETE" "/{Path+}" delete-object-request :portkey.aws.data-mediastore/delete-object-request {:payload nil, :move {}, :headers {}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.data-mediastore/delete-object-response {"ContainerNotFoundException" :portkey.aws.data-mediastore/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.data-mediastore/object-not-found-exception, "InternalServerError" :portkey.aws.data-mediastore/internal-server-error})))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.data-mediastore/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.data-mediastore/delete-object-response))

(clojure.core/defn describe-object "<p>Gets the headers for an object at the specified path.</p>" ([describe-object-request] (portkey.aws/-rest-json-call portkey.aws.data-mediastore/endpoints "HEAD" "/{Path+}" describe-object-request :portkey.aws.data-mediastore/describe-object-request {:payload nil, :move {}, :headers {}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.data-mediastore/describe-object-response {"ContainerNotFoundException" :portkey.aws.data-mediastore/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.data-mediastore/object-not-found-exception, "InternalServerError" :portkey.aws.data-mediastore/internal-server-error})))
(clojure.spec.alpha/fdef describe-object :args (clojure.spec.alpha/tuple :portkey.aws.data-mediastore/describe-object-request) :ret (clojure.spec.alpha/and :portkey.aws.data-mediastore/describe-object-response))

(clojure.core/defn get-object "<p>Downloads the object at the specified path.</p>" ([get-object-request] (portkey.aws/-rest-json-call portkey.aws.data-mediastore/endpoints "GET" "/{Path+}" get-object-request :portkey.aws.data-mediastore/get-object-request {:payload nil, :move {}, :headers {"Range" ["Range" nil]}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.data-mediastore/get-object-response {"ContainerNotFoundException" :portkey.aws.data-mediastore/container-not-found-exception, "ObjectNotFoundException" :portkey.aws.data-mediastore/object-not-found-exception, "RequestedRangeNotSatisfiableException" :portkey.aws.data-mediastore/requested-range-not-satisfiable-exception, "InternalServerError" :portkey.aws.data-mediastore/internal-server-error})))
(clojure.spec.alpha/fdef get-object :args (clojure.spec.alpha/tuple :portkey.aws.data-mediastore/get-object-request) :ret (clojure.spec.alpha/and :portkey.aws.data-mediastore/get-object-response))

(clojure.core/defn list-items "<p>Provides a list of metadata entries about folders and objects in the specified folder.</p>" ([] (list-items {})) ([list-items-request] (portkey.aws/-rest-json-call portkey.aws.data-mediastore/endpoints "GET" "/" list-items-request :portkey.aws.data-mediastore/list-items-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"Path" "Path", "MaxResults" "MaxResults", "NextToken" "NextToken"}} nil :portkey.aws.data-mediastore/list-items-response {"ContainerNotFoundException" :portkey.aws.data-mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.data-mediastore/internal-server-error})))
(clojure.spec.alpha/fdef list-items :args (clojure.spec.alpha/? :portkey.aws.data-mediastore/list-items-request) :ret (clojure.spec.alpha/and :portkey.aws.data-mediastore/list-items-response))

(clojure.core/defn put-object "<p>Uploads an object to the specified path. Object sizes are limited to 10 MB.</p>" ([put-object-request] (portkey.aws/-rest-json-call portkey.aws.data-mediastore/endpoints "PUT" "/{Path+}" put-object-request :portkey.aws.data-mediastore/put-object-request {:payload "Body", :move {}, :headers {"ContentType" ["Content-Type" nil], "CacheControl" ["Cache-Control" nil], "StorageClass" ["x-amz-storage-class" nil]}, :uri {"Path" "Path"}, :querystring {}} nil :portkey.aws.data-mediastore/put-object-response {"ContainerNotFoundException" :portkey.aws.data-mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.data-mediastore/internal-server-error})))
(clojure.spec.alpha/fdef put-object :args (clojure.spec.alpha/tuple :portkey.aws.data-mediastore/put-object-request) :ret (clojure.spec.alpha/and :portkey.aws.data-mediastore/put-object-response))
