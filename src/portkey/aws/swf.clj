(ns portkey.aws.swf (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "swf", :region "ap-northeast-1"},
    :ssl-common-name "swf.ap-northeast-1.amazonaws.com",
    :endpoint "https://swf.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "swf", :region "eu-west-1"},
    :ssl-common-name "swf.eu-west-1.amazonaws.com",
    :endpoint "https://swf.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "swf", :region "us-east-2"},
    :ssl-common-name "swf.us-east-2.amazonaws.com",
    :endpoint "https://swf.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "swf", :region "ap-southeast-2"},
    :ssl-common-name "swf.ap-southeast-2.amazonaws.com",
    :endpoint "https://swf.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "swf", :region "cn-north-1"},
    :ssl-common-name "swf.cn-north-1.amazonaws.com.cn",
    :endpoint "https://swf.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "swf", :region "sa-east-1"},
    :ssl-common-name "swf.sa-east-1.amazonaws.com",
    :endpoint "https://swf.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "swf", :region "ap-southeast-1"},
    :ssl-common-name "swf.ap-southeast-1.amazonaws.com",
    :endpoint "https://swf.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "swf", :region "cn-northwest-1"},
    :ssl-common-name "swf.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://swf.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "swf", :region "ap-northeast-2"},
    :ssl-common-name "swf.ap-northeast-2.amazonaws.com",
    :endpoint "https://swf.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "swf", :region "eu-west-3"},
    :ssl-common-name "swf.eu-west-3.amazonaws.com",
    :endpoint "https://swf.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "swf", :region "ca-central-1"},
    :ssl-common-name "swf.ca-central-1.amazonaws.com",
    :endpoint "https://swf.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "swf", :region "eu-central-1"},
    :ssl-common-name "swf.eu-central-1.amazonaws.com",
    :endpoint "https://swf.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "swf", :region "eu-west-2"},
    :ssl-common-name "swf.eu-west-2.amazonaws.com",
    :endpoint "https://swf.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "swf", :region "us-gov-west-1"},
    :ssl-common-name "swf.us-gov-west-1.amazonaws.com",
    :endpoint "https://swf.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "swf", :region "us-west-2"},
    :ssl-common-name "swf.us-west-2.amazonaws.com",
    :endpoint "https://swf.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "swf", :region "us-east-1"},
    :ssl-common-name "swf.us-east-1.amazonaws.com",
    :endpoint "https://swf.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "swf", :region "us-west-1"},
    :ssl-common-name "swf.us-west-1.amazonaws.com",
    :endpoint "https://swf.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "swf", :region "ap-south-1"},
    :ssl-common-name "swf.ap-south-1.amazonaws.com",
    :endpoint "https://swf.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-workflow-type)

(clojure.core/declare ser-decision)

(clojure.core/declare ser-workflow-run-id-optional)

(clojure.core/declare ser-limited-data)

(clojure.core/declare ser-function-name)

(clojure.core/declare ser-request-cancel-activity-task-decision-attributes)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-workflow-execution)

(clojure.core/declare ser-workflow-type-filter)

(clojure.core/declare ser-record-marker-decision-attributes)

(clojure.core/declare ser-registration-status)

(clojure.core/declare ser-signal-external-workflow-execution-decision-attributes)

(clojure.core/declare ser-schedule-lambda-function-decision-attributes)

(clojure.core/declare ser-child-policy)

(clojure.core/declare ser-duration-in-days)

(clojure.core/declare ser-execution-time-filter)

(clojure.core/declare ser-task-list)

(clojure.core/declare ser-workflow-run-id)

(clojure.core/declare ser-task-priority)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-duration-in-seconds)

(clojure.core/declare ser-duration-in-seconds-optional)

(clojure.core/declare ser-workflow-execution-filter)

(clojure.core/declare ser-activity-id)

(clojure.core/declare ser-activity-type)

(clojure.core/declare ser-fail-workflow-execution-decision-attributes)

(clojure.core/declare ser-description)

(clojure.core/declare ser-complete-workflow-execution-decision-attributes)

(clojure.core/declare ser-cancel-timer-decision-attributes)

(clojure.core/declare ser-failure-reason)

(clojure.core/declare ser-start-child-workflow-execution-decision-attributes)

(clojure.core/declare ser-version-optional)

(clojure.core/declare ser-marker-name)

(clojure.core/declare ser-function-id)

(clojure.core/declare ser-timer-id)

(clojure.core/declare ser-cancel-workflow-execution-decision-attributes)

(clojure.core/declare ser-data)

(clojure.core/declare ser-identity)

(clojure.core/declare ser-tag-filter)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-continue-as-new-workflow-execution-decision-attributes)

(clojure.core/declare ser-close-status-filter)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-decision-list)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-decision-type)

(clojure.core/declare ser-version)

(clojure.core/declare ser-task-token)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-name)

(clojure.core/declare ser-function-input)

(clojure.core/declare ser-close-status)

(clojure.core/declare ser-signal-name)

(clojure.core/declare ser-reverse-order)

(clojure.core/declare ser-terminate-reason)

(clojure.core/declare ser-workflow-id)

(clojure.core/declare ser-page-token)

(clojure.core/declare ser-request-cancel-external-workflow-execution-decision-attributes)

(clojure.core/declare ser-schedule-activity-task-decision-attributes)

(clojure.core/declare ser-start-timer-decision-attributes)

(clojure.core/defn- ser-workflow-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name (:name input)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-version (:version input)) #:http.request.field{:name "version", :shape "Version"})], :shape "WorkflowType", :type "structure"}))

(clojure.core/defn- ser-decision [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-decision-type (:decision-type input)) #:http.request.field{:name "decisionType", :shape "DecisionType"})], :shape "Decision", :type "structure"} (clojure.core/contains? input :cancel-workflow-execution-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cancel-workflow-execution-decision-attributes (input :cancel-workflow-execution-decision-attributes)) #:http.request.field{:name "cancelWorkflowExecutionDecisionAttributes", :shape "CancelWorkflowExecutionDecisionAttributes"})) (clojure.core/contains? input :record-marker-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-marker-decision-attributes (input :record-marker-decision-attributes)) #:http.request.field{:name "recordMarkerDecisionAttributes", :shape "RecordMarkerDecisionAttributes"})) (clojure.core/contains? input :fail-workflow-execution-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fail-workflow-execution-decision-attributes (input :fail-workflow-execution-decision-attributes)) #:http.request.field{:name "failWorkflowExecutionDecisionAttributes", :shape "FailWorkflowExecutionDecisionAttributes"})) (clojure.core/contains? input :continue-as-new-workflow-execution-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continue-as-new-workflow-execution-decision-attributes (input :continue-as-new-workflow-execution-decision-attributes)) #:http.request.field{:name "continueAsNewWorkflowExecutionDecisionAttributes", :shape "ContinueAsNewWorkflowExecutionDecisionAttributes"})) (clojure.core/contains? input :complete-workflow-execution-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-complete-workflow-execution-decision-attributes (input :complete-workflow-execution-decision-attributes)) #:http.request.field{:name "completeWorkflowExecutionDecisionAttributes", :shape "CompleteWorkflowExecutionDecisionAttributes"})) (clojure.core/contains? input :request-cancel-activity-task-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-cancel-activity-task-decision-attributes (input :request-cancel-activity-task-decision-attributes)) #:http.request.field{:name "requestCancelActivityTaskDecisionAttributes", :shape "RequestCancelActivityTaskDecisionAttributes"})) (clojure.core/contains? input :start-child-workflow-execution-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start-child-workflow-execution-decision-attributes (input :start-child-workflow-execution-decision-attributes)) #:http.request.field{:name "startChildWorkflowExecutionDecisionAttributes", :shape "StartChildWorkflowExecutionDecisionAttributes"})) (clojure.core/contains? input :request-cancel-external-workflow-execution-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-cancel-external-workflow-execution-decision-attributes (input :request-cancel-external-workflow-execution-decision-attributes)) #:http.request.field{:name "requestCancelExternalWorkflowExecutionDecisionAttributes", :shape "RequestCancelExternalWorkflowExecutionDecisionAttributes"})) (clojure.core/contains? input :schedule-lambda-function-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-lambda-function-decision-attributes (input :schedule-lambda-function-decision-attributes)) #:http.request.field{:name "scheduleLambdaFunctionDecisionAttributes", :shape "ScheduleLambdaFunctionDecisionAttributes"})) (clojure.core/contains? input :signal-external-workflow-execution-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signal-external-workflow-execution-decision-attributes (input :signal-external-workflow-execution-decision-attributes)) #:http.request.field{:name "signalExternalWorkflowExecutionDecisionAttributes", :shape "SignalExternalWorkflowExecutionDecisionAttributes"})) (clojure.core/contains? input :schedule-activity-task-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-activity-task-decision-attributes (input :schedule-activity-task-decision-attributes)) #:http.request.field{:name "scheduleActivityTaskDecisionAttributes", :shape "ScheduleActivityTaskDecisionAttributes"})) (clojure.core/contains? input :cancel-timer-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cancel-timer-decision-attributes (input :cancel-timer-decision-attributes)) #:http.request.field{:name "cancelTimerDecisionAttributes", :shape "CancelTimerDecisionAttributes"})) (clojure.core/contains? input :start-timer-decision-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start-timer-decision-attributes (input :start-timer-decision-attributes)) #:http.request.field{:name "startTimerDecisionAttributes", :shape "StartTimerDecisionAttributes"}))))

(clojure.core/defn- ser-workflow-run-id-optional [input] #:http.request.field{:value input, :shape "WorkflowRunIdOptional"})

(clojure.core/defn- ser-limited-data [input] #:http.request.field{:value input, :shape "LimitedData"})

(clojure.core/defn- ser-function-name [input] #:http.request.field{:value input, :shape "FunctionName"})

(clojure.core/defn- ser-request-cancel-activity-task-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-id (:activity-id input)) #:http.request.field{:name "activityId", :shape "ActivityId"})], :shape "RequestCancelActivityTaskDecisionAttributes", :type "structure"}))

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-workflow-execution [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workflow-id (:workflow-id input)) #:http.request.field{:name "workflowId", :shape "WorkflowId"}) (clojure.core/into (ser-workflow-run-id (:run-id input)) #:http.request.field{:name "runId", :shape "WorkflowRunId"})], :shape "WorkflowExecution", :type "structure"}))

(clojure.core/defn- ser-workflow-type-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name (:name input)) #:http.request.field{:name "name", :shape "Name"})], :shape "WorkflowTypeFilter", :type "structure"} (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-optional (input :version)) #:http.request.field{:name "version", :shape "VersionOptional"}))))

(clojure.core/defn- ser-record-marker-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-marker-name (:marker-name input)) #:http.request.field{:name "markerName", :shape "MarkerName"})], :shape "RecordMarkerDecisionAttributes", :type "structure"} (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :details)) #:http.request.field{:name "details", :shape "Data"}))))

(clojure.core/defn- ser-registration-status [input] #:http.request.field{:value (clojure.core/get {"REGISTERED" "REGISTERED", :registered "REGISTERED", "DEPRECATED" "DEPRECATED", :deprecated "DEPRECATED"} input), :shape "RegistrationStatus"})

(clojure.core/defn- ser-signal-external-workflow-execution-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workflow-id (:workflow-id input)) #:http.request.field{:name "workflowId", :shape "WorkflowId"}) (clojure.core/into (ser-signal-name (:signal-name input)) #:http.request.field{:name "signalName", :shape "SignalName"})], :shape "SignalExternalWorkflowExecutionDecisionAttributes", :type "structure"} (clojure.core/contains? input :run-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-run-id-optional (input :run-id)) #:http.request.field{:name "runId", :shape "WorkflowRunIdOptional"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :input)) #:http.request.field{:name "input", :shape "Data"})) (clojure.core/contains? input :control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :control)) #:http.request.field{:name "control", :shape "Data"}))))

(clojure.core/defn- ser-schedule-lambda-function-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-function-id (:id input)) #:http.request.field{:name "id", :shape "FunctionId"}) (clojure.core/into (ser-function-name (:name input)) #:http.request.field{:name "name", :shape "FunctionName"})], :shape "ScheduleLambdaFunctionDecisionAttributes", :type "structure"} (clojure.core/contains? input :control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :control)) #:http.request.field{:name "control", :shape "Data"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-function-input (input :input)) #:http.request.field{:name "input", :shape "FunctionInput"})) (clojure.core/contains? input :start-to-close-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :start-to-close-timeout)) #:http.request.field{:name "startToCloseTimeout", :shape "DurationInSecondsOptional"}))))

(clojure.core/defn- ser-child-policy [input] #:http.request.field{:value (clojure.core/get {"TERMINATE" "TERMINATE", :terminate "TERMINATE", "REQUEST_CANCEL" "REQUEST_CANCEL", :request-cancel "REQUEST_CANCEL", "ABANDON" "ABANDON", :abandon "ABANDON"} input), :shape "ChildPolicy"})

(clojure.core/defn- ser-duration-in-days [input] #:http.request.field{:value input, :shape "DurationInDays"})

(clojure.core/defn- ser-execution-time-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:oldest-date input)) #:http.request.field{:name "oldestDate", :shape "Timestamp"})], :shape "ExecutionTimeFilter", :type "structure"} (clojure.core/contains? input :latest-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :latest-date)) #:http.request.field{:name "latestDate", :shape "Timestamp"}))))

(clojure.core/defn- ser-task-list [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name (:name input)) #:http.request.field{:name "name", :shape "Name"})], :shape "TaskList", :type "structure"}))

(clojure.core/defn- ser-workflow-run-id [input] #:http.request.field{:value input, :shape "WorkflowRunId"})

(clojure.core/defn- ser-task-priority [input] #:http.request.field{:value input, :shape "TaskPriority"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 5})

(clojure.core/defn- ser-duration-in-seconds [input] #:http.request.field{:value input, :shape "DurationInSeconds"})

(clojure.core/defn- ser-duration-in-seconds-optional [input] #:http.request.field{:value input, :shape "DurationInSecondsOptional"})

(clojure.core/defn- ser-workflow-execution-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workflow-id (:workflow-id input)) #:http.request.field{:name "workflowId", :shape "WorkflowId"})], :shape "WorkflowExecutionFilter", :type "structure"}))

(clojure.core/defn- ser-activity-id [input] #:http.request.field{:value input, :shape "ActivityId"})

(clojure.core/defn- ser-activity-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-name (:name input)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-version (:version input)) #:http.request.field{:name "version", :shape "Version"})], :shape "ActivityType", :type "structure"}))

(clojure.core/defn- ser-fail-workflow-execution-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FailWorkflowExecutionDecisionAttributes", :type "structure"} (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-reason (input :reason)) #:http.request.field{:name "reason", :shape "FailureReason"})) (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :details)) #:http.request.field{:name "details", :shape "Data"}))))

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-complete-workflow-execution-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CompleteWorkflowExecutionDecisionAttributes", :type "structure"} (clojure.core/contains? input :result) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :result)) #:http.request.field{:name "result", :shape "Data"}))))

(clojure.core/defn- ser-cancel-timer-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timer-id (:timer-id input)) #:http.request.field{:name "timerId", :shape "TimerId"})], :shape "CancelTimerDecisionAttributes", :type "structure"}))

(clojure.core/defn- ser-failure-reason [input] #:http.request.field{:value input, :shape "FailureReason"})

(clojure.core/defn- ser-start-child-workflow-execution-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workflow-type (:workflow-type input)) #:http.request.field{:name "workflowType", :shape "WorkflowType"}) (clojure.core/into (ser-workflow-id (:workflow-id input)) #:http.request.field{:name "workflowId", :shape "WorkflowId"})], :shape "StartChildWorkflowExecutionDecisionAttributes", :type "structure"} (clojure.core/contains? input :execution-start-to-close-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :execution-start-to-close-timeout)) #:http.request.field{:name "executionStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :task-start-to-close-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :task-start-to-close-timeout)) #:http.request.field{:name "taskStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :tag-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tag-list)) #:http.request.field{:name "tagList", :shape "TagList"})) (clojure.core/contains? input :task-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-list (input :task-list)) #:http.request.field{:name "taskList", :shape "TaskList"})) (clojure.core/contains? input :task-priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-priority (input :task-priority)) #:http.request.field{:name "taskPriority", :shape "TaskPriority"})) (clojure.core/contains? input :control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :control)) #:http.request.field{:name "control", :shape "Data"})) (clojure.core/contains? input :lambda-role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :lambda-role)) #:http.request.field{:name "lambdaRole", :shape "Arn"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :input)) #:http.request.field{:name "input", :shape "Data"})) (clojure.core/contains? input :child-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-policy (input :child-policy)) #:http.request.field{:name "childPolicy", :shape "ChildPolicy"}))))

(clojure.core/defn- ser-version-optional [input] #:http.request.field{:value input, :shape "VersionOptional"})

(clojure.core/defn- ser-marker-name [input] #:http.request.field{:value input, :shape "MarkerName"})

(clojure.core/defn- ser-function-id [input] #:http.request.field{:value input, :shape "FunctionId"})

(clojure.core/defn- ser-timer-id [input] #:http.request.field{:value input, :shape "TimerId"})

(clojure.core/defn- ser-cancel-workflow-execution-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CancelWorkflowExecutionDecisionAttributes", :type "structure"} (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :details)) #:http.request.field{:name "details", :shape "Data"}))))

(clojure.core/defn- ser-data [input] #:http.request.field{:value input, :shape "Data"})

(clojure.core/defn- ser-identity [input] #:http.request.field{:value input, :shape "Identity"})

(clojure.core/defn- ser-tag-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag (:tag input)) #:http.request.field{:name "tag", :shape "Tag"})], :shape "TagFilter", :type "structure"}))

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-continue-as-new-workflow-execution-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContinueAsNewWorkflowExecutionDecisionAttributes", :type "structure"} (clojure.core/contains? input :workflow-type-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :workflow-type-version)) #:http.request.field{:name "workflowTypeVersion", :shape "Version"})) (clojure.core/contains? input :execution-start-to-close-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :execution-start-to-close-timeout)) #:http.request.field{:name "executionStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :task-start-to-close-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :task-start-to-close-timeout)) #:http.request.field{:name "taskStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :tag-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tag-list)) #:http.request.field{:name "tagList", :shape "TagList"})) (clojure.core/contains? input :task-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-list (input :task-list)) #:http.request.field{:name "taskList", :shape "TaskList"})) (clojure.core/contains? input :task-priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-priority (input :task-priority)) #:http.request.field{:name "taskPriority", :shape "TaskPriority"})) (clojure.core/contains? input :lambda-role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :lambda-role)) #:http.request.field{:name "lambdaRole", :shape "Arn"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :input)) #:http.request.field{:name "input", :shape "Data"})) (clojure.core/contains? input :child-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-policy (input :child-policy)) #:http.request.field{:name "childPolicy", :shape "ChildPolicy"}))))

(clojure.core/defn- ser-close-status-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-close-status (:status input)) #:http.request.field{:name "status", :shape "CloseStatus"})], :shape "CloseStatusFilter", :type "structure"}))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-decision-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-decision coll) #:http.request.field{:shape "Decision"}))) input), :shape "DecisionList", :type "list"})

(clojure.core/defn- ser-tag [input] #:http.request.field{:value input, :shape "Tag"})

(clojure.core/defn- ser-decision-type [input] #:http.request.field{:value (clojure.core/get {:request-cancel-external-workflow-execution "RequestCancelExternalWorkflowExecution", :complete-workflow-execution "CompleteWorkflowExecution", "CancelWorkflowExecution" "CancelWorkflowExecution", "StartChildWorkflowExecution" "StartChildWorkflowExecution", :request-cancel-activity-task "RequestCancelActivityTask", "ScheduleLambdaFunction" "ScheduleLambdaFunction", :record-marker "RecordMarker", :cancel-timer "CancelTimer", "RequestCancelExternalWorkflowExecution" "RequestCancelExternalWorkflowExecution", :schedule-activity-task "ScheduleActivityTask", "CancelTimer" "CancelTimer", :fail-workflow-execution "FailWorkflowExecution", "ContinueAsNewWorkflowExecution" "ContinueAsNewWorkflowExecution", "FailWorkflowExecution" "FailWorkflowExecution", "ScheduleActivityTask" "ScheduleActivityTask", "StartTimer" "StartTimer", "RecordMarker" "RecordMarker", :schedule-lambda-function "ScheduleLambdaFunction", :start-timer "StartTimer", "RequestCancelActivityTask" "RequestCancelActivityTask", :cancel-workflow-execution "CancelWorkflowExecution", :continue-as-new-workflow-execution "ContinueAsNewWorkflowExecution", "SignalExternalWorkflowExecution" "SignalExternalWorkflowExecution", "CompleteWorkflowExecution" "CompleteWorkflowExecution", :start-child-workflow-execution "StartChildWorkflowExecution", :signal-external-workflow-execution "SignalExternalWorkflowExecution"} input), :shape "DecisionType"})

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-task-token [input] #:http.request.field{:value input, :shape "TaskToken"})

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-function-input [input] #:http.request.field{:value input, :shape "FunctionInput"})

(clojure.core/defn- ser-close-status [input] #:http.request.field{:value (clojure.core/get {"COMPLETED" "COMPLETED", "CANCELED" "CANCELED", :timed-out "TIMED_OUT", :continued-as-new "CONTINUED_AS_NEW", "TIMED_OUT" "TIMED_OUT", :completed "COMPLETED", "TERMINATED" "TERMINATED", :canceled "CANCELED", :terminated "TERMINATED", "FAILED" "FAILED", "CONTINUED_AS_NEW" "CONTINUED_AS_NEW", :failed "FAILED"} input), :shape "CloseStatus"})

(clojure.core/defn- ser-signal-name [input] #:http.request.field{:value input, :shape "SignalName"})

(clojure.core/defn- ser-reverse-order [input] #:http.request.field{:value input, :shape "ReverseOrder"})

(clojure.core/defn- ser-terminate-reason [input] #:http.request.field{:value input, :shape "TerminateReason"})

(clojure.core/defn- ser-workflow-id [input] #:http.request.field{:value input, :shape "WorkflowId"})

(clojure.core/defn- ser-page-token [input] #:http.request.field{:value input, :shape "PageToken"})

(clojure.core/defn- ser-request-cancel-external-workflow-execution-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workflow-id (:workflow-id input)) #:http.request.field{:name "workflowId", :shape "WorkflowId"})], :shape "RequestCancelExternalWorkflowExecutionDecisionAttributes", :type "structure"} (clojure.core/contains? input :run-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-run-id-optional (input :run-id)) #:http.request.field{:name "runId", :shape "WorkflowRunIdOptional"})) (clojure.core/contains? input :control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :control)) #:http.request.field{:name "control", :shape "Data"}))))

(clojure.core/defn- ser-schedule-activity-task-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-type (:activity-type input)) #:http.request.field{:name "activityType", :shape "ActivityType"}) (clojure.core/into (ser-activity-id (:activity-id input)) #:http.request.field{:name "activityId", :shape "ActivityId"})], :shape "ScheduleActivityTaskDecisionAttributes", :type "structure"} (clojure.core/contains? input :schedule-to-start-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :schedule-to-start-timeout)) #:http.request.field{:name "scheduleToStartTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :start-to-close-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :start-to-close-timeout)) #:http.request.field{:name "startToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :schedule-to-close-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :schedule-to-close-timeout)) #:http.request.field{:name "scheduleToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :task-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-list (input :task-list)) #:http.request.field{:name "taskList", :shape "TaskList"})) (clojure.core/contains? input :task-priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-priority (input :task-priority)) #:http.request.field{:name "taskPriority", :shape "TaskPriority"})) (clojure.core/contains? input :control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :control)) #:http.request.field{:name "control", :shape "Data"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :input)) #:http.request.field{:name "input", :shape "Data"})) (clojure.core/contains? input :heartbeat-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :heartbeat-timeout)) #:http.request.field{:name "heartbeatTimeout", :shape "DurationInSecondsOptional"}))))

(clojure.core/defn- ser-start-timer-decision-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timer-id (:timer-id input)) #:http.request.field{:name "timerId", :shape "TimerId"}) (clojure.core/into (ser-duration-in-seconds (:start-to-fire-timeout input)) #:http.request.field{:name "startToFireTimeout", :shape "DurationInSeconds"})], :shape "StartTimerDecisionAttributes", :type "structure"} (clojure.core/contains? input :control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :control)) #:http.request.field{:name "control", :shape "Data"}))))

(clojure.core/defn- req-count-open-workflow-executions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-execution-time-filter (input :start-time-filter)) #:http.request.field{:name "startTimeFilter", :shape "ExecutionTimeFilter"})]} (clojure.core/contains? input :type-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-type-filter (input :type-filter)) #:http.request.field{:name "typeFilter", :shape "WorkflowTypeFilter"})) (clojure.core/contains? input :tag-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter (input :tag-filter)) #:http.request.field{:name "tagFilter", :shape "TagFilter"})) (clojure.core/contains? input :execution-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-execution-filter (input :execution-filter)) #:http.request.field{:name "executionFilter", :shape "WorkflowExecutionFilter"}))))

(clojure.core/defn- req-deprecate-domain-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :name)) #:http.request.field{:name "name", :shape "DomainName"})]}))

(clojure.core/defn- req-request-cancel-workflow-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-workflow-id (input :workflow-id)) #:http.request.field{:name "workflowId", :shape "WorkflowId"})]} (clojure.core/contains? input :run-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-run-id-optional (input :run-id)) #:http.request.field{:name "runId", :shape "WorkflowRunIdOptional"}))))

(clojure.core/defn- req-describe-workflow-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-workflow-execution (input :execution)) #:http.request.field{:name "execution", :shape "WorkflowExecution"})]}))

(clojure.core/defn- req-count-pending-activity-tasks-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-task-list (input :task-list)) #:http.request.field{:name "taskList", :shape "TaskList"})]}))

(clojure.core/defn- req-poll-for-decision-task-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-task-list (input :task-list)) #:http.request.field{:name "taskList", :shape "TaskList"})]} (clojure.core/contains? input :identity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "identity", :shape "Identity"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-page-token)) #:http.request.field{:name "nextPageToken", :shape "PageToken"})) (clojure.core/contains? input :maximum-page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :maximum-page-size)) #:http.request.field{:name "maximumPageSize", :shape "PageSize"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"}))))

(clojure.core/defn- req-register-activity-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-version (input :version)) #:http.request.field{:name "version", :shape "Version"})]} (clojure.core/contains? input :default-task-priority) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-priority (input :default-task-priority)) #:http.request.field{:name "defaultTaskPriority", :shape "TaskPriority"})) (clojure.core/contains? input :default-task-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-list (input :default-task-list)) #:http.request.field{:name "defaultTaskList", :shape "TaskList"})) (clojure.core/contains? input :default-task-heartbeat-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :default-task-heartbeat-timeout)) #:http.request.field{:name "defaultTaskHeartbeatTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :default-task-schedule-to-close-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :default-task-schedule-to-close-timeout)) #:http.request.field{:name "defaultTaskScheduleToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :default-task-start-to-close-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :default-task-start-to-close-timeout)) #:http.request.field{:name "defaultTaskStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :default-task-schedule-to-start-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :default-task-schedule-to-start-timeout)) #:http.request.field{:name "defaultTaskScheduleToStartTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-list-workflow-types-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-registration-status (input :registration-status)) #:http.request.field{:name "registrationStatus", :shape "RegistrationStatus"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-page-token)) #:http.request.field{:name "nextPageToken", :shape "PageToken"})) (clojure.core/contains? input :maximum-page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :maximum-page-size)) #:http.request.field{:name "maximumPageSize", :shape "PageSize"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"}))))

(clojure.core/defn- req-respond-decision-task-completed-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]} (clojure.core/contains? input :decisions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-decision-list (input :decisions)) #:http.request.field{:name "decisions", :shape "DecisionList"})) (clojure.core/contains? input :execution-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :execution-context)) #:http.request.field{:name "executionContext", :shape "Data"}))))

(clojure.core/defn- req-register-domain-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :name)) #:http.request.field{:name "name", :shape "DomainName"}) (clojure.core/into (ser-duration-in-days (input :workflow-execution-retention-period-in-days)) #:http.request.field{:name "workflowExecutionRetentionPeriodInDays", :shape "DurationInDays"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-start-workflow-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-workflow-id (input :workflow-id)) #:http.request.field{:name "workflowId", :shape "WorkflowId"}) (clojure.core/into (ser-workflow-type (input :workflow-type)) #:http.request.field{:name "workflowType", :shape "WorkflowType"})]} (clojure.core/contains? input :execution-start-to-close-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :execution-start-to-close-timeout)) #:http.request.field{:name "executionStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :task-start-to-close-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :task-start-to-close-timeout)) #:http.request.field{:name "taskStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :tag-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tag-list)) #:http.request.field{:name "tagList", :shape "TagList"})) (clojure.core/contains? input :task-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-list (input :task-list)) #:http.request.field{:name "taskList", :shape "TaskList"})) (clojure.core/contains? input :task-priority) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-priority (input :task-priority)) #:http.request.field{:name "taskPriority", :shape "TaskPriority"})) (clojure.core/contains? input :lambda-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :lambda-role)) #:http.request.field{:name "lambdaRole", :shape "Arn"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :input)) #:http.request.field{:name "input", :shape "Data"})) (clojure.core/contains? input :child-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-policy (input :child-policy)) #:http.request.field{:name "childPolicy", :shape "ChildPolicy"}))))

(clojure.core/defn- req-poll-for-activity-task-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-task-list (input :task-list)) #:http.request.field{:name "taskList", :shape "TaskList"})]} (clojure.core/contains? input :identity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity (input :identity)) #:http.request.field{:name "identity", :shape "Identity"}))))

(clojure.core/defn- req-deprecate-activity-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-activity-type (input :activity-type)) #:http.request.field{:name "activityType", :shape "ActivityType"})]}))

(clojure.core/defn- req-signal-workflow-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-workflow-id (input :workflow-id)) #:http.request.field{:name "workflowId", :shape "WorkflowId"}) (clojure.core/into (ser-signal-name (input :signal-name)) #:http.request.field{:name "signalName", :shape "SignalName"})]} (clojure.core/contains? input :run-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-run-id-optional (input :run-id)) #:http.request.field{:name "runId", :shape "WorkflowRunIdOptional"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :input)) #:http.request.field{:name "input", :shape "Data"}))))

(clojure.core/defn- req-deprecate-workflow-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-workflow-type (input :workflow-type)) #:http.request.field{:name "workflowType", :shape "WorkflowType"})]}))

(clojure.core/defn- req-respond-activity-task-canceled-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]} (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :details)) #:http.request.field{:name "details", :shape "Data"}))))

(clojure.core/defn- req-respond-activity-task-completed-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]} (clojure.core/contains? input :result) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :result)) #:http.request.field{:name "result", :shape "Data"}))))

(clojure.core/defn- req-record-activity-task-heartbeat-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]} (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limited-data (input :details)) #:http.request.field{:name "details", :shape "LimitedData"}))))

(clojure.core/defn- req-terminate-workflow-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-workflow-id (input :workflow-id)) #:http.request.field{:name "workflowId", :shape "WorkflowId"})]} (clojure.core/contains? input :run-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-run-id-optional (input :run-id)) #:http.request.field{:name "runId", :shape "WorkflowRunIdOptional"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-terminate-reason (input :reason)) #:http.request.field{:name "reason", :shape "TerminateReason"})) (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :details)) #:http.request.field{:name "details", :shape "Data"})) (clojure.core/contains? input :child-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-policy (input :child-policy)) #:http.request.field{:name "childPolicy", :shape "ChildPolicy"}))))

(clojure.core/defn- req-describe-domain-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :name)) #:http.request.field{:name "name", :shape "DomainName"})]}))

(clojure.core/defn- req-list-open-workflow-executions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-execution-time-filter (input :start-time-filter)) #:http.request.field{:name "startTimeFilter", :shape "ExecutionTimeFilter"})]} (clojure.core/contains? input :type-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-type-filter (input :type-filter)) #:http.request.field{:name "typeFilter", :shape "WorkflowTypeFilter"})) (clojure.core/contains? input :tag-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter (input :tag-filter)) #:http.request.field{:name "tagFilter", :shape "TagFilter"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-page-token)) #:http.request.field{:name "nextPageToken", :shape "PageToken"})) (clojure.core/contains? input :maximum-page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :maximum-page-size)) #:http.request.field{:name "maximumPageSize", :shape "PageSize"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"})) (clojure.core/contains? input :execution-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-execution-filter (input :execution-filter)) #:http.request.field{:name "executionFilter", :shape "WorkflowExecutionFilter"}))))

(clojure.core/defn- req-describe-activity-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-activity-type (input :activity-type)) #:http.request.field{:name "activityType", :shape "ActivityType"})]}))

(clojure.core/defn- req-describe-workflow-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-workflow-type (input :workflow-type)) #:http.request.field{:name "workflowType", :shape "WorkflowType"})]}))

(clojure.core/defn- req-register-workflow-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-version (input :version)) #:http.request.field{:name "version", :shape "Version"})]} (clojure.core/contains? input :default-execution-start-to-close-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :default-execution-start-to-close-timeout)) #:http.request.field{:name "defaultExecutionStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :default-task-priority) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-priority (input :default-task-priority)) #:http.request.field{:name "defaultTaskPriority", :shape "TaskPriority"})) (clojure.core/contains? input :default-task-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-list (input :default-task-list)) #:http.request.field{:name "defaultTaskList", :shape "TaskList"})) (clojure.core/contains? input :default-task-start-to-close-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-in-seconds-optional (input :default-task-start-to-close-timeout)) #:http.request.field{:name "defaultTaskStartToCloseTimeout", :shape "DurationInSecondsOptional"})) (clojure.core/contains? input :default-child-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-policy (input :default-child-policy)) #:http.request.field{:name "defaultChildPolicy", :shape "ChildPolicy"})) (clojure.core/contains? input :default-lambda-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :default-lambda-role)) #:http.request.field{:name "defaultLambdaRole", :shape "Arn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-list-closed-workflow-executions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"})]} (clojure.core/contains? input :type-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-type-filter (input :type-filter)) #:http.request.field{:name "typeFilter", :shape "WorkflowTypeFilter"})) (clojure.core/contains? input :close-status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-close-status-filter (input :close-status-filter)) #:http.request.field{:name "closeStatusFilter", :shape "CloseStatusFilter"})) (clojure.core/contains? input :maximum-page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :maximum-page-size)) #:http.request.field{:name "maximumPageSize", :shape "PageSize"})) (clojure.core/contains? input :execution-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-execution-filter (input :execution-filter)) #:http.request.field{:name "executionFilter", :shape "WorkflowExecutionFilter"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"})) (clojure.core/contains? input :start-time-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-time-filter (input :start-time-filter)) #:http.request.field{:name "startTimeFilter", :shape "ExecutionTimeFilter"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-page-token)) #:http.request.field{:name "nextPageToken", :shape "PageToken"})) (clojure.core/contains? input :tag-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter (input :tag-filter)) #:http.request.field{:name "tagFilter", :shape "TagFilter"})) (clojure.core/contains? input :close-time-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-time-filter (input :close-time-filter)) #:http.request.field{:name "closeTimeFilter", :shape "ExecutionTimeFilter"}))))

(clojure.core/defn- req-count-pending-decision-tasks-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-task-list (input :task-list)) #:http.request.field{:name "taskList", :shape "TaskList"})]}))

(clojure.core/defn- req-respond-activity-task-failed-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]} (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-reason (input :reason)) #:http.request.field{:name "reason", :shape "FailureReason"})) (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :details)) #:http.request.field{:name "details", :shape "Data"}))))

(clojure.core/defn- req-count-closed-workflow-executions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"})]} (clojure.core/contains? input :start-time-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-time-filter (input :start-time-filter)) #:http.request.field{:name "startTimeFilter", :shape "ExecutionTimeFilter"})) (clojure.core/contains? input :close-time-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-time-filter (input :close-time-filter)) #:http.request.field{:name "closeTimeFilter", :shape "ExecutionTimeFilter"})) (clojure.core/contains? input :execution-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-execution-filter (input :execution-filter)) #:http.request.field{:name "executionFilter", :shape "WorkflowExecutionFilter"})) (clojure.core/contains? input :type-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-type-filter (input :type-filter)) #:http.request.field{:name "typeFilter", :shape "WorkflowTypeFilter"})) (clojure.core/contains? input :tag-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter (input :tag-filter)) #:http.request.field{:name "tagFilter", :shape "TagFilter"})) (clojure.core/contains? input :close-status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-close-status-filter (input :close-status-filter)) #:http.request.field{:name "closeStatusFilter", :shape "CloseStatusFilter"}))))

(clojure.core/defn- req-list-activity-types-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-registration-status (input :registration-status)) #:http.request.field{:name "registrationStatus", :shape "RegistrationStatus"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-page-token)) #:http.request.field{:name "nextPageToken", :shape "PageToken"})) (clojure.core/contains? input :maximum-page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :maximum-page-size)) #:http.request.field{:name "maximumPageSize", :shape "PageSize"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"}))))

(clojure.core/defn- req-list-domains-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-registration-status (input :registration-status)) #:http.request.field{:name "registrationStatus", :shape "RegistrationStatus"})]} (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-page-token)) #:http.request.field{:name "nextPageToken", :shape "PageToken"})) (clojure.core/contains? input :maximum-page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :maximum-page-size)) #:http.request.field{:name "maximumPageSize", :shape "PageSize"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"}))))

(clojure.core/defn- req-get-workflow-execution-history-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain)) #:http.request.field{:name "domain", :shape "DomainName"}) (clojure.core/into (ser-workflow-execution (input :execution)) #:http.request.field{:name "execution", :shape "WorkflowExecution"})]} (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-page-token)) #:http.request.field{:name "nextPageToken", :shape "PageToken"})) (clojure.core/contains? input :maximum-page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :maximum-page-size)) #:http.request.field{:name "maximumPageSize", :shape "PageSize"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"}))))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/continued-execution-run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/tag-list (clojure.spec.alpha/and :portkey.aws.swf/tag-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/parent-initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-started-event-attributes/parent-workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-started-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-started-event-attributes/child-policy :portkey.aws.swf.workflow-execution-started-event-attributes/task-list :portkey.aws.swf.workflow-execution-started-event-attributes/workflow-type] :opt-un [:portkey.aws.swf.workflow-execution-started-event-attributes/execution-start-to-close-timeout :portkey.aws.swf.workflow-execution-started-event-attributes/task-start-to-close-timeout :portkey.aws.swf.workflow-execution-started-event-attributes/continued-execution-run-id :portkey.aws.swf.workflow-execution-started-event-attributes/tag-list :portkey.aws.swf.workflow-execution-started-event-attributes/parent-initiated-event-id :portkey.aws.swf.workflow-execution-started-event-attributes/task-priority :portkey.aws.swf.workflow-execution-started-event-attributes/lambda-role :portkey.aws.swf.workflow-execution-started-event-attributes/input :portkey.aws.swf.workflow-execution-started-event-attributes/parent-workflow-execution]))

(clojure.spec.alpha/def :portkey.aws.swf/start-timer-failed-cause #{:timer-id-already-in-use :timer-creation-rate-exceeded "OPERATION_NOT_PERMITTED" "TIMER_ID_ALREADY_IN_USE" "OPEN_TIMERS_LIMIT_EXCEEDED" :open-timers-limit-exceeded "TIMER_CREATION_RATE_EXCEEDED" :operation-not-permitted})

(clojure.spec.alpha/def :portkey.aws.swf/fail-workflow-execution-failed-cause #{"UNHANDLED_DECISION" "OPERATION_NOT_PERMITTED" :operation-not-permitted :unhandled-decision})

(clojure.spec.alpha/def :portkey.aws.swf.workflow-type/name (clojure.spec.alpha/and :portkey.aws.swf/name))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type/version (clojure.spec.alpha/and :portkey.aws.swf/version))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-type (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-type/name :portkey.aws.swf.workflow-type/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-signaled-event-attributes/signal-name (clojure.spec.alpha/and :portkey.aws.swf/signal-name))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-signaled-event-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-signaled-event-attributes/external-workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-signaled-event-attributes/external-initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-signaled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-signaled-event-attributes/signal-name] :opt-un [:portkey.aws.swf.workflow-execution-signaled-event-attributes/input :portkey.aws.swf.workflow-execution-signaled-event-attributes/external-workflow-execution :portkey.aws.swf.workflow-execution-signaled-event-attributes/external-initiated-event-id]))

(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/signal-external-workflow-execution-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/signal-external-workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/workflow-id :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/cause :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/initiated-event-id :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/run-id :portkey.aws.swf.signal-external-workflow-execution-failed-event-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf.decision/cancel-workflow-execution-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/cancel-workflow-execution-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/record-marker-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/record-marker-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/fail-workflow-execution-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/fail-workflow-execution-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/continue-as-new-workflow-execution-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/continue-as-new-workflow-execution-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/complete-workflow-execution-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/complete-workflow-execution-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/request-cancel-activity-task-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/request-cancel-activity-task-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/start-child-workflow-execution-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/start-child-workflow-execution-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/request-cancel-external-workflow-execution-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/request-cancel-external-workflow-execution-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/schedule-lambda-function-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/schedule-lambda-function-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/signal-external-workflow-execution-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/signal-external-workflow-execution-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/schedule-activity-task-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/schedule-activity-task-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/decision-type (clojure.spec.alpha/and :portkey.aws.swf/decision-type))
(clojure.spec.alpha/def :portkey.aws.swf.decision/cancel-timer-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/cancel-timer-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.decision/start-timer-decision-attributes (clojure.spec.alpha/and :portkey.aws.swf/start-timer-decision-attributes))
(clojure.spec.alpha/def :portkey.aws.swf/decision (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.decision/decision-type] :opt-un [:portkey.aws.swf.decision/cancel-workflow-execution-decision-attributes :portkey.aws.swf.decision/record-marker-decision-attributes :portkey.aws.swf.decision/fail-workflow-execution-decision-attributes :portkey.aws.swf.decision/continue-as-new-workflow-execution-decision-attributes :portkey.aws.swf.decision/complete-workflow-execution-decision-attributes :portkey.aws.swf.decision/request-cancel-activity-task-decision-attributes :portkey.aws.swf.decision/start-child-workflow-execution-decision-attributes :portkey.aws.swf.decision/request-cancel-external-workflow-execution-decision-attributes :portkey.aws.swf.decision/schedule-lambda-function-decision-attributes :portkey.aws.swf.decision/signal-external-workflow-execution-decision-attributes :portkey.aws.swf.decision/schedule-activity-task-decision-attributes :portkey.aws.swf.decision/cancel-timer-decision-attributes :portkey.aws.swf.decision/start-timer-decision-attributes]))

(clojure.spec.alpha/def :portkey.aws.swf.count-open-workflow-executions-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.count-open-workflow-executions-input/start-time-filter (clojure.spec.alpha/and :portkey.aws.swf/execution-time-filter))
(clojure.spec.alpha/def :portkey.aws.swf.count-open-workflow-executions-input/type-filter (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-filter))
(clojure.spec.alpha/def :portkey.aws.swf.count-open-workflow-executions-input/tag-filter (clojure.spec.alpha/and :portkey.aws.swf/tag-filter))
(clojure.spec.alpha/def :portkey.aws.swf.count-open-workflow-executions-input/execution-filter (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-filter))
(clojure.spec.alpha/def :portkey.aws.swf/count-open-workflow-executions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.count-open-workflow-executions-input/domain :portkey.aws.swf.count-open-workflow-executions-input/start-time-filter] :opt-un [:portkey.aws.swf.count-open-workflow-executions-input/type-filter :portkey.aws.swf.count-open-workflow-executions-input/tag-filter :portkey.aws.swf.count-open-workflow-executions-input/execution-filter]))

(clojure.spec.alpha/def :portkey.aws.swf.external-workflow-execution-signaled-event-attributes/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.external-workflow-execution-signaled-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/external-workflow-execution-signaled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.external-workflow-execution-signaled-event-attributes/workflow-execution :portkey.aws.swf.external-workflow-execution-signaled-event-attributes/initiated-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.deprecate-domain-input/name (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf/deprecate-domain-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.deprecate-domain-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-detail/type-info (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-info))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-detail/configuration (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-configuration))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-type-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-type-detail/type-info :portkey.aws.swf.workflow-type-detail/configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.start-lambda-function-failed-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-lambda-function-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/start-lambda-function-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.start-lambda-function-failed-event-attributes/message (clojure.spec.alpha/and :portkey.aws.swf/cause-message))
(clojure.spec.alpha/def :portkey.aws.swf/start-lambda-function-failed-event-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.start-lambda-function-failed-event-attributes/scheduled-event-id :portkey.aws.swf.start-lambda-function-failed-event-attributes/cause :portkey.aws.swf.start-lambda-function-failed-event-attributes/message]))

(clojure.spec.alpha/def :portkey.aws.swf.record-marker-failed-event-attributes/marker-name (clojure.spec.alpha/and :portkey.aws.swf/marker-name))
(clojure.spec.alpha/def :portkey.aws.swf.record-marker-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/record-marker-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.record-marker-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/record-marker-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.record-marker-failed-event-attributes/marker-name :portkey.aws.swf.record-marker-failed-event-attributes/cause :portkey.aws.swf.record-marker-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.run/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id))
(clojure.spec.alpha/def :portkey.aws.swf/run (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.run/run-id]))

(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-failed-event-attributes/id (clojure.spec.alpha/and :portkey.aws.swf/function-id))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-failed-event-attributes/name (clojure.spec.alpha/and :portkey.aws.swf/function-name))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/schedule-lambda-function-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/schedule-lambda-function-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.schedule-lambda-function-failed-event-attributes/id :portkey.aws.swf.schedule-lambda-function-failed-event-attributes/name :portkey.aws.swf.schedule-lambda-function-failed-event-attributes/cause :portkey.aws.swf.schedule-lambda-function-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/request-cancel-activity-task-failed-cause #{"ACTIVITY_ID_UNKNOWN" "OPERATION_NOT_PERMITTED" :operation-not-permitted :activity-id-unknown})

(clojure.spec.alpha/def :portkey.aws.swf/workflow-run-id-optional (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.swf.activity-type-info/activity-type (clojure.spec.alpha/and :portkey.aws.swf/activity-type))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-info/status (clojure.spec.alpha/and :portkey.aws.swf/registration-status))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-info/description (clojure.spec.alpha/and :portkey.aws.swf/description))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-info/creation-date (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-info/deprecation-date (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf/activity-type-info (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-type-info/activity-type :portkey.aws.swf.activity-type-info/status :portkey.aws.swf.activity-type-info/creation-date] :opt-un [:portkey.aws.swf.activity-type-info/description :portkey.aws.swf.activity-type-info/deprecation-date]))

(clojure.spec.alpha/def :portkey.aws.swf.marker-recorded-event-attributes/marker-name (clojure.spec.alpha/and :portkey.aws.swf/marker-name))
(clojure.spec.alpha/def :portkey.aws.swf.marker-recorded-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.marker-recorded-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/marker-recorded-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.marker-recorded-event-attributes/marker-name :portkey.aws.swf.marker-recorded-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.marker-recorded-event-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-infos/type-infos (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-info-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-infos/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-type-infos (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-type-infos/type-infos] :opt-un [:portkey.aws.swf.workflow-type-infos/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.swf/lambda-function-timeout-type #{:start-to-close "START_TO_CLOSE"})

(clojure.spec.alpha/def :portkey.aws.swf/limited-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.swf/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-type-info-list (clojure.spec.alpha/coll-of :portkey.aws.swf/workflow-type-info))

(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-completed-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-completed-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-completed-event-attributes/result (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/lambda-function-completed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.lambda-function-completed-event-attributes/scheduled-event-id :portkey.aws.swf.lambda-function-completed-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.lambda-function-completed-event-attributes/result]))

(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-activity-task-decision-attributes/activity-id (clojure.spec.alpha/and :portkey.aws.swf/activity-id))
(clojure.spec.alpha/def :portkey.aws.swf/request-cancel-activity-task-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.request-cancel-activity-task-decision-attributes/activity-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/page-size (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution/workflow-id :portkey.aws.swf.workflow-execution/run-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-filter/name (clojure.spec.alpha/and :portkey.aws.swf/name))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-filter/version (clojure.spec.alpha/and :portkey.aws.swf/version-optional))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-type-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-type-filter/name] :opt-un [:portkey.aws.swf.workflow-type-filter/version]))

(clojure.spec.alpha/def :portkey.aws.swf.operation-not-permitted-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/operation-not-permitted-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.operation-not-permitted-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf/request-cancel-external-workflow-execution-failed-cause #{:unknown-external-workflow-execution "OPERATION_NOT_PERMITTED" "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" :request-cancel-external-workflow-execution-rate-exceeded "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" :operation-not-permitted})

(clojure.spec.alpha/def :portkey.aws.swf.default-undefined-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/default-undefined-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.default-undefined-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-failed-event-attributes/reason (clojure.spec.alpha/and :portkey.aws.swf/failure-reason))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-failed-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-failed-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-failed-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-failed-event-attributes/scheduled-event-id :portkey.aws.swf.activity-task-failed-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.activity-task-failed-event-attributes/reason :portkey.aws.swf.activity-task-failed-event-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/start-child-workflow-execution-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/start-child-workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/workflow-type :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/cause :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/workflow-id :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/initiated-event-id :portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.start-child-workflow-execution-failed-event-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf.timer-started-event-attributes/timer-id (clojure.spec.alpha/and :portkey.aws.swf/timer-id))
(clojure.spec.alpha/def :portkey.aws.swf.timer-started-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.timer-started-event-attributes/start-to-fire-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.swf.timer-started-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/timer-started-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.timer-started-event-attributes/timer-id :portkey.aws.swf.timer-started-event-attributes/start-to-fire-timeout :portkey.aws.swf.timer-started-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.timer-started-event-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf.record-marker-decision-attributes/marker-name (clojure.spec.alpha/and :portkey.aws.swf/marker-name))
(clojure.spec.alpha/def :portkey.aws.swf.record-marker-decision-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/record-marker-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.record-marker-decision-attributes/marker-name] :opt-un [:portkey.aws.swf.record-marker-decision-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf.activity-task/task-token (clojure.spec.alpha/and :portkey.aws.swf/task-token))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task/activity-id (clojure.spec.alpha/and :portkey.aws.swf/activity-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task/activity-type (clojure.spec.alpha/and :portkey.aws.swf/activity-type))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task/task-token :portkey.aws.swf.activity-task/activity-id :portkey.aws.swf.activity-task/started-event-id :portkey.aws.swf.activity-task/workflow-execution :portkey.aws.swf.activity-task/activity-type] :opt-un [:portkey.aws.swf.activity-task/input]))

(clojure.spec.alpha/def :portkey.aws.swf/open-decision-tasks-count (clojure.spec.alpha/int-in 0 1))

(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-canceled-event-attributes/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-canceled-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-canceled-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-canceled-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-canceled-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/child-workflow-execution-canceled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.child-workflow-execution-canceled-event-attributes/workflow-execution :portkey.aws.swf.child-workflow-execution-canceled-event-attributes/workflow-type :portkey.aws.swf.child-workflow-execution-canceled-event-attributes/initiated-event-id :portkey.aws.swf.child-workflow-execution-canceled-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.child-workflow-execution-canceled-event-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf/schedule-activity-task-failed-cause #{"DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED" :default-heartbeat-timeout-undefined :activity-type-does-not-exist :activity-type-deprecated :default-task-list-undefined :default-start-to-close-timeout-undefined "ACTIVITY_TYPE_DEPRECATED" "OPEN_ACTIVITIES_LIMIT_EXCEEDED" :default-schedule-to-start-timeout-undefined "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED" "OPERATION_NOT_PERMITTED" :open-activities-limit-exceeded :activity-creation-rate-exceeded "ACTIVITY_TYPE_DOES_NOT_EXIST" "ACTIVITY_CREATION_RATE_EXCEEDED" :activity-id-already-in-use "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED" :default-schedule-to-close-timeout-undefined "ACTIVITY_ID_ALREADY_IN_USE" "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED" :operation-not-permitted "DEFAULT_TASK_LIST_UNDEFINED"})

(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/continue-as-new-workflow-execution-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/continue-as-new-workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.continue-as-new-workflow-execution-failed-event-attributes/cause :portkey.aws.swf.continue-as-new-workflow-execution-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/registration-status #{"DEPRECATED" "REGISTERED" :deprecated :registered})

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-canceled-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-canceled-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-canceled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-canceled-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.workflow-execution-canceled-event-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-timed-out-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-timed-out-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-timed-out-event-attributes/timeout-type (clojure.spec.alpha/and :portkey.aws.swf/lambda-function-timeout-type))
(clojure.spec.alpha/def :portkey.aws.swf/lambda-function-timed-out-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.lambda-function-timed-out-event-attributes/scheduled-event-id :portkey.aws.swf.lambda-function-timed-out-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.lambda-function-timed-out-event-attributes/timeout-type]))

(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-workflow-execution-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-workflow-execution-input/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-workflow-execution-input/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf/request-cancel-workflow-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.request-cancel-workflow-execution-input/domain :portkey.aws.swf.request-cancel-workflow-execution-input/workflow-id] :opt-un [:portkey.aws.swf.request-cancel-workflow-execution-input/run-id]))

(clojure.spec.alpha/def :portkey.aws.swf.decision-task/task-token (clojure.spec.alpha/and :portkey.aws.swf/task-token))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task/events (clojure.spec.alpha/and :portkey.aws.swf/history-event-list))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task/previous-started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/decision-task (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.decision-task/task-token :portkey.aws.swf.decision-task/started-event-id :portkey.aws.swf.decision-task/workflow-execution :portkey.aws.swf.decision-task/workflow-type :portkey.aws.swf.decision-task/events] :opt-un [:portkey.aws.swf.decision-task/next-page-token :portkey.aws.swf.decision-task/previous-started-event-id]))

(clojure.spec.alpha/def :portkey.aws.swf.domain-infos/domain-infos (clojure.spec.alpha/and :portkey.aws.swf/domain-info-list))
(clojure.spec.alpha/def :portkey.aws.swf.domain-infos/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf/domain-infos (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.domain-infos/domain-infos] :opt-un [:portkey.aws.swf.domain-infos/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.swf/truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-completed-event-attributes/result (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-completed-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-completed-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-completed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-completed-event-attributes/scheduled-event-id :portkey.aws.swf.activity-task-completed-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.activity-task-completed-event-attributes/result]))

(clojure.spec.alpha/def :portkey.aws.swf/cancel-workflow-execution-failed-cause #{"UNHANDLED_DECISION" "OPERATION_NOT_PERMITTED" :operation-not-permitted :unhandled-decision})

(clojure.spec.alpha/def :portkey.aws.swf/history-event-list (clojure.spec.alpha/coll-of :portkey.aws.swf/history-event))

(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-failed-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-failed-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-failed-event-attributes/reason (clojure.spec.alpha/and :portkey.aws.swf/failure-reason))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-failed-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/lambda-function-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.lambda-function-failed-event-attributes/scheduled-event-id :portkey.aws.swf.lambda-function-failed-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.lambda-function-failed-event-attributes/reason :portkey.aws.swf.lambda-function-failed-event-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-configuration/task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-configuration/execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-configuration/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-configuration/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-configuration/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-configuration/lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-configuration/task-start-to-close-timeout :portkey.aws.swf.workflow-execution-configuration/execution-start-to-close-timeout :portkey.aws.swf.workflow-execution-configuration/task-list :portkey.aws.swf.workflow-execution-configuration/child-policy] :opt-un [:portkey.aws.swf.workflow-execution-configuration/task-priority :portkey.aws.swf.workflow-execution-configuration/lambda-role]))

(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-decision-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-decision-attributes/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-decision-attributes/signal-name (clojure.spec.alpha/and :portkey.aws.swf/signal-name))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-decision-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-decision-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/signal-external-workflow-execution-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.signal-external-workflow-execution-decision-attributes/workflow-id :portkey.aws.swf.signal-external-workflow-execution-decision-attributes/signal-name] :opt-un [:portkey.aws.swf.signal-external-workflow-execution-decision-attributes/run-id :portkey.aws.swf.signal-external-workflow-execution-decision-attributes/input :portkey.aws.swf.signal-external-workflow-execution-decision-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf/start-child-workflow-execution-failed-cause #{"CHILD_CREATION_RATE_EXCEEDED" "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" :default-task-list-undefined :workflow-type-deprecated "WORKFLOW_TYPE_DEPRECATED" :workflow-type-does-not-exist :default-execution-start-to-close-timeout-undefined :default-task-start-to-close-timeout-undefined "DEFAULT_CHILD_POLICY_UNDEFINED" "OPERATION_NOT_PERMITTED" :workflow-already-running :open-workflows-limit-exceeded "WORKFLOW_ALREADY_RUNNING" :default-child-policy-undefined :child-creation-rate-exceeded :open-children-limit-exceeded "OPEN_WORKFLOWS_LIMIT_EXCEEDED" "OPEN_CHILDREN_LIMIT_EXCEEDED" "WORKFLOW_TYPE_DOES_NOT_EXIST" "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" :operation-not-permitted "DEFAULT_TASK_LIST_UNDEFINED"})

(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-decision-attributes/id (clojure.spec.alpha/and :portkey.aws.swf/function-id))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-decision-attributes/name (clojure.spec.alpha/and :portkey.aws.swf/function-name))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-decision-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-decision-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/function-input))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-lambda-function-decision-attributes/start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf/schedule-lambda-function-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.schedule-lambda-function-decision-attributes/id :portkey.aws.swf.schedule-lambda-function-decision-attributes/name] :opt-un [:portkey.aws.swf.schedule-lambda-function-decision-attributes/control :portkey.aws.swf.schedule-lambda-function-decision-attributes/input :portkey.aws.swf.schedule-lambda-function-decision-attributes/start-to-close-timeout]))

(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-activity-task-failed-event-attributes/activity-id (clojure.spec.alpha/and :portkey.aws.swf/activity-id))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-activity-task-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/request-cancel-activity-task-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-activity-task-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/request-cancel-activity-task-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.request-cancel-activity-task-failed-event-attributes/activity-id :portkey.aws.swf.request-cancel-activity-task-failed-event-attributes/cause :portkey.aws.swf.request-cancel-activity-task-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/activity-task-timeout-type #{"SCHEDULE_TO_START" :heartbeat "HEARTBEAT" :start-to-close :schedule-to-close :schedule-to-start "SCHEDULE_TO_CLOSE" "START_TO_CLOSE"})

(clojure.spec.alpha/def :portkey.aws.swf/count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.swf/domain-info-list (clojure.spec.alpha/coll-of :portkey.aws.swf/domain-info))

(clojure.spec.alpha/def :portkey.aws.swf.describe-workflow-execution-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.describe-workflow-execution-input/execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf/describe-workflow-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.describe-workflow-execution-input/domain :portkey.aws.swf.describe-workflow-execution-input/execution] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/cause-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1728))))

(clojure.spec.alpha/def :portkey.aws.swf.count-pending-activity-tasks-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.count-pending-activity-tasks-input/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf/count-pending-activity-tasks-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.count-pending-activity-tasks-input/domain :portkey.aws.swf.count-pending-activity-tasks-input/task-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/child-policy #{:abandon "REQUEST_CANCEL" :terminate :request-cancel "TERMINATE" "ABANDON"})

(clojure.spec.alpha/def :portkey.aws.swf.poll-for-decision-task-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.poll-for-decision-task-input/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.poll-for-decision-task-input/identity (clojure.spec.alpha/and :portkey.aws.swf/identity))
(clojure.spec.alpha/def :portkey.aws.swf.poll-for-decision-task-input/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf.poll-for-decision-task-input/maximum-page-size (clojure.spec.alpha/and :portkey.aws.swf/page-size))
(clojure.spec.alpha/def :portkey.aws.swf.poll-for-decision-task-input/reverse-order (clojure.spec.alpha/and :portkey.aws.swf/reverse-order))
(clojure.spec.alpha/def :portkey.aws.swf/poll-for-decision-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.poll-for-decision-task-input/domain :portkey.aws.swf.poll-for-decision-task-input/task-list] :opt-un [:portkey.aws.swf.poll-for-decision-task-input/identity :portkey.aws.swf.poll-for-decision-task-input/next-page-token :portkey.aws.swf.poll-for-decision-task-input/maximum-page-size :portkey.aws.swf.poll-for-decision-task-input/reverse-order]))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-timeout-type #{:start-to-close "START_TO_CLOSE"})

(clojure.spec.alpha/def :portkey.aws.swf/duration-in-days (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8))))

(clojure.spec.alpha/def :portkey.aws.swf.execution-time-filter/oldest-date (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf.execution-time-filter/latest-date (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf/execution-time-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.execution-time-filter/oldest-date] :opt-un [:portkey.aws.swf.execution-time-filter/latest-date]))

(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/default-task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/default-task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/default-task-heartbeat-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/default-task-schedule-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/default-task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/name (clojure.spec.alpha/and :portkey.aws.swf/name))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/default-task-schedule-to-start-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/version (clojure.spec.alpha/and :portkey.aws.swf/version))
(clojure.spec.alpha/def :portkey.aws.swf.register-activity-type-input/description (clojure.spec.alpha/and :portkey.aws.swf/description))
(clojure.spec.alpha/def :portkey.aws.swf/register-activity-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.register-activity-type-input/domain :portkey.aws.swf.register-activity-type-input/name :portkey.aws.swf.register-activity-type-input/version] :opt-un [:portkey.aws.swf.register-activity-type-input/default-task-priority :portkey.aws.swf.register-activity-type-input/default-task-list :portkey.aws.swf.register-activity-type-input/default-task-heartbeat-timeout :portkey.aws.swf.register-activity-type-input/default-task-schedule-to-close-timeout :portkey.aws.swf.register-activity-type-input/default-task-start-to-close-timeout :portkey.aws.swf.register-activity-type-input/default-task-schedule-to-start-timeout :portkey.aws.swf.register-activity-type-input/description]))

(clojure.spec.alpha/def :portkey.aws.swf.task-list/name (clojure.spec.alpha/and :portkey.aws.swf/name))
(clojure.spec.alpha/def :portkey.aws.swf/task-list (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.task-list/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/tag-list (clojure.spec.alpha/and :portkey.aws.swf/tag-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/new-execution-run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-continued-as-new-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/decision-task-completed-event-id :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/new-execution-run-id :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/task-list :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/child-policy :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/workflow-type] :opt-un [:portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/execution-start-to-close-timeout :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/task-start-to-close-timeout :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/tag-list :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/task-priority :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/lambda-role :portkey.aws.swf.workflow-execution-continued-as-new-event-attributes/input]))

(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-failed-event-attributes/activity-type (clojure.spec.alpha/and :portkey.aws.swf/activity-type))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-failed-event-attributes/activity-id (clojure.spec.alpha/and :portkey.aws.swf/activity-id))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/schedule-activity-task-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/schedule-activity-task-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.schedule-activity-task-failed-event-attributes/activity-type :portkey.aws.swf.schedule-activity-task-failed-event-attributes/activity-id :portkey.aws.swf.schedule-activity-task-failed-event-attributes/cause :portkey.aws.swf.schedule-activity-task-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.list-workflow-types-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.list-workflow-types-input/name (clojure.spec.alpha/and :portkey.aws.swf/name))
(clojure.spec.alpha/def :portkey.aws.swf.list-workflow-types-input/registration-status (clojure.spec.alpha/and :portkey.aws.swf/registration-status))
(clojure.spec.alpha/def :portkey.aws.swf.list-workflow-types-input/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf.list-workflow-types-input/maximum-page-size (clojure.spec.alpha/and :portkey.aws.swf/page-size))
(clojure.spec.alpha/def :portkey.aws.swf.list-workflow-types-input/reverse-order (clojure.spec.alpha/and :portkey.aws.swf/reverse-order))
(clojure.spec.alpha/def :portkey.aws.swf/list-workflow-types-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.list-workflow-types-input/domain :portkey.aws.swf.list-workflow-types-input/registration-status] :opt-un [:portkey.aws.swf.list-workflow-types-input/name :portkey.aws.swf.list-workflow-types-input/next-page-token :portkey.aws.swf.list-workflow-types-input/maximum-page-size :portkey.aws.swf.list-workflow-types-input/reverse-order]))

(clojure.spec.alpha/def :portkey.aws.swf.respond-decision-task-completed-input/task-token (clojure.spec.alpha/and :portkey.aws.swf/task-token))
(clojure.spec.alpha/def :portkey.aws.swf.respond-decision-task-completed-input/decisions (clojure.spec.alpha/and :portkey.aws.swf/decision-list))
(clojure.spec.alpha/def :portkey.aws.swf.respond-decision-task-completed-input/execution-context (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/respond-decision-task-completed-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.respond-decision-task-completed-input/task-token] :opt-un [:portkey.aws.swf.respond-decision-task-completed-input/decisions :portkey.aws.swf.respond-decision-task-completed-input/execution-context]))

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-canceled-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-canceled-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-canceled-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-canceled-event-attributes/latest-cancel-requested-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-canceled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-canceled-event-attributes/scheduled-event-id :portkey.aws.swf.activity-task-canceled-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.activity-task-canceled-event-attributes/details :portkey.aws.swf.activity-task-canceled-event-attributes/latest-cancel-requested-event-id]))

(clojure.spec.alpha/def :portkey.aws.swf/event-type #{"WorkflowExecutionStarted" "CompleteWorkflowExecutionFailed" :lambda-function-timed-out :workflow-execution-completed :workflow-execution-started :cancel-timer-failed :signal-external-workflow-execution-initiated "SignalExternalWorkflowExecutionInitiated" "StartTimerFailed" :child-workflow-execution-completed "StartChildWorkflowExecutionInitiated" "DecisionTaskCompleted" "DecisionTaskStarted" :start-child-workflow-execution-initiated "TimerFired" :external-workflow-execution-signaled "ChildWorkflowExecutionTerminated" "ChildWorkflowExecutionFailed" "ActivityTaskFailed" "ChildWorkflowExecutionCanceled" "DecisionTaskTimedOut" "StartLambdaFunctionFailed" :workflow-execution-terminated "WorkflowExecutionCanceled" "ChildWorkflowExecutionCompleted" :timer-started :external-workflow-execution-cancel-requested "ExternalWorkflowExecutionCancelRequested" :workflow-execution-continued-as-new :signal-external-workflow-execution-failed "LambdaFunctionScheduled" :activity-task-cancel-requested "ScheduleActivityTaskFailed" "ActivityTaskScheduled" "WorkflowExecutionTimedOut" :timer-fired "ActivityTaskCanceled" :start-lambda-function-failed "StartChildWorkflowExecutionFailed" :decision-task-completed "ActivityTaskCancelRequested" "ChildWorkflowExecutionStarted" :child-workflow-execution-failed "LambdaFunctionCompleted" :schedule-activity-task-failed :request-cancel-external-workflow-execution-failed :workflow-execution-failed "TimerCanceled" :decision-task-timed-out :activity-task-failed :child-workflow-execution-started "CancelWorkflowExecutionFailed" "RequestCancelExternalWorkflowExecutionFailed" :lambda-function-failed :workflow-execution-canceled "WorkflowExecutionFailed" :activity-task-canceled "FailWorkflowExecutionFailed" "MarkerRecorded" :activity-task-scheduled "WorkflowExecutionContinuedAsNew" "LambdaFunctionFailed" :continue-as-new-workflow-execution-failed :fail-workflow-execution-failed :activity-task-completed :complete-workflow-execution-failed "ScheduleLambdaFunctionFailed" :activity-task-timed-out :request-cancel-activity-task-failed "TimerStarted" :child-workflow-execution-timed-out "WorkflowExecutionTerminated" "CancelTimerFailed" "ExternalWorkflowExecutionSignaled" :start-timer-failed "ContinueAsNewWorkflowExecutionFailed" "LambdaFunctionTimedOut" :schedule-lambda-function-failed "LambdaFunctionStarted" "SignalExternalWorkflowExecutionFailed" :decision-task-started :start-child-workflow-execution-failed :lambda-function-started :lambda-function-completed "DecisionTaskScheduled" :child-workflow-execution-canceled :child-workflow-execution-terminated :activity-task-started :workflow-execution-timed-out "ActivityTaskCompleted" :record-marker-failed "ChildWorkflowExecutionTimedOut" :timer-canceled :cancel-workflow-execution-failed "RequestCancelActivityTaskFailed" :workflow-execution-signaled "RequestCancelExternalWorkflowExecutionInitiated" "WorkflowExecutionSignaled" "WorkflowExecutionCompleted" :lambda-function-scheduled :marker-recorded "ActivityTaskStarted" :request-cancel-external-workflow-execution-initiated "WorkflowExecutionCancelRequested" :workflow-execution-cancel-requested "RecordMarkerFailed" "ActivityTaskTimedOut" :decision-task-scheduled})

(clojure.spec.alpha/def :portkey.aws.swf.register-domain-input/name (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.register-domain-input/description (clojure.spec.alpha/and :portkey.aws.swf/description))
(clojure.spec.alpha/def :portkey.aws.swf.register-domain-input/workflow-execution-retention-period-in-days (clojure.spec.alpha/and :portkey.aws.swf/duration-in-days))
(clojure.spec.alpha/def :portkey.aws.swf/register-domain-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.register-domain-input/name :portkey.aws.swf.register-domain-input/workflow-execution-retention-period-in-days] :opt-un [:portkey.aws.swf.register-domain-input/description]))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-run-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.swf.domain-deprecated-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/domain-deprecated-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.domain-deprecated-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/tag-list (clojure.spec.alpha/and :portkey.aws.swf/tag-list))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.start-workflow-execution-input/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf/start-workflow-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.start-workflow-execution-input/domain :portkey.aws.swf.start-workflow-execution-input/workflow-id :portkey.aws.swf.start-workflow-execution-input/workflow-type] :opt-un [:portkey.aws.swf.start-workflow-execution-input/execution-start-to-close-timeout :portkey.aws.swf.start-workflow-execution-input/task-start-to-close-timeout :portkey.aws.swf.start-workflow-execution-input/tag-list :portkey.aws.swf.start-workflow-execution-input/task-list :portkey.aws.swf.start-workflow-execution-input/task-priority :portkey.aws.swf.start-workflow-execution-input/lambda-role :portkey.aws.swf.start-workflow-execution-input/input :portkey.aws.swf.start-workflow-execution-input/child-policy]))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-info-list (clojure.spec.alpha/coll-of :portkey.aws.swf/workflow-execution-info))

(clojure.spec.alpha/def :portkey.aws.swf/task-priority (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.swf.poll-for-activity-task-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.poll-for-activity-task-input/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.poll-for-activity-task-input/identity (clojure.spec.alpha/and :portkey.aws.swf/identity))
(clojure.spec.alpha/def :portkey.aws.swf/poll-for-activity-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.poll-for-activity-task-input/domain :portkey.aws.swf.poll-for-activity-task-input/task-list] :opt-un [:portkey.aws.swf.poll-for-activity-task-input/identity]))

(clojure.spec.alpha/def :portkey.aws.swf.deprecate-activity-type-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.deprecate-activity-type-input/activity-type (clojure.spec.alpha/and :portkey.aws.swf/activity-type))
(clojure.spec.alpha/def :portkey.aws.swf/deprecate-activity-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.deprecate-activity-type-input/domain :portkey.aws.swf.deprecate-activity-type-input/activity-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.signal-workflow-execution-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.signal-workflow-execution-input/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.signal-workflow-execution-input/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.signal-workflow-execution-input/signal-name (clojure.spec.alpha/and :portkey.aws.swf/signal-name))
(clojure.spec.alpha/def :portkey.aws.swf.signal-workflow-execution-input/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/signal-workflow-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.signal-workflow-execution-input/domain :portkey.aws.swf.signal-workflow-execution-input/workflow-id :portkey.aws.swf.signal-workflow-execution-input/signal-name] :opt-un [:portkey.aws.swf.signal-workflow-execution-input/run-id :portkey.aws.swf.signal-workflow-execution-input/input]))

(clojure.spec.alpha/def :portkey.aws.swf.deprecate-workflow-type-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.deprecate-workflow-type-input/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf/deprecate-workflow-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.deprecate-workflow-type-input/domain :portkey.aws.swf.deprecate-workflow-type-input/workflow-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.history/events (clojure.spec.alpha/and :portkey.aws.swf/history-event-list))
(clojure.spec.alpha/def :portkey.aws.swf.history/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf/history (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.history/events] :opt-un [:portkey.aws.swf.history/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.swf.decision-task-timed-out-event-attributes/timeout-type (clojure.spec.alpha/and :portkey.aws.swf/decision-task-timeout-type))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task-timed-out-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task-timed-out-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/decision-task-timed-out-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.decision-task-timed-out-event-attributes/timeout-type :portkey.aws.swf.decision-task-timed-out-event-attributes/scheduled-event-id :portkey.aws.swf.decision-task-timed-out-event-attributes/started-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.pending-task-count/count (clojure.spec.alpha/and :portkey.aws.swf/count))
(clojure.spec.alpha/def :portkey.aws.swf.pending-task-count/truncated (clojure.spec.alpha/and :portkey.aws.swf/truncated))
(clojure.spec.alpha/def :portkey.aws.swf/pending-task-count (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.pending-task-count/count] :opt-un [:portkey.aws.swf.pending-task-count/truncated]))

(clojure.spec.alpha/def :portkey.aws.swf.activity-type-configuration/default-task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-configuration/default-task-heartbeat-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-configuration/default-task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-configuration/default-task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-configuration/default-task-schedule-to-start-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-configuration/default-task-schedule-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf/activity-type-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.activity-type-configuration/default-task-start-to-close-timeout :portkey.aws.swf.activity-type-configuration/default-task-heartbeat-timeout :portkey.aws.swf.activity-type-configuration/default-task-list :portkey.aws.swf.activity-type-configuration/default-task-priority :portkey.aws.swf.activity-type-configuration/default-task-schedule-to-start-timeout :portkey.aws.swf.activity-type-configuration/default-task-schedule-to-close-timeout]))

(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/timeout-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-timeout-type))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/child-workflow-execution-timed-out-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/workflow-execution :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/workflow-type :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/timeout-type :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/initiated-event-id :portkey.aws.swf.child-workflow-execution-timed-out-event-attributes/started-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/tag-list (clojure.spec.alpha/coll-of :portkey.aws.swf/tag :max-count 5))

(clojure.spec.alpha/def :portkey.aws.swf/duration-in-seconds (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8))))

(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-canceled-input/task-token (clojure.spec.alpha/and :portkey.aws.swf/task-token))
(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-canceled-input/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/respond-activity-task-canceled-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.respond-activity-task-canceled-input/task-token] :opt-un [:portkey.aws.swf.respond-activity-task-canceled-input/details]))

(clojure.spec.alpha/def :portkey.aws.swf/duration-in-seconds-optional (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8))))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-filter/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-filter/workflow-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/continue-as-new-workflow-execution-failed-cause #{"DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" :default-task-list-undefined :workflow-type-deprecated "WORKFLOW_TYPE_DEPRECATED" :workflow-type-does-not-exist "UNHANDLED_DECISION" :default-execution-start-to-close-timeout-undefined :default-task-start-to-close-timeout-undefined "DEFAULT_CHILD_POLICY_UNDEFINED" "OPERATION_NOT_PERMITTED" "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED" :default-child-policy-undefined :continue-as-new-workflow-execution-rate-exceeded "WORKFLOW_TYPE_DOES_NOT_EXIST" "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" :operation-not-permitted "DEFAULT_TASK_LIST_UNDEFINED" :unhandled-decision})

(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-completed-event-attributes/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-completed-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-completed-event-attributes/result (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-completed-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-completed-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/child-workflow-execution-completed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.child-workflow-execution-completed-event-attributes/workflow-execution :portkey.aws.swf.child-workflow-execution-completed-event-attributes/workflow-type :portkey.aws.swf.child-workflow-execution-completed-event-attributes/initiated-event-id :portkey.aws.swf.child-workflow-execution-completed-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.child-workflow-execution-completed-event-attributes/result]))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-cancel-requested-event-attributes/external-workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-cancel-requested-event-attributes/external-initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-cancel-requested-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-cancel-requested-cause))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-cancel-requested-event-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.workflow-execution-cancel-requested-event-attributes/external-workflow-execution :portkey.aws.swf.workflow-execution-cancel-requested-event-attributes/external-initiated-event-id :portkey.aws.swf.workflow-execution-cancel-requested-event-attributes/cause]))

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-cancel-requested-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-cancel-requested-event-attributes/activity-id (clojure.spec.alpha/and :portkey.aws.swf/activity-id))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-cancel-requested-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-cancel-requested-event-attributes/decision-task-completed-event-id :portkey.aws.swf.activity-task-cancel-requested-event-attributes/activity-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/activity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-count/count (clojure.spec.alpha/and :portkey.aws.swf/count))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-count/truncated (clojure.spec.alpha/and :portkey.aws.swf/truncated))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-count (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-count/count] :opt-un [:portkey.aws.swf.workflow-execution-count/truncated]))

(clojure.spec.alpha/def :portkey.aws.swf.activity-type/name (clojure.spec.alpha/and :portkey.aws.swf/name))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type/version (clojure.spec.alpha/and :portkey.aws.swf/version))
(clojure.spec.alpha/def :portkey.aws.swf/activity-type (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-type/name :portkey.aws.swf.activity-type/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.fail-workflow-execution-decision-attributes/reason (clojure.spec.alpha/and :portkey.aws.swf/failure-reason))
(clojure.spec.alpha/def :portkey.aws.swf.fail-workflow-execution-decision-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/fail-workflow-execution-decision-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.fail-workflow-execution-decision-attributes/reason :portkey.aws.swf.fail-workflow-execution-decision-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf.limit-exceeded-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/limit-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.limit-exceeded-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/tag-list (clojure.spec.alpha/and :portkey.aws.swf/tag-list))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/start-child-workflow-execution-initiated-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/workflow-id :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/workflow-type :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/task-list :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/decision-task-completed-event-id :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/child-policy] :opt-un [:portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/execution-start-to-close-timeout :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/task-start-to-close-timeout :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/tag-list :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/task-priority :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/control :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/lambda-role :portkey.aws.swf.start-child-workflow-execution-initiated-event-attributes/input]))

(clojure.spec.alpha/def :portkey.aws.swf/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-completed-input/task-token (clojure.spec.alpha/and :portkey.aws.swf/task-token))
(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-completed-input/result (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/respond-activity-task-completed-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.respond-activity-task-completed-input/task-token] :opt-un [:portkey.aws.swf.respond-activity-task-completed-input/result]))

(clojure.spec.alpha/def :portkey.aws.swf.type-already-exists-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/type-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.type-already-exists-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf.complete-workflow-execution-decision-attributes/result (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/complete-workflow-execution-decision-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.complete-workflow-execution-decision-attributes/result]))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/close-timestamp (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/parent (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/cancel-requested (clojure.spec.alpha/and :portkey.aws.swf/canceled))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/close-status (clojure.spec.alpha/and :portkey.aws.swf/close-status))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/tag-list (clojure.spec.alpha/and :portkey.aws.swf/tag-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/start-timestamp (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-info/execution-status (clojure.spec.alpha/and :portkey.aws.swf/execution-status))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-info (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-info/execution :portkey.aws.swf.workflow-execution-info/workflow-type :portkey.aws.swf.workflow-execution-info/start-timestamp :portkey.aws.swf.workflow-execution-info/execution-status] :opt-un [:portkey.aws.swf.workflow-execution-info/close-timestamp :portkey.aws.swf.workflow-execution-info/parent :portkey.aws.swf.workflow-execution-info/cancel-requested :portkey.aws.swf.workflow-execution-info/close-status :portkey.aws.swf.workflow-execution-info/tag-list]))

(clojure.spec.alpha/def :portkey.aws.swf/decision-task-timeout-type #{:start-to-close "START_TO_CLOSE"})

(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-terminated-event-attributes/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-terminated-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-terminated-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-terminated-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/child-workflow-execution-terminated-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.child-workflow-execution-terminated-event-attributes/workflow-execution :portkey.aws.swf.child-workflow-execution-terminated-event-attributes/workflow-type :portkey.aws.swf.child-workflow-execution-terminated-event-attributes/initiated-event-id :portkey.aws.swf.child-workflow-execution-terminated-event-attributes/started-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.activity-type-detail/type-info (clojure.spec.alpha/and :portkey.aws.swf/activity-type-info))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-detail/configuration (clojure.spec.alpha/and :portkey.aws.swf/activity-type-configuration))
(clojure.spec.alpha/def :portkey.aws.swf/activity-type-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-type-detail/type-info :portkey.aws.swf.activity-type-detail/configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.cancel-timer-decision-attributes/timer-id (clojure.spec.alpha/and :portkey.aws.swf/timer-id))
(clojure.spec.alpha/def :portkey.aws.swf/cancel-timer-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.cancel-timer-decision-attributes/timer-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/failure-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-timed-out-event-attributes/timeout-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-timeout-type))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-timed-out-event-attributes/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-timed-out-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-timed-out-event-attributes/timeout-type :portkey.aws.swf.workflow-execution-timed-out-event-attributes/child-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.record-activity-task-heartbeat-input/task-token (clojure.spec.alpha/and :portkey.aws.swf/task-token))
(clojure.spec.alpha/def :portkey.aws.swf.record-activity-task-heartbeat-input/details (clojure.spec.alpha/and :portkey.aws.swf/limited-data))
(clojure.spec.alpha/def :portkey.aws.swf/record-activity-task-heartbeat-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.record-activity-task-heartbeat-input/task-token] :opt-un [:portkey.aws.swf.record-activity-task-heartbeat-input/details]))

(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/tag-list (clojure.spec.alpha/and :portkey.aws.swf/tag-list))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.start-child-workflow-execution-decision-attributes/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf/start-child-workflow-execution-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.start-child-workflow-execution-decision-attributes/workflow-type :portkey.aws.swf.start-child-workflow-execution-decision-attributes/workflow-id] :opt-un [:portkey.aws.swf.start-child-workflow-execution-decision-attributes/execution-start-to-close-timeout :portkey.aws.swf.start-child-workflow-execution-decision-attributes/task-start-to-close-timeout :portkey.aws.swf.start-child-workflow-execution-decision-attributes/tag-list :portkey.aws.swf.start-child-workflow-execution-decision-attributes/task-list :portkey.aws.swf.start-child-workflow-execution-decision-attributes/task-priority :portkey.aws.swf.start-child-workflow-execution-decision-attributes/control :portkey.aws.swf.start-child-workflow-execution-decision-attributes/lambda-role :portkey.aws.swf.start-child-workflow-execution-decision-attributes/input :portkey.aws.swf.start-child-workflow-execution-decision-attributes/child-policy]))

(clojure.spec.alpha/def :portkey.aws.swf/version-optional (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.swf.terminate-workflow-execution-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.terminate-workflow-execution-input/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.terminate-workflow-execution-input/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.terminate-workflow-execution-input/reason (clojure.spec.alpha/and :portkey.aws.swf/terminate-reason))
(clojure.spec.alpha/def :portkey.aws.swf.terminate-workflow-execution-input/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.terminate-workflow-execution-input/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf/terminate-workflow-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.terminate-workflow-execution-input/domain :portkey.aws.swf.terminate-workflow-execution-input/workflow-id] :opt-un [:portkey.aws.swf.terminate-workflow-execution-input/run-id :portkey.aws.swf.terminate-workflow-execution-input/reason :portkey.aws.swf.terminate-workflow-execution-input/details :portkey.aws.swf.terminate-workflow-execution-input/child-policy]))

(clojure.spec.alpha/def :portkey.aws.swf/schedule-lambda-function-failed-cause #{"ID_ALREADY_IN_USE" :id-already-in-use :lambda-service-not-available-in-region "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION" :open-lambda-functions-limit-exceeded :lambda-function-creation-rate-exceeded "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED" "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.swf.domain-configuration/workflow-execution-retention-period-in-days (clojure.spec.alpha/and :portkey.aws.swf/duration-in-days))
(clojure.spec.alpha/def :portkey.aws.swf/domain-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.domain-configuration/workflow-execution-retention-period-in-days] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.unknown-resource-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/unknown-resource-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.unknown-resource-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-failed-event-attributes/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-failed-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-failed-event-attributes/reason (clojure.spec.alpha/and :portkey.aws.swf/failure-reason))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-failed-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-failed-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-failed-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/child-workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.child-workflow-execution-failed-event-attributes/workflow-execution :portkey.aws.swf.child-workflow-execution-failed-event-attributes/workflow-type :portkey.aws.swf.child-workflow-execution-failed-event-attributes/initiated-event-id :portkey.aws.swf.child-workflow-execution-failed-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.child-workflow-execution-failed-event-attributes/reason :portkey.aws.swf.child-workflow-execution-failed-event-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf/marker-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf/canceled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.swf/function-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf/timer-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.decision-task-started-event-attributes/identity (clojure.spec.alpha/and :portkey.aws.swf/identity))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task-started-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/decision-task-started-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.decision-task-started-event-attributes/scheduled-event-id] :opt-un [:portkey.aws.swf.decision-task-started-event-attributes/identity]))

(clojure.spec.alpha/def :portkey.aws.swf.cancel-workflow-execution-decision-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/cancel-workflow-execution-decision-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.cancel-workflow-execution-decision-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf.decision-task-scheduled-event-attributes/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task-scheduled-event-attributes/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task-scheduled-event-attributes/start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf/decision-task-scheduled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.decision-task-scheduled-event-attributes/task-list] :opt-un [:portkey.aws.swf.decision-task-scheduled-event-attributes/task-priority :portkey.aws.swf.decision-task-scheduled-event-attributes/start-to-close-timeout]))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-terminated-cause #{"CHILD_POLICY_APPLIED" :operator-initiated "OPERATOR_INITIATED" :event-limit-exceeded "EVENT_LIMIT_EXCEEDED" :child-policy-applied})

(clojure.spec.alpha/def :portkey.aws.swf.fail-workflow-execution-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/fail-workflow-execution-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.fail-workflow-execution-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/fail-workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.fail-workflow-execution-failed-event-attributes/cause :portkey.aws.swf.fail-workflow-execution-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.describe-domain-input/name (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf/describe-domain-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.describe-domain-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-detail/execution-info (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-info))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-detail/execution-configuration (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-configuration))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-detail/open-counts (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-open-counts))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-detail/latest-activity-task-timestamp (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-detail/latest-execution-context (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-detail/execution-info :portkey.aws.swf.workflow-execution-detail/execution-configuration :portkey.aws.swf.workflow-execution-detail/open-counts] :opt-un [:portkey.aws.swf.workflow-execution-detail/latest-activity-task-timestamp :portkey.aws.swf.workflow-execution-detail/latest-execution-context]))

(clojure.spec.alpha/def :portkey.aws.swf.list-open-workflow-executions-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.list-open-workflow-executions-input/start-time-filter (clojure.spec.alpha/and :portkey.aws.swf/execution-time-filter))
(clojure.spec.alpha/def :portkey.aws.swf.list-open-workflow-executions-input/type-filter (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-filter))
(clojure.spec.alpha/def :portkey.aws.swf.list-open-workflow-executions-input/tag-filter (clojure.spec.alpha/and :portkey.aws.swf/tag-filter))
(clojure.spec.alpha/def :portkey.aws.swf.list-open-workflow-executions-input/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf.list-open-workflow-executions-input/maximum-page-size (clojure.spec.alpha/and :portkey.aws.swf/page-size))
(clojure.spec.alpha/def :portkey.aws.swf.list-open-workflow-executions-input/reverse-order (clojure.spec.alpha/and :portkey.aws.swf/reverse-order))
(clojure.spec.alpha/def :portkey.aws.swf.list-open-workflow-executions-input/execution-filter (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-filter))
(clojure.spec.alpha/def :portkey.aws.swf/list-open-workflow-executions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.list-open-workflow-executions-input/domain :portkey.aws.swf.list-open-workflow-executions-input/start-time-filter] :opt-un [:portkey.aws.swf.list-open-workflow-executions-input/type-filter :portkey.aws.swf.list-open-workflow-executions-input/tag-filter :portkey.aws.swf.list-open-workflow-executions-input/next-page-token :portkey.aws.swf.list-open-workflow-executions-input/maximum-page-size :portkey.aws.swf.list-open-workflow-executions-input/reverse-order :portkey.aws.swf.list-open-workflow-executions-input/execution-filter]))

(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/request-cancel-external-workflow-execution-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/request-cancel-external-workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/workflow-id :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/cause :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/initiated-event-id :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/run-id :portkey.aws.swf.request-cancel-external-workflow-execution-failed-event-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf/data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.swf.describe-activity-type-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.describe-activity-type-input/activity-type (clojure.spec.alpha/and :portkey.aws.swf/activity-type))
(clojure.spec.alpha/def :portkey.aws.swf/describe-activity-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.describe-activity-type-input/domain :portkey.aws.swf.describe-activity-type-input/activity-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/identity (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.describe-workflow-type-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.describe-workflow-type-input/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf/describe-workflow-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.describe-workflow-type-input/domain :portkey.aws.swf.describe-workflow-type-input/workflow-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.tag-filter/tag (clojure.spec.alpha/and :portkey.aws.swf/tag))
(clojure.spec.alpha/def :portkey.aws.swf/tag-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.tag-filter/tag] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-already-started-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-already-started-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.workflow-execution-already-started-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/workflow-type-version (clojure.spec.alpha/and :portkey.aws.swf/version))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/tag-list (clojure.spec.alpha/and :portkey.aws.swf/tag-list))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf/continue-as-new-workflow-execution-decision-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/workflow-type-version :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/execution-start-to-close-timeout :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/task-start-to-close-timeout :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/tag-list :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/task-list :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/task-priority :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/lambda-role :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/input :portkey.aws.swf.continue-as-new-workflow-execution-decision-attributes/child-policy]))

(clojure.spec.alpha/def :portkey.aws.swf.decision-task-completed-event-attributes/execution-context (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task-completed-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.decision-task-completed-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/decision-task-completed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.decision-task-completed-event-attributes/scheduled-event-id :portkey.aws.swf.decision-task-completed-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.decision-task-completed-event-attributes/execution-context]))

(clojure.spec.alpha/def :portkey.aws.swf.start-timer-failed-event-attributes/timer-id (clojure.spec.alpha/and :portkey.aws.swf/timer-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-timer-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/start-timer-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.start-timer-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/start-timer-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.start-timer-failed-event-attributes/timer-id :portkey.aws.swf.start-timer-failed-event-attributes/cause :portkey.aws.swf.start-timer-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.timer-fired-event-attributes/timer-id (clojure.spec.alpha/and :portkey.aws.swf/timer-id))
(clojure.spec.alpha/def :portkey.aws.swf.timer-fired-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/timer-fired-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.timer-fired-event-attributes/timer-id :portkey.aws.swf.timer-fired-event-attributes/started-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.close-status-filter/status (clojure.spec.alpha/and :portkey.aws.swf/close-status))
(clojure.spec.alpha/def :portkey.aws.swf/close-status-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.close-status-filter/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.swf.domain-detail/domain-info (clojure.spec.alpha/and :portkey.aws.swf/domain-info))
(clojure.spec.alpha/def :portkey.aws.swf.domain-detail/configuration (clojure.spec.alpha/and :portkey.aws.swf/domain-configuration))
(clojure.spec.alpha/def :portkey.aws.swf/domain-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.domain-detail/domain-info :portkey.aws.swf.domain-detail/configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.external-workflow-execution-cancel-requested-event-attributes/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.external-workflow-execution-cancel-requested-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/external-workflow-execution-cancel-requested-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.external-workflow-execution-cancel-requested-event-attributes/workflow-execution :portkey.aws.swf.external-workflow-execution-cancel-requested-event-attributes/initiated-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/execution-status #{:open :closed "CLOSED" "OPEN"})

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/schedule-to-start-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/activity-type (clojure.spec.alpha/and :portkey.aws.swf/activity-type))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/schedule-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/activity-id (clojure.spec.alpha/and :portkey.aws.swf/activity-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/heartbeat-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-scheduled-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-scheduled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-scheduled-event-attributes/activity-type :portkey.aws.swf.activity-task-scheduled-event-attributes/activity-id :portkey.aws.swf.activity-task-scheduled-event-attributes/task-list :portkey.aws.swf.activity-task-scheduled-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.activity-task-scheduled-event-attributes/schedule-to-start-timeout :portkey.aws.swf.activity-task-scheduled-event-attributes/start-to-close-timeout :portkey.aws.swf.activity-task-scheduled-event-attributes/schedule-to-close-timeout :portkey.aws.swf.activity-task-scheduled-event-attributes/task-priority :portkey.aws.swf.activity-task-scheduled-event-attributes/control :portkey.aws.swf.activity-task-scheduled-event-attributes/input :portkey.aws.swf.activity-task-scheduled-event-attributes/heartbeat-timeout]))

(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/default-execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/default-task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/default-task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/default-task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/name (clojure.spec.alpha/and :portkey.aws.swf/name))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/default-child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/default-lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/version (clojure.spec.alpha/and :portkey.aws.swf/version))
(clojure.spec.alpha/def :portkey.aws.swf.register-workflow-type-input/description (clojure.spec.alpha/and :portkey.aws.swf/description))
(clojure.spec.alpha/def :portkey.aws.swf/register-workflow-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.register-workflow-type-input/domain :portkey.aws.swf.register-workflow-type-input/name :portkey.aws.swf.register-workflow-type-input/version] :opt-un [:portkey.aws.swf.register-workflow-type-input/default-execution-start-to-close-timeout :portkey.aws.swf.register-workflow-type-input/default-task-priority :portkey.aws.swf.register-workflow-type-input/default-task-list :portkey.aws.swf.register-workflow-type-input/default-task-start-to-close-timeout :portkey.aws.swf.register-workflow-type-input/default-child-policy :portkey.aws.swf.register-workflow-type-input/default-lambda-role :portkey.aws.swf.register-workflow-type-input/description]))

(clojure.spec.alpha/def :portkey.aws.swf/decision-list (clojure.spec.alpha/coll-of :portkey.aws.swf/decision))

(clojure.spec.alpha/def :portkey.aws.swf.timer-canceled-event-attributes/timer-id (clojure.spec.alpha/and :portkey.aws.swf/timer-id))
(clojure.spec.alpha/def :portkey.aws.swf.timer-canceled-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.timer-canceled-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/timer-canceled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.timer-canceled-event-attributes/timer-id :portkey.aws.swf.timer-canceled-event-attributes/started-event-id :portkey.aws.swf.timer-canceled-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/record-marker-failed-cause #{"OPERATION_NOT_PERMITTED" :operation-not-permitted})

(clojure.spec.alpha/def :portkey.aws.swf/tag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf/decision-type #{:request-cancel-external-workflow-execution :complete-workflow-execution "CancelWorkflowExecution" "StartChildWorkflowExecution" :request-cancel-activity-task "ScheduleLambdaFunction" :record-marker :cancel-timer "RequestCancelExternalWorkflowExecution" :schedule-activity-task "CancelTimer" :fail-workflow-execution "ContinueAsNewWorkflowExecution" "FailWorkflowExecution" "ScheduleActivityTask" "StartTimer" "RecordMarker" :schedule-lambda-function :start-timer "RequestCancelActivityTask" :cancel-workflow-execution :continue-as-new-workflow-execution "SignalExternalWorkflowExecution" "CompleteWorkflowExecution" :start-child-workflow-execution :signal-external-workflow-execution})

(clojure.spec.alpha/def :portkey.aws.swf/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-type-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.workflow-type-configuration/default-task-start-to-close-timeout :portkey.aws.swf.workflow-type-configuration/default-execution-start-to-close-timeout :portkey.aws.swf.workflow-type-configuration/default-task-list :portkey.aws.swf.workflow-type-configuration/default-task-priority :portkey.aws.swf.workflow-type-configuration/default-child-policy :portkey.aws.swf.workflow-type-configuration/default-lambda-role]))

(clojure.spec.alpha/def :portkey.aws.swf/task-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/type-filter (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-filter))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/close-status-filter (clojure.spec.alpha/and :portkey.aws.swf/close-status-filter))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/maximum-page-size (clojure.spec.alpha/and :portkey.aws.swf/page-size))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/execution-filter (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-filter))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/reverse-order (clojure.spec.alpha/and :portkey.aws.swf/reverse-order))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/start-time-filter (clojure.spec.alpha/and :portkey.aws.swf/execution-time-filter))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/tag-filter (clojure.spec.alpha/and :portkey.aws.swf/tag-filter))
(clojure.spec.alpha/def :portkey.aws.swf.list-closed-workflow-executions-input/close-time-filter (clojure.spec.alpha/and :portkey.aws.swf/execution-time-filter))
(clojure.spec.alpha/def :portkey.aws.swf/list-closed-workflow-executions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.list-closed-workflow-executions-input/domain] :opt-un [:portkey.aws.swf.list-closed-workflow-executions-input/type-filter :portkey.aws.swf.list-closed-workflow-executions-input/close-status-filter :portkey.aws.swf.list-closed-workflow-executions-input/maximum-page-size :portkey.aws.swf.list-closed-workflow-executions-input/execution-filter :portkey.aws.swf.list-closed-workflow-executions-input/reverse-order :portkey.aws.swf.list-closed-workflow-executions-input/start-time-filter :portkey.aws.swf.list-closed-workflow-executions-input/next-page-token :portkey.aws.swf.list-closed-workflow-executions-input/tag-filter :portkey.aws.swf.list-closed-workflow-executions-input/close-time-filter]))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-failed-event-attributes/reason (clojure.spec.alpha/and :portkey.aws.swf/failure-reason))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-failed-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-failed-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.workflow-execution-failed-event-attributes/reason :portkey.aws.swf.workflow-execution-failed-event-attributes/details]))

(clojure.spec.alpha/def :portkey.aws.swf.cancel-timer-failed-event-attributes/timer-id (clojure.spec.alpha/and :portkey.aws.swf/timer-id))
(clojure.spec.alpha/def :portkey.aws.swf.cancel-timer-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/cancel-timer-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.cancel-timer-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/cancel-timer-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.cancel-timer-failed-event-attributes/timer-id :portkey.aws.swf.cancel-timer-failed-event-attributes/cause :portkey.aws.swf.cancel-timer-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-started-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/lambda-function-started-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.lambda-function-started-event-attributes/scheduled-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.count-pending-decision-tasks-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.count-pending-decision-tasks-input/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf/count-pending-decision-tasks-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.count-pending-decision-tasks-input/domain :portkey.aws.swf.count-pending-decision-tasks-input/task-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-failed-input/task-token (clojure.spec.alpha/and :portkey.aws.swf/task-token))
(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-failed-input/reason (clojure.spec.alpha/and :portkey.aws.swf/failure-reason))
(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-failed-input/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/respond-activity-task-failed-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.respond-activity-task-failed-input/task-token] :opt-un [:portkey.aws.swf.respond-activity-task-failed-input/reason :portkey.aws.swf.respond-activity-task-failed-input/details]))

(clojure.spec.alpha/def :portkey.aws.swf/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-info/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-info/status (clojure.spec.alpha/and :portkey.aws.swf/registration-status))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-info/description (clojure.spec.alpha/and :portkey.aws.swf/description))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-info/creation-date (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-info/deprecation-date (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-type-info (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-type-info/workflow-type :portkey.aws.swf.workflow-type-info/status :portkey.aws.swf.workflow-type-info/creation-date] :opt-un [:portkey.aws.swf.workflow-type-info/description :portkey.aws.swf.workflow-type-info/deprecation-date]))

(clojure.spec.alpha/def :portkey.aws.swf.count-closed-workflow-executions-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.count-closed-workflow-executions-input/start-time-filter (clojure.spec.alpha/and :portkey.aws.swf/execution-time-filter))
(clojure.spec.alpha/def :portkey.aws.swf.count-closed-workflow-executions-input/close-time-filter (clojure.spec.alpha/and :portkey.aws.swf/execution-time-filter))
(clojure.spec.alpha/def :portkey.aws.swf.count-closed-workflow-executions-input/execution-filter (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-filter))
(clojure.spec.alpha/def :portkey.aws.swf.count-closed-workflow-executions-input/type-filter (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-filter))
(clojure.spec.alpha/def :portkey.aws.swf.count-closed-workflow-executions-input/tag-filter (clojure.spec.alpha/and :portkey.aws.swf/tag-filter))
(clojure.spec.alpha/def :portkey.aws.swf.count-closed-workflow-executions-input/close-status-filter (clojure.spec.alpha/and :portkey.aws.swf/close-status-filter))
(clojure.spec.alpha/def :portkey.aws.swf/count-closed-workflow-executions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.count-closed-workflow-executions-input/domain] :opt-un [:portkey.aws.swf.count-closed-workflow-executions-input/start-time-filter :portkey.aws.swf.count-closed-workflow-executions-input/close-time-filter :portkey.aws.swf.count-closed-workflow-executions-input/execution-filter :portkey.aws.swf.count-closed-workflow-executions-input/type-filter :portkey.aws.swf.count-closed-workflow-executions-input/tag-filter :portkey.aws.swf.count-closed-workflow-executions-input/close-status-filter]))

(clojure.spec.alpha/def :portkey.aws.swf/event-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.swf/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.history-event/activity-task-canceled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/activity-task-canceled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/continue-as-new-workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/continue-as-new-workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/activity-task-started-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/activity-task-started-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-cancel-requested-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-cancel-requested-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/decision-task-timed-out-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/decision-task-timed-out-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/timer-fired-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/timer-fired-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-completed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-completed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/event-timestamp (clojure.spec.alpha/and :portkey.aws.swf/timestamp))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/cancel-timer-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/cancel-timer-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/activity-task-completed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/activity-task-completed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/child-workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/child-workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-started-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-started-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/cancel-workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/cancel-workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/activity-task-scheduled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/activity-task-scheduled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/request-cancel-external-workflow-execution-initiated-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/request-cancel-external-workflow-execution-initiated-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/activity-task-cancel-requested-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/activity-task-cancel-requested-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/schedule-lambda-function-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/schedule-lambda-function-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-continued-as-new-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-continued-as-new-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-signaled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-signaled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/child-workflow-execution-timed-out-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/child-workflow-execution-timed-out-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/decision-task-scheduled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/decision-task-scheduled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/child-workflow-execution-terminated-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/child-workflow-execution-terminated-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/decision-task-started-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/decision-task-started-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/event-type (clojure.spec.alpha/and :portkey.aws.swf/event-type))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/child-workflow-execution-started-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/child-workflow-execution-started-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/complete-workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/complete-workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/child-workflow-execution-canceled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/child-workflow-execution-canceled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/decision-task-completed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/decision-task-completed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/lambda-function-completed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/lambda-function-completed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/record-marker-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/record-marker-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/start-child-workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/start-child-workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/lambda-function-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/lambda-function-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/signal-external-workflow-execution-initiated-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/signal-external-workflow-execution-initiated-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/fail-workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/fail-workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/start-timer-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/start-timer-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/schedule-activity-task-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/schedule-activity-task-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/timer-canceled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/timer-canceled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/request-cancel-activity-task-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/request-cancel-activity-task-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/timer-started-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/timer-started-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/start-child-workflow-execution-initiated-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/start-child-workflow-execution-initiated-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/child-workflow-execution-completed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/child-workflow-execution-completed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/lambda-function-scheduled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/lambda-function-scheduled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/lambda-function-timed-out-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/lambda-function-timed-out-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/request-cancel-external-workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/request-cancel-external-workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/lambda-function-started-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/lambda-function-started-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/external-workflow-execution-cancel-requested-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/external-workflow-execution-cancel-requested-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-canceled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-canceled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/start-lambda-function-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/start-lambda-function-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/marker-recorded-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/marker-recorded-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/activity-task-timed-out-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/activity-task-timed-out-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/activity-task-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/activity-task-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/external-workflow-execution-signaled-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/external-workflow-execution-signaled-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/signal-external-workflow-execution-failed-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/signal-external-workflow-execution-failed-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-timed-out-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-timed-out-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/workflow-execution-terminated-event-attributes (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-terminated-event-attributes))
(clojure.spec.alpha/def :portkey.aws.swf.history-event/event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/history-event (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.history-event/event-timestamp :portkey.aws.swf.history-event/event-type :portkey.aws.swf.history-event/event-id] :opt-un [:portkey.aws.swf.history-event/activity-task-canceled-event-attributes :portkey.aws.swf.history-event/continue-as-new-workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/activity-task-started-event-attributes :portkey.aws.swf.history-event/workflow-execution-cancel-requested-event-attributes :portkey.aws.swf.history-event/decision-task-timed-out-event-attributes :portkey.aws.swf.history-event/timer-fired-event-attributes :portkey.aws.swf.history-event/workflow-execution-completed-event-attributes :portkey.aws.swf.history-event/cancel-timer-failed-event-attributes :portkey.aws.swf.history-event/activity-task-completed-event-attributes :portkey.aws.swf.history-event/child-workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/workflow-execution-started-event-attributes :portkey.aws.swf.history-event/cancel-workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/activity-task-scheduled-event-attributes :portkey.aws.swf.history-event/request-cancel-external-workflow-execution-initiated-event-attributes :portkey.aws.swf.history-event/activity-task-cancel-requested-event-attributes :portkey.aws.swf.history-event/schedule-lambda-function-failed-event-attributes :portkey.aws.swf.history-event/workflow-execution-continued-as-new-event-attributes :portkey.aws.swf.history-event/workflow-execution-signaled-event-attributes :portkey.aws.swf.history-event/child-workflow-execution-timed-out-event-attributes :portkey.aws.swf.history-event/decision-task-scheduled-event-attributes :portkey.aws.swf.history-event/child-workflow-execution-terminated-event-attributes :portkey.aws.swf.history-event/decision-task-started-event-attributes :portkey.aws.swf.history-event/workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/child-workflow-execution-started-event-attributes :portkey.aws.swf.history-event/complete-workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/child-workflow-execution-canceled-event-attributes :portkey.aws.swf.history-event/decision-task-completed-event-attributes :portkey.aws.swf.history-event/lambda-function-completed-event-attributes :portkey.aws.swf.history-event/record-marker-failed-event-attributes :portkey.aws.swf.history-event/start-child-workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/lambda-function-failed-event-attributes :portkey.aws.swf.history-event/signal-external-workflow-execution-initiated-event-attributes :portkey.aws.swf.history-event/fail-workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/start-timer-failed-event-attributes :portkey.aws.swf.history-event/schedule-activity-task-failed-event-attributes :portkey.aws.swf.history-event/timer-canceled-event-attributes :portkey.aws.swf.history-event/request-cancel-activity-task-failed-event-attributes :portkey.aws.swf.history-event/timer-started-event-attributes :portkey.aws.swf.history-event/start-child-workflow-execution-initiated-event-attributes :portkey.aws.swf.history-event/child-workflow-execution-completed-event-attributes :portkey.aws.swf.history-event/lambda-function-scheduled-event-attributes :portkey.aws.swf.history-event/lambda-function-timed-out-event-attributes :portkey.aws.swf.history-event/request-cancel-external-workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/lambda-function-started-event-attributes :portkey.aws.swf.history-event/external-workflow-execution-cancel-requested-event-attributes :portkey.aws.swf.history-event/workflow-execution-canceled-event-attributes :portkey.aws.swf.history-event/start-lambda-function-failed-event-attributes :portkey.aws.swf.history-event/marker-recorded-event-attributes :portkey.aws.swf.history-event/activity-task-timed-out-event-attributes :portkey.aws.swf.history-event/activity-task-failed-event-attributes :portkey.aws.swf.history-event/external-workflow-execution-signaled-event-attributes :portkey.aws.swf.history-event/signal-external-workflow-execution-failed-event-attributes :portkey.aws.swf.history-event/workflow-execution-timed-out-event-attributes :portkey.aws.swf.history-event/workflow-execution-terminated-event-attributes]))

(clojure.spec.alpha/def :portkey.aws.swf/function-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.swf/close-status #{"COMPLETED" "CANCELED" :timed-out :continued-as-new "TIMED_OUT" :completed "TERMINATED" :canceled :terminated "FAILED" "CONTINUED_AS_NEW" :failed})

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-infos/execution-infos (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-info-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-infos/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-infos (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-infos/execution-infos] :opt-un [:portkey.aws.swf.workflow-execution-infos/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-terminated-event-attributes/reason (clojure.spec.alpha/and :portkey.aws.swf/terminate-reason))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-terminated-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-terminated-event-attributes/child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-terminated-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-terminated-cause))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-terminated-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-terminated-event-attributes/child-policy] :opt-un [:portkey.aws.swf.workflow-execution-terminated-event-attributes/reason :portkey.aws.swf.workflow-execution-terminated-event-attributes/details :portkey.aws.swf.workflow-execution-terminated-event-attributes/cause]))

(clojure.spec.alpha/def :portkey.aws.swf.domain-info/name (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.domain-info/status (clojure.spec.alpha/and :portkey.aws.swf/registration-status))
(clojure.spec.alpha/def :portkey.aws.swf.domain-info/description (clojure.spec.alpha/and :portkey.aws.swf/description))
(clojure.spec.alpha/def :portkey.aws.swf/domain-info (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.domain-info/name :portkey.aws.swf.domain-info/status] :opt-un [:portkey.aws.swf.domain-info/description]))

(clojure.spec.alpha/def :portkey.aws.swf/signal-external-workflow-execution-failed-cause #{:unknown-external-workflow-execution "OPERATION_NOT_PERMITTED" "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" :operation-not-permitted :signal-external-workflow-execution-rate-exceeded})

(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-started-event-attributes/workflow-execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-started-event-attributes/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf.child-workflow-execution-started-event-attributes/initiated-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/child-workflow-execution-started-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.child-workflow-execution-started-event-attributes/workflow-execution :portkey.aws.swf.child-workflow-execution-started-event-attributes/workflow-type :portkey.aws.swf.child-workflow-execution-started-event-attributes/initiated-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.domain-already-exists-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/domain-already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.domain-already-exists-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-scheduled-event-attributes/id (clojure.spec.alpha/and :portkey.aws.swf/function-id))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-scheduled-event-attributes/name (clojure.spec.alpha/and :portkey.aws.swf/function-name))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-scheduled-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-scheduled-event-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/function-input))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-scheduled-event-attributes/start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.lambda-function-scheduled-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/lambda-function-scheduled-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.lambda-function-scheduled-event-attributes/id :portkey.aws.swf.lambda-function-scheduled-event-attributes/name :portkey.aws.swf.lambda-function-scheduled-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.lambda-function-scheduled-event-attributes/control :portkey.aws.swf.lambda-function-scheduled-event-attributes/input :portkey.aws.swf.lambda-function-scheduled-event-attributes/start-to-close-timeout]))

(clojure.spec.alpha/def :portkey.aws.swf.complete-workflow-execution-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/complete-workflow-execution-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.complete-workflow-execution-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/complete-workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.complete-workflow-execution-failed-event-attributes/cause :portkey.aws.swf.complete-workflow-execution-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/complete-workflow-execution-failed-cause #{"UNHANDLED_DECISION" "OPERATION_NOT_PERMITTED" :operation-not-permitted :unhandled-decision})

(clojure.spec.alpha/def :portkey.aws.swf/signal-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/signal-name (clojure.spec.alpha/and :portkey.aws.swf/signal-name))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/signal-external-workflow-execution-initiated-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/workflow-id :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/signal-name :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/run-id :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/input :portkey.aws.swf.signal-external-workflow-execution-initiated-event-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf.list-activity-types-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.list-activity-types-input/name (clojure.spec.alpha/and :portkey.aws.swf/name))
(clojure.spec.alpha/def :portkey.aws.swf.list-activity-types-input/registration-status (clojure.spec.alpha/and :portkey.aws.swf/registration-status))
(clojure.spec.alpha/def :portkey.aws.swf.list-activity-types-input/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf.list-activity-types-input/maximum-page-size (clojure.spec.alpha/and :portkey.aws.swf/page-size))
(clojure.spec.alpha/def :portkey.aws.swf.list-activity-types-input/reverse-order (clojure.spec.alpha/and :portkey.aws.swf/reverse-order))
(clojure.spec.alpha/def :portkey.aws.swf/list-activity-types-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.list-activity-types-input/domain :portkey.aws.swf.list-activity-types-input/registration-status] :opt-un [:portkey.aws.swf.list-activity-types-input/name :portkey.aws.swf.list-activity-types-input/next-page-token :portkey.aws.swf.list-activity-types-input/maximum-page-size :portkey.aws.swf.list-activity-types-input/reverse-order]))

(clojure.spec.alpha/def :portkey.aws.swf/activity-type-info-list (clojure.spec.alpha/coll-of :portkey.aws.swf/activity-type-info))

(clojure.spec.alpha/def :portkey.aws.swf/cancel-timer-failed-cause #{"OPERATION_NOT_PERMITTED" "TIMER_ID_UNKNOWN" :timer-id-unknown :operation-not-permitted})

(clojure.spec.alpha/def :portkey.aws.swf/reverse-order clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.swf/terminate-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-started-event-attributes/identity (clojure.spec.alpha/and :portkey.aws.swf/identity))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-started-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-started-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-started-event-attributes/scheduled-event-id] :opt-un [:portkey.aws.swf.activity-task-started-event-attributes/identity]))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-cancel-requested-cause #{"CHILD_POLICY_APPLIED" :child-policy-applied})

(clojure.spec.alpha/def :portkey.aws.swf.type-deprecated-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/type-deprecated-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.type-deprecated-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf/page-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-status/cancel-requested (clojure.spec.alpha/and :portkey.aws.swf/canceled))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-status (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-status/cancel-requested] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.activity-type-infos/type-infos (clojure.spec.alpha/and :portkey.aws.swf/activity-type-info-list))
(clojure.spec.alpha/def :portkey.aws.swf.activity-type-infos/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf/activity-type-infos (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-type-infos/type-infos] :opt-un [:portkey.aws.swf.activity-type-infos/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.swf.list-domains-input/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf.list-domains-input/registration-status (clojure.spec.alpha/and :portkey.aws.swf/registration-status))
(clojure.spec.alpha/def :portkey.aws.swf.list-domains-input/maximum-page-size (clojure.spec.alpha/and :portkey.aws.swf/page-size))
(clojure.spec.alpha/def :portkey.aws.swf.list-domains-input/reverse-order (clojure.spec.alpha/and :portkey.aws.swf/reverse-order))
(clojure.spec.alpha/def :portkey.aws.swf/list-domains-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.list-domains-input/registration-status] :opt-un [:portkey.aws.swf.list-domains-input/next-page-token :portkey.aws.swf.list-domains-input/maximum-page-size :portkey.aws.swf.list-domains-input/reverse-order]))

(clojure.spec.alpha/def :portkey.aws.swf/start-lambda-function-failed-cause #{"ASSUME_ROLE_FAILED" :assume-role-failed})

(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-decision-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-decision-attributes/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-decision-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/request-cancel-external-workflow-execution-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.request-cancel-external-workflow-execution-decision-attributes/workflow-id] :opt-un [:portkey.aws.swf.request-cancel-external-workflow-execution-decision-attributes/run-id :portkey.aws.swf.request-cancel-external-workflow-execution-decision-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/schedule-to-start-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/activity-type (clojure.spec.alpha/and :portkey.aws.swf/activity-type))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/schedule-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/input (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/activity-id (clojure.spec.alpha/and :portkey.aws.swf/activity-id))
(clojure.spec.alpha/def :portkey.aws.swf.schedule-activity-task-decision-attributes/heartbeat-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf/schedule-activity-task-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.schedule-activity-task-decision-attributes/activity-type :portkey.aws.swf.schedule-activity-task-decision-attributes/activity-id] :opt-un [:portkey.aws.swf.schedule-activity-task-decision-attributes/schedule-to-start-timeout :portkey.aws.swf.schedule-activity-task-decision-attributes/start-to-close-timeout :portkey.aws.swf.schedule-activity-task-decision-attributes/schedule-to-close-timeout :portkey.aws.swf.schedule-activity-task-decision-attributes/task-list :portkey.aws.swf.schedule-activity-task-decision-attributes/task-priority :portkey.aws.swf.schedule-activity-task-decision-attributes/control :portkey.aws.swf.schedule-activity-task-decision-attributes/input :portkey.aws.swf.schedule-activity-task-decision-attributes/heartbeat-timeout]))

(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-initiated-event-attributes/workflow-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-id))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-initiated-event-attributes/run-id (clojure.spec.alpha/and :portkey.aws.swf/workflow-run-id-optional))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-initiated-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.request-cancel-external-workflow-execution-initiated-event-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/request-cancel-external-workflow-execution-initiated-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.request-cancel-external-workflow-execution-initiated-event-attributes/workflow-id :portkey.aws.swf.request-cancel-external-workflow-execution-initiated-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.request-cancel-external-workflow-execution-initiated-event-attributes/run-id :portkey.aws.swf.request-cancel-external-workflow-execution-initiated-event-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf.cancel-workflow-execution-failed-event-attributes/cause (clojure.spec.alpha/and :portkey.aws.swf/cancel-workflow-execution-failed-cause))
(clojure.spec.alpha/def :portkey.aws.swf.cancel-workflow-execution-failed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/cancel-workflow-execution-failed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.cancel-workflow-execution-failed-event-attributes/cause :portkey.aws.swf.cancel-workflow-execution-failed-event-attributes/decision-task-completed-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-open-counts/open-activity-tasks (clojure.spec.alpha/and :portkey.aws.swf/count))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-open-counts/open-decision-tasks (clojure.spec.alpha/and :portkey.aws.swf/open-decision-tasks-count))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-open-counts/open-timers (clojure.spec.alpha/and :portkey.aws.swf/count))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-open-counts/open-child-workflow-executions (clojure.spec.alpha/and :portkey.aws.swf/count))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-open-counts/open-lambda-functions (clojure.spec.alpha/and :portkey.aws.swf/count))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-open-counts (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-open-counts/open-activity-tasks :portkey.aws.swf.workflow-execution-open-counts/open-decision-tasks :portkey.aws.swf.workflow-execution-open-counts/open-timers :portkey.aws.swf.workflow-execution-open-counts/open-child-workflow-executions] :opt-un [:portkey.aws.swf.workflow-execution-open-counts/open-lambda-functions]))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-completed-event-attributes/result (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-execution-completed-event-attributes/decision-task-completed-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-completed-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.workflow-execution-completed-event-attributes/decision-task-completed-event-id] :opt-un [:portkey.aws.swf.workflow-execution-completed-event-attributes/result]))

(clojure.spec.alpha/def :portkey.aws.swf.get-workflow-execution-history-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.get-workflow-execution-history-input/execution (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution))
(clojure.spec.alpha/def :portkey.aws.swf.get-workflow-execution-history-input/next-page-token (clojure.spec.alpha/and :portkey.aws.swf/page-token))
(clojure.spec.alpha/def :portkey.aws.swf.get-workflow-execution-history-input/maximum-page-size (clojure.spec.alpha/and :portkey.aws.swf/page-size))
(clojure.spec.alpha/def :portkey.aws.swf.get-workflow-execution-history-input/reverse-order (clojure.spec.alpha/and :portkey.aws.swf/reverse-order))
(clojure.spec.alpha/def :portkey.aws.swf/get-workflow-execution-history-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.get-workflow-execution-history-input/domain :portkey.aws.swf.get-workflow-execution-history-input/execution] :opt-un [:portkey.aws.swf.get-workflow-execution-history-input/next-page-token :portkey.aws.swf.get-workflow-execution-history-input/maximum-page-size :portkey.aws.swf.get-workflow-execution-history-input/reverse-order]))

(clojure.spec.alpha/def :portkey.aws.swf.start-timer-decision-attributes/timer-id (clojure.spec.alpha/and :portkey.aws.swf/timer-id))
(clojure.spec.alpha/def :portkey.aws.swf.start-timer-decision-attributes/control (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf.start-timer-decision-attributes/start-to-fire-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.swf/start-timer-decision-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.start-timer-decision-attributes/timer-id :portkey.aws.swf.start-timer-decision-attributes/start-to-fire-timeout] :opt-un [:portkey.aws.swf.start-timer-decision-attributes/control]))

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-timed-out-event-attributes/timeout-type (clojure.spec.alpha/and :portkey.aws.swf/activity-task-timeout-type))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-timed-out-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-timed-out-event-attributes/started-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-timed-out-event-attributes/details (clojure.spec.alpha/and :portkey.aws.swf/limited-data))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-timed-out-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-timed-out-event-attributes/timeout-type :portkey.aws.swf.activity-task-timed-out-event-attributes/scheduled-event-id :portkey.aws.swf.activity-task-timed-out-event-attributes/started-event-id] :opt-un [:portkey.aws.swf.activity-task-timed-out-event-attributes/details]))

(clojure.core/defn list-open-workflow-executions ([list-open-workflow-executions-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-open-workflow-executions-input list-open-workflow-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-open-workflow-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOpenWorkflowExecutions", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef list-open-workflow-executions :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-open-workflow-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-infos))

(clojure.core/defn register-domain ([register-domain-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-domain-input register-domain-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/register-domain-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterDomain", :http.request.spec/error-spec {"DomainAlreadyExistsFault" :portkey.aws.swf/domain-already-exists-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef register-domain :args (clojure.spec.alpha/tuple :portkey.aws.swf/register-domain-input) :ret clojure.core/true?)

(clojure.core/defn count-pending-decision-tasks ([count-pending-decision-tasks-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-count-pending-decision-tasks-input count-pending-decision-tasks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/pending-task-count, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/count-pending-decision-tasks-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CountPendingDecisionTasks", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef count-pending-decision-tasks :args (clojure.spec.alpha/tuple :portkey.aws.swf/count-pending-decision-tasks-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/pending-task-count))

(clojure.core/defn poll-for-decision-task ([poll-for-decision-task-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-poll-for-decision-task-input poll-for-decision-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/decision-task, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/poll-for-decision-task-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PollForDecisionTask", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault}})))))
(clojure.spec.alpha/fdef poll-for-decision-task :args (clojure.spec.alpha/tuple :portkey.aws.swf/poll-for-decision-task-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/decision-task))

(clojure.core/defn list-closed-workflow-executions ([list-closed-workflow-executions-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-closed-workflow-executions-input list-closed-workflow-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-closed-workflow-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListClosedWorkflowExecutions", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef list-closed-workflow-executions :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-closed-workflow-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-infos))

(clojure.core/defn list-domains ([list-domains-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-domains-input list-domains-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/domain-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-domains-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDomains", :http.request.spec/error-spec {"OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef list-domains :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-domains-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/domain-infos))

(clojure.core/defn describe-domain ([describe-domain-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-domain-input describe-domain-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/domain-detail, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/describe-domain-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDomain", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef describe-domain :args (clojure.spec.alpha/tuple :portkey.aws.swf/describe-domain-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/domain-detail))

(clojure.core/defn respond-activity-task-canceled ([respond-activity-task-canceled-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-respond-activity-task-canceled-input respond-activity-task-canceled-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/respond-activity-task-canceled-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RespondActivityTaskCanceled", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef respond-activity-task-canceled :args (clojure.spec.alpha/tuple :portkey.aws.swf/respond-activity-task-canceled-input) :ret clojure.core/true?)

(clojure.core/defn request-cancel-workflow-execution ([request-cancel-workflow-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-request-cancel-workflow-execution-input request-cancel-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/request-cancel-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RequestCancelWorkflowExecution", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef request-cancel-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/request-cancel-workflow-execution-input) :ret clojure.core/true?)

(clojure.core/defn terminate-workflow-execution ([terminate-workflow-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-terminate-workflow-execution-input terminate-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/terminate-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TerminateWorkflowExecution", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef terminate-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/terminate-workflow-execution-input) :ret clojure.core/true?)

(clojure.core/defn get-workflow-execution-history ([get-workflow-execution-history-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-workflow-execution-history-input get-workflow-execution-history-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/history, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/get-workflow-execution-history-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetWorkflowExecutionHistory", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef get-workflow-execution-history :args (clojure.spec.alpha/tuple :portkey.aws.swf/get-workflow-execution-history-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/history))

(clojure.core/defn start-workflow-execution ([start-workflow-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-workflow-execution-input start-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/run, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/start-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartWorkflowExecution", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "TypeDeprecatedFault" :portkey.aws.swf/type-deprecated-fault, "WorkflowExecutionAlreadyStartedFault" :portkey.aws.swf/workflow-execution-already-started-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "DefaultUndefinedFault" :portkey.aws.swf/default-undefined-fault}})))))
(clojure.spec.alpha/fdef start-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/start-workflow-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/run))

(clojure.core/defn register-activity-type ([register-activity-type-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-activity-type-input register-activity-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/register-activity-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterActivityType", :http.request.spec/error-spec {"TypeAlreadyExistsFault" :portkey.aws.swf/type-already-exists-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault, "UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef register-activity-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/register-activity-type-input) :ret clojure.core/true?)

(clojure.core/defn respond-decision-task-completed ([respond-decision-task-completed-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-respond-decision-task-completed-input respond-decision-task-completed-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/respond-decision-task-completed-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RespondDecisionTaskCompleted", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef respond-decision-task-completed :args (clojure.spec.alpha/tuple :portkey.aws.swf/respond-decision-task-completed-input) :ret clojure.core/true?)

(clojure.core/defn register-workflow-type ([register-workflow-type-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-workflow-type-input register-workflow-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/register-workflow-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterWorkflowType", :http.request.spec/error-spec {"TypeAlreadyExistsFault" :portkey.aws.swf/type-already-exists-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault, "UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef register-workflow-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/register-workflow-type-input) :ret clojure.core/true?)

(clojure.core/defn describe-workflow-type ([describe-workflow-type-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-workflow-type-input describe-workflow-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-type-detail, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/describe-workflow-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeWorkflowType", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef describe-workflow-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/describe-workflow-type-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-detail))

(clojure.core/defn respond-activity-task-failed ([respond-activity-task-failed-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-respond-activity-task-failed-input respond-activity-task-failed-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/respond-activity-task-failed-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RespondActivityTaskFailed", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef respond-activity-task-failed :args (clojure.spec.alpha/tuple :portkey.aws.swf/respond-activity-task-failed-input) :ret clojure.core/true?)

(clojure.core/defn poll-for-activity-task ([poll-for-activity-task-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-poll-for-activity-task-input poll-for-activity-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/activity-task, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/poll-for-activity-task-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PollForActivityTask", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault}})))))
(clojure.spec.alpha/fdef poll-for-activity-task :args (clojure.spec.alpha/tuple :portkey.aws.swf/poll-for-activity-task-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/activity-task))

(clojure.core/defn list-workflow-types ([list-workflow-types-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-workflow-types-input list-workflow-types-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-type-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-workflow-types-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListWorkflowTypes", :http.request.spec/error-spec {"OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault}})))))
(clojure.spec.alpha/fdef list-workflow-types :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-workflow-types-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-infos))

(clojure.core/defn signal-workflow-execution ([signal-workflow-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-signal-workflow-execution-input signal-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/signal-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SignalWorkflowExecution", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef signal-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/signal-workflow-execution-input) :ret clojure.core/true?)

(clojure.core/defn deprecate-domain ([deprecate-domain-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-deprecate-domain-input deprecate-domain-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/deprecate-domain-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeprecateDomain", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "DomainDeprecatedFault" :portkey.aws.swf/domain-deprecated-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef deprecate-domain :args (clojure.spec.alpha/tuple :portkey.aws.swf/deprecate-domain-input) :ret clojure.core/true?)

(clojure.core/defn describe-workflow-execution ([describe-workflow-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-workflow-execution-input describe-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-detail, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/describe-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeWorkflowExecution", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef describe-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/describe-workflow-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-detail))

(clojure.core/defn count-open-workflow-executions ([count-open-workflow-executions-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-count-open-workflow-executions-input count-open-workflow-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-count, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/count-open-workflow-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CountOpenWorkflowExecutions", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef count-open-workflow-executions :args (clojure.spec.alpha/tuple :portkey.aws.swf/count-open-workflow-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-count))

(clojure.core/defn list-activity-types ([list-activity-types-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-activity-types-input list-activity-types-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/activity-type-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-activity-types-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListActivityTypes", :http.request.spec/error-spec {"OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault}})))))
(clojure.spec.alpha/fdef list-activity-types :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-activity-types-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/activity-type-infos))

(clojure.core/defn describe-activity-type ([describe-activity-type-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-activity-type-input describe-activity-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/activity-type-detail, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/describe-activity-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeActivityType", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef describe-activity-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/describe-activity-type-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/activity-type-detail))

(clojure.core/defn respond-activity-task-completed ([respond-activity-task-completed-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-respond-activity-task-completed-input respond-activity-task-completed-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/respond-activity-task-completed-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RespondActivityTaskCompleted", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef respond-activity-task-completed :args (clojure.spec.alpha/tuple :portkey.aws.swf/respond-activity-task-completed-input) :ret clojure.core/true?)

(clojure.core/defn record-activity-task-heartbeat ([record-activity-task-heartbeat-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-record-activity-task-heartbeat-input record-activity-task-heartbeat-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/activity-task-status, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/record-activity-task-heartbeat-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RecordActivityTaskHeartbeat", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef record-activity-task-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.swf/record-activity-task-heartbeat-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/activity-task-status))

(clojure.core/defn count-closed-workflow-executions ([count-closed-workflow-executions-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-count-closed-workflow-executions-input count-closed-workflow-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-count, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/count-closed-workflow-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CountClosedWorkflowExecutions", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef count-closed-workflow-executions :args (clojure.spec.alpha/tuple :portkey.aws.swf/count-closed-workflow-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-count))

(clojure.core/defn count-pending-activity-tasks ([count-pending-activity-tasks-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-count-pending-activity-tasks-input count-pending-activity-tasks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/pending-task-count, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/count-pending-activity-tasks-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CountPendingActivityTasks", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef count-pending-activity-tasks :args (clojure.spec.alpha/tuple :portkey.aws.swf/count-pending-activity-tasks-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/pending-task-count))

(clojure.core/defn deprecate-workflow-type ([deprecate-workflow-type-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-deprecate-workflow-type-input deprecate-workflow-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/deprecate-workflow-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeprecateWorkflowType", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "TypeDeprecatedFault" :portkey.aws.swf/type-deprecated-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef deprecate-workflow-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/deprecate-workflow-type-input) :ret clojure.core/true?)

(clojure.core/defn deprecate-activity-type ([deprecate-activity-type-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-deprecate-activity-type-input deprecate-activity-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/deprecate-activity-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeprecateActivityType", :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "TypeDeprecatedFault" :portkey.aws.swf/type-deprecated-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef deprecate-activity-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/deprecate-activity-type-input) :ret clojure.core/true?)
