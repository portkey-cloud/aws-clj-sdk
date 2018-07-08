(ns portkey.aws.sts (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "sts", :region "us-west-1"},
    :ssl-common-name "sts-fips.us-west-1.amazonaws.com",
    :endpoint "https://sts-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "sts", :region "cn-north-1"},
    :ssl-common-name "sts.cn-north-1.amazonaws.com.cn",
    :endpoint "https://sts.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "sts", :region "cn-northwest-1"},
    :ssl-common-name "sts.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://sts.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "sts", :region "ap-northeast-2"},
    :ssl-common-name "sts.ap-northeast-2.amazonaws.com",
    :endpoint "https://sts.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "sts", :region "us-east-2"},
    :ssl-common-name "sts-fips.us-east-2.amazonaws.com",
    :endpoint "https://sts-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "sts", :region "us-gov-west-1"},
    :ssl-common-name "sts.us-gov-west-1.amazonaws.com",
    :endpoint "https://sts.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts-fips.us-east-1.amazonaws.com",
    :endpoint "https://sts-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "sts", :region "us-west-2"},
    :ssl-common-name "sts-fips.us-west-2.amazonaws.com",
    :endpoint "https://sts-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "sts", :region "us-east-1"},
    :ssl-common-name "sts.amazonaws.com",
    :endpoint "https://sts.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-external-id-type ser-role-session-name-type ser-user-name-type ser-token-code-type ser-samlassertion-type ser-role-duration-seconds-type ser-url-type ser-client-token-type ser-session-policy-document-type ser-encoded-message-type ser-arn-type ser-serial-number-type ser-duration-seconds-type)

(clojure.core/defn- ser-external-id-type [shape-input] shape-input)
(clojure.core/defn- ser-role-session-name-type [shape-input] shape-input)
(clojure.core/defn- ser-user-name-type [shape-input] shape-input)
(clojure.core/defn- ser-token-code-type [shape-input] shape-input)
(clojure.core/defn- ser-samlassertion-type [shape-input] shape-input)
(clojure.core/defn- ser-role-duration-seconds-type [shape-input] shape-input)
(clojure.core/defn- ser-url-type [shape-input] shape-input)
(clojure.core/defn- ser-client-token-type [shape-input] shape-input)
(clojure.core/defn- ser-session-policy-document-type [shape-input] shape-input)
(clojure.core/defn- ser-encoded-message-type [shape-input] shape-input)
(clojure.core/defn- ser-arn-type [shape-input] shape-input)
(clojure.core/defn- ser-serial-number-type [shape-input] shape-input)
(clojure.core/defn- ser-duration-seconds-type [shape-input] shape-input)

(clojure.core/defn req<-assume-role-request [action-name79150 input79149] (clojure.core/let [input79151 {:body {"RoleArn" (ser-arn-type (input79149 :role-arn)), "RoleSessionName" (ser-role-session-name-type (input79149 :role-session-name)), "Version" "2011-06-15", "Action" action-name79150}}] (clojure.core/cond-> input79151 (clojure.core/contains? input79149 :policy) (clojure.core/assoc-in [:body "Policy"] (ser-session-policy-document-type (input79149 :policy))) (clojure.core/contains? input79149 :duration-seconds) (clojure.core/assoc-in [:body "DurationSeconds"] (ser-role-duration-seconds-type (input79149 :duration-seconds))) (clojure.core/contains? input79149 :external-id) (clojure.core/assoc-in [:body "ExternalId"] (ser-external-id-type (input79149 :external-id))) (clojure.core/contains? input79149 :serial-number) (clojure.core/assoc-in [:body "SerialNumber"] (ser-serial-number-type (input79149 :serial-number))) (clojure.core/contains? input79149 :token-code) (clojure.core/assoc-in [:body "TokenCode"] (ser-token-code-type (input79149 :token-code))))))
(clojure.core/defn req<-assume-role-withsamlrequest [action-name79153 input79152] (clojure.core/let [input79154 {:body {"RoleArn" (ser-arn-type (input79152 :role-arn)), "PrincipalArn" (ser-arn-type (input79152 :principal-arn)), "SAMLAssertion" (ser-samlassertion-type (input79152 :samlassertion)), "Version" "2011-06-15", "Action" action-name79153}}] (clojure.core/cond-> input79154 (clojure.core/contains? input79152 :policy) (clojure.core/assoc-in [:body "Policy"] (ser-session-policy-document-type (input79152 :policy))) (clojure.core/contains? input79152 :duration-seconds) (clojure.core/assoc-in [:body "DurationSeconds"] (ser-role-duration-seconds-type (input79152 :duration-seconds))))))
(clojure.core/defn req<-assume-role-with-web-identity-request [action-name79156 input79155] (clojure.core/let [input79157 {:body {"RoleArn" (ser-arn-type (input79155 :role-arn)), "RoleSessionName" (ser-role-session-name-type (input79155 :role-session-name)), "WebIdentityToken" (ser-client-token-type (input79155 :web-identity-token)), "Version" "2011-06-15", "Action" action-name79156}}] (clojure.core/cond-> input79157 (clojure.core/contains? input79155 :provider-id) (clojure.core/assoc-in [:body "ProviderId"] (ser-url-type (input79155 :provider-id))) (clojure.core/contains? input79155 :policy) (clojure.core/assoc-in [:body "Policy"] (ser-session-policy-document-type (input79155 :policy))) (clojure.core/contains? input79155 :duration-seconds) (clojure.core/assoc-in [:body "DurationSeconds"] (ser-role-duration-seconds-type (input79155 :duration-seconds))))))
(clojure.core/defn req<-decode-authorization-message-request [action-name79159 input79158] {:body {"EncodedMessage" (ser-encoded-message-type (input79158 :encoded-message)), "Version" "2011-06-15", "Action" action-name79159}})
(clojure.core/defn req<-get-caller-identity-request [action-name79161 input79160] nil)
(clojure.core/defn req<-get-federation-token-request [action-name79163 input79162] (clojure.core/let [input79164 {:body {"Name" (ser-user-name-type (input79162 :name)), "Version" "2011-06-15", "Action" action-name79163}}] (clojure.core/cond-> input79164 (clojure.core/contains? input79162 :policy) (clojure.core/assoc-in [:body "Policy"] (ser-session-policy-document-type (input79162 :policy))) (clojure.core/contains? input79162 :duration-seconds) (clojure.core/assoc-in [:body "DurationSeconds"] (ser-duration-seconds-type (input79162 :duration-seconds))))))
(clojure.core/defn req<-get-session-token-request [action-name79166 input79165] (clojure.core/cond-> {:body {"Version" "2011-06-15", "Action" action-name79166}} (clojure.core/contains? input79165 :duration-seconds) (clojure.core/assoc-in [:body "DurationSeconds"] (ser-duration-seconds-type (input79165 :duration-seconds))) (clojure.core/contains? input79165 :serial-number) (clojure.core/assoc-in [:body "SerialNumber"] (ser-serial-number-type (input79165 :serial-number))) (clojure.core/contains? input79165 :token-code) (clojure.core/assoc-in [:body "TokenCode"] (ser-token-code-type (input79165 :token-code)))))

(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/serial-number (clojure.spec.alpha/and :portkey.aws.sts/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/token-code (clojure.spec.alpha/and :portkey.aws.sts/token-code-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-session-token-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.get-session-token-request/DurationSeconds :portkey.aws.sts.get-session-token-request/SerialNumber :portkey.aws.sts.get-session-token-request/TokenCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/external-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 2 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1224)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@:\/-]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.invalid-identity-token-exception/message (clojure.spec.alpha/and :portkey.aws.sts/invalid-identity-token-message))
(clojure.spec.alpha/def :portkey.aws.sts/invalid-identity-token-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.invalid-identity-token-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts.assumed-role-user/assumed-role-id (clojure.spec.alpha/and :portkey.aws.sts/assumed-role-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.assumed-role-user/arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts/assumed-role-user (portkey.aws/json-keys :req-un [:portkey.aws.sts.assumed-role-user/AssumedRoleId :portkey.aws.sts.assumed-role-user/Arn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/role-session-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 2 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/subject-from-web-identity-token (clojure.spec.alpha/and :portkey.aws.sts/web-identity-subject-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/provider (clojure.spec.alpha/and :portkey.aws.sts/issuer))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-with-web-identity-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts/Credentials :portkey.aws.sts.assume-role-with-web-identity-response/SubjectFromWebIdentityToken :portkey.aws.sts/AssumedRoleUser :portkey.aws.sts.assume-role-with-web-identity-response/PackedPolicySize :portkey.aws.sts.assume-role-with-web-identity-response/Provider :portkey.aws.sts/Audience] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sts/user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 2 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 32)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/token-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 6 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 6)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\d]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.idpcommunication-error-exception/message (clojure.spec.alpha/and :portkey.aws.sts/idp-communication-error-message))
(clojure.spec.alpha/def :portkey.aws.sts/idpcommunication-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.idpcommunication-error-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/samlassertion-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 4 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 100000))))

(clojure.spec.alpha/def :portkey.aws.sts/role-duration-seconds-type (clojure.spec.alpha/int-in 900 43200))

(clojure.spec.alpha/def :portkey.aws.sts/decoded-message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 4 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/role-arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/role-session-name (clojure.spec.alpha/and :portkey.aws.sts/role-session-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/policy (clojure.spec.alpha/and :portkey.aws.sts/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/external-id (clojure.spec.alpha/and :portkey.aws.sts/external-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/serial-number (clojure.spec.alpha/and :portkey.aws.sts/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/token-code (clojure.spec.alpha/and :portkey.aws.sts/token-code-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-request (portkey.aws/json-keys :req-un [:portkey.aws.sts.assume-role-request/RoleArn :portkey.aws.sts.assume-role-request/RoleSessionName] :opt-un [:portkey.aws.sts.assume-role-request/Policy :portkey.aws.sts.assume-role-request/DurationSeconds :portkey.aws.sts.assume-role-request/ExternalId :portkey.aws.sts.assume-role-request/SerialNumber :portkey.aws.sts.assume-role-request/TokenCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/access-key-secret-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/token-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.invalid-authorization-message-exception/message (clojure.spec.alpha/and :portkey.aws.sts/invalid-authorization-message))
(clojure.spec.alpha/def :portkey.aws.sts/invalid-authorization-message-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.invalid-authorization-message-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/expired-identity-token-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/federated-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 2 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 193)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@\:-]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.federated-user/federated-user-id (clojure.spec.alpha/and :portkey.aws.sts/federated-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.federated-user/arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts/federated-user (portkey.aws/json-keys :req-un [:portkey.aws.sts.federated-user/FederatedUserId :portkey.aws.sts.federated-user/Arn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/region-disabled-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/get-caller-identity-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts.packed-policy-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.sts/packed-policy-too-large-message))
(clojure.spec.alpha/def :portkey.aws.sts/packed-policy-too-large-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.packed-policy-too-large-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/idp-communication-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/client-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 4 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sts.credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.sts/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/secret-access-key (clojure.spec.alpha/and :portkey.aws.sts/access-key-secret-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/session-token (clojure.spec.alpha/and :portkey.aws.sts/token-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/expiration (clojure.spec.alpha/and :portkey.aws.sts/date-type))
(clojure.spec.alpha/def :portkey.aws.sts/credentials (portkey.aws/json-keys :req-un [:portkey.aws.sts.credentials/AccessKeyId :portkey.aws.sts.credentials/SecretAccessKey :portkey.aws.sts.credentials/SessionToken :portkey.aws.sts.credentials/Expiration] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/access-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 16 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.sts/malformed-policy-document-message))
(clojure.spec.alpha/def :portkey.aws.sts/malformed-policy-document-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.malformed-policy-document-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/audience (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/web-identity-subject-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 6 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sts.idprejected-claim-exception/message (clojure.spec.alpha/and :portkey.aws.sts/idp-rejected-claim-message))
(clojure.spec.alpha/def :portkey.aws.sts/idprejected-claim-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.idprejected-claim-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-federation-token-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts/Credentials :portkey.aws.sts/FederatedUser :portkey.aws.sts.get-federation-token-response/PackedPolicySize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/issuer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/session-policy-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 2048)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/idp-rejected-claim-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/invalid-authorization-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts/Credentials :portkey.aws.sts/AssumedRoleUser :portkey.aws.sts.assume-role-response/PackedPolicySize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/encoded-message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.sts/non-negative-integer-type (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sts/get-session-token-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts/Credentials] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 20 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 2048)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.decode-authorization-message-request/encoded-message (clojure.spec.alpha/and :portkey.aws.sts/encoded-message-type))
(clojure.spec.alpha/def :portkey.aws.sts/decode-authorization-message-request (portkey.aws/json-keys :req-un [:portkey.aws.sts.decode-authorization-message-request/EncodedMessage] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts.get-caller-identity-response/user-id (clojure.spec.alpha/and :portkey.aws.sts/user-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-caller-identity-response/account (clojure.spec.alpha/and :portkey.aws.sts/account-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-caller-identity-response/arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-caller-identity-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.get-caller-identity-response/UserId :portkey.aws.sts.get-caller-identity-response/Account :portkey.aws.sts.get-caller-identity-response/Arn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/user-id-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/malformed-policy-document-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/name-qualifier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/role-arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/role-session-name (clojure.spec.alpha/and :portkey.aws.sts/role-session-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/web-identity-token (clojure.spec.alpha/and :portkey.aws.sts/client-token-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/provider-id (clojure.spec.alpha/and :portkey.aws.sts/url-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/policy (clojure.spec.alpha/and :portkey.aws.sts/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-with-web-identity-request (portkey.aws/json-keys :req-un [:portkey.aws.sts.assume-role-with-web-identity-request/RoleArn :portkey.aws.sts.assume-role-with-web-identity-request/RoleSessionName :portkey.aws.sts.assume-role-with-web-identity-request/WebIdentityToken] :opt-un [:portkey.aws.sts.assume-role-with-web-identity-request/ProviderId :portkey.aws.sts.assume-role-with-web-identity-request/Policy :portkey.aws.sts.assume-role-with-web-identity-request/DurationSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-withsamlrequest/role-arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-withsamlrequest/principal-arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-withsamlrequest/samlassertion (clojure.spec.alpha/and :portkey.aws.sts/samlassertion-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-withsamlrequest/policy (clojure.spec.alpha/and :portkey.aws.sts/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-withsamlrequest/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-withsamlrequest (portkey.aws/json-keys :req-un [:portkey.aws.sts.assume-role-withsamlrequest/RoleArn :portkey.aws.sts.assume-role-withsamlrequest/PrincipalArn :portkey.aws.sts.assume-role-withsamlrequest/SAMLAssertion] :opt-un [:portkey.aws.sts.assume-role-withsamlrequest/Policy :portkey.aws.sts.assume-role-withsamlrequest/DurationSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/serial-number-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 9 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=/:,.@-]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/assumed-role-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 2 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 193)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@:-]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-withsamlresponse/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-withsamlresponse (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts/Credentials :portkey.aws.sts/AssumedRoleUser :portkey.aws.sts.assume-role-withsamlresponse/PackedPolicySize :portkey.aws.sts/Subject :portkey.aws.sts/SubjectType :portkey.aws.sts/Issuer :portkey.aws.sts/Audience :portkey.aws.sts/NameQualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/invalid-identity-token-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/subject-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/account-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.expired-token-exception/message (clojure.spec.alpha/and :portkey.aws.sts/expired-identity-token-message))
(clojure.spec.alpha/def :portkey.aws.sts/expired-token-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.expired-token-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts.decode-authorization-message-response/decoded-message (clojure.spec.alpha/and :portkey.aws.sts/decoded-message-type))
(clojure.spec.alpha/def :portkey.aws.sts/decode-authorization-message-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.decode-authorization-message-response/DecodedMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts.region-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sts/region-disabled-message))
(clojure.spec.alpha/def :portkey.aws.sts/region-disabled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sts.region-disabled-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/packed-policy-too-large-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-request/name (clojure.spec.alpha/and :portkey.aws.sts/user-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-request/policy (clojure.spec.alpha/and :portkey.aws.sts/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-federation-token-request (portkey.aws/json-keys :req-un [:portkey.aws.sts.get-federation-token-request/Name] :opt-un [:portkey.aws.sts.get-federation-token-request/Policy :portkey.aws.sts.get-federation-token-request/DurationSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sts/duration-seconds-type (clojure.spec.alpha/int-in 900 129600))

(clojure.core/defn assume-role "Returns a set of temporary security credentials (consisting of an access key ID,\na secret access key, and a security token) that you can use to access AWS\nresources that you might not normally have access to. Typically, you use\nAssumeRole for cross-account access or federation. For a comparison of\nAssumeRole with the other APIs that produce temporary credentials, see\nRequesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n Important: You cannot call AssumeRole by using AWS root account credentials;\naccess is denied. You must use credentials for an IAM user or an IAM role to\ncall AssumeRole.\n For cross-account access, imagine that you own multiple accounts and need to\naccess resources in each account. You could create long-term credentials in each\naccount to access those resources. However, managing all those credentials and\nremembering which one can access which account can be time consuming. Instead,\nyou can create one set of long-term credentials in one account and then use\ntemporary security credentials to access all the other accounts by assuming\nroles in those accounts. For more information about roles, see IAM Roles\n(Delegation and Federation)\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) in the IAM\nUser Guide.\n For federation, you can, for example, grant single sign-on access to the AWS\nManagement Console. If you already have an identity and authentication system in\nyour corporate network, you don't have to recreate user identities in AWS in\norder to grant those user identities access to AWS. Instead, after a user has\nbeen authenticated, you call AssumeRole (and specify the role with the\nappropriate permissions) to get temporary security credentials for that user.\nWith those temporary security credentials, you construct a sign-in URL that\nusers can use to access the console. For more information, see Common Scenarios\nfor Temporary Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html#sts-introduction)\nin the IAM User Guide.\n By default, the temporary security credentials created by AssumeRole last for\none hour. However, you can use the optional DurationSeconds parameter to specify\nthe duration of your session. You can provide a value from 900 seconds (15\nminutes) up to the maximum session duration setting for the role. This setting\ncan have a value from 1 hour to 12 hours. To learn how to view the maximum value\nfor your role, see View the Maximum Session Duration Setting for a Role\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session)\nin the IAM User Guide. The maximum session duration limit applies when you use\nthe AssumeRole* API operations or the assume-role* CLI operations but does not\napply when you use those operations to create a console URL. For more\ninformation, see Using IAM Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the IAM\nUser Guide.\n The temporary security credentials created by AssumeRole can be used to make\nAPI calls to any AWS service with the following exception: you cannot call the\nSTS service's GetFederationToken or GetSessionToken APIs.\n Optionally, you can pass an IAM access policy to this operation. If you choose\nnot to pass a policy, the temporary security credentials that are returned by\nthe operation have the permissions that are defined in the access policy of the\nrole that is being assumed. If you pass a policy to this operation, the\ntemporary security credentials that are returned by the operation have the\npermissions that are allowed by both the access policy of the role that is being\nassumed, and the policy that you pass. This gives you a way to further restrict\nthe permissions for the resulting temporary security credentials. You cannot use\nthe passed policy to grant permissions that are in excess of those allowed by\nthe access policy of the role that is being assumed. For more information, see\nPermissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html)\nin the IAM User Guide.\n To assume a role, your AWS account must be trusted by the role. The trust\nrelationship is defined in the role's trust policy when the role is created.\nThat trust policy states which accounts are allowed to delegate access to this\naccount's role.\n The user who wants to access the role must also have permissions delegated from\nthe role's administrator. If the user is in a different account than the role,\nthen the user's administrator must attach a policy that allows the user to call\nAssumeRole on the ARN of the role in the other account. If the user is in the\nsame account as the role, then you can either attach a policy to the user\n(identical to the previous different account user), or you can add the user as a\nprincipal directly in the role's trust policy. In this case, the trust policy\nacts as the only resource-based policy in IAM, and users in the same account as\nthe role do not need explicit permission to assume the role. For more\ninformation about trust policies and resource-based policies, see IAM Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html) in the\nIAM User Guide.\n Using MFA with AssumeRole\n You can optionally include multi-factor authentication (MFA) information when\nyou call AssumeRole. This is useful for cross-account scenarios in which you\nwant to make sure that the user who is assuming the role has been authenticated\nusing an AWS MFA device. In that scenario, the trust policy of the role being\nassumed includes a condition that tests for MFA authentication; if the caller\ndoes not include valid MFA information, the request to assume the role is\ndenied. The condition in a trust policy that tests for MFA authentication might\nlook like the following example.\n \"Condition\": {\"Bool\": {\"aws:MultiFactorAuthPresent\": true}}\n For more information, see Configuring MFA-Protected API Access\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html) in the\nIAM User Guide guide.\n To use MFA with AssumeRole, you pass values for the SerialNumber and TokenCode\nparameters. The SerialNumber value identifies the user's hardware or virtual MFA\ndevice. The TokenCode is the time-based one-time password (TOTP) that the MFA\ndevices produces." ([assume-role-request] (clojure.core/let [req<-input__36755__auto__ (req<-assume-role-request "AssumeRole" assume-role-request)] (portkey.aws/-query-call portkey.aws.sts/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sts/assume-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sts/assume-role-response {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}))))
(clojure.spec.alpha/fdef assume-role :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-response))

(clojure.core/defn assume-role-withsaml "Returns a set of temporary security credentials for users who have been\nauthenticated via a SAML authentication response. This operation provides a\nmechanism for tying an enterprise identity store or directory to role-based AWS\naccess without user-specific credentials or configuration. For a comparison of\nAssumeRoleWithSAML with the other APIs that produce temporary credentials, see\nRequesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n The temporary security credentials returned by this operation consist of an\naccess key ID, a secret access key, and a security token. Applications can use\nthese temporary security credentials to sign calls to AWS services.\n By default, the temporary security credentials created by AssumeRoleWithSAML\nlast for one hour. However, you can use the optional DurationSeconds parameter\nto specify the duration of your session. Your role session lasts for the\nduration that you specify, or until the time specified in the SAML\nauthentication response's SessionNotOnOrAfter value, whichever is shorter. You\ncan provide a DurationSeconds value from 900 seconds (15 minutes) up to the\nmaximum session duration setting for the role. This setting can have a value\nfrom 1 hour to 12 hours. To learn how to view the maximum value for your role,\nsee View the Maximum Session Duration Setting for a Role\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session)\nin the IAM User Guide. The maximum session duration limit applies when you use\nthe AssumeRole* API operations or the assume-role* CLI operations but does not\napply when you use those operations to create a console URL. For more\ninformation, see Using IAM Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the IAM\nUser Guide.\n The temporary security credentials created by AssumeRoleWithSAML can be used to\nmake API calls to any AWS service with the following exception: you cannot call\nthe STS service's GetFederationToken or GetSessionToken APIs.\n Optionally, you can pass an IAM access policy to this operation. If you choose\nnot to pass a policy, the temporary security credentials that are returned by\nthe operation have the permissions that are defined in the access policy of the\nrole that is being assumed. If you pass a policy to this operation, the\ntemporary security credentials that are returned by the operation have the\npermissions that are allowed by the intersection of both the access policy of\nthe role that is being assumed, and the policy that you pass. This means that\nboth policies must grant the permission for the action to be allowed. This gives\nyou a way to further restrict the permissions for the resulting temporary\nsecurity credentials. You cannot use the passed policy to grant permissions that\nare in excess of those allowed by the access policy of the role that is being\nassumed. For more information, see Permissions for AssumeRole,\nAssumeRoleWithSAML, and AssumeRoleWithWebIdentity\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html)\nin the IAM User Guide.\n Before your application can call AssumeRoleWithSAML, you must configure your\nSAML identity provider (IdP) to issue the claims required by AWS. Additionally,\nyou must use AWS Identity and Access Management (IAM) to create a SAML provider\nentity in your AWS account that represents your identity provider, and create an\nIAM role that specifies this SAML provider in its trust policy.\n Calling AssumeRoleWithSAML does not require the use of AWS security\ncredentials. The identity of the caller is validated by using keys in the\nmetadata document that is uploaded for the SAML provider entity for your\nidentity provider.\n Calling AssumeRoleWithSAML can result in an entry in your AWS CloudTrail logs.\nThe entry includes the value in the NameID element of the SAML assertion. We\nrecommend that you use a NameIDType that is not associated with any personally\nidentifiable information (PII). For example, you could instead use the\nPersistent Identifier (urn:oasis:names:tc:SAML:2.0:nameid-format:persistent).\n For more information, see the following resources:\n * About SAML 2.0-based Federation\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html)\nin the IAM User Guide.\n * Creating SAML Identity Providers\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml.html)\nin the IAM User Guide.\n * Configuring a Relying Party and Claims\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml_relying-party.html)\nin the IAM User Guide.\n * Creating a Role for SAML 2.0 Federation\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_saml.html)\nin the IAM User Guide." ([assume-role-withsamlrequest] (clojure.core/let [req<-input__36755__auto__ (req<-assume-role-withsamlrequest "AssumeRoleWithSAML" assume-role-withsamlrequest)] (portkey.aws/-query-call portkey.aws.sts/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sts/assume-role-withsamlrequest {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sts/assume-role-withsamlresponse {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts/idprejected-claim-exception, "InvalidIdentityTokenException" :portkey.aws.sts/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts/expired-token-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}))))
(clojure.spec.alpha/fdef assume-role-withsaml :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-withsamlrequest) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-withsamlresponse))

(clojure.core/defn assume-role-with-web-identity "Returns a set of temporary security credentials for users who have been\nauthenticated in a mobile or web application with a web identity provider, such\nas Amazon Cognito, Login with Amazon, Facebook, Google, or any OpenID\nConnect-compatible identity provider.\n For mobile applications, we recommend that you use Amazon Cognito. You can use\nAmazon Cognito with the AWS SDK for iOS (http://aws.amazon.com/sdkforios/) and\nthe AWS SDK for Android (http://aws.amazon.com/sdkforandroid/) to uniquely\nidentify a user and supply the user with a consistent identity throughout the\nlifetime of an application.\n To learn more about Amazon Cognito, see Amazon Cognito Overview\n(http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840)\nin the AWS SDK for Android Developer Guide guide and Amazon Cognito Overview\n(http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664)\nin the AWS SDK for iOS Developer Guide.\n Calling AssumeRoleWithWebIdentity does not require the use of AWS security\ncredentials. Therefore, you can distribute an application (for example, on\nmobile devices) that requests temporary security credentials without including\nlong-term AWS credentials in the application, and without deploying server-based\nproxy services that use long-term AWS credentials. Instead, the identity of the\ncaller is validated by using a token from the web identity provider. For a\ncomparison of AssumeRoleWithWebIdentity with the other APIs that produce\ntemporary credentials, see Requesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n The temporary security credentials returned by this API consist of an access\nkey ID, a secret access key, and a security token. Applications can use these\ntemporary security credentials to sign calls to AWS service APIs.\n By default, the temporary security credentials created by\nAssumeRoleWithWebIdentity last for one hour. However, you can use the optional\nDurationSeconds parameter to specify the duration of your session. You can\nprovide a value from 900 seconds (15 minutes) up to the maximum session duration\nsetting for the role. This setting can have a value from 1 hour to 12 hours. To\nlearn how to view the maximum value for your role, see View the Maximum Session\nDuration Setting for a Role\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session)\nin the IAM User Guide. The maximum session duration limit applies when you use\nthe AssumeRole* API operations or the assume-role* CLI operations but does not\napply when you use those operations to create a console URL. For more\ninformation, see Using IAM Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the IAM\nUser Guide.\n The temporary security credentials created by AssumeRoleWithWebIdentity can be\nused to make API calls to any AWS service with the following exception: you\ncannot call the STS service's GetFederationToken or GetSessionToken APIs.\n Optionally, you can pass an IAM access policy to this operation. If you choose\nnot to pass a policy, the temporary security credentials that are returned by\nthe operation have the permissions that are defined in the access policy of the\nrole that is being assumed. If you pass a policy to this operation, the\ntemporary security credentials that are returned by the operation have the\npermissions that are allowed by both the access policy of the role that is being\nassumed, and the policy that you pass. This gives you a way to further restrict\nthe permissions for the resulting temporary security credentials. You cannot use\nthe passed policy to grant permissions that are in excess of those allowed by\nthe access policy of the role that is being assumed. For more information, see\nPermissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html)\nin the IAM User Guide.\n Before your application can call AssumeRoleWithWebIdentity, you must have an\nidentity token from a supported identity provider and create a role that the\napplication can assume. The role that your application assumes must trust the\nidentity provider that is associated with the identity token. In other words,\nthe identity provider must be specified in the role's trust policy.\n Calling AssumeRoleWithWebIdentity can result in an entry in your AWS CloudTrail\nlogs. The entry includes the Subject\n(http://openid.net/specs/openid-connect-core-1_0.html#Claims) of the provided\nWeb Identity Token. We recommend that you avoid using any personally\nidentifiable information (PII) in this field. For example, you could instead use\na GUID or a pairwise identifier, as suggested in the OIDC specification\n(http://openid.net/specs/openid-connect-core-1_0.html#SubjectIDTypes).\n For more information about how to use web identity federation and the\nAssumeRoleWithWebIdentity API, see the following resources:\n * Using Web Identity Federation APIs for Mobile Apps\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html)\nand Federation Through a Web-based Identity Provider\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity).\n * Web Identity Federation Playground\n(https://web-identity-federation-playground.s3.amazonaws.com/index.html). This\ninteractive website lets you walk through the process of authenticating via\nLogin with Amazon, Facebook, or Google, getting temporary security credentials,\nand then using those credentials to make a request to AWS.\n * AWS SDK for iOS (http://aws.amazon.com/sdkforios/) and AWS SDK for Android\n(http://aws.amazon.com/sdkforandroid/). These toolkits contain sample apps that\nshow how to invoke the identity providers, and then how to use the information\nfrom these providers to get and use temporary security credentials.\n * Web Identity Federation with Mobile Applications\n(http://aws.amazon.com/articles/web-identity-federation-with-mobile-applications).\nThis article discusses web identity federation and shows an example of how to\nuse web identity federation to get access to content in Amazon S3." ([assume-role-with-web-identity-request] (clojure.core/let [req<-input__36755__auto__ (req<-assume-role-with-web-identity-request "AssumeRoleWithWebIdentity" assume-role-with-web-identity-request)] (portkey.aws/-query-call portkey.aws.sts/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sts/assume-role-with-web-identity-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sts/assume-role-with-web-identity-response {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts/idprejected-claim-exception, "IDPCommunicationErrorException" :portkey.aws.sts/idpcommunication-error-exception, "InvalidIdentityTokenException" :portkey.aws.sts/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts/expired-token-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}))))
(clojure.spec.alpha/fdef assume-role-with-web-identity :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-with-web-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-with-web-identity-response))

(clojure.core/defn decode-authorization-message "Decodes additional information about the authorization status of a request from\nan encoded message returned in response to an AWS request.\n For example, if a user is not authorized to perform an action that he or she\nhas requested, the request returns a Client.UnauthorizedOperation response (an\nHTTP 403 response). Some AWS actions additionally return an encoded message that\ncan provide details about this authorization failure.\n Only certain AWS actions return an encoded authorization message. The\ndocumentation for an individual action indicates whether that action returns an\nencoded message in addition to returning an HTTP code.\n The message is encoded because the details of the authorization status can\nconstitute privileged information that the user who requested the action should\nnot see. To decode an authorization status message, a user must be granted\npermissions via an IAM policy to request the DecodeAuthorizationMessage\n(sts:DecodeAuthorizationMessage) action.\n The decoded message includes the following type of information:\n * Whether the request was denied due to an explicit deny or due to the absence\nof an explicit allow. For more information, see Determining Whether a Request is\nAllowed or Denied\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-denyallow)\nin the IAM User Guide.\n * The principal who made the request.\n * The requested action.\n * The requested resource.\n * The values of condition keys in the context of the user's request." ([decode-authorization-message-request] (clojure.core/let [req<-input__36755__auto__ (req<-decode-authorization-message-request "DecodeAuthorizationMessage" decode-authorization-message-request)] (portkey.aws/-query-call portkey.aws.sts/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sts/decode-authorization-message-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sts/decode-authorization-message-response {"InvalidAuthorizationMessageException" :portkey.aws.sts/invalid-authorization-message-exception}))))
(clojure.spec.alpha/fdef decode-authorization-message :args (clojure.spec.alpha/tuple :portkey.aws.sts/decode-authorization-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/decode-authorization-message-response))

(clojure.core/defn get-caller-identity "Returns details about the IAM identity whose credentials are used to call the\nAPI." ([] (get-caller-identity {})) ([get-caller-identity-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-caller-identity-request "GetCallerIdentity" get-caller-identity-request)] (portkey.aws/-query-call portkey.aws.sts/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sts/get-caller-identity-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sts/get-caller-identity-response {}))))
(clojure.spec.alpha/fdef get-caller-identity :args (clojure.spec.alpha/? :portkey.aws.sts/get-caller-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-caller-identity-response))

(clojure.core/defn get-federation-token "Returns a set of temporary security credentials (consisting of an access key ID,\na secret access key, and a security token) for a federated user. A typical use\nis in a proxy application that gets temporary security credentials on behalf of\ndistributed applications inside a corporate network. Because you must call the\nGetFederationToken action using the long-term security credentials of an IAM\nuser, this call is appropriate in contexts where those credentials can be safely\nstored, usually in a server-based application. For a comparison of\nGetFederationToken with the other APIs that produce temporary credentials, see\nRequesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n If you are creating a mobile-based or browser-based app that can authenticate\nusers using a web identity provider like Login with Amazon, Facebook, Google, or\nan OpenID Connect-compatible identity provider, we recommend that you use Amazon\nCognito (http://aws.amazon.com/cognito/) or AssumeRoleWithWebIdentity. For more\ninformation, see Federation Through a Web-based Identity Provider\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity).\n The GetFederationToken action must be called by using the long-term AWS\nsecurity credentials of an IAM user. You can also call GetFederationToken using\nthe security credentials of an AWS root account, but we do not recommended it.\nInstead, we recommend that you create an IAM user for the purpose of the proxy\napplication and then attach a policy to the IAM user that limits federated users\nto only the actions and resources that they need access to. For more\ninformation, see IAM Best Practices\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html) in the IAM\nUser Guide.\n The temporary security credentials that are obtained by using the long-term\ncredentials of an IAM user are valid for the specified duration, from 900\nseconds (15 minutes) up to a maximium of 129600 seconds (36 hours). The default\nis 43200 seconds (12 hours). Temporary credentials that are obtained by using\nAWS root account credentials have a maximum duration of 3600 seconds (1 hour).\n The temporary security credentials created by GetFederationToken can be used to\nmake API calls to any AWS service with the following exceptions:\n * You cannot use these credentials to call any IAM APIs.\n * You cannot call any STS APIs except GetCallerIdentity.\n Permissions\n The permissions for the temporary security credentials returned by\nGetFederationToken are determined by a combination of the following:\n * The policy or policies that are attached to the IAM user whose credentials\nare used to call GetFederationToken.\n * The policy that is passed as a parameter in the call.\n The passed policy is attached to the temporary security credentials that result\nfrom the GetFederationToken API call--that is, to the federated user. When the\nfederated user makes an AWS request, AWS evaluates the policy attached to the\nfederated user in combination with the policy or policies attached to the IAM\nuser whose credentials were used to call GetFederationToken. AWS allows the\nfederated user's request only when both the federated user and the IAM user are\nexplicitly allowed to perform the requested action. The passed policy cannot\ngrant more permissions than those that are defined in the IAM user policy.\n A typical use case is that the permissions of the IAM user whose credentials\nare used to call GetFederationToken are designed to allow access to all the\nactions and resources that any federated user will need. Then, for individual\nusers, you pass a policy to the operation that scopes down the permissions to a\nlevel that's appropriate to that individual user, using a policy that allows\nonly a subset of permissions that are granted to the IAM user.\n If you do not pass a policy, the resulting temporary security credentials have\nno effective permissions. The only exception is when the temporary security\ncredentials are used to access a resource that has a resource-based policy that\nspecifically allows the federated user to access the resource.\n For more information about how permissions work, see Permissions for\nGetFederationToken\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html).\nFor information about using GetFederationToken to create temporary security\ncredentials, see GetFederationToken—Federation Through a Custom Identity Broker\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken)." ([get-federation-token-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-federation-token-request "GetFederationToken" get-federation-token-request)] (portkey.aws/-query-call portkey.aws.sts/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sts/get-federation-token-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sts/get-federation-token-response {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}))))
(clojure.spec.alpha/fdef get-federation-token :args (clojure.spec.alpha/tuple :portkey.aws.sts/get-federation-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-federation-token-response))

(clojure.core/defn get-session-token "Returns a set of temporary credentials for an AWS account or IAM user. The\ncredentials consist of an access key ID, a secret access key, and a security\ntoken. Typically, you use GetSessionToken if you want to use MFA to protect\nprogrammatic calls to specific AWS APIs like Amazon EC2 StopInstances.\nMFA-enabled IAM users would need to call GetSessionToken and submit an MFA code\nthat is associated with their MFA device. Using the temporary security\ncredentials that are returned from the call, IAM users can then make\nprogrammatic calls to APIs that require MFA authentication. If you do not supply\na correct MFA code, then the API returns an access denied error. For a\ncomparison of GetSessionToken with the other APIs that produce temporary\ncredentials, see Requesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n The GetSessionToken action must be called by using the long-term AWS security\ncredentials of the AWS account or an IAM user. Credentials that are created by\nIAM users are valid for the duration that you specify, from 900 seconds (15\nminutes) up to a maximum of 129600 seconds (36 hours), with a default of 43200\nseconds (12 hours); credentials that are created by using account credentials\ncan range from 900 seconds (15 minutes) up to a maximum of 3600 seconds (1\nhour), with a default of 1 hour.\n The temporary security credentials created by GetSessionToken can be used to\nmake API calls to any AWS service with the following exceptions:\n * You cannot call any IAM APIs unless MFA authentication information is\nincluded in the request.\n * You cannot call any STS API except AssumeRole or GetCallerIdentity.\n We recommend that you do not call GetSessionToken with root account\ncredentials. Instead, follow our best practices\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users)\nby creating one or more IAM users, giving them the necessary permissions, and\nusing IAM users for everyday interaction with AWS.\n The permissions associated with the temporary security credentials returned by\nGetSessionToken are based on the permissions associated with account or IAM user\nwhose credentials are used to call the action. If GetSessionToken is called\nusing root account credentials, the temporary credentials have root account\npermissions. Similarly, if GetSessionToken is called using the credentials of an\nIAM user, the temporary credentials have the same permissions as the IAM user.\n For more information about using GetSessionToken to create temporary\ncredentials, go to Temporary Credentials for Users in Untrusted Environments\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken)\nin the IAM User Guide." ([] (get-session-token {})) ([get-session-token-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-session-token-request "GetSessionToken" get-session-token-request)] (portkey.aws/-query-call portkey.aws.sts/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sts/get-session-token-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sts/get-session-token-response {"RegionDisabledException" :portkey.aws.sts/region-disabled-exception}))))
(clojure.spec.alpha/fdef get-session-token :args (clojure.spec.alpha/? :portkey.aws.sts/get-session-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-session-token-response))
