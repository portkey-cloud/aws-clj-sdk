(ns portkey.aws.acm-pca.-2017-08-22 (:require [portkey.aws]))

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

(clojure.core/defn- response-get-certificate-response ([input] (response-get-certificate-response nil input)) ([resultWrapper1484310 input] (clojure.core/let [rawinput1484309 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484311 {"Certificate" (rawinput1484309 "Certificate"), "CertificateChain" (rawinput1484309 "CertificateChain")}] (clojure.core/cond-> {} (letvar1484311 "Certificate") (clojure.core/assoc :certificate (deser-certificate-body (clojure.core/get-in letvar1484311 ["Certificate"]))) (letvar1484311 "CertificateChain") (clojure.core/assoc :certificate-chain (deser-certificate-chain (clojure.core/get-in letvar1484311 ["CertificateChain"])))))))

(clojure.core/defn- response-create-certificate-authority-audit-report-response ([input] (response-create-certificate-authority-audit-report-response nil input)) ([resultWrapper1484313 input] (clojure.core/let [rawinput1484312 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484314 {"AuditReportId" (rawinput1484312 "AuditReportId"), "S3Key" (rawinput1484312 "S3Key")}] (clojure.core/cond-> {} (letvar1484314 "AuditReportId") (clojure.core/assoc :audit-report-id (deser-audit-report-id (clojure.core/get-in letvar1484314 ["AuditReportId"]))) (letvar1484314 "S3Key") (clojure.core/assoc :s-3-key (deser-string (clojure.core/get-in letvar1484314 ["S3Key"])))))))

(clojure.core/defn- response-describe-certificate-authority-audit-report-response ([input] (response-describe-certificate-authority-audit-report-response nil input)) ([resultWrapper1484316 input] (clojure.core/let [rawinput1484315 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484317 {"AuditReportStatus" (rawinput1484315 "AuditReportStatus"), "S3BucketName" (rawinput1484315 "S3BucketName"), "S3Key" (rawinput1484315 "S3Key"), "CreatedAt" (rawinput1484315 "CreatedAt")}] (clojure.core/cond-> {} (letvar1484317 "AuditReportStatus") (clojure.core/assoc :audit-report-status (deser-audit-report-status (clojure.core/get-in letvar1484317 ["AuditReportStatus"]))) (letvar1484317 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-string (clojure.core/get-in letvar1484317 ["S3BucketName"]))) (letvar1484317 "S3Key") (clojure.core/assoc :s-3-key (deser-string (clojure.core/get-in letvar1484317 ["S3Key"]))) (letvar1484317 "CreatedAt") (clojure.core/assoc :created-at (deser-t-stamp (clojure.core/get-in letvar1484317 ["CreatedAt"])))))))

(clojure.core/defn- response-malformed-csr-exception ([input] (response-malformed-csr-exception nil input)) ([resultWrapper1484319 input] (clojure.core/let [rawinput1484318 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484320 {"message" (rawinput1484318 "message")}] (clojure.core/cond-> {} (letvar1484320 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484320 ["message"])))))))

(clojure.core/defn- response-get-certificate-authority-certificate-response ([input] (response-get-certificate-authority-certificate-response nil input)) ([resultWrapper1484322 input] (clojure.core/let [rawinput1484321 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484323 {"Certificate" (rawinput1484321 "Certificate"), "CertificateChain" (rawinput1484321 "CertificateChain")}] (clojure.core/cond-> {} (letvar1484323 "Certificate") (clojure.core/assoc :certificate (deser-certificate-body (clojure.core/get-in letvar1484323 ["Certificate"]))) (letvar1484323 "CertificateChain") (clojure.core/assoc :certificate-chain (deser-certificate-chain (clojure.core/get-in letvar1484323 ["CertificateChain"])))))))

(clojure.core/defn- response-create-certificate-authority-response ([input] (response-create-certificate-authority-response nil input)) ([resultWrapper1484325 input] (clojure.core/let [rawinput1484324 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484326 {"CertificateAuthorityArn" (rawinput1484324 "CertificateAuthorityArn")}] (clojure.core/cond-> {} (letvar1484326 "CertificateAuthorityArn") (clojure.core/assoc :certificate-authority-arn (deser-arn (clojure.core/get-in letvar1484326 ["CertificateAuthorityArn"])))))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper1484328 input] (clojure.core/let [rawinput1484327 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484329 {"Tags" (rawinput1484327 "Tags"), "NextToken" (rawinput1484327 "NextToken")}] (clojure.core/cond-> {} (letvar1484329 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1484329 ["Tags"]))) (letvar1484329 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1484329 ["NextToken"])))))))

(clojure.core/defn- response-malformed-certificate-exception ([input] (response-malformed-certificate-exception nil input)) ([resultWrapper1484331 input] (clojure.core/let [rawinput1484330 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484332 {"message" (rawinput1484330 "message")}] (clojure.core/cond-> {} (letvar1484332 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484332 ["message"])))))))

(clojure.core/defn- response-list-certificate-authorities-response ([input] (response-list-certificate-authorities-response nil input)) ([resultWrapper1484334 input] (clojure.core/let [rawinput1484333 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484335 {"CertificateAuthorities" (rawinput1484333 "CertificateAuthorities"), "NextToken" (rawinput1484333 "NextToken")}] (clojure.core/cond-> {} (letvar1484335 "CertificateAuthorities") (clojure.core/assoc :certificate-authorities (deser-certificate-authorities (clojure.core/get-in letvar1484335 ["CertificateAuthorities"]))) (letvar1484335 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1484335 ["NextToken"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1484337 input] (clojure.core/let [rawinput1484336 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484338 {"message" (rawinput1484336 "message")}] (clojure.core/cond-> {} (letvar1484338 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484338 ["message"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1484340 input] (clojure.core/let [rawinput1484339 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484341 {"message" (rawinput1484339 "message")}] (clojure.core/cond-> {} (letvar1484341 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484341 ["message"])))))))

(clojure.core/defn- response-certificate-mismatch-exception ([input] (response-certificate-mismatch-exception nil input)) ([resultWrapper1484343 input] (clojure.core/let [rawinput1484342 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484344 {"message" (rawinput1484342 "message")}] (clojure.core/cond-> {} (letvar1484344 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484344 ["message"])))))))

(clojure.core/defn- response-invalid-arn-exception ([input] (response-invalid-arn-exception nil input)) ([resultWrapper1484346 input] (clojure.core/let [rawinput1484345 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484347 {"message" (rawinput1484345 "message")}] (clojure.core/cond-> {} (letvar1484347 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484347 ["message"])))))))

(clojure.core/defn- response-describe-certificate-authority-response ([input] (response-describe-certificate-authority-response nil input)) ([resultWrapper1484349 input] (clojure.core/let [rawinput1484348 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484350 {"CertificateAuthority" (rawinput1484348 "CertificateAuthority")}] (clojure.core/cond-> {} (letvar1484350 "CertificateAuthority") (clojure.core/assoc :certificate-authority (deser-certificate-authority (clojure.core/get-in letvar1484350 ["CertificateAuthority"])))))))

(clojure.core/defn- response-get-certificate-authority-csr-response ([input] (response-get-certificate-authority-csr-response nil input)) ([resultWrapper1484352 input] (clojure.core/let [rawinput1484351 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484353 {"Csr" (rawinput1484351 "Csr")}] (clojure.core/cond-> {} (letvar1484353 "Csr") (clojure.core/assoc :csr (deser-csr-body (clojure.core/get-in letvar1484353 ["Csr"])))))))

(clojure.core/defn- response-invalid-tag-exception ([input] (response-invalid-tag-exception nil input)) ([resultWrapper1484355 input] (clojure.core/let [rawinput1484354 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484356 {"message" (rawinput1484354 "message")}] (clojure.core/cond-> {} (letvar1484356 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484356 ["message"])))))))

(clojure.core/defn- response-request-in-progress-exception ([input] (response-request-in-progress-exception nil input)) ([resultWrapper1484358 input] (clojure.core/let [rawinput1484357 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484359 {"message" (rawinput1484357 "message")}] (clojure.core/cond-> {} (letvar1484359 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484359 ["message"])))))))

(clojure.core/defn- response-invalid-args-exception ([input] (response-invalid-args-exception nil input)) ([resultWrapper1484361 input] (clojure.core/let [rawinput1484360 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484362 {"message" (rawinput1484360 "message")}] (clojure.core/cond-> {} (letvar1484362 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484362 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1484364 input] (clojure.core/let [rawinput1484363 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484365 {"message" (rawinput1484363 "message")}] (clojure.core/cond-> {} (letvar1484365 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484365 ["message"])))))))

(clojure.core/defn- response-issue-certificate-response ([input] (response-issue-certificate-response nil input)) ([resultWrapper1484367 input] (clojure.core/let [rawinput1484366 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484368 {"CertificateArn" (rawinput1484366 "CertificateArn")}] (clojure.core/cond-> {} (letvar1484368 "CertificateArn") (clojure.core/assoc :certificate-arn (deser-arn (clojure.core/get-in letvar1484368 ["CertificateArn"])))))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper1484370 input] (clojure.core/let [rawinput1484369 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484371 {"message" (rawinput1484369 "message")}] (clojure.core/cond-> {} (letvar1484371 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484371 ["message"])))))))

(clojure.core/defn- response-invalid-policy-exception ([input] (response-invalid-policy-exception nil input)) ([resultWrapper1484373 input] (clojure.core/let [rawinput1484372 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484374 {"message" (rawinput1484372 "message")}] (clojure.core/cond-> {} (letvar1484374 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484374 ["message"])))))))

(clojure.core/defn- response-invalid-state-exception ([input] (response-invalid-state-exception nil input)) ([resultWrapper1484376 input] (clojure.core/let [rawinput1484375 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484377 {"message" (rawinput1484375 "message")}] (clojure.core/cond-> {} (letvar1484377 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484377 ["message"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1484379 input] (clojure.core/let [rawinput1484378 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484380 {"message" (rawinput1484378 "message")}] (clojure.core/cond-> {} (letvar1484380 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484380 ["message"])))))))

(clojure.core/defn- response-request-failed-exception ([input] (response-request-failed-exception nil input)) ([resultWrapper1484382 input] (clojure.core/let [rawinput1484381 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484383 {"message" (rawinput1484381 "message")}] (clojure.core/cond-> {} (letvar1484383 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484383 ["message"])))))))

(clojure.core/defn- response-request-already-processed-exception ([input] (response-request-already-processed-exception nil input)) ([resultWrapper1484385 input] (clojure.core/let [rawinput1484384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1484386 {"message" (rawinput1484384 "message")}] (clojure.core/cond-> {} (letvar1484386 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1484386 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/validity-period-type #{"ABSOLUTE" :end-date "DAYS" "YEARS" :months :days :absolute :years "MONTHS" "END_DATE"})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.get-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/certificate-body))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/get-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.get-certificate-response/certificate :portkey.aws.acm-pca.-2017-08-22/certificate-chain]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-audit-report-response/s-3-key (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-audit-report-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22/audit-report-id :portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-audit-report-response/s-3-key]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-chain-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string-3-to-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.update-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.update-certificate-authority-request/status (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/certificate-authority-status))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/update-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.update-certificate-authority-request/certificate-authority-arn] :opt-un [:portkey.aws.acm-pca.-2017-08-22/revocation-configuration :portkey.aws.acm-pca.-2017-08-22.update-certificate-authority-request/status]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-authority-type #{"SUBORDINATE" :subordinate})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/csr-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-audit-report-response/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-audit-report-response/s-3-key (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-audit-report-response/created-at (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-audit-report-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22/audit-report-status :portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-audit-report-response/s-3-bucket-name :portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-audit-report-response/s-3-key :portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-audit-report-response/created-at]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.revoke-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.revoke-certificate-request/certificate-serial (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-128))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/revoke-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.revoke-certificate-request/certificate-authority-arn :portkey.aws.acm-pca.-2017-08-22.revoke-certificate-request/certificate-serial :portkey.aws.acm-pca.-2017-08-22/revocation-reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-request/tags (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22/certificate-authority-configuration :portkey.aws.acm-pca.-2017-08-22/certificate-authority-type] :opt-un [:portkey.aws.acm-pca.-2017-08-22/revocation-configuration :portkey.aws.acm-pca.-2017-08-22/idempotency-token :portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-request/tags]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.malformed-csr-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/malformed-csr-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.malformed-csr-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/audit-report-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 36 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 36)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-z0-9]{8}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{12}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.get-certificate-authority-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/certificate-body))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.get-certificate-authority-certificate-response/certificate :portkey.aws.acm-pca.-2017-08-22/certificate-chain]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/distinguished-name-qualifier-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9'()+-.?:/= ]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority-configuration/subject (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/asn-1-subject))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-authority-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22/key-algorithm :portkey.aws.acm-pca.-2017-08-22/signing-algorithm :portkey.aws.acm-pca.-2017-08-22.certificate-authority-configuration/subject] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-response/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-response/certificate-authority-arn]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.list-tags-response/tags (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.list-tags-response/tags :portkey.aws.acm-pca.-2017-08-22/next-token]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string-128 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string-3 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.get-certificate-authority-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.get-certificate-authority-certificate-request/certificate-authority-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.malformed-certificate-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/malformed-certificate-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.malformed-certificate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.tag-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.tag-certificate-authority-request/tags (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/tag-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.tag-certificate-authority-request/certificate-authority-arn :portkey.aws.acm-pca.-2017-08-22.tag-certificate-authority-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/audit-report-status #{"SUCCESS" :creating :success "CREATING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/list-certificate-authorities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22/certificate-authorities :portkey.aws.acm-pca.-2017-08-22/next-token]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string-40 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.crl-configuration/enabled (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/boolean))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.crl-configuration/expiration-in-days (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/integer-1-to-5000))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.crl-configuration/custom-cname (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-253))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.crl-configuration/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-3-to-255))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/crl-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.crl-configuration/enabled] :opt-un [:portkey.aws.acm-pca.-2017-08-22.crl-configuration/expiration-in-days :portkey.aws.acm-pca.-2017-08-22.crl-configuration/custom-cname :portkey.aws.acm-pca.-2017-08-22.crl-configuration/s-3-bucket-name]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.certificate-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/country-code-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[A-Za-z]{2}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.invalid-arn-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.invalid-arn-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22/certificate-authority]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.get-certificate-authority-csr-response/csr (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/csr-body))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-csr-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.get-certificate-authority-csr-response/csr]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/tag-list (clojure.spec.alpha/coll-of :portkey.aws.acm-pca.-2017-08-22/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.invalid-tag-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.invalid-tag-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string-253 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 253))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.request-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/request-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.request-in-progress-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.invalid-args-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/invalid-args-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.invalid-args-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-audit-report-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-audit-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-audit-report-request/certificate-authority-arn :portkey.aws.acm-pca.-2017-08-22/audit-report-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.issue-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/issue-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.issue-certificate-response/certificate-arn]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.untag-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.untag-certificate-authority-request/tags (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/tag-list))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/untag-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.untag-certificate-authority-request/certificate-authority-arn :portkey.aws.acm-pca.-2017-08-22.untag-certificate-authority-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-chain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/country (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/country-code-string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/organization (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/pseudonym (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-128))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/surname (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-40))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/title (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/distinguished-name-qualifier (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/distinguished-name-qualifier-string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/initials (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-5))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/locality (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-128))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/generation-qualifier (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-3))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/common-name (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/given-name (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-16))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/serial-number (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/state (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-128))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/organizational-unit (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string-64))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/asn-1-subject (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.asn-1-subject/country :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/organization :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/pseudonym :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/surname :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/title :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/distinguished-name-qualifier :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/initials :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/locality :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/generation-qualifier :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/common-name :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/given-name :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/serial-number :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/state :portkey.aws.acm-pca.-2017-08-22.asn-1-subject/organizational-unit]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/key-algorithm #{:ec-secp-384r-1 :ec-prime-256v-1 "RSA_4096" "EC_prime256v1" :rsa-4096 "EC_secp384r1" "RSA_2048" :rsa-2048})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.issue-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.issue-certificate-request/csr (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/csr-blob))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/issue-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.issue-certificate-request/certificate-authority-arn :portkey.aws.acm-pca.-2017-08-22.issue-certificate-request/csr :portkey.aws.acm-pca.-2017-08-22/signing-algorithm :portkey.aws.acm-pca.-2017-08-22/validity] :opt-un [:portkey.aws.acm-pca.-2017-08-22/idempotency-token]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/failure-reason #{:unsupported-algorithm :request-timed-out :other "REQUEST_TIMED_OUT" "UNSUPPORTED_ALGORITHM" "OTHER"})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-body-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-audit-report-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-audit-report-request/s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-audit-report-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-audit-report-request/certificate-authority-arn :portkey.aws.acm-pca.-2017-08-22.create-certificate-authority-audit-report-request/s-3-bucket-name :portkey.aws.acm-pca.-2017-08-22/audit-report-response-format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.too-many-tags-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.too-many-tags-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/revocation-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22/crl-configuration]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/t-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/revocation-reason #{"PRIVILEGE_WITHDRAWN" :privilege-withdrawn :unspecified "CERTIFICATE_AUTHORITY_COMPROMISE" :certificate-authority-compromise "SUPERSEDED" :superseded "AFFILIATION_CHANGED" "KEY_COMPROMISE" :key-compromise :a-a-compromise "UNSPECIFIED" :cessation-of-operation "CESSATION_OF_OPERATION" "A_A_COMPROMISE" :affiliation-changed})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.restore-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/restore-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.restore-certificate-authority-request/certificate-authority-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string-5 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 5 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 200)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"arn:[\w+=/,.@-]+:[\w+=/,.@-]+:[\w+=/,.@-]*:[0-9]+:[\w+=,.@-]+(/[\w+=/,.@-]+)*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 36)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/permanent-deletion-time-in-days (clojure.spec.alpha/int-in 7 30))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.delete-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/delete-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.delete-certificate-authority-request/certificate-authority-arn] :opt-un [:portkey.aws.acm-pca.-2017-08-22/permanent-deletion-time-in-days]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.invalid-policy-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/invalid-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.invalid-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.validity/value (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/positive-long))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.validity/type (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/validity-period-type))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/validity (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.validity/value :portkey.aws.acm-pca.-2017-08-22.validity/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/max-results (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.tag/key (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/tag-key))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.tag/value (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/tag-value))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.tag/key] :opt-un [:portkey.aws.acm-pca.-2017-08-22.tag/value]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.get-certificate-authority-csr-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-csr-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.get-certificate-authority-csr-request/certificate-authority-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/signing-algorithm #{:sha-256-withecdsa "SHA256WITHECDSA" :sha-512-withrsa :sha-384-withrsa "SHA384WITHECDSA" "SHA512WITHRSA" "SHA384WITHRSA" "SHA256WITHRSA" "SHA512WITHECDSA" :sha-512-withecdsa :sha-256-withrsa :sha-384-withecdsa})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-body (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/audit-report-response-format #{"CSV" :csv "JSON" :json})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-authority-status #{:deleted "DISABLED" :disabled :creating "EXPIRED" "PENDING_CERTIFICATE" :active :pending-certificate "CREATING" "ACTIVE" "FAILED" :expired "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.describe-certificate-authority-request/certificate-authority-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.request-failed-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/request-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.request-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/csr-body (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/positive-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.request-already-processed-exception/message (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/request-already-processed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.request-already-processed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.import-certificate-authority-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.import-certificate-authority-certificate-request/certificate (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/certificate-body-blob))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.import-certificate-authority-certificate-request/certificate-chain (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/certificate-chain-blob))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/import-certificate-authority-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.import-certificate-authority-certificate-request/certificate-authority-arn :portkey.aws.acm-pca.-2017-08-22.import-certificate-authority-certificate-request/certificate :portkey.aws.acm-pca.-2017-08-22.import-certificate-authority-certificate-request/certificate-chain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.get-certificate-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.get-certificate-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/get-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.get-certificate-request/certificate-authority-arn :portkey.aws.acm-pca.-2017-08-22.get-certificate-request/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-authorities (clojure.spec.alpha/coll-of :portkey.aws.acm-pca.-2017-08-22/certificate-authority))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/string-16 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 16))))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/integer-1-to-5000 (clojure.spec.alpha/int-in 1 5000))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority/serial (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/string))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority/not-before (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority/type (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/certificate-authority-type))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority/status (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/certificate-authority-status))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority/restorable-until (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority/not-after (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority/created-at (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.certificate-authority/last-state-change-at (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/t-stamp))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/certificate-authority (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22.certificate-authority/serial :portkey.aws.acm-pca.-2017-08-22.certificate-authority/not-before :portkey.aws.acm-pca.-2017-08-22.certificate-authority/type :portkey.aws.acm-pca.-2017-08-22/certificate-authority-configuration :portkey.aws.acm-pca.-2017-08-22.certificate-authority/status :portkey.aws.acm-pca.-2017-08-22/failure-reason :portkey.aws.acm-pca.-2017-08-22.certificate-authority/restorable-until :portkey.aws.acm-pca.-2017-08-22/revocation-configuration :portkey.aws.acm-pca.-2017-08-22.certificate-authority/not-after :portkey.aws.acm-pca.-2017-08-22/arn :portkey.aws.acm-pca.-2017-08-22.certificate-authority/created-at :portkey.aws.acm-pca.-2017-08-22.certificate-authority/last-state-change-at]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/list-certificate-authorities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.acm-pca.-2017-08-22/next-token :portkey.aws.acm-pca.-2017-08-22/max-results]))

(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22.list-tags-request/certificate-authority-arn (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/arn))
(clojure.spec.alpha/def :portkey.aws.acm-pca.-2017-08-22/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.acm-pca.-2017-08-22.list-tags-request/certificate-authority-arn] :opt-un [:portkey.aws.acm-pca.-2017-08-22/next-token :portkey.aws.acm-pca.-2017-08-22/max-results]))

(clojure.core/defn list-certificate-authorities ([] (list-certificate-authorities {})) ([list-certificate-authorities-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-certificate-authorities-request list-certificate-authorities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/list-certificate-authorities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/list-certificate-authorities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCertificateAuthorities", :http.request.configuration/output-deser-fn response-list-certificate-authorities-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.acm-pca.-2017-08-22/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-certificate-authorities :args (clojure.spec.alpha/? :portkey.aws.acm-pca.-2017-08-22/list-certificate-authorities-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/list-certificate-authorities-response))

(clojure.core/defn restore-certificate-authority ([restore-certificate-authority-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-restore-certificate-authority-request restore-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/restore-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef restore-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/restore-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/list-tags-response))

(clojure.core/defn update-certificate-authority ([update-certificate-authority-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-certificate-authority-request update-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/update-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.acm-pca.-2017-08-22/concurrent-modification-exception, "ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArgsException" :portkey.aws.acm-pca.-2017-08-22/invalid-args-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception, "InvalidPolicyException" :portkey.aws.acm-pca.-2017-08-22/invalid-policy-exception}})))))
(clojure.spec.alpha/fdef update-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/update-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn get-certificate ([get-certificate-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-certificate-request get-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/get-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/get-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCertificate", :http.request.configuration/output-deser-fn response-get-certificate-response, :http.request.spec/error-spec {"RequestInProgressException" :portkey.aws.acm-pca.-2017-08-22/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca.-2017-08-22/request-failed-exception, "ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception}})))))
(clojure.spec.alpha/fdef get-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/get-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/get-certificate-response))

(clojure.core/defn tag-certificate-authority ([tag-certificate-authority-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-certificate-authority-request tag-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/tag-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception, "InvalidTagException" :portkey.aws.acm-pca.-2017-08-22/invalid-tag-exception, "TooManyTagsException" :portkey.aws.acm-pca.-2017-08-22/too-many-tags-exception}})))))
(clojure.spec.alpha/fdef tag-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/tag-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn revoke-certificate ([revoke-certificate-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-revoke-certificate-request revoke-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/revoke-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RevokeCertificate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.acm-pca.-2017-08-22/concurrent-modification-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception, "LimitExceededException" :portkey.aws.acm-pca.-2017-08-22/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "RequestAlreadyProcessedException" :portkey.aws.acm-pca.-2017-08-22/request-already-processed-exception, "RequestInProgressException" :portkey.aws.acm-pca.-2017-08-22/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca.-2017-08-22/request-failed-exception}})))))
(clojure.spec.alpha/fdef revoke-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/revoke-certificate-request) :ret clojure.core/true?)

(clojure.core/defn describe-certificate-authority-audit-report ([describe-certificate-authority-audit-report-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-certificate-authority-audit-report-request describe-certificate-authority-audit-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-audit-report-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-audit-report-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCertificateAuthorityAuditReport", :http.request.configuration/output-deser-fn response-describe-certificate-authority-audit-report-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidArgsException" :portkey.aws.acm-pca.-2017-08-22/invalid-args-exception}})))))
(clojure.spec.alpha/fdef describe-certificate-authority-audit-report :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-audit-report-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-audit-report-response))

(clojure.core/defn get-certificate-authority-csr ([get-certificate-authority-csr-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-certificate-authority-csr-request get-certificate-authority-csr-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-csr-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-csr-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCertificateAuthorityCsr", :http.request.configuration/output-deser-fn response-get-certificate-authority-csr-response, :http.request.spec/error-spec {"RequestInProgressException" :portkey.aws.acm-pca.-2017-08-22/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca.-2017-08-22/request-failed-exception, "ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception}})))))
(clojure.spec.alpha/fdef get-certificate-authority-csr :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-csr-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-csr-response))

(clojure.core/defn create-certificate-authority-audit-report ([create-certificate-authority-audit-report-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-certificate-authority-audit-report-request create-certificate-authority-audit-report-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-audit-report-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-audit-report-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCertificateAuthorityAuditReport", :http.request.configuration/output-deser-fn response-create-certificate-authority-audit-report-response, :http.request.spec/error-spec {"RequestInProgressException" :portkey.aws.acm-pca.-2017-08-22/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca.-2017-08-22/request-failed-exception, "ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidArgsException" :portkey.aws.acm-pca.-2017-08-22/invalid-args-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception}})))))
(clojure.spec.alpha/fdef create-certificate-authority-audit-report :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-audit-report-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-audit-report-response))

(clojure.core/defn untag-certificate-authority ([untag-certificate-authority-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-certificate-authority-request untag-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/untag-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception, "InvalidTagException" :portkey.aws.acm-pca.-2017-08-22/invalid-tag-exception}})))))
(clojure.spec.alpha/fdef untag-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/untag-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn get-certificate-authority-certificate ([get-certificate-authority-certificate-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-certificate-authority-certificate-request get-certificate-authority-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCertificateAuthorityCertificate", :http.request.configuration/output-deser-fn response-get-certificate-authority-certificate-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef get-certificate-authority-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/get-certificate-authority-certificate-response))

(clojure.core/defn describe-certificate-authority ([describe-certificate-authority-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-certificate-authority-request describe-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCertificateAuthority", :http.request.configuration/output-deser-fn response-describe-certificate-authority-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef describe-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/describe-certificate-authority-response))

(clojure.core/defn delete-certificate-authority ([delete-certificate-authority-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-certificate-authority-request delete-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/delete-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCertificateAuthority", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.acm-pca.-2017-08-22/concurrent-modification-exception, "ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception}})))))
(clojure.spec.alpha/fdef delete-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/delete-certificate-authority-request) :ret clojure.core/true?)

(clojure.core/defn issue-certificate ([issue-certificate-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-issue-certificate-request issue-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/issue-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/issue-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "IssueCertificate", :http.request.configuration/output-deser-fn response-issue-certificate-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.acm-pca.-2017-08-22/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidArgsException" :portkey.aws.acm-pca.-2017-08-22/invalid-args-exception, "MalformedCSRException" :portkey.aws.acm-pca.-2017-08-22/malformed-csr-exception}})))))
(clojure.spec.alpha/fdef issue-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/issue-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/issue-certificate-response))

(clojure.core/defn create-certificate-authority ([create-certificate-authority-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-certificate-authority-request create-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCertificateAuthority", :http.request.configuration/output-deser-fn response-create-certificate-authority-response, :http.request.spec/error-spec {"InvalidArgsException" :portkey.aws.acm-pca.-2017-08-22/invalid-args-exception, "InvalidPolicyException" :portkey.aws.acm-pca.-2017-08-22/invalid-policy-exception, "InvalidTagException" :portkey.aws.acm-pca.-2017-08-22/invalid-tag-exception, "LimitExceededException" :portkey.aws.acm-pca.-2017-08-22/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.acm-pca.-2017-08-22/create-certificate-authority-response))

(clojure.core/defn import-certificate-authority-certificate ([import-certificate-authority-certificate-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-import-certificate-authority-certificate-request import-certificate-authority-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.acm-pca.-2017-08-22/endpoints, :http.request.configuration/target-prefix "ACMPrivateCA", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-08-22", :http.request.configuration/service-id "ACM PCA", :http.request.spec/input-spec :portkey.aws.acm-pca.-2017-08-22/import-certificate-authority-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportCertificateAuthorityCertificate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.acm-pca.-2017-08-22/concurrent-modification-exception, "RequestInProgressException" :portkey.aws.acm-pca.-2017-08-22/request-in-progress-exception, "RequestFailedException" :portkey.aws.acm-pca.-2017-08-22/request-failed-exception, "ResourceNotFoundException" :portkey.aws.acm-pca.-2017-08-22/resource-not-found-exception, "InvalidArnException" :portkey.aws.acm-pca.-2017-08-22/invalid-arn-exception, "InvalidStateException" :portkey.aws.acm-pca.-2017-08-22/invalid-state-exception, "MalformedCertificateException" :portkey.aws.acm-pca.-2017-08-22/malformed-certificate-exception, "CertificateMismatchException" :portkey.aws.acm-pca.-2017-08-22/certificate-mismatch-exception}})))))
(clojure.spec.alpha/fdef import-certificate-authority-certificate :args (clojure.spec.alpha/tuple :portkey.aws.acm-pca.-2017-08-22/import-certificate-authority-certificate-request) :ret clojure.core/true?)
