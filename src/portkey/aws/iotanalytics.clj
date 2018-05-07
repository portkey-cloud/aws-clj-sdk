(ns portkey.aws.iotanalytics (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.iotanalytics/messages (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/message) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datastores-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datastores-request/nextToken :portkey.aws.iotanalytics.list-datastores-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.describe-pipeline-request/pipelineName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-datastore-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.describe-datastore-request/datastoreName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/activity-batch-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__)) (fn* [p1__16204__16205__auto__] (clojure.core/<= p1__16204__16205__auto__ 1000))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/attribute-names (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/attribute-name :min-count 1 :max-count 50) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-response/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-response/pipeline-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-pipeline-response/pipelineName :portkey.aws.iotanalytics.create-pipeline-response/pipelineArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/datastore-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-datastore-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-datastore-response/datastoreName :portkey.aws.iotanalytics.create-datastore-response/datastoreArn :portkey.aws.iotanalytics.create-datastore-response/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/end-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset/name :portkey.aws.iotanalytics.dataset/arn :portkey.aws.iotanalytics.dataset/actions :portkey.aws.iotanalytics.dataset/triggers :portkey.aws.iotanalytics.dataset/status :portkey.aws.iotanalytics.dataset/creationTime :portkey.aws.iotanalytics.dataset/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-channel-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.update-channel-request/channelName] :opt-un [:portkey.aws.iotanalytics.update-channel-request/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-activity/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.datastore-activity/name :portkey.aws.iotanalytics.datastore-activity/datastoreName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.math-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.math-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.math-activity/math (clojure.spec.alpha/and :portkey.aws.iotanalytics/math-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.math-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/math-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.math-activity/name :portkey.aws.iotanalytics.math-activity/attribute :portkey.aws.iotanalytics.math-activity/math] :opt-un [:portkey.aws.iotanalytics.math-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-pipelines-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-pipelines-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-pipelines-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-pipelines-request/nextToken :portkey.aws.iotanalytics.list-pipelines-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/entry-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.invalid-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/message-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.start-pipeline-reprocessing-response/reprocessing-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/start-pipeline-reprocessing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.start-pipeline-reprocessing-response/reprocessingId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.run-pipeline-activity-response/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.run-pipeline-activity-response/log-result (clojure.spec.alpha/and :portkey.aws.iotanalytics/log-result))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/run-pipeline-activity-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.run-pipeline-activity-response/payloads :portkey.aws.iotanalytics.run-pipeline-activity-response/logResult] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.create-dataset-request/datasetName :portkey.aws.iotanalytics.create-dataset-request/actions] :opt-un [:portkey.aws.iotanalytics.create-dataset-request/triggers] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-request/pipeline-activities (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.create-pipeline-request/pipelineName :portkey.aws.iotanalytics.create-pipeline-request/pipelineActivities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-response/datastore-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datastores-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datastores-response/datastoreSummaries :portkey.aws.iotanalytics.list-datastores-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/start-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/thing-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/device-shadow-enrich-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.device-shadow-enrich-activity/name :portkey.aws.iotanalytics.device-shadow-enrich-activity/attribute :portkey.aws.iotanalytics.device-shadow-enrich-activity/thingName :portkey.aws.iotanalytics.device-shadow-enrich-activity/roleArn] :opt-un [:portkey.aws.iotanalytics.device-shadow-enrich-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.select-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.select-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-names))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.select-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/select-attributes-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.select-attributes-activity/name :portkey.aws.iotanalytics.select-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.select-attributes-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-request/messages (clojure.spec.alpha/and :portkey.aws.iotanalytics/messages))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.batch-put-message-request/channelName :portkey.aws.iotanalytics.batch-put-message-request/messages] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-state (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/channel-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-channel-response/channelName :portkey.aws.iotanalytics.create-channel-response/channelArn :portkey.aws.iotanalytics.create-channel-response/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 20 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-summary/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.datastore-summary/datastoreName :portkey.aws.iotanalytics.datastore-summary/status :portkey.aws.iotanalytics.datastore-summary/creationTime :portkey.aws.iotanalytics.datastore-summary/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/message-payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/activities (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/reprocessing-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.pipeline/name :portkey.aws.iotanalytics.pipeline/arn :portkey.aws.iotanalytics.pipeline/activities :portkey.aws.iotanalytics.pipeline/reprocessingSummaries :portkey.aws.iotanalytics.pipeline/creationTime :portkey.aws.iotanalytics.pipeline/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-datastore-response/datastore (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-datastore-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-datastore-response/datastore] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-channel-response/channel (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-channel-response/channel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-datastore-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-datastore-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.update-datastore-request/datastoreName] :opt-un [:portkey.aws.iotanalytics.update-datastore-request/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.put-logging-options-request/logging-options (clojure.spec.alpha/and :portkey.aws.iotanalytics/logging-options))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/put-logging-options-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.put-logging-options-request/loggingOptions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.logging-options/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.logging-options/level (clojure.spec.alpha/and :portkey.aws.iotanalytics/logging-level))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.logging-options/enabled (clojure.spec.alpha/and :portkey.aws.iotanalytics/logging-enabled))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/logging-options (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.logging-options/roleArn :portkey.aws.iotanalytics.logging-options/level :portkey.aws.iotanalytics.logging-options/enabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-activities (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/pipeline-activity :min-count 1 :max-count 25) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/message-payloads (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/message-payload :min-count 1 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/datastore-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.resource-already-exists-exception/message :portkey.aws.iotanalytics/resourceId :portkey.aws.iotanalytics/resourceArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-entries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-entry) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"RUNNING" "RUNNING", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED", "CANCELLED" "CANCELLED", :cancelled "CANCELLED", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.channel-summary/channelName :portkey.aws.iotanalytics.channel-summary/status :portkey.aws.iotanalytics.channel-summary/creationTime :portkey.aws.iotanalytics.channel-summary/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-logging-options-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/logging-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.channel-activity/name :portkey.aws.iotanalytics.channel-activity/channelName] :opt-un [:portkey.aws.iotanalytics.channel-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.create-channel-request/channelName] :opt-un [:portkey.aws.iotanalytics.create-channel-request/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-response/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-response/dataset-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-dataset-response/datasetName :portkey.aws.iotanalytics.create-dataset-response/datasetArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.reprocessing-summary/id (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.reprocessing-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.reprocessing-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.reprocessing-summary/id :portkey.aws.iotanalytics.reprocessing-summary/status :portkey.aws.iotanalytics.reprocessing-summary/creationTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datasets-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datasets-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datasets-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datasets-request/nextToken :portkey.aws.iotanalytics.list-datasets-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.delete-pipeline-request/pipelineName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.filter-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.filter-activity/filter (clojure.spec.alpha/and :portkey.aws.iotanalytics/filter-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.filter-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/filter-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.filter-activity/name :portkey.aws.iotanalytics.filter-activity/filter] :opt-un [:portkey.aws.iotanalytics.filter-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-request/version-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/get-dataset-content-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.get-dataset-content-request/datasetName] :opt-un [:portkey.aws.iotanalytics.get-dataset-content-request/versionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/presigneduri (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-channels-response/channel-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-channels-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-channels-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-channels-response/channelSummaries :portkey.aws.iotanalytics.list-channels-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/attribute-name-mapping (clojure.spec.alpha/map-of :portkey.aws.iotanalytics/attribute-name :portkey.aws.iotanalytics/attribute-name))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/lambda-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 64)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_-]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/device-shadow-enrich (clojure.spec.alpha/and :portkey.aws.iotanalytics/device-shadow-enrich-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/device-registry-enrich (clojure.spec.alpha/and :portkey.aws.iotanalytics/device-registry-enrich-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/select-attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/select-attributes-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/math (clojure.spec.alpha/and :portkey.aws.iotanalytics/math-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/add-attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/add-attributes-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/filter (clojure.spec.alpha/and :portkey.aws.iotanalytics/filter-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/remove-attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/remove-attributes-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/channel (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/datastore (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-activity/lambda (clojure.spec.alpha/and :portkey.aws.iotanalytics/lambda-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-activity (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.pipeline-activity/deviceShadowEnrich :portkey.aws.iotanalytics.pipeline-activity/deviceRegistryEnrich :portkey.aws.iotanalytics.pipeline-activity/selectAttributes :portkey.aws.iotanalytics.pipeline-activity/math :portkey.aws.iotanalytics.pipeline-activity/addAttributes :portkey.aws.iotanalytics.pipeline-activity/filter :portkey.aws.iotanalytics.pipeline-activity/removeAttributes :portkey.aws.iotanalytics.pipeline-activity/channel :portkey.aws.iotanalytics.pipeline-activity/datastore :portkey.aws.iotanalytics.pipeline-activity/lambda] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-summary/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-summary/reprocessing-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.pipeline-summary/pipelineName :portkey.aws.iotanalytics.pipeline-summary/reprocessingSummaries :portkey.aws.iotanalytics.pipeline-summary/creationTime :portkey.aws.iotanalytics.pipeline-summary/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.sql-query-dataset-action/sql-query (clojure.spec.alpha/and :portkey.aws.iotanalytics/sql-query))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/sql-query-dataset-action (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.sql-query-dataset-action/sqlQuery] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.delete-dataset-request/datasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.message/message-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.message/payload (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-payload))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/message (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.message/messageId :portkey.aws.iotanalytics.message/payload] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-actions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-action :min-count 1 :max-count 1) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.describe-dataset-request/datasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.remove-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.remove-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-names))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.remove-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/remove-attributes-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.remove-attributes-activity/name :portkey.aws.iotanalytics.remove-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.remove-attributes-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.delete-channel-request/channelName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.describe-channel-request/channelName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-dataset-response/dataset (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-dataset-response/dataset] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.datastore/name :portkey.aws.iotanalytics.datastore/arn :portkey.aws.iotanalytics.datastore/status :portkey.aws.iotanalytics.datastore/retentionPeriod :portkey.aws.iotanalytics.datastore/creationTime :portkey.aws.iotanalytics.datastore/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action/action-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-action-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action/query-action (clojure.spec.alpha/and :portkey.aws.iotanalytics/sql-query-dataset-action))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-action/actionName :portkey.aws.iotanalytics.dataset-action/queryAction] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-request/max-messages (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-messages))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-request/start-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/start-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-request/end-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/end-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/sample-channel-data-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.sample-channel-data-request/channelName] :opt-un [:portkey.aws.iotanalytics.sample-channel-data-request/maxMessages :portkey.aws.iotanalytics.sample-channel-data-request/startTime :portkey.aws.iotanalytics.sample-channel-data-request/endTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.start-pipeline-reprocessing-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.start-pipeline-reprocessing-request/start-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/start-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.start-pipeline-reprocessing-request/end-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/end-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/start-pipeline-reprocessing-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.start-pipeline-reprocessing-request/pipelineName] :opt-un [:portkey.aws.iotanalytics.start-pipeline-reprocessing-request/startTime :portkey.aws.iotanalytics.start-pipeline-reprocessing-request/endTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-entry/entry-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/entry-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-entry/datauri (clojure.spec.alpha/and :portkey.aws.iotanalytics/presigneduri))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-entry/entryName :portkey.aws.iotanalytics.dataset-entry/dataURI] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-error-entries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/batch-put-message-error-entry) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.update-dataset-request/datasetName :portkey.aws.iotanalytics.update-dataset-request/actions] :opt-un [:portkey.aws.iotanalytics.update-dataset-request/triggers] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/reprocessing-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.add-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.add-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name-mapping))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.add-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/add-attributes-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.add-attributes-activity/name :portkey.aws.iotanalytics.add-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.add-attributes-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-triggers (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-trigger :min-count 0 :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/sql-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/max-messages (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__)) (fn* [p1__16204__16205__auto__] (clojure.core/<= p1__16204__16205__auto__ 10))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/schedule-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-channels-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-channels-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-channels-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-channels-request/nextToken :portkey.aws.iotanalytics.list-channels-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-logging-options-response/logging-options (clojure.spec.alpha/and :portkey.aws.iotanalytics/logging-options))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-logging-options-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-logging-options-response/loggingOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-error-entry/message-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-error-entry/error-code (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-code))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-error-entry/error-message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-error-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.batch-put-message-error-entry/messageId :portkey.aws.iotanalytics.batch-put-message-error-entry/errorCode :portkey.aws.iotanalytics.batch-put-message-error-entry/errorMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-pipeline-request/pipeline-activities (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.update-pipeline-request/pipelineName :portkey.aws.iotanalytics.update-pipeline-request/pipelineActivities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/thing-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/device-registry-enrich-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.device-registry-enrich-activity/name :portkey.aws.iotanalytics.device-registry-enrich-activity/attribute :portkey.aws.iotanalytics.device-registry-enrich-activity/thingName :portkey.aws.iotanalytics.device-registry-enrich-activity/roleArn] :opt-un [:portkey.aws.iotanalytics.device-registry-enrich-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.channel/name :portkey.aws.iotanalytics.channel/arn :portkey.aws.iotanalytics.channel/status :portkey.aws.iotanalytics.channel/retentionPeriod :portkey.aws.iotanalytics.channel/creationTime :portkey.aws.iotanalytics.channel/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-pipeline-response/pipeline (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-pipeline-response/pipeline] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-pipelines-response/pipeline-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-pipelines-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-pipelines-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-pipelines-response/pipelineSummaries :portkey.aws.iotanalytics.list-pipelines-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__)) (fn* [p1__16204__16205__auto__] (clojure.core/<= p1__16204__16205__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-datastore-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.delete-datastore-request/datastoreName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-trigger/schedule (clojure.spec.alpha/and :portkey.aws.iotanalytics/schedule))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-trigger (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-trigger/schedule] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-dataset-content-request/version-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-dataset-content-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.delete-dataset-content-request/datasetName] :opt-un [:portkey.aws.iotanalytics.delete-dataset-content-request/versionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.lambda-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.lambda-activity/lambda-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/lambda-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.lambda-activity/batch-size (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-batch-size))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.lambda-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/lambda-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.lambda-activity/name :portkey.aws.iotanalytics.lambda-activity/lambdaName :portkey.aws.iotanalytics.lambda-activity/batchSize] :opt-un [:portkey.aws.iotanalytics.lambda-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.throttling-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.schedule/expression (clojure.spec.alpha/and :portkey.aws.iotanalytics/schedule-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/schedule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.schedule/expression] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-response/entries (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-entries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-response/timestamp (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-response/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/get-dataset-content-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.get-dataset-content-response/entries :portkey.aws.iotanalytics.get-dataset-content-response/timestamp :portkey.aws.iotanalytics.get-dataset-content-response/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/unlimited-retention-period clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-status/state (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-state))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-status/reason (clojure.spec.alpha/and :portkey.aws.iotanalytics/reason))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-content-status/state :portkey.aws.iotanalytics.dataset-content-status/reason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-datastore-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.create-datastore-request/datastoreName] :opt-un [:portkey.aws.iotanalytics.create-datastore-request/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/logging-level (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"ERROR" "ERROR", :error "ERROR"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-response/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/sample-channel-data-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.sample-channel-data-response/payloads] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.retention-period/unlimited (clojure.spec.alpha/and :portkey.aws.iotanalytics/unlimited-retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.retention-period/number-of-days (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period-in-days))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/retention-period (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.retention-period/unlimited :portkey.aws.iotanalytics.retention-period/numberOfDays] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/retention-period-in-days (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/pipeline-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-dataset-content-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.create-dataset-content-request/datasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.run-pipeline-activity-request/pipeline-activity (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.run-pipeline-activity-request/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/run-pipeline-activity-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.run-pipeline-activity-request/pipelineActivity :portkey.aws.iotanalytics.run-pipeline-activity-request/payloads] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.cancel-pipeline-reprocessing-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.cancel-pipeline-reprocessing-request/reprocessing-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.cancel-pipeline-reprocessing-request/pipelineName :portkey.aws.iotanalytics.cancel-pipeline-reprocessing-request/reprocessingId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/channel-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datasets-response/dataset-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datasets-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datasets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datasets-response/datasetSummaries :portkey.aws.iotanalytics.list-datasets-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/log-result (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-summary/datasetName :portkey.aws.iotanalytics.dataset-summary/status :portkey.aws.iotanalytics.dataset-summary/creationTime :portkey.aws.iotanalytics.dataset-summary/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/math-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/activity-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-response/batch-put-message-error-entries (clojure.spec.alpha/and :portkey.aws.iotanalytics/batch-put-message-error-entries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.batch-put-message-response/batchPutMessageErrorEntries] :locations {}))

(clojure.core/defn create-pipeline "Creates a pipeline. A pipeline consumes messages from one or more channels and\nallows you to process the messages before storing them in a data store." ([create-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "POST" "/pipelines" create-pipeline-request :portkey.aws.iotanalytics/create-pipeline-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.iotanalytics/create-pipeline-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-pipeline-response))

(clojure.core/defn describe-dataset "Retrieves information about a data set." ([describe-dataset-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/datasets/{datasetName}" describe-dataset-request :portkey.aws.iotanalytics/describe-dataset-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {}} nil :portkey.aws.iotanalytics/describe-dataset-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef describe-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-dataset-response))

(clojure.core/defn list-pipelines "Retrieves a list of pipelines." ([] (list-pipelines {})) ([list-pipelines-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/pipelines" list-pipelines-request :portkey.aws.iotanalytics/list-pipelines-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iotanalytics/list-pipelines-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef list-pipelines :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-pipelines-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-pipelines-response))

(clojure.core/defn delete-channel "Deletes the specified channel." ([delete-channel-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "DELETE" "/channels/{channelName}" delete-channel-request :portkey.aws.iotanalytics/delete-channel-request {:payload nil, :move {}, :headers {}, :uri {"channelName" "channelName"}, :querystring {}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef delete-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-channel-request) :ret clojure.core/true?)

(clojure.core/defn create-dataset-content "Creates the content of a data set by applying an SQL action." ([create-dataset-content-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "POST" "/datasets/{datasetName}/content" create-dataset-content-request :portkey.aws.iotanalytics/create-dataset-content-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef create-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-dataset-content-request) :ret clojure.core/true?)

(clojure.core/defn describe-datastore "Retrieves information about a data store." ([describe-datastore-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/datastores/{datastoreName}" describe-datastore-request :portkey.aws.iotanalytics/describe-datastore-request {:payload nil, :move {}, :headers {}, :uri {"datastoreName" "datastoreName"}, :querystring {}} nil :portkey.aws.iotanalytics/describe-datastore-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef describe-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-datastore-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-datastore-response))

(clojure.core/defn update-datastore "Updates the settings of a data store." ([update-datastore-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "PUT" "/datastores/{datastoreName}" update-datastore-request :portkey.aws.iotanalytics/update-datastore-request {:payload nil, :move {}, :headers {}, :uri {"datastoreName" "datastoreName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef update-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-datastore-request) :ret clojure.core/true?)

(clojure.core/defn create-datastore "Creates a data store, which is a repository for messages." ([create-datastore-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "POST" "/datastores" create-datastore-request :portkey.aws.iotanalytics/create-datastore-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.iotanalytics/create-datastore-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-datastore-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-datastore-response))

(clojure.core/defn create-dataset "Creates a data set. A data set stores data retrieved from a data store by\napplying an SQL action.\n This operation creates the skeleton of a data set. To populate the data set,\ncall \"CreateDatasetContent\"." ([create-dataset-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "POST" "/datasets" create-dataset-request :portkey.aws.iotanalytics/create-dataset-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.iotanalytics/create-dataset-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-dataset-response))

(clojure.core/defn update-channel "Updates the settings of a channel." ([update-channel-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "PUT" "/channels/{channelName}" update-channel-request :portkey.aws.iotanalytics/update-channel-request {:payload nil, :move {}, :headers {}, :uri {"channelName" "channelName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef update-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-channel-request) :ret clojure.core/true?)

(clojure.core/defn list-datasets "Retrieves information about data sets." ([] (list-datasets {})) ([list-datasets-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/datasets" list-datasets-request :portkey.aws.iotanalytics/list-datasets-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iotanalytics/list-datasets-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef list-datasets :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-datasets-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-datasets-response))

(clojure.core/defn put-logging-options "Sets or updates the AWS IoT Analytics logging options." ([put-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "PUT" "/logging" put-logging-options-request :portkey.aws.iotanalytics/put-logging-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef put-logging-options :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/put-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn sample-channel-data "Retrieves a sample of messages from the specified channel ingested during the\nspecified timeframe. Up to 10 messages can be retrieved." ([sample-channel-data-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/channels/{channelName}/sample" sample-channel-data-request :portkey.aws.iotanalytics/sample-channel-data-request {:payload nil, :move {}, :headers {}, :uri {"channelName" "channelName"}, :querystring {"maxMessages" "maxMessages", "startTime" "startTime", "endTime" "endTime"}} nil :portkey.aws.iotanalytics/sample-channel-data-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef sample-channel-data :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/sample-channel-data-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/sample-channel-data-response))

(clojure.core/defn list-datastores "Retrieves a list of data stores." ([] (list-datastores {})) ([list-datastores-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/datastores" list-datastores-request :portkey.aws.iotanalytics/list-datastores-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iotanalytics/list-datastores-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef list-datastores :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-datastores-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-datastores-response))

(clojure.core/defn delete-dataset-content "Deletes the content of the specified data set." ([delete-dataset-content-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "DELETE" "/datasets/{datasetName}/content" delete-dataset-content-request :portkey.aws.iotanalytics/delete-dataset-content-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {"versionId" "versionId"}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef delete-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-dataset-content-request) :ret clojure.core/true?)

(clojure.core/defn get-dataset-content "Retrieves the contents of a data set as pre-signed URIs." ([get-dataset-content-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/datasets/{datasetName}/content" get-dataset-content-request :portkey.aws.iotanalytics/get-dataset-content-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {"versionId" "versionId"}} nil :portkey.aws.iotanalytics/get-dataset-content-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef get-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/get-dataset-content-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/get-dataset-content-response))

(clojure.core/defn update-dataset "Updates the settings of a data set." ([update-dataset-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "PUT" "/datasets/{datasetName}" update-dataset-request :portkey.aws.iotanalytics/update-dataset-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef update-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-dataset-request) :ret clojure.core/true?)

(clojure.core/defn run-pipeline-activity "Simulates the results of running a pipeline activity on a message payload." ([run-pipeline-activity-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "POST" "/pipelineactivities/run" run-pipeline-activity-request :portkey.aws.iotanalytics/run-pipeline-activity-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iotanalytics/run-pipeline-activity-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef run-pipeline-activity :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/run-pipeline-activity-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/run-pipeline-activity-response))

(clojure.core/defn start-pipeline-reprocessing "Starts the reprocessing of raw message data through the pipeline." ([start-pipeline-reprocessing-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "POST" "/pipelines/{pipelineName}/reprocessing" start-pipeline-reprocessing-request :portkey.aws.iotanalytics/start-pipeline-reprocessing-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName"}, :querystring {}} nil :portkey.aws.iotanalytics/start-pipeline-reprocessing-response {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef start-pipeline-reprocessing :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/start-pipeline-reprocessing-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/start-pipeline-reprocessing-response))

(clojure.core/defn describe-logging-options "Retrieves the current settings of the AWS IoT Analytics logging options." ([] (describe-logging-options {})) ([describe-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/logging" describe-logging-options-request :portkey.aws.iotanalytics/describe-logging-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iotanalytics/describe-logging-options-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef describe-logging-options :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/describe-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-logging-options-response))

(clojure.core/defn describe-pipeline "Retrieves information about a pipeline." ([describe-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/pipelines/{pipelineName}" describe-pipeline-request :portkey.aws.iotanalytics/describe-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName"}, :querystring {}} nil :portkey.aws.iotanalytics/describe-pipeline-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef describe-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-pipeline-response))

(clojure.core/defn create-channel "Creates a channel. A channel collects data from an MQTT topic and archives the\nraw, unprocessed messages before publishing the data to a pipeline." ([create-channel-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "POST" "/channels" create-channel-request :portkey.aws.iotanalytics/create-channel-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.iotanalytics/create-channel-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-channel-response))

(clojure.core/defn describe-channel "Retrieves information about a channel." ([describe-channel-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/channels/{channelName}" describe-channel-request :portkey.aws.iotanalytics/describe-channel-request {:payload nil, :move {}, :headers {}, :uri {"channelName" "channelName"}, :querystring {}} nil :portkey.aws.iotanalytics/describe-channel-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef describe-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-channel-response))

(clojure.core/defn list-channels "Retrieves a list of channels." ([] (list-channels {})) ([list-channels-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "GET" "/channels" list-channels-request :portkey.aws.iotanalytics/list-channels-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iotanalytics/list-channels-response {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef list-channels :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-channels-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-channels-response))

(clojure.core/defn delete-pipeline "Deletes the specified pipeline." ([delete-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "DELETE" "/pipelines/{pipelineName}" delete-pipeline-request :portkey.aws.iotanalytics/delete-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName"}, :querystring {}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef delete-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-pipeline-request) :ret clojure.core/true?)

(clojure.core/defn delete-datastore "Deletes the specified data store." ([delete-datastore-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "DELETE" "/datastores/{datastoreName}" delete-datastore-request :portkey.aws.iotanalytics/delete-datastore-request {:payload nil, :move {}, :headers {}, :uri {"datastoreName" "datastoreName"}, :querystring {}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef delete-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-datastore-request) :ret clojure.core/true?)

(clojure.core/defn batch-put-message "Sends messages to a channel." ([batch-put-message-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "POST" "/messages/batch" batch-put-message-request :portkey.aws.iotanalytics/batch-put-message-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.iotanalytics/batch-put-message-response {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef batch-put-message :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/batch-put-message-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/batch-put-message-response))

(clojure.core/defn cancel-pipeline-reprocessing "Cancels the reprocessing of data through the pipeline." ([cancel-pipeline-reprocessing-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "DELETE" "/pipelines/{pipelineName}/reprocessing/{reprocessingId}" cancel-pipeline-reprocessing-request :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName", "reprocessingId" "reprocessingId"}, :querystring {}} nil :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-response {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef cancel-pipeline-reprocessing :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-response))

(clojure.core/defn update-pipeline "Updates the settings of a pipeline." ([update-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "PUT" "/pipelines/{pipelineName}" update-pipeline-request :portkey.aws.iotanalytics/update-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception})))
(clojure.spec.alpha/fdef update-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-pipeline-request) :ret clojure.core/true?)

(clojure.core/defn delete-dataset "Deletes the specified data set.\n You do not have to delete the content of the data set before you perform this\noperation." ([delete-dataset-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics/endpoints "DELETE" "/datasets/{datasetName}" delete-dataset-request :portkey.aws.iotanalytics/delete-dataset-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception})))
(clojure.spec.alpha/fdef delete-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-dataset-request) :ret clojure.core/true?)
