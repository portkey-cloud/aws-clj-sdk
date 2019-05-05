(ns portkey.aws.xray (:require [portkey.aws]))

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
   "eu-west-3"
   {:credential-scope {:service "xray", :region "eu-west-3"},
    :ssl-common-name "xray.eu-west-3.amazonaws.com",
    :endpoint "https://xray.eu-west-3.amazonaws.com",
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "xray", :region "eu-north-1"},
    :ssl-common-name "xray.eu-north-1.amazonaws.com",
    :endpoint "https://xray.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-attribute-map)

(clojure.core/declare ser-service-type)

(clojure.core/declare ser-sampling-statistics-document-list)

(clojure.core/declare ser-rule-name)

(clojure.core/declare ser-encryption-key-id)

(clojure.core/declare ser-trace-id)

(clojure.core/declare ser-nullable-boolean)

(clojure.core/declare ser-group-name)

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

(clojure.core/declare ser-get-groups-next-token)

(clojure.core/declare ser-group-arn)

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

(clojure.core/defn- ser-group-name [input] #:http.request.field{:value input, :shape "GroupName"})

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

(clojure.core/defn- ser-get-groups-next-token [input] #:http.request.field{:value input, :shape "GetGroupsNextToken"})

(clojure.core/defn- ser-group-arn [input] #:http.request.field{:value input, :shape "GroupARN"})

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

(clojure.core/defn- req-get-service-graph-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "Timestamp"})]} (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName"})) (clojure.core/contains? input :group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-arn (input :group-arn)) #:http.request.field{:name "GroupARN", :shape "GroupARN"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-update-sampling-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-sampling-rule-update (input :sampling-rule-update)) #:http.request.field{:name "SamplingRuleUpdate", :shape "SamplingRuleUpdate"})]}))

(clojure.core/defn- req-get-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-groups-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "GetGroupsNextToken"}))))

(clojure.core/defn- req-put-trace-segments-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trace-segment-document-list (input :trace-segment-documents)) #:http.request.field{:name "TraceSegmentDocuments", :shape "TraceSegmentDocumentList"})]}))

(clojure.core/defn- req-delete-sampling-rule-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :rule-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :rule-name)) #:http.request.field{:name "RuleName", :shape "String"})) (clojure.core/contains? input :rule-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :rule-arn)) #:http.request.field{:name "RuleARN", :shape "String"}))))

(clojure.core/defn- req-batch-get-traces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trace-id-list (input :trace-ids)) #:http.request.field{:name "TraceIds", :shape "TraceIdList"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-delete-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName"})) (clojure.core/contains? input :group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-arn (input :group-arn)) #:http.request.field{:name "GroupARN", :shape "GroupARN"}))))

(clojure.core/defn- req-get-sampling-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-sampling-statistics-document-list (input :sampling-statistics-documents)) #:http.request.field{:name "SamplingStatisticsDocuments", :shape "SamplingStatisticsDocumentList"})]}))

(clojure.core/defn- req-put-telemetry-records-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-telemetry-record-list (input :telemetry-records)) #:http.request.field{:name "TelemetryRecords", :shape "TelemetryRecordList"})]} (clojure.core/contains? input :ec-2-instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-instance-id (input :ec-2-instance-id)) #:http.request.field{:name "EC2InstanceId", :shape "EC2InstanceId"})) (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hostname (input :hostname)) #:http.request.field{:name "Hostname", :shape "Hostname"})) (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}))))

(clojure.core/defn- req-put-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-encryption-type (input :type)) #:http.request.field{:name "Type", :shape "EncryptionType"})]} (clojure.core/contains? input :key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-key-id (input :key-id)) #:http.request.field{:name "KeyId", :shape "EncryptionKeyId"}))))

(clojure.core/defn- req-create-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName"})]} (clojure.core/contains? input :filter-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-expression (input :filter-expression)) #:http.request.field{:name "FilterExpression", :shape "FilterExpression"}))))

(clojure.core/defn- req-get-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName"})) (clojure.core/contains? input :group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-arn (input :group-arn)) #:http.request.field{:name "GroupARN", :shape "GroupARN"}))))

(clojure.core/defn- req-create-sampling-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-sampling-rule (input :sampling-rule)) #:http.request.field{:name "SamplingRule", :shape "SamplingRule"})]}))

(clojure.core/defn- req-get-encryption-config-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName"})) (clojure.core/contains? input :group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-arn (input :group-arn)) #:http.request.field{:name "GroupARN", :shape "GroupARN"})) (clojure.core/contains? input :filter-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-expression (input :filter-expression)) #:http.request.field{:name "FilterExpression", :shape "FilterExpression"}))))

(clojure.core/defn- req-get-trace-graph-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trace-id-list (input :trace-ids)) #:http.request.field{:name "TraceIds", :shape "TraceIdList"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/declare deser-attribute-map)

(clojure.core/declare deser-trace-summary-list)

(clojure.core/declare deser-service-list)

(clojure.core/declare deser-error-statistics)

(clojure.core/declare deser-segment-list)

(clojure.core/declare deser-response-time-root-cause)

(clojure.core/declare deser-trace-summary)

(clojure.core/declare deser-annotation-value)

(clojure.core/declare deser-double)

(clojure.core/declare deser-service-type)

(clojure.core/declare deser-edge)

(clojure.core/declare deser-trace-availability-zones)

(clojure.core/declare deser-histogram)

(clojure.core/declare deser-trace-list)

(clojure.core/declare deser-fault-root-cause-services)

(clojure.core/declare deser-error-root-cause-entity)

(clojure.core/declare deser-edge-list)

(clojure.core/declare deser-rule-name)

(clojure.core/declare deser-response-time-root-cause-services)

(clojure.core/declare deser-group-summary)

(clojure.core/declare deser-trace)

(clojure.core/declare deser-error-root-cause-services)

(clojure.core/declare deser-trace-user)

(clojure.core/declare deser-unprocessed-trace-segment-list)

(clojure.core/declare deser-trace-id)

(clojure.core/declare deser-annotations)

(clojure.core/declare deser-alias)

(clojure.core/declare deser-encryption-status)

(clojure.core/declare deser-unprocessed-statistics-list)

(clojure.core/declare deser-error-root-cause-service)

(clojure.core/declare deser-nullable-boolean)

(clojure.core/declare deser-unprocessed-trace-segment)

(clojure.core/declare deser-fault-root-causes)

(clojure.core/declare deser-root-cause-exceptions)

(clojure.core/declare deser-service-ids)

(clojure.core/declare deser-instance-id-detail)

(clojure.core/declare deser-response-time-root-cause-entity)

(clojure.core/declare deser-priority)

(clojure.core/declare deser-url-path)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-sampling-statistic-summary)

(clojure.core/declare deser-error-root-cause-entity-path)

(clojure.core/declare deser-encryption-type)

(clojure.core/declare deser-service-statistics)

(clojure.core/declare deser-reservoir-size)

(clojure.core/declare deser-sampling-statistic-summary-list)

(clojure.core/declare deser-sampling-target-document)

(clojure.core/declare deser-alias-names)

(clojure.core/declare deser-unprocessed-statistics)

(clojure.core/declare deser-values-with-service-ids)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-segment)

(clojure.core/declare deser-fault-statistics)

(clojure.core/declare deser-service-id)

(clojure.core/declare deser-value-with-service-ids)

(clojure.core/declare deser-nullable-long)

(clojure.core/declare deser-http)

(clojure.core/declare deser-trace-resource-ar-ns)

(clojure.core/declare deser-service-names)

(clojure.core/declare deser-error-root-causes)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-annotation-key)

(clojure.core/declare deser-attribute-key)

(clojure.core/declare deser-sampling-rule-record-list)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-response-time-root-causes)

(clojure.core/declare deser-fixed-rate)

(clojure.core/declare deser-availability-zone-detail)

(clojure.core/declare deser-unprocessed-trace-id-list)

(clojure.core/declare deser-segment-id)

(clojure.core/declare deser-response-time-root-cause-service)

(clojure.core/declare deser-trace-users)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-fault-root-cause-service)

(clojure.core/declare deser-sampling-target-document-list)

(clojure.core/declare deser-fault-root-cause-entity-path)

(clojure.core/declare deser-service-name)

(clojure.core/declare deser-version)

(clojure.core/declare deser-trace-instance-ids)

(clojure.core/declare deser-nullable-integer)

(clojure.core/declare deser-error-root-cause)

(clojure.core/declare deser-service)

(clojure.core/declare deser-group)

(clojure.core/declare deser-sampling-rule-record)

(clojure.core/declare deser-response-time-root-cause-entity-path)

(clojure.core/declare deser-nullable-double)

(clojure.core/declare deser-group-summary-list)

(clojure.core/declare deser-encryption-config)

(clojure.core/declare deser-edge-statistics)

(clojure.core/declare deser-root-cause-exception)

(clojure.core/declare deser-fault-root-cause-entity)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-fault-root-cause)

(clojure.core/declare deser-segment-document)

(clojure.core/declare deser-host)

(clojure.core/declare deser-sampling-rule)

(clojure.core/declare deser-resource-arn-detail)

(clojure.core/declare deser-http-method)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-histogram-entry)

(clojure.core/defn- deser-attribute-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-key k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-trace-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trace-summary coll))) input))

(clojure.core/defn- deser-service-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service coll))) input))

(clojure.core/defn- deser-error-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "ThrottleCount") (clojure.core/assoc :throttle-count (deser-nullable-long (input "ThrottleCount"))) (clojure.core/contains? input "OtherCount") (clojure.core/assoc :other-count (deser-nullable-long (input "OtherCount"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-nullable-long (input "TotalCount")))))

(clojure.core/defn- deser-segment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-segment coll))) input))

(clojure.core/defn- deser-response-time-root-cause [input] (clojure.core/cond-> {} (clojure.core/contains? input "Services") (clojure.core/assoc :services (deser-response-time-root-cause-services (input "Services")))))

(clojure.core/defn- deser-trace-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceIds") (clojure.core/assoc :instance-ids (deser-trace-instance-ids (input "InstanceIds"))) (clojure.core/contains? input "HasThrottle") (clojure.core/assoc :has-throttle (deser-nullable-boolean (input "HasThrottle"))) (clojure.core/contains? input "ResourceARNs") (clojure.core/assoc :resource-ar-ns (deser-trace-resource-ar-ns (input "ResourceARNs"))) (clojure.core/contains? input "Annotations") (clojure.core/assoc :annotations (deser-annotations (input "Annotations"))) (clojure.core/contains? input "FaultRootCauses") (clojure.core/assoc :fault-root-causes (deser-fault-root-causes (input "FaultRootCauses"))) (clojure.core/contains? input "ServiceIds") (clojure.core/assoc :service-ids (deser-service-ids (input "ServiceIds"))) (clojure.core/contains? input "Revision") (clojure.core/assoc :revision (deser-integer (input "Revision"))) (clojure.core/contains? input "HasError") (clojure.core/assoc :has-error (deser-nullable-boolean (input "HasError"))) (clojure.core/contains? input "ResponseTime") (clojure.core/assoc :response-time (deser-nullable-double (input "ResponseTime"))) (clojure.core/contains? input "Http") (clojure.core/assoc :http (deser-http (input "Http"))) (clojure.core/contains? input "ErrorRootCauses") (clojure.core/assoc :error-root-causes (deser-error-root-causes (input "ErrorRootCauses"))) (clojure.core/contains? input "Duration") (clojure.core/assoc :duration (deser-nullable-double (input "Duration"))) (clojure.core/contains? input "Users") (clojure.core/assoc :users (deser-trace-users (input "Users"))) (clojure.core/contains? input "ResponseTimeRootCauses") (clojure.core/assoc :response-time-root-causes (deser-response-time-root-causes (input "ResponseTimeRootCauses"))) (clojure.core/contains? input "EntryPoint") (clojure.core/assoc :entry-point (deser-service-id (input "EntryPoint"))) (clojure.core/contains? input "IsPartial") (clojure.core/assoc :is-partial (deser-nullable-boolean (input "IsPartial"))) (clojure.core/contains? input "HasFault") (clojure.core/assoc :has-fault (deser-nullable-boolean (input "HasFault"))) (clojure.core/contains? input "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-trace-availability-zones (input "AvailabilityZones"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-trace-id (input "Id")))))

(clojure.core/defn- deser-annotation-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "NumberValue") (clojure.core/assoc :number-value (deser-nullable-double (input "NumberValue"))) (clojure.core/contains? input "BooleanValue") (clojure.core/assoc :boolean-value (deser-nullable-boolean (input "BooleanValue"))) (clojure.core/contains? input "StringValue") (clojure.core/assoc :string-value (deser-string (input "StringValue")))))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-service-type [input] input)

(clojure.core/defn- deser-edge [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReferenceId") (clojure.core/assoc :reference-id (deser-nullable-integer (input "ReferenceId"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-timestamp (input "StartTime"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "SummaryStatistics") (clojure.core/assoc :summary-statistics (deser-edge-statistics (input "SummaryStatistics"))) (clojure.core/contains? input "ResponseTimeHistogram") (clojure.core/assoc :response-time-histogram (deser-histogram (input "ResponseTimeHistogram"))) (clojure.core/contains? input "Aliases") (clojure.core/assoc :aliases (deser-alias-list (input "Aliases")))))

(clojure.core/defn- deser-trace-availability-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-availability-zone-detail coll))) input))

(clojure.core/defn- deser-histogram [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-histogram-entry coll))) input))

(clojure.core/defn- deser-trace-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trace coll))) input))

(clojure.core/defn- deser-fault-root-cause-services [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fault-root-cause-service coll))) input))

(clojure.core/defn- deser-error-root-cause-entity [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Exceptions") (clojure.core/assoc :exceptions (deser-root-cause-exceptions (input "Exceptions"))) (clojure.core/contains? input "Remote") (clojure.core/assoc :remote (deser-nullable-boolean (input "Remote")))))

(clojure.core/defn- deser-edge-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-edge coll))) input))

(clojure.core/defn- deser-rule-name [input] input)

(clojure.core/defn- deser-response-time-root-cause-services [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-response-time-root-cause-service coll))) input))

(clojure.core/defn- deser-group-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "GroupName") (clojure.core/assoc :group-name (deser-string (input "GroupName"))) (clojure.core/contains? input "GroupARN") (clojure.core/assoc :group-arn (deser-string (input "GroupARN"))) (clojure.core/contains? input "FilterExpression") (clojure.core/assoc :filter-expression (deser-string (input "FilterExpression")))))

(clojure.core/defn- deser-trace [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-trace-id (input "Id"))) (clojure.core/contains? input "Duration") (clojure.core/assoc :duration (deser-nullable-double (input "Duration"))) (clojure.core/contains? input "Segments") (clojure.core/assoc :segments (deser-segment-list (input "Segments")))))

(clojure.core/defn- deser-error-root-cause-services [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-root-cause-service coll))) input))

(clojure.core/defn- deser-trace-user [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserName") (clojure.core/assoc :user-name (deser-string (input "UserName"))) (clojure.core/contains? input "ServiceIds") (clojure.core/assoc :service-ids (deser-service-ids (input "ServiceIds")))))

(clojure.core/defn- deser-unprocessed-trace-segment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unprocessed-trace-segment coll))) input))

(clojure.core/defn- deser-trace-id [input] input)

(clojure.core/defn- deser-annotations [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-annotation-key k) (deser-values-with-service-ids v)])) input))

(clojure.core/defn- deser-alias [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Names") (clojure.core/assoc :names (deser-alias-names (input "Names"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type")))))

(clojure.core/defn- deser-encryption-status [input] (clojure.core/get {"UPDATING" :updating, "ACTIVE" :active} input))

(clojure.core/defn- deser-unprocessed-statistics-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unprocessed-statistics coll))) input))

(clojure.core/defn- deser-error-root-cause-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Names") (clojure.core/assoc :names (deser-service-names (input "Names"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-string (input "AccountId"))) (clojure.core/contains? input "EntityPath") (clojure.core/assoc :entity-path (deser-error-root-cause-entity-path (input "EntityPath"))) (clojure.core/contains? input "Inferred") (clojure.core/assoc :inferred (deser-nullable-boolean (input "Inferred")))))

(clojure.core/defn- deser-nullable-boolean [input] input)

(clojure.core/defn- deser-unprocessed-trace-segment [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-string (input "Id"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-string (input "ErrorCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-fault-root-causes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fault-root-cause coll))) input))

(clojure.core/defn- deser-root-cause-exceptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-root-cause-exception coll))) input))

(clojure.core/defn- deser-service-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-id coll))) input))

(clojure.core/defn- deser-instance-id-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-string (input "Id")))))

(clojure.core/defn- deser-response-time-root-cause-entity [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Coverage") (clojure.core/assoc :coverage (deser-nullable-double (input "Coverage"))) (clojure.core/contains? input "Remote") (clojure.core/assoc :remote (deser-nullable-boolean (input "Remote")))))

(clojure.core/defn- deser-priority [input] input)

(clojure.core/defn- deser-url-path [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-sampling-statistic-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "RuleName") (clojure.core/assoc :rule-name (deser-string (input "RuleName"))) (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "RequestCount") (clojure.core/assoc :request-count (deser-integer (input "RequestCount"))) (clojure.core/contains? input "BorrowCount") (clojure.core/assoc :borrow-count (deser-integer (input "BorrowCount"))) (clojure.core/contains? input "SampledCount") (clojure.core/assoc :sampled-count (deser-integer (input "SampledCount")))))

(clojure.core/defn- deser-error-root-cause-entity-path [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-root-cause-entity coll))) input))

(clojure.core/defn- deser-encryption-type [input] (clojure.core/get {"NONE" :none, "KMS" :kms} input))

(clojure.core/defn- deser-service-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "OkCount") (clojure.core/assoc :ok-count (deser-nullable-long (input "OkCount"))) (clojure.core/contains? input "ErrorStatistics") (clojure.core/assoc :error-statistics (deser-error-statistics (input "ErrorStatistics"))) (clojure.core/contains? input "FaultStatistics") (clojure.core/assoc :fault-statistics (deser-fault-statistics (input "FaultStatistics"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-nullable-long (input "TotalCount"))) (clojure.core/contains? input "TotalResponseTime") (clojure.core/assoc :total-response-time (deser-nullable-double (input "TotalResponseTime")))))

(clojure.core/defn- deser-reservoir-size [input] input)

(clojure.core/defn- deser-sampling-statistic-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sampling-statistic-summary coll))) input))

(clojure.core/defn- deser-sampling-target-document [input] (clojure.core/cond-> {} (clojure.core/contains? input "RuleName") (clojure.core/assoc :rule-name (deser-string (input "RuleName"))) (clojure.core/contains? input "FixedRate") (clojure.core/assoc :fixed-rate (deser-double (input "FixedRate"))) (clojure.core/contains? input "ReservoirQuota") (clojure.core/assoc :reservoir-quota (deser-nullable-integer (input "ReservoirQuota"))) (clojure.core/contains? input "ReservoirQuotaTTL") (clojure.core/assoc :reservoir-quota-ttl (deser-timestamp (input "ReservoirQuotaTTL"))) (clojure.core/contains? input "Interval") (clojure.core/assoc :interval (deser-nullable-integer (input "Interval")))))

(clojure.core/defn- deser-alias-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-unprocessed-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "RuleName") (clojure.core/assoc :rule-name (deser-string (input "RuleName"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-string (input "ErrorCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-values-with-service-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-value-with-service-ids coll))) input))

(clojure.core/defn- deser-attribute-value [input] input)

(clojure.core/defn- deser-segment [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-segment-id (input "Id"))) (clojure.core/contains? input "Document") (clojure.core/assoc :document (deser-segment-document (input "Document")))))

(clojure.core/defn- deser-fault-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "OtherCount") (clojure.core/assoc :other-count (deser-nullable-long (input "OtherCount"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-nullable-long (input "TotalCount")))))

(clojure.core/defn- deser-service-id [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Names") (clojure.core/assoc :names (deser-service-names (input "Names"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-string (input "AccountId"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type")))))

(clojure.core/defn- deser-value-with-service-ids [input] (clojure.core/cond-> {} (clojure.core/contains? input "AnnotationValue") (clojure.core/assoc :annotation-value (deser-annotation-value (input "AnnotationValue"))) (clojure.core/contains? input "ServiceIds") (clojure.core/assoc :service-ids (deser-service-ids (input "ServiceIds")))))

(clojure.core/defn- deser-nullable-long [input] input)

(clojure.core/defn- deser-http [input] (clojure.core/cond-> {} (clojure.core/contains? input "HttpURL") (clojure.core/assoc :http-url (deser-string (input "HttpURL"))) (clojure.core/contains? input "HttpStatus") (clojure.core/assoc :http-status (deser-nullable-integer (input "HttpStatus"))) (clojure.core/contains? input "HttpMethod") (clojure.core/assoc :http-method (deser-string (input "HttpMethod"))) (clojure.core/contains? input "UserAgent") (clojure.core/assoc :user-agent (deser-string (input "UserAgent"))) (clojure.core/contains? input "ClientIp") (clojure.core/assoc :client-ip (deser-string (input "ClientIp")))))

(clojure.core/defn- deser-trace-resource-ar-ns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-arn-detail coll))) input))

(clojure.core/defn- deser-service-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-error-root-causes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-root-cause coll))) input))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alias coll))) input))

(clojure.core/defn- deser-annotation-key [input] input)

(clojure.core/defn- deser-attribute-key [input] input)

(clojure.core/defn- deser-sampling-rule-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sampling-rule-record coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-response-time-root-causes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-response-time-root-cause coll))) input))

(clojure.core/defn- deser-fixed-rate [input] input)

(clojure.core/defn- deser-availability-zone-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name")))))

(clojure.core/defn- deser-unprocessed-trace-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trace-id coll))) input))

(clojure.core/defn- deser-segment-id [input] input)

(clojure.core/defn- deser-response-time-root-cause-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Names") (clojure.core/assoc :names (deser-service-names (input "Names"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-string (input "AccountId"))) (clojure.core/contains? input "EntityPath") (clojure.core/assoc :entity-path (deser-response-time-root-cause-entity-path (input "EntityPath"))) (clojure.core/contains? input "Inferred") (clojure.core/assoc :inferred (deser-nullable-boolean (input "Inferred")))))

(clojure.core/defn- deser-trace-users [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trace-user coll))) input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-fault-root-cause-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Names") (clojure.core/assoc :names (deser-service-names (input "Names"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-string (input "AccountId"))) (clojure.core/contains? input "EntityPath") (clojure.core/assoc :entity-path (deser-fault-root-cause-entity-path (input "EntityPath"))) (clojure.core/contains? input "Inferred") (clojure.core/assoc :inferred (deser-nullable-boolean (input "Inferred")))))

(clojure.core/defn- deser-sampling-target-document-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sampling-target-document coll))) input))

(clojure.core/defn- deser-fault-root-cause-entity-path [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fault-root-cause-entity coll))) input))

(clojure.core/defn- deser-service-name [input] input)

(clojure.core/defn- deser-version [input] input)

(clojure.core/defn- deser-trace-instance-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-id-detail coll))) input))

(clojure.core/defn- deser-nullable-integer [input] input)

(clojure.core/defn- deser-error-root-cause [input] (clojure.core/cond-> {} (clojure.core/contains? input "Services") (clojure.core/assoc :services (deser-error-root-cause-services (input "Services")))))

(clojure.core/defn- deser-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "ReferenceId") (clojure.core/assoc :reference-id (deser-nullable-integer (input "ReferenceId"))) (clojure.core/contains? input "ResponseTimeHistogram") (clojure.core/assoc :response-time-histogram (deser-histogram (input "ResponseTimeHistogram"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-timestamp (input "StartTime"))) (clojure.core/contains? input "SummaryStatistics") (clojure.core/assoc :summary-statistics (deser-service-statistics (input "SummaryStatistics"))) (clojure.core/contains? input "Root") (clojure.core/assoc :root (deser-nullable-boolean (input "Root"))) (clojure.core/contains? input "Names") (clojure.core/assoc :names (deser-service-names (input "Names"))) (clojure.core/contains? input "DurationHistogram") (clojure.core/assoc :duration-histogram (deser-histogram (input "DurationHistogram"))) (clojure.core/contains? input "Edges") (clojure.core/assoc :edges (deser-edge-list (input "Edges"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-string (input "AccountId"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-string (input "State"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name")))))

(clojure.core/defn- deser-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "GroupName") (clojure.core/assoc :group-name (deser-string (input "GroupName"))) (clojure.core/contains? input "GroupARN") (clojure.core/assoc :group-arn (deser-string (input "GroupARN"))) (clojure.core/contains? input "FilterExpression") (clojure.core/assoc :filter-expression (deser-string (input "FilterExpression")))))

(clojure.core/defn- deser-sampling-rule-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "SamplingRule") (clojure.core/assoc :sampling-rule (deser-sampling-rule (input "SamplingRule"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-timestamp (input "CreatedAt"))) (clojure.core/contains? input "ModifiedAt") (clojure.core/assoc :modified-at (deser-timestamp (input "ModifiedAt")))))

(clojure.core/defn- deser-response-time-root-cause-entity-path [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-response-time-root-cause-entity coll))) input))

(clojure.core/defn- deser-nullable-double [input] input)

(clojure.core/defn- deser-group-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group-summary coll))) input))

(clojure.core/defn- deser-encryption-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-string (input "KeyId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-encryption-status (input "Status"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-encryption-type (input "Type")))))

(clojure.core/defn- deser-edge-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "OkCount") (clojure.core/assoc :ok-count (deser-nullable-long (input "OkCount"))) (clojure.core/contains? input "ErrorStatistics") (clojure.core/assoc :error-statistics (deser-error-statistics (input "ErrorStatistics"))) (clojure.core/contains? input "FaultStatistics") (clojure.core/assoc :fault-statistics (deser-fault-statistics (input "FaultStatistics"))) (clojure.core/contains? input "TotalCount") (clojure.core/assoc :total-count (deser-nullable-long (input "TotalCount"))) (clojure.core/contains? input "TotalResponseTime") (clojure.core/assoc :total-response-time (deser-nullable-double (input "TotalResponseTime")))))

(clojure.core/defn- deser-root-cause-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-fault-root-cause-entity [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Exceptions") (clojure.core/assoc :exceptions (deser-root-cause-exceptions (input "Exceptions"))) (clojure.core/contains? input "Remote") (clojure.core/assoc :remote (deser-nullable-boolean (input "Remote")))))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-fault-root-cause [input] (clojure.core/cond-> {} (clojure.core/contains? input "Services") (clojure.core/assoc :services (deser-fault-root-cause-services (input "Services")))))

(clojure.core/defn- deser-segment-document [input] input)

(clojure.core/defn- deser-host [input] input)

(clojure.core/defn- deser-sampling-rule [input] (clojure.core/cond-> {:service-name (deser-service-name (input "ServiceName")), :http-method (deser-http-method (input "HTTPMethod")), :host (deser-host (input "Host")), :fixed-rate (deser-fixed-rate (input "FixedRate")), :priority (deser-priority (input "Priority")), :reservoir-size (deser-reservoir-size (input "ReservoirSize")), :url-path (deser-url-path (input "URLPath")), :resource-arn (deser-resource-arn (input "ResourceARN")), :version (deser-version (input "Version")), :service-type (deser-service-type (input "ServiceType"))} (clojure.core/contains? input "RuleName") (clojure.core/assoc :rule-name (deser-rule-name (input "RuleName"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attribute-map (input "Attributes"))) (clojure.core/contains? input "RuleARN") (clojure.core/assoc :rule-arn (deser-string (input "RuleARN")))))

(clojure.core/defn- deser-resource-arn-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "ARN") (clojure.core/assoc :arn (deser-string (input "ARN")))))

(clojure.core/defn- deser-http-method [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-histogram-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-double (input "Value"))) (clojure.core/contains? input "Count") (clojure.core/assoc :count (deser-integer (input "Count")))))

(clojure.core/defn- response-rule-limit-exceeded-exception ([input] (response-rule-limit-exceeded-exception nil input)) ([resultWrapper490211 input] (clojure.core/let [rawinput490210 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490212 {"Message" (rawinput490210 "Message")}] (clojure.core/cond-> {} (letvar490212 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar490212 ["Message"])))))))

(clojure.core/defn- response-get-sampling-rules-result ([input] (response-get-sampling-rules-result nil input)) ([resultWrapper490214 input] (clojure.core/let [rawinput490213 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490215 {"SamplingRuleRecords" (rawinput490213 "SamplingRuleRecords"), "NextToken" (rawinput490213 "NextToken")}] (clojure.core/cond-> {} (letvar490215 "SamplingRuleRecords") (clojure.core/assoc :sampling-rule-records (deser-sampling-rule-record-list (clojure.core/get-in letvar490215 ["SamplingRuleRecords"]))) (letvar490215 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar490215 ["NextToken"])))))))

(clojure.core/defn- response-update-group-result ([input] (response-update-group-result nil input)) ([resultWrapper490217 input] (clojure.core/let [rawinput490216 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490218 {"Group" (rawinput490216 "Group")}] (clojure.core/cond-> {} (letvar490218 "Group") (clojure.core/assoc :group (deser-group (clojure.core/get-in letvar490218 ["Group"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper490220 input] (clojure.core/let [rawinput490219 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490221 {"Message" (rawinput490219 "Message")}] (clojure.core/cond-> {} (letvar490221 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar490221 ["Message"])))))))

(clojure.core/defn- response-get-group-result ([input] (response-get-group-result nil input)) ([resultWrapper490223 input] (clojure.core/let [rawinput490222 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490224 {"Group" (rawinput490222 "Group")}] (clojure.core/cond-> {} (letvar490224 "Group") (clojure.core/assoc :group (deser-group (clojure.core/get-in letvar490224 ["Group"])))))))

(clojure.core/defn- response-get-encryption-config-result ([input] (response-get-encryption-config-result nil input)) ([resultWrapper490226 input] (clojure.core/let [rawinput490225 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490227 {"EncryptionConfig" (rawinput490225 "EncryptionConfig")}] (clojure.core/cond-> {} (letvar490227 "EncryptionConfig") (clojure.core/assoc :encryption-config (deser-encryption-config (clojure.core/get-in letvar490227 ["EncryptionConfig"])))))))

(clojure.core/defn- response-put-telemetry-records-result ([input] (response-put-telemetry-records-result nil input)) ([resultWrapper490229 input] (clojure.core/let [rawinput490228 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490230 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-trace-summaries-result ([input] (response-get-trace-summaries-result nil input)) ([resultWrapper490232 input] (clojure.core/let [rawinput490231 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490233 {"TraceSummaries" (rawinput490231 "TraceSummaries"), "ApproximateTime" (rawinput490231 "ApproximateTime"), "TracesProcessedCount" (rawinput490231 "TracesProcessedCount"), "NextToken" (rawinput490231 "NextToken")}] (clojure.core/cond-> {} (letvar490233 "TraceSummaries") (clojure.core/assoc :trace-summaries (deser-trace-summary-list (clojure.core/get-in letvar490233 ["TraceSummaries"]))) (letvar490233 "ApproximateTime") (clojure.core/assoc :approximate-time (deser-timestamp (clojure.core/get-in letvar490233 ["ApproximateTime"]))) (letvar490233 "TracesProcessedCount") (clojure.core/assoc :traces-processed-count (deser-nullable-long (clojure.core/get-in letvar490233 ["TracesProcessedCount"]))) (letvar490233 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar490233 ["NextToken"])))))))

(clojure.core/defn- response-update-sampling-rule-result ([input] (response-update-sampling-rule-result nil input)) ([resultWrapper490235 input] (clojure.core/let [rawinput490234 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490236 {"SamplingRuleRecord" (rawinput490234 "SamplingRuleRecord")}] (clojure.core/cond-> {} (letvar490236 "SamplingRuleRecord") (clojure.core/assoc :sampling-rule-record (deser-sampling-rule-record (clojure.core/get-in letvar490236 ["SamplingRuleRecord"])))))))

(clojure.core/defn- response-put-encryption-config-result ([input] (response-put-encryption-config-result nil input)) ([resultWrapper490238 input] (clojure.core/let [rawinput490237 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490239 {"EncryptionConfig" (rawinput490237 "EncryptionConfig")}] (clojure.core/cond-> {} (letvar490239 "EncryptionConfig") (clojure.core/assoc :encryption-config (deser-encryption-config (clojure.core/get-in letvar490239 ["EncryptionConfig"])))))))

(clojure.core/defn- response-put-trace-segments-result ([input] (response-put-trace-segments-result nil input)) ([resultWrapper490241 input] (clojure.core/let [rawinput490240 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490242 {"UnprocessedTraceSegments" (rawinput490240 "UnprocessedTraceSegments")}] (clojure.core/cond-> {} (letvar490242 "UnprocessedTraceSegments") (clojure.core/assoc :unprocessed-trace-segments (deser-unprocessed-trace-segment-list (clojure.core/get-in letvar490242 ["UnprocessedTraceSegments"])))))))

(clojure.core/defn- response-get-trace-graph-result ([input] (response-get-trace-graph-result nil input)) ([resultWrapper490244 input] (clojure.core/let [rawinput490243 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490245 {"Services" (rawinput490243 "Services"), "NextToken" (rawinput490243 "NextToken")}] (clojure.core/cond-> {} (letvar490245 "Services") (clojure.core/assoc :services (deser-service-list (clojure.core/get-in letvar490245 ["Services"]))) (letvar490245 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar490245 ["NextToken"])))))))

(clojure.core/defn- response-create-group-result ([input] (response-create-group-result nil input)) ([resultWrapper490247 input] (clojure.core/let [rawinput490246 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490248 {"Group" (rawinput490246 "Group")}] (clojure.core/cond-> {} (letvar490248 "Group") (clojure.core/assoc :group (deser-group (clojure.core/get-in letvar490248 ["Group"])))))))

(clojure.core/defn- response-get-sampling-statistic-summaries-result ([input] (response-get-sampling-statistic-summaries-result nil input)) ([resultWrapper490250 input] (clojure.core/let [rawinput490249 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490251 {"SamplingStatisticSummaries" (rawinput490249 "SamplingStatisticSummaries"), "NextToken" (rawinput490249 "NextToken")}] (clojure.core/cond-> {} (letvar490251 "SamplingStatisticSummaries") (clojure.core/assoc :sampling-statistic-summaries (deser-sampling-statistic-summary-list (clojure.core/get-in letvar490251 ["SamplingStatisticSummaries"]))) (letvar490251 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar490251 ["NextToken"])))))))

(clojure.core/defn- response-create-sampling-rule-result ([input] (response-create-sampling-rule-result nil input)) ([resultWrapper490253 input] (clojure.core/let [rawinput490252 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490254 {"SamplingRuleRecord" (rawinput490252 "SamplingRuleRecord")}] (clojure.core/cond-> {} (letvar490254 "SamplingRuleRecord") (clojure.core/assoc :sampling-rule-record (deser-sampling-rule-record (clojure.core/get-in letvar490254 ["SamplingRuleRecord"])))))))

(clojure.core/defn- response-delete-sampling-rule-result ([input] (response-delete-sampling-rule-result nil input)) ([resultWrapper490256 input] (clojure.core/let [rawinput490255 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490257 {"SamplingRuleRecord" (rawinput490255 "SamplingRuleRecord")}] (clojure.core/cond-> {} (letvar490257 "SamplingRuleRecord") (clojure.core/assoc :sampling-rule-record (deser-sampling-rule-record (clojure.core/get-in letvar490257 ["SamplingRuleRecord"])))))))

(clojure.core/defn- response-delete-group-result ([input] (response-delete-group-result nil input)) ([resultWrapper490259 input] (clojure.core/let [rawinput490258 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490260 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-sampling-targets-result ([input] (response-get-sampling-targets-result nil input)) ([resultWrapper490262 input] (clojure.core/let [rawinput490261 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490263 {"SamplingTargetDocuments" (rawinput490261 "SamplingTargetDocuments"), "LastRuleModification" (rawinput490261 "LastRuleModification"), "UnprocessedStatistics" (rawinput490261 "UnprocessedStatistics")}] (clojure.core/cond-> {} (letvar490263 "SamplingTargetDocuments") (clojure.core/assoc :sampling-target-documents (deser-sampling-target-document-list (clojure.core/get-in letvar490263 ["SamplingTargetDocuments"]))) (letvar490263 "LastRuleModification") (clojure.core/assoc :last-rule-modification (deser-timestamp (clojure.core/get-in letvar490263 ["LastRuleModification"]))) (letvar490263 "UnprocessedStatistics") (clojure.core/assoc :unprocessed-statistics (deser-unprocessed-statistics-list (clojure.core/get-in letvar490263 ["UnprocessedStatistics"])))))))

(clojure.core/defn- response-get-groups-result ([input] (response-get-groups-result nil input)) ([resultWrapper490265 input] (clojure.core/let [rawinput490264 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490266 {"Groups" (rawinput490264 "Groups"), "NextToken" (rawinput490264 "NextToken")}] (clojure.core/cond-> {} (letvar490266 "Groups") (clojure.core/assoc :groups (deser-group-summary-list (clojure.core/get-in letvar490266 ["Groups"]))) (letvar490266 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar490266 ["NextToken"])))))))

(clojure.core/defn- response-get-service-graph-result ([input] (response-get-service-graph-result nil input)) ([resultWrapper490268 input] (clojure.core/let [rawinput490267 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490269 {"StartTime" (rawinput490267 "StartTime"), "EndTime" (rawinput490267 "EndTime"), "Services" (rawinput490267 "Services"), "ContainsOldGroupVersions" (rawinput490267 "ContainsOldGroupVersions"), "NextToken" (rawinput490267 "NextToken")}] (clojure.core/cond-> {} (letvar490269 "StartTime") (clojure.core/assoc :start-time (deser-timestamp (clojure.core/get-in letvar490269 ["StartTime"]))) (letvar490269 "EndTime") (clojure.core/assoc :end-time (deser-timestamp (clojure.core/get-in letvar490269 ["EndTime"]))) (letvar490269 "Services") (clojure.core/assoc :services (deser-service-list (clojure.core/get-in letvar490269 ["Services"]))) (letvar490269 "ContainsOldGroupVersions") (clojure.core/assoc :contains-old-group-versions (deser-boolean (clojure.core/get-in letvar490269 ["ContainsOldGroupVersions"]))) (letvar490269 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar490269 ["NextToken"])))))))

(clojure.core/defn- response-batch-get-traces-result ([input] (response-batch-get-traces-result nil input)) ([resultWrapper490271 input] (clojure.core/let [rawinput490270 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490272 {"Traces" (rawinput490270 "Traces"), "UnprocessedTraceIds" (rawinput490270 "UnprocessedTraceIds"), "NextToken" (rawinput490270 "NextToken")}] (clojure.core/cond-> {} (letvar490272 "Traces") (clojure.core/assoc :traces (deser-trace-list (clojure.core/get-in letvar490272 ["Traces"]))) (letvar490272 "UnprocessedTraceIds") (clojure.core/assoc :unprocessed-trace-ids (deser-unprocessed-trace-id-list (clojure.core/get-in letvar490272 ["UnprocessedTraceIds"]))) (letvar490272 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar490272 ["NextToken"])))))))

(clojure.core/defn- response-throttled-exception ([input] (response-throttled-exception nil input)) ([resultWrapper490274 input] (clojure.core/let [rawinput490273 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar490275 {"Message" (rawinput490273 "Message")}] (clojure.core/cond-> {} (letvar490275 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar490275 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.xray/attribute-map (clojure.spec.alpha/map-of :portkey.aws.xray/attribute-key :portkey.aws.xray/attribute-value))

(clojure.spec.alpha/def :portkey.aws.xray/trace-summary-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-summary))

(clojure.spec.alpha/def :portkey.aws.xray/service-list (clojure.spec.alpha/coll-of :portkey.aws.xray/service))

(clojure.spec.alpha/def :portkey.aws.xray.error-statistics/throttle-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.error-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.error-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray/error-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.error-statistics/throttle-count :portkey.aws.xray.error-statistics/other-count :portkey.aws.xray.error-statistics/total-count]))

(clojure.spec.alpha/def :portkey.aws.xray/segment-list (clojure.spec.alpha/coll-of :portkey.aws.xray/segment))

(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause/services (clojure.spec.alpha/and :portkey.aws.xray/response-time-root-cause-services))
(clojure.spec.alpha/def :portkey.aws.xray/response-time-root-cause (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.response-time-root-cause/services]))

(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/instance-ids (clojure.spec.alpha/and :portkey.aws.xray/trace-instance-ids))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/has-throttle (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/resource-ar-ns (clojure.spec.alpha/and :portkey.aws.xray/trace-resource-ar-ns))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/revision (clojure.spec.alpha/and :portkey.aws.xray/integer))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/has-error (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/response-time (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/duration (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/users (clojure.spec.alpha/and :portkey.aws.xray/trace-users))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/entry-point (clojure.spec.alpha/and :portkey.aws.xray/service-id))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/is-partial (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/has-fault (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/availability-zones (clojure.spec.alpha/and :portkey.aws.xray/trace-availability-zones))
(clojure.spec.alpha/def :portkey.aws.xray.trace-summary/id (clojure.spec.alpha/and :portkey.aws.xray/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray/trace-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.trace-summary/instance-ids :portkey.aws.xray.trace-summary/has-throttle :portkey.aws.xray.trace-summary/resource-ar-ns :portkey.aws.xray/annotations :portkey.aws.xray/fault-root-causes :portkey.aws.xray/service-ids :portkey.aws.xray.trace-summary/revision :portkey.aws.xray.trace-summary/has-error :portkey.aws.xray.trace-summary/response-time :portkey.aws.xray/http :portkey.aws.xray/error-root-causes :portkey.aws.xray.trace-summary/duration :portkey.aws.xray.trace-summary/users :portkey.aws.xray/response-time-root-causes :portkey.aws.xray.trace-summary/entry-point :portkey.aws.xray.trace-summary/is-partial :portkey.aws.xray.trace-summary/has-fault :portkey.aws.xray.trace-summary/availability-zones :portkey.aws.xray.trace-summary/id]))

(clojure.spec.alpha/def :portkey.aws.xray.annotation-value/number-value (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.annotation-value/boolean-value (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.annotation-value/string-value (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/annotation-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.annotation-value/number-value :portkey.aws.xray.annotation-value/boolean-value :portkey.aws.xray.annotation-value/string-value]))

(clojure.spec.alpha/def :portkey.aws.xray/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray/service-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-statistic-summaries-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-sampling-statistic-summaries-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-sampling-statistic-summaries-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.rule-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.xray/error-message))
(clojure.spec.alpha/def :portkey.aws.xray/rule-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.rule-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.xray/sampling-statistics-document-list (clojure.spec.alpha/coll-of :portkey.aws.xray/sampling-statistics-document :max-count 25))

(clojure.spec.alpha/def :portkey.aws.xray.edge/reference-id (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.edge/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.edge/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.edge/summary-statistics (clojure.spec.alpha/and :portkey.aws.xray/edge-statistics))
(clojure.spec.alpha/def :portkey.aws.xray.edge/response-time-histogram (clojure.spec.alpha/and :portkey.aws.xray/histogram))
(clojure.spec.alpha/def :portkey.aws.xray.edge/aliases (clojure.spec.alpha/and :portkey.aws.xray/alias-list))
(clojure.spec.alpha/def :portkey.aws.xray/edge (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.edge/reference-id :portkey.aws.xray.edge/start-time :portkey.aws.xray.edge/end-time :portkey.aws.xray.edge/summary-statistics :portkey.aws.xray.edge/response-time-histogram :portkey.aws.xray.edge/aliases]))

(clojure.spec.alpha/def :portkey.aws.xray/trace-availability-zones (clojure.spec.alpha/coll-of :portkey.aws.xray/availability-zone-detail))

(clojure.spec.alpha/def :portkey.aws.xray/histogram (clojure.spec.alpha/coll-of :portkey.aws.xray/histogram-entry))

(clojure.spec.alpha/def :portkey.aws.xray/trace-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace))

(clojure.spec.alpha/def :portkey.aws.xray/fault-root-cause-services (clojure.spec.alpha/coll-of :portkey.aws.xray/fault-root-cause-service))

(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-entity/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-entity/exceptions (clojure.spec.alpha/and :portkey.aws.xray/root-cause-exceptions))
(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-entity/remote (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray/error-root-cause-entity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.error-root-cause-entity/name :portkey.aws.xray.error-root-cause-entity/exceptions :portkey.aws.xray.error-root-cause-entity/remote]))

(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-request/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-request/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-request/sampling (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-trace-summaries-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.get-trace-summaries-request/start-time :portkey.aws.xray.get-trace-summaries-request/end-time] :opt-un [:portkey.aws.xray.get-trace-summaries-request/sampling :portkey.aws.xray/filter-expression :portkey.aws.xray.get-trace-summaries-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/edge-list (clojure.spec.alpha/coll-of :portkey.aws.xray/edge))

(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-rules-result/sampling-rule-records (clojure.spec.alpha/and :portkey.aws.xray/sampling-rule-record-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-rules-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-sampling-rules-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-sampling-rules-result/sampling-rule-records :portkey.aws.xray.get-sampling-rules-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.xray/update-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/group]))

(clojure.spec.alpha/def :portkey.aws.xray.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.xray/error-message))
(clojure.spec.alpha/def :portkey.aws.xray/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.xray/response-time-root-cause-services (clojure.spec.alpha/coll-of :portkey.aws.xray/response-time-root-cause-service))

(clojure.spec.alpha/def :portkey.aws.xray/encryption-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 3000))))

(clojure.spec.alpha/def :portkey.aws.xray/get-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/group]))

(clojure.spec.alpha/def :portkey.aws.xray.group-summary/group-name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.group-summary/group-arn (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.group-summary/filter-expression (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/group-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.group-summary/group-name :portkey.aws.xray.group-summary/group-arn :portkey.aws.xray.group-summary/filter-expression]))

(clojure.spec.alpha/def :portkey.aws.xray.trace/id (clojure.spec.alpha/and :portkey.aws.xray/trace-id))
(clojure.spec.alpha/def :portkey.aws.xray.trace/duration (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.trace/segments (clojure.spec.alpha/and :portkey.aws.xray/segment-list))
(clojure.spec.alpha/def :portkey.aws.xray/trace (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.trace/id :portkey.aws.xray.trace/duration :portkey.aws.xray.trace/segments]))

(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-rules-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-sampling-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-sampling-rules-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/get-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/encryption-config]))

(clojure.spec.alpha/def :portkey.aws.xray/error-root-cause-services (clojure.spec.alpha/coll-of :portkey.aws.xray/error-root-cause-service))

(clojure.spec.alpha/def :portkey.aws.xray/put-telemetry-records-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.trace-user/user-name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/trace-user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.trace-user/user-name :portkey.aws.xray/service-ids]))

(clojure.spec.alpha/def :portkey.aws.xray/unprocessed-trace-segment-list (clojure.spec.alpha/coll-of :portkey.aws.xray/unprocessed-trace-segment))

(clojure.spec.alpha/def :portkey.aws.xray/trace-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 35))))

(clojure.spec.alpha/def :portkey.aws.xray/annotations (clojure.spec.alpha/map-of :portkey.aws.xray/annotation-key :portkey.aws.xray/values-with-service-ids))

(clojure.spec.alpha/def :portkey.aws.xray.alias/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.alias/names (clojure.spec.alpha/and :portkey.aws.xray/alias-names))
(clojure.spec.alpha/def :portkey.aws.xray.alias/type (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/alias (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.alias/name :portkey.aws.xray.alias/names :portkey.aws.xray.alias/type]))

(clojure.spec.alpha/def :portkey.aws.xray/encryption-status #{"UPDATING" :active "ACTIVE" :updating})

(clojure.spec.alpha/def :portkey.aws.xray/unprocessed-statistics-list (clojure.spec.alpha/coll-of :portkey.aws.xray/unprocessed-statistics))

(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-service/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-service/names (clojure.spec.alpha/and :portkey.aws.xray/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-service/type (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-service/account-id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-service/entity-path (clojure.spec.alpha/and :portkey.aws.xray/error-root-cause-entity-path))
(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause-service/inferred (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray/error-root-cause-service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.error-root-cause-service/name :portkey.aws.xray.error-root-cause-service/names :portkey.aws.xray.error-root-cause-service/type :portkey.aws.xray.error-root-cause-service/account-id :portkey.aws.xray.error-root-cause-service/entity-path :portkey.aws.xray.error-root-cause-service/inferred]))

(clojure.spec.alpha/def :portkey.aws.xray/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-request/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-request/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-service-graph-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.get-service-graph-request/start-time :portkey.aws.xray.get-service-graph-request/end-time] :opt-un [:portkey.aws.xray/group-name :portkey.aws.xray/group-arn :portkey.aws.xray.get-service-graph-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/update-sampling-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray/sampling-rule-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-trace-segment/id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-trace-segment/error-code (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-trace-segment/message (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/unprocessed-trace-segment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.unprocessed-trace-segment/id :portkey.aws.xray.unprocessed-trace-segment/error-code :portkey.aws.xray.unprocessed-trace-segment/message]))

(clojure.spec.alpha/def :portkey.aws.xray/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.xray/fault-root-causes (clojure.spec.alpha/coll-of :portkey.aws.xray/fault-root-cause))

(clojure.spec.alpha/def :portkey.aws.xray/root-cause-exceptions (clojure.spec.alpha/coll-of :portkey.aws.xray/root-cause-exception))

(clojure.spec.alpha/def :portkey.aws.xray/service-ids (clojure.spec.alpha/coll-of :portkey.aws.xray/service-id))

(clojure.spec.alpha/def :portkey.aws.xray/request-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray.instance-id-detail/id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/instance-id-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.instance-id-detail/id]))

(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-entity/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-entity/coverage (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-entity/remote (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray/response-time-root-cause-entity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.response-time-root-cause-entity/name :portkey.aws.xray.response-time-root-cause-entity/coverage :portkey.aws.xray.response-time-root-cause-entity/remote]))

(clojure.spec.alpha/def :portkey.aws.xray/telemetry-record-list (clojure.spec.alpha/coll-of :portkey.aws.xray/telemetry-record))

(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-result/trace-summaries (clojure.spec.alpha/and :portkey.aws.xray/trace-summary-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-result/approximate-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-result/traces-processed-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-summaries-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-trace-summaries-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-trace-summaries-result/trace-summaries :portkey.aws.xray.get-trace-summaries-result/approximate-time :portkey.aws.xray.get-trace-summaries-result/traces-processed-count :portkey.aws.xray.get-trace-summaries-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/priority (clojure.spec.alpha/int-in 1 9999))

(clojure.spec.alpha/def :portkey.aws.xray/hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.xray/url-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.xray/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.sampling-statistic-summary/rule-name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-statistic-summary/request-count (clojure.spec.alpha/and :portkey.aws.xray/integer))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-statistic-summary/borrow-count (clojure.spec.alpha/and :portkey.aws.xray/integer))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-statistic-summary/sampled-count (clojure.spec.alpha/and :portkey.aws.xray/integer))
(clojure.spec.alpha/def :portkey.aws.xray/sampling-statistic-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.sampling-statistic-summary/rule-name :portkey.aws.xray/timestamp :portkey.aws.xray.sampling-statistic-summary/request-count :portkey.aws.xray.sampling-statistic-summary/borrow-count :portkey.aws.xray.sampling-statistic-summary/sampled-count]))

(clojure.spec.alpha/def :portkey.aws.xray.get-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/get-groups-next-token))
(clojure.spec.alpha/def :portkey.aws.xray/get-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-groups-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/error-root-cause-entity-path (clojure.spec.alpha/coll-of :portkey.aws.xray/error-root-cause-entity))

(clojure.spec.alpha/def :portkey.aws.xray/encryption-type #{"KMS" "NONE" :kms :none})

(clojure.spec.alpha/def :portkey.aws.xray/update-sampling-rule-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/sampling-rule-record]))

(clojure.spec.alpha/def :portkey.aws.xray.service-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.service-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.service-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray/service-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.service-statistics/ok-count :portkey.aws.xray/error-statistics :portkey.aws.xray/fault-statistics :portkey.aws.xray.service-statistics/total-count :portkey.aws.xray.service-statistics/total-response-time]))

(clojure.spec.alpha/def :portkey.aws.xray/reservoir-size (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray/sampling-statistic-summary-list (clojure.spec.alpha/coll-of :portkey.aws.xray/sampling-statistic-summary))

(clojure.spec.alpha/def :portkey.aws.xray.sampling-target-document/rule-name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-target-document/fixed-rate (clojure.spec.alpha/and :portkey.aws.xray/double))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-target-document/reservoir-quota (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-target-document/reservoir-quota-ttl (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-target-document/interval (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray/sampling-target-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.sampling-target-document/rule-name :portkey.aws.xray.sampling-target-document/fixed-rate :portkey.aws.xray.sampling-target-document/reservoir-quota :portkey.aws.xray.sampling-target-document/reservoir-quota-ttl :portkey.aws.xray.sampling-target-document/interval]))

(clojure.spec.alpha/def :portkey.aws.xray/alias-names (clojure.spec.alpha/coll-of :portkey.aws.xray/string))

(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/timeout-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/connection-refused-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/http-code-4-xx-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/http-code-5-xx-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/unknown-host-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.backend-connection-errors/other-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray/backend-connection-errors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.backend-connection-errors/timeout-count :portkey.aws.xray.backend-connection-errors/connection-refused-count :portkey.aws.xray.backend-connection-errors/http-code-4-xx-count :portkey.aws.xray.backend-connection-errors/http-code-5-xx-count :portkey.aws.xray.backend-connection-errors/unknown-host-count :portkey.aws.xray.backend-connection-errors/other-count]))

(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-statistics/rule-name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-statistics/error-code (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.unprocessed-statistics/message (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/unprocessed-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.unprocessed-statistics/rule-name :portkey.aws.xray.unprocessed-statistics/error-code :portkey.aws.xray.unprocessed-statistics/message]))

(clojure.spec.alpha/def :portkey.aws.xray/values-with-service-ids (clojure.spec.alpha/coll-of :portkey.aws.xray/value-with-service-ids))

(clojure.spec.alpha/def :portkey.aws.xray/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.xray/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.xray.segment/id (clojure.spec.alpha/and :portkey.aws.xray/segment-id))
(clojure.spec.alpha/def :portkey.aws.xray.segment/document (clojure.spec.alpha/and :portkey.aws.xray/segment-document))
(clojure.spec.alpha/def :portkey.aws.xray/segment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.segment/id :portkey.aws.xray.segment/document]))

(clojure.spec.alpha/def :portkey.aws.xray.fault-statistics/other-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.fault-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray/fault-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.fault-statistics/other-count :portkey.aws.xray.fault-statistics/total-count]))

(clojure.spec.alpha/def :portkey.aws.xray.service-id/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.service-id/names (clojure.spec.alpha/and :portkey.aws.xray/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.service-id/account-id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.service-id/type (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/service-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.service-id/name :portkey.aws.xray.service-id/names :portkey.aws.xray.service-id/account-id :portkey.aws.xray.service-id/type]))

(clojure.spec.alpha/def :portkey.aws.xray.put-trace-segments-request/trace-segment-documents (clojure.spec.alpha/and :portkey.aws.xray/trace-segment-document-list))
(clojure.spec.alpha/def :portkey.aws.xray/put-trace-segments-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.put-trace-segments-request/trace-segment-documents] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray/value-with-service-ids (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/annotation-value :portkey.aws.xray/service-ids]))

(clojure.spec.alpha/def :portkey.aws.xray/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.xray.http/http-url (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.http/http-status (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.http/http-method (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.http/user-agent (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.http/client-ip (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/http (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.http/http-url :portkey.aws.xray.http/http-status :portkey.aws.xray.http/http-method :portkey.aws.xray.http/user-agent :portkey.aws.xray.http/client-ip]))

(clojure.spec.alpha/def :portkey.aws.xray/trace-resource-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.xray/resource-arn-detail))

(clojure.spec.alpha/def :portkey.aws.xray/service-names (clojure.spec.alpha/coll-of :portkey.aws.xray/string))

(clojure.spec.alpha/def :portkey.aws.xray.delete-sampling-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.delete-sampling-rule-request/rule-arn (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/delete-sampling-rule-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.delete-sampling-rule-request/rule-name :portkey.aws.xray.delete-sampling-rule-request/rule-arn]))

(clojure.spec.alpha/def :portkey.aws.xray/put-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/encryption-config]))

(clojure.spec.alpha/def :portkey.aws.xray/error-root-causes (clojure.spec.alpha/coll-of :portkey.aws.xray/error-root-cause))

(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/batch-get-traces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.batch-get-traces-request/trace-ids] :opt-un [:portkey.aws.xray.batch-get-traces-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/trace-segment-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray/delete-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/group-name :portkey.aws.xray/group-arn]))

(clojure.spec.alpha/def :portkey.aws.xray/alias-list (clojure.spec.alpha/coll-of :portkey.aws.xray/alias))

(clojure.spec.alpha/def :portkey.aws.xray/annotation-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-targets-request/sampling-statistics-documents (clojure.spec.alpha/and :portkey.aws.xray/sampling-statistics-document-list))
(clojure.spec.alpha/def :portkey.aws.xray/get-sampling-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.get-sampling-targets-request/sampling-statistics-documents] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray/attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.xray/sampling-rule-record-list (clojure.spec.alpha/coll-of :portkey.aws.xray/sampling-rule-record))

(clojure.spec.alpha/def :portkey.aws.xray/ec-2-instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.xray.put-trace-segments-result/unprocessed-trace-segments (clojure.spec.alpha/and :portkey.aws.xray/unprocessed-trace-segment-list))
(clojure.spec.alpha/def :portkey.aws.xray/put-trace-segments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.put-trace-segments-result/unprocessed-trace-segments]))

(clojure.spec.alpha/def :portkey.aws.xray/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.xray/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.put-telemetry-records-request/telemetry-records (clojure.spec.alpha/and :portkey.aws.xray/telemetry-record-list))
(clojure.spec.alpha/def :portkey.aws.xray/put-telemetry-records-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.put-telemetry-records-request/telemetry-records] :opt-un [:portkey.aws.xray/ec-2-instance-id :portkey.aws.xray/hostname :portkey.aws.xray/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.xray.get-trace-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-trace-graph-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-trace-graph-result/services :portkey.aws.xray.get-trace-graph-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/create-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/group]))

(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-statistic-summaries-result/sampling-statistic-summaries (clojure.spec.alpha/and :portkey.aws.xray/sampling-statistic-summary-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-statistic-summaries-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-sampling-statistic-summaries-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-sampling-statistic-summaries-result/sampling-statistic-summaries :portkey.aws.xray.get-sampling-statistic-summaries-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/create-sampling-rule-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/sampling-rule-record]))

(clojure.spec.alpha/def :portkey.aws.xray/delete-sampling-rule-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/sampling-rule-record]))

(clojure.spec.alpha/def :portkey.aws.xray/delete-group-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-targets-result/sampling-target-documents (clojure.spec.alpha/and :portkey.aws.xray/sampling-target-document-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-targets-result/last-rule-modification (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-sampling-targets-result/unprocessed-statistics (clojure.spec.alpha/and :portkey.aws.xray/unprocessed-statistics-list))
(clojure.spec.alpha/def :portkey.aws.xray/get-sampling-targets-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-sampling-targets-result/sampling-target-documents :portkey.aws.xray.get-sampling-targets-result/last-rule-modification :portkey.aws.xray.get-sampling-targets-result/unprocessed-statistics]))

(clojure.spec.alpha/def :portkey.aws.xray/response-time-root-causes (clojure.spec.alpha/coll-of :portkey.aws.xray/response-time-root-cause))

(clojure.spec.alpha/def :portkey.aws.xray/fixed-rate clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray.availability-zone-detail/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/availability-zone-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.availability-zone-detail/name]))

(clojure.spec.alpha/def :portkey.aws.xray/unprocessed-trace-id-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-id))

(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule-update/priority (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule-update/reservoir-size (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule-update/attributes (clojure.spec.alpha/and :portkey.aws.xray/attribute-map))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule-update/fixed-rate (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule-update/rule-arn (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/sampling-rule-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/service-type :portkey.aws.xray/rule-name :portkey.aws.xray.sampling-rule-update/priority :portkey.aws.xray/url-path :portkey.aws.xray.sampling-rule-update/reservoir-size :portkey.aws.xray.sampling-rule-update/attributes :portkey.aws.xray.sampling-rule-update/fixed-rate :portkey.aws.xray/service-name :portkey.aws.xray/resource-arn :portkey.aws.xray.sampling-rule-update/rule-arn :portkey.aws.xray/host :portkey.aws.xray/http-method]))

(clojure.spec.alpha/def :portkey.aws.xray/segment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-service/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-service/names (clojure.spec.alpha/and :portkey.aws.xray/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-service/type (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-service/account-id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-service/entity-path (clojure.spec.alpha/and :portkey.aws.xray/response-time-root-cause-entity-path))
(clojure.spec.alpha/def :portkey.aws.xray.response-time-root-cause-service/inferred (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray/response-time-root-cause-service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.response-time-root-cause-service/name :portkey.aws.xray.response-time-root-cause-service/names :portkey.aws.xray.response-time-root-cause-service/type :portkey.aws.xray.response-time-root-cause-service/account-id :portkey.aws.xray.response-time-root-cause-service/entity-path :portkey.aws.xray.response-time-root-cause-service/inferred]))

(clojure.spec.alpha/def :portkey.aws.xray/sampled-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray.put-encryption-config-request/key-id (clojure.spec.alpha/and :portkey.aws.xray/encryption-key-id))
(clojure.spec.alpha/def :portkey.aws.xray.put-encryption-config-request/type (clojure.spec.alpha/and :portkey.aws.xray/encryption-type))
(clojure.spec.alpha/def :portkey.aws.xray/put-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.put-encryption-config-request/type] :opt-un [:portkey.aws.xray.put-encryption-config-request/key-id]))

(clojure.spec.alpha/def :portkey.aws.xray/trace-users (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-user))

(clojure.spec.alpha/def :portkey.aws.xray.get-groups-result/groups (clojure.spec.alpha/and :portkey.aws.xray/group-summary-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-groups-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-groups-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-groups-result/groups :portkey.aws.xray.get-groups-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.xray/create-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray/group-name] :opt-un [:portkey.aws.xray/filter-expression]))

(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-service/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-service/names (clojure.spec.alpha/and :portkey.aws.xray/service-names))
(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-service/type (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-service/account-id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-service/entity-path (clojure.spec.alpha/and :portkey.aws.xray/fault-root-cause-entity-path))
(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-service/inferred (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray/fault-root-cause-service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.fault-root-cause-service/name :portkey.aws.xray.fault-root-cause-service/names :portkey.aws.xray.fault-root-cause-service/type :portkey.aws.xray.fault-root-cause-service/account-id :portkey.aws.xray.fault-root-cause-service/entity-path :portkey.aws.xray.fault-root-cause-service/inferred]))

(clojure.spec.alpha/def :portkey.aws.xray/sampling-target-document-list (clojure.spec.alpha/coll-of :portkey.aws.xray/sampling-target-document))

(clojure.spec.alpha/def :portkey.aws.xray/fault-root-cause-entity-path (clojure.spec.alpha/coll-of :portkey.aws.xray/fault-root-cause-entity))

(clojure.spec.alpha/def :portkey.aws.xray/client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 24 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 24))))

(clojure.spec.alpha/def :portkey.aws.xray/service-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.xray/version (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray/trace-instance-ids (clojure.spec.alpha/coll-of :portkey.aws.xray/instance-id-detail))

(clojure.spec.alpha/def :portkey.aws.xray/borrow-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.xray/get-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/group-name :portkey.aws.xray/group-arn]))

(clojure.spec.alpha/def :portkey.aws.xray/trace-segment-document-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-segment-document))

(clojure.spec.alpha/def :portkey.aws.xray.telemetry-record/segments-received-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.telemetry-record/segments-sent-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.telemetry-record/segments-spillover-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray.telemetry-record/segments-rejected-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.xray/telemetry-record (clojure.spec.alpha/keys :req-un [:portkey.aws.xray/timestamp] :opt-un [:portkey.aws.xray.telemetry-record/segments-received-count :portkey.aws.xray.telemetry-record/segments-sent-count :portkey.aws.xray.telemetry-record/segments-spillover-count :portkey.aws.xray.telemetry-record/segments-rejected-count :portkey.aws.xray/backend-connection-errors]))

(clojure.spec.alpha/def :portkey.aws.xray/nullable-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.xray/get-groups-next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.xray.error-root-cause/services (clojure.spec.alpha/and :portkey.aws.xray/error-root-cause-services))
(clojure.spec.alpha/def :portkey.aws.xray/error-root-cause (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.error-root-cause/services]))

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
(clojure.spec.alpha/def :portkey.aws.xray/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.service/end-time :portkey.aws.xray.service/type :portkey.aws.xray.service/reference-id :portkey.aws.xray.service/response-time-histogram :portkey.aws.xray.service/start-time :portkey.aws.xray.service/summary-statistics :portkey.aws.xray.service/root :portkey.aws.xray.service/names :portkey.aws.xray.service/duration-histogram :portkey.aws.xray.service/edges :portkey.aws.xray.service/account-id :portkey.aws.xray.service/state :portkey.aws.xray.service/name]))

(clojure.spec.alpha/def :portkey.aws.xray/group-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 400))))

(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/start-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/end-time (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/services (clojure.spec.alpha/and :portkey.aws.xray/service-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/contains-old-group-versions (clojure.spec.alpha/and :portkey.aws.xray/boolean))
(clojure.spec.alpha/def :portkey.aws.xray.get-service-graph-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-service-graph-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.get-service-graph-result/start-time :portkey.aws.xray.get-service-graph-result/end-time :portkey.aws.xray.get-service-graph-result/services :portkey.aws.xray.get-service-graph-result/contains-old-group-versions :portkey.aws.xray.get-service-graph-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-result/traces (clojure.spec.alpha/and :portkey.aws.xray/trace-list))
(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-result/unprocessed-trace-ids (clojure.spec.alpha/and :portkey.aws.xray/unprocessed-trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.batch-get-traces-result/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/batch-get-traces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.batch-get-traces-result/traces :portkey.aws.xray.batch-get-traces-result/unprocessed-trace-ids :portkey.aws.xray.batch-get-traces-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.group/group-name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.group/group-arn (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.group/filter-expression (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.group/group-name :portkey.aws.xray.group/group-arn :portkey.aws.xray.group/filter-expression]))

(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule-record/created-at (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule-record/modified-at (clojure.spec.alpha/and :portkey.aws.xray/timestamp))
(clojure.spec.alpha/def :portkey.aws.xray/sampling-rule-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/sampling-rule :portkey.aws.xray.sampling-rule-record/created-at :portkey.aws.xray.sampling-rule-record/modified-at]))

(clojure.spec.alpha/def :portkey.aws.xray/response-time-root-cause-entity-path (clojure.spec.alpha/coll-of :portkey.aws.xray/response-time-root-cause-entity))

(clojure.spec.alpha/def :portkey.aws.xray/nullable-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.xray/group-summary-list (clojure.spec.alpha/coll-of :portkey.aws.xray/group-summary))

(clojure.spec.alpha/def :portkey.aws.xray.encryption-config/key-id (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.encryption-config/status (clojure.spec.alpha/and :portkey.aws.xray/encryption-status))
(clojure.spec.alpha/def :portkey.aws.xray.encryption-config/type (clojure.spec.alpha/and :portkey.aws.xray/encryption-type))
(clojure.spec.alpha/def :portkey.aws.xray/encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.encryption-config/key-id :portkey.aws.xray.encryption-config/status :portkey.aws.xray.encryption-config/type]))

(clojure.spec.alpha/def :portkey.aws.xray.edge-statistics/ok-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.edge-statistics/total-count (clojure.spec.alpha/and :portkey.aws.xray/nullable-long))
(clojure.spec.alpha/def :portkey.aws.xray.edge-statistics/total-response-time (clojure.spec.alpha/and :portkey.aws.xray/nullable-double))
(clojure.spec.alpha/def :portkey.aws.xray/edge-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.edge-statistics/ok-count :portkey.aws.xray/error-statistics :portkey.aws.xray/fault-statistics :portkey.aws.xray.edge-statistics/total-count :portkey.aws.xray.edge-statistics/total-response-time]))

(clojure.spec.alpha/def :portkey.aws.xray/create-sampling-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray/sampling-rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray.root-cause-exception/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.root-cause-exception/message (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/root-cause-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.root-cause-exception/name :portkey.aws.xray.root-cause-exception/message]))

(clojure.spec.alpha/def :portkey.aws.xray/trace-id-list (clojure.spec.alpha/coll-of :portkey.aws.xray/trace-id))

(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-entity/name (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-entity/exceptions (clojure.spec.alpha/and :portkey.aws.xray/root-cause-exceptions))
(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause-entity/remote (clojure.spec.alpha/and :portkey.aws.xray/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.xray/fault-root-cause-entity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.fault-root-cause-entity/name :portkey.aws.xray.fault-root-cause-entity/exceptions :portkey.aws.xray.fault-root-cause-entity/remote]))

(clojure.spec.alpha/def :portkey.aws.xray/sampling-statistics-document (clojure.spec.alpha/keys :req-un [:portkey.aws.xray/rule-name :portkey.aws.xray/client-id :portkey.aws.xray/timestamp :portkey.aws.xray/request-count :portkey.aws.xray/sampled-count] :opt-un [:portkey.aws.xray/borrow-count]))

(clojure.spec.alpha/def :portkey.aws.xray/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.xray.fault-root-cause/services (clojure.spec.alpha/and :portkey.aws.xray/fault-root-cause-services))
(clojure.spec.alpha/def :portkey.aws.xray/fault-root-cause (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.fault-root-cause/services]))

(clojure.spec.alpha/def :portkey.aws.xray.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.xray/error-message))
(clojure.spec.alpha/def :portkey.aws.xray/throttled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.throttled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.xray/get-encryption-config-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.xray/segment-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__)))))

(clojure.spec.alpha/def :portkey.aws.xray/host (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.xray/update-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray/group-name :portkey.aws.xray/group-arn :portkey.aws.xray/filter-expression]))

(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule/attributes (clojure.spec.alpha/and :portkey.aws.xray/attribute-map))
(clojure.spec.alpha/def :portkey.aws.xray.sampling-rule/rule-arn (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/sampling-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.xray/resource-arn :portkey.aws.xray/priority :portkey.aws.xray/fixed-rate :portkey.aws.xray/reservoir-size :portkey.aws.xray/service-name :portkey.aws.xray/service-type :portkey.aws.xray/host :portkey.aws.xray/http-method :portkey.aws.xray/url-path :portkey.aws.xray/version] :opt-un [:portkey.aws.xray/rule-name :portkey.aws.xray.sampling-rule/attributes :portkey.aws.xray.sampling-rule/rule-arn]))

(clojure.spec.alpha/def :portkey.aws.xray.get-trace-graph-request/trace-ids (clojure.spec.alpha/and :portkey.aws.xray/trace-id-list))
(clojure.spec.alpha/def :portkey.aws.xray.get-trace-graph-request/next-token (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/get-trace-graph-request (clojure.spec.alpha/keys :req-un [:portkey.aws.xray.get-trace-graph-request/trace-ids] :opt-un [:portkey.aws.xray.get-trace-graph-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.xray.resource-arn-detail/arn (clojure.spec.alpha/and :portkey.aws.xray/string))
(clojure.spec.alpha/def :portkey.aws.xray/resource-arn-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.resource-arn-detail/arn]))

(clojure.spec.alpha/def :portkey.aws.xray/http-method (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 10))))

(clojure.spec.alpha/def :portkey.aws.xray/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.xray.histogram-entry/value (clojure.spec.alpha/and :portkey.aws.xray/double))
(clojure.spec.alpha/def :portkey.aws.xray.histogram-entry/count (clojure.spec.alpha/and :portkey.aws.xray/integer))
(clojure.spec.alpha/def :portkey.aws.xray/histogram-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.xray.histogram-entry/value :portkey.aws.xray.histogram-entry/count]))

(clojure.core/defn delete-group "Deletes a group resource." ([] (delete-group {})) ([delete-group-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-group-request delete-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/delete-group-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/DeleteGroup", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/delete-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGroup", :http.request.configuration/output-deser-fn response-delete-group-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/? :portkey.aws.xray/delete-group-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/delete-group-result))

(clojure.core/defn update-sampling-rule "Modifies a sampling rule's configuration." ([update-sampling-rule-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-sampling-rule-request update-sampling-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/update-sampling-rule-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/UpdateSamplingRule", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/update-sampling-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSamplingRule", :http.request.configuration/output-deser-fn response-update-sampling-rule-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef update-sampling-rule :args (clojure.spec.alpha/tuple :portkey.aws.xray/update-sampling-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/update-sampling-rule-result))

(clojure.core/defn get-sampling-rules "Retrieves all sampling rules." ([] (get-sampling-rules {})) ([get-sampling-rules-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-sampling-rules-request get-sampling-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-sampling-rules-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/GetSamplingRules", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-sampling-rules-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSamplingRules", :http.request.configuration/output-deser-fn response-get-sampling-rules-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-sampling-rules :args (clojure.spec.alpha/? :portkey.aws.xray/get-sampling-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-sampling-rules-result))

(clojure.core/defn delete-sampling-rule "Deletes a sampling rule." ([] (delete-sampling-rule {})) ([delete-sampling-rule-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-sampling-rule-request delete-sampling-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/delete-sampling-rule-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/DeleteSamplingRule", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/delete-sampling-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSamplingRule", :http.request.configuration/output-deser-fn response-delete-sampling-rule-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef delete-sampling-rule :args (clojure.spec.alpha/? :portkey.aws.xray/delete-sampling-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/delete-sampling-rule-result))

(clojure.core/defn put-encryption-config "Updates the encryption configuration for X-Ray data." ([put-encryption-config-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-put-encryption-config-request put-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/put-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/PutEncryptionConfig", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/put-encryption-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutEncryptionConfig", :http.request.configuration/output-deser-fn response-put-encryption-config-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef put-encryption-config :args (clojure.spec.alpha/tuple :portkey.aws.xray/put-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/put-encryption-config-result))

(clojure.core/defn get-sampling-statistic-summaries "Retrieves information about recent sampling results for all sampling rules." ([] (get-sampling-statistic-summaries {})) ([get-sampling-statistic-summaries-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-sampling-statistic-summaries-request get-sampling-statistic-summaries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-sampling-statistic-summaries-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/SamplingStatisticSummaries", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-sampling-statistic-summaries-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSamplingStatisticSummaries", :http.request.configuration/output-deser-fn response-get-sampling-statistic-summaries-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-sampling-statistic-summaries :args (clojure.spec.alpha/? :portkey.aws.xray/get-sampling-statistic-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-sampling-statistic-summaries-result))

(clojure.core/defn get-groups "Retrieves all active group details." ([] (get-groups {})) ([get-groups-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-groups-request get-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-groups-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/Groups", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGroups", :http.request.configuration/output-deser-fn response-get-groups-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-groups :args (clojure.spec.alpha/? :portkey.aws.xray/get-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-groups-result))

(clojure.core/defn get-sampling-targets "Requests a sampling quota for rules that the service is using to sample\nrequests." ([get-sampling-targets-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-sampling-targets-request get-sampling-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-sampling-targets-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/SamplingTargets", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-sampling-targets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSamplingTargets", :http.request.configuration/output-deser-fn response-get-sampling-targets-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-sampling-targets :args (clojure.spec.alpha/tuple :portkey.aws.xray/get-sampling-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-sampling-targets-result))

(clojure.core/defn get-group "Retrieves group resource details." ([] (get-group {})) ([get-group-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-group-request get-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-group-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/GetGroup", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGroup", :http.request.configuration/output-deser-fn response-get-group-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/? :portkey.aws.xray/get-group-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-group-result))

(clojure.core/defn update-group "Updates a group resource." ([] (update-group {})) ([update-group-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-group-request update-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/update-group-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/UpdateGroup", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/update-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGroup", :http.request.configuration/output-deser-fn response-update-group-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/? :portkey.aws.xray/update-group-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/update-group-result))

(clojure.core/defn get-encryption-config "Retrieves the current encryption configuration for X-Ray data." ([] (get-encryption-config {})) ([get-encryption-config-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-encryption-config-request get-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/EncryptionConfig", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-encryption-config-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEncryptionConfig", :http.request.configuration/output-deser-fn response-get-encryption-config-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-encryption-config :args (clojure.spec.alpha/? :portkey.aws.xray/get-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-encryption-config-result))

(clojure.core/defn get-service-graph "Retrieves a document that describes services that process incoming requests, and\ndownstream services that they call as a result. Root services process incoming\nrequests and make calls to downstream services. Root services are applications\nthat use the AWS X-Ray SDK. Downstream services can be other applications, AWS\nresources, HTTP web APIs, or SQL databases." ([get-service-graph-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-service-graph-request get-service-graph-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-service-graph-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/ServiceGraph", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-service-graph-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetServiceGraph", :http.request.configuration/output-deser-fn response-get-service-graph-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-service-graph :args (clojure.spec.alpha/tuple :portkey.aws.xray/get-service-graph-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-service-graph-result))

(clojure.core/defn get-trace-graph "Retrieves a service graph for one or more specific trace IDs." ([get-trace-graph-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-trace-graph-request get-trace-graph-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-trace-graph-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/TraceGraph", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-trace-graph-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTraceGraph", :http.request.configuration/output-deser-fn response-get-trace-graph-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-trace-graph :args (clojure.spec.alpha/tuple :portkey.aws.xray/get-trace-graph-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-trace-graph-result))

(clojure.core/defn get-trace-summaries "Retrieves IDs and metadata for traces available for a specified time frame using\nan optional filter. To get the full traces, pass the trace IDs to\nBatchGetTraces.\n A filter expression can target traced requests that hit specific service nodes\nor edges, have errors, or come from a known user. For example, the following\nfilter expression targets traces that pass through api.example.com:\n service(\"api.example.com\")\n This filter expression finds traces that have an annotation named account with\nthe value 12345:\n annotation.account = \"12345\"\n For a full list of indexed fields and keywords that you can use in filter\nexpressions, see Using Filter Expressions\n(http://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html) in\nthe AWS X-Ray Developer Guide." ([get-trace-summaries-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-trace-summaries-request get-trace-summaries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/get-trace-summaries-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/TraceSummaries", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/get-trace-summaries-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTraceSummaries", :http.request.configuration/output-deser-fn response-get-trace-summaries-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef get-trace-summaries :args (clojure.spec.alpha/tuple :portkey.aws.xray/get-trace-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/get-trace-summaries-result))

(clojure.core/defn put-trace-segments "Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment\ndocuments and sends them to the X-Ray daemon, which uploads them in batches. A\nsegment document can be a completed segment, an in-progress segment, or an array\nof subsegments.\n Segments must include the following fields. For the full segment document\nschema, see AWS X-Ray Segment Documents\n(https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html)\nin the AWS X-Ray Developer Guide.\n Required Segment Document Fields\n * name - The name of the service that handled the request.\n * id - A 64-bit identifier for the segment, unique among segments in the same\ntrace, in 16 hexadecimal digits.\n * trace_id - A unique identifier that connects all segments and subsegments\noriginating from a single client request.\n * start_time - Time the segment or subsegment was created, in floating point\nseconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or\n1.480615200010E9.\n * end_time - Time the segment or subsegment was closed. For example,\n1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.\n * in_progress - Set to true instead of specifying an end_time to record that a\nsegment has been started, but is not complete. Send an in progress segment when\nyour application receives a request that will take a long time to serve, to\ntrace the fact that the request was received. When the response is sent, send\nthe complete segment to overwrite the in-progress segment.\n A trace_id consists of three numbers separated by hyphens. For example,\n1-58406520-a006649127e371903a2de979. This includes:\n Trace ID Format\n * The version number, i.e. 1.\n * The time of the original request, in Unix epoch time, in 8 hexadecimal\ndigits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200\nseconds, or 58406520 in hexadecimal.\n * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits." ([put-trace-segments-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-put-trace-segments-request put-trace-segments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/put-trace-segments-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/TraceSegments", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/put-trace-segments-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutTraceSegments", :http.request.configuration/output-deser-fn response-put-trace-segments-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef put-trace-segments :args (clojure.spec.alpha/tuple :portkey.aws.xray/put-trace-segments-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/put-trace-segments-result))

(clojure.core/defn create-sampling-rule "Creates a rule to control sampling behavior for instrumented applications.\nServices retrieve rules with GetSamplingRules, and evaluate each rule in\nascending order of priority for each request. If a rule matches, the service\nrecords a trace, borrowing it from the reservoir size. After 10 seconds, the\nservice reports back to X-Ray with GetSamplingTargets to get updated versions of\neach in-use rule. The updated rule contains a trace quota that the service can\nuse instead of borrowing from the reservoir." ([create-sampling-rule-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-sampling-rule-request create-sampling-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/create-sampling-rule-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/CreateSamplingRule", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/create-sampling-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSamplingRule", :http.request.configuration/output-deser-fn response-create-sampling-rule-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception, "RuleLimitExceededException" :portkey.aws.xray/rule-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-sampling-rule :args (clojure.spec.alpha/tuple :portkey.aws.xray/create-sampling-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/create-sampling-rule-result))

(clojure.core/defn create-group "Creates a group resource with a name and a filter expression." ([create-group-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-group-request create-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/create-group-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/CreateGroup", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/create-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateGroup", :http.request.configuration/output-deser-fn response-create-group-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.xray/create-group-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/create-group-result))

(clojure.core/defn put-telemetry-records "Used by the AWS X-Ray daemon to upload telemetry." ([put-telemetry-records-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-put-telemetry-records-request put-telemetry-records-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/put-telemetry-records-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/TelemetryRecords", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/put-telemetry-records-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutTelemetryRecords", :http.request.configuration/output-deser-fn response-put-telemetry-records-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef put-telemetry-records :args (clojure.spec.alpha/tuple :portkey.aws.xray/put-telemetry-records-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/put-telemetry-records-result))

(clojure.core/defn batch-get-traces "Retrieves a list of traces specified by ID. Each trace is a collection of\nsegment documents that originates from a single request. Use GetTraceSummaries\nto get a list of trace IDs." ([batch-get-traces-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-batch-get-traces-request batch-get-traces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.xray/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.xray/batch-get-traces-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/Traces", :http.request.configuration/version "2016-04-12", :http.request.configuration/service-id "XRay", :http.request.spec/input-spec :portkey.aws.xray/batch-get-traces-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetTraces", :http.request.configuration/output-deser-fn response-batch-get-traces-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.xray/invalid-request-exception, "ThrottledException" :portkey.aws.xray/throttled-exception}})))))
(clojure.spec.alpha/fdef batch-get-traces :args (clojure.spec.alpha/tuple :portkey.aws.xray/batch-get-traces-request) :ret (clojure.spec.alpha/and :portkey.aws.xray/batch-get-traces-result))
