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

(clojure.core/declare ser-attribute-map)

(clojure.core/declare ser-service-type)

(clojure.core/declare ser-sampling-statistics-document-list)

(clojure.core/declare ser-rule-name)

(clojure.core/declare ser-encryption-key-id)

(clojure.core/declare ser-trace-id)

(clojure.core/declare ser-nullable-boolean)

(clojure.core/declare ser-request-count)

(clojure.core/declare ser-telemetry-record-list)

(clojure.core/declare ser-priority)

(clojure.core/declare ser-hostname)

(clojure.core/declare ser-url-path)

(clojure.core/declare ser-encryption-type)

(clojure.core/declare ser-reservoir-size)

(clojure.core/declare ser-backend-connection-errors)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-filter-expression)

(clojure.core/declare ser-trace-segment-document)

(clojure.core/declare ser-attribute-key)

(clojure.core/declare ser-ec-2-instance-id)

(clojure.core/declare ser-string)

(clojure.core/declare ser-fixed-rate)

(clojure.core/declare ser-sampling-rule-update)

(clojure.core/declare ser-sampled-count)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-client-id)

(clojure.core/declare ser-service-name)

(clojure.core/declare ser-version)

(clojure.core/declare ser-borrow-count)

(clojure.core/declare ser-trace-segment-document-list)

(clojure.core/declare ser-telemetry-record)

(clojure.core/declare ser-nullable-integer)

(clojure.core/declare ser-nullable-double)

(clojure.core/declare ser-trace-id-list)

(clojure.core/declare ser-sampling-statistics-document)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-host)

(clojure.core/declare ser-sampling-rule)

(clojure.core/declare ser-http-method)

(clojure.core/defn- ser-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-key k) #:http.request.field{:map-info "key", :shape "AttributeKey"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "AttributeMap", :type "map", :max 5})

(clojure.core/defn- ser-service-type [input] #:http.request.field{:value input, :shape "ServiceType"})

(clojure.core/defn- ser-sampling-statistics-document-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sampling-statistics-document coll) #:http.request.field{:shape "SamplingStatisticsDocument"}))) input), :shape "SamplingStatisticsDocumentList", :type "list", :max 25})

(clojure.core/defn- ser-rule-name [input] #:http.request.field{:value input, :shape "RuleName"})

(clojure.core/defn- ser-encryption-key-id [input] #:http.request.field{:value input, :shape "EncryptionKeyId"})

(clojure.core/defn- ser-trace-id [input] #:http.request.field{:value input, :shape "TraceId"})

(clojure.core/defn- ser-nullable-boolean [input] #:http.request.field{:value input, :shape "NullableBoolean"})

(clojure.core/defn- ser-request-count [input] #:http.request.field{:value input, :shape "RequestCount"})

(clojure.core/defn- ser-telemetry-record-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-telemetry-record coll) #:http.request.field{:shape "TelemetryRecord"}))) input), :shape "TelemetryRecordList", :type "list"})

(clojure.core/defn- ser-priority [input] #:http.request.field{:value input, :shape "Priority"})

(clojure.core/defn- ser-hostname [input] #:http.request.field{:value input, :shape "Hostname"})

(clojure.core/defn- ser-url-path [input] #:http.request.field{:value input, :shape "URLPath"})

(clojure.core/defn- ser-encryption-type [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "KMS" "KMS", :kms "KMS"} input), :shape "EncryptionType"})

(clojure.core/defn- ser-reservoir-size [input] #:http.request.field{:value input, :shape "ReservoirSize"})

(clojure.core/defn- ser-backend-connection-errors [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BackendConnectionErrors", :type "structure"} (clojure.core/contains? input :timeout-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :timeout-count)) #:http.request.field{:name "TimeoutCount", :shape "NullableInteger"})) (clojure.core/contains? input :connection-refused-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :connection-refused-count)) #:http.request.field{:name "ConnectionRefusedCount", :shape "NullableInteger"})) (clojure.core/contains? input :http-code-4-xx-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :http-code-4-xx-count)) #:http.request.field{:name "HTTPCode4XXCount", :shape "NullableInteger"})) (clojure.core/contains? input :http-code-5-xx-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :http-code-5-xx-count)) #:http.request.field{:name "HTTPCode5XXCount", :shape "NullableInteger"})) (clojure.core/contains? input :unknown-host-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :unknown-host-count)) #:http.request.field{:name "UnknownHostCount", :shape "NullableInteger"})) (clojure.core/contains? input :other-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :other-count)) #:http.request.field{:name "OtherCount", :shape "NullableInteger"}))))

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-filter-expression [input] #:http.request.field{:value input, :shape "FilterExpression"})

(clojure.core/defn- ser-trace-segment-document [input] #:http.request.field{:value input, :shape "TraceSegmentDocument"})

(clojure.core/defn- ser-attribute-key [input] #:http.request.field{:value input, :shape "AttributeKey"})

(clojure.core/defn- ser-ec-2-instance-id [input] #:http.request.field{:value input, :shape "EC2InstanceId"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-fixed-rate [input] #:http.request.field{:value input, :shape "FixedRate"})

(clojure.core/defn- ser-sampling-rule-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SamplingRuleUpdate", :type "structure"} (clojure.core/contains? input :service-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-type (input :service-type)) #:http.request.field{:name "ServiceType", :shape "ServiceType"})) (clojure.core/contains? input :rule-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-name (input :rule-name)) #:http.request.field{:name "RuleName", :shape "RuleName"})) (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :priority)) #:http.request.field{:name "Priority", :shape "NullableInteger"})) (clojure.core/contains? input :url-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url-path (input :url-path)) #:http.request.field{:name "URLPath", :shape "URLPath"})) (clojure.core/contains? input :reservoir-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :reservoir-size)) #:http.request.field{:name "ReservoirSize", :shape "NullableInteger"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-map (input :attributes)) #:http.request.field{:name "Attributes", :shape "AttributeMap"})) (clojure.core/contains? input :fixed-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-double (input :fixed-rate)) #:http.request.field{:name "FixedRate", :shape "NullableDouble"})) (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-name (input :service-name)) #:http.request.field{:name "ServiceName", :shape "ServiceName"})) (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})) (clojure.core/contains? input :rule-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :rule-arn)) #:http.request.field{:name "RuleARN", :shape "String"})) (clojure.core/contains? input :host) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-host (input :host)) #:http.request.field{:name "Host", :shape "Host"})) (clojure.core/contains? input :http-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-method (input :http-method)) #:http.request.field{:name "HTTPMethod", :shape "HTTPMethod"}))))

(clojure.core/defn- ser-sampled-count [input] #:http.request.field{:value input, :shape "SampledCount"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-client-id [input] #:http.request.field{:value input, :shape "ClientID"})

(clojure.core/defn- ser-service-name [input] #:http.request.field{:value input, :shape "ServiceName"})

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-borrow-count [input] #:http.request.field{:value input, :shape "BorrowCount"})

(clojure.core/defn- ser-trace-segment-document-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-trace-segment-document coll) #:http.request.field{:shape "TraceSegmentDocument"}))) input), :shape "TraceSegmentDocumentList", :type "list"})

(clojure.core/defn- ser-telemetry-record [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:timestamp input)) #:http.request.field{:name "Timestamp", :shape "Timestamp"})], :shape "TelemetryRecord", :type "structure"} (clojure.core/contains? input :segments-received-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :segments-received-count)) #:http.request.field{:name "SegmentsReceivedCount", :shape "NullableInteger"})) (clojure.core/contains? input :segments-sent-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :segments-sent-count)) #:http.request.field{:name "SegmentsSentCount", :shape "NullableInteger"})) (clojure.core/contains? input :segments-spillover-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :segments-spillover-count)) #:http.request.field{:name "SegmentsSpilloverCount", :shape "NullableInteger"})) (clojure.core/contains? input :segments-rejected-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :segments-rejected-count)) #:http.request.field{:name "SegmentsRejectedCount", :shape "NullableInteger"})) (clojure.core/contains? input :backend-connection-errors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backend-connection-errors (input :backend-connection-errors)) #:http.request.field{:name "BackendConnectionErrors", :shape "BackendConnectionErrors"}))))

(clojure.core/defn- ser-nullable-integer [input] #:http.request.field{:value input, :shape "NullableInteger"})

(clojure.core/defn- ser-nullable-double [input] #:http.request.field{:value input, :shape "NullableDouble"})

(clojure.core/defn- ser-trace-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-trace-id coll) #:http.request.field{:shape "TraceId"}))) input), :shape "TraceIdList", :type "list"})

(clojure.core/defn- ser-sampling-statistics-document [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-rule-name (:rule-name input)) #:http.request.field{:name "RuleName", :shape "RuleName"}) (clojure.core/into (ser-client-id (:client-id input)) #:http.request.field{:name "ClientID", :shape "ClientID"}) (clojure.core/into (ser-timestamp (:timestamp input)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}) (clojure.core/into (ser-request-count (:request-count input)) #:http.request.field{:name "RequestCount", :shape "RequestCount"}) (clojure.core/into (ser-sampled-count (:sampled-count input)) #:http.request.field{:name "SampledCount", :shape "SampledCount"})], :shape "SamplingStatisticsDocument", :type "structure"} (clojure.core/contains? input :borrow-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-borrow-count (input :borrow-count)) #:http.request.field{:name "BorrowCount", :shape "BorrowCount"}))))

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-host [input] #:http.request.field{:value input, :shape "Host"})

(clojure.core/defn- ser-sampling-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-priority (:priority input)) #:http.request.field{:name "Priority", :shape "Priority"}) (clojure.core/into (ser-fixed-rate (:fixed-rate input)) #:http.request.field{:name "FixedRate", :shape "FixedRate"}) (clojure.core/into (ser-reservoir-size (:reservoir-size input)) #:http.request.field{:name "ReservoirSize", :shape "ReservoirSize"}) (clojure.core/into (ser-service-name (:service-name input)) #:http.request.field{:name "ServiceName", :shape "ServiceName"}) (clojure.core/into (ser-service-type (:service-type input)) #:http.request.field{:name "ServiceType", :shape "ServiceType"}) (clojure.core/into (ser-host (:host input)) #:http.request.field{:name "Host", :shape "Host"}) (clojure.core/into (ser-http-method (:http-method input)) #:http.request.field{:name "HTTPMethod", :shape "HTTPMethod"}) (clojure.core/into (ser-url-path (:url-path input)) #:http.request.field{:name "URLPath", :shape "URLPath"}) (clojure.core/into (ser-version (:version input)) #:http.request.field{:name "Version", :shape "Version"})], :shape "SamplingRule", :type "structure"} (clojure.core/contains? input :rule-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-name (input :rule-name)) #:http.request.field{:name "RuleName", :shape "RuleName"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-map (input :attributes)) #:http.request.field{:name "Attributes", :shape "AttributeMap"})) (clojure.core/contains? input :rule-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :rule-arn)) #:http.request.field{:name "RuleARN", :shape "String"}))))

(clojure.core/defn- ser-http-method [input] #:http.request.field{:value input, :shape "HTTPMethod"})

(clojure.core/defn- req-get-sampling-statistic-summaries-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-get-trace-summaries-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "Timestamp"})]} (clojure.core/contains? input :sampling) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :sampling)) #:http.request.field{:name "Sampling", :shape "NullableBoolean"})) (clojure.core/contains? input :filter-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-expression (input :filter-expression)) #:http.request.field{:name "FilterExpression", :shape "FilterExpression"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-get-sampling-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-get-service-graph-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "Timestamp"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-update-sampling-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-sampling-rule-update (input :sampling-rule-update)) #:http.request.field{:name "SamplingRuleUpdate", :shape "SamplingRuleUpdate"})]}))

(clojure.core/defn- req-put-trace-segments-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trace-segment-document-list (input :trace-segment-documents)) #:http.request.field{:name "TraceSegmentDocuments", :shape "TraceSegmentDocumentList"})]}))

(clojure.core/defn- req-delete-sampling-rule-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :rule-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :rule-name)) #:http.request.field{:name "RuleName", :shape "String"})) (clojure.core/contains? input :rule-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :rule-arn)) #:http.request.field{:name "RuleARN", :shape "String"}))))

(clojure.core/defn- req-batch-get-traces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trace-id-list (input :trace-ids)) #:http.request.field{:name "TraceIds", :shape "TraceIdList"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-get-sampling-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-sampling-statistics-document-list (input :sampling-statistics-documents)) #:http.request.field{:name "SamplingStatisticsDocuments", :shape "SamplingStatisticsDocumentList"})]}))

(clojure.core/defn- req-put-telemetry-records-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-telemetry-record-list (input :telemetry-records)) #:http.request.field{:name "TelemetryRecords", :shape "TelemetryRecordList"})]} (clojure.core/contains? input :ec-2-instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-instance-id (input :ec-2-instance-id)) #:http.request.field{:name "EC2InstanceId", :shape "EC2InstanceId"})) (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hostname (input :hostname)) #:http.request.field{:name "Hostname", :shape "Hostname"})) (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}))))

(clojure.core/defn- req-put-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-encryption-type (input :type)) #:http.request.field{:name "Type", :shape "EncryptionType"})]} (clojure.core/contains? input :key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-key-id (input :key-id)) #:http.request.field{:name "KeyId", :shape "EncryptionKeyId"}))))

(clojure.core/defn- req-create-sampling-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-sampling-rule (input :sampling-rule)) #:http.request.field{:name "SamplingRule", :shape "SamplingRule"})]}))

(clojure.core/defn- req-get-encryption-config-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-trace-graph-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trace-id-list (input :trace-ids)) #:http.request.field{:name "TraceIds", :shape "TraceIdList"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/attribute-map (clojure.spec.alpha/map-of :portkey.aws.xray.-2016-04-12/attribute-key :portkey.aws.xray.-2016-04-12/attribute-value))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-summary-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-summary))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/service))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/throttle-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.error-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/error-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.error-statistics/throttle-count :portkey.aws.xray.-2016-04-12.error-statistics/other-count :portkey.aws.xray.-2016-04-12.error-statistics/total-count]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/segment))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-throttle (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-error (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/duration (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/users (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-users))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/is-partial (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/has-fault (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-summary/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace-summary/has-throttle :portkey.aws.xray.-2016-04-12/annotations :portkey.aws.xray.-2016-04-12/service-ids :portkey.aws.xray.-2016-04-12.trace-summary/has-error :portkey.aws.xray.-2016-04-12.trace-summary/response-time :portkey.aws.xray.-2016-04-12/http :portkey.aws.xray.-2016-04-12.trace-summary/duration :portkey.aws.xray.-2016-04-12.trace-summary/users :portkey.aws.xray.-2016-04-12.trace-summary/is-partial :portkey.aws.xray.-2016-04-12.trace-summary/has-fault :portkey.aws.xray.-2016-04-12.trace-summary/id]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/number-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/boolean-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.annotation-value/string-value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotation-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.annotation-value/number-value :portkey.aws.xray.-2016-04-12.annotation-value/boolean-value :portkey.aws.xray.-2016-04-12.annotation-value/string-value]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-statistic-summaries-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-sampling-statistic-summaries-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-sampling-statistic-summaries-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.rule-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/error-message))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/rule-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.rule-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-statistics-document-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/sampling-statistics-document :max-count 25))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/reference-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/summary-statistics (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/edge-statistics))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/response-time-histogram (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge/aliases (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/alias-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.edge/reference-id :portkey.aws.xray.-2016-04-12.edge/start-time :portkey.aws.xray.-2016-04-12.edge/end-time :portkey.aws.xray.-2016-04-12.edge/summary-statistics :portkey.aws.xray.-2016-04-12.edge/response-time-histogram :portkey.aws.xray.-2016-04-12.edge/aliases]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/histogram (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/histogram-entry))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/sampling (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-summaries-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-request/start-time :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/end-time] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-request/sampling :portkey.aws.xray.-2016-04-12/filter-expression :portkey.aws.xray.-2016-04-12.get-trace-summaries-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/edge))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-rules-result/sampling-rule-records (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/sampling-rule-record-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-rules-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-sampling-rules-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-sampling-rules-result/sampling-rule-records :portkey.aws.xray.-2016-04-12.get-sampling-rules-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/error-message))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/encryption-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 3000))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/duration (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace/segments (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace/id :portkey.aws.xray.-2016-04-12.trace/duration :portkey.aws.xray.-2016-04-12.trace/segments]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-rules-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-sampling-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-sampling-rules-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/encryption-config]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-telemetry-records-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.trace-user/user-name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.trace-user/user-name :portkey.aws.xray.-2016-04-12/service-ids]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 35))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotations (clojure.spec.alpha/map-of :portkey.aws.xray.-2016-04-12/annotation-key :portkey.aws.xray.-2016-04-12/values-with-service-ids))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/names (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/alias-names))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.alias/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.alias/name :portkey.aws.xray.-2016-04-12.alias/names :portkey.aws.xray.-2016-04-12.alias/type]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/encryption-status #{"UPDATING" :active "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-statistics-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/unprocessed-statistics))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-service-graph-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12.get-service-graph-request/start-time :portkey.aws.xray.-2016-04-12.get-service-graph-request/end-time] :opt-un [:portkey.aws.xray.-2016-04-12.get-service-graph-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/update-sampling-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12/sampling-rule-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/error-code (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/id :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/error-code :portkey.aws.xray.-2016-04-12.unprocessed-trace-segment/message]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-ids (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/service-id))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/request-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/telemetry-record-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/telemetry-record))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/trace-summaries (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-summary-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/approximate-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/traces-processed-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-summaries-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-summaries-result/trace-summaries :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/approximate-time :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/traces-processed-count :portkey.aws.xray.-2016-04-12.get-trace-summaries-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/priority (clojure.spec.alpha/int-in 1 9999))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/url-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-statistic-summary/rule-name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-statistic-summary/request-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-statistic-summary/borrow-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-statistic-summary/sampled-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-statistic-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.sampling-statistic-summary/rule-name :portkey.aws.xray.-2016-04-12/timestamp :portkey.aws.xray.-2016-04-12.sampling-statistic-summary/request-count :portkey.aws.xray.-2016-04-12.sampling-statistic-summary/borrow-count :portkey.aws.xray.-2016-04-12.sampling-statistic-summary/sampled-count]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/encryption-type #{"KMS" "NONE" :kms :none})

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/update-sampling-rule-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/sampling-rule-record]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service-statistics/ok-count :portkey.aws.xray.-2016-04-12/error-statistics :portkey.aws.xray.-2016-04-12/fault-statistics :portkey.aws.xray.-2016-04-12.service-statistics/total-count :portkey.aws.xray.-2016-04-12.service-statistics/total-response-time]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/reservoir-size (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-statistic-summary-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/sampling-statistic-summary))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-target-document/rule-name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-target-document/fixed-rate (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-target-document/reservoir-quota (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-target-document/reservoir-quota-ttl (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-target-document/interval (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-target-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.sampling-target-document/rule-name :portkey.aws.xray.-2016-04-12.sampling-target-document/fixed-rate :portkey.aws.xray.-2016-04-12.sampling-target-document/reservoir-quota :portkey.aws.xray.-2016-04-12.sampling-target-document/reservoir-quota-ttl :portkey.aws.xray.-2016-04-12.sampling-target-document/interval]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias-names (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/string))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/timeout-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/connection-refused-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/http-code-4-xx-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/http-code-5-xx-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/unknown-host-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.backend-connection-errors/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/backend-connection-errors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.backend-connection-errors/timeout-count :portkey.aws.xray.-2016-04-12.backend-connection-errors/connection-refused-count :portkey.aws.xray.-2016-04-12.backend-connection-errors/http-code-4-xx-count :portkey.aws.xray.-2016-04-12.backend-connection-errors/http-code-5-xx-count :portkey.aws.xray.-2016-04-12.backend-connection-errors/unknown-host-count :portkey.aws.xray.-2016-04-12.backend-connection-errors/other-count]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-statistics/rule-name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-statistics/error-code (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.unprocessed-statistics/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.unprocessed-statistics/rule-name :portkey.aws.xray.-2016-04-12.unprocessed-statistics/error-code :portkey.aws.xray.-2016-04-12.unprocessed-statistics/message]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/values-with-service-ids (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/value-with-service-ids))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.segment/id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.segment/document (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/segment-document))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.segment/id :portkey.aws.xray.-2016-04-12.segment/document]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.fault-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.fault-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/fault-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.fault-statistics/other-count :portkey.aws.xray.-2016-04-12.fault-statistics/total-count]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/names (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/account-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.service-id/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service-id/name :portkey.aws.xray.-2016-04-12.service-id/names :portkey.aws.xray.-2016-04-12.service-id/account-id :portkey.aws.xray.-2016-04-12.service-id/type]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-trace-segments-request/trace-segment-documents (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-segment-document-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-trace-segments-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12.put-trace-segments-request/trace-segment-documents] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/value-with-service-ids (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/annotation-value :portkey.aws.xray.-2016-04-12/service-ids]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/http-url (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/http-status (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/http-method (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/user-agent (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.http/client-ip (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/http (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.http/http-url :portkey.aws.xray.-2016-04-12.http/http-status :portkey.aws.xray.-2016-04-12.http/http-method :portkey.aws.xray.-2016-04-12.http/user-agent :portkey.aws.xray.-2016-04-12.http/client-ip]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-names (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/string))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.delete-sampling-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.delete-sampling-rule-request/rule-arn (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/delete-sampling-rule-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.delete-sampling-rule-request/rule-name :portkey.aws.xray.-2016-04-12.delete-sampling-rule-request/rule-arn]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/encryption-config]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/batch-get-traces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-request/trace-ids] :opt-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-segment-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/alias-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/alias))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/annotation-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-targets-request/sampling-statistics-documents (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/sampling-statistics-document-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-sampling-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12.get-sampling-targets-request/sampling-statistics-documents] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-rule-record-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/sampling-rule-record))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/ec-2-instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-trace-segments-result/unprocessed-trace-segments (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/unprocessed-trace-segment-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-trace-segments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.put-trace-segments-result/unprocessed-trace-segments]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-telemetry-records-request/telemetry-records (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/telemetry-record-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-telemetry-records-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12.put-telemetry-records-request/telemetry-records] :opt-un [:portkey.aws.xray.-2016-04-12/ec-2-instance-id :portkey.aws.xray.-2016-04-12/hostname :portkey.aws.xray.-2016-04-12/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-graph-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-result/services :portkey.aws.xray.-2016-04-12.get-trace-graph-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-statistic-summaries-result/sampling-statistic-summaries (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/sampling-statistic-summary-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-statistic-summaries-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-sampling-statistic-summaries-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-sampling-statistic-summaries-result/sampling-statistic-summaries :portkey.aws.xray.-2016-04-12.get-sampling-statistic-summaries-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/create-sampling-rule-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/sampling-rule-record]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/delete-sampling-rule-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/sampling-rule-record]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-targets-result/sampling-target-documents (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/sampling-target-document-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-targets-result/last-rule-modification (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-sampling-targets-result/unprocessed-statistics (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/unprocessed-statistics-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-sampling-targets-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-sampling-targets-result/sampling-target-documents :portkey.aws.xray.-2016-04-12.get-sampling-targets-result/last-rule-modification :portkey.aws.xray.-2016-04-12.get-sampling-targets-result/unprocessed-statistics]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/fixed-rate clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/unprocessed-trace-id-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-id))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule-update/priority (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule-update/reservoir-size (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule-update/attributes (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/attribute-map))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule-update/fixed-rate (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule-update/rule-arn (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-rule-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/service-type :portkey.aws.xray.-2016-04-12/rule-name :portkey.aws.xray.-2016-04-12.sampling-rule-update/priority :portkey.aws.xray.-2016-04-12/url-path :portkey.aws.xray.-2016-04-12.sampling-rule-update/reservoir-size :portkey.aws.xray.-2016-04-12.sampling-rule-update/attributes :portkey.aws.xray.-2016-04-12.sampling-rule-update/fixed-rate :portkey.aws.xray.-2016-04-12/service-name :portkey.aws.xray.-2016-04-12/resource-arn :portkey.aws.xray.-2016-04-12.sampling-rule-update/rule-arn :portkey.aws.xray.-2016-04-12/host :portkey.aws.xray.-2016-04-12/http-method]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampled-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-encryption-config-request/key-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/encryption-key-id))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.put-encryption-config-request/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/encryption-type))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/put-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12.put-encryption-config-request/type] :opt-un [:portkey.aws.xray.-2016-04-12.put-encryption-config-request/key-id]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-users (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-user))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-target-document-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/sampling-target-document))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 24 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 24))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/version (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/borrow-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-segment-document-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-segment-document))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-received-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-sent-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-spillover-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.telemetry-record/segments-rejected-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/telemetry-record (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12/timestamp] :opt-un [:portkey.aws.xray.-2016-04-12.telemetry-record/segments-received-count :portkey.aws.xray.-2016-04-12.telemetry-record/segments-sent-count :portkey.aws.xray.-2016-04-12.telemetry-record/segments-spillover-count :portkey.aws.xray.-2016-04-12.telemetry-record/segments-rejected-count :portkey.aws.xray.-2016-04-12/backend-connection-errors]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-integer clojure.core/int?)

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
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.service/end-time :portkey.aws.xray.-2016-04-12.service/type :portkey.aws.xray.-2016-04-12.service/reference-id :portkey.aws.xray.-2016-04-12.service/response-time-histogram :portkey.aws.xray.-2016-04-12.service/start-time :portkey.aws.xray.-2016-04-12.service/summary-statistics :portkey.aws.xray.-2016-04-12.service/root :portkey.aws.xray.-2016-04-12.service/names :portkey.aws.xray.-2016-04-12.service/duration-histogram :portkey.aws.xray.-2016-04-12.service/edges :portkey.aws.xray.-2016-04-12.service/account-id :portkey.aws.xray.-2016-04-12.service/state :portkey.aws.xray.-2016-04-12.service/name]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/start-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/end-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-service-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-service-graph-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.get-service-graph-result/start-time :portkey.aws.xray.-2016-04-12.get-service-graph-result/end-time :portkey.aws.xray.-2016-04-12.get-service-graph-result/services :portkey.aws.xray.-2016-04-12.get-service-graph-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/traces (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/unprocessed-trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/unprocessed-trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.batch-get-traces-result/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/batch-get-traces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.batch-get-traces-result/traces :portkey.aws.xray.-2016-04-12.batch-get-traces-result/unprocessed-trace-ids :portkey.aws.xray.-2016-04-12.batch-get-traces-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule-record/created-at (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule-record/modified-at (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-rule-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12/sampling-rule :portkey.aws.xray.-2016-04-12.sampling-rule-record/created-at :portkey.aws.xray.-2016-04-12.sampling-rule-record/modified-at]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/nullable-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.encryption-config/key-id (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.encryption-config/status (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/encryption-status))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.encryption-config/type (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/encryption-type))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.encryption-config/key-id :portkey.aws.xray.-2016-04-12.encryption-config/status :portkey.aws.xray.-2016-04-12.encryption-config/type]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.edge-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/edge-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.edge-statistics/ok-count :portkey.aws.xray.-2016-04-12/error-statistics :portkey.aws.xray.-2016-04-12/fault-statistics :portkey.aws.xray.-2016-04-12.edge-statistics/total-count :portkey.aws.xray.-2016-04-12.edge-statistics/total-response-time]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/create-sampling-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12/sampling-rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/trace-id-list (clojure.spec.alpha/coll-of :portkey.aws.xray.-2016-04-12/trace-id))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-statistics-document (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12/rule-name :portkey.aws.xray.-2016-04-12/client-id :portkey.aws.xray.-2016-04-12/timestamp :portkey.aws.xray.-2016-04-12/request-count :portkey.aws.xray.-2016-04-12/sampled-count] :opt-un [:portkey.aws.xray.-2016-04-12/borrow-count]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/error-message))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/throttled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.throttled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-encryption-config-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/segment-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/host (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule/attributes (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/attribute-map))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.sampling-rule/rule-arn (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/sampling-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12/resource-arn :portkey.aws.xray.-2016-04-12/priority :portkey.aws.xray.-2016-04-12/fixed-rate :portkey.aws.xray.-2016-04-12/reservoir-size :portkey.aws.xray.-2016-04-12/service-name :portkey.aws.xray.-2016-04-12/service-type :portkey.aws.xray.-2016-04-12/host :portkey.aws.xray.-2016-04-12/http-method :portkey.aws.xray.-2016-04-12/url-path :portkey.aws.xray.-2016-04-12/version] :opt-un [:portkey.aws.xray.-2016-04-12/rule-name :portkey.aws.xray.-2016-04-12.sampling-rule/attributes :portkey.aws.xray.-2016-04-12.sampling-rule/rule-arn]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.get-trace-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/string))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/get-trace-graph-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-request/trace-ids] :opt-un [:portkey.aws.xray.-2016-04-12.get-trace-graph-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/http-method (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 10))))

(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.histogram-entry/value (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/double))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12.histogram-entry/count (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/integer))
(clojure.spec.alpha/def :portkey.aws.xray.-2016-04-12/histogram-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.-2016-04-12.histogram-entry/value :portkey.aws.xray.-2016-04-12.histogram-entry/count]))

(clojure.core/defn update-sampling-rule ([update-sampling-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-sampling-rule-request update-sampling-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/update-sampling-rule-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/UpdateSamplingRule", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/update-sampling-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSamplingRule", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef update-sampling-rule :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/update-sampling-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/update-sampling-rule-result))

(clojure.core/defn get-sampling-rules ([] (get-sampling-rules {})) ([get-sampling-rules-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-sampling-rules-request get-sampling-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/get-sampling-rules-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/GetSamplingRules", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/get-sampling-rules-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSamplingRules", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef get-sampling-rules :args (clojure.spec.alpha/? :portkey.aws.xray.-2016-04-12/get-sampling-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-sampling-rules-result))

(clojure.core/defn delete-sampling-rule ([] (delete-sampling-rule {})) ([delete-sampling-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-sampling-rule-request delete-sampling-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/delete-sampling-rule-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/DeleteSamplingRule", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/delete-sampling-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSamplingRule", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef delete-sampling-rule :args (clojure.spec.alpha/? :portkey.aws.xray.-2016-04-12/delete-sampling-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/delete-sampling-rule-result))

(clojure.core/defn put-encryption-config ([put-encryption-config-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-encryption-config-request put-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/put-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/PutEncryptionConfig", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/put-encryption-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutEncryptionConfig", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef put-encryption-config :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/put-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/put-encryption-config-result))

(clojure.core/defn get-sampling-statistic-summaries ([] (get-sampling-statistic-summaries {})) ([get-sampling-statistic-summaries-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-sampling-statistic-summaries-request get-sampling-statistic-summaries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/get-sampling-statistic-summaries-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/SamplingStatisticSummaries", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/get-sampling-statistic-summaries-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSamplingStatisticSummaries", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef get-sampling-statistic-summaries :args (clojure.spec.alpha/? :portkey.aws.xray.-2016-04-12/get-sampling-statistic-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-sampling-statistic-summaries-result))

(clojure.core/defn get-sampling-targets ([get-sampling-targets-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-sampling-targets-request get-sampling-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/get-sampling-targets-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/SamplingTargets", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/get-sampling-targets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSamplingTargets", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef get-sampling-targets :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/get-sampling-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-sampling-targets-result))

(clojure.core/defn get-encryption-config ([] (get-encryption-config {})) ([get-encryption-config-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-encryption-config-request get-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/get-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/EncryptionConfig", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/get-encryption-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetEncryptionConfig", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef get-encryption-config :args (clojure.spec.alpha/? :portkey.aws.xray.-2016-04-12/get-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-encryption-config-result))

(clojure.core/defn get-service-graph ([get-service-graph-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-service-graph-request get-service-graph-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/get-service-graph-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/ServiceGraph", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/get-service-graph-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetServiceGraph", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef get-service-graph :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/get-service-graph-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-service-graph-result))

(clojure.core/defn get-trace-graph ([get-trace-graph-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-trace-graph-request get-trace-graph-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/get-trace-graph-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/TraceGraph", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/get-trace-graph-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTraceGraph", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef get-trace-graph :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/get-trace-graph-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-trace-graph-result))

(clojure.core/defn get-trace-summaries ([get-trace-summaries-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-trace-summaries-request get-trace-summaries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/get-trace-summaries-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/TraceSummaries", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/get-trace-summaries-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTraceSummaries", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef get-trace-summaries :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/get-trace-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/get-trace-summaries-result))

(clojure.core/defn put-trace-segments ([put-trace-segments-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-trace-segments-request put-trace-segments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/put-trace-segments-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/TraceSegments", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/put-trace-segments-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutTraceSegments", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef put-trace-segments :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/put-trace-segments-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/put-trace-segments-result))

(clojure.core/defn create-sampling-rule ([create-sampling-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-sampling-rule-request create-sampling-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/create-sampling-rule-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/CreateSamplingRule", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/create-sampling-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSamplingRule", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception, "RuleLimitExceededException" :portkey.aws.xray.-2016-04-12/rule-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-sampling-rule :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/create-sampling-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/create-sampling-rule-result))

(clojure.core/defn put-telemetry-records ([put-telemetry-records-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-telemetry-records-request put-telemetry-records-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/put-telemetry-records-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/TelemetryRecords", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/put-telemetry-records-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutTelemetryRecords", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef put-telemetry-records :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/put-telemetry-records-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/put-telemetry-records-result))

(clojure.core/defn batch-get-traces ([batch-get-traces-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-batch-get-traces-request batch-get-traces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.xray.-2016-04-12/endpoints, :http.request.spec/output-spec :portkey.aws.xray.-2016-04-12/batch-get-traces-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/Traces", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray.-2016-04-12/batch-get-traces-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetTraces", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray.-2016-04-12/invalid-request-exception, "ThrottledException" :portkey.aws.xray.-2016-04-12/throttled-exception}})))))
(clojure.spec.alpha/fdef batch-get-traces :args (clojure.spec.alpha/tuple :portkey.aws.xray.-2016-04-12/batch-get-traces-request) :ret (clojure.spec.alpha/and :portkey.aws.xray.-2016-04-12/batch-get-traces-result))
