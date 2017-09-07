(ns portkey.aws.xray.-2016-04-12 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "xray", :region "ap-northeast-1"},
    :ssl-common-name "xray.ap-northeast-1.amazonaws.com",
    :endpoint "https://xray.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "xray", :region "eu-west-1"},
    :ssl-common-name "xray.eu-west-1.amazonaws.com",
    :endpoint "https://xray.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "xray", :region "us-east-2"},
    :ssl-common-name "xray.us-east-2.amazonaws.com",
    :endpoint "https://xray.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "xray", :region "ap-southeast-2"},
    :ssl-common-name "xray.ap-southeast-2.amazonaws.com",
    :endpoint "https://xray.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credential-scope {:service "xray", :region "sa-east-1"},
    :ssl-common-name "xray.sa-east-1.amazonaws.com",
    :endpoint "https://xray.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "xray", :region "ap-southeast-1"},
    :ssl-common-name "xray.ap-southeast-1.amazonaws.com",
    :endpoint "https://xray.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "xray", :region "ap-northeast-2"},
    :ssl-common-name "xray.ap-northeast-2.amazonaws.com",
    :endpoint "https://xray.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "xray", :region "ca-central-1"},
    :ssl-common-name "xray.ca-central-1.amazonaws.com",
    :endpoint "https://xray.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "xray", :region "eu-central-1"},
    :ssl-common-name "xray.eu-central-1.amazonaws.com",
    :endpoint "https://xray.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "xray", :region "eu-west-2"},
    :ssl-common-name "xray.eu-west-2.amazonaws.com",
    :endpoint "https://xray.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "xray", :region "us-west-2"},
    :ssl-common-name "xray.us-west-2.amazonaws.com",
    :endpoint "https://xray.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "xray", :region "us-east-1"},
    :ssl-common-name "xray.us-east-1.amazonaws.com",
    :endpoint "https://xray.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "xray", :region "us-west-1"},
    :ssl-common-name "xray.us-west-1.amazonaws.com",
    :endpoint "https://xray.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "xray", :region "ap-south-1"},
    :ssl-common-name "xray.ap-south-1.amazonaws.com",
    :endpoint "https://xray.ap-south-1.amazonaws.com"}})

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-summary-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-summary :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/service :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/throttle-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/error-statistics (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.error-statistics/ThrottleCount :portkey.aws.xray.-2016-04-12.error-statistics/OtherCount :portkey.aws.xray.-2016-04-12.error-statistics/TotalCount]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/segment :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-throttle (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-error (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/duration (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/users (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-users))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/is-partial (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-fault (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-summary (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace-summary/HasThrottle :portkey.aws.xray.-2016-04-12/Annotations :portkey.aws.xray.-2016-04-12/ServiceIds :portkey.aws.xray.-2016-04-12.trace-summary/HasError :portkey.aws.xray.-2016-04-12.trace-summary/ResponseTime :portkey.aws.xray.-2016-04-12/Http :portkey.aws.xray.-2016-04-12.trace-summary/Duration :portkey.aws.xray.-2016-04-12.trace-summary/Users :portkey.aws.xray.-2016-04-12.trace-summary/IsPartial :portkey.aws.xray.-2016-04-12.trace-summary/HasFault :portkey.aws.xray.-2016-04-12.trace-summary/Id]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/number-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/boolean-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/string-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotation-value (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.annotation-value/NumberValue :portkey.aws.xray.-2016-04-12.annotation-value/BooleanValue :portkey.aws.xray.-2016-04-12.annotation-value/StringValue]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/reference-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/summary-statistics (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/edge-statistics))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/response-time-histogram (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/aliases (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/alias-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.edge/ReferenceId :portkey.aws.xray.-2016-04-12.edge/StartTime :portkey.aws.xray.-2016-04-12.edge/EndTime :portkey.aws.xray.-2016-04-12.edge/SummaryStatistics :portkey.aws.xray.-2016-04-12.edge/ResponseTimeHistogram :portkey.aws.xray.-2016-04-12.edge/Aliases]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/histogram (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/histogram-entry :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/sampling (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-summaries-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-request/StartTime :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/EndTime] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-request/Sampling :portkey.aws.xray.-2016-04-12/FilterExpression :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/edge :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/invalid-request-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/duration (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/segments (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace/Id :portkey.aws.xray.-2016-04-12.trace/Duration :portkey.aws.xray.-2016-04-12.trace/Segments]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-telemetry-records-result (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-user/user-name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-user (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace-user/UserName :portkey.aws.xray.-2016-04-12/ServiceIds]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 35 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 35))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotations (clojure.spec.alpha/map-of :portkey.aws.xray.-2016-04-12/annotation-key :portkey.aws.xray.-2016-04-12/values-with-service-ids))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/names (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/alias-names))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.alias/Name :portkey.aws.xray.-2016-04-12.alias/Names :portkey.aws.xray.-2016-04-12.alias/Type]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-service-graph-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.-2016-04-12.get-service-graph-request/StartTime :portkey.aws.xray.-2016-04-12.get-service-graph-request/EndTime] :opt-un [:portkey.aws.xray.-2016-04-12.get-service-graph-request/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/error-code (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/Id :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/ErrorCode :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/Message]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-ids (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/service-id :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/telemetry-record-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/telemetry-record :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/trace-summaries (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-summary-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/approximate-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/traces-processed-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-summaries-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-result/TraceSummaries :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/ApproximateTime :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/TracesProcessedCount :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-statistics (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service-statistics/OkCount :portkey.aws.xray.-2016-04-12/ErrorStatistics :portkey.aws.xray.-2016-04-12/FaultStatistics :portkey.aws.xray.-2016-04-12.service-statistics/TotalCount :portkey.aws.xray.-2016-04-12.service-statistics/TotalResponseTime]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias-names (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/timeout-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/connection-refused-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/httpcode4xxcount (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/httpcode5xxcount (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/unknown-host-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/backend-connection-errors (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.backend-connection-errors/TimeoutCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/ConnectionRefusedCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/HTTPCode4XXCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/HTTPCode5XXCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/UnknownHostCount :portkey.aws.xray.-2016-04-12.backend-connection-errors/OtherCount]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/values-with-service-ids (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/value-with-service-ids :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 0 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.segment/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.segment/document (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-document))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.segment/Id :portkey.aws.xray.-2016-04-12.segment/Document]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.fault-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.fault-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/fault-statistics (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.fault-statistics/OtherCount :portkey.aws.xray.-2016-04-12.fault-statistics/TotalCount]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/names (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/account-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-id (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service-id/Name :portkey.aws.xray.-2016-04-12.service-id/Names :portkey.aws.xray.-2016-04-12.service-id/AccountId :portkey.aws.xray.-2016-04-12.service-id/Type]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-trace-segments-request/trace-segment-documents (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-segment-document-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-trace-segments-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.-2016-04-12.put-trace-segments-request/TraceSegmentDocuments] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/value-with-service-ids (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/AnnotationValue :portkey.aws.xray.-2016-04-12/ServiceIds]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/httpurl (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/http-status (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/http-method (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/user-agent (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/client-ip (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/http (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.http/HttpURL :portkey.aws.xray.-2016-04-12.http/HttpStatus :portkey.aws.xray.-2016-04-12.http/HttpMethod :portkey.aws.xray.-2016-04-12.http/UserAgent :portkey.aws.xray.-2016-04-12.http/ClientIp]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-names (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/batch-get-traces-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-request/TraceIds] :opt-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-request/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-segment-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/alias :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotation-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-trace-segments-result/unprocessed-trace-segments (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-trace-segments-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.put-trace-segments-result/UnprocessedTraceSegments]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-telemetry-records-request/telemetry-records (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/telemetry-record-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-telemetry-records-request/ec2-instance-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-telemetry-records-request/hostname (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-telemetry-records-request/resourcearn (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-telemetry-records-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.-2016-04-12.put-telemetry-records-request/TelemetryRecords] :opt-un [:portkey.aws.xray.-2016-04-12.put-telemetry-records-request/EC2InstanceId :portkey.aws.xray.-2016-04-12.put-telemetry-records-request/Hostname :portkey.aws.xray.-2016-04-12.put-telemetry-records-request/ResourceARN]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-graph-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-result/Services :portkey.aws.xray.-2016-04-12.get-trace-graph-result/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-id-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-id :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 16 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 16))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-users (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-user :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-segment-document-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-segment-document :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-received-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-sent-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-spillover-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-rejected-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/telemetry-record (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/Timestamp :portkey.aws.xray.-2016-04-12.telemetry-record/SegmentsReceivedCount :portkey.aws.xray.-2016-04-12.telemetry-record/SegmentsSentCount :portkey.aws.xray.-2016-04-12.telemetry-record/SegmentsSpilloverCount :portkey.aws.xray.-2016-04-12.telemetry-record/SegmentsRejectedCount :portkey.aws.xray.-2016-04-12/BackendConnectionErrors]))

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
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service/EndTime :portkey.aws.xray.-2016-04-12.service/Type :portkey.aws.xray.-2016-04-12.service/ReferenceId :portkey.aws.xray.-2016-04-12.service/ResponseTimeHistogram :portkey.aws.xray.-2016-04-12.service/StartTime :portkey.aws.xray.-2016-04-12.service/SummaryStatistics :portkey.aws.xray.-2016-04-12.service/Root :portkey.aws.xray.-2016-04-12.service/Names :portkey.aws.xray.-2016-04-12.service/DurationHistogram :portkey.aws.xray.-2016-04-12.service/Edges :portkey.aws.xray.-2016-04-12.service/AccountId :portkey.aws.xray.-2016-04-12.service/State :portkey.aws.xray.-2016-04-12.service/Name]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-service-graph-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-service-graph-result/StartTime :portkey.aws.xray.-2016-04-12.get-service-graph-result/EndTime :portkey.aws.xray.-2016-04-12.get-service-graph-result/Services :portkey.aws.xray.-2016-04-12.get-service-graph-result/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/traces (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/unprocessed-trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/unprocessed-trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/batch-get-traces-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-result/Traces :portkey.aws.xray.-2016-04-12.batch-get-traces-result/UnprocessedTraceIds :portkey.aws.xray.-2016-04-12.batch-get-traces-result/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge-statistics (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.edge-statistics/OkCount :portkey.aws.xray.-2016-04-12/ErrorStatistics :portkey.aws.xray.-2016-04-12/FaultStatistics :portkey.aws.xray.-2016-04-12.edge-statistics/TotalCount :portkey.aws.xray.-2016-04-12.edge-statistics/TotalResponseTime]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-id-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-id :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/throttled-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__)))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-graph-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-request/TraceIds] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-request/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.histogram-entry/value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.histogram-entry/count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/histogram-entry (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.histogram-entry/Value :portkey.aws.xray.-2016-04-12.histogram-entry/Count]))

(clojure.core/defn batch-get-traces ([input__56767__auto__] (batch-get-traces input__56767__auto__ portkey.aws/*http-client*)) ([input58488 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.xray.-2016-04-12/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/Traces"), :body (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/BatchGetTracesRequest input58488)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58487] (clojure.core/let [errors__56772__auto__ {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}] (if (clojure.core/= nil (:status response58487)) (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/batch-get-traces-result (:body response58487)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58487 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58487)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58487})))))))))))

(clojure.core/defn get-service-graph ([input__56767__auto__] (get-service-graph input__56767__auto__ portkey.aws/*http-client*)) ([input58490 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.xray.-2016-04-12/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/ServiceGraph"), :body (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/GetServiceGraphRequest input58490)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58489] (clojure.core/let [errors__56772__auto__ {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}] (if (clojure.core/= nil (:status response58489)) (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/get-service-graph-result (:body response58489)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58489 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58489)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58489})))))))))))

(clojure.core/defn get-trace-graph ([input__56767__auto__] (get-trace-graph input__56767__auto__ portkey.aws/*http-client*)) ([input58492 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.xray.-2016-04-12/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/TraceGraph"), :body (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/GetTraceGraphRequest input58492)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58491] (clojure.core/let [errors__56772__auto__ {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}] (if (clojure.core/= nil (:status response58491)) (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/get-trace-graph-result (:body response58491)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58491 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58491)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58491})))))))))))

(clojure.core/defn get-trace-summaries ([input__56767__auto__] (get-trace-summaries input__56767__auto__ portkey.aws/*http-client*)) ([input58494 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.xray.-2016-04-12/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/TraceSummaries"), :body (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/GetTraceSummariesRequest input58494)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58493] (clojure.core/let [errors__56772__auto__ {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}] (if (clojure.core/= nil (:status response58493)) (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/get-trace-summaries-result (:body response58493)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58493 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58493)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58493})))))))))))

(clojure.core/defn put-telemetry-records ([input__56767__auto__] (put-telemetry-records input__56767__auto__ portkey.aws/*http-client*)) ([input58496 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.xray.-2016-04-12/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/TelemetryRecords"), :body (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/PutTelemetryRecordsRequest input58496)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58495] (clojure.core/let [errors__56772__auto__ {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}] (if (clojure.core/= nil (:status response58495)) (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/put-telemetry-records-result (:body response58495)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58495 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58495)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58495})))))))))))

(clojure.core/defn put-trace-segments ([input__56767__auto__] (put-trace-segments input__56767__auto__ portkey.aws/*http-client*)) ([input58498 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.xray.-2016-04-12/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/TraceSegments"), :body (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/PutTraceSegmentsRequest input58498)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58497] (clojure.core/let [errors__56772__auto__ {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}] (if (clojure.core/= nil (:status response58497)) (clojure.spec.alpha/unform :portkey.aws.xray.-2016-04-12/put-trace-segments-result (:body response58497)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58497 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58497)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58497})))))))))))
