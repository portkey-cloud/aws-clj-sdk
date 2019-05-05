(ns portkey.aws.machinelearning (:require [portkey.aws]))

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

(clojure.core/declare deser-score-value-per-label-map)

(clojure.core/declare deser-redshift-database-username)

(clojure.core/declare deser-ml-model-type)

(clojure.core/declare deser-performance-metrics-property-value)

(clojure.core/declare deser-edp-pipeline-id)

(clojure.core/declare deser-rds-database-name)

(clojure.core/declare deser-compute-statistics)

(clojure.core/declare deser-presigned-s-3-url)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-rds-database)

(clojure.core/declare deser-evaluation)

(clojure.core/declare deser-entity-name)

(clojure.core/declare deser-data-rearrangement)

(clojure.core/declare deser-edp-resource-role)

(clojure.core/declare deser-rds-metadata)

(clojure.core/declare deser-data-schema)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-ml-models)

(clojure.core/declare deser-integer-type)

(clojure.core/declare deser-aws-user-arn)

(clojure.core/declare deser-long-type)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-training-parameters)

(clojure.core/declare deser-performance-metrics-property-key)

(clojure.core/declare deser-redshift-select-sql-query)

(clojure.core/declare deser-data-sources)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-taggable-resource-type)

(clojure.core/declare deser-performance-metrics-properties)

(clojure.core/declare deser-algorithm)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-redshift-database-name)

(clojure.core/declare deser-ml-model)

(clojure.core/declare deser-evaluations)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-ml-model-name)

(clojure.core/declare deser-message)

(clojure.core/declare deser-redshift-database)

(clojure.core/declare deser-entity-status)

(clojure.core/declare deser-recipe)

(clojure.core/declare deser-edp-service-role)

(clojure.core/declare deser-details-value)

(clojure.core/declare deser-string-type)

(clojure.core/declare deser-data-source)

(clojure.core/declare deser-redshift-cluster-identifier)

(clojure.core/declare deser-label)

(clojure.core/declare deser-s-3-url)

(clojure.core/declare deser-rds-select-sql-query)

(clojure.core/declare deser-redshift-metadata)

(clojure.core/declare deser-rds-instance-identifier)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-entity-id)

(clojure.core/declare deserfloat-label)

(clojure.core/declare deser-prediction)

(clojure.core/declare deser-realtime-endpoint-status)

(clojure.core/declare deser-vip-url)

(clojure.core/declare deser-batch-prediction)

(clojure.core/declare deser-realtime-endpoint-info)

(clojure.core/declare deser-batch-predictions)

(clojure.core/declare deser-details-map)

(clojure.core/declare deser-score-value)

(clojure.core/declare deser-details-attributes)

(clojure.core/declare deser-score-threshold)

(clojure.core/declare deser-performance-metrics)

(clojure.core/declare deser-rds-database-username)

(clojure.core/declare deser-epoch-time)

(clojure.core/defn- deser-score-value-per-label-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-label k) (deser-score-value v)])) input))

(clojure.core/defn- deser-redshift-database-username [input] input)

(clojure.core/defn- deser-ml-model-type [input] (clojure.core/get {"REGRESSION" :regression, "BINARY" :binary, "MULTICLASS" :multiclass} input))

(clojure.core/defn- deser-performance-metrics-property-value [input] input)

(clojure.core/defn- deser-edp-pipeline-id [input] input)

(clojure.core/defn- deser-rds-database-name [input] input)

(clojure.core/defn- deser-compute-statistics [input] input)

(clojure.core/defn- deser-presigned-s-3-url [input] input)

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-rds-database [input] (clojure.core/cond-> {:instance-identifier (deser-rds-instance-identifier (input "InstanceIdentifier")), :database-name (deser-rds-database-name (input "DatabaseName"))}))

(clojure.core/defn- deser-evaluation [input] (clojure.core/cond-> {} (clojure.core/contains? input "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (input "MLModelId"))) (clojure.core/contains? input "CreatedByIamUser") (clojure.core/assoc :created-by-iam-user (deser-aws-user-arn (input "CreatedByIamUser"))) (clojure.core/contains? input "FinishedAt") (clojure.core/assoc :finished-at (deser-epoch-time (input "FinishedAt"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-entity-status (input "Status"))) (clojure.core/contains? input "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-epoch-time (input "LastUpdatedAt"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-message (input "Message"))) (clojure.core/contains? input "ComputeTime") (clojure.core/assoc :compute-time (deser-long-type (input "ComputeTime"))) (clojure.core/contains? input "EvaluationId") (clojure.core/assoc :evaluation-id (deser-entity-id (input "EvaluationId"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (input "CreatedAt"))) (clojure.core/contains? input "EvaluationDataSourceId") (clojure.core/assoc :evaluation-data-source-id (deser-entity-id (input "EvaluationDataSourceId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-entity-name (input "Name"))) (clojure.core/contains? input "InputDataLocationS3") (clojure.core/assoc :input-data-location-s-3 (deser-s-3-url (input "InputDataLocationS3"))) (clojure.core/contains? input "PerformanceMetrics") (clojure.core/assoc :performance-metrics (deser-performance-metrics (input "PerformanceMetrics"))) (clojure.core/contains? input "StartedAt") (clojure.core/assoc :started-at (deser-epoch-time (input "StartedAt")))))

(clojure.core/defn- deser-entity-name [input] input)

(clojure.core/defn- deser-data-rearrangement [input] input)

(clojure.core/defn- deser-edp-resource-role [input] input)

(clojure.core/defn- deser-rds-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "Database") (clojure.core/assoc :database (deser-rds-database (input "Database"))) (clojure.core/contains? input "DatabaseUserName") (clojure.core/assoc :database-user-name (deser-rds-database-username (input "DatabaseUserName"))) (clojure.core/contains? input "SelectSqlQuery") (clojure.core/assoc :select-sql-query (deser-rds-select-sql-query (input "SelectSqlQuery"))) (clojure.core/contains? input "ResourceRole") (clojure.core/assoc :resource-role (deser-edp-resource-role (input "ResourceRole"))) (clojure.core/contains? input "ServiceRole") (clojure.core/assoc :service-role (deser-edp-service-role (input "ServiceRole"))) (clojure.core/contains? input "DataPipelineId") (clojure.core/assoc :data-pipeline-id (deser-edp-pipeline-id (input "DataPipelineId")))))

(clojure.core/defn- deser-data-schema [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-ml-models [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ml-model coll))) input))

(clojure.core/defn- deser-integer-type [input] input)

(clojure.core/defn- deser-aws-user-arn [input] input)

(clojure.core/defn- deser-long-type [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-training-parameters [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string-type k) (deser-string-type v)])) input))

(clojure.core/defn- deser-performance-metrics-property-key [input] input)

(clojure.core/defn- deser-redshift-select-sql-query [input] input)

(clojure.core/defn- deser-data-sources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-data-source coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-taggable-resource-type [input] (clojure.core/get {"BatchPrediction" :batch-prediction, "DataSource" :data-source, "Evaluation" :evaluation, "MLModel" :ml-model} input))

(clojure.core/defn- deser-performance-metrics-properties [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-performance-metrics-property-key k) (deser-performance-metrics-property-value v)])) input))

(clojure.core/defn- deser-algorithm [input] (clojure.core/get {"sgd" :sgd} input))

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-redshift-database-name [input] input)

(clojure.core/defn- deser-ml-model [input] (clojure.core/cond-> {} (clojure.core/contains? input "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (input "MLModelId"))) (clojure.core/contains? input "MLModelType") (clojure.core/assoc :ml-model-type (deser-ml-model-type (input "MLModelType"))) (clojure.core/contains? input "CreatedByIamUser") (clojure.core/assoc :created-by-iam-user (deser-aws-user-arn (input "CreatedByIamUser"))) (clojure.core/contains? input "FinishedAt") (clojure.core/assoc :finished-at (deser-epoch-time (input "FinishedAt"))) (clojure.core/contains? input "SizeInBytes") (clojure.core/assoc :size-in-bytes (deser-long-type (input "SizeInBytes"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-entity-status (input "Status"))) (clojure.core/contains? input "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-epoch-time (input "LastUpdatedAt"))) (clojure.core/contains? input "TrainingParameters") (clojure.core/assoc :training-parameters (deser-training-parameters (input "TrainingParameters"))) (clojure.core/contains? input "TrainingDataSourceId") (clojure.core/assoc :training-data-source-id (deser-entity-id (input "TrainingDataSourceId"))) (clojure.core/contains? input "Algorithm") (clojure.core/assoc :algorithm (deser-algorithm (input "Algorithm"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-message (input "Message"))) (clojure.core/contains? input "ComputeTime") (clojure.core/assoc :compute-time (deser-long-type (input "ComputeTime"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (input "CreatedAt"))) (clojure.core/contains? input "ScoreThresholdLastUpdatedAt") (clojure.core/assoc :score-threshold-last-updated-at (deser-epoch-time (input "ScoreThresholdLastUpdatedAt"))) (clojure.core/contains? input "EndpointInfo") (clojure.core/assoc :endpoint-info (deser-realtime-endpoint-info (input "EndpointInfo"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-ml-model-name (input "Name"))) (clojure.core/contains? input "InputDataLocationS3") (clojure.core/assoc :input-data-location-s-3 (deser-s-3-url (input "InputDataLocationS3"))) (clojure.core/contains? input "ScoreThreshold") (clojure.core/assoc :score-threshold (deser-score-threshold (input "ScoreThreshold"))) (clojure.core/contains? input "StartedAt") (clojure.core/assoc :started-at (deser-epoch-time (input "StartedAt")))))

(clojure.core/defn- deser-evaluations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-evaluation coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-ml-model-name [input] input)

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-redshift-database [input] (clojure.core/cond-> {:database-name (deser-redshift-database-name (input "DatabaseName")), :cluster-identifier (deser-redshift-cluster-identifier (input "ClusterIdentifier"))}))

(clojure.core/defn- deser-entity-status [input] (clojure.core/get {"PENDING" :pending, "INPROGRESS" :inprogress, "FAILED" :failed, "COMPLETED" :completed, "DELETED" :deleted} input))

(clojure.core/defn- deser-recipe [input] input)

(clojure.core/defn- deser-edp-service-role [input] input)

(clojure.core/defn- deser-details-value [input] input)

(clojure.core/defn- deser-string-type [input] input)

(clojure.core/defn- deser-data-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreatedByIamUser") (clojure.core/assoc :created-by-iam-user (deser-aws-user-arn (input "CreatedByIamUser"))) (clojure.core/contains? input "ComputeStatistics") (clojure.core/assoc :compute-statistics (deser-compute-statistics (input "ComputeStatistics"))) (clojure.core/contains? input "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleARN"))) (clojure.core/contains? input "FinishedAt") (clojure.core/assoc :finished-at (deser-epoch-time (input "FinishedAt"))) (clojure.core/contains? input "DataRearrangement") (clojure.core/assoc :data-rearrangement (deser-data-rearrangement (input "DataRearrangement"))) (clojure.core/contains? input "RDSMetadata") (clojure.core/assoc :rds-metadata (deser-rds-metadata (input "RDSMetadata"))) (clojure.core/contains? input "DataSourceId") (clojure.core/assoc :data-source-id (deser-entity-id (input "DataSourceId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-entity-status (input "Status"))) (clojure.core/contains? input "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-epoch-time (input "LastUpdatedAt"))) (clojure.core/contains? input "DataLocationS3") (clojure.core/assoc :data-location-s-3 (deser-s-3-url (input "DataLocationS3"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-message (input "Message"))) (clojure.core/contains? input "ComputeTime") (clojure.core/assoc :compute-time (deser-long-type (input "ComputeTime"))) (clojure.core/contains? input "NumberOfFiles") (clojure.core/assoc :number-of-files (deser-long-type (input "NumberOfFiles"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (input "CreatedAt"))) (clojure.core/contains? input "RedshiftMetadata") (clojure.core/assoc :redshift-metadata (deser-redshift-metadata (input "RedshiftMetadata"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-entity-name (input "Name"))) (clojure.core/contains? input "DataSizeInBytes") (clojure.core/assoc :data-size-in-bytes (deser-long-type (input "DataSizeInBytes"))) (clojure.core/contains? input "StartedAt") (clojure.core/assoc :started-at (deser-epoch-time (input "StartedAt")))))

(clojure.core/defn- deser-redshift-cluster-identifier [input] input)

(clojure.core/defn- deser-label [input] input)

(clojure.core/defn- deser-s-3-url [input] input)

(clojure.core/defn- deser-rds-select-sql-query [input] input)

(clojure.core/defn- deser-redshift-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "RedshiftDatabase") (clojure.core/assoc :redshift-database (deser-redshift-database (input "RedshiftDatabase"))) (clojure.core/contains? input "DatabaseUserName") (clojure.core/assoc :database-user-name (deser-redshift-database-username (input "DatabaseUserName"))) (clojure.core/contains? input "SelectSqlQuery") (clojure.core/assoc :select-sql-query (deser-redshift-select-sql-query (input "SelectSqlQuery")))))

(clojure.core/defn- deser-rds-instance-identifier [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-entity-id [input] input)

(clojure.core/defn- deserfloat-label [input] input)

(clojure.core/defn- deser-prediction [input] (clojure.core/cond-> {} (clojure.core/contains? input "predictedLabel") (clojure.core/assoc :predicted-label (deser-label (input "predictedLabel"))) (clojure.core/contains? input "predictedValue") (clojure.core/assoc :predicted-value (deserfloat-label (input "predictedValue"))) (clojure.core/contains? input "predictedScores") (clojure.core/assoc :predicted-scores (deser-score-value-per-label-map (input "predictedScores"))) (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-details-map (input "details")))))

(clojure.core/defn- deser-realtime-endpoint-status [input] (clojure.core/get {"NONE" :none, "READY" :ready, "UPDATING" :updating, "FAILED" :failed} input))

(clojure.core/defn- deser-vip-url [input] input)

(clojure.core/defn- deser-batch-prediction [input] (clojure.core/cond-> {} (clojure.core/contains? input "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (input "MLModelId"))) (clojure.core/contains? input "CreatedByIamUser") (clojure.core/assoc :created-by-iam-user (deser-aws-user-arn (input "CreatedByIamUser"))) (clojure.core/contains? input "FinishedAt") (clojure.core/assoc :finished-at (deser-epoch-time (input "FinishedAt"))) (clojure.core/contains? input "BatchPredictionDataSourceId") (clojure.core/assoc :batch-prediction-data-source-id (deser-entity-id (input "BatchPredictionDataSourceId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-entity-status (input "Status"))) (clojure.core/contains? input "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-epoch-time (input "LastUpdatedAt"))) (clojure.core/contains? input "OutputUri") (clojure.core/assoc :output-uri (deser-s-3-url (input "OutputUri"))) (clojure.core/contains? input "InvalidRecordCount") (clojure.core/assoc :invalid-record-count (deser-long-type (input "InvalidRecordCount"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-message (input "Message"))) (clojure.core/contains? input "ComputeTime") (clojure.core/assoc :compute-time (deser-long-type (input "ComputeTime"))) (clojure.core/contains? input "BatchPredictionId") (clojure.core/assoc :batch-prediction-id (deser-entity-id (input "BatchPredictionId"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (input "CreatedAt"))) (clojure.core/contains? input "TotalRecordCount") (clojure.core/assoc :total-record-count (deser-long-type (input "TotalRecordCount"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-entity-name (input "Name"))) (clojure.core/contains? input "InputDataLocationS3") (clojure.core/assoc :input-data-location-s-3 (deser-s-3-url (input "InputDataLocationS3"))) (clojure.core/contains? input "StartedAt") (clojure.core/assoc :started-at (deser-epoch-time (input "StartedAt")))))

(clojure.core/defn- deser-realtime-endpoint-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "PeakRequestsPerSecond") (clojure.core/assoc :peak-requests-per-second (deser-integer-type (input "PeakRequestsPerSecond"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (input "CreatedAt"))) (clojure.core/contains? input "EndpointUrl") (clojure.core/assoc :endpoint-url (deser-vip-url (input "EndpointUrl"))) (clojure.core/contains? input "EndpointStatus") (clojure.core/assoc :endpoint-status (deser-realtime-endpoint-status (input "EndpointStatus")))))

(clojure.core/defn- deser-batch-predictions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-prediction coll))) input))

(clojure.core/defn- deser-details-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-details-attributes k) (deser-details-value v)])) input))

(clojure.core/defn- deser-score-value [input] input)

(clojure.core/defn- deser-details-attributes [input] (clojure.core/get {"PredictiveModelType" :predictive-model-type, "Algorithm" :algorithm} input))

(clojure.core/defn- deser-score-threshold [input] input)

(clojure.core/defn- deser-performance-metrics [input] (clojure.core/cond-> {} (clojure.core/contains? input "Properties") (clojure.core/assoc :properties (deser-performance-metrics-properties (input "Properties")))))

(clojure.core/defn- deser-rds-database-username [input] input)

(clojure.core/defn- deser-epoch-time [input] input)

(clojure.core/defn- response-delete-tags-output ([input] (response-delete-tags-output nil input)) ([resultWrapper1894940 input] (clojure.core/let [rawinput1894939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894941 {"ResourceId" (rawinput1894939 "ResourceId"), "ResourceType" (rawinput1894939 "ResourceType")}] (clojure.core/cond-> {} (letvar1894941 "ResourceId") (clojure.core/assoc :resource-id (deser-entity-id (clojure.core/get-in letvar1894941 ["ResourceId"]))) (letvar1894941 "ResourceType") (clojure.core/assoc :resource-type (deser-taggable-resource-type (clojure.core/get-in letvar1894941 ["ResourceType"])))))))

(clojure.core/defn- response-update-evaluation-output ([input] (response-update-evaluation-output nil input)) ([resultWrapper1894943 input] (clojure.core/let [rawinput1894942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894944 {"EvaluationId" (rawinput1894942 "EvaluationId")}] (clojure.core/cond-> {} (letvar1894944 "EvaluationId") (clojure.core/assoc :evaluation-id (deser-entity-id (clojure.core/get-in letvar1894944 ["EvaluationId"])))))))

(clojure.core/defn- response-add-tags-output ([input] (response-add-tags-output nil input)) ([resultWrapper1894946 input] (clojure.core/let [rawinput1894945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894947 {"ResourceId" (rawinput1894945 "ResourceId"), "ResourceType" (rawinput1894945 "ResourceType")}] (clojure.core/cond-> {} (letvar1894947 "ResourceId") (clojure.core/assoc :resource-id (deser-entity-id (clojure.core/get-in letvar1894947 ["ResourceId"]))) (letvar1894947 "ResourceType") (clojure.core/assoc :resource-type (deser-taggable-resource-type (clojure.core/get-in letvar1894947 ["ResourceType"])))))))

(clojure.core/defn- response-get-batch-prediction-output ([input] (response-get-batch-prediction-output nil input)) ([resultWrapper1894949 input] (clojure.core/let [rawinput1894948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894950 {"MLModelId" (rawinput1894948 "MLModelId"), "CreatedByIamUser" (rawinput1894948 "CreatedByIamUser"), "FinishedAt" (rawinput1894948 "FinishedAt"), "LogUri" (rawinput1894948 "LogUri"), "BatchPredictionDataSourceId" (rawinput1894948 "BatchPredictionDataSourceId"), "Status" (rawinput1894948 "Status"), "LastUpdatedAt" (rawinput1894948 "LastUpdatedAt"), "OutputUri" (rawinput1894948 "OutputUri"), "InvalidRecordCount" (rawinput1894948 "InvalidRecordCount"), "Message" (rawinput1894948 "Message"), "ComputeTime" (rawinput1894948 "ComputeTime"), "BatchPredictionId" (rawinput1894948 "BatchPredictionId"), "CreatedAt" (rawinput1894948 "CreatedAt"), "TotalRecordCount" (rawinput1894948 "TotalRecordCount"), "Name" (rawinput1894948 "Name"), "InputDataLocationS3" (rawinput1894948 "InputDataLocationS3"), "StartedAt" (rawinput1894948 "StartedAt")}] (clojure.core/cond-> {} (letvar1894950 "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (clojure.core/get-in letvar1894950 ["MLModelId"]))) (letvar1894950 "CreatedByIamUser") (clojure.core/assoc :created-by-iam-user (deser-aws-user-arn (clojure.core/get-in letvar1894950 ["CreatedByIamUser"]))) (letvar1894950 "FinishedAt") (clojure.core/assoc :finished-at (deser-epoch-time (clojure.core/get-in letvar1894950 ["FinishedAt"]))) (letvar1894950 "LogUri") (clojure.core/assoc :log-uri (deser-presigned-s-3-url (clojure.core/get-in letvar1894950 ["LogUri"]))) (letvar1894950 "BatchPredictionDataSourceId") (clojure.core/assoc :batch-prediction-data-source-id (deser-entity-id (clojure.core/get-in letvar1894950 ["BatchPredictionDataSourceId"]))) (letvar1894950 "Status") (clojure.core/assoc :status (deser-entity-status (clojure.core/get-in letvar1894950 ["Status"]))) (letvar1894950 "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-epoch-time (clojure.core/get-in letvar1894950 ["LastUpdatedAt"]))) (letvar1894950 "OutputUri") (clojure.core/assoc :output-uri (deser-s-3-url (clojure.core/get-in letvar1894950 ["OutputUri"]))) (letvar1894950 "InvalidRecordCount") (clojure.core/assoc :invalid-record-count (deser-long-type (clojure.core/get-in letvar1894950 ["InvalidRecordCount"]))) (letvar1894950 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1894950 ["Message"]))) (letvar1894950 "ComputeTime") (clojure.core/assoc :compute-time (deser-long-type (clojure.core/get-in letvar1894950 ["ComputeTime"]))) (letvar1894950 "BatchPredictionId") (clojure.core/assoc :batch-prediction-id (deser-entity-id (clojure.core/get-in letvar1894950 ["BatchPredictionId"]))) (letvar1894950 "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (clojure.core/get-in letvar1894950 ["CreatedAt"]))) (letvar1894950 "TotalRecordCount") (clojure.core/assoc :total-record-count (deser-long-type (clojure.core/get-in letvar1894950 ["TotalRecordCount"]))) (letvar1894950 "Name") (clojure.core/assoc :name (deser-entity-name (clojure.core/get-in letvar1894950 ["Name"]))) (letvar1894950 "InputDataLocationS3") (clojure.core/assoc :input-data-location-s-3 (deser-s-3-url (clojure.core/get-in letvar1894950 ["InputDataLocationS3"]))) (letvar1894950 "StartedAt") (clojure.core/assoc :started-at (deser-epoch-time (clojure.core/get-in letvar1894950 ["StartedAt"])))))))

(clojure.core/defn- response-create-ml-model-output ([input] (response-create-ml-model-output nil input)) ([resultWrapper1894952 input] (clojure.core/let [rawinput1894951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894953 {"MLModelId" (rawinput1894951 "MLModelId")}] (clojure.core/cond-> {} (letvar1894953 "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (clojure.core/get-in letvar1894953 ["MLModelId"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1894955 input] (clojure.core/let [rawinput1894954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894956 {"message" (rawinput1894954 "message"), "code" (rawinput1894954 "code")}] (clojure.core/cond-> {} (letvar1894956 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1894956 ["message"]))) (letvar1894956 "code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1894956 ["code"])))))))

(clojure.core/defn- response-get-ml-model-output ([input] (response-get-ml-model-output nil input)) ([resultWrapper1894958 input] (clojure.core/let [rawinput1894957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894959 {"MLModelId" (rawinput1894957 "MLModelId"), "MLModelType" (rawinput1894957 "MLModelType"), "Schema" (rawinput1894957 "Schema"), "CreatedByIamUser" (rawinput1894957 "CreatedByIamUser"), "FinishedAt" (rawinput1894957 "FinishedAt"), "LogUri" (rawinput1894957 "LogUri"), "SizeInBytes" (rawinput1894957 "SizeInBytes"), "Status" (rawinput1894957 "Status"), "LastUpdatedAt" (rawinput1894957 "LastUpdatedAt"), "TrainingParameters" (rawinput1894957 "TrainingParameters"), "TrainingDataSourceId" (rawinput1894957 "TrainingDataSourceId"), "Message" (rawinput1894957 "Message"), "ComputeTime" (rawinput1894957 "ComputeTime"), "Recipe" (rawinput1894957 "Recipe"), "CreatedAt" (rawinput1894957 "CreatedAt"), "ScoreThresholdLastUpdatedAt" (rawinput1894957 "ScoreThresholdLastUpdatedAt"), "EndpointInfo" (rawinput1894957 "EndpointInfo"), "Name" (rawinput1894957 "Name"), "InputDataLocationS3" (rawinput1894957 "InputDataLocationS3"), "ScoreThreshold" (rawinput1894957 "ScoreThreshold"), "StartedAt" (rawinput1894957 "StartedAt")}] (clojure.core/cond-> {} (letvar1894959 "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (clojure.core/get-in letvar1894959 ["MLModelId"]))) (letvar1894959 "MLModelType") (clojure.core/assoc :ml-model-type (deser-ml-model-type (clojure.core/get-in letvar1894959 ["MLModelType"]))) (letvar1894959 "Schema") (clojure.core/assoc :schema (deser-data-schema (clojure.core/get-in letvar1894959 ["Schema"]))) (letvar1894959 "CreatedByIamUser") (clojure.core/assoc :created-by-iam-user (deser-aws-user-arn (clojure.core/get-in letvar1894959 ["CreatedByIamUser"]))) (letvar1894959 "FinishedAt") (clojure.core/assoc :finished-at (deser-epoch-time (clojure.core/get-in letvar1894959 ["FinishedAt"]))) (letvar1894959 "LogUri") (clojure.core/assoc :log-uri (deser-presigned-s-3-url (clojure.core/get-in letvar1894959 ["LogUri"]))) (letvar1894959 "SizeInBytes") (clojure.core/assoc :size-in-bytes (deser-long-type (clojure.core/get-in letvar1894959 ["SizeInBytes"]))) (letvar1894959 "Status") (clojure.core/assoc :status (deser-entity-status (clojure.core/get-in letvar1894959 ["Status"]))) (letvar1894959 "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-epoch-time (clojure.core/get-in letvar1894959 ["LastUpdatedAt"]))) (letvar1894959 "TrainingParameters") (clojure.core/assoc :training-parameters (deser-training-parameters (clojure.core/get-in letvar1894959 ["TrainingParameters"]))) (letvar1894959 "TrainingDataSourceId") (clojure.core/assoc :training-data-source-id (deser-entity-id (clojure.core/get-in letvar1894959 ["TrainingDataSourceId"]))) (letvar1894959 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1894959 ["Message"]))) (letvar1894959 "ComputeTime") (clojure.core/assoc :compute-time (deser-long-type (clojure.core/get-in letvar1894959 ["ComputeTime"]))) (letvar1894959 "Recipe") (clojure.core/assoc :recipe (deser-recipe (clojure.core/get-in letvar1894959 ["Recipe"]))) (letvar1894959 "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (clojure.core/get-in letvar1894959 ["CreatedAt"]))) (letvar1894959 "ScoreThresholdLastUpdatedAt") (clojure.core/assoc :score-threshold-last-updated-at (deser-epoch-time (clojure.core/get-in letvar1894959 ["ScoreThresholdLastUpdatedAt"]))) (letvar1894959 "EndpointInfo") (clojure.core/assoc :endpoint-info (deser-realtime-endpoint-info (clojure.core/get-in letvar1894959 ["EndpointInfo"]))) (letvar1894959 "Name") (clojure.core/assoc :name (deser-ml-model-name (clojure.core/get-in letvar1894959 ["Name"]))) (letvar1894959 "InputDataLocationS3") (clojure.core/assoc :input-data-location-s-3 (deser-s-3-url (clojure.core/get-in letvar1894959 ["InputDataLocationS3"]))) (letvar1894959 "ScoreThreshold") (clojure.core/assoc :score-threshold (deser-score-threshold (clojure.core/get-in letvar1894959 ["ScoreThreshold"]))) (letvar1894959 "StartedAt") (clojure.core/assoc :started-at (deser-epoch-time (clojure.core/get-in letvar1894959 ["StartedAt"])))))))

(clojure.core/defn- response-tag-limit-exceeded-exception ([input] (response-tag-limit-exceeded-exception nil input)) ([resultWrapper1894961 input] (clojure.core/let [rawinput1894960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894962 {"message" (rawinput1894960 "message")}] (clojure.core/cond-> {} (letvar1894962 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1894962 ["message"])))))))

(clojure.core/defn- response-update-ml-model-output ([input] (response-update-ml-model-output nil input)) ([resultWrapper1894964 input] (clojure.core/let [rawinput1894963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894965 {"MLModelId" (rawinput1894963 "MLModelId")}] (clojure.core/cond-> {} (letvar1894965 "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (clojure.core/get-in letvar1894965 ["MLModelId"])))))))

(clojure.core/defn- response-describe-batch-predictions-output ([input] (response-describe-batch-predictions-output nil input)) ([resultWrapper1894967 input] (clojure.core/let [rawinput1894966 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894968 {"Results" (rawinput1894966 "Results"), "NextToken" (rawinput1894966 "NextToken")}] (clojure.core/cond-> {} (letvar1894968 "Results") (clojure.core/assoc :results (deser-batch-predictions (clojure.core/get-in letvar1894968 ["Results"]))) (letvar1894968 "NextToken") (clojure.core/assoc :next-token (deser-string-type (clojure.core/get-in letvar1894968 ["NextToken"])))))))

(clojure.core/defn- response-update-batch-prediction-output ([input] (response-update-batch-prediction-output nil input)) ([resultWrapper1894970 input] (clojure.core/let [rawinput1894969 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894971 {"BatchPredictionId" (rawinput1894969 "BatchPredictionId")}] (clojure.core/cond-> {} (letvar1894971 "BatchPredictionId") (clojure.core/assoc :batch-prediction-id (deser-entity-id (clojure.core/get-in letvar1894971 ["BatchPredictionId"])))))))

(clojure.core/defn- response-get-evaluation-output ([input] (response-get-evaluation-output nil input)) ([resultWrapper1894973 input] (clojure.core/let [rawinput1894972 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894974 {"MLModelId" (rawinput1894972 "MLModelId"), "CreatedByIamUser" (rawinput1894972 "CreatedByIamUser"), "FinishedAt" (rawinput1894972 "FinishedAt"), "LogUri" (rawinput1894972 "LogUri"), "Status" (rawinput1894972 "Status"), "LastUpdatedAt" (rawinput1894972 "LastUpdatedAt"), "Message" (rawinput1894972 "Message"), "ComputeTime" (rawinput1894972 "ComputeTime"), "EvaluationId" (rawinput1894972 "EvaluationId"), "CreatedAt" (rawinput1894972 "CreatedAt"), "EvaluationDataSourceId" (rawinput1894972 "EvaluationDataSourceId"), "Name" (rawinput1894972 "Name"), "InputDataLocationS3" (rawinput1894972 "InputDataLocationS3"), "PerformanceMetrics" (rawinput1894972 "PerformanceMetrics"), "StartedAt" (rawinput1894972 "StartedAt")}] (clojure.core/cond-> {} (letvar1894974 "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (clojure.core/get-in letvar1894974 ["MLModelId"]))) (letvar1894974 "CreatedByIamUser") (clojure.core/assoc :created-by-iam-user (deser-aws-user-arn (clojure.core/get-in letvar1894974 ["CreatedByIamUser"]))) (letvar1894974 "FinishedAt") (clojure.core/assoc :finished-at (deser-epoch-time (clojure.core/get-in letvar1894974 ["FinishedAt"]))) (letvar1894974 "LogUri") (clojure.core/assoc :log-uri (deser-presigned-s-3-url (clojure.core/get-in letvar1894974 ["LogUri"]))) (letvar1894974 "Status") (clojure.core/assoc :status (deser-entity-status (clojure.core/get-in letvar1894974 ["Status"]))) (letvar1894974 "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-epoch-time (clojure.core/get-in letvar1894974 ["LastUpdatedAt"]))) (letvar1894974 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1894974 ["Message"]))) (letvar1894974 "ComputeTime") (clojure.core/assoc :compute-time (deser-long-type (clojure.core/get-in letvar1894974 ["ComputeTime"]))) (letvar1894974 "EvaluationId") (clojure.core/assoc :evaluation-id (deser-entity-id (clojure.core/get-in letvar1894974 ["EvaluationId"]))) (letvar1894974 "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (clojure.core/get-in letvar1894974 ["CreatedAt"]))) (letvar1894974 "EvaluationDataSourceId") (clojure.core/assoc :evaluation-data-source-id (deser-entity-id (clojure.core/get-in letvar1894974 ["EvaluationDataSourceId"]))) (letvar1894974 "Name") (clojure.core/assoc :name (deser-entity-name (clojure.core/get-in letvar1894974 ["Name"]))) (letvar1894974 "InputDataLocationS3") (clojure.core/assoc :input-data-location-s-3 (deser-s-3-url (clojure.core/get-in letvar1894974 ["InputDataLocationS3"]))) (letvar1894974 "PerformanceMetrics") (clojure.core/assoc :performance-metrics (deser-performance-metrics (clojure.core/get-in letvar1894974 ["PerformanceMetrics"]))) (letvar1894974 "StartedAt") (clojure.core/assoc :started-at (deser-epoch-time (clojure.core/get-in letvar1894974 ["StartedAt"])))))))

(clojure.core/defn- response-update-data-source-output ([input] (response-update-data-source-output nil input)) ([resultWrapper1894976 input] (clojure.core/let [rawinput1894975 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894977 {"DataSourceId" (rawinput1894975 "DataSourceId")}] (clojure.core/cond-> {} (letvar1894977 "DataSourceId") (clojure.core/assoc :data-source-id (deser-entity-id (clojure.core/get-in letvar1894977 ["DataSourceId"])))))))

(clojure.core/defn- response-create-data-source-from-redshift-output ([input] (response-create-data-source-from-redshift-output nil input)) ([resultWrapper1894979 input] (clojure.core/let [rawinput1894978 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894980 {"DataSourceId" (rawinput1894978 "DataSourceId")}] (clojure.core/cond-> {} (letvar1894980 "DataSourceId") (clojure.core/assoc :data-source-id (deser-entity-id (clojure.core/get-in letvar1894980 ["DataSourceId"])))))))

(clojure.core/defn- response-create-data-source-from-s-3-output ([input] (response-create-data-source-from-s-3-output nil input)) ([resultWrapper1894982 input] (clojure.core/let [rawinput1894981 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894983 {"DataSourceId" (rawinput1894981 "DataSourceId")}] (clojure.core/cond-> {} (letvar1894983 "DataSourceId") (clojure.core/assoc :data-source-id (deser-entity-id (clojure.core/get-in letvar1894983 ["DataSourceId"])))))))

(clojure.core/defn- response-describe-ml-models-output ([input] (response-describe-ml-models-output nil input)) ([resultWrapper1894985 input] (clojure.core/let [rawinput1894984 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894986 {"Results" (rawinput1894984 "Results"), "NextToken" (rawinput1894984 "NextToken")}] (clojure.core/cond-> {} (letvar1894986 "Results") (clojure.core/assoc :results (deser-ml-models (clojure.core/get-in letvar1894986 ["Results"]))) (letvar1894986 "NextToken") (clojure.core/assoc :next-token (deser-string-type (clojure.core/get-in letvar1894986 ["NextToken"])))))))

(clojure.core/defn- response-invalid-tag-exception ([input] (response-invalid-tag-exception nil input)) ([resultWrapper1894988 input] (clojure.core/let [rawinput1894987 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894989 {"message" (rawinput1894987 "message")}] (clojure.core/cond-> {} (letvar1894989 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1894989 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1894991 input] (clojure.core/let [rawinput1894990 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894992 {"message" (rawinput1894990 "message"), "code" (rawinput1894990 "code")}] (clojure.core/cond-> {} (letvar1894992 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1894992 ["message"]))) (letvar1894992 "code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1894992 ["code"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper1894994 input] (clojure.core/let [rawinput1894993 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894995 {"message" (rawinput1894993 "message"), "code" (rawinput1894993 "code")}] (clojure.core/cond-> {} (letvar1894995 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1894995 ["message"]))) (letvar1894995 "code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1894995 ["code"])))))))

(clojure.core/defn- response-idempotent-parameter-mismatch-exception ([input] (response-idempotent-parameter-mismatch-exception nil input)) ([resultWrapper1894997 input] (clojure.core/let [rawinput1894996 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1894998 {"message" (rawinput1894996 "message"), "code" (rawinput1894996 "code")}] (clojure.core/cond-> {} (letvar1894998 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1894998 ["message"]))) (letvar1894998 "code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1894998 ["code"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper1895000 input] (clojure.core/let [rawinput1894999 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895001 {"message" (rawinput1894999 "message"), "code" (rawinput1894999 "code")}] (clojure.core/cond-> {} (letvar1895001 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1895001 ["message"]))) (letvar1895001 "code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1895001 ["code"])))))))

(clojure.core/defn- response-delete-batch-prediction-output ([input] (response-delete-batch-prediction-output nil input)) ([resultWrapper1895003 input] (clojure.core/let [rawinput1895002 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895004 {"BatchPredictionId" (rawinput1895002 "BatchPredictionId")}] (clojure.core/cond-> {} (letvar1895004 "BatchPredictionId") (clojure.core/assoc :batch-prediction-id (deser-entity-id (clojure.core/get-in letvar1895004 ["BatchPredictionId"])))))))

(clojure.core/defn- response-create-data-source-from-rds-output ([input] (response-create-data-source-from-rds-output nil input)) ([resultWrapper1895006 input] (clojure.core/let [rawinput1895005 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895007 {"DataSourceId" (rawinput1895005 "DataSourceId")}] (clojure.core/cond-> {} (letvar1895007 "DataSourceId") (clojure.core/assoc :data-source-id (deser-entity-id (clojure.core/get-in letvar1895007 ["DataSourceId"])))))))

(clojure.core/defn- response-describe-tags-output ([input] (response-describe-tags-output nil input)) ([resultWrapper1895009 input] (clojure.core/let [rawinput1895008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895010 {"ResourceId" (rawinput1895008 "ResourceId"), "ResourceType" (rawinput1895008 "ResourceType"), "Tags" (rawinput1895008 "Tags")}] (clojure.core/cond-> {} (letvar1895010 "ResourceId") (clojure.core/assoc :resource-id (deser-entity-id (clojure.core/get-in letvar1895010 ["ResourceId"]))) (letvar1895010 "ResourceType") (clojure.core/assoc :resource-type (deser-taggable-resource-type (clojure.core/get-in letvar1895010 ["ResourceType"]))) (letvar1895010 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1895010 ["Tags"])))))))

(clojure.core/defn- response-create-batch-prediction-output ([input] (response-create-batch-prediction-output nil input)) ([resultWrapper1895012 input] (clojure.core/let [rawinput1895011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895013 {"BatchPredictionId" (rawinput1895011 "BatchPredictionId")}] (clojure.core/cond-> {} (letvar1895013 "BatchPredictionId") (clojure.core/assoc :batch-prediction-id (deser-entity-id (clojure.core/get-in letvar1895013 ["BatchPredictionId"])))))))

(clojure.core/defn- response-delete-data-source-output ([input] (response-delete-data-source-output nil input)) ([resultWrapper1895015 input] (clojure.core/let [rawinput1895014 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895016 {"DataSourceId" (rawinput1895014 "DataSourceId")}] (clojure.core/cond-> {} (letvar1895016 "DataSourceId") (clojure.core/assoc :data-source-id (deser-entity-id (clojure.core/get-in letvar1895016 ["DataSourceId"])))))))

(clojure.core/defn- response-create-evaluation-output ([input] (response-create-evaluation-output nil input)) ([resultWrapper1895018 input] (clojure.core/let [rawinput1895017 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895019 {"EvaluationId" (rawinput1895017 "EvaluationId")}] (clojure.core/cond-> {} (letvar1895019 "EvaluationId") (clojure.core/assoc :evaluation-id (deser-entity-id (clojure.core/get-in letvar1895019 ["EvaluationId"])))))))

(clojure.core/defn- response-describe-evaluations-output ([input] (response-describe-evaluations-output nil input)) ([resultWrapper1895021 input] (clojure.core/let [rawinput1895020 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895022 {"Results" (rawinput1895020 "Results"), "NextToken" (rawinput1895020 "NextToken")}] (clojure.core/cond-> {} (letvar1895022 "Results") (clojure.core/assoc :results (deser-evaluations (clojure.core/get-in letvar1895022 ["Results"]))) (letvar1895022 "NextToken") (clojure.core/assoc :next-token (deser-string-type (clojure.core/get-in letvar1895022 ["NextToken"])))))))

(clojure.core/defn- response-delete-ml-model-output ([input] (response-delete-ml-model-output nil input)) ([resultWrapper1895024 input] (clojure.core/let [rawinput1895023 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895025 {"MLModelId" (rawinput1895023 "MLModelId")}] (clojure.core/cond-> {} (letvar1895025 "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (clojure.core/get-in letvar1895025 ["MLModelId"])))))))

(clojure.core/defn- response-delete-evaluation-output ([input] (response-delete-evaluation-output nil input)) ([resultWrapper1895027 input] (clojure.core/let [rawinput1895026 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895028 {"EvaluationId" (rawinput1895026 "EvaluationId")}] (clojure.core/cond-> {} (letvar1895028 "EvaluationId") (clojure.core/assoc :evaluation-id (deser-entity-id (clojure.core/get-in letvar1895028 ["EvaluationId"])))))))

(clojure.core/defn- response-delete-realtime-endpoint-output ([input] (response-delete-realtime-endpoint-output nil input)) ([resultWrapper1895030 input] (clojure.core/let [rawinput1895029 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895031 {"MLModelId" (rawinput1895029 "MLModelId"), "RealtimeEndpointInfo" (rawinput1895029 "RealtimeEndpointInfo")}] (clojure.core/cond-> {} (letvar1895031 "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (clojure.core/get-in letvar1895031 ["MLModelId"]))) (letvar1895031 "RealtimeEndpointInfo") (clojure.core/assoc :realtime-endpoint-info (deser-realtime-endpoint-info (clojure.core/get-in letvar1895031 ["RealtimeEndpointInfo"])))))))

(clojure.core/defn- response-predict-output ([input] (response-predict-output nil input)) ([resultWrapper1895033 input] (clojure.core/let [rawinput1895032 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895034 {"Prediction" (rawinput1895032 "Prediction")}] (clojure.core/cond-> {} (letvar1895034 "Prediction") (clojure.core/assoc :prediction (deser-prediction (clojure.core/get-in letvar1895034 ["Prediction"])))))))

(clojure.core/defn- response-create-realtime-endpoint-output ([input] (response-create-realtime-endpoint-output nil input)) ([resultWrapper1895036 input] (clojure.core/let [rawinput1895035 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895037 {"MLModelId" (rawinput1895035 "MLModelId"), "RealtimeEndpointInfo" (rawinput1895035 "RealtimeEndpointInfo")}] (clojure.core/cond-> {} (letvar1895037 "MLModelId") (clojure.core/assoc :ml-model-id (deser-entity-id (clojure.core/get-in letvar1895037 ["MLModelId"]))) (letvar1895037 "RealtimeEndpointInfo") (clojure.core/assoc :realtime-endpoint-info (deser-realtime-endpoint-info (clojure.core/get-in letvar1895037 ["RealtimeEndpointInfo"])))))))

(clojure.core/defn- response-describe-data-sources-output ([input] (response-describe-data-sources-output nil input)) ([resultWrapper1895039 input] (clojure.core/let [rawinput1895038 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895040 {"Results" (rawinput1895038 "Results"), "NextToken" (rawinput1895038 "NextToken")}] (clojure.core/cond-> {} (letvar1895040 "Results") (clojure.core/assoc :results (deser-data-sources (clojure.core/get-in letvar1895040 ["Results"]))) (letvar1895040 "NextToken") (clojure.core/assoc :next-token (deser-string-type (clojure.core/get-in letvar1895040 ["NextToken"])))))))

(clojure.core/defn- response-predictor-not-mounted-exception ([input] (response-predictor-not-mounted-exception nil input)) ([resultWrapper1895042 input] (clojure.core/let [rawinput1895041 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895043 {"message" (rawinput1895041 "message")}] (clojure.core/cond-> {} (letvar1895043 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1895043 ["message"])))))))

(clojure.core/defn- response-get-data-source-output ([input] (response-get-data-source-output nil input)) ([resultWrapper1895045 input] (clojure.core/let [rawinput1895044 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1895046 {"CreatedByIamUser" (rawinput1895044 "CreatedByIamUser"), "ComputeStatistics" (rawinput1895044 "ComputeStatistics"), "DataSourceSchema" (rawinput1895044 "DataSourceSchema"), "RoleARN" (rawinput1895044 "RoleARN"), "FinishedAt" (rawinput1895044 "FinishedAt"), "LogUri" (rawinput1895044 "LogUri"), "DataRearrangement" (rawinput1895044 "DataRearrangement"), "RDSMetadata" (rawinput1895044 "RDSMetadata"), "DataSourceId" (rawinput1895044 "DataSourceId"), "Status" (rawinput1895044 "Status"), "LastUpdatedAt" (rawinput1895044 "LastUpdatedAt"), "DataLocationS3" (rawinput1895044 "DataLocationS3"), "Message" (rawinput1895044 "Message"), "ComputeTime" (rawinput1895044 "ComputeTime"), "NumberOfFiles" (rawinput1895044 "NumberOfFiles"), "CreatedAt" (rawinput1895044 "CreatedAt"), "RedshiftMetadata" (rawinput1895044 "RedshiftMetadata"), "Name" (rawinput1895044 "Name"), "DataSizeInBytes" (rawinput1895044 "DataSizeInBytes"), "StartedAt" (rawinput1895044 "StartedAt")}] (clojure.core/cond-> {} (letvar1895046 "CreatedByIamUser") (clojure.core/assoc :created-by-iam-user (deser-aws-user-arn (clojure.core/get-in letvar1895046 ["CreatedByIamUser"]))) (letvar1895046 "ComputeStatistics") (clojure.core/assoc :compute-statistics (deser-compute-statistics (clojure.core/get-in letvar1895046 ["ComputeStatistics"]))) (letvar1895046 "DataSourceSchema") (clojure.core/assoc :data-source-schema (deser-data-schema (clojure.core/get-in letvar1895046 ["DataSourceSchema"]))) (letvar1895046 "RoleARN") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar1895046 ["RoleARN"]))) (letvar1895046 "FinishedAt") (clojure.core/assoc :finished-at (deser-epoch-time (clojure.core/get-in letvar1895046 ["FinishedAt"]))) (letvar1895046 "LogUri") (clojure.core/assoc :log-uri (deser-presigned-s-3-url (clojure.core/get-in letvar1895046 ["LogUri"]))) (letvar1895046 "DataRearrangement") (clojure.core/assoc :data-rearrangement (deser-data-rearrangement (clojure.core/get-in letvar1895046 ["DataRearrangement"]))) (letvar1895046 "RDSMetadata") (clojure.core/assoc :rds-metadata (deser-rds-metadata (clojure.core/get-in letvar1895046 ["RDSMetadata"]))) (letvar1895046 "DataSourceId") (clojure.core/assoc :data-source-id (deser-entity-id (clojure.core/get-in letvar1895046 ["DataSourceId"]))) (letvar1895046 "Status") (clojure.core/assoc :status (deser-entity-status (clojure.core/get-in letvar1895046 ["Status"]))) (letvar1895046 "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-epoch-time (clojure.core/get-in letvar1895046 ["LastUpdatedAt"]))) (letvar1895046 "DataLocationS3") (clojure.core/assoc :data-location-s-3 (deser-s-3-url (clojure.core/get-in letvar1895046 ["DataLocationS3"]))) (letvar1895046 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1895046 ["Message"]))) (letvar1895046 "ComputeTime") (clojure.core/assoc :compute-time (deser-long-type (clojure.core/get-in letvar1895046 ["ComputeTime"]))) (letvar1895046 "NumberOfFiles") (clojure.core/assoc :number-of-files (deser-long-type (clojure.core/get-in letvar1895046 ["NumberOfFiles"]))) (letvar1895046 "CreatedAt") (clojure.core/assoc :created-at (deser-epoch-time (clojure.core/get-in letvar1895046 ["CreatedAt"]))) (letvar1895046 "RedshiftMetadata") (clojure.core/assoc :redshift-metadata (deser-redshift-metadata (clojure.core/get-in letvar1895046 ["RedshiftMetadata"]))) (letvar1895046 "Name") (clojure.core/assoc :name (deser-entity-name (clojure.core/get-in letvar1895046 ["Name"]))) (letvar1895046 "DataSizeInBytes") (clojure.core/assoc :data-size-in-bytes (deser-long-type (clojure.core/get-in letvar1895046 ["DataSizeInBytes"]))) (letvar1895046 "StartedAt") (clojure.core/assoc :started-at (deser-epoch-time (clojure.core/get-in letvar1895046 ["StartedAt"])))))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/edp-security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.machinelearning/edp-security-group-id))

(clojure.spec.alpha/def :portkey.aws.machinelearning/score-value-per-label-map (clojure.spec.alpha/map-of :portkey.aws.machinelearning/label :portkey.aws.machinelearning/score-value))

(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-database-username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/ml-model-type #{:binary "MULTICLASS" :regression "REGRESSION" :multiclass "BINARY"})

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/prefix (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/ne (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/lt (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/limit (clojure.spec.alpha/and :portkey.aws.machinelearning/page-limit))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/ge (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/le (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/eq (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/filter-variable (clojure.spec.alpha/and :portkey.aws.machinelearning/evaluation-filter-variable))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-input/gt (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-evaluations-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-evaluations-input/prefix :portkey.aws.machinelearning.describe-evaluations-input/ne :portkey.aws.machinelearning/sort-order :portkey.aws.machinelearning.describe-evaluations-input/lt :portkey.aws.machinelearning.describe-evaluations-input/limit :portkey.aws.machinelearning.describe-evaluations-input/ge :portkey.aws.machinelearning.describe-evaluations-input/next-token :portkey.aws.machinelearning.describe-evaluations-input/le :portkey.aws.machinelearning.describe-evaluations-input/eq :portkey.aws.machinelearning.describe-evaluations-input/filter-variable :portkey.aws.machinelearning.describe-evaluations-input/gt]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-tags-input/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-tags-input/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.describe-tags-input/resource-id :portkey.aws.machinelearning.describe-tags-input/resource-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/performance-metrics-property-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning/edp-pipeline-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-database-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/prefix (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/ne (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/lt (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/limit (clojure.spec.alpha/and :portkey.aws.machinelearning/page-limit))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/ge (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/le (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/eq (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/filter-variable (clojure.spec.alpha/and :portkey.aws.machinelearning/data-source-filter-variable))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-input/gt (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-data-sources-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-data-sources-input/prefix :portkey.aws.machinelearning.describe-data-sources-input/ne :portkey.aws.machinelearning/sort-order :portkey.aws.machinelearning.describe-data-sources-input/lt :portkey.aws.machinelearning.describe-data-sources-input/limit :portkey.aws.machinelearning.describe-data-sources-input/ge :portkey.aws.machinelearning.describe-data-sources-input/next-token :portkey.aws.machinelearning.describe-data-sources-input/le :portkey.aws.machinelearning.describe-data-sources-input/eq :portkey.aws.machinelearning.describe-data-sources-input/filter-variable :portkey.aws.machinelearning.describe-data-sources-input/gt]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.update-ml-model-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.update-ml-model-input/ml-model-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning/update-ml-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.update-ml-model-input/ml-model-id] :opt-un [:portkey.aws.machinelearning.update-ml-model-input/ml-model-name :portkey.aws.machinelearning/score-threshold]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/data-source-filter-variable #{:iam-user :name "Status" "LastUpdatedAt" "DataLocationS3" :last-updated-at :status "IAMUser" "CreatedAt" :data-location-s-3 "Name" :created-at})

(clojure.spec.alpha/def :portkey.aws.machinelearning/variable-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning/compute-statistics clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.machinelearning/presigned-s-3-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/get-ml-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.get-ml-model-input/ml-model-id] :opt-un [:portkey.aws.machinelearning/verbose]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-ml-model-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-ml-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.delete-ml-model-input/ml-model-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 110))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-database/instance-identifier (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-instance-identifier))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-database/database-name (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-database-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-database (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.rds-database/instance-identifier :portkey.aws.machinelearning.rds-database/database-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/status (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/evaluation-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.evaluation/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning/evaluation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.evaluation/ml-model-id :portkey.aws.machinelearning.evaluation/created-by-iam-user :portkey.aws.machinelearning.evaluation/finished-at :portkey.aws.machinelearning.evaluation/status :portkey.aws.machinelearning.evaluation/last-updated-at :portkey.aws.machinelearning/message :portkey.aws.machinelearning.evaluation/compute-time :portkey.aws.machinelearning.evaluation/evaluation-id :portkey.aws.machinelearning.evaluation/created-at :portkey.aws.machinelearning.evaluation/evaluation-data-source-id :portkey.aws.machinelearning.evaluation/name :portkey.aws.machinelearning.evaluation/input-data-location-s-3 :portkey.aws.machinelearning/performance-metrics :portkey.aws.machinelearning.evaluation/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.update-data-source-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.update-data-source-input/data-source-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning/update-data-source-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.update-data-source-input/data-source-id :portkey.aws.machinelearning.update-data-source-input/data-source-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/entity-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*|^$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-tags-output/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-tags-output/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.delete-tags-output/resource-id :portkey.aws.machinelearning.delete-tags-output/resource-type]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/evaluation-filter-variable #{"MLModelId" :data-source-id :iam-user "DataURI" :name :ml-model-id "DataSourceId" "Status" "LastUpdatedAt" :last-updated-at :status "IAMUser" "CreatedAt" "Name" :created-at :data-uri})

(clojure.spec.alpha/def :portkey.aws.machinelearning/data-rearrangement (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning/edp-resource-role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-metadata/database (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-database))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-metadata/database-user-name (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-database-username))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-metadata/select-sql-query (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-select-sql-query))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-metadata/resource-role (clojure.spec.alpha/and :portkey.aws.machinelearning/edp-resource-role))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-metadata/service-role (clojure.spec.alpha/and :portkey.aws.machinelearning/edp-service-role))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-metadata/data-pipeline-id (clojure.spec.alpha/and :portkey.aws.machinelearning/edp-pipeline-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.rds-metadata/database :portkey.aws.machinelearning.rds-metadata/database-user-name :portkey.aws.machinelearning.rds-metadata/select-sql-query :portkey.aws.machinelearning.rds-metadata/resource-role :portkey.aws.machinelearning.rds-metadata/service-role :portkey.aws.machinelearning.rds-metadata/data-pipeline-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/data-schema (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 131071))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.update-evaluation-output/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/update-evaluation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.update-evaluation-output/evaluation-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.add-tags-output/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.add-tags-output/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.add-tags-output/resource-id :portkey.aws.machinelearning.add-tags-output/resource-type]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/log-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/presigned-s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/batch-prediction-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/status (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/output-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/invalid-record-count (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/total-record-count (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-output/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning/get-batch-prediction-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.get-batch-prediction-output/ml-model-id :portkey.aws.machinelearning.get-batch-prediction-output/created-by-iam-user :portkey.aws.machinelearning.get-batch-prediction-output/finished-at :portkey.aws.machinelearning.get-batch-prediction-output/log-uri :portkey.aws.machinelearning.get-batch-prediction-output/batch-prediction-data-source-id :portkey.aws.machinelearning.get-batch-prediction-output/status :portkey.aws.machinelearning.get-batch-prediction-output/last-updated-at :portkey.aws.machinelearning.get-batch-prediction-output/output-uri :portkey.aws.machinelearning.get-batch-prediction-output/invalid-record-count :portkey.aws.machinelearning/message :portkey.aws.machinelearning.get-batch-prediction-output/compute-time :portkey.aws.machinelearning.get-batch-prediction-output/batch-prediction-id :portkey.aws.machinelearning.get-batch-prediction-output/created-at :portkey.aws.machinelearning.get-batch-prediction-output/total-record-count :portkey.aws.machinelearning.get-batch-prediction-output/name :portkey.aws.machinelearning.get-batch-prediction-output/input-data-location-s-3 :portkey.aws.machinelearning.get-batch-prediction-output/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/sort-order #{:asc "dsc" "asc" :dsc})

(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-input/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/get-evaluation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.get-evaluation-input/evaluation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-ml-model-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-ml-model-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.create-ml-model-output/ml-model-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/ml-models (clojure.spec.alpha/coll-of :portkey.aws.machinelearning/ml-model))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/prefix (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/ne (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/lt (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/limit (clojure.spec.alpha/and :portkey.aws.machinelearning/page-limit))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/ge (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/le (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/eq (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/filter-variable (clojure.spec.alpha/and :portkey.aws.machinelearning/batch-prediction-filter-variable))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-input/gt (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-batch-predictions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-batch-predictions-input/prefix :portkey.aws.machinelearning.describe-batch-predictions-input/ne :portkey.aws.machinelearning/sort-order :portkey.aws.machinelearning.describe-batch-predictions-input/lt :portkey.aws.machinelearning.describe-batch-predictions-input/limit :portkey.aws.machinelearning.describe-batch-predictions-input/ge :portkey.aws.machinelearning.describe-batch-predictions-input/next-token :portkey.aws.machinelearning.describe-batch-predictions-input/le :portkey.aws.machinelearning.describe-batch-predictions-input/eq :portkey.aws.machinelearning.describe-batch-predictions-input/filter-variable :portkey.aws.machinelearning.describe-batch-predictions-input/gt]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.limit-exceeded-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.limit-exceeded-exception/message :portkey.aws.machinelearning.limit-exceeded-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-rds-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-rds-input/data-source-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-rds-input/rds-data (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-data-spec))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-data-source-from-rds-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.create-data-source-from-rds-input/data-source-id :portkey.aws.machinelearning.create-data-source-from-rds-input/rds-data :portkey.aws.machinelearning/role-arn] :opt-un [:portkey.aws.machinelearning.create-data-source-from-rds-input/data-source-name :portkey.aws.machinelearning/compute-statistics]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/integer-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/schema (clojure.spec.alpha/and :portkey.aws.machinelearning/data-schema))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/log-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/presigned-s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/size-in-bytes (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/status (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/training-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/score-threshold-last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/endpoint-info (clojure.spec.alpha/and :portkey.aws.machinelearning/realtime-endpoint-info))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/name (clojure.spec.alpha/and :portkey.aws.machinelearning/ml-model-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-ml-model-output/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning/get-ml-model-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.get-ml-model-output/ml-model-id :portkey.aws.machinelearning/ml-model-type :portkey.aws.machinelearning.get-ml-model-output/schema :portkey.aws.machinelearning.get-ml-model-output/created-by-iam-user :portkey.aws.machinelearning.get-ml-model-output/finished-at :portkey.aws.machinelearning.get-ml-model-output/log-uri :portkey.aws.machinelearning.get-ml-model-output/size-in-bytes :portkey.aws.machinelearning.get-ml-model-output/status :portkey.aws.machinelearning.get-ml-model-output/last-updated-at :portkey.aws.machinelearning/training-parameters :portkey.aws.machinelearning.get-ml-model-output/training-data-source-id :portkey.aws.machinelearning/message :portkey.aws.machinelearning.get-ml-model-output/compute-time :portkey.aws.machinelearning/recipe :portkey.aws.machinelearning.get-ml-model-output/created-at :portkey.aws.machinelearning.get-ml-model-output/score-threshold-last-updated-at :portkey.aws.machinelearning.get-ml-model-output/endpoint-info :portkey.aws.machinelearning.get-ml-model-output/name :portkey.aws.machinelearning.get-ml-model-output/input-data-location-s-3 :portkey.aws.machinelearning/score-threshold :portkey.aws.machinelearning.get-ml-model-output/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.tag-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning/tag-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.tag-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/aws-user-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws:iam::[0-9]+:((user/.+)|(root))" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-database-credentials/username (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-database-username))
(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-database-credentials/password (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-database-password))
(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-database-credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.redshift-database-credentials/username :portkey.aws.machinelearning.redshift-database-credentials/password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.update-ml-model-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/update-ml-model-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.update-ml-model-output/ml-model-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-output/results (clojure.spec.alpha/and :portkey.aws.machinelearning/batch-predictions))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-batch-predictions-output/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-batch-predictions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-batch-predictions-output/results :portkey.aws.machinelearning.describe-batch-predictions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.update-batch-prediction-output/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/update-batch-prediction-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.update-batch-prediction-output/batch-prediction-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/log-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/presigned-s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/status (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/evaluation-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-evaluation-output/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning/get-evaluation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.get-evaluation-output/ml-model-id :portkey.aws.machinelearning.get-evaluation-output/created-by-iam-user :portkey.aws.machinelearning.get-evaluation-output/finished-at :portkey.aws.machinelearning.get-evaluation-output/log-uri :portkey.aws.machinelearning.get-evaluation-output/status :portkey.aws.machinelearning.get-evaluation-output/last-updated-at :portkey.aws.machinelearning/message :portkey.aws.machinelearning.get-evaluation-output/compute-time :portkey.aws.machinelearning.get-evaluation-output/evaluation-id :portkey.aws.machinelearning.get-evaluation-output/created-at :portkey.aws.machinelearning.get-evaluation-output/evaluation-data-source-id :portkey.aws.machinelearning.get-evaluation-output/name :portkey.aws.machinelearning.get-evaluation-output/input-data-location-s-3 :portkey.aws.machinelearning/performance-metrics :portkey.aws.machinelearning.get-evaluation-output/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.update-data-source-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/update-data-source-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.update-data-source-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-redshift-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-data-source-from-redshift-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.create-data-source-from-redshift-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-s-3-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-data-source-from-s-3-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.create-data-source-from-s-3-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/long-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.machinelearning/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/prefix (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/ne (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/lt (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/limit (clojure.spec.alpha/and :portkey.aws.machinelearning/page-limit))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/ge (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/le (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/eq (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/filter-variable (clojure.spec.alpha/and :portkey.aws.machinelearning/ml-model-filter-variable))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-input/gt (clojure.spec.alpha/and :portkey.aws.machinelearning/comparator-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-ml-models-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-ml-models-input/prefix :portkey.aws.machinelearning.describe-ml-models-input/ne :portkey.aws.machinelearning/sort-order :portkey.aws.machinelearning.describe-ml-models-input/lt :portkey.aws.machinelearning.describe-ml-models-input/limit :portkey.aws.machinelearning.describe-ml-models-input/ge :portkey.aws.machinelearning.describe-ml-models-input/next-token :portkey.aws.machinelearning.describe-ml-models-input/le :portkey.aws.machinelearning.describe-ml-models-input/eq :portkey.aws.machinelearning.describe-ml-models-input/filter-variable :portkey.aws.machinelearning.describe-ml-models-input/gt]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/training-parameters (clojure.spec.alpha/map-of :portkey.aws.machinelearning/string-type :portkey.aws.machinelearning/string-type))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-batch-prediction-input/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-batch-prediction-input/batch-prediction-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-batch-prediction-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-batch-prediction-input/batch-prediction-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-batch-prediction-input/output-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-batch-prediction-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.create-batch-prediction-input/batch-prediction-id :portkey.aws.machinelearning.create-batch-prediction-input/ml-model-id :portkey.aws.machinelearning.create-batch-prediction-input/batch-prediction-data-source-id :portkey.aws.machinelearning.create-batch-prediction-input/output-uri] :opt-un [:portkey.aws.machinelearning.create-batch-prediction-input/batch-prediction-name]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-evaluation-input/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-evaluation-input/evaluation-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-evaluation-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-evaluation-input/evaluation-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-evaluation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.create-evaluation-input/evaluation-id :portkey.aws.machinelearning.create-evaluation-input/ml-model-id :portkey.aws.machinelearning.create-evaluation-input/evaluation-data-source-id] :opt-un [:portkey.aws.machinelearning.create-evaluation-input/evaluation-name]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/performance-metrics-property-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning/comparator-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*|^$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-select-sql-query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 16777216))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-output/results (clojure.spec.alpha/and :portkey.aws.machinelearning/ml-models))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-ml-models-output/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-ml-models-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-ml-models-output/results :portkey.aws.machinelearning.describe-ml-models-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/data-sources (clojure.spec.alpha/coll-of :portkey.aws.machinelearning/data-source))

(clojure.spec.alpha/def :portkey.aws.machinelearning/tag-list (clojure.spec.alpha/coll-of :portkey.aws.machinelearning/tag :max-count 100))

(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/get-data-source-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.get-data-source-input/data-source-id] :opt-un [:portkey.aws.machinelearning/verbose]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.invalid-tag-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.invalid-tag-exception/message]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.machinelearning/tag-key :max-count 100))

(clojure.spec.alpha/def :portkey.aws.machinelearning/taggable-resource-type #{"Evaluation" :data-source :ml-model "MLModel" :evaluation "DataSource" "BatchPrediction" :batch-prediction})

(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-data-spec/database-information (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-database))
(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-data-spec/select-sql-query (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-select-sql-query))
(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-data-spec/database-credentials (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-database-credentials))
(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-data-spec/s-3-staging-location (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-data-spec/data-schema-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-data-spec (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.redshift-data-spec/database-information :portkey.aws.machinelearning.redshift-data-spec/select-sql-query :portkey.aws.machinelearning.redshift-data-spec/database-credentials :portkey.aws.machinelearning.redshift-data-spec/s-3-staging-location] :opt-un [:portkey.aws.machinelearning/data-rearrangement :portkey.aws.machinelearning/data-schema :portkey.aws.machinelearning.redshift-data-spec/data-schema-uri]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-data-source-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-data-source-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.delete-data-source-input/data-source-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/performance-metrics-properties (clojure.spec.alpha/map-of :portkey.aws.machinelearning/performance-metrics-property-key :portkey.aws.machinelearning/performance-metrics-property-value))

(clojure.spec.alpha/def :portkey.aws.machinelearning/verbose clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.machinelearning/algorithm #{"sgd" :sgd})

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-redshift-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-redshift-input/data-source-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-redshift-input/data-spec (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-data-spec))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-data-source-from-redshift-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.create-data-source-from-redshift-input/data-source-id :portkey.aws.machinelearning.create-data-source-from-redshift-input/data-spec :portkey.aws.machinelearning/role-arn] :opt-un [:portkey.aws.machinelearning.create-data-source-from-redshift-input/data-source-name :portkey.aws.machinelearning/compute-statistics]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/error-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.update-batch-prediction-input/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.update-batch-prediction-input/batch-prediction-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning/update-batch-prediction-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.update-batch-prediction-input/batch-prediction-id :portkey.aws.machinelearning.update-batch-prediction-input/batch-prediction-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-database-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-z0-9]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.resource-not-found-exception/message :portkey.aws.machinelearning.resource-not-found-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.internal-server-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.internal-server-exception/message :portkey.aws.machinelearning.internal-server-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/size-in-bytes (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/status (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/training-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/score-threshold-last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/endpoint-info (clojure.spec.alpha/and :portkey.aws.machinelearning/realtime-endpoint-info))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/name (clojure.spec.alpha/and :portkey.aws.machinelearning/ml-model-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.ml-model/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning/ml-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.ml-model/ml-model-id :portkey.aws.machinelearning/ml-model-type :portkey.aws.machinelearning.ml-model/created-by-iam-user :portkey.aws.machinelearning.ml-model/finished-at :portkey.aws.machinelearning.ml-model/size-in-bytes :portkey.aws.machinelearning.ml-model/status :portkey.aws.machinelearning.ml-model/last-updated-at :portkey.aws.machinelearning/training-parameters :portkey.aws.machinelearning.ml-model/training-data-source-id :portkey.aws.machinelearning/algorithm :portkey.aws.machinelearning/message :portkey.aws.machinelearning.ml-model/compute-time :portkey.aws.machinelearning.ml-model/created-at :portkey.aws.machinelearning.ml-model/score-threshold-last-updated-at :portkey.aws.machinelearning.ml-model/endpoint-info :portkey.aws.machinelearning.ml-model/name :portkey.aws.machinelearning.ml-model/input-data-location-s-3 :portkey.aws.machinelearning/score-threshold :portkey.aws.machinelearning.ml-model/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/evaluations (clojure.spec.alpha/coll-of :portkey.aws.machinelearning/evaluation))

(clojure.spec.alpha/def :portkey.aws.machinelearning/edp-security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-tags-input/tag-keys (clojure.spec.alpha/and :portkey.aws.machinelearning/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-tags-input/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-tags-input/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.delete-tags-input/tag-keys :portkey.aws.machinelearning.delete-tags-input/resource-id :portkey.aws.machinelearning.delete-tags-input/resource-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.idempotent-parameter-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.idempotent-parameter-mismatch-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.idempotent-parameter-mismatch-exception/message :portkey.aws.machinelearning.idempotent-parameter-mismatch-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning.invalid-input-exception/code (clojure.spec.alpha/and :portkey.aws.machinelearning/error-code))
(clojure.spec.alpha/def :portkey.aws.machinelearning/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.invalid-input-exception/message :portkey.aws.machinelearning.invalid-input-exception/code]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/ml-model-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-database/database-name (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-database-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-database/cluster-identifier (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-cluster-identifier))
(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-database (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.redshift-database/database-name :portkey.aws.machinelearning.redshift-database/cluster-identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/entity-status #{"COMPLETED" :deleted :inprogress :pending :completed "PENDING" "FAILED" "DELETED" "INPROGRESS" :failed})

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-s-3-input/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-s-3-input/data-source-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-s-3-input/data-spec (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-data-spec))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-data-source-from-s-3-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.create-data-source-from-s-3-input/data-source-id :portkey.aws.machinelearning.create-data-source-from-s-3-input/data-spec] :opt-un [:portkey.aws.machinelearning.create-data-source-from-s-3-input/data-source-name :portkey.aws.machinelearning/compute-statistics]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.machinelearning/tag-list))
(clojure.spec.alpha/def :portkey.aws.machinelearning.add-tags-input/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.add-tags-input/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.add-tags-input/tags :portkey.aws.machinelearning.add-tags-input/resource-id :portkey.aws.machinelearning.add-tags-input/resource-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-batch-prediction-input/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-batch-prediction-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.delete-batch-prediction-input/batch-prediction-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.update-evaluation-input/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.update-evaluation-input/evaluation-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning/update-evaluation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.update-evaluation-input/evaluation-id :portkey.aws.machinelearning.update-evaluation-input/evaluation-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-batch-prediction-output/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-batch-prediction-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.delete-batch-prediction-output/batch-prediction-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/variable-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning/recipe (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 131071))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/edp-service-role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/details-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/string-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/status (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/number-of-files (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/data-size-in-bytes (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.data-source/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning/data-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.data-source/created-by-iam-user :portkey.aws.machinelearning/compute-statistics :portkey.aws.machinelearning/role-arn :portkey.aws.machinelearning.data-source/finished-at :portkey.aws.machinelearning/data-rearrangement :portkey.aws.machinelearning/rds-metadata :portkey.aws.machinelearning.data-source/data-source-id :portkey.aws.machinelearning.data-source/status :portkey.aws.machinelearning.data-source/last-updated-at :portkey.aws.machinelearning.data-source/data-location-s-3 :portkey.aws.machinelearning/message :portkey.aws.machinelearning.data-source/compute-time :portkey.aws.machinelearning.data-source/number-of-files :portkey.aws.machinelearning.data-source/created-at :portkey.aws.machinelearning/redshift-metadata :portkey.aws.machinelearning.data-source/name :portkey.aws.machinelearning.data-source/data-size-in-bytes :portkey.aws.machinelearning.data-source/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/batch-prediction-filter-variable #{"MLModelId" :data-source-id :iam-user "DataURI" :name :ml-model-id "DataSourceId" "Status" "LastUpdatedAt" :last-updated-at :status "IAMUser" "CreatedAt" "Name" :created-at :data-uri})

(clojure.spec.alpha/def :portkey.aws.machinelearning.s-3-data-spec/data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.s-3-data-spec/data-schema-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning/s-3-data-spec (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.s-3-data-spec/data-location-s-3] :opt-un [:portkey.aws.machinelearning/data-rearrangement :portkey.aws.machinelearning/data-schema :portkey.aws.machinelearning.s-3-data-spec/data-schema-location-s-3]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-data-source-from-rds-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-data-source-from-rds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.create-data-source-from-rds-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-tags-output/resource-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-tags-output/resource-type (clojure.spec.alpha/and :portkey.aws.machinelearning/taggable-resource-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-tags-output/tags (clojure.spec.alpha/and :portkey.aws.machinelearning/tag-list))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-tags-output/resource-id :portkey.aws.machinelearning.describe-tags-output/resource-type :portkey.aws.machinelearning.describe-tags-output/tags]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-cluster-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/record (clojure.spec.alpha/map-of :portkey.aws.machinelearning/variable-name :portkey.aws.machinelearning/variable-value))

(clojure.spec.alpha/def :portkey.aws.machinelearning/edp-subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-batch-prediction-output/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-batch-prediction-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.create-batch-prediction-output/batch-prediction-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-realtime-endpoint-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-realtime-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.delete-realtime-endpoint-input/ml-model-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.predict-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.predict-input/predict-endpoint (clojure.spec.alpha/and :portkey.aws.machinelearning/vip-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning/predict-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.predict-input/ml-model-id :portkey.aws.machinelearning/record :portkey.aws.machinelearning.predict-input/predict-endpoint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-database-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 8 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-data-source-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-data-source-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.delete-data-source-output/data-source-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/s-3-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"s3://([^/]+)(/.*)?" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-select-sql-query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 16777216))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-evaluation-output/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-evaluation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.create-evaluation-output/evaluation-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-output/results (clojure.spec.alpha/and :portkey.aws.machinelearning/evaluations))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-evaluations-output/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-evaluations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-evaluations-output/results :portkey.aws.machinelearning.describe-evaluations-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-database-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 8 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-metadata/database-user-name (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-database-username))
(clojure.spec.alpha/def :portkey.aws.machinelearning.redshift-metadata/select-sql-query (clojure.spec.alpha/and :portkey.aws.machinelearning/redshift-select-sql-query))
(clojure.spec.alpha/def :portkey.aws.machinelearning/redshift-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning/redshift-database :portkey.aws.machinelearning.redshift-metadata/database-user-name :portkey.aws.machinelearning.redshift-metadata/select-sql-query]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-ml-model-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-ml-model-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.delete-ml-model-output/ml-model-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-evaluation-output/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-evaluation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.delete-evaluation-output/evaluation-id]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-instance-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-realtime-endpoint-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-realtime-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.create-realtime-endpoint-input/ml-model-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning.tag/key (clojure.spec.alpha/and :portkey.aws.machinelearning/tag-key))
(clojure.spec.alpha/def :portkey.aws.machinelearning.tag/value (clojure.spec.alpha/and :portkey.aws.machinelearning/tag-value))
(clojure.spec.alpha/def :portkey.aws.machinelearning/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.tag/key :portkey.aws.machinelearning.tag/value]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/entity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-realtime-endpoint-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-realtime-endpoint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.delete-realtime-endpoint-output/ml-model-id :portkey.aws.machinelearning/realtime-endpoint-info]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.get-batch-prediction-input/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/get-batch-prediction-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.get-batch-prediction-input/batch-prediction-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/float-label clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.machinelearning/page-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.machinelearning.delete-evaluation-input/evaluation-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/delete-evaluation-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.delete-evaluation-input/evaluation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.machinelearning/predict-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning/prediction]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-realtime-endpoint-output/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-realtime-endpoint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.create-realtime-endpoint-output/ml-model-id :portkey.aws.machinelearning/realtime-endpoint-info]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.prediction/predicted-label (clojure.spec.alpha/and :portkey.aws.machinelearning/label))
(clojure.spec.alpha/def :portkey.aws.machinelearning.prediction/predicted-value (clojure.spec.alpha/and :portkey.aws.machinelearning/float-label))
(clojure.spec.alpha/def :portkey.aws.machinelearning.prediction/predicted-scores (clojure.spec.alpha/and :portkey.aws.machinelearning/score-value-per-label-map))
(clojure.spec.alpha/def :portkey.aws.machinelearning.prediction/details (clojure.spec.alpha/and :portkey.aws.machinelearning/details-map))
(clojure.spec.alpha/def :portkey.aws.machinelearning/prediction (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.prediction/predicted-label :portkey.aws.machinelearning.prediction/predicted-value :portkey.aws.machinelearning.prediction/predicted-scores :portkey.aws.machinelearning.prediction/details]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/realtime-endpoint-status #{:ready "UPDATING" "READY" "NONE" "FAILED" :updating :none :failed})

(clojure.spec.alpha/def :portkey.aws.machinelearning/vip-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-output/results (clojure.spec.alpha/and :portkey.aws.machinelearning/data-sources))
(clojure.spec.alpha/def :portkey.aws.machinelearning.describe-data-sources-output/next-token (clojure.spec.alpha/and :portkey.aws.machinelearning/string-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning/describe-data-sources-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.describe-data-sources-output/results :portkey.aws.machinelearning.describe-data-sources-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.create-ml-model-input/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-ml-model-input/ml-model-name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-ml-model-input/parameters (clojure.spec.alpha/and :portkey.aws.machinelearning/training-parameters))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-ml-model-input/training-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.create-ml-model-input/recipe-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning/create-ml-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.create-ml-model-input/ml-model-id :portkey.aws.machinelearning/ml-model-type :portkey.aws.machinelearning.create-ml-model-input/training-data-source-id] :opt-un [:portkey.aws.machinelearning.create-ml-model-input/ml-model-name :portkey.aws.machinelearning.create-ml-model-input/parameters :portkey.aws.machinelearning/recipe :portkey.aws.machinelearning.create-ml-model-input/recipe-uri]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/data-schema-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/service-role (clojure.spec.alpha/and :portkey.aws.machinelearning/edp-service-role))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/security-group-ids (clojure.spec.alpha/and :portkey.aws.machinelearning/edp-security-group-ids))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/subnet-id (clojure.spec.alpha/and :portkey.aws.machinelearning/edp-subnet-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/database-credentials (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-database-credentials))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/select-sql-query (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-select-sql-query))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/database-information (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-database))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/resource-role (clojure.spec.alpha/and :portkey.aws.machinelearning/edp-resource-role))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-data-spec/s-3-staging-location (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-data-spec (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.rds-data-spec/database-information :portkey.aws.machinelearning.rds-data-spec/select-sql-query :portkey.aws.machinelearning.rds-data-spec/database-credentials :portkey.aws.machinelearning.rds-data-spec/s-3-staging-location :portkey.aws.machinelearning.rds-data-spec/resource-role :portkey.aws.machinelearning.rds-data-spec/service-role :portkey.aws.machinelearning.rds-data-spec/subnet-id :portkey.aws.machinelearning.rds-data-spec/security-group-ids] :opt-un [:portkey.aws.machinelearning.rds-data-spec/data-schema-uri :portkey.aws.machinelearning/data-rearrangement :portkey.aws.machinelearning/data-schema]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/ml-model-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/batch-prediction-data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/status (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/output-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/invalid-record-count (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/batch-prediction-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/total-record-count (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/input-data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.batch-prediction/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning/batch-prediction (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.batch-prediction/ml-model-id :portkey.aws.machinelearning.batch-prediction/created-by-iam-user :portkey.aws.machinelearning.batch-prediction/finished-at :portkey.aws.machinelearning.batch-prediction/batch-prediction-data-source-id :portkey.aws.machinelearning.batch-prediction/status :portkey.aws.machinelearning.batch-prediction/last-updated-at :portkey.aws.machinelearning.batch-prediction/output-uri :portkey.aws.machinelearning.batch-prediction/invalid-record-count :portkey.aws.machinelearning/message :portkey.aws.machinelearning.batch-prediction/compute-time :portkey.aws.machinelearning.batch-prediction/batch-prediction-id :portkey.aws.machinelearning.batch-prediction/created-at :portkey.aws.machinelearning.batch-prediction/total-record-count :portkey.aws.machinelearning.batch-prediction/name :portkey.aws.machinelearning.batch-prediction/input-data-location-s-3 :portkey.aws.machinelearning.batch-prediction/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.realtime-endpoint-info/peak-requests-per-second (clojure.spec.alpha/and :portkey.aws.machinelearning/integer-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.realtime-endpoint-info/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.realtime-endpoint-info/endpoint-url (clojure.spec.alpha/and :portkey.aws.machinelearning/vip-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.realtime-endpoint-info/endpoint-status (clojure.spec.alpha/and :portkey.aws.machinelearning/realtime-endpoint-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning/realtime-endpoint-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.realtime-endpoint-info/peak-requests-per-second :portkey.aws.machinelearning.realtime-endpoint-info/created-at :portkey.aws.machinelearning.realtime-endpoint-info/endpoint-url :portkey.aws.machinelearning.realtime-endpoint-info/endpoint-status]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/batch-predictions (clojure.spec.alpha/coll-of :portkey.aws.machinelearning/batch-prediction))

(clojure.spec.alpha/def :portkey.aws.machinelearning/ml-model-filter-variable #{"MLModelType" "TrainingDataURI" :iam-user :realtime-endpoint-status :algorithm :training-data-uri :name "Status" "LastUpdatedAt" :ml-model-type "TrainingDataSourceId" "Algorithm" :last-updated-at :status "IAMUser" "CreatedAt" :training-data-source-id "Name" :created-at "RealtimeEndpointStatus"})

(clojure.spec.alpha/def :portkey.aws.machinelearning/details-map (clojure.spec.alpha/map-of :portkey.aws.machinelearning/details-attributes :portkey.aws.machinelearning/details-value))

(clojure.spec.alpha/def :portkey.aws.machinelearning/score-value clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.machinelearning/details-attributes #{:algorithm :predictive-model-type "PredictiveModelType" "Algorithm"})

(clojure.spec.alpha/def :portkey.aws.machinelearning/score-threshold clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.predictor-not-mounted-exception/message (clojure.spec.alpha/and :portkey.aws.machinelearning/error-message))
(clojure.spec.alpha/def :portkey.aws.machinelearning/predictor-not-mounted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.predictor-not-mounted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.performance-metrics/properties (clojure.spec.alpha/and :portkey.aws.machinelearning/performance-metrics-properties))
(clojure.spec.alpha/def :portkey.aws.machinelearning/performance-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.performance-metrics/properties]))

(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-database-username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.machinelearning/epoch-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/created-by-iam-user (clojure.spec.alpha/and :portkey.aws.machinelearning/aws-user-arn))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/data-source-schema (clojure.spec.alpha/and :portkey.aws.machinelearning/data-schema))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/finished-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/log-uri (clojure.spec.alpha/and :portkey.aws.machinelearning/presigned-s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/data-source-id (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-id))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/status (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-status))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/last-updated-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/data-location-s-3 (clojure.spec.alpha/and :portkey.aws.machinelearning/s-3-url))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/compute-time (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/number-of-files (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/created-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/name (clojure.spec.alpha/and :portkey.aws.machinelearning/entity-name))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/data-size-in-bytes (clojure.spec.alpha/and :portkey.aws.machinelearning/long-type))
(clojure.spec.alpha/def :portkey.aws.machinelearning.get-data-source-output/started-at (clojure.spec.alpha/and :portkey.aws.machinelearning/epoch-time))
(clojure.spec.alpha/def :portkey.aws.machinelearning/get-data-source-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.machinelearning.get-data-source-output/created-by-iam-user :portkey.aws.machinelearning/compute-statistics :portkey.aws.machinelearning.get-data-source-output/data-source-schema :portkey.aws.machinelearning/role-arn :portkey.aws.machinelearning.get-data-source-output/finished-at :portkey.aws.machinelearning.get-data-source-output/log-uri :portkey.aws.machinelearning/data-rearrangement :portkey.aws.machinelearning/rds-metadata :portkey.aws.machinelearning.get-data-source-output/data-source-id :portkey.aws.machinelearning.get-data-source-output/status :portkey.aws.machinelearning.get-data-source-output/last-updated-at :portkey.aws.machinelearning.get-data-source-output/data-location-s-3 :portkey.aws.machinelearning/message :portkey.aws.machinelearning.get-data-source-output/compute-time :portkey.aws.machinelearning.get-data-source-output/number-of-files :portkey.aws.machinelearning.get-data-source-output/created-at :portkey.aws.machinelearning/redshift-metadata :portkey.aws.machinelearning.get-data-source-output/name :portkey.aws.machinelearning.get-data-source-output/data-size-in-bytes :portkey.aws.machinelearning.get-data-source-output/started-at]))

(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-database-credentials/username (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-database-username))
(clojure.spec.alpha/def :portkey.aws.machinelearning.rds-database-credentials/password (clojure.spec.alpha/and :portkey.aws.machinelearning/rds-database-password))
(clojure.spec.alpha/def :portkey.aws.machinelearning/rds-database-credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.machinelearning.rds-database-credentials/username :portkey.aws.machinelearning.rds-database-credentials/password] :opt-un []))

(clojure.core/defn create-ml-model "Creates a new MLModel using the DataSource and the recipe as information\nsources.\n An MLModel is nearly immutable. Users can update only the MLModelName and the\nScoreThreshold in an MLModel without creating a new MLModel.\n CreateMLModel is an asynchronous operation. In response to CreateMLModel,\nAmazon Machine Learning (Amazon ML) immediately returns and sets the MLModel\nstatus to PENDING. After the MLModel has been created and ready is for use,\nAmazon ML sets the status to COMPLETED.\n You can use the GetMLModel operation to check the progress of the MLModel\nduring the creation operation.\n CreateMLModel requires a DataSource with computed statistics, which can be\ncreated by setting ComputeStatistics to true in CreateDataSourceFromRDS,\nCreateDataSourceFromS3, or CreateDataSourceFromRedshift operations." ([create-ml-model-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-ml-model-input create-ml-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/create-ml-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/create-ml-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMLModel", :http.request.configuration/output-deser-fn response-create-ml-model-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-ml-model :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/create-ml-model-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/create-ml-model-output))

(clojure.core/defn update-batch-prediction "Updates the BatchPredictionName of a BatchPrediction.\n You can use the GetBatchPrediction operation to view the contents of the\nupdated data element." ([update-batch-prediction-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-batch-prediction-input update-batch-prediction-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/update-batch-prediction-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/update-batch-prediction-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateBatchPrediction", :http.request.configuration/output-deser-fn response-update-batch-prediction-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-batch-prediction :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/update-batch-prediction-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/update-batch-prediction-output))

(clojure.core/defn delete-evaluation "Assigns the DELETED status to an Evaluation, rendering it unusable.\n After invoking the DeleteEvaluation operation, you can use the GetEvaluation\noperation to verify that the status of the Evaluation changed to DELETED.\n Caution The results of the DeleteEvaluation operation are irreversible." ([delete-evaluation-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-evaluation-input delete-evaluation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/delete-evaluation-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/delete-evaluation-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEvaluation", :http.request.configuration/output-deser-fn response-delete-evaluation-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-evaluation :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/delete-evaluation-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/delete-evaluation-output))

(clojure.core/defn create-data-source-from-rds "Creates a DataSource object from an Amazon Relational Database Service\n(http://aws.amazon.com/rds/) (Amazon RDS). A DataSource references data that can\nbe used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction\noperations.\n CreateDataSourceFromRDS is an asynchronous operation. In response to\nCreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns\nand sets the DataSource status to PENDING. After the DataSource is created and\nready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in\nthe COMPLETED or PENDING state can be used only to perform >CreateMLModel>,\nCreateEvaluation, or CreateBatchPrediction operations.\n If Amazon ML cannot accept the input source, it sets the Status parameter to\nFAILED and includes an error message in the Message attribute of the\nGetDataSource operation response." ([create-data-source-from-rds-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-data-source-from-rds-input create-data-source-from-rds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/create-data-source-from-rds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/create-data-source-from-rds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDataSourceFromRDS", :http.request.configuration/output-deser-fn response-create-data-source-from-rds-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-data-source-from-rds :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/create-data-source-from-rds-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/create-data-source-from-rds-output))

(clojure.core/defn predict "Generates a prediction for the observation using the specified ML Model.\n Note Not all response parameters will be populated. Whether a response\nparameter is populated depends on the type of model requested." ([predict-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-predict-input predict-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/predict-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/predict-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Predict", :http.request.configuration/output-deser-fn response-predict-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "LimitExceededException" :portkey.aws.machinelearning/limit-exceeded-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception, "PredictorNotMountedException" :portkey.aws.machinelearning/predictor-not-mounted-exception}})))))
(clojure.spec.alpha/fdef predict :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/predict-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/predict-output))

(clojure.core/defn update-evaluation "Updates the EvaluationName of an Evaluation.\n You can use the GetEvaluation operation to view the contents of the updated\ndata element." ([update-evaluation-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-evaluation-input update-evaluation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/update-evaluation-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/update-evaluation-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEvaluation", :http.request.configuration/output-deser-fn response-update-evaluation-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-evaluation :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/update-evaluation-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/update-evaluation-output))

(clojure.core/defn delete-tags "Deletes the specified tags associated with an ML object. After this operation is\ncomplete, you can't recover deleted tags.\n If you specify a tag that doesn't exist, Amazon ML ignores it." ([delete-tags-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-tags-input delete-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/delete-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/delete-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn response-delete-tags-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InvalidTagException" :portkey.aws.machinelearning/invalid-tag-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/delete-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/delete-tags-output))

(clojure.core/defn create-evaluation "Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set of\nobservations associated to a DataSource. Like a DataSource for an MLModel, the\nDataSource for an Evaluation contains values for the Target Variable. The\nEvaluation compares the predicted result for each observation to the actual\noutcome and provides a summary so that you know how effective the MLModel\nfunctions on the test data. Evaluation generates a relevant performance metric,\nsuch as BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the\ncorresponding MLModelType: BINARY, REGRESSION or MULTICLASS.\n CreateEvaluation is an asynchronous operation. In response to CreateEvaluation,\nAmazon Machine Learning (Amazon ML) immediately returns and sets the evaluation\nstatus to PENDING. After the Evaluation is created and ready for use, Amazon ML\nsets the status to COMPLETED.\n You can use the GetEvaluation operation to check progress of the evaluation\nduring the creation operation." ([create-evaluation-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-evaluation-input create-evaluation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/create-evaluation-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/create-evaluation-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEvaluation", :http.request.configuration/output-deser-fn response-create-evaluation-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-evaluation :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/create-evaluation-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/create-evaluation-output))

(clojure.core/defn delete-ml-model "Assigns the DELETED status to an MLModel, rendering it unusable.\n After using the DeleteMLModel operation, you can use the GetMLModel operation\nto verify that the status of the MLModel changed to DELETED.\n Caution: The result of the DeleteMLModel operation is irreversible." ([delete-ml-model-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-ml-model-input delete-ml-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/delete-ml-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/delete-ml-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMLModel", :http.request.configuration/output-deser-fn response-delete-ml-model-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-ml-model :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/delete-ml-model-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/delete-ml-model-output))

(clojure.core/defn get-batch-prediction "Returns a BatchPrediction that includes detailed metadata, status, and data file\ninformation for a Batch Prediction request." ([get-batch-prediction-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-batch-prediction-input get-batch-prediction-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/get-batch-prediction-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/get-batch-prediction-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBatchPrediction", :http.request.configuration/output-deser-fn response-get-batch-prediction-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-batch-prediction :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/get-batch-prediction-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/get-batch-prediction-output))

(clojure.core/defn create-data-source-from-redshift "Creates a DataSource from a database hosted on an Amazon Redshift cluster. A\nDataSource references data that can be used to perform either CreateMLModel,\nCreateEvaluation, or CreateBatchPrediction operations.\n CreateDataSourceFromRedshift is an asynchronous operation. In response to\nCreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately\nreturns and sets the DataSource status to PENDING. After the DataSource is\ncreated and ready for use, Amazon ML sets the Status parameter to COMPLETED.\nDataSource in COMPLETED or PENDING states can be used to perform only\nCreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.\n If Amazon ML can't accept the input source, it sets the Status parameter to\nFAILED and includes an error message in the Message attribute of the\nGetDataSource operation response.\n The observations should be contained in the database hosted on an Amazon\nRedshift cluster and should be specified by a SelectSqlQuery query. Amazon ML\nexecutes an Unload command in Amazon Redshift to transfer the result set of the\nSelectSqlQuery query to S3StagingLocation.\n After the DataSource has been created, it's ready for use in evaluations and\nbatch predictions. If you plan to use the DataSource to train an MLModel, the\nDataSource also requires a recipe. A recipe describes how each input variable\nwill be used in training an MLModel. Will the variable be included or excluded\nfrom training? Will the variable be manipulated; for example, will it be\ncombined with another variable or will it be split apart into word combinations?\nThe recipe provides answers to these questions.\n You can't change an existing datasource, but you can copy and modify the\nsettings from an existing Amazon Redshift datasource to create a new datasource.\nTo do so, call GetDataSource for an existing datasource and copy the values to a\nCreateDataSource call. Change the settings that you want to change and make sure\nthat all required fields have the appropriate values." ([create-data-source-from-redshift-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-data-source-from-redshift-input create-data-source-from-redshift-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/create-data-source-from-redshift-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/create-data-source-from-redshift-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDataSourceFromRedshift", :http.request.configuration/output-deser-fn response-create-data-source-from-redshift-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-data-source-from-redshift :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/create-data-source-from-redshift-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/create-data-source-from-redshift-output))

(clojure.core/defn describe-data-sources "Returns a list of DataSource that match the search criteria in the request." ([] (describe-data-sources {})) ([describe-data-sources-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-data-sources-input describe-data-sources-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/describe-data-sources-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/describe-data-sources-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDataSources", :http.request.configuration/output-deser-fn response-describe-data-sources-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-data-sources :args (clojure.spec.alpha/? :portkey.aws.machinelearning/describe-data-sources-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/describe-data-sources-output))

(clojure.core/defn update-data-source "Updates the DataSourceName of a DataSource.\n You can use the GetDataSource operation to view the contents of the updated\ndata element." ([update-data-source-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-data-source-input update-data-source-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/update-data-source-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/update-data-source-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDataSource", :http.request.configuration/output-deser-fn response-update-data-source-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-data-source :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/update-data-source-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/update-data-source-output))

(clojure.core/defn delete-batch-prediction "Assigns the DELETED status to a BatchPrediction, rendering it unusable.\n After using the DeleteBatchPrediction operation, you can use the\nGetBatchPrediction operation to verify that the status of the BatchPrediction\nchanged to DELETED.\n Caution: The result of the DeleteBatchPrediction operation is irreversible." ([delete-batch-prediction-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-batch-prediction-input delete-batch-prediction-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/delete-batch-prediction-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/delete-batch-prediction-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBatchPrediction", :http.request.configuration/output-deser-fn response-delete-batch-prediction-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-batch-prediction :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/delete-batch-prediction-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/delete-batch-prediction-output))

(clojure.core/defn create-data-source-from-s-3 "Creates a DataSource object. A DataSource references data that can be used to\nperform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.\n CreateDataSourceFromS3 is an asynchronous operation. In response to\nCreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns\nand sets the DataSource status to PENDING. After the DataSource has been created\nand is ready for use, Amazon ML sets the Status parameter to COMPLETED.\nDataSource in the COMPLETED or PENDING state can be used to perform only\nCreateMLModel, CreateEvaluation or CreateBatchPrediction operations.\n If Amazon ML can't accept the input source, it sets the Status parameter to\nFAILED and includes an error message in the Message attribute of the\nGetDataSource operation response.\n The observation data used in a DataSource should be ready to use; that is, it\nshould have a consistent structure, and missing data values should be kept to a\nminimum. The observation data must reside in one or more .csv files in an Amazon\nSimple Storage Service (Amazon S3) location, along with a schema that describes\nthe data items by name and type. The same schema must be used for all of the\ndata files referenced by the DataSource.\n After the DataSource has been created, it's ready to use in evaluations and\nbatch predictions. If you plan to use the DataSource to train an MLModel, the\nDataSource also needs a recipe. A recipe describes how each input variable will\nbe used in training an MLModel. Will the variable be included or excluded from\ntraining? Will the variable be manipulated; for example, will it be combined\nwith another variable or will it be split apart into word combinations? The\nrecipe provides answers to these questions." ([create-data-source-from-s-3-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-data-source-from-s-3-input create-data-source-from-s-3-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/create-data-source-from-s-3-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/create-data-source-from-s-3-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDataSourceFromS3", :http.request.configuration/output-deser-fn response-create-data-source-from-s-3-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-data-source-from-s-3 :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/create-data-source-from-s-3-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/create-data-source-from-s-3-output))

(clojure.core/defn describe-ml-models "Returns a list of MLModel that match the search criteria in the request." ([] (describe-ml-models {})) ([describe-ml-models-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-ml-models-input describe-ml-models-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/describe-ml-models-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/describe-ml-models-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMLModels", :http.request.configuration/output-deser-fn response-describe-ml-models-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-ml-models :args (clojure.spec.alpha/? :portkey.aws.machinelearning/describe-ml-models-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/describe-ml-models-output))

(clojure.core/defn describe-tags "Describes one or more of the tags for your Amazon ML object." ([describe-tags-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-tags-input describe-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/describe-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/describe-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/describe-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/describe-tags-output))

(clojure.core/defn create-batch-prediction "Generates predictions for a group of observations. The observations to process\nexist in one or more data files referenced by a DataSource. This operation\ncreates a new BatchPrediction, and uses an MLModel and the data files referenced\nby the DataSource as information sources.\n CreateBatchPrediction is an asynchronous operation. In response to\nCreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns\nand sets the BatchPrediction status to PENDING. After the BatchPrediction\ncompletes, Amazon ML sets the status to COMPLETED.\n You can poll for status updates by using the GetBatchPrediction operation and\nchecking the Status parameter of the result. After the COMPLETED status appears,\nthe results are available in the location specified by the OutputUri parameter." ([create-batch-prediction-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-batch-prediction-input create-batch-prediction-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/create-batch-prediction-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/create-batch-prediction-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBatchPrediction", :http.request.configuration/output-deser-fn response-create-batch-prediction-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.machinelearning/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-batch-prediction :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/create-batch-prediction-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/create-batch-prediction-output))

(clojure.core/defn get-evaluation "Returns an Evaluation that includes metadata as well as the current status of\nthe Evaluation." ([get-evaluation-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-evaluation-input get-evaluation-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/get-evaluation-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/get-evaluation-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEvaluation", :http.request.configuration/output-deser-fn response-get-evaluation-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-evaluation :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/get-evaluation-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/get-evaluation-output))

(clojure.core/defn describe-batch-predictions "Returns a list of BatchPrediction operations that match the search criteria in\nthe request." ([] (describe-batch-predictions {})) ([describe-batch-predictions-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-batch-predictions-input describe-batch-predictions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/describe-batch-predictions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/describe-batch-predictions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBatchPredictions", :http.request.configuration/output-deser-fn response-describe-batch-predictions-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-batch-predictions :args (clojure.spec.alpha/? :portkey.aws.machinelearning/describe-batch-predictions-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/describe-batch-predictions-output))

(clojure.core/defn update-ml-model "Updates the MLModelName and the ScoreThreshold of an MLModel.\n You can use the GetMLModel operation to view the contents of the updated data\nelement." ([update-ml-model-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-ml-model-input update-ml-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/update-ml-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/update-ml-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateMLModel", :http.request.configuration/output-deser-fn response-update-ml-model-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-ml-model :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/update-ml-model-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/update-ml-model-output))

(clojure.core/defn get-data-source "Returns a DataSource that includes metadata and data file information, as well\nas the current status of the DataSource.\n GetDataSource provides results in normal or verbose format. The verbose format\nadds the schema description and the list of files pointed to by the DataSource\nto the normal format." ([get-data-source-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-data-source-input get-data-source-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/get-data-source-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/get-data-source-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDataSource", :http.request.configuration/output-deser-fn response-get-data-source-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-data-source :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/get-data-source-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/get-data-source-output))

(clojure.core/defn add-tags "Adds one or more tags to an object, up to a limit of 10. Each tag consists of a\nkey and an optional value. If you add a tag using a key that is already\nassociated with the ML object, AddTags updates the tag's value." ([add-tags-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/add-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn response-add-tags-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InvalidTagException" :portkey.aws.machinelearning/invalid-tag-exception, "TagLimitExceededException" :portkey.aws.machinelearning/tag-limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/add-tags-output))

(clojure.core/defn delete-realtime-endpoint "Deletes a real time endpoint of an MLModel." ([delete-realtime-endpoint-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-realtime-endpoint-input delete-realtime-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/delete-realtime-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/delete-realtime-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRealtimeEndpoint", :http.request.configuration/output-deser-fn response-delete-realtime-endpoint-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-realtime-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/delete-realtime-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/delete-realtime-endpoint-output))

(clojure.core/defn describe-evaluations "Returns a list of DescribeEvaluations that match the search criteria in the\nrequest." ([] (describe-evaluations {})) ([describe-evaluations-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-evaluations-input describe-evaluations-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/describe-evaluations-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/describe-evaluations-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEvaluations", :http.request.configuration/output-deser-fn response-describe-evaluations-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-evaluations :args (clojure.spec.alpha/? :portkey.aws.machinelearning/describe-evaluations-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/describe-evaluations-output))

(clojure.core/defn delete-data-source "Assigns the DELETED status to a DataSource, rendering it unusable.\n After using the DeleteDataSource operation, you can use the GetDataSource\noperation to verify that the status of the DataSource changed to DELETED.\n Caution: The results of the DeleteDataSource operation are irreversible." ([delete-data-source-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-data-source-input delete-data-source-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/delete-data-source-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/delete-data-source-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDataSource", :http.request.configuration/output-deser-fn response-delete-data-source-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-data-source :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/delete-data-source-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/delete-data-source-output))

(clojure.core/defn get-ml-model "Returns an MLModel that includes detailed metadata, data source information, and\nthe current status of the MLModel.\n GetMLModel provides results in normal or verbose format." ([get-ml-model-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-ml-model-input get-ml-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/get-ml-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/get-ml-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMLModel", :http.request.configuration/output-deser-fn response-get-ml-model-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-ml-model :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/get-ml-model-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/get-ml-model-output))

(clojure.core/defn create-realtime-endpoint "Creates a real-time endpoint for the MLModel. The endpoint contains the URI of\nthe MLModel; that is, the location to send real-time prediction requests for the\nspecified MLModel." ([create-realtime-endpoint-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-realtime-endpoint-input create-realtime-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.machinelearning/endpoints, :http.request.configuration/target-prefix "AmazonML_20141212", :http.request.spec/output-spec :portkey.aws.machinelearning/create-realtime-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-12-12", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.machinelearning/create-realtime-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRealtimeEndpoint", :http.request.configuration/output-deser-fn response-create-realtime-endpoint-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.machinelearning/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.machinelearning/resource-not-found-exception, "InternalServerException" :portkey.aws.machinelearning/internal-server-exception}})))))
(clojure.spec.alpha/fdef create-realtime-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.machinelearning/create-realtime-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.machinelearning/create-realtime-endpoint-output))
