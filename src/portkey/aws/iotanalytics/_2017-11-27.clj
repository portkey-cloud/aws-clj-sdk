(ns portkey.aws.iotanalytics.-2017-11-27 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/messages (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/message) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-datastores-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-datastores-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/list-datastores-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.list-datastores-request/nextToken :portkey.aws.iotanalytics.-2017-11-27.list-datastores-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.describe-pipeline-request/pipelineName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-datastore-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.describe-datastore-request/datastoreName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/activity-batch-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__)) (fn* [p1__16204__16205__auto__] (clojure.core/<= p1__16204__16205__auto__ 1000))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/cancel-pipeline-reprocessing-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/attribute-names (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/attribute-name :min-count 1 :max-count 50) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-content-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-pipeline-response/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-pipeline-response/pipeline-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.create-pipeline-response/pipelineName :portkey.aws.iotanalytics.-2017-11-27.create-pipeline-response/pipelineArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-datastore-response/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-datastore-response/datastore-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-datastore-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-datastore-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.create-datastore-response/datastoreName :portkey.aws.iotanalytics.-2017-11-27.create-datastore-response/datastoreArn :portkey.aws.iotanalytics.-2017-11-27.create-datastore-response/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/end-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset/status (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.dataset/name :portkey.aws.iotanalytics.-2017-11-27.dataset/arn :portkey.aws.iotanalytics.-2017-11-27.dataset/actions :portkey.aws.iotanalytics.-2017-11-27.dataset/triggers :portkey.aws.iotanalytics.-2017-11-27.dataset/status :portkey.aws.iotanalytics.-2017-11-27.dataset/creationTime :portkey.aws.iotanalytics.-2017-11-27.dataset/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-channel-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/update-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.update-channel-request/channelName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.update-channel-request/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore-activity/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/datastore-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.datastore-activity/name :portkey.aws.iotanalytics.-2017-11-27.datastore-activity/datastoreName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.math-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.math-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.math-activity/math (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/math-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.math-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/math-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.math-activity/name :portkey.aws.iotanalytics.-2017-11-27.math-activity/attribute :portkey.aws.iotanalytics.-2017-11-27.math-activity/math] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.math-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-pipelines-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-pipelines-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/list-pipelines-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.list-pipelines-request/nextToken :portkey.aws.iotanalytics.-2017-11-27.list-pipelines-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/entry-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.invalid-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/message-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.start-pipeline-reprocessing-response/reprocessing-id (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/start-pipeline-reprocessing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.start-pipeline-reprocessing-response/reprocessingId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.run-pipeline-activity-response/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.run-pipeline-activity-response/log-result (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/log-result))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/run-pipeline-activity-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.run-pipeline-activity-response/payloads :portkey.aws.iotanalytics.-2017-11-27.run-pipeline-activity-response/logResult] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-dataset-request/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-dataset-request/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.create-dataset-request/datasetName :portkey.aws.iotanalytics.-2017-11-27.create-dataset-request/actions] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.create-dataset-request/triggers] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-pipeline-request/pipeline-activities (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.create-pipeline-request/pipelineName :portkey.aws.iotanalytics.-2017-11-27.create-pipeline-request/pipelineActivities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-datastores-response/datastore-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-datastores-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/list-datastores-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.list-datastores-response/datastoreSummaries :portkey.aws.iotanalytics.-2017-11-27.list-datastores-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/start-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/thing-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/device-shadow-enrich-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/name :portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/attribute :portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/thingName :portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/roleArn] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.device-shadow-enrich-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/pipeline-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.select-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.select-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/attribute-names))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.select-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/select-attributes-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.select-attributes-activity/name :portkey.aws.iotanalytics.-2017-11-27.select-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.select-attributes-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-request/messages (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/messages))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.batch-put-message-request/channelName :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-request/messages] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-content-state (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-channel-response/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-channel-response/channel-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-channel-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.create-channel-response/channelName :portkey.aws.iotanalytics.-2017-11-27.create-channel-response/channelArn :portkey.aws.iotanalytics.-2017-11-27.create-channel-response/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/datastore-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 20 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore-summary/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/datastore-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.datastore-summary/datastoreName :portkey.aws.iotanalytics.-2017-11-27.datastore-summary/status :portkey.aws.iotanalytics.-2017-11-27.datastore-summary/creationTime :portkey.aws.iotanalytics.-2017-11-27.datastore-summary/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/message-payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline/activities (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline/reprocessing-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/reprocessing-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/pipeline (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.pipeline/name :portkey.aws.iotanalytics.-2017-11-27.pipeline/arn :portkey.aws.iotanalytics.-2017-11-27.pipeline/activities :portkey.aws.iotanalytics.-2017-11-27.pipeline/reprocessingSummaries :portkey.aws.iotanalytics.-2017-11-27.pipeline/creationTime :portkey.aws.iotanalytics.-2017-11-27.pipeline/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-datastore-response/datastore (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-datastore-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.describe-datastore-response/datastore] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-channel-response/channel (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.describe-channel-response/channel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-datastore-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/update-datastore-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.update-datastore-request/datastoreName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.update-datastore-request/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.put-logging-options-request/logging-options (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/logging-options))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/put-logging-options-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.put-logging-options-request/loggingOptions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.logging-options/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.logging-options/level (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/logging-level))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.logging-options/enabled (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/logging-enabled))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/logging-options (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.logging-options/roleArn :portkey.aws.iotanalytics.-2017-11-27.logging-options/level :portkey.aws.iotanalytics.-2017-11-27.logging-options/enabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/pipeline-activities (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/pipeline-activity :min-count 1 :max-count 25) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/message-payloads (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/message-payload :min-count 1 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/datastore-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/datastore-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/resource-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.resource-already-exists-exception/message :portkey.aws.iotanalytics.-2017-11-27/resourceId :portkey.aws.iotanalytics.-2017-11-27/resourceArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-entries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/dataset-entry) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/reprocessing-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"RUNNING" "RUNNING", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED", "CANCELLED" "CANCELLED", :cancelled "CANCELLED", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel-summary/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/channel-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.channel-summary/channelName :portkey.aws.iotanalytics.-2017-11-27.channel-summary/status :portkey.aws.iotanalytics.-2017-11-27.channel-summary/creationTime :portkey.aws.iotanalytics.-2017-11-27.channel-summary/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-logging-options-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/logging-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel-activity/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/channel-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.channel-activity/name :portkey.aws.iotanalytics.-2017-11-27.channel-activity/channelName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.channel-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-channel-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.create-channel-request/channelName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.create-channel-request/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-action-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-dataset-response/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-dataset-response/dataset-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.create-dataset-response/datasetName :portkey.aws.iotanalytics.-2017-11-27.create-dataset-response/datasetArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.reprocessing-summary/id (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.reprocessing-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/reprocessing-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.reprocessing-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/reprocessing-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.reprocessing-summary/id :portkey.aws.iotanalytics.-2017-11-27.reprocessing-summary/status :portkey.aws.iotanalytics.-2017-11-27.reprocessing-summary/creationTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/datastore-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-datasets-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-datasets-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/list-datasets-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.list-datasets-request/nextToken :portkey.aws.iotanalytics.-2017-11-27.list-datasets-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.delete-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/delete-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.delete-pipeline-request/pipelineName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.filter-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.filter-activity/filter (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/filter-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.filter-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/filter-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.filter-activity/name :portkey.aws.iotanalytics.-2017-11-27.filter-activity/filter] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.filter-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-request/version-id (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/get-dataset-content-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-request/datasetName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-request/versionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/presigneduri (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-channels-response/channel-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-channels-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/list-channels-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.list-channels-response/channelSummaries :portkey.aws.iotanalytics.-2017-11-27.list-channels-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/attribute-name-mapping (clojure.spec.alpha/map-of :portkey.aws.iotanalytics.-2017-11-27/attribute-name :portkey.aws.iotanalytics.-2017-11-27/attribute-name))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/lambda-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 64)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_-]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/device-shadow-enrich (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/device-shadow-enrich-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/device-registry-enrich (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/device-registry-enrich-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/select-attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/select-attributes-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/math (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/math-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/add-attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/add-attributes-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/filter (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/filter-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/remove-attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/remove-attributes-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/channel (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/datastore (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/lambda (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/lambda-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/pipeline-activity (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/deviceShadowEnrich :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/deviceRegistryEnrich :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/selectAttributes :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/math :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/addAttributes :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/filter :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/removeAttributes :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/channel :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/datastore :portkey.aws.iotanalytics.-2017-11-27.pipeline-activity/lambda] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-summary/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-summary/reprocessing-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/reprocessing-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.pipeline-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/pipeline-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.pipeline-summary/pipelineName :portkey.aws.iotanalytics.-2017-11-27.pipeline-summary/reprocessingSummaries :portkey.aws.iotanalytics.-2017-11-27.pipeline-summary/creationTime :portkey.aws.iotanalytics.-2017-11-27.pipeline-summary/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.sql-query-dataset-action/sql-query (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/sql-query))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/sql-query-dataset-action (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.sql-query-dataset-action/sqlQuery] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.delete-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/delete-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.delete-dataset-request/datasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.message/message-id (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/message-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.message/payload (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/message-payload))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/message (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.message/messageId :portkey.aws.iotanalytics.-2017-11-27.message/payload] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-actions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/dataset-action :min-count 1 :max-count 1) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.describe-dataset-request/datasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.remove-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.remove-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/attribute-names))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.remove-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/remove-attributes-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.remove-attributes-activity/name :portkey.aws.iotanalytics.-2017-11-27.remove-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.remove-attributes-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.delete-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/delete-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.delete-channel-request/channelName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.describe-channel-request/channelName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-dataset-response/dataset (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.describe-dataset-response/dataset] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore/status (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.datastore/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/datastore (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.datastore/name :portkey.aws.iotanalytics.-2017-11-27.datastore/arn :portkey.aws.iotanalytics.-2017-11-27.datastore/status :portkey.aws.iotanalytics.-2017-11-27.datastore/retentionPeriod :portkey.aws.iotanalytics.-2017-11-27.datastore/creationTime :portkey.aws.iotanalytics.-2017-11-27.datastore/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-action/action-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-action-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-action/query-action (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/sql-query-dataset-action))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.dataset-action/actionName :portkey.aws.iotanalytics.-2017-11-27.dataset-action/queryAction] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-request/max-messages (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/max-messages))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-request/start-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/start-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-request/end-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/end-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/sample-channel-data-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-request/channelName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-request/maxMessages :portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-request/startTime :portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-request/endTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.start-pipeline-reprocessing-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.start-pipeline-reprocessing-request/start-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/start-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.start-pipeline-reprocessing-request/end-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/end-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/start-pipeline-reprocessing-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.start-pipeline-reprocessing-request/pipelineName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.start-pipeline-reprocessing-request/startTime :portkey.aws.iotanalytics.-2017-11-27.start-pipeline-reprocessing-request/endTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-entry/entry-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/entry-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-entry/datauri (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/presigneduri))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.dataset-entry/entryName :portkey.aws.iotanalytics.-2017-11-27.dataset-entry/dataURI] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-error-entries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-error-entry) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-dataset-request/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-dataset-request/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/update-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.update-dataset-request/datasetName :portkey.aws.iotanalytics.-2017-11-27.update-dataset-request/actions] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.update-dataset-request/triggers] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/reprocessing-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/reprocessing-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.add-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.add-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/attribute-name-mapping))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.add-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/add-attributes-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.add-attributes-activity/name :portkey.aws.iotanalytics.-2017-11-27.add-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.add-attributes-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/channel-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-triggers (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/dataset-trigger :min-count 0 :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/sql-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/max-messages (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__)) (fn* [p1__16204__16205__auto__] (clojure.core/<= p1__16204__16205__auto__ 10))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/schedule-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/channel-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-channels-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-channels-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/list-channels-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.list-channels-request/nextToken :portkey.aws.iotanalytics.-2017-11-27.list-channels-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-logging-options-response/logging-options (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/logging-options))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-logging-options-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.describe-logging-options-response/loggingOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-error-entry/message-id (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/message-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-error-entry/error-code (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-code))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-error-entry/error-message (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-error-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.batch-put-message-error-entry/messageId :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-error-entry/errorCode :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-error-entry/errorMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.update-pipeline-request/pipeline-activities (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/update-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.update-pipeline-request/pipelineName :portkey.aws.iotanalytics.-2017-11-27.update-pipeline-request/pipelineActivities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/thing-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/device-registry-enrich-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/name :portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/attribute :portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/thingName :portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/roleArn] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.device-registry-enrich-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel/status (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/channel-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.channel/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/channel (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.channel/name :portkey.aws.iotanalytics.-2017-11-27.channel/arn :portkey.aws.iotanalytics.-2017-11-27.channel/status :portkey.aws.iotanalytics.-2017-11-27.channel/retentionPeriod :portkey.aws.iotanalytics.-2017-11-27.channel/creationTime :portkey.aws.iotanalytics.-2017-11-27.channel/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.describe-pipeline-response/pipeline (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/describe-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.describe-pipeline-response/pipeline] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-pipelines-response/pipeline-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-pipelines-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/list-pipelines-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.list-pipelines-response/pipelineSummaries :portkey.aws.iotanalytics.-2017-11-27.list-pipelines-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__)) (fn* [p1__16204__16205__auto__] (clojure.core/<= p1__16204__16205__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.delete-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/delete-datastore-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.delete-datastore-request/datastoreName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-trigger/schedule (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/schedule))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-trigger (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.dataset-trigger/schedule] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.delete-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.delete-dataset-content-request/version-id (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/delete-dataset-content-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.delete-dataset-content-request/datasetName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.delete-dataset-content-request/versionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.lambda-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.lambda-activity/lambda-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/lambda-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.lambda-activity/batch-size (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-batch-size))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.lambda-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/lambda-activity (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.lambda-activity/name :portkey.aws.iotanalytics.-2017-11-27.lambda-activity/lambdaName :portkey.aws.iotanalytics.-2017-11-27.lambda-activity/batchSize] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.lambda-activity/next] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.throttling-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/datastore-status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.schedule/expression (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/schedule-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/schedule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.schedule/expression] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-response/entries (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-entries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-response/timestamp (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-response/status (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-content-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/get-dataset-content-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-response/entries :portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-response/timestamp :portkey.aws.iotanalytics.-2017-11-27.get-dataset-content-response/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/unlimited-retention-period clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-content-status/state (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-content-state))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-content-status/reason (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/reason))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-content-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.dataset-content-status/state :portkey.aws.iotanalytics.-2017-11-27.dataset-content-status/reason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-datastore-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-datastore-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.create-datastore-request/datastoreName] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.create-datastore-request/retentionPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/logging-level (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"ERROR" "ERROR", :error "ERROR"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-response/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/sample-channel-data-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.sample-channel-data-response/payloads] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.retention-period/unlimited (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/unlimited-retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.retention-period/number-of-days (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/retention-period-in-days))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/retention-period (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.retention-period/unlimited :portkey.aws.iotanalytics.-2017-11-27.retention-period/numberOfDays] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/retention-period-in-days (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/pipeline-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/pipeline-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.create-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/create-dataset-content-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.create-dataset-content-request/datasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.run-pipeline-activity-request/pipeline-activity (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.run-pipeline-activity-request/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/run-pipeline-activity-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.run-pipeline-activity-request/pipelineActivity :portkey.aws.iotanalytics.-2017-11-27.run-pipeline-activity-request/payloads] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/pipeline-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.cancel-pipeline-reprocessing-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.cancel-pipeline-reprocessing-request/reprocessing-id (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/cancel-pipeline-reprocessing-request (portkey.aws/json-keys :req-un [:portkey.aws.iotanalytics.-2017-11-27.cancel-pipeline-reprocessing-request/pipelineName :portkey.aws.iotanalytics.-2017-11-27.cancel-pipeline-reprocessing-request/reprocessingId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/channel-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/channel-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-datasets-response/dataset-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.list-datasets-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/list-datasets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.list-datasets-response/datasetSummaries :portkey.aws.iotanalytics.-2017-11-27.list-datasets-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/log-result (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-summary/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/dataset-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.dataset-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.dataset-summary/datasetName :portkey.aws.iotanalytics.-2017-11-27.dataset-summary/status :portkey.aws.iotanalytics.-2017-11-27.dataset-summary/creationTime :portkey.aws.iotanalytics.-2017-11-27.dataset-summary/lastUpdateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/dataset-summaries (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics.-2017-11-27/dataset-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/math-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/activity-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/reprocessing-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27.batch-put-message-response/batch-put-message-error-entries (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-error-entries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iotanalytics.-2017-11-27.batch-put-message-response/batchPutMessageErrorEntries] :locations {}))

(clojure.core/defn create-pipeline "Creates a pipeline. A pipeline consumes messages from one or more channels and\nallows you to process the messages before storing them in a data store." ([create-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "POST" "/pipelines" create-pipeline-request :portkey.aws.iotanalytics.-2017-11-27/create-pipeline-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.iotanalytics.-2017-11-27/create-pipeline-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics.-2017-11-27/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics.-2017-11-27/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/create-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/create-pipeline-response))

(clojure.core/defn describe-dataset "Retrieves information about a data set." ([describe-dataset-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/datasets/{datasetName}" describe-dataset-request :portkey.aws.iotanalytics.-2017-11-27/describe-dataset-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {}} nil :portkey.aws.iotanalytics.-2017-11-27/describe-dataset-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef describe-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/describe-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/describe-dataset-response))

(clojure.core/defn list-pipelines "Retrieves a list of pipelines." ([] (list-pipelines {})) ([list-pipelines-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/pipelines" list-pipelines-request :portkey.aws.iotanalytics.-2017-11-27/list-pipelines-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iotanalytics.-2017-11-27/list-pipelines-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef list-pipelines :args (clojure.spec.alpha/? :portkey.aws.iotanalytics.-2017-11-27/list-pipelines-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/list-pipelines-response))

(clojure.core/defn delete-channel "Deletes the specified channel." ([delete-channel-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "DELETE" "/channels/{channelName}" delete-channel-request :portkey.aws.iotanalytics.-2017-11-27/delete-channel-request {:payload nil, :move {}, :headers {}, :uri {"channelName" "channelName"}, :querystring {}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef delete-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/delete-channel-request) :ret clojure.core/true?)

(clojure.core/defn create-dataset-content "Creates the content of a data set by applying an SQL action." ([create-dataset-content-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "POST" "/datasets/{datasetName}/content" create-dataset-content-request :portkey.aws.iotanalytics.-2017-11-27/create-dataset-content-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef create-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/create-dataset-content-request) :ret clojure.core/true?)

(clojure.core/defn describe-datastore "Retrieves information about a data store." ([describe-datastore-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/datastores/{datastoreName}" describe-datastore-request :portkey.aws.iotanalytics.-2017-11-27/describe-datastore-request {:payload nil, :move {}, :headers {}, :uri {"datastoreName" "datastoreName"}, :querystring {}} nil :portkey.aws.iotanalytics.-2017-11-27/describe-datastore-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef describe-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/describe-datastore-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/describe-datastore-response))

(clojure.core/defn update-datastore "Updates the settings of a data store." ([update-datastore-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "PUT" "/datastores/{datastoreName}" update-datastore-request :portkey.aws.iotanalytics.-2017-11-27/update-datastore-request {:payload nil, :move {}, :headers {}, :uri {"datastoreName" "datastoreName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef update-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/update-datastore-request) :ret clojure.core/true?)

(clojure.core/defn create-datastore "Creates a data store, which is a repository for messages." ([create-datastore-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "POST" "/datastores" create-datastore-request :portkey.aws.iotanalytics.-2017-11-27/create-datastore-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.iotanalytics.-2017-11-27/create-datastore-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics.-2017-11-27/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics.-2017-11-27/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/create-datastore-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/create-datastore-response))

(clojure.core/defn create-dataset "Creates a data set. A data set stores data retrieved from a data store by\napplying an SQL action.\n This operation creates the skeleton of a data set. To populate the data set,\ncall \"CreateDatasetContent\"." ([create-dataset-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "POST" "/datasets" create-dataset-request :portkey.aws.iotanalytics.-2017-11-27/create-dataset-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.iotanalytics.-2017-11-27/create-dataset-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics.-2017-11-27/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics.-2017-11-27/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/create-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/create-dataset-response))

(clojure.core/defn update-channel "Updates the settings of a channel." ([update-channel-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "PUT" "/channels/{channelName}" update-channel-request :portkey.aws.iotanalytics.-2017-11-27/update-channel-request {:payload nil, :move {}, :headers {}, :uri {"channelName" "channelName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef update-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/update-channel-request) :ret clojure.core/true?)

(clojure.core/defn list-datasets "Retrieves information about data sets." ([] (list-datasets {})) ([list-datasets-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/datasets" list-datasets-request :portkey.aws.iotanalytics.-2017-11-27/list-datasets-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iotanalytics.-2017-11-27/list-datasets-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef list-datasets :args (clojure.spec.alpha/? :portkey.aws.iotanalytics.-2017-11-27/list-datasets-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/list-datasets-response))

(clojure.core/defn put-logging-options "Sets or updates the AWS IoT Analytics logging options." ([put-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "PUT" "/logging" put-logging-options-request :portkey.aws.iotanalytics.-2017-11-27/put-logging-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef put-logging-options :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/put-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn sample-channel-data "Retrieves a sample of messages from the specified channel ingested during the\nspecified timeframe. Up to 10 messages can be retrieved." ([sample-channel-data-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/channels/{channelName}/sample" sample-channel-data-request :portkey.aws.iotanalytics.-2017-11-27/sample-channel-data-request {:payload nil, :move {}, :headers {}, :uri {"channelName" "channelName"}, :querystring {"maxMessages" "maxMessages", "startTime" "startTime", "endTime" "endTime"}} nil :portkey.aws.iotanalytics.-2017-11-27/sample-channel-data-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef sample-channel-data :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/sample-channel-data-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/sample-channel-data-response))

(clojure.core/defn list-datastores "Retrieves a list of data stores." ([] (list-datastores {})) ([list-datastores-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/datastores" list-datastores-request :portkey.aws.iotanalytics.-2017-11-27/list-datastores-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iotanalytics.-2017-11-27/list-datastores-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef list-datastores :args (clojure.spec.alpha/? :portkey.aws.iotanalytics.-2017-11-27/list-datastores-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/list-datastores-response))

(clojure.core/defn delete-dataset-content "Deletes the content of the specified data set." ([delete-dataset-content-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "DELETE" "/datasets/{datasetName}/content" delete-dataset-content-request :portkey.aws.iotanalytics.-2017-11-27/delete-dataset-content-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {"versionId" "versionId"}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef delete-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/delete-dataset-content-request) :ret clojure.core/true?)

(clojure.core/defn get-dataset-content "Retrieves the contents of a data set as pre-signed URIs." ([get-dataset-content-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/datasets/{datasetName}/content" get-dataset-content-request :portkey.aws.iotanalytics.-2017-11-27/get-dataset-content-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {"versionId" "versionId"}} nil :portkey.aws.iotanalytics.-2017-11-27/get-dataset-content-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef get-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/get-dataset-content-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/get-dataset-content-response))

(clojure.core/defn update-dataset "Updates the settings of a data set." ([update-dataset-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "PUT" "/datasets/{datasetName}" update-dataset-request :portkey.aws.iotanalytics.-2017-11-27/update-dataset-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef update-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/update-dataset-request) :ret clojure.core/true?)

(clojure.core/defn run-pipeline-activity "Simulates the results of running a pipeline activity on a message payload." ([run-pipeline-activity-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "POST" "/pipelineactivities/run" run-pipeline-activity-request :portkey.aws.iotanalytics.-2017-11-27/run-pipeline-activity-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iotanalytics.-2017-11-27/run-pipeline-activity-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef run-pipeline-activity :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/run-pipeline-activity-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/run-pipeline-activity-response))

(clojure.core/defn start-pipeline-reprocessing "Starts the reprocessing of raw message data through the pipeline." ([start-pipeline-reprocessing-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "POST" "/pipelines/{pipelineName}/reprocessing" start-pipeline-reprocessing-request :portkey.aws.iotanalytics.-2017-11-27/start-pipeline-reprocessing-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName"}, :querystring {}} nil :portkey.aws.iotanalytics.-2017-11-27/start-pipeline-reprocessing-response {"ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics.-2017-11-27/resource-already-exists-exception, "InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef start-pipeline-reprocessing :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/start-pipeline-reprocessing-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/start-pipeline-reprocessing-response))

(clojure.core/defn describe-logging-options "Retrieves the current settings of the AWS IoT Analytics logging options." ([] (describe-logging-options {})) ([describe-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/logging" describe-logging-options-request :portkey.aws.iotanalytics.-2017-11-27/describe-logging-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iotanalytics.-2017-11-27/describe-logging-options-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef describe-logging-options :args (clojure.spec.alpha/? :portkey.aws.iotanalytics.-2017-11-27/describe-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/describe-logging-options-response))

(clojure.core/defn describe-pipeline "Retrieves information about a pipeline." ([describe-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/pipelines/{pipelineName}" describe-pipeline-request :portkey.aws.iotanalytics.-2017-11-27/describe-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName"}, :querystring {}} nil :portkey.aws.iotanalytics.-2017-11-27/describe-pipeline-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef describe-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/describe-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/describe-pipeline-response))

(clojure.core/defn create-channel "Creates a channel. A channel collects data from an MQTT topic and archives the\nraw, unprocessed messages before publishing the data to a pipeline." ([create-channel-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "POST" "/channels" create-channel-request :portkey.aws.iotanalytics.-2017-11-27/create-channel-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.iotanalytics.-2017-11-27/create-channel-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics.-2017-11-27/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics.-2017-11-27/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/create-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/create-channel-response))

(clojure.core/defn describe-channel "Retrieves information about a channel." ([describe-channel-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/channels/{channelName}" describe-channel-request :portkey.aws.iotanalytics.-2017-11-27/describe-channel-request {:payload nil, :move {}, :headers {}, :uri {"channelName" "channelName"}, :querystring {}} nil :portkey.aws.iotanalytics.-2017-11-27/describe-channel-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef describe-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/describe-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/describe-channel-response))

(clojure.core/defn list-channels "Retrieves a list of channels." ([] (list-channels {})) ([list-channels-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "GET" "/channels" list-channels-request :portkey.aws.iotanalytics.-2017-11-27/list-channels-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iotanalytics.-2017-11-27/list-channels-response {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef list-channels :args (clojure.spec.alpha/? :portkey.aws.iotanalytics.-2017-11-27/list-channels-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/list-channels-response))

(clojure.core/defn delete-pipeline "Deletes the specified pipeline." ([delete-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "DELETE" "/pipelines/{pipelineName}" delete-pipeline-request :portkey.aws.iotanalytics.-2017-11-27/delete-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName"}, :querystring {}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef delete-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/delete-pipeline-request) :ret clojure.core/true?)

(clojure.core/defn delete-datastore "Deletes the specified data store." ([delete-datastore-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "DELETE" "/datastores/{datastoreName}" delete-datastore-request :portkey.aws.iotanalytics.-2017-11-27/delete-datastore-request {:payload nil, :move {}, :headers {}, :uri {"datastoreName" "datastoreName"}, :querystring {}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef delete-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/delete-datastore-request) :ret clojure.core/true?)

(clojure.core/defn batch-put-message "Sends messages to a channel." ([batch-put-message-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "POST" "/messages/batch" batch-put-message-request :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-response {"ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef batch-put-message :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/batch-put-message-response))

(clojure.core/defn cancel-pipeline-reprocessing "Cancels the reprocessing of data through the pipeline." ([cancel-pipeline-reprocessing-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "DELETE" "/pipelines/{pipelineName}/reprocessing/{reprocessingId}" cancel-pipeline-reprocessing-request :portkey.aws.iotanalytics.-2017-11-27/cancel-pipeline-reprocessing-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName", "reprocessingId" "reprocessingId"}, :querystring {}} nil :portkey.aws.iotanalytics.-2017-11-27/cancel-pipeline-reprocessing-response {"ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef cancel-pipeline-reprocessing :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/cancel-pipeline-reprocessing-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics.-2017-11-27/cancel-pipeline-reprocessing-response))

(clojure.core/defn update-pipeline "Updates the settings of a pipeline." ([update-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "PUT" "/pipelines/{pipelineName}" update-pipeline-request :portkey.aws.iotanalytics.-2017-11-27/update-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"pipelineName" "pipelineName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics.-2017-11-27/limit-exceeded-exception})))
(clojure.spec.alpha/fdef update-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/update-pipeline-request) :ret clojure.core/true?)

(clojure.core/defn delete-dataset "Deletes the specified data set.\n You do not have to delete the content of the data set before you perform this\noperation." ([delete-dataset-request] (portkey.aws/-rest-json-call portkey.aws.iotanalytics.-2017-11-27/endpoints "DELETE" "/datasets/{datasetName}" delete-dataset-request :portkey.aws.iotanalytics.-2017-11-27/delete-dataset-request {:payload nil, :move {}, :headers {}, :uri {"datasetName" "datasetName"}, :querystring {}} 204 nil {"InvalidRequestException" :portkey.aws.iotanalytics.-2017-11-27/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics.-2017-11-27/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics.-2017-11-27/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics.-2017-11-27/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics.-2017-11-27/throttling-exception})))
(clojure.spec.alpha/fdef delete-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics.-2017-11-27/delete-dataset-request) :ret clojure.core/true?)
