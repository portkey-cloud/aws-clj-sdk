(ns portkey.aws.kinesis-video-media.-2017-09-30 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "kinesisvideo", :region "ap-northeast-1"},
    :ssl-common-name "kinesisvideo.ap-northeast-1.amazonaws.com",
    :endpoint "https://kinesisvideo.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "kinesisvideo", :region "eu-west-1"},
    :ssl-common-name "kinesisvideo.eu-west-1.amazonaws.com",
    :endpoint "https://kinesisvideo.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "kinesisvideo", :region "eu-central-1"},
    :ssl-common-name "kinesisvideo.eu-central-1.amazonaws.com",
    :endpoint "https://kinesisvideo.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "kinesisvideo", :region "us-west-2"},
    :ssl-common-name "kinesisvideo.us-west-2.amazonaws.com",
    :endpoint "https://kinesisvideo.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "kinesisvideo", :region "us-east-1"},
    :ssl-common-name "kinesisvideo.us-east-1.amazonaws.com",
    :endpoint "https://kinesisvideo.us-east-1.amazonaws.com",
    :signature-version :v4}})

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

(clojure.core/declare deser-payload)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-content-type)

(clojure.core/defn- deser-payload [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-content-type [input] input)

(clojure.core/defn- response-invalid-endpoint-exception ([input] (response-invalid-endpoint-exception nil input)) ([resultWrapper264726 input] (clojure.core/let [rawinput264725 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar264727 {"Message" (rawinput264725 "Message")}] (clojure.core/cond-> {} (letvar264727 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar264727 ["Message"])))))))

(clojure.core/defn- response-not-authorized-exception ([input] (response-not-authorized-exception nil input)) ([resultWrapper264729 input] (clojure.core/let [rawinput264728 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar264730 {"Message" (rawinput264728 "Message")}] (clojure.core/cond-> {} (letvar264730 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar264730 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper264732 input] (clojure.core/let [rawinput264731 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar264733 {"Message" (rawinput264731 "Message")}] (clojure.core/cond-> {} (letvar264733 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar264733 ["Message"])))))))

(clojure.core/defn- response-client-limit-exceeded-exception ([input] (response-client-limit-exceeded-exception nil input)) ([resultWrapper264735 input] (clojure.core/let [rawinput264734 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar264736 {"Message" (rawinput264734 "Message")}] (clojure.core/cond-> {} (letvar264736 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar264736 ["Message"])))))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper264738 input] (clojure.core/let [rawinput264737 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar264739 {"Message" (rawinput264737 "Message")}] (clojure.core/cond-> {} (letvar264739 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar264739 ["Message"])))))))

(clojure.core/defn- response-connection-limit-exceeded-exception ([input] (response-connection-limit-exceeded-exception nil input)) ([resultWrapper264741 input] (clojure.core/let [rawinput264740 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar264742 {"Message" (rawinput264740 "Message")}] (clojure.core/cond-> {} (letvar264742 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar264742 ["Message"])))))))

(clojure.core/defn- response-get-media-output ([input] (response-get-media-output nil input)) ([resultWrapper264744 input] (clojure.core/let [rawinput264743 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar264745 {"Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "Payload" (rawinput264743 "Payload")}] (clojure.core/cond-> {} (letvar264745 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar264745 ["Content-Type"]))) (letvar264745 "Payload") (clojure.core/assoc :payload (deser-payload (clojure.core/get-in letvar264745 ["Payload"])))))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/fragment-number-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[0-9]+$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.get-media-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-media.-2017-09-30/start-selector] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30/stream-name :portkey.aws.kinesis-video-media.-2017-09-30.get-media-input/stream-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.invalid-endpoint-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/invalid-endpoint-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.invalid-endpoint-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/payload clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/after-fragment-number (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/fragment-number-string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/start-selector (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-media.-2017-09-30/start-selector-type] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.start-selector/after-fragment-number :portkey.aws.kinesis-video-media.-2017-09-30.start-selector/start-timestamp :portkey.aws.kinesis-video-media.-2017-09-30/continuation-token]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/start-selector-type #{"EARLIEST" "NOW" "FRAGMENT_NUMBER" "PRODUCER_TIMESTAMP" :now :producer-timestamp :fragment-number :earliest :continuation-token "SERVER_TIMESTAMP" "CONTINUATION_TOKEN" :server-timestamp})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/client-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.client-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/continuation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30.connection-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/connection-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30.connection-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-media.-2017-09-30/content-type :portkey.aws.kinesis-video-media.-2017-09-30/payload]))

(clojure.core/defn get-media " Use this API to retrieve media content from a Kinesis video stream. In the\nrequest, you identify the stream name or stream Amazon Resource Name (ARN), and\nthe starting chunk. Kinesis Video Streams then returns a stream of chunks in\norder by fragment number.\n You must first call the GetDataEndpoint API to get an endpoint. Then send the\nGetMedia requests to this endpoint using the --endpoint-url parameter\n(https://docs.aws.amazon.com/cli/latest/reference/).\n When you put media data (fragments) on a stream, Kinesis Video Streams stores\neach incoming fragment and related metadata in what is called a \"chunk.\" For\nmore information, see . The GetMedia API returns a stream of these chunks\nstarting from the chunk that you specify in the request.\n The following limits apply when using the GetMedia API:\n * A client can call GetMedia up to five times per second per stream.\n * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per\nsecond (or 200 megabits per second) during a GetMedia session." ([get-media-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-media-input get-media-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis-video-media.-2017-09-30/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getMedia", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video Media", :http.request.spec/input-spec :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMedia", :http.request.configuration/output-deser-fn response-get-media-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis-video-media.-2017-09-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-media.-2017-09-30/not-authorized-exception, "InvalidEndpointException" :portkey.aws.kinesis-video-media.-2017-09-30/invalid-endpoint-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-media.-2017-09-30/client-limit-exceeded-exception, "ConnectionLimitExceededException" :portkey.aws.kinesis-video-media.-2017-09-30/connection-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-media.-2017-09-30/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef get-media :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-media.-2017-09-30/get-media-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-media.-2017-09-30/get-media-output))
