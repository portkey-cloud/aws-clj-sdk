(ns portkey.aws.machinelearning.-2014-12-12 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope
    {:service "machinelearning", :region "eu-west-1"},
    :ssl-common-name "machinelearning.eu-west-1.amazonaws.com",
    :endpoint "https://machinelearning.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "machinelearning", :region "us-east-1"},
    :ssl-common-name "machinelearning.us-east-1.amazonaws.com",
    :endpoint "https://machinelearning.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-edp-security-group-ids)

(clojure.core/declare ser-redshift-database-username)

(clojure.core/declare ser-ml-model-type)

(clojure.core/declare ser-rds-database-name)

(clojure.core/declare ser-data-source-filter-variable)

(clojure.core/declare ser-variable-value)

(clojure.core/declare ser-compute-statistics)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-rds-database)

(clojure.core/declare ser-entity-name)

(clojure.core/declare ser-evaluation-filter-variable)

(clojure.core/declare ser-data-rearrangement)

(clojure.core/declare ser-edp-resource-role)

(clojure.core/declare ser-data-schema)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-redshift-database-credentials)

(clojure.core/declare ser-training-parameters)

(clojure.core/declare ser-comparator-value)

(clojure.core/declare ser-redshift-select-sql-query)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-taggable-resource-type)

(clojure.core/declare ser-redshift-data-spec)

(clojure.core/declare ser-verbose)

(clojure.core/declare ser-redshift-database-name)

(clojure.core/declare ser-edp-security-group-id)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-redshift-database)

(clojure.core/declare ser-variable-name)

(clojure.core/declare ser-recipe)

(clojure.core/declare ser-edp-service-role)

(clojure.core/declare ser-string-type)

(clojure.core/declare ser-batch-prediction-filter-variable)

(clojure.core/declare ser-s-3-data-spec)

(clojure.core/declare ser-redshift-cluster-identifier)

(clojure.core/declare ser-record)

(clojure.core/declare ser-edp-subnet-id)

(clojure.core/declare ser-rds-database-password)

(clojure.core/declare ser-s-3-url)

(clojure.core/declare ser-rds-select-sql-query)

(clojure.core/declare ser-redshift-database-password)

(clojure.core/declare ser-rds-instance-identifier)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-entity-id)

(clojure.core/declare ser-page-limit)

(clojure.core/declare ser-vip-url)

(clojure.core/declare ser-rds-data-spec)

(clojure.core/declare ser-ml-model-filter-variable)

(clojure.core/declare ser-score-threshold)

(clojure.core/declare ser-rds-database-username)

(clojure.core/declare ser-rds-database-credentials)

(clojure.core/defn- ser-edp-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-edp-security-group-id coll) #:http.request.field{:shape "EDPSecurityGroupId"}))) input), :shape "EDPSecurityGroupIds", :type "list"})

(clojure.core/defn- ser-redshift-database-username [input] #:http.request.field{:value input, :shape "RedshiftDatabaseUsername"})

(clojure.core/defn- ser-ml-model-type [input] #:http.request.field{:value (clojure.core/get {"REGRESSION" "REGRESSION", :regression "REGRESSION", "BINARY" "BINARY", :binary "BINARY", "MULTICLASS" "MULTICLASS", :multiclass "MULTICLASS"} input), :shape "MLModelType"})

(clojure.core/defn- ser-rds-database-name [input] #:http.request.field{:value input, :shape "RDSDatabaseName"})

(clojure.core/defn- ser-data-source-filter-variable [input] #:http.request.field{:value (clojure.core/get {:iam-user "IAMUser", :name "Name", "Status" "Status", "LastUpdatedAt" "LastUpdatedAt", "DataLocationS3" "DataLocationS3", :last-updated-at "LastUpdatedAt", :status "Status", "IAMUser" "IAMUser", "CreatedAt" "CreatedAt", :data-location-s-3 "DataLocationS3", "Name" "Name", :created-at "CreatedAt"} input), :shape "DataSourceFilterVariable"})

(clojure.core/defn- ser-variable-value [input] #:http.request.field{:value input, :shape "VariableValue"})

(clojure.core/defn- ser-compute-statistics [input] #:http.request.field{:value input, :shape "ComputeStatistics"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleARN"})

(clojure.core/defn- ser-rds-database [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-rds-instance-identifier (:instance-identifier input)) #:http.request.field{:name "InstanceIdentifier", :shape "RDSInstanceIdentifier"}) (clojure.core/into (ser-rds-database-name (:database-name input)) #:http.request.field{:name "DatabaseName", :shape "RDSDatabaseName"})], :shape "RDSDatabase", :type "structure"}))

(clojure.core/defn- ser-entity-name [input] #:http.request.field{:value input, :shape "EntityName"})

(clojure.core/defn- ser-evaluation-filter-variable [input] #:http.request.field{:value (clojure.core/get {"MLModelId" "MLModelId", :data-source-id "DataSourceId", :iam-user "IAMUser", "DataURI" "DataURI", :name "Name", :ml-model-id "MLModelId", "DataSourceId" "DataSourceId", "Status" "Status", "LastUpdatedAt" "LastUpdatedAt", :last-updated-at "LastUpdatedAt", :status "Status", "IAMUser" "IAMUser", "CreatedAt" "CreatedAt", "Name" "Name", :created-at "CreatedAt", :data-uri "DataURI"} input), :shape "EvaluationFilterVariable"})

(clojure.core/defn- ser-data-rearrangement [input] #:http.request.field{:value input, :shape "DataRearrangement"})

(clojure.core/defn- ser-edp-resource-role [input] #:http.request.field{:value input, :shape "EDPResourceRole"})

(clojure.core/defn- ser-data-schema [input] #:http.request.field{:value input, :shape "DataSchema"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"asc" "asc", :asc "asc", "dsc" "dsc", :dsc "dsc"} input), :shape "SortOrder"})

(clojure.core/defn- ser-redshift-database-credentials [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-redshift-database-username (:username input)) #:http.request.field{:name "Username", :shape "RedshiftDatabaseUsername"}) (clojure.core/into (ser-redshift-database-password (:password input)) #:http.request.field{:name "Password", :shape "RedshiftDatabasePassword"})], :shape "RedshiftDatabaseCredentials", :type "structure"}))

(clojure.core/defn- ser-training-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string-type k) #:http.request.field{:map-info "key", :shape "StringType"}) (clojure.core/into (ser-string-type v) #:http.request.field{:map-info "value", :shape "StringType"})])) input), :shape "TrainingParameters", :type "map"})

(clojure.core/defn- ser-comparator-value [input] #:http.request.field{:value input, :shape "ComparatorValue"})

(clojure.core/defn- ser-redshift-select-sql-query [input] #:http.request.field{:value input, :shape "RedshiftSelectSqlQuery"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 100})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 100})

(clojure.core/defn- ser-taggable-resource-type [input] #:http.request.field{:value (clojure.core/get {"BatchPrediction" "BatchPrediction", :batch-prediction "BatchPrediction", "DataSource" "DataSource", :data-source "DataSource", "Evaluation" "Evaluation", :evaluation "Evaluation", "MLModel" "MLModel", :ml-model "MLModel"} input), :shape "TaggableResourceType"})

(clojure.core/defn- ser-redshift-data-spec [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-redshift-database (:database-information input)) #:http.request.field{:name "DatabaseInformation", :shape "RedshiftDatabase"}) (clojure.core/into (ser-redshift-select-sql-query (:select-sql-query input)) #:http.request.field{:name "SelectSqlQuery", :shape "RedshiftSelectSqlQuery"}) (clojure.core/into (ser-redshift-database-credentials (:database-credentials input)) #:http.request.field{:name "DatabaseCredentials", :shape "RedshiftDatabaseCredentials"}) (clojure.core/into (ser-s-3-url (:s-3-staging-location input)) #:http.request.field{:name "S3StagingLocation", :shape "S3Url"})], :shape "RedshiftDataSpec", :type "structure"} (clojure.core/contains? input :data-rearrangement) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-rearrangement (input :data-rearrangement)) #:http.request.field{:name "DataRearrangement", :shape "DataRearrangement"})) (clojure.core/contains? input :data-schema) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-schema (input :data-schema)) #:http.request.field{:name "DataSchema", :shape "DataSchema"})) (clojure.core/contains? input :data-schema-uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-url (input :data-schema-uri)) #:http.request.field{:name "DataSchemaUri", :shape "S3Url"}))))

(clojure.core/defn- ser-verbose [input] #:http.request.field{:value input, :shape "Verbose"})

(clojure.core/defn- ser-redshift-database-name [input] #:http.request.field{:value input, :shape "RedshiftDatabaseName"})

(clojure.core/defn- ser-edp-security-group-id [input] #:http.request.field{:value input, :shape "EDPSecurityGroupId"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-redshift-database [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-redshift-database-name (:database-name input)) #:http.request.field{:name "DatabaseName", :shape "RedshiftDatabaseName"}) (clojure.core/into (ser-redshift-cluster-identifier (:cluster-identifier input)) #:http.request.field{:name "ClusterIdentifier", :shape "RedshiftClusterIdentifier"})], :shape "RedshiftDatabase", :type "structure"}))

(clojure.core/defn- ser-variable-name [input] #:http.request.field{:value input, :shape "VariableName"})

(clojure.core/defn- ser-recipe [input] #:http.request.field{:value input, :shape "Recipe"})

(clojure.core/defn- ser-edp-service-role [input] #:http.request.field{:value input, :shape "EDPServiceRole"})

(clojure.core/defn- ser-string-type [input] #:http.request.field{:value input, :shape "StringType"})

(clojure.core/defn- ser-batch-prediction-filter-variable [input] #:http.request.field{:value (clojure.core/get {"MLModelId" "MLModelId", :data-source-id "DataSourceId", :iam-user "IAMUser", "DataURI" "DataURI", :name "Name", :ml-model-id "MLModelId", "DataSourceId" "DataSourceId", "Status" "Status", "LastUpdatedAt" "LastUpdatedAt", :last-updated-at "LastUpdatedAt", :status "Status", "IAMUser" "IAMUser", "CreatedAt" "CreatedAt", "Name" "Name", :created-at "CreatedAt", :data-uri "DataURI"} input), :shape "BatchPredictionFilterVariable"})

(clojure.core/defn- ser-s-3-data-spec [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-url (:data-location-s-3 input)) #:http.request.field{:name "DataLocationS3", :shape "S3Url"})], :shape "S3DataSpec", :type "structure"} (clojure.core/contains? input :data-rearrangement) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-rearrangement (input :data-rearrangement)) #:http.request.field{:name "DataRearrangement", :shape "DataRearrangement"})) (clojure.core/contains? input :data-schema) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-schema (input :data-schema)) #:http.request.field{:name "DataSchema", :shape "DataSchema"})) (clojure.core/contains? input :data-schema-location-s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-url (input :data-schema-location-s-3)) #:http.request.field{:name "DataSchemaLocationS3", :shape "S3Url"}))))

(clojure.core/defn- ser-redshift-cluster-identifier [input] #:http.request.field{:value input, :shape "RedshiftClusterIdentifier"})

(clojure.core/defn- ser-record [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-variable-name k) #:http.request.field{:map-info "key", :shape "VariableName"}) (clojure.core/into (ser-variable-value v) #:http.request.field{:map-info "value", :shape "VariableValue"})])) input), :shape "Record", :type "map"})

(clojure.core/defn- ser-edp-subnet-id [input] #:http.request.field{:value input, :shape "EDPSubnetId"})

(clojure.core/defn- ser-rds-database-password [input] #:http.request.field{:value input, :shape "RDSDatabasePassword"})

(clojure.core/defn- ser-s-3-url [input] #:http.request.field{:value input, :shape "S3Url"})

(clojure.core/defn- ser-rds-select-sql-query [input] #:http.request.field{:value input, :shape "RDSSelectSqlQuery"})

(clojure.core/defn- ser-redshift-database-password [input] #:http.request.field{:value input, :shape "RedshiftDatabasePassword"})

(clojure.core/defn- ser-rds-instance-identifier [input] #:http.request.field{:value input, :shape "RDSInstanceIdentifier"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-entity-id [input] #:http.request.field{:value input, :shape "EntityId"})

(clojure.core/defn- ser-page-limit [input] #:http.request.field{:value input, :shape "PageLimit"})

(clojure.core/defn- ser-vip-url [input] #:http.request.field{:value input, :shape "VipURL"})

(clojure.core/defn- ser-rds-data-spec [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-rds-database (:database-information input)) #:http.request.field{:name "DatabaseInformation", :shape "RDSDatabase"}) (clojure.core/into (ser-rds-select-sql-query (:select-sql-query input)) #:http.request.field{:name "SelectSqlQuery", :shape "RDSSelectSqlQuery"}) (clojure.core/into (ser-rds-database-credentials (:database-credentials input)) #:http.request.field{:name "DatabaseCredentials", :shape "RDSDatabaseCredentials"}) (clojure.core/into (ser-s-3-url (:s-3-staging-location input)) #:http.request.field{:name "S3StagingLocation", :shape "S3Url"}) (clojure.core/into (ser-edp-resource-role (:resource-role input)) #:http.request.field{:name "ResourceRole", :shape "EDPResourceRole"}) (clojure.core/into (ser-edp-service-role (:service-role input)) #:http.request.field{:name "ServiceRole", :shape "EDPServiceRole"}) (clojure.core/into (ser-edp-subnet-id (:subnet-id input)) #:http.request.field{:name "SubnetId", :shape "EDPSubnetId"}) (clojure.core/into (ser-edp-security-group-ids (:security-group-ids input)) #:http.request.field{:name "SecurityGroupIds", :shape "EDPSecurityGroupIds"})], :shape "RDSDataSpec", :type "structure"} (clojure.core/contains? input :data-schema-uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-url (input :data-schema-uri)) #:http.request.field{:name "DataSchemaUri", :shape "S3Url"})) (clojure.core/contains? input :data-rearrangement) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-rearrangement (input :data-rearrangement)) #:http.request.field{:name "DataRearrangement", :shape "DataRearrangement"})) (clojure.core/contains? input :data-schema) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-schema (input :data-schema)) #:http.request.field{:name "DataSchema", :shape "DataSchema"}))))

(clojure.core/defn- ser-ml-model-filter-variable [input] #:http.request.field{:value (clojure.core/get {"MLModelType" "MLModelType", "TrainingDataURI" "TrainingDataURI", :iam-user "IAMUser", :realtime-endpoint-status "RealtimeEndpointStatus", :algorithm "Algorithm", :training-data-uri "TrainingDataURI", :name "Name", "Status" "Status", "LastUpdatedAt" "LastUpdatedAt", :ml-model-type "MLModelType", "TrainingDataSourceId" "TrainingDataSourceId", "Algorithm" "Algorithm", :last-updated-at "LastUpdatedAt", :status "Status", "IAMUser" "IAMUser", "CreatedAt" "CreatedAt", :training-data-source-id "TrainingDataSourceId", "Name" "Name", :created-at "CreatedAt", "RealtimeEndpointStatus" "RealtimeEndpointStatus"} input), :shape "MLModelFilterVariable"})

(clojure.core/defn- ser-score-threshold [input] #:http.request.field{:value input, :shape "ScoreThreshold"})

(clojure.core/defn- ser-rds-database-username [input] #:http.request.field{:value input, :shape "RDSDatabaseUsername"})

(clojure.core/defn- ser-rds-database-credentials [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-rds-database-username (:username input)) #:http.request.field{:name "Username", :shape "RDSDatabaseUsername"}) (clojure.core/into (ser-rds-database-password (:password input)) #:http.request.field{:name "Password", :shape "RDSDatabasePassword"})], :shape "RDSDatabaseCredentials", :type "structure"}))

(clojure.core/defn- req-describe-evaluations-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :prefix)) #:http.request.field{:name "Prefix", :shape "ComparatorValue"})) (clojure.core/contains? input :ne) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :ne)) #:http.request.field{:name "NE", :shape "ComparatorValue"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :lt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :lt)) #:http.request.field{:name "LT", :shape "ComparatorValue"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PageLimit"})) (clojure.core/contains? input :ge) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :ge)) #:http.request.field{:name "GE", :shape "ComparatorValue"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "StringType"})) (clojure.core/contains? input :le) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :le)) #:http.request.field{:name "LE", :shape "ComparatorValue"})) (clojure.core/contains? input :eq) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :eq)) #:http.request.field{:name "EQ", :shape "ComparatorValue"})) (clojure.core/contains? input :filter-variable) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-evaluation-filter-variable (input :filter-variable)) #:http.request.field{:name "FilterVariable", :shape "EvaluationFilterVariable"})) (clojure.core/contains? input :gt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :gt)) #:http.request.field{:name "GT", :shape "ComparatorValue"}))))

(clojure.core/defn- req-describe-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "EntityId"}) (clojure.core/into (ser-taggable-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TaggableResourceType"})]}))

(clojure.core/defn- req-describe-data-sources-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :prefix)) #:http.request.field{:name "Prefix", :shape "ComparatorValue"})) (clojure.core/contains? input :ne) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :ne)) #:http.request.field{:name "NE", :shape "ComparatorValue"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :lt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :lt)) #:http.request.field{:name "LT", :shape "ComparatorValue"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PageLimit"})) (clojure.core/contains? input :ge) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :ge)) #:http.request.field{:name "GE", :shape "ComparatorValue"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "StringType"})) (clojure.core/contains? input :le) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :le)) #:http.request.field{:name "LE", :shape "ComparatorValue"})) (clojure.core/contains? input :eq) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :eq)) #:http.request.field{:name "EQ", :shape "ComparatorValue"})) (clojure.core/contains? input :filter-variable) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-source-filter-variable (input :filter-variable)) #:http.request.field{:name "FilterVariable", :shape "DataSourceFilterVariable"})) (clojure.core/contains? input :gt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :gt)) #:http.request.field{:name "GT", :shape "ComparatorValue"}))))

(clojure.core/defn- req-update-ml-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"})]} (clojure.core/contains? input :ml-model-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-name (input :ml-model-name)) #:http.request.field{:name "MLModelName", :shape "EntityName"})) (clojure.core/contains? input :score-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-score-threshold (input :score-threshold)) #:http.request.field{:name "ScoreThreshold", :shape "ScoreThreshold"}))))

(clojure.core/defn- req-get-ml-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"})]} (clojure.core/contains? input :verbose) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verbose (input :verbose)) #:http.request.field{:name "Verbose", :shape "Verbose"}))))

(clojure.core/defn- req-delete-ml-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"})]}))

(clojure.core/defn- req-update-data-source-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :data-source-id)) #:http.request.field{:name "DataSourceId", :shape "EntityId"}) (clojure.core/into (ser-entity-name (input :data-source-name)) #:http.request.field{:name "DataSourceName", :shape "EntityName"})]}))

(clojure.core/defn- req-get-evaluation-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :evaluation-id)) #:http.request.field{:name "EvaluationId", :shape "EntityId"})]}))

(clojure.core/defn- req-describe-batch-predictions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :prefix)) #:http.request.field{:name "Prefix", :shape "ComparatorValue"})) (clojure.core/contains? input :ne) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :ne)) #:http.request.field{:name "NE", :shape "ComparatorValue"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :lt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :lt)) #:http.request.field{:name "LT", :shape "ComparatorValue"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PageLimit"})) (clojure.core/contains? input :ge) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :ge)) #:http.request.field{:name "GE", :shape "ComparatorValue"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "StringType"})) (clojure.core/contains? input :le) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :le)) #:http.request.field{:name "LE", :shape "ComparatorValue"})) (clojure.core/contains? input :eq) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :eq)) #:http.request.field{:name "EQ", :shape "ComparatorValue"})) (clojure.core/contains? input :filter-variable) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-prediction-filter-variable (input :filter-variable)) #:http.request.field{:name "FilterVariable", :shape "BatchPredictionFilterVariable"})) (clojure.core/contains? input :gt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :gt)) #:http.request.field{:name "GT", :shape "ComparatorValue"}))))

(clojure.core/defn- req-create-data-source-from-rds-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :data-source-id)) #:http.request.field{:name "DataSourceId", :shape "EntityId"}) (clojure.core/into (ser-rds-data-spec (input :rds-data)) #:http.request.field{:name "RDSData", :shape "RDSDataSpec"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})]} (clojure.core/contains? input :data-source-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-name (input :data-source-name)) #:http.request.field{:name "DataSourceName", :shape "EntityName"})) (clojure.core/contains? input :compute-statistics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-statistics (input :compute-statistics)) #:http.request.field{:name "ComputeStatistics", :shape "ComputeStatistics"}))))

(clojure.core/defn- req-describe-ml-models-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :prefix)) #:http.request.field{:name "Prefix", :shape "ComparatorValue"})) (clojure.core/contains? input :ne) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :ne)) #:http.request.field{:name "NE", :shape "ComparatorValue"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :lt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :lt)) #:http.request.field{:name "LT", :shape "ComparatorValue"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-limit (input :limit)) #:http.request.field{:name "Limit", :shape "PageLimit"})) (clojure.core/contains? input :ge) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :ge)) #:http.request.field{:name "GE", :shape "ComparatorValue"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "StringType"})) (clojure.core/contains? input :le) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :le)) #:http.request.field{:name "LE", :shape "ComparatorValue"})) (clojure.core/contains? input :eq) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :eq)) #:http.request.field{:name "EQ", :shape "ComparatorValue"})) (clojure.core/contains? input :filter-variable) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ml-model-filter-variable (input :filter-variable)) #:http.request.field{:name "FilterVariable", :shape "MLModelFilterVariable"})) (clojure.core/contains? input :gt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparator-value (input :gt)) #:http.request.field{:name "GT", :shape "ComparatorValue"}))))

(clojure.core/defn- req-create-batch-prediction-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :batch-prediction-id)) #:http.request.field{:name "BatchPredictionId", :shape "EntityId"}) (clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"}) (clojure.core/into (ser-entity-id (input :batch-prediction-data-source-id)) #:http.request.field{:name "BatchPredictionDataSourceId", :shape "EntityId"}) (clojure.core/into (ser-s-3-url (input :output-uri)) #:http.request.field{:name "OutputUri", :shape "S3Url"})]} (clojure.core/contains? input :batch-prediction-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-name (input :batch-prediction-name)) #:http.request.field{:name "BatchPredictionName", :shape "EntityName"}))))

(clojure.core/defn- req-create-evaluation-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :evaluation-id)) #:http.request.field{:name "EvaluationId", :shape "EntityId"}) (clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"}) (clojure.core/into (ser-entity-id (input :evaluation-data-source-id)) #:http.request.field{:name "EvaluationDataSourceId", :shape "EntityId"})]} (clojure.core/contains? input :evaluation-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-name (input :evaluation-name)) #:http.request.field{:name "EvaluationName", :shape "EntityName"}))))

(clojure.core/defn- req-get-data-source-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :data-source-id)) #:http.request.field{:name "DataSourceId", :shape "EntityId"})]} (clojure.core/contains? input :verbose) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verbose (input :verbose)) #:http.request.field{:name "Verbose", :shape "Verbose"}))))

(clojure.core/defn- req-delete-data-source-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :data-source-id)) #:http.request.field{:name "DataSourceId", :shape "EntityId"})]}))

(clojure.core/defn- req-create-data-source-from-redshift-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :data-source-id)) #:http.request.field{:name "DataSourceId", :shape "EntityId"}) (clojure.core/into (ser-redshift-data-spec (input :data-spec)) #:http.request.field{:name "DataSpec", :shape "RedshiftDataSpec"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})]} (clojure.core/contains? input :data-source-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-name (input :data-source-name)) #:http.request.field{:name "DataSourceName", :shape "EntityName"})) (clojure.core/contains? input :compute-statistics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-statistics (input :compute-statistics)) #:http.request.field{:name "ComputeStatistics", :shape "ComputeStatistics"}))))

(clojure.core/defn- req-update-batch-prediction-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :batch-prediction-id)) #:http.request.field{:name "BatchPredictionId", :shape "EntityId"}) (clojure.core/into (ser-entity-name (input :batch-prediction-name)) #:http.request.field{:name "BatchPredictionName", :shape "EntityName"})]}))

(clojure.core/defn- req-delete-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"}) (clojure.core/into (ser-entity-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "EntityId"}) (clojure.core/into (ser-taggable-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TaggableResourceType"})]}))

(clojure.core/defn- req-create-data-source-from-s-3-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :data-source-id)) #:http.request.field{:name "DataSourceId", :shape "EntityId"}) (clojure.core/into (ser-s-3-data-spec (input :data-spec)) #:http.request.field{:name "DataSpec", :shape "S3DataSpec"})]} (clojure.core/contains? input :data-source-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-name (input :data-source-name)) #:http.request.field{:name "DataSourceName", :shape "EntityName"})) (clojure.core/contains? input :compute-statistics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-statistics (input :compute-statistics)) #:http.request.field{:name "ComputeStatistics", :shape "ComputeStatistics"}))))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}) (clojure.core/into (ser-entity-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "EntityId"}) (clojure.core/into (ser-taggable-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TaggableResourceType"})]}))

(clojure.core/defn- req-delete-batch-prediction-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :batch-prediction-id)) #:http.request.field{:name "BatchPredictionId", :shape "EntityId"})]}))

(clojure.core/defn- req-update-evaluation-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :evaluation-id)) #:http.request.field{:name "EvaluationId", :shape "EntityId"}) (clojure.core/into (ser-entity-name (input :evaluation-name)) #:http.request.field{:name "EvaluationName", :shape "EntityName"})]}))

(clojure.core/defn- req-delete-realtime-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"})]}))

(clojure.core/defn- req-predict-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"}) (clojure.core/into (ser-record (input :record)) #:http.request.field{:name "Record", :shape "Record"}) (clojure.core/into (ser-vip-url (input :predict-endpoint)) #:http.request.field{:name "PredictEndpoint", :shape "VipURL"})]}))

(clojure.core/defn- req-create-realtime-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"})]}))

(clojure.core/defn- req-get-batch-prediction-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :batch-prediction-id)) #:http.request.field{:name "BatchPredictionId", :shape "EntityId"})]}))

(clojure.core/defn- req-delete-evaluation-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :evaluation-id)) #:http.request.field{:name "EvaluationId", :shape "EntityId"})]}))

(clojure.core/defn- req-create-ml-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :ml-model-id)) #:http.request.field{:name "MLModelId", :shape "EntityId"}) (clojure.core/into (ser-ml-model-type (input :ml-model-type)) #:http.request.field{:name "MLModelType", :shape "MLModelType"}) (clojure.core/into (ser-entity-id (input :training-data-source-id)) #:http.request.field{:name "TrainingDataSourceId", :shape "EntityId"})]} (clojure.core/contains? input :ml-model-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-name (input :ml-model-name)) #:http.request.field{:name "MLModelName", :shape "EntityName"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "TrainingParameters"})) (clojure.core/contains? input :recipe) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recipe (input :recipe)) #:http.request.field{:name "Recipe", :shape "Recipe"})) (clojure.core/contains? input :recipe-uri) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-url (input :recipe-uri)) #:http.request.field{:name "RecipeUri", :shape "S3Url"}))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/edp-security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.machinelearning.-2014-12-12/edp-security-group-id))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/score-value-per-label-map (clojure.spec.alpha/map-of :portkey.aws.machinelearning.-2014-12-12/label :portkey.aws.machinelearning.-2014-12-12/score-value))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-database-username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/ml-model-type #{:binary "MULTICLASS" :regression "REGRESSION" :multiclass "BINARY"})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/prefix (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/ne (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/lt (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/limit (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/page-limit))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/ge (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/le (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/eq (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/filter-variable (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/evaluation-filter-variable))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/gt (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-evaluations-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/prefix :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/ne :portkey.aws.machinelearning.-2014-12-12/sort-order :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/lt :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/limit :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/ge :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/next-token :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/le :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/eq :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/filter-variable :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-input/gt]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-tags-input/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-tags-input/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.describe-tags-input/resource-id :portkey.aws.machinelearning.-2014-12-12.describe-tags-input/resource-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/performance-metrics-property-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/edp-pipeline-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-database-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/prefix (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/ne (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/lt (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/limit (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/page-limit))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/ge (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/le (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/eq (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/filter-variable (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/data-source-filter-variable))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/gt (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-data-sources-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/prefix :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/ne :portkey.aws.machinelearning.-2014-12-12/sort-order :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/lt :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/limit :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/ge :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/next-token :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/le :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/eq :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/filter-variable :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-input/gt]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-ml-model-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-ml-model-input/ml-model-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/update-ml-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.update-ml-model-input/ml-model-id] :opt-un [:portkey.aws.machinelearning.-2014-12-12.update-ml-model-input/ml-model-name :portkey.aws.machinelearning.-2014-12-12/score-threshold]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/data-source-filter-variable #{:iam-user :name "Status" "LastUpdatedAt" "DataLocationS3" :last-updated-at :status "IAMUser" "CreatedAt" :data-location-s-3 "Name" :created-at})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/variable-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/compute-statistics clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/presigned-s-3-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/get-ml-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.get-ml-model-input/ml-model-id] :opt-un [:portkey.aws.machinelearning.-2014-12-12/verbose]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-ml-model-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-ml-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.delete-ml-model-input/ml-model-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 110))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-database/instance-identifier (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-instance-identifier))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-database/database-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-database-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-database (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.rds-database/instance-identifier :portkey.aws.machinelearning.-2014-12-12.rds-database/database-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/evaluation-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.evaluation/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/evaluation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.evaluation/ml-model-id :portkey.aws.machinelearning.-2014-12-12.evaluation/created-by-iam-user :portkey.aws.machinelearning.-2014-12-12.evaluation/finished-at :portkey.aws.machinelearning.-2014-12-12.evaluation/status :portkey.aws.machinelearning.-2014-12-12.evaluation/last-updated-at :portkey.aws.machinelearning.-2014-12-12/message :portkey.aws.machinelearning.-2014-12-12.evaluation/compute-time :portkey.aws.machinelearning.-2014-12-12.evaluation/evaluation-id :portkey.aws.machinelearning.-2014-12-12.evaluation/created-at :portkey.aws.machinelearning.-2014-12-12.evaluation/evaluation-data-source-id :portkey.aws.machinelearning.-2014-12-12.evaluation/name :portkey.aws.machinelearning.-2014-12-12.evaluation/input-data-location-s-3 :portkey.aws.machinelearning.-2014-12-12/performance-metrics :portkey.aws.machinelearning.-2014-12-12.evaluation/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-data-source-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-data-source-input/data-source-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/update-data-source-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.update-data-source-input/data-source-id :portkey.aws.machinelearning.-2014-12-12.update-data-source-input/data-source-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/entity-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #".*\S.*|^$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-tags-output/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-tags-output/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.delete-tags-output/resource-id :portkey.aws.machinelearning.-2014-12-12.delete-tags-output/resource-type]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/evaluation-filter-variable #{"MLModelId" :data-source-id :iam-user "DataURI" :name :ml-model-id "DataSourceId" "Status" "LastUpdatedAt" :last-updated-at :status "IAMUser" "CreatedAt" "Name" :created-at :data-uri})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/data-rearrangement (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/edp-resource-role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-metadata/database (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-database))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-metadata/database-user-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-database-username))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-metadata/select-sql-query (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-select-sql-query))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-metadata/resource-role (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/edp-resource-role))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-metadata/service-role (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/edp-service-role))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-metadata/data-pipeline-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/edp-pipeline-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.rds-metadata/database :portkey.aws.machinelearning.-2014-12-12.rds-metadata/database-user-name :portkey.aws.machinelearning.-2014-12-12.rds-metadata/select-sql-query :portkey.aws.machinelearning.-2014-12-12.rds-metadata/resource-role :portkey.aws.machinelearning.-2014-12-12.rds-metadata/service-role :portkey.aws.machinelearning.-2014-12-12.rds-metadata/data-pipeline-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/data-schema (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 131071))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-evaluation-output/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/update-evaluation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.update-evaluation-output/evaluation-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.add-tags-output/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.add-tags-output/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.add-tags-output/resource-id :portkey.aws.machinelearning.-2014-12-12.add-tags-output/resource-type]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/log-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/presigned-s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/batch-prediction-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/output-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/invalid-record-count (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/total-record-count (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/get-batch-prediction-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/ml-model-id :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/created-by-iam-user :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/finished-at :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/log-uri :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/batch-prediction-data-source-id :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/status :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/last-updated-at :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/output-uri :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/invalid-record-count :portkey.aws.machinelearning.-2014-12-12/message :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/compute-time :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/batch-prediction-id :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/created-at :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/total-record-count :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/name :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/input-data-location-s-3 :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-output/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/sort-order #{:asc "dsc" "asc" :dsc})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-input/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/get-evaluation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.get-evaluation-input/evaluation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-ml-model-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-ml-model-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-ml-model-output/ml-model-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/ml-models (clojure.spec.alpha/coll-of :portkey.aws.machinelearning.-2014-12-12/ml-model))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/prefix (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/ne (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/lt (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/limit (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/page-limit))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/ge (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/le (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/eq (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/filter-variable (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/batch-prediction-filter-variable))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/gt (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-batch-predictions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/prefix :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/ne :portkey.aws.machinelearning.-2014-12-12/sort-order :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/lt :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/limit :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/ge :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/next-token :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/le :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/eq :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/filter-variable :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-input/gt]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.limit-exceeded-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.limit-exceeded-exception/message :portkey.aws.machinelearning.-2014-12-12.limit-exceeded-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-rds-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-rds-input/data-source-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-rds-input/rds-data (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-data-spec))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-rds-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-rds-input/data-source-id :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-rds-input/rds-data :portkey.aws.machinelearning.-2014-12-12/role-arn] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-rds-input/data-source-name :portkey.aws.machinelearning.-2014-12-12/compute-statistics]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/integer-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/schema (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/data-schema))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/log-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/presigned-s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/size-in-bytes (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/training-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/score-threshold-last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/endpoint-info (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/realtime-endpoint-info))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/ml-model-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/get-ml-model-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/ml-model-id :portkey.aws.machinelearning.-2014-12-12/ml-model-type :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/schema :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/created-by-iam-user :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/finished-at :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/log-uri :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/size-in-bytes :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/status :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/last-updated-at :portkey.aws.machinelearning.-2014-12-12/training-parameters :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/training-data-source-id :portkey.aws.machinelearning.-2014-12-12/message :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/compute-time :portkey.aws.machinelearning.-2014-12-12/recipe :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/created-at :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/score-threshold-last-updated-at :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/endpoint-info :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/name :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/input-data-location-s-3 :portkey.aws.machinelearning.-2014-12-12/score-threshold :portkey.aws.machinelearning.-2014-12-12.get-ml-model-output/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.tag-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/tag-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.tag-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/aws-user-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws:iam::[0-9]+:((user/.+)|(root))" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-database-credentials/username (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-database-username))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-database-credentials/password (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-database-password))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-database-credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.redshift-database-credentials/username :portkey.aws.machinelearning.-2014-12-12.redshift-database-credentials/password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-ml-model-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/update-ml-model-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.update-ml-model-output/ml-model-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-output/results (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/batch-predictions))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-output/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-batch-predictions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-output/results :portkey.aws.machinelearning.-2014-12-12.describe-batch-predictions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-batch-prediction-output/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/update-batch-prediction-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.update-batch-prediction-output/batch-prediction-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/log-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/presigned-s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/evaluation-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/get-evaluation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/ml-model-id :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/created-by-iam-user :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/finished-at :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/log-uri :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/status :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/last-updated-at :portkey.aws.machinelearning.-2014-12-12/message :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/compute-time :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/evaluation-id :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/created-at :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/evaluation-data-source-id :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/name :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/input-data-location-s-3 :portkey.aws.machinelearning.-2014-12-12/performance-metrics :portkey.aws.machinelearning.-2014-12-12.get-evaluation-output/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-data-source-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/update-data-source-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.update-data-source-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-redshift-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-redshift-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-redshift-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-s-3-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-s-3-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-s-3-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/long-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/prefix (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/ne (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/lt (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/limit (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/page-limit))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/ge (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/le (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/eq (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/filter-variable (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/ml-model-filter-variable))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/gt (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-ml-models-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/prefix :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/ne :portkey.aws.machinelearning.-2014-12-12/sort-order :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/lt :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/limit :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/ge :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/next-token :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/le :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/eq :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/filter-variable :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-input/gt]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/training-parameters (clojure.spec.alpha/map-of :portkey.aws.machinelearning.-2014-12-12/string-type :portkey.aws.machinelearning.-2014-12-12/string-type))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/batch-prediction-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/batch-prediction-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/output-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-batch-prediction-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/batch-prediction-id :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/ml-model-id :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/batch-prediction-data-source-id :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/output-uri] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-input/batch-prediction-name]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-evaluation-input/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-evaluation-input/evaluation-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-evaluation-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-evaluation-input/evaluation-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-evaluation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.create-evaluation-input/evaluation-id :portkey.aws.machinelearning.-2014-12-12.create-evaluation-input/ml-model-id :portkey.aws.machinelearning.-2014-12-12.create-evaluation-input/evaluation-data-source-id] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-evaluation-input/evaluation-name]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/performance-metrics-property-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/comparator-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #".*\S.*|^$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-select-sql-query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 16777216))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-output/results (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/ml-models))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-output/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-ml-models-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-ml-models-output/results :portkey.aws.machinelearning.-2014-12-12.describe-ml-models-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/data-sources (clojure.spec.alpha/coll-of :portkey.aws.machinelearning.-2014-12-12/data-source))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/tag-list (clojure.spec.alpha/coll-of :portkey.aws.machinelearning.-2014-12-12/tag :max-count 100))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/get-data-source-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.get-data-source-input/data-source-id] :opt-un [:portkey.aws.machinelearning.-2014-12-12/verbose]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.invalid-tag-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.invalid-tag-exception/message]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.machinelearning.-2014-12-12/tag-key :max-count 100))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/taggable-resource-type #{"Evaluation" :data-source :ml-model "MLModel" :evaluation "DataSource" "BatchPrediction" :batch-prediction})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/database-information (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-database))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/select-sql-query (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-select-sql-query))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/database-credentials (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-database-credentials))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/s-3-staging-location (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/data-schema-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-data-spec (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/database-information :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/select-sql-query :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/database-credentials :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/s-3-staging-location] :opt-un [:portkey.aws.machinelearning.-2014-12-12/data-rearrangement :portkey.aws.machinelearning.-2014-12-12/data-schema :portkey.aws.machinelearning.-2014-12-12.redshift-data-spec/data-schema-uri]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-data-source-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-data-source-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.delete-data-source-input/data-source-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/performance-metrics-properties (clojure.spec.alpha/map-of :portkey.aws.machinelearning.-2014-12-12/performance-metrics-property-key :portkey.aws.machinelearning.-2014-12-12/performance-metrics-property-value))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/verbose clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/algorithm #{"sgd" :sgd})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-redshift-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-redshift-input/data-source-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-redshift-input/data-spec (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-data-spec))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-redshift-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-redshift-input/data-source-id :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-redshift-input/data-spec :portkey.aws.machinelearning.-2014-12-12/role-arn] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-redshift-input/data-source-name :portkey.aws.machinelearning.-2014-12-12/compute-statistics]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/error-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-batch-prediction-input/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-batch-prediction-input/batch-prediction-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/update-batch-prediction-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.update-batch-prediction-input/batch-prediction-id :portkey.aws.machinelearning.-2014-12-12.update-batch-prediction-input/batch-prediction-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-database-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-z0-9]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.resource-not-found-exception/message :portkey.aws.machinelearning.-2014-12-12.resource-not-found-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.internal-server-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.internal-server-exception/message :portkey.aws.machinelearning.-2014-12-12.internal-server-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/size-in-bytes (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/training-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/score-threshold-last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/endpoint-info (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/realtime-endpoint-info))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/ml-model-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.ml-model/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/ml-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.ml-model/ml-model-id :portkey.aws.machinelearning.-2014-12-12/ml-model-type :portkey.aws.machinelearning.-2014-12-12.ml-model/created-by-iam-user :portkey.aws.machinelearning.-2014-12-12.ml-model/finished-at :portkey.aws.machinelearning.-2014-12-12.ml-model/size-in-bytes :portkey.aws.machinelearning.-2014-12-12.ml-model/status :portkey.aws.machinelearning.-2014-12-12.ml-model/last-updated-at :portkey.aws.machinelearning.-2014-12-12/training-parameters :portkey.aws.machinelearning.-2014-12-12.ml-model/training-data-source-id :portkey.aws.machinelearning.-2014-12-12/algorithm :portkey.aws.machinelearning.-2014-12-12/message :portkey.aws.machinelearning.-2014-12-12.ml-model/compute-time :portkey.aws.machinelearning.-2014-12-12.ml-model/created-at :portkey.aws.machinelearning.-2014-12-12.ml-model/score-threshold-last-updated-at :portkey.aws.machinelearning.-2014-12-12.ml-model/endpoint-info :portkey.aws.machinelearning.-2014-12-12.ml-model/name :portkey.aws.machinelearning.-2014-12-12.ml-model/input-data-location-s-3 :portkey.aws.machinelearning.-2014-12-12/score-threshold :portkey.aws.machinelearning.-2014-12-12.ml-model/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/evaluations (clojure.spec.alpha/coll-of :portkey.aws.machinelearning.-2014-12-12/evaluation))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/edp-security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-tags-input/tag-keys (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-tags-input/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-tags-input/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.delete-tags-input/tag-keys :portkey.aws.machinelearning.-2014-12-12.delete-tags-input/resource-id :portkey.aws.machinelearning.-2014-12-12.delete-tags-input/resource-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.idempotent-parameter-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.idempotent-parameter-mismatch-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.idempotent-parameter-mismatch-exception/message :portkey.aws.machinelearning.-2014-12-12.idempotent-parameter-mismatch-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.invalid-input-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.invalid-input-exception/message :portkey.aws.machinelearning.-2014-12-12.invalid-input-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/ml-model-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-database/database-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-database-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-database/cluster-identifier (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-cluster-identifier))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-database (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.redshift-database/database-name :portkey.aws.machinelearning.-2014-12-12.redshift-database/cluster-identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/entity-status #{"COMPLETED" :deleted :inprogress :pending :completed "PENDING" "FAILED" "DELETED" "INPROGRESS" :failed})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-s-3-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-s-3-input/data-source-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-s-3-input/data-spec (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-data-spec))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-s-3-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-s-3-input/data-source-id :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-s-3-input/data-spec] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-s-3-input/data-source-name :portkey.aws.machinelearning.-2014-12-12/compute-statistics]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/tag-list))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.add-tags-input/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.add-tags-input/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.add-tags-input/tags :portkey.aws.machinelearning.-2014-12-12.add-tags-input/resource-id :portkey.aws.machinelearning.-2014-12-12.add-tags-input/resource-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-batch-prediction-input/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-batch-prediction-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.delete-batch-prediction-input/batch-prediction-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-evaluation-input/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.update-evaluation-input/evaluation-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/update-evaluation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.update-evaluation-input/evaluation-id :portkey.aws.machinelearning.-2014-12-12.update-evaluation-input/evaluation-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-batch-prediction-output/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-batch-prediction-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.delete-batch-prediction-output/batch-prediction-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/variable-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/recipe (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 131071))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/edp-service-role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/details-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/string-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/number-of-files (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/data-size-in-bytes (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.data-source/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/data-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.data-source/created-by-iam-user :portkey.aws.machinelearning.-2014-12-12/compute-statistics :portkey.aws.machinelearning.-2014-12-12/role-arn :portkey.aws.machinelearning.-2014-12-12.data-source/finished-at :portkey.aws.machinelearning.-2014-12-12/data-rearrangement :portkey.aws.machinelearning.-2014-12-12/rds-metadata :portkey.aws.machinelearning.-2014-12-12.data-source/data-source-id :portkey.aws.machinelearning.-2014-12-12.data-source/status :portkey.aws.machinelearning.-2014-12-12.data-source/last-updated-at :portkey.aws.machinelearning.-2014-12-12.data-source/data-location-s-3 :portkey.aws.machinelearning.-2014-12-12/message :portkey.aws.machinelearning.-2014-12-12.data-source/compute-time :portkey.aws.machinelearning.-2014-12-12.data-source/number-of-files :portkey.aws.machinelearning.-2014-12-12.data-source/created-at :portkey.aws.machinelearning.-2014-12-12/redshift-metadata :portkey.aws.machinelearning.-2014-12-12.data-source/name :portkey.aws.machinelearning.-2014-12-12.data-source/data-size-in-bytes :portkey.aws.machinelearning.-2014-12-12.data-source/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/batch-prediction-filter-variable #{"MLModelId" :data-source-id :iam-user "DataURI" :name :ml-model-id "DataSourceId" "Status" "LastUpdatedAt" :last-updated-at :status "IAMUser" "CreatedAt" "Name" :created-at :data-uri})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.s-3-data-spec/data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.s-3-data-spec/data-schema-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/s-3-data-spec (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.s-3-data-spec/data-location-s-3] :opt-un [:portkey.aws.machinelearning.-2014-12-12/data-rearrangement :portkey.aws.machinelearning.-2014-12-12/data-schema :portkey.aws.machinelearning.-2014-12-12.s-3-data-spec/data-schema-location-s-3]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-data-source-from-rds-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-rds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-data-source-from-rds-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-tags-output/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-tags-output/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-tags-output/tags (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/tag-list))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-tags-output/resource-id :portkey.aws.machinelearning.-2014-12-12.describe-tags-output/resource-type :portkey.aws.machinelearning.-2014-12-12.describe-tags-output/tags]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-cluster-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-z0-9-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/record (clojure.spec.alpha/map-of :portkey.aws.machinelearning.-2014-12-12/variable-name :portkey.aws.machinelearning.-2014-12-12/variable-value))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/edp-subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-output/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-batch-prediction-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-batch-prediction-output/batch-prediction-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-realtime-endpoint-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-realtime-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.delete-realtime-endpoint-input/ml-model-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.predict-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.predict-input/predict-endpoint (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/vip-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/predict-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.predict-input/ml-model-id :portkey.aws.machinelearning.-2014-12-12/record :portkey.aws.machinelearning.-2014-12-12.predict-input/predict-endpoint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-database-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 8 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-data-source-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-data-source-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.delete-data-source-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/s-3-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"s3://([^/]+)(/.*)?" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-select-sql-query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 16777216))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-evaluation-output/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-evaluation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-evaluation-output/evaluation-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-output/results (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/evaluations))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-output/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-evaluations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-evaluations-output/results :portkey.aws.machinelearning.-2014-12-12.describe-evaluations-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-database-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 8 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-metadata/database-user-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-database-username))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.redshift-metadata/select-sql-query (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/redshift-select-sql-query))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/redshift-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12/redshift-database :portkey.aws.machinelearning.-2014-12-12.redshift-metadata/database-user-name :portkey.aws.machinelearning.-2014-12-12.redshift-metadata/select-sql-query]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-ml-model-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-ml-model-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.delete-ml-model-output/ml-model-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-evaluation-output/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-evaluation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.delete-evaluation-output/evaluation-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-instance-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-z0-9-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-realtime-endpoint-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-realtime-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.create-realtime-endpoint-input/ml-model-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.tag/key (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/tag-key))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.tag/value (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/tag-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.tag/key :portkey.aws.machinelearning.-2014-12-12.tag/value]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/entity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-realtime-endpoint-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-realtime-endpoint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.delete-realtime-endpoint-output/ml-model-id :portkey.aws.machinelearning.-2014-12-12/realtime-endpoint-info]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-input/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/get-batch-prediction-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.get-batch-prediction-input/batch-prediction-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/float-label clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/page-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.delete-evaluation-input/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/delete-evaluation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.delete-evaluation-input/evaluation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/predict-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12/prediction]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-realtime-endpoint-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-realtime-endpoint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-realtime-endpoint-output/ml-model-id :portkey.aws.machinelearning.-2014-12-12/realtime-endpoint-info]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.prediction/predicted-label (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/label))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.prediction/predicted-value (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/float-label))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.prediction/predicted-scores (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/score-value-per-label-map))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.prediction/details (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/details-map))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/prediction (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.prediction/predicted-label :portkey.aws.machinelearning.-2014-12-12.prediction/predicted-value :portkey.aws.machinelearning.-2014-12-12.prediction/predicted-scores :portkey.aws.machinelearning.-2014-12-12.prediction/details]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/realtime-endpoint-status #{:ready "UPDATING" "READY" "NONE" "FAILED" :updating :none :failed})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/vip-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-output/results (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/data-sources))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-output/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/describe-data-sources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.describe-data-sources-output/results :portkey.aws.machinelearning.-2014-12-12.describe-data-sources-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/ml-model-name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/parameters (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/training-parameters))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/training-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/recipe-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/create-ml-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/ml-model-id :portkey.aws.machinelearning.-2014-12-12/ml-model-type :portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/training-data-source-id] :opt-un [:portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/ml-model-name :portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/parameters :portkey.aws.machinelearning.-2014-12-12/recipe :portkey.aws.machinelearning.-2014-12-12.create-ml-model-input/recipe-uri]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/data-schema-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/service-role (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/edp-service-role))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/security-group-ids (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/edp-security-group-ids))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/subnet-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/edp-subnet-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/database-credentials (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-database-credentials))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/select-sql-query (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-select-sql-query))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/database-information (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-database))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/resource-role (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/edp-resource-role))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/s-3-staging-location (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-data-spec (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.rds-data-spec/database-information :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/select-sql-query :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/database-credentials :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/s-3-staging-location :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/resource-role :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/service-role :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/subnet-id :portkey.aws.machinelearning.-2014-12-12.rds-data-spec/security-group-ids] :opt-un [:portkey.aws.machinelearning.-2014-12-12.rds-data-spec/data-schema-uri :portkey.aws.machinelearning.-2014-12-12/data-rearrangement :portkey.aws.machinelearning.-2014-12-12/data-schema]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/batch-prediction-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/output-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/invalid-record-count (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/total-record-count (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.batch-prediction/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/batch-prediction (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.batch-prediction/ml-model-id :portkey.aws.machinelearning.-2014-12-12.batch-prediction/created-by-iam-user :portkey.aws.machinelearning.-2014-12-12.batch-prediction/finished-at :portkey.aws.machinelearning.-2014-12-12.batch-prediction/batch-prediction-data-source-id :portkey.aws.machinelearning.-2014-12-12.batch-prediction/status :portkey.aws.machinelearning.-2014-12-12.batch-prediction/last-updated-at :portkey.aws.machinelearning.-2014-12-12.batch-prediction/output-uri :portkey.aws.machinelearning.-2014-12-12.batch-prediction/invalid-record-count :portkey.aws.machinelearning.-2014-12-12/message :portkey.aws.machinelearning.-2014-12-12.batch-prediction/compute-time :portkey.aws.machinelearning.-2014-12-12.batch-prediction/batch-prediction-id :portkey.aws.machinelearning.-2014-12-12.batch-prediction/created-at :portkey.aws.machinelearning.-2014-12-12.batch-prediction/total-record-count :portkey.aws.machinelearning.-2014-12-12.batch-prediction/name :portkey.aws.machinelearning.-2014-12-12.batch-prediction/input-data-location-s-3 :portkey.aws.machinelearning.-2014-12-12.batch-prediction/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.realtime-endpoint-info/peak-requests-per-second (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/integer-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.realtime-endpoint-info/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.realtime-endpoint-info/endpoint-url (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/vip-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.realtime-endpoint-info/endpoint-status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/realtime-endpoint-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/realtime-endpoint-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.realtime-endpoint-info/peak-requests-per-second :portkey.aws.machinelearning.-2014-12-12.realtime-endpoint-info/created-at :portkey.aws.machinelearning.-2014-12-12.realtime-endpoint-info/endpoint-url :portkey.aws.machinelearning.-2014-12-12.realtime-endpoint-info/endpoint-status]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/batch-predictions (clojure.spec.alpha/coll-of :portkey.aws.machinelearning.-2014-12-12/batch-prediction))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/ml-model-filter-variable #{"MLModelType" "TrainingDataURI" :iam-user :realtime-endpoint-status :algorithm :training-data-uri :name "Status" "LastUpdatedAt" :ml-model-type "TrainingDataSourceId" "Algorithm" :last-updated-at :status "IAMUser" "CreatedAt" :training-data-source-id "Name" :created-at "RealtimeEndpointStatus"})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/details-map (clojure.spec.alpha/map-of :portkey.aws.machinelearning.-2014-12-12/details-attributes :portkey.aws.machinelearning.-2014-12-12/details-value))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/score-value clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/details-attributes #{:algorithm :predictive-model-type "PredictiveModelType" "Algorithm"})

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/score-threshold clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.predictor-not-mounted-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/predictor-not-mounted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.predictor-not-mounted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.performance-metrics/properties (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/performance-metrics-properties))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/performance-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.performance-metrics/properties]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-database-username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/epoch-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/data-source-schema (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/data-schema))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/log-uri (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/presigned-s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/status (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/number-of-files (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/name (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/data-size-in-bytes (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/get-data-source-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.-2014-12-12.get-data-source-output/created-by-iam-user :portkey.aws.machinelearning.-2014-12-12/compute-statistics :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/data-source-schema :portkey.aws.machinelearning.-2014-12-12/role-arn :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/finished-at :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/log-uri :portkey.aws.machinelearning.-2014-12-12/data-rearrangement :portkey.aws.machinelearning.-2014-12-12/rds-metadata :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/data-source-id :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/status :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/last-updated-at :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/data-location-s-3 :portkey.aws.machinelearning.-2014-12-12/message :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/compute-time :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/number-of-files :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/created-at :portkey.aws.machinelearning.-2014-12-12/redshift-metadata :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/name :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/data-size-in-bytes :portkey.aws.machinelearning.-2014-12-12.get-data-source-output/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-database-credentials/username (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-database-username))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12.rds-database-credentials/password (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/rds-database-password))
(clojure.spec.alpha/def :portkey.aws.machinelearning.-2014-12-12/rds-database-credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.-2014-12-12.rds-database-credentials/username :portkey.aws.machinelearning.-2014-12-12.rds-database-credentials/password] :opt-un []))

(clojure.core/defn create-ml-model ([create-ml-model-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-ml-model-input create-ml-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/create-ml-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/create-ml-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateMLModel", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning.-2014-12-12/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-ml-model :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/create-ml-model-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/create-ml-model-output))

(clojure.core/defn update-batch-prediction ([update-batch-prediction-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-batch-prediction-input update-batch-prediction-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/update-batch-prediction-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/update-batch-prediction-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateBatchPrediction", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-batch-prediction :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/update-batch-prediction-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/update-batch-prediction-output))

(clojure.core/defn delete-evaluation ([delete-evaluation-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-evaluation-input delete-evaluation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/delete-evaluation-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/delete-evaluation-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEvaluation", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-evaluation :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/delete-evaluation-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/delete-evaluation-output))

(clojure.core/defn create-data-source-from-rds ([create-data-source-from-rds-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-data-source-from-rds-input create-data-source-from-rds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-rds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-rds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDataSourceFromRDS", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning.-2014-12-12/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-data-source-from-rds :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-rds-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-rds-output))

(clojure.core/defn predict ([predict-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-predict-input predict-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/predict-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/predict-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Predict", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "LimitExceededException" :portkey.aws.machinelearning.-2014-12-12/limit-exceeded-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception, "PredictorNotMountedException" :portkey.aws.machinelearning.-2014-12-12/predictor-not-mounted-exception}})))))
(clojure.spec.alpha/fdef predict :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/predict-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/predict-output))

(clojure.core/defn update-evaluation ([update-evaluation-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-evaluation-input update-evaluation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/update-evaluation-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/update-evaluation-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEvaluation", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-evaluation :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/update-evaluation-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/update-evaluation-output))

(clojure.core/defn delete-tags ([delete-tags-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-tags-input delete-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/delete-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/delete-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTags", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InvalidTagException" :portkey.aws.machinelearning.-2014-12-12/invalid-tag-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/delete-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/delete-tags-output))

(clojure.core/defn create-evaluation ([create-evaluation-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-evaluation-input create-evaluation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/create-evaluation-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/create-evaluation-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEvaluation", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning.-2014-12-12/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-evaluation :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/create-evaluation-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/create-evaluation-output))

(clojure.core/defn delete-ml-model ([delete-ml-model-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-ml-model-input delete-ml-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/delete-ml-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/delete-ml-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteMLModel", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-ml-model :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/delete-ml-model-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/delete-ml-model-output))

(clojure.core/defn get-batch-prediction ([get-batch-prediction-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-batch-prediction-input get-batch-prediction-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/get-batch-prediction-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/get-batch-prediction-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBatchPrediction", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-batch-prediction :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/get-batch-prediction-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/get-batch-prediction-output))

(clojure.core/defn create-data-source-from-redshift ([create-data-source-from-redshift-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-data-source-from-redshift-input create-data-source-from-redshift-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-redshift-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-redshift-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDataSourceFromRedshift", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning.-2014-12-12/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-data-source-from-redshift :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-redshift-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-redshift-output))

(clojure.core/defn describe-data-sources ([] (describe-data-sources {})) ([describe-data-sources-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-data-sources-input describe-data-sources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/describe-data-sources-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/describe-data-sources-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDataSources", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-data-sources :args (clojure.spec.alpha/? :portkey.aws.machinelearning.-2014-12-12/describe-data-sources-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/describe-data-sources-output))

(clojure.core/defn update-data-source ([update-data-source-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-data-source-input update-data-source-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/update-data-source-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/update-data-source-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDataSource", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-data-source :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/update-data-source-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/update-data-source-output))

(clojure.core/defn delete-batch-prediction ([delete-batch-prediction-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-batch-prediction-input delete-batch-prediction-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/delete-batch-prediction-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/delete-batch-prediction-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBatchPrediction", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-batch-prediction :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/delete-batch-prediction-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/delete-batch-prediction-output))

(clojure.core/defn create-data-source-from-s-3 ([create-data-source-from-s-3-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-data-source-from-s-3-input create-data-source-from-s-3-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-s-3-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-s-3-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDataSourceFromS3", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning.-2014-12-12/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-data-source-from-s-3 :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-s-3-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/create-data-source-from-s-3-output))

(clojure.core/defn describe-ml-models ([] (describe-ml-models {})) ([describe-ml-models-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-ml-models-input describe-ml-models-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/describe-ml-models-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/describe-ml-models-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMLModels", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-ml-models :args (clojure.spec.alpha/? :portkey.aws.machinelearning.-2014-12-12/describe-ml-models-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/describe-ml-models-output))

(clojure.core/defn describe-tags ([describe-tags-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-tags-input describe-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/describe-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/describe-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTags", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/describe-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/describe-tags-output))

(clojure.core/defn create-batch-prediction ([create-batch-prediction-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-batch-prediction-input create-batch-prediction-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/create-batch-prediction-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/create-batch-prediction-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateBatchPrediction", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning.-2014-12-12/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-batch-prediction :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/create-batch-prediction-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/create-batch-prediction-output))

(clojure.core/defn get-evaluation ([get-evaluation-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-evaluation-input get-evaluation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/get-evaluation-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/get-evaluation-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetEvaluation", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-evaluation :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/get-evaluation-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/get-evaluation-output))

(clojure.core/defn describe-batch-predictions ([] (describe-batch-predictions {})) ([describe-batch-predictions-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-batch-predictions-input describe-batch-predictions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/describe-batch-predictions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/describe-batch-predictions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeBatchPredictions", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-batch-predictions :args (clojure.spec.alpha/? :portkey.aws.machinelearning.-2014-12-12/describe-batch-predictions-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/describe-batch-predictions-output))

(clojure.core/defn update-ml-model ([update-ml-model-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-ml-model-input update-ml-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/update-ml-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/update-ml-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateMLModel", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-ml-model :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/update-ml-model-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/update-ml-model-output))

(clojure.core/defn get-data-source ([get-data-source-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-data-source-input get-data-source-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/get-data-source-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/get-data-source-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDataSource", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-data-source :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/get-data-source-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/get-data-source-output))

(clojure.core/defn add-tags ([add-tags-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/add-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InvalidTagException" :portkey.aws.machinelearning.-2014-12-12/invalid-tag-exception, "TagLimitExceededException" :portkey.aws.machinelearning.-2014-12-12/tag-limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/add-tags-output))

(clojure.core/defn delete-realtime-endpoint ([delete-realtime-endpoint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-realtime-endpoint-input delete-realtime-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/delete-realtime-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/delete-realtime-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRealtimeEndpoint", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-realtime-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/delete-realtime-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/delete-realtime-endpoint-output))

(clojure.core/defn describe-evaluations ([] (describe-evaluations {})) ([describe-evaluations-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-evaluations-input describe-evaluations-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/describe-evaluations-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/describe-evaluations-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEvaluations", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-evaluations :args (clojure.spec.alpha/? :portkey.aws.machinelearning.-2014-12-12/describe-evaluations-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/describe-evaluations-output))

(clojure.core/defn delete-data-source ([delete-data-source-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-data-source-input delete-data-source-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/delete-data-source-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/delete-data-source-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDataSource", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-data-source :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/delete-data-source-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/delete-data-source-output))

(clojure.core/defn get-ml-model ([get-ml-model-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-ml-model-input get-ml-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/get-ml-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/get-ml-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMLModel", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-ml-model :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/get-ml-model-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/get-ml-model-output))

(clojure.core/defn create-realtime-endpoint ([create-realtime-endpoint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-realtime-endpoint-input create-realtime-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning.-2014-12-12/endpoints, :http.request.spec/output-spec :portkey.aws.machinelearning.-2014-12-12/create-realtime-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning.-2014-12-12/create-realtime-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRealtimeEndpoint", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning.-2014-12-12/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning.-2014-12-12/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning.-2014-12-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef create-realtime-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning.-2014-12-12/create-realtime-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning.-2014-12-12/create-realtime-endpoint-output))
