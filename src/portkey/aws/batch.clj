(ns portkey.aws.batch (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "batch", :region "ap-northeast-1"},
    :ssl-common-name "batch.ap-northeast-1.amazonaws.com",
    :endpoint "https://batch.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "batch", :region "eu-west-1"},
    :ssl-common-name "batch.eu-west-1.amazonaws.com",
    :endpoint "https://batch.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "batch", :region "us-east-2"},
    :ssl-common-name "batch.us-east-2.amazonaws.com",
    :endpoint "https://batch.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "batch", :region "ap-southeast-2"},
    :ssl-common-name "batch.ap-southeast-2.amazonaws.com",
    :endpoint "https://batch.ap-southeast-2.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "batch", :region "ap-southeast-1"},
    :ssl-common-name "batch.ap-southeast-1.amazonaws.com",
    :endpoint "https://batch.ap-southeast-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "batch", :region "eu-central-1"},
    :ssl-common-name "batch.eu-central-1.amazonaws.com",
    :endpoint "https://batch.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "batch", :region "eu-west-2"},
    :ssl-common-name "batch.eu-west-2.amazonaws.com",
    :endpoint "https://batch.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "batch", :region "us-west-2"},
    :ssl-common-name "batch.us-west-2.amazonaws.com",
    :endpoint "https://batch.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "batch", :region "us-east-1"},
    :ssl-common-name "batch.us-east-1.amazonaws.com",
    :endpoint "https://batch.us-east-1.amazonaws.com"}})

(clojure.spec.alpha/def :portkey.aws.batch/delete-compute-environment-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/compute-environments (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-compute-environments-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.describe-compute-environments-request/computeEnvironments :portkey.aws.batch.describe-compute-environments-request/maxResults :portkey.aws.batch.describe-compute-environments-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch/string-list (clojure.spec.alpha/coll-of :portkey.aws.batch/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch/job-definition-type (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"container" "container", :container "container"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/create-job-queue-response (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.create-job-queue-response/jobQueueName :portkey.aws.batch.create-job-queue-response/jobQueueArn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/job-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/depends-on (clojure.spec.alpha/and :portkey.aws.batch/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/parameters (clojure.spec.alpha/and :portkey.aws.batch/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/container-overrides (clojure.spec.alpha/and :portkey.aws.batch/container-overrides))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch/submit-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.submit-job-request/jobName :portkey.aws.batch.submit-job-request/jobQueue :portkey.aws.batch.submit-job-request/jobDefinition] :opt-un [:portkey.aws.batch.submit-job-request/dependsOn :portkey.aws.batch.submit-job-request/parameters :portkey.aws.batch.submit-job-request/containerOverrides :portkey.aws.batch.submit-job-request/retryStrategy]))

(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-order/order (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-order/compute-environment (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/compute-environment-order (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.compute-environment-order/order :portkey.aws.batch.compute-environment-order/computeEnvironment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch/compute-resource-update))
(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/update-compute-environment-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.update-compute-environment-request/computeEnvironment] :opt-un [:portkey.aws.batch.update-compute-environment-request/state :portkey.aws.batch.update-compute-environment-request/computeResources :portkey.aws.batch.update-compute-environment-request/serviceRole]))

(clojure.spec.alpha/def :portkey.aws.batch/jqstate (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.mount-point/container-path (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.mount-point/read-only (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.mount-point/source-volume (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/mount-point (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.mount-point/containerPath :portkey.aws.batch.mount-point/readOnly :portkey.aws.batch.mount-point/sourceVolume]))

(clojure.spec.alpha/def :portkey.aws.batch/cancel-job-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.client-exception/message (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/client-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch/job-status (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"RUNNABLE" "RUNNABLE", :starting "STARTING", :pending "PENDING", "PENDING" "PENDING", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "STARTING" "STARTING", :runnable "RUNNABLE", "FAILED" "FAILED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch/compute-environment-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch/compute-environment-detail :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-response/compute-environments (clojure.spec.alpha/and :portkey.aws.batch/compute-environment-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-response/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-compute-environments-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.describe-compute-environments-response/computeEnvironments :portkey.aws.batch.describe-compute-environments-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.volume/host (clojure.spec.alpha/and :portkey.aws.batch/host))
(clojure.spec.alpha/def :portkey.aws.batch.volume/name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/volume (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.volume/host :portkey.aws.batch.volume/name]))

(clojure.spec.alpha/def :portkey.aws.batch/delete-job-queue-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/deregister-job-definition-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/create-compute-environment-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.create-compute-environment-response/computeEnvironmentName :portkey.aws.batch.create-compute-environment-response/computeEnvironmentArn]))

(clojure.spec.alpha/def :portkey.aws.batch/tags-map (clojure.spec.alpha/map-of :portkey.aws.batch/string :portkey.aws.batch/string))

(clojure.spec.alpha/def :portkey.aws.batch/attempt-details (clojure.spec.alpha/coll-of :portkey.aws.batch/attempt-detail :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.batch/key-value-pair :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/job-status (clojure.spec.alpha/and :portkey.aws.batch/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/list-jobs-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.list-jobs-request/jobQueue] :opt-un [:portkey.aws.batch.list-jobs-request/jobStatus :portkey.aws.batch.list-jobs-request/maxResults :portkey.aws.batch.list-jobs-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.compute-resource-update/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource-update/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource-update/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/compute-resource-update (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.compute-resource-update/minvCpus :portkey.aws.batch.compute-resource-update/maxvCpus :portkey.aws.batch.compute-resource-update/desiredvCpus]))

(clojure.spec.alpha/def :portkey.aws.batch.job-definition/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/revision (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/status (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/type (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/parameters (clojure.spec.alpha/and :portkey.aws.batch/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/container-properties (clojure.spec.alpha/and :portkey.aws.batch/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch/job-definition (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.job-definition/jobDefinitionName :portkey.aws.batch.job-definition/jobDefinitionArn :portkey.aws.batch.job-definition/revision :portkey.aws.batch.job-definition/type] :opt-un [:portkey.aws.batch.job-definition/status :portkey.aws.batch.job-definition/parameters :portkey.aws.batch.job-definition/retryStrategy :portkey.aws.batch.job-definition/containerProperties]))

(clojure.spec.alpha/def :portkey.aws.batch.container-detail/ulimits (clojure.spec.alpha/and :portkey.aws.batch/ulimits))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/command (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/mount-points (clojure.spec.alpha/and :portkey.aws.batch/mount-points))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/image (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/user (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/volumes (clojure.spec.alpha/and :portkey.aws.batch/volumes))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/privileged (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/vcpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/memory (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/environment (clojure.spec.alpha/and :portkey.aws.batch/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/job-role-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/container-detail (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.container-detail/ulimits :portkey.aws.batch.container-detail/command :portkey.aws.batch.container-detail/mountPoints :portkey.aws.batch.container-detail/image :portkey.aws.batch.container-detail/exitCode :portkey.aws.batch.container-detail/user :portkey.aws.batch.container-detail/volumes :portkey.aws.batch.container-detail/privileged :portkey.aws.batch.container-detail/vcpus :portkey.aws.batch.container-detail/readonlyRootFilesystem :portkey.aws.batch.container-detail/taskArn :portkey.aws.batch.container-detail/memory :portkey.aws.batch.container-detail/logStreamName :portkey.aws.batch.container-detail/containerInstanceArn :portkey.aws.batch.container-detail/environment :portkey.aws.batch.container-detail/reason :portkey.aws.batch.container-detail/jobRoleArn]))

(clojure.spec.alpha/def :portkey.aws.batch.deregister-job-definition-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/deregister-job-definition-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.deregister-job-definition-request/jobDefinition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/jqstatus (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {:valid "VALID", :deleted "DELETED", :creating "CREATING", "UPDATING" "UPDATING", :invalid "INVALID", :deleting "DELETING", "INVALID" "INVALID", "DELETING" "DELETING", "CREATING" "CREATING", :updating "UPDATING", "DELETED" "DELETED", "VALID" "VALID"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-request/job-queues (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-job-queues-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.describe-job-queues-request/jobQueues :portkey.aws.batch.describe-job-queues-request/maxResults :portkey.aws.batch.describe-job-queues-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/type (clojure.spec.alpha/and :portkey.aws.batch/cetype))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/create-compute-environment-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.create-compute-environment-request/computeEnvironmentName :portkey.aws.batch.create-compute-environment-request/type :portkey.aws.batch.create-compute-environment-request/serviceRole] :opt-un [:portkey.aws.batch.create-compute-environment-request/state :portkey.aws.batch.create-compute-environment-request/computeResources]))

(clojure.spec.alpha/def :portkey.aws.batch/terminate-job-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/type (clojure.spec.alpha/and :portkey.aws.batch/job-definition-type))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/parameters (clojure.spec.alpha/and :portkey.aws.batch/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/container-properties (clojure.spec.alpha/and :portkey.aws.batch/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch/register-job-definition-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.register-job-definition-request/jobDefinitionName :portkey.aws.batch.register-job-definition-request/type] :opt-un [:portkey.aws.batch.register-job-definition-request/parameters :portkey.aws.batch.register-job-definition-request/containerProperties :portkey.aws.batch.register-job-definition-request/retryStrategy]))

(clojure.spec.alpha/def :portkey.aws.batch.cancel-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.cancel-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/cancel-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.cancel-job-request/jobId :portkey.aws.batch.cancel-job-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-response/job-queues (clojure.spec.alpha/and :portkey.aws.batch/job-queue-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-response/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-job-queues-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.describe-job-queues-response/jobQueues :portkey.aws.batch.describe-job-queues-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.job-dependency/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/job-dependency (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.job-dependency/jobId]))

(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/ec2-key-pair (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/spot-iam-fleet-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/subnets (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/bid-percentage (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/tags (clojure.spec.alpha/and :portkey.aws.batch/tags-map))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/image-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/instance-types (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/type (clojure.spec.alpha/and :portkey.aws.batch/crtype))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/security-group-ids (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/instance-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/compute-resource (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.compute-resource/type :portkey.aws.batch.compute-resource/minvCpus :portkey.aws.batch.compute-resource/maxvCpus :portkey.aws.batch.compute-resource/instanceTypes :portkey.aws.batch.compute-resource/subnets :portkey.aws.batch.compute-resource/securityGroupIds :portkey.aws.batch.compute-resource/instanceRole] :opt-un [:portkey.aws.batch.compute-resource/ec2KeyPair :portkey.aws.batch.compute-resource/spotIamFleetRole :portkey.aws.batch.compute-resource/bidPercentage :portkey.aws.batch.compute-resource/tags :portkey.aws.batch.compute-resource/imageId :portkey.aws.batch.compute-resource/desiredvCpus]))

(clojure.spec.alpha/def :portkey.aws.batch/job-queue-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-queue-detail :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.terminate-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.terminate-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/terminate-job-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.terminate-job-request/jobId :portkey.aws.batch.terminate-job-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/job-definition-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-definition :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch/crtype (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"EC2" "EC2", :ec2 "EC2", "SPOT" "SPOT", :spot "SPOT"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-request/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch/create-job-queue-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.create-job-queue-request/jobQueueName :portkey.aws.batch.create-job-queue-request/priority :portkey.aws.batch.create-job-queue-request/computeEnvironmentOrder] :opt-un [:portkey.aws.batch.create-job-queue-request/state]))

(clojure.spec.alpha/def :portkey.aws.batch/job-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-detail :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.delete-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/delete-job-queue-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.delete-job-queue-request/jobQueue] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/job-summary-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-summary :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/update-compute-environment-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.update-compute-environment-response/computeEnvironmentName :portkey.aws.batch.update-compute-environment-response/computeEnvironmentArn]))

(clojure.spec.alpha/def :portkey.aws.batch.attempt-detail/container (clojure.spec.alpha/and :portkey.aws.batch/attempt-container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/attempt-detail (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.attempt-detail/container :portkey.aws.batch.attempt-detail/startedAt :portkey.aws.batch.attempt-detail/stoppedAt :portkey.aws.batch.attempt-detail/statusReason]))

(clojure.spec.alpha/def :portkey.aws.batch.submit-job-response/job-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-response/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/submit-job-response (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.submit-job-response/jobName :portkey.aws.batch.submit-job-response/jobId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.batch/job-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch/describe-jobs-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.describe-jobs-response/jobs]))

(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-response/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-response/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-response/revision (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/register-job-definition-response (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.register-job-definition-response/jobDefinitionName :portkey.aws.batch.register-job-definition-response/jobDefinitionArn :portkey.aws.batch.register-job-definition-response/revision] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-response/job-definitions (clojure.spec.alpha/and :portkey.aws.batch/job-definition-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-job-definitions-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.describe-job-definitions-response/jobDefinitions :portkey.aws.batch.describe-job-definitions-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/service-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/status (clojure.spec.alpha/and :portkey.aws.batch/cestatus))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/compute-resources (clojure.spec.alpha/and :portkey.aws.batch/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/type (clojure.spec.alpha/and :portkey.aws.batch/cetype))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/state (clojure.spec.alpha/and :portkey.aws.batch/cestate))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/compute-environment-detail (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.compute-environment-detail/computeEnvironmentName :portkey.aws.batch.compute-environment-detail/computeEnvironmentArn :portkey.aws.batch.compute-environment-detail/ecsClusterArn] :opt-un [:portkey.aws.batch.compute-environment-detail/serviceRole :portkey.aws.batch.compute-environment-detail/status :portkey.aws.batch.compute-environment-detail/computeResources :portkey.aws.batch.compute-environment-detail/type :portkey.aws.batch.compute-environment-detail/state :portkey.aws.batch.compute-environment-detail/statusReason]))

(clojure.spec.alpha/def :portkey.aws.batch/cestatus (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {:valid "VALID", :deleted "DELETED", :creating "CREATING", "UPDATING" "UPDATING", :invalid "INVALID", :deleting "DELETING", "INVALID" "INVALID", "DELETING" "DELETING", "CREATING" "CREATING", :updating "UPDATING", "DELETED" "DELETED", "VALID" "VALID"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.batch/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.batch.server-exception/message (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/server-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch/parameters-map (clojure.spec.alpha/map-of :portkey.aws.batch/string :portkey.aws.batch/string))

(clojure.spec.alpha/def :portkey.aws.batch.container-overrides/vcpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-overrides/memory (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-overrides/command (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.container-overrides/environment (clojure.spec.alpha/and :portkey.aws.batch/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch/container-overrides (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.container-overrides/vcpus :portkey.aws.batch.container-overrides/memory :portkey.aws.batch.container-overrides/command :portkey.aws.batch.container-overrides/environment]))

(clojure.spec.alpha/def :portkey.aws.batch.describe-jobs-request/jobs (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch/describe-jobs-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.describe-jobs-request/jobs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.batch/job-dependency-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-dependency :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/state (clojure.spec.alpha/and :portkey.aws.batch/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/status (clojure.spec.alpha/and :portkey.aws.batch/jqstatus))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/priority (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch/job-queue-detail (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.job-queue-detail/jobQueueName :portkey.aws.batch.job-queue-detail/jobQueueArn :portkey.aws.batch.job-queue-detail/state :portkey.aws.batch.job-queue-detail/priority :portkey.aws.batch.job-queue-detail/computeEnvironmentOrder] :opt-un [:portkey.aws.batch.job-queue-detail/status :portkey.aws.batch.job-queue-detail/statusReason]))

(clojure.spec.alpha/def :portkey.aws.batch/ulimits (clojure.spec.alpha/coll-of :portkey.aws.batch/ulimit :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch/cetype (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"MANAGED" "MANAGED", :managed "MANAGED", "UNMANAGED" "UNMANAGED", :unmanaged "UNMANAGED"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.container-properties/ulimits (clojure.spec.alpha/and :portkey.aws.batch/ulimits))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/command (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/mount-points (clojure.spec.alpha/and :portkey.aws.batch/mount-points))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/image (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/user (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/volumes (clojure.spec.alpha/and :portkey.aws.batch/volumes))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/privileged (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/vcpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/memory (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/environment (clojure.spec.alpha/and :portkey.aws.batch/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/job-role-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/container-properties (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.container-properties/image :portkey.aws.batch.container-properties/vcpus :portkey.aws.batch.container-properties/memory] :opt-un [:portkey.aws.batch.container-properties/ulimits :portkey.aws.batch.container-properties/command :portkey.aws.batch.container-properties/mountPoints :portkey.aws.batch.container-properties/user :portkey.aws.batch.container-properties/volumes :portkey.aws.batch.container-properties/privileged :portkey.aws.batch.container-properties/readonlyRootFilesystem :portkey.aws.batch.container-properties/environment :portkey.aws.batch.container-properties/jobRoleArn]))

(clojure.spec.alpha/def :portkey.aws.batch.ulimit/hard-limit (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.ulimit/name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.ulimit/soft-limit (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/ulimit (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.ulimit/hardLimit :portkey.aws.batch.ulimit/name :portkey.aws.batch.ulimit/softLimit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.job-detail/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/created-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/status (clojure.spec.alpha/and :portkey.aws.batch/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/attempts (clojure.spec.alpha/and :portkey.aws.batch/attempt-details))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/depends-on (clojure.spec.alpha/and :portkey.aws.batch/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/parameters (clojure.spec.alpha/and :portkey.aws.batch/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/job-definition (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/container (clojure.spec.alpha/and :portkey.aws.batch/container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/job-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/job-detail (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.job-detail/jobName :portkey.aws.batch.job-detail/jobId :portkey.aws.batch.job-detail/jobQueue :portkey.aws.batch.job-detail/status :portkey.aws.batch.job-detail/startedAt :portkey.aws.batch.job-detail/jobDefinition] :opt-un [:portkey.aws.batch.job-detail/retryStrategy :portkey.aws.batch.job-detail/createdAt :portkey.aws.batch.job-detail/stoppedAt :portkey.aws.batch.job-detail/attempts :portkey.aws.batch.job-detail/statusReason :portkey.aws.batch.job-detail/dependsOn :portkey.aws.batch.job-detail/parameters :portkey.aws.batch.job-detail/container]))

(clojure.spec.alpha/def :portkey.aws.batch/cestate (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/attempt-container-detail (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.attempt-container-detail/containerInstanceArn :portkey.aws.batch.attempt-container-detail/taskArn :portkey.aws.batch.attempt-container-detail/exitCode :portkey.aws.batch.attempt-container-detail/reason :portkey.aws.batch.attempt-container-detail/logStreamName]))

(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/job-definitions (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/status (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-job-definitions-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.describe-job-definitions-request/jobDefinitions :portkey.aws.batch.describe-job-definitions-request/maxResults :portkey.aws.batch.describe-job-definitions-request/jobDefinitionName :portkey.aws.batch.describe-job-definitions-request/status :portkey.aws.batch.describe-job-definitions-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch/volumes (clojure.spec.alpha/coll-of :portkey.aws.batch/volume :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-response/job-summary-list (clojure.spec.alpha/and :portkey.aws.batch/job-summary-list))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/list-jobs-response (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.list-jobs-response/jobSummaryList] :opt-un [:portkey.aws.batch.list-jobs-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch/mount-points (clojure.spec.alpha/coll-of :portkey.aws.batch/mount-point :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.job-summary/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/job-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/job-summary (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.job-summary/jobId :portkey.aws.batch.job-summary/jobName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/update-job-queue-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.update-job-queue-response/jobQueueName :portkey.aws.batch.update-job-queue-response/jobQueueArn]))

(clojure.spec.alpha/def :portkey.aws.batch.host/source-path (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/host (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.host/sourcePath]))

(clojure.spec.alpha/def :portkey.aws.batch.delete-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/delete-compute-environment-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.delete-compute-environment-request/computeEnvironment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/compute-environment-orders (clojure.spec.alpha/coll-of :portkey.aws.batch/compute-environment-order :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch/jqstate))
(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch/update-job-queue-request (portkey.awsgen/json-keys :req-un [:portkey.aws.batch.update-job-queue-request/jobQueue] :opt-un [:portkey.aws.batch.update-job-queue-request/state :portkey.aws.batch.update-job-queue-request/priority :portkey.aws.batch.update-job-queue-request/computeEnvironmentOrder]))

(clojure.spec.alpha/def :portkey.aws.batch.retry-strategy/attempts (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/retry-strategy (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.retry-strategy/attempts]))

(clojure.spec.alpha/def :portkey.aws.batch/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.batch.key-value-pair/name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.key-value-pair/value (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/key-value-pair (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.key-value-pair/name :portkey.aws.batch.key-value-pair/value]))

(clojure.core/defn describe-job-definitions ([input__56767__auto__] (describe-job-definitions input__56767__auto__ portkey.aws/*http-client*)) ([input57530 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobdefinitions"), :body (clojure.spec.alpha/unform :portkey.aws.batch/DescribeJobDefinitionsRequest input57530)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57529] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57529)) (clojure.spec.alpha/unform :portkey.aws.batch/describe-job-definitions-response (:body response57529)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57529 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57529)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57529})))))))))))

(clojure.core/defn register-job-definition ([input__56767__auto__] (register-job-definition input__56767__auto__ portkey.aws/*http-client*)) ([input57532 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/registerjobdefinition"), :body (clojure.spec.alpha/unform :portkey.aws.batch/RegisterJobDefinitionRequest input57532)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57531] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57531)) (clojure.spec.alpha/unform :portkey.aws.batch/register-job-definition-response (:body response57531)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57531 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57531)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57531})))))))))))

(clojure.core/defn describe-compute-environments ([input__56767__auto__] (describe-compute-environments input__56767__auto__ portkey.aws/*http-client*)) ([input57534 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describecomputeenvironments"), :body (clojure.spec.alpha/unform :portkey.aws.batch/DescribeComputeEnvironmentsRequest input57534)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57533] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57533)) (clojure.spec.alpha/unform :portkey.aws.batch/describe-compute-environments-response (:body response57533)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57533 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57533)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57533})))))))))))

(clojure.core/defn update-compute-environment ([input__56767__auto__] (update-compute-environment input__56767__auto__ portkey.aws/*http-client*)) ([input57536 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/updatecomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch/UpdateComputeEnvironmentRequest input57536)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57535] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57535)) (clojure.spec.alpha/unform :portkey.aws.batch/update-compute-environment-response (:body response57535)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57535 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57535)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57535})))))))))))

(clojure.core/defn delete-job-queue ([input__56767__auto__] (delete-job-queue input__56767__auto__ portkey.aws/*http-client*)) ([input57538 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deletejobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch/DeleteJobQueueRequest input57538)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57537] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57537)) (clojure.spec.alpha/unform :portkey.aws.batch/delete-job-queue-response (:body response57537)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57537 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57537)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57537})))))))))))

(clojure.core/defn create-compute-environment ([input__56767__auto__] (create-compute-environment input__56767__auto__ portkey.aws/*http-client*)) ([input57540 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/createcomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch/CreateComputeEnvironmentRequest input57540)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57539] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57539)) (clojure.spec.alpha/unform :portkey.aws.batch/create-compute-environment-response (:body response57539)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57539 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57539)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57539})))))))))))

(clojure.core/defn update-job-queue ([input__56767__auto__] (update-job-queue input__56767__auto__ portkey.aws/*http-client*)) ([input57542 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/updatejobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch/UpdateJobQueueRequest input57542)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57541] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57541)) (clojure.spec.alpha/unform :portkey.aws.batch/update-job-queue-response (:body response57541)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57541 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57541)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57541})))))))))))

(clojure.core/defn terminate-job ([input__56767__auto__] (terminate-job input__56767__auto__ portkey.aws/*http-client*)) ([input57544 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/terminatejob"), :body (clojure.spec.alpha/unform :portkey.aws.batch/TerminateJobRequest input57544)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57543] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57543)) (clojure.spec.alpha/unform :portkey.aws.batch/terminate-job-response (:body response57543)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57543 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57543)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57543})))))))))))

(clojure.core/defn describe-job-queues ([input__56767__auto__] (describe-job-queues input__56767__auto__ portkey.aws/*http-client*)) ([input57546 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobqueues"), :body (clojure.spec.alpha/unform :portkey.aws.batch/DescribeJobQueuesRequest input57546)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57545] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57545)) (clojure.spec.alpha/unform :portkey.aws.batch/describe-job-queues-response (:body response57545)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57545 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57545)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57545})))))))))))

(clojure.core/defn submit-job ([input__56767__auto__] (submit-job input__56767__auto__ portkey.aws/*http-client*)) ([input57548 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/submitjob"), :body (clojure.spec.alpha/unform :portkey.aws.batch/SubmitJobRequest input57548)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57547] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57547)) (clojure.spec.alpha/unform :portkey.aws.batch/submit-job-response (:body response57547)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57547 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57547)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57547})))))))))))

(clojure.core/defn delete-compute-environment ([input__56767__auto__] (delete-compute-environment input__56767__auto__ portkey.aws/*http-client*)) ([input57550 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deletecomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch/DeleteComputeEnvironmentRequest input57550)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57549] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57549)) (clojure.spec.alpha/unform :portkey.aws.batch/delete-compute-environment-response (:body response57549)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57549 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57549)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57549})))))))))))

(clojure.core/defn deregister-job-definition ([input__56767__auto__] (deregister-job-definition input__56767__auto__ portkey.aws/*http-client*)) ([input57552 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deregisterjobdefinition"), :body (clojure.spec.alpha/unform :portkey.aws.batch/DeregisterJobDefinitionRequest input57552)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57551] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57551)) (clojure.spec.alpha/unform :portkey.aws.batch/deregister-job-definition-response (:body response57551)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57551 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57551)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57551})))))))))))

(clojure.core/defn describe-jobs ([input__56767__auto__] (describe-jobs input__56767__auto__ portkey.aws/*http-client*)) ([input57554 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobs"), :body (clojure.spec.alpha/unform :portkey.aws.batch/DescribeJobsRequest input57554)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57553] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57553)) (clojure.spec.alpha/unform :portkey.aws.batch/describe-jobs-response (:body response57553)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57553 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57553)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57553})))))))))))

(clojure.core/defn create-job-queue ([input__56767__auto__] (create-job-queue input__56767__auto__ portkey.aws/*http-client*)) ([input57556 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/createjobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch/CreateJobQueueRequest input57556)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57555] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57555)) (clojure.spec.alpha/unform :portkey.aws.batch/create-job-queue-response (:body response57555)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57555 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57555)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57555})))))))))))

(clojure.core/defn list-jobs ([input__56767__auto__] (list-jobs input__56767__auto__ portkey.aws/*http-client*)) ([input57558 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/listjobs"), :body (clojure.spec.alpha/unform :portkey.aws.batch/ListJobsRequest input57558)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57557] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57557)) (clojure.spec.alpha/unform :portkey.aws.batch/list-jobs-response (:body response57557)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57557 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57557)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57557})))))))))))

(clojure.core/defn cancel-job ([input__56767__auto__] (cancel-job input__56767__auto__ portkey.aws/*http-client*)) ([input57560 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/canceljob"), :body (clojure.spec.alpha/unform :portkey.aws.batch/CancelJobRequest input57560)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57559] (clojure.core/let [errors__56772__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response57559)) (clojure.spec.alpha/unform :portkey.aws.batch/cancel-job-response (:body response57559)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57559 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57559)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57559})))))))))))
