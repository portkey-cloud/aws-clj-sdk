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

(clojure.core/defn- deser-assumed-role-user [input] (clojure.core/let [letvar1822611 {"AssumedRoleId" (portkey.aws/search-for-tag input "AssumedRoleId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:assumed-role-id (deserassumed-role-id-type (clojure.core/get-in letvar1822611 ["AssumedRoleId" :content])), :arn (deserarn-type (clojure.core/get-in letvar1822611 ["Arn" :content]))})))

(clojure.core/defn- deserdate-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserdecoded-message-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseraccess-key-secret-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desertoken-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserexpired-identity-token-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserfederated-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-federated-user [input] (clojure.core/let [letvar1822746 {"FederatedUserId" (portkey.aws/search-for-tag input "FederatedUserId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:federated-user-id (deserfederated-id-type (clojure.core/get-in letvar1822746 ["FederatedUserId" :content])), :arn (deserarn-type (clojure.core/get-in letvar1822746 ["Arn" :content]))})))

(clojure.core/defn- deserregion-disabled-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseridp-communication-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-credentials [input] (clojure.core/let [letvar1822864 {"AccessKeyId" (portkey.aws/search-for-tag input "AccessKeyId" :flattened? nil :xmlAttribute? nil), "SecretAccessKey" (portkey.aws/search-for-tag input "SecretAccessKey" :flattened? nil :xmlAttribute? nil), "SessionToken" (portkey.aws/search-for-tag input "SessionToken" :flattened? nil :xmlAttribute? nil), "Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:access-key-id (deseraccess-key-id-type (clojure.core/get-in letvar1822864 ["AccessKeyId" :content])), :secret-access-key (deseraccess-key-secret-type (clojure.core/get-in letvar1822864 ["SecretAccessKey" :content])), :session-token (desertoken-type (clojure.core/get-in letvar1822864 ["SessionToken" :content])), :expiration (deserdate-type (clojure.core/get-in letvar1822864 ["Expiration" :content]))})))

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

(clojure.core/defn- response-invalid-identity-token-exception ([input] (response-invalid-identity-token-exception nil input)) ([resultWrapper1822948 input] (clojure.core/let [rawinput1822947 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822949 {"message" (portkey.aws/search-for-tag rawinput1822947 "message" :flattened? nil :result-wrapper resultWrapper1822948)}] (clojure.core/cond-> {} (letvar1822949 "message") (clojure.core/assoc :message (deserinvalid-identity-token-message (clojure.core/get-in letvar1822949 ["message" :content])))))))

(clojure.core/defn- response-assume-role-with-web-identity-response ([input] (response-assume-role-with-web-identity-response nil input)) ([resultWrapper1822951 input] (clojure.core/let [rawinput1822950 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822952 {"Credentials" (portkey.aws/search-for-tag rawinput1822950 "Credentials" :flattened? nil :result-wrapper resultWrapper1822951), "SubjectFromWebIdentityToken" (portkey.aws/search-for-tag rawinput1822950 "SubjectFromWebIdentityToken" :flattened? nil :result-wrapper resultWrapper1822951), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput1822950 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper1822951), "PackedPolicySize" (portkey.aws/search-for-tag rawinput1822950 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper1822951), "Provider" (portkey.aws/search-for-tag rawinput1822950 "Provider" :flattened? nil :result-wrapper resultWrapper1822951), "Audience" (portkey.aws/search-for-tag rawinput1822950 "Audience" :flattened? nil :result-wrapper resultWrapper1822951)}] (clojure.core/cond-> {} (letvar1822952 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar1822952 ["Credentials" :content]))) (letvar1822952 "SubjectFromWebIdentityToken") (clojure.core/assoc :subject-from-web-identity-token (deserweb-identity-subject-type (clojure.core/get-in letvar1822952 ["SubjectFromWebIdentityToken" :content]))) (letvar1822952 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar1822952 ["AssumedRoleUser" :content]))) (letvar1822952 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar1822952 ["PackedPolicySize" :content]))) (letvar1822952 "Provider") (clojure.core/assoc :provider (deser-issuer (clojure.core/get-in letvar1822952 ["Provider" :content]))) (letvar1822952 "Audience") (clojure.core/assoc :audience (deser-audience (clojure.core/get-in letvar1822952 ["Audience" :content])))))))

(clojure.core/defn- response-idp-communication-error-exception ([input] (response-idp-communication-error-exception nil input)) ([resultWrapper1822954 input] (clojure.core/let [rawinput1822953 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822955 {"message" (portkey.aws/search-for-tag rawinput1822953 "message" :flattened? nil :result-wrapper resultWrapper1822954)}] (clojure.core/cond-> {} (letvar1822955 "message") (clojure.core/assoc :message (deseridp-communication-error-message (clojure.core/get-in letvar1822955 ["message" :content])))))))

(clojure.core/defn- response-invalid-authorization-message-exception ([input] (response-invalid-authorization-message-exception nil input)) ([resultWrapper1822957 input] (clojure.core/let [rawinput1822956 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822958 {"message" (portkey.aws/search-for-tag rawinput1822956 "message" :flattened? nil :result-wrapper resultWrapper1822957)}] (clojure.core/cond-> {} (letvar1822958 "message") (clojure.core/assoc :message (deserinvalid-authorization-message (clojure.core/get-in letvar1822958 ["message" :content])))))))

(clojure.core/defn- response-packed-policy-too-large-exception ([input] (response-packed-policy-too-large-exception nil input)) ([resultWrapper1822960 input] (clojure.core/let [rawinput1822959 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822961 {"message" (portkey.aws/search-for-tag rawinput1822959 "message" :flattened? nil :result-wrapper resultWrapper1822960)}] (clojure.core/cond-> {} (letvar1822961 "message") (clojure.core/assoc :message (deserpacked-policy-too-large-message (clojure.core/get-in letvar1822961 ["message" :content])))))))

(clojure.core/defn- response-malformed-policy-document-exception ([input] (response-malformed-policy-document-exception nil input)) ([resultWrapper1822963 input] (clojure.core/let [rawinput1822962 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822964 {"message" (portkey.aws/search-for-tag rawinput1822962 "message" :flattened? nil :result-wrapper resultWrapper1822963)}] (clojure.core/cond-> {} (letvar1822964 "message") (clojure.core/assoc :message (desermalformed-policy-document-message (clojure.core/get-in letvar1822964 ["message" :content])))))))

(clojure.core/defn- response-idp-rejected-claim-exception ([input] (response-idp-rejected-claim-exception nil input)) ([resultWrapper1822966 input] (clojure.core/let [rawinput1822965 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822967 {"message" (portkey.aws/search-for-tag rawinput1822965 "message" :flattened? nil :result-wrapper resultWrapper1822966)}] (clojure.core/cond-> {} (letvar1822967 "message") (clojure.core/assoc :message (deseridp-rejected-claim-message (clojure.core/get-in letvar1822967 ["message" :content])))))))

(clojure.core/defn- response-get-federation-token-response ([input] (response-get-federation-token-response nil input)) ([resultWrapper1822969 input] (clojure.core/let [rawinput1822968 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822970 {"Credentials" (portkey.aws/search-for-tag rawinput1822968 "Credentials" :flattened? nil :result-wrapper resultWrapper1822969), "FederatedUser" (portkey.aws/search-for-tag rawinput1822968 "FederatedUser" :flattened? nil :result-wrapper resultWrapper1822969), "PackedPolicySize" (portkey.aws/search-for-tag rawinput1822968 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper1822969)}] (clojure.core/cond-> {} (letvar1822970 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar1822970 ["Credentials" :content]))) (letvar1822970 "FederatedUser") (clojure.core/assoc :federated-user (deser-federated-user (clojure.core/get-in letvar1822970 ["FederatedUser" :content]))) (letvar1822970 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar1822970 ["PackedPolicySize" :content])))))))

(clojure.core/defn- response-assume-role-response ([input] (response-assume-role-response nil input)) ([resultWrapper1822972 input] (clojure.core/let [rawinput1822971 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822973 {"Credentials" (portkey.aws/search-for-tag rawinput1822971 "Credentials" :flattened? nil :result-wrapper resultWrapper1822972), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput1822971 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper1822972), "PackedPolicySize" (portkey.aws/search-for-tag rawinput1822971 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper1822972)}] (clojure.core/cond-> {} (letvar1822973 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar1822973 ["Credentials" :content]))) (letvar1822973 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar1822973 ["AssumedRoleUser" :content]))) (letvar1822973 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar1822973 ["PackedPolicySize" :content])))))))

(clojure.core/defn- response-get-session-token-response ([input] (response-get-session-token-response nil input)) ([resultWrapper1822975 input] (clojure.core/let [rawinput1822974 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822976 {"Credentials" (portkey.aws/search-for-tag rawinput1822974 "Credentials" :flattened? nil :result-wrapper resultWrapper1822975)}] (clojure.core/cond-> {} (letvar1822976 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar1822976 ["Credentials" :content])))))))

(clojure.core/defn- response-get-caller-identity-response ([input] (response-get-caller-identity-response nil input)) ([resultWrapper1822978 input] (clojure.core/let [rawinput1822977 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822979 {"UserId" (portkey.aws/search-for-tag rawinput1822977 "UserId" :flattened? nil :result-wrapper resultWrapper1822978), "Account" (portkey.aws/search-for-tag rawinput1822977 "Account" :flattened? nil :result-wrapper resultWrapper1822978), "Arn" (portkey.aws/search-for-tag rawinput1822977 "Arn" :flattened? nil :result-wrapper resultWrapper1822978)}] (clojure.core/cond-> {} (letvar1822979 "UserId") (clojure.core/assoc :user-id (deseruser-id-type (clojure.core/get-in letvar1822979 ["UserId" :content]))) (letvar1822979 "Account") (clojure.core/assoc :account (deseraccount-type (clojure.core/get-in letvar1822979 ["Account" :content]))) (letvar1822979 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar1822979 ["Arn" :content])))))))

(clojure.core/defn- response-assume-role-with-saml-response ([input] (response-assume-role-with-saml-response nil input)) ([resultWrapper1822981 input] (clojure.core/let [rawinput1822980 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822982 {"Credentials" (portkey.aws/search-for-tag rawinput1822980 "Credentials" :flattened? nil :result-wrapper resultWrapper1822981), "AssumedRoleUser" (portkey.aws/search-for-tag rawinput1822980 "AssumedRoleUser" :flattened? nil :result-wrapper resultWrapper1822981), "PackedPolicySize" (portkey.aws/search-for-tag rawinput1822980 "PackedPolicySize" :flattened? nil :result-wrapper resultWrapper1822981), "Subject" (portkey.aws/search-for-tag rawinput1822980 "Subject" :flattened? nil :result-wrapper resultWrapper1822981), "SubjectType" (portkey.aws/search-for-tag rawinput1822980 "SubjectType" :flattened? nil :result-wrapper resultWrapper1822981), "Issuer" (portkey.aws/search-for-tag rawinput1822980 "Issuer" :flattened? nil :result-wrapper resultWrapper1822981), "Audience" (portkey.aws/search-for-tag rawinput1822980 "Audience" :flattened? nil :result-wrapper resultWrapper1822981), "NameQualifier" (portkey.aws/search-for-tag rawinput1822980 "NameQualifier" :flattened? nil :result-wrapper resultWrapper1822981)}] (clojure.core/cond-> {} (letvar1822982 "Credentials") (clojure.core/assoc :credentials (deser-credentials (clojure.core/get-in letvar1822982 ["Credentials" :content]))) (letvar1822982 "AssumedRoleUser") (clojure.core/assoc :assumed-role-user (deser-assumed-role-user (clojure.core/get-in letvar1822982 ["AssumedRoleUser" :content]))) (letvar1822982 "PackedPolicySize") (clojure.core/assoc :packed-policy-size (desernon-negative-integer-type (clojure.core/get-in letvar1822982 ["PackedPolicySize" :content]))) (letvar1822982 "Subject") (clojure.core/assoc :subject (deser-subject (clojure.core/get-in letvar1822982 ["Subject" :content]))) (letvar1822982 "SubjectType") (clojure.core/assoc :subject-type (deser-subject-type (clojure.core/get-in letvar1822982 ["SubjectType" :content]))) (letvar1822982 "Issuer") (clojure.core/assoc :issuer (deser-issuer (clojure.core/get-in letvar1822982 ["Issuer" :content]))) (letvar1822982 "Audience") (clojure.core/assoc :audience (deser-audience (clojure.core/get-in letvar1822982 ["Audience" :content]))) (letvar1822982 "NameQualifier") (clojure.core/assoc :name-qualifier (deser-name-qualifier (clojure.core/get-in letvar1822982 ["NameQualifier" :content])))))))

(clojure.core/defn- response-expired-token-exception ([input] (response-expired-token-exception nil input)) ([resultWrapper1822984 input] (clojure.core/let [rawinput1822983 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822985 {"message" (portkey.aws/search-for-tag rawinput1822983 "message" :flattened? nil :result-wrapper resultWrapper1822984)}] (clojure.core/cond-> {} (letvar1822985 "message") (clojure.core/assoc :message (deserexpired-identity-token-message (clojure.core/get-in letvar1822985 ["message" :content])))))))

(clojure.core/defn- response-decode-authorization-message-response ([input] (response-decode-authorization-message-response nil input)) ([resultWrapper1822987 input] (clojure.core/let [rawinput1822986 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822988 {"DecodedMessage" (portkey.aws/search-for-tag rawinput1822986 "DecodedMessage" :flattened? nil :result-wrapper resultWrapper1822987)}] (clojure.core/cond-> {} (letvar1822988 "DecodedMessage") (clojure.core/assoc :decoded-message (deserdecoded-message-type (clojure.core/get-in letvar1822988 ["DecodedMessage" :content])))))))

(clojure.core/defn- response-region-disabled-exception ([input] (response-region-disabled-exception nil input)) ([resultWrapper1822990 input] (clojure.core/let [rawinput1822989 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1822991 {"message" (portkey.aws/search-for-tag rawinput1822989 "message" :flattened? nil :result-wrapper resultWrapper1822990)}] (clojure.core/cond-> {} (letvar1822991 "message") (clojure.core/assoc :message (deserregion-disabled-message (clojure.core/get-in letvar1822991 ["message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-session-token-request/duration-seconds (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/duration-seconds-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-session-token-request/serial-number (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-session-token-request/token-code (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/token-code-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-session-token-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.get-session-token-request/duration-seconds :portkey.aws.sts.-2011-06-15.get-session-token-request/serial-number :portkey.aws.sts.-2011-06-15.get-session-token-request/token-code]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/external-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1224)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+=,.@:\/-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.invalid-identity-token-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/invalid-identity-token-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/invalid-identity-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.invalid-identity-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assumed-role-user/assumed-role-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/assumed-role-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assumed-role-user/arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assumed-role-user (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.assumed-role-user/assumed-role-id :portkey.aws.sts.-2011-06-15.assumed-role-user/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/role-session-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/subject-from-web-identity-token (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/web-identity-subject-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/provider (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/issuer))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/subject-from-web-identity-token :portkey.aws.sts.-2011-06-15/assumed-role-user :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/packed-policy-size :portkey.aws.sts.-2011-06-15.assume-role-with-web-identity-response/provider :portkey.aws.sts.-2011-06-15/audience]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/token-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 6)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\d]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.idp-communication-error-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/idp-communication-error-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/idp-communication-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.idp-communication-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/saml-assertion-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 4 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100000))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/role-duration-seconds-type (clojure.spec.alpha/int-in 900 43200))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/decoded-message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 4 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

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

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/federated-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 193)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+=,.@\:-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.federated-user/federated-user-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/federated-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.federated-user/arn (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/arn-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/federated-user (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.federated-user/federated-user-id :portkey.aws.sts.-2011-06-15.federated-user/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/region-disabled-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-caller-identity-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.packed-policy-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/packed-policy-too-large-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.packed-policy-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/idp-communication-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/client-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 4 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.credentials/secret-access-key (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/access-key-secret-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.credentials/session-token (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/token-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.credentials/expiration (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/date-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.sts.-2011-06-15.credentials/access-key-id :portkey.aws.sts.-2011-06-15.credentials/secret-access-key :portkey.aws.sts.-2011-06-15.credentials/session-token :portkey.aws.sts.-2011-06-15.credentials/expiration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/access-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 16 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/malformed-policy-document-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/audience (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/web-identity-subject-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.idp-rejected-claim-exception/message (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/idp-rejected-claim-message))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/idp-rejected-claim-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15.idp-rejected-claim-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.get-federation-token-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-federation-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials :portkey.aws.sts.-2011-06-15/federated-user :portkey.aws.sts.-2011-06-15.get-federation-token-response/packed-policy-size]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/issuer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/session-policy-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/idp-rejected-claim-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/invalid-authorization-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15.assume-role-response/packed-policy-size (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/non-negative-integer-type))
(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assume-role-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials :portkey.aws.sts.-2011-06-15/assumed-role-user :portkey.aws.sts.-2011-06-15.assume-role-response/packed-policy-size]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/encoded-message-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/non-negative-integer-type (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/get-session-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sts.-2011-06-15/credentials]))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/serial-number-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 9 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+=/:,.@-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.sts.-2011-06-15/assumed-role-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 193)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w+=,.@:-]*" s__21078__auto__))))

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

(clojure.core/defn assume-role "Returns a set of temporary security credentials (consisting of an access key ID,\na secret access key, and a security token) that you can use to access AWS\nresources that you might not normally have access to. Typically, you use\nAssumeRole for cross-account access or federation. For a comparison of\nAssumeRole with the other APIs that produce temporary credentials, see\nRequesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n Important: You cannot call AssumeRole by using AWS root account credentials;\naccess is denied. You must use credentials for an IAM user or an IAM role to\ncall AssumeRole.\n For cross-account access, imagine that you own multiple accounts and need to\naccess resources in each account. You could create long-term credentials in each\naccount to access those resources. However, managing all those credentials and\nremembering which one can access which account can be time consuming. Instead,\nyou can create one set of long-term credentials in one account and then use\ntemporary security credentials to access all the other accounts by assuming\nroles in those accounts. For more information about roles, see IAM Roles\n(Delegation and Federation)\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) in the IAM\nUser Guide.\n For federation, you can, for example, grant single sign-on access to the AWS\nManagement Console. If you already have an identity and authentication system in\nyour corporate network, you don't have to recreate user identities in AWS in\norder to grant those user identities access to AWS. Instead, after a user has\nbeen authenticated, you call AssumeRole (and specify the role with the\nappropriate permissions) to get temporary security credentials for that user.\nWith those temporary security credentials, you construct a sign-in URL that\nusers can use to access the console. For more information, see Common Scenarios\nfor Temporary Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html#sts-introduction)\nin the IAM User Guide.\n By default, the temporary security credentials created by AssumeRole last for\none hour. However, you can use the optional DurationSeconds parameter to specify\nthe duration of your session. You can provide a value from 900 seconds (15\nminutes) up to the maximum session duration setting for the role. This setting\ncan have a value from 1 hour to 12 hours. To learn how to view the maximum value\nfor your role, see View the Maximum Session Duration Setting for a Role\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session)\nin the IAM User Guide. The maximum session duration limit applies when you use\nthe AssumeRole* API operations or the assume-role* CLI operations but does not\napply when you use those operations to create a console URL. For more\ninformation, see Using IAM Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the IAM\nUser Guide.\n The temporary security credentials created by AssumeRole can be used to make\nAPI calls to any AWS service with the following exception: you cannot call the\nSTS service's GetFederationToken or GetSessionToken APIs.\n Optionally, you can pass an IAM access policy to this operation. If you choose\nnot to pass a policy, the temporary security credentials that are returned by\nthe operation have the permissions that are defined in the access policy of the\nrole that is being assumed. If you pass a policy to this operation, the\ntemporary security credentials that are returned by the operation have the\npermissions that are allowed by both the access policy of the role that is being\nassumed, and the policy that you pass. This gives you a way to further restrict\nthe permissions for the resulting temporary security credentials. You cannot use\nthe passed policy to grant permissions that are in excess of those allowed by\nthe access policy of the role that is being assumed. For more information, see\nPermissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html)\nin the IAM User Guide.\n To assume a role, your AWS account must be trusted by the role. The trust\nrelationship is defined in the role's trust policy when the role is created.\nThat trust policy states which accounts are allowed to delegate access to this\naccount's role.\n The user who wants to access the role must also have permissions delegated from\nthe role's administrator. If the user is in a different account than the role,\nthen the user's administrator must attach a policy that allows the user to call\nAssumeRole on the ARN of the role in the other account. If the user is in the\nsame account as the role, then you can either attach a policy to the user\n(identical to the previous different account user), or you can add the user as a\nprincipal directly in the role's trust policy. In this case, the trust policy\nacts as the only resource-based policy in IAM, and users in the same account as\nthe role do not need explicit permission to assume the role. For more\ninformation about trust policies and resource-based policies, see IAM Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html) in the\nIAM User Guide.\n Using MFA with AssumeRole\n You can optionally include multi-factor authentication (MFA) information when\nyou call AssumeRole. This is useful for cross-account scenarios in which you\nwant to make sure that the user who is assuming the role has been authenticated\nusing an AWS MFA device. In that scenario, the trust policy of the role being\nassumed includes a condition that tests for MFA authentication; if the caller\ndoes not include valid MFA information, the request to assume the role is\ndenied. The condition in a trust policy that tests for MFA authentication might\nlook like the following example.\n \"Condition\": {\"Bool\": {\"aws:MultiFactorAuthPresent\": true}}\n For more information, see Configuring MFA-Protected API Access\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html) in the\nIAM User Guide guide.\n To use MFA with AssumeRole, you pass values for the SerialNumber and TokenCode\nparameters. The SerialNumber value identifies the user's hardware or virtual MFA\ndevice. The TokenCode is the time-based one-time password (TOTP) that the MFA\ndevices produces." ([assume-role-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-assume-role-request assume-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/assume-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/assume-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleResult", :http.request.configuration/action "AssumeRole", :http.request.configuration/output-deser-fn response-assume-role-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/assume-role-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/assume-role-response))

(clojure.core/defn assume-role-with-saml "Returns a set of temporary security credentials for users who have been\nauthenticated via a SAML authentication response. This operation provides a\nmechanism for tying an enterprise identity store or directory to role-based AWS\naccess without user-specific credentials or configuration. For a comparison of\nAssumeRoleWithSAML with the other APIs that produce temporary credentials, see\nRequesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n The temporary security credentials returned by this operation consist of an\naccess key ID, a secret access key, and a security token. Applications can use\nthese temporary security credentials to sign calls to AWS services.\n By default, the temporary security credentials created by AssumeRoleWithSAML\nlast for one hour. However, you can use the optional DurationSeconds parameter\nto specify the duration of your session. Your role session lasts for the\nduration that you specify, or until the time specified in the SAML\nauthentication response's SessionNotOnOrAfter value, whichever is shorter. You\ncan provide a DurationSeconds value from 900 seconds (15 minutes) up to the\nmaximum session duration setting for the role. This setting can have a value\nfrom 1 hour to 12 hours. To learn how to view the maximum value for your role,\nsee View the Maximum Session Duration Setting for a Role\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session)\nin the IAM User Guide. The maximum session duration limit applies when you use\nthe AssumeRole* API operations or the assume-role* CLI operations but does not\napply when you use those operations to create a console URL. For more\ninformation, see Using IAM Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the IAM\nUser Guide.\n The temporary security credentials created by AssumeRoleWithSAML can be used to\nmake API calls to any AWS service with the following exception: you cannot call\nthe STS service's GetFederationToken or GetSessionToken APIs.\n Optionally, you can pass an IAM access policy to this operation. If you choose\nnot to pass a policy, the temporary security credentials that are returned by\nthe operation have the permissions that are defined in the access policy of the\nrole that is being assumed. If you pass a policy to this operation, the\ntemporary security credentials that are returned by the operation have the\npermissions that are allowed by the intersection of both the access policy of\nthe role that is being assumed, and the policy that you pass. This means that\nboth policies must grant the permission for the action to be allowed. This gives\nyou a way to further restrict the permissions for the resulting temporary\nsecurity credentials. You cannot use the passed policy to grant permissions that\nare in excess of those allowed by the access policy of the role that is being\nassumed. For more information, see Permissions for AssumeRole,\nAssumeRoleWithSAML, and AssumeRoleWithWebIdentity\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html)\nin the IAM User Guide.\n Before your application can call AssumeRoleWithSAML, you must configure your\nSAML identity provider (IdP) to issue the claims required by AWS. Additionally,\nyou must use AWS Identity and Access Management (IAM) to create a SAML provider\nentity in your AWS account that represents your identity provider, and create an\nIAM role that specifies this SAML provider in its trust policy.\n Calling AssumeRoleWithSAML does not require the use of AWS security\ncredentials. The identity of the caller is validated by using keys in the\nmetadata document that is uploaded for the SAML provider entity for your\nidentity provider.\n Calling AssumeRoleWithSAML can result in an entry in your AWS CloudTrail logs.\nThe entry includes the value in the NameID element of the SAML assertion. We\nrecommend that you use a NameIDType that is not associated with any personally\nidentifiable information (PII). For example, you could instead use the\nPersistent Identifier (urn:oasis:names:tc:SAML:2.0:nameid-format:persistent).\n For more information, see the following resources:\n * About SAML 2.0-based Federation\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html)\nin the IAM User Guide.\n * Creating SAML Identity Providers\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml.html)\nin the IAM User Guide.\n * Configuring a Relying Party and Claims\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml_relying-party.html)\nin the IAM User Guide.\n * Creating a Role for SAML 2.0 Federation\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_saml.html)\nin the IAM User Guide." ([assume-role-with-saml-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-assume-role-with-saml-request assume-role-with-saml-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/assume-role-with-saml-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/assume-role-with-saml-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleWithSAMLResult", :http.request.configuration/action "AssumeRoleWithSAML", :http.request.configuration/output-deser-fn response-assume-role-with-saml-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts.-2011-06-15/idp-rejected-claim-exception, "InvalidIdentityTokenException" :portkey.aws.sts.-2011-06-15/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts.-2011-06-15/expired-token-exception, "RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role-with-saml :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/assume-role-with-saml-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/assume-role-with-saml-response))

(clojure.core/defn assume-role-with-web-identity "Returns a set of temporary security credentials for users who have been\nauthenticated in a mobile or web application with a web identity provider, such\nas Amazon Cognito, Login with Amazon, Facebook, Google, or any OpenID\nConnect-compatible identity provider.\n For mobile applications, we recommend that you use Amazon Cognito. You can use\nAmazon Cognito with the AWS SDK for iOS (http://aws.amazon.com/sdkforios/) and\nthe AWS SDK for Android (http://aws.amazon.com/sdkforandroid/) to uniquely\nidentify a user and supply the user with a consistent identity throughout the\nlifetime of an application.\n To learn more about Amazon Cognito, see Amazon Cognito Overview\n(http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840)\nin the AWS SDK for Android Developer Guide guide and Amazon Cognito Overview\n(http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664)\nin the AWS SDK for iOS Developer Guide.\n Calling AssumeRoleWithWebIdentity does not require the use of AWS security\ncredentials. Therefore, you can distribute an application (for example, on\nmobile devices) that requests temporary security credentials without including\nlong-term AWS credentials in the application, and without deploying server-based\nproxy services that use long-term AWS credentials. Instead, the identity of the\ncaller is validated by using a token from the web identity provider. For a\ncomparison of AssumeRoleWithWebIdentity with the other APIs that produce\ntemporary credentials, see Requesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n The temporary security credentials returned by this API consist of an access\nkey ID, a secret access key, and a security token. Applications can use these\ntemporary security credentials to sign calls to AWS service APIs.\n By default, the temporary security credentials created by\nAssumeRoleWithWebIdentity last for one hour. However, you can use the optional\nDurationSeconds parameter to specify the duration of your session. You can\nprovide a value from 900 seconds (15 minutes) up to the maximum session duration\nsetting for the role. This setting can have a value from 1 hour to 12 hours. To\nlearn how to view the maximum value for your role, see View the Maximum Session\nDuration Setting for a Role\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session)\nin the IAM User Guide. The maximum session duration limit applies when you use\nthe AssumeRole* API operations or the assume-role* CLI operations but does not\napply when you use those operations to create a console URL. For more\ninformation, see Using IAM Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the IAM\nUser Guide.\n The temporary security credentials created by AssumeRoleWithWebIdentity can be\nused to make API calls to any AWS service with the following exception: you\ncannot call the STS service's GetFederationToken or GetSessionToken APIs.\n Optionally, you can pass an IAM access policy to this operation. If you choose\nnot to pass a policy, the temporary security credentials that are returned by\nthe operation have the permissions that are defined in the access policy of the\nrole that is being assumed. If you pass a policy to this operation, the\ntemporary security credentials that are returned by the operation have the\npermissions that are allowed by both the access policy of the role that is being\nassumed, and the policy that you pass. This gives you a way to further restrict\nthe permissions for the resulting temporary security credentials. You cannot use\nthe passed policy to grant permissions that are in excess of those allowed by\nthe access policy of the role that is being assumed. For more information, see\nPermissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html)\nin the IAM User Guide.\n Before your application can call AssumeRoleWithWebIdentity, you must have an\nidentity token from a supported identity provider and create a role that the\napplication can assume. The role that your application assumes must trust the\nidentity provider that is associated with the identity token. In other words,\nthe identity provider must be specified in the role's trust policy.\n Calling AssumeRoleWithWebIdentity can result in an entry in your AWS CloudTrail\nlogs. The entry includes the Subject\n(http://openid.net/specs/openid-connect-core-1_0.html#Claims) of the provided\nWeb Identity Token. We recommend that you avoid using any personally\nidentifiable information (PII) in this field. For example, you could instead use\na GUID or a pairwise identifier, as suggested in the OIDC specification\n(http://openid.net/specs/openid-connect-core-1_0.html#SubjectIDTypes).\n For more information about how to use web identity federation and the\nAssumeRoleWithWebIdentity API, see the following resources:\n * Using Web Identity Federation APIs for Mobile Apps\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html)\nand Federation Through a Web-based Identity Provider\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity).\n * Web Identity Federation Playground\n(https://web-identity-federation-playground.s3.amazonaws.com/index.html). This\ninteractive website lets you walk through the process of authenticating via\nLogin with Amazon, Facebook, or Google, getting temporary security credentials,\nand then using those credentials to make a request to AWS.\n * AWS SDK for iOS (http://aws.amazon.com/sdkforios/) and AWS SDK for Android\n(http://aws.amazon.com/sdkforandroid/). These toolkits contain sample apps that\nshow how to invoke the identity providers, and then how to use the information\nfrom these providers to get and use temporary security credentials.\n * Web Identity Federation with Mobile Applications\n(http://aws.amazon.com/articles/web-identity-federation-with-mobile-applications).\nThis article discusses web identity federation and shows an example of how to\nuse web identity federation to get access to content in Amazon S3." ([assume-role-with-web-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-assume-role-with-web-identity-request assume-role-with-web-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AssumeRoleWithWebIdentityResult", :http.request.configuration/action "AssumeRoleWithWebIdentity", :http.request.configuration/output-deser-fn response-assume-role-with-web-identity-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception, "IDPRejectedClaimException" :portkey.aws.sts.-2011-06-15/idp-rejected-claim-exception, "IDPCommunicationErrorException" :portkey.aws.sts.-2011-06-15/idp-communication-error-exception, "InvalidIdentityTokenException" :portkey.aws.sts.-2011-06-15/invalid-identity-token-exception, "ExpiredTokenException" :portkey.aws.sts.-2011-06-15/expired-token-exception, "RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef assume-role-with-web-identity :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/assume-role-with-web-identity-response))

(clojure.core/defn decode-authorization-message "Decodes additional information about the authorization status of a request from\nan encoded message returned in response to an AWS request.\n For example, if a user is not authorized to perform an action that he or she\nhas requested, the request returns a Client.UnauthorizedOperation response (an\nHTTP 403 response). Some AWS actions additionally return an encoded message that\ncan provide details about this authorization failure.\n Only certain AWS actions return an encoded authorization message. The\ndocumentation for an individual action indicates whether that action returns an\nencoded message in addition to returning an HTTP code.\n The message is encoded because the details of the authorization status can\nconstitute privileged information that the user who requested the action should\nnot see. To decode an authorization status message, a user must be granted\npermissions via an IAM policy to request the DecodeAuthorizationMessage\n(sts:DecodeAuthorizationMessage) action.\n The decoded message includes the following type of information:\n * Whether the request was denied due to an explicit deny or due to the absence\nof an explicit allow. For more information, see Determining Whether a Request is\nAllowed or Denied\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-denyallow)\nin the IAM User Guide.\n * The principal who made the request.\n * The requested action.\n * The requested resource.\n * The values of condition keys in the context of the user's request." ([decode-authorization-message-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-decode-authorization-message-request decode-authorization-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/decode-authorization-message-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/decode-authorization-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DecodeAuthorizationMessageResult", :http.request.configuration/action "DecodeAuthorizationMessage", :http.request.configuration/output-deser-fn response-decode-authorization-message-response, :http.request.spec/error-spec {"InvalidAuthorizationMessageException" :portkey.aws.sts.-2011-06-15/invalid-authorization-message-exception}})))))
(clojure.spec.alpha/fdef decode-authorization-message :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/decode-authorization-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/decode-authorization-message-response))

(clojure.core/defn get-caller-identity "Returns details about the IAM identity whose credentials are used to call the\nAPI." ([] (get-caller-identity {})) ([get-caller-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-caller-identity-request get-caller-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/get-caller-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/get-caller-identity-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetCallerIdentityResult", :http.request.configuration/action "GetCallerIdentity", :http.request.configuration/output-deser-fn response-get-caller-identity-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-caller-identity :args (clojure.spec.alpha/? :portkey.aws.sts.-2011-06-15/get-caller-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/get-caller-identity-response))

(clojure.core/defn get-federation-token "Returns a set of temporary security credentials (consisting of an access key ID,\na secret access key, and a security token) for a federated user. A typical use\nis in a proxy application that gets temporary security credentials on behalf of\ndistributed applications inside a corporate network. Because you must call the\nGetFederationToken action using the long-term security credentials of an IAM\nuser, this call is appropriate in contexts where those credentials can be safely\nstored, usually in a server-based application. For a comparison of\nGetFederationToken with the other APIs that produce temporary credentials, see\nRequesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n If you are creating a mobile-based or browser-based app that can authenticate\nusers using a web identity provider like Login with Amazon, Facebook, Google, or\nan OpenID Connect-compatible identity provider, we recommend that you use Amazon\nCognito (http://aws.amazon.com/cognito/) or AssumeRoleWithWebIdentity. For more\ninformation, see Federation Through a Web-based Identity Provider\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity).\n The GetFederationToken action must be called by using the long-term AWS\nsecurity credentials of an IAM user. You can also call GetFederationToken using\nthe security credentials of an AWS root account, but we do not recommended it.\nInstead, we recommend that you create an IAM user for the purpose of the proxy\napplication and then attach a policy to the IAM user that limits federated users\nto only the actions and resources that they need access to. For more\ninformation, see IAM Best Practices\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html) in the IAM\nUser Guide.\n The temporary security credentials that are obtained by using the long-term\ncredentials of an IAM user are valid for the specified duration, from 900\nseconds (15 minutes) up to a maximium of 129600 seconds (36 hours). The default\nis 43200 seconds (12 hours). Temporary credentials that are obtained by using\nAWS root account credentials have a maximum duration of 3600 seconds (1 hour).\n The temporary security credentials created by GetFederationToken can be used to\nmake API calls to any AWS service with the following exceptions:\n * You cannot use these credentials to call any IAM APIs.\n * You cannot call any STS APIs except GetCallerIdentity.\n Permissions\n The permissions for the temporary security credentials returned by\nGetFederationToken are determined by a combination of the following:\n * The policy or policies that are attached to the IAM user whose credentials\nare used to call GetFederationToken.\n * The policy that is passed as a parameter in the call.\n The passed policy is attached to the temporary security credentials that result\nfrom the GetFederationToken API call--that is, to the federated user. When the\nfederated user makes an AWS request, AWS evaluates the policy attached to the\nfederated user in combination with the policy or policies attached to the IAM\nuser whose credentials were used to call GetFederationToken. AWS allows the\nfederated user's request only when both the federated user and the IAM user are\nexplicitly allowed to perform the requested action. The passed policy cannot\ngrant more permissions than those that are defined in the IAM user policy.\n A typical use case is that the permissions of the IAM user whose credentials\nare used to call GetFederationToken are designed to allow access to all the\nactions and resources that any federated user will need. Then, for individual\nusers, you pass a policy to the operation that scopes down the permissions to a\nlevel that's appropriate to that individual user, using a policy that allows\nonly a subset of permissions that are granted to the IAM user.\n If you do not pass a policy, the resulting temporary security credentials have\nno effective permissions. The only exception is when the temporary security\ncredentials are used to access a resource that has a resource-based policy that\nspecifically allows the federated user to access the resource.\n For more information about how permissions work, see Permissions for\nGetFederationToken\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html).\nFor information about using GetFederationToken to create temporary security\ncredentials, see GetFederationToken—Federation Through a Custom Identity Broker\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken)." ([get-federation-token-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-federation-token-request get-federation-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/get-federation-token-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/get-federation-token-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetFederationTokenResult", :http.request.configuration/action "GetFederationToken", :http.request.configuration/output-deser-fn response-get-federation-token-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.sts.-2011-06-15/malformed-policy-document-exception, "PackedPolicyTooLargeException" :portkey.aws.sts.-2011-06-15/packed-policy-too-large-exception, "RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef get-federation-token :args (clojure.spec.alpha/tuple :portkey.aws.sts.-2011-06-15/get-federation-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/get-federation-token-response))

(clojure.core/defn get-session-token "Returns a set of temporary credentials for an AWS account or IAM user. The\ncredentials consist of an access key ID, a secret access key, and a security\ntoken. Typically, you use GetSessionToken if you want to use MFA to protect\nprogrammatic calls to specific AWS APIs like Amazon EC2 StopInstances.\nMFA-enabled IAM users would need to call GetSessionToken and submit an MFA code\nthat is associated with their MFA device. Using the temporary security\ncredentials that are returned from the call, IAM users can then make\nprogrammatic calls to APIs that require MFA authentication. If you do not supply\na correct MFA code, then the API returns an access denied error. For a\ncomparison of GetSessionToken with the other APIs that produce temporary\ncredentials, see Requesting Temporary Security Credentials\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html)\nand Comparing the AWS STS APIs\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison)\nin the IAM User Guide.\n The GetSessionToken action must be called by using the long-term AWS security\ncredentials of the AWS account or an IAM user. Credentials that are created by\nIAM users are valid for the duration that you specify, from 900 seconds (15\nminutes) up to a maximum of 129600 seconds (36 hours), with a default of 43200\nseconds (12 hours); credentials that are created by using account credentials\ncan range from 900 seconds (15 minutes) up to a maximum of 3600 seconds (1\nhour), with a default of 1 hour.\n The temporary security credentials created by GetSessionToken can be used to\nmake API calls to any AWS service with the following exceptions:\n * You cannot call any IAM APIs unless MFA authentication information is\nincluded in the request.\n * You cannot call any STS API except AssumeRole or GetCallerIdentity.\n We recommend that you do not call GetSessionToken with root account\ncredentials. Instead, follow our best practices\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users)\nby creating one or more IAM users, giving them the necessary permissions, and\nusing IAM users for everyday interaction with AWS.\n The permissions associated with the temporary security credentials returned by\nGetSessionToken are based on the permissions associated with account or IAM user\nwhose credentials are used to call the action. If GetSessionToken is called\nusing root account credentials, the temporary credentials have root account\npermissions. Similarly, if GetSessionToken is called using the credentials of an\nIAM user, the temporary credentials have the same permissions as the IAM user.\n For more information about using GetSessionToken to create temporary\ncredentials, go to Temporary Credentials for Users in Untrusted Environments\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken)\nin the IAM User Guide." ([] (get-session-token {})) ([get-session-token-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-session-token-request get-session-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sts.-2011-06-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sts.-2011-06-15/get-session-token-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-06-15", :http.request.configuration/service-id "STS", :http.request.spec/input-spec :portkey.aws.sts.-2011-06-15/get-session-token-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSessionTokenResult", :http.request.configuration/action "GetSessionToken", :http.request.configuration/output-deser-fn response-get-session-token-response, :http.request.spec/error-spec {"RegionDisabledException" :portkey.aws.sts.-2011-06-15/region-disabled-exception}})))))
(clojure.spec.alpha/fdef get-session-token :args (clojure.spec.alpha/? :portkey.aws.sts.-2011-06-15/get-session-token-request) :ret (clojure.spec.alpha/and :portkey.aws.sts.-2011-06-15/get-session-token-response))
