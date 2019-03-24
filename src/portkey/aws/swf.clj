(ns portkey.aws.swf (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "swf", :region "us-gov-east-1"},
    :ssl-common-name "swf.us-gov-east-1.amazonaws.com",
    :endpoint "https://swf.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "swf", :region "eu-north-1"},
    :ssl-common-name "swf.eu-north-1.amazonaws.com",
    :endpoint "https://swf.eu-north-1.amazonaws.com",
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

(clojure.core/declare deser-workflow-execution-started-event-attributes)

(clojure.core/declare deser-start-timer-failed-cause)

(clojure.core/declare deser-fail-workflow-execution-failed-cause)

(clojure.core/declare deser-workflow-type)

(clojure.core/declare deser-workflow-execution-signaled-event-attributes)

(clojure.core/declare deser-signal-external-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-external-workflow-execution-signaled-event-attributes)

(clojure.core/declare deser-start-lambda-function-failed-event-attributes)

(clojure.core/declare deser-record-marker-failed-event-attributes)

(clojure.core/declare deser-schedule-lambda-function-failed-event-attributes)

(clojure.core/declare deser-request-cancel-activity-task-failed-cause)

(clojure.core/declare deser-workflow-run-id-optional)

(clojure.core/declare deser-activity-type-info)

(clojure.core/declare deser-marker-recorded-event-attributes)

(clojure.core/declare deser-lambda-function-timeout-type)

(clojure.core/declare deser-limited-data)

(clojure.core/declare deser-function-name)

(clojure.core/declare deser-workflow-type-info-list)

(clojure.core/declare deser-lambda-function-completed-event-attributes)

(clojure.core/declare deser-workflow-execution)

(clojure.core/declare deser-request-cancel-external-workflow-execution-failed-cause)

(clojure.core/declare deser-activity-task-failed-event-attributes)

(clojure.core/declare deser-start-child-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-timer-started-event-attributes)

(clojure.core/declare deser-open-decision-tasks-count)

(clojure.core/declare deser-child-workflow-execution-canceled-event-attributes)

(clojure.core/declare deser-schedule-activity-task-failed-cause)

(clojure.core/declare deser-continue-as-new-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-registration-status)

(clojure.core/declare deser-workflow-execution-canceled-event-attributes)

(clojure.core/declare deser-lambda-function-timed-out-event-attributes)

(clojure.core/declare deser-truncated)

(clojure.core/declare deser-activity-task-completed-event-attributes)

(clojure.core/declare deser-cancel-workflow-execution-failed-cause)

(clojure.core/declare deser-history-event-list)

(clojure.core/declare deser-lambda-function-failed-event-attributes)

(clojure.core/declare deser-workflow-execution-configuration)

(clojure.core/declare deser-start-child-workflow-execution-failed-cause)

(clojure.core/declare deser-request-cancel-activity-task-failed-event-attributes)

(clojure.core/declare deser-activity-task-timeout-type)

(clojure.core/declare deser-count)

(clojure.core/declare deser-domain-info-list)

(clojure.core/declare deser-cause-message)

(clojure.core/declare deser-child-policy)

(clojure.core/declare deser-workflow-execution-timeout-type)

(clojure.core/declare deser-duration-in-days)

(clojure.core/declare deser-task-list)

(clojure.core/declare deser-workflow-execution-continued-as-new-event-attributes)

(clojure.core/declare deser-schedule-activity-task-failed-event-attributes)

(clojure.core/declare deser-activity-task-canceled-event-attributes)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-workflow-run-id)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-workflow-execution-info-list)

(clojure.core/declare deser-task-priority)

(clojure.core/declare deser-decision-task-timed-out-event-attributes)

(clojure.core/declare deser-activity-type-configuration)

(clojure.core/declare deser-child-workflow-execution-timed-out-event-attributes)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-duration-in-seconds)

(clojure.core/declare deser-duration-in-seconds-optional)

(clojure.core/declare deser-continue-as-new-workflow-execution-failed-cause)

(clojure.core/declare deser-child-workflow-execution-completed-event-attributes)

(clojure.core/declare deser-workflow-execution-cancel-requested-event-attributes)

(clojure.core/declare deser-activity-task-cancel-requested-event-attributes)

(clojure.core/declare deser-activity-id)

(clojure.core/declare deser-activity-type)

(clojure.core/declare deser-start-child-workflow-execution-initiated-event-attributes)

(clojure.core/declare deser-description)

(clojure.core/declare deser-workflow-execution-info)

(clojure.core/declare deser-decision-task-timeout-type)

(clojure.core/declare deser-child-workflow-execution-terminated-event-attributes)

(clojure.core/declare deser-failure-reason)

(clojure.core/declare deser-workflow-execution-timed-out-event-attributes)

(clojure.core/declare deser-schedule-lambda-function-failed-cause)

(clojure.core/declare deser-domain-configuration)

(clojure.core/declare deser-child-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-marker-name)

(clojure.core/declare deser-canceled)

(clojure.core/declare deser-function-id)

(clojure.core/declare deser-timer-id)

(clojure.core/declare deser-decision-task-started-event-attributes)

(clojure.core/declare deser-decision-task-scheduled-event-attributes)

(clojure.core/declare deser-workflow-execution-terminated-cause)

(clojure.core/declare deser-fail-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-request-cancel-external-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-data)

(clojure.core/declare deser-identity)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-decision-task-completed-event-attributes)

(clojure.core/declare deser-start-timer-failed-event-attributes)

(clojure.core/declare deser-timer-fired-event-attributes)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-external-workflow-execution-cancel-requested-event-attributes)

(clojure.core/declare deser-execution-status)

(clojure.core/declare deser-activity-task-scheduled-event-attributes)

(clojure.core/declare deser-timer-canceled-event-attributes)

(clojure.core/declare deser-record-marker-failed-cause)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-version)

(clojure.core/declare deser-workflow-type-configuration)

(clojure.core/declare deser-task-token)

(clojure.core/declare deser-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-cancel-timer-failed-event-attributes)

(clojure.core/declare deser-lambda-function-started-event-attributes)

(clojure.core/declare deser-domain-name)

(clojure.core/declare deser-workflow-type-info)

(clojure.core/declare deser-event-id)

(clojure.core/declare deser-name)

(clojure.core/declare deser-history-event)

(clojure.core/declare deser-function-input)

(clojure.core/declare deser-close-status)

(clojure.core/declare deser-workflow-execution-terminated-event-attributes)

(clojure.core/declare deser-domain-info)

(clojure.core/declare deser-signal-external-workflow-execution-failed-cause)

(clojure.core/declare deser-child-workflow-execution-started-event-attributes)

(clojure.core/declare deser-lambda-function-scheduled-event-attributes)

(clojure.core/declare deser-complete-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-complete-workflow-execution-failed-cause)

(clojure.core/declare deser-signal-name)

(clojure.core/declare deser-signal-external-workflow-execution-initiated-event-attributes)

(clojure.core/declare deser-activity-type-info-list)

(clojure.core/declare deser-cancel-timer-failed-cause)

(clojure.core/declare deser-terminate-reason)

(clojure.core/declare deser-workflow-id)

(clojure.core/declare deser-activity-task-started-event-attributes)

(clojure.core/declare deser-workflow-execution-cancel-requested-cause)

(clojure.core/declare deser-page-token)

(clojure.core/declare deser-start-lambda-function-failed-cause)

(clojure.core/declare deser-request-cancel-external-workflow-execution-initiated-event-attributes)

(clojure.core/declare deser-cancel-workflow-execution-failed-event-attributes)

(clojure.core/declare deser-workflow-execution-open-counts)

(clojure.core/declare deser-workflow-execution-completed-event-attributes)

(clojure.core/declare deser-activity-task-timed-out-event-attributes)

(clojure.core/defn- deser-workflow-execution-started-event-attributes [input] (clojure.core/cond-> {:child-policy (deser-child-policy (input "childPolicy")), :task-list (deser-task-list (input "taskList")), :workflow-type (deser-workflow-type (input "workflowType"))} (clojure.core/contains? input "executionStartToCloseTimeout") (clojure.core/assoc :execution-start-to-close-timeout (deser-duration-in-seconds-optional (input "executionStartToCloseTimeout"))) (clojure.core/contains? input "taskStartToCloseTimeout") (clojure.core/assoc :task-start-to-close-timeout (deser-duration-in-seconds-optional (input "taskStartToCloseTimeout"))) (clojure.core/contains? input "continuedExecutionRunId") (clojure.core/assoc :continued-execution-run-id (deser-workflow-run-id-optional (input "continuedExecutionRunId"))) (clojure.core/contains? input "tagList") (clojure.core/assoc :tag-list (deser-tag-list (input "tagList"))) (clojure.core/contains? input "parentInitiatedEventId") (clojure.core/assoc :parent-initiated-event-id (deser-event-id (input "parentInitiatedEventId"))) (clojure.core/contains? input "taskPriority") (clojure.core/assoc :task-priority (deser-task-priority (input "taskPriority"))) (clojure.core/contains? input "lambdaRole") (clojure.core/assoc :lambda-role (deser-arn (input "lambdaRole"))) (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-data (input "input"))) (clojure.core/contains? input "parentWorkflowExecution") (clojure.core/assoc :parent-workflow-execution (deser-workflow-execution (input "parentWorkflowExecution")))))

(clojure.core/defn- deser-start-timer-failed-cause [input] (clojure.core/get {"TIMER_ID_ALREADY_IN_USE" :timer-id-already-in-use, "OPEN_TIMERS_LIMIT_EXCEEDED" :open-timers-limit-exceeded, "TIMER_CREATION_RATE_EXCEEDED" :timer-creation-rate-exceeded, "OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-fail-workflow-execution-failed-cause [input] (clojure.core/get {"UNHANDLED_DECISION" :unhandled-decision, "OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-workflow-type [input] (clojure.core/cond-> {:name (deser-name (input "name")), :version (deser-version (input "version"))}))

(clojure.core/defn- deser-workflow-execution-signaled-event-attributes [input] (clojure.core/cond-> {:signal-name (deser-signal-name (input "signalName"))} (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-data (input "input"))) (clojure.core/contains? input "externalWorkflowExecution") (clojure.core/assoc :external-workflow-execution (deser-workflow-execution (input "externalWorkflowExecution"))) (clojure.core/contains? input "externalInitiatedEventId") (clojure.core/assoc :external-initiated-event-id (deser-event-id (input "externalInitiatedEventId")))))

(clojure.core/defn- deser-signal-external-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:workflow-id (deser-workflow-id (input "workflowId")), :cause (deser-signal-external-workflow-execution-failed-cause (input "cause")), :initiated-event-id (deser-event-id (input "initiatedEventId")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "runId") (clojure.core/assoc :run-id (deser-workflow-run-id-optional (input "runId"))) (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control")))))

(clojure.core/defn- deser-external-workflow-execution-signaled-event-attributes [input] (clojure.core/cond-> {:workflow-execution (deser-workflow-execution (input "workflowExecution")), :initiated-event-id (deser-event-id (input "initiatedEventId"))}))

(clojure.core/defn- deser-start-lambda-function-failed-event-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "scheduledEventId") (clojure.core/assoc :scheduled-event-id (deser-event-id (input "scheduledEventId"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-start-lambda-function-failed-cause (input "cause"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-cause-message (input "message")))))

(clojure.core/defn- deser-record-marker-failed-event-attributes [input] (clojure.core/cond-> {:marker-name (deser-marker-name (input "markerName")), :cause (deser-record-marker-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-schedule-lambda-function-failed-event-attributes [input] (clojure.core/cond-> {:id (deser-function-id (input "id")), :name (deser-function-name (input "name")), :cause (deser-schedule-lambda-function-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-request-cancel-activity-task-failed-cause [input] (clojure.core/get {"ACTIVITY_ID_UNKNOWN" :activity-id-unknown, "OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-workflow-run-id-optional [input] input)

(clojure.core/defn- deser-activity-type-info [input] (clojure.core/cond-> {:activity-type (deser-activity-type (input "activityType")), :status (deser-registration-status (input "status")), :creation-date (deser-timestamp (input "creationDate"))} (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "deprecationDate") (clojure.core/assoc :deprecation-date (deser-timestamp (input "deprecationDate")))))

(clojure.core/defn- deser-marker-recorded-event-attributes [input] (clojure.core/cond-> {:marker-name (deser-marker-name (input "markerName")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details")))))

(clojure.core/defn- deser-lambda-function-timeout-type [input] (clojure.core/get {"START_TO_CLOSE" :start-to-close} input))

(clojure.core/defn- deser-limited-data [input] input)

(clojure.core/defn- deser-function-name [input] input)

(clojure.core/defn- deser-workflow-type-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workflow-type-info coll))) input))

(clojure.core/defn- deser-lambda-function-completed-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-data (input "result")))))

(clojure.core/defn- deser-workflow-execution [input] (clojure.core/cond-> {:workflow-id (deser-workflow-id (input "workflowId")), :run-id (deser-workflow-run-id (input "runId"))}))

(clojure.core/defn- deser-request-cancel-external-workflow-execution-failed-cause [input] (clojure.core/get {"UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" :unknown-external-workflow-execution, "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" :request-cancel-external-workflow-execution-rate-exceeded, "OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-activity-task-failed-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-failure-reason (input "reason"))) (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details")))))

(clojure.core/defn- deser-start-child-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:workflow-type (deser-workflow-type (input "workflowType")), :cause (deser-start-child-workflow-execution-failed-cause (input "cause")), :workflow-id (deser-workflow-id (input "workflowId")), :initiated-event-id (deser-event-id (input "initiatedEventId")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control")))))

(clojure.core/defn- deser-timer-started-event-attributes [input] (clojure.core/cond-> {:timer-id (deser-timer-id (input "timerId")), :start-to-fire-timeout (deser-duration-in-seconds (input "startToFireTimeout")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control")))))

(clojure.core/defn- deser-open-decision-tasks-count [input] input)

(clojure.core/defn- deser-child-workflow-execution-canceled-event-attributes [input] (clojure.core/cond-> {:workflow-execution (deser-workflow-execution (input "workflowExecution")), :workflow-type (deser-workflow-type (input "workflowType")), :initiated-event-id (deser-event-id (input "initiatedEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details")))))

(clojure.core/defn- deser-schedule-activity-task-failed-cause [input] (clojure.core/get {"DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED" :default-heartbeat-timeout-undefined, "ACTIVITY_TYPE_DEPRECATED" :activity-type-deprecated, "OPEN_ACTIVITIES_LIMIT_EXCEEDED" :open-activities-limit-exceeded, "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED" :default-start-to-close-timeout-undefined, "OPERATION_NOT_PERMITTED" :operation-not-permitted, "ACTIVITY_TYPE_DOES_NOT_EXIST" :activity-type-does-not-exist, "ACTIVITY_CREATION_RATE_EXCEEDED" :activity-creation-rate-exceeded, "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED" :default-schedule-to-start-timeout-undefined, "ACTIVITY_ID_ALREADY_IN_USE" :activity-id-already-in-use, "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED" :default-schedule-to-close-timeout-undefined, "DEFAULT_TASK_LIST_UNDEFINED" :default-task-list-undefined} input))

(clojure.core/defn- deser-continue-as-new-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:cause (deser-continue-as-new-workflow-execution-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-registration-status [input] (clojure.core/get {"REGISTERED" :registered, "DEPRECATED" :deprecated} input))

(clojure.core/defn- deser-workflow-execution-canceled-event-attributes [input] (clojure.core/cond-> {:decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details")))))

(clojure.core/defn- deser-lambda-function-timed-out-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "timeoutType") (clojure.core/assoc :timeout-type (deser-lambda-function-timeout-type (input "timeoutType")))))

(clojure.core/defn- deser-truncated [input] input)

(clojure.core/defn- deser-activity-task-completed-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-data (input "result")))))

(clojure.core/defn- deser-cancel-workflow-execution-failed-cause [input] (clojure.core/get {"UNHANDLED_DECISION" :unhandled-decision, "OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-history-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-history-event coll))) input))

(clojure.core/defn- deser-lambda-function-failed-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-failure-reason (input "reason"))) (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details")))))

(clojure.core/defn- deser-workflow-execution-configuration [input] (clojure.core/cond-> {:task-start-to-close-timeout (deser-duration-in-seconds (input "taskStartToCloseTimeout")), :execution-start-to-close-timeout (deser-duration-in-seconds (input "executionStartToCloseTimeout")), :task-list (deser-task-list (input "taskList")), :child-policy (deser-child-policy (input "childPolicy"))} (clojure.core/contains? input "taskPriority") (clojure.core/assoc :task-priority (deser-task-priority (input "taskPriority"))) (clojure.core/contains? input "lambdaRole") (clojure.core/assoc :lambda-role (deser-arn (input "lambdaRole")))))

(clojure.core/defn- deser-start-child-workflow-execution-failed-cause [input] (clojure.core/get {"CHILD_CREATION_RATE_EXCEEDED" :child-creation-rate-exceeded, "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" :default-task-start-to-close-timeout-undefined, "WORKFLOW_TYPE_DEPRECATED" :workflow-type-deprecated, "DEFAULT_CHILD_POLICY_UNDEFINED" :default-child-policy-undefined, "OPERATION_NOT_PERMITTED" :operation-not-permitted, "WORKFLOW_ALREADY_RUNNING" :workflow-already-running, "OPEN_WORKFLOWS_LIMIT_EXCEEDED" :open-workflows-limit-exceeded, "OPEN_CHILDREN_LIMIT_EXCEEDED" :open-children-limit-exceeded, "WORKFLOW_TYPE_DOES_NOT_EXIST" :workflow-type-does-not-exist, "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" :default-execution-start-to-close-timeout-undefined, "DEFAULT_TASK_LIST_UNDEFINED" :default-task-list-undefined} input))

(clojure.core/defn- deser-request-cancel-activity-task-failed-event-attributes [input] (clojure.core/cond-> {:activity-id (deser-activity-id (input "activityId")), :cause (deser-request-cancel-activity-task-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-activity-task-timeout-type [input] (clojure.core/get {"START_TO_CLOSE" :start-to-close, "SCHEDULE_TO_START" :schedule-to-start, "SCHEDULE_TO_CLOSE" :schedule-to-close, "HEARTBEAT" :heartbeat} input))

(clojure.core/defn- deser-count [input] input)

(clojure.core/defn- deser-domain-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-info coll))) input))

(clojure.core/defn- deser-cause-message [input] input)

(clojure.core/defn- deser-child-policy [input] (clojure.core/get {"TERMINATE" :terminate, "REQUEST_CANCEL" :request-cancel, "ABANDON" :abandon} input))

(clojure.core/defn- deser-workflow-execution-timeout-type [input] (clojure.core/get {"START_TO_CLOSE" :start-to-close} input))

(clojure.core/defn- deser-duration-in-days [input] input)

(clojure.core/defn- deser-task-list [input] (clojure.core/cond-> {:name (deser-name (input "name"))}))

(clojure.core/defn- deser-workflow-execution-continued-as-new-event-attributes [input] (clojure.core/cond-> {:decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId")), :new-execution-run-id (deser-workflow-run-id (input "newExecutionRunId")), :task-list (deser-task-list (input "taskList")), :child-policy (deser-child-policy (input "childPolicy")), :workflow-type (deser-workflow-type (input "workflowType"))} (clojure.core/contains? input "executionStartToCloseTimeout") (clojure.core/assoc :execution-start-to-close-timeout (deser-duration-in-seconds-optional (input "executionStartToCloseTimeout"))) (clojure.core/contains? input "taskStartToCloseTimeout") (clojure.core/assoc :task-start-to-close-timeout (deser-duration-in-seconds-optional (input "taskStartToCloseTimeout"))) (clojure.core/contains? input "tagList") (clojure.core/assoc :tag-list (deser-tag-list (input "tagList"))) (clojure.core/contains? input "taskPriority") (clojure.core/assoc :task-priority (deser-task-priority (input "taskPriority"))) (clojure.core/contains? input "lambdaRole") (clojure.core/assoc :lambda-role (deser-arn (input "lambdaRole"))) (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-data (input "input")))))

(clojure.core/defn- deser-schedule-activity-task-failed-event-attributes [input] (clojure.core/cond-> {:activity-type (deser-activity-type (input "activityType")), :activity-id (deser-activity-id (input "activityId")), :cause (deser-schedule-activity-task-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-activity-task-canceled-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details"))) (clojure.core/contains? input "latestCancelRequestedEventId") (clojure.core/assoc :latest-cancel-requested-event-id (deser-event-id (input "latestCancelRequestedEventId")))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"WorkflowExecutionStarted" :workflow-execution-started, "CompleteWorkflowExecutionFailed" :complete-workflow-execution-failed, "SignalExternalWorkflowExecutionInitiated" :signal-external-workflow-execution-initiated, "StartTimerFailed" :start-timer-failed, "StartChildWorkflowExecutionInitiated" :start-child-workflow-execution-initiated, "DecisionTaskCompleted" :decision-task-completed, "DecisionTaskStarted" :decision-task-started, "TimerFired" :timer-fired, "ChildWorkflowExecutionTerminated" :child-workflow-execution-terminated, "ChildWorkflowExecutionFailed" :child-workflow-execution-failed, "ActivityTaskFailed" :activity-task-failed, "ChildWorkflowExecutionCanceled" :child-workflow-execution-canceled, "DecisionTaskTimedOut" :decision-task-timed-out, "StartLambdaFunctionFailed" :start-lambda-function-failed, "WorkflowExecutionCanceled" :workflow-execution-canceled, "ChildWorkflowExecutionCompleted" :child-workflow-execution-completed, "ExternalWorkflowExecutionCancelRequested" :external-workflow-execution-cancel-requested, "LambdaFunctionScheduled" :lambda-function-scheduled, "ScheduleActivityTaskFailed" :schedule-activity-task-failed, "ActivityTaskScheduled" :activity-task-scheduled, "WorkflowExecutionTimedOut" :workflow-execution-timed-out, "ActivityTaskCanceled" :activity-task-canceled, "StartChildWorkflowExecutionFailed" :start-child-workflow-execution-failed, "ActivityTaskCancelRequested" :activity-task-cancel-requested, "ChildWorkflowExecutionStarted" :child-workflow-execution-started, "LambdaFunctionCompleted" :lambda-function-completed, "TimerCanceled" :timer-canceled, "CancelWorkflowExecutionFailed" :cancel-workflow-execution-failed, "RequestCancelExternalWorkflowExecutionFailed" :request-cancel-external-workflow-execution-failed, "WorkflowExecutionFailed" :workflow-execution-failed, "FailWorkflowExecutionFailed" :fail-workflow-execution-failed, "MarkerRecorded" :marker-recorded, "WorkflowExecutionContinuedAsNew" :workflow-execution-continued-as-new, "LambdaFunctionFailed" :lambda-function-failed, "ScheduleLambdaFunctionFailed" :schedule-lambda-function-failed, "TimerStarted" :timer-started, "WorkflowExecutionTerminated" :workflow-execution-terminated, "CancelTimerFailed" :cancel-timer-failed, "ExternalWorkflowExecutionSignaled" :external-workflow-execution-signaled, "ContinueAsNewWorkflowExecutionFailed" :continue-as-new-workflow-execution-failed, "LambdaFunctionTimedOut" :lambda-function-timed-out, "LambdaFunctionStarted" :lambda-function-started, "SignalExternalWorkflowExecutionFailed" :signal-external-workflow-execution-failed, "DecisionTaskScheduled" :decision-task-scheduled, "ActivityTaskCompleted" :activity-task-completed, "ChildWorkflowExecutionTimedOut" :child-workflow-execution-timed-out, "RequestCancelActivityTaskFailed" :request-cancel-activity-task-failed, "RequestCancelExternalWorkflowExecutionInitiated" :request-cancel-external-workflow-execution-initiated, "WorkflowExecutionSignaled" :workflow-execution-signaled, "WorkflowExecutionCompleted" :workflow-execution-completed, "ActivityTaskStarted" :activity-task-started, "WorkflowExecutionCancelRequested" :workflow-execution-cancel-requested, "RecordMarkerFailed" :record-marker-failed, "ActivityTaskTimedOut" :activity-task-timed-out} input))

(clojure.core/defn- deser-workflow-run-id [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-workflow-execution-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workflow-execution-info coll))) input))

(clojure.core/defn- deser-task-priority [input] input)

(clojure.core/defn- deser-decision-task-timed-out-event-attributes [input] (clojure.core/cond-> {:timeout-type (deser-decision-task-timeout-type (input "timeoutType")), :scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))}))

(clojure.core/defn- deser-activity-type-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "defaultTaskStartToCloseTimeout") (clojure.core/assoc :default-task-start-to-close-timeout (deser-duration-in-seconds-optional (input "defaultTaskStartToCloseTimeout"))) (clojure.core/contains? input "defaultTaskHeartbeatTimeout") (clojure.core/assoc :default-task-heartbeat-timeout (deser-duration-in-seconds-optional (input "defaultTaskHeartbeatTimeout"))) (clojure.core/contains? input "defaultTaskList") (clojure.core/assoc :default-task-list (deser-task-list (input "defaultTaskList"))) (clojure.core/contains? input "defaultTaskPriority") (clojure.core/assoc :default-task-priority (deser-task-priority (input "defaultTaskPriority"))) (clojure.core/contains? input "defaultTaskScheduleToStartTimeout") (clojure.core/assoc :default-task-schedule-to-start-timeout (deser-duration-in-seconds-optional (input "defaultTaskScheduleToStartTimeout"))) (clojure.core/contains? input "defaultTaskScheduleToCloseTimeout") (clojure.core/assoc :default-task-schedule-to-close-timeout (deser-duration-in-seconds-optional (input "defaultTaskScheduleToCloseTimeout")))))

(clojure.core/defn- deser-child-workflow-execution-timed-out-event-attributes [input] (clojure.core/cond-> {:workflow-execution (deser-workflow-execution (input "workflowExecution")), :workflow-type (deser-workflow-type (input "workflowType")), :timeout-type (deser-workflow-execution-timeout-type (input "timeoutType")), :initiated-event-id (deser-event-id (input "initiatedEventId")), :started-event-id (deser-event-id (input "startedEventId"))}))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-duration-in-seconds [input] input)

(clojure.core/defn- deser-duration-in-seconds-optional [input] input)

(clojure.core/defn- deser-continue-as-new-workflow-execution-failed-cause [input] (clojure.core/get {"DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" :default-task-start-to-close-timeout-undefined, "WORKFLOW_TYPE_DEPRECATED" :workflow-type-deprecated, "UNHANDLED_DECISION" :unhandled-decision, "DEFAULT_CHILD_POLICY_UNDEFINED" :default-child-policy-undefined, "OPERATION_NOT_PERMITTED" :operation-not-permitted, "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED" :continue-as-new-workflow-execution-rate-exceeded, "WORKFLOW_TYPE_DOES_NOT_EXIST" :workflow-type-does-not-exist, "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" :default-execution-start-to-close-timeout-undefined, "DEFAULT_TASK_LIST_UNDEFINED" :default-task-list-undefined} input))

(clojure.core/defn- deser-child-workflow-execution-completed-event-attributes [input] (clojure.core/cond-> {:workflow-execution (deser-workflow-execution (input "workflowExecution")), :workflow-type (deser-workflow-type (input "workflowType")), :initiated-event-id (deser-event-id (input "initiatedEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-data (input "result")))))

(clojure.core/defn- deser-workflow-execution-cancel-requested-event-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "externalWorkflowExecution") (clojure.core/assoc :external-workflow-execution (deser-workflow-execution (input "externalWorkflowExecution"))) (clojure.core/contains? input "externalInitiatedEventId") (clojure.core/assoc :external-initiated-event-id (deser-event-id (input "externalInitiatedEventId"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-workflow-execution-cancel-requested-cause (input "cause")))))

(clojure.core/defn- deser-activity-task-cancel-requested-event-attributes [input] (clojure.core/cond-> {:decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId")), :activity-id (deser-activity-id (input "activityId"))}))

(clojure.core/defn- deser-activity-id [input] input)

(clojure.core/defn- deser-activity-type [input] (clojure.core/cond-> {:name (deser-name (input "name")), :version (deser-version (input "version"))}))

(clojure.core/defn- deser-start-child-workflow-execution-initiated-event-attributes [input] (clojure.core/cond-> {:workflow-id (deser-workflow-id (input "workflowId")), :workflow-type (deser-workflow-type (input "workflowType")), :task-list (deser-task-list (input "taskList")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId")), :child-policy (deser-child-policy (input "childPolicy"))} (clojure.core/contains? input "executionStartToCloseTimeout") (clojure.core/assoc :execution-start-to-close-timeout (deser-duration-in-seconds-optional (input "executionStartToCloseTimeout"))) (clojure.core/contains? input "taskStartToCloseTimeout") (clojure.core/assoc :task-start-to-close-timeout (deser-duration-in-seconds-optional (input "taskStartToCloseTimeout"))) (clojure.core/contains? input "tagList") (clojure.core/assoc :tag-list (deser-tag-list (input "tagList"))) (clojure.core/contains? input "taskPriority") (clojure.core/assoc :task-priority (deser-task-priority (input "taskPriority"))) (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control"))) (clojure.core/contains? input "lambdaRole") (clojure.core/assoc :lambda-role (deser-arn (input "lambdaRole"))) (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-data (input "input")))))

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-workflow-execution-info [input] (clojure.core/cond-> {:execution (deser-workflow-execution (input "execution")), :workflow-type (deser-workflow-type (input "workflowType")), :start-timestamp (deser-timestamp (input "startTimestamp")), :execution-status (deser-execution-status (input "executionStatus"))} (clojure.core/contains? input "closeTimestamp") (clojure.core/assoc :close-timestamp (deser-timestamp (input "closeTimestamp"))) (clojure.core/contains? input "parent") (clojure.core/assoc :parent (deser-workflow-execution (input "parent"))) (clojure.core/contains? input "cancelRequested") (clojure.core/assoc :cancel-requested (deser-canceled (input "cancelRequested"))) (clojure.core/contains? input "closeStatus") (clojure.core/assoc :close-status (deser-close-status (input "closeStatus"))) (clojure.core/contains? input "tagList") (clojure.core/assoc :tag-list (deser-tag-list (input "tagList")))))

(clojure.core/defn- deser-decision-task-timeout-type [input] (clojure.core/get {"START_TO_CLOSE" :start-to-close} input))

(clojure.core/defn- deser-child-workflow-execution-terminated-event-attributes [input] (clojure.core/cond-> {:workflow-execution (deser-workflow-execution (input "workflowExecution")), :workflow-type (deser-workflow-type (input "workflowType")), :initiated-event-id (deser-event-id (input "initiatedEventId")), :started-event-id (deser-event-id (input "startedEventId"))}))

(clojure.core/defn- deser-failure-reason [input] input)

(clojure.core/defn- deser-workflow-execution-timed-out-event-attributes [input] (clojure.core/cond-> {:timeout-type (deser-workflow-execution-timeout-type (input "timeoutType")), :child-policy (deser-child-policy (input "childPolicy"))}))

(clojure.core/defn- deser-schedule-lambda-function-failed-cause [input] (clojure.core/get {"ID_ALREADY_IN_USE" :id-already-in-use, "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED" :open-lambda-functions-limit-exceeded, "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED" :lambda-function-creation-rate-exceeded, "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION" :lambda-service-not-available-in-region} input))

(clojure.core/defn- deser-domain-configuration [input] (clojure.core/cond-> {:workflow-execution-retention-period-in-days (deser-duration-in-days (input "workflowExecutionRetentionPeriodInDays"))}))

(clojure.core/defn- deser-child-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:workflow-execution (deser-workflow-execution (input "workflowExecution")), :workflow-type (deser-workflow-type (input "workflowType")), :initiated-event-id (deser-event-id (input "initiatedEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-failure-reason (input "reason"))) (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details")))))

(clojure.core/defn- deser-marker-name [input] input)

(clojure.core/defn- deser-canceled [input] input)

(clojure.core/defn- deser-function-id [input] input)

(clojure.core/defn- deser-timer-id [input] input)

(clojure.core/defn- deser-decision-task-started-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId"))} (clojure.core/contains? input "identity") (clojure.core/assoc :identity (deser-identity (input "identity")))))

(clojure.core/defn- deser-decision-task-scheduled-event-attributes [input] (clojure.core/cond-> {:task-list (deser-task-list (input "taskList"))} (clojure.core/contains? input "taskPriority") (clojure.core/assoc :task-priority (deser-task-priority (input "taskPriority"))) (clojure.core/contains? input "startToCloseTimeout") (clojure.core/assoc :start-to-close-timeout (deser-duration-in-seconds-optional (input "startToCloseTimeout")))))

(clojure.core/defn- deser-workflow-execution-terminated-cause [input] (clojure.core/get {"CHILD_POLICY_APPLIED" :child-policy-applied, "EVENT_LIMIT_EXCEEDED" :event-limit-exceeded, "OPERATOR_INITIATED" :operator-initiated} input))

(clojure.core/defn- deser-fail-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:cause (deser-fail-workflow-execution-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-request-cancel-external-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:workflow-id (deser-workflow-id (input "workflowId")), :cause (deser-request-cancel-external-workflow-execution-failed-cause (input "cause")), :initiated-event-id (deser-event-id (input "initiatedEventId")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "runId") (clojure.core/assoc :run-id (deser-workflow-run-id-optional (input "runId"))) (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control")))))

(clojure.core/defn- deser-data [input] input)

(clojure.core/defn- deser-identity [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-decision-task-completed-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "executionContext") (clojure.core/assoc :execution-context (deser-data (input "executionContext")))))

(clojure.core/defn- deser-start-timer-failed-event-attributes [input] (clojure.core/cond-> {:timer-id (deser-timer-id (input "timerId")), :cause (deser-start-timer-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-timer-fired-event-attributes [input] (clojure.core/cond-> {:timer-id (deser-timer-id (input "timerId")), :started-event-id (deser-event-id (input "startedEventId"))}))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-external-workflow-execution-cancel-requested-event-attributes [input] (clojure.core/cond-> {:workflow-execution (deser-workflow-execution (input "workflowExecution")), :initiated-event-id (deser-event-id (input "initiatedEventId"))}))

(clojure.core/defn- deser-execution-status [input] (clojure.core/get {"OPEN" :open, "CLOSED" :closed} input))

(clojure.core/defn- deser-activity-task-scheduled-event-attributes [input] (clojure.core/cond-> {:activity-type (deser-activity-type (input "activityType")), :activity-id (deser-activity-id (input "activityId")), :task-list (deser-task-list (input "taskList")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "scheduleToStartTimeout") (clojure.core/assoc :schedule-to-start-timeout (deser-duration-in-seconds-optional (input "scheduleToStartTimeout"))) (clojure.core/contains? input "startToCloseTimeout") (clojure.core/assoc :start-to-close-timeout (deser-duration-in-seconds-optional (input "startToCloseTimeout"))) (clojure.core/contains? input "scheduleToCloseTimeout") (clojure.core/assoc :schedule-to-close-timeout (deser-duration-in-seconds-optional (input "scheduleToCloseTimeout"))) (clojure.core/contains? input "taskPriority") (clojure.core/assoc :task-priority (deser-task-priority (input "taskPriority"))) (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control"))) (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-data (input "input"))) (clojure.core/contains? input "heartbeatTimeout") (clojure.core/assoc :heartbeat-timeout (deser-duration-in-seconds-optional (input "heartbeatTimeout")))))

(clojure.core/defn- deser-timer-canceled-event-attributes [input] (clojure.core/cond-> {:timer-id (deser-timer-id (input "timerId")), :started-event-id (deser-event-id (input "startedEventId")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-record-marker-failed-cause [input] (clojure.core/get {"OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-tag [input] input)

(clojure.core/defn- deser-version [input] input)

(clojure.core/defn- deser-workflow-type-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "defaultTaskStartToCloseTimeout") (clojure.core/assoc :default-task-start-to-close-timeout (deser-duration-in-seconds-optional (input "defaultTaskStartToCloseTimeout"))) (clojure.core/contains? input "defaultExecutionStartToCloseTimeout") (clojure.core/assoc :default-execution-start-to-close-timeout (deser-duration-in-seconds-optional (input "defaultExecutionStartToCloseTimeout"))) (clojure.core/contains? input "defaultTaskList") (clojure.core/assoc :default-task-list (deser-task-list (input "defaultTaskList"))) (clojure.core/contains? input "defaultTaskPriority") (clojure.core/assoc :default-task-priority (deser-task-priority (input "defaultTaskPriority"))) (clojure.core/contains? input "defaultChildPolicy") (clojure.core/assoc :default-child-policy (deser-child-policy (input "defaultChildPolicy"))) (clojure.core/contains? input "defaultLambdaRole") (clojure.core/assoc :default-lambda-role (deser-arn (input "defaultLambdaRole")))))

(clojure.core/defn- deser-task-token [input] input)

(clojure.core/defn- deser-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-failure-reason (input "reason"))) (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details")))))

(clojure.core/defn- deser-cancel-timer-failed-event-attributes [input] (clojure.core/cond-> {:timer-id (deser-timer-id (input "timerId")), :cause (deser-cancel-timer-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-lambda-function-started-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId"))}))

(clojure.core/defn- deser-domain-name [input] input)

(clojure.core/defn- deser-workflow-type-info [input] (clojure.core/cond-> {:workflow-type (deser-workflow-type (input "workflowType")), :status (deser-registration-status (input "status")), :creation-date (deser-timestamp (input "creationDate"))} (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "deprecationDate") (clojure.core/assoc :deprecation-date (deser-timestamp (input "deprecationDate")))))

(clojure.core/defn- deser-event-id [input] input)

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-history-event [input] (clojure.core/cond-> {:event-timestamp (deser-timestamp (input "eventTimestamp")), :event-type (deser-event-type (input "eventType")), :event-id (deser-event-id (input "eventId"))} (clojure.core/contains? input "activityTaskCanceledEventAttributes") (clojure.core/assoc :activity-task-canceled-event-attributes (deser-activity-task-canceled-event-attributes (input "activityTaskCanceledEventAttributes"))) (clojure.core/contains? input "continueAsNewWorkflowExecutionFailedEventAttributes") (clojure.core/assoc :continue-as-new-workflow-execution-failed-event-attributes (deser-continue-as-new-workflow-execution-failed-event-attributes (input "continueAsNewWorkflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "activityTaskStartedEventAttributes") (clojure.core/assoc :activity-task-started-event-attributes (deser-activity-task-started-event-attributes (input "activityTaskStartedEventAttributes"))) (clojure.core/contains? input "workflowExecutionCancelRequestedEventAttributes") (clojure.core/assoc :workflow-execution-cancel-requested-event-attributes (deser-workflow-execution-cancel-requested-event-attributes (input "workflowExecutionCancelRequestedEventAttributes"))) (clojure.core/contains? input "decisionTaskTimedOutEventAttributes") (clojure.core/assoc :decision-task-timed-out-event-attributes (deser-decision-task-timed-out-event-attributes (input "decisionTaskTimedOutEventAttributes"))) (clojure.core/contains? input "timerFiredEventAttributes") (clojure.core/assoc :timer-fired-event-attributes (deser-timer-fired-event-attributes (input "timerFiredEventAttributes"))) (clojure.core/contains? input "workflowExecutionCompletedEventAttributes") (clojure.core/assoc :workflow-execution-completed-event-attributes (deser-workflow-execution-completed-event-attributes (input "workflowExecutionCompletedEventAttributes"))) (clojure.core/contains? input "cancelTimerFailedEventAttributes") (clojure.core/assoc :cancel-timer-failed-event-attributes (deser-cancel-timer-failed-event-attributes (input "cancelTimerFailedEventAttributes"))) (clojure.core/contains? input "activityTaskCompletedEventAttributes") (clojure.core/assoc :activity-task-completed-event-attributes (deser-activity-task-completed-event-attributes (input "activityTaskCompletedEventAttributes"))) (clojure.core/contains? input "childWorkflowExecutionFailedEventAttributes") (clojure.core/assoc :child-workflow-execution-failed-event-attributes (deser-child-workflow-execution-failed-event-attributes (input "childWorkflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "workflowExecutionStartedEventAttributes") (clojure.core/assoc :workflow-execution-started-event-attributes (deser-workflow-execution-started-event-attributes (input "workflowExecutionStartedEventAttributes"))) (clojure.core/contains? input "cancelWorkflowExecutionFailedEventAttributes") (clojure.core/assoc :cancel-workflow-execution-failed-event-attributes (deser-cancel-workflow-execution-failed-event-attributes (input "cancelWorkflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "activityTaskScheduledEventAttributes") (clojure.core/assoc :activity-task-scheduled-event-attributes (deser-activity-task-scheduled-event-attributes (input "activityTaskScheduledEventAttributes"))) (clojure.core/contains? input "requestCancelExternalWorkflowExecutionInitiatedEventAttributes") (clojure.core/assoc :request-cancel-external-workflow-execution-initiated-event-attributes (deser-request-cancel-external-workflow-execution-initiated-event-attributes (input "requestCancelExternalWorkflowExecutionInitiatedEventAttributes"))) (clojure.core/contains? input "activityTaskCancelRequestedEventAttributes") (clojure.core/assoc :activity-task-cancel-requested-event-attributes (deser-activity-task-cancel-requested-event-attributes (input "activityTaskCancelRequestedEventAttributes"))) (clojure.core/contains? input "scheduleLambdaFunctionFailedEventAttributes") (clojure.core/assoc :schedule-lambda-function-failed-event-attributes (deser-schedule-lambda-function-failed-event-attributes (input "scheduleLambdaFunctionFailedEventAttributes"))) (clojure.core/contains? input "workflowExecutionContinuedAsNewEventAttributes") (clojure.core/assoc :workflow-execution-continued-as-new-event-attributes (deser-workflow-execution-continued-as-new-event-attributes (input "workflowExecutionContinuedAsNewEventAttributes"))) (clojure.core/contains? input "workflowExecutionSignaledEventAttributes") (clojure.core/assoc :workflow-execution-signaled-event-attributes (deser-workflow-execution-signaled-event-attributes (input "workflowExecutionSignaledEventAttributes"))) (clojure.core/contains? input "childWorkflowExecutionTimedOutEventAttributes") (clojure.core/assoc :child-workflow-execution-timed-out-event-attributes (deser-child-workflow-execution-timed-out-event-attributes (input "childWorkflowExecutionTimedOutEventAttributes"))) (clojure.core/contains? input "decisionTaskScheduledEventAttributes") (clojure.core/assoc :decision-task-scheduled-event-attributes (deser-decision-task-scheduled-event-attributes (input "decisionTaskScheduledEventAttributes"))) (clojure.core/contains? input "childWorkflowExecutionTerminatedEventAttributes") (clojure.core/assoc :child-workflow-execution-terminated-event-attributes (deser-child-workflow-execution-terminated-event-attributes (input "childWorkflowExecutionTerminatedEventAttributes"))) (clojure.core/contains? input "decisionTaskStartedEventAttributes") (clojure.core/assoc :decision-task-started-event-attributes (deser-decision-task-started-event-attributes (input "decisionTaskStartedEventAttributes"))) (clojure.core/contains? input "workflowExecutionFailedEventAttributes") (clojure.core/assoc :workflow-execution-failed-event-attributes (deser-workflow-execution-failed-event-attributes (input "workflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "childWorkflowExecutionStartedEventAttributes") (clojure.core/assoc :child-workflow-execution-started-event-attributes (deser-child-workflow-execution-started-event-attributes (input "childWorkflowExecutionStartedEventAttributes"))) (clojure.core/contains? input "completeWorkflowExecutionFailedEventAttributes") (clojure.core/assoc :complete-workflow-execution-failed-event-attributes (deser-complete-workflow-execution-failed-event-attributes (input "completeWorkflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "childWorkflowExecutionCanceledEventAttributes") (clojure.core/assoc :child-workflow-execution-canceled-event-attributes (deser-child-workflow-execution-canceled-event-attributes (input "childWorkflowExecutionCanceledEventAttributes"))) (clojure.core/contains? input "decisionTaskCompletedEventAttributes") (clojure.core/assoc :decision-task-completed-event-attributes (deser-decision-task-completed-event-attributes (input "decisionTaskCompletedEventAttributes"))) (clojure.core/contains? input "lambdaFunctionCompletedEventAttributes") (clojure.core/assoc :lambda-function-completed-event-attributes (deser-lambda-function-completed-event-attributes (input "lambdaFunctionCompletedEventAttributes"))) (clojure.core/contains? input "recordMarkerFailedEventAttributes") (clojure.core/assoc :record-marker-failed-event-attributes (deser-record-marker-failed-event-attributes (input "recordMarkerFailedEventAttributes"))) (clojure.core/contains? input "startChildWorkflowExecutionFailedEventAttributes") (clojure.core/assoc :start-child-workflow-execution-failed-event-attributes (deser-start-child-workflow-execution-failed-event-attributes (input "startChildWorkflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "lambdaFunctionFailedEventAttributes") (clojure.core/assoc :lambda-function-failed-event-attributes (deser-lambda-function-failed-event-attributes (input "lambdaFunctionFailedEventAttributes"))) (clojure.core/contains? input "signalExternalWorkflowExecutionInitiatedEventAttributes") (clojure.core/assoc :signal-external-workflow-execution-initiated-event-attributes (deser-signal-external-workflow-execution-initiated-event-attributes (input "signalExternalWorkflowExecutionInitiatedEventAttributes"))) (clojure.core/contains? input "failWorkflowExecutionFailedEventAttributes") (clojure.core/assoc :fail-workflow-execution-failed-event-attributes (deser-fail-workflow-execution-failed-event-attributes (input "failWorkflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "startTimerFailedEventAttributes") (clojure.core/assoc :start-timer-failed-event-attributes (deser-start-timer-failed-event-attributes (input "startTimerFailedEventAttributes"))) (clojure.core/contains? input "scheduleActivityTaskFailedEventAttributes") (clojure.core/assoc :schedule-activity-task-failed-event-attributes (deser-schedule-activity-task-failed-event-attributes (input "scheduleActivityTaskFailedEventAttributes"))) (clojure.core/contains? input "timerCanceledEventAttributes") (clojure.core/assoc :timer-canceled-event-attributes (deser-timer-canceled-event-attributes (input "timerCanceledEventAttributes"))) (clojure.core/contains? input "requestCancelActivityTaskFailedEventAttributes") (clojure.core/assoc :request-cancel-activity-task-failed-event-attributes (deser-request-cancel-activity-task-failed-event-attributes (input "requestCancelActivityTaskFailedEventAttributes"))) (clojure.core/contains? input "timerStartedEventAttributes") (clojure.core/assoc :timer-started-event-attributes (deser-timer-started-event-attributes (input "timerStartedEventAttributes"))) (clojure.core/contains? input "startChildWorkflowExecutionInitiatedEventAttributes") (clojure.core/assoc :start-child-workflow-execution-initiated-event-attributes (deser-start-child-workflow-execution-initiated-event-attributes (input "startChildWorkflowExecutionInitiatedEventAttributes"))) (clojure.core/contains? input "childWorkflowExecutionCompletedEventAttributes") (clojure.core/assoc :child-workflow-execution-completed-event-attributes (deser-child-workflow-execution-completed-event-attributes (input "childWorkflowExecutionCompletedEventAttributes"))) (clojure.core/contains? input "lambdaFunctionScheduledEventAttributes") (clojure.core/assoc :lambda-function-scheduled-event-attributes (deser-lambda-function-scheduled-event-attributes (input "lambdaFunctionScheduledEventAttributes"))) (clojure.core/contains? input "lambdaFunctionTimedOutEventAttributes") (clojure.core/assoc :lambda-function-timed-out-event-attributes (deser-lambda-function-timed-out-event-attributes (input "lambdaFunctionTimedOutEventAttributes"))) (clojure.core/contains? input "requestCancelExternalWorkflowExecutionFailedEventAttributes") (clojure.core/assoc :request-cancel-external-workflow-execution-failed-event-attributes (deser-request-cancel-external-workflow-execution-failed-event-attributes (input "requestCancelExternalWorkflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "lambdaFunctionStartedEventAttributes") (clojure.core/assoc :lambda-function-started-event-attributes (deser-lambda-function-started-event-attributes (input "lambdaFunctionStartedEventAttributes"))) (clojure.core/contains? input "externalWorkflowExecutionCancelRequestedEventAttributes") (clojure.core/assoc :external-workflow-execution-cancel-requested-event-attributes (deser-external-workflow-execution-cancel-requested-event-attributes (input "externalWorkflowExecutionCancelRequestedEventAttributes"))) (clojure.core/contains? input "workflowExecutionCanceledEventAttributes") (clojure.core/assoc :workflow-execution-canceled-event-attributes (deser-workflow-execution-canceled-event-attributes (input "workflowExecutionCanceledEventAttributes"))) (clojure.core/contains? input "startLambdaFunctionFailedEventAttributes") (clojure.core/assoc :start-lambda-function-failed-event-attributes (deser-start-lambda-function-failed-event-attributes (input "startLambdaFunctionFailedEventAttributes"))) (clojure.core/contains? input "markerRecordedEventAttributes") (clojure.core/assoc :marker-recorded-event-attributes (deser-marker-recorded-event-attributes (input "markerRecordedEventAttributes"))) (clojure.core/contains? input "activityTaskTimedOutEventAttributes") (clojure.core/assoc :activity-task-timed-out-event-attributes (deser-activity-task-timed-out-event-attributes (input "activityTaskTimedOutEventAttributes"))) (clojure.core/contains? input "activityTaskFailedEventAttributes") (clojure.core/assoc :activity-task-failed-event-attributes (deser-activity-task-failed-event-attributes (input "activityTaskFailedEventAttributes"))) (clojure.core/contains? input "externalWorkflowExecutionSignaledEventAttributes") (clojure.core/assoc :external-workflow-execution-signaled-event-attributes (deser-external-workflow-execution-signaled-event-attributes (input "externalWorkflowExecutionSignaledEventAttributes"))) (clojure.core/contains? input "signalExternalWorkflowExecutionFailedEventAttributes") (clojure.core/assoc :signal-external-workflow-execution-failed-event-attributes (deser-signal-external-workflow-execution-failed-event-attributes (input "signalExternalWorkflowExecutionFailedEventAttributes"))) (clojure.core/contains? input "workflowExecutionTimedOutEventAttributes") (clojure.core/assoc :workflow-execution-timed-out-event-attributes (deser-workflow-execution-timed-out-event-attributes (input "workflowExecutionTimedOutEventAttributes"))) (clojure.core/contains? input "workflowExecutionTerminatedEventAttributes") (clojure.core/assoc :workflow-execution-terminated-event-attributes (deser-workflow-execution-terminated-event-attributes (input "workflowExecutionTerminatedEventAttributes")))))

(clojure.core/defn- deser-function-input [input] input)

(clojure.core/defn- deser-close-status [input] (clojure.core/get {"COMPLETED" :completed, "FAILED" :failed, "CANCELED" :canceled, "TERMINATED" :terminated, "CONTINUED_AS_NEW" :continued-as-new, "TIMED_OUT" :timed-out} input))

(clojure.core/defn- deser-workflow-execution-terminated-event-attributes [input] (clojure.core/cond-> {:child-policy (deser-child-policy (input "childPolicy"))} (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-terminate-reason (input "reason"))) (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-data (input "details"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-workflow-execution-terminated-cause (input "cause")))))

(clojure.core/defn- deser-domain-info [input] (clojure.core/cond-> {:name (deser-domain-name (input "name")), :status (deser-registration-status (input "status"))} (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description")))))

(clojure.core/defn- deser-signal-external-workflow-execution-failed-cause [input] (clojure.core/get {"UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" :unknown-external-workflow-execution, "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" :signal-external-workflow-execution-rate-exceeded, "OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-child-workflow-execution-started-event-attributes [input] (clojure.core/cond-> {:workflow-execution (deser-workflow-execution (input "workflowExecution")), :workflow-type (deser-workflow-type (input "workflowType")), :initiated-event-id (deser-event-id (input "initiatedEventId"))}))

(clojure.core/defn- deser-lambda-function-scheduled-event-attributes [input] (clojure.core/cond-> {:id (deser-function-id (input "id")), :name (deser-function-name (input "name")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control"))) (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-function-input (input "input"))) (clojure.core/contains? input "startToCloseTimeout") (clojure.core/assoc :start-to-close-timeout (deser-duration-in-seconds-optional (input "startToCloseTimeout")))))

(clojure.core/defn- deser-complete-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:cause (deser-complete-workflow-execution-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-complete-workflow-execution-failed-cause [input] (clojure.core/get {"UNHANDLED_DECISION" :unhandled-decision, "OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-signal-name [input] input)

(clojure.core/defn- deser-signal-external-workflow-execution-initiated-event-attributes [input] (clojure.core/cond-> {:workflow-id (deser-workflow-id (input "workflowId")), :signal-name (deser-signal-name (input "signalName")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "runId") (clojure.core/assoc :run-id (deser-workflow-run-id-optional (input "runId"))) (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-data (input "input"))) (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control")))))

(clojure.core/defn- deser-activity-type-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-activity-type-info coll))) input))

(clojure.core/defn- deser-cancel-timer-failed-cause [input] (clojure.core/get {"TIMER_ID_UNKNOWN" :timer-id-unknown, "OPERATION_NOT_PERMITTED" :operation-not-permitted} input))

(clojure.core/defn- deser-terminate-reason [input] input)

(clojure.core/defn- deser-workflow-id [input] input)

(clojure.core/defn- deser-activity-task-started-event-attributes [input] (clojure.core/cond-> {:scheduled-event-id (deser-event-id (input "scheduledEventId"))} (clojure.core/contains? input "identity") (clojure.core/assoc :identity (deser-identity (input "identity")))))

(clojure.core/defn- deser-workflow-execution-cancel-requested-cause [input] (clojure.core/get {"CHILD_POLICY_APPLIED" :child-policy-applied} input))

(clojure.core/defn- deser-page-token [input] input)

(clojure.core/defn- deser-start-lambda-function-failed-cause [input] (clojure.core/get {"ASSUME_ROLE_FAILED" :assume-role-failed} input))

(clojure.core/defn- deser-request-cancel-external-workflow-execution-initiated-event-attributes [input] (clojure.core/cond-> {:workflow-id (deser-workflow-id (input "workflowId")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "runId") (clojure.core/assoc :run-id (deser-workflow-run-id-optional (input "runId"))) (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-data (input "control")))))

(clojure.core/defn- deser-cancel-workflow-execution-failed-event-attributes [input] (clojure.core/cond-> {:cause (deser-cancel-workflow-execution-failed-cause (input "cause")), :decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))}))

(clojure.core/defn- deser-workflow-execution-open-counts [input] (clojure.core/cond-> {:open-activity-tasks (deser-count (input "openActivityTasks")), :open-decision-tasks (deser-open-decision-tasks-count (input "openDecisionTasks")), :open-timers (deser-count (input "openTimers")), :open-child-workflow-executions (deser-count (input "openChildWorkflowExecutions"))} (clojure.core/contains? input "openLambdaFunctions") (clojure.core/assoc :open-lambda-functions (deser-count (input "openLambdaFunctions")))))

(clojure.core/defn- deser-workflow-execution-completed-event-attributes [input] (clojure.core/cond-> {:decision-task-completed-event-id (deser-event-id (input "decisionTaskCompletedEventId"))} (clojure.core/contains? input "result") (clojure.core/assoc :result (deser-data (input "result")))))

(clojure.core/defn- deser-activity-task-timed-out-event-attributes [input] (clojure.core/cond-> {:timeout-type (deser-activity-task-timeout-type (input "timeoutType")), :scheduled-event-id (deser-event-id (input "scheduledEventId")), :started-event-id (deser-event-id (input "startedEventId"))} (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-limited-data (input "details")))))

(clojure.core/defn- response-workflow-type-detail ([input] (response-workflow-type-detail nil input)) ([resultWrapper2110959 input] (clojure.core/let [rawinput2110958 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110960 {"typeInfo" (rawinput2110958 "typeInfo"), "configuration" (rawinput2110958 "configuration")}] (clojure.core/cond-> {:type-info (deser-workflow-type-info (clojure.core/get-in letvar2110960 ["typeInfo"])), :configuration (deser-workflow-type-configuration (clojure.core/get-in letvar2110960 ["configuration"]))}))))

(clojure.core/defn- response-run ([input] (response-run nil input)) ([resultWrapper2110962 input] (clojure.core/let [rawinput2110961 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110963 {"runId" (rawinput2110961 "runId")}] (clojure.core/cond-> {} (letvar2110963 "runId") (clojure.core/assoc :run-id (deser-workflow-run-id (clojure.core/get-in letvar2110963 ["runId"])))))))

(clojure.core/defn- response-workflow-type-infos ([input] (response-workflow-type-infos nil input)) ([resultWrapper2110965 input] (clojure.core/let [rawinput2110964 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110966 {"typeInfos" (rawinput2110964 "typeInfos"), "nextPageToken" (rawinput2110964 "nextPageToken")}] (clojure.core/cond-> {:type-infos (deser-workflow-type-info-list (clojure.core/get-in letvar2110966 ["typeInfos"]))} (letvar2110966 "nextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2110966 ["nextPageToken"])))))))

(clojure.core/defn- response-operation-not-permitted-fault ([input] (response-operation-not-permitted-fault nil input)) ([resultWrapper2110968 input] (clojure.core/let [rawinput2110967 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110969 {"message" (rawinput2110967 "message")}] (clojure.core/cond-> {} (letvar2110969 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2110969 ["message"])))))))

(clojure.core/defn- response-default-undefined-fault ([input] (response-default-undefined-fault nil input)) ([resultWrapper2110971 input] (clojure.core/let [rawinput2110970 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110972 {"message" (rawinput2110970 "message")}] (clojure.core/cond-> {} (letvar2110972 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2110972 ["message"])))))))

(clojure.core/defn- response-activity-task ([input] (response-activity-task nil input)) ([resultWrapper2110974 input] (clojure.core/let [rawinput2110973 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110975 {"taskToken" (rawinput2110973 "taskToken"), "activityId" (rawinput2110973 "activityId"), "startedEventId" (rawinput2110973 "startedEventId"), "workflowExecution" (rawinput2110973 "workflowExecution"), "activityType" (rawinput2110973 "activityType"), "input" (rawinput2110973 "input")}] (clojure.core/cond-> {:task-token (deser-task-token (clojure.core/get-in letvar2110975 ["taskToken"])), :activity-id (deser-activity-id (clojure.core/get-in letvar2110975 ["activityId"])), :started-event-id (deser-event-id (clojure.core/get-in letvar2110975 ["startedEventId"])), :workflow-execution (deser-workflow-execution (clojure.core/get-in letvar2110975 ["workflowExecution"])), :activity-type (deser-activity-type (clojure.core/get-in letvar2110975 ["activityType"]))} (letvar2110975 "input") (clojure.core/assoc :input (deser-data (clojure.core/get-in letvar2110975 ["input"])))))))

(clojure.core/defn- response-decision-task ([input] (response-decision-task nil input)) ([resultWrapper2110977 input] (clojure.core/let [rawinput2110976 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110978 {"taskToken" (rawinput2110976 "taskToken"), "startedEventId" (rawinput2110976 "startedEventId"), "workflowExecution" (rawinput2110976 "workflowExecution"), "workflowType" (rawinput2110976 "workflowType"), "events" (rawinput2110976 "events"), "nextPageToken" (rawinput2110976 "nextPageToken"), "previousStartedEventId" (rawinput2110976 "previousStartedEventId")}] (clojure.core/cond-> {:task-token (deser-task-token (clojure.core/get-in letvar2110978 ["taskToken"])), :started-event-id (deser-event-id (clojure.core/get-in letvar2110978 ["startedEventId"])), :workflow-execution (deser-workflow-execution (clojure.core/get-in letvar2110978 ["workflowExecution"])), :workflow-type (deser-workflow-type (clojure.core/get-in letvar2110978 ["workflowType"])), :events (deser-history-event-list (clojure.core/get-in letvar2110978 ["events"]))} (letvar2110978 "nextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2110978 ["nextPageToken"]))) (letvar2110978 "previousStartedEventId") (clojure.core/assoc :previous-started-event-id (deser-event-id (clojure.core/get-in letvar2110978 ["previousStartedEventId"])))))))

(clojure.core/defn- response-domain-infos ([input] (response-domain-infos nil input)) ([resultWrapper2110980 input] (clojure.core/let [rawinput2110979 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110981 {"domainInfos" (rawinput2110979 "domainInfos"), "nextPageToken" (rawinput2110979 "nextPageToken")}] (clojure.core/cond-> {:domain-infos (deser-domain-info-list (clojure.core/get-in letvar2110981 ["domainInfos"]))} (letvar2110981 "nextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2110981 ["nextPageToken"])))))))

(clojure.core/defn- response-domain-deprecated-fault ([input] (response-domain-deprecated-fault nil input)) ([resultWrapper2110983 input] (clojure.core/let [rawinput2110982 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110984 {"message" (rawinput2110982 "message")}] (clojure.core/cond-> {} (letvar2110984 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2110984 ["message"])))))))

(clojure.core/defn- response-history ([input] (response-history nil input)) ([resultWrapper2110986 input] (clojure.core/let [rawinput2110985 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110987 {"events" (rawinput2110985 "events"), "nextPageToken" (rawinput2110985 "nextPageToken")}] (clojure.core/cond-> {:events (deser-history-event-list (clojure.core/get-in letvar2110987 ["events"]))} (letvar2110987 "nextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2110987 ["nextPageToken"])))))))

(clojure.core/defn- response-pending-task-count ([input] (response-pending-task-count nil input)) ([resultWrapper2110989 input] (clojure.core/let [rawinput2110988 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110990 {"count" (rawinput2110988 "count"), "truncated" (rawinput2110988 "truncated")}] (clojure.core/cond-> {:count (deser-count (clojure.core/get-in letvar2110990 ["count"]))} (letvar2110990 "truncated") (clojure.core/assoc :truncated (deser-truncated (clojure.core/get-in letvar2110990 ["truncated"])))))))

(clojure.core/defn- response-workflow-execution-count ([input] (response-workflow-execution-count nil input)) ([resultWrapper2110992 input] (clojure.core/let [rawinput2110991 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110993 {"count" (rawinput2110991 "count"), "truncated" (rawinput2110991 "truncated")}] (clojure.core/cond-> {:count (deser-count (clojure.core/get-in letvar2110993 ["count"]))} (letvar2110993 "truncated") (clojure.core/assoc :truncated (deser-truncated (clojure.core/get-in letvar2110993 ["truncated"])))))))

(clojure.core/defn- response-limit-exceeded-fault ([input] (response-limit-exceeded-fault nil input)) ([resultWrapper2110995 input] (clojure.core/let [rawinput2110994 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110996 {"message" (rawinput2110994 "message")}] (clojure.core/cond-> {} (letvar2110996 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2110996 ["message"])))))))

(clojure.core/defn- response-type-already-exists-fault ([input] (response-type-already-exists-fault nil input)) ([resultWrapper2110998 input] (clojure.core/let [rawinput2110997 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2110999 {"message" (rawinput2110997 "message")}] (clojure.core/cond-> {} (letvar2110999 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2110999 ["message"])))))))

(clojure.core/defn- response-activity-type-detail ([input] (response-activity-type-detail nil input)) ([resultWrapper2111001 input] (clojure.core/let [rawinput2111000 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111002 {"typeInfo" (rawinput2111000 "typeInfo"), "configuration" (rawinput2111000 "configuration")}] (clojure.core/cond-> {:type-info (deser-activity-type-info (clojure.core/get-in letvar2111002 ["typeInfo"])), :configuration (deser-activity-type-configuration (clojure.core/get-in letvar2111002 ["configuration"]))}))))

(clojure.core/defn- response-unknown-resource-fault ([input] (response-unknown-resource-fault nil input)) ([resultWrapper2111004 input] (clojure.core/let [rawinput2111003 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111005 {"message" (rawinput2111003 "message")}] (clojure.core/cond-> {} (letvar2111005 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2111005 ["message"])))))))

(clojure.core/defn- response-workflow-execution-detail ([input] (response-workflow-execution-detail nil input)) ([resultWrapper2111007 input] (clojure.core/let [rawinput2111006 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111008 {"executionInfo" (rawinput2111006 "executionInfo"), "executionConfiguration" (rawinput2111006 "executionConfiguration"), "openCounts" (rawinput2111006 "openCounts"), "latestActivityTaskTimestamp" (rawinput2111006 "latestActivityTaskTimestamp"), "latestExecutionContext" (rawinput2111006 "latestExecutionContext")}] (clojure.core/cond-> {:execution-info (deser-workflow-execution-info (clojure.core/get-in letvar2111008 ["executionInfo"])), :execution-configuration (deser-workflow-execution-configuration (clojure.core/get-in letvar2111008 ["executionConfiguration"])), :open-counts (deser-workflow-execution-open-counts (clojure.core/get-in letvar2111008 ["openCounts"]))} (letvar2111008 "latestActivityTaskTimestamp") (clojure.core/assoc :latest-activity-task-timestamp (deser-timestamp (clojure.core/get-in letvar2111008 ["latestActivityTaskTimestamp"]))) (letvar2111008 "latestExecutionContext") (clojure.core/assoc :latest-execution-context (deser-data (clojure.core/get-in letvar2111008 ["latestExecutionContext"])))))))

(clojure.core/defn- response-workflow-execution-already-started-fault ([input] (response-workflow-execution-already-started-fault nil input)) ([resultWrapper2111010 input] (clojure.core/let [rawinput2111009 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111011 {"message" (rawinput2111009 "message")}] (clojure.core/cond-> {} (letvar2111011 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2111011 ["message"])))))))

(clojure.core/defn- response-domain-detail ([input] (response-domain-detail nil input)) ([resultWrapper2111013 input] (clojure.core/let [rawinput2111012 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111014 {"domainInfo" (rawinput2111012 "domainInfo"), "configuration" (rawinput2111012 "configuration")}] (clojure.core/cond-> {:domain-info (deser-domain-info (clojure.core/get-in letvar2111014 ["domainInfo"])), :configuration (deser-domain-configuration (clojure.core/get-in letvar2111014 ["configuration"]))}))))

(clojure.core/defn- response-workflow-execution-infos ([input] (response-workflow-execution-infos nil input)) ([resultWrapper2111016 input] (clojure.core/let [rawinput2111015 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111017 {"executionInfos" (rawinput2111015 "executionInfos"), "nextPageToken" (rawinput2111015 "nextPageToken")}] (clojure.core/cond-> {:execution-infos (deser-workflow-execution-info-list (clojure.core/get-in letvar2111017 ["executionInfos"]))} (letvar2111017 "nextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2111017 ["nextPageToken"])))))))

(clojure.core/defn- response-domain-already-exists-fault ([input] (response-domain-already-exists-fault nil input)) ([resultWrapper2111019 input] (clojure.core/let [rawinput2111018 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111020 {"message" (rawinput2111018 "message")}] (clojure.core/cond-> {} (letvar2111020 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2111020 ["message"])))))))

(clojure.core/defn- response-type-deprecated-fault ([input] (response-type-deprecated-fault nil input)) ([resultWrapper2111022 input] (clojure.core/let [rawinput2111021 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111023 {"message" (rawinput2111021 "message")}] (clojure.core/cond-> {} (letvar2111023 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2111023 ["message"])))))))

(clojure.core/defn- response-activity-task-status ([input] (response-activity-task-status nil input)) ([resultWrapper2111025 input] (clojure.core/let [rawinput2111024 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111026 {"cancelRequested" (rawinput2111024 "cancelRequested")}] (clojure.core/cond-> {:cancel-requested (deser-canceled (clojure.core/get-in letvar2111026 ["cancelRequested"]))}))))

(clojure.core/defn- response-activity-type-infos ([input] (response-activity-type-infos nil input)) ([resultWrapper2111028 input] (clojure.core/let [rawinput2111027 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2111029 {"typeInfos" (rawinput2111027 "typeInfos"), "nextPageToken" (rawinput2111027 "nextPageToken")}] (clojure.core/cond-> {:type-infos (deser-activity-type-info-list (clojure.core/get-in letvar2111029 ["typeInfos"]))} (letvar2111029 "nextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2111029 ["nextPageToken"])))))))

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

(clojure.spec.alpha/def :portkey.aws.swf/workflow-run-id-optional (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

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

(clojure.spec.alpha/def :portkey.aws.swf/limited-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.swf/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

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

(clojure.spec.alpha/def :portkey.aws.swf/cause-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1728))))

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

(clojure.spec.alpha/def :portkey.aws.swf/duration-in-days (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 8))))

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

(clojure.spec.alpha/def :portkey.aws.swf/workflow-run-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

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

(clojure.spec.alpha/def :portkey.aws.swf/duration-in-seconds (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 8))))

(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-canceled-input/task-token (clojure.spec.alpha/and :portkey.aws.swf/task-token))
(clojure.spec.alpha/def :portkey.aws.swf.respond-activity-task-canceled-input/details (clojure.spec.alpha/and :portkey.aws.swf/data))
(clojure.spec.alpha/def :portkey.aws.swf/respond-activity-task-canceled-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.respond-activity-task-canceled-input/task-token] :opt-un [:portkey.aws.swf.respond-activity-task-canceled-input/details]))

(clojure.spec.alpha/def :portkey.aws.swf/duration-in-seconds-optional (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 8))))

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

(clojure.spec.alpha/def :portkey.aws.swf/activity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.swf/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

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

(clojure.spec.alpha/def :portkey.aws.swf/failure-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.swf/version-optional (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

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

(clojure.spec.alpha/def :portkey.aws.swf/marker-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf/canceled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.swf/function-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf/timer-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.swf/data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.swf.describe-activity-type-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.describe-activity-type-input/activity-type (clojure.spec.alpha/and :portkey.aws.swf/activity-type))
(clojure.spec.alpha/def :portkey.aws.swf/describe-activity-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.describe-activity-type-input/domain :portkey.aws.swf.describe-activity-type-input/activity-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/identity (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.describe-workflow-type-input/domain (clojure.spec.alpha/and :portkey.aws.swf/domain-name))
(clojure.spec.alpha/def :portkey.aws.swf.describe-workflow-type-input/workflow-type (clojure.spec.alpha/and :portkey.aws.swf/workflow-type))
(clojure.spec.alpha/def :portkey.aws.swf/describe-workflow-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.describe-workflow-type-input/domain :portkey.aws.swf.describe-workflow-type-input/workflow-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf.tag-filter/tag (clojure.spec.alpha/and :portkey.aws.swf/tag))
(clojure.spec.alpha/def :portkey.aws.swf/tag-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.tag-filter/tag] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.swf/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1600))))

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

(clojure.spec.alpha/def :portkey.aws.swf/tag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf/decision-type #{:request-cancel-external-workflow-execution :complete-workflow-execution "CancelWorkflowExecution" "StartChildWorkflowExecution" :request-cancel-activity-task "ScheduleLambdaFunction" :record-marker :cancel-timer "RequestCancelExternalWorkflowExecution" :schedule-activity-task "CancelTimer" :fail-workflow-execution "ContinueAsNewWorkflowExecution" "FailWorkflowExecution" "ScheduleActivityTask" "StartTimer" "RecordMarker" :schedule-lambda-function :start-timer "RequestCancelActivityTask" :cancel-workflow-execution :continue-as-new-workflow-execution "SignalExternalWorkflowExecution" "CompleteWorkflowExecution" :start-child-workflow-execution :signal-external-workflow-execution})

(clojure.spec.alpha/def :portkey.aws.swf/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-task-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-execution-start-to-close-timeout (clojure.spec.alpha/and :portkey.aws.swf/duration-in-seconds-optional))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-task-list (clojure.spec.alpha/and :portkey.aws.swf/task-list))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-task-priority (clojure.spec.alpha/and :portkey.aws.swf/task-priority))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-child-policy (clojure.spec.alpha/and :portkey.aws.swf/child-policy))
(clojure.spec.alpha/def :portkey.aws.swf.workflow-type-configuration/default-lambda-role (clojure.spec.alpha/and :portkey.aws.swf/arn))
(clojure.spec.alpha/def :portkey.aws.swf/workflow-type-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.workflow-type-configuration/default-task-start-to-close-timeout :portkey.aws.swf.workflow-type-configuration/default-execution-start-to-close-timeout :portkey.aws.swf.workflow-type-configuration/default-task-list :portkey.aws.swf.workflow-type-configuration/default-task-priority :portkey.aws.swf.workflow-type-configuration/default-child-policy :portkey.aws.swf.workflow-type-configuration/default-lambda-role]))

(clojure.spec.alpha/def :portkey.aws.swf/task-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

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

(clojure.spec.alpha/def :portkey.aws.swf/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.swf/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.swf/function-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 32768))))

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

(clojure.spec.alpha/def :portkey.aws.swf/signal-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.swf/terminate-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.swf.activity-task-started-event-attributes/identity (clojure.spec.alpha/and :portkey.aws.swf/identity))
(clojure.spec.alpha/def :portkey.aws.swf.activity-task-started-event-attributes/scheduled-event-id (clojure.spec.alpha/and :portkey.aws.swf/event-id))
(clojure.spec.alpha/def :portkey.aws.swf/activity-task-started-event-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.swf.activity-task-started-event-attributes/scheduled-event-id] :opt-un [:portkey.aws.swf.activity-task-started-event-attributes/identity]))

(clojure.spec.alpha/def :portkey.aws.swf/workflow-execution-cancel-requested-cause #{"CHILD_POLICY_APPLIED" :child-policy-applied})

(clojure.spec.alpha/def :portkey.aws.swf.type-deprecated-fault/message (clojure.spec.alpha/and :portkey.aws.swf/error-message))
(clojure.spec.alpha/def :portkey.aws.swf/type-deprecated-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.swf.type-deprecated-fault/message]))

(clojure.spec.alpha/def :portkey.aws.swf/page-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

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

(clojure.core/defn list-open-workflow-executions ([list-open-workflow-executions-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-open-workflow-executions-input list-open-workflow-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-open-workflow-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOpenWorkflowExecutions", :http.request.configuration/output-deser-fn response-workflow-execution-infos, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef list-open-workflow-executions :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-open-workflow-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-infos))

(clojure.core/defn register-domain ([register-domain-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-register-domain-input register-domain-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/register-domain-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterDomain", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"DomainAlreadyExistsFault" :portkey.aws.swf/domain-already-exists-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef register-domain :args (clojure.spec.alpha/tuple :portkey.aws.swf/register-domain-input) :ret clojure.core/true?)

(clojure.core/defn count-pending-decision-tasks ([count-pending-decision-tasks-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-count-pending-decision-tasks-input count-pending-decision-tasks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/pending-task-count, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/count-pending-decision-tasks-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CountPendingDecisionTasks", :http.request.configuration/output-deser-fn response-pending-task-count, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef count-pending-decision-tasks :args (clojure.spec.alpha/tuple :portkey.aws.swf/count-pending-decision-tasks-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/pending-task-count))

(clojure.core/defn poll-for-decision-task ([poll-for-decision-task-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-poll-for-decision-task-input poll-for-decision-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/decision-task, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/poll-for-decision-task-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PollForDecisionTask", :http.request.configuration/output-deser-fn response-decision-task, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault}})))))
(clojure.spec.alpha/fdef poll-for-decision-task :args (clojure.spec.alpha/tuple :portkey.aws.swf/poll-for-decision-task-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/decision-task))

(clojure.core/defn list-closed-workflow-executions ([list-closed-workflow-executions-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-closed-workflow-executions-input list-closed-workflow-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-closed-workflow-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListClosedWorkflowExecutions", :http.request.configuration/output-deser-fn response-workflow-execution-infos, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef list-closed-workflow-executions :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-closed-workflow-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-infos))

(clojure.core/defn list-domains ([list-domains-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-domains-input list-domains-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/domain-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-domains-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDomains", :http.request.configuration/output-deser-fn response-domain-infos, :http.request.spec/error-spec {"OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef list-domains :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-domains-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/domain-infos))

(clojure.core/defn describe-domain ([describe-domain-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-domain-input describe-domain-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/domain-detail, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/describe-domain-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDomain", :http.request.configuration/output-deser-fn response-domain-detail, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef describe-domain :args (clojure.spec.alpha/tuple :portkey.aws.swf/describe-domain-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/domain-detail))

(clojure.core/defn respond-activity-task-canceled ([respond-activity-task-canceled-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-respond-activity-task-canceled-input respond-activity-task-canceled-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/respond-activity-task-canceled-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RespondActivityTaskCanceled", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef respond-activity-task-canceled :args (clojure.spec.alpha/tuple :portkey.aws.swf/respond-activity-task-canceled-input) :ret clojure.core/true?)

(clojure.core/defn request-cancel-workflow-execution ([request-cancel-workflow-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-request-cancel-workflow-execution-input request-cancel-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/request-cancel-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RequestCancelWorkflowExecution", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef request-cancel-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/request-cancel-workflow-execution-input) :ret clojure.core/true?)

(clojure.core/defn terminate-workflow-execution ([terminate-workflow-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-terminate-workflow-execution-input terminate-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/terminate-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TerminateWorkflowExecution", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef terminate-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/terminate-workflow-execution-input) :ret clojure.core/true?)

(clojure.core/defn get-workflow-execution-history ([get-workflow-execution-history-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-workflow-execution-history-input get-workflow-execution-history-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/history, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/get-workflow-execution-history-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetWorkflowExecutionHistory", :http.request.configuration/output-deser-fn response-history, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef get-workflow-execution-history :args (clojure.spec.alpha/tuple :portkey.aws.swf/get-workflow-execution-history-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/history))

(clojure.core/defn start-workflow-execution ([start-workflow-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-workflow-execution-input start-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/run, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/start-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartWorkflowExecution", :http.request.configuration/output-deser-fn response-run, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "TypeDeprecatedFault" :portkey.aws.swf/type-deprecated-fault, "WorkflowExecutionAlreadyStartedFault" :portkey.aws.swf/workflow-execution-already-started-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "DefaultUndefinedFault" :portkey.aws.swf/default-undefined-fault}})))))
(clojure.spec.alpha/fdef start-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/start-workflow-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/run))

(clojure.core/defn register-activity-type ([register-activity-type-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-register-activity-type-input register-activity-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/register-activity-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterActivityType", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"TypeAlreadyExistsFault" :portkey.aws.swf/type-already-exists-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault, "UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef register-activity-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/register-activity-type-input) :ret clojure.core/true?)

(clojure.core/defn respond-decision-task-completed ([respond-decision-task-completed-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-respond-decision-task-completed-input respond-decision-task-completed-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/respond-decision-task-completed-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RespondDecisionTaskCompleted", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef respond-decision-task-completed :args (clojure.spec.alpha/tuple :portkey.aws.swf/respond-decision-task-completed-input) :ret clojure.core/true?)

(clojure.core/defn register-workflow-type ([register-workflow-type-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-register-workflow-type-input register-workflow-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/register-workflow-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterWorkflowType", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"TypeAlreadyExistsFault" :portkey.aws.swf/type-already-exists-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault, "UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef register-workflow-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/register-workflow-type-input) :ret clojure.core/true?)

(clojure.core/defn describe-workflow-type ([describe-workflow-type-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-workflow-type-input describe-workflow-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-type-detail, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/describe-workflow-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkflowType", :http.request.configuration/output-deser-fn response-workflow-type-detail, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef describe-workflow-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/describe-workflow-type-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-detail))

(clojure.core/defn respond-activity-task-failed ([respond-activity-task-failed-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-respond-activity-task-failed-input respond-activity-task-failed-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/respond-activity-task-failed-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RespondActivityTaskFailed", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef respond-activity-task-failed :args (clojure.spec.alpha/tuple :portkey.aws.swf/respond-activity-task-failed-input) :ret clojure.core/true?)

(clojure.core/defn poll-for-activity-task ([poll-for-activity-task-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-poll-for-activity-task-input poll-for-activity-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/activity-task, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/poll-for-activity-task-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PollForActivityTask", :http.request.configuration/output-deser-fn response-activity-task, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "LimitExceededFault" :portkey.aws.swf/limit-exceeded-fault}})))))
(clojure.spec.alpha/fdef poll-for-activity-task :args (clojure.spec.alpha/tuple :portkey.aws.swf/poll-for-activity-task-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/activity-task))

(clojure.core/defn list-workflow-types ([list-workflow-types-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-workflow-types-input list-workflow-types-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-type-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-workflow-types-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListWorkflowTypes", :http.request.configuration/output-deser-fn response-workflow-type-infos, :http.request.spec/error-spec {"OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault}})))))
(clojure.spec.alpha/fdef list-workflow-types :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-workflow-types-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-type-infos))

(clojure.core/defn signal-workflow-execution ([signal-workflow-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-signal-workflow-execution-input signal-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/signal-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SignalWorkflowExecution", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef signal-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/signal-workflow-execution-input) :ret clojure.core/true?)

(clojure.core/defn deprecate-domain ([deprecate-domain-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-deprecate-domain-input deprecate-domain-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/deprecate-domain-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeprecateDomain", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "DomainDeprecatedFault" :portkey.aws.swf/domain-deprecated-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef deprecate-domain :args (clojure.spec.alpha/tuple :portkey.aws.swf/deprecate-domain-input) :ret clojure.core/true?)

(clojure.core/defn describe-workflow-execution ([describe-workflow-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-workflow-execution-input describe-workflow-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-detail, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/describe-workflow-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkflowExecution", :http.request.configuration/output-deser-fn response-workflow-execution-detail, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef describe-workflow-execution :args (clojure.spec.alpha/tuple :portkey.aws.swf/describe-workflow-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-detail))

(clojure.core/defn count-open-workflow-executions ([count-open-workflow-executions-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-count-open-workflow-executions-input count-open-workflow-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-count, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/count-open-workflow-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CountOpenWorkflowExecutions", :http.request.configuration/output-deser-fn response-workflow-execution-count, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef count-open-workflow-executions :args (clojure.spec.alpha/tuple :portkey.aws.swf/count-open-workflow-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-count))

(clojure.core/defn list-activity-types ([list-activity-types-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-activity-types-input list-activity-types-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/activity-type-infos, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/list-activity-types-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListActivityTypes", :http.request.configuration/output-deser-fn response-activity-type-infos, :http.request.spec/error-spec {"OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault, "UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault}})))))
(clojure.spec.alpha/fdef list-activity-types :args (clojure.spec.alpha/tuple :portkey.aws.swf/list-activity-types-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/activity-type-infos))

(clojure.core/defn describe-activity-type ([describe-activity-type-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-activity-type-input describe-activity-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/activity-type-detail, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/describe-activity-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeActivityType", :http.request.configuration/output-deser-fn response-activity-type-detail, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef describe-activity-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/describe-activity-type-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/activity-type-detail))

(clojure.core/defn respond-activity-task-completed ([respond-activity-task-completed-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-respond-activity-task-completed-input respond-activity-task-completed-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/respond-activity-task-completed-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RespondActivityTaskCompleted", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef respond-activity-task-completed :args (clojure.spec.alpha/tuple :portkey.aws.swf/respond-activity-task-completed-input) :ret clojure.core/true?)

(clojure.core/defn record-activity-task-heartbeat ([record-activity-task-heartbeat-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-record-activity-task-heartbeat-input record-activity-task-heartbeat-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/activity-task-status, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/record-activity-task-heartbeat-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RecordActivityTaskHeartbeat", :http.request.configuration/output-deser-fn response-activity-task-status, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef record-activity-task-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.swf/record-activity-task-heartbeat-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/activity-task-status))

(clojure.core/defn count-closed-workflow-executions ([count-closed-workflow-executions-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-count-closed-workflow-executions-input count-closed-workflow-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/workflow-execution-count, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/count-closed-workflow-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CountClosedWorkflowExecutions", :http.request.configuration/output-deser-fn response-workflow-execution-count, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef count-closed-workflow-executions :args (clojure.spec.alpha/tuple :portkey.aws.swf/count-closed-workflow-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/workflow-execution-count))

(clojure.core/defn count-pending-activity-tasks ([count-pending-activity-tasks-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-count-pending-activity-tasks-input count-pending-activity-tasks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec :portkey.aws.swf/pending-task-count, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/count-pending-activity-tasks-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CountPendingActivityTasks", :http.request.configuration/output-deser-fn response-pending-task-count, :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef count-pending-activity-tasks :args (clojure.spec.alpha/tuple :portkey.aws.swf/count-pending-activity-tasks-input) :ret (clojure.spec.alpha/and :portkey.aws.swf/pending-task-count))

(clojure.core/defn deprecate-workflow-type ([deprecate-workflow-type-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-deprecate-workflow-type-input deprecate-workflow-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/deprecate-workflow-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeprecateWorkflowType", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "TypeDeprecatedFault" :portkey.aws.swf/type-deprecated-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef deprecate-workflow-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/deprecate-workflow-type-input) :ret clojure.core/true?)

(clojure.core/defn deprecate-activity-type ([deprecate-activity-type-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-deprecate-activity-type-input deprecate-activity-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.swf/endpoints, :http.request.configuration/target-prefix "SimpleWorkflowService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-01-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.swf/deprecate-activity-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeprecateActivityType", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"UnknownResourceFault" :portkey.aws.swf/unknown-resource-fault, "TypeDeprecatedFault" :portkey.aws.swf/type-deprecated-fault, "OperationNotPermittedFault" :portkey.aws.swf/operation-not-permitted-fault}})))))
(clojure.spec.alpha/fdef deprecate-activity-type :args (clojure.spec.alpha/tuple :portkey.aws.swf/deprecate-activity-type-input) :ret clojure.core/true?)
