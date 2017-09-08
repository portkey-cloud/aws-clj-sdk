(ns portkey.aws.batch (:require [portkey.aws]))

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
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.batch/delete-compute-environment-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/compute-environments (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-compute-environments-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.describe-compute-environments-request/computeEnvironments :portkey.aws.batch.describe-compute-environments-request/maxResults :portkey.aws.batch.describe-compute-environments-request/nextToken]))

(clojure.spec.alpha/def :portkey.aws.batch/string-list (clojure.spec.alpha/coll-of :portkey.aws.batch/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.batch/job-definition-type (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"container" "container", :container "container"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

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

(clojure.spec.alpha/def :portkey.aws.batch/jqstate (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.batch.mount-point/container-path (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.mount-point/read-only (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.mount-point/source-volume (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/mount-point (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.mount-point/containerPath :portkey.aws.batch.mount-point/readOnly :portkey.aws.batch.mount-point/sourceVolume]))

(clojure.spec.alpha/def :portkey.aws.batch/cancel-job-response (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.client-exception/message (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/client-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.batch.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch/job-status (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"RUNNABLE" "RUNNABLE", :starting "STARTING", :pending "PENDING", "PENDING" "PENDING", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "STARTING" "STARTING", :runnable "RUNNABLE", "FAILED" "FAILED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

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

(clojure.spec.alpha/def :portkey.aws.batch/jqstatus (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {:valid "VALID", :deleted "DELETED", :creating "CREATING", "UPDATING" "UPDATING", :invalid "INVALID", :deleting "DELETING", "INVALID" "INVALID", "DELETING" "DELETING", "CREATING" "CREATING", :updating "UPDATING", "DELETED" "DELETED", "VALID" "VALID"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

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

(clojure.spec.alpha/def :portkey.aws.batch/crtype (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"EC2" "EC2", :ec2 "EC2", "SPOT" "SPOT", :spot "SPOT"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

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

(clojure.spec.alpha/def :portkey.aws.batch/cestatus (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {:valid "VALID", :deleted "DELETED", :creating "CREATING", "UPDATING" "UPDATING", :invalid "INVALID", :deleting "DELETING", "INVALID" "INVALID", "DELETING" "DELETING", "CREATING" "CREATING", :updating "UPDATING", "DELETED" "DELETED", "VALID" "VALID"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

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

(clojure.spec.alpha/def :portkey.aws.batch/cetype (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"MANAGED" "MANAGED", :managed "MANAGED", "UNMANAGED" "UNMANAGED", :unmanaged "UNMANAGED"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

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

(clojure.spec.alpha/def :portkey.aws.batch/cestate (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

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

(clojure.core/defn describe-job-definitions [input113223] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobdefinitions"), :body (clojure.spec.alpha/unform :portkey.aws.batch/describe-job-definitions-request input113223)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113222] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113222)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/describe-job-definitions-response (:body response113222))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113222 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113222)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113222}))])))))))
(clojure.spec.alpha/fdef describe-job-definitions :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/describe-job-definitions-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/describe-job-definitions-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/describe-job-definitions-response))

(clojure.core/defn register-job-definition [input113225] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/registerjobdefinition"), :body (clojure.spec.alpha/unform :portkey.aws.batch/register-job-definition-request input113225)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113224] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113224)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/register-job-definition-response (:body response113224))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113224 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113224)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113224}))])))))))
(clojure.spec.alpha/fdef register-job-definition :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/register-job-definition-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/register-job-definition-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/register-job-definition-response))

(clojure.core/defn describe-compute-environments [input113227] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describecomputeenvironments"), :body (clojure.spec.alpha/unform :portkey.aws.batch/describe-compute-environments-request input113227)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113226] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113226)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/describe-compute-environments-response (:body response113226))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113226 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113226)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113226}))])))))))
(clojure.spec.alpha/fdef describe-compute-environments :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/describe-compute-environments-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/describe-compute-environments-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/describe-compute-environments-response))

(clojure.core/defn update-compute-environment [input113229] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/updatecomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch/update-compute-environment-request input113229)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113228] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113228)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/update-compute-environment-response (:body response113228))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113228 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113228)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113228}))])))))))
(clojure.spec.alpha/fdef update-compute-environment :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/update-compute-environment-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/update-compute-environment-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/update-compute-environment-response))

(clojure.core/defn delete-job-queue [input113231] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deletejobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch/delete-job-queue-request input113231)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113230] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113230)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/delete-job-queue-response (:body response113230))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113230 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113230)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113230}))])))))))
(clojure.spec.alpha/fdef delete-job-queue :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/delete-job-queue-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/delete-job-queue-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/delete-job-queue-response))

(clojure.core/defn create-compute-environment [input113233] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/createcomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch/create-compute-environment-request input113233)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113232] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113232)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/create-compute-environment-response (:body response113232))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113232 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113232)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113232}))])))))))
(clojure.spec.alpha/fdef create-compute-environment :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/create-compute-environment-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/create-compute-environment-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/create-compute-environment-response))

(clojure.core/defn update-job-queue [input113235] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/updatejobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch/update-job-queue-request input113235)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113234] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113234)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/update-job-queue-response (:body response113234))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113234 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113234)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113234}))])))))))
(clojure.spec.alpha/fdef update-job-queue :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/update-job-queue-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/update-job-queue-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/update-job-queue-response))

(clojure.core/defn terminate-job [input113237] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/terminatejob"), :body (clojure.spec.alpha/unform :portkey.aws.batch/terminate-job-request input113237)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113236] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113236)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/terminate-job-response (:body response113236))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113236 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113236)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113236}))])))))))
(clojure.spec.alpha/fdef terminate-job :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/terminate-job-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/terminate-job-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/terminate-job-response))

(clojure.core/defn describe-job-queues [input113239] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobqueues"), :body (clojure.spec.alpha/unform :portkey.aws.batch/describe-job-queues-request input113239)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113238] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113238)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/describe-job-queues-response (:body response113238))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113238 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113238)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113238}))])))))))
(clojure.spec.alpha/fdef describe-job-queues :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/describe-job-queues-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/describe-job-queues-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/describe-job-queues-response))

(clojure.core/defn submit-job [input113241] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/submitjob"), :body (clojure.spec.alpha/unform :portkey.aws.batch/submit-job-request input113241)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113240] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113240)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/submit-job-response (:body response113240))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113240 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113240)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113240}))])))))))
(clojure.spec.alpha/fdef submit-job :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/submit-job-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/submit-job-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/submit-job-response))

(clojure.core/defn delete-compute-environment [input113243] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deletecomputeenvironment"), :body (clojure.spec.alpha/unform :portkey.aws.batch/delete-compute-environment-request input113243)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113242] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113242)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/delete-compute-environment-response (:body response113242))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113242 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113242)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113242}))])))))))
(clojure.spec.alpha/fdef delete-compute-environment :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/delete-compute-environment-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/delete-compute-environment-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/delete-compute-environment-response))

(clojure.core/defn deregister-job-definition [input113245] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/deregisterjobdefinition"), :body (clojure.spec.alpha/unform :portkey.aws.batch/deregister-job-definition-request input113245)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113244] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113244)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/deregister-job-definition-response (:body response113244))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113244 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113244)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113244}))])))))))
(clojure.spec.alpha/fdef deregister-job-definition :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/deregister-job-definition-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/deregister-job-definition-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/deregister-job-definition-response))

(clojure.core/defn describe-jobs [input113247] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/describejobs"), :body (clojure.spec.alpha/unform :portkey.aws.batch/describe-jobs-request input113247)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113246] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113246)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/describe-jobs-response (:body response113246))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113246 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113246)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113246}))])))))))
(clojure.spec.alpha/fdef describe-jobs :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/describe-jobs-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/describe-jobs-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/describe-jobs-response))

(clojure.core/defn create-job-queue [input113249] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/createjobqueue"), :body (clojure.spec.alpha/unform :portkey.aws.batch/create-job-queue-request input113249)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113248] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113248)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/create-job-queue-response (:body response113248))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113248 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113248)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113248}))])))))))
(clojure.spec.alpha/fdef create-job-queue :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/create-job-queue-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/create-job-queue-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/create-job-queue-response))

(clojure.core/defn list-jobs [input113251] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/listjobs"), :body (clojure.spec.alpha/unform :portkey.aws.batch/list-jobs-request input113251)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113250] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113250)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/list-jobs-response (:body response113250))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113250 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113250)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113250}))])))))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/list-jobs-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/list-jobs-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/list-jobs-response))

(clojure.core/defn cancel-job [input113253] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.batch/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/canceljob"), :body (clojure.spec.alpha/unform :portkey.aws.batch/cancel-job-request input113253)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113252] (clojure.core/let [errors__109313__auto__ {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}] (if (clojure.core/= nil (:status response113252)) [:result (clojure.spec.alpha/unform :portkey.aws.batch/cancel-job-response (:body response113252))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113252 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113252)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113252}))])))))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.batch/cancel-job-request) :async (clojure.spec.alpha/tuple :portkey.aws.batch/cancel-job-request (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.batch/cancel-job-response))
