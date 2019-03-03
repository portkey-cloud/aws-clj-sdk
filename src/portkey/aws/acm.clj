(ns portkey.aws.acm (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "acm", :region "ap-northeast-1"},
    :ssl-common-name "acm.ap-northeast-1.amazonaws.com",
    :endpoint "https://acm.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "acm", :region "eu-west-1"},
    :ssl-common-name "acm.eu-west-1.amazonaws.com",
    :endpoint "https://acm.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "acm", :region "us-east-2"},
    :ssl-common-name "acm.us-east-2.amazonaws.com",
    :endpoint "https://acm.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "acm", :region "ap-southeast-2"},
    :ssl-common-name "acm.ap-southeast-2.amazonaws.com",
    :endpoint "https://acm.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "acm", :region "sa-east-1"},
    :ssl-common-name "acm.sa-east-1.amazonaws.com",
    :endpoint "https://acm.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "acm", :region "ap-southeast-1"},
    :ssl-common-name "acm.ap-southeast-1.amazonaws.com",
    :endpoint "https://acm.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "acm", :region "ap-northeast-2"},
    :ssl-common-name "acm.ap-northeast-2.amazonaws.com",
    :endpoint "https://acm.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "acm", :region "eu-west-3"},
    :ssl-common-name "acm.eu-west-3.amazonaws.com",
    :endpoint "https://acm.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "acm", :region "ca-central-1"},
    :ssl-common-name "acm.ca-central-1.amazonaws.com",
    :endpoint "https://acm.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "acm", :region "eu-central-1"},
    :ssl-common-name "acm.eu-central-1.amazonaws.com",
    :endpoint "https://acm.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "acm", :region "eu-west-2"},
    :ssl-common-name "acm.eu-west-2.amazonaws.com",
    :endpoint "https://acm.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "acm", :region "us-gov-west-1"},
    :ssl-common-name "acm.us-gov-west-1.amazonaws.com",
    :endpoint "https://acm.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "acm", :region "us-west-2"},
    :ssl-common-name "acm.us-west-2.amazonaws.com",
    :endpoint "https://acm.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "acm", :region "us-east-1"},
    :ssl-common-name "acm.us-east-1.amazonaws.com",
    :endpoint "https://acm.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "acm", :region "us-west-1"},
    :ssl-common-name "acm.us-west-1.amazonaws.com",
    :endpoint "https://acm.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "acm", :region "ap-south-1"},
    :ssl-common-name "acm.ap-south-1.amazonaws.com",
    :endpoint "https://acm.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-certificate-chain-blob)

(clojure.core/declare ser-private-key-blob)

(clojure.core/declare ser-key-usage-name)

(clojure.core/declare ser-extended-key-usage-name)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-domain-validation-option)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-certificate-transparency-logging-preference)

(clojure.core/declare ser-certificate-options)

(clojure.core/declare ser-domain-list)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-key-algorithm)

(clojure.core/declare ser-key-algorithm-list)

(clojure.core/declare ser-extended-key-usage-filter-list)

(clojure.core/declare ser-certificate-body-blob)

(clojure.core/declare ser-key-usage-filter-list)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-max-items)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-domain-name-string)

(clojure.core/declare ser-certificate-status)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-passphrase-blob)

(clojure.core/declare ser-validation-method)

(clojure.core/declare ser-domain-validation-option-list)

(clojure.core/declare ser-certificate-statuses)

(clojure.core/defn- ser-certificate-chain-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "CertificateChainBlob"})

(clojure.core/defn- ser-private-key-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "PrivateKeyBlob"})

(clojure.core/defn- ser-key-usage-name [input] #:http.request.field{:value (clojure.core/get {"CUSTOM" "CUSTOM", :crl-signing "CRL_SIGNING", :decipher-only "DECIPHER_ONLY", "KEY_ENCIPHERMENT" "KEY_ENCIPHERMENT", :custom "CUSTOM", :certificate-signing "CERTIFICATE_SIGNING", "CRL_SIGNING" "CRL_SIGNING", "CERTIFICATE_SIGNING" "CERTIFICATE_SIGNING", :key-agreement "KEY_AGREEMENT", "ANY" "ANY", :encipher-only "ENCIPHER_ONLY", :non-repudiation "NON_REPUDIATION", "KEY_AGREEMENT" "KEY_AGREEMENT", :digital-signature "DIGITAL_SIGNATURE", "NON_REPUDIATION" "NON_REPUDIATION", :data-encipherment "DATA_ENCIPHERMENT", "DECIPHER_ONLY" "DECIPHER_ONLY", :key-encipherment "KEY_ENCIPHERMENT", "DATA_ENCIPHERMENT" "DATA_ENCIPHERMENT", "ENCIPHER_ONLY" "ENCIPHER_ONLY", "DIGITAL_SIGNATURE" "DIGITAL_SIGNATURE", :any "ANY"} input), :shape "KeyUsageName"})

(clojure.core/defn- ser-extended-key-usage-name [input] #:http.request.field{:value (clojure.core/get {"TIME_STAMPING" "TIME_STAMPING", "CUSTOM" "CUSTOM", :code-signing "CODE_SIGNING", "OCSP_SIGNING" "OCSP_SIGNING", :tls-web-server-authentication "TLS_WEB_SERVER_AUTHENTICATION", "EMAIL_PROTECTION" "EMAIL_PROTECTION", :custom "CUSTOM", :time-stamping "TIME_STAMPING", :ipsec-tunnel "IPSEC_TUNNEL", :email-protection "EMAIL_PROTECTION", "NONE" "NONE", "ANY" "ANY", :ipsec-user "IPSEC_USER", "TLS_WEB_CLIENT_AUTHENTICATION" "TLS_WEB_CLIENT_AUTHENTICATION", :ocsp-signing "OCSP_SIGNING", "TLS_WEB_SERVER_AUTHENTICATION" "TLS_WEB_SERVER_AUTHENTICATION", :tls-web-client-authentication "TLS_WEB_CLIENT_AUTHENTICATION", "IPSEC_TUNNEL" "IPSEC_TUNNEL", "IPSEC_END_SYSTEM" "IPSEC_END_SYSTEM", "CODE_SIGNING" "CODE_SIGNING", "IPSEC_USER" "IPSEC_USER", :none "NONE", :any "ANY", :ipsec-end-system "IPSEC_END_SYSTEM"} input), :shape "ExtendedKeyUsageName"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-domain-validation-option [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-domain-name-string (:domain-name input)) #:http.request.field{:name "DomainName", :shape "DomainNameString"}) (clojure.core/into (ser-domain-name-string (:validation-domain input)) #:http.request.field{:name "ValidationDomain", :shape "DomainNameString"})], :shape "DomainValidationOption", :type "structure"}))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-certificate-transparency-logging-preference [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "CertificateTransparencyLoggingPreference"})

(clojure.core/defn- ser-certificate-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CertificateOptions", :type "structure"} (clojure.core/contains? input :certificate-transparency-logging-preference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-transparency-logging-preference (input :certificate-transparency-logging-preference)) #:http.request.field{:name "CertificateTransparencyLoggingPreference", :shape "CertificateTransparencyLoggingPreference"}))))

(clojure.core/defn- ser-domain-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain-name-string coll) #:http.request.field{:shape "DomainNameString"}))) input), :shape "DomainList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-key-algorithm [input] #:http.request.field{:value (clojure.core/get {:rsa-1024 "RSA_1024", :ec-secp-384r-1 "EC_secp384r1", :ec-secp-521r-1 "EC_secp521r1", :ec-prime-256v-1 "EC_prime256v1", "EC_secp521r1" "EC_secp521r1", "RSA_4096" "RSA_4096", "EC_prime256v1" "EC_prime256v1", :rsa-4096 "RSA_4096", "EC_secp384r1" "EC_secp384r1", "RSA_2048" "RSA_2048", :rsa-2048 "RSA_2048", "RSA_1024" "RSA_1024"} input), :shape "KeyAlgorithm"})

(clojure.core/defn- ser-key-algorithm-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key-algorithm coll) #:http.request.field{:shape "KeyAlgorithm"}))) input), :shape "KeyAlgorithmList", :type "list"})

(clojure.core/defn- ser-extended-key-usage-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-extended-key-usage-name coll) #:http.request.field{:shape "ExtendedKeyUsageName"}))) input), :shape "ExtendedKeyUsageFilterList", :type "list"})

(clojure.core/defn- ser-certificate-body-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "CertificateBodyBlob"})

(clojure.core/defn- ser-key-usage-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key-usage-name coll) #:http.request.field{:shape "KeyUsageName"}))) input), :shape "KeyUsageFilterList", :type "list"})

(clojure.core/defn- ser-filters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Filters", :type "structure"} (clojure.core/contains? input :extended-key-usage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extended-key-usage-filter-list (input :extended-key-usage)) #:http.request.field{:name "extendedKeyUsage", :shape "ExtendedKeyUsageFilterList"})) (clojure.core/contains? input :key-usage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-usage-filter-list (input :key-usage)) #:http.request.field{:name "keyUsage", :shape "KeyUsageFilterList"})) (clojure.core/contains? input :key-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-algorithm-list (input :key-types)) #:http.request.field{:name "keyTypes", :shape "KeyAlgorithmList"}))))

(clojure.core/defn- ser-max-items [input] #:http.request.field{:value input, :shape "MaxItems"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-domain-name-string [input] #:http.request.field{:value input, :shape "DomainNameString"})

(clojure.core/defn- ser-certificate-status [input] #:http.request.field{:value (clojure.core/get {:inactive "INACTIVE", :pending-validation "PENDING_VALIDATION", "REVOKED" "REVOKED", "EXPIRED" "EXPIRED", "ISSUED" "ISSUED", :revoked "REVOKED", "INACTIVE" "INACTIVE", "FAILED" "FAILED", "PENDING_VALIDATION" "PENDING_VALIDATION", :expired "EXPIRED", :issued "ISSUED", "VALIDATION_TIMED_OUT" "VALIDATION_TIMED_OUT", :validation-timed-out "VALIDATION_TIMED_OUT", :failed "FAILED"} input), :shape "CertificateStatus"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-passphrase-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "PassphraseBlob"})

(clojure.core/defn- ser-validation-method [input] #:http.request.field{:value (clojure.core/get {"EMAIL" "EMAIL", :email "EMAIL", "DNS" "DNS", :dns "DNS"} input), :shape "ValidationMethod"})

(clojure.core/defn- ser-domain-validation-option-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain-validation-option coll) #:http.request.field{:shape "DomainValidationOption"}))) input), :shape "DomainValidationOptionList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-certificate-statuses [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-certificate-status coll) #:http.request.field{:shape "CertificateStatus"}))) input), :shape "CertificateStatuses", :type "list"})

(clojure.core/defn- req-list-certificates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :certificate-statuses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-statuses (input :certificate-statuses)) #:http.request.field{:name "CertificateStatuses", :shape "CertificateStatuses"})) (clojure.core/contains? input :includes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :includes)) #:http.request.field{:name "Includes", :shape "Filters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems"}))))

(clojure.core/defn- req-update-certificate-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"}) (clojure.core/into (ser-certificate-options (input :options)) #:http.request.field{:name "Options", :shape "CertificateOptions"})]}))

(clojure.core/defn- req-describe-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"})]}))

(clojure.core/defn- req-remove-tags-from-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-request-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainNameString"})]} (clojure.core/contains? input :validation-method) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-validation-method (input :validation-method)) #:http.request.field{:name "ValidationMethod", :shape "ValidationMethod"})) (clojure.core/contains? input :subject-alternative-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-list (input :subject-alternative-names)) #:http.request.field{:name "SubjectAlternativeNames", :shape "DomainList"})) (clojure.core/contains? input :idempotency-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken"})) (clojure.core/contains? input :domain-validation-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-validation-option-list (input :domain-validation-options)) #:http.request.field{:name "DomainValidationOptions", :shape "DomainValidationOptionList"})) (clojure.core/contains? input :options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-options (input :options)) #:http.request.field{:name "Options", :shape "CertificateOptions"})) (clojure.core/contains? input :certificate-authority-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}))))

(clojure.core/defn- req-delete-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"})]}))

(clojure.core/defn- req-resend-validation-email-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"}) (clojure.core/into (ser-domain-name-string (input :domain)) #:http.request.field{:name "Domain", :shape "DomainNameString"}) (clojure.core/into (ser-domain-name-string (input :validation-domain)) #:http.request.field{:name "ValidationDomain", :shape "DomainNameString"})]}))

(clojure.core/defn- req-list-tags-for-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"})]}))

(clojure.core/defn- req-add-tags-to-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-import-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-certificate-body-blob (input :certificate)) #:http.request.field{:name "Certificate", :shape "CertificateBodyBlob"}) (clojure.core/into (ser-private-key-blob (input :private-key)) #:http.request.field{:name "PrivateKey", :shape "PrivateKeyBlob"})]} (clojure.core/contains? input :certificate-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"})) (clojure.core/contains? input :certificate-chain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-chain-blob (input :certificate-chain)) #:http.request.field{:name "CertificateChain", :shape "CertificateChainBlob"}))))

(clojure.core/defn- req-get-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"})]}))

(clojure.core/defn- req-export-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"}) (clojure.core/into (ser-passphrase-blob (input :passphrase)) #:http.request.field{:name "Passphrase", :shape "PassphraseBlob"})]}))

(clojure.core/declare deser-renewal-status)

(clojure.core/declare deser-key-usage-list)

(clojure.core/declare deser-key-usage-name)

(clojure.core/declare deser-private-key)

(clojure.core/declare deser-in-use-list)

(clojure.core/declare deser-domain-validation-list)

(clojure.core/declare deser-domain-validation)

(clojure.core/declare deser-extended-key-usage)

(clojure.core/declare deser-extended-key-usage-name)

(clojure.core/declare deser-key-usage)

(clojure.core/declare deser-extended-key-usage-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-certificate-detail)

(clojure.core/declare deser-certificate-transparency-logging-preference)

(clojure.core/declare deser-certificate-type)

(clojure.core/declare deser-domain-status)

(clojure.core/declare deser-certificate-options)

(clojure.core/declare deser-domain-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-certificate-chain)

(clojure.core/declare deser-key-algorithm)

(clojure.core/declare deser-failure-reason)

(clojure.core/declare deser-renewal-summary)

(clojure.core/declare deser-string)

(clojure.core/declare deser-record-type)

(clojure.core/declare deser-renewal-eligibility)

(clojure.core/declare deser-t-stamp)

(clojure.core/declare deser-revocation-reason)

(clojure.core/declare deser-resource-record)

(clojure.core/declare deser-certificate-summary-list)

(clojure.core/declare deser-certificate-summary)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-validation-email-list)

(clojure.core/declare deser-domain-name-string)

(clojure.core/declare deser-certificate-status)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-certificate-body)

(clojure.core/declare deser-validation-method)

(clojure.core/defn- deser-renewal-status [input] (clojure.core/get {"PENDING_AUTO_RENEWAL" :pending-auto-renewal, "PENDING_VALIDATION" :pending-validation, "SUCCESS" :success, "FAILED" :failed} input))

(clojure.core/defn- deser-key-usage-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-usage coll))) input))

(clojure.core/defn- deser-key-usage-name [input] (clojure.core/get {"CUSTOM" :custom, "KEY_ENCIPHERMENT" :key-encipherment, "CRL_SIGNING" :crl-signing, "CERTIFICATE_SIGNING" :certificate-signing, "ANY" :any, "KEY_AGREEMENT" :key-agreement, "NON_REPUDIATION" :non-repudiation, "DECIPHER_ONLY" :decipher-only, "DATA_ENCIPHERMENT" :data-encipherment, "ENCIPHER_ONLY" :encipher-only, "DIGITAL_SIGNATURE" :digital-signature} input))

(clojure.core/defn- deser-private-key [input] input)

(clojure.core/defn- deser-in-use-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-domain-validation-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-validation coll))) input))

(clojure.core/defn- deser-domain-validation [input] (clojure.core/cond-> {:domain-name (deser-domain-name-string (input "DomainName"))} (clojure.core/contains? input "ValidationEmails") (clojure.core/assoc :validation-emails (deser-validation-email-list (input "ValidationEmails"))) (clojure.core/contains? input "ValidationDomain") (clojure.core/assoc :validation-domain (deser-domain-name-string (input "ValidationDomain"))) (clojure.core/contains? input "ValidationStatus") (clojure.core/assoc :validation-status (deser-domain-status (input "ValidationStatus"))) (clojure.core/contains? input "ResourceRecord") (clojure.core/assoc :resource-record (deser-resource-record (input "ResourceRecord"))) (clojure.core/contains? input "ValidationMethod") (clojure.core/assoc :validation-method (deser-validation-method (input "ValidationMethod")))))

(clojure.core/defn- deser-extended-key-usage [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-extended-key-usage-name (input "Name"))) (clojure.core/contains? input "OID") (clojure.core/assoc :oid (deser-string (input "OID")))))

(clojure.core/defn- deser-extended-key-usage-name [input] (clojure.core/get {"TIME_STAMPING" :time-stamping, "CUSTOM" :custom, "OCSP_SIGNING" :ocsp-signing, "EMAIL_PROTECTION" :email-protection, "NONE" :none, "ANY" :any, "TLS_WEB_CLIENT_AUTHENTICATION" :tls-web-client-authentication, "TLS_WEB_SERVER_AUTHENTICATION" :tls-web-server-authentication, "IPSEC_TUNNEL" :ipsec-tunnel, "IPSEC_END_SYSTEM" :ipsec-end-system, "CODE_SIGNING" :code-signing, "IPSEC_USER" :ipsec-user} input))

(clojure.core/defn- deser-key-usage [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-key-usage-name (input "Name")))))

(clojure.core/defn- deser-extended-key-usage-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-extended-key-usage coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-certificate-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Serial") (clojure.core/assoc :serial (deser-string (input "Serial"))) (clojure.core/contains? input "IssuedAt") (clojure.core/assoc :issued-at (deser-t-stamp (input "IssuedAt"))) (clojure.core/contains? input "DomainValidationOptions") (clojure.core/assoc :domain-validation-options (deser-domain-validation-list (input "DomainValidationOptions"))) (clojure.core/contains? input "SignatureAlgorithm") (clojure.core/assoc :signature-algorithm (deser-string (input "SignatureAlgorithm"))) (clojure.core/contains? input "NotBefore") (clojure.core/assoc :not-before (deser-t-stamp (input "NotBefore"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-certificate-type (input "Type"))) (clojure.core/contains? input "RevokedAt") (clojure.core/assoc :revoked-at (deser-t-stamp (input "RevokedAt"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-certificate-status (input "Status"))) (clojure.core/contains? input "ImportedAt") (clojure.core/assoc :imported-at (deser-t-stamp (input "ImportedAt"))) (clojure.core/contains? input "SubjectAlternativeNames") (clojure.core/assoc :subject-alternative-names (deser-domain-list (input "SubjectAlternativeNames"))) (clojure.core/contains? input "Subject") (clojure.core/assoc :subject (deser-string (input "Subject"))) (clojure.core/contains? input "KeyAlgorithm") (clojure.core/assoc :key-algorithm (deser-key-algorithm (input "KeyAlgorithm"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "RenewalSummary") (clojure.core/assoc :renewal-summary (deser-renewal-summary (input "RenewalSummary"))) (clojure.core/contains? input "Issuer") (clojure.core/assoc :issuer (deser-string (input "Issuer"))) (clojure.core/contains? input "RenewalEligibility") (clojure.core/assoc :renewal-eligibility (deser-renewal-eligibility (input "RenewalEligibility"))) (clojure.core/contains? input "InUseBy") (clojure.core/assoc :in-use-by (deser-in-use-list (input "InUseBy"))) (clojure.core/contains? input "RevocationReason") (clojure.core/assoc :revocation-reason (deser-revocation-reason (input "RevocationReason"))) (clojure.core/contains? input "NotAfter") (clojure.core/assoc :not-after (deser-t-stamp (input "NotAfter"))) (clojure.core/contains? input "CertificateArn") (clojure.core/assoc :certificate-arn (deser-arn (input "CertificateArn"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-t-stamp (input "CreatedAt"))) (clojure.core/contains? input "ExtendedKeyUsages") (clojure.core/assoc :extended-key-usages (deser-extended-key-usage-list (input "ExtendedKeyUsages"))) (clojure.core/contains? input "DomainName") (clojure.core/assoc :domain-name (deser-domain-name-string (input "DomainName"))) (clojure.core/contains? input "CertificateAuthorityArn") (clojure.core/assoc :certificate-authority-arn (deser-arn (input "CertificateAuthorityArn"))) (clojure.core/contains? input "Options") (clojure.core/assoc :options (deser-certificate-options (input "Options"))) (clojure.core/contains? input "KeyUsages") (clojure.core/assoc :key-usages (deser-key-usage-list (input "KeyUsages")))))

(clojure.core/defn- deser-certificate-transparency-logging-preference [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-certificate-type [input] (clojure.core/get {"IMPORTED" :imported, "AMAZON_ISSUED" :amazon-issued, "PRIVATE" :private} input))

(clojure.core/defn- deser-domain-status [input] (clojure.core/get {"PENDING_VALIDATION" :pending-validation, "SUCCESS" :success, "FAILED" :failed} input))

(clojure.core/defn- deser-certificate-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "CertificateTransparencyLoggingPreference") (clojure.core/assoc :certificate-transparency-logging-preference (deser-certificate-transparency-logging-preference (input "CertificateTransparencyLoggingPreference")))))

(clojure.core/defn- deser-domain-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-name-string coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-certificate-chain [input] input)

(clojure.core/defn- deser-key-algorithm [input] (clojure.core/get {"RSA_2048" :rsa-2048, "RSA_1024" :rsa-1024, "RSA_4096" :rsa-4096, "EC_prime256v1" :ec-prime-256v-1, "EC_secp384r1" :ec-secp-384r-1, "EC_secp521r1" :ec-secp-521r-1} input))

(clojure.core/defn- deser-failure-reason [input] (clojure.core/get {"PCA_LIMIT_EXCEEDED" :pca-limit-exceeded, "INVALID_PUBLIC_DOMAIN" :invalid-public-domain, "PCA_INVALID_ARN" :pca-invalid-arn, "ADDITIONAL_VERIFICATION_REQUIRED" :additional-verification-required, "PCA_INVALID_ARGS" :pca-invalid-args, "OTHER" :other, "PCA_REQUEST_FAILED" :pca-request-failed, "PCA_INVALID_STATE" :pca-invalid-state, "PCA_RESOURCE_NOT_FOUND" :pca-resource-not-found, "DOMAIN_NOT_ALLOWED" :domain-not-allowed, "CAA_ERROR" :caa-error, "NO_AVAILABLE_CONTACTS" :no-available-contacts} input))

(clojure.core/defn- deser-renewal-summary [input] (clojure.core/cond-> {:renewal-status (deser-renewal-status (input "RenewalStatus")), :domain-validation-options (deser-domain-validation-list (input "DomainValidationOptions"))}))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-record-type [input] (clojure.core/get {"CNAME" :cname} input))

(clojure.core/defn- deser-renewal-eligibility [input] (clojure.core/get {"ELIGIBLE" :eligible, "INELIGIBLE" :ineligible} input))

(clojure.core/defn- deser-t-stamp [input] input)

(clojure.core/defn- deser-revocation-reason [input] (clojure.core/get {"PRIVILEGE_WITHDRAWN" :privilege-withdrawn, "CERTIFICATE_HOLD" :certificate-hold, "REMOVE_FROM_CRL" :remove-from-crl, "AFFILIATION_CHANGED" :affiliation-changed, "SUPERCEDED" :superceded, "KEY_COMPROMISE" :key-compromise, "UNSPECIFIED" :unspecified, "CA_COMPROMISE" :ca-compromise, "CESSATION_OF_OPERATION" :cessation-of-operation, "A_A_COMPROMISE" :a-a-compromise} input))

(clojure.core/defn- deser-resource-record [input] (clojure.core/cond-> {:name (deser-string (input "Name")), :type (deser-record-type (input "Type")), :value (deser-string (input "Value"))}))

(clojure.core/defn- deser-certificate-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-certificate-summary coll))) input))

(clojure.core/defn- deser-certificate-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "CertificateArn") (clojure.core/assoc :certificate-arn (deser-arn (input "CertificateArn"))) (clojure.core/contains? input "DomainName") (clojure.core/assoc :domain-name (deser-domain-name-string (input "DomainName")))))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-validation-email-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-domain-name-string [input] input)

(clojure.core/defn- deser-certificate-status [input] (clojure.core/get {"PENDING_VALIDATION" :pending-validation, "ISSUED" :issued, "INACTIVE" :inactive, "EXPIRED" :expired, "VALIDATION_TIMED_OUT" :validation-timed-out, "REVOKED" :revoked, "FAILED" :failed} input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key"))} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-certificate-body [input] input)

(clojure.core/defn- deser-validation-method [input] (clojure.core/get {"EMAIL" :email, "DNS" :dns} input))

(clojure.core/defn- deser-get-certificate-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Certificate") (clojure.core/assoc :certificate (deser-certificate-body (input "Certificate"))) (clojure.core/contains? input "CertificateChain") (clojure.core/assoc :certificate-chain (deser-certificate-chain (input "CertificateChain")))))

(clojure.core/defn- deser-import-certificate-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CertificateArn") (clojure.core/assoc :certificate-arn (deser-arn (input "CertificateArn")))))

(clojure.core/defn- deser-request-certificate-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CertificateArn") (clojure.core/assoc :certificate-arn (deser-arn (input "CertificateArn")))))

(clojure.core/defn- deser-list-certificates-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken"))) (clojure.core/contains? input "CertificateSummaryList") (clojure.core/assoc :certificate-summary-list (deser-certificate-summary-list (input "CertificateSummaryList")))))

(clojure.core/defn- deser-resource-in-use-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-invalid-arn-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-invalid-tag-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-invalid-domain-validation-options-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-request-in-progress-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-resource-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-too-many-tags-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-describe-certificate-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Certificate") (clojure.core/assoc :certificate (deser-certificate-detail (input "Certificate")))))

(clojure.core/defn- deser-invalid-state-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-list-tags-for-certificate-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags")))))

(clojure.core/defn- deser-export-certificate-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Certificate") (clojure.core/assoc :certificate (deser-certificate-body (input "Certificate"))) (clojure.core/contains? input "CertificateChain") (clojure.core/assoc :certificate-chain (deser-certificate-chain (input "CertificateChain"))) (clojure.core/contains? input "PrivateKey") (clojure.core/assoc :private-key (deser-private-key (input "PrivateKey")))))

(clojure.spec.alpha/def :portkey.aws.acm.get-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.acm/certificate-body))
(clojure.spec.alpha/def :portkey.aws.acm/get-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.get-certificate-response/certificate :portkey.aws.acm/certificate-chain]))

(clojure.spec.alpha/def :portkey.aws.acm/renewal-status #{"SUCCESS" :pending-validation :pending-auto-renewal "PENDING_AUTO_RENEWAL" :success "FAILED" "PENDING_VALIDATION" :failed})

(clojure.spec.alpha/def :portkey.aws.acm/certificate-chain-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm/key-usage-list (clojure.spec.alpha/coll-of :portkey.aws.acm/key-usage))

(clojure.spec.alpha/def :portkey.aws.acm/private-key-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm/key-usage-name #{"CUSTOM" :crl-signing :decipher-only "KEY_ENCIPHERMENT" :custom :certificate-signing "CRL_SIGNING" "CERTIFICATE_SIGNING" :key-agreement "ANY" :encipher-only :non-repudiation "KEY_AGREEMENT" :digital-signature "NON_REPUDIATION" :data-encipherment "DECIPHER_ONLY" :key-encipherment "DATA_ENCIPHERMENT" "ENCIPHER_ONLY" "DIGITAL_SIGNATURE" :any})

(clojure.spec.alpha/def :portkey.aws.acm/private-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 524288)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"-{5}BEGIN PRIVATE KEY-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END PRIVATE KEY-{5}(\u000D?\u000A)?" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm/in-use-list (clojure.spec.alpha/coll-of :portkey.aws.acm/string))

(clojure.spec.alpha/def :portkey.aws.acm.import-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm/import-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.import-certificate-response/certificate-arn]))

(clojure.spec.alpha/def :portkey.aws.acm.request-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm/request-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.request-certificate-response/certificate-arn]))

(clojure.spec.alpha/def :portkey.aws.acm/domain-validation-list (clojure.spec.alpha/coll-of :portkey.aws.acm/domain-validation :min-count 1 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.acm.domain-validation/domain-name (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm.domain-validation/validation-emails (clojure.spec.alpha/and :portkey.aws.acm/validation-email-list))
(clojure.spec.alpha/def :portkey.aws.acm.domain-validation/validation-domain (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm.domain-validation/validation-status (clojure.spec.alpha/and :portkey.aws.acm/domain-status))
(clojure.spec.alpha/def :portkey.aws.acm/domain-validation (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.domain-validation/domain-name] :opt-un [:portkey.aws.acm.domain-validation/validation-emails :portkey.aws.acm.domain-validation/validation-domain :portkey.aws.acm.domain-validation/validation-status :portkey.aws.acm/resource-record :portkey.aws.acm/validation-method]))

(clojure.spec.alpha/def :portkey.aws.acm.extended-key-usage/name (clojure.spec.alpha/and :portkey.aws.acm/extended-key-usage-name))
(clojure.spec.alpha/def :portkey.aws.acm.extended-key-usage/oid (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/extended-key-usage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.extended-key-usage/name :portkey.aws.acm.extended-key-usage/oid]))

(clojure.spec.alpha/def :portkey.aws.acm/list-certificates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm/next-token :portkey.aws.acm/certificate-summary-list]))

(clojure.spec.alpha/def :portkey.aws.acm/extended-key-usage-name #{"TIME_STAMPING" "CUSTOM" :code-signing "OCSP_SIGNING" :tls-web-server-authentication "EMAIL_PROTECTION" :custom :time-stamping :ipsec-tunnel :email-protection "NONE" "ANY" :ipsec-user "TLS_WEB_CLIENT_AUTHENTICATION" :ocsp-signing "TLS_WEB_SERVER_AUTHENTICATION" :tls-web-client-authentication "IPSEC_TUNNEL" "IPSEC_END_SYSTEM" "CODE_SIGNING" "IPSEC_USER" :none :any :ipsec-end-system})

(clojure.spec.alpha/def :portkey.aws.acm.list-certificates-request/includes (clojure.spec.alpha/and :portkey.aws.acm/filters))
(clojure.spec.alpha/def :portkey.aws.acm/list-certificates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm/certificate-statuses :portkey.aws.acm.list-certificates-request/includes :portkey.aws.acm/next-token :portkey.aws.acm/max-items]))

(clojure.spec.alpha/def :portkey.aws.acm.update-certificate-options-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.update-certificate-options-request/options (clojure.spec.alpha/and :portkey.aws.acm/certificate-options))
(clojure.spec.alpha/def :portkey.aws.acm/update-certificate-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.update-certificate-options-request/certificate-arn :portkey.aws.acm.update-certificate-options-request/options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm.describe-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm/describe-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.describe-certificate-request/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm.key-usage/name (clojure.spec.alpha/and :portkey.aws.acm/key-usage-name))
(clojure.spec.alpha/def :portkey.aws.acm/key-usage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.key-usage/name]))

(clojure.spec.alpha/def :portkey.aws.acm/extended-key-usage-list (clojure.spec.alpha/coll-of :portkey.aws.acm/extended-key-usage))

(clojure.spec.alpha/def :portkey.aws.acm/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\p{L}\p{Z}\p{N}_.:\/=+\-@]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm.domain-validation-option/domain-name (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm.domain-validation-option/validation-domain (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm/domain-validation-option (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.domain-validation-option/domain-name :portkey.aws.acm.domain-validation-option/validation-domain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 320)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm.remove-tags-from-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.remove-tags-from-certificate-request/tags (clojure.spec.alpha/and :portkey.aws.acm/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm/remove-tags-from-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.remove-tags-from-certificate-request/certificate-arn :portkey.aws.acm.remove-tags-from-certificate-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/serial (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/issued-at (clojure.spec.alpha/and :portkey.aws.acm/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/domain-validation-options (clojure.spec.alpha/and :portkey.aws.acm/domain-validation-list))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/signature-algorithm (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/not-before (clojure.spec.alpha/and :portkey.aws.acm/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/type (clojure.spec.alpha/and :portkey.aws.acm/certificate-type))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/revoked-at (clojure.spec.alpha/and :portkey.aws.acm/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/status (clojure.spec.alpha/and :portkey.aws.acm/certificate-status))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/imported-at (clojure.spec.alpha/and :portkey.aws.acm/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/subject-alternative-names (clojure.spec.alpha/and :portkey.aws.acm/domain-list))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/subject (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/issuer (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/in-use-by (clojure.spec.alpha/and :portkey.aws.acm/in-use-list))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/not-after (clojure.spec.alpha/and :portkey.aws.acm/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/created-at (clojure.spec.alpha/and :portkey.aws.acm/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/extended-key-usages (clojure.spec.alpha/and :portkey.aws.acm/extended-key-usage-list))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/domain-name (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/options (clojure.spec.alpha/and :portkey.aws.acm/certificate-options))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-detail/key-usages (clojure.spec.alpha/and :portkey.aws.acm/key-usage-list))
(clojure.spec.alpha/def :portkey.aws.acm/certificate-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.certificate-detail/serial :portkey.aws.acm.certificate-detail/issued-at :portkey.aws.acm.certificate-detail/domain-validation-options :portkey.aws.acm.certificate-detail/signature-algorithm :portkey.aws.acm.certificate-detail/not-before :portkey.aws.acm.certificate-detail/type :portkey.aws.acm.certificate-detail/revoked-at :portkey.aws.acm.certificate-detail/status :portkey.aws.acm.certificate-detail/imported-at :portkey.aws.acm.certificate-detail/subject-alternative-names :portkey.aws.acm.certificate-detail/subject :portkey.aws.acm/key-algorithm :portkey.aws.acm/failure-reason :portkey.aws.acm/renewal-summary :portkey.aws.acm.certificate-detail/issuer :portkey.aws.acm/renewal-eligibility :portkey.aws.acm.certificate-detail/in-use-by :portkey.aws.acm/revocation-reason :portkey.aws.acm.certificate-detail/not-after :portkey.aws.acm.certificate-detail/certificate-arn :portkey.aws.acm.certificate-detail/created-at :portkey.aws.acm.certificate-detail/extended-key-usages :portkey.aws.acm.certificate-detail/domain-name :portkey.aws.acm.certificate-detail/certificate-authority-arn :portkey.aws.acm.certificate-detail/options :portkey.aws.acm.certificate-detail/key-usages]))

(clojure.spec.alpha/def :portkey.aws.acm/certificate-transparency-logging-preference #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.acm/certificate-type #{"AMAZON_ISSUED" :imported :amazon-issued :private "IMPORTED" "PRIVATE"})

(clojure.spec.alpha/def :portkey.aws.acm/domain-status #{"SUCCESS" :pending-validation :success "FAILED" "PENDING_VALIDATION" :failed})

(clojure.spec.alpha/def :portkey.aws.acm.invalid-arn-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/invalid-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.invalid-arn-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm/certificate-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm/certificate-transparency-logging-preference]))

(clojure.spec.alpha/def :portkey.aws.acm/domain-list (clojure.spec.alpha/coll-of :portkey.aws.acm/domain-name-string :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.acm/tag-list (clojure.spec.alpha/coll-of :portkey.aws.acm/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.acm.request-certificate-request/domain-name (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm.request-certificate-request/subject-alternative-names (clojure.spec.alpha/and :portkey.aws.acm/domain-list))
(clojure.spec.alpha/def :portkey.aws.acm.request-certificate-request/domain-validation-options (clojure.spec.alpha/and :portkey.aws.acm/domain-validation-option-list))
(clojure.spec.alpha/def :portkey.aws.acm.request-certificate-request/options (clojure.spec.alpha/and :portkey.aws.acm/certificate-options))
(clojure.spec.alpha/def :portkey.aws.acm.request-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm/request-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.request-certificate-request/domain-name] :opt-un [:portkey.aws.acm/validation-method :portkey.aws.acm.request-certificate-request/subject-alternative-names :portkey.aws.acm/idempotency-token :portkey.aws.acm.request-certificate-request/domain-validation-options :portkey.aws.acm.request-certificate-request/options :portkey.aws.acm.request-certificate-request/certificate-authority-arn]))

(clojure.spec.alpha/def :portkey.aws.acm.invalid-tag-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.invalid-tag-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm.invalid-domain-validation-options-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/invalid-domain-validation-options-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.invalid-domain-validation-options-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm.request-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/request-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.request-in-progress-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm.delete-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm/delete-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.delete-certificate-request/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm.resend-validation-email-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.resend-validation-email-request/domain (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm.resend-validation-email-request/validation-domain (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm/resend-validation-email-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.resend-validation-email-request/certificate-arn :portkey.aws.acm.resend-validation-email-request/domain :portkey.aws.acm.resend-validation-email-request/validation-domain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\p{L}\p{Z}\p{N}_.:\/=+\-@]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm/certificate-chain (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2097152)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"(-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}\u000D?\u000A)*-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}(\u000D?\u000A)?" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm/key-algorithm #{:rsa-1024 :ec-secp-384r-1 :ec-secp-521r-1 :ec-prime-256v-1 "EC_secp521r1" "RSA_4096" "EC_prime256v1" :rsa-4096 "EC_secp384r1" "RSA_2048" :rsa-2048 "RSA_1024"})

(clojure.spec.alpha/def :portkey.aws.acm/key-algorithm-list (clojure.spec.alpha/coll-of :portkey.aws.acm/key-algorithm))

(clojure.spec.alpha/def :portkey.aws.acm/extended-key-usage-filter-list (clojure.spec.alpha/coll-of :portkey.aws.acm/extended-key-usage-name))

(clojure.spec.alpha/def :portkey.aws.acm/failure-reason #{:pca-invalid-args "PCA_LIMIT_EXCEEDED" :pca-limit-exceeded :no-available-contacts "INVALID_PUBLIC_DOMAIN" :other "PCA_INVALID_ARN" "ADDITIONAL_VERIFICATION_REQUIRED" :additional-verification-required "PCA_INVALID_ARGS" :pca-resource-not-found :domain-not-allowed :caa-error "OTHER" "PCA_REQUEST_FAILED" "PCA_INVALID_STATE" "PCA_RESOURCE_NOT_FOUND" :pca-invalid-state "DOMAIN_NOT_ALLOWED" :pca-invalid-arn :pca-request-failed :invalid-public-domain "CAA_ERROR" "NO_AVAILABLE_CONTACTS"})

(clojure.spec.alpha/def :portkey.aws.acm.list-tags-for-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm/list-tags-for-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.list-tags-for-certificate-request/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm/certificate-body-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm/key-usage-filter-list (clojure.spec.alpha/coll-of :portkey.aws.acm/key-usage-name))

(clojure.spec.alpha/def :portkey.aws.acm.renewal-summary/domain-validation-options (clojure.spec.alpha/and :portkey.aws.acm/domain-validation-list))
(clojure.spec.alpha/def :portkey.aws.acm/renewal-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.acm/renewal-status :portkey.aws.acm.renewal-summary/domain-validation-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm/record-type #{"CNAME" :cname})

(clojure.spec.alpha/def :portkey.aws.acm/renewal-eligibility #{:eligible "INELIGIBLE" "ELIGIBLE" :ineligible})

(clojure.spec.alpha/def :portkey.aws.acm.too-many-tags-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.too-many-tags-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm.describe-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.acm/certificate-detail))
(clojure.spec.alpha/def :portkey.aws.acm/describe-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.describe-certificate-response/certificate]))

(clojure.spec.alpha/def :portkey.aws.acm/t-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.acm/revocation-reason #{"PRIVILEGE_WITHDRAWN" :privilege-withdrawn :unspecified "CERTIFICATE_HOLD" :ca-compromise "REMOVE_FROM_CRL" "AFFILIATION_CHANGED" :remove-from-crl "SUPERCEDED" "KEY_COMPROMISE" :key-compromise :a-a-compromise :superceded "UNSPECIFIED" :cessation-of-operation "CA_COMPROMISE" "CESSATION_OF_OPERATION" "A_A_COMPROMISE" :affiliation-changed :certificate-hold})

(clojure.spec.alpha/def :portkey.aws.acm.resource-record/name (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm.resource-record/type (clojure.spec.alpha/and :portkey.aws.acm/record-type))
(clojure.spec.alpha/def :portkey.aws.acm.resource-record/value (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/resource-record (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.resource-record/name :portkey.aws.acm.resource-record/type :portkey.aws.acm.resource-record/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm.add-tags-to-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.add-tags-to-certificate-request/tags (clojure.spec.alpha/and :portkey.aws.acm/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm/add-tags-to-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.add-tags-to-certificate-request/certificate-arn :portkey.aws.acm.add-tags-to-certificate-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm/certificate-summary-list (clojure.spec.alpha/coll-of :portkey.aws.acm/certificate-summary))

(clojure.spec.alpha/def :portkey.aws.acm.filters/extended-key-usage (clojure.spec.alpha/and :portkey.aws.acm/extended-key-usage-filter-list))
(clojure.spec.alpha/def :portkey.aws.acm.filters/key-usage (clojure.spec.alpha/and :portkey.aws.acm/key-usage-filter-list))
(clojure.spec.alpha/def :portkey.aws.acm.filters/key-types (clojure.spec.alpha/and :portkey.aws.acm/key-algorithm-list))
(clojure.spec.alpha/def :portkey.aws.acm/filters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.filters/extended-key-usage :portkey.aws.acm.filters/key-usage :portkey.aws.acm.filters/key-types]))

(clojure.spec.alpha/def :portkey.aws.acm.certificate-summary/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.certificate-summary/domain-name (clojure.spec.alpha/and :portkey.aws.acm/domain-name-string))
(clojure.spec.alpha/def :portkey.aws.acm/certificate-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.certificate-summary/certificate-arn :portkey.aws.acm.certificate-summary/domain-name]))

(clojure.spec.alpha/def :portkey.aws.acm/max-items (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.acm/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 20 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"arn:[\w+=/,.@-]+:[\w+=/,.@-]+:[\w+=/,.@-]*:[0-9]+:[\w+=,.@-]+(/[\w+=,.@-]+)*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 32)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"\w+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm.invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.acm/string))
(clojure.spec.alpha/def :portkey.aws.acm/invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm.import-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.import-certificate-request/certificate (clojure.spec.alpha/and :portkey.aws.acm/certificate-body-blob))
(clojure.spec.alpha/def :portkey.aws.acm.import-certificate-request/private-key (clojure.spec.alpha/and :portkey.aws.acm/private-key-blob))
(clojure.spec.alpha/def :portkey.aws.acm.import-certificate-request/certificate-chain (clojure.spec.alpha/and :portkey.aws.acm/certificate-chain-blob))
(clojure.spec.alpha/def :portkey.aws.acm/import-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.import-certificate-request/certificate :portkey.aws.acm.import-certificate-request/private-key] :opt-un [:portkey.aws.acm.import-certificate-request/certificate-arn :portkey.aws.acm.import-certificate-request/certificate-chain]))

(clojure.spec.alpha/def :portkey.aws.acm/validation-email-list (clojure.spec.alpha/coll-of :portkey.aws.acm/string))

(clojure.spec.alpha/def :portkey.aws.acm/domain-name-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 253)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^(\*\.)?(((?!-)[A-Za-z0-9-]{0,62}[A-Za-z0-9])\.)+((?!-)[A-Za-z0-9-]{1,62}[A-Za-z0-9])$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm/certificate-status #{:inactive :pending-validation "REVOKED" "EXPIRED" "ISSUED" :revoked "INACTIVE" "FAILED" "PENDING_VALIDATION" :expired :issued "VALIDATION_TIMED_OUT" :validation-timed-out :failed})

(clojure.spec.alpha/def :portkey.aws.acm.list-tags-for-certificate-response/tags (clojure.spec.alpha/and :portkey.aws.acm/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm/list-tags-for-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.list-tags-for-certificate-response/tags]))

(clojure.spec.alpha/def :portkey.aws.acm.tag/key (clojure.spec.alpha/and :portkey.aws.acm/tag-key))
(clojure.spec.alpha/def :portkey.aws.acm.tag/value (clojure.spec.alpha/and :portkey.aws.acm/tag-value))
(clojure.spec.alpha/def :portkey.aws.acm/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.tag/key] :opt-un [:portkey.aws.acm.tag/value]))

(clojure.spec.alpha/def :portkey.aws.acm/passphrase-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm/certificate-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 32768)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}(\u000D?\u000A)?" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm/validation-method #{:email "DNS" :dns "EMAIL"})

(clojure.spec.alpha/def :portkey.aws.acm.export-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.acm/certificate-body))
(clojure.spec.alpha/def :portkey.aws.acm/export-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm.export-certificate-response/certificate :portkey.aws.acm/certificate-chain :portkey.aws.acm/private-key]))

(clojure.spec.alpha/def :portkey.aws.acm/domain-validation-option-list (clojure.spec.alpha/coll-of :portkey.aws.acm/domain-validation-option :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.acm/certificate-statuses (clojure.spec.alpha/coll-of :portkey.aws.acm/certificate-status))

(clojure.spec.alpha/def :portkey.aws.acm.get-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm/get-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.get-certificate-request/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm.export-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm/arn))
(clojure.spec.alpha/def :portkey.aws.acm.export-certificate-request/passphrase (clojure.spec.alpha/and :portkey.aws.acm/passphrase-blob))
(clojure.spec.alpha/def :portkey.aws.acm/export-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm.export-certificate-request/certificate-arn :portkey.aws.acm.export-certificate-request/passphrase] :opt-un []))

(clojure.core/defn export-certificate ([export-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-export-certificate-request export-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec :portkey.aws.acm/export-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/export-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ExportCertificate", :http.request.configuration/output-deser-fn deser-export-certificate-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "RequestInProgressException" :portkey.aws.acm/request-in-progress-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef export-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/export-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm/export-certificate-response))

(clojure.core/defn remove-tags-from-certificate ([remove-tags-from-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-remove-tags-from-certificate-request remove-tags-from-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/remove-tags-from-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTagsFromCertificate", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception, "InvalidTagException" :portkey.aws.acm/invalid-tag-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/remove-tags-from-certificate-request) :ret clojure.core/true?)

(clojure.core/defn import-certificate ([import-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-import-certificate-request import-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec :portkey.aws.acm/import-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/import-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ImportCertificate", :http.request.configuration/output-deser-fn deser-import-certificate-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "LimitExceededException" :portkey.aws.acm/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef import-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/import-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm/import-certificate-response))

(clojure.core/defn add-tags-to-certificate ([add-tags-to-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-tags-to-certificate-request add-tags-to-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/add-tags-to-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTagsToCertificate", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception, "InvalidTagException" :portkey.aws.acm/invalid-tag-exception, "TooManyTagsException" :portkey.aws.acm/too-many-tags-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/add-tags-to-certificate-request) :ret clojure.core/true?)

(clojure.core/defn request-certificate ([request-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-request-certificate-request request-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec :portkey.aws.acm/request-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/request-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RequestCertificate", :http.request.configuration/output-deser-fn deser-request-certificate-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.acm/limit-exceeded-exception, "InvalidDomainValidationOptionsException" :portkey.aws.acm/invalid-domain-validation-options-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef request-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/request-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm/request-certificate-response))

(clojure.core/defn get-certificate ([get-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-certificate-request get-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec :portkey.aws.acm/get-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/get-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCertificate", :http.request.configuration/output-deser-fn deser-get-certificate-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "RequestInProgressException" :portkey.aws.acm/request-in-progress-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef get-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/get-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm/get-certificate-response))

(clojure.core/defn update-certificate-options ([update-certificate-options-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-certificate-options-request update-certificate-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/update-certificate-options-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCertificateOptions", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "LimitExceededException" :portkey.aws.acm/limit-exceeded-exception, "InvalidStateException" :portkey.aws.acm/invalid-state-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef update-certificate-options :args (clojure.spec.alpha/tuple :portkey.aws.acm/update-certificate-options-request) :ret clojure.core/true?)

(clojure.core/defn list-certificates ([] (list-certificates {})) ([list-certificates-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-certificates-request list-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec :portkey.aws.acm/list-certificates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/list-certificates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCertificates", :http.request.configuration/output-deser-fn deser-list-certificates-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-certificates :args (clojure.spec.alpha/? :portkey.aws.acm/list-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.acm/list-certificates-response))

(clojure.core/defn list-tags-for-certificate ([list-tags-for-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tags-for-certificate-request list-tags-for-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec :portkey.aws.acm/list-tags-for-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/list-tags-for-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForCertificate", :http.request.configuration/output-deser-fn deser-list-tags-for-certificate-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/list-tags-for-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm/list-tags-for-certificate-response))

(clojure.core/defn describe-certificate ([describe-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-certificate-request describe-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec :portkey.aws.acm/describe-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/describe-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCertificate", :http.request.configuration/output-deser-fn deser-describe-certificate-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef describe-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/describe-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm/describe-certificate-response))

(clojure.core/defn resend-validation-email ([resend-validation-email-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-resend-validation-email-request resend-validation-email-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/resend-validation-email-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResendValidationEmail", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "InvalidStateException" :portkey.aws.acm/invalid-state-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception, "InvalidDomainValidationOptionsException" :portkey.aws.acm/invalid-domain-validation-options-exception}})))))
(clojure.spec.alpha/fdef resend-validation-email :args (clojure.spec.alpha/tuple :portkey.aws.acm/resend-validation-email-request) :ret clojure.core/true?)

(clojure.core/defn delete-certificate ([delete-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-certificate-request delete-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.acm/endpoints, :http.request.configuration/target-prefix "CertificateManager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-08", :http.request.configuration/service-id "ACM", :http.request.spec/input-spec :portkey.aws.acm/delete-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCertificate", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm/resource-not-found-exception, "ResourceInUseException" :portkey.aws.acm/resource-in-use-exception, "InvalidArnException" :portkey.aws.acm/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef delete-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm/delete-certificate-request) :ret clojure.core/true?)
