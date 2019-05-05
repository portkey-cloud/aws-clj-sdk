(ns portkey.aws.kinesisanalyticsv2 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope
    {:service "kinesisanalytics", :region "eu-west-1"},
    :ssl-common-name "kinesisanalytics.eu-west-1.amazonaws.com",
    :endpoint "https://kinesisanalytics.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "kinesisanalytics", :region "us-east-2"},
    :ssl-common-name "kinesisanalytics.us-east-2.amazonaws.com",
    :endpoint "https://kinesisanalytics.us-east-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "kinesisanalytics", :region "eu-central-1"},
    :ssl-common-name "kinesisanalytics.eu-central-1.amazonaws.com",
    :endpoint "https://kinesisanalytics.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "kinesisanalytics", :region "us-west-2"},
    :ssl-common-name "kinesisanalytics.us-west-2.amazonaws.com",
    :endpoint "https://kinesisanalytics.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "kinesisanalytics", :region "us-east-1"},
    :ssl-common-name "kinesisanalytics.us-east-1.amazonaws.com",
    :endpoint "https://kinesisanalytics.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-log-stream-arn)

(clojure.core/declare ser-code-content)

(clojure.core/declare ser-in-app-stream-name)

(clojure.core/declare ser-cloud-watch-logging-option)

(clojure.core/declare ser-lambda-output)

(clojure.core/declare ser-kinesis-firehose-input-update)

(clojure.core/declare ser-application-version-id)

(clojure.core/declare ser-kinesis-streams-output-update)

(clojure.core/declare ser-sql-application-configuration-update)

(clojure.core/declare ser-property-map)

(clojure.core/declare ser-parallelism)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-input-update)

(clojure.core/declare ser-record-column-mapping)

(clojure.core/declare ser-application-code-configuration-update)

(clojure.core/declare ser-record-format)

(clojure.core/declare ser-log-level)

(clojure.core/declare ser-flink-application-configuration-update)

(clojure.core/declare ser-reference-data-sources)

(clojure.core/declare ser-cloud-watch-logging-option-update)

(clojure.core/declare ser-input-parallelism-update)

(clojure.core/declare ser-application-code-configuration)

(clojure.core/declare ser-run-configuration-update)

(clojure.core/declare ser-sql-run-configurations)

(clojure.core/declare ser-reference-data-source)

(clojure.core/declare ser-csv-mapping-parameters)

(clojure.core/declare ser-property-key)

(clojure.core/declare ser-s-3-content-location-update)

(clojure.core/declare ser-input-parallelism)

(clojure.core/declare ser-monitoring-configuration-update)

(clojure.core/declare ser-sql-application-configuration)

(clojure.core/declare ser-record-column-delimiter)

(clojure.core/declare ser-record-column-name)

(clojure.core/declare ser-record-row-path)

(clojure.core/declare ser-input-parallelism-count)

(clojure.core/declare ser-s-3-configuration)

(clojure.core/declare ser-s-3-reference-data-source)

(clojure.core/declare ser-destination-schema)

(clojure.core/declare ser-outputs)

(clojure.core/declare ser-environment-properties)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-json-mapping-parameters)

(clojure.core/declare ser-property-value)

(clojure.core/declare ser-parallelism-configuration-update)

(clojure.core/declare ser-cloud-watch-logging-options)

(clojure.core/declare ser-record-column)

(clojure.core/declare ser-input-lambda-processor-update)

(clojure.core/declare ser-min-pause-between-checkpoints)

(clojure.core/declare ser-input-starting-position-configuration)

(clojure.core/declare ser-run-configuration)

(clojure.core/declare ser-checkpoint-interval)

(clojure.core/declare ser-s-3-content-location)

(clojure.core/declare ser-record-encoding)

(clojure.core/declare ser-property-group)

(clojure.core/declare ser-reference-data-source-update)

(clojure.core/declare ser-inputs)

(clojure.core/declare ser-zip-file-content)

(clojure.core/declare ser-list-applications-input-limit)

(clojure.core/declare ser-kinesis-streams-input-update)

(clojure.core/declare ser-file-key)

(clojure.core/declare ser-input)

(clojure.core/declare ser-code-content-update)

(clojure.core/declare ser-application-snapshot-configuration-update)

(clojure.core/declare ser-application-restore-configuration)

(clojure.core/declare ser-application-name)

(clojure.core/declare ser-checkpoint-configuration-update)

(clojure.core/declare ser-record-column-sql-type)

(clojure.core/declare ser-cloud-watch-logging-option-updates)

(clojure.core/declare ser-kinesis-firehose-input)

(clojure.core/declare ser-runtime-environment)

(clojure.core/declare ser-s-3-reference-data-source-update)

(clojure.core/declare ser-output-update)

(clojure.core/declare ser-sql-run-configuration)

(clojure.core/declare ser-application-snapshot-configuration)

(clojure.core/declare ser-input-processing-configuration)

(clojure.core/declare ser-mapping-parameters)

(clojure.core/declare ser-application-restore-type)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-monitoring-configuration)

(clojure.core/declare ser-kinesis-firehose-output)

(clojure.core/declare ser-in-app-table-name)

(clojure.core/declare ser-record-columns)

(clojure.core/declare ser-input-lambda-processor)

(clojure.core/declare ser-input-schema-update)

(clojure.core/declare ser-checkpoint-configuration)

(clojure.core/declare ser-metrics-level)

(clojure.core/declare ser-output)

(clojure.core/declare ser-environment-property-updates)

(clojure.core/declare ser-object-version)

(clojure.core/declare ser-application-configuration)

(clojure.core/declare ser-lambda-output-update)

(clojure.core/declare ser-record-format-type)

(clojure.core/declare ser-list-snapshots-input-limit)

(clojure.core/declare ser-application-description)

(clojure.core/declare ser-parallelism-per-kpu)

(clojure.core/declare ser-source-schema)

(clojure.core/declare ser-application-configuration-update)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-flink-application-configuration)

(clojure.core/declare ser-input-updates)

(clojure.core/declare ser-parallelism-configuration)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-text-content)

(clojure.core/declare ser-kinesis-streams-input)

(clojure.core/declare ser-record-row-delimiter)

(clojure.core/declare ser-code-content-type)

(clojure.core/declare ser-id)

(clojure.core/declare ser-kinesis-streams-output)

(clojure.core/declare ser-configuration-type)

(clojure.core/declare ser-input-processing-configuration-update)

(clojure.core/declare ser-kinesis-firehose-output-update)

(clojure.core/declare ser-snapshot-name)

(clojure.core/declare ser-output-updates)

(clojure.core/declare ser-property-groups)

(clojure.core/declare ser-reference-data-source-updates)

(clojure.core/declare ser-bucket-arn)

(clojure.core/declare ser-input-starting-position)

(clojure.core/defn- ser-log-stream-arn [input] #:http.request.field{:value input, :shape "LogStreamARN"})

(clojure.core/defn- ser-code-content [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CodeContent", :type "structure"} (clojure.core/contains? input :text-content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-content (input :text-content)) #:http.request.field{:name "TextContent", :shape "TextContent"})) (clojure.core/contains? input :zip-file-content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zip-file-content (input :zip-file-content)) #:http.request.field{:name "ZipFileContent", :shape "ZipFileContent"})) (clojure.core/contains? input :s-3-content-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-content-location (input :s-3-content-location)) #:http.request.field{:name "S3ContentLocation", :shape "S3ContentLocation"}))))

(clojure.core/defn- ser-in-app-stream-name [input] #:http.request.field{:value input, :shape "InAppStreamName"})

(clojure.core/defn- ser-cloud-watch-logging-option [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-log-stream-arn (:log-stream-arn input)) #:http.request.field{:name "LogStreamARN", :shape "LogStreamARN"})], :shape "CloudWatchLoggingOption", :type "structure"}))

(clojure.core/defn- ser-lambda-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})], :shape "LambdaOutput", :type "structure"}))

(clojure.core/defn- ser-kinesis-firehose-input-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn-update input)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})], :shape "KinesisFirehoseInputUpdate", :type "structure"}))

(clojure.core/defn- ser-application-version-id [input] #:http.request.field{:value input, :shape "ApplicationVersionId"})

(clojure.core/defn- ser-kinesis-streams-output-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn-update input)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})], :shape "KinesisStreamsOutputUpdate", :type "structure"}))

(clojure.core/defn- ser-sql-application-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SqlApplicationConfigurationUpdate", :type "structure"} (clojure.core/contains? input :input-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-updates (input :input-updates)) #:http.request.field{:name "InputUpdates", :shape "InputUpdates"})) (clojure.core/contains? input :output-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-updates (input :output-updates)) #:http.request.field{:name "OutputUpdates", :shape "OutputUpdates"})) (clojure.core/contains? input :reference-data-source-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reference-data-source-updates (input :reference-data-source-updates)) #:http.request.field{:name "ReferenceDataSourceUpdates", :shape "ReferenceDataSourceUpdates"}))))

(clojure.core/defn- ser-property-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-property-key k) #:http.request.field{:map-info "key", :shape "PropertyKey"}) (clojure.core/into (ser-property-value v) #:http.request.field{:map-info "value", :shape "PropertyValue"})])) input), :shape "PropertyMap", :type "map", :max 50, :min 1})

(clojure.core/defn- ser-parallelism [input] #:http.request.field{:value input, :shape "Parallelism"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleARN"})

(clojure.core/defn- ser-input-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:input-id input)) #:http.request.field{:name "InputId", :shape "Id"})], :shape "InputUpdate", :type "structure"} (clojure.core/contains? input :name-prefix-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-in-app-stream-name (input :name-prefix-update)) #:http.request.field{:name "NamePrefixUpdate", :shape "InAppStreamName"})) (clojure.core/contains? input :input-processing-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-processing-configuration-update (input :input-processing-configuration-update)) #:http.request.field{:name "InputProcessingConfigurationUpdate", :shape "InputProcessingConfigurationUpdate"})) (clojure.core/contains? input :kinesis-streams-input-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-streams-input-update (input :kinesis-streams-input-update)) #:http.request.field{:name "KinesisStreamsInputUpdate", :shape "KinesisStreamsInputUpdate"})) (clojure.core/contains? input :kinesis-firehose-input-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-input-update (input :kinesis-firehose-input-update)) #:http.request.field{:name "KinesisFirehoseInputUpdate", :shape "KinesisFirehoseInputUpdate"})) (clojure.core/contains? input :input-schema-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-schema-update (input :input-schema-update)) #:http.request.field{:name "InputSchemaUpdate", :shape "InputSchemaUpdate"})) (clojure.core/contains? input :input-parallelism-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-parallelism-update (input :input-parallelism-update)) #:http.request.field{:name "InputParallelismUpdate", :shape "InputParallelismUpdate"}))))

(clojure.core/defn- ser-record-column-mapping [input] #:http.request.field{:value input, :shape "RecordColumnMapping"})

(clojure.core/defn- ser-application-code-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ApplicationCodeConfigurationUpdate", :type "structure"} (clojure.core/contains? input :code-content-type-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-content-type (input :code-content-type-update)) #:http.request.field{:name "CodeContentTypeUpdate", :shape "CodeContentType"})) (clojure.core/contains? input :code-content-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-content-update (input :code-content-update)) #:http.request.field{:name "CodeContentUpdate", :shape "CodeContentUpdate"}))))

(clojure.core/defn- ser-record-format [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-format-type (:record-format-type input)) #:http.request.field{:name "RecordFormatType", :shape "RecordFormatType"})], :shape "RecordFormat", :type "structure"} (clojure.core/contains? input :mapping-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-parameters (input :mapping-parameters)) #:http.request.field{:name "MappingParameters", :shape "MappingParameters"}))))

(clojure.core/defn- ser-log-level [input] #:http.request.field{:value (clojure.core/get {"INFO" "INFO", :info "INFO", "WARN" "WARN", :warn "WARN", "ERROR" "ERROR", :error "ERROR", "DEBUG" "DEBUG", :debug "DEBUG"} input), :shape "LogLevel"})

(clojure.core/defn- ser-flink-application-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FlinkApplicationConfigurationUpdate", :type "structure"} (clojure.core/contains? input :checkpoint-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-checkpoint-configuration-update (input :checkpoint-configuration-update)) #:http.request.field{:name "CheckpointConfigurationUpdate", :shape "CheckpointConfigurationUpdate"})) (clojure.core/contains? input :monitoring-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-monitoring-configuration-update (input :monitoring-configuration-update)) #:http.request.field{:name "MonitoringConfigurationUpdate", :shape "MonitoringConfigurationUpdate"})) (clojure.core/contains? input :parallelism-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parallelism-configuration-update (input :parallelism-configuration-update)) #:http.request.field{:name "ParallelismConfigurationUpdate", :shape "ParallelismConfigurationUpdate"}))))

(clojure.core/defn- ser-reference-data-sources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-reference-data-source coll) #:http.request.field{:shape "ReferenceDataSource"}))) input), :shape "ReferenceDataSources", :type "list"})

(clojure.core/defn- ser-cloud-watch-logging-option-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:cloud-watch-logging-option-id input)) #:http.request.field{:name "CloudWatchLoggingOptionId", :shape "Id"})], :shape "CloudWatchLoggingOptionUpdate", :type "structure"} (clojure.core/contains? input :log-stream-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-stream-arn (input :log-stream-arn-update)) #:http.request.field{:name "LogStreamARNUpdate", :shape "LogStreamARN"}))))

(clojure.core/defn- ser-input-parallelism-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-input-parallelism-count (:count-update input)) #:http.request.field{:name "CountUpdate", :shape "InputParallelismCount"})], :shape "InputParallelismUpdate", :type "structure"}))

(clojure.core/defn- ser-application-code-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-code-content-type (:code-content-type input)) #:http.request.field{:name "CodeContentType", :shape "CodeContentType"})], :shape "ApplicationCodeConfiguration", :type "structure"} (clojure.core/contains? input :code-content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-content (input :code-content)) #:http.request.field{:name "CodeContent", :shape "CodeContent"}))))

(clojure.core/defn- ser-run-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RunConfigurationUpdate", :type "structure"} (clojure.core/contains? input :application-restore-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-restore-configuration (input :application-restore-configuration)) #:http.request.field{:name "ApplicationRestoreConfiguration", :shape "ApplicationRestoreConfiguration"}))))

(clojure.core/defn- ser-sql-run-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sql-run-configuration coll) #:http.request.field{:shape "SqlRunConfiguration"}))) input), :shape "SqlRunConfigurations", :type "list"})

(clojure.core/defn- ser-reference-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-in-app-table-name (:table-name input)) #:http.request.field{:name "TableName", :shape "InAppTableName"}) (clojure.core/into (ser-source-schema (:reference-schema input)) #:http.request.field{:name "ReferenceSchema", :shape "SourceSchema"})], :shape "ReferenceDataSource", :type "structure"} (clojure.core/contains? input :s-3-reference-data-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-reference-data-source (input :s-3-reference-data-source)) #:http.request.field{:name "S3ReferenceDataSource", :shape "S3ReferenceDataSource"}))))

(clojure.core/defn- ser-csv-mapping-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-row-delimiter (:record-row-delimiter input)) #:http.request.field{:name "RecordRowDelimiter", :shape "RecordRowDelimiter"}) (clojure.core/into (ser-record-column-delimiter (:record-column-delimiter input)) #:http.request.field{:name "RecordColumnDelimiter", :shape "RecordColumnDelimiter"})], :shape "CSVMappingParameters", :type "structure"}))

(clojure.core/defn- ser-property-key [input] #:http.request.field{:value input, :shape "PropertyKey"})

(clojure.core/defn- ser-s-3-content-location-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3ContentLocationUpdate", :type "structure"} (clojure.core/contains? input :bucket-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-arn (input :bucket-arn-update)) #:http.request.field{:name "BucketARNUpdate", :shape "BucketARN"})) (clojure.core/contains? input :file-key-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-key (input :file-key-update)) #:http.request.field{:name "FileKeyUpdate", :shape "FileKey"})) (clojure.core/contains? input :object-version-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version (input :object-version-update)) #:http.request.field{:name "ObjectVersionUpdate", :shape "ObjectVersion"}))))

(clojure.core/defn- ser-input-parallelism [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputParallelism", :type "structure"} (clojure.core/contains? input :count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-parallelism-count (input :count)) #:http.request.field{:name "Count", :shape "InputParallelismCount"}))))

(clojure.core/defn- ser-monitoring-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MonitoringConfigurationUpdate", :type "structure"} (clojure.core/contains? input :configuration-type-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-type (input :configuration-type-update)) #:http.request.field{:name "ConfigurationTypeUpdate", :shape "ConfigurationType"})) (clojure.core/contains? input :metrics-level-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics-level (input :metrics-level-update)) #:http.request.field{:name "MetricsLevelUpdate", :shape "MetricsLevel"})) (clojure.core/contains? input :log-level-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-level (input :log-level-update)) #:http.request.field{:name "LogLevelUpdate", :shape "LogLevel"}))))

(clojure.core/defn- ser-sql-application-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SqlApplicationConfiguration", :type "structure"} (clojure.core/contains? input :inputs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inputs (input :inputs)) #:http.request.field{:name "Inputs", :shape "Inputs"})) (clojure.core/contains? input :outputs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-outputs (input :outputs)) #:http.request.field{:name "Outputs", :shape "Outputs"})) (clojure.core/contains? input :reference-data-sources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reference-data-sources (input :reference-data-sources)) #:http.request.field{:name "ReferenceDataSources", :shape "ReferenceDataSources"}))))

(clojure.core/defn- ser-record-column-delimiter [input] #:http.request.field{:value input, :shape "RecordColumnDelimiter"})

(clojure.core/defn- ser-record-column-name [input] #:http.request.field{:value input, :shape "RecordColumnName"})

(clojure.core/defn- ser-record-row-path [input] #:http.request.field{:value input, :shape "RecordRowPath"})

(clojure.core/defn- ser-input-parallelism-count [input] #:http.request.field{:value input, :shape "InputParallelismCount"})

(clojure.core/defn- ser-s-3-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-arn (:bucket-arn input)) #:http.request.field{:name "BucketARN", :shape "BucketARN"}) (clojure.core/into (ser-file-key (:file-key input)) #:http.request.field{:name "FileKey", :shape "FileKey"})], :shape "S3Configuration", :type "structure"}))

(clojure.core/defn- ser-s-3-reference-data-source [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3ReferenceDataSource", :type "structure"} (clojure.core/contains? input :bucket-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-arn (input :bucket-arn)) #:http.request.field{:name "BucketARN", :shape "BucketARN"})) (clojure.core/contains? input :file-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-key (input :file-key)) #:http.request.field{:name "FileKey", :shape "FileKey"}))))

(clojure.core/defn- ser-destination-schema [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-format-type (:record-format-type input)) #:http.request.field{:name "RecordFormatType", :shape "RecordFormatType"})], :shape "DestinationSchema", :type "structure"}))

(clojure.core/defn- ser-outputs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output coll) #:http.request.field{:shape "Output"}))) input), :shape "Outputs", :type "list"})

(clojure.core/defn- ser-environment-properties [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-property-groups (:property-groups input)) #:http.request.field{:name "PropertyGroups", :shape "PropertyGroups"})], :shape "EnvironmentProperties", :type "structure"}))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-json-mapping-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-row-path (:record-row-path input)) #:http.request.field{:name "RecordRowPath", :shape "RecordRowPath"})], :shape "JSONMappingParameters", :type "structure"}))

(clojure.core/defn- ser-property-value [input] #:http.request.field{:value input, :shape "PropertyValue"})

(clojure.core/defn- ser-parallelism-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParallelismConfigurationUpdate", :type "structure"} (clojure.core/contains? input :configuration-type-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-type (input :configuration-type-update)) #:http.request.field{:name "ConfigurationTypeUpdate", :shape "ConfigurationType"})) (clojure.core/contains? input :parallelism-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parallelism (input :parallelism-update)) #:http.request.field{:name "ParallelismUpdate", :shape "Parallelism"})) (clojure.core/contains? input :parallelism-per-kpu-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parallelism-per-kpu (input :parallelism-per-kpu-update)) #:http.request.field{:name "ParallelismPerKPUUpdate", :shape "ParallelismPerKPU"})) (clojure.core/contains? input :auto-scaling-enabled-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :auto-scaling-enabled-update)) #:http.request.field{:name "AutoScalingEnabledUpdate", :shape "BooleanObject"}))))

(clojure.core/defn- ser-cloud-watch-logging-options [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cloud-watch-logging-option coll) #:http.request.field{:shape "CloudWatchLoggingOption"}))) input), :shape "CloudWatchLoggingOptions", :type "list"})

(clojure.core/defn- ser-record-column [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-column-name (:name input)) #:http.request.field{:name "Name", :shape "RecordColumnName"}) (clojure.core/into (ser-record-column-sql-type (:sql-type input)) #:http.request.field{:name "SqlType", :shape "RecordColumnSqlType"})], :shape "RecordColumn", :type "structure"} (clojure.core/contains? input :mapping) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-column-mapping (input :mapping)) #:http.request.field{:name "Mapping", :shape "RecordColumnMapping"}))))

(clojure.core/defn- ser-input-lambda-processor-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn-update input)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})], :shape "InputLambdaProcessorUpdate", :type "structure"}))

(clojure.core/defn- ser-min-pause-between-checkpoints [input] #:http.request.field{:value input, :shape "MinPauseBetweenCheckpoints"})

(clojure.core/defn- ser-input-starting-position-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputStartingPositionConfiguration", :type "structure"} (clojure.core/contains? input :input-starting-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-starting-position (input :input-starting-position)) #:http.request.field{:name "InputStartingPosition", :shape "InputStartingPosition"}))))

(clojure.core/defn- ser-run-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RunConfiguration", :type "structure"} (clojure.core/contains? input :sql-run-configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sql-run-configurations (input :sql-run-configurations)) #:http.request.field{:name "SqlRunConfigurations", :shape "SqlRunConfigurations"})) (clojure.core/contains? input :application-restore-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-restore-configuration (input :application-restore-configuration)) #:http.request.field{:name "ApplicationRestoreConfiguration", :shape "ApplicationRestoreConfiguration"}))))

(clojure.core/defn- ser-checkpoint-interval [input] #:http.request.field{:value input, :shape "CheckpointInterval"})

(clojure.core/defn- ser-s-3-content-location [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-arn (:bucket-arn input)) #:http.request.field{:name "BucketARN", :shape "BucketARN"}) (clojure.core/into (ser-file-key (:file-key input)) #:http.request.field{:name "FileKey", :shape "FileKey"})], :shape "S3ContentLocation", :type "structure"} (clojure.core/contains? input :object-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version (input :object-version)) #:http.request.field{:name "ObjectVersion", :shape "ObjectVersion"}))))

(clojure.core/defn- ser-record-encoding [input] #:http.request.field{:value input, :shape "RecordEncoding"})

(clojure.core/defn- ser-property-group [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:property-group-id input)) #:http.request.field{:name "PropertyGroupId", :shape "Id"}) (clojure.core/into (ser-property-map (:property-map input)) #:http.request.field{:name "PropertyMap", :shape "PropertyMap"})], :shape "PropertyGroup", :type "structure"}))

(clojure.core/defn- ser-reference-data-source-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:reference-id input)) #:http.request.field{:name "ReferenceId", :shape "Id"})], :shape "ReferenceDataSourceUpdate", :type "structure"} (clojure.core/contains? input :table-name-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-in-app-table-name (input :table-name-update)) #:http.request.field{:name "TableNameUpdate", :shape "InAppTableName"})) (clojure.core/contains? input :s-3-reference-data-source-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-reference-data-source-update (input :s-3-reference-data-source-update)) #:http.request.field{:name "S3ReferenceDataSourceUpdate", :shape "S3ReferenceDataSourceUpdate"})) (clojure.core/contains? input :reference-schema-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-schema (input :reference-schema-update)) #:http.request.field{:name "ReferenceSchemaUpdate", :shape "SourceSchema"}))))

(clojure.core/defn- ser-inputs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input coll) #:http.request.field{:shape "Input"}))) input), :shape "Inputs", :type "list"})

(clojure.core/defn- ser-zip-file-content [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "ZipFileContent"})

(clojure.core/defn- ser-list-applications-input-limit [input] #:http.request.field{:value input, :shape "ListApplicationsInputLimit"})

(clojure.core/defn- ser-kinesis-streams-input-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn-update input)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})], :shape "KinesisStreamsInputUpdate", :type "structure"}))

(clojure.core/defn- ser-file-key [input] #:http.request.field{:value input, :shape "FileKey"})

(clojure.core/defn- ser-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-in-app-stream-name (:name-prefix input)) #:http.request.field{:name "NamePrefix", :shape "InAppStreamName"}) (clojure.core/into (ser-source-schema (:input-schema input)) #:http.request.field{:name "InputSchema", :shape "SourceSchema"})], :shape "Input", :type "structure"} (clojure.core/contains? input :input-processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-processing-configuration (input :input-processing-configuration)) #:http.request.field{:name "InputProcessingConfiguration", :shape "InputProcessingConfiguration"})) (clojure.core/contains? input :kinesis-streams-input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-streams-input (input :kinesis-streams-input)) #:http.request.field{:name "KinesisStreamsInput", :shape "KinesisStreamsInput"})) (clojure.core/contains? input :kinesis-firehose-input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-input (input :kinesis-firehose-input)) #:http.request.field{:name "KinesisFirehoseInput", :shape "KinesisFirehoseInput"})) (clojure.core/contains? input :input-parallelism) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-parallelism (input :input-parallelism)) #:http.request.field{:name "InputParallelism", :shape "InputParallelism"}))))

(clojure.core/defn- ser-code-content-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CodeContentUpdate", :type "structure"} (clojure.core/contains? input :text-content-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-content (input :text-content-update)) #:http.request.field{:name "TextContentUpdate", :shape "TextContent"})) (clojure.core/contains? input :zip-file-content-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zip-file-content (input :zip-file-content-update)) #:http.request.field{:name "ZipFileContentUpdate", :shape "ZipFileContent"})) (clojure.core/contains? input :s-3-content-location-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-content-location-update (input :s-3-content-location-update)) #:http.request.field{:name "S3ContentLocationUpdate", :shape "S3ContentLocationUpdate"}))))

(clojure.core/defn- ser-application-snapshot-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boolean-object (:snapshots-enabled-update input)) #:http.request.field{:name "SnapshotsEnabledUpdate", :shape "BooleanObject"})], :shape "ApplicationSnapshotConfigurationUpdate", :type "structure"}))

(clojure.core/defn- ser-application-restore-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-application-restore-type (:application-restore-type input)) #:http.request.field{:name "ApplicationRestoreType", :shape "ApplicationRestoreType"})], :shape "ApplicationRestoreConfiguration", :type "structure"} (clojure.core/contains? input :snapshot-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-name (input :snapshot-name)) #:http.request.field{:name "SnapshotName", :shape "SnapshotName"}))))

(clojure.core/defn- ser-application-name [input] #:http.request.field{:value input, :shape "ApplicationName"})

(clojure.core/defn- ser-checkpoint-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CheckpointConfigurationUpdate", :type "structure"} (clojure.core/contains? input :configuration-type-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-type (input :configuration-type-update)) #:http.request.field{:name "ConfigurationTypeUpdate", :shape "ConfigurationType"})) (clojure.core/contains? input :checkpointing-enabled-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :checkpointing-enabled-update)) #:http.request.field{:name "CheckpointingEnabledUpdate", :shape "BooleanObject"})) (clojure.core/contains? input :checkpoint-interval-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-checkpoint-interval (input :checkpoint-interval-update)) #:http.request.field{:name "CheckpointIntervalUpdate", :shape "CheckpointInterval"})) (clojure.core/contains? input :min-pause-between-checkpoints-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-min-pause-between-checkpoints (input :min-pause-between-checkpoints-update)) #:http.request.field{:name "MinPauseBetweenCheckpointsUpdate", :shape "MinPauseBetweenCheckpoints"}))))

(clojure.core/defn- ser-record-column-sql-type [input] #:http.request.field{:value input, :shape "RecordColumnSqlType"})

(clojure.core/defn- ser-cloud-watch-logging-option-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cloud-watch-logging-option-update coll) #:http.request.field{:shape "CloudWatchLoggingOptionUpdate"}))) input), :shape "CloudWatchLoggingOptionUpdates", :type "list"})

(clojure.core/defn- ser-kinesis-firehose-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})], :shape "KinesisFirehoseInput", :type "structure"}))

(clojure.core/defn- ser-runtime-environment [input] #:http.request.field{:value (clojure.core/get {"SQL-1_0" "SQL-1_0", :sql-1-0 "SQL-1_0", "FLINK-1_6" "FLINK-1_6", :flink-1-6 "FLINK-1_6"} input), :shape "RuntimeEnvironment"})

(clojure.core/defn- ser-s-3-reference-data-source-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3ReferenceDataSourceUpdate", :type "structure"} (clojure.core/contains? input :bucket-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-arn (input :bucket-arn-update)) #:http.request.field{:name "BucketARNUpdate", :shape "BucketARN"})) (clojure.core/contains? input :file-key-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-key (input :file-key-update)) #:http.request.field{:name "FileKeyUpdate", :shape "FileKey"}))))

(clojure.core/defn- ser-output-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:output-id input)) #:http.request.field{:name "OutputId", :shape "Id"})], :shape "OutputUpdate", :type "structure"} (clojure.core/contains? input :name-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-in-app-stream-name (input :name-update)) #:http.request.field{:name "NameUpdate", :shape "InAppStreamName"})) (clojure.core/contains? input :kinesis-streams-output-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-streams-output-update (input :kinesis-streams-output-update)) #:http.request.field{:name "KinesisStreamsOutputUpdate", :shape "KinesisStreamsOutputUpdate"})) (clojure.core/contains? input :kinesis-firehose-output-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-output-update (input :kinesis-firehose-output-update)) #:http.request.field{:name "KinesisFirehoseOutputUpdate", :shape "KinesisFirehoseOutputUpdate"})) (clojure.core/contains? input :lambda-output-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-output-update (input :lambda-output-update)) #:http.request.field{:name "LambdaOutputUpdate", :shape "LambdaOutputUpdate"})) (clojure.core/contains? input :destination-schema-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-destination-schema (input :destination-schema-update)) #:http.request.field{:name "DestinationSchemaUpdate", :shape "DestinationSchema"}))))

(clojure.core/defn- ser-sql-run-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:input-id input)) #:http.request.field{:name "InputId", :shape "Id"}) (clojure.core/into (ser-input-starting-position-configuration (:input-starting-position-configuration input)) #:http.request.field{:name "InputStartingPositionConfiguration", :shape "InputStartingPositionConfiguration"})], :shape "SqlRunConfiguration", :type "structure"}))

(clojure.core/defn- ser-application-snapshot-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boolean-object (:snapshots-enabled input)) #:http.request.field{:name "SnapshotsEnabled", :shape "BooleanObject"})], :shape "ApplicationSnapshotConfiguration", :type "structure"}))

(clojure.core/defn- ser-input-processing-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-input-lambda-processor (:input-lambda-processor input)) #:http.request.field{:name "InputLambdaProcessor", :shape "InputLambdaProcessor"})], :shape "InputProcessingConfiguration", :type "structure"}))

(clojure.core/defn- ser-mapping-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MappingParameters", :type "structure"} (clojure.core/contains? input :json-mapping-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-json-mapping-parameters (input :json-mapping-parameters)) #:http.request.field{:name "JSONMappingParameters", :shape "JSONMappingParameters"})) (clojure.core/contains? input :csv-mapping-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-csv-mapping-parameters (input :csv-mapping-parameters)) #:http.request.field{:name "CSVMappingParameters", :shape "CSVMappingParameters"}))))

(clojure.core/defn- ser-application-restore-type [input] #:http.request.field{:value (clojure.core/get {"SKIP_RESTORE_FROM_SNAPSHOT" "SKIP_RESTORE_FROM_SNAPSHOT", :skip-restore-from-snapshot "SKIP_RESTORE_FROM_SNAPSHOT", "RESTORE_FROM_LATEST_SNAPSHOT" "RESTORE_FROM_LATEST_SNAPSHOT", :restore-from-latest-snapshot "RESTORE_FROM_LATEST_SNAPSHOT", "RESTORE_FROM_CUSTOM_SNAPSHOT" "RESTORE_FROM_CUSTOM_SNAPSHOT", :restore-from-custom-snapshot "RESTORE_FROM_CUSTOM_SNAPSHOT"} input), :shape "ApplicationRestoreType"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-monitoring-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-configuration-type (:configuration-type input)) #:http.request.field{:name "ConfigurationType", :shape "ConfigurationType"})], :shape "MonitoringConfiguration", :type "structure"} (clojure.core/contains? input :metrics-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics-level (input :metrics-level)) #:http.request.field{:name "MetricsLevel", :shape "MetricsLevel"})) (clojure.core/contains? input :log-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-level (input :log-level)) #:http.request.field{:name "LogLevel", :shape "LogLevel"}))))

(clojure.core/defn- ser-kinesis-firehose-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})], :shape "KinesisFirehoseOutput", :type "structure"}))

(clojure.core/defn- ser-in-app-table-name [input] #:http.request.field{:value input, :shape "InAppTableName"})

(clojure.core/defn- ser-record-columns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-record-column coll) #:http.request.field{:shape "RecordColumn"}))) input), :shape "RecordColumns", :type "list", :max 1000, :min 1})

(clojure.core/defn- ser-input-lambda-processor [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})], :shape "InputLambdaProcessor", :type "structure"}))

(clojure.core/defn- ser-input-schema-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputSchemaUpdate", :type "structure"} (clojure.core/contains? input :record-format-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-format (input :record-format-update)) #:http.request.field{:name "RecordFormatUpdate", :shape "RecordFormat"})) (clojure.core/contains? input :record-encoding-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-encoding (input :record-encoding-update)) #:http.request.field{:name "RecordEncodingUpdate", :shape "RecordEncoding"})) (clojure.core/contains? input :record-column-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-columns (input :record-column-updates)) #:http.request.field{:name "RecordColumnUpdates", :shape "RecordColumns"}))))

(clojure.core/defn- ser-checkpoint-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-configuration-type (:configuration-type input)) #:http.request.field{:name "ConfigurationType", :shape "ConfigurationType"})], :shape "CheckpointConfiguration", :type "structure"} (clojure.core/contains? input :checkpointing-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :checkpointing-enabled)) #:http.request.field{:name "CheckpointingEnabled", :shape "BooleanObject"})) (clojure.core/contains? input :checkpoint-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-checkpoint-interval (input :checkpoint-interval)) #:http.request.field{:name "CheckpointInterval", :shape "CheckpointInterval"})) (clojure.core/contains? input :min-pause-between-checkpoints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-min-pause-between-checkpoints (input :min-pause-between-checkpoints)) #:http.request.field{:name "MinPauseBetweenCheckpoints", :shape "MinPauseBetweenCheckpoints"}))))

(clojure.core/defn- ser-metrics-level [input] #:http.request.field{:value (clojure.core/get {"APPLICATION" "APPLICATION", :application "APPLICATION", "TASK" "TASK", :task "TASK", "OPERATOR" "OPERATOR", :operator "OPERATOR", "PARALLELISM" "PARALLELISM", :parallelism "PARALLELISM"} input), :shape "MetricsLevel"})

(clojure.core/defn- ser-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-in-app-stream-name (:name input)) #:http.request.field{:name "Name", :shape "InAppStreamName"}) (clojure.core/into (ser-destination-schema (:destination-schema input)) #:http.request.field{:name "DestinationSchema", :shape "DestinationSchema"})], :shape "Output", :type "structure"} (clojure.core/contains? input :kinesis-streams-output) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-streams-output (input :kinesis-streams-output)) #:http.request.field{:name "KinesisStreamsOutput", :shape "KinesisStreamsOutput"})) (clojure.core/contains? input :kinesis-firehose-output) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-output (input :kinesis-firehose-output)) #:http.request.field{:name "KinesisFirehoseOutput", :shape "KinesisFirehoseOutput"})) (clojure.core/contains? input :lambda-output) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-output (input :lambda-output)) #:http.request.field{:name "LambdaOutput", :shape "LambdaOutput"}))))

(clojure.core/defn- ser-environment-property-updates [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-property-groups (:property-groups input)) #:http.request.field{:name "PropertyGroups", :shape "PropertyGroups"})], :shape "EnvironmentPropertyUpdates", :type "structure"}))

(clojure.core/defn- ser-object-version [input] #:http.request.field{:value input, :shape "ObjectVersion"})

(clojure.core/defn- ser-application-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-application-code-configuration (:application-code-configuration input)) #:http.request.field{:name "ApplicationCodeConfiguration", :shape "ApplicationCodeConfiguration"})], :shape "ApplicationConfiguration", :type "structure"} (clojure.core/contains? input :sql-application-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sql-application-configuration (input :sql-application-configuration)) #:http.request.field{:name "SqlApplicationConfiguration", :shape "SqlApplicationConfiguration"})) (clojure.core/contains? input :flink-application-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-flink-application-configuration (input :flink-application-configuration)) #:http.request.field{:name "FlinkApplicationConfiguration", :shape "FlinkApplicationConfiguration"})) (clojure.core/contains? input :environment-properties) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-properties (input :environment-properties)) #:http.request.field{:name "EnvironmentProperties", :shape "EnvironmentProperties"})) (clojure.core/contains? input :application-snapshot-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-snapshot-configuration (input :application-snapshot-configuration)) #:http.request.field{:name "ApplicationSnapshotConfiguration", :shape "ApplicationSnapshotConfiguration"}))))

(clojure.core/defn- ser-lambda-output-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn-update input)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})], :shape "LambdaOutputUpdate", :type "structure"}))

(clojure.core/defn- ser-record-format-type [input] #:http.request.field{:value (clojure.core/get {"JSON" "JSON", :json "JSON", "CSV" "CSV", :csv "CSV"} input), :shape "RecordFormatType"})

(clojure.core/defn- ser-list-snapshots-input-limit [input] #:http.request.field{:value input, :shape "ListSnapshotsInputLimit"})

(clojure.core/defn- ser-application-description [input] #:http.request.field{:value input, :shape "ApplicationDescription"})

(clojure.core/defn- ser-parallelism-per-kpu [input] #:http.request.field{:value input, :shape "ParallelismPerKPU"})

(clojure.core/defn- ser-source-schema [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-format (:record-format input)) #:http.request.field{:name "RecordFormat", :shape "RecordFormat"}) (clojure.core/into (ser-record-columns (:record-columns input)) #:http.request.field{:name "RecordColumns", :shape "RecordColumns"})], :shape "SourceSchema", :type "structure"} (clojure.core/contains? input :record-encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-encoding (input :record-encoding)) #:http.request.field{:name "RecordEncoding", :shape "RecordEncoding"}))))

(clojure.core/defn- ser-application-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ApplicationConfigurationUpdate", :type "structure"} (clojure.core/contains? input :sql-application-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sql-application-configuration-update (input :sql-application-configuration-update)) #:http.request.field{:name "SqlApplicationConfigurationUpdate", :shape "SqlApplicationConfigurationUpdate"})) (clojure.core/contains? input :application-code-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-code-configuration-update (input :application-code-configuration-update)) #:http.request.field{:name "ApplicationCodeConfigurationUpdate", :shape "ApplicationCodeConfigurationUpdate"})) (clojure.core/contains? input :flink-application-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-flink-application-configuration-update (input :flink-application-configuration-update)) #:http.request.field{:name "FlinkApplicationConfigurationUpdate", :shape "FlinkApplicationConfigurationUpdate"})) (clojure.core/contains? input :environment-property-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-property-updates (input :environment-property-updates)) #:http.request.field{:name "EnvironmentPropertyUpdates", :shape "EnvironmentPropertyUpdates"})) (clojure.core/contains? input :application-snapshot-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-snapshot-configuration-update (input :application-snapshot-configuration-update)) #:http.request.field{:name "ApplicationSnapshotConfigurationUpdate", :shape "ApplicationSnapshotConfigurationUpdate"}))))

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-flink-application-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FlinkApplicationConfiguration", :type "structure"} (clojure.core/contains? input :checkpoint-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-checkpoint-configuration (input :checkpoint-configuration)) #:http.request.field{:name "CheckpointConfiguration", :shape "CheckpointConfiguration"})) (clojure.core/contains? input :monitoring-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-monitoring-configuration (input :monitoring-configuration)) #:http.request.field{:name "MonitoringConfiguration", :shape "MonitoringConfiguration"})) (clojure.core/contains? input :parallelism-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parallelism-configuration (input :parallelism-configuration)) #:http.request.field{:name "ParallelismConfiguration", :shape "ParallelismConfiguration"}))))

(clojure.core/defn- ser-input-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-update coll) #:http.request.field{:shape "InputUpdate"}))) input), :shape "InputUpdates", :type "list"})

(clojure.core/defn- ser-parallelism-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-configuration-type (:configuration-type input)) #:http.request.field{:name "ConfigurationType", :shape "ConfigurationType"})], :shape "ParallelismConfiguration", :type "structure"} (clojure.core/contains? input :parallelism) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parallelism (input :parallelism)) #:http.request.field{:name "Parallelism", :shape "Parallelism"})) (clojure.core/contains? input :parallelism-per-kpu) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parallelism-per-kpu (input :parallelism-per-kpu)) #:http.request.field{:name "ParallelismPerKPU", :shape "ParallelismPerKPU"})) (clojure.core/contains? input :auto-scaling-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :auto-scaling-enabled)) #:http.request.field{:name "AutoScalingEnabled", :shape "BooleanObject"}))))

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-text-content [input] #:http.request.field{:value input, :shape "TextContent"})

(clojure.core/defn- ser-kinesis-streams-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})], :shape "KinesisStreamsInput", :type "structure"}))

(clojure.core/defn- ser-record-row-delimiter [input] #:http.request.field{:value input, :shape "RecordRowDelimiter"})

(clojure.core/defn- ser-code-content-type [input] #:http.request.field{:value (clojure.core/get {"PLAINTEXT" "PLAINTEXT", :plaintext "PLAINTEXT", "ZIPFILE" "ZIPFILE", :zipfile "ZIPFILE"} input), :shape "CodeContentType"})

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "Id"})

(clojure.core/defn- ser-kinesis-streams-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})], :shape "KinesisStreamsOutput", :type "structure"}))

(clojure.core/defn- ser-configuration-type [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "CUSTOM" "CUSTOM", :custom "CUSTOM"} input), :shape "ConfigurationType"})

(clojure.core/defn- ser-input-processing-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-input-lambda-processor-update (:input-lambda-processor-update input)) #:http.request.field{:name "InputLambdaProcessorUpdate", :shape "InputLambdaProcessorUpdate"})], :shape "InputProcessingConfigurationUpdate", :type "structure"}))

(clojure.core/defn- ser-kinesis-firehose-output-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn-update input)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})], :shape "KinesisFirehoseOutputUpdate", :type "structure"}))

(clojure.core/defn- ser-snapshot-name [input] #:http.request.field{:value input, :shape "SnapshotName"})

(clojure.core/defn- ser-output-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output-update coll) #:http.request.field{:shape "OutputUpdate"}))) input), :shape "OutputUpdates", :type "list"})

(clojure.core/defn- ser-property-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-property-group coll) #:http.request.field{:shape "PropertyGroup"}))) input), :shape "PropertyGroups", :type "list", :max 50})

(clojure.core/defn- ser-reference-data-source-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-reference-data-source-update coll) #:http.request.field{:shape "ReferenceDataSourceUpdate"}))) input), :shape "ReferenceDataSourceUpdates", :type "list"})

(clojure.core/defn- ser-bucket-arn [input] #:http.request.field{:value input, :shape "BucketARN"})

(clojure.core/defn- ser-input-starting-position [input] #:http.request.field{:value (clojure.core/get {"NOW" "NOW", :now "NOW", "TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LAST_STOPPED_POINT" "LAST_STOPPED_POINT", :last-stopped-point "LAST_STOPPED_POINT"} input), :shape "InputStartingPosition"})

(clojure.core/defn- req-stop-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]}))

(clojure.core/defn- req-describe-application-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-snapshot-name (input :snapshot-name)) #:http.request.field{:name "SnapshotName", :shape "SnapshotName"})]}))

(clojure.core/defn- req-delete-application-reference-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :reference-id)) #:http.request.field{:name "ReferenceId", :shape "Id"})]}))

(clojure.core/defn- req-list-application-snapshots-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-snapshots-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListSnapshotsInputLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-application-output-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :output-id)) #:http.request.field{:name "OutputId", :shape "Id"})]}))

(clojure.core/defn- req-add-application-output-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-output (input :output)) #:http.request.field{:name "Output", :shape "Output"})]}))

(clojure.core/defn- req-create-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-runtime-environment (input :runtime-environment)) #:http.request.field{:name "RuntimeEnvironment", :shape "RuntimeEnvironment"}) (clojure.core/into (ser-role-arn (input :service-execution-role)) #:http.request.field{:name "ServiceExecutionRole", :shape "RoleARN"})]} (clojure.core/contains? input :application-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-description (input :application-description)) #:http.request.field{:name "ApplicationDescription", :shape "ApplicationDescription"})) (clojure.core/contains? input :application-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-configuration (input :application-configuration)) #:http.request.field{:name "ApplicationConfiguration", :shape "ApplicationConfiguration"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"}))))

(clojure.core/defn- req-start-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-run-configuration (input :run-configuration)) #:http.request.field{:name "RunConfiguration", :shape "RunConfiguration"})]}))

(clojure.core/defn- req-create-application-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-snapshot-name (input :snapshot-name)) #:http.request.field{:name "SnapshotName", :shape "SnapshotName"})]}))

(clojure.core/defn- req-add-application-cloud-watch-logging-option-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-cloud-watch-logging-option (input :cloud-watch-logging-option)) #:http.request.field{:name "CloudWatchLoggingOption", :shape "CloudWatchLoggingOption"})]}))

(clojure.core/defn- req-discover-input-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-role-arn (input :service-execution-role)) #:http.request.field{:name "ServiceExecutionRole", :shape "RoleARN"})]} (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})) (clojure.core/contains? input :input-starting-position-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-starting-position-configuration (input :input-starting-position-configuration)) #:http.request.field{:name "InputStartingPositionConfiguration", :shape "InputStartingPositionConfiguration"})) (clojure.core/contains? input :s-3-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-configuration (input :s-3-configuration)) #:http.request.field{:name "S3Configuration", :shape "S3Configuration"})) (clojure.core/contains? input :input-processing-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-processing-configuration (input :input-processing-configuration)) #:http.request.field{:name "InputProcessingConfiguration", :shape "InputProcessingConfiguration"}))))

(clojure.core/defn- req-delete-application-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-snapshot-name (input :snapshot-name)) #:http.request.field{:name "SnapshotName", :shape "SnapshotName"}) (clojure.core/into (ser-timestamp (input :snapshot-creation-timestamp)) #:http.request.field{:name "SnapshotCreationTimestamp", :shape "Timestamp"})]}))

(clojure.core/defn- req-delete-application-input-processing-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :input-id)) #:http.request.field{:name "InputId", :shape "Id"})]}))

(clojure.core/defn- req-add-application-input-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-input (input :input)) #:http.request.field{:name "Input", :shape "Input"})]}))

(clojure.core/defn- req-list-applications-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-applications-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListApplicationsInputLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :next-token)) #:http.request.field{:name "NextToken", :shape "ApplicationName"}))))

(clojure.core/defn- req-add-application-reference-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-reference-data-source (input :reference-data-source)) #:http.request.field{:name "ReferenceDataSource", :shape "ReferenceDataSource"})]}))

(clojure.core/defn- req-delete-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-timestamp (input :create-timestamp)) #:http.request.field{:name "CreateTimestamp", :shape "Timestamp"})]}))

(clojure.core/defn- req-delete-application-cloud-watch-logging-option-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :cloud-watch-logging-option-id)) #:http.request.field{:name "CloudWatchLoggingOptionId", :shape "Id"})]}))

(clojure.core/defn- req-add-application-input-processing-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :input-id)) #:http.request.field{:name "InputId", :shape "Id"}) (clojure.core/into (ser-input-processing-configuration (input :input-processing-configuration)) #:http.request.field{:name "InputProcessingConfiguration", :shape "InputProcessingConfiguration"})]}))

(clojure.core/defn- req-update-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"})]} (clojure.core/contains? input :application-configuration-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-configuration-update (input :application-configuration-update)) #:http.request.field{:name "ApplicationConfigurationUpdate", :shape "ApplicationConfigurationUpdate"})) (clojure.core/contains? input :service-execution-role-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :service-execution-role-update)) #:http.request.field{:name "ServiceExecutionRoleUpdate", :shape "RoleARN"})) (clojure.core/contains? input :run-configuration-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-run-configuration-update (input :run-configuration-update)) #:http.request.field{:name "RunConfigurationUpdate", :shape "RunConfigurationUpdate"})) (clojure.core/contains? input :cloud-watch-logging-option-updates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-option-updates (input :cloud-watch-logging-option-updates)) #:http.request.field{:name "CloudWatchLoggingOptionUpdates", :shape "CloudWatchLoggingOptionUpdates"}))))

(clojure.core/defn- req-describe-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :include-additional-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :include-additional-details)) #:http.request.field{:name "IncludeAdditionalDetails", :shape "BooleanObject"}))))

(clojure.core/declare deser-input-processing-configuration-description)

(clojure.core/declare deser-log-stream-arn)

(clojure.core/declare deser-cloud-watch-logging-option-description)

(clojure.core/declare deser-application-detail)

(clojure.core/declare deser-in-app-stream-name)

(clojure.core/declare deser-s-3-application-code-location-description)

(clojure.core/declare deser-application-version-id)

(clojure.core/declare deser-application-summaries)

(clojure.core/declare deser-property-map)

(clojure.core/declare deser-parallelism)

(clojure.core/declare deser-parsed-input-records)

(clojure.core/declare deser-input-description)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-record-column-mapping)

(clojure.core/declare deser-record-format)

(clojure.core/declare deser-output-descriptions)

(clojure.core/declare deser-code-content-description)

(clojure.core/declare deser-kinesis-streams-output-description)

(clojure.core/declare deser-log-level)

(clojure.core/declare deser-output-description)

(clojure.core/declare deser-parsed-input-record)

(clojure.core/declare deser-cloud-watch-logging-option-descriptions)

(clojure.core/declare deser-code-md-5)

(clojure.core/declare deser-flink-application-configuration-description)

(clojure.core/declare deser-parallelism-configuration-description)

(clojure.core/declare deser-application-code-configuration-description)

(clojure.core/declare deser-csv-mapping-parameters)

(clojure.core/declare deser-property-key)

(clojure.core/declare deser-input-parallelism)

(clojure.core/declare deser-application-summary)

(clojure.core/declare deser-record-column-delimiter)

(clojure.core/declare deser-in-app-stream-names)

(clojure.core/declare deser-record-column-name)

(clojure.core/declare deser-record-row-path)

(clojure.core/declare deser-monitoring-configuration-description)

(clojure.core/declare deser-input-parallelism-count)

(clojure.core/declare deser-destination-schema)

(clojure.core/declare deser-environment-property-descriptions)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-kinesis-firehose-output-description)

(clojure.core/declare deser-processed-input-records)

(clojure.core/declare deser-application-configuration-description)

(clojure.core/declare deser-json-mapping-parameters)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-property-value)

(clojure.core/declare deser-checkpoint-configuration-description)

(clojure.core/declare deser-record-column)

(clojure.core/declare deser-min-pause-between-checkpoints)

(clojure.core/declare deser-input-starting-position-configuration)

(clojure.core/declare deser-snapshot-status)

(clojure.core/declare deser-checkpoint-interval)

(clojure.core/declare deser-s-3-reference-data-source-description)

(clojure.core/declare deser-record-encoding)

(clojure.core/declare deser-property-group)

(clojure.core/declare deser-application-status)

(clojure.core/declare deser-processed-input-record)

(clojure.core/declare deser-file-key)

(clojure.core/declare deser-run-configuration-description)

(clojure.core/declare deser-sql-application-configuration-description)

(clojure.core/declare deser-snapshot-details)

(clojure.core/declare deser-application-restore-configuration)

(clojure.core/declare deser-application-name)

(clojure.core/declare deser-input-descriptions)

(clojure.core/declare deser-record-column-sql-type)

(clojure.core/declare deser-runtime-environment)

(clojure.core/declare deser-code-size)

(clojure.core/declare deser-kinesis-streams-input-description)

(clojure.core/declare deser-parsed-input-record-field)

(clojure.core/declare deser-mapping-parameters)

(clojure.core/declare deser-application-restore-type)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-reference-data-source-descriptions)

(clojure.core/declare deser-in-app-table-name)

(clojure.core/declare deser-record-columns)

(clojure.core/declare deser-lambda-output-description)

(clojure.core/declare deser-metrics-level)

(clojure.core/declare deser-object-version)

(clojure.core/declare deser-kinesis-firehose-input-description)

(clojure.core/declare deser-application-snapshot-configuration-description)

(clojure.core/declare deser-record-format-type)

(clojure.core/declare deser-job-plan-description)

(clojure.core/declare deser-reference-data-source-description)

(clojure.core/declare deser-application-description)

(clojure.core/declare deser-parallelism-per-kpu)

(clojure.core/declare deser-source-schema)

(clojure.core/declare deser-input-lambda-processor-description)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-boolean-object)

(clojure.core/declare deser-text-content)

(clojure.core/declare deser-record-row-delimiter)

(clojure.core/declare deser-code-content-type)

(clojure.core/declare deser-snapshot-summaries)

(clojure.core/declare deser-id)

(clojure.core/declare deser-raw-input-record)

(clojure.core/declare deser-configuration-type)

(clojure.core/declare deser-snapshot-name)

(clojure.core/declare deser-property-groups)

(clojure.core/declare deser-bucket-arn)

(clojure.core/declare deser-input-starting-position)

(clojure.core/declare deser-raw-input-records)

(clojure.core/defn- deser-input-processing-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputLambdaProcessorDescription") (clojure.core/assoc :input-lambda-processor-description (deser-input-lambda-processor-description (input "InputLambdaProcessorDescription")))))

(clojure.core/defn- deser-log-stream-arn [input] input)

(clojure.core/defn- deser-cloud-watch-logging-option-description [input] (clojure.core/cond-> {:log-stream-arn (deser-log-stream-arn (input "LogStreamARN"))} (clojure.core/contains? input "CloudWatchLoggingOptionId") (clojure.core/assoc :cloud-watch-logging-option-id (deser-id (input "CloudWatchLoggingOptionId"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-application-detail [input] (clojure.core/cond-> {:application-arn (deser-resource-arn (input "ApplicationARN")), :application-name (deser-application-name (input "ApplicationName")), :runtime-environment (deser-runtime-environment (input "RuntimeEnvironment")), :application-status (deser-application-status (input "ApplicationStatus")), :application-version-id (deser-application-version-id (input "ApplicationVersionId"))} (clojure.core/contains? input "CreateTimestamp") (clojure.core/assoc :create-timestamp (deser-timestamp (input "CreateTimestamp"))) (clojure.core/contains? input "ServiceExecutionRole") (clojure.core/assoc :service-execution-role (deser-role-arn (input "ServiceExecutionRole"))) (clojure.core/contains? input "LastUpdateTimestamp") (clojure.core/assoc :last-update-timestamp (deser-timestamp (input "LastUpdateTimestamp"))) (clojure.core/contains? input "CloudWatchLoggingOptionDescriptions") (clojure.core/assoc :cloud-watch-logging-option-descriptions (deser-cloud-watch-logging-option-descriptions (input "CloudWatchLoggingOptionDescriptions"))) (clojure.core/contains? input "ApplicationConfigurationDescription") (clojure.core/assoc :application-configuration-description (deser-application-configuration-description (input "ApplicationConfigurationDescription"))) (clojure.core/contains? input "ApplicationDescription") (clojure.core/assoc :application-description (deser-application-description (input "ApplicationDescription")))))

(clojure.core/defn- deser-in-app-stream-name [input] input)

(clojure.core/defn- deser-s-3-application-code-location-description [input] (clojure.core/cond-> {:bucket-arn (deser-bucket-arn (input "BucketARN")), :file-key (deser-file-key (input "FileKey"))} (clojure.core/contains? input "ObjectVersion") (clojure.core/assoc :object-version (deser-object-version (input "ObjectVersion")))))

(clojure.core/defn- deser-application-version-id [input] input)

(clojure.core/defn- deser-application-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-summary coll))) input))

(clojure.core/defn- deser-property-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-property-key k) (deser-property-value v)])) input))

(clojure.core/defn- deser-parallelism [input] input)

(clojure.core/defn- deser-parsed-input-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parsed-input-record coll))) input))

(clojure.core/defn- deser-input-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputProcessingConfigurationDescription") (clojure.core/assoc :input-processing-configuration-description (deser-input-processing-configuration-description (input "InputProcessingConfigurationDescription"))) (clojure.core/contains? input "InputId") (clojure.core/assoc :input-id (deser-id (input "InputId"))) (clojure.core/contains? input "InputParallelism") (clojure.core/assoc :input-parallelism (deser-input-parallelism (input "InputParallelism"))) (clojure.core/contains? input "InAppStreamNames") (clojure.core/assoc :in-app-stream-names (deser-in-app-stream-names (input "InAppStreamNames"))) (clojure.core/contains? input "InputStartingPositionConfiguration") (clojure.core/assoc :input-starting-position-configuration (deser-input-starting-position-configuration (input "InputStartingPositionConfiguration"))) (clojure.core/contains? input "NamePrefix") (clojure.core/assoc :name-prefix (deser-in-app-stream-name (input "NamePrefix"))) (clojure.core/contains? input "KinesisStreamsInputDescription") (clojure.core/assoc :kinesis-streams-input-description (deser-kinesis-streams-input-description (input "KinesisStreamsInputDescription"))) (clojure.core/contains? input "InputSchema") (clojure.core/assoc :input-schema (deser-source-schema (input "InputSchema"))) (clojure.core/contains? input "KinesisFirehoseInputDescription") (clojure.core/assoc :kinesis-firehose-input-description (deser-kinesis-firehose-input-description (input "KinesisFirehoseInputDescription")))))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-record-column-mapping [input] input)

(clojure.core/defn- deser-record-format [input] (clojure.core/cond-> {:record-format-type (deser-record-format-type (input "RecordFormatType"))} (clojure.core/contains? input "MappingParameters") (clojure.core/assoc :mapping-parameters (deser-mapping-parameters (input "MappingParameters")))))

(clojure.core/defn- deser-output-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-description coll))) input))

(clojure.core/defn- deser-code-content-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "TextContent") (clojure.core/assoc :text-content (deser-text-content (input "TextContent"))) (clojure.core/contains? input "CodeMD5") (clojure.core/assoc :code-md-5 (deser-code-md-5 (input "CodeMD5"))) (clojure.core/contains? input "CodeSize") (clojure.core/assoc :code-size (deser-code-size (input "CodeSize"))) (clojure.core/contains? input "S3ApplicationCodeLocationDescription") (clojure.core/assoc :s-3-application-code-location-description (deser-s-3-application-code-location-description (input "S3ApplicationCodeLocationDescription")))))

(clojure.core/defn- deser-kinesis-streams-output-description [input] (clojure.core/cond-> {:resource-arn (deser-resource-arn (input "ResourceARN"))} (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-log-level [input] (clojure.core/get {"INFO" :info, "WARN" :warn, "ERROR" :error, "DEBUG" :debug} input))

(clojure.core/defn- deser-output-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "OutputId") (clojure.core/assoc :output-id (deser-id (input "OutputId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-in-app-stream-name (input "Name"))) (clojure.core/contains? input "KinesisStreamsOutputDescription") (clojure.core/assoc :kinesis-streams-output-description (deser-kinesis-streams-output-description (input "KinesisStreamsOutputDescription"))) (clojure.core/contains? input "KinesisFirehoseOutputDescription") (clojure.core/assoc :kinesis-firehose-output-description (deser-kinesis-firehose-output-description (input "KinesisFirehoseOutputDescription"))) (clojure.core/contains? input "LambdaOutputDescription") (clojure.core/assoc :lambda-output-description (deser-lambda-output-description (input "LambdaOutputDescription"))) (clojure.core/contains? input "DestinationSchema") (clojure.core/assoc :destination-schema (deser-destination-schema (input "DestinationSchema")))))

(clojure.core/defn- deser-parsed-input-record [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parsed-input-record-field coll))) input))

(clojure.core/defn- deser-cloud-watch-logging-option-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-watch-logging-option-description coll))) input))

(clojure.core/defn- deser-code-md-5 [input] input)

(clojure.core/defn- deser-flink-application-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "CheckpointConfigurationDescription") (clojure.core/assoc :checkpoint-configuration-description (deser-checkpoint-configuration-description (input "CheckpointConfigurationDescription"))) (clojure.core/contains? input "MonitoringConfigurationDescription") (clojure.core/assoc :monitoring-configuration-description (deser-monitoring-configuration-description (input "MonitoringConfigurationDescription"))) (clojure.core/contains? input "ParallelismConfigurationDescription") (clojure.core/assoc :parallelism-configuration-description (deser-parallelism-configuration-description (input "ParallelismConfigurationDescription"))) (clojure.core/contains? input "JobPlanDescription") (clojure.core/assoc :job-plan-description (deser-job-plan-description (input "JobPlanDescription")))))

(clojure.core/defn- deser-parallelism-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ConfigurationType") (clojure.core/assoc :configuration-type (deser-configuration-type (input "ConfigurationType"))) (clojure.core/contains? input "Parallelism") (clojure.core/assoc :parallelism (deser-parallelism (input "Parallelism"))) (clojure.core/contains? input "ParallelismPerKPU") (clojure.core/assoc :parallelism-per-kpu (deser-parallelism-per-kpu (input "ParallelismPerKPU"))) (clojure.core/contains? input "CurrentParallelism") (clojure.core/assoc :current-parallelism (deser-parallelism (input "CurrentParallelism"))) (clojure.core/contains? input "AutoScalingEnabled") (clojure.core/assoc :auto-scaling-enabled (deser-boolean-object (input "AutoScalingEnabled")))))

(clojure.core/defn- deser-application-code-configuration-description [input] (clojure.core/cond-> {:code-content-type (deser-code-content-type (input "CodeContentType"))} (clojure.core/contains? input "CodeContentDescription") (clojure.core/assoc :code-content-description (deser-code-content-description (input "CodeContentDescription")))))

(clojure.core/defn- deser-csv-mapping-parameters [input] (clojure.core/cond-> {:record-row-delimiter (deser-record-row-delimiter (input "RecordRowDelimiter")), :record-column-delimiter (deser-record-column-delimiter (input "RecordColumnDelimiter"))}))

(clojure.core/defn- deser-property-key [input] input)

(clojure.core/defn- deser-input-parallelism [input] (clojure.core/cond-> {} (clojure.core/contains? input "Count") (clojure.core/assoc :count (deser-input-parallelism-count (input "Count")))))

(clojure.core/defn- deser-application-summary [input] (clojure.core/cond-> {:application-name (deser-application-name (input "ApplicationName")), :application-arn (deser-resource-arn (input "ApplicationARN")), :application-status (deser-application-status (input "ApplicationStatus")), :application-version-id (deser-application-version-id (input "ApplicationVersionId")), :runtime-environment (deser-runtime-environment (input "RuntimeEnvironment"))}))

(clojure.core/defn- deser-record-column-delimiter [input] input)

(clojure.core/defn- deser-in-app-stream-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-in-app-stream-name coll))) input))

(clojure.core/defn- deser-record-column-name [input] input)

(clojure.core/defn- deser-record-row-path [input] input)

(clojure.core/defn- deser-monitoring-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ConfigurationType") (clojure.core/assoc :configuration-type (deser-configuration-type (input "ConfigurationType"))) (clojure.core/contains? input "MetricsLevel") (clojure.core/assoc :metrics-level (deser-metrics-level (input "MetricsLevel"))) (clojure.core/contains? input "LogLevel") (clojure.core/assoc :log-level (deser-log-level (input "LogLevel")))))

(clojure.core/defn- deser-input-parallelism-count [input] input)

(clojure.core/defn- deser-destination-schema [input] (clojure.core/cond-> {:record-format-type (deser-record-format-type (input "RecordFormatType"))}))

(clojure.core/defn- deser-environment-property-descriptions [input] (clojure.core/cond-> {} (clojure.core/contains? input "PropertyGroupDescriptions") (clojure.core/assoc :property-group-descriptions (deser-property-groups (input "PropertyGroupDescriptions")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-kinesis-firehose-output-description [input] (clojure.core/cond-> {:resource-arn (deser-resource-arn (input "ResourceARN"))} (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-processed-input-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-processed-input-record coll))) input))

(clojure.core/defn- deser-application-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "SqlApplicationConfigurationDescription") (clojure.core/assoc :sql-application-configuration-description (deser-sql-application-configuration-description (input "SqlApplicationConfigurationDescription"))) (clojure.core/contains? input "ApplicationCodeConfigurationDescription") (clojure.core/assoc :application-code-configuration-description (deser-application-code-configuration-description (input "ApplicationCodeConfigurationDescription"))) (clojure.core/contains? input "RunConfigurationDescription") (clojure.core/assoc :run-configuration-description (deser-run-configuration-description (input "RunConfigurationDescription"))) (clojure.core/contains? input "FlinkApplicationConfigurationDescription") (clojure.core/assoc :flink-application-configuration-description (deser-flink-application-configuration-description (input "FlinkApplicationConfigurationDescription"))) (clojure.core/contains? input "EnvironmentPropertyDescriptions") (clojure.core/assoc :environment-property-descriptions (deser-environment-property-descriptions (input "EnvironmentPropertyDescriptions"))) (clojure.core/contains? input "ApplicationSnapshotConfigurationDescription") (clojure.core/assoc :application-snapshot-configuration-description (deser-application-snapshot-configuration-description (input "ApplicationSnapshotConfigurationDescription")))))

(clojure.core/defn- deser-json-mapping-parameters [input] (clojure.core/cond-> {:record-row-path (deser-record-row-path (input "RecordRowPath"))}))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-property-value [input] input)

(clojure.core/defn- deser-checkpoint-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ConfigurationType") (clojure.core/assoc :configuration-type (deser-configuration-type (input "ConfigurationType"))) (clojure.core/contains? input "CheckpointingEnabled") (clojure.core/assoc :checkpointing-enabled (deser-boolean-object (input "CheckpointingEnabled"))) (clojure.core/contains? input "CheckpointInterval") (clojure.core/assoc :checkpoint-interval (deser-checkpoint-interval (input "CheckpointInterval"))) (clojure.core/contains? input "MinPauseBetweenCheckpoints") (clojure.core/assoc :min-pause-between-checkpoints (deser-min-pause-between-checkpoints (input "MinPauseBetweenCheckpoints")))))

(clojure.core/defn- deser-record-column [input] (clojure.core/cond-> {:name (deser-record-column-name (input "Name")), :sql-type (deser-record-column-sql-type (input "SqlType"))} (clojure.core/contains? input "Mapping") (clojure.core/assoc :mapping (deser-record-column-mapping (input "Mapping")))))

(clojure.core/defn- deser-min-pause-between-checkpoints [input] input)

(clojure.core/defn- deser-input-starting-position-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputStartingPosition") (clojure.core/assoc :input-starting-position (deser-input-starting-position (input "InputStartingPosition")))))

(clojure.core/defn- deser-snapshot-status [input] (clojure.core/get {"CREATING" :creating, "READY" :ready, "DELETING" :deleting, "FAILED" :failed} input))

(clojure.core/defn- deser-checkpoint-interval [input] input)

(clojure.core/defn- deser-s-3-reference-data-source-description [input] (clojure.core/cond-> {:bucket-arn (deser-bucket-arn (input "BucketARN")), :file-key (deser-file-key (input "FileKey"))} (clojure.core/contains? input "ReferenceRoleARN") (clojure.core/assoc :reference-role-arn (deser-role-arn (input "ReferenceRoleARN")))))

(clojure.core/defn- deser-record-encoding [input] input)

(clojure.core/defn- deser-property-group [input] (clojure.core/cond-> {:property-group-id (deser-id (input "PropertyGroupId")), :property-map (deser-property-map (input "PropertyMap"))}))

(clojure.core/defn- deser-application-status [input] (clojure.core/get {"DELETING" :deleting, "STARTING" :starting, "STOPPING" :stopping, "READY" :ready, "RUNNING" :running, "UPDATING" :updating} input))

(clojure.core/defn- deser-processed-input-record [input] input)

(clojure.core/defn- deser-file-key [input] input)

(clojure.core/defn- deser-run-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ApplicationRestoreConfigurationDescription") (clojure.core/assoc :application-restore-configuration-description (deser-application-restore-configuration (input "ApplicationRestoreConfigurationDescription")))))

(clojure.core/defn- deser-sql-application-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDescriptions") (clojure.core/assoc :input-descriptions (deser-input-descriptions (input "InputDescriptions"))) (clojure.core/contains? input "OutputDescriptions") (clojure.core/assoc :output-descriptions (deser-output-descriptions (input "OutputDescriptions"))) (clojure.core/contains? input "ReferenceDataSourceDescriptions") (clojure.core/assoc :reference-data-source-descriptions (deser-reference-data-source-descriptions (input "ReferenceDataSourceDescriptions")))))

(clojure.core/defn- deser-snapshot-details [input] (clojure.core/cond-> {:snapshot-name (deser-snapshot-name (input "SnapshotName")), :snapshot-status (deser-snapshot-status (input "SnapshotStatus")), :application-version-id (deser-application-version-id (input "ApplicationVersionId"))} (clojure.core/contains? input "SnapshotCreationTimestamp") (clojure.core/assoc :snapshot-creation-timestamp (deser-timestamp (input "SnapshotCreationTimestamp")))))

(clojure.core/defn- deser-application-restore-configuration [input] (clojure.core/cond-> {:application-restore-type (deser-application-restore-type (input "ApplicationRestoreType"))} (clojure.core/contains? input "SnapshotName") (clojure.core/assoc :snapshot-name (deser-snapshot-name (input "SnapshotName")))))

(clojure.core/defn- deser-application-name [input] input)

(clojure.core/defn- deser-input-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-description coll))) input))

(clojure.core/defn- deser-record-column-sql-type [input] input)

(clojure.core/defn- deser-runtime-environment [input] (clojure.core/get {"SQL-1_0" :sql-1-0, "FLINK-1_6" :flink-1-6} input))

(clojure.core/defn- deser-code-size [input] input)

(clojure.core/defn- deser-kinesis-streams-input-description [input] (clojure.core/cond-> {:resource-arn (deser-resource-arn (input "ResourceARN"))} (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-parsed-input-record-field [input] input)

(clojure.core/defn- deser-mapping-parameters [input] (clojure.core/cond-> {} (clojure.core/contains? input "JSONMappingParameters") (clojure.core/assoc :json-mapping-parameters (deser-json-mapping-parameters (input "JSONMappingParameters"))) (clojure.core/contains? input "CSVMappingParameters") (clojure.core/assoc :csv-mapping-parameters (deser-csv-mapping-parameters (input "CSVMappingParameters")))))

(clojure.core/defn- deser-application-restore-type [input] (clojure.core/get {"SKIP_RESTORE_FROM_SNAPSHOT" :skip-restore-from-snapshot, "RESTORE_FROM_LATEST_SNAPSHOT" :restore-from-latest-snapshot, "RESTORE_FROM_CUSTOM_SNAPSHOT" :restore-from-custom-snapshot} input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-reference-data-source-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reference-data-source-description coll))) input))

(clojure.core/defn- deser-in-app-table-name [input] input)

(clojure.core/defn- deser-record-columns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-column coll))) input))

(clojure.core/defn- deser-lambda-output-description [input] (clojure.core/cond-> {:resource-arn (deser-resource-arn (input "ResourceARN"))} (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-metrics-level [input] (clojure.core/get {"APPLICATION" :application, "TASK" :task, "OPERATOR" :operator, "PARALLELISM" :parallelism} input))

(clojure.core/defn- deser-object-version [input] input)

(clojure.core/defn- deser-kinesis-firehose-input-description [input] (clojure.core/cond-> {:resource-arn (deser-resource-arn (input "ResourceARN"))} (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-application-snapshot-configuration-description [input] (clojure.core/cond-> {:snapshots-enabled (deser-boolean-object (input "SnapshotsEnabled"))}))

(clojure.core/defn- deser-record-format-type [input] (clojure.core/get {"JSON" :json, "CSV" :csv} input))

(clojure.core/defn- deser-job-plan-description [input] input)

(clojure.core/defn- deser-reference-data-source-description [input] (clojure.core/cond-> {:reference-id (deser-id (input "ReferenceId")), :table-name (deser-in-app-table-name (input "TableName")), :s-3-reference-data-source-description (deser-s-3-reference-data-source-description (input "S3ReferenceDataSourceDescription"))} (clojure.core/contains? input "ReferenceSchema") (clojure.core/assoc :reference-schema (deser-source-schema (input "ReferenceSchema")))))

(clojure.core/defn- deser-application-description [input] input)

(clojure.core/defn- deser-parallelism-per-kpu [input] input)

(clojure.core/defn- deser-source-schema [input] (clojure.core/cond-> {:record-format (deser-record-format (input "RecordFormat")), :record-columns (deser-record-columns (input "RecordColumns"))} (clojure.core/contains? input "RecordEncoding") (clojure.core/assoc :record-encoding (deser-record-encoding (input "RecordEncoding")))))

(clojure.core/defn- deser-input-lambda-processor-description [input] (clojure.core/cond-> {:resource-arn (deser-resource-arn (input "ResourceARN"))} (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-boolean-object [input] input)

(clojure.core/defn- deser-text-content [input] input)

(clojure.core/defn- deser-record-row-delimiter [input] input)

(clojure.core/defn- deser-code-content-type [input] (clojure.core/get {"PLAINTEXT" :plaintext, "ZIPFILE" :zipfile} input))

(clojure.core/defn- deser-snapshot-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-snapshot-details coll))) input))

(clojure.core/defn- deser-id [input] input)

(clojure.core/defn- deser-raw-input-record [input] input)

(clojure.core/defn- deser-configuration-type [input] (clojure.core/get {"DEFAULT" :default, "CUSTOM" :custom} input))

(clojure.core/defn- deser-snapshot-name [input] input)

(clojure.core/defn- deser-property-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-property-group coll))) input))

(clojure.core/defn- deser-bucket-arn [input] input)

(clojure.core/defn- deser-input-starting-position [input] (clojure.core/get {"NOW" :now, "TRIM_HORIZON" :trim-horizon, "LAST_STOPPED_POINT" :last-stopped-point} input))

(clojure.core/defn- deser-raw-input-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-raw-input-record coll))) input))

(clojure.core/defn- response-add-application-input-response ([input] (response-add-application-input-response nil input)) ([resultWrapper1849741 input] (clojure.core/let [rawinput1849740 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849742 {"ApplicationARN" (rawinput1849740 "ApplicationARN"), "ApplicationVersionId" (rawinput1849740 "ApplicationVersionId"), "InputDescriptions" (rawinput1849740 "InputDescriptions")}] (clojure.core/cond-> {} (letvar1849742 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849742 ["ApplicationARN"]))) (letvar1849742 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849742 ["ApplicationVersionId"]))) (letvar1849742 "InputDescriptions") (clojure.core/assoc :input-descriptions (deser-input-descriptions (clojure.core/get-in letvar1849742 ["InputDescriptions"])))))))

(clojure.core/defn- response-stop-application-response ([input] (response-stop-application-response nil input)) ([resultWrapper1849744 input] (clojure.core/let [rawinput1849743 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849745 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-application-reference-data-source-response ([input] (response-add-application-reference-data-source-response nil input)) ([resultWrapper1849747 input] (clojure.core/let [rawinput1849746 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849748 {"ApplicationARN" (rawinput1849746 "ApplicationARN"), "ApplicationVersionId" (rawinput1849746 "ApplicationVersionId"), "ReferenceDataSourceDescriptions" (rawinput1849746 "ReferenceDataSourceDescriptions")}] (clojure.core/cond-> {} (letvar1849748 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849748 ["ApplicationARN"]))) (letvar1849748 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849748 ["ApplicationVersionId"]))) (letvar1849748 "ReferenceDataSourceDescriptions") (clojure.core/assoc :reference-data-source-descriptions (deser-reference-data-source-descriptions (clojure.core/get-in letvar1849748 ["ReferenceDataSourceDescriptions"])))))))

(clojure.core/defn- response-code-validation-exception ([input] (response-code-validation-exception nil input)) ([resultWrapper1849750 input] (clojure.core/let [rawinput1849749 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849751 {"Message" (rawinput1849749 "Message")}] (clojure.core/cond-> {} (letvar1849751 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849751 ["Message"])))))))

(clojure.core/defn- response-discover-input-schema-response ([input] (response-discover-input-schema-response nil input)) ([resultWrapper1849753 input] (clojure.core/let [rawinput1849752 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849754 {"InputSchema" (rawinput1849752 "InputSchema"), "ParsedInputRecords" (rawinput1849752 "ParsedInputRecords"), "ProcessedInputRecords" (rawinput1849752 "ProcessedInputRecords"), "RawInputRecords" (rawinput1849752 "RawInputRecords")}] (clojure.core/cond-> {} (letvar1849754 "InputSchema") (clojure.core/assoc :input-schema (deser-source-schema (clojure.core/get-in letvar1849754 ["InputSchema"]))) (letvar1849754 "ParsedInputRecords") (clojure.core/assoc :parsed-input-records (deser-parsed-input-records (clojure.core/get-in letvar1849754 ["ParsedInputRecords"]))) (letvar1849754 "ProcessedInputRecords") (clojure.core/assoc :processed-input-records (deser-processed-input-records (clojure.core/get-in letvar1849754 ["ProcessedInputRecords"]))) (letvar1849754 "RawInputRecords") (clojure.core/assoc :raw-input-records (deser-raw-input-records (clojure.core/get-in letvar1849754 ["RawInputRecords"])))))))

(clojure.core/defn- response-unable-to-detect-schema-exception ([input] (response-unable-to-detect-schema-exception nil input)) ([resultWrapper1849756 input] (clojure.core/let [rawinput1849755 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849757 {"Message" (rawinput1849755 "Message"), "RawInputRecords" (rawinput1849755 "RawInputRecords"), "ProcessedInputRecords" (rawinput1849755 "ProcessedInputRecords")}] (clojure.core/cond-> {} (letvar1849757 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849757 ["Message"]))) (letvar1849757 "RawInputRecords") (clojure.core/assoc :raw-input-records (deser-raw-input-records (clojure.core/get-in letvar1849757 ["RawInputRecords"]))) (letvar1849757 "ProcessedInputRecords") (clojure.core/assoc :processed-input-records (deser-processed-input-records (clojure.core/get-in letvar1849757 ["ProcessedInputRecords"])))))))

(clojure.core/defn- response-delete-application-output-response ([input] (response-delete-application-output-response nil input)) ([resultWrapper1849759 input] (clojure.core/let [rawinput1849758 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849760 {"ApplicationARN" (rawinput1849758 "ApplicationARN"), "ApplicationVersionId" (rawinput1849758 "ApplicationVersionId")}] (clojure.core/cond-> {} (letvar1849760 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849760 ["ApplicationARN"]))) (letvar1849760 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849760 ["ApplicationVersionId"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1849762 input] (clojure.core/let [rawinput1849761 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849763 {"Message" (rawinput1849761 "Message")}] (clojure.core/cond-> {} (letvar1849763 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849763 ["Message"])))))))

(clojure.core/defn- response-describe-application-response ([input] (response-describe-application-response nil input)) ([resultWrapper1849765 input] (clojure.core/let [rawinput1849764 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849766 {"ApplicationDetail" (rawinput1849764 "ApplicationDetail")}] (clojure.core/cond-> {:application-detail (deser-application-detail (clojure.core/get-in letvar1849766 ["ApplicationDetail"]))}))))

(clojure.core/defn- response-delete-application-reference-data-source-response ([input] (response-delete-application-reference-data-source-response nil input)) ([resultWrapper1849768 input] (clojure.core/let [rawinput1849767 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849769 {"ApplicationARN" (rawinput1849767 "ApplicationARN"), "ApplicationVersionId" (rawinput1849767 "ApplicationVersionId")}] (clojure.core/cond-> {} (letvar1849769 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849769 ["ApplicationARN"]))) (letvar1849769 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849769 ["ApplicationVersionId"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1849771 input] (clojure.core/let [rawinput1849770 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849772 {"Message" (rawinput1849770 "Message")}] (clojure.core/cond-> {} (letvar1849772 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849772 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1849774 input] (clojure.core/let [rawinput1849773 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849775 {"Message" (rawinput1849773 "Message")}] (clojure.core/cond-> {} (letvar1849775 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849775 ["Message"])))))))

(clojure.core/defn- response-update-application-response ([input] (response-update-application-response nil input)) ([resultWrapper1849777 input] (clojure.core/let [rawinput1849776 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849778 {"ApplicationDetail" (rawinput1849776 "ApplicationDetail")}] (clojure.core/cond-> {:application-detail (deser-application-detail (clojure.core/get-in letvar1849778 ["ApplicationDetail"]))}))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1849780 input] (clojure.core/let [rawinput1849779 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849781 {"Message" (rawinput1849779 "Message")}] (clojure.core/cond-> {} (letvar1849781 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849781 ["Message"])))))))

(clojure.core/defn- response-delete-application-snapshot-response ([input] (response-delete-application-snapshot-response nil input)) ([resultWrapper1849783 input] (clojure.core/let [rawinput1849782 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849784 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-application-snapshot-response ([input] (response-describe-application-snapshot-response nil input)) ([resultWrapper1849786 input] (clojure.core/let [rawinput1849785 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849787 {"SnapshotDetails" (rawinput1849785 "SnapshotDetails")}] (clojure.core/cond-> {:snapshot-details (deser-snapshot-details (clojure.core/get-in letvar1849787 ["SnapshotDetails"]))}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1849789 input] (clojure.core/let [rawinput1849788 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849790 {"Message" (rawinput1849788 "Message")}] (clojure.core/cond-> {} (letvar1849790 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849790 ["Message"])))))))

(clojure.core/defn- response-create-application-snapshot-response ([input] (response-create-application-snapshot-response nil input)) ([resultWrapper1849792 input] (clojure.core/let [rawinput1849791 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849793 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-operation-exception ([input] (response-unsupported-operation-exception nil input)) ([resultWrapper1849795 input] (clojure.core/let [rawinput1849794 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849796 {"Message" (rawinput1849794 "Message")}] (clojure.core/cond-> {} (letvar1849796 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849796 ["Message"])))))))

(clojure.core/defn- response-add-application-input-processing-configuration-response ([input] (response-add-application-input-processing-configuration-response nil input)) ([resultWrapper1849798 input] (clojure.core/let [rawinput1849797 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849799 {"ApplicationARN" (rawinput1849797 "ApplicationARN"), "ApplicationVersionId" (rawinput1849797 "ApplicationVersionId"), "InputId" (rawinput1849797 "InputId"), "InputProcessingConfigurationDescription" (rawinput1849797 "InputProcessingConfigurationDescription")}] (clojure.core/cond-> {} (letvar1849799 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849799 ["ApplicationARN"]))) (letvar1849799 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849799 ["ApplicationVersionId"]))) (letvar1849799 "InputId") (clojure.core/assoc :input-id (deser-id (clojure.core/get-in letvar1849799 ["InputId"]))) (letvar1849799 "InputProcessingConfigurationDescription") (clojure.core/assoc :input-processing-configuration-description (deser-input-processing-configuration-description (clojure.core/get-in letvar1849799 ["InputProcessingConfigurationDescription"])))))))

(clojure.core/defn- response-list-application-snapshots-response ([input] (response-list-application-snapshots-response nil input)) ([resultWrapper1849801 input] (clojure.core/let [rawinput1849800 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849802 {"SnapshotSummaries" (rawinput1849800 "SnapshotSummaries"), "NextToken" (rawinput1849800 "NextToken")}] (clojure.core/cond-> {} (letvar1849802 "SnapshotSummaries") (clojure.core/assoc :snapshot-summaries (deser-snapshot-summaries (clojure.core/get-in letvar1849802 ["SnapshotSummaries"]))) (letvar1849802 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1849802 ["NextToken"])))))))

(clojure.core/defn- response-delete-application-input-processing-configuration-response ([input] (response-delete-application-input-processing-configuration-response nil input)) ([resultWrapper1849804 input] (clojure.core/let [rawinput1849803 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849805 {"ApplicationARN" (rawinput1849803 "ApplicationARN"), "ApplicationVersionId" (rawinput1849803 "ApplicationVersionId")}] (clojure.core/cond-> {} (letvar1849805 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849805 ["ApplicationARN"]))) (letvar1849805 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849805 ["ApplicationVersionId"])))))))

(clojure.core/defn- response-resource-provisioned-throughput-exceeded-exception ([input] (response-resource-provisioned-throughput-exceeded-exception nil input)) ([resultWrapper1849807 input] (clojure.core/let [rawinput1849806 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849808 {"Message" (rawinput1849806 "Message")}] (clojure.core/cond-> {} (letvar1849808 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849808 ["Message"])))))))

(clojure.core/defn- response-add-application-output-response ([input] (response-add-application-output-response nil input)) ([resultWrapper1849810 input] (clojure.core/let [rawinput1849809 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849811 {"ApplicationARN" (rawinput1849809 "ApplicationARN"), "ApplicationVersionId" (rawinput1849809 "ApplicationVersionId"), "OutputDescriptions" (rawinput1849809 "OutputDescriptions")}] (clojure.core/cond-> {} (letvar1849811 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849811 ["ApplicationARN"]))) (letvar1849811 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849811 ["ApplicationVersionId"]))) (letvar1849811 "OutputDescriptions") (clojure.core/assoc :output-descriptions (deser-output-descriptions (clojure.core/get-in letvar1849811 ["OutputDescriptions"])))))))

(clojure.core/defn- response-create-application-response ([input] (response-create-application-response nil input)) ([resultWrapper1849813 input] (clojure.core/let [rawinput1849812 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849814 {"ApplicationDetail" (rawinput1849812 "ApplicationDetail")}] (clojure.core/cond-> {:application-detail (deser-application-detail (clojure.core/get-in letvar1849814 ["ApplicationDetail"]))}))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper1849816 input] (clojure.core/let [rawinput1849815 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849817 {"Message" (rawinput1849815 "Message")}] (clojure.core/cond-> {} (letvar1849817 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849817 ["Message"])))))))

(clojure.core/defn- response-add-application-cloud-watch-logging-option-response ([input] (response-add-application-cloud-watch-logging-option-response nil input)) ([resultWrapper1849819 input] (clojure.core/let [rawinput1849818 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849820 {"ApplicationARN" (rawinput1849818 "ApplicationARN"), "ApplicationVersionId" (rawinput1849818 "ApplicationVersionId"), "CloudWatchLoggingOptionDescriptions" (rawinput1849818 "CloudWatchLoggingOptionDescriptions")}] (clojure.core/cond-> {} (letvar1849820 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849820 ["ApplicationARN"]))) (letvar1849820 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849820 ["ApplicationVersionId"]))) (letvar1849820 "CloudWatchLoggingOptionDescriptions") (clojure.core/assoc :cloud-watch-logging-option-descriptions (deser-cloud-watch-logging-option-descriptions (clojure.core/get-in letvar1849820 ["CloudWatchLoggingOptionDescriptions"])))))))

(clojure.core/defn- response-start-application-response ([input] (response-start-application-response nil input)) ([resultWrapper1849822 input] (clojure.core/let [rawinput1849821 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849823 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-application-response ([input] (response-delete-application-response nil input)) ([resultWrapper1849825 input] (clojure.core/let [rawinput1849824 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849826 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1849828 input] (clojure.core/let [rawinput1849827 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849829 {"Message" (rawinput1849827 "Message")}] (clojure.core/cond-> {} (letvar1849829 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849829 ["Message"])))))))

(clojure.core/defn- response-delete-application-cloud-watch-logging-option-response ([input] (response-delete-application-cloud-watch-logging-option-response nil input)) ([resultWrapper1849831 input] (clojure.core/let [rawinput1849830 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849832 {"ApplicationARN" (rawinput1849830 "ApplicationARN"), "ApplicationVersionId" (rawinput1849830 "ApplicationVersionId"), "CloudWatchLoggingOptionDescriptions" (rawinput1849830 "CloudWatchLoggingOptionDescriptions")}] (clojure.core/cond-> {} (letvar1849832 "ApplicationARN") (clojure.core/assoc :application-arn (deser-resource-arn (clojure.core/get-in letvar1849832 ["ApplicationARN"]))) (letvar1849832 "ApplicationVersionId") (clojure.core/assoc :application-version-id (deser-application-version-id (clojure.core/get-in letvar1849832 ["ApplicationVersionId"]))) (letvar1849832 "CloudWatchLoggingOptionDescriptions") (clojure.core/assoc :cloud-watch-logging-option-descriptions (deser-cloud-watch-logging-option-descriptions (clojure.core/get-in letvar1849832 ["CloudWatchLoggingOptionDescriptions"])))))))

(clojure.core/defn- response-list-applications-response ([input] (response-list-applications-response nil input)) ([resultWrapper1849834 input] (clojure.core/let [rawinput1849833 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849835 {"ApplicationSummaries" (rawinput1849833 "ApplicationSummaries"), "NextToken" (rawinput1849833 "NextToken")}] (clojure.core/cond-> {:application-summaries (deser-application-summaries (clojure.core/get-in letvar1849835 ["ApplicationSummaries"]))} (letvar1849835 "NextToken") (clojure.core/assoc :next-token (deser-application-name (clojure.core/get-in letvar1849835 ["NextToken"])))))))

(clojure.core/defn- response-invalid-application-configuration-exception ([input] (response-invalid-application-configuration-exception nil input)) ([resultWrapper1849837 input] (clojure.core/let [rawinput1849836 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1849838 {"Message" (rawinput1849836 "Message")}] (clojure.core/cond-> {} (letvar1849838 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1849838 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-processing-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/input-lambda-processor-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/stop-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-input-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-input-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.add-application-input-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id :portkey.aws.kinesisanalyticsv2/input-descriptions]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/stop-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-reference-data-source-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-reference-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.add-application-reference-data-source-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id :portkey.aws.kinesisanalyticsv2/reference-data-source-descriptions]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/log-stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.code-validation-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/code-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.code-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.discover-input-schema-response/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/discover-input-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.discover-input-schema-response/input-schema :portkey.aws.kinesisanalyticsv2/parsed-input-records :portkey.aws.kinesisanalyticsv2/processed-input-records :portkey.aws.kinesisanalyticsv2/raw-input-records]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.cloud-watch-logging-option-description/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/log-stream-arn] :opt-un [:portkey.aws.kinesisanalyticsv2.cloud-watch-logging-option-description/cloud-watch-logging-option-id :portkey.aws.kinesisanalyticsv2/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/describe-application-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2/snapshot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-reference-data-source-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-reference-data-source-request/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-reference-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.delete-application-reference-data-source-request/current-application-version-id :portkey.aws.kinesisanalyticsv2.delete-application-reference-data-source-request/reference-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/code-content (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/text-content :portkey.aws.kinesisanalyticsv2/zip-file-content :portkey.aws.kinesisanalyticsv2/s-3-content-location]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-detail/create-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-detail/service-execution-role (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-detail/last-update-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-detail/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.application-detail/application-arn :portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2/runtime-environment :portkey.aws.kinesisanalyticsv2/application-status :portkey.aws.kinesisanalyticsv2/application-version-id] :opt-un [:portkey.aws.kinesisanalyticsv2.application-detail/create-timestamp :portkey.aws.kinesisanalyticsv2.application-detail/service-execution-role :portkey.aws.kinesisanalyticsv2.application-detail/last-update-timestamp :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-descriptions :portkey.aws.kinesisanalyticsv2/application-configuration-description :portkey.aws.kinesisanalyticsv2/application-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/in-app-stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 32)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z][a-zA-Z0-9_]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/log-stream-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/lambda-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.unable-to-detect-schema-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/unable-to-detect-schema-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.unable-to-detect-schema-exception/message :portkey.aws.kinesisanalyticsv2/raw-input-records :portkey.aws.kinesisanalyticsv2/processed-input-records]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/s-3-application-code-location-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/bucket-arn :portkey.aws.kinesisanalyticsv2/file-key] :opt-un [:portkey.aws.kinesisanalyticsv2/object-version]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.list-application-snapshots-request/limit (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/list-snapshots-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/list-application-snapshots-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name] :opt-un [:portkey.aws.kinesisanalyticsv2.list-application-snapshots-request/limit :portkey.aws.kinesisanalyticsv2/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.kinesis-firehose-input-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-firehose-input-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.kinesis-firehose-input-update/resource-arn-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-version-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.kinesis-streams-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-streams-output-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.kinesis-streams-output-update/resource-arn-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-output-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-output-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.delete-application-output-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-summaries (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/application-summary))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/sql-application-configuration-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/input-updates :portkey.aws.kinesisanalyticsv2/output-updates :portkey.aws.kinesisanalyticsv2/reference-data-source-updates]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/property-map (clojure.spec.alpha/map-of :portkey.aws.kinesisanalyticsv2/property-key :portkey.aws.kinesisanalyticsv2/property-value))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-output-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-output-request/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.delete-application-output-request/current-application-version-id :portkey.aws.kinesisanalyticsv2.delete-application-output-request/output-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/parallelism (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-output-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.add-application-output-request/current-application-version-id :portkey.aws.kinesisanalyticsv2/output] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.create-application-request/service-execution-role (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/create-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2/runtime-environment :portkey.aws.kinesisanalyticsv2.create-application-request/service-execution-role] :opt-un [:portkey.aws.kinesisanalyticsv2/application-description :portkey.aws.kinesisanalyticsv2/application-configuration :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-options]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/parsed-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/parsed-input-record))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-description/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-description/name-prefix (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-description/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/input-processing-configuration-description :portkey.aws.kinesisanalyticsv2.input-description/input-id :portkey.aws.kinesisanalyticsv2/input-parallelism :portkey.aws.kinesisanalyticsv2/in-app-stream-names :portkey.aws.kinesisanalyticsv2/input-starting-position-configuration :portkey.aws.kinesisanalyticsv2.input-description/name-prefix :portkey.aws.kinesisanalyticsv2/kinesis-streams-input-description :portkey.aws.kinesisanalyticsv2.input-description/input-schema :portkey.aws.kinesisanalyticsv2/kinesis-firehose-input-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-update/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-update/name-prefix-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.input-update/input-id] :opt-un [:portkey.aws.kinesisanalyticsv2.input-update/name-prefix-update :portkey.aws.kinesisanalyticsv2/input-processing-configuration-update :portkey.aws.kinesisanalyticsv2/kinesis-streams-input-update :portkey.aws.kinesisanalyticsv2/kinesis-firehose-input-update :portkey.aws.kinesisanalyticsv2/input-schema-update :portkey.aws.kinesisanalyticsv2/input-parallelism-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-column-mapping (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-code-configuration-update/code-content-type-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/code-content-type))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-code-configuration-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.application-code-configuration-update/code-content-type-update :portkey.aws.kinesisanalyticsv2/code-content-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-format (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/record-format-type] :opt-un [:portkey.aws.kinesisanalyticsv2/mapping-parameters]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/output-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/output-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/code-content-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/text-content :portkey.aws.kinesisanalyticsv2/code-md-5 :portkey.aws.kinesisanalyticsv2/code-size :portkey.aws.kinesisanalyticsv2/s-3-application-code-location-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-streams-output-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un [:portkey.aws.kinesisanalyticsv2/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/log-level #{:warn "WARN" :debug "ERROR" "DEBUG" :info :error "INFO"})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/start-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2/run-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.output-description/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.output-description/name (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.output-description/output-id :portkey.aws.kinesisanalyticsv2.output-description/name :portkey.aws.kinesisanalyticsv2/kinesis-streams-output-description :portkey.aws.kinesisanalyticsv2/kinesis-firehose-output-description :portkey.aws.kinesisanalyticsv2/lambda-output-description :portkey.aws.kinesisanalyticsv2/destination-schema]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/parsed-input-record (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/parsed-input-record-field))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/flink-application-configuration-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/checkpoint-configuration-update :portkey.aws.kinesisanalyticsv2/monitoring-configuration-update :portkey.aws.kinesisanalyticsv2/parallelism-configuration-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/code-md-5 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 128 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/flink-application-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/checkpoint-configuration-description :portkey.aws.kinesisanalyticsv2/monitoring-configuration-description :portkey.aws.kinesisanalyticsv2/parallelism-configuration-description :portkey.aws.kinesisanalyticsv2/job-plan-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.parallelism-configuration-description/current-parallelism (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/parallelism))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.parallelism-configuration-description/auto-scaling-enabled (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/parallelism-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/configuration-type :portkey.aws.kinesisanalyticsv2/parallelism :portkey.aws.kinesisanalyticsv2/parallelism-per-kpu :portkey.aws.kinesisanalyticsv2.parallelism-configuration-description/current-parallelism :portkey.aws.kinesisanalyticsv2.parallelism-configuration-description/auto-scaling-enabled]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/create-application-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2/snapshot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/describe-application-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-detail] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/reference-data-sources (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/reference-data-source))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-code-configuration-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/code-content-type] :opt-un [:portkey.aws.kinesisanalyticsv2/code-content-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.cloud-watch-logging-option-update/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.cloud-watch-logging-option-update/log-stream-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/log-stream-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.cloud-watch-logging-option-update/cloud-watch-logging-option-id] :opt-un [:portkey.aws.kinesisanalyticsv2.cloud-watch-logging-option-update/log-stream-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-parallelism-update/count-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/input-parallelism-count))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-parallelism-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.input-parallelism-update/count-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-code-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/code-content-type] :opt-un [:portkey.aws.kinesisanalyticsv2/code-content]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/run-configuration-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/application-restore-configuration]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/sql-run-configurations (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/sql-run-configuration))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.reference-data-source/table-name (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.reference-data-source/reference-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/reference-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.reference-data-source/table-name :portkey.aws.kinesisanalyticsv2.reference-data-source/reference-schema] :opt-un [:portkey.aws.kinesisanalyticsv2/s-3-reference-data-source]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-cloud-watch-logging-option-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-cloud-watch-logging-option-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.add-application-cloud-watch-logging-option-request/current-application-version-id :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-reference-data-source-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-reference-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.delete-application-reference-data-source-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/csv-mapping-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/record-row-delimiter :portkey.aws.kinesisanalyticsv2/record-column-delimiter] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/property-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.discover-input-schema-request/service-execution-role (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/discover-input-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.discover-input-schema-request/service-execution-role] :opt-un [:portkey.aws.kinesisanalyticsv2/resource-arn :portkey.aws.kinesisanalyticsv2/input-starting-position-configuration :portkey.aws.kinesisanalyticsv2/s-3-configuration :portkey.aws.kinesisanalyticsv2/input-processing-configuration]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.s-3-content-location-update/bucket-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/bucket-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.s-3-content-location-update/file-key-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/file-key))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.s-3-content-location-update/object-version-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/object-version))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/s-3-content-location-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.s-3-content-location-update/bucket-arn-update :portkey.aws.kinesisanalyticsv2.s-3-content-location-update/file-key-update :portkey.aws.kinesisanalyticsv2.s-3-content-location-update/object-version-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-parallelism/count (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/input-parallelism-count))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-parallelism (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.input-parallelism/count]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.monitoring-configuration-update/configuration-type-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/configuration-type))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.monitoring-configuration-update/metrics-level-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/metrics-level))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.monitoring-configuration-update/log-level-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/log-level))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/monitoring-configuration-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.monitoring-configuration-update/configuration-type-update :portkey.aws.kinesisanalyticsv2.monitoring-configuration-update/metrics-level-update :portkey.aws.kinesisanalyticsv2.monitoring-configuration-update/log-level-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-summary/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.application-summary/application-arn :portkey.aws.kinesisanalyticsv2/application-status :portkey.aws.kinesisanalyticsv2/application-version-id :portkey.aws.kinesisanalyticsv2/runtime-environment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/sql-application-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/inputs :portkey.aws.kinesisanalyticsv2/outputs :portkey.aws.kinesisanalyticsv2/reference-data-sources]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-column-delimiter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/update-application-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-detail] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/in-app-stream-names (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/in-app-stream-name))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-snapshot-request/snapshot-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2/snapshot-name :portkey.aws.kinesisanalyticsv2.delete-application-snapshot-request/snapshot-creation-timestamp] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-column-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-row-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/monitoring-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/configuration-type :portkey.aws.kinesisanalyticsv2/metrics-level :portkey.aws.kinesisanalyticsv2/log-level]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-parallelism-count (clojure.spec.alpha/int-in 1 64))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/s-3-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/bucket-arn :portkey.aws.kinesisanalyticsv2/file-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/s-3-reference-data-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/bucket-arn :portkey.aws.kinesisanalyticsv2/file-key]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-snapshot-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/destination-schema (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/record-format-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/outputs (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/output))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.environment-property-descriptions/property-group-descriptions (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/property-groups))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/environment-property-descriptions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.environment-property-descriptions/property-group-descriptions]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/environment-properties (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/property-groups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-input-processing-configuration-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-input-processing-configuration-request/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-input-processing-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.delete-application-input-processing-configuration-request/current-application-version-id :portkey.aws.kinesisanalyticsv2.delete-application-input-processing-configuration-request/input-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-firehose-output-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un [:portkey.aws.kinesisanalyticsv2/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/processed-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/processed-input-record))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/sql-application-configuration-description :portkey.aws.kinesisanalyticsv2/application-code-configuration-description :portkey.aws.kinesisanalyticsv2/run-configuration-description :portkey.aws.kinesisanalyticsv2/flink-application-configuration-description :portkey.aws.kinesisanalyticsv2/environment-property-descriptions :portkey.aws.kinesisanalyticsv2/application-snapshot-configuration-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/json-mapping-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/record-row-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/property-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-description/checkpointing-enabled (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/checkpoint-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/configuration-type :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-description/checkpointing-enabled :portkey.aws.kinesisanalyticsv2/checkpoint-interval :portkey.aws.kinesisanalyticsv2/min-pause-between-checkpoints]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.parallelism-configuration-update/configuration-type-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/configuration-type))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.parallelism-configuration-update/parallelism-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/parallelism))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.parallelism-configuration-update/parallelism-per-kpu-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/parallelism-per-kpu))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.parallelism-configuration-update/auto-scaling-enabled-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/parallelism-configuration-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.parallelism-configuration-update/configuration-type-update :portkey.aws.kinesisanalyticsv2.parallelism-configuration-update/parallelism-update :portkey.aws.kinesisanalyticsv2.parallelism-configuration-update/parallelism-per-kpu-update :portkey.aws.kinesisanalyticsv2.parallelism-configuration-update/auto-scaling-enabled-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-options (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.record-column/name (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/record-column-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.record-column/mapping (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/record-column-mapping))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.record-column/sql-type (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/record-column-sql-type))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-column (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.record-column/name :portkey.aws.kinesisanalyticsv2.record-column/sql-type] :opt-un [:portkey.aws.kinesisanalyticsv2.record-column/mapping]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-lambda-processor-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-lambda-processor-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.input-lambda-processor-update/resource-arn-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/min-pause-between-checkpoints clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-starting-position-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/input-starting-position]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/run-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/sql-run-configurations :portkey.aws.kinesisanalyticsv2/application-restore-configuration]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/snapshot-status #{:ready :creating "READY" :deleting "DELETING" "CREATING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/checkpoint-interval clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/s-3-content-location (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/bucket-arn :portkey.aws.kinesisanalyticsv2/file-key] :opt-un [:portkey.aws.kinesisanalyticsv2/object-version]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.s-3-reference-data-source-description/reference-role-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/s-3-reference-data-source-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/bucket-arn :portkey.aws.kinesisanalyticsv2/file-key] :opt-un [:portkey.aws.kinesisanalyticsv2.s-3-reference-data-source-description/reference-role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-encoding (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"UTF-8" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.property-group/property-group-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/property-group (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.property-group/property-group-id :portkey.aws.kinesisanalyticsv2/property-map] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-status #{:ready :starting "UPDATING" "READY" :deleting :running :stopping "STARTING" "DELETING" :updating "STOPPING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/describe-application-snapshot-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/snapshot-details] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/create-application-snapshot-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.reference-data-source-update/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.reference-data-source-update/table-name-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.reference-data-source-update/reference-schema-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/reference-data-source-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.reference-data-source-update/reference-id] :opt-un [:portkey.aws.kinesisanalyticsv2.reference-data-source-update/table-name-update :portkey.aws.kinesisanalyticsv2/s-3-reference-data-source-update :portkey.aws.kinesisanalyticsv2.reference-data-source-update/reference-schema-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.unsupported-operation-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.unsupported-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/inputs (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/input))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-input-processing-configuration-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-input-processing-configuration-response/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-input-processing-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.add-application-input-processing-configuration-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id :portkey.aws.kinesisanalyticsv2.add-application-input-processing-configuration-response/input-id :portkey.aws.kinesisanalyticsv2/input-processing-configuration-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/zip-file-content clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/processed-input-record (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/list-applications-input-limit (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.kinesis-streams-input-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-streams-input-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.kinesis-streams-input-update/resource-arn-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/file-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input/name-prefix (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.input/name-prefix :portkey.aws.kinesisanalyticsv2.input/input-schema] :opt-un [:portkey.aws.kinesisanalyticsv2/input-processing-configuration :portkey.aws.kinesisanalyticsv2/kinesis-streams-input :portkey.aws.kinesisanalyticsv2/kinesis-firehose-input :portkey.aws.kinesisanalyticsv2/input-parallelism]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.run-configuration-description/application-restore-configuration-description (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-restore-configuration))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/run-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.run-configuration-description/application-restore-configuration-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.code-content-update/text-content-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/text-content))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.code-content-update/zip-file-content-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/zip-file-content))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/code-content-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.code-content-update/text-content-update :portkey.aws.kinesisanalyticsv2.code-content-update/zip-file-content-update :portkey.aws.kinesisanalyticsv2/s-3-content-location-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-snapshot-configuration-update/snapshots-enabled-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-snapshot-configuration-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.application-snapshot-configuration-update/snapshots-enabled-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/sql-application-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/input-descriptions :portkey.aws.kinesisanalyticsv2/output-descriptions :portkey.aws.kinesisanalyticsv2/reference-data-source-descriptions]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.snapshot-details/snapshot-creation-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/snapshot-details (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/snapshot-name :portkey.aws.kinesisanalyticsv2/snapshot-status :portkey.aws.kinesisanalyticsv2/application-version-id] :opt-un [:portkey.aws.kinesisanalyticsv2.snapshot-details/snapshot-creation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-restore-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-restore-type] :opt-un [:portkey.aws.kinesisanalyticsv2/snapshot-name]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/list-application-snapshots-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/snapshot-summaries :portkey.aws.kinesisanalyticsv2/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/input-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-input-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-input-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.add-application-input-request/current-application-version-id :portkey.aws.kinesisanalyticsv2/input] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-input-processing-configuration-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-input-processing-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.delete-application-input-processing-configuration-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.resource-provisioned-throughput-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/resource-provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.resource-provisioned-throughput-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.list-applications-request/limit (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/list-applications-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.list-applications-request/next-token (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/list-applications-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.list-applications-request/limit :portkey.aws.kinesisanalyticsv2.list-applications-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-update/configuration-type-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/configuration-type))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-update/checkpointing-enabled-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-update/checkpoint-interval-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/checkpoint-interval))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-update/min-pause-between-checkpoints-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/min-pause-between-checkpoints))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/checkpoint-configuration-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.checkpoint-configuration-update/configuration-type-update :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-update/checkpointing-enabled-update :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-update/checkpoint-interval-update :portkey.aws.kinesisanalyticsv2.checkpoint-configuration-update/min-pause-between-checkpoints-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-output-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-output-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.add-application-output-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id :portkey.aws.kinesisanalyticsv2/output-descriptions]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-column-sql-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-firehose-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/runtime-environment #{:sql-1-0 "FLINK-1_6" "SQL-1_0" :flink-1-6})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/create-application-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-detail] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.s-3-reference-data-source-update/bucket-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/bucket-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.s-3-reference-data-source-update/file-key-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/file-key))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/s-3-reference-data-source-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.s-3-reference-data-source-update/bucket-arn-update :portkey.aws.kinesisanalyticsv2.s-3-reference-data-source-update/file-key-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.output-update/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.output-update/name-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.output-update/destination-schema-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/destination-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/output-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.output-update/output-id] :opt-un [:portkey.aws.kinesisanalyticsv2.output-update/name-update :portkey.aws.kinesisanalyticsv2/kinesis-streams-output-update :portkey.aws.kinesisanalyticsv2/kinesis-firehose-output-update :portkey.aws.kinesisanalyticsv2/lambda-output-update :portkey.aws.kinesisanalyticsv2.output-update/destination-schema-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-cloud-watch-logging-option-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-cloud-watch-logging-option-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.add-application-cloud-watch-logging-option-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-descriptions]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.sql-run-configuration/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/sql-run-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.sql-run-configuration/input-id :portkey.aws.kinesisanalyticsv2/input-starting-position-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-snapshot-configuration/snapshots-enabled (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-snapshot-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.application-snapshot-configuration/snapshots-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/code-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-streams-input-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un [:portkey.aws.kinesisanalyticsv2/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-reference-data-source-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-reference-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.add-application-reference-data-source-request/current-application-version-id :portkey.aws.kinesisanalyticsv2/reference-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/parsed-input-record-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-processing-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/input-lambda-processor] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/mapping-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/json-mapping-parameters :portkey.aws.kinesisanalyticsv2/csv-mapping-parameters]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-restore-type #{:skip-restore-from-snapshot :restore-from-custom-snapshot "SKIP_RESTORE_FROM_SNAPSHOT" "RESTORE_FROM_CUSTOM_SNAPSHOT" "RESTORE_FROM_LATEST_SNAPSHOT" :restore-from-latest-snapshot})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-request/create-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.delete-application-request/create-timestamp] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-cloud-watch-logging-option-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-cloud-watch-logging-option-request/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-cloud-watch-logging-option-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.delete-application-cloud-watch-logging-option-request/current-application-version-id :portkey.aws.kinesisanalyticsv2.delete-application-cloud-watch-logging-option-request/cloud-watch-logging-option-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/monitoring-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/configuration-type] :opt-un [:portkey.aws.kinesisanalyticsv2/metrics-level :portkey.aws.kinesisanalyticsv2/log-level]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/reference-data-source-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/reference-data-source-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-input-processing-configuration-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.add-application-input-processing-configuration-request/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/add-application-input-processing-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.add-application-input-processing-configuration-request/current-application-version-id :portkey.aws.kinesisanalyticsv2.add-application-input-processing-configuration-request/input-id :portkey.aws.kinesisanalyticsv2/input-processing-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-firehose-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/in-app-table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 32)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z][a-zA-Z0-9_]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/start-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-columns (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/record-column :min-count 1 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-lambda-processor (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-schema-update/record-format-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/record-format))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-schema-update/record-encoding-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/record-encoding))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.input-schema-update/record-column-updates (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/record-columns))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-schema-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.input-schema-update/record-format-update :portkey.aws.kinesisanalyticsv2.input-schema-update/record-encoding-update :portkey.aws.kinesisanalyticsv2.input-schema-update/record-column-updates]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.checkpoint-configuration/checkpointing-enabled (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/checkpoint-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/configuration-type] :opt-un [:portkey.aws.kinesisanalyticsv2.checkpoint-configuration/checkpointing-enabled :portkey.aws.kinesisanalyticsv2/checkpoint-interval :portkey.aws.kinesisanalyticsv2/min-pause-between-checkpoints]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/lambda-output-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un [:portkey.aws.kinesisanalyticsv2/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/metrics-level #{:parallelism "OPERATOR" :task :application "TASK" "APPLICATION" :operator "PARALLELISM"})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.output/name (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.output/name :portkey.aws.kinesisanalyticsv2/destination-schema] :opt-un [:portkey.aws.kinesisanalyticsv2/kinesis-streams-output :portkey.aws.kinesisanalyticsv2/kinesis-firehose-output :portkey.aws.kinesisanalyticsv2/lambda-output]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/environment-property-updates (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/property-groups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/object-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-firehose-input-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un [:portkey.aws.kinesisanalyticsv2/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-code-configuration] :opt-un [:portkey.aws.kinesisanalyticsv2/sql-application-configuration :portkey.aws.kinesisanalyticsv2/flink-application-configuration :portkey.aws.kinesisanalyticsv2/environment-properties :portkey.aws.kinesisanalyticsv2/application-snapshot-configuration]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.delete-application-cloud-watch-logging-option-response/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/delete-application-cloud-watch-logging-option-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.delete-application-cloud-watch-logging-option-response/application-arn :portkey.aws.kinesisanalyticsv2/application-version-id :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-descriptions]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.application-snapshot-configuration-description/snapshots-enabled (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-snapshot-configuration-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.application-snapshot-configuration-description/snapshots-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.lambda-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/lambda-output-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.lambda-output-update/resource-arn-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-format-type #{"CSV" :csv "JSON" :json})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/job-plan-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.reference-data-source-description/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.reference-data-source-description/table-name (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.reference-data-source-description/reference-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/reference-data-source-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.reference-data-source-description/reference-id :portkey.aws.kinesisanalyticsv2.reference-data-source-description/table-name :portkey.aws.kinesisanalyticsv2/s-3-reference-data-source-description] :opt-un [:portkey.aws.kinesisanalyticsv2.reference-data-source-description/reference-schema]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/list-snapshots-input-limit (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/parallelism-per-kpu (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/source-schema (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/record-format :portkey.aws.kinesisanalyticsv2/record-columns] :opt-un [:portkey.aws.kinesisanalyticsv2/record-encoding]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/application-configuration-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/sql-application-configuration-update :portkey.aws.kinesisanalyticsv2/application-code-configuration-update :portkey.aws.kinesisanalyticsv2/flink-application-configuration-update :portkey.aws.kinesisanalyticsv2/environment-property-updates :portkey.aws.kinesisanalyticsv2/application-snapshot-configuration-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-lambda-processor-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un [:portkey.aws.kinesisanalyticsv2/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/flink-application-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2/checkpoint-configuration :portkey.aws.kinesisanalyticsv2/monitoring-configuration :portkey.aws.kinesisanalyticsv2/parallelism-configuration]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/input-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.parallelism-configuration/auto-scaling-enabled (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/parallelism-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/configuration-type] :opt-un [:portkey.aws.kinesisanalyticsv2/parallelism :portkey.aws.kinesisanalyticsv2/parallelism-per-kpu :portkey.aws.kinesisanalyticsv2.parallelism-configuration/auto-scaling-enabled]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/text-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 102400))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-streams-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/record-row-delimiter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/code-content-type #{:zipfile "ZIPFILE" :plaintext "PLAINTEXT"})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.list-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/list-applications-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-summaries] :opt-un [:portkey.aws.kinesisanalyticsv2.list-applications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/snapshot-summaries (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/snapshot-details))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.update-application-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.update-application-request/service-execution-role-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/update-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name :portkey.aws.kinesisanalyticsv2.update-application-request/current-application-version-id] :opt-un [:portkey.aws.kinesisanalyticsv2/application-configuration-update :portkey.aws.kinesisanalyticsv2.update-application-request/service-execution-role-update :portkey.aws.kinesisanalyticsv2/run-configuration-update :portkey.aws.kinesisanalyticsv2/cloud-watch-logging-option-updates]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 50)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/raw-input-record (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-streams-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/configuration-type #{"CUSTOM" :default :custom "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-processing-configuration-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/input-lambda-processor-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.kinesis-firehose-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/kinesis-firehose-output-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2.kinesis-firehose-output-update/resource-arn-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/snapshot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/output-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/output-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.invalid-application-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/invalid-application-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalyticsv2.invalid-application-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/property-groups (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/property-group :max-count 50))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2.describe-application-request/include-additional-details (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/describe-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalyticsv2/application-name] :opt-un [:portkey.aws.kinesisanalyticsv2.describe-application-request/include-additional-details]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/reference-data-source-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/reference-data-source-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/bucket-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/input-starting-position #{"NOW" "TRIM_HORIZON" :now "LAST_STOPPED_POINT" :last-stopped-point :trim-horizon})

(clojure.spec.alpha/def :portkey.aws.kinesisanalyticsv2/raw-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalyticsv2/raw-input-record))

(clojure.core/defn list-applications "Returns a list of Amazon Kinesis Data Analytics applications in your account.\nFor each application, the response includes the application name, Amazon\nResource Name (ARN), and status.\n If you want detailed information about a specific application, use\nDescribeApplication." ([] (list-applications {})) ([list-applications-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-applications-request list-applications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/list-applications-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/list-applications-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApplications", :http.request.configuration/output-deser-fn response-list-applications-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-applications :args (clojure.spec.alpha/? :portkey.aws.kinesisanalyticsv2/list-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/list-applications-response))

(clojure.core/defn delete-application-output "Deletes the output destination configuration from your SQL-based Amazon Kinesis\nData Analytics application's configuration. Kinesis Data Analytics will no\nlonger write data from the corresponding in-application stream to the external\noutput destination." ([delete-application-output-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-application-output-request delete-application-output-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/delete-application-output-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/delete-application-output-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationOutput", :http.request.configuration/output-deser-fn response-delete-application-output-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-application-output :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/delete-application-output-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/delete-application-output-response))

(clojure.core/defn stop-application "Stops the application from processing data. You can stop an application only if\nit is in the running state. You can use the DescribeApplication operation to\nfind the application state." ([stop-application-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-application-request stop-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/stop-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/stop-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopApplication", :http.request.configuration/output-deser-fn response-stop-application-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef stop-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/stop-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/stop-application-response))

(clojure.core/defn delete-application-reference-data-source "Deletes a reference data source configuration from the specified SQL-based\nAmazon Kinesis Data Analytics application's configuration.\n If the application is running, Kinesis Data Analytics immediately removes the\nin-application table that you created using the\nAddApplicationReferenceDataSource operation." ([delete-application-reference-data-source-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-application-reference-data-source-request delete-application-reference-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/delete-application-reference-data-source-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/delete-application-reference-data-source-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationReferenceDataSource", :http.request.configuration/output-deser-fn response-delete-application-reference-data-source-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-application-reference-data-source :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/delete-application-reference-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/delete-application-reference-data-source-response))

(clojure.core/defn delete-application "Deletes the specified application. Kinesis Data Analytics halts application\nexecution and deletes the application." ([delete-application-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-application-request delete-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/delete-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/delete-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplication", :http.request.configuration/output-deser-fn response-delete-application-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/delete-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/delete-application-response))

(clojure.core/defn delete-application-cloud-watch-logging-option "Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics\napplication." ([delete-application-cloud-watch-logging-option-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-application-cloud-watch-logging-option-request delete-application-cloud-watch-logging-option-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/delete-application-cloud-watch-logging-option-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/delete-application-cloud-watch-logging-option-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationCloudWatchLoggingOption", :http.request.configuration/output-deser-fn response-delete-application-cloud-watch-logging-option-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-application-cloud-watch-logging-option :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/delete-application-cloud-watch-logging-option-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/delete-application-cloud-watch-logging-option-response))

(clojure.core/defn describe-application "Returns information about a specific Amazon Kinesis Data Analytics application.\n If you want to retrieve a list of all applications in your account, use the\nListApplications operation." ([describe-application-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-application-request describe-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/describe-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/describe-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeApplication", :http.request.configuration/output-deser-fn response-describe-application-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/describe-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/describe-application-response))

(clojure.core/defn delete-application-snapshot "Deletes a snapshot of application state." ([delete-application-snapshot-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-application-snapshot-request delete-application-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/delete-application-snapshot-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/delete-application-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationSnapshot", :http.request.configuration/output-deser-fn response-delete-application-snapshot-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalyticsv2/unsupported-operation-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-application-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/delete-application-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/delete-application-snapshot-response))

(clojure.core/defn add-application-input-processing-configuration "Adds an InputProcessingConfiguration to an SQL-based Kinesis Data Analytics\napplication. An input processor pre-processes records on the input stream before\nthe application's SQL code executes. Currently, the only input processor\navailable is AWS Lambda (https://aws.amazon.com/documentation/lambda/)." ([add-application-input-processing-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-application-input-processing-configuration-request add-application-input-processing-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/add-application-input-processing-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/add-application-input-processing-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationInputProcessingConfiguration", :http.request.configuration/output-deser-fn response-add-application-input-processing-configuration-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-application-input-processing-configuration :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/add-application-input-processing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/add-application-input-processing-configuration-response))

(clojure.core/defn add-application-reference-data-source "Adds a reference data source to an existing SQL-based Amazon Kinesis Data\nAnalytics application.\n Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and\ncreates an in-application table within your application. In the request, you\nprovide the source (S3 bucket name and object key name), name of the\nin-application table to create, and the necessary mapping information that\ndescribes how data in an Amazon S3 object maps to columns in the resulting\nin-application table." ([add-application-reference-data-source-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-application-reference-data-source-request add-application-reference-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/add-application-reference-data-source-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/add-application-reference-data-source-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationReferenceDataSource", :http.request.configuration/output-deser-fn response-add-application-reference-data-source-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-application-reference-data-source :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/add-application-reference-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/add-application-reference-data-source-response))

(clojure.core/defn describe-application-snapshot "Returns information about a snapshot of application state data." ([describe-application-snapshot-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-application-snapshot-request describe-application-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/describe-application-snapshot-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/describe-application-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeApplicationSnapshot", :http.request.configuration/output-deser-fn response-describe-application-snapshot-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalyticsv2/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef describe-application-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/describe-application-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/describe-application-snapshot-response))

(clojure.core/defn update-application "Updates an existing Amazon Kinesis Data Analytics application. Using this\noperation, you can update application code, input configuration, and output\nconfiguration.\n Kinesis Data Analytics updates the ApplicationVersionId each time you update\nyour application.\n SQL is not enabled for this private beta. Using SQL parameters (such as\nSqlApplicationConfigurationUpdate) will result in an error." ([update-application-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-application-request update-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/update-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/update-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateApplication", :http.request.configuration/output-deser-fn response-update-application-response, :http.request.spec/error-spec {"CodeValidationException" :portkey.aws.kinesisanalyticsv2/code-validation-exception, "ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/update-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/update-application-response))

(clojure.core/defn add-application-cloud-watch-logging-option "Adds an Amazon CloudWatch log stream to monitor application configuration\nerrors." ([add-application-cloud-watch-logging-option-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-application-cloud-watch-logging-option-request add-application-cloud-watch-logging-option-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/add-application-cloud-watch-logging-option-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/add-application-cloud-watch-logging-option-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationCloudWatchLoggingOption", :http.request.configuration/output-deser-fn response-add-application-cloud-watch-logging-option-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-application-cloud-watch-logging-option :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/add-application-cloud-watch-logging-option-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/add-application-cloud-watch-logging-option-response))

(clojure.core/defn create-application "Creates an Amazon Kinesis Data Analytics application. For information about\ncreating a Kinesis Data Analytics application, see Creating an Application\n(https://docs.aws.amazon.com/kinesisanalytics/latest/Java/creating-app.html).\n SQL is not enabled for this private beta release. Using SQL parameters (such as\nSqlApplicationConfiguration) will result in an error." ([create-application-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-application-request create-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/create-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/create-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApplication", :http.request.configuration/output-deser-fn response-create-application-response, :http.request.spec/error-spec {"CodeValidationException" :portkey.aws.kinesisanalyticsv2/code-validation-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesisanalyticsv2/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/create-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/create-application-response))

(clojure.core/defn add-application-input " Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics\napplication.\n You can add a streaming source when you create an application, or you can use\nthis operation to add a streaming source after you create an application. For\nmore information, see CreateApplication.\n Any configuration update, including adding a streaming source using this\noperation, results in a new version of the application. You can use the\nDescribeApplication operation to find the current application version." ([add-application-input-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-application-input-request add-application-input-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/add-application-input-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/add-application-input-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationInput", :http.request.configuration/output-deser-fn response-add-application-input-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "CodeValidationException" :portkey.aws.kinesisanalyticsv2/code-validation-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-application-input :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/add-application-input-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/add-application-input-response))

(clojure.core/defn add-application-output "Adds an external destination to your SQL-based Amazon Kinesis Data Analytics\napplication.\n If you want Kinesis Data Analytics to deliver data from an in-application\nstream within your application to an external destination (such as an Kinesis\ndata stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda\nfunction), you add the relevant configuration to your application using this\noperation. You can configure one or more outputs for your application. Each\noutput configuration maps an in-application stream and an external destination.\n You can use one of the output configurations to deliver data from your\nin-application error stream to an external destination so that you can analyze\nthe errors.\n Any configuration update, including adding a streaming source using this\noperation, results in a new version of the application. You can use the\nDescribeApplication operation to find the current application version." ([add-application-output-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-application-output-request add-application-output-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/add-application-output-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/add-application-output-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationOutput", :http.request.configuration/output-deser-fn response-add-application-output-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-application-output :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/add-application-output-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/add-application-output-response))

(clojure.core/defn discover-input-schema "Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by\nevaluating sample records on the specified streaming source (Kinesis data stream\nor Kinesis Data Firehose delivery stream) or Amazon S3 object. In the response,\nthe operation returns the inferred schema and also the sample records that the\noperation used to infer the schema.\n You can use the inferred schema when configuring a streaming source for your\napplication. When you create an application using the Kinesis Data Analytics\nconsole, the console uses this operation to infer a schema and show it in the\nconsole user interface." ([discover-input-schema-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-discover-input-schema-request discover-input-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/discover-input-schema-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/discover-input-schema-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DiscoverInputSchema", :http.request.configuration/output-deser-fn response-discover-input-schema-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "UnableToDetectSchemaException" :portkey.aws.kinesisanalyticsv2/unable-to-detect-schema-exception, "ResourceProvisionedThroughputExceededException" :portkey.aws.kinesisanalyticsv2/resource-provisioned-throughput-exceeded-exception, "ServiceUnavailableException" :portkey.aws.kinesisanalyticsv2/service-unavailable-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef discover-input-schema :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/discover-input-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/discover-input-schema-response))

(clojure.core/defn start-application "Starts the specified Amazon Kinesis Data Analytics application. After creating\nan application, you must exclusively call this operation to start your\napplication.\n SQL is not enabled for this private beta. Using SQL parameters (such as\nRunConfiguration$SqlRunConfigurations) will result in an error." ([start-application-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-application-request start-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/start-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/start-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartApplication", :http.request.configuration/output-deser-fn response-start-application-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "InvalidApplicationConfigurationException" :portkey.aws.kinesisanalyticsv2/invalid-application-configuration-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef start-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/start-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/start-application-response))

(clojure.core/defn create-application-snapshot "Creates a snapshot of the application's state data." ([create-application-snapshot-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-application-snapshot-request create-application-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/create-application-snapshot-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/create-application-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApplicationSnapshot", :http.request.configuration/output-deser-fn response-create-application-snapshot-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "LimitExceededException" :portkey.aws.kinesisanalyticsv2/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalyticsv2/unsupported-operation-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-application-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/create-application-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/create-application-snapshot-response))

(clojure.core/defn delete-application-input-processing-configuration "Deletes an InputProcessingConfiguration from an input." ([delete-application-input-processing-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-application-input-processing-configuration-request delete-application-input-processing-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/delete-application-input-processing-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/delete-application-input-processing-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationInputProcessingConfiguration", :http.request.configuration/output-deser-fn response-delete-application-input-processing-configuration-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalyticsv2/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalyticsv2/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalyticsv2/concurrent-modification-exception, "InvalidRequestException" :portkey.aws.kinesisanalyticsv2/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-application-input-processing-configuration :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/delete-application-input-processing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/delete-application-input-processing-configuration-response))

(clojure.core/defn list-application-snapshots "Lists information about the current application snapshots." ([list-application-snapshots-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-application-snapshots-request list-application-snapshots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalyticsv2/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20180523", :http.request.spec/output-spec :portkey.aws.kinesisanalyticsv2/list-application-snapshots-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-05-23", :http.request.configuration/service-id "Kinesis Analytics V2", :http.request.spec/input-spec :portkey.aws.kinesisanalyticsv2/list-application-snapshots-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApplicationSnapshots", :http.request.configuration/output-deser-fn response-list-application-snapshots-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesisanalyticsv2/invalid-argument-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalyticsv2/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef list-application-snapshots :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalyticsv2/list-application-snapshots-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalyticsv2/list-application-snapshots-response))
