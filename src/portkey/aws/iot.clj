(ns portkey.aws.iot (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.iot.accept-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.accept-certificate-transfer-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot/accept-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.accept-certificate-transfer-request/certificateId] :opt-un [:portkey.aws.iot.accept-certificate-transfer-request/setAsActive]))

(clojure.spec.alpha/def :portkey.aws.iot/registry-max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot.list-policy-versions-response/policy-versions (clojure.spec.alpha/and :portkey.aws.iot/policy-versions))
(clojure.spec.alpha/def :portkey.aws.iot/list-policy-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-policy-versions-response/policyVersions]))

(clojure.spec.alpha/def :portkey.aws.iot/auto-registration-status (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"ENABLE" "ENABLE", :enable "ENABLE", "DISABLE" "DISABLE", :disable "DISABLE"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.deprecate-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.deprecate-thing-type-request/undo-deprecate (clojure.spec.alpha/and :portkey.aws.iot/undo-deprecate))
(clojure.spec.alpha/def :portkey.aws.iot/deprecate-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.deprecate-thing-type-request/thingTypeName] :opt-un [:portkey.aws.iot.deprecate-thing-type-request/undoDeprecate]))

(clojure.spec.alpha/def :portkey.aws.iot.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/outgoing-certificates (clojure.spec.alpha/coll-of :portkey.aws.iot/outgoing-certificate :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.detach-principal-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.detach-principal-policy-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/detach-principal-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.detach-principal-policy-request/policyName :portkey.aws.iot.detach-principal-policy-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/range-key-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/thing-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-attribute :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.thing-type-properties/thing-type-description (clojure.spec.alpha/and :portkey.aws.iot/thing-type-description))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-properties/searchable-attributes (clojure.spec.alpha/and :portkey.aws.iot/searchable-attributes))
(clojure.spec.alpha/def :portkey.aws.iot/thing-type-properties (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-type-properties/thingTypeDescription :portkey.aws.iot.thing-type-properties/searchableAttributes]))

(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-request/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-request/ca-certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active-flag))
(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-request/status (clojure.spec.alpha/and :portkey.aws.iot/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot/register-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.register-certificate-request/certificatePem] :opt-un [:portkey.aws.iot.register-certificate-request/caCertificatePem :portkey.aws.iot.register-certificate-request/setAsActive :portkey.aws.iot.register-certificate-request/status]))

(clojure.spec.alpha/def :portkey.aws.iot/detach-thing-principal-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-request/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-thing-request/thingName] :opt-un [:portkey.aws.iot.create-thing-request/thingTypeName :portkey.aws.iot.create-thing-request/attributePayload]))

(clojure.spec.alpha/def :portkey.aws.iot/stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.dynamodbv2-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbv2-action/put-item (clojure.spec.alpha/and :portkey.aws.iot/put-item-input))
(clojure.spec.alpha/def :portkey.aws.iot/dynamodbv2-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.dynamodbv2-action/roleArn :portkey.aws.iot.dynamodbv2-action/putItem]))

(clojure.spec.alpha/def :portkey.aws.iot/delete-registration-code-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/sql (clojure.spec.alpha/and :portkey.aws.iot/sql))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/description (clojure.spec.alpha/and :portkey.aws.iot/description))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/actions (clojure.spec.alpha/and :portkey.aws.iot/action-list))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/aws-iot-sql-version (clojure.spec.alpha/and :portkey.aws.iot/aws-iot-sql-version))
(clojure.spec.alpha/def :portkey.aws.iot/topic-rule-payload (portkey.aws/json-keys :req-un [:portkey.aws.iot.topic-rule-payload/sql :portkey.aws.iot.topic-rule-payload/actions] :opt-un [:portkey.aws.iot.topic-rule-payload/description :portkey.aws.iot.topic-rule-payload/ruleDisabled :portkey.aws.iot.topic-rule-payload/awsIotSqlVersion]))

(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-response/things (clojure.spec.alpha/and :portkey.aws.iot/thing-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-principal-things-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-principal-things-response/things :portkey.aws.iot.list-principal-things-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.iot/private-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-certificate-request/target-aws-account (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-certificate-request/transfer-message (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.transfer-certificate-request/certificateId :portkey.aws.iot.transfer-certificate-request/targetAwsAccount] :opt-un [:portkey.aws.iot.transfer-certificate-request/transferMessage]))

(clojure.spec.alpha/def :portkey.aws.iot/deprecation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.update-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.update-certificate-request/new-status (clojure.spec.alpha/and :portkey.aws.iot/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot/update-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.update-certificate-request/certificateId :portkey.aws.iot.update-certificate-request/newStatus] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/topic-pattern (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/default-client-id (clojure.spec.alpha/and :portkey.aws.iot/client-id))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/attributes (clojure.spec.alpha/and :portkey.aws.iot/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/version (clojure.spec.alpha/and :portkey.aws.iot/version))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-thing-response/defaultClientId :portkey.aws.iot.describe-thing-response/thingName :portkey.aws.iot.describe-thing-response/thingTypeName :portkey.aws.iot.describe-thing-response/attributes :portkey.aws.iot.describe-thing-response/version]))

(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot/create-keys-and-certificate-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-keys-and-certificate-request/setAsActive]))

(clojure.spec.alpha/def :portkey.aws.iot.updatecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.updatecacertificate-request/new-status (clojure.spec.alpha/and :portkey.aws.iot/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.updatecacertificate-request/new-auto-registration-status (clojure.spec.alpha/and :portkey.aws.iot/auto-registration-status))
(clojure.spec.alpha/def :portkey.aws.iot/updatecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.updatecacertificate-request/certificateId] :opt-un [:portkey.aws.iot.updatecacertificate-request/newStatus :portkey.aws.iot.updatecacertificate-request/newAutoRegistrationStatus]))

(clojure.spec.alpha/def :portkey.aws.iot.certificate-state-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/certificate-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-signing-request (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot/page-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 2028)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[\p{Graph}\x20]*" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.certificate-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/certificate-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/attributes (clojure.spec.alpha/and :portkey.aws.iot/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/version (clojure.spec.alpha/and :portkey.aws.iot/version))
(clojure.spec.alpha/def :portkey.aws.iot/thing-attribute (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-attribute/thingName :portkey.aws.iot.thing-attribute/thingTypeName :portkey.aws.iot.thing-attribute/attributes :portkey.aws.iot.thing-attribute/version]))

(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-request/topic (clojure.spec.alpha/and :portkey.aws.iot/topic))
(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-request/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot/list-topic-rules-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-topic-rules-request/topic :portkey.aws.iot.list-topic-rules-request/maxResults :portkey.aws.iot.list-topic-rules-request/nextToken :portkey.aws.iot.list-topic-rules-request/ruleDisabled]))

(clojure.spec.alpha/def :portkey.aws.iot/canned-access-control-list (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"authenticated-read" "authenticated-read", "public-read-write" "public-read-write", :bucket-owner-full-control "bucket-owner-full-control", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :log-delivery-write "log-delivery-write", :authenticated-read "authenticated-read", "aws-exec-read" "aws-exec-read", :aws-exec-read "aws-exec-read", :bucket-owner-read "bucket-owner-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", "log-delivery-write" "log-delivery-write", :public-read-write "public-read-write", :public-read "public-read"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-outgoing-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-outgoing-certificates-request/pageSize :portkey.aws.iot.list-outgoing-certificates-request/marker :portkey.aws.iot.list-outgoing-certificates-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-principal-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-principal-policies-request/principal] :opt-un [:portkey.aws.iot.list-principal-policies-request/marker :portkey.aws.iot.list-principal-policies-request/pageSize :portkey.aws.iot.list-principal-policies-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.get-logging-options-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.get-logging-options-response/log-level (clojure.spec.alpha/and :portkey.aws.iot/log-level))
(clojure.spec.alpha/def :portkey.aws.iot/get-logging-options-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-logging-options-response/roleArn :portkey.aws.iot.get-logging-options-response/logLevel]))

(clojure.spec.alpha/def :portkey.aws.iot/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.,@/:#-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/transferred-to (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/transfer-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/transfer-message (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/outgoing-certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.outgoing-certificate/certificateArn :portkey.aws.iot.outgoing-certificate/certificateId :portkey.aws.iot.outgoing-certificate/transferredTo :portkey.aws.iot.outgoing-certificate/transferDate :portkey.aws.iot.outgoing-certificate/transferMessage :portkey.aws.iot.outgoing-certificate/creationDate]))

(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iot/certificates))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-certificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-certificates-response/certificates :portkey.aws.iot.list-certificates-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.set-default-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.set-default-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/set-default-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.set-default-policy-version-request/policyName :portkey.aws.iot.set-default-policy-version-request/policyVersionId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.enable-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot/enable-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.enable-topic-rule-request/ruleName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/log-level (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"DISABLED" "DISABLED", :disabled "DISABLED", :warn "WARN", "WARN" "WARN", :debug "DEBUG", "ERROR" "ERROR", "DEBUG" "DEBUG", :info "INFO", :error "ERROR", "INFO" "INFO"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/cacertificates (clojure.spec.alpha/coll-of :portkey.aws.iot/cacertificate :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/action-list (clojure.spec.alpha/coll-of :portkey.aws.iot/action :max-count 10))

(clojure.spec.alpha/def :portkey.aws.iot.reject-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.reject-certificate-transfer-request/reject-reason (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot/reject-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.reject-certificate-transfer-request/certificateId] :opt-un [:portkey.aws.iot.reject-certificate-transfer-request/rejectReason]))

(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-certificates-request/pageSize :portkey.aws.iot.list-certificates-request/marker :portkey.aws.iot.list-certificates-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot/thing-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-thing-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.get-topic-rule-response/rule-arn (clojure.spec.alpha/and :portkey.aws.iot/rule-arn))
(clojure.spec.alpha/def :portkey.aws.iot.get-topic-rule-response/rule (clojure.spec.alpha/and :portkey.aws.iot/topic-rule))
(clojure.spec.alpha/def :portkey.aws.iot/get-topic-rule-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-topic-rule-response/ruleArn :portkey.aws.iot.get-topic-rule-response/rule]))

(clojure.spec.alpha/def :portkey.aws.iot/certificates (clojure.spec.alpha/coll-of :portkey.aws.iot/certificate :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.thing-type-metadata/deprecated (clojure.spec.alpha/and :portkey.aws.iot/boolean))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-metadata/deprecation-date (clojure.spec.alpha/and :portkey.aws.iot/deprecation-date))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.iot/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot/thing-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-type-metadata/deprecated :portkey.aws.iot.thing-type-metadata/deprecationDate :portkey.aws.iot.thing-type-metadata/creationDate]))

(clojure.spec.alpha/def :portkey.aws.iot.attribute-payload/attributes (clojure.spec.alpha/and :portkey.aws.iot/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.attribute-payload/merge (clojure.spec.alpha/and :portkey.aws.iot/flag))
(clojure.spec.alpha/def :portkey.aws.iot/attribute-payload (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.attribute-payload/attributes :portkey.aws.iot.attribute-payload/merge]))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-thing-type-request/thingTypeName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.describecacertificate-response/certificate-description (clojure.spec.alpha/and :portkey.aws.iot/cacertificate-description))
(clojure.spec.alpha/def :portkey.aws.iot/describecacertificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describecacertificate-response/certificateDescription]))

(clojure.spec.alpha/def :portkey.aws.iot/state-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/use-base64 clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.describe-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/describe-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-certificate-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/principal-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-types-request/nextToken :portkey.aws.iot.list-thing-types-request/maxResults :portkey.aws.iot.list-thing-types-request/thingTypeName]))

(clojure.spec.alpha/def :portkey.aws.iot/cacertificate-status (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/partition-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.delete-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.delete-thing-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-thing-request/thingName] :opt-un [:portkey.aws.iot.delete-thing-request/expectedVersion]))

(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot/policies))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-principal-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-principal-policies-response/policies :portkey.aws.iot.list-principal-policies-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot/flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/owned-by (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/transfer-data (clojure.spec.alpha/and :portkey.aws.iot/transfer-data))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/status (clojure.spec.alpha/and :portkey.aws.iot/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/previous-owned-by (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/certificate-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate-description/creationDate :portkey.aws.iot.certificate-description/certificatePem :portkey.aws.iot.certificate-description/caCertificateId :portkey.aws.iot.certificate-description/lastModifiedDate :portkey.aws.iot.certificate-description/ownedBy :portkey.aws.iot.certificate-description/transferData :portkey.aws.iot.certificate-description/status :portkey.aws.iot.certificate-description/previousOwnedBy :portkey.aws.iot.certificate-description/certificateArn :portkey.aws.iot.certificate-description/certificateId]))

(clojure.spec.alpha/def :portkey.aws.iot.delete-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/delete-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.delete-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.detach-thing-principal-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.detach-thing-principal-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/detach-thing-principal-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.detach-thing-principal-request/thingName :portkey.aws.iot.detach-thing-principal-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/rule-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-certificate-response/transferred-certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.transfer-certificate-response/transferredCertificateArn]))

(clojure.spec.alpha/def :portkey.aws.iot.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.thing-type-definition/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-definition/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-definition/thing-type-metadata (clojure.spec.alpha/and :portkey.aws.iot/thing-type-metadata))
(clojure.spec.alpha/def :portkey.aws.iot/thing-type-definition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-type-definition/thingTypeName :portkey.aws.iot.thing-type-definition/thingTypeProperties :portkey.aws.iot.thing-type-definition/thingTypeMetadata]))

(clojure.spec.alpha/def :portkey.aws.iot/deprecate-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-response/rules (clojure.spec.alpha/and :portkey.aws.iot/topic-rule-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-topic-rules-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-topic-rules-response/rules :portkey.aws.iot.list-topic-rules-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.iot/thing-name-list (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-name :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-request/certificate-signing-request (clojure.spec.alpha/and :portkey.aws.iot/certificate-signing-request))
(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot/create-certificate-from-csr-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-certificate-from-csr-request/certificateSigningRequest] :opt-un [:portkey.aws.iot.create-certificate-from-csr-request/setAsActive]))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-response/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-response/thing-type-metadata (clojure.spec.alpha/and :portkey.aws.iot/thing-type-metadata))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-thing-type-response/thingTypeName :portkey.aws.iot.describe-thing-type-response/thingTypeProperties :portkey.aws.iot.describe-thing-type-response/thingTypeMetadata]))

(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.delete-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot/delete-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-topic-rule-request/ruleName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/set-as-active-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/resource-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.resource-already-exists-exception/message :portkey.aws.iot/resourceId :portkey.aws.iot/resourceArn]))

(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycaresponse/certificates (clojure.spec.alpha/and :portkey.aws.iot/certificates))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycaresponse/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-certificates-bycaresponse (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-certificates-bycaresponse/certificates :portkey.aws.iot.list-certificates-bycaresponse/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-principals-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-principals-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-thing-principals-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iot/cacertificates))
(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/listcacertificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.listcacertificates-response/certificates :portkey.aws.iot.listcacertificates-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-response/key-pair (clojure.spec.alpha/and :portkey.aws.iot/key-pair))
(clojure.spec.alpha/def :portkey.aws.iot/create-keys-and-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-keys-and-certificate-response/certificateArn :portkey.aws.iot.create-keys-and-certificate-response/certificateId :portkey.aws.iot.create-keys-and-certificate-response/certificatePem :portkey.aws.iot.create-keys-and-certificate-response/keyPair]))

(clojure.spec.alpha/def :portkey.aws.iot/aws-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/delete-registration-code-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/allow-auto-registration clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.policy-version/version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.policy-version/is-default-version (clojure.spec.alpha/and :portkey.aws.iot/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot.policy-version/create-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/policy-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.policy-version/versionId :portkey.aws.iot.policy-version/isDefaultVersion :portkey.aws.iot.policy-version/createDate]))

(clojure.spec.alpha/def :portkey.aws.iot.put-item-input/table-name (clojure.spec.alpha/and :portkey.aws.iot/table-name))
(clojure.spec.alpha/def :portkey.aws.iot/put-item-input (portkey.aws/json-keys :req-un [:portkey.aws.iot.put-item-input/tableName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.deletecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/deletecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.deletecacertificate-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/range-key-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/hash-key-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.firehose-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.firehose-action/delivery-stream-name (clojure.spec.alpha/and :portkey.aws.iot/delivery-stream-name))
(clojure.spec.alpha/def :portkey.aws.iot.firehose-action/separator (clojure.spec.alpha/and :portkey.aws.iot/firehose-separator))
(clojure.spec.alpha/def :portkey.aws.iot/firehose-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.firehose-action/roleArn :portkey.aws.iot.firehose-action/deliveryStreamName] :opt-un [:portkey.aws.iot.firehose-action/separator]))

(clojure.spec.alpha/def :portkey.aws.iot/metric-timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.get-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot/get-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.get-topic-rule-request/ruleName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.create-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot/create-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-policy-request/policyName :portkey.aws.iot.create-policy-request/policyDocument] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.attach-principal-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.attach-principal-policy-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/attach-principal-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.attach-principal-policy-request/policyName :portkey.aws.iot.attach-principal-policy-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/salesforce-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 40 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot/attributes (clojure.spec.alpha/map-of :portkey.aws.iot/attribute-name :portkey.aws.iot/attribute-value))

(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot/create-certificate-from-csr-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-certificate-from-csr-response/certificateArn :portkey.aws.iot.create-certificate-from-csr-response/certificateId :portkey.aws.iot.create-certificate-from-csr-response/certificatePem]))

(clojure.spec.alpha/def :portkey.aws.iot/queue-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/is-default-version (clojure.spec.alpha/and :portkey.aws.iot/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot/get-policy-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-policy-version-response/policyArn :portkey.aws.iot.get-policy-version-response/policyName :portkey.aws.iot.get-policy-version-response/policyDocument :portkey.aws.iot.get-policy-version-response/policyVersionId :portkey.aws.iot.get-policy-version-response/isDefaultVersion]))

(clojure.spec.alpha/def :portkey.aws.iot.versions-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/versions-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.versions-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/searchable-attributes (clojure.spec.alpha/coll-of :portkey.aws.iot/attribute-name :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot/message-format (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"RAW" "RAW", :raw "RAW", "JSON" "JSON", :json "JSON"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 800)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.,@/:#-]*" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/listcacertificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.listcacertificates-request/pageSize :portkey.aws.iot.listcacertificates-request/marker :portkey.aws.iot.listcacertificates-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot/dynamo-key-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"STRING" "STRING", :string "STRING", "NUMBER" "NUMBER", :number "NUMBER"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.delete-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/delete-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-certificate-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.cancel-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/cancel-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.cancel-certificate-transfer-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.get-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot/get-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.get-policy-request/policyName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.get-registration-code-response/registration-code (clojure.spec.alpha/and :portkey.aws.iot/registration-code))
(clojure.spec.alpha/def :portkey.aws.iot/get-registration-code-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-registration-code-response/registrationCode]))

(clojure.spec.alpha/def :portkey.aws.iot/get-logging-options-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.sns-action/target-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.sns-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.sns-action/message-format (clojure.spec.alpha/and :portkey.aws.iot/message-format))
(clojure.spec.alpha/def :portkey.aws.iot/sns-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.sns-action/targetArn :portkey.aws.iot.sns-action/roleArn] :opt-un [:portkey.aws.iot.sns-action/messageFormat]))

(clojure.spec.alpha/def :portkey.aws.iot/undo-deprecate clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/deletecacertificate-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.delete-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-thing-type-request/thingTypeName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.delete-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot/delete-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-policy-request/policyName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.delete-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.delete-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/delete-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-policy-version-request/policyName :portkey.aws.iot.delete-policy-version-request/policyVersionId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[0-9]{12}" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot/is-disabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.sql-parse-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/sql-parse-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.sql-parse-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.internal-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/internal-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.internal-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.get-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-response/default-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/get-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-policy-response/policyName :portkey.aws.iot.get-policy-response/policyArn :portkey.aws.iot.get-policy-response/policyDocument :portkey.aws.iot.get-policy-response/defaultVersionId]))

(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-namespace (clojure.spec.alpha/and :portkey.aws.iot/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-name (clojure.spec.alpha/and :portkey.aws.iot/metric-name))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-value (clojure.spec.alpha/and :portkey.aws.iot/metric-value))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-unit (clojure.spec.alpha/and :portkey.aws.iot/metric-unit))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-timestamp (clojure.spec.alpha/and :portkey.aws.iot/metric-timestamp))
(clojure.spec.alpha/def :portkey.aws.iot/cloudwatch-metric-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.cloudwatch-metric-action/roleArn :portkey.aws.iot.cloudwatch-metric-action/metricNamespace :portkey.aws.iot.cloudwatch-metric-action/metricName :portkey.aws.iot.cloudwatch-metric-action/metricValue :portkey.aws.iot.cloudwatch-metric-action/metricUnit] :opt-un [:portkey.aws.iot.cloudwatch-metric-action/metricTimestamp]))

(clojure.spec.alpha/def :portkey.aws.iot.version-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/version-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.version-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.create-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/create-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-policy-response/policyName :portkey.aws.iot.create-policy-response/policyArn :portkey.aws.iot.create-policy-response/policyDocument :portkey.aws.iot.create-policy-response/policyVersionId]))

(clojure.spec.alpha/def :portkey.aws.iot/remove-thing-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/delivery-stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.attach-thing-principal-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.attach-thing-principal-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/attach-thing-principal-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.attach-thing-principal-request/thingName :portkey.aws.iot.attach-thing-principal-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.sqs-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.sqs-action/queue-url (clojure.spec.alpha/and :portkey.aws.iot/queue-url))
(clojure.spec.alpha/def :portkey.aws.iot.sqs-action/use-base64 (clojure.spec.alpha/and :portkey.aws.iot/use-base64))
(clojure.spec.alpha/def :portkey.aws.iot/sqs-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.sqs-action/roleArn :portkey.aws.iot.sqs-action/queueUrl] :opt-un [:portkey.aws.iot.sqs-action/useBase64]))

(clojure.spec.alpha/def :portkey.aws.iot.list-policy-versions-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot/list-policy-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-policy-versions-request/policyName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/get-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.get-policy-version-request/policyName :portkey.aws.iot.get-policy-version-request/policyVersionId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/update-thing-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/policy-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/list-principal-things-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-principal-things-request/principal] :opt-un [:portkey.aws.iot.list-principal-things-request/nextToken :portkey.aws.iot.list-principal-things-request/maxResults]))

(clojure.spec.alpha/def :portkey.aws.iot.describe-certificate-response/certificate-description (clojure.spec.alpha/and :portkey.aws.iot/certificate-description))
(clojure.spec.alpha/def :portkey.aws.iot/describe-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-certificate-response/certificateDescription]))

(clojure.spec.alpha/def :portkey.aws.iot/describe-endpoint-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycarequest/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycarequest/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycarequest/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycarequest/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-certificates-bycarequest (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-certificates-bycarequest/caCertificateId] :opt-un [:portkey.aws.iot.list-certificates-bycarequest/pageSize :portkey.aws.iot.list-certificates-bycarequest/marker :portkey.aws.iot.list-certificates-bycarequest/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot/alarm-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/hash-key-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.republish-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.republish-action/topic (clojure.spec.alpha/and :portkey.aws.iot/topic-pattern))
(clojure.spec.alpha/def :portkey.aws.iot/republish-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.republish-action/roleArn :portkey.aws.iot.republish-action/topic] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/ca-certificate (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/verification-certificate (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/allow-auto-registration (clojure.spec.alpha/and :portkey.aws.iot/allow-auto-registration))
(clojure.spec.alpha/def :portkey.aws.iot/registercacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.registercacertificate-request/caCertificate :portkey.aws.iot.registercacertificate-request/verificationCertificate] :opt-un [:portkey.aws.iot.registercacertificate-request/setAsActive :portkey.aws.iot.registercacertificate-request/allowAutoRegistration]))

(clojure.spec.alpha/def :portkey.aws.iot.list-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-policies-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-policies-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-policies-request/marker :portkey.aws.iot.list-policies-request/pageSize :portkey.aws.iot.list-policies-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/register-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.register-certificate-response/certificateArn :portkey.aws.iot.register-certificate-response/certificateId]))

(clojure.spec.alpha/def :portkey.aws.iot/metric-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/client-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-already-completed-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-already-completed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.transfer-already-completed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-principals-response/principals (clojure.spec.alpha/and :portkey.aws.iot/principals))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-principals-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-principals-response/principals]))

(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/endpoint (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-endpoint))
(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/index (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-index))
(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/type (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-type))
(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/id (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-id))
(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.elasticsearch-action/roleArn :portkey.aws.iot.elasticsearch-action/endpoint :portkey.aws.iot.elasticsearch-action/index :portkey.aws.iot.elasticsearch-action/type :portkey.aws.iot.elasticsearch-action/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-index (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/policies (clojure.spec.alpha/coll-of :portkey.aws.iot/policy :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/set-as-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/table-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/aws-iot-sql-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.disable-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot/disable-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.disable-topic-rule-request/ruleName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/sql (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/range-key-value (clojure.spec.alpha/and :portkey.aws.iot/range-key-value))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/table-name (clojure.spec.alpha/and :portkey.aws.iot/table-name))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/hash-key-value (clojure.spec.alpha/and :portkey.aws.iot/hash-key-value))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/range-key-field (clojure.spec.alpha/and :portkey.aws.iot/range-key-field))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/hash-key-type (clojure.spec.alpha/and :portkey.aws.iot/dynamo-key-type))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/operation (clojure.spec.alpha/and :portkey.aws.iot/dynamo-operation))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/payload-field (clojure.spec.alpha/and :portkey.aws.iot/payload-field))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/hash-key-field (clojure.spec.alpha/and :portkey.aws.iot/hash-key-field))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/range-key-type (clojure.spec.alpha/and :portkey.aws.iot/dynamo-key-type))
(clojure.spec.alpha/def :portkey.aws.iot/dynamodbaction (portkey.aws/json-keys :req-un [:portkey.aws.iot.dynamodbaction/tableName :portkey.aws.iot.dynamodbaction/roleArn :portkey.aws.iot.dynamodbaction/hashKeyField :portkey.aws.iot.dynamodbaction/hashKeyValue] :opt-un [:portkey.aws.iot.dynamodbaction/rangeKeyValue :portkey.aws.iot.dynamodbaction/rangeKeyField :portkey.aws.iot.dynamodbaction/hashKeyType :portkey.aws.iot.dynamodbaction/operation :portkey.aws.iot.dynamodbaction/payloadField :portkey.aws.iot.dynamodbaction/rangeKeyType]))

(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-response/principals (clojure.spec.alpha/and :portkey.aws.iot/principals))
(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-policy-principals-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-policy-principals-response/principals :portkey.aws.iot.list-policy-principals-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot/topic-rule-list (clojure.spec.alpha/coll-of :portkey.aws.iot/topic-rule-list-item :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/remove-thing-type (clojure.spec.alpha/and :portkey.aws.iot/remove-thing-type))
(clojure.spec.alpha/def :portkey.aws.iot/update-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.update-thing-request/thingName] :opt-un [:portkey.aws.iot.update-thing-request/thingTypeName :portkey.aws.iot.update-thing-request/attributePayload :portkey.aws.iot.update-thing-request/expectedVersion :portkey.aws.iot.update-thing-request/removeThingType]))

(clojure.spec.alpha/def :portkey.aws.iot/policy-version-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[0-9]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-response/thing-types (clojure.spec.alpha/and :portkey.aws.iot/thing-type-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-types-response/thingTypes :portkey.aws.iot.list-thing-types-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.iot.describecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/describecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describecacertificate-request/certificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/dynamo-operation (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-response/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-response/thing-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-thing-response/thingName :portkey.aws.iot.create-thing-response/thingArn]))

(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-policy-principals-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-policy-principals-request/policyName] :opt-un [:portkey.aws.iot.list-policy-principals-request/marker :portkey.aws.iot.list-policy-principals-request/pageSize :portkey.aws.iot.list-policy-principals-request/ascendingOrder]))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-status (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {:inactive "INACTIVE", "REGISTER_INACTIVE" "REGISTER_INACTIVE", "REVOKED" "REVOKED", :revoked "REVOKED", :pending-activation "PENDING_ACTIVATION", :register-inactive "REGISTER_INACTIVE", :pending-transfer "PENDING_TRANSFER", :active "ACTIVE", "INACTIVE" "INACTIVE", "PENDING_ACTIVATION" "PENDING_ACTIVATION", "ACTIVE" "ACTIVE", "PENDING_TRANSFER" "PENDING_TRANSFER"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.policy/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.policy/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot/policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.policy/policyName :portkey.aws.iot.policy/policyArn]))

(clojure.spec.alpha/def :portkey.aws.iot/key-pair (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot/PublicKey :portkey.aws.iot/PrivateKey]))

(clojure.spec.alpha/def :portkey.aws.iot/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.iot.malformed-policy-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/malformed-policy-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.malformed-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/set-as-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/registercacertificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.registercacertificate-response/certificateArn :portkey.aws.iot.registercacertificate-response/certificateId]))

(clojure.spec.alpha/def :portkey.aws.iot/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.logging-options-payload/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.logging-options-payload/log-level (clojure.spec.alpha/and :portkey.aws.iot/log-level))
(clojure.spec.alpha/def :portkey.aws.iot/logging-options-payload (portkey.aws/json-keys :req-un [:portkey.aws.iot.logging-options-payload/roleArn] :opt-un [:portkey.aws.iot.logging-options-payload/logLevel]))

(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.salesforce-action/token (clojure.spec.alpha/and :portkey.aws.iot/salesforce-token))
(clojure.spec.alpha/def :portkey.aws.iot.salesforce-action/url (clojure.spec.alpha/and :portkey.aws.iot/salesforce-endpoint))
(clojure.spec.alpha/def :portkey.aws.iot/salesforce-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.salesforce-action/token :portkey.aws.iot.salesforce-action/url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/salesforce-endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 2000)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"https://ingestion-[a-zA-Z0-9]{1,12}\.[a-zA-Z0-9]+\.((sfdc-matrix\.net)|(sfdcnow\.com))/streams/\w{1,20}/\w{1,20}/event" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/metric-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot/policies))
(clojure.spec.alpha/def :portkey.aws.iot.list-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-policies-response/policies :portkey.aws.iot.list-policies-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot/ascending-order clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/is-default-version clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.transfer-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.transfer-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/optional-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot/principal (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/status (clojure.spec.alpha/and :portkey.aws.iot/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/owned-by (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/auto-registration-status (clojure.spec.alpha/and :portkey.aws.iot/auto-registration-status))
(clojure.spec.alpha/def :portkey.aws.iot/cacertificate-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.cacertificate-description/certificateArn :portkey.aws.iot.cacertificate-description/certificateId :portkey.aws.iot.cacertificate-description/status :portkey.aws.iot.cacertificate-description/certificatePem :portkey.aws.iot.cacertificate-description/ownedBy :portkey.aws.iot.cacertificate-description/creationDate :portkey.aws.iot.cacertificate-description/autoRegistrationStatus]))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/transfer-message (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/reject-reason (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/transfer-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/accept-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/reject-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.transfer-data/transferMessage :portkey.aws.iot.transfer-data/rejectReason :portkey.aws.iot.transfer-data/transferDate :portkey.aws.iot.transfer-data/acceptDate :portkey.aws.iot.transfer-data/rejectDate]))

(clojure.spec.alpha/def :portkey.aws.iot.registration-code-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/registration-code-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.registration-code-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot/policy-versions (clojure.spec.alpha/coll-of :portkey.aws.iot/policy-version :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-alarm-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-alarm-action/alarm-name (clojure.spec.alpha/and :portkey.aws.iot/alarm-name))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-alarm-action/state-reason (clojure.spec.alpha/and :portkey.aws.iot/state-reason))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-alarm-action/state-value (clojure.spec.alpha/and :portkey.aws.iot/state-value))
(clojure.spec.alpha/def :portkey.aws.iot/cloudwatch-alarm-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.cloudwatch-alarm-action/roleArn :portkey.aws.iot.cloudwatch-alarm-action/alarmName :portkey.aws.iot.cloudwatch-alarm-action/stateReason :portkey.aws.iot.cloudwatch-alarm-action/stateValue] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.lambda-action/function-arn (clojure.spec.alpha/and :portkey.aws.iot/function-arn))
(clojure.spec.alpha/def :portkey.aws.iot/lambda-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.lambda-action/functionArn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.set-logging-options-request/logging-options-payload (clojure.spec.alpha/and :portkey.aws.iot/logging-options-payload))
(clojure.spec.alpha/def :portkey.aws.iot/set-logging-options-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.set-logging-options-request/loggingOptionsPayload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 64 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"(0x)?[a-fA-F0-9]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/attach-thing-principal-response (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/endpoint-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-pem (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-request/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-thing-type-request/thingTypeName] :opt-un [:portkey.aws.iot.create-thing-type-request/thingTypeProperties]))

(clojure.spec.alpha/def :portkey.aws.iot.action/dynamodb (clojure.spec.alpha/and :portkey.aws.iot/dynamodbaction))
(clojure.spec.alpha/def :portkey.aws.iot.action/sns (clojure.spec.alpha/and :portkey.aws.iot/sns-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/cloudwatch-alarm (clojure.spec.alpha/and :portkey.aws.iot/cloudwatch-alarm-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/republish (clojure.spec.alpha/and :portkey.aws.iot/republish-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/kinesis (clojure.spec.alpha/and :portkey.aws.iot/kinesis-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/s3 (clojure.spec.alpha/and :portkey.aws.iot/s3-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/salesforce (clojure.spec.alpha/and :portkey.aws.iot/salesforce-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/sqs (clojure.spec.alpha/and :portkey.aws.iot/sqs-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/elasticsearch (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/cloudwatch-metric (clojure.spec.alpha/and :portkey.aws.iot/cloudwatch-metric-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/firehose (clojure.spec.alpha/and :portkey.aws.iot/firehose-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/dynamodbv2 (clojure.spec.alpha/and :portkey.aws.iot/dynamodbv2-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/lambda (clojure.spec.alpha/and :portkey.aws.iot/lambda-action))
(clojure.spec.alpha/def :portkey.aws.iot/action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.action/dynamoDB :portkey.aws.iot.action/sns :portkey.aws.iot.action/cloudwatchAlarm :portkey.aws.iot.action/republish :portkey.aws.iot.action/kinesis :portkey.aws.iot.action/s3 :portkey.aws.iot.action/salesforce :portkey.aws.iot.action/sqs :portkey.aws.iot.action/elasticsearch :portkey.aws.iot.action/cloudwatchMetric :portkey.aws.iot.action/firehose :portkey.aws.iot.action/dynamoDBv2 :portkey.aws.iot.action/lambda]))

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-list (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-type-definition :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot.create-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-topic-rule-request/topic-rule-payload (clojure.spec.alpha/and :portkey.aws.iot/topic-rule-payload))
(clojure.spec.alpha/def :portkey.aws.iot/create-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-topic-rule-request/ruleName :portkey.aws.iot.create-topic-rule-request/topicRulePayload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot/created-at-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.certificate/status (clojure.spec.alpha/and :portkey.aws.iot/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate/certificateArn :portkey.aws.iot.certificate/certificateId :portkey.aws.iot.certificate/status :portkey.aws.iot.certificate/creationDate]))

(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-response/is-default-version (clojure.spec.alpha/and :portkey.aws.iot/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot/create-policy-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-policy-version-response/policyArn :portkey.aws.iot.create-policy-version-response/policyDocument :portkey.aws.iot.create-policy-version-response/policyVersionId :portkey.aws.iot.create-policy-version-response/isDefaultVersion]))

(clojure.spec.alpha/def :portkey.aws.iot/state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"https?://.*" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/attribute-name (clojure.spec.alpha/and :portkey.aws.iot/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/attribute-value (clojure.spec.alpha/and :portkey.aws.iot/attribute-value))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot/list-things-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-things-request/nextToken :portkey.aws.iot.list-things-request/maxResults :portkey.aws.iot.list-things-request/attributeName :portkey.aws.iot.list-things-request/attributeValue :portkey.aws.iot.list-things-request/thingTypeName]))

(clojure.spec.alpha/def :portkey.aws.iot.describe-endpoint-response/endpoint-address (clojure.spec.alpha/and :portkey.aws.iot/endpoint-address))
(clojure.spec.alpha/def :portkey.aws.iot/describe-endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-endpoint-response/endpointAddress]))

(clojure.spec.alpha/def :portkey.aws.iot.replace-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.replace-topic-rule-request/topic-rule-payload (clojure.spec.alpha/and :portkey.aws.iot/topic-rule-payload))
(clojure.spec.alpha/def :portkey.aws.iot/replace-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.replace-topic-rule-request/ruleName :portkey.aws.iot.replace-topic-rule-request/topicRulePayload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.s3-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.s3-action/bucket-name (clojure.spec.alpha/and :portkey.aws.iot/bucket-name))
(clojure.spec.alpha/def :portkey.aws.iot.s3-action/key (clojure.spec.alpha/and :portkey.aws.iot/key))
(clojure.spec.alpha/def :portkey.aws.iot.s3-action/canned-acl (clojure.spec.alpha/and :portkey.aws.iot/canned-access-control-list))
(clojure.spec.alpha/def :portkey.aws.iot/s3-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.s3-action/roleArn :portkey.aws.iot.s3-action/bucketName :portkey.aws.iot.s3-action/key] :opt-un [:portkey.aws.iot.s3-action/cannedAcl]))

(clojure.spec.alpha/def :portkey.aws.iot/get-registration-code-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.kinesis-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.kinesis-action/stream-name (clojure.spec.alpha/and :portkey.aws.iot/stream-name))
(clojure.spec.alpha/def :portkey.aws.iot.kinesis-action/partition-key (clojure.spec.alpha/and :portkey.aws.iot/partition-key))
(clojure.spec.alpha/def :portkey.aws.iot/kinesis-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.kinesis-action/roleArn :portkey.aws.iot.kinesis-action/streamName] :opt-un [:portkey.aws.iot.kinesis-action/partitionKey]))

(clojure.spec.alpha/def :portkey.aws.iot.cacertificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate/status (clojure.spec.alpha/and :portkey.aws.iot/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/cacertificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.cacertificate/certificateArn :portkey.aws.iot.cacertificate/certificateId :portkey.aws.iot.cacertificate/status :portkey.aws.iot.cacertificate/creationDate]))

(clojure.spec.alpha/def :portkey.aws.iot/public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.list-things-response/things (clojure.spec.alpha/and :portkey.aws.iot/thing-attribute-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-things-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-things-response/things :portkey.aws.iot.list-things-response/nextToken]))

(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-request/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-request/set-as-default (clojure.spec.alpha/and :portkey.aws.iot/set-as-default))
(clojure.spec.alpha/def :portkey.aws.iot/create-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-policy-version-request/policyName :portkey.aws.iot.create-policy-version-request/policyDocument] :opt-un [:portkey.aws.iot.create-policy-version-request/setAsDefault]))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-response/thing-type-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-type-arn))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-thing-type-response/thingTypeName :portkey.aws.iot.create-thing-type-response/thingTypeArn]))

(clojure.spec.alpha/def :portkey.aws.iot.certificate-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/certificate-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-response/outgoing-certificates (clojure.spec.alpha/and :portkey.aws.iot/outgoing-certificates))
(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-outgoing-certificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-outgoing-certificates-response/outgoingCertificates :portkey.aws.iot.list-outgoing-certificates-response/nextMarker]))

(clojure.spec.alpha/def :portkey.aws.iot/payload-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/rule-arn (clojure.spec.alpha/and :portkey.aws.iot/rule-arn))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/topic-pattern (clojure.spec.alpha/and :portkey.aws.iot/topic-pattern))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/created-at (clojure.spec.alpha/and :portkey.aws.iot/created-at-date))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot/topic-rule-list-item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.topic-rule-list-item/ruleArn :portkey.aws.iot.topic-rule-list-item/ruleName :portkey.aws.iot.topic-rule-list-item/topicPattern :portkey.aws.iot.topic-rule-list-item/createdAt :portkey.aws.iot.topic-rule-list-item/ruleDisabled]))

(clojure.spec.alpha/def :portkey.aws.iot/firehose-separator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"([\n\t])|(\r\n)|(,)" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/principals (clojure.spec.alpha/coll-of :portkey.aws.iot/principal-arn :max-count nil))

(clojure.spec.alpha/def :portkey.aws.iot/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/sql (clojure.spec.alpha/and :portkey.aws.iot/sql))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/description (clojure.spec.alpha/and :portkey.aws.iot/description))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/created-at (clojure.spec.alpha/and :portkey.aws.iot/created-at-date))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/actions (clojure.spec.alpha/and :portkey.aws.iot/action-list))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/aws-iot-sql-version (clojure.spec.alpha/and :portkey.aws.iot/aws-iot-sql-version))
(clojure.spec.alpha/def :portkey.aws.iot/topic-rule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.topic-rule/ruleName :portkey.aws.iot.topic-rule/sql :portkey.aws.iot.topic-rule/description :portkey.aws.iot.topic-rule/createdAt :portkey.aws.iot.topic-rule/actions :portkey.aws.iot.topic-rule/ruleDisabled :portkey.aws.iot.topic-rule/awsIotSqlVersion]))

(clojure.spec.alpha/def :portkey.aws.iot/registration-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 64 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"(0x)?[a-fA-F0-9]+" s__8151__auto__))))

(clojure.core/defn list-policy-versions ([list-policy-versions-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policies/{policyName}/version" list-policy-versions-request :portkey.aws.iot/list-policy-versions-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot/list-policy-versions-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-policy-versions-response))

(clojure.core/defn delete-policy-version ([delete-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/policies/{policyName}/version/{policyVersionId}" delete-policy-version-request :portkey.aws.iot/delete-policy-version-request {:payload nil, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil nil {"DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn attach-principal-policy ([attach-principal-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/principal-policies/{policyName}" attach-principal-policy-request :portkey.aws.iot/attach-principal-policy-request {:payload nil, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception})))
(clojure.spec.alpha/fdef attach-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/attach-principal-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-certificates-byca ([list-certificates-bycarequest] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/certificates-by-ca/{caCertificateId}" list-certificates-bycarequest :portkey.aws.iot/list-certificates-bycarequest {:payload nil, :headers {}, :uri {"caCertificateId" "caCertificateId"}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-certificates-bycaresponse {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-certificates-byca :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-certificates-bycarequest) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-certificates-bycaresponse))

(clojure.core/defn get-policy-version ([get-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policies/{policyName}/version/{policyVersionId}" get-policy-version-request :portkey.aws.iot/get-policy-version-request {:payload nil, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil :portkey.aws.iot/get-policy-version-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef get-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot/get-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-policy-version-response))

(clojure.core/defn cancel-certificate-transfer ([cancel-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/cancel-certificate-transfer/{certificateId}" cancel-certificate-transfer-request :portkey.aws.iot/cancel-certificate-transfer-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef cancel-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot/cancel-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn listcacertificates ([] (listcacertificates {})) ([listcacertificates-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/cacertificates" listcacertificates-request :portkey.aws.iot/listcacertificates-request {:payload nil, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/listcacertificates-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef listcacertificates :args (clojure.spec.alpha/? :portkey.aws.iot/listcacertificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/listcacertificates-response))

(clojure.core/defn create-thing ([create-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/things/{thingName}" create-thing-request :portkey.aws.iot/create-thing-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/create-thing-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef create-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-thing-response))

(clojure.core/defn create-topic-rule ([create-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/rules/{ruleName}" create-topic-rule-request :portkey.aws.iot/create-topic-rule-request {:payload "topicRulePayload", :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"SqlParseException" :portkey.aws.iot/sql-parse-exception, "InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn accept-certificate-transfer ([accept-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/accept-certificate-transfer/{certificateId}" accept-certificate-transfer-request :portkey.aws.iot/accept-certificate-transfer-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"setAsActive" "setAsActive"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef accept-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot/accept-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn get-registration-code ([] (get-registration-code {})) ([get-registration-code-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/registrationcode" get-registration-code-request :portkey.aws.iot/get-registration-code-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/get-registration-code-response {"ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception})))
(clojure.spec.alpha/fdef get-registration-code :args (clojure.spec.alpha/? :portkey.aws.iot/get-registration-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-registration-code-response))

(clojure.core/defn list-policies ([] (list-policies {})) ([list-policies-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policies" list-policies-request :portkey.aws.iot/list-policies-request {:payload nil, :headers {}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-policies-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.iot/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-policies-response))

(clojure.core/defn delete-registration-code ([] (delete-registration-code {})) ([delete-registration-code-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/registrationcode" delete-registration-code-request :portkey.aws.iot/delete-registration-code-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/delete-registration-code-response {"ThrottlingException" :portkey.aws.iot/throttling-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-registration-code :args (clojure.spec.alpha/? :portkey.aws.iot/delete-registration-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-registration-code-response))

(clojure.core/defn describecacertificate ([describecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/cacertificate/{caCertificateId}" describecacertificate-request :portkey.aws.iot/describecacertificate-request {:payload nil, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot/describecacertificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef describecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/describecacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describecacertificate-response))

(clojure.core/defn detach-thing-principal ([detach-thing-principal-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/things/{thingName}/principals" detach-thing-principal-request :portkey.aws.iot/detach-thing-principal-request {:payload nil, :headers {"principal" ["x-amzn-principal" nil]}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/detach-thing-principal-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef detach-thing-principal :args (clojure.spec.alpha/tuple :portkey.aws.iot/detach-thing-principal-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/detach-thing-principal-response))

(clojure.core/defn list-outgoing-certificates ([] (list-outgoing-certificates {})) ([list-outgoing-certificates-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/certificates-out-going" list-outgoing-certificates-request :portkey.aws.iot/list-outgoing-certificates-request {:payload nil, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-outgoing-certificates-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-outgoing-certificates :args (clojure.spec.alpha/? :portkey.aws.iot/list-outgoing-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-outgoing-certificates-response))

(clojure.core/defn deletecacertificate ([deletecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/cacertificate/{caCertificateId}" deletecacertificate-request :portkey.aws.iot/deletecacertificate-request {:payload nil, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot/deletecacertificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "CertificateStateException" :portkey.aws.iot/certificate-state-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef deletecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/deletecacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/deletecacertificate-response))

(clojure.core/defn list-principal-things ([list-principal-things-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/principals/things" list-principal-things-request :portkey.aws.iot/list-principal-things-request {:payload nil, :headers {"principal" ["x-amzn-principal" nil]}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iot/list-principal-things-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-principal-things :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-principal-things-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-principal-things-response))

(clojure.core/defn create-policy-version ([create-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/policies/{policyName}/version" create-policy-version-request :portkey.aws.iot/create-policy-version-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {"setAsDefault" "setAsDefault"}} nil :portkey.aws.iot/create-policy-version-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "MalformedPolicyException" :portkey.aws.iot/malformed-policy-exception, "VersionsLimitExceededException" :portkey.aws.iot/versions-limit-exceeded-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-policy-version-response))

(clojure.core/defn describe-endpoint ([] (describe-endpoint {})) ([describe-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/endpoint" describe-endpoint-request :portkey.aws.iot/describe-endpoint-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/describe-endpoint-response {"InternalFailureException" :portkey.aws.iot/internal-failure-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception})))
(clojure.spec.alpha/fdef describe-endpoint :args (clojure.spec.alpha/? :portkey.aws.iot/describe-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-endpoint-response))

(clojure.core/defn register-certificate ([register-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/certificate/register" register-certificate-request :portkey.aws.iot/register-certificate-request {:payload nil, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot/register-certificate-response {"UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "CertificateStateException" :portkey.aws.iot/certificate-state-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "CertificateValidationException" :portkey.aws.iot/certificate-validation-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "CertificateConflictException" :portkey.aws.iot/certificate-conflict-exception})))
(clojure.spec.alpha/fdef register-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/register-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/register-certificate-response))

(clojure.core/defn get-policy ([get-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policies/{policyName}" get-policy-request :portkey.aws.iot/get-policy-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot/get-policy-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-policy-response))

(clojure.core/defn enable-topic-rule ([enable-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/rules/{ruleName}/enable" enable-topic-rule-request :portkey.aws.iot/enable-topic-rule-request {:payload nil, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef enable-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/enable-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn deprecate-thing-type ([deprecate-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/thing-types/{thingTypeName}/deprecate" deprecate-thing-type-request :portkey.aws.iot/deprecate-thing-type-request {:payload nil, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot/deprecate-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef deprecate-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot/deprecate-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/deprecate-thing-type-response))

(clojure.core/defn delete-thing-type ([delete-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/thing-types/{thingTypeName}" delete-thing-type-request :portkey.aws.iot/delete-thing-type-request {:payload nil, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot/delete-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-thing-type-response))

(clojure.core/defn replace-topic-rule ([replace-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/rules/{ruleName}" replace-topic-rule-request :portkey.aws.iot/replace-topic-rule-request {:payload "topicRulePayload", :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"SqlParseException" :portkey.aws.iot/sql-parse-exception, "InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef replace-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/replace-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn get-topic-rule ([get-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/rules/{ruleName}" get-topic-rule-request :portkey.aws.iot/get-topic-rule-request {:payload nil, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil :portkey.aws.iot/get-topic-rule-response {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef get-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/get-topic-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-topic-rule-response))

(clojure.core/defn reject-certificate-transfer ([reject-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/reject-certificate-transfer/{certificateId}" reject-certificate-transfer-request :portkey.aws.iot/reject-certificate-transfer-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef reject-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot/reject-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn delete-thing ([delete-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/things/{thingName}" delete-thing-request :portkey.aws.iot/delete-thing-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {"expectedVersion" "expectedVersion"}} nil :portkey.aws.iot/delete-thing-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "VersionConflictException" :portkey.aws.iot/version-conflict-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-thing-response))

(clojure.core/defn list-certificates ([] (list-certificates {})) ([list-certificates-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/certificates" list-certificates-request :portkey.aws.iot/list-certificates-request {:payload nil, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-certificates-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-certificates :args (clojure.spec.alpha/? :portkey.aws.iot/list-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-certificates-response))

(clojure.core/defn list-thing-types ([] (list-thing-types {})) ([list-thing-types-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-types" list-thing-types-request :portkey.aws.iot/list-thing-types-request {:payload nil, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "thingTypeName" "thingTypeName"}} nil :portkey.aws.iot/list-thing-types-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-thing-types :args (clojure.spec.alpha/? :portkey.aws.iot/list-thing-types-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-thing-types-response))

(clojure.core/defn describe-thing ([describe-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things/{thingName}" describe-thing-request :portkey.aws.iot/describe-thing-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/describe-thing-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-thing-response))

(clojure.core/defn list-policy-principals ([list-policy-principals-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policy-principals" list-policy-principals-request :portkey.aws.iot/list-policy-principals-request {:payload nil, :headers {"policyName" ["x-amzn-iot-policy" nil]}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-policy-principals-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policy-principals :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-policy-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-policy-principals-response))

(clojure.core/defn set-default-policy-version ([set-default-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/policies/{policyName}/version/{policyVersionId}" set-default-policy-version-request :portkey.aws.iot/set-default-policy-version-request {:payload nil, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef set-default-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot/set-default-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn create-policy ([create-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/policies/{policyName}" create-policy-request :portkey.aws.iot/create-policy-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot/create-policy-response {"ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "MalformedPolicyException" :portkey.aws.iot/malformed-policy-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-policy-response))

(clojure.core/defn describe-thing-type ([describe-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-types/{thingTypeName}" describe-thing-type-request :portkey.aws.iot/describe-thing-type-request {:payload nil, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot/describe-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-thing-type-response))

(clojure.core/defn attach-thing-principal ([attach-thing-principal-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/things/{thingName}/principals" attach-thing-principal-request :portkey.aws.iot/attach-thing-principal-request {:payload nil, :headers {"principal" ["x-amzn-principal" nil]}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/attach-thing-principal-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef attach-thing-principal :args (clojure.spec.alpha/tuple :portkey.aws.iot/attach-thing-principal-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/attach-thing-principal-response))

(clojure.core/defn create-keys-and-certificate ([] (create-keys-and-certificate {})) ([create-keys-and-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/keys-and-certificate" create-keys-and-certificate-request :portkey.aws.iot/create-keys-and-certificate-request {:payload nil, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot/create-keys-and-certificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-keys-and-certificate :args (clojure.spec.alpha/? :portkey.aws.iot/create-keys-and-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-keys-and-certificate-response))

(clojure.core/defn registercacertificate ([registercacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/cacertificate" registercacertificate-request :portkey.aws.iot/registercacertificate-request {:payload nil, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive", "allowAutoRegistration" "allowAutoRegistration"}} nil :portkey.aws.iot/registercacertificate-response {"UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "CertificateValidationException" :portkey.aws.iot/certificate-validation-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "RegistrationCodeValidationException" :portkey.aws.iot/registration-code-validation-exception})))
(clojure.spec.alpha/fdef registercacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/registercacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/registercacertificate-response))

(clojure.core/defn disable-topic-rule ([disable-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/rules/{ruleName}/disable" disable-topic-rule-request :portkey.aws.iot/disable-topic-rule-request {:payload nil, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef disable-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/disable-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn list-topic-rules ([] (list-topic-rules {})) ([list-topic-rules-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/rules" list-topic-rules-request :portkey.aws.iot/list-topic-rules-request {:payload nil, :headers {}, :uri {}, :querystring {"topic" "topic", "maxResults" "maxResults", "nextToken" "nextToken", "ruleDisabled" "ruleDisabled"}} nil :portkey.aws.iot/list-topic-rules-response {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-topic-rules :args (clojure.spec.alpha/? :portkey.aws.iot/list-topic-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-topic-rules-response))

(clojure.core/defn detach-principal-policy ([detach-principal-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/principal-policies/{policyName}" detach-principal-policy-request :portkey.aws.iot/detach-principal-policy-request {:payload nil, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef detach-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/detach-principal-policy-request) :ret clojure.core/true?)

(clojure.core/defn updatecacertificate ([updatecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/cacertificate/{caCertificateId}" updatecacertificate-request :portkey.aws.iot/updatecacertificate-request {:payload nil, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {"newStatus" "newStatus", "newAutoRegistrationStatus" "newAutoRegistrationStatus"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef updatecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/updatecacertificate-request) :ret clojure.core/true?)

(clojure.core/defn delete-topic-rule ([delete-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/rules/{ruleName}" delete-topic-rule-request :portkey.aws.iot/delete-topic-rule-request {:payload nil, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef delete-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn describe-certificate ([describe-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/certificates/{certificateId}" describe-certificate-request :portkey.aws.iot/describe-certificate-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot/describe-certificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef describe-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-certificate-response))

(clojure.core/defn set-logging-options ([set-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/loggingOptions" set-logging-options-request :portkey.aws.iot/set-logging-options-request {:payload "loggingOptionsPayload", :headers {}, :uri {}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef set-logging-options :args (clojure.spec.alpha/tuple :portkey.aws.iot/set-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn list-thing-principals ([list-thing-principals-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things/{thingName}/principals" list-thing-principals-request :portkey.aws.iot/list-thing-principals-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/list-thing-principals-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-thing-principals :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-thing-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-thing-principals-response))

(clojure.core/defn list-principal-policies ([list-principal-policies-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/principal-policies" list-principal-policies-request :portkey.aws.iot/list-principal-policies-request {:payload nil, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-principal-policies-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-principal-policies :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-principal-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-principal-policies-response))

(clojure.core/defn transfer-certificate ([transfer-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/transfer-certificate/{certificateId}" transfer-certificate-request :portkey.aws.iot/transfer-certificate-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"targetAwsAccount" "targetAwsAccount"}} nil :portkey.aws.iot/transfer-certificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "CertificateStateException" :portkey.aws.iot/certificate-state-exception, "TransferConflictException" :portkey.aws.iot/transfer-conflict-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef transfer-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/transfer-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/transfer-certificate-response))

(clojure.core/defn delete-policy ([delete-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/policies/{policyName}" delete-policy-request :portkey.aws.iot/delete-policy-request {:payload nil, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-thing ([update-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/things/{thingName}" update-thing-request :portkey.aws.iot/update-thing-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/update-thing-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "VersionConflictException" :portkey.aws.iot/version-conflict-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef update-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/update-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-thing-response))

(clojure.core/defn delete-certificate ([delete-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/certificates/{certificateId}" delete-certificate-request :portkey.aws.iot/delete-certificate-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil nil {"CertificateStateException" :portkey.aws.iot/certificate-state-exception, "DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef delete-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-certificate-request) :ret clojure.core/true?)

(clojure.core/defn get-logging-options ([] (get-logging-options {})) ([get-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/loggingOptions" get-logging-options-request :portkey.aws.iot/get-logging-options-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/get-logging-options-response {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-logging-options :args (clojure.spec.alpha/? :portkey.aws.iot/get-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-logging-options-response))

(clojure.core/defn create-thing-type ([create-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/thing-types/{thingTypeName}" create-thing-type-request :portkey.aws.iot/create-thing-type-request {:payload nil, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot/create-thing-type-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception})))
(clojure.spec.alpha/fdef create-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-thing-type-response))

(clojure.core/defn update-certificate ([update-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/certificates/{certificateId}" update-certificate-request :portkey.aws.iot/update-certificate-request {:payload nil, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"newStatus" "newStatus"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "CertificateStateException" :portkey.aws.iot/certificate-state-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef update-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/update-certificate-request) :ret clojure.core/true?)

(clojure.core/defn create-certificate-from-csr ([create-certificate-from-csr-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/certificates" create-certificate-from-csr-request :portkey.aws.iot/create-certificate-from-csr-request {:payload nil, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot/create-certificate-from-csr-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-certificate-from-csr :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-certificate-from-csr-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-certificate-from-csr-response))

(clojure.core/defn list-things ([] (list-things {})) ([list-things-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things" list-things-request :portkey.aws.iot/list-things-request {:payload nil, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "attributeName" "attributeName", "attributeValue" "attributeValue", "thingTypeName" "thingTypeName"}} nil :portkey.aws.iot/list-things-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-things :args (clojure.spec.alpha/? :portkey.aws.iot/list-things-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-things-response))
