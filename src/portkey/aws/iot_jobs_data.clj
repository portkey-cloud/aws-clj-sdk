(ns portkey.aws.iot-jobs-data (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/expected-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.invalid-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.certificate-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/certificate-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.certificate-validation-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/execution-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/queued-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/queued-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/started-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/started-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-summary/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.job-execution-summary/jobId :portkey.aws.iot-jobs-data.job-execution-summary/queuedAt :portkey.aws.iot-jobs-data.job-execution-summary/startedAt :portkey.aws.iot-jobs-data.job-execution-summary/lastUpdatedAt :portkey.aws.iot-jobs-data.job-execution-summary/versionNumber :portkey.aws.iot-jobs-data.job-execution-summary/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/include-job-document clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution-summary-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot-jobs-data/job-execution-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/last-updated-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.get-pending-job-executions-response/in-progress-jobs (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.get-pending-job-executions-response/queued-jobs (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/get-pending-job-executions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.get-pending-job-executions-response/inProgressJobs :portkey.aws.iot-jobs-data.get-pending-job-executions-response/queuedJobs] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.terminal-state-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/terminal-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.terminal-state-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/start-next-pending-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/thingName] :opt-un [:portkey.aws.iot-jobs-data.start-next-pending-job-execution-request/statusDetails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/include-execution-state clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/describe-job-execution-job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-request/include-job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/include-job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/describe-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-jobs-data.describe-job-execution-request/jobId :portkey.aws.iot-jobs-data.describe-job-execution-request/thingName] :opt-un [:portkey.aws.iot-jobs-data.describe-job-execution-request/includeJobDocument :portkey.aws.iot-jobs-data.describe-job-execution-request/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/queued-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.describe-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/describe-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.describe-job-execution-response/execution] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-state/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-state/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution-state/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.job-execution-state/status :portkey.aws.iot-jobs-data.job-execution-state/statusDetails :portkey.aws.iot-jobs-data.job-execution-state/versionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/details-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 1024)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[^\p{C}]*+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.invalid-state-transition-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/invalid-state-transition-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.invalid-state-transition-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution-status (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"CANCELED" "CANCELED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", :rejected "REJECTED", "REMOVED" "REMOVED", :queued "QUEUED", :canceled "CANCELED", "SUCCEEDED" "SUCCEEDED", "REJECTED" "REJECTED", "QUEUED" "QUEUED", "FAILED" "FAILED", :removed "REMOVED", :failed "FAILED", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-response/execution-state (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-state))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-response/job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/update-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.update-job-execution-response/executionState :portkey.aws.iot-jobs-data.update-job-execution-response/jobDocument] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/details-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/describe-job-execution-job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+|^\$next" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.get-pending-job-executions-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/get-pending-job-executions-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-jobs-data.get-pending-job-executions-request/thingName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.throttling-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/version-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.start-next-pending-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/start-next-pending-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.start-next-pending-job-execution-response/execution] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/expected-version))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/include-job-execution-state (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/include-execution-state))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/include-job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/include-job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.update-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/update-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-jobs-data.update-job-execution-request/jobId :portkey.aws.iot-jobs-data.update-job-execution-request/thingName :portkey.aws.iot-jobs-data.update-job-execution-request/status] :opt-un [:portkey.aws.iot-jobs-data.update-job-execution-request/statusDetails :portkey.aws.iot-jobs-data.update-job-execution-request/expectedVersion :portkey.aws.iot-jobs-data.update-job-execution-request/includeJobExecutionState :portkey.aws.iot-jobs-data.update-job-execution-request/includeJobDocument :portkey.aws.iot-jobs-data.update-job-execution-request/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/details-map (clojure.spec.alpha/map-of :portkey.aws.iot-jobs-data/details-key :portkey.aws.iot-jobs-data/details-value))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/queued-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/queued-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/started-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/started-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.job-execution/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-execution (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.job-execution/thingName :portkey.aws.iot-jobs-data.job-execution/queuedAt :portkey.aws.iot-jobs-data.job-execution/jobDocument :portkey.aws.iot-jobs-data.job-execution/startedAt :portkey.aws.iot-jobs-data.job-execution/statusDetails :portkey.aws.iot-jobs-data.job-execution/executionNumber :portkey.aws.iot-jobs-data.job-execution/status :portkey.aws.iot-jobs-data.job-execution/lastUpdatedAt :portkey.aws.iot-jobs-data.job-execution/jobId :portkey.aws.iot-jobs-data.job-execution/versionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/started-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 64)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__13963__auto__))))

(clojure.core/defn describe-job-execution ([describe-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.iot-jobs-data/endpoints "GET" "/things/{thingName}/jobs/{jobId}" describe-job-execution-request :portkey.aws.iot-jobs-data/describe-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId", "thingName" "thingName"}, :querystring {"includeJobDocument" "includeJobDocument", "executionNumber" "executionNumber"}} nil :portkey.aws.iot-jobs-data/describe-job-execution-response {"InvalidRequestException" :portkey.aws.iot-jobs-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data/certificate-validation-exception, "TerminalStateException" :portkey.aws.iot-jobs-data/terminal-state-exception})))
(clojure.spec.alpha/fdef describe-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data/describe-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/describe-job-execution-response))

(clojure.core/defn get-pending-job-executions ([get-pending-job-executions-request] (portkey.aws/-rest-json-call portkey.aws.iot-jobs-data/endpoints "GET" "/things/{thingName}/jobs" get-pending-job-executions-request :portkey.aws.iot-jobs-data/get-pending-job-executions-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-jobs-data/get-pending-job-executions-response {"InvalidRequestException" :portkey.aws.iot-jobs-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data/certificate-validation-exception})))
(clojure.spec.alpha/fdef get-pending-job-executions :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data/get-pending-job-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/get-pending-job-executions-response))

(clojure.core/defn start-next-pending-job-execution ([start-next-pending-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.iot-jobs-data/endpoints "PUT" "/things/{thingName}/jobs/$next" start-next-pending-job-execution-request :portkey.aws.iot-jobs-data/start-next-pending-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-jobs-data/start-next-pending-job-execution-response {"InvalidRequestException" :portkey.aws.iot-jobs-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data/certificate-validation-exception})))
(clojure.spec.alpha/fdef start-next-pending-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data/start-next-pending-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/start-next-pending-job-execution-response))

(clojure.core/defn update-job-execution ([update-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.iot-jobs-data/endpoints "POST" "/things/{thingName}/jobs/{jobId}" update-job-execution-request :portkey.aws.iot-jobs-data/update-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId", "thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-jobs-data/update-job-execution-response {"InvalidRequestException" :portkey.aws.iot-jobs-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data/certificate-validation-exception, "InvalidStateTransitionException" :portkey.aws.iot-jobs-data/invalid-state-transition-exception})))
(clojure.spec.alpha/fdef update-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data/update-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data/update-job-execution-response))
