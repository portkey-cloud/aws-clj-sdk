(ns portkey.aws.states.-2016-11-23 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "states", :region "us-gov-east-1"},
    :ssl-common-name "states.us-gov-east-1.amazonaws.com",
    :endpoint "https://states.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
   "cn-north-1"
   {:credential-scope {:service "states", :region "cn-north-1"},
    :ssl-common-name "states.cn-north-1.amazonaws.com.cn",
    :endpoint "https://states.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "states", :region "sa-east-1"},
    :ssl-common-name "states.sa-east-1.amazonaws.com",
    :endpoint "https://states.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "states", :region "ap-southeast-1"},
    :ssl-common-name "states.ap-southeast-1.amazonaws.com",
    :endpoint "https://states.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "states", :region "cn-northwest-1"},
    :ssl-common-name "states.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://states.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "states", :region "ap-northeast-2"},
    :ssl-common-name "states.ap-northeast-2.amazonaws.com",
    :endpoint "https://states.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "states", :region "eu-west-3"},
    :ssl-common-name "states.eu-west-3.amazonaws.com",
    :endpoint "https://states.eu-west-3.amazonaws.com",
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "states", :region "eu-north-1"},
    :ssl-common-name "states.eu-north-1.amazonaws.com",
    :endpoint "https://states.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-sensitive-data)

(clojure.core/declare ser-sensitive-error)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-definition)

(clojure.core/declare ser-execution-status)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-task-token)

(clojure.core/declare ser-sensitive-cause)

(clojure.core/declare ser-name)

(clojure.core/declare ser-reverse-order)

(clojure.core/declare ser-page-token)

(clojure.core/defn- ser-sensitive-data [input] #:http.request.field{:value input, :shape "SensitiveData"})

(clojure.core/defn- ser-sensitive-error [input] #:http.request.field{:value input, :shape "SensitiveError"})

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-definition [input] #:http.request.field{:value input, :shape "Definition"})

(clojure.core/defn- ser-execution-status [input] #:http.request.field{:value (clojure.core/get {:timed-out "TIMED_OUT", "TIMED_OUT" "TIMED_OUT", :aborted "ABORTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "FAILED" "FAILED", "ABORTED" "ABORTED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"} input), :shape "ExecutionStatus"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "value", :shape "TagValue"}))))

(clojure.core/defn- ser-task-token [input] #:http.request.field{:value input, :shape "TaskToken"})

(clojure.core/defn- ser-sensitive-cause [input] #:http.request.field{:value input, :shape "SensitiveCause"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-reverse-order [input] #:http.request.field{:value input, :shape "ReverseOrder"})

(clojure.core/defn- ser-page-token [input] #:http.request.field{:value input, :shape "PageToken"})

(clojure.core/defn- req-create-state-machine-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-definition (input :definition)) #:http.request.field{:name "definition", :shape "Definition"}) (clojure.core/into (ser-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "Arn"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-send-task-failure-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]} (clojure.core/contains? input :error) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sensitive-error (input :error)) #:http.request.field{:name "error", :shape "SensitiveError"})) (clojure.core/contains? input :cause) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sensitive-cause (input :cause)) #:http.request.field{:name "cause", :shape "SensitiveCause"}))))

(clojure.core/defn- req-list-activities-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PageToken"}))))

(clojure.core/defn- req-create-activity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-tag-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})]}))

(clojure.core/defn- req-describe-activity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :activity-arn)) #:http.request.field{:name "activityArn", :shape "Arn"})]}))

(clojure.core/defn- req-start-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sensitive-data (input :input)) #:http.request.field{:name "input", :shape "SensitiveData"}))))

(clojure.core/defn- req-describe-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :execution-arn)) #:http.request.field{:name "executionArn", :shape "Arn"})]}))

(clojure.core/defn- req-describe-state-machine-for-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :execution-arn)) #:http.request.field{:name "executionArn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-activity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :activity-arn)) #:http.request.field{:name "activityArn", :shape "Arn"})]}))

(clojure.core/defn- req-list-tags-for-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-state-machine-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]}))

(clojure.core/defn- req-untag-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-get-execution-history-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :execution-arn)) #:http.request.field{:name "executionArn", :shape "Arn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "PageSize"})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reverse-order (input :reverse-order)) #:http.request.field{:name "reverseOrder", :shape "ReverseOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PageToken"}))))

(clojure.core/defn- req-stop-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :execution-arn)) #:http.request.field{:name "executionArn", :shape "Arn"})]} (clojure.core/contains? input :error) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sensitive-error (input :error)) #:http.request.field{:name "error", :shape "SensitiveError"})) (clojure.core/contains? input :cause) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sensitive-cause (input :cause)) #:http.request.field{:name "cause", :shape "SensitiveCause"}))))

(clojure.core/defn- req-update-state-machine-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]} (clojure.core/contains? input :definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-definition (input :definition)) #:http.request.field{:name "definition", :shape "Definition"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "Arn"}))))

(clojure.core/defn- req-send-task-heartbeat-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"})]}))

(clojure.core/defn- req-describe-state-machine-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]}))

(clojure.core/defn- req-list-executions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :state-machine-arn)) #:http.request.field{:name "stateMachineArn", :shape "Arn"})]} (clojure.core/contains? input :status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-status (input :status-filter)) #:http.request.field{:name "statusFilter", :shape "ExecutionStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PageToken"}))))

(clojure.core/defn- req-send-task-success-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-task-token (input :task-token)) #:http.request.field{:name "taskToken", :shape "TaskToken"}) (clojure.core/into (ser-sensitive-data (input :output)) #:http.request.field{:name "output", :shape "SensitiveData"})]}))

(clojure.core/defn- req-get-activity-task-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :activity-arn)) #:http.request.field{:name "activityArn", :shape "Arn"})]} (clojure.core/contains? input :worker-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :worker-name)) #:http.request.field{:name "workerName", :shape "Name"}))))

(clojure.core/defn- req-list-state-machines-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "PageSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PageToken"}))))

(clojure.core/declare deser-connector-parameters)

(clojure.core/declare deser-sensitive-data)

(clojure.core/declare deser-timeout-in-seconds)

(clojure.core/declare deser-lambda-function-start-failed-event-details)

(clojure.core/declare deser-task-submit-failed-event-details)

(clojure.core/declare deser-activity-succeeded-event-details)

(clojure.core/declare deser-sensitive-error)

(clojure.core/declare deser-execution-timed-out-event-details)

(clojure.core/declare deser-execution-aborted-event-details)

(clojure.core/declare deser-activity-started-event-details)

(clojure.core/declare deser-activity-scheduled-event-details)

(clojure.core/declare deser-task-submitted-event-details)

(clojure.core/declare deser-task-timed-out-event-details)

(clojure.core/declare deser-state-entered-event-details)

(clojure.core/declare deser-history-event-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-state-machine-status)

(clojure.core/declare deser-sensitive-data-job-input)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-execution-started-event-details)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-activity-timed-out-event-details)

(clojure.core/declare deser-activity-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-activity-schedule-failed-event-details)

(clojure.core/declare deser-lambda-function-scheduled-event-details)

(clojure.core/declare deser-state-exited-event-details)

(clojure.core/declare deser-execution-failed-event-details)

(clojure.core/declare deser-task-succeeded-event-details)

(clojure.core/declare deser-activity-failed-event-details)

(clojure.core/declare deser-identity)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-definition)

(clojure.core/declare deser-lambda-function-schedule-failed-event-details)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-execution-status)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-task-token)

(clojure.core/declare deser-state-machine-list-item)

(clojure.core/declare deser-event-id)

(clojure.core/declare deser-sensitive-cause)

(clojure.core/declare deser-name)

(clojure.core/declare deser-history-event)

(clojure.core/declare deser-task-start-failed-event-details)

(clojure.core/declare deser-execution-list)

(clojure.core/declare deser-activity-list-item)

(clojure.core/declare deser-lambda-function-succeeded-event-details)

(clojure.core/declare deser-history-event-type)

(clojure.core/declare deser-page-token)

(clojure.core/declare deser-task-started-event-details)

(clojure.core/declare deser-lambda-function-timed-out-event-details)

(clojure.core/declare deser-execution-succeeded-event-details)

(clojure.core/declare deser-task-scheduled-event-details)

(clojure.core/declare deser-lambda-function-failed-event-details)

(clojure.core/declare deser-task-failed-event-details)

(clojure.core/declare deser-state-machine-list)

(clojure.core/declare deser-execution-list-item)

(clojure.core/defn- deser-connector-parameters [input] input)

(clojure.core/defn- deser-sensitive-data [input] input)

(clojure.core/defn- deser-timeout-in-seconds [input] input)

(clojure.core/defn- deser-lambda-function-start-failed-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-task-submit-failed-event-details [input] (clojure.core/cond-> {:resource-type (deser-name (input "resourceType")), :resource (deser-name (input "resource"))} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-activity-succeeded-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "output") (clojure.core/assoc :output (deser-sensitive-data (input "output")))))

(clojure.core/defn- deser-sensitive-error [input] input)

(clojure.core/defn- deser-execution-timed-out-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-execution-aborted-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-activity-started-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "workerName") (clojure.core/assoc :worker-name (deser-identity (input "workerName")))))

(clojure.core/defn- deser-activity-scheduled-event-details [input] (clojure.core/cond-> {:resource (deser-arn (input "resource"))} (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-sensitive-data (input "input"))) (clojure.core/contains? input "timeoutInSeconds") (clojure.core/assoc :timeout-in-seconds (deser-timeout-in-seconds (input "timeoutInSeconds"))) (clojure.core/contains? input "heartbeatInSeconds") (clojure.core/assoc :heartbeat-in-seconds (deser-timeout-in-seconds (input "heartbeatInSeconds")))))

(clojure.core/defn- deser-task-submitted-event-details [input] (clojure.core/cond-> {:resource-type (deser-name (input "resourceType")), :resource (deser-name (input "resource"))} (clojure.core/contains? input "output") (clojure.core/assoc :output (deser-sensitive-data (input "output")))))

(clojure.core/defn- deser-task-timed-out-event-details [input] (clojure.core/cond-> {:resource-type (deser-name (input "resourceType")), :resource (deser-name (input "resource"))} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-state-entered-event-details [input] (clojure.core/cond-> {:name (deser-name (input "name"))} (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-sensitive-data (input "input")))))

(clojure.core/defn- deser-history-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-history-event coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-state-machine-status [input] (clojure.core/get {"ACTIVE" :active, "DELETING" :deleting} input))

(clojure.core/defn- deser-sensitive-data-job-input [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-execution-started-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-sensitive-data (input "input"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-arn (input "roleArn")))))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-activity-timed-out-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-activity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-activity-list-item coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-activity-schedule-failed-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-lambda-function-scheduled-event-details [input] (clojure.core/cond-> {:resource (deser-arn (input "resource"))} (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-sensitive-data (input "input"))) (clojure.core/contains? input "timeoutInSeconds") (clojure.core/assoc :timeout-in-seconds (deser-timeout-in-seconds (input "timeoutInSeconds")))))

(clojure.core/defn- deser-state-exited-event-details [input] (clojure.core/cond-> {:name (deser-name (input "name"))} (clojure.core/contains? input "output") (clojure.core/assoc :output (deser-sensitive-data (input "output")))))

(clojure.core/defn- deser-execution-failed-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-task-succeeded-event-details [input] (clojure.core/cond-> {:resource-type (deser-name (input "resourceType")), :resource (deser-name (input "resource"))} (clojure.core/contains? input "output") (clojure.core/assoc :output (deser-sensitive-data (input "output")))))

(clojure.core/defn- deser-activity-failed-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-identity [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-definition [input] input)

(clojure.core/defn- deser-lambda-function-schedule-failed-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-execution-status [input] (clojure.core/get {"RUNNING" :running, "SUCCEEDED" :succeeded, "FAILED" :failed, "TIMED_OUT" :timed-out, "ABORTED" :aborted} input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-tag-key (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-tag-value (input "value")))))

(clojure.core/defn- deser-task-token [input] input)

(clojure.core/defn- deser-state-machine-list-item [input] (clojure.core/cond-> {:state-machine-arn (deser-arn (input "stateMachineArn")), :name (deser-name (input "name")), :creation-date (deser-timestamp (input "creationDate"))}))

(clojure.core/defn- deser-event-id [input] input)

(clojure.core/defn- deser-sensitive-cause [input] input)

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-history-event [input] (clojure.core/cond-> {:timestamp (deser-timestamp (input "timestamp")), :type (deser-history-event-type (input "type")), :id (deser-event-id (input "id"))} (clojure.core/contains? input "activityStartedEventDetails") (clojure.core/assoc :activity-started-event-details (deser-activity-started-event-details (input "activityStartedEventDetails"))) (clojure.core/contains? input "executionAbortedEventDetails") (clojure.core/assoc :execution-aborted-event-details (deser-execution-aborted-event-details (input "executionAbortedEventDetails"))) (clojure.core/contains? input "lambdaFunctionTimedOutEventDetails") (clojure.core/assoc :lambda-function-timed-out-event-details (deser-lambda-function-timed-out-event-details (input "lambdaFunctionTimedOutEventDetails"))) (clojure.core/contains? input "lambdaFunctionFailedEventDetails") (clojure.core/assoc :lambda-function-failed-event-details (deser-lambda-function-failed-event-details (input "lambdaFunctionFailedEventDetails"))) (clojure.core/contains? input "executionStartedEventDetails") (clojure.core/assoc :execution-started-event-details (deser-execution-started-event-details (input "executionStartedEventDetails"))) (clojure.core/contains? input "taskSubmitFailedEventDetails") (clojure.core/assoc :task-submit-failed-event-details (deser-task-submit-failed-event-details (input "taskSubmitFailedEventDetails"))) (clojure.core/contains? input "lambdaFunctionScheduledEventDetails") (clojure.core/assoc :lambda-function-scheduled-event-details (deser-lambda-function-scheduled-event-details (input "lambdaFunctionScheduledEventDetails"))) (clojure.core/contains? input "activitySucceededEventDetails") (clojure.core/assoc :activity-succeeded-event-details (deser-activity-succeeded-event-details (input "activitySucceededEventDetails"))) (clojure.core/contains? input "lambdaFunctionScheduleFailedEventDetails") (clojure.core/assoc :lambda-function-schedule-failed-event-details (deser-lambda-function-schedule-failed-event-details (input "lambdaFunctionScheduleFailedEventDetails"))) (clojure.core/contains? input "executionTimedOutEventDetails") (clojure.core/assoc :execution-timed-out-event-details (deser-execution-timed-out-event-details (input "executionTimedOutEventDetails"))) (clojure.core/contains? input "taskSucceededEventDetails") (clojure.core/assoc :task-succeeded-event-details (deser-task-succeeded-event-details (input "taskSucceededEventDetails"))) (clojure.core/contains? input "previousEventId") (clojure.core/assoc :previous-event-id (deser-event-id (input "previousEventId"))) (clojure.core/contains? input "executionFailedEventDetails") (clojure.core/assoc :execution-failed-event-details (deser-execution-failed-event-details (input "executionFailedEventDetails"))) (clojure.core/contains? input "stateExitedEventDetails") (clojure.core/assoc :state-exited-event-details (deser-state-exited-event-details (input "stateExitedEventDetails"))) (clojure.core/contains? input "activityScheduleFailedEventDetails") (clojure.core/assoc :activity-schedule-failed-event-details (deser-activity-schedule-failed-event-details (input "activityScheduleFailedEventDetails"))) (clojure.core/contains? input "executionSucceededEventDetails") (clojure.core/assoc :execution-succeeded-event-details (deser-execution-succeeded-event-details (input "executionSucceededEventDetails"))) (clojure.core/contains? input "activityFailedEventDetails") (clojure.core/assoc :activity-failed-event-details (deser-activity-failed-event-details (input "activityFailedEventDetails"))) (clojure.core/contains? input "taskSubmittedEventDetails") (clojure.core/assoc :task-submitted-event-details (deser-task-submitted-event-details (input "taskSubmittedEventDetails"))) (clojure.core/contains? input "lambdaFunctionSucceededEventDetails") (clojure.core/assoc :lambda-function-succeeded-event-details (deser-lambda-function-succeeded-event-details (input "lambdaFunctionSucceededEventDetails"))) (clojure.core/contains? input "taskScheduledEventDetails") (clojure.core/assoc :task-scheduled-event-details (deser-task-scheduled-event-details (input "taskScheduledEventDetails"))) (clojure.core/contains? input "activityScheduledEventDetails") (clojure.core/assoc :activity-scheduled-event-details (deser-activity-scheduled-event-details (input "activityScheduledEventDetails"))) (clojure.core/contains? input "stateEnteredEventDetails") (clojure.core/assoc :state-entered-event-details (deser-state-entered-event-details (input "stateEnteredEventDetails"))) (clojure.core/contains? input "taskTimedOutEventDetails") (clojure.core/assoc :task-timed-out-event-details (deser-task-timed-out-event-details (input "taskTimedOutEventDetails"))) (clojure.core/contains? input "taskFailedEventDetails") (clojure.core/assoc :task-failed-event-details (deser-task-failed-event-details (input "taskFailedEventDetails"))) (clojure.core/contains? input "taskStartedEventDetails") (clojure.core/assoc :task-started-event-details (deser-task-started-event-details (input "taskStartedEventDetails"))) (clojure.core/contains? input "taskStartFailedEventDetails") (clojure.core/assoc :task-start-failed-event-details (deser-task-start-failed-event-details (input "taskStartFailedEventDetails"))) (clojure.core/contains? input "lambdaFunctionStartFailedEventDetails") (clojure.core/assoc :lambda-function-start-failed-event-details (deser-lambda-function-start-failed-event-details (input "lambdaFunctionStartFailedEventDetails"))) (clojure.core/contains? input "activityTimedOutEventDetails") (clojure.core/assoc :activity-timed-out-event-details (deser-activity-timed-out-event-details (input "activityTimedOutEventDetails")))))

(clojure.core/defn- deser-task-start-failed-event-details [input] (clojure.core/cond-> {:resource-type (deser-name (input "resourceType")), :resource (deser-name (input "resource"))} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-execution-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-execution-list-item coll))) input))

(clojure.core/defn- deser-activity-list-item [input] (clojure.core/cond-> {:activity-arn (deser-arn (input "activityArn")), :name (deser-name (input "name")), :creation-date (deser-timestamp (input "creationDate"))}))

(clojure.core/defn- deser-lambda-function-succeeded-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "output") (clojure.core/assoc :output (deser-sensitive-data (input "output")))))

(clojure.core/defn- deser-history-event-type [input] (clojure.core/get {"LambdaFunctionStartFailed" :lambda-function-start-failed, "TaskSubmitted" :task-submitted, "LambdaFunctionSucceeded" :lambda-function-succeeded, "ActivityTimedOut" :activity-timed-out, "WaitStateAborted" :wait-state-aborted, "SucceedStateEntered" :succeed-state-entered, "ActivityScheduled" :activity-scheduled, "ParallelStateAborted" :parallel-state-aborted, "ParallelStateSucceeded" :parallel-state-succeeded, "ExecutionTimedOut" :execution-timed-out, "ChoiceStateExited" :choice-state-exited, "TaskSubmitFailed" :task-submit-failed, "ExecutionFailed" :execution-failed, "TaskSucceeded" :task-succeeded, "ActivityFailed" :activity-failed, "ChoiceStateEntered" :choice-state-entered, "LambdaFunctionScheduled" :lambda-function-scheduled, "TaskScheduled" :task-scheduled, "TaskStarted" :task-started, "FailStateEntered" :fail-state-entered, "WaitStateExited" :wait-state-exited, "ActivityScheduleFailed" :activity-schedule-failed, "SucceedStateExited" :succeed-state-exited, "TaskStateEntered" :task-state-entered, "PassStateExited" :pass-state-exited, "LambdaFunctionFailed" :lambda-function-failed, "PassStateEntered" :pass-state-entered, "TaskFailed" :task-failed, "TaskStartFailed" :task-start-failed, "LambdaFunctionTimedOut" :lambda-function-timed-out, "ParallelStateFailed" :parallel-state-failed, "ActivitySucceeded" :activity-succeeded, "LambdaFunctionStarted" :lambda-function-started, "ExecutionSucceeded" :execution-succeeded, "ActivityStarted" :activity-started, "WaitStateEntered" :wait-state-entered, "ParallelStateEntered" :parallel-state-entered, "ExecutionStarted" :execution-started, "ExecutionAborted" :execution-aborted, "ParallelStateStarted" :parallel-state-started, "LambdaFunctionScheduleFailed" :lambda-function-schedule-failed, "ParallelStateExited" :parallel-state-exited, "TaskStateAborted" :task-state-aborted, "TaskTimedOut" :task-timed-out, "TaskStateExited" :task-state-exited} input))

(clojure.core/defn- deser-page-token [input] input)

(clojure.core/defn- deser-task-started-event-details [input] (clojure.core/cond-> {:resource-type (deser-name (input "resourceType")), :resource (deser-name (input "resource"))}))

(clojure.core/defn- deser-lambda-function-timed-out-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-execution-succeeded-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "output") (clojure.core/assoc :output (deser-sensitive-data (input "output")))))

(clojure.core/defn- deser-task-scheduled-event-details [input] (clojure.core/cond-> {:resource-type (deser-name (input "resourceType")), :resource (deser-name (input "resource")), :region (deser-name (input "region")), :parameters (deser-connector-parameters (input "parameters"))} (clojure.core/contains? input "timeoutInSeconds") (clojure.core/assoc :timeout-in-seconds (deser-timeout-in-seconds (input "timeoutInSeconds")))))

(clojure.core/defn- deser-lambda-function-failed-event-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-task-failed-event-details [input] (clojure.core/cond-> {:resource-type (deser-name (input "resourceType")), :resource (deser-name (input "resource"))} (clojure.core/contains? input "error") (clojure.core/assoc :error (deser-sensitive-error (input "error"))) (clojure.core/contains? input "cause") (clojure.core/assoc :cause (deser-sensitive-cause (input "cause")))))

(clojure.core/defn- deser-state-machine-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-state-machine-list-item coll))) input))

(clojure.core/defn- deser-execution-list-item [input] (clojure.core/cond-> {:execution-arn (deser-arn (input "executionArn")), :state-machine-arn (deser-arn (input "stateMachineArn")), :name (deser-name (input "name")), :status (deser-execution-status (input "status")), :start-date (deser-timestamp (input "startDate"))} (clojure.core/contains? input "stopDate") (clojure.core/assoc :stop-date (deser-timestamp (input "stopDate")))))

(clojure.core/defn- response-execution-already-exists ([input] (response-execution-already-exists nil input)) ([resultWrapper2088403 input] (clojure.core/let [rawinput2088402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088404 {"message" (rawinput2088402 "message")}] (clojure.core/cond-> {} (letvar2088404 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088404 ["message"])))))))

(clojure.core/defn- response-describe-state-machine-output ([input] (response-describe-state-machine-output nil input)) ([resultWrapper2088406 input] (clojure.core/let [rawinput2088405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088407 {"stateMachineArn" (rawinput2088405 "stateMachineArn"), "name" (rawinput2088405 "name"), "status" (rawinput2088405 "status"), "definition" (rawinput2088405 "definition"), "roleArn" (rawinput2088405 "roleArn"), "creationDate" (rawinput2088405 "creationDate")}] (clojure.core/cond-> {:state-machine-arn (deser-arn (clojure.core/get-in letvar2088407 ["stateMachineArn"])), :name (deser-name (clojure.core/get-in letvar2088407 ["name"])), :definition (deser-definition (clojure.core/get-in letvar2088407 ["definition"])), :role-arn (deser-arn (clojure.core/get-in letvar2088407 ["roleArn"])), :creation-date (deser-timestamp (clojure.core/get-in letvar2088407 ["creationDate"]))} (letvar2088407 "status") (clojure.core/assoc :status (deser-state-machine-status (clojure.core/get-in letvar2088407 ["status"])))))))

(clojure.core/defn- response-state-machine-already-exists ([input] (response-state-machine-already-exists nil input)) ([resultWrapper2088409 input] (clojure.core/let [rawinput2088408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088410 {"message" (rawinput2088408 "message")}] (clojure.core/cond-> {} (letvar2088410 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088410 ["message"])))))))

(clojure.core/defn- response-stop-execution-output ([input] (response-stop-execution-output nil input)) ([resultWrapper2088412 input] (clojure.core/let [rawinput2088411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088413 {"stopDate" (rawinput2088411 "stopDate")}] (clojure.core/cond-> {:stop-date (deser-timestamp (clojure.core/get-in letvar2088413 ["stopDate"]))}))))

(clojure.core/defn- response-list-state-machines-output ([input] (response-list-state-machines-output nil input)) ([resultWrapper2088415 input] (clojure.core/let [rawinput2088414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088416 {"stateMachines" (rawinput2088414 "stateMachines"), "nextToken" (rawinput2088414 "nextToken")}] (clojure.core/cond-> {:state-machines (deser-state-machine-list (clojure.core/get-in letvar2088416 ["stateMachines"]))} (letvar2088416 "nextToken") (clojure.core/assoc :next-token (deser-page-token (clojure.core/get-in letvar2088416 ["nextToken"])))))))

(clojure.core/defn- response-tag-resource-output ([input] (response-tag-resource-output nil input)) ([resultWrapper2088418 input] (clojure.core/let [rawinput2088417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088419 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-arn ([input] (response-invalid-arn nil input)) ([resultWrapper2088421 input] (clojure.core/let [rawinput2088420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088422 {"message" (rawinput2088420 "message")}] (clojure.core/cond-> {} (letvar2088422 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088422 ["message"])))))))

(clojure.core/defn- response-execution-limit-exceeded ([input] (response-execution-limit-exceeded nil input)) ([resultWrapper2088424 input] (clojure.core/let [rawinput2088423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088425 {"message" (rawinput2088423 "message")}] (clojure.core/cond-> {} (letvar2088425 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088425 ["message"])))))))

(clojure.core/defn- response-start-execution-output ([input] (response-start-execution-output nil input)) ([resultWrapper2088427 input] (clojure.core/let [rawinput2088426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088428 {"executionArn" (rawinput2088426 "executionArn"), "startDate" (rawinput2088426 "startDate")}] (clojure.core/cond-> {:execution-arn (deser-arn (clojure.core/get-in letvar2088428 ["executionArn"])), :start-date (deser-timestamp (clojure.core/get-in letvar2088428 ["startDate"]))}))))

(clojure.core/defn- response-state-machine-limit-exceeded ([input] (response-state-machine-limit-exceeded nil input)) ([resultWrapper2088430 input] (clojure.core/let [rawinput2088429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088431 {"message" (rawinput2088429 "message")}] (clojure.core/cond-> {} (letvar2088431 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088431 ["message"])))))))

(clojure.core/defn- response-list-executions-output ([input] (response-list-executions-output nil input)) ([resultWrapper2088433 input] (clojure.core/let [rawinput2088432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088434 {"executions" (rawinput2088432 "executions"), "nextToken" (rawinput2088432 "nextToken")}] (clojure.core/cond-> {:executions (deser-execution-list (clojure.core/get-in letvar2088434 ["executions"]))} (letvar2088434 "nextToken") (clojure.core/assoc :next-token (deser-page-token (clojure.core/get-in letvar2088434 ["nextToken"])))))))

(clojure.core/defn- response-invalid-execution-input ([input] (response-invalid-execution-input nil input)) ([resultWrapper2088436 input] (clojure.core/let [rawinput2088435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088437 {"message" (rawinput2088435 "message")}] (clojure.core/cond-> {} (letvar2088437 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088437 ["message"])))))))

(clojure.core/defn- response-create-state-machine-output ([input] (response-create-state-machine-output nil input)) ([resultWrapper2088439 input] (clojure.core/let [rawinput2088438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088440 {"stateMachineArn" (rawinput2088438 "stateMachineArn"), "creationDate" (rawinput2088438 "creationDate")}] (clojure.core/cond-> {:state-machine-arn (deser-arn (clojure.core/get-in letvar2088440 ["stateMachineArn"])), :creation-date (deser-timestamp (clojure.core/get-in letvar2088440 ["creationDate"]))}))))

(clojure.core/defn- response-too-many-tags ([input] (response-too-many-tags nil input)) ([resultWrapper2088442 input] (clojure.core/let [rawinput2088441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088443 {"message" (rawinput2088441 "message"), "resourceName" (rawinput2088441 "resourceName")}] (clojure.core/cond-> {} (letvar2088443 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088443 ["message"]))) (letvar2088443 "resourceName") (clojure.core/assoc :resource-name (deser-arn (clojure.core/get-in letvar2088443 ["resourceName"])))))))

(clojure.core/defn- response-delete-activity-output ([input] (response-delete-activity-output nil input)) ([resultWrapper2088445 input] (clojure.core/let [rawinput2088444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088446 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-output ([input] (response-invalid-output nil input)) ([resultWrapper2088448 input] (clojure.core/let [rawinput2088447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088449 {"message" (rawinput2088447 "message")}] (clojure.core/cond-> {} (letvar2088449 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088449 ["message"])))))))

(clojure.core/defn- response-create-activity-output ([input] (response-create-activity-output nil input)) ([resultWrapper2088451 input] (clojure.core/let [rawinput2088450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088452 {"activityArn" (rawinput2088450 "activityArn"), "creationDate" (rawinput2088450 "creationDate")}] (clojure.core/cond-> {:activity-arn (deser-arn (clojure.core/get-in letvar2088452 ["activityArn"])), :creation-date (deser-timestamp (clojure.core/get-in letvar2088452 ["creationDate"]))}))))

(clojure.core/defn- response-describe-execution-output ([input] (response-describe-execution-output nil input)) ([resultWrapper2088454 input] (clojure.core/let [rawinput2088453 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088455 {"executionArn" (rawinput2088453 "executionArn"), "stateMachineArn" (rawinput2088453 "stateMachineArn"), "name" (rawinput2088453 "name"), "status" (rawinput2088453 "status"), "startDate" (rawinput2088453 "startDate"), "stopDate" (rawinput2088453 "stopDate"), "input" (rawinput2088453 "input"), "output" (rawinput2088453 "output")}] (clojure.core/cond-> {:execution-arn (deser-arn (clojure.core/get-in letvar2088455 ["executionArn"])), :state-machine-arn (deser-arn (clojure.core/get-in letvar2088455 ["stateMachineArn"])), :status (deser-execution-status (clojure.core/get-in letvar2088455 ["status"])), :start-date (deser-timestamp (clojure.core/get-in letvar2088455 ["startDate"])), :input (deser-sensitive-data (clojure.core/get-in letvar2088455 ["input"]))} (letvar2088455 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar2088455 ["name"]))) (letvar2088455 "stopDate") (clojure.core/assoc :stop-date (deser-timestamp (clojure.core/get-in letvar2088455 ["stopDate"]))) (letvar2088455 "output") (clojure.core/assoc :output (deser-sensitive-data (clojure.core/get-in letvar2088455 ["output"])))))))

(clojure.core/defn- response-state-machine-does-not-exist ([input] (response-state-machine-does-not-exist nil input)) ([resultWrapper2088457 input] (clojure.core/let [rawinput2088456 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088458 {"message" (rawinput2088456 "message")}] (clojure.core/cond-> {} (letvar2088458 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088458 ["message"])))))))

(clojure.core/defn- response-update-state-machine-output ([input] (response-update-state-machine-output nil input)) ([resultWrapper2088460 input] (clojure.core/let [rawinput2088459 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088461 {"updateDate" (rawinput2088459 "updateDate")}] (clojure.core/cond-> {:update-date (deser-timestamp (clojure.core/get-in letvar2088461 ["updateDate"]))}))))

(clojure.core/defn- response-activity-worker-limit-exceeded ([input] (response-activity-worker-limit-exceeded nil input)) ([resultWrapper2088463 input] (clojure.core/let [rawinput2088462 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088464 {"message" (rawinput2088462 "message")}] (clojure.core/cond-> {} (letvar2088464 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088464 ["message"])))))))

(clojure.core/defn- response-activity-does-not-exist ([input] (response-activity-does-not-exist nil input)) ([resultWrapper2088466 input] (clojure.core/let [rawinput2088465 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088467 {"message" (rawinput2088465 "message")}] (clojure.core/cond-> {} (letvar2088467 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088467 ["message"])))))))

(clojure.core/defn- response-send-task-success-output ([input] (response-send-task-success-output nil input)) ([resultWrapper2088469 input] (clojure.core/let [rawinput2088468 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088470 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-execution-history-output ([input] (response-get-execution-history-output nil input)) ([resultWrapper2088472 input] (clojure.core/let [rawinput2088471 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088473 {"events" (rawinput2088471 "events"), "nextToken" (rawinput2088471 "nextToken")}] (clojure.core/cond-> {:events (deser-history-event-list (clojure.core/get-in letvar2088473 ["events"]))} (letvar2088473 "nextToken") (clojure.core/assoc :next-token (deser-page-token (clojure.core/get-in letvar2088473 ["nextToken"])))))))

(clojure.core/defn- response-list-tags-for-resource-output ([input] (response-list-tags-for-resource-output nil input)) ([resultWrapper2088475 input] (clojure.core/let [rawinput2088474 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088476 {"tags" (rawinput2088474 "tags")}] (clojure.core/cond-> {} (letvar2088476 "tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar2088476 ["tags"])))))))

(clojure.core/defn- response-invalid-name ([input] (response-invalid-name nil input)) ([resultWrapper2088478 input] (clojure.core/let [rawinput2088477 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088479 {"message" (rawinput2088477 "message")}] (clojure.core/cond-> {} (letvar2088479 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088479 ["message"])))))))

(clojure.core/defn- response-list-activities-output ([input] (response-list-activities-output nil input)) ([resultWrapper2088481 input] (clojure.core/let [rawinput2088480 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088482 {"activities" (rawinput2088480 "activities"), "nextToken" (rawinput2088480 "nextToken")}] (clojure.core/cond-> {:activities (deser-activity-list (clojure.core/get-in letvar2088482 ["activities"]))} (letvar2088482 "nextToken") (clojure.core/assoc :next-token (deser-page-token (clojure.core/get-in letvar2088482 ["nextToken"])))))))

(clojure.core/defn- response-invalid-definition ([input] (response-invalid-definition nil input)) ([resultWrapper2088484 input] (clojure.core/let [rawinput2088483 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088485 {"message" (rawinput2088483 "message")}] (clojure.core/cond-> {} (letvar2088485 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088485 ["message"])))))))

(clojure.core/defn- response-missing-required-parameter ([input] (response-missing-required-parameter nil input)) ([resultWrapper2088487 input] (clojure.core/let [rawinput2088486 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088488 {"message" (rawinput2088486 "message")}] (clojure.core/cond-> {} (letvar2088488 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088488 ["message"])))))))

(clojure.core/defn- response-activity-limit-exceeded ([input] (response-activity-limit-exceeded nil input)) ([resultWrapper2088490 input] (clojure.core/let [rawinput2088489 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088491 {"message" (rawinput2088489 "message")}] (clojure.core/cond-> {} (letvar2088491 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088491 ["message"])))))))

(clojure.core/defn- response-send-task-heartbeat-output ([input] (response-send-task-heartbeat-output nil input)) ([resultWrapper2088493 input] (clojure.core/let [rawinput2088492 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088494 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-task-failure-output ([input] (response-send-task-failure-output nil input)) ([resultWrapper2088496 input] (clojure.core/let [rawinput2088495 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088497 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-untag-resource-output ([input] (response-untag-resource-output nil input)) ([resultWrapper2088499 input] (clojure.core/let [rawinput2088498 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088500 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-execution-does-not-exist ([input] (response-execution-does-not-exist nil input)) ([resultWrapper2088502 input] (clojure.core/let [rawinput2088501 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088503 {"message" (rawinput2088501 "message")}] (clojure.core/cond-> {} (letvar2088503 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088503 ["message"])))))))

(clojure.core/defn- response-resource-not-found ([input] (response-resource-not-found nil input)) ([resultWrapper2088505 input] (clojure.core/let [rawinput2088504 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088506 {"message" (rawinput2088504 "message"), "resourceName" (rawinput2088504 "resourceName")}] (clojure.core/cond-> {} (letvar2088506 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088506 ["message"]))) (letvar2088506 "resourceName") (clojure.core/assoc :resource-name (deser-arn (clojure.core/get-in letvar2088506 ["resourceName"])))))))

(clojure.core/defn- response-invalid-token ([input] (response-invalid-token nil input)) ([resultWrapper2088508 input] (clojure.core/let [rawinput2088507 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088509 {"message" (rawinput2088507 "message")}] (clojure.core/cond-> {} (letvar2088509 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088509 ["message"])))))))

(clojure.core/defn- response-delete-state-machine-output ([input] (response-delete-state-machine-output nil input)) ([resultWrapper2088511 input] (clojure.core/let [rawinput2088510 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088512 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-activity-output ([input] (response-describe-activity-output nil input)) ([resultWrapper2088514 input] (clojure.core/let [rawinput2088513 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088515 {"activityArn" (rawinput2088513 "activityArn"), "name" (rawinput2088513 "name"), "creationDate" (rawinput2088513 "creationDate")}] (clojure.core/cond-> {:activity-arn (deser-arn (clojure.core/get-in letvar2088515 ["activityArn"])), :name (deser-name (clojure.core/get-in letvar2088515 ["name"])), :creation-date (deser-timestamp (clojure.core/get-in letvar2088515 ["creationDate"]))}))))

(clojure.core/defn- response-get-activity-task-output ([input] (response-get-activity-task-output nil input)) ([resultWrapper2088517 input] (clojure.core/let [rawinput2088516 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088518 {"taskToken" (rawinput2088516 "taskToken"), "input" (rawinput2088516 "input")}] (clojure.core/cond-> {} (letvar2088518 "taskToken") (clojure.core/assoc :task-token (deser-task-token (clojure.core/get-in letvar2088518 ["taskToken"]))) (letvar2088518 "input") (clojure.core/assoc :input (deser-sensitive-data-job-input (clojure.core/get-in letvar2088518 ["input"])))))))

(clojure.core/defn- response-task-timed-out ([input] (response-task-timed-out nil input)) ([resultWrapper2088520 input] (clojure.core/let [rawinput2088519 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088521 {"message" (rawinput2088519 "message")}] (clojure.core/cond-> {} (letvar2088521 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088521 ["message"])))))))

(clojure.core/defn- response-task-does-not-exist ([input] (response-task-does-not-exist nil input)) ([resultWrapper2088523 input] (clojure.core/let [rawinput2088522 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088524 {"message" (rawinput2088522 "message")}] (clojure.core/cond-> {} (letvar2088524 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088524 ["message"])))))))

(clojure.core/defn- response-state-machine-deleting ([input] (response-state-machine-deleting nil input)) ([resultWrapper2088526 input] (clojure.core/let [rawinput2088525 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088527 {"message" (rawinput2088525 "message")}] (clojure.core/cond-> {} (letvar2088527 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2088527 ["message"])))))))

(clojure.core/defn- response-describe-state-machine-for-execution-output ([input] (response-describe-state-machine-for-execution-output nil input)) ([resultWrapper2088529 input] (clojure.core/let [rawinput2088528 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2088530 {"stateMachineArn" (rawinput2088528 "stateMachineArn"), "name" (rawinput2088528 "name"), "definition" (rawinput2088528 "definition"), "roleArn" (rawinput2088528 "roleArn"), "updateDate" (rawinput2088528 "updateDate")}] (clojure.core/cond-> {:state-machine-arn (deser-arn (clojure.core/get-in letvar2088530 ["stateMachineArn"])), :name (deser-name (clojure.core/get-in letvar2088530 ["name"])), :definition (deser-definition (clojure.core/get-in letvar2088530 ["definition"])), :role-arn (deser-arn (clojure.core/get-in letvar2088530 ["roleArn"])), :update-date (deser-timestamp (clojure.core/get-in letvar2088530 ["updateDate"]))}))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/connector-parameters (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-already-exists/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/sensitive-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/timeout-in-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-start-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-start-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-start-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-start-failed-event-details/error :portkey.aws.states.-2016-11-23.lambda-function-start-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-submit-failed-event-details/resource-type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-submit-failed-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-submit-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-submit-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-submit-failed-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.task-submit-failed-event-details/resource-type :portkey.aws.states.-2016-11-23.task-submit-failed-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.task-submit-failed-event-details/error :portkey.aws.states.-2016-11-23.task-submit-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/status (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/state-machine-status))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/definition (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/definition))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-output/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-state-machine-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.describe-state-machine-output/state-machine-arn :portkey.aws.states.-2016-11-23.describe-state-machine-output/name :portkey.aws.states.-2016-11-23.describe-state-machine-output/definition :portkey.aws.states.-2016-11-23.describe-state-machine-output/role-arn :portkey.aws.states.-2016-11-23.describe-state-machine-output/creation-date] :opt-un [:portkey.aws.states.-2016-11-23.describe-state-machine-output/status]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-succeeded-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-succeeded-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/sensitive-error (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-already-exists/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.state-machine-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-timed-out-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-timed-out-event-details/error :portkey.aws.states.-2016-11-23.execution-timed-out-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-aborted-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-aborted-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-aborted-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-aborted-event-details/error :portkey.aws.states.-2016-11-23.execution-aborted-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-started-event-details/worker-name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/identity))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-started-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-started-event-details/worker-name]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/page-size (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-input/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-input/definition (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/definition))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-input/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-input/tags (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/tag-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/create-state-machine-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.create-state-machine-input/name :portkey.aws.states.-2016-11-23.create-state-machine-input/definition :portkey.aws.states.-2016-11-23.create-state-machine-input/role-arn] :opt-un [:portkey.aws.states.-2016-11-23.create-state-machine-input/tags]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.stop-execution-output/stop-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/stop-execution-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.stop-execution-output/stop-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-failure-input/task-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-failure-input/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-failure-input/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-failure-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.send-task-failure-input/task-token] :opt-un [:portkey.aws.states.-2016-11-23.send-task-failure-input/error :portkey.aws.states.-2016-11-23.send-task-failure-input/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/heartbeat-in-seconds (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-scheduled-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.activity-scheduled-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.activity-scheduled-event-details/input :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/timeout-in-seconds :portkey.aws.states.-2016-11-23.activity-scheduled-event-details/heartbeat-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-state-machines-output/state-machines (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/state-machine-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-state-machines-output/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-state-machines-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.list-state-machines-output/state-machines] :opt-un [:portkey.aws.states.-2016-11-23.list-state-machines-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/tag-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-activities-input/max-results (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-size))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-activities-input/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-activities-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.list-activities-input/max-results :portkey.aws.states.-2016-11-23.list-activities-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-submitted-event-details/resource-type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-submitted-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-submitted-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-submitted-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.task-submitted-event-details/resource-type :portkey.aws.states.-2016-11-23.task-submitted-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.task-submitted-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-arn/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-arn (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-arn/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-timed-out-event-details/resource-type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-timed-out-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-timed-out-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.task-timed-out-event-details/resource-type :portkey.aws.states.-2016-11-23.task-timed-out-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.task-timed-out-event-details/error :portkey.aws.states.-2016-11-23.task-timed-out-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-entered-event-details/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-entered-event-details/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-entered-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.state-entered-event-details/name] :opt-un [:portkey.aws.states.-2016-11-23.state-entered-event-details/input]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/history-event-list (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/history-event))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-activity-input/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-activity-input/tags (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/tag-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/create-activity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.create-activity-input/name] :opt-un [:portkey.aws.states.-2016-11-23.create-activity-input/tags]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.tag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.tag-resource-input/tags (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/tag-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/tag-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.tag-resource-input/resource-arn :portkey.aws.states.-2016-11-23.tag-resource-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-status #{:deleting :active "DELETING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-output/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-output/start-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/start-execution-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.start-execution-output/execution-arn :portkey.aws.states.-2016-11-23.start-execution-output/start-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.state-machine-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-output/executions (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-output/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-executions-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.list-executions-output/executions] :opt-un [:portkey.aws.states.-2016-11-23.list-executions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-execution-input/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-execution-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-execution-input/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-state-machine-output/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/create-state-machine-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.create-state-machine-output/state-machine-arn :portkey.aws.states.-2016-11-23.create-state-machine-output/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.too-many-tags/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.too-many-tags/resource-name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/too-many-tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.too-many-tags/message :portkey.aws.states.-2016-11-23.too-many-tags/resource-name]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/sensitive-data-job-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/delete-activity-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-activity-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-activity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.describe-activity-input/activity-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-started-event-details/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-started-event-details/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-started-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-started-event-details/input :portkey.aws.states.-2016-11-23.execution-started-event-details/role-arn]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-output/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-output/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/tag-list (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/tag))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-timed-out-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-timed-out-event-details/error :portkey.aws.states.-2016-11-23.activity-timed-out-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/tag-key))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-list (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/activity-list-item))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-input/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.start-execution-input/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/start-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.start-execution-input/state-machine-arn] :opt-un [:portkey.aws.states.-2016-11-23.start-execution-input/name :portkey.aws.states.-2016-11-23.start-execution-input/input]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.describe-execution-input/execution-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-input/execution-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.delete-activity-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/delete-activity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.delete-activity-input/activity-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-tags-for-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-tags-for-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.list-tags-for-resource-input/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-activity-output/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.create-activity-output/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/create-activity-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.create-activity-output/activity-arn :portkey.aws.states.-2016-11-23.create-activity-output/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/status (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/start-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/stop-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-execution-output/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-execution-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.describe-execution-output/execution-arn :portkey.aws.states.-2016-11-23.describe-execution-output/state-machine-arn :portkey.aws.states.-2016-11-23.describe-execution-output/status :portkey.aws.states.-2016-11-23.describe-execution-output/start-date :portkey.aws.states.-2016-11-23.describe-execution-output/input] :opt-un [:portkey.aws.states.-2016-11-23.describe-execution-output/name :portkey.aws.states.-2016-11-23.describe-execution-output/stop-date :portkey.aws.states.-2016-11-23.describe-execution-output/output]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-schedule-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-schedule-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-schedule-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-schedule-failed-event-details/error :portkey.aws.states.-2016-11-23.activity-schedule-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.state-machine-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.delete-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/delete-state-machine-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.delete-state-machine-input/state-machine-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.untag-resource-input/resource-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.untag-resource-input/tag-keys (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/untag-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.untag-resource-input/resource-arn :portkey.aws.states.-2016-11-23.untag-resource-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-scheduled-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/input :portkey.aws.states.-2016-11-23.lambda-function-scheduled-event-details/timeout-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-exited-event-details/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-exited-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-exited-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.state-exited-event-details/name] :opt-un [:portkey.aws.states.-2016-11-23.state-exited-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-failed-event-details/error :portkey.aws.states.-2016-11-23.execution-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.update-state-machine-output/update-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/update-state-machine-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.update-state-machine-output/update-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-succeeded-event-details/resource-type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-succeeded-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-succeeded-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.task-succeeded-event-details/resource-type :portkey.aws.states.-2016-11-23.task-succeeded-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.task-succeeded-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-failed-event-details/error :portkey.aws.states.-2016-11-23.activity-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/identity (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-worker-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-worker-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-worker-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-success-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/definition (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1048576))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-output/events (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/history-event-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-output/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/get-execution-history-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.get-execution-history-output/events] :opt-un [:portkey.aws.states.-2016-11-23.get-execution-history-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-tags-for-resource-output/tags (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/tag-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-tags-for-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.list-tags-for-resource-output/tags]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-schedule-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-schedule-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-schedule-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-schedule-failed-event-details/error :portkey.aws.states.-2016-11-23.lambda-function-schedule-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-input/max-results (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-size))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-input/reverse-order (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/reverse-order))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-execution-history-input/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/get-execution-history-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.get-execution-history-input/execution-arn] :opt-un [:portkey.aws.states.-2016-11-23.get-execution-history-input/max-results :portkey.aws.states.-2016-11-23.get-execution-history-input/reverse-order :portkey.aws.states.-2016-11-23.get-execution-history-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.stop-execution-input/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.stop-execution-input/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.stop-execution-input/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/stop-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.stop-execution-input/execution-arn] :opt-un [:portkey.aws.states.-2016-11-23.stop-execution-input/error :portkey.aws.states.-2016-11-23.stop-execution-input/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-name/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-name (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-name/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-activities-output/activities (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-list))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-activities-output/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-activities-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.list-activities-output/activities] :opt-un [:portkey.aws.states.-2016-11-23.list-activities-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-status #{:timed-out "TIMED_OUT" :aborted :running "SUCCEEDED" "FAILED" "ABORTED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.update-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.update-state-machine-input/definition (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/definition))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.update-state-machine-input/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/update-state-machine-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.update-state-machine-input/state-machine-arn] :opt-un [:portkey.aws.states.-2016-11-23.update-state-machine-input/definition :portkey.aws.states.-2016-11-23.update-state-machine-input/role-arn]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-definition/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-definition/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.missing-required-parameter/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/missing-required-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.missing-required-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.tag/key (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/tag-key))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.tag/value (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/tag-value))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.tag/key :portkey.aws.states.-2016-11-23.tag/value]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.activity-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-heartbeat-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-list-item/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-list-item/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-list-item/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-list-item (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.state-machine-list-item/state-machine-arn :portkey.aws.states.-2016-11-23.state-machine-list-item/name :portkey.aws.states.-2016-11-23.state-machine-list-item/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-failure-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/event-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/sensitive-cause (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/untag-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-started-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-started-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-aborted-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-aborted-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-started-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-started-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/task-submit-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-submit-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-scheduled-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-scheduled-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-schedule-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-schedule-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/id (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/event-id))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/timestamp (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/task-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/previous-event-id (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/event-id))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/state-exited-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/state-exited-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-schedule-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-schedule-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/execution-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/task-submitted-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-submitted-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-succeeded-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-succeeded-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/task-scheduled-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-scheduled-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-scheduled-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-scheduled-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/state-entered-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/state-entered-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/history-event-type))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/task-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/task-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/task-started-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-started-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/task-start-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-start-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/lambda-function-start-failed-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/lambda-function-start-failed-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.history-event/activity-timed-out-event-details (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/activity-timed-out-event-details))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/history-event (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.history-event/timestamp :portkey.aws.states.-2016-11-23.history-event/type :portkey.aws.states.-2016-11-23.history-event/id] :opt-un [:portkey.aws.states.-2016-11-23.history-event/activity-started-event-details :portkey.aws.states.-2016-11-23.history-event/execution-aborted-event-details :portkey.aws.states.-2016-11-23.history-event/lambda-function-timed-out-event-details :portkey.aws.states.-2016-11-23.history-event/lambda-function-failed-event-details :portkey.aws.states.-2016-11-23.history-event/execution-started-event-details :portkey.aws.states.-2016-11-23.history-event/task-submit-failed-event-details :portkey.aws.states.-2016-11-23.history-event/lambda-function-scheduled-event-details :portkey.aws.states.-2016-11-23.history-event/activity-succeeded-event-details :portkey.aws.states.-2016-11-23.history-event/lambda-function-schedule-failed-event-details :portkey.aws.states.-2016-11-23.history-event/execution-timed-out-event-details :portkey.aws.states.-2016-11-23.history-event/task-succeeded-event-details :portkey.aws.states.-2016-11-23.history-event/previous-event-id :portkey.aws.states.-2016-11-23.history-event/execution-failed-event-details :portkey.aws.states.-2016-11-23.history-event/state-exited-event-details :portkey.aws.states.-2016-11-23.history-event/activity-schedule-failed-event-details :portkey.aws.states.-2016-11-23.history-event/execution-succeeded-event-details :portkey.aws.states.-2016-11-23.history-event/activity-failed-event-details :portkey.aws.states.-2016-11-23.history-event/task-submitted-event-details :portkey.aws.states.-2016-11-23.history-event/lambda-function-succeeded-event-details :portkey.aws.states.-2016-11-23.history-event/task-scheduled-event-details :portkey.aws.states.-2016-11-23.history-event/activity-scheduled-event-details :portkey.aws.states.-2016-11-23.history-event/state-entered-event-details :portkey.aws.states.-2016-11-23.history-event/task-timed-out-event-details :portkey.aws.states.-2016-11-23.history-event/task-failed-event-details :portkey.aws.states.-2016-11-23.history-event/task-started-event-details :portkey.aws.states.-2016-11-23.history-event/task-start-failed-event-details :portkey.aws.states.-2016-11-23.history-event/lambda-function-start-failed-event-details :portkey.aws.states.-2016-11-23.history-event/activity-timed-out-event-details]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-start-failed-event-details/resource-type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-start-failed-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-start-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-start-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-start-failed-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.task-start-failed-event-details/resource-type :portkey.aws.states.-2016-11-23.task-start-failed-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.task-start-failed-event-details/error :portkey.aws.states.-2016-11-23.task-start-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.resource-not-found/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.resource-not-found/resource-name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/resource-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.resource-not-found/message :portkey.aws.states.-2016-11-23.resource-not-found/resource-name]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.invalid-token/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/invalid-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.invalid-token/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-list (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/execution-list-item))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/delete-state-machine-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-activity-output/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-activity-output/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-activity-output/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-activity-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.describe-activity-output/activity-arn :portkey.aws.states.-2016-11-23.describe-activity-output/name :portkey.aws.states.-2016-11-23.describe-activity-output/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/reverse-order clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-heartbeat-input/task-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-heartbeat-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.send-task-heartbeat-input/task-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-state-machine-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.describe-state-machine-input/state-machine-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-list-item/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-list-item/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.activity-list-item/creation-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/activity-list-item (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.activity-list-item/activity-arn :portkey.aws.states.-2016-11-23.activity-list-item/name :portkey.aws.states.-2016-11-23.activity-list-item/creation-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-succeeded-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-succeeded-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/history-event-type #{"LambdaFunctionStartFailed" :lambda-function-timed-out :execution-succeeded :wait-state-entered "TaskSubmitted" :task-scheduled "LambdaFunctionSucceeded" "ActivityTimedOut" "WaitStateAborted" :wait-state-aborted :task-submit-failed "SucceedStateEntered" :activity-started "ActivityScheduled" "ParallelStateAborted" :pass-state-exited :execution-timed-out "ParallelStateSucceeded" :task-timed-out :fail-state-entered :execution-failed :activity-timed-out :choice-state-entered :task-succeeded :parallel-state-exited "ExecutionTimedOut" "ChoiceStateExited" :task-state-exited :succeed-state-exited :task-submitted "TaskSubmitFailed" :activity-scheduled "ExecutionFailed" "TaskSucceeded" :lambda-function-schedule-failed "ActivityFailed" :parallel-state-started :execution-started "ChoiceStateEntered" "LambdaFunctionScheduled" "TaskScheduled" :lambda-function-start-failed :parallel-state-aborted :parallel-state-succeeded "TaskStarted" :pass-state-entered "FailStateEntered" "WaitStateExited" :lambda-function-failed "ActivityScheduleFailed" :wait-state-exited "SucceedStateExited" :parallel-state-entered "TaskStateEntered" "PassStateExited" "LambdaFunctionFailed" "PassStateEntered" "TaskFailed" "TaskStartFailed" :activity-succeeded :parallel-state-failed :activity-schedule-failed "LambdaFunctionTimedOut" "ParallelStateFailed" "ActivitySucceeded" :execution-aborted "LambdaFunctionStarted" :lambda-function-succeeded "ExecutionSucceeded" :task-start-failed :lambda-function-started "ActivityStarted" :choice-state-exited :task-state-aborted :task-started "WaitStateEntered" "ParallelStateEntered" "ExecutionStarted" "ExecutionAborted" :activity-failed "ParallelStateStarted" "LambdaFunctionScheduleFailed" :task-failed "ParallelStateExited" "TaskStateAborted" "TaskTimedOut" :lambda-function-scheduled :task-state-entered :succeed-state-entered "TaskStateExited"})

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-input/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-input/status-filter (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-input/max-results (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-size))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-executions-input/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-executions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.list-executions-input/state-machine-arn] :opt-un [:portkey.aws.states.-2016-11-23.list-executions-input/status-filter :portkey.aws.states.-2016-11-23.list-executions-input/max-results :portkey.aws.states.-2016-11-23.list-executions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-activity-task-output/task-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-activity-task-output/input (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data-job-input))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/get-activity-task-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.get-activity-task-output/task-token :portkey.aws.states.-2016-11-23.get-activity-task-output/input]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/page-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-timed-out/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-timed-out (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.task-timed-out/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-started-event-details/resource-type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-started-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-started-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.task-started-event-details/resource-type :portkey.aws.states.-2016-11-23.task-started-event-details/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-timed-out-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-timed-out-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-timed-out-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-timed-out-event-details/error :portkey.aws.states.-2016-11-23.lambda-function-timed-out-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-succeeded-event-details/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-succeeded-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.execution-succeeded-event-details/output]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.task-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-success-input/task-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/task-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.send-task-success-input/output (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-data))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/send-task-success-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.send-task-success-input/task-token :portkey.aws.states.-2016-11-23.send-task-success-input/output] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-scheduled-event-details/resource-type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-scheduled-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-scheduled-event-details/region (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-scheduled-event-details/parameters (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/connector-parameters))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-scheduled-event-details/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timeout-in-seconds))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-scheduled-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.task-scheduled-event-details/resource-type :portkey.aws.states.-2016-11-23.task-scheduled-event-details/resource :portkey.aws.states.-2016-11-23.task-scheduled-event-details/region :portkey.aws.states.-2016-11-23.task-scheduled-event-details/parameters] :opt-un [:portkey.aws.states.-2016-11-23.task-scheduled-event-details/timeout-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-activity-task-input/activity-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.get-activity-task-input/worker-name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/get-activity-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.get-activity-task-input/activity-arn] :opt-un [:portkey.aws.states.-2016-11-23.get-activity-task-input/worker-name]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.lambda-function-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/lambda-function-failed-event-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.lambda-function-failed-event-details/error :portkey.aws.states.-2016-11-23.lambda-function-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-failed-event-details/resource-type (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-failed-event-details/resource (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-failed-event-details/error (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-error))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.task-failed-event-details/cause (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/sensitive-cause))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/task-failed-event-details (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.task-failed-event-details/resource-type :portkey.aws.states.-2016-11-23.task-failed-event-details/resource] :opt-un [:portkey.aws.states.-2016-11-23.task-failed-event-details/error :portkey.aws.states.-2016-11-23.task-failed-event-details/cause]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-list (clojure.spec.alpha/coll-of :portkey.aws.states.-2016-11-23/state-machine-list-item))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.state-machine-deleting/message (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/error-message))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/state-machine-deleting (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.state-machine-deleting/message]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/execution-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/status (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/execution-status))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/start-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.execution-list-item/stop-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/execution-list-item (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.execution-list-item/execution-arn :portkey.aws.states.-2016-11-23.execution-list-item/state-machine-arn :portkey.aws.states.-2016-11-23.execution-list-item/name :portkey.aws.states.-2016-11-23.execution-list-item/status :portkey.aws.states.-2016-11-23.execution-list-item/start-date] :opt-un [:portkey.aws.states.-2016-11-23.execution-list-item/stop-date]))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/state-machine-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/name (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/name))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/definition (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/definition))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/role-arn (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/arn))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/update-date (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/timestamp))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-output (clojure.spec.alpha/keys :req-un [:portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/state-machine-arn :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/name :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/definition :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/role-arn :portkey.aws.states.-2016-11-23.describe-state-machine-for-execution-output/update-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-state-machines-input/max-results (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-size))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23.list-state-machines-input/next-token (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/page-token))
(clojure.spec.alpha/def :portkey.aws.states.-2016-11-23/list-state-machines-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.states.-2016-11-23.list-state-machines-input/max-results :portkey.aws.states.-2016-11-23.list-state-machines-input/next-token]))

(clojure.core/defn tag-resource ([tag-resource-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-resource-input tag-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/tag-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/tag-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "ResourceNotFound" :portkey.aws.states.-2016-11-23/resource-not-found, "TooManyTags" :portkey.aws.states.-2016-11-23/too-many-tags}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/tag-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/tag-resource-output))

(clojure.core/defn stop-execution ([stop-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-stop-execution-input stop-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/stop-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/stop-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopExecution", :http.request.configuration/output-deser-fn response-stop-execution-output, :http.request.spec/error-spec {"ExecutionDoesNotExist" :portkey.aws.states.-2016-11-23/execution-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn}})))))
(clojure.spec.alpha/fdef stop-execution :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/stop-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/stop-execution-output))

(clojure.core/defn update-state-machine ([update-state-machine-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-state-machine-input update-state-machine-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/update-state-machine-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/update-state-machine-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStateMachine", :http.request.configuration/output-deser-fn response-update-state-machine-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidDefinition" :portkey.aws.states.-2016-11-23/invalid-definition, "MissingRequiredParameter" :portkey.aws.states.-2016-11-23/missing-required-parameter, "StateMachineDeleting" :portkey.aws.states.-2016-11-23/state-machine-deleting, "StateMachineDoesNotExist" :portkey.aws.states.-2016-11-23/state-machine-does-not-exist}})))))
(clojure.spec.alpha/fdef update-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/update-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/update-state-machine-output))

(clojure.core/defn get-activity-task ([get-activity-task-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-activity-task-input get-activity-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/get-activity-task-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/get-activity-task-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetActivityTask", :http.request.configuration/output-deser-fn response-get-activity-task-output, :http.request.spec/error-spec {"ActivityDoesNotExist" :portkey.aws.states.-2016-11-23/activity-does-not-exist, "ActivityWorkerLimitExceeded" :portkey.aws.states.-2016-11-23/activity-worker-limit-exceeded, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn}})))))
(clojure.spec.alpha/fdef get-activity-task :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/get-activity-task-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/get-activity-task-output))

(clojure.core/defn list-executions ([list-executions-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-executions-input list-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/list-executions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/list-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListExecutions", :http.request.configuration/output-deser-fn response-list-executions-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token, "StateMachineDoesNotExist" :portkey.aws.states.-2016-11-23/state-machine-does-not-exist}})))))
(clojure.spec.alpha/fdef list-executions :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/list-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/list-executions-output))

(clojure.core/defn describe-execution ([describe-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-execution-input describe-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/describe-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/describe-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeExecution", :http.request.configuration/output-deser-fn response-describe-execution-output, :http.request.spec/error-spec {"ExecutionDoesNotExist" :portkey.aws.states.-2016-11-23/execution-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn}})))))
(clojure.spec.alpha/fdef describe-execution :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/describe-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/describe-execution-output))

(clojure.core/defn start-execution ([start-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-execution-input start-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/start-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/start-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartExecution", :http.request.configuration/output-deser-fn response-start-execution-output, :http.request.spec/error-spec {"ExecutionLimitExceeded" :portkey.aws.states.-2016-11-23/execution-limit-exceeded, "ExecutionAlreadyExists" :portkey.aws.states.-2016-11-23/execution-already-exists, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidExecutionInput" :portkey.aws.states.-2016-11-23/invalid-execution-input, "InvalidName" :portkey.aws.states.-2016-11-23/invalid-name, "StateMachineDoesNotExist" :portkey.aws.states.-2016-11-23/state-machine-does-not-exist, "StateMachineDeleting" :portkey.aws.states.-2016-11-23/state-machine-deleting}})))))
(clojure.spec.alpha/fdef start-execution :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/start-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/start-execution-output))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-for-resource-input list-tags-for-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/list-tags-for-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/list-tags-for-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "ResourceNotFound" :portkey.aws.states.-2016-11-23/resource-not-found}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/list-tags-for-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/list-tags-for-resource-output))

(clojure.core/defn delete-activity ([delete-activity-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-activity-input delete-activity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/delete-activity-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/delete-activity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteActivity", :http.request.configuration/output-deser-fn response-delete-activity-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn}})))))
(clojure.spec.alpha/fdef delete-activity :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/delete-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/delete-activity-output))

(clojure.core/defn describe-state-machine-for-execution ([describe-state-machine-for-execution-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-state-machine-for-execution-input describe-state-machine-for-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStateMachineForExecution", :http.request.configuration/output-deser-fn response-describe-state-machine-for-execution-output, :http.request.spec/error-spec {"ExecutionDoesNotExist" :portkey.aws.states.-2016-11-23/execution-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn}})))))
(clojure.spec.alpha/fdef describe-state-machine-for-execution :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/describe-state-machine-for-execution-output))

(clojure.core/defn describe-activity ([describe-activity-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-activity-input describe-activity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/describe-activity-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/describe-activity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeActivity", :http.request.configuration/output-deser-fn response-describe-activity-output, :http.request.spec/error-spec {"ActivityDoesNotExist" :portkey.aws.states.-2016-11-23/activity-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn}})))))
(clojure.spec.alpha/fdef describe-activity :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/describe-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/describe-activity-output))

(clojure.core/defn describe-state-machine ([describe-state-machine-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-state-machine-input describe-state-machine-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/describe-state-machine-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/describe-state-machine-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStateMachine", :http.request.configuration/output-deser-fn response-describe-state-machine-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "StateMachineDoesNotExist" :portkey.aws.states.-2016-11-23/state-machine-does-not-exist}})))))
(clojure.spec.alpha/fdef describe-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/describe-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/describe-state-machine-output))

(clojure.core/defn send-task-heartbeat ([send-task-heartbeat-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-send-task-heartbeat-input send-task-heartbeat-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/send-task-heartbeat-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/send-task-heartbeat-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SendTaskHeartbeat", :http.request.configuration/output-deser-fn response-send-task-heartbeat-output, :http.request.spec/error-spec {"TaskDoesNotExist" :portkey.aws.states.-2016-11-23/task-does-not-exist, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token, "TaskTimedOut" :portkey.aws.states.-2016-11-23/task-timed-out}})))))
(clojure.spec.alpha/fdef send-task-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/send-task-heartbeat-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/send-task-heartbeat-output))

(clojure.core/defn send-task-failure ([send-task-failure-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-send-task-failure-input send-task-failure-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/send-task-failure-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/send-task-failure-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SendTaskFailure", :http.request.configuration/output-deser-fn response-send-task-failure-output, :http.request.spec/error-spec {"TaskDoesNotExist" :portkey.aws.states.-2016-11-23/task-does-not-exist, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token, "TaskTimedOut" :portkey.aws.states.-2016-11-23/task-timed-out}})))))
(clojure.spec.alpha/fdef send-task-failure :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/send-task-failure-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/send-task-failure-output))

(clojure.core/defn create-state-machine ([create-state-machine-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-state-machine-input create-state-machine-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/create-state-machine-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/create-state-machine-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStateMachine", :http.request.configuration/output-deser-fn response-create-state-machine-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidDefinition" :portkey.aws.states.-2016-11-23/invalid-definition, "InvalidName" :portkey.aws.states.-2016-11-23/invalid-name, "StateMachineAlreadyExists" :portkey.aws.states.-2016-11-23/state-machine-already-exists, "StateMachineDeleting" :portkey.aws.states.-2016-11-23/state-machine-deleting, "StateMachineLimitExceeded" :portkey.aws.states.-2016-11-23/state-machine-limit-exceeded, "TooManyTags" :portkey.aws.states.-2016-11-23/too-many-tags}})))))
(clojure.spec.alpha/fdef create-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/create-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/create-state-machine-output))

(clojure.core/defn send-task-success ([send-task-success-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-send-task-success-input send-task-success-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/send-task-success-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/send-task-success-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SendTaskSuccess", :http.request.configuration/output-deser-fn response-send-task-success-output, :http.request.spec/error-spec {"TaskDoesNotExist" :portkey.aws.states.-2016-11-23/task-does-not-exist, "InvalidOutput" :portkey.aws.states.-2016-11-23/invalid-output, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token, "TaskTimedOut" :portkey.aws.states.-2016-11-23/task-timed-out}})))))
(clojure.spec.alpha/fdef send-task-success :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/send-task-success-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/send-task-success-output))

(clojure.core/defn create-activity ([create-activity-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-activity-input create-activity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/create-activity-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/create-activity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateActivity", :http.request.configuration/output-deser-fn response-create-activity-output, :http.request.spec/error-spec {"ActivityLimitExceeded" :portkey.aws.states.-2016-11-23/activity-limit-exceeded, "InvalidName" :portkey.aws.states.-2016-11-23/invalid-name, "TooManyTags" :portkey.aws.states.-2016-11-23/too-many-tags}})))))
(clojure.spec.alpha/fdef create-activity :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/create-activity-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/create-activity-output))

(clojure.core/defn untag-resource ([untag-resource-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-resource-input untag-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/untag-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/untag-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "ResourceNotFound" :portkey.aws.states.-2016-11-23/resource-not-found}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/untag-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/untag-resource-output))

(clojure.core/defn get-execution-history ([get-execution-history-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-execution-history-input get-execution-history-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/get-execution-history-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/get-execution-history-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetExecutionHistory", :http.request.configuration/output-deser-fn response-get-execution-history-output, :http.request.spec/error-spec {"ExecutionDoesNotExist" :portkey.aws.states.-2016-11-23/execution-does-not-exist, "InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn, "InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token}})))))
(clojure.spec.alpha/fdef get-execution-history :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/get-execution-history-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/get-execution-history-output))

(clojure.core/defn list-state-machines ([] (list-state-machines {})) ([list-state-machines-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-state-machines-input list-state-machines-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/list-state-machines-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/list-state-machines-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStateMachines", :http.request.configuration/output-deser-fn response-list-state-machines-output, :http.request.spec/error-spec {"InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token}})))))
(clojure.spec.alpha/fdef list-state-machines :args (clojure.spec.alpha/? :portkey.aws.states.-2016-11-23/list-state-machines-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/list-state-machines-output))

(clojure.core/defn list-activities ([] (list-activities {})) ([list-activities-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-activities-input list-activities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/list-activities-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/list-activities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListActivities", :http.request.configuration/output-deser-fn response-list-activities-output, :http.request.spec/error-spec {"InvalidToken" :portkey.aws.states.-2016-11-23/invalid-token}})))))
(clojure.spec.alpha/fdef list-activities :args (clojure.spec.alpha/? :portkey.aws.states.-2016-11-23/list-activities-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/list-activities-output))

(clojure.core/defn delete-state-machine ([delete-state-machine-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-state-machine-input delete-state-machine-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.states.-2016-11-23/endpoints, :http.request.configuration/target-prefix "AWSStepFunctions", :http.request.spec/output-spec :portkey.aws.states.-2016-11-23/delete-state-machine-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.0"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-23", :http.request.configuration/service-id "SFN", :http.request.spec/input-spec :portkey.aws.states.-2016-11-23/delete-state-machine-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStateMachine", :http.request.configuration/output-deser-fn response-delete-state-machine-output, :http.request.spec/error-spec {"InvalidArn" :portkey.aws.states.-2016-11-23/invalid-arn}})))))
(clojure.spec.alpha/fdef delete-state-machine :args (clojure.spec.alpha/tuple :portkey.aws.states.-2016-11-23/delete-state-machine-input) :ret (clojure.spec.alpha/and :portkey.aws.states.-2016-11-23/delete-state-machine-output))
