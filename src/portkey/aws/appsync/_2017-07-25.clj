(ns portkey.aws.appsync.-2017-07-25 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "appsync", :region "ap-northeast-1"},
    :ssl-common-name "appsync.ap-northeast-1.amazonaws.com",
    :endpoint "https://appsync.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "appsync", :region "eu-west-1"},
    :ssl-common-name "appsync.eu-west-1.amazonaws.com",
    :endpoint "https://appsync.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "appsync", :region "us-east-2"},
    :ssl-common-name "appsync.us-east-2.amazonaws.com",
    :endpoint "https://appsync.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "appsync", :region "ap-southeast-2"},
    :ssl-common-name "appsync.ap-southeast-2.amazonaws.com",
    :endpoint "https://appsync.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "appsync", :region "ap-southeast-1"},
    :ssl-common-name "appsync.ap-southeast-1.amazonaws.com",
    :endpoint "https://appsync.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "appsync", :region "ap-northeast-2"},
    :ssl-common-name "appsync.ap-northeast-2.amazonaws.com",
    :endpoint "https://appsync.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "appsync", :region "eu-central-1"},
    :ssl-common-name "appsync.eu-central-1.amazonaws.com",
    :endpoint "https://appsync.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "appsync", :region "us-west-2"},
    :ssl-common-name "appsync.us-west-2.amazonaws.com",
    :endpoint "https://appsync.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "appsync", :region "us-east-1"},
    :ssl-common-name "appsync.us-east-1.amazonaws.com",
    :endpoint "https://appsync.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "appsync", :region "ap-south-1"},
    :ssl-common-name "appsync.ap-south-1.amazonaws.com",
    :endpoint "https://appsync.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-relational-database-data-source-config)

(clojure.core/declare ser-resolver-kind)

(clojure.core/declare ser-field-log-level)

(clojure.core/declare ser-functions-ids)

(clojure.core/declare ser-http-data-source-config)

(clojure.core/declare ser-data-source-type)

(clojure.core/declare ser-log-config)

(clojure.core/declare ser-rds-http-endpoint-config)

(clojure.core/declare ser-lambda-data-source-config)

(clojure.core/declare ser-default-action)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-relational-database-source-type)

(clojure.core/declare ser-user-pool-config)

(clojure.core/declare ser-aws-iam-config)

(clojure.core/declare ser-type-definition-format)

(clojure.core/declare ser-pipeline-config)

(clojure.core/declare ser-output-type)

(clojure.core/declare ser-authorization-config)

(clojure.core/declare ser-authorization-type)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-string)

(clojure.core/declare ser-authentication-type)

(clojure.core/declare ser-mapping-template)

(clojure.core/declare ser-long)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-open-id-connect-config)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-dynamodb-data-source-config)

(clojure.core/declare ser-elasticsearch-data-source-config)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-relational-database-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RelationalDatabaseDataSourceConfig", :type "structure"} (clojure.core/contains? input :relational-database-source-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relational-database-source-type (input :relational-database-source-type)) #:http.request.field{:name "relationalDatabaseSourceType", :shape "RelationalDatabaseSourceType"})) (clojure.core/contains? input :rds-http-endpoint-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rds-http-endpoint-config (input :rds-http-endpoint-config)) #:http.request.field{:name "rdsHttpEndpointConfig", :shape "RdsHttpEndpointConfig"}))))

(clojure.core/defn- ser-resolver-kind [input] #:http.request.field{:value (clojure.core/get {"UNIT" "UNIT", :unit "UNIT", "PIPELINE" "PIPELINE", :pipeline "PIPELINE"} input), :shape "ResolverKind"})

(clojure.core/defn- ser-field-log-level [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "ERROR" "ERROR", :error "ERROR", "ALL" "ALL", :all "ALL"} input), :shape "FieldLogLevel"})

(clojure.core/defn- ser-functions-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "FunctionsIds", :type "list"})

(clojure.core/defn- ser-http-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HttpDataSourceConfig", :type "structure"} (clojure.core/contains? input :endpoint) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :endpoint)) #:http.request.field{:name "endpoint", :shape "String"})) (clojure.core/contains? input :authorization-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authorization-config (input :authorization-config)) #:http.request.field{:name "authorizationConfig", :shape "AuthorizationConfig"}))))

(clojure.core/defn- ser-data-source-type [input] #:http.request.field{:value (clojure.core/get {:amazon-dynamodb "AMAZON_DYNAMODB", :aws-lambda "AWS_LAMBDA", :relational-database "RELATIONAL_DATABASE", "AWS_LAMBDA" "AWS_LAMBDA", "RELATIONAL_DATABASE" "RELATIONAL_DATABASE", "NONE" "NONE", :amazon-elasticsearch "AMAZON_ELASTICSEARCH", "AMAZON_DYNAMODB" "AMAZON_DYNAMODB", "AMAZON_ELASTICSEARCH" "AMAZON_ELASTICSEARCH", :http "HTTP", "HTTP" "HTTP", :none "NONE"} input), :shape "DataSourceType"})

(clojure.core/defn- ser-log-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-log-level (:field-log-level input)) #:http.request.field{:name "fieldLogLevel", :shape "FieldLogLevel"}) (clojure.core/into (ser-string (:cloud-watch-logs-role-arn input)) #:http.request.field{:name "cloudWatchLogsRoleArn", :shape "String"})], :shape "LogConfig", :type "structure"}))

(clojure.core/defn- ser-rds-http-endpoint-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RdsHttpEndpointConfig", :type "structure"} (clojure.core/contains? input :aws-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :aws-region)) #:http.request.field{:name "awsRegion", :shape "String"})) (clojure.core/contains? input :db-cluster-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :db-cluster-identifier)) #:http.request.field{:name "dbClusterIdentifier", :shape "String"})) (clojure.core/contains? input :database-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :database-name)) #:http.request.field{:name "databaseName", :shape "String"})) (clojure.core/contains? input :schema) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :schema)) #:http.request.field{:name "schema", :shape "String"})) (clojure.core/contains? input :aws-secret-store-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :aws-secret-store-arn)) #:http.request.field{:name "awsSecretStoreArn", :shape "String"}))))

(clojure.core/defn- ser-lambda-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:lambda-function-arn input)) #:http.request.field{:name "lambdaFunctionArn", :shape "String"})], :shape "LambdaDataSourceConfig", :type "structure"}))

(clojure.core/defn- ser-default-action [input] #:http.request.field{:value (clojure.core/get {"ALLOW" "ALLOW", :allow "ALLOW", "DENY" "DENY", :deny "DENY"} input), :shape "DefaultAction"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-relational-database-source-type [input] #:http.request.field{:value (clojure.core/get {"RDS_HTTP_ENDPOINT" "RDS_HTTP_ENDPOINT", :rds-http-endpoint "RDS_HTTP_ENDPOINT"} input), :shape "RelationalDatabaseSourceType"})

(clojure.core/defn- ser-user-pool-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:user-pool-id input)) #:http.request.field{:name "userPoolId", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"}) (clojure.core/into (ser-default-action (:default-action input)) #:http.request.field{:name "defaultAction", :shape "DefaultAction"})], :shape "UserPoolConfig", :type "structure"} (clojure.core/contains? input :app-id-client-regex) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :app-id-client-regex)) #:http.request.field{:name "appIdClientRegex", :shape "String"}))))

(clojure.core/defn- ser-aws-iam-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AwsIamConfig", :type "structure"} (clojure.core/contains? input :signing-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signing-region)) #:http.request.field{:name "signingRegion", :shape "String"})) (clojure.core/contains? input :signing-service-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signing-service-name)) #:http.request.field{:name "signingServiceName", :shape "String"}))))

(clojure.core/defn- ser-type-definition-format [input] #:http.request.field{:value (clojure.core/get {"SDL" "SDL", :sdl "SDL", "JSON" "JSON", :json "JSON"} input), :shape "TypeDefinitionFormat"})

(clojure.core/defn- ser-pipeline-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PipelineConfig", :type "structure"} (clojure.core/contains? input :functions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-functions-ids (input :functions)) #:http.request.field{:name "functions", :shape "FunctionsIds"}))))

(clojure.core/defn- ser-output-type [input] #:http.request.field{:value (clojure.core/get {"SDL" "SDL", :sdl "SDL", "JSON" "JSON", :json "JSON"} input), :shape "OutputType"})

(clojure.core/defn- ser-authorization-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-authorization-type (:authorization-type input)) #:http.request.field{:name "authorizationType", :shape "AuthorizationType"})], :shape "AuthorizationConfig", :type "structure"} (clojure.core/contains? input :aws-iam-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-iam-config (input :aws-iam-config)) #:http.request.field{:name "awsIamConfig", :shape "AwsIamConfig"}))))

(clojure.core/defn- ser-authorization-type [input] #:http.request.field{:value (clojure.core/get {"AWS_IAM" "AWS_IAM", :aws-iam "AWS_IAM"} input), :shape "AuthorizationType"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-authentication-type [input] #:http.request.field{:value (clojure.core/get {"API_KEY" "API_KEY", :api-key "API_KEY", "AWS_IAM" "AWS_IAM", :aws-iam "AWS_IAM", "AMAZON_COGNITO_USER_POOLS" "AMAZON_COGNITO_USER_POOLS", :amazon-cognito-user-pools "AMAZON_COGNITO_USER_POOLS", "OPENID_CONNECT" "OPENID_CONNECT", :openid-connect "OPENID_CONNECT"} input), :shape "AuthenticationType"})

(clojure.core/defn- ser-mapping-template [input] #:http.request.field{:value input, :shape "MappingTemplate"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-open-id-connect-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:issuer input)) #:http.request.field{:name "issuer", :shape "String"})], :shape "OpenIDConnectConfig", :type "structure"} (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-id)) #:http.request.field{:name "clientId", :shape "String"})) (clojure.core/contains? input :iat-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :iat-ttl)) #:http.request.field{:name "iatTTL", :shape "Long"})) (clojure.core/contains? input :auth-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :auth-ttl)) #:http.request.field{:name "authTTL", :shape "Long"}))))

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-dynamodb-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:table-name input)) #:http.request.field{:name "tableName", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"})], :shape "DynamodbDataSourceConfig", :type "structure"} (clojure.core/contains? input :use-caller-credentials) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-caller-credentials)) #:http.request.field{:name "useCallerCredentials", :shape "Boolean"}))))

(clojure.core/defn- ser-elasticsearch-data-source-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:endpoint input)) #:http.request.field{:name "endpoint", :shape "String"}) (clojure.core/into (ser-string (:aws-region input)) #:http.request.field{:name "awsRegion", :shape "String"})], :shape "ElasticsearchDataSourceConfig", :type "structure"}))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"}) (clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"}) (clojure.core/into (ser-string (input :function-version)) #:http.request.field{:name "functionVersion", :shape "String"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"}))))

(clojure.core/defn- req-update-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :body [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat"})]} (clojure.core/contains? input :definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :definition)) #:http.request.field{:name "definition", :shape "String"}))))

(clojure.core/defn- req-update-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})], :body [(clojure.core/into (ser-data-source-type (input :type)) #:http.request.field{:name "type", :shape "DataSourceType"})]} (clojure.core/contains? input :elasticsearch-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-data-source-config (input :elasticsearch-config)) #:http.request.field{:name "elasticsearchConfig", :shape "ElasticsearchDataSourceConfig"})) (clojure.core/contains? input :lambda-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-data-source-config (input :lambda-config)) #:http.request.field{:name "lambdaConfig", :shape "LambdaDataSourceConfig"})) (clojure.core/contains? input :dynamodb-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamodb-data-source-config (input :dynamodb-config)) #:http.request.field{:name "dynamodbConfig", :shape "DynamodbDataSourceConfig"})) (clojure.core/contains? input :relational-database-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relational-database-data-source-config (input :relational-database-config)) #:http.request.field{:name "relationalDatabaseConfig", :shape "RelationalDatabaseDataSourceConfig"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "String"})) (clojure.core/contains? input :http-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-data-source-config (input :http-config)) #:http.request.field{:name "httpConfig", :shape "HttpDataSourceConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-get-schema-creation-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-update-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})]} (clojure.core/contains? input :log-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-config (input :log-config)) #:http.request.field{:name "logConfig", :shape "LogConfig"})) (clojure.core/contains? input :authentication-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "authenticationType", :shape "AuthenticationType"})) (clojure.core/contains? input :user-pool-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-config (input :user-pool-config)) #:http.request.field{:name "userPoolConfig", :shape "UserPoolConfig"})) (clojure.core/contains? input :open-id-connect-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-open-id-connect-config (input :open-id-connect-config)) #:http.request.field{:name "openIDConnectConfig", :shape "OpenIDConnectConfig"}))))

(clojure.core/defn- req-create-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName"}) (clojure.core/into (ser-data-source-type (input :type)) #:http.request.field{:name "type", :shape "DataSourceType"})]} (clojure.core/contains? input :elasticsearch-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-data-source-config (input :elasticsearch-config)) #:http.request.field{:name "elasticsearchConfig", :shape "ElasticsearchDataSourceConfig"})) (clojure.core/contains? input :lambda-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-data-source-config (input :lambda-config)) #:http.request.field{:name "lambdaConfig", :shape "LambdaDataSourceConfig"})) (clojure.core/contains? input :dynamodb-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamodb-data-source-config (input :dynamodb-config)) #:http.request.field{:name "dynamodbConfig", :shape "DynamodbDataSourceConfig"})) (clojure.core/contains? input :relational-database-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relational-database-data-source-config (input :relational-database-config)) #:http.request.field{:name "relationalDatabaseConfig", :shape "RelationalDatabaseDataSourceConfig"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "String"})) (clojure.core/contains? input :http-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-data-source-config (input :http-config)) #:http.request.field{:name "httpConfig", :shape "HttpDataSourceConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-get-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})]}))

(clojure.core/defn- req-delete-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "id", :shape "String", :location "uri", :location-name "id"})]}))

(clojure.core/defn- req-create-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"}) (clojure.core/into (ser-authentication-type (input :authentication-type)) #:http.request.field{:name "authenticationType", :shape "AuthenticationType"})]} (clojure.core/contains? input :log-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-config (input :log-config)) #:http.request.field{:name "logConfig", :shape "LogConfig"})) (clojure.core/contains? input :user-pool-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-pool-config (input :user-pool-config)) #:http.request.field{:name "userPoolConfig", :shape "UserPoolConfig"})) (clojure.core/contains? input :open-id-connect-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-open-id-connect-config (input :open-id-connect-config)) #:http.request.field{:name "openIDConnectConfig", :shape "OpenIDConnectConfig"}))))

(clojure.core/defn- req-list-resolvers-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :type-name)) #:http.request.field{:name "typeName", :shape "String", :location "uri", :location-name "typeName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-list-api-keys-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-graphql-api-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]}))

(clojure.core/defn- req-delete-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :function-id)) #:http.request.field{:name "functionId", :shape "ResourceName", :location "uri", :location-name "functionId"})]}))

(clojure.core/defn- req-list-graphql-apis-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :function-id)) #:http.request.field{:name "functionId", :shape "ResourceName", :location "uri", :location-name "functionId"})], :body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"}) (clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"}) (clojure.core/into (ser-string (input :function-version)) #:http.request.field{:name "functionVersion", :shape "String"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"}))))

(clojure.core/defn- req-delete-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})]}))

(clojure.core/defn- req-create-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-string (input :definition)) #:http.request.field{:name "definition", :shape "String"}) (clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat"})]}))

(clojure.core/defn- req-list-resolvers-by-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :function-id)) #:http.request.field{:name "functionId", :shape "String", :location "uri", :location-name "functionId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-create-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :expires)) #:http.request.field{:name "expires", :shape "Long"}))))

(clojure.core/defn- req-delete-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})]}))

(clojure.core/defn- req-get-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :function-id)) #:http.request.field{:name "functionId", :shape "ResourceName", :location "uri", :location-name "functionId"})]}))

(clojure.core/defn- req-get-introspection-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :querystring [(clojure.core/into (ser-output-type (input :format)) #:http.request.field{:name "format", :shape "OutputType", :location "querystring", :location-name "format"})]}))

(clojure.core/defn- req-list-data-sources-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"}) (clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName", :location "uri", :location-name "fieldName"})], :body [(clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"})]} (clojure.core/contains? input :data-source-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"})) (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"})) (clojure.core/contains? input :kind) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resolver-kind (input :kind)) #:http.request.field{:name "kind", :shape "ResolverKind"})) (clojure.core/contains? input :pipeline-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-config (input :pipeline-config)) #:http.request.field{:name "pipelineConfig", :shape "PipelineConfig"}))))

(clojure.core/defn- req-create-resolver-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :body [(clojure.core/into (ser-resource-name (input :field-name)) #:http.request.field{:name "fieldName", :shape "ResourceName"}) (clojure.core/into (ser-mapping-template (input :request-mapping-template)) #:http.request.field{:name "requestMappingTemplate", :shape "MappingTemplate"})]} (clojure.core/contains? input :data-source-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :data-source-name)) #:http.request.field{:name "dataSourceName", :shape "ResourceName"})) (clojure.core/contains? input :response-mapping-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mapping-template (input :response-mapping-template)) #:http.request.field{:name "responseMappingTemplate", :shape "MappingTemplate"})) (clojure.core/contains? input :kind) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resolver-kind (input :kind)) #:http.request.field{:name "kind", :shape "ResolverKind"})) (clojure.core/contains? input :pipeline-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-config (input :pipeline-config)) #:http.request.field{:name "pipelineConfig", :shape "PipelineConfig"}))))

(clojure.core/defn- req-list-functions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-start-schema-creation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :body [(clojure.core/into (ser-blob (input :definition)) #:http.request.field{:name "definition", :shape "Blob"})]}))

(clojure.core/defn- req-update-api-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "id", :shape "String", :location "uri", :location-name "id"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :expires)) #:http.request.field{:name "expires", :shape "Long"}))))

(clojure.core/defn- req-delete-data-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "name", :shape "ResourceName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-list-types-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"})], :querystring [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat", :location "querystring", :location-name "format"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :api-id)) #:http.request.field{:name "apiId", :shape "String", :location "uri", :location-name "apiId"}) (clojure.core/into (ser-resource-name (input :type-name)) #:http.request.field{:name "typeName", :shape "ResourceName", :location "uri", :location-name "typeName"})], :querystring [(clojure.core/into (ser-type-definition-format (input :format)) #:http.request.field{:name "format", :shape "TypeDefinitionFormat", :location "querystring", :location-name "format"})]}))

(clojure.core/declare deser-relational-database-data-source-config)

(clojure.core/declare deser-functions)

(clojure.core/declare deser-resolver-kind)

(clojure.core/declare deser-field-log-level)

(clojure.core/declare deser-functions-ids)

(clojure.core/declare deser-http-data-source-config)

(clojure.core/declare deser-schema-status)

(clojure.core/declare deser-type)

(clojure.core/declare deser-data-source-type)

(clojure.core/declare deser-log-config)

(clojure.core/declare deser-rds-http-endpoint-config)

(clojure.core/declare deser-lambda-data-source-config)

(clojure.core/declare deser-graphql-apis)

(clojure.core/declare deser-default-action)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-relational-database-source-type)

(clojure.core/declare deser-user-pool-config)

(clojure.core/declare deser-aws-iam-config)

(clojure.core/declare deser-type-definition-format)

(clojure.core/declare deser-type-list)

(clojure.core/declare deser-graphql-api)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-pipeline-config)

(clojure.core/declare deser-data-sources)

(clojure.core/declare deser-resolvers)

(clojure.core/declare deser-authorization-config)

(clojure.core/declare deser-authorization-type)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-string)

(clojure.core/declare deser-authentication-type)

(clojure.core/declare deser-mapping-template)

(clojure.core/declare deser-data-source)

(clojure.core/declare deser-map-of-string-to-string)

(clojure.core/declare deser-function-configuration)

(clojure.core/declare deser-api-keys)

(clojure.core/declare deser-long)

(clojure.core/declare deser-open-id-connect-config)

(clojure.core/declare deser-api-key)

(clojure.core/declare deser-blob)

(clojure.core/declare deser-resolver)

(clojure.core/declare deser-dynamodb-data-source-config)

(clojure.core/declare deser-elasticsearch-data-source-config)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-relational-database-data-source-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "relationalDatabaseSourceType") (clojure.core/assoc :relational-database-source-type (deser-relational-database-source-type (input "relationalDatabaseSourceType"))) (clojure.core/contains? input "rdsHttpEndpointConfig") (clojure.core/assoc :rds-http-endpoint-config (deser-rds-http-endpoint-config (input "rdsHttpEndpointConfig")))))

(clojure.core/defn- deser-functions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-function-configuration coll))) input))

(clojure.core/defn- deser-resolver-kind [input] (clojure.core/get {"UNIT" :unit, "PIPELINE" :pipeline} input))

(clojure.core/defn- deser-field-log-level [input] (clojure.core/get {"NONE" :none, "ERROR" :error, "ALL" :all} input))

(clojure.core/defn- deser-functions-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-http-data-source-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "endpoint") (clojure.core/assoc :endpoint (deser-string (input "endpoint"))) (clojure.core/contains? input "authorizationConfig") (clojure.core/assoc :authorization-config (deser-authorization-config (input "authorizationConfig")))))

(clojure.core/defn- deser-schema-status [input] (clojure.core/get {"PROCESSING" :processing, "ACTIVE" :active, "DELETING" :deleting} input))

(clojure.core/defn- deser-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "definition") (clojure.core/assoc :definition (deser-string (input "definition"))) (clojure.core/contains? input "format") (clojure.core/assoc :format (deser-type-definition-format (input "format")))))

(clojure.core/defn- deser-data-source-type [input] (clojure.core/get {"AWS_LAMBDA" :aws-lambda, "AMAZON_DYNAMODB" :amazon-dynamodb, "AMAZON_ELASTICSEARCH" :amazon-elasticsearch, "NONE" :none, "HTTP" :http, "RELATIONAL_DATABASE" :relational-database} input))

(clojure.core/defn- deser-log-config [input] (clojure.core/cond-> {:field-log-level (deser-field-log-level (input "fieldLogLevel")), :cloud-watch-logs-role-arn (deser-string (input "cloudWatchLogsRoleArn"))}))

(clojure.core/defn- deser-rds-http-endpoint-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "awsRegion") (clojure.core/assoc :aws-region (deser-string (input "awsRegion"))) (clojure.core/contains? input "dbClusterIdentifier") (clojure.core/assoc :db-cluster-identifier (deser-string (input "dbClusterIdentifier"))) (clojure.core/contains? input "databaseName") (clojure.core/assoc :database-name (deser-string (input "databaseName"))) (clojure.core/contains? input "schema") (clojure.core/assoc :schema (deser-string (input "schema"))) (clojure.core/contains? input "awsSecretStoreArn") (clojure.core/assoc :aws-secret-store-arn (deser-string (input "awsSecretStoreArn")))))

(clojure.core/defn- deser-lambda-data-source-config [input] (clojure.core/cond-> {:lambda-function-arn (deser-string (input "lambdaFunctionArn"))}))

(clojure.core/defn- deser-graphql-apis [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-graphql-api coll))) input))

(clojure.core/defn- deser-default-action [input] (clojure.core/get {"ALLOW" :allow, "DENY" :deny} input))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-relational-database-source-type [input] (clojure.core/get {"RDS_HTTP_ENDPOINT" :rds-http-endpoint} input))

(clojure.core/defn- deser-user-pool-config [input] (clojure.core/cond-> {:user-pool-id (deser-string (input "userPoolId")), :aws-region (deser-string (input "awsRegion")), :default-action (deser-default-action (input "defaultAction"))} (clojure.core/contains? input "appIdClientRegex") (clojure.core/assoc :app-id-client-regex (deser-string (input "appIdClientRegex")))))

(clojure.core/defn- deser-aws-iam-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "signingRegion") (clojure.core/assoc :signing-region (deser-string (input "signingRegion"))) (clojure.core/contains? input "signingServiceName") (clojure.core/assoc :signing-service-name (deser-string (input "signingServiceName")))))

(clojure.core/defn- deser-type-definition-format [input] (clojure.core/get {"SDL" :sdl, "JSON" :json} input))

(clojure.core/defn- deser-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-type coll))) input))

(clojure.core/defn- deser-graphql-api [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "apiId") (clojure.core/assoc :api-id (deser-string (input "apiId"))) (clojure.core/contains? input "authenticationType") (clojure.core/assoc :authentication-type (deser-authentication-type (input "authenticationType"))) (clojure.core/contains? input "logConfig") (clojure.core/assoc :log-config (deser-log-config (input "logConfig"))) (clojure.core/contains? input "userPoolConfig") (clojure.core/assoc :user-pool-config (deser-user-pool-config (input "userPoolConfig"))) (clojure.core/contains? input "openIDConnectConfig") (clojure.core/assoc :open-id-connect-config (deser-open-id-connect-config (input "openIDConnectConfig"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "uris") (clojure.core/assoc :uris (deser-map-of-string-to-string (input "uris")))))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-pipeline-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "functions") (clojure.core/assoc :functions (deser-functions-ids (input "functions")))))

(clojure.core/defn- deser-data-sources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-data-source coll))) input))

(clojure.core/defn- deser-resolvers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resolver coll))) input))

(clojure.core/defn- deser-authorization-config [input] (clojure.core/cond-> {:authorization-type (deser-authorization-type (input "authorizationType"))} (clojure.core/contains? input "awsIamConfig") (clojure.core/assoc :aws-iam-config (deser-aws-iam-config (input "awsIamConfig")))))

(clojure.core/defn- deser-authorization-type [input] (clojure.core/get {"AWS_IAM" :aws-iam} input))

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-authentication-type [input] (clojure.core/get {"API_KEY" :api-key, "AWS_IAM" :aws-iam, "AMAZON_COGNITO_USER_POOLS" :amazon-cognito-user-pools, "OPENID_CONNECT" :openid-connect} input))

(clojure.core/defn- deser-mapping-template [input] input)

(clojure.core/defn- deser-data-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "elasticsearchConfig") (clojure.core/assoc :elasticsearch-config (deser-elasticsearch-data-source-config (input "elasticsearchConfig"))) (clojure.core/contains? input "lambdaConfig") (clojure.core/assoc :lambda-config (deser-lambda-data-source-config (input "lambdaConfig"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "dynamodbConfig") (clojure.core/assoc :dynamodb-config (deser-dynamodb-data-source-config (input "dynamodbConfig"))) (clojure.core/contains? input "relationalDatabaseConfig") (clojure.core/assoc :relational-database-config (deser-relational-database-data-source-config (input "relationalDatabaseConfig"))) (clojure.core/contains? input "serviceRoleArn") (clojure.core/assoc :service-role-arn (deser-string (input "serviceRoleArn"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-data-source-type (input "type"))) (clojure.core/contains? input "dataSourceArn") (clojure.core/assoc :data-source-arn (deser-string (input "dataSourceArn"))) (clojure.core/contains? input "httpConfig") (clojure.core/assoc :http-config (deser-http-data-source-config (input "httpConfig"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description")))))

(clojure.core/defn- deser-map-of-string-to-string [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-function-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "functionId") (clojure.core/assoc :function-id (deser-string (input "functionId"))) (clojure.core/contains? input "functionArn") (clojure.core/assoc :function-arn (deser-string (input "functionArn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "dataSourceName") (clojure.core/assoc :data-source-name (deser-resource-name (input "dataSourceName"))) (clojure.core/contains? input "requestMappingTemplate") (clojure.core/assoc :request-mapping-template (deser-mapping-template (input "requestMappingTemplate"))) (clojure.core/contains? input "responseMappingTemplate") (clojure.core/assoc :response-mapping-template (deser-mapping-template (input "responseMappingTemplate"))) (clojure.core/contains? input "functionVersion") (clojure.core/assoc :function-version (deser-string (input "functionVersion")))))

(clojure.core/defn- deser-api-keys [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-api-key coll))) input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-open-id-connect-config [input] (clojure.core/cond-> {:issuer (deser-string (input "issuer"))} (clojure.core/contains? input "clientId") (clojure.core/assoc :client-id (deser-string (input "clientId"))) (clojure.core/contains? input "iatTTL") (clojure.core/assoc :iat-ttl (deser-long (input "iatTTL"))) (clojure.core/contains? input "authTTL") (clojure.core/assoc :auth-ttl (deser-long (input "authTTL")))))

(clojure.core/defn- deser-api-key [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "expires") (clojure.core/assoc :expires (deser-long (input "expires")))))

(clojure.core/defn- deser-blob [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-resolver [input] (clojure.core/cond-> {} (clojure.core/contains? input "typeName") (clojure.core/assoc :type-name (deser-resource-name (input "typeName"))) (clojure.core/contains? input "fieldName") (clojure.core/assoc :field-name (deser-resource-name (input "fieldName"))) (clojure.core/contains? input "dataSourceName") (clojure.core/assoc :data-source-name (deser-resource-name (input "dataSourceName"))) (clojure.core/contains? input "resolverArn") (clojure.core/assoc :resolver-arn (deser-string (input "resolverArn"))) (clojure.core/contains? input "requestMappingTemplate") (clojure.core/assoc :request-mapping-template (deser-mapping-template (input "requestMappingTemplate"))) (clojure.core/contains? input "responseMappingTemplate") (clojure.core/assoc :response-mapping-template (deser-mapping-template (input "responseMappingTemplate"))) (clojure.core/contains? input "kind") (clojure.core/assoc :kind (deser-resolver-kind (input "kind"))) (clojure.core/contains? input "pipelineConfig") (clojure.core/assoc :pipeline-config (deser-pipeline-config (input "pipelineConfig")))))

(clojure.core/defn- deser-dynamodb-data-source-config [input] (clojure.core/cond-> {:table-name (deser-string (input "tableName")), :aws-region (deser-string (input "awsRegion"))} (clojure.core/contains? input "useCallerCredentials") (clojure.core/assoc :use-caller-credentials (deser-boolean (input "useCallerCredentials")))))

(clojure.core/defn- deser-elasticsearch-data-source-config [input] (clojure.core/cond-> {:endpoint (deser-string (input "endpoint")), :aws-region (deser-string (input "awsRegion"))}))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-list-graphql-apis-response ([input] (response-list-graphql-apis-response nil input)) ([resultWrapper62080 input] (clojure.core/let [rawinput62079 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62081 {"graphqlApis" (rawinput62079 "graphqlApis"), "nextToken" (rawinput62079 "nextToken")}] (clojure.core/cond-> {} (letvar62081 "graphqlApis") (clojure.core/assoc :graphql-apis (deser-graphql-apis (clojure.core/get-in letvar62081 ["graphqlApis"]))) (letvar62081 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar62081 ["nextToken"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper62083 input] (clojure.core/let [rawinput62082 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62084 {"message" (rawinput62082 "message")}] (clojure.core/cond-> {} (letvar62084 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar62084 ["message"])))))))

(clojure.core/defn- response-delete-type-response ([input] (response-delete-type-response nil input)) ([resultWrapper62086 input] (clojure.core/let [rawinput62085 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62087 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-graphql-api-response ([input] (response-delete-graphql-api-response nil input)) ([resultWrapper62089 input] (clojure.core/let [rawinput62088 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62090 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper62092 input] (clojure.core/let [rawinput62091 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62093 {"message" (rawinput62091 "message")}] (clojure.core/cond-> {} (letvar62093 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar62093 ["message"])))))))

(clojure.core/defn- response-update-function-response ([input] (response-update-function-response nil input)) ([resultWrapper62095 input] (clojure.core/let [rawinput62094 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62096 {"functionConfiguration" (rawinput62094 "functionConfiguration")}] (clojure.core/cond-> {} (letvar62096 "functionConfiguration") (clojure.core/assoc :function-configuration (deser-function-configuration (clojure.core/get-in letvar62096 ["functionConfiguration"])))))))

(clojure.core/defn- response-api-limit-exceeded-exception ([input] (response-api-limit-exceeded-exception nil input)) ([resultWrapper62098 input] (clojure.core/let [rawinput62097 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62099 {"message" (rawinput62097 "message")}] (clojure.core/cond-> {} (letvar62099 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar62099 ["message"])))))))

(clojure.core/defn- response-create-function-response ([input] (response-create-function-response nil input)) ([resultWrapper62101 input] (clojure.core/let [rawinput62100 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62102 {"functionConfiguration" (rawinput62100 "functionConfiguration")}] (clojure.core/cond-> {} (letvar62102 "functionConfiguration") (clojure.core/assoc :function-configuration (deser-function-configuration (clojure.core/get-in letvar62102 ["functionConfiguration"])))))))

(clojure.core/defn- response-list-resolvers-by-function-response ([input] (response-list-resolvers-by-function-response nil input)) ([resultWrapper62104 input] (clojure.core/let [rawinput62103 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62105 {"resolvers" (rawinput62103 "resolvers"), "nextToken" (rawinput62103 "nextToken")}] (clojure.core/cond-> {} (letvar62105 "resolvers") (clojure.core/assoc :resolvers (deser-resolvers (clojure.core/get-in letvar62105 ["resolvers"]))) (letvar62105 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar62105 ["nextToken"])))))))

(clojure.core/defn- response-update-resolver-response ([input] (response-update-resolver-response nil input)) ([resultWrapper62107 input] (clojure.core/let [rawinput62106 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62108 {"resolver" (rawinput62106 "resolver")}] (clojure.core/cond-> {} (letvar62108 "resolver") (clojure.core/assoc :resolver (deser-resolver (clojure.core/get-in letvar62108 ["resolver"])))))))

(clojure.core/defn- response-list-api-keys-response ([input] (response-list-api-keys-response nil input)) ([resultWrapper62110 input] (clojure.core/let [rawinput62109 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62111 {"apiKeys" (rawinput62109 "apiKeys"), "nextToken" (rawinput62109 "nextToken")}] (clojure.core/cond-> {} (letvar62111 "apiKeys") (clojure.core/assoc :api-keys (deser-api-keys (clojure.core/get-in letvar62111 ["apiKeys"]))) (letvar62111 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar62111 ["nextToken"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper62113 input] (clojure.core/let [rawinput62112 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62114 {"message" (rawinput62112 "message")}] (clojure.core/cond-> {} (letvar62114 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar62114 ["message"])))))))

(clojure.core/defn- response-list-types-response ([input] (response-list-types-response nil input)) ([resultWrapper62116 input] (clojure.core/let [rawinput62115 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62117 {"types" (rawinput62115 "types"), "nextToken" (rawinput62115 "nextToken")}] (clojure.core/cond-> {} (letvar62117 "types") (clojure.core/assoc :types (deser-type-list (clojure.core/get-in letvar62117 ["types"]))) (letvar62117 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar62117 ["nextToken"])))))))

(clojure.core/defn- response-list-functions-response ([input] (response-list-functions-response nil input)) ([resultWrapper62119 input] (clojure.core/let [rawinput62118 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62120 {"functions" (rawinput62118 "functions"), "nextToken" (rawinput62118 "nextToken")}] (clojure.core/cond-> {} (letvar62120 "functions") (clojure.core/assoc :functions (deser-functions (clojure.core/get-in letvar62120 ["functions"]))) (letvar62120 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar62120 ["nextToken"])))))))

(clojure.core/defn- response-delete-resolver-response ([input] (response-delete-resolver-response nil input)) ([resultWrapper62122 input] (clojure.core/let [rawinput62121 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62123 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-resolvers-response ([input] (response-list-resolvers-response nil input)) ([resultWrapper62125 input] (clojure.core/let [rawinput62124 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62126 {"resolvers" (rawinput62124 "resolvers"), "nextToken" (rawinput62124 "nextToken")}] (clojure.core/cond-> {} (letvar62126 "resolvers") (clojure.core/assoc :resolvers (deser-resolvers (clojure.core/get-in letvar62126 ["resolvers"]))) (letvar62126 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar62126 ["nextToken"])))))))

(clojure.core/defn- response-graph-ql-schema-exception ([input] (response-graph-ql-schema-exception nil input)) ([resultWrapper62128 input] (clojure.core/let [rawinput62127 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62129 {"message" (rawinput62127 "message")}] (clojure.core/cond-> {} (letvar62129 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar62129 ["message"])))))))

(clojure.core/defn- response-create-data-source-response ([input] (response-create-data-source-response nil input)) ([resultWrapper62131 input] (clojure.core/let [rawinput62130 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62132 {"dataSource" (rawinput62130 "dataSource")}] (clojure.core/cond-> {} (letvar62132 "dataSource") (clojure.core/assoc :data-source (deser-data-source (clojure.core/get-in letvar62132 ["dataSource"])))))))

(clojure.core/defn- response-get-function-response ([input] (response-get-function-response nil input)) ([resultWrapper62134 input] (clojure.core/let [rawinput62133 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62135 {"functionConfiguration" (rawinput62133 "functionConfiguration")}] (clojure.core/cond-> {} (letvar62135 "functionConfiguration") (clojure.core/assoc :function-configuration (deser-function-configuration (clojure.core/get-in letvar62135 ["functionConfiguration"])))))))

(clojure.core/defn- response-create-api-key-response ([input] (response-create-api-key-response nil input)) ([resultWrapper62137 input] (clojure.core/let [rawinput62136 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62138 {"apiKey" (rawinput62136 "apiKey")}] (clojure.core/cond-> {} (letvar62138 "apiKey") (clojure.core/assoc :api-key (deser-api-key (clojure.core/get-in letvar62138 ["apiKey"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper62140 input] (clojure.core/let [rawinput62139 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62141 {"message" (rawinput62139 "message")}] (clojure.core/cond-> {} (letvar62141 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar62141 ["message"])))))))

(clojure.core/defn- response-delete-api-key-response ([input] (response-delete-api-key-response nil input)) ([resultWrapper62143 input] (clojure.core/let [rawinput62142 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62144 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-function-response ([input] (response-delete-function-response nil input)) ([resultWrapper62146 input] (clojure.core/let [rawinput62145 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62147 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-data-source-response ([input] (response-update-data-source-response nil input)) ([resultWrapper62149 input] (clojure.core/let [rawinput62148 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62150 {"dataSource" (rawinput62148 "dataSource")}] (clojure.core/cond-> {} (letvar62150 "dataSource") (clojure.core/assoc :data-source (deser-data-source (clojure.core/get-in letvar62150 ["dataSource"])))))))

(clojure.core/defn- response-get-introspection-schema-response ([input] (response-get-introspection-schema-response nil input)) ([resultWrapper62152 input] (clojure.core/let [rawinput62151 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62153 {"schema" (rawinput62151 "schema")}] (clojure.core/cond-> {} (letvar62153 "schema") (clojure.core/assoc :schema (deser-blob (clojure.core/get-in letvar62153 ["schema"])))))))

(clojure.core/defn- response-get-graphql-api-response ([input] (response-get-graphql-api-response nil input)) ([resultWrapper62155 input] (clojure.core/let [rawinput62154 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62156 {"graphqlApi" (rawinput62154 "graphqlApi")}] (clojure.core/cond-> {} (letvar62156 "graphqlApi") (clojure.core/assoc :graphql-api (deser-graphql-api (clojure.core/get-in letvar62156 ["graphqlApi"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper62158 input] (clojure.core/let [rawinput62157 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62159 {"message" (rawinput62157 "message")}] (clojure.core/cond-> {} (letvar62159 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar62159 ["message"])))))))

(clojure.core/defn- response-update-api-key-response ([input] (response-update-api-key-response nil input)) ([resultWrapper62161 input] (clojure.core/let [rawinput62160 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62162 {"apiKey" (rawinput62160 "apiKey")}] (clojure.core/cond-> {} (letvar62162 "apiKey") (clojure.core/assoc :api-key (deser-api-key (clojure.core/get-in letvar62162 ["apiKey"])))))))

(clojure.core/defn- response-api-key-limit-exceeded-exception ([input] (response-api-key-limit-exceeded-exception nil input)) ([resultWrapper62164 input] (clojure.core/let [rawinput62163 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62165 {"message" (rawinput62163 "message")}] (clojure.core/cond-> {} (letvar62165 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar62165 ["message"])))))))

(clojure.core/defn- response-get-resolver-response ([input] (response-get-resolver-response nil input)) ([resultWrapper62167 input] (clojure.core/let [rawinput62166 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62168 {"resolver" (rawinput62166 "resolver")}] (clojure.core/cond-> {} (letvar62168 "resolver") (clojure.core/assoc :resolver (deser-resolver (clojure.core/get-in letvar62168 ["resolver"])))))))

(clojure.core/defn- response-start-schema-creation-response ([input] (response-start-schema-creation-response nil input)) ([resultWrapper62170 input] (clojure.core/let [rawinput62169 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62171 {"status" (rawinput62169 "status")}] (clojure.core/cond-> {} (letvar62171 "status") (clojure.core/assoc :status (deser-schema-status (clojure.core/get-in letvar62171 ["status"])))))))

(clojure.core/defn- response-create-graphql-api-response ([input] (response-create-graphql-api-response nil input)) ([resultWrapper62173 input] (clojure.core/let [rawinput62172 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62174 {"graphqlApi" (rawinput62172 "graphqlApi")}] (clojure.core/cond-> {} (letvar62174 "graphqlApi") (clojure.core/assoc :graphql-api (deser-graphql-api (clojure.core/get-in letvar62174 ["graphqlApi"])))))))

(clojure.core/defn- response-create-resolver-response ([input] (response-create-resolver-response nil input)) ([resultWrapper62176 input] (clojure.core/let [rawinput62175 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62177 {"resolver" (rawinput62175 "resolver")}] (clojure.core/cond-> {} (letvar62177 "resolver") (clojure.core/assoc :resolver (deser-resolver (clojure.core/get-in letvar62177 ["resolver"])))))))

(clojure.core/defn- response-create-type-response ([input] (response-create-type-response nil input)) ([resultWrapper62179 input] (clojure.core/let [rawinput62178 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62180 {"type" (rawinput62178 "type")}] (clojure.core/cond-> {} (letvar62180 "type") (clojure.core/assoc :type (deser-type (clojure.core/get-in letvar62180 ["type"])))))))

(clojure.core/defn- response-delete-data-source-response ([input] (response-delete-data-source-response nil input)) ([resultWrapper62182 input] (clojure.core/let [rawinput62181 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62183 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-api-key-validity-out-of-bounds-exception ([input] (response-api-key-validity-out-of-bounds-exception nil input)) ([resultWrapper62185 input] (clojure.core/let [rawinput62184 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62186 {"message" (rawinput62184 "message")}] (clojure.core/cond-> {} (letvar62186 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar62186 ["message"])))))))

(clojure.core/defn- response-list-data-sources-response ([input] (response-list-data-sources-response nil input)) ([resultWrapper62188 input] (clojure.core/let [rawinput62187 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62189 {"dataSources" (rawinput62187 "dataSources"), "nextToken" (rawinput62187 "nextToken")}] (clojure.core/cond-> {} (letvar62189 "dataSources") (clojure.core/assoc :data-sources (deser-data-sources (clojure.core/get-in letvar62189 ["dataSources"]))) (letvar62189 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar62189 ["nextToken"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper62191 input] (clojure.core/let [rawinput62190 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62192 {"message" (rawinput62190 "message")}] (clojure.core/cond-> {} (letvar62192 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar62192 ["message"])))))))

(clojure.core/defn- response-get-schema-creation-status-response ([input] (response-get-schema-creation-status-response nil input)) ([resultWrapper62194 input] (clojure.core/let [rawinput62193 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62195 {"status" (rawinput62193 "status"), "details" (rawinput62193 "details")}] (clojure.core/cond-> {} (letvar62195 "status") (clojure.core/assoc :status (deser-schema-status (clojure.core/get-in letvar62195 ["status"]))) (letvar62195 "details") (clojure.core/assoc :details (deser-string (clojure.core/get-in letvar62195 ["details"])))))))

(clojure.core/defn- response-get-data-source-response ([input] (response-get-data-source-response nil input)) ([resultWrapper62197 input] (clojure.core/let [rawinput62196 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62198 {"dataSource" (rawinput62196 "dataSource")}] (clojure.core/cond-> {} (letvar62198 "dataSource") (clojure.core/assoc :data-source (deser-data-source (clojure.core/get-in letvar62198 ["dataSource"])))))))

(clojure.core/defn- response-update-type-response ([input] (response-update-type-response nil input)) ([resultWrapper62200 input] (clojure.core/let [rawinput62199 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62201 {"type" (rawinput62199 "type")}] (clojure.core/cond-> {} (letvar62201 "type") (clojure.core/assoc :type (deser-type (clojure.core/get-in letvar62201 ["type"])))))))

(clojure.core/defn- response-get-type-response ([input] (response-get-type-response nil input)) ([resultWrapper62203 input] (clojure.core/let [rawinput62202 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62204 {"type" (rawinput62202 "type")}] (clojure.core/cond-> {} (letvar62204 "type") (clojure.core/assoc :type (deser-type (clojure.core/get-in letvar62204 ["type"])))))))

(clojure.core/defn- response-update-graphql-api-response ([input] (response-update-graphql-api-response nil input)) ([resultWrapper62206 input] (clojure.core/let [rawinput62205 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar62207 {"graphqlApi" (rawinput62205 "graphqlApi")}] (clojure.core/cond-> {} (letvar62207 "graphqlApi") (clojure.core/assoc :graphql-api (deser-graphql-api (clojure.core/get-in letvar62207 ["graphqlApi"])))))))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-graphql-apis-response/graphql-apis (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/graphql-apis))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-graphql-apis-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-graphql-apis-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.list-graphql-apis-response/graphql-apis :portkey.aws.appsync.-2017-07-25.list-graphql-apis-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.relational-database-data-source-config/relational-database-source-type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/relational-database-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.relational-database-data-source-config/rds-http-endpoint-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/rds-http-endpoint-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/relational-database-data-source-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.relational-database-data-source-config/relational-database-source-type :portkey.aws.appsync.-2017-07-25.relational-database-data-source-config/rds-http-endpoint-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-function-request/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-function-request/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-function-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-function-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-function-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-function-request/function-version (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.create-function-request/api-id :portkey.aws.appsync.-2017-07-25.create-function-request/name :portkey.aws.appsync.-2017-07-25.create-function-request/data-source-name :portkey.aws.appsync.-2017-07-25.create-function-request/request-mapping-template :portkey.aws.appsync.-2017-07-25.create-function-request/function-version] :opt-un [:portkey.aws.appsync.-2017-07-25.create-function-request/description :portkey.aws.appsync.-2017-07-25.create-function-request/response-mapping-template]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/functions (clojure.spec.alpha/coll-of :portkey.aws.appsync.-2017-07-25/function-configuration))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/resolver-kind #{:pipeline :unit "UNIT" "PIPELINE"})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/field-log-level #{"ERROR" :all "NONE" :error "ALL" :none})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-type-request/definition (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.update-type-request/api-id :portkey.aws.appsync.-2017-07-25.update-type-request/type-name :portkey.aws.appsync.-2017-07-25.update-type-request/format] :opt-un [:portkey.aws.appsync.-2017-07-25.update-type-request/definition]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-type-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/functions-ids (clojure.spec.alpha/coll-of :portkey.aws.appsync.-2017-07-25/string))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.http-data-source-config/endpoint (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.http-data-source-config/authorization-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/authorization-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/http-data-source-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.http-data-source-config/endpoint :portkey.aws.appsync.-2017-07-25.http-data-source-config/authorization-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/schema-status #{:processing :deleting :active "DELETING" "ACTIVE" "PROCESSING"})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/relational-database-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/relational-database-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/http-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-request/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.update-data-source-request/api-id :portkey.aws.appsync.-2017-07-25.update-data-source-request/name :portkey.aws.appsync.-2017-07-25.update-data-source-request/type] :opt-un [:portkey.aws.appsync.-2017-07-25.update-data-source-request/elasticsearch-config :portkey.aws.appsync.-2017-07-25.update-data-source-request/lambda-config :portkey.aws.appsync.-2017-07-25.update-data-source-request/dynamodb-config :portkey.aws.appsync.-2017-07-25.update-data-source-request/relational-database-config :portkey.aws.appsync.-2017-07-25.update-data-source-request/service-role-arn :portkey.aws.appsync.-2017-07-25.update-data-source-request/http-config :portkey.aws.appsync.-2017-07-25.update-data-source-request/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.type/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.type/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.type/arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.type/definition (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.type/format (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.type/name :portkey.aws.appsync.-2017-07-25.type/description :portkey.aws.appsync.-2017-07-25.type/arn :portkey.aws.appsync.-2017-07-25.type/definition :portkey.aws.appsync.-2017-07-25.type/format]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-response/function-configuration (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/function-configuration))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.update-function-response/function-configuration]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/data-source-type #{:amazon-dynamodb :aws-lambda :relational-database "AWS_LAMBDA" "RELATIONAL_DATABASE" "NONE" :amazon-elasticsearch "AMAZON_DYNAMODB" "AMAZON_ELASTICSEARCH" :http "HTTP" :none})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.log-config/field-log-level (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/field-log-level))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.log-config/cloud-watch-logs-role-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/log-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.log-config/field-log-level :portkey.aws.appsync.-2017-07-25.log-config/cloud-watch-logs-role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.api-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/api-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.api-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-schema-creation-status-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-schema-creation-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.get-schema-creation-status-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/log-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.update-graphql-api-request/api-id :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/name] :opt-un [:portkey.aws.appsync.-2017-07-25.update-graphql-api-request/log-config :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/authentication-type :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/user-pool-config :portkey.aws.appsync.-2017-07-25.update-graphql-api-request/open-id-connect-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/relational-database-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/relational-database-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/http-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-request/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.create-data-source-request/api-id :portkey.aws.appsync.-2017-07-25.create-data-source-request/name :portkey.aws.appsync.-2017-07-25.create-data-source-request/type] :opt-un [:portkey.aws.appsync.-2017-07-25.create-data-source-request/elasticsearch-config :portkey.aws.appsync.-2017-07-25.create-data-source-request/lambda-config :portkey.aws.appsync.-2017-07-25.create-data-source-request/dynamodb-config :portkey.aws.appsync.-2017-07-25.create-data-source-request/relational-database-config :portkey.aws.appsync.-2017-07-25.create-data-source-request/service-role-arn :portkey.aws.appsync.-2017-07-25.create-data-source-request/http-config :portkey.aws.appsync.-2017-07-25.create-data-source-request/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/db-cluster-identifier (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/database-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/schema (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/aws-secret-store-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/rds-http-endpoint-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/aws-region :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/db-cluster-identifier :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/database-name :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/schema :portkey.aws.appsync.-2017-07-25.rds-http-endpoint-config/aws-secret-store-arn]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.lambda-data-source-config/lambda-function-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/lambda-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.lambda-data-source-config/lambda-function-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-function-response/function-configuration (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/function-configuration))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.create-function-response/function-configuration]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-response/resolvers (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resolvers))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-resolvers-by-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-response/resolvers :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.get-resolver-request/api-id :portkey.aws.appsync.-2017-07-25.get-resolver-request/type-name :portkey.aws.appsync.-2017-07-25.get-resolver-request/field-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.update-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-api-keys-response/api-keys (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/api-keys))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-api-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-api-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.list-api-keys-response/api-keys :portkey.aws.appsync.-2017-07-25.list-api-keys-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/graphql-apis (clojure.spec.alpha/coll-of :portkey.aws.appsync.-2017-07-25/graphql-api))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-api-key-request/id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.delete-api-key-request/api-id :portkey.aws.appsync.-2017-07-25.delete-api-key-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-graphql-api-request/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-graphql-api-request/log-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-graphql-api-request/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-graphql-api-request/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-graphql-api-request/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.create-graphql-api-request/name :portkey.aws.appsync.-2017-07-25.create-graphql-api-request/authentication-type] :opt-un [:portkey.aws.appsync.-2017-07-25.create-graphql-api-request/log-config :portkey.aws.appsync.-2017-07-25.create-graphql-api-request/user-pool-config :portkey.aws.appsync.-2017-07-25.create-graphql-api-request/open-id-connect-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-resolvers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.list-resolvers-request/api-id :portkey.aws.appsync.-2017-07-25.list-resolvers-request/type-name] :opt-un [:portkey.aws.appsync.-2017-07-25.list-resolvers-request/next-token :portkey.aws.appsync.-2017-07-25.list-resolvers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/default-action #{"DENY" :allow "ALLOW" :deny})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.delete-graphql-api-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[\\S]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-types-response/types (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type-list))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-types-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.list-types-response/types :portkey.aws.appsync.-2017-07-25.list-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/relational-database-source-type #{:rds-http-endpoint "RDS_HTTP_ENDPOINT"})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.user-pool-config/user-pool-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.user-pool-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.user-pool-config/default-action (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/default-action))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.user-pool-config/app-id-client-regex (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/user-pool-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.user-pool-config/user-pool-id :portkey.aws.appsync.-2017-07-25.user-pool-config/aws-region :portkey.aws.appsync.-2017-07-25.user-pool-config/default-action] :opt-un [:portkey.aws.appsync.-2017-07-25.user-pool-config/app-id-client-regex]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-api-keys-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-api-keys-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-api-keys-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-api-keys-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.list-api-keys-request/api-id] :opt-un [:portkey.aws.appsync.-2017-07-25.list-api-keys-request/next-token :portkey.aws.appsync.-2017-07-25.list-api-keys-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/functions))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-functions-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-functions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.list-functions-response/functions :portkey.aws.appsync.-2017-07-25.list-functions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-graphql-api-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.get-graphql-api-request/api-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.aws-iam-config/signing-region (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.aws-iam-config/signing-service-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/aws-iam-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.aws-iam-config/signing-region :portkey.aws.appsync.-2017-07-25.aws-iam-config/signing-service-name]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/type-definition-format #{"SDL" "JSON" :sdl :json})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-response/resolvers (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resolvers))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-resolvers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.list-resolvers-response/resolvers :portkey.aws.appsync.-2017-07-25.list-resolvers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graph-ql-schema-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/graph-ql-schema-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.graph-ql-schema-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-function-request/function-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.delete-function-request/api-id :portkey.aws.appsync.-2017-07-25.delete-function-request/function-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.create-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-function-response/function-configuration (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/function-configuration))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.get-function-response/function-configuration]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/type-list (clojure.spec.alpha/coll-of :portkey.aws.appsync.-2017-07-25/type))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-graphql-apis-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-graphql-apis-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-graphql-apis-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.list-graphql-apis-request/next-token :portkey.aws.appsync.-2017-07-25.list-graphql-apis-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-api-key-response/api-key (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/api-key))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.create-api-key-response/api-key]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graphql-api/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graphql-api/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graphql-api/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graphql-api/log-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/log-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graphql-api/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graphql-api/open-id-connect-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/open-id-connect-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graphql-api/arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.graphql-api/uris (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/graphql-api (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.graphql-api/name :portkey.aws.appsync.-2017-07-25.graphql-api/api-id :portkey.aws.appsync.-2017-07-25.graphql-api/authentication-type :portkey.aws.appsync.-2017-07-25.graphql-api/log-config :portkey.aws.appsync.-2017-07-25.graphql-api/user-pool-config :portkey.aws.appsync.-2017-07-25.graphql-api/open-id-connect-config :portkey.aws.appsync.-2017-07-25.graphql-api/arn :portkey.aws.appsync.-2017-07-25.graphql-api/uris]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.pipeline-config/functions (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/functions-ids))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/pipeline-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.pipeline-config/functions]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-request/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-request/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-request/function-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-function-request/function-version (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.update-function-request/api-id :portkey.aws.appsync.-2017-07-25.update-function-request/name :portkey.aws.appsync.-2017-07-25.update-function-request/function-id :portkey.aws.appsync.-2017-07-25.update-function-request/data-source-name :portkey.aws.appsync.-2017-07-25.update-function-request/request-mapping-template :portkey.aws.appsync.-2017-07-25.update-function-request/function-version] :opt-un [:portkey.aws.appsync.-2017-07-25.update-function-request/description :portkey.aws.appsync.-2017-07-25.update-function-request/response-mapping-template]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/output-type #{"SDL" "JSON" :sdl :json})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/data-sources (clojure.spec.alpha/coll-of :portkey.aws.appsync.-2017-07-25/data-source))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-function-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/resolvers (clojure.spec.alpha/coll-of :portkey.aws.appsync.-2017-07-25/resolver))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.delete-resolver-request/api-id :portkey.aws.appsync.-2017-07-25.delete-resolver-request/type-name :portkey.aws.appsync.-2017-07-25.delete-resolver-request/field-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-type-request/definition (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.create-type-request/api-id :portkey.aws.appsync.-2017-07-25.create-type-request/definition :portkey.aws.appsync.-2017-07-25.create-type-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.update-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-introspection-schema-response/schema (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/blob))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-introspection-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.get-introspection-schema-response/schema]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.get-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.authorization-config/authorization-type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/authorization-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.authorization-config/aws-iam-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/aws-iam-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/authorization-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.authorization-config/authorization-type] :opt-un [:portkey.aws.appsync.-2017-07-25.authorization-config/aws-iam-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-request/function-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-resolvers-by-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-request/api-id :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-request/function-id] :opt-un [:portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-request/next-token :portkey.aws.appsync.-2017-07-25.list-resolvers-by-function-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.get-data-source-request/api-id :portkey.aws.appsync.-2017-07-25.get-data-source-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-api-key-request/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-api-key-request/expires (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/long))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.create-api-key-request/api-id] :opt-un [:portkey.aws.appsync.-2017-07-25.create-api-key-request/description :portkey.aws.appsync.-2017-07-25.create-api-key-request/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/authorization-type #{:aws-iam "AWS_IAM"})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[_A-Za-z][_0-9A-Za-z]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.delete-type-request/api-id :portkey.aws.appsync.-2017-07-25.delete-type-request/type-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/authentication-type #{"AMAZON_COGNITO_USER_POOLS" :openid-connect :aws-iam "AWS_IAM" "OPENID_CONNECT" "API_KEY" :api-key :amazon-cognito-user-pools})

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/mapping-template (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/relational-database-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/relational-database-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/data-source-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/http-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/http-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.data-source/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/data-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.data-source/elasticsearch-config :portkey.aws.appsync.-2017-07-25.data-source/lambda-config :portkey.aws.appsync.-2017-07-25.data-source/name :portkey.aws.appsync.-2017-07-25.data-source/dynamodb-config :portkey.aws.appsync.-2017-07-25.data-source/relational-database-config :portkey.aws.appsync.-2017-07-25.data-source/service-role-arn :portkey.aws.appsync.-2017-07-25.data-source/type :portkey.aws.appsync.-2017-07-25.data-source/data-source-arn :portkey.aws.appsync.-2017-07-25.data-source/http-config :portkey.aws.appsync.-2017-07-25.data-source/description]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-function-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-function-request/function-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.get-function-request/api-id :portkey.aws.appsync.-2017-07-25.get-function-request/function-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-api-key-response/api-key (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/api-key))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-api-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.update-api-key-response/api-key]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-introspection-schema-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-introspection-schema-request/format (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/output-type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-introspection-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.get-introspection-schema-request/api-id :portkey.aws.appsync.-2017-07-25.get-introspection-schema-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.api-key-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/api-key-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.api-key-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-data-sources-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-data-sources-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-data-sources-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-data-sources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.list-data-sources-request/api-id] :opt-un [:portkey.aws.appsync.-2017-07-25.list-data-sources-request/next-token :portkey.aws.appsync.-2017-07-25.list-data-sources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/map-of-string-to-string (clojure.spec.alpha/map-of :portkey.aws.appsync.-2017-07-25/string :portkey.aws.appsync.-2017-07-25/string))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.get-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.start-schema-creation-response/status (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/schema-status))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/start-schema-creation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.start-schema-creation-response/status]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-request/kind (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resolver-kind))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-resolver-request/pipeline-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pipeline-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.update-resolver-request/api-id :portkey.aws.appsync.-2017-07-25.update-resolver-request/type-name :portkey.aws.appsync.-2017-07-25.update-resolver-request/field-name :portkey.aws.appsync.-2017-07-25.update-resolver-request/request-mapping-template] :opt-un [:portkey.aws.appsync.-2017-07-25.update-resolver-request/data-source-name :portkey.aws.appsync.-2017-07-25.update-resolver-request/response-mapping-template :portkey.aws.appsync.-2017-07-25.update-resolver-request/kind :portkey.aws.appsync.-2017-07-25.update-resolver-request/pipeline-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-request/kind (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resolver-kind))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-request/pipeline-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pipeline-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-resolver-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.create-resolver-request/api-id :portkey.aws.appsync.-2017-07-25.create-resolver-request/type-name :portkey.aws.appsync.-2017-07-25.create-resolver-request/field-name :portkey.aws.appsync.-2017-07-25.create-resolver-request/request-mapping-template] :opt-un [:portkey.aws.appsync.-2017-07-25.create-resolver-request/data-source-name :portkey.aws.appsync.-2017-07-25.create-resolver-request/response-mapping-template :portkey.aws.appsync.-2017-07-25.create-resolver-request/kind :portkey.aws.appsync.-2017-07-25.create-resolver-request/pipeline-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.create-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.function-configuration/function-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.function-configuration/function-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.function-configuration/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.function-configuration/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.function-configuration/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.function-configuration/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.function-configuration/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.function-configuration/function-version (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/function-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.function-configuration/function-id :portkey.aws.appsync.-2017-07-25.function-configuration/function-arn :portkey.aws.appsync.-2017-07-25.function-configuration/name :portkey.aws.appsync.-2017-07-25.function-configuration/description :portkey.aws.appsync.-2017-07-25.function-configuration/data-source-name :portkey.aws.appsync.-2017-07-25.function-configuration/request-mapping-template :portkey.aws.appsync.-2017-07-25.function-configuration/response-mapping-template :portkey.aws.appsync.-2017-07-25.function-configuration/function-version]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-resolver-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.create-resolver-response/resolver]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/api-keys (clojure.spec.alpha/coll-of :portkey.aws.appsync.-2017-07-25/api-key))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.create-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/create-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.create-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-functions-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-functions-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-functions-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-functions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.list-functions-request/api-id] :opt-un [:portkey.aws.appsync.-2017-07-25.list-functions-request/next-token :portkey.aws.appsync.-2017-07-25.list-functions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.start-schema-creation-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.start-schema-creation-request/definition (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/blob))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/start-schema-creation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.start-schema-creation-request/api-id :portkey.aws.appsync.-2017-07-25.start-schema-creation-request/definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-api-key-request/id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-api-key-request/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-api-key-request/expires (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/long))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-api-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.update-api-key-request/api-id :portkey.aws.appsync.-2017-07-25.update-api-key-request/id] :opt-un [:portkey.aws.appsync.-2017-07-25.update-api-key-request/description :portkey.aws.appsync.-2017-07-25.update-api-key-request/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.api-key-validity-out-of-bounds-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/api-key-validity-out-of-bounds-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.api-key-validity-out-of-bounds-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/max-results (clojure.spec.alpha/int-in 0 25))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.delete-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/delete-data-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.delete-data-source-request/api-id :portkey.aws.appsync.-2017-07-25.delete-data-source-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.open-id-connect-config/issuer (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.open-id-connect-config/client-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.open-id-connect-config/iat-ttl (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/long))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.open-id-connect-config/auth-ttl (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/long))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/open-id-connect-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.open-id-connect-config/issuer] :opt-un [:portkey.aws.appsync.-2017-07-25.open-id-connect-config/client-id :portkey.aws.appsync.-2017-07-25.open-id-connect-config/iat-ttl :portkey.aws.appsync.-2017-07-25.open-id-connect-config/auth-ttl]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.api-key/id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.api-key/description (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.api-key/expires (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/long))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/api-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.api-key/id :portkey.aws.appsync.-2017-07-25.api-key/description :portkey.aws.appsync.-2017-07-25.api-key/expires]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-data-sources-response/data-sources (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/data-sources))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-data-sources-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-data-sources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.list-data-sources-response/data-sources :portkey.aws.appsync.-2017-07-25.list-data-sources-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-types-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-types-request/format (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-types-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.list-types-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/list-types-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.list-types-request/api-id :portkey.aws.appsync.-2017-07-25.list-types-request/format] :opt-un [:portkey.aws.appsync.-2017-07-25.list-types-request/next-token :portkey.aws.appsync.-2017-07-25.list-types-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.resolver/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.resolver/field-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.resolver/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.resolver/resolver-arn (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.resolver/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.resolver/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.resolver/kind (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resolver-kind))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.resolver/pipeline-config (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/pipeline-config))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/resolver (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.resolver/type-name :portkey.aws.appsync.-2017-07-25.resolver/field-name :portkey.aws.appsync.-2017-07-25.resolver/data-source-name :portkey.aws.appsync.-2017-07-25.resolver/resolver-arn :portkey.aws.appsync.-2017-07-25.resolver/request-mapping-template :portkey.aws.appsync.-2017-07-25.resolver/response-mapping-template :portkey.aws.appsync.-2017-07-25.resolver/kind :portkey.aws.appsync.-2017-07-25.resolver/pipeline-config]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.get-type-request/api-id :portkey.aws.appsync.-2017-07-25.get-type-request/type-name :portkey.aws.appsync.-2017-07-25.get-type-request/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-schema-creation-status-response/status (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/schema-status))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-schema-creation-status-response/details (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-schema-creation-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.get-schema-creation-status-response/status :portkey.aws.appsync.-2017-07-25.get-schema-creation-status-response/details]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-data-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.get-data-source-response/data-source]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.update-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.get-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/type))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/get-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.get-type-response/type]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.dynamodb-data-source-config/table-name (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.dynamodb-data-source-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.dynamodb-data-source-config/use-caller-credentials (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/boolean))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/dynamodb-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.dynamodb-data-source-config/table-name :portkey.aws.appsync.-2017-07-25.dynamodb-data-source-config/aws-region] :opt-un [:portkey.aws.appsync.-2017-07-25.dynamodb-data-source-config/use-caller-credentials]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.elasticsearch-data-source-config/endpoint (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.elasticsearch-data-source-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/string))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/elasticsearch-data-source-config (clojure.spec.alpha/keys :req-un [:portkey.aws.appsync.-2017-07-25.elasticsearch-data-source-config/endpoint :portkey.aws.appsync.-2017-07-25.elasticsearch-data-source-config/aws-region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25.update-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/update-graphql-api-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appsync.-2017-07-25.update-graphql-api-response/graphql-api]))

(clojure.spec.alpha/def :portkey.aws.appsync.-2017-07-25/boolean clojure.core/boolean?)

(clojure.core/defn start-schema-creation "Adds a new schema to your GraphQL API.\n This operation is asynchronous. Use to determine when it has completed." ([start-schema-creation-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-start-schema-creation-request start-schema-creation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/start-schema-creation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schemacreation", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/start-schema-creation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSchemaCreation", :http.request.configuration/output-deser-fn response-start-schema-creation-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef start-schema-creation :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/start-schema-creation-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/start-schema-creation-response))

(clojure.core/defn get-type "Retrieves a Type object." ([get-type-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-type-request get-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/get-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/get-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetType", :http.request.configuration/output-deser-fn response-get-type-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/get-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/get-type-response))

(clojure.core/defn delete-resolver "Deletes a Resolver object." ([delete-resolver-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-resolver-request delete-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/delete-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/delete-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResolver", :http.request.configuration/output-deser-fn response-delete-resolver-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/delete-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/delete-resolver-response))

(clojure.core/defn delete-function "Deletes a Function." ([delete-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-function-request delete-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/delete-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions/{functionId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/delete-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFunction", :http.request.configuration/output-deser-fn response-delete-function-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/delete-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/delete-function-response))

(clojure.core/defn get-introspection-schema "Retrieves the introspection schema for a GraphQL API." ([get-introspection-schema-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-introspection-schema-request get-introspection-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/get-introspection-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schema", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/get-introspection-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIntrospectionSchema", :http.request.configuration/output-deser-fn response-get-introspection-schema-response, :http.request.spec/error-spec {"GraphQLSchemaException" :portkey.aws.appsync.-2017-07-25/graph-ql-schema-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-introspection-schema :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/get-introspection-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/get-introspection-schema-response))

(clojure.core/defn create-graphql-api "Creates a GraphqlApi object." ([create-graphql-api-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-graphql-api-request create-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/create-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/create-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateGraphqlApi", :http.request.configuration/output-deser-fn response-create-graphql-api-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "LimitExceededException" :portkey.aws.appsync.-2017-07-25/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception, "ApiLimitExceededException" :portkey.aws.appsync.-2017-07-25/api-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/create-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/create-graphql-api-response))

(clojure.core/defn list-data-sources "Lists the data sources for a given API." ([list-data-sources-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-data-sources-request list-data-sources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/list-data-sources-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/list-data-sources-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDataSources", :http.request.configuration/output-deser-fn response-list-data-sources-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-data-sources :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/list-data-sources-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/list-data-sources-response))

(clojure.core/defn create-api-key "Creates a unique key that you can distribute to clients who are executing your\nAPI." ([create-api-key-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-api-key-request create-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/create-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/create-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApiKey", :http.request.configuration/output-deser-fn response-create-api-key-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "LimitExceededException" :portkey.aws.appsync.-2017-07-25/limit-exceeded-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception, "ApiKeyLimitExceededException" :portkey.aws.appsync.-2017-07-25/api-key-limit-exceeded-exception, "ApiKeyValidityOutOfBoundsException" :portkey.aws.appsync.-2017-07-25/api-key-validity-out-of-bounds-exception}})))))
(clojure.spec.alpha/fdef create-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/create-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/create-api-key-response))

(clojure.core/defn delete-api-key "Deletes an API key." ([delete-api-key-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-api-key-request delete-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/delete-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys/{id}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/delete-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApiKey", :http.request.configuration/output-deser-fn response-delete-api-key-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/delete-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/delete-api-key-response))

(clojure.core/defn get-resolver "Retrieves a Resolver object." ([get-resolver-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-resolver-request get-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/get-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/get-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolver", :http.request.configuration/output-deser-fn response-get-resolver-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception}})))))
(clojure.spec.alpha/fdef get-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/get-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/get-resolver-response))

(clojure.core/defn update-data-source "Updates a DataSource object." ([update-data-source-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-data-source-request update-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/update-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/update-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDataSource", :http.request.configuration/output-deser-fn response-update-data-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/update-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/update-data-source-response))

(clojure.core/defn update-api-key "Updates an API key." ([update-api-key-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-api-key-request update-api-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/update-api-key-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys/{id}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/update-api-key-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateApiKey", :http.request.configuration/output-deser-fn response-update-api-key-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "LimitExceededException" :portkey.aws.appsync.-2017-07-25/limit-exceeded-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception, "ApiKeyValidityOutOfBoundsException" :portkey.aws.appsync.-2017-07-25/api-key-validity-out-of-bounds-exception}})))))
(clojure.spec.alpha/fdef update-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/update-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/update-api-key-response))

(clojure.core/defn create-resolver "Creates a Resolver object.\n A resolver converts incoming requests into a format that a data source can\nunderstand and converts the data source's responses into GraphQL." ([create-resolver-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-resolver-request create-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/create-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/create-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResolver", :http.request.configuration/output-deser-fn response-create-resolver-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/create-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/create-resolver-response))

(clojure.core/defn get-function "Get a Function." ([get-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-function-request get-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/get-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions/{functionId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/get-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFunction", :http.request.configuration/output-deser-fn response-get-function-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception}})))))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/get-function-response))

(clojure.core/defn delete-type "Deletes a Type object." ([delete-type-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-type-request delete-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/delete-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/delete-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteType", :http.request.configuration/output-deser-fn response-delete-type-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/delete-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/delete-type-response))

(clojure.core/defn get-schema-creation-status "Retrieves the current status of a schema creation operation." ([get-schema-creation-status-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-schema-creation-status-request get-schema-creation-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/get-schema-creation-status-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/schemacreation", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/get-schema-creation-status-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSchemaCreationStatus", :http.request.configuration/output-deser-fn response-get-schema-creation-status-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-schema-creation-status :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/get-schema-creation-status-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/get-schema-creation-status-response))

(clojure.core/defn update-resolver "Updates a Resolver object." ([update-resolver-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-resolver-request update-resolver-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/update-resolver-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/update-resolver-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResolver", :http.request.configuration/output-deser-fn response-update-resolver-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/update-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/update-resolver-response))

(clojure.core/defn list-graphql-apis "Lists your GraphQL APIs." ([] (list-graphql-apis {})) ([list-graphql-apis-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-graphql-apis-request list-graphql-apis-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/list-graphql-apis-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/list-graphql-apis-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGraphqlApis", :http.request.configuration/output-deser-fn response-list-graphql-apis-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-graphql-apis :args (clojure.spec.alpha/? :portkey.aws.appsync.-2017-07-25/list-graphql-apis-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/list-graphql-apis-response))

(clojure.core/defn list-api-keys "Lists the API keys for a given API.\n API keys are deleted automatically sometime after they expire. However, they\nmay still be included in the response until they have actually been deleted. You\ncan safely call DeleteApiKey to manually delete a key before it's automatically\ndeleted." ([list-api-keys-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-api-keys-request list-api-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/list-api-keys-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/apikeys", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/list-api-keys-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApiKeys", :http.request.configuration/output-deser-fn response-list-api-keys-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-api-keys :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/list-api-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/list-api-keys-response))

(clojure.core/defn update-graphql-api "Updates a GraphqlApi object." ([update-graphql-api-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-graphql-api-request update-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/update-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/update-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGraphqlApi", :http.request.configuration/output-deser-fn response-update-graphql-api-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/update-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/update-graphql-api-response))

(clojure.core/defn update-function "Updates a Function object." ([update-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-function-request update-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/update-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions/{functionId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/update-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFunction", :http.request.configuration/output-deser-fn response-update-function-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/update-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/update-function-response))

(clojure.core/defn list-functions "List multiple functions." ([list-functions-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-functions-request list-functions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/list-functions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/list-functions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFunctions", :http.request.configuration/output-deser-fn response-list-functions-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/list-functions-response))

(clojure.core/defn list-resolvers-by-function "List the resolvers that are associated with a specific function." ([list-resolvers-by-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-resolvers-by-function-request list-resolvers-by-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/list-resolvers-by-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions/{functionId}/resolvers", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/list-resolvers-by-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolversByFunction", :http.request.configuration/output-deser-fn response-list-resolvers-by-function-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-resolvers-by-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/list-resolvers-by-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/list-resolvers-by-function-response))

(clojure.core/defn update-type "Updates a Type object." ([update-type-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-type-request update-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/update-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/update-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateType", :http.request.configuration/output-deser-fn response-update-type-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/update-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/update-type-response))

(clojure.core/defn get-data-source "Retrieves a DataSource object." ([get-data-source-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-data-source-request get-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/get-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/get-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDataSource", :http.request.configuration/output-deser-fn response-get-data-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/get-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/get-data-source-response))

(clojure.core/defn get-graphql-api "Retrieves a GraphqlApi object." ([get-graphql-api-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-graphql-api-request get-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/get-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/get-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGraphqlApi", :http.request.configuration/output-deser-fn response-get-graphql-api-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/get-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/get-graphql-api-response))

(clojure.core/defn create-function "Creates a Function object.\n A function is a reusable entity. Multiple functions can be used to compose the\nresolver logic." ([create-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-function-request create-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/create-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/functions", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/create-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFunction", :http.request.configuration/output-deser-fn response-create-function-response, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-function :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/create-function-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/create-function-response))

(clojure.core/defn create-data-source "Creates a DataSource object." ([create-data-source-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-data-source-request create-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/create-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/create-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDataSource", :http.request.configuration/output-deser-fn response-create-data-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/create-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/create-data-source-response))

(clojure.core/defn create-type "Creates a Type object." ([create-type-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-type-request create-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/create-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/create-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateType", :http.request.configuration/output-deser-fn response-create-type-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/create-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/create-type-response))

(clojure.core/defn delete-graphql-api "Deletes a GraphqlApi object." ([delete-graphql-api-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-graphql-api-request delete-graphql-api-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/delete-graphql-api-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/delete-graphql-api-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGraphqlApi", :http.request.configuration/output-deser-fn response-delete-graphql-api-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/delete-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/delete-graphql-api-response))

(clojure.core/defn list-resolvers "Lists the resolvers for a given API and type." ([list-resolvers-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-resolvers-request list-resolvers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/list-resolvers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types/{typeName}/resolvers", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/list-resolvers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolvers", :http.request.configuration/output-deser-fn response-list-resolvers-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-resolvers :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/list-resolvers-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/list-resolvers-response))

(clojure.core/defn delete-data-source "Deletes a DataSource object." ([delete-data-source-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-data-source-request delete-data-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/delete-data-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/datasources/{name}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/delete-data-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDataSource", :http.request.configuration/output-deser-fn response-delete-data-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/delete-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/delete-data-source-response))

(clojure.core/defn list-types "Lists the types for a given API." ([list-types-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-types-request list-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.appsync.-2017-07-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appsync.-2017-07-25/list-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/apis/{apiId}/types", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "AppSync", :http.request.spec/input-spec :portkey.aws.appsync.-2017-07-25/list-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTypes", :http.request.configuration/output-deser-fn response-list-types-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appsync.-2017-07-25/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync.-2017-07-25/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync.-2017-07-25/not-found-exception, "UnauthorizedException" :portkey.aws.appsync.-2017-07-25/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync.-2017-07-25/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-types :args (clojure.spec.alpha/tuple :portkey.aws.appsync.-2017-07-25/list-types-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync.-2017-07-25/list-types-response))
