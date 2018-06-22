(ns portkey.aws.greengrass (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "greengrass", :region "ap-northeast-1"},
    :ssl-common-name "greengrass.ap-northeast-1.amazonaws.com",
    :endpoint "https://greengrass.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "greengrass", :region "ap-southeast-2"},
    :ssl-common-name "greengrass.ap-southeast-2.amazonaws.com",
    :endpoint "https://greengrass.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "greengrass", :region "eu-central-1"},
    :ssl-common-name "greengrass.eu-central-1.amazonaws.com",
    :endpoint "https://greengrass.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "greengrass", :region "us-west-2"},
    :ssl-common-name "greengrass.us-west-2.amazonaws.com",
    :endpoint "https://greengrass.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "greengrass", :region "us-east-1"},
    :ssl-common-name "greengrass.us-east-1.amazonaws.com",
    :endpoint "https://greengrass.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.greengrass/update-resource-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/software-to-update (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"core" "core", :core "core", "ota_agent" "ota_agent", :ota-agent "ota_agent"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass.device-definition-version/devices (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-device))
(clojure.spec.alpha/def :portkey.aws.greengrass/device-definition-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.device-definition-version/Devices] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-function-definition-request/function-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-function-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-function-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-function-definition-request/FunctionDefinitionId] :opt-un [:portkey.aws.greengrass.update-function-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-version-response/definition (clojure.spec.alpha/and :portkey.aws.greengrass/core-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-core-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-core-definition-version-response/Arn :portkey.aws.greengrass.get-core-definition-version-response/CreationTimestamp :portkey.aws.greengrass.get-core-definition-version-response/Definition :portkey.aws.greengrass.get-core-definition-version-response/Id :portkey.aws.greengrass.get-core-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass/ErrorDetails :portkey.aws.greengrass.internal-server-error-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.group-certificate-authority-properties/group-certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-certificate-authority-properties/group-certificate-authority-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/group-certificate-authority-properties (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.group-certificate-authority-properties/GroupCertificateAuthorityArn :portkey.aws.greengrass.group-certificate-authority-properties/GroupCertificateAuthorityId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/empty (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-logger-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-logger-definition-version-response/Arn :portkey.aws.greengrass.create-logger-definition-version-response/CreationTimestamp :portkey.aws.greengrass.create-logger-definition-version-response/Id :portkey.aws.greengrass.create-logger-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-request/initial-version (clojure.spec.alpha/and :portkey.aws.greengrass/core-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-core-definition-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-core-definition-request/AmznClientToken :portkey.aws.greengrass.create-core-definition-request/InitialVersion :portkey.aws.greengrass.create-core-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.definition-information/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.definition-information/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.definition-information/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.definition-information/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.definition-information/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.definition-information/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.definition-information/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/definition-information (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.definition-information/Arn :portkey.aws.greengrass.definition-information/CreationTimestamp :portkey.aws.greengrass.definition-information/Id :portkey.aws.greengrass.definition-information/LastUpdatedTimestamp :portkey.aws.greengrass.definition-information/LatestVersion :portkey.aws.greengrass.definition-information/LatestVersionArn :portkey.aws.greengrass.definition-information/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definition-versions-request/core-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definition-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definition-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-core-definition-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-core-definition-versions-request/CoreDefinitionId] :opt-un [:portkey.aws.greengrass.list-core-definition-versions-request/MaxResults :portkey.aws.greengrass.list-core-definition-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.greengrass.update-resource-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-resource-definition-request/resource-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-resource-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-resource-definition-request/ResourceDefinitionId] :opt-un [:portkey.aws.greengrass.update-resource-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-device-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-device-definition-version-response/Arn :portkey.aws.greengrass.create-device-definition-version-response/CreationTimestamp :portkey.aws.greengrass.create-device-definition-version-response/Id :portkey.aws.greengrass.create-device-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-version-response/definition (clojure.spec.alpha/and :portkey.aws.greengrass/function-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-function-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-function-definition-version-response/Arn :portkey.aws.greengrass.get-function-definition-version-response/CreationTimestamp :portkey.aws.greengrass.get-function-definition-version-response/Definition :portkey.aws.greengrass.get-function-definition-version-response/Id :portkey.aws.greengrass.get-function-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/delete-logger-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-deployment-status-response/deployment-status (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-deployment-status-response/error-message (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-deployment-status-response/updated-at (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-deployment-status-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-deployment-status-response/DeploymentStatus :portkey.aws.greengrass/DeploymentType :portkey.aws.greengrass/ErrorDetails :portkey.aws.greengrass.get-deployment-status-response/ErrorMessage :portkey.aws.greengrass.get-deployment-status-response/UpdatedAt] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definition-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definition-versions-response/versions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-version-information))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-function-definition-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-function-definition-versions-response/NextToken :portkey.aws.greengrass.list-function-definition-versions-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-version-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-version-request/core-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-version-request/cores (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-core))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-core-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-core-definition-version-request/CoreDefinitionId] :opt-un [:portkey.aws.greengrass.create-core-definition-version-request/AmznClientToken :portkey.aws.greengrass.create-core-definition-version-request/Cores] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-request/initial-version (clojure.spec.alpha/and :portkey.aws.greengrass/logger-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-logger-definition-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-logger-definition-request/AmznClientToken :portkey.aws.greengrass.create-logger-definition-request/InitialVersion :portkey.aws.greengrass.create-logger-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-version-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-version-request/logger-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-version-request/loggers (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-logger))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-logger-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-logger-definition-version-request/LoggerDefinitionId] :opt-un [:portkey.aws.greengrass.create-logger-definition-version-request/AmznClientToken :portkey.aws.greengrass.create-logger-definition-version-request/Loggers] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.associate-role-to-group-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.associate-role-to-group-request/role-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/associate-role-to-group-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.associate-role-to-group-request/GroupId] :opt-un [:portkey.aws.greengrass.associate-role-to-group-request/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-version-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-version-request/device-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-version-request/devices (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-device))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-device-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-device-definition-version-request/DeviceDefinitionId] :opt-un [:portkey.aws.greengrass.create-device-definition-version-request/AmznClientToken :portkey.aws.greengrass.create-device-definition-version-request/Devices] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.deployment/created-at (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.deployment/deployment-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.deployment/deployment-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.deployment/group-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/deployment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.deployment/CreatedAt :portkey.aws.greengrass.deployment/DeploymentArn :portkey.aws.greengrass.deployment/DeploymentId :portkey.aws.greengrass/DeploymentType :portkey.aws.greengrass.deployment/GroupArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass/ErrorDetails :portkey.aws.greengrass.bad-request-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-resource-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-resource-definition-response/Arn :portkey.aws.greengrass.create-resource-definition-response/CreationTimestamp :portkey.aws.greengrass.create-resource-definition-response/Id :portkey.aws.greengrass.create-resource-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.create-resource-definition-response/LatestVersion :portkey.aws.greengrass.create-resource-definition-response/LatestVersionArn :portkey.aws.greengrass.create-resource-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-request/device-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-device-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-device-definition-request/DeviceDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/deployment-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"NewDeployment" "NewDeployment", :new-deployment "NewDeployment", "Redeployment" "Redeployment", :redeployment "Redeployment", "ResetDeployment" "ResetDeployment", :reset-deployment "ResetDeployment", "ForceResetDeployment" "ForceResetDeployment", :force-reset-deployment "ForceResetDeployment"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definition-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definition-versions-response/versions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-version-information))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-resource-definition-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-resource-definition-versions-response/NextToken :portkey.aws.greengrass.list-resource-definition-versions-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definition-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definition-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definition-versions-request/subscription-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-subscription-definition-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-subscription-definition-versions-request/SubscriptionDefinitionId] :opt-un [:portkey.aws.greengrass.list-subscription-definition-versions-request/MaxResults :portkey.aws.greengrass.list-subscription-definition-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/logger-level (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:warn "WARN", "WARN" "WARN", :debug "DEBUG", "ERROR" "ERROR", :fatal "FATAL", "DEBUG" "DEBUG", "FATAL" "FATAL", :info "INFO", :error "ERROR", "INFO" "INFO"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass/get-service-role-for-account-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/encoding-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"binary" "binary", :binary "binary", "json" "json", :json "json"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass.connectivity-info/host-address (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.connectivity-info/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.connectivity-info/metadata (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.connectivity-info/port-number (clojure.spec.alpha/and :portkey.aws.greengrass/--integer))
(clojure.spec.alpha/def :portkey.aws.greengrass/connectivity-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.connectivity-info/HostAddress :portkey.aws.greengrass.connectivity-info/Id :portkey.aws.greengrass.connectivity-info/Metadata :portkey.aws.greengrass.connectivity-info/PortNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.associate-service-role-to-account-request/role-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/associate-service-role-to-account-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.associate-service-role-to-account-request/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/permission (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ro" "ro", :ro "ro", "rw" "rw", :rw "rw"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-logger-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-subscription-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-subscription-definition-response/Arn :portkey.aws.greengrass.create-subscription-definition-response/CreationTimestamp :portkey.aws.greengrass.create-subscription-definition-response/Id :portkey.aws.greengrass.create-subscription-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.create-subscription-definition-response/LatestVersion :portkey.aws.greengrass.create-subscription-definition-response/LatestVersionArn :portkey.aws.greengrass.create-subscription-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-version-request/subscription-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-version-request/subscription-definition-version-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-subscription-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-subscription-definition-version-request/SubscriptionDefinitionId :portkey.aws.greengrass.get-subscription-definition-version-request/SubscriptionDefinitionVersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-group-information (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/group-information) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definition-versions-request/logger-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definition-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definition-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-logger-definition-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-logger-definition-versions-request/LoggerDefinitionId] :opt-un [:portkey.aws.greengrass.list-logger-definition-versions-request/MaxResults :portkey.aws.greengrass.list-logger-definition-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definitions-response/definitions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-definition-information))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-function-definitions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-function-definitions-response/Definitions :portkey.aws.greengrass.list-function-definitions-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/logger-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"FileSystem" "FileSystem", :file-system "FileSystem", "AWSCloudWatch" "AWSCloudWatch", :awscloud-watch "AWSCloudWatch"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-core-definitions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-core-definitions-request/MaxResults :portkey.aws.greengrass.list-core-definitions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-device-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-device-definition-response/Arn :portkey.aws.greengrass.get-device-definition-response/CreationTimestamp :portkey.aws.greengrass.get-device-definition-response/Id :portkey.aws.greengrass.get-device-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.get-device-definition-response/LatestVersion :portkey.aws.greengrass.get-device-definition-response/LatestVersionArn :portkey.aws.greengrass.get-device-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-subscription (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/subscription) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-version-request/resource-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-version-request/resource-definition-version-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-resource-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-resource-definition-version-request/ResourceDefinitionVersionId :portkey.aws.greengrass.get-resource-definition-version-request/ResourceDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.associate-service-role-to-account-response/associated-at (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/associate-service-role-to-account-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.associate-service-role-to-account-response/AssociatedAt] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-associated-role-response/associated-at (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-associated-role-response/role-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-associated-role-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-associated-role-response/AssociatedAt :portkey.aws.greengrass.get-associated-role-response/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-certificate-authority-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-certificate-authority-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-group-certificate-authority-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-group-certificate-authority-request/GroupId] :opt-un [:portkey.aws.greengrass.create-group-certificate-authority-request/AmznClientToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-resource-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-resource-definition-response/Arn :portkey.aws.greengrass.get-resource-definition-response/CreationTimestamp :portkey.aws.greengrass.get-resource-definition-response/Id :portkey.aws.greengrass.get-resource-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.get-resource-definition-response/LatestVersion :portkey.aws.greengrass.get-resource-definition-response/LatestVersionArn :portkey.aws.greengrass.get-resource-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-function-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definition-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definition-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definition-versions-request/resource-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-resource-definition-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-resource-definition-versions-request/ResourceDefinitionId] :opt-un [:portkey.aws.greengrass.list-resource-definition-versions-request/MaxResults :portkey.aws.greengrass.list-resource-definition-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-authority-response/group-certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-authority-response/group-certificate-authority-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-authority-response/pem-encoded-certificate (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-group-certificate-authority-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-group-certificate-authority-response/GroupCertificateAuthorityArn :portkey.aws.greengrass.get-group-certificate-authority-response/GroupCertificateAuthorityId :portkey.aws.greengrass.get-group-certificate-authority-response/PemEncodedCertificate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definitions-response/definitions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-definition-information))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-core-definitions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-core-definitions-response/Definitions :portkey.aws.greengrass.list-core-definitions-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.disassociate-role-from-group-response/disassociated-at (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/disassociate-role-from-group-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.disassociate-role-from-group-response/DisassociatedAt] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-version-request/function-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-version-request/function-definition-version-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-function-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-function-definition-version-request/FunctionDefinitionId :portkey.aws.greengrass.get-function-definition-version-request/FunctionDefinitionVersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-associated-role-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-associated-role-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-associated-role-request/GroupId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definition-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definition-versions-response/versions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-version-information))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-device-definition-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-device-definition-versions-response/NextToken :portkey.aws.greengrass.list-device-definition-versions-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.function-definition-version/functions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-function))
(clojure.spec.alpha/def :portkey.aws.greengrass/function-definition-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.function-definition-version/Functions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.logger-definition-version/loggers (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-logger))
(clojure.spec.alpha/def :portkey.aws.greengrass/logger-definition-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.logger-definition-version/Loggers] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-request/subscription-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-subscription-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-subscription-definition-request/SubscriptionDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-version-request/device-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-version-request/device-definition-version-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-device-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-device-definition-version-request/DeviceDefinitionVersionId :portkey.aws.greengrass.get-device-definition-version-request/DeviceDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-subscription-definitions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-subscription-definitions-request/MaxResults :portkey.aws.greengrass.list-subscription-definitions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-subscription-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-subscription-definition-request/subscription-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-subscription-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-subscription-definition-request/SubscriptionDefinitionId] :opt-un [:portkey.aws.greengrass.update-subscription-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-group-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-group-response/Arn :portkey.aws.greengrass.get-group-response/CreationTimestamp :portkey.aws.greengrass.get-group-response/Id :portkey.aws.greengrass.get-group-response/LastUpdatedTimestamp :portkey.aws.greengrass.get-group-response/LatestVersion :portkey.aws.greengrass.get-group-response/LatestVersionArn :portkey.aws.greengrass.get-group-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definitions-response/definitions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-definition-information))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-resource-definitions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-resource-definitions-response/Definitions :portkey.aws.greengrass.list-resource-definitions-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-group-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.disassociate-role-from-group-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/disassociate-role-from-group-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.disassociate-role-from-group-request/GroupId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-group-certificate-configuration-response/certificate-authority-expiry-in-milliseconds (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-group-certificate-configuration-response/certificate-expiry-in-milliseconds (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-group-certificate-configuration-response/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-group-certificate-configuration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.update-group-certificate-configuration-response/CertificateAuthorityExpiryInMilliseconds :portkey.aws.greengrass.update-group-certificate-configuration-response/CertificateExpiryInMilliseconds :portkey.aws.greengrass.update-group-certificate-configuration-response/GroupId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-group-certificate-authority-properties (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/group-certificate-authority-properties) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-group-versions-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-group-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-group-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-group-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-group-versions-request/GroupId] :opt-un [:portkey.aws.greengrass.list-group-versions-request/MaxResults :portkey.aws.greengrass.list-group-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-groups-response/groups (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-group-information))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-groups-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-groups-response/Groups :portkey.aws.greengrass.list-groups-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-targets (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.group-certificate-configuration/certificate-authority-expiry-in-milliseconds (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-certificate-configuration/certificate-expiry-in-milliseconds (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-certificate-configuration/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/group-certificate-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.group-certificate-configuration/CertificateAuthorityExpiryInMilliseconds :portkey.aws.greengrass.group-certificate-configuration/CertificateExpiryInMilliseconds :portkey.aws.greengrass.group-certificate-configuration/GroupId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-device-definitions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-device-definitions-request/MaxResults :portkey.aws.greengrass.list-device-definitions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-subscription-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-subscription-definition-version-response/Arn :portkey.aws.greengrass.create-subscription-definition-version-response/CreationTimestamp :portkey.aws.greengrass.create-subscription-definition-version-response/Id :portkey.aws.greengrass.create-subscription-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/delete-group-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.associate-role-to-group-response/associated-at (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/associate-role-to-group-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.associate-role-to-group-response/AssociatedAt] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-connectivity-info-request/connectivity-info (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-connectivity-info))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-connectivity-info-request/thing-name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-connectivity-info-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-connectivity-info-request/ThingName] :opt-un [:portkey.aws.greengrass.update-connectivity-info-request/ConnectivityInfo] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-device (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/device) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-core (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/core) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.version-information/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.version-information/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.version-information/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.version-information/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/version-information (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.version-information/Arn :portkey.aws.greengrass.version-information/CreationTimestamp :portkey.aws.greengrass.version-information/Id :portkey.aws.greengrass.version-information/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-core-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-core-definition-response/Arn :portkey.aws.greengrass.get-core-definition-response/CreationTimestamp :portkey.aws.greengrass.get-core-definition-response/Id :portkey.aws.greengrass.get-core-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.get-core-definition-response/LatestVersion :portkey.aws.greengrass.get-core-definition-response/LatestVersionArn :portkey.aws.greengrass.get-core-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-version-response/definition (clojure.spec.alpha/and :portkey.aws.greengrass/logger-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-logger-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-logger-definition-version-response/Arn :portkey.aws.greengrass.get-logger-definition-version-response/CreationTimestamp :portkey.aws.greengrass.get-logger-definition-version-response/Definition :portkey.aws.greengrass.get-logger-definition-version-response/Id :portkey.aws.greengrass.get-logger-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definition-versions-request/function-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definition-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definition-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-function-definition-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-function-definition-versions-request/FunctionDefinitionId] :opt-un [:portkey.aws.greengrass.list-function-definition-versions-request/MaxResults :portkey.aws.greengrass.list-function-definition-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-request/initial-version (clojure.spec.alpha/and :portkey.aws.greengrass/function-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-function-definition-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-function-definition-request/AmznClientToken :portkey.aws.greengrass.create-function-definition-request/InitialVersion :portkey.aws.greengrass.create-function-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.s3-machine-learning-model-resource-data/destination-path (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.s3-machine-learning-model-resource-data/s3-uri (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/s3-machine-learning-model-resource-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.s3-machine-learning-model-resource-data/DestinationPath :portkey.aws.greengrass.s3-machine-learning-model-resource-data/S3Uri] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-logger-definitions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-logger-definitions-request/MaxResults :portkey.aws.greengrass.list-logger-definitions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-targets-architecture (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"armv7l" "armv7l", :armv7l "armv7l", "x86_64" "x86_64", :x86-64 "x86_64", "aarch64" "aarch64", :aarch64 "aarch64"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-core-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-device-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definitions-response/definitions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-definition-information))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-device-definitions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-device-definitions-response/Definitions :portkey.aws.greengrass.list-device-definitions-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-device-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-device-definition-response/Arn :portkey.aws.greengrass.create-device-definition-response/CreationTimestamp :portkey.aws.greengrass.create-device-definition-response/Id :portkey.aws.greengrass.create-device-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.create-device-definition-response/LatestVersion :portkey.aws.greengrass.create-device-definition-response/LatestVersionArn :portkey.aws.greengrass.create-device-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.group-version/core-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-version/device-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-version/function-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-version/logger-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-version/resource-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-version/subscription-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/group-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.group-version/CoreDefinitionVersionArn :portkey.aws.greengrass.group-version/DeviceDefinitionVersionArn :portkey.aws.greengrass.group-version/FunctionDefinitionVersionArn :portkey.aws.greengrass.group-version/LoggerDefinitionVersionArn :portkey.aws.greengrass.group-version/ResourceDefinitionVersionArn :portkey.aws.greengrass.group-version/SubscriptionDefinitionVersionArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-request/resource-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-resource-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-resource-definition-request/ResourceDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.group-information/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-information/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-information/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-information/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-information/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-information/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-information/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/group-information (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.group-information/Arn :portkey.aws.greengrass.group-information/CreationTimestamp :portkey.aws.greengrass.group-information/Id :portkey.aws.greengrass.group-information/LastUpdatedTimestamp :portkey.aws.greengrass.group-information/LatestVersion :portkey.aws.greengrass.group-information/LatestVersionArn :portkey.aws.greengrass.group-information/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.delete-function-definition-request/function-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/delete-function-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.delete-function-definition-request/FunctionDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.error-detail/detailed-error-code (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.error-detail/detailed-error-message (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/error-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.error-detail/DetailedErrorCode :portkey.aws.greengrass.error-detail/DetailedErrorMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-version-response/definition (clojure.spec.alpha/and :portkey.aws.greengrass/subscription-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-subscription-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-subscription-definition-version-response/Arn :portkey.aws.greengrass.get-subscription-definition-version-response/CreationTimestamp :portkey.aws.greengrass.get-subscription-definition-version-response/Definition :portkey.aws.greengrass.get-subscription-definition-version-response/Id :portkey.aws.greengrass.get-subscription-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definition-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definition-versions-response/versions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-version-information))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-logger-definition-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-logger-definition-versions-response/NextToken :portkey.aws.greengrass.list-logger-definition-versions-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-resource (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/resource) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-version-request/logger-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-version-request/logger-definition-version-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-logger-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-logger-definition-version-request/LoggerDefinitionVersionId :portkey.aws.greengrass.get-logger-definition-version-request/LoggerDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definitions-response/definitions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-definition-information))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-logger-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-logger-definitions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-logger-definitions-response/Definitions :portkey.aws.greengrass.list-logger-definitions-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-service-role-for-account-response/associated-at (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-service-role-for-account-response/role-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-service-role-for-account-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-service-role-for-account-response/AssociatedAt :portkey.aws.greengrass.get-service-role-for-account-response/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-agent-log-level (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:warn "WARN", :trace "TRACE", "WARN" "WARN", :verbose "VERBOSE", :debug "DEBUG", "ERROR" "ERROR", :fatal "FATAL", "NONE" "NONE", "TRACE" "TRACE", "DEBUG" "DEBUG", "VERBOSE" "VERBOSE", "FATAL" "FATAL", :info "INFO", :error "ERROR", "INFO" "INFO", :none "NONE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-group-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-group-versions-response/versions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-version-information))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-group-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-group-versions-response/NextToken :portkey.aws.greengrass.list-group-versions-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/delete-function-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-configuration-response/certificate-authority-expiry-in-milliseconds (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-configuration-response/certificate-expiry-in-milliseconds (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-configuration-response/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-group-certificate-configuration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-group-certificate-configuration-response/CertificateAuthorityExpiryInMilliseconds :portkey.aws.greengrass.get-group-certificate-configuration-response/CertificateExpiryInMilliseconds :portkey.aws.greengrass.get-group-certificate-configuration-response/GroupId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-connectivity-info-response/connectivity-info (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-connectivity-info))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-connectivity-info-response/message (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-connectivity-info-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-connectivity-info-response/ConnectivityInfo :portkey.aws.greengrass.get-connectivity-info-response/Message] :locations {"message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-deployments-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-deployments-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-deployments-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-deployments-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-deployments-request/GroupId] :opt-un [:portkey.aws.greengrass.list-deployments-request/MaxResults :portkey.aws.greengrass.list-deployments-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-version-information (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/version-information) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.resource-definition-version/resources (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-resource))
(clojure.spec.alpha/def :portkey.aws.greengrass/resource-definition-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.resource-definition-version/Resources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/delete-core-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-function (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/function) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.disassociate-service-role-from-account-response/disassociated-at (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/disassociate-service-role-from-account-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.disassociate-service-role-from-account-response/DisassociatedAt] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-group-certificate-authorities-response/group-certificate-authorities (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-group-certificate-authority-properties))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-group-certificate-authorities-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-group-certificate-authorities-response/GroupCertificateAuthorities] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.core-definition-version/cores (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-core))
(clojure.spec.alpha/def :portkey.aws.greengrass/core-definition-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.core-definition-version/Cores] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-deployment-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-deployment-request/deployment-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-deployment-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-deployment-request/group-version-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-deployment-request/GroupId] :opt-un [:portkey.aws.greengrass.create-deployment-request/AmznClientToken :portkey.aws.greengrass.create-deployment-request/DeploymentId :portkey.aws.greengrass/DeploymentType :portkey.aws.greengrass.create-deployment-request/GroupVersionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-versions-response/versions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-version-information))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-versions-response/NextToken :portkey.aws.greengrass.list-versions-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-software-update-job-response/iot-job-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-software-update-job-response/iot-job-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-software-update-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-software-update-job-response/IotJobArn :portkey.aws.greengrass.create-software-update-job-response/IotJobId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.subscription-definition-version/subscriptions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-subscription))
(clojure.spec.alpha/def :portkey.aws.greengrass/subscription-definition-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.subscription-definition-version/Subscriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.delete-group-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/delete-group-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.delete-group-request/GroupId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.delete-subscription-definition-request/subscription-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/delete-subscription-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.delete-subscription-definition-request/SubscriptionDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-group-certificate-authorities-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-group-certificate-authorities-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-group-certificate-authorities-request/GroupId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definition-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-core-definition-versions-response/versions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-version-information))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-core-definition-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-core-definition-versions-response/NextToken :portkey.aws.greengrass.list-core-definition-versions-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-certificate-authority-response/group-certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-group-certificate-authority-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-group-certificate-authority-response/GroupCertificateAuthorityArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-logger (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/logger) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-targets-operating-system (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ubuntu" "ubuntu", :ubuntu "ubuntu", "raspbian" "raspbian", :raspbian "raspbian", "amazon_linux" "amazon_linux", :amazon-linux "amazon_linux"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-logger-definition-request/logger-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-logger-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-logger-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-logger-definition-request/LoggerDefinitionId] :opt-un [:portkey.aws.greengrass.update-logger-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-core-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-core-definition-version-response/Arn :portkey.aws.greengrass.create-core-definition-version-response/CreationTimestamp :portkey.aws.greengrass.create-core-definition-version-response/Id :portkey.aws.greengrass.create-core-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.delete-core-definition-request/core-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/delete-core-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.delete-core-definition-request/CoreDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-group-certificate-configuration-request/certificate-expiry-in-milliseconds (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-group-certificate-configuration-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-group-certificate-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-group-certificate-configuration-request/GroupId] :opt-un [:portkey.aws.greengrass.update-group-certificate-configuration-request/CertificateExpiryInMilliseconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-deployment-status-request/deployment-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-deployment-status-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-deployment-status-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-deployment-status-request/GroupId :portkey.aws.greengrass.get-deployment-status-request/DeploymentId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-request/core-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-request/device-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-request/function-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-request/logger-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-request/resource-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-request/subscription-definition-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-group-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-group-version-request/GroupId] :opt-un [:portkey.aws.greengrass.create-group-version-request/AmznClientToken :portkey.aws.greengrass.create-group-version-request/CoreDefinitionVersionArn :portkey.aws.greengrass.create-group-version-request/DeviceDefinitionVersionArn :portkey.aws.greengrass.create-group-version-request/FunctionDefinitionVersionArn :portkey.aws.greengrass.create-group-version-request/LoggerDefinitionVersionArn :portkey.aws.greengrass.create-group-version-request/ResourceDefinitionVersionArn :portkey.aws.greengrass.create-group-version-request/SubscriptionDefinitionVersionArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-core-definition-request/core-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-core-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-core-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-core-definition-request/CoreDefinitionId] :opt-un [:portkey.aws.greengrass.update-core-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definitions-response/definitions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-definition-information))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-subscription-definitions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-subscription-definitions-response/Definitions :portkey.aws.greengrass.list-subscription-definitions-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-version-response/definition (clojure.spec.alpha/and :portkey.aws.greengrass/group-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-group-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-group-version-response/Arn :portkey.aws.greengrass.get-group-version-response/CreationTimestamp :portkey.aws.greengrass.get-group-version-response/Definition :portkey.aws.greengrass.get-group-version-response/Id :portkey.aws.greengrass.get-group-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-version-request/core-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-version-request/core-definition-version-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-core-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-core-definition-version-request/CoreDefinitionId :portkey.aws.greengrass.get-core-definition-version-request/CoreDefinitionVersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/update-subscription-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-version-response/definition (clojure.spec.alpha/and :portkey.aws.greengrass/device-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-device-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-device-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-device-definition-version-response/Arn :portkey.aws.greengrass.get-device-definition-version-response/CreationTimestamp :portkey.aws.greengrass.get-device-definition-version-response/Definition :portkey.aws.greengrass.get-device-definition-version-response/Id :portkey.aws.greengrass.get-device-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-version-response/definition (clojure.spec.alpha/and :portkey.aws.greengrass/resource-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-resource-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-resource-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-resource-definition-version-response/Arn :portkey.aws.greengrass.get-resource-definition-version-response/CreationTimestamp :portkey.aws.greengrass.get-resource-definition-version-response/Definition :portkey.aws.greengrass.get-resource-definition-version-response/Id :portkey.aws.greengrass.get-resource-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-function-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-function-definition-version-response/Arn :portkey.aws.greengrass.create-function-definition-version-response/CreationTimestamp :portkey.aws.greengrass.create-function-definition-version-response/Id :portkey.aws.greengrass.create-function-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-resource-access-policy (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/resource-access-policy) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.sage-maker-machine-learning-model-resource-data/destination-path (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.sage-maker-machine-learning-model-resource-data/sage-maker-job-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/sage-maker-machine-learning-model-resource-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.sage-maker-machine-learning-model-resource-data/DestinationPath :portkey.aws.greengrass.sage-maker-machine-learning-model-resource-data/SageMakerJobArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-software-update-job-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-software-update-job-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-software-update-job-request/AmznClientToken :portkey.aws.greengrass/S3UrlSignerRole :portkey.aws.greengrass/SoftwareToUpdate :portkey.aws.greengrass/UpdateAgentLogLevel :portkey.aws.greengrass/UpdateTargets :portkey.aws.greengrass/UpdateTargetsArchitecture :portkey.aws.greengrass/UpdateTargetsOperatingSystem] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-resource-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-resource-definitions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-resource-definitions-request/MaxResults :portkey.aws.greengrass.list-resource-definitions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration/environment (clojure.spec.alpha/and :portkey.aws.greengrass/function-configuration-environment))
(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration/exec-args (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration/executable (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration/memory-size (clojure.spec.alpha/and :portkey.aws.greengrass/--integer))
(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration/pinned (clojure.spec.alpha/and :portkey.aws.greengrass/--boolean))
(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration/timeout (clojure.spec.alpha/and :portkey.aws.greengrass/--integer))
(clojure.spec.alpha/def :portkey.aws.greengrass/function-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass/EncodingType :portkey.aws.greengrass.function-configuration/Environment :portkey.aws.greengrass.function-configuration/ExecArgs :portkey.aws.greengrass.function-configuration/Executable :portkey.aws.greengrass.function-configuration/MemorySize :portkey.aws.greengrass.function-configuration/Pinned :portkey.aws.greengrass.function-configuration/Timeout] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definition-versions-request/device-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definition-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-device-definition-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-device-definition-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.list-device-definition-versions-request/DeviceDefinitionId] :opt-un [:portkey.aws.greengrass.list-device-definition-versions-request/MaxResults :portkey.aws.greengrass.list-device-definition-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-groups-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-groups-request/MaxResults :portkey.aws.greengrass.list-groups-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.reset-deployments-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.reset-deployments-request/force (clojure.spec.alpha/and :portkey.aws.greengrass/--boolean))
(clojure.spec.alpha/def :portkey.aws.greengrass.reset-deployments-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/reset-deployments-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.reset-deployments-request/GroupId] :opt-un [:portkey.aws.greengrass.reset-deployments-request/AmznClientToken :portkey.aws.greengrass.reset-deployments-request/Force] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definition-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-subscription-definition-versions-response/versions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-version-information))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-subscription-definition-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-subscription-definition-versions-response/NextToken :portkey.aws.greengrass.list-subscription-definition-versions-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.delete-resource-definition-request/resource-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/delete-resource-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.delete-resource-definition-request/ResourceDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration-environment/access-sysfs (clojure.spec.alpha/and :portkey.aws.greengrass/--boolean))
(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration-environment/resource-access-policies (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-resource-access-policy))
(clojure.spec.alpha/def :portkey.aws.greengrass.function-configuration-environment/variables (clojure.spec.alpha/and :portkey.aws.greengrass/--map-of--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/function-configuration-environment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.function-configuration-environment/AccessSysfs :portkey.aws.greengrass.function-configuration-environment/ResourceAccessPolicies :portkey.aws.greengrass.function-configuration-environment/Variables] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-group-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-group-response/Arn :portkey.aws.greengrass.create-group-response/CreationTimestamp :portkey.aws.greengrass.create-group-response/Id :portkey.aws.greengrass.create-group-response/LastUpdatedTimestamp :portkey.aws.greengrass.create-group-response/LatestVersion :portkey.aws.greengrass.create-group-response/LatestVersionArn :portkey.aws.greengrass.create-group-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/error-details (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/error-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-function-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-function-definitions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-function-definitions-request/MaxResults :portkey.aws.greengrass.list-function-definitions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-version-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-version-request/resource-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-version-request/resources (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-resource))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-resource-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-resource-definition-version-request/ResourceDefinitionId] :opt-un [:portkey.aws.greengrass.create-resource-definition-version-request/AmznClientToken :portkey.aws.greengrass.create-resource-definition-version-request/Resources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-request/logger-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-logger-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-logger-definition-request/LoggerDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.subscription/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.subscription/source (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.subscription/subject (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.subscription/target (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/subscription (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.subscription/Id :portkey.aws.greengrass.subscription/Source :portkey.aws.greengrass.subscription/Subject :portkey.aws.greengrass.subscription/Target] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-request/initial-version (clojure.spec.alpha/and :portkey.aws.greengrass/group-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-group-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-group-request/AmznClientToken :portkey.aws.greengrass.create-group-request/InitialVersion :portkey.aws.greengrass.create-group-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-connectivity-info (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/connectivity-info) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.core/certificate-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.core/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.core/sync-shadow (clojure.spec.alpha/and :portkey.aws.greengrass/--boolean))
(clojure.spec.alpha/def :portkey.aws.greengrass.core/thing-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/core (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.core/CertificateArn :portkey.aws.greengrass.core/Id :portkey.aws.greengrass.core/SyncShadow :portkey.aws.greengrass.core/ThingArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-version-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-version-request/group-version-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-group-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-group-version-request/GroupVersionId :portkey.aws.greengrass.get-group-version-request/GroupId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/disassociate-service-role-from-account-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-version-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-version-request/subscription-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-version-request/subscriptions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-subscription))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-subscription-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-subscription-definition-version-request/SubscriptionDefinitionId] :opt-un [:portkey.aws.greengrass.create-subscription-definition-version-request/AmznClientToken :portkey.aws.greengrass.create-subscription-definition-version-request/Subscriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-configuration-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-group-certificate-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-group-certificate-configuration-request/GroupId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--list-of-definition-information (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/definition-information) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-deployments-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-deployments-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass/Deployments :portkey.aws.greengrass.list-deployments-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.resource/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.resource/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.resource/Id :portkey.aws.greengrass.resource/Name :portkey.aws.greengrass/ResourceDataContainer] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.group-owner-setting/auto-add-group-owner (clojure.spec.alpha/and :portkey.aws.greengrass/--boolean))
(clojure.spec.alpha/def :portkey.aws.greengrass.group-owner-setting/group-owner (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/group-owner-setting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.group-owner-setting/AutoAddGroupOwner :portkey.aws.greengrass.group-owner-setting/GroupOwner] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/resource-data-container (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass/LocalDeviceResourceData :portkey.aws.greengrass/LocalVolumeResourceData :portkey.aws.greengrass/S3MachineLearningModelResourceData :portkey.aws.greengrass/SageMakerMachineLearningModelResourceData] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-version-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-version-request/function-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-version-request/functions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-function))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-function-definition-version-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.create-function-definition-version-request/FunctionDefinitionId] :opt-un [:portkey.aws.greengrass.create-function-definition-version-request/AmznClientToken :portkey.aws.greengrass.create-function-definition-version-request/Functions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-group-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-group-request/GroupId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.function/function-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.function/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/function (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.function/FunctionArn :portkey.aws.greengrass/FunctionConfiguration :portkey.aws.greengrass.function/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.greengrass.reset-deployments-response/deployment-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.reset-deployments-response/deployment-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/reset-deployments-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.reset-deployments-response/DeploymentArn :portkey.aws.greengrass.reset-deployments-response/DeploymentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-deployment-response/deployment-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-deployment-response/deployment-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-deployment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-deployment-response/DeploymentArn :portkey.aws.greengrass.create-deployment-response/DeploymentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.delete-logger-definition-request/logger-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/delete-logger-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.delete-logger-definition-request/LoggerDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.delete-device-definition-request/device-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/delete-device-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.delete-device-definition-request/DeviceDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.local-volume-resource-data/destination-path (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.local-volume-resource-data/source-path (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/local-volume-resource-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.local-volume-resource-data/DestinationPath :portkey.aws.greengrass/GroupOwnerSetting :portkey.aws.greengrass.local-volume-resource-data/SourcePath] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-logger-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-logger-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-logger-definition-response/Arn :portkey.aws.greengrass.get-logger-definition-response/CreationTimestamp :portkey.aws.greengrass.get-logger-definition-response/Id :portkey.aws.greengrass.get-logger-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.get-logger-definition-response/LatestVersion :portkey.aws.greengrass.get-logger-definition-response/LatestVersionArn :portkey.aws.greengrass.get-logger-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-request/initial-version (clojure.spec.alpha/and :portkey.aws.greengrass/subscription-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-subscription-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-subscription-definition-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-subscription-definition-request/AmznClientToken :portkey.aws.greengrass.create-subscription-definition-request/InitialVersion :portkey.aws.greengrass.create-subscription-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/delete-subscription-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-device-definition-request/device-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-device-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-device-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-device-definition-request/DeviceDefinitionId] :opt-un [:portkey.aws.greengrass.update-device-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-subscription-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-subscription-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-subscription-definition-response/Arn :portkey.aws.greengrass.get-subscription-definition-response/CreationTimestamp :portkey.aws.greengrass.get-subscription-definition-response/Id :portkey.aws.greengrass.get-subscription-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.get-subscription-definition-response/LatestVersion :portkey.aws.greengrass.get-subscription-definition-response/LatestVersionArn :portkey.aws.greengrass.get-subscription-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-core-definition-request/core-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-core-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-core-definition-request/CoreDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-authority-request/certificate-authority-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-group-certificate-authority-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-group-certificate-authority-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-group-certificate-authority-request/CertificateAuthorityId :portkey.aws.greengrass.get-group-certificate-authority-request/GroupId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-request/initial-version (clojure.spec.alpha/and :portkey.aws.greengrass/resource-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-resource-definition-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-resource-definition-request/AmznClientToken :portkey.aws.greengrass.create-resource-definition-request/InitialVersion :portkey.aws.greengrass.create-resource-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-logger-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-logger-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-logger-definition-response/Arn :portkey.aws.greengrass.create-logger-definition-response/CreationTimestamp :portkey.aws.greengrass.create-logger-definition-response/Id :portkey.aws.greengrass.create-logger-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.create-logger-definition-response/LatestVersion :portkey.aws.greengrass.create-logger-definition-response/LatestVersionArn :portkey.aws.greengrass.create-logger-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/s3-url-signer-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.greengrass.device/certificate-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.device/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.device/sync-shadow (clojure.spec.alpha/and :portkey.aws.greengrass/--boolean))
(clojure.spec.alpha/def :portkey.aws.greengrass.device/thing-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/device (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.device/CertificateArn :portkey.aws.greengrass.device/Id :portkey.aws.greengrass.device/SyncShadow :portkey.aws.greengrass.device/ThingArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/logger-component (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"GreengrassSystem" "GreengrassSystem", :greengrass-system "GreengrassSystem", "Lambda" "Lambda", :lambda "Lambda"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-request/function-definition-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-function-definition-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-function-definition-request/FunctionDefinitionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.resource-access-policy/resource-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/resource-access-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass/Permission :portkey.aws.greengrass.resource-access-policy/ResourceId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-request/amzn-client-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-request/initial-version (clojure.spec.alpha/and :portkey.aws.greengrass/device-definition-version))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-device-definition-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-device-definition-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-device-definition-request/AmznClientToken :portkey.aws.greengrass.create-device-definition-request/InitialVersion :portkey.aws.greengrass.create-device-definition-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-connectivity-info-request/thing-name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-connectivity-info-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.get-connectivity-info-request/ThingName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-group-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-group-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-group-version-response/Arn :portkey.aws.greengrass.create-group-version-response/CreationTimestamp :portkey.aws.greengrass.create-group-version-response/Id :portkey.aws.greengrass.create-group-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.list-definitions-response/definitions (clojure.spec.alpha/and :portkey.aws.greengrass/--list-of-definition-information))
(clojure.spec.alpha/def :portkey.aws.greengrass.list-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/list-definitions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.list-definitions-response/Definitions :portkey.aws.greengrass.list-definitions-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.local-device-resource-data/source-path (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/local-device-resource-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass/GroupOwnerSetting :portkey.aws.greengrass.local-device-resource-data/SourcePath] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-core-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-core-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-core-definition-response/Arn :portkey.aws.greengrass.create-core-definition-response/CreationTimestamp :portkey.aws.greengrass.create-core-definition-response/Id :portkey.aws.greengrass.create-core-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.create-core-definition-response/LatestVersion :portkey.aws.greengrass.create-core-definition-response/LatestVersionArn :portkey.aws.greengrass.create-core-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.general-error/message (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/general-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass/ErrorDetails :portkey.aws.greengrass.general-error/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-function-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-function-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-function-definition-response/Arn :portkey.aws.greengrass.create-function-definition-response/CreationTimestamp :portkey.aws.greengrass.create-function-definition-response/Id :portkey.aws.greengrass.create-function-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.create-function-definition-response/LatestVersion :portkey.aws.greengrass.create-function-definition-response/LatestVersionArn :portkey.aws.greengrass.create-function-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-connectivity-info-response/message (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-connectivity-info-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-connectivity-info-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.update-connectivity-info-response/Message :portkey.aws.greengrass.update-connectivity-info-response/Version] :locations {"message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-response/last-updated-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-response/latest-version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-response/latest-version-arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.get-function-definition-response/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/get-function-definition-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.get-function-definition-response/Arn :portkey.aws.greengrass.get-function-definition-response/CreationTimestamp :portkey.aws.greengrass.get-function-definition-response/Id :portkey.aws.greengrass.get-function-definition-response/LastUpdatedTimestamp :portkey.aws.greengrass.get-function-definition-response/LatestVersion :portkey.aws.greengrass.get-function-definition-response/LatestVersionArn :portkey.aws.greengrass.get-function-definition-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.update-group-request/group-id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.update-group-request/name (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/update-group-request (portkey.aws/json-keys :req-un [:portkey.aws.greengrass.update-group-request/GroupId] :opt-un [:portkey.aws.greengrass.update-group-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/delete-resource-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/--map-of--string (clojure.spec.alpha/map-of :portkey.aws.greengrass/--string :portkey.aws.greengrass/--string))

(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-version-response/arn (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-version-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-version-response/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.create-resource-definition-version-response/version (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass/create-resource-definition-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.create-resource-definition-version-response/Arn :portkey.aws.greengrass.create-resource-definition-version-response/CreationTimestamp :portkey.aws.greengrass.create-resource-definition-version-response/Id :portkey.aws.greengrass.create-resource-definition-version-response/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass.logger/component (clojure.spec.alpha/and :portkey.aws.greengrass/logger-component))
(clojure.spec.alpha/def :portkey.aws.greengrass.logger/id (clojure.spec.alpha/and :portkey.aws.greengrass/--string))
(clojure.spec.alpha/def :portkey.aws.greengrass.logger/level (clojure.spec.alpha/and :portkey.aws.greengrass/logger-level))
(clojure.spec.alpha/def :portkey.aws.greengrass.logger/space (clojure.spec.alpha/and :portkey.aws.greengrass/--integer))
(clojure.spec.alpha/def :portkey.aws.greengrass.logger/type (clojure.spec.alpha/and :portkey.aws.greengrass/logger-type))
(clojure.spec.alpha/def :portkey.aws.greengrass/logger (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.greengrass.logger/Component :portkey.aws.greengrass.logger/Id :portkey.aws.greengrass.logger/Level :portkey.aws.greengrass.logger/Space :portkey.aws.greengrass.logger/Type] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/delete-device-definition-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.greengrass/deployments (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.greengrass/deployment) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.core/defn create-device-definition "Creates a device definition. You may provide the initial version of the device\ndefinition now or use ''CreateDeviceDefinitionVersion'' at a later time." ([] (create-device-definition {})) ([create-device-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/devices" create-device-definition-request :portkey.aws.greengrass/create-device-definition-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/create-device-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-device-definition :args (clojure.spec.alpha/? :portkey.aws.greengrass/create-device-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-device-definition-response))

(clojure.core/defn get-function-definition "Retrieves information about a Lambda function definition, including its creation\ntime and latest version." ([get-function-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/functions/{FunctionDefinitionId}" get-function-definition-request :portkey.aws.greengrass/get-function-definition-request {:payload nil, :move {}, :headers {}, :uri {"FunctionDefinitionId" "FunctionDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-function-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-function-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-function-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-function-definition-response))

(clojure.core/defn delete-group "Deletes a group." ([delete-group-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/groups/{GroupId}" delete-group-request :portkey.aws.greengrass/delete-group-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/delete-group-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/delete-group-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/delete-group-response))

(clojure.core/defn create-device-definition-version "Creates a version of a device definition that has already been defined." ([create-device-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/devices/{DeviceDefinitionId}/versions" create-device-definition-version-request :portkey.aws.greengrass/create-device-definition-version-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"DeviceDefinitionId" "DeviceDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/create-device-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-device-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-device-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-device-definition-version-response))

(clojure.core/defn list-logger-definitions "Retrieves a list of logger definitions." ([] (list-logger-definitions {})) ([list-logger-definitions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/loggers" list-logger-definitions-request :portkey.aws.greengrass/list-logger-definitions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-logger-definitions-response {})))
(clojure.spec.alpha/fdef list-logger-definitions :args (clojure.spec.alpha/? :portkey.aws.greengrass/list-logger-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-logger-definitions-response))

(clojure.core/defn list-function-definitions "Retrieves a list of Lambda function definitions." ([] (list-function-definitions {})) ([list-function-definitions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/functions" list-function-definitions-request :portkey.aws.greengrass/list-function-definitions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-function-definitions-response {})))
(clojure.spec.alpha/fdef list-function-definitions :args (clojure.spec.alpha/? :portkey.aws.greengrass/list-function-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-function-definitions-response))

(clojure.core/defn create-function-definition "Creates a Lambda function definition which contains a list of Lambda functions\nand their configurations to be used in a group. You can create an initial\nversion of the definition by providing a list of Lambda functions and their\nconfigurations now, or use ''CreateFunctionDefinitionVersion'' later." ([] (create-function-definition {})) ([create-function-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/functions" create-function-definition-request :portkey.aws.greengrass/create-function-definition-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/create-function-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-function-definition :args (clojure.spec.alpha/? :portkey.aws.greengrass/create-function-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-function-definition-response))

(clojure.core/defn get-resource-definition-version "Retrieves information about a resource definition version, including which\nresources are included in the version." ([get-resource-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/resources/{ResourceDefinitionId}/versions/{ResourceDefinitionVersionId}" get-resource-definition-version-request :portkey.aws.greengrass/get-resource-definition-version-request {:payload nil, :move {}, :headers {}, :uri {"ResourceDefinitionId" "ResourceDefinitionId", "ResourceDefinitionVersionId" "ResourceDefinitionVersionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-resource-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-resource-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-resource-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-resource-definition-version-response))

(clojure.core/defn create-core-definition "Creates a core definition. You may provide the initial version of the core\ndefinition now or use ''CreateCoreDefinitionVersion'' at a later time. AWS\nGreengrass groups must each contain exactly one AWS Greengrass core." ([] (create-core-definition {})) ([create-core-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/cores" create-core-definition-request :portkey.aws.greengrass/create-core-definition-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/create-core-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-core-definition :args (clojure.spec.alpha/? :portkey.aws.greengrass/create-core-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-core-definition-response))

(clojure.core/defn list-groups "Retrieves a list of groups." ([] (list-groups {})) ([list-groups-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups" list-groups-request :portkey.aws.greengrass/list-groups-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-groups-response {})))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.greengrass/list-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-groups-response))

(clojure.core/defn create-logger-definition "Creates a logger definition. You may provide the initial version of the logger\ndefinition now or use ''CreateLoggerDefinitionVersion'' at a later time." ([] (create-logger-definition {})) ([create-logger-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/loggers" create-logger-definition-request :portkey.aws.greengrass/create-logger-definition-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/create-logger-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-logger-definition :args (clojure.spec.alpha/? :portkey.aws.greengrass/create-logger-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-logger-definition-response))

(clojure.core/defn update-resource-definition "Updates a resource definition." ([update-resource-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/definition/resources/{ResourceDefinitionId}" update-resource-definition-request :portkey.aws.greengrass/update-resource-definition-request {:payload nil, :move {}, :headers {}, :uri {"ResourceDefinitionId" "ResourceDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/update-resource-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef update-resource-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-resource-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-resource-definition-response))

(clojure.core/defn get-subscription-definition-version "Retrieves information about a subscription definition version." ([get-subscription-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/subscriptions/{SubscriptionDefinitionId}/versions/{SubscriptionDefinitionVersionId}" get-subscription-definition-version-request :portkey.aws.greengrass/get-subscription-definition-version-request {:payload nil, :move {}, :headers {}, :uri {"SubscriptionDefinitionId" "SubscriptionDefinitionId", "SubscriptionDefinitionVersionId" "SubscriptionDefinitionVersionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-subscription-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-subscription-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-subscription-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-subscription-definition-version-response))

(clojure.core/defn list-function-definition-versions "Lists the versions of a Lambda function definition." ([list-function-definition-versions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/functions/{FunctionDefinitionId}/versions" list-function-definition-versions-request :portkey.aws.greengrass/list-function-definition-versions-request {:payload nil, :move {}, :headers {}, :uri {"FunctionDefinitionId" "FunctionDefinitionId"}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-function-definition-versions-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef list-function-definition-versions :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-function-definition-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-function-definition-versions-response))

(clojure.core/defn update-logger-definition "Updates a logger definition." ([update-logger-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/definition/loggers/{LoggerDefinitionId}" update-logger-definition-request :portkey.aws.greengrass/update-logger-definition-request {:payload nil, :move {}, :headers {}, :uri {"LoggerDefinitionId" "LoggerDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/update-logger-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef update-logger-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-logger-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-logger-definition-response))

(clojure.core/defn disassociate-service-role-from-account "Disassociates the service role from your account. Without a service role,\ndeployments will not work." ([] (disassociate-service-role-from-account {})) ([disassociate-service-role-from-account-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/servicerole" disassociate-service-role-from-account-request :portkey.aws.greengrass/disassociate-service-role-from-account-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/disassociate-service-role-from-account-response {"InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef disassociate-service-role-from-account :args (clojure.spec.alpha/? :portkey.aws.greengrass/disassociate-service-role-from-account-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/disassociate-service-role-from-account-response))

(clojure.core/defn reset-deployments "Resets a group's deployments." ([reset-deployments-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/groups/{GroupId}/deployments/$reset" reset-deployments-request :portkey.aws.greengrass/reset-deployments-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/reset-deployments-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef reset-deployments :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/reset-deployments-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/reset-deployments-response))

(clojure.core/defn create-subscription-definition-version "Creates a version of a subscription definition which has already been defined." ([create-subscription-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/subscriptions/{SubscriptionDefinitionId}/versions" create-subscription-definition-version-request :portkey.aws.greengrass/create-subscription-definition-version-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"SubscriptionDefinitionId" "SubscriptionDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/create-subscription-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-subscription-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-subscription-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-subscription-definition-version-response))

(clojure.core/defn delete-subscription-definition "Deletes a subscription definition." ([delete-subscription-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/definition/subscriptions/{SubscriptionDefinitionId}" delete-subscription-definition-request :portkey.aws.greengrass/delete-subscription-definition-request {:payload nil, :move {}, :headers {}, :uri {"SubscriptionDefinitionId" "SubscriptionDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/delete-subscription-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef delete-subscription-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/delete-subscription-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/delete-subscription-definition-response))

(clojure.core/defn create-logger-definition-version "Creates a version of a logger definition that has already been defined." ([create-logger-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/loggers/{LoggerDefinitionId}/versions" create-logger-definition-version-request :portkey.aws.greengrass/create-logger-definition-version-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"LoggerDefinitionId" "LoggerDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/create-logger-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-logger-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-logger-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-logger-definition-version-response))

(clojure.core/defn delete-logger-definition "Deletes a logger definition." ([delete-logger-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/definition/loggers/{LoggerDefinitionId}" delete-logger-definition-request :portkey.aws.greengrass/delete-logger-definition-request {:payload nil, :move {}, :headers {}, :uri {"LoggerDefinitionId" "LoggerDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/delete-logger-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef delete-logger-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/delete-logger-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/delete-logger-definition-response))

(clojure.core/defn get-subscription-definition "Retrieves information about a subscription definition." ([get-subscription-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/subscriptions/{SubscriptionDefinitionId}" get-subscription-definition-request :portkey.aws.greengrass/get-subscription-definition-request {:payload nil, :move {}, :headers {}, :uri {"SubscriptionDefinitionId" "SubscriptionDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-subscription-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-subscription-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-subscription-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-subscription-definition-response))

(clojure.core/defn update-group-certificate-configuration "Updates the Certificate expiry time for a group." ([update-group-certificate-configuration-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/groups/{GroupId}/certificateauthorities/configuration/expiry" update-group-certificate-configuration-request :portkey.aws.greengrass/update-group-certificate-configuration-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/update-group-certificate-configuration-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-group-certificate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-group-certificate-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-group-certificate-configuration-response))

(clojure.core/defn create-deployment "Creates a deployment." ([create-deployment-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/groups/{GroupId}/deployments" create-deployment-request :portkey.aws.greengrass/create-deployment-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/create-deployment-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-deployment :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-deployment-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-deployment-response))

(clojure.core/defn delete-device-definition "Deletes a device definition." ([delete-device-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/definition/devices/{DeviceDefinitionId}" delete-device-definition-request :portkey.aws.greengrass/delete-device-definition-request {:payload nil, :move {}, :headers {}, :uri {"DeviceDefinitionId" "DeviceDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/delete-device-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef delete-device-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/delete-device-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/delete-device-definition-response))

(clojure.core/defn list-subscription-definitions "Retrieves a list of subscription definitions." ([] (list-subscription-definitions {})) ([list-subscription-definitions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/subscriptions" list-subscription-definitions-request :portkey.aws.greengrass/list-subscription-definitions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-subscription-definitions-response {})))
(clojure.spec.alpha/fdef list-subscription-definitions :args (clojure.spec.alpha/? :portkey.aws.greengrass/list-subscription-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-subscription-definitions-response))

(clojure.core/defn list-group-versions "Lists the versions of a group." ([list-group-versions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}/versions" list-group-versions-request :portkey.aws.greengrass/list-group-versions-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-group-versions-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef list-group-versions :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-group-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-group-versions-response))

(clojure.core/defn create-software-update-job "Creates a software update for a core or group of cores (specified as an IoT\nthing group.) Use this to update the OTA Agent as well as the Greengrass core\nsoftware. It makes use of the IoT Jobs feature which provides additional\ncommands to manage a Greengrass core software update job." ([] (create-software-update-job {})) ([create-software-update-job-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/updates" create-software-update-job-request :portkey.aws.greengrass/create-software-update-job-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/create-software-update-job-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-software-update-job :args (clojure.spec.alpha/? :portkey.aws.greengrass/create-software-update-job-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-software-update-job-response))

(clojure.core/defn list-subscription-definition-versions "Lists the versions of a subscription definition." ([list-subscription-definition-versions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/subscriptions/{SubscriptionDefinitionId}/versions" list-subscription-definition-versions-request :portkey.aws.greengrass/list-subscription-definition-versions-request {:payload nil, :move {}, :headers {}, :uri {"SubscriptionDefinitionId" "SubscriptionDefinitionId"}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-subscription-definition-versions-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef list-subscription-definition-versions :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-subscription-definition-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-subscription-definition-versions-response))

(clojure.core/defn list-logger-definition-versions "Lists the versions of a logger definition." ([list-logger-definition-versions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/loggers/{LoggerDefinitionId}/versions" list-logger-definition-versions-request :portkey.aws.greengrass/list-logger-definition-versions-request {:payload nil, :move {}, :headers {}, :uri {"LoggerDefinitionId" "LoggerDefinitionId"}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-logger-definition-versions-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef list-logger-definition-versions :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-logger-definition-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-logger-definition-versions-response))

(clojure.core/defn get-associated-role "Retrieves the role associated with a particular group." ([get-associated-role-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}/role" get-associated-role-request :portkey.aws.greengrass/get-associated-role-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/get-associated-role-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-associated-role :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-associated-role-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-associated-role-response))

(clojure.core/defn get-group "Retrieves information about a group." ([get-group-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}" get-group-request :portkey.aws.greengrass/get-group-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/get-group-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-group-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-group-response))

(clojure.core/defn update-group "Updates a group." ([update-group-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/groups/{GroupId}" update-group-request :portkey.aws.greengrass/update-group-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/update-group-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-group-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-group-response))

(clojure.core/defn get-group-certificate-authority "Retreives the CA associated with a group. Returns the public key of the CA." ([get-group-certificate-authority-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}/certificateauthorities/{CertificateAuthorityId}" get-group-certificate-authority-request :portkey.aws.greengrass/get-group-certificate-authority-request {:payload nil, :move {}, :headers {}, :uri {"CertificateAuthorityId" "CertificateAuthorityId", "GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/get-group-certificate-authority-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-group-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-group-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-group-certificate-authority-response))

(clojure.core/defn get-core-definition "Retrieves information about a core definition version." ([get-core-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/cores/{CoreDefinitionId}" get-core-definition-request :portkey.aws.greengrass/get-core-definition-request {:payload nil, :move {}, :headers {}, :uri {"CoreDefinitionId" "CoreDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-core-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-core-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-core-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-core-definition-response))

(clojure.core/defn create-resource-definition "Creates a resource definition which contains a list of resources to be used in a\ngroup. You can create an initial version of the definition by providing a list\nof resources now, or use ''CreateResourceDefinitionVersion'' later." ([] (create-resource-definition {})) ([create-resource-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/resources" create-resource-definition-request :portkey.aws.greengrass/create-resource-definition-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/create-resource-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-resource-definition :args (clojure.spec.alpha/? :portkey.aws.greengrass/create-resource-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-resource-definition-response))

(clojure.core/defn create-resource-definition-version "Creates a version of a resource definition that has already been defined." ([create-resource-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/resources/{ResourceDefinitionId}/versions" create-resource-definition-version-request :portkey.aws.greengrass/create-resource-definition-version-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"ResourceDefinitionId" "ResourceDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/create-resource-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-resource-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-resource-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-resource-definition-version-response))

(clojure.core/defn list-core-definitions "Retrieves a list of core definitions." ([] (list-core-definitions {})) ([list-core-definitions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/cores" list-core-definitions-request :portkey.aws.greengrass/list-core-definitions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-core-definitions-response {})))
(clojure.spec.alpha/fdef list-core-definitions :args (clojure.spec.alpha/? :portkey.aws.greengrass/list-core-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-core-definitions-response))

(clojure.core/defn get-deployment-status "Returns the status of a deployment." ([get-deployment-status-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}/deployments/{DeploymentId}/status" get-deployment-status-request :portkey.aws.greengrass/get-deployment-status-request {:payload nil, :move {}, :headers {}, :uri {"DeploymentId" "DeploymentId", "GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/get-deployment-status-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-deployment-status :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-deployment-status-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-deployment-status-response))

(clojure.core/defn get-connectivity-info "Retrieves the connectivity information for a core." ([get-connectivity-info-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/things/{ThingName}/connectivityInfo" get-connectivity-info-request :portkey.aws.greengrass/get-connectivity-info-request {:payload nil, :move {}, :headers {}, :uri {"ThingName" "ThingName"}, :querystring {}} 200 :portkey.aws.greengrass/get-connectivity-info-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-connectivity-info :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-connectivity-info-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-connectivity-info-response))

(clojure.core/defn get-device-definition "Retrieves information about a device definition." ([get-device-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/devices/{DeviceDefinitionId}" get-device-definition-request :portkey.aws.greengrass/get-device-definition-request {:payload nil, :move {}, :headers {}, :uri {"DeviceDefinitionId" "DeviceDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-device-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-device-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-device-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-device-definition-response))

(clojure.core/defn list-resource-definition-versions "Lists the versions of a resource definition." ([list-resource-definition-versions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/resources/{ResourceDefinitionId}/versions" list-resource-definition-versions-request :portkey.aws.greengrass/list-resource-definition-versions-request {:payload nil, :move {}, :headers {}, :uri {"ResourceDefinitionId" "ResourceDefinitionId"}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-resource-definition-versions-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef list-resource-definition-versions :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-resource-definition-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-resource-definition-versions-response))

(clojure.core/defn list-deployments "Returns a history of deployments for the group." ([list-deployments-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}/deployments" list-deployments-request :portkey.aws.greengrass/list-deployments-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-deployments-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef list-deployments :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-deployments-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-deployments-response))

(clojure.core/defn create-group-version "Creates a version of a group which has already been defined." ([create-group-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/groups/{GroupId}/versions" create-group-version-request :portkey.aws.greengrass/create-group-version-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/create-group-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-group-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-group-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-group-version-response))

(clojure.core/defn get-device-definition-version "Retrieves information about a device definition version." ([get-device-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/devices/{DeviceDefinitionId}/versions/{DeviceDefinitionVersionId}" get-device-definition-version-request :portkey.aws.greengrass/get-device-definition-version-request {:payload nil, :move {}, :headers {}, :uri {"DeviceDefinitionId" "DeviceDefinitionId", "DeviceDefinitionVersionId" "DeviceDefinitionVersionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-device-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-device-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-device-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-device-definition-version-response))

(clojure.core/defn update-function-definition "Updates a Lambda function definition." ([update-function-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/definition/functions/{FunctionDefinitionId}" update-function-definition-request :portkey.aws.greengrass/update-function-definition-request {:payload nil, :move {}, :headers {}, :uri {"FunctionDefinitionId" "FunctionDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/update-function-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef update-function-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-function-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-function-definition-response))

(clojure.core/defn list-resource-definitions "Retrieves a list of resource definitions." ([] (list-resource-definitions {})) ([list-resource-definitions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/resources" list-resource-definitions-request :portkey.aws.greengrass/list-resource-definitions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-resource-definitions-response {})))
(clojure.spec.alpha/fdef list-resource-definitions :args (clojure.spec.alpha/? :portkey.aws.greengrass/list-resource-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-resource-definitions-response))

(clojure.core/defn delete-function-definition "Deletes a Lambda function definition." ([delete-function-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/definition/functions/{FunctionDefinitionId}" delete-function-definition-request :portkey.aws.greengrass/delete-function-definition-request {:payload nil, :move {}, :headers {}, :uri {"FunctionDefinitionId" "FunctionDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/delete-function-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef delete-function-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/delete-function-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/delete-function-definition-response))

(clojure.core/defn list-core-definition-versions "Lists the versions of a core definition." ([list-core-definition-versions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/cores/{CoreDefinitionId}/versions" list-core-definition-versions-request :portkey.aws.greengrass/list-core-definition-versions-request {:payload nil, :move {}, :headers {}, :uri {"CoreDefinitionId" "CoreDefinitionId"}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-core-definition-versions-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef list-core-definition-versions :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-core-definition-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-core-definition-versions-response))

(clojure.core/defn list-group-certificate-authorities "Retrieves the current CAs for a group." ([list-group-certificate-authorities-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}/certificateauthorities" list-group-certificate-authorities-request :portkey.aws.greengrass/list-group-certificate-authorities-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/list-group-certificate-authorities-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-group-certificate-authorities :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-group-certificate-authorities-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-group-certificate-authorities-response))

(clojure.core/defn get-logger-definition "Retrieves information about a logger definition." ([get-logger-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/loggers/{LoggerDefinitionId}" get-logger-definition-request :portkey.aws.greengrass/get-logger-definition-request {:payload nil, :move {}, :headers {}, :uri {"LoggerDefinitionId" "LoggerDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-logger-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-logger-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-logger-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-logger-definition-response))

(clojure.core/defn update-device-definition "Updates a device definition." ([update-device-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/definition/devices/{DeviceDefinitionId}" update-device-definition-request :portkey.aws.greengrass/update-device-definition-request {:payload nil, :move {}, :headers {}, :uri {"DeviceDefinitionId" "DeviceDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/update-device-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef update-device-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-device-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-device-definition-response))

(clojure.core/defn get-resource-definition "Retrieves information about a resource definition, including its creation time\nand latest version." ([get-resource-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/resources/{ResourceDefinitionId}" get-resource-definition-request :portkey.aws.greengrass/get-resource-definition-request {:payload nil, :move {}, :headers {}, :uri {"ResourceDefinitionId" "ResourceDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-resource-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-resource-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-resource-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-resource-definition-response))

(clojure.core/defn delete-resource-definition "Deletes a resource definition." ([delete-resource-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/definition/resources/{ResourceDefinitionId}" delete-resource-definition-request :portkey.aws.greengrass/delete-resource-definition-request {:payload nil, :move {}, :headers {}, :uri {"ResourceDefinitionId" "ResourceDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/delete-resource-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef delete-resource-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/delete-resource-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/delete-resource-definition-response))

(clojure.core/defn create-group-certificate-authority "Creates a CA for the group. If a CA already exists, it will rotate the existing\nCA." ([create-group-certificate-authority-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/groups/{GroupId}/certificateauthorities" create-group-certificate-authority-request :portkey.aws.greengrass/create-group-certificate-authority-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/create-group-certificate-authority-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-group-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-group-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-group-certificate-authority-response))

(clojure.core/defn create-function-definition-version "Creates a version of a Lambda function definition that has already been defined." ([create-function-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/functions/{FunctionDefinitionId}/versions" create-function-definition-version-request :portkey.aws.greengrass/create-function-definition-version-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"FunctionDefinitionId" "FunctionDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/create-function-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-function-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-function-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-function-definition-version-response))

(clojure.core/defn get-core-definition-version "Retrieves information about a core definition version." ([get-core-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/cores/{CoreDefinitionId}/versions/{CoreDefinitionVersionId}" get-core-definition-version-request :portkey.aws.greengrass/get-core-definition-version-request {:payload nil, :move {}, :headers {}, :uri {"CoreDefinitionId" "CoreDefinitionId", "CoreDefinitionVersionId" "CoreDefinitionVersionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-core-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-core-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-core-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-core-definition-version-response))

(clojure.core/defn get-function-definition-version "Retrieves information about a Lambda function definition version, including\nwhich Lambda functions are included in the version and their configurations." ([get-function-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/functions/{FunctionDefinitionId}/versions/{FunctionDefinitionVersionId}" get-function-definition-version-request :portkey.aws.greengrass/get-function-definition-version-request {:payload nil, :move {}, :headers {}, :uri {"FunctionDefinitionId" "FunctionDefinitionId", "FunctionDefinitionVersionId" "FunctionDefinitionVersionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-function-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-function-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-function-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-function-definition-version-response))

(clojure.core/defn update-core-definition "Updates a core definition." ([update-core-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/definition/cores/{CoreDefinitionId}" update-core-definition-request :portkey.aws.greengrass/update-core-definition-request {:payload nil, :move {}, :headers {}, :uri {"CoreDefinitionId" "CoreDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/update-core-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef update-core-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-core-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-core-definition-response))

(clojure.core/defn associate-role-to-group "Associates a role with a group. Your AWS Greengrass core will use the role to\naccess AWS cloud services. The role's permissions should allow Greengrass core\nLambda functions to perform actions against the cloud." ([associate-role-to-group-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/groups/{GroupId}/role" associate-role-to-group-request :portkey.aws.greengrass/associate-role-to-group-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/associate-role-to-group-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef associate-role-to-group :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/associate-role-to-group-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/associate-role-to-group-response))

(clojure.core/defn associate-service-role-to-account "Associates a role with your account. AWS Greengrass will use the role to access\nyour Lambda functions and AWS IoT resources. This is necessary for deployments\nto succeed. The role must have at least minimum permissions in the policy\n''AWSGreengrassResourceAccessRolePolicy''." ([] (associate-service-role-to-account {})) ([associate-service-role-to-account-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/servicerole" associate-service-role-to-account-request :portkey.aws.greengrass/associate-service-role-to-account-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/associate-service-role-to-account-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef associate-service-role-to-account :args (clojure.spec.alpha/? :portkey.aws.greengrass/associate-service-role-to-account-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/associate-service-role-to-account-response))

(clojure.core/defn update-subscription-definition "Updates a subscription definition." ([update-subscription-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/definition/subscriptions/{SubscriptionDefinitionId}" update-subscription-definition-request :portkey.aws.greengrass/update-subscription-definition-request {:payload nil, :move {}, :headers {}, :uri {"SubscriptionDefinitionId" "SubscriptionDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/update-subscription-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef update-subscription-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-subscription-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-subscription-definition-response))

(clojure.core/defn update-connectivity-info "Updates the connectivity information for the core. Any devices that belong to\nthe group which has this core will receive this information in order to find the\nlocation of the core and connect to it." ([update-connectivity-info-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "PUT" "/greengrass/things/{ThingName}/connectivityInfo" update-connectivity-info-request :portkey.aws.greengrass/update-connectivity-info-request {:payload nil, :move {}, :headers {}, :uri {"ThingName" "ThingName"}, :querystring {}} 200 :portkey.aws.greengrass/update-connectivity-info-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-connectivity-info :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/update-connectivity-info-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/update-connectivity-info-response))

(clojure.core/defn create-group "Creates a group. You may provide the initial version of the group or use\n''CreateGroupVersion'' at a later time." ([] (create-group {})) ([create-group-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/groups" create-group-request :portkey.aws.greengrass/create-group-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/create-group-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/? :portkey.aws.greengrass/create-group-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-group-response))

(clojure.core/defn create-subscription-definition "Creates a subscription definition. You may provide the initial version of the\nsubscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a\nlater time." ([] (create-subscription-definition {})) ([create-subscription-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/subscriptions" create-subscription-definition-request :portkey.aws.greengrass/create-subscription-definition-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/create-subscription-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-subscription-definition :args (clojure.spec.alpha/? :portkey.aws.greengrass/create-subscription-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-subscription-definition-response))

(clojure.core/defn get-group-version "Retrieves information about a group version." ([get-group-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}/versions/{GroupVersionId}" get-group-version-request :portkey.aws.greengrass/get-group-version-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId", "GroupVersionId" "GroupVersionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-group-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-group-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-group-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-group-version-response))

(clojure.core/defn get-service-role-for-account "Retrieves the service role that is attached to your account." ([] (get-service-role-for-account {})) ([get-service-role-for-account-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/servicerole" get-service-role-for-account-request :portkey.aws.greengrass/get-service-role-for-account-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.greengrass/get-service-role-for-account-response {"InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-service-role-for-account :args (clojure.spec.alpha/? :portkey.aws.greengrass/get-service-role-for-account-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-service-role-for-account-response))

(clojure.core/defn get-group-certificate-configuration "Retrieves the current configuration for the CA used by the group." ([get-group-certificate-configuration-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/groups/{GroupId}/certificateauthorities/configuration/expiry" get-group-certificate-configuration-request :portkey.aws.greengrass/get-group-certificate-configuration-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/get-group-certificate-configuration-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-group-certificate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-group-certificate-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-group-certificate-configuration-response))

(clojure.core/defn delete-core-definition "Deletes a core definition." ([delete-core-definition-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/definition/cores/{CoreDefinitionId}" delete-core-definition-request :portkey.aws.greengrass/delete-core-definition-request {:payload nil, :move {}, :headers {}, :uri {"CoreDefinitionId" "CoreDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/delete-core-definition-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef delete-core-definition :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/delete-core-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/delete-core-definition-response))

(clojure.core/defn get-logger-definition-version "Retrieves information about a logger definition version." ([get-logger-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/loggers/{LoggerDefinitionId}/versions/{LoggerDefinitionVersionId}" get-logger-definition-version-request :portkey.aws.greengrass/get-logger-definition-version-request {:payload nil, :move {}, :headers {}, :uri {"LoggerDefinitionId" "LoggerDefinitionId", "LoggerDefinitionVersionId" "LoggerDefinitionVersionId"}, :querystring {}} 200 :portkey.aws.greengrass/get-logger-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef get-logger-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/get-logger-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/get-logger-definition-version-response))

(clojure.core/defn list-device-definition-versions "Lists the versions of a device definition." ([list-device-definition-versions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/devices/{DeviceDefinitionId}/versions" list-device-definition-versions-request :portkey.aws.greengrass/list-device-definition-versions-request {:payload nil, :move {}, :headers {}, :uri {"DeviceDefinitionId" "DeviceDefinitionId"}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-device-definition-versions-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef list-device-definition-versions :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/list-device-definition-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-device-definition-versions-response))

(clojure.core/defn create-core-definition-version "Creates a version of a core definition that has already been defined. AWS\nGreengrass groups must each contain exactly one AWS Greengrass core." ([create-core-definition-version-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "POST" "/greengrass/definition/cores/{CoreDefinitionId}/versions" create-core-definition-version-request :portkey.aws.greengrass/create-core-definition-version-request {:payload nil, :move {}, :headers {"AmznClientToken" ["X-Amzn-Client-Token" nil]}, :uri {"CoreDefinitionId" "CoreDefinitionId"}, :querystring {}} 200 :portkey.aws.greengrass/create-core-definition-version-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception})))
(clojure.spec.alpha/fdef create-core-definition-version :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/create-core-definition-version-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/create-core-definition-version-response))

(clojure.core/defn disassociate-role-from-group "Disassociates the role from a group." ([disassociate-role-from-group-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "DELETE" "/greengrass/groups/{GroupId}/role" disassociate-role-from-group-request :portkey.aws.greengrass/disassociate-role-from-group-request {:payload nil, :move {}, :headers {}, :uri {"GroupId" "GroupId"}, :querystring {}} 200 :portkey.aws.greengrass/disassociate-role-from-group-response {"BadRequestException" :portkey.aws.greengrass/bad-request-exception, "InternalServerErrorException" :portkey.aws.greengrass/internal-server-error-exception})))
(clojure.spec.alpha/fdef disassociate-role-from-group :args (clojure.spec.alpha/tuple :portkey.aws.greengrass/disassociate-role-from-group-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/disassociate-role-from-group-response))

(clojure.core/defn list-device-definitions "Retrieves a list of device definitions." ([] (list-device-definitions {})) ([list-device-definitions-request] (portkey.aws/-rest-json-call portkey.aws.greengrass/endpoints "GET" "/greengrass/definition/devices" list-device-definitions-request :portkey.aws.greengrass/list-device-definitions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MaxResults" "MaxResults", "NextToken" "NextToken"}} 200 :portkey.aws.greengrass/list-device-definitions-response {})))
(clojure.spec.alpha/fdef list-device-definitions :args (clojure.spec.alpha/? :portkey.aws.greengrass/list-device-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.greengrass/list-device-definitions-response))
