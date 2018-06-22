(ns portkey.aws.states.-2016-11-23 (:require [portkey.aws]))

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
   "us-west-2"
   {:credential-scope {:service "states", :region "us-west-2"},
    :ssl-common-name "states.us-west-2.amazonaws.com",
    :endpoint "https://states.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "states", :region "us-east-1"},
    :ssl-common-name "states.us-east-1.amazonaws.com",
    :endpoint "https://states.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-already-exists/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-already-exists (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-already-exists/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/timeout-in-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-start-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-start-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-start-failed-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-start-failed-event-details/error :portkey.aws.states.-2016-11-23.lambda-function-start-failed-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/status (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/state-machine-status))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/definition (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/definition))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-state-machine-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.describe-state-machine-output/stateMachineArn :portkey.aws.states.-2016-11-23.describe-state-machine-output/name :portkey.aws.states.-2016-11-23.describe-state-machine-output/definition :portkey.aws.states.-2016-11-23.describe-state-machine-output/roleArn :portkey.aws.states.-2016-11-23.describe-state-machine-output/creationDate] :opt-un [:portkey.aws.states.-2016-11-23.describe-state-machine-output/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-succeeded-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-succeeded-event-details/output] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/cause (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-already-exists/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-already-exists (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.state-machine-already-exists/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-timed-out-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-timed-out-event-details/error :portkey.aws.states.-2016-11-23.execution-timed-out-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-aborted-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-aborted-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-aborted-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-aborted-event-details/error :portkey.aws.states.-2016-11-23.execution-aborted-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-started-event-details/worker-name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/identity))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-started-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-started-event-details/workerName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/page-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 0 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 1000))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-input/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-input/definition (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/definition))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-input/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/create-state-machine-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.create-state-machine-input/name :portkey.aws.states.-2016-11-23.create-state-machine-input/definition :portkey.aws.states.-2016-11-23.create-state-machine-input/roleArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.stop-execution-output/stop-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/stop-execution-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.stop-execution-output/stopDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-failure-input/task-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-failure-input/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-failure-input/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-failure-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.send-task-failure-input/taskToken] :opt-un [:portkey.aws.states.-2016-11-23.send-task-failure-input/error :portkey.aws.states.-2016-11-23.send-task-failure-input/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/heartbeat-in-seconds (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-scheduled-event-details (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.activity-scheduled-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.activity-scheduled-event-details/input :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/timeoutInSeconds :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/heartbeatInSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-state-machines-output/state-machines (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/state-machine-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-state-machines-output/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-state-machines-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.list-state-machines-output/stateMachines] :opt-un [:portkey.aws.states.-2016-11-23.list-state-machines-output/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-activities-input/max-results (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-size))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-activities-input/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-activities-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.list-activities-input/maxResults :portkey.aws.states.-2016-11-23.list-activities-input/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-arn/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-arn (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-arn/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-entered-event-details/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-entered-event-details/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-entered-event-details (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.state-entered-event-details/name] :opt-un [:portkey.aws.states.-2016-11-23.state-entered-event-details/input] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/history-event-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/history-event) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-activity-input/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/create-activity-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.create-activity-input/name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-limit-exceeded (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-limit-exceeded/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-output/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-output/start-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/start-execution-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.start-execution-output/executionArn :portkey.aws.states.-2016-11-23.start-execution-output/startDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-limit-exceeded (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.state-machine-limit-exceeded/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-output/executions (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-output/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-executions-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.list-executions-output/executions] :opt-un [:portkey.aws.states.-2016-11-23.list-executions-output/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-execution-input/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-execution-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-execution-input/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-output/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/create-state-machine-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.create-state-machine-output/stateMachineArn :portkey.aws.states.-2016-11-23.create-state-machine-output/creationDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/delete-activity-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-activity-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-activity-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.describe-activity-input/activityArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-started-event-details/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-started-event-details/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-started-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-started-event-details/input :portkey.aws.states.-2016-11-23.execution-started-event-details/roleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-output/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-output/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-timed-out-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-timed-out-event-details/error :portkey.aws.states.-2016-11-23.activity-timed-out-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/activity-list-item) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-input/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-input/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/start-execution-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.start-execution-input/stateMachineArn] :opt-un [:portkey.aws.states.-2016-11-23.start-execution-input/name :portkey.aws.states.-2016-11-23.start-execution-input/input] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-execution-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.describe-execution-input/executionArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-input/executionArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.delete-activity-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/delete-activity-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.delete-activity-input/activityArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-activity-output/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-activity-output/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/create-activity-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.create-activity-output/activityArn :portkey.aws.states.-2016-11-23.create-activity-output/creationDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/status (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/start-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/stop-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-execution-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.describe-execution-output/executionArn :portkey.aws.states.-2016-11-23.describe-execution-output/stateMachineArn :portkey.aws.states.-2016-11-23.describe-execution-output/status :portkey.aws.states.-2016-11-23.describe-execution-output/startDate :portkey.aws.states.-2016-11-23.describe-execution-output/input] :opt-un [:portkey.aws.states.-2016-11-23.describe-execution-output/name :portkey.aws.states.-2016-11-23.describe-execution-output/stopDate :portkey.aws.states.-2016-11-23.describe-execution-output/output] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-schedule-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-schedule-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-schedule-failed-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-schedule-failed-event-details/error :portkey.aws.states.-2016-11-23.activity-schedule-failed-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-does-not-exist (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.state-machine-does-not-exist/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.delete-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/delete-state-machine-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.delete-state-machine-input/stateMachineArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-scheduled-event-details (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/input :portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/timeoutInSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-exited-event-details/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-exited-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-exited-event-details (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.state-exited-event-details/name] :opt-un [:portkey.aws.states.-2016-11-23.state-exited-event-details/output] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-failed-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-failed-event-details/error :portkey.aws.states.-2016-11-23.execution-failed-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.update-state-machine-output/update-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/update-state-machine-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.update-state-machine-output/updateDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-failed-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-failed-event-details/error :portkey.aws.states.-2016-11-23.activity-failed-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/identity (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-worker-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-worker-limit-exceeded (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-worker-limit-exceeded/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-does-not-exist (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-does-not-exist/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-success-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/definition (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1048576))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-output/events (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/history-event-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-output/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/get-execution-history-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.get-execution-history-output/events] :opt-un [:portkey.aws.states.-2016-11-23.get-execution-history-output/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-schedule-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-schedule-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-schedule-failed-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-schedule-failed-event-details/error :portkey.aws.states.-2016-11-23.lambda-function-schedule-failed-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-input/max-results (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-size))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-input/reverse-order (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/reverse-order))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-input/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/get-execution-history-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.get-execution-history-input/executionArn] :opt-un [:portkey.aws.states.-2016-11-23.get-execution-history-input/maxResults :portkey.aws.states.-2016-11-23.get-execution-history-input/reverseOrder :portkey.aws.states.-2016-11-23.get-execution-history-input/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.stop-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.stop-execution-input/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.stop-execution-input/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/stop-execution-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.stop-execution-input/executionArn] :opt-un [:portkey.aws.states.-2016-11-23.stop-execution-input/error :portkey.aws.states.-2016-11-23.stop-execution-input/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-name/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-name (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-name/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-activities-output/activities (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-activities-output/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-activities-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.list-activities-output/activities] :opt-un [:portkey.aws.states.-2016-11-23.list-activities-output/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:timed-out "TIMED_OUT", "TIMED_OUT" "TIMED_OUT", :aborted "ABORTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "FAILED" "FAILED", "ABORTED" "ABORTED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.update-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.update-state-machine-input/definition (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/definition))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.update-state-machine-input/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/update-state-machine-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.update-state-machine-input/stateMachineArn] :opt-un [:portkey.aws.states.-2016-11-23.update-state-machine-input/definition :portkey.aws.states.-2016-11-23.update-state-machine-input/roleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-definition/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-definition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-definition/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.missing-required-parameter/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/missing-required-parameter (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.missing-required-parameter/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-limit-exceeded (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-limit-exceeded/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-heartbeat-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/error (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-list-item/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-list-item/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-list-item/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-list-item (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.state-machine-list-item/stateMachineArn :portkey.aws.states.-2016-11-23.state-machine-list-item/name :portkey.aws.states.-2016-11-23.state-machine-list-item/creationDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-failure-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/event-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-started-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-started-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-aborted-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-aborted-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-started-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-started-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-scheduled-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-scheduled-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-schedule-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-schedule-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/id (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/event-id))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/timestamp (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/previous-event-id (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/event-id))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/state-exited-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/state-exited-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-schedule-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-schedule-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-scheduled-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-scheduled-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/state-entered-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/state-entered-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/history-event-type))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-start-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-start-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/history-event (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.history-event/timestamp :portkey.aws.states.-2016-11-23.history-event/type :portkey.aws.states.-2016-11-23.history-event/id] :opt-un [:portkey.aws.states.-2016-11-23.history-event/activityStartedEventDetails :portkey.aws.states.-2016-11-23.history-event/executionAbortedEventDetails :portkey.aws.states.-2016-11-23.history-event/lambdaFunctionTimedOutEventDetails :portkey.aws.states.-2016-11-23.history-event/lambdaFunctionFailedEventDetails :portkey.aws.states.-2016-11-23.history-event/executionStartedEventDetails :portkey.aws.states.-2016-11-23.history-event/lambdaFunctionScheduledEventDetails :portkey.aws.states.-2016-11-23.history-event/activitySucceededEventDetails :portkey.aws.states.-2016-11-23.history-event/lambdaFunctionScheduleFailedEventDetails :portkey.aws.states.-2016-11-23.history-event/executionTimedOutEventDetails :portkey.aws.states.-2016-11-23.history-event/previousEventId :portkey.aws.states.-2016-11-23.history-event/executionFailedEventDetails :portkey.aws.states.-2016-11-23.history-event/stateExitedEventDetails :portkey.aws.states.-2016-11-23.history-event/activityScheduleFailedEventDetails :portkey.aws.states.-2016-11-23.history-event/executionSucceededEventDetails :portkey.aws.states.-2016-11-23.history-event/activityFailedEventDetails :portkey.aws.states.-2016-11-23.history-event/lambdaFunctionSucceededEventDetails :portkey.aws.states.-2016-11-23.history-event/activityScheduledEventDetails :portkey.aws.states.-2016-11-23.history-event/stateEnteredEventDetails :portkey.aws.states.-2016-11-23.history-event/lambdaFunctionStartFailedEventDetails :portkey.aws.states.-2016-11-23.history-event/activityTimedOutEventDetails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-does-not-exist (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-does-not-exist/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-token/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-token (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-token/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/execution-list-item) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/delete-state-machine-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-activity-output/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-activity-output/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-activity-output/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-activity-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.describe-activity-output/activityArn :portkey.aws.states.-2016-11-23.describe-activity-output/name :portkey.aws.states.-2016-11-23.describe-activity-output/creationDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/reverse-order clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-heartbeat-input/task-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-heartbeat-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.send-task-heartbeat-input/taskToken] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-state-machine-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.describe-state-machine-input/stateMachineArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-list-item/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-list-item/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-list-item/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-list-item (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.activity-list-item/activityArn :portkey.aws.states.-2016-11-23.activity-list-item/name :portkey.aws.states.-2016-11-23.activity-list-item/creationDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-succeeded-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-succeeded-event-details/output] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/history-event-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"LambdaFunctionStartFailed" "LambdaFunctionStartFailed", :lambda-function-timed-out "LambdaFunctionTimedOut", :execution-succeeded "ExecutionSucceeded", :wait-state-entered "WaitStateEntered", "LambdaFunctionSucceeded" "LambdaFunctionSucceeded", "ActivityTimedOut" "ActivityTimedOut", "WaitStateAborted" "WaitStateAborted", :wait-state-aborted "WaitStateAborted", "SucceedStateEntered" "SucceedStateEntered", :activity-started "ActivityStarted", "ActivityScheduled" "ActivityScheduled", "ParallelStateAborted" "ParallelStateAborted", :pass-state-exited "PassStateExited", :execution-timed-out "ExecutionTimedOut", "ParallelStateSucceeded" "ParallelStateSucceeded", :fail-state-entered "FailStateEntered", :execution-failed "ExecutionFailed", :activity-timed-out "ActivityTimedOut", :choice-state-entered "ChoiceStateEntered", :parallel-state-exited "ParallelStateExited", "ExecutionTimedOut" "ExecutionTimedOut", "ChoiceStateExited" "ChoiceStateExited", :task-state-exited "TaskStateExited", :succeed-state-exited "SucceedStateExited", :activity-scheduled "ActivityScheduled", "ExecutionFailed" "ExecutionFailed", :lambda-function-schedule-failed "LambdaFunctionScheduleFailed", "ActivityFailed" "ActivityFailed", :parallel-state-started "ParallelStateStarted", :execution-started "ExecutionStarted", "ChoiceStateEntered" "ChoiceStateEntered", "LambdaFunctionScheduled" "LambdaFunctionScheduled", :lambda-function-start-failed "LambdaFunctionStartFailed", :parallel-state-aborted "ParallelStateAborted", :parallel-state-succeeded "ParallelStateSucceeded", :pass-state-entered "PassStateEntered", "FailStateEntered" "FailStateEntered", "WaitStateExited" "WaitStateExited", :lambda-function-failed "LambdaFunctionFailed", "ActivityScheduleFailed" "ActivityScheduleFailed", :wait-state-exited "WaitStateExited", "SucceedStateExited" "SucceedStateExited", :parallel-state-entered "ParallelStateEntered", "TaskStateEntered" "TaskStateEntered", "PassStateExited" "PassStateExited", "LambdaFunctionFailed" "LambdaFunctionFailed", "PassStateEntered" "PassStateEntered", :activity-succeeded "ActivitySucceeded", :parallel-state-failed "ParallelStateFailed", :activity-schedule-failed "ActivityScheduleFailed", "LambdaFunctionTimedOut" "LambdaFunctionTimedOut", "ParallelStateFailed" "ParallelStateFailed", "ActivitySucceeded" "ActivitySucceeded", :execution-aborted "ExecutionAborted", "LambdaFunctionStarted" "LambdaFunctionStarted", :lambda-function-succeeded "LambdaFunctionSucceeded", "ExecutionSucceeded" "ExecutionSucceeded", :lambda-function-started "LambdaFunctionStarted", "ActivityStarted" "ActivityStarted", :choice-state-exited "ChoiceStateExited", :task-state-aborted "TaskStateAborted", "WaitStateEntered" "WaitStateEntered", "ParallelStateEntered" "ParallelStateEntered", "ExecutionStarted" "ExecutionStarted", "ExecutionAborted" "ExecutionAborted", :activity-failed "ActivityFailed", "ParallelStateStarted" "ParallelStateStarted", "LambdaFunctionScheduleFailed" "LambdaFunctionScheduleFailed", "ParallelStateExited" "ParallelStateExited", "TaskStateAborted" "TaskStateAborted", :lambda-function-scheduled "LambdaFunctionScheduled", :task-state-entered "TaskStateEntered", :succeed-state-entered "SucceedStateEntered", "TaskStateExited" "TaskStateExited"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-input/status-filter (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-input/max-results (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-size))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-input/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-executions-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.list-executions-input/stateMachineArn] :opt-un [:portkey.aws.states.-2016-11-23.list-executions-input/statusFilter :portkey.aws.states.-2016-11-23.list-executions-input/maxResults :portkey.aws.states.-2016-11-23.list-executions-input/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-activity-task-output/task-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-activity-task-output/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/get-activity-task-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.get-activity-task-output/taskToken :portkey.aws.states.-2016-11-23.get-activity-task-output/input] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/page-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-timed-out/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-timed-out (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.task-timed-out/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-timed-out-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-timed-out-event-details/error :portkey.aws.states.-2016-11-23.lambda-function-timed-out-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-succeeded-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-succeeded-event-details/output] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-does-not-exist (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.task-does-not-exist/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-success-input/task-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-success-input/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-success-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.send-task-success-input/taskToken :portkey.aws.states.-2016-11-23.send-task-success-input/output] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-activity-task-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-activity-task-input/worker-name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/get-activity-task-input (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.get-activity-task-input/activityArn] :opt-un [:portkey.aws.states.-2016-11-23.get-activity-task-input/workerName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-failed-event-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-failed-event-details/error :portkey.aws.states.-2016-11-23.lambda-function-failed-event-details/cause] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/state-machine-list-item) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-deleting/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-deleting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.state-machine-deleting/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/status (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/start-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/stop-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-list-item (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.execution-list-item/executionArn :portkey.aws.states.-2016-11-23.execution-list-item/stateMachineArn :portkey.aws.states.-2016-11-23.execution-list-item/name :portkey.aws.states.-2016-11-23.execution-list-item/status :portkey.aws.states.-2016-11-23.execution-list-item/startDate] :opt-un [:portkey.aws.states.-2016-11-23.execution-list-item/stopDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/definition (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/definition))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/update-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-output (portkey.aws/json-keys :req-un [:portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/stateMachineArn :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/name :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/definition :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/roleArn :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/updateDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-state-machines-input/max-results (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-size))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-state-machines-input/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-state-machines-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.list-state-machines-input/maxResults :portkey.aws.states.-2016-11-23.list-state-machines-input/nextToken] :locations {}))

(clojure.core/defn stop-execution "Stops an execution." ([stop-execution-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.StopExecution" stop-execution-input :portkey.aws.states.-2016-11-23/stop-execution-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/stop-execution-output {"ExecutionDoesNotExist" :portkey.aws.states.-2016-11-23/execution-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn})))
(clojure.spec.alpha/fdef stop-execution :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/stop-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/stop-execution-output))

(clojure.core/defn update-state-machine "Updates an existing state machine by modifying its definition and/or roleArn.\nRunning executions will continue to use the previous definition and roleArn.\n All StartExecution calls within a few seconds will use the updated definition\nand roleArn. Executions started immediately after calling UpdateStateMachine may\nuse the previous state machine definition and roleArn. You must include at least\none of definition or roleArn or you will receive a MissingRequiredParameter\nerror." ([update-state-machine-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.UpdateStateMachine" update-state-machine-input :portkey.aws.states.-2016-11-23/update-state-machine-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/update-state-machine-output {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidDefinition" :portkey.aws.states.-2016-11-23/invalid-definition, "MissingRequiredParameter" :portkey.aws.states.-2016-11-23/missing-required-parameter, "StateMachineDeleting" :portkey.aws.states.-2016-11-23/state-machine-deleting, "StateMachineDoesNotExist" :portkey.aws.states.-2016-11-23/state-machine-does-not-exist})))
(clojure.spec.alpha/fdef update-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/update-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/update-state-machine-output))

(clojure.core/defn get-activity-task "Used by workers to retrieve a task (with the specified activity ARN) which has\nbeen scheduled for execution by a running state machine. This initiates a long\npoll, where the service holds the HTTP connection open and responds as soon as a\ntask becomes available (i.e. an execution of a task of this type is needed.) The\nmaximum time the service holds on to the request before responding is 60\nseconds. If no task is available within 60 seconds, the poll returns a taskToken\nwith a null string.\n Workers should set their client side socket timeout to at least 65 seconds (5\nseconds higher than the maximum time the service may hold the poll request)." ([get-activity-task-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.GetActivityTask" get-activity-task-input :portkey.aws.states.-2016-11-23/get-activity-task-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/get-activity-task-output {"ActivityDoesNotExist" :portkey.aws.states.-2016-11-23/activity-does-not-exist, "ActivityWorkerLimitExceeded" :portkey.aws.states.-2016-11-23/activity-worker-limit-exceeded, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn})))
(clojure.spec.alpha/fdef get-activity-task :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/get-activity-task-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/get-activity-task-output))

(clojure.core/defn list-executions "Lists the executions of a state machine that meet the filtering criteria.\n If a nextToken is returned by a previous call, there are more results\navailable. To retrieve the next page of results, make the call again using the\nreturned token in nextToken. Keep all other arguments unchanged." ([list-executions-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.ListExecutions" list-executions-input :portkey.aws.states.-2016-11-23/list-executions-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/list-executions-output {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token, "StateMachineDoesNotExist" :portkey.aws.states.-2016-11-23/state-machine-does-not-exist})))
(clojure.spec.alpha/fdef list-executions :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/list-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/list-executions-output))

(clojure.core/defn describe-execution "Describes an execution." ([describe-execution-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.DescribeExecution" describe-execution-input :portkey.aws.states.-2016-11-23/describe-execution-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/describe-execution-output {"ExecutionDoesNotExist" :portkey.aws.states.-2016-11-23/execution-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn})))
(clojure.spec.alpha/fdef describe-execution :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/describe-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/describe-execution-output))

(clojure.core/defn start-execution "Starts a state machine execution." ([start-execution-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.StartExecution" start-execution-input :portkey.aws.states.-2016-11-23/start-execution-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/start-execution-output {"ExecutionLimitExceeded" :portkey.aws.states.-2016-11-23/execution-limit-exceeded, "ExecutionAlreadyExists" :portkey.aws.states.-2016-11-23/execution-already-exists, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidExecutionInput" :portkey.aws.states.-2016-11-23/invalid-execution-input, "InvalidName" :portkey.aws.states.-2016-11-23/invalid-name, "StateMachineDoesNotExist" :portkey.aws.states.-2016-11-23/state-machine-does-not-exist, "StateMachineDeleting" :portkey.aws.states.-2016-11-23/state-machine-deleting})))
(clojure.spec.alpha/fdef start-execution :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/start-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/start-execution-output))

(clojure.core/defn delete-activity "Deletes an activity." ([delete-activity-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.DeleteActivity" delete-activity-input :portkey.aws.states.-2016-11-23/delete-activity-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/delete-activity-output {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn})))
(clojure.spec.alpha/fdef delete-activity :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/delete-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/delete-activity-output))

(clojure.core/defn describe-state-machine-for-execution "Describes the state machine associated with a specific execution." ([describe-state-machine-for-execution-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.DescribeStateMachineForExecution" describe-state-machine-for-execution-input :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-output {"ExecutionDoesNotExist" :portkey.aws.states.-2016-11-23/execution-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn})))
(clojure.spec.alpha/fdef describe-state-machine-for-execution :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-output))

(clojure.core/defn describe-activity "Describes an activity." ([describe-activity-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.DescribeActivity" describe-activity-input :portkey.aws.states.-2016-11-23/describe-activity-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/describe-activity-output {"ActivityDoesNotExist" :portkey.aws.states.-2016-11-23/activity-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn})))
(clojure.spec.alpha/fdef describe-activity :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/describe-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/describe-activity-output))

(clojure.core/defn describe-state-machine "Describes a state machine." ([describe-state-machine-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.DescribeStateMachine" describe-state-machine-input :portkey.aws.states.-2016-11-23/describe-state-machine-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/describe-state-machine-output {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "StateMachineDoesNotExist" :portkey.aws.states.-2016-11-23/state-machine-does-not-exist})))
(clojure.spec.alpha/fdef describe-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/describe-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/describe-state-machine-output))

(clojure.core/defn send-task-heartbeat "Used by workers to report to the service that the task represented by the\nspecified taskToken is still making progress. This action resets the Heartbeat\nclock. The Heartbeat threshold is specified in the state machine's Amazon States\nLanguage definition. This action does not in itself create an event in the\nexecution history. However, if the task times out, the execution history\ncontains an ActivityTimedOut event.\n The Timeout of a task, defined in the state machine's Amazon States Language\ndefinition, is its maximum allowed duration, regardless of the number of\nSendTaskHeartbeat requests received.\n This operation is only useful for long-lived tasks to report the liveliness of\nthe task." ([send-task-heartbeat-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.SendTaskHeartbeat" send-task-heartbeat-input :portkey.aws.states.-2016-11-23/send-task-heartbeat-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/send-task-heartbeat-output {"TaskDoesNotExist" :portkey.aws.states.-2016-11-23/task-does-not-exist, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token, "TaskTimedOut" :portkey.aws.states.-2016-11-23/task-timed-out})))
(clojure.spec.alpha/fdef send-task-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/send-task-heartbeat-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/send-task-heartbeat-output))

(clojure.core/defn send-task-failure "Used by workers to report that the task identified by the taskToken failed." ([send-task-failure-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.SendTaskFailure" send-task-failure-input :portkey.aws.states.-2016-11-23/send-task-failure-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/send-task-failure-output {"TaskDoesNotExist" :portkey.aws.states.-2016-11-23/task-does-not-exist, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token, "TaskTimedOut" :portkey.aws.states.-2016-11-23/task-timed-out})))
(clojure.spec.alpha/fdef send-task-failure :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/send-task-failure-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/send-task-failure-output))

(clojure.core/defn create-state-machine "Creates a state machine. A state machine consists of a collection of states that\ncan do work (Task states), determine to which states to transition next (Choice\nstates), stop an execution with an error (Fail states), and so on. State\nmachines are specified using a JSON-based, structured language." ([create-state-machine-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.CreateStateMachine" create-state-machine-input :portkey.aws.states.-2016-11-23/create-state-machine-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/create-state-machine-output {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidDefinition" :portkey.aws.states.-2016-11-23/invalid-definition, "InvalidName" :portkey.aws.states.-2016-11-23/invalid-name, "StateMachineAlreadyExists" :portkey.aws.states.-2016-11-23/state-machine-already-exists, "StateMachineDeleting" :portkey.aws.states.-2016-11-23/state-machine-deleting, "StateMachineLimitExceeded" :portkey.aws.states.-2016-11-23/state-machine-limit-exceeded})))
(clojure.spec.alpha/fdef create-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/create-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/create-state-machine-output))

(clojure.core/defn send-task-success "Used by workers to report that the task identified by the taskToken completed\nsuccessfully." ([send-task-success-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.SendTaskSuccess" send-task-success-input :portkey.aws.states.-2016-11-23/send-task-success-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/send-task-success-output {"TaskDoesNotExist" :portkey.aws.states.-2016-11-23/task-does-not-exist, "InvalidOutput" :portkey.aws.states.-2016-11-23/invalid-output, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token, "TaskTimedOut" :portkey.aws.states.-2016-11-23/task-timed-out})))
(clojure.spec.alpha/fdef send-task-success :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/send-task-success-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/send-task-success-output))

(clojure.core/defn create-activity "Creates an activity. An activity is a task which you write in any programming\nlanguage and host on any machine which has access to AWS Step Functions.\nActivities must poll Step Functions using the GetActivityTask API action and\nrespond using SendTask* API actions. This function lets Step Functions know the\nexistence of your activity and returns an identifier for use in a state machine\nand when polling from the activity." ([create-activity-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.CreateActivity" create-activity-input :portkey.aws.states.-2016-11-23/create-activity-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/create-activity-output {"ActivityLimitExceeded" :portkey.aws.states.-2016-11-23/activity-limit-exceeded, "InvalidName" :portkey.aws.states.-2016-11-23/invalid-name})))
(clojure.spec.alpha/fdef create-activity :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/create-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/create-activity-output))

(clojure.core/defn get-execution-history "Returns the history of the specified execution as a list of events. By default,\nthe results are returned in ascending order of the timeStamp of the events. Use\nthe reverseOrder parameter to get the latest events first.\n If a nextToken is returned by a previous call, there are more results\navailable. To retrieve the next page of results, make the call again using the\nreturned token in nextToken. Keep all other arguments unchanged." ([get-execution-history-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.GetExecutionHistory" get-execution-history-input :portkey.aws.states.-2016-11-23/get-execution-history-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/get-execution-history-output {"ExecutionDoesNotExist" :portkey.aws.states.-2016-11-23/execution-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token})))
(clojure.spec.alpha/fdef get-execution-history :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/get-execution-history-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/get-execution-history-output))

(clojure.core/defn list-state-machines "Lists the existing state machines.\n If a nextToken is returned by a previous call, there are more results\navailable. To retrieve the next page of results, make the call again using the\nreturned token in nextToken. Keep all other arguments unchanged." ([] (list-state-machines {})) ([list-state-machines-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.ListStateMachines" list-state-machines-input :portkey.aws.states.-2016-11-23/list-state-machines-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/list-state-machines-output {"InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token})))
(clojure.spec.alpha/fdef list-state-machines :args (clojure.spec.alpha/? :portkey.aws.states.-2016-11-23/list-state-machines-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/list-state-machines-output))

(clojure.core/defn list-activities "Lists the existing activities.\n If a nextToken is returned by a previous call, there are more results\navailable. To retrieve the next page of results, make the call again using the\nreturned token in nextToken. Keep all other arguments unchanged." ([] (list-activities {})) ([list-activities-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.ListActivities" list-activities-input :portkey.aws.states.-2016-11-23/list-activities-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/list-activities-output {"InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token})))
(clojure.spec.alpha/fdef list-activities :args (clojure.spec.alpha/? :portkey.aws.states.-2016-11-23/list-activities-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/list-activities-output))

(clojure.core/defn delete-state-machine "Deletes a state machine. This is an asynchronous operation: It sets the state\nmachine's status to DELETING and begins the deletion process. Each state machine\nexecution is deleted the next time it makes a state transition.\n The state machine itself is deleted after all executions are completed or\ndeleted." ([delete-state-machine-input] (portkey.aws/-json-call portkey.aws.states.-2016-11-23/endpoints "POST" "AWSStepFunctions.DeleteStateMachine" delete-state-machine-input :portkey.aws.states.-2016-11-23/delete-state-machine-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.states.-2016-11-23/delete-state-machine-output {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn})))
(clojure.spec.alpha/fdef delete-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/delete-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/delete-state-machine-output))
