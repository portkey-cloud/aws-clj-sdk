(ns portkey.aws.acm-pca (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "acm-pca", :region "ap-northeast-1"},
    :ssl-common-name "acm-pca.ap-northeast-1.amazonaws.com",
    :endpoint "https://acm-pca.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "acm-pca", :region "eu-west-1"},
    :ssl-common-name "acm-pca.eu-west-1.amazonaws.com",
    :endpoint "https://acm-pca.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "acm-pca", :region "us-east-2"},
    :ssl-common-name "acm-pca.us-east-2.amazonaws.com",
    :endpoint "https://acm-pca.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "acm-pca", :region "ap-southeast-2"},
    :ssl-common-name "acm-pca.ap-southeast-2.amazonaws.com",
    :endpoint "https://acm-pca.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "acm-pca", :region "ap-southeast-1"},
    :ssl-common-name "acm-pca.ap-southeast-1.amazonaws.com",
    :endpoint "https://acm-pca.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "acm-pca", :region "ca-central-1"},
    :ssl-common-name "acm-pca.ca-central-1.amazonaws.com",
    :endpoint "https://acm-pca.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "acm-pca", :region "eu-central-1"},
    :ssl-common-name "acm-pca.eu-central-1.amazonaws.com",
    :endpoint "https://acm-pca.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "acm-pca", :region "eu-west-2"},
    :ssl-common-name "acm-pca.eu-west-2.amazonaws.com",
    :endpoint "https://acm-pca.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "acm-pca", :region "us-west-2"},
    :ssl-common-name "acm-pca.us-west-2.amazonaws.com",
    :endpoint "https://acm-pca.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "acm-pca", :region "us-east-1"},
    :ssl-common-name "acm-pca.us-east-1.amazonaws.com",
    :endpoint "https://acm-pca.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-validity-period-type)

(clojure.core/declare ser-certificate-chain-blob)

(clojure.core/declare ser-string-3-to-255)

(clojure.core/declare ser-certificate-authority-type)

(clojure.core/declare ser-csr-blob)

(clojure.core/declare ser-audit-report-id)

(clojure.core/declare ser-distinguished-name-qualifier-string)

(clojure.core/declare ser-certificate-authority-configuration)

(clojure.core/declare ser-string-128)

(clojure.core/declare ser-string-3)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-string-64)

(clojure.core/declare ser-string-40)

(clojure.core/declare ser-crl-configuration)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-country-code-string)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-string-253)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-asn-1-subject)

(clojure.core/declare ser-key-algorithm)

(clojure.core/declare ser-certificate-body-blob)

(clojure.core/declare ser-string)

(clojure.core/declare ser-revocation-configuration)

(clojure.core/declare ser-revocation-reason)

(clojure.core/declare ser-string-5)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-permanent-deletion-time-in-days)

(clojure.core/declare ser-validity)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-signing-algorithm)

(clojure.core/declare ser-audit-report-response-format)

(clojure.core/declare ser-certificate-authority-status)

(clojure.core/declare ser-positive-long)

(clojure.core/declare ser-string-16)

(clojure.core/declare ser-integer-1-to-5000)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-validity-period-type [input] #:http.request.field{:value (clojure.core/get {"ABSOLUTE" "ABSOLUTE", :end-date "END_DATE", "DAYS" "DAYS", "YEARS" "YEARS", :months "MONTHS", :days "DAYS", :absolute "ABSOLUTE", :years "YEARS", "MONTHS" "MONTHS", "END_DATE" "END_DATE"} input), :shape "ValidityPeriodType"})

(clojure.core/defn- ser-certificate-chain-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "CertificateChainBlob"})

(clojure.core/defn- ser-string-3-to-255 [input] #:http.request.field{:value input, :shape "String3To255"})

(clojure.core/defn- ser-certificate-authority-type [input] #:http.request.field{:value (clojure.core/get {"SUBORDINATE" "SUBORDINATE", :subordinate "SUBORDINATE"} input), :shape "CertificateAuthorityType"})

(clojure.core/defn- ser-csr-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "CsrBlob"})

(clojure.core/defn- ser-audit-report-id [input] #:http.request.field{:value input, :shape "AuditReportId"})

(clojure.core/defn- ser-distinguished-name-qualifier-string [input] #:http.request.field{:value input, :shape "DistinguishedNameQualifierString"})

(clojure.core/defn- ser-certificate-authority-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-key-algorithm (:key-algorithm input)) #:http.request.field{:name "KeyAlgorithm", :shape "KeyAlgorithm"}) (clojure.core/into (ser-signing-algorithm (:signing-algorithm input)) #:http.request.field{:name "SigningAlgorithm", :shape "SigningAlgorithm"}) (clojure.core/into (ser-asn-1-subject (:subject input)) #:http.request.field{:name "Subject", :shape "ASN1Subject"})], :shape "CertificateAuthorityConfiguration", :type "structure"}))

(clojure.core/defn- ser-string-128 [input] #:http.request.field{:value input, :shape "String128"})

(clojure.core/defn- ser-string-3 [input] #:http.request.field{:value input, :shape "String3"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-string-64 [input] #:http.request.field{:value input, :shape "String64"})

(clojure.core/defn- ser-string-40 [input] #:http.request.field{:value input, :shape "String40"})

(clojure.core/defn- ser-crl-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "Boolean", :box true})], :shape "CrlConfiguration", :type "structure"} (clojure.core/contains? input :expiration-in-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-1-to-5000 (input :expiration-in-days)) #:http.request.field{:name "ExpirationInDays", :shape "Integer1To5000", :box true})) (clojure.core/contains? input :custom-cname) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-253 (input :custom-cname)) #:http.request.field{:name "CustomCname", :shape "String253"})) (clojure.core/contains? input :s-3-bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-3-to-255 (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "String3To255"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-country-code-string [input] #:http.request.field{:value input, :shape "CountryCodeString"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-string-253 [input] #:http.request.field{:value input, :shape "String253"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-asn-1-subject [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ASN1Subject", :type "structure"} (clojure.core/contains? input :country) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-country-code-string (input :country)) #:http.request.field{:name "Country", :shape "CountryCodeString"})) (clojure.core/contains? input :organization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-64 (input :organization)) #:http.request.field{:name "Organization", :shape "String64"})) (clojure.core/contains? input :pseudonym) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-128 (input :pseudonym)) #:http.request.field{:name "Pseudonym", :shape "String128"})) (clojure.core/contains? input :surname) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-40 (input :surname)) #:http.request.field{:name "Surname", :shape "String40"})) (clojure.core/contains? input :title) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-64 (input :title)) #:http.request.field{:name "Title", :shape "String64"})) (clojure.core/contains? input :distinguished-name-qualifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-distinguished-name-qualifier-string (input :distinguished-name-qualifier)) #:http.request.field{:name "DistinguishedNameQualifier", :shape "DistinguishedNameQualifierString"})) (clojure.core/contains? input :initials) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-5 (input :initials)) #:http.request.field{:name "Initials", :shape "String5"})) (clojure.core/contains? input :locality) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-128 (input :locality)) #:http.request.field{:name "Locality", :shape "String128"})) (clojure.core/contains? input :generation-qualifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-3 (input :generation-qualifier)) #:http.request.field{:name "GenerationQualifier", :shape "String3"})) (clojure.core/contains? input :common-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-64 (input :common-name)) #:http.request.field{:name "CommonName", :shape "String64"})) (clojure.core/contains? input :given-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-16 (input :given-name)) #:http.request.field{:name "GivenName", :shape "String16"})) (clojure.core/contains? input :serial-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-64 (input :serial-number)) #:http.request.field{:name "SerialNumber", :shape "String64"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-128 (input :state)) #:http.request.field{:name "State", :shape "String128"})) (clojure.core/contains? input :organizational-unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-64 (input :organizational-unit)) #:http.request.field{:name "OrganizationalUnit", :shape "String64"}))))

(clojure.core/defn- ser-key-algorithm [input] #:http.request.field{:value (clojure.core/get {"RSA_2048" "RSA_2048", :rsa-2048 "RSA_2048", "RSA_4096" "RSA_4096", :rsa-4096 "RSA_4096", "EC_prime256v1" "EC_prime256v1", :ec-prime-256v-1 "EC_prime256v1", "EC_secp384r1" "EC_secp384r1", :ec-secp-384r-1 "EC_secp384r1"} input), :shape "KeyAlgorithm"})

(clojure.core/defn- ser-certificate-body-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "CertificateBodyBlob"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-revocation-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RevocationConfiguration", :type "structure"} (clojure.core/contains? input :crl-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-crl-configuration (input :crl-configuration)) #:http.request.field{:name "CrlConfiguration", :shape "CrlConfiguration"}))))

(clojure.core/defn- ser-revocation-reason [input] #:http.request.field{:value (clojure.core/get {"PRIVILEGE_WITHDRAWN" "PRIVILEGE_WITHDRAWN", :privilege-withdrawn "PRIVILEGE_WITHDRAWN", :unspecified "UNSPECIFIED", "CERTIFICATE_AUTHORITY_COMPROMISE" "CERTIFICATE_AUTHORITY_COMPROMISE", :certificate-authority-compromise "CERTIFICATE_AUTHORITY_COMPROMISE", "SUPERSEDED" "SUPERSEDED", :superseded "SUPERSEDED", "AFFILIATION_CHANGED" "AFFILIATION_CHANGED", "KEY_COMPROMISE" "KEY_COMPROMISE", :key-compromise "KEY_COMPROMISE", :a-a-compromise "A_A_COMPROMISE", "UNSPECIFIED" "UNSPECIFIED", :cessation-of-operation "CESSATION_OF_OPERATION", "CESSATION_OF_OPERATION" "CESSATION_OF_OPERATION", "A_A_COMPROMISE" "A_A_COMPROMISE", :affiliation-changed "AFFILIATION_CHANGED"} input), :shape "RevocationReason"})

(clojure.core/defn- ser-string-5 [input] #:http.request.field{:value input, :shape "String5"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-permanent-deletion-time-in-days [input] #:http.request.field{:value input, :shape "PermanentDeletionTimeInDays"})

(clojure.core/defn- ser-validity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-positive-long (:value input)) #:http.request.field{:name "Value", :shape "PositiveLong", :box true}) (clojure.core/into (ser-validity-period-type (:type input)) #:http.request.field{:name "Type", :shape "ValidityPeriodType"})], :shape "Validity", :type "structure"}))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-signing-algorithm [input] #:http.request.field{:value (clojure.core/get {:sha-256-withecdsa "SHA256WITHECDSA", "SHA256WITHECDSA" "SHA256WITHECDSA", :sha-512-withrsa "SHA512WITHRSA", :sha-384-withrsa "SHA384WITHRSA", "SHA384WITHECDSA" "SHA384WITHECDSA", "SHA512WITHRSA" "SHA512WITHRSA", "SHA384WITHRSA" "SHA384WITHRSA", "SHA256WITHRSA" "SHA256WITHRSA", "SHA512WITHECDSA" "SHA512WITHECDSA", :sha-512-withecdsa "SHA512WITHECDSA", :sha-256-withrsa "SHA256WITHRSA", :sha-384-withecdsa "SHA384WITHECDSA"} input), :shape "SigningAlgorithm"})

(clojure.core/defn- ser-audit-report-response-format [input] #:http.request.field{:value (clojure.core/get {"JSON" "JSON", :json "JSON", "CSV" "CSV", :csv "CSV"} input), :shape "AuditReportResponseFormat"})

(clojure.core/defn- ser-certificate-authority-status [input] #:http.request.field{:value (clojure.core/get {:deleted "DELETED", "DISABLED" "DISABLED", :disabled "DISABLED", :creating "CREATING", "EXPIRED" "EXPIRED", "PENDING_CERTIFICATE" "PENDING_CERTIFICATE", :active "ACTIVE", :pending-certificate "PENDING_CERTIFICATE", "CREATING" "CREATING", "ACTIVE" "ACTIVE", "FAILED" "FAILED", :expired "EXPIRED", "DELETED" "DELETED", :failed "FAILED"} input), :shape "CertificateAuthorityStatus"})

(clojure.core/defn- ser-positive-long [input] #:http.request.field{:value input, :shape "PositiveLong"})

(clojure.core/defn- ser-string-16 [input] #:http.request.field{:value input, :shape "String16"})

(clojure.core/defn- ser-integer-1-to-5000 [input] #:http.request.field{:value input, :shape "Integer1To5000"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"})]} (clojure.core/contains? input :revocation-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revocation-configuration (input :revocation-configuration)) #:http.request.field{:name "RevocationConfiguration", :shape "RevocationConfiguration"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-authority-status (input :status)) #:http.request.field{:name "Status", :shape "CertificateAuthorityStatus"}))))

(clojure.core/defn- req-revoke-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}) (clojure.core/into (ser-string-128 (input :certificate-serial)) #:http.request.field{:name "CertificateSerial", :shape "String128"}) (clojure.core/into (ser-revocation-reason (input :revocation-reason)) #:http.request.field{:name "RevocationReason", :shape "RevocationReason"})]}))

(clojure.core/defn- req-create-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-certificate-authority-configuration (input :certificate-authority-configuration)) #:http.request.field{:name "CertificateAuthorityConfiguration", :shape "CertificateAuthorityConfiguration"}) (clojure.core/into (ser-certificate-authority-type (input :certificate-authority-type)) #:http.request.field{:name "CertificateAuthorityType", :shape "CertificateAuthorityType"})]} (clojure.core/contains? input :revocation-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revocation-configuration (input :revocation-configuration)) #:http.request.field{:name "RevocationConfiguration", :shape "RevocationConfiguration"})) (clojure.core/contains? input :idempotency-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-get-certificate-authority-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"})]}))

(clojure.core/defn- req-tag-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-describe-certificate-authority-audit-report-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}) (clojure.core/into (ser-audit-report-id (input :audit-report-id)) #:http.request.field{:name "AuditReportId", :shape "AuditReportId"})]}))

(clojure.core/defn- req-untag-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-issue-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}) (clojure.core/into (ser-csr-blob (input :csr)) #:http.request.field{:name "Csr", :shape "CsrBlob"}) (clojure.core/into (ser-signing-algorithm (input :signing-algorithm)) #:http.request.field{:name "SigningAlgorithm", :shape "SigningAlgorithm"}) (clojure.core/into (ser-validity (input :validity)) #:http.request.field{:name "Validity", :shape "Validity"})]} (clojure.core/contains? input :idempotency-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken"}))))

(clojure.core/defn- req-create-certificate-authority-audit-report-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}) (clojure.core/into (ser-string (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "String"}) (clojure.core/into (ser-audit-report-response-format (input :audit-report-response-format)) #:http.request.field{:name "AuditReportResponseFormat", :shape "AuditReportResponseFormat"})]}))

(clojure.core/defn- req-restore-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"})]} (clojure.core/contains? input :permanent-deletion-time-in-days) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permanent-deletion-time-in-days (input :permanent-deletion-time-in-days)) #:http.request.field{:name "PermanentDeletionTimeInDays", :shape "PermanentDeletionTimeInDays"}))))

(clojure.core/defn- req-get-certificate-authority-csr-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"})]}))

(clojure.core/defn- req-describe-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"})]}))

(clojure.core/defn- req-import-certificate-authority-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}) (clojure.core/into (ser-certificate-body-blob (input :certificate)) #:http.request.field{:name "Certificate", :shape "CertificateBodyBlob"}) (clojure.core/into (ser-certificate-chain-blob (input :certificate-chain)) #:http.request.field{:name "CertificateChain", :shape "CertificateChainBlob"})]}))

(clojure.core/defn- req-get-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"}) (clojure.core/into (ser-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "Arn"})]}))

(clojure.core/defn- req-list-certificate-authorities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :certificate-authority-arn)) #:http.request.field{:name "CertificateAuthorityArn", :shape "Arn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/declare deser-string-3-to-255)

(clojure.core/declare deser-certificate-authority-type)

(clojure.core/declare deser-audit-report-id)

(clojure.core/declare deser-distinguished-name-qualifier-string)

(clojure.core/declare deser-certificate-authority-configuration)

(clojure.core/declare deser-string-128)

(clojure.core/declare deser-string-3)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-audit-report-status)

(clojure.core/declare deser-string-64)

(clojure.core/declare deser-string-40)

(clojure.core/declare deser-crl-configuration)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-country-code-string)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-string-253)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-certificate-chain)

(clojure.core/declare deser-asn-1-subject)

(clojure.core/declare deser-key-algorithm)

(clojure.core/declare deser-failure-reason)

(clojure.core/declare deser-string)

(clojure.core/declare deser-revocation-configuration)

(clojure.core/declare deser-t-stamp)

(clojure.core/declare deser-string-5)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-signing-algorithm)

(clojure.core/declare deser-certificate-body)

(clojure.core/declare deser-certificate-authority-status)

(clojure.core/declare deser-csr-body)

(clojure.core/declare deser-certificate-authorities)

(clojure.core/declare deser-string-16)

(clojure.core/declare deser-integer-1-to-5000)

(clojure.core/declare deser-certificate-authority)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-string-3-to-255 [input] input)

(clojure.core/defn- deser-certificate-authority-type [input] (clojure.core/get {"SUBORDINATE" :subordinate} input))

(clojure.core/defn- deser-audit-report-id [input] input)

(clojure.core/defn- deser-distinguished-name-qualifier-string [input] input)

(clojure.core/defn- deser-certificate-authority-configuration [input] (clojure.core/cond-> {:key-algorithm (deser-key-algorithm (input "KeyAlgorithm")), :signing-algorithm (deser-signing-algorithm (input "SigningAlgorithm")), :subject (deser-asn-1-subject (input "Subject"))}))

(clojure.core/defn- deser-string-128 [input] input)

(clojure.core/defn- deser-string-3 [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-audit-report-status [input] (clojure.core/get {"CREATING" :creating, "SUCCESS" :success, "FAILED" :failed} input))

(clojure.core/defn- deser-string-64 [input] input)

(clojure.core/defn- deser-string-40 [input] input)

(clojure.core/defn- deser-crl-configuration [input] (clojure.core/cond-> {:enabled (deser-boolean (input "Enabled"))} (clojure.core/contains? input "ExpirationInDays") (clojure.core/assoc :expiration-in-days (deser-integer-1-to-5000 (input "ExpirationInDays"))) (clojure.core/contains? input "CustomCname") (clojure.core/assoc :custom-cname (deser-string-253 (input "CustomCname"))) (clojure.core/contains? input "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string-3-to-255 (input "S3BucketName")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-country-code-string [input] input)

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-string-253 [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-certificate-chain [input] input)

(clojure.core/defn- deser-asn-1-subject [input] (clojure.core/cond-> {} (clojure.core/contains? input "Country") (clojure.core/assoc :country (deser-country-code-string (input "Country"))) (clojure.core/contains? input "Organization") (clojure.core/assoc :organization (deser-string-64 (input "Organization"))) (clojure.core/contains? input "Pseudonym") (clojure.core/assoc :pseudonym (deser-string-128 (input "Pseudonym"))) (clojure.core/contains? input "Surname") (clojure.core/assoc :surname (deser-string-40 (input "Surname"))) (clojure.core/contains? input "Title") (clojure.core/assoc :title (deser-string-64 (input "Title"))) (clojure.core/contains? input "DistinguishedNameQualifier") (clojure.core/assoc :distinguished-name-qualifier (deser-distinguished-name-qualifier-string (input "DistinguishedNameQualifier"))) (clojure.core/contains? input "Initials") (clojure.core/assoc :initials (deser-string-5 (input "Initials"))) (clojure.core/contains? input "Locality") (clojure.core/assoc :locality (deser-string-128 (input "Locality"))) (clojure.core/contains? input "GenerationQualifier") (clojure.core/assoc :generation-qualifier (deser-string-3 (input "GenerationQualifier"))) (clojure.core/contains? input "CommonName") (clojure.core/assoc :common-name (deser-string-64 (input "CommonName"))) (clojure.core/contains? input "GivenName") (clojure.core/assoc :given-name (deser-string-16 (input "GivenName"))) (clojure.core/contains? input "SerialNumber") (clojure.core/assoc :serial-number (deser-string-64 (input "SerialNumber"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-string-128 (input "State"))) (clojure.core/contains? input "OrganizationalUnit") (clojure.core/assoc :organizational-unit (deser-string-64 (input "OrganizationalUnit")))))

(clojure.core/defn- deser-key-algorithm [input] (clojure.core/get {"RSA_2048" :rsa-2048, "RSA_4096" :rsa-4096, "EC_prime256v1" :ec-prime-256v-1, "EC_secp384r1" :ec-secp-384r-1} input))

(clojure.core/defn- deser-failure-reason [input] (clojure.core/get {"REQUEST_TIMED_OUT" :request-timed-out, "UNSUPPORTED_ALGORITHM" :unsupported-algorithm, "OTHER" :other} input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-revocation-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "CrlConfiguration") (clojure.core/assoc :crl-configuration (deser-crl-configuration (input "CrlConfiguration")))))

(clojure.core/defn- deser-t-stamp [input] input)

(clojure.core/defn- deser-string-5 [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key"))} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-signing-algorithm [input] (clojure.core/get {"SHA256WITHECDSA" :sha-256-withecdsa, "SHA384WITHECDSA" :sha-384-withecdsa, "SHA512WITHECDSA" :sha-512-withecdsa, "SHA256WITHRSA" :sha-256-withrsa, "SHA384WITHRSA" :sha-384-withrsa, "SHA512WITHRSA" :sha-512-withrsa} input))

(clojure.core/defn- deser-certificate-body [input] input)

(clojure.core/defn- deser-certificate-authority-status [input] (clojure.core/get {"CREATING" :creating, "PENDING_CERTIFICATE" :pending-certificate, "ACTIVE" :active, "DELETED" :deleted, "DISABLED" :disabled, "EXPIRED" :expired, "FAILED" :failed} input))

(clojure.core/defn- deser-csr-body [input] input)

(clojure.core/defn- deser-certificate-authorities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-certificate-authority coll))) input))

(clojure.core/defn- deser-string-16 [input] input)

(clojure.core/defn- deser-integer-1-to-5000 [input] input)

(clojure.core/defn- deser-certificate-authority [input] (clojure.core/cond-> {} (clojure.core/contains? input "Serial") (clojure.core/assoc :serial (deser-string (input "Serial"))) (clojure.core/contains? input "NotBefore") (clojure.core/assoc :not-before (deser-t-stamp (input "NotBefore"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-certificate-authority-type (input "Type"))) (clojure.core/contains? input "CertificateAuthorityConfiguration") (clojure.core/assoc :certificate-authority-configuration (deser-certificate-authority-configuration (input "CertificateAuthorityConfiguration"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-certificate-authority-status (input "Status"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "RestorableUntil") (clojure.core/assoc :restorable-until (deser-t-stamp (input "RestorableUntil"))) (clojure.core/contains? input "RevocationConfiguration") (clojure.core/assoc :revocation-configuration (deser-revocation-configuration (input "RevocationConfiguration"))) (clojure.core/contains? input "NotAfter") (clojure.core/assoc :not-after (deser-t-stamp (input "NotAfter"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-t-stamp (input "CreatedAt"))) (clojure.core/contains? input "LastStateChangeAt") (clojure.core/assoc :last-state-change-at (deser-t-stamp (input "LastStateChangeAt")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-get-certificate-response ([input] (response-get-certificate-response nil input)) ([resultWrapper1420908 input] (clojure.core/let [rawinput1420907 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420909 {"Certificate" (rawinput1420907 "Certificate"), "CertificateChain" (rawinput1420907 "CertificateChain")}] (clojure.core/cond-> {} (letvar1420909 "Certificate") (clojure.core/assoc :certificate (deser-certificate-body (clojure.core/get-in letvar1420909 ["Certificate"]))) (letvar1420909 "CertificateChain") (clojure.core/assoc :certificate-chain (deser-certificate-chain (clojure.core/get-in letvar1420909 ["CertificateChain"])))))))

(clojure.core/defn- response-create-certificate-authority-audit-report-response ([input] (response-create-certificate-authority-audit-report-response nil input)) ([resultWrapper1420911 input] (clojure.core/let [rawinput1420910 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420912 {"AuditReportId" (rawinput1420910 "AuditReportId"), "S3Key" (rawinput1420910 "S3Key")}] (clojure.core/cond-> {} (letvar1420912 "AuditReportId") (clojure.core/assoc :audit-report-id (deser-audit-report-id (clojure.core/get-in letvar1420912 ["AuditReportId"]))) (letvar1420912 "S3Key") (clojure.core/assoc :s-3-key (deser-string (clojure.core/get-in letvar1420912 ["S3Key"])))))))

(clojure.core/defn- response-describe-certificate-authority-audit-report-response ([input] (response-describe-certificate-authority-audit-report-response nil input)) ([resultWrapper1420914 input] (clojure.core/let [rawinput1420913 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420915 {"AuditReportStatus" (rawinput1420913 "AuditReportStatus"), "S3BucketName" (rawinput1420913 "S3BucketName"), "S3Key" (rawinput1420913 "S3Key"), "CreatedAt" (rawinput1420913 "CreatedAt")}] (clojure.core/cond-> {} (letvar1420915 "AuditReportStatus") (clojure.core/assoc :audit-report-status (deser-audit-report-status (clojure.core/get-in letvar1420915 ["AuditReportStatus"]))) (letvar1420915 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (clojure.core/get-in letvar1420915 ["S3BucketName"]))) (letvar1420915 "S3Key") (clojure.core/assoc :s-3-key (deser-string (clojure.core/get-in letvar1420915 ["S3Key"]))) (letvar1420915 "CreatedAt") (clojure.core/assoc :created-at (deser-t-stamp (clojure.core/get-in letvar1420915 ["CreatedAt"])))))))

(clojure.core/defn- response-malformed-csr-exception ([input] (response-malformed-csr-exception nil input)) ([resultWrapper1420917 input] (clojure.core/let [rawinput1420916 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420918 {"message" (rawinput1420916 "message")}] (clojure.core/cond-> {} (letvar1420918 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420918 ["message"])))))))

(clojure.core/defn- response-get-certificate-authority-certificate-response ([input] (response-get-certificate-authority-certificate-response nil input)) ([resultWrapper1420920 input] (clojure.core/let [rawinput1420919 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420921 {"Certificate" (rawinput1420919 "Certificate"), "CertificateChain" (rawinput1420919 "CertificateChain")}] (clojure.core/cond-> {} (letvar1420921 "Certificate") (clojure.core/assoc :certificate (deser-certificate-body (clojure.core/get-in letvar1420921 ["Certificate"]))) (letvar1420921 "CertificateChain") (clojure.core/assoc :certificate-chain (deser-certificate-chain (clojure.core/get-in letvar1420921 ["CertificateChain"])))))))

(clojure.core/defn- response-create-certificate-authority-response ([input] (response-create-certificate-authority-response nil input)) ([resultWrapper1420923 input] (clojure.core/let [rawinput1420922 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420924 {"CertificateAuthorityArn" (rawinput1420922 "CertificateAuthorityArn")}] (clojure.core/cond-> {} (letvar1420924 "CertificateAuthorityArn") (clojure.core/assoc :certificate-authority-arn (deser-arn (clojure.core/get-in letvar1420924 ["CertificateAuthorityArn"])))))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper1420926 input] (clojure.core/let [rawinput1420925 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420927 {"Tags" (rawinput1420925 "Tags"), "NextToken" (rawinput1420925 "NextToken")}] (clojure.core/cond-> {} (letvar1420927 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1420927 ["Tags"]))) (letvar1420927 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1420927 ["NextToken"])))))))

(clojure.core/defn- response-malformed-certificate-exception ([input] (response-malformed-certificate-exception nil input)) ([resultWrapper1420929 input] (clojure.core/let [rawinput1420928 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420930 {"message" (rawinput1420928 "message")}] (clojure.core/cond-> {} (letvar1420930 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420930 ["message"])))))))

(clojure.core/defn- response-list-certificate-authorities-response ([input] (response-list-certificate-authorities-response nil input)) ([resultWrapper1420932 input] (clojure.core/let [rawinput1420931 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420933 {"CertificateAuthorities" (rawinput1420931 "CertificateAuthorities"), "NextToken" (rawinput1420931 "NextToken")}] (clojure.core/cond-> {} (letvar1420933 "CertificateAuthorities") (clojure.core/assoc :certificate-authorities (deser-certificate-authorities (clojure.core/get-in letvar1420933 ["CertificateAuthorities"]))) (letvar1420933 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1420933 ["NextToken"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1420935 input] (clojure.core/let [rawinput1420934 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420936 {"message" (rawinput1420934 "message")}] (clojure.core/cond-> {} (letvar1420936 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420936 ["message"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1420938 input] (clojure.core/let [rawinput1420937 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420939 {"message" (rawinput1420937 "message")}] (clojure.core/cond-> {} (letvar1420939 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420939 ["message"])))))))

(clojure.core/defn- response-certificate-mismatch-exception ([input] (response-certificate-mismatch-exception nil input)) ([resultWrapper1420941 input] (clojure.core/let [rawinput1420940 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420942 {"message" (rawinput1420940 "message")}] (clojure.core/cond-> {} (letvar1420942 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420942 ["message"])))))))

(clojure.core/defn- response-invalid-arn-exception ([input] (response-invalid-arn-exception nil input)) ([resultWrapper1420944 input] (clojure.core/let [rawinput1420943 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420945 {"message" (rawinput1420943 "message")}] (clojure.core/cond-> {} (letvar1420945 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420945 ["message"])))))))

(clojure.core/defn- response-describe-certificate-authority-response ([input] (response-describe-certificate-authority-response nil input)) ([resultWrapper1420947 input] (clojure.core/let [rawinput1420946 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420948 {"CertificateAuthority" (rawinput1420946 "CertificateAuthority")}] (clojure.core/cond-> {} (letvar1420948 "CertificateAuthority") (clojure.core/assoc :certificate-authority (deser-certificate-authority (clojure.core/get-in letvar1420948 ["CertificateAuthority"])))))))

(clojure.core/defn- response-get-certificate-authority-csr-response ([input] (response-get-certificate-authority-csr-response nil input)) ([resultWrapper1420950 input] (clojure.core/let [rawinput1420949 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420951 {"Csr" (rawinput1420949 "Csr")}] (clojure.core/cond-> {} (letvar1420951 "Csr") (clojure.core/assoc :csr (deser-csr-body (clojure.core/get-in letvar1420951 ["Csr"])))))))

(clojure.core/defn- response-invalid-tag-exception ([input] (response-invalid-tag-exception nil input)) ([resultWrapper1420953 input] (clojure.core/let [rawinput1420952 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420954 {"message" (rawinput1420952 "message")}] (clojure.core/cond-> {} (letvar1420954 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420954 ["message"])))))))

(clojure.core/defn- response-request-in-progress-exception ([input] (response-request-in-progress-exception nil input)) ([resultWrapper1420956 input] (clojure.core/let [rawinput1420955 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420957 {"message" (rawinput1420955 "message")}] (clojure.core/cond-> {} (letvar1420957 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420957 ["message"])))))))

(clojure.core/defn- response-invalid-args-exception ([input] (response-invalid-args-exception nil input)) ([resultWrapper1420959 input] (clojure.core/let [rawinput1420958 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420960 {"message" (rawinput1420958 "message")}] (clojure.core/cond-> {} (letvar1420960 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420960 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1420962 input] (clojure.core/let [rawinput1420961 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420963 {"message" (rawinput1420961 "message")}] (clojure.core/cond-> {} (letvar1420963 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420963 ["message"])))))))

(clojure.core/defn- response-issue-certificate-response ([input] (response-issue-certificate-response nil input)) ([resultWrapper1420965 input] (clojure.core/let [rawinput1420964 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420966 {"CertificateArn" (rawinput1420964 "CertificateArn")}] (clojure.core/cond-> {} (letvar1420966 "CertificateArn") (clojure.core/assoc :certificate-arn (deser-arn (clojure.core/get-in letvar1420966 ["CertificateArn"])))))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper1420968 input] (clojure.core/let [rawinput1420967 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420969 {"message" (rawinput1420967 "message")}] (clojure.core/cond-> {} (letvar1420969 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420969 ["message"])))))))

(clojure.core/defn- response-invalid-policy-exception ([input] (response-invalid-policy-exception nil input)) ([resultWrapper1420971 input] (clojure.core/let [rawinput1420970 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420972 {"message" (rawinput1420970 "message")}] (clojure.core/cond-> {} (letvar1420972 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420972 ["message"])))))))

(clojure.core/defn- response-invalid-state-exception ([input] (response-invalid-state-exception nil input)) ([resultWrapper1420974 input] (clojure.core/let [rawinput1420973 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420975 {"message" (rawinput1420973 "message")}] (clojure.core/cond-> {} (letvar1420975 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420975 ["message"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1420977 input] (clojure.core/let [rawinput1420976 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420978 {"message" (rawinput1420976 "message")}] (clojure.core/cond-> {} (letvar1420978 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420978 ["message"])))))))

(clojure.core/defn- response-request-failed-exception ([input] (response-request-failed-exception nil input)) ([resultWrapper1420980 input] (clojure.core/let [rawinput1420979 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420981 {"message" (rawinput1420979 "message")}] (clojure.core/cond-> {} (letvar1420981 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420981 ["message"])))))))

(clojure.core/defn- response-request-already-processed-exception ([input] (response-request-already-processed-exception nil input)) ([resultWrapper1420983 input] (clojure.core/let [rawinput1420982 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1420984 {"message" (rawinput1420982 "message")}] (clojure.core/cond-> {} (letvar1420984 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1420984 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/validity-period-type #{"ABSOLUTE" :end-date "DAYS" "YEARS" :months :days :absolute :years "MONTHS" "END_DATE"})

(clojure.spec.alpha/def :portkey.aws.acm-pca.get-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.acm-pca/certificate-body))
(clojure.spec.alpha/def :portkey.aws.acm-pca/get-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.get-certificate-response/certificate :portkey.aws.acm-pca/certificate-chain]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.create-certificate-authority-audit-report-response/s-3-key (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/create-certificate-authority-audit-report-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca/audit-report-id :portkey.aws.acm-pca.create-certificate-authority-audit-report-response/s-3-key]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-chain-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm-pca/string-3-to-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 3 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.update-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.update-certificate-authority-request/status (clojure.spec.alpha/and :portkey.aws.acm-pca/certificate-authority-status))
(clojure.spec.alpha/def :portkey.aws.acm-pca/update-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.update-certificate-authority-request/certificate-authority-arn] :opt-un [:portkey.aws.acm-pca/revocation-configuration :portkey.aws.acm-pca.update-certificate-authority-request/status]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-authority-type #{"SUBORDINATE" :subordinate})

(clojure.spec.alpha/def :portkey.aws.acm-pca/csr-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm-pca.describe-certificate-authority-audit-report-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.describe-certificate-authority-audit-report-response/s-3-key (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.describe-certificate-authority-audit-report-response/created-at (clojure.spec.alpha/and :portkey.aws.acm-pca/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca/describe-certificate-authority-audit-report-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca/audit-report-status :portkey.aws.acm-pca.describe-certificate-authority-audit-report-response/s-3-bucket-name :portkey.aws.acm-pca.describe-certificate-authority-audit-report-response/s-3-key :portkey.aws.acm-pca.describe-certificate-authority-audit-report-response/created-at]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.revoke-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.revoke-certificate-request/certificate-serial (clojure.spec.alpha/and :portkey.aws.acm-pca/string-128))
(clojure.spec.alpha/def :portkey.aws.acm-pca/revoke-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.revoke-certificate-request/certificate-authority-arn :portkey.aws.acm-pca.revoke-certificate-request/certificate-serial :portkey.aws.acm-pca/revocation-reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.create-certificate-authority-request/tags (clojure.spec.alpha/and :portkey.aws.acm-pca/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm-pca/create-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca/certificate-authority-configuration :portkey.aws.acm-pca/certificate-authority-type] :opt-un [:portkey.aws.acm-pca/revocation-configuration :portkey.aws.acm-pca/idempotency-token :portkey.aws.acm-pca.create-certificate-authority-request/tags]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.malformed-csr-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/malformed-csr-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.malformed-csr-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/audit-report-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 36 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 36)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-z0-9]{8}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.get-certificate-authority-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.acm-pca/certificate-body))
(clojure.spec.alpha/def :portkey.aws.acm-pca/get-certificate-authority-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.get-certificate-authority-certificate-response/certificate :portkey.aws.acm-pca/certificate-chain]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/distinguished-name-qualifier-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9'()+-.?:/= ]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority-configuration/subject (clojure.spec.alpha/and :portkey.aws.acm-pca/asn-1-subject))
(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-authority-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca/key-algorithm :portkey.aws.acm-pca/signing-algorithm :portkey.aws.acm-pca.certificate-authority-configuration/subject] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.create-certificate-authority-response/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/create-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.create-certificate-authority-response/certificate-authority-arn]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.list-tags-response/tags (clojure.spec.alpha/and :portkey.aws.acm-pca/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm-pca/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.list-tags-response/tags :portkey.aws.acm-pca/next-token]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/string-128 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/string-3 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.get-certificate-authority-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/get-certificate-authority-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.get-certificate-authority-certificate-request/certificate-authority-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.malformed-certificate-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/malformed-certificate-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.malformed-certificate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.tag-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.tag-certificate-authority-request/tags (clojure.spec.alpha/and :portkey.aws.acm-pca/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm-pca/tag-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.tag-certificate-authority-request/certificate-authority-arn :portkey.aws.acm-pca.tag-certificate-authority-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/audit-report-status #{"SUCCESS" :creating :success "CREATING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.acm-pca/list-certificate-authorities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca/certificate-authorities :portkey.aws.acm-pca/next-token]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/string-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/string-40 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.crl-configuration/enabled (clojure.spec.alpha/and :portkey.aws.acm-pca/boolean))
(clojure.spec.alpha/def :portkey.aws.acm-pca.crl-configuration/expiration-in-days (clojure.spec.alpha/and :portkey.aws.acm-pca/integer-1-to-5000))
(clojure.spec.alpha/def :portkey.aws.acm-pca.crl-configuration/custom-cname (clojure.spec.alpha/and :portkey.aws.acm-pca/string-253))
(clojure.spec.alpha/def :portkey.aws.acm-pca.crl-configuration/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.acm-pca/string-3-to-255))
(clojure.spec.alpha/def :portkey.aws.acm-pca/crl-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.crl-configuration/enabled] :opt-un [:portkey.aws.acm-pca.crl-configuration/expiration-in-days :portkey.aws.acm-pca.crl-configuration/custom-cname :portkey.aws.acm-pca.crl-configuration/s-3-bucket-name]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.certificate-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/country-code-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[A-Za-z]{2}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.invalid-arn-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/invalid-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.invalid-arn-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/describe-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca/certificate-authority]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.get-certificate-authority-csr-response/csr (clojure.spec.alpha/and :portkey.aws.acm-pca/csr-body))
(clojure.spec.alpha/def :portkey.aws.acm-pca/get-certificate-authority-csr-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.get-certificate-authority-csr-response/csr]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/tag-list (clojure.spec.alpha/coll-of :portkey.aws.acm-pca/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.acm-pca.invalid-tag-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.invalid-tag-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/string-253 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 253))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.request-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/request-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.request-in-progress-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.invalid-args-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/invalid-args-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.invalid-args-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.describe-certificate-authority-audit-report-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/describe-certificate-authority-audit-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.describe-certificate-authority-audit-report-request/certificate-authority-arn :portkey.aws.acm-pca/audit-report-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.issue-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/issue-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.issue-certificate-response/certificate-arn]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.untag-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.untag-certificate-authority-request/tags (clojure.spec.alpha/and :portkey.aws.acm-pca/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm-pca/untag-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.untag-certificate-authority-request/certificate-authority-arn :portkey.aws.acm-pca.untag-certificate-authority-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-chain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/country (clojure.spec.alpha/and :portkey.aws.acm-pca/country-code-string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/organization (clojure.spec.alpha/and :portkey.aws.acm-pca/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/pseudonym (clojure.spec.alpha/and :portkey.aws.acm-pca/string-128))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/surname (clojure.spec.alpha/and :portkey.aws.acm-pca/string-40))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/title (clojure.spec.alpha/and :portkey.aws.acm-pca/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/distinguished-name-qualifier (clojure.spec.alpha/and :portkey.aws.acm-pca/distinguished-name-qualifier-string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/initials (clojure.spec.alpha/and :portkey.aws.acm-pca/string-5))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/locality (clojure.spec.alpha/and :portkey.aws.acm-pca/string-128))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/generation-qualifier (clojure.spec.alpha/and :portkey.aws.acm-pca/string-3))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/common-name (clojure.spec.alpha/and :portkey.aws.acm-pca/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/given-name (clojure.spec.alpha/and :portkey.aws.acm-pca/string-16))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/serial-number (clojure.spec.alpha/and :portkey.aws.acm-pca/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/state (clojure.spec.alpha/and :portkey.aws.acm-pca/string-128))
(clojure.spec.alpha/def :portkey.aws.acm-pca.asn-1-subject/organizational-unit (clojure.spec.alpha/and :portkey.aws.acm-pca/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca/asn-1-subject (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.asn-1-subject/country :portkey.aws.acm-pca.asn-1-subject/organization :portkey.aws.acm-pca.asn-1-subject/pseudonym :portkey.aws.acm-pca.asn-1-subject/surname :portkey.aws.acm-pca.asn-1-subject/title :portkey.aws.acm-pca.asn-1-subject/distinguished-name-qualifier :portkey.aws.acm-pca.asn-1-subject/initials :portkey.aws.acm-pca.asn-1-subject/locality :portkey.aws.acm-pca.asn-1-subject/generation-qualifier :portkey.aws.acm-pca.asn-1-subject/common-name :portkey.aws.acm-pca.asn-1-subject/given-name :portkey.aws.acm-pca.asn-1-subject/serial-number :portkey.aws.acm-pca.asn-1-subject/state :portkey.aws.acm-pca.asn-1-subject/organizational-unit]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/key-algorithm #{:ec-secp-384r-1 :ec-prime-256v-1 "RSA_4096" "EC_prime256v1" :rsa-4096 "EC_secp384r1" "RSA_2048" :rsa-2048})

(clojure.spec.alpha/def :portkey.aws.acm-pca.issue-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.issue-certificate-request/csr (clojure.spec.alpha/and :portkey.aws.acm-pca/csr-blob))
(clojure.spec.alpha/def :portkey.aws.acm-pca/issue-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.issue-certificate-request/certificate-authority-arn :portkey.aws.acm-pca.issue-certificate-request/csr :portkey.aws.acm-pca/signing-algorithm :portkey.aws.acm-pca/validity] :opt-un [:portkey.aws.acm-pca/idempotency-token]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/failure-reason #{:unsupported-algorithm :request-timed-out :other "REQUEST_TIMED_OUT" "UNSUPPORTED_ALGORITHM" "OTHER"})

(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-body-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm-pca/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm-pca.create-certificate-authority-audit-report-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.create-certificate-authority-audit-report-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/create-certificate-authority-audit-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.create-certificate-authority-audit-report-request/certificate-authority-arn :portkey.aws.acm-pca.create-certificate-authority-audit-report-request/s-3-bucket-name :portkey.aws.acm-pca/audit-report-response-format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.too-many-tags-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.too-many-tags-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/revocation-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca/crl-configuration]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/t-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.acm-pca/revocation-reason #{"PRIVILEGE_WITHDRAWN" :privilege-withdrawn :unspecified "CERTIFICATE_AUTHORITY_COMPROMISE" :certificate-authority-compromise "SUPERSEDED" :superseded "AFFILIATION_CHANGED" "KEY_COMPROMISE" :key-compromise :a-a-compromise "UNSPECIFIED" :cessation-of-operation "CESSATION_OF_OPERATION" "A_A_COMPROMISE" :affiliation-changed})

(clojure.spec.alpha/def :portkey.aws.acm-pca.restore-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/restore-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.restore-certificate-authority-request/certificate-authority-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca/string-5 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 5 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 200)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:[\w+=/,.@-]+:[\w+=/,.@-]+:[\w+=/,.@-]*:[0-9]+:[\w+=,.@-]+(/[\w+=/,.@-]+)*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 36)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/permanent-deletion-time-in-days (clojure.spec.alpha/int-in 7 30))

(clojure.spec.alpha/def :portkey.aws.acm-pca.delete-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/delete-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.delete-certificate-authority-request/certificate-authority-arn] :opt-un [:portkey.aws.acm-pca/permanent-deletion-time-in-days]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.invalid-policy-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/invalid-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.invalid-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.validity/value (clojure.spec.alpha/and :portkey.aws.acm-pca/positive-long))
(clojure.spec.alpha/def :portkey.aws.acm-pca.validity/type (clojure.spec.alpha/and :portkey.aws.acm-pca/validity-period-type))
(clojure.spec.alpha/def :portkey.aws.acm-pca/validity (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.validity/value :portkey.aws.acm-pca.validity/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca/max-results (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.acm-pca.tag/key (clojure.spec.alpha/and :portkey.aws.acm-pca/tag-key))
(clojure.spec.alpha/def :portkey.aws.acm-pca.tag/value (clojure.spec.alpha/and :portkey.aws.acm-pca/tag-value))
(clojure.spec.alpha/def :portkey.aws.acm-pca/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.tag/key] :opt-un [:portkey.aws.acm-pca.tag/value]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.get-certificate-authority-csr-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/get-certificate-authority-csr-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.get-certificate-authority-csr-request/certificate-authority-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca/signing-algorithm #{:sha-256-withecdsa "SHA256WITHECDSA" :sha-512-withrsa :sha-384-withrsa "SHA384WITHECDSA" "SHA512WITHRSA" "SHA384WITHRSA" "SHA256WITHRSA" "SHA512WITHECDSA" :sha-512-withecdsa :sha-256-withrsa :sha-384-withecdsa})

(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-body (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm-pca/audit-report-response-format #{"CSV" :csv "JSON" :json})

(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-authority-status #{:deleted "DISABLED" :disabled :creating "EXPIRED" "PENDING_CERTIFICATE" :active :pending-certificate "CREATING" "ACTIVE" "FAILED" :expired "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.acm-pca.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.describe-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/describe-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.describe-certificate-authority-request/certificate-authority-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.request-failed-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/request-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.request-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/csr-body (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm-pca/positive-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.acm-pca.request-already-processed-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca/request-already-processed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.request-already-processed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.import-certificate-authority-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.import-certificate-authority-certificate-request/certificate (clojure.spec.alpha/and :portkey.aws.acm-pca/certificate-body-blob))
(clojure.spec.alpha/def :portkey.aws.acm-pca.import-certificate-authority-certificate-request/certificate-chain (clojure.spec.alpha/and :portkey.aws.acm-pca/certificate-chain-blob))
(clojure.spec.alpha/def :portkey.aws.acm-pca/import-certificate-authority-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.import-certificate-authority-certificate-request/certificate-authority-arn :portkey.aws.acm-pca.import-certificate-authority-certificate-request/certificate :portkey.aws.acm-pca.import-certificate-authority-certificate-request/certificate-chain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.get-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.get-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/get-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.get-certificate-request/certificate-authority-arn :portkey.aws.acm-pca.get-certificate-request/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-authorities (clojure.spec.alpha/coll-of :portkey.aws.acm-pca/certificate-authority))

(clojure.spec.alpha/def :portkey.aws.acm-pca/string-16 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 16))))

(clojure.spec.alpha/def :portkey.aws.acm-pca/integer-1-to-5000 (clojure.spec.alpha/int-in 1 5000))

(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority/serial (clojure.spec.alpha/and :portkey.aws.acm-pca/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority/not-before (clojure.spec.alpha/and :portkey.aws.acm-pca/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority/type (clojure.spec.alpha/and :portkey.aws.acm-pca/certificate-authority-type))
(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority/status (clojure.spec.alpha/and :portkey.aws.acm-pca/certificate-authority-status))
(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority/restorable-until (clojure.spec.alpha/and :portkey.aws.acm-pca/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority/not-after (clojure.spec.alpha/and :portkey.aws.acm-pca/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority/created-at (clojure.spec.alpha/and :portkey.aws.acm-pca/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.certificate-authority/last-state-change-at (clojure.spec.alpha/and :portkey.aws.acm-pca/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca/certificate-authority (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.certificate-authority/serial :portkey.aws.acm-pca.certificate-authority/not-before :portkey.aws.acm-pca.certificate-authority/type :portkey.aws.acm-pca/certificate-authority-configuration :portkey.aws.acm-pca.certificate-authority/status :portkey.aws.acm-pca/failure-reason :portkey.aws.acm-pca.certificate-authority/restorable-until :portkey.aws.acm-pca/revocation-configuration :portkey.aws.acm-pca.certificate-authority/not-after :portkey.aws.acm-pca/arn :portkey.aws.acm-pca.certificate-authority/created-at :portkey.aws.acm-pca.certificate-authority/last-state-change-at]))

(clojure.spec.alpha/def :portkey.aws.acm-pca/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.acm-pca/list-certificate-authorities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca/next-token :portkey.aws.acm-pca/max-results]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.list-tags-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.list-tags-request/certificate-authority-arn] :opt-un [:portkey.aws.acm-pca/next-token :portkey.aws.acm-pca/max-results]))

(clojure.core/defn list-certificate-authorities "Lists the private certificate authorities that you created by using the\nCreateCertificateAuthority operation." ([] (list-certificate-authorities {})) ([list-certificate-authorities-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-certificate-authorities-request list-certificate-authorities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/list-certificate-authorities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/list-certificate-authorities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCertificateAuthorities", :http.request.configuration/output-deser-fn response-list-certificate-authorities-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.acm-pca/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-certificate-authorities :args (clojure.spec.alpha/? :portkey.aws.acm-pca/list-certificate-authorities-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/list-certificate-authorities-response))

(clojure.core/defn restore-certificate-authority "Restores a certificate authority (CA) that is in the DELETED state. You can\nrestore a CA during the period that you defined in the\nPermanentDeletionTimeInDays parameter of the DeleteCertificateAuthority\noperation. Currently, you can specify 7 to 30 days. If you did not specify a\nPermanentDeletionTimeInDays value, by default you can restore the CA at any time\nin a 30 day period. You can check the time remaining in the restoration period\nof a private CA in the DELETED state by calling the DescribeCertificateAuthority\nor ListCertificateAuthorities operations. The status of a restored CA is set to\nits pre-deletion status when the RestoreCertificateAuthority operation returns.\nTo change its status to ACTIVE, call the UpdateCertificateAuthority operation.\nIf the private CA was in the PENDING_CERTIFICATE state at deletion, you must use\nthe ImportCertificateAuthorityCertificate operation to import a certificate\nauthority into the private CA before it can be activated. You cannot restore a\nCA after the restoration period has ended." ([restore-certificate-authority-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-restore-certificate-authority-request restore-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/restore-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef restore-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/restore-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn list-tags "Lists the tags, if any, that are associated with your private CA. Tags are\nlabels that you can use to identify and organize your CAs. Each tag consists of\na key and an optional value. Call the TagCertificateAuthority operation to add\none or more tags to your CA. Call the UntagCertificateAuthority operation to\nremove tags." ([list-tags-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/list-tags-response))

(clojure.core/defn update-certificate-authority "Updates the status or configuration of a private certificate authority (CA).\nYour private CA must be in the ACTIVE or DISABLED state before you can update\nit. You can disable a private CA that is in the ACTIVE state or make a CA that\nis in the DISABLED state active again." ([update-certificate-authority-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-certificate-authority-request update-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/update-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.acm-pca/concurrent-modification-exception, "ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArgsException" :portkey.aws.acm-pca/invalid-args-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception, "InvalidPolicyException" :portkey.aws.acm-pca/invalid-policy-exception}})))))
(clojure.spec.alpha/fdef update-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/update-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn get-certificate "Retrieves a certificate from your private CA. The ARN of the certificate is\nreturned when you call the IssueCertificate operation. You must specify both the\nARN of your private CA and the ARN of the issued certificate when calling the\nGetCertificate operation. You can retrieve the certificate if it is in the\nISSUED state. You can call the CreateCertificateAuthorityAuditReport operation\nto create a report that contains information about all of the certificates\nissued and revoked by your private CA." ([get-certificate-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-certificate-request get-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/get-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/get-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCertificate", :http.request.configuration/output-deser-fn response-get-certificate-response, :http.request.spec/error-spec {"RequestInProgressException" :portkey.aws.acm-pca/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca/request-failed-exception, "ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception}})))))
(clojure.spec.alpha/fdef get-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/get-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/get-certificate-response))

(clojure.core/defn tag-certificate-authority "Adds one or more tags to your private CA. Tags are labels that you can use to\nidentify and organize your AWS resources. Each tag consists of a key and an\noptional value. You specify the private CA on input by its Amazon Resource Name\n(ARN). You specify the tag by using a key-value pair. You can apply a tag to\njust one private CA if you want to identify a specific characteristic of that\nCA, or you can apply the same tag to multiple private CAs if you want to filter\nfor a common relationship among those CAs. To remove one or more tags, use the\nUntagCertificateAuthority operation. Call the ListTags operation to see what\ntags are associated with your CA." ([tag-certificate-authority-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-tag-certificate-authority-request tag-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/tag-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception, "InvalidTagException" :portkey.aws.acm-pca/invalid-tag-exception, "TooManyTagsException" :portkey.aws.acm-pca/too-many-tags-exception}})))))
(clojure.spec.alpha/fdef tag-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/tag-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn revoke-certificate "Revokes a certificate that you issued by calling the IssueCertificate operation.\nIf you enable a certificate revocation list (CRL) when you create or update your\nprivate CA, information about the revoked certificates will be included in the\nCRL. ACM PCA writes the CRL to an S3 bucket that you specify. For more\ninformation about revocation, see the CrlConfiguration structure. ACM PCA also\nwrites revocation information to the audit report. For more information, see\nCreateCertificateAuthorityAuditReport." ([revoke-certificate-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-revoke-certificate-request revoke-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/revoke-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RevokeCertificate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.acm-pca/concurrent-modification-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception, "LimitExceededException" :portkey.aws.acm-pca/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "RequestAlreadyProcessedException" :portkey.aws.acm-pca/request-already-processed-exception, "RequestInProgressException" :portkey.aws.acm-pca/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca/request-failed-exception}})))))
(clojure.spec.alpha/fdef revoke-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/revoke-certificate-request) :ret clojure.core/true?)

(clojure.core/defn describe-certificate-authority-audit-report "Lists information about a specific audit report created by calling the\nCreateCertificateAuthorityAuditReport operation. Audit information is created\nevery time the certificate authority (CA) private key is used. The private key\nis used when you call the IssueCertificate operation or the RevokeCertificate\noperation." ([describe-certificate-authority-audit-report-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-certificate-authority-audit-report-request describe-certificate-authority-audit-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/describe-certificate-authority-audit-report-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/describe-certificate-authority-audit-report-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCertificateAuthorityAuditReport", :http.request.configuration/output-deser-fn response-describe-certificate-authority-audit-report-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidArgsException" :portkey.aws.acm-pca/invalid-args-exception}})))))
(clojure.spec.alpha/fdef describe-certificate-authority-audit-report :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/describe-certificate-authority-audit-report-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/describe-certificate-authority-audit-report-response))

(clojure.core/defn get-certificate-authority-csr "Retrieves the certificate signing request (CSR) for your private certificate\nauthority (CA). The CSR is created when you call the CreateCertificateAuthority\noperation. Take the CSR to your on-premises X.509 infrastructure and sign it by\nusing your root or a subordinate CA. Then import the signed certificate back\ninto ACM PCA by calling the ImportCertificateAuthorityCertificate operation. The\nCSR is returned as a base64 PEM-encoded string." ([get-certificate-authority-csr-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-certificate-authority-csr-request get-certificate-authority-csr-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/get-certificate-authority-csr-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/get-certificate-authority-csr-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCertificateAuthorityCsr", :http.request.configuration/output-deser-fn response-get-certificate-authority-csr-response, :http.request.spec/error-spec {"RequestInProgressException" :portkey.aws.acm-pca/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca/request-failed-exception, "ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception}})))))
(clojure.spec.alpha/fdef get-certificate-authority-csr :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/get-certificate-authority-csr-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/get-certificate-authority-csr-response))

(clojure.core/defn create-certificate-authority-audit-report "Creates an audit report that lists every time that the your CA private key is\nused. The report is saved in the Amazon S3 bucket that you specify on input. The\nIssueCertificate and RevokeCertificate operations use the private key. You can\ngenerate a new report every 30 minutes." ([create-certificate-authority-audit-report-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-certificate-authority-audit-report-request create-certificate-authority-audit-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/create-certificate-authority-audit-report-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/create-certificate-authority-audit-report-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCertificateAuthorityAuditReport", :http.request.configuration/output-deser-fn response-create-certificate-authority-audit-report-response, :http.request.spec/error-spec {"RequestInProgressException" :portkey.aws.acm-pca/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca/request-failed-exception, "ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidArgsException" :portkey.aws.acm-pca/invalid-args-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception}})))))
(clojure.spec.alpha/fdef create-certificate-authority-audit-report :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/create-certificate-authority-audit-report-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/create-certificate-authority-audit-report-response))

(clojure.core/defn untag-certificate-authority "Remove one or more tags from your private CA. A tag consists of a key-value\npair. If you do not specify the value portion of the tag when calling this\noperation, the tag will be removed regardless of value. If you specify a value,\nthe tag is removed only if it is associated with the specified value. To add\ntags to a private CA, use the TagCertificateAuthority. Call the ListTags\noperation to see what tags are associated with your CA." ([untag-certificate-authority-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-untag-certificate-authority-request untag-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/untag-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception, "InvalidTagException" :portkey.aws.acm-pca/invalid-tag-exception}})))))
(clojure.spec.alpha/fdef untag-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/untag-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn get-certificate-authority-certificate "Retrieves the certificate and certificate chain for your private certificate\nauthority (CA). Both the certificate and the chain are base64 PEM-encoded. The\nchain does not include the CA certificate. Each certificate in the chain signs\nthe one before it." ([get-certificate-authority-certificate-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-certificate-authority-certificate-request get-certificate-authority-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/get-certificate-authority-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/get-certificate-authority-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCertificateAuthorityCertificate", :http.request.configuration/output-deser-fn response-get-certificate-authority-certificate-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef get-certificate-authority-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/get-certificate-authority-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/get-certificate-authority-certificate-response))

(clojure.core/defn describe-certificate-authority "Lists information about your private certificate authority (CA). You specify the\nprivate CA on input by its ARN (Amazon Resource Name). The output contains the\nstatus of your CA. This can be any of the following:\n * CREATING - ACM PCA is creating your private certificate authority.\n * PENDING_CERTIFICATE - The certificate is pending. You must use your\non-premises root or subordinate CA to sign your private CA CSR and then import\nit into PCA.\n * ACTIVE - Your private CA is active.\n * DISABLED - Your private CA has been disabled.\n * EXPIRED - Your private CA certificate has expired.\n * FAILED - Your private CA has failed. Your CA can fail because of problems\nsuch a network outage or backend AWS failure or other errors. A failed CA can\nnever return to the pending state. You must create a new CA.\n * DELETED - Your private CA is within the restoration period, after which it is\npermanently deleted. The length of time remaining in the CA's restoration period\nis also included in this operation's output." ([describe-certificate-authority-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-certificate-authority-request describe-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/describe-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/describe-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCertificateAuthority", :http.request.configuration/output-deser-fn response-describe-certificate-authority-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef describe-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/describe-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/describe-certificate-authority-response))

(clojure.core/defn delete-certificate-authority "Deletes a private certificate authority (CA). You must provide the ARN (Amazon\nResource Name) of the private CA that you want to delete. You can find the ARN\nby calling the ListCertificateAuthorities operation. Before you can delete a CA,\nyou must disable it. Call the UpdateCertificateAuthority operation and set the\nCertificateAuthorityStatus parameter to DISABLED.\n Additionally, you can delete a CA if you are waiting for it to be created (the\nStatus field of the CertificateAuthority is CREATING). You can also delete it if\nthe CA has been created but you haven't yet imported the signed certificate (the\nStatus is PENDING_CERTIFICATE) into ACM PCA.\n If the CA is in one of the aforementioned states and you call\nDeleteCertificateAuthority, the CA's status changes to DELETED. However, the CA\nwon't be permentantly deleted until the restoration period has passed. By\ndefault, if you do not set the PermanentDeletionTimeInDays parameter, the CA\nremains restorable for 30 days. You can set the parameter from 7 to 30 days. The\nDescribeCertificateAuthority operation returns the time remaining in the\nrestoration window of a Private CA in the DELETED state. To restore an eligable\nCA, call the RestoreCertificateAuthority operation." ([delete-certificate-authority-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-certificate-authority-request delete-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/delete-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.acm-pca/concurrent-modification-exception, "ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception}})))))
(clojure.spec.alpha/fdef delete-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/delete-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn issue-certificate "Uses your private certificate authority (CA) to issue a client certificate. This\noperation returns the Amazon Resource Name (ARN) of the certificate. You can\nretrieve the certificate by calling the GetCertificate operation and specifying\nthe ARN.\n You cannot use the ACM ListCertificateAuthorities operation to retrieve the\nARNs of the certificates that you issue by using ACM PCA." ([issue-certificate-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-issue-certificate-request issue-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/issue-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/issue-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "IssueCertificate", :http.request.configuration/output-deser-fn response-issue-certificate-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.acm-pca/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidArgsException" :portkey.aws.acm-pca/invalid-args-exception, "MalformedCSRException" :portkey.aws.acm-pca/malformed-csr-exception}})))))
(clojure.spec.alpha/fdef issue-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/issue-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/issue-certificate-response))

(clojure.core/defn create-certificate-authority "Creates a private subordinate certificate authority (CA). You must specify the\nCA configuration, the revocation configuration, the CA type, and an optional\nidempotency token. The CA configuration specifies the name of the algorithm and\nkey size to be used to create the CA private key, the type of signing algorithm\nthat the CA uses to sign, and X.500 subject information. The CRL (certificate\nrevocation list) configuration specifies the CRL expiration period in days (the\nvalidity period of the CRL), the Amazon S3 bucket that will contain the CRL, and\na CNAME alias for the S3 bucket that is included in certificates issued by the\nCA. If successful, this operation returns the Amazon Resource Name (ARN) of the\nCA." ([create-certificate-authority-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-certificate-authority-request create-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca/create-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/create-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCertificateAuthority", :http.request.configuration/output-deser-fn response-create-certificate-authority-response, :http.request.spec/error-spec {"InvalidArgsException" :portkey.aws.acm-pca/invalid-args-exception, "InvalidPolicyException" :portkey.aws.acm-pca/invalid-policy-exception, "InvalidTagException" :portkey.aws.acm-pca/invalid-tag-exception, "LimitExceededException" :portkey.aws.acm-pca/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/create-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca/create-certificate-authority-response))

(clojure.core/defn import-certificate-authority-certificate "Imports your signed private CA certificate into ACM PCA. Before you can call\nthis operation, you must create the private certificate authority by calling the\nCreateCertificateAuthority operation. You must then generate a certificate\nsigning request (CSR) by calling the GetCertificateAuthorityCsr operation. Take\nthe CSR to your on-premises CA and use the root certificate or a subordinate\ncertificate to sign it. Create a certificate chain and copy the signed\ncertificate and the certificate chain to your working directory.\n Your certificate chain must not include the private CA certificate that you are\nimporting.\n Your on-premises CA certificate must be the last certificate in your chain. The\nsubordinate certificate, if any, that your root CA signed must be next to last.\nThe subordinate certificate signed by the preceding subordinate CA must come\nnext, and so on until your chain is built.\n The chain must be PEM-encoded." ([import-certificate-authority-certificate-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-import-certificate-authority-certificate-request import-certificate-authority-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca/import-certificate-authority-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportCertificateAuthorityCertificate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.acm-pca/concurrent-modification-exception, "RequestInProgressException" :portkey.aws.acm-pca/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca/request-failed-exception, "ResourceNotFoundException" :portkey.aws.acm-pca/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca/invalid-state-exception, "MalformedCertificateException" :portkey.aws.acm-pca/malformed-certificate-exception, "CertificateMismatchException" :portkey.aws.acm-pca/certificate-mismatch-exception}})))))
(clojure.spec.alpha/fdef import-certificate-authority-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca/import-certificate-authority-certificate-request) :ret clojure.core/true?)
