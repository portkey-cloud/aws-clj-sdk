(ns portkey.aws.batch.-2016-08-10 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "batch", :region "ap-northeast-1"},
    :ssl-common-name "batch.ap-northeast-1.amazonaws.com",
    :endpoint "https://batch.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "batch", :region "eu-west-1"},
    :ssl-common-name "batch.eu-west-1.amazonaws.com",
    :endpoint "https://batch.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "batch", :region "us-east-2"},
    :ssl-common-name "batch.us-east-2.amazonaws.com",
    :endpoint "https://batch.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "batch", :region "ap-southeast-2"},
    :ssl-common-name "batch.ap-southeast-2.amazonaws.com",
    :endpoint "https://batch.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "batch", :region "ap-southeast-1"},
    :ssl-common-name "batch.ap-southeast-1.amazonaws.com",
    :endpoint "https://batch.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "batch", :region "ap-northeast-2"},
    :ssl-common-name "batch.ap-northeast-2.amazonaws.com",
    :endpoint "https://batch.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "batch", :region "ca-central-1"},
    :ssl-common-name "batch.ca-central-1.amazonaws.com",
    :endpoint "https://batch.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "batch", :region "eu-central-1"},
    :ssl-common-name "batch.eu-central-1.amazonaws.com",
    :endpoint "https://batch.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "batch", :region "eu-west-2"},
    :ssl-common-name "batch.eu-west-2.amazonaws.com",
    :endpoint "https://batch.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "batch", :region "us-west-2"},
    :ssl-common-name "batch.us-west-2.amazonaws.com",
    :endpoint "https://batch.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "batch", :region "us-east-1"},
    :ssl-common-name "batch.us-east-1.amazonaws.com",
    :endpoint "https://batch.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "batch", :region "us-west-1"},
    :ssl-common-name "batch.us-west-1.amazonaws.com",
    :endpoint "https://batch.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-compute-environment-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/compute-environments (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-compute-environments-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-compute-environments-request/computeEnvironments :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/maxResults :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/string-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"container" "container", :container "container"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-job-queue-response (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.create-job-queue-response/jobQueueName :portkey.aws.batch.-2016-08-10.create-job-queue-response/jobQueueArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/container-overrides (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-overrides))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/timeout (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/depends-on (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/array-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/submit-job-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.submit-job-request/jobName :portkey.aws.batch.-2016-08-10.submit-job-request/jobQueue :portkey.aws.batch.-2016-08-10.submit-job-request/jobDefinition] :opt-un [:portkey.aws.batch.-2016-08-10.submit-job-request/retryStrategy :portkey.aws.batch.-2016-08-10.submit-job-request/containerOverrides :portkey.aws.batch.-2016-08-10.submit-job-request/timeout :portkey.aws.batch.-2016-08-10.submit-job-request/dependsOn :portkey.aws.batch.-2016-08-10.submit-job-request/parameters :portkey.aws.batch.-2016-08-10.submit-job-request/arrayProperties] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-order/order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-order/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-order (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.compute-environment-order/order :portkey.aws.batch.-2016-08-10.compute-environment-order/computeEnvironment] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource-update))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-compute-environment-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-request/computeEnvironment] :opt-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-request/state :portkey.aws.batch.-2016-08-10.update-compute-environment-request/computeResources :portkey.aws.batch.-2016-08-10.update-compute-environment-request/serviceRole] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/jqstate (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/container-path (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/read-only (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/source-volume (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/mount-point (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.mount-point/containerPath :portkey.aws.batch.-2016-08-10.mount-point/readOnly :portkey.aws.batch.-2016-08-10.mount-point/sourceVolume] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cancel-job-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties/size (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-properties (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.array-properties/size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.client-exception/message (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/client-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.client-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"RUNNABLE" "RUNNABLE", :starting "STARTING", :pending "PENDING", "PENDING" "PENDING", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "STARTING" "STARTING", :runnable "RUNNABLE", "FAILED" "FAILED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-detail-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/compute-environment-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/compute-environments (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-compute-environments-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-compute-environments-response/computeEnvironments :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.volume/host (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/host))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.volume/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/volume (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.volume/host :portkey.aws.batch.-2016-08-10.volume/name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-job-queue-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/deregister-job-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-compute-environment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-response/computeEnvironmentName :portkey.aws.batch.-2016-08-10.create-compute-environment-response/computeEnvironmentArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-summary/size (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-summary/index (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-properties-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.array-properties-summary/size :portkey.aws.batch.-2016-08-10.array-properties-summary/index] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/tags-map (clojure.spec.alpha/map-of :portkey.aws.batch.-2016-08-10/string :portkey.aws.batch.-2016-08-10/string))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-details (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/attempt-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/environment-variables (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/key-value-pair) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/array-job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/job-status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/list-jobs-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.list-jobs-request/jobQueue :portkey.aws.batch.-2016-08-10.list-jobs-request/arrayJobId :portkey.aws.batch.-2016-08-10.list-jobs-request/jobStatus :portkey.aws.batch.-2016-08-10.list-jobs-request/maxResults :portkey.aws.batch.-2016-08-10.list-jobs-request/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-resource-update (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.compute-resource-update/minvCpus :portkey.aws.batch.-2016-08-10.compute-resource-update/maxvCpus :portkey.aws.batch.-2016-08-10.compute-resource-update/desiredvCpus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/container-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/revision (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/timeout (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.job-definition/jobDefinitionName :portkey.aws.batch.-2016-08-10.job-definition/jobDefinitionArn :portkey.aws.batch.-2016-08-10.job-definition/revision :portkey.aws.batch.-2016-08-10.job-definition/type] :opt-un [:portkey.aws.batch.-2016-08-10.job-definition/retryStrategy :portkey.aws.batch.-2016-08-10.job-definition/containerProperties :portkey.aws.batch.-2016-08-10.job-definition/status :portkey.aws.batch.-2016-08-10.job-definition/timeout :portkey.aws.batch.-2016-08-10.job-definition/parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/ulimits (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ulimits))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/command (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/mount-points (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/mount-points))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/image (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/user (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/volumes (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/volumes))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/privileged (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/vcpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/memory (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/job-role-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-detail/ulimits :portkey.aws.batch.-2016-08-10.container-detail/command :portkey.aws.batch.-2016-08-10.container-detail/mountPoints :portkey.aws.batch.-2016-08-10.container-detail/image :portkey.aws.batch.-2016-08-10.container-detail/exitCode :portkey.aws.batch.-2016-08-10.container-detail/user :portkey.aws.batch.-2016-08-10.container-detail/volumes :portkey.aws.batch.-2016-08-10.container-detail/privileged :portkey.aws.batch.-2016-08-10.container-detail/vcpus :portkey.aws.batch.-2016-08-10.container-detail/readonlyRootFilesystem :portkey.aws.batch.-2016-08-10.container-detail/taskArn :portkey.aws.batch.-2016-08-10.container-detail/memory :portkey.aws.batch.-2016-08-10.container-detail/logStreamName :portkey.aws.batch.-2016-08-10.container-detail/containerInstanceArn :portkey.aws.batch.-2016-08-10.container-detail/environment :portkey.aws.batch.-2016-08-10.container-detail/reason :portkey.aws.batch.-2016-08-10.container-detail/jobRoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.deregister-job-definition-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/deregister-job-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.deregister-job-definition-request/jobDefinition] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/jqstatus (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:valid "VALID", :deleted "DELETED", :creating "CREATING", "UPDATING" "UPDATING", :invalid "INVALID", :deleting "DELETING", "INVALID" "INVALID", "DELETING" "DELETING", "CREATING" "CREATING", :updating "UPDATING", "DELETED" "DELETED", "VALID" "VALID"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/job-queues (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-queues-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-queues-request/jobQueues :portkey.aws.batch.-2016-08-10.describe-job-queues-request/maxResults :portkey.aws.batch.-2016-08-10.describe-job-queues-request/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cetype))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-compute-environment-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-request/computeEnvironmentName :portkey.aws.batch.-2016-08-10.create-compute-environment-request/type :portkey.aws.batch.-2016-08-10.create-compute-environment-request/serviceRole] :opt-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-request/state :portkey.aws.batch.-2016-08-10.create-compute-environment-request/computeResources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-job-dependency (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"N_TO_N" "N_TO_N", :n-to-n "N_TO_N", "SEQUENTIAL" "SEQUENTIAL", :sequential "SEQUENTIAL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/terminate-job-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-definition-type))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/container-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/timeout (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/register-job-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.register-job-definition-request/jobDefinitionName :portkey.aws.batch.-2016-08-10.register-job-definition-request/type] :opt-un [:portkey.aws.batch.-2016-08-10.register-job-definition-request/parameters :portkey.aws.batch.-2016-08-10.register-job-definition-request/containerProperties :portkey.aws.batch.-2016-08-10.register-job-definition-request/retryStrategy :portkey.aws.batch.-2016-08-10.register-job-definition-request/timeout] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.cancel-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.cancel-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cancel-job-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.cancel-job-request/jobId :portkey.aws.batch.-2016-08-10.cancel-job-request/reason] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-response/job-queues (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-queue-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-queues-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-queues-response/jobQueues :portkey.aws.batch.-2016-08-10.describe-job-queues-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-dependency/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-dependency/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-job-dependency))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-dependency (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.job-dependency/jobId :portkey.aws.batch.-2016-08-10.job-dependency/type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/ec2-key-pair (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/spot-iam-fleet-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/subnets (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/bid-percentage (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/tags (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/tags-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/image-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/instance-types (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/crtype))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/security-group-ids (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/instance-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-resource (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.compute-resource/type :portkey.aws.batch.-2016-08-10.compute-resource/minvCpus :portkey.aws.batch.-2016-08-10.compute-resource/maxvCpus :portkey.aws.batch.-2016-08-10.compute-resource/instanceTypes :portkey.aws.batch.-2016-08-10.compute-resource/subnets :portkey.aws.batch.-2016-08-10.compute-resource/securityGroupIds :portkey.aws.batch.-2016-08-10.compute-resource/instanceRole] :opt-un [:portkey.aws.batch.-2016-08-10.compute-resource/ec2KeyPair :portkey.aws.batch.-2016-08-10.compute-resource/spotIamFleetRole :portkey.aws.batch.-2016-08-10.compute-resource/bidPercentage :portkey.aws.batch.-2016-08-10.compute-resource/tags :portkey.aws.batch.-2016-08-10.compute-resource/imageId :portkey.aws.batch.-2016-08-10.compute-resource/desiredvCpus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-queue-detail-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-queue-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.terminate-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.terminate-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/terminate-job-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.terminate-job-request/jobId :portkey.aws.batch.-2016-08-10.terminate-job-request/reason] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-definition) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/crtype (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"EC2" "EC2", :ec2 "EC2", "SPOT" "SPOT", :spot "SPOT"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-job-queue-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.create-job-queue-request/jobQueueName :portkey.aws.batch.-2016-08-10.create-job-queue-request/priority :portkey.aws.batch.-2016-08-10.create-job-queue-request/computeEnvironmentOrder] :opt-un [:portkey.aws.batch.-2016-08-10.create-job-queue-request/state] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-detail-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.delete-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-job-queue-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.delete-job-queue-request/jobQueue] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-summary/exit-code (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-summary/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-summary/exitCode :portkey.aws.batch.-2016-08-10.container-summary/reason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-summary-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-compute-environment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-response/computeEnvironmentName :portkey.aws.batch.-2016-08-10.update-compute-environment-response/computeEnvironmentArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/attempt-container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.attempt-detail/container :portkey.aws.batch.-2016-08-10.attempt-detail/startedAt :portkey.aws.batch.-2016-08-10.attempt-detail/stoppedAt :portkey.aws.batch.-2016-08-10.attempt-detail/statusReason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-response/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-response/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/submit-job-response (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.submit-job-response/jobName :portkey.aws.batch.-2016-08-10.submit-job-response/jobId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-jobs-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-jobs-response/jobs] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/revision (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/register-job-definition-response (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.register-job-definition-response/jobDefinitionName :portkey.aws.batch.-2016-08-10.register-job-definition-response/jobDefinitionArn :portkey.aws.batch.-2016-08-10.register-job-definition-response/revision] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/job-definitions (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-definition-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-definitions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-definitions-response/jobDefinitions :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cestatus))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cetype))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-detail (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.compute-environment-detail/computeEnvironmentName :portkey.aws.batch.-2016-08-10.compute-environment-detail/computeEnvironmentArn :portkey.aws.batch.-2016-08-10.compute-environment-detail/ecsClusterArn] :opt-un [:portkey.aws.batch.-2016-08-10.compute-environment-detail/serviceRole :portkey.aws.batch.-2016-08-10.compute-environment-detail/status :portkey.aws.batch.-2016-08-10.compute-environment-detail/computeResources :portkey.aws.batch.-2016-08-10.compute-environment-detail/type :portkey.aws.batch.-2016-08-10.compute-environment-detail/state :portkey.aws.batch.-2016-08-10.compute-environment-detail/statusReason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cestatus (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:valid "VALID", :deleted "DELETED", :creating "CREATING", "UPDATING" "UPDATING", :invalid "INVALID", :deleting "DELETING", "INVALID" "INVALID", "DELETING" "DELETING", "CREATING" "CREATING", :updating "UPDATING", "DELETED" "DELETED", "VALID" "VALID"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-job-status-summary (clojure.spec.alpha/map-of :portkey.aws.batch.-2016-08-10/string :portkey.aws.batch.-2016-08-10/integer))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.server-exception/message (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/server-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.server-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/parameters-map (clojure.spec.alpha/map-of :portkey.aws.batch.-2016-08-10/string :portkey.aws.batch.-2016-08-10/string))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/vcpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/memory (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/command (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-overrides (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-overrides/vcpus :portkey.aws.batch.-2016-08-10.container-overrides/memory :portkey.aws.batch.-2016-08-10.container-overrides/command :portkey.aws.batch.-2016-08-10.container-overrides/environment] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-jobs-request/jobs (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-jobs-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.describe-jobs-request/jobs] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-detail/status-summary (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-job-status-summary))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-detail/size (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-detail/index (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-properties-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.array-properties-detail/statusSummary :portkey.aws.batch.-2016-08-10.array-properties-detail/size :portkey.aws.batch.-2016-08-10.array-properties-detail/index] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-dependency-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-dependency) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jqstatus))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-queue-detail (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.job-queue-detail/jobQueueName :portkey.aws.batch.-2016-08-10.job-queue-detail/jobQueueArn :portkey.aws.batch.-2016-08-10.job-queue-detail/state :portkey.aws.batch.-2016-08-10.job-queue-detail/priority :portkey.aws.batch.-2016-08-10.job-queue-detail/computeEnvironmentOrder] :opt-un [:portkey.aws.batch.-2016-08-10.job-queue-detail/status :portkey.aws.batch.-2016-08-10.job-queue-detail/statusReason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ulimits (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/ulimit) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-timeout/attempt-duration-seconds (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-timeout (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.job-timeout/attemptDurationSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cetype (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"MANAGED" "MANAGED", :managed "MANAGED", "UNMANAGED" "UNMANAGED", :unmanaged "UNMANAGED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/ulimits (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ulimits))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/command (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/mount-points (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/mount-points))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/image (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/user (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/volumes (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/volumes))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/privileged (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/vcpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/memory (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/job-role-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-properties (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.container-properties/image :portkey.aws.batch.-2016-08-10.container-properties/vcpus :portkey.aws.batch.-2016-08-10.container-properties/memory] :opt-un [:portkey.aws.batch.-2016-08-10.container-properties/ulimits :portkey.aws.batch.-2016-08-10.container-properties/command :portkey.aws.batch.-2016-08-10.container-properties/mountPoints :portkey.aws.batch.-2016-08-10.container-properties/user :portkey.aws.batch.-2016-08-10.container-properties/volumes :portkey.aws.batch.-2016-08-10.container-properties/privileged :portkey.aws.batch.-2016-08-10.container-properties/readonlyRootFilesystem :portkey.aws.batch.-2016-08-10.container-properties/environment :portkey.aws.batch.-2016-08-10.container-properties/jobRoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/hard-limit (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/soft-limit (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ulimit (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.ulimit/hardLimit :portkey.aws.batch.-2016-08-10.ulimit/name :portkey.aws.batch.-2016-08-10.ulimit/softLimit] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/created-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/timeout (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/attempts (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/attempt-details))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/depends-on (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/array-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-properties-detail))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-detail (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.job-detail/jobName :portkey.aws.batch.-2016-08-10.job-detail/jobId :portkey.aws.batch.-2016-08-10.job-detail/jobQueue :portkey.aws.batch.-2016-08-10.job-detail/status :portkey.aws.batch.-2016-08-10.job-detail/startedAt :portkey.aws.batch.-2016-08-10.job-detail/jobDefinition] :opt-un [:portkey.aws.batch.-2016-08-10.job-detail/retryStrategy :portkey.aws.batch.-2016-08-10.job-detail/createdAt :portkey.aws.batch.-2016-08-10.job-detail/stoppedAt :portkey.aws.batch.-2016-08-10.job-detail/timeout :portkey.aws.batch.-2016-08-10.job-detail/attempts :portkey.aws.batch.-2016-08-10.job-detail/statusReason :portkey.aws.batch.-2016-08-10.job-detail/dependsOn :portkey.aws.batch.-2016-08-10.job-detail/parameters :portkey.aws.batch.-2016-08-10.job-detail/arrayProperties :portkey.aws.batch.-2016-08-10.job-detail/container] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cestate (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-container-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.attempt-container-detail/containerInstanceArn :portkey.aws.batch.-2016-08-10.attempt-container-detail/taskArn :portkey.aws.batch.-2016-08-10.attempt-container-detail/exitCode :portkey.aws.batch.-2016-08-10.attempt-container-detail/reason :portkey.aws.batch.-2016-08-10.attempt-container-detail/logStreamName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/job-definitions (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-definitions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-definitions-request/jobDefinitions :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/maxResults :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/jobDefinitionName :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/status :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/volumes (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/volume) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-response/job-summary-list (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-summary-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/list-jobs-response (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.list-jobs-response/jobSummaryList] :opt-un [:portkey.aws.batch.-2016-08-10.list-jobs-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/mount-points (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/mount-point) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/created-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/started-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/stopped-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/array-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-properties-summary))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-summary))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-summary (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.job-summary/jobId :portkey.aws.batch.-2016-08-10.job-summary/jobName] :opt-un [:portkey.aws.batch.-2016-08-10.job-summary/createdAt :portkey.aws.batch.-2016-08-10.job-summary/startedAt :portkey.aws.batch.-2016-08-10.job-summary/stoppedAt :portkey.aws.batch.-2016-08-10.job-summary/status :portkey.aws.batch.-2016-08-10.job-summary/statusReason :portkey.aws.batch.-2016-08-10.job-summary/arrayProperties :portkey.aws.batch.-2016-08-10.job-summary/container] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-job-queue-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.update-job-queue-response/jobQueueName :portkey.aws.batch.-2016-08-10.update-job-queue-response/jobQueueArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.host/source-path (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/host (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.host/sourcePath] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.delete-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-compute-environment-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.delete-compute-environment-request/computeEnvironment] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-orders (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/compute-environment-order) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-job-queue-request (portkey.aws/json-keys :req-un [:portkey.aws.batch.-2016-08-10.update-job-queue-request/jobQueue] :opt-un [:portkey.aws.batch.-2016-08-10.update-job-queue-request/state :portkey.aws.batch.-2016-08-10.update-job-queue-request/priority :portkey.aws.batch.-2016-08-10.update-job-queue-request/computeEnvironmentOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.retry-strategy/attempts (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/retry-strategy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.retry-strategy/attempts] :locations {}))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.key-value-pair/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.key-value-pair/value (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/key-value-pair (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.key-value-pair/name :portkey.aws.batch.-2016-08-10.key-value-pair/value] :locations {}))

(clojure.core/defn describe-job-definitions "Describes a list of job definitions. You can specify a status (such as ACTIVE)\nto only return job definitions that match that status." ([] (describe-job-definitions {})) ([describe-job-definitions-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/describejobdefinitions" describe-job-definitions-request :portkey.aws.batch.-2016-08-10/describe-job-definitions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/describe-job-definitions-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef describe-job-definitions :args (clojure.spec.alpha/? :portkey.aws.batch.-2016-08-10/describe-job-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/describe-job-definitions-response))

(clojure.core/defn register-job-definition "Registers an AWS Batch job definition." ([register-job-definition-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/registerjobdefinition" register-job-definition-request :portkey.aws.batch.-2016-08-10/register-job-definition-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/register-job-definition-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef register-job-definition :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/register-job-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/register-job-definition-response))

(clojure.core/defn describe-compute-environments "Describes one or more of your compute environments.\n If you are using an unmanaged compute environment, you can use the\nDescribeComputeEnvironment operation to determine the ecsClusterArn that you\nshould launch your Amazon ECS container instances into." ([] (describe-compute-environments {})) ([describe-compute-environments-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/describecomputeenvironments" describe-compute-environments-request :portkey.aws.batch.-2016-08-10/describe-compute-environments-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/describe-compute-environments-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef describe-compute-environments :args (clojure.spec.alpha/? :portkey.aws.batch.-2016-08-10/describe-compute-environments-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/describe-compute-environments-response))

(clojure.core/defn update-compute-environment "Updates an AWS Batch compute environment." ([update-compute-environment-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/updatecomputeenvironment" update-compute-environment-request :portkey.aws.batch.-2016-08-10/update-compute-environment-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/update-compute-environment-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef update-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/update-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/update-compute-environment-response))

(clojure.core/defn delete-job-queue "Deletes the specified job queue. You must first disable submissions for a queue\nwith the UpdateJobQueue operation. All jobs in the queue are terminated when you\ndelete a job queue.\n It is not necessary to disassociate compute environments from a queue before\nsubmitting a DeleteJobQueue request." ([delete-job-queue-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/deletejobqueue" delete-job-queue-request :portkey.aws.batch.-2016-08-10/delete-job-queue-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/delete-job-queue-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef delete-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/delete-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/delete-job-queue-response))

(clojure.core/defn create-compute-environment "Creates an AWS Batch compute environment. You can create MANAGED or UNMANAGED\ncompute environments.\n In a managed compute environment, AWS Batch manages the compute resources\nwithin the environment, based on the compute resources that you specify.\nInstances launched into a managed compute environment use a recent, approved\nversion of the Amazon ECS-optimized AMI. You can choose to use Amazon EC2\nOn-Demand Instances in your managed compute environment, or you can use Amazon\nEC2 Spot Instances that only launch when the Spot bid price is below a specified\npercentage of the On-Demand price.\n In an unmanaged compute environment, you can manage your own compute resources.\nThis provides more compute resource configuration options, such as using a\ncustom AMI, but you must ensure that your AMI meets the Amazon ECS container\ninstance AMI specification. For more information, see Container Instance AMIs\n(http://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html)\nin the Amazon Elastic Container Service Developer Guide. After you have created\nyour unmanaged compute environment, you can use the DescribeComputeEnvironments\noperation to find the Amazon ECS cluster that is associated with it and then\nmanually launch your container instances into that Amazon ECS cluster. For more\ninformation, see Launching an Amazon ECS Container Instance\n(http://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html)\nin the Amazon Elastic Container Service Developer Guide." ([create-compute-environment-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/createcomputeenvironment" create-compute-environment-request :portkey.aws.batch.-2016-08-10/create-compute-environment-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/create-compute-environment-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef create-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/create-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/create-compute-environment-response))

(clojure.core/defn update-job-queue "Updates a job queue." ([update-job-queue-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/updatejobqueue" update-job-queue-request :portkey.aws.batch.-2016-08-10/update-job-queue-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/update-job-queue-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef update-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/update-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/update-job-queue-response))

(clojure.core/defn terminate-job "Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state\nare terminated, which causes them to transition to FAILED. Jobs that have not\nprogressed to the STARTING state are cancelled." ([terminate-job-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/terminatejob" terminate-job-request :portkey.aws.batch.-2016-08-10/terminate-job-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/terminate-job-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef terminate-job :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/terminate-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/terminate-job-response))

(clojure.core/defn describe-job-queues "Describes one or more of your job queues." ([] (describe-job-queues {})) ([describe-job-queues-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/describejobqueues" describe-job-queues-request :portkey.aws.batch.-2016-08-10/describe-job-queues-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/describe-job-queues-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef describe-job-queues :args (clojure.spec.alpha/? :portkey.aws.batch.-2016-08-10/describe-job-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/describe-job-queues-response))

(clojure.core/defn submit-job "Submits an AWS Batch job from a job definition. Parameters specified during\nSubmitJob override parameters defined in the job definition." ([submit-job-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/submitjob" submit-job-request :portkey.aws.batch.-2016-08-10/submit-job-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/submit-job-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef submit-job :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/submit-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/submit-job-response))

(clojure.core/defn delete-compute-environment "Deletes an AWS Batch compute environment.\n Before you can delete a compute environment, you must set its state to DISABLED\nwith the UpdateComputeEnvironment API operation and disassociate it from any job\nqueues with the UpdateJobQueue API operation." ([delete-compute-environment-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/deletecomputeenvironment" delete-compute-environment-request :portkey.aws.batch.-2016-08-10/delete-compute-environment-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/delete-compute-environment-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef delete-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/delete-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/delete-compute-environment-response))

(clojure.core/defn deregister-job-definition "Deregisters an AWS Batch job definition." ([deregister-job-definition-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/deregisterjobdefinition" deregister-job-definition-request :portkey.aws.batch.-2016-08-10/deregister-job-definition-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/deregister-job-definition-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef deregister-job-definition :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/deregister-job-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/deregister-job-definition-response))

(clojure.core/defn describe-jobs "Describes a list of AWS Batch jobs." ([describe-jobs-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/describejobs" describe-jobs-request :portkey.aws.batch.-2016-08-10/describe-jobs-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/describe-jobs-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef describe-jobs :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/describe-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/describe-jobs-response))

(clojure.core/defn create-job-queue "Creates an AWS Batch job queue. When you create a job queue, you associate one\nor more compute environments to the queue and assign an order of preference for\nthe compute environments.\n You also set a priority to the job queue that determines the order in which the\nAWS Batch scheduler places jobs onto its associated compute environments. For\nexample, if a compute environment is associated with more than one job queue,\nthe job queue with a higher priority is given preference for scheduling jobs to\nthat compute environment." ([create-job-queue-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/createjobqueue" create-job-queue-request :portkey.aws.batch.-2016-08-10/create-job-queue-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/create-job-queue-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef create-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/create-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/create-job-queue-response))

(clojure.core/defn list-jobs "Returns a list of task jobs for a specified job queue. You can filter the\nresults by job status with the jobStatus parameter. If you do not specify a\nstatus, only RUNNING jobs are returned." ([] (list-jobs {})) ([list-jobs-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/listjobs" list-jobs-request :portkey.aws.batch.-2016-08-10/list-jobs-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/list-jobs-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.batch.-2016-08-10/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/list-jobs-response))

(clojure.core/defn cancel-job "Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED,\nPENDING, or RUNNABLE state are cancelled. Jobs that have progressed to STARTING\nor RUNNING are not cancelled (but the API operation still succeeds, even if no\njob is cancelled); these jobs must be terminated with the TerminateJob\noperation." ([cancel-job-request] (portkey.aws/-rest-json-call portkey.aws.batch.-2016-08-10/endpoints "POST" "/v1/canceljob" cancel-job-request :portkey.aws.batch.-2016-08-10/cancel-job-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.batch.-2016-08-10/cancel-job-response {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception})))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cancel-job-response))
