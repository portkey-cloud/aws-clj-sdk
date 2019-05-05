(ns portkey.aws.athena (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "athena", :region "ap-northeast-1"},
    :ssl-common-name "athena.ap-northeast-1.amazonaws.com",
    :endpoint "https://athena.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "athena", :region "eu-west-1"},
    :ssl-common-name "athena.eu-west-1.amazonaws.com",
    :endpoint "https://athena.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "athena", :region "us-east-2"},
    :ssl-common-name "athena.us-east-2.amazonaws.com",
    :endpoint "https://athena.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "athena", :region "ap-southeast-2"},
    :ssl-common-name "athena.ap-southeast-2.amazonaws.com",
    :endpoint "https://athena.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "athena", :region "ap-southeast-1"},
    :ssl-common-name "athena.ap-southeast-1.amazonaws.com",
    :endpoint "https://athena.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "athena", :region "ap-northeast-2"},
    :ssl-common-name "athena.ap-northeast-2.amazonaws.com",
    :endpoint "https://athena.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "athena", :region "eu-central-1"},
    :ssl-common-name "athena.eu-central-1.amazonaws.com",
    :endpoint "https://athena.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "athena", :region "eu-west-2"},
    :ssl-common-name "athena.eu-west-2.amazonaws.com",
    :endpoint "https://athena.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "athena", :region "us-gov-west-1"},
    :ssl-common-name "athena.us-gov-west-1.amazonaws.com",
    :endpoint "https://athena.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "athena", :region "us-west-2"},
    :ssl-common-name "athena.us-west-2.amazonaws.com",
    :endpoint "https://athena.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "athena", :region "us-east-1"},
    :ssl-common-name "athena.us-east-1.amazonaws.com",
    :endpoint "https://athena.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "athena", :region "ap-south-1"},
    :ssl-common-name "athena.ap-south-1.amazonaws.com",
    :endpoint "https://athena.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-work-group-name)

(clojure.core/declare ser-work-group-configuration)

(clojure.core/declare ser-work-group-description-string)

(clojure.core/declare ser-query-execution-id)

(clojure.core/declare ser-boxed-boolean)

(clojure.core/declare ser-encryption-configuration)

(clojure.core/declare ser-work-group-state)

(clojure.core/declare ser-named-query-id-list)

(clojure.core/declare ser-amazon-resource-name)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-database-string)

(clojure.core/declare ser-encryption-option)

(clojure.core/declare ser-query-string)

(clojure.core/declare ser-named-query-id)

(clojure.core/declare ser-max-query-results)

(clojure.core/declare ser-result-configuration-updates)

(clojure.core/declare ser-work-group-configuration-updates)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-query-execution-context)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-query-execution-id-list)

(clojure.core/declare ser-max-tags-count)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-max-query-executions-count)

(clojure.core/declare ser-string)

(clojure.core/declare ser-name-string)

(clojure.core/declare ser-description-string)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-bytes-scanned-cutoff-value)

(clojure.core/declare ser-max-named-queries-count)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-result-configuration)

(clojure.core/declare ser-token)

(clojure.core/declare ser-max-work-groups-count)

(clojure.core/defn- ser-work-group-name [input] #:http.request.field{:value input, :shape "WorkGroupName"})

(clojure.core/defn- ser-work-group-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WorkGroupConfiguration", :type "structure"} (clojure.core/contains? input :result-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-configuration (input :result-configuration)) #:http.request.field{:name "ResultConfiguration", :shape "ResultConfiguration"})) (clojure.core/contains? input :enforce-work-group-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :enforce-work-group-configuration)) #:http.request.field{:name "EnforceWorkGroupConfiguration", :shape "BoxedBoolean"})) (clojure.core/contains? input :publish-cloud-watch-metrics-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :publish-cloud-watch-metrics-enabled)) #:http.request.field{:name "PublishCloudWatchMetricsEnabled", :shape "BoxedBoolean"})) (clojure.core/contains? input :bytes-scanned-cutoff-per-query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bytes-scanned-cutoff-value (input :bytes-scanned-cutoff-per-query)) #:http.request.field{:name "BytesScannedCutoffPerQuery", :shape "BytesScannedCutoffValue"}))))

(clojure.core/defn- ser-work-group-description-string [input] #:http.request.field{:value input, :shape "WorkGroupDescriptionString"})

(clojure.core/defn- ser-query-execution-id [input] #:http.request.field{:value input, :shape "QueryExecutionId"})

(clojure.core/defn- ser-boxed-boolean [input] #:http.request.field{:value input, :shape "BoxedBoolean"})

(clojure.core/defn- ser-encryption-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-encryption-option (:encryption-option input)) #:http.request.field{:name "EncryptionOption", :shape "EncryptionOption"})], :shape "EncryptionConfiguration", :type "structure"} (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key)) #:http.request.field{:name "KmsKey", :shape "String"}))))

(clojure.core/defn- ser-work-group-state [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "WorkGroupState"})

(clojure.core/defn- ser-named-query-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-named-query-id coll) #:http.request.field{:shape "NamedQueryId"}))) input), :shape "NamedQueryIdList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-amazon-resource-name [input] #:http.request.field{:value input, :shape "AmazonResourceName"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-database-string [input] #:http.request.field{:value input, :shape "DatabaseString"})

(clojure.core/defn- ser-encryption-option [input] #:http.request.field{:value (clojure.core/get {"SSE_S3" "SSE_S3", :sse-s-3 "SSE_S3", "SSE_KMS" "SSE_KMS", :sse-kms "SSE_KMS", "CSE_KMS" "CSE_KMS", :cse-kms "CSE_KMS"} input), :shape "EncryptionOption"})

(clojure.core/defn- ser-query-string [input] #:http.request.field{:value input, :shape "QueryString"})

(clojure.core/defn- ser-named-query-id [input] #:http.request.field{:value input, :shape "NamedQueryId"})

(clojure.core/defn- ser-max-query-results [input] #:http.request.field{:value input, :shape "MaxQueryResults"})

(clojure.core/defn- ser-result-configuration-updates [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResultConfigurationUpdates", :type "structure"} (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "String"})) (clojure.core/contains? input :remove-output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :remove-output-location)) #:http.request.field{:name "RemoveOutputLocation", :shape "BoxedBoolean"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"})) (clojure.core/contains? input :remove-encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :remove-encryption-configuration)) #:http.request.field{:name "RemoveEncryptionConfiguration", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-work-group-configuration-updates [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WorkGroupConfigurationUpdates", :type "structure"} (clojure.core/contains? input :enforce-work-group-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :enforce-work-group-configuration)) #:http.request.field{:name "EnforceWorkGroupConfiguration", :shape "BoxedBoolean"})) (clojure.core/contains? input :result-configuration-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-configuration-updates (input :result-configuration-updates)) #:http.request.field{:name "ResultConfigurationUpdates", :shape "ResultConfigurationUpdates"})) (clojure.core/contains? input :publish-cloud-watch-metrics-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :publish-cloud-watch-metrics-enabled)) #:http.request.field{:name "PublishCloudWatchMetricsEnabled", :shape "BoxedBoolean"})) (clojure.core/contains? input :bytes-scanned-cutoff-per-query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bytes-scanned-cutoff-value (input :bytes-scanned-cutoff-per-query)) #:http.request.field{:name "BytesScannedCutoffPerQuery", :shape "BytesScannedCutoffValue"})) (clojure.core/contains? input :remove-bytes-scanned-cutoff-per-query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :remove-bytes-scanned-cutoff-per-query)) #:http.request.field{:name "RemoveBytesScannedCutoffPerQuery", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-query-execution-context [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "QueryExecutionContext", :type "structure"} (clojure.core/contains? input :database) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-database-string (input :database)) #:http.request.field{:name "Database", :shape "DatabaseString"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-query-execution-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-query-execution-id coll) #:http.request.field{:shape "QueryExecutionId"}))) input), :shape "QueryExecutionIdList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-max-tags-count [input] #:http.request.field{:value input, :shape "MaxTagsCount"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-max-query-executions-count [input] #:http.request.field{:value input, :shape "MaxQueryExecutionsCount"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-name-string [input] #:http.request.field{:value input, :shape "NameString"})

(clojure.core/defn- ser-description-string [input] #:http.request.field{:value input, :shape "DescriptionString"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-bytes-scanned-cutoff-value [input] #:http.request.field{:value input, :shape "BytesScannedCutoffValue"})

(clojure.core/defn- ser-max-named-queries-count [input] #:http.request.field{:value input, :shape "MaxNamedQueriesCount"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-result-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResultConfiguration", :type "structure"} (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "String"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"}))))

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-max-work-groups-count [input] #:http.request.field{:value input, :shape "MaxWorkGroupsCount"})

(clojure.core/defn- req-list-work-groups-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-work-groups-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxWorkGroupsCount"}))))

(clojure.core/defn- req-get-work-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"})]}))

(clojure.core/defn- req-get-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id (input :named-query-id)) #:http.request.field{:name "NamedQueryId", :shape "NamedQueryId"})]}))

(clojure.core/defn- req-tag-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "AmazonResourceName"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-batch-get-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id-list (input :query-execution-ids)) #:http.request.field{:name "QueryExecutionIds", :shape "QueryExecutionIdList"})]}))

(clojure.core/defn- req-batch-get-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id-list (input :named-query-ids)) #:http.request.field{:name "NamedQueryIds", :shape "NamedQueryIdList"})]}))

(clojure.core/defn- req-get-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId"})]}))

(clojure.core/defn- req-stop-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId", :idempotency-token true})]}))

(clojure.core/defn- req-list-tags-for-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "AmazonResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-tags-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxTagsCount"}))))

(clojure.core/defn- req-get-query-results-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-query-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxQueryResults"}))))

(clojure.core/defn- req-untag-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-amazon-resource-name (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "AmazonResourceName"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-create-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-database-string (input :database)) #:http.request.field{:name "Database", :shape "DatabaseString"}) (clojure.core/into (ser-query-string (input :query-string)) #:http.request.field{:name "QueryString", :shape "QueryString"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "IdempotencyToken", :idempotency-token true})) (clojure.core/contains? input :work-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"}))))

(clojure.core/defn- req-start-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-string (input :query-string)) #:http.request.field{:name "QueryString", :shape "QueryString"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "IdempotencyToken", :idempotency-token true})) (clojure.core/contains? input :query-execution-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-execution-context (input :query-execution-context)) #:http.request.field{:name "QueryExecutionContext", :shape "QueryExecutionContext"})) (clojure.core/contains? input :result-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-configuration (input :result-configuration)) #:http.request.field{:name "ResultConfiguration", :shape "ResultConfiguration"})) (clojure.core/contains? input :work-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"}))))

(clojure.core/defn- req-list-query-executions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-query-executions-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxQueryExecutionsCount"})) (clojure.core/contains? input :work-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"}))))

(clojure.core/defn- req-update-work-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-description-string (input :description)) #:http.request.field{:name "Description", :shape "WorkGroupDescriptionString"})) (clojure.core/contains? input :configuration-updates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-configuration-updates (input :configuration-updates)) #:http.request.field{:name "ConfigurationUpdates", :shape "WorkGroupConfigurationUpdates"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-state (input :state)) #:http.request.field{:name "State", :shape "WorkGroupState"}))))

(clojure.core/defn- req-create-work-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-work-group-name (input :name)) #:http.request.field{:name "Name", :shape "WorkGroupName"})]} (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-configuration (input :configuration)) #:http.request.field{:name "Configuration", :shape "WorkGroupConfiguration"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-description-string (input :description)) #:http.request.field{:name "Description", :shape "WorkGroupDescriptionString"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-list-named-queries-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-named-queries-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxNamedQueriesCount"})) (clojure.core/contains? input :work-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"}))))

(clojure.core/defn- req-delete-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id (input :named-query-id)) #:http.request.field{:name "NamedQueryId", :shape "NamedQueryId", :idempotency-token true})]}))

(clojure.core/defn- req-delete-work-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-work-group-name (input :work-group)) #:http.request.field{:name "WorkGroup", :shape "WorkGroupName"})]} (clojure.core/contains? input :recursive-delete-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :recursive-delete-option)) #:http.request.field{:name "RecursiveDeleteOption", :shape "BoxedBoolean"}))))

(clojure.core/declare deser-unprocessed-named-query-id)

(clojure.core/declare deser-query-execution-state)

(clojure.core/declare deser-work-group-name)

(clojure.core/declare deser-work-group-configuration)

(clojure.core/declare deser-statement-type)

(clojure.core/declare deser-work-group-description-string)

(clojure.core/declare deser-query-execution-id)

(clojure.core/declare deser-boxed-boolean)

(clojure.core/declare deser-encryption-configuration)

(clojure.core/declare deser-work-group-state)

(clojure.core/declare deser-named-query-id-list)

(clojure.core/declare deser-amazon-resource-name)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-work-group)

(clojure.core/declare deser-database-string)

(clojure.core/declare deser-query-execution-status)

(clojure.core/declare deser-encryption-option)

(clojure.core/declare deser-query-string)

(clojure.core/declare deserdatum-string)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-named-query-id)

(clojure.core/declare deser-date)

(clojure.core/declare deser-row)

(clojure.core/declare deser-column-info)

(clojure.core/declare deser-throttle-reason)

(clojure.core/declare deser-named-query)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-query-execution-context)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-column-nullable)

(clojure.core/declare deser-query-execution-id-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-result-set)

(clojure.core/declare deser-result-set-metadata)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-name-string)

(clojure.core/declare deser-query-execution-statistics)

(clojure.core/declare deser-unprocessed-named-query-id-list)

(clojure.core/declare deser-description-string)

(clojure.core/declare deser-work-group-summary)

(clojure.core/declare deser-query-execution-list)

(clojure.core/declare deser-row-list)

(clojure.core/declare deser-unprocessed-query-execution-id)

(clojure.core/declare deser-long)

(clojure.core/declare deser-bytes-scanned-cutoff-value)

(clojure.core/declare deser-unprocessed-query-execution-id-list)

(clojure.core/declare deserdatum-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-column-info-list)

(clojure.core/declare deser-query-execution)

(clojure.core/declare deser-work-groups-list)

(clojure.core/declare deser-result-configuration)

(clojure.core/declare deser-named-query-list)

(clojure.core/declare deser-token)

(clojure.core/declare deser-datum)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-unprocessed-named-query-id [input] (clojure.core/cond-> {} (clojure.core/contains? input "NamedQueryId") (clojure.core/assoc :named-query-id (deser-named-query-id (input "NamedQueryId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-query-execution-state [input] (clojure.core/get {"QUEUED" :queued, "RUNNING" :running, "SUCCEEDED" :succeeded, "FAILED" :failed, "CANCELLED" :cancelled} input))

(clojure.core/defn- deser-work-group-name [input] input)

(clojure.core/defn- deser-work-group-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResultConfiguration") (clojure.core/assoc :result-configuration (deser-result-configuration (input "ResultConfiguration"))) (clojure.core/contains? input "EnforceWorkGroupConfiguration") (clojure.core/assoc :enforce-work-group-configuration (deser-boxed-boolean (input "EnforceWorkGroupConfiguration"))) (clojure.core/contains? input "PublishCloudWatchMetricsEnabled") (clojure.core/assoc :publish-cloud-watch-metrics-enabled (deser-boxed-boolean (input "PublishCloudWatchMetricsEnabled"))) (clojure.core/contains? input "BytesScannedCutoffPerQuery") (clojure.core/assoc :bytes-scanned-cutoff-per-query (deser-bytes-scanned-cutoff-value (input "BytesScannedCutoffPerQuery")))))

(clojure.core/defn- deser-statement-type [input] (clojure.core/get {"DDL" :ddl, "DML" :dml, "UTILITY" :utility} input))

(clojure.core/defn- deser-work-group-description-string [input] input)

(clojure.core/defn- deser-query-execution-id [input] input)

(clojure.core/defn- deser-boxed-boolean [input] input)

(clojure.core/defn- deser-encryption-configuration [input] (clojure.core/cond-> {:encryption-option (deser-encryption-option (input "EncryptionOption"))} (clojure.core/contains? input "KmsKey") (clojure.core/assoc :kms-key (deser-string (input "KmsKey")))))

(clojure.core/defn- deser-work-group-state [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-named-query-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-named-query-id coll))) input))

(clojure.core/defn- deser-amazon-resource-name [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-work-group [input] (clojure.core/cond-> {:name (deser-work-group-name (input "Name"))} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-work-group-state (input "State"))) (clojure.core/contains? input "Configuration") (clojure.core/assoc :configuration (deser-work-group-configuration (input "Configuration"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-work-group-description-string (input "Description"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-date (input "CreationTime")))))

(clojure.core/defn- deser-database-string [input] input)

(clojure.core/defn- deser-query-execution-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-query-execution-state (input "State"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-string (input "StateChangeReason"))) (clojure.core/contains? input "SubmissionDateTime") (clojure.core/assoc :submission-date-time (deser-date (input "SubmissionDateTime"))) (clojure.core/contains? input "CompletionDateTime") (clojure.core/assoc :completion-date-time (deser-date (input "CompletionDateTime")))))

(clojure.core/defn- deser-encryption-option [input] (clojure.core/get {"SSE_S3" :sse-s-3, "SSE_KMS" :sse-kms, "CSE_KMS" :cse-kms} input))

(clojure.core/defn- deser-query-string [input] input)

(clojure.core/defn- deserdatum-string [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-named-query-id [input] input)

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-row [input] (clojure.core/cond-> {} (clojure.core/contains? input "Data") (clojure.core/assoc :data (deserdatum-list (input "Data")))))

(clojure.core/defn- deser-column-info [input] (clojure.core/cond-> {:name (deser-string (input "Name")), :type (deser-string (input "Type"))} (clojure.core/contains? input "Precision") (clojure.core/assoc :precision (deser-integer (input "Precision"))) (clojure.core/contains? input "Nullable") (clojure.core/assoc :nullable (deser-column-nullable (input "Nullable"))) (clojure.core/contains? input "CatalogName") (clojure.core/assoc :catalog-name (deser-string (input "CatalogName"))) (clojure.core/contains? input "CaseSensitive") (clojure.core/assoc :case-sensitive (deser-boolean (input "CaseSensitive"))) (clojure.core/contains? input "Scale") (clojure.core/assoc :scale (deser-integer (input "Scale"))) (clojure.core/contains? input "Label") (clojure.core/assoc :label (deser-string (input "Label"))) (clojure.core/contains? input "TableName") (clojure.core/assoc :table-name (deser-string (input "TableName"))) (clojure.core/contains? input "SchemaName") (clojure.core/assoc :schema-name (deser-string (input "SchemaName")))))

(clojure.core/defn- deser-throttle-reason [input] (clojure.core/get {"CONCURRENT_QUERY_LIMIT_EXCEEDED" :concurrent-query-limit-exceeded} input))

(clojure.core/defn- deser-named-query [input] (clojure.core/cond-> {:name (deser-name-string (input "Name")), :database (deser-database-string (input "Database")), :query-string (deser-query-string (input "QueryString"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-string (input "Description"))) (clojure.core/contains? input "NamedQueryId") (clojure.core/assoc :named-query-id (deser-named-query-id (input "NamedQueryId"))) (clojure.core/contains? input "WorkGroup") (clojure.core/assoc :work-group (deser-work-group-name (input "WorkGroup")))))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-execution-context [input] (clojure.core/cond-> {} (clojure.core/contains? input "Database") (clojure.core/assoc :database (deser-database-string (input "Database")))))

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-column-nullable [input] (clojure.core/get {"NOT_NULL" :not-null, "NULLABLE" :nullable, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-query-execution-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-execution-id coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-result-set [input] (clojure.core/cond-> {} (clojure.core/contains? input "Rows") (clojure.core/assoc :rows (deser-row-list (input "Rows"))) (clojure.core/contains? input "ResultSetMetadata") (clojure.core/assoc :result-set-metadata (deser-result-set-metadata (input "ResultSetMetadata")))))

(clojure.core/defn- deser-result-set-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "ColumnInfo") (clojure.core/assoc :column-info (deser-column-info-list (input "ColumnInfo")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-name-string [input] input)

(clojure.core/defn- deser-query-execution-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "EngineExecutionTimeInMillis") (clojure.core/assoc :engine-execution-time-in-millis (deser-long (input "EngineExecutionTimeInMillis"))) (clojure.core/contains? input "DataScannedInBytes") (clojure.core/assoc :data-scanned-in-bytes (deser-long (input "DataScannedInBytes")))))

(clojure.core/defn- deser-unprocessed-named-query-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unprocessed-named-query-id coll))) input))

(clojure.core/defn- deser-description-string [input] input)

(clojure.core/defn- deser-work-group-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-work-group-name (input "Name"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-work-group-state (input "State"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-work-group-description-string (input "Description"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-date (input "CreationTime")))))

(clojure.core/defn- deser-query-execution-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-execution coll))) input))

(clojure.core/defn- deser-row-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-row coll))) input))

(clojure.core/defn- deser-unprocessed-query-execution-id [input] (clojure.core/cond-> {} (clojure.core/contains? input "QueryExecutionId") (clojure.core/assoc :query-execution-id (deser-query-execution-id (input "QueryExecutionId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-bytes-scanned-cutoff-value [input] input)

(clojure.core/defn- deser-unprocessed-query-execution-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unprocessed-query-execution-id coll))) input))

(clojure.core/defn- deserdatum-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-datum coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-column-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-column-info coll))) input))

(clojure.core/defn- deser-query-execution [input] (clojure.core/cond-> {} (clojure.core/contains? input "QueryExecutionId") (clojure.core/assoc :query-execution-id (deser-query-execution-id (input "QueryExecutionId"))) (clojure.core/contains? input "Query") (clojure.core/assoc :query (deser-query-string (input "Query"))) (clojure.core/contains? input "StatementType") (clojure.core/assoc :statement-type (deser-statement-type (input "StatementType"))) (clojure.core/contains? input "ResultConfiguration") (clojure.core/assoc :result-configuration (deser-result-configuration (input "ResultConfiguration"))) (clojure.core/contains? input "QueryExecutionContext") (clojure.core/assoc :query-execution-context (deser-query-execution-context (input "QueryExecutionContext"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-query-execution-status (input "Status"))) (clojure.core/contains? input "Statistics") (clojure.core/assoc :statistics (deser-query-execution-statistics (input "Statistics"))) (clojure.core/contains? input "WorkGroup") (clojure.core/assoc :work-group (deser-work-group-name (input "WorkGroup")))))

(clojure.core/defn- deser-work-groups-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-work-group-summary coll))) input))

(clojure.core/defn- deser-result-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "OutputLocation") (clojure.core/assoc :output-location (deser-string (input "OutputLocation"))) (clojure.core/contains? input "EncryptionConfiguration") (clojure.core/assoc :encryption-configuration (deser-encryption-configuration (input "EncryptionConfiguration")))))

(clojure.core/defn- deser-named-query-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-named-query coll))) input))

(clojure.core/defn- deser-token [input] input)

(clojure.core/defn- deser-datum [input] (clojure.core/cond-> {} (clojure.core/contains? input "VarCharValue") (clojure.core/assoc :var-char-value (deserdatum-string (input "VarCharValue")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-stop-query-execution-output ([input] (response-stop-query-execution-output nil input)) ([resultWrapper110643 input] (clojure.core/let [rawinput110642 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110644 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper110646 input] (clojure.core/let [rawinput110645 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110647 {"AthenaErrorCode" (rawinput110645 "AthenaErrorCode"), "Message" (rawinput110645 "Message")}] (clojure.core/cond-> {} (letvar110647 "AthenaErrorCode") (clojure.core/assoc :athena-error-code (deser-error-code (clojure.core/get-in letvar110647 ["AthenaErrorCode"]))) (letvar110647 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar110647 ["Message"])))))))

(clojure.core/defn- response-get-query-execution-output ([input] (response-get-query-execution-output nil input)) ([resultWrapper110649 input] (clojure.core/let [rawinput110648 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110650 {"QueryExecution" (rawinput110648 "QueryExecution")}] (clojure.core/cond-> {} (letvar110650 "QueryExecution") (clojure.core/assoc :query-execution (deser-query-execution (clojure.core/get-in letvar110650 ["QueryExecution"])))))))

(clojure.core/defn- response-update-work-group-output ([input] (response-update-work-group-output nil input)) ([resultWrapper110652 input] (clojure.core/let [rawinput110651 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110653 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-work-group-output ([input] (response-create-work-group-output nil input)) ([resultWrapper110655 input] (clojure.core/let [rawinput110654 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110656 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-resource-output ([input] (response-tag-resource-output nil input)) ([resultWrapper110658 input] (clojure.core/let [rawinput110657 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110659 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-named-queries-output ([input] (response-list-named-queries-output nil input)) ([resultWrapper110661 input] (clojure.core/let [rawinput110660 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110662 {"NamedQueryIds" (rawinput110660 "NamedQueryIds"), "NextToken" (rawinput110660 "NextToken")}] (clojure.core/cond-> {} (letvar110662 "NamedQueryIds") (clojure.core/assoc :named-query-ids (deser-named-query-id-list (clojure.core/get-in letvar110662 ["NamedQueryIds"]))) (letvar110662 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar110662 ["NextToken"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper110664 input] (clojure.core/let [rawinput110663 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110665 {"Message" (rawinput110663 "Message"), "Reason" (rawinput110663 "Reason")}] (clojure.core/cond-> {} (letvar110665 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar110665 ["Message"]))) (letvar110665 "Reason") (clojure.core/assoc :reason (deser-throttle-reason (clojure.core/get-in letvar110665 ["Reason"])))))))

(clojure.core/defn- response-batch-get-named-query-output ([input] (response-batch-get-named-query-output nil input)) ([resultWrapper110667 input] (clojure.core/let [rawinput110666 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110668 {"NamedQueries" (rawinput110666 "NamedQueries"), "UnprocessedNamedQueryIds" (rawinput110666 "UnprocessedNamedQueryIds")}] (clojure.core/cond-> {} (letvar110668 "NamedQueries") (clojure.core/assoc :named-queries (deser-named-query-list (clojure.core/get-in letvar110668 ["NamedQueries"]))) (letvar110668 "UnprocessedNamedQueryIds") (clojure.core/assoc :unprocessed-named-query-ids (deser-unprocessed-named-query-id-list (clojure.core/get-in letvar110668 ["UnprocessedNamedQueryIds"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper110670 input] (clojure.core/let [rawinput110669 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110671 {"Message" (rawinput110669 "Message"), "ResourceName" (rawinput110669 "ResourceName")}] (clojure.core/cond-> {} (letvar110671 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar110671 ["Message"]))) (letvar110671 "ResourceName") (clojure.core/assoc :resource-name (deser-amazon-resource-name (clojure.core/get-in letvar110671 ["ResourceName"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper110673 input] (clojure.core/let [rawinput110672 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110674 {"Message" (rawinput110672 "Message")}] (clojure.core/cond-> {} (letvar110674 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar110674 ["Message"])))))))

(clojure.core/defn- response-create-named-query-output ([input] (response-create-named-query-output nil input)) ([resultWrapper110676 input] (clojure.core/let [rawinput110675 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110677 {"NamedQueryId" (rawinput110675 "NamedQueryId")}] (clojure.core/cond-> {} (letvar110677 "NamedQueryId") (clojure.core/assoc :named-query-id (deser-named-query-id (clojure.core/get-in letvar110677 ["NamedQueryId"])))))))

(clojure.core/defn- response-start-query-execution-output ([input] (response-start-query-execution-output nil input)) ([resultWrapper110679 input] (clojure.core/let [rawinput110678 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110680 {"QueryExecutionId" (rawinput110678 "QueryExecutionId")}] (clojure.core/cond-> {} (letvar110680 "QueryExecutionId") (clojure.core/assoc :query-execution-id (deser-query-execution-id (clojure.core/get-in letvar110680 ["QueryExecutionId"])))))))

(clojure.core/defn- response-get-named-query-output ([input] (response-get-named-query-output nil input)) ([resultWrapper110682 input] (clojure.core/let [rawinput110681 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110683 {"NamedQuery" (rawinput110681 "NamedQuery")}] (clojure.core/cond-> {} (letvar110683 "NamedQuery") (clojure.core/assoc :named-query (deser-named-query (clojure.core/get-in letvar110683 ["NamedQuery"])))))))

(clojure.core/defn- response-delete-named-query-output ([input] (response-delete-named-query-output nil input)) ([resultWrapper110685 input] (clojure.core/let [rawinput110684 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110686 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-query-execution-output ([input] (response-batch-get-query-execution-output nil input)) ([resultWrapper110688 input] (clojure.core/let [rawinput110687 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110689 {"QueryExecutions" (rawinput110687 "QueryExecutions"), "UnprocessedQueryExecutionIds" (rawinput110687 "UnprocessedQueryExecutionIds")}] (clojure.core/cond-> {} (letvar110689 "QueryExecutions") (clojure.core/assoc :query-executions (deser-query-execution-list (clojure.core/get-in letvar110689 ["QueryExecutions"]))) (letvar110689 "UnprocessedQueryExecutionIds") (clojure.core/assoc :unprocessed-query-execution-ids (deser-unprocessed-query-execution-id-list (clojure.core/get-in letvar110689 ["UnprocessedQueryExecutionIds"])))))))

(clojure.core/defn- response-list-work-groups-output ([input] (response-list-work-groups-output nil input)) ([resultWrapper110691 input] (clojure.core/let [rawinput110690 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110692 {"WorkGroups" (rawinput110690 "WorkGroups"), "NextToken" (rawinput110690 "NextToken")}] (clojure.core/cond-> {} (letvar110692 "WorkGroups") (clojure.core/assoc :work-groups (deser-work-groups-list (clojure.core/get-in letvar110692 ["WorkGroups"]))) (letvar110692 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar110692 ["NextToken"])))))))

(clojure.core/defn- response-list-tags-for-resource-output ([input] (response-list-tags-for-resource-output nil input)) ([resultWrapper110694 input] (clojure.core/let [rawinput110693 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110695 {"Tags" (rawinput110693 "Tags"), "NextToken" (rawinput110693 "NextToken")}] (clojure.core/cond-> {} (letvar110695 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar110695 ["Tags"]))) (letvar110695 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar110695 ["NextToken"])))))))

(clojure.core/defn- response-delete-work-group-output ([input] (response-delete-work-group-output nil input)) ([resultWrapper110697 input] (clojure.core/let [rawinput110696 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110698 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-untag-resource-output ([input] (response-untag-resource-output nil input)) ([resultWrapper110700 input] (clojure.core/let [rawinput110699 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110701 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-work-group-output ([input] (response-get-work-group-output nil input)) ([resultWrapper110703 input] (clojure.core/let [rawinput110702 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110704 {"WorkGroup" (rawinput110702 "WorkGroup")}] (clojure.core/cond-> {} (letvar110704 "WorkGroup") (clojure.core/assoc :work-group (deser-work-group (clojure.core/get-in letvar110704 ["WorkGroup"])))))))

(clojure.core/defn- response-get-query-results-output ([input] (response-get-query-results-output nil input)) ([resultWrapper110706 input] (clojure.core/let [rawinput110705 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110707 {"UpdateCount" (rawinput110705 "UpdateCount"), "ResultSet" (rawinput110705 "ResultSet"), "NextToken" (rawinput110705 "NextToken")}] (clojure.core/cond-> {} (letvar110707 "UpdateCount") (clojure.core/assoc :update-count (deser-long (clojure.core/get-in letvar110707 ["UpdateCount"]))) (letvar110707 "ResultSet") (clojure.core/assoc :result-set (deser-result-set (clojure.core/get-in letvar110707 ["ResultSet"]))) (letvar110707 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar110707 ["NextToken"])))))))

(clojure.core/defn- response-list-query-executions-output ([input] (response-list-query-executions-output nil input)) ([resultWrapper110709 input] (clojure.core/let [rawinput110708 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar110710 {"QueryExecutionIds" (rawinput110708 "QueryExecutionIds"), "NextToken" (rawinput110708 "NextToken")}] (clojure.core/cond-> {} (letvar110710 "QueryExecutionIds") (clojure.core/assoc :query-execution-ids (deser-query-execution-id-list (clojure.core/get-in letvar110710 ["QueryExecutionIds"]))) (letvar110710 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar110710 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.athena/unprocessed-named-query-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/named-query-id :portkey.aws.athena/error-code :portkey.aws.athena/error-message]))

(clojure.spec.alpha/def :portkey.aws.athena/stop-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.list-work-groups-input/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena.list-work-groups-input/max-results (clojure.spec.alpha/and :portkey.aws.athena/max-work-groups-count))
(clojure.spec.alpha/def :portkey.aws.athena/list-work-groups-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.list-work-groups-input/next-token :portkey.aws.athena.list-work-groups-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena.get-work-group-input/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena/get-work-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.get-work-group-input/work-group] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/query-execution-state #{:running :queued :cancelled "SUCCEEDED" "QUEUED" "FAILED" "CANCELLED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.athena/work-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-z0-9._-]{1,128}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.athena.work-group-configuration/enforce-work-group-configuration (clojure.spec.alpha/and :portkey.aws.athena/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.work-group-configuration/publish-cloud-watch-metrics-enabled (clojure.spec.alpha/and :portkey.aws.athena/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.work-group-configuration/bytes-scanned-cutoff-per-query (clojure.spec.alpha/and :portkey.aws.athena/bytes-scanned-cutoff-value))
(clojure.spec.alpha/def :portkey.aws.athena/work-group-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/result-configuration :portkey.aws.athena.work-group-configuration/enforce-work-group-configuration :portkey.aws.athena.work-group-configuration/publish-cloud-watch-metrics-enabled :portkey.aws.athena.work-group-configuration/bytes-scanned-cutoff-per-query]))

(clojure.spec.alpha/def :portkey.aws.athena/statement-type #{:utility :ddl :dml "DML" "DDL" "UTILITY"})

(clojure.spec.alpha/def :portkey.aws.athena/work-group-description-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.athena.invalid-request-exception/athena-error-code (clojure.spec.alpha/and :portkey.aws.athena/error-code))
(clojure.spec.alpha/def :portkey.aws.athena.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.athena/error-message))
(clojure.spec.alpha/def :portkey.aws.athena/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.invalid-request-exception/athena-error-code :portkey.aws.athena.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.athena/query-execution-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena/boxed-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.athena.encryption-configuration/kms-key (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena/encryption-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.athena/encryption-option] :opt-un [:portkey.aws.athena.encryption-configuration/kms-key]))

(clojure.spec.alpha/def :portkey.aws.athena/get-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/query-execution]))

(clojure.spec.alpha/def :portkey.aws.athena/work-group-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.athena/get-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena/named-query-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/update-work-group-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/create-work-group-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/named-query-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena/named-query-id :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.athena/amazon-resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1011))))

(clojure.spec.alpha/def :portkey.aws.athena/tag-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.athena.tag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.athena/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.athena.tag-resource-input/tags (clojure.spec.alpha/and :portkey.aws.athena/tag-list))
(clojure.spec.alpha/def :portkey.aws.athena/tag-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.tag-resource-input/resource-arn :portkey.aws.athena.tag-resource-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.work-group/name (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.work-group/state (clojure.spec.alpha/and :portkey.aws.athena/work-group-state))
(clojure.spec.alpha/def :portkey.aws.athena.work-group/configuration (clojure.spec.alpha/and :portkey.aws.athena/work-group-configuration))
(clojure.spec.alpha/def :portkey.aws.athena.work-group/description (clojure.spec.alpha/and :portkey.aws.athena/work-group-description-string))
(clojure.spec.alpha/def :portkey.aws.athena.work-group/creation-time (clojure.spec.alpha/and :portkey.aws.athena/date))
(clojure.spec.alpha/def :portkey.aws.athena/work-group (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.work-group/name] :opt-un [:portkey.aws.athena.work-group/state :portkey.aws.athena.work-group/configuration :portkey.aws.athena.work-group/description :portkey.aws.athena.work-group/creation-time]))

(clojure.spec.alpha/def :portkey.aws.athena/database-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.athena.batch-get-query-execution-input/query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena/query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena/batch-get-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.batch-get-query-execution-input/query-execution-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.query-execution-status/state (clojure.spec.alpha/and :portkey.aws.athena/query-execution-state))
(clojure.spec.alpha/def :portkey.aws.athena.query-execution-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena.query-execution-status/submission-date-time (clojure.spec.alpha/and :portkey.aws.athena/date))
(clojure.spec.alpha/def :portkey.aws.athena.query-execution-status/completion-date-time (clojure.spec.alpha/and :portkey.aws.athena/date))
(clojure.spec.alpha/def :portkey.aws.athena/query-execution-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.query-execution-status/state :portkey.aws.athena.query-execution-status/state-change-reason :portkey.aws.athena.query-execution-status/submission-date-time :portkey.aws.athena.query-execution-status/completion-date-time]))

(clojure.spec.alpha/def :portkey.aws.athena/encryption-option #{:sse-kms :cse-kms :sse-s-3 "CSE_KMS" "SSE_S3" "SSE_KMS"})

(clojure.spec.alpha/def :portkey.aws.athena/query-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 262144))))

(clojure.spec.alpha/def :portkey.aws.athena.batch-get-named-query-input/named-query-ids (clojure.spec.alpha/and :portkey.aws.athena/named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena/batch-get-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.batch-get-named-query-input/named-query-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/get-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena/query-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/datum-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena/named-query-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.list-named-queries-output/named-query-ids (clojure.spec.alpha/and :portkey.aws.athena/named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.list-named-queries-output/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena/list-named-queries-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.list-named-queries-output/named-query-ids :portkey.aws.athena.list-named-queries-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena/max-query-results (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.athena/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.athena.result-configuration-updates/output-location (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena.result-configuration-updates/remove-output-location (clojure.spec.alpha/and :portkey.aws.athena/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.result-configuration-updates/remove-encryption-configuration (clojure.spec.alpha/and :portkey.aws.athena/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena/result-configuration-updates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.result-configuration-updates/output-location :portkey.aws.athena.result-configuration-updates/remove-output-location :portkey.aws.athena/encryption-configuration :portkey.aws.athena.result-configuration-updates/remove-encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.athena.work-group-configuration-updates/enforce-work-group-configuration (clojure.spec.alpha/and :portkey.aws.athena/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.work-group-configuration-updates/publish-cloud-watch-metrics-enabled (clojure.spec.alpha/and :portkey.aws.athena/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena.work-group-configuration-updates/bytes-scanned-cutoff-per-query (clojure.spec.alpha/and :portkey.aws.athena/bytes-scanned-cutoff-value))
(clojure.spec.alpha/def :portkey.aws.athena.work-group-configuration-updates/remove-bytes-scanned-cutoff-per-query (clojure.spec.alpha/and :portkey.aws.athena/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena/work-group-configuration-updates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.work-group-configuration-updates/enforce-work-group-configuration :portkey.aws.athena/result-configuration-updates :portkey.aws.athena.work-group-configuration-updates/publish-cloud-watch-metrics-enabled :portkey.aws.athena.work-group-configuration-updates/bytes-scanned-cutoff-per-query :portkey.aws.athena.work-group-configuration-updates/remove-bytes-scanned-cutoff-per-query]))

(clojure.spec.alpha/def :portkey.aws.athena.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.athena/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.too-many-requests-exception/reason (clojure.spec.alpha/and :portkey.aws.athena/throttle-reason))
(clojure.spec.alpha/def :portkey.aws.athena/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.too-many-requests-exception/message :portkey.aws.athena.too-many-requests-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.athena.row/data (clojure.spec.alpha/and :portkey.aws.athena/datum-list))
(clojure.spec.alpha/def :portkey.aws.athena/row (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.row/data]))

(clojure.spec.alpha/def :portkey.aws.athena.column-info/precision (clojure.spec.alpha/and :portkey.aws.athena/integer))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/nullable (clojure.spec.alpha/and :portkey.aws.athena/column-nullable))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/catalog-name (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/type (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/case-sensitive (clojure.spec.alpha/and :portkey.aws.athena/boolean))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/scale (clojure.spec.alpha/and :portkey.aws.athena/integer))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/label (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/table-name (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/schema-name (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena.column-info/name (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena/column-info (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.column-info/name :portkey.aws.athena.column-info/type] :opt-un [:portkey.aws.athena.column-info/precision :portkey.aws.athena.column-info/nullable :portkey.aws.athena.column-info/catalog-name :portkey.aws.athena.column-info/case-sensitive :portkey.aws.athena.column-info/scale :portkey.aws.athena.column-info/label :portkey.aws.athena.column-info/table-name :portkey.aws.athena.column-info/schema-name]))

(clojure.spec.alpha/def :portkey.aws.athena/throttle-reason #{"CONCURRENT_QUERY_LIMIT_EXCEEDED" :concurrent-query-limit-exceeded})

(clojure.spec.alpha/def :portkey.aws.athena.named-query/name (clojure.spec.alpha/and :portkey.aws.athena/name-string))
(clojure.spec.alpha/def :portkey.aws.athena.named-query/description (clojure.spec.alpha/and :portkey.aws.athena/description-string))
(clojure.spec.alpha/def :portkey.aws.athena.named-query/database (clojure.spec.alpha/and :portkey.aws.athena/database-string))
(clojure.spec.alpha/def :portkey.aws.athena.named-query/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena/named-query (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.named-query/name :portkey.aws.athena.named-query/database :portkey.aws.athena/query-string] :opt-un [:portkey.aws.athena.named-query/description :portkey.aws.athena/named-query-id :portkey.aws.athena.named-query/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena/tag-list (clojure.spec.alpha/coll-of :portkey.aws.athena/tag))

(clojure.spec.alpha/def :portkey.aws.athena/stop-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena/query-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.query-execution-context/database (clojure.spec.alpha/and :portkey.aws.athena/database-string))
(clojure.spec.alpha/def :portkey.aws.athena/query-execution-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.query-execution-context/database]))

(clojure.spec.alpha/def :portkey.aws.athena/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.athena/tag-key))

(clojure.spec.alpha/def :portkey.aws.athena.batch-get-named-query-output/named-queries (clojure.spec.alpha/and :portkey.aws.athena/named-query-list))
(clojure.spec.alpha/def :portkey.aws.athena.batch-get-named-query-output/unprocessed-named-query-ids (clojure.spec.alpha/and :portkey.aws.athena/unprocessed-named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena/batch-get-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.batch-get-named-query-output/named-queries :portkey.aws.athena.batch-get-named-query-output/unprocessed-named-query-ids]))

(clojure.spec.alpha/def :portkey.aws.athena/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.athena.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.athena/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.resource-not-found-exception/resource-name (clojure.spec.alpha/and :portkey.aws.athena/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.athena/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.resource-not-found-exception/message :portkey.aws.athena.resource-not-found-exception/resource-name]))

(clojure.spec.alpha/def :portkey.aws.athena.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.athena/error-message))
(clojure.spec.alpha/def :portkey.aws.athena/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.athena/create-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/named-query-id]))

(clojure.spec.alpha/def :portkey.aws.athena/column-nullable #{"UNKNOWN" :unknown "NULLABLE" "NOT_NULL" :not-null :nullable})

(clojure.spec.alpha/def :portkey.aws.athena/query-execution-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena/query-execution-id :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.athena/max-tags-count (clojure.spec.alpha/int-in 75 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.athena.list-tags-for-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.athena/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.athena.list-tags-for-resource-input/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena.list-tags-for-resource-input/max-results (clojure.spec.alpha/and :portkey.aws.athena/max-tags-count))
(clojure.spec.alpha/def :portkey.aws.athena/list-tags-for-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.list-tags-for-resource-input/resource-arn] :opt-un [:portkey.aws.athena.list-tags-for-resource-input/next-token :portkey.aws.athena.list-tags-for-resource-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.athena.get-query-results-input/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena.get-query-results-input/max-results (clojure.spec.alpha/and :portkey.aws.athena/max-query-results))
(clojure.spec.alpha/def :portkey.aws.athena/get-query-results-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena/query-execution-id] :opt-un [:portkey.aws.athena.get-query-results-input/next-token :portkey.aws.athena.get-query-results-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena.result-set/rows (clojure.spec.alpha/and :portkey.aws.athena/row-list))
(clojure.spec.alpha/def :portkey.aws.athena/result-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.result-set/rows :portkey.aws.athena/result-set-metadata]))

(clojure.spec.alpha/def :portkey.aws.athena.result-set-metadata/column-info (clojure.spec.alpha/and :portkey.aws.athena/column-info-list))
(clojure.spec.alpha/def :portkey.aws.athena/result-set-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.result-set-metadata/column-info]))

(clojure.spec.alpha/def :portkey.aws.athena.untag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.athena/amazon-resource-name))
(clojure.spec.alpha/def :portkey.aws.athena.untag-resource-input/tag-keys (clojure.spec.alpha/and :portkey.aws.athena/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.athena/untag-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.untag-resource-input/resource-arn :portkey.aws.athena.untag-resource-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/max-query-executions-count (clojure.spec.alpha/int-in 0 50))

(clojure.spec.alpha/def :portkey.aws.athena/start-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/query-execution-id]))

(clojure.spec.alpha/def :portkey.aws.athena/get-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/named-query]))

(clojure.spec.alpha/def :portkey.aws.athena.create-named-query-input/name (clojure.spec.alpha/and :portkey.aws.athena/name-string))
(clojure.spec.alpha/def :portkey.aws.athena.create-named-query-input/description (clojure.spec.alpha/and :portkey.aws.athena/description-string))
(clojure.spec.alpha/def :portkey.aws.athena.create-named-query-input/database (clojure.spec.alpha/and :portkey.aws.athena/database-string))
(clojure.spec.alpha/def :portkey.aws.athena.create-named-query-input/client-request-token (clojure.spec.alpha/and :portkey.aws.athena/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.athena.create-named-query-input/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena/create-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.create-named-query-input/name :portkey.aws.athena.create-named-query-input/database :portkey.aws.athena/query-string] :opt-un [:portkey.aws.athena.create-named-query-input/description :portkey.aws.athena.create-named-query-input/client-request-token :portkey.aws.athena.create-named-query-input/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.athena/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.start-query-execution-input/client-request-token (clojure.spec.alpha/and :portkey.aws.athena/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.athena.start-query-execution-input/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena/start-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena/query-string] :opt-un [:portkey.aws.athena.start-query-execution-input/client-request-token :portkey.aws.athena/query-execution-context :portkey.aws.athena/result-configuration :portkey.aws.athena.start-query-execution-input/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena/name-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.athena/delete-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.query-execution-statistics/engine-execution-time-in-millis (clojure.spec.alpha/and :portkey.aws.athena/long))
(clojure.spec.alpha/def :portkey.aws.athena.query-execution-statistics/data-scanned-in-bytes (clojure.spec.alpha/and :portkey.aws.athena/long))
(clojure.spec.alpha/def :portkey.aws.athena/query-execution-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.query-execution-statistics/engine-execution-time-in-millis :portkey.aws.athena.query-execution-statistics/data-scanned-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.athena/unprocessed-named-query-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena/unprocessed-named-query-id))

(clojure.spec.alpha/def :portkey.aws.athena.batch-get-query-execution-output/query-executions (clojure.spec.alpha/and :portkey.aws.athena/query-execution-list))
(clojure.spec.alpha/def :portkey.aws.athena.batch-get-query-execution-output/unprocessed-query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena/unprocessed-query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena/batch-get-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.batch-get-query-execution-output/query-executions :portkey.aws.athena.batch-get-query-execution-output/unprocessed-query-execution-ids]))

(clojure.spec.alpha/def :portkey.aws.athena/description-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.athena.work-group-summary/name (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.work-group-summary/state (clojure.spec.alpha/and :portkey.aws.athena/work-group-state))
(clojure.spec.alpha/def :portkey.aws.athena.work-group-summary/description (clojure.spec.alpha/and :portkey.aws.athena/work-group-description-string))
(clojure.spec.alpha/def :portkey.aws.athena.work-group-summary/creation-time (clojure.spec.alpha/and :portkey.aws.athena/date))
(clojure.spec.alpha/def :portkey.aws.athena/work-group-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.work-group-summary/name :portkey.aws.athena.work-group-summary/state :portkey.aws.athena.work-group-summary/description :portkey.aws.athena.work-group-summary/creation-time]))

(clojure.spec.alpha/def :portkey.aws.athena.list-query-executions-input/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena.list-query-executions-input/max-results (clojure.spec.alpha/and :portkey.aws.athena/max-query-executions-count))
(clojure.spec.alpha/def :portkey.aws.athena.list-query-executions-input/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena/list-query-executions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.list-query-executions-input/next-token :portkey.aws.athena.list-query-executions-input/max-results :portkey.aws.athena.list-query-executions-input/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 32 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.athena.list-work-groups-output/work-groups (clojure.spec.alpha/and :portkey.aws.athena/work-groups-list))
(clojure.spec.alpha/def :portkey.aws.athena.list-work-groups-output/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena/list-work-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.list-work-groups-output/work-groups :portkey.aws.athena.list-work-groups-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena/query-execution-list (clojure.spec.alpha/coll-of :portkey.aws.athena/query-execution))

(clojure.spec.alpha/def :portkey.aws.athena/row-list (clojure.spec.alpha/coll-of :portkey.aws.athena/row))

(clojure.spec.alpha/def :portkey.aws.athena.list-tags-for-resource-output/tags (clojure.spec.alpha/and :portkey.aws.athena/tag-list))
(clojure.spec.alpha/def :portkey.aws.athena.list-tags-for-resource-output/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena/list-tags-for-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.list-tags-for-resource-output/tags :portkey.aws.athena.list-tags-for-resource-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena/unprocessed-query-execution-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/query-execution-id :portkey.aws.athena/error-code :portkey.aws.athena/error-message]))

(clojure.spec.alpha/def :portkey.aws.athena/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.athena.update-work-group-input/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.update-work-group-input/description (clojure.spec.alpha/and :portkey.aws.athena/work-group-description-string))
(clojure.spec.alpha/def :portkey.aws.athena.update-work-group-input/configuration-updates (clojure.spec.alpha/and :portkey.aws.athena/work-group-configuration-updates))
(clojure.spec.alpha/def :portkey.aws.athena.update-work-group-input/state (clojure.spec.alpha/and :portkey.aws.athena/work-group-state))
(clojure.spec.alpha/def :portkey.aws.athena/update-work-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.update-work-group-input/work-group] :opt-un [:portkey.aws.athena.update-work-group-input/description :portkey.aws.athena.update-work-group-input/configuration-updates :portkey.aws.athena.update-work-group-input/state]))

(clojure.spec.alpha/def :portkey.aws.athena/bytes-scanned-cutoff-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.athena/unprocessed-query-execution-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena/unprocessed-query-execution-id))

(clojure.spec.alpha/def :portkey.aws.athena/delete-work-group-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena/datum-list (clojure.spec.alpha/coll-of :portkey.aws.athena/datum))

(clojure.spec.alpha/def :portkey.aws.athena/max-named-queries-count (clojure.spec.alpha/int-in 0 50))

(clojure.spec.alpha/def :portkey.aws.athena.tag/key (clojure.spec.alpha/and :portkey.aws.athena/tag-key))
(clojure.spec.alpha/def :portkey.aws.athena.tag/value (clojure.spec.alpha/and :portkey.aws.athena/tag-value))
(clojure.spec.alpha/def :portkey.aws.athena/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.tag/key :portkey.aws.athena.tag/value]))

(clojure.spec.alpha/def :portkey.aws.athena/column-info-list (clojure.spec.alpha/coll-of :portkey.aws.athena/column-info))

(clojure.spec.alpha/def :portkey.aws.athena.query-execution/query (clojure.spec.alpha/and :portkey.aws.athena/query-string))
(clojure.spec.alpha/def :portkey.aws.athena.query-execution/status (clojure.spec.alpha/and :portkey.aws.athena/query-execution-status))
(clojure.spec.alpha/def :portkey.aws.athena.query-execution/statistics (clojure.spec.alpha/and :portkey.aws.athena/query-execution-statistics))
(clojure.spec.alpha/def :portkey.aws.athena.query-execution/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena/query-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/query-execution-id :portkey.aws.athena.query-execution/query :portkey.aws.athena/statement-type :portkey.aws.athena/result-configuration :portkey.aws.athena/query-execution-context :portkey.aws.athena.query-execution/status :portkey.aws.athena.query-execution/statistics :portkey.aws.athena.query-execution/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena/work-groups-list (clojure.spec.alpha/coll-of :portkey.aws.athena/work-group-summary :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.athena/untag-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.result-configuration/output-location (clojure.spec.alpha/and :portkey.aws.athena/string))
(clojure.spec.alpha/def :portkey.aws.athena/result-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.result-configuration/output-location :portkey.aws.athena/encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.athena/get-work-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.create-work-group-input/name (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.create-work-group-input/configuration (clojure.spec.alpha/and :portkey.aws.athena/work-group-configuration))
(clojure.spec.alpha/def :portkey.aws.athena.create-work-group-input/description (clojure.spec.alpha/and :portkey.aws.athena/work-group-description-string))
(clojure.spec.alpha/def :portkey.aws.athena.create-work-group-input/tags (clojure.spec.alpha/and :portkey.aws.athena/tag-list))
(clojure.spec.alpha/def :portkey.aws.athena/create-work-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.create-work-group-input/name] :opt-un [:portkey.aws.athena.create-work-group-input/configuration :portkey.aws.athena.create-work-group-input/description :portkey.aws.athena.create-work-group-input/tags]))

(clojure.spec.alpha/def :portkey.aws.athena/named-query-list (clojure.spec.alpha/coll-of :portkey.aws.athena/named-query))

(clojure.spec.alpha/def :portkey.aws.athena.get-query-results-output/update-count (clojure.spec.alpha/and :portkey.aws.athena/long))
(clojure.spec.alpha/def :portkey.aws.athena.get-query-results-output/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena/get-query-results-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.get-query-results-output/update-count :portkey.aws.athena/result-set :portkey.aws.athena.get-query-results-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena/token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.athena/max-work-groups-count (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.athena.list-named-queries-input/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena.list-named-queries-input/max-results (clojure.spec.alpha/and :portkey.aws.athena/max-named-queries-count))
(clojure.spec.alpha/def :portkey.aws.athena.list-named-queries-input/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena/list-named-queries-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.list-named-queries-input/next-token :portkey.aws.athena.list-named-queries-input/max-results :portkey.aws.athena.list-named-queries-input/work-group]))

(clojure.spec.alpha/def :portkey.aws.athena.datum/var-char-value (clojure.spec.alpha/and :portkey.aws.athena/datum-string))
(clojure.spec.alpha/def :portkey.aws.athena/datum (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.datum/var-char-value]))

(clojure.spec.alpha/def :portkey.aws.athena/delete-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena/named-query-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.delete-work-group-input/work-group (clojure.spec.alpha/and :portkey.aws.athena/work-group-name))
(clojure.spec.alpha/def :portkey.aws.athena.delete-work-group-input/recursive-delete-option (clojure.spec.alpha/and :portkey.aws.athena/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.athena/delete-work-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.delete-work-group-input/work-group] :opt-un [:portkey.aws.athena.delete-work-group-input/recursive-delete-option]))

(clojure.spec.alpha/def :portkey.aws.athena.list-query-executions-output/query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena/query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.list-query-executions-output/next-token (clojure.spec.alpha/and :portkey.aws.athena/token))
(clojure.spec.alpha/def :portkey.aws.athena/list-query-executions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.list-query-executions-output/query-execution-ids :portkey.aws.athena.list-query-executions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena/boolean clojure.core/boolean?)

(clojure.core/defn tag-resource "Adds one or more tags to the resource, such as a workgroup. A tag is a label\nthat you assign to an AWS Athena resource (a workgroup). Each tag consists of a\nkey and an optional value, both of which you define. Tags enable you to\ncategorize resources (workgroups) in Athena, for example, by purpose, owner, or\nenvironment. Use a consistent set of tag keys to make it easier to search and\nfilter workgroups in your account. For best practices, see AWS Tagging\nStrategies\n(https://aws.amazon.com/answers/account-management/aws-tagging-strategies/). The\nkey length is from 1 (minimum) to 128 (maximum) Unicode characters in UTF-8. The\ntag value length is from 0 (minimum) to 256 (maximum) Unicode characters in\nUTF-8. You can use letters and numbers representable in UTF-8, and the following\ncharacters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys\nmust be unique per resource. If you specify more than one, separate them by\ncommas." ([tag-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-input tag-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/tag-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/tag-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.athena/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.athena/tag-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/tag-resource-output))

(clojure.core/defn get-work-group "Returns information about the workgroup with the specified name." ([get-work-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-work-group-input get-work-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/get-work-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/get-work-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetWorkGroup", :http.request.configuration/output-deser-fn response-get-work-group-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-work-group :args (clojure.spec.alpha/tuple :portkey.aws.athena/get-work-group-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/get-work-group-output))

(clojure.core/defn list-named-queries "Provides a list of available query IDs only for queries saved in the specified\nworkgroup. Requires that you have access to the workgroup.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([] (list-named-queries {})) ([list-named-queries-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-named-queries-input list-named-queries-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/list-named-queries-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/list-named-queries-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListNamedQueries", :http.request.configuration/output-deser-fn response-list-named-queries-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-named-queries :args (clojure.spec.alpha/? :portkey.aws.athena/list-named-queries-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/list-named-queries-output))

(clojure.core/defn update-work-group "Updates the workgroup with the specified name. The workgroup's name cannot be\nchanged." ([update-work-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-work-group-input update-work-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/update-work-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/update-work-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateWorkGroup", :http.request.configuration/output-deser-fn response-update-work-group-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef update-work-group :args (clojure.spec.alpha/tuple :portkey.aws.athena/update-work-group-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/update-work-group-output))

(clojure.core/defn delete-work-group "Deletes the workgroup with the specified name. The primary workgroup cannot be\ndeleted." ([delete-work-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-work-group-input delete-work-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/delete-work-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/delete-work-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteWorkGroup", :http.request.configuration/output-deser-fn response-delete-work-group-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-work-group :args (clojure.spec.alpha/tuple :portkey.aws.athena/delete-work-group-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/delete-work-group-output))

(clojure.core/defn stop-query-execution "Stops a query execution. Requires you to have access to the workgroup in which\nthe query ran.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([stop-query-execution-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-query-execution-input stop-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/stop-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/stop-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopQueryExecution", :http.request.configuration/output-deser-fn response-stop-query-execution-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef stop-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena/stop-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/stop-query-execution-output))

(clojure.core/defn list-tags-for-resource "Lists the tags associated with this workgroup." ([list-tags-for-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-input list-tags-for-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/list-tags-for-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/list-tags-for-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.athena/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.athena/list-tags-for-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/list-tags-for-resource-output))

(clojure.core/defn list-query-executions "Provides a list of available query execution IDs for the queries in the\nspecified workgroup. Requires you to have access to the workgroup in which the\nqueries ran.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([] (list-query-executions {})) ([list-query-executions-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-query-executions-input list-query-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/list-query-executions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/list-query-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListQueryExecutions", :http.request.configuration/output-deser-fn response-list-query-executions-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-query-executions :args (clojure.spec.alpha/? :portkey.aws.athena/list-query-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/list-query-executions-output))

(clojure.core/defn start-query-execution "Runs the SQL query statements contained in the Query. Requires you to have\naccess to the workgroup in which the query ran.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([start-query-execution-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-query-execution-input start-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/start-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/start-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartQueryExecution", :http.request.configuration/output-deser-fn response-start-query-execution-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception, "TooManyRequestsException" :portkey.aws.athena/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef start-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena/start-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/start-query-execution-output))

(clojure.core/defn delete-named-query "Deletes the named query if you have access to the workgroup in which the query\nwas saved.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([delete-named-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-named-query-input delete-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/delete-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/delete-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNamedQuery", :http.request.configuration/output-deser-fn response-delete-named-query-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena/delete-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/delete-named-query-output))

(clojure.core/defn list-work-groups "Lists available workgroups for the account." ([] (list-work-groups {})) ([list-work-groups-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-work-groups-input list-work-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/list-work-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/list-work-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListWorkGroups", :http.request.configuration/output-deser-fn response-list-work-groups-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-work-groups :args (clojure.spec.alpha/? :portkey.aws.athena/list-work-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/list-work-groups-output))

(clojure.core/defn get-named-query "Returns information about a single query. Requires that you have access to the\nworkgroup in which the query was saved." ([get-named-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-named-query-input get-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/get-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/get-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetNamedQuery", :http.request.configuration/output-deser-fn response-get-named-query-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena/get-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/get-named-query-output))

(clojure.core/defn get-query-execution "Returns information about a single execution of a query if you have access to\nthe workgroup in which the query ran. Each time a query executes, information\nabout the query execution is saved with a unique ID." ([get-query-execution-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-query-execution-input get-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/get-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/get-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetQueryExecution", :http.request.configuration/output-deser-fn response-get-query-execution-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena/get-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/get-query-execution-output))

(clojure.core/defn batch-get-named-query "Returns the details of a single named query or a list of up to 50 queries, which\nyou provide as an array of query ID strings. Requires you to have access to the\nworkgroup in which the queries were saved. Use ListNamedQueriesInput to get the\nlist of named query IDs in the specified workgroup. If information could not be\nretrieved for a submitted query ID, information about the query ID submitted is\nlisted under UnprocessedNamedQueryId. Named queries differ from executed\nqueries. Use BatchGetQueryExecutionInput to get details about each unique query\nexecution, and ListQueryExecutionsInput to get a list of query execution IDs." ([batch-get-named-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-named-query-input batch-get-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/batch-get-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/batch-get-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetNamedQuery", :http.request.configuration/output-deser-fn response-batch-get-named-query-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef batch-get-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena/batch-get-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/batch-get-named-query-output))

(clojure.core/defn untag-resource "Removes one or more tags from the workgroup resource. Takes as an input a list\nof TagKey Strings separated by commas, and removes their tags at the same time." ([untag-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-input untag-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/untag-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/untag-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.athena/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.athena/untag-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/untag-resource-output))

(clojure.core/defn create-work-group "Creates a workgroup with the specified name." ([create-work-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-work-group-input create-work-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/create-work-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/create-work-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateWorkGroup", :http.request.configuration/output-deser-fn response-create-work-group-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-work-group :args (clojure.spec.alpha/tuple :portkey.aws.athena/create-work-group-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/create-work-group-output))

(clojure.core/defn create-named-query "Creates a named query in the specified workgroup. Requires that you have access\nto the workgroup.\n For code samples using the AWS SDK for Java, see Examples and Code Samples\n(http://docs.aws.amazon.com/athena/latest/ug/code-samples.html) in the Amazon\nAthena User Guide." ([create-named-query-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-named-query-input create-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/create-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/create-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateNamedQuery", :http.request.configuration/output-deser-fn response-create-named-query-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena/create-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/create-named-query-output))

(clojure.core/defn batch-get-query-execution "Returns the details of a single query execution or a list of up to 50 query\nexecutions, which you provide as an array of query execution ID strings.\nRequires you to have access to the workgroup in which the queries ran. To get a\nlist of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query\nexecutions differ from named (saved) queries. Use BatchGetNamedQueryInput to get\ndetails about named queries." ([batch-get-query-execution-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-query-execution-input batch-get-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/batch-get-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/batch-get-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetQueryExecution", :http.request.configuration/output-deser-fn response-batch-get-query-execution-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef batch-get-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena/batch-get-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/batch-get-query-execution-output))

(clojure.core/defn get-query-results "Returns the results of a single query execution specified by QueryExecutionId if\nyou have access to the workgroup in which the query ran. This request does not\nexecute the query but returns results. Use StartQueryExecution to run a query." ([get-query-results-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-query-results-input get-query-results-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.athena/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena/get-query-results-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id "Athena", :http.request.spec/input-spec :portkey.aws.athena/get-query-results-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetQueryResults", :http.request.configuration/output-deser-fn response-get-query-results-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena/internal-server-exception, "InvalidRequestException" :portkey.aws.athena/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-query-results :args (clojure.spec.alpha/tuple :portkey.aws.athena/get-query-results-input) :ret (clojure.spec.alpha/and :portkey.aws.athena/get-query-results-output))
