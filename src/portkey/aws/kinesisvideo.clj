(ns portkey.aws.kinesisvideo (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/fragment-number-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^[0-9]+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 256)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.get-media-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/get-media-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo/StartSelector] :opt-un [:portkey.aws.kinesisvideo/StreamName :portkey.aws.kinesisvideo.get-media-input/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.invalid-endpoint-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/invalid-endpoint-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.invalid-endpoint-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/not-authorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.not-authorized-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.start-selector/after-fragment-number (clojure.spec.alpha/and :portkey.aws.kinesisvideo/fragment-number-string))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.start-selector/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisvideo/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/start-selector (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo/StartSelectorType] :opt-un [:portkey.aws.kinesisvideo.start-selector/AfterFragmentNumber :portkey.aws.kinesisvideo.start-selector/StartTimestamp :portkey.aws.kinesisvideo/ContinuationToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/start-selector-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"EARLIEST" "EARLIEST", "NOW" "NOW", "FRAGMENT_NUMBER" "FRAGMENT_NUMBER", "PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :now "NOW", :producer-timestamp "PRODUCER_TIMESTAMP", :fragment-number "FRAGMENT_NUMBER", :earliest "EARLIEST", :continuation-token "CONTINUATION_TOKEN", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", "CONTINUATION_TOKEN" "CONTINUATION_TOKEN", :server-timestamp "SERVER_TIMESTAMP"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.put-media-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.put-media-input/producer-start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisvideo/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/put-media-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo/FragmentTimecodeType] :opt-un [:portkey.aws.kinesisvideo/StreamName :portkey.aws.kinesisvideo.put-media-input/StreamARN :portkey.aws.kinesisvideo.put-media-input/ProducerStartTimestamp :portkey.aws.kinesisvideo/Payload] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/put-media-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/Payload] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/client-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.client-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/continuation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/invalid-argument-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.invalid-argument-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.connection-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/connection-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.connection-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/resourcearn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1024)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/get-media-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/ContentType :portkey.aws.kinesisvideo/Payload] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/fragment-timecode-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ABSOLUTE" "ABSOLUTE", :absolute "ABSOLUTE", "RELATIVE" "RELATIVE", :relative "RELATIVE"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.core/defn get-media ([get-media-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/getMedia" get-media-input :portkey.aws.kinesisvideo/get-media-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/get-media-output {"ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception, "InvalidEndpointException" :portkey.aws.kinesisvideo/invalid-endpoint-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "ConnectionLimitExceededException" :portkey.aws.kinesisvideo/connection-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception})))
(clojure.spec.alpha/fdef get-media :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/get-media-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/get-media-output))

(clojure.core/defn put-media ([put-media-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/putMedia" put-media-input :portkey.aws.kinesisvideo/put-media-input {:payload "Payload", :move {}, :headers {"StreamName" ["x-amzn-stream-name" nil], "StreamARN" ["x-amzn-stream-arn" nil], "FragmentTimecodeType" ["x-amzn-fragment-timecode-type" nil], "ProducerStartTimestamp" ["x-amzn-producer-start-timestamp" nil]}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/put-media-output {"ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception, "InvalidEndpointException" :portkey.aws.kinesisvideo/invalid-endpoint-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "ConnectionLimitExceededException" :portkey.aws.kinesisvideo/connection-limit-exceeded-exception})))
(clojure.spec.alpha/fdef put-media :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/put-media-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/put-media-output))
