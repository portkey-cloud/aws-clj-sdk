(ns portkey.aws.appsync (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-response/graphql-apis (clojure.spec.alpha/and :portkey.aws.appsync/graphql-apis))
(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-graphql-apis-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.list-graphql-apis-response/graphqlApis :portkey.aws.appsync.list-graphql-apis-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.unauthorized-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/update-type-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.update-type-request/apiId :portkey.aws.appsync.update-type-request/typeName :portkey.aws.appsync.update-type-request/format] :opt-un [:portkey.aws.appsync.update-type-request/definition] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-type-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-graphql-api-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.bad-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/schema-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"PROCESSING" "PROCESSING", :processing "PROCESSING", "ACTIVE" "ACTIVE", :active "ACTIVE", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-request/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync/update-data-source-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.update-data-source-request/apiId :portkey.aws.appsync.update-data-source-request/name :portkey.aws.appsync.update-data-source-request/type] :opt-un [:portkey.aws.appsync.update-data-source-request/description :portkey.aws.appsync.update-data-source-request/serviceRoleArn :portkey.aws.appsync.update-data-source-request/dynamodbConfig :portkey.aws.appsync.update-data-source-request/lambdaConfig :portkey.aws.appsync.update-data-source-request/elasticsearchConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.type/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.type/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.type/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.type/name :portkey.aws.appsync.type/description :portkey.aws.appsync.type/arn :portkey.aws.appsync.type/definition :portkey.aws.appsync.type/format] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/data-source-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"AWS_LAMBDA" "AWS_LAMBDA", :aws-lambda "AWS_LAMBDA", "AMAZON_DYNAMODB" "AMAZON_DYNAMODB", :amazon-dynamodb "AMAZON_DYNAMODB", "AMAZON_ELASTICSEARCH" "AMAZON_ELASTICSEARCH", :amazon-elasticsearch "AMAZON_ELASTICSEARCH", "NONE" "NONE", :none "NONE"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.appsync.api-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.api-limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-schema-creation-status-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.get-schema-creation-status-request/apiId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-request/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync/update-graphql-api-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.update-graphql-api-request/apiId :portkey.aws.appsync.update-graphql-api-request/name] :opt-un [:portkey.aws.appsync.update-graphql-api-request/authenticationType :portkey.aws.appsync.update-graphql-api-request/userPoolConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-request/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync/create-data-source-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.create-data-source-request/apiId :portkey.aws.appsync.create-data-source-request/name :portkey.aws.appsync.create-data-source-request/type] :opt-un [:portkey.aws.appsync.create-data-source-request/description :portkey.aws.appsync.create-data-source-request/serviceRoleArn :portkey.aws.appsync.create-data-source-request/dynamodbConfig :portkey.aws.appsync.create-data-source-request/lambdaConfig :portkey.aws.appsync.create-data-source-request/elasticsearchConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.lambda-data-source-config/lambda-function-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/lambda-data-source-config (portkey.aws/json-keys :req-un [:portkey.aws.appsync.lambda-data-source-config/lambdaFunctionArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/get-resolver-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.get-resolver-request/apiId :portkey.aws.appsync.get-resolver-request/typeName :portkey.aws.appsync.get-resolver-request/fieldName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/update-resolver-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.update-resolver-response/resolver] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-response/api-keys (clojure.spec.alpha/and :portkey.aws.appsync/api-keys))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-api-keys-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.list-api-keys-response/apiKeys :portkey.aws.appsync.list-api-keys-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/graphql-apis (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.appsync/graphql-api) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-api-key-request/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.delete-api-key-request/apiId :portkey.aws.appsync.delete-api-key-request/id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-request/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync/create-graphql-api-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.create-graphql-api-request/name :portkey.aws.appsync.create-graphql-api-request/authenticationType] :opt-un [:portkey.aws.appsync.create-graphql-api-request/userPoolConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-resolvers-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.list-resolvers-request/apiId :portkey.aws.appsync.list-resolvers-request/typeName] :opt-un [:portkey.aws.appsync.list-resolvers-request/nextToken :portkey.aws.appsync.list-resolvers-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/default-action (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ALLOW" "ALLOW", :allow "ALLOW", "DENY" "DENY", :deny "DENY"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-graphql-api-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.delete-graphql-api-request/apiId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[\\S]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.appsync.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.list-types-response/types (clojure.spec.alpha/and :portkey.aws.appsync/type-list))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.list-types-response/types :portkey.aws.appsync.list-types-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/user-pool-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/default-action (clojure.spec.alpha/and :portkey.aws.appsync/default-action))
(clojure.spec.alpha/def :portkey.aws.appsync.user-pool-config/app-id-client-regex (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/user-pool-config (portkey.aws/json-keys :req-un [:portkey.aws.appsync.user-pool-config/userPoolId :portkey.aws.appsync.user-pool-config/awsRegion :portkey.aws.appsync.user-pool-config/defaultAction] :opt-un [:portkey.aws.appsync.user-pool-config/appIdClientRegex] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-api-keys-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-api-keys-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.list-api-keys-request/apiId] :opt-un [:portkey.aws.appsync.list-api-keys-request/nextToken :portkey.aws.appsync.list-api-keys-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-graphql-api-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-graphql-api-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.get-graphql-api-request/apiId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-resolver-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/type-definition-format (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"SDL" "SDL", :sdl "SDL", "JSON" "JSON", :json "JSON"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-response/resolvers (clojure.spec.alpha/and :portkey.aws.appsync/resolvers))
(clojure.spec.alpha/def :portkey.aws.appsync.list-resolvers-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-resolvers-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.list-resolvers-response/resolvers :portkey.aws.appsync.list-resolvers-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.graphqlschema-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/graphqlschema-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.graphqlschema-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/create-data-source-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.create-data-source-response/dataSource] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/type-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.appsync/type) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-graphql-apis-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-graphql-apis-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.list-graphql-apis-request/nextToken :portkey.aws.appsync.list-graphql-apis-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-response/api-key (clojure.spec.alpha/and :portkey.aws.appsync/api-key))
(clojure.spec.alpha/def :portkey.aws.appsync/create-api-key-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.create-api-key-response/apiKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/authentication-type (clojure.spec.alpha/and :portkey.aws.appsync/authentication-type))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/user-pool-config (clojure.spec.alpha/and :portkey.aws.appsync/user-pool-config))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.graphql-api/uris (clojure.spec.alpha/and :portkey.aws.appsync/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.appsync/graphql-api (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.graphql-api/name :portkey.aws.appsync.graphql-api/apiId :portkey.aws.appsync.graphql-api/authenticationType :portkey.aws.appsync.graphql-api/userPoolConfig :portkey.aws.appsync.graphql-api/arn :portkey.aws.appsync.graphql-api/uris] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appsync/output-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"SDL" "SDL", :sdl "SDL", "JSON" "JSON", :json "JSON"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.appsync.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-api-key-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/data-sources (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.appsync/data-source) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.appsync/resolvers (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.appsync/resolver) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-resolver-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.delete-resolver-request/apiId :portkey.aws.appsync.delete-resolver-request/typeName :portkey.aws.appsync.delete-resolver-request/fieldName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/create-type-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.create-type-request/apiId :portkey.aws.appsync.create-type-request/definition :portkey.aws.appsync.create-type-request/format] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/update-data-source-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.update-data-source-response/dataSource] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-response/schema (clojure.spec.alpha/and :portkey.aws.appsync/blob))
(clojure.spec.alpha/def :portkey.aws.appsync/get-introspection-schema-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.get-introspection-schema-response/schema] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/get-graphql-api-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.get-graphql-api-response/graphqlApi] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/get-data-source-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.get-data-source-request/apiId :portkey.aws.appsync.get-data-source-request/name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-api-key-request/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/create-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.create-api-key-request/apiId] :opt-un [:portkey.aws.appsync.create-api-key-request/description :portkey.aws.appsync.create-api-key-request/expires] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[_A-Za-z][_0-9A-Za-z]*" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.appsync/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-type-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.delete-type-request/apiId :portkey.aws.appsync.delete-type-request/typeName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/authentication-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"API_KEY" "API_KEY", :api-key "API_KEY", "AWS_IAM" "AWS_IAM", :aws-iam "AWS_IAM", "AMAZON_COGNITO_USER_POOLS" "AMAZON_COGNITO_USER_POOLS", :amazon-cognito-user-pools "AMAZON_COGNITO_USER_POOLS"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.appsync/mapping-template (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 0 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.appsync.data-source/data-source-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/type (clojure.spec.alpha/and :portkey.aws.appsync/data-source-type))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/service-role-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/dynamodb-config (clojure.spec.alpha/and :portkey.aws.appsync/dynamodb-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/lambda-config (clojure.spec.alpha/and :portkey.aws.appsync/lambda-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync.data-source/elasticsearch-config (clojure.spec.alpha/and :portkey.aws.appsync/elasticsearch-data-source-config))
(clojure.spec.alpha/def :portkey.aws.appsync/data-source (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.data-source/dataSourceArn :portkey.aws.appsync.data-source/name :portkey.aws.appsync.data-source/description :portkey.aws.appsync.data-source/type :portkey.aws.appsync.data-source/serviceRoleArn :portkey.aws.appsync.data-source/dynamodbConfig :portkey.aws.appsync.data-source/lambdaConfig :portkey.aws.appsync.data-source/elasticsearchConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-response/api-key (clojure.spec.alpha/and :portkey.aws.appsync/api-key))
(clojure.spec.alpha/def :portkey.aws.appsync/update-api-key-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.update-api-key-response/apiKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-introspection-schema-request/format (clojure.spec.alpha/and :portkey.aws.appsync/output-type))
(clojure.spec.alpha/def :portkey.aws.appsync/get-introspection-schema-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.get-introspection-schema-request/apiId :portkey.aws.appsync.get-introspection-schema-request/format] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.api-key-limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-data-sources-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.list-data-sources-request/apiId] :opt-un [:portkey.aws.appsync.list-data-sources-request/nextToken :portkey.aws.appsync.list-data-sources-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/map-of-string-to-string (clojure.spec.alpha/map-of :portkey.aws.appsync/string :portkey.aws.appsync/string))

(clojure.spec.alpha/def :portkey.aws.appsync.get-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/get-resolver-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.get-resolver-response/resolver] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-response/status (clojure.spec.alpha/and :portkey.aws.appsync/schema-status))
(clojure.spec.alpha/def :portkey.aws.appsync/start-schema-creation-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.start-schema-creation-response/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.update-resolver-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync/update-resolver-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.update-resolver-request/apiId :portkey.aws.appsync.update-resolver-request/typeName :portkey.aws.appsync.update-resolver-request/fieldName :portkey.aws.appsync.update-resolver-request/dataSourceName :portkey.aws.appsync.update-resolver-request/requestMappingTemplate] :opt-un [:portkey.aws.appsync.update-resolver-request/responseMappingTemplate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-request/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync/create-resolver-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.create-resolver-request/apiId :portkey.aws.appsync.create-resolver-request/typeName :portkey.aws.appsync.create-resolver-request/fieldName :portkey.aws.appsync.create-resolver-request/dataSourceName :portkey.aws.appsync.create-resolver-request/requestMappingTemplate] :opt-un [:portkey.aws.appsync.create-resolver-request/responseMappingTemplate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/create-graphql-api-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.create-graphql-api-response/graphqlApi] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.create-resolver-response/resolver (clojure.spec.alpha/and :portkey.aws.appsync/resolver))
(clojure.spec.alpha/def :portkey.aws.appsync/create-resolver-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.create-resolver-response/resolver] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/api-keys (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.appsync/api-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.appsync/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appsync.create-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/create-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.create-type-response/type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/delete-data-source-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.start-schema-creation-request/definition (clojure.spec.alpha/and :portkey.aws.appsync/blob))
(clojure.spec.alpha/def :portkey.aws.appsync/start-schema-creation-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.start-schema-creation-request/apiId :portkey.aws.appsync.start-schema-creation-request/definition] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.update-api-key-request/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/update-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.update-api-key-request/apiId :portkey.aws.appsync.update-api-key-request/id] :opt-un [:portkey.aws.appsync.update-api-key-request/description :portkey.aws.appsync.update-api-key-request/expires] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key-validity-out-of-bounds-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key-validity-out-of-bounds-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.api-key-validity-out-of-bounds-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 0 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 25))))

(clojure.spec.alpha/def :portkey.aws.appsync.delete-data-source-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.delete-data-source-request/name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync/delete-data-source-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.delete-data-source-request/apiId :portkey.aws.appsync.delete-data-source-request/name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.api-key/id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.api-key/description (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.api-key/expires (clojure.spec.alpha/and :portkey.aws.appsync/long))
(clojure.spec.alpha/def :portkey.aws.appsync/api-key (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.api-key/id :portkey.aws.appsync.api-key/description :portkey.aws.appsync.api-key/expires] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-response/data-sources (clojure.spec.alpha/and :portkey.aws.appsync/data-sources))
(clojure.spec.alpha/def :portkey.aws.appsync.list-data-sources-response/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync/list-data-sources-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.list-data-sources-response/dataSources :portkey.aws.appsync.list-data-sources-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.appsync.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.appsync/error-message))
(clojure.spec.alpha/def :portkey.aws.appsync/concurrent-modification-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.concurrent-modification-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/next-token (clojure.spec.alpha/and :portkey.aws.appsync/pagination-token))
(clojure.spec.alpha/def :portkey.aws.appsync.list-types-request/max-results (clojure.spec.alpha/and :portkey.aws.appsync/max-results))
(clojure.spec.alpha/def :portkey.aws.appsync/list-types-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.list-types-request/apiId :portkey.aws.appsync.list-types-request/format] :opt-un [:portkey.aws.appsync.list-types-request/nextToken :portkey.aws.appsync.list-types-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.resolver/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/field-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/data-source-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/resolver-arn (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/request-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync.resolver/response-mapping-template (clojure.spec.alpha/and :portkey.aws.appsync/mapping-template))
(clojure.spec.alpha/def :portkey.aws.appsync/resolver (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.resolver/typeName :portkey.aws.appsync.resolver/fieldName :portkey.aws.appsync.resolver/dataSourceName :portkey.aws.appsync.resolver/resolverArn :portkey.aws.appsync.resolver/requestMappingTemplate :portkey.aws.appsync.resolver/responseMappingTemplate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/api-id (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/type-name (clojure.spec.alpha/and :portkey.aws.appsync/resource-name))
(clojure.spec.alpha/def :portkey.aws.appsync.get-type-request/format (clojure.spec.alpha/and :portkey.aws.appsync/type-definition-format))
(clojure.spec.alpha/def :portkey.aws.appsync/get-type-request (portkey.aws/json-keys :req-un [:portkey.aws.appsync.get-type-request/apiId :portkey.aws.appsync.get-type-request/typeName :portkey.aws.appsync.get-type-request/format] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-response/status (clojure.spec.alpha/and :portkey.aws.appsync/schema-status))
(clojure.spec.alpha/def :portkey.aws.appsync.get-schema-creation-status-response/details (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/get-schema-creation-status-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.get-schema-creation-status-response/status :portkey.aws.appsync.get-schema-creation-status-response/details] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-data-source-response/data-source (clojure.spec.alpha/and :portkey.aws.appsync/data-source))
(clojure.spec.alpha/def :portkey.aws.appsync/get-data-source-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.get-data-source-response/dataSource] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/update-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.update-type-response/type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.get-type-response/type (clojure.spec.alpha/and :portkey.aws.appsync/type))
(clojure.spec.alpha/def :portkey.aws.appsync/get-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.get-type-response/type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/table-name (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.dynamodb-data-source-config/use-caller-credentials (clojure.spec.alpha/and :portkey.aws.appsync/boolean))
(clojure.spec.alpha/def :portkey.aws.appsync/dynamodb-data-source-config (portkey.aws/json-keys :req-un [:portkey.aws.appsync.dynamodb-data-source-config/tableName :portkey.aws.appsync.dynamodb-data-source-config/awsRegion] :opt-un [:portkey.aws.appsync.dynamodb-data-source-config/useCallerCredentials] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.elasticsearch-data-source-config/endpoint (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync.elasticsearch-data-source-config/aws-region (clojure.spec.alpha/and :portkey.aws.appsync/string))
(clojure.spec.alpha/def :portkey.aws.appsync/elasticsearch-data-source-config (portkey.aws/json-keys :req-un [:portkey.aws.appsync.elasticsearch-data-source-config/endpoint :portkey.aws.appsync.elasticsearch-data-source-config/awsRegion] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync.update-graphql-api-response/graphql-api (clojure.spec.alpha/and :portkey.aws.appsync/graphql-api))
(clojure.spec.alpha/def :portkey.aws.appsync/update-graphql-api-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.appsync.update-graphql-api-response/graphqlApi] :locations {}))

(clojure.spec.alpha/def :portkey.aws.appsync/boolean clojure.core/boolean?)

(clojure.core/defn start-schema-creation "Adds a new schema to your GraphQL API.\n This operation is asynchronous. Use to determine when it has completed." ([start-schema-creation-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/schemacreation" start-schema-creation-request :portkey.aws.appsync/start-schema-creation-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {}} nil :portkey.aws.appsync/start-schema-creation-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef start-schema-creation :args (clojure.spec.alpha/tuple :portkey.aws.appsync/start-schema-creation-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/start-schema-creation-response))

(clojure.core/defn get-type "Retrieves a Type object." ([get-type-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/types/{typeName}" get-type-request :portkey.aws.appsync/get-type-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "typeName" "typeName"}, :querystring {"format" "format"}} nil :portkey.aws.appsync/get-type-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef get-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-type-response))

(clojure.core/defn delete-resolver "Deletes a Resolver object." ([delete-resolver-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "DELETE" "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}" delete-resolver-request :portkey.aws.appsync/delete-resolver-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "typeName" "typeName", "fieldName" "fieldName"}, :querystring {}} nil :portkey.aws.appsync/delete-resolver-response {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-resolver-response))

(clojure.core/defn get-introspection-schema "Retrieves the introspection schema for a GraphQL API." ([get-introspection-schema-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/schema" get-introspection-schema-request :portkey.aws.appsync/get-introspection-schema-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {"format" "format"}} nil :portkey.aws.appsync/get-introspection-schema-response {"GraphQLSchemaException" :portkey.aws.appsync/graphqlschema-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef get-introspection-schema :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-introspection-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-introspection-schema-response))

(clojure.core/defn create-graphql-api "Creates a GraphqlApi object." ([create-graphql-api-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis" create-graphql-api-request :portkey.aws.appsync/create-graphql-api-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.appsync/create-graphql-api-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiLimitExceededException" :portkey.aws.appsync/api-limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-graphql-api-response))

(clojure.core/defn list-data-sources "Lists the data sources for a given API." ([list-data-sources-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/datasources" list-data-sources-request :portkey.aws.appsync/list-data-sources-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.appsync/list-data-sources-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef list-data-sources :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-data-sources-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-data-sources-response))

(clojure.core/defn create-api-key "Creates a unique key that you can distribute to clients who are executing your\nAPI." ([create-api-key-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/apikeys" create-api-key-request :portkey.aws.appsync/create-api-key-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {}} nil :portkey.aws.appsync/create-api-key-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiKeyLimitExceededException" :portkey.aws.appsync/api-key-limit-exceeded-exception, "ApiKeyValidityOutOfBoundsException" :portkey.aws.appsync/api-key-validity-out-of-bounds-exception})))
(clojure.spec.alpha/fdef create-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-api-key-response))

(clojure.core/defn delete-api-key "Deletes an API key." ([delete-api-key-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "DELETE" "/v1/apis/{apiId}/apikeys/{id}" delete-api-key-request :portkey.aws.appsync/delete-api-key-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "id" "id"}, :querystring {}} nil :portkey.aws.appsync/delete-api-key-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-api-key-response))

(clojure.core/defn get-resolver "Retrieves a Resolver object." ([get-resolver-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}" get-resolver-request :portkey.aws.appsync/get-resolver-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "typeName" "typeName", "fieldName" "fieldName"}, :querystring {}} nil :portkey.aws.appsync/get-resolver-response {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception})))
(clojure.spec.alpha/fdef get-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-resolver-response))

(clojure.core/defn update-data-source "Updates a DataSource object." ([update-data-source-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/datasources/{name}" update-data-source-request :portkey.aws.appsync/update-data-source-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "name" "name"}, :querystring {}} nil :portkey.aws.appsync/update-data-source-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef update-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-data-source-response))

(clojure.core/defn update-api-key "Updates an API key." ([update-api-key-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/apikeys/{id}" update-api-key-request :portkey.aws.appsync/update-api-key-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "id" "id"}, :querystring {}} nil :portkey.aws.appsync/update-api-key-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "LimitExceededException" :portkey.aws.appsync/limit-exceeded-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception, "ApiKeyValidityOutOfBoundsException" :portkey.aws.appsync/api-key-validity-out-of-bounds-exception})))
(clojure.spec.alpha/fdef update-api-key :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-api-key-response))

(clojure.core/defn create-resolver "Creates a Resolver object.\n A resolver converts incoming requests into a format that a data source can\nunderstand and converts the data source's responses into GraphQL." ([create-resolver-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/types/{typeName}/resolvers" create-resolver-request :portkey.aws.appsync/create-resolver-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "typeName" "typeName"}, :querystring {}} nil :portkey.aws.appsync/create-resolver-response {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef create-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-resolver-response))

(clojure.core/defn delete-type "Deletes a Type object." ([delete-type-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "DELETE" "/v1/apis/{apiId}/types/{typeName}" delete-type-request :portkey.aws.appsync/delete-type-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "typeName" "typeName"}, :querystring {}} nil :portkey.aws.appsync/delete-type-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-type-response))

(clojure.core/defn get-schema-creation-status "Retrieves the current status of a schema creation operation." ([get-schema-creation-status-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/schemacreation" get-schema-creation-status-request :portkey.aws.appsync/get-schema-creation-status-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {}} nil :portkey.aws.appsync/get-schema-creation-status-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef get-schema-creation-status :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-schema-creation-status-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-schema-creation-status-response))

(clojure.core/defn update-resolver "Updates a Resolver object." ([update-resolver-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/types/{typeName}/resolvers/{fieldName}" update-resolver-request :portkey.aws.appsync/update-resolver-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "typeName" "typeName", "fieldName" "fieldName"}, :querystring {}} nil :portkey.aws.appsync/update-resolver-response {"ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef update-resolver :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-resolver-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-resolver-response))

(clojure.core/defn list-graphql-apis "Lists your GraphQL APIs." ([] (list-graphql-apis {})) ([list-graphql-apis-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis" list-graphql-apis-request :portkey.aws.appsync/list-graphql-apis-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.appsync/list-graphql-apis-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef list-graphql-apis :args (clojure.spec.alpha/? :portkey.aws.appsync/list-graphql-apis-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-graphql-apis-response))

(clojure.core/defn list-api-keys "Lists the API keys for a given API." ([list-api-keys-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/apikeys" list-api-keys-request :portkey.aws.appsync/list-api-keys-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.appsync/list-api-keys-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef list-api-keys :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-api-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-api-keys-response))

(clojure.core/defn update-graphql-api "Updates a GraphqlApi object." ([update-graphql-api-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}" update-graphql-api-request :portkey.aws.appsync/update-graphql-api-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {}} nil :portkey.aws.appsync/update-graphql-api-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef update-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-graphql-api-response))

(clojure.core/defn update-type "Updates a Type object." ([update-type-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/types/{typeName}" update-type-request :portkey.aws.appsync/update-type-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "typeName" "typeName"}, :querystring {}} nil :portkey.aws.appsync/update-type-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef update-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/update-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/update-type-response))

(clojure.core/defn get-data-source "Retrieves a DataSource object." ([get-data-source-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/datasources/{name}" get-data-source-request :portkey.aws.appsync/get-data-source-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "name" "name"}, :querystring {}} nil :portkey.aws.appsync/get-data-source-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef get-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-data-source-response))

(clojure.core/defn get-graphql-api "Retrieves a GraphqlApi object." ([get-graphql-api-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}" get-graphql-api-request :portkey.aws.appsync/get-graphql-api-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {}} nil :portkey.aws.appsync/get-graphql-api-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef get-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/get-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/get-graphql-api-response))

(clojure.core/defn create-data-source "Creates a DataSource object." ([create-data-source-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/datasources" create-data-source-request :portkey.aws.appsync/create-data-source-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {}} nil :portkey.aws.appsync/create-data-source-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef create-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-data-source-response))

(clojure.core/defn create-type "Creates a Type object." ([create-type-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "POST" "/v1/apis/{apiId}/types" create-type-request :portkey.aws.appsync/create-type-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {}} nil :portkey.aws.appsync/create-type-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef create-type :args (clojure.spec.alpha/tuple :portkey.aws.appsync/create-type-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/create-type-response))

(clojure.core/defn delete-graphql-api "Deletes a GraphqlApi object." ([delete-graphql-api-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "DELETE" "/v1/apis/{apiId}" delete-graphql-api-request :portkey.aws.appsync/delete-graphql-api-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {}} nil :portkey.aws.appsync/delete-graphql-api-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-graphql-api :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-graphql-api-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-graphql-api-response))

(clojure.core/defn list-resolvers "Lists the resolvers for a given API and type." ([list-resolvers-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/types/{typeName}/resolvers" list-resolvers-request :portkey.aws.appsync/list-resolvers-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "typeName" "typeName"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.appsync/list-resolvers-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef list-resolvers :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-resolvers-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-resolvers-response))

(clojure.core/defn delete-data-source "Deletes a DataSource object." ([delete-data-source-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "DELETE" "/v1/apis/{apiId}/datasources/{name}" delete-data-source-request :portkey.aws.appsync/delete-data-source-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId", "name" "name"}, :querystring {}} nil :portkey.aws.appsync/delete-data-source-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-data-source :args (clojure.spec.alpha/tuple :portkey.aws.appsync/delete-data-source-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/delete-data-source-response))

(clojure.core/defn list-types "Lists the types for a given API." ([list-types-request] (portkey.aws/-rest-json-call portkey.aws.appsync/endpoints "GET" "/v1/apis/{apiId}/types" list-types-request :portkey.aws.appsync/list-types-request {:payload nil, :move {}, :headers {}, :uri {"apiId" "apiId"}, :querystring {"format" "format", "nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.appsync/list-types-response {"BadRequestException" :portkey.aws.appsync/bad-request-exception, "ConcurrentModificationException" :portkey.aws.appsync/concurrent-modification-exception, "NotFoundException" :portkey.aws.appsync/not-found-exception, "UnauthorizedException" :portkey.aws.appsync/unauthorized-exception, "InternalFailureException" :portkey.aws.appsync/internal-failure-exception})))
(clojure.spec.alpha/fdef list-types :args (clojure.spec.alpha/tuple :portkey.aws.appsync/list-types-request) :ret (clojure.spec.alpha/and :portkey.aws.appsync/list-types-response))
