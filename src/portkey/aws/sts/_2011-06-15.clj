(ns portkey.aws.sts.-2011-06-15 (:require [portkey.aws]))

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

(clojure.core/defn- deser-assumed-role-user [input] (clojure.core/let [letvar533662 {"AssumedRoleId" (portkey.aws/search-for-tag input "AssumedRoleId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:assumed-role-id (deserassumed-role-id-type (clojure.core/get-in letvar533662 ["AssumedRoleId" :content])), :arn (deserarn-type (clojure.core/get-in letvar533662 ["Arn" :content]))})))

(clojure.core/defn- deserdate-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserdecoded-message-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseraccess-key-secret-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desertoken-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserexpired-identity-token-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserfederated-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-federated-user [input] (clojure.core/let [letvar533797 {"FederatedUserId" (portkey.aws/search-for-tag input "FederatedUserId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:federated-user-id (deserfederated-id-type (clojure.core/get-in letvar533797 ["FederatedUserId" :content])), :arn (deserarn-type (clojure.core/get-in letvar533797 ["Arn" :content]))})))

(clojure.core/defn- deserregion-disabled-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseridp-communication-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-credentials [input] (clojure.core/let [letvar533915 {"AccessKeyId" (portkey.aws/search-for-tag input "AccessKeyId" :flattened? nil :xmlAttribute? nil), "SecretAccessKey" (portkey.aws/search-for-tag input "SecretAccessKey" :flattened? nil :xmlAttribute? nil), "SessionToken" (portkey.aws/search-for-tag input "SessionToken" :flattened? nil :xmlAttribute? nil), "Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:access-key-id (deseraccess-key-id-type (clojure.core/get-in letvar533915 ["AccessKeyId" :content])), :secret-access-key (deseraccess-key-secret-type (clojure.core/get-in letvar533915 ["SecretAccessKey" :content])), :session-token (desertoken-type (clojure.core/get-in letvar533915 ["SessionToken" :content])), :expiration (deserdate-type (clojure.core/get-in letvar533915 ["Expiration" :content]))})))

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

(clojure.core/defn- response-invalid-identity-token-exception ([input] (response-invalid-identity-token-exception nil input)) ([resultWrapper533999 input] (clojure.core/let [rawinput533998 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534000 {"message" (portkey.aws/search-for-tag rawinput533998 "message" :flattened? nil :result-wrapper resultWrapper533999)}] (clojure.core/cond-> {} (letvar534000 "message") (clojure.core/assoc :message (deserinvalid-identity-token-message (clojure.core/get-in letvar534000 ["message" :content])))))))

(clojure.core/defn- response-assume-role-with-web-identity-response ([input] (response-assume-role-with-web-identity-response nil input)) ([resultWrapper534002 input] (clojure.core/let [rawinput534001 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534003 {"Credentials" (portkey.aws/search-for-tag rawinput534001 "Credentials" :flattened? nil :result-wrapper resultWrapper534002), "SubjectFromWebIdentityToken" (portkey.aws/search-for-tag rawinput534001 "SubjectFromWebIdentityToken" :flattened? nil :result-wrapper resultWrapper534002), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput534001 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper534002), "PackedPolicySize" (portkey.aws/search-for-tag rawinput534001 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper534002), "Provider" (portkey.aws/search-for-tag rawinput534001 "Provider" :flattened? nil :result-wrapper resultWrapper534002), "Audience" (portkey.aws/search-for-tag rawinput534001 "Audience" :flattened? nil :result-wrapper resultWrapper534002)}] (clojure.core/cond-> {} (letvar534003 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar534003 ["Credentials" :content]))) (letvar534003 "SubjectFromWebIdentityToken") (clojure.core/assoc :subject-from-web-identity-token (deserweb-identity-subject-type (clojure.core/get-in letvar534003 ["SubjectFromWebIdentityToken" :content]))) (letvar534003 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar534003 ["AssumedRoleUser" :content]))) (letvar534003 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar534003 ["PackedPolicySize" :content]))) (letvar534003 "Provider") (clojure.core/assoc :provider (deser-issuer (clojure.core/get-in letvar534003 ["Provider" :content]))) (letvar534003 "Audience") (clojure.core/assoc :audience (deser-audience (clojure.core/get-in letvar534003 ["Audience" :content])))))))

(clojure.core/defn- response-idp-communication-error-exception ([input] (response-idp-communication-error-exception nil input)) ([resultWrapper534005 input] (clojure.core/let [rawinput534004 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534006 {"message" (portkey.aws/search-for-tag rawinput534004 "message" :flattened? nil :result-wrapper resultWrapper534005)}] (clojure.core/cond-> {} (letvar534006 "message") (clojure.core/assoc :message (deseridp-communication-error-message (clojure.core/get-in letvar534006 ["message" :content])))))))

(clojure.core/defn- response-invalid-authorization-message-exception ([input] (response-invalid-authorization-message-exception nil input)) ([resultWrapper534008 input] (clojure.core/let [rawinput534007 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534009 {"message" (portkey.aws/search-for-tag rawinput534007 "message" :flattened? nil :result-wrapper resultWrapper534008)}] (clojure.core/cond-> {} (letvar534009 "message") (clojure.core/assoc :message (deserinvalid-authorization-message (clojure.core/get-in letvar534009 ["message" :content])))))))

(clojure.core/defn- response-packed-policy-too-large-exception ([input] (response-packed-policy-too-large-exception nil input)) ([resultWrapper534011 input] (clojure.core/let [rawinput534010 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534012 {"message" (portkey.aws/search-for-tag rawinput534010 "message" :flattened? nil :result-wrapper resultWrapper534011)}] (clojure.core/cond-> {} (letvar534012 "message") (clojure.core/assoc :message (deserpacked-policy-too-large-message (clojure.core/get-in letvar534012 ["message" :content])))))))

(clojure.core/defn- response-malformed-policy-document-exception ([input] (response-malformed-policy-document-exception nil input)) ([resultWrapper534014 input] (clojure.core/let [rawinput534013 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534015 {"message" (portkey.aws/search-for-tag rawinput534013 "message" :flattened? nil :result-wrapper resultWrapper534014)}] (clojure.core/cond-> {} (letvar534015 "message") (clojure.core/assoc :message (desermalformed-policy-document-message (clojure.core/get-in letvar534015 ["message" :content])))))))

(clojure.core/defn- response-idp-rejected-claim-exception ([input] (response-idp-rejected-claim-exception nil input)) ([resultWrapper534017 input] (clojure.core/let [rawinput534016 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534018 {"message" (portkey.aws/search-for-tag rawinput534016 "message" :flattened? nil :result-wrapper resultWrapper534017)}] (clojure.core/cond-> {} (letvar534018 "message") (clojure.core/assoc :message (deseridp-rejected-claim-message (clojure.core/get-in letvar534018 ["message" :content])))))))

(clojure.core/defn- response-get-federation-token-response ([input] (response-get-federation-token-response nil input)) ([resultWrapper534020 input] (clojure.core/let [rawinput534019 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534021 {"Credentials" (portkey.aws/search-for-tag rawinput534019 "Credentials" :flattened? nil :result-wrapper resultWrapper534020), "FederatedUser" (portkey.aws/search-for-tag rawinput534019 "FederatedUser" :flattened? nil :result-wrapper resultWrapper534020), "PackedPolicySize" (portkey.aws/search-for-tag rawinput534019 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper534020)}] (clojure.core/cond-> {} (letvar534021 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar534021 ["Credentials" :content]))) (letvar534021 "FederatedUser") (clojure.core/assoc :federated-user (deser-federated-user (clojure.core/get-in letvar534021 ["FederatedUser" :content]))) (letvar534021 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar534021 ["PackedPolicySize" :content])))))))

(clojure.core/defn- response-assume-role-response ([input] (response-assume-role-response nil input)) ([resultWrapper534023 input] (clojure.core/let [rawinput534022 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534024 {"Credentials" (portkey.aws/search-for-tag rawinput534022 "Credentials" :flattened? nil :result-wrapper resultWrapper534023), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput534022 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper534023), "PackedPolicySize" (portkey.aws/search-for-tag rawinput534022 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper534023)}] (clojure.core/cond-> {} (letvar534024 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar534024 ["Credentials" :content]))) (letvar534024 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar534024 ["AssumedRoleUser" :content]))) (letvar534024 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar534024 ["PackedPolicySize" :content])))))))

(clojure.core/defn- response-get-session-token-response ([input] (response-get-session-token-response nil input)) ([resultWrapper534026 input] (clojure.core/let [rawinput534025 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534027 {"Credentials" (portkey.aws/search-for-tag rawinput534025 "Credentials" :flattened? nil :result-wrapper resultWrapper534026)}] (clojure.core/cond-> {} (letvar534027 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar534027 ["Credentials" :content])))))))

(clojure.core/defn- response-get-caller-identity-response ([input] (response-get-caller-identity-response nil input)) ([resultWrapper534029 input] (clojure.core/let [rawinput534028 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534030 {"UserId" (portkey.aws/search-for-tag rawinput534028 "UserId" :flattened? nil :result-wrapper resultWrapper534029), "Account" (portkey.aws/search-for-tag rawinput534028 "Account" :flattened? nil :result-wrapper resultWrapper534029), "Arn" (portkey.aws/search-for-tag rawinput534028 "Arn" :flattened? nil :result-wrapper resultWrapper534029)}] (clojure.core/cond-> {} (letvar534030 "UserId") (clojure.core/assoc :user-id (deseruser-id-type (clojure.core/get-in letvar534030 ["UserId" :content]))) (letvar534030 "Account") (clojure.core/assoc :account (deseraccount-type (clojure.core/get-in letvar534030 ["Account" :content]))) (letvar534030 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar534030 ["Arn" :content])))))))

(clojure.core/defn- response-assume-role-with-saml-response ([input] (response-assume-role-with-saml-response nil input)) ([resultWrapper534032 input] (clojure.core/let [rawinput534031 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534033 {"Credentials" (portkey.aws/search-for-tag rawinput534031 "Credentials" :flattened? nil :result-wrapper resultWrapper534032), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput534031 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper534032), "PackedPolicySize" (portkey.aws/search-for-tag rawinput534031 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper534032), "Subject" (portkey.aws/search-for-tag rawinput534031 "Subject" :flattened? nil :result-wrapper resultWrapper534032), "SubjectType" (portkey.aws/search-for-tag rawinput534031 "SubjectType" :flattened? nil :result-wrapper resultWrapper534032), "Issuer" (portkey.aws/search-for-tag rawinput534031 "Issuer" :flattened? nil :result-wrapper resultWrapper534032), "Audience" (portkey.aws/search-for-tag rawinput534031 "Audience" :flattened? nil :result-wrapper resultWrapper534032), "NameQualifier" (portkey.aws/search-for-tag rawinput534031 "NameQualifier" :flattened? nil :result-wrapper resultWrapper534032)}] (clojure.core/cond-> {} (letvar534033 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar534033 ["Credentials" :content]))) (letvar534033 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar534033 ["AssumedRoleUser" :content]))) (letvar534033 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar534033 ["PackedPolicySize" :content]))) (letvar534033 "Subject") (clojure.core/assoc :subject (deser-subject (clojure.core/get-in letvar534033 ["Subject" :content]))) (letvar534033 "SubjectType") (clojure.core/assoc :subject-type (deser-subject-type (clojure.core/get-in letvar534033 ["SubjectType" :content]))) (letvar534033 "Issuer") (clojure.core/assoc :issuer (deser-issuer (clojure.core/get-in letvar534033 ["Issuer" :content]))) (letvar534033 "Audience") (clojure.core/assoc :audience (deser-audience (clojure.core/get-in letvar534033 ["Audience" :content]))) (letvar534033 "NameQualifier") (clojure.core/assoc :name-qualifier (deser-name-qualifier (clojure.core/get-in letvar534033 ["NameQualifier" :content])))))))

(clojure.core/defn- response-expired-token-exception ([input] (response-expired-token-exception nil input)) ([resultWrapper534035 input] (clojure.core/let [rawinput534034 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534036 {"message" (portkey.aws/search-for-tag rawinput534034 "message" :flattened? nil :result-wrapper resultWrapper534035)}] (clojure.core/cond-> {} (letvar534036 "message") (clojure.core/assoc :message (deserexpired-identity-token-message (clojure.core/get-in letvar534036 ["message" :content])))))))

(clojure.core/defn- response-decode-authorization-message-response ([input] (response-decode-authorization-message-response nil input)) ([resultWrapper534038 input] (clojure.core/let [rawinput534037 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534039 {"DecodedMessage" (portkey.aws/search-for-tag rawinput534037 "DecodedMessage" :flattened? nil :result-wrapper resultWrapper534038)}] (clojure.core/cond-> {} (letvar534039 "DecodedMessage") (clojure.core/assoc :decoded-message (deserdecoded-message-type (clojure.core/get-in letvar534039 ["DecodedMessage" :content])))))))

(clojure.core/defn- response-region-disabled-exception ([input] (response-region-disabled-exception nil input)) ([resultWrapper534041 input] (clojure.core/let [rawinput534040 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar534042 {"message" (portkey.aws/search-for-tag rawinput534040 "message" :flattened? nil :result-wrapper resultWrapper534041)}] (clojure.core/cond-> {} (letvar534042 "message") (clojure.core/assoc :message (deserregion-disabled-message (clojure.core/get-in letvar534042 ["message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-session-token-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-session-token-request/serial-number (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-session-token-request/token-code (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/token-code-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-session-token-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.get-session-token-request/duration-seconds :portkey.aws.sts.-2011-06-15.get-session-token-request/serial-number :portkey.aws.sts.-2011-06-15.get-session-token-request/token-code]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/external-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1224)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@:\/-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.invalid-identity-token-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/invalid-identity-token-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/invalid-identity-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.invalid-identity-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assumed-role-user/assumed-role-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/assumed-role-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assumed-role-user/arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assumed-role-user (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.assumed-role-user/assumed-role-id :portkey.aws.sts.-2011-06-15.assumed-role-user/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/role-session-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/subject-from-web-identity-token (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/web-identity-subject-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/provider (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/issuer))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/subject-from-web-identity-token :portkey.aws.sts.-2011-06-15/assumed-role-user :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/packed-policy-size :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/provider :portkey.aws.sts.-2011-06-15/audience]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 32)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/token-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 6 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 6)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\d]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.idp-communication-error-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/idp-communication-error-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/idp-communication-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.idp-communication-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/saml-assertion-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 4 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 100000))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/role-duration-seconds-type (clojure.spec.alpha/int-in 900 43200))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/decoded-message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 4 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-request/role-arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-request/role-session-name (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/role-session-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-request/policy (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-request/external-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/external-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-request/serial-number (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-request/token-code (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/token-code-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assume-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.assume-role-request/role-arn :portkey.aws.sts.-2011-06-15.assume-role-request/role-session-name] :opt-un [:portkey.aws.sts.-2011-06-15.assume-role-request/policy :portkey.aws.sts.-2011-06-15.assume-role-request/duration-seconds :portkey.aws.sts.-2011-06-15.assume-role-request/external-id :portkey.aws.sts.-2011-06-15.assume-role-request/serial-number :portkey.aws.sts.-2011-06-15.assume-role-request/token-code]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/access-key-secret-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/token-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.invalid-authorization-message-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/invalid-authorization-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/invalid-authorization-message-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.invalid-authorization-message-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/expired-identity-token-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/federated-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 193)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@\:-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.federated-user/federated-user-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/federated-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.federated-user/arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/federated-user (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.federated-user/federated-user-id :portkey.aws.sts.-2011-06-15.federated-user/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/region-disabled-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-caller-identity-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.packed-policy-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/packed-policy-too-large-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.packed-policy-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/idp-communication-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/client-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 4 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.credentials/secret-access-key (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/access-key-secret-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.credentials/session-token (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/token-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.credentials/expiration (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/date-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.credentials/access-key-id :portkey.aws.sts.-2011-06-15.credentials/secret-access-key :portkey.aws.sts.-2011-06-15.credentials/session-token :portkey.aws.sts.-2011-06-15.credentials/expiration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/access-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 16 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/malformed-policy-document-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/audience (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/web-identity-subject-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 6 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.idp-rejected-claim-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/idp-rejected-claim-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/idp-rejected-claim-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.idp-rejected-claim-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-federation-token-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-federation-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials :portkey.aws.sts.-2011-06-15/federated-user :portkey.aws.sts.-2011-06-15.get-federation-token-response/packed-policy-size]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/issuer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/session-policy-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/idp-rejected-claim-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/invalid-authorization-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assume-role-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials :portkey.aws.sts.-2011-06-15/assumed-role-user :portkey.aws.sts.-2011-06-15.assume-role-response/packed-policy-size]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/encoded-message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/non-negative-integer-type (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-session-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 20 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.decode-authorization-message-request/encoded-message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/encoded-message-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/decode-authorization-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.decode-authorization-message-request/encoded-message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-caller-identity-response/user-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/user-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-caller-identity-response/account (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/account-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-caller-identity-response/arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-caller-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.get-caller-identity-response/user-id :portkey.aws.sts.-2011-06-15.get-caller-identity-response/account :portkey.aws.sts.-2011-06-15.get-caller-identity-response/arn]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/user-id-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/malformed-policy-document-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/name-qualifier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/role-arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/role-session-name (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/role-session-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/web-identity-token (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/client-token-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/provider-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/url-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/policy (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/role-arn :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/role-session-name :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/web-identity-token] :opt-un [:portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/provider-id :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/policy :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-request/duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/role-arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/principal-arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/saml-assertion (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/saml-assertion-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/policy (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/role-duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assume-role-with-saml-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/role-arn :portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/principal-arn :portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/saml-assertion] :opt-un [:portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/policy :portkey.aws.sts.-2011-06-15.assume-role-with-saml-request/duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/serial-number-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 9 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=/:,.@-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assumed-role-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 2 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 193)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@:-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-saml-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assume-role-with-saml-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials :portkey.aws.sts.-2011-06-15/assumed-role-user :portkey.aws.sts.-2011-06-15.assume-role-with-saml-response/packed-policy-size :portkey.aws.sts.-2011-06-15/subject :portkey.aws.sts.-2011-06-15/subject-type :portkey.aws.sts.-2011-06-15/issuer :portkey.aws.sts.-2011-06-15/audience :portkey.aws.sts.-2011-06-15/name-qualifier]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/invalid-identity-token-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/subject-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/account-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.expired-token-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/expired-identity-token-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/expired-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.expired-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.decode-authorization-message-response/decoded-message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/decoded-message-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/decode-authorization-message-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.decode-authorization-message-response/decoded-message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.region-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/region-disabled-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/region-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.region-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/packed-policy-too-large-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-federation-token-request/name (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/user-name-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-federation-token-request/policy (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/session-policy-document-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-federation-token-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-federation-token-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.get-federation-token-request/name] :opt-un [:portkey.aws.sts.-2011-06-15.get-federation-token-request/policy :portkey.aws.sts.-2011-06-15.get-federation-token-request/duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/duration-seconds-type (clojure.spec.alpha/int-in 900 129600))

(clojure.core/defn assume-role ([assume-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-assume-role-request assume-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/assume-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/assume-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleResult", :http.request.configuration/action "AssumeRole", :http.request.configuration/output-deser-fn response-assume-role-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/assume-role-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/assume-role-response))

(clojure.core/defn assume-role-with-saml ([assume-role-with-saml-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-assume-role-with-saml-request assume-role-with-saml-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/assume-role-with-saml-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/assume-role-with-saml-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleWithSAMLResult", :http.request.configuration/action "AssumeRoleWithSAML", :http.request.configuration/output-deser-fn response-assume-role-with-saml-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts.-2011-06-15/idp-rejected-claim-exception, "InvalidIdentityTokenException" :portkey.aws.sts.-2011-06-15/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts.-2011-06-15/expired-token-exception, "RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role-with-saml :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/assume-role-with-saml-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/assume-role-with-saml-response))

(clojure.core/defn assume-role-with-web-identity ([assume-role-with-web-identity-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-assume-role-with-web-identity-request assume-role-with-web-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleWithWebIdentityResult", :http.request.configuration/action "AssumeRoleWithWebIdentity", :http.request.configuration/output-deser-fn response-assume-role-with-web-identity-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts.-2011-06-15/idp-rejected-claim-exception, "IDPCommunicationErrorException" :portkey.aws.sts.-2011-06-15/idp-communication-error-exception, "InvalidIdentityTokenException" :portkey.aws.sts.-2011-06-15/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts.-2011-06-15/expired-token-exception, "RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role-with-web-identity :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-response))

(clojure.core/defn decode-authorization-message ([decode-authorization-message-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-decode-authorization-message-request decode-authorization-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/decode-authorization-message-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/decode-authorization-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DecodeAuthorizationMessageResult", :http.request.configuration/action "DecodeAuthorizationMessage", :http.request.configuration/output-deser-fn response-decode-authorization-message-response, :http.request.spec/error-spec {"InvalidAuthorizationMessageException" :portkey.aws.sts.-2011-06-15/invalid-authorization-message-exception}})))))
(clojure.spec.alpha/fdef decode-authorization-message :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/decode-authorization-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/decode-authorization-message-response))

(clojure.core/defn get-caller-identity ([] (get-caller-identity {})) ([get-caller-identity-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-caller-identity-request get-caller-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/get-caller-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/get-caller-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetCallerIdentityResult", :http.request.configuration/action "GetCallerIdentity", :http.request.configuration/output-deser-fn response-get-caller-identity-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-caller-identity :args (clojure.spec.alpha/? :portkey.aws.sts.-2011-06-15/get-caller-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/get-caller-identity-response))

(clojure.core/defn get-federation-token ([get-federation-token-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-federation-token-request get-federation-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/get-federation-token-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/get-federation-token-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetFederationTokenResult", :http.request.configuration/action "GetFederationToken", :http.request.configuration/output-deser-fn response-get-federation-token-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef get-federation-token :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/get-federation-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/get-federation-token-response))

(clojure.core/defn get-session-token ([] (get-session-token {})) ([get-session-token-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-session-token-request get-session-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/get-session-token-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/get-session-token-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSessionTokenResult", :http.request.configuration/action "GetSessionToken", :http.request.configuration/output-deser-fn response-get-session-token-response, :http.request.spec/error-spec {"RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef get-session-token :args (clojure.spec.alpha/? :portkey.aws.sts.-2011-06-15/get-session-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/get-session-token-response))
