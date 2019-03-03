(ns portkey.aws.inspector.-2016-02-16 (:require [portkey.aws]))

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

(clojure.core/declare deser-failed-item-error-code)

(clojure.core/declare deser-severity)

(clojure.core/declare deser-finding)

(clojure.core/declare deser-assessment-run-state-change-list)

(clojure.core/declare deser-assessment-run-state-change)

(clojure.core/declare deser-attribute-list)

(clojure.core/declare deser-event-subscription-list)

(clojure.core/declare deser-assessment-run-state)

(clojure.core/declare deser-assessment-run-finding-counts)

(clojure.core/declare deser-inspector-event)

(clojure.core/declare deser-asset-type)

(clojure.core/declare deser-rules-package-name)

(clojure.core/declare deser-user-attribute-list)

(clojure.core/declare deser-numeric-severity)

(clojure.core/declare deser-event-subscription)

(clojure.core/declare deser-assessment-template-rules-package-arn-list)

(clojure.core/declare deser-exclusion-preview)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-assessment-template)

(clojure.core/declare deser-agent-health)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-exclusion)

(clojure.core/declare deser-agent-version)

(clojure.core/declare deser-ipv-4-address)

(clojure.core/declare deser-resource-group-list)

(clojure.core/declare deser-ioc-confidence)

(clojure.core/declare deser-telemetry-metadata)

(clojure.core/declare deser-preview-status)

(clojure.core/declare deser-assessment-run-list)

(clojure.core/declare deser-assessment-target-name)

(clojure.core/declare deser-scope-list)

(clojure.core/declare deser-hostname)

(clojure.core/declare deser-agent-already-running-assessment-list)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-attribute)

(clojure.core/declare deser-assessment-run-duration)

(clojure.core/declare deser-assessment-run-notification-list)

(clojure.core/declare deser-finding-list)

(clojure.core/declare deser-assessment-target)

(clojure.core/declare deser-finding-count)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-assessment-run-name)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-resource-group-tags)

(clojure.core/declare deser-limit-exceeded-error-code)

(clojure.core/declare deser-agent-preview-list)

(clojure.core/declare deser-agent-id)

(clojure.core/declare deser-ami-id)

(clojure.core/declare deser-assessment-rules-package-arn-list)

(clojure.core/declare deser-rules-package-list)

(clojure.core/declare deser-subscription-list)

(clojure.core/declare deser-url)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-asset-attributes)

(clojure.core/declare deser-scope-type)

(clojure.core/declare deser-message)

(clojure.core/declare deser-provider-name)

(clojure.core/declare deser-arn-count)

(clojure.core/declare deser-attribute-key)

(clojure.core/declare deser-bool)

(clojure.core/declare deser-auto-scaling-group)

(clojure.core/declare deser-exclusion-map)

(clojure.core/declare deser-assessment-run-in-progress-arn-list)

(clojure.core/declare deser-scope-value)

(clojure.core/declare deser-assessment-target-list)

(clojure.core/declare deser-assessment-run-agent-list)

(clojure.core/declare deser-telemetry-metadata-list)

(clojure.core/declare deser-no-such-entity-error-code)

(clojure.core/declare deser-failed-items)

(clojure.core/declare deser-numeric-version)

(clojure.core/declare deser-assessment-run-notification-sns-status-code)

(clojure.core/declare deser-invalid-cross-account-role-error-code)

(clojure.core/declare deser-exclusion-preview-list)

(clojure.core/declare deser-finding-id)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-invalid-input-error-code)

(clojure.core/declare deser-message-type)

(clojure.core/declare deser-assessment-run-agent)

(clojure.core/declare deser-long)

(clojure.core/declare deser-assessment-run)

(clojure.core/declare deser-subscription)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-agent-preview)

(clojure.core/declare deser-text)

(clojure.core/declare deser-rules-package)

(clojure.core/declare deser-ipv-4-address-list)

(clojure.core/declare deser-service-name)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-version)

(clojure.core/declare deser-agent-already-running-assessment)

(clojure.core/declare deser-failed-item-details)

(clojure.core/declare deser-report-status)

(clojure.core/declare deser-resource-group)

(clojure.core/declare deser-assessment-run-notification)

(clojure.core/declare deser-resource-group-tag)

(clojure.core/declare deser-assessment-template-name)

(clojure.core/declare deser-agent-health-code)

(clojure.core/declare deser-list-returned-arn-list)

(clojure.core/declare deser-access-denied-error-code)

(clojure.core/declare deser-inspector-service-attributes)

(clojure.core/declare deser-assessment-template-list)

(clojure.core/declare deser-scope)

(clojure.core/declare deser-kernel-version)

(clojure.core/declare deser-operating-system)

(clojure.core/declare deser-uuid)

(clojure.core/defn- deser-failed-item-error-code [input] (clojure.core/get {"INVALID_ARN" :invalid-arn, "DUPLICATE_ARN" :duplicate-arn, "ITEM_DOES_NOT_EXIST" :item-does-not-exist, "ACCESS_DENIED" :access-denied, "LIMIT_EXCEEDED" :limit-exceeded, "INTERNAL_ERROR" :internal-error} input))

(clojure.core/defn- deser-severity [input] (clojure.core/get {"Low" :low, "Medium" :medium, "High" :high, "Informational" :informational, "Undefined" :undefined} input))

(clojure.core/defn- deser-finding [input] (clojure.core/cond-> {:arn (deser-arn (input "arn")), :attributes (deser-attribute-list (input "attributes")), :user-attributes (deser-user-attribute-list (input "userAttributes")), :created-at (deser-timestamp (input "createdAt")), :updated-at (deser-timestamp (input "updatedAt"))} (clojure.core/contains? input "assetType") (clojure.core/assoc :asset-type (deser-asset-type (input "assetType"))) (clojure.core/contains? input "confidence") (clojure.core/assoc :confidence (deser-ioc-confidence (input "confidence"))) (clojure.core/contains? input "serviceAttributes") (clojure.core/assoc :service-attributes (deser-inspector-service-attributes (input "serviceAttributes"))) (clojure.core/contains? input "indicatorOfCompromise") (clojure.core/assoc :indicator-of-compromise (deser-bool (input "indicatorOfCompromise"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-finding-id (input "id"))) (clojure.core/contains? input "recommendation") (clojure.core/assoc :recommendation (deser-text (input "recommendation"))) (clojure.core/contains? input "title") (clojure.core/assoc :title (deser-text (input "title"))) (clojure.core/contains? input "schemaVersion") (clojure.core/assoc :schema-version (deser-numeric-version (input "schemaVersion"))) (clojure.core/contains? input "service") (clojure.core/assoc :service (deser-service-name (input "service"))) (clojure.core/contains? input "severity") (clojure.core/assoc :severity (deser-severity (input "severity"))) (clojure.core/contains? input "assetAttributes") (clojure.core/assoc :asset-attributes (deser-asset-attributes (input "assetAttributes"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-text (input "description"))) (clojure.core/contains? input "numericSeverity") (clojure.core/assoc :numeric-severity (deser-numeric-severity (input "numericSeverity")))))

(clojure.core/defn- deser-assessment-run-state-change-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-assessment-run-state-change coll))) input))

(clojure.core/defn- deser-assessment-run-state-change [input] (clojure.core/cond-> {:state-changed-at (deser-timestamp (input "stateChangedAt")), :state (deser-assessment-run-state (input "state"))}))

(clojure.core/defn- deser-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute coll))) input))

(clojure.core/defn- deser-event-subscription-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-subscription coll))) input))

(clojure.core/defn- deser-assessment-run-state [input] (clojure.core/get {"COMPLETED" :completed, "CANCELED" :canceled, "COMPLETED_WITH_ERRORS" :completed-with-errors, "START_DATA_COLLECTION_PENDING" :start-data-collection-pending, "ERROR" :error, "START_DATA_COLLECTION_IN_PROGRESS" :start-data-collection-in-progress, "EVALUATING_RULES" :evaluating-rules, "DATA_COLLECTED" :data-collected, "STOP_DATA_COLLECTION_PENDING" :stop-data-collection-pending, "FAILED" :failed, "START_EVALUATING_RULES_PENDING" :start-evaluating-rules-pending, "COLLECTING_DATA" :collecting-data, "CREATED" :created} input))

(clojure.core/defn- deser-assessment-run-finding-counts [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-severity k) (deser-finding-count v)])) input))

(clojure.core/defn- deser-inspector-event [input] (clojure.core/get {"ASSESSMENT_RUN_STARTED" :assessment-run-started, "ASSESSMENT_RUN_COMPLETED" :assessment-run-completed, "ASSESSMENT_RUN_STATE_CHANGED" :assessment-run-state-changed, "FINDING_REPORTED" :finding-reported, "OTHER" :other} input))

(clojure.core/defn- deser-asset-type [input] (clojure.core/get {"ec2-instance" :ec-2instance} input))

(clojure.core/defn- deser-rules-package-name [input] input)

(clojure.core/defn- deser-user-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute coll))) input))

(clojure.core/defn- deser-numeric-severity [input] input)

(clojure.core/defn- deser-event-subscription [input] (clojure.core/cond-> {:event (deser-inspector-event (input "event")), :subscribed-at (deser-timestamp (input "subscribedAt"))}))

(clojure.core/defn- deser-assessment-template-rules-package-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn coll))) input))

(clojure.core/defn- deser-exclusion-preview [input] (clojure.core/cond-> {:title (deser-text (input "title")), :description (deser-text (input "description")), :recommendation (deser-text (input "recommendation")), :scopes (deser-scope-list (input "scopes"))} (clojure.core/contains? input "attributes") (clojure.core/assoc :attributes (deser-attribute-list (input "attributes")))))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-assessment-template [input] (clojure.core/cond-> {:arn (deser-arn (input "arn")), :name (deser-assessment-template-name (input "name")), :assessment-target-arn (deser-arn (input "assessmentTargetArn")), :duration-in-seconds (deser-assessment-run-duration (input "durationInSeconds")), :rules-package-arns (deser-assessment-template-rules-package-arn-list (input "rulesPackageArns")), :user-attributes-for-findings (deser-user-attribute-list (input "userAttributesForFindings")), :assessment-run-count (deser-arn-count (input "assessmentRunCount")), :created-at (deser-timestamp (input "createdAt"))} (clojure.core/contains? input "lastAssessmentRunArn") (clojure.core/assoc :last-assessment-run-arn (deser-arn (input "lastAssessmentRunArn")))))

(clojure.core/defn- deser-agent-health [input] (clojure.core/get {"HEALTHY" :healthy, "UNHEALTHY" :unhealthy, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-exclusion [input] (clojure.core/cond-> {:arn (deser-arn (input "arn")), :title (deser-text (input "title")), :description (deser-text (input "description")), :recommendation (deser-text (input "recommendation")), :scopes (deser-scope-list (input "scopes"))} (clojure.core/contains? input "attributes") (clojure.core/assoc :attributes (deser-attribute-list (input "attributes")))))

(clojure.core/defn- deser-agent-version [input] input)

(clojure.core/defn- deser-ipv-4-address [input] input)

(clojure.core/defn- deser-resource-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-group coll))) input))

(clojure.core/defn- deser-ioc-confidence [input] input)

(clojure.core/defn- deser-telemetry-metadata [input] (clojure.core/cond-> {:message-type (deser-message-type (input "messageType")), :count (deser-long (input "count"))} (clojure.core/contains? input "dataSize") (clojure.core/assoc :data-size (deser-long (input "dataSize")))))

(clojure.core/defn- deser-preview-status [input] (clojure.core/get {"WORK_IN_PROGRESS" :work-in-progress, "COMPLETED" :completed} input))

(clojure.core/defn- deser-assessment-run-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-assessment-run coll))) input))

(clojure.core/defn- deser-assessment-target-name [input] input)

(clojure.core/defn- deser-scope-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scope coll))) input))

(clojure.core/defn- deser-hostname [input] input)

(clojure.core/defn- deser-agent-already-running-assessment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-agent-already-running-assessment coll))) input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-attribute [input] (clojure.core/cond-> {:key (deser-attribute-key (input "key"))} (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-attribute-value (input "value")))))

(clojure.core/defn- deser-assessment-run-duration [input] input)

(clojure.core/defn- deser-assessment-run-notification-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-assessment-run-notification coll))) input))

(clojure.core/defn- deser-finding-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-finding coll))) input))

(clojure.core/defn- deser-assessment-target [input] (clojure.core/cond-> {:arn (deser-arn (input "arn")), :name (deser-assessment-target-name (input "name")), :created-at (deser-timestamp (input "createdAt")), :updated-at (deser-timestamp (input "updatedAt"))} (clojure.core/contains? input "resourceGroupArn") (clojure.core/assoc :resource-group-arn (deser-arn (input "resourceGroupArn")))))

(clojure.core/defn- deser-finding-count [input] input)

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-assessment-run-name [input] input)

(clojure.core/defn- deser-attribute-value [input] input)

(clojure.core/defn- deser-resource-group-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-group-tag coll))) input))

(clojure.core/defn- deser-limit-exceeded-error-code [input] (clojure.core/get {"ASSESSMENT_TARGET_LIMIT_EXCEEDED" :assessment-target-limit-exceeded, "ASSESSMENT_TEMPLATE_LIMIT_EXCEEDED" :assessment-template-limit-exceeded, "ASSESSMENT_RUN_LIMIT_EXCEEDED" :assessment-run-limit-exceeded, "RESOURCE_GROUP_LIMIT_EXCEEDED" :resource-group-limit-exceeded, "EVENT_SUBSCRIPTION_LIMIT_EXCEEDED" :event-subscription-limit-exceeded} input))

(clojure.core/defn- deser-agent-preview-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-agent-preview coll))) input))

(clojure.core/defn- deser-agent-id [input] input)

(clojure.core/defn- deser-ami-id [input] input)

(clojure.core/defn- deser-assessment-rules-package-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn coll))) input))

(clojure.core/defn- deser-rules-package-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rules-package coll))) input))

(clojure.core/defn- deser-subscription-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subscription coll))) input))

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-asset-attributes [input] (clojure.core/cond-> {:schema-version (deser-numeric-version (input "schemaVersion"))} (clojure.core/contains? input "agentId") (clojure.core/assoc :agent-id (deser-agent-id (input "agentId"))) (clojure.core/contains? input "autoScalingGroup") (clojure.core/assoc :auto-scaling-group (deser-auto-scaling-group (input "autoScalingGroup"))) (clojure.core/contains? input "amiId") (clojure.core/assoc :ami-id (deser-ami-id (input "amiId"))) (clojure.core/contains? input "hostname") (clojure.core/assoc :hostname (deser-hostname (input "hostname"))) (clojure.core/contains? input "ipv4Addresses") (clojure.core/assoc :ipv-4-addresses (deser-ipv-4-address-list (input "ipv4Addresses")))))

(clojure.core/defn- deser-scope-type [input] (clojure.core/get {"INSTANCE_ID" :instance-id, "RULES_PACKAGE_ARN" :rules-package-arn} input))

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-provider-name [input] input)

(clojure.core/defn- deser-arn-count [input] input)

(clojure.core/defn- deser-attribute-key [input] input)

(clojure.core/defn- deser-bool [input] input)

(clojure.core/defn- deser-auto-scaling-group [input] input)

(clojure.core/defn- deser-exclusion-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-arn k) (deser-exclusion v)])) input))

(clojure.core/defn- deser-assessment-run-in-progress-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn coll))) input))

(clojure.core/defn- deser-scope-value [input] input)

(clojure.core/defn- deser-assessment-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-assessment-target coll))) input))

(clojure.core/defn- deser-assessment-run-agent-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-assessment-run-agent coll))) input))

(clojure.core/defn- deser-telemetry-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-telemetry-metadata coll))) input))

(clojure.core/defn- deser-no-such-entity-error-code [input] (clojure.core/get {"ASSESSMENT_TARGET_DOES_NOT_EXIST" :assessment-target-does-not-exist, "ASSESSMENT_TEMPLATE_DOES_NOT_EXIST" :assessment-template-does-not-exist, "ASSESSMENT_RUN_DOES_NOT_EXIST" :assessment-run-does-not-exist, "FINDING_DOES_NOT_EXIST" :finding-does-not-exist, "RESOURCE_GROUP_DOES_NOT_EXIST" :resource-group-does-not-exist, "RULES_PACKAGE_DOES_NOT_EXIST" :rules-package-does-not-exist, "SNS_TOPIC_DOES_NOT_EXIST" :sns-topic-does-not-exist, "IAM_ROLE_DOES_NOT_EXIST" :iam-role-does-not-exist} input))

(clojure.core/defn- deser-failed-items [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-arn k) (deser-failed-item-details v)])) input))

(clojure.core/defn- deser-numeric-version [input] input)

(clojure.core/defn- deser-assessment-run-notification-sns-status-code [input] (clojure.core/get {"SUCCESS" :success, "TOPIC_DOES_NOT_EXIST" :topic-does-not-exist, "ACCESS_DENIED" :access-denied, "INTERNAL_ERROR" :internal-error} input))

(clojure.core/defn- deser-invalid-cross-account-role-error-code [input] (clojure.core/get {"ROLE_DOES_NOT_EXIST_OR_INVALID_TRUST_RELATIONSHIP" :role-does-not-exist-or-invalid-trust-relationship, "ROLE_DOES_NOT_HAVE_CORRECT_POLICY" :role-does-not-have-correct-policy} input))

(clojure.core/defn- deser-exclusion-preview-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-exclusion-preview coll))) input))

(clojure.core/defn- deser-finding-id [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-invalid-input-error-code [input] (clojure.core/get {"INVALID_RULES_PACKAGE_ARN" :invalid-rules-package-arn, "INVALID_NUMBER_OF_USER_ATTRIBUTES" :invalid-number-of-user-attributes, "INVALID_IAM_ROLE_ARN" :invalid-iam-role-arn, "INVALID_ASSESSMENT_TEMPLATE_DURATION" :invalid-assessment-template-duration, "INVALID_NUMBER_OF_ASSESSMENT_TARGET_ARNS" :invalid-number-of-assessment-target-arns, "INVALID_NUMBER_OF_ATTRIBUTES" :invalid-number-of-attributes, "INVALID_PAGINATION_TOKEN" :invalid-pagination-token, "INVALID_AUTO_SCALING_GROUP" :invalid-auto-scaling-group, "INVALID_NUMBER_OF_RULES_PACKAGE_ARNS" :invalid-number-of-rules-package-arns, "INVALID_NUMBER_OF_ASSESSMENT_RUN_ARNS" :invalid-number-of-assessment-run-arns, "INVALID_NUMBER_OF_AGENT_IDS" :invalid-number-of-agent-ids, "INVALID_ASSESSMENT_RUN_STATE_CHANGE_TIME_RANGE" :invalid-assessment-run-state-change-time-range, "INVALID_NUMBER_OF_RULE_NAMES" :invalid-number-of-rule-names, "INVALID_ASSESSMENT_TEMPLATE_DURATION_RANGE" :invalid-assessment-template-duration-range, "INVALID_NUMBER_OF_AUTO_SCALING_GROUPS" :invalid-number-of-auto-scaling-groups, "ASSESSMENT_TARGET_NAME_ALREADY_TAKEN" :assessment-target-name-already-taken, "INVALID_NUMBER_OF_RESOURCE_GROUP_TAGS" :invalid-number-of-resource-group-tags, "INVALID_LOCALE" :invalid-locale, "ASSESSMENT_TEMPLATE_NAME_ALREADY_TAKEN" :assessment-template-name-already-taken, "INVALID_RESOURCE_GROUP_ARN" :invalid-resource-group-arn, "INVALID_NUMBER_OF_FINDING_ARNS" :invalid-number-of-finding-arns, "INVALID_SNS_TOPIC_ARN" :invalid-sns-topic-arn, "INVALID_RESOURCE_GROUP_TAG_KEY" :invalid-resource-group-tag-key, "INVALID_ASSESSMENT_RUN_ARN" :invalid-assessment-run-arn, "INVALID_ASSESSMENT_TARGET_NAME" :invalid-assessment-target-name, "INVALID_MAX_RESULTS" :invalid-max-results, "INVALID_ATTRIBUTE" :invalid-attribute, "INVALID_NUMBER_OF_TAGS" :invalid-number-of-tags, "INVALID_RESOURCE_ARN" :invalid-resource-arn, "INVALID_ASSESSMENT_RUN_START_TIME_RANGE" :invalid-assessment-run-start-time-range, "INVALID_ASSESSMENT_TARGET_NAME_PATTERN" :invalid-assessment-target-name-pattern, "INVALID_TAG_KEY" :invalid-tag-key, "INVALID_AGENT_ID" :invalid-agent-id, "INVALID_ASSESSMENT_RUN_DURATION_RANGE" :invalid-assessment-run-duration-range, "INVALID_RESOURCE_GROUP_TAG_VALUE" :invalid-resource-group-tag-value, "INVALID_ASSESSMENT_TARGET_ARN" :invalid-assessment-target-arn, "INVALID_SEVERITY" :invalid-severity, "INVALID_TAG_VALUE" :invalid-tag-value, "INVALID_NUMBER_OF_SEVERITIES" :invalid-number-of-severities, "INVALID_USER_ATTRIBUTE" :invalid-user-attribute, "INVALID_TAG" :invalid-tag, "INVALID_NUMBER_OF_ASSESSMENT_RUN_STATES" :invalid-number-of-assessment-run-states, "INVALID_FINDING_ARN" :invalid-finding-arn, "INVALID_NUMBER_OF_ASSESSMENT_TEMPLATE_ARNS" :invalid-number-of-assessment-template-arns, "INVALID_USER_ATTRIBUTE_KEY" :invalid-user-attribute-key, "INVALID_RULE_NAME" :invalid-rule-name, "INVALID_USER_ATTRIBUTE_VALUE" :invalid-user-attribute-value, "INVALID_ASSESSMENT_TEMPLATE_ARN" :invalid-assessment-template-arn, "INVALID_ASSESSMENT_TEMPLATE_NAME" :invalid-assessment-template-name, "INVALID_EVENT" :invalid-event, "INVALID_ASSESSMENT_TEMPLATE_NAME_PATTERN" :invalid-assessment-template-name-pattern, "INVALID_NUMBER_OF_RESOURCE_GROUP_ARNS" :invalid-number-of-resource-group-arns, "INVALID_ASSESSMENT_RUN_COMPLETION_TIME_RANGE" :invalid-assessment-run-completion-time-range, "INVALID_ASSESSMENT_RUN_STATE" :invalid-assessment-run-state} input))

(clojure.core/defn- deser-message-type [input] input)

(clojure.core/defn- deser-assessment-run-agent [input] (clojure.core/cond-> {:agent-id (deser-agent-id (input "agentId")), :assessment-run-arn (deser-arn (input "assessmentRunArn")), :agent-health (deser-agent-health (input "agentHealth")), :agent-health-code (deser-agent-health-code (input "agentHealthCode")), :telemetry-metadata (deser-telemetry-metadata-list (input "telemetryMetadata"))} (clojure.core/contains? input "agentHealthDetails") (clojure.core/assoc :agent-health-details (deser-message (input "agentHealthDetails"))) (clojure.core/contains? input "autoScalingGroup") (clojure.core/assoc :auto-scaling-group (deser-auto-scaling-group (input "autoScalingGroup")))))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-assessment-run [input] (clojure.core/cond-> {:state-changes (deser-assessment-run-state-change-list (input "stateChanges")), :name (deser-assessment-run-name (input "name")), :state (deser-assessment-run-state (input "state")), :state-changed-at (deser-timestamp (input "stateChangedAt")), :data-collected (deser-bool (input "dataCollected")), :notifications (deser-assessment-run-notification-list (input "notifications")), :finding-counts (deser-assessment-run-finding-counts (input "findingCounts")), :rules-package-arns (deser-assessment-rules-package-arn-list (input "rulesPackageArns")), :duration-in-seconds (deser-assessment-run-duration (input "durationInSeconds")), :assessment-template-arn (deser-arn (input "assessmentTemplateArn")), :user-attributes-for-findings (deser-user-attribute-list (input "userAttributesForFindings")), :created-at (deser-timestamp (input "createdAt")), :arn (deser-arn (input "arn"))} (clojure.core/contains? input "startedAt") (clojure.core/assoc :started-at (deser-timestamp (input "startedAt"))) (clojure.core/contains? input "completedAt") (clojure.core/assoc :completed-at (deser-timestamp (input "completedAt")))))

(clojure.core/defn- deser-subscription [input] (clojure.core/cond-> {:resource-arn (deser-arn (input "resourceArn")), :topic-arn (deser-arn (input "topicArn")), :event-subscriptions (deser-event-subscription-list (input "eventSubscriptions"))}))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-agent-preview [input] (clojure.core/cond-> {:agent-id (deser-agent-id (input "agentId"))} (clojure.core/contains? input "hostname") (clojure.core/assoc :hostname (deser-hostname (input "hostname"))) (clojure.core/contains? input "autoScalingGroup") (clojure.core/assoc :auto-scaling-group (deser-auto-scaling-group (input "autoScalingGroup"))) (clojure.core/contains? input "agentHealth") (clojure.core/assoc :agent-health (deser-agent-health (input "agentHealth"))) (clojure.core/contains? input "agentVersion") (clojure.core/assoc :agent-version (deser-agent-version (input "agentVersion"))) (clojure.core/contains? input "operatingSystem") (clojure.core/assoc :operating-system (deser-operating-system (input "operatingSystem"))) (clojure.core/contains? input "kernelVersion") (clojure.core/assoc :kernel-version (deser-kernel-version (input "kernelVersion"))) (clojure.core/contains? input "ipv4Address") (clojure.core/assoc :ipv-4-address (deser-ipv-4-address (input "ipv4Address")))))

(clojure.core/defn- deser-text [input] input)

(clojure.core/defn- deser-rules-package [input] (clojure.core/cond-> {:arn (deser-arn (input "arn")), :name (deser-rules-package-name (input "name")), :version (deser-version (input "version")), :provider (deser-provider-name (input "provider"))} (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-text (input "description")))))

(clojure.core/defn- deser-ipv-4-address-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ipv-4-address coll))) input))

(clojure.core/defn- deser-service-name [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "key"))} (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-tag-value (input "value")))))

(clojure.core/defn- deser-version [input] input)

(clojure.core/defn- deser-agent-already-running-assessment [input] (clojure.core/cond-> {:agent-id (deser-agent-id (input "agentId")), :assessment-run-arn (deser-arn (input "assessmentRunArn"))}))

(clojure.core/defn- deser-failed-item-details [input] (clojure.core/cond-> {:failure-code (deser-failed-item-error-code (input "failureCode")), :retryable (deser-bool (input "retryable"))}))

(clojure.core/defn- deser-report-status [input] (clojure.core/get {"WORK_IN_PROGRESS" :work-in-progress, "FAILED" :failed, "COMPLETED" :completed} input))

(clojure.core/defn- deser-resource-group [input] (clojure.core/cond-> {:arn (deser-arn (input "arn")), :tags (deser-resource-group-tags (input "tags")), :created-at (deser-timestamp (input "createdAt"))}))

(clojure.core/defn- deser-assessment-run-notification [input] (clojure.core/cond-> {:date (deser-timestamp (input "date")), :event (deser-inspector-event (input "event")), :error (deser-bool (input "error"))} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "snsTopicArn") (clojure.core/assoc :sns-topic-arn (deser-arn (input "snsTopicArn"))) (clojure.core/contains? input "snsPublishStatusCode") (clojure.core/assoc :sns-publish-status-code (deser-assessment-run-notification-sns-status-code (input "snsPublishStatusCode")))))

(clojure.core/defn- deser-resource-group-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "key"))} (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-tag-value (input "value")))))

(clojure.core/defn- deser-assessment-template-name [input] input)

(clojure.core/defn- deser-agent-health-code [input] (clojure.core/get {"IDLE" :idle, "RUNNING" :running, "SHUTDOWN" :shutdown, "UNHEALTHY" :unhealthy, "THROTTLED" :throttled, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-list-returned-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn coll))) input))

(clojure.core/defn- deser-access-denied-error-code [input] (clojure.core/get {"ACCESS_DENIED_TO_ASSESSMENT_TARGET" :access-denied-to-assessment-target, "ACCESS_DENIED_TO_ASSESSMENT_TEMPLATE" :access-denied-to-assessment-template, "ACCESS_DENIED_TO_ASSESSMENT_RUN" :access-denied-to-assessment-run, "ACCESS_DENIED_TO_FINDING" :access-denied-to-finding, "ACCESS_DENIED_TO_RESOURCE_GROUP" :access-denied-to-resource-group, "ACCESS_DENIED_TO_RULES_PACKAGE" :access-denied-to-rules-package, "ACCESS_DENIED_TO_SNS_TOPIC" :access-denied-to-sns-topic, "ACCESS_DENIED_TO_IAM_ROLE" :access-denied-to-iam-role} input))

(clojure.core/defn- deser-inspector-service-attributes [input] (clojure.core/cond-> {:schema-version (deser-numeric-version (input "schemaVersion"))} (clojure.core/contains? input "assessmentRunArn") (clojure.core/assoc :assessment-run-arn (deser-arn (input "assessmentRunArn"))) (clojure.core/contains? input "rulesPackageArn") (clojure.core/assoc :rules-package-arn (deser-arn (input "rulesPackageArn")))))

(clojure.core/defn- deser-assessment-template-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-assessment-template coll))) input))

(clojure.core/defn- deser-scope [input] (clojure.core/cond-> {} (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-scope-type (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-scope-value (input "value")))))

(clojure.core/defn- deser-kernel-version [input] input)

(clojure.core/defn- deser-operating-system [input] input)

(clojure.core/defn- deser-uuid [input] input)

(clojure.core/defn- deser-add-attributes-to-findings-response [input] (clojure.core/cond-> {:failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-get-assessment-report-response [input] (clojure.core/cond-> {:status (deser-report-status (input "status"))} (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-url (input "url")))))

(clojure.core/defn- deser-describe-resource-groups-response [input] (clojure.core/cond-> {:resource-groups (deser-resource-group-list (input "resourceGroups")), :failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-list-assessment-run-agents-response [input] (clojure.core/cond-> {:assessment-run-agents (deser-assessment-run-agent-list (input "assessmentRunAgents"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-create-exclusions-preview-response [input] (clojure.core/cond-> {:preview-token (deser-uuid (input "previewToken"))}))

(clojure.core/defn- deser-list-tags-for-resource-response [input] (clojure.core/cond-> {:tags (deser-tag-list (input "tags"))}))

(clojure.core/defn- deser-describe-exclusions-response [input] (clojure.core/cond-> {:exclusions (deser-exclusion-map (input "exclusions")), :failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-invalid-cross-account-role-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :error-code (deser-invalid-cross-account-role-error-code (input "errorCode")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-no-such-entity-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :error-code (deser-no-such-entity-error-code (input "errorCode")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-get-exclusions-preview-response [input] (clojure.core/cond-> {:preview-status (deser-preview-status (input "previewStatus"))} (clojure.core/contains? input "exclusionPreviews") (clojure.core/assoc :exclusion-previews (deser-exclusion-preview-list (input "exclusionPreviews"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :error-code (deser-limit-exceeded-error-code (input "errorCode")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-describe-assessment-targets-response [input] (clojure.core/cond-> {:assessment-targets (deser-assessment-target-list (input "assessmentTargets")), :failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-unsupported-feature-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-start-assessment-run-response [input] (clojure.core/cond-> {:assessment-run-arn (deser-arn (input "assessmentRunArn"))}))

(clojure.core/defn- deser-describe-rules-packages-response [input] (clojure.core/cond-> {:rules-packages (deser-rules-package-list (input "rulesPackages")), :failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-describe-assessment-templates-response [input] (clojure.core/cond-> {:assessment-templates (deser-assessment-template-list (input "assessmentTemplates")), :failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-list-exclusions-response [input] (clojure.core/cond-> {:exclusion-arns (deser-list-returned-arn-list (input "exclusionArns"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-invalid-input-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :error-code (deser-invalid-input-error-code (input "errorCode")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-internal-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-service-temporarily-unavailable-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-access-denied-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :error-code (deser-access-denied-error-code (input "errorCode")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-list-event-subscriptions-response [input] (clojure.core/cond-> {:subscriptions (deser-subscription-list (input "subscriptions"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-list-assessment-runs-response [input] (clojure.core/cond-> {:assessment-run-arns (deser-list-returned-arn-list (input "assessmentRunArns"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-create-resource-group-response [input] (clojure.core/cond-> {:resource-group-arn (deser-arn (input "resourceGroupArn"))}))

(clojure.core/defn- deser-create-assessment-target-response [input] (clojure.core/cond-> {:assessment-target-arn (deser-arn (input "assessmentTargetArn"))}))

(clojure.core/defn- deser-list-assessment-targets-response [input] (clojure.core/cond-> {:assessment-target-arns (deser-list-returned-arn-list (input "assessmentTargetArns"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-agents-already-running-assessment-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :agents (deser-agent-already-running-assessment-list (input "agents")), :agents-truncated (deser-bool (input "agentsTruncated")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-describe-cross-account-access-role-response [input] (clojure.core/cond-> {:role-arn (deser-arn (input "roleArn")), :valid (deser-bool (input "valid")), :registered-at (deser-timestamp (input "registeredAt"))}))

(clojure.core/defn- deser-list-findings-response [input] (clojure.core/cond-> {:finding-arns (deser-list-returned-arn-list (input "findingArns"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-list-rules-packages-response [input] (clojure.core/cond-> {:rules-package-arns (deser-list-returned-arn-list (input "rulesPackageArns"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-create-assessment-template-response [input] (clojure.core/cond-> {:assessment-template-arn (deser-arn (input "assessmentTemplateArn"))}))

(clojure.core/defn- deser-list-assessment-templates-response [input] (clojure.core/cond-> {:assessment-template-arns (deser-list-returned-arn-list (input "assessmentTemplateArns"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-assessment-run-in-progress-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message")), :assessment-run-arns (deser-assessment-run-in-progress-arn-list (input "assessmentRunArns")), :assessment-run-arns-truncated (deser-bool (input "assessmentRunArnsTruncated")), :can-retry (deser-bool (input "canRetry"))}))

(clojure.core/defn- deser-remove-attributes-from-findings-response [input] (clojure.core/cond-> {:failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-preview-generation-in-progress-exception [input] (clojure.core/cond-> {:message (deser-error-message (input "message"))}))

(clojure.core/defn- deser-describe-findings-response [input] (clojure.core/cond-> {:findings (deser-finding-list (input "findings")), :failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-describe-assessment-runs-response [input] (clojure.core/cond-> {:assessment-runs (deser-assessment-run-list (input "assessmentRuns")), :failed-items (deser-failed-items (input "failedItems"))}))

(clojure.core/defn- deser-preview-agents-response [input] (clojure.core/cond-> {:agent-previews (deser-agent-preview-list (input "agentPreviews"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-get-telemetry-metadata-response [input] (clojure.core/cond-> {:telemetry-metadata (deser-telemetry-metadata-list (input "telemetryMetadata"))}))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.delete-assessment-target-request/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/delete-assessment-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.delete-assessment-target-request/assessment-target-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.add-attributes-to-findings-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/add-attributes-to-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.add-attributes-to-findings-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/failed-item-error-code #{:limit-exceeded :duplicate-arn "LIMIT_EXCEEDED" :invalid-arn :internal-error "ITEM_DOES_NOT_EXIST" "DUPLICATE_ARN" "ACCESS_DENIED" "INTERNAL_ERROR" "INVALID_ARN" :access-denied :item-does-not-exist})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/severity #{"Undefined" "Medium" :medium :high "High" :undefined :low "Low" :informational "Informational"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.update-assessment-target-request/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.update-assessment-target-request/assessment-target-name (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-target-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.update-assessment-target-request/resource-group-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/update-assessment-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.update-assessment-target-request/assessment-target-arn :portkey.aws.inspector.-2016-02-16.update-assessment-target-request/assessment-target-name] :opt-un [:portkey.aws.inspector.-2016-02-16.update-assessment-target-request/resource-group-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/asset-type (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/asset-type))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/confidence (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/ioc-confidence))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/updated-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/service-attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/inspector-service-attributes))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/created-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/indicator-of-compromise (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/id (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/finding-id))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/user-attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/recommendation (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/title (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/schema-version (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/numeric-version))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/service (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/service-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/severity (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/severity))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/asset-attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/asset-attributes))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/description (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding/numeric-severity (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/numeric-severity))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/finding (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.finding/arn :portkey.aws.inspector.-2016-02-16.finding/attributes :portkey.aws.inspector.-2016-02-16.finding/user-attributes :portkey.aws.inspector.-2016-02-16.finding/created-at :portkey.aws.inspector.-2016-02-16.finding/updated-at] :opt-un [:portkey.aws.inspector.-2016-02-16.finding/asset-type :portkey.aws.inspector.-2016-02-16.finding/confidence :portkey.aws.inspector.-2016-02-16.finding/service-attributes :portkey.aws.inspector.-2016-02-16.finding/indicator-of-compromise :portkey.aws.inspector.-2016-02-16.finding/id :portkey.aws.inspector.-2016-02-16.finding/recommendation :portkey.aws.inspector.-2016-02-16.finding/title :portkey.aws.inspector.-2016-02-16.finding/schema-version :portkey.aws.inspector.-2016-02-16.finding/service :portkey.aws.inspector.-2016-02-16.finding/severity :portkey.aws.inspector.-2016-02-16.finding/asset-attributes :portkey.aws.inspector.-2016-02-16.finding/description :portkey.aws.inspector.-2016-02-16.finding/numeric-severity]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-state-change-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/assessment-run-state-change :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/rule-name-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/rule-name :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-assessment-report-response/status (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/report-status))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-assessment-report-response/url (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/url))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/get-assessment-report-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.get-assessment-report-response/status] :opt-un [:portkey.aws.inspector.-2016-02-16.get-assessment-report-response/url]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-state-change/state-changed-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-state-change/state (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-state))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-state-change (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.assessment-run-state-change/state-changed-at :portkey.aws.inspector.-2016-02-16.assessment-run-state-change/state] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-resource-groups-response/resource-groups (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/resource-group-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-resource-groups-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-resource-groups-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-resource-groups-response/resource-groups :portkey.aws.inspector.-2016-02-16.describe-resource-groups-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/attribute-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/attribute :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/event-subscription-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/event-subscription :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-rules-packages-request/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-rules-packages-request/locale (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/locale))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-rules-packages-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-rules-packages-request/rules-package-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.describe-rules-packages-request/locale]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-response/assessment-run-agents (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-agent-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-assessment-run-agents-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-response/assessment-run-agents] :opt-un [:portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-state #{"COMPLETED" "CANCELED" :stop-data-collection-pending :start-evaluating-rules-pending :completed "COMPLETED_WITH_ERRORS" :created "START_DATA_COLLECTION_PENDING" :start-data-collection-pending "ERROR" :start-data-collection-in-progress "START_DATA_COLLECTION_IN_PROGRESS" "EVALUATING_RULES" :collecting-data "DATA_COLLECTED" :data-collected :canceled "STOP_DATA_COLLECTION_PENDING" "FAILED" :error "START_EVALUATING_RULES_PENDING" :completed-with-errors "COLLECTING_DATA" :evaluating-rules :failed "CREATED"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-exclusions-preview-response/preview-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/uuid))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/create-exclusions-preview-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.create-exclusions-preview-response/preview-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-finding-counts (clojure.spec.alpha/map-of :portkey.aws.inspector.-2016-02-16/severity :portkey.aws.inspector.-2016-02-16/finding-count))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-assessment-report-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-assessment-report-request/report-file-format (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/report-file-format))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-assessment-report-request/report-type (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/report-type))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/get-assessment-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.get-assessment-report-request/assessment-run-arn :portkey.aws.inspector.-2016-02-16.get-assessment-report-request/report-file-format :portkey.aws.inspector.-2016-02-16.get-assessment-report-request/report-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/tag-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-tags-for-resource-response/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/locale #{"EN_US" :en-us})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-telemetry-metadata-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/get-telemetry-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.get-telemetry-metadata-request/assessment-run-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-templates-request/assessment-template-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-assessment-templates-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-assessment-templates-request/assessment-template-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-exclusions-response/exclusions (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/exclusion-map))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-exclusions-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-exclusions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-exclusions-response/exclusions :portkey.aws.inspector.-2016-02-16.describe-exclusions-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.invalid-cross-account-role-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.invalid-cross-account-role-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/invalid-cross-account-role-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.invalid-cross-account-role-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/invalid-cross-account-role-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.invalid-cross-account-role-exception/message :portkey.aws.inspector.-2016-02-16.invalid-cross-account-role-exception/error-code :portkey.aws.inspector.-2016-02-16.invalid-cross-account-role-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-state-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/assessment-run-state :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/inspector-event #{"FINDING_REPORTED" "ASSESSMENT_RUN_COMPLETED" "ASSESSMENT_RUN_STARTED" :other :assessment-run-started "ASSESSMENT_RUN_STATE_CHANGED" :finding-reported "OTHER" :assessment-run-completed :assessment-run-state-changed})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/asset-type #{"ec2-instance" :ec-2instance})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-exclusions-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-exclusions-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-exclusions-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-exclusions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-exclusions-request/assessment-run-arn] :opt-un [:portkey.aws.inspector.-2016-02-16.list-exclusions-request/next-token :portkey.aws.inspector.-2016-02-16.list-exclusions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/rules-package-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.no-such-entity-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.no-such-entity-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/no-such-entity-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.no-such-entity-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/no-such-entity-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.no-such-entity-exception/message :portkey.aws.inspector.-2016-02-16.no-such-entity-exception/error-code :portkey.aws.inspector.-2016-02-16.no-such-entity-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/user-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/attribute :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/numeric-severity clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.event-subscription/event (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/inspector-event))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.event-subscription/subscribed-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/event-subscription (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.event-subscription/event :portkey.aws.inspector.-2016-02-16.event-subscription/subscribed-at] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-template-rules-package-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-request/filter (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-assessment-run-agents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-request/assessment-run-arn] :opt-un [:portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-request/filter :portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-request/next-token :portkey.aws.inspector.-2016-02-16.list-assessment-run-agents-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-templates-request/assessment-target-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-parent-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-templates-request/filter (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-template-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-templates-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-templates-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-assessment-templates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.list-assessment-templates-request/assessment-target-arns :portkey.aws.inspector.-2016-02-16.list-assessment-templates-request/filter :portkey.aws.inspector.-2016-02-16.list-assessment-templates-request/next-token :portkey.aws.inspector.-2016-02-16.list-assessment-templates-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-response/preview-status (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/preview-status))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-response/exclusion-previews (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/exclusion-preview-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/get-exclusions-preview-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.get-exclusions-preview-response/preview-status] :opt-un [:portkey.aws.inspector.-2016-02-16.get-exclusions-preview-response/exclusion-previews :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion-preview/title (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion-preview/description (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion-preview/recommendation (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion-preview/scopes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/scope-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion-preview/attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/exclusion-preview (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.exclusion-preview/title :portkey.aws.inspector.-2016-02-16.exclusion-preview/description :portkey.aws.inspector.-2016-02-16.exclusion-preview/recommendation :portkey.aws.inspector.-2016-02-16.exclusion-preview/scopes] :opt-un [:portkey.aws.inspector.-2016-02-16.exclusion-preview/attributes]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/last-assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-template-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/created-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/user-attributes-for-findings (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/name (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-template-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template/assessment-run-count (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn-count))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-template (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.assessment-template/arn :portkey.aws.inspector.-2016-02-16.assessment-template/name :portkey.aws.inspector.-2016-02-16.assessment-template/assessment-target-arn :portkey.aws.inspector.-2016-02-16.assessment-template/duration-in-seconds :portkey.aws.inspector.-2016-02-16.assessment-template/rules-package-arns :portkey.aws.inspector.-2016-02-16.assessment-template/user-attributes-for-findings :portkey.aws.inspector.-2016-02-16.assessment-template/assessment-run-count :portkey.aws.inspector.-2016-02-16.assessment-template/created-at] :opt-un [:portkey.aws.inspector.-2016-02-16.assessment-template/last-assessment-run-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-health #{"UNKNOWN" :unknown :unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 300))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.limit-exceeded-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/limit-exceeded-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.limit-exceeded-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.limit-exceeded-exception/message :portkey.aws.inspector.-2016-02-16.limit-exceeded-exception/error-code :portkey.aws.inspector.-2016-02-16.limit-exceeded-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template-filter/name-pattern (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/name-pattern))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template-filter/duration-range (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/duration-range))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-template-filter/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/filter-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-template-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.assessment-template-filter/name-pattern :portkey.aws.inspector.-2016-02-16.assessment-template-filter/duration-range :portkey.aws.inspector.-2016-02-16.assessment-template-filter/rules-package-arns]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-targets-response/assessment-targets (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-target-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-targets-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-assessment-targets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-assessment-targets-response/assessment-targets :portkey.aws.inspector.-2016-02-16.describe-assessment-targets-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion/arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion/title (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion/description (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion/recommendation (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion/scopes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/scope-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.exclusion/attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/exclusion (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.exclusion/arn :portkey.aws.inspector.-2016-02-16.exclusion/title :portkey.aws.inspector.-2016-02-16.exclusion/description :portkey.aws.inspector.-2016-02-16.exclusion/recommendation :portkey.aws.inspector.-2016-02-16.exclusion/scopes] :opt-un [:portkey.aws.inspector.-2016-02-16.exclusion/attributes]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/batch-describe-exclusions-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.stop-assessment-run-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.stop-assessment-run-request/stop-action (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/stop-action))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/stop-assessment-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.stop-assessment-run-request/assessment-run-arn] :opt-un [:portkey.aws.inspector.-2016-02-16.stop-assessment-run-request/stop-action]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/ipv-4-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 7 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/auto-scaling-group-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/auto-scaling-group :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/resource-group-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/resource-group :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.start-assessment-run-request/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.start-assessment-run-request/assessment-run-name (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/start-assessment-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.start-assessment-run-request/assessment-template-arn] :opt-un [:portkey.aws.inspector.-2016-02-16.start-assessment-run-request/assessment-run-name]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/ioc-confidence (clojure.spec.alpha/int-in 0 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-id-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/agent-id :min-count 0 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.unsupported-feature-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.unsupported-feature-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/unsupported-feature-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.unsupported-feature-exception/message :portkey.aws.inspector.-2016-02-16.unsupported-feature-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.telemetry-metadata/message-type (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/message-type))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.telemetry-metadata/count (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/long))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.telemetry-metadata/data-size (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/long))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/telemetry-metadata (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.telemetry-metadata/message-type :portkey.aws.inspector.-2016-02-16.telemetry-metadata/count] :opt-un [:portkey.aws.inspector.-2016-02-16.telemetry-metadata/data-size]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/preview-status #{"COMPLETED" :work-in-progress :completed "WORK_IN_PROGRESS"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/assessment-run :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-target-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/scope-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/scope :min-count 1))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-already-running-assessment-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/agent-already-running-assessment :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.start-assessment-run-response/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/start-assessment-run-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.start-assessment-run-response/assessment-run-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.attribute/key (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/attribute-key))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.attribute/value (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/attribute-value))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.attribute/key] :opt-un [:portkey.aws.inspector.-2016-02-16.attribute/value]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/preview-agents-max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-duration (clojure.spec.alpha/int-in 180 86400))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-notification-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/assessment-run-notification :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-findings-request/assessment-run-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-parent-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-findings-request/filter (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/finding-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-findings-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-findings-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-findings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.list-findings-request/assessment-run-arns :portkey.aws.inspector.-2016-02-16.list-findings-request/filter :portkey.aws.inspector.-2016-02-16.list-findings-request/next-token :portkey.aws.inspector.-2016-02-16.list-findings-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-rules-packages-response/rules-packages (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/rules-package-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-rules-packages-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-rules-packages-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-rules-packages-response/rules-packages :portkey.aws.inspector.-2016-02-16.describe-rules-packages-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/add-remove-attributes-finding-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-templates-response/assessment-templates (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-template-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-templates-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-assessment-templates-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-assessment-templates-response/assessment-templates :portkey.aws.inspector.-2016-02-16.describe-assessment-templates-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/finding-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/finding :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-target/arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-target/name (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-target-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-target/resource-group-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-target/created-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-target/updated-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-target (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.assessment-target/arn :portkey.aws.inspector.-2016-02-16.assessment-target/name :portkey.aws.inspector.-2016-02-16.assessment-target/created-at :portkey.aws.inspector.-2016-02-16.assessment-target/updated-at] :opt-un [:portkey.aws.inspector.-2016-02-16.assessment-target/resource-group-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-health-code-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/agent-health-code :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/finding-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/tag-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/tag :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-runs-request/assessment-template-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-parent-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-runs-request/filter (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-runs-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-runs-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-assessment-runs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.list-assessment-runs-request/assessment-template-arns :portkey.aws.inspector.-2016-02-16.list-assessment-runs-request/filter :portkey.aws.inspector.-2016-02-16.list-assessment-runs-request/next-token :portkey.aws.inspector.-2016-02-16.list-assessment-runs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.add-attributes-to-findings-request/finding-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/add-remove-attributes-finding-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.add-attributes-to-findings-request/attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/add-attributes-to-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.add-attributes-to-findings-request/finding-arns :portkey.aws.inspector.-2016-02-16.add-attributes-to-findings-request/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/filter-rules-package-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-resource-groups-request/resource-group-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-resource-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-resource-groups-request/resource-group-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/resource-group-tags (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/resource-group-tag :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-rules-packages-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-rules-packages-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-rules-packages-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.list-rules-packages-request/next-token :portkey.aws.inspector.-2016-02-16.list-rules-packages-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/limit-exceeded-error-code #{"EVENT_SUBSCRIPTION_LIMIT_EXCEEDED" "ASSESSMENT_TEMPLATE_LIMIT_EXCEEDED" :event-subscription-limit-exceeded :assessment-run-limit-exceeded :resource-group-limit-exceeded :assessment-target-limit-exceeded :assessment-template-limit-exceeded "RESOURCE_GROUP_LIMIT_EXCEEDED" "ASSESSMENT_TARGET_LIMIT_EXCEEDED" "ASSESSMENT_RUN_LIMIT_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-preview-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/agent-preview :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/ami-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-exclusions-response/exclusion-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-exclusions-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-exclusions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-exclusions-response/exclusion-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.list-exclusions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-rules-package-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/rules-package-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/rules-package :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/subscription-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/subscription :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-targets-request/filter (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-target-filter))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-targets-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-targets-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-assessment-targets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.list-assessment-targets-request/filter :portkey.aws.inspector.-2016-02-16.list-assessment-targets-request/next-token :portkey.aws.inspector.-2016-02-16.list-assessment-targets-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.remove-attributes-from-findings-request/finding-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/add-remove-attributes-finding-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.remove-attributes-from-findings-request/attribute-keys (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/user-attribute-key-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/remove-attributes-from-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.remove-attributes-from-findings-request/finding-arns :portkey.aws.inspector.-2016-02-16.remove-attributes-from-findings-request/attribute-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.asset-attributes/schema-version (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/numeric-version))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.asset-attributes/agent-id (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-id))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.asset-attributes/auto-scaling-group (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/auto-scaling-group))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.asset-attributes/ami-id (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/ami-id))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.asset-attributes/hostname (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/hostname))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.asset-attributes/ipv-4-addresses (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/ipv-4-address-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/asset-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.asset-attributes/schema-version] :opt-un [:portkey.aws.inspector.-2016-02-16.asset-attributes/agent-id :portkey.aws.inspector.-2016-02-16.asset-attributes/auto-scaling-group :portkey.aws.inspector.-2016-02-16.asset-attributes/ami-id :portkey.aws.inspector.-2016-02-16.asset-attributes/hostname :portkey.aws.inspector.-2016-02-16.asset-attributes/ipv-4-addresses]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-target-filter/assessment-target-name-pattern (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/name-pattern))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-target-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.assessment-target-filter/assessment-target-name-pattern]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.invalid-input-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/invalid-input-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.invalid-input-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/invalid-input-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.invalid-input-exception/message :portkey.aws.inspector.-2016-02-16.invalid-input-exception/error-code :portkey.aws.inspector.-2016-02-16.invalid-input-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/scope-type #{"INSTANCE_ID" :rules-package-arn :instance-id "RULES_PACKAGE_ARN"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/arn-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-filter/name-pattern (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/name-pattern))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-filter/states (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-state-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-filter/duration-range (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/duration-range))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-filter/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/filter-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-filter/start-time-range (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp-range))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-filter/completion-time-range (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp-range))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-filter/state-change-time-range (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp-range))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.assessment-run-filter/name-pattern :portkey.aws.inspector.-2016-02-16.assessment-run-filter/states :portkey.aws.inspector.-2016-02-16.assessment-run-filter/duration-range :portkey.aws.inspector.-2016-02-16.assessment-run-filter/rules-package-arns :portkey.aws.inspector.-2016-02-16.assessment-run-filter/start-time-range :portkey.aws.inspector.-2016-02-16.assessment-run-filter/completion-time-range :portkey.aws.inspector.-2016-02-16.assessment-run-filter/state-change-time-range]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-template-request/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-template-request/assessment-template-name (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-template-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-template-request/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-template-request/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-template-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-template-request/user-attributes-for-findings (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/create-assessment-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.create-assessment-template-request/assessment-target-arn :portkey.aws.inspector.-2016-02-16.create-assessment-template-request/assessment-template-name :portkey.aws.inspector.-2016-02-16.create-assessment-template-request/duration-in-seconds :portkey.aws.inspector.-2016-02-16.create-assessment-template-request/rules-package-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.create-assessment-template-request/user-attributes-for-findings]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.timestamp-range/begin-date (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.timestamp-range/end-date (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/timestamp-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.timestamp-range/begin-date :portkey.aws.inspector.-2016-02-16.timestamp-range/end-date]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/bool clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.internal-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.internal-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/internal-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.internal-exception/message :portkey.aws.inspector.-2016-02-16.internal-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.service-temporarily-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.service-temporarily-unavailable-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.service-temporarily-unavailable-exception/message :portkey.aws.inspector.-2016-02-16.service-temporarily-unavailable-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/auto-scaling-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/exclusion-map (clojure.spec.alpha/map-of :portkey.aws.inspector.-2016-02-16/arn :portkey.aws.inspector.-2016-02-16/exclusion))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.access-denied-exception/error-code (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/access-denied-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.access-denied-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/access-denied-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.access-denied-exception/message :portkey.aws.inspector.-2016-02-16.access-denied-exception/error-code :portkey.aws.inspector.-2016-02-16.access-denied-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-in-progress-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-event-subscriptions-response/subscriptions (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/subscription-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-event-subscriptions-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-event-subscriptions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-event-subscriptions-response/subscriptions] :opt-un [:portkey.aws.inspector.-2016-02-16.list-event-subscriptions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/scope-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/batch-describe-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/report-file-format #{:pdf "HTML" "PDF" :html})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-target-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/assessment-target :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-agent-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/assessment-run-agent :min-count 0 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/telemetry-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/telemetry-metadata :min-count 0 :max-count 5000))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/no-such-entity-error-code #{"RULES_PACKAGE_DOES_NOT_EXIST" :assessment-target-does-not-exist :iam-role-does-not-exist :rules-package-does-not-exist :finding-does-not-exist :resource-group-does-not-exist :assessment-run-does-not-exist "ASSESSMENT_TARGET_DOES_NOT_EXIST" "FINDING_DOES_NOT_EXIST" :assessment-template-does-not-exist "SNS_TOPIC_DOES_NOT_EXIST" "IAM_ROLE_DOES_NOT_EXIST" "RESOURCE_GROUP_DOES_NOT_EXIST" :sns-topic-does-not-exist "ASSESSMENT_TEMPLATE_DOES_NOT_EXIST" "ASSESSMENT_RUN_DOES_NOT_EXIST"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-event-subscriptions-max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/report-type #{:full "FULL" "FINDING" :finding})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/failed-items (clojure.spec.alpha/map-of :portkey.aws.inspector.-2016-02-16/arn :portkey.aws.inspector.-2016-02-16/failed-item-details))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-runs-response/assessment-run-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-runs-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-assessment-runs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-assessment-runs-response/assessment-run-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.list-assessment-runs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/numeric-version (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-resource-group-response/resource-group-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/create-resource-group-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.create-resource-group-response/resource-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-runs-request/assessment-run-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-assessment-runs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-assessment-runs-request/assessment-run-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-notification-sns-status-code #{"SUCCESS" "TOPIC_DOES_NOT_EXIST" :internal-error "ACCESS_DENIED" "INTERNAL_ERROR" :success :topic-does-not-exist :access-denied})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/invalid-cross-account-role-error-code #{:role-does-not-exist-or-invalid-trust-relationship "ROLE_DOES_NOT_HAVE_CORRECT_POLICY" :role-does-not-have-correct-policy "ROLE_DOES_NOT_EXIST_OR_INVALID_TRUST_RELATIONSHIP"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/severity-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/severity :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-target-response/assessment-target-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/create-assessment-target-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.create-assessment-target-response/assessment-target-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-event-subscriptions-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-event-subscriptions-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-event-subscriptions-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-event-subscriptions-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-event-subscriptions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.list-event-subscriptions-request/resource-arn :portkey.aws.inspector.-2016-02-16.list-event-subscriptions-request/next-token :portkey.aws.inspector.-2016-02-16.list-event-subscriptions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/exclusion-preview-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/exclusion-preview :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/finding-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 300))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/preview-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/uuid))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/locale (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/locale))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/get-exclusions-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/assessment-template-arn :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/preview-token] :opt-un [:portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/next-token :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/max-results :portkey.aws.inspector.-2016-02-16.get-exclusions-preview-request/locale]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/invalid-input-error-code #{"INVALID_RULES_PACKAGE_ARN" :invalid-assessment-run-start-time-range "INVALID_NUMBER_OF_USER_ATTRIBUTES" :invalid-attribute :invalid-user-attribute :invalid-assessment-run-arn "INVALID_IAM_ROLE_ARN" "INVALID_ASSESSMENT_TEMPLATE_DURATION" "INVALID_NUMBER_OF_ASSESSMENT_TARGET_ARNS" "INVALID_NUMBER_OF_ATTRIBUTES" "INVALID_PAGINATION_TOKEN" :invalid-resource-group-tag-value "INVALID_AUTO_SCALING_GROUP" :assessment-template-name-already-taken "INVALID_NUMBER_OF_RULES_PACKAGE_ARNS" :invalid-resource-arn :invalid-event :invalid-number-of-assessment-target-arns :invalid-rule-name "INVALID_NUMBER_OF_ASSESSMENT_RUN_ARNS" "INVALID_NUMBER_OF_AGENT_IDS" "INVALID_ASSESSMENT_RUN_STATE_CHANGE_TIME_RANGE" :invalid-assessment-template-duration-range :invalid-tag-key :invalid-assessment-run-duration-range "INVALID_NUMBER_OF_RULE_NAMES" "INVALID_ASSESSMENT_TEMPLATE_DURATION_RANGE" "INVALID_NUMBER_OF_AUTO_SCALING_GROUPS" "ASSESSMENT_TARGET_NAME_ALREADY_TAKEN" :invalid-user-attribute-key :invalid-number-of-rule-names "INVALID_NUMBER_OF_RESOURCE_GROUP_TAGS" :invalid-number-of-resource-group-arns :invalid-auto-scaling-group :invalid-number-of-assessment-run-arns "INVALID_LOCALE" :invalid-finding-arn "ASSESSMENT_TEMPLATE_NAME_ALREADY_TAKEN" :invalid-number-of-agent-ids "INVALID_RESOURCE_GROUP_ARN" "INVALID_NUMBER_OF_FINDING_ARNS" :invalid-number-of-attributes "INVALID_SNS_TOPIC_ARN" "INVALID_RESOURCE_GROUP_TAG_KEY" :invalid-user-attribute-value "INVALID_ASSESSMENT_RUN_ARN" :invalid-resource-group-tag-key "INVALID_ASSESSMENT_TARGET_NAME" "INVALID_MAX_RESULTS" "INVALID_ATTRIBUTE" "INVALID_NUMBER_OF_TAGS" :invalid-assessment-target-name-pattern :invalid-assessment-target-name "INVALID_RESOURCE_ARN" "INVALID_ASSESSMENT_RUN_START_TIME_RANGE" "INVALID_ASSESSMENT_TARGET_NAME_PATTERN" "INVALID_TAG_KEY" "INVALID_AGENT_ID" :invalid-tag "INVALID_ASSESSMENT_RUN_DURATION_RANGE" "INVALID_RESOURCE_GROUP_TAG_VALUE" :invalid-number-of-rules-package-arns "INVALID_ASSESSMENT_TARGET_ARN" :invalid-assessment-target-arn "INVALID_SEVERITY" :invalid-resource-group-arn :invalid-number-of-assessment-template-arns "INVALID_TAG_VALUE" :invalid-iam-role-arn "INVALID_NUMBER_OF_SEVERITIES" :invalid-rules-package-arn :invalid-locale :invalid-number-of-user-attributes "INVALID_USER_ATTRIBUTE" "INVALID_TAG" :invalid-assessment-run-state :invalid-agent-id :invalid-assessment-template-name :invalid-number-of-assessment-run-states "INVALID_NUMBER_OF_ASSESSMENT_RUN_STATES" "INVALID_FINDING_ARN" :invalid-assessment-template-duration :invalid-max-results :invalid-number-of-tags "INVALID_NUMBER_OF_ASSESSMENT_TEMPLATE_ARNS" "INVALID_USER_ATTRIBUTE_KEY" :invalid-pagination-token :invalid-assessment-run-completion-time-range :invalid-number-of-finding-arns :invalid-assessment-template-arn "INVALID_RULE_NAME" "INVALID_USER_ATTRIBUTE_VALUE" "INVALID_ASSESSMENT_TEMPLATE_ARN" :invalid-number-of-resource-group-tags "INVALID_ASSESSMENT_TEMPLATE_NAME" :invalid-number-of-auto-scaling-groups :invalid-severity :invalid-sns-topic-arn "INVALID_EVENT" "INVALID_ASSESSMENT_TEMPLATE_NAME_PATTERN" :invalid-assessment-run-state-change-time-range :invalid-number-of-severities "INVALID_NUMBER_OF_RESOURCE_GROUP_ARNS" :invalid-tag-value "INVALID_ASSESSMENT_RUN_COMPLETION_TIME_RANGE" :assessment-target-name-already-taken "INVALID_ASSESSMENT_RUN_STATE" :invalid-assessment-template-name-pattern})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 300))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-targets-response/assessment-target-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-targets-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-assessment-targets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-assessment-targets-response/assessment-target-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.list-assessment-targets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-agent/agent-id (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-id))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-agent/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-agent/agent-health (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-health))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-agent/agent-health-code (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-health-code))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-agent/agent-health-details (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-agent/auto-scaling-group (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/auto-scaling-group))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-agent/telemetry-metadata (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/telemetry-metadata-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-agent (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.assessment-run-agent/agent-id :portkey.aws.inspector.-2016-02-16.assessment-run-agent/assessment-run-arn :portkey.aws.inspector.-2016-02-16.assessment-run-agent/agent-health :portkey.aws.inspector.-2016-02-16.assessment-run-agent/agent-health-code :portkey.aws.inspector.-2016-02-16.assessment-run-agent/telemetry-metadata] :opt-un [:portkey.aws.inspector.-2016-02-16.assessment-run-agent/agent-health-details :portkey.aws.inspector.-2016-02-16.assessment-run-agent/auto-scaling-group]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/user-attribute-key-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/attribute-key :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.duration-range/min-seconds (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.duration-range/max-seconds (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/duration-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.duration-range/min-seconds :portkey.aws.inspector.-2016-02-16.duration-range/max-seconds]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-filter/agent-healths (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-health-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-filter/agent-health-codes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-health-code-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.agent-filter/agent-healths :portkey.aws.inspector.-2016-02-16.agent-filter/agent-health-codes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/data-collected (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/notifications (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-notification-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/created-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/user-attributes-for-findings (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/user-attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/started-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/finding-counts (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-finding-counts))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/completed-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/name (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/state-changes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-state-change-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-duration))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/state (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-state))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/state-changed-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.assessment-run/arn :portkey.aws.inspector.-2016-02-16.assessment-run/name :portkey.aws.inspector.-2016-02-16.assessment-run/assessment-template-arn :portkey.aws.inspector.-2016-02-16.assessment-run/state :portkey.aws.inspector.-2016-02-16.assessment-run/duration-in-seconds :portkey.aws.inspector.-2016-02-16.assessment-run/rules-package-arns :portkey.aws.inspector.-2016-02-16.assessment-run/user-attributes-for-findings :portkey.aws.inspector.-2016-02-16.assessment-run/created-at :portkey.aws.inspector.-2016-02-16.assessment-run/state-changed-at :portkey.aws.inspector.-2016-02-16.assessment-run/data-collected :portkey.aws.inspector.-2016-02-16.assessment-run/state-changes :portkey.aws.inspector.-2016-02-16.assessment-run/notifications :portkey.aws.inspector.-2016-02-16.assessment-run/finding-counts] :opt-un [:portkey.aws.inspector.-2016-02-16.assessment-run/started-at :portkey.aws.inspector.-2016-02-16.assessment-run/completed-at]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-findings-request/finding-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-findings-request/locale (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/locale))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-findings-request/finding-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.describe-findings-request/locale]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.preview-agents-request/preview-agents-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.preview-agents-request/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.preview-agents-request/max-results (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/preview-agents-max-results))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/preview-agents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.preview-agents-request/preview-agents-arn] :opt-un [:portkey.aws.inspector.-2016-02-16.preview-agents-request/next-token :portkey.aws.inspector.-2016-02-16.preview-agents-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agents-already-running-assessment-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agents-already-running-assessment-exception/agents (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-already-running-assessment-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agents-already-running-assessment-exception/agents-truncated (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agents-already-running-assessment-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agents-already-running-assessment-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.agents-already-running-assessment-exception/message :portkey.aws.inspector.-2016-02-16.agents-already-running-assessment-exception/agents :portkey.aws.inspector.-2016-02-16.agents-already-running-assessment-exception/agents-truncated :portkey.aws.inspector.-2016-02-16.agents-already-running-assessment-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.subscription/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.subscription/topic-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.subscription/event-subscriptions (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/event-subscription-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/subscription (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.subscription/resource-arn :portkey.aws.inspector.-2016-02-16.subscription/topic-arn :portkey.aws.inspector.-2016-02-16.subscription/event-subscriptions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-preview/hostname (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/hostname))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-preview/agent-id (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-id))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-preview/auto-scaling-group (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/auto-scaling-group))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-preview/agent-health (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-health))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-preview/agent-version (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-version))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-preview/operating-system (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/operating-system))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-preview/kernel-version (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/kernel-version))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-preview/ipv-4-address (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/ipv-4-address))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-preview (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.agent-preview/agent-id] :opt-un [:portkey.aws.inspector.-2016-02-16.agent-preview/hostname :portkey.aws.inspector.-2016-02-16.agent-preview/auto-scaling-group :portkey.aws.inspector.-2016-02-16.agent-preview/agent-health :portkey.aws.inspector.-2016-02-16.agent-preview/agent-version :portkey.aws.inspector.-2016-02-16.agent-preview/operating-system :portkey.aws.inspector.-2016-02-16.agent-preview/kernel-version :portkey.aws.inspector.-2016-02-16.agent-preview/ipv-4-address]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-parent-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 20000))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-cross-account-access-role-response/role-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-cross-account-access-role-response/valid (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-cross-account-access-role-response/registered-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-cross-account-access-role-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-cross-account-access-role-response/role-arn :portkey.aws.inspector.-2016-02-16.describe-cross-account-access-role-response/valid :portkey.aws.inspector.-2016-02-16.describe-cross-account-access-role-response/registered-at] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.rules-package/arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.rules-package/name (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/rules-package-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.rules-package/version (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/version))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.rules-package/provider (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/provider-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.rules-package/description (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/text))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/rules-package (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.rules-package/arn :portkey.aws.inspector.-2016-02-16.rules-package/name :portkey.aws.inspector.-2016-02-16.rules-package/version :portkey.aws.inspector.-2016-02-16.rules-package/provider] :opt-un [:portkey.aws.inspector.-2016-02-16.rules-package/description]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.unsubscribe-from-event-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.unsubscribe-from-event-request/event (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/inspector-event))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.unsubscribe-from-event-request/topic-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/unsubscribe-from-event-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.unsubscribe-from-event-request/resource-arn :portkey.aws.inspector.-2016-02-16.unsubscribe-from-event-request/event :portkey.aws.inspector.-2016-02-16.unsubscribe-from-event-request/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/ipv-4-address-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/ipv-4-address :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.subscribe-to-event-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.subscribe-to-event-request/event (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/inspector-event))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.subscribe-to-event-request/topic-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/subscribe-to-event-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.subscribe-to-event-request/resource-arn :portkey.aws.inspector.-2016-02-16.subscribe-to-event-request/event :portkey.aws.inspector.-2016-02-16.subscribe-to-event-request/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-findings-response/finding-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-findings-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-findings-response/finding-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.list-findings-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-rules-packages-response/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-rules-packages-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-rules-packages-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-rules-packages-response/rules-package-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.list-rules-packages-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/service-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.tag/key (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/tag-key))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.tag/value (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/tag-value))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.tag/key] :opt-un [:portkey.aws.inspector.-2016-02-16.tag/value]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-already-running-assessment/agent-id (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-id))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.agent-already-running-assessment/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-already-running-assessment (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.agent-already-running-assessment/agent-id :portkey.aws.inspector.-2016-02-16.agent-already-running-assessment/assessment-run-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-health-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/agent-health :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.register-cross-account-access-role-request/role-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/register-cross-account-access-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.register-cross-account-access-role-request/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.failed-item-details/failure-code (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-item-error-code))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.failed-item-details/retryable (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/failed-item-details (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.failed-item-details/failure-code :portkey.aws.inspector.-2016-02-16.failed-item-details/retryable] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-targets-request/assessment-target-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/batch-describe-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-assessment-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-assessment-targets-request/assessment-target-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-template-response/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/create-assessment-template-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.create-assessment-template-response/assessment-template-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/report-status #{"COMPLETED" :work-in-progress :completed "FAILED" "WORK_IN_PROGRESS" :failed})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.resource-group/arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.resource-group/tags (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/resource-group-tags))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.resource-group/created-at (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/resource-group (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.resource-group/arn :portkey.aws.inspector.-2016-02-16.resource-group/tags :portkey.aws.inspector.-2016-02-16.resource-group/created-at] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-templates-response/assessment-template-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-returned-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.list-assessment-templates-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-assessment-templates-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.list-assessment-templates-response/assessment-template-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.list-assessment-templates-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-notification/date (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-notification/event (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/inspector-event))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-notification/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-notification/error (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-notification/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-notification/sns-publish-status-code (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-notification-sns-status-code))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-notification (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.assessment-run-notification/date :portkey.aws.inspector.-2016-02-16.assessment-run-notification/event :portkey.aws.inspector.-2016-02-16.assessment-run-notification/error] :opt-un [:portkey.aws.inspector.-2016-02-16.assessment-run-notification/message :portkey.aws.inspector.-2016-02-16.assessment-run-notification/sns-topic-arn :portkey.aws.inspector.-2016-02-16.assessment-run-notification/sns-publish-status-code]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-exclusions-preview-request/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/create-exclusions-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.create-exclusions-preview-request/assessment-template-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.set-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.set-tags-for-resource-request/tags (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/tag-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/set-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.set-tags-for-resource-request/resource-arn] :opt-un [:portkey.aws.inspector.-2016-02-16.set-tags-for-resource-request/tags]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-in-progress-exception/assessment-run-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-in-progress-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-in-progress-exception/assessment-run-arns-truncated (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.assessment-run-in-progress-exception/can-retry (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/bool))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-run-in-progress-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.assessment-run-in-progress-exception/message :portkey.aws.inspector.-2016-02-16.assessment-run-in-progress-exception/assessment-run-arns :portkey.aws.inspector.-2016-02-16.assessment-run-in-progress-exception/assessment-run-arns-truncated :portkey.aws.inspector.-2016-02-16.assessment-run-in-progress-exception/can-retry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.remove-attributes-from-findings-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/remove-attributes-from-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.remove-attributes-from-findings-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.delete-assessment-run-request/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/delete-assessment-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.delete-assessment-run-request/assessment-run-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/stop-action #{:skip-evaluation "SKIP_EVALUATION" :start-evaluation "START_EVALUATION"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.delete-assessment-template-request/assessment-template-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/delete-assessment-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.delete-assessment-template-request/assessment-template-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding-filter/agent-ids (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-id-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding-filter/auto-scaling-groups (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/auto-scaling-group-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding-filter/rule-names (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/rule-name-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding-filter/severities (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/severity-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding-filter/rules-package-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/filter-rules-package-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding-filter/attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding-filter/user-attributes (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/attribute-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.finding-filter/creation-time-range (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/timestamp-range))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/finding-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.finding-filter/agent-ids :portkey.aws.inspector.-2016-02-16.finding-filter/auto-scaling-groups :portkey.aws.inspector.-2016-02-16.finding-filter/rule-names :portkey.aws.inspector.-2016-02-16.finding-filter/severities :portkey.aws.inspector.-2016-02-16.finding-filter/rules-package-arns :portkey.aws.inspector.-2016-02-16.finding-filter/attributes :portkey.aws.inspector.-2016-02-16.finding-filter/user-attributes :portkey.aws.inspector.-2016-02-16.finding-filter/creation-time-range]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.preview-generation-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/error-message))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/preview-generation-in-progress-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.preview-generation-in-progress-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.resource-group-tag/key (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/tag-key))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.resource-group-tag/value (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/tag-value))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/resource-group-tag (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.resource-group-tag/key] :opt-un [:portkey.aws.inspector.-2016-02-16.resource-group-tag/value]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/agent-health-code #{"IDLE" "UNKNOWN" :idle :unknown :unhealthy :running "SHUTDOWN" :throttled "THROTTLED" "RUNNING" :shutdown "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-findings-response/findings (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/finding-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-findings-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-findings-response/findings :portkey.aws.inspector.-2016-02-16.describe-findings-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-runs-response/assessment-runs (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-run-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-assessment-runs-response/failed-items (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/failed-items))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-assessment-runs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-assessment-runs-response/assessment-runs :portkey.aws.inspector.-2016-02-16.describe-assessment-runs-response/failed-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/list-returned-arn-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/arn :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/access-denied-error-code #{"ACCESS_DENIED_TO_SNS_TOPIC" "ACCESS_DENIED_TO_ASSESSMENT_RUN" "ACCESS_DENIED_TO_RESOURCE_GROUP" :access-denied-to-sns-topic :access-denied-to-assessment-run "ACCESS_DENIED_TO_RULES_PACKAGE" :access-denied-to-finding "ACCESS_DENIED_TO_FINDING" "ACCESS_DENIED_TO_ASSESSMENT_TARGET" :access-denied-to-rules-package :access-denied-to-assessment-target :access-denied-to-resource-group :access-denied-to-iam-role "ACCESS_DENIED_TO_ASSESSMENT_TEMPLATE" "ACCESS_DENIED_TO_IAM_ROLE" :access-denied-to-assessment-template})

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.inspector-service-attributes/schema-version (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/numeric-version))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.inspector-service-attributes/assessment-run-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.inspector-service-attributes/rules-package-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/inspector-service-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.inspector-service-attributes/schema-version] :opt-un [:portkey.aws.inspector.-2016-02-16.inspector-service-attributes/assessment-run-arn :portkey.aws.inspector.-2016-02-16.inspector-service-attributes/rules-package-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/assessment-template-list (clojure.spec.alpha/coll-of :portkey.aws.inspector.-2016-02-16/assessment-template :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.scope/key (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/scope-type))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.scope/value (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/scope-value))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/scope (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.inspector.-2016-02-16.scope/key :portkey.aws.inspector.-2016-02-16.scope/value]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.preview-agents-response/agent-previews (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/agent-preview-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.preview-agents-response/next-token (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/pagination-token))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/preview-agents-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.preview-agents-response/agent-previews] :opt-un [:portkey.aws.inspector.-2016-02-16.preview-agents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/kernel-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/operating-system (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/uuid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-exclusions-request/exclusion-arns (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/batch-describe-exclusions-arn-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.describe-exclusions-request/locale (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/locale))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/describe-exclusions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.describe-exclusions-request/exclusion-arns] :opt-un [:portkey.aws.inspector.-2016-02-16.describe-exclusions-request/locale]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-target-request/assessment-target-name (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/assessment-target-name))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-assessment-target-request/resource-group-arn (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/arn))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/create-assessment-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.create-assessment-target-request/assessment-target-name] :opt-un [:portkey.aws.inspector.-2016-02-16.create-assessment-target-request/resource-group-arn]))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/name-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.create-resource-group-request/resource-group-tags (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/resource-group-tags))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/create-resource-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.create-resource-group-request/resource-group-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16.get-telemetry-metadata-response/telemetry-metadata (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/telemetry-metadata-list))
(clojure.spec.alpha/def :portkey.aws.inspector.-2016-02-16/get-telemetry-metadata-response (clojure.spec.alpha/keys :req-un [:portkey.aws.inspector.-2016-02-16.get-telemetry-metadata-response/telemetry-metadata] :opt-un []))

(clojure.core/defn list-assessment-runs ([] (list-assessment-runs {})) ([list-assessment-runs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-assessment-runs-request list-assessment-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-assessment-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-assessment-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssessmentRuns", :http.request.configuration/output-deser-fn deser-list-assessment-runs-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-assessment-runs :args (clojure.spec.alpha/? :portkey.aws.inspector.-2016-02-16/list-assessment-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-assessment-runs-response))

(clojure.core/defn delete-assessment-template ([delete-assessment-template-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-assessment-template-request delete-assessment-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/delete-assessment-template-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAssessmentTemplate", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AssessmentRunInProgressException" :portkey.aws.inspector.-2016-02-16/assessment-run-in-progress-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-assessment-template :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/delete-assessment-template-request) :ret clojure.core/true?)

(clojure.core/defn unsubscribe-from-event ([unsubscribe-from-event-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-unsubscribe-from-event-request unsubscribe-from-event-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/unsubscribe-from-event-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UnsubscribeFromEvent", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef unsubscribe-from-event :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/unsubscribe-from-event-request) :ret clojure.core/true?)

(clojure.core/defn register-cross-account-access-role ([register-cross-account-access-role-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-register-cross-account-access-role-request register-cross-account-access-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/register-cross-account-access-role-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterCrossAccountAccessRole", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "InvalidCrossAccountRoleException" :portkey.aws.inspector.-2016-02-16/invalid-cross-account-role-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef register-cross-account-access-role :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/register-cross-account-access-role-request) :ret clojure.core/true?)

(clojure.core/defn get-exclusions-preview ([get-exclusions-preview-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-exclusions-preview-request get-exclusions-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/get-exclusions-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/get-exclusions-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetExclusionsPreview", :http.request.configuration/output-deser-fn deser-get-exclusions-preview-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef get-exclusions-preview :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/get-exclusions-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/get-exclusions-preview-response))

(clojure.core/defn list-findings ([] (list-findings {})) ([list-findings-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-findings-request list-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-findings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-findings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListFindings", :http.request.configuration/output-deser-fn deser-list-findings-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-findings :args (clojure.spec.alpha/? :portkey.aws.inspector.-2016-02-16/list-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-findings-response))

(clojure.core/defn start-assessment-run ([start-assessment-run-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-assessment-run-request start-assessment-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/start-assessment-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/start-assessment-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartAssessmentRun", :http.request.configuration/output-deser-fn deser-start-assessment-run-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector.-2016-02-16/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "InvalidCrossAccountRoleException" :portkey.aws.inspector.-2016-02-16/invalid-cross-account-role-exception, "AgentsAlreadyRunningAssessmentException" :portkey.aws.inspector.-2016-02-16/agents-already-running-assessment-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef start-assessment-run :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/start-assessment-run-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/start-assessment-run-response))

(clojure.core/defn describe-assessment-targets ([describe-assessment-targets-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-assessment-targets-request describe-assessment-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/describe-assessment-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/describe-assessment-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssessmentTargets", :http.request.configuration/output-deser-fn deser-describe-assessment-targets-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-assessment-targets :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/describe-assessment-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/describe-assessment-targets-response))

(clojure.core/defn set-tags-for-resource ([set-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-set-tags-for-resource-request set-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/set-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetTagsForResource", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/set-tags-for-resource-request) :ret clojure.core/true?)

(clojure.core/defn create-exclusions-preview ([create-exclusions-preview-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-exclusions-preview-request create-exclusions-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/create-exclusions-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/create-exclusions-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateExclusionsPreview", :http.request.configuration/output-deser-fn deser-create-exclusions-preview-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "PreviewGenerationInProgressException" :portkey.aws.inspector.-2016-02-16/preview-generation-in-progress-exception, "InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-exclusions-preview :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/create-exclusions-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/create-exclusions-preview-response))

(clojure.core/defn get-assessment-report ([get-assessment-report-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-assessment-report-request get-assessment-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/get-assessment-report-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/get-assessment-report-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAssessmentReport", :http.request.configuration/output-deser-fn deser-get-assessment-report-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "AssessmentRunInProgressException" :portkey.aws.inspector.-2016-02-16/assessment-run-in-progress-exception, "UnsupportedFeatureException" :portkey.aws.inspector.-2016-02-16/unsupported-feature-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-assessment-report :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/get-assessment-report-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/get-assessment-report-response))

(clojure.core/defn subscribe-to-event ([subscribe-to-event-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-subscribe-to-event-request subscribe-to-event-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/subscribe-to-event-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SubscribeToEvent", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector.-2016-02-16/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef subscribe-to-event :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/subscribe-to-event-request) :ret clojure.core/true?)

(clojure.core/defn create-assessment-template ([create-assessment-template-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-assessment-template-request create-assessment-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/create-assessment-template-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/create-assessment-template-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAssessmentTemplate", :http.request.configuration/output-deser-fn deser-create-assessment-template-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector.-2016-02-16/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-assessment-template :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/create-assessment-template-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/create-assessment-template-response))

(clojure.core/defn describe-resource-groups ([describe-resource-groups-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-resource-groups-request describe-resource-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/describe-resource-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/describe-resource-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeResourceGroups", :http.request.configuration/output-deser-fn deser-describe-resource-groups-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-resource-groups :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/describe-resource-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/describe-resource-groups-response))

(clojure.core/defn preview-agents ([preview-agents-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-preview-agents-request preview-agents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/preview-agents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/preview-agents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PreviewAgents", :http.request.configuration/output-deser-fn deser-preview-agents-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "InvalidCrossAccountRoleException" :portkey.aws.inspector.-2016-02-16/invalid-cross-account-role-exception}})))))
(clojure.spec.alpha/fdef preview-agents :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/preview-agents-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/preview-agents-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn deser-list-tags-for-resource-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-tags-for-resource-response))

(clojure.core/defn describe-rules-packages ([describe-rules-packages-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-rules-packages-request describe-rules-packages-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/describe-rules-packages-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/describe-rules-packages-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRulesPackages", :http.request.configuration/output-deser-fn deser-describe-rules-packages-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-rules-packages :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/describe-rules-packages-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/describe-rules-packages-response))

(clojure.core/defn get-telemetry-metadata ([get-telemetry-metadata-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-telemetry-metadata-request get-telemetry-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/get-telemetry-metadata-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/get-telemetry-metadata-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTelemetryMetadata", :http.request.configuration/output-deser-fn deser-get-telemetry-metadata-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef get-telemetry-metadata :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/get-telemetry-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/get-telemetry-metadata-response))

(clojure.core/defn delete-assessment-run ([delete-assessment-run-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-assessment-run-request delete-assessment-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/delete-assessment-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAssessmentRun", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AssessmentRunInProgressException" :portkey.aws.inspector.-2016-02-16/assessment-run-in-progress-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-assessment-run :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/delete-assessment-run-request) :ret clojure.core/true?)

(clojure.core/defn remove-attributes-from-findings ([remove-attributes-from-findings-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-remove-attributes-from-findings-request remove-attributes-from-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/remove-attributes-from-findings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/remove-attributes-from-findings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveAttributesFromFindings", :http.request.configuration/output-deser-fn deser-remove-attributes-from-findings-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef remove-attributes-from-findings :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/remove-attributes-from-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/remove-attributes-from-findings-response))

(clojure.core/defn list-assessment-run-agents ([list-assessment-run-agents-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-assessment-run-agents-request list-assessment-run-agents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-assessment-run-agents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-assessment-run-agents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssessmentRunAgents", :http.request.configuration/output-deser-fn deser-list-assessment-run-agents-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-assessment-run-agents :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/list-assessment-run-agents-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-assessment-run-agents-response))

(clojure.core/defn add-attributes-to-findings ([add-attributes-to-findings-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-attributes-to-findings-request add-attributes-to-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/add-attributes-to-findings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/add-attributes-to-findings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddAttributesToFindings", :http.request.configuration/output-deser-fn deser-add-attributes-to-findings-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef add-attributes-to-findings :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/add-attributes-to-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/add-attributes-to-findings-response))

(clojure.core/defn create-resource-group ([create-resource-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-resource-group-request create-resource-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/create-resource-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/create-resource-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateResourceGroup", :http.request.configuration/output-deser-fn deser-create-resource-group-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector.-2016-02-16/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-resource-group :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/create-resource-group-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/create-resource-group-response))

(clojure.core/defn list-assessment-templates ([] (list-assessment-templates {})) ([list-assessment-templates-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-assessment-templates-request list-assessment-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-assessment-templates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-assessment-templates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssessmentTemplates", :http.request.configuration/output-deser-fn deser-list-assessment-templates-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-assessment-templates :args (clojure.spec.alpha/? :portkey.aws.inspector.-2016-02-16/list-assessment-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-assessment-templates-response))

(clojure.core/defn list-assessment-targets ([] (list-assessment-targets {})) ([list-assessment-targets-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-assessment-targets-request list-assessment-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-assessment-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-assessment-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssessmentTargets", :http.request.configuration/output-deser-fn deser-list-assessment-targets-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception}})))))
(clojure.spec.alpha/fdef list-assessment-targets :args (clojure.spec.alpha/? :portkey.aws.inspector.-2016-02-16/list-assessment-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-assessment-targets-response))

(clojure.core/defn list-event-subscriptions ([] (list-event-subscriptions {})) ([list-event-subscriptions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-event-subscriptions-request list-event-subscriptions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-event-subscriptions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-event-subscriptions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEventSubscriptions", :http.request.configuration/output-deser-fn deser-list-event-subscriptions-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-event-subscriptions :args (clojure.spec.alpha/? :portkey.aws.inspector.-2016-02-16/list-event-subscriptions-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-event-subscriptions-response))

(clojure.core/defn describe-assessment-runs ([describe-assessment-runs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-assessment-runs-request describe-assessment-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/describe-assessment-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/describe-assessment-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssessmentRuns", :http.request.configuration/output-deser-fn deser-describe-assessment-runs-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-assessment-runs :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/describe-assessment-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/describe-assessment-runs-response))

(clojure.core/defn describe-exclusions ([describe-exclusions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-exclusions-request describe-exclusions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/describe-exclusions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/describe-exclusions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeExclusions", :http.request.configuration/output-deser-fn deser-describe-exclusions-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-exclusions :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/describe-exclusions-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/describe-exclusions-response))

(clojure.core/defn describe-findings ([describe-findings-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-findings-request describe-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/describe-findings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/describe-findings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeFindings", :http.request.configuration/output-deser-fn deser-describe-findings-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-findings :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/describe-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/describe-findings-response))

(clojure.core/defn describe-cross-account-access-role ([] (describe-cross-account-access-role {})) ([_] (clojure.core/let [request-function-result__28581__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/describe-cross-account-access-role-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCrossAccountAccessRole", :http.request.configuration/output-deser-fn deser-describe-cross-account-access-role-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception}})))))
(clojure.spec.alpha/fdef describe-cross-account-access-role :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/describe-cross-account-access-role-response))

(clojure.core/defn list-exclusions ([list-exclusions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-exclusions-request list-exclusions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-exclusions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-exclusions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListExclusions", :http.request.configuration/output-deser-fn deser-list-exclusions-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-exclusions :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/list-exclusions-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-exclusions-response))

(clojure.core/defn create-assessment-target ([create-assessment-target-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-assessment-target-request create-assessment-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/create-assessment-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/create-assessment-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAssessmentTarget", :http.request.configuration/output-deser-fn deser-create-assessment-target-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "LimitExceededException" :portkey.aws.inspector.-2016-02-16/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "InvalidCrossAccountRoleException" :portkey.aws.inspector.-2016-02-16/invalid-cross-account-role-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-assessment-target :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/create-assessment-target-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/create-assessment-target-response))

(clojure.core/defn stop-assessment-run ([stop-assessment-run-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-assessment-run-request stop-assessment-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/stop-assessment-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopAssessmentRun", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef stop-assessment-run :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/stop-assessment-run-request) :ret clojure.core/true?)

(clojure.core/defn update-assessment-target ([update-assessment-target-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-assessment-target-request update-assessment-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/update-assessment-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAssessmentTarget", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef update-assessment-target :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/update-assessment-target-request) :ret clojure.core/true?)

(clojure.core/defn describe-assessment-templates ([describe-assessment-templates-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-assessment-templates-request describe-assessment-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/describe-assessment-templates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/describe-assessment-templates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssessmentTemplates", :http.request.configuration/output-deser-fn deser-describe-assessment-templates-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception}})))))
(clojure.spec.alpha/fdef describe-assessment-templates :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/describe-assessment-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/describe-assessment-templates-response))

(clojure.core/defn list-rules-packages ([] (list-rules-packages {})) ([list-rules-packages-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-rules-packages-request list-rules-packages-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec :portkey.aws.inspector.-2016-02-16/list-rules-packages-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/list-rules-packages-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRulesPackages", :http.request.configuration/output-deser-fn deser-list-rules-packages-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception}})))))
(clojure.spec.alpha/fdef list-rules-packages :args (clojure.spec.alpha/? :portkey.aws.inspector.-2016-02-16/list-rules-packages-request) :ret (clojure.spec.alpha/and :portkey.aws.inspector.-2016-02-16/list-rules-packages-response))

(clojure.core/defn delete-assessment-target ([delete-assessment-target-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-assessment-target-request delete-assessment-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.inspector.-2016-02-16/endpoints, :http.request.configuration/target-prefix "InspectorService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-16", :http.request.configuration/service-id "Inspector", :http.request.spec/input-spec :portkey.aws.inspector.-2016-02-16/delete-assessment-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAssessmentTarget", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalException" :portkey.aws.inspector.-2016-02-16/internal-exception, "InvalidInputException" :portkey.aws.inspector.-2016-02-16/invalid-input-exception, "AssessmentRunInProgressException" :portkey.aws.inspector.-2016-02-16/assessment-run-in-progress-exception, "AccessDeniedException" :portkey.aws.inspector.-2016-02-16/access-denied-exception, "NoSuchEntityException" :portkey.aws.inspector.-2016-02-16/no-such-entity-exception, "ServiceTemporarilyUnavailableException" :portkey.aws.inspector.-2016-02-16/service-temporarily-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-assessment-target :args (clojure.spec.alpha/tuple :portkey.aws.inspector.-2016-02-16/delete-assessment-target-request) :ret clojure.core/true?)
