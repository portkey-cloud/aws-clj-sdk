(ns portkey.aws.batch.-2016-08-10 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "batch", "region" "ap-northeast-1"},
    :sslCommonName "batch.ap-northeast-1.amazonaws.com",
    :endpoint "https://batch.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "batch", "region" "eu-west-1"},
    :sslCommonName "batch.eu-west-1.amazonaws.com",
    :endpoint "https://batch.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "batch", "region" "us-east-2"},
    :sslCommonName "batch.us-east-2.amazonaws.com",
    :endpoint "https://batch.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "batch", "region" "ap-southeast-2"},
    :sslCommonName "batch.ap-southeast-2.amazonaws.com",
    :endpoint "https://batch.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "batch", "region" "ap-southeast-1"},
    :sslCommonName "batch.ap-southeast-1.amazonaws.com",
    :endpoint "https://batch.ap-southeast-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "batch", "region" "eu-central-1"},
    :sslCommonName "batch.eu-central-1.amazonaws.com",
    :endpoint "https://batch.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "batch", "region" "eu-west-2"},
    :sslCommonName "batch.eu-west-2.amazonaws.com",
    :endpoint "https://batch.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "batch", "region" "us-west-2"},
    :sslCommonName "batch.us-west-2.amazonaws.com",
    :endpoint "https://batch.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "batch", "region" "us-east-1"},
    :sslCommonName "batch.us-east-1.amazonaws.com",
    :endpoint "https://batch.us-east-1.amazonaws.com"}})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-compute-environment-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/compute-environments (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-compute-environments-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-compute-environments-request/computeEnvironments :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/maxResults :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/string-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition-type (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"container" "container", :container "container"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-job-queue-response (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.create-job-queue-response/jobQueueName :portkey.aws.batch.-2016-08-10.create-job-queue-response/jobQueueArn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/depends-on (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/container-overrides (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-overrides))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/submit-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.submit-job-request/jobName :portkey.aws.batch.-2016-08-10.submit-job-request/jobQueue :portkey.aws.batch.-2016-08-10.submit-job-request/jobDefinition] :opt-un [:portkey.aws.batch.-2016-08-10.submit-job-request/dependsOn :portkey.aws.batch.-2016-08-10.submit-job-request/parameters :portkey.aws.batch.-2016-08-10.submit-job-request/containerOverrides :portkey.aws.batch.-2016-08-10.submit-job-request/retryStrategy]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-order/order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-order/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-order (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.compute-environment-order/order :portkey.aws.batch.-2016-08-10.compute-environment-order/computeEnvironment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource-update))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-compute-environment-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-request/computeEnvironment] :opt-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-request/state :portkey.aws.batch.-2016-08-10.update-compute-environment-request/computeResources :portkey.aws.batch.-2016-08-10.update-compute-environment-request/serviceRole]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/jqstate (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/container-path (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/read-only (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/source-volume (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/mount-point (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.mount-point/containerPath :portkey.aws.batch.-2016-08-10.mount-point/readOnly :portkey.aws.batch.-2016-08-10.mount-point/sourceVolume]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cancel-job-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.client-exception/message (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/client-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-status (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"RUNNABLE" "RUNNABLE", :starting "STARTING", :pending "PENDING", "PENDING" "PENDING", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "STARTING" "STARTING", :runnable "RUNNABLE", "FAILED" "FAILED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/compute-environment-detail :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/compute-environments (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-compute-environments-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-compute-environments-response/computeEnvironments :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.volume/host (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/host))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.volume/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/volume (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.volume/host :portkey.aws.batch.-2016-08-10.volume/name]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-job-queue-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/deregister-job-definition-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-compute-environment-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-response/computeEnvironmentName :portkey.aws.batch.-2016-08-10.create-compute-environment-response/computeEnvironmentArn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/tags-map (clojure.spec.alpha/map-of :portkey.aws.batch.-2016-08-10/string :portkey.aws.batch.-2016-08-10/string))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-details (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/attempt-detail :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/key-value-pair :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/job-status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/list-jobs-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.list-jobs-request/jobQueue] :opt-un [:portkey.aws.batch.-2016-08-10.list-jobs-request/jobStatus :portkey.aws.batch.-2016-08-10.list-jobs-request/maxResults :portkey.aws.batch.-2016-08-10.list-jobs-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-resource-update (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.compute-resource-update/minvCpus :portkey.aws.batch.-2016-08-10.compute-resource-update/maxvCpus :portkey.aws.batch.-2016-08-10.compute-resource-update/desiredvCpus]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/revision (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/container-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.job-definition/jobDefinitionName :portkey.aws.batch.-2016-08-10.job-definition/jobDefinitionArn :portkey.aws.batch.-2016-08-10.job-definition/revision :portkey.aws.batch.-2016-08-10.job-definition/type] :opt-un [:portkey.aws.batch.-2016-08-10.job-definition/status :portkey.aws.batch.-2016-08-10.job-definition/parameters :portkey.aws.batch.-2016-08-10.job-definition/retryStrategy :portkey.aws.batch.-2016-08-10.job-definition/containerProperties]))

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
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-detail (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-detail/ulimits :portkey.aws.batch.-2016-08-10.container-detail/command :portkey.aws.batch.-2016-08-10.container-detail/mountPoints :portkey.aws.batch.-2016-08-10.container-detail/image :portkey.aws.batch.-2016-08-10.container-detail/exitCode :portkey.aws.batch.-2016-08-10.container-detail/user :portkey.aws.batch.-2016-08-10.container-detail/volumes :portkey.aws.batch.-2016-08-10.container-detail/privileged :portkey.aws.batch.-2016-08-10.container-detail/vcpus :portkey.aws.batch.-2016-08-10.container-detail/readonlyRootFilesystem :portkey.aws.batch.-2016-08-10.container-detail/taskArn :portkey.aws.batch.-2016-08-10.container-detail/memory :portkey.aws.batch.-2016-08-10.container-detail/logStreamName :portkey.aws.batch.-2016-08-10.container-detail/containerInstanceArn :portkey.aws.batch.-2016-08-10.container-detail/environment :portkey.aws.batch.-2016-08-10.container-detail/reason :portkey.aws.batch.-2016-08-10.container-detail/jobRoleArn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.deregister-job-definition-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/deregister-job-definition-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.deregister-job-definition-request/jobDefinition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/jqstatus (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {:valid "VALID", :deleted "DELETED", :creating "CREATING", "UPDATING" "UPDATING", :invalid "INVALID", :deleting "DELETING", "INVALID" "INVALID", "DELETING" "DELETING", "CREATING" "CREATING", :updating "UPDATING", "DELETED" "DELETED", "VALID" "VALID"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/job-queues (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-queues-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-queues-request/jobQueues :portkey.aws.batch.-2016-08-10.describe-job-queues-request/maxResults :portkey.aws.batch.-2016-08-10.describe-job-queues-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cetype))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-compute-environment-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-request/computeEnvironmentName :portkey.aws.batch.-2016-08-10.create-compute-environment-request/type :portkey.aws.batch.-2016-08-10.create-compute-environment-request/serviceRole] :opt-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-request/state :portkey.aws.batch.-2016-08-10.create-compute-environment-request/computeResources]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/terminate-job-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-definition-type))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/container-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/register-job-definition-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.register-job-definition-request/jobDefinitionName :portkey.aws.batch.-2016-08-10.register-job-definition-request/type] :opt-un [:portkey.aws.batch.-2016-08-10.register-job-definition-request/parameters :portkey.aws.batch.-2016-08-10.register-job-definition-request/containerProperties :portkey.aws.batch.-2016-08-10.register-job-definition-request/retryStrategy]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.cancel-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.cancel-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cancel-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.cancel-job-request/jobId :portkey.aws.batch.-2016-08-10.cancel-job-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-response/job-queues (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-queue-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-queues-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-queues-response/jobQueues :portkey.aws.batch.-2016-08-10.describe-job-queues-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-dependency/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-dependency (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.job-dependency/jobId]))

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
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-resource (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.compute-resource/type :portkey.aws.batch.-2016-08-10.compute-resource/minvCpus :portkey.aws.batch.-2016-08-10.compute-resource/maxvCpus :portkey.aws.batch.-2016-08-10.compute-resource/instanceTypes :portkey.aws.batch.-2016-08-10.compute-resource/subnets :portkey.aws.batch.-2016-08-10.compute-resource/securityGroupIds :portkey.aws.batch.-2016-08-10.compute-resource/instanceRole] :opt-un [:portkey.aws.batch.-2016-08-10.compute-resource/ec2KeyPair :portkey.aws.batch.-2016-08-10.compute-resource/spotIamFleetRole :portkey.aws.batch.-2016-08-10.compute-resource/bidPercentage :portkey.aws.batch.-2016-08-10.compute-resource/tags :portkey.aws.batch.-2016-08-10.compute-resource/imageId :portkey.aws.batch.-2016-08-10.compute-resource/desiredvCpus]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-queue-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-queue-detail :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.terminate-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.terminate-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/terminate-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.terminate-job-request/jobId :portkey.aws.batch.-2016-08-10.terminate-job-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-definition :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/crtype (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"EC2" "EC2", :ec2 "EC2", "SPOT" "SPOT", :spot "SPOT"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-job-queue-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.create-job-queue-request/jobQueueName :portkey.aws.batch.-2016-08-10.create-job-queue-request/priority :portkey.aws.batch.-2016-08-10.create-job-queue-request/computeEnvironmentOrder] :opt-un [:portkey.aws.batch.-2016-08-10.create-job-queue-request/state]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-detail :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.delete-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-job-queue-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.delete-job-queue-request/jobQueue] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-summary-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-summary :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-compute-environment-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-response/computeEnvironmentName :portkey.aws.batch.-2016-08-10.update-compute-environment-response/computeEnvironmentArn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/attempt-container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-detail (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.attempt-detail/container :portkey.aws.batch.-2016-08-10.attempt-detail/startedAt :portkey.aws.batch.-2016-08-10.attempt-detail/stoppedAt :portkey.aws.batch.-2016-08-10.attempt-detail/statusReason]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-response/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-response/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/submit-job-response (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.submit-job-response/jobName :portkey.aws.batch.-2016-08-10.submit-job-response/jobId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-jobs-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-jobs-response/jobs]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/revision (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/register-job-definition-response (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.register-job-definition-response/jobDefinitionName :portkey.aws.batch.-2016-08-10.register-job-definition-response/jobDefinitionArn :portkey.aws.batch.-2016-08-10.register-job-definition-response/revision] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/job-definitions (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-definition-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-definitions-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-definitions-response/jobDefinitions :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cestatus))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cetype))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-detail (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.compute-environment-detail/computeEnvironmentName :portkey.aws.batch.-2016-08-10.compute-environment-detail/computeEnvironmentArn :portkey.aws.batch.-2016-08-10.compute-environment-detail/ecsClusterArn] :opt-un [:portkey.aws.batch.-2016-08-10.compute-environment-detail/serviceRole :portkey.aws.batch.-2016-08-10.compute-environment-detail/status :portkey.aws.batch.-2016-08-10.compute-environment-detail/computeResources :portkey.aws.batch.-2016-08-10.compute-environment-detail/type :portkey.aws.batch.-2016-08-10.compute-environment-detail/state :portkey.aws.batch.-2016-08-10.compute-environment-detail/statusReason]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cestatus (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {:valid "VALID", :deleted "DELETED", :creating "CREATING", "UPDATING" "UPDATING", :invalid "INVALID", :deleting "DELETING", "INVALID" "INVALID", "DELETING" "DELETING", "CREATING" "CREATING", :updating "UPDATING", "DELETED" "DELETED", "VALID" "VALID"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.server-exception/message (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/server-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/parameters-map (clojure.spec.alpha/map-of :portkey.aws.batch.-2016-08-10/string :portkey.aws.batch.-2016-08-10/string))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/vcpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/memory (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/command (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-overrides (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-overrides/vcpus :portkey.aws.batch.-2016-08-10.container-overrides/memory :portkey.aws.batch.-2016-08-10.container-overrides/command :portkey.aws.batch.-2016-08-10.container-overrides/environment]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-jobs-request/jobs (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-jobs-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.describe-jobs-request/jobs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-dependency-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-dependency :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jqstatus))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-queue-detail (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.job-queue-detail/jobQueueName :portkey.aws.batch.-2016-08-10.job-queue-detail/jobQueueArn :portkey.aws.batch.-2016-08-10.job-queue-detail/state :portkey.aws.batch.-2016-08-10.job-queue-detail/priority :portkey.aws.batch.-2016-08-10.job-queue-detail/computeEnvironmentOrder] :opt-un [:portkey.aws.batch.-2016-08-10.job-queue-detail/status :portkey.aws.batch.-2016-08-10.job-queue-detail/statusReason]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ulimits (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/ulimit :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cetype (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"MANAGED" "MANAGED", :managed "MANAGED", "UNMANAGED" "UNMANAGED", :unmanaged "UNMANAGED"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

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
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-properties (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.container-properties/image :portkey.aws.batch.-2016-08-10.container-properties/vcpus :portkey.aws.batch.-2016-08-10.container-properties/memory] :opt-un [:portkey.aws.batch.-2016-08-10.container-properties/ulimits :portkey.aws.batch.-2016-08-10.container-properties/command :portkey.aws.batch.-2016-08-10.container-properties/mountPoints :portkey.aws.batch.-2016-08-10.container-properties/user :portkey.aws.batch.-2016-08-10.container-properties/volumes :portkey.aws.batch.-2016-08-10.container-properties/privileged :portkey.aws.batch.-2016-08-10.container-properties/readonlyRootFilesystem :portkey.aws.batch.-2016-08-10.container-properties/environment :portkey.aws.batch.-2016-08-10.container-properties/jobRoleArn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/hard-limit (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/soft-limit (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ulimit (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.ulimit/hardLimit :portkey.aws.batch.-2016-08-10.ulimit/name :portkey.aws.batch.-2016-08-10.ulimit/softLimit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/created-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/attempts (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/attempt-details))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/depends-on (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-detail (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.job-detail/jobName :portkey.aws.batch.-2016-08-10.job-detail/jobId :portkey.aws.batch.-2016-08-10.job-detail/jobQueue :portkey.aws.batch.-2016-08-10.job-detail/status :portkey.aws.batch.-2016-08-10.job-detail/startedAt :portkey.aws.batch.-2016-08-10.job-detail/jobDefinition] :opt-un [:portkey.aws.batch.-2016-08-10.job-detail/retryStrategy :portkey.aws.batch.-2016-08-10.job-detail/createdAt :portkey.aws.batch.-2016-08-10.job-detail/stoppedAt :portkey.aws.batch.-2016-08-10.job-detail/attempts :portkey.aws.batch.-2016-08-10.job-detail/statusReason :portkey.aws.batch.-2016-08-10.job-detail/dependsOn :portkey.aws.batch.-2016-08-10.job-detail/parameters :portkey.aws.batch.-2016-08-10.job-detail/container]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cestate (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-container-detail (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.attempt-container-detail/containerInstanceArn :portkey.aws.batch.-2016-08-10.attempt-container-detail/taskArn :portkey.aws.batch.-2016-08-10.attempt-container-detail/exitCode :portkey.aws.batch.-2016-08-10.attempt-container-detail/reason :portkey.aws.batch.-2016-08-10.attempt-container-detail/logStreamName]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/job-definitions (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-definitions-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-definitions-request/jobDefinitions :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/maxResults :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/jobDefinitionName :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/status :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/volumes (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/volume :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-response/job-summary-list (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-summary-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/list-jobs-response (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.list-jobs-response/jobSummaryList] :opt-un [:portkey.aws.batch.-2016-08-10.list-jobs-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/mount-points (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/mount-point :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-summary (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.job-summary/jobId :portkey.aws.batch.-2016-08-10.job-summary/jobName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-job-queue-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.update-job-queue-response/jobQueueName :portkey.aws.batch.-2016-08-10.update-job-queue-response/jobQueueArn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.host/source-path (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/host (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.host/sourcePath]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.delete-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-compute-environment-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.delete-compute-environment-request/computeEnvironment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-orders (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/compute-environment-order :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-job-queue-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.-2016-08-10.update-job-queue-request/jobQueue] :opt-un [:portkey.aws.batch.-2016-08-10.update-job-queue-request/state :portkey.aws.batch.-2016-08-10.update-job-queue-request/priority :portkey.aws.batch.-2016-08-10.update-job-queue-request/computeEnvironmentOrder]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.retry-strategy/attempts (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/retry-strategy (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.retry-strategy/attempts]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.key-value-pair/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.key-value-pair/value (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/key-value-pair (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.key-value-pair/name :portkey.aws.batch.-2016-08-10.key-value-pair/value]))

(clojure.core/defn describe-job-definitions ([input__47307__auto__] (describe-job-definitions input__47307__auto__ portkey.aws/*http-client*)) ([input47837 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobdefinitions"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/DescribeJobDefinitionsRequest input47837)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47836] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47836)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/describe-job-definitions-response (:body response47836)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47836 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47836)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47836}))))))))))

(clojure.core/defn register-job-definition ([input__47307__auto__] (register-job-definition input__47307__auto__ portkey.aws/*http-client*)) ([input47839 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/registerjobdefinition"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/RegisterJobDefinitionRequest input47839)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47838] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47838)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/register-job-definition-response (:body response47838)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47838 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47838)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47838}))))))))))

(clojure.core/defn describe-compute-environments ([input__47307__auto__] (describe-compute-environments input__47307__auto__ portkey.aws/*http-client*)) ([input47841 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describecomputeenvironments"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/DescribeComputeEnvironmentsRequest input47841)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47840] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47840)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/describe-compute-environments-response (:body response47840)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47840 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47840)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47840}))))))))))

(clojure.core/defn update-compute-environment ([input__47307__auto__] (update-compute-environment input__47307__auto__ portkey.aws/*http-client*)) ([input47843 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/updatecomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/UpdateComputeEnvironmentRequest input47843)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47842] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47842)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/update-compute-environment-response (:body response47842)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47842 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47842)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47842}))))))))))

(clojure.core/defn delete-job-queue ([input__47307__auto__] (delete-job-queue input__47307__auto__ portkey.aws/*http-client*)) ([input47845 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deletejobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/DeleteJobQueueRequest input47845)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47844] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47844)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/delete-job-queue-response (:body response47844)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47844 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47844)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47844}))))))))))

(clojure.core/defn create-compute-environment ([input__47307__auto__] (create-compute-environment input__47307__auto__ portkey.aws/*http-client*)) ([input47847 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/createcomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/CreateComputeEnvironmentRequest input47847)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47846] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47846)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/create-compute-environment-response (:body response47846)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47846 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47846)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47846}))))))))))

(clojure.core/defn update-job-queue ([input__47307__auto__] (update-job-queue input__47307__auto__ portkey.aws/*http-client*)) ([input47849 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/updatejobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/UpdateJobQueueRequest input47849)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47848] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47848)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/update-job-queue-response (:body response47848)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47848 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47848)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47848}))))))))))

(clojure.core/defn terminate-job ([input__47307__auto__] (terminate-job input__47307__auto__ portkey.aws/*http-client*)) ([input47851 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/terminatejob"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/TerminateJobRequest input47851)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47850] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47850)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/terminate-job-response (:body response47850)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47850 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47850)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47850}))))))))))

(clojure.core/defn describe-job-queues ([input__47307__auto__] (describe-job-queues input__47307__auto__ portkey.aws/*http-client*)) ([input47853 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobqueues"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/DescribeJobQueuesRequest input47853)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47852] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47852)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/describe-job-queues-response (:body response47852)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47852 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47852)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47852}))))))))))

(clojure.core/defn submit-job ([input__47307__auto__] (submit-job input__47307__auto__ portkey.aws/*http-client*)) ([input47855 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/submitjob"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/SubmitJobRequest input47855)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47854] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47854)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/submit-job-response (:body response47854)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47854 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47854)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47854}))))))))))

(clojure.core/defn delete-compute-environment ([input__47307__auto__] (delete-compute-environment input__47307__auto__ portkey.aws/*http-client*)) ([input47857 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deletecomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/DeleteComputeEnvironmentRequest input47857)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47856] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47856)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/delete-compute-environment-response (:body response47856)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47856 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47856)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47856}))))))))))

(clojure.core/defn deregister-job-definition ([input__47307__auto__] (deregister-job-definition input__47307__auto__ portkey.aws/*http-client*)) ([input47859 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deregisterjobdefinition"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/DeregisterJobDefinitionRequest input47859)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47858] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47858)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/deregister-job-definition-response (:body response47858)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47858 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47858)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47858}))))))))))

(clojure.core/defn describe-jobs ([input__47307__auto__] (describe-jobs input__47307__auto__ portkey.aws/*http-client*)) ([input47861 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobs"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/DescribeJobsRequest input47861)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47860] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47860)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/describe-jobs-response (:body response47860)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47860 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47860)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47860}))))))))))

(clojure.core/defn create-job-queue ([input__47307__auto__] (create-job-queue input__47307__auto__ portkey.aws/*http-client*)) ([input47863 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/createjobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/CreateJobQueueRequest input47863)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47862] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47862)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/create-job-queue-response (:body response47862)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47862 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47862)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47862}))))))))))

(clojure.core/defn list-jobs ([input__47307__auto__] (list-jobs input__47307__auto__ portkey.aws/*http-client*)) ([input47865 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/listjobs"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/ListJobsRequest input47865)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47864] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47864)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/list-jobs-response (:body response47864)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47864 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47864)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47864}))))))))))

(clojure.core/defn cancel-job ([input__47307__auto__] (cancel-job input__47307__auto__ portkey.aws/*http-client*)) ([input47867 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/canceljob"), :body (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/CancelJobRequest input47867)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response47866] (clojure.core/let [errors__47310__auto__ {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}] (if (clojure.core/= nil (:status response47866)) (clojure.spec.alpha/unform :portkey.aws.batch.-2016-08-10/cancel-job-response (:body response47866)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response47866 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response47866)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response47866}))))))))))
