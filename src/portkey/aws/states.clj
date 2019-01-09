(ns portkey.aws.states (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "states", :region "ap-northeast-1"},
    :ssl-common-name "states.ap-northeast-1.amazonaws.com",
    :endpoint "https://states.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "states", :region "eu-west-1"},
    :ssl-common-name "states.eu-west-1.amazonaws.com",
    :endpoint "https://states.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "states", :region "us-east-2"},
    :ssl-common-name "states.us-east-2.amazonaws.com",
    :endpoint "https://states.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "states", :region "ap-southeast-2"},
    :ssl-common-name "states.ap-southeast-2.amazonaws.com",
    :endpoint "https://states.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "states", :region "ap-southeast-1"},
    :ssl-common-name "states.ap-southeast-1.amazonaws.com",
    :endpoint "https://states.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "states", :region "ap-northeast-2"},
    :ssl-common-name "states.ap-northeast-2.amazonaws.com",
    :endpoint "https://states.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "states", :region "ca-central-1"},
    :ssl-common-name "states.ca-central-1.amazonaws.com",
    :endpoint "https://states.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "states", :region "eu-central-1"},
    :ssl-common-name "states.eu-central-1.amazonaws.com",
    :endpoint "https://states.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "states", :region "eu-west-2"},
    :ssl-common-name "states.eu-west-2.amazonaws.com",
    :endpoint "https://states.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "states", :region "us-gov-west-1"},
    :ssl-common-name "states.us-gov-west-1.amazonaws.com",
    :endpoint "https://states.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "states", :region "us-west-2"},
    :ssl-common-name "states.us-west-2.amazonaws.com",
    :endpoint "https://states.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "states", :region "us-east-1"},
    :ssl-common-name "states.us-east-1.amazonaws.com",
    :endpoint "https://states.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "states", :region "us-west-1"},
    :ssl-common-name "states.us-west-1.amazonaws.com",
    :endpoint "https://states.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "states", :region "ap-south-1"},
    :ssl-common-name "states.ap-south-1.amazonaws.com",
    :endpoint "https://states.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-cause)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-data)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-definition)

(clojure.core/declare ser-execution-status)

(clojure.core/declare ser-task-token)

(clojure.core/declare ser-error)

(clojure.core/declare ser-name)

(clojure.core/declare ser-reverse-order)

(clojure.core/declare ser-page-token)

(clojure.core/defn- ser-cause [input] #:http.request.field{:value input, :shape "Cause"})

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-data [input] #:http.request.field{:value input, :shape "Data"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-definition [input] #:http.request.field{:value input, :shape "Definition"})

(clojure.core/defn- ser-execution-status [input] #:http.request.field{:value (clojure.core/get {:timed-out "TIMED_OUT", "TIMED_OUT" "TIMED_OUT", :aborted "ABORTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "FAILED" "FAILED", "ABORTED" "ABORTED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"} input), :shape "ExecutionStatus"})

(clojure.core/defn- ser-task-token [input] #:http.request.field{:value input, :shape "TaskToken"})

(clojure.core/defn- ser-error [input] #:http.request.field{:value input, :shape "Error"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-reverse-order [input] #:http.request.field{:value input, :shape "ReverseOrder"})

(clojure.core/defn- ser-page-token [input] #:http.request.field{:value input, :shape "PageToken"})

(clojure.core/defn- req-create-state-machine-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-definition (input :definition)) #:http.request.field{:name "definition", :shape "Definition"}) (clojure.core/into (ser-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "Arn"})]}))

(clojure.core/defn- req-send-task-failure-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]} (clojure.core/contains? input :error) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-error (input :error)) #:http.request.field{:name "error", :shape "Error"})) (clojure.core/contains? input :cause) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cause (input :cause)) #:http.request.field{:name "cause", :shape "Cause"}))))

(clojure.core/defn- req-list-activities-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PageToken"}))))

(clojure.core/defn- req-create-activity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})]}))

(clojure.core/defn- req-describe-activity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :activity-arn)) #:http.request.field{:name "activityArn", :shape "Arn"})]}))

(clojure.core/defn- req-start-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :input)) #:http.request.field{:name "input", :shape "Data"}))))

(clojure.core/defn- req-describe-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :execution-arn)) #:http.request.field{:name "executionArn", :shape "Arn"})]}))

(clojure.core/defn- req-describe-state-machine-for-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :execution-arn)) #:http.request.field{:name "executionArn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-activity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :activity-arn)) #:http.request.field{:name "activityArn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-state-machine-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]}))

(clojure.core/defn- req-get-execution-history-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :execution-arn)) #:http.request.field{:name "executionArn", :shape "Arn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "PageSize"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PageToken"}))))

(clojure.core/defn- req-stop-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :execution-arn)) #:http.request.field{:name "executionArn", :shape "Arn"})]} (clojure.core/contains? input :error) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-error (input :error)) #:http.request.field{:name "error", :shape "Error"})) (clojure.core/contains? input :cause) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cause (input :cause)) #:http.request.field{:name "cause", :shape "Cause"}))))

(clojure.core/defn- req-update-state-machine-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]} (clojure.core/contains? input :definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-definition (input :definition)) #:http.request.field{:name "definition", :shape "Definition"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "Arn"}))))

(clojure.core/defn- req-send-task-heartbeat-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]}))

(clojure.core/defn- req-describe-state-machine-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]}))

(clojure.core/defn- req-list-executions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]} (clojure.core/contains? input :status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-status (input :status-filter)) #:http.request.field{:name "statusFilter", :shape "ExecutionStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PageToken"}))))

(clojure.core/defn- req-send-task-success-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"}) (clojure.core/into (ser-data (input :output)) #:http.request.field{:name "output", :shape "Data"})]}))

(clojure.core/defn- req-get-activity-task-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :activity-arn)) #:http.request.field{:name "activityArn", :shape "Arn"})]} (clojure.core/contains? input :worker-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :worker-name)) #:http.request.field{:name "workerName", :shape "Name"}))))

(clojure.core/defn- req-list-state-machines-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PageToken"}))))

(clojure.spec.alpha/def :portkey.aws.states.execution-already-exists/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/execution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.execution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.states/timeout-in-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.states.lambda-function-start-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.lambda-function-start-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/lambda-function-start-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.lambda-function-start-failed-event-details/error :portkey.aws.states.lambda-function-start-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-output/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-output/status (clojure.spec.alpha/and :portkey.aws.states/state-machine-status))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-output/definition (clojure.spec.alpha/and :portkey.aws.states/definition))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-output/role-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-output/creation-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/describe-state-machine-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.describe-state-machine-output/state-machine-arn :portkey.aws.states.describe-state-machine-output/name :portkey.aws.states.describe-state-machine-output/definition :portkey.aws.states.describe-state-machine-output/role-arn :portkey.aws.states.describe-state-machine-output/creation-date] :opt-un [:portkey.aws.states.describe-state-machine-output/status]))

(clojure.spec.alpha/def :portkey.aws.states.activity-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/activity-succeeded-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.activity-succeeded-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states/cause (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.states.state-machine-already-exists/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/state-machine-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.state-machine-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.states.execution-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.execution-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/execution-timed-out-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.execution-timed-out-event-details/error :portkey.aws.states.execution-timed-out-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.execution-aborted-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.execution-aborted-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/execution-aborted-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.execution-aborted-event-details/error :portkey.aws.states.execution-aborted-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.activity-started-event-details/worker-name (clojure.spec.alpha/and :portkey.aws.states/identity))
(clojure.spec.alpha/def :portkey.aws.states/activity-started-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.activity-started-event-details/worker-name]))

(clojure.spec.alpha/def :portkey.aws.states/page-size (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.states.create-state-machine-input/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.create-state-machine-input/definition (clojure.spec.alpha/and :portkey.aws.states/definition))
(clojure.spec.alpha/def :portkey.aws.states.create-state-machine-input/role-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/create-state-machine-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.create-state-machine-input/name :portkey.aws.states.create-state-machine-input/definition :portkey.aws.states.create-state-machine-input/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.stop-execution-output/stop-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/stop-execution-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.stop-execution-output/stop-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.send-task-failure-input/task-token (clojure.spec.alpha/and :portkey.aws.states/task-token))
(clojure.spec.alpha/def :portkey.aws.states.send-task-failure-input/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.send-task-failure-input/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/send-task-failure-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.send-task-failure-input/task-token] :opt-un [:portkey.aws.states.send-task-failure-input/error :portkey.aws.states.send-task-failure-input/cause]))

(clojure.spec.alpha/def :portkey.aws.states.activity-scheduled-event-details/resource (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.activity-scheduled-event-details/input (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states.activity-scheduled-event-details/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.states/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states.activity-scheduled-event-details/heartbeat-in-seconds (clojure.spec.alpha/and :portkey.aws.states/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states/activity-scheduled-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.activity-scheduled-event-details/resource] :opt-un [:portkey.aws.states.activity-scheduled-event-details/input :portkey.aws.states.activity-scheduled-event-details/timeout-in-seconds :portkey.aws.states.activity-scheduled-event-details/heartbeat-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.states.list-state-machines-output/state-machines (clojure.spec.alpha/and :portkey.aws.states/state-machine-list))
(clojure.spec.alpha/def :portkey.aws.states.list-state-machines-output/next-token (clojure.spec.alpha/and :portkey.aws.states/page-token))
(clojure.spec.alpha/def :portkey.aws.states/list-state-machines-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.list-state-machines-output/state-machines] :opt-un [:portkey.aws.states.list-state-machines-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.list-activities-input/max-results (clojure.spec.alpha/and :portkey.aws.states/page-size))
(clojure.spec.alpha/def :portkey.aws.states.list-activities-input/next-token (clojure.spec.alpha/and :portkey.aws.states/page-token))
(clojure.spec.alpha/def :portkey.aws.states/list-activities-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.list-activities-input/max-results :portkey.aws.states.list-activities-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.invalid-arn/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/invalid-arn (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.invalid-arn/message]))

(clojure.spec.alpha/def :portkey.aws.states.state-entered-event-details/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.state-entered-event-details/input (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/state-entered-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.state-entered-event-details/name] :opt-un [:portkey.aws.states.state-entered-event-details/input]))

(clojure.spec.alpha/def :portkey.aws.states/history-event-list (clojure.spec.alpha/coll-of :portkey.aws.states/history-event))

(clojure.spec.alpha/def :portkey.aws.states.create-activity-input/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states/create-activity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.create-activity-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.execution-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/execution-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.execution-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.states/state-machine-status #{:deleting :active "DELETING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.states.start-execution-output/execution-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.start-execution-output/start-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/start-execution-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.start-execution-output/execution-arn :portkey.aws.states.start-execution-output/start-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.state-machine-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/state-machine-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.state-machine-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.states.list-executions-output/executions (clojure.spec.alpha/and :portkey.aws.states/execution-list))
(clojure.spec.alpha/def :portkey.aws.states.list-executions-output/next-token (clojure.spec.alpha/and :portkey.aws.states/page-token))
(clojure.spec.alpha/def :portkey.aws.states/list-executions-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.list-executions-output/executions] :opt-un [:portkey.aws.states.list-executions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.invalid-execution-input/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/invalid-execution-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.invalid-execution-input/message]))

(clojure.spec.alpha/def :portkey.aws.states.create-state-machine-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.create-state-machine-output/creation-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/create-state-machine-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.create-state-machine-output/state-machine-arn :portkey.aws.states.create-state-machine-output/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.states/delete-activity-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.describe-activity-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/describe-activity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.describe-activity-input/activity-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.execution-started-event-details/input (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states.execution-started-event-details/role-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/execution-started-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.execution-started-event-details/input :portkey.aws.states.execution-started-event-details/role-arn]))

(clojure.spec.alpha/def :portkey.aws.states.invalid-output/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/invalid-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.invalid-output/message]))

(clojure.spec.alpha/def :portkey.aws.states.activity-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.activity-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/activity-timed-out-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.activity-timed-out-event-details/error :portkey.aws.states.activity-timed-out-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states/activity-list (clojure.spec.alpha/coll-of :portkey.aws.states/activity-list-item))

(clojure.spec.alpha/def :portkey.aws.states.start-execution-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.start-execution-input/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.start-execution-input/input (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/start-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.start-execution-input/state-machine-arn] :opt-un [:portkey.aws.states.start-execution-input/name :portkey.aws.states.start-execution-input/input]))

(clojure.spec.alpha/def :portkey.aws.states.describe-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/describe-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.describe-execution-input/execution-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-for-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/describe-state-machine-for-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.describe-state-machine-for-execution-input/execution-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.delete-activity-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/delete-activity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.delete-activity-input/activity-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.create-activity-output/activity-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.create-activity-output/creation-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/create-activity-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.create-activity-output/activity-arn :portkey.aws.states.create-activity-output/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.describe-execution-output/execution-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.describe-execution-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.describe-execution-output/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.describe-execution-output/status (clojure.spec.alpha/and :portkey.aws.states/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.describe-execution-output/start-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.describe-execution-output/stop-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.describe-execution-output/input (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states.describe-execution-output/output (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/describe-execution-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.describe-execution-output/execution-arn :portkey.aws.states.describe-execution-output/state-machine-arn :portkey.aws.states.describe-execution-output/status :portkey.aws.states.describe-execution-output/start-date :portkey.aws.states.describe-execution-output/input] :opt-un [:portkey.aws.states.describe-execution-output/name :portkey.aws.states.describe-execution-output/stop-date :portkey.aws.states.describe-execution-output/output]))

(clojure.spec.alpha/def :portkey.aws.states.activity-schedule-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.activity-schedule-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/activity-schedule-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.activity-schedule-failed-event-details/error :portkey.aws.states.activity-schedule-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.state-machine-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/state-machine-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.state-machine-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.states.delete-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/delete-state-machine-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.delete-state-machine-input/state-machine-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.lambda-function-scheduled-event-details/resource (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.lambda-function-scheduled-event-details/input (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states.lambda-function-scheduled-event-details/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.states/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states/lambda-function-scheduled-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.lambda-function-scheduled-event-details/resource] :opt-un [:portkey.aws.states.lambda-function-scheduled-event-details/input :portkey.aws.states.lambda-function-scheduled-event-details/timeout-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.states.state-exited-event-details/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.state-exited-event-details/output (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/state-exited-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.state-exited-event-details/name] :opt-un [:portkey.aws.states.state-exited-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states.execution-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.execution-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/execution-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.execution-failed-event-details/error :portkey.aws.states.execution-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.update-state-machine-output/update-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/update-state-machine-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.update-state-machine-output/update-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states/data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.states.activity-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.activity-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/activity-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.activity-failed-event-details/error :portkey.aws.states.activity-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states/identity (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.activity-worker-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/activity-worker-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.activity-worker-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.states.activity-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/activity-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.activity-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.states/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states/send-task-success-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states/definition (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1048576))))

(clojure.spec.alpha/def :portkey.aws.states.get-execution-history-output/events (clojure.spec.alpha/and :portkey.aws.states/history-event-list))
(clojure.spec.alpha/def :portkey.aws.states.get-execution-history-output/next-token (clojure.spec.alpha/and :portkey.aws.states/page-token))
(clojure.spec.alpha/def :portkey.aws.states/get-execution-history-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.get-execution-history-output/events] :opt-un [:portkey.aws.states.get-execution-history-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.lambda-function-schedule-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.lambda-function-schedule-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/lambda-function-schedule-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.lambda-function-schedule-failed-event-details/error :portkey.aws.states.lambda-function-schedule-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.get-execution-history-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.get-execution-history-input/max-results (clojure.spec.alpha/and :portkey.aws.states/page-size))
(clojure.spec.alpha/def :portkey.aws.states.get-execution-history-input/reverse-order (clojure.spec.alpha/and :portkey.aws.states/reverse-order))
(clojure.spec.alpha/def :portkey.aws.states.get-execution-history-input/next-token (clojure.spec.alpha/and :portkey.aws.states/page-token))
(clojure.spec.alpha/def :portkey.aws.states/get-execution-history-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.get-execution-history-input/execution-arn] :opt-un [:portkey.aws.states.get-execution-history-input/max-results :portkey.aws.states.get-execution-history-input/reverse-order :portkey.aws.states.get-execution-history-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.stop-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.stop-execution-input/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.stop-execution-input/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/stop-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.stop-execution-input/execution-arn] :opt-un [:portkey.aws.states.stop-execution-input/error :portkey.aws.states.stop-execution-input/cause]))

(clojure.spec.alpha/def :portkey.aws.states.invalid-name/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/invalid-name (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.invalid-name/message]))

(clojure.spec.alpha/def :portkey.aws.states/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.states.list-activities-output/activities (clojure.spec.alpha/and :portkey.aws.states/activity-list))
(clojure.spec.alpha/def :portkey.aws.states.list-activities-output/next-token (clojure.spec.alpha/and :portkey.aws.states/page-token))
(clojure.spec.alpha/def :portkey.aws.states/list-activities-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.list-activities-output/activities] :opt-un [:portkey.aws.states.list-activities-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.states/execution-status #{:timed-out "TIMED_OUT" :aborted :running "SUCCEEDED" "FAILED" "ABORTED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.states.update-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.update-state-machine-input/definition (clojure.spec.alpha/and :portkey.aws.states/definition))
(clojure.spec.alpha/def :portkey.aws.states.update-state-machine-input/role-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/update-state-machine-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.update-state-machine-input/state-machine-arn] :opt-un [:portkey.aws.states.update-state-machine-input/definition :portkey.aws.states.update-state-machine-input/role-arn]))

(clojure.spec.alpha/def :portkey.aws.states.invalid-definition/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/invalid-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.invalid-definition/message]))

(clojure.spec.alpha/def :portkey.aws.states.missing-required-parameter/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/missing-required-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.missing-required-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.states.activity-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/activity-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.activity-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.states/send-task-heartbeat-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states/task-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.states/error (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.state-machine-list-item/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.state-machine-list-item/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.state-machine-list-item/creation-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/state-machine-list-item (clojure.spec.alpha/keys :req-un [:portkey.aws.states.state-machine-list-item/state-machine-arn :portkey.aws.states.state-machine-list-item/name :portkey.aws.states.state-machine-list-item/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states/send-task-failure-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states/event-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.states/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.states.history-event/activity-started-event-details (clojure.spec.alpha/and :portkey.aws.states/activity-started-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/execution-aborted-event-details (clojure.spec.alpha/and :portkey.aws.states/execution-aborted-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/lambda-function-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states/lambda-function-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/lambda-function-failed-event-details (clojure.spec.alpha/and :portkey.aws.states/lambda-function-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/execution-started-event-details (clojure.spec.alpha/and :portkey.aws.states/execution-started-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/lambda-function-scheduled-event-details (clojure.spec.alpha/and :portkey.aws.states/lambda-function-scheduled-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/activity-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states/activity-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/lambda-function-schedule-failed-event-details (clojure.spec.alpha/and :portkey.aws.states/lambda-function-schedule-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/id (clojure.spec.alpha/and :portkey.aws.states/event-id))
(clojure.spec.alpha/def :portkey.aws.states.history-event/timestamp (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.history-event/execution-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states/execution-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/previous-event-id (clojure.spec.alpha/and :portkey.aws.states/event-id))
(clojure.spec.alpha/def :portkey.aws.states.history-event/execution-failed-event-details (clojure.spec.alpha/and :portkey.aws.states/execution-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/state-exited-event-details (clojure.spec.alpha/and :portkey.aws.states/state-exited-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/activity-schedule-failed-event-details (clojure.spec.alpha/and :portkey.aws.states/activity-schedule-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/execution-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states/execution-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/activity-failed-event-details (clojure.spec.alpha/and :portkey.aws.states/activity-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/lambda-function-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states/lambda-function-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/activity-scheduled-event-details (clojure.spec.alpha/and :portkey.aws.states/activity-scheduled-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/state-entered-event-details (clojure.spec.alpha/and :portkey.aws.states/state-entered-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/type (clojure.spec.alpha/and :portkey.aws.states/history-event-type))
(clojure.spec.alpha/def :portkey.aws.states.history-event/lambda-function-start-failed-event-details (clojure.spec.alpha/and :portkey.aws.states/lambda-function-start-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.history-event/activity-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states/activity-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states/history-event (clojure.spec.alpha/keys :req-un [:portkey.aws.states.history-event/timestamp :portkey.aws.states.history-event/type :portkey.aws.states.history-event/id] :opt-un [:portkey.aws.states.history-event/activity-started-event-details :portkey.aws.states.history-event/execution-aborted-event-details :portkey.aws.states.history-event/lambda-function-timed-out-event-details :portkey.aws.states.history-event/lambda-function-failed-event-details :portkey.aws.states.history-event/execution-started-event-details :portkey.aws.states.history-event/lambda-function-scheduled-event-details :portkey.aws.states.history-event/activity-succeeded-event-details :portkey.aws.states.history-event/lambda-function-schedule-failed-event-details :portkey.aws.states.history-event/execution-timed-out-event-details :portkey.aws.states.history-event/previous-event-id :portkey.aws.states.history-event/execution-failed-event-details :portkey.aws.states.history-event/state-exited-event-details :portkey.aws.states.history-event/activity-schedule-failed-event-details :portkey.aws.states.history-event/execution-succeeded-event-details :portkey.aws.states.history-event/activity-failed-event-details :portkey.aws.states.history-event/lambda-function-succeeded-event-details :portkey.aws.states.history-event/activity-scheduled-event-details :portkey.aws.states.history-event/state-entered-event-details :portkey.aws.states.history-event/lambda-function-start-failed-event-details :portkey.aws.states.history-event/activity-timed-out-event-details]))

(clojure.spec.alpha/def :portkey.aws.states.execution-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/execution-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.execution-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.states.invalid-token/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/invalid-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.invalid-token/message]))

(clojure.spec.alpha/def :portkey.aws.states/execution-list (clojure.spec.alpha/coll-of :portkey.aws.states/execution-list-item))

(clojure.spec.alpha/def :portkey.aws.states/delete-state-machine-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.describe-activity-output/activity-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.describe-activity-output/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.describe-activity-output/creation-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/describe-activity-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.describe-activity-output/activity-arn :portkey.aws.states.describe-activity-output/name :portkey.aws.states.describe-activity-output/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states/reverse-order clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.states.send-task-heartbeat-input/task-token (clojure.spec.alpha/and :portkey.aws.states/task-token))
(clojure.spec.alpha/def :portkey.aws.states/send-task-heartbeat-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.send-task-heartbeat-input/task-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states/describe-state-machine-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.describe-state-machine-input/state-machine-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.activity-list-item/activity-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.activity-list-item/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.activity-list-item/creation-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/activity-list-item (clojure.spec.alpha/keys :req-un [:portkey.aws.states.activity-list-item/activity-arn :portkey.aws.states.activity-list-item/name :portkey.aws.states.activity-list-item/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.lambda-function-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/lambda-function-succeeded-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.lambda-function-succeeded-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states/history-event-type #{"LambdaFunctionStartFailed" :lambda-function-timed-out :execution-succeeded :wait-state-entered "LambdaFunctionSucceeded" "ActivityTimedOut" "WaitStateAborted" :wait-state-aborted "SucceedStateEntered" :activity-started "ActivityScheduled" "ParallelStateAborted" :pass-state-exited :execution-timed-out "ParallelStateSucceeded" :fail-state-entered :execution-failed :activity-timed-out :choice-state-entered :parallel-state-exited "ExecutionTimedOut" "ChoiceStateExited" :task-state-exited :succeed-state-exited :activity-scheduled "ExecutionFailed" :lambda-function-schedule-failed "ActivityFailed" :parallel-state-started :execution-started "ChoiceStateEntered" "LambdaFunctionScheduled" :lambda-function-start-failed :parallel-state-aborted :parallel-state-succeeded :pass-state-entered "FailStateEntered" "WaitStateExited" :lambda-function-failed "ActivityScheduleFailed" :wait-state-exited "SucceedStateExited" :parallel-state-entered "TaskStateEntered" "PassStateExited" "LambdaFunctionFailed" "PassStateEntered" :activity-succeeded :parallel-state-failed :activity-schedule-failed "LambdaFunctionTimedOut" "ParallelStateFailed" "ActivitySucceeded" :execution-aborted "LambdaFunctionStarted" :lambda-function-succeeded "ExecutionSucceeded" :lambda-function-started "ActivityStarted" :choice-state-exited :task-state-aborted "WaitStateEntered" "ParallelStateEntered" "ExecutionStarted" "ExecutionAborted" :activity-failed "ParallelStateStarted" "LambdaFunctionScheduleFailed" "ParallelStateExited" "TaskStateAborted" :lambda-function-scheduled :task-state-entered :succeed-state-entered "TaskStateExited"})

(clojure.spec.alpha/def :portkey.aws.states.list-executions-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.list-executions-input/status-filter (clojure.spec.alpha/and :portkey.aws.states/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.list-executions-input/max-results (clojure.spec.alpha/and :portkey.aws.states/page-size))
(clojure.spec.alpha/def :portkey.aws.states.list-executions-input/next-token (clojure.spec.alpha/and :portkey.aws.states/page-token))
(clojure.spec.alpha/def :portkey.aws.states/list-executions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.list-executions-input/state-machine-arn] :opt-un [:portkey.aws.states.list-executions-input/status-filter :portkey.aws.states.list-executions-input/max-results :portkey.aws.states.list-executions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.get-activity-task-output/task-token (clojure.spec.alpha/and :portkey.aws.states/task-token))
(clojure.spec.alpha/def :portkey.aws.states.get-activity-task-output/input (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/get-activity-task-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.get-activity-task-output/task-token :portkey.aws.states.get-activity-task-output/input]))

(clojure.spec.alpha/def :portkey.aws.states/page-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.states.task-timed-out/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/task-timed-out (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.task-timed-out/message]))

(clojure.spec.alpha/def :portkey.aws.states.lambda-function-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.lambda-function-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/lambda-function-timed-out-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.lambda-function-timed-out-event-details/error :portkey.aws.states.lambda-function-timed-out-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.execution-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/execution-succeeded-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.execution-succeeded-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states.task-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/task-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.task-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.states.send-task-success-input/task-token (clojure.spec.alpha/and :portkey.aws.states/task-token))
(clojure.spec.alpha/def :portkey.aws.states.send-task-success-input/output (clojure.spec.alpha/and :portkey.aws.states/data))
(clojure.spec.alpha/def :portkey.aws.states/send-task-success-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.send-task-success-input/task-token :portkey.aws.states.send-task-success-input/output] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.get-activity-task-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.get-activity-task-input/worker-name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states/get-activity-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.get-activity-task-input/activity-arn] :opt-un [:portkey.aws.states.get-activity-task-input/worker-name]))

(clojure.spec.alpha/def :portkey.aws.states.lambda-function-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states/error))
(clojure.spec.alpha/def :portkey.aws.states.lambda-function-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states/cause))
(clojure.spec.alpha/def :portkey.aws.states/lambda-function-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.lambda-function-failed-event-details/error :portkey.aws.states.lambda-function-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states/state-machine-list (clojure.spec.alpha/coll-of :portkey.aws.states/state-machine-list-item))

(clojure.spec.alpha/def :portkey.aws.states.state-machine-deleting/message (clojure.spec.alpha/and :portkey.aws.states/error-message))
(clojure.spec.alpha/def :portkey.aws.states/state-machine-deleting (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.state-machine-deleting/message]))

(clojure.spec.alpha/def :portkey.aws.states.execution-list-item/execution-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.execution-list-item/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.execution-list-item/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.execution-list-item/status (clojure.spec.alpha/and :portkey.aws.states/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.execution-list-item/start-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.execution-list-item/stop-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/execution-list-item (clojure.spec.alpha/keys :req-un [:portkey.aws.states.execution-list-item/execution-arn :portkey.aws.states.execution-list-item/state-machine-arn :portkey.aws.states.execution-list-item/name :portkey.aws.states.execution-list-item/status :portkey.aws.states.execution-list-item/start-date] :opt-un [:portkey.aws.states.execution-list-item/stop-date]))

(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-for-execution-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-for-execution-output/name (clojure.spec.alpha/and :portkey.aws.states/name))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-for-execution-output/definition (clojure.spec.alpha/and :portkey.aws.states/definition))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-for-execution-output/role-arn (clojure.spec.alpha/and :portkey.aws.states/arn))
(clojure.spec.alpha/def :portkey.aws.states.describe-state-machine-for-execution-output/update-date (clojure.spec.alpha/and :portkey.aws.states/timestamp))
(clojure.spec.alpha/def :portkey.aws.states/describe-state-machine-for-execution-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.describe-state-machine-for-execution-output/state-machine-arn :portkey.aws.states.describe-state-machine-for-execution-output/name :portkey.aws.states.describe-state-machine-for-execution-output/definition :portkey.aws.states.describe-state-machine-for-execution-output/role-arn :portkey.aws.states.describe-state-machine-for-execution-output/update-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.list-state-machines-input/max-results (clojure.spec.alpha/and :portkey.aws.states/page-size))
(clojure.spec.alpha/def :portkey.aws.states.list-state-machines-input/next-token (clojure.spec.alpha/and :portkey.aws.states/page-token))
(clojure.spec.alpha/def :portkey.aws.states/list-state-machines-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.list-state-machines-input/max-results :portkey.aws.states.list-state-machines-input/next-token]))

(clojure.core/defn stop-execution ([stop-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-execution-input stop-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/stop-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/stop-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopExecution", :http.request.spec/error-spec {"ExecutionDoesNotExist" :portkey.aws.states/execution-does-not-exist, "InvalidArn" :portkey.aws.states/invalid-arn}})))))
(clojure.spec.alpha/fdef stop-execution :args (clojure.spec.alpha/tuple :portkey.aws.states/stop-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states/stop-execution-output))

(clojure.core/defn update-state-machine ([update-state-machine-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-state-machine-input update-state-machine-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/update-state-machine-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/update-state-machine-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStateMachine", :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states/invalid-arn, "InvalidDefinition" :portkey.aws.states/invalid-definition, "MissingRequiredParameter" :portkey.aws.states/missing-required-parameter, "StateMachineDeleting" :portkey.aws.states/state-machine-deleting, "StateMachineDoesNotExist" :portkey.aws.states/state-machine-does-not-exist}})))))
(clojure.spec.alpha/fdef update-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states/update-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states/update-state-machine-output))

(clojure.core/defn get-activity-task ([get-activity-task-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-activity-task-input get-activity-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/get-activity-task-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/get-activity-task-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetActivityTask", :http.request.spec/error-spec {"ActivityDoesNotExist" :portkey.aws.states/activity-does-not-exist, "ActivityWorkerLimitExceeded" :portkey.aws.states/activity-worker-limit-exceeded, "InvalidArn" :portkey.aws.states/invalid-arn}})))))
(clojure.spec.alpha/fdef get-activity-task :args (clojure.spec.alpha/tuple :portkey.aws.states/get-activity-task-input) :ret (clojure.spec.alpha/and :portkey.aws.states/get-activity-task-output))

(clojure.core/defn list-executions ([list-executions-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-executions-input list-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/list-executions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/list-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListExecutions", :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states/invalid-arn, "InvalidToken" :portkey.aws.states/invalid-token, "StateMachineDoesNotExist" :portkey.aws.states/state-machine-does-not-exist}})))))
(clojure.spec.alpha/fdef list-executions :args (clojure.spec.alpha/tuple :portkey.aws.states/list-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.states/list-executions-output))

(clojure.core/defn describe-execution ([describe-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-execution-input describe-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/describe-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/describe-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeExecution", :http.request.spec/error-spec {"ExecutionDoesNotExist" :portkey.aws.states/execution-does-not-exist, "InvalidArn" :portkey.aws.states/invalid-arn}})))))
(clojure.spec.alpha/fdef describe-execution :args (clojure.spec.alpha/tuple :portkey.aws.states/describe-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states/describe-execution-output))

(clojure.core/defn start-execution ([start-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-execution-input start-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/start-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/start-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartExecution", :http.request.spec/error-spec {"ExecutionLimitExceeded" :portkey.aws.states/execution-limit-exceeded, "ExecutionAlreadyExists" :portkey.aws.states/execution-already-exists, "InvalidArn" :portkey.aws.states/invalid-arn, "InvalidExecutionInput" :portkey.aws.states/invalid-execution-input, "InvalidName" :portkey.aws.states/invalid-name, "StateMachineDoesNotExist" :portkey.aws.states/state-machine-does-not-exist, "StateMachineDeleting" :portkey.aws.states/state-machine-deleting}})))))
(clojure.spec.alpha/fdef start-execution :args (clojure.spec.alpha/tuple :portkey.aws.states/start-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states/start-execution-output))

(clojure.core/defn delete-activity ([delete-activity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-activity-input delete-activity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/delete-activity-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/delete-activity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteActivity", :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states/invalid-arn}})))))
(clojure.spec.alpha/fdef delete-activity :args (clojure.spec.alpha/tuple :portkey.aws.states/delete-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states/delete-activity-output))

(clojure.core/defn describe-state-machine-for-execution ([describe-state-machine-for-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-state-machine-for-execution-input describe-state-machine-for-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/describe-state-machine-for-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/describe-state-machine-for-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStateMachineForExecution", :http.request.spec/error-spec {"ExecutionDoesNotExist" :portkey.aws.states/execution-does-not-exist, "InvalidArn" :portkey.aws.states/invalid-arn}})))))
(clojure.spec.alpha/fdef describe-state-machine-for-execution :args (clojure.spec.alpha/tuple :portkey.aws.states/describe-state-machine-for-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states/describe-state-machine-for-execution-output))

(clojure.core/defn describe-activity ([describe-activity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-activity-input describe-activity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/describe-activity-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/describe-activity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeActivity", :http.request.spec/error-spec {"ActivityDoesNotExist" :portkey.aws.states/activity-does-not-exist, "InvalidArn" :portkey.aws.states/invalid-arn}})))))
(clojure.spec.alpha/fdef describe-activity :args (clojure.spec.alpha/tuple :portkey.aws.states/describe-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states/describe-activity-output))

(clojure.core/defn describe-state-machine ([describe-state-machine-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-state-machine-input describe-state-machine-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/describe-state-machine-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/describe-state-machine-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStateMachine", :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states/invalid-arn, "StateMachineDoesNotExist" :portkey.aws.states/state-machine-does-not-exist}})))))
(clojure.spec.alpha/fdef describe-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states/describe-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states/describe-state-machine-output))

(clojure.core/defn send-task-heartbeat ([send-task-heartbeat-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-send-task-heartbeat-input send-task-heartbeat-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/send-task-heartbeat-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/send-task-heartbeat-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendTaskHeartbeat", :http.request.spec/error-spec {"TaskDoesNotExist" :portkey.aws.states/task-does-not-exist, "InvalidToken" :portkey.aws.states/invalid-token, "TaskTimedOut" :portkey.aws.states/task-timed-out}})))))
(clojure.spec.alpha/fdef send-task-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.states/send-task-heartbeat-input) :ret (clojure.spec.alpha/and :portkey.aws.states/send-task-heartbeat-output))

(clojure.core/defn send-task-failure ([send-task-failure-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-send-task-failure-input send-task-failure-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/send-task-failure-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/send-task-failure-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendTaskFailure", :http.request.spec/error-spec {"TaskDoesNotExist" :portkey.aws.states/task-does-not-exist, "InvalidToken" :portkey.aws.states/invalid-token, "TaskTimedOut" :portkey.aws.states/task-timed-out}})))))
(clojure.spec.alpha/fdef send-task-failure :args (clojure.spec.alpha/tuple :portkey.aws.states/send-task-failure-input) :ret (clojure.spec.alpha/and :portkey.aws.states/send-task-failure-output))

(clojure.core/defn create-state-machine ([create-state-machine-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-state-machine-input create-state-machine-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/create-state-machine-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/create-state-machine-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStateMachine", :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states/invalid-arn, "InvalidDefinition" :portkey.aws.states/invalid-definition, "InvalidName" :portkey.aws.states/invalid-name, "StateMachineAlreadyExists" :portkey.aws.states/state-machine-already-exists, "StateMachineDeleting" :portkey.aws.states/state-machine-deleting, "StateMachineLimitExceeded" :portkey.aws.states/state-machine-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states/create-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states/create-state-machine-output))

(clojure.core/defn send-task-success ([send-task-success-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-send-task-success-input send-task-success-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/send-task-success-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/send-task-success-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendTaskSuccess", :http.request.spec/error-spec {"TaskDoesNotExist" :portkey.aws.states/task-does-not-exist, "InvalidOutput" :portkey.aws.states/invalid-output, "InvalidToken" :portkey.aws.states/invalid-token, "TaskTimedOut" :portkey.aws.states/task-timed-out}})))))
(clojure.spec.alpha/fdef send-task-success :args (clojure.spec.alpha/tuple :portkey.aws.states/send-task-success-input) :ret (clojure.spec.alpha/and :portkey.aws.states/send-task-success-output))

(clojure.core/defn create-activity ([create-activity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-activity-input create-activity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/create-activity-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/create-activity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateActivity", :http.request.spec/error-spec {"ActivityLimitExceeded" :portkey.aws.states/activity-limit-exceeded, "InvalidName" :portkey.aws.states/invalid-name}})))))
(clojure.spec.alpha/fdef create-activity :args (clojure.spec.alpha/tuple :portkey.aws.states/create-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states/create-activity-output))

(clojure.core/defn get-execution-history ([get-execution-history-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-execution-history-input get-execution-history-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/get-execution-history-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/get-execution-history-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetExecutionHistory", :http.request.spec/error-spec {"ExecutionDoesNotExist" :portkey.aws.states/execution-does-not-exist, "InvalidArn" :portkey.aws.states/invalid-arn, "InvalidToken" :portkey.aws.states/invalid-token}})))))
(clojure.spec.alpha/fdef get-execution-history :args (clojure.spec.alpha/tuple :portkey.aws.states/get-execution-history-input) :ret (clojure.spec.alpha/and :portkey.aws.states/get-execution-history-output))

(clojure.core/defn list-state-machines ([] (list-state-machines {})) ([list-state-machines-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-state-machines-input list-state-machines-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/list-state-machines-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/list-state-machines-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStateMachines", :http.request.spec/error-spec {"InvalidToken" :portkey.aws.states/invalid-token}})))))
(clojure.spec.alpha/fdef list-state-machines :args (clojure.spec.alpha/? :portkey.aws.states/list-state-machines-input) :ret (clojure.spec.alpha/and :portkey.aws.states/list-state-machines-output))

(clojure.core/defn list-activities ([] (list-activities {})) ([list-activities-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-activities-input list-activities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/list-activities-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/list-activities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListActivities", :http.request.spec/error-spec {"InvalidToken" :portkey.aws.states/invalid-token}})))))
(clojure.spec.alpha/fdef list-activities :args (clojure.spec.alpha/? :portkey.aws.states/list-activities-input) :ret (clojure.spec.alpha/and :portkey.aws.states/list-activities-output))

(clojure.core/defn delete-state-machine ([delete-state-machine-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-state-machine-input delete-state-machine-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.states/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states/delete-state-machine-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states/delete-state-machine-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStateMachine", :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states/invalid-arn}})))))
(clojure.spec.alpha/fdef delete-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states/delete-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states/delete-state-machine-output))
