(ns portkey.aws.apigateway (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "apigateway", :region "ap-northeast-1"},
    :ssl-common-name "apigateway.ap-northeast-1.amazonaws.com",
    :endpoint "https://apigateway.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "apigateway", :region "eu-west-1"},
    :ssl-common-name "apigateway.eu-west-1.amazonaws.com",
    :endpoint "https://apigateway.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "apigateway", :region "us-east-2"},
    :ssl-common-name "apigateway.us-east-2.amazonaws.com",
    :endpoint "https://apigateway.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "apigateway", :region "ap-southeast-2"},
    :ssl-common-name "apigateway.ap-southeast-2.amazonaws.com",
    :endpoint "https://apigateway.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "apigateway", :region "cn-north-1"},
    :ssl-common-name "apigateway.cn-north-1.amazonaws.com.cn",
    :endpoint "https://apigateway.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "apigateway", :region "sa-east-1"},
    :ssl-common-name "apigateway.sa-east-1.amazonaws.com",
    :endpoint "https://apigateway.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "apigateway", :region "ap-southeast-1"},
    :ssl-common-name "apigateway.ap-southeast-1.amazonaws.com",
    :endpoint "https://apigateway.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "apigateway", :region "ap-northeast-2"},
    :ssl-common-name "apigateway.ap-northeast-2.amazonaws.com",
    :endpoint "https://apigateway.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "apigateway", :region "eu-west-3"},
    :ssl-common-name "apigateway.eu-west-3.amazonaws.com",
    :endpoint "https://apigateway.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "apigateway", :region "ca-central-1"},
    :ssl-common-name "apigateway.ca-central-1.amazonaws.com",
    :endpoint "https://apigateway.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "apigateway", :region "eu-central-1"},
    :ssl-common-name "apigateway.eu-central-1.amazonaws.com",
    :endpoint "https://apigateway.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "apigateway", :region "eu-west-2"},
    :ssl-common-name "apigateway.eu-west-2.amazonaws.com",
    :endpoint "https://apigateway.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "apigateway", :region "us-gov-west-1"},
    :ssl-common-name "apigateway.us-gov-west-1.amazonaws.com",
    :endpoint "https://apigateway.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "apigateway", :region "us-west-2"},
    :ssl-common-name "apigateway.us-west-2.amazonaws.com",
    :endpoint "https://apigateway.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "apigateway", :region "us-east-1"},
    :ssl-common-name "apigateway.us-east-1.amazonaws.com",
    :endpoint "https://apigateway.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "apigateway", :region "us-west-1"},
    :ssl-common-name "apigateway.us-west-1.amazonaws.com",
    :endpoint "https://apigateway.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "apigateway", :region "ap-south-1"},
    :ssl-common-name "apigateway.ap-south-1.amazonaws.com",
    :endpoint "https://apigateway.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.apigateway.create-resource-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-resource-request/parent-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-resource-request/path-part (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-resource-request/restApiId :portkey.aws.apigateway.create-resource-request/parentId :portkey.aws.apigateway.create-resource-request/pathPart] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/documentation-part-location-status-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^([1-5]\d\d|\*|\s*)$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.apigateway.put-rest-api-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-rest-api-request/mode (clojure.spec.alpha/and :portkey.aws.apigateway/put-mode))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-rest-api-request/fail-on-warnings (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-rest-api-request/parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-rest-api-request/body (clojure.spec.alpha/and :portkey.aws.apigateway/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway/put-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.put-rest-api-request/restApiId :portkey.aws.apigateway.put-rest-api-request/body] :opt-un [:portkey.aws.apigateway.put-rest-api-request/mode :portkey.aws.apigateway.put-rest-api-request/failOnWarnings :portkey.aws.apigateway.put-rest-api-request/parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-stages-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-stages-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-stages-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-stages-request/restApiId] :opt-un [:portkey.aws.apigateway.get-stages-request/deploymentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/api-key-source (clojure.spec.alpha/and :portkey.aws.apigateway/api-key-source-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/created-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/binary-media-types (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/endpoint-configuration (clojure.spec.alpha/and :portkey.aws.apigateway/endpoint-configuration))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/policy (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/minimum-compression-size (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/warnings (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-api/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/rest-api (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.rest-api/apiKeySource :portkey.aws.apigateway.rest-api/createdDate :portkey.aws.apigateway.rest-api/id :portkey.aws.apigateway.rest-api/name :portkey.aws.apigateway.rest-api/binaryMediaTypes :portkey.aws.apigateway.rest-api/endpointConfiguration :portkey.aws.apigateway.rest-api/policy :portkey.aws.apigateway.rest-api/version :portkey.aws.apigateway.rest-api/minimumCompressionSize :portkey.aws.apigateway.rest-api/warnings :portkey.aws.apigateway.rest-api/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-domain-name-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-domain-name-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-domain-name-request/domainName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-resource-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-resource-request/restApiId :portkey.aws.apigateway.delete-resource-request/resourceId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-usage-plan-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-usage-plan-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-usage-plan-request/usagePlanId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.unauthorized-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-vpc-link-request/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-vpc-link-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-vpc-link-request/target-arns (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-vpc-link-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-vpc-link-request/name :portkey.aws.apigateway.create-vpc-link-request/targetArns] :opt-un [:portkey.aws.apigateway.create-vpc-link-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-documentation-part (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/documentation-part) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-resources-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-resources-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-resources-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-resources-request/embed (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-resources-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-resources-request/restApiId] :opt-un [:portkey.aws.apigateway.get-resources-request/position :portkey.aws.apigateway.get-resources-request/limit :portkey.aws.apigateway.get-resources-request/embed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.api-key-ids/ids (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key-ids/warnings (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/api-key-ids (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.api-key-ids/ids :portkey.aws.apigateway.api-key-ids/warnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-request/headers (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-header-values))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-request/path-with-query-string (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-request/body (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-request/stage-variables (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-request/additional-context (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/test-invoke-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.test-invoke-authorizer-request/restApiId :portkey.aws.apigateway.test-invoke-authorizer-request/authorizerId] :opt-un [:portkey.aws.apigateway.test-invoke-authorizer-request/headers :portkey.aws.apigateway.test-invoke-authorizer-request/pathWithQueryString :portkey.aws.apigateway.test-invoke-authorizer-request/body :portkey.aws.apigateway.test-invoke-authorizer-request/stageVariables :portkey.aws.apigateway.test-invoke-authorizer-request/additionalContext] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-request/path-with-query-string (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-request/body (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-request/headers (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-header-values))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-request/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-request/stage-variables (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/test-invoke-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.test-invoke-method-request/restApiId :portkey.aws.apigateway.test-invoke-method-request/resourceId :portkey.aws.apigateway.test-invoke-method-request/httpMethod] :opt-un [:portkey.aws.apigateway.test-invoke-method-request/pathWithQueryString :portkey.aws.apigateway.test-invoke-method-request/body :portkey.aws.apigateway.test-invoke-method-request/headers :portkey.aws.apigateway.test-invoke-method-request/clientCertificateId :portkey.aws.apigateway.test-invoke-method-request/stageVariables] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-method-snapshot (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/method-snapshot))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-sdk-type-request/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-sdk-type-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-sdk-type-request/id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.deployment/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.deployment/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.deployment/created-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.deployment/api-summary (clojure.spec.alpha/and :portkey.aws.apigateway/path-to-map-of-method-snapshot))
(clojure.spec.alpha/def :portkey.aws.apigateway/deployment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.deployment/id :portkey.aws.apigateway.deployment/description :portkey.aws.apigateway.deployment/createdDate :portkey.aws.apigateway.deployment/apiSummary] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/gateway-response-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:integration-timeout "INTEGRATION_TIMEOUT", :default-4xx "DEFAULT_4XX", "REQUEST_TOO_LARGE" "REQUEST_TOO_LARGE", :unauthorized "UNAUTHORIZED", "INTEGRATION_TIMEOUT" "INTEGRATION_TIMEOUT", "RESOURCE_NOT_FOUND" "RESOURCE_NOT_FOUND", :invalid-api-key "INVALID_API_KEY", :integration-failure "INTEGRATION_FAILURE", "AUTHORIZER_CONFIGURATION_ERROR" "AUTHORIZER_CONFIGURATION_ERROR", "INTEGRATION_FAILURE" "INTEGRATION_FAILURE", "DEFAULT_5XX" "DEFAULT_5XX", "UNAUTHORIZED" "UNAUTHORIZED", :quota-exceeded "QUOTA_EXCEEDED", :invalid-signature "INVALID_SIGNATURE", :expired-token "EXPIRED_TOKEN", :bad-request-parameters "BAD_REQUEST_PARAMETERS", "AUTHORIZER_FAILURE" "AUTHORIZER_FAILURE", :unsupported-media-type "UNSUPPORTED_MEDIA_TYPE", "INVALID_API_KEY" "INVALID_API_KEY", "ACCESS_DENIED" "ACCESS_DENIED", "API_CONFIGURATION_ERROR" "API_CONFIGURATION_ERROR", "DEFAULT_4XX" "DEFAULT_4XX", "INVALID_SIGNATURE" "INVALID_SIGNATURE", :bad-request-body "BAD_REQUEST_BODY", :api-configuration-error "API_CONFIGURATION_ERROR", "EXPIRED_TOKEN" "EXPIRED_TOKEN", "UNSUPPORTED_MEDIA_TYPE" "UNSUPPORTED_MEDIA_TYPE", :authorizer-configuration-error "AUTHORIZER_CONFIGURATION_ERROR", :default-5xx "DEFAULT_5XX", :request-too-large "REQUEST_TOO_LARGE", :authorizer-failure "AUTHORIZER_FAILURE", :throttled "THROTTLED", "QUOTA_EXCEEDED" "QUOTA_EXCEEDED", "BAD_REQUEST_PARAMETERS" "BAD_REQUEST_PARAMETERS", "MISSING_AUTHENTICATION_TOKEN" "MISSING_AUTHENTICATION_TOKEN", :missing-authentication-token "MISSING_AUTHENTICATION_TOKEN", "BAD_REQUEST_BODY" "BAD_REQUEST_BODY", :resource-not-found "RESOURCE_NOT_FOUND", :access-denied "ACCESS_DENIED", "THROTTLED" "THROTTLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-client-certificate (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/client-certificate) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-sdk-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-sdk-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-sdk-request/sdk-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-sdk-request/parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-sdk-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-sdk-request/restApiId :portkey.aws.apigateway.get-sdk-request/stageName :portkey.aws.apigateway.get-sdk-request/sdkType] :opt-un [:portkey.aws.apigateway.get-sdk-request/parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.bad-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-stage-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-stage-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-stage-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-stage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-stage-request/restApiId :portkey.aws.apigateway.update-stage-request/stageName] :opt-un [:portkey.aws.apigateway.update-stage-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-method-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-method-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-method-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-method-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-method-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-method-response-request/restApiId :portkey.aws.apigateway.get-method-response-request/resourceId :portkey.aws.apigateway.get-method-response-request/httpMethod :portkey.aws.apigateway.get-method-response-request/statusCode] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-response/client-status (clojure.spec.alpha/and :portkey.aws.apigateway/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-response/log (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-response/latency (clojure.spec.alpha/and :portkey.aws.apigateway/long))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-response/principal-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-response/policy (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-response/authorization (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-list))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-authorizer-response/claims (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/test-invoke-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.test-invoke-authorizer-response/clientStatus :portkey.aws.apigateway.test-invoke-authorizer-response/log :portkey.aws.apigateway.test-invoke-authorizer-response/latency :portkey.aws.apigateway.test-invoke-authorizer-response/principalId :portkey.aws.apigateway.test-invoke-authorizer-response/policy :portkey.aws.apigateway.test-invoke-authorizer-response/authorization :portkey.aws.apigateway.test-invoke-authorizer-response/claims] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-stage-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-stage-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-stage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-stage-request/restApiId :portkey.aws.apigateway.delete-stage-request/stageName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/logging-level (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/metrics-enabled (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/caching-enabled (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/throttling-rate-limit (clojure.spec.alpha/and :portkey.aws.apigateway/double))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/cache-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.apigateway/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/unauthorized-cache-control-header-strategy (clojure.spec.alpha/and :portkey.aws.apigateway/unauthorized-cache-control-header-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/cache-data-encrypted (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/throttling-burst-limit (clojure.spec.alpha/and :portkey.aws.apigateway/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/require-authorization-for-cache-control (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-setting/data-trace-enabled (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/method-setting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.method-setting/loggingLevel :portkey.aws.apigateway.method-setting/metricsEnabled :portkey.aws.apigateway.method-setting/cachingEnabled :portkey.aws.apigateway.method-setting/throttlingRateLimit :portkey.aws.apigateway.method-setting/cacheTtlInSeconds :portkey.aws.apigateway.method-setting/unauthorizedCacheControlHeaderStrategy :portkey.aws.apigateway.method-setting/cacheDataEncrypted :portkey.aws.apigateway.method-setting/throttlingBurstLimit :portkey.aws.apigateway.method-setting/requireAuthorizationForCacheControl :portkey.aws.apigateway.method-setting/dataTraceEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-documentation-part-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-documentation-part-request/documentation-part-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-documentation-part-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-documentation-part-request/restApiId :portkey.aws.apigateway.delete-documentation-part-request/documentationPartId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/status-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[1-5]\d\d" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.apigateway.api-stage/api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-stage/stage (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/api-stage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.api-stage/apiId :portkey.aws.apigateway.api-stage/stage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-integration-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-integration-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-integration-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-integration-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-integration-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-integration-response-request/restApiId :portkey.aws.apigateway.get-integration-response-request/resourceId :portkey.aws.apigateway.get-integration-response-request/httpMethod :portkey.aws.apigateway.get-integration-response-request/statusCode] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-method (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/method))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-vpc-link (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/vpc-link) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-header-values (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/string))

(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part/location (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part-location))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part/properties (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/documentation-part (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.documentation-part/id :portkey.aws.apigateway.documentation-part/location :portkey.aws.apigateway.documentation-part/properties] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-string-to-list (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/list-of-string))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-resource-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-resource-request/embed (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-resource-request/restApiId :portkey.aws.apigateway.get-resource-request/resourceId] :opt-un [:portkey.aws.apigateway.get-resource-request/embed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-request/start-date (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-request/end-date (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-usage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-usage-request/usagePlanId :portkey.aws.apigateway.get-usage-request/startDate :portkey.aws.apigateway.get-usage-request/endDate] :opt-un [:portkey.aws.apigateway.get-usage-request/keyId :portkey.aws.apigateway.get-usage-request/position :portkey.aws.apigateway.get-usage-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.method-snapshot/authorization-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-snapshot/api-key-required (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/method-snapshot (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.method-snapshot/authorizationType :portkey.aws.apigateway.method-snapshot/apiKeyRequired] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-base-path-mapping-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-base-path-mapping-request/base-path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-base-path-mapping-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-base-path-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-base-path-mapping-request/domainName :portkey.aws.apigateway.update-base-path-mapping-request/basePath] :opt-un [:portkey.aws.apigateway.update-base-path-mapping-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-model (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/model) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-sdk-types-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-sdk-types-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-sdk-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.get-sdk-types-request/position :portkey.aws.apigateway.get-sdk-types-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.import-documentation-parts-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.import-documentation-parts-request/mode (clojure.spec.alpha/and :portkey.aws.apigateway/put-mode))
(clojure.spec.alpha/def :portkey.aws.apigateway.import-documentation-parts-request/fail-on-warnings (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.import-documentation-parts-request/body (clojure.spec.alpha/and :portkey.aws.apigateway/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway/import-documentation-parts-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.import-documentation-parts-request/restApiId :portkey.aws.apigateway.import-documentation-parts-request/body] :opt-un [:portkey.aws.apigateway.import-documentation-parts-request/mode :portkey.aws.apigateway.import-documentation-parts-request/failOnWarnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.generate-client-certificate-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/generate-client-certificate-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.generate-client-certificate-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/endpoint-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"REGIONAL" "REGIONAL", :regional "REGIONAL", "EDGE" "EDGE", :edge "EDGE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.rest-apis/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.rest-apis/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-rest-api))
(clojure.spec.alpha/def :portkey.aws.apigateway/rest-apis (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.rest-apis/position :portkey.aws.apigateway.rest-apis/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-sdk-configuration-property (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/sdk-configuration-property) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-client-certificate-request/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-client-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-client-certificate-request/clientCertificateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.base-path-mappings/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.base-path-mappings/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-base-path-mapping))
(clojure.spec.alpha/def :portkey.aws.apigateway/base-path-mappings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.base-path-mappings/position :portkey.aws.apigateway.base-path-mappings/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-deployment-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-deployment-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-deployment-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-deployment-request/restApiId :portkey.aws.apigateway.update-deployment-request/deploymentId] :opt-un [:portkey.aws.apigateway.update-deployment-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-versions/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-versions/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-documentation-version))
(clojure.spec.alpha/def :portkey.aws.apigateway/documentation-versions (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.documentation-versions/position :portkey.aws.apigateway.documentation-versions/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-string (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/connection-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/uri (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/integration-http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/connection-type (clojure.spec.alpha/and :portkey.aws.apigateway/connection-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/request-templates (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/cache-namespace (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/passthrough-behavior (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/type (clojure.spec.alpha/and :portkey.aws.apigateway/integration-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/content-handling (clojure.spec.alpha/and :portkey.aws.apigateway/content-handling-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/cache-key-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/credentials (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-request/timeout-in-millis (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/put-integration-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.put-integration-request/restApiId :portkey.aws.apigateway.put-integration-request/resourceId :portkey.aws.apigateway.put-integration-request/httpMethod :portkey.aws.apigateway.put-integration-request/type] :opt-un [:portkey.aws.apigateway.put-integration-request/connectionId :portkey.aws.apigateway.put-integration-request/uri :portkey.aws.apigateway.put-integration-request/integrationHttpMethod :portkey.aws.apigateway.put-integration-request/connectionType :portkey.aws.apigateway.put-integration-request/requestTemplates :portkey.aws.apigateway.put-integration-request/requestParameters :portkey.aws.apigateway.put-integration-request/cacheNamespace :portkey.aws.apigateway.put-integration-request/passthroughBehavior :portkey.aws.apigateway.put-integration-request/contentHandling :portkey.aws.apigateway.put-integration-request/cacheKeyParameters :portkey.aws.apigateway.put-integration-request/credentials :portkey.aws.apigateway.put-integration-request/timeoutInMillis] :locations {"httpMethod" "integrationHttpMethod"}))

(clojure.spec.alpha/def :portkey.aws.apigateway/documentation-part-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:response "RESPONSE", "PATH_PARAMETER" "PATH_PARAMETER", :api "API", :response-header "RESPONSE_HEADER", :method "METHOD", "API" "API", "REQUEST_HEADER" "REQUEST_HEADER", :path-parameter "PATH_PARAMETER", "METHOD" "METHOD", :request-body "REQUEST_BODY", :resource "RESOURCE", :request-header "REQUEST_HEADER", "RESOURCE" "RESOURCE", :response-body "RESPONSE_BODY", :query-parameter "QUERY_PARAMETER", "RESPONSE_HEADER" "RESPONSE_HEADER", :authorizer "AUTHORIZER", "REQUEST_BODY" "REQUEST_BODY", "QUERY_PARAMETER" "QUERY_PARAMETER", "AUTHORIZER" "AUTHORIZER", "MODEL" "MODEL", "RESPONSE" "RESPONSE", "RESPONSE_BODY" "RESPONSE_BODY", :model "MODEL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-usage-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-usage-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-usage-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-usage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-usage-request/usagePlanId :portkey.aws.apigateway.update-usage-request/keyId] :opt-un [:portkey.aws.apigateway.update-usage-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-api-key-request/api-key (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-api-key-request/apiKey] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-part-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-part-request/documentation-part-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-documentation-part-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-documentation-part-request/restApiId :portkey.aws.apigateway.get-documentation-part-request/documentationPartId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.patch-operation/op (clojure.spec.alpha/and :portkey.aws.apigateway/op))
(clojure.spec.alpha/def :portkey.aws.apigateway.patch-operation/path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.patch-operation/value (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.patch-operation/from (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/patch-operation (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.patch-operation/op :portkey.aws.apigateway.patch-operation/path :portkey.aws.apigateway.patch-operation/value :portkey.aws.apigateway.patch-operation/from] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-base-path-mappings-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-base-path-mappings-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-base-path-mappings-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-base-path-mappings-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-base-path-mappings-request/domainName] :opt-un [:portkey.aws.apigateway.get-base-path-mappings-request/position :portkey.aws.apigateway.get-base-path-mappings-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/api-key-source (clojure.spec.alpha/and :portkey.aws.apigateway/api-key-source-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/clone-from (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/binary-media-types (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/endpoint-configuration (clojure.spec.alpha/and :portkey.aws.apigateway/endpoint-configuration))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/policy (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/minimum-compression-size (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-rest-api-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-rest-api-request/name] :opt-un [:portkey.aws.apigateway.create-rest-api-request/apiKeySource :portkey.aws.apigateway.create-rest-api-request/cloneFrom :portkey.aws.apigateway.create-rest-api-request/binaryMediaTypes :portkey.aws.apigateway.create-rest-api-request/endpointConfiguration :portkey.aws.apigateway.create-rest-api-request/policy :portkey.aws.apigateway.create-rest-api-request/version :portkey.aws.apigateway.create-rest-api-request/minimumCompressionSize :portkey.aws.apigateway.create-rest-api-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-response-request/selection-pattern (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-response-request/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-response-request/response-templates (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-integration-response-request/content-handling (clojure.spec.alpha/and :portkey.aws.apigateway/content-handling-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway/put-integration-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.put-integration-response-request/restApiId :portkey.aws.apigateway.put-integration-response-request/resourceId :portkey.aws.apigateway.put-integration-response-request/httpMethod :portkey.aws.apigateway.put-integration-response-request/statusCode] :opt-un [:portkey.aws.apigateway.put-integration-response-request/selectionPattern :portkey.aws.apigateway.put-integration-response-request/responseParameters :portkey.aws.apigateway.put-integration-response-request/responseTemplates :portkey.aws.apigateway.put-integration-response-request/contentHandling] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.stages/item (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-stage))
(clojure.spec.alpha/def :portkey.aws.apigateway/stages (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.stages/item] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-request-validator (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/request-validator) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-gateway-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-gateway-response-request/response-type (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-gateway-response-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-gateway-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-gateway-response-request/restApiId :portkey.aws.apigateway.update-gateway-response-request/responseType] :opt-un [:portkey.aws.apigateway.update-gateway-response-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-authorizer-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-authorizer-request/restApiId :portkey.aws.apigateway.get-authorizer-request/authorizerId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-rest-api (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/rest-api) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-usage-plan-key (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/usage-plan-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.tags/tags (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/tags (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.tags/tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.template/value (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/template (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.template/value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.limit-exceeded-exception/retryAfterSeconds :portkey.aws.apigateway.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-export-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-export-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-export-request/export-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-export-request/parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-export-request/accepts (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-export-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-export-request/restApiId :portkey.aws.apigateway.get-export-request/stageName :portkey.aws.apigateway.get-export-request/exportType] :opt-un [:portkey.aws.apigateway.get-export-request/parameters :portkey.aws.apigateway.get-export-request/accepts] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-client-certificate-request/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-client-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-client-certificate-request/clientCertificateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.method-response/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-response/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.method-response/response-models (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/method-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.method-response/statusCode :portkey.aws.apigateway.method-response/responseParameters :portkey.aws.apigateway.method-response/responseModels] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-deployment (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/deployment) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-model-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-model-request/model-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-model-request/flatten (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-model-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-model-request/restApiId :portkey.aws.apigateway.get-model-request/modelName] :opt-un [:portkey.aws.apigateway.get-model-request/flatten] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.request-validator/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.request-validator/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.request-validator/validate-request-body (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.request-validator/validate-request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/request-validator (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.request-validator/id :portkey.aws.apigateway.request-validator/name :portkey.aws.apigateway.request-validator/validateRequestBody :portkey.aws.apigateway.request-validator/validateRequestParameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-documentation-version-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-documentation-version-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-documentation-version-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-documentation-version-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-documentation-version-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-documentation-version-request/restApiId :portkey.aws.apigateway.create-documentation-version-request/documentationVersion] :opt-un [:portkey.aws.apigateway.create-documentation-version-request/stageName :portkey.aws.apigateway.create-documentation-version-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-request-validators-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-request-validators-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-request-validators-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-request-validators-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-request-validators-request/restApiId] :opt-un [:portkey.aws.apigateway.get-request-validators-request/position :portkey.aws.apigateway.get-request-validators-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-usage-plan-request/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-usage-plan-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-usage-plan-request/api-stages (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-api-stage))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-usage-plan-request/throttle (clojure.spec.alpha/and :portkey.aws.apigateway/throttle-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-usage-plan-request/quota (clojure.spec.alpha/and :portkey.aws.apigateway/quota-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-usage-plan-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-usage-plan-request/name] :opt-un [:portkey.aws.apigateway.create-usage-plan-request/description :portkey.aws.apigateway.create-usage-plan-request/apiStages :portkey.aws.apigateway.create-usage-plan-request/throttle :portkey.aws.apigateway.create-usage-plan-request/quota] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-type/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-type/friendly-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-type/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-type/configuration-properties (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-sdk-configuration-property))
(clojure.spec.alpha/def :portkey.aws.apigateway/sdk-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.sdk-type/id :portkey.aws.apigateway.sdk-type/friendlyName :portkey.aws.apigateway.sdk-type/description :portkey.aws.apigateway.sdk-type/configurationProperties] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plan-key-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plan-key-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-usage-plan-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-usage-plan-key-request/usagePlanId :portkey.aws.apigateway.get-usage-plan-key-request/keyId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/cache-cluster-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DELETE_IN_PROGRESS" "DELETE_IN_PROGRESS", "AVAILABLE" "AVAILABLE", :flush-in-progress "FLUSH_IN_PROGRESS", "CREATE_IN_PROGRESS" "CREATE_IN_PROGRESS", :delete-in-progress "DELETE_IN_PROGRESS", :create-in-progress "CREATE_IN_PROGRESS", "NOT_AVAILABLE" "NOT_AVAILABLE", "FLUSH_IN_PROGRESS" "FLUSH_IN_PROGRESS", :not-available "NOT_AVAILABLE", :available "AVAILABLE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.service-unavailable-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.service-unavailable-exception/retryAfterSeconds :portkey.aws.apigateway.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.client-certificates/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.client-certificates/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-client-certificate))
(clojure.spec.alpha/def :portkey.aws.apigateway/client-certificates (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.client-certificates/position :portkey.aws.apigateway.client-certificates/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.put-gateway-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-gateway-response-request/response-type (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-gateway-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-gateway-response-request/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-gateway-response-request/response-templates (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/put-gateway-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.put-gateway-response-request/restApiId :portkey.aws.apigateway.put-gateway-response-request/responseType] :opt-un [:portkey.aws.apigateway.put-gateway-response-request/statusCode :portkey.aws.apigateway.put-gateway-response-request/responseParameters :portkey.aws.apigateway.put-gateway-response-request/responseTemplates] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.flush-stage-cache-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.flush-stage-cache-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/flush-stage-cache-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.flush-stage-cache-request/restApiId :portkey.aws.apigateway.flush-stage-cache-request/stageName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-resource-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-resource-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-resource-request/restApiId :portkey.aws.apigateway.update-resource-request/resourceId] :opt-un [:portkey.aws.apigateway.update-resource-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-gateway-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/gateway-response) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-string-to-boolean (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/nullable-boolean))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-method-settings (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/method-setting))

(clojure.spec.alpha/def :portkey.aws.apigateway/quota-period-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DAY" "DAY", :day "DAY", "WEEK" "WEEK", :week "WEEK", "MONTH" "MONTH", :month "MONTH"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway/put-mode (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"merge" "merge", :merge "merge", "overwrite" "overwrite", :overwrite "overwrite"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.request-validators/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.request-validators/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-request-validator))
(clojure.spec.alpha/def :portkey.aws.apigateway/request-validators (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.request-validators/position :portkey.aws.apigateway.request-validators/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-method-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-method-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-method-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-method-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-method-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-method-response-request/restApiId :portkey.aws.apigateway.delete-method-response-request/resourceId :portkey.aws.apigateway.delete-method-response-request/httpMethod :portkey.aws.apigateway.delete-method-response-request/statusCode] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-method-request/restApiId :portkey.aws.apigateway.get-method-request/resourceId :portkey.aws.apigateway.get-method-request/httpMethod] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan-keys/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan-keys/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-usage-plan-key))
(clojure.spec.alpha/def :portkey.aws.apigateway/usage-plan-keys (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.usage-plan-keys/position :portkey.aws.apigateway.usage-plan-keys/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan/api-stages (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-api-stage))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan/throttle (clojure.spec.alpha/and :portkey.aws.apigateway/throttle-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan/quota (clojure.spec.alpha/and :portkey.aws.apigateway/quota-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan/product-code (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/usage-plan (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.usage-plan/id :portkey.aws.apigateway.usage-plan/name :portkey.aws.apigateway.usage-plan/description :portkey.aws.apigateway.usage-plan/apiStages :portkey.aws.apigateway.usage-plan/throttle :portkey.aws.apigateway.usage-plan/quota :portkey.aws.apigateway.usage-plan/productCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-long (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/long) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-model-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-model-request/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-model-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-model-request/schema (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-model-request/content-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-model-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-model-request/restApiId :portkey.aws.apigateway.create-model-request/name :portkey.aws.apigateway.create-model-request/contentType] :opt-un [:portkey.aws.apigateway.create-model-request/description :portkey.aws.apigateway.create-model-request/schema] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.too-many-requests-exception/retryAfterSeconds :portkey.aws.apigateway.too-many-requests-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.deployment-canary-settings/percent-traffic (clojure.spec.alpha/and :portkey.aws.apigateway/double))
(clojure.spec.alpha/def :portkey.aws.apigateway.deployment-canary-settings/stage-variable-overrides (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.deployment-canary-settings/use-stage-cache (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/deployment-canary-settings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.deployment-canary-settings/percentTraffic :portkey.aws.apigateway.deployment-canary-settings/stageVariableOverrides :portkey.aws.apigateway.deployment-canary-settings/useStageCache] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-rest-api-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-rest-api-request/restApiId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-account-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-account-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.update-account-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-rest-apis-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-rest-apis-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-rest-apis-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.get-rest-apis-request/position :portkey.aws.apigateway.get-rest-apis-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-model-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-model-request/model-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-model-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-model-request/restApiId :portkey.aws.apigateway.delete-model-request/modelName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/tag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.tag-resource-request/resourceArn :portkey.aws.apigateway.tag-resource-request/tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/api-key-source-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"HEADER" "HEADER", :header "HEADER", "AUTHORIZER" "AUTHORIZER", :authorizer "AUTHORIZER"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.throttle-settings/burst-limit (clojure.spec.alpha/and :portkey.aws.apigateway/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.throttle-settings/rate-limit (clojure.spec.alpha/and :portkey.aws.apigateway/double))
(clojure.spec.alpha/def :portkey.aws.apigateway/throttle-settings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.throttle-settings/burstLimit :portkey.aws.apigateway.throttle-settings/rateLimit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-sdk-type (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/sdk-type) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/cache-cluster-size (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"118" "118", "237" "237", "1.6" "1.6", :118 "118", "0.5" "0.5", :28.4 "28.4", :13.5 "13.5", "28.4" "28.4", "58.2" "58.2", :1.6 "1.6", "6.1" "6.1", :58.2 "58.2", :6.1 "6.1", :237 "237", :0.5 "0.5", "13.5" "13.5"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.gateway-response/response-type (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.gateway-response/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.gateway-response/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.gateway-response/response-templates (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.gateway-response/default-response (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/gateway-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.gateway-response/responseType :portkey.aws.apigateway.gateway-response/statusCode :portkey.aws.apigateway.gateway-response/responseParameters :portkey.aws.apigateway.gateway-response/responseTemplates :portkey.aws.apigateway.gateway-response/defaultResponse] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-model-template-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-model-template-request/model-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-model-template-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-model-template-request/restApiId :portkey.aws.apigateway.get-model-template-request/modelName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-integration-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-integration-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-integration-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-integration-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-integration-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-integration-response-request/restApiId :portkey.aws.apigateway.delete-integration-response-request/resourceId :portkey.aws.apigateway.delete-integration-response-request/httpMethod :portkey.aws.apigateway.delete-integration-response-request/statusCode] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/integration-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:aws "AWS", "AWS" "AWS", :aws-proxy "AWS_PROXY", "MOCK" "MOCK", "AWS_PROXY" "AWS_PROXY", "HTTP_PROXY" "HTTP_PROXY", :http "HTTP", :http-proxy "HTTP_PROXY", "HTTP" "HTTP", :mock "MOCK"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.base-path-mapping/base-path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.base-path-mapping/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.base-path-mapping/stage (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/base-path-mapping (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.base-path-mapping/basePath :portkey.aws.apigateway.base-path-mapping/restApiId :portkey.aws.apigateway.base-path-mapping/stage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-request-validator-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-request-validator-request/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-request-validator-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-request-validator-request/restApiId :portkey.aws.apigateway.get-request-validator-request/requestValidatorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-resource (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/resource) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/op (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:remove "remove", :copy "copy", "copy" "copy", :replace "replace", :move "move", "replace" "replace", "remove" "remove", "move" "move", "add" "add", :add "add", :test "test", "test" "test"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part-ids/ids (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part-ids/warnings (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/documentation-part-ids (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.documentation-part-ids/ids :portkey.aws.apigateway.documentation-part-ids/warnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-authorizers-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-authorizers-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-authorizers-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-authorizers-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-authorizers-request/restApiId] :opt-un [:portkey.aws.apigateway.get-authorizers-request/position :portkey.aws.apigateway.get-authorizers-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.model/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.model/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.model/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.model/schema (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.model/content-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/model (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.model/id :portkey.aws.apigateway.model/name :portkey.aws.apigateway.model/description :portkey.aws.apigateway.model/schema :portkey.aws.apigateway.model/contentType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-domain-name-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-domain-name-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-domain-name-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-domain-name-request/domainName] :opt-un [:portkey.aws.apigateway.update-domain-name-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-usage-plan-key-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-usage-plan-key-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-usage-plan-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-usage-plan-key-request/usagePlanId :portkey.aws.apigateway.delete-usage-plan-key-request/keyId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-base-path-mapping-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-base-path-mapping-request/base-path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-base-path-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-base-path-mapping-request/domainName :portkey.aws.apigateway.get-base-path-mapping-request/basePath] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/authorizer-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"TOKEN" "TOKEN", :token "TOKEN", "REQUEST" "REQUEST", :request "REQUEST", "COGNITO_USER_POOLS" "COGNITO_USER_POOLS", :cognito-user-pools "COGNITO_USER_POOLS"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-response-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-method-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-method-response-request/restApiId :portkey.aws.apigateway.update-method-response-request/resourceId :portkey.aws.apigateway.update-method-response-request/httpMethod :portkey.aws.apigateway.update-method-response-request/statusCode] :opt-un [:portkey.aws.apigateway.update-method-response-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-ofarns (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/providerarn) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-api-stage (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/api-stage) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.domain-names/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-names/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-domain-name))
(clojure.spec.alpha/def :portkey.aws.apigateway/domain-names (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.domain-names/position :portkey.aws.apigateway.domain-names/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-response-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-integration-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-integration-response-request/restApiId :portkey.aws.apigateway.update-integration-response-request/resourceId :portkey.aws.apigateway.update-integration-response-request/httpMethod :portkey.aws.apigateway.update-integration-response-request/statusCode] :opt-un [:portkey.aws.apigateway.update-integration-response-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-response-request/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-response-request/response-models (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/put-method-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.put-method-response-request/restApiId :portkey.aws.apigateway.put-method-response-request/resourceId :portkey.aws.apigateway.put-method-response-request/httpMethod :portkey.aws.apigateway.put-method-response-request/statusCode] :opt-un [:portkey.aws.apigateway.put-method-response-request/responseParameters :portkey.aws.apigateway.put-method-response-request/responseModels] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-domain-name-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-domain-name-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-domain-name-request/domainName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.account/cloudwatch-role-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.account/throttle-settings (clojure.spec.alpha/and :portkey.aws.apigateway/throttle-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.account/features (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.account/api-key-version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/account (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.account/cloudwatchRoleArn :portkey.aws.apigateway.account/throttleSettings :portkey.aws.apigateway.account/features :portkey.aws.apigateway.account/apiKeyVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-response/status (clojure.spec.alpha/and :portkey.aws.apigateway/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-response/body (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-response/headers (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-header-values))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-response/log (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.test-invoke-method-response/latency (clojure.spec.alpha/and :portkey.aws.apigateway/long))
(clojure.spec.alpha/def :portkey.aws.apigateway/test-invoke-method-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.test-invoke-method-response/status :portkey.aws.apigateway.test-invoke-method-response/body :portkey.aws.apigateway.test-invoke-method-response/headers :portkey.aws.apigateway.test-invoke-method-response/log :portkey.aws.apigateway.test-invoke-method-response/latency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-usage-plan-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-usage-plan-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-usage-plan-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-usage-plan-request/usagePlanId] :opt-un [:portkey.aws.apigateway.update-usage-plan-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-gateway-responses-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-gateway-responses-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-gateway-responses-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-gateway-responses-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-gateway-responses-request/restApiId] :opt-un [:portkey.aws.apigateway.get-gateway-responses-request/position :portkey.aws.apigateway.get-gateway-responses-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.method/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/authorization-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/operation-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/authorization-scopes (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/api-key-required (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/request-models (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/method-integration (clojure.spec.alpha/and :portkey.aws.apigateway/integration))
(clojure.spec.alpha/def :portkey.aws.apigateway.method/method-responses (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-method-response))
(clojure.spec.alpha/def :portkey.aws.apigateway/method (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.method/authorizerId :portkey.aws.apigateway.method/requestValidatorId :portkey.aws.apigateway.method/authorizationType :portkey.aws.apigateway.method/httpMethod :portkey.aws.apigateway.method/operationName :portkey.aws.apigateway.method/requestParameters :portkey.aws.apigateway.method/authorizationScopes :portkey.aws.apigateway.method/apiKeyRequired :portkey.aws.apigateway.method/requestModels :portkey.aws.apigateway.method/methodIntegration :portkey.aws.apigateway.method/methodResponses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-stage (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/stage) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-deployment-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-deployment-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-deployment-request/stage-description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-deployment-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-deployment-request/cache-cluster-enabled (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-deployment-request/cache-cluster-size (clojure.spec.alpha/and :portkey.aws.apigateway/cache-cluster-size))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-deployment-request/variables (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-deployment-request/canary-settings (clojure.spec.alpha/and :portkey.aws.apigateway/deployment-canary-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-deployment-request/restApiId] :opt-un [:portkey.aws.apigateway.create-deployment-request/stageName :portkey.aws.apigateway.create-deployment-request/stageDescription :portkey.aws.apigateway.create-deployment-request/description :portkey.aws.apigateway.create-deployment-request/cacheClusterEnabled :portkey.aws.apigateway.create-deployment-request/cacheClusterSize :portkey.aws.apigateway.create-deployment-request/variables :portkey.aws.apigateway.create-deployment-request/canarySettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-method-response (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/method-response))

(clojure.spec.alpha/def :portkey.aws.apigateway.canary-settings/percent-traffic (clojure.spec.alpha/and :portkey.aws.apigateway/double))
(clojure.spec.alpha/def :portkey.aws.apigateway.canary-settings/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.canary-settings/stage-variable-overrides (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.canary-settings/use-stage-cache (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/canary-settings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.canary-settings/percentTraffic :portkey.aws.apigateway.canary-settings/deploymentId :portkey.aws.apigateway.canary-settings/stageVariableOverrides :portkey.aws.apigateway.canary-settings/useStageCache] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.resources/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.resources/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-resource))
(clojure.spec.alpha/def :portkey.aws.apigateway/resources (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.resources/position :portkey.aws.apigateway.resources/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-vpc-link-request/vpc-link-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-vpc-link-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-vpc-link-request/vpcLinkId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-usage (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/list-of-long) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-request-validator-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-request-validator-request/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-request-validator-request/validate-request-body (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-request-validator-request/validate-request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-request-validator-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-request-validator-request/restApiId] :opt-un [:portkey.aws.apigateway.create-request-validator-request/name :portkey.aws.apigateway.create-request-validator-request/validateRequestBody :portkey.aws.apigateway.create-request-validator-request/validateRequestParameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-version-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-version-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-documentation-version-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-documentation-version-request/restApiId :portkey.aws.apigateway.get-documentation-version-request/documentationVersion] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.stage-key/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage-key/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/stage-key (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.stage-key/restApiId :portkey.aws.apigateway.stage-key/stageName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-api-keys-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-api-keys-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-api-keys-request/name-query (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-api-keys-request/customer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-api-keys-request/include-values (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-api-keys-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.get-api-keys-request/position :portkey.aws.apigateway.get-api-keys-request/limit :portkey.aws.apigateway.get-api-keys-request/nameQuery :portkey.aws.apigateway.get-api-keys-request/customerId :portkey.aws.apigateway.get-api-keys-request/includeValues] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plan-keys-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plan-keys-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plan-keys-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plan-keys-request/name-query (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-usage-plan-keys-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-usage-plan-keys-request/usagePlanId] :opt-un [:portkey.aws.apigateway.get-usage-plan-keys-request/position :portkey.aws.apigateway.get-usage-plan-keys-request/limit :portkey.aws.apigateway.get-usage-plan-keys-request/nameQuery] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-client-certificate-request/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-client-certificate-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-client-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-client-certificate-request/clientCertificateId] :opt-un [:portkey.aws.apigateway.update-client-certificate-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-api-key-request/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-api-key-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-api-key-request/enabled (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-api-key-request/generate-distinct-id (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-api-key-request/value (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-api-key-request/stage-keys (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-stage-keys))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-api-key-request/customer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-api-key-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.create-api-key-request/name :portkey.aws.apigateway.create-api-key-request/description :portkey.aws.apigateway.create-api-key-request/enabled :portkey.aws.apigateway.create-api-key-request/generateDistinctId :portkey.aws.apigateway.create-api-key-request/value :portkey.aws.apigateway.create-api-key-request/stageKeys :portkey.aws.apigateway.create-api-key-request/customerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-deployment-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-deployment-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-deployment-request/embed (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-deployment-request/restApiId :portkey.aws.apigateway.get-deployment-request/deploymentId] :opt-un [:portkey.aws.apigateway.get-deployment-request/embed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-types/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-types/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-sdk-type))
(clojure.spec.alpha/def :portkey.aws.apigateway/sdk-types (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.sdk-types/position :portkey.aws.apigateway.sdk-types/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.access-log-settings/format (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.access-log-settings/destination-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/access-log-settings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.access-log-settings/format :portkey.aws.apigateway.access-log-settings/destinationArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-documentation-version-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-documentation-version-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-documentation-version-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-documentation-version-request/restApiId :portkey.aws.apigateway.delete-documentation-version-request/documentationVersion] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-client-certificates-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-client-certificates-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-client-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.get-client-certificates-request/position :portkey.aws.apigateway.get-client-certificates-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.apigateway/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-base-path-mapping-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-base-path-mapping-request/base-path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-base-path-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-base-path-mapping-request/domainName :portkey.aws.apigateway.delete-base-path-mapping-request/basePath] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/vpc-link-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"AVAILABLE" "AVAILABLE", :available "AVAILABLE", "PENDING" "PENDING", :pending "PENDING", "DELETING" "DELETING", :deleting "DELETING", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.vpc-links/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.vpc-links/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-vpc-link))
(clojure.spec.alpha/def :portkey.aws.apigateway/vpc-links (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.vpc-links/position :portkey.aws.apigateway.vpc-links/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-documentation-version (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/documentation-version) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-model-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-model-request/model-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-model-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-model-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-model-request/restApiId :portkey.aws.apigateway.update-model-request/modelName] :opt-un [:portkey.aws.apigateway.update-model-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.quota-settings/limit (clojure.spec.alpha/and :portkey.aws.apigateway/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.quota-settings/offset (clojure.spec.alpha/and :portkey.aws.apigateway/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.quota-settings/period (clojure.spec.alpha/and :portkey.aws.apigateway/quota-period-type))
(clojure.spec.alpha/def :portkey.aws.apigateway/quota-settings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.quota-settings/limit :portkey.aws.apigateway.quota-settings/offset :portkey.aws.apigateway.quota-settings/period] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-documentation-version-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-documentation-version-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-documentation-version-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-documentation-version-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-documentation-version-request/restApiId :portkey.aws.apigateway.update-documentation-version-request/documentationVersion] :opt-un [:portkey.aws.apigateway.update-documentation-version-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-stage-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-stage-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-stage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-stage-request/restApiId :portkey.aws.apigateway.get-stage-request/stageName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/providerarn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.apigateway/path-to-map-of-method-snapshot (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/map-of-method-snapshot))

(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan-key/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan-key/type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan-key/value (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plan-key/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/usage-plan-key (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.usage-plan-key/id :portkey.aws.apigateway.usage-plan-key/type :portkey.aws.apigateway.usage-plan-key/value :portkey.aws.apigateway.usage-plan-key/name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-string-to-string (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/string))

(clojure.spec.alpha/def :portkey.aws.apigateway/connection-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"INTERNET" "INTERNET", :internet "INTERNET", "VPC_LINK" "VPC_LINK", :vpc-link "VPC_LINK"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/authorizer-credentials (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/identity-validation-expression (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/type (clojure.spec.alpha/and :portkey.aws.apigateway/authorizer-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/authorizer-result-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/authorizer-uri (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/auth-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/identity-source (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-authorizer-request/providerarns (clojure.spec.alpha/and :portkey.aws.apigateway/list-ofarns))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-authorizer-request/restApiId :portkey.aws.apigateway.create-authorizer-request/name :portkey.aws.apigateway.create-authorizer-request/type] :opt-un [:portkey.aws.apigateway.create-authorizer-request/authorizerCredentials :portkey.aws.apigateway.create-authorizer-request/identityValidationExpression :portkey.aws.apigateway.create-authorizer-request/authorizerResultTtlInSeconds :portkey.aws.apigateway.create-authorizer-request/authorizerUri :portkey.aws.apigateway.create-authorizer-request/authType :portkey.aws.apigateway.create-authorizer-request/identitySource :portkey.aws.apigateway.create-authorizer-request/providerARNs] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-gateway-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-gateway-response-request/response-type (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-gateway-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-gateway-response-request/restApiId :portkey.aws.apigateway.delete-gateway-response-request/responseType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-tags-request/resource-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-tags-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-tags-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-tags-request/resourceArn] :opt-un [:portkey.aws.apigateway.get-tags-request/position :portkey.aws.apigateway.get-tags-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-gateway-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-gateway-response-request/response-type (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-gateway-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-gateway-response-request/restApiId :portkey.aws.apigateway.get-gateway-response-request/responseType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-domain-names-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-domain-names-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-domain-names-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.get-domain-names-request/position :portkey.aws.apigateway.get-domain-names-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part-location/type (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part-location/path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part-location/method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part-location/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part-location-status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-part-location/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/documentation-part-location (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.documentation-part-location/type] :opt-un [:portkey.aws.apigateway.documentation-part-location/path :portkey.aws.apigateway.documentation-part-location/method :portkey.aws.apigateway.documentation-part-location/statusCode :portkey.aws.apigateway.documentation-part-location/name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-base-path-mapping-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-base-path-mapping-request/base-path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-base-path-mapping-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-base-path-mapping-request/stage (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-base-path-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-base-path-mapping-request/domainName :portkey.aws.apigateway.create-base-path-mapping-request/restApiId] :opt-un [:portkey.aws.apigateway.create-base-path-mapping-request/basePath :portkey.aws.apigateway.create-base-path-mapping-request/stage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.client-certificate/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.client-certificate/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.client-certificate/pem-encoded-certificate (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.client-certificate/created-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.client-certificate/expiration-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway/client-certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.client-certificate/clientCertificateId :portkey.aws.apigateway.client-certificate/description :portkey.aws.apigateway.client-certificate/pemEncodedCertificate :portkey.aws.apigateway.client-certificate/createdDate :portkey.aws.apigateway.client-certificate/expirationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.api-keys/warnings (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-keys/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-keys/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-api-key))
(clojure.spec.alpha/def :portkey.aws.apigateway/api-keys (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.api-keys/warnings :portkey.aws.apigateway.api-keys/position :portkey.aws.apigateway.api-keys/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plans/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage-plans/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-usage-plan))
(clojure.spec.alpha/def :portkey.aws.apigateway/usage-plans (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.usage-plans/position :portkey.aws.apigateway.usage-plans/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-key-usages (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/list-of-usage))

(clojure.spec.alpha/def :portkey.aws.apigateway/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-authorizer (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/authorizer) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/tags (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/canary-settings (clojure.spec.alpha/and :portkey.aws.apigateway/canary-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/variables (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/cache-cluster-enabled (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-stage-request/cache-cluster-size (clojure.spec.alpha/and :portkey.aws.apigateway/cache-cluster-size))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-stage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-stage-request/restApiId :portkey.aws.apigateway.create-stage-request/stageName :portkey.aws.apigateway.create-stage-request/deploymentId] :opt-un [:portkey.aws.apigateway.create-stage-request/tags :portkey.aws.apigateway.create-stage-request/documentationVersion :portkey.aws.apigateway.create-stage-request/canarySettings :portkey.aws.apigateway.create-stage-request/variables :portkey.aws.apigateway.create-stage-request/cacheClusterEnabled :portkey.aws.apigateway.create-stage-request/description :portkey.aws.apigateway.create-stage-request/cacheClusterSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.apigateway.authorizers/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizers/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-authorizer))
(clojure.spec.alpha/def :portkey.aws.apigateway/authorizers (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.authorizers/position :portkey.aws.apigateway.authorizers/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-models-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-models-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-models-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-models-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-models-request/restApiId] :opt-un [:portkey.aws.apigateway.get-models-request/position :portkey.aws.apigateway.get-models-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-api-key-request/api-key (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-api-key-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-api-key-request/apiKey] :opt-un [:portkey.aws.apigateway.update-api-key-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.usage/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage/start-date (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage/end-date (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.usage/items (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-key-usages))
(clojure.spec.alpha/def :portkey.aws.apigateway/usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.usage/usagePlanId :portkey.aws.apigateway.usage/startDate :portkey.aws.apigateway.usage/endDate :portkey.aws.apigateway.usage/position :portkey.aws.apigateway.usage/items] :locations {"values" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-rest-api-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-rest-api-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-rest-api-request/restApiId] :opt-un [:portkey.aws.apigateway.update-rest-api-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/api-keys-format (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"csv" "csv", :csv "csv"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-versions-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-versions-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-versions-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-documentation-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-documentation-versions-request/restApiId] :opt-un [:portkey.aws.apigateway.get-documentation-versions-request/position :portkey.aws.apigateway.get-documentation-versions-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-deployments-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-deployments-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-deployments-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-deployments-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-deployments-request/restApiId] :opt-un [:portkey.aws.apigateway.get-deployments-request/position :portkey.aws.apigateway.get-deployments-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/get-account-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-usage-plan (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/usage-plan) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.import-api-keys-request/body (clojure.spec.alpha/and :portkey.aws.apigateway/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway.import-api-keys-request/format (clojure.spec.alpha/and :portkey.aws.apigateway/api-keys-format))
(clojure.spec.alpha/def :portkey.aws.apigateway.import-api-keys-request/fail-on-warnings (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/import-api-keys-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.import-api-keys-request/body :portkey.aws.apigateway.import-api-keys-request/format] :opt-un [:portkey.aws.apigateway.import-api-keys-request/failOnWarnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-vpc-links-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-vpc-links-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-vpc-links-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.get-vpc-links-request/position :portkey.aws.apigateway.get-vpc-links-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.resource/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.resource/parent-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.resource/path-part (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.resource/path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.resource/resource-methods (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-method))
(clojure.spec.alpha/def :portkey.aws.apigateway/resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.resource/id :portkey.aws.apigateway.resource/parentId :portkey.aws.apigateway.resource/pathPart :portkey.aws.apigateway.resource/path :portkey.aws.apigateway.resource/resourceMethods] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-endpoint-type (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/endpoint-type) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-usage-plan-key-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-usage-plan-key-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-usage-plan-key-request/key-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-usage-plan-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-usage-plan-key-request/usagePlanId :portkey.aws.apigateway.create-usage-plan-key-request/keyId :portkey.aws.apigateway.create-usage-plan-key-request/keyType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-patch-operation (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/patch-operation) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-configuration-property/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-configuration-property/friendly-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-configuration-property/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-configuration-property/required (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-configuration-property/default-value (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/sdk-configuration-property (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.sdk-configuration-property/name :portkey.aws.apigateway.sdk-configuration-property/friendlyName :portkey.aws.apigateway.sdk-configuration-property/description :portkey.aws.apigateway.sdk-configuration-property/required :portkey.aws.apigateway.sdk-configuration-property/defaultValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-integration-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-integration-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-integration-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-integration-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-integration-request/restApiId :portkey.aws.apigateway.delete-integration-request/resourceId :portkey.aws.apigateway.delete-integration-request/httpMethod] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-response/content-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-response/content-disposition (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.sdk-response/body (clojure.spec.alpha/and :portkey.aws.apigateway/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway/sdk-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.sdk-response/contentType :portkey.aws.apigateway.sdk-response/contentDisposition :portkey.aws.apigateway.sdk-response/body] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.import-rest-api-request/fail-on-warnings (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.import-rest-api-request/parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.import-rest-api-request/body (clojure.spec.alpha/and :portkey.aws.apigateway/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway/import-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.import-rest-api-request/body] :opt-un [:portkey.aws.apigateway.import-rest-api-request/failOnWarnings :portkey.aws.apigateway.import-rest-api-request/parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-parts-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-parts-request/type (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-parts-request/name-query (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-parts-request/path (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-parts-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-parts-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-documentation-parts-request/location-status (clojure.spec.alpha/and :portkey.aws.apigateway/location-status-type))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-documentation-parts-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-documentation-parts-request/restApiId] :opt-un [:portkey.aws.apigateway.get-documentation-parts-request/type :portkey.aws.apigateway.get-documentation-parts-request/nameQuery :portkey.aws.apigateway.get-documentation-parts-request/path :portkey.aws.apigateway.get-documentation-parts-request/position :portkey.aws.apigateway.get-documentation-parts-request/limit :portkey.aws.apigateway.get-documentation-parts-request/locationStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/created-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/enabled (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/stage-keys (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/customer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/value (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/last-updated-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.api-key/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/api-key (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.api-key/createdDate :portkey.aws.apigateway.api-key/enabled :portkey.aws.apigateway.api-key/id :portkey.aws.apigateway.api-key/stageKeys :portkey.aws.apigateway.api-key/customerId :portkey.aws.apigateway.api-key/name :portkey.aws.apigateway.api-key/value :portkey.aws.apigateway.api-key/lastUpdatedDate :portkey.aws.apigateway.api-key/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/nullable-integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-method-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-method-request/restApiId :portkey.aws.apigateway.update-method-request/resourceId :portkey.aws.apigateway.update-method-request/httpMethod] :opt-un [:portkey.aws.apigateway.update-method-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/endpoint-configuration (clojure.spec.alpha/and :portkey.aws.apigateway/endpoint-configuration))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/certificate-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/regional-hosted-zone-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/regional-certificate-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/regional-certificate-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/distribution-hosted-zone-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/certificate-upload-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/certificate-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/distribution-domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.domain-name/regional-domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/domain-name (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.domain-name/domainName :portkey.aws.apigateway.domain-name/endpointConfiguration :portkey.aws.apigateway.domain-name/certificateArn :portkey.aws.apigateway.domain-name/regionalHostedZoneId :portkey.aws.apigateway.domain-name/regionalCertificateArn :portkey.aws.apigateway.domain-name/regionalCertificateName :portkey.aws.apigateway.domain-name/distributionHostedZoneId :portkey.aws.apigateway.domain-name/certificateUploadDate :portkey.aws.apigateway.domain-name/certificateName :portkey.aws.apigateway.domain-name/distributionDomainName :portkey.aws.apigateway.domain-name/regionalDomainName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-base-path-mapping (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/base-path-mapping) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-integration-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-integration-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-integration-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-integration-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-integration-request/restApiId :portkey.aws.apigateway.get-integration-request/resourceId :portkey.aws.apigateway.get-integration-request/httpMethod] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-parts/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-parts/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-documentation-part))
(clojure.spec.alpha/def :portkey.aws.apigateway/documentation-parts (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.documentation-parts/position :portkey.aws.apigateway.documentation-parts/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.export-response/content-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.export-response/content-disposition (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.export-response/body (clojure.spec.alpha/and :portkey.aws.apigateway/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway/export-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.export-response/contentType :portkey.aws.apigateway.export-response/contentDisposition :portkey.aws.apigateway.export-response/body] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-method-request/restApiId :portkey.aws.apigateway.delete-method-request/resourceId :portkey.aws.apigateway.delete-method-request/httpMethod] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-api-key-request/api-key (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-api-key-request/include-value (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-api-key-request/apiKey] :opt-un [:portkey.aws.apigateway.get-api-key-request/includeValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-vpc-link-request/vpc-link-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-vpc-link-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-vpc-link-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-vpc-link-request/vpcLinkId] :opt-un [:portkey.aws.apigateway.update-vpc-link-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.gateway-responses/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.gateway-responses/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-gateway-response))
(clojure.spec.alpha/def :portkey.aws.apigateway/gateway-responses (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.gateway-responses/position :portkey.aws.apigateway.gateway-responses/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/certificate-chain (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/endpoint-configuration (clojure.spec.alpha/and :portkey.aws.apigateway/endpoint-configuration))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/certificate-private-key (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/regional-certificate-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/regional-certificate-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/certificate-body (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-domain-name-request/certificate-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-domain-name-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-domain-name-request/domainName] :opt-un [:portkey.aws.apigateway.create-domain-name-request/certificateChain :portkey.aws.apigateway.create-domain-name-request/endpointConfiguration :portkey.aws.apigateway.create-domain-name-request/certificateArn :portkey.aws.apigateway.create-domain-name-request/certificatePrivateKey :portkey.aws.apigateway.create-domain-name-request/regionalCertificateArn :portkey.aws.apigateway.create-domain-name-request/regionalCertificateName :portkey.aws.apigateway.create-domain-name-request/certificateBody :portkey.aws.apigateway.create-domain-name-request/certificateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.integration/integration-responses (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-integration-response))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/connection-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/uri (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/connection-type (clojure.spec.alpha/and :portkey.aws.apigateway/connection-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/request-templates (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/cache-namespace (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/passthrough-behavior (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/type (clojure.spec.alpha/and :portkey.aws.apigateway/integration-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/content-handling (clojure.spec.alpha/and :portkey.aws.apigateway/content-handling-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/cache-key-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/credentials (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration/timeout-in-millis (clojure.spec.alpha/and :portkey.aws.apigateway/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/integration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.integration/integrationResponses :portkey.aws.apigateway.integration/connectionId :portkey.aws.apigateway.integration/uri :portkey.aws.apigateway.integration/connectionType :portkey.aws.apigateway.integration/httpMethod :portkey.aws.apigateway.integration/requestTemplates :portkey.aws.apigateway.integration/requestParameters :portkey.aws.apigateway.integration/cacheNamespace :portkey.aws.apigateway.integration/passthroughBehavior :portkey.aws.apigateway.integration/type :portkey.aws.apigateway.integration/contentHandling :portkey.aws.apigateway.integration/cacheKeyParameters :portkey.aws.apigateway.integration/credentials :portkey.aws.apigateway.integration/timeoutInMillis] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.flush-stage-authorizers-cache-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.flush-stage-authorizers-cache-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/flush-stage-authorizers-cache-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.flush-stage-authorizers-cache-request/restApiId :portkey.aws.apigateway.flush-stage-authorizers-cache-request/stageName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-version/version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-version/created-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.documentation-version/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/documentation-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.documentation-version/version :portkey.aws.apigateway.documentation-version/createdDate :portkey.aws.apigateway.documentation-version/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plan-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-usage-plan-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-usage-plan-request/usagePlanId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/unauthorized-cache-control-header-strategy (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"FAIL_WITH_403" "FAIL_WITH_403", :fail-with-403 "FAIL_WITH_403", "SUCCEED_WITH_RESPONSE_HEADER" "SUCCEED_WITH_RESPONSE_HEADER", :succeed-with-response-header "SUCCEED_WITH_RESPONSE_HEADER", "SUCCEED_WITHOUT_RESPONSE_HEADER" "SUCCEED_WITHOUT_RESPONSE_HEADER", :succeed-without-response-header "SUCCEED_WITHOUT_RESPONSE_HEADER"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-deployment-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-deployment-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-deployment-request/restApiId :portkey.aws.apigateway.delete-deployment-request/deploymentId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-vpc-link-request/vpc-link-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-vpc-link-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-vpc-link-request/vpcLinkId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-api-key (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/api-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway.integration-response/status-code (clojure.spec.alpha/and :portkey.aws.apigateway/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration-response/selection-pattern (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration-response/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration-response/response-templates (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.integration-response/content-handling (clojure.spec.alpha/and :portkey.aws.apigateway/content-handling-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway/integration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.integration-response/statusCode :portkey.aws.apigateway.integration-response/selectionPattern :portkey.aws.apigateway.integration-response/responseParameters :portkey.aws.apigateway.integration-response/responseTemplates :portkey.aws.apigateway.integration-response/contentHandling] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-domain-name (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/domain-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/location-status-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DOCUMENTED" "DOCUMENTED", :documented "DOCUMENTED", "UNDOCUMENTED" "UNDOCUMENTED", :undocumented "UNDOCUMENTED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-rest-api-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.get-rest-api-request/restApiId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.endpoint-configuration/types (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-endpoint-type))
(clojure.spec.alpha/def :portkey.aws.apigateway/endpoint-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.endpoint-configuration/types] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-integration-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-integration-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-integration-request/restApiId :portkey.aws.apigateway.update-integration-request/resourceId :portkey.aws.apigateway.update-integration-request/httpMethod] :opt-un [:portkey.aws.apigateway.update-integration-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/authorization-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/operation-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/authorization-scopes (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/api-key-required (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.put-method-request/request-models (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/put-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.put-method-request/restApiId :portkey.aws.apigateway.put-method-request/resourceId :portkey.aws.apigateway.put-method-request/httpMethod :portkey.aws.apigateway.put-method-request/authorizationType] :opt-un [:portkey.aws.apigateway.put-method-request/authorizerId :portkey.aws.apigateway.put-method-request/requestValidatorId :portkey.aws.apigateway.put-method-request/operationName :portkey.aws.apigateway.put-method-request/requestParameters :portkey.aws.apigateway.put-method-request/authorizationScopes :portkey.aws.apigateway.put-method-request/apiKeyRequired :portkey.aws.apigateway.put-method-request/requestModels] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.vpc-link/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.vpc-link/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.vpc-link/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.vpc-link/target-arns (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.vpc-link/status (clojure.spec.alpha/and :portkey.aws.apigateway/vpc-link-status))
(clojure.spec.alpha/def :portkey.aws.apigateway.vpc-link/status-message (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/vpc-link (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.vpc-link/id :portkey.aws.apigateway.vpc-link/name :portkey.aws.apigateway.vpc-link/description :portkey.aws.apigateway.vpc-link/targetArns :portkey.aws.apigateway.vpc-link/status :portkey.aws.apigateway.vpc-link/statusMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.models/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.models/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-model))
(clojure.spec.alpha/def :portkey.aws.apigateway/models (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.models/position :portkey.aws.apigateway.models/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-authorizer-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-authorizer-request/restApiId :portkey.aws.apigateway.delete-authorizer-request/authorizerId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.stage/cache-cluster-status (clojure.spec.alpha/and :portkey.aws.apigateway/cache-cluster-status))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/created-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/access-log-settings (clojure.spec.alpha/and :portkey.aws.apigateway/access-log-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/tags (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/method-settings (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-method-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/canary-settings (clojure.spec.alpha/and :portkey.aws.apigateway/canary-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/last-updated-date (clojure.spec.alpha/and :portkey.aws.apigateway/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/variables (clojure.spec.alpha/and :portkey.aws.apigateway/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/cache-cluster-enabled (clojure.spec.alpha/and :portkey.aws.apigateway/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/description (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.stage/cache-cluster-size (clojure.spec.alpha/and :portkey.aws.apigateway/cache-cluster-size))
(clojure.spec.alpha/def :portkey.aws.apigateway/stage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.stage/cacheClusterStatus :portkey.aws.apigateway.stage/createdDate :portkey.aws.apigateway.stage/accessLogSettings :portkey.aws.apigateway.stage/tags :portkey.aws.apigateway.stage/documentationVersion :portkey.aws.apigateway.stage/methodSettings :portkey.aws.apigateway.stage/canarySettings :portkey.aws.apigateway.stage/deploymentId :portkey.aws.apigateway.stage/clientCertificateId :portkey.aws.apigateway.stage/lastUpdatedDate :portkey.aws.apigateway.stage/variables :portkey.aws.apigateway.stage/cacheClusterEnabled :portkey.aws.apigateway.stage/stageName :portkey.aws.apigateway.stage/description :portkey.aws.apigateway.stage/cacheClusterSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-authorizer-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-authorizer-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-authorizer-request/restApiId :portkey.aws.apigateway.update-authorizer-request/authorizerId] :opt-un [:portkey.aws.apigateway.update-authorizer-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/list-of-stage-keys (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.apigateway/stage-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.apigateway/content-handling-strategy (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"CONVERT_TO_BINARY" "CONVERT_TO_BINARY", :convert-to-binary "CONVERT_TO_BINARY", "CONVERT_TO_TEXT" "CONVERT_TO_TEXT", :convert-to-text "CONVERT_TO_TEXT"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway/untag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.untag-resource-request/resourceArn :portkey.aws.apigateway.untag-resource-request/tagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.delete-request-validator-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.delete-request-validator-request/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/delete-request-validator-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.delete-request-validator-request/restApiId :portkey.aws.apigateway.delete-request-validator-request/requestValidatorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.create-documentation-part-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-documentation-part-request/location (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part-location))
(clojure.spec.alpha/def :portkey.aws.apigateway.create-documentation-part-request/properties (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway/create-documentation-part-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.create-documentation-part-request/restApiId :portkey.aws.apigateway.create-documentation-part-request/location :portkey.aws.apigateway.create-documentation-part-request/properties] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-request-validator-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-request-validator-request/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-request-validator-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-request-validator-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-request-validator-request/restApiId :portkey.aws.apigateway.update-request-validator-request/requestValidatorId] :opt-un [:portkey.aws.apigateway.update-request-validator-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway/map-of-integration-response (clojure.spec.alpha/map-of :portkey.aws.apigateway/string :portkey.aws.apigateway/integration-response))

(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plans-request/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plans-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.get-usage-plans-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway/get-usage-plans-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.get-usage-plans-request/position :portkey.aws.apigateway.get-usage-plans-request/keyId :portkey.aws.apigateway.get-usage-plans-request/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/authorizer-credentials (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/identity-validation-expression (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/name (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/type (clojure.spec.alpha/and :portkey.aws.apigateway/authorizer-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/authorizer-result-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.apigateway/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/authorizer-uri (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/auth-type (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/identity-source (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.authorizer/providerarns (clojure.spec.alpha/and :portkey.aws.apigateway/list-ofarns))
(clojure.spec.alpha/def :portkey.aws.apigateway/authorizer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.authorizer/authorizerCredentials :portkey.aws.apigateway.authorizer/identityValidationExpression :portkey.aws.apigateway.authorizer/id :portkey.aws.apigateway.authorizer/name :portkey.aws.apigateway.authorizer/type :portkey.aws.apigateway.authorizer/authorizerResultTtlInSeconds :portkey.aws.apigateway.authorizer/authorizerUri :portkey.aws.apigateway.authorizer/authType :portkey.aws.apigateway.authorizer/identitySource :portkey.aws.apigateway.authorizer/providerARNs] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.update-documentation-part-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-documentation-part-request/documentation-part-id (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.update-documentation-part-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway/update-documentation-part-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.update-documentation-part-request/restApiId :portkey.aws.apigateway.update-documentation-part-request/documentationPartId] :opt-un [:portkey.aws.apigateway.update-documentation-part-request/patchOperations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.apigateway.deployments/position (clojure.spec.alpha/and :portkey.aws.apigateway/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.deployments/items (clojure.spec.alpha/and :portkey.aws.apigateway/list-of-deployment))
(clojure.spec.alpha/def :portkey.aws.apigateway/deployments (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.deployments/position :portkey.aws.apigateway.deployments/items] :locations {"item" "items"}))

(clojure.spec.alpha/def :portkey.aws.apigateway/boolean clojure.core/boolean?)

(clojure.core/defn tag-resource "Adds or updates a tag on a given resource." ([tag-resource-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PUT" "/tags/{resource_arn}" tag-resource-request :portkey.aws.apigateway/tag-resource-request {:payload nil, :move {}, :headers {}, :uri {"resource_arn" "resourceArn"}, :querystring {}} 204 nil {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn flush-stage-cache "Flushes a stage's cache." ([flush-stage-cache-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/stages/{stage_name}/cache/data" flush-stage-cache-request :portkey.aws.apigateway/flush-stage-cache-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef flush-stage-cache :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/flush-stage-cache-request) :ret clojure.core/true?)

(clojure.core/defn delete-vpc-link "Deletes an existing VpcLink of a specified identifier." ([delete-vpc-link-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/vpclinks/{vpclink_id}" delete-vpc-link-request :portkey.aws.apigateway/delete-vpc-link-request {:payload nil, :move {}, :headers {}, :uri {"vpclink_id" "vpcLinkId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception})))
(clojure.spec.alpha/fdef delete-vpc-link :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-vpc-link-request) :ret clojure.core/true?)

(clojure.core/defn get-usage-plan "Gets a usage plan of a given plan identifier." ([get-usage-plan-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/usageplans/{usageplanId}" get-usage-plan-request :portkey.aws.apigateway/get-usage-plan-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {}} nil :portkey.aws.apigateway/usage-plan {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-usage-plan :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-usage-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage-plan))

(clojure.core/defn update-rest-api "Changes information about the specified API." ([update-rest-api-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}" update-rest-api-request :portkey.aws.apigateway/update-rest-api-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} nil :portkey.aws.apigateway/rest-api {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/rest-api))

(clojure.core/defn update-account "Changes information about the current Account resource." ([] (update-account {})) ([update-account-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/account" update-account-request :portkey.aws.apigateway/update-account-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.apigateway/account {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-account :args (clojure.spec.alpha/? :portkey.aws.apigateway/update-account-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/account))

(clojure.core/defn delete-rest-api "Deletes the specified API." ([delete-rest-api-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}" delete-rest-api-request :portkey.aws.apigateway/delete-rest-api-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception})))
(clojure.spec.alpha/fdef delete-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-rest-api-request) :ret clojure.core/true?)

(clojure.core/defn delete-method "Deletes an existing Method resource." ([delete-method-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" delete-method-request :portkey.aws.apigateway/delete-method-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} 204 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef delete-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-method-request) :ret clojure.core/true?)

(clojure.core/defn update-authorizer "Updates an existing Authorizer resource.\n AWS CLI\n(http://docs.aws.amazon.com/cli/latest/reference/apigateway/update-authorizer.html)" ([update-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/authorizers/{authorizer_id}" update-authorizer-request :portkey.aws.apigateway/update-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "authorizer_id" "authorizerId"}, :querystring {}} nil :portkey.aws.apigateway/authorizer {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/authorizer))

(clojure.core/defn get-sdk-type ([get-sdk-type-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/sdktypes/{sdktype_id}" get-sdk-type-request :portkey.aws.apigateway/get-sdk-type-request {:payload nil, :move {}, :headers {}, :uri {"sdktype_id" "id"}, :querystring {}} nil :portkey.aws.apigateway/sdk-type {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-sdk-type :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-sdk-type-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/sdk-type))

(clojure.core/defn update-domain-name "Changes information about the DomainName resource." ([update-domain-name-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/domainnames/{domain_name}" update-domain-name-request :portkey.aws.apigateway/update-domain-name-request {:payload nil, :move {}, :headers {}, :uri {"domain_name" "domainName"}, :querystring {}} nil :portkey.aws.apigateway/domain-name {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-domain-name :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-domain-name-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/domain-name))

(clojure.core/defn update-gateway-response "Updates a GatewayResponse of a specified response type on the given RestApi." ([update-gateway-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/gatewayresponses/{response_type}" update-gateway-response-request :portkey.aws.apigateway/update-gateway-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "response_type" "responseType"}, :querystring {}} nil :portkey.aws.apigateway/gateway-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-gateway-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-gateway-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-response))

(clojure.core/defn get-rest-apis "Lists the RestApis resources for your collection." ([] (get-rest-apis {})) ([get-rest-apis-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis" get-rest-apis-request :portkey.aws.apigateway/get-rest-apis-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/rest-apis {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-rest-apis :args (clojure.spec.alpha/? :portkey.aws.apigateway/get-rest-apis-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/rest-apis))

(clojure.core/defn get-documentation-parts ([get-documentation-parts-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/documentation/parts" get-documentation-parts-request :portkey.aws.apigateway/get-documentation-parts-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"type" "type", "name" "nameQuery", "path" "path", "position" "position", "limit" "limit", "locationStatus" "locationStatus"}} nil :portkey.aws.apigateway/documentation-parts {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-documentation-parts :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-documentation-parts-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-parts))

(clojure.core/defn get-deployment "Gets information about a Deployment resource." ([get-deployment-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/deployments/{deployment_id}" get-deployment-request :portkey.aws.apigateway/get-deployment-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "deployment_id" "deploymentId"}, :querystring {"embed" "embed"}} nil :portkey.aws.apigateway/deployment {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ServiceUnavailableException" :portkey.aws.apigateway/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-deployment :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-deployment-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/deployment))

(clojure.core/defn create-resource "Creates a Resource resource." ([create-resource-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/resources/{parent_id}" create-resource-request :portkey.aws.apigateway/create-resource-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "parent_id" "parentId"}, :querystring {}} 201 :portkey.aws.apigateway/resource {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/resource))

(clojure.core/defn delete-documentation-version ([delete-documentation-version-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/documentation/versions/{doc_version}" delete-documentation-version-request :portkey.aws.apigateway/delete-documentation-version-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "doc_version" "documentationVersion"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-documentation-version :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-documentation-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-usage-plan "Deletes a usage plan of a given plan Id." ([delete-usage-plan-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/usageplans/{usageplanId}" delete-usage-plan-request :portkey.aws.apigateway/delete-usage-plan-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception})))
(clojure.spec.alpha/fdef delete-usage-plan :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-usage-plan-request) :ret clojure.core/true?)

(clojure.core/defn get-stages "Gets information about one or more Stage resources." ([get-stages-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/stages" get-stages-request :portkey.aws.apigateway/get-stages-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"deploymentId" "deploymentId"}} nil :portkey.aws.apigateway/stages {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-stages :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-stages-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/stages))

(clojure.core/defn get-tags "Gets the Tags collection for a given resource." ([get-tags-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/tags/{resource_arn}" get-tags-request :portkey.aws.apigateway/get-tags-request {:payload nil, :move {}, :headers {}, :uri {"resource_arn" "resourceArn"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/tags {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception})))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/tags))

(clojure.core/defn get-resource "Lists information about a resource." ([get-resource-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}" get-resource-request :portkey.aws.apigateway/get-resource-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId"}, :querystring {"embed" "embed"}} nil :portkey.aws.apigateway/resource {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/resource))

(clojure.core/defn update-documentation-part ([update-documentation-part-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/documentation/parts/{part_id}" update-documentation-part-request :portkey.aws.apigateway/update-documentation-part-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "part_id" "documentationPartId"}, :querystring {}} nil :portkey.aws.apigateway/documentation-part {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-documentation-part :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-documentation-part-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part))

(clojure.core/defn create-vpc-link "Creates a VPC link, under the caller's account in a selected region, in an\nasynchronous operation that typically takes 2-4 minutes to complete and become\noperational. The caller must have permissions to create and update VPC Endpoint\nservices." ([create-vpc-link-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/vpclinks" create-vpc-link-request :portkey.aws.apigateway/create-vpc-link-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 202 :portkey.aws.apigateway/vpc-link {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-vpc-link :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-vpc-link-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/vpc-link))

(clojure.core/defn import-api-keys "Import API keys from an external source, such as a CSV-formatted file." ([import-api-keys-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/apikeys?mode=import" import-api-keys-request :portkey.aws.apigateway/import-api-keys-request {:payload "body", :move {}, :headers {}, :uri {}, :querystring {"format" "format", "failonwarnings" "failOnWarnings"}} 201 :portkey.aws.apigateway/api-key-ids {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef import-api-keys :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/import-api-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/api-key-ids))

(clojure.core/defn get-client-certificate "Gets information about the current ClientCertificate resource." ([get-client-certificate-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/clientcertificates/{clientcertificate_id}" get-client-certificate-request :portkey.aws.apigateway/get-client-certificate-request {:payload nil, :move {}, :headers {}, :uri {"clientcertificate_id" "clientCertificateId"}, :querystring {}} nil :portkey.aws.apigateway/client-certificate {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-client-certificate :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-client-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/client-certificate))

(clojure.core/defn create-authorizer "Adds a new Authorizer resource to an existing RestApi resource.\n AWS CLI\n(http://docs.aws.amazon.com/cli/latest/reference/apigateway/create-authorizer.html)" ([create-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/authorizers" create-authorizer-request :portkey.aws.apigateway/create-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/authorizer {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/authorizer))

(clojure.core/defn get-usage-plan-keys "Gets all the usage plan keys representing the API keys added to a specified\nusage plan." ([get-usage-plan-keys-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/usageplans/{usageplanId}/keys" get-usage-plan-keys-request :portkey.aws.apigateway/get-usage-plan-keys-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {"position" "position", "limit" "limit", "name" "nameQuery"}} nil :portkey.aws.apigateway/usage-plan-keys {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-usage-plan-keys :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-usage-plan-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage-plan-keys))

(clojure.core/defn get-gateway-response "Gets a GatewayResponse of a specified response type on the given RestApi." ([get-gateway-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/gatewayresponses/{response_type}" get-gateway-response-request :portkey.aws.apigateway/get-gateway-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "response_type" "responseType"}, :querystring {}} nil :portkey.aws.apigateway/gateway-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-gateway-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-gateway-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-response))

(clojure.core/defn get-deployments "Gets information about a Deployments collection." ([get-deployments-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/deployments" get-deployments-request :portkey.aws.apigateway/get-deployments-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/deployments {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ServiceUnavailableException" :portkey.aws.apigateway/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-deployments :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-deployments-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/deployments))

(clojure.core/defn update-resource "Changes information about a Resource resource." ([update-resource-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}" update-resource-request :portkey.aws.apigateway/update-resource-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId"}, :querystring {}} nil :portkey.aws.apigateway/resource {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/resource))

(clojure.core/defn get-authorizers "Describe an existing Authorizers resource.\n AWS CLI\n(http://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizers.html)" ([get-authorizers-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/authorizers" get-authorizers-request :portkey.aws.apigateway/get-authorizers-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/authorizers {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-authorizers :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-authorizers-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/authorizers))

(clojure.core/defn get-base-path-mapping "Describe a BasePathMapping resource." ([get-base-path-mapping-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/domainnames/{domain_name}/basepathmappings/{base_path}" get-base-path-mapping-request :portkey.aws.apigateway/get-base-path-mapping-request {:payload nil, :move {}, :headers {}, :uri {"domain_name" "domainName", "base_path" "basePath"}, :querystring {}} nil :portkey.aws.apigateway/base-path-mapping {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-base-path-mapping :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-base-path-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/base-path-mapping))

(clojure.core/defn update-vpc-link "Updates an existing VpcLink of a specified identifier." ([update-vpc-link-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/vpclinks/{vpclink_id}" update-vpc-link-request :portkey.aws.apigateway/update-vpc-link-request {:payload nil, :move {}, :headers {}, :uri {"vpclink_id" "vpcLinkId"}, :querystring {}} nil :portkey.aws.apigateway/vpc-link {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-vpc-link :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-vpc-link-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/vpc-link))

(clojure.core/defn get-vpc-links "Gets the VpcLinks collection under the caller's account in a selected region." ([] (get-vpc-links {})) ([get-vpc-links-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/vpclinks" get-vpc-links-request :portkey.aws.apigateway/get-vpc-links-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/vpc-links {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-vpc-links :args (clojure.spec.alpha/? :portkey.aws.apigateway/get-vpc-links-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/vpc-links))

(clojure.core/defn delete-integration "Represents a delete integration." ([delete-integration-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration" delete-integration-request :portkey.aws.apigateway/delete-integration-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} 204 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef delete-integration :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-integration-request) :ret clojure.core/true?)

(clojure.core/defn get-request-validators "Gets the RequestValidators collection of a given RestApi." ([get-request-validators-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/requestvalidators" get-request-validators-request :portkey.aws.apigateway/get-request-validators-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/request-validators {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-request-validators :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-request-validators-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/request-validators))

(clojure.core/defn create-domain-name "Creates a new domain name." ([create-domain-name-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/domainnames" create-domain-name-request :portkey.aws.apigateway/create-domain-name-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway/domain-name {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-domain-name :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-domain-name-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/domain-name))

(clojure.core/defn put-integration-response "Represents a put integration." ([put-integration-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PUT" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}" put-integration-response-request :portkey.aws.apigateway/put-integration-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 201 :portkey.aws.apigateway/integration-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef put-integration-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/put-integration-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/integration-response))

(clojure.core/defn create-usage-plan "Creates a usage plan with the throttle and quota limits, as well as the\nassociated API stages, specified in the payload." ([create-usage-plan-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/usageplans" create-usage-plan-request :portkey.aws.apigateway/create-usage-plan-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway/usage-plan {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception})))
(clojure.spec.alpha/fdef create-usage-plan :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-usage-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage-plan))

(clojure.core/defn create-api-key "Create an ApiKey resource.\n AWS CLI\n(http://docs.aws.amazon.com/cli/latest/reference/apigateway/create-api-key.html)" ([] (create-api-key {})) ([create-api-key-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/apikeys" create-api-key-request :portkey.aws.apigateway/create-api-key-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway/api-key {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef create-api-key :args (clojure.spec.alpha/? :portkey.aws.apigateway/create-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/api-key))

(clojure.core/defn import-rest-api "A feature of the API Gateway control service for creating a new API from an\nexternal API definition file." ([import-rest-api-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis?mode=import" import-rest-api-request :portkey.aws.apigateway/import-rest-api-request {:payload "body", :move {}, :headers {}, :uri {}, :querystring {"failonwarnings" "failOnWarnings", nil "parameters"}} 201 :portkey.aws.apigateway/rest-api {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef import-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/import-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/rest-api))

(clojure.core/defn delete-api-key "Deletes the ApiKey resource." ([delete-api-key-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/apikeys/{api_Key}" delete-api-key-request :portkey.aws.apigateway/delete-api-key-request {:payload nil, :move {}, :headers {}, :uri {"api_Key" "apiKey"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-api-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-api-key-request) :ret clojure.core/true?)

(clojure.core/defn get-integration "Get the integration settings." ([get-integration-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration" get-integration-request :portkey.aws.apigateway/get-integration-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway/integration {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-integration :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-integration-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/integration))

(clojure.core/defn get-export "Exports a deployed version of a RestApi in a specified format." ([get-export-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/stages/{stage_name}/exports/{export_type}" get-export-request :portkey.aws.apigateway/get-export-request {:payload nil, :move {}, :headers {"accepts" ["Accept" nil]}, :uri {"restapi_id" "restApiId", "stage_name" "stageName", "export_type" "exportType"}, :querystring {nil "parameters"}} 200 :portkey.aws.apigateway/export-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-export :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-export-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/export-response))

(clojure.core/defn delete-stage "Deletes a Stage resource." ([delete-stage-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/stages/{stage_name}" delete-stage-request :portkey.aws.apigateway/delete-stage-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception})))
(clojure.spec.alpha/fdef delete-stage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-stage-request) :ret clojure.core/true?)

(clojure.core/defn delete-request-validator "Deletes a RequestValidator of a given RestApi." ([delete-request-validator-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/requestvalidators/{requestvalidator_id}" delete-request-validator-request :portkey.aws.apigateway/delete-request-validator-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "requestvalidator_id" "requestValidatorId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef delete-request-validator :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-request-validator-request) :ret clojure.core/true?)

(clojure.core/defn get-gateway-responses "Gets the GatewayResponses collection on the given RestApi. If an API developer\nhas not added any definitions for gateway responses, the result will be the API\nGateway-generated default GatewayResponses collection for the supported response\ntypes." ([get-gateway-responses-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/gatewayresponses" get-gateway-responses-request :portkey.aws.apigateway/get-gateway-responses-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/gateway-responses {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-gateway-responses :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-gateway-responses-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-responses))

(clojure.core/defn put-method-response "Adds a MethodResponse to an existing Method resource." ([put-method-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PUT" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}" put-method-response-request :portkey.aws.apigateway/put-method-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 201 :portkey.aws.apigateway/method-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-method-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/put-method-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/method-response))

(clojure.core/defn get-model "Describes an existing model defined for a RestApi resource." ([get-model-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/models/{model_name}" get-model-request :portkey.aws.apigateway/get-model-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "model_name" "modelName"}, :querystring {"flatten" "flatten"}} nil :portkey.aws.apigateway/model {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-model :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-model-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/model))

(clojure.core/defn create-model "Adds a new Model resource to an existing RestApi resource." ([create-model-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/models" create-model-request :portkey.aws.apigateway/create-model-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/model {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-model :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-model-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/model))

(clojure.core/defn update-api-key "Changes information about an ApiKey resource." ([update-api-key-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/apikeys/{api_Key}" update-api-key-request :portkey.aws.apigateway/update-api-key-request {:payload nil, :move {}, :headers {}, :uri {"api_Key" "apiKey"}, :querystring {}} nil :portkey.aws.apigateway/api-key {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef update-api-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/api-key))

(clojure.core/defn create-deployment "Creates a Deployment resource, which makes a specified RestApi callable over the\ninternet." ([create-deployment-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/deployments" create-deployment-request :portkey.aws.apigateway/create-deployment-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/deployment {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ServiceUnavailableException" :portkey.aws.apigateway/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-deployment :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-deployment-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/deployment))

(clojure.core/defn update-method "Updates an existing Method resource." ([update-method-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" update-method-request :portkey.aws.apigateway/update-method-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway/method {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-method-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/method))

(clojure.core/defn test-invoke-authorizer "Simulate the execution of an Authorizer in your RestApi with headers,\nparameters, and an incoming request body.\n Enable custom authorizers\n(http://docs.aws.amazon.com/apigateway/latest/developerguide/use-custom-authorizer.html)" ([test-invoke-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/authorizers/{authorizer_id}" test-invoke-authorizer-request :portkey.aws.apigateway/test-invoke-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "authorizer_id" "authorizerId"}, :querystring {}} nil :portkey.aws.apigateway/test-invoke-authorizer-response {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef test-invoke-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/test-invoke-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/test-invoke-authorizer-response))

(clojure.core/defn create-documentation-part ([create-documentation-part-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/documentation/parts" create-documentation-part-request :portkey.aws.apigateway/create-documentation-part-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/documentation-part {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-documentation-part :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-documentation-part-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part))

(clojure.core/defn update-stage "Changes information about a Stage resource." ([update-stage-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/stages/{stage_name}" update-stage-request :portkey.aws.apigateway/update-stage-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} nil :portkey.aws.apigateway/stage {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-stage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-stage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/stage))

(clojure.core/defn update-request-validator "Updates a RequestValidator of a given RestApi." ([update-request-validator-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/requestvalidators/{requestvalidator_id}" update-request-validator-request :portkey.aws.apigateway/update-request-validator-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "requestvalidator_id" "requestValidatorId"}, :querystring {}} nil :portkey.aws.apigateway/request-validator {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-request-validator :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-request-validator-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/request-validator))

(clojure.core/defn get-sdk-types ([] (get-sdk-types {})) ([get-sdk-types-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/sdktypes" get-sdk-types-request :portkey.aws.apigateway/get-sdk-types-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/sdk-types {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-sdk-types :args (clojure.spec.alpha/? :portkey.aws.apigateway/get-sdk-types-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/sdk-types))

(clojure.core/defn update-client-certificate "Changes information about an ClientCertificate resource." ([update-client-certificate-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/clientcertificates/{clientcertificate_id}" update-client-certificate-request :portkey.aws.apigateway/update-client-certificate-request {:payload nil, :move {}, :headers {}, :uri {"clientcertificate_id" "clientCertificateId"}, :querystring {}} nil :portkey.aws.apigateway/client-certificate {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception})))
(clojure.spec.alpha/fdef update-client-certificate :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-client-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/client-certificate))

(clojure.core/defn update-model "Changes information about a model." ([update-model-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/models/{model_name}" update-model-request :portkey.aws.apigateway/update-model-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "model_name" "modelName"}, :querystring {}} nil :portkey.aws.apigateway/model {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-model :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-model-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/model))

(clojure.core/defn get-documentation-versions ([get-documentation-versions-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/documentation/versions" get-documentation-versions-request :portkey.aws.apigateway/get-documentation-versions-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/documentation-versions {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-documentation-versions :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-documentation-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-versions))

(clojure.core/defn update-usage "Grants a temporary extension to the remaining quota of a usage plan associated\nwith a specified API key." ([update-usage-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/usageplans/{usageplanId}/keys/{keyId}/usage" update-usage-request :portkey.aws.apigateway/update-usage-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId", "keyId" "keyId"}, :querystring {}} nil :portkey.aws.apigateway/usage {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception})))
(clojure.spec.alpha/fdef update-usage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage))

(clojure.core/defn create-usage-plan-key "Creates a usage plan key for adding an existing API key to a usage plan." ([create-usage-plan-key-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/usageplans/{usageplanId}/keys" create-usage-plan-key-request :portkey.aws.apigateway/create-usage-plan-key-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {}} 201 :portkey.aws.apigateway/usage-plan-key {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-usage-plan-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-usage-plan-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage-plan-key))

(clojure.core/defn put-integration "Sets up a method's integration." ([put-integration-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PUT" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration" put-integration-request :portkey.aws.apigateway/put-integration-request {:payload nil, :move {"httpMethod" "integrationHttpMethod"}, :headers {}, :uri {"resource_id" "resourceId", "http_method" "httpMethod", "restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/integration {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-integration :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/put-integration-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/integration))

(clojure.core/defn get-usage "Gets the usage data of a usage plan in a specified time interval." ([get-usage-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/usageplans/{usageplanId}/usage" get-usage-request :portkey.aws.apigateway/get-usage-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {"keyId" "keyId", "startDate" "startDate", "endDate" "endDate", "position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/usage {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-usage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage))

(clojure.core/defn update-documentation-version ([update-documentation-version-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/documentation/versions/{doc_version}" update-documentation-version-request :portkey.aws.apigateway/update-documentation-version-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "doc_version" "documentationVersion"}, :querystring {}} nil :portkey.aws.apigateway/documentation-version {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-documentation-version :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-documentation-version-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-version))

(clojure.core/defn get-stage "Gets information about a Stage resource." ([get-stage-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/stages/{stage_name}" get-stage-request :portkey.aws.apigateway/get-stage-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} nil :portkey.aws.apigateway/stage {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-stage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-stage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/stage))

(clojure.core/defn update-method-response "Updates an existing MethodResponse resource." ([update-method-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}" update-method-response-request :portkey.aws.apigateway/update-method-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 201 :portkey.aws.apigateway/method-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-method-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-method-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/method-response))

(clojure.core/defn get-vpc-link "Gets a specified VPC link under the caller's account in a region." ([get-vpc-link-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/vpclinks/{vpclink_id}" get-vpc-link-request :portkey.aws.apigateway/get-vpc-link-request {:payload nil, :move {}, :headers {}, :uri {"vpclink_id" "vpcLinkId"}, :querystring {}} nil :portkey.aws.apigateway/vpc-link {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-vpc-link :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-vpc-link-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/vpc-link))

(clojure.core/defn create-base-path-mapping "Creates a new BasePathMapping resource." ([create-base-path-mapping-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/domainnames/{domain_name}/basepathmappings" create-base-path-mapping-request :portkey.aws.apigateway/create-base-path-mapping-request {:payload nil, :move {}, :headers {}, :uri {"domain_name" "domainName"}, :querystring {}} 201 :portkey.aws.apigateway/base-path-mapping {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-base-path-mapping :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-base-path-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/base-path-mapping))

(clojure.core/defn get-documentation-part ([get-documentation-part-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/documentation/parts/{part_id}" get-documentation-part-request :portkey.aws.apigateway/get-documentation-part-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "part_id" "documentationPartId"}, :querystring {}} nil :portkey.aws.apigateway/documentation-part {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-documentation-part :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-documentation-part-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part))

(clojure.core/defn delete-model "Deletes a model." ([delete-model-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/models/{model_name}" delete-model-request :portkey.aws.apigateway/delete-model-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "model_name" "modelName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef delete-model :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-model-request) :ret clojure.core/true?)

(clojure.core/defn import-documentation-parts ([import-documentation-parts-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PUT" "/restapis/{restapi_id}/documentation/parts" import-documentation-parts-request :portkey.aws.apigateway/import-documentation-parts-request {:payload "body", :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"mode" "mode", "failonwarnings" "failOnWarnings"}} nil :portkey.aws.apigateway/documentation-part-ids {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef import-documentation-parts :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/import-documentation-parts-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-part-ids))

(clojure.core/defn delete-method-response "Deletes an existing MethodResponse resource." ([delete-method-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}" delete-method-response-request :portkey.aws.apigateway/delete-method-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 204 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef delete-method-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-method-response-request) :ret clojure.core/true?)

(clojure.core/defn get-client-certificates "Gets a collection of ClientCertificate resources." ([] (get-client-certificates {})) ([get-client-certificates-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/clientcertificates" get-client-certificates-request :portkey.aws.apigateway/get-client-certificates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/client-certificates {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-client-certificates :args (clojure.spec.alpha/? :portkey.aws.apigateway/get-client-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/client-certificates))

(clojure.core/defn get-api-keys "Gets information about the current ApiKeys resource." ([] (get-api-keys {})) ([get-api-keys-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/apikeys" get-api-keys-request :portkey.aws.apigateway/get-api-keys-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit", "name" "nameQuery", "customerId" "customerId", "includeValues" "includeValues"}} nil :portkey.aws.apigateway/api-keys {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-api-keys :args (clojure.spec.alpha/? :portkey.aws.apigateway/get-api-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/api-keys))

(clojure.core/defn update-deployment "Changes information about a Deployment resource." ([update-deployment-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/deployments/{deployment_id}" update-deployment-request :portkey.aws.apigateway/update-deployment-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "deployment_id" "deploymentId"}, :querystring {}} nil :portkey.aws.apigateway/deployment {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ServiceUnavailableException" :portkey.aws.apigateway/service-unavailable-exception})))
(clojure.spec.alpha/fdef update-deployment :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-deployment-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/deployment))

(clojure.core/defn delete-domain-name "Deletes the DomainName resource." ([delete-domain-name-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/domainnames/{domain_name}" delete-domain-name-request :portkey.aws.apigateway/delete-domain-name-request {:payload nil, :move {}, :headers {}, :uri {"domain_name" "domainName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-domain-name :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-domain-name-request) :ret clojure.core/true?)

(clojure.core/defn create-rest-api "Creates a new RestApi resource." ([create-rest-api-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis" create-rest-api-request :portkey.aws.apigateway/create-rest-api-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway/rest-api {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/rest-api))

(clojure.core/defn delete-authorizer "Deletes an existing Authorizer resource.\n AWS CLI\n(http://docs.aws.amazon.com/cli/latest/reference/apigateway/delete-authorizer.html)" ([delete-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/authorizers/{authorizer_id}" delete-authorizer-request :portkey.aws.apigateway/delete-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "authorizer_id" "authorizerId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef delete-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-authorizer-request) :ret clojure.core/true?)

(clojure.core/defn get-usage-plan-key "Gets a usage plan key of a given key identifier." ([get-usage-plan-key-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/usageplans/{usageplanId}/keys/{keyId}" get-usage-plan-key-request :portkey.aws.apigateway/get-usage-plan-key-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId", "keyId" "keyId"}, :querystring {}} 200 :portkey.aws.apigateway/usage-plan-key {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-usage-plan-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-usage-plan-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage-plan-key))

(clojure.core/defn delete-resource "Deletes a Resource resource." ([delete-resource-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}" delete-resource-request :portkey.aws.apigateway/delete-resource-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-resource-request) :ret clojure.core/true?)

(clojure.core/defn test-invoke-method "Simulate the execution of a Method in your RestApi with headers, parameters, and\nan incoming request body." ([test-invoke-method-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" test-invoke-method-request :portkey.aws.apigateway/test-invoke-method-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway/test-invoke-method-response {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef test-invoke-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/test-invoke-method-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/test-invoke-method-response))

(clojure.core/defn get-method-response "Describes a MethodResponse resource." ([get-method-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}" get-method-response-request :portkey.aws.apigateway/get-method-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} nil :portkey.aws.apigateway/method-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-method-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-method-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/method-response))

(clojure.core/defn get-request-validator "Gets a RequestValidator of a given RestApi." ([get-request-validator-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/requestvalidators/{requestvalidator_id}" get-request-validator-request :portkey.aws.apigateway/get-request-validator-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "requestvalidator_id" "requestValidatorId"}, :querystring {}} nil :portkey.aws.apigateway/request-validator {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-request-validator :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-request-validator-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/request-validator))

(clojure.core/defn get-authorizer "Describe an existing Authorizer resource.\n AWS CLI\n(http://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizer.html)" ([get-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/authorizers/{authorizer_id}" get-authorizer-request :portkey.aws.apigateway/get-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "authorizer_id" "authorizerId"}, :querystring {}} nil :portkey.aws.apigateway/authorizer {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/authorizer))

(clojure.core/defn get-base-path-mappings "Represents a collection of BasePathMapping resources." ([get-base-path-mappings-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/domainnames/{domain_name}/basepathmappings" get-base-path-mappings-request :portkey.aws.apigateway/get-base-path-mappings-request {:payload nil, :move {}, :headers {}, :uri {"domain_name" "domainName"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/base-path-mappings {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-base-path-mappings :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-base-path-mappings-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/base-path-mappings))

(clojure.core/defn delete-base-path-mapping "Deletes the BasePathMapping resource." ([delete-base-path-mapping-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/domainnames/{domain_name}/basepathmappings/{base_path}" delete-base-path-mapping-request :portkey.aws.apigateway/delete-base-path-mapping-request {:payload nil, :move {}, :headers {}, :uri {"domain_name" "domainName", "base_path" "basePath"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-base-path-mapping :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-base-path-mapping-request) :ret clojure.core/true?)

(clojure.core/defn get-account "Gets information about the current Account resource." ([] (get-account {})) ([get-account-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/account" get-account-request :portkey.aws.apigateway/get-account-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.apigateway/account {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-account :args (clojure.spec.alpha/? :portkey.aws.apigateway/get-account-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/account))

(clojure.core/defn get-integration-response "Represents a get integration response." ([get-integration-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}" get-integration-response-request :portkey.aws.apigateway/get-integration-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} nil :portkey.aws.apigateway/integration-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-integration-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-integration-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/integration-response))

(clojure.core/defn get-model-template "Generates a sample mapping template that can be used to transform a payload into\nthe structure of a model." ([get-model-template-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/models/{model_name}/default_template" get-model-template-request :portkey.aws.apigateway/get-model-template-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "model_name" "modelName"}, :querystring {}} nil :portkey.aws.apigateway/template {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-model-template :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-model-template-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/template))

(clojure.core/defn get-rest-api "Lists the RestApi resource in the collection." ([get-rest-api-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}" get-rest-api-request :portkey.aws.apigateway/get-rest-api-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} nil :portkey.aws.apigateway/rest-api {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/rest-api))

(clojure.core/defn delete-integration-response "Represents a delete integration response." ([delete-integration-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}" delete-integration-response-request :portkey.aws.apigateway/delete-integration-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 204 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef delete-integration-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-integration-response-request) :ret clojure.core/true?)

(clojure.core/defn delete-usage-plan-key "Deletes a usage plan key and remove the underlying API key from the associated\nusage plan." ([delete-usage-plan-key-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/usageplans/{usageplanId}/keys/{keyId}" delete-usage-plan-key-request :portkey.aws.apigateway/delete-usage-plan-key-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId", "keyId" "keyId"}, :querystring {}} 202 nil {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-usage-plan-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-usage-plan-key-request) :ret clojure.core/true?)

(clojure.core/defn delete-documentation-part ([delete-documentation-part-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/documentation/parts/{part_id}" delete-documentation-part-request :portkey.aws.apigateway/delete-documentation-part-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "part_id" "documentationPartId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception})))
(clojure.spec.alpha/fdef delete-documentation-part :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-documentation-part-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource "Removes a tag from a given resource." ([untag-resource-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/tags/{resource_arn}" untag-resource-request :portkey.aws.apigateway/untag-resource-request {:payload nil, :move {}, :headers {}, :uri {"resource_arn" "resourceArn"}, :querystring {"tagKeys" "tagKeys"}} 204 nil {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn generate-client-certificate "Generates a ClientCertificate resource." ([] (generate-client-certificate {})) ([generate-client-certificate-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/clientcertificates" generate-client-certificate-request :portkey.aws.apigateway/generate-client-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway/client-certificate {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception})))
(clojure.spec.alpha/fdef generate-client-certificate :args (clojure.spec.alpha/? :portkey.aws.apigateway/generate-client-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/client-certificate))

(clojure.core/defn get-method "Describe an existing Method resource." ([get-method-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" get-method-request :portkey.aws.apigateway/get-method-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway/method {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-method-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/method))

(clojure.core/defn get-models "Describes existing Models defined for a RestApi resource." ([get-models-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/models" get-models-request :portkey.aws.apigateway/get-models-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/models {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-models :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-models-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/models))

(clojure.core/defn get-documentation-version ([get-documentation-version-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/documentation/versions/{doc_version}" get-documentation-version-request :portkey.aws.apigateway/get-documentation-version-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "doc_version" "documentationVersion"}, :querystring {}} nil :portkey.aws.apigateway/documentation-version {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-documentation-version :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-documentation-version-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-version))

(clojure.core/defn create-documentation-version ([create-documentation-version-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/documentation/versions" create-documentation-version-request :portkey.aws.apigateway/create-documentation-version-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/documentation-version {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-documentation-version :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-documentation-version-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/documentation-version))

(clojure.core/defn get-resources "Lists information about a collection of Resource resources." ([get-resources-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/resources" get-resources-request :portkey.aws.apigateway/get-resources-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit", "embed" "embed"}} nil :portkey.aws.apigateway/resources {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-resources :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/resources))

(clojure.core/defn get-api-key "Gets information about the current ApiKey resource." ([get-api-key-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/apikeys/{api_Key}" get-api-key-request :portkey.aws.apigateway/get-api-key-request {:payload nil, :move {}, :headers {}, :uri {"api_Key" "apiKey"}, :querystring {"includeValue" "includeValue"}} nil :portkey.aws.apigateway/api-key {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-api-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/api-key))

(clojure.core/defn create-stage "Creates a new Stage resource that references a pre-existing Deployment for the\nAPI." ([create-stage-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/stages" create-stage-request :portkey.aws.apigateway/create-stage-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/stage {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-stage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-stage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/stage))

(clojure.core/defn delete-gateway-response "Clears any customization of a GatewayResponse of a specified response type on\nthe given RestApi and resets it with the default settings." ([delete-gateway-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/gatewayresponses/{response_type}" delete-gateway-response-request :portkey.aws.apigateway/delete-gateway-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "response_type" "responseType"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef delete-gateway-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-gateway-response-request) :ret clojure.core/true?)

(clojure.core/defn update-integration "Represents an update integration." ([update-integration-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration" update-integration-request :portkey.aws.apigateway/update-integration-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway/integration {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef update-integration :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-integration-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/integration))

(clojure.core/defn flush-stage-authorizers-cache "Flushes all authorizer cache entries on a stage." ([flush-stage-authorizers-cache-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/stages/{stage_name}/cache/authorizers" flush-stage-authorizers-cache-request :portkey.aws.apigateway/flush-stage-authorizers-cache-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef flush-stage-authorizers-cache :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/flush-stage-authorizers-cache-request) :ret clojure.core/true?)

(clojure.core/defn delete-client-certificate "Deletes the ClientCertificate resource." ([delete-client-certificate-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/clientcertificates/{clientcertificate_id}" delete-client-certificate-request :portkey.aws.apigateway/delete-client-certificate-request {:payload nil, :move {}, :headers {}, :uri {"clientcertificate_id" "clientCertificateId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception})))
(clojure.spec.alpha/fdef delete-client-certificate :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-client-certificate-request) :ret clojure.core/true?)

(clojure.core/defn put-gateway-response "Creates a customization of a GatewayResponse of a specified response type and\nstatus code on the given RestApi." ([put-gateway-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PUT" "/restapis/{restapi_id}/gatewayresponses/{response_type}" put-gateway-response-request :portkey.aws.apigateway/put-gateway-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "response_type" "responseType"}, :querystring {}} 201 :portkey.aws.apigateway/gateway-response {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-gateway-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/put-gateway-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/gateway-response))

(clojure.core/defn get-domain-name "Represents a domain name that is contained in a simpler, more intuitive URL that\ncan be called." ([get-domain-name-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/domainnames/{domain_name}" get-domain-name-request :portkey.aws.apigateway/get-domain-name-request {:payload nil, :move {}, :headers {}, :uri {"domain_name" "domainName"}, :querystring {}} nil :portkey.aws.apigateway/domain-name {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ServiceUnavailableException" :portkey.aws.apigateway/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-domain-name :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-domain-name-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/domain-name))

(clojure.core/defn update-base-path-mapping "Changes information about the BasePathMapping resource." ([update-base-path-mapping-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/domainnames/{domain_name}/basepathmappings/{base_path}" update-base-path-mapping-request :portkey.aws.apigateway/update-base-path-mapping-request {:payload nil, :move {}, :headers {}, :uri {"domain_name" "domainName", "base_path" "basePath"}, :querystring {}} nil :portkey.aws.apigateway/base-path-mapping {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-base-path-mapping :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-base-path-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/base-path-mapping))

(clojure.core/defn get-usage-plans "Gets all the usage plans of the caller's account." ([] (get-usage-plans {})) ([get-usage-plans-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/usageplans" get-usage-plans-request :portkey.aws.apigateway/get-usage-plans-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"position" "position", "keyId" "keyId", "limit" "limit"}} nil :portkey.aws.apigateway/usage-plans {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception})))
(clojure.spec.alpha/fdef get-usage-plans :args (clojure.spec.alpha/? :portkey.aws.apigateway/get-usage-plans-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage-plans))

(clojure.core/defn update-usage-plan "Updates a usage plan of a given plan Id." ([update-usage-plan-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/usageplans/{usageplanId}" update-usage-plan-request :portkey.aws.apigateway/update-usage-plan-request {:payload nil, :move {}, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {}} nil :portkey.aws.apigateway/usage-plan {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef update-usage-plan :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-usage-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/usage-plan))

(clojure.core/defn get-sdk "Generates a client SDK for a RestApi and Stage." ([get-sdk-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/restapis/{restapi_id}/stages/{stage_name}/sdks/{sdk_type}" get-sdk-request :portkey.aws.apigateway/get-sdk-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName", "sdk_type" "sdkType"}, :querystring {nil "parameters"}} 200 :portkey.aws.apigateway/sdk-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-sdk :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/get-sdk-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/sdk-response))

(clojure.core/defn put-method "Add a method to an existing Resource resource." ([put-method-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PUT" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" put-method-request :portkey.aws.apigateway/put-method-request {:payload nil, :move {}, :headers {}, :uri {"resource_id" "resourceId", "http_method" "httpMethod", "restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/method {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/put-method-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/method))

(clojure.core/defn update-integration-response "Represents an update integration response." ([update-integration-response-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}" update-integration-response-request :portkey.aws.apigateway/update-integration-response-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} nil :portkey.aws.apigateway/integration-response {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-integration-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/update-integration-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/integration-response))

(clojure.core/defn get-domain-names "Represents a collection of DomainName resources." ([] (get-domain-names {})) ([get-domain-names-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "GET" "/domainnames" get-domain-names-request :portkey.aws.apigateway/get-domain-names-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway/domain-names {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-domain-names :args (clojure.spec.alpha/? :portkey.aws.apigateway/get-domain-names-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/domain-names))

(clojure.core/defn put-rest-api "A feature of the API Gateway control service for updating an existing API with\nan input of external API definitions. The update can take the form of merging\nthe supplied definition into the existing API or overwriting the existing API." ([put-rest-api-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "PUT" "/restapis/{restapi_id}" put-rest-api-request :portkey.aws.apigateway/put-rest-api-request {:payload "body", :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"mode" "mode", "failonwarnings" "failOnWarnings", nil "parameters"}} nil :portkey.aws.apigateway/rest-api {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway/conflict-exception})))
(clojure.spec.alpha/fdef put-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/put-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/rest-api))

(clojure.core/defn create-request-validator "Creates a ReqeustValidator of a given RestApi." ([create-request-validator-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "POST" "/restapis/{restapi_id}/requestvalidators" create-request-validator-request :portkey.aws.apigateway/create-request-validator-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway/request-validator {"BadRequestException" :portkey.aws.apigateway/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "LimitExceededException" :portkey.aws.apigateway/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-request-validator :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/create-request-validator-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway/request-validator))

(clojure.core/defn delete-deployment "Deletes a Deployment resource. Deleting a deployment will only succeed if there\nare no Stage resources associated with it." ([delete-deployment-request] (portkey.aws/-rest-json-call portkey.aws.apigateway/endpoints "DELETE" "/restapis/{restapi_id}/deployments/{deployment_id}" delete-deployment-request :portkey.aws.apigateway/delete-deployment-request {:payload nil, :move {}, :headers {}, :uri {"restapi_id" "restApiId", "deployment_id" "deploymentId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway/not-found-exception, "BadRequestException" :portkey.aws.apigateway/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-deployment :args (clojure.spec.alpha/tuple :portkey.aws.apigateway/delete-deployment-request) :ret clojure.core/true?)
