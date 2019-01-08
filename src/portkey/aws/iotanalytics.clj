(ns portkey.aws.iotanalytics (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "iotanalytics", :region "ap-northeast-1"},
    :ssl-common-name "iotanalytics.ap-northeast-1.amazonaws.com",
    :endpoint "https://iotanalytics.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "iotanalytics", :region "eu-west-1"},
    :ssl-common-name "iotanalytics.eu-west-1.amazonaws.com",
    :endpoint "https://iotanalytics.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "iotanalytics", :region "us-east-2"},
    :ssl-common-name "iotanalytics.us-east-2.amazonaws.com",
    :endpoint "https://iotanalytics.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "iotanalytics", :region "us-west-2"},
    :ssl-common-name "iotanalytics.us-west-2.amazonaws.com",
    :endpoint "https://iotanalytics.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "iotanalytics", :region "us-east-1"},
    :ssl-common-name "iotanalytics.us-east-1.amazonaws.com",
    :endpoint "https://iotanalytics.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-messages)

(clojure.core/declare ser-activity-batch-size)

(clojure.core/declare ser-attribute-names)

(clojure.core/declare ser-dataset-content-version)

(clojure.core/declare ser-end-time)

(clojure.core/declare ser-datastore-activity)

(clojure.core/declare ser-math-activity)

(clojure.core/declare ser-message-id)

(clojure.core/declare ser-volume-size-in-gb)

(clojure.core/declare ser-variables)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-dataset-name)

(clojure.core/declare ser-start-time)

(clojure.core/declare ser-device-shadow-enrich-activity)

(clojure.core/declare ser-pipeline-name)

(clojure.core/declare ser-select-attributes-activity)

(clojure.core/declare ser-output-file-name)

(clojure.core/declare ser-datastore-name)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-message-payload)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-logging-options)

(clojure.core/declare ser-pipeline-activities)

(clojure.core/declare ser-message-payloads)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-logging-enabled)

(clojure.core/declare ser-channel-activity)

(clojure.core/declare ser-dataset-action-name)

(clojure.core/declare ser-triggering-dataset)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-query-filters)

(clojure.core/declare ser-filter-activity)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-attribute-name-mapping)

(clojure.core/declare ser-filter-expression)

(clojure.core/declare ser-lambda-name)

(clojure.core/declare ser-channel-name)

(clojure.core/declare ser-double-value)

(clojure.core/declare ser-pipeline-activity)

(clojure.core/declare ser-sql-query-dataset-action)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-message)

(clojure.core/declare ser-dataset-actions)

(clojure.core/declare ser-remove-attributes-activity)

(clojure.core/declare ser-variable-name)

(clojure.core/declare ser-output-file-uri-value)

(clojure.core/declare ser-dataset-action)

(clojure.core/declare ser-include-statistics-flag)

(clojure.core/declare ser-time-expression)

(clojure.core/declare ser-dataset-content-version-value)

(clojure.core/declare ser-offset-seconds)

(clojure.core/declare ser-add-attributes-activity)

(clojure.core/declare ser-resource-configuration)

(clojure.core/declare ser-dataset-triggers)

(clojure.core/declare ser-sql-query)

(clojure.core/declare ser-max-messages)

(clojure.core/declare ser-schedule-expression)

(clojure.core/declare ser-variable)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-device-registry-enrich-activity)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-dataset-trigger)

(clojure.core/declare ser-compute-type)

(clojure.core/declare ser-lambda-activity)

(clojure.core/declare ser-delta-time)

(clojure.core/declare ser-schedule)

(clojure.core/declare ser-unlimited-retention-period)

(clojure.core/declare ser-image)

(clojure.core/declare ser-logging-level)

(clojure.core/declare ser-query-filter)

(clojure.core/declare ser-retention-period)

(clojure.core/declare ser-retention-period-in-days)

(clojure.core/declare ser-container-dataset-action)

(clojure.core/declare ser-string-value)

(clojure.core/declare ser-math-expression)

(clojure.core/declare ser-activity-name)

(clojure.core/declare ser-reprocessing-id)

(clojure.core/defn- ser-messages [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-message coll) #:http.request.field{:shape "Message"}))) input), :shape "Messages", :type "list"})

(clojure.core/defn- ser-activity-batch-size [input] #:http.request.field{:value input, :shape "ActivityBatchSize"})

(clojure.core/defn- ser-attribute-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name coll) #:http.request.field{:shape "AttributeName"}))) input), :shape "AttributeNames", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-dataset-content-version [input] #:http.request.field{:value input, :shape "DatasetContentVersion"})

(clojure.core/defn- ser-end-time [input] #:http.request.field{:value input, :shape "EndTime"})

(clojure.core/defn- ser-datastore-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-datastore-name (:datastore-name input)) #:http.request.field{:name "datastoreName", :shape "DatastoreName"})], :shape "DatastoreActivity", :type "structure"}))

(clojure.core/defn- ser-math-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-attribute-name (:attribute input)) #:http.request.field{:name "attribute", :shape "AttributeName"}) (clojure.core/into (ser-math-expression (:math input)) #:http.request.field{:name "math", :shape "MathExpression"})], :shape "MathActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-message-id [input] #:http.request.field{:value input, :shape "MessageId"})

(clojure.core/defn- ser-volume-size-in-gb [input] #:http.request.field{:value input, :shape "VolumeSizeInGB"})

(clojure.core/defn- ser-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-variable coll) #:http.request.field{:shape "Variable"}))) input), :shape "Variables", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-dataset-name [input] #:http.request.field{:value input, :shape "DatasetName"})

(clojure.core/defn- ser-start-time [input] #:http.request.field{:value input, :shape "StartTime"})

(clojure.core/defn- ser-device-shadow-enrich-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-attribute-name (:attribute input)) #:http.request.field{:name "attribute", :shape "AttributeName"}) (clojure.core/into (ser-attribute-name (:thing-name input)) #:http.request.field{:name "thingName", :shape "AttributeName"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "RoleArn"})], :shape "DeviceShadowEnrichActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-pipeline-name [input] #:http.request.field{:value input, :shape "PipelineName"})

(clojure.core/defn- ser-select-attributes-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-attribute-names (:attributes input)) #:http.request.field{:name "attributes", :shape "AttributeNames"})], :shape "SelectAttributesActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-output-file-name [input] #:http.request.field{:value input, :shape "OutputFileName"})

(clojure.core/defn- ser-datastore-name [input] #:http.request.field{:value input, :shape "DatastoreName"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-message-payload [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "MessagePayload"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-logging-options [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "RoleArn"}) (clojure.core/into (ser-logging-level (:level input)) #:http.request.field{:name "level", :shape "LoggingLevel"}) (clojure.core/into (ser-logging-enabled (:enabled input)) #:http.request.field{:name "enabled", :shape "LoggingEnabled"})], :shape "LoggingOptions", :type "structure"}))

(clojure.core/defn- ser-pipeline-activities [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-pipeline-activity coll) #:http.request.field{:shape "PipelineActivity"}))) input), :shape "PipelineActivities", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-message-payloads [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-message-payload coll) #:http.request.field{:shape "MessagePayload"}))) input), :shape "MessagePayloads", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-logging-enabled [input] #:http.request.field{:value input, :shape "LoggingEnabled"})

(clojure.core/defn- ser-channel-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-channel-name (:channel-name input)) #:http.request.field{:name "channelName", :shape "ChannelName"})], :shape "ChannelActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-dataset-action-name [input] #:http.request.field{:value input, :shape "DatasetActionName"})

(clojure.core/defn- ser-triggering-dataset [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dataset-name (:name input)) #:http.request.field{:name "name", :shape "DatasetName"})], :shape "TriggeringDataset", :type "structure"}))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-query-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-query-filter coll) #:http.request.field{:shape "QueryFilter"}))) input), :shape "QueryFilters", :type "list", :max 1, :min 0})

(clojure.core/defn- ser-filter-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-filter-expression (:filter input)) #:http.request.field{:name "filter", :shape "FilterExpression"})], :shape "FilterActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-attribute-name-mapping [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-name v) #:http.request.field{:map-info "value", :shape "AttributeName"})])) input), :shape "AttributeNameMapping", :type "map", :max 50, :min 1})

(clojure.core/defn- ser-filter-expression [input] #:http.request.field{:value input, :shape "FilterExpression"})

(clojure.core/defn- ser-lambda-name [input] #:http.request.field{:value input, :shape "LambdaName"})

(clojure.core/defn- ser-channel-name [input] #:http.request.field{:value input, :shape "ChannelName"})

(clojure.core/defn- ser-double-value [input] #:http.request.field{:value input, :shape "DoubleValue"})

(clojure.core/defn- ser-pipeline-activity [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PipelineActivity", :type "structure"} (clojure.core/contains? input :device-shadow-enrich) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-shadow-enrich-activity (input :device-shadow-enrich)) #:http.request.field{:name "deviceShadowEnrich", :shape "DeviceShadowEnrichActivity"})) (clojure.core/contains? input :device-registry-enrich) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-registry-enrich-activity (input :device-registry-enrich)) #:http.request.field{:name "deviceRegistryEnrich", :shape "DeviceRegistryEnrichActivity"})) (clojure.core/contains? input :select-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-select-attributes-activity (input :select-attributes)) #:http.request.field{:name "selectAttributes", :shape "SelectAttributesActivity"})) (clojure.core/contains? input :math) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-math-activity (input :math)) #:http.request.field{:name "math", :shape "MathActivity"})) (clojure.core/contains? input :add-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-attributes-activity (input :add-attributes)) #:http.request.field{:name "addAttributes", :shape "AddAttributesActivity"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-activity (input :filter)) #:http.request.field{:name "filter", :shape "FilterActivity"})) (clojure.core/contains? input :remove-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remove-attributes-activity (input :remove-attributes)) #:http.request.field{:name "removeAttributes", :shape "RemoveAttributesActivity"})) (clojure.core/contains? input :channel) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-channel-activity (input :channel)) #:http.request.field{:name "channel", :shape "ChannelActivity"})) (clojure.core/contains? input :datastore) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-datastore-activity (input :datastore)) #:http.request.field{:name "datastore", :shape "DatastoreActivity"})) (clojure.core/contains? input :lambda) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-activity (input :lambda)) #:http.request.field{:name "lambda", :shape "LambdaActivity"}))))

(clojure.core/defn- ser-sql-query-dataset-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sql-query (:sql-query input)) #:http.request.field{:name "sqlQuery", :shape "SqlQuery"})], :shape "SqlQueryDatasetAction", :type "structure"} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-filters (input :filters)) #:http.request.field{:name "filters", :shape "QueryFilters"}))))

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-id (:message-id input)) #:http.request.field{:name "messageId", :shape "MessageId"}) (clojure.core/into (ser-message-payload (:payload input)) #:http.request.field{:name "payload", :shape "MessagePayload"})], :shape "Message", :type "structure"}))

(clojure.core/defn- ser-dataset-actions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dataset-action coll) #:http.request.field{:shape "DatasetAction"}))) input), :shape "DatasetActions", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-remove-attributes-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-attribute-names (:attributes input)) #:http.request.field{:name "attributes", :shape "AttributeNames"})], :shape "RemoveAttributesActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-variable-name [input] #:http.request.field{:value input, :shape "VariableName"})

(clojure.core/defn- ser-output-file-uri-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-output-file-name (:file-name input)) #:http.request.field{:name "fileName", :shape "OutputFileName"})], :shape "OutputFileUriValue", :type "structure"}))

(clojure.core/defn- ser-dataset-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DatasetAction", :type "structure"} (clojure.core/contains? input :action-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-action-name (input :action-name)) #:http.request.field{:name "actionName", :shape "DatasetActionName"})) (clojure.core/contains? input :query-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sql-query-dataset-action (input :query-action)) #:http.request.field{:name "queryAction", :shape "SqlQueryDatasetAction"})) (clojure.core/contains? input :container-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-dataset-action (input :container-action)) #:http.request.field{:name "containerAction", :shape "ContainerDatasetAction"}))))

(clojure.core/defn- ser-include-statistics-flag [input] #:http.request.field{:value input, :shape "IncludeStatisticsFlag"})

(clojure.core/defn- ser-time-expression [input] #:http.request.field{:value input, :shape "TimeExpression"})

(clojure.core/defn- ser-dataset-content-version-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dataset-name (:dataset-name input)) #:http.request.field{:name "datasetName", :shape "DatasetName"})], :shape "DatasetContentVersionValue", :type "structure"}))

(clojure.core/defn- ser-offset-seconds [input] #:http.request.field{:value input, :shape "OffsetSeconds"})

(clojure.core/defn- ser-add-attributes-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-attribute-name-mapping (:attributes input)) #:http.request.field{:name "attributes", :shape "AttributeNameMapping"})], :shape "AddAttributesActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-resource-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-compute-type (:compute-type input)) #:http.request.field{:name "computeType", :shape "ComputeType"}) (clojure.core/into (ser-volume-size-in-gb (:volume-size-in-gb input)) #:http.request.field{:name "volumeSizeInGB", :shape "VolumeSizeInGB"})], :shape "ResourceConfiguration", :type "structure"}))

(clojure.core/defn- ser-dataset-triggers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dataset-trigger coll) #:http.request.field{:shape "DatasetTrigger"}))) input), :shape "DatasetTriggers", :type "list", :max 5, :min 0})

(clojure.core/defn- ser-sql-query [input] #:http.request.field{:value input, :shape "SqlQuery"})

(clojure.core/defn- ser-max-messages [input] #:http.request.field{:value input, :shape "MaxMessages"})

(clojure.core/defn- ser-schedule-expression [input] #:http.request.field{:value input, :shape "ScheduleExpression"})

(clojure.core/defn- ser-variable [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-variable-name (:name input)) #:http.request.field{:name "name", :shape "VariableName"})], :shape "Variable", :type "structure"} (clojure.core/contains? input :string-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-value (input :string-value)) #:http.request.field{:name "stringValue", :shape "StringValue"})) (clojure.core/contains? input :double-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-value (input :double-value)) #:http.request.field{:name "doubleValue", :shape "DoubleValue", :box true})) (clojure.core/contains? input :dataset-content-version-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-content-version-value (input :dataset-content-version-value)) #:http.request.field{:name "datasetContentVersionValue", :shape "DatasetContentVersionValue"})) (clojure.core/contains? input :output-file-uri-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-file-uri-value (input :output-file-uri-value)) #:http.request.field{:name "outputFileUriValue", :shape "OutputFileUriValue"}))))

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-device-registry-enrich-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-attribute-name (:attribute input)) #:http.request.field{:name "attribute", :shape "AttributeName"}) (clojure.core/into (ser-attribute-name (:thing-name input)) #:http.request.field{:name "thingName", :shape "AttributeName"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "RoleArn"})], :shape "DeviceRegistryEnrichActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-dataset-trigger [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DatasetTrigger", :type "structure"} (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule (input :schedule)) #:http.request.field{:name "schedule", :shape "Schedule"})) (clojure.core/contains? input :dataset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-triggering-dataset (input :dataset)) #:http.request.field{:name "dataset", :shape "TriggeringDataset"}))))

(clojure.core/defn- ser-compute-type [input] #:http.request.field{:value (clojure.core/get {"ACU_1" "ACU_1", :acu-1 "ACU_1", "ACU_2" "ACU_2", :acu-2 "ACU_2"} input), :shape "ComputeType"})

(clojure.core/defn- ser-lambda-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-lambda-name (:lambda-name input)) #:http.request.field{:name "lambdaName", :shape "LambdaName"}) (clojure.core/into (ser-activity-batch-size (:batch-size input)) #:http.request.field{:name "batchSize", :shape "ActivityBatchSize"})], :shape "LambdaActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-delta-time [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-offset-seconds (:offset-seconds input)) #:http.request.field{:name "offsetSeconds", :shape "OffsetSeconds"}) (clojure.core/into (ser-time-expression (:time-expression input)) #:http.request.field{:name "timeExpression", :shape "TimeExpression"})], :shape "DeltaTime", :type "structure"}))

(clojure.core/defn- ser-schedule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Schedule", :type "structure"} (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-expression (input :expression)) #:http.request.field{:name "expression", :shape "ScheduleExpression"}))))

(clojure.core/defn- ser-unlimited-retention-period [input] #:http.request.field{:value input, :shape "UnlimitedRetentionPeriod"})

(clojure.core/defn- ser-image [input] #:http.request.field{:value input, :shape "Image"})

(clojure.core/defn- ser-logging-level [input] #:http.request.field{:value (clojure.core/get {"ERROR" "ERROR", :error "ERROR"} input), :shape "LoggingLevel"})

(clojure.core/defn- ser-query-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "QueryFilter", :type "structure"} (clojure.core/contains? input :delta-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delta-time (input :delta-time)) #:http.request.field{:name "deltaTime", :shape "DeltaTime"}))))

(clojure.core/defn- ser-retention-period [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RetentionPeriod", :type "structure"} (clojure.core/contains? input :unlimited) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-unlimited-retention-period (input :unlimited)) #:http.request.field{:name "unlimited", :shape "UnlimitedRetentionPeriod"})) (clojure.core/contains? input :number-of-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period-in-days (input :number-of-days)) #:http.request.field{:name "numberOfDays", :shape "RetentionPeriodInDays"}))))

(clojure.core/defn- ser-retention-period-in-days [input] #:http.request.field{:value input, :shape "RetentionPeriodInDays"})

(clojure.core/defn- ser-container-dataset-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-image (:image input)) #:http.request.field{:name "image", :shape "Image"}) (clojure.core/into (ser-role-arn (:execution-role-arn input)) #:http.request.field{:name "executionRoleArn", :shape "RoleArn"}) (clojure.core/into (ser-resource-configuration (:resource-configuration input)) #:http.request.field{:name "resourceConfiguration", :shape "ResourceConfiguration"})], :shape "ContainerDatasetAction", :type "structure"} (clojure.core/contains? input :variables) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-variables (input :variables)) #:http.request.field{:name "variables", :shape "Variables"}))))

(clojure.core/defn- ser-string-value [input] #:http.request.field{:value input, :shape "StringValue"})

(clojure.core/defn- ser-math-expression [input] #:http.request.field{:value input, :shape "MathExpression"})

(clojure.core/defn- ser-activity-name [input] #:http.request.field{:value input, :shape "ActivityName"})

(clojure.core/defn- ser-reprocessing-id [input] #:http.request.field{:value input, :shape "ReprocessingId"})

(clojure.core/defn- req-list-datastores-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-describe-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName", :location "uri", :location-name "pipelineName"})]}))

(clojure.core/defn- req-describe-datastore-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-datastore-name (input :datastore-name)) #:http.request.field{:name "datastoreName", :shape "DatastoreName", :location "uri", :location-name "datastoreName"})]} (clojure.core/contains? input :include-statistics) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-statistics-flag (input :include-statistics)) #:http.request.field{:name "includeStatistics", :shape "IncludeStatisticsFlag", :location "querystring", :location-name "includeStatistics"}))))

(clojure.core/defn- req-update-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-channel-name (input :channel-name)) #:http.request.field{:name "channelName", :shape "ChannelName", :location "uri", :location-name "channelName"})]} (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"}))))

(clojure.core/defn- req-list-pipelines-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-create-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName"}) (clojure.core/into (ser-dataset-actions (input :actions)) #:http.request.field{:name "actions", :shape "DatasetActions"})]} (clojure.core/contains? input :triggers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-triggers (input :triggers)) #:http.request.field{:name "triggers", :shape "DatasetTriggers"})) (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-create-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName"}) (clojure.core/into (ser-pipeline-activities (input :pipeline-activities)) #:http.request.field{:name "pipelineActivities", :shape "PipelineActivities"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "ResourceArn", :location "querystring", :location-name "resourceArn"})]}))

(clojure.core/defn- req-batch-put-message-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-channel-name (input :channel-name)) #:http.request.field{:name "channelName", :shape "ChannelName"}) (clojure.core/into (ser-messages (input :messages)) #:http.request.field{:name "messages", :shape "Messages"})]}))

(clojure.core/defn- req-update-datastore-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-datastore-name (input :datastore-name)) #:http.request.field{:name "datastoreName", :shape "DatastoreName", :location "uri", :location-name "datastoreName"})]} (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"}))))

(clojure.core/defn- req-put-logging-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-logging-options (input :logging-options)) #:http.request.field{:name "loggingOptions", :shape "LoggingOptions"})]}))

(clojure.core/defn- req-describe-logging-options-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-channel-name (input :channel-name)) #:http.request.field{:name "channelName", :shape "ChannelName"})]} (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "ResourceArn", :location "querystring", :location-name "resourceArn"})], :body [(clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})]}))

(clojure.core/defn- req-list-datasets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName", :location "uri", :location-name "pipelineName"})]}))

(clojure.core/defn- req-get-dataset-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-content-version (input :version-id)) #:http.request.field{:name "versionId", :shape "DatasetContentVersion", :location "querystring", :location-name "versionId"}))))

(clojure.core/defn- req-delete-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]}))

(clojure.core/defn- req-describe-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]}))

(clojure.core/defn- req-delete-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-channel-name (input :channel-name)) #:http.request.field{:name "channelName", :shape "ChannelName", :location "uri", :location-name "channelName"})]}))

(clojure.core/defn- req-describe-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-channel-name (input :channel-name)) #:http.request.field{:name "channelName", :shape "ChannelName", :location "uri", :location-name "channelName"})]} (clojure.core/contains? input :include-statistics) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-statistics-flag (input :include-statistics)) #:http.request.field{:name "includeStatistics", :shape "IncludeStatisticsFlag", :location "querystring", :location-name "includeStatistics"}))))

(clojure.core/defn- req-sample-channel-data-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-channel-name (input :channel-name)) #:http.request.field{:name "channelName", :shape "ChannelName", :location "uri", :location-name "channelName"})]} (clojure.core/contains? input :max-messages) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-messages (input :max-messages)) #:http.request.field{:name "maxMessages", :shape "MaxMessages", :location "querystring", :location-name "maxMessages"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start-time (input :start-time)) #:http.request.field{:name "startTime", :shape "StartTime", :location "querystring", :location-name "startTime"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-end-time (input :end-time)) #:http.request.field{:name "endTime", :shape "EndTime", :location "querystring", :location-name "endTime"}))))

(clojure.core/defn- req-start-pipeline-reprocessing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName", :location "uri", :location-name "pipelineName"})]} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start-time (input :start-time)) #:http.request.field{:name "startTime", :shape "StartTime"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-end-time (input :end-time)) #:http.request.field{:name "endTime", :shape "EndTime"}))))

(clojure.core/defn- req-update-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})], :body [(clojure.core/into (ser-dataset-actions (input :actions)) #:http.request.field{:name "actions", :shape "DatasetActions"})]} (clojure.core/contains? input :triggers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-triggers (input :triggers)) #:http.request.field{:name "triggers", :shape "DatasetTriggers"})) (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"}))))

(clojure.core/defn- req-list-channels-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName", :location "uri", :location-name "pipelineName"})], :body [(clojure.core/into (ser-pipeline-activities (input :pipeline-activities)) #:http.request.field{:name "pipelineActivities", :shape "PipelineActivities"})]}))

(clojure.core/defn- req-list-dataset-contents-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-datastore-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-datastore-name (input :datastore-name)) #:http.request.field{:name "datastoreName", :shape "DatastoreName", :location "uri", :location-name "datastoreName"})]}))

(clojure.core/defn- req-delete-dataset-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-content-version (input :version-id)) #:http.request.field{:name "versionId", :shape "DatasetContentVersion", :location "querystring", :location-name "versionId"}))))

(clojure.core/defn- req-create-datastore-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-datastore-name (input :datastore-name)) #:http.request.field{:name "datastoreName", :shape "DatastoreName"})]} (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-create-dataset-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]}))

(clojure.core/defn- req-run-pipeline-activity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-activity (input :pipeline-activity)) #:http.request.field{:name "pipelineActivity", :shape "PipelineActivity"}) (clojure.core/into (ser-message-payloads (input :payloads)) #:http.request.field{:name "payloads", :shape "MessagePayloads"})]}))

(clojure.core/defn- req-cancel-pipeline-reprocessing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName", :location "uri", :location-name "pipelineName"}) (clojure.core/into (ser-reprocessing-id (input :reprocessing-id)) #:http.request.field{:name "reprocessingId", :shape "ReprocessingId", :location "uri", :location-name "reprocessingId"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "ResourceArn", :location "querystring", :location-name "resourceArn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "TagKeyList", :location "querystring", :location-name "tagKeys"})]}))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/messages (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/message))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datastores-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datastores-request/next-token :portkey.aws.iotanalytics.list-datastores-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.describe-pipeline-request/pipeline-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-datastore-request/include-statistics (clojure.spec.alpha/and :portkey.aws.iotanalytics/include-statistics-flag))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-datastore-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.describe-datastore-request/datastore-name] :opt-un [:portkey.aws.iotanalytics.describe-datastore-request/include-statistics]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/activity-batch-size (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/attribute-names (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/attribute-name :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 7 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-response/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-response/pipeline-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-pipeline-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-pipeline-response/pipeline-name :portkey.aws.iotanalytics.create-pipeline-response/pipeline-arn]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/datastore-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-datastore-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-datastore-response/datastore-name :portkey.aws.iotanalytics.create-datastore-response/datastore-arn :portkey.aws.iotanalytics.create-datastore-response/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/end-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset/name :portkey.aws.iotanalytics.dataset/arn :portkey.aws.iotanalytics.dataset/actions :portkey.aws.iotanalytics.dataset/triggers :portkey.aws.iotanalytics.dataset/status :portkey.aws.iotanalytics.dataset/creation-time :portkey.aws.iotanalytics.dataset/last-update-time :portkey.aws.iotanalytics.dataset/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-channel-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.update-channel-request/channel-name] :opt-un [:portkey.aws.iotanalytics.update-channel-request/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-activity/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.datastore-activity/name :portkey.aws.iotanalytics.datastore-activity/datastore-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-content-summary))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.math-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.math-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.math-activity/math (clojure.spec.alpha/and :portkey.aws.iotanalytics/math-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.math-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/math-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.math-activity/name :portkey.aws.iotanalytics.math-activity/attribute :portkey.aws.iotanalytics.math-activity/math] :opt-un [:portkey.aws.iotanalytics.math-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-pipelines-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-pipelines-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-pipelines-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-pipelines-request/next-token :portkey.aws.iotanalytics.list-pipelines-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/entry-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-tags-for-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/message-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/volume-size-in-gb (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-statistics/size (clojure.spec.alpha/and :portkey.aws.iotanalytics/estimated-resource-size))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.datastore-statistics/size]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/variables (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/variable :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.start-pipeline-reprocessing-response/reprocessing-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/start-pipeline-reprocessing-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.start-pipeline-reprocessing-response/reprocessing-id]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.run-pipeline-activity-response/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.run-pipeline-activity-response/log-result (clojure.spec.alpha/and :portkey.aws.iotanalytics/log-result))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/run-pipeline-activity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.run-pipeline-activity-response/payloads :portkey.aws.iotanalytics.run-pipeline-activity-response/log-result]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.create-dataset-request/dataset-name :portkey.aws.iotanalytics.create-dataset-request/actions] :opt-un [:portkey.aws.iotanalytics.create-dataset-request/triggers :portkey.aws.iotanalytics.create-dataset-request/retention-period :portkey.aws.iotanalytics.create-dataset-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-request/pipeline-activities (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-request/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.create-pipeline-request/pipeline-name :portkey.aws.iotanalytics.create-pipeline-request/pipeline-activities] :opt-un [:portkey.aws.iotanalytics.create-pipeline-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-summary/version (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-summary/schedule-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-content-summary/version :portkey.aws.iotanalytics.dataset-content-summary/status :portkey.aws.iotanalytics.dataset-content-summary/creation-time :portkey.aws.iotanalytics.dataset-content-summary/schedule-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-response/datastore-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datastores-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datastores-response/datastore-summaries :portkey.aws.iotanalytics.list-datastores-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-content-response/version-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-dataset-content-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-dataset-content-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/start-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/thing-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-shadow-enrich-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/device-shadow-enrich-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.device-shadow-enrich-activity/name :portkey.aws.iotanalytics.device-shadow-enrich-activity/attribute :portkey.aws.iotanalytics.device-shadow-enrich-activity/thing-name :portkey.aws.iotanalytics.device-shadow-enrich-activity/role-arn] :opt-un [:portkey.aws.iotanalytics.device-shadow-enrich-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.select-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.select-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-names))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.select-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/select-attributes-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.select-attributes-activity/name :portkey.aws.iotanalytics.select-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.select-attributes-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-request/messages (clojure.spec.alpha/and :portkey.aws.iotanalytics/messages))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.batch-put-message-request/channel-name :portkey.aws.iotanalytics.batch-put-message-request/messages] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-state #{:creating "SUCCEEDED" "CREATING" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.iotanalytics/output-file-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\w\.-]{1,255}" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/channel-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-channel-response/channel-name :portkey.aws.iotanalytics.create-channel-response/channel-arn :portkey.aws.iotanalytics.create-channel-response/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 20 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-summary/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.datastore-summary/datastore-name :portkey.aws.iotanalytics.datastore-summary/status :portkey.aws.iotanalytics.datastore-summary/creation-time :portkey.aws.iotanalytics.datastore-summary/last-update-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/message-payload clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/activities (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/reprocessing-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.pipeline/name :portkey.aws.iotanalytics.pipeline/arn :portkey.aws.iotanalytics.pipeline/activities :portkey.aws.iotanalytics.pipeline/reprocessing-summaries :portkey.aws.iotanalytics.pipeline/creation-time :portkey.aws.iotanalytics.pipeline/last-update-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/size-in-bytes clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-datastore-response/datastore (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-datastore-response/statistics (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-statistics))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-datastore-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-datastore-response/datastore :portkey.aws.iotanalytics.describe-datastore-response/statistics]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-channel-response/channel (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-channel-response/statistics (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-statistics))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-channel-response/channel :portkey.aws.iotanalytics.describe-channel-response/statistics]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-dataset-contents-response/dataset-content-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-dataset-contents-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-dataset-contents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-dataset-contents-response/dataset-content-summaries :portkey.aws.iotanalytics.list-dataset-contents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-datastore-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-datastore-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.update-datastore-request/datastore-name] :opt-un [:portkey.aws.iotanalytics.update-datastore-request/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.put-logging-options-request/logging-options (clojure.spec.alpha/and :portkey.aws.iotanalytics/logging-options))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/put-logging-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.put-logging-options-request/logging-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.logging-options/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.logging-options/level (clojure.spec.alpha/and :portkey.aws.iotanalytics/logging-level))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.logging-options/enabled (clojure.spec.alpha/and :portkey.aws.iotanalytics/logging-enabled))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/logging-options (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.logging-options/role-arn :portkey.aws.iotanalytics.logging-options/level :portkey.aws.iotanalytics.logging-options/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-activities (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/pipeline-activity :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/message-payloads (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/message-payload :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/datastore-summary))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.resource-already-exists-exception/message :portkey.aws.iotanalytics/resource-id :portkey.aws.iotanalytics/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-entries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-entry))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-status #{:running :cancelled "SUCCEEDED" "FAILED" "CANCELLED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.iotanalytics/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.channel-summary/channel-name :portkey.aws.iotanalytics.channel-summary/status :portkey.aws.iotanalytics.channel-summary/creation-time :portkey.aws.iotanalytics.channel-summary/last-update-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-logging-options-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/logging-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.channel-activity/name :portkey.aws.iotanalytics.channel-activity/channel-name] :opt-un [:portkey.aws.iotanalytics.channel-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-request/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.create-channel-request/channel-name] :opt-un [:portkey.aws.iotanalytics.create-channel-request/retention-period :portkey.aws.iotanalytics.create-channel-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.triggering-dataset/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/triggering-dataset (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.triggering-dataset/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-response/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-response/dataset-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-dataset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-dataset-response/dataset-name :portkey.aws.iotanalytics.create-dataset-response/dataset-arn :portkey.aws.iotanalytics.create-dataset-response/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.reprocessing-summary/id (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.reprocessing-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.reprocessing-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.reprocessing-summary/id :portkey.aws.iotanalytics.reprocessing-summary/status :portkey.aws.iotanalytics.reprocessing-summary/creation-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.tag-resource-request/resource-arn :portkey.aws.iotanalytics.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-list (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/query-filters (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/query-filter :min-count 0 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datasets-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datasets-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datasets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datasets-request/next-token :portkey.aws.iotanalytics.list-datasets-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.delete-pipeline-request/pipeline-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.filter-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.filter-activity/filter (clojure.spec.alpha/and :portkey.aws.iotanalytics/filter-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.filter-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/filter-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.filter-activity/name :portkey.aws.iotanalytics.filter-activity/filter] :opt-un [:portkey.aws.iotanalytics.filter-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-request/version-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/get-dataset-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.get-dataset-content-request/dataset-name] :opt-un [:portkey.aws.iotanalytics.get-dataset-content-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/presigned-uri (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-channels-response/channel-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-channels-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-channels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-channels-response/channel-summaries :portkey.aws.iotanalytics.list-channels-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/attribute-name-mapping (clojure.spec.alpha/map-of :portkey.aws.iotanalytics/attribute-name :portkey.aws.iotanalytics/attribute-name))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/lambda-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_-]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/double-value clojure.core/double?)

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
(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-activity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.pipeline-activity/device-shadow-enrich :portkey.aws.iotanalytics.pipeline-activity/device-registry-enrich :portkey.aws.iotanalytics.pipeline-activity/select-attributes :portkey.aws.iotanalytics.pipeline-activity/math :portkey.aws.iotanalytics.pipeline-activity/add-attributes :portkey.aws.iotanalytics.pipeline-activity/filter :portkey.aws.iotanalytics.pipeline-activity/remove-attributes :portkey.aws.iotanalytics.pipeline-activity/channel :portkey.aws.iotanalytics.pipeline-activity/datastore :portkey.aws.iotanalytics.pipeline-activity/lambda]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-summary/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-summary/reprocessing-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.pipeline-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.pipeline-summary/pipeline-name :portkey.aws.iotanalytics.pipeline-summary/reprocessing-summaries :portkey.aws.iotanalytics.pipeline-summary/creation-time :portkey.aws.iotanalytics.pipeline-summary/last-update-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.sql-query-dataset-action/sql-query (clojure.spec.alpha/and :portkey.aws.iotanalytics/sql-query))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.sql-query-dataset-action/filters (clojure.spec.alpha/and :portkey.aws.iotanalytics/query-filters))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/sql-query-dataset-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.sql-query-dataset-action/sql-query] :opt-un [:portkey.aws.iotanalytics.sql-query-dataset-action/filters]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.delete-dataset-request/dataset-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.message/message-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.message/payload (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-payload))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/message (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.message/message-id :portkey.aws.iotanalytics.message/payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-actions (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-action :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.describe-dataset-request/dataset-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.remove-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.remove-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-names))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.remove-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/remove-attributes-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.remove-attributes-activity/name :portkey.aws.iotanalytics.remove-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.remove-attributes-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.delete-channel-request/channel-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/variable-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-channel-request/include-statistics (clojure.spec.alpha/and :portkey.aws.iotanalytics/include-statistics-flag))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.describe-channel-request/channel-name] :opt-un [:portkey.aws.iotanalytics.describe-channel-request/include-statistics]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-dataset-response/dataset (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-dataset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-dataset-response/dataset]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.datastore/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.datastore/name :portkey.aws.iotanalytics.datastore/arn :portkey.aws.iotanalytics.datastore/status :portkey.aws.iotanalytics.datastore/retention-period :portkey.aws.iotanalytics.datastore/creation-time :portkey.aws.iotanalytics.datastore/last-update-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.output-file-uri-value/file-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/output-file-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/output-file-uri-value (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.output-file-uri-value/file-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action/action-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-action-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action/query-action (clojure.spec.alpha/and :portkey.aws.iotanalytics/sql-query-dataset-action))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action/container-action (clojure.spec.alpha/and :portkey.aws.iotanalytics/container-dataset-action))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-action/action-name :portkey.aws.iotanalytics.dataset-action/query-action :portkey.aws.iotanalytics.dataset-action/container-action]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-request/max-messages (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-messages))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-request/start-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/start-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-request/end-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/end-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/sample-channel-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.sample-channel-data-request/channel-name] :opt-un [:portkey.aws.iotanalytics.sample-channel-data-request/max-messages :portkey.aws.iotanalytics.sample-channel-data-request/start-time :portkey.aws.iotanalytics.sample-channel-data-request/end-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.start-pipeline-reprocessing-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.start-pipeline-reprocessing-request/start-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/start-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.start-pipeline-reprocessing-request/end-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/end-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/start-pipeline-reprocessing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.start-pipeline-reprocessing-request/pipeline-name] :opt-un [:portkey.aws.iotanalytics.start-pipeline-reprocessing-request/start-time :portkey.aws.iotanalytics.start-pipeline-reprocessing-request/end-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/include-statistics-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics/time-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-version-value/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-version-value (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.dataset-content-version-value/dataset-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-entry/entry-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/entry-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-entry/data-uri (clojure.spec.alpha/and :portkey.aws.iotanalytics/presigned-uri))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-entry/entry-name :portkey.aws.iotanalytics.dataset-entry/data-uri]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-error-entries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/batch-put-message-error-entry))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/offset-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.update-dataset-request/dataset-name :portkey.aws.iotanalytics.update-dataset-request/actions] :opt-un [:portkey.aws.iotanalytics.update-dataset-request/triggers :portkey.aws.iotanalytics.update-dataset-request/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action-type #{"QUERY" :container :query "CONTAINER"})

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/reprocessing-summary))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.add-attributes-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.add-attributes-activity/attributes (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name-mapping))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.add-attributes-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/add-attributes-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.add-attributes-activity/name :portkey.aws.iotanalytics.add-attributes-activity/attributes] :opt-un [:portkey.aws.iotanalytics.add-attributes-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.resource-configuration/compute-type (clojure.spec.alpha/and :portkey.aws.iotanalytics/compute-type))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.resource-configuration/volume-size-in-gb (clojure.spec.alpha/and :portkey.aws.iotanalytics/volume-size-in-gb))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.resource-configuration/compute-type :portkey.aws.iotanalytics.resource-configuration/volume-size-in-gb] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-triggers (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-trigger :min-count 0 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/sql-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/max-messages (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/schedule-expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-channels-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-channels-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-channels-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-channels-request/next-token :portkey.aws.iotanalytics.list-channels-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-logging-options-response/logging-options (clojure.spec.alpha/and :portkey.aws.iotanalytics/logging-options))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-logging-options-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-logging-options-response/logging-options]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-error-entry/message-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-error-entry/error-code (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-code))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-error-entry/error-message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-error-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.batch-put-message-error-entry/message-id :portkey.aws.iotanalytics.batch-put-message-error-entry/error-code :portkey.aws.iotanalytics.batch-put-message-error-entry/error-message]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-pipeline-request/pipeline-activities (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.update-pipeline-request/pipeline-name :portkey.aws.iotanalytics.update-pipeline-request/pipeline-activities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.variable/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/variable-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.variable/string-value (clojure.spec.alpha/and :portkey.aws.iotanalytics/string-value))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.variable/double-value (clojure.spec.alpha/and :portkey.aws.iotanalytics/double-value))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.variable/dataset-content-version-value (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-version-value))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.variable/output-file-uri-value (clojure.spec.alpha/and :portkey.aws.iotanalytics/output-file-uri-value))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/variable (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.variable/name] :opt-un [:portkey.aws.iotanalytics.variable/string-value :portkey.aws.iotanalytics.variable/double-value :portkey.aws.iotanalytics.variable/dataset-content-version-value :portkey.aws.iotanalytics.variable/output-file-uri-value]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 20 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/attribute (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/thing-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.device-registry-enrich-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/device-registry-enrich-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.device-registry-enrich-activity/name :portkey.aws.iotanalytics.device-registry-enrich-activity/attribute :portkey.aws.iotanalytics.device-registry-enrich-activity/thing-name :portkey.aws.iotanalytics.device-registry-enrich-activity/role-arn] :opt-un [:portkey.aws.iotanalytics.device-registry-enrich-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.channel/name :portkey.aws.iotanalytics.channel/arn :portkey.aws.iotanalytics.channel/status :portkey.aws.iotanalytics.channel/retention-period :portkey.aws.iotanalytics.channel/creation-time :portkey.aws.iotanalytics.channel/last-update-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-dataset-contents-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-dataset-contents-request/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-dataset-contents-request/max-results (clojure.spec.alpha/and :portkey.aws.iotanalytics/max-results))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-dataset-contents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.list-dataset-contents-request/dataset-name] :opt-un [:portkey.aws.iotanalytics.list-dataset-contents-request/next-token :portkey.aws.iotanalytics.list-dataset-contents-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.describe-pipeline-response/pipeline (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-pipeline-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.describe-pipeline-response/pipeline]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.estimated-resource-size/estimated-size-in-bytes (clojure.spec.alpha/and :portkey.aws.iotanalytics/size-in-bytes))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.estimated-resource-size/estimated-on (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/estimated-resource-size (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.estimated-resource-size/estimated-size-in-bytes :portkey.aws.iotanalytics.estimated-resource-size/estimated-on]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-pipelines-response/pipeline-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-pipelines-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-pipelines-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-pipelines-response/pipeline-summaries :portkey.aws.iotanalytics.list-pipelines-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.tag/key (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-key))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.tag/value (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-value))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.tag/key :portkey.aws.iotanalytics.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-datastore-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.delete-datastore-request/datastore-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-trigger/schedule (clojure.spec.alpha/and :portkey.aws.iotanalytics/schedule))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-trigger/dataset (clojure.spec.alpha/and :portkey.aws.iotanalytics/triggering-dataset))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-trigger (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-trigger/schedule :portkey.aws.iotanalytics.dataset-trigger/dataset]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.delete-dataset-content-request/version-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delete-dataset-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.delete-dataset-content-request/dataset-name] :opt-un [:portkey.aws.iotanalytics.delete-dataset-content-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/compute-type #{:acu-1 :acu-2 "ACU_2" "ACU_1"})

(clojure.spec.alpha/def :portkey.aws.iotanalytics.lambda-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.lambda-activity/lambda-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/lambda-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.lambda-activity/batch-size (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-batch-size))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.lambda-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/lambda-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.lambda-activity/name :portkey.aws.iotanalytics.lambda-activity/lambda-name :portkey.aws.iotanalytics.lambda-activity/batch-size] :opt-un [:portkey.aws.iotanalytics.lambda-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.iotanalytics.delta-time/offset-seconds (clojure.spec.alpha/and :portkey.aws.iotanalytics/offset-seconds))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.delta-time/time-expression (clojure.spec.alpha/and :portkey.aws.iotanalytics/time-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/delta-time (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.delta-time/offset-seconds :portkey.aws.iotanalytics.delta-time/time-expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.schedule/expression (clojure.spec.alpha/and :portkey.aws.iotanalytics/schedule-expression))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/schedule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.schedule/expression]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-response/entries (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-entries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-response/timestamp (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.get-dataset-content-response/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/get-dataset-content-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.get-dataset-content-response/entries :portkey.aws.iotanalytics.get-dataset-content-response/timestamp :portkey.aws.iotanalytics.get-dataset-content-response/status]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/unlimited-retention-period clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-status/state (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-state))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-status/reason (clojure.spec.alpha/and :portkey.aws.iotanalytics/reason))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-content-status/state :portkey.aws.iotanalytics.dataset-content-status/reason]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-request/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-request/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-datastore-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.create-datastore-request/datastore-name] :opt-un [:portkey.aws.iotanalytics.create-datastore-request/retention-period :portkey.aws.iotanalytics.create-datastore-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/image (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/logging-level #{"ERROR" :error})

(clojure.spec.alpha/def :portkey.aws.iotanalytics.query-filter/delta-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/delta-time))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/query-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.query-filter/delta-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.sample-channel-data-response/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/sample-channel-data-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.sample-channel-data-response/payloads]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.retention-period/unlimited (clojure.spec.alpha/and :portkey.aws.iotanalytics/unlimited-retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.retention-period/number-of-days (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period-in-days))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/retention-period (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.retention-period/unlimited :portkey.aws.iotanalytics.retention-period/number-of-days]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/retention-period-in-days (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/pipeline-summary))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-content-request/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-dataset-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.create-dataset-content-request/dataset-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.run-pipeline-activity-request/pipeline-activity (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activity))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.run-pipeline-activity-request/payloads (clojure.spec.alpha/and :portkey.aws.iotanalytics/message-payloads))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/run-pipeline-activity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.run-pipeline-activity-request/pipeline-activity :portkey.aws.iotanalytics.run-pipeline-activity-request/payloads] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.cancel-pipeline-reprocessing-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.cancel-pipeline-reprocessing-request/reprocessing-id (clojure.spec.alpha/and :portkey.aws.iotanalytics/reprocessing-id))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.cancel-pipeline-reprocessing-request/pipeline-name :portkey.aws.iotanalytics.cancel-pipeline-reprocessing-request/reprocessing-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.container-dataset-action/image (clojure.spec.alpha/and :portkey.aws.iotanalytics/image))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.container-dataset-action/execution-role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.container-dataset-action/resource-configuration (clojure.spec.alpha/and :portkey.aws.iotanalytics/resource-configuration))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.container-dataset-action/variables (clojure.spec.alpha/and :portkey.aws.iotanalytics/variables))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/container-dataset-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.container-dataset-action/image :portkey.aws.iotanalytics.container-dataset-action/execution-role-arn :portkey.aws.iotanalytics.container-dataset-action/resource-configuration] :opt-un [:portkey.aws.iotanalytics.container-dataset-action/variables]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/channel-summary))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datasets-response/dataset-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datasets-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datasets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datasets-response/dataset-summaries :portkey.aws.iotanalytics.list-datasets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/log-result (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/dataset-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-summary/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-action-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-summary/dataset-name :portkey.aws.iotanalytics.dataset-summary/status :portkey.aws.iotanalytics.dataset-summary/creation-time :portkey.aws.iotanalytics.dataset-summary/last-update-time :portkey.aws.iotanalytics.dataset-summary/triggers :portkey.aws.iotanalytics.dataset-summary/actions]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.untag-resource-request/resource-arn :portkey.aws.iotanalytics.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/string-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 0 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-summary))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action-summary/action-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-action-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action-summary/action-type (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-action-type))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-action-summary/action-name :portkey.aws.iotanalytics.dataset-action-summary/action-type]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/math-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/activity-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-statistics/size (clojure.spec.alpha/and :portkey.aws.iotanalytics/estimated-resource-size))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.channel-statistics/size]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-response/batch-put-message-error-entries (clojure.spec.alpha/and :portkey.aws.iotanalytics/batch-put-message-error-entries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.batch-put-message-response/batch-put-message-error-entries]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-action-summary :min-count 1 :max-count 1))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "TagResource", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-resource-response))

(clojure.core/defn create-pipeline ([create-pipeline-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-pipeline-request create-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreatePipeline", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-pipeline-response))

(clojure.core/defn describe-dataset ([describe-dataset-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-dataset-request describe-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDataset", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-dataset-response))

(clojure.core/defn list-pipelines ([] (list-pipelines {})) ([list-pipelines-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-pipelines-request list-pipelines-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-pipelines-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-pipelines-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPipelines", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef list-pipelines :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-pipelines-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-pipelines-response))

(clojure.core/defn delete-channel ([delete-channel-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-channel-request delete-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{channelName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteChannel", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-channel-request) :ret clojure.core/true?)

(clojure.core/defn create-dataset-content ([create-dataset-content-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-dataset-content-request create-dataset-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-dataset-content-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}/content", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-dataset-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDatasetContent", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef create-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-dataset-content-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-dataset-content-response))

(clojure.core/defn describe-datastore ([describe-datastore-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-datastore-request describe-datastore-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-datastore-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores/{datastoreName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-datastore-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDatastore", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-datastore-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-datastore-response))

(clojure.core/defn update-datastore ([update-datastore-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-datastore-request update-datastore-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores/{datastoreName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/update-datastore-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDatastore", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef update-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-datastore-request) :ret clojure.core/true?)

(clojure.core/defn create-datastore ([create-datastore-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-datastore-request create-datastore-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-datastore-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-datastore-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDatastore", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-datastore-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-datastore-response))

(clojure.core/defn create-dataset ([create-dataset-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-dataset-request create-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDataset", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-dataset-response))

(clojure.core/defn update-channel ([update-channel-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-channel-request update-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{channelName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/update-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateChannel", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef update-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-channel-request) :ret clojure.core/true?)

(clojure.core/defn list-datasets ([] (list-datasets {})) ([list-datasets-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-datasets-request list-datasets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-datasets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-datasets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDatasets", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef list-datasets :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-datasets-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-datasets-response))

(clojure.core/defn put-logging-options ([put-logging-options-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-logging-options-request put-logging-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/logging", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/put-logging-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutLoggingOptions", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef put-logging-options :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/put-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn sample-channel-data ([sample-channel-data-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-sample-channel-data-request sample-channel-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/sample-channel-data-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{channelName}/sample", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/sample-channel-data-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "SampleChannelData", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef sample-channel-data :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/sample-channel-data-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/sample-channel-data-response))

(clojure.core/defn list-datastores ([] (list-datastores {})) ([list-datastores-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-datastores-request list-datastores-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-datastores-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-datastores-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDatastores", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef list-datastores :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-datastores-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-datastores-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-tags-for-resource-response))

(clojure.core/defn list-dataset-contents ([list-dataset-contents-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-dataset-contents-request list-dataset-contents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-dataset-contents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}/contents", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-dataset-contents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDatasetContents", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-dataset-contents :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/list-dataset-contents-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-dataset-contents-response))

(clojure.core/defn delete-dataset-content ([delete-dataset-content-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-dataset-content-request delete-dataset-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}/content", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-dataset-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDatasetContent", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-dataset-content-request) :ret clojure.core/true?)

(clojure.core/defn get-dataset-content ([get-dataset-content-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-dataset-content-request get-dataset-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/get-dataset-content-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}/content", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/get-dataset-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDatasetContent", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef get-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/get-dataset-content-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/get-dataset-content-response))

(clojure.core/defn update-dataset ([update-dataset-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-dataset-request update-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/update-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDataset", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef update-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-dataset-request) :ret clojure.core/true?)

(clojure.core/defn run-pipeline-activity ([run-pipeline-activity-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-run-pipeline-activity-request run-pipeline-activity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/run-pipeline-activity-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelineactivities/run", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/run-pipeline-activity-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RunPipelineActivity", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef run-pipeline-activity :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/run-pipeline-activity-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/run-pipeline-activity-response))

(clojure.core/defn start-pipeline-reprocessing ([start-pipeline-reprocessing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-start-pipeline-reprocessing-request start-pipeline-reprocessing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/start-pipeline-reprocessing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}/reprocessing", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/start-pipeline-reprocessing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartPipelineReprocessing", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef start-pipeline-reprocessing :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/start-pipeline-reprocessing-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/start-pipeline-reprocessing-response))

(clojure.core/defn describe-logging-options ([] (describe-logging-options {})) ([describe-logging-options-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-logging-options-request describe-logging-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-logging-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/logging", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-logging-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLoggingOptions", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-logging-options :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/describe-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-logging-options-response))

(clojure.core/defn describe-pipeline ([describe-pipeline-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-pipeline-request describe-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePipeline", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-pipeline-response))

(clojure.core/defn create-channel ([create-channel-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-channel-request create-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateChannel", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-channel-response))

(clojure.core/defn describe-channel ([describe-channel-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-channel-request describe-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{channelName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeChannel", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-channel-response))

(clojure.core/defn list-channels ([] (list-channels {})) ([list-channels-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-channels-request list-channels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-channels-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-channels-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListChannels", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef list-channels :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-channels-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-channels-response))

(clojure.core/defn delete-pipeline ([delete-pipeline-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-pipeline-request delete-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeletePipeline", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-pipeline-request) :ret clojure.core/true?)

(clojure.core/defn delete-datastore ([delete-datastore-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-datastore-request delete-datastore-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores/{datastoreName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-datastore-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDatastore", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-datastore-request) :ret clojure.core/true?)

(clojure.core/defn batch-put-message ([batch-put-message-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-batch-put-message-request batch-put-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/batch-put-message-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/messages/batch", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/batch-put-message-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "BatchPutMessage", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef batch-put-message :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/batch-put-message-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/batch-put-message-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "UntagResource", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/untag-resource-response))

(clojure.core/defn cancel-pipeline-reprocessing ([cancel-pipeline-reprocessing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-cancel-pipeline-reprocessing-request cancel-pipeline-reprocessing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}/reprocessing/{reprocessingId}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelPipelineReprocessing", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef cancel-pipeline-reprocessing :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-response))

(clojure.core/defn update-pipeline ([update-pipeline-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-pipeline-request update-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/update-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePipeline", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-pipeline-request) :ret clojure.core/true?)

(clojure.core/defn delete-dataset ([delete-dataset-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-dataset-request delete-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDataset", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-dataset-request) :ret clojure.core/true?)
