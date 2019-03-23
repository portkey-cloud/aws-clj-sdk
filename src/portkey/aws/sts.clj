(ns portkey.aws.sts (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "sts", :region "us-west-1"},
    :ssl-common-name "sts-fips.us-west-1.amazonaws.com",
    :endpoint "https://sts-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-east-1"
   {:credential-scope {:service "sts", :region "us-gov-east-1"},
    :ssl-common-name "sts.us-gov-east-1.amazonaws.com",
    :endpoint "https://sts.us-gov-east-1.amazonaws.com",
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
   "eu-north-1"
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

(clojure.core/declare deser-assumed-role-user)

(clojure.core/declare deserdate-type)

(clojure.core/declare deserdecoded-message-type)

(clojure.core/declare deseraccess-key-secret-type)

(clojure.core/declare desertoken-type)

(clojure.core/declare deserexpired-identity-token-message)

(clojure.core/declare deserfederated-id-type)

(clojure.core/declare deser-federated-user)

(clojure.core/declare deserregion-disabled-message)

(clojure.core/declare deseridp-communication-error-message)

(clojure.core/declare deser-credentials)

(clojure.core/declare deseraccess-key-id-type)

(clojure.core/declare deser-subject)

(clojure.core/declare deser-audience)

(clojure.core/declare deserweb-identity-subject-type)

(clojure.core/declare deser-issuer)

(clojure.core/declare deseridp-rejected-claim-message)

(clojure.core/declare deserinvalid-authorization-message)

(clojure.core/declare desernon-negative-integer-type)

(clojure.core/declare deserarn-type)

(clojure.core/declare deseruser-id-type)

(clojure.core/declare desermalformed-policy-document-message)

(clojure.core/declare deser-name-qualifier)

(clojure.core/declare deserassumed-role-id-type)

(clojure.core/declare deserinvalid-identity-token-message)

(clojure.core/declare deser-subject-type)

(clojure.core/declare deseraccount-type)

(clojure.core/declare deserpacked-policy-too-large-message)

(clojure.core/defn- deser-assumed-role-user [input] (clojure.core/let [letvar532844 {"AssumedRoleId" (portkey.aws/search-for-tag input "AssumedRoleId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:assumed-role-id (deserassumed-role-id-type (clojure.core/get-in letvar532844 ["AssumedRoleId" :content])), :arn (deserarn-type (clojure.core/get-in letvar532844 ["Arn" :content]))})))

(clojure.core/defn- deserdate-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserdecoded-message-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseraccess-key-secret-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desertoken-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserexpired-identity-token-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserfederated-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-federated-user [input] (clojure.core/let [letvar532979 {"FederatedUserId" (portkey.aws/search-for-tag input "FederatedUserId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:federated-user-id (deserfederated-id-type (clojure.core/get-in letvar532979 ["FederatedUserId" :content])), :arn (deserarn-type (clojure.core/get-in letvar532979 ["Arn" :content]))})))

(clojure.core/defn- deserregion-disabled-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseridp-communication-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-credentials [input] (clojure.core/let [letvar533097 {"AccessKeyId" (portkey.aws/search-for-tag input "AccessKeyId" :flattened? nil :xmlAttribute? nil), "SecretAccessKey" (portkey.aws/search-for-tag input "SecretAccessKey" :flattened? nil :xmlAttribute? nil), "SessionToken" (portkey.aws/search-for-tag input "SessionToken" :flattened? nil :xmlAttribute? nil), "Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:access-key-id (deseraccess-key-id-type (clojure.core/get-in letvar533097 ["AccessKeyId" :content])), :secret-access-key (deseraccess-key-secret-type (clojure.core/get-in letvar533097 ["SecretAccessKey" :content])), :session-token (desertoken-type (clojure.core/get-in letvar533097 ["SessionToken" :content])), :expiration (deserdate-type (clojure.core/get-in letvar533097 ["Expiration" :content]))})))

(clojure.core/defn- deseraccess-key-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-subject [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-audience [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserweb-identity-subject-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-issuer [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseridp-rejected-claim-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserinvalid-authorization-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desernon-negative-integer-type [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserarn-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseruser-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desermalformed-policy-document-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-name-qualifier [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserassumed-role-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserinvalid-identity-token-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-subject-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseraccount-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpacked-policy-too-large-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-invalid-identity-token-exception ([input] (response-invalid-identity-token-exception nil input)) ([resultWrapper533181 input] (clojure.core/let [rawinput533180 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533182 {"message" (portkey.aws/search-for-tag rawinput533180 "message" :flattened? nil :result-wrapper resultWrapper533181)}] (clojure.core/cond-> {} (letvar533182 "message") (clojure.core/assoc :message (deserinvalid-identity-token-message (clojure.core/get-in letvar533182 ["message" :content])))))))

(clojure.core/defn- response-assume-role-with-web-identity-response ([input] (response-assume-role-with-web-identity-response nil input)) ([resultWrapper533184 input] (clojure.core/let [rawinput533183 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533185 {"Credentials" (portkey.aws/search-for-tag rawinput533183 "Credentials" :flattened? nil :result-wrapper resultWrapper533184), "SubjectFromWebIdentityToken" (portkey.aws/search-for-tag rawinput533183 "SubjectFromWebIdentityToken" :flattened? nil :result-wrapper resultWrapper533184), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput533183 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper533184), "PackedPolicySize" (portkey.aws/search-for-tag rawinput533183 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper533184), "Provider" (portkey.aws/search-for-tag rawinput533183 "Provider" :flattened? nil :result-wrapper resultWrapper533184), "Audience" (portkey.aws/search-for-tag rawinput533183 "Audience" :flattened? nil :result-wrapper resultWrapper533184)}] (clojure.core/cond-> {} (letvar533185 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar533185 ["Credentials" :content]))) (letvar533185 "SubjectFromWebIdentityToken") (clojure.core/assoc :subject-from-web-identity-token (deserweb-identity-subject-type (clojure.core/get-in letvar533185 ["SubjectFromWebIdentityToken" :content]))) (letvar533185 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar533185 ["AssumedRoleUser" :content]))) (letvar533185 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar533185 ["PackedPolicySize" :content]))) (letvar533185 "Provider") (clojure.core/assoc :provider (deser-issuer (clojure.core/get-in letvar533185 ["Provider" :content]))) (letvar533185 "Audience") (clojure.core/assoc :audience (deser-audience (clojure.core/get-in letvar533185 ["Audience" :content])))))))

(clojure.core/defn- response-idp-communication-error-exception ([input] (response-idp-communication-error-exception nil input)) ([resultWrapper533187 input] (clojure.core/let [rawinput533186 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533188 {"message" (portkey.aws/search-for-tag rawinput533186 "message" :flattened? nil :result-wrapper resultWrapper533187)}] (clojure.core/cond-> {} (letvar533188 "message") (clojure.core/assoc :message (deseridp-communication-error-message (clojure.core/get-in letvar533188 ["message" :content])))))))

(clojure.core/defn- response-invalid-authorization-message-exception ([input] (response-invalid-authorization-message-exception nil input)) ([resultWrapper533190 input] (clojure.core/let [rawinput533189 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533191 {"message" (portkey.aws/search-for-tag rawinput533189 "message" :flattened? nil :result-wrapper resultWrapper533190)}] (clojure.core/cond-> {} (letvar533191 "message") (clojure.core/assoc :message (deserinvalid-authorization-message (clojure.core/get-in letvar533191 ["message" :content])))))))

(clojure.core/defn- response-packed-policy-too-large-exception ([input] (response-packed-policy-too-large-exception nil input)) ([resultWrapper533193 input] (clojure.core/let [rawinput533192 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533194 {"message" (portkey.aws/search-for-tag rawinput533192 "message" :flattened? nil :result-wrapper resultWrapper533193)}] (clojure.core/cond-> {} (letvar533194 "message") (clojure.core/assoc :message (deserpacked-policy-too-large-message (clojure.core/get-in letvar533194 ["message" :content])))))))

(clojure.core/defn- response-malformed-policy-document-exception ([input] (response-malformed-policy-document-exception nil input)) ([resultWrapper533196 input] (clojure.core/let [rawinput533195 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533197 {"message" (portkey.aws/search-for-tag rawinput533195 "message" :flattened? nil :result-wrapper resultWrapper533196)}] (clojure.core/cond-> {} (letvar533197 "message") (clojure.core/assoc :message (desermalformed-policy-document-message (clojure.core/get-in letvar533197 ["message" :content])))))))

(clojure.core/defn- response-idp-rejected-claim-exception ([input] (response-idp-rejected-claim-exception nil input)) ([resultWrapper533199 input] (clojure.core/let [rawinput533198 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533200 {"message" (portkey.aws/search-for-tag rawinput533198 "message" :flattened? nil :result-wrapper resultWrapper533199)}] (clojure.core/cond-> {} (letvar533200 "message") (clojure.core/assoc :message (deseridp-rejected-claim-message (clojure.core/get-in letvar533200 ["message" :content])))))))

(clojure.core/defn- response-get-federation-token-response ([input] (response-get-federation-token-response nil input)) ([resultWrapper533202 input] (clojure.core/let [rawinput533201 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533203 {"Credentials" (portkey.aws/search-for-tag rawinput533201 "Credentials" :flattened? nil :result-wrapper resultWrapper533202), "FederatedUser" (portkey.aws/search-for-tag rawinput533201 "FederatedUser" :flattened? nil :result-wrapper resultWrapper533202), "PackedPolicySize" (portkey.aws/search-for-tag rawinput533201 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper533202)}] (clojure.core/cond-> {} (letvar533203 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar533203 ["Credentials" :content]))) (letvar533203 "FederatedUser") (clojure.core/assoc :federated-user (deser-federated-user (clojure.core/get-in letvar533203 ["FederatedUser" :content]))) (letvar533203 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar533203 ["PackedPolicySize" :content])))))))

(clojure.core/defn- response-assume-role-response ([input] (response-assume-role-response nil input)) ([resultWrapper533205 input] (clojure.core/let [rawinput533204 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533206 {"Credentials" (portkey.aws/search-for-tag rawinput533204 "Credentials" :flattened? nil :result-wrapper resultWrapper533205), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput533204 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper533205), "PackedPolicySize" (portkey.aws/search-for-tag rawinput533204 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper533205)}] (clojure.core/cond-> {} (letvar533206 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar533206 ["Credentials" :content]))) (letvar533206 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar533206 ["AssumedRoleUser" :content]))) (letvar533206 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar533206 ["PackedPolicySize" :content])))))))

(clojure.core/defn- response-get-session-token-response ([input] (response-get-session-token-response nil input)) ([resultWrapper533208 input] (clojure.core/let [rawinput533207 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533209 {"Credentials" (portkey.aws/search-for-tag rawinput533207 "Credentials" :flattened? nil :result-wrapper resultWrapper533208)}] (clojure.core/cond-> {} (letvar533209 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar533209 ["Credentials" :content])))))))

(clojure.core/defn- response-get-caller-identity-response ([input] (response-get-caller-identity-response nil input)) ([resultWrapper533211 input] (clojure.core/let [rawinput533210 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533212 {"UserId" (portkey.aws/search-for-tag rawinput533210 "UserId" :flattened? nil :result-wrapper resultWrapper533211), "Account" (portkey.aws/search-for-tag rawinput533210 "Account" :flattened? nil :result-wrapper resultWrapper533211), "Arn" (portkey.aws/search-for-tag rawinput533210 "Arn" :flattened? nil :result-wrapper resultWrapper533211)}] (clojure.core/cond-> {} (letvar533212 "UserId") (clojure.core/assoc :user-id (deseruser-id-type (clojure.core/get-in letvar533212 ["UserId" :content]))) (letvar533212 "Account") (clojure.core/assoc :account (deseraccount-type (clojure.core/get-in letvar533212 ["Account" :content]))) (letvar533212 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar533212 ["Arn" :content])))))))

(clojure.core/defn- response-assume-role-with-saml-response ([input] (response-assume-role-with-saml-response nil input)) ([resultWrapper533214 input] (clojure.core/let [rawinput533213 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533215 {"Credentials" (portkey.aws/search-for-tag rawinput533213 "Credentials" :flattened? nil :result-wrapper resultWrapper533214), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput533213 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper533214), "PackedPolicySize" (portkey.aws/search-for-tag rawinput533213 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper533214), "Subject" (portkey.aws/search-for-tag rawinput533213 "Subject" :flattened? nil :result-wrapper resultWrapper533214), "SubjectType" (portkey.aws/search-for-tag rawinput533213 "SubjectType" :flattened? nil :result-wrapper resultWrapper533214), "Issuer" (portkey.aws/search-for-tag rawinput533213 "Issuer" :flattened? nil :result-wrapper resultWrapper533214), "Audience" (portkey.aws/search-for-tag rawinput533213 "Audience" :flattened? nil :result-wrapper resultWrapper533214), "NameQualifier" (portkey.aws/search-for-tag rawinput533213 "NameQualifier" :flattened? nil :result-wrapper resultWrapper533214)}] (clojure.core/cond-> {} (letvar533215 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar533215 ["Credentials" :content]))) (letvar533215 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar533215 ["AssumedRoleUser" :content]))) (letvar533215 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar533215 ["PackedPolicySize" :content]))) (letvar533215 "Subject") (clojure.core/assoc :subject (deser-subject (clojure.core/get-in letvar533215 ["Subject" :content]))) (letvar533215 "SubjectType") (clojure.core/assoc :subject-type (deser-subject-type (clojure.core/get-in letvar533215 ["SubjectType" :content]))) (letvar533215 "Issuer") (clojure.core/assoc :issuer (deser-issuer (clojure.core/get-in letvar533215 ["Issuer" :content]))) (letvar533215 "Audience") (clojure.core/assoc :audience (deser-audience (clojure.core/get-in letvar533215 ["Audience" :content]))) (letvar533215 "NameQualifier") (clojure.core/assoc :name-qualifier (deser-name-qualifier (clojure.core/get-in letvar533215 ["NameQualifier" :content])))))))

(clojure.core/defn- response-expired-token-exception ([input] (response-expired-token-exception nil input)) ([resultWrapper533217 input] (clojure.core/let [rawinput533216 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533218 {"message" (portkey.aws/search-for-tag rawinput533216 "message" :flattened? nil :result-wrapper resultWrapper533217)}] (clojure.core/cond-> {} (letvar533218 "message") (clojure.core/assoc :message (deserexpired-identity-token-message (clojure.core/get-in letvar533218 ["message" :content])))))))

(clojure.core/defn- response-decode-authorization-message-response ([input] (response-decode-authorization-message-response nil input)) ([resultWrapper533220 input] (clojure.core/let [rawinput533219 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533221 {"DecodedMessage" (portkey.aws/search-for-tag rawinput533219 "DecodedMessage" :flattened? nil :result-wrapper resultWrapper533220)}] (clojure.core/cond-> {} (letvar533221 "DecodedMessage") (clojure.core/assoc :decoded-message (deserdecoded-message-type (clojure.core/get-in letvar533221 ["DecodedMessage" :content])))))))

(clojure.core/defn- response-region-disabled-exception ([input] (response-region-disabled-exception nil input)) ([resultWrapper533223 input] (clojure.core/let [rawinput533222 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar533224 {"message" (portkey.aws/search-for-tag rawinput533222 "message" :flattened? nil :result-wrapper resultWrapper533223)}] (clojure.core/cond-> {} (letvar533224 "message") (clojure.core/assoc :message (deserregion-disabled-message (clojure.core/get-in letvar533224 ["message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts/duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/serial-number (clojure.spec.alpha/and :portkey.aws.sts/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.sts.get-session-token-request/token-code (clojure.spec.alpha/and :portkey.aws.sts/token-code-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-session-token-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.get-session-token-request/duration-seconds :portkey.aws.sts.get-session-token-request/serial-number :portkey.aws.sts.get-session-token-request/token-code]))

(clojure.spec.alpha/def :portkey.aws.sts/external-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1224)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@:\/-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.invalid-identity-token-exception/message (clojure.spec.alpha/and :portkey.aws.sts/invalid-identity-token-message))
(clojure.spec.alpha/def :portkey.aws.sts/invalid-identity-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.invalid-identity-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.assumed-role-user/assumed-role-id (clojure.spec.alpha/and :portkey.aws.sts/assumed-role-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.assumed-role-user/arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts/assumed-role-user (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.assumed-role-user/assumed-role-id :portkey.aws.sts.assumed-role-user/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts/role-session-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/subject-from-web-identity-token (clojure.spec.alpha/and :portkey.aws.sts/web-identity-subject-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.assume-role-with-web-identity-response/provider (clojure.spec.alpha/and :portkey.aws.sts/issuer))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-with-web-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials :portkey.aws.sts.assume-role-with-web-identity-response/subject-from-web-identity-token :portkey.aws.sts/assumed-role-user :portkey.aws.sts.assume-role-with-web-identity-response/packed-policy-size :portkey.aws.sts.assume-role-with-web-identity-response/provider :portkey.aws.sts/audience]))

(clojure.spec.alpha/def :portkey.aws.sts/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sts/user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 32)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/token-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 6 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 6)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\d]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.idp-communication-error-exception/message (clojure.spec.alpha/and :portkey.aws.sts/idp-communication-error-message))
(clojure.spec.alpha/def :portkey.aws.sts/idp-communication-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.idp-communication-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts/saml-assertion-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 4 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 100000))))

(clojure.spec.alpha/def :portkey.aws.sts/role-duration-seconds-type (clojure.spec.alpha/int-in 900 43200))

(clojure.spec.alpha/def :portkey.aws.sts/decoded-message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 4 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048))))

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

(clojure.spec.alpha/def :portkey.aws.sts/federated-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 193)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@\:-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.federated-user/federated-user-id (clojure.spec.alpha/and :portkey.aws.sts/federated-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.federated-user/arn (clojure.spec.alpha/and :portkey.aws.sts/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts/federated-user (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.federated-user/federated-user-id :portkey.aws.sts.federated-user/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts/region-disabled-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/get-caller-identity-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.packed-policy-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.sts/packed-policy-too-large-message))
(clojure.spec.alpha/def :portkey.aws.sts/packed-policy-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.packed-policy-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts/idp-communication-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/client-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 4 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sts.credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.sts/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/secret-access-key (clojure.spec.alpha/and :portkey.aws.sts/access-key-secret-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/session-token (clojure.spec.alpha/and :portkey.aws.sts/token-type))
(clojure.spec.alpha/def :portkey.aws.sts.credentials/expiration (clojure.spec.alpha/and :portkey.aws.sts/date-type))
(clojure.spec.alpha/def :portkey.aws.sts/credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.credentials/access-key-id :portkey.aws.sts.credentials/secret-access-key :portkey.aws.sts.credentials/session-token :portkey.aws.sts.credentials/expiration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts/access-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 16 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.sts/malformed-policy-document-message))
(clojure.spec.alpha/def :portkey.aws.sts/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts/audience (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/web-identity-subject-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 6 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sts.idp-rejected-claim-exception/message (clojure.spec.alpha/and :portkey.aws.sts/idp-rejected-claim-message))
(clojure.spec.alpha/def :portkey.aws.sts/idp-rejected-claim-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.idp-rejected-claim-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.get-federation-token-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts/get-federation-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials :portkey.aws.sts/federated-user :portkey.aws.sts.get-federation-token-response/packed-policy-size]))

(clojure.spec.alpha/def :portkey.aws.sts/issuer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/session-policy-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/idp-rejected-claim-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts/invalid-authorization-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.assume-role-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts/assume-role-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials :portkey.aws.sts/assumed-role-user :portkey.aws.sts.assume-role-response/packed-policy-size]))

(clojure.spec.alpha/def :portkey.aws.sts/encoded-message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.sts/non-negative-integer-type (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sts/get-session-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts/credentials]))

(clojure.spec.alpha/def :portkey.aws.sts/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 20 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.sts/serial-number-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 9 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=/:,.@-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts/assumed-role-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 193)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@:-]*" s__283180__auto__))))

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

(clojure.core/defn assume-role ([assume-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-assume-role-request assume-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts/assume-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/assume-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleResult", :http.request.configuration/action "AssumeRole", :http.request.configuration/output-deser-fn response-assume-role-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-response))

(clojure.core/defn assume-role-with-saml ([assume-role-with-saml-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-assume-role-with-saml-request assume-role-with-saml-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts/assume-role-with-saml-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/assume-role-with-saml-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleWithSAMLResult", :http.request.configuration/action "AssumeRoleWithSAML", :http.request.configuration/output-deser-fn response-assume-role-with-saml-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts/idp-rejected-claim-exception, "InvalidIdentityTokenException" :portkey.aws.sts/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts/expired-token-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role-with-saml :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-with-saml-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-with-saml-response))

(clojure.core/defn assume-role-with-web-identity ([assume-role-with-web-identity-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-assume-role-with-web-identity-request assume-role-with-web-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts/assume-role-with-web-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/assume-role-with-web-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleWithWebIdentityResult", :http.request.configuration/action "AssumeRoleWithWebIdentity", :http.request.configuration/output-deser-fn response-assume-role-with-web-identity-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts/idp-rejected-claim-exception, "IDPCommunicationErrorException" :portkey.aws.sts/idp-communication-error-exception, "InvalidIdentityTokenException" :portkey.aws.sts/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts/expired-token-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role-with-web-identity :args (clojure.spec.alpha/tuple :portkey.aws.sts/assume-role-with-web-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/assume-role-with-web-identity-response))

(clojure.core/defn decode-authorization-message ([decode-authorization-message-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-decode-authorization-message-request decode-authorization-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts/decode-authorization-message-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/decode-authorization-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DecodeAuthorizationMessageResult", :http.request.configuration/action "DecodeAuthorizationMessage", :http.request.configuration/output-deser-fn response-decode-authorization-message-response, :http.request.spec/error-spec {"InvalidAuthorizationMessageException" :portkey.aws.sts/invalid-authorization-message-exception}})))))
(clojure.spec.alpha/fdef decode-authorization-message :args (clojure.spec.alpha/tuple :portkey.aws.sts/decode-authorization-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/decode-authorization-message-response))

(clojure.core/defn get-caller-identity ([] (get-caller-identity {})) ([get-caller-identity-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-caller-identity-request get-caller-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts/get-caller-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/get-caller-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetCallerIdentityResult", :http.request.configuration/action "GetCallerIdentity", :http.request.configuration/output-deser-fn response-get-caller-identity-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-caller-identity :args (clojure.spec.alpha/? :portkey.aws.sts/get-caller-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-caller-identity-response))

(clojure.core/defn get-federation-token ([get-federation-token-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-federation-token-request get-federation-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts/get-federation-token-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/get-federation-token-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetFederationTokenResult", :http.request.configuration/action "GetFederationToken", :http.request.configuration/output-deser-fn response-get-federation-token-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef get-federation-token :args (clojure.spec.alpha/tuple :portkey.aws.sts/get-federation-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-federation-token-response))

(clojure.core/defn get-session-token ([] (get-session-token {})) ([get-session-token-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-session-token-request get-session-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts/get-session-token-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts/get-session-token-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSessionTokenResult", :http.request.configuration/action "GetSessionToken", :http.request.configuration/output-deser-fn response-get-session-token-response, :http.request.spec/error-spec {"RegionDisabledException" :portkey.aws.sts/region-disabled-exception}})))))
(clojure.spec.alpha/fdef get-session-token :args (clojure.spec.alpha/? :portkey.aws.sts/get-session-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts/get-session-token-response))
