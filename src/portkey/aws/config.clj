(ns portkey.aws.config (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "config", :region "ap-northeast-1"},
    :ssl-common-name "config.ap-northeast-1.amazonaws.com",
    :endpoint "https://config.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "config", :region "eu-west-1"},
    :ssl-common-name "config.eu-west-1.amazonaws.com",
    :endpoint "https://config.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "config", :region "us-east-2"},
    :ssl-common-name "config.us-east-2.amazonaws.com",
    :endpoint "https://config.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "config", :region "ap-southeast-2"},
    :ssl-common-name "config.ap-southeast-2.amazonaws.com",
    :endpoint "https://config.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "config", :region "cn-north-1"},
    :ssl-common-name "config.cn-north-1.amazonaws.com.cn",
    :endpoint "https://config.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "config", :region "sa-east-1"},
    :ssl-common-name "config.sa-east-1.amazonaws.com",
    :endpoint "https://config.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "config", :region "ap-southeast-1"},
    :ssl-common-name "config.ap-southeast-1.amazonaws.com",
    :endpoint "https://config.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "config", :region "cn-northwest-1"},
    :ssl-common-name "config.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://config.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "config", :region "ap-northeast-2"},
    :ssl-common-name "config.ap-northeast-2.amazonaws.com",
    :endpoint "https://config.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "config", :region "eu-west-3"},
    :ssl-common-name "config.eu-west-3.amazonaws.com",
    :endpoint "https://config.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "config", :region "ca-central-1"},
    :ssl-common-name "config.ca-central-1.amazonaws.com",
    :endpoint "https://config.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "config", :region "eu-central-1"},
    :ssl-common-name "config.eu-central-1.amazonaws.com",
    :endpoint "https://config.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "config", :region "eu-west-2"},
    :ssl-common-name "config.eu-west-2.amazonaws.com",
    :endpoint "https://config.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "config", :region "us-gov-west-1"},
    :ssl-common-name "config.us-gov-west-1.amazonaws.com",
    :endpoint "https://config.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "config", :region "us-west-2"},
    :ssl-common-name "config.us-west-2.amazonaws.com",
    :endpoint "https://config.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "config", :region "us-east-1"},
    :ssl-common-name "config.us-east-1.amazonaws.com",
    :endpoint "https://config.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "config", :region "us-west-1"},
    :ssl-common-name "config.us-west-1.amazonaws.com",
    :endpoint "https://config.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "config", :region "ap-south-1"},
    :ssl-common-name "config.ap-south-1.amazonaws.com",
    :endpoint "https://config.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-delivery-channel)

(clojure.core/declare ser-account-aggregation-source)

(clojure.core/declare ser-resource-key)

(clojure.core/declare ser-config-snapshot-delivery-properties)

(clojure.core/declare ser-account-aggregation-source-account-list)

(clojure.core/declare ser-earlier-time)

(clojure.core/declare ser-config-rule-compliance-summary-group-key)

(clojure.core/declare ser-source)

(clojure.core/declare ser-evaluation)

(clojure.core/declare ser-resource-keys)

(clojure.core/declare ser-config-rule)

(clojure.core/declare ser-configuration-aggregator-name-list)

(clojure.core/declare ser-delivery-channel-name-list)

(clojure.core/declare ser-all-supported)

(clojure.core/declare ser-configuration-aggregator-name)

(clojure.core/declare ser-source-detail)

(clojure.core/declare ser-source-details)

(clojure.core/declare ser-reevaluate-config-rule-names)

(clojure.core/declare ser-chronological-order)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-compliance-types)

(clojure.core/declare ser-configuration-recorder)

(clojure.core/declare ser-retention-configuration-name-list)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-recorder-name)

(clojure.core/declare ser-config-rule-state)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-configuration-recorder-name-list)

(clojure.core/declare ser-string-with-char-limit-64)

(clojure.core/declare ser-resource-type-list)

(clojure.core/declare ser-config-rule-name)

(clojure.core/declare ser-string-with-char-limit-128)

(clojure.core/declare ser-channel-name)

(clojure.core/declare ser-later-time)

(clojure.core/declare ser-evaluations)

(clojure.core/declare ser-retention-configuration-name)

(clojure.core/declare ser-string-with-char-limit-256)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-include-global-resource-types)

(clojure.core/declare ser-aggregated-source-status-type-list)

(clojure.core/declare ser-config-rule-names)

(clojure.core/declare ser-base-resource-id)

(clojure.core/declare ser-string)

(clojure.core/declare ser-config-rule-compliance-filters)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-config-rule-compliance-summary-filters)

(clojure.core/declare ser-organization-aggregation-source)

(clojure.core/declare ser-describe-pending-aggregation-requests-limit)

(clojure.core/declare ser-message-type)

(clojure.core/declare ser-maximum-execution-frequency)

(clojure.core/declare ser-owner)

(clojure.core/declare ser-recording-group)

(clojure.core/declare ser-compliance-type)

(clojure.core/declare ser-resource-types)

(clojure.core/declare ser-aggregator-region-list)

(clojure.core/declare ser-rule-limit)

(clojure.core/declare ser-ordering-timestamp)

(clojure.core/declare ser-resource-id-list)

(clojure.core/declare ser-retention-period-in-days)

(clojure.core/declare ser-event-source)

(clojure.core/declare ser-aggregated-source-status-type)

(clojure.core/declare ser-account-aggregation-source-list)

(clojure.core/declare ser-compliance-resource-types)

(clojure.core/declare ser-aws-region)

(clojure.core/declare ser-emptiable-string-with-char-limit-256)

(clojure.core/declare ser-scope)

(clojure.core/declare ser-string-with-char-limit-1024)

(clojure.core/declare ser-group-by-api-limit)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-delivery-channel [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeliveryChannel", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-channel-name (input :name)) #:http.request.field{:name "name", :shape "ChannelName"})) (clojure.core/contains? input :s-3-bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-bucket-name)) #:http.request.field{:name "s3BucketName", :shape "String"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-key-prefix)) #:http.request.field{:name "s3KeyPrefix", :shape "String"})) (clojure.core/contains? input :sns-topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-arn)) #:http.request.field{:name "snsTopicARN", :shape "String"})) (clojure.core/contains? input :config-snapshot-delivery-properties) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-snapshot-delivery-properties (input :config-snapshot-delivery-properties)) #:http.request.field{:name "configSnapshotDeliveryProperties", :shape "ConfigSnapshotDeliveryProperties"}))))

(clojure.core/defn- ser-account-aggregation-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-account-aggregation-source-account-list (:account-ids input)) #:http.request.field{:name "AccountIds", :shape "AccountAggregationSourceAccountList"})], :shape "AccountAggregationSource", :type "structure"} (clojure.core/contains? input :all-aws-regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :all-aws-regions)) #:http.request.field{:name "AllAwsRegions", :shape "Boolean"})) (clojure.core/contains? input :aws-regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aggregator-region-list (input :aws-regions)) #:http.request.field{:name "AwsRegions", :shape "AggregatorRegionList"}))))

(clojure.core/defn- ser-resource-key [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-type (:resource-type input)) #:http.request.field{:name "resourceType", :shape "ResourceType"}) (clojure.core/into (ser-resource-id (:resource-id input)) #:http.request.field{:name "resourceId", :shape "ResourceId"})], :shape "ResourceKey", :type "structure"}))

(clojure.core/defn- ser-config-snapshot-delivery-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ConfigSnapshotDeliveryProperties", :type "structure"} (clojure.core/contains? input :delivery-frequency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maximum-execution-frequency (input :delivery-frequency)) #:http.request.field{:name "deliveryFrequency", :shape "MaximumExecutionFrequency"}))))

(clojure.core/defn- ser-account-aggregation-source-account-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-account-id coll) #:http.request.field{:shape "AccountId"}))) input), :shape "AccountAggregationSourceAccountList", :type "list", :min 1})

(clojure.core/defn- ser-earlier-time [input] #:http.request.field{:value input, :shape "EarlierTime"})

(clojure.core/defn- ser-config-rule-compliance-summary-group-key [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT_ID" "ACCOUNT_ID", :account-id "ACCOUNT_ID", "AWS_REGION" "AWS_REGION", :aws-region "AWS_REGION"} input), :shape "ConfigRuleComplianceSummaryGroupKey"})

(clojure.core/defn- ser-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-owner (:owner input)) #:http.request.field{:name "Owner", :shape "Owner"}) (clojure.core/into (ser-string-with-char-limit-256 (:source-identifier input)) #:http.request.field{:name "SourceIdentifier", :shape "StringWithCharLimit256"})], :shape "Source", :type "structure"} (clojure.core/contains? input :source-details) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-details (input :source-details)) #:http.request.field{:name "SourceDetails", :shape "SourceDetails"}))))

(clojure.core/defn- ser-evaluation [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-with-char-limit-256 (:compliance-resource-type input)) #:http.request.field{:name "ComplianceResourceType", :shape "StringWithCharLimit256"}) (clojure.core/into (ser-base-resource-id (:compliance-resource-id input)) #:http.request.field{:name "ComplianceResourceId", :shape "BaseResourceId"}) (clojure.core/into (ser-compliance-type (:compliance-type input)) #:http.request.field{:name "ComplianceType", :shape "ComplianceType"}) (clojure.core/into (ser-ordering-timestamp (:ordering-timestamp input)) #:http.request.field{:name "OrderingTimestamp", :shape "OrderingTimestamp"})], :shape "Evaluation", :type "structure"} (clojure.core/contains? input :annotation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-with-char-limit-256 (input :annotation)) #:http.request.field{:name "Annotation", :shape "StringWithCharLimit256"}))))

(clojure.core/defn- ser-resource-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-key coll) #:http.request.field{:shape "ResourceKey"}))) input), :shape "ResourceKeys", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-config-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source (:source input)) #:http.request.field{:name "Source", :shape "Source"})], :shape "ConfigRule", :type "structure"} (clojure.core/contains? input :input-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-with-char-limit-1024 (input :input-parameters)) #:http.request.field{:name "InputParameters", :shape "StringWithCharLimit1024"})) (clojure.core/contains? input :config-rule-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :config-rule-id)) #:http.request.field{:name "ConfigRuleId", :shape "String"})) (clojure.core/contains? input :config-rule-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :config-rule-arn)) #:http.request.field{:name "ConfigRuleArn", :shape "String"})) (clojure.core/contains? input :created-by) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-with-char-limit-256 (input :created-by)) #:http.request.field{:name "CreatedBy", :shape "StringWithCharLimit256"})) (clojure.core/contains? input :config-rule-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-rule-state (input :config-rule-state)) #:http.request.field{:name "ConfigRuleState", :shape "ConfigRuleState"})) (clojure.core/contains? input :config-rule-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-with-char-limit-64 (input :config-rule-name)) #:http.request.field{:name "ConfigRuleName", :shape "StringWithCharLimit64"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-emptiable-string-with-char-limit-256 (input :description)) #:http.request.field{:name "Description", :shape "EmptiableStringWithCharLimit256"})) (clojure.core/contains? input :maximum-execution-frequency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maximum-execution-frequency (input :maximum-execution-frequency)) #:http.request.field{:name "MaximumExecutionFrequency", :shape "MaximumExecutionFrequency"})) (clojure.core/contains? input :scope) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scope (input :scope)) #:http.request.field{:name "Scope", :shape "Scope"}))))

(clojure.core/defn- ser-configuration-aggregator-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configuration-aggregator-name coll) #:http.request.field{:shape "ConfigurationAggregatorName"}))) input), :shape "ConfigurationAggregatorNameList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-delivery-channel-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-channel-name coll) #:http.request.field{:shape "ChannelName"}))) input), :shape "DeliveryChannelNameList", :type "list"})

(clojure.core/defn- ser-all-supported [input] #:http.request.field{:value input, :shape "AllSupported"})

(clojure.core/defn- ser-configuration-aggregator-name [input] #:http.request.field{:value input, :shape "ConfigurationAggregatorName"})

(clojure.core/defn- ser-source-detail [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SourceDetail", :type "structure"} (clojure.core/contains? input :event-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-source (input :event-source)) #:http.request.field{:name "EventSource", :shape "EventSource"})) (clojure.core/contains? input :message-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-type (input :message-type)) #:http.request.field{:name "MessageType", :shape "MessageType"})) (clojure.core/contains? input :maximum-execution-frequency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maximum-execution-frequency (input :maximum-execution-frequency)) #:http.request.field{:name "MaximumExecutionFrequency", :shape "MaximumExecutionFrequency"}))))

(clojure.core/defn- ser-source-details [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-source-detail coll) #:http.request.field{:shape "SourceDetail"}))) input), :shape "SourceDetails", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-reevaluate-config-rule-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-with-char-limit-64 coll) #:http.request.field{:shape "StringWithCharLimit64"}))) input), :shape "ReevaluateConfigRuleNames", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-chronological-order [input] #:http.request.field{:value (clojure.core/get {"Reverse" "Reverse", :reverse "Reverse", "Forward" "Forward", :forward "Forward"} input), :shape "ChronologicalOrder"})

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-compliance-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compliance-type coll) #:http.request.field{:shape "ComplianceType"}))) input), :shape "ComplianceTypes", :type "list", :max 3, :min 0})

(clojure.core/defn- ser-configuration-recorder [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ConfigurationRecorder", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recorder-name (input :name)) #:http.request.field{:name "name", :shape "RecorderName"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "roleARN", :shape "String"})) (clojure.core/contains? input :recording-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recording-group (input :recording-group)) #:http.request.field{:name "recordingGroup", :shape "RecordingGroup"}))))

(clojure.core/defn- ser-retention-configuration-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-retention-configuration-name coll) #:http.request.field{:shape "RetentionConfigurationName"}))) input), :shape "RetentionConfigurationNameList", :type "list", :max 1, :min 0})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-recorder-name [input] #:http.request.field{:value input, :shape "RecorderName"})

(clojure.core/defn- ser-config-rule-state [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING", "DELETING_RESULTS" "DELETING_RESULTS", :deleting-results "DELETING_RESULTS", "EVALUATING" "EVALUATING", :evaluating "EVALUATING"} input), :shape "ConfigRuleState"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-configuration-recorder-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-recorder-name coll) #:http.request.field{:shape "RecorderName"}))) input), :shape "ConfigurationRecorderNameList", :type "list"})

(clojure.core/defn- ser-string-with-char-limit-64 [input] #:http.request.field{:value input, :shape "StringWithCharLimit64"})

(clojure.core/defn- ser-resource-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-type coll) #:http.request.field{:shape "ResourceType"}))) input), :shape "ResourceTypeList", :type "list"})

(clojure.core/defn- ser-config-rule-name [input] #:http.request.field{:value input, :shape "ConfigRuleName"})

(clojure.core/defn- ser-string-with-char-limit-128 [input] #:http.request.field{:value input, :shape "StringWithCharLimit128"})

(clojure.core/defn- ser-channel-name [input] #:http.request.field{:value input, :shape "ChannelName"})

(clojure.core/defn- ser-later-time [input] #:http.request.field{:value input, :shape "LaterTime"})

(clojure.core/defn- ser-evaluations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-evaluation coll) #:http.request.field{:shape "Evaluation"}))) input), :shape "Evaluations", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-retention-configuration-name [input] #:http.request.field{:value input, :shape "RetentionConfigurationName"})

(clojure.core/defn- ser-string-with-char-limit-256 [input] #:http.request.field{:value input, :shape "StringWithCharLimit256"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-include-global-resource-types [input] #:http.request.field{:value input, :shape "IncludeGlobalResourceTypes"})

(clojure.core/defn- ser-aggregated-source-status-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-aggregated-source-status-type coll) #:http.request.field{:shape "AggregatedSourceStatusType"}))) input), :shape "AggregatedSourceStatusTypeList", :type "list", :min 1})

(clojure.core/defn- ser-config-rule-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-with-char-limit-64 coll) #:http.request.field{:shape "StringWithCharLimit64"}))) input), :shape "ConfigRuleNames", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-base-resource-id [input] #:http.request.field{:value input, :shape "BaseResourceId"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-config-rule-compliance-filters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ConfigRuleComplianceFilters", :type "structure"} (clojure.core/contains? input :config-rule-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-rule-name (input :config-rule-name)) #:http.request.field{:name "ConfigRuleName", :shape "ConfigRuleName"})) (clojure.core/contains? input :compliance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-type (input :compliance-type)) #:http.request.field{:name "ComplianceType", :shape "ComplianceType"})) (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})) (clojure.core/contains? input :aws-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-region (input :aws-region)) #:http.request.field{:name "AwsRegion", :shape "AwsRegion"}))))

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value (clojure.core/get {:awswaf-regional-rate-based-rule "AWS::WAFRegional::RateBasedRule", "AWS::ElasticBeanstalk::Application" "AWS::ElasticBeanstalk::Application", :aws-auto-scaling-scheduled-action "AWS::AutoScaling::ScheduledAction", "AWS::ElasticLoadBalancing::LoadBalancer" "AWS::ElasticLoadBalancing::LoadBalancer", :aws-cloud-front-streaming-distribution "AWS::CloudFront::StreamingDistribution", "AWS::CloudFront::Distribution" "AWS::CloudFront::Distribution", "AWS::WAFRegional::RuleGroup" "AWS::WAFRegional::RuleGroup", :awss-3-bucket "AWS::S3::Bucket", "AWS::IAM::User" "AWS::IAM::User", :aws-redshift-event-subscription "AWS::Redshift::EventSubscription", "AWS::CloudTrail::Trail" "AWS::CloudTrail::Trail", "AWS::RDS::EventSubscription" "AWS::RDS::EventSubscription", "AWS::RDS::DBInstance" "AWS::RDS::DBInstance", :aws-redshift-cluster-security-group "AWS::Redshift::ClusterSecurityGroup", "AWS::Redshift::EventSubscription" "AWS::Redshift::EventSubscription", "AWS::IAM::Group" "AWS::IAM::Group", :aws-elastic-beanstalk-application "AWS::ElasticBeanstalk::Application", :aws-redshift-cluster "AWS::Redshift::Cluster", :aws-elastic-beanstalk-application-version "AWS::ElasticBeanstalk::ApplicationVersion", "AWS::AutoScaling::ScheduledAction" "AWS::AutoScaling::ScheduledAction", :awsssm-managed-instance-inventory "AWS::SSM::ManagedInstanceInventory", "AWS::WAF::WebACL" "AWS::WAF::WebACL", :awsec-2-internet-gateway "AWS::EC2::InternetGateway", "AWS::EC2::RouteTable" "AWS::EC2::RouteTable", "AWS::RDS::DBSecurityGroup" "AWS::RDS::DBSecurityGroup", :awsx-ray-encryption-config "AWS::XRay::EncryptionConfig", "AWS::XRay::EncryptionConfig" "AWS::XRay::EncryptionConfig", :awsec-2-route-table "AWS::EC2::RouteTable", :aws-auto-scaling-scaling-policy "AWS::AutoScaling::ScalingPolicy", "AWS::EC2::NetworkAcl" "AWS::EC2::NetworkAcl", "AWS::IAM::Policy" "AWS::IAM::Policy", :awsec-2-customer-gateway "AWS::EC2::CustomerGateway", "AWS::CloudFront::StreamingDistribution" "AWS::CloudFront::StreamingDistribution", "AWS::AutoScaling::LaunchConfiguration" "AWS::AutoScaling::LaunchConfiguration", :awsec-2-vpn-connection "AWS::EC2::VPNConnection", :awswaf-regional-rule "AWS::WAFRegional::Rule", "AWS::ElasticLoadBalancingV2::LoadBalancer" "AWS::ElasticLoadBalancingV2::LoadBalancer", "AWS::EC2::VPNGateway" "AWS::EC2::VPNGateway", "AWS::RDS::DBSubnetGroup" "AWS::RDS::DBSubnetGroup", "AWS::Redshift::ClusterSubnetGroup" "AWS::Redshift::ClusterSubnetGroup", :awswaf-regional-rule-group "AWS::WAFRegional::RuleGroup", "AWS::EC2::SecurityGroup" "AWS::EC2::SecurityGroup", :awsec-2-eip "AWS::EC2::EIP", :aws-code-build-project "AWS::CodeBuild::Project", :awsiam-group "AWS::IAM::Group", "AWS::Lambda::Function" "AWS::Lambda::Function", "AWS::Redshift::ClusterSnapshot" "AWS::Redshift::ClusterSnapshot", "AWS::EC2::VPC" "AWS::EC2::VPC", :awsec-2-security-group "AWS::EC2::SecurityGroup", "AWS::IAM::Role" "AWS::IAM::Role", "AWS::EC2::InternetGateway" "AWS::EC2::InternetGateway", :aws-redshift-cluster-snapshot "AWS::Redshift::ClusterSnapshot", "AWS::AutoScaling::ScalingPolicy" "AWS::AutoScaling::ScalingPolicy", :aws-dynamo-db-table "AWS::DynamoDB::Table", "AWS::EC2::CustomerGateway" "AWS::EC2::CustomerGateway", "AWS::WAF::Rule" "AWS::WAF::Rule", "AWS::EC2::Subnet" "AWS::EC2::Subnet", :aws-cloud-formation-stack "AWS::CloudFormation::Stack", :aws-redshift-cluster-subnet-group "AWS::Redshift::ClusterSubnetGroup", :aws-lambda-function "AWS::Lambda::Function", :awswaf-rule "AWS::WAF::Rule", :aws-auto-scaling-auto-scaling-group "AWS::AutoScaling::AutoScalingGroup", :aws-cloud-trail-trail "AWS::CloudTrail::Trail", :aws-elastic-load-balancing-load-balancer "AWS::ElasticLoadBalancing::LoadBalancer", "AWS::CloudWatch::Alarm" "AWS::CloudWatch::Alarm", "AWS::EC2::VPNConnection" "AWS::EC2::VPNConnection", :awsec-2-volume "AWS::EC2::Volume", "AWS::ElasticBeanstalk::Environment" "AWS::ElasticBeanstalk::Environment", "AWS::S3::Bucket" "AWS::S3::Bucket", "AWS::Redshift::ClusterSecurityGroup" "AWS::Redshift::ClusterSecurityGroup", :aws-cloud-watch-alarm "AWS::CloudWatch::Alarm", "AWS::EC2::Instance" "AWS::EC2::Instance", :awsec-2-host "AWS::EC2::Host", :awswaf-rate-based-rule "AWS::WAF::RateBasedRule", :aws-elastic-beanstalk-environment "AWS::ElasticBeanstalk::Environment", :awswaf-rule-group "AWS::WAF::RuleGroup", :aws-cloud-front-distribution "AWS::CloudFront::Distribution", :awsrdsdb-instance "AWS::RDS::DBInstance", "AWS::EC2::NetworkInterface" "AWS::EC2::NetworkInterface", :awsec-2-network-acl "AWS::EC2::NetworkAcl", :awswaf-web-acl "AWS::WAF::WebACL", :aws-auto-scaling-launch-configuration "AWS::AutoScaling::LaunchConfiguration", "AWS::SSM::ManagedInstanceInventory" "AWS::SSM::ManagedInstanceInventory", :awsrdsdb-snapshot "AWS::RDS::DBSnapshot", "AWS::ACM::Certificate" "AWS::ACM::Certificate", "AWS::EC2::Host" "AWS::EC2::Host", :awsec-2-vpc "AWS::EC2::VPC", "AWS::WAF::RateBasedRule" "AWS::WAF::RateBasedRule", "AWS::WAFRegional::RateBasedRule" "AWS::WAFRegional::RateBasedRule", "AWS::CodeBuild::Project" "AWS::CodeBuild::Project", "AWS::AutoScaling::AutoScalingGroup" "AWS::AutoScaling::AutoScalingGroup", :awsec-2-subnet "AWS::EC2::Subnet", "AWS::CloudFormation::Stack" "AWS::CloudFormation::Stack", :aws-redshift-cluster-parameter-group "AWS::Redshift::ClusterParameterGroup", :awsrdsdb-security-group "AWS::RDS::DBSecurityGroup", "AWS::EC2::Volume" "AWS::EC2::Volume", "AWS::Redshift::Cluster" "AWS::Redshift::Cluster", "AWS::RDS::DBSnapshot" "AWS::RDS::DBSnapshot", :aws-elastic-load-balancing-v-2-load-balancer "AWS::ElasticLoadBalancingV2::LoadBalancer", :awsiam-user "AWS::IAM::User", "AWS::WAFRegional::Rule" "AWS::WAFRegional::Rule", "AWS::EC2::EIP" "AWS::EC2::EIP", "AWS::DynamoDB::Table" "AWS::DynamoDB::Table", "AWS::WAFRegional::WebACL" "AWS::WAFRegional::WebACL", "AWS::Redshift::ClusterParameterGroup" "AWS::Redshift::ClusterParameterGroup", :awsrdsdb-subnet-group "AWS::RDS::DBSubnetGroup", :awswaf-regional-web-acl "AWS::WAFRegional::WebACL", :awsiam-role "AWS::IAM::Role", :awsec-2-vpn-gateway "AWS::EC2::VPNGateway", "AWS::ElasticBeanstalk::ApplicationVersion" "AWS::ElasticBeanstalk::ApplicationVersion", :awsiam-policy "AWS::IAM::Policy", :awsacm-certificate "AWS::ACM::Certificate", "AWS::WAF::RuleGroup" "AWS::WAF::RuleGroup", :awsec-2-instance "AWS::EC2::Instance", :awsrds-event-subscription "AWS::RDS::EventSubscription", :awsec-2-network-interface "AWS::EC2::NetworkInterface"} input), :shape "ResourceType"})

(clojure.core/defn- ser-config-rule-compliance-summary-filters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ConfigRuleComplianceSummaryFilters", :type "structure"} (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})) (clojure.core/contains? input :aws-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-region (input :aws-region)) #:http.request.field{:name "AwsRegion", :shape "AwsRegion"}))))

(clojure.core/defn- ser-organization-aggregation-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "String"})], :shape "OrganizationAggregationSource", :type "structure"} (clojure.core/contains? input :aws-regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aggregator-region-list (input :aws-regions)) #:http.request.field{:name "AwsRegions", :shape "AggregatorRegionList"})) (clojure.core/contains? input :all-aws-regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :all-aws-regions)) #:http.request.field{:name "AllAwsRegions", :shape "Boolean"}))))

(clojure.core/defn- ser-describe-pending-aggregation-requests-limit [input] #:http.request.field{:value input, :shape "DescribePendingAggregationRequestsLimit"})

(clojure.core/defn- ser-message-type [input] #:http.request.field{:value (clojure.core/get {"ConfigurationItemChangeNotification" "ConfigurationItemChangeNotification", :configuration-item-change-notification "ConfigurationItemChangeNotification", "ConfigurationSnapshotDeliveryCompleted" "ConfigurationSnapshotDeliveryCompleted", :configuration-snapshot-delivery-completed "ConfigurationSnapshotDeliveryCompleted", "ScheduledNotification" "ScheduledNotification", :scheduled-notification "ScheduledNotification", "OversizedConfigurationItemChangeNotification" "OversizedConfigurationItemChangeNotification", :oversized-configuration-item-change-notification "OversizedConfigurationItemChangeNotification"} input), :shape "MessageType"})

(clojure.core/defn- ser-maximum-execution-frequency [input] #:http.request.field{:value (clojure.core/get {"Twelve_Hours" "Twelve_Hours", "One_Hour" "One_Hour", :six-hours "Six_Hours", "TwentyFour_Hours" "TwentyFour_Hours", "Three_Hours" "Three_Hours", :three-hours "Three_Hours", :twenty-four-hours "TwentyFour_Hours", :twelve-hours "Twelve_Hours", "Six_Hours" "Six_Hours", :one-hour "One_Hour"} input), :shape "MaximumExecutionFrequency"})

(clojure.core/defn- ser-owner [input] #:http.request.field{:value (clojure.core/get {"CUSTOM_LAMBDA" "CUSTOM_LAMBDA", :custom-lambda "CUSTOM_LAMBDA", "AWS" "AWS", :aws "AWS"} input), :shape "Owner"})

(clojure.core/defn- ser-recording-group [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RecordingGroup", :type "structure"} (clojure.core/contains? input :all-supported) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-all-supported (input :all-supported)) #:http.request.field{:name "allSupported", :shape "AllSupported"})) (clojure.core/contains? input :include-global-resource-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-global-resource-types (input :include-global-resource-types)) #:http.request.field{:name "includeGlobalResourceTypes", :shape "IncludeGlobalResourceTypes"})) (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-type-list (input :resource-types)) #:http.request.field{:name "resourceTypes", :shape "ResourceTypeList"}))))

(clojure.core/defn- ser-compliance-type [input] #:http.request.field{:value (clojure.core/get {"COMPLIANT" "COMPLIANT", :compliant "COMPLIANT", "NON_COMPLIANT" "NON_COMPLIANT", :non-compliant "NON_COMPLIANT", "NOT_APPLICABLE" "NOT_APPLICABLE", :not-applicable "NOT_APPLICABLE", "INSUFFICIENT_DATA" "INSUFFICIENT_DATA", :insufficient-data "INSUFFICIENT_DATA"} input), :shape "ComplianceType"})

(clojure.core/defn- ser-resource-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-with-char-limit-256 coll) #:http.request.field{:shape "StringWithCharLimit256"}))) input), :shape "ResourceTypes", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-aggregator-region-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "AggregatorRegionList", :type "list", :min 1})

(clojure.core/defn- ser-rule-limit [input] #:http.request.field{:value input, :shape "RuleLimit"})

(clojure.core/defn- ser-ordering-timestamp [input] #:http.request.field{:value input, :shape "OrderingTimestamp"})

(clojure.core/defn- ser-resource-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-id coll) #:http.request.field{:shape "ResourceId"}))) input), :shape "ResourceIdList", :type "list"})

(clojure.core/defn- ser-retention-period-in-days [input] #:http.request.field{:value input, :shape "RetentionPeriodInDays"})

(clojure.core/defn- ser-event-source [input] #:http.request.field{:value (clojure.core/get {"aws.config" "aws.config", :awsconfig "aws.config"} input), :shape "EventSource"})

(clojure.core/defn- ser-aggregated-source-status-type [input] #:http.request.field{:value (clojure.core/get {"FAILED" "FAILED", :failed "FAILED", "SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED", "OUTDATED" "OUTDATED", :outdated "OUTDATED"} input), :shape "AggregatedSourceStatusType"})

(clojure.core/defn- ser-account-aggregation-source-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-account-aggregation-source coll) #:http.request.field{:shape "AccountAggregationSource"}))) input), :shape "AccountAggregationSourceList", :type "list", :max 1, :min 0})

(clojure.core/defn- ser-compliance-resource-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-with-char-limit-256 coll) #:http.request.field{:shape "StringWithCharLimit256"}))) input), :shape "ComplianceResourceTypes", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-aws-region [input] #:http.request.field{:value input, :shape "AwsRegion"})

(clojure.core/defn- ser-emptiable-string-with-char-limit-256 [input] #:http.request.field{:value input, :shape "EmptiableStringWithCharLimit256"})

(clojure.core/defn- ser-scope [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Scope", :type "structure"} (clojure.core/contains? input :compliance-resource-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-resource-types (input :compliance-resource-types)) #:http.request.field{:name "ComplianceResourceTypes", :shape "ComplianceResourceTypes"})) (clojure.core/contains? input :tag-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-with-char-limit-128 (input :tag-key)) #:http.request.field{:name "TagKey", :shape "StringWithCharLimit128"})) (clojure.core/contains? input :tag-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-with-char-limit-256 (input :tag-value)) #:http.request.field{:name "TagValue", :shape "StringWithCharLimit256"})) (clojure.core/contains? input :compliance-resource-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-base-resource-id (input :compliance-resource-id)) #:http.request.field{:name "ComplianceResourceId", :shape "BaseResourceId"}))))

(clojure.core/defn- ser-string-with-char-limit-1024 [input] #:http.request.field{:value input, :shape "StringWithCharLimit1024"})

(clojure.core/defn- ser-group-by-api-limit [input] #:http.request.field{:value input, :shape "GroupByAPILimit"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-describe-delivery-channel-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :delivery-channel-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delivery-channel-name-list (input :delivery-channel-names)) #:http.request.field{:name "DeliveryChannelNames", :shape "DeliveryChannelNameList"}))))

(clojure.core/defn- req-describe-config-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :config-rule-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-rule-names (input :config-rule-names)) #:http.request.field{:name "ConfigRuleNames", :shape "ConfigRuleNames"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-put-config-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-config-rule (input :config-rule)) #:http.request.field{:name "ConfigRule", :shape "ConfigRule"})]}))

(clojure.core/defn- req-describe-aggregation-authorizations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-configuration-aggregators-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :configuration-aggregator-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-aggregator-name-list (input :configuration-aggregator-names)) #:http.request.field{:name "ConfigurationAggregatorNames", :shape "ConfigurationAggregatorNameList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-delete-pending-aggregation-request-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :requester-account-id)) #:http.request.field{:name "RequesterAccountId", :shape "AccountId"}) (clojure.core/into (ser-aws-region (input :requester-aws-region)) #:http.request.field{:name "RequesterAwsRegion", :shape "AwsRegion"})]}))

(clojure.core/defn- req-delete-configuration-recorder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-recorder-name (input :configuration-recorder-name)) #:http.request.field{:name "ConfigurationRecorderName", :shape "RecorderName"})]}))

(clojure.core/defn- req-delete-configuration-aggregator-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-aggregator-name (input :configuration-aggregator-name)) #:http.request.field{:name "ConfigurationAggregatorName", :shape "ConfigurationAggregatorName"})]}))

(clojure.core/defn- req-get-compliance-summary-by-resource-type-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-types (input :resource-types)) #:http.request.field{:name "ResourceTypes", :shape "ResourceTypes"}))))

(clojure.core/defn- req-get-resource-config-history-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "resourceType", :shape "ResourceType"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "resourceId", :shape "ResourceId"})]} (clojure.core/contains? input :later-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-later-time (input :later-time)) #:http.request.field{:name "laterTime", :shape "LaterTime"})) (clojure.core/contains? input :earlier-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-earlier-time (input :earlier-time)) #:http.request.field{:name "earlierTime", :shape "EarlierTime"})) (clojure.core/contains? input :chronological-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-chronological-order (input :chronological-order)) #:http.request.field{:name "chronologicalOrder", :shape "ChronologicalOrder"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "limit", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-configuration-aggregator-sources-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-aggregator-name (input :configuration-aggregator-name)) #:http.request.field{:name "ConfigurationAggregatorName", :shape "ConfigurationAggregatorName"})]} (clojure.core/contains? input :update-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aggregated-source-status-type-list (input :update-status)) #:http.request.field{:name "UpdateStatus", :shape "AggregatedSourceStatusTypeList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-delete-aggregation-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :authorized-account-id)) #:http.request.field{:name "AuthorizedAccountId", :shape "AccountId"}) (clojure.core/into (ser-aws-region (input :authorized-aws-region)) #:http.request.field{:name "AuthorizedAwsRegion", :shape "AwsRegion"})]}))

(clojure.core/defn- req-describe-compliance-by-config-rule-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :config-rule-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-rule-names (input :config-rule-names)) #:http.request.field{:name "ConfigRuleNames", :shape "ConfigRuleNames"})) (clojure.core/contains? input :compliance-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-types (input :compliance-types)) #:http.request.field{:name "ComplianceTypes", :shape "ComplianceTypes"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-start-configuration-recorder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-recorder-name (input :configuration-recorder-name)) #:http.request.field{:name "ConfigurationRecorderName", :shape "RecorderName"})]}))

(clojure.core/defn- req-list-discovered-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "resourceType", :shape "ResourceType"})]} (clojure.core/contains? input :resource-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-list (input :resource-ids)) #:http.request.field{:name "resourceIds", :shape "ResourceIdList"})) (clojure.core/contains? input :resource-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :resource-name)) #:http.request.field{:name "resourceName", :shape "ResourceName"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "limit", :shape "Limit"})) (clojure.core/contains? input :include-deleted-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-deleted-resources)) #:http.request.field{:name "includeDeletedResources", :shape "Boolean"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-configuration-recorder-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :configuration-recorder-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-recorder-name-list (input :configuration-recorder-names)) #:http.request.field{:name "ConfigurationRecorderNames", :shape "ConfigurationRecorderNameList"}))))

(clojure.core/defn- req-put-evaluations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :result-token)) #:http.request.field{:name "ResultToken", :shape "String"})]} (clojure.core/contains? input :evaluations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-evaluations (input :evaluations)) #:http.request.field{:name "Evaluations", :shape "Evaluations"})) (clojure.core/contains? input :test-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :test-mode)) #:http.request.field{:name "TestMode", :shape "Boolean"}))))

(clojure.core/defn- req-delete-config-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-with-char-limit-64 (input :config-rule-name)) #:http.request.field{:name "ConfigRuleName", :shape "StringWithCharLimit64"})]}))

(clojure.core/defn- req-describe-pending-aggregation-requests-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-pending-aggregation-requests-limit (input :limit)) #:http.request.field{:name "Limit", :shape "DescribePendingAggregationRequestsLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-compliance-by-resource-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-with-char-limit-256 (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "StringWithCharLimit256"})) (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-base-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "BaseResourceId"})) (clojure.core/contains? input :compliance-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-types (input :compliance-types)) #:http.request.field{:name "ComplianceTypes", :shape "ComplianceTypes"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-put-delivery-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-channel (input :delivery-channel)) #:http.request.field{:name "DeliveryChannel", :shape "DeliveryChannel"})]}))

(clojure.core/defn- req-put-configuration-recorder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-recorder (input :configuration-recorder)) #:http.request.field{:name "ConfigurationRecorder", :shape "ConfigurationRecorder"})]}))

(clojure.core/defn- req-put-aggregation-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :authorized-account-id)) #:http.request.field{:name "AuthorizedAccountId", :shape "AccountId"}) (clojure.core/into (ser-aws-region (input :authorized-aws-region)) #:http.request.field{:name "AuthorizedAwsRegion", :shape "AwsRegion"})]}))

(clojure.core/defn- req-get-compliance-details-by-config-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-with-char-limit-64 (input :config-rule-name)) #:http.request.field{:name "ConfigRuleName", :shape "StringWithCharLimit64"})]} (clojure.core/contains? input :compliance-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-types (input :compliance-types)) #:http.request.field{:name "ComplianceTypes", :shape "ComplianceTypes"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-aggregate-compliance-by-config-rules-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-aggregator-name (input :configuration-aggregator-name)) #:http.request.field{:name "ConfigurationAggregatorName", :shape "ConfigurationAggregatorName"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-rule-compliance-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ConfigRuleComplianceFilters"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-by-api-limit (input :limit)) #:http.request.field{:name "Limit", :shape "GroupByAPILimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-put-retention-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-retention-period-in-days (input :retention-period-in-days)) #:http.request.field{:name "RetentionPeriodInDays", :shape "RetentionPeriodInDays"})]}))

(clojure.core/defn- req-get-compliance-details-by-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-with-char-limit-256 (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "StringWithCharLimit256"}) (clojure.core/into (ser-base-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "BaseResourceId"})]} (clojure.core/contains? input :compliance-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-types (input :compliance-types)) #:http.request.field{:name "ComplianceTypes", :shape "ComplianceTypes"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-describe-config-rule-evaluation-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :config-rule-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-rule-names (input :config-rule-names)) #:http.request.field{:name "ConfigRuleNames", :shape "ConfigRuleNames"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-limit (input :limit)) #:http.request.field{:name "Limit", :shape "RuleLimit"}))))

(clojure.core/defn- req-delete-evaluation-results-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-with-char-limit-64 (input :config-rule-name)) #:http.request.field{:name "ConfigRuleName", :shape "StringWithCharLimit64"})]}))

(clojure.core/defn- req-put-configuration-aggregator-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-aggregator-name (input :configuration-aggregator-name)) #:http.request.field{:name "ConfigurationAggregatorName", :shape "ConfigurationAggregatorName"})]} (clojure.core/contains? input :account-aggregation-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-aggregation-source-list (input :account-aggregation-sources)) #:http.request.field{:name "AccountAggregationSources", :shape "AccountAggregationSourceList"})) (clojure.core/contains? input :organization-aggregation-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organization-aggregation-source (input :organization-aggregation-source)) #:http.request.field{:name "OrganizationAggregationSource", :shape "OrganizationAggregationSource"}))))

(clojure.core/defn- req-deliver-config-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-channel-name (input :delivery-channel-name)) #:http.request.field{:name "deliveryChannelName", :shape "ChannelName"})]}))

(clojure.core/defn- req-describe-configuration-recorders-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :configuration-recorder-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-recorder-name-list (input :configuration-recorder-names)) #:http.request.field{:name "ConfigurationRecorderNames", :shape "ConfigurationRecorderNameList"}))))

(clojure.core/defn- req-stop-configuration-recorder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-recorder-name (input :configuration-recorder-name)) #:http.request.field{:name "ConfigurationRecorderName", :shape "RecorderName"})]}))

(clojure.core/defn- req-batch-get-resource-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-keys (input :resource-keys)) #:http.request.field{:name "resourceKeys", :shape "ResourceKeys"})]}))

(clojure.core/defn- req-get-aggregate-compliance-details-by-config-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-aggregator-name (input :configuration-aggregator-name)) #:http.request.field{:name "ConfigurationAggregatorName", :shape "ConfigurationAggregatorName"}) (clojure.core/into (ser-config-rule-name (input :config-rule-name)) #:http.request.field{:name "ConfigRuleName", :shape "ConfigRuleName"}) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-aws-region (input :aws-region)) #:http.request.field{:name "AwsRegion", :shape "AwsRegion"})]} (clojure.core/contains? input :compliance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-type (input :compliance-type)) #:http.request.field{:name "ComplianceType", :shape "ComplianceType"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-delivery-channels-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :delivery-channel-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delivery-channel-name-list (input :delivery-channel-names)) #:http.request.field{:name "DeliveryChannelNames", :shape "DeliveryChannelNameList"}))))

(clojure.core/defn- req-delete-retention-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-retention-configuration-name (input :retention-configuration-name)) #:http.request.field{:name "RetentionConfigurationName", :shape "RetentionConfigurationName"})]}))

(clojure.core/defn- req-start-config-rules-evaluation-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :config-rule-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reevaluate-config-rule-names (input :config-rule-names)) #:http.request.field{:name "ConfigRuleNames", :shape "ReevaluateConfigRuleNames"}))))

(clojure.core/defn- req-get-discovered-resource-counts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-types (input :resource-types)) #:http.request.field{:name "resourceTypes", :shape "ResourceTypes"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "limit", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-aggregate-config-rule-compliance-summary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-aggregator-name (input :configuration-aggregator-name)) #:http.request.field{:name "ConfigurationAggregatorName", :shape "ConfigurationAggregatorName"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-rule-compliance-summary-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ConfigRuleComplianceSummaryFilters"})) (clojure.core/contains? input :group-by-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-config-rule-compliance-summary-group-key (input :group-by-key)) #:http.request.field{:name "GroupByKey", :shape "ConfigRuleComplianceSummaryGroupKey"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-by-api-limit (input :limit)) #:http.request.field{:name "Limit", :shape "GroupByAPILimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-delivery-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-channel-name (input :delivery-channel-name)) #:http.request.field{:name "DeliveryChannelName", :shape "ChannelName"})]}))

(clojure.core/defn- req-describe-retention-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :retention-configuration-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-configuration-name-list (input :retention-configuration-names)) #:http.request.field{:name "RetentionConfigurationNames", :shape "RetentionConfigurationNameList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.spec.alpha/def :portkey.aws.config/configuration-item-status #{:resource-discovered "ResourceNotRecorded" "ResourceDeleted" :resource-not-recorded "OK" "ResourceDeletedNotRecorded" :ok "ResourceDiscovered" :resource-deleted-not-recorded :resource-deleted})

(clojure.spec.alpha/def :portkey.aws.config.describe-delivery-channel-status-request/delivery-channel-names (clojure.spec.alpha/and :portkey.aws.config/delivery-channel-name-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-delivery-channel-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-delivery-channel-status-request/delivery-channel-names]))

(clojure.spec.alpha/def :portkey.aws.config.batch-get-resource-config-response/base-configuration-items (clojure.spec.alpha/and :portkey.aws.config/base-configuration-items))
(clojure.spec.alpha/def :portkey.aws.config.batch-get-resource-config-response/unprocessed-resource-keys (clojure.spec.alpha/and :portkey.aws.config/resource-keys))
(clojure.spec.alpha/def :portkey.aws.config/batch-get-resource-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.batch-get-resource-config-response/base-configuration-items :portkey.aws.config.batch-get-resource-config-response/unprocessed-resource-keys]))

(clojure.spec.alpha/def :portkey.aws.config/no-such-configuration-aggregator-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.describe-config-rules-request/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-config-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/config-rule-names :portkey.aws.config.describe-config-rules-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/no-available-configuration-recorder-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.aggregation-authorization/aggregation-authorization-arn (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.aggregation-authorization/authorized-account-id (clojure.spec.alpha/and :portkey.aws.config/account-id))
(clojure.spec.alpha/def :portkey.aws.config.aggregation-authorization/authorized-aws-region (clojure.spec.alpha/and :portkey.aws.config/aws-region))
(clojure.spec.alpha/def :portkey.aws.config.aggregation-authorization/creation-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config/aggregation-authorization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.aggregation-authorization/aggregation-authorization-arn :portkey.aws.config.aggregation-authorization/authorized-account-id :portkey.aws.config.aggregation-authorization/authorized-aws-region :portkey.aws.config.aggregation-authorization/creation-time]))

(clojure.spec.alpha/def :portkey.aws.config.delivery-channel/name (clojure.spec.alpha/and :portkey.aws.config/channel-name))
(clojure.spec.alpha/def :portkey.aws.config.delivery-channel/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.delivery-channel/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.delivery-channel/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.delivery-channel/config-snapshot-delivery-properties (clojure.spec.alpha/and :portkey.aws.config/config-snapshot-delivery-properties))
(clojure.spec.alpha/def :portkey.aws.config/delivery-channel (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.delivery-channel/name :portkey.aws.config.delivery-channel/s-3-bucket-name :portkey.aws.config.delivery-channel/s-3-key-prefix :portkey.aws.config.delivery-channel/sns-topic-arn :portkey.aws.config.delivery-channel/config-snapshot-delivery-properties]))

(clojure.spec.alpha/def :portkey.aws.config.account-aggregation-source/account-ids (clojure.spec.alpha/and :portkey.aws.config/account-aggregation-source-account-list))
(clojure.spec.alpha/def :portkey.aws.config.account-aggregation-source/all-aws-regions (clojure.spec.alpha/and :portkey.aws.config/boolean))
(clojure.spec.alpha/def :portkey.aws.config.account-aggregation-source/aws-regions (clojure.spec.alpha/and :portkey.aws.config/aggregator-region-list))
(clojure.spec.alpha/def :portkey.aws.config/account-aggregation-source (clojure.spec.alpha/keys :req-un [:portkey.aws.config.account-aggregation-source/account-ids] :opt-un [:portkey.aws.config.account-aggregation-source/all-aws-regions :portkey.aws.config.account-aggregation-source/aws-regions]))

(clojure.spec.alpha/def :portkey.aws.config.resource-key/resource-type (clojure.spec.alpha/and :portkey.aws.config/resource-type))
(clojure.spec.alpha/def :portkey.aws.config.resource-key/resource-id (clojure.spec.alpha/and :portkey.aws.config/resource-id))
(clojure.spec.alpha/def :portkey.aws.config/resource-key (clojure.spec.alpha/keys :req-un [:portkey.aws.config.resource-key/resource-type :portkey.aws.config.resource-key/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/put-config-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/config-rule] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/put-configuration-aggregator-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/configuration-aggregator]))

(clojure.spec.alpha/def :portkey.aws.config.config-snapshot-delivery-properties/delivery-frequency (clojure.spec.alpha/and :portkey.aws.config/maximum-execution-frequency))
(clojure.spec.alpha/def :portkey.aws.config/config-snapshot-delivery-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.config-snapshot-delivery-properties/delivery-frequency]))

(clojure.spec.alpha/def :portkey.aws.config/supplementary-configuration (clojure.spec.alpha/map-of :portkey.aws.config/supplementary-configuration-name :portkey.aws.config/supplementary-configuration-value))

(clojure.spec.alpha/def :portkey.aws.config/max-number-of-retention-configurations-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/account-aggregation-source-account-list (clojure.spec.alpha/coll-of :portkey.aws.config/account-id :min-count 1))

(clojure.spec.alpha/def :portkey.aws.config/no-such-config-rule-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/delete-evaluation-results-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/earlier-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.config.describe-aggregation-authorizations-request/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-aggregation-authorizations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/limit :portkey.aws.config.describe-aggregation-authorizations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/config-rule-compliance-summary-group-key #{"AWS_REGION" :account-id "ACCOUNT_ID" :aws-region})

(clojure.spec.alpha/def :portkey.aws.config.relationship/resource-type (clojure.spec.alpha/and :portkey.aws.config/resource-type))
(clojure.spec.alpha/def :portkey.aws.config.relationship/resource-id (clojure.spec.alpha/and :portkey.aws.config/resource-id))
(clojure.spec.alpha/def :portkey.aws.config.relationship/resource-name (clojure.spec.alpha/and :portkey.aws.config/resource-name))
(clojure.spec.alpha/def :portkey.aws.config.relationship/relationship-name (clojure.spec.alpha/and :portkey.aws.config/relationship-name))
(clojure.spec.alpha/def :portkey.aws.config/relationship (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.relationship/resource-type :portkey.aws.config.relationship/resource-id :portkey.aws.config.relationship/resource-name :portkey.aws.config.relationship/relationship-name]))

(clojure.spec.alpha/def :portkey.aws.config/aggregate-compliance-by-config-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/config-rule-name :portkey.aws.config/compliance :portkey.aws.config/account-id :portkey.aws.config/aws-region]))

(clojure.spec.alpha/def :portkey.aws.config/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/invalid-recording-group-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-aggregators-request/configuration-aggregator-names (clojure.spec.alpha/and :portkey.aws.config/configuration-aggregator-name-list))
(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-aggregators-request/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-configuration-aggregators-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-configuration-aggregators-request/configuration-aggregator-names :portkey.aws.config.describe-configuration-aggregators-request/next-token :portkey.aws.config/limit]))

(clojure.spec.alpha/def :portkey.aws.config/resource-counts (clojure.spec.alpha/coll-of :portkey.aws.config/resource-count))

(clojure.spec.alpha/def :portkey.aws.config/invalid-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/configuration-aggregator-list (clojure.spec.alpha/coll-of :portkey.aws.config/configuration-aggregator))

(clojure.spec.alpha/def :portkey.aws.config/max-number-of-config-rules-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.configuration-item/resource-name (clojure.spec.alpha/and :portkey.aws.config/resource-name))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/account-id (clojure.spec.alpha/and :portkey.aws.config/account-id))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/supplementary-configuration (clojure.spec.alpha/and :portkey.aws.config/supplementary-configuration))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/resource-id (clojure.spec.alpha/and :portkey.aws.config/resource-id))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/arn (clojure.spec.alpha/and :portkey.aws.config/arn))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/configuration-state-id (clojure.spec.alpha/and :portkey.aws.config/configuration-state-id))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/tags (clojure.spec.alpha/and :portkey.aws.config/tags))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/configuration (clojure.spec.alpha/and :portkey.aws.config/configuration))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/configuration-item-md-5-hash (clojure.spec.alpha/and :portkey.aws.config/configuration-item-md-5-hash))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/resource-creation-time (clojure.spec.alpha/and :portkey.aws.config/resource-creation-time))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/related-events (clojure.spec.alpha/and :portkey.aws.config/related-event-list))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/configuration-item-capture-time (clojure.spec.alpha/and :portkey.aws.config/configuration-item-capture-time))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/availability-zone (clojure.spec.alpha/and :portkey.aws.config/availability-zone))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/aws-region (clojure.spec.alpha/and :portkey.aws.config/aws-region))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/relationships (clojure.spec.alpha/and :portkey.aws.config/relationship-list))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/version (clojure.spec.alpha/and :portkey.aws.config/version))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/configuration-item-status (clojure.spec.alpha/and :portkey.aws.config/configuration-item-status))
(clojure.spec.alpha/def :portkey.aws.config.configuration-item/resource-type (clojure.spec.alpha/and :portkey.aws.config/resource-type))
(clojure.spec.alpha/def :portkey.aws.config/configuration-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.configuration-item/resource-name :portkey.aws.config.configuration-item/account-id :portkey.aws.config.configuration-item/supplementary-configuration :portkey.aws.config.configuration-item/resource-id :portkey.aws.config.configuration-item/arn :portkey.aws.config.configuration-item/configuration-state-id :portkey.aws.config.configuration-item/tags :portkey.aws.config.configuration-item/configuration :portkey.aws.config.configuration-item/configuration-item-md-5-hash :portkey.aws.config.configuration-item/resource-creation-time :portkey.aws.config.configuration-item/related-events :portkey.aws.config.configuration-item/configuration-item-capture-time :portkey.aws.config.configuration-item/availability-zone :portkey.aws.config.configuration-item/aws-region :portkey.aws.config.configuration-item/relationships :portkey.aws.config.configuration-item/version :portkey.aws.config.configuration-item/configuration-item-status :portkey.aws.config.configuration-item/resource-type]))

(clojure.spec.alpha/def :portkey.aws.config.delete-pending-aggregation-request-request/requester-account-id (clojure.spec.alpha/and :portkey.aws.config/account-id))
(clojure.spec.alpha/def :portkey.aws.config.delete-pending-aggregation-request-request/requester-aws-region (clojure.spec.alpha/and :portkey.aws.config/aws-region))
(clojure.spec.alpha/def :portkey.aws.config/delete-pending-aggregation-request-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.delete-pending-aggregation-request-request/requester-account-id :portkey.aws.config.delete-pending-aggregation-request-request/requester-aws-region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/retention-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.config/retention-configuration))

(clojure.spec.alpha/def :portkey.aws.config.delete-configuration-recorder-request/configuration-recorder-name (clojure.spec.alpha/and :portkey.aws.config/recorder-name))
(clojure.spec.alpha/def :portkey.aws.config/delete-configuration-recorder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.delete-configuration-recorder-request/configuration-recorder-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/delete-configuration-aggregator-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/configuration-aggregator-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.source/source-identifier (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config/source (clojure.spec.alpha/keys :req-un [:portkey.aws.config/owner :portkey.aws.config.source/source-identifier] :opt-un [:portkey.aws.config/source-details]))

(clojure.spec.alpha/def :portkey.aws.config/organization-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.evaluation/compliance-resource-type (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.evaluation/compliance-resource-id (clojure.spec.alpha/and :portkey.aws.config/base-resource-id))
(clojure.spec.alpha/def :portkey.aws.config.evaluation/annotation (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config/evaluation (clojure.spec.alpha/keys :req-un [:portkey.aws.config.evaluation/compliance-resource-type :portkey.aws.config.evaluation/compliance-resource-id :portkey.aws.config/compliance-type :portkey.aws.config/ordering-timestamp] :opt-un [:portkey.aws.config.evaluation/annotation]))

(clojure.spec.alpha/def :portkey.aws.config.describe-delivery-channels-response/delivery-channels (clojure.spec.alpha/and :portkey.aws.config/delivery-channel-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-delivery-channels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-delivery-channels-response/delivery-channels]))

(clojure.spec.alpha/def :portkey.aws.config/aggregated-source-type #{"ORGANIZATION" :organization :account "ACCOUNT"})

(clojure.spec.alpha/def :portkey.aws.config/resource-keys (clojure.spec.alpha/coll-of :portkey.aws.config/resource-key :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.config/resource-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.config/resource-identifier))

(clojure.spec.alpha/def :portkey.aws.config/get-compliance-summary-by-resource-type-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/resource-types]))

(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-request/resource-type (clojure.spec.alpha/and :portkey.aws.config/resource-type))
(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-request/resource-id (clojure.spec.alpha/and :portkey.aws.config/resource-id))
(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-request/later-time (clojure.spec.alpha/and :portkey.aws.config/later-time))
(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-request/earlier-time (clojure.spec.alpha/and :portkey.aws.config/earlier-time))
(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-request/chronological-order (clojure.spec.alpha/and :portkey.aws.config/chronological-order))
(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-request/limit (clojure.spec.alpha/and :portkey.aws.config/limit))
(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-request/next-token (clojure.spec.alpha/and :portkey.aws.config/next-token))
(clojure.spec.alpha/def :portkey.aws.config/get-resource-config-history-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.get-resource-config-history-request/resource-type :portkey.aws.config.get-resource-config-history-request/resource-id] :opt-un [:portkey.aws.config.get-resource-config-history-request/later-time :portkey.aws.config.get-resource-config-history-request/earlier-time :portkey.aws.config.get-resource-config-history-request/chronological-order :portkey.aws.config.get-resource-config-history-request/limit :portkey.aws.config.get-resource-config-history-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-aggregator-sources-status-request/update-status (clojure.spec.alpha/and :portkey.aws.config/aggregated-source-status-type-list))
(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-aggregator-sources-status-request/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-configuration-aggregator-sources-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/configuration-aggregator-name] :opt-un [:portkey.aws.config.describe-configuration-aggregator-sources-status-request/update-status :portkey.aws.config.describe-configuration-aggregator-sources-status-request/next-token :portkey.aws.config/limit]))

(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-response/configuration-items (clojure.spec.alpha/and :portkey.aws.config/configuration-item-list))
(clojure.spec.alpha/def :portkey.aws.config.get-resource-config-history-response/next-token (clojure.spec.alpha/and :portkey.aws.config/next-token))
(clojure.spec.alpha/def :portkey.aws.config/get-resource-config-history-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.get-resource-config-history-response/configuration-items :portkey.aws.config.get-resource-config-history-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.config-rule/input-parameters (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-1024))
(clojure.spec.alpha/def :portkey.aws.config.config-rule/config-rule-id (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-rule/config-rule-arn (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-rule/created-by (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.config-rule/config-rule-name (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-64))
(clojure.spec.alpha/def :portkey.aws.config.config-rule/description (clojure.spec.alpha/and :portkey.aws.config/emptiable-string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config/config-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.config/source] :opt-un [:portkey.aws.config.config-rule/input-parameters :portkey.aws.config.config-rule/config-rule-id :portkey.aws.config.config-rule/config-rule-arn :portkey.aws.config.config-rule/created-by :portkey.aws.config/config-rule-state :portkey.aws.config.config-rule/config-rule-name :portkey.aws.config.config-rule/description :portkey.aws.config/maximum-execution-frequency :portkey.aws.config/scope]))

(clojure.spec.alpha/def :portkey.aws.config/relationship-list (clojure.spec.alpha/coll-of :portkey.aws.config/relationship))

(clojure.spec.alpha/def :portkey.aws.config.get-aggregate-compliance-details-by-config-rule-response/aggregate-evaluation-results (clojure.spec.alpha/and :portkey.aws.config/aggregate-evaluation-result-list))
(clojure.spec.alpha/def :portkey.aws.config/get-aggregate-compliance-details-by-config-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.get-aggregate-compliance-details-by-config-rule-response/aggregate-evaluation-results :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.delete-aggregation-authorization-request/authorized-account-id (clojure.spec.alpha/and :portkey.aws.config/account-id))
(clojure.spec.alpha/def :portkey.aws.config.delete-aggregation-authorization-request/authorized-aws-region (clojure.spec.alpha/and :portkey.aws.config/aws-region))
(clojure.spec.alpha/def :portkey.aws.config/delete-aggregation-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.delete-aggregation-authorization-request/authorized-account-id :portkey.aws.config.delete-aggregation-authorization-request/authorized-aws-region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.describe-compliance-by-config-rule-request/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-compliance-by-config-rule-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/config-rule-names :portkey.aws.config/compliance-types :portkey.aws.config.describe-compliance-by-config-rule-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/configuration-recorder-status-list (clojure.spec.alpha/coll-of :portkey.aws.config/configuration-recorder-status))

(clojure.spec.alpha/def :portkey.aws.config.evaluation-result-identifier/ordering-timestamp (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config/evaluation-result-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/evaluation-result-qualifier :portkey.aws.config.evaluation-result-identifier/ordering-timestamp]))

(clojure.spec.alpha/def :portkey.aws.config.describe-pending-aggregation-requests-response/pending-aggregation-requests (clojure.spec.alpha/and :portkey.aws.config/pending-aggregation-request-list))
(clojure.spec.alpha/def :portkey.aws.config.describe-pending-aggregation-requests-response/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-pending-aggregation-requests-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-pending-aggregation-requests-response/pending-aggregation-requests :portkey.aws.config.describe-pending-aggregation-requests-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/invalid-configuration-recorder-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/configuration-aggregator-name-list (clojure.spec.alpha/coll-of :portkey.aws.config/configuration-aggregator-name :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.config/compliance-by-resources (clojure.spec.alpha/coll-of :portkey.aws.config/compliance-by-resource))

(clojure.spec.alpha/def :portkey.aws.config.start-configuration-recorder-request/configuration-recorder-name (clojure.spec.alpha/and :portkey.aws.config/recorder-name))
(clojure.spec.alpha/def :portkey.aws.config/start-configuration-recorder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.start-configuration-recorder-request/configuration-recorder-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/delivery-channel-list (clojure.spec.alpha/coll-of :portkey.aws.config/delivery-channel))

(clojure.spec.alpha/def :portkey.aws.config/delivery-channel-name-list (clojure.spec.alpha/coll-of :portkey.aws.config/channel-name))

(clojure.spec.alpha/def :portkey.aws.config/delivery-status #{:not-applicable :failure "Success" "Failure" :success "Not_Applicable"})

(clojure.spec.alpha/def :portkey.aws.config/compliance-by-config-rules (clojure.spec.alpha/coll-of :portkey.aws.config/compliance-by-config-rule))

(clojure.spec.alpha/def :portkey.aws.config/resource-creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.config/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/tags (clojure.spec.alpha/map-of :portkey.aws.config/name :portkey.aws.config/value))

(clojure.spec.alpha/def :portkey.aws.config.get-aggregate-config-rule-compliance-summary-response/group-by-key (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.get-aggregate-config-rule-compliance-summary-response/aggregate-compliance-counts (clojure.spec.alpha/and :portkey.aws.config/aggregate-compliance-count-list))
(clojure.spec.alpha/def :portkey.aws.config/get-aggregate-config-rule-compliance-summary-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.get-aggregate-config-rule-compliance-summary-response/group-by-key :portkey.aws.config.get-aggregate-config-rule-compliance-summary-response/aggregate-compliance-counts :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/all-supported clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.config/configuration-aggregator-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\w\-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.config/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.list-discovered-resources-request/resource-type (clojure.spec.alpha/and :portkey.aws.config/resource-type))
(clojure.spec.alpha/def :portkey.aws.config.list-discovered-resources-request/resource-ids (clojure.spec.alpha/and :portkey.aws.config/resource-id-list))
(clojure.spec.alpha/def :portkey.aws.config.list-discovered-resources-request/resource-name (clojure.spec.alpha/and :portkey.aws.config/resource-name))
(clojure.spec.alpha/def :portkey.aws.config.list-discovered-resources-request/limit (clojure.spec.alpha/and :portkey.aws.config/limit))
(clojure.spec.alpha/def :portkey.aws.config.list-discovered-resources-request/include-deleted-resources (clojure.spec.alpha/and :portkey.aws.config/boolean))
(clojure.spec.alpha/def :portkey.aws.config.list-discovered-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.config/next-token))
(clojure.spec.alpha/def :portkey.aws.config/list-discovered-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.list-discovered-resources-request/resource-type] :opt-un [:portkey.aws.config.list-discovered-resources-request/resource-ids :portkey.aws.config.list-discovered-resources-request/resource-name :portkey.aws.config.list-discovered-resources-request/limit :portkey.aws.config.list-discovered-resources-request/include-deleted-resources :portkey.aws.config.list-discovered-resources-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-recorder-status-request/configuration-recorder-names (clojure.spec.alpha/and :portkey.aws.config/configuration-recorder-name-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-configuration-recorder-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-configuration-recorder-status-request/configuration-recorder-names]))

(clojure.spec.alpha/def :portkey.aws.config/source-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/event-source :portkey.aws.config/message-type :portkey.aws.config/maximum-execution-frequency]))

(clojure.spec.alpha/def :portkey.aws.config/configuration-item-md-5-hash (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/source-details (clojure.spec.alpha/coll-of :portkey.aws.config/source-detail :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.config/reevaluate-config-rule-names (clojure.spec.alpha/coll-of :portkey.aws.config/string-with-char-limit-64 :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.config/chronological-order #{:forward "Forward" "Reverse" :reverse})

(clojure.spec.alpha/def :portkey.aws.config.put-evaluations-request/result-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.put-evaluations-request/test-mode (clojure.spec.alpha/and :portkey.aws.config/boolean))
(clojure.spec.alpha/def :portkey.aws.config/put-evaluations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.put-evaluations-request/result-token] :opt-un [:portkey.aws.config/evaluations :portkey.aws.config.put-evaluations-request/test-mode]))

(clojure.spec.alpha/def :portkey.aws.config.delete-config-rule-request/config-rule-name (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-64))
(clojure.spec.alpha/def :portkey.aws.config/delete-config-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.delete-config-rule-request/config-rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/insufficient-delivery-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/max-number-of-configuration-recorders-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/limit (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.config/no-such-configuration-recorder-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.describe-pending-aggregation-requests-request/limit (clojure.spec.alpha/and :portkey.aws.config/describe-pending-aggregation-requests-limit))
(clojure.spec.alpha/def :portkey.aws.config.describe-pending-aggregation-requests-request/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-pending-aggregation-requests-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-pending-aggregation-requests-request/limit :portkey.aws.config.describe-pending-aggregation-requests-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/last-delivery-channel-delete-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/compliance-types (clojure.spec.alpha/coll-of :portkey.aws.config/compliance-type :min-count 0 :max-count 3))

(clojure.spec.alpha/def :portkey.aws.config/aggregate-evaluation-result-list (clojure.spec.alpha/coll-of :portkey.aws.config/aggregate-evaluation-result))

(clojure.spec.alpha/def :portkey.aws.config/availability-zone (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/configuration-state-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/related-event-list (clojure.spec.alpha/coll-of :portkey.aws.config/related-event))

(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder/name (clojure.spec.alpha/and :portkey.aws.config/recorder-name))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder/role-arn (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder/recording-group (clojure.spec.alpha/and :portkey.aws.config/recording-group))
(clojure.spec.alpha/def :portkey.aws.config/configuration-recorder (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.configuration-recorder/name :portkey.aws.config.configuration-recorder/role-arn :portkey.aws.config.configuration-recorder/recording-group]))

(clojure.spec.alpha/def :portkey.aws.config/retention-configuration-name-list (clojure.spec.alpha/coll-of :portkey.aws.config/retention-configuration-name :min-count 0 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.config/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-recorders-response/configuration-recorders (clojure.spec.alpha/and :portkey.aws.config/configuration-recorder-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-configuration-recorders-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-configuration-recorders-response/configuration-recorders]))

(clojure.spec.alpha/def :portkey.aws.config/delivery-channel-status-list (clojure.spec.alpha/coll-of :portkey.aws.config/delivery-channel-status))

(clojure.spec.alpha/def :portkey.aws.config/evaluation-results (clojure.spec.alpha/coll-of :portkey.aws.config/evaluation-result))

(clojure.spec.alpha/def :portkey.aws.config.aggregated-source-status/source-id (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.aggregated-source-status/source-type (clojure.spec.alpha/and :portkey.aws.config/aggregated-source-type))
(clojure.spec.alpha/def :portkey.aws.config.aggregated-source-status/last-update-status (clojure.spec.alpha/and :portkey.aws.config/aggregated-source-status-type))
(clojure.spec.alpha/def :portkey.aws.config.aggregated-source-status/last-update-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.aggregated-source-status/last-error-code (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.aggregated-source-status/last-error-message (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/aggregated-source-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.aggregated-source-status/source-id :portkey.aws.config.aggregated-source-status/source-type :portkey.aws.config/aws-region :portkey.aws.config.aggregated-source-status/last-update-status :portkey.aws.config.aggregated-source-status/last-update-time :portkey.aws.config.aggregated-source-status/last-error-code :portkey.aws.config.aggregated-source-status/last-error-message]))

(clojure.spec.alpha/def :portkey.aws.config/recorder-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.config/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.config.retention-configuration/name (clojure.spec.alpha/and :portkey.aws.config/retention-configuration-name))
(clojure.spec.alpha/def :portkey.aws.config/retention-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.config.retention-configuration/name :portkey.aws.config/retention-period-in-days] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/config-rule-state #{"DELETING_RESULTS" "EVALUATING" :deleting :deleting-results :active "DELETING" "ACTIVE" :evaluating})

(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/resource-name (clojure.spec.alpha/and :portkey.aws.config/resource-name))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/account-id (clojure.spec.alpha/and :portkey.aws.config/account-id))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/supplementary-configuration (clojure.spec.alpha/and :portkey.aws.config/supplementary-configuration))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/resource-id (clojure.spec.alpha/and :portkey.aws.config/resource-id))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/arn (clojure.spec.alpha/and :portkey.aws.config/arn))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/configuration-state-id (clojure.spec.alpha/and :portkey.aws.config/configuration-state-id))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/configuration (clojure.spec.alpha/and :portkey.aws.config/configuration))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/resource-creation-time (clojure.spec.alpha/and :portkey.aws.config/resource-creation-time))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/configuration-item-capture-time (clojure.spec.alpha/and :portkey.aws.config/configuration-item-capture-time))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/availability-zone (clojure.spec.alpha/and :portkey.aws.config/availability-zone))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/aws-region (clojure.spec.alpha/and :portkey.aws.config/aws-region))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/version (clojure.spec.alpha/and :portkey.aws.config/version))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/configuration-item-status (clojure.spec.alpha/and :portkey.aws.config/configuration-item-status))
(clojure.spec.alpha/def :portkey.aws.config.base-configuration-item/resource-type (clojure.spec.alpha/and :portkey.aws.config/resource-type))
(clojure.spec.alpha/def :portkey.aws.config/base-configuration-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.base-configuration-item/resource-name :portkey.aws.config.base-configuration-item/account-id :portkey.aws.config.base-configuration-item/supplementary-configuration :portkey.aws.config.base-configuration-item/resource-id :portkey.aws.config.base-configuration-item/arn :portkey.aws.config.base-configuration-item/configuration-state-id :portkey.aws.config.base-configuration-item/configuration :portkey.aws.config.base-configuration-item/resource-creation-time :portkey.aws.config.base-configuration-item/configuration-item-capture-time :portkey.aws.config.base-configuration-item/availability-zone :portkey.aws.config.base-configuration-item/aws-region :portkey.aws.config.base-configuration-item/version :portkey.aws.config.base-configuration-item/configuration-item-status :portkey.aws.config.base-configuration-item/resource-type]))

(clojure.spec.alpha/def :portkey.aws.config.evaluation-result/result-recorded-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.evaluation-result/config-rule-invoked-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.evaluation-result/annotation (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.evaluation-result/result-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/evaluation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/evaluation-result-identifier :portkey.aws.config/compliance-type :portkey.aws.config.evaluation-result/result-recorded-time :portkey.aws.config.evaluation-result/config-rule-invoked-time :portkey.aws.config.evaluation-result/annotation :portkey.aws.config.evaluation-result/result-token]))

(clojure.spec.alpha/def :portkey.aws.config.describe-compliance-by-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.describe-compliance-by-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.config/base-resource-id))
(clojure.spec.alpha/def :portkey.aws.config/describe-compliance-by-resource-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-compliance-by-resource-request/resource-type :portkey.aws.config.describe-compliance-by-resource-request/resource-id :portkey.aws.config/compliance-types :portkey.aws.config/limit :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 768))))

(clojure.spec.alpha/def :portkey.aws.config/compliance-summaries-by-resource-type (clojure.spec.alpha/coll-of :portkey.aws.config/compliance-summary-by-resource-type))

(clojure.spec.alpha/def :portkey.aws.config/configuration-aggregator-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:config:[a-z\-\d]+:\d+:config-aggregator/config-aggregator-[a-z\d]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.config/invalid-result-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/put-delivery-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/delivery-channel] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/base-configuration-items (clojure.spec.alpha/coll-of :portkey.aws.config/base-configuration-item))

(clojure.spec.alpha/def :portkey.aws.config/configuration-recorder-name-list (clojure.spec.alpha/coll-of :portkey.aws.config/recorder-name))

(clojure.spec.alpha/def :portkey.aws.config/configuration-recorder-list (clojure.spec.alpha/coll-of :portkey.aws.config/configuration-recorder))

(clojure.spec.alpha/def :portkey.aws.config/aggregation-authorization-list (clojure.spec.alpha/coll-of :portkey.aws.config/aggregation-authorization))

(clojure.spec.alpha/def :portkey.aws.config/put-retention-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/retention-configuration]))

(clojure.spec.alpha/def :portkey.aws.config.delivery-channel-status/name (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.delivery-channel-status/config-snapshot-delivery-info (clojure.spec.alpha/and :portkey.aws.config/config-export-delivery-info))
(clojure.spec.alpha/def :portkey.aws.config.delivery-channel-status/config-history-delivery-info (clojure.spec.alpha/and :portkey.aws.config/config-export-delivery-info))
(clojure.spec.alpha/def :portkey.aws.config.delivery-channel-status/config-stream-delivery-info (clojure.spec.alpha/and :portkey.aws.config/config-stream-delivery-info))
(clojure.spec.alpha/def :portkey.aws.config/delivery-channel-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.delivery-channel-status/name :portkey.aws.config.delivery-channel-status/config-snapshot-delivery-info :portkey.aws.config.delivery-channel-status/config-history-delivery-info :portkey.aws.config.delivery-channel-status/config-stream-delivery-info]))

(clojure.spec.alpha/def :portkey.aws.config/put-configuration-recorder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/configuration-recorder] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.put-aggregation-authorization-request/authorized-account-id (clojure.spec.alpha/and :portkey.aws.config/account-id))
(clojure.spec.alpha/def :portkey.aws.config.put-aggregation-authorization-request/authorized-aws-region (clojure.spec.alpha/and :portkey.aws.config/aws-region))
(clojure.spec.alpha/def :portkey.aws.config/put-aggregation-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.put-aggregation-authorization-request/authorized-account-id :portkey.aws.config.put-aggregation-authorization-request/authorized-aws-region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.get-compliance-details-by-config-rule-request/config-rule-name (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-64))
(clojure.spec.alpha/def :portkey.aws.config/get-compliance-details-by-config-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.get-compliance-details-by-config-rule-request/config-rule-name] :opt-un [:portkey.aws.config/compliance-types :portkey.aws.config/limit :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/string-with-char-limit-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.config/invalid-sns-topic-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/resource-type-list (clojure.spec.alpha/coll-of :portkey.aws.config/resource-type))

(clojure.spec.alpha/def :portkey.aws.config/config-rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.config.describe-aggregate-compliance-by-config-rules-request/filters (clojure.spec.alpha/and :portkey.aws.config/config-rule-compliance-filters))
(clojure.spec.alpha/def :portkey.aws.config.describe-aggregate-compliance-by-config-rules-request/limit (clojure.spec.alpha/and :portkey.aws.config/group-by-api-limit))
(clojure.spec.alpha/def :portkey.aws.config/describe-aggregate-compliance-by-config-rules-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/configuration-aggregator-name] :opt-un [:portkey.aws.config.describe-aggregate-compliance-by-config-rules-request/filters :portkey.aws.config.describe-aggregate-compliance-by-config-rules-request/limit :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-recorder-status-response/configuration-recorders-status (clojure.spec.alpha/and :portkey.aws.config/configuration-recorder-status-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-configuration-recorder-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-configuration-recorder-status-response/configuration-recorders-status]))

(clojure.spec.alpha/def :portkey.aws.config.get-discovered-resource-counts-response/total-discovered-resources (clojure.spec.alpha/and :portkey.aws.config/long))
(clojure.spec.alpha/def :portkey.aws.config.get-discovered-resource-counts-response/resource-counts (clojure.spec.alpha/and :portkey.aws.config/resource-counts))
(clojure.spec.alpha/def :portkey.aws.config.get-discovered-resource-counts-response/next-token (clojure.spec.alpha/and :portkey.aws.config/next-token))
(clojure.spec.alpha/def :portkey.aws.config/get-discovered-resource-counts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.get-discovered-resource-counts-response/total-discovered-resources :portkey.aws.config.get-discovered-resource-counts-response/resource-counts :portkey.aws.config.get-discovered-resource-counts-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/string-with-char-limit-128 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.config/no-available-delivery-channel-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/configuration-item-list (clojure.spec.alpha/coll-of :portkey.aws.config/configuration-item))

(clojure.spec.alpha/def :portkey.aws.config/channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.config/later-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.config.put-evaluations-response/failed-evaluations (clojure.spec.alpha/and :portkey.aws.config/evaluations))
(clojure.spec.alpha/def :portkey.aws.config/put-evaluations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.put-evaluations-response/failed-evaluations]))

(clojure.spec.alpha/def :portkey.aws.config.aggregate-evaluation-result/result-recorded-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.aggregate-evaluation-result/config-rule-invoked-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.aggregate-evaluation-result/annotation (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config/aggregate-evaluation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/evaluation-result-identifier :portkey.aws.config/compliance-type :portkey.aws.config.aggregate-evaluation-result/result-recorded-time :portkey.aws.config.aggregate-evaluation-result/config-rule-invoked-time :portkey.aws.config.aggregate-evaluation-result/annotation :portkey.aws.config/account-id :portkey.aws.config/aws-region]))

(clojure.spec.alpha/def :portkey.aws.config/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/evaluations (clojure.spec.alpha/coll-of :portkey.aws.config/evaluation :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/first-evaluation-started (clojure.spec.alpha/and :portkey.aws.config/boolean))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/last-successful-invocation-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/config-rule-id (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/config-rule-arn (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/last-error-message (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/first-activated-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/last-successful-evaluation-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/last-failed-evaluation-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/config-rule-name (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-64))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/last-failed-invocation-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.config-rule-evaluation-status/last-error-code (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/config-rule-evaluation-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.config-rule-evaluation-status/first-evaluation-started :portkey.aws.config.config-rule-evaluation-status/last-successful-invocation-time :portkey.aws.config.config-rule-evaluation-status/config-rule-id :portkey.aws.config.config-rule-evaluation-status/config-rule-arn :portkey.aws.config.config-rule-evaluation-status/last-error-message :portkey.aws.config.config-rule-evaluation-status/first-activated-time :portkey.aws.config.config-rule-evaluation-status/last-successful-evaluation-time :portkey.aws.config.config-rule-evaluation-status/last-failed-evaluation-time :portkey.aws.config.config-rule-evaluation-status/config-rule-name :portkey.aws.config.config-rule-evaluation-status/last-failed-invocation-time :portkey.aws.config.config-rule-evaluation-status/last-error-code]))

(clojure.spec.alpha/def :portkey.aws.config.compliance-contributor-count/capped-count (clojure.spec.alpha/and :portkey.aws.config/integer))
(clojure.spec.alpha/def :portkey.aws.config.compliance-contributor-count/cap-exceeded (clojure.spec.alpha/and :portkey.aws.config/boolean))
(clojure.spec.alpha/def :portkey.aws.config/compliance-contributor-count (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.compliance-contributor-count/capped-count :portkey.aws.config.compliance-contributor-count/cap-exceeded]))

(clojure.spec.alpha/def :portkey.aws.config.describe-compliance-by-config-rule-response/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-compliance-by-config-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/compliance-by-config-rules :portkey.aws.config.describe-compliance-by-config-rule-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/retention-configuration-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\w\-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.config/recorder-status #{:failure :pending "Success" "Failure" :success "Pending"})

(clojure.spec.alpha/def :portkey.aws.config/put-retention-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/retention-period-in-days] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/invalid-s-3-key-prefix-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.get-compliance-details-by-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.get-compliance-details-by-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.config/base-resource-id))
(clojure.spec.alpha/def :portkey.aws.config.get-compliance-details-by-resource-request/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/get-compliance-details-by-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.get-compliance-details-by-resource-request/resource-type :portkey.aws.config.get-compliance-details-by-resource-request/resource-id] :opt-un [:portkey.aws.config/compliance-types :portkey.aws.config.get-compliance-details-by-resource-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.describe-aggregation-authorizations-response/aggregation-authorizations (clojure.spec.alpha/and :portkey.aws.config/aggregation-authorization-list))
(clojure.spec.alpha/def :portkey.aws.config.describe-aggregation-authorizations-response/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-aggregation-authorizations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-aggregation-authorizations-response/aggregation-authorizations :portkey.aws.config.describe-aggregation-authorizations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/describe-compliance-by-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/compliance-by-resources :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/start-config-rules-evaluation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.describe-config-rule-evaluation-status-request/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.describe-config-rule-evaluation-status-request/limit (clojure.spec.alpha/and :portkey.aws.config/rule-limit))
(clojure.spec.alpha/def :portkey.aws.config/describe-config-rule-evaluation-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/config-rule-names :portkey.aws.config.describe-config-rule-evaluation-status-request/next-token :portkey.aws.config.describe-config-rule-evaluation-status-request/limit]))

(clojure.spec.alpha/def :portkey.aws.config.describe-config-rules-response/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-config-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/config-rules :portkey.aws.config.describe-config-rules-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.delete-evaluation-results-request/config-rule-name (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-64))
(clojure.spec.alpha/def :portkey.aws.config/delete-evaluation-results-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.delete-evaluation-results-request/config-rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/get-compliance-summary-by-config-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/compliance-summary]))

(clojure.spec.alpha/def :portkey.aws.config/string-with-char-limit-256 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.config/resource-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/include-global-resource-types clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.config/aggregated-source-status-type-list (clojure.spec.alpha/coll-of :portkey.aws.config/aggregated-source-status-type :min-count 1))

(clojure.spec.alpha/def :portkey.aws.config/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.config/config-rule-names (clojure.spec.alpha/coll-of :portkey.aws.config/string-with-char-limit-64 :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.config/base-resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 768))))

(clojure.spec.alpha/def :portkey.aws.config.put-configuration-aggregator-request/account-aggregation-sources (clojure.spec.alpha/and :portkey.aws.config/account-aggregation-source-list))
(clojure.spec.alpha/def :portkey.aws.config/put-configuration-aggregator-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/configuration-aggregator-name] :opt-un [:portkey.aws.config.put-configuration-aggregator-request/account-aggregation-sources :portkey.aws.config/organization-aggregation-source]))

(clojure.spec.alpha/def :portkey.aws.config/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/config-rule-compliance-filters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/config-rule-name :portkey.aws.config/compliance-type :portkey.aws.config/account-id :portkey.aws.config/aws-region]))

(clojure.spec.alpha/def :portkey.aws.config/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"\d{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.config.describe-config-rule-evaluation-status-response/config-rules-evaluation-status (clojure.spec.alpha/and :portkey.aws.config/config-rule-evaluation-status-list))
(clojure.spec.alpha/def :portkey.aws.config.describe-config-rule-evaluation-status-response/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-config-rule-evaluation-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-config-rule-evaluation-status-response/config-rules-evaluation-status :portkey.aws.config.describe-config-rule-evaluation-status-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-aggregators-response/configuration-aggregators (clojure.spec.alpha/and :portkey.aws.config/configuration-aggregator-list))
(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-aggregators-response/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-configuration-aggregators-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-configuration-aggregators-response/configuration-aggregators :portkey.aws.config.describe-configuration-aggregators-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/configuration-item-capture-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.config/organization-all-features-not-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.configuration-aggregator/account-aggregation-sources (clojure.spec.alpha/and :portkey.aws.config/account-aggregation-source-list))
(clojure.spec.alpha/def :portkey.aws.config.configuration-aggregator/creation-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.configuration-aggregator/last-updated-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config/configuration-aggregator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/configuration-aggregator-name :portkey.aws.config/configuration-aggregator-arn :portkey.aws.config.configuration-aggregator/account-aggregation-sources :portkey.aws.config/organization-aggregation-source :portkey.aws.config.configuration-aggregator/creation-time :portkey.aws.config.configuration-aggregator/last-updated-time]))

(clojure.spec.alpha/def :portkey.aws.config/resource-type #{:awswaf-regional-rate-based-rule "AWS::ElasticBeanstalk::Application" :aws-auto-scaling-scheduled-action "AWS::ElasticLoadBalancing::LoadBalancer" :aws-cloud-front-streaming-distribution "AWS::CloudFront::Distribution" "AWS::WAFRegional::RuleGroup" :awss-3-bucket "AWS::IAM::User" :aws-redshift-event-subscription "AWS::CloudTrail::Trail" "AWS::RDS::EventSubscription" "AWS::RDS::DBInstance" :aws-redshift-cluster-security-group "AWS::Redshift::EventSubscription" "AWS::IAM::Group" :aws-elastic-beanstalk-application :aws-redshift-cluster :aws-elastic-beanstalk-application-version "AWS::AutoScaling::ScheduledAction" :awsssm-managed-instance-inventory "AWS::WAF::WebACL" :awsec-2-internet-gateway "AWS::EC2::RouteTable" "AWS::RDS::DBSecurityGroup" :awsx-ray-encryption-config "AWS::XRay::EncryptionConfig" :awsec-2-route-table :aws-auto-scaling-scaling-policy "AWS::EC2::NetworkAcl" "AWS::IAM::Policy" :awsec-2-customer-gateway "AWS::CloudFront::StreamingDistribution" "AWS::AutoScaling::LaunchConfiguration" :awsec-2-vpn-connection :awswaf-regional-rule "AWS::ElasticLoadBalancingV2::LoadBalancer" "AWS::EC2::VPNGateway" "AWS::RDS::DBSubnetGroup" "AWS::Redshift::ClusterSubnetGroup" :awswaf-regional-rule-group "AWS::EC2::SecurityGroup" :awsec-2-eip :aws-code-build-project :awsiam-group "AWS::Lambda::Function" "AWS::Redshift::ClusterSnapshot" "AWS::EC2::VPC" :awsec-2-security-group "AWS::IAM::Role" "AWS::EC2::InternetGateway" :aws-redshift-cluster-snapshot "AWS::AutoScaling::ScalingPolicy" :aws-dynamo-db-table "AWS::EC2::CustomerGateway" "AWS::WAF::Rule" "AWS::EC2::Subnet" :aws-cloud-formation-stack :aws-redshift-cluster-subnet-group :aws-lambda-function :awswaf-rule :aws-auto-scaling-auto-scaling-group :aws-cloud-trail-trail :aws-elastic-load-balancing-load-balancer "AWS::CloudWatch::Alarm" "AWS::EC2::VPNConnection" :awsec-2-volume "AWS::ElasticBeanstalk::Environment" "AWS::S3::Bucket" "AWS::Redshift::ClusterSecurityGroup" :aws-cloud-watch-alarm "AWS::EC2::Instance" :awsec-2-host :awswaf-rate-based-rule :aws-elastic-beanstalk-environment :awswaf-rule-group :aws-cloud-front-distribution :awsrdsdb-instance "AWS::EC2::NetworkInterface" :awsec-2-network-acl :awswaf-web-acl :aws-auto-scaling-launch-configuration "AWS::SSM::ManagedInstanceInventory" :awsrdsdb-snapshot "AWS::ACM::Certificate" "AWS::EC2::Host" :awsec-2-vpc "AWS::WAF::RateBasedRule" "AWS::WAFRegional::RateBasedRule" "AWS::CodeBuild::Project" "AWS::AutoScaling::AutoScalingGroup" :awsec-2-subnet "AWS::CloudFormation::Stack" :aws-redshift-cluster-parameter-group :awsrdsdb-security-group "AWS::EC2::Volume" "AWS::Redshift::Cluster" "AWS::RDS::DBSnapshot" :aws-elastic-load-balancing-v-2-load-balancer :awsiam-user "AWS::WAFRegional::Rule" "AWS::EC2::EIP" "AWS::DynamoDB::Table" "AWS::WAFRegional::WebACL" "AWS::Redshift::ClusterParameterGroup" :awsrdsdb-subnet-group :awswaf-regional-web-acl :awsiam-role :awsec-2-vpn-gateway "AWS::ElasticBeanstalk::ApplicationVersion" :awsiam-policy :awsacm-certificate "AWS::WAF::RuleGroup" :awsec-2-instance :awsrds-event-subscription :awsec-2-network-interface})

(clojure.spec.alpha/def :portkey.aws.config/config-rule-compliance-summary-filters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/account-id :portkey.aws.config/aws-region]))

(clojure.spec.alpha/def :portkey.aws.config.pending-aggregation-request/requester-account-id (clojure.spec.alpha/and :portkey.aws.config/account-id))
(clojure.spec.alpha/def :portkey.aws.config.pending-aggregation-request/requester-aws-region (clojure.spec.alpha/and :portkey.aws.config/aws-region))
(clojure.spec.alpha/def :portkey.aws.config/pending-aggregation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.pending-aggregation-request/requester-account-id :portkey.aws.config.pending-aggregation-request/requester-aws-region]))

(clojure.spec.alpha/def :portkey.aws.config/related-event (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config.resource-identifier/resource-type (clojure.spec.alpha/and :portkey.aws.config/resource-type))
(clojure.spec.alpha/def :portkey.aws.config.resource-identifier/resource-id (clojure.spec.alpha/and :portkey.aws.config/resource-id))
(clojure.spec.alpha/def :portkey.aws.config.resource-identifier/resource-name (clojure.spec.alpha/and :portkey.aws.config/resource-name))
(clojure.spec.alpha/def :portkey.aws.config.resource-identifier/resource-deletion-time (clojure.spec.alpha/and :portkey.aws.config/resource-deletion-time))
(clojure.spec.alpha/def :portkey.aws.config/resource-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.resource-identifier/resource-type :portkey.aws.config.resource-identifier/resource-id :portkey.aws.config.resource-identifier/resource-name :portkey.aws.config.resource-identifier/resource-deletion-time]))

(clojure.spec.alpha/def :portkey.aws.config.organization-aggregation-source/role-arn (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.organization-aggregation-source/aws-regions (clojure.spec.alpha/and :portkey.aws.config/aggregator-region-list))
(clojure.spec.alpha/def :portkey.aws.config.organization-aggregation-source/all-aws-regions (clojure.spec.alpha/and :portkey.aws.config/boolean))
(clojure.spec.alpha/def :portkey.aws.config/organization-aggregation-source (clojure.spec.alpha/keys :req-un [:portkey.aws.config.organization-aggregation-source/role-arn] :opt-un [:portkey.aws.config.organization-aggregation-source/aws-regions :portkey.aws.config.organization-aggregation-source/all-aws-regions]))

(clojure.spec.alpha/def :portkey.aws.config/compliance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/compliance-type :portkey.aws.config/compliance-contributor-count]))

(clojure.spec.alpha/def :portkey.aws.config.resource-count/resource-type (clojure.spec.alpha/and :portkey.aws.config/resource-type))
(clojure.spec.alpha/def :portkey.aws.config.resource-count/count (clojure.spec.alpha/and :portkey.aws.config/long))
(clojure.spec.alpha/def :portkey.aws.config/resource-count (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.resource-count/resource-type :portkey.aws.config.resource-count/count]))

(clojure.spec.alpha/def :portkey.aws.config/aggregated-source-status-list (clojure.spec.alpha/coll-of :portkey.aws.config/aggregated-source-status))

(clojure.spec.alpha/def :portkey.aws.config/resource-deletion-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.config.deliver-config-snapshot-request/delivery-channel-name (clojure.spec.alpha/and :portkey.aws.config/channel-name))
(clojure.spec.alpha/def :portkey.aws.config/deliver-config-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.deliver-config-snapshot-request/delivery-channel-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/describe-pending-aggregation-requests-limit (clojure.spec.alpha/int-in 0 20))

(clojure.spec.alpha/def :portkey.aws.config/aggregate-compliance-count-list (clojure.spec.alpha/coll-of :portkey.aws.config/aggregate-compliance-count))

(clojure.spec.alpha/def :portkey.aws.config.deliver-config-snapshot-response/config-snapshot-id (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/deliver-config-snapshot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.deliver-config-snapshot-response/config-snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-recorders-request/configuration-recorder-names (clojure.spec.alpha/and :portkey.aws.config/configuration-recorder-name-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-configuration-recorders-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-configuration-recorders-request/configuration-recorder-names]))

(clojure.spec.alpha/def :portkey.aws.config.config-stream-delivery-info/last-status (clojure.spec.alpha/and :portkey.aws.config/delivery-status))
(clojure.spec.alpha/def :portkey.aws.config.config-stream-delivery-info/last-error-code (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-stream-delivery-info/last-error-message (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-stream-delivery-info/last-status-change-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config/config-stream-delivery-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.config-stream-delivery-info/last-status :portkey.aws.config.config-stream-delivery-info/last-error-code :portkey.aws.config.config-stream-delivery-info/last-error-message :portkey.aws.config.config-stream-delivery-info/last-status-change-time]))

(clojure.spec.alpha/def :portkey.aws.config/message-type #{:configuration-snapshot-delivery-completed :oversized-configuration-item-change-notification "OversizedConfigurationItemChangeNotification" "ScheduledNotification" :scheduled-notification :configuration-item-change-notification "ConfigurationItemChangeNotification" "ConfigurationSnapshotDeliveryCompleted"})

(clojure.spec.alpha/def :portkey.aws.config/maximum-execution-frequency #{"Twelve_Hours" "One_Hour" :six-hours "TwentyFour_Hours" "Three_Hours" :three-hours :twenty-four-hours :twelve-hours "Six_Hours" :one-hour})

(clojure.spec.alpha/def :portkey.aws.config/owner #{:aws "AWS" :custom-lambda "CUSTOM_LAMBDA"})

(clojure.spec.alpha/def :portkey.aws.config/no-available-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.evaluation-result-qualifier/config-rule-name (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-64))
(clojure.spec.alpha/def :portkey.aws.config.evaluation-result-qualifier/resource-type (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.evaluation-result-qualifier/resource-id (clojure.spec.alpha/and :portkey.aws.config/base-resource-id))
(clojure.spec.alpha/def :portkey.aws.config/evaluation-result-qualifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.evaluation-result-qualifier/config-rule-name :portkey.aws.config.evaluation-result-qualifier/resource-type :portkey.aws.config.evaluation-result-qualifier/resource-id]))

(clojure.spec.alpha/def :portkey.aws.config.compliance-summary/compliant-resource-count (clojure.spec.alpha/and :portkey.aws.config/compliance-contributor-count))
(clojure.spec.alpha/def :portkey.aws.config.compliance-summary/non-compliant-resource-count (clojure.spec.alpha/and :portkey.aws.config/compliance-contributor-count))
(clojure.spec.alpha/def :portkey.aws.config.compliance-summary/compliance-summary-timestamp (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config/compliance-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.compliance-summary/compliant-resource-count :portkey.aws.config.compliance-summary/non-compliant-resource-count :portkey.aws.config.compliance-summary/compliance-summary-timestamp]))

(clojure.spec.alpha/def :portkey.aws.config/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.config.recording-group/all-supported (clojure.spec.alpha/and :portkey.aws.config/all-supported))
(clojure.spec.alpha/def :portkey.aws.config.recording-group/include-global-resource-types (clojure.spec.alpha/and :portkey.aws.config/include-global-resource-types))
(clojure.spec.alpha/def :portkey.aws.config.recording-group/resource-types (clojure.spec.alpha/and :portkey.aws.config/resource-type-list))
(clojure.spec.alpha/def :portkey.aws.config/recording-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.recording-group/all-supported :portkey.aws.config.recording-group/include-global-resource-types :portkey.aws.config.recording-group/resource-types]))

(clojure.spec.alpha/def :portkey.aws.config/aggregate-compliance-by-config-rule-list (clojure.spec.alpha/coll-of :portkey.aws.config/aggregate-compliance-by-config-rule))

(clojure.spec.alpha/def :portkey.aws.config/insufficient-permissions-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.compliance-summary-by-resource-type/resource-type (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config/compliance-summary-by-resource-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.compliance-summary-by-resource-type/resource-type :portkey.aws.config/compliance-summary]))

(clojure.spec.alpha/def :portkey.aws.config/compliance-type #{"NON_COMPLIANT" "COMPLIANT" :insufficient-data :not-applicable :compliant :non-compliant "NOT_APPLICABLE" "INSUFFICIENT_DATA"})

(clojure.spec.alpha/def :portkey.aws.config.stop-configuration-recorder-request/configuration-recorder-name (clojure.spec.alpha/and :portkey.aws.config/recorder-name))
(clojure.spec.alpha/def :portkey.aws.config/stop-configuration-recorder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.stop-configuration-recorder-request/configuration-recorder-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.describe-aggregate-compliance-by-config-rules-response/aggregate-compliance-by-config-rules (clojure.spec.alpha/and :portkey.aws.config/aggregate-compliance-by-config-rule-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-aggregate-compliance-by-config-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-aggregate-compliance-by-config-rules-response/aggregate-compliance-by-config-rules :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/get-compliance-details-by-config-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/evaluation-results :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/get-compliance-summary-by-resource-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/compliance-summaries-by-resource-type]))

(clojure.spec.alpha/def :portkey.aws.config/no-running-configuration-recorder-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config.aggregate-compliance-count/group-name (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config/aggregate-compliance-count (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.aggregate-compliance-count/group-name :portkey.aws.config/compliance-summary]))

(clojure.spec.alpha/def :portkey.aws.config/resource-types (clojure.spec.alpha/coll-of :portkey.aws.config/string-with-char-limit-256 :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.config.describe-delivery-channel-status-response/delivery-channels-status (clojure.spec.alpha/and :portkey.aws.config/delivery-channel-status-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-delivery-channel-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-delivery-channel-status-response/delivery-channels-status]))

(clojure.spec.alpha/def :portkey.aws.config.compliance-by-config-rule/config-rule-name (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-64))
(clojure.spec.alpha/def :portkey.aws.config/compliance-by-config-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.compliance-by-config-rule/config-rule-name :portkey.aws.config/compliance]))

(clojure.spec.alpha/def :portkey.aws.config/aggregator-region-list (clojure.spec.alpha/coll-of :portkey.aws.config/string :min-count 1))

(clojure.spec.alpha/def :portkey.aws.config.batch-get-resource-config-request/resource-keys (clojure.spec.alpha/and :portkey.aws.config/resource-keys))
(clojure.spec.alpha/def :portkey.aws.config/batch-get-resource-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.batch-get-resource-config-request/resource-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/get-aggregate-compliance-details-by-config-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/configuration-aggregator-name :portkey.aws.config/config-rule-name :portkey.aws.config/account-id :portkey.aws.config/aws-region] :opt-un [:portkey.aws.config/compliance-type :portkey.aws.config/limit :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/rule-limit (clojure.spec.alpha/int-in 0 50))

(clojure.spec.alpha/def :portkey.aws.config.describe-delivery-channels-request/delivery-channel-names (clojure.spec.alpha/and :portkey.aws.config/delivery-channel-name-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-delivery-channels-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-delivery-channels-request/delivery-channel-names]))

(clojure.spec.alpha/def :portkey.aws.config/no-such-delivery-channel-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/ordering-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.config/pending-aggregation-request-list (clojure.spec.alpha/coll-of :portkey.aws.config/pending-aggregation-request))

(clojure.spec.alpha/def :portkey.aws.config/no-such-bucket-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/resource-id-list (clojure.spec.alpha/coll-of :portkey.aws.config/resource-id))

(clojure.spec.alpha/def :portkey.aws.config/retention-period-in-days (clojure.spec.alpha/int-in 30 2557))

(clojure.spec.alpha/def :portkey.aws.config/put-aggregation-authorization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/aggregation-authorization]))

(clojure.spec.alpha/def :portkey.aws.config/event-source #{:awsconfig "aws.config"})

(clojure.spec.alpha/def :portkey.aws.config/resource-not-discovered-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/aggregated-source-status-type #{:outdated "OUTDATED" "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.config.describe-configuration-aggregator-sources-status-response/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/describe-configuration-aggregator-sources-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/aggregated-source-status-list :portkey.aws.config.describe-configuration-aggregator-sources-status-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/account-aggregation-source-list (clojure.spec.alpha/coll-of :portkey.aws.config/account-aggregation-source :min-count 0 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.config/config-rules (clojure.spec.alpha/coll-of :portkey.aws.config/config-rule))

(clojure.spec.alpha/def :portkey.aws.config/compliance-resource-types (clojure.spec.alpha/coll-of :portkey.aws.config/string-with-char-limit-256 :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.config/invalid-limit-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.compliance-by-resource/resource-type (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.compliance-by-resource/resource-id (clojure.spec.alpha/and :portkey.aws.config/base-resource-id))
(clojure.spec.alpha/def :portkey.aws.config/compliance-by-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.compliance-by-resource/resource-type :portkey.aws.config.compliance-by-resource/resource-id :portkey.aws.config/compliance]))

(clojure.spec.alpha/def :portkey.aws.config/delete-retention-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/retention-configuration-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/aws-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.config.start-config-rules-evaluation-request/config-rule-names (clojure.spec.alpha/and :portkey.aws.config/reevaluate-config-rule-names))
(clojure.spec.alpha/def :portkey.aws.config/start-config-rules-evaluation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.start-config-rules-evaluation-request/config-rule-names]))

(clojure.spec.alpha/def :portkey.aws.config/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.get-discovered-resource-counts-request/resource-types (clojure.spec.alpha/and :portkey.aws.config/resource-types))
(clojure.spec.alpha/def :portkey.aws.config.get-discovered-resource-counts-request/limit (clojure.spec.alpha/and :portkey.aws.config/limit))
(clojure.spec.alpha/def :portkey.aws.config.get-discovered-resource-counts-request/next-token (clojure.spec.alpha/and :portkey.aws.config/next-token))
(clojure.spec.alpha/def :portkey.aws.config/get-discovered-resource-counts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.get-discovered-resource-counts-request/resource-types :portkey.aws.config.get-discovered-resource-counts-request/limit :portkey.aws.config.get-discovered-resource-counts-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/configuration (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/supplementary-configuration-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/emptiable-string-with-char-limit-256 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.config.get-aggregate-config-rule-compliance-summary-request/filters (clojure.spec.alpha/and :portkey.aws.config/config-rule-compliance-summary-filters))
(clojure.spec.alpha/def :portkey.aws.config.get-aggregate-config-rule-compliance-summary-request/group-by-key (clojure.spec.alpha/and :portkey.aws.config/config-rule-compliance-summary-group-key))
(clojure.spec.alpha/def :portkey.aws.config.get-aggregate-config-rule-compliance-summary-request/limit (clojure.spec.alpha/and :portkey.aws.config/group-by-api-limit))
(clojure.spec.alpha/def :portkey.aws.config/get-aggregate-config-rule-compliance-summary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config/configuration-aggregator-name] :opt-un [:portkey.aws.config.get-aggregate-config-rule-compliance-summary-request/filters :portkey.aws.config.get-aggregate-config-rule-compliance-summary-request/group-by-key :portkey.aws.config.get-aggregate-config-rule-compliance-summary-request/limit :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config.describe-retention-configurations-response/retention-configurations (clojure.spec.alpha/and :portkey.aws.config/retention-configuration-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-retention-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-retention-configurations-response/retention-configurations :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/no-such-retention-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.config-export-delivery-info/last-status (clojure.spec.alpha/and :portkey.aws.config/delivery-status))
(clojure.spec.alpha/def :portkey.aws.config.config-export-delivery-info/last-error-code (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-export-delivery-info/last-error-message (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.config-export-delivery-info/last-attempt-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.config-export-delivery-info/last-successful-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.config-export-delivery-info/next-delivery-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config/config-export-delivery-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.config-export-delivery-info/last-status :portkey.aws.config.config-export-delivery-info/last-error-code :portkey.aws.config.config-export-delivery-info/last-error-message :portkey.aws.config.config-export-delivery-info/last-attempt-time :portkey.aws.config.config-export-delivery-info/last-successful-time :portkey.aws.config.config-export-delivery-info/next-delivery-time]))

(clojure.spec.alpha/def :portkey.aws.config.scope/tag-key (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-128))
(clojure.spec.alpha/def :portkey.aws.config.scope/tag-value (clojure.spec.alpha/and :portkey.aws.config/string-with-char-limit-256))
(clojure.spec.alpha/def :portkey.aws.config.scope/compliance-resource-id (clojure.spec.alpha/and :portkey.aws.config/base-resource-id))
(clojure.spec.alpha/def :portkey.aws.config/scope (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/compliance-resource-types :portkey.aws.config.scope/tag-key :portkey.aws.config.scope/tag-value :portkey.aws.config.scope/compliance-resource-id]))

(clojure.spec.alpha/def :portkey.aws.config/invalid-delivery-channel-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/invalid-time-range-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder-status/name (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder-status/last-start-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder-status/last-stop-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder-status/recording (clojure.spec.alpha/and :portkey.aws.config/boolean))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder-status/last-status (clojure.spec.alpha/and :portkey.aws.config/recorder-status))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder-status/last-error-code (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder-status/last-error-message (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config.configuration-recorder-status/last-status-change-time (clojure.spec.alpha/and :portkey.aws.config/date))
(clojure.spec.alpha/def :portkey.aws.config/configuration-recorder-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.configuration-recorder-status/name :portkey.aws.config.configuration-recorder-status/last-start-time :portkey.aws.config.configuration-recorder-status/last-stop-time :portkey.aws.config.configuration-recorder-status/recording :portkey.aws.config.configuration-recorder-status/last-status :portkey.aws.config.configuration-recorder-status/last-error-code :portkey.aws.config.configuration-recorder-status/last-error-message :portkey.aws.config.configuration-recorder-status/last-status-change-time]))

(clojure.spec.alpha/def :portkey.aws.config.get-compliance-details-by-resource-response/next-token (clojure.spec.alpha/and :portkey.aws.config/string))
(clojure.spec.alpha/def :portkey.aws.config/get-compliance-details-by-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config/evaluation-results :portkey.aws.config.get-compliance-details-by-resource-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/string-with-char-limit-1024 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.config.delete-delivery-channel-request/delivery-channel-name (clojure.spec.alpha/and :portkey.aws.config/channel-name))
(clojure.spec.alpha/def :portkey.aws.config/delete-delivery-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.config.delete-delivery-channel-request/delivery-channel-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/group-by-api-limit (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.config/relationship-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config/max-number-of-delivery-channels-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.config/supplementary-configuration-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.config.describe-retention-configurations-request/retention-configuration-names (clojure.spec.alpha/and :portkey.aws.config/retention-configuration-name-list))
(clojure.spec.alpha/def :portkey.aws.config/describe-retention-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.describe-retention-configurations-request/retention-configuration-names :portkey.aws.config/next-token]))

(clojure.spec.alpha/def :portkey.aws.config/config-rule-evaluation-status-list (clojure.spec.alpha/coll-of :portkey.aws.config/config-rule-evaluation-status))

(clojure.spec.alpha/def :portkey.aws.config/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.config.list-discovered-resources-response/resource-identifiers (clojure.spec.alpha/and :portkey.aws.config/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.config.list-discovered-resources-response/next-token (clojure.spec.alpha/and :portkey.aws.config/next-token))
(clojure.spec.alpha/def :portkey.aws.config/list-discovered-resources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.config.list-discovered-resources-response/resource-identifiers :portkey.aws.config.list-discovered-resources-response/next-token]))

(clojure.core/defn delete-configuration-recorder ([delete-configuration-recorder-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-configuration-recorder-request delete-configuration-recorder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/delete-configuration-recorder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConfigurationRecorder", :http.request.spec/error-spec {"NoSuchConfigurationRecorderException" :portkey.aws.config/no-such-configuration-recorder-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-recorder :args (clojure.spec.alpha/tuple :portkey.aws.config/delete-configuration-recorder-request) :ret clojure.core/true?)

(clojure.core/defn describe-pending-aggregation-requests ([] (describe-pending-aggregation-requests {})) ([describe-pending-aggregation-requests-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-pending-aggregation-requests-request describe-pending-aggregation-requests-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-pending-aggregation-requests-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-pending-aggregation-requests-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePendingAggregationRequests", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception}})))))
(clojure.spec.alpha/fdef describe-pending-aggregation-requests :args (clojure.spec.alpha/? :portkey.aws.config/describe-pending-aggregation-requests-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-pending-aggregation-requests-response))

(clojure.core/defn stop-configuration-recorder ([stop-configuration-recorder-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-configuration-recorder-request stop-configuration-recorder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/stop-configuration-recorder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopConfigurationRecorder", :http.request.spec/error-spec {"NoSuchConfigurationRecorderException" :portkey.aws.config/no-such-configuration-recorder-exception}})))))
(clojure.spec.alpha/fdef stop-configuration-recorder :args (clojure.spec.alpha/tuple :portkey.aws.config/stop-configuration-recorder-request) :ret clojure.core/true?)

(clojure.core/defn get-aggregate-config-rule-compliance-summary ([get-aggregate-config-rule-compliance-summary-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-aggregate-config-rule-compliance-summary-request get-aggregate-config-rule-compliance-summary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/get-aggregate-config-rule-compliance-summary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/get-aggregate-config-rule-compliance-summary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAggregateConfigRuleComplianceSummary", :http.request.spec/error-spec {"ValidationException" :portkey.aws.config/validation-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "NoSuchConfigurationAggregatorException" :portkey.aws.config/no-such-configuration-aggregator-exception}})))))
(clojure.spec.alpha/fdef get-aggregate-config-rule-compliance-summary :args (clojure.spec.alpha/tuple :portkey.aws.config/get-aggregate-config-rule-compliance-summary-request) :ret (clojure.spec.alpha/and :portkey.aws.config/get-aggregate-config-rule-compliance-summary-response))

(clojure.core/defn start-config-rules-evaluation ([] (start-config-rules-evaluation {})) ([start-config-rules-evaluation-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-config-rules-evaluation-request start-config-rules-evaluation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/start-config-rules-evaluation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/start-config-rules-evaluation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartConfigRulesEvaluation", :http.request.spec/error-spec {"NoSuchConfigRuleException" :portkey.aws.config/no-such-config-rule-exception, "LimitExceededException" :portkey.aws.config/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.config/resource-in-use-exception, "InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef start-config-rules-evaluation :args (clojure.spec.alpha/? :portkey.aws.config/start-config-rules-evaluation-request) :ret (clojure.spec.alpha/and :portkey.aws.config/start-config-rules-evaluation-response))

(clojure.core/defn describe-delivery-channel-status ([] (describe-delivery-channel-status {})) ([describe-delivery-channel-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-delivery-channel-status-request describe-delivery-channel-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-delivery-channel-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-delivery-channel-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDeliveryChannelStatus", :http.request.spec/error-spec {"NoSuchDeliveryChannelException" :portkey.aws.config/no-such-delivery-channel-exception}})))))
(clojure.spec.alpha/fdef describe-delivery-channel-status :args (clojure.spec.alpha/? :portkey.aws.config/describe-delivery-channel-status-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-delivery-channel-status-response))

(clojure.core/defn get-resource-config-history ([get-resource-config-history-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-resource-config-history-request get-resource-config-history-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/get-resource-config-history-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/get-resource-config-history-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetResourceConfigHistory", :http.request.spec/error-spec {"ValidationException" :portkey.aws.config/validation-exception, "InvalidTimeRangeException" :portkey.aws.config/invalid-time-range-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "NoAvailableConfigurationRecorderException" :portkey.aws.config/no-available-configuration-recorder-exception, "ResourceNotDiscoveredException" :portkey.aws.config/resource-not-discovered-exception}})))))
(clojure.spec.alpha/fdef get-resource-config-history :args (clojure.spec.alpha/tuple :portkey.aws.config/get-resource-config-history-request) :ret (clojure.spec.alpha/and :portkey.aws.config/get-resource-config-history-response))

(clojure.core/defn put-configuration-aggregator ([put-configuration-aggregator-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-configuration-aggregator-request put-configuration-aggregator-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/put-configuration-aggregator-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/put-configuration-aggregator-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutConfigurationAggregator", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "LimitExceededException" :portkey.aws.config/limit-exceeded-exception, "InvalidRoleException" :portkey.aws.config/invalid-role-exception, "OrganizationAccessDeniedException" :portkey.aws.config/organization-access-denied-exception, "NoAvailableOrganizationException" :portkey.aws.config/no-available-organization-exception, "OrganizationAllFeaturesNotEnabledException" :portkey.aws.config/organization-all-features-not-enabled-exception}})))))
(clojure.spec.alpha/fdef put-configuration-aggregator :args (clojure.spec.alpha/tuple :portkey.aws.config/put-configuration-aggregator-request) :ret (clojure.spec.alpha/and :portkey.aws.config/put-configuration-aggregator-response))

(clojure.core/defn deliver-config-snapshot ([deliver-config-snapshot-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-deliver-config-snapshot-request deliver-config-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/deliver-config-snapshot-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/deliver-config-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeliverConfigSnapshot", :http.request.spec/error-spec {"NoSuchDeliveryChannelException" :portkey.aws.config/no-such-delivery-channel-exception, "NoAvailableConfigurationRecorderException" :portkey.aws.config/no-available-configuration-recorder-exception, "NoRunningConfigurationRecorderException" :portkey.aws.config/no-running-configuration-recorder-exception}})))))
(clojure.spec.alpha/fdef deliver-config-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.config/deliver-config-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.config/deliver-config-snapshot-response))

(clojure.core/defn get-compliance-summary-by-resource-type ([] (get-compliance-summary-by-resource-type {})) ([get-compliance-summary-by-resource-type-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-compliance-summary-by-resource-type-request get-compliance-summary-by-resource-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/get-compliance-summary-by-resource-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/get-compliance-summary-by-resource-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetComplianceSummaryByResourceType", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-compliance-summary-by-resource-type :args (clojure.spec.alpha/? :portkey.aws.config/get-compliance-summary-by-resource-type-request) :ret (clojure.spec.alpha/and :portkey.aws.config/get-compliance-summary-by-resource-type-response))

(clojure.core/defn put-config-rule ([put-config-rule-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-config-rule-request put-config-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/put-config-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutConfigRule", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "MaxNumberOfConfigRulesExceededException" :portkey.aws.config/max-number-of-config-rules-exceeded-exception, "ResourceInUseException" :portkey.aws.config/resource-in-use-exception, "InsufficientPermissionsException" :portkey.aws.config/insufficient-permissions-exception, "NoAvailableConfigurationRecorderException" :portkey.aws.config/no-available-configuration-recorder-exception}})))))
(clojure.spec.alpha/fdef put-config-rule :args (clojure.spec.alpha/tuple :portkey.aws.config/put-config-rule-request) :ret clojure.core/true?)

(clojure.core/defn delete-pending-aggregation-request ([delete-pending-aggregation-request-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-pending-aggregation-request-request delete-pending-aggregation-request-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/delete-pending-aggregation-request-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePendingAggregationRequest", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef delete-pending-aggregation-request :args (clojure.spec.alpha/tuple :portkey.aws.config/delete-pending-aggregation-request-request) :ret clojure.core/true?)

(clojure.core/defn get-compliance-summary-by-config-rule ([] (get-compliance-summary-by-config-rule {})) ([_] (clojure.core/let [request-function-result__28606__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/get-compliance-summary-by-config-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetComplianceSummaryByConfigRule", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-compliance-summary-by-config-rule :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.config/get-compliance-summary-by-config-rule-response))

(clojure.core/defn describe-config-rule-evaluation-status ([] (describe-config-rule-evaluation-status {})) ([describe-config-rule-evaluation-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-config-rule-evaluation-status-request describe-config-rule-evaluation-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-config-rule-evaluation-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-config-rule-evaluation-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigRuleEvaluationStatus", :http.request.spec/error-spec {"NoSuchConfigRuleException" :portkey.aws.config/no-such-config-rule-exception, "InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-config-rule-evaluation-status :args (clojure.spec.alpha/? :portkey.aws.config/describe-config-rule-evaluation-status-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-config-rule-evaluation-status-response))

(clojure.core/defn put-delivery-channel ([put-delivery-channel-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-delivery-channel-request put-delivery-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/put-delivery-channel-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutDeliveryChannel", :http.request.spec/error-spec {"MaxNumberOfDeliveryChannelsExceededException" :portkey.aws.config/max-number-of-delivery-channels-exceeded-exception, "NoAvailableConfigurationRecorderException" :portkey.aws.config/no-available-configuration-recorder-exception, "InvalidDeliveryChannelNameException" :portkey.aws.config/invalid-delivery-channel-name-exception, "NoSuchBucketException" :portkey.aws.config/no-such-bucket-exception, "InvalidS3KeyPrefixException" :portkey.aws.config/invalid-s-3-key-prefix-exception, "InvalidSNSTopicARNException" :portkey.aws.config/invalid-sns-topic-arn-exception, "InsufficientDeliveryPolicyException" :portkey.aws.config/insufficient-delivery-policy-exception}})))))
(clojure.spec.alpha/fdef put-delivery-channel :args (clojure.spec.alpha/tuple :portkey.aws.config/put-delivery-channel-request) :ret clojure.core/true?)

(clojure.core/defn get-aggregate-compliance-details-by-config-rule ([get-aggregate-compliance-details-by-config-rule-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-aggregate-compliance-details-by-config-rule-request get-aggregate-compliance-details-by-config-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/get-aggregate-compliance-details-by-config-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/get-aggregate-compliance-details-by-config-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAggregateComplianceDetailsByConfigRule", :http.request.spec/error-spec {"ValidationException" :portkey.aws.config/validation-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "NoSuchConfigurationAggregatorException" :portkey.aws.config/no-such-configuration-aggregator-exception}})))))
(clojure.spec.alpha/fdef get-aggregate-compliance-details-by-config-rule :args (clojure.spec.alpha/tuple :portkey.aws.config/get-aggregate-compliance-details-by-config-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.config/get-aggregate-compliance-details-by-config-rule-response))

(clojure.core/defn describe-configuration-recorders ([] (describe-configuration-recorders {})) ([describe-configuration-recorders-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-configuration-recorders-request describe-configuration-recorders-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-configuration-recorders-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-configuration-recorders-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigurationRecorders", :http.request.spec/error-spec {"NoSuchConfigurationRecorderException" :portkey.aws.config/no-such-configuration-recorder-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-recorders :args (clojure.spec.alpha/? :portkey.aws.config/describe-configuration-recorders-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-configuration-recorders-response))

(clojure.core/defn delete-retention-configuration ([delete-retention-configuration-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-retention-configuration-request delete-retention-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/delete-retention-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRetentionConfiguration", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "NoSuchRetentionConfigurationException" :portkey.aws.config/no-such-retention-configuration-exception}})))))
(clojure.spec.alpha/fdef delete-retention-configuration :args (clojure.spec.alpha/tuple :portkey.aws.config/delete-retention-configuration-request) :ret clojure.core/true?)

(clojure.core/defn start-configuration-recorder ([start-configuration-recorder-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-configuration-recorder-request start-configuration-recorder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/start-configuration-recorder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartConfigurationRecorder", :http.request.spec/error-spec {"NoSuchConfigurationRecorderException" :portkey.aws.config/no-such-configuration-recorder-exception, "NoAvailableDeliveryChannelException" :portkey.aws.config/no-available-delivery-channel-exception}})))))
(clojure.spec.alpha/fdef start-configuration-recorder :args (clojure.spec.alpha/tuple :portkey.aws.config/start-configuration-recorder-request) :ret clojure.core/true?)

(clojure.core/defn put-evaluations ([put-evaluations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-evaluations-request put-evaluations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/put-evaluations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/put-evaluations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutEvaluations", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "InvalidResultTokenException" :portkey.aws.config/invalid-result-token-exception, "NoSuchConfigRuleException" :portkey.aws.config/no-such-config-rule-exception}})))))
(clojure.spec.alpha/fdef put-evaluations :args (clojure.spec.alpha/tuple :portkey.aws.config/put-evaluations-request) :ret (clojure.spec.alpha/and :portkey.aws.config/put-evaluations-response))

(clojure.core/defn put-aggregation-authorization ([put-aggregation-authorization-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-aggregation-authorization-request put-aggregation-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/put-aggregation-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/put-aggregation-authorization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutAggregationAuthorization", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef put-aggregation-authorization :args (clojure.spec.alpha/tuple :portkey.aws.config/put-aggregation-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.config/put-aggregation-authorization-response))

(clojure.core/defn delete-delivery-channel ([delete-delivery-channel-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-delivery-channel-request delete-delivery-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/delete-delivery-channel-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDeliveryChannel", :http.request.spec/error-spec {"NoSuchDeliveryChannelException" :portkey.aws.config/no-such-delivery-channel-exception, "LastDeliveryChannelDeleteFailedException" :portkey.aws.config/last-delivery-channel-delete-failed-exception}})))))
(clojure.spec.alpha/fdef delete-delivery-channel :args (clojure.spec.alpha/tuple :portkey.aws.config/delete-delivery-channel-request) :ret clojure.core/true?)

(clojure.core/defn delete-aggregation-authorization ([delete-aggregation-authorization-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-aggregation-authorization-request delete-aggregation-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/delete-aggregation-authorization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAggregationAuthorization", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef delete-aggregation-authorization :args (clojure.spec.alpha/tuple :portkey.aws.config/delete-aggregation-authorization-request) :ret clojure.core/true?)

(clojure.core/defn put-configuration-recorder ([put-configuration-recorder-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-configuration-recorder-request put-configuration-recorder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/put-configuration-recorder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutConfigurationRecorder", :http.request.spec/error-spec {"MaxNumberOfConfigurationRecordersExceededException" :portkey.aws.config/max-number-of-configuration-recorders-exceeded-exception, "InvalidConfigurationRecorderNameException" :portkey.aws.config/invalid-configuration-recorder-name-exception, "InvalidRoleException" :portkey.aws.config/invalid-role-exception, "InvalidRecordingGroupException" :portkey.aws.config/invalid-recording-group-exception}})))))
(clojure.spec.alpha/fdef put-configuration-recorder :args (clojure.spec.alpha/tuple :portkey.aws.config/put-configuration-recorder-request) :ret clojure.core/true?)

(clojure.core/defn get-discovered-resource-counts ([] (get-discovered-resource-counts {})) ([get-discovered-resource-counts-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-discovered-resource-counts-request get-discovered-resource-counts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/get-discovered-resource-counts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/get-discovered-resource-counts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDiscoveredResourceCounts", :http.request.spec/error-spec {"ValidationException" :portkey.aws.config/validation-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef get-discovered-resource-counts :args (clojure.spec.alpha/? :portkey.aws.config/get-discovered-resource-counts-request) :ret (clojure.spec.alpha/and :portkey.aws.config/get-discovered-resource-counts-response))

(clojure.core/defn batch-get-resource-config ([batch-get-resource-config-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-get-resource-config-request batch-get-resource-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/batch-get-resource-config-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/batch-get-resource-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetResourceConfig", :http.request.spec/error-spec {"ValidationException" :portkey.aws.config/validation-exception, "NoAvailableConfigurationRecorderException" :portkey.aws.config/no-available-configuration-recorder-exception}})))))
(clojure.spec.alpha/fdef batch-get-resource-config :args (clojure.spec.alpha/tuple :portkey.aws.config/batch-get-resource-config-request) :ret (clojure.spec.alpha/and :portkey.aws.config/batch-get-resource-config-response))

(clojure.core/defn get-compliance-details-by-config-rule ([get-compliance-details-by-config-rule-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-compliance-details-by-config-rule-request get-compliance-details-by-config-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/get-compliance-details-by-config-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/get-compliance-details-by-config-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetComplianceDetailsByConfigRule", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "NoSuchConfigRuleException" :portkey.aws.config/no-such-config-rule-exception}})))))
(clojure.spec.alpha/fdef get-compliance-details-by-config-rule :args (clojure.spec.alpha/tuple :portkey.aws.config/get-compliance-details-by-config-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.config/get-compliance-details-by-config-rule-response))

(clojure.core/defn describe-compliance-by-resource ([] (describe-compliance-by-resource {})) ([describe-compliance-by-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-compliance-by-resource-request describe-compliance-by-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-compliance-by-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-compliance-by-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeComplianceByResource", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-compliance-by-resource :args (clojure.spec.alpha/? :portkey.aws.config/describe-compliance-by-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-compliance-by-resource-response))

(clojure.core/defn put-retention-configuration ([put-retention-configuration-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-retention-configuration-request put-retention-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/put-retention-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/put-retention-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRetentionConfiguration", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "MaxNumberOfRetentionConfigurationsExceededException" :portkey.aws.config/max-number-of-retention-configurations-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-retention-configuration :args (clojure.spec.alpha/tuple :portkey.aws.config/put-retention-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.config/put-retention-configuration-response))

(clojure.core/defn describe-config-rules ([] (describe-config-rules {})) ([describe-config-rules-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-config-rules-request describe-config-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-config-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-config-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigRules", :http.request.spec/error-spec {"NoSuchConfigRuleException" :portkey.aws.config/no-such-config-rule-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-config-rules :args (clojure.spec.alpha/? :portkey.aws.config/describe-config-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-config-rules-response))

(clojure.core/defn describe-retention-configurations ([] (describe-retention-configurations {})) ([describe-retention-configurations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-retention-configurations-request describe-retention-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-retention-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-retention-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRetentionConfigurations", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "NoSuchRetentionConfigurationException" :portkey.aws.config/no-such-retention-configuration-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-retention-configurations :args (clojure.spec.alpha/? :portkey.aws.config/describe-retention-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-retention-configurations-response))

(clojure.core/defn list-discovered-resources ([list-discovered-resources-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-discovered-resources-request list-discovered-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/list-discovered-resources-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/list-discovered-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDiscoveredResources", :http.request.spec/error-spec {"ValidationException" :portkey.aws.config/validation-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "NoAvailableConfigurationRecorderException" :portkey.aws.config/no-available-configuration-recorder-exception}})))))
(clojure.spec.alpha/fdef list-discovered-resources :args (clojure.spec.alpha/tuple :portkey.aws.config/list-discovered-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.config/list-discovered-resources-response))

(clojure.core/defn describe-configuration-recorder-status ([] (describe-configuration-recorder-status {})) ([describe-configuration-recorder-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-configuration-recorder-status-request describe-configuration-recorder-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-configuration-recorder-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-configuration-recorder-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigurationRecorderStatus", :http.request.spec/error-spec {"NoSuchConfigurationRecorderException" :portkey.aws.config/no-such-configuration-recorder-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-recorder-status :args (clojure.spec.alpha/? :portkey.aws.config/describe-configuration-recorder-status-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-configuration-recorder-status-response))

(clojure.core/defn get-compliance-details-by-resource ([get-compliance-details-by-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-compliance-details-by-resource-request get-compliance-details-by-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/get-compliance-details-by-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/get-compliance-details-by-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetComplianceDetailsByResource", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-compliance-details-by-resource :args (clojure.spec.alpha/tuple :portkey.aws.config/get-compliance-details-by-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.config/get-compliance-details-by-resource-response))

(clojure.core/defn describe-aggregation-authorizations ([] (describe-aggregation-authorizations {})) ([describe-aggregation-authorizations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-aggregation-authorizations-request describe-aggregation-authorizations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-aggregation-authorizations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-aggregation-authorizations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAggregationAuthorizations", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception}})))))
(clojure.spec.alpha/fdef describe-aggregation-authorizations :args (clojure.spec.alpha/? :portkey.aws.config/describe-aggregation-authorizations-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-aggregation-authorizations-response))

(clojure.core/defn delete-configuration-aggregator ([delete-configuration-aggregator-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-configuration-aggregator-request delete-configuration-aggregator-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/delete-configuration-aggregator-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConfigurationAggregator", :http.request.spec/error-spec {"NoSuchConfigurationAggregatorException" :portkey.aws.config/no-such-configuration-aggregator-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-aggregator :args (clojure.spec.alpha/tuple :portkey.aws.config/delete-configuration-aggregator-request) :ret clojure.core/true?)

(clojure.core/defn describe-configuration-aggregators ([] (describe-configuration-aggregators {})) ([describe-configuration-aggregators-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-configuration-aggregators-request describe-configuration-aggregators-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-configuration-aggregators-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-configuration-aggregators-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigurationAggregators", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "NoSuchConfigurationAggregatorException" :portkey.aws.config/no-such-configuration-aggregator-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-aggregators :args (clojure.spec.alpha/? :portkey.aws.config/describe-configuration-aggregators-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-configuration-aggregators-response))

(clojure.core/defn describe-compliance-by-config-rule ([] (describe-compliance-by-config-rule {})) ([describe-compliance-by-config-rule-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-compliance-by-config-rule-request describe-compliance-by-config-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-compliance-by-config-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-compliance-by-config-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeComplianceByConfigRule", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "NoSuchConfigRuleException" :portkey.aws.config/no-such-config-rule-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-compliance-by-config-rule :args (clojure.spec.alpha/? :portkey.aws.config/describe-compliance-by-config-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-compliance-by-config-rule-response))

(clojure.core/defn describe-delivery-channels ([] (describe-delivery-channels {})) ([describe-delivery-channels-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-delivery-channels-request describe-delivery-channels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-delivery-channels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-delivery-channels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDeliveryChannels", :http.request.spec/error-spec {"NoSuchDeliveryChannelException" :portkey.aws.config/no-such-delivery-channel-exception}})))))
(clojure.spec.alpha/fdef describe-delivery-channels :args (clojure.spec.alpha/? :portkey.aws.config/describe-delivery-channels-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-delivery-channels-response))

(clojure.core/defn describe-aggregate-compliance-by-config-rules ([describe-aggregate-compliance-by-config-rules-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-aggregate-compliance-by-config-rules-request describe-aggregate-compliance-by-config-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-aggregate-compliance-by-config-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-aggregate-compliance-by-config-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAggregateComplianceByConfigRules", :http.request.spec/error-spec {"ValidationException" :portkey.aws.config/validation-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "NoSuchConfigurationAggregatorException" :portkey.aws.config/no-such-configuration-aggregator-exception}})))))
(clojure.spec.alpha/fdef describe-aggregate-compliance-by-config-rules :args (clojure.spec.alpha/tuple :portkey.aws.config/describe-aggregate-compliance-by-config-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-aggregate-compliance-by-config-rules-response))

(clojure.core/defn delete-evaluation-results ([delete-evaluation-results-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-evaluation-results-request delete-evaluation-results-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/delete-evaluation-results-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/delete-evaluation-results-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEvaluationResults", :http.request.spec/error-spec {"NoSuchConfigRuleException" :portkey.aws.config/no-such-config-rule-exception, "ResourceInUseException" :portkey.aws.config/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-evaluation-results :args (clojure.spec.alpha/tuple :portkey.aws.config/delete-evaluation-results-request) :ret (clojure.spec.alpha/and :portkey.aws.config/delete-evaluation-results-response))

(clojure.core/defn delete-config-rule ([delete-config-rule-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-config-rule-request delete-config-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/delete-config-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConfigRule", :http.request.spec/error-spec {"NoSuchConfigRuleException" :portkey.aws.config/no-such-config-rule-exception, "ResourceInUseException" :portkey.aws.config/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-config-rule :args (clojure.spec.alpha/tuple :portkey.aws.config/delete-config-rule-request) :ret clojure.core/true?)

(clojure.core/defn describe-configuration-aggregator-sources-status ([describe-configuration-aggregator-sources-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-configuration-aggregator-sources-status-request describe-configuration-aggregator-sources-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.config/endpoints, :http.request.spec/output-spec :portkey.aws.config/describe-configuration-aggregator-sources-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-12", :http.request.configuration/service-id "Config Service", :http.request.spec/input-spec :portkey.aws.config/describe-configuration-aggregator-sources-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigurationAggregatorSourcesStatus", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.config/invalid-parameter-value-exception, "NoSuchConfigurationAggregatorException" :portkey.aws.config/no-such-configuration-aggregator-exception, "InvalidNextTokenException" :portkey.aws.config/invalid-next-token-exception, "InvalidLimitException" :portkey.aws.config/invalid-limit-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-aggregator-sources-status :args (clojure.spec.alpha/tuple :portkey.aws.config/describe-configuration-aggregator-sources-status-request) :ret (clojure.spec.alpha/and :portkey.aws.config/describe-configuration-aggregator-sources-status-response))
