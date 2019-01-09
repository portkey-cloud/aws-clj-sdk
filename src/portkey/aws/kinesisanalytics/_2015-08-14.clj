(ns portkey.aws.kinesisanalytics.-2015-08-14 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope
    {:service "kinesisanalytics", :region "eu-west-1"},
    :ssl-common-name "kinesisanalytics.eu-west-1.amazonaws.com",
    :endpoint "https://kinesisanalytics.eu-west-1.amazonaws.com",
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

(clojure.core/defn- ser-destination-schema [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DestinationSchema", :type "structure"} (clojure.core/contains? input :record-format-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-format-type (input :record-format-type)) #:http.request.field{:name "RecordFormatType", :shape "RecordFormatType"}))))

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

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-processing-configuration-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/input-lambda-processor-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/stop-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/stop-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.application-update/application-code-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-code))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/input-updates :portkey.aws.kinesisanalytics.-2015-08-14.application-update/application-code-update :portkey.aws.kinesisanalytics.-2015-08-14/output-updates :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source-updates :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option-updates]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-reference-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/log-stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.code-validation-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/code-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.code-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.discover-input-schema-response/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/discover-input-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.discover-input-schema-response/input-schema :portkey.aws.kinesisanalytics.-2015-08-14/parsed-input-records :portkey.aws.kinesisanalytics.-2015-08-14/processed-input-records :portkey.aws.kinesisanalytics.-2015-08-14/raw-input-records]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.cloud-watch-logging-option-description/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/log-stream-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.cloud-watch-logging-option-description/cloud-watch-logging-option-id]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-reference-data-source-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-reference-data-source-request/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-reference-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-reference-data-source-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-reference-data-source-request/reference-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.application-detail/create-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.application-detail/last-update-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.application-detail/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.application-detail/application-arn :portkey.aws.kinesisanalytics.-2015-08-14/application-status :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.application-detail/create-timestamp :portkey.aws.kinesisanalytics.-2015-08-14.application-detail/last-update-timestamp :portkey.aws.kinesisanalytics.-2015-08-14/output-descriptions :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option-descriptions :portkey.aws.kinesisanalytics.-2015-08-14/application-code :portkey.aws.kinesisanalytics.-2015-08-14/input-descriptions :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source-descriptions :portkey.aws.kinesisanalytics.-2015-08-14/application-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z][a-zA-Z0-9_]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/log-stream-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/lambda-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.unable-to-detect-schema-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/unable-to-detect-schema-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.unable-to-detect-schema-exception/message :portkey.aws.kinesisanalytics.-2015-08-14/raw-input-records :portkey.aws.kinesisanalytics.-2015-08-14/processed-input-records]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-firehose-input-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-firehose-input-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-input-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.kinesis-firehose-input-update/resource-arn-update :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-firehose-input-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-streams-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-streams-output-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-output-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.kinesis-streams-output-update/resource-arn-update :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-streams-output-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-output-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-summaries (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/application-summary))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-output-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-output-request/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-output-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-output-request/output-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.add-application-output-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.add-application-output-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14/output] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/create-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-description :portkey.aws.kinesisanalytics.-2015-08-14/inputs :portkey.aws.kinesisanalytics.-2015-08-14/outputs :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-options :portkey.aws.kinesisanalytics.-2015-08-14/application-code]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/parsed-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/parsed-input-record))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-description/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-description/name-prefix (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-description/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/input-processing-configuration-description :portkey.aws.kinesisanalytics.-2015-08-14.input-description/input-id :portkey.aws.kinesisanalytics.-2015-08-14/input-parallelism :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-names :portkey.aws.kinesisanalytics.-2015-08-14/input-starting-position-configuration :portkey.aws.kinesisanalytics.-2015-08-14.input-description/name-prefix :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-input-description :portkey.aws.kinesisanalytics.-2015-08-14.input-description/input-schema :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-input-description]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-update/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-update/name-prefix-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.input-update/input-id] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.input-update/name-prefix-update :portkey.aws.kinesisanalytics.-2015-08-14/input-processing-configuration-update :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-input-update :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-input-update :portkey.aws.kinesisanalytics.-2015-08-14/input-schema-update :portkey.aws.kinesisanalytics.-2015-08-14/input-parallelism-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-column-mapping (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-format (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/record-format-type] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/mapping-parameters]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/output-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/output-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/start-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14/input-configurations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.output-description/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.output-description/name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.output-description/output-id :portkey.aws.kinesisanalytics.-2015-08-14.output-description/name :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-output-description :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-output-description :portkey.aws.kinesisanalytics.-2015-08-14/lambda-output-description :portkey.aws.kinesisanalytics.-2015-08-14/destination-schema]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/parsed-input-record (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/parsed-input-record-field))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/describe-application-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-detail] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.cloud-watch-logging-option-update/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.cloud-watch-logging-option-update/log-stream-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/log-stream-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.cloud-watch-logging-option-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.cloud-watch-logging-option-update/cloud-watch-logging-option-id] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.cloud-watch-logging-option-update/log-stream-arn-update :portkey.aws.kinesisanalytics.-2015-08-14.cloud-watch-logging-option-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-parallelism-update/count-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/input-parallelism-count))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-parallelism-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.input-parallelism-update/count-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source/table-name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source/reference-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source/table-name :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source/reference-schema] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/s-3-reference-data-source]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.add-application-cloud-watch-logging-option-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-cloud-watch-logging-option-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.add-application-cloud-watch-logging-option-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-reference-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/csv-mapping-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/record-row-delimiter :portkey.aws.kinesisanalytics.-2015-08-14/record-column-delimiter] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/discover-input-schema-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn :portkey.aws.kinesisanalytics.-2015-08-14/input-starting-position-configuration :portkey.aws.kinesisanalytics.-2015-08-14/s-3-configuration :portkey.aws.kinesisanalytics.-2015-08-14/input-processing-configuration]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-parallelism/count (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/input-parallelism-count))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-parallelism (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.input-parallelism/count]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.application-summary/application-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.application-summary/application-arn :portkey.aws.kinesisanalytics.-2015-08-14/application-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-column-delimiter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/update-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-names (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-name))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-column-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-row-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-parallelism-count (clojure.spec.alpha/int-in 1 64))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/s-3-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/role-arn :portkey.aws.kinesisanalytics.-2015-08-14/bucket-arn :portkey.aws.kinesisanalytics.-2015-08-14/file-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source/reference-role-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/s-3-reference-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/bucket-arn :portkey.aws.kinesisanalytics.-2015-08-14/file-key :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source/reference-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/destination-schema (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/record-format-type]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/outputs (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/output))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-input-processing-configuration-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-input-processing-configuration-request/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-input-processing-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-input-processing-configuration-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-input-processing-configuration-request/input-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/processed-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/processed-input-record))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/json-mapping-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/record-row-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 51200))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-options (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.record-column/name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/record-column-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.record-column/mapping (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/record-column-mapping))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.record-column/sql-type (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/record-column-sql-type))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-column (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.record-column/name :portkey.aws.kinesisanalytics.-2015-08-14.record-column/sql-type] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.record-column/mapping]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-lambda-processor-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-lambda-processor-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-lambda-processor-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.input-lambda-processor-update/resource-arn-update :portkey.aws.kinesisanalytics.-2015-08-14.input-lambda-processor-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-starting-position-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/input-starting-position]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source-description/reference-role-arn (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/s-3-reference-data-source-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/bucket-arn :portkey.aws.kinesisanalytics.-2015-08-14/file-key :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source-description/reference-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-encoding (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"UTF-8" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-status #{:ready :starting "UPDATING" "READY" :deleting :running :stopping "STARTING" "DELETING" :updating "STOPPING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-update/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-update/table-name-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-update/reference-schema-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-update/reference-id] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-update/table-name-update :portkey.aws.kinesisanalytics.-2015-08-14/s-3-reference-data-source-update :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-update/reference-schema-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/inputs (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/input))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-processing-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/processed-input-record (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/list-applications-input-limit (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-streams-input-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-streams-input-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-input-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.kinesis-streams-input-update/resource-arn-update :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-streams-input-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/file-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input/name-prefix (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input/input-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.input/name-prefix :portkey.aws.kinesisanalytics.-2015-08-14.input/input-schema] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/input-processing-configuration :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-input :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-input :portkey.aws.kinesisanalytics.-2015-08-14/input-parallelism]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/input-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.add-application-input-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.add-application-input-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14/input] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-input-processing-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.resource-provisioned-throughput-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/resource-provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.resource-provisioned-throughput-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.list-applications-request/limit (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/list-applications-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.list-applications-request/exclusive-start-application-name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/list-applications-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.list-applications-request/limit :portkey.aws.kinesisanalytics.-2015-08-14.list-applications-request/exclusive-start-application-name]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-output-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-column-sql-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/cloud-watch-logging-option-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/create-application-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-summary] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source-update/bucket-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/bucket-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source-update/file-key-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/file-key))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source-update/reference-role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/s-3-reference-data-source-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source-update/bucket-arn-update :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source-update/file-key-update :portkey.aws.kinesisanalytics.-2015-08-14.s-3-reference-data-source-update/reference-role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.output-update/output-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.output-update/name-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.output-update/destination-schema-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/destination-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/output-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.output-update/output-id] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.output-update/name-update :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-output-update :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-output-update :portkey.aws.kinesisanalytics.-2015-08-14/lambda-output-update :portkey.aws.kinesisanalytics.-2015-08-14.output-update/destination-schema-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-cloud-watch-logging-option-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-configurations (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/input-configuration))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-input-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.add-application-reference-data-source-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-reference-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.add-application-reference-data-source-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/parsed-input-record-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-processing-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/input-lambda-processor] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/mapping-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/json-mapping-parameters :portkey.aws.kinesisanalytics.-2015-08-14/csv-mapping-parameters]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-request/create-timestamp (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-request/create-timestamp] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-cloud-watch-logging-option-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-cloud-watch-logging-option-request/cloud-watch-logging-option-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-cloud-watch-logging-option-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-cloud-watch-logging-option-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14.delete-application-cloud-watch-logging-option-request/cloud-watch-logging-option-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source-descriptions (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source-description))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.add-application-input-processing-configuration-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.add-application-input-processing-configuration-request/input-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-processing-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.add-application-input-processing-configuration-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14.add-application-input-processing-configuration-request/input-id :portkey.aws.kinesisanalytics.-2015-08-14/input-processing-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/in-app-table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z][a-zA-Z0-9_]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/start-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-columns (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/record-column :min-count 1 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-lambda-processor (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-schema-update/record-format-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/record-format))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-schema-update/record-encoding-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/record-encoding))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.input-schema-update/record-column-updates (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/record-columns))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-schema-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.input-schema-update/record-format-update :portkey.aws.kinesisanalytics.-2015-08-14.input-schema-update/record-encoding-update :portkey.aws.kinesisanalytics.-2015-08-14.input-schema-update/record-column-updates]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/lambda-output-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.output/name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.output/name :portkey.aws.kinesisanalytics.-2015-08-14/destination-schema] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-output :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-output :portkey.aws.kinesisanalytics.-2015-08-14/lambda-output]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-input-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-cloud-watch-logging-option-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.lambda-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.lambda-output-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/lambda-output-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.lambda-output-update/resource-arn-update :portkey.aws.kinesisanalytics.-2015-08-14.lambda-output-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-format-type #{"CSV" :csv "JSON" :json})

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-description/reference-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-description/table-name (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/in-app-table-name))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-description/reference-schema (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/source-schema))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source-description (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-description/reference-id :portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-description/table-name :portkey.aws.kinesisanalytics.-2015-08-14/s-3-reference-data-source-description] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.reference-data-source-description/reference-schema]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/application-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/id :portkey.aws.kinesisanalytics.-2015-08-14/input-starting-position-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/source-schema (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/record-format :portkey.aws.kinesisanalytics.-2015-08-14/record-columns] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/record-encoding]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-lambda-processor-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/input-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/record-row-delimiter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.list-applications-response/has-more-applications (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/boolean-object))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/list-applications-response (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-summaries :portkey.aws.kinesisanalytics.-2015-08-14.list-applications-response/has-more-applications] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.update-application-request/current-application-version-id (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/application-version-id))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/update-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name :portkey.aws.kinesisanalytics.-2015-08-14.update-application-request/current-application-version-id :portkey.aws.kinesisanalytics.-2015-08-14/application-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 50)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/raw-input-record (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-streams-output (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/resource-arn :portkey.aws.kinesisanalytics.-2015-08-14/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-processing-configuration-update (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/input-lambda-processor-update] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-firehose-output-update/resource-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-firehose-output-update/role-arn-update (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/role-arn))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/kinesis-firehose-output-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.kinesis-firehose-output-update/resource-arn-update :portkey.aws.kinesisanalytics.-2015-08-14.kinesis-firehose-output-update/role-arn-update]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/output-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/output-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14.invalid-application-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/invalid-application-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesisanalytics.-2015-08-14.invalid-application-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/describe-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesisanalytics.-2015-08-14/application-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source-updates (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/reference-data-source-update))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/bucket-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/input-starting-position #{"NOW" "TRIM_HORIZON" :now "LAST_STOPPED_POINT" :last-stopped-point :trim-horizon})

(clojure.spec.alpha/def :portkey.aws.kinesisanalytics.-2015-08-14/raw-input-records (clojure.spec.alpha/coll-of :portkey.aws.kinesisanalytics.-2015-08-14/raw-input-record))

(clojure.core/defn list-applications ([] (list-applications {})) ([list-applications-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-applications-request list-applications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/list-applications-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/list-applications-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListApplications", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-applications :args (clojure.spec.alpha/? :portkey.aws.kinesisanalytics.-2015-08-14/list-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/list-applications-response))

(clojure.core/defn delete-application-output ([delete-application-output-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-application-output-request delete-application-output-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-output-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-output-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplicationOutput", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-application-output :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-output-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-output-response))

(clojure.core/defn stop-application ([stop-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-application-request stop-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/stop-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/stop-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopApplication", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef stop-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/stop-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/stop-application-response))

(clojure.core/defn delete-application-reference-data-source ([delete-application-reference-data-source-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-application-reference-data-source-request delete-application-reference-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-reference-data-source-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-reference-data-source-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplicationReferenceDataSource", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-application-reference-data-source :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-reference-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-reference-data-source-response))

(clojure.core/defn delete-application ([delete-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-application-request delete-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplication", :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception, "ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-response))

(clojure.core/defn delete-application-cloud-watch-logging-option ([delete-application-cloud-watch-logging-option-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-application-cloud-watch-logging-option-request delete-application-cloud-watch-logging-option-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-cloud-watch-logging-option-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-cloud-watch-logging-option-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplicationCloudWatchLoggingOption", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-application-cloud-watch-logging-option :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-cloud-watch-logging-option-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-cloud-watch-logging-option-response))

(clojure.core/defn describe-application ([describe-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-application-request describe-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/describe-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/describe-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeApplication", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/describe-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/describe-application-response))

(clojure.core/defn add-application-input-processing-configuration ([add-application-input-processing-configuration-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-application-input-processing-configuration-request add-application-input-processing-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-processing-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-processing-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddApplicationInputProcessingConfiguration", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef add-application-input-processing-configuration :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-processing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-processing-configuration-response))

(clojure.core/defn add-application-reference-data-source ([add-application-reference-data-source-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-application-reference-data-source-request add-application-reference-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-reference-data-source-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-reference-data-source-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddApplicationReferenceDataSource", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef add-application-reference-data-source :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/add-application-reference-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/add-application-reference-data-source-response))

(clojure.core/defn update-application ([update-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-application-request update-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/update-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/update-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateApplication", :http.request.spec/error-spec {"CodeValidationException" :portkey.aws.kinesisanalytics.-2015-08-14/code-validation-exception, "ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/update-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/update-application-response))

(clojure.core/defn add-application-cloud-watch-logging-option ([add-application-cloud-watch-logging-option-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-application-cloud-watch-logging-option-request add-application-cloud-watch-logging-option-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-cloud-watch-logging-option-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-cloud-watch-logging-option-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddApplicationCloudWatchLoggingOption", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef add-application-cloud-watch-logging-option :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/add-application-cloud-watch-logging-option-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/add-application-cloud-watch-logging-option-response))

(clojure.core/defn create-application ([create-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-application-request create-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/create-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/create-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateApplication", :http.request.spec/error-spec {"CodeValidationException" :portkey.aws.kinesisanalytics.-2015-08-14/code-validation-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "LimitExceededException" :portkey.aws.kinesisanalytics.-2015-08-14/limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/create-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/create-application-response))

(clojure.core/defn add-application-input ([add-application-input-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-application-input-request add-application-input-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddApplicationInput", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception, "CodeValidationException" :portkey.aws.kinesisanalytics.-2015-08-14/code-validation-exception}})))))
(clojure.spec.alpha/fdef add-application-input :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/add-application-input-response))

(clojure.core/defn add-application-output ([add-application-output-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-application-output-request add-application-output-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-output-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/add-application-output-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddApplicationOutput", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef add-application-output :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/add-application-output-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/add-application-output-response))

(clojure.core/defn discover-input-schema ([] (discover-input-schema {})) ([discover-input-schema-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-discover-input-schema-request discover-input-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/discover-input-schema-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/discover-input-schema-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DiscoverInputSchema", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "UnableToDetectSchemaException" :portkey.aws.kinesisanalytics.-2015-08-14/unable-to-detect-schema-exception, "ResourceProvisionedThroughputExceededException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-provisioned-throughput-exceeded-exception, "ServiceUnavailableException" :portkey.aws.kinesisanalytics.-2015-08-14/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef discover-input-schema :args (clojure.spec.alpha/? :portkey.aws.kinesisanalytics.-2015-08-14/discover-input-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/discover-input-schema-response))

(clojure.core/defn start-application ([start-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-application-request start-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/start-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/start-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartApplication", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "InvalidApplicationConfigurationException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-application-configuration-exception}})))))
(clojure.spec.alpha/fdef start-application :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/start-application-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/start-application-response))

(clojure.core/defn delete-application-input-processing-configuration ([delete-application-input-processing-configuration-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-application-input-processing-configuration-request delete-application-input-processing-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.kinesisanalytics.-2015-08-14/endpoints, :http.request.spec/output-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-input-processing-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-14", :http.request.configuration/service-id "Kinesis Analytics", :http.request.spec/input-spec :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-input-processing-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplicationInputProcessingConfiguration", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisanalytics.-2015-08-14/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.kinesisanalytics.-2015-08-14/invalid-argument-exception, "ConcurrentModificationException" :portkey.aws.kinesisanalytics.-2015-08-14/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef delete-application-input-processing-configuration :args (clojure.spec.alpha/tuple :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-input-processing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.kinesisanalytics.-2015-08-14/delete-application-input-processing-configuration-response))
