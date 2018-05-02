(ns portkey.aws.kinesis-video-archived-media.-2017-09-30 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment-number-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 128)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^[0-9]+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 256)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/not-authorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30.not-authorized-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.get-media-for-fragment-list-input/fragments (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment-number-list))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/get-media-for-fragment-list-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30/StreamName :portkey.aws.kinesis-video-archived-media.-2017-09-30.get-media-for-fragment-list-input/Fragments] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/fragment-number (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/fragment-size-in-bytes (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/long))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/producer-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/server-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/fragment-length-in-milliseconds (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/long))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/FragmentNumber :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/FragmentSizeInBytes :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/ProducerTimestamp :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/ServerTimestamp :portkey.aws.kinesis-video-archived-media.-2017-09-30.fragment/FragmentLengthInMilliseconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 128)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment-number-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment-number-string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.timestamp-range/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.timestamp-range/end-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/timestamp-range (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30.timestamp-range/StartTimestamp :portkey.aws.kinesis-video-archived-media.-2017-09-30.timestamp-range/EndTimestamp] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/client-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30.client-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/invalid-argument-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30.invalid-argument-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment-selector-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :producer-timestamp "PRODUCER_TIMESTAMP", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", :server-timestamp "SERVER_TIMESTAMP"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment-selector (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30/FragmentSelectorType :portkey.aws.kinesis-video-archived-media.-2017-09-30/TimestampRange] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.list-fragments-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/page-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.list-fragments-input/next-token (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/list-fragments-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30/StreamName] :opt-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30.list-fragments-input/MaxResults :portkey.aws.kinesis-video-archived-media.-2017-09-30.list-fragments-input/NextToken :portkey.aws.kinesis-video-archived-media.-2017-09-30/FragmentSelector] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.list-fragments-output/fragments (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/fragment-list))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30.list-fragments-output/next-token (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/list-fragments-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30.list-fragments-output/Fragments :portkey.aws.kinesis-video-archived-media.-2017-09-30.list-fragments-output/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/page-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.-2017-09-30/get-media-for-fragment-list-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.-2017-09-30/ContentType :portkey.aws.kinesis-video-archived-media.-2017-09-30/Payload] :locations {}))

(clojure.core/defn get-media-for-fragment-list ([get-media-for-fragment-list-input] (portkey.aws/-rest-json-call portkey.aws.kinesis-video-archived-media.-2017-09-30/endpoints "POST" "/getMediaForFragmentList" get-media-for-fragment-list-input :portkey.aws.kinesis-video-archived-media.-2017-09-30/get-media-for-fragment-list-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesis-video-archived-media.-2017-09-30/get-media-for-fragment-list-output {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media.-2017-09-30/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media.-2017-09-30/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media.-2017-09-30/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media.-2017-09-30/not-authorized-exception})))
(clojure.spec.alpha/fdef get-media-for-fragment-list :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-archived-media.-2017-09-30/get-media-for-fragment-list-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/get-media-for-fragment-list-output))

(clojure.core/defn list-fragments ([list-fragments-input] (portkey.aws/-rest-json-call portkey.aws.kinesis-video-archived-media.-2017-09-30/endpoints "POST" "/listFragments" list-fragments-input :portkey.aws.kinesis-video-archived-media.-2017-09-30/list-fragments-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesis-video-archived-media.-2017-09-30/list-fragments-output {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media.-2017-09-30/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media.-2017-09-30/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media.-2017-09-30/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media.-2017-09-30/not-authorized-exception})))
(clojure.spec.alpha/fdef list-fragments :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-archived-media.-2017-09-30/list-fragments-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media.-2017-09-30/list-fragments-output))
