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
   "eu-central-1"
   {:credential-scope
    {:service "iotanalytics", :region "eu-central-1"},
    :ssl-common-name "iotanalytics.eu-central-1.amazonaws.com",
    :endpoint "https://iotanalytics.eu-central-1.amazonaws.com",
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

(clojure.core/declare ser-dataset-content-delivery-destination)

(clojure.core/declare ser-activity-batch-size)

(clojure.core/declare ser-attribute-names)

(clojure.core/declare ser-dataset-content-version)

(clojure.core/declare ser-iot-events-destination-configuration)

(clojure.core/declare ser-end-time)

(clojure.core/declare ser-datastore-activity)

(clojure.core/declare ser-math-activity)

(clojure.core/declare ser-entry-name)

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

(clojure.core/declare ser-dataset-content-delivery-rule)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-iot-events-input-name)

(clojure.core/declare ser-logging-enabled)

(clojure.core/declare ser-channel-activity)

(clojure.core/declare ser-dataset-content-delivery-rules)

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

(clojure.core/declare ser-timestamp)

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

(clojure.core/defn- ser-dataset-content-delivery-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DatasetContentDeliveryDestination", :type "structure"} (clojure.core/contains? input :iot-events-destination-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-iot-events-destination-configuration (input :iot-events-destination-configuration)) #:http.request.field{:name "iotEventsDestinationConfiguration", :shape "IotEventsDestinationConfiguration"}))))

(clojure.core/defn- ser-activity-batch-size [input] #:http.request.field{:value input, :shape "ActivityBatchSize"})

(clojure.core/defn- ser-attribute-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name coll) #:http.request.field{:shape "AttributeName"}))) input), :shape "AttributeNames", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-dataset-content-version [input] #:http.request.field{:value input, :shape "DatasetContentVersion"})

(clojure.core/defn- ser-iot-events-destination-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-iot-events-input-name (:input-name input)) #:http.request.field{:name "inputName", :shape "IotEventsInputName"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "RoleArn"})], :shape "IotEventsDestinationConfiguration", :type "structure"}))

(clojure.core/defn- ser-end-time [input] #:http.request.field{:value input, :shape "EndTime"})

(clojure.core/defn- ser-datastore-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-datastore-name (:datastore-name input)) #:http.request.field{:name "datastoreName", :shape "DatastoreName"})], :shape "DatastoreActivity", :type "structure"}))

(clojure.core/defn- ser-math-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-attribute-name (:attribute input)) #:http.request.field{:name "attribute", :shape "AttributeName"}) (clojure.core/into (ser-math-expression (:math input)) #:http.request.field{:name "math", :shape "MathExpression"})], :shape "MathActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-entry-name [input] #:http.request.field{:value input, :shape "EntryName"})

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

(clojure.core/defn- ser-dataset-content-delivery-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dataset-content-delivery-destination (:destination input)) #:http.request.field{:name "destination", :shape "DatasetContentDeliveryDestination"})], :shape "DatasetContentDeliveryRule", :type "structure"} (clojure.core/contains? input :entry-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entry-name (input :entry-name)) #:http.request.field{:name "entryName", :shape "EntryName"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-iot-events-input-name [input] #:http.request.field{:value input, :shape "IotEventsInputName"})

(clojure.core/defn- ser-logging-enabled [input] #:http.request.field{:value input, :shape "LoggingEnabled"})

(clojure.core/defn- ser-channel-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-activity-name (:name input)) #:http.request.field{:name "name", :shape "ActivityName"}) (clojure.core/into (ser-channel-name (:channel-name input)) #:http.request.field{:name "channelName", :shape "ChannelName"})], :shape "ChannelActivity", :type "structure"} (clojure.core/contains? input :next) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-name (input :next)) #:http.request.field{:name "next", :shape "ActivityName"}))))

(clojure.core/defn- ser-dataset-content-delivery-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dataset-content-delivery-rule coll) #:http.request.field{:shape "DatasetContentDeliveryRule"}))) input), :shape "DatasetContentDeliveryRules", :type "list", :max 20, :min 0})

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

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

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

(clojure.core/defn- req-create-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName"}) (clojure.core/into (ser-dataset-actions (input :actions)) #:http.request.field{:name "actions", :shape "DatasetActions"})]} (clojure.core/contains? input :triggers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-triggers (input :triggers)) #:http.request.field{:name "triggers", :shape "DatasetTriggers"})) (clojure.core/contains? input :content-delivery-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-content-delivery-rules (input :content-delivery-rules)) #:http.request.field{:name "contentDeliveryRules", :shape "DatasetContentDeliveryRules"})) (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

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

(clojure.core/defn- req-update-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})], :body [(clojure.core/into (ser-dataset-actions (input :actions)) #:http.request.field{:name "actions", :shape "DatasetActions"})]} (clojure.core/contains? input :triggers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-triggers (input :triggers)) #:http.request.field{:name "triggers", :shape "DatasetTriggers"})) (clojure.core/contains? input :content-delivery-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-content-delivery-rules (input :content-delivery-rules)) #:http.request.field{:name "contentDeliveryRules", :shape "DatasetContentDeliveryRules"})) (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"}))))

(clojure.core/defn- req-list-channels-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName", :location "uri", :location-name "pipelineName"})], :body [(clojure.core/into (ser-pipeline-activities (input :pipeline-activities)) #:http.request.field{:name "pipelineActivities", :shape "PipelineActivities"})]}))

(clojure.core/defn- req-list-dataset-contents-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :scheduled-on-or-after) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :scheduled-on-or-after)) #:http.request.field{:name "scheduledOnOrAfter", :shape "Timestamp", :location "querystring", :location-name "scheduledOnOrAfter"})) (clojure.core/contains? input :scheduled-before) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :scheduled-before)) #:http.request.field{:name "scheduledBefore", :shape "Timestamp", :location "querystring", :location-name "scheduledBefore"}))))

(clojure.core/defn- req-delete-datastore-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-datastore-name (input :datastore-name)) #:http.request.field{:name "datastoreName", :shape "DatastoreName", :location "uri", :location-name "datastoreName"})]}))

(clojure.core/defn- req-delete-dataset-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dataset-content-version (input :version-id)) #:http.request.field{:name "versionId", :shape "DatasetContentVersion", :location "querystring", :location-name "versionId"}))))

(clojure.core/defn- req-create-datastore-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-datastore-name (input :datastore-name)) #:http.request.field{:name "datastoreName", :shape "DatastoreName"})]} (clojure.core/contains? input :retention-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retention-period (input :retention-period)) #:http.request.field{:name "retentionPeriod", :shape "RetentionPeriod"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-create-dataset-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "datasetName", :shape "DatasetName", :location "uri", :location-name "datasetName"})]}))

(clojure.core/defn- req-run-pipeline-activity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-activity (input :pipeline-activity)) #:http.request.field{:name "pipelineActivity", :shape "PipelineActivity"}) (clojure.core/into (ser-message-payloads (input :payloads)) #:http.request.field{:name "payloads", :shape "MessagePayloads"})]}))

(clojure.core/defn- req-cancel-pipeline-reprocessing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName", :location "uri", :location-name "pipelineName"}) (clojure.core/into (ser-reprocessing-id (input :reprocessing-id)) #:http.request.field{:name "reprocessingId", :shape "ReprocessingId", :location "uri", :location-name "reprocessingId"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "ResourceArn", :location "querystring", :location-name "resourceArn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "TagKeyList", :location "querystring", :location-name "tagKeys"})]}))

(clojure.core/declare deser-dataset-content-delivery-destination)

(clojure.core/declare deser-activity-batch-size)

(clojure.core/declare deser-attribute-names)

(clojure.core/declare deser-dataset-content-version)

(clojure.core/declare deser-iot-events-destination-configuration)

(clojure.core/declare deser-dataset)

(clojure.core/declare deser-datastore-activity)

(clojure.core/declare deser-dataset-content-summaries)

(clojure.core/declare deser-math-activity)

(clojure.core/declare deser-entry-name)

(clojure.core/declare deser-message-id)

(clojure.core/declare deser-volume-size-in-gb)

(clojure.core/declare deser-datastore-statistics)

(clojure.core/declare deser-variables)

(clojure.core/declare deserresource-id)

(clojure.core/declare deser-dataset-content-summary)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-dataset-name)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-device-shadow-enrich-activity)

(clojure.core/declare deser-pipeline-name)

(clojure.core/declare deser-select-attributes-activity)

(clojure.core/declare deser-dataset-content-state)

(clojure.core/declare deser-output-file-name)

(clojure.core/declare deser-datastore-name)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-datastore-summary)

(clojure.core/declare deser-message-payload)

(clojure.core/declare deser-pipeline)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-size-in-bytes)

(clojure.core/declare deser-logging-options)

(clojure.core/declare deser-pipeline-activities)

(clojure.core/declare deser-message-payloads)

(clojure.core/declare deser-datastore-summaries)

(clojure.core/declare deser-dataset-arn)

(clojure.core/declare deser-dataset-content-delivery-rule)

(clojure.core/declare deser-dataset-entries)

(clojure.core/declare deser-reprocessing-status)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-channel-summary)

(clojure.core/declare deser-iot-events-input-name)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-logging-enabled)

(clojure.core/declare deser-channel-activity)

(clojure.core/declare deser-dataset-content-delivery-rules)

(clojure.core/declare deser-dataset-action-name)

(clojure.core/declare deser-triggering-dataset)

(clojure.core/declare deser-reprocessing-summary)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-datastore-arn)

(clojure.core/declare deser-query-filters)

(clojure.core/declare deser-filter-activity)

(clojure.core/declare deser-presigned-uri)

(clojure.core/declare deser-attribute-name-mapping)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-filter-expression)

(clojure.core/declare deser-lambda-name)

(clojure.core/declare deser-channel-name)

(clojure.core/declare deser-double-value)

(clojure.core/declare deser-pipeline-activity)

(clojure.core/declare deser-pipeline-summary)

(clojure.core/declare deser-sql-query-dataset-action)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-dataset-actions)

(clojure.core/declare deser-remove-attributes-activity)

(clojure.core/declare deser-variable-name)

(clojure.core/declare deser-datastore)

(clojure.core/declare deser-output-file-uri-value)

(clojure.core/declare deser-dataset-action)

(clojure.core/declare deser-time-expression)

(clojure.core/declare deser-dataset-content-version-value)

(clojure.core/declare deser-dataset-entry)

(clojure.core/declare deser-batch-put-message-error-entries)

(clojure.core/declare deser-offset-seconds)

(clojure.core/declare deser-dataset-status)

(clojure.core/declare deser-dataset-action-type)

(clojure.core/declare deser-reprocessing-summaries)

(clojure.core/declare deser-add-attributes-activity)

(clojure.core/declare deser-resource-configuration)

(clojure.core/declare deser-channel-arn)

(clojure.core/declare deser-dataset-triggers)

(clojure.core/declare deser-sql-query)

(clojure.core/declare deser-schedule-expression)

(clojure.core/declare deser-channel-status)

(clojure.core/declare deser-batch-put-message-error-entry)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-variable)

(clojure.core/declare deser-device-registry-enrich-activity)

(clojure.core/declare deser-channel)

(clojure.core/declare deser-estimated-resource-size)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-reason)

(clojure.core/declare deser-dataset-trigger)

(clojure.core/declare deser-compute-type)

(clojure.core/declare deser-lambda-activity)

(clojure.core/declare deserresource-arn)

(clojure.core/declare deser-datastore-status)

(clojure.core/declare deser-delta-time)

(clojure.core/declare deser-schedule)

(clojure.core/declare deser-unlimited-retention-period)

(clojure.core/declare deser-dataset-content-status)

(clojure.core/declare deser-image)

(clojure.core/declare deser-logging-level)

(clojure.core/declare deser-query-filter)

(clojure.core/declare deser-retention-period)

(clojure.core/declare deser-retention-period-in-days)

(clojure.core/declare deser-pipeline-summaries)

(clojure.core/declare deser-pipeline-arn)

(clojure.core/declare deser-container-dataset-action)

(clojure.core/declare deser-channel-summaries)

(clojure.core/declare deser-log-result)

(clojure.core/declare deser-dataset-summary)

(clojure.core/declare deser-string-value)

(clojure.core/declare deser-dataset-summaries)

(clojure.core/declare deser-dataset-action-summary)

(clojure.core/declare deser-math-expression)

(clojure.core/declare deser-activity-name)

(clojure.core/declare deser-reprocessing-id)

(clojure.core/declare deser-channel-statistics)

(clojure.core/declare deser-dataset-action-summaries)

(clojure.core/defn- deser-dataset-content-delivery-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "iotEventsDestinationConfiguration") (clojure.core/assoc :iot-events-destination-configuration (deser-iot-events-destination-configuration (input "iotEventsDestinationConfiguration")))))

(clojure.core/defn- deser-activity-batch-size [input] input)

(clojure.core/defn- deser-attribute-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-name coll))) input))

(clojure.core/defn- deser-dataset-content-version [input] input)

(clojure.core/defn- deser-iot-events-destination-configuration [input] (clojure.core/cond-> {:input-name (deser-iot-events-input-name (input "inputName")), :role-arn (deser-role-arn (input "roleArn"))}))

(clojure.core/defn- deser-dataset [input] (clojure.core/cond-> {} (clojure.core/contains? input "retentionPeriod") (clojure.core/assoc :retention-period (deser-retention-period (input "retentionPeriod"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-dataset-arn (input "arn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-dataset-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-dataset-status (input "status"))) (clojure.core/contains? input "triggers") (clojure.core/assoc :triggers (deser-dataset-triggers (input "triggers"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "lastUpdateTime") (clojure.core/assoc :last-update-time (deser-timestamp (input "lastUpdateTime"))) (clojure.core/contains? input "actions") (clojure.core/assoc :actions (deser-dataset-actions (input "actions"))) (clojure.core/contains? input "contentDeliveryRules") (clojure.core/assoc :content-delivery-rules (deser-dataset-content-delivery-rules (input "contentDeliveryRules")))))

(clojure.core/defn- deser-datastore-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :datastore-name (deser-datastore-name (input "datastoreName"))}))

(clojure.core/defn- deser-dataset-content-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dataset-content-summary coll))) input))

(clojure.core/defn- deser-math-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :attribute (deser-attribute-name (input "attribute")), :math (deser-math-expression (input "math"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deser-entry-name [input] input)

(clojure.core/defn- deser-message-id [input] input)

(clojure.core/defn- deser-volume-size-in-gb [input] input)

(clojure.core/defn- deser-datastore-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "size") (clojure.core/assoc :size (deser-estimated-resource-size (input "size")))))

(clojure.core/defn- deser-variables [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-variable coll))) input))

(clojure.core/defn- deserresource-id [input] input)

(clojure.core/defn- deser-dataset-content-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-dataset-content-version (input "version"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-dataset-content-status (input "status"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "scheduleTime") (clojure.core/assoc :schedule-time (deser-timestamp (input "scheduleTime")))))

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-dataset-name [input] input)

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-device-shadow-enrich-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :attribute (deser-attribute-name (input "attribute")), :thing-name (deser-attribute-name (input "thingName")), :role-arn (deser-role-arn (input "roleArn"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deser-pipeline-name [input] input)

(clojure.core/defn- deser-select-attributes-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :attributes (deser-attribute-names (input "attributes"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deser-dataset-content-state [input] (clojure.core/get {"CREATING" :creating, "SUCCEEDED" :succeeded, "FAILED" :failed} input))

(clojure.core/defn- deser-output-file-name [input] input)

(clojure.core/defn- deser-datastore-name [input] input)

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-datastore-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "datastoreName") (clojure.core/assoc :datastore-name (deser-datastore-name (input "datastoreName"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-datastore-status (input "status"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "lastUpdateTime") (clojure.core/assoc :last-update-time (deser-timestamp (input "lastUpdateTime")))))

(clojure.core/defn- deser-message-payload [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-pipeline [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-pipeline-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-pipeline-arn (input "arn"))) (clojure.core/contains? input "activities") (clojure.core/assoc :activities (deser-pipeline-activities (input "activities"))) (clojure.core/contains? input "reprocessingSummaries") (clojure.core/assoc :reprocessing-summaries (deser-reprocessing-summaries (input "reprocessingSummaries"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "lastUpdateTime") (clojure.core/assoc :last-update-time (deser-timestamp (input "lastUpdateTime")))))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-size-in-bytes [input] input)

(clojure.core/defn- deser-logging-options [input] (clojure.core/cond-> {:role-arn (deser-role-arn (input "roleArn")), :level (deser-logging-level (input "level")), :enabled (deser-logging-enabled (input "enabled"))}))

(clojure.core/defn- deser-pipeline-activities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pipeline-activity coll))) input))

(clojure.core/defn- deser-message-payloads [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-message-payload coll))) input))

(clojure.core/defn- deser-datastore-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-datastore-summary coll))) input))

(clojure.core/defn- deser-dataset-arn [input] input)

(clojure.core/defn- deser-dataset-content-delivery-rule [input] (clojure.core/cond-> {:destination (deser-dataset-content-delivery-destination (input "destination"))} (clojure.core/contains? input "entryName") (clojure.core/assoc :entry-name (deser-entry-name (input "entryName")))))

(clojure.core/defn- deser-dataset-entries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dataset-entry coll))) input))

(clojure.core/defn- deser-reprocessing-status [input] (clojure.core/get {"RUNNING" :running, "SUCCEEDED" :succeeded, "CANCELLED" :cancelled, "FAILED" :failed} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-channel-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "channelName") (clojure.core/assoc :channel-name (deser-channel-name (input "channelName"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-channel-status (input "status"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "lastUpdateTime") (clojure.core/assoc :last-update-time (deser-timestamp (input "lastUpdateTime")))))

(clojure.core/defn- deser-iot-events-input-name [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-logging-enabled [input] input)

(clojure.core/defn- deser-channel-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :channel-name (deser-channel-name (input "channelName"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deser-dataset-content-delivery-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dataset-content-delivery-rule coll))) input))

(clojure.core/defn- deser-dataset-action-name [input] input)

(clojure.core/defn- deser-triggering-dataset [input] (clojure.core/cond-> {:name (deser-dataset-name (input "name"))}))

(clojure.core/defn- deser-reprocessing-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-reprocessing-id (input "id"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-reprocessing-status (input "status"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime")))))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-datastore-arn [input] input)

(clojure.core/defn- deser-query-filters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-filter coll))) input))

(clojure.core/defn- deser-filter-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :filter (deser-filter-expression (input "filter"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deser-presigned-uri [input] input)

(clojure.core/defn- deser-attribute-name-mapping [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-name v)])) input))

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-filter-expression [input] input)

(clojure.core/defn- deser-lambda-name [input] input)

(clojure.core/defn- deser-channel-name [input] input)

(clojure.core/defn- deser-double-value [input] input)

(clojure.core/defn- deser-pipeline-activity [input] (clojure.core/cond-> {} (clojure.core/contains? input "deviceShadowEnrich") (clojure.core/assoc :device-shadow-enrich (deser-device-shadow-enrich-activity (input "deviceShadowEnrich"))) (clojure.core/contains? input "deviceRegistryEnrich") (clojure.core/assoc :device-registry-enrich (deser-device-registry-enrich-activity (input "deviceRegistryEnrich"))) (clojure.core/contains? input "selectAttributes") (clojure.core/assoc :select-attributes (deser-select-attributes-activity (input "selectAttributes"))) (clojure.core/contains? input "math") (clojure.core/assoc :math (deser-math-activity (input "math"))) (clojure.core/contains? input "addAttributes") (clojure.core/assoc :add-attributes (deser-add-attributes-activity (input "addAttributes"))) (clojure.core/contains? input "filter") (clojure.core/assoc :filter (deser-filter-activity (input "filter"))) (clojure.core/contains? input "removeAttributes") (clojure.core/assoc :remove-attributes (deser-remove-attributes-activity (input "removeAttributes"))) (clojure.core/contains? input "channel") (clojure.core/assoc :channel (deser-channel-activity (input "channel"))) (clojure.core/contains? input "datastore") (clojure.core/assoc :datastore (deser-datastore-activity (input "datastore"))) (clojure.core/contains? input "lambda") (clojure.core/assoc :lambda (deser-lambda-activity (input "lambda")))))

(clojure.core/defn- deser-pipeline-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "pipelineName") (clojure.core/assoc :pipeline-name (deser-pipeline-name (input "pipelineName"))) (clojure.core/contains? input "reprocessingSummaries") (clojure.core/assoc :reprocessing-summaries (deser-reprocessing-summaries (input "reprocessingSummaries"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "lastUpdateTime") (clojure.core/assoc :last-update-time (deser-timestamp (input "lastUpdateTime")))))

(clojure.core/defn- deser-sql-query-dataset-action [input] (clojure.core/cond-> {:sql-query (deser-sql-query (input "sqlQuery"))} (clojure.core/contains? input "filters") (clojure.core/assoc :filters (deser-query-filters (input "filters")))))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-dataset-actions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dataset-action coll))) input))

(clojure.core/defn- deser-remove-attributes-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :attributes (deser-attribute-names (input "attributes"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deser-variable-name [input] input)

(clojure.core/defn- deser-datastore [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-datastore-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-datastore-arn (input "arn"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-datastore-status (input "status"))) (clojure.core/contains? input "retentionPeriod") (clojure.core/assoc :retention-period (deser-retention-period (input "retentionPeriod"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "lastUpdateTime") (clojure.core/assoc :last-update-time (deser-timestamp (input "lastUpdateTime")))))

(clojure.core/defn- deser-output-file-uri-value [input] (clojure.core/cond-> {:file-name (deser-output-file-name (input "fileName"))}))

(clojure.core/defn- deser-dataset-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "actionName") (clojure.core/assoc :action-name (deser-dataset-action-name (input "actionName"))) (clojure.core/contains? input "queryAction") (clojure.core/assoc :query-action (deser-sql-query-dataset-action (input "queryAction"))) (clojure.core/contains? input "containerAction") (clojure.core/assoc :container-action (deser-container-dataset-action (input "containerAction")))))

(clojure.core/defn- deser-time-expression [input] input)

(clojure.core/defn- deser-dataset-content-version-value [input] (clojure.core/cond-> {:dataset-name (deser-dataset-name (input "datasetName"))}))

(clojure.core/defn- deser-dataset-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "entryName") (clojure.core/assoc :entry-name (deser-entry-name (input "entryName"))) (clojure.core/contains? input "dataURI") (clojure.core/assoc :data-uri (deser-presigned-uri (input "dataURI")))))

(clojure.core/defn- deser-batch-put-message-error-entries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-put-message-error-entry coll))) input))

(clojure.core/defn- deser-offset-seconds [input] input)

(clojure.core/defn- deser-dataset-status [input] (clojure.core/get {"CREATING" :creating, "ACTIVE" :active, "DELETING" :deleting} input))

(clojure.core/defn- deser-dataset-action-type [input] (clojure.core/get {"QUERY" :query, "CONTAINER" :container} input))

(clojure.core/defn- deser-reprocessing-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reprocessing-summary coll))) input))

(clojure.core/defn- deser-add-attributes-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :attributes (deser-attribute-name-mapping (input "attributes"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deser-resource-configuration [input] (clojure.core/cond-> {:compute-type (deser-compute-type (input "computeType")), :volume-size-in-gb (deser-volume-size-in-gb (input "volumeSizeInGB"))}))

(clojure.core/defn- deser-channel-arn [input] input)

(clojure.core/defn- deser-dataset-triggers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dataset-trigger coll))) input))

(clojure.core/defn- deser-sql-query [input] input)

(clojure.core/defn- deser-schedule-expression [input] input)

(clojure.core/defn- deser-channel-status [input] (clojure.core/get {"CREATING" :creating, "ACTIVE" :active, "DELETING" :deleting} input))

(clojure.core/defn- deser-batch-put-message-error-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "messageId") (clojure.core/assoc :message-id (deser-message-id (input "messageId"))) (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-error-code (input "errorCode"))) (clojure.core/contains? input "errorMessage") (clojure.core/assoc :error-message (deser-error-message (input "errorMessage")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-variable [input] (clojure.core/cond-> {:name (deser-variable-name (input "name"))} (clojure.core/contains? input "stringValue") (clojure.core/assoc :string-value (deser-string-value (input "stringValue"))) (clojure.core/contains? input "doubleValue") (clojure.core/assoc :double-value (deser-double-value (input "doubleValue"))) (clojure.core/contains? input "datasetContentVersionValue") (clojure.core/assoc :dataset-content-version-value (deser-dataset-content-version-value (input "datasetContentVersionValue"))) (clojure.core/contains? input "outputFileUriValue") (clojure.core/assoc :output-file-uri-value (deser-output-file-uri-value (input "outputFileUriValue")))))

(clojure.core/defn- deser-device-registry-enrich-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :attribute (deser-attribute-name (input "attribute")), :thing-name (deser-attribute-name (input "thingName")), :role-arn (deser-role-arn (input "roleArn"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deser-channel [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-channel-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-channel-arn (input "arn"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-channel-status (input "status"))) (clojure.core/contains? input "retentionPeriod") (clojure.core/assoc :retention-period (deser-retention-period (input "retentionPeriod"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "lastUpdateTime") (clojure.core/assoc :last-update-time (deser-timestamp (input "lastUpdateTime")))))

(clojure.core/defn- deser-estimated-resource-size [input] (clojure.core/cond-> {} (clojure.core/contains? input "estimatedSizeInBytes") (clojure.core/assoc :estimated-size-in-bytes (deser-size-in-bytes (input "estimatedSizeInBytes"))) (clojure.core/contains? input "estimatedOn") (clojure.core/assoc :estimated-on (deser-timestamp (input "estimatedOn")))))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "key")), :value (deser-tag-value (input "value"))}))

(clojure.core/defn- deser-reason [input] input)

(clojure.core/defn- deser-dataset-trigger [input] (clojure.core/cond-> {} (clojure.core/contains? input "schedule") (clojure.core/assoc :schedule (deser-schedule (input "schedule"))) (clojure.core/contains? input "dataset") (clojure.core/assoc :dataset (deser-triggering-dataset (input "dataset")))))

(clojure.core/defn- deser-compute-type [input] (clojure.core/get {"ACU_1" :acu-1, "ACU_2" :acu-2} input))

(clojure.core/defn- deser-lambda-activity [input] (clojure.core/cond-> {:name (deser-activity-name (input "name")), :lambda-name (deser-lambda-name (input "lambdaName")), :batch-size (deser-activity-batch-size (input "batchSize"))} (clojure.core/contains? input "next") (clojure.core/assoc :next (deser-activity-name (input "next")))))

(clojure.core/defn- deserresource-arn [input] input)

(clojure.core/defn- deser-datastore-status [input] (clojure.core/get {"CREATING" :creating, "ACTIVE" :active, "DELETING" :deleting} input))

(clojure.core/defn- deser-delta-time [input] (clojure.core/cond-> {:offset-seconds (deser-offset-seconds (input "offsetSeconds")), :time-expression (deser-time-expression (input "timeExpression"))}))

(clojure.core/defn- deser-schedule [input] (clojure.core/cond-> {} (clojure.core/contains? input "expression") (clojure.core/assoc :expression (deser-schedule-expression (input "expression")))))

(clojure.core/defn- deser-unlimited-retention-period [input] input)

(clojure.core/defn- deser-dataset-content-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-dataset-content-state (input "state"))) (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-reason (input "reason")))))

(clojure.core/defn- deser-image [input] input)

(clojure.core/defn- deser-logging-level [input] (clojure.core/get {"ERROR" :error} input))

(clojure.core/defn- deser-query-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "deltaTime") (clojure.core/assoc :delta-time (deser-delta-time (input "deltaTime")))))

(clojure.core/defn- deser-retention-period [input] (clojure.core/cond-> {} (clojure.core/contains? input "unlimited") (clojure.core/assoc :unlimited (deser-unlimited-retention-period (input "unlimited"))) (clojure.core/contains? input "numberOfDays") (clojure.core/assoc :number-of-days (deser-retention-period-in-days (input "numberOfDays")))))

(clojure.core/defn- deser-retention-period-in-days [input] input)

(clojure.core/defn- deser-pipeline-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pipeline-summary coll))) input))

(clojure.core/defn- deser-pipeline-arn [input] input)

(clojure.core/defn- deser-container-dataset-action [input] (clojure.core/cond-> {:image (deser-image (input "image")), :execution-role-arn (deser-role-arn (input "executionRoleArn")), :resource-configuration (deser-resource-configuration (input "resourceConfiguration"))} (clojure.core/contains? input "variables") (clojure.core/assoc :variables (deser-variables (input "variables")))))

(clojure.core/defn- deser-channel-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-channel-summary coll))) input))

(clojure.core/defn- deser-log-result [input] input)

(clojure.core/defn- deser-dataset-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "datasetName") (clojure.core/assoc :dataset-name (deser-dataset-name (input "datasetName"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-dataset-status (input "status"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "lastUpdateTime") (clojure.core/assoc :last-update-time (deser-timestamp (input "lastUpdateTime"))) (clojure.core/contains? input "triggers") (clojure.core/assoc :triggers (deser-dataset-triggers (input "triggers"))) (clojure.core/contains? input "actions") (clojure.core/assoc :actions (deser-dataset-action-summaries (input "actions")))))

(clojure.core/defn- deser-string-value [input] input)

(clojure.core/defn- deser-dataset-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dataset-summary coll))) input))

(clojure.core/defn- deser-dataset-action-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "actionName") (clojure.core/assoc :action-name (deser-dataset-action-name (input "actionName"))) (clojure.core/contains? input "actionType") (clojure.core/assoc :action-type (deser-dataset-action-type (input "actionType")))))

(clojure.core/defn- deser-math-expression [input] input)

(clojure.core/defn- deser-activity-name [input] input)

(clojure.core/defn- deser-reprocessing-id [input] input)

(clojure.core/defn- deser-channel-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "size") (clojure.core/assoc :size (deser-estimated-resource-size (input "size")))))

(clojure.core/defn- deser-dataset-action-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dataset-action-summary coll))) input))

(clojure.core/defn- response-cancel-pipeline-reprocessing-response ([input] (response-cancel-pipeline-reprocessing-response nil input)) ([resultWrapper250806 input] (clojure.core/let [rawinput250805 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250807 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-pipeline-response ([input] (response-create-pipeline-response nil input)) ([resultWrapper250809 input] (clojure.core/let [rawinput250808 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250810 {"pipelineName" (rawinput250808 "pipelineName"), "pipelineArn" (rawinput250808 "pipelineArn")}] (clojure.core/cond-> {} (letvar250810 "pipelineName") (clojure.core/assoc :pipeline-name (deser-pipeline-name (clojure.core/get-in letvar250810 ["pipelineName"]))) (letvar250810 "pipelineArn") (clojure.core/assoc :pipeline-arn (deser-pipeline-arn (clojure.core/get-in letvar250810 ["pipelineArn"])))))))

(clojure.core/defn- response-create-datastore-response ([input] (response-create-datastore-response nil input)) ([resultWrapper250812 input] (clojure.core/let [rawinput250811 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250813 {"datastoreName" (rawinput250811 "datastoreName"), "datastoreArn" (rawinput250811 "datastoreArn"), "retentionPeriod" (rawinput250811 "retentionPeriod")}] (clojure.core/cond-> {} (letvar250813 "datastoreName") (clojure.core/assoc :datastore-name (deser-datastore-name (clojure.core/get-in letvar250813 ["datastoreName"]))) (letvar250813 "datastoreArn") (clojure.core/assoc :datastore-arn (deser-datastore-arn (clojure.core/get-in letvar250813 ["datastoreArn"]))) (letvar250813 "retentionPeriod") (clojure.core/assoc :retention-period (deser-retention-period (clojure.core/get-in letvar250813 ["retentionPeriod"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper250815 input] (clojure.core/let [rawinput250814 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250816 {"message" (rawinput250814 "message")}] (clojure.core/cond-> {} (letvar250816 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar250816 ["message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper250818 input] (clojure.core/let [rawinput250817 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250819 {"tags" (rawinput250817 "tags")}] (clojure.core/cond-> {} (letvar250819 "tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar250819 ["tags"])))))))

(clojure.core/defn- response-start-pipeline-reprocessing-response ([input] (response-start-pipeline-reprocessing-response nil input)) ([resultWrapper250821 input] (clojure.core/let [rawinput250820 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250822 {"reprocessingId" (rawinput250820 "reprocessingId")}] (clojure.core/cond-> {} (letvar250822 "reprocessingId") (clojure.core/assoc :reprocessing-id (deser-reprocessing-id (clojure.core/get-in letvar250822 ["reprocessingId"])))))))

(clojure.core/defn- response-run-pipeline-activity-response ([input] (response-run-pipeline-activity-response nil input)) ([resultWrapper250824 input] (clojure.core/let [rawinput250823 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250825 {"payloads" (rawinput250823 "payloads"), "logResult" (rawinput250823 "logResult")}] (clojure.core/cond-> {} (letvar250825 "payloads") (clojure.core/assoc :payloads (deser-message-payloads (clojure.core/get-in letvar250825 ["payloads"]))) (letvar250825 "logResult") (clojure.core/assoc :log-result (deser-log-result (clojure.core/get-in letvar250825 ["logResult"])))))))

(clojure.core/defn- response-list-datastores-response ([input] (response-list-datastores-response nil input)) ([resultWrapper250827 input] (clojure.core/let [rawinput250826 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250828 {"datastoreSummaries" (rawinput250826 "datastoreSummaries"), "nextToken" (rawinput250826 "nextToken")}] (clojure.core/cond-> {} (letvar250828 "datastoreSummaries") (clojure.core/assoc :datastore-summaries (deser-datastore-summaries (clojure.core/get-in letvar250828 ["datastoreSummaries"]))) (letvar250828 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar250828 ["nextToken"])))))))

(clojure.core/defn- response-create-dataset-content-response ([input] (response-create-dataset-content-response nil input)) ([resultWrapper250830 input] (clojure.core/let [rawinput250829 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250831 {"versionId" (rawinput250829 "versionId")}] (clojure.core/cond-> {} (letvar250831 "versionId") (clojure.core/assoc :version-id (deser-dataset-content-version (clojure.core/get-in letvar250831 ["versionId"])))))))

(clojure.core/defn- response-create-channel-response ([input] (response-create-channel-response nil input)) ([resultWrapper250833 input] (clojure.core/let [rawinput250832 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250834 {"channelName" (rawinput250832 "channelName"), "channelArn" (rawinput250832 "channelArn"), "retentionPeriod" (rawinput250832 "retentionPeriod")}] (clojure.core/cond-> {} (letvar250834 "channelName") (clojure.core/assoc :channel-name (deser-channel-name (clojure.core/get-in letvar250834 ["channelName"]))) (letvar250834 "channelArn") (clojure.core/assoc :channel-arn (deser-channel-arn (clojure.core/get-in letvar250834 ["channelArn"]))) (letvar250834 "retentionPeriod") (clojure.core/assoc :retention-period (deser-retention-period (clojure.core/get-in letvar250834 ["retentionPeriod"])))))))

(clojure.core/defn- response-describe-datastore-response ([input] (response-describe-datastore-response nil input)) ([resultWrapper250836 input] (clojure.core/let [rawinput250835 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250837 {"datastore" (rawinput250835 "datastore"), "statistics" (rawinput250835 "statistics")}] (clojure.core/cond-> {} (letvar250837 "datastore") (clojure.core/assoc :datastore (deser-datastore (clojure.core/get-in letvar250837 ["datastore"]))) (letvar250837 "statistics") (clojure.core/assoc :statistics (deser-datastore-statistics (clojure.core/get-in letvar250837 ["statistics"])))))))

(clojure.core/defn- response-describe-channel-response ([input] (response-describe-channel-response nil input)) ([resultWrapper250839 input] (clojure.core/let [rawinput250838 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250840 {"channel" (rawinput250838 "channel"), "statistics" (rawinput250838 "statistics")}] (clojure.core/cond-> {} (letvar250840 "channel") (clojure.core/assoc :channel (deser-channel (clojure.core/get-in letvar250840 ["channel"]))) (letvar250840 "statistics") (clojure.core/assoc :statistics (deser-channel-statistics (clojure.core/get-in letvar250840 ["statistics"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper250842 input] (clojure.core/let [rawinput250841 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250843 {"message" (rawinput250841 "message")}] (clojure.core/cond-> {} (letvar250843 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar250843 ["message"])))))))

(clojure.core/defn- response-list-dataset-contents-response ([input] (response-list-dataset-contents-response nil input)) ([resultWrapper250845 input] (clojure.core/let [rawinput250844 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250846 {"datasetContentSummaries" (rawinput250844 "datasetContentSummaries"), "nextToken" (rawinput250844 "nextToken")}] (clojure.core/cond-> {} (letvar250846 "datasetContentSummaries") (clojure.core/assoc :dataset-content-summaries (deser-dataset-content-summaries (clojure.core/get-in letvar250846 ["datasetContentSummaries"]))) (letvar250846 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar250846 ["nextToken"])))))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper250848 input] (clojure.core/let [rawinput250847 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250849 {"message" (rawinput250847 "message"), "resourceId" (rawinput250847 "resourceId"), "resourceArn" (rawinput250847 "resourceArn")}] (clojure.core/cond-> {} (letvar250849 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar250849 ["message"]))) (letvar250849 "resourceId") (clojure.core/assoc :resource-id (deserresource-id (clojure.core/get-in letvar250849 ["resourceId"]))) (letvar250849 "resourceArn") (clojure.core/assoc :resource-arn (deserresource-arn (clojure.core/get-in letvar250849 ["resourceArn"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper250851 input] (clojure.core/let [rawinput250850 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250852 {"message" (rawinput250850 "message")}] (clojure.core/cond-> {} (letvar250852 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar250852 ["message"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper250854 input] (clojure.core/let [rawinput250853 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250855 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-dataset-response ([input] (response-create-dataset-response nil input)) ([resultWrapper250857 input] (clojure.core/let [rawinput250856 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250858 {"datasetName" (rawinput250856 "datasetName"), "datasetArn" (rawinput250856 "datasetArn"), "retentionPeriod" (rawinput250856 "retentionPeriod")}] (clojure.core/cond-> {} (letvar250858 "datasetName") (clojure.core/assoc :dataset-name (deser-dataset-name (clojure.core/get-in letvar250858 ["datasetName"]))) (letvar250858 "datasetArn") (clojure.core/assoc :dataset-arn (deser-dataset-arn (clojure.core/get-in letvar250858 ["datasetArn"]))) (letvar250858 "retentionPeriod") (clojure.core/assoc :retention-period (deser-retention-period (clojure.core/get-in letvar250858 ["retentionPeriod"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper250860 input] (clojure.core/let [rawinput250859 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250861 {"message" (rawinput250859 "message")}] (clojure.core/cond-> {} (letvar250861 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar250861 ["message"])))))))

(clojure.core/defn- response-list-channels-response ([input] (response-list-channels-response nil input)) ([resultWrapper250863 input] (clojure.core/let [rawinput250862 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250864 {"channelSummaries" (rawinput250862 "channelSummaries"), "nextToken" (rawinput250862 "nextToken")}] (clojure.core/cond-> {} (letvar250864 "channelSummaries") (clojure.core/assoc :channel-summaries (deser-channel-summaries (clojure.core/get-in letvar250864 ["channelSummaries"]))) (letvar250864 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar250864 ["nextToken"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper250866 input] (clojure.core/let [rawinput250865 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250867 {"message" (rawinput250865 "message")}] (clojure.core/cond-> {} (letvar250867 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar250867 ["message"])))))))

(clojure.core/defn- response-describe-dataset-response ([input] (response-describe-dataset-response nil input)) ([resultWrapper250869 input] (clojure.core/let [rawinput250868 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250870 {"dataset" (rawinput250868 "dataset")}] (clojure.core/cond-> {} (letvar250870 "dataset") (clojure.core/assoc :dataset (deser-dataset (clojure.core/get-in letvar250870 ["dataset"])))))))

(clojure.core/defn- response-describe-logging-options-response ([input] (response-describe-logging-options-response nil input)) ([resultWrapper250872 input] (clojure.core/let [rawinput250871 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250873 {"loggingOptions" (rawinput250871 "loggingOptions")}] (clojure.core/cond-> {} (letvar250873 "loggingOptions") (clojure.core/assoc :logging-options (deser-logging-options (clojure.core/get-in letvar250873 ["loggingOptions"])))))))

(clojure.core/defn- response-describe-pipeline-response ([input] (response-describe-pipeline-response nil input)) ([resultWrapper250875 input] (clojure.core/let [rawinput250874 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250876 {"pipeline" (rawinput250874 "pipeline")}] (clojure.core/cond-> {} (letvar250876 "pipeline") (clojure.core/assoc :pipeline (deser-pipeline (clojure.core/get-in letvar250876 ["pipeline"])))))))

(clojure.core/defn- response-list-pipelines-response ([input] (response-list-pipelines-response nil input)) ([resultWrapper250878 input] (clojure.core/let [rawinput250877 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250879 {"pipelineSummaries" (rawinput250877 "pipelineSummaries"), "nextToken" (rawinput250877 "nextToken")}] (clojure.core/cond-> {} (letvar250879 "pipelineSummaries") (clojure.core/assoc :pipeline-summaries (deser-pipeline-summaries (clojure.core/get-in letvar250879 ["pipelineSummaries"]))) (letvar250879 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar250879 ["nextToken"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper250881 input] (clojure.core/let [rawinput250880 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250882 {"message" (rawinput250880 "message")}] (clojure.core/cond-> {} (letvar250882 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar250882 ["message"])))))))

(clojure.core/defn- response-get-dataset-content-response ([input] (response-get-dataset-content-response nil input)) ([resultWrapper250884 input] (clojure.core/let [rawinput250883 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250885 {"entries" (rawinput250883 "entries"), "timestamp" (rawinput250883 "timestamp"), "status" (rawinput250883 "status")}] (clojure.core/cond-> {} (letvar250885 "entries") (clojure.core/assoc :entries (deser-dataset-entries (clojure.core/get-in letvar250885 ["entries"]))) (letvar250885 "timestamp") (clojure.core/assoc :timestamp (deser-timestamp (clojure.core/get-in letvar250885 ["timestamp"]))) (letvar250885 "status") (clojure.core/assoc :status (deser-dataset-content-status (clojure.core/get-in letvar250885 ["status"])))))))

(clojure.core/defn- response-sample-channel-data-response ([input] (response-sample-channel-data-response nil input)) ([resultWrapper250887 input] (clojure.core/let [rawinput250886 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250888 {"payloads" (rawinput250886 "payloads")}] (clojure.core/cond-> {} (letvar250888 "payloads") (clojure.core/assoc :payloads (deser-message-payloads (clojure.core/get-in letvar250888 ["payloads"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper250890 input] (clojure.core/let [rawinput250889 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250891 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-datasets-response ([input] (response-list-datasets-response nil input)) ([resultWrapper250893 input] (clojure.core/let [rawinput250892 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250894 {"datasetSummaries" (rawinput250892 "datasetSummaries"), "nextToken" (rawinput250892 "nextToken")}] (clojure.core/cond-> {} (letvar250894 "datasetSummaries") (clojure.core/assoc :dataset-summaries (deser-dataset-summaries (clojure.core/get-in letvar250894 ["datasetSummaries"]))) (letvar250894 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar250894 ["nextToken"])))))))

(clojure.core/defn- response-batch-put-message-response ([input] (response-batch-put-message-response nil input)) ([resultWrapper250896 input] (clojure.core/let [rawinput250895 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar250897 {"batchPutMessageErrorEntries" (rawinput250895 "batchPutMessageErrorEntries")}] (clojure.core/cond-> {} (letvar250897 "batchPutMessageErrorEntries") (clojure.core/assoc :batch-put-message-error-entries (deser-batch-put-message-error-entries (clojure.core/get-in letvar250897 ["batchPutMessageErrorEntries"])))))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/messages (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/message))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-delivery-destination/iot-events-destination-configuration (clojure.spec.alpha/and :portkey.aws.iotanalytics/iot-events-destination-configuration))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-delivery-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-content-delivery-destination/iot-events-destination-configuration]))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 7 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-response/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-response/pipeline-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-pipeline-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-pipeline-response/pipeline-name :portkey.aws.iotanalytics.create-pipeline-response/pipeline-arn]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.iot-events-destination-configuration/input-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/iot-events-input-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.iot-events-destination-configuration/role-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/iot-events-destination-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.iot-events-destination-configuration/input-name :portkey.aws.iotanalytics.iot-events-destination-configuration/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/datastore-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/datastore-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-datastore-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-datastore-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-datastore-response/datastore-name :portkey.aws.iotanalytics.create-datastore-response/datastore-arn :portkey.aws.iotanalytics.create-datastore-response/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/end-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/triggers (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-triggers))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/actions (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-actions))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset/content-delivery-rules (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-delivery-rules))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset/retention-period :portkey.aws.iotanalytics.dataset/arn :portkey.aws.iotanalytics.dataset/name :portkey.aws.iotanalytics.dataset/status :portkey.aws.iotanalytics.dataset/triggers :portkey.aws.iotanalytics.dataset/creation-time :portkey.aws.iotanalytics.dataset/last-update-time :portkey.aws.iotanalytics.dataset/actions :portkey.aws.iotanalytics.dataset/content-delivery-rules]))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/message-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128))))

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
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/content-delivery-rules (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-delivery-rules))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-dataset-request/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.create-dataset-request/dataset-name :portkey.aws.iotanalytics.create-dataset-request/actions] :opt-un [:portkey.aws.iotanalytics.create-dataset-request/triggers :portkey.aws.iotanalytics.create-dataset-request/content-delivery-rules :portkey.aws.iotanalytics.create-dataset-request/retention-period :portkey.aws.iotanalytics.create-dataset-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-request/pipeline-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-request/pipeline-activities (clojure.spec.alpha/and :portkey.aws.iotanalytics/pipeline-activities))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-pipeline-request/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.create-pipeline-request/pipeline-name :portkey.aws.iotanalytics.create-pipeline-request/pipeline-activities] :opt-un [:portkey.aws.iotanalytics.create-pipeline-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-summary/version (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-version))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-summary/schedule-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-content-summary/version :portkey.aws.iotanalytics.dataset-content-summary/status :portkey.aws.iotanalytics.dataset-content-summary/creation-time :portkey.aws.iotanalytics.dataset-content-summary/schedule-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-response/datastore-summaries (clojure.spec.alpha/and :portkey.aws.iotanalytics/datastore-summaries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-datastores-response/next-token (clojure.spec.alpha/and :portkey.aws.iotanalytics/next-token))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-datastores-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.list-datastores-response/datastore-summaries :portkey.aws.iotanalytics.list-datastores-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/pipeline-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/output-file-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[\w\.-]{1,255}" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/channel-arn (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-arn))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-response/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.create-channel-response/channel-name :portkey.aws.iotanalytics.create-channel-response/channel-arn :portkey.aws.iotanalytics.create-channel-response/retention-period]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/datastore-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 20 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2048))))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-delivery-rule/entry-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/entry-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-content-delivery-rule/destination (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-delivery-destination))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-delivery-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.dataset-content-delivery-rule/destination] :opt-un [:portkey.aws.iotanalytics.dataset-content-delivery-rule/entry-name]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-entries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-entry))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-status #{:running :cancelled "SUCCEEDED" "FAILED" "CANCELLED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.iotanalytics/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/status (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-status))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/creation-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.channel-summary/channel-name :portkey.aws.iotanalytics.channel-summary/status :portkey.aws.iotanalytics.channel-summary/creation-time :portkey.aws.iotanalytics.channel-summary/last-update-time]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/iot-events-input-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z][a-zA-Z0-9_]*$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/describe-logging-options-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/logging-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/name (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-activity/next (clojure.spec.alpha/and :portkey.aws.iotanalytics/activity-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.channel-activity/name :portkey.aws.iotanalytics.channel-activity/channel-name] :opt-un [:portkey.aws.iotanalytics.channel-activity/next]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-content-delivery-rules (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-content-delivery-rule :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-request/channel-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/channel-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.create-channel-request/tags (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-list))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/create-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.create-channel-request/channel-name] :opt-un [:portkey.aws.iotanalytics.create-channel-request/retention-period :portkey.aws.iotanalytics.create-channel-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/filter-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/lambda-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_-]+$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iotanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/variable-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

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
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/content-delivery-rules (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-content-delivery-rules))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.update-dataset-request/retention-period (clojure.spec.alpha/and :portkey.aws.iotanalytics/retention-period))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/update-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.update-dataset-request/dataset-name :portkey.aws.iotanalytics.update-dataset-request/actions] :opt-un [:portkey.aws.iotanalytics.update-dataset-request/triggers :portkey.aws.iotanalytics.update-dataset-request/content-delivery-rules :portkey.aws.iotanalytics.update-dataset-request/retention-period]))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 20 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2048))))

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
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-dataset-contents-request/scheduled-on-or-after (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.list-dataset-contents-request/scheduled-before (clojure.spec.alpha/and :portkey.aws.iotanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/list-dataset-contents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iotanalytics.list-dataset-contents-request/dataset-name] :opt-un [:portkey.aws.iotanalytics.list-dataset-contents-request/next-token :portkey.aws.iotanalytics.list-dataset-contents-request/max-results :portkey.aws.iotanalytics.list-dataset-contents-request/scheduled-on-or-after :portkey.aws.iotanalytics.list-dataset-contents-request/scheduled-before]))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/image (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

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

(clojure.spec.alpha/def :portkey.aws.iotanalytics/string-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 0 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-summary))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action-summary/action-name (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-action-name))
(clojure.spec.alpha/def :portkey.aws.iotanalytics.dataset-action-summary/action-type (clojure.spec.alpha/and :portkey.aws.iotanalytics/dataset-action-type))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.dataset-action-summary/action-name :portkey.aws.iotanalytics.dataset-action-summary/action-type]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/math-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/activity-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/reprocessing-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.channel-statistics/size (clojure.spec.alpha/and :portkey.aws.iotanalytics/estimated-resource-size))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/channel-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.channel-statistics/size]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics.batch-put-message-response/batch-put-message-error-entries (clojure.spec.alpha/and :portkey.aws.iotanalytics/batch-put-message-error-entries))
(clojure.spec.alpha/def :portkey.aws.iotanalytics/batch-put-message-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iotanalytics.batch-put-message-response/batch-put-message-error-entries]))

(clojure.spec.alpha/def :portkey.aws.iotanalytics/dataset-action-summaries (clojure.spec.alpha/coll-of :portkey.aws.iotanalytics/dataset-action-summary :min-count 1 :max-count 1))

(clojure.core/defn tag-resource "Adds to or modifies the tags of the given resource. Tags are metadata which can\nbe used to manage a resource." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/tag-resource-response))

(clojure.core/defn create-pipeline "Creates a pipeline. A pipeline consumes messages from one or more channels and\nallows you to process the messages before storing them in a data store." ([create-pipeline-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-pipeline-request create-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePipeline", :http.request.configuration/output-deser-fn response-create-pipeline-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-pipeline-response))

(clojure.core/defn describe-dataset "Retrieves information about a data set." ([describe-dataset-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-dataset-request describe-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDataset", :http.request.configuration/output-deser-fn response-describe-dataset-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-dataset-response))

(clojure.core/defn list-pipelines "Retrieves a list of pipelines." ([] (list-pipelines {})) ([list-pipelines-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-pipelines-request list-pipelines-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-pipelines-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-pipelines-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPipelines", :http.request.configuration/output-deser-fn response-list-pipelines-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef list-pipelines :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-pipelines-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-pipelines-response))

(clojure.core/defn delete-channel "Deletes the specified channel." ([delete-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-channel-request delete-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{channelName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteChannel", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-channel-request) :ret clojure.core/true?)

(clojure.core/defn create-dataset-content "Creates the content of a data set by applying a \"queryAction\" (a SQL query) or a\n\"containerAction\" (executing a containerized application)." ([create-dataset-content-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-dataset-content-request create-dataset-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-dataset-content-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}/content", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-dataset-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDatasetContent", :http.request.configuration/output-deser-fn response-create-dataset-content-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef create-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-dataset-content-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-dataset-content-response))

(clojure.core/defn describe-datastore "Retrieves information about a data store." ([describe-datastore-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-datastore-request describe-datastore-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-datastore-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores/{datastoreName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-datastore-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDatastore", :http.request.configuration/output-deser-fn response-describe-datastore-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-datastore-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-datastore-response))

(clojure.core/defn update-datastore "Updates the settings of a data store." ([update-datastore-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-datastore-request update-datastore-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores/{datastoreName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/update-datastore-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDatastore", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef update-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-datastore-request) :ret clojure.core/true?)

(clojure.core/defn create-datastore "Creates a data store, which is a repository for messages." ([create-datastore-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-datastore-request create-datastore-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-datastore-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-datastore-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDatastore", :http.request.configuration/output-deser-fn response-create-datastore-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-datastore-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-datastore-response))

(clojure.core/defn create-dataset "Creates a data set. A data set stores data retrieved from a data store by\napplying a \"queryAction\" (a SQL query) or a \"containerAction\" (executing a\ncontainerized application). This operation creates the skeleton of a data set.\nThe data set can be populated manually by calling \"CreateDatasetContent\" or\nautomatically according to a \"trigger\" you specify." ([create-dataset-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-dataset-request create-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDataset", :http.request.configuration/output-deser-fn response-create-dataset-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-dataset-response))

(clojure.core/defn update-channel "Updates the settings of a channel." ([update-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-channel-request update-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{channelName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/update-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateChannel", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef update-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-channel-request) :ret clojure.core/true?)

(clojure.core/defn list-datasets "Retrieves information about data sets." ([] (list-datasets {})) ([list-datasets-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-datasets-request list-datasets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-datasets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-datasets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDatasets", :http.request.configuration/output-deser-fn response-list-datasets-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef list-datasets :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-datasets-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-datasets-response))

(clojure.core/defn put-logging-options "Sets or updates the AWS IoT Analytics logging options.\n Note that if you update the value of any loggingOptions field, it takes up to\none minute for the change to take effect. Also, if you change the policy\nattached to the role you specified in the roleArn field (for example, to correct\nan invalid policy) it takes up to 5 minutes for that change to take effect." ([put-logging-options-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-put-logging-options-request put-logging-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/logging", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/put-logging-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLoggingOptions", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef put-logging-options :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/put-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn sample-channel-data "Retrieves a sample of messages from the specified channel ingested during the\nspecified timeframe. Up to 10 messages can be retrieved." ([sample-channel-data-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-sample-channel-data-request sample-channel-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/sample-channel-data-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{channelName}/sample", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/sample-channel-data-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SampleChannelData", :http.request.configuration/output-deser-fn response-sample-channel-data-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef sample-channel-data :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/sample-channel-data-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/sample-channel-data-response))

(clojure.core/defn list-datastores "Retrieves a list of data stores." ([] (list-datastores {})) ([list-datastores-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-datastores-request list-datastores-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-datastores-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-datastores-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDatastores", :http.request.configuration/output-deser-fn response-list-datastores-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef list-datastores :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-datastores-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-datastores-response))

(clojure.core/defn list-tags-for-resource "Lists the tags (metadata) which you have assigned to the resource." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-tags-for-resource-response))

(clojure.core/defn list-dataset-contents "Lists information about data set contents that have been created." ([list-dataset-contents-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-dataset-contents-request list-dataset-contents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-dataset-contents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}/contents", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-dataset-contents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDatasetContents", :http.request.configuration/output-deser-fn response-list-dataset-contents-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-dataset-contents :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/list-dataset-contents-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-dataset-contents-response))

(clojure.core/defn delete-dataset-content "Deletes the content of the specified data set." ([delete-dataset-content-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-dataset-content-request delete-dataset-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}/content", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-dataset-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDatasetContent", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-dataset-content-request) :ret clojure.core/true?)

(clojure.core/defn get-dataset-content "Retrieves the contents of a data set as pre-signed URIs." ([get-dataset-content-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-dataset-content-request get-dataset-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/get-dataset-content-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}/content", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/get-dataset-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDatasetContent", :http.request.configuration/output-deser-fn response-get-dataset-content-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef get-dataset-content :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/get-dataset-content-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/get-dataset-content-response))

(clojure.core/defn update-dataset "Updates the settings of a data set." ([update-dataset-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-dataset-request update-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/update-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDataset", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef update-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-dataset-request) :ret clojure.core/true?)

(clojure.core/defn run-pipeline-activity "Simulates the results of running a pipeline activity on a message payload." ([run-pipeline-activity-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-run-pipeline-activity-request run-pipeline-activity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/run-pipeline-activity-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelineactivities/run", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/run-pipeline-activity-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RunPipelineActivity", :http.request.configuration/output-deser-fn response-run-pipeline-activity-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef run-pipeline-activity :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/run-pipeline-activity-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/run-pipeline-activity-response))

(clojure.core/defn start-pipeline-reprocessing "Starts the reprocessing of raw message data through the pipeline." ([start-pipeline-reprocessing-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-start-pipeline-reprocessing-request start-pipeline-reprocessing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/start-pipeline-reprocessing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}/reprocessing", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/start-pipeline-reprocessing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartPipelineReprocessing", :http.request.configuration/output-deser-fn response-start-pipeline-reprocessing-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef start-pipeline-reprocessing :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/start-pipeline-reprocessing-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/start-pipeline-reprocessing-response))

(clojure.core/defn describe-logging-options "Retrieves the current settings of the AWS IoT Analytics logging options." ([] (describe-logging-options {})) ([describe-logging-options-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-logging-options-request describe-logging-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-logging-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/logging", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-logging-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLoggingOptions", :http.request.configuration/output-deser-fn response-describe-logging-options-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-logging-options :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/describe-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-logging-options-response))

(clojure.core/defn describe-pipeline "Retrieves information about a pipeline." ([describe-pipeline-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-pipeline-request describe-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribePipeline", :http.request.configuration/output-deser-fn response-describe-pipeline-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-pipeline-response))

(clojure.core/defn create-channel "Creates a channel. A channel collects data from an MQTT topic and archives the\nraw, unprocessed messages before publishing the data to a pipeline." ([create-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-channel-request create-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/create-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/create-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateChannel", :http.request.configuration/output-deser-fn response-create-channel-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iotanalytics/resource-already-exists-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/create-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/create-channel-response))

(clojure.core/defn describe-channel "Retrieves information about a channel." ([describe-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-channel-request describe-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/describe-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{channelName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/describe-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeChannel", :http.request.configuration/output-deser-fn response-describe-channel-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-channel :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/describe-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/describe-channel-response))

(clojure.core/defn list-channels "Retrieves a list of channels." ([] (list-channels {})) ([list-channels-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-channels-request list-channels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/list-channels-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/list-channels-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListChannels", :http.request.configuration/output-deser-fn response-list-channels-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef list-channels :args (clojure.spec.alpha/? :portkey.aws.iotanalytics/list-channels-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/list-channels-response))

(clojure.core/defn delete-pipeline "Deletes the specified pipeline." ([delete-pipeline-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-pipeline-request delete-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePipeline", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-pipeline-request) :ret clojure.core/true?)

(clojure.core/defn delete-datastore "Deletes the specified data store." ([delete-datastore-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-datastore-request delete-datastore-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datastores/{datastoreName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-datastore-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDatastore", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-datastore :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-datastore-request) :ret clojure.core/true?)

(clojure.core/defn batch-put-message "Sends messages to a channel." ([batch-put-message-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-batch-put-message-request batch-put-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/batch-put-message-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/messages/batch", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/batch-put-message-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchPutMessage", :http.request.configuration/output-deser-fn response-batch-put-message-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef batch-put-message :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/batch-put-message-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/batch-put-message-response))

(clojure.core/defn untag-resource "Removes the given tags (metadata) from the resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/untag-resource-response))

(clojure.core/defn cancel-pipeline-reprocessing "Cancels the reprocessing of data through the pipeline." ([cancel-pipeline-reprocessing-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-cancel-pipeline-reprocessing-request cancel-pipeline-reprocessing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}/reprocessing/{reprocessingId}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelPipelineReprocessing", :http.request.configuration/output-deser-fn response-cancel-pipeline-reprocessing-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef cancel-pipeline-reprocessing :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-request) :ret (clojure.spec.alpha/and :portkey.aws.iotanalytics/cancel-pipeline-reprocessing-response))

(clojure.core/defn update-pipeline "Updates the settings of a pipeline." ([update-pipeline-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-pipeline-request update-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/pipelines/{pipelineName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/update-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePipeline", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception, "LimitExceededException" :portkey.aws.iotanalytics/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/update-pipeline-request) :ret clojure.core/true?)

(clojure.core/defn delete-dataset "Deletes the specified data set.\n You do not have to delete the content of the data set before you perform this\noperation." ([delete-dataset-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-dataset-request delete-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iotanalytics/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/datasets/{datasetName}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "IoTAnalytics", :http.request.spec/input-spec :portkey.aws.iotanalytics/delete-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDataset", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iotanalytics/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iotanalytics/resource-not-found-exception, "InternalFailureException" :portkey.aws.iotanalytics/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iotanalytics/service-unavailable-exception, "ThrottlingException" :portkey.aws.iotanalytics/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-dataset :args (clojure.spec.alpha/tuple :portkey.aws.iotanalytics/delete-dataset-request) :ret clojure.core/true?)
