(ns portkey.aws.iot.-2015-05-28 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "execute-api", :region "ap-northeast-1"},
    :ssl-common-name "iot.ap-northeast-1.amazonaws.com",
    :endpoint "https://iot.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "execute-api", :region "eu-west-1"},
    :ssl-common-name "iot.eu-west-1.amazonaws.com",
    :endpoint "https://iot.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "execute-api", :region "us-east-2"},
    :ssl-common-name "iot.us-east-2.amazonaws.com",
    :endpoint "https://iot.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "execute-api", :region "ap-southeast-2"},
    :ssl-common-name "iot.ap-southeast-2.amazonaws.com",
    :endpoint "https://iot.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "execute-api", :region "cn-north-1"},
    :ssl-common-name "iot.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iot.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "execute-api", :region "ap-southeast-1"},
    :ssl-common-name "iot.ap-southeast-1.amazonaws.com",
    :endpoint "https://iot.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "execute-api", :region "ap-northeast-2"},
    :ssl-common-name "iot.ap-northeast-2.amazonaws.com",
    :endpoint "https://iot.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "execute-api", :region "eu-central-1"},
    :ssl-common-name "iot.eu-central-1.amazonaws.com",
    :endpoint "https://iot.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "execute-api", :region "eu-west-2"},
    :ssl-common-name "iot.eu-west-2.amazonaws.com",
    :endpoint "https://iot.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "execute-api", :region "us-west-2"},
    :ssl-common-name "iot.us-west-2.amazonaws.com",
    :endpoint "https://iot.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "execute-api", :region "us-east-1"},
    :ssl-common-name "iot.us-east-1.amazonaws.com",
    :endpoint "https://iot.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.accept-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.accept-certificate-transfer-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/accept-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.accept-certificate-transfer-request/certificateId] :opt-un [:portkey.aws.iot.-2015-05-28.accept-certificate-transfer-request/setAsActive]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registry-max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-versions-response/policy-versions (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-versions))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policy-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-policy-versions-response/policyVersions]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/auto-registration-status (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"ENABLE" "ENABLE", :enable "ENABLE", "DISABLE" "DISABLE", :disable "DISABLE"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.deprecate-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.deprecate-thing-type-request/undo-deprecate (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/undo-deprecate))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/deprecate-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.deprecate-thing-type-request/thingTypeName] :opt-un [:portkey.aws.iot.-2015-05-28.deprecate-thing-type-request/undoDeprecate]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/outgoing-certificates (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/outgoing-certificate :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-principal-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-principal-policy-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-principal-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.detach-principal-policy-request/policyName :portkey.aws.iot.-2015-05-28.detach-principal-policy-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/range-key-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-attribute :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-properties/thing-type-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-properties/searchable-attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/searchable-attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-properties (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-type-properties/thingTypeDescription :portkey.aws.iot.-2015-05-28.thing-type-properties/searchableAttributes]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-request/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-request/ca-certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active-flag))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/register-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.register-certificate-request/certificatePem] :opt-un [:portkey.aws.iot.-2015-05-28.register-certificate-request/caCertificatePem :portkey.aws.iot.-2015-05-28.register-certificate-request/setAsActive :portkey.aws.iot.-2015-05-28.register-certificate-request/status]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-thing-principal-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-request/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.create-thing-request/thingName] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-request/thingTypeName :portkey.aws.iot.-2015-05-28.create-thing-request/attributePayload]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbv2-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbv2-action/put-item (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/put-item-input))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/dynamodbv2-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.dynamodbv2-action/roleArn :portkey.aws.iot.-2015-05-28.dynamodbv2-action/putItem]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-registration-code-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/sql (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/sql))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/actions (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/action-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/aws-iot-sql-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-iot-sql-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-rule-payload (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.topic-rule-payload/sql :portkey.aws.iot.-2015-05-28.topic-rule-payload/actions] :opt-un [:portkey.aws.iot.-2015-05-28.topic-rule-payload/description :portkey.aws.iot.-2015-05-28.topic-rule-payload/ruleDisabled :portkey.aws.iot.-2015-05-28.topic-rule-payload/awsIotSqlVersion]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-response/things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-principal-things-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-principal-things-response/things :portkey.aws.iot.-2015-05-28.list-principal-things-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/private-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-certificate-request/target-aws-account (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-certificate-request/transfer-message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.transfer-certificate-request/certificateId :portkey.aws.iot.-2015-05-28.transfer-certificate-request/targetAwsAccount] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-certificate-request/transferMessage]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/deprecation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-certificate-request/new-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.update-certificate-request/certificateId :portkey.aws.iot.-2015-05-28.update-certificate-request/newStatus] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-pattern (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/default-client-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/client-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-thing-response/defaultClientId :portkey.aws.iot.-2015-05-28.describe-thing-response/thingName :portkey.aws.iot.-2015-05-28.describe-thing-response/thingTypeName :portkey.aws.iot.-2015-05-28.describe-thing-response/attributes :portkey.aws.iot.-2015-05-28.describe-thing-response/version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-keys-and-certificate-request/setAsActive]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.updatecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.updatecacertificate-request/new-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.updatecacertificate-request/new-auto-registration-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/auto-registration-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/updatecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.updatecacertificate-request/certificateId] :opt-un [:portkey.aws.iot.-2015-05-28.updatecacertificate-request/newStatus :portkey.aws.iot.-2015-05-28.updatecacertificate-request/newAutoRegistrationStatus]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-state-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-signing-request (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/page-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 2028)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[\p{Graph}\x20]*" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-attribute (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-attribute/thingName :portkey.aws.iot.-2015-05-28.thing-attribute/thingTypeName :portkey.aws.iot.-2015-05-28.thing-attribute/attributes :portkey.aws.iot.-2015-05-28.thing-attribute/version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-request/topic (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-request/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-topic-rules-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-topic-rules-request/topic :portkey.aws.iot.-2015-05-28.list-topic-rules-request/maxResults :portkey.aws.iot.-2015-05-28.list-topic-rules-request/nextToken :portkey.aws.iot.-2015-05-28.list-topic-rules-request/ruleDisabled]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/canned-access-control-list (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"authenticated-read" "authenticated-read", "public-read-write" "public-read-write", :bucket-owner-full-control "bucket-owner-full-control", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :log-delivery-write "log-delivery-write", :authenticated-read "authenticated-read", "aws-exec-read" "aws-exec-read", :aws-exec-read "aws-exec-read", :bucket-owner-read "bucket-owner-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", "log-delivery-write" "log-delivery-write", :public-read-write "public-read-write", :public-read "public-read"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/pageSize :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/marker :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-principal-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.list-principal-policies-request/principal] :opt-un [:portkey.aws.iot.-2015-05-28.list-principal-policies-request/marker :portkey.aws.iot.-2015-05-28.list-principal-policies-request/pageSize :portkey.aws.iot.-2015-05-28.list-principal-policies-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-logging-options-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-logging-options-response/log-level (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-logging-options-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-logging-options-response/roleArn :portkey.aws.iot.-2015-05-28.get-logging-options-response/logLevel]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.,@/:#-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/transferred-to (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/transfer-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/transfer-message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/outgoing-certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.outgoing-certificate/certificateArn :portkey.aws.iot.-2015-05-28.outgoing-certificate/certificateId :portkey.aws.iot.-2015-05-28.outgoing-certificate/transferredTo :portkey.aws.iot.-2015-05-28.outgoing-certificate/transferDate :portkey.aws.iot.-2015-05-28.outgoing-certificate/transferMessage :portkey.aws.iot.-2015-05-28.outgoing-certificate/creationDate]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificates))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-certificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-certificates-response/certificates :portkey.aws.iot.-2015-05-28.list-certificates-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-default-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-default-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-default-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.set-default-policy-version-request/policyName :portkey.aws.iot.-2015-05-28.set-default-policy-version-request/policyVersionId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.enable-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/enable-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.enable-topic-rule-request/ruleName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/log-level (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"DISABLED" "DISABLED", :disabled "DISABLED", :warn "WARN", "WARN" "WARN", :debug "DEBUG", "ERROR" "ERROR", "DEBUG" "DEBUG", :info "INFO", :error "ERROR", "INFO" "INFO"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cacertificates (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/cacertificate :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/action-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/action :max-count 10))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.reject-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.reject-certificate-transfer-request/reject-reason (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/reject-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.reject-certificate-transfer-request/certificateId] :opt-un [:portkey.aws.iot.-2015-05-28.reject-certificate-transfer-request/rejectReason]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-certificates-request/pageSize :portkey.aws.iot.-2015-05-28.list-certificates-request/marker :portkey.aws.iot.-2015-05-28.list-certificates-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.describe-thing-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-topic-rule-response/rule-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-topic-rule-response/rule (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-rule))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-topic-rule-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-topic-rule-response/ruleArn :portkey.aws.iot.-2015-05-28.get-topic-rule-response/rule]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificates (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/certificate :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-metadata/deprecated (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/boolean))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-metadata/deprecation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/deprecation-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-type-metadata/deprecated :portkey.aws.iot.-2015-05-28.thing-type-metadata/deprecationDate :portkey.aws.iot.-2015-05-28.thing-type-metadata/creationDate]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attribute-payload/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attribute-payload/merge (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/flag))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attribute-payload (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.attribute-payload/attributes :portkey.aws.iot.-2015-05-28.attribute-payload/merge]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.describe-thing-type-request/thingTypeName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describecacertificate-response/certificate-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cacertificate-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describecacertificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describecacertificate-response/certificateDescription]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/state-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/use-base64 clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.describe-certificate-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/principal-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-types-request/nextToken :portkey.aws.iot.-2015-05-28.list-thing-types-request/maxResults :portkey.aws.iot.-2015-05-28.list-thing-types-request/thingTypeName]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cacertificate-status (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/partition-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-thing-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.delete-thing-request/thingName] :opt-un [:portkey.aws.iot.-2015-05-28.delete-thing-request/expectedVersion]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-principal-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-principal-policies-response/policies :portkey.aws.iot.-2015-05-28.list-principal-policies-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/owned-by (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/transfer-data (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/transfer-data))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/previous-owned-by (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-description/creationDate :portkey.aws.iot.-2015-05-28.certificate-description/certificatePem :portkey.aws.iot.-2015-05-28.certificate-description/caCertificateId :portkey.aws.iot.-2015-05-28.certificate-description/lastModifiedDate :portkey.aws.iot.-2015-05-28.certificate-description/ownedBy :portkey.aws.iot.-2015-05-28.certificate-description/transferData :portkey.aws.iot.-2015-05-28.certificate-description/status :portkey.aws.iot.-2015-05-28.certificate-description/previousOwnedBy :portkey.aws.iot.-2015-05-28.certificate-description/certificateArn :portkey.aws.iot.-2015-05-28.certificate-description/certificateId]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.delete-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-thing-principal-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-thing-principal-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-thing-principal-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.detach-thing-principal-request/thingName :portkey.aws.iot.-2015-05-28.detach-thing-principal-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/rule-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-certificate-response/transferred-certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-certificate-response/transferredCertificateArn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-metadata (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-metadata))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-definition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-type-definition/thingTypeName :portkey.aws.iot.-2015-05-28.thing-type-definition/thingTypeProperties :portkey.aws.iot.-2015-05-28.thing-type-definition/thingTypeMetadata]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/deprecate-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-response/rules (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-rule-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-topic-rules-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-topic-rules-response/rules :portkey.aws.iot.-2015-05-28.list-topic-rules-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-name-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-name :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-request/certificate-signing-request (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-signing-request))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.create-certificate-from-csr-request/certificateSigningRequest] :opt-un [:portkey.aws.iot.-2015-05-28.create-certificate-from-csr-request/setAsActive]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-metadata (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-metadata))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-thing-type-response/thingTypeName :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thingTypeProperties :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thingTypeMetadata]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.delete-topic-rule-request/ruleName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-as-active-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.resource-already-exists-exception/message :portkey.aws.iot.-2015-05-28/resourceId :portkey.aws.iot.-2015-05-28/resourceArn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-bycaresponse/certificates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificates))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-bycaresponse/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-certificates-bycaresponse (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-certificates-bycaresponse/certificates :portkey.aws.iot.-2015-05-28.list-certificates-bycaresponse/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-principals-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-principals-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.list-thing-principals-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.listcacertificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cacertificates))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.listcacertificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/listcacertificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.listcacertificates-response/certificates :portkey.aws.iot.-2015-05-28.listcacertificates-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/key-pair (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/key-pair))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificateArn :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificateId :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificatePem :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/keyPair]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-registration-code-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/allow-auto-registration clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy-version/version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy-version/is-default-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy-version/create-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.policy-version/versionId :portkey.aws.iot.-2015-05-28.policy-version/isDefaultVersion :portkey.aws.iot.-2015-05-28.policy-version/createDate]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.put-item-input/table-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/table-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/put-item-input (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.put-item-input/tableName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.deletecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/deletecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.deletecacertificate-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/range-key-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/hash-key-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.firehose-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.firehose-action/delivery-stream-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delivery-stream-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.firehose-action/separator (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/firehose-separator))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/firehose-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.firehose-action/roleArn :portkey.aws.iot.-2015-05-28.firehose-action/deliveryStreamName] :opt-un [:portkey.aws.iot.-2015-05-28.firehose-action/separator]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/metric-timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.get-topic-rule-request/ruleName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.create-policy-request/policyName :portkey.aws.iot.-2015-05-28.create-policy-request/policyDocument] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-principal-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-principal-policy-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-principal-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.attach-principal-policy-request/policyName :portkey.aws.iot.-2015-05-28.attach-principal-policy-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/salesforce-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 40 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attributes (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/attribute-name :portkey.aws.iot.-2015-05-28/attribute-value))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificateArn :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificateId :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificatePem]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/queue-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/is-default-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-policy-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-policy-version-response/policyArn :portkey.aws.iot.-2015-05-28.get-policy-version-response/policyName :portkey.aws.iot.-2015-05-28.get-policy-version-response/policyDocument :portkey.aws.iot.-2015-05-28.get-policy-version-response/policyVersionId :portkey.aws.iot.-2015-05-28.get-policy-version-response/isDefaultVersion]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.versions-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/versions-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.versions-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/searchable-attributes (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/attribute-name :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/message-format (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"RAW" "RAW", :raw "RAW", "JSON" "JSON", :json "JSON"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 800)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.,@/:#-]*" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.listcacertificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.listcacertificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.listcacertificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/listcacertificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.listcacertificates-request/pageSize :portkey.aws.iot.-2015-05-28.listcacertificates-request/marker :portkey.aws.iot.-2015-05-28.listcacertificates-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/dynamo-key-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"STRING" "STRING", :string "STRING", "NUMBER" "NUMBER", :number "NUMBER"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.delete-certificate-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cancel-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.cancel-certificate-transfer-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.get-policy-request/policyName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-registration-code-response/registration-code (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registration-code))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-registration-code-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-registration-code-response/registrationCode]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-logging-options-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sns-action/target-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sns-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sns-action/message-format (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message-format))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/sns-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.sns-action/targetArn :portkey.aws.iot.-2015-05-28.sns-action/roleArn] :opt-un [:portkey.aws.iot.-2015-05-28.sns-action/messageFormat]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/undo-deprecate clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/deletecacertificate-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.delete-thing-type-request/thingTypeName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.delete-policy-request/policyName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.delete-policy-version-request/policyName :portkey.aws.iot.-2015-05-28.delete-policy-version-request/policyVersionId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[0-9]{12}" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/is-disabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sql-parse-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/sql-parse-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.sql-parse-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.internal-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/internal-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.internal-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/default-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-policy-response/policyName :portkey.aws.iot.-2015-05-28.get-policy-response/policyArn :portkey.aws.iot.-2015-05-28.get-policy-response/policyDocument :portkey.aws.iot.-2015-05-28.get-policy-response/defaultVersionId]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-namespace (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/metric-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/metric-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-unit (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/metric-unit))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-timestamp (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/metric-timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cloudwatch-metric-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/roleArn :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metricNamespace :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metricName :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metricValue :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metricUnit] :opt-un [:portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metricTimestamp]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.version-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/version-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.version-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-policy-response/policyName :portkey.aws.iot.-2015-05-28.create-policy-response/policyArn :portkey.aws.iot.-2015-05-28.create-policy-response/policyDocument :portkey.aws.iot.-2015-05-28.create-policy-response/policyVersionId]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/remove-thing-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delivery-stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-thing-principal-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-thing-principal-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-thing-principal-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.attach-thing-principal-request/thingName :portkey.aws.iot.-2015-05-28.attach-thing-principal-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sqs-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sqs-action/queue-url (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/queue-url))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sqs-action/use-base64 (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/use-base64))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/sqs-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.sqs-action/roleArn :portkey.aws.iot.-2015-05-28.sqs-action/queueUrl] :opt-un [:portkey.aws.iot.-2015-05-28.sqs-action/useBase64]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-versions-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policy-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.list-policy-versions-request/policyName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.get-policy-version-request/policyName :portkey.aws.iot.-2015-05-28.get-policy-version-request/policyVersionId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-thing-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-principal-things-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.list-principal-things-request/principal] :opt-un [:portkey.aws.iot.-2015-05-28.list-principal-things-request/nextToken :portkey.aws.iot.-2015-05-28.list-principal-things-request/maxResults]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-certificate-response/certificate-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-certificate-response/certificateDescription]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-endpoint-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-bycarequest/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-bycarequest/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-bycarequest/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-bycarequest/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-certificates-bycarequest (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.list-certificates-bycarequest/caCertificateId] :opt-un [:portkey.aws.iot.-2015-05-28.list-certificates-bycarequest/pageSize :portkey.aws.iot.-2015-05-28.list-certificates-bycarequest/marker :portkey.aws.iot.-2015-05-28.list-certificates-bycarequest/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/alarm-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/hash-key-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.republish-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.republish-action/topic (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-pattern))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/republish-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.republish-action/roleArn :portkey.aws.iot.-2015-05-28.republish-action/topic] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registercacertificate-request/ca-certificate (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registercacertificate-request/verification-certificate (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registercacertificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registercacertificate-request/allow-auto-registration (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/allow-auto-registration))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registercacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.registercacertificate-request/caCertificate :portkey.aws.iot.-2015-05-28.registercacertificate-request/verificationCertificate] :opt-un [:portkey.aws.iot.-2015-05-28.registercacertificate-request/setAsActive :portkey.aws.iot.-2015-05-28.registercacertificate-request/allowAutoRegistration]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policies-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-policies-request/marker :portkey.aws.iot.-2015-05-28.list-policies-request/pageSize :portkey.aws.iot.-2015-05-28.list-policies-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/register-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.register-certificate-response/certificateArn :portkey.aws.iot.-2015-05-28.register-certificate-response/certificateId]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/metric-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/client-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-already-completed-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-already-completed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-already-completed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-principals-response/principals (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principals))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-principals-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-principals-response/principals]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/endpoint (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-endpoint))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/index (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-index))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.elasticsearch-action/roleArn :portkey.aws.iot.-2015-05-28.elasticsearch-action/endpoint :portkey.aws.iot.-2015-05-28.elasticsearch-action/index :portkey.aws.iot.-2015-05-28.elasticsearch-action/type :portkey.aws.iot.-2015-05-28.elasticsearch-action/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-index (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policies (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/policy :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-as-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/table-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-iot-sql-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.disable-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/disable-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.disable-topic-rule-request/ruleName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/sql (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/range-key-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/range-key-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/table-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/table-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/hash-key-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/hash-key-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/range-key-field (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/range-key-field))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/hash-key-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamo-key-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/operation (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamo-operation))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/payload-field (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/payload-field))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/hash-key-field (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/hash-key-field))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamodbaction/range-key-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamo-key-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/dynamodbaction (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.dynamodbaction/tableName :portkey.aws.iot.-2015-05-28.dynamodbaction/roleArn :portkey.aws.iot.-2015-05-28.dynamodbaction/hashKeyField :portkey.aws.iot.-2015-05-28.dynamodbaction/hashKeyValue] :opt-un [:portkey.aws.iot.-2015-05-28.dynamodbaction/rangeKeyValue :portkey.aws.iot.-2015-05-28.dynamodbaction/rangeKeyField :portkey.aws.iot.-2015-05-28.dynamodbaction/hashKeyType :portkey.aws.iot.-2015-05-28.dynamodbaction/operation :portkey.aws.iot.-2015-05-28.dynamodbaction/payloadField :portkey.aws.iot.-2015-05-28.dynamodbaction/rangeKeyType]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-response/principals (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principals))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policy-principals-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-policy-principals-response/principals :portkey.aws.iot.-2015-05-28.list-policy-principals-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-rule-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/topic-rule-list-item :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/remove-thing-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/remove-thing-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.update-thing-request/thingName] :opt-un [:portkey.aws.iot.-2015-05-28.update-thing-request/thingTypeName :portkey.aws.iot.-2015-05-28.update-thing-request/attributePayload :portkey.aws.iot.-2015-05-28.update-thing-request/expectedVersion :portkey.aws.iot.-2015-05-28.update-thing-request/removeThingType]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-version-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[0-9]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-response/thing-types (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-types-response/thingTypes :portkey.aws.iot.-2015-05-28.list-thing-types-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.describecacertificate-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/dynamo-operation (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-response/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-response/thing-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-response/thingName :portkey.aws.iot.-2015-05-28.create-thing-response/thingArn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policy-principals-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.list-policy-principals-request/policyName] :opt-un [:portkey.aws.iot.-2015-05-28.list-policy-principals-request/marker :portkey.aws.iot.-2015-05-28.list-policy-principals-request/pageSize :portkey.aws.iot.-2015-05-28.list-policy-principals-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-status (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {:inactive "INACTIVE", "REGISTER_INACTIVE" "REGISTER_INACTIVE", "REVOKED" "REVOKED", :revoked "REVOKED", :pending-activation "PENDING_ACTIVATION", :register-inactive "REGISTER_INACTIVE", :pending-transfer "PENDING_TRANSFER", :active "ACTIVE", "INACTIVE" "INACTIVE", "PENDING_ACTIVATION" "PENDING_ACTIVATION", "ACTIVE" "ACTIVE", "PENDING_TRANSFER" "PENDING_TRANSFER"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.policy/policyName :portkey.aws.iot.-2015-05-28.policy/policyArn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/key-pair (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28/PublicKey :portkey.aws.iot.-2015-05-28/PrivateKey]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.malformed-policy-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/malformed-policy-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.malformed-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-as-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registercacertificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registercacertificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registercacertificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.registercacertificate-response/certificateArn :portkey.aws.iot.-2015-05-28.registercacertificate-response/certificateId]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.logging-options-payload/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.logging-options-payload/log-level (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/logging-options-payload (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.logging-options-payload/roleArn] :opt-un [:portkey.aws.iot.-2015-05-28.logging-options-payload/logLevel]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.salesforce-action/token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/salesforce-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.salesforce-action/url (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/salesforce-endpoint))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/salesforce-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.salesforce-action/token :portkey.aws.iot.-2015-05-28.salesforce-action/url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/salesforce-endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 2000)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"https://ingestion-[a-zA-Z0-9]{1,12}\.[a-zA-Z0-9]+\.((sfdc-matrix\.net)|(sfdcnow\.com))/streams/\w{1,20}/\w{1,20}/event" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/metric-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-policies-response/policies :portkey.aws.iot.-2015-05-28.list-policies-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ascending-order clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/is-default-version clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/optional-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/principal (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate-description/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate-description/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate-description/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate-description/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate-description/owned-by (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate-description/auto-registration-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/auto-registration-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cacertificate-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.cacertificate-description/certificateArn :portkey.aws.iot.-2015-05-28.cacertificate-description/certificateId :portkey.aws.iot.-2015-05-28.cacertificate-description/status :portkey.aws.iot.-2015-05-28.cacertificate-description/certificatePem :portkey.aws.iot.-2015-05-28.cacertificate-description/ownedBy :portkey.aws.iot.-2015-05-28.cacertificate-description/creationDate :portkey.aws.iot.-2015-05-28.cacertificate-description/autoRegistrationStatus]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/transfer-message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/reject-reason (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/transfer-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/accept-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/reject-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-data/transferMessage :portkey.aws.iot.-2015-05-28.transfer-data/rejectReason :portkey.aws.iot.-2015-05-28.transfer-data/transferDate :portkey.aws.iot.-2015-05-28.transfer-data/acceptDate :portkey.aws.iot.-2015-05-28.transfer-data/rejectDate]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registration-code-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registration-code-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.registration-code-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-versions (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/policy-version :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/alarm-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/alarm-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/state-reason (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/state-reason))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/state-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/state-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cloudwatch-alarm-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/roleArn :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/alarmName :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/stateReason :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/stateValue] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.lambda-action/function-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/function-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/lambda-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.lambda-action/functionArn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-logging-options-request/logging-options-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/logging-options-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-logging-options-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.set-logging-options-request/loggingOptionsPayload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 64 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"(0x)?[a-fA-F0-9]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-thing-principal-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/endpoint-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-pem (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-request/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.create-thing-type-request/thingTypeName] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-type-request/thingTypeProperties]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/dynamodb (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamodbaction))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/sns (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/sns-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/cloudwatch-alarm (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cloudwatch-alarm-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/republish (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/republish-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/kinesis (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/kinesis-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/s3 (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s3-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/salesforce (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/salesforce-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/sqs (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/sqs-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/elasticsearch (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/cloudwatch-metric (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cloudwatch-metric-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/firehose (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/firehose-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/dynamodbv2 (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamodbv2-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/lambda (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/lambda-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.action/dynamoDB :portkey.aws.iot.-2015-05-28.action/sns :portkey.aws.iot.-2015-05-28.action/cloudwatchAlarm :portkey.aws.iot.-2015-05-28.action/republish :portkey.aws.iot.-2015-05-28.action/kinesis :portkey.aws.iot.-2015-05-28.action/s3 :portkey.aws.iot.-2015-05-28.action/salesforce :portkey.aws.iot.-2015-05-28.action/sqs :portkey.aws.iot.-2015-05-28.action/elasticsearch :portkey.aws.iot.-2015-05-28.action/cloudwatchMetric :portkey.aws.iot.-2015-05-28.action/firehose :portkey.aws.iot.-2015-05-28.action/dynamoDBv2 :portkey.aws.iot.-2015-05-28.action/lambda]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-type-definition :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-topic-rule-request/topic-rule-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-rule-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.create-topic-rule-request/ruleName :portkey.aws.iot.-2015-05-28.create-topic-rule-request/topicRulePayload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/created-at-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate/certificateArn :portkey.aws.iot.-2015-05-28.certificate/certificateId :portkey.aws.iot.-2015-05-28.certificate/status :portkey.aws.iot.-2015-05-28.certificate/creationDate]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-response/is-default-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-policy-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-policy-version-response/policyArn :portkey.aws.iot.-2015-05-28.create-policy-version-response/policyDocument :portkey.aws.iot.-2015-05-28.create-policy-version-response/policyVersionId :portkey.aws.iot.-2015-05-28.create-policy-version-response/isDefaultVersion]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"https?://.*" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/attribute-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/attribute-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-things-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-things-request/nextToken :portkey.aws.iot.-2015-05-28.list-things-request/maxResults :portkey.aws.iot.-2015-05-28.list-things-request/attributeName :portkey.aws.iot.-2015-05-28.list-things-request/attributeValue :portkey.aws.iot.-2015-05-28.list-things-request/thingTypeName]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-endpoint-response/endpoint-address (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/endpoint-address))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-endpoint-response/endpointAddress]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.replace-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.replace-topic-rule-request/topic-rule-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-rule-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/replace-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.replace-topic-rule-request/ruleName :portkey.aws.iot.-2015-05-28.replace-topic-rule-request/topicRulePayload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s3-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s3-action/bucket-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/bucket-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s3-action/key (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/key))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s3-action/canned-acl (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/canned-access-control-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s3-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.s3-action/roleArn :portkey.aws.iot.-2015-05-28.s3-action/bucketName :portkey.aws.iot.-2015-05-28.s3-action/key] :opt-un [:portkey.aws.iot.-2015-05-28.s3-action/cannedAcl]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-registration-code-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.kinesis-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.kinesis-action/stream-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.kinesis-action/partition-key (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/partition-key))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/kinesis-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.kinesis-action/roleArn :portkey.aws.iot.-2015-05-28.kinesis-action/streamName] :opt-un [:portkey.aws.iot.-2015-05-28.kinesis-action/partitionKey]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cacertificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cacertificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.cacertificate/certificateArn :portkey.aws.iot.-2015-05-28.cacertificate/certificateId :portkey.aws.iot.-2015-05-28.cacertificate/status :portkey.aws.iot.-2015-05-28.cacertificate/creationDate]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-response/things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-attribute-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-things-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-things-response/things :portkey.aws.iot.-2015-05-28.list-things-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-request/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-request/set-as-default (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-default))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.-2015-05-28.create-policy-version-request/policyName :portkey.aws.iot.-2015-05-28.create-policy-version-request/policyDocument] :opt-un [:portkey.aws.iot.-2015-05-28.create-policy-version-request/setAsDefault]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-response/thing-type-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-type-response/thingTypeName :portkey.aws.iot.-2015-05-28.create-thing-type-response/thingTypeArn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-response/outgoing-certificates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/outgoing-certificates))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-outgoing-certificates-response/outgoingCertificates :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/payload-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/topic-pattern (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-pattern))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/created-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/created-at-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-rule-list-item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.topic-rule-list-item/ruleArn :portkey.aws.iot.-2015-05-28.topic-rule-list-item/ruleName :portkey.aws.iot.-2015-05-28.topic-rule-list-item/topicPattern :portkey.aws.iot.-2015-05-28.topic-rule-list-item/createdAt :portkey.aws.iot.-2015-05-28.topic-rule-list-item/ruleDisabled]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/firehose-separator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"([\n\t])|(\r\n)|(,)" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/principals (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/principal-arn :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/sql (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/sql))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/created-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/created-at-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/actions (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/action-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/aws-iot-sql-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-iot-sql-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-rule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.topic-rule/ruleName :portkey.aws.iot.-2015-05-28.topic-rule/sql :portkey.aws.iot.-2015-05-28.topic-rule/description :portkey.aws.iot.-2015-05-28.topic-rule/createdAt :portkey.aws.iot.-2015-05-28.topic-rule/actions :portkey.aws.iot.-2015-05-28.topic-rule/ruleDisabled :portkey.aws.iot.-2015-05-28.topic-rule/awsIotSqlVersion]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registration-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 64 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"(0x)?[a-fA-F0-9]+" s__8151__auto__))))

(clojure.core/defn list-policy-versions ([list-policy-versions-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/policies/{policyName}/version" list-policy-versions-request :portkey.aws.iot.-2015-05-28/list-policy-versions-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/list-policy-versions-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-policy-versions-response))

(clojure.core/defn delete-policy-version ([delete-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/policies/{policyName}/version/{policyVersionId}" delete-policy-version-request :portkey.aws.iot.-2015-05-28/delete-policy-version-request {:payload nil, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil nil {"DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn attach-principal-policy ([attach-principal-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PUT" "/principal-policies/{policyName}" attach-principal-policy-request :portkey.aws.iot.-2015-05-28/attach-principal-policy-request {:payload nil, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception})))
(clojure.spec.alpha/fdef attach-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/attach-principal-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-certificates-byca ([list-certificates-bycarequest] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/certificates-by-ca/{caCertificateId}" list-certificates-bycarequest :portkey.aws.iot.-2015-05-28/list-certificates-bycarequest {:payload nil, :headers {}, :uri {"caCertificateId" "caCertificateId"}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot.-2015-05-28/list-certificates-bycaresponse {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-certificates-byca :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-certificates-bycarequest) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-certificates-bycaresponse))

(clojure.core/defn get-policy-version ([get-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/policies/{policyName}/version/{policyVersionId}" get-policy-version-request :portkey.aws.iot.-2015-05-28/get-policy-version-request {:payload nil, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/get-policy-version-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef get-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/get-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-policy-version-response))

(clojure.core/defn cancel-certificate-transfer ([cancel-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PATCH" "/cancel-certificate-transfer/{certificateId}" cancel-certificate-transfer-request :portkey.aws.iot.-2015-05-28/cancel-certificate-transfer-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot.-2015-05-28/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef cancel-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/cancel-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn listcacertificates ([] (listcacertificates {})) ([listcacertificates-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/cacertificates" listcacertificates-request :portkey.aws.iot.-2015-05-28/listcacertificates-request {:payload nil, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot.-2015-05-28/listcacertificates-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef listcacertificates :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/listcacertificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/listcacertificates-response))

(clojure.core/defn create-thing ([create-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/things/{thingName}" create-thing-request :portkey.aws.iot.-2015-05-28/create-thing-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/create-thing-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception})))
(clojure.spec.alpha/fdef create-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-thing-response))

(clojure.core/defn create-topic-rule ([create-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/rules/{ruleName}" create-topic-rule-request :portkey.aws.iot.-2015-05-28/create-topic-rule-request {:payload "topicRulePayload", :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"SqlParseException" :portkey.aws.iot.-2015-05-28/sql-parse-exception, "InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn accept-certificate-transfer ([accept-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PATCH" "/accept-certificate-transfer/{certificateId}" accept-certificate-transfer-request :portkey.aws.iot.-2015-05-28/accept-certificate-transfer-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"setAsActive" "setAsActive"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot.-2015-05-28/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef accept-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/accept-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn get-registration-code ([] (get-registration-code {})) ([get-registration-code-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/registrationcode" get-registration-code-request :portkey.aws.iot.-2015-05-28/get-registration-code-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/get-registration-code-response {"ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception})))
(clojure.spec.alpha/fdef get-registration-code :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/get-registration-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-registration-code-response))

(clojure.core/defn list-policies ([] (list-policies {})) ([list-policies-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/policies" list-policies-request :portkey.aws.iot.-2015-05-28/list-policies-request {:payload nil, :headers {}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot.-2015-05-28/list-policies-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-policies-response))

(clojure.core/defn delete-registration-code ([] (delete-registration-code {})) ([delete-registration-code-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/registrationcode" delete-registration-code-request :portkey.aws.iot.-2015-05-28/delete-registration-code-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/delete-registration-code-response {"ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-registration-code :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/delete-registration-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-registration-code-response))

(clojure.core/defn describecacertificate ([describecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/cacertificate/{caCertificateId}" describecacertificate-request :portkey.aws.iot.-2015-05-28/describecacertificate-request {:payload nil, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/describecacertificate-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception})))
(clojure.spec.alpha/fdef describecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describecacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describecacertificate-response))

(clojure.core/defn detach-thing-principal ([detach-thing-principal-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/things/{thingName}/principals" detach-thing-principal-request :portkey.aws.iot.-2015-05-28/detach-thing-principal-request {:payload nil, :headers {"principal" ["x-amzn-principal" nil]}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/detach-thing-principal-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef detach-thing-principal :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/detach-thing-principal-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/detach-thing-principal-response))

(clojure.core/defn list-outgoing-certificates ([] (list-outgoing-certificates {})) ([list-outgoing-certificates-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/certificates-out-going" list-outgoing-certificates-request :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-request {:payload nil, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-outgoing-certificates :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-response))

(clojure.core/defn deletecacertificate ([deletecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/cacertificate/{caCertificateId}" deletecacertificate-request :portkey.aws.iot.-2015-05-28/deletecacertificate-request {:payload nil, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/deletecacertificate-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception})))
(clojure.spec.alpha/fdef deletecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/deletecacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/deletecacertificate-response))

(clojure.core/defn list-principal-things ([list-principal-things-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/principals/things" list-principal-things-request :portkey.aws.iot.-2015-05-28/list-principal-things-request {:payload nil, :headers {"principal" ["x-amzn-principal" nil]}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iot.-2015-05-28/list-principal-things-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-principal-things :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-principal-things-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-principal-things-response))

(clojure.core/defn create-policy-version ([create-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/policies/{policyName}/version" create-policy-version-request :portkey.aws.iot.-2015-05-28/create-policy-version-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {"setAsDefault" "setAsDefault"}} nil :portkey.aws.iot.-2015-05-28/create-policy-version-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "MalformedPolicyException" :portkey.aws.iot.-2015-05-28/malformed-policy-exception, "VersionsLimitExceededException" :portkey.aws.iot.-2015-05-28/versions-limit-exceeded-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef create-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-policy-version-response))

(clojure.core/defn describe-endpoint ([] (describe-endpoint {})) ([describe-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/endpoint" describe-endpoint-request :portkey.aws.iot.-2015-05-28/describe-endpoint-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/describe-endpoint-response {"InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception})))
(clojure.spec.alpha/fdef describe-endpoint :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/describe-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-endpoint-response))

(clojure.core/defn register-certificate ([register-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/certificate/register" register-certificate-request :portkey.aws.iot.-2015-05-28/register-certificate-request {:payload nil, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot.-2015-05-28/register-certificate-response {"UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "CertificateValidationException" :portkey.aws.iot.-2015-05-28/certificate-validation-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "CertificateConflictException" :portkey.aws.iot.-2015-05-28/certificate-conflict-exception})))
(clojure.spec.alpha/fdef register-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/register-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/register-certificate-response))

(clojure.core/defn get-policy ([get-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/policies/{policyName}" get-policy-request :portkey.aws.iot.-2015-05-28/get-policy-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/get-policy-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-policy-response))

(clojure.core/defn enable-topic-rule ([enable-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/rules/{ruleName}/enable" enable-topic-rule-request :portkey.aws.iot.-2015-05-28/enable-topic-rule-request {:payload nil, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception})))
(clojure.spec.alpha/fdef enable-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/enable-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn deprecate-thing-type ([deprecate-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/thing-types/{thingTypeName}/deprecate" deprecate-thing-type-request :portkey.aws.iot.-2015-05-28/deprecate-thing-type-request {:payload nil, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/deprecate-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef deprecate-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/deprecate-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/deprecate-thing-type-response))

(clojure.core/defn delete-thing-type ([delete-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/thing-types/{thingTypeName}" delete-thing-type-request :portkey.aws.iot.-2015-05-28/delete-thing-type-request {:payload nil, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/delete-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-thing-type-response))

(clojure.core/defn replace-topic-rule ([replace-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PATCH" "/rules/{ruleName}" replace-topic-rule-request :portkey.aws.iot.-2015-05-28/replace-topic-rule-request {:payload "topicRulePayload", :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"SqlParseException" :portkey.aws.iot.-2015-05-28/sql-parse-exception, "InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception})))
(clojure.spec.alpha/fdef replace-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/replace-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn get-topic-rule ([get-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/rules/{ruleName}" get-topic-rule-request :portkey.aws.iot.-2015-05-28/get-topic-rule-request {:payload nil, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/get-topic-rule-response {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception})))
(clojure.spec.alpha/fdef get-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/get-topic-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-topic-rule-response))

(clojure.core/defn reject-certificate-transfer ([reject-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PATCH" "/reject-certificate-transfer/{certificateId}" reject-certificate-transfer-request :portkey.aws.iot.-2015-05-28/reject-certificate-transfer-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot.-2015-05-28/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef reject-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/reject-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn delete-thing ([delete-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/things/{thingName}" delete-thing-request :portkey.aws.iot.-2015-05-28/delete-thing-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {"expectedVersion" "expectedVersion"}} nil :portkey.aws.iot.-2015-05-28/delete-thing-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-thing-response))

(clojure.core/defn list-certificates ([] (list-certificates {})) ([list-certificates-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/certificates" list-certificates-request :portkey.aws.iot.-2015-05-28/list-certificates-request {:payload nil, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot.-2015-05-28/list-certificates-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-certificates :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-certificates-response))

(clojure.core/defn list-thing-types ([] (list-thing-types {})) ([list-thing-types-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/thing-types" list-thing-types-request :portkey.aws.iot.-2015-05-28/list-thing-types-request {:payload nil, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "thingTypeName" "thingTypeName"}} nil :portkey.aws.iot.-2015-05-28/list-thing-types-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-thing-types :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-thing-types-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-thing-types-response))

(clojure.core/defn describe-thing ([describe-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/things/{thingName}" describe-thing-request :portkey.aws.iot.-2015-05-28/describe-thing-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/describe-thing-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-thing-response))

(clojure.core/defn list-policy-principals ([list-policy-principals-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/policy-principals" list-policy-principals-request :portkey.aws.iot.-2015-05-28/list-policy-principals-request {:payload nil, :headers {"policyName" ["x-amzn-iot-policy" nil]}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot.-2015-05-28/list-policy-principals-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policy-principals :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-policy-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-policy-principals-response))

(clojure.core/defn set-default-policy-version ([set-default-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PATCH" "/policies/{policyName}/version/{policyVersionId}" set-default-policy-version-request :portkey.aws.iot.-2015-05-28/set-default-policy-version-request {:payload nil, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef set-default-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/set-default-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn create-policy ([create-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/policies/{policyName}" create-policy-request :portkey.aws.iot.-2015-05-28/create-policy-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/create-policy-response {"ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "MalformedPolicyException" :portkey.aws.iot.-2015-05-28/malformed-policy-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-policy-response))

(clojure.core/defn describe-thing-type ([describe-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/thing-types/{thingTypeName}" describe-thing-type-request :portkey.aws.iot.-2015-05-28/describe-thing-type-request {:payload nil, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/describe-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-thing-type-response))

(clojure.core/defn attach-thing-principal ([attach-thing-principal-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PUT" "/things/{thingName}/principals" attach-thing-principal-request :portkey.aws.iot.-2015-05-28/attach-thing-principal-request {:payload nil, :headers {"principal" ["x-amzn-principal" nil]}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/attach-thing-principal-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef attach-thing-principal :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/attach-thing-principal-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attach-thing-principal-response))

(clojure.core/defn create-keys-and-certificate ([] (create-keys-and-certificate {})) ([create-keys-and-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/keys-and-certificate" create-keys-and-certificate-request :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-request {:payload nil, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef create-keys-and-certificate :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-response))

(clojure.core/defn registercacertificate ([registercacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/cacertificate" registercacertificate-request :portkey.aws.iot.-2015-05-28/registercacertificate-request {:payload nil, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive", "allowAutoRegistration" "allowAutoRegistration"}} nil :portkey.aws.iot.-2015-05-28/registercacertificate-response {"UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "CertificateValidationException" :portkey.aws.iot.-2015-05-28/certificate-validation-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "RegistrationCodeValidationException" :portkey.aws.iot.-2015-05-28/registration-code-validation-exception})))
(clojure.spec.alpha/fdef registercacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/registercacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registercacertificate-response))

(clojure.core/defn disable-topic-rule ([disable-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/rules/{ruleName}/disable" disable-topic-rule-request :portkey.aws.iot.-2015-05-28/disable-topic-rule-request {:payload nil, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception})))
(clojure.spec.alpha/fdef disable-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/disable-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn list-topic-rules ([] (list-topic-rules {})) ([list-topic-rules-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/rules" list-topic-rules-request :portkey.aws.iot.-2015-05-28/list-topic-rules-request {:payload nil, :headers {}, :uri {}, :querystring {"topic" "topic", "maxResults" "maxResults", "nextToken" "nextToken", "ruleDisabled" "ruleDisabled"}} nil :portkey.aws.iot.-2015-05-28/list-topic-rules-response {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-topic-rules :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-topic-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-topic-rules-response))

(clojure.core/defn detach-principal-policy ([detach-principal-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/principal-policies/{policyName}" detach-principal-policy-request :portkey.aws.iot.-2015-05-28/detach-principal-policy-request {:payload nil, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef detach-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/detach-principal-policy-request) :ret clojure.core/true?)

(clojure.core/defn updatecacertificate ([updatecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PUT" "/cacertificate/{caCertificateId}" updatecacertificate-request :portkey.aws.iot.-2015-05-28/updatecacertificate-request {:payload nil, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {"newStatus" "newStatus", "newAutoRegistrationStatus" "newAutoRegistrationStatus"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef updatecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/updatecacertificate-request) :ret clojure.core/true?)

(clojure.core/defn delete-topic-rule ([delete-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/rules/{ruleName}" delete-topic-rule-request :portkey.aws.iot.-2015-05-28/delete-topic-rule-request {:payload nil, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception})))
(clojure.spec.alpha/fdef delete-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn describe-certificate ([describe-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/certificates/{certificateId}" describe-certificate-request :portkey.aws.iot.-2015-05-28/describe-certificate-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/describe-certificate-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception})))
(clojure.spec.alpha/fdef describe-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-certificate-response))

(clojure.core/defn set-logging-options ([set-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/loggingOptions" set-logging-options-request :portkey.aws.iot.-2015-05-28/set-logging-options-request {:payload "loggingOptionsPayload", :headers {}, :uri {}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception})))
(clojure.spec.alpha/fdef set-logging-options :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/set-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn list-thing-principals ([list-thing-principals-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/things/{thingName}/principals" list-thing-principals-request :portkey.aws.iot.-2015-05-28/list-thing-principals-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/list-thing-principals-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-thing-principals :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-thing-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-thing-principals-response))

(clojure.core/defn list-principal-policies ([list-principal-policies-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/principal-policies" list-principal-policies-request :portkey.aws.iot.-2015-05-28/list-principal-policies-request {:payload nil, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot.-2015-05-28/list-principal-policies-response {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-principal-policies :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-principal-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-principal-policies-response))

(clojure.core/defn transfer-certificate ([transfer-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PATCH" "/transfer-certificate/{certificateId}" transfer-certificate-request :portkey.aws.iot.-2015-05-28/transfer-certificate-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"targetAwsAccount" "targetAwsAccount"}} nil :portkey.aws.iot.-2015-05-28/transfer-certificate-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "TransferConflictException" :portkey.aws.iot.-2015-05-28/transfer-conflict-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef transfer-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/transfer-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/transfer-certificate-response))

(clojure.core/defn delete-policy ([delete-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/policies/{policyName}" delete-policy-request :portkey.aws.iot.-2015-05-28/delete-policy-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-thing ([update-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PATCH" "/things/{thingName}" update-thing-request :portkey.aws.iot.-2015-05-28/update-thing-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/update-thing-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception})))
(clojure.spec.alpha/fdef update-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-thing-response))

(clojure.core/defn delete-certificate ([delete-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "DELETE" "/certificates/{certificateId}" delete-certificate-request :portkey.aws.iot.-2015-05-28/delete-certificate-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil nil {"CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception})))
(clojure.spec.alpha/fdef delete-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-certificate-request) :ret clojure.core/true?)

(clojure.core/defn get-logging-options ([] (get-logging-options {})) ([get-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/loggingOptions" get-logging-options-request :portkey.aws.iot.-2015-05-28/get-logging-options-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/get-logging-options-response {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-logging-options :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/get-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-logging-options-response))

(clojure.core/defn create-thing-type ([create-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/thing-types/{thingTypeName}" create-thing-type-request :portkey.aws.iot.-2015-05-28/create-thing-type-request {:payload nil, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot.-2015-05-28/create-thing-type-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception})))
(clojure.spec.alpha/fdef create-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-thing-type-response))

(clojure.core/defn update-certificate ([update-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "PUT" "/certificates/{certificateId}" update-certificate-request :portkey.aws.iot.-2015-05-28/update-certificate-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"newStatus" "newStatus"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef update-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-certificate-request) :ret clojure.core/true?)

(clojure.core/defn create-certificate-from-csr ([create-certificate-from-csr-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "POST" "/certificates" create-certificate-from-csr-request :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-request {:payload nil, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef create-certificate-from-csr :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-response))

(clojure.core/defn list-things ([] (list-things {})) ([list-things-request] (portkey.aws/-rest-json-call portkey.aws.iot.-2015-05-28/endpoints "GET" "/things" list-things-request :portkey.aws.iot.-2015-05-28/list-things-request {:payload nil, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "attributeName" "attributeName", "attributeValue" "attributeValue", "thingTypeName" "thingTypeName"}} nil :portkey.aws.iot.-2015-05-28/list-things-response {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception})))
(clojure.spec.alpha/fdef list-things :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-things-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-things-response))
