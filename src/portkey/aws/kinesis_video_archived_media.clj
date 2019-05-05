(ns portkey.aws.kinesis-video-archived-media (:require [portkey.aws]))

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

(clojure.core/declare ser-hls-timestamp-range)

(clojure.core/declare ser-hls-fragment-selector)

(clojure.core/declare ser-display-fragment-timestamp)

(clojure.core/declare ser-fragment-number-list)

(clojure.core/declare ser-timestamp-range)

(clojure.core/declare ser-hls-fragment-selector-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-discontinuity-mode)

(clojure.core/declare ser-fragment-selector-type)

(clojure.core/declare ser-fragment-selector)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-playback-mode)

(clojure.core/declare ser-container-format)

(clojure.core/declare ser-page-limit)

(clojure.core/declare ser-expires)

(clojure.core/declare ser-resource-arn)

(clojure.core/defn- ser-fragment-number-string [input] #:http.request.field{:value input, :shape "FragmentNumberString"})

(clojure.core/defn- ser-stream-name [input] #:http.request.field{:value input, :shape "StreamName"})

(clojure.core/defn- ser-hls-timestamp-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HLSTimestampRange", :type "structure"} (clojure.core/contains? input :start-timestamp) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start-timestamp)) #:http.request.field{:name "StartTimestamp", :shape "Timestamp"})) (clojure.core/contains? input :end-timestamp) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end-timestamp)) #:http.request.field{:name "EndTimestamp", :shape "Timestamp"}))))

(clojure.core/defn- ser-hls-fragment-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HLSFragmentSelector", :type "structure"} (clojure.core/contains? input :fragment-selector-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-fragment-selector-type (input :fragment-selector-type)) #:http.request.field{:name "FragmentSelectorType", :shape "HLSFragmentSelectorType"})) (clojure.core/contains? input :timestamp-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-timestamp-range (input :timestamp-range)) #:http.request.field{:name "TimestampRange", :shape "HLSTimestampRange"}))))

(clojure.core/defn- ser-display-fragment-timestamp [input] #:http.request.field{:value (clojure.core/get {"ALWAYS" "ALWAYS", :always "ALWAYS", "NEVER" "NEVER", :never "NEVER"} input), :shape "DisplayFragmentTimestamp"})

(clojure.core/defn- ser-fragment-number-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-fragment-number-string coll) #:http.request.field{:shape "FragmentNumberString"}))) input), :shape "FragmentNumberList", :type "list", :max 1000, :min 1})

(clojure.core/defn- ser-timestamp-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:start-timestamp input)) #:http.request.field{:name "StartTimestamp", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (:end-timestamp input)) #:http.request.field{:name "EndTimestamp", :shape "Timestamp"})], :shape "TimestampRange", :type "structure"}))

(clojure.core/defn- ser-hls-fragment-selector-type [input] #:http.request.field{:value (clojure.core/get {"PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :producer-timestamp "PRODUCER_TIMESTAMP", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", :server-timestamp "SERVER_TIMESTAMP"} input), :shape "HLSFragmentSelectorType"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-discontinuity-mode [input] #:http.request.field{:value (clojure.core/get {"ALWAYS" "ALWAYS", :always "ALWAYS", "NEVER" "NEVER", :never "NEVER"} input), :shape "DiscontinuityMode"})

(clojure.core/defn- ser-fragment-selector-type [input] #:http.request.field{:value (clojure.core/get {"PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :producer-timestamp "PRODUCER_TIMESTAMP", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", :server-timestamp "SERVER_TIMESTAMP"} input), :shape "FragmentSelectorType"})

(clojure.core/defn- ser-fragment-selector [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-fragment-selector-type (:fragment-selector-type input)) #:http.request.field{:name "FragmentSelectorType", :shape "FragmentSelectorType"}) (clojure.core/into (ser-timestamp-range (:timestamp-range input)) #:http.request.field{:name "TimestampRange", :shape "TimestampRange"})], :shape "FragmentSelector", :type "structure"}))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-playback-mode [input] #:http.request.field{:value (clojure.core/get {"LIVE" "LIVE", :live "LIVE", "ON_DEMAND" "ON_DEMAND", :on-demand "ON_DEMAND"} input), :shape "PlaybackMode"})

(clojure.core/defn- ser-container-format [input] #:http.request.field{:value (clojure.core/get {"FRAGMENTED_MP4" "FRAGMENTED_MP4", :fragmented-mp-4 "FRAGMENTED_MP4", "MPEG_TS" "MPEG_TS", :mpeg-ts "MPEG_TS"} input), :shape "ContainerFormat"})

(clojure.core/defn- ser-page-limit [input] #:http.request.field{:value input, :shape "PageLimit"})

(clojure.core/defn- ser-expires [input] #:http.request.field{:value input, :shape "Expires"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- req-get-hls-streaming-session-url-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :hls-fragment-selector) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-fragment-selector (input :hls-fragment-selector)) #:http.request.field{:name "HLSFragmentSelector", :shape "HLSFragmentSelector"})) (clojure.core/contains? input :display-fragment-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-fragment-timestamp (input :display-fragment-timestamp)) #:http.request.field{:name "DisplayFragmentTimestamp", :shape "DisplayFragmentTimestamp"})) (clojure.core/contains? input :max-media-playlist-fragment-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-limit (input :max-media-playlist-fragment-results)) #:http.request.field{:name "MaxMediaPlaylistFragmentResults", :shape "PageLimit"})) (clojure.core/contains? input :discontinuity-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-discontinuity-mode (input :discontinuity-mode)) #:http.request.field{:name "DiscontinuityMode", :shape "DiscontinuityMode"})) (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"})) (clojure.core/contains? input :playback-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-playback-mode (input :playback-mode)) #:http.request.field{:name "PlaybackMode", :shape "PlaybackMode"})) (clojure.core/contains? input :container-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-format (input :container-format)) #:http.request.field{:name "ContainerFormat", :shape "ContainerFormat"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires (input :expires)) #:http.request.field{:name "Expires", :shape "Expires"}))))

(clojure.core/defn- req-get-media-for-fragment-list-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-fragment-number-list (input :fragments)) #:http.request.field{:name "Fragments", :shape "FragmentNumberList"})]}))

(clojure.core/defn- req-list-fragments-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :fragment-selector) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fragment-selector (input :fragment-selector)) #:http.request.field{:name "FragmentSelector", :shape "FragmentSelector"}))))

(clojure.core/declare deser-fragment)

(clojure.core/declare deser-payload)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-fragment-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-long)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-hls-streaming-session-url)

(clojure.core/defn- deser-fragment [input] (clojure.core/cond-> {} (clojure.core/contains? input "FragmentNumber") (clojure.core/assoc :fragment-number (deser-string (input "FragmentNumber"))) (clojure.core/contains? input "FragmentSizeInBytes") (clojure.core/assoc :fragment-size-in-bytes (deser-long (input "FragmentSizeInBytes"))) (clojure.core/contains? input "ProducerTimestamp") (clojure.core/assoc :producer-timestamp (deser-timestamp (input "ProducerTimestamp"))) (clojure.core/contains? input "ServerTimestamp") (clojure.core/assoc :server-timestamp (deser-timestamp (input "ServerTimestamp"))) (clojure.core/contains? input "FragmentLengthInMilliseconds") (clojure.core/assoc :fragment-length-in-milliseconds (deser-long (input "FragmentLengthInMilliseconds")))))

(clojure.core/defn- deser-payload [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-content-type [input] input)

(clojure.core/defn- deser-fragment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fragment coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-hls-streaming-session-url [input] input)

(clojure.core/defn- response-missing-codec-private-data-exception ([input] (response-missing-codec-private-data-exception nil input)) ([resultWrapper263537 input] (clojure.core/let [rawinput263536 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263538 {"Message" (rawinput263536 "Message")}] (clojure.core/cond-> {} (letvar263538 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar263538 ["Message"])))))))

(clojure.core/defn- response-unsupported-stream-media-type-exception ([input] (response-unsupported-stream-media-type-exception nil input)) ([resultWrapper263540 input] (clojure.core/let [rawinput263539 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263541 {"Message" (rawinput263539 "Message")}] (clojure.core/cond-> {} (letvar263541 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar263541 ["Message"])))))))

(clojure.core/defn- response-not-authorized-exception ([input] (response-not-authorized-exception nil input)) ([resultWrapper263543 input] (clojure.core/let [rawinput263542 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263544 {"Message" (rawinput263542 "Message")}] (clojure.core/cond-> {} (letvar263544 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar263544 ["Message"])))))))

(clojure.core/defn- response-no-data-retention-exception ([input] (response-no-data-retention-exception nil input)) ([resultWrapper263546 input] (clojure.core/let [rawinput263545 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263547 {"Message" (rawinput263545 "Message")}] (clojure.core/cond-> {} (letvar263547 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar263547 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper263549 input] (clojure.core/let [rawinput263548 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263550 {"Message" (rawinput263548 "Message")}] (clojure.core/cond-> {} (letvar263550 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar263550 ["Message"])))))))

(clojure.core/defn- response-client-limit-exceeded-exception ([input] (response-client-limit-exceeded-exception nil input)) ([resultWrapper263552 input] (clojure.core/let [rawinput263551 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263553 {"Message" (rawinput263551 "Message")}] (clojure.core/cond-> {} (letvar263553 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar263553 ["Message"])))))))

(clojure.core/defn- response-invalid-codec-private-data-exception ([input] (response-invalid-codec-private-data-exception nil input)) ([resultWrapper263555 input] (clojure.core/let [rawinput263554 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263556 {"Message" (rawinput263554 "Message")}] (clojure.core/cond-> {} (letvar263556 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar263556 ["Message"])))))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper263558 input] (clojure.core/let [rawinput263557 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263559 {"Message" (rawinput263557 "Message")}] (clojure.core/cond-> {} (letvar263559 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar263559 ["Message"])))))))

(clojure.core/defn- response-list-fragments-output ([input] (response-list-fragments-output nil input)) ([resultWrapper263561 input] (clojure.core/let [rawinput263560 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263562 {"Fragments" (rawinput263560 "Fragments"), "NextToken" (rawinput263560 "NextToken")}] (clojure.core/cond-> {} (letvar263562 "Fragments") (clojure.core/assoc :fragments (deser-fragment-list (clojure.core/get-in letvar263562 ["Fragments"]))) (letvar263562 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar263562 ["NextToken"])))))))

(clojure.core/defn- response-get-media-for-fragment-list-output ([input] (response-get-media-for-fragment-list-output nil input)) ([resultWrapper263564 input] (clojure.core/let [rawinput263563 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263565 {"Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "Payload" (rawinput263563 "Payload")}] (clojure.core/cond-> {} (letvar263565 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar263565 ["Content-Type"]))) (letvar263565 "Payload") (clojure.core/assoc :payload (deser-payload (clojure.core/get-in letvar263565 ["Payload"])))))))

(clojure.core/defn- response-get-hls-streaming-session-url-output ([input] (response-get-hls-streaming-session-url-output nil input)) ([resultWrapper263567 input] (clojure.core/let [rawinput263566 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar263568 {"HLSStreamingSessionURL" (rawinput263566 "HLSStreamingSessionURL")}] (clojure.core/cond-> {} (letvar263568 "HLSStreamingSessionURL") (clojure.core/assoc :hls-streaming-session-url (deser-hls-streaming-session-url (clojure.core/get-in letvar263568 ["HLSStreamingSessionURL"])))))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.get-hls-streaming-session-url-input/max-media-playlist-fragment-results (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/page-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.get-hls-streaming-session-url-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media/stream-name :portkey.aws.kinesis-video-archived-media/hls-fragment-selector :portkey.aws.kinesis-video-archived-media/display-fragment-timestamp :portkey.aws.kinesis-video-archived-media.get-hls-streaming-session-url-input/max-media-playlist-fragment-results :portkey.aws.kinesis-video-archived-media/discontinuity-mode :portkey.aws.kinesis-video-archived-media.get-hls-streaming-session-url-input/stream-arn :portkey.aws.kinesis-video-archived-media/playback-mode :portkey.aws.kinesis-video-archived-media/container-format :portkey.aws.kinesis-video-archived-media/expires]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-number-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[0-9]+$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.missing-codec-private-data-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/missing-codec-private-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.missing-codec-private-data-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.unsupported-stream-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/unsupported-stream-media-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.unsupported-stream-media-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.get-media-for-fragment-list-input/fragments (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/fragment-number-list))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-archived-media/stream-name :portkey.aws.kinesis-video-archived-media.get-media-for-fragment-list-input/fragments] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-number (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-size-in-bytes (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/long))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/producer-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/server-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-length-in-milliseconds (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/long))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.fragment/fragment-number :portkey.aws.kinesis-video-archived-media.fragment/fragment-size-in-bytes :portkey.aws.kinesis-video-archived-media.fragment/producer-timestamp :portkey.aws.kinesis-video-archived-media.fragment/server-timestamp :portkey.aws.kinesis-video-archived-media.fragment/fragment-length-in-milliseconds]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.hls-timestamp-range/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.hls-timestamp-range/end-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/hls-timestamp-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.hls-timestamp-range/start-timestamp :portkey.aws.kinesis-video-archived-media.hls-timestamp-range/end-timestamp]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.hls-fragment-selector/fragment-selector-type (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/hls-fragment-selector-type))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.hls-fragment-selector/timestamp-range (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/hls-timestamp-range))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/hls-fragment-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.hls-fragment-selector/fragment-selector-type :portkey.aws.kinesis-video-archived-media.hls-fragment-selector/timestamp-range]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/payload clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/display-fragment-timestamp #{"ALWAYS" :never "NEVER" :always})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-number-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis-video-archived-media/fragment-number-string :min-count 1 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.no-data-retention-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/no-data-retention-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.no-data-retention-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis-video-archived-media/fragment))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.timestamp-range/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.timestamp-range/end-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/timestamp-range (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-archived-media.timestamp-range/start-timestamp :portkey.aws.kinesis-video-archived-media.timestamp-range/end-timestamp] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/hls-fragment-selector-type #{"PRODUCER_TIMESTAMP" :producer-timestamp "SERVER_TIMESTAMP" :server-timestamp})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/discontinuity-mode #{"ALWAYS" :never "NEVER" :always})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.client-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.invalid-codec-private-data-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/invalid-codec-private-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.invalid-codec-private-data-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-selector-type #{"PRODUCER_TIMESTAMP" :producer-timestamp "SERVER_TIMESTAMP" :server-timestamp})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-selector (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-archived-media/fragment-selector-type :portkey.aws.kinesis-video-archived-media/timestamp-range] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/page-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-input/next-token (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/list-fragments-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-archived-media/stream-name] :opt-un [:portkey.aws.kinesis-video-archived-media.list-fragments-input/max-results :portkey.aws.kinesis-video-archived-media.list-fragments-input/next-token :portkey.aws.kinesis-video-archived-media/fragment-selector]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/playback-mode #{"ON_DEMAND" "LIVE" :live :on-demand})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/container-format #{"FRAGMENTED_MP4" :fragmented-mp-4 :mpeg-ts "MPEG_TS"})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-output/fragments (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/fragment-list))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-output/next-token (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/list-fragments-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.list-fragments-output/fragments :portkey.aws.kinesis-video-archived-media.list-fragments-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/page-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media/content-type :portkey.aws.kinesis-video-archived-media/payload]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/hls-streaming-session-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/expires (clojure.spec.alpha/int-in 300 43200))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media/hls-streaming-session-url]))

(clojure.core/defn get-hls-streaming-session-url "Retrieves an HTTP Live Streaming (HLS) URL for the stream. You can then open the\nURL in a browser or media player to view the stream contents.\n You must specify either the StreamName or the StreamARN.\n An Amazon Kinesis video stream has the following requirements for providing\ndata through HLS:\n * The media must contain h.264 encoded video and, optionally, AAC encoded\naudio. Specifically, the codec id of track 1 should be V_MPEG/ISO/AVC.\nOptionally, the codec id of track 2 should be A_AAC.\n * Data retention must be greater than 0.\n * The video track of each fragment must contain codec private data in the\nAdvanced Video Coding (AVC) for H.264 format (MPEG-4 specification ISO/IEC\n14496-15 (https://www.iso.org/standard/55980.html)). For information about\nadapting stream data to a given format, see NAL Adaptation Flags\n(http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/producer-reference-nal.html).\n * The audio track (if present) of each fragment must contain codec private data\nin the AAC format (AAC specification ISO/IEC 13818-7\n(https://www.iso.org/standard/43345.html)).\n Kinesis Video Streams HLS sessions contain fragments in the fragmented MPEG-4\nform (also called fMP4 or CMAF), rather than the MPEG-2 form (also called TS\nchunks, which the HLS specification also supports). For more information about\nHLS fragment types, see the HLS specification\n(https://tools.ietf.org/html/draft-pantos-http-live-streaming-23).\n The following procedure shows how to use HLS with Kinesis Video Streams:\n * Get an endpoint using GetDataEndpoint\n(http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_GetDataEndpoint.html),\nspecifying GET_HLS_STREAMING_SESSION_URL for the APIName parameter.\n * Retrieve the HLS URL using GetHLSStreamingSessionURL. Kinesis Video Streams\ncreates an HLS streaming session to be used for accessing content in a stream\nusing the HLS protocol. GetHLSStreamingSessionURL returns an authenticated URL\n(that includes an encrypted session token) for the session's HLS master playlist\n(the root resource needed for streaming with HLS).\n Don't share or store this token where an unauthorized entity could access it.\nThe token provides access to the content of the stream. Safeguard the token with\nthe same measures that you would use with your AWS credentials.\n The media that is made available through the playlist consists only of the\nrequested stream, time range, and format. No other media data (such as frames\noutside the requested window or alternate bitrates) is made available.\n * Provide the URL (containing the encrypted session token) for the HLS master\nplaylist to a media player that supports the HLS protocol. Kinesis Video Streams\nmakes the HLS media playlist, initialization fragment, and media fragments\navailable through the master playlist URL. The initialization fragment contains\nthe codec private data for the stream, and other data needed to set up the video\nor audio decoder and renderer. The media fragments contain H.264-encoded video\nframes or AAC-encoded audio samples.\n * The media player receives the authenticated URL and requests stream metadata\nand media data normally. When the media player requests data, it calls the\nfollowing actions:\n * GetHLSMasterPlaylist: Retrieves an HLS master playlist, which contains a URL\nfor the GetHLSMediaPlaylist action for each track, and additional metadata for\nthe media player, including estimated bitrate and resolution.\n * GetHLSMediaPlaylist: Retrieves an HLS media playlist, which contains a URL to\naccess the MP4 initialization fragment with the GetMP4InitFragment action, and\nURLs to access the MP4 media fragments with the GetMP4MediaFragment actions. The\nHLS media playlist also contains metadata about the stream that the player needs\nto play it, such as whether the PlaybackMode is LIVE or ON_DEMAND. The HLS media\nplaylist is typically static for sessions with a PlaybackType of ON_DEMAND. The\nHLS media playlist is continually updated with new fragments for sessions with a\nPlaybackType of LIVE. There is a distinct HLS media playlist for the video track\nand the audio track (if applicable) that contains MP4 media URLs for the\nspecific track.\n * GetMP4InitFragment: Retrieves the MP4 initialization fragment. The media\nplayer typically loads the initialization fragment before loading any media\nfragments. This fragment contains the \"fytp\" and \"moov\" MP4 atoms, and the child\natoms that are needed to initialize the media player decoder.\n The initialization fragment does not correspond to a fragment in a Kinesis\nvideo stream. It contains only the codec private data for the stream and\nrespective track, which the media player needs to decode the media frames.\n * GetMP4MediaFragment: Retrieves MP4 media fragments. These fragments contain\nthe \"moof\" and \"mdat\" MP4 atoms and their child atoms, containing the encoded\nfragment's media frames and their timestamps.\n After the first media fragment is made available in a streaming session, any\nfragments that don't contain the same codec private data cause an error to be\nreturned when those different media fragments are loaded. Therefore, the codec\nprivate data should not change between fragments in a session. This also means\nthat the session fails if the fragments in a stream change from having only\nvideo to having both audio and video.\n Data retrieved with this action is billable. See Pricing\n(https://aws.amazon.com/kinesis/video-streams/pricing/) for details.\n * GetTSFragment: Retrieves MPEG TS fragments containing both initialization and\nmedia data for all tracks in the stream.\n If the ContainerFormat is MPEG_TS, this API is used instead of\nGetMP4InitFragment and GetMP4MediaFragment to retrieve stream media.\n Data retrieved with this action is billable. For more information, see Kinesis\nVideo Streams pricing (https://aws.amazon.com/kinesis/video-streams/pricing/).\n The following restrictions apply to HLS sessions:\n * A streaming session URL should not be shared between players. The service\nmight throttle a session if multiple media players are sharing it. For\nconnection limits, see Kinesis Video Streams Limits\n(http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html).\n * A Kinesis video stream can have a maximum of five active HLS streaming\nsessions. If a new session is created when the maximum number of sessions is\nalready active, the oldest (earliest created) session is closed. The number of\nactive GetMedia connections on a Kinesis video stream does not count against\nthis limit, and the number of active HLS sessions does not count against the\nactive GetMedia connection limit.\n You can monitor the amount of data that the media player consumes by monitoring\nthe GetMP4MediaFragment.OutgoingBytes Amazon CloudWatch metric. For information\nabout using CloudWatch to monitor Kinesis Video Streams, see Monitoring Kinesis\nVideo Streams\n(http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/monitoring.html). For\npricing information, see Amazon Kinesis Video Streams Pricing\n(https://aws.amazon.com/kinesis/video-streams/pricing/) and AWS Pricing\n(https://aws.amazon.com/pricing/). Charges for both HLS sessions and outgoing\nAWS data apply.\n For more information about HLS, see HTTP Live Streaming\n(https://developer.apple.com/streaming/) on the Apple Developer site\n(https://developer.apple.com)." ([] (get-hls-streaming-session-url {})) ([get-hls-streaming-session-url-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-hls-streaming-session-url-input get-hls-streaming-session-url-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis-video-archived-media/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getHLSStreamingSessionURL", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video Archived Media", :http.request.spec/input-spec :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHLSStreamingSessionURL", :http.request.configuration/output-deser-fn response-get-hls-streaming-session-url-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media/not-authorized-exception, "UnsupportedStreamMediaTypeException" :portkey.aws.kinesis-video-archived-media/unsupported-stream-media-type-exception, "NoDataRetentionException" :portkey.aws.kinesis-video-archived-media/no-data-retention-exception, "MissingCodecPrivateDataException" :portkey.aws.kinesis-video-archived-media/missing-codec-private-data-exception, "InvalidCodecPrivateDataException" :portkey.aws.kinesis-video-archived-media/invalid-codec-private-data-exception}})))))
(clojure.spec.alpha/fdef get-hls-streaming-session-url :args (clojure.spec.alpha/? :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-output))

(clojure.core/defn get-media-for-fragment-list "Gets media for a list of fragments (specified by fragment number) from the\narchived data in an Amazon Kinesis video stream.\n You must first call the GetDataEndpoint API to get an endpoint. Then send the\nGetMediaForFragmentList requests to this endpoint using the --endpoint-url\nparameter (https://docs.aws.amazon.com/cli/latest/reference/).\n The following limits apply when using the GetMediaForFragmentList API:\n * A client can call GetMediaForFragmentList up to five times per second per\nstream.\n * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per\nsecond (or 200 megabits per second) during a GetMediaForFragmentList session." ([get-media-for-fragment-list-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-media-for-fragment-list-input get-media-for-fragment-list-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis-video-archived-media/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getMediaForFragmentList", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video Archived Media", :http.request.spec/input-spec :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMediaForFragmentList", :http.request.configuration/output-deser-fn response-get-media-for-fragment-list-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media/not-authorized-exception}})))))
(clojure.spec.alpha/fdef get-media-for-fragment-list :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output))

(clojure.core/defn list-fragments "Returns a list of Fragment objects from the specified stream and timestamp range\nwithin the archived data.\n Listing fragments is eventually consistent. This means that even if the\nproducer receives an acknowledgment that a fragment is persisted, the result\nmight not be returned immediately from a request to ListFragments. However,\nresults are typically available in less than one second.\n You must first call the GetDataEndpoint API to get an endpoint. Then send the\nListFragments requests to this endpoint using the --endpoint-url parameter\n(https://docs.aws.amazon.com/cli/latest/reference/)." ([list-fragments-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-fragments-input list-fragments-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis-video-archived-media/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kinesis-video-archived-media/list-fragments-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listFragments", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video Archived Media", :http.request.spec/input-spec :portkey.aws.kinesis-video-archived-media/list-fragments-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFragments", :http.request.configuration/output-deser-fn response-list-fragments-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media/not-authorized-exception}})))))
(clojure.spec.alpha/fdef list-fragments :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-archived-media/list-fragments-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/list-fragments-output))
