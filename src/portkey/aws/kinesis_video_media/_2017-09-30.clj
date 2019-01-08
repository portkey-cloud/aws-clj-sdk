(ns portkey.aws.kinesis-video-media.-2017-09-30 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-fragment-number-string)

(clojure.core/declare ser-stream-name)

(clojure.core/declare ser-start-selector)

(clojure.core/declare ser-start-selector-type)

(clojure.core/declare ser-continuation-token)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-resource-arn)

(clojure.core/defn- ser-fragment-number-string [input] #:http.request.field{:value input, :shape "FragmentNumberString"})

(clojure.core/defn- ser-stream-name [input] #:http.request.field{:value input, :shape "StreamName"})

(clojure.core/defn- ser-start-selector [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-start-selector-type (:start-selector-type input)) #:http.request.field{:name "StartSelectorType", :shape "StartSelectorType"})], :shape "StartSelector", :type "structure"} (clojure.core/contains? input :after-fragment-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fragment-number-string (input :after-fragment-number)) #:http.request.field{:name "AfterFragmentNumber", :shape "FragmentNumberString"})) (clojure.core/contains? input :start-timestamp) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start-timestamp)) #:http.request.field{:name "StartTimestamp", :shape "Timestamp"})) (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continuation-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "ContinuationToken"}))))

(clojure.core/defn- ser-start-selector-type [input] #:http.request.field{:value (clojure.core/get {"EARLIEST" "EARLIEST", "NOW" "NOW", "FRAGMENT_NUMBER" "FRAGMENT_NUMBER", "PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :now "NOW", :producer-timestamp "PRODUCER_TIMESTAMP", :fragment-number "FRAGMENT_NUMBER", :earliest "EARLIEST", :continuation-token "CONTINUATION_TOKEN", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", "CONTINUATION_TOKEN" "CONTINUATION_TOKEN", :server-timestamp "SERVER_TIMESTAMP"} input), :shape "StartSelectorType"})

(clojure.core/defn- ser-continuation-token [input] #:http.request.field{:value input, :shape "ContinuationToken"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- req-get-media-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-start-selector (input :start-selector)) #:http.request.field{:name "StartSelector", :shape "StartSelector"})]} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"}))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/fragment-number-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[0-9]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.get-media-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-media.-2017-09-30/start-selector] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30/stream-name :portkey.aws.kinesis-video-media.-2017-09-30.get-media-input/stream-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.invalid-endpoint-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/invalid-endpoint-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.invalid-endpoint-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/payload clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/after-fragment-number (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/fragment-number-string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/start-selector (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-media.-2017-09-30/start-selector-type] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.start-selector/after-fragment-number :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/start-timestamp :portkey.aws.kinesis-video-media.-2017-09-30/continuation-token]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/start-selector-type #{"EARLIEST" "NOW" "FRAGMENT_NUMBER" "PRODUCER_TIMESTAMP" :now :producer-timestamp :fragment-number :earliest :continuation-token "SERVER_TIMESTAMP" "CONTINUATION_TOKEN" :server-timestamp})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/client-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.client-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/continuation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.connection-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/connection-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.connection-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30/content-type :portkey.aws.kinesis-video-media.-2017-09-30/payload]))

(clojure.core/defn get-media ([get-media-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-media-input get-media-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis-video-media.-2017-09-30/endpoints, :http.request.spec/output-spec :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getMedia", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video Media", :http.request.spec/input-spec :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMedia", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis-video-media.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-media.-2017-09-30/not-authorized-exception, "InvalidEndpointException" :portkey.aws.kinesis-video-media.-2017-09-30/invalid-endpoint-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-media.-2017-09-30/client-limit-exceeded-exception, "ConnectionLimitExceededException" :portkey.aws.kinesis-video-media.-2017-09-30/connection-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-media.-2017-09-30/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef get-media :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output))
