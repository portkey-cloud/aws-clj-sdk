(ns portkey.aws.inspector (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "inspector", :region "ap-northeast-1"},
    :ssl-common-name "inspector.ap-northeast-1.amazonaws.com",
    :endpoint "https://inspector.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "inspector", :region "eu-west-1"},
    :ssl-common-name "inspector.eu-west-1.amazonaws.com",
    :endpoint "https://inspector.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "inspector", :region "us-east-2"},
    :ssl-common-name "inspector.us-east-2.amazonaws.com",
    :endpoint "https://inspector.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "inspector", :region "ap-southeast-2"},
    :ssl-common-name "inspector.ap-southeast-2.amazonaws.com",
    :endpoint "https://inspector.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "inspector", :region "ap-northeast-2"},
    :ssl-common-name "inspector.ap-northeast-2.amazonaws.com",
    :endpoint "https://inspector.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "inspector", :region "eu-central-1"},
    :ssl-common-name "inspector.eu-central-1.amazonaws.com",
    :endpoint "https://inspector.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "inspector", :region "us-gov-west-1"},
    :ssl-common-name "inspector.us-gov-west-1.amazonaws.com",
    :endpoint "https://inspector.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "inspector", :region "us-west-2"},
    :ssl-common-name "inspector.us-west-2.amazonaws.com",
    :endpoint "https://inspector.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "inspector", :region "us-east-1"},
    :ssl-common-name "inspector.us-east-1.amazonaws.com",
    :endpoint "https://inspector.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "inspector", :region "us-west-1"},
    :ssl-common-name "inspector.us-west-1.amazonaws.com",
    :endpoint "https://inspector.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "inspector", :region "ap-south-1"},
    :ssl-common-name "inspector.ap-south-1.amazonaws.com",
    :endpoint "https://inspector.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-severity)

(clojure.core/declare ser-rule-name-list)

(clojure.core/declare ser-attribute-list)

(clojure.core/declare ser-assessment-run-state)

(clojure.core/declare ser-rule-name)

(clojure.core/declare ser-locale)

(clojure.core/declare ser-assessment-run-state-list)

(clojure.core/declare ser-inspector-event)

(clojure.core/declare ser-user-attribute-list)

(clojure.core/declare ser-assessment-template-rules-package-arn-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-agent-health)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-assessment-template-filter)

(clojure.core/declare ser-batch-describe-exclusions-arn-list)

(clojure.core/declare ser-auto-scaling-group-list)

(clojure.core/declare ser-agent-id-list)

(clojure.core/declare ser-assessment-target-name)

(clojure.core/declare ser-attribute)

(clojure.core/declare ser-preview-agents-max-results)

(clojure.core/declare ser-assessment-run-duration)

(clojure.core/declare ser-add-remove-attributes-finding-arn-list)

(clojure.core/declare ser-agent-health-code-list)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-assessment-run-name)

(clojure.core/declare ser-filter-rules-package-arn-list)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-resource-group-tags)

(clojure.core/declare ser-agent-id)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-assessment-target-filter)

(clojure.core/declare ser-assessment-run-filter)

(clojure.core/declare ser-attribute-key)

(clojure.core/declare ser-timestamp-range)

(clojure.core/declare ser-auto-scaling-group)

(clojure.core/declare ser-batch-describe-arn-list)

(clojure.core/declare ser-report-file-format)

(clojure.core/declare ser-list-event-subscriptions-max-results)

(clojure.core/declare ser-report-type)

(clojure.core/declare ser-severity-list)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-user-attribute-key-list)

(clojure.core/declare ser-duration-range)

(clojure.core/declare ser-agent-filter)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-list-parent-arn-list)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-list-max-results)

(clojure.core/declare ser-agent-health-list)

(clojure.core/declare ser-stop-action)

(clojure.core/declare ser-finding-filter)

(clojure.core/declare ser-resource-group-tag)

(clojure.core/declare ser-assessment-template-name)

(clojure.core/declare ser-agent-health-code)

(clojure.core/declare ser-uuid)

(clojure.core/declare ser-name-pattern)

(clojure.core/defn- ser-severity [input] #:http.request.field{:value (clojure.core/get {"Undefined" "Undefined", "Medium" "Medium", :medium "Medium", :high "High", "High" "High", :undefined "Undefined", :low "Low", "Low" "Low", :informational "Informational", "Informational" "Informational"} input), :shape "Severity"})

(clojure.core/defn- ser-rule-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-name coll) #:http.request.field{:shape "RuleName"}))) input), :shape "RuleNameList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute coll) #:http.request.field{:shape "Attribute"}))) input), :shape "AttributeList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-assessment-run-state [input] #:http.request.field{:value (clojure.core/get {"COMPLETED" "COMPLETED", "CANCELED" "CANCELED", :stop-data-collection-pending "STOP_DATA_COLLECTION_PENDING", :start-evaluating-rules-pending "START_EVALUATING_RULES_PENDING", :completed "COMPLETED", "COMPLETED_WITH_ERRORS" "COMPLETED_WITH_ERRORS", :created "CREATED", "START_DATA_COLLECTION_PENDING" "START_DATA_COLLECTION_PENDING", :start-data-collection-pending "START_DATA_COLLECTION_PENDING", "ERROR" "ERROR", :start-data-collection-in-progress "START_DATA_COLLECTION_IN_PROGRESS", "START_DATA_COLLECTION_IN_PROGRESS" "START_DATA_COLLECTION_IN_PROGRESS", "EVALUATING_RULES" "EVALUATING_RULES", :collecting-data "COLLECTING_DATA", "DATA_COLLECTED" "DATA_COLLECTED", :data-collected "DATA_COLLECTED", :canceled "CANCELED", "STOP_DATA_COLLECTION_PENDING" "STOP_DATA_COLLECTION_PENDING", "FAILED" "FAILED", :error "ERROR", "START_EVALUATING_RULES_PENDING" "START_EVALUATING_RULES_PENDING", :completed-with-errors "COMPLETED_WITH_ERRORS", "COLLECTING_DATA" "COLLECTING_DATA", :evaluating-rules "EVALUATING_RULES", :failed "FAILED", "CREATED" "CREATED"} input), :shape "AssessmentRunState"})

(clojure.core/defn- ser-rule-name [input] #:http.request.field{:value input, :shape "RuleName"})

(clojure.core/defn- ser-locale [input] #:http.request.field{:value (clojure.core/get {"EN_US" "EN_US", :en-us "EN_US"} input), :shape "Locale"})

(clojure.core/defn- ser-assessment-run-state-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-assessment-run-state coll) #:http.request.field{:shape "AssessmentRunState"}))) input), :shape "AssessmentRunStateList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-inspector-event [input] #:http.request.field{:value (clojure.core/get {"FINDING_REPORTED" "FINDING_REPORTED", "ASSESSMENT_RUN_COMPLETED" "ASSESSMENT_RUN_COMPLETED", "ASSESSMENT_RUN_STARTED" "ASSESSMENT_RUN_STARTED", :other "OTHER", :assessment-run-started "ASSESSMENT_RUN_STARTED", "ASSESSMENT_RUN_STATE_CHANGED" "ASSESSMENT_RUN_STATE_CHANGED", :finding-reported "FINDING_REPORTED", "OTHER" "OTHER", :assessment-run-completed "ASSESSMENT_RUN_COMPLETED", :assessment-run-state-changed "ASSESSMENT_RUN_STATE_CHANGED"} input), :shape "InspectorEvent"})

(clojure.core/defn- ser-user-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute coll) #:http.request.field{:shape "Attribute"}))) input), :shape "UserAttributeList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-assessment-template-rules-package-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn coll) #:http.request.field{:shape "Arn"}))) input), :shape "AssessmentTemplateRulesPackageArnList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-agent-health [input] #:http.request.field{:value (clojure.core/get {"HEALTHY" "HEALTHY", :healthy "HEALTHY", "UNHEALTHY" "UNHEALTHY", :unhealthy "UNHEALTHY", "UNKNOWN" "UNKNOWN", :unknown "UNKNOWN"} input), :shape "AgentHealth"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-assessment-template-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AssessmentTemplateFilter", :type "structure"} (clojure.core/contains? input :name-pattern) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-pattern (input :name-pattern)) #:http.request.field{:name "namePattern", :shape "NamePattern"})) (clojure.core/contains? input :duration-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-range (input :duration-range)) #:http.request.field{:name "durationRange", :shape "DurationRange"})) (clojure.core/contains? input :rules-package-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-rules-package-arn-list (input :rules-package-arns)) #:http.request.field{:name "rulesPackageArns", :shape "FilterRulesPackageArnList"}))))

(clojure.core/defn- ser-batch-describe-exclusions-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn coll) #:http.request.field{:shape "Arn"}))) input), :shape "BatchDescribeExclusionsArnList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-auto-scaling-group-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-auto-scaling-group coll) #:http.request.field{:shape "AutoScalingGroup"}))) input), :shape "AutoScalingGroupList", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-agent-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-agent-id coll) #:http.request.field{:shape "AgentId"}))) input), :shape "AgentIdList", :type "list", :max 500, :min 0})

(clojure.core/defn- ser-assessment-target-name [input] #:http.request.field{:value input, :shape "AssessmentTargetName"})

(clojure.core/defn- ser-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-attribute-key (:key input)) #:http.request.field{:name "key", :shape "AttributeKey"})], :shape "Attribute", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :value)) #:http.request.field{:name "value", :shape "AttributeValue"}))))

(clojure.core/defn- ser-preview-agents-max-results [input] #:http.request.field{:value input, :shape "PreviewAgentsMaxResults"})

(clojure.core/defn- ser-assessment-run-duration [input] #:http.request.field{:value input, :shape "AssessmentRunDuration"})

(clojure.core/defn- ser-add-remove-attributes-finding-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn coll) #:http.request.field{:shape "Arn"}))) input), :shape "AddRemoveAttributesFindingArnList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-agent-health-code-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-agent-health-code coll) #:http.request.field{:shape "AgentHealthCode"}))) input), :shape "AgentHealthCodeList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-assessment-run-name [input] #:http.request.field{:value input, :shape "AssessmentRunName"})

(clojure.core/defn- ser-filter-rules-package-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn coll) #:http.request.field{:shape "Arn"}))) input), :shape "FilterRulesPackageArnList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-resource-group-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-group-tag coll) #:http.request.field{:shape "ResourceGroupTag"}))) input), :shape "ResourceGroupTags", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-agent-id [input] #:http.request.field{:value input, :shape "AgentId"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-assessment-target-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AssessmentTargetFilter", :type "structure"} (clojure.core/contains? input :assessment-target-name-pattern) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-pattern (input :assessment-target-name-pattern)) #:http.request.field{:name "assessmentTargetNamePattern", :shape "NamePattern"}))))

(clojure.core/defn- ser-assessment-run-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AssessmentRunFilter", :type "structure"} (clojure.core/contains? input :name-pattern) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-pattern (input :name-pattern)) #:http.request.field{:name "namePattern", :shape "NamePattern"})) (clojure.core/contains? input :states) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assessment-run-state-list (input :states)) #:http.request.field{:name "states", :shape "AssessmentRunStateList"})) (clojure.core/contains? input :duration-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-range (input :duration-range)) #:http.request.field{:name "durationRange", :shape "DurationRange"})) (clojure.core/contains? input :rules-package-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-rules-package-arn-list (input :rules-package-arns)) #:http.request.field{:name "rulesPackageArns", :shape "FilterRulesPackageArnList"})) (clojure.core/contains? input :start-time-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-range (input :start-time-range)) #:http.request.field{:name "startTimeRange", :shape "TimestampRange"})) (clojure.core/contains? input :completion-time-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-range (input :completion-time-range)) #:http.request.field{:name "completionTimeRange", :shape "TimestampRange"})) (clojure.core/contains? input :state-change-time-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-range (input :state-change-time-range)) #:http.request.field{:name "stateChangeTimeRange", :shape "TimestampRange"}))))

(clojure.core/defn- ser-attribute-key [input] #:http.request.field{:value input, :shape "AttributeKey"})

(clojure.core/defn- ser-timestamp-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimestampRange", :type "structure"} (clojure.core/contains? input :begin-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :begin-date)) #:http.request.field{:name "beginDate", :shape "Timestamp"})) (clojure.core/contains? input :end-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end-date)) #:http.request.field{:name "endDate", :shape "Timestamp"}))))

(clojure.core/defn- ser-auto-scaling-group [input] #:http.request.field{:value input, :shape "AutoScalingGroup"})

(clojure.core/defn- ser-batch-describe-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn coll) #:http.request.field{:shape "Arn"}))) input), :shape "BatchDescribeArnList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-report-file-format [input] #:http.request.field{:value (clojure.core/get {"HTML" "HTML", :html "HTML", "PDF" "PDF", :pdf "PDF"} input), :shape "ReportFileFormat"})

(clojure.core/defn- ser-list-event-subscriptions-max-results [input] #:http.request.field{:value input, :shape "ListEventSubscriptionsMaxResults"})

(clojure.core/defn- ser-report-type [input] #:http.request.field{:value (clojure.core/get {"FINDING" "FINDING", :finding "FINDING", "FULL" "FULL", :full "FULL"} input), :shape "ReportType"})

(clojure.core/defn- ser-severity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-severity coll) #:http.request.field{:shape "Severity"}))) input), :shape "SeverityList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-user-attribute-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-key coll) #:http.request.field{:shape "AttributeKey"}))) input), :shape "UserAttributeKeyList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-duration-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DurationRange", :type "structure"} (clojure.core/contains? input :min-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assessment-run-duration (input :min-seconds)) #:http.request.field{:name "minSeconds", :shape "AssessmentRunDuration"})) (clojure.core/contains? input :max-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assessment-run-duration (input :max-seconds)) #:http.request.field{:name "maxSeconds", :shape "AssessmentRunDuration"}))))

(clojure.core/defn- ser-agent-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-agent-health-list (:agent-healths input)) #:http.request.field{:name "agentHealths", :shape "AgentHealthList"}) (clojure.core/into (ser-agent-health-code-list (:agent-health-codes input)) #:http.request.field{:name "agentHealthCodes", :shape "AgentHealthCodeList"})], :shape "AgentFilter", :type "structure"}))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-list-parent-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn coll) #:http.request.field{:shape "Arn"}))) input), :shape "ListParentArnList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "value", :shape "TagValue"}))))

(clojure.core/defn- ser-list-max-results [input] #:http.request.field{:value input, :shape "ListMaxResults"})

(clojure.core/defn- ser-agent-health-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-agent-health coll) #:http.request.field{:shape "AgentHealth"}))) input), :shape "AgentHealthList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-stop-action [input] #:http.request.field{:value (clojure.core/get {"START_EVALUATION" "START_EVALUATION", :start-evaluation "START_EVALUATION", "SKIP_EVALUATION" "SKIP_EVALUATION", :skip-evaluation "SKIP_EVALUATION"} input), :shape "StopAction"})

(clojure.core/defn- ser-finding-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FindingFilter", :type "structure"} (clojure.core/contains? input :agent-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-agent-id-list (input :agent-ids)) #:http.request.field{:name "agentIds", :shape "AgentIdList"})) (clojure.core/contains? input :auto-scaling-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-list (input :auto-scaling-groups)) #:http.request.field{:name "autoScalingGroups", :shape "AutoScalingGroupList"})) (clojure.core/contains? input :rule-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-name-list (input :rule-names)) #:http.request.field{:name "ruleNames", :shape "RuleNameList"})) (clojure.core/contains? input :severities) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-severity-list (input :severities)) #:http.request.field{:name "severities", :shape "SeverityList"})) (clojure.core/contains? input :rules-package-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-rules-package-arn-list (input :rules-package-arns)) #:http.request.field{:name "rulesPackageArns", :shape "FilterRulesPackageArnList"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-list (input :attributes)) #:http.request.field{:name "attributes", :shape "AttributeList"})) (clojure.core/contains? input :user-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-list (input :user-attributes)) #:http.request.field{:name "userAttributes", :shape "AttributeList"})) (clojure.core/contains? input :creation-time-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-range (input :creation-time-range)) #:http.request.field{:name "creationTimeRange", :shape "TimestampRange"}))))

(clojure.core/defn- ser-resource-group-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "key", :shape "TagKey"})], :shape "ResourceGroupTag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "value", :shape "TagValue"}))))

(clojure.core/defn- ser-assessment-template-name [input] #:http.request.field{:value input, :shape "AssessmentTemplateName"})

(clojure.core/defn- ser-agent-health-code [input] #:http.request.field{:value (clojure.core/get {"IDLE" "IDLE", "UNKNOWN" "UNKNOWN", :idle "IDLE", :unknown "UNKNOWN", :unhealthy "UNHEALTHY", :running "RUNNING", "SHUTDOWN" "SHUTDOWN", :throttled "THROTTLED", "THROTTLED" "THROTTLED", "RUNNING" "RUNNING", :shutdown "SHUTDOWN", "UNHEALTHY" "UNHEALTHY"} input), :shape "AgentHealthCode"})

(clojure.core/defn- ser-uuid [input] #:http.request.field{:value input, :shape "UUID"})

(clojure.core/defn- ser-name-pattern [input] #:http.request.field{:value input, :shape "NamePattern"})

(clojure.core/defn- req-delete-assessment-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-target-arn)) #:http.request.field{:name "assessmentTargetArn", :shape "Arn"})]}))

(clojure.core/defn- req-update-assessment-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-target-arn)) #:http.request.field{:name "assessmentTargetArn", :shape "Arn"}) (clojure.core/into (ser-assessment-target-name (input :assessment-target-name)) #:http.request.field{:name "assessmentTargetName", :shape "AssessmentTargetName"})]} (clojure.core/contains? input :resource-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :resource-group-arn)) #:http.request.field{:name "resourceGroupArn", :shape "Arn"}))))

(clojure.core/defn- req-describe-rules-packages-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-describe-arn-list (input :rules-package-arns)) #:http.request.field{:name "rulesPackageArns", :shape "BatchDescribeArnList"})]} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale"}))))

(clojure.core/defn- req-get-assessment-report-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-run-arn)) #:http.request.field{:name "assessmentRunArn", :shape "Arn"}) (clojure.core/into (ser-report-file-format (input :report-file-format)) #:http.request.field{:name "reportFileFormat", :shape "ReportFileFormat"}) (clojure.core/into (ser-report-type (input :report-type)) #:http.request.field{:name "reportType", :shape "ReportType"})]}))

(clojure.core/defn- req-get-telemetry-metadata-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-run-arn)) #:http.request.field{:name "assessmentRunArn", :shape "Arn"})]}))

(clojure.core/defn- req-describe-assessment-templates-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-describe-arn-list (input :assessment-template-arns)) #:http.request.field{:name "assessmentTemplateArns", :shape "BatchDescribeArnList"})]}))

(clojure.core/defn- req-list-exclusions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-run-arn)) #:http.request.field{:name "assessmentRunArn", :shape "Arn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListMaxResults"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"})]}))

(clojure.core/defn- req-list-assessment-run-agents-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-run-arn)) #:http.request.field{:name "assessmentRunArn", :shape "Arn"})]} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-agent-filter (input :filter)) #:http.request.field{:name "filter", :shape "AgentFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListMaxResults"}))))

(clojure.core/defn- req-list-assessment-templates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :assessment-target-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-parent-arn-list (input :assessment-target-arns)) #:http.request.field{:name "assessmentTargetArns", :shape "ListParentArnList"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assessment-template-filter (input :filter)) #:http.request.field{:name "filter", :shape "AssessmentTemplateFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListMaxResults"}))))

(clojure.core/defn- req-stop-assessment-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-run-arn)) #:http.request.field{:name "assessmentRunArn", :shape "Arn"})]} (clojure.core/contains? input :stop-action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stop-action (input :stop-action)) #:http.request.field{:name "stopAction", :shape "StopAction"}))))

(clojure.core/defn- req-start-assessment-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-template-arn)) #:http.request.field{:name "assessmentTemplateArn", :shape "Arn"})]} (clojure.core/contains? input :assessment-run-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assessment-run-name (input :assessment-run-name)) #:http.request.field{:name "assessmentRunName", :shape "AssessmentRunName"}))))

(clojure.core/defn- req-list-findings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :assessment-run-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-parent-arn-list (input :assessment-run-arns)) #:http.request.field{:name "assessmentRunArns", :shape "ListParentArnList"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-finding-filter (input :filter)) #:http.request.field{:name "filter", :shape "FindingFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListMaxResults"}))))

(clojure.core/defn- req-list-assessment-runs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :assessment-template-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-parent-arn-list (input :assessment-template-arns)) #:http.request.field{:name "assessmentTemplateArns", :shape "ListParentArnList"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assessment-run-filter (input :filter)) #:http.request.field{:name "filter", :shape "AssessmentRunFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListMaxResults"}))))

(clojure.core/defn- req-add-attributes-to-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-add-remove-attributes-finding-arn-list (input :finding-arns)) #:http.request.field{:name "findingArns", :shape "AddRemoveAttributesFindingArnList"}) (clojure.core/into (ser-user-attribute-list (input :attributes)) #:http.request.field{:name "attributes", :shape "UserAttributeList"})]}))

(clojure.core/defn- req-describe-resource-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-describe-arn-list (input :resource-group-arns)) #:http.request.field{:name "resourceGroupArns", :shape "BatchDescribeArnList"})]}))

(clojure.core/defn- req-list-rules-packages-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListMaxResults"}))))

(clojure.core/defn- req-list-assessment-targets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assessment-target-filter (input :filter)) #:http.request.field{:name "filter", :shape "AssessmentTargetFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListMaxResults"}))))

(clojure.core/defn- req-remove-attributes-from-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-add-remove-attributes-finding-arn-list (input :finding-arns)) #:http.request.field{:name "findingArns", :shape "AddRemoveAttributesFindingArnList"}) (clojure.core/into (ser-user-attribute-key-list (input :attribute-keys)) #:http.request.field{:name "attributeKeys", :shape "UserAttributeKeyList"})]}))

(clojure.core/defn- req-create-assessment-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-target-arn)) #:http.request.field{:name "assessmentTargetArn", :shape "Arn"}) (clojure.core/into (ser-assessment-template-name (input :assessment-template-name)) #:http.request.field{:name "assessmentTemplateName", :shape "AssessmentTemplateName"}) (clojure.core/into (ser-assessment-run-duration (input :duration-in-seconds)) #:http.request.field{:name "durationInSeconds", :shape "AssessmentRunDuration"}) (clojure.core/into (ser-assessment-template-rules-package-arn-list (input :rules-package-arns)) #:http.request.field{:name "rulesPackageArns", :shape "AssessmentTemplateRulesPackageArnList"})]} (clojure.core/contains? input :user-attributes-for-findings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-attribute-list (input :user-attributes-for-findings)) #:http.request.field{:name "userAttributesForFindings", :shape "UserAttributeList"}))))

(clojure.core/defn- req-describe-assessment-runs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-describe-arn-list (input :assessment-run-arns)) #:http.request.field{:name "assessmentRunArns", :shape "BatchDescribeArnList"})]}))

(clojure.core/defn- req-list-event-subscriptions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-event-subscriptions-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListEventSubscriptionsMaxResults"}))))

(clojure.core/defn- req-get-exclusions-preview-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-template-arn)) #:http.request.field{:name "assessmentTemplateArn", :shape "Arn"}) (clojure.core/into (ser-uuid (input :preview-token)) #:http.request.field{:name "previewToken", :shape "UUID"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListMaxResults"})) (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale"}))))

(clojure.core/defn- req-describe-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-describe-arn-list (input :finding-arns)) #:http.request.field{:name "findingArns", :shape "BatchDescribeArnList"})]} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale"}))))

(clojure.core/defn- req-preview-agents-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :preview-agents-arn)) #:http.request.field{:name "previewAgentsArn", :shape "Arn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-preview-agents-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "PreviewAgentsMaxResults"}))))

(clojure.core/defn- req-unsubscribe-from-event-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"}) (clojure.core/into (ser-inspector-event (input :event)) #:http.request.field{:name "event", :shape "InspectorEvent"}) (clojure.core/into (ser-arn (input :topic-arn)) #:http.request.field{:name "topicArn", :shape "Arn"})]}))

(clojure.core/defn- req-subscribe-to-event-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"}) (clojure.core/into (ser-inspector-event (input :event)) #:http.request.field{:name "event", :shape "InspectorEvent"}) (clojure.core/into (ser-arn (input :topic-arn)) #:http.request.field{:name "topicArn", :shape "Arn"})]}))

(clojure.core/defn- req-register-cross-account-access-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "Arn"})]}))

(clojure.core/defn- req-describe-assessment-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-describe-arn-list (input :assessment-target-arns)) #:http.request.field{:name "assessmentTargetArns", :shape "BatchDescribeArnList"})]}))

(clojure.core/defn- req-create-exclusions-preview-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-template-arn)) #:http.request.field{:name "assessmentTemplateArn", :shape "Arn"})]}))

(clojure.core/defn- req-set-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-delete-assessment-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-run-arn)) #:http.request.field{:name "assessmentRunArn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-assessment-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :assessment-template-arn)) #:http.request.field{:name "assessmentTemplateArn", :shape "Arn"})]}))

(clojure.core/defn- req-describe-exclusions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-batch-describe-exclusions-arn-list (input :exclusion-arns)) #:http.request.field{:name "exclusionArns", :shape "BatchDescribeExclusionsArnList"})]} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale"}))))

(clojure.core/defn- req-create-assessment-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-assessment-target-name (input :assessment-target-name)) #:http.request.field{:name "assessmentTargetName", :shape "AssessmentTargetName"})]} (clojure.core/contains? input :resource-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :resource-group-arn)) #:http.request.field{:name "resourceGroupArn", :shape "Arn"}))))

(clojure.core/defn- req-create-resource-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-group-tags (input :resource-group-tags)) #:http.request.field{:name "resourceGroupTags", :shape "ResourceGroupTags"})]}))

(clojure.spec.alpha/def :portkey.aws.inspector.delete-assessment-target-request/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/delete-assessment-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.delete-assessment-target-request/assessment-target-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.add-attributes-to-findings-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/add-attributes-to-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.add-attributes-to-findings-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/failed-item-error-code #{:limit-exceeded :duplicate-arn "LIMIT_EXCEEDED" :invalid-arn :internal-error "ITEM_DOES_NOT_EXIST" "DUPLICATE_ARN" "ACCESS_DENIED" "INTERNAL_ERROR" "INVALID_ARN" :access-denied :item-does-not-exist})

(clojure.spec.alpha/def :portkey.aws.inspector/severity #{"Undefined" "Medium" :medium :high "High" :undefined :low "Low" :informational "Informational"})

(clojure.spec.alpha/def :portkey.aws.inspector.update-assessment-target-request/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.update-assessment-target-request/assessment-target-name (clojure.spec.alpha/and :portkey.aws.inspector/assessment-target-name))
(clojure.spec.alpha/def :portkey.aws.inspector.update-assessment-target-request/resource-group-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/update-assessment-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.update-assessment-target-request/assessment-target-arn :portkey.aws.inspector.update-assessment-target-request/assessment-target-name] :opt-un [:portkey.aws.inspector.update-assessment-target-request/resource-group-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector.finding/asset-type (clojure.spec.alpha/and :portkey.aws.inspector/asset-type))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/confidence (clojure.spec.alpha/and :portkey.aws.inspector/ioc-confidence))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/updated-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/service-attributes (clojure.spec.alpha/and :portkey.aws.inspector/inspector-service-attributes))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/created-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/indicator-of-compromise (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/id (clojure.spec.alpha/and :portkey.aws.inspector/finding-id))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/user-attributes (clojure.spec.alpha/and :portkey.aws.inspector/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/recommendation (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/attributes (clojure.spec.alpha/and :portkey.aws.inspector/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/title (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/schema-version (clojure.spec.alpha/and :portkey.aws.inspector/numeric-version))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/service (clojure.spec.alpha/and :portkey.aws.inspector/service-name))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/severity (clojure.spec.alpha/and :portkey.aws.inspector/severity))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/asset-attributes (clojure.spec.alpha/and :portkey.aws.inspector/asset-attributes))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/description (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.finding/numeric-severity (clojure.spec.alpha/and :portkey.aws.inspector/numeric-severity))
(clojure.spec.alpha/def :portkey.aws.inspector/finding (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.finding/arn :portkey.aws.inspector.finding/attributes :portkey.aws.inspector.finding/user-attributes :portkey.aws.inspector.finding/created-at :portkey.aws.inspector.finding/updated-at] :opt-un [:portkey.aws.inspector.finding/asset-type :portkey.aws.inspector.finding/confidence :portkey.aws.inspector.finding/service-attributes :portkey.aws.inspector.finding/indicator-of-compromise :portkey.aws.inspector.finding/id :portkey.aws.inspector.finding/recommendation :portkey.aws.inspector.finding/title :portkey.aws.inspector.finding/schema-version :portkey.aws.inspector.finding/service :portkey.aws.inspector.finding/severity :portkey.aws.inspector.finding/asset-attributes :portkey.aws.inspector.finding/description :portkey.aws.inspector.finding/numeric-severity]))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-state-change-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/assessment-run-state-change :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector/rule-name-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/rule-name :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.get-assessment-report-response/status (clojure.spec.alpha/and :portkey.aws.inspector/report-status))
(clojure.spec.alpha/def :portkey.aws.inspector.get-assessment-report-response/url (clojure.spec.alpha/and :portkey.aws.inspector/url))
(clojure.spec.alpha/def :portkey.aws.inspector/get-assessment-report-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.get-assessment-report-response/status] :opt-un [:portkey.aws.inspector.get-assessment-report-response/url]))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-state-change/state-changed-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-state-change/state (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-state))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-state-change (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.assessment-run-state-change/state-changed-at :portkey.aws.inspector.assessment-run-state-change/state] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-resource-groups-response/resource-groups (clojure.spec.alpha/and :portkey.aws.inspector/resource-group-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-resource-groups-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-resource-groups-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-resource-groups-response/resource-groups :portkey.aws.inspector.describe-resource-groups-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/attribute-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/attribute :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector/event-subscription-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/event-subscription :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-rules-packages-request/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-rules-packages-request/locale (clojure.spec.alpha/and :portkey.aws.inspector/locale))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-rules-packages-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-rules-packages-request/rules-package-arns] :opt-un [:portkey.aws.inspector.describe-rules-packages-request/locale]))

(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-run-agents-response/assessment-run-agents (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-agent-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-run-agents-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/list-assessment-run-agents-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-assessment-run-agents-response/assessment-run-agents] :opt-un [:portkey.aws.inspector.list-assessment-run-agents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-state #{"COMPLETED" "CANCELED" :stop-data-collection-pending :start-evaluating-rules-pending :completed "COMPLETED_WITH_ERRORS" :created "START_DATA_COLLECTION_PENDING" :start-data-collection-pending "ERROR" :start-data-collection-in-progress "START_DATA_COLLECTION_IN_PROGRESS" "EVALUATING_RULES" :collecting-data "DATA_COLLECTED" :data-collected :canceled "STOP_DATA_COLLECTION_PENDING" "FAILED" :error "START_EVALUATING_RULES_PENDING" :completed-with-errors "COLLECTING_DATA" :evaluating-rules :failed "CREATED"})

(clojure.spec.alpha/def :portkey.aws.inspector.create-exclusions-preview-response/preview-token (clojure.spec.alpha/and :portkey.aws.inspector/uuid))
(clojure.spec.alpha/def :portkey.aws.inspector/create-exclusions-preview-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.create-exclusions-preview-response/preview-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-finding-counts (clojure.spec.alpha/map-of :portkey.aws.inspector/severity :portkey.aws.inspector/finding-count))

(clojure.spec.alpha/def :portkey.aws.inspector/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.get-assessment-report-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.get-assessment-report-request/report-file-format (clojure.spec.alpha/and :portkey.aws.inspector/report-file-format))
(clojure.spec.alpha/def :portkey.aws.inspector.get-assessment-report-request/report-type (clojure.spec.alpha/and :portkey.aws.inspector/report-type))
(clojure.spec.alpha/def :portkey.aws.inspector/get-assessment-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.get-assessment-report-request/assessment-run-arn :portkey.aws.inspector.get-assessment-report-request/report-file-format :portkey.aws.inspector.get-assessment-report-request/report-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.inspector/tag-list))
(clojure.spec.alpha/def :portkey.aws.inspector/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-tags-for-resource-response/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/locale #{"EN_US" :en-us})

(clojure.spec.alpha/def :portkey.aws.inspector.get-telemetry-metadata-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/get-telemetry-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.get-telemetry-metadata-request/assessment-run-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-templates-request/assessment-template-arns (clojure.spec.alpha/and :portkey.aws.inspector/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-assessment-templates-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-assessment-templates-request/assessment-template-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-exclusions-response/exclusions (clojure.spec.alpha/and :portkey.aws.inspector/exclusion-map))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-exclusions-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-exclusions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-exclusions-response/exclusions :portkey.aws.inspector.describe-exclusions-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.invalid-cross-account-role-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.invalid-cross-account-role-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector/invalid-cross-account-role-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.invalid-cross-account-role-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/invalid-cross-account-role-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.invalid-cross-account-role-exception/message :portkey.aws.inspector.invalid-cross-account-role-exception/error-code :portkey.aws.inspector.invalid-cross-account-role-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-state-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/assessment-run-state :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector/inspector-event #{"FINDING_REPORTED" "ASSESSMENT_RUN_COMPLETED" "ASSESSMENT_RUN_STARTED" :other :assessment-run-started "ASSESSMENT_RUN_STATE_CHANGED" :finding-reported "OTHER" :assessment-run-completed :assessment-run-state-changed})

(clojure.spec.alpha/def :portkey.aws.inspector/asset-type #{"ec2-instance" :ec-2instance})

(clojure.spec.alpha/def :portkey.aws.inspector.list-exclusions-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.list-exclusions-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.list-exclusions-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/list-exclusions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-exclusions-request/assessment-run-arn] :opt-un [:portkey.aws.inspector.list-exclusions-request/next-token :portkey.aws.inspector.list-exclusions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector/rules-package-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.no-such-entity-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.no-such-entity-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector/no-such-entity-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.no-such-entity-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/no-such-entity-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.no-such-entity-exception/message :portkey.aws.inspector.no-such-entity-exception/error-code :portkey.aws.inspector.no-such-entity-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/user-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/attribute :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector/numeric-severity clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.inspector.event-subscription/event (clojure.spec.alpha/and :portkey.aws.inspector/inspector-event))
(clojure.spec.alpha/def :portkey.aws.inspector.event-subscription/subscribed-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector/event-subscription (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.event-subscription/event :portkey.aws.inspector.event-subscription/subscribed-at] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-template-rules-package-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-run-agents-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-run-agents-request/filter (clojure.spec.alpha/and :portkey.aws.inspector/agent-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-run-agents-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-run-agents-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/list-assessment-run-agents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-assessment-run-agents-request/assessment-run-arn] :opt-un [:portkey.aws.inspector.list-assessment-run-agents-request/filter :portkey.aws.inspector.list-assessment-run-agents-request/next-token :portkey.aws.inspector.list-assessment-run-agents-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-templates-request/assessment-target-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-parent-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-templates-request/filter (clojure.spec.alpha/and :portkey.aws.inspector/assessment-template-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-templates-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-templates-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/list-assessment-templates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.list-assessment-templates-request/assessment-target-arns :portkey.aws.inspector.list-assessment-templates-request/filter :portkey.aws.inspector.list-assessment-templates-request/next-token :portkey.aws.inspector.list-assessment-templates-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.get-exclusions-preview-response/preview-status (clojure.spec.alpha/and :portkey.aws.inspector/preview-status))
(clojure.spec.alpha/def :portkey.aws.inspector.get-exclusions-preview-response/exclusion-previews (clojure.spec.alpha/and :portkey.aws.inspector/exclusion-preview-list))
(clojure.spec.alpha/def :portkey.aws.inspector.get-exclusions-preview-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/get-exclusions-preview-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.get-exclusions-preview-response/preview-status] :opt-un [:portkey.aws.inspector.get-exclusions-preview-response/exclusion-previews :portkey.aws.inspector.get-exclusions-preview-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.exclusion-preview/title (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion-preview/description (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion-preview/recommendation (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion-preview/scopes (clojure.spec.alpha/and :portkey.aws.inspector/scope-list))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion-preview/attributes (clojure.spec.alpha/and :portkey.aws.inspector/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector/exclusion-preview (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.exclusion-preview/title :portkey.aws.inspector.exclusion-preview/description :portkey.aws.inspector.exclusion-preview/recommendation :portkey.aws.inspector.exclusion-preview/scopes] :opt-un [:portkey.aws.inspector.exclusion-preview/attributes]))

(clojure.spec.alpha/def :portkey.aws.inspector/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/last-assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector/assessment-template-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/created-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/user-attributes-for-findings (clojure.spec.alpha/and :portkey.aws.inspector/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/name (clojure.spec.alpha/and :portkey.aws.inspector/assessment-template-name))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template/assessment-run-count (clojure.spec.alpha/and :portkey.aws.inspector/arn-count))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-template (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.assessment-template/arn :portkey.aws.inspector.assessment-template/name :portkey.aws.inspector.assessment-template/assessment-target-arn :portkey.aws.inspector.assessment-template/duration-in-seconds :portkey.aws.inspector.assessment-template/rules-package-arns :portkey.aws.inspector.assessment-template/user-attributes-for-findings :portkey.aws.inspector.assessment-template/assessment-run-count :portkey.aws.inspector.assessment-template/created-at] :opt-un [:portkey.aws.inspector.assessment-template/last-assessment-run-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector/agent-health #{"UNKNOWN" :unknown :unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.inspector/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 300))))

(clojure.spec.alpha/def :portkey.aws.inspector.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.limit-exceeded-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector/limit-exceeded-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.limit-exceeded-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.limit-exceeded-exception/message :portkey.aws.inspector.limit-exceeded-exception/error-code :portkey.aws.inspector.limit-exceeded-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template-filter/name-pattern (clojure.spec.alpha/and :portkey.aws.inspector/name-pattern))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template-filter/duration-range (clojure.spec.alpha/and :portkey.aws.inspector/duration-range))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-template-filter/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector/filter-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-template-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.assessment-template-filter/name-pattern :portkey.aws.inspector.assessment-template-filter/duration-range :portkey.aws.inspector.assessment-template-filter/rules-package-arns]))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-targets-response/assessment-targets (clojure.spec.alpha/and :portkey.aws.inspector/assessment-target-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-targets-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-assessment-targets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-assessment-targets-response/assessment-targets :portkey.aws.inspector.describe-assessment-targets-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.exclusion/arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion/title (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion/description (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion/recommendation (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion/scopes (clojure.spec.alpha/and :portkey.aws.inspector/scope-list))
(clojure.spec.alpha/def :portkey.aws.inspector.exclusion/attributes (clojure.spec.alpha/and :portkey.aws.inspector/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector/exclusion (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.exclusion/arn :portkey.aws.inspector.exclusion/title :portkey.aws.inspector.exclusion/description :portkey.aws.inspector.exclusion/recommendation :portkey.aws.inspector.exclusion/scopes] :opt-un [:portkey.aws.inspector.exclusion/attributes]))

(clojure.spec.alpha/def :portkey.aws.inspector/agent-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector/batch-describe-exclusions-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector.stop-assessment-run-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.stop-assessment-run-request/stop-action (clojure.spec.alpha/and :portkey.aws.inspector/stop-action))
(clojure.spec.alpha/def :portkey.aws.inspector/stop-assessment-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.stop-assessment-run-request/assessment-run-arn] :opt-un [:portkey.aws.inspector.stop-assessment-run-request/stop-action]))

(clojure.spec.alpha/def :portkey.aws.inspector/ipv-4-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 7 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.inspector/auto-scaling-group-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/auto-scaling-group :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.inspector/resource-group-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/resource-group :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.start-assessment-run-request/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.start-assessment-run-request/assessment-run-name (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-name))
(clojure.spec.alpha/def :portkey.aws.inspector/start-assessment-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.start-assessment-run-request/assessment-template-arn] :opt-un [:portkey.aws.inspector.start-assessment-run-request/assessment-run-name]))

(clojure.spec.alpha/def :portkey.aws.inspector/ioc-confidence (clojure.spec.alpha/int-in 0 10))

(clojure.spec.alpha/def :portkey.aws.inspector/agent-id-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/agent-id :min-count 0 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.inspector.unsupported-feature-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.unsupported-feature-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/unsupported-feature-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.unsupported-feature-exception/message :portkey.aws.inspector.unsupported-feature-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.telemetry-metadata/message-type (clojure.spec.alpha/and :portkey.aws.inspector/message-type))
(clojure.spec.alpha/def :portkey.aws.inspector.telemetry-metadata/count (clojure.spec.alpha/and :portkey.aws.inspector/long))
(clojure.spec.alpha/def :portkey.aws.inspector.telemetry-metadata/data-size (clojure.spec.alpha/and :portkey.aws.inspector/long))
(clojure.spec.alpha/def :portkey.aws.inspector/telemetry-metadata (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.telemetry-metadata/message-type :portkey.aws.inspector.telemetry-metadata/count] :opt-un [:portkey.aws.inspector.telemetry-metadata/data-size]))

(clojure.spec.alpha/def :portkey.aws.inspector/preview-status #{"COMPLETED" :work-in-progress :completed "WORK_IN_PROGRESS"})

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/assessment-run :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-target-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.inspector/scope-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/scope :min-count 1))

(clojure.spec.alpha/def :portkey.aws.inspector/hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector/agent-already-running-assessment-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/agent-already-running-assessment :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.start-assessment-run-response/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/start-assessment-run-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.start-assessment-run-response/assessment-run-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.attribute/key (clojure.spec.alpha/and :portkey.aws.inspector/attribute-key))
(clojure.spec.alpha/def :portkey.aws.inspector.attribute/value (clojure.spec.alpha/and :portkey.aws.inspector/attribute-value))
(clojure.spec.alpha/def :portkey.aws.inspector/attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.attribute/key] :opt-un [:portkey.aws.inspector.attribute/value]))

(clojure.spec.alpha/def :portkey.aws.inspector/preview-agents-max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-duration (clojure.spec.alpha/int-in 180 86400))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-notification-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/assessment-run-notification :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.list-findings-request/assessment-run-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-parent-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-findings-request/filter (clojure.spec.alpha/and :portkey.aws.inspector/finding-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.list-findings-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.list-findings-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/list-findings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.list-findings-request/assessment-run-arns :portkey.aws.inspector.list-findings-request/filter :portkey.aws.inspector.list-findings-request/next-token :portkey.aws.inspector.list-findings-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-rules-packages-response/rules-packages (clojure.spec.alpha/and :portkey.aws.inspector/rules-package-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-rules-packages-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-rules-packages-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-rules-packages-response/rules-packages :portkey.aws.inspector.describe-rules-packages-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/add-remove-attributes-finding-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-templates-response/assessment-templates (clojure.spec.alpha/and :portkey.aws.inspector/assessment-template-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-templates-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-assessment-templates-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-assessment-templates-response/assessment-templates :portkey.aws.inspector.describe-assessment-templates-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/finding-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/finding :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-target/arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-target/name (clojure.spec.alpha/and :portkey.aws.inspector/assessment-target-name))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-target/resource-group-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-target/created-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-target/updated-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-target (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.assessment-target/arn :portkey.aws.inspector.assessment-target/name :portkey.aws.inspector.assessment-target/created-at :portkey.aws.inspector.assessment-target/updated-at] :opt-un [:portkey.aws.inspector.assessment-target/resource-group-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector/agent-health-code-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/agent-health-code :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector/finding-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector/tag-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/tag :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-runs-request/assessment-template-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-parent-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-runs-request/filter (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-runs-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-runs-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/list-assessment-runs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.list-assessment-runs-request/assessment-template-arns :portkey.aws.inspector.list-assessment-runs-request/filter :portkey.aws.inspector.list-assessment-runs-request/next-token :portkey.aws.inspector.list-assessment-runs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.inspector.add-attributes-to-findings-request/finding-arns (clojure.spec.alpha/and :portkey.aws.inspector/add-remove-attributes-finding-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.add-attributes-to-findings-request/attributes (clojure.spec.alpha/and :portkey.aws.inspector/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector/add-attributes-to-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.add-attributes-to-findings-request/finding-arns :portkey.aws.inspector.add-attributes-to-findings-request/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/filter-rules-package-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-resource-groups-request/resource-group-arns (clojure.spec.alpha/and :portkey.aws.inspector/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-resource-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-resource-groups-request/resource-group-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector/resource-group-tags (clojure.spec.alpha/coll-of :portkey.aws.inspector/resource-group-tag :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.list-rules-packages-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.list-rules-packages-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/list-rules-packages-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.list-rules-packages-request/next-token :portkey.aws.inspector.list-rules-packages-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector/limit-exceeded-error-code #{"EVENT_SUBSCRIPTION_LIMIT_EXCEEDED" "ASSESSMENT_TEMPLATE_LIMIT_EXCEEDED" :event-subscription-limit-exceeded :assessment-run-limit-exceeded :resource-group-limit-exceeded :assessment-target-limit-exceeded :assessment-template-limit-exceeded "RESOURCE_GROUP_LIMIT_EXCEEDED" "ASSESSMENT_TARGET_LIMIT_EXCEEDED" "ASSESSMENT_RUN_LIMIT_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.inspector/agent-preview-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/agent-preview :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector/agent-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector/ami-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector.list-exclusions-response/exclusion-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-exclusions-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/list-exclusions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-exclusions-response/exclusion-arns] :opt-un [:portkey.aws.inspector.list-exclusions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-rules-package-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector/rules-package-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/rules-package :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector/subscription-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/subscription :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector/url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.inspector/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-targets-request/filter (clojure.spec.alpha/and :portkey.aws.inspector/assessment-target-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-targets-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-targets-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/list-assessment-targets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.list-assessment-targets-request/filter :portkey.aws.inspector.list-assessment-targets-request/next-token :portkey.aws.inspector.list-assessment-targets-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.remove-attributes-from-findings-request/finding-arns (clojure.spec.alpha/and :portkey.aws.inspector/add-remove-attributes-finding-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.remove-attributes-from-findings-request/attribute-keys (clojure.spec.alpha/and :portkey.aws.inspector/user-attribute-key-list))
(clojure.spec.alpha/def :portkey.aws.inspector/remove-attributes-from-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.remove-attributes-from-findings-request/finding-arns :portkey.aws.inspector.remove-attributes-from-findings-request/attribute-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.asset-attributes/schema-version (clojure.spec.alpha/and :portkey.aws.inspector/numeric-version))
(clojure.spec.alpha/def :portkey.aws.inspector.asset-attributes/agent-id (clojure.spec.alpha/and :portkey.aws.inspector/agent-id))
(clojure.spec.alpha/def :portkey.aws.inspector.asset-attributes/auto-scaling-group (clojure.spec.alpha/and :portkey.aws.inspector/auto-scaling-group))
(clojure.spec.alpha/def :portkey.aws.inspector.asset-attributes/ami-id (clojure.spec.alpha/and :portkey.aws.inspector/ami-id))
(clojure.spec.alpha/def :portkey.aws.inspector.asset-attributes/hostname (clojure.spec.alpha/and :portkey.aws.inspector/hostname))
(clojure.spec.alpha/def :portkey.aws.inspector.asset-attributes/ipv-4-addresses (clojure.spec.alpha/and :portkey.aws.inspector/ipv-4-address-list))
(clojure.spec.alpha/def :portkey.aws.inspector/asset-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.asset-attributes/schema-version] :opt-un [:portkey.aws.inspector.asset-attributes/agent-id :portkey.aws.inspector.asset-attributes/auto-scaling-group :portkey.aws.inspector.asset-attributes/ami-id :portkey.aws.inspector.asset-attributes/hostname :portkey.aws.inspector.asset-attributes/ipv-4-addresses]))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-target-filter/assessment-target-name-pattern (clojure.spec.alpha/and :portkey.aws.inspector/name-pattern))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-target-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.assessment-target-filter/assessment-target-name-pattern]))

(clojure.spec.alpha/def :portkey.aws.inspector.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.invalid-input-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector/invalid-input-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.invalid-input-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/invalid-input-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.invalid-input-exception/message :portkey.aws.inspector.invalid-input-exception/error-code :portkey.aws.inspector.invalid-input-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/scope-type #{"INSTANCE_ID" :rules-package-arn :instance-id "RULES_PACKAGE_ARN"})

(clojure.spec.alpha/def :portkey.aws.inspector/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector/provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector/arn-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-filter/name-pattern (clojure.spec.alpha/and :portkey.aws.inspector/name-pattern))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-filter/states (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-state-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-filter/duration-range (clojure.spec.alpha/and :portkey.aws.inspector/duration-range))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-filter/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector/filter-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-filter/start-time-range (clojure.spec.alpha/and :portkey.aws.inspector/timestamp-range))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-filter/completion-time-range (clojure.spec.alpha/and :portkey.aws.inspector/timestamp-range))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-filter/state-change-time-range (clojure.spec.alpha/and :portkey.aws.inspector/timestamp-range))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.assessment-run-filter/name-pattern :portkey.aws.inspector.assessment-run-filter/states :portkey.aws.inspector.assessment-run-filter/duration-range :portkey.aws.inspector.assessment-run-filter/rules-package-arns :portkey.aws.inspector.assessment-run-filter/start-time-range :portkey.aws.inspector.assessment-run-filter/completion-time-range :portkey.aws.inspector.assessment-run-filter/state-change-time-range]))

(clojure.spec.alpha/def :portkey.aws.inspector/attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-template-request/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-template-request/assessment-template-name (clojure.spec.alpha/and :portkey.aws.inspector/assessment-template-name))
(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-template-request/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-template-request/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector/assessment-template-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-template-request/user-attributes-for-findings (clojure.spec.alpha/and :portkey.aws.inspector/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector/create-assessment-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.create-assessment-template-request/assessment-target-arn :portkey.aws.inspector.create-assessment-template-request/assessment-template-name :portkey.aws.inspector.create-assessment-template-request/duration-in-seconds :portkey.aws.inspector.create-assessment-template-request/rules-package-arns] :opt-un [:portkey.aws.inspector.create-assessment-template-request/user-attributes-for-findings]))

(clojure.spec.alpha/def :portkey.aws.inspector.timestamp-range/begin-date (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.timestamp-range/end-date (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector/timestamp-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.timestamp-range/begin-date :portkey.aws.inspector.timestamp-range/end-date]))

(clojure.spec.alpha/def :portkey.aws.inspector/bool clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.inspector.internal-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.internal-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/internal-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.internal-exception/message :portkey.aws.inspector.internal-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.service-temporarily-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.service-temporarily-unavailable-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/service-temporarily-unavailable-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.service-temporarily-unavailable-exception/message :portkey.aws.inspector.service-temporarily-unavailable-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/auto-scaling-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector/exclusion-map (clojure.spec.alpha/map-of :portkey.aws.inspector/arn :portkey.aws.inspector/exclusion))

(clojure.spec.alpha/def :portkey.aws.inspector.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.access-denied-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector/access-denied-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.access-denied-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/access-denied-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.access-denied-exception/message :portkey.aws.inspector.access-denied-exception/error-code :portkey.aws.inspector.access-denied-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-in-progress-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.list-event-subscriptions-response/subscriptions (clojure.spec.alpha/and :portkey.aws.inspector/subscription-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-event-subscriptions-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/list-event-subscriptions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-event-subscriptions-response/subscriptions] :opt-un [:portkey.aws.inspector.list-event-subscriptions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector/scope-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.inspector/batch-describe-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector/report-file-format #{:pdf "HTML" "PDF" :html})

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-target-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/assessment-target :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-agent-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/assessment-run-agent :min-count 0 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.inspector/telemetry-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/telemetry-metadata :min-count 0 :max-count 5000))

(clojure.spec.alpha/def :portkey.aws.inspector/no-such-entity-error-code #{"RULES_PACKAGE_DOES_NOT_EXIST" :assessment-target-does-not-exist :iam-role-does-not-exist :rules-package-does-not-exist :finding-does-not-exist :resource-group-does-not-exist :assessment-run-does-not-exist "ASSESSMENT_TARGET_DOES_NOT_EXIST" "FINDING_DOES_NOT_EXIST" :assessment-template-does-not-exist "SNS_TOPIC_DOES_NOT_EXIST" "IAM_ROLE_DOES_NOT_EXIST" "RESOURCE_GROUP_DOES_NOT_EXIST" :sns-topic-does-not-exist "ASSESSMENT_TEMPLATE_DOES_NOT_EXIST" "ASSESSMENT_RUN_DOES_NOT_EXIST"})

(clojure.spec.alpha/def :portkey.aws.inspector/list-event-subscriptions-max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector/report-type #{:full "FULL" "FINDING" :finding})

(clojure.spec.alpha/def :portkey.aws.inspector/failed-items (clojure.spec.alpha/map-of :portkey.aws.inspector/arn :portkey.aws.inspector/failed-item-details))

(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-runs-response/assessment-run-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-runs-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/list-assessment-runs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-assessment-runs-response/assessment-run-arns] :opt-un [:portkey.aws.inspector.list-assessment-runs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector/numeric-version (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.inspector.create-resource-group-response/resource-group-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/create-resource-group-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.create-resource-group-response/resource-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-runs-request/assessment-run-arns (clojure.spec.alpha/and :portkey.aws.inspector/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-assessment-runs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-assessment-runs-request/assessment-run-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-notification-sns-status-code #{"SUCCESS" "TOPIC_DOES_NOT_EXIST" :internal-error "ACCESS_DENIED" "INTERNAL_ERROR" :success :topic-does-not-exist :access-denied})

(clojure.spec.alpha/def :portkey.aws.inspector/invalid-cross-account-role-error-code #{:role-does-not-exist-or-invalid-trust-relationship "ROLE_DOES_NOT_HAVE_CORRECT_POLICY" :role-does-not-have-correct-policy "ROLE_DOES_NOT_EXIST_OR_INVALID_TRUST_RELATIONSHIP"})

(clojure.spec.alpha/def :portkey.aws.inspector/severity-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/severity :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-target-response/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/create-assessment-target-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.create-assessment-target-response/assessment-target-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.list-event-subscriptions-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.list-event-subscriptions-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.list-event-subscriptions-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-event-subscriptions-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/list-event-subscriptions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.list-event-subscriptions-request/resource-arn :portkey.aws.inspector.list-event-subscriptions-request/next-token :portkey.aws.inspector.list-event-subscriptions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector/exclusion-preview-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/exclusion-preview :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector/finding-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 300))))

(clojure.spec.alpha/def :portkey.aws.inspector.get-exclusions-preview-request/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.get-exclusions-preview-request/preview-token (clojure.spec.alpha/and :portkey.aws.inspector/uuid))
(clojure.spec.alpha/def :portkey.aws.inspector.get-exclusions-preview-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.get-exclusions-preview-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.get-exclusions-preview-request/locale (clojure.spec.alpha/and :portkey.aws.inspector/locale))
(clojure.spec.alpha/def :portkey.aws.inspector/get-exclusions-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.get-exclusions-preview-request/assessment-template-arn :portkey.aws.inspector.get-exclusions-preview-request/preview-token] :opt-un [:portkey.aws.inspector.get-exclusions-preview-request/next-token :portkey.aws.inspector.get-exclusions-preview-request/max-results :portkey.aws.inspector.get-exclusions-preview-request/locale]))

(clojure.spec.alpha/def :portkey.aws.inspector/invalid-input-error-code #{"INVALID_RULES_PACKAGE_ARN" :invalid-assessment-run-start-time-range "INVALID_NUMBER_OF_USER_ATTRIBUTES" :invalid-attribute :invalid-user-attribute :invalid-assessment-run-arn "INVALID_IAM_ROLE_ARN" "INVALID_ASSESSMENT_TEMPLATE_DURATION" "INVALID_NUMBER_OF_ASSESSMENT_TARGET_ARNS" "INVALID_NUMBER_OF_ATTRIBUTES" "INVALID_PAGINATION_TOKEN" :invalid-resource-group-tag-value "INVALID_AUTO_SCALING_GROUP" :assessment-template-name-already-taken "INVALID_NUMBER_OF_RULES_PACKAGE_ARNS" :invalid-resource-arn :invalid-event :invalid-number-of-assessment-target-arns :invalid-rule-name "INVALID_NUMBER_OF_ASSESSMENT_RUN_ARNS" "INVALID_NUMBER_OF_AGENT_IDS" "INVALID_ASSESSMENT_RUN_STATE_CHANGE_TIME_RANGE" :invalid-assessment-template-duration-range :invalid-tag-key :invalid-assessment-run-duration-range "INVALID_NUMBER_OF_RULE_NAMES" "INVALID_ASSESSMENT_TEMPLATE_DURATION_RANGE" "INVALID_NUMBER_OF_AUTO_SCALING_GROUPS" "ASSESSMENT_TARGET_NAME_ALREADY_TAKEN" :invalid-user-attribute-key :invalid-number-of-rule-names "INVALID_NUMBER_OF_RESOURCE_GROUP_TAGS" :invalid-number-of-resource-group-arns :invalid-auto-scaling-group :invalid-number-of-assessment-run-arns "INVALID_LOCALE" :invalid-finding-arn "ASSESSMENT_TEMPLATE_NAME_ALREADY_TAKEN" :invalid-number-of-agent-ids "INVALID_RESOURCE_GROUP_ARN" "INVALID_NUMBER_OF_FINDING_ARNS" :invalid-number-of-attributes "INVALID_SNS_TOPIC_ARN" "INVALID_RESOURCE_GROUP_TAG_KEY" :invalid-user-attribute-value "INVALID_ASSESSMENT_RUN_ARN" :invalid-resource-group-tag-key "INVALID_ASSESSMENT_TARGET_NAME" "INVALID_MAX_RESULTS" "INVALID_ATTRIBUTE" "INVALID_NUMBER_OF_TAGS" :invalid-assessment-target-name-pattern :invalid-assessment-target-name "INVALID_RESOURCE_ARN" "INVALID_ASSESSMENT_RUN_START_TIME_RANGE" "INVALID_ASSESSMENT_TARGET_NAME_PATTERN" "INVALID_TAG_KEY" "INVALID_AGENT_ID" :invalid-tag "INVALID_ASSESSMENT_RUN_DURATION_RANGE" "INVALID_RESOURCE_GROUP_TAG_VALUE" :invalid-number-of-rules-package-arns "INVALID_ASSESSMENT_TARGET_ARN" :invalid-assessment-target-arn "INVALID_SEVERITY" :invalid-resource-group-arn :invalid-number-of-assessment-template-arns "INVALID_TAG_VALUE" :invalid-iam-role-arn "INVALID_NUMBER_OF_SEVERITIES" :invalid-rules-package-arn :invalid-locale :invalid-number-of-user-attributes "INVALID_USER_ATTRIBUTE" "INVALID_TAG" :invalid-assessment-run-state :invalid-agent-id :invalid-assessment-template-name :invalid-number-of-assessment-run-states "INVALID_NUMBER_OF_ASSESSMENT_RUN_STATES" "INVALID_FINDING_ARN" :invalid-assessment-template-duration :invalid-max-results :invalid-number-of-tags "INVALID_NUMBER_OF_ASSESSMENT_TEMPLATE_ARNS" "INVALID_USER_ATTRIBUTE_KEY" :invalid-pagination-token :invalid-assessment-run-completion-time-range :invalid-number-of-finding-arns :invalid-assessment-template-arn "INVALID_RULE_NAME" "INVALID_USER_ATTRIBUTE_VALUE" "INVALID_ASSESSMENT_TEMPLATE_ARN" :invalid-number-of-resource-group-tags "INVALID_ASSESSMENT_TEMPLATE_NAME" :invalid-number-of-auto-scaling-groups :invalid-severity :invalid-sns-topic-arn "INVALID_EVENT" "INVALID_ASSESSMENT_TEMPLATE_NAME_PATTERN" :invalid-assessment-run-state-change-time-range :invalid-number-of-severities "INVALID_NUMBER_OF_RESOURCE_GROUP_ARNS" :invalid-tag-value "INVALID_ASSESSMENT_RUN_COMPLETION_TIME_RANGE" :assessment-target-name-already-taken "INVALID_ASSESSMENT_RUN_STATE" :invalid-assessment-template-name-pattern})

(clojure.spec.alpha/def :portkey.aws.inspector/message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 300))))

(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-targets-response/assessment-target-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-targets-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/list-assessment-targets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-assessment-targets-response/assessment-target-arns] :opt-un [:portkey.aws.inspector.list-assessment-targets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-agent/agent-id (clojure.spec.alpha/and :portkey.aws.inspector/agent-id))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-agent/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-agent/agent-health (clojure.spec.alpha/and :portkey.aws.inspector/agent-health))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-agent/agent-health-code (clojure.spec.alpha/and :portkey.aws.inspector/agent-health-code))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-agent/agent-health-details (clojure.spec.alpha/and :portkey.aws.inspector/message))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-agent/auto-scaling-group (clojure.spec.alpha/and :portkey.aws.inspector/auto-scaling-group))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-agent/telemetry-metadata (clojure.spec.alpha/and :portkey.aws.inspector/telemetry-metadata-list))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-agent (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.assessment-run-agent/agent-id :portkey.aws.inspector.assessment-run-agent/assessment-run-arn :portkey.aws.inspector.assessment-run-agent/agent-health :portkey.aws.inspector.assessment-run-agent/agent-health-code :portkey.aws.inspector.assessment-run-agent/telemetry-metadata] :opt-un [:portkey.aws.inspector.assessment-run-agent/agent-health-details :portkey.aws.inspector.assessment-run-agent/auto-scaling-group]))

(clojure.spec.alpha/def :portkey.aws.inspector/user-attribute-key-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/attribute-key :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.duration-range/min-seconds (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.duration-range/max-seconds (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector/duration-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.duration-range/min-seconds :portkey.aws.inspector.duration-range/max-seconds]))

(clojure.spec.alpha/def :portkey.aws.inspector/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector.agent-filter/agent-healths (clojure.spec.alpha/and :portkey.aws.inspector/agent-health-list))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-filter/agent-health-codes (clojure.spec.alpha/and :portkey.aws.inspector/agent-health-code-list))
(clojure.spec.alpha/def :portkey.aws.inspector/agent-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.agent-filter/agent-healths :portkey.aws.inspector.agent-filter/agent-health-codes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/data-collected (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/notifications (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-notification-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector/assessment-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/created-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/user-attributes-for-findings (clojure.spec.alpha/and :portkey.aws.inspector/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/started-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/finding-counts (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-finding-counts))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/completed-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/name (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-name))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/state-changes (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-state-change-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/state (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-state))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/state-changed-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.assessment-run/arn :portkey.aws.inspector.assessment-run/name :portkey.aws.inspector.assessment-run/assessment-template-arn :portkey.aws.inspector.assessment-run/state :portkey.aws.inspector.assessment-run/duration-in-seconds :portkey.aws.inspector.assessment-run/rules-package-arns :portkey.aws.inspector.assessment-run/user-attributes-for-findings :portkey.aws.inspector.assessment-run/created-at :portkey.aws.inspector.assessment-run/state-changed-at :portkey.aws.inspector.assessment-run/data-collected :portkey.aws.inspector.assessment-run/state-changes :portkey.aws.inspector.assessment-run/notifications :portkey.aws.inspector.assessment-run/finding-counts] :opt-un [:portkey.aws.inspector.assessment-run/started-at :portkey.aws.inspector.assessment-run/completed-at]))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-findings-request/finding-arns (clojure.spec.alpha/and :portkey.aws.inspector/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-findings-request/locale (clojure.spec.alpha/and :portkey.aws.inspector/locale))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-findings-request/finding-arns] :opt-un [:portkey.aws.inspector.describe-findings-request/locale]))

(clojure.spec.alpha/def :portkey.aws.inspector.preview-agents-request/preview-agents-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.preview-agents-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.preview-agents-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector/preview-agents-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector/preview-agents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.preview-agents-request/preview-agents-arn] :opt-un [:portkey.aws.inspector.preview-agents-request/next-token :portkey.aws.inspector.preview-agents-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.agents-already-running-assessment-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.agents-already-running-assessment-exception/agents (clojure.spec.alpha/and :portkey.aws.inspector/agent-already-running-assessment-list))
(clojure.spec.alpha/def :portkey.aws.inspector.agents-already-running-assessment-exception/agents-truncated (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.agents-already-running-assessment-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/agents-already-running-assessment-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.agents-already-running-assessment-exception/message :portkey.aws.inspector.agents-already-running-assessment-exception/agents :portkey.aws.inspector.agents-already-running-assessment-exception/agents-truncated :portkey.aws.inspector.agents-already-running-assessment-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.subscription/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.subscription/topic-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.subscription/event-subscriptions (clojure.spec.alpha/and :portkey.aws.inspector/event-subscription-list))
(clojure.spec.alpha/def :portkey.aws.inspector/subscription (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.subscription/resource-arn :portkey.aws.inspector.subscription/topic-arn :portkey.aws.inspector.subscription/event-subscriptions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.inspector.agent-preview/hostname (clojure.spec.alpha/and :portkey.aws.inspector/hostname))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-preview/agent-id (clojure.spec.alpha/and :portkey.aws.inspector/agent-id))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-preview/auto-scaling-group (clojure.spec.alpha/and :portkey.aws.inspector/auto-scaling-group))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-preview/agent-health (clojure.spec.alpha/and :portkey.aws.inspector/agent-health))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-preview/agent-version (clojure.spec.alpha/and :portkey.aws.inspector/agent-version))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-preview/operating-system (clojure.spec.alpha/and :portkey.aws.inspector/operating-system))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-preview/kernel-version (clojure.spec.alpha/and :portkey.aws.inspector/kernel-version))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-preview/ipv-4-address (clojure.spec.alpha/and :portkey.aws.inspector/ipv-4-address))
(clojure.spec.alpha/def :portkey.aws.inspector/agent-preview (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.agent-preview/agent-id] :opt-un [:portkey.aws.inspector.agent-preview/hostname :portkey.aws.inspector.agent-preview/auto-scaling-group :portkey.aws.inspector.agent-preview/agent-health :portkey.aws.inspector.agent-preview/agent-version :portkey.aws.inspector.agent-preview/operating-system :portkey.aws.inspector.agent-preview/kernel-version :portkey.aws.inspector.agent-preview/ipv-4-address]))

(clojure.spec.alpha/def :portkey.aws.inspector/list-parent-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector/text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 20000))))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-cross-account-access-role-response/role-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-cross-account-access-role-response/valid (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-cross-account-access-role-response/registered-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-cross-account-access-role-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-cross-account-access-role-response/role-arn :portkey.aws.inspector.describe-cross-account-access-role-response/valid :portkey.aws.inspector.describe-cross-account-access-role-response/registered-at] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.rules-package/arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.rules-package/name (clojure.spec.alpha/and :portkey.aws.inspector/rules-package-name))
(clojure.spec.alpha/def :portkey.aws.inspector.rules-package/version (clojure.spec.alpha/and :portkey.aws.inspector/version))
(clojure.spec.alpha/def :portkey.aws.inspector.rules-package/provider (clojure.spec.alpha/and :portkey.aws.inspector/provider-name))
(clojure.spec.alpha/def :portkey.aws.inspector.rules-package/description (clojure.spec.alpha/and :portkey.aws.inspector/text))
(clojure.spec.alpha/def :portkey.aws.inspector/rules-package (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.rules-package/arn :portkey.aws.inspector.rules-package/name :portkey.aws.inspector.rules-package/version :portkey.aws.inspector.rules-package/provider] :opt-un [:portkey.aws.inspector.rules-package/description]))

(clojure.spec.alpha/def :portkey.aws.inspector.unsubscribe-from-event-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.unsubscribe-from-event-request/event (clojure.spec.alpha/and :portkey.aws.inspector/inspector-event))
(clojure.spec.alpha/def :portkey.aws.inspector.unsubscribe-from-event-request/topic-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/unsubscribe-from-event-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.unsubscribe-from-event-request/resource-arn :portkey.aws.inspector.unsubscribe-from-event-request/event :portkey.aws.inspector.unsubscribe-from-event-request/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/ipv-4-address-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/ipv-4-address :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.subscribe-to-event-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.subscribe-to-event-request/event (clojure.spec.alpha/and :portkey.aws.inspector/inspector-event))
(clojure.spec.alpha/def :portkey.aws.inspector.subscribe-to-event-request/topic-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/subscribe-to-event-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.subscribe-to-event-request/resource-arn :portkey.aws.inspector.subscribe-to-event-request/event :portkey.aws.inspector.subscribe-to-event-request/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.list-findings-response/finding-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-findings-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/list-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-findings-response/finding-arns] :opt-un [:portkey.aws.inspector.list-findings-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.list-rules-packages-response/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-rules-packages-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/list-rules-packages-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-rules-packages-response/rules-package-arns] :opt-un [:portkey.aws.inspector.list-rules-packages-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector/service-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.tag/key (clojure.spec.alpha/and :portkey.aws.inspector/tag-key))
(clojure.spec.alpha/def :portkey.aws.inspector.tag/value (clojure.spec.alpha/and :portkey.aws.inspector/tag-value))
(clojure.spec.alpha/def :portkey.aws.inspector/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.tag/key] :opt-un [:portkey.aws.inspector.tag/value]))

(clojure.spec.alpha/def :portkey.aws.inspector/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.agent-already-running-assessment/agent-id (clojure.spec.alpha/and :portkey.aws.inspector/agent-id))
(clojure.spec.alpha/def :portkey.aws.inspector.agent-already-running-assessment/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/agent-already-running-assessment (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.agent-already-running-assessment/agent-id :portkey.aws.inspector.agent-already-running-assessment/assessment-run-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/list-max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector/agent-health-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/agent-health :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.register-cross-account-access-role-request/role-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/register-cross-account-access-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.register-cross-account-access-role-request/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.failed-item-details/failure-code (clojure.spec.alpha/and :portkey.aws.inspector/failed-item-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.failed-item-details/retryable (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/failed-item-details (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.failed-item-details/failure-code :portkey.aws.inspector.failed-item-details/retryable] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-targets-request/assessment-target-arns (clojure.spec.alpha/and :portkey.aws.inspector/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-assessment-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-assessment-targets-request/assessment-target-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-template-response/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/create-assessment-template-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.create-assessment-template-response/assessment-template-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/report-status #{"COMPLETED" :work-in-progress :completed "FAILED" "WORK_IN_PROGRESS" :failed})

(clojure.spec.alpha/def :portkey.aws.inspector.resource-group/arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.resource-group/tags (clojure.spec.alpha/and :portkey.aws.inspector/resource-group-tags))
(clojure.spec.alpha/def :portkey.aws.inspector.resource-group/created-at (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector/resource-group (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.resource-group/arn :portkey.aws.inspector.resource-group/tags :portkey.aws.inspector.resource-group/created-at] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-templates-response/assessment-template-arns (clojure.spec.alpha/and :portkey.aws.inspector/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.list-assessment-templates-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/list-assessment-templates-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.list-assessment-templates-response/assessment-template-arns] :opt-un [:portkey.aws.inspector.list-assessment-templates-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-notification/date (clojure.spec.alpha/and :portkey.aws.inspector/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-notification/event (clojure.spec.alpha/and :portkey.aws.inspector/inspector-event))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-notification/message (clojure.spec.alpha/and :portkey.aws.inspector/message))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-notification/error (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-notification/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-notification/sns-publish-status-code (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-notification-sns-status-code))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-notification (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.assessment-run-notification/date :portkey.aws.inspector.assessment-run-notification/event :portkey.aws.inspector.assessment-run-notification/error] :opt-un [:portkey.aws.inspector.assessment-run-notification/message :portkey.aws.inspector.assessment-run-notification/sns-topic-arn :portkey.aws.inspector.assessment-run-notification/sns-publish-status-code]))

(clojure.spec.alpha/def :portkey.aws.inspector.create-exclusions-preview-request/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/create-exclusions-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.create-exclusions-preview-request/assessment-template-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.set-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.set-tags-for-resource-request/tags (clojure.spec.alpha/and :portkey.aws.inspector/tag-list))
(clojure.spec.alpha/def :portkey.aws.inspector/set-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.set-tags-for-resource-request/resource-arn] :opt-un [:portkey.aws.inspector.set-tags-for-resource-request/tags]))

(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-in-progress-exception/assessment-run-arns (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-in-progress-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-in-progress-exception/assessment-run-arns-truncated (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.assessment-run-in-progress-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector/bool))
(clojure.spec.alpha/def :portkey.aws.inspector/assessment-run-in-progress-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.assessment-run-in-progress-exception/message :portkey.aws.inspector.assessment-run-in-progress-exception/assessment-run-arns :portkey.aws.inspector.assessment-run-in-progress-exception/assessment-run-arns-truncated :portkey.aws.inspector.assessment-run-in-progress-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.remove-attributes-from-findings-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/remove-attributes-from-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.remove-attributes-from-findings-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.delete-assessment-run-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/delete-assessment-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.delete-assessment-run-request/assessment-run-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/stop-action #{:skip-evaluation "SKIP_EVALUATION" :start-evaluation "START_EVALUATION"})

(clojure.spec.alpha/def :portkey.aws.inspector.delete-assessment-template-request/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/delete-assessment-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.delete-assessment-template-request/assessment-template-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.finding-filter/agent-ids (clojure.spec.alpha/and :portkey.aws.inspector/agent-id-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding-filter/auto-scaling-groups (clojure.spec.alpha/and :portkey.aws.inspector/auto-scaling-group-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding-filter/rule-names (clojure.spec.alpha/and :portkey.aws.inspector/rule-name-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding-filter/severities (clojure.spec.alpha/and :portkey.aws.inspector/severity-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding-filter/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector/filter-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding-filter/attributes (clojure.spec.alpha/and :portkey.aws.inspector/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding-filter/user-attributes (clojure.spec.alpha/and :portkey.aws.inspector/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.finding-filter/creation-time-range (clojure.spec.alpha/and :portkey.aws.inspector/timestamp-range))
(clojure.spec.alpha/def :portkey.aws.inspector/finding-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.finding-filter/agent-ids :portkey.aws.inspector.finding-filter/auto-scaling-groups :portkey.aws.inspector.finding-filter/rule-names :portkey.aws.inspector.finding-filter/severities :portkey.aws.inspector.finding-filter/rules-package-arns :portkey.aws.inspector.finding-filter/attributes :portkey.aws.inspector.finding-filter/user-attributes :portkey.aws.inspector.finding-filter/creation-time-range]))

(clojure.spec.alpha/def :portkey.aws.inspector.preview-generation-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.inspector/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector/preview-generation-in-progress-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.preview-generation-in-progress-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.resource-group-tag/key (clojure.spec.alpha/and :portkey.aws.inspector/tag-key))
(clojure.spec.alpha/def :portkey.aws.inspector.resource-group-tag/value (clojure.spec.alpha/and :portkey.aws.inspector/tag-value))
(clojure.spec.alpha/def :portkey.aws.inspector/resource-group-tag (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.resource-group-tag/key] :opt-un [:portkey.aws.inspector.resource-group-tag/value]))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.inspector/agent-health-code #{"IDLE" "UNKNOWN" :idle :unknown :unhealthy :running "SHUTDOWN" :throttled "THROTTLED" "RUNNING" :shutdown "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.inspector.describe-findings-response/findings (clojure.spec.alpha/and :portkey.aws.inspector/finding-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-findings-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-findings-response/findings :portkey.aws.inspector.describe-findings-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-runs-response/assessment-runs (clojure.spec.alpha/and :portkey.aws.inspector/assessment-run-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-assessment-runs-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-assessment-runs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-assessment-runs-response/assessment-runs :portkey.aws.inspector.describe-assessment-runs-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector/list-returned-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/arn :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector/access-denied-error-code #{"ACCESS_DENIED_TO_SNS_TOPIC" "ACCESS_DENIED_TO_ASSESSMENT_RUN" "ACCESS_DENIED_TO_RESOURCE_GROUP" :access-denied-to-sns-topic :access-denied-to-assessment-run "ACCESS_DENIED_TO_RULES_PACKAGE" :access-denied-to-finding "ACCESS_DENIED_TO_FINDING" "ACCESS_DENIED_TO_ASSESSMENT_TARGET" :access-denied-to-rules-package :access-denied-to-assessment-target :access-denied-to-resource-group :access-denied-to-iam-role "ACCESS_DENIED_TO_ASSESSMENT_TEMPLATE" "ACCESS_DENIED_TO_IAM_ROLE" :access-denied-to-assessment-template})

(clojure.spec.alpha/def :portkey.aws.inspector.inspector-service-attributes/schema-version (clojure.spec.alpha/and :portkey.aws.inspector/numeric-version))
(clojure.spec.alpha/def :portkey.aws.inspector.inspector-service-attributes/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.inspector-service-attributes/rules-package-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/inspector-service-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.inspector-service-attributes/schema-version] :opt-un [:portkey.aws.inspector.inspector-service-attributes/assessment-run-arn :portkey.aws.inspector.inspector-service-attributes/rules-package-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector/assessment-template-list (clojure.spec.alpha/coll-of :portkey.aws.inspector/assessment-template :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.scope/key (clojure.spec.alpha/and :portkey.aws.inspector/scope-type))
(clojure.spec.alpha/def :portkey.aws.inspector.scope/value (clojure.spec.alpha/and :portkey.aws.inspector/scope-value))
(clojure.spec.alpha/def :portkey.aws.inspector/scope (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.scope/key :portkey.aws.inspector.scope/value]))

(clojure.spec.alpha/def :portkey.aws.inspector.preview-agents-response/agent-previews (clojure.spec.alpha/and :portkey.aws.inspector/agent-preview-list))
(clojure.spec.alpha/def :portkey.aws.inspector.preview-agents-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector/preview-agents-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.preview-agents-response/agent-previews] :opt-un [:portkey.aws.inspector.preview-agents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector/kernel-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector/operating-system (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector/uuid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.inspector.describe-exclusions-request/exclusion-arns (clojure.spec.alpha/and :portkey.aws.inspector/batch-describe-exclusions-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.describe-exclusions-request/locale (clojure.spec.alpha/and :portkey.aws.inspector/locale))
(clojure.spec.alpha/def :portkey.aws.inspector/describe-exclusions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.describe-exclusions-request/exclusion-arns] :opt-un [:portkey.aws.inspector.describe-exclusions-request/locale]))

(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-target-request/assessment-target-name (clojure.spec.alpha/and :portkey.aws.inspector/assessment-target-name))
(clojure.spec.alpha/def :portkey.aws.inspector.create-assessment-target-request/resource-group-arn (clojure.spec.alpha/and :portkey.aws.inspector/arn))
(clojure.spec.alpha/def :portkey.aws.inspector/create-assessment-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.create-assessment-target-request/assessment-target-name] :opt-un [:portkey.aws.inspector.create-assessment-target-request/resource-group-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector/name-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.inspector.create-resource-group-request/resource-group-tags (clojure.spec.alpha/and :portkey.aws.inspector/resource-group-tags))
(clojure.spec.alpha/def :portkey.aws.inspector/create-resource-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.create-resource-group-request/resource-group-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.get-telemetry-metadata-response/telemetry-metadata (clojure.spec.alpha/and :portkey.aws.inspector/telemetry-metadata-list))
(clojure.spec.alpha/def :portkey.aws.inspector/get-telemetry-metadata-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.get-telemetry-metadata-response/telemetry-metadata] :opt-un []))

(clojure.core/defn list-assessment-runs ([] (list-assessment-runs {})) ([list-assessment-runs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-assessment-runs-request list-assessment-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-assessment-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-assessment-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssessmentRuns", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-assessment-runs :args (clojure.spec.alpha/? :portkey.aws.inspector/list-assessment-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-assessment-runs-response))

(clojure.core/defn delete-assessment-template ([delete-assessment-template-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-assessment-template-request delete-assessment-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/delete-assessment-template-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAssessmentTemplate", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AssessmentRunInProgressException" :portkey.aws.inspector/assessment-run-in-progress-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-assessment-template :args (clojure.spec.alpha/tuple :portkey.aws.inspector/delete-assessment-template-request) :ret clojure.core/true?)

(clojure.core/defn unsubscribe-from-event ([unsubscribe-from-event-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-unsubscribe-from-event-request unsubscribe-from-event-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/unsubscribe-from-event-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UnsubscribeFromEvent", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef unsubscribe-from-event :args (clojure.spec.alpha/tuple :portkey.aws.inspector/unsubscribe-from-event-request) :ret clojure.core/true?)

(clojure.core/defn register-cross-account-access-role ([register-cross-account-access-role-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-cross-account-access-role-request register-cross-account-access-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/register-cross-account-access-role-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterCrossAccountAccessRole", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "InvalidCrossAccountRoleException" :portkey.aws.inspector/invalid-cross-account-role-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef register-cross-account-access-role :args (clojure.spec.alpha/tuple :portkey.aws.inspector/register-cross-account-access-role-request) :ret clojure.core/true?)

(clojure.core/defn get-exclusions-preview ([get-exclusions-preview-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-exclusions-preview-request get-exclusions-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/get-exclusions-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/get-exclusions-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetExclusionsPreview", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "InternalException" :portkey.aws.inspector/internal-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef get-exclusions-preview :args (clojure.spec.alpha/tuple :portkey.aws.inspector/get-exclusions-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/get-exclusions-preview-response))

(clojure.core/defn list-findings ([] (list-findings {})) ([list-findings-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-findings-request list-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-findings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-findings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListFindings", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-findings :args (clojure.spec.alpha/? :portkey.aws.inspector/list-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-findings-response))

(clojure.core/defn start-assessment-run ([start-assessment-run-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-assessment-run-request start-assessment-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/start-assessment-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/start-assessment-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartAssessmentRun", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "InvalidCrossAccountRoleException" :portkey.aws.inspector/invalid-cross-account-role-exception, "AgentsAlreadyRunningAssessmentException" :portkey.aws.inspector/agents-already-running-assessment-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef start-assessment-run :args (clojure.spec.alpha/tuple :portkey.aws.inspector/start-assessment-run-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/start-assessment-run-response))

(clojure.core/defn describe-assessment-targets ([describe-assessment-targets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-assessment-targets-request describe-assessment-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/describe-assessment-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/describe-assessment-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssessmentTargets", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-assessment-targets :args (clojure.spec.alpha/tuple :portkey.aws.inspector/describe-assessment-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/describe-assessment-targets-response))

(clojure.core/defn set-tags-for-resource ([set-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-tags-for-resource-request set-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/set-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetTagsForResource", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.inspector/set-tags-for-resource-request) :ret clojure.core/true?)

(clojure.core/defn create-exclusions-preview ([create-exclusions-preview-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-exclusions-preview-request create-exclusions-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/create-exclusions-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/create-exclusions-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateExclusionsPreview", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "PreviewGenerationInProgressException" :portkey.aws.inspector/preview-generation-in-progress-exception, "InternalException" :portkey.aws.inspector/internal-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-exclusions-preview :args (clojure.spec.alpha/tuple :portkey.aws.inspector/create-exclusions-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/create-exclusions-preview-response))

(clojure.core/defn get-assessment-report ([get-assessment-report-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-assessment-report-request get-assessment-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/get-assessment-report-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/get-assessment-report-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAssessmentReport", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "AssessmentRunInProgressException" :portkey.aws.inspector/assessment-run-in-progress-exception, "UnsupportedFeatureException" :portkey.aws.inspector/unsupported-feature-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-assessment-report :args (clojure.spec.alpha/tuple :portkey.aws.inspector/get-assessment-report-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/get-assessment-report-response))

(clojure.core/defn subscribe-to-event ([subscribe-to-event-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-subscribe-to-event-request subscribe-to-event-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/subscribe-to-event-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SubscribeToEvent", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef subscribe-to-event :args (clojure.spec.alpha/tuple :portkey.aws.inspector/subscribe-to-event-request) :ret clojure.core/true?)

(clojure.core/defn create-assessment-template ([create-assessment-template-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-assessment-template-request create-assessment-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/create-assessment-template-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/create-assessment-template-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAssessmentTemplate", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-assessment-template :args (clojure.spec.alpha/tuple :portkey.aws.inspector/create-assessment-template-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/create-assessment-template-response))

(clojure.core/defn describe-resource-groups ([describe-resource-groups-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-resource-groups-request describe-resource-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/describe-resource-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/describe-resource-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeResourceGroups", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-resource-groups :args (clojure.spec.alpha/tuple :portkey.aws.inspector/describe-resource-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/describe-resource-groups-response))

(clojure.core/defn preview-agents ([preview-agents-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-preview-agents-request preview-agents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/preview-agents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/preview-agents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PreviewAgents", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "InvalidCrossAccountRoleException" :portkey.aws.inspector/invalid-cross-account-role-exception}})))))
(clojure.spec.alpha/fdef preview-agents :args (clojure.spec.alpha/tuple :portkey.aws.inspector/preview-agents-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/preview-agents-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.inspector/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-tags-for-resource-response))

(clojure.core/defn describe-rules-packages ([describe-rules-packages-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-rules-packages-request describe-rules-packages-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/describe-rules-packages-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/describe-rules-packages-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRulesPackages", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-rules-packages :args (clojure.spec.alpha/tuple :portkey.aws.inspector/describe-rules-packages-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/describe-rules-packages-response))

(clojure.core/defn get-telemetry-metadata ([get-telemetry-metadata-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-telemetry-metadata-request get-telemetry-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/get-telemetry-metadata-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/get-telemetry-metadata-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTelemetryMetadata", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef get-telemetry-metadata :args (clojure.spec.alpha/tuple :portkey.aws.inspector/get-telemetry-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/get-telemetry-metadata-response))

(clojure.core/defn delete-assessment-run ([delete-assessment-run-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-assessment-run-request delete-assessment-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/delete-assessment-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAssessmentRun", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AssessmentRunInProgressException" :portkey.aws.inspector/assessment-run-in-progress-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-assessment-run :args (clojure.spec.alpha/tuple :portkey.aws.inspector/delete-assessment-run-request) :ret clojure.core/true?)

(clojure.core/defn remove-attributes-from-findings ([remove-attributes-from-findings-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-attributes-from-findings-request remove-attributes-from-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/remove-attributes-from-findings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/remove-attributes-from-findings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveAttributesFromFindings", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef remove-attributes-from-findings :args (clojure.spec.alpha/tuple :portkey.aws.inspector/remove-attributes-from-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/remove-attributes-from-findings-response))

(clojure.core/defn list-assessment-run-agents ([list-assessment-run-agents-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-assessment-run-agents-request list-assessment-run-agents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-assessment-run-agents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-assessment-run-agents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssessmentRunAgents", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-assessment-run-agents :args (clojure.spec.alpha/tuple :portkey.aws.inspector/list-assessment-run-agents-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-assessment-run-agents-response))

(clojure.core/defn add-attributes-to-findings ([add-attributes-to-findings-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-attributes-to-findings-request add-attributes-to-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/add-attributes-to-findings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/add-attributes-to-findings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddAttributesToFindings", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef add-attributes-to-findings :args (clojure.spec.alpha/tuple :portkey.aws.inspector/add-attributes-to-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/add-attributes-to-findings-response))

(clojure.core/defn create-resource-group ([create-resource-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-resource-group-request create-resource-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/create-resource-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/create-resource-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateResourceGroup", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-resource-group :args (clojure.spec.alpha/tuple :portkey.aws.inspector/create-resource-group-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/create-resource-group-response))

(clojure.core/defn list-assessment-templates ([] (list-assessment-templates {})) ([list-assessment-templates-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-assessment-templates-request list-assessment-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-assessment-templates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-assessment-templates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssessmentTemplates", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-assessment-templates :args (clojure.spec.alpha/? :portkey.aws.inspector/list-assessment-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-assessment-templates-response))

(clojure.core/defn list-assessment-targets ([] (list-assessment-targets {})) ([list-assessment-targets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-assessment-targets-request list-assessment-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-assessment-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-assessment-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssessmentTargets", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception}})))))
(clojure.spec.alpha/fdef list-assessment-targets :args (clojure.spec.alpha/? :portkey.aws.inspector/list-assessment-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-assessment-targets-response))

(clojure.core/defn list-event-subscriptions ([] (list-event-subscriptions {})) ([list-event-subscriptions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-event-subscriptions-request list-event-subscriptions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-event-subscriptions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-event-subscriptions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEventSubscriptions", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-event-subscriptions :args (clojure.spec.alpha/? :portkey.aws.inspector/list-event-subscriptions-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-event-subscriptions-response))

(clojure.core/defn describe-assessment-runs ([describe-assessment-runs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-assessment-runs-request describe-assessment-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/describe-assessment-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/describe-assessment-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssessmentRuns", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-assessment-runs :args (clojure.spec.alpha/tuple :portkey.aws.inspector/describe-assessment-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/describe-assessment-runs-response))

(clojure.core/defn describe-exclusions ([describe-exclusions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-exclusions-request describe-exclusions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/describe-exclusions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/describe-exclusions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeExclusions", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-exclusions :args (clojure.spec.alpha/tuple :portkey.aws.inspector/describe-exclusions-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/describe-exclusions-response))

(clojure.core/defn describe-findings ([describe-findings-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-findings-request describe-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/describe-findings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/describe-findings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeFindings", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-findings :args (clojure.spec.alpha/tuple :portkey.aws.inspector/describe-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/describe-findings-response))

(clojure.core/defn describe-cross-account-access-role ([] (describe-cross-account-access-role {})) ([_] (clojure.core/let [request-function-result__28521__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/describe-cross-account-access-role-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCrossAccountAccessRole", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception}})))))
(clojure.spec.alpha/fdef describe-cross-account-access-role :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.inspector/describe-cross-account-access-role-response))

(clojure.core/defn list-exclusions ([list-exclusions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-exclusions-request list-exclusions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-exclusions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-exclusions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListExclusions", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-exclusions :args (clojure.spec.alpha/tuple :portkey.aws.inspector/list-exclusions-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-exclusions-response))

(clojure.core/defn create-assessment-target ([create-assessment-target-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-assessment-target-request create-assessment-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/create-assessment-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/create-assessment-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAssessmentTarget", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "InvalidCrossAccountRoleException" :portkey.aws.inspector/invalid-cross-account-role-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-assessment-target :args (clojure.spec.alpha/tuple :portkey.aws.inspector/create-assessment-target-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/create-assessment-target-response))

(clojure.core/defn stop-assessment-run ([stop-assessment-run-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-assessment-run-request stop-assessment-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/stop-assessment-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopAssessmentRun", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef stop-assessment-run :args (clojure.spec.alpha/tuple :portkey.aws.inspector/stop-assessment-run-request) :ret clojure.core/true?)

(clojure.core/defn update-assessment-target ([update-assessment-target-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-assessment-target-request update-assessment-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/update-assessment-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAssessmentTarget", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef update-assessment-target :args (clojure.spec.alpha/tuple :portkey.aws.inspector/update-assessment-target-request) :ret clojure.core/true?)

(clojure.core/defn describe-assessment-templates ([describe-assessment-templates-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-assessment-templates-request describe-assessment-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/describe-assessment-templates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/describe-assessment-templates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssessmentTemplates", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-assessment-templates :args (clojure.spec.alpha/tuple :portkey.aws.inspector/describe-assessment-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/describe-assessment-templates-response))

(clojure.core/defn list-rules-packages ([] (list-rules-packages {})) ([list-rules-packages-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-rules-packages-request list-rules-packages-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector/list-rules-packages-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/list-rules-packages-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRulesPackages", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception}})))))
(clojure.spec.alpha/fdef list-rules-packages :args (clojure.spec.alpha/? :portkey.aws.inspector/list-rules-packages-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector/list-rules-packages-response))

(clojure.core/defn delete-assessment-target ([delete-assessment-target-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-assessment-target-request delete-assessment-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.inspector/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector/delete-assessment-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAssessmentTarget", :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector/internal-exception, "InvalidInputException" :portkey.aws.inspector/invalid-input-exception, "AssessmentRunInProgressException" :portkey.aws.inspector/assessment-run-in-progress-exception, "AccessDeniedException" :portkey.aws.inspector/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-assessment-target :args (clojure.spec.alpha/tuple :portkey.aws.inspector/delete-assessment-target-request) :ret clojure.core/true?)
