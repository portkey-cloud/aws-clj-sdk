(ns portkey.aws.iot-jobs-data.-2017-09-29 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/expected-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.invalid-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.certificate-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/certificate-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.certificate-validation-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/execution-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/queued-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/queued-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/started-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/started-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/jobId :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/queuedAt :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/startedAt :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/lastUpdatedAt :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/versionNumber :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-summary/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/include-job-document clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-summary-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/last-updated-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/job-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.get-pending-job-executions-response/in-progress-jobs (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.get-pending-job-executions-response/queued-jobs (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/get-pending-job-executions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.get-pending-job-executions-response/inProgressJobs :portkey.aws.iot-jobs-data.-2017-09-29.get-pending-job-executions-response/queuedJobs] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.terminal-state-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/terminal-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.terminal-state-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.start-next-pending-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.start-next-pending-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/start-next-pending-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-jobs-data.-2017-09-29.start-next-pending-job-execution-request/thingName] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.start-next-pending-job-execution-request/statusDetails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/include-execution-state clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/describe-job-execution-job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-request/include-job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/include-job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/describe-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-request/jobId :portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-request/thingName] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-request/includeJobDocument :portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-request/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/queued-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-execution))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/describe-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.describe-job-execution-response/execution] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-state/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-state/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-state/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.job-execution-state/status :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-state/statusDetails :portkey.aws.iot-jobs-data.-2017-09-29.job-execution-state/versionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/details-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 1024)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[^\p{C}]*+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.invalid-state-transition-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/invalid-state-transition-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.invalid-state-transition-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CANCELED" "CANCELED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", :rejected "REJECTED", "REMOVED" "REMOVED", :queued "QUEUED", :canceled "CANCELED", "SUCCEEDED" "SUCCEEDED", "REJECTED" "REJECTED", "QUEUED" "QUEUED", "FAILED" "FAILED", :removed "REMOVED", :failed "FAILED", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-response/execution-state (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-state))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-response/job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/update-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-response/executionState :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-response/jobDocument] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/details-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/describe-job-execution-job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+|^\$next" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.get-pending-job-executions-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/get-pending-job-executions-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-jobs-data.-2017-09-29.get-pending-job-executions-request/thingName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.throttling-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/version-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.start-next-pending-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-execution))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/start-next-pending-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.start-next-pending-job-execution-response/execution] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/expected-version))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/include-job-execution-state (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/include-execution-state))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/include-job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/include-job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/update-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/jobId :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/thingName :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/status] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/statusDetails :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/expectedVersion :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/includeJobExecutionState :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/includeJobDocument :portkey.aws.iot-jobs-data.-2017-09-29.update-job-execution-request/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/details-map (clojure.spec.alpha/map-of :portkey.aws.iot-jobs-data.-2017-09-29/details-key :portkey.aws.iot-jobs-data.-2017-09-29/details-value))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/thing-name (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/queued-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/queued-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/job-document (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-document))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/started-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/started-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/status-details (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/details-map))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/execution-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/status (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/job-id (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/job-id))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/version-number (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/version-number))
(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/job-execution (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-jobs-data.-2017-09-29.job-execution/thingName :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/queuedAt :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/jobDocument :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/startedAt :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/statusDetails :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/executionNumber :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/status :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/lastUpdatedAt :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/jobId :portkey.aws.iot-jobs-data.-2017-09-29.job-execution/versionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/started-at clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot-jobs-data.-2017-09-29/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 64)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__16144__auto__))))

(clojure.core/defn describe-job-execution "Gets details of a job execution." ([describe-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.iot-jobs-data.-2017-09-29/endpoints "GET" "/things/{thingName}/jobs/{jobId}" describe-job-execution-request :portkey.aws.iot-jobs-data.-2017-09-29/describe-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId", "thingName" "thingName"}, :querystring {"includeJobDocument" "includeJobDocument", "executionNumber" "executionNumber"}} nil :portkey.aws.iot-jobs-data.-2017-09-29/describe-job-execution-response {"InvalidRequestException" :portkey.aws.iot-jobs-data.-2017-09-29/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data.-2017-09-29/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data.-2017-09-29/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data.-2017-09-29/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data.-2017-09-29/certificate-validation-exception, "TerminalStateException" :portkey.aws.iot-jobs-data.-2017-09-29/terminal-state-exception})))
(clojure.spec.alpha/fdef describe-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data.-2017-09-29/describe-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/describe-job-execution-response))

(clojure.core/defn get-pending-job-executions "Gets the list of all jobs for a thing that are not in a terminal status." ([get-pending-job-executions-request] (portkey.aws/-rest-json-call portkey.aws.iot-jobs-data.-2017-09-29/endpoints "GET" "/things/{thingName}/jobs" get-pending-job-executions-request :portkey.aws.iot-jobs-data.-2017-09-29/get-pending-job-executions-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-jobs-data.-2017-09-29/get-pending-job-executions-response {"InvalidRequestException" :portkey.aws.iot-jobs-data.-2017-09-29/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data.-2017-09-29/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data.-2017-09-29/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data.-2017-09-29/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data.-2017-09-29/certificate-validation-exception})))
(clojure.spec.alpha/fdef get-pending-job-executions :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data.-2017-09-29/get-pending-job-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/get-pending-job-executions-response))

(clojure.core/defn start-next-pending-job-execution "Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution\nfor a thing." ([start-next-pending-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.iot-jobs-data.-2017-09-29/endpoints "PUT" "/things/{thingName}/jobs/$next" start-next-pending-job-execution-request :portkey.aws.iot-jobs-data.-2017-09-29/start-next-pending-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-jobs-data.-2017-09-29/start-next-pending-job-execution-response {"InvalidRequestException" :portkey.aws.iot-jobs-data.-2017-09-29/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data.-2017-09-29/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data.-2017-09-29/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data.-2017-09-29/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data.-2017-09-29/certificate-validation-exception})))
(clojure.spec.alpha/fdef start-next-pending-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data.-2017-09-29/start-next-pending-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/start-next-pending-job-execution-response))

(clojure.core/defn update-job-execution "Updates the status of a job execution." ([update-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.iot-jobs-data.-2017-09-29/endpoints "POST" "/things/{thingName}/jobs/{jobId}" update-job-execution-request :portkey.aws.iot-jobs-data.-2017-09-29/update-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId", "thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-jobs-data.-2017-09-29/update-job-execution-response {"InvalidRequestException" :portkey.aws.iot-jobs-data.-2017-09-29/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-jobs-data.-2017-09-29/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-jobs-data.-2017-09-29/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot-jobs-data.-2017-09-29/service-unavailable-exception, "CertificateValidationException" :portkey.aws.iot-jobs-data.-2017-09-29/certificate-validation-exception, "InvalidStateTransitionException" :portkey.aws.iot-jobs-data.-2017-09-29/invalid-state-transition-exception})))
(clojure.spec.alpha/fdef update-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot-jobs-data.-2017-09-29/update-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-jobs-data.-2017-09-29/update-job-execution-response))
