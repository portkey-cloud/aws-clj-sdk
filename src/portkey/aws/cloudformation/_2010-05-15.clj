(ns portkey.aws.cloudformation.-2010-05-15 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cloudformation", :region "ap-northeast-1"},
    :ssl-common-name "cloudformation.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudformation", :region "eu-west-1"},
    :ssl-common-name "cloudformation.eu-west-1.amazonaws.com",
    :endpoint "https://cloudformation.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudformation", :region "us-east-2"},
    :ssl-common-name "cloudformation.us-east-2.amazonaws.com",
    :endpoint "https://cloudformation.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cloudformation", :region "ap-southeast-2"},
    :ssl-common-name "cloudformation.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudformation.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "cloudformation", :region "cn-north-1"},
    :ssl-common-name "cloudformation.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cloudformation.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudformation", :region "sa-east-1"},
    :ssl-common-name "cloudformation.sa-east-1.amazonaws.com",
    :endpoint "https://cloudformation.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cloudformation", :region "ap-southeast-1"},
    :ssl-common-name "cloudformation.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "cloudformation", :region "cn-northwest-1"},
    :ssl-common-name "cloudformation.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://cloudformation.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cloudformation", :region "ap-northeast-2"},
    :ssl-common-name "cloudformation.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudformation.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudformation", :region "eu-west-3"},
    :ssl-common-name "cloudformation.eu-west-3.amazonaws.com",
    :endpoint "https://cloudformation.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "cloudformation", :region "ca-central-1"},
    :ssl-common-name "cloudformation.ca-central-1.amazonaws.com",
    :endpoint "https://cloudformation.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "cloudformation", :region "eu-central-1"},
    :ssl-common-name "cloudformation.eu-central-1.amazonaws.com",
    :endpoint "https://cloudformation.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudformation", :region "eu-west-2"},
    :ssl-common-name "cloudformation.eu-west-2.amazonaws.com",
    :endpoint "https://cloudformation.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "cloudformation", :region "us-gov-west-1"},
    :ssl-common-name "cloudformation.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudformation.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudformation", :region "us-west-2"},
    :ssl-common-name "cloudformation.us-west-2.amazonaws.com",
    :endpoint "https://cloudformation.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudformation", :region "us-east-1"},
    :ssl-common-name "cloudformation.us-east-1.amazonaws.com",
    :endpoint "https://cloudformation.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudformation", :region "us-west-1"},
    :ssl-common-name "cloudformation.us-west-1.amazonaws.com",
    :endpoint "https://cloudformation.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "cloudformation", :region "ap-south-1"},
    :ssl-common-name "cloudformation.ap-south-1.amazonaws.com",
    :endpoint "https://cloudformation.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-notification-ar-ns)

(clojure.core/declare ser-physical-resource-id)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-template-url)

(clojure.core/declare ser-rollback-configuration)

(clojure.core/declare ser-logical-resource-id)

(clojure.core/declare ser-stack-set-status)

(clojure.core/declare ser-parameter-key)

(clojure.core/declare ser-type)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-export-name)

(clojure.core/declare ser-template-body)

(clojure.core/declare ser-retain-stacks)

(clojure.core/declare ser-parameters)

(clojure.core/declare ser-rollback-triggers)

(clojure.core/declare ser-change-set-type)

(clojure.core/declare ser-change-set-name)

(clojure.core/declare ser-rollback-trigger)

(clojure.core/declare ser-region-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-template-stage)

(clojure.core/declare ser-notification-arn)

(clojure.core/declare ser-retain-resources)

(clojure.core/declare ser-failure-tolerance-percentage)

(clojure.core/declare ser-disable-rollback)

(clojure.core/declare ser-resource-to-skip)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-stack-set-name-or-id)

(clojure.core/declare ser-resources-to-skip)

(clojure.core/declare ser-stack-policy-during-update-url)

(clojure.core/declare ser-stack-status)

(clojure.core/declare ser-capabilities)

(clojure.core/declare ser-capability)

(clojure.core/declare ser-resource-signal-status)

(clojure.core/declare ser-failure-tolerance-count)

(clojure.core/declare ser-account)

(clojure.core/declare ser-stack-name-or-id)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-change-set-name-or-id)

(clojure.core/declare ser-max-concurrent-count)

(clojure.core/declare ser-parameter)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-execution-role-name)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-enable-termination-protection)

(clojure.core/declare ser-use-previous-template)

(clojure.core/declare ser-stack-name)

(clojure.core/declare ser-stack-policy-url)

(clojure.core/declare ser-stack-set-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-resource-types)

(clojure.core/declare ser-account-list)

(clojure.core/declare ser-use-previous-value)

(clojure.core/declare ser-max-concurrent-percentage)

(clojure.core/declare ser-on-failure)

(clojure.core/declare ser-stack-set-operation-preferences)

(clojure.core/declare ser-stack-policy-body)

(clojure.core/declare ser-region)

(clojure.core/declare ser-monitoring-time-in-minutes)

(clojure.core/declare ser-resource-signal-unique-id)

(clojure.core/declare ser-client-token)

(clojure.core/declare ser-stack-status-filter)

(clojure.core/declare ser-parameter-value)

(clojure.core/declare ser-stack-policy-during-update-body)

(clojure.core/declare ser-timeout-minutes)

(clojure.core/defn- ser-notification-ar-ns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notification-arn coll) #:http.request.field{:shape "NotificationARN"}))) input), :shape "NotificationARNs", :type "list", :max 5})

(clojure.core/defn- ser-physical-resource-id [input] #:http.request.field{:value input, :shape "PhysicalResourceId"})

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-template-url [input] #:http.request.field{:value input, :shape "TemplateURL"})

(clojure.core/defn- ser-rollback-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RollbackConfiguration", :type "structure"} (clojure.core/contains? input :rollback-triggers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rollback-triggers (input :rollback-triggers)) #:http.request.field{:name "RollbackTriggers", :shape "RollbackTriggers"})) (clojure.core/contains? input :monitoring-time-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-monitoring-time-in-minutes (input :monitoring-time-in-minutes)) #:http.request.field{:name "MonitoringTimeInMinutes", :shape "MonitoringTimeInMinutes"}))))

(clojure.core/defn- ser-logical-resource-id [input] #:http.request.field{:value input, :shape "LogicalResourceId"})

(clojure.core/defn- ser-stack-set-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "DELETED" "DELETED", :deleted "DELETED"} input), :shape "StackSetStatus"})

(clojure.core/defn- ser-parameter-key [input] #:http.request.field{:value input, :shape "ParameterKey"})

(clojure.core/defn- ser-type [input] #:http.request.field{:value input, :shape "Type"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleARN"})

(clojure.core/defn- ser-export-name [input] #:http.request.field{:value input, :shape "ExportName"})

(clojure.core/defn- ser-template-body [input] #:http.request.field{:value input, :shape "TemplateBody"})

(clojure.core/defn- ser-retain-stacks [input] #:http.request.field{:value input, :shape "RetainStacks"})

(clojure.core/defn- ser-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter coll) #:http.request.field{:shape "Parameter"}))) input), :shape "Parameters", :type "list"})

(clojure.core/defn- ser-rollback-triggers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rollback-trigger coll) #:http.request.field{:shape "RollbackTrigger"}))) input), :shape "RollbackTriggers", :type "list", :max 5})

(clojure.core/defn- ser-change-set-type [input] #:http.request.field{:value (clojure.core/get {"CREATE" "CREATE", :create "CREATE", "UPDATE" "UPDATE", :update "UPDATE"} input), :shape "ChangeSetType"})

(clojure.core/defn- ser-change-set-name [input] #:http.request.field{:value input, :shape "ChangeSetName"})

(clojure.core/defn- ser-rollback-trigger [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn (:arn input)) #:http.request.field{:name "Arn", :shape "Arn"}) (clojure.core/into (ser-type (:type input)) #:http.request.field{:name "Type", :shape "Type"})], :shape "RollbackTrigger", :type "structure"}))

(clojure.core/defn- ser-region-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-region coll) #:http.request.field{:shape "Region"}))) input), :shape "RegionList", :type "list"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list", :max 50})

(clojure.core/defn- ser-template-stage [input] #:http.request.field{:value (clojure.core/get {"Original" "Original", :original "Original", "Processed" "Processed", :processed "Processed"} input), :shape "TemplateStage"})

(clojure.core/defn- ser-notification-arn [input] #:http.request.field{:value input, :shape "NotificationARN"})

(clojure.core/defn- ser-retain-resources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-logical-resource-id coll) #:http.request.field{:shape "LogicalResourceId"}))) input), :shape "RetainResources", :type "list"})

(clojure.core/defn- ser-failure-tolerance-percentage [input] #:http.request.field{:value input, :shape "FailureTolerancePercentage"})

(clojure.core/defn- ser-disable-rollback [input] #:http.request.field{:value input, :shape "DisableRollback"})

(clojure.core/defn- ser-resource-to-skip [input] #:http.request.field{:value input, :shape "ResourceToSkip"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-stack-set-name-or-id [input] #:http.request.field{:value input, :shape "StackSetNameOrId"})

(clojure.core/defn- ser-resources-to-skip [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-to-skip coll) #:http.request.field{:shape "ResourceToSkip"}))) input), :shape "ResourcesToSkip", :type "list"})

(clojure.core/defn- ser-stack-policy-during-update-url [input] #:http.request.field{:value input, :shape "StackPolicyDuringUpdateURL"})

(clojure.core/defn- ser-stack-status [input] #:http.request.field{:value (clojure.core/get {:rollback-failed "ROLLBACK_FAILED", :delete-failed "DELETE_FAILED", "UPDATE_ROLLBACK_FAILED" "UPDATE_ROLLBACK_FAILED", "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS", "REVIEW_IN_PROGRESS" "REVIEW_IN_PROGRESS", :create-complete "CREATE_COMPLETE", "ROLLBACK_FAILED" "ROLLBACK_FAILED", :rollback-in-progress "ROLLBACK_IN_PROGRESS", :update-rollback-in-progress "UPDATE_ROLLBACK_IN_PROGRESS", "DELETE_IN_PROGRESS" "DELETE_IN_PROGRESS", "UPDATE_IN_PROGRESS" "UPDATE_IN_PROGRESS", "ROLLBACK_IN_PROGRESS" "ROLLBACK_IN_PROGRESS", "CREATE_FAILED" "CREATE_FAILED", :rollback-complete "ROLLBACK_COMPLETE", "DELETE_COMPLETE" "DELETE_COMPLETE", "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS", :update-complete "UPDATE_COMPLETE", :update-rollback-complete-cleanup-in-progress "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS", "CREATE_IN_PROGRESS" "CREATE_IN_PROGRESS", :delete-in-progress "DELETE_IN_PROGRESS", :create-failed "CREATE_FAILED", :create-in-progress "CREATE_IN_PROGRESS", :delete-complete "DELETE_COMPLETE", :update-rollback-complete "UPDATE_ROLLBACK_COMPLETE", "CREATE_COMPLETE" "CREATE_COMPLETE", :update-rollback-failed "UPDATE_ROLLBACK_FAILED", "UPDATE_COMPLETE" "UPDATE_COMPLETE", "ROLLBACK_COMPLETE" "ROLLBACK_COMPLETE", :update-in-progress "UPDATE_IN_PROGRESS", :update-complete-cleanup-in-progress "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS", :review-in-progress "REVIEW_IN_PROGRESS", "DELETE_FAILED" "DELETE_FAILED", "UPDATE_ROLLBACK_COMPLETE" "UPDATE_ROLLBACK_COMPLETE", "UPDATE_ROLLBACK_IN_PROGRESS" "UPDATE_ROLLBACK_IN_PROGRESS"} input), :shape "StackStatus"})

(clojure.core/defn- ser-capabilities [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-capability coll) #:http.request.field{:shape "Capability"}))) input), :shape "Capabilities", :type "list"})

(clojure.core/defn- ser-capability [input] #:http.request.field{:value (clojure.core/get {"CAPABILITY_IAM" "CAPABILITY_IAM", :capability-iam "CAPABILITY_IAM", "CAPABILITY_NAMED_IAM" "CAPABILITY_NAMED_IAM", :capability-named-iam "CAPABILITY_NAMED_IAM"} input), :shape "Capability"})

(clojure.core/defn- ser-resource-signal-status [input] #:http.request.field{:value (clojure.core/get {"SUCCESS" "SUCCESS", :success "SUCCESS", "FAILURE" "FAILURE", :failure "FAILURE"} input), :shape "ResourceSignalStatus"})

(clojure.core/defn- ser-failure-tolerance-count [input] #:http.request.field{:value input, :shape "FailureToleranceCount"})

(clojure.core/defn- ser-account [input] #:http.request.field{:value input, :shape "Account"})

(clojure.core/defn- ser-stack-name-or-id [input] #:http.request.field{:value input, :shape "StackNameOrId"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-change-set-name-or-id [input] #:http.request.field{:value input, :shape "ChangeSetNameOrId"})

(clojure.core/defn- ser-max-concurrent-count [input] #:http.request.field{:value input, :shape "MaxConcurrentCount"})

(clojure.core/defn- ser-parameter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Parameter", :type "structure"} (clojure.core/contains? input :parameter-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-key (input :parameter-key)) #:http.request.field{:name "ParameterKey", :shape "ParameterKey"})) (clojure.core/contains? input :parameter-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value (input :parameter-value)) #:http.request.field{:name "ParameterValue", :shape "ParameterValue"})) (clojure.core/contains? input :use-previous-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-previous-value (input :use-previous-value)) #:http.request.field{:name "UsePreviousValue", :shape "UsePreviousValue"})) (clojure.core/contains? input :resolved-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value (input :resolved-value)) #:http.request.field{:name "ResolvedValue", :shape "ParameterValue"}))))

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value input, :shape "ResourceType"})

(clojure.core/defn- ser-execution-role-name [input] #:http.request.field{:value input, :shape "ExecutionRoleName"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-enable-termination-protection [input] #:http.request.field{:value input, :shape "EnableTerminationProtection"})

(clojure.core/defn- ser-use-previous-template [input] #:http.request.field{:value input, :shape "UsePreviousTemplate"})

(clojure.core/defn- ser-stack-name [input] #:http.request.field{:value input, :shape "StackName"})

(clojure.core/defn- ser-stack-policy-url [input] #:http.request.field{:value input, :shape "StackPolicyURL"})

(clojure.core/defn- ser-stack-set-name [input] #:http.request.field{:value input, :shape "StackSetName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-resource-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-type coll) #:http.request.field{:shape "ResourceType"}))) input), :shape "ResourceTypes", :type "list"})

(clojure.core/defn- ser-account-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-account coll) #:http.request.field{:shape "Account"}))) input), :shape "AccountList", :type "list"})

(clojure.core/defn- ser-use-previous-value [input] #:http.request.field{:value input, :shape "UsePreviousValue"})

(clojure.core/defn- ser-max-concurrent-percentage [input] #:http.request.field{:value input, :shape "MaxConcurrentPercentage"})

(clojure.core/defn- ser-on-failure [input] #:http.request.field{:value (clojure.core/get {"DO_NOTHING" "DO_NOTHING", :do-nothing "DO_NOTHING", "ROLLBACK" "ROLLBACK", :rollback "ROLLBACK", "DELETE" "DELETE", :delete "DELETE"} input), :shape "OnFailure"})

(clojure.core/defn- ser-stack-set-operation-preferences [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StackSetOperationPreferences", :type "structure"} (clojure.core/contains? input :region-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-region-list (input :region-order)) #:http.request.field{:name "RegionOrder", :shape "RegionList"})) (clojure.core/contains? input :failure-tolerance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-tolerance-count (input :failure-tolerance-count)) #:http.request.field{:name "FailureToleranceCount", :shape "FailureToleranceCount"})) (clojure.core/contains? input :failure-tolerance-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-tolerance-percentage (input :failure-tolerance-percentage)) #:http.request.field{:name "FailureTolerancePercentage", :shape "FailureTolerancePercentage"})) (clojure.core/contains? input :max-concurrent-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-count (input :max-concurrent-count)) #:http.request.field{:name "MaxConcurrentCount", :shape "MaxConcurrentCount"})) (clojure.core/contains? input :max-concurrent-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-percentage (input :max-concurrent-percentage)) #:http.request.field{:name "MaxConcurrentPercentage", :shape "MaxConcurrentPercentage"}))))

(clojure.core/defn- ser-stack-policy-body [input] #:http.request.field{:value input, :shape "StackPolicyBody"})

(clojure.core/defn- ser-region [input] #:http.request.field{:value input, :shape "Region"})

(clojure.core/defn- ser-monitoring-time-in-minutes [input] #:http.request.field{:value input, :shape "MonitoringTimeInMinutes"})

(clojure.core/defn- ser-resource-signal-unique-id [input] #:http.request.field{:value input, :shape "ResourceSignalUniqueId"})

(clojure.core/defn- ser-client-token [input] #:http.request.field{:value input, :shape "ClientToken"})

(clojure.core/defn- ser-stack-status-filter [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-stack-status coll) #:http.request.field{:shape "StackStatus"}))) input), :shape "StackStatusFilter", :type "list"})

(clojure.core/defn- ser-parameter-value [input] #:http.request.field{:value input, :shape "ParameterValue"})

(clojure.core/defn- ser-stack-policy-during-update-body [input] #:http.request.field{:value input, :shape "StackPolicyDuringUpdateBody"})

(clojure.core/defn- ser-timeout-minutes [input] #:http.request.field{:value input, :shape "TimeoutMinutes"})

(clojure.core/defn- req-cancel-update-stack-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"}))))

(clojure.core/defn- req-validate-template-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"}))))

(clojure.core/defn- req-delete-change-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-change-set-name-or-id (input :change-set-name)) #:http.request.field{:name "ChangeSetName", :shape "ChangeSetNameOrId"})]} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"}))))

(clojure.core/defn- req-describe-stack-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"}) (clojure.core/into (ser-logical-resource-id (input :logical-resource-id)) #:http.request.field{:name "LogicalResourceId", :shape "LogicalResourceId"})]}))

(clojure.core/defn- req-get-template-summary-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})) (clojure.core/contains? input :stack-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-name-or-id (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetNameOrId"}))))

(clojure.core/defn- req-delete-stack-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})]} (clojure.core/contains? input :retain-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retain-resources (input :retain-resources)) #:http.request.field{:name "RetainResources", :shape "RetainResources"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"}))))

(clojure.core/defn- req-describe-stack-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"}) (clojure.core/into (ser-account (input :stack-instance-account)) #:http.request.field{:name "StackInstanceAccount", :shape "Account"}) (clojure.core/into (ser-region (input :stack-instance-region)) #:http.request.field{:name "StackInstanceRegion", :shape "Region"})]}))

(clojure.core/defn- req-delete-stack-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"}) (clojure.core/into (ser-account-list (input :accounts)) #:http.request.field{:name "Accounts", :shape "AccountList"}) (clojure.core/into (ser-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "RegionList"}) (clojure.core/into (ser-retain-stacks (input :retain-stacks)) #:http.request.field{:name "RetainStacks", :shape "RetainStacks"})]} (clojure.core/contains? input :operation-preferences) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-operation-preferences (input :operation-preferences)) #:http.request.field{:name "OperationPreferences", :shape "StackSetOperationPreferences"})) (clojure.core/contains? input :operation-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-update-stack-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name-or-id (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetNameOrId"}) (clojure.core/into (ser-account-list (input :accounts)) #:http.request.field{:name "Accounts", :shape "AccountList"}) (clojure.core/into (ser-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "RegionList"})]} (clojure.core/contains? input :parameter-overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameter-overrides)) #:http.request.field{:name "ParameterOverrides", :shape "Parameters"})) (clojure.core/contains? input :operation-preferences) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-operation-preferences (input :operation-preferences)) #:http.request.field{:name "OperationPreferences", :shape "StackSetOperationPreferences"})) (clojure.core/contains? input :operation-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-describe-stacks-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-stack-resources-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})) (clojure.core/contains? input :logical-resource-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logical-resource-id (input :logical-resource-id)) #:http.request.field{:name "LogicalResourceId", :shape "LogicalResourceId"})) (clojure.core/contains? input :physical-resource-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-physical-resource-id (input :physical-resource-id)) #:http.request.field{:name "PhysicalResourceId", :shape "PhysicalResourceId"}))))

(clojure.core/defn- req-describe-stack-set-operation-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"}) (clojure.core/into (ser-client-request-token (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ClientRequestToken"})]}))

(clojure.core/defn- req-signal-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"}) (clojure.core/into (ser-logical-resource-id (input :logical-resource-id)) #:http.request.field{:name "LogicalResourceId", :shape "LogicalResourceId"}) (clojure.core/into (ser-resource-signal-unique-id (input :unique-id)) #:http.request.field{:name "UniqueId", :shape "ResourceSignalUniqueId"}) (clojure.core/into (ser-resource-signal-status (input :status)) #:http.request.field{:name "Status", :shape "ResourceSignalStatus"})]}))

(clojure.core/defn- req-list-exports-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-create-stack-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"}) (clojure.core/into (ser-account-list (input :accounts)) #:http.request.field{:name "Accounts", :shape "AccountList"}) (clojure.core/into (ser-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "RegionList"})]} (clojure.core/contains? input :parameter-overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameter-overrides)) #:http.request.field{:name "ParameterOverrides", :shape "Parameters"})) (clojure.core/contains? input :operation-preferences) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-operation-preferences (input :operation-preferences)) #:http.request.field{:name "OperationPreferences", :shape "StackSetOperationPreferences"})) (clojure.core/contains? input :operation-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-describe-account-limits-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-stack-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :stack-instance-account) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account (input :stack-instance-account)) #:http.request.field{:name "StackInstanceAccount", :shape "Account"})) (clojure.core/contains? input :stack-instance-region) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-region (input :stack-instance-region)) #:http.request.field{:name "StackInstanceRegion", :shape "Region"}))))

(clojure.core/defn- req-create-stack-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-capabilities (input :capabilities)) #:http.request.field{:name "Capabilities", :shape "Capabilities"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :administration-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :administration-role-arn)) #:http.request.field{:name "AdministrationRoleARN", :shape "RoleARN"})) (clojure.core/contains? input :execution-role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-role-name (input :execution-role-name)) #:http.request.field{:name "ExecutionRoleName", :shape "ExecutionRoleName"}))))

(clojure.core/defn- req-create-change-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"}) (clojure.core/into (ser-change-set-name (input :change-set-name)) #:http.request.field{:name "ChangeSetName", :shape "ChangeSetName"})]} (clojure.core/contains? input :notification-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-ar-ns (input :notification-ar-ns)) #:http.request.field{:name "NotificationARNs", :shape "NotificationARNs"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rollback-configuration (input :rollback-configuration)) #:http.request.field{:name "RollbackConfiguration", :shape "RollbackConfiguration"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :change-set-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-change-set-type (input :change-set-type)) #:http.request.field{:name "ChangeSetType", :shape "ChangeSetType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-capabilities (input :capabilities)) #:http.request.field{:name "Capabilities", :shape "Capabilities"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :use-previous-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-previous-template (input :use-previous-template)) #:http.request.field{:name "UsePreviousTemplate", :shape "UsePreviousTemplate"})) (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-types (input :resource-types)) #:http.request.field{:name "ResourceTypes", :shape "ResourceTypes"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken"}))))

(clojure.core/defn- req-set-stack-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})]} (clojure.core/contains? input :stack-policy-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-policy-body (input :stack-policy-body)) #:http.request.field{:name "StackPolicyBody", :shape "StackPolicyBody"})) (clojure.core/contains? input :stack-policy-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-policy-url (input :stack-policy-url)) #:http.request.field{:name "StackPolicyURL", :shape "StackPolicyURL"}))))

(clojure.core/defn- req-list-imports-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-export-name (input :export-name)) #:http.request.field{:name "ExportName", :shape "ExportName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-stack-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})]} (clojure.core/contains? input :notification-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-ar-ns (input :notification-ar-ns)) #:http.request.field{:name "NotificationARNs", :shape "NotificationARNs"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rollback-configuration (input :rollback-configuration)) #:http.request.field{:name "RollbackConfiguration", :shape "RollbackConfiguration"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :stack-policy-during-update-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-policy-during-update-url (input :stack-policy-during-update-url)) #:http.request.field{:name "StackPolicyDuringUpdateURL", :shape "StackPolicyDuringUpdateURL"})) (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-capabilities (input :capabilities)) #:http.request.field{:name "Capabilities", :shape "Capabilities"})) (clojure.core/contains? input :use-previous-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-previous-template (input :use-previous-template)) #:http.request.field{:name "UsePreviousTemplate", :shape "UsePreviousTemplate"})) (clojure.core/contains? input :stack-policy-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-policy-url (input :stack-policy-url)) #:http.request.field{:name "StackPolicyURL", :shape "StackPolicyURL"})) (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-types (input :resource-types)) #:http.request.field{:name "ResourceTypes", :shape "ResourceTypes"})) (clojure.core/contains? input :stack-policy-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-policy-body (input :stack-policy-body)) #:http.request.field{:name "StackPolicyBody", :shape "StackPolicyBody"})) (clojure.core/contains? input :stack-policy-during-update-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-policy-during-update-body (input :stack-policy-during-update-body)) #:http.request.field{:name "StackPolicyDuringUpdateBody", :shape "StackPolicyDuringUpdateBody"}))))

(clojure.core/defn- req-update-termination-protection-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-enable-termination-protection (input :enable-termination-protection)) #:http.request.field{:name "EnableTerminationProtection", :shape "EnableTerminationProtection"}) (clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})]}))

(clojure.core/defn- req-list-stacks-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :stack-status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-status-filter (input :stack-status-filter)) #:http.request.field{:name "StackStatusFilter", :shape "StackStatusFilter"}))))

(clojure.core/defn- req-estimate-template-cost-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"}))))

(clojure.core/defn- req-get-stack-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})]}))

(clojure.core/defn- req-delete-stack-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"})]}))

(clojure.core/defn- req-list-stack-set-operation-results-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"}) (clojure.core/into (ser-client-request-token (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ClientRequestToken"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-stack-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"})]}))

(clojure.core/defn- req-list-stack-resources-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-create-stack-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})]} (clojure.core/contains? input :notification-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-ar-ns (input :notification-ar-ns)) #:http.request.field{:name "NotificationARNs", :shape "NotificationARNs"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rollback-configuration (input :rollback-configuration)) #:http.request.field{:name "RollbackConfiguration", :shape "RollbackConfiguration"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout-minutes (input :timeout-in-minutes)) #:http.request.field{:name "TimeoutInMinutes", :shape "TimeoutMinutes"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :disable-rollback) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disable-rollback (input :disable-rollback)) #:http.request.field{:name "DisableRollback", :shape "DisableRollback"})) (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-capabilities (input :capabilities)) #:http.request.field{:name "Capabilities", :shape "Capabilities"})) (clojure.core/contains? input :enable-termination-protection) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-termination-protection (input :enable-termination-protection)) #:http.request.field{:name "EnableTerminationProtection", :shape "EnableTerminationProtection"})) (clojure.core/contains? input :stack-policy-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-policy-url (input :stack-policy-url)) #:http.request.field{:name "StackPolicyURL", :shape "StackPolicyURL"})) (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-types (input :resource-types)) #:http.request.field{:name "ResourceTypes", :shape "ResourceTypes"})) (clojure.core/contains? input :on-failure) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-failure (input :on-failure)) #:http.request.field{:name "OnFailure", :shape "OnFailure"})) (clojure.core/contains? input :stack-policy-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-policy-body (input :stack-policy-body)) #:http.request.field{:name "StackPolicyBody", :shape "StackPolicyBody"}))))

(clojure.core/defn- req-describe-change-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-change-set-name-or-id (input :change-set-name)) #:http.request.field{:name "ChangeSetName", :shape "ChangeSetNameOrId"})]} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-stack-events-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-change-sets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-stack-set-operations-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-stop-stack-set-operation-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"}) (clojure.core/into (ser-client-request-token (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ClientRequestToken"})]}))

(clojure.core/defn- req-continue-update-rollback-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})]} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :resources-to-skip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resources-to-skip (input :resources-to-skip)) #:http.request.field{:name "ResourcesToSkip", :shape "ResourcesToSkip"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"}))))

(clojure.core/defn- req-update-stack-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"})]} (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :regions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "RegionList"})) (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-capabilities (input :capabilities)) #:http.request.field{:name "Capabilities", :shape "Capabilities"})) (clojure.core/contains? input :accounts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-list (input :accounts)) #:http.request.field{:name "Accounts", :shape "AccountList"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :operation-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :administration-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :administration-role-arn)) #:http.request.field{:name "AdministrationRoleARN", :shape "RoleARN"})) (clojure.core/contains? input :execution-role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-role-name (input :execution-role-name)) #:http.request.field{:name "ExecutionRoleName", :shape "ExecutionRoleName"})) (clojure.core/contains? input :use-previous-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-previous-template (input :use-previous-template)) #:http.request.field{:name "UsePreviousTemplate", :shape "UsePreviousTemplate"})) (clojure.core/contains? input :operation-preferences) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-operation-preferences (input :operation-preferences)) #:http.request.field{:name "OperationPreferences", :shape "StackSetOperationPreferences"}))))

(clojure.core/defn- req-get-template-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})) (clojure.core/contains? input :change-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-change-set-name-or-id (input :change-set-name)) #:http.request.field{:name "ChangeSetName", :shape "ChangeSetNameOrId"})) (clojure.core/contains? input :template-stage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-stage (input :template-stage)) #:http.request.field{:name "TemplateStage", :shape "TemplateStage"}))))

(clojure.core/defn- req-list-stack-sets-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-status (input :status)) #:http.request.field{:name "Status", :shape "StackSetStatus"}))))

(clojure.core/defn- req-execute-change-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-change-set-name-or-id (input :change-set-name)) #:http.request.field{:name "ChangeSetName", :shape "ChangeSetNameOrId"})]} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"}))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/cancel-update-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.resource-change/action (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-action))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.resource-change/details (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/resource-change-details))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.resource-change/action :portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15/replacement :portkey.aws.cloudformation.-2010-05-15/scope :portkey.aws.cloudformation.-2010-05-15.resource-change/details]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/notification-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/notification-arn :max-count 5))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-operation]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-summary/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15.stack-resource-summary/last-updated-timestamp :portkey.aws.cloudformation.-2010-05-15/resource-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-status-reason]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/physical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-status #{"CREATE_PENDING" :create-complete "DELETE_COMPLETE" "CREATE_IN_PROGRESS" :create-in-progress :delete-complete "CREATE_COMPLETE" "FAILED" :create-pending :failed})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/imports (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-name))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/validate-template-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/template-url]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-change-set-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.delete-change-set-input/change-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15.delete-change-set-input/stack-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-instances-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-instance-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.list-stack-instances-output/summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-type #{:resource "Resource"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][-a-zA-Z0-9]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/logical-resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/rollback-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/rollback-triggers :portkey.aws.cloudformation.-2010-05-15/monitoring-time-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.get-template-summary-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.get-template-summary-input/stack-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-template-summary-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15.get-template-summary-input/stack-name :portkey.aws.cloudformation.-2010-05-15.get-template-summary-input/stack-set-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/logical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-status #{:deleted :active "ACTIVE" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-limit-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/account-limit))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resources (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-resource))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stacks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-events :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/retain-resources :portkey.aws.cloudformation.-2010-05-15/role-arn :portkey.aws.cloudformation.-2010-05-15/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-instance-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-account-limits-output/account-limits (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account-limit-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.describe-account-limits-output/account-limits :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/change-set-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-stack-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-stack-instance-input/stack-instance-account (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-stack-instance-input/stack-instance-region (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/region))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15.describe-stack-instance-input/stack-instance-account :portkey.aws.cloudformation.-2010-05-15.describe-stack-instance-input/stack-instance-region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 20 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/property-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.account-gate-result/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account-gate-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.account-gate-result/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account-gate-status-reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-gate-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.account-gate-result/status :portkey.aws.cloudformation.-2010-05-15.account-gate-result/status-reason]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/export-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-events (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-event))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-input/accounts (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-input/regions (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-input/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-input/accounts :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-input/regions :portkey.aws.cloudformation.-2010-05-15/retain-stacks] :opt-un [:portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-input/operation-preferences :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-input/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.change-set-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.change-set-summary/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-status-reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/change-set-name :portkey.aws.cloudformation.-2010-05-15/change-set-id :portkey.aws.cloudformation.-2010-05-15.change-set-summary/status :portkey.aws.cloudformation.-2010-05-15.change-set-summary/status-reason :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/creation-time :portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/execution-status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-result-status #{:pending "PENDING" :running :cancelled "SUCCEEDED" "FAILED" "CANCELLED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/export-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/stack-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/accounts (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/regions (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/parameter-overrides (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameters))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/stack-set-name :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/accounts :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/regions] :opt-un [:portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/parameter-overrides :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/operation-preferences :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-input/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-resource-summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-exports-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/exports :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stacks-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/physical-resource-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-stack-set-operation-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15.describe-stack-set-operation-input/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/retain-stacks clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.signal-resource-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.signal-resource-input/unique-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/resource-signal-unique-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.signal-resource-input/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/resource-signal-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/signal-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.signal-resource-input/stack-name :portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15.signal-resource-input/unique-id :portkey.aws.cloudformation.-2010-05-15.signal-resource-input/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-resource-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/action (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-action))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/creation-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/end-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/operation-id :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/action :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/status :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/creation-timestamp :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-summary/end-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameters (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/parameter))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/rollback-triggers (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/rollback-trigger :max-count 5))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-instance-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-instance-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-instance-summary/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-instance-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-id :portkey.aws.cloudformation.-2010-05-15/region :portkey.aws.cloudformation.-2010-05-15/account :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15.stack-instance-summary/status :portkey.aws.cloudformation.-2010-05-15.stack-instance-summary/status-reason]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-instance/parameter-overrides (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameters))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-instance/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-instance-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-instance/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-id :portkey.aws.cloudformation.-2010-05-15/region :portkey.aws.cloudformation.-2010-05-15/account :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15.stack-instance/parameter-overrides :portkey.aws.cloudformation.-2010-05-15.stack-instance/status :portkey.aws.cloudformation.-2010-05-15.stack-instance/status-reason]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.validate-template-output/parameters (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/template-parameters))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.validate-template-output/declared-transforms (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/transforms-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/validate-template-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.validate-template-output/parameters :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/capabilities-reason :portkey.aws.cloudformation.-2010-05-15.validate-template-output/declared-transforms]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/retain-stacks-nullable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-change-set-output/id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.create-change-set-output/id :portkey.aws.cloudformation.-2010-05-15/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-action #{:remove "Modify" "Add" "Remove" :add :modify})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/name-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-type #{:create :update "UPDATE" "CREATE"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/allowed-values (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/allowed-value))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/rollback-trigger (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/arn :portkey.aws.cloudformation.-2010-05-15/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/region-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/region))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/deletion-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:[-a-zA-Z0-9:/]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/invalid-change-set-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/changes (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/change))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-event (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/event-id :portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/timestamp] :opt-un [:portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/client-request-token :portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-status-reason :portkey.aws.cloudformation.-2010-05-15/resource-status :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15/resource-properties]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/tags (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/tag :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/evaluation-type #{:static "Dynamic" :dynamic "Static"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-stage #{:original "Processed" :processed "Original"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/notification-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-exports-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/retain-resources (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/logical-resource-id))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/accounts (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/regions (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/parameter-overrides (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameters))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/accounts :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/regions] :opt-un [:portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/parameter-overrides :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/operation-preferences :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-input/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/end-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/retain-stacks (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/retain-stacks-nullable))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/creation-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/action (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-action))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.stack-set-operation/end-timestamp :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/retain-stacks :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/status :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/creation-timestamp :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/operation-id :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/administration-role-arn :portkey.aws.cloudformation.-2010-05-15/stack-set-id :portkey.aws.cloudformation.-2010-05-15/execution-role-name :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/operation-preferences :portkey.aws.cloudformation.-2010-05-15.stack-set-operation/action]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-sets-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.list-stack-sets-output/summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/failure-tolerance-percentage (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/disable-rollback clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/capabilities-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-instances-input/stack-instance-account (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-instances-input/stack-instance-region (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/region))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/max-results :portkey.aws.cloudformation.-2010-05-15.list-stack-instances-input/stack-instance-account :portkey.aws.cloudformation.-2010-05-15.list-stack-instances-input/stack-instance-region]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/url]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-to-skip (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]+|[a-zA-Z][-a-zA-Z0-9]*\.[a-zA-Z0-9]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/outputs (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/output))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-resource-detail]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-set-input/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/client-request-token :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15.create-stack-set-input/administration-role-arn :portkey.aws.cloudformation.-2010-05-15/execution-role-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/requires-recreation #{"Conditionally" "Always" :conditionally :never "Never" :always})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.parameter-declaration/default-value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameter-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-declaration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/parameter-key :portkey.aws.cloudformation.-2010-05-15.parameter-declaration/default-value :portkey.aws.cloudformation.-2010-05-15/parameter-type :portkey.aws.cloudformation.-2010-05-15/no-echo :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/parameter-constraints]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resources-to-skip (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/resource-to-skip))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-policy-during-update-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1350))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.template-parameter/default-value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameter-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/parameter-key :portkey.aws.cloudformation.-2010-05-15.template-parameter/default-value :portkey.aws.cloudformation.-2010-05-15/no-echo :portkey.aws.cloudformation.-2010-05-15/description]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-stack-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-instance-status #{:outdated "CURRENT" "OUTDATED" :inoperable "INOPERABLE" :current})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-status #{:rollback-failed :delete-failed "UPDATE_ROLLBACK_FAILED" "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" "REVIEW_IN_PROGRESS" :create-complete "ROLLBACK_FAILED" :rollback-in-progress :update-rollback-in-progress "DELETE_IN_PROGRESS" "UPDATE_IN_PROGRESS" "ROLLBACK_IN_PROGRESS" "CREATE_FAILED" :rollback-complete "DELETE_COMPLETE" "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" :update-complete :update-rollback-complete-cleanup-in-progress "CREATE_IN_PROGRESS" :delete-in-progress :create-failed :create-in-progress :delete-complete :update-rollback-complete "CREATE_COMPLETE" :update-rollback-failed "UPDATE_COMPLETE" "ROLLBACK_COMPLETE" :update-in-progress :update-complete-cleanup-in-progress :review-in-progress "DELETE_FAILED" "UPDATE_ROLLBACK_COMPLETE" "UPDATE_ROLLBACK_IN_PROGRESS"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.export/exporting-stack-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.export/name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/export-name))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.export/value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/export-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/export (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.export/exporting-stack-id :portkey.aws.cloudformation.-2010-05-15.export/name :portkey.aws.cloudformation.-2010-05-15.export/value]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/capabilities (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/capability))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/capability #{:capability-named-iam :capability-iam "CAPABILITY_NAMED_IAM" "CAPABILITY_IAM"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/transforms-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/transform-name))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stacks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stacks :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-instance-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-instance-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.create-change-set-input/stack-name :portkey.aws.cloudformation.-2010-05-15/change-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/notification-ar-ns :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/rollback-configuration :portkey.aws.cloudformation.-2010-05-15/role-arn :portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/change-set-type :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/use-previous-template :portkey.aws.cloudformation.-2010-05-15/resource-types :portkey.aws.cloudformation.-2010-05-15/client-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-status #{:delete-failed :create-complete "DELETE_IN_PROGRESS" "UPDATE_IN_PROGRESS" "CREATE_FAILED" "DELETE_COMPLETE" "DELETE_SKIPPED" :update-complete "CREATE_IN_PROGRESS" :update-failed :delete-in-progress :create-failed :create-in-progress :delete-complete "CREATE_COMPLETE" "UPDATE_COMPLETE" :update-in-progress :delete-skipped "DELETE_FAILED" "UPDATE_FAILED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-attribute #{:properties :tags "UpdatePolicy" "Tags" "CreationPolicy" :update-policy "Properties" "Metadata" :creation-policy :deletion-policy :metadata "DeletionPolicy"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/exports (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/export))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-instance]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-signal-status #{"SUCCESS" :failure "FAILURE" :success})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-action #{"DELETE" :create :update :delete "UPDATE" "CREATE"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stale-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/failure-tolerance-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-result-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-result-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-result-summary/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-result-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/account :portkey.aws.cloudformation.-2010-05-15/region :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-result-summary/status :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-result-summary/status-reason :portkey.aws.cloudformation.-2010-05-15/account-gate-result]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.account-limit/name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/limit-name))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.account-limit/value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/limit-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.account-limit/name :portkey.aws.cloudformation.-2010-05-15.account-limit/value]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/set-stack-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-policy-body :portkey.aws.cloudformation.-2010-05-15/stack-policy-url]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.update-stack-instances-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-imports-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/imports :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/operation-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-imports-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/export-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stacks (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/notification-ar-ns :portkey.aws.cloudformation.-2010-05-15/client-request-token :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/rollback-configuration :portkey.aws.cloudformation.-2010-05-15/role-arn :portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15/stack-policy-during-update-url :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/use-previous-template :portkey.aws.cloudformation.-2010-05-15/stack-policy-url :portkey.aws.cloudformation.-2010-05-15/resource-types :portkey.aws.cloudformation.-2010-05-15/stack-policy-body :portkey.aws.cloudformation.-2010-05-15/stack-policy-during-update-body]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/max-concurrent-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.change/type (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-type))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.change/type :portkey.aws.cloudformation.-2010-05-15/resource-change]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.resource-target-definition/attribute (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/resource-attribute))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.resource-target-definition/name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/property-name))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-target-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.resource-target-definition/attribute :portkey.aws.cloudformation.-2010-05-15.resource-target-definition/name :portkey.aws.cloudformation.-2010-05-15/requires-recreation]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/last-updated-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.parameter/resolved-value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameter-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/parameter-key :portkey.aws.cloudformation.-2010-05-15/parameter-value :portkey.aws.cloudformation.-2010-05-15/use-previous-value :portkey.aws.cloudformation.-2010-05-15.parameter/resolved-value]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/transform-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-summary/parent-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-summary/root-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/creation-time :portkey.aws.cloudformation.-2010-05-15/stack-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/deletion-time :portkey.aws.cloudformation.-2010-05-15.stack-summary/parent-id :portkey.aws.cloudformation.-2010-05-15/stack-status-reason :portkey.aws.cloudformation.-2010-05-15.stack-summary/root-id :portkey.aws.cloudformation.-2010-05-15/last-updated-time :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/template-description]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-set-operations-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.list-stack-set-operations-output/summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-termination-protection-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/enable-termination-protection :portkey.aws.cloudformation.-2010-05-15.update-termination-protection-input/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-declarations (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/parameter-declaration))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stacks-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/stack-status-filter]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-status #{:running :stopping :stopped "SUCCEEDED" "STOPPED" "FAILED" "STOPPING" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/parameters]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/execution-role-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z_0-9+=,.@-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-source #{"ResourceReference" :resource-reference :resource-attribute "ResourceAttribute" "ParameterReference" :parameter-reference "Automatic" :automatic :direct-modification "DirectModification"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-instances-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.create-stack-instances-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-set-operation-results-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-result-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.list-stack-set-operation-results-output/summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-change-details (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/resource-change-detail))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-set-operation-results-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15.list-stack-set-operation-results-input/operation-id] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/enable-termination-protection clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.get-template-output/stages-available (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stage-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-template-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15.get-template-output/stages-available]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-detail/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15.stack-resource-detail/last-updated-timestamp :portkey.aws.cloudformation.-2010-05-15/resource-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-status-reason :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/metadata :portkey.aws.cloudformation.-2010-05-15/stack-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/allowed-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-resources]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/use-previous-template clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/metadata (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/execute-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.get-template-summary-output/parameters (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameter-declarations))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.get-template-summary-output/declared-transforms (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/transforms-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-template-summary-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.get-template-summary-output/parameters :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/capabilities-reason :portkey.aws.cloudformation.-2010-05-15/resource-types :portkey.aws.cloudformation.-2010-05-15/version :portkey.aws.cloudformation.-2010-05-15/metadata :portkey.aws.cloudformation.-2010-05-15.get-template-summary-output/declared-transforms]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-policy-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1350))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/execution-status #{:execute-complete :execute-failed :unavailable "AVAILABLE" :obsolete "EXECUTE_FAILED" "EXECUTE_COMPLETE" "OBSOLETE" "UNAVAILABLE" "EXECUTE_IN_PROGRESS" :available :execute-in-progress})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-set-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.tag/key (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.tag/value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.tag/key :portkey.aws.cloudformation.-2010-05-15.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/replacement #{:true :false "False" "Conditional" "True" :conditional})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-change-sets-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-change-sets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.list-change-sets-output/summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/output-key :portkey.aws.cloudformation.-2010-05-15/output-value :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/export-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/no-echo clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-types (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/resource-type))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-policy-body]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/account))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-input/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/notification-ar-ns :portkey.aws.cloudformation.-2010-05-15/client-request-token :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/rollback-configuration :portkey.aws.cloudformation.-2010-05-15/role-arn :portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15.create-stack-input/timeout-in-minutes :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15/disable-rollback :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/enable-termination-protection :portkey.aws.cloudformation.-2010-05-15/stack-policy-url :portkey.aws.cloudformation.-2010-05-15/resource-types :portkey.aws.cloudformation.-2010-05-15/on-failure :portkey.aws.cloudformation.-2010-05-15/stack-policy-body]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/use-previous-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/created-but-modified-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-set-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.update-stack-set-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/output-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/event-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-change-set-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.describe-change-set-input/change-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15.describe-change-set-input/stack-name :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/max-concurrent-percentage (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-change-set-output/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-change-set-output/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-status-reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/notification-ar-ns :portkey.aws.cloudformation.-2010-05-15/rollback-configuration :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/change-set-name :portkey.aws.cloudformation.-2010-05-15/change-set-id :portkey.aws.cloudformation.-2010-05-15/changes :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15.describe-change-set-output/status :portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15.describe-change-set-output/status-reason :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/creation-time :portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/execution-status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/on-failure #{:rollback "DELETE" "DO_NOTHING" :delete "ROLLBACK" :do-nothing})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.resource-change-detail/target (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/resource-target-definition))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.resource-change-detail/evaluation (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/evaluation-type))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-change-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.resource-change-detail/target :portkey.aws.cloudformation.-2010-05-15.resource-change-detail/evaluation :portkey.aws.cloudformation.-2010-05-15/change-source :portkey.aws.cloudformation.-2010-05-15/causing-entity]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-change-sets-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-change-sets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.list-change-sets-input/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stop-stack-set-operation-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15.stop-stack-set-operation-input/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.continue-update-rollback-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.continue-update-rollback-input/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/role-arn :portkey.aws.cloudformation.-2010-05-15/resources-to-skip :portkey.aws.cloudformation.-2010-05-15/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-result-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-result-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/regions (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/accounts (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/account-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/regions :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/accounts :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/operation-id :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/administration-role-arn :portkey.aws.cloudformation.-2010-05-15/execution-role-name :portkey.aws.cloudformation.-2010-05-15/use-previous-template :portkey.aws.cloudformation.-2010-05-15.update-stack-set-input/operation-preferences]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/output-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-preferences/region-order (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-preferences (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.stack-set-operation-preferences/region-order :portkey.aws.cloudformation.-2010-05-15/failure-tolerance-count :portkey.aws.cloudformation.-2010-05-15/failure-tolerance-percentage :portkey.aws.cloudformation.-2010-05-15/max-concurrent-count :portkey.aws.cloudformation.-2010-05-15/max-concurrent-percentage]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-gate-status #{:skipped "SUCCEEDED" "FAILED" :failed :succeeded "SKIPPED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stage-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/template-stage))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack/parent-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack/root-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/creation-time :portkey.aws.cloudformation.-2010-05-15/stack-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/notification-ar-ns :portkey.aws.cloudformation.-2010-05-15/rollback-configuration :portkey.aws.cloudformation.-2010-05-15/role-arn :portkey.aws.cloudformation.-2010-05-15.stack/timeout-in-minutes :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/deletion-time :portkey.aws.cloudformation.-2010-05-15/change-set-id :portkey.aws.cloudformation.-2010-05-15.stack/parent-id :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15/disable-rollback :portkey.aws.cloudformation.-2010-05-15/outputs :portkey.aws.cloudformation.-2010-05-15/stack-status-reason :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15.stack/root-id :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/last-updated-time :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/enable-termination-protection]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-policy-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15.stack-set/status :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/stack-set-arn :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15.stack-set/administration-role-arn :portkey.aws.cloudformation.-2010-05-15/stack-set-id :portkey.aws.cloudformation.-2010-05-15/execution-role-name :portkey.aws.cloudformation.-2010-05-15/stack-set-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.get-template-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-template-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15.get-template-input/change-set-name :portkey.aws.cloudformation.-2010-05-15/template-stage]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/limit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/scope (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/resource-attribute))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-sets-input/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/max-results :portkey.aws.cloudformation.-2010-05-15.list-stack-sets-input/status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/monitoring-time-in-minutes (clojure.spec.alpha/int-in 0 180))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-gate-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-constraints (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/allowed-values]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15/timestamp :portkey.aws.cloudformation.-2010-05-15/resource-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-status-reason :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/stack-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.execute-change-set-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.execute-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/execute-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.execute-change-set-input/change-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15.execute-change-set-input/stack-name :portkey.aws.cloudformation.-2010-05-15/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-signal-unique-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-status-filter (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-status))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/limit-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/causing-entity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-policy-during-update-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15/stack-set-id :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15.stack-set-summary/status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-properties (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/timeout-minutes (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-parameters (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/template-parameter))

(clojure.core/defn continue-update-rollback ([continue-update-rollback-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-continue-update-rollback-input continue-update-rollback-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ContinueUpdateRollback", :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef continue-update-rollback :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-output))

(clojure.core/defn validate-template ([] (validate-template {})) ([validate-template-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-validate-template-input validate-template-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/validate-template-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/validate-template-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ValidateTemplate", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef validate-template :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/validate-template-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/validate-template-output))

(clojure.core/defn delete-stack-instances ([delete-stack-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-stack-instances-input delete-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStackInstances", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation.-2010-05-15/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef delete-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-output))

(clojure.core/defn delete-stack ([delete-stack-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-stack-input delete-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStack", :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef delete-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/delete-stack-input) :ret clojure.core/true?)

(clojure.core/defn create-stack-instances ([create-stack-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-stack-instances-input create-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStackInstances", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation.-2010-05-15/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception, "LimitExceededException" :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-output))

(clojure.core/defn describe-account-limits ([] (describe-account-limits {})) ([describe-account-limits-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-account-limits-input describe-account-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAccountLimits", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-output))

(clojure.core/defn list-change-sets ([list-change-sets-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-change-sets-input list-change-sets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-change-sets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-change-sets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListChangeSets", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-change-sets :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-change-sets-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-change-sets-output))

(clojure.core/defn describe-stack-resources ([] (describe-stack-resources {})) ([describe-stack-resources-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stack-resources-input describe-stack-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStackResources", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-resources :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-output))

(clojure.core/defn list-stack-sets ([] (list-stack-sets {})) ([list-stack-sets-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-stack-sets-input list-stack-sets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStackSets", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stack-sets :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-output))

(clojure.core/defn delete-change-set ([delete-change-set-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-change-set-input delete-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/delete-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/delete-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteChangeSet", :http.request.spec/error-spec {"InvalidChangeSetStatusException" :portkey.aws.cloudformation.-2010-05-15/invalid-change-set-status-exception}})))))
(clojure.spec.alpha/fdef delete-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/delete-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/delete-change-set-output))

(clojure.core/defn describe-stack-set ([describe-stack-set-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stack-set-input describe-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStackSet", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-output))

(clojure.core/defn update-stack ([update-stack-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-stack-input update-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStack", :http.request.spec/error-spec {"InsufficientCapabilitiesException" :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef update-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/update-stack-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/update-stack-output))

(clojure.core/defn list-imports ([list-imports-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-imports-input list-imports-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-imports-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-imports-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListImports", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-imports :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-imports-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-imports-output))

(clojure.core/defn get-stack-policy ([get-stack-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-stack-policy-input get-stack-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStackPolicy", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-stack-policy :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-output))

(clojure.core/defn cancel-update-stack ([cancel-update-stack-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-cancel-update-stack-input cancel-update-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/cancel-update-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelUpdateStack", :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef cancel-update-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/cancel-update-stack-input) :ret clojure.core/true?)

(clojure.core/defn list-stack-set-operation-results ([list-stack-set-operation-results-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-stack-set-operation-results-input list-stack-set-operation-results-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStackSetOperationResults", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation.-2010-05-15/operation-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-set-operation-results :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-output))

(clojure.core/defn create-stack-set ([create-stack-set-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-stack-set-input create-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStackSet", :http.request.spec/error-spec {"NameAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/name-already-exists-exception, "CreatedButModifiedException" :portkey.aws.cloudformation.-2010-05-15/created-but-modified-exception, "LimitExceededException" :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/create-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/create-stack-set-output))

(clojure.core/defn update-stack-instances ([update-stack-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-stack-instances-input update-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStackInstances", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-instance-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation.-2010-05-15/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef update-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-output))

(clojure.core/defn describe-stack-instance ([describe-stack-instance-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stack-instance-input describe-stack-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStackInstance", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-instance-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-instance :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-output))

(clojure.core/defn update-stack-set ([update-stack-set-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-stack-set-input update-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStackSet", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation.-2010-05-15/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-instance-not-found-exception}})))))
(clojure.spec.alpha/fdef update-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/update-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/update-stack-set-output))

(clojure.core/defn describe-change-set ([describe-change-set-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-change-set-input describe-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeChangeSet", :http.request.spec/error-spec {"ChangeSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/change-set-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-change-set-output))

(clojure.core/defn execute-change-set ([execute-change-set-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-execute-change-set-input execute-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/execute-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/execute-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ExecuteChangeSet", :http.request.spec/error-spec {"InvalidChangeSetStatusException" :portkey.aws.cloudformation.-2010-05-15/invalid-change-set-status-exception, "ChangeSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/change-set-not-found-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef execute-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/execute-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/execute-change-set-output))

(clojure.core/defn list-exports ([] (list-exports {})) ([list-exports-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-exports-input list-exports-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-exports-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-exports-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListExports", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-exports :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/list-exports-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-exports-output))

(clojure.core/defn create-stack ([create-stack-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-stack-input create-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStack", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/already-exists-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception}})))))
(clojure.spec.alpha/fdef create-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/create-stack-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/create-stack-output))

(clojure.core/defn list-stack-resources ([list-stack-resources-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-stack-resources-input list-stack-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStackResources", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stack-resources :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-output))

(clojure.core/defn list-stack-instances ([list-stack-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-stack-instances-input list-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStackInstances", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-output))

(clojure.core/defn describe-stack-set-operation ([describe-stack-set-operation-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stack-set-operation-input describe-stack-set-operation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStackSetOperation", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation.-2010-05-15/operation-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-set-operation :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-output))

(clojure.core/defn get-template-summary ([] (get-template-summary {})) ([get-template-summary-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-template-summary-input get-template-summary-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/get-template-summary-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/get-template-summary-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTemplateSummary", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef get-template-summary :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/get-template-summary-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/get-template-summary-output))

(clojure.core/defn set-stack-policy ([set-stack-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-stack-policy-input set-stack-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/set-stack-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetStackPolicy", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-stack-policy :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/set-stack-policy-input) :ret clojure.core/true?)

(clojure.core/defn list-stack-set-operations ([list-stack-set-operations-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-stack-set-operations-input list-stack-set-operations-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStackSetOperations", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-set-operations :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-output))

(clojure.core/defn describe-stacks ([] (describe-stacks {})) ([describe-stacks-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stacks-input describe-stacks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stacks-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stacks-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStacks", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stacks :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/describe-stacks-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stacks-output))

(clojure.core/defn delete-stack-set ([delete-stack-set-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-stack-set-input delete-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStackSet", :http.request.spec/error-spec {"StackSetNotEmptyException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-empty-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-output))

(clojure.core/defn list-stacks ([] (list-stacks {})) ([list-stacks-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-stacks-input list-stacks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stacks-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stacks-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStacks", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stacks :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/list-stacks-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stacks-output))

(clojure.core/defn describe-stack-events ([] (describe-stack-events {})) ([describe-stack-events-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stack-events-input describe-stack-events-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStackEvents", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-events :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-output))

(clojure.core/defn update-termination-protection ([update-termination-protection-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-termination-protection-input update-termination-protection-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTerminationProtection", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-termination-protection :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-output))

(clojure.core/defn create-change-set ([create-change-set-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-change-set-input create-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/create-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/create-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateChangeSet", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/already-exists-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception, "LimitExceededException" :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/create-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/create-change-set-output))

(clojure.core/defn signal-resource ([signal-resource-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-signal-resource-input signal-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/signal-resource-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SignalResource", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef signal-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/signal-resource-input) :ret clojure.core/true?)

(clojure.core/defn describe-stack-resource ([describe-stack-resource-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-stack-resource-input describe-stack-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStackResource", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-output))

(clojure.core/defn stop-stack-set-operation ([stop-stack-set-operation-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-stack-set-operation-input stop-stack-set-operation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopStackSetOperation", :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation.-2010-05-15/operation-not-found-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef stop-stack-set-operation :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-output))

(clojure.core/defn estimate-template-cost ([] (estimate-template-cost {})) ([estimate-template-cost-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-estimate-template-cost-input estimate-template-cost-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EstimateTemplateCost", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef estimate-template-cost :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-output))

(clojure.core/defn get-template ([] (get-template {})) ([get-template-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-template-input get-template-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/get-template-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/get-template-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTemplate", :http.request.spec/error-spec {"ChangeSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/change-set-not-found-exception}})))))
(clojure.spec.alpha/fdef get-template :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/get-template-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/get-template-output))
