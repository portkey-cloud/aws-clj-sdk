(ns portkey.aws.data-jobs-iot (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/expected-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.invalid-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.certificate-validation-exception/message (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/certificate-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.certificate-validation-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/execution-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-summary/job-id (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-id))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-summary/queued-at (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/queued-at))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-summary/started-at (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/started-at))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-summary/version-number (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/version-number))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-summary/execution-number (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/execution-number))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/job-execution-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.job-execution-summary/jobId :portkey.aws.data-jobs-iot.job-execution-summary/queuedAt :portkey.aws.data-jobs-iot.job-execution-summary/startedAt :portkey.aws.data-jobs-iot.job-execution-summary/lastUpdatedAt :portkey.aws.data-jobs-iot.job-execution-summary/versionNumber :portkey.aws.data-jobs-iot.job-execution-summary/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/include-job-document clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/job-execution-summary-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.data-jobs-iot/job-execution-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/last-updated-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/job-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.get-pending-job-executions-response/in-progress-jobs (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.get-pending-job-executions-response/queued-jobs (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/get-pending-job-executions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.get-pending-job-executions-response/inProgressJobs :portkey.aws.data-jobs-iot.get-pending-job-executions-response/queuedJobs] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.terminal-state-exception/message (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/terminal-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.terminal-state-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.start-next-pending-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.start-next-pending-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/details-map))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/start-next-pending-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.data-jobs-iot.start-next-pending-job-execution-request/thingName] :opt-un [:portkey.aws.data-jobs-iot.start-next-pending-job-execution-request/statusDetails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/include-execution-state clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.describe-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/describe-job-execution-job-id))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.describe-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.describe-job-execution-request/include-job-document (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/include-job-document))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.describe-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/execution-number))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/describe-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.data-jobs-iot.describe-job-execution-request/jobId :portkey.aws.data-jobs-iot.describe-job-execution-request/thingName] :opt-un [:portkey.aws.data-jobs-iot.describe-job-execution-request/includeJobDocument :portkey.aws.data-jobs-iot.describe-job-execution-request/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/queued-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.describe-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-execution))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/describe-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.describe-job-execution-response/execution] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-state/status (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-state/status-details (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/details-map))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution-state/version-number (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/version-number))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/job-execution-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.job-execution-state/status :portkey.aws.data-jobs-iot.job-execution-state/statusDetails :portkey.aws.data-jobs-iot.job-execution-state/versionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/details-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1024)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[^\p{C}]*+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.invalid-state-transition-exception/message (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/invalid-state-transition-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.invalid-state-transition-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/job-execution-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"CANCELED" "CANCELED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", :rejected "REJECTED", "REMOVED" "REMOVED", :queued "QUEUED", :canceled "CANCELED", "SUCCEEDED" "SUCCEEDED", "REJECTED" "REJECTED", "QUEUED" "QUEUED", "FAILED" "FAILED", :removed "REMOVED", :failed "FAILED", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-response/execution-state (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-execution-state))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-response/job-document (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-document))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/update-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.update-job-execution-response/executionState :portkey.aws.data-jobs-iot.update-job-execution-response/jobDocument] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/details-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/describe-job-execution-job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+|^\$next" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.get-pending-job-executions-request/thing-name (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/get-pending-job-executions-request (portkey.aws/json-keys :req-un [:portkey.aws.data-jobs-iot.get-pending-job-executions-request/thingName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.throttling-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/version-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.start-next-pending-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-execution))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/start-next-pending-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.start-next-pending-job-execution-response/execution] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-id))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-request/status (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/details-map))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-request/expected-version (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/expected-version))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-request/include-job-execution-state (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/include-execution-state))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-request/include-job-document (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/include-job-document))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.update-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/execution-number))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/update-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.data-jobs-iot.update-job-execution-request/jobId :portkey.aws.data-jobs-iot.update-job-execution-request/thingName :portkey.aws.data-jobs-iot.update-job-execution-request/status] :opt-un [:portkey.aws.data-jobs-iot.update-job-execution-request/statusDetails :portkey.aws.data-jobs-iot.update-job-execution-request/expectedVersion :portkey.aws.data-jobs-iot.update-job-execution-request/includeJobExecutionState :portkey.aws.data-jobs-iot.update-job-execution-request/includeJobDocument :portkey.aws.data-jobs-iot.update-job-execution-request/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/details-map (clojure.spec.alpha/map-of :portkey.aws.data-jobs-iot/details-key :portkey.aws.data-jobs-iot/details-value))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/thing-name (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/queued-at (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/queued-at))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/job-document (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-document))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/started-at (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/started-at))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/status-details (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/details-map))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/execution-number (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/execution-number))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/status (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/last-updated-at (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/job-id (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/job-id))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot.job-execution/version-number (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/version-number))
(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/job-execution (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-jobs-iot.job-execution/thingName :portkey.aws.data-jobs-iot.job-execution/queuedAt :portkey.aws.data-jobs-iot.job-execution/jobDocument :portkey.aws.data-jobs-iot.job-execution/startedAt :portkey.aws.data-jobs-iot.job-execution/statusDetails :portkey.aws.data-jobs-iot.job-execution/executionNumber :portkey.aws.data-jobs-iot.job-execution/status :portkey.aws.data-jobs-iot.job-execution/lastUpdatedAt :portkey.aws.data-jobs-iot.job-execution/jobId :portkey.aws.data-jobs-iot.job-execution/versionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/started-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.data-jobs-iot/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 64)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__15968__auto__))))

(clojure.core/defn describe-job-execution "Gets details of a job execution." ([describe-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.data-jobs-iot/endpoints "GET" "/things/{thingName}/jobs/{jobId}" describe-job-execution-request :portkey.aws.data-jobs-iot/describe-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId", "thingName" "thingName"}, :querystring {"includeJobDocument" "includeJobDocument", "executionNumber" "executionNumber"}} nil :portkey.aws.data-jobs-iot/describe-job-execution-response {"InvalidRequestException" :portkey.aws.data-jobs-iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.data-jobs-iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.data-jobs-iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.data-jobs-iot/service-unavailable-exception, "CertificateValidationException" :portkey.aws.data-jobs-iot/certificate-validation-exception, "TerminalStateException" :portkey.aws.data-jobs-iot/terminal-state-exception})))
(clojure.spec.alpha/fdef describe-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.data-jobs-iot/describe-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/describe-job-execution-response))

(clojure.core/defn get-pending-job-executions "Gets the list of all jobs for a thing that are not in a terminal status." ([get-pending-job-executions-request] (portkey.aws/-rest-json-call portkey.aws.data-jobs-iot/endpoints "GET" "/things/{thingName}/jobs" get-pending-job-executions-request :portkey.aws.data-jobs-iot/get-pending-job-executions-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.data-jobs-iot/get-pending-job-executions-response {"InvalidRequestException" :portkey.aws.data-jobs-iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.data-jobs-iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.data-jobs-iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.data-jobs-iot/service-unavailable-exception, "CertificateValidationException" :portkey.aws.data-jobs-iot/certificate-validation-exception})))
(clojure.spec.alpha/fdef get-pending-job-executions :args (clojure.spec.alpha/tuple :portkey.aws.data-jobs-iot/get-pending-job-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/get-pending-job-executions-response))

(clojure.core/defn start-next-pending-job-execution "Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution\nfor a thing." ([start-next-pending-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.data-jobs-iot/endpoints "PUT" "/things/{thingName}/jobs/$next" start-next-pending-job-execution-request :portkey.aws.data-jobs-iot/start-next-pending-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.data-jobs-iot/start-next-pending-job-execution-response {"InvalidRequestException" :portkey.aws.data-jobs-iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.data-jobs-iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.data-jobs-iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.data-jobs-iot/service-unavailable-exception, "CertificateValidationException" :portkey.aws.data-jobs-iot/certificate-validation-exception})))
(clojure.spec.alpha/fdef start-next-pending-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.data-jobs-iot/start-next-pending-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/start-next-pending-job-execution-response))

(clojure.core/defn update-job-execution "Updates the status of a job execution." ([update-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.data-jobs-iot/endpoints "POST" "/things/{thingName}/jobs/{jobId}" update-job-execution-request :portkey.aws.data-jobs-iot/update-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId", "thingName" "thingName"}, :querystring {}} nil :portkey.aws.data-jobs-iot/update-job-execution-response {"InvalidRequestException" :portkey.aws.data-jobs-iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.data-jobs-iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.data-jobs-iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.data-jobs-iot/service-unavailable-exception, "CertificateValidationException" :portkey.aws.data-jobs-iot/certificate-validation-exception, "InvalidStateTransitionException" :portkey.aws.data-jobs-iot/invalid-state-transition-exception})))
(clojure.spec.alpha/fdef update-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.data-jobs-iot/update-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.data-jobs-iot/update-job-execution-response))
