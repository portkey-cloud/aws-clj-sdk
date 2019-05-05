(ns portkey.aws.cloudformation.-2010-05-15 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope
    {:service "cloudformation", :region "us-gov-east-1"},
    :ssl-common-name "cloudformation.us-gov-east-1.amazonaws.com",
    :endpoint "https://cloudformation.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope
    {:service "cloudformation", :region "eu-north-1"},
    :ssl-common-name "cloudformation.eu-north-1.amazonaws.com",
    :endpoint "https://cloudformation.eu-north-1.amazonaws.com",
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

(clojure.core/declare ser-stack-drift-detection-id)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-execution-role-name)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-enable-termination-protection)

(clojure.core/declare ser-use-previous-template)

(clojure.core/declare ser-stack-name)

(clojure.core/declare ser-stack-policy-url)

(clojure.core/declare ser-logical-resource-ids)

(clojure.core/declare ser-stack-set-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-boxed-max-results)

(clojure.core/declare ser-stack-resource-drift-status-filters)

(clojure.core/declare ser-resource-types)

(clojure.core/declare ser-account-list)

(clojure.core/declare ser-use-previous-value)

(clojure.core/declare ser-max-concurrent-percentage)

(clojure.core/declare ser-on-failure)

(clojure.core/declare ser-stack-resource-drift-status)

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

(clojure.core/defn- ser-capability [input] #:http.request.field{:value (clojure.core/get {"CAPABILITY_IAM" "CAPABILITY_IAM", :capability-iam "CAPABILITY_IAM", "CAPABILITY_NAMED_IAM" "CAPABILITY_NAMED_IAM", :capability-named-iam "CAPABILITY_NAMED_IAM", "CAPABILITY_AUTO_EXPAND" "CAPABILITY_AUTO_EXPAND", :capability-auto-expand "CAPABILITY_AUTO_EXPAND"} input), :shape "Capability"})

(clojure.core/defn- ser-resource-signal-status [input] #:http.request.field{:value (clojure.core/get {"SUCCESS" "SUCCESS", :success "SUCCESS", "FAILURE" "FAILURE", :failure "FAILURE"} input), :shape "ResourceSignalStatus"})

(clojure.core/defn- ser-failure-tolerance-count [input] #:http.request.field{:value input, :shape "FailureToleranceCount"})

(clojure.core/defn- ser-account [input] #:http.request.field{:value input, :shape "Account"})

(clojure.core/defn- ser-stack-name-or-id [input] #:http.request.field{:value input, :shape "StackNameOrId"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-change-set-name-or-id [input] #:http.request.field{:value input, :shape "ChangeSetNameOrId"})

(clojure.core/defn- ser-max-concurrent-count [input] #:http.request.field{:value input, :shape "MaxConcurrentCount"})

(clojure.core/defn- ser-parameter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Parameter", :type "structure"} (clojure.core/contains? input :parameter-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-key (input :parameter-key)) #:http.request.field{:name "ParameterKey", :shape "ParameterKey"})) (clojure.core/contains? input :parameter-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value (input :parameter-value)) #:http.request.field{:name "ParameterValue", :shape "ParameterValue"})) (clojure.core/contains? input :use-previous-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-previous-value (input :use-previous-value)) #:http.request.field{:name "UsePreviousValue", :shape "UsePreviousValue"})) (clojure.core/contains? input :resolved-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value (input :resolved-value)) #:http.request.field{:name "ResolvedValue", :shape "ParameterValue"}))))

(clojure.core/defn- ser-stack-drift-detection-id [input] #:http.request.field{:value input, :shape "StackDriftDetectionId"})

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value input, :shape "ResourceType"})

(clojure.core/defn- ser-execution-role-name [input] #:http.request.field{:value input, :shape "ExecutionRoleName"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-enable-termination-protection [input] #:http.request.field{:value input, :shape "EnableTerminationProtection"})

(clojure.core/defn- ser-use-previous-template [input] #:http.request.field{:value input, :shape "UsePreviousTemplate"})

(clojure.core/defn- ser-stack-name [input] #:http.request.field{:value input, :shape "StackName"})

(clojure.core/defn- ser-stack-policy-url [input] #:http.request.field{:value input, :shape "StackPolicyURL"})

(clojure.core/defn- ser-logical-resource-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-logical-resource-id coll) #:http.request.field{:shape "LogicalResourceId"}))) input), :shape "LogicalResourceIds", :type "list", :max 200, :min 1})

(clojure.core/defn- ser-stack-set-name [input] #:http.request.field{:value input, :shape "StackSetName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-boxed-max-results [input] #:http.request.field{:value input, :shape "BoxedMaxResults"})

(clojure.core/defn- ser-stack-resource-drift-status-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-stack-resource-drift-status coll) #:http.request.field{:shape "StackResourceDriftStatus"}))) input), :shape "StackResourceDriftStatusFilters", :type "list", :max 4, :min 1})

(clojure.core/defn- ser-resource-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-type coll) #:http.request.field{:shape "ResourceType"}))) input), :shape "ResourceTypes", :type "list"})

(clojure.core/defn- ser-account-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-account coll) #:http.request.field{:shape "Account"}))) input), :shape "AccountList", :type "list"})

(clojure.core/defn- ser-use-previous-value [input] #:http.request.field{:value input, :shape "UsePreviousValue"})

(clojure.core/defn- ser-max-concurrent-percentage [input] #:http.request.field{:value input, :shape "MaxConcurrentPercentage"})

(clojure.core/defn- ser-on-failure [input] #:http.request.field{:value (clojure.core/get {"DO_NOTHING" "DO_NOTHING", :do-nothing "DO_NOTHING", "ROLLBACK" "ROLLBACK", :rollback "ROLLBACK", "DELETE" "DELETE", :delete "DELETE"} input), :shape "OnFailure"})

(clojure.core/defn- ser-stack-resource-drift-status [input] #:http.request.field{:value (clojure.core/get {"IN_SYNC" "IN_SYNC", :in-sync "IN_SYNC", "MODIFIED" "MODIFIED", :modified "MODIFIED", "DELETED" "DELETED", :deleted "DELETED", "NOT_CHECKED" "NOT_CHECKED", :not-checked "NOT_CHECKED"} input), :shape "StackResourceDriftStatus"})

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

(clojure.core/defn- req-detect-stack-resource-drift-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"}) (clojure.core/into (ser-logical-resource-id (input :logical-resource-id)) #:http.request.field{:name "LogicalResourceId", :shape "LogicalResourceId"})]}))

(clojure.core/defn- req-list-exports-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-create-stack-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"}) (clojure.core/into (ser-account-list (input :accounts)) #:http.request.field{:name "Accounts", :shape "AccountList"}) (clojure.core/into (ser-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "RegionList"})]} (clojure.core/contains? input :parameter-overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameter-overrides)) #:http.request.field{:name "ParameterOverrides", :shape "Parameters"})) (clojure.core/contains? input :operation-preferences) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-operation-preferences (input :operation-preferences)) #:http.request.field{:name "OperationPreferences", :shape "StackSetOperationPreferences"})) (clojure.core/contains? input :operation-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-describe-account-limits-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-stack-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :stack-instance-account) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account (input :stack-instance-account)) #:http.request.field{:name "StackInstanceAccount", :shape "Account"})) (clojure.core/contains? input :stack-instance-region) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-region (input :stack-instance-region)) #:http.request.field{:name "StackInstanceRegion", :shape "Region"}))))

(clojure.core/defn- req-create-stack-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-set-name (input :stack-set-name)) #:http.request.field{:name "StackSetName", :shape "StackSetName"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-capabilities (input :capabilities)) #:http.request.field{:name "Capabilities", :shape "Capabilities"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :administration-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :administration-role-arn)) #:http.request.field{:name "AdministrationRoleARN", :shape "RoleARN"})) (clojure.core/contains? input :execution-role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-role-name (input :execution-role-name)) #:http.request.field{:name "ExecutionRoleName", :shape "ExecutionRoleName"}))))

(clojure.core/defn- req-describe-stack-resource-drifts-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})]} (clojure.core/contains? input :stack-resource-drift-status-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-resource-drift-status-filters (input :stack-resource-drift-status-filters)) #:http.request.field{:name "StackResourceDriftStatusFilters", :shape "StackResourceDriftStatusFilters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxedMaxResults"}))))

(clojure.core/defn- req-create-change-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"}) (clojure.core/into (ser-change-set-name (input :change-set-name)) #:http.request.field{:name "ChangeSetName", :shape "ChangeSetName"})]} (clojure.core/contains? input :notification-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-ar-ns (input :notification-ar-ns)) #:http.request.field{:name "NotificationARNs", :shape "NotificationARNs"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-url (input :template-url)) #:http.request.field{:name "TemplateURL", :shape "TemplateURL"})) (clojure.core/contains? input :rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rollback-configuration (input :rollback-configuration)) #:http.request.field{:name "RollbackConfiguration", :shape "RollbackConfiguration"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "TemplateBody"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :change-set-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-change-set-type (input :change-set-type)) #:http.request.field{:name "ChangeSetType", :shape "ChangeSetType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-capabilities (input :capabilities)) #:http.request.field{:name "Capabilities", :shape "Capabilities"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :use-previous-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-previous-template (input :use-previous-template)) #:http.request.field{:name "UsePreviousTemplate", :shape "UsePreviousTemplate"})) (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-types (input :resource-types)) #:http.request.field{:name "ResourceTypes", :shape "ResourceTypes"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken"}))))

(clojure.core/defn- req-detect-stack-drift-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})]} (clojure.core/contains? input :logical-resource-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logical-resource-ids (input :logical-resource-ids)) #:http.request.field{:name "LogicalResourceIds", :shape "LogicalResourceIds"}))))

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

(clojure.core/defn- req-describe-stack-drift-detection-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stack-drift-detection-id (input :stack-drift-detection-id)) #:http.request.field{:name "StackDriftDetectionId", :shape "StackDriftDetectionId"})]}))

(clojure.core/defn- req-get-template-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackName"})) (clojure.core/contains? input :change-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-change-set-name-or-id (input :change-set-name)) #:http.request.field{:name "ChangeSetName", :shape "ChangeSetNameOrId"})) (clojure.core/contains? input :template-stage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-stage (input :template-stage)) #:http.request.field{:name "TemplateStage", :shape "TemplateStage"}))))

(clojure.core/defn- req-list-stack-sets-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-status (input :status)) #:http.request.field{:name "Status", :shape "StackSetStatus"}))))

(clojure.core/defn- req-execute-change-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-change-set-name-or-id (input :change-set-name)) #:http.request.field{:name "ChangeSetName", :shape "ChangeSetNameOrId"})]} (clojure.core/contains? input :stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-name-or-id (input :stack-name)) #:http.request.field{:name "StackName", :shape "StackNameOrId"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"}))))

(clojure.core/declare deser-resource-change)

(clojure.core/declare deser-notification-ar-ns)

(clojure.core/declare deser-stack-resource-summary)

(clojure.core/declare deser-physical-resource-id)

(clojure.core/declare deser-change-set-status)

(clojure.core/declare deser-imports)

(clojure.core/declare deser-stack-resource-drifts)

(clojure.core/declare deser-change-type)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-rollback-configuration)

(clojure.core/declare deser-logical-resource-id)

(clojure.core/declare deser-stack-set-status)

(clojure.core/declare deser-parameter-type)

(clojure.core/declare deser-account-limit-list)

(clojure.core/declare deser-stack-resources)

(clojure.core/declare deser-change-set-summaries)

(clojure.core/declare deser-parameter-key)

(clojure.core/declare deser-type)

(clojure.core/declare deser-stack-drift-status)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-property-name)

(clojure.core/declare deser-account-gate-result)

(clojure.core/declare deser-export-name)

(clojure.core/declare deser-stack-events)

(clojure.core/declare deser-change-set-summary)

(clojure.core/declare deser-stack-set-operation-result-status)

(clojure.core/declare deser-export-value)

(clojure.core/declare deser-template-body)

(clojure.core/declare deser-stack-resource-summaries)

(clojure.core/declare deser-stack-set-operation-summary)

(clojure.core/declare deser-parameters)

(clojure.core/declare deser-rollback-triggers)

(clojure.core/declare deser-stack-resource-drift)

(clojure.core/declare deser-boxed-integer)

(clojure.core/declare deser-stack-instance-summary)

(clojure.core/declare deser-stack-instance)

(clojure.core/declare deser-retain-stacks-nullable)

(clojure.core/declare deser-change-action)

(clojure.core/declare deser-change-set-name)

(clojure.core/declare deser-allowed-values)

(clojure.core/declare deser-rollback-trigger)

(clojure.core/declare deser-region-list)

(clojure.core/declare deser-deletion-time)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-change-set-id)

(clojure.core/declare deser-changes)

(clojure.core/declare deser-stack-event)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-evaluation-type)

(clojure.core/declare deser-template-stage)

(clojure.core/declare deser-notification-arn)

(clojure.core/declare deser-stack-set-operation)

(clojure.core/declare deser-failure-tolerance-percentage)

(clojure.core/declare deser-disable-rollback)

(clojure.core/declare deser-capabilities-reason)

(clojure.core/declare deser-outputs)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-stack-resource-drift-information)

(clojure.core/declare deser-requires-recreation)

(clojure.core/declare deser-parameter-declaration)

(clojure.core/declare deser-property-value)

(clojure.core/declare deser-stack-status-reason)

(clojure.core/declare deser-stack-resource-drift-information-summary)

(clojure.core/declare deser-key)

(clojure.core/declare deser-template-parameter)

(clojure.core/declare deser-resource-status-reason)

(clojure.core/declare deser-stack-instance-status)

(clojure.core/declare deser-stack-status)

(clojure.core/declare deser-export)

(clojure.core/declare deser-capabilities)

(clojure.core/declare deser-capability)

(clojure.core/declare deser-transforms-list)

(clojure.core/declare deser-physical-resource-id-context-key-value-pair)

(clojure.core/declare deser-stack-instance-summaries)

(clojure.core/declare deser-resource-status)

(clojure.core/declare deser-resource-attribute)

(clojure.core/declare deser-exports)

(clojure.core/declare deser-physical-resource-id-context)

(clojure.core/declare deser-stack-set-arn)

(clojure.core/declare deser-stack-set-operation-action)

(clojure.core/declare deser-value)

(clojure.core/declare deser-stack-drift-information)

(clojure.core/declare deser-failure-tolerance-count)

(clojure.core/declare deser-account)

(clojure.core/declare deser-stack-set-operation-result-summary)

(clojure.core/declare deser-stack-drift-detection-status)

(clojure.core/declare deser-url)

(clojure.core/declare deser-account-limit)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-properties)

(clojure.core/declare deser-property-path)

(clojure.core/declare deser-stacks)

(clojure.core/declare deser-max-concurrent-count)

(clojure.core/declare deser-change)

(clojure.core/declare deser-resource-target-definition)

(clojure.core/declare deser-last-updated-time)

(clojure.core/declare deser-parameter)

(clojure.core/declare deser-stack-drift-detection-id)

(clojure.core/declare deser-stack-id)

(clojure.core/declare deser-transform-name)

(clojure.core/declare deser-stack-summary)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-stack-set-id)

(clojure.core/declare deser-parameter-declarations)

(clojure.core/declare deser-stack-set-operation-status)

(clojure.core/declare deser-property-differences)

(clojure.core/declare deser-execution-role-name)

(clojure.core/declare deser-change-source)

(clojure.core/declare deser-change-set-status-reason)

(clojure.core/declare deser-creation-time)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-resource-change-details)

(clojure.core/declare deser-property-difference)

(clojure.core/declare deser-enable-termination-protection)

(clojure.core/declare deser-stack-resource-detail)

(clojure.core/declare deser-allowed-value)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-metadata)

(clojure.core/declare deser-stack-name)

(clojure.core/declare deser-execution-status)

(clojure.core/declare deser-stack-set-name)

(clojure.core/declare deser-stack-drift-detection-status-reason)

(clojure.core/declare deser-stack-set-summaries)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-stack-summaries)

(clojure.core/declare deser-reason)

(clojure.core/declare deser-version)

(clojure.core/declare deser-replacement)

(clojure.core/declare deser-difference-type)

(clojure.core/declare deser-stack-set-operation-summaries)

(clojure.core/declare deser-output)

(clojure.core/declare deser-no-echo)

(clojure.core/declare deser-resource-types)

(clojure.core/declare deser-template-description)

(clojure.core/declare deser-use-previous-value)

(clojure.core/declare deser-output-value)

(clojure.core/declare deser-event-id)

(clojure.core/declare deser-max-concurrent-percentage)

(clojure.core/declare deser-resource-change-detail)

(clojure.core/declare deser-stack-resource-drift-status)

(clojure.core/declare deser-stack-set-operation-result-summaries)

(clojure.core/declare deser-output-key)

(clojure.core/declare deser-stack-set-operation-preferences)

(clojure.core/declare deser-account-gate-status)

(clojure.core/declare deser-stage-list)

(clojure.core/declare deser-stack)

(clojure.core/declare deser-stack-policy-body)

(clojure.core/declare deser-stack-set)

(clojure.core/declare deser-stack-drift-information-summary)

(clojure.core/declare deser-limit-name)

(clojure.core/declare deser-region)

(clojure.core/declare deser-scope)

(clojure.core/declare deser-monitoring-time-in-minutes)

(clojure.core/declare deser-account-gate-status-reason)

(clojure.core/declare deser-parameter-constraints)

(clojure.core/declare deser-stack-resource)

(clojure.core/declare deser-parameter-value)

(clojure.core/declare deser-limit-value)

(clojure.core/declare deser-causing-entity)

(clojure.core/declare deser-stack-set-summary)

(clojure.core/declare deser-resource-properties)

(clojure.core/declare deser-timeout-minutes)

(clojure.core/declare deser-template-parameters)

(clojure.core/defn- deser-resource-change [input] (clojure.core/let [letvar211486 {"Action" (portkey.aws/search-for-tag input "Action" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Replacement" (portkey.aws/search-for-tag input "Replacement" :flattened? nil :xmlAttribute? nil), "Scope" (portkey.aws/search-for-tag input "Scope" :flattened? nil :xmlAttribute? nil), "Details" (portkey.aws/search-for-tag input "Details" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar211486 "Action") (clojure.core/assoc :action (deser-change-action (clojure.core/get-in letvar211486 ["Action" :content]))) (letvar211486 "LogicalResourceId") (clojure.core/assoc :logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar211486 ["LogicalResourceId" :content]))) (letvar211486 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar211486 ["PhysicalResourceId" :content]))) (letvar211486 "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar211486 ["ResourceType" :content]))) (letvar211486 "Replacement") (clojure.core/assoc :replacement (deser-replacement (clojure.core/get-in letvar211486 ["Replacement" :content]))) (letvar211486 "Scope") (clojure.core/assoc :scope (deser-scope (clojure.core/get-in letvar211486 ["Scope" :content]))) (letvar211486 "Details") (clojure.core/assoc :details (deser-resource-change-details (clojure.core/get-in letvar211486 ["Details" :content]))))))

(clojure.core/defn- deser-notification-ar-ns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notification-arn coll))) input))

(clojure.core/defn- deser-stack-resource-summary [input] (clojure.core/let [letvar211611 {"LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "LastUpdatedTimestamp" (portkey.aws/search-for-tag input "LastUpdatedTimestamp" :flattened? nil :xmlAttribute? nil), "ResourceStatus" (portkey.aws/search-for-tag input "ResourceStatus" :flattened? nil :xmlAttribute? nil), "ResourceStatusReason" (portkey.aws/search-for-tag input "ResourceStatusReason" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar211611 ["LogicalResourceId" :content])), :resource-type (deser-resource-type (clojure.core/get-in letvar211611 ["ResourceType" :content])), :last-updated-timestamp (deser-timestamp (clojure.core/get-in letvar211611 ["LastUpdatedTimestamp" :content])), :resource-status (deser-resource-status (clojure.core/get-in letvar211611 ["ResourceStatus" :content]))} (letvar211611 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar211611 ["PhysicalResourceId" :content]))) (letvar211611 "ResourceStatusReason") (clojure.core/assoc :resource-status-reason (deser-resource-status-reason (clojure.core/get-in letvar211611 ["ResourceStatusReason" :content]))) (letvar211611 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-resource-drift-information-summary (clojure.core/get-in letvar211611 ["DriftInformation" :content]))))))

(clojure.core/defn- deser-physical-resource-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-change-set-status [input] (clojure.core/get {"CREATE_PENDING" :create-pending, "CREATE_IN_PROGRESS" :create-in-progress, "CREATE_COMPLETE" :create-complete, "DELETE_COMPLETE" :delete-complete, "FAILED" :failed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-imports [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-name coll))) input))

(clojure.core/defn- deser-stack-resource-drifts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-resource-drift coll))) input))

(clojure.core/defn- deser-change-type [input] (clojure.core/get {"Resource" :resource} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-client-request-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-rollback-configuration [input] (clojure.core/let [letvar211773 {"RollbackTriggers" (portkey.aws/search-for-tag input "RollbackTriggers" :flattened? nil :xmlAttribute? nil), "MonitoringTimeInMinutes" (portkey.aws/search-for-tag input "MonitoringTimeInMinutes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar211773 "RollbackTriggers") (clojure.core/assoc :rollback-triggers (deser-rollback-triggers (clojure.core/get-in letvar211773 ["RollbackTriggers" :content]))) (letvar211773 "MonitoringTimeInMinutes") (clojure.core/assoc :monitoring-time-in-minutes (deser-monitoring-time-in-minutes (clojure.core/get-in letvar211773 ["MonitoringTimeInMinutes" :content]))))))

(clojure.core/defn- deser-logical-resource-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-status [input] (clojure.core/get {"ACTIVE" :active, "DELETED" :deleted} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-parameter-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-account-limit-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account-limit coll))) input))

(clojure.core/defn- deser-stack-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-resource coll))) input))

(clojure.core/defn- deser-change-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-change-set-summary coll))) input))

(clojure.core/defn- deser-parameter-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-drift-status [input] (clojure.core/get {"DRIFTED" :drifted, "IN_SYNC" :in-sync, "UNKNOWN" :unknown, "NOT_CHECKED" :not-checked} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-role-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-property-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-account-gate-result [input] (clojure.core/let [letvar211972 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar211972 "Status") (clojure.core/assoc :status (deser-account-gate-status (clojure.core/get-in letvar211972 ["Status" :content]))) (letvar211972 "StatusReason") (clojure.core/assoc :status-reason (deser-account-gate-status-reason (clojure.core/get-in letvar211972 ["StatusReason" :content]))))))

(clojure.core/defn- deser-export-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-events [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-event coll))) input))

(clojure.core/defn- deser-change-set-summary [input] (clojure.core/let [letvar212102 {"ChangeSetName" (portkey.aws/search-for-tag input "ChangeSetName" :flattened? nil :xmlAttribute? nil), "ChangeSetId" (portkey.aws/search-for-tag input "ChangeSetId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "CreationTime" (portkey.aws/search-for-tag input "CreationTime" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil), "ExecutionStatus" (portkey.aws/search-for-tag input "ExecutionStatus" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar212102 "ChangeSetName") (clojure.core/assoc :change-set-name (deser-change-set-name (clojure.core/get-in letvar212102 ["ChangeSetName" :content]))) (letvar212102 "ChangeSetId") (clojure.core/assoc :change-set-id (deser-change-set-id (clojure.core/get-in letvar212102 ["ChangeSetId" :content]))) (letvar212102 "Status") (clojure.core/assoc :status (deser-change-set-status (clojure.core/get-in letvar212102 ["Status" :content]))) (letvar212102 "StatusReason") (clojure.core/assoc :status-reason (deser-change-set-status-reason (clojure.core/get-in letvar212102 ["StatusReason" :content]))) (letvar212102 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar212102 ["Description" :content]))) (letvar212102 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar212102 ["StackId" :content]))) (letvar212102 "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (clojure.core/get-in letvar212102 ["CreationTime" :content]))) (letvar212102 "StackName") (clojure.core/assoc :stack-name (deser-stack-name (clojure.core/get-in letvar212102 ["StackName" :content]))) (letvar212102 "ExecutionStatus") (clojure.core/assoc :execution-status (deser-execution-status (clojure.core/get-in letvar212102 ["ExecutionStatus" :content]))))))

(clojure.core/defn- deser-stack-set-operation-result-status [input] (clojure.core/get {"PENDING" :pending, "RUNNING" :running, "SUCCEEDED" :succeeded, "FAILED" :failed, "CANCELLED" :cancelled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-export-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-template-body [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-resource-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-resource-summary coll))) input))

(clojure.core/defn- deser-stack-set-operation-summary [input] (clojure.core/let [letvar212242 {"OperationId" (portkey.aws/search-for-tag input "OperationId" :flattened? nil :xmlAttribute? nil), "Action" (portkey.aws/search-for-tag input "Action" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreationTimestamp" (portkey.aws/search-for-tag input "CreationTimestamp" :flattened? nil :xmlAttribute? nil), "EndTimestamp" (portkey.aws/search-for-tag input "EndTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar212242 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar212242 ["OperationId" :content]))) (letvar212242 "Action") (clojure.core/assoc :action (deser-stack-set-operation-action (clojure.core/get-in letvar212242 ["Action" :content]))) (letvar212242 "Status") (clojure.core/assoc :status (deser-stack-set-operation-status (clojure.core/get-in letvar212242 ["Status" :content]))) (letvar212242 "CreationTimestamp") (clojure.core/assoc :creation-timestamp (deser-timestamp (clojure.core/get-in letvar212242 ["CreationTimestamp" :content]))) (letvar212242 "EndTimestamp") (clojure.core/assoc :end-timestamp (deser-timestamp (clojure.core/get-in letvar212242 ["EndTimestamp" :content]))))))

(clojure.core/defn- deser-parameters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter coll))) input))

(clojure.core/defn- deser-rollback-triggers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rollback-trigger coll))) input))

(clojure.core/defn- deser-stack-resource-drift [input] (clojure.core/let [letvar212384 {"PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "ActualProperties" (portkey.aws/search-for-tag input "ActualProperties" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "PhysicalResourceIdContext" (portkey.aws/search-for-tag input "PhysicalResourceIdContext" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "PropertyDifferences" (portkey.aws/search-for-tag input "PropertyDifferences" :flattened? nil :xmlAttribute? nil), "Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "StackResourceDriftStatus" (portkey.aws/search-for-tag input "StackResourceDriftStatus" :flattened? nil :xmlAttribute? nil), "ExpectedProperties" (portkey.aws/search-for-tag input "ExpectedProperties" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-id (deser-stack-id (clojure.core/get-in letvar212384 ["StackId" :content])), :logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar212384 ["LogicalResourceId" :content])), :resource-type (deser-resource-type (clojure.core/get-in letvar212384 ["ResourceType" :content])), :stack-resource-drift-status (deser-stack-resource-drift-status (clojure.core/get-in letvar212384 ["StackResourceDriftStatus" :content])), :timestamp (deser-timestamp (clojure.core/get-in letvar212384 ["Timestamp" :content]))} (letvar212384 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar212384 ["PhysicalResourceId" :content]))) (letvar212384 "ActualProperties") (clojure.core/assoc :actual-properties (deser-properties (clojure.core/get-in letvar212384 ["ActualProperties" :content]))) (letvar212384 "PhysicalResourceIdContext") (clojure.core/assoc :physical-resource-id-context (deser-physical-resource-id-context (clojure.core/get-in letvar212384 ["PhysicalResourceIdContext" :content]))) (letvar212384 "PropertyDifferences") (clojure.core/assoc :property-differences (deser-property-differences (clojure.core/get-in letvar212384 ["PropertyDifferences" :content]))) (letvar212384 "ExpectedProperties") (clojure.core/assoc :expected-properties (deser-properties (clojure.core/get-in letvar212384 ["ExpectedProperties" :content]))))))

(clojure.core/defn- deser-boxed-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-instance-summary [input] (clojure.core/let [letvar212494 {"StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "Account" (portkey.aws/search-for-tag input "Account" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar212494 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar212494 ["StackSetId" :content]))) (letvar212494 "Region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar212494 ["Region" :content]))) (letvar212494 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar212494 ["Account" :content]))) (letvar212494 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar212494 ["StackId" :content]))) (letvar212494 "Status") (clojure.core/assoc :status (deser-stack-instance-status (clojure.core/get-in letvar212494 ["Status" :content]))) (letvar212494 "StatusReason") (clojure.core/assoc :status-reason (deser-reason (clojure.core/get-in letvar212494 ["StatusReason" :content]))))))

(clojure.core/defn- deser-stack-instance [input] (clojure.core/let [letvar212602 {"StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "Account" (portkey.aws/search-for-tag input "Account" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ParameterOverrides" (portkey.aws/search-for-tag input "ParameterOverrides" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar212602 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar212602 ["StackSetId" :content]))) (letvar212602 "Region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar212602 ["Region" :content]))) (letvar212602 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar212602 ["Account" :content]))) (letvar212602 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar212602 ["StackId" :content]))) (letvar212602 "ParameterOverrides") (clojure.core/assoc :parameter-overrides (deser-parameters (clojure.core/get-in letvar212602 ["ParameterOverrides" :content]))) (letvar212602 "Status") (clojure.core/assoc :status (deser-stack-instance-status (clojure.core/get-in letvar212602 ["Status" :content]))) (letvar212602 "StatusReason") (clojure.core/assoc :status-reason (deser-reason (clojure.core/get-in letvar212602 ["StatusReason" :content]))))))

(clojure.core/defn- deser-retain-stacks-nullable [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-change-action [input] (clojure.core/get {"Add" :add, "Modify" :modify, "Remove" :remove} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-change-set-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-value coll))) input))

(clojure.core/defn- deser-rollback-trigger [input] (clojure.core/let [letvar212739 {"Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:arn (deser-arn (clojure.core/get-in letvar212739 ["Arn" :content])), :type (deser-type (clojure.core/get-in letvar212739 ["Type" :content]))})))

(clojure.core/defn- deser-region-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-region coll))) input))

(clojure.core/defn- deser-deletion-time [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-change-set-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-changes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-change coll))) input))

(clojure.core/defn- deser-stack-event [input] (clojure.core/let [letvar212893 {"PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "ClientRequestToken" (portkey.aws/search-for-tag input "ClientRequestToken" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceStatusReason" (portkey.aws/search-for-tag input "ResourceStatusReason" :flattened? nil :xmlAttribute? nil), "ResourceStatus" (portkey.aws/search-for-tag input "ResourceStatus" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil), "EventId" (portkey.aws/search-for-tag input "EventId" :flattened? nil :xmlAttribute? nil), "ResourceProperties" (portkey.aws/search-for-tag input "ResourceProperties" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-id (deser-stack-id (clojure.core/get-in letvar212893 ["StackId" :content])), :event-id (deser-event-id (clojure.core/get-in letvar212893 ["EventId" :content])), :stack-name (deser-stack-name (clojure.core/get-in letvar212893 ["StackName" :content])), :timestamp (deser-timestamp (clojure.core/get-in letvar212893 ["Timestamp" :content]))} (letvar212893 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar212893 ["PhysicalResourceId" :content]))) (letvar212893 "ClientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar212893 ["ClientRequestToken" :content]))) (letvar212893 "LogicalResourceId") (clojure.core/assoc :logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar212893 ["LogicalResourceId" :content]))) (letvar212893 "ResourceStatusReason") (clojure.core/assoc :resource-status-reason (deser-resource-status-reason (clojure.core/get-in letvar212893 ["ResourceStatusReason" :content]))) (letvar212893 "ResourceStatus") (clojure.core/assoc :resource-status (deser-resource-status (clojure.core/get-in letvar212893 ["ResourceStatus" :content]))) (letvar212893 "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar212893 ["ResourceType" :content]))) (letvar212893 "ResourceProperties") (clojure.core/assoc :resource-properties (deser-resource-properties (clojure.core/get-in letvar212893 ["ResourceProperties" :content]))))))

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-evaluation-type [input] (clojure.core/get {"Static" :static, "Dynamic" :dynamic} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-template-stage [input] (clojure.core/get {"Original" :original, "Processed" :processed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-notification-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-operation [input] (clojure.core/let [letvar213033 {"EndTimestamp" (portkey.aws/search-for-tag input "EndTimestamp" :flattened? nil :xmlAttribute? nil), "RetainStacks" (portkey.aws/search-for-tag input "RetainStacks" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreationTimestamp" (portkey.aws/search-for-tag input "CreationTimestamp" :flattened? nil :xmlAttribute? nil), "OperationId" (portkey.aws/search-for-tag input "OperationId" :flattened? nil :xmlAttribute? nil), "AdministrationRoleARN" (portkey.aws/search-for-tag input "AdministrationRoleARN" :flattened? nil :xmlAttribute? nil), "StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "ExecutionRoleName" (portkey.aws/search-for-tag input "ExecutionRoleName" :flattened? nil :xmlAttribute? nil), "OperationPreferences" (portkey.aws/search-for-tag input "OperationPreferences" :flattened? nil :xmlAttribute? nil), "Action" (portkey.aws/search-for-tag input "Action" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar213033 "EndTimestamp") (clojure.core/assoc :end-timestamp (deser-timestamp (clojure.core/get-in letvar213033 ["EndTimestamp" :content]))) (letvar213033 "RetainStacks") (clojure.core/assoc :retain-stacks (deser-retain-stacks-nullable (clojure.core/get-in letvar213033 ["RetainStacks" :content]))) (letvar213033 "Status") (clojure.core/assoc :status (deser-stack-set-operation-status (clojure.core/get-in letvar213033 ["Status" :content]))) (letvar213033 "CreationTimestamp") (clojure.core/assoc :creation-timestamp (deser-timestamp (clojure.core/get-in letvar213033 ["CreationTimestamp" :content]))) (letvar213033 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar213033 ["OperationId" :content]))) (letvar213033 "AdministrationRoleARN") (clojure.core/assoc :administration-role-arn (deser-role-arn (clojure.core/get-in letvar213033 ["AdministrationRoleARN" :content]))) (letvar213033 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar213033 ["StackSetId" :content]))) (letvar213033 "ExecutionRoleName") (clojure.core/assoc :execution-role-name (deser-execution-role-name (clojure.core/get-in letvar213033 ["ExecutionRoleName" :content]))) (letvar213033 "OperationPreferences") (clojure.core/assoc :operation-preferences (deser-stack-set-operation-preferences (clojure.core/get-in letvar213033 ["OperationPreferences" :content]))) (letvar213033 "Action") (clojure.core/assoc :action (deser-stack-set-operation-action (clojure.core/get-in letvar213033 ["Action" :content]))))))

(clojure.core/defn- deser-failure-tolerance-percentage [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-disable-rollback [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-capabilities-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-outputs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output coll))) input))

(clojure.core/defn- deser-next-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-resource-drift-information [input] (clojure.core/let [letvar213172 {"StackResourceDriftStatus" (portkey.aws/search-for-tag input "StackResourceDriftStatus" :flattened? nil :xmlAttribute? nil), "LastCheckTimestamp" (portkey.aws/search-for-tag input "LastCheckTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-resource-drift-status (deser-stack-resource-drift-status (clojure.core/get-in letvar213172 ["StackResourceDriftStatus" :content]))} (letvar213172 "LastCheckTimestamp") (clojure.core/assoc :last-check-timestamp (deser-timestamp (clojure.core/get-in letvar213172 ["LastCheckTimestamp" :content]))))))

(clojure.core/defn- deser-requires-recreation [input] (clojure.core/get {"Never" :never, "Conditionally" :conditionally, "Always" :always} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-parameter-declaration [input] (clojure.core/let [letvar213285 {"ParameterKey" (portkey.aws/search-for-tag input "ParameterKey" :flattened? nil :xmlAttribute? nil), "DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "ParameterType" (portkey.aws/search-for-tag input "ParameterType" :flattened? nil :xmlAttribute? nil), "NoEcho" (portkey.aws/search-for-tag input "NoEcho" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "ParameterConstraints" (portkey.aws/search-for-tag input "ParameterConstraints" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar213285 "ParameterKey") (clojure.core/assoc :parameter-key (deser-parameter-key (clojure.core/get-in letvar213285 ["ParameterKey" :content]))) (letvar213285 "DefaultValue") (clojure.core/assoc :default-value (deser-parameter-value (clojure.core/get-in letvar213285 ["DefaultValue" :content]))) (letvar213285 "ParameterType") (clojure.core/assoc :parameter-type (deser-parameter-type (clojure.core/get-in letvar213285 ["ParameterType" :content]))) (letvar213285 "NoEcho") (clojure.core/assoc :no-echo (deser-no-echo (clojure.core/get-in letvar213285 ["NoEcho" :content]))) (letvar213285 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar213285 ["Description" :content]))) (letvar213285 "ParameterConstraints") (clojure.core/assoc :parameter-constraints (deser-parameter-constraints (clojure.core/get-in letvar213285 ["ParameterConstraints" :content]))))))

(clojure.core/defn- deser-property-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-resource-drift-information-summary [input] (clojure.core/let [letvar213403 {"StackResourceDriftStatus" (portkey.aws/search-for-tag input "StackResourceDriftStatus" :flattened? nil :xmlAttribute? nil), "LastCheckTimestamp" (portkey.aws/search-for-tag input "LastCheckTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-resource-drift-status (deser-stack-resource-drift-status (clojure.core/get-in letvar213403 ["StackResourceDriftStatus" :content]))} (letvar213403 "LastCheckTimestamp") (clojure.core/assoc :last-check-timestamp (deser-timestamp (clojure.core/get-in letvar213403 ["LastCheckTimestamp" :content]))))))

(clojure.core/defn- deser-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-template-parameter [input] (clojure.core/let [letvar213516 {"ParameterKey" (portkey.aws/search-for-tag input "ParameterKey" :flattened? nil :xmlAttribute? nil), "DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "NoEcho" (portkey.aws/search-for-tag input "NoEcho" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar213516 "ParameterKey") (clojure.core/assoc :parameter-key (deser-parameter-key (clojure.core/get-in letvar213516 ["ParameterKey" :content]))) (letvar213516 "DefaultValue") (clojure.core/assoc :default-value (deser-parameter-value (clojure.core/get-in letvar213516 ["DefaultValue" :content]))) (letvar213516 "NoEcho") (clojure.core/assoc :no-echo (deser-no-echo (clojure.core/get-in letvar213516 ["NoEcho" :content]))) (letvar213516 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar213516 ["Description" :content]))))))

(clojure.core/defn- deser-resource-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-instance-status [input] (clojure.core/get {"CURRENT" :current, "OUTDATED" :outdated, "INOPERABLE" :inoperable} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-status [input] (clojure.core/get {"UPDATE_ROLLBACK_FAILED" :update-rollback-failed, "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" :update-complete-cleanup-in-progress, "REVIEW_IN_PROGRESS" :review-in-progress, "ROLLBACK_FAILED" :rollback-failed, "DELETE_IN_PROGRESS" :delete-in-progress, "UPDATE_IN_PROGRESS" :update-in-progress, "ROLLBACK_IN_PROGRESS" :rollback-in-progress, "CREATE_FAILED" :create-failed, "DELETE_COMPLETE" :delete-complete, "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" :update-rollback-complete-cleanup-in-progress, "CREATE_IN_PROGRESS" :create-in-progress, "CREATE_COMPLETE" :create-complete, "UPDATE_COMPLETE" :update-complete, "ROLLBACK_COMPLETE" :rollback-complete, "DELETE_FAILED" :delete-failed, "UPDATE_ROLLBACK_COMPLETE" :update-rollback-complete, "UPDATE_ROLLBACK_IN_PROGRESS" :update-rollback-in-progress} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-export [input] (clojure.core/let [letvar213639 {"ExportingStackId" (portkey.aws/search-for-tag input "ExportingStackId" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar213639 "ExportingStackId") (clojure.core/assoc :exporting-stack-id (deser-stack-id (clojure.core/get-in letvar213639 ["ExportingStackId" :content]))) (letvar213639 "Name") (clojure.core/assoc :name (deser-export-name (clojure.core/get-in letvar213639 ["Name" :content]))) (letvar213639 "Value") (clojure.core/assoc :value (deser-export-value (clojure.core/get-in letvar213639 ["Value" :content]))))))

(clojure.core/defn- deser-capabilities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-capability coll))) input))

(clojure.core/defn- deser-capability [input] (clojure.core/get {"CAPABILITY_IAM" :capability-iam, "CAPABILITY_NAMED_IAM" :capability-named-iam, "CAPABILITY_AUTO_EXPAND" :capability-auto-expand} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-transforms-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transform-name coll))) input))

(clojure.core/defn- deser-physical-resource-id-context-key-value-pair [input] (clojure.core/let [letvar213786 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-key (clojure.core/get-in letvar213786 ["Key" :content])), :value (deser-value (clojure.core/get-in letvar213786 ["Value" :content]))})))

(clojure.core/defn- deser-stack-instance-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-instance-summary coll))) input))

(clojure.core/defn- deser-resource-status [input] (clojure.core/get {"DELETE_IN_PROGRESS" :delete-in-progress, "UPDATE_IN_PROGRESS" :update-in-progress, "CREATE_FAILED" :create-failed, "DELETE_COMPLETE" :delete-complete, "DELETE_SKIPPED" :delete-skipped, "CREATE_IN_PROGRESS" :create-in-progress, "CREATE_COMPLETE" :create-complete, "UPDATE_COMPLETE" :update-complete, "DELETE_FAILED" :delete-failed, "UPDATE_FAILED" :update-failed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-attribute [input] (clojure.core/get {"Properties" :properties, "Metadata" :metadata, "CreationPolicy" :creation-policy, "UpdatePolicy" :update-policy, "DeletionPolicy" :deletion-policy, "Tags" :tags} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-exports [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-export coll))) input))

(clojure.core/defn- deser-physical-resource-id-context [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-physical-resource-id-context-key-value-pair coll))) input))

(clojure.core/defn- deser-stack-set-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-operation-action [input] (clojure.core/get {"CREATE" :create, "UPDATE" :update, "DELETE" :delete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-drift-information [input] (clojure.core/let [letvar213970 {"StackDriftStatus" (portkey.aws/search-for-tag input "StackDriftStatus" :flattened? nil :xmlAttribute? nil), "LastCheckTimestamp" (portkey.aws/search-for-tag input "LastCheckTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-drift-status (deser-stack-drift-status (clojure.core/get-in letvar213970 ["StackDriftStatus" :content]))} (letvar213970 "LastCheckTimestamp") (clojure.core/assoc :last-check-timestamp (deser-timestamp (clojure.core/get-in letvar213970 ["LastCheckTimestamp" :content]))))))

(clojure.core/defn- deser-failure-tolerance-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-account [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-operation-result-summary [input] (clojure.core/let [letvar214085 {"Account" (portkey.aws/search-for-tag input "Account" :flattened? nil :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil), "AccountGateResult" (portkey.aws/search-for-tag input "AccountGateResult" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar214085 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar214085 ["Account" :content]))) (letvar214085 "Region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar214085 ["Region" :content]))) (letvar214085 "Status") (clojure.core/assoc :status (deser-stack-set-operation-result-status (clojure.core/get-in letvar214085 ["Status" :content]))) (letvar214085 "StatusReason") (clojure.core/assoc :status-reason (deser-reason (clojure.core/get-in letvar214085 ["StatusReason" :content]))) (letvar214085 "AccountGateResult") (clojure.core/assoc :account-gate-result (deser-account-gate-result (clojure.core/get-in letvar214085 ["AccountGateResult" :content]))))))

(clojure.core/defn- deser-stack-drift-detection-status [input] (clojure.core/get {"DETECTION_IN_PROGRESS" :detection-in-progress, "DETECTION_FAILED" :detection-failed, "DETECTION_COMPLETE" :detection-complete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-url [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-account-limit [input] (clojure.core/let [letvar214203 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar214203 "Name") (clojure.core/assoc :name (deser-limit-name (clojure.core/get-in letvar214203 ["Name" :content]))) (letvar214203 "Value") (clojure.core/assoc :value (deser-limit-value (clojure.core/get-in letvar214203 ["Value" :content]))))))

(clojure.core/defn- deser-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-properties [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-property-path [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stacks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack coll))) input))

(clojure.core/defn- deser-max-concurrent-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-change [input] (clojure.core/let [letvar214350 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "ResourceChange" (portkey.aws/search-for-tag input "ResourceChange" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar214350 "Type") (clojure.core/assoc :type (deser-change-type (clojure.core/get-in letvar214350 ["Type" :content]))) (letvar214350 "ResourceChange") (clojure.core/assoc :resource-change (deser-resource-change (clojure.core/get-in letvar214350 ["ResourceChange" :content]))))))

(clojure.core/defn- deser-resource-target-definition [input] (clojure.core/let [letvar214458 {"Attribute" (portkey.aws/search-for-tag input "Attribute" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "RequiresRecreation" (portkey.aws/search-for-tag input "RequiresRecreation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar214458 "Attribute") (clojure.core/assoc :attribute (deser-resource-attribute (clojure.core/get-in letvar214458 ["Attribute" :content]))) (letvar214458 "Name") (clojure.core/assoc :name (deser-property-name (clojure.core/get-in letvar214458 ["Name" :content]))) (letvar214458 "RequiresRecreation") (clojure.core/assoc :requires-recreation (deser-requires-recreation (clojure.core/get-in letvar214458 ["RequiresRecreation" :content]))))))

(clojure.core/defn- deser-last-updated-time [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-parameter [input] (clojure.core/let [letvar214568 {"ParameterKey" (portkey.aws/search-for-tag input "ParameterKey" :flattened? nil :xmlAttribute? nil), "ParameterValue" (portkey.aws/search-for-tag input "ParameterValue" :flattened? nil :xmlAttribute? nil), "UsePreviousValue" (portkey.aws/search-for-tag input "UsePreviousValue" :flattened? nil :xmlAttribute? nil), "ResolvedValue" (portkey.aws/search-for-tag input "ResolvedValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar214568 "ParameterKey") (clojure.core/assoc :parameter-key (deser-parameter-key (clojure.core/get-in letvar214568 ["ParameterKey" :content]))) (letvar214568 "ParameterValue") (clojure.core/assoc :parameter-value (deser-parameter-value (clojure.core/get-in letvar214568 ["ParameterValue" :content]))) (letvar214568 "UsePreviousValue") (clojure.core/assoc :use-previous-value (deser-use-previous-value (clojure.core/get-in letvar214568 ["UsePreviousValue" :content]))) (letvar214568 "ResolvedValue") (clojure.core/assoc :resolved-value (deser-parameter-value (clojure.core/get-in letvar214568 ["ResolvedValue" :content]))))))

(clojure.core/defn- deser-stack-drift-detection-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-transform-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-summary [input] (clojure.core/let [letvar214691 {"DeletionTime" (portkey.aws/search-for-tag input "DeletionTime" :flattened? nil :xmlAttribute? nil), "ParentId" (portkey.aws/search-for-tag input "ParentId" :flattened? nil :xmlAttribute? nil), "StackStatusReason" (portkey.aws/search-for-tag input "StackStatusReason" :flattened? nil :xmlAttribute? nil), "StackStatus" (portkey.aws/search-for-tag input "StackStatus" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil), "RootId" (portkey.aws/search-for-tag input "RootId" :flattened? nil :xmlAttribute? nil), "LastUpdatedTime" (portkey.aws/search-for-tag input "LastUpdatedTime" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "CreationTime" (portkey.aws/search-for-tag input "CreationTime" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil), "TemplateDescription" (portkey.aws/search-for-tag input "TemplateDescription" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-name (deser-stack-name (clojure.core/get-in letvar214691 ["StackName" :content])), :creation-time (deser-creation-time (clojure.core/get-in letvar214691 ["CreationTime" :content])), :stack-status (deser-stack-status (clojure.core/get-in letvar214691 ["StackStatus" :content]))} (letvar214691 "DeletionTime") (clojure.core/assoc :deletion-time (deser-deletion-time (clojure.core/get-in letvar214691 ["DeletionTime" :content]))) (letvar214691 "ParentId") (clojure.core/assoc :parent-id (deser-stack-id (clojure.core/get-in letvar214691 ["ParentId" :content]))) (letvar214691 "StackStatusReason") (clojure.core/assoc :stack-status-reason (deser-stack-status-reason (clojure.core/get-in letvar214691 ["StackStatusReason" :content]))) (letvar214691 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-drift-information-summary (clojure.core/get-in letvar214691 ["DriftInformation" :content]))) (letvar214691 "RootId") (clojure.core/assoc :root-id (deser-stack-id (clojure.core/get-in letvar214691 ["RootId" :content]))) (letvar214691 "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-last-updated-time (clojure.core/get-in letvar214691 ["LastUpdatedTime" :content]))) (letvar214691 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar214691 ["StackId" :content]))) (letvar214691 "TemplateDescription") (clojure.core/assoc :template-description (deser-template-description (clojure.core/get-in letvar214691 ["TemplateDescription" :content]))))))

(clojure.core/defn- deser-resource-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-parameter-declarations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter-declaration coll))) input))

(clojure.core/defn- deser-stack-set-operation-status [input] (clojure.core/get {"RUNNING" :running, "SUCCEEDED" :succeeded, "FAILED" :failed, "STOPPING" :stopping, "STOPPED" :stopped} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-property-differences [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-property-difference coll))) input))

(clojure.core/defn- deser-execution-role-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-change-source [input] (clojure.core/get {"ResourceReference" :resource-reference, "ParameterReference" :parameter-reference, "ResourceAttribute" :resource-attribute, "DirectModification" :direct-modification, "Automatic" :automatic} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-change-set-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-creation-time [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-change-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-change-detail coll))) input))

(clojure.core/defn- deser-property-difference [input] (clojure.core/let [letvar214887 {"PropertyPath" (portkey.aws/search-for-tag input "PropertyPath" :flattened? nil :xmlAttribute? nil), "ExpectedValue" (portkey.aws/search-for-tag input "ExpectedValue" :flattened? nil :xmlAttribute? nil), "ActualValue" (portkey.aws/search-for-tag input "ActualValue" :flattened? nil :xmlAttribute? nil), "DifferenceType" (portkey.aws/search-for-tag input "DifferenceType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:property-path (deser-property-path (clojure.core/get-in letvar214887 ["PropertyPath" :content])), :expected-value (deser-property-value (clojure.core/get-in letvar214887 ["ExpectedValue" :content])), :actual-value (deser-property-value (clojure.core/get-in letvar214887 ["ActualValue" :content])), :difference-type (deser-difference-type (clojure.core/get-in letvar214887 ["DifferenceType" :content]))})))

(clojure.core/defn- deser-enable-termination-protection [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-stack-resource-detail [input] (clojure.core/let [letvar214997 {"PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "LastUpdatedTimestamp" (portkey.aws/search-for-tag input "LastUpdatedTimestamp" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceStatusReason" (portkey.aws/search-for-tag input "ResourceStatusReason" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil), "ResourceStatus" (portkey.aws/search-for-tag input "ResourceStatus" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Metadata" (portkey.aws/search-for-tag input "Metadata" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar214997 ["LogicalResourceId" :content])), :resource-type (deser-resource-type (clojure.core/get-in letvar214997 ["ResourceType" :content])), :last-updated-timestamp (deser-timestamp (clojure.core/get-in letvar214997 ["LastUpdatedTimestamp" :content])), :resource-status (deser-resource-status (clojure.core/get-in letvar214997 ["ResourceStatus" :content]))} (letvar214997 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar214997 ["PhysicalResourceId" :content]))) (letvar214997 "ResourceStatusReason") (clojure.core/assoc :resource-status-reason (deser-resource-status-reason (clojure.core/get-in letvar214997 ["ResourceStatusReason" :content]))) (letvar214997 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-resource-drift-information (clojure.core/get-in letvar214997 ["DriftInformation" :content]))) (letvar214997 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar214997 ["Description" :content]))) (letvar214997 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar214997 ["StackId" :content]))) (letvar214997 "Metadata") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar214997 ["Metadata" :content]))) (letvar214997 "StackName") (clojure.core/assoc :stack-name (deser-stack-name (clojure.core/get-in letvar214997 ["StackName" :content]))))))

(clojure.core/defn- deser-allowed-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metadata [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-execution-status [input] (clojure.core/get {"UNAVAILABLE" :unavailable, "AVAILABLE" :available, "EXECUTE_IN_PROGRESS" :execute-in-progress, "EXECUTE_COMPLETE" :execute-complete, "EXECUTE_FAILED" :execute-failed, "OBSOLETE" :obsolete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-set-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-drift-detection-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-set-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar215154 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar215154 ["Key" :content])), :value (deser-tag-value (clojure.core/get-in letvar215154 ["Value" :content]))})))

(clojure.core/defn- deser-stack-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-summary coll))) input))

(clojure.core/defn- deser-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-version [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-replacement [input] (clojure.core/get {"True" :true, "False" :false, "Conditional" :conditional} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-difference-type [input] (clojure.core/get {"ADD" :add, "REMOVE" :remove, "NOT_EQUAL" :not-equal} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-set-operation-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-set-operation-summary coll))) input))

(clojure.core/defn- deser-output [input] (clojure.core/let [letvar215316 {"OutputKey" (portkey.aws/search-for-tag input "OutputKey" :flattened? nil :xmlAttribute? nil), "OutputValue" (portkey.aws/search-for-tag input "OutputValue" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "ExportName" (portkey.aws/search-for-tag input "ExportName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar215316 "OutputKey") (clojure.core/assoc :output-key (deser-output-key (clojure.core/get-in letvar215316 ["OutputKey" :content]))) (letvar215316 "OutputValue") (clojure.core/assoc :output-value (deser-output-value (clojure.core/get-in letvar215316 ["OutputValue" :content]))) (letvar215316 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar215316 ["Description" :content]))) (letvar215316 "ExportName") (clojure.core/assoc :export-name (deser-export-name (clojure.core/get-in letvar215316 ["ExportName" :content]))))))

(clojure.core/defn- deser-no-echo [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-resource-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-type coll))) input))

(clojure.core/defn- deser-template-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-use-previous-value [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-output-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-event-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-max-concurrent-percentage [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-change-detail [input] (clojure.core/let [letvar215462 {"Target" (portkey.aws/search-for-tag input "Target" :flattened? nil :xmlAttribute? nil), "Evaluation" (portkey.aws/search-for-tag input "Evaluation" :flattened? nil :xmlAttribute? nil), "ChangeSource" (portkey.aws/search-for-tag input "ChangeSource" :flattened? nil :xmlAttribute? nil), "CausingEntity" (portkey.aws/search-for-tag input "CausingEntity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar215462 "Target") (clojure.core/assoc :target (deser-resource-target-definition (clojure.core/get-in letvar215462 ["Target" :content]))) (letvar215462 "Evaluation") (clojure.core/assoc :evaluation (deser-evaluation-type (clojure.core/get-in letvar215462 ["Evaluation" :content]))) (letvar215462 "ChangeSource") (clojure.core/assoc :change-source (deser-change-source (clojure.core/get-in letvar215462 ["ChangeSource" :content]))) (letvar215462 "CausingEntity") (clojure.core/assoc :causing-entity (deser-causing-entity (clojure.core/get-in letvar215462 ["CausingEntity" :content]))))))

(clojure.core/defn- deser-stack-resource-drift-status [input] (clojure.core/get {"IN_SYNC" :in-sync, "MODIFIED" :modified, "DELETED" :deleted, "NOT_CHECKED" :not-checked} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-set-operation-result-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-set-operation-result-summary coll))) input))

(clojure.core/defn- deser-output-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-operation-preferences [input] (clojure.core/let [letvar215597 {"RegionOrder" (portkey.aws/search-for-tag input "RegionOrder" :flattened? nil :xmlAttribute? nil), "FailureToleranceCount" (portkey.aws/search-for-tag input "FailureToleranceCount" :flattened? nil :xmlAttribute? nil), "FailureTolerancePercentage" (portkey.aws/search-for-tag input "FailureTolerancePercentage" :flattened? nil :xmlAttribute? nil), "MaxConcurrentCount" (portkey.aws/search-for-tag input "MaxConcurrentCount" :flattened? nil :xmlAttribute? nil), "MaxConcurrentPercentage" (portkey.aws/search-for-tag input "MaxConcurrentPercentage" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar215597 "RegionOrder") (clojure.core/assoc :region-order (deser-region-list (clojure.core/get-in letvar215597 ["RegionOrder" :content]))) (letvar215597 "FailureToleranceCount") (clojure.core/assoc :failure-tolerance-count (deser-failure-tolerance-count (clojure.core/get-in letvar215597 ["FailureToleranceCount" :content]))) (letvar215597 "FailureTolerancePercentage") (clojure.core/assoc :failure-tolerance-percentage (deser-failure-tolerance-percentage (clojure.core/get-in letvar215597 ["FailureTolerancePercentage" :content]))) (letvar215597 "MaxConcurrentCount") (clojure.core/assoc :max-concurrent-count (deser-max-concurrent-count (clojure.core/get-in letvar215597 ["MaxConcurrentCount" :content]))) (letvar215597 "MaxConcurrentPercentage") (clojure.core/assoc :max-concurrent-percentage (deser-max-concurrent-percentage (clojure.core/get-in letvar215597 ["MaxConcurrentPercentage" :content]))))))

(clojure.core/defn- deser-account-gate-status [input] (clojure.core/get {"SUCCEEDED" :succeeded, "FAILED" :failed, "SKIPPED" :skipped} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stage-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-template-stage coll))) input))

(clojure.core/defn- deser-stack [input] (clojure.core/let [letvar215727 {"NotificationARNs" (portkey.aws/search-for-tag input "NotificationARNs" :flattened? nil :xmlAttribute? nil), "RollbackConfiguration" (portkey.aws/search-for-tag input "RollbackConfiguration" :flattened? nil :xmlAttribute? nil), "RoleARN" (portkey.aws/search-for-tag input "RoleARN" :flattened? nil :xmlAttribute? nil), "TimeoutInMinutes" (portkey.aws/search-for-tag input "TimeoutInMinutes" :flattened? nil :xmlAttribute? nil), "Parameters" (portkey.aws/search-for-tag input "Parameters" :flattened? nil :xmlAttribute? nil), "DeletionTime" (portkey.aws/search-for-tag input "DeletionTime" :flattened? nil :xmlAttribute? nil), "ChangeSetId" (portkey.aws/search-for-tag input "ChangeSetId" :flattened? nil :xmlAttribute? nil), "ParentId" (portkey.aws/search-for-tag input "ParentId" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "DisableRollback" (portkey.aws/search-for-tag input "DisableRollback" :flattened? nil :xmlAttribute? nil), "Outputs" (portkey.aws/search-for-tag input "Outputs" :flattened? nil :xmlAttribute? nil), "StackStatusReason" (portkey.aws/search-for-tag input "StackStatusReason" :flattened? nil :xmlAttribute? nil), "StackStatus" (portkey.aws/search-for-tag input "StackStatus" :flattened? nil :xmlAttribute? nil), "Capabilities" (portkey.aws/search-for-tag input "Capabilities" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil), "RootId" (portkey.aws/search-for-tag input "RootId" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "LastUpdatedTime" (portkey.aws/search-for-tag input "LastUpdatedTime" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "CreationTime" (portkey.aws/search-for-tag input "CreationTime" :flattened? nil :xmlAttribute? nil), "EnableTerminationProtection" (portkey.aws/search-for-tag input "EnableTerminationProtection" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-name (deser-stack-name (clojure.core/get-in letvar215727 ["StackName" :content])), :creation-time (deser-creation-time (clojure.core/get-in letvar215727 ["CreationTime" :content])), :stack-status (deser-stack-status (clojure.core/get-in letvar215727 ["StackStatus" :content]))} (letvar215727 "NotificationARNs") (clojure.core/assoc :notification-ar-ns (deser-notification-ar-ns (clojure.core/get-in letvar215727 ["NotificationARNs" :content]))) (letvar215727 "RollbackConfiguration") (clojure.core/assoc :rollback-configuration (deser-rollback-configuration (clojure.core/get-in letvar215727 ["RollbackConfiguration" :content]))) (letvar215727 "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar215727 ["RoleARN" :content]))) (letvar215727 "TimeoutInMinutes") (clojure.core/assoc :timeout-in-minutes (deser-timeout-minutes (clojure.core/get-in letvar215727 ["TimeoutInMinutes" :content]))) (letvar215727 "Parameters") (clojure.core/assoc :parameters (deser-parameters (clojure.core/get-in letvar215727 ["Parameters" :content]))) (letvar215727 "DeletionTime") (clojure.core/assoc :deletion-time (deser-deletion-time (clojure.core/get-in letvar215727 ["DeletionTime" :content]))) (letvar215727 "ChangeSetId") (clojure.core/assoc :change-set-id (deser-change-set-id (clojure.core/get-in letvar215727 ["ChangeSetId" :content]))) (letvar215727 "ParentId") (clojure.core/assoc :parent-id (deser-stack-id (clojure.core/get-in letvar215727 ["ParentId" :content]))) (letvar215727 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar215727 ["Tags" :content]))) (letvar215727 "DisableRollback") (clojure.core/assoc :disable-rollback (deser-disable-rollback (clojure.core/get-in letvar215727 ["DisableRollback" :content]))) (letvar215727 "Outputs") (clojure.core/assoc :outputs (deser-outputs (clojure.core/get-in letvar215727 ["Outputs" :content]))) (letvar215727 "StackStatusReason") (clojure.core/assoc :stack-status-reason (deser-stack-status-reason (clojure.core/get-in letvar215727 ["StackStatusReason" :content]))) (letvar215727 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar215727 ["Capabilities" :content]))) (letvar215727 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-drift-information (clojure.core/get-in letvar215727 ["DriftInformation" :content]))) (letvar215727 "RootId") (clojure.core/assoc :root-id (deser-stack-id (clojure.core/get-in letvar215727 ["RootId" :content]))) (letvar215727 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar215727 ["Description" :content]))) (letvar215727 "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-last-updated-time (clojure.core/get-in letvar215727 ["LastUpdatedTime" :content]))) (letvar215727 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar215727 ["StackId" :content]))) (letvar215727 "EnableTerminationProtection") (clojure.core/assoc :enable-termination-protection (deser-enable-termination-protection (clojure.core/get-in letvar215727 ["EnableTerminationProtection" :content]))))))

(clojure.core/defn- deser-stack-policy-body [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set [input] (clojure.core/let [letvar215840 {"TemplateBody" (portkey.aws/search-for-tag input "TemplateBody" :flattened? nil :xmlAttribute? nil), "Parameters" (portkey.aws/search-for-tag input "Parameters" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Capabilities" (portkey.aws/search-for-tag input "Capabilities" :flattened? nil :xmlAttribute? nil), "StackSetARN" (portkey.aws/search-for-tag input "StackSetARN" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "AdministrationRoleARN" (portkey.aws/search-for-tag input "AdministrationRoleARN" :flattened? nil :xmlAttribute? nil), "StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "ExecutionRoleName" (portkey.aws/search-for-tag input "ExecutionRoleName" :flattened? nil :xmlAttribute? nil), "StackSetName" (portkey.aws/search-for-tag input "StackSetName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar215840 "TemplateBody") (clojure.core/assoc :template-body (deser-template-body (clojure.core/get-in letvar215840 ["TemplateBody" :content]))) (letvar215840 "Parameters") (clojure.core/assoc :parameters (deser-parameters (clojure.core/get-in letvar215840 ["Parameters" :content]))) (letvar215840 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar215840 ["Tags" :content]))) (letvar215840 "Status") (clojure.core/assoc :status (deser-stack-set-status (clojure.core/get-in letvar215840 ["Status" :content]))) (letvar215840 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar215840 ["Capabilities" :content]))) (letvar215840 "StackSetARN") (clojure.core/assoc :stack-set-arn (deser-stack-set-arn (clojure.core/get-in letvar215840 ["StackSetARN" :content]))) (letvar215840 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar215840 ["Description" :content]))) (letvar215840 "AdministrationRoleARN") (clojure.core/assoc :administration-role-arn (deser-role-arn (clojure.core/get-in letvar215840 ["AdministrationRoleARN" :content]))) (letvar215840 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar215840 ["StackSetId" :content]))) (letvar215840 "ExecutionRoleName") (clojure.core/assoc :execution-role-name (deser-execution-role-name (clojure.core/get-in letvar215840 ["ExecutionRoleName" :content]))) (letvar215840 "StackSetName") (clojure.core/assoc :stack-set-name (deser-stack-set-name (clojure.core/get-in letvar215840 ["StackSetName" :content]))))))

(clojure.core/defn- deser-stack-drift-information-summary [input] (clojure.core/let [letvar215948 {"StackDriftStatus" (portkey.aws/search-for-tag input "StackDriftStatus" :flattened? nil :xmlAttribute? nil), "LastCheckTimestamp" (portkey.aws/search-for-tag input "LastCheckTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-drift-status (deser-stack-drift-status (clojure.core/get-in letvar215948 ["StackDriftStatus" :content]))} (letvar215948 "LastCheckTimestamp") (clojure.core/assoc :last-check-timestamp (deser-timestamp (clojure.core/get-in letvar215948 ["LastCheckTimestamp" :content]))))))

(clojure.core/defn- deser-limit-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-region [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-scope [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-attribute coll))) input))

(clojure.core/defn- deser-monitoring-time-in-minutes [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-account-gate-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-parameter-constraints [input] (clojure.core/let [letvar216090 {"AllowedValues" (portkey.aws/search-for-tag input "AllowedValues" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar216090 "AllowedValues") (clojure.core/assoc :allowed-values (deser-allowed-values (clojure.core/get-in letvar216090 ["AllowedValues" :content]))))))

(clojure.core/defn- deser-stack-resource [input] (clojure.core/let [letvar216198 {"PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceStatusReason" (portkey.aws/search-for-tag input "ResourceStatusReason" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil), "ResourceStatus" (portkey.aws/search-for-tag input "ResourceStatus" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar216198 ["LogicalResourceId" :content])), :resource-type (deser-resource-type (clojure.core/get-in letvar216198 ["ResourceType" :content])), :timestamp (deser-timestamp (clojure.core/get-in letvar216198 ["Timestamp" :content])), :resource-status (deser-resource-status (clojure.core/get-in letvar216198 ["ResourceStatus" :content]))} (letvar216198 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar216198 ["PhysicalResourceId" :content]))) (letvar216198 "ResourceStatusReason") (clojure.core/assoc :resource-status-reason (deser-resource-status-reason (clojure.core/get-in letvar216198 ["ResourceStatusReason" :content]))) (letvar216198 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-resource-drift-information (clojure.core/get-in letvar216198 ["DriftInformation" :content]))) (letvar216198 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar216198 ["Description" :content]))) (letvar216198 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar216198 ["StackId" :content]))) (letvar216198 "StackName") (clojure.core/assoc :stack-name (deser-stack-name (clojure.core/get-in letvar216198 ["StackName" :content]))))))

(clojure.core/defn- deser-parameter-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-limit-value [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-causing-entity [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-summary [input] (clojure.core/let [letvar216318 {"StackSetName" (portkey.aws/search-for-tag input "StackSetName" :flattened? nil :xmlAttribute? nil), "StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar216318 "StackSetName") (clojure.core/assoc :stack-set-name (deser-stack-set-name (clojure.core/get-in letvar216318 ["StackSetName" :content]))) (letvar216318 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar216318 ["StackSetId" :content]))) (letvar216318 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar216318 ["Description" :content]))) (letvar216318 "Status") (clojure.core/assoc :status (deser-stack-set-status (clojure.core/get-in letvar216318 ["Status" :content]))))))

(clojure.core/defn- deser-resource-properties [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-timeout-minutes [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-template-parameters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-template-parameter coll))) input))

(clojure.core/defn- response-describe-stack-set-operation-output ([input] (response-describe-stack-set-operation-output nil input)) ([resultWrapper216344 input] (clojure.core/let [rawinput216343 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216345 {"StackSetOperation" (portkey.aws/search-for-tag rawinput216343 "StackSetOperation" :flattened? nil :result-wrapper resultWrapper216344)}] (clojure.core/cond-> {} (letvar216345 "StackSetOperation") (clojure.core/assoc :stack-set-operation (deser-stack-set-operation (clojure.core/get-in letvar216345 ["StackSetOperation" :content])))))))

(clojure.core/defn- response-insufficient-capabilities-exception ([input] (response-insufficient-capabilities-exception nil input)) ([resultWrapper216347 input] (clojure.core/let [rawinput216346 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216348 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stack-instances-output ([input] (response-list-stack-instances-output nil input)) ([resultWrapper216350 input] (clojure.core/let [rawinput216349 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216351 {"Summaries" (portkey.aws/search-for-tag rawinput216349 "Summaries" :flattened? nil :result-wrapper resultWrapper216350), "NextToken" (portkey.aws/search-for-tag rawinput216349 "NextToken" :flattened? nil :result-wrapper resultWrapper216350)}] (clojure.core/cond-> {} (letvar216351 "Summaries") (clojure.core/assoc :summaries (deser-stack-instance-summaries (clojure.core/get-in letvar216351 ["Summaries" :content]))) (letvar216351 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216351 ["NextToken" :content])))))))

(clojure.core/defn- response-already-exists-exception ([input] (response-already-exists-exception nil input)) ([resultWrapper216353 input] (clojure.core/let [rawinput216352 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216354 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stacks-output ([input] (response-list-stacks-output nil input)) ([resultWrapper216356 input] (clojure.core/let [rawinput216355 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216357 {"StackSummaries" (portkey.aws/search-for-tag rawinput216355 "StackSummaries" :flattened? nil :result-wrapper resultWrapper216356), "NextToken" (portkey.aws/search-for-tag rawinput216355 "NextToken" :flattened? nil :result-wrapper resultWrapper216356)}] (clojure.core/cond-> {} (letvar216357 "StackSummaries") (clojure.core/assoc :stack-summaries (deser-stack-summaries (clojure.core/get-in letvar216357 ["StackSummaries" :content]))) (letvar216357 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216357 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-stack-events-output ([input] (response-describe-stack-events-output nil input)) ([resultWrapper216359 input] (clojure.core/let [rawinput216358 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216360 {"StackEvents" (portkey.aws/search-for-tag rawinput216358 "StackEvents" :flattened? nil :result-wrapper resultWrapper216359), "NextToken" (portkey.aws/search-for-tag rawinput216358 "NextToken" :flattened? nil :result-wrapper resultWrapper216359)}] (clojure.core/cond-> {} (letvar216360 "StackEvents") (clojure.core/assoc :stack-events (deser-stack-events (clojure.core/get-in letvar216360 ["StackEvents" :content]))) (letvar216360 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216360 ["NextToken" :content])))))))

(clojure.core/defn- response-delete-stack-set-output ([input] (response-delete-stack-set-output nil input)) ([resultWrapper216362 input] (clojure.core/let [rawinput216361 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216363 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stack-instance-not-found-exception ([input] (response-stack-instance-not-found-exception nil input)) ([resultWrapper216365 input] (clojure.core/let [rawinput216364 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216366 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-account-limits-output ([input] (response-describe-account-limits-output nil input)) ([resultWrapper216368 input] (clojure.core/let [rawinput216367 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216369 {"AccountLimits" (portkey.aws/search-for-tag rawinput216367 "AccountLimits" :flattened? nil :result-wrapper resultWrapper216368), "NextToken" (portkey.aws/search-for-tag rawinput216367 "NextToken" :flattened? nil :result-wrapper resultWrapper216368)}] (clojure.core/cond-> {} (letvar216369 "AccountLimits") (clojure.core/assoc :account-limits (deser-account-limit-list (clojure.core/get-in letvar216369 ["AccountLimits" :content]))) (letvar216369 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216369 ["NextToken" :content])))))))

(clojure.core/defn- response-create-stack-output ([input] (response-create-stack-output nil input)) ([resultWrapper216371 input] (clojure.core/let [rawinput216370 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216372 {"StackId" (portkey.aws/search-for-tag rawinput216370 "StackId" :flattened? nil :result-wrapper resultWrapper216371)}] (clojure.core/cond-> {} (letvar216372 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar216372 ["StackId" :content])))))))

(clojure.core/defn- response-delete-change-set-output ([input] (response-delete-change-set-output nil input)) ([resultWrapper216374 input] (clojure.core/let [rawinput216373 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216375 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stack-resources-output ([input] (response-list-stack-resources-output nil input)) ([resultWrapper216377 input] (clojure.core/let [rawinput216376 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216378 {"StackResourceSummaries" (portkey.aws/search-for-tag rawinput216376 "StackResourceSummaries" :flattened? nil :result-wrapper resultWrapper216377), "NextToken" (portkey.aws/search-for-tag rawinput216376 "NextToken" :flattened? nil :result-wrapper resultWrapper216377)}] (clojure.core/cond-> {} (letvar216378 "StackResourceSummaries") (clojure.core/assoc :stack-resource-summaries (deser-stack-resource-summaries (clojure.core/get-in letvar216378 ["StackResourceSummaries" :content]))) (letvar216378 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216378 ["NextToken" :content])))))))

(clojure.core/defn- response-list-exports-output ([input] (response-list-exports-output nil input)) ([resultWrapper216380 input] (clojure.core/let [rawinput216379 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216381 {"Exports" (portkey.aws/search-for-tag rawinput216379 "Exports" :flattened? nil :result-wrapper resultWrapper216380), "NextToken" (portkey.aws/search-for-tag rawinput216379 "NextToken" :flattened? nil :result-wrapper resultWrapper216380)}] (clojure.core/cond-> {} (letvar216381 "Exports") (clojure.core/assoc :exports (deser-exports (clojure.core/get-in letvar216381 ["Exports" :content]))) (letvar216381 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216381 ["NextToken" :content])))))))

(clojure.core/defn- response-validate-template-output ([input] (response-validate-template-output nil input)) ([resultWrapper216383 input] (clojure.core/let [rawinput216382 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216384 {"Parameters" (portkey.aws/search-for-tag rawinput216382 "Parameters" :flattened? nil :result-wrapper resultWrapper216383), "Description" (portkey.aws/search-for-tag rawinput216382 "Description" :flattened? nil :result-wrapper resultWrapper216383), "Capabilities" (portkey.aws/search-for-tag rawinput216382 "Capabilities" :flattened? nil :result-wrapper resultWrapper216383), "CapabilitiesReason" (portkey.aws/search-for-tag rawinput216382 "CapabilitiesReason" :flattened? nil :result-wrapper resultWrapper216383), "DeclaredTransforms" (portkey.aws/search-for-tag rawinput216382 "DeclaredTransforms" :flattened? nil :result-wrapper resultWrapper216383)}] (clojure.core/cond-> {} (letvar216384 "Parameters") (clojure.core/assoc :parameters (deser-template-parameters (clojure.core/get-in letvar216384 ["Parameters" :content]))) (letvar216384 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar216384 ["Description" :content]))) (letvar216384 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar216384 ["Capabilities" :content]))) (letvar216384 "CapabilitiesReason") (clojure.core/assoc :capabilities-reason (deser-capabilities-reason (clojure.core/get-in letvar216384 ["CapabilitiesReason" :content]))) (letvar216384 "DeclaredTransforms") (clojure.core/assoc :declared-transforms (deser-transforms-list (clojure.core/get-in letvar216384 ["DeclaredTransforms" :content])))))))

(clojure.core/defn- response-create-change-set-output ([input] (response-create-change-set-output nil input)) ([resultWrapper216386 input] (clojure.core/let [rawinput216385 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216387 {"Id" (portkey.aws/search-for-tag rawinput216385 "Id" :flattened? nil :result-wrapper resultWrapper216386), "StackId" (portkey.aws/search-for-tag rawinput216385 "StackId" :flattened? nil :result-wrapper resultWrapper216386)}] (clojure.core/cond-> {} (letvar216387 "Id") (clojure.core/assoc :id (deser-change-set-id (clojure.core/get-in letvar216387 ["Id" :content]))) (letvar216387 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar216387 ["StackId" :content])))))))

(clojure.core/defn- response-name-already-exists-exception ([input] (response-name-already-exists-exception nil input)) ([resultWrapper216389 input] (clojure.core/let [rawinput216388 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216390 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stack-set-not-found-exception ([input] (response-stack-set-not-found-exception nil input)) ([resultWrapper216392 input] (clojure.core/let [rawinput216391 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216393 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-change-set-status-exception ([input] (response-invalid-change-set-status-exception nil input)) ([resultWrapper216395 input] (clojure.core/let [rawinput216394 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216396 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper216398 input] (clojure.core/let [rawinput216397 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216399 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-in-progress-exception ([input] (response-operation-in-progress-exception nil input)) ([resultWrapper216401 input] (clojure.core/let [rawinput216400 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216402 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stack-sets-output ([input] (response-list-stack-sets-output nil input)) ([resultWrapper216404 input] (clojure.core/let [rawinput216403 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216405 {"Summaries" (portkey.aws/search-for-tag rawinput216403 "Summaries" :flattened? nil :result-wrapper resultWrapper216404), "NextToken" (portkey.aws/search-for-tag rawinput216403 "NextToken" :flattened? nil :result-wrapper resultWrapper216404)}] (clojure.core/cond-> {} (letvar216405 "Summaries") (clojure.core/assoc :summaries (deser-stack-set-summaries (clojure.core/get-in letvar216405 ["Summaries" :content]))) (letvar216405 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216405 ["NextToken" :content])))))))

(clojure.core/defn- response-estimate-template-cost-output ([input] (response-estimate-template-cost-output nil input)) ([resultWrapper216407 input] (clojure.core/let [rawinput216406 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216408 {"Url" (portkey.aws/search-for-tag rawinput216406 "Url" :flattened? nil :result-wrapper resultWrapper216407)}] (clojure.core/cond-> {} (letvar216408 "Url") (clojure.core/assoc :url (deser-url (clojure.core/get-in letvar216408 ["Url" :content])))))))

(clojure.core/defn- response-describe-stack-resource-output ([input] (response-describe-stack-resource-output nil input)) ([resultWrapper216410 input] (clojure.core/let [rawinput216409 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216411 {"StackResourceDetail" (portkey.aws/search-for-tag rawinput216409 "StackResourceDetail" :flattened? nil :result-wrapper resultWrapper216410)}] (clojure.core/cond-> {} (letvar216411 "StackResourceDetail") (clojure.core/assoc :stack-resource-detail (deser-stack-resource-detail (clojure.core/get-in letvar216411 ["StackResourceDetail" :content])))))))

(clojure.core/defn- response-token-already-exists-exception ([input] (response-token-already-exists-exception nil input)) ([resultWrapper216413 input] (clojure.core/let [rawinput216412 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216414 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-stack-set-operation-output ([input] (response-stop-stack-set-operation-output nil input)) ([resultWrapper216416 input] (clojure.core/let [rawinput216415 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216417 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-stack-set-output ([input] (response-describe-stack-set-output nil input)) ([resultWrapper216419 input] (clojure.core/let [rawinput216418 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216420 {"StackSet" (portkey.aws/search-for-tag rawinput216418 "StackSet" :flattened? nil :result-wrapper resultWrapper216419)}] (clojure.core/cond-> {} (letvar216420 "StackSet") (clojure.core/assoc :stack-set (deser-stack-set (clojure.core/get-in letvar216420 ["StackSet" :content])))))))

(clojure.core/defn- response-invalid-operation-exception ([input] (response-invalid-operation-exception nil input)) ([resultWrapper216422 input] (clojure.core/let [rawinput216421 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216423 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-stack-output ([input] (response-update-stack-output nil input)) ([resultWrapper216425 input] (clojure.core/let [rawinput216424 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216426 {"StackId" (portkey.aws/search-for-tag rawinput216424 "StackId" :flattened? nil :result-wrapper resultWrapper216425)}] (clojure.core/cond-> {} (letvar216426 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar216426 ["StackId" :content])))))))

(clojure.core/defn- response-update-termination-protection-output ([input] (response-update-termination-protection-output nil input)) ([resultWrapper216428 input] (clojure.core/let [rawinput216427 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216429 {"StackId" (portkey.aws/search-for-tag rawinput216427 "StackId" :flattened? nil :result-wrapper resultWrapper216428)}] (clojure.core/cond-> {} (letvar216429 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar216429 ["StackId" :content])))))))

(clojure.core/defn- response-describe-stacks-output ([input] (response-describe-stacks-output nil input)) ([resultWrapper216431 input] (clojure.core/let [rawinput216430 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216432 {"Stacks" (portkey.aws/search-for-tag rawinput216430 "Stacks" :flattened? nil :result-wrapper resultWrapper216431), "NextToken" (portkey.aws/search-for-tag rawinput216430 "NextToken" :flattened? nil :result-wrapper resultWrapper216431)}] (clojure.core/cond-> {} (letvar216432 "Stacks") (clojure.core/assoc :stacks (deser-stacks (clojure.core/get-in letvar216432 ["Stacks" :content]))) (letvar216432 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216432 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-stack-instance-output ([input] (response-describe-stack-instance-output nil input)) ([resultWrapper216434 input] (clojure.core/let [rawinput216433 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216435 {"StackInstance" (portkey.aws/search-for-tag rawinput216433 "StackInstance" :flattened? nil :result-wrapper resultWrapper216434)}] (clojure.core/cond-> {} (letvar216435 "StackInstance") (clojure.core/assoc :stack-instance (deser-stack-instance (clojure.core/get-in letvar216435 ["StackInstance" :content])))))))

(clojure.core/defn- response-stale-request-exception ([input] (response-stale-request-exception nil input)) ([resultWrapper216437 input] (clojure.core/let [rawinput216436 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216438 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detect-stack-resource-drift-output ([input] (response-detect-stack-resource-drift-output nil input)) ([resultWrapper216440 input] (clojure.core/let [rawinput216439 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216441 {"StackResourceDrift" (portkey.aws/search-for-tag rawinput216439 "StackResourceDrift" :flattened? nil :result-wrapper resultWrapper216440)}] (clojure.core/cond-> {:stack-resource-drift (deser-stack-resource-drift (clojure.core/get-in letvar216441 ["StackResourceDrift" :content]))}))))

(clojure.core/defn- response-update-stack-instances-output ([input] (response-update-stack-instances-output nil input)) ([resultWrapper216443 input] (clojure.core/let [rawinput216442 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216444 {"OperationId" (portkey.aws/search-for-tag rawinput216442 "OperationId" :flattened? nil :result-wrapper resultWrapper216443)}] (clojure.core/cond-> {} (letvar216444 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar216444 ["OperationId" :content])))))))

(clojure.core/defn- response-list-imports-output ([input] (response-list-imports-output nil input)) ([resultWrapper216446 input] (clojure.core/let [rawinput216445 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216447 {"Imports" (portkey.aws/search-for-tag rawinput216445 "Imports" :flattened? nil :result-wrapper resultWrapper216446), "NextToken" (portkey.aws/search-for-tag rawinput216445 "NextToken" :flattened? nil :result-wrapper resultWrapper216446)}] (clojure.core/cond-> {} (letvar216447 "Imports") (clojure.core/assoc :imports (deser-imports (clojure.core/get-in letvar216447 ["Imports" :content]))) (letvar216447 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216447 ["NextToken" :content])))))))

(clojure.core/defn- response-operation-not-found-exception ([input] (response-operation-not-found-exception nil input)) ([resultWrapper216449 input] (clojure.core/let [rawinput216448 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216450 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-stack-resource-drifts-output ([input] (response-describe-stack-resource-drifts-output nil input)) ([resultWrapper216452 input] (clojure.core/let [rawinput216451 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216453 {"StackResourceDrifts" (portkey.aws/search-for-tag rawinput216451 "StackResourceDrifts" :flattened? nil :result-wrapper resultWrapper216452), "NextToken" (portkey.aws/search-for-tag rawinput216451 "NextToken" :flattened? nil :result-wrapper resultWrapper216452)}] (clojure.core/cond-> {:stack-resource-drifts (deser-stack-resource-drifts (clojure.core/get-in letvar216453 ["StackResourceDrifts" :content]))} (letvar216453 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216453 ["NextToken" :content])))))))

(clojure.core/defn- response-continue-update-rollback-output ([input] (response-continue-update-rollback-output nil input)) ([resultWrapper216455 input] (clojure.core/let [rawinput216454 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216456 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stack-set-operations-output ([input] (response-list-stack-set-operations-output nil input)) ([resultWrapper216458 input] (clojure.core/let [rawinput216457 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216459 {"Summaries" (portkey.aws/search-for-tag rawinput216457 "Summaries" :flattened? nil :result-wrapper resultWrapper216458), "NextToken" (portkey.aws/search-for-tag rawinput216457 "NextToken" :flattened? nil :result-wrapper resultWrapper216458)}] (clojure.core/cond-> {} (letvar216459 "Summaries") (clojure.core/assoc :summaries (deser-stack-set-operation-summaries (clojure.core/get-in letvar216459 ["Summaries" :content]))) (letvar216459 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216459 ["NextToken" :content])))))))

(clojure.core/defn- response-delete-stack-instances-output ([input] (response-delete-stack-instances-output nil input)) ([resultWrapper216461 input] (clojure.core/let [rawinput216460 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216462 {"OperationId" (portkey.aws/search-for-tag rawinput216460 "OperationId" :flattened? nil :result-wrapper resultWrapper216461)}] (clojure.core/cond-> {} (letvar216462 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar216462 ["OperationId" :content])))))))

(clojure.core/defn- response-create-stack-instances-output ([input] (response-create-stack-instances-output nil input)) ([resultWrapper216464 input] (clojure.core/let [rawinput216463 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216465 {"OperationId" (portkey.aws/search-for-tag rawinput216463 "OperationId" :flattened? nil :result-wrapper resultWrapper216464)}] (clojure.core/cond-> {} (letvar216465 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar216465 ["OperationId" :content])))))))

(clojure.core/defn- response-list-stack-set-operation-results-output ([input] (response-list-stack-set-operation-results-output nil input)) ([resultWrapper216467 input] (clojure.core/let [rawinput216466 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216468 {"Summaries" (portkey.aws/search-for-tag rawinput216466 "Summaries" :flattened? nil :result-wrapper resultWrapper216467), "NextToken" (portkey.aws/search-for-tag rawinput216466 "NextToken" :flattened? nil :result-wrapper resultWrapper216467)}] (clojure.core/cond-> {} (letvar216468 "Summaries") (clojure.core/assoc :summaries (deser-stack-set-operation-result-summaries (clojure.core/get-in letvar216468 ["Summaries" :content]))) (letvar216468 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216468 ["NextToken" :content])))))))

(clojure.core/defn- response-get-template-output ([input] (response-get-template-output nil input)) ([resultWrapper216470 input] (clojure.core/let [rawinput216469 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216471 {"TemplateBody" (portkey.aws/search-for-tag rawinput216469 "TemplateBody" :flattened? nil :result-wrapper resultWrapper216470), "StagesAvailable" (portkey.aws/search-for-tag rawinput216469 "StagesAvailable" :flattened? nil :result-wrapper resultWrapper216470)}] (clojure.core/cond-> {} (letvar216471 "TemplateBody") (clojure.core/assoc :template-body (deser-template-body (clojure.core/get-in letvar216471 ["TemplateBody" :content]))) (letvar216471 "StagesAvailable") (clojure.core/assoc :stages-available (deser-stage-list (clojure.core/get-in letvar216471 ["StagesAvailable" :content])))))))

(clojure.core/defn- response-describe-stack-resources-output ([input] (response-describe-stack-resources-output nil input)) ([resultWrapper216473 input] (clojure.core/let [rawinput216472 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216474 {"StackResources" (portkey.aws/search-for-tag rawinput216472 "StackResources" :flattened? nil :result-wrapper resultWrapper216473)}] (clojure.core/cond-> {} (letvar216474 "StackResources") (clojure.core/assoc :stack-resources (deser-stack-resources (clojure.core/get-in letvar216474 ["StackResources" :content])))))))

(clojure.core/defn- response-execute-change-set-output ([input] (response-execute-change-set-output nil input)) ([resultWrapper216476 input] (clojure.core/let [rawinput216475 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216477 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-template-summary-output ([input] (response-get-template-summary-output nil input)) ([resultWrapper216479 input] (clojure.core/let [rawinput216478 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216480 {"Parameters" (portkey.aws/search-for-tag rawinput216478 "Parameters" :flattened? nil :result-wrapper resultWrapper216479), "Description" (portkey.aws/search-for-tag rawinput216478 "Description" :flattened? nil :result-wrapper resultWrapper216479), "Capabilities" (portkey.aws/search-for-tag rawinput216478 "Capabilities" :flattened? nil :result-wrapper resultWrapper216479), "CapabilitiesReason" (portkey.aws/search-for-tag rawinput216478 "CapabilitiesReason" :flattened? nil :result-wrapper resultWrapper216479), "ResourceTypes" (portkey.aws/search-for-tag rawinput216478 "ResourceTypes" :flattened? nil :result-wrapper resultWrapper216479), "Version" (portkey.aws/search-for-tag rawinput216478 "Version" :flattened? nil :result-wrapper resultWrapper216479), "Metadata" (portkey.aws/search-for-tag rawinput216478 "Metadata" :flattened? nil :result-wrapper resultWrapper216479), "DeclaredTransforms" (portkey.aws/search-for-tag rawinput216478 "DeclaredTransforms" :flattened? nil :result-wrapper resultWrapper216479)}] (clojure.core/cond-> {} (letvar216480 "Parameters") (clojure.core/assoc :parameters (deser-parameter-declarations (clojure.core/get-in letvar216480 ["Parameters" :content]))) (letvar216480 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar216480 ["Description" :content]))) (letvar216480 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar216480 ["Capabilities" :content]))) (letvar216480 "CapabilitiesReason") (clojure.core/assoc :capabilities-reason (deser-capabilities-reason (clojure.core/get-in letvar216480 ["CapabilitiesReason" :content]))) (letvar216480 "ResourceTypes") (clojure.core/assoc :resource-types (deser-resource-types (clojure.core/get-in letvar216480 ["ResourceTypes" :content]))) (letvar216480 "Version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar216480 ["Version" :content]))) (letvar216480 "Metadata") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar216480 ["Metadata" :content]))) (letvar216480 "DeclaredTransforms") (clojure.core/assoc :declared-transforms (deser-transforms-list (clojure.core/get-in letvar216480 ["DeclaredTransforms" :content])))))))

(clojure.core/defn- response-list-change-sets-output ([input] (response-list-change-sets-output nil input)) ([resultWrapper216482 input] (clojure.core/let [rawinput216481 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216483 {"Summaries" (portkey.aws/search-for-tag rawinput216481 "Summaries" :flattened? nil :result-wrapper resultWrapper216482), "NextToken" (portkey.aws/search-for-tag rawinput216481 "NextToken" :flattened? nil :result-wrapper resultWrapper216482)}] (clojure.core/cond-> {} (letvar216483 "Summaries") (clojure.core/assoc :summaries (deser-change-set-summaries (clojure.core/get-in letvar216483 ["Summaries" :content]))) (letvar216483 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216483 ["NextToken" :content])))))))

(clojure.core/defn- response-get-stack-policy-output ([input] (response-get-stack-policy-output nil input)) ([resultWrapper216485 input] (clojure.core/let [rawinput216484 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216486 {"StackPolicyBody" (portkey.aws/search-for-tag rawinput216484 "StackPolicyBody" :flattened? nil :result-wrapper resultWrapper216485)}] (clojure.core/cond-> {} (letvar216486 "StackPolicyBody") (clojure.core/assoc :stack-policy-body (deser-stack-policy-body (clojure.core/get-in letvar216486 ["StackPolicyBody" :content])))))))

(clojure.core/defn- response-created-but-modified-exception ([input] (response-created-but-modified-exception nil input)) ([resultWrapper216488 input] (clojure.core/let [rawinput216487 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216489 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-stack-set-output ([input] (response-update-stack-set-output nil input)) ([resultWrapper216491 input] (clojure.core/let [rawinput216490 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216492 {"OperationId" (portkey.aws/search-for-tag rawinput216490 "OperationId" :flattened? nil :result-wrapper resultWrapper216491)}] (clojure.core/cond-> {} (letvar216492 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar216492 ["OperationId" :content])))))))

(clojure.core/defn- response-describe-change-set-output ([input] (response-describe-change-set-output nil input)) ([resultWrapper216494 input] (clojure.core/let [rawinput216493 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216495 {"NotificationARNs" (portkey.aws/search-for-tag rawinput216493 "NotificationARNs" :flattened? nil :result-wrapper resultWrapper216494), "RollbackConfiguration" (portkey.aws/search-for-tag rawinput216493 "RollbackConfiguration" :flattened? nil :result-wrapper resultWrapper216494), "Parameters" (portkey.aws/search-for-tag rawinput216493 "Parameters" :flattened? nil :result-wrapper resultWrapper216494), "ChangeSetName" (portkey.aws/search-for-tag rawinput216493 "ChangeSetName" :flattened? nil :result-wrapper resultWrapper216494), "ChangeSetId" (portkey.aws/search-for-tag rawinput216493 "ChangeSetId" :flattened? nil :result-wrapper resultWrapper216494), "Changes" (portkey.aws/search-for-tag rawinput216493 "Changes" :flattened? nil :result-wrapper resultWrapper216494), "Tags" (portkey.aws/search-for-tag rawinput216493 "Tags" :flattened? nil :result-wrapper resultWrapper216494), "Status" (portkey.aws/search-for-tag rawinput216493 "Status" :flattened? nil :result-wrapper resultWrapper216494), "NextToken" (portkey.aws/search-for-tag rawinput216493 "NextToken" :flattened? nil :result-wrapper resultWrapper216494), "Capabilities" (portkey.aws/search-for-tag rawinput216493 "Capabilities" :flattened? nil :result-wrapper resultWrapper216494), "StatusReason" (portkey.aws/search-for-tag rawinput216493 "StatusReason" :flattened? nil :result-wrapper resultWrapper216494), "Description" (portkey.aws/search-for-tag rawinput216493 "Description" :flattened? nil :result-wrapper resultWrapper216494), "StackId" (portkey.aws/search-for-tag rawinput216493 "StackId" :flattened? nil :result-wrapper resultWrapper216494), "CreationTime" (portkey.aws/search-for-tag rawinput216493 "CreationTime" :flattened? nil :result-wrapper resultWrapper216494), "StackName" (portkey.aws/search-for-tag rawinput216493 "StackName" :flattened? nil :result-wrapper resultWrapper216494), "ExecutionStatus" (portkey.aws/search-for-tag rawinput216493 "ExecutionStatus" :flattened? nil :result-wrapper resultWrapper216494)}] (clojure.core/cond-> {} (letvar216495 "NotificationARNs") (clojure.core/assoc :notification-ar-ns (deser-notification-ar-ns (clojure.core/get-in letvar216495 ["NotificationARNs" :content]))) (letvar216495 "RollbackConfiguration") (clojure.core/assoc :rollback-configuration (deser-rollback-configuration (clojure.core/get-in letvar216495 ["RollbackConfiguration" :content]))) (letvar216495 "Parameters") (clojure.core/assoc :parameters (deser-parameters (clojure.core/get-in letvar216495 ["Parameters" :content]))) (letvar216495 "ChangeSetName") (clojure.core/assoc :change-set-name (deser-change-set-name (clojure.core/get-in letvar216495 ["ChangeSetName" :content]))) (letvar216495 "ChangeSetId") (clojure.core/assoc :change-set-id (deser-change-set-id (clojure.core/get-in letvar216495 ["ChangeSetId" :content]))) (letvar216495 "Changes") (clojure.core/assoc :changes (deser-changes (clojure.core/get-in letvar216495 ["Changes" :content]))) (letvar216495 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar216495 ["Tags" :content]))) (letvar216495 "Status") (clojure.core/assoc :status (deser-change-set-status (clojure.core/get-in letvar216495 ["Status" :content]))) (letvar216495 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar216495 ["NextToken" :content]))) (letvar216495 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar216495 ["Capabilities" :content]))) (letvar216495 "StatusReason") (clojure.core/assoc :status-reason (deser-change-set-status-reason (clojure.core/get-in letvar216495 ["StatusReason" :content]))) (letvar216495 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar216495 ["Description" :content]))) (letvar216495 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar216495 ["StackId" :content]))) (letvar216495 "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (clojure.core/get-in letvar216495 ["CreationTime" :content]))) (letvar216495 "StackName") (clojure.core/assoc :stack-name (deser-stack-name (clojure.core/get-in letvar216495 ["StackName" :content]))) (letvar216495 "ExecutionStatus") (clojure.core/assoc :execution-status (deser-execution-status (clojure.core/get-in letvar216495 ["ExecutionStatus" :content])))))))

(clojure.core/defn- response-stack-set-not-empty-exception ([input] (response-stack-set-not-empty-exception nil input)) ([resultWrapper216497 input] (clojure.core/let [rawinput216496 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216498 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detect-stack-drift-output ([input] (response-detect-stack-drift-output nil input)) ([resultWrapper216500 input] (clojure.core/let [rawinput216499 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216501 {"StackDriftDetectionId" (portkey.aws/search-for-tag rawinput216499 "StackDriftDetectionId" :flattened? nil :result-wrapper resultWrapper216500)}] (clojure.core/cond-> {:stack-drift-detection-id (deser-stack-drift-detection-id (clojure.core/get-in letvar216501 ["StackDriftDetectionId" :content]))}))))

(clojure.core/defn- response-change-set-not-found-exception ([input] (response-change-set-not-found-exception nil input)) ([resultWrapper216503 input] (clojure.core/let [rawinput216502 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216504 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-id-already-exists-exception ([input] (response-operation-id-already-exists-exception nil input)) ([resultWrapper216506 input] (clojure.core/let [rawinput216505 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216507 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-stack-set-output ([input] (response-create-stack-set-output nil input)) ([resultWrapper216509 input] (clojure.core/let [rawinput216508 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216510 {"StackSetId" (portkey.aws/search-for-tag rawinput216508 "StackSetId" :flattened? nil :result-wrapper resultWrapper216509)}] (clojure.core/cond-> {} (letvar216510 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar216510 ["StackSetId" :content])))))))

(clojure.core/defn- response-describe-stack-drift-detection-status-output ([input] (response-describe-stack-drift-detection-status-output nil input)) ([resultWrapper216512 input] (clojure.core/let [rawinput216511 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar216513 {"StackId" (portkey.aws/search-for-tag rawinput216511 "StackId" :flattened? nil :result-wrapper resultWrapper216512), "StackDriftDetectionId" (portkey.aws/search-for-tag rawinput216511 "StackDriftDetectionId" :flattened? nil :result-wrapper resultWrapper216512), "StackDriftStatus" (portkey.aws/search-for-tag rawinput216511 "StackDriftStatus" :flattened? nil :result-wrapper resultWrapper216512), "DetectionStatus" (portkey.aws/search-for-tag rawinput216511 "DetectionStatus" :flattened? nil :result-wrapper resultWrapper216512), "DetectionStatusReason" (portkey.aws/search-for-tag rawinput216511 "DetectionStatusReason" :flattened? nil :result-wrapper resultWrapper216512), "DriftedStackResourceCount" (portkey.aws/search-for-tag rawinput216511 "DriftedStackResourceCount" :flattened? nil :result-wrapper resultWrapper216512), "Timestamp" (portkey.aws/search-for-tag rawinput216511 "Timestamp" :flattened? nil :result-wrapper resultWrapper216512)}] (clojure.core/cond-> {:stack-id (deser-stack-id (clojure.core/get-in letvar216513 ["StackId" :content])), :stack-drift-detection-id (deser-stack-drift-detection-id (clojure.core/get-in letvar216513 ["StackDriftDetectionId" :content])), :detection-status (deser-stack-drift-detection-status (clojure.core/get-in letvar216513 ["DetectionStatus" :content])), :timestamp (deser-timestamp (clojure.core/get-in letvar216513 ["Timestamp" :content]))} (letvar216513 "StackDriftStatus") (clojure.core/assoc :stack-drift-status (deser-stack-drift-status (clojure.core/get-in letvar216513 ["StackDriftStatus" :content]))) (letvar216513 "DetectionStatusReason") (clojure.core/assoc :detection-status-reason (deser-stack-drift-detection-status-reason (clojure.core/get-in letvar216513 ["DetectionStatusReason" :content]))) (letvar216513 "DriftedStackResourceCount") (clojure.core/assoc :drifted-stack-resource-count (deser-boxed-integer (clojure.core/get-in letvar216513 ["DriftedStackResourceCount" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/cancel-update-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.resource-change/action (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-action))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.resource-change/details (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/resource-change-details))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.resource-change/action :portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15/replacement :portkey.aws.cloudformation.-2010-05-15/scope :portkey.aws.cloudformation.-2010-05-15.resource-change/details]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/notification-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/notification-arn :max-count 5))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-operation]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-summary/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-summary/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-information-summary))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15.stack-resource-summary/last-updated-timestamp :portkey.aws.cloudformation.-2010-05-15/resource-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-status-reason :portkey.aws.cloudformation.-2010-05-15.stack-resource-summary/drift-information]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/physical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-status #{"CREATE_PENDING" :create-complete "DELETE_COMPLETE" "CREATE_IN_PROGRESS" :create-in-progress :delete-complete "CREATE_COMPLETE" "FAILED" :create-pending :failed})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/imports (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-name))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-drifts (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/validate-template-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/template-url]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-change-set-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.delete-change-set-input/change-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15.delete-change-set-input/stack-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-instances-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-instance-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.list-stack-instances-output/summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-type #{:resource "Resource"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][-a-zA-Z0-9]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-drift-status #{"NOT_CHECKED" "UNKNOWN" :not-checked :unknown "DRIFTED" "IN_SYNC" :in-sync :drifted})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-drift/actual-properties (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/properties))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-drift/expected-properties (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/properties))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-status :portkey.aws.cloudformation.-2010-05-15/timestamp] :opt-un [:portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15.stack-resource-drift/actual-properties :portkey.aws.cloudformation.-2010-05-15/physical-resource-id-context :portkey.aws.cloudformation.-2010-05-15/property-differences :portkey.aws.cloudformation.-2010-05-15.stack-resource-drift/expected-properties]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/boxed-integer clojure.core/int?)

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.detect-stack-resource-drift-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/detect-stack-resource-drift-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.detect-stack-resource-drift-input/stack-name :portkey.aws.cloudformation.-2010-05-15/logical-resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/name-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-type #{:create :update "UPDATE" "CREATE"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/allowed-values (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/allowed-value))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/rollback-trigger (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/arn :portkey.aws.cloudformation.-2010-05-15/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/region-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/region))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/deletion-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:[-a-zA-Z0-9:/]*" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-to-skip (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]+|[a-zA-Z][-a-zA-Z0-9]*\.[a-zA-Z0-9]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/outputs (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/output))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-resource-detail]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-stack-set-input/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/client-request-token :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15.create-stack-set-input/administration-role-arn :portkey.aws.cloudformation.-2010-05-15/execution-role-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-drift-information/last-check-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-information (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15.stack-resource-drift-information/last-check-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/requires-recreation #{"Conditionally" "Always" :conditionally :never "Never" :always})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.parameter-declaration/default-value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameter-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-declaration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/parameter-key :portkey.aws.cloudformation.-2010-05-15.parameter-declaration/default-value :portkey.aws.cloudformation.-2010-05-15/parameter-type :portkey.aws.cloudformation.-2010-05-15/no-echo :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/parameter-constraints]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/property-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resources-to-skip (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/resource-to-skip))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-policy-during-update-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1350))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-drift-information-summary/last-check-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-information-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15.stack-resource-drift-information-summary/last-check-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.template-parameter/default-value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/parameter-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/parameter-key :portkey.aws.cloudformation.-2010-05-15.template-parameter/default-value :portkey.aws.cloudformation.-2010-05-15/no-echo :portkey.aws.cloudformation.-2010-05-15/description]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-stack-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-stack-resource-drifts-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-stack-resource-drifts-input/max-results (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/boxed-max-results))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-drifts-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.describe-stack-resource-drifts-input/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-status-filters :portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15.describe-stack-resource-drifts-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-instance-status #{:outdated "CURRENT" "OUTDATED" :inoperable "INOPERABLE" :current})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-status #{:rollback-failed :delete-failed "UPDATE_ROLLBACK_FAILED" "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" "REVIEW_IN_PROGRESS" :create-complete "ROLLBACK_FAILED" :rollback-in-progress :update-rollback-in-progress "DELETE_IN_PROGRESS" "UPDATE_IN_PROGRESS" "ROLLBACK_IN_PROGRESS" "CREATE_FAILED" :rollback-complete "DELETE_COMPLETE" "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" :update-complete :update-rollback-complete-cleanup-in-progress "CREATE_IN_PROGRESS" :delete-in-progress :create-failed :create-in-progress :delete-complete :update-rollback-complete "CREATE_COMPLETE" :update-rollback-failed "UPDATE_COMPLETE" "ROLLBACK_COMPLETE" :update-in-progress :update-complete-cleanup-in-progress :review-in-progress "DELETE_FAILED" "UPDATE_ROLLBACK_COMPLETE" "UPDATE_ROLLBACK_IN_PROGRESS"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.export/exporting-stack-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.export/name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/export-name))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.export/value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/export-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/export (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.export/exporting-stack-id :portkey.aws.cloudformation.-2010-05-15.export/name :portkey.aws.cloudformation.-2010-05-15.export/value]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/capabilities (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/capability))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/capability #{:capability-named-iam :capability-iam "CAPABILITY_NAMED_IAM" "CAPABILITY_IAM" :capability-auto-expand "CAPABILITY_AUTO_EXPAND"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/transforms-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/transform-name))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/physical-resource-id-context-key-value-pair (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/key :portkey.aws.cloudformation.-2010-05-15/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stacks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stacks :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-instance-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-instance-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.create-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.create-change-set-input/stack-name :portkey.aws.cloudformation.-2010-05-15/change-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/notification-ar-ns :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/rollback-configuration :portkey.aws.cloudformation.-2010-05-15/role-arn :portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/change-set-type :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/use-previous-template :portkey.aws.cloudformation.-2010-05-15/resource-types :portkey.aws.cloudformation.-2010-05-15/client-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-status #{:delete-failed :create-complete "DELETE_IN_PROGRESS" "UPDATE_IN_PROGRESS" "CREATE_FAILED" "DELETE_COMPLETE" "DELETE_SKIPPED" :update-complete "CREATE_IN_PROGRESS" :update-failed :delete-in-progress :create-failed :create-in-progress :delete-complete "CREATE_COMPLETE" "UPDATE_COMPLETE" :update-in-progress :delete-skipped "DELETE_FAILED" "UPDATE_FAILED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-attribute #{:properties :tags "UpdatePolicy" "Tags" "CreationPolicy" :update-policy "Properties" "Metadata" :creation-policy :deletion-policy :metadata "DeletionPolicy"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/exports (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/export))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-instance]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/physical-resource-id-context (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/physical-resource-id-context-key-value-pair :max-count 5))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-signal-status #{"SUCCESS" :failure "FAILURE" :success})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-action #{"DELETE" :create :update :delete "UPDATE" "CREATE"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stale-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-drift-information/last-check-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-drift-information (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-drift-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15.stack-drift-information/last-check-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/failure-tolerance-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9]{12}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-result-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-result-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-result-summary/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-result-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/account :portkey.aws.cloudformation.-2010-05-15/region :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-result-summary/status :portkey.aws.cloudformation.-2010-05-15.stack-set-operation-result-summary/status-reason :portkey.aws.cloudformation.-2010-05-15/account-gate-result]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-drift-detection-status #{"DETECTION_IN_PROGRESS" "DETECTION_FAILED" "DETECTION_COMPLETE" :detection-failed :detection-in-progress :detection-complete})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.account-limit/name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/limit-name))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.account-limit/value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/limit-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.account-limit/name :portkey.aws.cloudformation.-2010-05-15.account-limit/value]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/detect-stack-resource-drift-output (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-resource-drift] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.detect-stack-drift-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/detect-stack-drift-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.detect-stack-drift-input/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/logical-resource-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/properties (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/set-stack-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-policy-body :portkey.aws.cloudformation.-2010-05-15/stack-policy-url]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-stack-instances-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.update-stack-instances-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-imports-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/imports :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/property-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/operation-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-imports-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/export-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stacks (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-drifts-output (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-resource-drifts] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token]))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-drift-detection-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/transform-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-summary/parent-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-summary/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-drift-information-summary))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-summary/root-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/creation-time :portkey.aws.cloudformation.-2010-05-15/stack-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/deletion-time :portkey.aws.cloudformation.-2010-05-15.stack-summary/parent-id :portkey.aws.cloudformation.-2010-05-15/stack-status-reason :portkey.aws.cloudformation.-2010-05-15.stack-summary/drift-information :portkey.aws.cloudformation.-2010-05-15.stack-summary/root-id :portkey.aws.cloudformation.-2010-05-15/last-updated-time :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/template-description]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-set-operations-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.list-stack-set-operations-output/summaries :portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.update-termination-protection-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/enable-termination-protection :portkey.aws.cloudformation.-2010-05-15.update-termination-protection-input/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15.delete-stack-instances-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-declarations (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/parameter-declaration))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stacks-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/stack-status-filter]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-status #{:running :stopping :stopped "SUCCEEDED" "STOPPED" "FAILED" "STOPPING" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/template-url :portkey.aws.cloudformation.-2010-05-15/parameters]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/property-differences (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/property-difference))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/execution-role-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z_0-9+=,.@-]+" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.property-difference/expected-value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/property-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.property-difference/actual-value (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/property-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/property-difference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/property-path :portkey.aws.cloudformation.-2010-05-15.property-difference/expected-value :portkey.aws.cloudformation.-2010-05-15.property-difference/actual-value :portkey.aws.cloudformation.-2010-05-15/difference-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-set-operation-results-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15.list-stack-set-operation-results-input/operation-id] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/enable-termination-protection clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.get-template-output/stages-available (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stage-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-template-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15.get-template-output/stages-available]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-detail/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource-detail/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-information))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15.stack-resource-detail/last-updated-timestamp :portkey.aws.cloudformation.-2010-05-15/resource-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-status-reason :portkey.aws.cloudformation.-2010-05-15.stack-resource-detail/drift-information :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/metadata :portkey.aws.cloudformation.-2010-05-15/stack-name]))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-policy-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1350))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/logical-resource-ids (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/logical-resource-id :min-count 1 :max-count 200))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/execution-status #{:execute-complete :execute-failed :unavailable "AVAILABLE" :obsolete "EXECUTE_FAILED" "EXECUTE_COMPLETE" "OBSOLETE" "UNAVAILABLE" "EXECUTE_IN_PROGRESS" :available :execute-in-progress})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-drift-detection-status-reason (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/difference-type #{"ADD" :remove "REMOVE" :not-equal :add "NOT_EQUAL"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-set-operation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/output-key :portkey.aws.cloudformation.-2010-05-15/output-value :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/export-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/boxed-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/no-echo clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-status-filters (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-status :min-count 1 :max-count 4))

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-status #{"NOT_CHECKED" :deleted :not-checked "IN_SYNC" "MODIFIED" :in-sync :modified "DELETED"})

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

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/detect-stack-drift-output (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-drift-detection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/change-set-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-gate-status #{:skipped "SUCCEEDED" "FAILED" :failed :succeeded "SKIPPED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stage-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/template-stage))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-drift-detection-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-drift-detection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack/parent-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-drift-information))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack/root-id (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15/creation-time :portkey.aws.cloudformation.-2010-05-15/stack-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/notification-ar-ns :portkey.aws.cloudformation.-2010-05-15/rollback-configuration :portkey.aws.cloudformation.-2010-05-15/role-arn :portkey.aws.cloudformation.-2010-05-15.stack/timeout-in-minutes :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/deletion-time :portkey.aws.cloudformation.-2010-05-15/change-set-id :portkey.aws.cloudformation.-2010-05-15.stack/parent-id :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15/disable-rollback :portkey.aws.cloudformation.-2010-05-15/outputs :portkey.aws.cloudformation.-2010-05-15/stack-status-reason :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15.stack/drift-information :portkey.aws.cloudformation.-2010-05-15.stack/root-id :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/last-updated-time :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/enable-termination-protection]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-policy-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/template-body :portkey.aws.cloudformation.-2010-05-15/parameters :portkey.aws.cloudformation.-2010-05-15/tags :portkey.aws.cloudformation.-2010-05-15.stack-set/status :portkey.aws.cloudformation.-2010-05-15/capabilities :portkey.aws.cloudformation.-2010-05-15/stack-set-arn :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15.stack-set/administration-role-arn :portkey.aws.cloudformation.-2010-05-15/stack-set-id :portkey.aws.cloudformation.-2010-05-15/execution-role-name :portkey.aws.cloudformation.-2010-05-15/stack-set-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.get-template-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/get-template-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-name :portkey.aws.cloudformation.-2010-05-15.get-template-input/change-set-name :portkey.aws.cloudformation.-2010-05-15/template-stage]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-drift-information-summary/last-check-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-drift-information-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-drift-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15.stack-drift-information-summary/last-check-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/limit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/scope (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/resource-attribute))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.list-stack-sets-input/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/next-token :portkey.aws.cloudformation.-2010-05-15/max-results :portkey.aws.cloudformation.-2010-05-15.list-stack-sets-input/status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/monitoring-time-in-minutes (clojure.spec.alpha/int-in 0 180))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/account-gate-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-constraints (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/allowed-values]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-resource/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-resource-drift-information))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/logical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-type :portkey.aws.cloudformation.-2010-05-15/timestamp :portkey.aws.cloudformation.-2010-05-15/resource-status] :opt-un [:portkey.aws.cloudformation.-2010-05-15/physical-resource-id :portkey.aws.cloudformation.-2010-05-15/resource-status-reason :portkey.aws.cloudformation.-2010-05-15.stack-resource/drift-information :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/stack-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.execute-change-set-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.execute-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/execute-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15.execute-change-set-input/change-set-name] :opt-un [:portkey.aws.cloudformation.-2010-05-15.execute-change-set-input/stack-name :portkey.aws.cloudformation.-2010-05-15/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-signal-unique-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-status-filter (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/stack-status))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/parameter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/limit-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/causing-entity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/create-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-policy-during-update-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.stack-set-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/stack-set-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-set-name :portkey.aws.cloudformation.-2010-05-15/stack-set-id :portkey.aws.cloudformation.-2010-05-15/description :portkey.aws.cloudformation.-2010-05-15.stack-set-summary/status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-stack-drift-detection-status-output/detection-status (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-drift-detection-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-stack-drift-detection-status-output/detection-status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stack-drift-detection-status-reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15.describe-stack-drift-detection-status-output/drifted-stack-resource-count (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/describe-stack-drift-detection-status-output (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.-2010-05-15/stack-id :portkey.aws.cloudformation.-2010-05-15/stack-drift-detection-id :portkey.aws.cloudformation.-2010-05-15.describe-stack-drift-detection-status-output/detection-status :portkey.aws.cloudformation.-2010-05-15/timestamp] :opt-un [:portkey.aws.cloudformation.-2010-05-15/stack-drift-status :portkey.aws.cloudformation.-2010-05-15.describe-stack-drift-detection-status-output/detection-status-reason :portkey.aws.cloudformation.-2010-05-15.describe-stack-drift-detection-status-output/drifted-stack-resource-count]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/resource-properties (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/timeout-minutes (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudformation.-2010-05-15/template-parameters (clojure.spec.alpha/coll-of :portkey.aws.cloudformation.-2010-05-15/template-parameter))

(clojure.core/defn continue-update-rollback "For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues\nrolling it back to the UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of\nthe failure, you can manually fix the error\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed)\nand continue the rollback. By continuing the rollback, you can return your stack\nto a working state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update\nthe stack again.\n A stack goes into the UPDATE_ROLLBACK_FAILED state when AWS CloudFormation\ncannot roll back all changes after a failed stack update. For example, you might\nhave a stack that is rolling back to an old database instance that was deleted\noutside of AWS CloudFormation. Because AWS CloudFormation doesn't know the\ndatabase was deleted, it assumes that the database instance still exists and\nattempts to roll back to it, causing the update rollback to fail." ([continue-update-rollback-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-continue-update-rollback-input continue-update-rollback-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ContinueUpdateRollbackResult", :http.request.configuration/action "ContinueUpdateRollback", :http.request.configuration/output-deser-fn response-continue-update-rollback-output, :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef continue-update-rollback :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/continue-update-rollback-output))

(clojure.core/defn validate-template "Validates a specified template. AWS CloudFormation first checks if the template\nis valid JSON. If it isn't, AWS CloudFormation checks if the template is valid\nYAML. If both these checks fail, AWS CloudFormation returns a template\nvalidation error." ([] (validate-template {})) ([validate-template-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-validate-template-input validate-template-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/validate-template-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/validate-template-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ValidateTemplateResult", :http.request.configuration/action "ValidateTemplate", :http.request.configuration/output-deser-fn response-validate-template-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef validate-template :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/validate-template-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/validate-template-output))

(clojure.core/defn delete-stack-instances "Deletes stack instances for the specified accounts, in the specified regions." ([delete-stack-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-stack-instances-input delete-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteStackInstancesResult", :http.request.configuration/action "DeleteStackInstances", :http.request.configuration/output-deser-fn response-delete-stack-instances-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation.-2010-05-15/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef delete-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/delete-stack-instances-output))

(clojure.core/defn delete-stack "Deletes a specified stack. Once the call completes successfully, stack deletion\nstarts. Deleted stacks do not show up in the DescribeStacks API if the deletion\nhas been completed successfully." ([delete-stack-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-stack-input delete-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStack", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef delete-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/delete-stack-input) :ret clojure.core/true?)

(clojure.core/defn create-stack-instances "Creates stack instances for the specified accounts, within the specified\nregions. A stack instance refers to a stack in a specific account and region.\nAccounts and Regions are required parameters—you must specify at least one\naccount and one region." ([create-stack-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-stack-instances-input create-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateStackInstancesResult", :http.request.configuration/action "CreateStackInstances", :http.request.configuration/output-deser-fn response-create-stack-instances-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation.-2010-05-15/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception, "LimitExceededException" :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/create-stack-instances-output))

(clojure.core/defn describe-account-limits "Retrieves your account's AWS CloudFormation limits, such as the maximum number\nof stacks that you can create in your account." ([] (describe-account-limits {})) ([describe-account-limits-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-account-limits-input describe-account-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAccountLimitsResult", :http.request.configuration/action "DescribeAccountLimits", :http.request.configuration/output-deser-fn response-describe-account-limits-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-account-limits-output))

(clojure.core/defn list-change-sets "Returns the ID and status of each active change set for a stack. For example,\nAWS CloudFormation lists change sets that are in the CREATE_IN_PROGRESS or\nCREATE_PENDING state." ([list-change-sets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-change-sets-input list-change-sets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-change-sets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-change-sets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListChangeSetsResult", :http.request.configuration/action "ListChangeSets", :http.request.configuration/output-deser-fn response-list-change-sets-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-change-sets :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-change-sets-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-change-sets-output))

(clojure.core/defn detect-stack-drift "Detects whether a stack's actual configuration differs, or has drifted, from\nit's expected configuration, as defined in the stack template and any values\nspecified as template parameters. For each resource in the stack that supports\ndrift detection, AWS CloudFormation compares the actual configuration of the\nresource with its expected template configuration. Only resource properties\nexplicitly defined in the stack template are checked for drift. A stack is\nconsidered to have drifted if one or more of its resources differ from their\nexpected template configurations. For more information, see Detecting\nUnregulated Configuration Changes to Stacks and Resources\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html).\n Use DetectStackDrift to detect drift on all supported resources for a given\nstack, or DetectStackResourceDrift to detect drift on individual resources.\n For a list of stack resources that currently support drift detection, see\nResources that Support Drift Detection\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html).\n DetectStackDrift can take up to several minutes, depending on the number of\nresources contained within the stack. Use DescribeStackDriftDetectionStatus to\nmonitor the progress of a detect stack drift operation. Once the drift detection\noperation has completed, use DescribeStackResourceDrifts to return drift\ninformation about the stack and its resources.\n When detecting drift on a stack, AWS CloudFormation does not detect drift on\nany nested stacks belonging to that stack. Perform DetectStackDrift directly on\nthe nested stack itself." ([detect-stack-drift-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-detect-stack-drift-input detect-stack-drift-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/detect-stack-drift-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/detect-stack-drift-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetectStackDriftResult", :http.request.configuration/action "DetectStackDrift", :http.request.configuration/output-deser-fn response-detect-stack-drift-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef detect-stack-drift :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/detect-stack-drift-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/detect-stack-drift-output))

(clojure.core/defn describe-stack-resources "Returns AWS resource descriptions for running and deleted stacks. If StackName\nis specified, all the associated resources that are part of the stack are\nreturned. If PhysicalResourceId is specified, the associated resources of the\nstack that the resource belongs to are returned.\n Only the first 100 resources will be returned. If your stack has more resources\nthan this, you should use ListStackResources instead.\n For deleted stacks, DescribeStackResources returns resource information for up\nto 90 days after the stack has been deleted.\n You must specify either StackName or PhysicalResourceId, but not both. In\naddition, you can specify LogicalResourceId to filter the returned result. For\nmore information about resources, the LogicalResourceId and PhysicalResourceId,\ngo to the AWS CloudFormation User Guide\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/).\n A ValidationError is returned if you specify both StackName and\nPhysicalResourceId in the same request." ([] (describe-stack-resources {})) ([describe-stack-resources-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stack-resources-input describe-stack-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackResourcesResult", :http.request.configuration/action "DescribeStackResources", :http.request.configuration/output-deser-fn response-describe-stack-resources-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-resources :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-resources-output))

(clojure.core/defn list-stack-sets "Returns summary information about stack sets that are associated with the user." ([] (list-stack-sets {})) ([list-stack-sets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-stack-sets-input list-stack-sets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackSetsResult", :http.request.configuration/action "ListStackSets", :http.request.configuration/output-deser-fn response-list-stack-sets-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stack-sets :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-sets-output))

(clojure.core/defn delete-change-set "Deletes the specified change set. Deleting change sets ensures that no one\nexecutes the wrong change set.\n If the call successfully completes, AWS CloudFormation successfully deleted the\nchange set." ([delete-change-set-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-change-set-input delete-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/delete-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/delete-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteChangeSetResult", :http.request.configuration/action "DeleteChangeSet", :http.request.configuration/output-deser-fn response-delete-change-set-output, :http.request.spec/error-spec {"InvalidChangeSetStatusException" :portkey.aws.cloudformation.-2010-05-15/invalid-change-set-status-exception}})))))
(clojure.spec.alpha/fdef delete-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/delete-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/delete-change-set-output))

(clojure.core/defn describe-stack-set "Returns the description of the specified stack set." ([describe-stack-set-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stack-set-input describe-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackSetResult", :http.request.configuration/action "DescribeStackSet", :http.request.configuration/output-deser-fn response-describe-stack-set-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-output))

(clojure.core/defn update-stack "Updates a stack as specified in the template. After the call completes\nsuccessfully, the stack update starts. You can check the status of the stack via\nthe DescribeStacks action.\n To get a copy of the template for an existing stack, you can use the\nGetTemplate action.\n For more information about creating an update template, updating a stack, and\nmonitoring the progress of the update, see Updating a Stack\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)." ([update-stack-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-stack-input update-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateStackResult", :http.request.configuration/action "UpdateStack", :http.request.configuration/output-deser-fn response-update-stack-output, :http.request.spec/error-spec {"InsufficientCapabilitiesException" :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef update-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/update-stack-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/update-stack-output))

(clojure.core/defn list-imports "Lists all stacks that are importing an exported output value. To modify or\nremove an exported output value, first use this action to see which stacks are\nusing it. To see the exported output values in your account, see ListExports.\n For more information about importing an exported output value, see the\nFn::ImportValue\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html)\nfunction." ([list-imports-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-imports-input list-imports-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-imports-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-imports-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListImportsResult", :http.request.configuration/action "ListImports", :http.request.configuration/output-deser-fn response-list-imports-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-imports :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-imports-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-imports-output))

(clojure.core/defn get-stack-policy "Returns the stack policy for a specified stack. If a stack doesn't have a\npolicy, a null value is returned." ([get-stack-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-stack-policy-input get-stack-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetStackPolicyResult", :http.request.configuration/action "GetStackPolicy", :http.request.configuration/output-deser-fn response-get-stack-policy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-stack-policy :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/get-stack-policy-output))

(clojure.core/defn cancel-update-stack "Cancels an update on the specified stack. If the call completes successfully,\nthe stack rolls back the update and reverts to the previous stack configuration.\n You can cancel only stacks that are in the UPDATE_IN_PROGRESS state." ([cancel-update-stack-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-cancel-update-stack-input cancel-update-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/cancel-update-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelUpdateStack", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef cancel-update-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/cancel-update-stack-input) :ret clojure.core/true?)

(clojure.core/defn list-stack-set-operation-results "Returns summary information about the results of a stack set operation." ([list-stack-set-operation-results-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-stack-set-operation-results-input list-stack-set-operation-results-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackSetOperationResultsResult", :http.request.configuration/action "ListStackSetOperationResults", :http.request.configuration/output-deser-fn response-list-stack-set-operation-results-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation.-2010-05-15/operation-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-set-operation-results :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operation-results-output))

(clojure.core/defn describe-stack-drift-detection-status "Returns information about a stack drift detection operation. A stack drift\ndetection operation detects whether a stack's actual configuration differs, or\nhas drifted, from it's expected configuration, as defined in the stack template\nand any values specified as template parameters. A stack is considered to have\ndrifted if one or more of its resources have drifted. For more information on\nstack and resource drift, see Detecting Unregulated Configuration Changes to\nStacks and Resources\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html).\n Use DetectStackDrift to initiate a stack drift detection operation.\nDetectStackDrift returns a StackDriftDetectionId you can use to monitor the\nprogress of the operation using DescribeStackDriftDetectionStatus. Once the\ndrift detection operation has completed, use DescribeStackResourceDrifts to\nreturn drift information about the stack and its resources." ([describe-stack-drift-detection-status-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stack-drift-detection-status-input describe-stack-drift-detection-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-drift-detection-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-drift-detection-status-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackDriftDetectionStatusResult", :http.request.configuration/action "DescribeStackDriftDetectionStatus", :http.request.configuration/output-deser-fn response-describe-stack-drift-detection-status-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-drift-detection-status :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-drift-detection-status-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-drift-detection-status-output))

(clojure.core/defn describe-stack-resource-drifts "Returns drift information for the resources that have been checked for drift in\nthe specified stack. This includes actual and expected configuration values for\nresources where AWS CloudFormation detects configuration drift.\n For a given stack, there will be one StackResourceDrift for each stack resource\nthat has been checked for drift. Resources that have not yet been checked for\ndrift are not included. Resources that do not currently support drift detection\nare not checked, and so not included. For a list of resources that support drift\ndetection, see Resources that Support Drift Detection\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html).\n Use DetectStackResourceDrift to detect drift on individual resources, or\nDetectStackDrift to detect drift on all supported resources for a given stack." ([describe-stack-resource-drifts-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stack-resource-drifts-input describe-stack-resource-drifts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-drifts-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-drifts-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackResourceDriftsResult", :http.request.configuration/action "DescribeStackResourceDrifts", :http.request.configuration/output-deser-fn response-describe-stack-resource-drifts-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-resource-drifts :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-drifts-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-drifts-output))

(clojure.core/defn create-stack-set "Creates a stack set." ([create-stack-set-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-stack-set-input create-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateStackSetResult", :http.request.configuration/action "CreateStackSet", :http.request.configuration/output-deser-fn response-create-stack-set-output, :http.request.spec/error-spec {"NameAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/name-already-exists-exception, "CreatedButModifiedException" :portkey.aws.cloudformation.-2010-05-15/created-but-modified-exception, "LimitExceededException" :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/create-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/create-stack-set-output))

(clojure.core/defn update-stack-instances "Updates the parameter values for stack instances for the specified accounts,\nwithin the specified regions. A stack instance refers to a stack in a specific\naccount and region.\n You can only update stack instances in regions and accounts where they already\nexist; to create additional stack instances, use CreateStackInstances\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackInstances.html).\n During stack set updates, any parameters overridden for a stack instance are\nnot updated, but retain their overridden value.\n You can only update the parameter values that are specified in the stack set;\nto add or delete a parameter itself, use UpdateStackSet\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html)\nto update the stack set template. If you add a parameter to a template, before\nyou can override the parameter value specified in the stack set you must first\nuse UpdateStackSet\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html)\nto update all stack instances with the updated template and parameter value\nspecified in the stack set. Once a stack instance has been updated with the new\nparameter, you can then override the parameter value using UpdateStackInstances." ([update-stack-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-stack-instances-input update-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateStackInstancesResult", :http.request.configuration/action "UpdateStackInstances", :http.request.configuration/output-deser-fn response-update-stack-instances-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-instance-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation.-2010-05-15/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef update-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/update-stack-instances-output))

(clojure.core/defn describe-stack-instance "Returns the stack instance that's associated with the specified stack set, AWS\naccount, and region.\n For a list of stack instances that are associated with a specific stack set,\nuse ListStackInstances." ([describe-stack-instance-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stack-instance-input describe-stack-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackInstanceResult", :http.request.configuration/action "DescribeStackInstance", :http.request.configuration/output-deser-fn response-describe-stack-instance-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-instance-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-instance :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-instance-output))

(clojure.core/defn update-stack-set "Updates the stack set, and associated stack instances in the specified accounts\nand regions.\n Even if the stack set operation created by updating the stack set fails\n(completely or partially, below or above a specified failure tolerance), the\nstack set is updated with your changes. Subsequent CreateStackInstances calls on\nthe specified stack set use the updated stack set." ([update-stack-set-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-stack-set-input update-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/update-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateStackSetResult", :http.request.configuration/action "UpdateStackSet", :http.request.configuration/output-deser-fn response-update-stack-set-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation.-2010-05-15/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-instance-not-found-exception}})))))
(clojure.spec.alpha/fdef update-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/update-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/update-stack-set-output))

(clojure.core/defn describe-change-set "Returns the inputs for the change set and a list of changes that AWS\nCloudFormation will make if you execute the change set. For more information,\nsee Updating Stacks Using Change Sets\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html)\nin the AWS CloudFormation User Guide." ([describe-change-set-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-change-set-input describe-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeChangeSetResult", :http.request.configuration/action "DescribeChangeSet", :http.request.configuration/output-deser-fn response-describe-change-set-output, :http.request.spec/error-spec {"ChangeSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/change-set-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-change-set-output))

(clojure.core/defn execute-change-set "Updates a stack using the input information that was provided when the specified\nchange set was created. After the call successfully completes, AWS\nCloudFormation starts updating the stack. Use the DescribeStacks action to view\nthe status of the update.\n When you execute a change set, AWS CloudFormation deletes all other change sets\nassociated with the stack because they aren't valid for the updated stack.\n If a stack policy is associated with the stack, AWS CloudFormation enforces the\npolicy during the update. You can't specify a temporary stack policy that\noverrides the current policy." ([execute-change-set-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-execute-change-set-input execute-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/execute-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/execute-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ExecuteChangeSetResult", :http.request.configuration/action "ExecuteChangeSet", :http.request.configuration/output-deser-fn response-execute-change-set-output, :http.request.spec/error-spec {"InvalidChangeSetStatusException" :portkey.aws.cloudformation.-2010-05-15/invalid-change-set-status-exception, "ChangeSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/change-set-not-found-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef execute-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/execute-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/execute-change-set-output))

(clojure.core/defn detect-stack-resource-drift "Returns information about whether a resource's actual configuration differs, or\nhas drifted, from it's expected configuration, as defined in the stack template\nand any values specified as template parameters. This information includes\nactual and expected property values for resources in which AWS CloudFormation\ndetects drift. Only resource properties explicitly defined in the stack template\nare checked for drift. For more information about stack and resource drift, see\nDetecting Unregulated Configuration Changes to Stacks and Resources\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html).\n Use DetectStackResourceDrift to detect drift on individual resources, or\nDetectStackDrift to detect drift on all resources in a given stack that support\ndrift detection.\n Resources that do not currently support drift detection cannot be checked. For\na list of resources that support drift detection, see Resources that Support\nDrift Detection\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html)." ([detect-stack-resource-drift-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-detect-stack-resource-drift-input detect-stack-resource-drift-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/detect-stack-resource-drift-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/detect-stack-resource-drift-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetectStackResourceDriftResult", :http.request.configuration/action "DetectStackResourceDrift", :http.request.configuration/output-deser-fn response-detect-stack-resource-drift-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef detect-stack-resource-drift :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/detect-stack-resource-drift-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/detect-stack-resource-drift-output))

(clojure.core/defn list-exports "Lists all exported output values in the account and region in which you call\nthis action. Use this action to see the exported output values that you can\nimport into other stacks. To import values, use the Fn::ImportValue\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html)\nfunction.\n For more information, see AWS CloudFormation Export Stack Output Values\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-exports.html)." ([] (list-exports {})) ([list-exports-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-exports-input list-exports-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-exports-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-exports-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListExportsResult", :http.request.configuration/action "ListExports", :http.request.configuration/output-deser-fn response-list-exports-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-exports :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/list-exports-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-exports-output))

(clojure.core/defn create-stack "Creates a stack as specified in the template. After the call completes\nsuccessfully, the stack creation starts. You can check the status of the stack\nvia the DescribeStacks API." ([create-stack-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-stack-input create-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/create-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateStackResult", :http.request.configuration/action "CreateStack", :http.request.configuration/output-deser-fn response-create-stack-output, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/already-exists-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/token-already-exists-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception}})))))
(clojure.spec.alpha/fdef create-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/create-stack-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/create-stack-output))

(clojure.core/defn list-stack-resources "Returns descriptions of all resources of the specified stack.\n For deleted stacks, ListStackResources returns resource information for up to\n90 days after the stack has been deleted." ([list-stack-resources-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-stack-resources-input list-stack-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackResourcesResult", :http.request.configuration/action "ListStackResources", :http.request.configuration/output-deser-fn response-list-stack-resources-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stack-resources :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-resources-output))

(clojure.core/defn list-stack-instances "Returns summary information about stack instances that are associated with the\nspecified stack set. You can filter for stack instances that are associated with\na specific AWS account name or region." ([list-stack-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-stack-instances-input list-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackInstancesResult", :http.request.configuration/action "ListStackInstances", :http.request.configuration/output-deser-fn response-list-stack-instances-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-instances-output))

(clojure.core/defn describe-stack-set-operation "Returns the description of the specified stack set operation." ([describe-stack-set-operation-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stack-set-operation-input describe-stack-set-operation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackSetOperationResult", :http.request.configuration/action "DescribeStackSetOperation", :http.request.configuration/output-deser-fn response-describe-stack-set-operation-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation.-2010-05-15/operation-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-set-operation :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-set-operation-output))

(clojure.core/defn get-template-summary "Returns information about a new or existing template. The GetTemplateSummary\naction is useful for viewing parameter information, such as default parameter\nvalues and parameter types, before you create or update a stack or stack set.\n You can use the GetTemplateSummary action when you submit a template, or you\ncan get template information for a stack set, or a running or deleted stack.\n For deleted stacks, GetTemplateSummary returns the template information for up\nto 90 days after the stack has been deleted. If the template does not exist, a\nValidationError is returned." ([] (get-template-summary {})) ([get-template-summary-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-template-summary-input get-template-summary-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/get-template-summary-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/get-template-summary-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetTemplateSummaryResult", :http.request.configuration/action "GetTemplateSummary", :http.request.configuration/output-deser-fn response-get-template-summary-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef get-template-summary :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/get-template-summary-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/get-template-summary-output))

(clojure.core/defn set-stack-policy "Sets a stack policy for a specified stack." ([set-stack-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-stack-policy-input set-stack-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/set-stack-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetStackPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-stack-policy :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/set-stack-policy-input) :ret clojure.core/true?)

(clojure.core/defn list-stack-set-operations "Returns summary information about operations performed on a stack set." ([list-stack-set-operations-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-stack-set-operations-input list-stack-set-operations-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackSetOperationsResult", :http.request.configuration/action "ListStackSetOperations", :http.request.configuration/output-deser-fn response-list-stack-set-operations-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-set-operations :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stack-set-operations-output))

(clojure.core/defn describe-stacks "Returns the description for the specified stack; if no stack name was specified,\nthen it returns the description for all the stacks created.\n If the stack does not exist, an AmazonCloudFormationException is returned." ([] (describe-stacks {})) ([describe-stacks-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stacks-input describe-stacks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stacks-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stacks-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStacksResult", :http.request.configuration/action "DescribeStacks", :http.request.configuration/output-deser-fn response-describe-stacks-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stacks :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/describe-stacks-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stacks-output))

(clojure.core/defn delete-stack-set "Deletes a stack set. Before you can delete a stack set, all of its member stack\ninstances must be deleted. For more information about how to do this, see\nDeleteStackInstances." ([delete-stack-set-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-stack-set-input delete-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteStackSetResult", :http.request.configuration/action "DeleteStackSet", :http.request.configuration/output-deser-fn response-delete-stack-set-output, :http.request.spec/error-spec {"StackSetNotEmptyException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-empty-exception, "OperationInProgressException" :portkey.aws.cloudformation.-2010-05-15/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/delete-stack-set-output))

(clojure.core/defn list-stacks "Returns the summary information for stacks whose status matches the specified\nStackStatusFilter. Summary information for stacks that have been deleted is kept\nfor 90 days after the stack is deleted. If no StackStatusFilter is specified,\nsummary information for all stacks is returned (including existing stacks and\nstacks that have been deleted)." ([] (list-stacks {})) ([list-stacks-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-stacks-input list-stacks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/list-stacks-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/list-stacks-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStacksResult", :http.request.configuration/action "ListStacks", :http.request.configuration/output-deser-fn response-list-stacks-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stacks :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/list-stacks-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/list-stacks-output))

(clojure.core/defn describe-stack-events "Returns all stack related events for a specified stack in reverse chronological\norder. For more information about a stack's event history, go to Stacks\n(http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html)\nin the AWS CloudFormation User Guide.\n You can list events for stacks that have failed to create or have been deleted\nby specifying the unique stack identifier (stack ID)." ([] (describe-stack-events {})) ([describe-stack-events-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stack-events-input describe-stack-events-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackEventsResult", :http.request.configuration/action "DescribeStackEvents", :http.request.configuration/output-deser-fn response-describe-stack-events-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-events :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-events-output))

(clojure.core/defn update-termination-protection "Updates termination protection for the specified stack. If a user attempts to\ndelete a stack with termination protection enabled, the operation fails and the\nstack remains unchanged. For more information, see Protecting a Stack From Being\nDeleted in the AWS CloudFormation User Guide.\n For nested stacks, termination protection is set on the root stack and cannot\nbe changed directly on the nested stack." ([update-termination-protection-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-termination-protection-input update-termination-protection-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateTerminationProtectionResult", :http.request.configuration/action "UpdateTerminationProtection", :http.request.configuration/output-deser-fn response-update-termination-protection-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-termination-protection :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/update-termination-protection-output))

(clojure.core/defn create-change-set "Creates a list of changes that will be applied to a stack so that you can review\nthe changes before executing them. You can create a change set for a stack that\ndoesn't exist or an existing stack. If you create a change set for a stack that\ndoesn't exist, the change set shows all of the resources that AWS CloudFormation\nwill create. If you create a change set for an existing stack, AWS\nCloudFormation compares the stack's information with the information that you\nsubmit in the change set and lists the differences. Use change sets to\nunderstand which resources AWS CloudFormation will create or change, and how it\nwill change resources in an existing stack, before you create or update a stack.\n To create a change set for a stack that doesn't exist, for the ChangeSetType\nparameter, specify CREATE. To create a change set for an existing stack, specify\nUPDATE for the ChangeSetType parameter. After the CreateChangeSet call\nsuccessfully completes, AWS CloudFormation starts creating the change set. To\ncheck the status of the change set or to review it, use the DescribeChangeSet\naction.\n When you are satisfied with the changes the change set will make, execute the\nchange set by using the ExecuteChangeSet action. AWS CloudFormation doesn't make\nchanges until you execute the change set." ([create-change-set-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-change-set-input create-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/create-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/create-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateChangeSetResult", :http.request.configuration/action "CreateChangeSet", :http.request.configuration/output-deser-fn response-create-change-set-output, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.cloudformation.-2010-05-15/already-exists-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation.-2010-05-15/insufficient-capabilities-exception, "LimitExceededException" :portkey.aws.cloudformation.-2010-05-15/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/create-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/create-change-set-output))

(clojure.core/defn signal-resource "Sends a signal to the specified resource with a success or failure status. You\ncan use the SignalResource API in conjunction with a creation policy or update\npolicy. AWS CloudFormation doesn't proceed with a stack creation or update until\nresources receive the required number of signals or the timeout period is\nexceeded. The SignalResource API is useful in cases where you want to send\nsignals from anywhere other than an Amazon EC2 instance." ([signal-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-signal-resource-input signal-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/signal-resource-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SignalResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef signal-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/signal-resource-input) :ret clojure.core/true?)

(clojure.core/defn describe-stack-resource "Returns a description of the specified resource in the specified stack.\n For deleted stacks, DescribeStackResource returns resource information for up\nto 90 days after the stack has been deleted." ([describe-stack-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stack-resource-input describe-stack-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackResourceResult", :http.request.configuration/action "DescribeStackResource", :http.request.configuration/output-deser-fn response-describe-stack-resource-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/describe-stack-resource-output))

(clojure.core/defn stop-stack-set-operation "Stops an in-progress operation on a stack set and its associated stack\ninstances." ([stop-stack-set-operation-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-stack-set-operation-input stop-stack-set-operation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "StopStackSetOperationResult", :http.request.configuration/action "StopStackSetOperation", :http.request.configuration/output-deser-fn response-stop-stack-set-operation-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation.-2010-05-15/operation-not-found-exception, "InvalidOperationException" :portkey.aws.cloudformation.-2010-05-15/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef stop-stack-set-operation :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/stop-stack-set-operation-output))

(clojure.core/defn estimate-template-cost "Returns the estimated monthly cost of a template. The return value is an AWS\nSimple Monthly Calculator URL with a query string that describes the resources\nrequired to run the template." ([] (estimate-template-cost {})) ([estimate-template-cost-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-estimate-template-cost-input estimate-template-cost-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "EstimateTemplateCostResult", :http.request.configuration/action "EstimateTemplateCost", :http.request.configuration/output-deser-fn response-estimate-template-cost-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef estimate-template-cost :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/estimate-template-cost-output))

(clojure.core/defn get-template "Returns the template body for a specified stack. You can get the template for\nrunning or deleted stacks.\n For deleted stacks, GetTemplate returns the template for up to 90 days after\nthe stack has been deleted.\n If the template does not exist, a ValidationError is returned." ([] (get-template {})) ([get-template-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-template-input get-template-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation.-2010-05-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation.-2010-05-15/get-template-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation.-2010-05-15/get-template-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetTemplateResult", :http.request.configuration/action "GetTemplate", :http.request.configuration/output-deser-fn response-get-template-output, :http.request.spec/error-spec {"ChangeSetNotFoundException" :portkey.aws.cloudformation.-2010-05-15/change-set-not-found-exception}})))))
(clojure.spec.alpha/fdef get-template :args (clojure.spec.alpha/? :portkey.aws.cloudformation.-2010-05-15/get-template-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation.-2010-05-15/get-template-output))
