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

(clojure.core/declare serexternal-id-type)

(clojure.core/declare serrole-session-name-type)

(clojure.core/declare seruser-name-type)

(clojure.core/declare sertoken-code-type)

(clojure.core/declare ser-saml-assertion-type)

(clojure.core/declare serrole-duration-seconds-type)

(clojure.core/declare serurl-type)

(clojure.core/declare serclient-token-type)

(clojure.core/declare sersession-policy-document-type)

(clojure.core/declare serencoded-message-type)

(clojure.core/declare serarn-type)

(clojure.core/declare serserial-number-type)

(clojure.core/declare serduration-seconds-type)

(clojure.core/defn- serexternal-id-type [input] #:http.request.field{:value input, :shape "externalIdType"})

(clojure.core/defn- serrole-session-name-type [input] #:http.request.field{:value input, :shape "roleSessionNameType"})

(clojure.core/defn- seruser-name-type [input] #:http.request.field{:value input, :shape "userNameType"})

(clojure.core/defn- sertoken-code-type [input] #:http.request.field{:value input, :shape "tokenCodeType"})

(clojure.core/defn- ser-saml-assertion-type [input] #:http.request.field{:value input, :shape "SAMLAssertionType"})

(clojure.core/defn- serrole-duration-seconds-type [input] #:http.request.field{:value input, :shape "roleDurationSecondsType"})

(clojure.core/defn- serurl-type [input] #:http.request.field{:value input, :shape "urlType"})

(clojure.core/defn- serclient-token-type [input] #:http.request.field{:value input, :shape "clientTokenType"})

(clojure.core/defn- sersession-policy-document-type [input] #:http.request.field{:value input, :shape "sessionPolicyDocumentType"})

(clojure.core/defn- serencoded-message-type [input] #:http.request.field{:value input, :shape "encodedMessageType"})

(clojure.core/defn- serarn-type [input] #:http.request.field{:value input, :shape "arnType"})

(clojure.core/defn- serserial-number-type [input] #:http.request.field{:value input, :shape "serialNumberType"})

(clojure.core/defn- serduration-seconds-type [input] #:http.request.field{:value input, :shape "durationSecondsType"})

(clojure.core/defn- req-get-session-token-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :duration-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serduration-seconds-type (input :duration-seconds)) #:http.request.field{:name "DurationSeconds", :shape "durationSecondsType"})) (clojure.core/contains? input :serial-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serserial-number-type (input :serial-number)) #:http.request.field{:name "SerialNumber", :shape "serialNumberType"})) (clojure.core/contains? input :token-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertoken-code-type (input :token-code)) #:http.request.field{:name "TokenCode", :shape "tokenCodeType"}))))

(clojure.core/defn- req-assume-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "arnType"}) (clojure.core/into (serrole-session-name-type (input :role-session-name)) #:http.request.field{:name "RoleSessionName", :shape "roleSessionNameType"})]} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sersession-policy-document-type (input :policy)) #:http.request.field{:name "Policy", :shape "sessionPolicyDocumentType"})) (clojure.core/contains? input :duration-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-duration-seconds-type (input :duration-seconds)) #:http.request.field{:name "DurationSeconds", :shape "roleDurationSecondsType"})) (clojure.core/contains? input :external-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexternal-id-type (input :external-id)) #:http.request.field{:name "ExternalId", :shape "externalIdType"})) (clojure.core/contains? input :serial-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serserial-number-type (input :serial-number)) #:http.request.field{:name "SerialNumber", :shape "serialNumberType"})) (clojure.core/contains? input :token-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertoken-code-type (input :token-code)) #:http.request.field{:name "TokenCode", :shape "tokenCodeType"}))))

(clojure.core/defn- req-get-caller-identity-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-decode-authorization-message-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serencoded-message-type (input :encoded-message)) #:http.request.field{:name "EncodedMessage", :shape "encodedMessageType"})]}))

(clojure.core/defn- req-assume-role-with-web-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "arnType"}) (clojure.core/into (serrole-session-name-type (input :role-session-name)) #:http.request.field{:name "RoleSessionName", :shape "roleSessionNameType"}) (clojure.core/into (serclient-token-type (input :web-identity-token)) #:http.request.field{:name "WebIdentityToken", :shape "clientTokenType"})]} (clojure.core/contains? input :provider-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serurl-type (input :provider-id)) #:http.request.field{:name "ProviderId", :shape "urlType"})) (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sersession-policy-document-type (input :policy)) #:http.request.field{:name "Policy", :shape "sessionPolicyDocumentType"})) (clojure.core/contains? input :duration-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-duration-seconds-type (input :duration-seconds)) #:http.request.field{:name "DurationSeconds", :shape "roleDurationSecondsType"}))))

(clojure.core/defn- req-assume-role-with-saml-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "arnType"}) (clojure.core/into (serarn-type (input :principal-arn)) #:http.request.field{:name "PrincipalArn", :shape "arnType"}) (clojure.core/into (ser-saml-assertion-type (input :saml-assertion)) #:http.request.field{:name "SAMLAssertion", :shape "SAMLAssertionType"})]} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sersession-policy-document-type (input :policy)) #:http.request.field{:name "Policy", :shape "sessionPolicyDocumentType"})) (clojure.core/contains? input :duration-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-duration-seconds-type (input :duration-seconds)) #:http.request.field{:name "DurationSeconds", :shape "roleDurationSecondsType"}))))

(clojure.core/defn- req-get-federation-token-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :name)) #:http.request.field{:name "Name", :shape "userNameType"})]} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sersession-policy-document-type (input :policy)) #:http.request.field{:name "Policy", :shape "sessionPolicyDocumentType"})) (clojure.core/contains? input :duration-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serduration-seconds-type (input :duration-seconds)) #:http.request.field{:name "DurationSeconds", :shape "durationSecondsType"}))))

(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/serial-number (clojure.spec.alpha/and :portkey.aws.sts/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/token-code (clojure.spec.alpha/and :portkey.aws.sts/token-code-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-session-token-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.get-session-token-request/duration-seconds :portkey.aws.sts.get-session-token-request/serial-number :portkey.aws.sts.get-session-token-request/token-code]))

(clojure.spec.alpha/def :portkey.aws.sts/external-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 2 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 1224)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\w+=,.@:\/-]*" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.invalid-identity-token-exception/message (clojure.spec.alpha/and :portkey.aws.sts/invalid-identity-token-message))
(clojure.spec.alpha/def :portkey.aws.sts/invalid-identity-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.invalid-identity-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.assumed-role-user/assumed-role-id (clojure.spec.alpha/and :portkey.aws.sts/assumed-role-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.assumed-role-user/arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts/assumed-role-user (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.assumed-role-user/assumed-role-id :portkey.aws.sts.assumed-role-user/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts/role-session-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 2 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 64)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/subject-from-web-identity-token (clojure.spec.alpha/and :portkey.aws.sts/web-identity-subject-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/provider (clojure.spec.alpha/and :portkey.aws.sts/issuer))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-with-web-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials :portkey.aws.sts.assume-role-with-web-identity-response/subject-from-web-identity-token :portkey.aws.sts/assumed-role-user :portkey.aws.sts.assume-role-with-web-identity-response/packed-policy-size :portkey.aws.sts.assume-role-with-web-identity-response/provider :portkey.aws.sts/audience]))

(clojure.spec.alpha/def :portkey.aws.sts/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sts/user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 2 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 32)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/token-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 6 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 6)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\d]*" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.idp-communication-error-exception/message (clojure.spec.alpha/and :portkey.aws.sts/idp-communication-error-message))
(clojure.spec.alpha/def :portkey.aws.sts/idp-communication-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.idp-communication-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts/saml-assertion-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 4 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 100000))))

(clojure.spec.alpha/def :portkey.aws.sts/role-duration-seconds-type (clojure.spec.alpha/int-in 900 43200))

(clojure.spec.alpha/def :portkey.aws.sts/decoded-message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 4 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/role-arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/role-session-name (clojure.spec.alpha/and :portkey.aws.sts/role-session-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/policy (clojure.spec.alpha/and :portkey.aws.sts/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/external-id (clojure.spec.alpha/and :portkey.aws.sts/external-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/serial-number (clojure.spec.alpha/and :portkey.aws.sts/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-request/token-code (clojure.spec.alpha/and :portkey.aws.sts/token-code-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.assume-role-request/role-arn :portkey.aws.sts.assume-role-request/role-session-name] :opt-un [:portkey.aws.sts.assume-role-request/policy :portkey.aws.sts.assume-role-request/duration-seconds :portkey.aws.sts.assume-role-request/external-id :portkey.aws.sts.assume-role-request/serial-number :portkey.aws.sts.assume-role-request/token-code]))

(clojure.spec.alpha/def :portkey.aws.sts/access-key-secret-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/token-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.invalid-authorization-message-exception/message (clojure.spec.alpha/and :portkey.aws.sts/invalid-authorization-message))
(clojure.spec.alpha/def :portkey.aws.sts/invalid-authorization-message-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.invalid-authorization-message-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts/expired-identity-token-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/federated-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 2 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 193)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\w+=,.@\:-]*" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.federated-user/federated-user-id (clojure.spec.alpha/and :portkey.aws.sts/federated-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.federated-user/arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts/federated-user (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.federated-user/federated-user-id :portkey.aws.sts.federated-user/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts/region-disabled-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/get-caller-identity-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.packed-policy-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.sts/packed-policy-too-large-message))
(clojure.spec.alpha/def :portkey.aws.sts/packed-policy-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.packed-policy-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts/idp-communication-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/client-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 4 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sts.credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.sts/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/secret-access-key (clojure.spec.alpha/and :portkey.aws.sts/access-key-secret-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/session-token (clojure.spec.alpha/and :portkey.aws.sts/token-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/expiration (clojure.spec.alpha/and :portkey.aws.sts/date-type))
(clojure.spec.alpha/def :portkey.aws.sts/credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.credentials/access-key-id :portkey.aws.sts.credentials/secret-access-key :portkey.aws.sts.credentials/session-token :portkey.aws.sts.credentials/expiration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts/access-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 16 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 128)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\w]*" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.sts/malformed-policy-document-message))
(clojure.spec.alpha/def :portkey.aws.sts/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts/audience (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/web-identity-subject-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 6 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sts.idp-rejected-claim-exception/message (clojure.spec.alpha/and :portkey.aws.sts/idp-rejected-claim-message))
(clojure.spec.alpha/def :portkey.aws.sts/idp-rejected-claim-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.idp-rejected-claim-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-federation-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials :portkey.aws.sts/federated-user :portkey.aws.sts.get-federation-token-response/packed-policy-size]))

(clojure.spec.alpha/def :portkey.aws.sts/issuer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/session-policy-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 1 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 2048)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/idp-rejected-claim-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/invalid-authorization-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials :portkey.aws.sts/assumed-role-user :portkey.aws.sts.assume-role-response/packed-policy-size]))

(clojure.spec.alpha/def :portkey.aws.sts/encoded-message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 1 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.sts/non-negative-integer-type (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sts/get-session-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials]))

(clojure.spec.alpha/def :portkey.aws.sts/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 20 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 2048)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.decode-authorization-message-request/encoded-message (clojure.spec.alpha/and :portkey.aws.sts/encoded-message-type))
(clojure.spec.alpha/def :portkey.aws.sts/decode-authorization-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.decode-authorization-message-request/encoded-message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.get-caller-identity-response/user-id (clojure.spec.alpha/and :portkey.aws.sts/user-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-caller-identity-response/account (clojure.spec.alpha/and :portkey.aws.sts/account-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-caller-identity-response/arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-caller-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.get-caller-identity-response/user-id :portkey.aws.sts.get-caller-identity-response/account :portkey.aws.sts.get-caller-identity-response/arn]))

(clojure.spec.alpha/def :portkey.aws.sts/user-id-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/malformed-policy-document-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/name-qualifier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/role-arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/role-session-name (clojure.spec.alpha/and :portkey.aws.sts/role-session-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/web-identity-token (clojure.spec.alpha/and :portkey.aws.sts/client-token-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/provider-id (clojure.spec.alpha/and :portkey.aws.sts/url-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/policy (clojure.spec.alpha/and :portkey.aws.sts/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-with-web-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.assume-role-with-web-identity-request/role-arn :portkey.aws.sts.assume-role-with-web-identity-request/role-session-name :portkey.aws.sts.assume-role-with-web-identity-request/web-identity-token] :opt-un [:portkey.aws.sts.assume-role-with-web-identity-request/provider-id :portkey.aws.sts.assume-role-with-web-identity-request/policy :portkey.aws.sts.assume-role-with-web-identity-request/duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-saml-request/role-arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-saml-request/principal-arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-saml-request/saml-assertion (clojure.spec.alpha/and :portkey.aws.sts/saml-assertion-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-saml-request/policy (clojure.spec.alpha/and :portkey.aws.sts/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-saml-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-with-saml-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.assume-role-with-saml-request/role-arn :portkey.aws.sts.assume-role-with-saml-request/principal-arn :portkey.aws.sts.assume-role-with-saml-request/saml-assertion] :opt-un [:portkey.aws.sts.assume-role-with-saml-request/policy :portkey.aws.sts.assume-role-with-saml-request/duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.sts/serial-number-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 9 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 256)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\w+=/:,.@-]*" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/assumed-role-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__194563__auto__] (clojure.core/<= 2 (clojure.core/count s__194563__auto__))) (clojure.core/fn [s__194564__auto__] (clojure.core/< (clojure.core/count s__194564__auto__) 193)) (clojure.core/fn [s__194565__auto__] (clojure.core/re-matches #"[\w+=,.@:-]*" s__194565__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-saml-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-with-saml-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials :portkey.aws.sts/assumed-role-user :portkey.aws.sts.assume-role-with-saml-response/packed-policy-size :portkey.aws.sts/subject :portkey.aws.sts/subject-type :portkey.aws.sts/issuer :portkey.aws.sts/audience :portkey.aws.sts/name-qualifier]))

(clojure.spec.alpha/def :portkey.aws.sts/invalid-identity-token-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/subject-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/account-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.expired-token-exception/message (clojure.spec.alpha/and :portkey.aws.sts/expired-identity-token-message))
(clojure.spec.alpha/def :portkey.aws.sts/expired-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.expired-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.decode-authorization-message-response/decoded-message (clojure.spec.alpha/and :portkey.aws.sts/decoded-message-type))
(clojure.spec.alpha/def :portkey.aws.sts/decode-authorization-message-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.decode-authorization-message-response/decoded-message]))

(clojure.spec.alpha/def :portkey.aws.sts.region-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sts/region-disabled-message))
(clojure.spec.alpha/def :portkey.aws.sts/region-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.region-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts/packed-policy-too-large-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-request/name (clojure.spec.alpha/and :portkey.aws.sts/user-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-request/policy (clojure.spec.alpha/and :portkey.aws.sts/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-federation-token-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.get-federation-token-request/name] :opt-un [:portkey.aws.sts.get-federation-token-request/policy :portkey.aws.sts.get-federation-token-request/duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.sts/duration-seconds-type (clojure.spec.alpha/int-in 900 129600))

(clojure.core/defn assume-role ([assume-role-requestinput] (clojure.core/let [request-function-result__195099__auto__ (req-assume-role-request assume-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.spec/output-spec :portkey.aws.sts/assume-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/assume-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssumeRole", :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-response))

(clojure.core/defn assume-role-with-saml ([assume-role-with-saml-requestinput] (clojure.core/let [request-function-result__195099__auto__ (req-assume-role-with-saml-request assume-role-with-saml-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.spec/output-spec :portkey.aws.sts/assume-role-with-saml-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/assume-role-with-saml-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssumeRoleWithSAML", :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts/idp-rejected-claim-exception, "InvalidIdentityTokenException" :portkey.aws.sts/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts/expired-token-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role-with-saml :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-with-saml-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-with-saml-response))

(clojure.core/defn assume-role-with-web-identity ([assume-role-with-web-identity-requestinput] (clojure.core/let [request-function-result__195099__auto__ (req-assume-role-with-web-identity-request assume-role-with-web-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.spec/output-spec :portkey.aws.sts/assume-role-with-web-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/assume-role-with-web-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssumeRoleWithWebIdentity", :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts/idp-rejected-claim-exception, "IDPCommunicationErrorException" :portkey.aws.sts/idp-communication-error-exception, "InvalidIdentityTokenException" :portkey.aws.sts/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts/expired-token-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role-with-web-identity :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-with-web-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-with-web-identity-response))

(clojure.core/defn decode-authorization-message ([decode-authorization-message-requestinput] (clojure.core/let [request-function-result__195099__auto__ (req-decode-authorization-message-request decode-authorization-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.spec/output-spec :portkey.aws.sts/decode-authorization-message-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/decode-authorization-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DecodeAuthorizationMessage", :http.request.spec/error-spec {"InvalidAuthorizationMessageException" :portkey.aws.sts/invalid-authorization-message-exception}})))))
(clojure.spec.alpha/fdef decode-authorization-message :args (clojure.spec.alpha/tuple :portkey.aws.sts/decode-authorization-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/decode-authorization-message-response))

(clojure.core/defn get-caller-identity ([] (get-caller-identity {})) ([get-caller-identity-requestinput] (clojure.core/let [request-function-result__195099__auto__ (req-get-caller-identity-request get-caller-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.spec/output-spec :portkey.aws.sts/get-caller-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/get-caller-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCallerIdentity", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-caller-identity :args (clojure.spec.alpha/? :portkey.aws.sts/get-caller-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-caller-identity-response))

(clojure.core/defn get-federation-token ([get-federation-token-requestinput] (clojure.core/let [request-function-result__195099__auto__ (req-get-federation-token-request get-federation-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.spec/output-spec :portkey.aws.sts/get-federation-token-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/get-federation-token-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFederationToken", :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef get-federation-token :args (clojure.spec.alpha/tuple :portkey.aws.sts/get-federation-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-federation-token-response))

(clojure.core/defn get-session-token ([] (get-session-token {})) ([get-session-token-requestinput] (clojure.core/let [request-function-result__195099__auto__ (req-get-session-token-request get-session-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.spec/output-spec :portkey.aws.sts/get-session-token-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/get-session-token-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSessionToken", :http.request.spec/error-spec {"RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef get-session-token :args (clojure.spec.alpha/? :portkey.aws.sts/get-session-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-session-token-response))
