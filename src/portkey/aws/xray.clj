(ns portkey.aws.xray (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "xray", "region" "ap-northeast-1"},
    :sslCommonName "xray.ap-northeast-1.amazonaws.com",
    :endpoint "https://xray.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "xray", "region" "eu-west-1"},
    :sslCommonName "xray.eu-west-1.amazonaws.com",
    :endpoint "https://xray.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "xray", "region" "us-east-2"},
    :sslCommonName "xray.us-east-2.amazonaws.com",
    :endpoint "https://xray.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "xray", "region" "ap-southeast-2"},
    :sslCommonName "xray.ap-southeast-2.amazonaws.com",
    :endpoint "https://xray.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "xray", "region" "sa-east-1"},
    :sslCommonName "xray.sa-east-1.amazonaws.com",
    :endpoint "https://xray.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "xray", "region" "ap-southeast-1"},
    :sslCommonName "xray.ap-southeast-1.amazonaws.com",
    :endpoint "https://xray.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "xray", "region" "ap-northeast-2"},
    :sslCommonName "xray.ap-northeast-2.amazonaws.com",
    :endpoint "https://xray.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "xray", "region" "ca-central-1"},
    :sslCommonName "xray.ca-central-1.amazonaws.com",
    :endpoint "https://xray.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "xray", "region" "eu-central-1"},
    :sslCommonName "xray.eu-central-1.amazonaws.com",
    :endpoint "https://xray.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "xray", "region" "eu-west-2"},
    :sslCommonName "xray.eu-west-2.amazonaws.com",
    :endpoint "https://xray.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "xray", "region" "us-west-2"},
    :sslCommonName "xray.us-west-2.amazonaws.com",
    :endpoint "https://xray.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "xray", "region" "us-east-1"},
    :sslCommonName "xray.us-east-1.amazonaws.com",
    :endpoint "https://xray.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "xray", "region" "us-west-1"},
    :sslCommonName "xray.us-west-1.amazonaws.com",
    :endpoint "https://xray.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "xray", "region" "ap-south-1"},
    :sslCommonName "xray.ap-south-1.amazonaws.com",
    :endpoint "https://xray.ap-south-1.amazonaws.com"}})

(clojure.spec.alpha/def :portkey.aws.xray/trace-summary-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-summary :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/service-list (clojure.spec.alpha/coll-of :portkey.aws.xray/service :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.error-statistics/throttle-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.error-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.error-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray/error-statistics (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.error-statistics/ThrottleCount :portkey.aws.xray.error-statistics/OtherCount :portkey.aws.xray.error-statistics/TotalCount]))

(clojure.spec.alpha/def :portkey.aws.xray/segment-list (clojure.spec.alpha/coll-of :portkey.aws.xray/segment :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/has-throttle (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/has-error (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/response-time (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/duration (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/users (clojure.spec.alpha/and :portkey.aws.xray/trace-users))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/is-partial (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/has-fault (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/id (clojure.spec.alpha/and :portkey.aws.xray/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray/trace-summary (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.trace-summary/HasThrottle :portkey.aws.xray/Annotations :portkey.aws.xray/ServiceIds :portkey.aws.xray.trace-summary/HasError :portkey.aws.xray.trace-summary/ResponseTime :portkey.aws.xray/Http :portkey.aws.xray.trace-summary/Duration :portkey.aws.xray.trace-summary/Users :portkey.aws.xray.trace-summary/IsPartial :portkey.aws.xray.trace-summary/HasFault :portkey.aws.xray.trace-summary/Id]))

(clojure.spec.alpha/def :portkey.aws.xray.annotation-value/number-value (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.annotation-value/boolean-value (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.annotation-value/string-value (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/annotation-value (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.annotation-value/NumberValue :portkey.aws.xray.annotation-value/BooleanValue :portkey.aws.xray.annotation-value/StringValue]))

(clojure.spec.alpha/def :portkey.aws.xray/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.edge/reference-id (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.edge/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.edge/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.edge/summary-statistics (clojure.spec.alpha/and :portkey.aws.xray/edge-statistics))
(clojure.spec.alpha/def :portkey.aws.xray.edge/response-time-histogram (clojure.spec.alpha/and :portkey.aws.xray/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.edge/aliases (clojure.spec.alpha/and :portkey.aws.xray/alias-list))
(clojure.spec.alpha/def :portkey.aws.xray/edge (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.edge/ReferenceId :portkey.aws.xray.edge/StartTime :portkey.aws.xray.edge/EndTime :portkey.aws.xray.edge/SummaryStatistics :portkey.aws.xray.edge/ResponseTimeHistogram :portkey.aws.xray.edge/Aliases]))

(clojure.spec.alpha/def :portkey.aws.xray/histogram (clojure.spec.alpha/coll-of :portkey.aws.xray/histogram-entry :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/trace-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-request/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-request/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-request/sampling (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-trace-summaries-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.get-trace-summaries-request/StartTime :portkey.aws.xray.get-trace-summaries-request/EndTime] :opt-un [:portkey.aws.xray.get-trace-summaries-request/Sampling :portkey.aws.xray/FilterExpression :portkey.aws.xray.get-trace-summaries-request/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray/edge-list (clojure.spec.alpha/coll-of :portkey.aws.xray/edge :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/invalid-request-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.trace/id (clojure.spec.alpha/and :portkey.aws.xray/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray.trace/duration (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.trace/segments (clojure.spec.alpha/and :portkey.aws.xray/segment-list))
(clojure.spec.alpha/def :portkey.aws.xray/trace (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.trace/Id :portkey.aws.xray.trace/Duration :portkey.aws.xray.trace/Segments]))

(clojure.spec.alpha/def :portkey.aws.xray/put-telemetry-records-result (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.trace-user/user-name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/trace-user (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.trace-user/UserName :portkey.aws.xray/ServiceIds]))

(clojure.spec.alpha/def :portkey.aws.xray/unprocessed-trace-segment-list (clojure.spec.alpha/coll-of :portkey.aws.xray/unprocessed-trace-segment :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/trace-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 35 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 35))))

(clojure.spec.alpha/def :portkey.aws.xray/annotations (clojure.spec.alpha/map-of :portkey.aws.xray/annotation-key :portkey.aws.xray/values-with-service-ids))

(clojure.spec.alpha/def :portkey.aws.xray.alias/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.alias/names (clojure.spec.alpha/and :portkey.aws.xray/alias-names))
(clojure.spec.alpha/def :portkey.aws.xray.alias/type (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/alias (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.alias/Name :portkey.aws.xray.alias/Names :portkey.aws.xray.alias/Type]))

(clojure.spec.alpha/def :portkey.aws.xray/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-request/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-request/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-service-graph-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.get-service-graph-request/StartTime :portkey.aws.xray.get-service-graph-request/EndTime] :opt-un [:portkey.aws.xray.get-service-graph-request/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-trace-segment/id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-trace-segment/error-code (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-trace-segment/message (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/unprocessed-trace-segment (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.unprocessed-trace-segment/Id :portkey.aws.xray.unprocessed-trace-segment/ErrorCode :portkey.aws.xray.unprocessed-trace-segment/Message]))

(clojure.spec.alpha/def :portkey.aws.xray/service-ids (clojure.spec.alpha/coll-of :portkey.aws.xray/service-id :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/telemetry-record-list (clojure.spec.alpha/coll-of :portkey.aws.xray/telemetry-record :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-result/trace-summaries (clojure.spec.alpha/and :portkey.aws.xray/trace-summary-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-result/approximate-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-result/traces-processed-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-trace-summaries-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.get-trace-summaries-result/TraceSummaries :portkey.aws.xray.get-trace-summaries-result/ApproximateTime :portkey.aws.xray.get-trace-summaries-result/TracesProcessedCount :portkey.aws.xray.get-trace-summaries-result/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.service-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.service-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.service-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray/service-statistics (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.service-statistics/OkCount :portkey.aws.xray/ErrorStatistics :portkey.aws.xray/FaultStatistics :portkey.aws.xray.service-statistics/TotalCount :portkey.aws.xray.service-statistics/TotalResponseTime]))

(clojure.spec.alpha/def :portkey.aws.xray/alias-names (clojure.spec.alpha/coll-of :portkey.aws.xray/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/timeout-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/connection-refused-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/httpcode4xxcount (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/httpcode5xxcount (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/unknown-host-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/other-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray/backend-connection-errors (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.backend-connection-errors/TimeoutCount :portkey.aws.xray.backend-connection-errors/ConnectionRefusedCount :portkey.aws.xray.backend-connection-errors/HTTPCode4XXCount :portkey.aws.xray.backend-connection-errors/HTTPCode5XXCount :portkey.aws.xray.backend-connection-errors/UnknownHostCount :portkey.aws.xray.backend-connection-errors/OtherCount]))

(clojure.spec.alpha/def :portkey.aws.xray/values-with-service-ids (clojure.spec.alpha/coll-of :portkey.aws.xray/value-with-service-ids :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 0 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.xray.segment/id (clojure.spec.alpha/and :portkey.aws.xray/segment-id))
(clojure.spec.alpha/def :portkey.aws.xray.segment/document (clojure.spec.alpha/and :portkey.aws.xray/segment-document))
(clojure.spec.alpha/def :portkey.aws.xray/segment (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.segment/Id :portkey.aws.xray.segment/Document]))

(clojure.spec.alpha/def :portkey.aws.xray.fault-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.fault-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray/fault-statistics (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.fault-statistics/OtherCount :portkey.aws.xray.fault-statistics/TotalCount]))

(clojure.spec.alpha/def :portkey.aws.xray.service-id/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.service-id/names (clojure.spec.alpha/and :portkey.aws.xray/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.service-id/account-id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.service-id/type (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/service-id (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.service-id/Name :portkey.aws.xray.service-id/Names :portkey.aws.xray.service-id/AccountId :portkey.aws.xray.service-id/Type]))

(clojure.spec.alpha/def :portkey.aws.xray.put-trace-segments-request/trace-segment-documents (clojure.spec.alpha/and :portkey.aws.xray/trace-segment-document-list))
(clojure.spec.alpha/def :portkey.aws.xray/put-trace-segments-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.put-trace-segments-request/TraceSegmentDocuments] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray/value-with-service-ids (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray/AnnotationValue :portkey.aws.xray/ServiceIds]))

(clojure.spec.alpha/def :portkey.aws.xray/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.xray.http/httpurl (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.http/http-status (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.http/http-method (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.http/user-agent (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.http/client-ip (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/http (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.http/HttpURL :portkey.aws.xray.http/HttpStatus :portkey.aws.xray.http/HttpMethod :portkey.aws.xray.http/UserAgent :portkey.aws.xray.http/ClientIp]))

(clojure.spec.alpha/def :portkey.aws.xray/service-names (clojure.spec.alpha/coll-of :portkey.aws.xray/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/batch-get-traces-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.batch-get-traces-request/TraceIds] :opt-un [:portkey.aws.xray.batch-get-traces-request/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray/trace-segment-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray/alias-list (clojure.spec.alpha/coll-of :portkey.aws.xray/alias :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/annotation-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.put-trace-segments-result/unprocessed-trace-segments (clojure.spec.alpha/and :portkey.aws.xray/unprocessed-trace-segment-list))
(clojure.spec.alpha/def :portkey.aws.xray/put-trace-segments-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.put-trace-segments-result/UnprocessedTraceSegments]))

(clojure.spec.alpha/def :portkey.aws.xray/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.xray/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.put-telemetry-records-request/telemetry-records (clojure.spec.alpha/and :portkey.aws.xray/telemetry-record-list))
(clojure.spec.alpha/def :portkey.aws.xray.put-telemetry-records-request/ec2-instance-id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.put-telemetry-records-request/hostname (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.put-telemetry-records-request/resourcearn (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/put-telemetry-records-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.put-telemetry-records-request/TelemetryRecords] :opt-un [:portkey.aws.xray.put-telemetry-records-request/EC2InstanceId :portkey.aws.xray.put-telemetry-records-request/Hostname :portkey.aws.xray.put-telemetry-records-request/ResourceARN]))

(clojure.spec.alpha/def :portkey.aws.xray.get-trace-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-trace-graph-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.get-trace-graph-result/Services :portkey.aws.xray.get-trace-graph-result/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray/unprocessed-trace-id-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-id :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/segment-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 16 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 16))))

(clojure.spec.alpha/def :portkey.aws.xray/trace-users (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-user :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.xray/trace-segment-document-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-segment-document :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray.telemetry-record/segments-received-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.telemetry-record/segments-sent-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.telemetry-record/segments-spillover-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.telemetry-record/segments-rejected-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray/telemetry-record (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray/Timestamp :portkey.aws.xray.telemetry-record/SegmentsReceivedCount :portkey.aws.xray.telemetry-record/SegmentsSentCount :portkey.aws.xray.telemetry-record/SegmentsSpilloverCount :portkey.aws.xray.telemetry-record/SegmentsRejectedCount :portkey.aws.xray/BackendConnectionErrors]))

(clojure.spec.alpha/def :portkey.aws.xray/nullable-integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.xray.service/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.service/type (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.service/reference-id (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.service/response-time-histogram (clojure.spec.alpha/and :portkey.aws.xray/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.service/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.service/summary-statistics (clojure.spec.alpha/and :portkey.aws.xray/service-statistics))
(clojure.spec.alpha/def :portkey.aws.xray.service/root (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.service/names (clojure.spec.alpha/and :portkey.aws.xray/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.service/duration-histogram (clojure.spec.alpha/and :portkey.aws.xray/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.service/edges (clojure.spec.alpha/and :portkey.aws.xray/edge-list))
(clojure.spec.alpha/def :portkey.aws.xray.service/account-id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.service/state (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.service/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/service (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.service/EndTime :portkey.aws.xray.service/Type :portkey.aws.xray.service/ReferenceId :portkey.aws.xray.service/ResponseTimeHistogram :portkey.aws.xray.service/StartTime :portkey.aws.xray.service/SummaryStatistics :portkey.aws.xray.service/Root :portkey.aws.xray.service/Names :portkey.aws.xray.service/DurationHistogram :portkey.aws.xray.service/Edges :portkey.aws.xray.service/AccountId :portkey.aws.xray.service/State :portkey.aws.xray.service/Name]))

(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-service-graph-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.get-service-graph-result/StartTime :portkey.aws.xray.get-service-graph-result/EndTime :portkey.aws.xray.get-service-graph-result/Services :portkey.aws.xray.get-service-graph-result/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-result/traces (clojure.spec.alpha/and :portkey.aws.xray/trace-list))
(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-result/unprocessed-trace-ids (clojure.spec.alpha/and :portkey.aws.xray/unprocessed-trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/batch-get-traces-result (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.batch-get-traces-result/Traces :portkey.aws.xray.batch-get-traces-result/UnprocessedTraceIds :portkey.aws.xray.batch-get-traces-result/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray/nullable-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.edge-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.edge-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.edge-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray/edge-statistics (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.edge-statistics/OkCount :portkey.aws.xray/ErrorStatistics :portkey.aws.xray/FaultStatistics :portkey.aws.xray.edge-statistics/TotalCount :portkey.aws.xray.edge-statistics/TotalResponseTime]))

(clojure.spec.alpha/def :portkey.aws.xray/trace-id-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-id :max-count nil))

(clojure.spec.alpha/def :portkey.aws.xray/throttled-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray/segment-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__)))))

(clojure.spec.alpha/def :portkey.aws.xray.get-trace-graph-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-trace-graph-request (portkey.awsgen/json-keys :req-un [:portkey.aws.xray.get-trace-graph-request/TraceIds] :opt-un [:portkey.aws.xray.get-trace-graph-request/NextToken]))

(clojure.spec.alpha/def :portkey.aws.xray.histogram-entry/value (clojure.spec.alpha/and :portkey.aws.xray/double))
(clojure.spec.alpha/def :portkey.aws.xray.histogram-entry/count (clojure.spec.alpha/and :portkey.aws.xray/integer))
(clojure.spec.alpha/def :portkey.aws.xray/histogram-entry (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.xray.histogram-entry/Value :portkey.aws.xray.histogram-entry/Count]))

(clojure.core/defn batch-get-traces ([input__47307__auto__] (batch-get-traces input__47307__auto__ portkey.aws/*http-client*)) ([input48751 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/Traces"), :body (clojure.spec.alpha/unform :portkey.aws.xray/BatchGetTracesRequest input48751)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48750] (clojure.core/let [errors__47310__auto__ {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}] (if (clojure.core/= nil (:status response48750)) (clojure.spec.alpha/unform :portkey.aws.xray/batch-get-traces-result (:body response48750)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48750 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48750)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48750}))))))))))

(clojure.core/defn get-service-graph ([input__47307__auto__] (get-service-graph input__47307__auto__ portkey.aws/*http-client*)) ([input48753 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/ServiceGraph"), :body (clojure.spec.alpha/unform :portkey.aws.xray/GetServiceGraphRequest input48753)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48752] (clojure.core/let [errors__47310__auto__ {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}] (if (clojure.core/= nil (:status response48752)) (clojure.spec.alpha/unform :portkey.aws.xray/get-service-graph-result (:body response48752)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48752 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48752)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48752}))))))))))

(clojure.core/defn get-trace-graph ([input__47307__auto__] (get-trace-graph input__47307__auto__ portkey.aws/*http-client*)) ([input48755 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/TraceGraph"), :body (clojure.spec.alpha/unform :portkey.aws.xray/GetTraceGraphRequest input48755)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48754] (clojure.core/let [errors__47310__auto__ {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}] (if (clojure.core/= nil (:status response48754)) (clojure.spec.alpha/unform :portkey.aws.xray/get-trace-graph-result (:body response48754)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48754 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48754)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48754}))))))))))

(clojure.core/defn get-trace-summaries ([input__47307__auto__] (get-trace-summaries input__47307__auto__ portkey.aws/*http-client*)) ([input48757 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/TraceSummaries"), :body (clojure.spec.alpha/unform :portkey.aws.xray/GetTraceSummariesRequest input48757)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48756] (clojure.core/let [errors__47310__auto__ {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}] (if (clojure.core/= nil (:status response48756)) (clojure.spec.alpha/unform :portkey.aws.xray/get-trace-summaries-result (:body response48756)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48756 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48756)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48756}))))))))))

(clojure.core/defn put-telemetry-records ([input__47307__auto__] (put-telemetry-records input__47307__auto__ portkey.aws/*http-client*)) ([input48759 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/TelemetryRecords"), :body (clojure.spec.alpha/unform :portkey.aws.xray/PutTelemetryRecordsRequest input48759)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48758] (clojure.core/let [errors__47310__auto__ {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}] (if (clojure.core/= nil (:status response48758)) (clojure.spec.alpha/unform :portkey.aws.xray/put-telemetry-records-result (:body response48758)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48758 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48758)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48758}))))))))))

(clojure.core/defn put-trace-segments ([input__47307__auto__] (put-trace-segments input__47307__auto__ portkey.aws/*http-client*)) ([input48761 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/TraceSegments"), :body (clojure.spec.alpha/unform :portkey.aws.xray/PutTraceSegmentsRequest input48761)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48760] (clojure.core/let [errors__47310__auto__ {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}] (if (clojure.core/= nil (:status response48760)) (clojure.spec.alpha/unform :portkey.aws.xray/put-trace-segments-result (:body response48760)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48760 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48760)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48760}))))))))))
