(ns portkey.aws.kinesis-video-archived-media (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-number-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[0-9]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/not-authorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.not-authorized-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.get-media-for-fragment-list-input/fragments (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/fragment-number-list))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-archived-media/StreamName :portkey.aws.kinesis-video-archived-media.get-media-for-fragment-list-input/Fragments] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-number (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-size-in-bytes (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/long))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/producer-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/server-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-length-in-milliseconds (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/long))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.fragment/FragmentNumber :portkey.aws.kinesis-video-archived-media.fragment/FragmentSizeInBytes :portkey.aws.kinesis-video-archived-media.fragment/ProducerTimestamp :portkey.aws.kinesis-video-archived-media.fragment/ServerTimestamp :portkey.aws.kinesis-video-archived-media.fragment/FragmentLengthInMilliseconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-number-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.kinesis-video-archived-media/fragment-number-string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.kinesis-video-archived-media/fragment) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.timestamp-range/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.timestamp-range/end-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/timestamp-range (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-archived-media.timestamp-range/StartTimestamp :portkey.aws.kinesis-video-archived-media.timestamp-range/EndTimestamp] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.client-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/invalid-argument-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.invalid-argument-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-selector-type (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :producer-timestamp "PRODUCER_TIMESTAMP", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", :server-timestamp "SERVER_TIMESTAMP"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-selector (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-archived-media/FragmentSelectorType :portkey.aws.kinesis-video-archived-media/TimestampRange] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/page-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-input/next-token (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/list-fragments-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesis-video-archived-media/StreamName] :opt-un [:portkey.aws.kinesis-video-archived-media.list-fragments-input/MaxResults :portkey.aws.kinesis-video-archived-media.list-fragments-input/NextToken :portkey.aws.kinesis-video-archived-media/FragmentSelector] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-output/fragments (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/fragment-list))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-output/next-token (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/list-fragments-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.list-fragments-output/Fragments :portkey.aws.kinesis-video-archived-media.list-fragments-output/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/page-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media/ContentType :portkey.aws.kinesis-video-archived-media/Payload] :locations {}))

(clojure.core/defn get-media-for-fragment-list "Gets media for a list of fragments (specified by fragment number) from the\narchived data in a Kinesis video stream.\n This operation is only available for the AWS SDK for Java. It is not supported\nin AWS SDKs for other languages.\n The following limits apply when using the GetMediaForFragmentList API:\n * A client can call GetMediaForFragmentList up to five times per second per\nstream.\n * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per\nsecond (or 200 megabits per second) during a GetMediaForFragmentList session." ([get-media-for-fragment-list-input] (portkey.aws/-rest-json-call portkey.aws.kinesis-video-archived-media/endpoints "POST" "/getMediaForFragmentList" get-media-for-fragment-list-input :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media/not-authorized-exception})))
(clojure.spec.alpha/fdef get-media-for-fragment-list :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output))

(clojure.core/defn list-fragments "Returns a list of Fragment objects from the specified stream and start location\nwithin the archived data." ([list-fragments-input] (portkey.aws/-rest-json-call portkey.aws.kinesis-video-archived-media/endpoints "POST" "/listFragments" list-fragments-input :portkey.aws.kinesis-video-archived-media/list-fragments-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesis-video-archived-media/list-fragments-output {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media/not-authorized-exception})))
(clojure.spec.alpha/fdef list-fragments :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-archived-media/list-fragments-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/list-fragments-output))
