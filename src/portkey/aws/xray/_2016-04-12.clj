(ns portkey.aws.xray.-2016-04-12 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "xray", :region "ap-northeast-1"},
    :ssl-common-name "xray.ap-northeast-1.amazonaws.com",
    :endpoint "https://xray.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "xray", :region "eu-west-1"},
    :ssl-common-name "xray.eu-west-1.amazonaws.com",
    :endpoint "https://xray.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "xray", :region "us-east-2"},
    :ssl-common-name "xray.us-east-2.amazonaws.com",
    :endpoint "https://xray.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "xray", :region "ap-southeast-2"},
    :ssl-common-name "xray.ap-southeast-2.amazonaws.com",
    :endpoint "https://xray.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "xray", :region "sa-east-1"},
    :ssl-common-name "xray.sa-east-1.amazonaws.com",
    :endpoint "https://xray.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "xray", :region "ap-southeast-1"},
    :ssl-common-name "xray.ap-southeast-1.amazonaws.com",
    :endpoint "https://xray.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "xray", :region "ap-northeast-2"},
    :ssl-common-name "xray.ap-northeast-2.amazonaws.com",
    :endpoint "https://xray.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "xray", :region "ca-central-1"},
    :ssl-common-name "xray.ca-central-1.amazonaws.com",
    :endpoint "https://xray.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "xray", :region "eu-central-1"},
    :ssl-common-name "xray.eu-central-1.amazonaws.com",
    :endpoint "https://xray.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "xray", :region "eu-west-2"},
    :ssl-common-name "xray.eu-west-2.amazonaws.com",
    :endpoint "https://xray.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "xray", :region "us-west-2"},
    :ssl-common-name "xray.us-west-2.amazonaws.com",
    :endpoint "https://xray.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "xray", :region "us-east-1"},
    :ssl-common-name "xray.us-east-1.amazonaws.com",
    :endpoint "https://xray.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "xray", :region "us-west-1"},
    :ssl-common-name "xray.us-west-1.amazonaws.com",
    :endpoint "https://xray.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "xray", :region "ap-south-1"},
    :ssl-common-name "xray.ap-south-1.amazonaws.com",
    :endpoint "https://xray.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-summary-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/service) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/throttle-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/error-statistics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.error-statistics/ThrottleCount :portkey.aws.xray.-2016-04-12.error-statistics/OtherCount :portkey.aws.xray.-2016-04-12.error-statistics/TotalCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/segment) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-throttle (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-error (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/duration (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/users (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-users))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/is-partial (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-fault (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace-summary/HasThrottle :portkey.aws.xray.-2016-04-12/Annotations :portkey.aws.xray.-2016-04-12/ServiceIds :portkey.aws.xray.-2016-04-12.trace-summary/HasError :portkey.aws.xray.-2016-04-12.trace-summary/ResponseTime :portkey.aws.xray.-2016-04-12/Http :portkey.aws.xray.-2016-04-12.trace-summary/Duration :portkey.aws.xray.-2016-04-12.trace-summary/Users :portkey.aws.xray.-2016-04-12.trace-summary/IsPartial :portkey.aws.xray.-2016-04-12.trace-summary/HasFault :portkey.aws.xray.-2016-04-12.trace-summary/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/number-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/boolean-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/string-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotation-value (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.annotation-value/NumberValue :portkey.aws.xray.-2016-04-12.annotation-value/BooleanValue :portkey.aws.xray.-2016-04-12.annotation-value/StringValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/reference-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/summary-statistics (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/edge-statistics))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/response-time-histogram (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/aliases (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/alias-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.edge/ReferenceId :portkey.aws.xray.-2016-04-12.edge/StartTime :portkey.aws.xray.-2016-04-12.edge/EndTime :portkey.aws.xray.-2016-04-12.edge/SummaryStatistics :portkey.aws.xray.-2016-04-12.edge/ResponseTimeHistogram :portkey.aws.xray.-2016-04-12.edge/Aliases] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/histogram (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/histogram-entry) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/sampling (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-summaries-request (portkey.aws/json-keys :req-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-request/StartTime :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/EndTime] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-request/Sampling :portkey.aws.xray.-2016-04-12/FilterExpression :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/edge) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/error-message))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.invalid-request-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/encryption-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 3000))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/duration (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/segments (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace/Id :portkey.aws.xray.-2016-04-12.trace/Duration :portkey.aws.xray.-2016-04-12.trace/Segments] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-encryption-config-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/EncryptionConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-telemetry-records-result (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-user/user-name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-user (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace-user/UserName :portkey.aws.xray.-2016-04-12/ServiceIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 35))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotations (clojure.spec.alpha/map-of :portkey.aws.xray.-2016-04-12/annotation-key :portkey.aws.xray.-2016-04-12/values-with-service-ids))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/names (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/alias-names))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.alias/Name :portkey.aws.xray.-2016-04-12.alias/Names :portkey.aws.xray.-2016-04-12.alias/Type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/encryption-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"UPDATING" "UPDATING", :updating "UPDATING", "ACTIVE" "ACTIVE", :active "ACTIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-service-graph-request (portkey.aws/json-keys :req-un [:portkey.aws.xray.-2016-04-12.get-service-graph-request/StartTime :portkey.aws.xray.-2016-04-12.get-service-graph-request/EndTime] :opt-un [:portkey.aws.xray.-2016-04-12.get-service-graph-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/error-code (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/Id :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/ErrorCode :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/service-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/telemetry-record-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/telemetry-record) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/trace-summaries (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-summary-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/approximate-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/traces-processed-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-summaries-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-result/TraceSummaries :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/ApproximateTime :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/TracesProcessedCount :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/encryption-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"NONE" "NONE", :none "NONE", "KMS" "KMS", :kms "KMS"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-statistics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service-statistics/OkCount :portkey.aws.xray.-2016-04-12/ErrorStatistics :portkey.aws.xray.-2016-04-12/FaultStatistics :portkey.aws.xray.-2016-04-12.service-statistics/TotalCount :portkey.aws.xray.-2016-04-12.service-statistics/TotalResponseTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias-names (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/timeout-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/connection-refused-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/httpcode4xxcount (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/httpcode5xxcount (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/unknown-host-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/backend-connection-errors (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.backend-connection-errors/TimeoutCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/ConnectionRefusedCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/HTTPCode4XXCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/HTTPCode5XXCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/UnknownHostCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/OtherCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/values-with-service-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/value-with-service-ids) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.segment/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.segment/document (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-document))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.segment/Id :portkey.aws.xray.-2016-04-12.segment/Document] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.fault-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.fault-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/fault-statistics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.fault-statistics/OtherCount :portkey.aws.xray.-2016-04-12.fault-statistics/TotalCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/names (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/account-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-id (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service-id/Name :portkey.aws.xray.-2016-04-12.service-id/Names :portkey.aws.xray.-2016-04-12.service-id/AccountId :portkey.aws.xray.-2016-04-12.service-id/Type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-trace-segments-request/trace-segment-documents (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-segment-document-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-trace-segments-request (portkey.aws/json-keys :req-un [:portkey.aws.xray.-2016-04-12.put-trace-segments-request/TraceSegmentDocuments] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/value-with-service-ids (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/AnnotationValue :portkey.aws.xray.-2016-04-12/ServiceIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/httpurl (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/http-status (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/http-method (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/user-agent (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/client-ip (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/http (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.http/HttpURL :portkey.aws.xray.-2016-04-12.http/HttpStatus :portkey.aws.xray.-2016-04-12.http/HttpMethod :portkey.aws.xray.-2016-04-12.http/UserAgent :portkey.aws.xray.-2016-04-12.http/ClientIp] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-names (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-encryption-config-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/EncryptionConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/batch-get-traces-request (portkey.aws/json-keys :req-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-request/TraceIds] :opt-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-segment-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/alias) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotation-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/ec2-instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-trace-segments-result/unprocessed-trace-segments (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-trace-segments-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.put-trace-segments-result/UnprocessedTraceSegments] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-telemetry-records-request/telemetry-records (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/telemetry-record-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-telemetry-records-request (portkey.aws/json-keys :req-un [:portkey.aws.xray.-2016-04-12.put-telemetry-records-request/TelemetryRecords] :opt-un [:portkey.aws.xray.-2016-04-12/EC2InstanceId :portkey.aws.xray.-2016-04-12/Hostname :portkey.aws.xray.-2016-04-12/ResourceARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-graph-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-result/Services :portkey.aws.xray.-2016-04-12.get-trace-graph-result/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-id-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-encryption-config-request/key-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/encryption-key-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-encryption-config-request/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/encryption-type))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-encryption-config-request (portkey.aws/json-keys :req-un [:portkey.aws.xray.-2016-04-12.put-encryption-config-request/Type] :opt-un [:portkey.aws.xray.-2016-04-12.put-encryption-config-request/KeyId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-users (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-user) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-segment-document-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-segment-document) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-received-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-sent-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-spillover-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-rejected-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/telemetry-record (portkey.aws/json-keys :req-un [:portkey.aws.xray.-2016-04-12/Timestamp] :opt-un [:portkey.aws.xray.-2016-04-12.telemetry-record/SegmentsReceivedCount :portkey.aws.xray.-2016-04-12.telemetry-record/SegmentsSentCount :portkey.aws.xray.-2016-04-12.telemetry-record/SegmentsSpilloverCount :portkey.aws.xray.-2016-04-12.telemetry-record/SegmentsRejectedCount :portkey.aws.xray.-2016-04-12/BackendConnectionErrors] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/reference-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/response-time-histogram (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/summary-statistics (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-statistics))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/root (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/names (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/duration-histogram (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/edges (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/edge-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/account-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/state (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service/name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service/EndTime :portkey.aws.xray.-2016-04-12.service/Type :portkey.aws.xray.-2016-04-12.service/ReferenceId :portkey.aws.xray.-2016-04-12.service/ResponseTimeHistogram :portkey.aws.xray.-2016-04-12.service/StartTime :portkey.aws.xray.-2016-04-12.service/SummaryStatistics :portkey.aws.xray.-2016-04-12.service/Root :portkey.aws.xray.-2016-04-12.service/Names :portkey.aws.xray.-2016-04-12.service/DurationHistogram :portkey.aws.xray.-2016-04-12.service/Edges :portkey.aws.xray.-2016-04-12.service/AccountId :portkey.aws.xray.-2016-04-12.service/State :portkey.aws.xray.-2016-04-12.service/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-service-graph-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-service-graph-result/StartTime :portkey.aws.xray.-2016-04-12.get-service-graph-result/EndTime :portkey.aws.xray.-2016-04-12.get-service-graph-result/Services :portkey.aws.xray.-2016-04-12.get-service-graph-result/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/traces (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/unprocessed-trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/unprocessed-trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/batch-get-traces-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-result/Traces :portkey.aws.xray.-2016-04-12.batch-get-traces-result/UnprocessedTraceIds :portkey.aws.xray.-2016-04-12.batch-get-traces-result/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.encryption-config/key-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.encryption-config/status (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/encryption-status))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.encryption-config/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/encryption-type))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/encryption-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.encryption-config/KeyId :portkey.aws.xray.-2016-04-12.encryption-config/Status :portkey.aws.xray.-2016-04-12.encryption-config/Type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge-statistics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.edge-statistics/OkCount :portkey.aws.xray.-2016-04-12/ErrorStatistics :portkey.aws.xray.-2016-04-12/FaultStatistics :portkey.aws.xray.-2016-04-12.edge-statistics/TotalCount :portkey.aws.xray.-2016-04-12.edge-statistics/TotalResponseTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-id-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/resourcearn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/error-message))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/throttled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.throttled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-encryption-config-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__)))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-graph-request (portkey.aws/json-keys :req-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-request/TraceIds] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.histogram-entry/value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.histogram-entry/count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/histogram-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.histogram-entry/Value :portkey.aws.xray.-2016-04-12.histogram-entry/Count] :locations {}))

(clojure.core/defn batch-get-traces "Retrieves a list of traces specified by ID. Each trace is a collection of\nsegment documents that originates from a single request. Use GetTraceSummaries\nto get a list of trace IDs." ([batch-get-traces-request] (portkey.aws/-rest-json-call portkey.aws.xray.-2016-04-12/endpoints "POST" "/Traces" batch-get-traces-request :portkey.aws.xray.-2016-04-12/batch-get-traces-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.xray.-2016-04-12/batch-get-traces-result {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception})))
(clojure.spec.alpha/fdef batch-get-traces :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/batch-get-traces-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/batch-get-traces-result))

(clojure.core/defn get-encryption-config "Retrieves the current encryption configuration for X-Ray data." ([] (get-encryption-config {})) ([get-encryption-config-request] (portkey.aws/-rest-json-call portkey.aws.xray.-2016-04-12/endpoints "POST" "/EncryptionConfig" get-encryption-config-request :portkey.aws.xray.-2016-04-12/get-encryption-config-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.xray.-2016-04-12/get-encryption-config-result {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception})))
(clojure.spec.alpha/fdef get-encryption-config :args (clojure.spec.alpha/? :portkey.aws.xray.-2016-04-12/get-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-encryption-config-result))

(clojure.core/defn get-service-graph "Retrieves a document that describes services that process incoming requests, and\ndownstream services that they call as a result. Root services process incoming\nrequests and make calls to downstream services. Root services are applications\nthat use the AWS X-Ray SDK. Downstream services can be other applications, AWS\nresources, HTTP web APIs, or SQL databases." ([get-service-graph-request] (portkey.aws/-rest-json-call portkey.aws.xray.-2016-04-12/endpoints "POST" "/ServiceGraph" get-service-graph-request :portkey.aws.xray.-2016-04-12/get-service-graph-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.xray.-2016-04-12/get-service-graph-result {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception})))
(clojure.spec.alpha/fdef get-service-graph :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/get-service-graph-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-service-graph-result))

(clojure.core/defn get-trace-graph "Retrieves a service graph for one or more specific trace IDs." ([get-trace-graph-request] (portkey.aws/-rest-json-call portkey.aws.xray.-2016-04-12/endpoints "POST" "/TraceGraph" get-trace-graph-request :portkey.aws.xray.-2016-04-12/get-trace-graph-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.xray.-2016-04-12/get-trace-graph-result {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception})))
(clojure.spec.alpha/fdef get-trace-graph :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/get-trace-graph-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-trace-graph-result))

(clojure.core/defn get-trace-summaries "Retrieves IDs and metadata for traces available for a specified time frame using\nan optional filter. To get the full traces, pass the trace IDs to\nBatchGetTraces.\n A filter expression can target traced requests that hit specific service nodes\nor edges, have errors, or come from a known user. For example, the following\nfilter expression targets traces that pass through api.example.com:\n service(\"api.example.com\")\n This filter expression finds traces that have an annotation named account with\nthe value 12345:\n annotation.account = \"12345\"\n For a full list of indexed fields and keywords that you can use in filter\nexpressions, see Using Filter Expressions\n(http://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html) in\nthe AWS X-Ray Developer Guide." ([get-trace-summaries-request] (portkey.aws/-rest-json-call portkey.aws.xray.-2016-04-12/endpoints "POST" "/TraceSummaries" get-trace-summaries-request :portkey.aws.xray.-2016-04-12/get-trace-summaries-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.xray.-2016-04-12/get-trace-summaries-result {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception})))
(clojure.spec.alpha/fdef get-trace-summaries :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/get-trace-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-trace-summaries-result))

(clojure.core/defn put-encryption-config "Updates the encryption configuration for X-Ray data." ([put-encryption-config-request] (portkey.aws/-rest-json-call portkey.aws.xray.-2016-04-12/endpoints "POST" "/PutEncryptionConfig" put-encryption-config-request :portkey.aws.xray.-2016-04-12/put-encryption-config-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.xray.-2016-04-12/put-encryption-config-result {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception})))
(clojure.spec.alpha/fdef put-encryption-config :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/put-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/put-encryption-config-result))

(clojure.core/defn put-telemetry-records "Used by the AWS X-Ray daemon to upload telemetry." ([put-telemetry-records-request] (portkey.aws/-rest-json-call portkey.aws.xray.-2016-04-12/endpoints "POST" "/TelemetryRecords" put-telemetry-records-request :portkey.aws.xray.-2016-04-12/put-telemetry-records-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.xray.-2016-04-12/put-telemetry-records-result {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception})))
(clojure.spec.alpha/fdef put-telemetry-records :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/put-telemetry-records-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/put-telemetry-records-result))

(clojure.core/defn put-trace-segments "Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment\ndocuments and sends them to the X-Ray daemon, which uploads them in batches. A\nsegment document can be a completed segment, an in-progress segment, or an array\nof subsegments.\n Segments must include the following fields. For the full segment document\nschema, see AWS X-Ray Segment Documents\n(https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html)\nin the AWS X-Ray Developer Guide.\n Required Segment Document Fields\n * name - The name of the service that handled the request.\n * id - A 64-bit identifier for the segment, unique among segments in the same\ntrace, in 16 hexadecimal digits.\n * trace_id - A unique identifier that connects all segments and subsegments\noriginating from a single client request.\n * start_time - Time the segment or subsegment was created, in floating point\nseconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or\n1.480615200010E9.\n * end_time - Time the segment or subsegment was closed. For example,\n1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.\n * in_progress - Set to true instead of specifying an end_time to record that a\nsegment has been started, but is not complete. Send an in progress segment when\nyour application receives a request that will take a long time to serve, to\ntrace the fact that the request was received. When the response is sent, send\nthe complete segment to overwrite the in-progress segment.\n A trace_id consists of three numbers separated by hyphens. For example,\n1-58406520-a006649127e371903a2de979. This includes:\n Trace ID Format\n * The version number, i.e. 1.\n * The time of the original request, in Unix epoch time, in 8 hexadecimal\ndigits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200\nseconds, or 58406520 in hexadecimal.\n * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits." ([put-trace-segments-request] (portkey.aws/-rest-json-call portkey.aws.xray.-2016-04-12/endpoints "POST" "/TraceSegments" put-trace-segments-request :portkey.aws.xray.-2016-04-12/put-trace-segments-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.xray.-2016-04-12/put-trace-segments-result {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception})))
(clojure.spec.alpha/fdef put-trace-segments :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/put-trace-segments-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/put-trace-segments-result))
