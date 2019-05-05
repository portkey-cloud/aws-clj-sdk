(ns portkey.aws.iot-jobs-data (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-expected-version)

(clojure.core/declare ser-execution-number)

(clojure.core/declare ser-include-job-document)

(clojure.core/declare ser-include-execution-state)

(clojure.core/declare ser-step-timeout-in-minutes)

(clojure.core/declare ser-details-value)

(clojure.core/declare ser-thing-name)

(clojure.core/declare ser-job-execution-status)

(clojure.core/declare ser-details-key)

(clojure.core/declare ser-describe-job-execution-job-id)

(clojure.core/declare ser-details-map)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-expected-version [input] #:http.request.field{:value input, :shape "ExpectedVersion"})

(clojure.core/defn- ser-execution-number [input] #:http.request.field{:value input, :shape "ExecutionNumber"})

(clojure.core/defn- ser-include-job-document [input] #:http.request.field{:value input, :shape "IncludeJobDocument"})

(clojure.core/defn- ser-include-execution-state [input] #:http.request.field{:value input, :shape "IncludeExecutionState"})

(clojure.core/defn- ser-step-timeout-in-minutes [input] #:http.request.field{:value input, :shape "StepTimeoutInMinutes"})

(clojure.core/defn- ser-details-value [input] #:http.request.field{:value input, :shape "DetailsValue"})

(clojure.core/defn- ser-thing-name [input] #:http.request.field{:value input, :shape "ThingName"})

(clojure.core/defn- ser-job-execution-status [input] #:http.request.field{:value (clojure.core/get {"CANCELED" "CANCELED", :timed-out "TIMED_OUT", "IN_PROGRESS" "IN_PROGRESS", "TIMED_OUT" "TIMED_OUT", :in-progress "IN_PROGRESS", :rejected "REJECTED", "REMOVED" "REMOVED", :queued "QUEUED", :canceled "CANCELED", "SUCCEEDED" "SUCCEEDED", "REJECTED" "REJECTED", "QUEUED" "QUEUED", "FAILED" "FAILED", :removed "REMOVED", :failed "FAILED", :succeeded "SUCCEEDED"} input), :shape "JobExecutionStatus"})

(clojure.core/defn- ser-details-key [input] #:http.request.field{:value input, :shape "DetailsKey"})

(clojure.core/defn- ser-describe-job-execution-job-id [input] #:http.request.field{:value input, :shape "DescribeJobExecutionJobId"})

(clojure.core/defn- ser-details-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-details-key k) #:http.request.field{:map-info "key", :shape "DetailsKey"}) (clojure.core/into (ser-details-value v) #:http.request.field{:map-info "value", :shape "DetailsValue"})])) input), :shape "DetailsMap", :type "map"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-start-next-pending-job-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :status-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-details-map (input :status-details)) #:http.request.field{:name "statusDetails", :shape "DetailsMap"})) (clojure.core/contains? input :step-timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-timeout-in-minutes (input :step-timeout-in-minutes)) #:http.request.field{:name "stepTimeoutInMinutes", :shape "StepTimeoutInMinutes"}))))

(clojure.core/defn- req-describe-job-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-describe-job-execution-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "DescribeJobExecutionJobId", :location "uri", :location-name "jobId"}) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :include-job-document) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-job-document (input :include-job-document)) #:http.request.field{:name "includeJobDocument", :shape "IncludeJobDocument", :location "querystring", :location-name "includeJobDocument"})) (clojure.core/contains? input :execution-number) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-number (input :execution-number)) #:http.request.field{:name "executionNumber", :shape "ExecutionNumber", :location "querystring", :location-name "executionNumber"}))))

(clojure.core/defn- req-get-pending-job-executions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]}))

(clojure.core/defn- req-update-job-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"}) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})], :body [(clojure.core/into (ser-job-execution-status (input :status)) #:http.request.field{:name "status", :shape "JobExecutionStatus"})]} (clojure.core/contains? input :step-timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-timeout-in-minutes (input :step-timeout-in-minutes)) #:http.request.field{:name "stepTimeoutInMinutes", :shape "StepTimeoutInMinutes"})) (clojure.core/contains? input :include-job-document) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-job-document (input :include-job-document)) #:http.request.field{:name "includeJobDocument", :shape "IncludeJobDocument"})) (clojure.core/contains? input :status-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-details-map (input :status-details)) #:http.request.field{:name "statusDetails", :shape "DetailsMap"})) (clojure.core/contains? input :execution-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-number (input :execution-number)) #:http.request.field{:name "executionNumber", :shape "ExecutionNumber"})) (clojure.core/contains? input :expected-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expected-version (input :expected-version)) #:http.request.field{:name "expectedVersion", :shape "ExpectedVersion"})) (clojure.core/contains? input :include-job-execution-state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-execution-state (input :include-job-execution-state)) #:http.request.field{:name "includeJobExecutionState", :shape "IncludeExecutionState"}))))

(clojure.core/declare deser-execution-number)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-job-execution-summary)

(clojure.core/declare deser-job-execution-summary-list)

(clojure.core/declare deser-last-updated-at)

(clojure.core/declare deser-job-document)

(clojure.core/declare deser-binary-blob)

(clojure.core/declare deser-queued-at)

(clojure.core/declare deser-job-execution-state)

(clojure.core/declare deser-details-value)

(clojure.core/declare deser-thing-name)

(clojure.core/declare deser-job-execution-status)

(clojure.core/declare deser-details-key)

(clojure.core/declare deser-version-number)

(clojure.core/declare deser-approximate-seconds-before-timed-out)

(clojure.core/declare deser-details-map)

(clojure.core/declare deser-job-execution)

(clojure.core/declare deser-started-at)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-execution-number [input] input)

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-job-execution-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "jobId") (clojure.core/assoc :job-id (deser-job-id (input "jobId"))) (clojure.core/contains? input "queuedAt") (clojure.core/assoc :queued-at (deser-queued-at (input "queuedAt"))) (clojure.core/contains? input "startedAt") (clojure.core/assoc :started-at (deser-started-at (input "startedAt"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (input "lastUpdatedAt"))) (clojure.core/contains? input "versionNumber") (clojure.core/assoc :version-number (deser-version-number (input "versionNumber"))) (clojure.core/contains? input "executionNumber") (clojure.core/assoc :execution-number (deser-execution-number (input "executionNumber")))))

(clojure.core/defn- deser-job-execution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-execution-summary coll))) input))

(clojure.core/defn- deser-last-updated-at [input] input)

(clojure.core/defn- deser-job-document [input] input)

(clojure.core/defn- deser-binary-blob [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-queued-at [input] input)

(clojure.core/defn- deser-job-execution-state [input] (clojure.core/cond-> {} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-job-execution-status (input "status"))) (clojure.core/contains? input "statusDetails") (clojure.core/assoc :status-details (deser-details-map (input "statusDetails"))) (clojure.core/contains? input "versionNumber") (clojure.core/assoc :version-number (deser-version-number (input "versionNumber")))))

(clojure.core/defn- deser-details-value [input] input)

(clojure.core/defn- deser-thing-name [input] input)

(clojure.core/defn- deser-job-execution-status [input] (clojure.core/get {"QUEUED" :queued, "IN_PROGRESS" :in-progress, "SUCCEEDED" :succeeded, "FAILED" :failed, "TIMED_OUT" :timed-out, "REJECTED" :rejected, "REMOVED" :removed, "CANCELED" :canceled} input))

(clojure.core/defn- deser-details-key [input] input)

(clojure.core/defn- deser-version-number [input] input)

(clojure.core/defn- deser-approximate-seconds-before-timed-out [input] input)

(clojure.core/defn- deser-details-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-details-key k) (deser-details-value v)])) input))

(clojure.core/defn- deser-job-execution [input] (clojure.core/cond-> {} (clojure.core/contains? input "thingName") (clojure.core/assoc :thing-name (deser-thing-name (input "thingName"))) (clojure.core/contains? input "queuedAt") (clojure.core/assoc :queued-at (deser-queued-at (input "queuedAt"))) (clojure.core/contains? input "jobDocument") (clojure.core/assoc :job-document (deser-job-document (input "jobDocument"))) (clojure.core/contains? input "startedAt") (clojure.core/assoc :started-at (deser-started-at (input "startedAt"))) (clojure.core/contains? input "approximateSecondsBeforeTimedOut") (clojure.core/assoc :approximate-seconds-before-timed-out (deser-approximate-seconds-before-timed-out (input "approximateSecondsBeforeTimedOut"))) (clojure.core/contains? input "statusDetails") (clojure.core/assoc :status-details (deser-details-map (input "statusDetails"))) (clojure.core/contains? input "executionNumber") (clojure.core/assoc :execution-number (deser-execution-number (input "executionNumber"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-job-execution-status (input "status"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (input "lastUpdatedAt"))) (clojure.core/contains? input "jobId") (clojure.core/assoc :job-id (deser-job-id (input "jobId"))) (clojure.core/contains? input "versionNumber") (clojure.core/assoc :version-number (deser-version-number (input "versionNumber")))))

(clojure.core/defn- deser-started-at [input] input)

(clojure.core/defn- deser-job-id [input] input)

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1231446 input] (clojure.core/let [rawinput1231445 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231447 {"message" (rawinput1231445 "message")}] (clojure.core/cond-> {} (letvar1231447 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1231447 ["message"])))))))

(clojure.core/defn- response-certificate-validation-exception ([input] (response-certificate-validation-exception nil input)) ([resultWrapper1231449 input] (clojure.core/let [rawinput1231448 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231450 {"message" (rawinput1231448 "message")}] (clojure.core/cond-> {} (letvar1231450 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1231450 ["message"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1231452 input] (clojure.core/let [rawinput1231451 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231453 {"message" (rawinput1231451 "message")}] (clojure.core/cond-> {} (letvar1231453 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1231453 ["message"])))))))

(clojure.core/defn- response-get-pending-job-executions-response ([input] (response-get-pending-job-executions-response nil input)) ([resultWrapper1231455 input] (clojure.core/let [rawinput1231454 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231456 {"inProgressJobs" (rawinput1231454 "inProgressJobs"), "queuedJobs" (rawinput1231454 "queuedJobs")}] (clojure.core/cond-> {} (letvar1231456 "inProgressJobs") (clojure.core/assoc :in-progress-jobs (deser-job-execution-summary-list (clojure.core/get-in letvar1231456 ["inProgressJobs"]))) (letvar1231456 "queuedJobs") (clojure.core/assoc :queued-jobs (deser-job-execution-summary-list (clojure.core/get-in letvar1231456 ["queuedJobs"])))))))

(clojure.core/defn- response-terminal-state-exception ([input] (response-terminal-state-exception nil input)) ([resultWrapper1231458 input] (clojure.core/let [rawinput1231457 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231459 {"message" (rawinput1231457 "message")}] (clojure.core/cond-> {} (letvar1231459 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1231459 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1231461 input] (clojure.core/let [rawinput1231460 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231462 {"message" (rawinput1231460 "message")}] (clojure.core/cond-> {} (letvar1231462 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1231462 ["message"])))))))

(clojure.core/defn- response-describe-job-execution-response ([input] (response-describe-job-execution-response nil input)) ([resultWrapper1231464 input] (clojure.core/let [rawinput1231463 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231465 {"execution" (rawinput1231463 "execution")}] (clojure.core/cond-> {} (letvar1231465 "execution") (clojure.core/assoc :execution (deser-job-execution (clojure.core/get-in letvar1231465 ["execution"])))))))

(clojure.core/defn- response-invalid-state-transition-exception ([input] (response-invalid-state-transition-exception nil input)) ([resultWrapper1231467 input] (clojure.core/let [rawinput1231466 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231468 {"message" (rawinput1231466 "message")}] (clojure.core/cond-> {} (letvar1231468 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1231468 ["message"])))))))

(clojure.core/defn- response-update-job-execution-response ([input] (response-update-job-execution-response nil input)) ([resultWrapper1231470 input] (clojure.core/let [rawinput1231469 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231471 {"executionState" (rawinput1231469 "executionState"), "jobDocument" (rawinput1231469 "jobDocument")}] (clojure.core/cond-> {} (letvar1231471 "executionState") (clojure.core/assoc :execution-state (deser-job-execution-state (clojure.core/get-in letvar1231471 ["executionState"]))) (letvar1231471 "jobDocument") (clojure.core/assoc :job-document (deser-job-document (clojure.core/get-in letvar1231471 ["jobDocument"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1231473 input] (clojure.core/let [rawinput1231472 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231474 {"message" (rawinput1231472 "message"), "payload" (rawinput1231472 "payload")}] (clojure.core/cond-> {} (letvar1231474 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1231474 ["message"]))) (letvar1231474 "payload") (clojure.core/assoc :payload (deser-binary-blob (clojure.core/get-in letvar1231474 ["payload"])))))))

(clojure.core/defn- response-start-next-pending-job-execution-response ([input] (response-start-next-pending-job-execution-response nil input)) ([resultWrapper1231476 input] (clojure.core/let [rawinput1231475 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1231477 {"execution" (rawinput1231475 "execution")}] (clojure.core/cond-> {} (letvar1231477 "execution") (clojure.core/assoc :execution (deser-job-execution (clojure.core/get-in letvar1231477 ["execution"])))))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/expected-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.certificate-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/certificate-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.certificate-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/execution-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/queued-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/queued-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/started-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/started-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.job-execution-summary/job-id :portkey.aws.iot-jobs-data.job-execution-summary/queued-at :portkey.aws.iot-jobs-data.job-execution-summary/started-at :portkey.aws.iot-jobs-data.job-execution-summary/last-updated-at :portkey.aws.iot-jobs-data.job-execution-summary/version-number :portkey.aws.iot-jobs-data.job-execution-summary/execution-number]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/include-job-document clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.iot-jobs-data/job-execution-summary))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/last-updated-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.get-pending-job-executions-response/in-progress-jobs (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.get-pending-job-executions-response/queued-jobs (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/get-pending-job-executions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.get-pending-job-executions-response/in-progress-jobs :portkey.aws.iot-jobs-data.get-pending-job-executions-response/queued-jobs]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.terminal-state-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/terminal-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.terminal-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/step-timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/step-timeout-in-minutes))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/start-next-pending-job-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/thing-name] :opt-un [:portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/status-details :portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/step-timeout-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/include-execution-state clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/binary-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/describe-job-execution-job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-request/include-job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/include-job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/describe-job-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-jobs-data.describe-job-execution-request/job-id :portkey.aws.iot-jobs-data.describe-job-execution-request/thing-name] :opt-un [:portkey.aws.iot-jobs-data.describe-job-execution-request/include-job-document :portkey.aws.iot-jobs-data.describe-job-execution-request/execution-number]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/queued-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/describe-job-execution-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.describe-job-execution-response/execution]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-state/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-state/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-state/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.job-execution-state/status :portkey.aws.iot-jobs-data.job-execution-state/status-details :portkey.aws.iot-jobs-data.job-execution-state/version-number]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/step-timeout-in-minutes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/details-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[^\p{C}]*+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.invalid-state-transition-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/invalid-state-transition-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.invalid-state-transition-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution-status #{"CANCELED" :timed-out "IN_PROGRESS" "TIMED_OUT" :in-progress :rejected "REMOVED" :queued :canceled "SUCCEEDED" "REJECTED" "QUEUED" "FAILED" :removed :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-response/execution-state (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-state))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-response/job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/update-job-execution-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.update-job-execution-response/execution-state :portkey.aws.iot-jobs-data.update-job-execution-response/job-document]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/details-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/describe-job-execution-job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+|^\$next" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.get-pending-job-executions-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/get-pending-job-executions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-jobs-data.get-pending-job-executions-request/thing-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.throttling-exception/payload (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/binary-blob))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.throttling-exception/message :portkey.aws.iot-jobs-data.throttling-exception/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/version-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.start-next-pending-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/start-next-pending-job-execution-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.start-next-pending-job-execution-response/execution]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/step-timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/step-timeout-in-minutes))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/include-job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/include-job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/expected-version))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/include-job-execution-state (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/include-execution-state))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/update-job-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-jobs-data.update-job-execution-request/job-id :portkey.aws.iot-jobs-data.update-job-execution-request/thing-name :portkey.aws.iot-jobs-data.update-job-execution-request/status] :opt-un [:portkey.aws.iot-jobs-data.update-job-execution-request/step-timeout-in-minutes :portkey.aws.iot-jobs-data.update-job-execution-request/include-job-document :portkey.aws.iot-jobs-data.update-job-execution-request/status-details :portkey.aws.iot-jobs-data.update-job-execution-request/execution-number :portkey.aws.iot-jobs-data.update-job-execution-request/expected-version :portkey.aws.iot-jobs-data.update-job-execution-request/include-job-execution-state]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/approximate-seconds-before-timed-out clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/details-map (clojure.spec.alpha/map-of :portkey.aws.iot-jobs-data/details-key :portkey.aws.iot-jobs-data/details-value))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/queued-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/queued-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/started-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/started-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/approximate-seconds-before-timed-out (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/approximate-seconds-before-timed-out))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.job-execution/thing-name :portkey.aws.iot-jobs-data.job-execution/queued-at :portkey.aws.iot-jobs-data.job-execution/job-document :portkey.aws.iot-jobs-data.job-execution/started-at :portkey.aws.iot-jobs-data.job-execution/approximate-seconds-before-timed-out :portkey.aws.iot-jobs-data.job-execution/status-details :portkey.aws.iot-jobs-data.job-execution/execution-number :portkey.aws.iot-jobs-data.job-execution/status :portkey.aws.iot-jobs-data.job-execution/last-updated-at :portkey.aws.iot-jobs-data.job-execution/job-id :portkey.aws.iot-jobs-data.job-execution/version-number]))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/started-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__1012854__auto__))))

(clojure.core/defn describe-job-execution ([describe-job-execution-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-job-execution-request describe-job-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot-jobs-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot-jobs-data/describe-job-execution-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/jobs/{jobId}", :http.request.configuration/version "2017-09-29", :http.request.configuration/service-id "IoT Jobs Data Plane", :http.request.spec/input-spec :portkey.aws.iot-jobs-data/describe-job-execution-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeJobExecution", :http.request.configuration/output-deser-fn response-describe-job-execution-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot-jobs-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data/certificate-validation-exception, "TerminalStateException" :portkey.aws.iot-jobs-data/terminal-state-exception}})))))
(clojure.spec.alpha/fdef describe-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data/describe-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/describe-job-execution-response))

(clojure.core/defn get-pending-job-executions ([get-pending-job-executions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-pending-job-executions-request get-pending-job-executions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot-jobs-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot-jobs-data/get-pending-job-executions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/jobs", :http.request.configuration/version "2017-09-29", :http.request.configuration/service-id "IoT Jobs Data Plane", :http.request.spec/input-spec :portkey.aws.iot-jobs-data/get-pending-job-executions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPendingJobExecutions", :http.request.configuration/output-deser-fn response-get-pending-job-executions-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot-jobs-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data/certificate-validation-exception}})))))
(clojure.spec.alpha/fdef get-pending-job-executions :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data/get-pending-job-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/get-pending-job-executions-response))

(clojure.core/defn start-next-pending-job-execution ([start-next-pending-job-execution-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-start-next-pending-job-execution-request start-next-pending-job-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot-jobs-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot-jobs-data/start-next-pending-job-execution-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/jobs/$next", :http.request.configuration/version "2017-09-29", :http.request.configuration/service-id "IoT Jobs Data Plane", :http.request.spec/input-spec :portkey.aws.iot-jobs-data/start-next-pending-job-execution-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartNextPendingJobExecution", :http.request.configuration/output-deser-fn response-start-next-pending-job-execution-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot-jobs-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data/certificate-validation-exception}})))))
(clojure.spec.alpha/fdef start-next-pending-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data/start-next-pending-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/start-next-pending-job-execution-response))

(clojure.core/defn update-job-execution ([update-job-execution-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-job-execution-request update-job-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot-jobs-data/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot-jobs-data/update-job-execution-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/jobs/{jobId}", :http.request.configuration/version "2017-09-29", :http.request.configuration/service-id "IoT Jobs Data Plane", :http.request.spec/input-spec :portkey.aws.iot-jobs-data/update-job-execution-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateJobExecution", :http.request.configuration/output-deser-fn response-update-job-execution-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot-jobs-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data/certificate-validation-exception, "InvalidStateTransitionException" :portkey.aws.iot-jobs-data/invalid-state-transition-exception}})))))
(clojure.spec.alpha/fdef update-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data/update-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/update-job-execution-response))
