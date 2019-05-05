(ns portkey.aws.kinesisanalytics (:require [portkey.aws]))

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

(clojure.core/declare ser-application-update)

(clojure.core/declare ser-log-stream-arn)

(clojure.core/declare ser-in-app-stream-name)

(clojure.core/declare ser-cloud-watch-logging-option)

(clojure.core/declare ser-lambda-output)

(clojure.core/declare ser-kinesis-firehose-input-update)

(clojure.core/declare ser-application-version-id)

(clojure.core/declare ser-kinesis-streams-output-update)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-input-update)

(clojure.core/declare ser-record-column-mapping)

(clojure.core/declare ser-record-format)

(clojure.core/declare ser-cloud-watch-logging-option-update)

(clojure.core/declare ser-input-parallelism-update)

(clojure.core/declare ser-reference-data-source)

(clojure.core/declare ser-csv-mapping-parameters)

(clojure.core/declare ser-input-parallelism)

(clojure.core/declare ser-record-column-delimiter)

(clojure.core/declare ser-record-column-name)

(clojure.core/declare ser-record-row-path)

(clojure.core/declare ser-input-parallelism-count)

(clojure.core/declare ser-s-3-configuration)

(clojure.core/declare ser-s-3-reference-data-source)

(clojure.core/declare ser-destination-schema)

(clojure.core/declare ser-outputs)

(clojure.core/declare ser-json-mapping-parameters)

(clojure.core/declare ser-application-code)

(clojure.core/declare ser-cloud-watch-logging-options)

(clojure.core/declare ser-record-column)

(clojure.core/declare ser-input-lambda-processor-update)

(clojure.core/declare ser-input-starting-position-configuration)

(clojure.core/declare ser-record-encoding)

(clojure.core/declare ser-reference-data-source-update)

(clojure.core/declare ser-inputs)

(clojure.core/declare ser-list-applications-input-limit)

(clojure.core/declare ser-kinesis-streams-input-update)

(clojure.core/declare ser-file-key)

(clojure.core/declare ser-input)

(clojure.core/declare ser-application-name)

(clojure.core/declare ser-record-column-sql-type)

(clojure.core/declare ser-cloud-watch-logging-option-updates)

(clojure.core/declare ser-kinesis-firehose-input)

(clojure.core/declare ser-s-3-reference-data-source-update)

(clojure.core/declare ser-output-update)

(clojure.core/declare ser-input-configurations)

(clojure.core/declare ser-input-processing-configuration)

(clojure.core/declare ser-mapping-parameters)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-kinesis-firehose-output)

(clojure.core/declare ser-in-app-table-name)

(clojure.core/declare ser-record-columns)

(clojure.core/declare ser-input-lambda-processor)

(clojure.core/declare ser-input-schema-update)

(clojure.core/declare ser-output)

(clojure.core/declare ser-lambda-output-update)

(clojure.core/declare ser-record-format-type)

(clojure.core/declare ser-application-description)

(clojure.core/declare ser-input-configuration)

(clojure.core/declare ser-source-schema)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-input-updates)

(clojure.core/declare ser-kinesis-streams-input)

(clojure.core/declare ser-record-row-delimiter)

(clojure.core/declare ser-id)

(clojure.core/declare ser-kinesis-streams-output)

(clojure.core/declare ser-input-processing-configuration-update)

(clojure.core/declare ser-kinesis-firehose-output-update)

(clojure.core/declare ser-output-updates)

(clojure.core/declare ser-reference-data-source-updates)

(clojure.core/declare ser-bucket-arn)

(clojure.core/declare ser-input-starting-position)

(clojure.core/defn- ser-application-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ApplicationUpdate", :type "structure"} (clojure.core/contains? input :input-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-updates (input :input-updates)) #:http.request.field{:name "InputUpdates", :shape "InputUpdates"})) (clojure.core/contains? input :application-code-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-code (input :application-code-update)) #:http.request.field{:name "ApplicationCodeUpdate", :shape "ApplicationCode"})) (clojure.core/contains? input :output-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-updates (input :output-updates)) #:http.request.field{:name "OutputUpdates", :shape "OutputUpdates"})) (clojure.core/contains? input :reference-data-source-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reference-data-source-updates (input :reference-data-source-updates)) #:http.request.field{:name "ReferenceDataSourceUpdates", :shape "ReferenceDataSourceUpdates"})) (clojure.core/contains? input :cloud-watch-logging-option-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-option-updates (input :cloud-watch-logging-option-updates)) #:http.request.field{:name "CloudWatchLoggingOptionUpdates", :shape "CloudWatchLoggingOptionUpdates"}))))

(clojure.core/defn- ser-log-stream-arn [input] #:http.request.field{:value input, :shape "LogStreamARN"})

(clojure.core/defn- ser-in-app-stream-name [input] #:http.request.field{:value input, :shape "InAppStreamName"})

(clojure.core/defn- ser-cloud-watch-logging-option [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-log-stream-arn (:log-stream-arn input)) #:http.request.field{:name "LogStreamARN", :shape "LogStreamARN"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})], :shape "CloudWatchLoggingOption", :type "structure"}))

(clojure.core/defn- ser-lambda-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})], :shape "LambdaOutput", :type "structure"}))

(clojure.core/defn- ser-kinesis-firehose-input-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisFirehoseInputUpdate", :type "structure"} (clojure.core/contains? input :resource-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn-update)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})) (clojure.core/contains? input :role-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn-update)) #:http.request.field{:name "RoleARNUpdate", :shape "RoleARN"}))))

(clojure.core/defn- ser-application-version-id [input] #:http.request.field{:value input, :shape "ApplicationVersionId"})

(clojure.core/defn- ser-kinesis-streams-output-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisStreamsOutputUpdate", :type "structure"} (clojure.core/contains? input :resource-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn-update)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})) (clojure.core/contains? input :role-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn-update)) #:http.request.field{:name "RoleARNUpdate", :shape "RoleARN"}))))

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleARN"})

(clojure.core/defn- ser-input-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:input-id input)) #:http.request.field{:name "InputId", :shape "Id"})], :shape "InputUpdate", :type "structure"} (clojure.core/contains? input :name-prefix-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-in-app-stream-name (input :name-prefix-update)) #:http.request.field{:name "NamePrefixUpdate", :shape "InAppStreamName"})) (clojure.core/contains? input :input-processing-configuration-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-processing-configuration-update (input :input-processing-configuration-update)) #:http.request.field{:name "InputProcessingConfigurationUpdate", :shape "InputProcessingConfigurationUpdate"})) (clojure.core/contains? input :kinesis-streams-input-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-streams-input-update (input :kinesis-streams-input-update)) #:http.request.field{:name "KinesisStreamsInputUpdate", :shape "KinesisStreamsInputUpdate"})) (clojure.core/contains? input :kinesis-firehose-input-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-input-update (input :kinesis-firehose-input-update)) #:http.request.field{:name "KinesisFirehoseInputUpdate", :shape "KinesisFirehoseInputUpdate"})) (clojure.core/contains? input :input-schema-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-schema-update (input :input-schema-update)) #:http.request.field{:name "InputSchemaUpdate", :shape "InputSchemaUpdate"})) (clojure.core/contains? input :input-parallelism-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-parallelism-update (input :input-parallelism-update)) #:http.request.field{:name "InputParallelismUpdate", :shape "InputParallelismUpdate"}))))

(clojure.core/defn- ser-record-column-mapping [input] #:http.request.field{:value input, :shape "RecordColumnMapping"})

(clojure.core/defn- ser-record-format [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-format-type (:record-format-type input)) #:http.request.field{:name "RecordFormatType", :shape "RecordFormatType"})], :shape "RecordFormat", :type "structure"} (clojure.core/contains? input :mapping-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-parameters (input :mapping-parameters)) #:http.request.field{:name "MappingParameters", :shape "MappingParameters"}))))

(clojure.core/defn- ser-cloud-watch-logging-option-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:cloud-watch-logging-option-id input)) #:http.request.field{:name "CloudWatchLoggingOptionId", :shape "Id"})], :shape "CloudWatchLoggingOptionUpdate", :type "structure"} (clojure.core/contains? input :log-stream-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-stream-arn (input :log-stream-arn-update)) #:http.request.field{:name "LogStreamARNUpdate", :shape "LogStreamARN"})) (clojure.core/contains? input :role-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn-update)) #:http.request.field{:name "RoleARNUpdate", :shape "RoleARN"}))))

(clojure.core/defn- ser-input-parallelism-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputParallelismUpdate", :type "structure"} (clojure.core/contains? input :count-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-parallelism-count (input :count-update)) #:http.request.field{:name "CountUpdate", :shape "InputParallelismCount"}))))

(clojure.core/defn- ser-reference-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-in-app-table-name (:table-name input)) #:http.request.field{:name "TableName", :shape "InAppTableName"}) (clojure.core/into (ser-source-schema (:reference-schema input)) #:http.request.field{:name "ReferenceSchema", :shape "SourceSchema"})], :shape "ReferenceDataSource", :type "structure"} (clojure.core/contains? input :s-3-reference-data-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-reference-data-source (input :s-3-reference-data-source)) #:http.request.field{:name "S3ReferenceDataSource", :shape "S3ReferenceDataSource"}))))

(clojure.core/defn- ser-csv-mapping-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-row-delimiter (:record-row-delimiter input)) #:http.request.field{:name "RecordRowDelimiter", :shape "RecordRowDelimiter"}) (clojure.core/into (ser-record-column-delimiter (:record-column-delimiter input)) #:http.request.field{:name "RecordColumnDelimiter", :shape "RecordColumnDelimiter"})], :shape "CSVMappingParameters", :type "structure"}))

(clojure.core/defn- ser-input-parallelism [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputParallelism", :type "structure"} (clojure.core/contains? input :count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-parallelism-count (input :count)) #:http.request.field{:name "Count", :shape "InputParallelismCount"}))))

(clojure.core/defn- ser-record-column-delimiter [input] #:http.request.field{:value input, :shape "RecordColumnDelimiter"})

(clojure.core/defn- ser-record-column-name [input] #:http.request.field{:value input, :shape "RecordColumnName"})

(clojure.core/defn- ser-record-row-path [input] #:http.request.field{:value input, :shape "RecordRowPath"})

(clojure.core/defn- ser-input-parallelism-count [input] #:http.request.field{:value input, :shape "InputParallelismCount"})

(clojure.core/defn- ser-s-3-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"}) (clojure.core/into (ser-bucket-arn (:bucket-arn input)) #:http.request.field{:name "BucketARN", :shape "BucketARN"}) (clojure.core/into (ser-file-key (:file-key input)) #:http.request.field{:name "FileKey", :shape "FileKey"})], :shape "S3Configuration", :type "structure"}))

(clojure.core/defn- ser-s-3-reference-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-arn (:bucket-arn input)) #:http.request.field{:name "BucketARN", :shape "BucketARN"}) (clojure.core/into (ser-file-key (:file-key input)) #:http.request.field{:name "FileKey", :shape "FileKey"}) (clojure.core/into (ser-role-arn (:reference-role-arn input)) #:http.request.field{:name "ReferenceRoleARN", :shape "RoleARN"})], :shape "S3ReferenceDataSource", :type "structure"}))

(clojure.core/defn- ser-destination-schema [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-format-type (:record-format-type input)) #:http.request.field{:name "RecordFormatType", :shape "RecordFormatType"})], :shape "DestinationSchema", :type "structure"}))

(clojure.core/defn- ser-outputs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output coll) #:http.request.field{:shape "Output"}))) input), :shape "Outputs", :type "list"})

(clojure.core/defn- ser-json-mapping-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-row-path (:record-row-path input)) #:http.request.field{:name "RecordRowPath", :shape "RecordRowPath"})], :shape "JSONMappingParameters", :type "structure"}))

(clojure.core/defn- ser-application-code [input] #:http.request.field{:value input, :shape "ApplicationCode"})

(clojure.core/defn- ser-cloud-watch-logging-options [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cloud-watch-logging-option coll) #:http.request.field{:shape "CloudWatchLoggingOption"}))) input), :shape "CloudWatchLoggingOptions", :type "list"})

(clojure.core/defn- ser-record-column [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-column-name (:name input)) #:http.request.field{:name "Name", :shape "RecordColumnName"}) (clojure.core/into (ser-record-column-sql-type (:sql-type input)) #:http.request.field{:name "SqlType", :shape "RecordColumnSqlType"})], :shape "RecordColumn", :type "structure"} (clojure.core/contains? input :mapping) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-column-mapping (input :mapping)) #:http.request.field{:name "Mapping", :shape "RecordColumnMapping"}))))

(clojure.core/defn- ser-input-lambda-processor-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputLambdaProcessorUpdate", :type "structure"} (clojure.core/contains? input :resource-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn-update)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})) (clojure.core/contains? input :role-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn-update)) #:http.request.field{:name "RoleARNUpdate", :shape "RoleARN"}))))

(clojure.core/defn- ser-input-starting-position-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputStartingPositionConfiguration", :type "structure"} (clojure.core/contains? input :input-starting-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-starting-position (input :input-starting-position)) #:http.request.field{:name "InputStartingPosition", :shape "InputStartingPosition"}))))

(clojure.core/defn- ser-record-encoding [input] #:http.request.field{:value input, :shape "RecordEncoding"})

(clojure.core/defn- ser-reference-data-source-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:reference-id input)) #:http.request.field{:name "ReferenceId", :shape "Id"})], :shape "ReferenceDataSourceUpdate", :type "structure"} (clojure.core/contains? input :table-name-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-in-app-table-name (input :table-name-update)) #:http.request.field{:name "TableNameUpdate", :shape "InAppTableName"})) (clojure.core/contains? input :s-3-reference-data-source-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-reference-data-source-update (input :s-3-reference-data-source-update)) #:http.request.field{:name "S3ReferenceDataSourceUpdate", :shape "S3ReferenceDataSourceUpdate"})) (clojure.core/contains? input :reference-schema-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-schema (input :reference-schema-update)) #:http.request.field{:name "ReferenceSchemaUpdate", :shape "SourceSchema"}))))

(clojure.core/defn- ser-inputs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input coll) #:http.request.field{:shape "Input"}))) input), :shape "Inputs", :type "list"})

(clojure.core/defn- ser-list-applications-input-limit [input] #:http.request.field{:value input, :shape "ListApplicationsInputLimit"})

(clojure.core/defn- ser-kinesis-streams-input-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisStreamsInputUpdate", :type "structure"} (clojure.core/contains? input :resource-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn-update)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})) (clojure.core/contains? input :role-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn-update)) #:http.request.field{:name "RoleARNUpdate", :shape "RoleARN"}))))

(clojure.core/defn- ser-file-key [input] #:http.request.field{:value input, :shape "FileKey"})

(clojure.core/defn- ser-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-in-app-stream-name (:name-prefix input)) #:http.request.field{:name "NamePrefix", :shape "InAppStreamName"}) (clojure.core/into (ser-source-schema (:input-schema input)) #:http.request.field{:name "InputSchema", :shape "SourceSchema"})], :shape "Input", :type "structure"} (clojure.core/contains? input :input-processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-processing-configuration (input :input-processing-configuration)) #:http.request.field{:name "InputProcessingConfiguration", :shape "InputProcessingConfiguration"})) (clojure.core/contains? input :kinesis-streams-input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-streams-input (input :kinesis-streams-input)) #:http.request.field{:name "KinesisStreamsInput", :shape "KinesisStreamsInput"})) (clojure.core/contains? input :kinesis-firehose-input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-input (input :kinesis-firehose-input)) #:http.request.field{:name "KinesisFirehoseInput", :shape "KinesisFirehoseInput"})) (clojure.core/contains? input :input-parallelism) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-parallelism (input :input-parallelism)) #:http.request.field{:name "InputParallelism", :shape "InputParallelism"}))))

(clojure.core/defn- ser-application-name [input] #:http.request.field{:value input, :shape "ApplicationName"})

(clojure.core/defn- ser-record-column-sql-type [input] #:http.request.field{:value input, :shape "RecordColumnSqlType"})

(clojure.core/defn- ser-cloud-watch-logging-option-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cloud-watch-logging-option-update coll) #:http.request.field{:shape "CloudWatchLoggingOptionUpdate"}))) input), :shape "CloudWatchLoggingOptionUpdates", :type "list"})

(clojure.core/defn- ser-kinesis-firehose-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})], :shape "KinesisFirehoseInput", :type "structure"}))

(clojure.core/defn- ser-s-3-reference-data-source-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3ReferenceDataSourceUpdate", :type "structure"} (clojure.core/contains? input :bucket-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-arn (input :bucket-arn-update)) #:http.request.field{:name "BucketARNUpdate", :shape "BucketARN"})) (clojure.core/contains? input :file-key-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-key (input :file-key-update)) #:http.request.field{:name "FileKeyUpdate", :shape "FileKey"})) (clojure.core/contains? input :reference-role-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :reference-role-arn-update)) #:http.request.field{:name "ReferenceRoleARNUpdate", :shape "RoleARN"}))))

(clojure.core/defn- ser-output-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:output-id input)) #:http.request.field{:name "OutputId", :shape "Id"})], :shape "OutputUpdate", :type "structure"} (clojure.core/contains? input :name-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-in-app-stream-name (input :name-update)) #:http.request.field{:name "NameUpdate", :shape "InAppStreamName"})) (clojure.core/contains? input :kinesis-streams-output-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-streams-output-update (input :kinesis-streams-output-update)) #:http.request.field{:name "KinesisStreamsOutputUpdate", :shape "KinesisStreamsOutputUpdate"})) (clojure.core/contains? input :kinesis-firehose-output-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-output-update (input :kinesis-firehose-output-update)) #:http.request.field{:name "KinesisFirehoseOutputUpdate", :shape "KinesisFirehoseOutputUpdate"})) (clojure.core/contains? input :lambda-output-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-output-update (input :lambda-output-update)) #:http.request.field{:name "LambdaOutputUpdate", :shape "LambdaOutputUpdate"})) (clojure.core/contains? input :destination-schema-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-destination-schema (input :destination-schema-update)) #:http.request.field{:name "DestinationSchemaUpdate", :shape "DestinationSchema"}))))

(clojure.core/defn- ser-input-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-configuration coll) #:http.request.field{:shape "InputConfiguration"}))) input), :shape "InputConfigurations", :type "list"})

(clojure.core/defn- ser-input-processing-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-input-lambda-processor (:input-lambda-processor input)) #:http.request.field{:name "InputLambdaProcessor", :shape "InputLambdaProcessor"})], :shape "InputProcessingConfiguration", :type "structure"}))

(clojure.core/defn- ser-mapping-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MappingParameters", :type "structure"} (clojure.core/contains? input :json-mapping-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-json-mapping-parameters (input :json-mapping-parameters)) #:http.request.field{:name "JSONMappingParameters", :shape "JSONMappingParameters"})) (clojure.core/contains? input :csv-mapping-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-csv-mapping-parameters (input :csv-mapping-parameters)) #:http.request.field{:name "CSVMappingParameters", :shape "CSVMappingParameters"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-kinesis-firehose-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})], :shape "KinesisFirehoseOutput", :type "structure"}))

(clojure.core/defn- ser-in-app-table-name [input] #:http.request.field{:value input, :shape "InAppTableName"})

(clojure.core/defn- ser-record-columns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-record-column coll) #:http.request.field{:shape "RecordColumn"}))) input), :shape "RecordColumns", :type "list", :max 1000, :min 1})

(clojure.core/defn- ser-input-lambda-processor [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})], :shape "InputLambdaProcessor", :type "structure"}))

(clojure.core/defn- ser-input-schema-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputSchemaUpdate", :type "structure"} (clojure.core/contains? input :record-format-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-format (input :record-format-update)) #:http.request.field{:name "RecordFormatUpdate", :shape "RecordFormat"})) (clojure.core/contains? input :record-encoding-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-encoding (input :record-encoding-update)) #:http.request.field{:name "RecordEncodingUpdate", :shape "RecordEncoding"})) (clojure.core/contains? input :record-column-updates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-columns (input :record-column-updates)) #:http.request.field{:name "RecordColumnUpdates", :shape "RecordColumns"}))))

(clojure.core/defn- ser-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-in-app-stream-name (:name input)) #:http.request.field{:name "Name", :shape "InAppStreamName"}) (clojure.core/into (ser-destination-schema (:destination-schema input)) #:http.request.field{:name "DestinationSchema", :shape "DestinationSchema"})], :shape "Output", :type "structure"} (clojure.core/contains? input :kinesis-streams-output) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-streams-output (input :kinesis-streams-output)) #:http.request.field{:name "KinesisStreamsOutput", :shape "KinesisStreamsOutput"})) (clojure.core/contains? input :kinesis-firehose-output) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-output (input :kinesis-firehose-output)) #:http.request.field{:name "KinesisFirehoseOutput", :shape "KinesisFirehoseOutput"})) (clojure.core/contains? input :lambda-output) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-output (input :lambda-output)) #:http.request.field{:name "LambdaOutput", :shape "LambdaOutput"}))))

(clojure.core/defn- ser-lambda-output-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LambdaOutputUpdate", :type "structure"} (clojure.core/contains? input :resource-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn-update)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})) (clojure.core/contains? input :role-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn-update)) #:http.request.field{:name "RoleARNUpdate", :shape "RoleARN"}))))

(clojure.core/defn- ser-record-format-type [input] #:http.request.field{:value (clojure.core/get {"JSON" "JSON", :json "JSON", "CSV" "CSV", :csv "CSV"} input), :shape "RecordFormatType"})

(clojure.core/defn- ser-application-description [input] #:http.request.field{:value input, :shape "ApplicationDescription"})

(clojure.core/defn- ser-input-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:id input)) #:http.request.field{:name "Id", :shape "Id"}) (clojure.core/into (ser-input-starting-position-configuration (:input-starting-position-configuration input)) #:http.request.field{:name "InputStartingPositionConfiguration", :shape "InputStartingPositionConfiguration"})], :shape "InputConfiguration", :type "structure"}))

(clojure.core/defn- ser-source-schema [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-format (:record-format input)) #:http.request.field{:name "RecordFormat", :shape "RecordFormat"}) (clojure.core/into (ser-record-columns (:record-columns input)) #:http.request.field{:name "RecordColumns", :shape "RecordColumns"})], :shape "SourceSchema", :type "structure"} (clojure.core/contains? input :record-encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-encoding (input :record-encoding)) #:http.request.field{:name "RecordEncoding", :shape "RecordEncoding"}))))

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-input-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-update coll) #:http.request.field{:shape "InputUpdate"}))) input), :shape "InputUpdates", :type "list"})

(clojure.core/defn- ser-kinesis-streams-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})], :shape "KinesisStreamsInput", :type "structure"}))

(clojure.core/defn- ser-record-row-delimiter [input] #:http.request.field{:value input, :shape "RecordRowDelimiter"})

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "Id"})

(clojure.core/defn- ser-kinesis-streams-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-arn (:resource-arn input)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})], :shape "KinesisStreamsOutput", :type "structure"}))

(clojure.core/defn- ser-input-processing-configuration-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-input-lambda-processor-update (:input-lambda-processor-update input)) #:http.request.field{:name "InputLambdaProcessorUpdate", :shape "InputLambdaProcessorUpdate"})], :shape "InputProcessingConfigurationUpdate", :type "structure"}))

(clojure.core/defn- ser-kinesis-firehose-output-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisFirehoseOutputUpdate", :type "structure"} (clojure.core/contains? input :resource-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn-update)) #:http.request.field{:name "ResourceARNUpdate", :shape "ResourceARN"})) (clojure.core/contains? input :role-arn-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn-update)) #:http.request.field{:name "RoleARNUpdate", :shape "RoleARN"}))))

(clojure.core/defn- ser-output-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output-update coll) #:http.request.field{:shape "OutputUpdate"}))) input), :shape "OutputUpdates", :type "list"})

(clojure.core/defn- ser-reference-data-source-updates [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-reference-data-source-update coll) #:http.request.field{:shape "ReferenceDataSourceUpdate"}))) input), :shape "ReferenceDataSourceUpdates", :type "list"})

(clojure.core/defn- ser-bucket-arn [input] #:http.request.field{:value input, :shape "BucketARN"})

(clojure.core/defn- ser-input-starting-position [input] #:http.request.field{:value (clojure.core/get {"NOW" "NOW", :now "NOW", "TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LAST_STOPPED_POINT" "LAST_STOPPED_POINT", :last-stopped-point "LAST_STOPPED_POINT"} input), :shape "InputStartingPosition"})

(clojure.core/defn- req-stop-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]}))

(clojure.core/defn- req-delete-application-reference-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :reference-id)) #:http.request.field{:name "ReferenceId", :shape "Id"})]}))

(clojure.core/defn- req-delete-application-output-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :output-id)) #:http.request.field{:name "OutputId", :shape "Id"})]}))

(clojure.core/defn- req-add-application-output-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-output (input :output)) #:http.request.field{:name "Output", :shape "Output"})]}))

(clojure.core/defn- req-create-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :application-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-description (input :application-description)) #:http.request.field{:name "ApplicationDescription", :shape "ApplicationDescription"})) (clojure.core/contains? input :inputs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inputs (input :inputs)) #:http.request.field{:name "Inputs", :shape "Inputs"})) (clojure.core/contains? input :outputs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-outputs (input :outputs)) #:http.request.field{:name "Outputs", :shape "Outputs"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :application-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-code (input :application-code)) #:http.request.field{:name "ApplicationCode", :shape "ApplicationCode"}))))

(clojure.core/defn- req-start-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-input-configurations (input :input-configurations)) #:http.request.field{:name "InputConfigurations", :shape "InputConfigurations"})]}))

(clojure.core/defn- req-add-application-cloud-watch-logging-option-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-cloud-watch-logging-option (input :cloud-watch-logging-option)) #:http.request.field{:name "CloudWatchLoggingOption", :shape "CloudWatchLoggingOption"})]}))

(clojure.core/defn- req-discover-input-schema-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :input-starting-position-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-starting-position-configuration (input :input-starting-position-configuration)) #:http.request.field{:name "InputStartingPositionConfiguration", :shape "InputStartingPositionConfiguration"})) (clojure.core/contains? input :s-3-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-configuration (input :s-3-configuration)) #:http.request.field{:name "S3Configuration", :shape "S3Configuration"})) (clojure.core/contains? input :input-processing-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-processing-configuration (input :input-processing-configuration)) #:http.request.field{:name "InputProcessingConfiguration", :shape "InputProcessingConfiguration"}))))

(clojure.core/defn- req-delete-application-input-processing-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :input-id)) #:http.request.field{:name "InputId", :shape "Id"})]}))

(clojure.core/defn- req-add-application-input-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-input (input :input)) #:http.request.field{:name "Input", :shape "Input"})]}))

(clojure.core/defn- req-list-applications-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-applications-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListApplicationsInputLimit"})) (clojure.core/contains? input :exclusive-start-application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :exclusive-start-application-name)) #:http.request.field{:name "ExclusiveStartApplicationName", :shape "ApplicationName"}))))

(clojure.core/defn- req-add-application-reference-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-reference-data-source (input :reference-data-source)) #:http.request.field{:name "ReferenceDataSource", :shape "ReferenceDataSource"})]}))

(clojure.core/defn- req-delete-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-timestamp (input :create-timestamp)) #:http.request.field{:name "CreateTimestamp", :shape "Timestamp"})]}))

(clojure.core/defn- req-delete-application-cloud-watch-logging-option-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :cloud-watch-logging-option-id)) #:http.request.field{:name "CloudWatchLoggingOptionId", :shape "Id"})]}))

(clojure.core/defn- req-add-application-input-processing-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-id (input :input-id)) #:http.request.field{:name "InputId", :shape "Id"}) (clojure.core/into (ser-input-processing-configuration (input :input-processing-configuration)) #:http.request.field{:name "InputProcessingConfiguration", :shape "InputProcessingConfiguration"})]}))

(clojure.core/defn- req-update-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-version-id (input :current-application-version-id)) #:http.request.field{:name "CurrentApplicationVersionId", :shape "ApplicationVersionId"}) (clojure.core/into (ser-application-update (input :application-update)) #:http.request.field{:name "ApplicationUpdate", :shape "ApplicationUpdate"})]}))

(clojure.core/defn- req-describe-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]}))

(clojure.core/declare deser-input-processing-configuration-description)

(clojure.core/declare deser-log-stream-arn)

(clojure.core/declare deser-cloud-watch-logging-option-description)

(clojure.core/declare deser-application-detail)

(clojure.core/declare deser-in-app-stream-name)

(clojure.core/declare deser-application-version-id)

(clojure.core/declare deser-application-summaries)

(clojure.core/declare deser-parsed-input-records)

(clojure.core/declare deser-input-description)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-record-column-mapping)

(clojure.core/declare deser-record-format)

(clojure.core/declare deser-output-descriptions)

(clojure.core/declare deser-kinesis-streams-output-description)

(clojure.core/declare deser-output-description)

(clojure.core/declare deser-parsed-input-record)

(clojure.core/declare deser-cloud-watch-logging-option-descriptions)

(clojure.core/declare deser-csv-mapping-parameters)

(clojure.core/declare deser-input-parallelism)

(clojure.core/declare deser-application-summary)

(clojure.core/declare deser-record-column-delimiter)

(clojure.core/declare deser-in-app-stream-names)

(clojure.core/declare deser-record-column-name)

(clojure.core/declare deser-record-row-path)

(clojure.core/declare deser-input-parallelism-count)

(clojure.core/declare deser-destination-schema)

(clojure.core/declare deser-kinesis-firehose-output-description)

(clojure.core/declare deser-processed-input-records)

(clojure.core/declare deser-json-mapping-parameters)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-application-code)

(clojure.core/declare deser-record-column)

(clojure.core/declare deser-input-starting-position-configuration)

(clojure.core/declare deser-s-3-reference-data-source-description)

(clojure.core/declare deser-record-encoding)

(clojure.core/declare deser-application-status)

(clojure.core/declare deser-processed-input-record)

(clojure.core/declare deser-file-key)

(clojure.core/declare deser-application-name)

(clojure.core/declare deser-input-descriptions)

(clojure.core/declare deser-record-column-sql-type)

(clojure.core/declare deser-kinesis-streams-input-description)

(clojure.core/declare deser-parsed-input-record-field)

(clojure.core/declare deser-mapping-parameters)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-reference-data-source-descriptions)

(clojure.core/declare deser-in-app-table-name)

(clojure.core/declare deser-record-columns)

(clojure.core/declare deser-lambda-output-description)

(clojure.core/declare deser-kinesis-firehose-input-description)

(clojure.core/declare deser-record-format-type)

(clojure.core/declare deser-reference-data-source-description)

(clojure.core/declare deser-application-description)

(clojure.core/declare deser-source-schema)

(clojure.core/declare deser-input-lambda-processor-description)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-boolean-object)

(clojure.core/declare deser-record-row-delimiter)

(clojure.core/declare deser-id)

(clojure.core/declare deser-raw-input-record)

(clojure.core/declare deser-bucket-arn)

(clojure.core/declare deser-input-starting-position)

(clojure.core/declare deser-raw-input-records)

(clojure.core/defn- deser-input-processing-configuration-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputLambdaProcessorDescription") (clojure.core/assoc :input-lambda-processor-description (deser-input-lambda-processor-description (input "InputLambdaProcessorDescription")))))

(clojure.core/defn- deser-log-stream-arn [input] input)

(clojure.core/defn- deser-cloud-watch-logging-option-description [input] (clojure.core/cond-> {:log-stream-arn (deser-log-stream-arn (input "LogStreamARN")), :role-arn (deser-role-arn (input "RoleARN"))} (clojure.core/contains? input "CloudWatchLoggingOptionId") (clojure.core/assoc :cloud-watch-logging-option-id (deser-id (input "CloudWatchLoggingOptionId")))))

(clojure.core/defn- deser-application-detail [input] (clojure.core/cond-> {:application-name (deser-application-name (input "ApplicationName")), :application-arn (deser-resource-arn (input "ApplicationARN")), :application-status (deser-application-status (input "ApplicationStatus")), :application-version-id (deser-application-version-id (input "ApplicationVersionId"))} (clojure.core/contains? input "CreateTimestamp") (clojure.core/assoc :create-timestamp (deser-timestamp (input "CreateTimestamp"))) (clojure.core/contains? input "LastUpdateTimestamp") (clojure.core/assoc :last-update-timestamp (deser-timestamp (input "LastUpdateTimestamp"))) (clojure.core/contains? input "OutputDescriptions") (clojure.core/assoc :output-descriptions (deser-output-descriptions (input "OutputDescriptions"))) (clojure.core/contains? input "CloudWatchLoggingOptionDescriptions") (clojure.core/assoc :cloud-watch-logging-option-descriptions (deser-cloud-watch-logging-option-descriptions (input "CloudWatchLoggingOptionDescriptions"))) (clojure.core/contains? input "ApplicationCode") (clojure.core/assoc :application-code (deser-application-code (input "ApplicationCode"))) (clojure.core/contains? input "InputDescriptions") (clojure.core/assoc :input-descriptions (deser-input-descriptions (input "InputDescriptions"))) (clojure.core/contains? input "ReferenceDataSourceDescriptions") (clojure.core/assoc :reference-data-source-descriptions (deser-reference-data-source-descriptions (input "ReferenceDataSourceDescriptions"))) (clojure.core/contains? input "ApplicationDescription") (clojure.core/assoc :application-description (deser-application-description (input "ApplicationDescription")))))

(clojure.core/defn- deser-in-app-stream-name [input] input)

(clojure.core/defn- deser-application-version-id [input] input)

(clojure.core/defn- deser-application-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-summary coll))) input))

(clojure.core/defn- deser-parsed-input-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parsed-input-record coll))) input))

(clojure.core/defn- deser-input-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputProcessingConfigurationDescription") (clojure.core/assoc :input-processing-configuration-description (deser-input-processing-configuration-description (input "InputProcessingConfigurationDescription"))) (clojure.core/contains? input "InputId") (clojure.core/assoc :input-id (deser-id (input "InputId"))) (clojure.core/contains? input "InputParallelism") (clojure.core/assoc :input-parallelism (deser-input-parallelism (input "InputParallelism"))) (clojure.core/contains? input "InAppStreamNames") (clojure.core/assoc :in-app-stream-names (deser-in-app-stream-names (input "InAppStreamNames"))) (clojure.core/contains? input "InputStartingPositionConfiguration") (clojure.core/assoc :input-starting-position-configuration (deser-input-starting-position-configuration (input "InputStartingPositionConfiguration"))) (clojure.core/contains? input "NamePrefix") (clojure.core/assoc :name-prefix (deser-in-app-stream-name (input "NamePrefix"))) (clojure.core/contains? input "KinesisStreamsInputDescription") (clojure.core/assoc :kinesis-streams-input-description (deser-kinesis-streams-input-description (input "KinesisStreamsInputDescription"))) (clojure.core/contains? input "InputSchema") (clojure.core/assoc :input-schema (deser-source-schema (input "InputSchema"))) (clojure.core/contains? input "KinesisFirehoseInputDescription") (clojure.core/assoc :kinesis-firehose-input-description (deser-kinesis-firehose-input-description (input "KinesisFirehoseInputDescription")))))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-record-column-mapping [input] input)

(clojure.core/defn- deser-record-format [input] (clojure.core/cond-> {:record-format-type (deser-record-format-type (input "RecordFormatType"))} (clojure.core/contains? input "MappingParameters") (clojure.core/assoc :mapping-parameters (deser-mapping-parameters (input "MappingParameters")))))

(clojure.core/defn- deser-output-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-description coll))) input))

(clojure.core/defn- deser-kinesis-streams-output-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-output-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "OutputId") (clojure.core/assoc :output-id (deser-id (input "OutputId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-in-app-stream-name (input "Name"))) (clojure.core/contains? input "KinesisStreamsOutputDescription") (clojure.core/assoc :kinesis-streams-output-description (deser-kinesis-streams-output-description (input "KinesisStreamsOutputDescription"))) (clojure.core/contains? input "KinesisFirehoseOutputDescription") (clojure.core/assoc :kinesis-firehose-output-description (deser-kinesis-firehose-output-description (input "KinesisFirehoseOutputDescription"))) (clojure.core/contains? input "LambdaOutputDescription") (clojure.core/assoc :lambda-output-description (deser-lambda-output-description (input "LambdaOutputDescription"))) (clojure.core/contains? input "DestinationSchema") (clojure.core/assoc :destination-schema (deser-destination-schema (input "DestinationSchema")))))

(clojure.core/defn- deser-parsed-input-record [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parsed-input-record-field coll))) input))

(clojure.core/defn- deser-cloud-watch-logging-option-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-watch-logging-option-description coll))) input))

(clojure.core/defn- deser-csv-mapping-parameters [input] (clojure.core/cond-> {:record-row-delimiter (deser-record-row-delimiter (input "RecordRowDelimiter")), :record-column-delimiter (deser-record-column-delimiter (input "RecordColumnDelimiter"))}))

(clojure.core/defn- deser-input-parallelism [input] (clojure.core/cond-> {} (clojure.core/contains? input "Count") (clojure.core/assoc :count (deser-input-parallelism-count (input "Count")))))

(clojure.core/defn- deser-application-summary [input] (clojure.core/cond-> {:application-name (deser-application-name (input "ApplicationName")), :application-arn (deser-resource-arn (input "ApplicationARN")), :application-status (deser-application-status (input "ApplicationStatus"))}))

(clojure.core/defn- deser-record-column-delimiter [input] input)

(clojure.core/defn- deser-in-app-stream-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-in-app-stream-name coll))) input))

(clojure.core/defn- deser-record-column-name [input] input)

(clojure.core/defn- deser-record-row-path [input] input)

(clojure.core/defn- deser-input-parallelism-count [input] input)

(clojure.core/defn- deser-destination-schema [input] (clojure.core/cond-> {:record-format-type (deser-record-format-type (input "RecordFormatType"))}))

(clojure.core/defn- deser-kinesis-firehose-output-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-processed-input-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-processed-input-record coll))) input))

(clojure.core/defn- deser-json-mapping-parameters [input] (clojure.core/cond-> {:record-row-path (deser-record-row-path (input "RecordRowPath"))}))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-application-code [input] input)

(clojure.core/defn- deser-record-column [input] (clojure.core/cond-> {:name (deser-record-column-name (input "Name")), :sql-type (deser-record-column-sql-type (input "SqlType"))} (clojure.core/contains? input "Mapping") (clojure.core/assoc :mapping (deser-record-column-mapping (input "Mapping")))))

(clojure.core/defn- deser-input-starting-position-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputStartingPosition") (clojure.core/assoc :input-starting-position (deser-input-starting-position (input "InputStartingPosition")))))

(clojure.core/defn- deser-s-3-reference-data-source-description [input] (clojure.core/cond-> {:bucket-arn (deser-bucket-arn (input "BucketARN")), :file-key (deser-file-key (input "FileKey")), :reference-role-arn (deser-role-arn (input "ReferenceRoleARN"))}))

(clojure.core/defn- deser-record-encoding [input] input)

(clojure.core/defn- deser-application-status [input] (clojure.core/get {"DELETING" :deleting, "STARTING" :starting, "STOPPING" :stopping, "READY" :ready, "RUNNING" :running, "UPDATING" :updating} input))

(clojure.core/defn- deser-processed-input-record [input] input)

(clojure.core/defn- deser-file-key [input] input)

(clojure.core/defn- deser-application-name [input] input)

(clojure.core/defn- deser-input-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-description coll))) input))

(clojure.core/defn- deser-record-column-sql-type [input] input)

(clojure.core/defn- deser-kinesis-streams-input-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-parsed-input-record-field [input] input)

(clojure.core/defn- deser-mapping-parameters [input] (clojure.core/cond-> {} (clojure.core/contains? input "JSONMappingParameters") (clojure.core/assoc :json-mapping-parameters (deser-json-mapping-parameters (input "JSONMappingParameters"))) (clojure.core/contains? input "CSVMappingParameters") (clojure.core/assoc :csv-mapping-parameters (deser-csv-mapping-parameters (input "CSVMappingParameters")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-reference-data-source-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reference-data-source-description coll))) input))

(clojure.core/defn- deser-in-app-table-name [input] input)

(clojure.core/defn- deser-record-columns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-column coll))) input))

(clojure.core/defn- deser-lambda-output-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-kinesis-firehose-input-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-record-format-type [input] (clojure.core/get {"JSON" :json, "CSV" :csv} input))

(clojure.core/defn- deser-reference-data-source-description [input] (clojure.core/cond-> {:reference-id (deser-id (input "ReferenceId")), :table-name (deser-in-app-table-name (input "TableName")), :s-3-reference-data-source-description (deser-s-3-reference-data-source-description (input "S3ReferenceDataSourceDescription"))} (clojure.core/contains? input "ReferenceSchema") (clojure.core/assoc :reference-schema (deser-source-schema (input "ReferenceSchema")))))

(clojure.core/defn- deser-application-description [input] input)

(clojure.core/defn- deser-source-schema [input] (clojure.core/cond-> {:record-format (deser-record-format (input "RecordFormat")), :record-columns (deser-record-columns (input "RecordColumns"))} (clojure.core/contains? input "RecordEncoding") (clojure.core/assoc :record-encoding (deser-record-encoding (input "RecordEncoding")))))

(clojure.core/defn- deser-input-lambda-processor-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN")))))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-boolean-object [input] input)

(clojure.core/defn- deser-record-row-delimiter [input] input)

(clojure.core/defn- deser-id [input] input)

(clojure.core/defn- deser-raw-input-record [input] input)

(clojure.core/defn- deser-bucket-arn [input] input)

(clojure.core/defn- deser-input-starting-position [input] (clojure.core/get {"NOW" :now, "TRIM_HORIZON" :trim-horizon, "LAST_STOPPED_POINT" :last-stopped-point} input))

(clojure.core/defn- deser-raw-input-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-raw-input-record coll))) input))

(clojure.core/defn- response-add-application-input-response ([input] (response-add-application-input-response nil input)) ([resultWrapper1178006 input] (clojure.core/let [rawinput1178005 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178007 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-application-response ([input] (response-stop-application-response nil input)) ([resultWrapper1178009 input] (clojure.core/let [rawinput1178008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178010 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-application-reference-data-source-response ([input] (response-add-application-reference-data-source-response nil input)) ([resultWrapper1178012 input] (clojure.core/let [rawinput1178011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178013 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-code-validation-exception ([input] (response-code-validation-exception nil input)) ([resultWrapper1178015 input] (clojure.core/let [rawinput1178014 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178016 {"message" (rawinput1178014 "message")}] (clojure.core/cond-> {} (letvar1178016 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178016 ["message"])))))))

(clojure.core/defn- response-discover-input-schema-response ([input] (response-discover-input-schema-response nil input)) ([resultWrapper1178018 input] (clojure.core/let [rawinput1178017 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178019 {"InputSchema" (rawinput1178017 "InputSchema"), "ParsedInputRecords" (rawinput1178017 "ParsedInputRecords"), "ProcessedInputRecords" (rawinput1178017 "ProcessedInputRecords"), "RawInputRecords" (rawinput1178017 "RawInputRecords")}] (clojure.core/cond-> {} (letvar1178019 "InputSchema") (clojure.core/assoc :input-schema (deser-source-schema (clojure.core/get-in letvar1178019 ["InputSchema"]))) (letvar1178019 "ParsedInputRecords") (clojure.core/assoc :parsed-input-records (deser-parsed-input-records (clojure.core/get-in letvar1178019 ["ParsedInputRecords"]))) (letvar1178019 "ProcessedInputRecords") (clojure.core/assoc :processed-input-records (deser-processed-input-records (clojure.core/get-in letvar1178019 ["ProcessedInputRecords"]))) (letvar1178019 "RawInputRecords") (clojure.core/assoc :raw-input-records (deser-raw-input-records (clojure.core/get-in letvar1178019 ["RawInputRecords"])))))))

(clojure.core/defn- response-unable-to-detect-schema-exception ([input] (response-unable-to-detect-schema-exception nil input)) ([resultWrapper1178021 input] (clojure.core/let [rawinput1178020 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178022 {"message" (rawinput1178020 "message"), "RawInputRecords" (rawinput1178020 "RawInputRecords"), "ProcessedInputRecords" (rawinput1178020 "ProcessedInputRecords")}] (clojure.core/cond-> {} (letvar1178022 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178022 ["message"]))) (letvar1178022 "RawInputRecords") (clojure.core/assoc :raw-input-records (deser-raw-input-records (clojure.core/get-in letvar1178022 ["RawInputRecords"]))) (letvar1178022 "ProcessedInputRecords") (clojure.core/assoc :processed-input-records (deser-processed-input-records (clojure.core/get-in letvar1178022 ["ProcessedInputRecords"])))))))

(clojure.core/defn- response-delete-application-output-response ([input] (response-delete-application-output-response nil input)) ([resultWrapper1178024 input] (clojure.core/let [rawinput1178023 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178025 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-application-response ([input] (response-describe-application-response nil input)) ([resultWrapper1178027 input] (clojure.core/let [rawinput1178026 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178028 {"ApplicationDetail" (rawinput1178026 "ApplicationDetail")}] (clojure.core/cond-> {:application-detail (deser-application-detail (clojure.core/get-in letvar1178028 ["ApplicationDetail"]))}))))

(clojure.core/defn- response-delete-application-reference-data-source-response ([input] (response-delete-application-reference-data-source-response nil input)) ([resultWrapper1178030 input] (clojure.core/let [rawinput1178029 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178031 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1178033 input] (clojure.core/let [rawinput1178032 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178034 {"message" (rawinput1178032 "message")}] (clojure.core/cond-> {} (letvar1178034 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178034 ["message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1178036 input] (clojure.core/let [rawinput1178035 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178037 {"message" (rawinput1178035 "message")}] (clojure.core/cond-> {} (letvar1178037 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178037 ["message"])))))))

(clojure.core/defn- response-update-application-response ([input] (response-update-application-response nil input)) ([resultWrapper1178039 input] (clojure.core/let [rawinput1178038 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178040 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1178042 input] (clojure.core/let [rawinput1178041 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178043 {"message" (rawinput1178041 "message")}] (clojure.core/cond-> {} (letvar1178043 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178043 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1178045 input] (clojure.core/let [rawinput1178044 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178046 {"message" (rawinput1178044 "message")}] (clojure.core/cond-> {} (letvar1178046 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178046 ["message"])))))))

(clojure.core/defn- response-unsupported-operation-exception ([input] (response-unsupported-operation-exception nil input)) ([resultWrapper1178048 input] (clojure.core/let [rawinput1178047 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178049 {"message" (rawinput1178047 "message")}] (clojure.core/cond-> {} (letvar1178049 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178049 ["message"])))))))

(clojure.core/defn- response-add-application-input-processing-configuration-response ([input] (response-add-application-input-processing-configuration-response nil input)) ([resultWrapper1178051 input] (clojure.core/let [rawinput1178050 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178052 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-application-input-processing-configuration-response ([input] (response-delete-application-input-processing-configuration-response nil input)) ([resultWrapper1178054 input] (clojure.core/let [rawinput1178053 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178055 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-provisioned-throughput-exceeded-exception ([input] (response-resource-provisioned-throughput-exceeded-exception nil input)) ([resultWrapper1178057 input] (clojure.core/let [rawinput1178056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178058 {"message" (rawinput1178056 "message")}] (clojure.core/cond-> {} (letvar1178058 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178058 ["message"])))))))

(clojure.core/defn- response-add-application-output-response ([input] (response-add-application-output-response nil input)) ([resultWrapper1178060 input] (clojure.core/let [rawinput1178059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178061 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-application-response ([input] (response-create-application-response nil input)) ([resultWrapper1178063 input] (clojure.core/let [rawinput1178062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178064 {"ApplicationSummary" (rawinput1178062 "ApplicationSummary")}] (clojure.core/cond-> {:application-summary (deser-application-summary (clojure.core/get-in letvar1178064 ["ApplicationSummary"]))}))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper1178066 input] (clojure.core/let [rawinput1178065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178067 {"message" (rawinput1178065 "message")}] (clojure.core/cond-> {} (letvar1178067 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178067 ["message"])))))))

(clojure.core/defn- response-add-application-cloud-watch-logging-option-response ([input] (response-add-application-cloud-watch-logging-option-response nil input)) ([resultWrapper1178069 input] (clojure.core/let [rawinput1178068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178070 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-application-response ([input] (response-start-application-response nil input)) ([resultWrapper1178072 input] (clojure.core/let [rawinput1178071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178073 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-application-response ([input] (response-delete-application-response nil input)) ([resultWrapper1178075 input] (clojure.core/let [rawinput1178074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178076 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1178078 input] (clojure.core/let [rawinput1178077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178079 {"message" (rawinput1178077 "message")}] (clojure.core/cond-> {} (letvar1178079 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178079 ["message"])))))))

(clojure.core/defn- response-delete-application-cloud-watch-logging-option-response ([input] (response-delete-application-cloud-watch-logging-option-response nil input)) ([resultWrapper1178081 input] (clojure.core/let [rawinput1178080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178082 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-applications-response ([input] (response-list-applications-response nil input)) ([resultWrapper1178084 input] (clojure.core/let [rawinput1178083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178085 {"ApplicationSummaries" (rawinput1178083 "ApplicationSummaries"), "HasMoreApplications" (rawinput1178083 "HasMoreApplications")}] (clojure.core/cond-> {:application-summaries (deser-application-summaries (clojure.core/get-in letvar1178085 ["ApplicationSummaries"])), :has-more-applications (deser-boolean-object (clojure.core/get-in letvar1178085 ["HasMoreApplications"]))}))))

(clojure.core/defn- response-invalid-application-configuration-exception ([input] (response-invalid-application-configuration-exception nil input)) ([resultWrapper1178087 input] (clojure.core/let [rawinput1178086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1178088 {"message" (rawinput1178086 "message")}] (clojure.core/cond-> {} (letvar1178088 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1178088 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-processing-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/input-lambda-processor-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/stop-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-input-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/stop-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.application-update/application-code-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-code))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/input-updates :portkey.aws.kinesisanalytics.application-update/application-code-update :portkey.aws.kinesisanalytics/output-updates :portkey.aws.kinesisanalytics/reference-data-source-updates :portkey.aws.kinesisanalytics/cloud-watch-logging-option-updates]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-reference-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/log-stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.code-validation-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/code-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.code-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.discover-input-schema-response/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/discover-input-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.discover-input-schema-response/input-schema :portkey.aws.kinesisanalytics/parsed-input-records :portkey.aws.kinesisanalytics/processed-input-records :portkey.aws.kinesisanalytics/raw-input-records]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.cloud-watch-logging-option-description/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/cloud-watch-logging-option-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/log-stream-arn :portkey.aws.kinesisanalytics/role-arn] :opt-un [:portkey.aws.kinesisanalytics.cloud-watch-logging-option-description/cloud-watch-logging-option-id]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-reference-data-source-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-reference-data-source-request/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-reference-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.delete-application-reference-data-source-request/current-application-version-id :portkey.aws.kinesisanalytics.delete-application-reference-data-source-request/reference-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.application-detail/create-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.application-detail/last-update-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.application-detail/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.application-detail/application-arn :portkey.aws.kinesisanalytics/application-status :portkey.aws.kinesisanalytics/application-version-id] :opt-un [:portkey.aws.kinesisanalytics.application-detail/create-timestamp :portkey.aws.kinesisanalytics.application-detail/last-update-timestamp :portkey.aws.kinesisanalytics/output-descriptions :portkey.aws.kinesisanalytics/cloud-watch-logging-option-descriptions :portkey.aws.kinesisanalytics/application-code :portkey.aws.kinesisanalytics/input-descriptions :portkey.aws.kinesisanalytics/reference-data-source-descriptions :portkey.aws.kinesisanalytics/application-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/in-app-stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z][a-zA-Z0-9_]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/cloud-watch-logging-option (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/log-stream-arn :portkey.aws.kinesisanalytics/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/lambda-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.unable-to-detect-schema-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/unable-to-detect-schema-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.unable-to-detect-schema-exception/message :portkey.aws.kinesisanalytics/raw-input-records :portkey.aws.kinesisanalytics/processed-input-records]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.kinesis-firehose-input-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.kinesis-firehose-input-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-firehose-input-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.kinesis-firehose-input-update/resource-arn-update :portkey.aws.kinesisanalytics.kinesis-firehose-input-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-version-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.kinesis-streams-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.kinesis-streams-output-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-streams-output-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.kinesis-streams-output-update/resource-arn-update :portkey.aws.kinesisanalytics.kinesis-streams-output-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-output-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-summaries (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/application-summary))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-output-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-output-request/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.delete-application-output-request/current-application-version-id :portkey.aws.kinesisanalytics.delete-application-output-request/output-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.add-application-output-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.add-application-output-request/current-application-version-id :portkey.aws.kinesisanalytics/output] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/create-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name] :opt-un [:portkey.aws.kinesisanalytics/application-description :portkey.aws.kinesisanalytics/inputs :portkey.aws.kinesisanalytics/outputs :portkey.aws.kinesisanalytics/cloud-watch-logging-options :portkey.aws.kinesisanalytics/application-code]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/parsed-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/parsed-input-record))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-description/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-description/name-prefix (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-description/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/input-processing-configuration-description :portkey.aws.kinesisanalytics.input-description/input-id :portkey.aws.kinesisanalytics/input-parallelism :portkey.aws.kinesisanalytics/in-app-stream-names :portkey.aws.kinesisanalytics/input-starting-position-configuration :portkey.aws.kinesisanalytics.input-description/name-prefix :portkey.aws.kinesisanalytics/kinesis-streams-input-description :portkey.aws.kinesisanalytics.input-description/input-schema :portkey.aws.kinesisanalytics/kinesis-firehose-input-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-update/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-update/name-prefix-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.input-update/input-id] :opt-un [:portkey.aws.kinesisanalytics.input-update/name-prefix-update :portkey.aws.kinesisanalytics/input-processing-configuration-update :portkey.aws.kinesisanalytics/kinesis-streams-input-update :portkey.aws.kinesisanalytics/kinesis-firehose-input-update :portkey.aws.kinesisanalytics/input-schema-update :portkey.aws.kinesisanalytics/input-parallelism-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-column-mapping (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-format (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/record-format-type] :opt-un [:portkey.aws.kinesisanalytics/mapping-parameters]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/output-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/output-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-streams-output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/start-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics/input-configurations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.output-description/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.output-description/name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.output-description/output-id :portkey.aws.kinesisanalytics.output-description/name :portkey.aws.kinesisanalytics/kinesis-streams-output-description :portkey.aws.kinesisanalytics/kinesis-firehose-output-description :portkey.aws.kinesisanalytics/lambda-output-description :portkey.aws.kinesisanalytics/destination-schema]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/parsed-input-record (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/parsed-input-record-field))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/cloud-watch-logging-option-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/cloud-watch-logging-option-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/describe-application-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-detail] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.cloud-watch-logging-option-update/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.cloud-watch-logging-option-update/log-stream-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/log-stream-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.cloud-watch-logging-option-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/cloud-watch-logging-option-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.cloud-watch-logging-option-update/cloud-watch-logging-option-id] :opt-un [:portkey.aws.kinesisanalytics.cloud-watch-logging-option-update/log-stream-arn-update :portkey.aws.kinesisanalytics.cloud-watch-logging-option-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-parallelism-update/count-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/input-parallelism-count))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-parallelism-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.input-parallelism-update/count-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.reference-data-source/table-name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.reference-data-source/reference-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/reference-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.reference-data-source/table-name :portkey.aws.kinesisanalytics.reference-data-source/reference-schema] :opt-un [:portkey.aws.kinesisanalytics/s-3-reference-data-source]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.add-application-cloud-watch-logging-option-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-cloud-watch-logging-option-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.add-application-cloud-watch-logging-option-request/current-application-version-id :portkey.aws.kinesisanalytics/cloud-watch-logging-option] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-reference-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/csv-mapping-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/record-row-delimiter :portkey.aws.kinesisanalytics/record-column-delimiter] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/discover-input-schema-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn :portkey.aws.kinesisanalytics/input-starting-position-configuration :portkey.aws.kinesisanalytics/s-3-configuration :portkey.aws.kinesisanalytics/input-processing-configuration]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-parallelism/count (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/input-parallelism-count))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-parallelism (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.input-parallelism/count]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.application-summary/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.application-summary/application-arn :portkey.aws.kinesisanalytics/application-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-column-delimiter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/update-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/in-app-stream-names (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/in-app-stream-name))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-column-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-row-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-parallelism-count (clojure.spec.alpha/int-in 1 64))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/s-3-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/role-arn :portkey.aws.kinesisanalytics/bucket-arn :portkey.aws.kinesisanalytics/file-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.s-3-reference-data-source/reference-role-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/s-3-reference-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/bucket-arn :portkey.aws.kinesisanalytics/file-key :portkey.aws.kinesisanalytics.s-3-reference-data-source/reference-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/destination-schema (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/record-format-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/outputs (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/output))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-input-processing-configuration-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-input-processing-configuration-request/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-input-processing-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.delete-application-input-processing-configuration-request/current-application-version-id :portkey.aws.kinesisanalytics.delete-application-input-processing-configuration-request/input-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-firehose-output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/processed-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/processed-input-record))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/json-mapping-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/record-row-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 102400))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/cloud-watch-logging-options (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/cloud-watch-logging-option))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.record-column/name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/record-column-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.record-column/mapping (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/record-column-mapping))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.record-column/sql-type (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/record-column-sql-type))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-column (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.record-column/name :portkey.aws.kinesisanalytics.record-column/sql-type] :opt-un [:portkey.aws.kinesisanalytics.record-column/mapping]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-lambda-processor-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-lambda-processor-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-lambda-processor-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.input-lambda-processor-update/resource-arn-update :portkey.aws.kinesisanalytics.input-lambda-processor-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-starting-position-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/input-starting-position]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.s-3-reference-data-source-description/reference-role-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/s-3-reference-data-source-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/bucket-arn :portkey.aws.kinesisanalytics/file-key :portkey.aws.kinesisanalytics.s-3-reference-data-source-description/reference-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-encoding (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"UTF-8" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-status #{:ready :starting "UPDATING" "READY" :deleting :running :stopping "STARTING" "DELETING" :updating "STOPPING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.reference-data-source-update/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.reference-data-source-update/table-name-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.reference-data-source-update/reference-schema-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/reference-data-source-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.reference-data-source-update/reference-id] :opt-un [:portkey.aws.kinesisanalytics.reference-data-source-update/table-name-update :portkey.aws.kinesisanalytics/s-3-reference-data-source-update :portkey.aws.kinesisanalytics.reference-data-source-update/reference-schema-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.unsupported-operation-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.unsupported-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/inputs (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/input))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-input-processing-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/processed-input-record (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/list-applications-input-limit (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.kinesis-streams-input-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.kinesis-streams-input-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-streams-input-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.kinesis-streams-input-update/resource-arn-update :portkey.aws.kinesisanalytics.kinesis-streams-input-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/file-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input/name-prefix (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.input/name-prefix :portkey.aws.kinesisanalytics.input/input-schema] :opt-un [:portkey.aws.kinesisanalytics/input-processing-configuration :portkey.aws.kinesisanalytics/kinesis-streams-input :portkey.aws.kinesisanalytics/kinesis-firehose-input :portkey.aws.kinesisanalytics/input-parallelism]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/input-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.add-application-input-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-input-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.add-application-input-request/current-application-version-id :portkey.aws.kinesisanalytics/input] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-input-processing-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.resource-provisioned-throughput-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/resource-provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.resource-provisioned-throughput-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.list-applications-request/limit (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/list-applications-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.list-applications-request/exclusive-start-application-name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/list-applications-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.list-applications-request/limit :portkey.aws.kinesisanalytics.list-applications-request/exclusive-start-application-name]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-output-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-column-sql-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/cloud-watch-logging-option-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/cloud-watch-logging-option-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-firehose-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/create-application-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-summary] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.s-3-reference-data-source-update/bucket-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/bucket-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.s-3-reference-data-source-update/file-key-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/file-key))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.s-3-reference-data-source-update/reference-role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/s-3-reference-data-source-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.s-3-reference-data-source-update/bucket-arn-update :portkey.aws.kinesisanalytics.s-3-reference-data-source-update/file-key-update :portkey.aws.kinesisanalytics.s-3-reference-data-source-update/reference-role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.output-update/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.output-update/name-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.output-update/destination-schema-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/destination-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/output-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.output-update/output-id] :opt-un [:portkey.aws.kinesisanalytics.output-update/name-update :portkey.aws.kinesisanalytics/kinesis-streams-output-update :portkey.aws.kinesisanalytics/kinesis-firehose-output-update :portkey.aws.kinesisanalytics/lambda-output-update :portkey.aws.kinesisanalytics.output-update/destination-schema-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-cloud-watch-logging-option-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-configurations (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/input-configuration))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-streams-input-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.add-application-reference-data-source-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-reference-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.add-application-reference-data-source-request/current-application-version-id :portkey.aws.kinesisanalytics/reference-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/parsed-input-record-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-processing-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/input-lambda-processor] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/mapping-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/json-mapping-parameters :portkey.aws.kinesisanalytics/csv-mapping-parameters]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-request/create-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.delete-application-request/create-timestamp] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-cloud-watch-logging-option-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.delete-application-cloud-watch-logging-option-request/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-cloud-watch-logging-option-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.delete-application-cloud-watch-logging-option-request/current-application-version-id :portkey.aws.kinesisanalytics.delete-application-cloud-watch-logging-option-request/cloud-watch-logging-option-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/reference-data-source-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/reference-data-source-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.add-application-input-processing-configuration-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.add-application-input-processing-configuration-request/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/add-application-input-processing-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.add-application-input-processing-configuration-request/current-application-version-id :portkey.aws.kinesisanalytics.add-application-input-processing-configuration-request/input-id :portkey.aws.kinesisanalytics/input-processing-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-firehose-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/in-app-table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z][a-zA-Z0-9_]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/start-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-columns (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/record-column :min-count 1 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-lambda-processor (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-schema-update/record-format-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/record-format))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-schema-update/record-encoding-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/record-encoding))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.input-schema-update/record-column-updates (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/record-columns))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-schema-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.input-schema-update/record-format-update :portkey.aws.kinesisanalytics.input-schema-update/record-encoding-update :portkey.aws.kinesisanalytics.input-schema-update/record-column-updates]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/lambda-output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.output/name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.output/name :portkey.aws.kinesisanalytics/destination-schema] :opt-un [:portkey.aws.kinesisanalytics/kinesis-streams-output :portkey.aws.kinesisanalytics/kinesis-firehose-output :portkey.aws.kinesisanalytics/lambda-output]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-firehose-input-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/delete-application-cloud-watch-logging-option-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.lambda-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.lambda-output-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/lambda-output-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.lambda-output-update/resource-arn-update :portkey.aws.kinesisanalytics.lambda-output-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-format-type #{"CSV" :csv "JSON" :json})

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.reference-data-source-description/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.reference-data-source-description/table-name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.reference-data-source-description/reference-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/reference-data-source-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.reference-data-source-description/reference-id :portkey.aws.kinesisanalytics.reference-data-source-description/table-name :portkey.aws.kinesisanalytics/s-3-reference-data-source-description] :opt-un [:portkey.aws.kinesisanalytics.reference-data-source-description/reference-schema]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/application-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/id :portkey.aws.kinesisanalytics/input-starting-position-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/source-schema (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/record-format :portkey.aws.kinesisanalytics/record-columns] :opt-un [:portkey.aws.kinesisanalytics/record-encoding]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-lambda-processor-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/input-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-streams-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/record-row-delimiter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.list-applications-response/has-more-applications (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/list-applications-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-summaries :portkey.aws.kinesisanalytics.list-applications-response/has-more-applications] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.update-application-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/update-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name :portkey.aws.kinesisanalytics.update-application-request/current-application-version-id :portkey.aws.kinesisanalytics/application-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/raw-input-record (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-streams-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/resource-arn :portkey.aws.kinesisanalytics/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-processing-configuration-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/input-lambda-processor-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.kinesis-firehose-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.kinesis-firehose-output-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/kinesis-firehose-output-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.kinesis-firehose-output-update/resource-arn-update :portkey.aws.kinesisanalytics.kinesis-firehose-output-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/output-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/output-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.invalid-application-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/invalid-application-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.invalid-application-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/describe-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics/application-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/reference-data-source-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/reference-data-source-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/bucket-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/input-starting-position #{"NOW" "TRIM_HORIZON" :now "LAST_STOPPED_POINT" :last-stopped-point :trim-horizon})

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics/raw-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics/raw-input-record))

(clojure.core/defn list-applications "Returns a list of Amazon Kinesis Analytics applications in your account. For\neach application, the response includes the application name, Amazon Resource\nName (ARN), and status. If the response returns the HasMoreApplications value as\ntrue, you can send another request by adding the ExclusiveStartApplicationName\nin the request body, and set the value of this to the last application name from\nthe previous response.\n If you want detailed information about a specific application, use\nDescribeApplication.\n This operation requires permissions to perform the\nkinesisanalytics:ListApplications action." ([] (list-applications {})) ([list-applications-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-applications-request list-applications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/list-applications-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/list-applications-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApplications", :http.request.configuration/output-deser-fn response-list-applications-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-applications :args (clojure.spec.alpha/? :portkey.aws.kinesisanalytics/list-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/list-applications-response))

(clojure.core/defn delete-application-output "Deletes output destination configuration from your application configuration.\nAmazon Kinesis Analytics will no longer write data from the corresponding\nin-application stream to the external output destination.\n This operation requires permissions to perform the\nkinesisanalytics:DeleteApplicationOutput action." ([delete-application-output-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-application-output-request delete-application-output-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/delete-application-output-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/delete-application-output-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationOutput", :http.request.configuration/output-deser-fn response-delete-application-output-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-application-output :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/delete-application-output-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/delete-application-output-response))

(clojure.core/defn stop-application "Stops the application from processing input data. You can stop an application\nonly if it is in the running state. You can use the DescribeApplication\noperation to find the application state. After the application is stopped,\nAmazon Kinesis Analytics stops reading data from the input, the application\nstops processing data, and there is no output written to the destination.\n This operation requires permissions to perform the\nkinesisanalytics:StopApplication action." ([stop-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-application-request stop-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/stop-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/stop-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopApplication", :http.request.configuration/output-deser-fn response-stop-application-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef stop-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/stop-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/stop-application-response))

(clojure.core/defn delete-application-reference-data-source "Deletes a reference data source configuration from the specified application\nconfiguration.\n If the application is running, Amazon Kinesis Analytics immediately removes the\nin-application table that you created using the\nAddApplicationReferenceDataSource operation.\n This operation requires permissions to perform the\nkinesisanalytics.DeleteApplicationReferenceDataSource action." ([delete-application-reference-data-source-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-application-reference-data-source-request delete-application-reference-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/delete-application-reference-data-source-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/delete-application-reference-data-source-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationReferenceDataSource", :http.request.configuration/output-deser-fn response-delete-application-reference-data-source-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-application-reference-data-source :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/delete-application-reference-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/delete-application-reference-data-source-response))

(clojure.core/defn delete-application "Deletes the specified application. Amazon Kinesis Analytics halts application\nexecution and deletes the application, including any application artifacts (such\nas in-application streams, reference table, and application code).\n This operation requires permissions to perform the\nkinesisanalytics:DeleteApplication action." ([delete-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-application-request delete-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/delete-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/delete-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplication", :http.request.configuration/output-deser-fn response-delete-application-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/delete-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/delete-application-response))

(clojure.core/defn delete-application-cloud-watch-logging-option "Deletes a CloudWatch log stream from an application. For more information about\nusing CloudWatch log streams with Amazon Kinesis Analytics applications, see\nWorking with Amazon CloudWatch Logs\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html)." ([delete-application-cloud-watch-logging-option-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-application-cloud-watch-logging-option-request delete-application-cloud-watch-logging-option-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/delete-application-cloud-watch-logging-option-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/delete-application-cloud-watch-logging-option-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationCloudWatchLoggingOption", :http.request.configuration/output-deser-fn response-delete-application-cloud-watch-logging-option-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-application-cloud-watch-logging-option :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/delete-application-cloud-watch-logging-option-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/delete-application-cloud-watch-logging-option-response))

(clojure.core/defn describe-application "Returns information about a specific Amazon Kinesis Analytics application.\n If you want to retrieve a list of all applications in your account, use the\nListApplications operation.\n This operation requires permissions to perform the\nkinesisanalytics:DescribeApplication action. You can use DescribeApplication to\nget the current application versionId, which you need to call other operations\nsuch as Update." ([describe-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-application-request describe-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/describe-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/describe-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeApplication", :http.request.configuration/output-deser-fn response-describe-application-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef describe-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/describe-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/describe-application-response))

(clojure.core/defn add-application-input-processing-configuration "Adds an InputProcessingConfiguration to an application. An input processor\npreprocesses records on the input stream before the application's SQL code\nexecutes. Currently, the only input processor available is AWS Lambda\n(https://aws.amazon.com/documentation/lambda/)." ([add-application-input-processing-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-application-input-processing-configuration-request add-application-input-processing-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/add-application-input-processing-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/add-application-input-processing-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationInputProcessingConfiguration", :http.request.configuration/output-deser-fn response-add-application-input-processing-configuration-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef add-application-input-processing-configuration :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/add-application-input-processing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/add-application-input-processing-configuration-response))

(clojure.core/defn add-application-reference-data-source "Adds a reference data source to an existing application.\n Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object)\nand creates an in-application table within your application. In the request, you\nprovide the source (S3 bucket name and object key name), name of the\nin-application table to create, and the necessary mapping information that\ndescribes how data in Amazon S3 object maps to columns in the resulting\nin-application table.\n For conceptual information, see Configuring Application Input\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html).\nFor the limits on data sources you can add to your application, see Limits\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html).\n This operation requires permissions to perform the\nkinesisanalytics:AddApplicationOutput action." ([add-application-reference-data-source-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-application-reference-data-source-request add-application-reference-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/add-application-reference-data-source-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/add-application-reference-data-source-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationReferenceDataSource", :http.request.configuration/output-deser-fn response-add-application-reference-data-source-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef add-application-reference-data-source :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/add-application-reference-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/add-application-reference-data-source-response))

(clojure.core/defn update-application "Updates an existing Amazon Kinesis Analytics application. Using this API, you\ncan update application code, input configuration, and output configuration.\n Note that Amazon Kinesis Analytics updates the CurrentApplicationVersionId each\ntime you update your application.\n This operation requires permission for the kinesisanalytics:UpdateApplication\naction." ([update-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-application-request update-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/update-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/update-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateApplication", :http.request.configuration/output-deser-fn response-update-application-response, :http.request.spec/error-spec {"CodeValidationException" :portkey.aws.kinesisanalytics/code-validation-exception, "ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/update-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/update-application-response))

(clojure.core/defn add-application-cloud-watch-logging-option "Adds a CloudWatch log stream to monitor application configuration errors. For\nmore information about using CloudWatch log streams with Amazon Kinesis\nAnalytics applications, see Working with Amazon CloudWatch Logs\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html)." ([add-application-cloud-watch-logging-option-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-application-cloud-watch-logging-option-request add-application-cloud-watch-logging-option-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/add-application-cloud-watch-logging-option-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/add-application-cloud-watch-logging-option-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationCloudWatchLoggingOption", :http.request.configuration/output-deser-fn response-add-application-cloud-watch-logging-option-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef add-application-cloud-watch-logging-option :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/add-application-cloud-watch-logging-option-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/add-application-cloud-watch-logging-option-response))

(clojure.core/defn create-application " Creates an Amazon Kinesis Analytics application. You can configure each\napplication with one streaming source as input, application code to process the\ninput, and up to three destinations where you want Amazon Kinesis Analytics to\nwrite the output data from your application. For an overview, see How it Works\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works.html).\n In the input configuration, you map the streaming source to an in-application\nstream, which you can think of as a constantly updating table. In the mapping,\nyou must provide a schema for the in-application stream and map each data column\nin the in-application stream to a data element in the streaming source.\n Your application code is one or more SQL statements that read input data,\ntransform it, and generate output. Your application code can create one or more\nSQL artifacts like SQL streams or pumps.\n In the output configuration, you can configure the application to write data\nfrom in-application streams created in your applications to up to three\ndestinations.\n To read data from your source stream or write data to destination streams,\nAmazon Kinesis Analytics needs your permissions. You grant these permissions by\ncreating IAM roles. This operation requires permissions to perform the\nkinesisanalytics:CreateApplication action.\n For introductory exercises to create an Amazon Kinesis Analytics application,\nsee Getting Started\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/getting-started.html)." ([create-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-application-request create-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/create-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/create-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApplication", :http.request.configuration/output-deser-fn response-create-application-response, :http.request.spec/error-spec {"CodeValidationException" :portkey.aws.kinesisanalytics/code-validation-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesisanalytics/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/create-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/create-application-response))

(clojure.core/defn add-application-input " Adds a streaming source to your Amazon Kinesis application. For conceptual\ninformation, see Configuring Application Input\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html).\n You can add a streaming source either when you create an application or you can\nuse this operation to add a streaming source after you create an application.\nFor more information, see CreateApplication.\n Any configuration update, including adding a streaming source using this\noperation, results in a new version of the application. You can use the\nDescribeApplication operation to find the current application version.\n This operation requires permissions to perform the\nkinesisanalytics:AddApplicationInput action." ([add-application-input-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-application-input-request add-application-input-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/add-application-input-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/add-application-input-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationInput", :http.request.configuration/output-deser-fn response-add-application-input-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "CodeValidationException" :portkey.aws.kinesisanalytics/code-validation-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef add-application-input :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/add-application-input-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/add-application-input-response))

(clojure.core/defn add-application-output "Adds an external destination to your Amazon Kinesis Analytics application.\n If you want Amazon Kinesis Analytics to deliver data from an in-application\nstream within your application to an external destination (such as an Amazon\nKinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda\nfunction), you add the relevant configuration to your application using this\noperation. You can configure one or more outputs for your application. Each\noutput configuration maps an in-application stream and an external destination.\n You can use one of the output configurations to deliver data from your\nin-application error stream to an external destination so that you can analyze\nthe errors. For more information, see Understanding Application Output\n(Destination)\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html).\n Any configuration update, including adding a streaming source using this\noperation, results in a new version of the application. You can use the\nDescribeApplication operation to find the current application version.\n For the limits on the number of application inputs and outputs you can\nconfigure, see Limits\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html).\n This operation requires permissions to perform the\nkinesisanalytics:AddApplicationOutput action." ([add-application-output-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-application-output-request add-application-output-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/add-application-output-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/add-application-output-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddApplicationOutput", :http.request.configuration/output-deser-fn response-add-application-output-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef add-application-output :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/add-application-output-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/add-application-output-response))

(clojure.core/defn discover-input-schema "Infers a schema by evaluating sample records on the specified streaming source\n(Amazon Kinesis stream or Amazon Kinesis Firehose delivery stream) or S3 object.\nIn the response, the operation returns the inferred schema and also the sample\nrecords that the operation used to infer the schema.\n You can use the inferred schema when configuring a streaming source for your\napplication. For conceptual information, see Configuring Application Input\n(http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html).\nNote that when you create an application using the Amazon Kinesis Analytics\nconsole, the console uses this operation to infer a schema and show it in the\nconsole user interface.\n This operation requires permissions to perform the\nkinesisanalytics:DiscoverInputSchema action." ([] (discover-input-schema {})) ([discover-input-schema-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-discover-input-schema-request discover-input-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/discover-input-schema-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/discover-input-schema-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DiscoverInputSchema", :http.request.configuration/output-deser-fn response-discover-input-schema-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "UnableToDetectSchemaException" :portkey.aws.kinesisanalytics/unable-to-detect-schema-exception, "ResourceProvisionedThroughputExceededException" :portkey.aws.kinesisanalytics/resource-provisioned-throughput-exceeded-exception, "ServiceUnavailableException" :portkey.aws.kinesisanalytics/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef discover-input-schema :args (clojure.spec.alpha/? :portkey.aws.kinesisanalytics/discover-input-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/discover-input-schema-response))

(clojure.core/defn start-application "Starts the specified Amazon Kinesis Analytics application. After creating an\napplication, you must exclusively call this operation to start your application.\n After the application starts, it begins consuming the input data, processes it,\nand writes the output to the configured destination.\n The application status must be READY for you to start an application. You can\nget the application status in the console or using the DescribeApplication\noperation.\n After you start the application, you can stop the application from processing\nthe input by calling the StopApplication operation.\n This operation requires permissions to perform the\nkinesisanalytics:StartApplication action." ([start-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-application-request start-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/start-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/start-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartApplication", :http.request.configuration/output-deser-fn response-start-application-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "InvalidApplicationConfigurationException" :portkey.aws.kinesisanalytics/invalid-application-configuration-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef start-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/start-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/start-application-response))

(clojure.core/defn delete-application-input-processing-configuration "Deletes an InputProcessingConfiguration from an input." ([delete-application-input-processing-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-application-input-processing-configuration-request delete-application-input-processing-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics/endpoints, :http.request.configuration/target-prefix "KinesisAnalytics_20150814", :http.request.spec/output-spec :portkey.aws.kinesisanalytics/delete-application-input-processing-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics/delete-application-input-processing-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationInputProcessingConfiguration", :http.request.configuration/output-deser-fn response-delete-application-input-processing-configuration-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics/concurrent-modification-exception, "UnsupportedOperationException" :portkey.aws.kinesisanalytics/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-application-input-processing-configuration :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics/delete-application-input-processing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics/delete-application-input-processing-configuration-response))
