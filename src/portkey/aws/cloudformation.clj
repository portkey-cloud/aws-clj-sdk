(ns portkey.aws.cloudformation (:require [portkey.aws]))

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

(clojure.core/defn- deser-resource-change [input] (clojure.core/let [letvar301400 {"Action" (portkey.aws/search-for-tag input "Action" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Replacement" (portkey.aws/search-for-tag input "Replacement" :flattened? nil :xmlAttribute? nil), "Scope" (portkey.aws/search-for-tag input "Scope" :flattened? nil :xmlAttribute? nil), "Details" (portkey.aws/search-for-tag input "Details" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar301400 "Action") (clojure.core/assoc :action (deser-change-action (clojure.core/get-in letvar301400 ["Action" :content]))) (letvar301400 "LogicalResourceId") (clojure.core/assoc :logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar301400 ["LogicalResourceId" :content]))) (letvar301400 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar301400 ["PhysicalResourceId" :content]))) (letvar301400 "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar301400 ["ResourceType" :content]))) (letvar301400 "Replacement") (clojure.core/assoc :replacement (deser-replacement (clojure.core/get-in letvar301400 ["Replacement" :content]))) (letvar301400 "Scope") (clojure.core/assoc :scope (deser-scope (clojure.core/get-in letvar301400 ["Scope" :content]))) (letvar301400 "Details") (clojure.core/assoc :details (deser-resource-change-details (clojure.core/get-in letvar301400 ["Details" :content]))))))

(clojure.core/defn- deser-notification-ar-ns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notification-arn coll))) input))

(clojure.core/defn- deser-stack-resource-summary [input] (clojure.core/let [letvar301525 {"LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "LastUpdatedTimestamp" (portkey.aws/search-for-tag input "LastUpdatedTimestamp" :flattened? nil :xmlAttribute? nil), "ResourceStatus" (portkey.aws/search-for-tag input "ResourceStatus" :flattened? nil :xmlAttribute? nil), "ResourceStatusReason" (portkey.aws/search-for-tag input "ResourceStatusReason" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar301525 ["LogicalResourceId" :content])), :resource-type (deser-resource-type (clojure.core/get-in letvar301525 ["ResourceType" :content])), :last-updated-timestamp (deser-timestamp (clojure.core/get-in letvar301525 ["LastUpdatedTimestamp" :content])), :resource-status (deser-resource-status (clojure.core/get-in letvar301525 ["ResourceStatus" :content]))} (letvar301525 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar301525 ["PhysicalResourceId" :content]))) (letvar301525 "ResourceStatusReason") (clojure.core/assoc :resource-status-reason (deser-resource-status-reason (clojure.core/get-in letvar301525 ["ResourceStatusReason" :content]))) (letvar301525 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-resource-drift-information-summary (clojure.core/get-in letvar301525 ["DriftInformation" :content]))))))

(clojure.core/defn- deser-physical-resource-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-change-set-status [input] (clojure.core/get {"CREATE_PENDING" :create-pending, "CREATE_IN_PROGRESS" :create-in-progress, "CREATE_COMPLETE" :create-complete, "DELETE_COMPLETE" :delete-complete, "FAILED" :failed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-imports [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-name coll))) input))

(clojure.core/defn- deser-stack-resource-drifts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-resource-drift coll))) input))

(clojure.core/defn- deser-change-type [input] (clojure.core/get {"Resource" :resource} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-client-request-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-rollback-configuration [input] (clojure.core/let [letvar301687 {"RollbackTriggers" (portkey.aws/search-for-tag input "RollbackTriggers" :flattened? nil :xmlAttribute? nil), "MonitoringTimeInMinutes" (portkey.aws/search-for-tag input "MonitoringTimeInMinutes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar301687 "RollbackTriggers") (clojure.core/assoc :rollback-triggers (deser-rollback-triggers (clojure.core/get-in letvar301687 ["RollbackTriggers" :content]))) (letvar301687 "MonitoringTimeInMinutes") (clojure.core/assoc :monitoring-time-in-minutes (deser-monitoring-time-in-minutes (clojure.core/get-in letvar301687 ["MonitoringTimeInMinutes" :content]))))))

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

(clojure.core/defn- deser-account-gate-result [input] (clojure.core/let [letvar301886 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar301886 "Status") (clojure.core/assoc :status (deser-account-gate-status (clojure.core/get-in letvar301886 ["Status" :content]))) (letvar301886 "StatusReason") (clojure.core/assoc :status-reason (deser-account-gate-status-reason (clojure.core/get-in letvar301886 ["StatusReason" :content]))))))

(clojure.core/defn- deser-export-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-events [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-event coll))) input))

(clojure.core/defn- deser-change-set-summary [input] (clojure.core/let [letvar302016 {"ChangeSetName" (portkey.aws/search-for-tag input "ChangeSetName" :flattened? nil :xmlAttribute? nil), "ChangeSetId" (portkey.aws/search-for-tag input "ChangeSetId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "CreationTime" (portkey.aws/search-for-tag input "CreationTime" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil), "ExecutionStatus" (portkey.aws/search-for-tag input "ExecutionStatus" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar302016 "ChangeSetName") (clojure.core/assoc :change-set-name (deser-change-set-name (clojure.core/get-in letvar302016 ["ChangeSetName" :content]))) (letvar302016 "ChangeSetId") (clojure.core/assoc :change-set-id (deser-change-set-id (clojure.core/get-in letvar302016 ["ChangeSetId" :content]))) (letvar302016 "Status") (clojure.core/assoc :status (deser-change-set-status (clojure.core/get-in letvar302016 ["Status" :content]))) (letvar302016 "StatusReason") (clojure.core/assoc :status-reason (deser-change-set-status-reason (clojure.core/get-in letvar302016 ["StatusReason" :content]))) (letvar302016 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar302016 ["Description" :content]))) (letvar302016 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar302016 ["StackId" :content]))) (letvar302016 "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (clojure.core/get-in letvar302016 ["CreationTime" :content]))) (letvar302016 "StackName") (clojure.core/assoc :stack-name (deser-stack-name (clojure.core/get-in letvar302016 ["StackName" :content]))) (letvar302016 "ExecutionStatus") (clojure.core/assoc :execution-status (deser-execution-status (clojure.core/get-in letvar302016 ["ExecutionStatus" :content]))))))

(clojure.core/defn- deser-stack-set-operation-result-status [input] (clojure.core/get {"PENDING" :pending, "RUNNING" :running, "SUCCEEDED" :succeeded, "FAILED" :failed, "CANCELLED" :cancelled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-export-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-template-body [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-resource-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-resource-summary coll))) input))

(clojure.core/defn- deser-stack-set-operation-summary [input] (clojure.core/let [letvar302156 {"OperationId" (portkey.aws/search-for-tag input "OperationId" :flattened? nil :xmlAttribute? nil), "Action" (portkey.aws/search-for-tag input "Action" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreationTimestamp" (portkey.aws/search-for-tag input "CreationTimestamp" :flattened? nil :xmlAttribute? nil), "EndTimestamp" (portkey.aws/search-for-tag input "EndTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar302156 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar302156 ["OperationId" :content]))) (letvar302156 "Action") (clojure.core/assoc :action (deser-stack-set-operation-action (clojure.core/get-in letvar302156 ["Action" :content]))) (letvar302156 "Status") (clojure.core/assoc :status (deser-stack-set-operation-status (clojure.core/get-in letvar302156 ["Status" :content]))) (letvar302156 "CreationTimestamp") (clojure.core/assoc :creation-timestamp (deser-timestamp (clojure.core/get-in letvar302156 ["CreationTimestamp" :content]))) (letvar302156 "EndTimestamp") (clojure.core/assoc :end-timestamp (deser-timestamp (clojure.core/get-in letvar302156 ["EndTimestamp" :content]))))))

(clojure.core/defn- deser-parameters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter coll))) input))

(clojure.core/defn- deser-rollback-triggers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rollback-trigger coll))) input))

(clojure.core/defn- deser-stack-resource-drift [input] (clojure.core/let [letvar302298 {"PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "ActualProperties" (portkey.aws/search-for-tag input "ActualProperties" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "PhysicalResourceIdContext" (portkey.aws/search-for-tag input "PhysicalResourceIdContext" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "PropertyDifferences" (portkey.aws/search-for-tag input "PropertyDifferences" :flattened? nil :xmlAttribute? nil), "Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "StackResourceDriftStatus" (portkey.aws/search-for-tag input "StackResourceDriftStatus" :flattened? nil :xmlAttribute? nil), "ExpectedProperties" (portkey.aws/search-for-tag input "ExpectedProperties" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-id (deser-stack-id (clojure.core/get-in letvar302298 ["StackId" :content])), :logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar302298 ["LogicalResourceId" :content])), :resource-type (deser-resource-type (clojure.core/get-in letvar302298 ["ResourceType" :content])), :stack-resource-drift-status (deser-stack-resource-drift-status (clojure.core/get-in letvar302298 ["StackResourceDriftStatus" :content])), :timestamp (deser-timestamp (clojure.core/get-in letvar302298 ["Timestamp" :content]))} (letvar302298 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar302298 ["PhysicalResourceId" :content]))) (letvar302298 "ActualProperties") (clojure.core/assoc :actual-properties (deser-properties (clojure.core/get-in letvar302298 ["ActualProperties" :content]))) (letvar302298 "PhysicalResourceIdContext") (clojure.core/assoc :physical-resource-id-context (deser-physical-resource-id-context (clojure.core/get-in letvar302298 ["PhysicalResourceIdContext" :content]))) (letvar302298 "PropertyDifferences") (clojure.core/assoc :property-differences (deser-property-differences (clojure.core/get-in letvar302298 ["PropertyDifferences" :content]))) (letvar302298 "ExpectedProperties") (clojure.core/assoc :expected-properties (deser-properties (clojure.core/get-in letvar302298 ["ExpectedProperties" :content]))))))

(clojure.core/defn- deser-boxed-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-instance-summary [input] (clojure.core/let [letvar302408 {"StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "Account" (portkey.aws/search-for-tag input "Account" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar302408 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar302408 ["StackSetId" :content]))) (letvar302408 "Region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar302408 ["Region" :content]))) (letvar302408 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar302408 ["Account" :content]))) (letvar302408 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar302408 ["StackId" :content]))) (letvar302408 "Status") (clojure.core/assoc :status (deser-stack-instance-status (clojure.core/get-in letvar302408 ["Status" :content]))) (letvar302408 "StatusReason") (clojure.core/assoc :status-reason (deser-reason (clojure.core/get-in letvar302408 ["StatusReason" :content]))))))

(clojure.core/defn- deser-stack-instance [input] (clojure.core/let [letvar302516 {"StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "Account" (portkey.aws/search-for-tag input "Account" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ParameterOverrides" (portkey.aws/search-for-tag input "ParameterOverrides" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar302516 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar302516 ["StackSetId" :content]))) (letvar302516 "Region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar302516 ["Region" :content]))) (letvar302516 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar302516 ["Account" :content]))) (letvar302516 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar302516 ["StackId" :content]))) (letvar302516 "ParameterOverrides") (clojure.core/assoc :parameter-overrides (deser-parameters (clojure.core/get-in letvar302516 ["ParameterOverrides" :content]))) (letvar302516 "Status") (clojure.core/assoc :status (deser-stack-instance-status (clojure.core/get-in letvar302516 ["Status" :content]))) (letvar302516 "StatusReason") (clojure.core/assoc :status-reason (deser-reason (clojure.core/get-in letvar302516 ["StatusReason" :content]))))))

(clojure.core/defn- deser-retain-stacks-nullable [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-change-action [input] (clojure.core/get {"Add" :add, "Modify" :modify, "Remove" :remove} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-change-set-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-value coll))) input))

(clojure.core/defn- deser-rollback-trigger [input] (clojure.core/let [letvar302653 {"Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:arn (deser-arn (clojure.core/get-in letvar302653 ["Arn" :content])), :type (deser-type (clojure.core/get-in letvar302653 ["Type" :content]))})))

(clojure.core/defn- deser-region-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-region coll))) input))

(clojure.core/defn- deser-deletion-time [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-change-set-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-changes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-change coll))) input))

(clojure.core/defn- deser-stack-event [input] (clojure.core/let [letvar302807 {"PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "ClientRequestToken" (portkey.aws/search-for-tag input "ClientRequestToken" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceStatusReason" (portkey.aws/search-for-tag input "ResourceStatusReason" :flattened? nil :xmlAttribute? nil), "ResourceStatus" (portkey.aws/search-for-tag input "ResourceStatus" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil), "EventId" (portkey.aws/search-for-tag input "EventId" :flattened? nil :xmlAttribute? nil), "ResourceProperties" (portkey.aws/search-for-tag input "ResourceProperties" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-id (deser-stack-id (clojure.core/get-in letvar302807 ["StackId" :content])), :event-id (deser-event-id (clojure.core/get-in letvar302807 ["EventId" :content])), :stack-name (deser-stack-name (clojure.core/get-in letvar302807 ["StackName" :content])), :timestamp (deser-timestamp (clojure.core/get-in letvar302807 ["Timestamp" :content]))} (letvar302807 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar302807 ["PhysicalResourceId" :content]))) (letvar302807 "ClientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar302807 ["ClientRequestToken" :content]))) (letvar302807 "LogicalResourceId") (clojure.core/assoc :logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar302807 ["LogicalResourceId" :content]))) (letvar302807 "ResourceStatusReason") (clojure.core/assoc :resource-status-reason (deser-resource-status-reason (clojure.core/get-in letvar302807 ["ResourceStatusReason" :content]))) (letvar302807 "ResourceStatus") (clojure.core/assoc :resource-status (deser-resource-status (clojure.core/get-in letvar302807 ["ResourceStatus" :content]))) (letvar302807 "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar302807 ["ResourceType" :content]))) (letvar302807 "ResourceProperties") (clojure.core/assoc :resource-properties (deser-resource-properties (clojure.core/get-in letvar302807 ["ResourceProperties" :content]))))))

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-evaluation-type [input] (clojure.core/get {"Static" :static, "Dynamic" :dynamic} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-template-stage [input] (clojure.core/get {"Original" :original, "Processed" :processed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-notification-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-operation [input] (clojure.core/let [letvar302947 {"EndTimestamp" (portkey.aws/search-for-tag input "EndTimestamp" :flattened? nil :xmlAttribute? nil), "RetainStacks" (portkey.aws/search-for-tag input "RetainStacks" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreationTimestamp" (portkey.aws/search-for-tag input "CreationTimestamp" :flattened? nil :xmlAttribute? nil), "OperationId" (portkey.aws/search-for-tag input "OperationId" :flattened? nil :xmlAttribute? nil), "AdministrationRoleARN" (portkey.aws/search-for-tag input "AdministrationRoleARN" :flattened? nil :xmlAttribute? nil), "StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "ExecutionRoleName" (portkey.aws/search-for-tag input "ExecutionRoleName" :flattened? nil :xmlAttribute? nil), "OperationPreferences" (portkey.aws/search-for-tag input "OperationPreferences" :flattened? nil :xmlAttribute? nil), "Action" (portkey.aws/search-for-tag input "Action" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar302947 "EndTimestamp") (clojure.core/assoc :end-timestamp (deser-timestamp (clojure.core/get-in letvar302947 ["EndTimestamp" :content]))) (letvar302947 "RetainStacks") (clojure.core/assoc :retain-stacks (deser-retain-stacks-nullable (clojure.core/get-in letvar302947 ["RetainStacks" :content]))) (letvar302947 "Status") (clojure.core/assoc :status (deser-stack-set-operation-status (clojure.core/get-in letvar302947 ["Status" :content]))) (letvar302947 "CreationTimestamp") (clojure.core/assoc :creation-timestamp (deser-timestamp (clojure.core/get-in letvar302947 ["CreationTimestamp" :content]))) (letvar302947 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar302947 ["OperationId" :content]))) (letvar302947 "AdministrationRoleARN") (clojure.core/assoc :administration-role-arn (deser-role-arn (clojure.core/get-in letvar302947 ["AdministrationRoleARN" :content]))) (letvar302947 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar302947 ["StackSetId" :content]))) (letvar302947 "ExecutionRoleName") (clojure.core/assoc :execution-role-name (deser-execution-role-name (clojure.core/get-in letvar302947 ["ExecutionRoleName" :content]))) (letvar302947 "OperationPreferences") (clojure.core/assoc :operation-preferences (deser-stack-set-operation-preferences (clojure.core/get-in letvar302947 ["OperationPreferences" :content]))) (letvar302947 "Action") (clojure.core/assoc :action (deser-stack-set-operation-action (clojure.core/get-in letvar302947 ["Action" :content]))))))

(clojure.core/defn- deser-failure-tolerance-percentage [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-disable-rollback [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-capabilities-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-outputs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output coll))) input))

(clojure.core/defn- deser-next-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-resource-drift-information [input] (clojure.core/let [letvar303086 {"StackResourceDriftStatus" (portkey.aws/search-for-tag input "StackResourceDriftStatus" :flattened? nil :xmlAttribute? nil), "LastCheckTimestamp" (portkey.aws/search-for-tag input "LastCheckTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-resource-drift-status (deser-stack-resource-drift-status (clojure.core/get-in letvar303086 ["StackResourceDriftStatus" :content]))} (letvar303086 "LastCheckTimestamp") (clojure.core/assoc :last-check-timestamp (deser-timestamp (clojure.core/get-in letvar303086 ["LastCheckTimestamp" :content]))))))

(clojure.core/defn- deser-requires-recreation [input] (clojure.core/get {"Never" :never, "Conditionally" :conditionally, "Always" :always} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-parameter-declaration [input] (clojure.core/let [letvar303199 {"ParameterKey" (portkey.aws/search-for-tag input "ParameterKey" :flattened? nil :xmlAttribute? nil), "DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "ParameterType" (portkey.aws/search-for-tag input "ParameterType" :flattened? nil :xmlAttribute? nil), "NoEcho" (portkey.aws/search-for-tag input "NoEcho" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "ParameterConstraints" (portkey.aws/search-for-tag input "ParameterConstraints" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar303199 "ParameterKey") (clojure.core/assoc :parameter-key (deser-parameter-key (clojure.core/get-in letvar303199 ["ParameterKey" :content]))) (letvar303199 "DefaultValue") (clojure.core/assoc :default-value (deser-parameter-value (clojure.core/get-in letvar303199 ["DefaultValue" :content]))) (letvar303199 "ParameterType") (clojure.core/assoc :parameter-type (deser-parameter-type (clojure.core/get-in letvar303199 ["ParameterType" :content]))) (letvar303199 "NoEcho") (clojure.core/assoc :no-echo (deser-no-echo (clojure.core/get-in letvar303199 ["NoEcho" :content]))) (letvar303199 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar303199 ["Description" :content]))) (letvar303199 "ParameterConstraints") (clojure.core/assoc :parameter-constraints (deser-parameter-constraints (clojure.core/get-in letvar303199 ["ParameterConstraints" :content]))))))

(clojure.core/defn- deser-property-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-resource-drift-information-summary [input] (clojure.core/let [letvar303317 {"StackResourceDriftStatus" (portkey.aws/search-for-tag input "StackResourceDriftStatus" :flattened? nil :xmlAttribute? nil), "LastCheckTimestamp" (portkey.aws/search-for-tag input "LastCheckTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-resource-drift-status (deser-stack-resource-drift-status (clojure.core/get-in letvar303317 ["StackResourceDriftStatus" :content]))} (letvar303317 "LastCheckTimestamp") (clojure.core/assoc :last-check-timestamp (deser-timestamp (clojure.core/get-in letvar303317 ["LastCheckTimestamp" :content]))))))

(clojure.core/defn- deser-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-template-parameter [input] (clojure.core/let [letvar303430 {"ParameterKey" (portkey.aws/search-for-tag input "ParameterKey" :flattened? nil :xmlAttribute? nil), "DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "NoEcho" (portkey.aws/search-for-tag input "NoEcho" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar303430 "ParameterKey") (clojure.core/assoc :parameter-key (deser-parameter-key (clojure.core/get-in letvar303430 ["ParameterKey" :content]))) (letvar303430 "DefaultValue") (clojure.core/assoc :default-value (deser-parameter-value (clojure.core/get-in letvar303430 ["DefaultValue" :content]))) (letvar303430 "NoEcho") (clojure.core/assoc :no-echo (deser-no-echo (clojure.core/get-in letvar303430 ["NoEcho" :content]))) (letvar303430 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar303430 ["Description" :content]))))))

(clojure.core/defn- deser-resource-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-instance-status [input] (clojure.core/get {"CURRENT" :current, "OUTDATED" :outdated, "INOPERABLE" :inoperable} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-status [input] (clojure.core/get {"UPDATE_ROLLBACK_FAILED" :update-rollback-failed, "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" :update-complete-cleanup-in-progress, "REVIEW_IN_PROGRESS" :review-in-progress, "ROLLBACK_FAILED" :rollback-failed, "DELETE_IN_PROGRESS" :delete-in-progress, "UPDATE_IN_PROGRESS" :update-in-progress, "ROLLBACK_IN_PROGRESS" :rollback-in-progress, "CREATE_FAILED" :create-failed, "DELETE_COMPLETE" :delete-complete, "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" :update-rollback-complete-cleanup-in-progress, "CREATE_IN_PROGRESS" :create-in-progress, "CREATE_COMPLETE" :create-complete, "UPDATE_COMPLETE" :update-complete, "ROLLBACK_COMPLETE" :rollback-complete, "DELETE_FAILED" :delete-failed, "UPDATE_ROLLBACK_COMPLETE" :update-rollback-complete, "UPDATE_ROLLBACK_IN_PROGRESS" :update-rollback-in-progress} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-export [input] (clojure.core/let [letvar303553 {"ExportingStackId" (portkey.aws/search-for-tag input "ExportingStackId" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar303553 "ExportingStackId") (clojure.core/assoc :exporting-stack-id (deser-stack-id (clojure.core/get-in letvar303553 ["ExportingStackId" :content]))) (letvar303553 "Name") (clojure.core/assoc :name (deser-export-name (clojure.core/get-in letvar303553 ["Name" :content]))) (letvar303553 "Value") (clojure.core/assoc :value (deser-export-value (clojure.core/get-in letvar303553 ["Value" :content]))))))

(clojure.core/defn- deser-capabilities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-capability coll))) input))

(clojure.core/defn- deser-capability [input] (clojure.core/get {"CAPABILITY_IAM" :capability-iam, "CAPABILITY_NAMED_IAM" :capability-named-iam, "CAPABILITY_AUTO_EXPAND" :capability-auto-expand} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-transforms-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transform-name coll))) input))

(clojure.core/defn- deser-physical-resource-id-context-key-value-pair [input] (clojure.core/let [letvar303700 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-key (clojure.core/get-in letvar303700 ["Key" :content])), :value (deser-value (clojure.core/get-in letvar303700 ["Value" :content]))})))

(clojure.core/defn- deser-stack-instance-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-instance-summary coll))) input))

(clojure.core/defn- deser-resource-status [input] (clojure.core/get {"DELETE_IN_PROGRESS" :delete-in-progress, "UPDATE_IN_PROGRESS" :update-in-progress, "CREATE_FAILED" :create-failed, "DELETE_COMPLETE" :delete-complete, "DELETE_SKIPPED" :delete-skipped, "CREATE_IN_PROGRESS" :create-in-progress, "CREATE_COMPLETE" :create-complete, "UPDATE_COMPLETE" :update-complete, "DELETE_FAILED" :delete-failed, "UPDATE_FAILED" :update-failed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-attribute [input] (clojure.core/get {"Properties" :properties, "Metadata" :metadata, "CreationPolicy" :creation-policy, "UpdatePolicy" :update-policy, "DeletionPolicy" :deletion-policy, "Tags" :tags} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-exports [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-export coll))) input))

(clojure.core/defn- deser-physical-resource-id-context [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-physical-resource-id-context-key-value-pair coll))) input))

(clojure.core/defn- deser-stack-set-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-operation-action [input] (clojure.core/get {"CREATE" :create, "UPDATE" :update, "DELETE" :delete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-drift-information [input] (clojure.core/let [letvar303884 {"StackDriftStatus" (portkey.aws/search-for-tag input "StackDriftStatus" :flattened? nil :xmlAttribute? nil), "LastCheckTimestamp" (portkey.aws/search-for-tag input "LastCheckTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-drift-status (deser-stack-drift-status (clojure.core/get-in letvar303884 ["StackDriftStatus" :content]))} (letvar303884 "LastCheckTimestamp") (clojure.core/assoc :last-check-timestamp (deser-timestamp (clojure.core/get-in letvar303884 ["LastCheckTimestamp" :content]))))))

(clojure.core/defn- deser-failure-tolerance-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-account [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-operation-result-summary [input] (clojure.core/let [letvar303999 {"Account" (portkey.aws/search-for-tag input "Account" :flattened? nil :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "StatusReason" (portkey.aws/search-for-tag input "StatusReason" :flattened? nil :xmlAttribute? nil), "AccountGateResult" (portkey.aws/search-for-tag input "AccountGateResult" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar303999 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar303999 ["Account" :content]))) (letvar303999 "Region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar303999 ["Region" :content]))) (letvar303999 "Status") (clojure.core/assoc :status (deser-stack-set-operation-result-status (clojure.core/get-in letvar303999 ["Status" :content]))) (letvar303999 "StatusReason") (clojure.core/assoc :status-reason (deser-reason (clojure.core/get-in letvar303999 ["StatusReason" :content]))) (letvar303999 "AccountGateResult") (clojure.core/assoc :account-gate-result (deser-account-gate-result (clojure.core/get-in letvar303999 ["AccountGateResult" :content]))))))

(clojure.core/defn- deser-stack-drift-detection-status [input] (clojure.core/get {"DETECTION_IN_PROGRESS" :detection-in-progress, "DETECTION_FAILED" :detection-failed, "DETECTION_COMPLETE" :detection-complete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-url [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-account-limit [input] (clojure.core/let [letvar304117 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar304117 "Name") (clojure.core/assoc :name (deser-limit-name (clojure.core/get-in letvar304117 ["Name" :content]))) (letvar304117 "Value") (clojure.core/assoc :value (deser-limit-value (clojure.core/get-in letvar304117 ["Value" :content]))))))

(clojure.core/defn- deser-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-properties [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-property-path [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stacks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack coll))) input))

(clojure.core/defn- deser-max-concurrent-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-change [input] (clojure.core/let [letvar304264 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "ResourceChange" (portkey.aws/search-for-tag input "ResourceChange" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar304264 "Type") (clojure.core/assoc :type (deser-change-type (clojure.core/get-in letvar304264 ["Type" :content]))) (letvar304264 "ResourceChange") (clojure.core/assoc :resource-change (deser-resource-change (clojure.core/get-in letvar304264 ["ResourceChange" :content]))))))

(clojure.core/defn- deser-resource-target-definition [input] (clojure.core/let [letvar304372 {"Attribute" (portkey.aws/search-for-tag input "Attribute" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "RequiresRecreation" (portkey.aws/search-for-tag input "RequiresRecreation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar304372 "Attribute") (clojure.core/assoc :attribute (deser-resource-attribute (clojure.core/get-in letvar304372 ["Attribute" :content]))) (letvar304372 "Name") (clojure.core/assoc :name (deser-property-name (clojure.core/get-in letvar304372 ["Name" :content]))) (letvar304372 "RequiresRecreation") (clojure.core/assoc :requires-recreation (deser-requires-recreation (clojure.core/get-in letvar304372 ["RequiresRecreation" :content]))))))

(clojure.core/defn- deser-last-updated-time [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-parameter [input] (clojure.core/let [letvar304482 {"ParameterKey" (portkey.aws/search-for-tag input "ParameterKey" :flattened? nil :xmlAttribute? nil), "ParameterValue" (portkey.aws/search-for-tag input "ParameterValue" :flattened? nil :xmlAttribute? nil), "UsePreviousValue" (portkey.aws/search-for-tag input "UsePreviousValue" :flattened? nil :xmlAttribute? nil), "ResolvedValue" (portkey.aws/search-for-tag input "ResolvedValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar304482 "ParameterKey") (clojure.core/assoc :parameter-key (deser-parameter-key (clojure.core/get-in letvar304482 ["ParameterKey" :content]))) (letvar304482 "ParameterValue") (clojure.core/assoc :parameter-value (deser-parameter-value (clojure.core/get-in letvar304482 ["ParameterValue" :content]))) (letvar304482 "UsePreviousValue") (clojure.core/assoc :use-previous-value (deser-use-previous-value (clojure.core/get-in letvar304482 ["UsePreviousValue" :content]))) (letvar304482 "ResolvedValue") (clojure.core/assoc :resolved-value (deser-parameter-value (clojure.core/get-in letvar304482 ["ResolvedValue" :content]))))))

(clojure.core/defn- deser-stack-drift-detection-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-transform-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-summary [input] (clojure.core/let [letvar304605 {"DeletionTime" (portkey.aws/search-for-tag input "DeletionTime" :flattened? nil :xmlAttribute? nil), "ParentId" (portkey.aws/search-for-tag input "ParentId" :flattened? nil :xmlAttribute? nil), "StackStatusReason" (portkey.aws/search-for-tag input "StackStatusReason" :flattened? nil :xmlAttribute? nil), "StackStatus" (portkey.aws/search-for-tag input "StackStatus" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil), "RootId" (portkey.aws/search-for-tag input "RootId" :flattened? nil :xmlAttribute? nil), "LastUpdatedTime" (portkey.aws/search-for-tag input "LastUpdatedTime" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "CreationTime" (portkey.aws/search-for-tag input "CreationTime" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil), "TemplateDescription" (portkey.aws/search-for-tag input "TemplateDescription" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-name (deser-stack-name (clojure.core/get-in letvar304605 ["StackName" :content])), :creation-time (deser-creation-time (clojure.core/get-in letvar304605 ["CreationTime" :content])), :stack-status (deser-stack-status (clojure.core/get-in letvar304605 ["StackStatus" :content]))} (letvar304605 "DeletionTime") (clojure.core/assoc :deletion-time (deser-deletion-time (clojure.core/get-in letvar304605 ["DeletionTime" :content]))) (letvar304605 "ParentId") (clojure.core/assoc :parent-id (deser-stack-id (clojure.core/get-in letvar304605 ["ParentId" :content]))) (letvar304605 "StackStatusReason") (clojure.core/assoc :stack-status-reason (deser-stack-status-reason (clojure.core/get-in letvar304605 ["StackStatusReason" :content]))) (letvar304605 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-drift-information-summary (clojure.core/get-in letvar304605 ["DriftInformation" :content]))) (letvar304605 "RootId") (clojure.core/assoc :root-id (deser-stack-id (clojure.core/get-in letvar304605 ["RootId" :content]))) (letvar304605 "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-last-updated-time (clojure.core/get-in letvar304605 ["LastUpdatedTime" :content]))) (letvar304605 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar304605 ["StackId" :content]))) (letvar304605 "TemplateDescription") (clojure.core/assoc :template-description (deser-template-description (clojure.core/get-in letvar304605 ["TemplateDescription" :content]))))))

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

(clojure.core/defn- deser-property-difference [input] (clojure.core/let [letvar304801 {"PropertyPath" (portkey.aws/search-for-tag input "PropertyPath" :flattened? nil :xmlAttribute? nil), "ExpectedValue" (portkey.aws/search-for-tag input "ExpectedValue" :flattened? nil :xmlAttribute? nil), "ActualValue" (portkey.aws/search-for-tag input "ActualValue" :flattened? nil :xmlAttribute? nil), "DifferenceType" (portkey.aws/search-for-tag input "DifferenceType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:property-path (deser-property-path (clojure.core/get-in letvar304801 ["PropertyPath" :content])), :expected-value (deser-property-value (clojure.core/get-in letvar304801 ["ExpectedValue" :content])), :actual-value (deser-property-value (clojure.core/get-in letvar304801 ["ActualValue" :content])), :difference-type (deser-difference-type (clojure.core/get-in letvar304801 ["DifferenceType" :content]))})))

(clojure.core/defn- deser-enable-termination-protection [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-stack-resource-detail [input] (clojure.core/let [letvar304911 {"PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "LastUpdatedTimestamp" (portkey.aws/search-for-tag input "LastUpdatedTimestamp" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceStatusReason" (portkey.aws/search-for-tag input "ResourceStatusReason" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil), "ResourceStatus" (portkey.aws/search-for-tag input "ResourceStatus" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Metadata" (portkey.aws/search-for-tag input "Metadata" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar304911 ["LogicalResourceId" :content])), :resource-type (deser-resource-type (clojure.core/get-in letvar304911 ["ResourceType" :content])), :last-updated-timestamp (deser-timestamp (clojure.core/get-in letvar304911 ["LastUpdatedTimestamp" :content])), :resource-status (deser-resource-status (clojure.core/get-in letvar304911 ["ResourceStatus" :content]))} (letvar304911 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar304911 ["PhysicalResourceId" :content]))) (letvar304911 "ResourceStatusReason") (clojure.core/assoc :resource-status-reason (deser-resource-status-reason (clojure.core/get-in letvar304911 ["ResourceStatusReason" :content]))) (letvar304911 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-resource-drift-information (clojure.core/get-in letvar304911 ["DriftInformation" :content]))) (letvar304911 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar304911 ["Description" :content]))) (letvar304911 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar304911 ["StackId" :content]))) (letvar304911 "Metadata") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar304911 ["Metadata" :content]))) (letvar304911 "StackName") (clojure.core/assoc :stack-name (deser-stack-name (clojure.core/get-in letvar304911 ["StackName" :content]))))))

(clojure.core/defn- deser-allowed-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metadata [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-execution-status [input] (clojure.core/get {"UNAVAILABLE" :unavailable, "AVAILABLE" :available, "EXECUTE_IN_PROGRESS" :execute-in-progress, "EXECUTE_COMPLETE" :execute-complete, "EXECUTE_FAILED" :execute-failed, "OBSOLETE" :obsolete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-set-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-drift-detection-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-set-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar305068 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar305068 ["Key" :content])), :value (deser-tag-value (clojure.core/get-in letvar305068 ["Value" :content]))})))

(clojure.core/defn- deser-stack-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-summary coll))) input))

(clojure.core/defn- deser-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-version [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-replacement [input] (clojure.core/get {"True" :true, "False" :false, "Conditional" :conditional} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-difference-type [input] (clojure.core/get {"ADD" :add, "REMOVE" :remove, "NOT_EQUAL" :not-equal} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-set-operation-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-set-operation-summary coll))) input))

(clojure.core/defn- deser-output [input] (clojure.core/let [letvar305230 {"OutputKey" (portkey.aws/search-for-tag input "OutputKey" :flattened? nil :xmlAttribute? nil), "OutputValue" (portkey.aws/search-for-tag input "OutputValue" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "ExportName" (portkey.aws/search-for-tag input "ExportName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar305230 "OutputKey") (clojure.core/assoc :output-key (deser-output-key (clojure.core/get-in letvar305230 ["OutputKey" :content]))) (letvar305230 "OutputValue") (clojure.core/assoc :output-value (deser-output-value (clojure.core/get-in letvar305230 ["OutputValue" :content]))) (letvar305230 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar305230 ["Description" :content]))) (letvar305230 "ExportName") (clojure.core/assoc :export-name (deser-export-name (clojure.core/get-in letvar305230 ["ExportName" :content]))))))

(clojure.core/defn- deser-no-echo [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-resource-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-type coll))) input))

(clojure.core/defn- deser-template-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-use-previous-value [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-output-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-event-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-max-concurrent-percentage [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-change-detail [input] (clojure.core/let [letvar305376 {"Target" (portkey.aws/search-for-tag input "Target" :flattened? nil :xmlAttribute? nil), "Evaluation" (portkey.aws/search-for-tag input "Evaluation" :flattened? nil :xmlAttribute? nil), "ChangeSource" (portkey.aws/search-for-tag input "ChangeSource" :flattened? nil :xmlAttribute? nil), "CausingEntity" (portkey.aws/search-for-tag input "CausingEntity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar305376 "Target") (clojure.core/assoc :target (deser-resource-target-definition (clojure.core/get-in letvar305376 ["Target" :content]))) (letvar305376 "Evaluation") (clojure.core/assoc :evaluation (deser-evaluation-type (clojure.core/get-in letvar305376 ["Evaluation" :content]))) (letvar305376 "ChangeSource") (clojure.core/assoc :change-source (deser-change-source (clojure.core/get-in letvar305376 ["ChangeSource" :content]))) (letvar305376 "CausingEntity") (clojure.core/assoc :causing-entity (deser-causing-entity (clojure.core/get-in letvar305376 ["CausingEntity" :content]))))))

(clojure.core/defn- deser-stack-resource-drift-status [input] (clojure.core/get {"IN_SYNC" :in-sync, "MODIFIED" :modified, "DELETED" :deleted, "NOT_CHECKED" :not-checked} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stack-set-operation-result-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stack-set-operation-result-summary coll))) input))

(clojure.core/defn- deser-output-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-operation-preferences [input] (clojure.core/let [letvar305511 {"RegionOrder" (portkey.aws/search-for-tag input "RegionOrder" :flattened? nil :xmlAttribute? nil), "FailureToleranceCount" (portkey.aws/search-for-tag input "FailureToleranceCount" :flattened? nil :xmlAttribute? nil), "FailureTolerancePercentage" (portkey.aws/search-for-tag input "FailureTolerancePercentage" :flattened? nil :xmlAttribute? nil), "MaxConcurrentCount" (portkey.aws/search-for-tag input "MaxConcurrentCount" :flattened? nil :xmlAttribute? nil), "MaxConcurrentPercentage" (portkey.aws/search-for-tag input "MaxConcurrentPercentage" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar305511 "RegionOrder") (clojure.core/assoc :region-order (deser-region-list (clojure.core/get-in letvar305511 ["RegionOrder" :content]))) (letvar305511 "FailureToleranceCount") (clojure.core/assoc :failure-tolerance-count (deser-failure-tolerance-count (clojure.core/get-in letvar305511 ["FailureToleranceCount" :content]))) (letvar305511 "FailureTolerancePercentage") (clojure.core/assoc :failure-tolerance-percentage (deser-failure-tolerance-percentage (clojure.core/get-in letvar305511 ["FailureTolerancePercentage" :content]))) (letvar305511 "MaxConcurrentCount") (clojure.core/assoc :max-concurrent-count (deser-max-concurrent-count (clojure.core/get-in letvar305511 ["MaxConcurrentCount" :content]))) (letvar305511 "MaxConcurrentPercentage") (clojure.core/assoc :max-concurrent-percentage (deser-max-concurrent-percentage (clojure.core/get-in letvar305511 ["MaxConcurrentPercentage" :content]))))))

(clojure.core/defn- deser-account-gate-status [input] (clojure.core/get {"SUCCEEDED" :succeeded, "FAILED" :failed, "SKIPPED" :skipped} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stage-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-template-stage coll))) input))

(clojure.core/defn- deser-stack [input] (clojure.core/let [letvar305641 {"NotificationARNs" (portkey.aws/search-for-tag input "NotificationARNs" :flattened? nil :xmlAttribute? nil), "RollbackConfiguration" (portkey.aws/search-for-tag input "RollbackConfiguration" :flattened? nil :xmlAttribute? nil), "RoleARN" (portkey.aws/search-for-tag input "RoleARN" :flattened? nil :xmlAttribute? nil), "TimeoutInMinutes" (portkey.aws/search-for-tag input "TimeoutInMinutes" :flattened? nil :xmlAttribute? nil), "Parameters" (portkey.aws/search-for-tag input "Parameters" :flattened? nil :xmlAttribute? nil), "DeletionTime" (portkey.aws/search-for-tag input "DeletionTime" :flattened? nil :xmlAttribute? nil), "ChangeSetId" (portkey.aws/search-for-tag input "ChangeSetId" :flattened? nil :xmlAttribute? nil), "ParentId" (portkey.aws/search-for-tag input "ParentId" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "DisableRollback" (portkey.aws/search-for-tag input "DisableRollback" :flattened? nil :xmlAttribute? nil), "Outputs" (portkey.aws/search-for-tag input "Outputs" :flattened? nil :xmlAttribute? nil), "StackStatusReason" (portkey.aws/search-for-tag input "StackStatusReason" :flattened? nil :xmlAttribute? nil), "StackStatus" (portkey.aws/search-for-tag input "StackStatus" :flattened? nil :xmlAttribute? nil), "Capabilities" (portkey.aws/search-for-tag input "Capabilities" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil), "RootId" (portkey.aws/search-for-tag input "RootId" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "LastUpdatedTime" (portkey.aws/search-for-tag input "LastUpdatedTime" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "CreationTime" (portkey.aws/search-for-tag input "CreationTime" :flattened? nil :xmlAttribute? nil), "EnableTerminationProtection" (portkey.aws/search-for-tag input "EnableTerminationProtection" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-name (deser-stack-name (clojure.core/get-in letvar305641 ["StackName" :content])), :creation-time (deser-creation-time (clojure.core/get-in letvar305641 ["CreationTime" :content])), :stack-status (deser-stack-status (clojure.core/get-in letvar305641 ["StackStatus" :content]))} (letvar305641 "NotificationARNs") (clojure.core/assoc :notification-ar-ns (deser-notification-ar-ns (clojure.core/get-in letvar305641 ["NotificationARNs" :content]))) (letvar305641 "RollbackConfiguration") (clojure.core/assoc :rollback-configuration (deser-rollback-configuration (clojure.core/get-in letvar305641 ["RollbackConfiguration" :content]))) (letvar305641 "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar305641 ["RoleARN" :content]))) (letvar305641 "TimeoutInMinutes") (clojure.core/assoc :timeout-in-minutes (deser-timeout-minutes (clojure.core/get-in letvar305641 ["TimeoutInMinutes" :content]))) (letvar305641 "Parameters") (clojure.core/assoc :parameters (deser-parameters (clojure.core/get-in letvar305641 ["Parameters" :content]))) (letvar305641 "DeletionTime") (clojure.core/assoc :deletion-time (deser-deletion-time (clojure.core/get-in letvar305641 ["DeletionTime" :content]))) (letvar305641 "ChangeSetId") (clojure.core/assoc :change-set-id (deser-change-set-id (clojure.core/get-in letvar305641 ["ChangeSetId" :content]))) (letvar305641 "ParentId") (clojure.core/assoc :parent-id (deser-stack-id (clojure.core/get-in letvar305641 ["ParentId" :content]))) (letvar305641 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar305641 ["Tags" :content]))) (letvar305641 "DisableRollback") (clojure.core/assoc :disable-rollback (deser-disable-rollback (clojure.core/get-in letvar305641 ["DisableRollback" :content]))) (letvar305641 "Outputs") (clojure.core/assoc :outputs (deser-outputs (clojure.core/get-in letvar305641 ["Outputs" :content]))) (letvar305641 "StackStatusReason") (clojure.core/assoc :stack-status-reason (deser-stack-status-reason (clojure.core/get-in letvar305641 ["StackStatusReason" :content]))) (letvar305641 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar305641 ["Capabilities" :content]))) (letvar305641 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-drift-information (clojure.core/get-in letvar305641 ["DriftInformation" :content]))) (letvar305641 "RootId") (clojure.core/assoc :root-id (deser-stack-id (clojure.core/get-in letvar305641 ["RootId" :content]))) (letvar305641 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar305641 ["Description" :content]))) (letvar305641 "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-last-updated-time (clojure.core/get-in letvar305641 ["LastUpdatedTime" :content]))) (letvar305641 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar305641 ["StackId" :content]))) (letvar305641 "EnableTerminationProtection") (clojure.core/assoc :enable-termination-protection (deser-enable-termination-protection (clojure.core/get-in letvar305641 ["EnableTerminationProtection" :content]))))))

(clojure.core/defn- deser-stack-policy-body [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set [input] (clojure.core/let [letvar305754 {"TemplateBody" (portkey.aws/search-for-tag input "TemplateBody" :flattened? nil :xmlAttribute? nil), "Parameters" (portkey.aws/search-for-tag input "Parameters" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Capabilities" (portkey.aws/search-for-tag input "Capabilities" :flattened? nil :xmlAttribute? nil), "StackSetARN" (portkey.aws/search-for-tag input "StackSetARN" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "AdministrationRoleARN" (portkey.aws/search-for-tag input "AdministrationRoleARN" :flattened? nil :xmlAttribute? nil), "StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "ExecutionRoleName" (portkey.aws/search-for-tag input "ExecutionRoleName" :flattened? nil :xmlAttribute? nil), "StackSetName" (portkey.aws/search-for-tag input "StackSetName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar305754 "TemplateBody") (clojure.core/assoc :template-body (deser-template-body (clojure.core/get-in letvar305754 ["TemplateBody" :content]))) (letvar305754 "Parameters") (clojure.core/assoc :parameters (deser-parameters (clojure.core/get-in letvar305754 ["Parameters" :content]))) (letvar305754 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar305754 ["Tags" :content]))) (letvar305754 "Status") (clojure.core/assoc :status (deser-stack-set-status (clojure.core/get-in letvar305754 ["Status" :content]))) (letvar305754 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar305754 ["Capabilities" :content]))) (letvar305754 "StackSetARN") (clojure.core/assoc :stack-set-arn (deser-stack-set-arn (clojure.core/get-in letvar305754 ["StackSetARN" :content]))) (letvar305754 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar305754 ["Description" :content]))) (letvar305754 "AdministrationRoleARN") (clojure.core/assoc :administration-role-arn (deser-role-arn (clojure.core/get-in letvar305754 ["AdministrationRoleARN" :content]))) (letvar305754 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar305754 ["StackSetId" :content]))) (letvar305754 "ExecutionRoleName") (clojure.core/assoc :execution-role-name (deser-execution-role-name (clojure.core/get-in letvar305754 ["ExecutionRoleName" :content]))) (letvar305754 "StackSetName") (clojure.core/assoc :stack-set-name (deser-stack-set-name (clojure.core/get-in letvar305754 ["StackSetName" :content]))))))

(clojure.core/defn- deser-stack-drift-information-summary [input] (clojure.core/let [letvar305862 {"StackDriftStatus" (portkey.aws/search-for-tag input "StackDriftStatus" :flattened? nil :xmlAttribute? nil), "LastCheckTimestamp" (portkey.aws/search-for-tag input "LastCheckTimestamp" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:stack-drift-status (deser-stack-drift-status (clojure.core/get-in letvar305862 ["StackDriftStatus" :content]))} (letvar305862 "LastCheckTimestamp") (clojure.core/assoc :last-check-timestamp (deser-timestamp (clojure.core/get-in letvar305862 ["LastCheckTimestamp" :content]))))))

(clojure.core/defn- deser-limit-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-region [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-scope [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-attribute coll))) input))

(clojure.core/defn- deser-monitoring-time-in-minutes [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-account-gate-status-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-parameter-constraints [input] (clojure.core/let [letvar306004 {"AllowedValues" (portkey.aws/search-for-tag input "AllowedValues" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar306004 "AllowedValues") (clojure.core/assoc :allowed-values (deser-allowed-values (clojure.core/get-in letvar306004 ["AllowedValues" :content]))))))

(clojure.core/defn- deser-stack-resource [input] (clojure.core/let [letvar306112 {"PhysicalResourceId" (portkey.aws/search-for-tag input "PhysicalResourceId" :flattened? nil :xmlAttribute? nil), "LogicalResourceId" (portkey.aws/search-for-tag input "LogicalResourceId" :flattened? nil :xmlAttribute? nil), "ResourceStatusReason" (portkey.aws/search-for-tag input "ResourceStatusReason" :flattened? nil :xmlAttribute? nil), "DriftInformation" (portkey.aws/search-for-tag input "DriftInformation" :flattened? nil :xmlAttribute? nil), "ResourceStatus" (portkey.aws/search-for-tag input "ResourceStatus" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "StackId" (portkey.aws/search-for-tag input "StackId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "StackName" (portkey.aws/search-for-tag input "StackName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:logical-resource-id (deser-logical-resource-id (clojure.core/get-in letvar306112 ["LogicalResourceId" :content])), :resource-type (deser-resource-type (clojure.core/get-in letvar306112 ["ResourceType" :content])), :timestamp (deser-timestamp (clojure.core/get-in letvar306112 ["Timestamp" :content])), :resource-status (deser-resource-status (clojure.core/get-in letvar306112 ["ResourceStatus" :content]))} (letvar306112 "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (clojure.core/get-in letvar306112 ["PhysicalResourceId" :content]))) (letvar306112 "ResourceStatusReason") (clojure.core/assoc :resource-status-reason (deser-resource-status-reason (clojure.core/get-in letvar306112 ["ResourceStatusReason" :content]))) (letvar306112 "DriftInformation") (clojure.core/assoc :drift-information (deser-stack-resource-drift-information (clojure.core/get-in letvar306112 ["DriftInformation" :content]))) (letvar306112 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar306112 ["Description" :content]))) (letvar306112 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar306112 ["StackId" :content]))) (letvar306112 "StackName") (clojure.core/assoc :stack-name (deser-stack-name (clojure.core/get-in letvar306112 ["StackName" :content]))))))

(clojure.core/defn- deser-parameter-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-limit-value [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-causing-entity [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stack-set-summary [input] (clojure.core/let [letvar306232 {"StackSetName" (portkey.aws/search-for-tag input "StackSetName" :flattened? nil :xmlAttribute? nil), "StackSetId" (portkey.aws/search-for-tag input "StackSetId" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar306232 "StackSetName") (clojure.core/assoc :stack-set-name (deser-stack-set-name (clojure.core/get-in letvar306232 ["StackSetName" :content]))) (letvar306232 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar306232 ["StackSetId" :content]))) (letvar306232 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar306232 ["Description" :content]))) (letvar306232 "Status") (clojure.core/assoc :status (deser-stack-set-status (clojure.core/get-in letvar306232 ["Status" :content]))))))

(clojure.core/defn- deser-resource-properties [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-timeout-minutes [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-template-parameters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-template-parameter coll))) input))

(clojure.core/defn- response-describe-stack-set-operation-output ([input] (response-describe-stack-set-operation-output nil input)) ([resultWrapper306258 input] (clojure.core/let [rawinput306257 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306259 {"StackSetOperation" (portkey.aws/search-for-tag rawinput306257 "StackSetOperation" :flattened? nil :result-wrapper resultWrapper306258)}] (clojure.core/cond-> {} (letvar306259 "StackSetOperation") (clojure.core/assoc :stack-set-operation (deser-stack-set-operation (clojure.core/get-in letvar306259 ["StackSetOperation" :content])))))))

(clojure.core/defn- response-insufficient-capabilities-exception ([input] (response-insufficient-capabilities-exception nil input)) ([resultWrapper306261 input] (clojure.core/let [rawinput306260 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306262 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stack-instances-output ([input] (response-list-stack-instances-output nil input)) ([resultWrapper306264 input] (clojure.core/let [rawinput306263 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306265 {"Summaries" (portkey.aws/search-for-tag rawinput306263 "Summaries" :flattened? nil :result-wrapper resultWrapper306264), "NextToken" (portkey.aws/search-for-tag rawinput306263 "NextToken" :flattened? nil :result-wrapper resultWrapper306264)}] (clojure.core/cond-> {} (letvar306265 "Summaries") (clojure.core/assoc :summaries (deser-stack-instance-summaries (clojure.core/get-in letvar306265 ["Summaries" :content]))) (letvar306265 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306265 ["NextToken" :content])))))))

(clojure.core/defn- response-already-exists-exception ([input] (response-already-exists-exception nil input)) ([resultWrapper306267 input] (clojure.core/let [rawinput306266 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306268 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stacks-output ([input] (response-list-stacks-output nil input)) ([resultWrapper306270 input] (clojure.core/let [rawinput306269 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306271 {"StackSummaries" (portkey.aws/search-for-tag rawinput306269 "StackSummaries" :flattened? nil :result-wrapper resultWrapper306270), "NextToken" (portkey.aws/search-for-tag rawinput306269 "NextToken" :flattened? nil :result-wrapper resultWrapper306270)}] (clojure.core/cond-> {} (letvar306271 "StackSummaries") (clojure.core/assoc :stack-summaries (deser-stack-summaries (clojure.core/get-in letvar306271 ["StackSummaries" :content]))) (letvar306271 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306271 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-stack-events-output ([input] (response-describe-stack-events-output nil input)) ([resultWrapper306273 input] (clojure.core/let [rawinput306272 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306274 {"StackEvents" (portkey.aws/search-for-tag rawinput306272 "StackEvents" :flattened? nil :result-wrapper resultWrapper306273), "NextToken" (portkey.aws/search-for-tag rawinput306272 "NextToken" :flattened? nil :result-wrapper resultWrapper306273)}] (clojure.core/cond-> {} (letvar306274 "StackEvents") (clojure.core/assoc :stack-events (deser-stack-events (clojure.core/get-in letvar306274 ["StackEvents" :content]))) (letvar306274 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306274 ["NextToken" :content])))))))

(clojure.core/defn- response-delete-stack-set-output ([input] (response-delete-stack-set-output nil input)) ([resultWrapper306276 input] (clojure.core/let [rawinput306275 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306277 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stack-instance-not-found-exception ([input] (response-stack-instance-not-found-exception nil input)) ([resultWrapper306279 input] (clojure.core/let [rawinput306278 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306280 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-account-limits-output ([input] (response-describe-account-limits-output nil input)) ([resultWrapper306282 input] (clojure.core/let [rawinput306281 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306283 {"AccountLimits" (portkey.aws/search-for-tag rawinput306281 "AccountLimits" :flattened? nil :result-wrapper resultWrapper306282), "NextToken" (portkey.aws/search-for-tag rawinput306281 "NextToken" :flattened? nil :result-wrapper resultWrapper306282)}] (clojure.core/cond-> {} (letvar306283 "AccountLimits") (clojure.core/assoc :account-limits (deser-account-limit-list (clojure.core/get-in letvar306283 ["AccountLimits" :content]))) (letvar306283 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306283 ["NextToken" :content])))))))

(clojure.core/defn- response-create-stack-output ([input] (response-create-stack-output nil input)) ([resultWrapper306285 input] (clojure.core/let [rawinput306284 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306286 {"StackId" (portkey.aws/search-for-tag rawinput306284 "StackId" :flattened? nil :result-wrapper resultWrapper306285)}] (clojure.core/cond-> {} (letvar306286 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar306286 ["StackId" :content])))))))

(clojure.core/defn- response-delete-change-set-output ([input] (response-delete-change-set-output nil input)) ([resultWrapper306288 input] (clojure.core/let [rawinput306287 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306289 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stack-resources-output ([input] (response-list-stack-resources-output nil input)) ([resultWrapper306291 input] (clojure.core/let [rawinput306290 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306292 {"StackResourceSummaries" (portkey.aws/search-for-tag rawinput306290 "StackResourceSummaries" :flattened? nil :result-wrapper resultWrapper306291), "NextToken" (portkey.aws/search-for-tag rawinput306290 "NextToken" :flattened? nil :result-wrapper resultWrapper306291)}] (clojure.core/cond-> {} (letvar306292 "StackResourceSummaries") (clojure.core/assoc :stack-resource-summaries (deser-stack-resource-summaries (clojure.core/get-in letvar306292 ["StackResourceSummaries" :content]))) (letvar306292 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306292 ["NextToken" :content])))))))

(clojure.core/defn- response-list-exports-output ([input] (response-list-exports-output nil input)) ([resultWrapper306294 input] (clojure.core/let [rawinput306293 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306295 {"Exports" (portkey.aws/search-for-tag rawinput306293 "Exports" :flattened? nil :result-wrapper resultWrapper306294), "NextToken" (portkey.aws/search-for-tag rawinput306293 "NextToken" :flattened? nil :result-wrapper resultWrapper306294)}] (clojure.core/cond-> {} (letvar306295 "Exports") (clojure.core/assoc :exports (deser-exports (clojure.core/get-in letvar306295 ["Exports" :content]))) (letvar306295 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306295 ["NextToken" :content])))))))

(clojure.core/defn- response-validate-template-output ([input] (response-validate-template-output nil input)) ([resultWrapper306297 input] (clojure.core/let [rawinput306296 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306298 {"Parameters" (portkey.aws/search-for-tag rawinput306296 "Parameters" :flattened? nil :result-wrapper resultWrapper306297), "Description" (portkey.aws/search-for-tag rawinput306296 "Description" :flattened? nil :result-wrapper resultWrapper306297), "Capabilities" (portkey.aws/search-for-tag rawinput306296 "Capabilities" :flattened? nil :result-wrapper resultWrapper306297), "CapabilitiesReason" (portkey.aws/search-for-tag rawinput306296 "CapabilitiesReason" :flattened? nil :result-wrapper resultWrapper306297), "DeclaredTransforms" (portkey.aws/search-for-tag rawinput306296 "DeclaredTransforms" :flattened? nil :result-wrapper resultWrapper306297)}] (clojure.core/cond-> {} (letvar306298 "Parameters") (clojure.core/assoc :parameters (deser-template-parameters (clojure.core/get-in letvar306298 ["Parameters" :content]))) (letvar306298 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar306298 ["Description" :content]))) (letvar306298 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar306298 ["Capabilities" :content]))) (letvar306298 "CapabilitiesReason") (clojure.core/assoc :capabilities-reason (deser-capabilities-reason (clojure.core/get-in letvar306298 ["CapabilitiesReason" :content]))) (letvar306298 "DeclaredTransforms") (clojure.core/assoc :declared-transforms (deser-transforms-list (clojure.core/get-in letvar306298 ["DeclaredTransforms" :content])))))))

(clojure.core/defn- response-create-change-set-output ([input] (response-create-change-set-output nil input)) ([resultWrapper306300 input] (clojure.core/let [rawinput306299 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306301 {"Id" (portkey.aws/search-for-tag rawinput306299 "Id" :flattened? nil :result-wrapper resultWrapper306300), "StackId" (portkey.aws/search-for-tag rawinput306299 "StackId" :flattened? nil :result-wrapper resultWrapper306300)}] (clojure.core/cond-> {} (letvar306301 "Id") (clojure.core/assoc :id (deser-change-set-id (clojure.core/get-in letvar306301 ["Id" :content]))) (letvar306301 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar306301 ["StackId" :content])))))))

(clojure.core/defn- response-name-already-exists-exception ([input] (response-name-already-exists-exception nil input)) ([resultWrapper306303 input] (clojure.core/let [rawinput306302 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306304 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stack-set-not-found-exception ([input] (response-stack-set-not-found-exception nil input)) ([resultWrapper306306 input] (clojure.core/let [rawinput306305 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306307 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-change-set-status-exception ([input] (response-invalid-change-set-status-exception nil input)) ([resultWrapper306309 input] (clojure.core/let [rawinput306308 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306310 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper306312 input] (clojure.core/let [rawinput306311 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306313 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-in-progress-exception ([input] (response-operation-in-progress-exception nil input)) ([resultWrapper306315 input] (clojure.core/let [rawinput306314 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306316 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stack-sets-output ([input] (response-list-stack-sets-output nil input)) ([resultWrapper306318 input] (clojure.core/let [rawinput306317 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306319 {"Summaries" (portkey.aws/search-for-tag rawinput306317 "Summaries" :flattened? nil :result-wrapper resultWrapper306318), "NextToken" (portkey.aws/search-for-tag rawinput306317 "NextToken" :flattened? nil :result-wrapper resultWrapper306318)}] (clojure.core/cond-> {} (letvar306319 "Summaries") (clojure.core/assoc :summaries (deser-stack-set-summaries (clojure.core/get-in letvar306319 ["Summaries" :content]))) (letvar306319 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306319 ["NextToken" :content])))))))

(clojure.core/defn- response-estimate-template-cost-output ([input] (response-estimate-template-cost-output nil input)) ([resultWrapper306321 input] (clojure.core/let [rawinput306320 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306322 {"Url" (portkey.aws/search-for-tag rawinput306320 "Url" :flattened? nil :result-wrapper resultWrapper306321)}] (clojure.core/cond-> {} (letvar306322 "Url") (clojure.core/assoc :url (deser-url (clojure.core/get-in letvar306322 ["Url" :content])))))))

(clojure.core/defn- response-describe-stack-resource-output ([input] (response-describe-stack-resource-output nil input)) ([resultWrapper306324 input] (clojure.core/let [rawinput306323 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306325 {"StackResourceDetail" (portkey.aws/search-for-tag rawinput306323 "StackResourceDetail" :flattened? nil :result-wrapper resultWrapper306324)}] (clojure.core/cond-> {} (letvar306325 "StackResourceDetail") (clojure.core/assoc :stack-resource-detail (deser-stack-resource-detail (clojure.core/get-in letvar306325 ["StackResourceDetail" :content])))))))

(clojure.core/defn- response-token-already-exists-exception ([input] (response-token-already-exists-exception nil input)) ([resultWrapper306327 input] (clojure.core/let [rawinput306326 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306328 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-stack-set-operation-output ([input] (response-stop-stack-set-operation-output nil input)) ([resultWrapper306330 input] (clojure.core/let [rawinput306329 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306331 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-stack-set-output ([input] (response-describe-stack-set-output nil input)) ([resultWrapper306333 input] (clojure.core/let [rawinput306332 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306334 {"StackSet" (portkey.aws/search-for-tag rawinput306332 "StackSet" :flattened? nil :result-wrapper resultWrapper306333)}] (clojure.core/cond-> {} (letvar306334 "StackSet") (clojure.core/assoc :stack-set (deser-stack-set (clojure.core/get-in letvar306334 ["StackSet" :content])))))))

(clojure.core/defn- response-invalid-operation-exception ([input] (response-invalid-operation-exception nil input)) ([resultWrapper306336 input] (clojure.core/let [rawinput306335 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306337 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-stack-output ([input] (response-update-stack-output nil input)) ([resultWrapper306339 input] (clojure.core/let [rawinput306338 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306340 {"StackId" (portkey.aws/search-for-tag rawinput306338 "StackId" :flattened? nil :result-wrapper resultWrapper306339)}] (clojure.core/cond-> {} (letvar306340 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar306340 ["StackId" :content])))))))

(clojure.core/defn- response-update-termination-protection-output ([input] (response-update-termination-protection-output nil input)) ([resultWrapper306342 input] (clojure.core/let [rawinput306341 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306343 {"StackId" (portkey.aws/search-for-tag rawinput306341 "StackId" :flattened? nil :result-wrapper resultWrapper306342)}] (clojure.core/cond-> {} (letvar306343 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar306343 ["StackId" :content])))))))

(clojure.core/defn- response-describe-stacks-output ([input] (response-describe-stacks-output nil input)) ([resultWrapper306345 input] (clojure.core/let [rawinput306344 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306346 {"Stacks" (portkey.aws/search-for-tag rawinput306344 "Stacks" :flattened? nil :result-wrapper resultWrapper306345), "NextToken" (portkey.aws/search-for-tag rawinput306344 "NextToken" :flattened? nil :result-wrapper resultWrapper306345)}] (clojure.core/cond-> {} (letvar306346 "Stacks") (clojure.core/assoc :stacks (deser-stacks (clojure.core/get-in letvar306346 ["Stacks" :content]))) (letvar306346 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306346 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-stack-instance-output ([input] (response-describe-stack-instance-output nil input)) ([resultWrapper306348 input] (clojure.core/let [rawinput306347 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306349 {"StackInstance" (portkey.aws/search-for-tag rawinput306347 "StackInstance" :flattened? nil :result-wrapper resultWrapper306348)}] (clojure.core/cond-> {} (letvar306349 "StackInstance") (clojure.core/assoc :stack-instance (deser-stack-instance (clojure.core/get-in letvar306349 ["StackInstance" :content])))))))

(clojure.core/defn- response-stale-request-exception ([input] (response-stale-request-exception nil input)) ([resultWrapper306351 input] (clojure.core/let [rawinput306350 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306352 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detect-stack-resource-drift-output ([input] (response-detect-stack-resource-drift-output nil input)) ([resultWrapper306354 input] (clojure.core/let [rawinput306353 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306355 {"StackResourceDrift" (portkey.aws/search-for-tag rawinput306353 "StackResourceDrift" :flattened? nil :result-wrapper resultWrapper306354)}] (clojure.core/cond-> {:stack-resource-drift (deser-stack-resource-drift (clojure.core/get-in letvar306355 ["StackResourceDrift" :content]))}))))

(clojure.core/defn- response-update-stack-instances-output ([input] (response-update-stack-instances-output nil input)) ([resultWrapper306357 input] (clojure.core/let [rawinput306356 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306358 {"OperationId" (portkey.aws/search-for-tag rawinput306356 "OperationId" :flattened? nil :result-wrapper resultWrapper306357)}] (clojure.core/cond-> {} (letvar306358 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar306358 ["OperationId" :content])))))))

(clojure.core/defn- response-list-imports-output ([input] (response-list-imports-output nil input)) ([resultWrapper306360 input] (clojure.core/let [rawinput306359 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306361 {"Imports" (portkey.aws/search-for-tag rawinput306359 "Imports" :flattened? nil :result-wrapper resultWrapper306360), "NextToken" (portkey.aws/search-for-tag rawinput306359 "NextToken" :flattened? nil :result-wrapper resultWrapper306360)}] (clojure.core/cond-> {} (letvar306361 "Imports") (clojure.core/assoc :imports (deser-imports (clojure.core/get-in letvar306361 ["Imports" :content]))) (letvar306361 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306361 ["NextToken" :content])))))))

(clojure.core/defn- response-operation-not-found-exception ([input] (response-operation-not-found-exception nil input)) ([resultWrapper306363 input] (clojure.core/let [rawinput306362 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306364 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-stack-resource-drifts-output ([input] (response-describe-stack-resource-drifts-output nil input)) ([resultWrapper306366 input] (clojure.core/let [rawinput306365 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306367 {"StackResourceDrifts" (portkey.aws/search-for-tag rawinput306365 "StackResourceDrifts" :flattened? nil :result-wrapper resultWrapper306366), "NextToken" (portkey.aws/search-for-tag rawinput306365 "NextToken" :flattened? nil :result-wrapper resultWrapper306366)}] (clojure.core/cond-> {:stack-resource-drifts (deser-stack-resource-drifts (clojure.core/get-in letvar306367 ["StackResourceDrifts" :content]))} (letvar306367 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306367 ["NextToken" :content])))))))

(clojure.core/defn- response-continue-update-rollback-output ([input] (response-continue-update-rollback-output nil input)) ([resultWrapper306369 input] (clojure.core/let [rawinput306368 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306370 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-stack-set-operations-output ([input] (response-list-stack-set-operations-output nil input)) ([resultWrapper306372 input] (clojure.core/let [rawinput306371 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306373 {"Summaries" (portkey.aws/search-for-tag rawinput306371 "Summaries" :flattened? nil :result-wrapper resultWrapper306372), "NextToken" (portkey.aws/search-for-tag rawinput306371 "NextToken" :flattened? nil :result-wrapper resultWrapper306372)}] (clojure.core/cond-> {} (letvar306373 "Summaries") (clojure.core/assoc :summaries (deser-stack-set-operation-summaries (clojure.core/get-in letvar306373 ["Summaries" :content]))) (letvar306373 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306373 ["NextToken" :content])))))))

(clojure.core/defn- response-delete-stack-instances-output ([input] (response-delete-stack-instances-output nil input)) ([resultWrapper306375 input] (clojure.core/let [rawinput306374 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306376 {"OperationId" (portkey.aws/search-for-tag rawinput306374 "OperationId" :flattened? nil :result-wrapper resultWrapper306375)}] (clojure.core/cond-> {} (letvar306376 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar306376 ["OperationId" :content])))))))

(clojure.core/defn- response-create-stack-instances-output ([input] (response-create-stack-instances-output nil input)) ([resultWrapper306378 input] (clojure.core/let [rawinput306377 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306379 {"OperationId" (portkey.aws/search-for-tag rawinput306377 "OperationId" :flattened? nil :result-wrapper resultWrapper306378)}] (clojure.core/cond-> {} (letvar306379 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar306379 ["OperationId" :content])))))))

(clojure.core/defn- response-list-stack-set-operation-results-output ([input] (response-list-stack-set-operation-results-output nil input)) ([resultWrapper306381 input] (clojure.core/let [rawinput306380 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306382 {"Summaries" (portkey.aws/search-for-tag rawinput306380 "Summaries" :flattened? nil :result-wrapper resultWrapper306381), "NextToken" (portkey.aws/search-for-tag rawinput306380 "NextToken" :flattened? nil :result-wrapper resultWrapper306381)}] (clojure.core/cond-> {} (letvar306382 "Summaries") (clojure.core/assoc :summaries (deser-stack-set-operation-result-summaries (clojure.core/get-in letvar306382 ["Summaries" :content]))) (letvar306382 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306382 ["NextToken" :content])))))))

(clojure.core/defn- response-get-template-output ([input] (response-get-template-output nil input)) ([resultWrapper306384 input] (clojure.core/let [rawinput306383 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306385 {"TemplateBody" (portkey.aws/search-for-tag rawinput306383 "TemplateBody" :flattened? nil :result-wrapper resultWrapper306384), "StagesAvailable" (portkey.aws/search-for-tag rawinput306383 "StagesAvailable" :flattened? nil :result-wrapper resultWrapper306384)}] (clojure.core/cond-> {} (letvar306385 "TemplateBody") (clojure.core/assoc :template-body (deser-template-body (clojure.core/get-in letvar306385 ["TemplateBody" :content]))) (letvar306385 "StagesAvailable") (clojure.core/assoc :stages-available (deser-stage-list (clojure.core/get-in letvar306385 ["StagesAvailable" :content])))))))

(clojure.core/defn- response-describe-stack-resources-output ([input] (response-describe-stack-resources-output nil input)) ([resultWrapper306387 input] (clojure.core/let [rawinput306386 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306388 {"StackResources" (portkey.aws/search-for-tag rawinput306386 "StackResources" :flattened? nil :result-wrapper resultWrapper306387)}] (clojure.core/cond-> {} (letvar306388 "StackResources") (clojure.core/assoc :stack-resources (deser-stack-resources (clojure.core/get-in letvar306388 ["StackResources" :content])))))))

(clojure.core/defn- response-execute-change-set-output ([input] (response-execute-change-set-output nil input)) ([resultWrapper306390 input] (clojure.core/let [rawinput306389 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306391 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-template-summary-output ([input] (response-get-template-summary-output nil input)) ([resultWrapper306393 input] (clojure.core/let [rawinput306392 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306394 {"Parameters" (portkey.aws/search-for-tag rawinput306392 "Parameters" :flattened? nil :result-wrapper resultWrapper306393), "Description" (portkey.aws/search-for-tag rawinput306392 "Description" :flattened? nil :result-wrapper resultWrapper306393), "Capabilities" (portkey.aws/search-for-tag rawinput306392 "Capabilities" :flattened? nil :result-wrapper resultWrapper306393), "CapabilitiesReason" (portkey.aws/search-for-tag rawinput306392 "CapabilitiesReason" :flattened? nil :result-wrapper resultWrapper306393), "ResourceTypes" (portkey.aws/search-for-tag rawinput306392 "ResourceTypes" :flattened? nil :result-wrapper resultWrapper306393), "Version" (portkey.aws/search-for-tag rawinput306392 "Version" :flattened? nil :result-wrapper resultWrapper306393), "Metadata" (portkey.aws/search-for-tag rawinput306392 "Metadata" :flattened? nil :result-wrapper resultWrapper306393), "DeclaredTransforms" (portkey.aws/search-for-tag rawinput306392 "DeclaredTransforms" :flattened? nil :result-wrapper resultWrapper306393)}] (clojure.core/cond-> {} (letvar306394 "Parameters") (clojure.core/assoc :parameters (deser-parameter-declarations (clojure.core/get-in letvar306394 ["Parameters" :content]))) (letvar306394 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar306394 ["Description" :content]))) (letvar306394 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar306394 ["Capabilities" :content]))) (letvar306394 "CapabilitiesReason") (clojure.core/assoc :capabilities-reason (deser-capabilities-reason (clojure.core/get-in letvar306394 ["CapabilitiesReason" :content]))) (letvar306394 "ResourceTypes") (clojure.core/assoc :resource-types (deser-resource-types (clojure.core/get-in letvar306394 ["ResourceTypes" :content]))) (letvar306394 "Version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar306394 ["Version" :content]))) (letvar306394 "Metadata") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar306394 ["Metadata" :content]))) (letvar306394 "DeclaredTransforms") (clojure.core/assoc :declared-transforms (deser-transforms-list (clojure.core/get-in letvar306394 ["DeclaredTransforms" :content])))))))

(clojure.core/defn- response-list-change-sets-output ([input] (response-list-change-sets-output nil input)) ([resultWrapper306396 input] (clojure.core/let [rawinput306395 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306397 {"Summaries" (portkey.aws/search-for-tag rawinput306395 "Summaries" :flattened? nil :result-wrapper resultWrapper306396), "NextToken" (portkey.aws/search-for-tag rawinput306395 "NextToken" :flattened? nil :result-wrapper resultWrapper306396)}] (clojure.core/cond-> {} (letvar306397 "Summaries") (clojure.core/assoc :summaries (deser-change-set-summaries (clojure.core/get-in letvar306397 ["Summaries" :content]))) (letvar306397 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306397 ["NextToken" :content])))))))

(clojure.core/defn- response-get-stack-policy-output ([input] (response-get-stack-policy-output nil input)) ([resultWrapper306399 input] (clojure.core/let [rawinput306398 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306400 {"StackPolicyBody" (portkey.aws/search-for-tag rawinput306398 "StackPolicyBody" :flattened? nil :result-wrapper resultWrapper306399)}] (clojure.core/cond-> {} (letvar306400 "StackPolicyBody") (clojure.core/assoc :stack-policy-body (deser-stack-policy-body (clojure.core/get-in letvar306400 ["StackPolicyBody" :content])))))))

(clojure.core/defn- response-created-but-modified-exception ([input] (response-created-but-modified-exception nil input)) ([resultWrapper306402 input] (clojure.core/let [rawinput306401 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306403 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-stack-set-output ([input] (response-update-stack-set-output nil input)) ([resultWrapper306405 input] (clojure.core/let [rawinput306404 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306406 {"OperationId" (portkey.aws/search-for-tag rawinput306404 "OperationId" :flattened? nil :result-wrapper resultWrapper306405)}] (clojure.core/cond-> {} (letvar306406 "OperationId") (clojure.core/assoc :operation-id (deser-client-request-token (clojure.core/get-in letvar306406 ["OperationId" :content])))))))

(clojure.core/defn- response-describe-change-set-output ([input] (response-describe-change-set-output nil input)) ([resultWrapper306408 input] (clojure.core/let [rawinput306407 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306409 {"NotificationARNs" (portkey.aws/search-for-tag rawinput306407 "NotificationARNs" :flattened? nil :result-wrapper resultWrapper306408), "RollbackConfiguration" (portkey.aws/search-for-tag rawinput306407 "RollbackConfiguration" :flattened? nil :result-wrapper resultWrapper306408), "Parameters" (portkey.aws/search-for-tag rawinput306407 "Parameters" :flattened? nil :result-wrapper resultWrapper306408), "ChangeSetName" (portkey.aws/search-for-tag rawinput306407 "ChangeSetName" :flattened? nil :result-wrapper resultWrapper306408), "ChangeSetId" (portkey.aws/search-for-tag rawinput306407 "ChangeSetId" :flattened? nil :result-wrapper resultWrapper306408), "Changes" (portkey.aws/search-for-tag rawinput306407 "Changes" :flattened? nil :result-wrapper resultWrapper306408), "Tags" (portkey.aws/search-for-tag rawinput306407 "Tags" :flattened? nil :result-wrapper resultWrapper306408), "Status" (portkey.aws/search-for-tag rawinput306407 "Status" :flattened? nil :result-wrapper resultWrapper306408), "NextToken" (portkey.aws/search-for-tag rawinput306407 "NextToken" :flattened? nil :result-wrapper resultWrapper306408), "Capabilities" (portkey.aws/search-for-tag rawinput306407 "Capabilities" :flattened? nil :result-wrapper resultWrapper306408), "StatusReason" (portkey.aws/search-for-tag rawinput306407 "StatusReason" :flattened? nil :result-wrapper resultWrapper306408), "Description" (portkey.aws/search-for-tag rawinput306407 "Description" :flattened? nil :result-wrapper resultWrapper306408), "StackId" (portkey.aws/search-for-tag rawinput306407 "StackId" :flattened? nil :result-wrapper resultWrapper306408), "CreationTime" (portkey.aws/search-for-tag rawinput306407 "CreationTime" :flattened? nil :result-wrapper resultWrapper306408), "StackName" (portkey.aws/search-for-tag rawinput306407 "StackName" :flattened? nil :result-wrapper resultWrapper306408), "ExecutionStatus" (portkey.aws/search-for-tag rawinput306407 "ExecutionStatus" :flattened? nil :result-wrapper resultWrapper306408)}] (clojure.core/cond-> {} (letvar306409 "NotificationARNs") (clojure.core/assoc :notification-ar-ns (deser-notification-ar-ns (clojure.core/get-in letvar306409 ["NotificationARNs" :content]))) (letvar306409 "RollbackConfiguration") (clojure.core/assoc :rollback-configuration (deser-rollback-configuration (clojure.core/get-in letvar306409 ["RollbackConfiguration" :content]))) (letvar306409 "Parameters") (clojure.core/assoc :parameters (deser-parameters (clojure.core/get-in letvar306409 ["Parameters" :content]))) (letvar306409 "ChangeSetName") (clojure.core/assoc :change-set-name (deser-change-set-name (clojure.core/get-in letvar306409 ["ChangeSetName" :content]))) (letvar306409 "ChangeSetId") (clojure.core/assoc :change-set-id (deser-change-set-id (clojure.core/get-in letvar306409 ["ChangeSetId" :content]))) (letvar306409 "Changes") (clojure.core/assoc :changes (deser-changes (clojure.core/get-in letvar306409 ["Changes" :content]))) (letvar306409 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar306409 ["Tags" :content]))) (letvar306409 "Status") (clojure.core/assoc :status (deser-change-set-status (clojure.core/get-in letvar306409 ["Status" :content]))) (letvar306409 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar306409 ["NextToken" :content]))) (letvar306409 "Capabilities") (clojure.core/assoc :capabilities (deser-capabilities (clojure.core/get-in letvar306409 ["Capabilities" :content]))) (letvar306409 "StatusReason") (clojure.core/assoc :status-reason (deser-change-set-status-reason (clojure.core/get-in letvar306409 ["StatusReason" :content]))) (letvar306409 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar306409 ["Description" :content]))) (letvar306409 "StackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar306409 ["StackId" :content]))) (letvar306409 "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (clojure.core/get-in letvar306409 ["CreationTime" :content]))) (letvar306409 "StackName") (clojure.core/assoc :stack-name (deser-stack-name (clojure.core/get-in letvar306409 ["StackName" :content]))) (letvar306409 "ExecutionStatus") (clojure.core/assoc :execution-status (deser-execution-status (clojure.core/get-in letvar306409 ["ExecutionStatus" :content])))))))

(clojure.core/defn- response-stack-set-not-empty-exception ([input] (response-stack-set-not-empty-exception nil input)) ([resultWrapper306411 input] (clojure.core/let [rawinput306410 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306412 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detect-stack-drift-output ([input] (response-detect-stack-drift-output nil input)) ([resultWrapper306414 input] (clojure.core/let [rawinput306413 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306415 {"StackDriftDetectionId" (portkey.aws/search-for-tag rawinput306413 "StackDriftDetectionId" :flattened? nil :result-wrapper resultWrapper306414)}] (clojure.core/cond-> {:stack-drift-detection-id (deser-stack-drift-detection-id (clojure.core/get-in letvar306415 ["StackDriftDetectionId" :content]))}))))

(clojure.core/defn- response-change-set-not-found-exception ([input] (response-change-set-not-found-exception nil input)) ([resultWrapper306417 input] (clojure.core/let [rawinput306416 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306418 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-id-already-exists-exception ([input] (response-operation-id-already-exists-exception nil input)) ([resultWrapper306420 input] (clojure.core/let [rawinput306419 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306421 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-stack-set-output ([input] (response-create-stack-set-output nil input)) ([resultWrapper306423 input] (clojure.core/let [rawinput306422 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306424 {"StackSetId" (portkey.aws/search-for-tag rawinput306422 "StackSetId" :flattened? nil :result-wrapper resultWrapper306423)}] (clojure.core/cond-> {} (letvar306424 "StackSetId") (clojure.core/assoc :stack-set-id (deser-stack-set-id (clojure.core/get-in letvar306424 ["StackSetId" :content])))))))

(clojure.core/defn- response-describe-stack-drift-detection-status-output ([input] (response-describe-stack-drift-detection-status-output nil input)) ([resultWrapper306426 input] (clojure.core/let [rawinput306425 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar306427 {"StackId" (portkey.aws/search-for-tag rawinput306425 "StackId" :flattened? nil :result-wrapper resultWrapper306426), "StackDriftDetectionId" (portkey.aws/search-for-tag rawinput306425 "StackDriftDetectionId" :flattened? nil :result-wrapper resultWrapper306426), "StackDriftStatus" (portkey.aws/search-for-tag rawinput306425 "StackDriftStatus" :flattened? nil :result-wrapper resultWrapper306426), "DetectionStatus" (portkey.aws/search-for-tag rawinput306425 "DetectionStatus" :flattened? nil :result-wrapper resultWrapper306426), "DetectionStatusReason" (portkey.aws/search-for-tag rawinput306425 "DetectionStatusReason" :flattened? nil :result-wrapper resultWrapper306426), "DriftedStackResourceCount" (portkey.aws/search-for-tag rawinput306425 "DriftedStackResourceCount" :flattened? nil :result-wrapper resultWrapper306426), "Timestamp" (portkey.aws/search-for-tag rawinput306425 "Timestamp" :flattened? nil :result-wrapper resultWrapper306426)}] (clojure.core/cond-> {:stack-id (deser-stack-id (clojure.core/get-in letvar306427 ["StackId" :content])), :stack-drift-detection-id (deser-stack-drift-detection-id (clojure.core/get-in letvar306427 ["StackDriftDetectionId" :content])), :detection-status (deser-stack-drift-detection-status (clojure.core/get-in letvar306427 ["DetectionStatus" :content])), :timestamp (deser-timestamp (clojure.core/get-in letvar306427 ["Timestamp" :content]))} (letvar306427 "StackDriftStatus") (clojure.core/assoc :stack-drift-status (deser-stack-drift-status (clojure.core/get-in letvar306427 ["StackDriftStatus" :content]))) (letvar306427 "DetectionStatusReason") (clojure.core/assoc :detection-status-reason (deser-stack-drift-detection-status-reason (clojure.core/get-in letvar306427 ["DetectionStatusReason" :content]))) (letvar306427 "DriftedStackResourceCount") (clojure.core/assoc :drifted-stack-resource-count (deser-boxed-integer (clojure.core/get-in letvar306427 ["DriftedStackResourceCount" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/cancel-update-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name] :opt-un [:portkey.aws.cloudformation/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.resource-change/action (clojure.spec.alpha/and :portkey.aws.cloudformation/change-action))
(clojure.spec.alpha/def :portkey.aws.cloudformation.resource-change/details (clojure.spec.alpha/and :portkey.aws.cloudformation/resource-change-details))
(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.resource-change/action :portkey.aws.cloudformation/logical-resource-id :portkey.aws.cloudformation/physical-resource-id :portkey.aws.cloudformation/resource-type :portkey.aws.cloudformation/replacement :portkey.aws.cloudformation/scope :portkey.aws.cloudformation.resource-change/details]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/notification-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/notification-arn :max-count 5))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-set-operation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-set-operation]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource-summary/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource-summary/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-resource-drift-information-summary))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/logical-resource-id :portkey.aws.cloudformation/resource-type :portkey.aws.cloudformation.stack-resource-summary/last-updated-timestamp :portkey.aws.cloudformation/resource-status] :opt-un [:portkey.aws.cloudformation/physical-resource-id :portkey.aws.cloudformation/resource-status-reason :portkey.aws.cloudformation.stack-resource-summary/drift-information]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/physical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-status #{"CREATE_PENDING" :create-complete "DELETE_COMPLETE" "CREATE_IN_PROGRESS" :create-in-progress :delete-complete "CREATE_COMPLETE" "FAILED" :create-pending :failed})

(clojure.spec.alpha/def :portkey.aws.cloudformation/imports (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-name))

(clojure.spec.alpha/def :portkey.aws.cloudformation/insufficient-capabilities-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-drifts (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-resource-drift))

(clojure.spec.alpha/def :portkey.aws.cloudformation/validate-template-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/template-body :portkey.aws.cloudformation/template-url]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.delete-change-set-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.delete-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/delete-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.delete-change-set-input/change-set-name] :opt-un [:portkey.aws.cloudformation.delete-change-set-input/stack-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-stack-instances-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-instance-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.list-stack-instances-output/summaries :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-type #{:resource "Resource"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][-a-zA-Z0-9]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/template-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/logical-resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/rollback-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/rollback-triggers :portkey.aws.cloudformation/monitoring-time-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.get-template-summary-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.get-template-summary-input/stack-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/get-template-summary-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/template-body :portkey.aws.cloudformation/template-url :portkey.aws.cloudformation.get-template-summary-input/stack-name :portkey.aws.cloudformation.get-template-summary-input/stack-set-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/logical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-status #{:deleted :active "ACTIVE" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/parameter-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/account-limit-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/account-limit))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resources (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-resource))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stacks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-summaries :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-events-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-events :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/delete-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name] :opt-un [:portkey.aws.cloudformation/retain-resources :portkey.aws.cloudformation/role-arn :portkey.aws.cloudformation/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/delete-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-instance-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-account-limits-output/account-limits (clojure.spec.alpha/and :portkey.aws.cloudformation/account-limit-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-account-limits-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.describe-account-limits-output/account-limits :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/change-set-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation/parameter-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/create-stack-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-stack-instance-input/stack-instance-account (clojure.spec.alpha/and :portkey.aws.cloudformation/account))
(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-stack-instance-input/stack-instance-region (clojure.spec.alpha/and :portkey.aws.cloudformation/region))
(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name :portkey.aws.cloudformation.describe-stack-instance-input/stack-instance-account :portkey.aws.cloudformation.describe-stack-instance-input/stack-instance-region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-drift-status #{"NOT_CHECKED" "UNKNOWN" :not-checked :unknown "DRIFTED" "IN_SYNC" :in-sync :drifted})

(clojure.spec.alpha/def :portkey.aws.cloudformation/delete-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 20 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/property-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.account-gate-result/status (clojure.spec.alpha/and :portkey.aws.cloudformation/account-gate-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.account-gate-result/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation/account-gate-status-reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation/account-gate-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.account-gate-result/status :portkey.aws.cloudformation.account-gate-result/status-reason]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/export-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-events (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-event))

(clojure.spec.alpha/def :portkey.aws.cloudformation.delete-stack-instances-input/accounts (clojure.spec.alpha/and :portkey.aws.cloudformation/account-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.delete-stack-instances-input/regions (clojure.spec.alpha/and :portkey.aws.cloudformation/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.delete-stack-instances-input/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.delete-stack-instances-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/delete-stack-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name :portkey.aws.cloudformation.delete-stack-instances-input/accounts :portkey.aws.cloudformation.delete-stack-instances-input/regions :portkey.aws.cloudformation/retain-stacks] :opt-un [:portkey.aws.cloudformation.delete-stack-instances-input/operation-preferences :portkey.aws.cloudformation.delete-stack-instances-input/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.change-set-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.change-set-summary/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-status-reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/change-set-name :portkey.aws.cloudformation/change-set-id :portkey.aws.cloudformation.change-set-summary/status :portkey.aws.cloudformation.change-set-summary/status-reason :portkey.aws.cloudformation/description :portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/creation-time :portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/execution-status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation-result-status #{:pending "PENDING" :running :cancelled "SUCCEEDED" "FAILED" "CANCELLED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.cloudformation/export-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-instances-input/stack-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-instances-input/accounts (clojure.spec.alpha/and :portkey.aws.cloudformation/account-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-instances-input/regions (clojure.spec.alpha/and :portkey.aws.cloudformation/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-instances-input/parameter-overrides (clojure.spec.alpha/and :portkey.aws.cloudformation/parameters))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-instances-input/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-instances-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/update-stack-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.update-stack-instances-input/stack-set-name :portkey.aws.cloudformation.update-stack-instances-input/accounts :portkey.aws.cloudformation.update-stack-instances-input/regions] :opt-un [:portkey.aws.cloudformation.update-stack-instances-input/parameter-overrides :portkey.aws.cloudformation.update-stack-instances-input/operation-preferences :portkey.aws.cloudformation.update-stack-instances-input/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-resource-summaries :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-exports-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/exports :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stacks-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/template-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__)))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-resources-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/logical-resource-id :portkey.aws.cloudformation/physical-resource-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-stack-set-operation-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-set-operation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name :portkey.aws.cloudformation.describe-stack-set-operation-input/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/retain-stacks clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.signal-resource-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.signal-resource-input/unique-id (clojure.spec.alpha/and :portkey.aws.cloudformation/resource-signal-unique-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.signal-resource-input/status (clojure.spec.alpha/and :portkey.aws.cloudformation/resource-signal-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation/signal-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.signal-resource-input/stack-name :portkey.aws.cloudformation/logical-resource-id :portkey.aws.cloudformation.signal-resource-input/unique-id :portkey.aws.cloudformation.signal-resource-input/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-resource-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation-summary/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation-summary/action (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-action))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation-summary/creation-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation-summary/end-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.stack-set-operation-summary/operation-id :portkey.aws.cloudformation.stack-set-operation-summary/action :portkey.aws.cloudformation.stack-set-operation-summary/status :portkey.aws.cloudformation.stack-set-operation-summary/creation-timestamp :portkey.aws.cloudformation.stack-set-operation-summary/end-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/parameters (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/parameter))

(clojure.spec.alpha/def :portkey.aws.cloudformation/rollback-triggers (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/rollback-trigger :max-count 5))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource-drift/actual-properties (clojure.spec.alpha/and :portkey.aws.cloudformation/properties))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource-drift/expected-properties (clojure.spec.alpha/and :portkey.aws.cloudformation/properties))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-drift (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/logical-resource-id :portkey.aws.cloudformation/resource-type :portkey.aws.cloudformation/stack-resource-drift-status :portkey.aws.cloudformation/timestamp] :opt-un [:portkey.aws.cloudformation/physical-resource-id :portkey.aws.cloudformation.stack-resource-drift/actual-properties :portkey.aws.cloudformation/physical-resource-id-context :portkey.aws.cloudformation/property-differences :portkey.aws.cloudformation.stack-resource-drift/expected-properties]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/boxed-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-instance-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-instance-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-instance-summary/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation/reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-instance-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-set-id :portkey.aws.cloudformation/region :portkey.aws.cloudformation/account :portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation.stack-instance-summary/status :portkey.aws.cloudformation.stack-instance-summary/status-reason]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-instance/parameter-overrides (clojure.spec.alpha/and :portkey.aws.cloudformation/parameters))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-instance/status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-instance-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-instance/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation/reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-set-id :portkey.aws.cloudformation/region :portkey.aws.cloudformation/account :portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation.stack-instance/parameter-overrides :portkey.aws.cloudformation.stack-instance/status :portkey.aws.cloudformation.stack-instance/status-reason]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.validate-template-output/parameters (clojure.spec.alpha/and :portkey.aws.cloudformation/template-parameters))
(clojure.spec.alpha/def :portkey.aws.cloudformation.validate-template-output/declared-transforms (clojure.spec.alpha/and :portkey.aws.cloudformation/transforms-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation/validate-template-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.validate-template-output/parameters :portkey.aws.cloudformation/description :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation/capabilities-reason :portkey.aws.cloudformation.validate-template-output/declared-transforms]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/retain-stacks-nullable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.create-change-set-output/id (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/create-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.create-change-set-output/id :portkey.aws.cloudformation/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-action #{:remove "Modify" "Add" "Remove" :add :modify})

(clojure.spec.alpha/def :portkey.aws.cloudformation.detect-stack-resource-drift-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/detect-stack-resource-drift-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.detect-stack-resource-drift-input/stack-name :portkey.aws.cloudformation/logical-resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/name-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-type #{:create :update "UPDATE" "CREATE"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/allowed-values (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/allowed-value))

(clojure.spec.alpha/def :portkey.aws.cloudformation/rollback-trigger (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/arn :portkey.aws.cloudformation/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/region-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/region))

(clojure.spec.alpha/def :portkey.aws.cloudformation/deletion-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"arn:[-a-zA-Z0-9:/]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/invalid-change-set-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/changes (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/change))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-event (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/event-id :portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/timestamp] :opt-un [:portkey.aws.cloudformation/physical-resource-id :portkey.aws.cloudformation/client-request-token :portkey.aws.cloudformation/logical-resource-id :portkey.aws.cloudformation/resource-status-reason :portkey.aws.cloudformation/resource-status :portkey.aws.cloudformation/resource-type :portkey.aws.cloudformation/resource-properties]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/tags (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/tag :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cloudformation/evaluation-type #{:static "Dynamic" :dynamic "Static"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/template-stage #{:original "Processed" :processed "Original"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/notification-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-exports-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/retain-resources (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/logical-resource-id))

(clojure.spec.alpha/def :portkey.aws.cloudformation.create-stack-instances-input/accounts (clojure.spec.alpha/and :portkey.aws.cloudformation/account-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.create-stack-instances-input/regions (clojure.spec.alpha/and :portkey.aws.cloudformation/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.create-stack-instances-input/parameter-overrides (clojure.spec.alpha/and :portkey.aws.cloudformation/parameters))
(clojure.spec.alpha/def :portkey.aws.cloudformation.create-stack-instances-input/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.create-stack-instances-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/create-stack-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name :portkey.aws.cloudformation.create-stack-instances-input/accounts :portkey.aws.cloudformation.create-stack-instances-input/regions] :opt-un [:portkey.aws.cloudformation.create-stack-instances-input/parameter-overrides :portkey.aws.cloudformation.create-stack-instances-input/operation-preferences :portkey.aws.cloudformation.create-stack-instances-input/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation/end-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation/retain-stacks (clojure.spec.alpha/and :portkey.aws.cloudformation/retain-stacks-nullable))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation/status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation/creation-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation/action (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-action))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.stack-set-operation/end-timestamp :portkey.aws.cloudformation.stack-set-operation/retain-stacks :portkey.aws.cloudformation.stack-set-operation/status :portkey.aws.cloudformation.stack-set-operation/creation-timestamp :portkey.aws.cloudformation.stack-set-operation/operation-id :portkey.aws.cloudformation.stack-set-operation/administration-role-arn :portkey.aws.cloudformation/stack-set-id :portkey.aws.cloudformation/execution-role-name :portkey.aws.cloudformation.stack-set-operation/operation-preferences :portkey.aws.cloudformation.stack-set-operation/action]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/operation-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-stack-sets-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-sets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.list-stack-sets-output/summaries :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-account-limits-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/failure-tolerance-percentage (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.cloudformation/disable-rollback clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation/capabilities-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-stack-instances-input/stack-instance-account (clojure.spec.alpha/and :portkey.aws.cloudformation/account))
(clojure.spec.alpha/def :portkey.aws.cloudformation.list-stack-instances-input/stack-instance-region (clojure.spec.alpha/and :portkey.aws.cloudformation/region))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name] :opt-un [:portkey.aws.cloudformation/next-token :portkey.aws.cloudformation/max-results :portkey.aws.cloudformation.list-stack-instances-input/stack-instance-account :portkey.aws.cloudformation.list-stack-instances-input/stack-instance-region]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/estimate-template-cost-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/url]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-to-skip (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]+|[a-zA-Z][-a-zA-Z0-9]*\.[a-zA-Z0-9]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/outputs (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/output))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-resource-detail]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/token-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.create-stack-set-input/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation/create-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name] :opt-un [:portkey.aws.cloudformation/client-request-token :portkey.aws.cloudformation/template-url :portkey.aws.cloudformation/template-body :portkey.aws.cloudformation/parameters :portkey.aws.cloudformation/tags :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation/description :portkey.aws.cloudformation.create-stack-set-input/administration-role-arn :portkey.aws.cloudformation/execution-role-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource-drift-information/last-check-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-drift-information (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-resource-drift-status] :opt-un [:portkey.aws.cloudformation.stack-resource-drift-information/last-check-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/requires-recreation #{"Conditionally" "Always" :conditionally :never "Never" :always})

(clojure.spec.alpha/def :portkey.aws.cloudformation.parameter-declaration/default-value (clojure.spec.alpha/and :portkey.aws.cloudformation/parameter-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation/parameter-declaration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/parameter-key :portkey.aws.cloudformation.parameter-declaration/default-value :portkey.aws.cloudformation/parameter-type :portkey.aws.cloudformation/no-echo :portkey.aws.cloudformation/description :portkey.aws.cloudformation/parameter-constraints]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stop-stack-set-operation-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/property-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-set]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resources-to-skip (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/resource-to-skip))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-policy-during-update-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1350))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource-drift-information-summary/last-check-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-drift-information-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-resource-drift-status] :opt-un [:portkey.aws.cloudformation.stack-resource-drift-information-summary/last-check-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.template-parameter/default-value (clojure.spec.alpha/and :portkey.aws.cloudformation/parameter-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation/template-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/parameter-key :portkey.aws.cloudformation.template-parameter/default-value :portkey.aws.cloudformation/no-echo :portkey.aws.cloudformation/description]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/update-stack-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-stack-resource-drifts-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-stack-resource-drifts-input/max-results (clojure.spec.alpha/and :portkey.aws.cloudformation/boxed-max-results))
(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-resource-drifts-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.describe-stack-resource-drifts-input/stack-name] :opt-un [:portkey.aws.cloudformation/stack-resource-drift-status-filters :portkey.aws.cloudformation/next-token :portkey.aws.cloudformation.describe-stack-resource-drifts-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-instance-status #{:outdated "CURRENT" "OUTDATED" :inoperable "INOPERABLE" :current})

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-status #{:rollback-failed :delete-failed "UPDATE_ROLLBACK_FAILED" "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" "REVIEW_IN_PROGRESS" :create-complete "ROLLBACK_FAILED" :rollback-in-progress :update-rollback-in-progress "DELETE_IN_PROGRESS" "UPDATE_IN_PROGRESS" "ROLLBACK_IN_PROGRESS" "CREATE_FAILED" :rollback-complete "DELETE_COMPLETE" "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" :update-complete :update-rollback-complete-cleanup-in-progress "CREATE_IN_PROGRESS" :delete-in-progress :create-failed :create-in-progress :delete-complete :update-rollback-complete "CREATE_COMPLETE" :update-rollback-failed "UPDATE_COMPLETE" "ROLLBACK_COMPLETE" :update-in-progress :update-complete-cleanup-in-progress :review-in-progress "DELETE_FAILED" "UPDATE_ROLLBACK_COMPLETE" "UPDATE_ROLLBACK_IN_PROGRESS"})

(clojure.spec.alpha/def :portkey.aws.cloudformation.export/exporting-stack-id (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.export/name (clojure.spec.alpha/and :portkey.aws.cloudformation/export-name))
(clojure.spec.alpha/def :portkey.aws.cloudformation.export/value (clojure.spec.alpha/and :portkey.aws.cloudformation/export-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation/export (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.export/exporting-stack-id :portkey.aws.cloudformation.export/name :portkey.aws.cloudformation.export/value]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/update-termination-protection-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/capabilities (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/capability))

(clojure.spec.alpha/def :portkey.aws.cloudformation/capability #{:capability-named-iam :capability-iam "CAPABILITY_NAMED_IAM" "CAPABILITY_IAM" :capability-auto-expand "CAPABILITY_AUTO_EXPAND"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/transforms-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/transform-name))

(clojure.spec.alpha/def :portkey.aws.cloudformation/physical-resource-id-context-key-value-pair (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/key :portkey.aws.cloudformation/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stacks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stacks :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-instance-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-instance-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.create-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/create-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.create-change-set-input/stack-name :portkey.aws.cloudformation/change-set-name] :opt-un [:portkey.aws.cloudformation/notification-ar-ns :portkey.aws.cloudformation/template-url :portkey.aws.cloudformation/rollback-configuration :portkey.aws.cloudformation/role-arn :portkey.aws.cloudformation/template-body :portkey.aws.cloudformation/parameters :portkey.aws.cloudformation/change-set-type :portkey.aws.cloudformation/tags :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation/description :portkey.aws.cloudformation/use-previous-template :portkey.aws.cloudformation/resource-types :portkey.aws.cloudformation/client-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-status #{:delete-failed :create-complete "DELETE_IN_PROGRESS" "UPDATE_IN_PROGRESS" "CREATE_FAILED" "DELETE_COMPLETE" "DELETE_SKIPPED" :update-complete "CREATE_IN_PROGRESS" :update-failed :delete-in-progress :create-failed :create-in-progress :delete-complete "CREATE_COMPLETE" "UPDATE_COMPLETE" :update-in-progress :delete-skipped "DELETE_FAILED" "UPDATE_FAILED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-attribute #{:properties :tags "UpdatePolicy" "Tags" "CreationPolicy" :update-policy "Properties" "Metadata" :creation-policy :deletion-policy :metadata "DeletionPolicy"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/exports (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/export))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-instance]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/physical-resource-id-context (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/physical-resource-id-context-key-value-pair :max-count 5))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-signal-status #{"SUCCESS" :failure "FAILURE" :success})

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation-action #{"DELETE" :create :update :delete "UPDATE" "CREATE"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stale-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-drift-information/last-check-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-drift-information (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-drift-status] :opt-un [:portkey.aws.cloudformation.stack-drift-information/last-check-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/failure-tolerance-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudformation/account (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[0-9]{12}" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation-result-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-result-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation-result-summary/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation/reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation-result-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/account :portkey.aws.cloudformation/region :portkey.aws.cloudformation.stack-set-operation-result-summary/status :portkey.aws.cloudformation.stack-set-operation-result-summary/status-reason :portkey.aws.cloudformation/account-gate-result]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-drift-detection-status #{"DETECTION_IN_PROGRESS" "DETECTION_FAILED" "DETECTION_COMPLETE" :detection-failed :detection-in-progress :detection-complete})

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.account-limit/name (clojure.spec.alpha/and :portkey.aws.cloudformation/limit-name))
(clojure.spec.alpha/def :portkey.aws.cloudformation.account-limit/value (clojure.spec.alpha/and :portkey.aws.cloudformation/limit-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation/account-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.account-limit/name :portkey.aws.cloudformation.account-limit/value]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/detect-stack-resource-drift-output (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-resource-drift] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.detect-stack-drift-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/detect-stack-drift-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.detect-stack-drift-input/stack-name] :opt-un [:portkey.aws.cloudformation/logical-resource-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/properties (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/set-stack-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name] :opt-un [:portkey.aws.cloudformation/stack-policy-body :portkey.aws.cloudformation/stack-policy-url]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-instances-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/update-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.update-stack-instances-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-name-or-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1600)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-imports-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/imports :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/property-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/operation-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-imports-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/export-name] :opt-un [:portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stacks (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-resource-drifts-output (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-resource-drifts] :opt-un [:portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/update-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name] :opt-un [:portkey.aws.cloudformation/notification-ar-ns :portkey.aws.cloudformation/client-request-token :portkey.aws.cloudformation/template-url :portkey.aws.cloudformation/rollback-configuration :portkey.aws.cloudformation/role-arn :portkey.aws.cloudformation/template-body :portkey.aws.cloudformation/parameters :portkey.aws.cloudformation/tags :portkey.aws.cloudformation/stack-policy-during-update-url :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation/use-previous-template :portkey.aws.cloudformation/stack-policy-url :portkey.aws.cloudformation/resource-types :portkey.aws.cloudformation/stack-policy-body :portkey.aws.cloudformation/stack-policy-during-update-body]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/max-concurrent-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudformation.change/type (clojure.spec.alpha/and :portkey.aws.cloudformation/change-type))
(clojure.spec.alpha/def :portkey.aws.cloudformation/change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.change/type :portkey.aws.cloudformation/resource-change]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.resource-target-definition/attribute (clojure.spec.alpha/and :portkey.aws.cloudformation/resource-attribute))
(clojure.spec.alpha/def :portkey.aws.cloudformation.resource-target-definition/name (clojure.spec.alpha/and :portkey.aws.cloudformation/property-name))
(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-target-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.resource-target-definition/attribute :portkey.aws.cloudformation.resource-target-definition/name :portkey.aws.cloudformation/requires-recreation]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/last-updated-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.parameter/resolved-value (clojure.spec.alpha/and :portkey.aws.cloudformation/parameter-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation/parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/parameter-key :portkey.aws.cloudformation/parameter-value :portkey.aws.cloudformation/use-previous-value :portkey.aws.cloudformation.parameter/resolved-value]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-drift-detection-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/continue-update-rollback-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/transform-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-summary/parent-id (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-summary/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-drift-information-summary))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-summary/root-id (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/creation-time :portkey.aws.cloudformation/stack-status] :opt-un [:portkey.aws.cloudformation/deletion-time :portkey.aws.cloudformation.stack-summary/parent-id :portkey.aws.cloudformation/stack-status-reason :portkey.aws.cloudformation.stack-summary/drift-information :portkey.aws.cloudformation.stack-summary/root-id :portkey.aws.cloudformation/last-updated-time :portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/template-description]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-stack-set-operations-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-set-operations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.list-stack-set-operations-output/summaries :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.update-termination-protection-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/update-termination-protection-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/enable-termination-protection :portkey.aws.cloudformation.update-termination-protection-input/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.delete-stack-instances-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/delete-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.delete-stack-instances-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/parameter-declarations (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/parameter-declaration))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stacks-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/next-token :portkey.aws.cloudformation/stack-status-filter]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation-status #{:running :stopping :stopped "SUCCEEDED" "STOPPED" "FAILED" "STOPPING" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.cloudformation/estimate-template-cost-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/template-body :portkey.aws.cloudformation/template-url :portkey.aws.cloudformation/parameters]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/get-stack-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/property-differences (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/property-difference))

(clojure.spec.alpha/def :portkey.aws.cloudformation/execution-role-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-zA-Z_0-9+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/delete-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-source #{"ResourceReference" :resource-reference :resource-attribute "ResourceAttribute" "ParameterReference" :parameter-reference "Automatic" :automatic :direct-modification "DirectModification"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.create-stack-instances-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/create-stack-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.create-stack-instances-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-stack-set-operation-results-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-result-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-set-operation-results-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.list-stack-set-operation-results-output/summaries :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-change-details (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/resource-change-detail))

(clojure.spec.alpha/def :portkey.aws.cloudformation.property-difference/expected-value (clojure.spec.alpha/and :portkey.aws.cloudformation/property-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation.property-difference/actual-value (clojure.spec.alpha/and :portkey.aws.cloudformation/property-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation/property-difference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/property-path :portkey.aws.cloudformation.property-difference/expected-value :portkey.aws.cloudformation.property-difference/actual-value :portkey.aws.cloudformation/difference-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-stack-set-operation-results-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-set-operation-results-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name :portkey.aws.cloudformation.list-stack-set-operation-results-input/operation-id] :opt-un [:portkey.aws.cloudformation/next-token :portkey.aws.cloudformation/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/enable-termination-protection clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation.get-template-output/stages-available (clojure.spec.alpha/and :portkey.aws.cloudformation/stage-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation/get-template-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/template-body :portkey.aws.cloudformation.get-template-output/stages-available]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource-detail/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource-detail/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-resource-drift-information))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/logical-resource-id :portkey.aws.cloudformation/resource-type :portkey.aws.cloudformation.stack-resource-detail/last-updated-timestamp :portkey.aws.cloudformation/resource-status] :opt-un [:portkey.aws.cloudformation/physical-resource-id :portkey.aws.cloudformation/resource-status-reason :portkey.aws.cloudformation.stack-resource-detail/drift-information :portkey.aws.cloudformation/description :portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/metadata :portkey.aws.cloudformation/stack-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/allowed-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-resources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-resources]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudformation/use-previous-template clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation/metadata (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/execute-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.get-template-summary-output/parameters (clojure.spec.alpha/and :portkey.aws.cloudformation/parameter-declarations))
(clojure.spec.alpha/def :portkey.aws.cloudformation.get-template-summary-output/declared-transforms (clojure.spec.alpha/and :portkey.aws.cloudformation/transforms-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation/get-template-summary-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.get-template-summary-output/parameters :portkey.aws.cloudformation/description :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation/capabilities-reason :portkey.aws.cloudformation/resource-types :portkey.aws.cloudformation/version :portkey.aws.cloudformation/metadata :portkey.aws.cloudformation.get-template-summary-output/declared-transforms]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-policy-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1350))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/logical-resource-ids (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/logical-resource-id :min-count 1 :max-count 200))

(clojure.spec.alpha/def :portkey.aws.cloudformation/execution-status #{:execute-complete :execute-failed :unavailable "AVAILABLE" :obsolete "EXECUTE_FAILED" "EXECUTE_COMPLETE" "OBSOLETE" "UNAVAILABLE" "EXECUTE_IN_PROGRESS" :available :execute-in-progress})

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-drift-detection-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-set-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.cloudformation.tag/key (clojure.spec.alpha/and :portkey.aws.cloudformation/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudformation.tag/value (clojure.spec.alpha/and :portkey.aws.cloudformation/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudformation/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.tag/key :portkey.aws.cloudformation.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation/reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/replacement #{:true :false "False" "Conditional" "True" :conditional})

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-change-sets-output/summaries (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-summaries))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-change-sets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.list-change-sets-output/summaries :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/difference-type #{"ADD" :remove "REMOVE" :not-equal :add "NOT_EQUAL"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-set-operation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation/output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/output-key :portkey.aws.cloudformation/output-value :portkey.aws.cloudformation/description :portkey.aws.cloudformation/export-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/boxed-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-resources-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name] :opt-un [:portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/no-echo clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-drift-status-filters (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-resource-drift-status :min-count 1 :max-count 4))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-types (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/resource-type))

(clojure.spec.alpha/def :portkey.aws.cloudformation/get-stack-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-policy-body]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/account-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/account))

(clojure.spec.alpha/def :portkey.aws.cloudformation/template-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.create-stack-input/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.cloudformation/timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.cloudformation/create-stack-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name] :opt-un [:portkey.aws.cloudformation/notification-ar-ns :portkey.aws.cloudformation/client-request-token :portkey.aws.cloudformation/template-url :portkey.aws.cloudformation/rollback-configuration :portkey.aws.cloudformation/role-arn :portkey.aws.cloudformation/template-body :portkey.aws.cloudformation.create-stack-input/timeout-in-minutes :portkey.aws.cloudformation/parameters :portkey.aws.cloudformation/tags :portkey.aws.cloudformation/disable-rollback :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation/enable-termination-protection :portkey.aws.cloudformation/stack-policy-url :portkey.aws.cloudformation/resource-types :portkey.aws.cloudformation/on-failure :portkey.aws.cloudformation/stack-policy-body]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/use-previous-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudformation/created-but-modified-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-set-output/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/update-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.update-stack-set-output/operation-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/output-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/event-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-change-set-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.describe-change-set-input/change-set-name] :opt-un [:portkey.aws.cloudformation.describe-change-set-input/stack-name :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/max-concurrent-percentage (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-change-set-output/status (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-change-set-output/status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-status-reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-change-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/notification-ar-ns :portkey.aws.cloudformation/rollback-configuration :portkey.aws.cloudformation/parameters :portkey.aws.cloudformation/change-set-name :portkey.aws.cloudformation/change-set-id :portkey.aws.cloudformation/changes :portkey.aws.cloudformation/tags :portkey.aws.cloudformation.describe-change-set-output/status :portkey.aws.cloudformation/next-token :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation.describe-change-set-output/status-reason :portkey.aws.cloudformation/description :portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/creation-time :portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/execution-status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/on-failure #{:rollback "DELETE" "DO_NOTHING" :delete "ROLLBACK" :do-nothing})

(clojure.spec.alpha/def :portkey.aws.cloudformation.resource-change-detail/target (clojure.spec.alpha/and :portkey.aws.cloudformation/resource-target-definition))
(clojure.spec.alpha/def :portkey.aws.cloudformation.resource-change-detail/evaluation (clojure.spec.alpha/and :portkey.aws.cloudformation/evaluation-type))
(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-change-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.resource-change-detail/target :portkey.aws.cloudformation.resource-change-detail/evaluation :portkey.aws.cloudformation/change-source :portkey.aws.cloudformation/causing-entity]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-events-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource-drift-status #{"NOT_CHECKED" :deleted :not-checked "IN_SYNC" "MODIFIED" :in-sync :modified "DELETED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-change-sets-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-change-sets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.list-change-sets-input/stack-name] :opt-un [:portkey.aws.cloudformation/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-set-operations-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name] :opt-un [:portkey.aws.cloudformation/next-token :portkey.aws.cloudformation/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stop-stack-set-operation-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stop-stack-set-operation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name :portkey.aws.cloudformation.stop-stack-set-operation-input/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.continue-update-rollback-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/continue-update-rollback-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.continue-update-rollback-input/stack-name] :opt-un [:portkey.aws.cloudformation/role-arn :portkey.aws.cloudformation/resources-to-skip :portkey.aws.cloudformation/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation-result-summaries (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-set-operation-result-summary))

(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-set-input/regions (clojure.spec.alpha/and :portkey.aws.cloudformation/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-set-input/accounts (clojure.spec.alpha/and :portkey.aws.cloudformation/account-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-set-input/operation-id (clojure.spec.alpha/and :portkey.aws.cloudformation/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-set-input/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation.update-stack-set-input/operation-preferences (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-operation-preferences))
(clojure.spec.alpha/def :portkey.aws.cloudformation/update-stack-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-set-name] :opt-un [:portkey.aws.cloudformation/template-url :portkey.aws.cloudformation/template-body :portkey.aws.cloudformation/parameters :portkey.aws.cloudformation/tags :portkey.aws.cloudformation.update-stack-set-input/regions :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation.update-stack-set-input/accounts :portkey.aws.cloudformation/description :portkey.aws.cloudformation.update-stack-set-input/operation-id :portkey.aws.cloudformation.update-stack-set-input/administration-role-arn :portkey.aws.cloudformation/execution-role-name :portkey.aws.cloudformation/use-previous-template :portkey.aws.cloudformation.update-stack-set-input/operation-preferences]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/output-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-operation-preferences/region-order (clojure.spec.alpha/and :portkey.aws.cloudformation/region-list))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-operation-preferences (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation.stack-set-operation-preferences/region-order :portkey.aws.cloudformation/failure-tolerance-count :portkey.aws.cloudformation/failure-tolerance-percentage :portkey.aws.cloudformation/max-concurrent-count :portkey.aws.cloudformation/max-concurrent-percentage]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/detect-stack-drift-output (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-drift-detection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/change-set-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/account-gate-status #{:skipped "SUCCEEDED" "FAILED" :failed :succeeded "SKIPPED"})

(clojure.spec.alpha/def :portkey.aws.cloudformation/stage-list (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/template-stage))

(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-drift-detection-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-drift-detection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation/operation-id-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.cloudformation/timeout-minutes))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack/parent-id (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-drift-information))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack/root-id (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation/creation-time :portkey.aws.cloudformation/stack-status] :opt-un [:portkey.aws.cloudformation/notification-ar-ns :portkey.aws.cloudformation/rollback-configuration :portkey.aws.cloudformation/role-arn :portkey.aws.cloudformation.stack/timeout-in-minutes :portkey.aws.cloudformation/parameters :portkey.aws.cloudformation/deletion-time :portkey.aws.cloudformation/change-set-id :portkey.aws.cloudformation.stack/parent-id :portkey.aws.cloudformation/tags :portkey.aws.cloudformation/disable-rollback :portkey.aws.cloudformation/outputs :portkey.aws.cloudformation/stack-status-reason :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation.stack/drift-information :portkey.aws.cloudformation.stack/root-id :portkey.aws.cloudformation/description :portkey.aws.cloudformation/last-updated-time :portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/enable-termination-protection]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-policy-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set/status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set/administration-role-arn (clojure.spec.alpha/and :portkey.aws.cloudformation/role-arn))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/template-body :portkey.aws.cloudformation/parameters :portkey.aws.cloudformation/tags :portkey.aws.cloudformation.stack-set/status :portkey.aws.cloudformation/capabilities :portkey.aws.cloudformation/stack-set-arn :portkey.aws.cloudformation/description :portkey.aws.cloudformation.stack-set/administration-role-arn :portkey.aws.cloudformation/stack-set-id :portkey.aws.cloudformation/execution-role-name :portkey.aws.cloudformation/stack-set-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.get-template-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/get-template-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-name :portkey.aws.cloudformation.get-template-input/change-set-name :portkey.aws.cloudformation/template-stage]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-drift-information-summary/last-check-timestamp (clojure.spec.alpha/and :portkey.aws.cloudformation/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-drift-information-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-drift-status] :opt-un [:portkey.aws.cloudformation.stack-drift-information-summary/last-check-timestamp]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/limit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/scope (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/resource-attribute))

(clojure.spec.alpha/def :portkey.aws.cloudformation.list-stack-sets-input/status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation/list-stack-sets-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/next-token :portkey.aws.cloudformation/max-results :portkey.aws.cloudformation.list-stack-sets-input/status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/monitoring-time-in-minutes (clojure.spec.alpha/int-in 0 180))

(clojure.spec.alpha/def :portkey.aws.cloudformation/account-gate-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/parameter-constraints (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/allowed-values]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-resource/drift-information (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-resource-drift-information))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/logical-resource-id :portkey.aws.cloudformation/resource-type :portkey.aws.cloudformation/timestamp :portkey.aws.cloudformation/resource-status] :opt-un [:portkey.aws.cloudformation/physical-resource-id :portkey.aws.cloudformation/resource-status-reason :portkey.aws.cloudformation.stack-resource/drift-information :portkey.aws.cloudformation/description :portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/stack-name]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.execute-change-set-input/change-set-name (clojure.spec.alpha/and :portkey.aws.cloudformation/change-set-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation.execute-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-name-or-id))
(clojure.spec.alpha/def :portkey.aws.cloudformation/execute-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation.execute-change-set-input/change-set-name] :opt-un [:portkey.aws.cloudformation.execute-change-set-input/stack-name :portkey.aws.cloudformation/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-signal-unique-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-status-filter (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/stack-status))

(clojure.spec.alpha/def :portkey.aws.cloudformation/parameter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/limit-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudformation/causing-entity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/create-stack-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-set-id]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-policy-during-update-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.cloudformation.stack-set-summary/status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-set-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation/stack-set-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudformation/stack-set-name :portkey.aws.cloudformation/stack-set-id :portkey.aws.cloudformation/description :portkey.aws.cloudformation.stack-set-summary/status]))

(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-stack-drift-detection-status-output/detection-status (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-drift-detection-status))
(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-stack-drift-detection-status-output/detection-status-reason (clojure.spec.alpha/and :portkey.aws.cloudformation/stack-drift-detection-status-reason))
(clojure.spec.alpha/def :portkey.aws.cloudformation.describe-stack-drift-detection-status-output/drifted-stack-resource-count (clojure.spec.alpha/and :portkey.aws.cloudformation/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.cloudformation/describe-stack-drift-detection-status-output (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudformation/stack-id :portkey.aws.cloudformation/stack-drift-detection-id :portkey.aws.cloudformation.describe-stack-drift-detection-status-output/detection-status :portkey.aws.cloudformation/timestamp] :opt-un [:portkey.aws.cloudformation/stack-drift-status :portkey.aws.cloudformation.describe-stack-drift-detection-status-output/detection-status-reason :portkey.aws.cloudformation.describe-stack-drift-detection-status-output/drifted-stack-resource-count]))

(clojure.spec.alpha/def :portkey.aws.cloudformation/resource-properties (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudformation/timeout-minutes (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudformation/template-parameters (clojure.spec.alpha/coll-of :portkey.aws.cloudformation/template-parameter))

(clojure.core/defn continue-update-rollback ([continue-update-rollback-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-continue-update-rollback-input continue-update-rollback-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/continue-update-rollback-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/continue-update-rollback-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ContinueUpdateRollbackResult", :http.request.configuration/action "ContinueUpdateRollback", :http.request.configuration/output-deser-fn response-continue-update-rollback-output, :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef continue-update-rollback :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/continue-update-rollback-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/continue-update-rollback-output))

(clojure.core/defn validate-template ([] (validate-template {})) ([validate-template-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-validate-template-input validate-template-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/validate-template-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/validate-template-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ValidateTemplateResult", :http.request.configuration/action "ValidateTemplate", :http.request.configuration/output-deser-fn response-validate-template-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef validate-template :args (clojure.spec.alpha/? :portkey.aws.cloudformation/validate-template-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/validate-template-output))

(clojure.core/defn delete-stack-instances ([delete-stack-instances-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-stack-instances-input delete-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/delete-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/delete-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteStackInstancesResult", :http.request.configuration/action "DeleteStackInstances", :http.request.configuration/output-deser-fn response-delete-stack-instances-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef delete-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/delete-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/delete-stack-instances-output))

(clojure.core/defn delete-stack ([delete-stack-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-stack-input delete-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/delete-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStack", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef delete-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/delete-stack-input) :ret clojure.core/true?)

(clojure.core/defn create-stack-instances ([create-stack-instances-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-stack-instances-input create-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/create-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/create-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateStackInstancesResult", :http.request.configuration/action "CreateStackInstances", :http.request.configuration/output-deser-fn response-create-stack-instances-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation/invalid-operation-exception, "LimitExceededException" :portkey.aws.cloudformation/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/create-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/create-stack-instances-output))

(clojure.core/defn describe-account-limits ([] (describe-account-limits {})) ([describe-account-limits-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-account-limits-input describe-account-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-account-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-account-limits-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAccountLimitsResult", :http.request.configuration/action "DescribeAccountLimits", :http.request.configuration/output-deser-fn response-describe-account-limits-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.cloudformation/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-account-limits-output))

(clojure.core/defn list-change-sets ([list-change-sets-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-change-sets-input list-change-sets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-change-sets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-change-sets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListChangeSetsResult", :http.request.configuration/action "ListChangeSets", :http.request.configuration/output-deser-fn response-list-change-sets-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-change-sets :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/list-change-sets-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-change-sets-output))

(clojure.core/defn detect-stack-drift ([detect-stack-drift-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-detect-stack-drift-input detect-stack-drift-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/detect-stack-drift-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/detect-stack-drift-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetectStackDriftResult", :http.request.configuration/action "DetectStackDrift", :http.request.configuration/output-deser-fn response-detect-stack-drift-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef detect-stack-drift :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/detect-stack-drift-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/detect-stack-drift-output))

(clojure.core/defn describe-stack-resources ([] (describe-stack-resources {})) ([describe-stack-resources-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stack-resources-input describe-stack-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stack-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stack-resources-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackResourcesResult", :http.request.configuration/action "DescribeStackResources", :http.request.configuration/output-deser-fn response-describe-stack-resources-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-resources :args (clojure.spec.alpha/? :portkey.aws.cloudformation/describe-stack-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stack-resources-output))

(clojure.core/defn list-stack-sets ([] (list-stack-sets {})) ([list-stack-sets-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-stack-sets-input list-stack-sets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-stack-sets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-stack-sets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackSetsResult", :http.request.configuration/action "ListStackSets", :http.request.configuration/output-deser-fn response-list-stack-sets-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stack-sets :args (clojure.spec.alpha/? :portkey.aws.cloudformation/list-stack-sets-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-stack-sets-output))

(clojure.core/defn delete-change-set ([delete-change-set-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-change-set-input delete-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/delete-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/delete-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteChangeSetResult", :http.request.configuration/action "DeleteChangeSet", :http.request.configuration/output-deser-fn response-delete-change-set-output, :http.request.spec/error-spec {"InvalidChangeSetStatusException" :portkey.aws.cloudformation/invalid-change-set-status-exception}})))))
(clojure.spec.alpha/fdef delete-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/delete-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/delete-change-set-output))

(clojure.core/defn describe-stack-set ([describe-stack-set-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stack-set-input describe-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackSetResult", :http.request.configuration/action "DescribeStackSet", :http.request.configuration/output-deser-fn response-describe-stack-set-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/describe-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stack-set-output))

(clojure.core/defn update-stack ([update-stack-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-stack-input update-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/update-stack-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/update-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateStackResult", :http.request.configuration/action "UpdateStack", :http.request.configuration/output-deser-fn response-update-stack-output, :http.request.spec/error-spec {"InsufficientCapabilitiesException" :portkey.aws.cloudformation/insufficient-capabilities-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef update-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/update-stack-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/update-stack-output))

(clojure.core/defn list-imports ([list-imports-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-imports-input list-imports-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-imports-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-imports-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListImportsResult", :http.request.configuration/action "ListImports", :http.request.configuration/output-deser-fn response-list-imports-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-imports :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/list-imports-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-imports-output))

(clojure.core/defn get-stack-policy ([get-stack-policy-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-stack-policy-input get-stack-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/get-stack-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/get-stack-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetStackPolicyResult", :http.request.configuration/action "GetStackPolicy", :http.request.configuration/output-deser-fn response-get-stack-policy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-stack-policy :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/get-stack-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/get-stack-policy-output))

(clojure.core/defn cancel-update-stack ([cancel-update-stack-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-cancel-update-stack-input cancel-update-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/cancel-update-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelUpdateStack", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"TokenAlreadyExistsException" :portkey.aws.cloudformation/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef cancel-update-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/cancel-update-stack-input) :ret clojure.core/true?)

(clojure.core/defn list-stack-set-operation-results ([list-stack-set-operation-results-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-stack-set-operation-results-input list-stack-set-operation-results-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-stack-set-operation-results-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-stack-set-operation-results-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackSetOperationResultsResult", :http.request.configuration/action "ListStackSetOperationResults", :http.request.configuration/output-deser-fn response-list-stack-set-operation-results-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation/operation-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-set-operation-results :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/list-stack-set-operation-results-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-stack-set-operation-results-output))

(clojure.core/defn describe-stack-drift-detection-status ([describe-stack-drift-detection-status-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stack-drift-detection-status-input describe-stack-drift-detection-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stack-drift-detection-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stack-drift-detection-status-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackDriftDetectionStatusResult", :http.request.configuration/action "DescribeStackDriftDetectionStatus", :http.request.configuration/output-deser-fn response-describe-stack-drift-detection-status-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-drift-detection-status :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/describe-stack-drift-detection-status-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stack-drift-detection-status-output))

(clojure.core/defn describe-stack-resource-drifts ([describe-stack-resource-drifts-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stack-resource-drifts-input describe-stack-resource-drifts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stack-resource-drifts-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stack-resource-drifts-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackResourceDriftsResult", :http.request.configuration/action "DescribeStackResourceDrifts", :http.request.configuration/output-deser-fn response-describe-stack-resource-drifts-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-resource-drifts :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/describe-stack-resource-drifts-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stack-resource-drifts-output))

(clojure.core/defn create-stack-set ([create-stack-set-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-stack-set-input create-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/create-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/create-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateStackSetResult", :http.request.configuration/action "CreateStackSet", :http.request.configuration/output-deser-fn response-create-stack-set-output, :http.request.spec/error-spec {"NameAlreadyExistsException" :portkey.aws.cloudformation/name-already-exists-exception, "CreatedButModifiedException" :portkey.aws.cloudformation/created-but-modified-exception, "LimitExceededException" :portkey.aws.cloudformation/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/create-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/create-stack-set-output))

(clojure.core/defn update-stack-instances ([update-stack-instances-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-stack-instances-input update-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/update-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/update-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateStackInstancesResult", :http.request.configuration/action "UpdateStackInstances", :http.request.configuration/output-deser-fn response-update-stack-instances-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation/stack-instance-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef update-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/update-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/update-stack-instances-output))

(clojure.core/defn describe-stack-instance ([describe-stack-instance-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stack-instance-input describe-stack-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stack-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stack-instance-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackInstanceResult", :http.request.configuration/action "DescribeStackInstance", :http.request.configuration/output-deser-fn response-describe-stack-instance-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation/stack-instance-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-instance :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/describe-stack-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stack-instance-output))

(clojure.core/defn update-stack-set ([update-stack-set-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-stack-set-input update-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/update-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/update-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateStackSetResult", :http.request.configuration/action "UpdateStackSet", :http.request.configuration/output-deser-fn response-update-stack-set-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception, "OperationInProgressException" :portkey.aws.cloudformation/operation-in-progress-exception, "OperationIdAlreadyExistsException" :portkey.aws.cloudformation/operation-id-already-exists-exception, "StaleRequestException" :portkey.aws.cloudformation/stale-request-exception, "InvalidOperationException" :portkey.aws.cloudformation/invalid-operation-exception, "StackInstanceNotFoundException" :portkey.aws.cloudformation/stack-instance-not-found-exception}})))))
(clojure.spec.alpha/fdef update-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/update-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/update-stack-set-output))

(clojure.core/defn describe-change-set ([describe-change-set-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-change-set-input describe-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeChangeSetResult", :http.request.configuration/action "DescribeChangeSet", :http.request.configuration/output-deser-fn response-describe-change-set-output, :http.request.spec/error-spec {"ChangeSetNotFoundException" :portkey.aws.cloudformation/change-set-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/describe-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-change-set-output))

(clojure.core/defn execute-change-set ([execute-change-set-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-execute-change-set-input execute-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/execute-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/execute-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ExecuteChangeSetResult", :http.request.configuration/action "ExecuteChangeSet", :http.request.configuration/output-deser-fn response-execute-change-set-output, :http.request.spec/error-spec {"InvalidChangeSetStatusException" :portkey.aws.cloudformation/invalid-change-set-status-exception, "ChangeSetNotFoundException" :portkey.aws.cloudformation/change-set-not-found-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation/insufficient-capabilities-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation/token-already-exists-exception}})))))
(clojure.spec.alpha/fdef execute-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/execute-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/execute-change-set-output))

(clojure.core/defn detect-stack-resource-drift ([detect-stack-resource-drift-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-detect-stack-resource-drift-input detect-stack-resource-drift-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/detect-stack-resource-drift-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/detect-stack-resource-drift-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetectStackResourceDriftResult", :http.request.configuration/action "DetectStackResourceDrift", :http.request.configuration/output-deser-fn response-detect-stack-resource-drift-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef detect-stack-resource-drift :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/detect-stack-resource-drift-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/detect-stack-resource-drift-output))

(clojure.core/defn list-exports ([] (list-exports {})) ([list-exports-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-exports-input list-exports-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-exports-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-exports-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListExportsResult", :http.request.configuration/action "ListExports", :http.request.configuration/output-deser-fn response-list-exports-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-exports :args (clojure.spec.alpha/? :portkey.aws.cloudformation/list-exports-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-exports-output))

(clojure.core/defn create-stack ([create-stack-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-stack-input create-stack-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/create-stack-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/create-stack-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateStackResult", :http.request.configuration/action "CreateStack", :http.request.configuration/output-deser-fn response-create-stack-output, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.cloudformation/limit-exceeded-exception, "AlreadyExistsException" :portkey.aws.cloudformation/already-exists-exception, "TokenAlreadyExistsException" :portkey.aws.cloudformation/token-already-exists-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation/insufficient-capabilities-exception}})))))
(clojure.spec.alpha/fdef create-stack :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/create-stack-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/create-stack-output))

(clojure.core/defn list-stack-resources ([list-stack-resources-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-stack-resources-input list-stack-resources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-stack-resources-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-stack-resources-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackResourcesResult", :http.request.configuration/action "ListStackResources", :http.request.configuration/output-deser-fn response-list-stack-resources-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stack-resources :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/list-stack-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-stack-resources-output))

(clojure.core/defn list-stack-instances ([list-stack-instances-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-stack-instances-input list-stack-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-stack-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-stack-instances-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackInstancesResult", :http.request.configuration/action "ListStackInstances", :http.request.configuration/output-deser-fn response-list-stack-instances-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-instances :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/list-stack-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-stack-instances-output))

(clojure.core/defn describe-stack-set-operation ([describe-stack-set-operation-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stack-set-operation-input describe-stack-set-operation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stack-set-operation-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stack-set-operation-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackSetOperationResult", :http.request.configuration/action "DescribeStackSetOperation", :http.request.configuration/output-deser-fn response-describe-stack-set-operation-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation/operation-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-stack-set-operation :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/describe-stack-set-operation-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stack-set-operation-output))

(clojure.core/defn get-template-summary ([] (get-template-summary {})) ([get-template-summary-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-template-summary-input get-template-summary-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/get-template-summary-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/get-template-summary-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetTemplateSummaryResult", :http.request.configuration/action "GetTemplateSummary", :http.request.configuration/output-deser-fn response-get-template-summary-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef get-template-summary :args (clojure.spec.alpha/? :portkey.aws.cloudformation/get-template-summary-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/get-template-summary-output))

(clojure.core/defn set-stack-policy ([set-stack-policy-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-stack-policy-input set-stack-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/set-stack-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetStackPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef set-stack-policy :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/set-stack-policy-input) :ret clojure.core/true?)

(clojure.core/defn list-stack-set-operations ([list-stack-set-operations-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-stack-set-operations-input list-stack-set-operations-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-stack-set-operations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-stack-set-operations-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStackSetOperationsResult", :http.request.configuration/action "ListStackSetOperations", :http.request.configuration/output-deser-fn response-list-stack-set-operations-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception}})))))
(clojure.spec.alpha/fdef list-stack-set-operations :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/list-stack-set-operations-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-stack-set-operations-output))

(clojure.core/defn describe-stacks ([] (describe-stacks {})) ([describe-stacks-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stacks-input describe-stacks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stacks-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stacks-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStacksResult", :http.request.configuration/action "DescribeStacks", :http.request.configuration/output-deser-fn response-describe-stacks-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stacks :args (clojure.spec.alpha/? :portkey.aws.cloudformation/describe-stacks-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stacks-output))

(clojure.core/defn delete-stack-set ([delete-stack-set-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-stack-set-input delete-stack-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/delete-stack-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/delete-stack-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteStackSetResult", :http.request.configuration/action "DeleteStackSet", :http.request.configuration/output-deser-fn response-delete-stack-set-output, :http.request.spec/error-spec {"StackSetNotEmptyException" :portkey.aws.cloudformation/stack-set-not-empty-exception, "OperationInProgressException" :portkey.aws.cloudformation/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-stack-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/delete-stack-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/delete-stack-set-output))

(clojure.core/defn list-stacks ([] (list-stacks {})) ([list-stacks-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-stacks-input list-stacks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/list-stacks-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/list-stacks-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListStacksResult", :http.request.configuration/action "ListStacks", :http.request.configuration/output-deser-fn response-list-stacks-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-stacks :args (clojure.spec.alpha/? :portkey.aws.cloudformation/list-stacks-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/list-stacks-output))

(clojure.core/defn describe-stack-events ([] (describe-stack-events {})) ([describe-stack-events-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stack-events-input describe-stack-events-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stack-events-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stack-events-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackEventsResult", :http.request.configuration/action "DescribeStackEvents", :http.request.configuration/output-deser-fn response-describe-stack-events-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-events :args (clojure.spec.alpha/? :portkey.aws.cloudformation/describe-stack-events-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stack-events-output))

(clojure.core/defn update-termination-protection ([update-termination-protection-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-termination-protection-input update-termination-protection-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/update-termination-protection-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/update-termination-protection-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateTerminationProtectionResult", :http.request.configuration/action "UpdateTerminationProtection", :http.request.configuration/output-deser-fn response-update-termination-protection-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-termination-protection :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/update-termination-protection-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/update-termination-protection-output))

(clojure.core/defn create-change-set ([create-change-set-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-change-set-input create-change-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/create-change-set-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/create-change-set-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateChangeSetResult", :http.request.configuration/action "CreateChangeSet", :http.request.configuration/output-deser-fn response-create-change-set-output, :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.cloudformation/already-exists-exception, "InsufficientCapabilitiesException" :portkey.aws.cloudformation/insufficient-capabilities-exception, "LimitExceededException" :portkey.aws.cloudformation/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-change-set :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/create-change-set-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/create-change-set-output))

(clojure.core/defn signal-resource ([signal-resource-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-signal-resource-input signal-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/signal-resource-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SignalResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef signal-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/signal-resource-input) :ret clojure.core/true?)

(clojure.core/defn describe-stack-resource ([describe-stack-resource-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-stack-resource-input describe-stack-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/describe-stack-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/describe-stack-resource-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeStackResourceResult", :http.request.configuration/action "DescribeStackResource", :http.request.configuration/output-deser-fn response-describe-stack-resource-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-stack-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/describe-stack-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/describe-stack-resource-output))

(clojure.core/defn stop-stack-set-operation ([stop-stack-set-operation-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-stop-stack-set-operation-input stop-stack-set-operation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/stop-stack-set-operation-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/stop-stack-set-operation-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "StopStackSetOperationResult", :http.request.configuration/action "StopStackSetOperation", :http.request.configuration/output-deser-fn response-stop-stack-set-operation-output, :http.request.spec/error-spec {"StackSetNotFoundException" :portkey.aws.cloudformation/stack-set-not-found-exception, "OperationNotFoundException" :portkey.aws.cloudformation/operation-not-found-exception, "InvalidOperationException" :portkey.aws.cloudformation/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef stop-stack-set-operation :args (clojure.spec.alpha/tuple :portkey.aws.cloudformation/stop-stack-set-operation-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/stop-stack-set-operation-output))

(clojure.core/defn estimate-template-cost ([] (estimate-template-cost {})) ([estimate-template-cost-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-estimate-template-cost-input estimate-template-cost-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/estimate-template-cost-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/estimate-template-cost-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "EstimateTemplateCostResult", :http.request.configuration/action "EstimateTemplateCost", :http.request.configuration/output-deser-fn response-estimate-template-cost-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef estimate-template-cost :args (clojure.spec.alpha/? :portkey.aws.cloudformation/estimate-template-cost-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/estimate-template-cost-output))

(clojure.core/defn get-template ([] (get-template {})) ([get-template-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-template-input get-template-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudformation/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudformation/get-template-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-15", :http.request.configuration/service-id "CloudFormation", :http.request.spec/input-spec :portkey.aws.cloudformation/get-template-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetTemplateResult", :http.request.configuration/action "GetTemplate", :http.request.configuration/output-deser-fn response-get-template-output, :http.request.spec/error-spec {"ChangeSetNotFoundException" :portkey.aws.cloudformation/change-set-not-found-exception}})))))
(clojure.spec.alpha/fdef get-template :args (clojure.spec.alpha/? :portkey.aws.cloudformation/get-template-input) :ret (clojure.spec.alpha/and :portkey.aws.cloudformation/get-template-output))
