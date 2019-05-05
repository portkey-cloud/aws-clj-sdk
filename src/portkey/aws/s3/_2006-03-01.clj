(ns portkey.aws.s3.-2006-03-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "s3", :region "us-gov-east-1"},
    :ssl-common-name "s3.us-gov-east-1.amazonaws.com",
    :endpoint "https://s3.us-gov-east-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-northeast-1"
   {:credential-scope {:service "s3", :region "ap-northeast-1"},
    :ssl-common-name "s3.ap-northeast-1.amazonaws.com",
    :endpoint "https://s3.ap-northeast-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-west-1"
   {:credential-scope {:service "s3", :region "eu-west-1"},
    :ssl-common-name "s3.eu-west-1.amazonaws.com",
    :endpoint "https://s3.eu-west-1.amazonaws.com",
    :signature-version :s3v4},
   "fips-us-gov-west-1"
   {:credential-scope {:service "s3", :region "us-gov-west-1"},
    :ssl-common-name "s3-fips-us-gov-west-1.amazonaws.com",
    :endpoint "https://s3-fips-us-gov-west-1.amazonaws.com",
    :signature-version :s3v4},
   "s3-external-1"
   {:credential-scope {:service "s3", :region "us-east-1"},
    :ssl-common-name "s3-external-1.amazonaws.com",
    :endpoint "https://s3-external-1.amazonaws.com",
    :signature-version :s3v4},
   "us-east-2"
   {:credential-scope {:service "s3", :region "us-east-2"},
    :ssl-common-name "s3.us-east-2.amazonaws.com",
    :endpoint "https://s3.us-east-2.amazonaws.com",
    :signature-version :s3v4},
   "ap-southeast-2"
   {:credential-scope {:service "s3", :region "ap-southeast-2"},
    :ssl-common-name "s3.ap-southeast-2.amazonaws.com",
    :endpoint "https://s3.ap-southeast-2.amazonaws.com",
    :signature-version :s3v4},
   "cn-north-1"
   {:credential-scope {:service "s3", :region "cn-north-1"},
    :ssl-common-name "s3.cn-north-1.amazonaws.com.cn",
    :endpoint "https://s3.cn-north-1.amazonaws.com.cn",
    :signature-version :s3v4},
   "sa-east-1"
   {:credential-scope {:service "s3", :region "sa-east-1"},
    :ssl-common-name "s3.sa-east-1.amazonaws.com",
    :endpoint "https://s3.sa-east-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-southeast-1"
   {:credential-scope {:service "s3", :region "ap-southeast-1"},
    :ssl-common-name "s3.ap-southeast-1.amazonaws.com",
    :endpoint "https://s3.ap-southeast-1.amazonaws.com",
    :signature-version :s3v4},
   "cn-northwest-1"
   {:credential-scope {:service "s3", :region "cn-northwest-1"},
    :ssl-common-name "s3.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://s3.cn-northwest-1.amazonaws.com.cn",
    :signature-version :s3v4},
   "ap-northeast-2"
   {:credential-scope {:service "s3", :region "ap-northeast-2"},
    :ssl-common-name "s3.ap-northeast-2.amazonaws.com",
    :endpoint "https://s3.ap-northeast-2.amazonaws.com",
    :signature-version :s3v4},
   "eu-west-3"
   {:credential-scope {:service "s3", :region "eu-west-3"},
    :ssl-common-name "s3.eu-west-3.amazonaws.com",
    :endpoint "https://s3.eu-west-3.amazonaws.com",
    :signature-version :s3v4},
   "ca-central-1"
   {:credential-scope {:service "s3", :region "ca-central-1"},
    :ssl-common-name "s3.ca-central-1.amazonaws.com",
    :endpoint "https://s3.ca-central-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-central-1"
   {:credential-scope {:service "s3", :region "eu-central-1"},
    :ssl-common-name "s3.eu-central-1.amazonaws.com",
    :endpoint "https://s3.eu-central-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-west-2"
   {:credential-scope {:service "s3", :region "eu-west-2"},
    :ssl-common-name "s3.eu-west-2.amazonaws.com",
    :endpoint "https://s3.eu-west-2.amazonaws.com",
    :signature-version :s3v4},
   "us-gov-west-1"
   {:credential-scope {:service "s3", :region "us-gov-west-1"},
    :ssl-common-name "s3.us-gov-west-1.amazonaws.com",
    :endpoint "https://s3.us-gov-west-1.amazonaws.com",
    :signature-version :s3v4},
   "us-west-2"
   {:credential-scope {:service "s3", :region "us-west-2"},
    :ssl-common-name "s3.us-west-2.amazonaws.com",
    :endpoint "https://s3.us-west-2.amazonaws.com",
    :signature-version :s3v4},
   "us-east-1"
   {:credential-scope {:service "s3", :region "us-east-1"},
    :ssl-common-name "s3.amazonaws.com",
    :endpoint "https://s3.amazonaws.com",
    :signature-version :s3v4},
   "us-west-1"
   {:credential-scope {:service "s3", :region "us-west-1"},
    :ssl-common-name "s3.us-west-1.amazonaws.com",
    :endpoint "https://s3.us-west-1.amazonaws.com",
    :signature-version :s3v4},
   "ap-south-1"
   {:credential-scope {:service "s3", :region "ap-south-1"},
    :ssl-common-name "s3.ap-south-1.amazonaws.com",
    :endpoint "https://s3.ap-south-1.amazonaws.com",
    :signature-version :s3v4},
   "eu-north-1"
   {:credential-scope {:service "s3", :region "eu-north-1"},
    :ssl-common-name "s3.eu-north-1.amazonaws.com",
    :endpoint "https://s3.eu-north-1.amazonaws.com",
    :signature-version :s3v4}})

(clojure.core/declare ser-mfa-delete)

(clojure.core/declare ser-object-lock-token)

(clojure.core/declare ser-metrics-configuration)

(clojure.core/declare ser-cloud-function-invocation-role)

(clojure.core/declare ser-input-serialization)

(clojure.core/declare ser-tier)

(clojure.core/declare ser-content-encoding)

(clojure.core/declare ser-setting)

(clojure.core/declare ser-confirm-remove-self-bucket-access)

(clojure.core/declare ser-compression-type)

(clojure.core/declare ser-tagging-directive)

(clojure.core/declare ser-tag-set)

(clojure.core/declare ser-sse-customer-key-md-5)

(clojure.core/declare ser-routing-rules)

(clojure.core/declare ser-expired-object-delete-marker)

(clojure.core/declare ser-response-expires)

(clojure.core/declare ser-replica-kms-key-id)

(clojure.core/declare ser-completed-part)

(clojure.core/declare ser-notification-id)

(clojure.core/declare ser-copy-source-sse-customer-key)

(clojure.core/declare ser-versioning-configuration)

(clojure.core/declare ser-if-unmodified-since)

(clojure.core/declare ser-object-lock-enabled)

(clojure.core/declare ser-response-content-disposition)

(clojure.core/declare ser-filter-rule-name)

(clojure.core/declare ser-inventory-id)

(clojure.core/declare ser-topic-configuration-list)

(clojure.core/declare ser-access-control-translation)

(clojure.core/declare ser-topic-configuration-deprecated)

(clojure.core/declare ser-object-lock-legal-hold)

(clojure.core/declare ser-glacier-job-parameters)

(clojure.core/declare ser-website-redirect-location)

(clojure.core/declare ser-prefix)

(clojure.core/declare ser-type)

(clojure.core/declare ser-storage-class-analysis-schema-version)

(clojure.core/declare ser-encoding-type)

(clojure.core/declare ser-sse-kms-encrypted-objects-status)

(clojure.core/declare ser-create-bucket-configuration)

(clojure.core/declare ser-encryption-configuration)

(clojure.core/declare ser-inventory-filter)

(clojure.core/declare ser-cloud-function-configuration)

(clojure.core/declare ser-request-payment-configuration)

(clojure.core/declare ser-inventory-optional-field)

(clojure.core/declare ser-permission)

(clojure.core/declare ser-response-content-language)

(clojure.core/declare ser-json-output)

(clojure.core/declare ser-server-side-encryption-configuration)

(clojure.core/declare ser-target-grant)

(clojure.core/declare ser-replication-configuration)

(clojure.core/declare ser-completed-part-list)

(clojure.core/declare ser-comments)

(clojure.core/declare ser-sse-customer-algorithm)

(clojure.core/declare ser-inventory-schedule)

(clojure.core/declare ser-transition)

(clojure.core/declare ser-metadata-directive)

(clojure.core/declare ser-analytics-export-destination)

(clojure.core/declare ser-sse-customer-key)

(clojure.core/declare ser-content-md-5)

(clojure.core/declare ser-storage-class-analysis)

(clojure.core/declare ser-expose-header)

(clojure.core/declare ser-body)

(clojure.core/declare ser-delete-marker-replication-status)

(clojure.core/declare ser-allow-quoted-record-delimiter)

(clojure.core/declare ser-grants)

(clojure.core/declare ser-transition-storage-class)

(clojure.core/declare ser-lifecycle-rule-filter)

(clojure.core/declare ser-payer)

(clojure.core/declare ser-response-content-type)

(clojure.core/declare ser-metrics-filter)

(clojure.core/declare ser-inventory-destination)

(clojure.core/declare ser-object-version-id)

(clojure.core/declare ser-grant-read-acp)

(clojure.core/declare ser-json-input)

(clojure.core/declare ser-days-after-initiation)

(clojure.core/declare ser-restore-request)

(clojure.core/declare ser-replication-rule-filter)

(clojure.core/declare ser-start-after)

(clojure.core/declare ser-inventory-encryption)

(clojure.core/declare ser-record-delimiter)

(clojure.core/declare ser-replace-key-prefix-with)

(clojure.core/declare ser-metrics-and-operator)

(clojure.core/declare ser-object-lock-configuration)

(clojure.core/declare ser-lifecycle-rule)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-analytics-and-operator)

(clojure.core/declare ser-lambda-function-configuration-list)

(clojure.core/declare ser-source-selection-criteria)

(clojure.core/declare ser-access-control-policy)

(clojure.core/declare ser-destination)

(clojure.core/declare ser-max-parts)

(clojure.core/declare ser-public-access-block-configuration)

(clojure.core/declare ser-expiration-status)

(clojure.core/declare ser-metadata-key)

(clojure.core/declare ser-filter-rule-value)

(clojure.core/declare ser-filter-rule-list)

(clojure.core/declare ser-grant-read)

(clojure.core/declare ser-analytics-s-3-bucket-destination)

(clojure.core/declare ser-noncurrent-version-transition-list)

(clojure.core/declare ser-event-list)

(clojure.core/declare ser-expression)

(clojure.core/declare ser-server-side-encryption)

(clojure.core/declare ser-if-modified-since)

(clojure.core/declare ser-mfa)

(clojure.core/declare ser-event)

(clojure.core/declare ser-bucket-canned-acl)

(clojure.core/declare ser-quote-character)

(clojure.core/declare ser-restore-request-type)

(clojure.core/declare ser-quiet)

(clojure.core/declare ser-content-disposition)

(clojure.core/declare ser-error-document)

(clojure.core/declare ser-bypass-governance-retention)

(clojure.core/declare ser-redirect)

(clojure.core/declare ser-output-serialization)

(clojure.core/declare ser-priority)

(clojure.core/declare ser-bucket-logs-permission)

(clojure.core/declare ser-analytics-id)

(clojure.core/declare ser-copy-source-if-match)

(clojure.core/declare ser-http-error-code-returned-equals)

(clojure.core/declare ser-user-metadata)

(clojure.core/declare ser-upload-id-marker)

(clojure.core/declare ser-part-number)

(clojure.core/declare ser-logging-enabled)

(clojure.core/declare ser-date)

(clojure.core/declare ser-inventory-configuration)

(clojure.core/declare ser-allowed-methods)

(clojure.core/declare ser-e-tag)

(clojure.core/declare ser-copy-source-range)

(clojure.core/declare ser-max-uploads)

(clojure.core/declare ser-replication-rule-and-operator)

(clojure.core/declare ser-metrics-id)

(clojure.core/declare ser-owner-override)

(clojure.core/declare ser-multipart-upload-id)

(clojure.core/declare ser-delete)

(clojure.core/declare ser-metadata-value)

(clojure.core/declare ser-bucket-logging-status)

(clojure.core/declare ser-bucket-versioning-status)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-range)

(clojure.core/declare ser-inventory-included-object-versions)

(clojure.core/declare ser-if-match)

(clojure.core/declare ser-role)

(clojure.core/declare ser-server-side-encryption-by-default)

(clojure.core/declare ser-display-name)

(clojure.core/declare ser-cors-rule)

(clojure.core/declare ser-grant)

(clojure.core/declare ser-cors-configuration)

(clojure.core/declare ser-object-lock-rule)

(clojure.core/declare ser-content-length)

(clojure.core/declare ser-topic-configuration)

(clojure.core/declare ser-is-enabled)

(clojure.core/declare ser-field-delimiter)

(clojure.core/declare ser-inventory-s-3-bucket-destination)

(clojure.core/declare ser-csv-output)

(clojure.core/declare ser-metadata-entry)

(clojure.core/declare ser-copy-source-if-none-match)

(clojure.core/declare ser-id)

(clojure.core/declare ser-inventory-frequency)

(clojure.core/declare ser-value)

(clojure.core/declare ser-expose-headers)

(clojure.core/declare ser-transition-list)

(clojure.core/declare ser-analytics-filter)

(clojure.core/declare ser-analytics-s-3-export-file-format)

(clojure.core/declare ser-version-id-marker)

(clojure.core/declare ser-description)

(clojure.core/declare ser-object-key)

(clojure.core/declare ser-allowed-method)

(clojure.core/declare ser-bucket-accelerate-status)

(clojure.core/declare ser-lambda-function-arn)

(clojure.core/declare ser-protocol)

(clojure.core/declare ser-replication-rule)

(clojure.core/declare ser-redirect-all-requests-to)

(clojure.core/declare ser-target-grants)

(clojure.core/declare ser-completed-multipart-upload)

(clojure.core/declare ser-json-type)

(clojure.core/declare ser-filter-rule)

(clojure.core/declare ser-replication-rules)

(clojure.core/declare ser-s-3-key-filter)

(clojure.core/declare ser-target-bucket)

(clojure.core/declare ser-notification-configuration-deprecated)

(clojure.core/declare ser-copy-source-if-modified-since)

(clojure.core/declare ser-replace-key-with)

(clojure.core/declare ser-kms-context)

(clojure.core/declare ser-part-number-marker)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-notification-configuration-filter)

(clojure.core/declare ser-topic-arn)

(clojure.core/declare ser-suffix)

(clojure.core/declare ser-lifecycle-rule-and-operator)

(clojure.core/declare ser-allowed-header)

(clojure.core/declare ser-rule)

(clojure.core/declare ser-routing-rule)

(clojure.core/declare ser-noncurrent-version-expiration)

(clojure.core/declare ser-location-prefix)

(clojure.core/declare ser-delete-marker-replication)

(clojure.core/declare ser-select-parameters)

(clojure.core/declare ser-object-lock-enabled-for-bucket)

(clojure.core/declare ser-tagging-header)

(clojure.core/declare ser-ssekms)

(clojure.core/declare ser-enable-request-progress)

(clojure.core/declare ser-abort-incomplete-multipart-upload)

(clojure.core/declare ser-request-progress)

(clojure.core/declare ser-s-3-location)

(clojure.core/declare ser-copy-source-if-unmodified-since)

(clojure.core/declare ser-http-redirect-code)

(clojure.core/declare ser-uri)

(clojure.core/declare ser-object-canned-acl)

(clojure.core/declare ser-inventory-optional-fields)

(clojure.core/declare ser-owner)

(clojure.core/declare ser-replication-rule-status)

(clojure.core/declare ser-days)

(clojure.core/declare ser-copy-source-sse-customer-algorithm)

(clojure.core/declare ser-object-identifier)

(clojure.core/declare ser-lifecycle-configuration)

(clojure.core/declare ser-grant-write)

(clojure.core/declare ser-storage-class-analysis-data-export)

(clojure.core/declare ser-quote-escape-character)

(clojure.core/declare ser-cors-rules)

(clojure.core/declare ser-object-lock-legal-hold-status)

(clojure.core/declare ser-copy-source-sse-customer-key-md-5)

(clojure.core/declare ser-metadata)

(clojure.core/declare ser-cache-control)

(clojure.core/declare ser-content-language)

(clojure.core/declare ser-bucket-lifecycle-configuration)

(clojure.core/declare ser-object-identifier-list)

(clojure.core/declare ser-policy)

(clojure.core/declare ser-delimiter)

(clojure.core/declare ser-encryption)

(clojure.core/declare ser-grant-write-acp)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-condition)

(clojure.core/declare ser-fetch-owner)

(clojure.core/declare ser-expression-type)

(clojure.core/declare ser-grant-full-control)

(clojure.core/declare ser-queue-arn)

(clojure.core/declare ser-response-content-encoding)

(clojure.core/declare ser-target-prefix)

(clojure.core/declare ser-website-configuration)

(clojure.core/declare ser-server-side-encryption-rules)

(clojure.core/declare ser-notification-configuration)

(clojure.core/declare ser-queue-configuration)

(clojure.core/declare ser-tagging)

(clojure.core/declare ser-host-name)

(clojure.core/declare ser-if-none-match)

(clojure.core/declare ser-storage-class)

(clojure.core/declare ser-server-side-encryption-rule)

(clojure.core/declare ser-rules)

(clojure.core/declare ser-lifecycle-expiration)

(clojure.core/declare ser-inventory-format)

(clojure.core/declare ser-queue-configuration-list)

(clojure.core/declare ser-grantee)

(clojure.core/declare ser-key-prefix-equals)

(clojure.core/declare ser-file-header-info)

(clojure.core/declare ser-output-location)

(clojure.core/declare ser-allowed-headers)

(clojure.core/declare ser-years)

(clojure.core/declare ser-allowed-origins)

(clojure.core/declare ser-bucket-name)

(clojure.core/declare ser-copy-source)

(clojure.core/declare ser-queue-configuration-deprecated)

(clojure.core/declare ser-expires)

(clojure.core/declare ser-max-keys)

(clojure.core/declare ser-lifecycle-rules)

(clojure.core/declare ser-sses-3)

(clojure.core/declare ser-max-age-seconds)

(clojure.core/declare ser-email-address)

(clojure.core/declare ser-object-lock-retain-until-date)

(clojure.core/declare ser-bucket-location-constraint)

(clojure.core/declare ser-ssekms-key-id)

(clojure.core/declare ser-allowed-origin)

(clojure.core/declare ser-token)

(clojure.core/declare ser-accelerate-configuration)

(clojure.core/declare ser-object-lock-mode)

(clojure.core/declare ser-lambda-function-configuration)

(clojure.core/declare ser-default-retention)

(clojure.core/declare ser-csv-input)

(clojure.core/declare ser-noncurrent-version-transition)

(clojure.core/declare ser-quote-fields)

(clojure.core/declare ser-index-document)

(clojure.core/declare ser-key-marker)

(clojure.core/declare ser-parquet-input)

(clojure.core/declare ser-analytics-configuration)

(clojure.core/declare ser-cloud-function)

(clojure.core/declare ser-request-payer)

(clojure.core/declare ser-response-cache-control)

(clojure.core/declare ser-sse-kms-encrypted-objects)

(clojure.core/declare ser-object-lock-retention-mode)

(clojure.core/declare ser-object-lock-retention)

(clojure.core/defn- ser-mfa-delete [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "MFADelete"})

(clojure.core/defn- ser-object-lock-token [input] #:http.request.field{:value input, :shape "ObjectLockToken"})

(clojure.core/defn- ser-metrics-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metrics-id (:id input)) #:http.request.field{:name "Id", :shape "MetricsId"})], :shape "MetricsConfiguration", :type "structure"} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics-filter (input :filter)) #:http.request.field{:name "Filter", :shape "MetricsFilter"}))))

(clojure.core/defn- ser-cloud-function-invocation-role [input] #:http.request.field{:value input, :shape "CloudFunctionInvocationRole"})

(clojure.core/defn- ser-input-serialization [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputSerialization", :type "structure"} (clojure.core/contains? input :csv) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-csv-input (input :csv)) #:http.request.field{:name "CSV", :shape "CSVInput"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionType"})) (clojure.core/contains? input :json) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-json-input (input :json)) #:http.request.field{:name "JSON", :shape "JSONInput"})) (clojure.core/contains? input :parquet) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parquet-input (input :parquet)) #:http.request.field{:name "Parquet", :shape "ParquetInput"}))))

(clojure.core/defn- ser-tier [input] #:http.request.field{:value (clojure.core/get {"Standard" "Standard", :standard "Standard", "Bulk" "Bulk", :bulk "Bulk", "Expedited" "Expedited", :expedited "Expedited"} input), :shape "Tier"})

(clojure.core/defn- ser-content-encoding [input] #:http.request.field{:value input, :shape "ContentEncoding"})

(clojure.core/defn- ser-setting [input] #:http.request.field{:value input, :shape "Setting"})

(clojure.core/defn- ser-confirm-remove-self-bucket-access [input] #:http.request.field{:value input, :shape "ConfirmRemoveSelfBucketAccess"})

(clojure.core/defn- ser-compression-type [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "GZIP" "GZIP", :gzip "GZIP", "BZIP2" "BZIP2", :bzip-2 "BZIP2"} input), :shape "CompressionType"})

(clojure.core/defn- ser-tagging-directive [input] #:http.request.field{:value (clojure.core/get {"COPY" "COPY", :copy "COPY", "REPLACE" "REPLACE", :replace "REPLACE"} input), :shape "TaggingDirective"})

(clojure.core/defn- ser-tag-set [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag", :location-name "Tag"}))) input), :shape "TagSet", :type "list"})

(clojure.core/defn- ser-sse-customer-key-md-5 [input] #:http.request.field{:value input, :shape "SSECustomerKeyMD5"})

(clojure.core/defn- ser-routing-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-routing-rule coll) #:http.request.field{:shape "RoutingRule", :location-name "RoutingRule"}))) input), :shape "RoutingRules", :type "list"})

(clojure.core/defn- ser-expired-object-delete-marker [input] #:http.request.field{:value input, :shape "ExpiredObjectDeleteMarker"})

(clojure.core/defn- ser-response-expires [input] #:http.request.field{:value input, :shape "ResponseExpires"})

(clojure.core/defn- ser-replica-kms-key-id [input] #:http.request.field{:value input, :shape "ReplicaKmsKeyID"})

(clojure.core/defn- ser-completed-part [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CompletedPart", :type "structure"} (clojure.core/contains? input :e-tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-e-tag (input :e-tag)) #:http.request.field{:name "ETag", :shape "ETag"})) (clojure.core/contains? input :part-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-part-number (input :part-number)) #:http.request.field{:name "PartNumber", :shape "PartNumber"}))))

(clojure.core/defn- ser-notification-id [input] #:http.request.field{:value input, :shape "NotificationId"})

(clojure.core/defn- ser-copy-source-sse-customer-key [input] #:http.request.field{:value input, :shape "CopySourceSSECustomerKey"})

(clojure.core/defn- ser-versioning-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VersioningConfiguration", :type "structure"} (clojure.core/contains? input :mfa-delete) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mfa-delete (input :mfa-delete)) #:http.request.field{:name "MFADelete", :shape "MFADelete", :location-name "MfaDelete"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-versioning-status (input :status)) #:http.request.field{:name "Status", :shape "BucketVersioningStatus"}))))

(clojure.core/defn- ser-if-unmodified-since [input] #:http.request.field{:value input, :shape "IfUnmodifiedSince"})

(clojure.core/defn- ser-object-lock-enabled [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled"} input), :shape "ObjectLockEnabled"})

(clojure.core/defn- ser-response-content-disposition [input] #:http.request.field{:value input, :shape "ResponseContentDisposition"})

(clojure.core/defn- ser-filter-rule-name [input] #:http.request.field{:value (clojure.core/get {"prefix" "prefix", :prefix "prefix", "suffix" "suffix", :suffix "suffix"} input), :shape "FilterRuleName"})

(clojure.core/defn- ser-inventory-id [input] #:http.request.field{:value input, :shape "InventoryId"})

(clojure.core/defn- ser-topic-configuration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-topic-configuration coll) #:http.request.field{:shape "TopicConfiguration"}))) input), :shape "TopicConfigurationList", :type "list", :flattened true})

(clojure.core/defn- ser-access-control-translation [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-owner-override (:owner input)) #:http.request.field{:name "Owner", :shape "OwnerOverride"})], :shape "AccessControlTranslation", :type "structure"}))

(clojure.core/defn- ser-topic-configuration-deprecated [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TopicConfigurationDeprecated", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-id (input :id)) #:http.request.field{:name "Id", :shape "NotificationId"})) (clojure.core/contains? input :events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-list (input :events)) #:http.request.field{:name "Events", :shape "EventList", :location-name "Event"})) (clojure.core/contains? input :event) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event (input :event)) #:http.request.field{:name "Event", :shape "Event", :deprecated true})) (clojure.core/contains? input :topic) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic-arn (input :topic)) #:http.request.field{:name "Topic", :shape "TopicArn"}))))

(clojure.core/defn- ser-object-lock-legal-hold [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ObjectLockLegalHold", :type "structure"} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-legal-hold-status (input :status)) #:http.request.field{:name "Status", :shape "ObjectLockLegalHoldStatus"}))))

(clojure.core/defn- ser-glacier-job-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tier (:tier input)) #:http.request.field{:name "Tier", :shape "Tier"})], :shape "GlacierJobParameters", :type "structure"}))

(clojure.core/defn- ser-website-redirect-location [input] #:http.request.field{:value input, :shape "WebsiteRedirectLocation"})

(clojure.core/defn- ser-prefix [input] #:http.request.field{:value input, :shape "Prefix"})

(clojure.core/defn- ser-type [input] #:http.request.field{:value (clojure.core/get {"CanonicalUser" "CanonicalUser", :canonical-user "CanonicalUser", "AmazonCustomerByEmail" "AmazonCustomerByEmail", :amazon-customer-by-email "AmazonCustomerByEmail", "Group" "Group", :group "Group"} input), :shape "Type"})

(clojure.core/defn- ser-storage-class-analysis-schema-version [input] #:http.request.field{:value (clojure.core/get {"V_1" "V_1", :v-1 "V_1"} input), :shape "StorageClassAnalysisSchemaVersion"})

(clojure.core/defn- ser-encoding-type [input] #:http.request.field{:value (clojure.core/get {"url" "url", :url "url"} input), :shape "EncodingType"})

(clojure.core/defn- ser-sse-kms-encrypted-objects-status [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "SseKmsEncryptedObjectsStatus"})

(clojure.core/defn- ser-create-bucket-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CreateBucketConfiguration", :type "structure"} (clojure.core/contains? input :location-constraint) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-location-constraint (input :location-constraint)) #:http.request.field{:name "LocationConstraint", :shape "BucketLocationConstraint"}))))

(clojure.core/defn- ser-encryption-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EncryptionConfiguration", :type "structure"} (clojure.core/contains? input :replica-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replica-kms-key-id (input :replica-kms-key-id)) #:http.request.field{:name "ReplicaKmsKeyID", :shape "ReplicaKmsKeyID"}))))

(clojure.core/defn- ser-inventory-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-prefix (:prefix input)) #:http.request.field{:name "Prefix", :shape "Prefix"})], :shape "InventoryFilter", :type "structure"}))

(clojure.core/defn- ser-cloud-function-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CloudFunctionConfiguration", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-id (input :id)) #:http.request.field{:name "Id", :shape "NotificationId"})) (clojure.core/contains? input :event) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event (input :event)) #:http.request.field{:name "Event", :shape "Event", :deprecated true})) (clojure.core/contains? input :events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-list (input :events)) #:http.request.field{:name "Events", :shape "EventList", :location-name "Event"})) (clojure.core/contains? input :cloud-function) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-function (input :cloud-function)) #:http.request.field{:name "CloudFunction", :shape "CloudFunction"})) (clojure.core/contains? input :invocation-role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-function-invocation-role (input :invocation-role)) #:http.request.field{:name "InvocationRole", :shape "CloudFunctionInvocationRole"}))))

(clojure.core/defn- ser-request-payment-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-payer (:payer input)) #:http.request.field{:name "Payer", :shape "Payer"})], :shape "RequestPaymentConfiguration", :type "structure"}))

(clojure.core/defn- ser-inventory-optional-field [input] #:http.request.field{:value (clojure.core/get {:object-lock-retain-until-date "ObjectLockRetainUntilDate", "LastModifiedDate" "LastModifiedDate", :storage-class "StorageClass", :object-lock-legal-hold-status "ObjectLockLegalHoldStatus", "ReplicationStatus" "ReplicationStatus", "EncryptionStatus" "EncryptionStatus", :object-lock-mode "ObjectLockMode", "ETag" "ETag", :size "Size", :replication-status "ReplicationStatus", "Size" "Size", "ObjectLockLegalHoldStatus" "ObjectLockLegalHoldStatus", "IsMultipartUploaded" "IsMultipartUploaded", "StorageClass" "StorageClass", :encryption-status "EncryptionStatus", :is-multipart-uploaded "IsMultipartUploaded", :last-modified-date "LastModifiedDate", "ObjectLockRetainUntilDate" "ObjectLockRetainUntilDate", "ObjectLockMode" "ObjectLockMode", :e-tag "ETag"} input), :shape "InventoryOptionalField"})

(clojure.core/defn- ser-permission [input] #:http.request.field{:value (clojure.core/get {"WRITE" "WRITE", "FULL_CONTROL" "FULL_CONTROL", :read "READ", :read-acp "READ_ACP", "READ_ACP" "READ_ACP", :write-acp "WRITE_ACP", :write "WRITE", "WRITE_ACP" "WRITE_ACP", "READ" "READ", :full-control "FULL_CONTROL"} input), :shape "Permission"})

(clojure.core/defn- ser-response-content-language [input] #:http.request.field{:value input, :shape "ResponseContentLanguage"})

(clojure.core/defn- ser-json-output [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JSONOutput", :type "structure"} (clojure.core/contains? input :record-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-delimiter (input :record-delimiter)) #:http.request.field{:name "RecordDelimiter", :shape "RecordDelimiter"}))))

(clojure.core/defn- ser-server-side-encryption-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-server-side-encryption-rules (:rules input)) #:http.request.field{:name "Rules", :shape "ServerSideEncryptionRules", :location-name "Rule"})], :shape "ServerSideEncryptionConfiguration", :type "structure"}))

(clojure.core/defn- ser-target-grant [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TargetGrant", :type "structure"} (clojure.core/contains? input :grantee) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grantee (input :grantee)) #:http.request.field{:name "Grantee", :shape "Grantee"})) (clojure.core/contains? input :permission) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-logs-permission (input :permission)) #:http.request.field{:name "Permission", :shape "BucketLogsPermission"}))))

(clojure.core/defn- ser-replication-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role (:role input)) #:http.request.field{:name "Role", :shape "Role"}) (clojure.core/into (ser-replication-rules (:rules input)) #:http.request.field{:name "Rules", :shape "ReplicationRules", :location-name "Rule"})], :shape "ReplicationConfiguration", :type "structure"}))

(clojure.core/defn- ser-completed-part-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-completed-part coll) #:http.request.field{:shape "CompletedPart"}))) input), :shape "CompletedPartList", :type "list", :flattened true})

(clojure.core/defn- ser-comments [input] #:http.request.field{:value input, :shape "Comments"})

(clojure.core/defn- ser-sse-customer-algorithm [input] #:http.request.field{:value input, :shape "SSECustomerAlgorithm"})

(clojure.core/defn- ser-inventory-schedule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-inventory-frequency (:frequency input)) #:http.request.field{:name "Frequency", :shape "InventoryFrequency"})], :shape "InventorySchedule", :type "structure"}))

(clojure.core/defn- ser-transition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Transition", :type "structure"} (clojure.core/contains? input :date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :date)) #:http.request.field{:name "Date", :shape "Date"})) (clojure.core/contains? input :days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-days (input :days)) #:http.request.field{:name "Days", :shape "Days"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transition-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "TransitionStorageClass"}))))

(clojure.core/defn- ser-metadata-directive [input] #:http.request.field{:value (clojure.core/get {"COPY" "COPY", :copy "COPY", "REPLACE" "REPLACE", :replace "REPLACE"} input), :shape "MetadataDirective"})

(clojure.core/defn- ser-analytics-export-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-analytics-s-3-bucket-destination (:s-3-bucket-destination input)) #:http.request.field{:name "S3BucketDestination", :shape "AnalyticsS3BucketDestination"})], :shape "AnalyticsExportDestination", :type "structure"}))

(clojure.core/defn- ser-sse-customer-key [input] #:http.request.field{:value input, :shape "SSECustomerKey"})

(clojure.core/defn- ser-content-md-5 [input] #:http.request.field{:value input, :shape "ContentMD5"})

(clojure.core/defn- ser-storage-class-analysis [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StorageClassAnalysis", :type "structure"} (clojure.core/contains? input :data-export) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class-analysis-data-export (input :data-export)) #:http.request.field{:name "DataExport", :shape "StorageClassAnalysisDataExport"}))))

(clojure.core/defn- ser-expose-header [input] #:http.request.field{:value input, :shape "ExposeHeader"})

(clojure.core/defn- ser-body [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Body"})

(clojure.core/defn- ser-delete-marker-replication-status [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "DeleteMarkerReplicationStatus"})

(clojure.core/defn- ser-allow-quoted-record-delimiter [input] #:http.request.field{:value input, :shape "AllowQuotedRecordDelimiter"})

(clojure.core/defn- ser-grants [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-grant coll) #:http.request.field{:shape "Grant", :location-name "Grant"}))) input), :shape "Grants", :type "list"})

(clojure.core/defn- ser-transition-storage-class [input] #:http.request.field{:value (clojure.core/get {"GLACIER" "GLACIER", :glacier "GLACIER", "STANDARD_IA" "STANDARD_IA", :standard-ia "STANDARD_IA", "ONEZONE_IA" "ONEZONE_IA", :onezone-ia "ONEZONE_IA", "INTELLIGENT_TIERING" "INTELLIGENT_TIERING", :intelligent-tiering "INTELLIGENT_TIERING"} input), :shape "TransitionStorageClass"})

(clojure.core/defn- ser-lifecycle-rule-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecycleRuleFilter", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag (input :tag)) #:http.request.field{:name "Tag", :shape "Tag"})) (clojure.core/contains? input :and) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-rule-and-operator (input :and)) #:http.request.field{:name "And", :shape "LifecycleRuleAndOperator"}))))

(clojure.core/defn- ser-payer [input] #:http.request.field{:value (clojure.core/get {"Requester" "Requester", :requester "Requester", "BucketOwner" "BucketOwner", :bucket-owner "BucketOwner"} input), :shape "Payer"})

(clojure.core/defn- ser-response-content-type [input] #:http.request.field{:value input, :shape "ResponseContentType"})

(clojure.core/defn- ser-metrics-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MetricsFilter", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag (input :tag)) #:http.request.field{:name "Tag", :shape "Tag"})) (clojure.core/contains? input :and) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics-and-operator (input :and)) #:http.request.field{:name "And", :shape "MetricsAndOperator"}))))

(clojure.core/defn- ser-inventory-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-inventory-s-3-bucket-destination (:s-3-bucket-destination input)) #:http.request.field{:name "S3BucketDestination", :shape "InventoryS3BucketDestination"})], :shape "InventoryDestination", :type "structure"}))

(clojure.core/defn- ser-object-version-id [input] #:http.request.field{:value input, :shape "ObjectVersionId"})

(clojure.core/defn- ser-grant-read-acp [input] #:http.request.field{:value input, :shape "GrantReadACP"})

(clojure.core/defn- ser-json-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JSONInput", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-json-type (input :type)) #:http.request.field{:name "Type", :shape "JSONType"}))))

(clojure.core/defn- ser-days-after-initiation [input] #:http.request.field{:value input, :shape "DaysAfterInitiation"})

(clojure.core/defn- ser-restore-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RestoreRequest", :type "structure"} (clojure.core/contains? input :days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-days (input :days)) #:http.request.field{:name "Days", :shape "Days"})) (clojure.core/contains? input :glacier-job-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-glacier-job-parameters (input :glacier-job-parameters)) #:http.request.field{:name "GlacierJobParameters", :shape "GlacierJobParameters"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restore-request-type (input :type)) #:http.request.field{:name "Type", :shape "RestoreRequestType"})) (clojure.core/contains? input :tier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tier (input :tier)) #:http.request.field{:name "Tier", :shape "Tier"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :select-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-select-parameters (input :select-parameters)) #:http.request.field{:name "SelectParameters", :shape "SelectParameters"})) (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-location (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "OutputLocation"}))))

(clojure.core/defn- ser-replication-rule-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ReplicationRuleFilter", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag (input :tag)) #:http.request.field{:name "Tag", :shape "Tag"})) (clojure.core/contains? input :and) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replication-rule-and-operator (input :and)) #:http.request.field{:name "And", :shape "ReplicationRuleAndOperator"}))))

(clojure.core/defn- ser-start-after [input] #:http.request.field{:value input, :shape "StartAfter"})

(clojure.core/defn- ser-inventory-encryption [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InventoryEncryption", :type "structure"} (clojure.core/contains? input :sses-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sses-3 (input :sses-3)) #:http.request.field{:name "SSES3", :shape "SSES3", :location-name "SSE-S3"})) (clojure.core/contains? input :ssekms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms (input :ssekms)) #:http.request.field{:name "SSEKMS", :shape "SSEKMS", :location-name "SSE-KMS"}))))

(clojure.core/defn- ser-record-delimiter [input] #:http.request.field{:value input, :shape "RecordDelimiter"})

(clojure.core/defn- ser-replace-key-prefix-with [input] #:http.request.field{:value input, :shape "ReplaceKeyPrefixWith"})

(clojure.core/defn- ser-metrics-and-operator [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MetricsAndOperator", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-set (input :tags)) #:http.request.field{:name "Tags", :shape "TagSet", :flattened true, :location-name "Tag"}))))

(clojure.core/defn- ser-object-lock-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ObjectLockConfiguration", :type "structure"} (clojure.core/contains? input :object-lock-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-enabled (input :object-lock-enabled)) #:http.request.field{:name "ObjectLockEnabled", :shape "ObjectLockEnabled"})) (clojure.core/contains? input :rule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-rule (input :rule)) #:http.request.field{:name "Rule", :shape "ObjectLockRule"}))))

(clojure.core/defn- ser-lifecycle-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-expiration-status (:status input)) #:http.request.field{:name "Status", :shape "ExpirationStatus"})], :shape "LifecycleRule", :type "structure"} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-rule-filter (input :filter)) #:http.request.field{:name "Filter", :shape "LifecycleRuleFilter"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :deprecated true})) (clojure.core/contains? input :transitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transition-list (input :transitions)) #:http.request.field{:name "Transitions", :shape "TransitionList", :location-name "Transition"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :id)) #:http.request.field{:name "ID", :shape "ID"})) (clojure.core/contains? input :noncurrent-version-expiration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noncurrent-version-expiration (input :noncurrent-version-expiration)) #:http.request.field{:name "NoncurrentVersionExpiration", :shape "NoncurrentVersionExpiration"})) (clojure.core/contains? input :abort-incomplete-multipart-upload) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-abort-incomplete-multipart-upload (input :abort-incomplete-multipart-upload)) #:http.request.field{:name "AbortIncompleteMultipartUpload", :shape "AbortIncompleteMultipartUpload"})) (clojure.core/contains? input :noncurrent-version-transitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noncurrent-version-transition-list (input :noncurrent-version-transitions)) #:http.request.field{:name "NoncurrentVersionTransitions", :shape "NoncurrentVersionTransitionList", :location-name "NoncurrentVersionTransition"})) (clojure.core/contains? input :expiration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-expiration (input :expiration)) #:http.request.field{:name "Expiration", :shape "LifecycleExpiration"}))))

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-analytics-and-operator [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AnalyticsAndOperator", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-set (input :tags)) #:http.request.field{:name "Tags", :shape "TagSet", :flattened true, :location-name "Tag"}))))

(clojure.core/defn- ser-lambda-function-configuration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-function-configuration coll) #:http.request.field{:shape "LambdaFunctionConfiguration"}))) input), :shape "LambdaFunctionConfigurationList", :type "list", :flattened true})

(clojure.core/defn- ser-source-selection-criteria [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SourceSelectionCriteria", :type "structure"} (clojure.core/contains? input :sse-kms-encrypted-objects) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-kms-encrypted-objects (input :sse-kms-encrypted-objects)) #:http.request.field{:name "SseKmsEncryptedObjects", :shape "SseKmsEncryptedObjects"}))))

(clojure.core/defn- ser-access-control-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccessControlPolicy", :type "structure"} (clojure.core/contains? input :grants) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grants (input :grants)) #:http.request.field{:name "Grants", :shape "Grants", :location-name "AccessControlList"})) (clojure.core/contains? input :owner) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-owner (input :owner)) #:http.request.field{:name "Owner", :shape "Owner"}))))

(clojure.core/defn- ser-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket input)) #:http.request.field{:name "Bucket", :shape "BucketName"})], :shape "Destination", :type "structure"} (clojure.core/contains? input :account) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account)) #:http.request.field{:name "Account", :shape "AccountId"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass"})) (clojure.core/contains? input :access-control-translation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-control-translation (input :access-control-translation)) #:http.request.field{:name "AccessControlTranslation", :shape "AccessControlTranslation"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"}))))

(clojure.core/defn- ser-max-parts [input] #:http.request.field{:value input, :shape "MaxParts"})

(clojure.core/defn- ser-public-access-block-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PublicAccessBlockConfiguration", :type "structure"} (clojure.core/contains? input :block-public-acls) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting (input :block-public-acls)) #:http.request.field{:name "BlockPublicAcls", :shape "Setting", :location-name "BlockPublicAcls"})) (clojure.core/contains? input :ignore-public-acls) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting (input :ignore-public-acls)) #:http.request.field{:name "IgnorePublicAcls", :shape "Setting", :location-name "IgnorePublicAcls"})) (clojure.core/contains? input :block-public-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting (input :block-public-policy)) #:http.request.field{:name "BlockPublicPolicy", :shape "Setting", :location-name "BlockPublicPolicy"})) (clojure.core/contains? input :restrict-public-buckets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting (input :restrict-public-buckets)) #:http.request.field{:name "RestrictPublicBuckets", :shape "Setting", :location-name "RestrictPublicBuckets"}))))

(clojure.core/defn- ser-expiration-status [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "ExpirationStatus"})

(clojure.core/defn- ser-metadata-key [input] #:http.request.field{:value input, :shape "MetadataKey"})

(clojure.core/defn- ser-filter-rule-value [input] #:http.request.field{:value input, :shape "FilterRuleValue"})

(clojure.core/defn- ser-filter-rule-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-rule coll) #:http.request.field{:shape "FilterRule"}))) input), :shape "FilterRuleList", :type "list", :flattened true})

(clojure.core/defn- ser-grant-read [input] #:http.request.field{:value input, :shape "GrantRead"})

(clojure.core/defn- ser-analytics-s-3-bucket-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-analytics-s-3-export-file-format (:format input)) #:http.request.field{:name "Format", :shape "AnalyticsS3ExportFileFormat"}) (clojure.core/into (ser-bucket-name (:bucket input)) #:http.request.field{:name "Bucket", :shape "BucketName"})], :shape "AnalyticsS3BucketDestination", :type "structure"} (clojure.core/contains? input :bucket-account-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :bucket-account-id)) #:http.request.field{:name "BucketAccountId", :shape "AccountId"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"}))))

(clojure.core/defn- ser-noncurrent-version-transition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-noncurrent-version-transition coll) #:http.request.field{:shape "NoncurrentVersionTransition"}))) input), :shape "NoncurrentVersionTransitionList", :type "list", :flattened true})

(clojure.core/defn- ser-event-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event coll) #:http.request.field{:shape "Event"}))) input), :shape "EventList", :type "list", :flattened true})

(clojure.core/defn- ser-expression [input] #:http.request.field{:value input, :shape "Expression"})

(clojure.core/defn- ser-server-side-encryption [input] #:http.request.field{:value (clojure.core/get {"AES256" "AES256", :aes-256 "AES256", "aws:kms" "aws:kms", :awskms "aws:kms"} input), :shape "ServerSideEncryption"})

(clojure.core/defn- ser-if-modified-since [input] #:http.request.field{:value input, :shape "IfModifiedSince"})

(clojure.core/defn- ser-mfa [input] #:http.request.field{:value input, :shape "MFA"})

(clojure.core/defn- ser-event [input] #:http.request.field{:value (clojure.core/get {"s3:ObjectRestore:Completed" "s3:ObjectRestore:Completed", :s-3-object-removed-delete "s3:ObjectRemoved:Delete", "s3:ObjectCreated:*" "s3:ObjectCreated:*", :s-3-object-created-copy "s3:ObjectCreated:Copy", :s-3-object-restore-post "s3:ObjectRestore:Post", "s3:ObjectRemoved:Delete" "s3:ObjectRemoved:Delete", :s-3-object-created-complete-multipart-upload "s3:ObjectCreated:CompleteMultipartUpload", "s3:ObjectRemoved:*" "s3:ObjectRemoved:*", "s3:ObjectRemoved:DeleteMarkerCreated" "s3:ObjectRemoved:DeleteMarkerCreated", :s-3-object-created-put "s3:ObjectCreated:Put", :s-3-object-restore-completed "s3:ObjectRestore:Completed", "s3:ObjectCreated:Copy" "s3:ObjectCreated:Copy", :s-3-object-removed "s3:ObjectRemoved:*", "s3:ObjectCreated:Post" "s3:ObjectCreated:Post", "s3:ObjectCreated:CompleteMultipartUpload" "s3:ObjectCreated:CompleteMultipartUpload", "s3:ReducedRedundancyLostObject" "s3:ReducedRedundancyLostObject", "s3:ObjectRestore:Post" "s3:ObjectRestore:Post", :s-3-object-created "s3:ObjectCreated:*", "s3:ObjectCreated:Put" "s3:ObjectCreated:Put", :s-3-object-created-post "s3:ObjectCreated:Post", :s-3-object-removed-delete-marker-created "s3:ObjectRemoved:DeleteMarkerCreated", :s-3-reduced-redundancy-lost-object "s3:ReducedRedundancyLostObject"} input), :shape "Event"})

(clojure.core/defn- ser-bucket-canned-acl [input] #:http.request.field{:value (clojure.core/get {"private" "private", :private "private", "public-read" "public-read", :publicread "public-read", "public-read-write" "public-read-write", :publicreadwrite "public-read-write", "authenticated-read" "authenticated-read", :authenticatedread "authenticated-read"} input), :shape "BucketCannedACL"})

(clojure.core/defn- ser-quote-character [input] #:http.request.field{:value input, :shape "QuoteCharacter"})

(clojure.core/defn- ser-restore-request-type [input] #:http.request.field{:value (clojure.core/get {"SELECT" "SELECT", :select "SELECT"} input), :shape "RestoreRequestType"})

(clojure.core/defn- ser-quiet [input] #:http.request.field{:value input, :shape "Quiet"})

(clojure.core/defn- ser-content-disposition [input] #:http.request.field{:value input, :shape "ContentDisposition"})

(clojure.core/defn- ser-error-document [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-key (:key input)) #:http.request.field{:name "Key", :shape "ObjectKey"})], :shape "ErrorDocument", :type "structure"}))

(clojure.core/defn- ser-bypass-governance-retention [input] #:http.request.field{:value input, :shape "BypassGovernanceRetention"})

(clojure.core/defn- ser-redirect [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Redirect", :type "structure"} (clojure.core/contains? input :host-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-host-name (input :host-name)) #:http.request.field{:name "HostName", :shape "HostName"})) (clojure.core/contains? input :http-redirect-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-redirect-code (input :http-redirect-code)) #:http.request.field{:name "HttpRedirectCode", :shape "HttpRedirectCode"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "Protocol"})) (clojure.core/contains? input :replace-key-prefix-with) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replace-key-prefix-with (input :replace-key-prefix-with)) #:http.request.field{:name "ReplaceKeyPrefixWith", :shape "ReplaceKeyPrefixWith"})) (clojure.core/contains? input :replace-key-with) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replace-key-with (input :replace-key-with)) #:http.request.field{:name "ReplaceKeyWith", :shape "ReplaceKeyWith"}))))

(clojure.core/defn- ser-output-serialization [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputSerialization", :type "structure"} (clojure.core/contains? input :csv) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-csv-output (input :csv)) #:http.request.field{:name "CSV", :shape "CSVOutput"})) (clojure.core/contains? input :json) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-json-output (input :json)) #:http.request.field{:name "JSON", :shape "JSONOutput"}))))

(clojure.core/defn- ser-priority [input] #:http.request.field{:value input, :shape "Priority"})

(clojure.core/defn- ser-bucket-logs-permission [input] #:http.request.field{:value (clojure.core/get {"FULL_CONTROL" "FULL_CONTROL", :full-control "FULL_CONTROL", "READ" "READ", :read "READ", "WRITE" "WRITE", :write "WRITE"} input), :shape "BucketLogsPermission"})

(clojure.core/defn- ser-analytics-id [input] #:http.request.field{:value input, :shape "AnalyticsId"})

(clojure.core/defn- ser-copy-source-if-match [input] #:http.request.field{:value input, :shape "CopySourceIfMatch"})

(clojure.core/defn- ser-http-error-code-returned-equals [input] #:http.request.field{:value input, :shape "HttpErrorCodeReturnedEquals"})

(clojure.core/defn- ser-user-metadata [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metadata-entry coll) #:http.request.field{:shape "MetadataEntry", :location-name "MetadataEntry"}))) input), :shape "UserMetadata", :type "list"})

(clojure.core/defn- ser-upload-id-marker [input] #:http.request.field{:value input, :shape "UploadIdMarker"})

(clojure.core/defn- ser-part-number [input] #:http.request.field{:value input, :shape "PartNumber"})

(clojure.core/defn- ser-logging-enabled [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-bucket (:target-bucket input)) #:http.request.field{:name "TargetBucket", :shape "TargetBucket"}) (clojure.core/into (ser-target-prefix (:target-prefix input)) #:http.request.field{:name "TargetPrefix", :shape "TargetPrefix"})], :shape "LoggingEnabled", :type "structure"} (clojure.core/contains? input :target-grants) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-grants (input :target-grants)) #:http.request.field{:name "TargetGrants", :shape "TargetGrants"}))))

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-inventory-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-inventory-destination (:destination input)) #:http.request.field{:name "Destination", :shape "InventoryDestination"}) (clojure.core/into (ser-is-enabled (:is-enabled input)) #:http.request.field{:name "IsEnabled", :shape "IsEnabled"}) (clojure.core/into (ser-inventory-id (:id input)) #:http.request.field{:name "Id", :shape "InventoryId"}) (clojure.core/into (ser-inventory-included-object-versions (:included-object-versions input)) #:http.request.field{:name "IncludedObjectVersions", :shape "InventoryIncludedObjectVersions"}) (clojure.core/into (ser-inventory-schedule (:schedule input)) #:http.request.field{:name "Schedule", :shape "InventorySchedule"})], :shape "InventoryConfiguration", :type "structure"} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-filter (input :filter)) #:http.request.field{:name "Filter", :shape "InventoryFilter"})) (clojure.core/contains? input :optional-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-optional-fields (input :optional-fields)) #:http.request.field{:name "OptionalFields", :shape "InventoryOptionalFields"}))))

(clojure.core/defn- ser-allowed-methods [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-allowed-method coll) #:http.request.field{:shape "AllowedMethod"}))) input), :shape "AllowedMethods", :type "list", :flattened true})

(clojure.core/defn- ser-e-tag [input] #:http.request.field{:value input, :shape "ETag"})

(clojure.core/defn- ser-copy-source-range [input] #:http.request.field{:value input, :shape "CopySourceRange"})

(clojure.core/defn- ser-max-uploads [input] #:http.request.field{:value input, :shape "MaxUploads"})

(clojure.core/defn- ser-replication-rule-and-operator [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ReplicationRuleAndOperator", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-set (input :tags)) #:http.request.field{:name "Tags", :shape "TagSet", :flattened true, :location-name "Tag"}))))

(clojure.core/defn- ser-metrics-id [input] #:http.request.field{:value input, :shape "MetricsId"})

(clojure.core/defn- ser-owner-override [input] #:http.request.field{:value (clojure.core/get {"Destination" "Destination", :destination "Destination"} input), :shape "OwnerOverride"})

(clojure.core/defn- ser-multipart-upload-id [input] #:http.request.field{:value input, :shape "MultipartUploadId"})

(clojure.core/defn- ser-delete [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-identifier-list (:objects input)) #:http.request.field{:name "Objects", :shape "ObjectIdentifierList", :location-name "Object"})], :shape "Delete", :type "structure"} (clojure.core/contains? input :quiet) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quiet (input :quiet)) #:http.request.field{:name "Quiet", :shape "Quiet"}))))

(clojure.core/defn- ser-metadata-value [input] #:http.request.field{:value input, :shape "MetadataValue"})

(clojure.core/defn- ser-bucket-logging-status [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BucketLoggingStatus", :type "structure"} (clojure.core/contains? input :logging-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-enabled (input :logging-enabled)) #:http.request.field{:name "LoggingEnabled", :shape "LoggingEnabled"}))))

(clojure.core/defn- ser-bucket-versioning-status [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Suspended" "Suspended", :suspended "Suspended"} input), :shape "BucketVersioningStatus"})

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value input, :shape "ContentType"})

(clojure.core/defn- ser-range [input] #:http.request.field{:value input, :shape "Range"})

(clojure.core/defn- ser-inventory-included-object-versions [input] #:http.request.field{:value (clojure.core/get {"All" "All", :all "All", "Current" "Current", :current "Current"} input), :shape "InventoryIncludedObjectVersions"})

(clojure.core/defn- ser-if-match [input] #:http.request.field{:value input, :shape "IfMatch"})

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-server-side-encryption-by-default [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-server-side-encryption (:sse-algorithm input)) #:http.request.field{:name "SSEAlgorithm", :shape "ServerSideEncryption"})], :shape "ServerSideEncryptionByDefault", :type "structure"} (clojure.core/contains? input :kms-master-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms-key-id (input :kms-master-key-id)) #:http.request.field{:name "KMSMasterKeyID", :shape "SSEKMSKeyId"}))))

(clojure.core/defn- ser-display-name [input] #:http.request.field{:value input, :shape "DisplayName"})

(clojure.core/defn- ser-cors-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-allowed-methods (:allowed-methods input)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods", :location-name "AllowedMethod"}) (clojure.core/into (ser-allowed-origins (:allowed-origins input)) #:http.request.field{:name "AllowedOrigins", :shape "AllowedOrigins", :location-name "AllowedOrigin"})], :shape "CORSRule", :type "structure"} (clojure.core/contains? input :allowed-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-headers (input :allowed-headers)) #:http.request.field{:name "AllowedHeaders", :shape "AllowedHeaders", :location-name "AllowedHeader"})) (clojure.core/contains? input :expose-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expose-headers (input :expose-headers)) #:http.request.field{:name "ExposeHeaders", :shape "ExposeHeaders", :location-name "ExposeHeader"})) (clojure.core/contains? input :max-age-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-age-seconds (input :max-age-seconds)) #:http.request.field{:name "MaxAgeSeconds", :shape "MaxAgeSeconds"}))))

(clojure.core/defn- ser-grant [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Grant", :type "structure"} (clojure.core/contains? input :grantee) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grantee (input :grantee)) #:http.request.field{:name "Grantee", :shape "Grantee"})) (clojure.core/contains? input :permission) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permission (input :permission)) #:http.request.field{:name "Permission", :shape "Permission"}))))

(clojure.core/defn- ser-cors-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cors-rules (:cors-rules input)) #:http.request.field{:name "CORSRules", :shape "CORSRules", :location-name "CORSRule"})], :shape "CORSConfiguration", :type "structure"}))

(clojure.core/defn- ser-object-lock-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ObjectLockRule", :type "structure"} (clojure.core/contains? input :default-retention) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-default-retention (input :default-retention)) #:http.request.field{:name "DefaultRetention", :shape "DefaultRetention"}))))

(clojure.core/defn- ser-content-length [input] #:http.request.field{:value input, :shape "ContentLength"})

(clojure.core/defn- ser-topic-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-topic-arn (:topic-arn input)) #:http.request.field{:name "TopicArn", :shape "TopicArn", :location-name "Topic"}) (clojure.core/into (ser-event-list (:events input)) #:http.request.field{:name "Events", :shape "EventList", :location-name "Event"})], :shape "TopicConfiguration", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-id (input :id)) #:http.request.field{:name "Id", :shape "NotificationId"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-configuration-filter (input :filter)) #:http.request.field{:name "Filter", :shape "NotificationConfigurationFilter"}))))

(clojure.core/defn- ser-is-enabled [input] #:http.request.field{:value input, :shape "IsEnabled"})

(clojure.core/defn- ser-field-delimiter [input] #:http.request.field{:value input, :shape "FieldDelimiter"})

(clojure.core/defn- ser-inventory-s-3-bucket-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket input)) #:http.request.field{:name "Bucket", :shape "BucketName"}) (clojure.core/into (ser-inventory-format (:format input)) #:http.request.field{:name "Format", :shape "InventoryFormat"})], :shape "InventoryS3BucketDestination", :type "structure"} (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "InventoryEncryption"}))))

(clojure.core/defn- ser-csv-output [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CSVOutput", :type "structure"} (clojure.core/contains? input :quote-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quote-fields (input :quote-fields)) #:http.request.field{:name "QuoteFields", :shape "QuoteFields"})) (clojure.core/contains? input :quote-escape-character) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quote-escape-character (input :quote-escape-character)) #:http.request.field{:name "QuoteEscapeCharacter", :shape "QuoteEscapeCharacter"})) (clojure.core/contains? input :record-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-delimiter (input :record-delimiter)) #:http.request.field{:name "RecordDelimiter", :shape "RecordDelimiter"})) (clojure.core/contains? input :field-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-delimiter (input :field-delimiter)) #:http.request.field{:name "FieldDelimiter", :shape "FieldDelimiter"})) (clojure.core/contains? input :quote-character) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quote-character (input :quote-character)) #:http.request.field{:name "QuoteCharacter", :shape "QuoteCharacter"}))))

(clojure.core/defn- ser-metadata-entry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MetadataEntry", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata-key (input :name)) #:http.request.field{:name "Name", :shape "MetadataKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata-value (input :value)) #:http.request.field{:name "Value", :shape "MetadataValue"}))))

(clojure.core/defn- ser-copy-source-if-none-match [input] #:http.request.field{:value input, :shape "CopySourceIfNoneMatch"})

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "ID"})

(clojure.core/defn- ser-inventory-frequency [input] #:http.request.field{:value (clojure.core/get {"Daily" "Daily", :daily "Daily", "Weekly" "Weekly", :weekly "Weekly"} input), :shape "InventoryFrequency"})

(clojure.core/defn- ser-value [input] #:http.request.field{:value input, :shape "Value"})

(clojure.core/defn- ser-expose-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-expose-header coll) #:http.request.field{:shape "ExposeHeader"}))) input), :shape "ExposeHeaders", :type "list", :flattened true})

(clojure.core/defn- ser-transition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-transition coll) #:http.request.field{:shape "Transition"}))) input), :shape "TransitionList", :type "list", :flattened true})

(clojure.core/defn- ser-analytics-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AnalyticsFilter", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag (input :tag)) #:http.request.field{:name "Tag", :shape "Tag"})) (clojure.core/contains? input :and) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-and-operator (input :and)) #:http.request.field{:name "And", :shape "AnalyticsAndOperator"}))))

(clojure.core/defn- ser-analytics-s-3-export-file-format [input] #:http.request.field{:value (clojure.core/get {"CSV" "CSV", :csv "CSV"} input), :shape "AnalyticsS3ExportFileFormat"})

(clojure.core/defn- ser-version-id-marker [input] #:http.request.field{:value input, :shape "VersionIdMarker"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-object-key [input] #:http.request.field{:value input, :shape "ObjectKey"})

(clojure.core/defn- ser-allowed-method [input] #:http.request.field{:value input, :shape "AllowedMethod"})

(clojure.core/defn- ser-bucket-accelerate-status [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Suspended" "Suspended", :suspended "Suspended"} input), :shape "BucketAccelerateStatus"})

(clojure.core/defn- ser-lambda-function-arn [input] #:http.request.field{:value input, :shape "LambdaFunctionArn"})

(clojure.core/defn- ser-protocol [input] #:http.request.field{:value (clojure.core/get {"http" "http", :http "http", "https" "https", :https "https"} input), :shape "Protocol"})

(clojure.core/defn- ser-replication-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-replication-rule-status (:status input)) #:http.request.field{:name "Status", :shape "ReplicationRuleStatus"}) (clojure.core/into (ser-destination (:destination input)) #:http.request.field{:name "Destination", :shape "Destination"})], :shape "ReplicationRule", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :id)) #:http.request.field{:name "ID", :shape "ID"})) (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-priority (input :priority)) #:http.request.field{:name "Priority", :shape "Priority"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :deprecated true})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replication-rule-filter (input :filter)) #:http.request.field{:name "Filter", :shape "ReplicationRuleFilter"})) (clojure.core/contains? input :source-selection-criteria) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-selection-criteria (input :source-selection-criteria)) #:http.request.field{:name "SourceSelectionCriteria", :shape "SourceSelectionCriteria"})) (clojure.core/contains? input :delete-marker-replication) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-marker-replication (input :delete-marker-replication)) #:http.request.field{:name "DeleteMarkerReplication", :shape "DeleteMarkerReplication"}))))

(clojure.core/defn- ser-redirect-all-requests-to [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-host-name (:host-name input)) #:http.request.field{:name "HostName", :shape "HostName"})], :shape "RedirectAllRequestsTo", :type "structure"} (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "Protocol"}))))

(clojure.core/defn- ser-target-grants [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-grant coll) #:http.request.field{:shape "TargetGrant", :location-name "Grant"}))) input), :shape "TargetGrants", :type "list"})

(clojure.core/defn- ser-completed-multipart-upload [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CompletedMultipartUpload", :type "structure"} (clojure.core/contains? input :parts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-completed-part-list (input :parts)) #:http.request.field{:name "Parts", :shape "CompletedPartList", :location-name "Part"}))))

(clojure.core/defn- ser-json-type [input] #:http.request.field{:value (clojure.core/get {"DOCUMENT" "DOCUMENT", :document "DOCUMENT", "LINES" "LINES", :lines "LINES"} input), :shape "JSONType"})

(clojure.core/defn- ser-filter-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FilterRule", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-rule-name (input :name)) #:http.request.field{:name "Name", :shape "FilterRuleName"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-rule-value (input :value)) #:http.request.field{:name "Value", :shape "FilterRuleValue"}))))

(clojure.core/defn- ser-replication-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-replication-rule coll) #:http.request.field{:shape "ReplicationRule"}))) input), :shape "ReplicationRules", :type "list", :flattened true})

(clojure.core/defn- ser-s-3-key-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3KeyFilter", :type "structure"} (clojure.core/contains? input :filter-rules) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-rule-list (input :filter-rules)) #:http.request.field{:name "FilterRules", :shape "FilterRuleList", :location-name "FilterRule"}))))

(clojure.core/defn- ser-target-bucket [input] #:http.request.field{:value input, :shape "TargetBucket"})

(clojure.core/defn- ser-notification-configuration-deprecated [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotificationConfigurationDeprecated", :type "structure"} (clojure.core/contains? input :topic-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic-configuration-deprecated (input :topic-configuration)) #:http.request.field{:name "TopicConfiguration", :shape "TopicConfigurationDeprecated"})) (clojure.core/contains? input :queue-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queue-configuration-deprecated (input :queue-configuration)) #:http.request.field{:name "QueueConfiguration", :shape "QueueConfigurationDeprecated"})) (clojure.core/contains? input :cloud-function-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-function-configuration (input :cloud-function-configuration)) #:http.request.field{:name "CloudFunctionConfiguration", :shape "CloudFunctionConfiguration"}))))

(clojure.core/defn- ser-copy-source-if-modified-since [input] #:http.request.field{:value input, :shape "CopySourceIfModifiedSince"})

(clojure.core/defn- ser-replace-key-with [input] #:http.request.field{:value input, :shape "ReplaceKeyWith"})

(clojure.core/defn- ser-kms-context [input] #:http.request.field{:value input, :shape "KMSContext"})

(clojure.core/defn- ser-part-number-marker [input] #:http.request.field{:value input, :shape "PartNumberMarker"})

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-notification-configuration-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotificationConfigurationFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-filter (input :key)) #:http.request.field{:name "Key", :shape "S3KeyFilter", :location-name "S3Key"}))))

(clojure.core/defn- ser-topic-arn [input] #:http.request.field{:value input, :shape "TopicArn"})

(clojure.core/defn- ser-suffix [input] #:http.request.field{:value input, :shape "Suffix"})

(clojure.core/defn- ser-lifecycle-rule-and-operator [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecycleRuleAndOperator", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-set (input :tags)) #:http.request.field{:name "Tags", :shape "TagSet", :flattened true, :location-name "Tag"}))))

(clojure.core/defn- ser-allowed-header [input] #:http.request.field{:value input, :shape "AllowedHeader"})

(clojure.core/defn- ser-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-prefix (:prefix input)) #:http.request.field{:name "Prefix", :shape "Prefix"}) (clojure.core/into (ser-expiration-status (:status input)) #:http.request.field{:name "Status", :shape "ExpirationStatus"})], :shape "Rule", :type "structure"} (clojure.core/contains? input :expiration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-expiration (input :expiration)) #:http.request.field{:name "Expiration", :shape "LifecycleExpiration"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :id)) #:http.request.field{:name "ID", :shape "ID"})) (clojure.core/contains? input :transition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transition (input :transition)) #:http.request.field{:name "Transition", :shape "Transition"})) (clojure.core/contains? input :noncurrent-version-transition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noncurrent-version-transition (input :noncurrent-version-transition)) #:http.request.field{:name "NoncurrentVersionTransition", :shape "NoncurrentVersionTransition"})) (clojure.core/contains? input :noncurrent-version-expiration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noncurrent-version-expiration (input :noncurrent-version-expiration)) #:http.request.field{:name "NoncurrentVersionExpiration", :shape "NoncurrentVersionExpiration"})) (clojure.core/contains? input :abort-incomplete-multipart-upload) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-abort-incomplete-multipart-upload (input :abort-incomplete-multipart-upload)) #:http.request.field{:name "AbortIncompleteMultipartUpload", :shape "AbortIncompleteMultipartUpload"}))))

(clojure.core/defn- ser-routing-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-redirect (:redirect input)) #:http.request.field{:name "Redirect", :shape "Redirect"})], :shape "RoutingRule", :type "structure"} (clojure.core/contains? input :condition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition (input :condition)) #:http.request.field{:name "Condition", :shape "Condition"}))))

(clojure.core/defn- ser-noncurrent-version-expiration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NoncurrentVersionExpiration", :type "structure"} (clojure.core/contains? input :noncurrent-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-days (input :noncurrent-days)) #:http.request.field{:name "NoncurrentDays", :shape "Days"}))))

(clojure.core/defn- ser-location-prefix [input] #:http.request.field{:value input, :shape "LocationPrefix"})

(clojure.core/defn- ser-delete-marker-replication [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeleteMarkerReplication", :type "structure"} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-marker-replication-status (input :status)) #:http.request.field{:name "Status", :shape "DeleteMarkerReplicationStatus"}))))

(clojure.core/defn- ser-select-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-input-serialization (:input-serialization input)) #:http.request.field{:name "InputSerialization", :shape "InputSerialization"}) (clojure.core/into (ser-expression-type (:expression-type input)) #:http.request.field{:name "ExpressionType", :shape "ExpressionType"}) (clojure.core/into (ser-expression (:expression input)) #:http.request.field{:name "Expression", :shape "Expression"}) (clojure.core/into (ser-output-serialization (:output-serialization input)) #:http.request.field{:name "OutputSerialization", :shape "OutputSerialization"})], :shape "SelectParameters", :type "structure"}))

(clojure.core/defn- ser-object-lock-enabled-for-bucket [input] #:http.request.field{:value input, :shape "ObjectLockEnabledForBucket"})

(clojure.core/defn- ser-tagging-header [input] #:http.request.field{:value input, :shape "TaggingHeader"})

(clojure.core/defn- ser-ssekms [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ssekms-key-id (:key-id input)) #:http.request.field{:name "KeyId", :shape "SSEKMSKeyId"})], :shape "SSEKMS", :type "structure", :location-name "SSE-KMS"}))

(clojure.core/defn- ser-enable-request-progress [input] #:http.request.field{:value input, :shape "EnableRequestProgress"})

(clojure.core/defn- ser-abort-incomplete-multipart-upload [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AbortIncompleteMultipartUpload", :type "structure"} (clojure.core/contains? input :days-after-initiation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-days-after-initiation (input :days-after-initiation)) #:http.request.field{:name "DaysAfterInitiation", :shape "DaysAfterInitiation"}))))

(clojure.core/defn- ser-request-progress [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RequestProgress", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-request-progress (input :enabled)) #:http.request.field{:name "Enabled", :shape "EnableRequestProgress"}))))

(clojure.core/defn- ser-s-3-location [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket-name input)) #:http.request.field{:name "BucketName", :shape "BucketName"}) (clojure.core/into (ser-location-prefix (:prefix input)) #:http.request.field{:name "Prefix", :shape "LocationPrefix"})], :shape "S3Location", :type "structure"} (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption"})) (clojure.core/contains? input :canned-acl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-canned-acl (input :canned-acl)) #:http.request.field{:name "CannedACL", :shape "ObjectCannedACL"})) (clojure.core/contains? input :access-control-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grants (input :access-control-list)) #:http.request.field{:name "AccessControlList", :shape "Grants"})) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging (input :tagging)) #:http.request.field{:name "Tagging", :shape "Tagging"})) (clojure.core/contains? input :user-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-metadata (input :user-metadata)) #:http.request.field{:name "UserMetadata", :shape "UserMetadata"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass"}))))

(clojure.core/defn- ser-copy-source-if-unmodified-since [input] #:http.request.field{:value input, :shape "CopySourceIfUnmodifiedSince"})

(clojure.core/defn- ser-http-redirect-code [input] #:http.request.field{:value input, :shape "HttpRedirectCode"})

(clojure.core/defn- ser-uri [input] #:http.request.field{:value input, :shape "URI"})

(clojure.core/defn- ser-object-canned-acl [input] #:http.request.field{:value (clojure.core/get {"authenticated-read" "authenticated-read", :bucketownerfullcontrol "bucket-owner-full-control", "public-read-write" "public-read-write", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :bucketownerread "bucket-owner-read", :publicread "public-read", "aws-exec-read" "aws-exec-read", :publicreadwrite "public-read-write", :awsexecread "aws-exec-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", :authenticatedread "authenticated-read"} input), :shape "ObjectCannedACL"})

(clojure.core/defn- ser-inventory-optional-fields [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-inventory-optional-field coll) #:http.request.field{:shape "InventoryOptionalField", :location-name "Field"}))) input), :shape "InventoryOptionalFields", :type "list"})

(clojure.core/defn- ser-owner [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Owner", :type "structure"} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :id)) #:http.request.field{:name "ID", :shape "ID"}))))

(clojure.core/defn- ser-replication-rule-status [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "ReplicationRuleStatus"})

(clojure.core/defn- ser-days [input] #:http.request.field{:value input, :shape "Days"})

(clojure.core/defn- ser-copy-source-sse-customer-algorithm [input] #:http.request.field{:value input, :shape "CopySourceSSECustomerAlgorithm"})

(clojure.core/defn- ser-object-identifier [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-key (:key input)) #:http.request.field{:name "Key", :shape "ObjectKey"})], :shape "ObjectIdentifier", :type "structure"} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId"}))))

(clojure.core/defn- ser-lifecycle-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-rules (:rules input)) #:http.request.field{:name "Rules", :shape "Rules", :location-name "Rule"})], :shape "LifecycleConfiguration", :type "structure"}))

(clojure.core/defn- ser-grant-write [input] #:http.request.field{:value input, :shape "GrantWrite"})

(clojure.core/defn- ser-storage-class-analysis-data-export [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-storage-class-analysis-schema-version (:output-schema-version input)) #:http.request.field{:name "OutputSchemaVersion", :shape "StorageClassAnalysisSchemaVersion"}) (clojure.core/into (ser-analytics-export-destination (:destination input)) #:http.request.field{:name "Destination", :shape "AnalyticsExportDestination"})], :shape "StorageClassAnalysisDataExport", :type "structure"}))

(clojure.core/defn- ser-quote-escape-character [input] #:http.request.field{:value input, :shape "QuoteEscapeCharacter"})

(clojure.core/defn- ser-cors-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cors-rule coll) #:http.request.field{:shape "CORSRule"}))) input), :shape "CORSRules", :type "list", :flattened true})

(clojure.core/defn- ser-object-lock-legal-hold-status [input] #:http.request.field{:value (clojure.core/get {"ON" "ON", :on "ON", "OFF" "OFF", :off "OFF"} input), :shape "ObjectLockLegalHoldStatus"})

(clojure.core/defn- ser-copy-source-sse-customer-key-md-5 [input] #:http.request.field{:value input, :shape "CopySourceSSECustomerKeyMD5"})

(clojure.core/defn- ser-metadata [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-metadata-key k) #:http.request.field{:map-info "key", :shape "MetadataKey"}) (clojure.core/into (ser-metadata-value v) #:http.request.field{:map-info "value", :shape "MetadataValue"})])) input), :shape "Metadata", :type "map"})

(clojure.core/defn- ser-cache-control [input] #:http.request.field{:value input, :shape "CacheControl"})

(clojure.core/defn- ser-content-language [input] #:http.request.field{:value input, :shape "ContentLanguage"})

(clojure.core/defn- ser-bucket-lifecycle-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lifecycle-rules (:rules input)) #:http.request.field{:name "Rules", :shape "LifecycleRules", :location-name "Rule"})], :shape "BucketLifecycleConfiguration", :type "structure"}))

(clojure.core/defn- ser-object-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-object-identifier coll) #:http.request.field{:shape "ObjectIdentifier"}))) input), :shape "ObjectIdentifierList", :type "list", :flattened true})

(clojure.core/defn- ser-policy [input] #:http.request.field{:value input, :shape "Policy"})

(clojure.core/defn- ser-delimiter [input] #:http.request.field{:value input, :shape "Delimiter"})

(clojure.core/defn- ser-encryption [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-server-side-encryption (:encryption-type input)) #:http.request.field{:name "EncryptionType", :shape "ServerSideEncryption"})], :shape "Encryption", :type "structure"} (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms-key-id (input :kms-key-id)) #:http.request.field{:name "KMSKeyId", :shape "SSEKMSKeyId"})) (clojure.core/contains? input :kms-context) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-context (input :kms-context)) #:http.request.field{:name "KMSContext", :shape "KMSContext"}))))

(clojure.core/defn- ser-grant-write-acp [input] #:http.request.field{:value input, :shape "GrantWriteACP"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-key (:key input)) #:http.request.field{:name "Key", :shape "ObjectKey"}) (clojure.core/into (ser-value (:value input)) #:http.request.field{:name "Value", :shape "Value"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Condition", :type "structure"} (clojure.core/contains? input :http-error-code-returned-equals) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-error-code-returned-equals (input :http-error-code-returned-equals)) #:http.request.field{:name "HttpErrorCodeReturnedEquals", :shape "HttpErrorCodeReturnedEquals"})) (clojure.core/contains? input :key-prefix-equals) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-prefix-equals (input :key-prefix-equals)) #:http.request.field{:name "KeyPrefixEquals", :shape "KeyPrefixEquals"}))))

(clojure.core/defn- ser-fetch-owner [input] #:http.request.field{:value input, :shape "FetchOwner"})

(clojure.core/defn- ser-expression-type [input] #:http.request.field{:value (clojure.core/get {"SQL" "SQL", :sql "SQL"} input), :shape "ExpressionType"})

(clojure.core/defn- ser-grant-full-control [input] #:http.request.field{:value input, :shape "GrantFullControl"})

(clojure.core/defn- ser-queue-arn [input] #:http.request.field{:value input, :shape "QueueArn"})

(clojure.core/defn- ser-response-content-encoding [input] #:http.request.field{:value input, :shape "ResponseContentEncoding"})

(clojure.core/defn- ser-target-prefix [input] #:http.request.field{:value input, :shape "TargetPrefix"})

(clojure.core/defn- ser-website-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WebsiteConfiguration", :type "structure"} (clojure.core/contains? input :error-document) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-error-document (input :error-document)) #:http.request.field{:name "ErrorDocument", :shape "ErrorDocument"})) (clojure.core/contains? input :index-document) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-index-document (input :index-document)) #:http.request.field{:name "IndexDocument", :shape "IndexDocument"})) (clojure.core/contains? input :redirect-all-requests-to) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-all-requests-to (input :redirect-all-requests-to)) #:http.request.field{:name "RedirectAllRequestsTo", :shape "RedirectAllRequestsTo"})) (clojure.core/contains? input :routing-rules) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-routing-rules (input :routing-rules)) #:http.request.field{:name "RoutingRules", :shape "RoutingRules"}))))

(clojure.core/defn- ser-server-side-encryption-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server-side-encryption-rule coll) #:http.request.field{:shape "ServerSideEncryptionRule"}))) input), :shape "ServerSideEncryptionRules", :type "list", :flattened true})

(clojure.core/defn- ser-notification-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotificationConfiguration", :type "structure"} (clojure.core/contains? input :topic-configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic-configuration-list (input :topic-configurations)) #:http.request.field{:name "TopicConfigurations", :shape "TopicConfigurationList", :location-name "TopicConfiguration"})) (clojure.core/contains? input :queue-configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queue-configuration-list (input :queue-configurations)) #:http.request.field{:name "QueueConfigurations", :shape "QueueConfigurationList", :location-name "QueueConfiguration"})) (clojure.core/contains? input :lambda-function-configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-configuration-list (input :lambda-function-configurations)) #:http.request.field{:name "LambdaFunctionConfigurations", :shape "LambdaFunctionConfigurationList", :location-name "CloudFunctionConfiguration"}))))

(clojure.core/defn- ser-queue-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-queue-arn (:queue-arn input)) #:http.request.field{:name "QueueArn", :shape "QueueArn", :location-name "Queue"}) (clojure.core/into (ser-event-list (:events input)) #:http.request.field{:name "Events", :shape "EventList", :location-name "Event"})], :shape "QueueConfiguration", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-id (input :id)) #:http.request.field{:name "Id", :shape "NotificationId"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-configuration-filter (input :filter)) #:http.request.field{:name "Filter", :shape "NotificationConfigurationFilter"}))))

(clojure.core/defn- ser-tagging [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-set (:tag-set input)) #:http.request.field{:name "TagSet", :shape "TagSet"})], :shape "Tagging", :type "structure"}))

(clojure.core/defn- ser-host-name [input] #:http.request.field{:value input, :shape "HostName"})

(clojure.core/defn- ser-if-none-match [input] #:http.request.field{:value input, :shape "IfNoneMatch"})

(clojure.core/defn- ser-storage-class [input] #:http.request.field{:value (clojure.core/get {:standard-ia "STANDARD_IA", "GLACIER" "GLACIER", :glacier "GLACIER", "ONEZONE_IA" "ONEZONE_IA", :reduced-redundancy "REDUCED_REDUNDANCY", "STANDARD_IA" "STANDARD_IA", :intelligent-tiering "INTELLIGENT_TIERING", "STANDARD" "STANDARD", :standard "STANDARD", "INTELLIGENT_TIERING" "INTELLIGENT_TIERING", "REDUCED_REDUNDANCY" "REDUCED_REDUNDANCY", :onezone-ia "ONEZONE_IA"} input), :shape "StorageClass"})

(clojure.core/defn- ser-server-side-encryption-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServerSideEncryptionRule", :type "structure"} (clojure.core/contains? input :apply-server-side-encryption-by-default) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-side-encryption-by-default (input :apply-server-side-encryption-by-default)) #:http.request.field{:name "ApplyServerSideEncryptionByDefault", :shape "ServerSideEncryptionByDefault"}))))

(clojure.core/defn- ser-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule coll) #:http.request.field{:shape "Rule"}))) input), :shape "Rules", :type "list", :flattened true})

(clojure.core/defn- ser-lifecycle-expiration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecycleExpiration", :type "structure"} (clojure.core/contains? input :date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :date)) #:http.request.field{:name "Date", :shape "Date"})) (clojure.core/contains? input :days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-days (input :days)) #:http.request.field{:name "Days", :shape "Days"})) (clojure.core/contains? input :expired-object-delete-marker) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expired-object-delete-marker (input :expired-object-delete-marker)) #:http.request.field{:name "ExpiredObjectDeleteMarker", :shape "ExpiredObjectDeleteMarker"}))))

(clojure.core/defn- ser-inventory-format [input] #:http.request.field{:value (clojure.core/get {"CSV" "CSV", :csv "CSV", "ORC" "ORC", :orc "ORC", "Parquet" "Parquet", :parquet "Parquet"} input), :shape "InventoryFormat"})

(clojure.core/defn- ser-queue-configuration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-queue-configuration coll) #:http.request.field{:shape "QueueConfiguration"}))) input), :shape "QueueConfigurationList", :type "list", :flattened true})

(clojure.core/defn- ser-grantee [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-type (:type input)) #:http.request.field{:name "Type", :shape "Type", :location-name "xsi:type", :xml-attribute true})], :shape "Grantee", :type "structure", :xml-namespace {"prefix" "xsi", "uri" "http://www.w3.org/2001/XMLSchema-instance"}} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :email-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "EmailAddress"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :id)) #:http.request.field{:name "ID", :shape "ID"})) (clojure.core/contains? input :uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri (input :uri)) #:http.request.field{:name "URI", :shape "URI"}))))

(clojure.core/defn- ser-key-prefix-equals [input] #:http.request.field{:value input, :shape "KeyPrefixEquals"})

(clojure.core/defn- ser-file-header-info [input] #:http.request.field{:value (clojure.core/get {"USE" "USE", :use "USE", "IGNORE" "IGNORE", :ignore "IGNORE", "NONE" "NONE", :none "NONE"} input), :shape "FileHeaderInfo"})

(clojure.core/defn- ser-output-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputLocation", :type "structure"} (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :s-3)) #:http.request.field{:name "S3", :shape "S3Location"}))))

(clojure.core/defn- ser-allowed-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-allowed-header coll) #:http.request.field{:shape "AllowedHeader"}))) input), :shape "AllowedHeaders", :type "list", :flattened true})

(clojure.core/defn- ser-years [input] #:http.request.field{:value input, :shape "Years"})

(clojure.core/defn- ser-allowed-origins [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-allowed-origin coll) #:http.request.field{:shape "AllowedOrigin"}))) input), :shape "AllowedOrigins", :type "list", :flattened true})

(clojure.core/defn- ser-bucket-name [input] #:http.request.field{:value input, :shape "BucketName"})

(clojure.core/defn- ser-copy-source [input] #:http.request.field{:value input, :shape "CopySource"})

(clojure.core/defn- ser-queue-configuration-deprecated [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "QueueConfigurationDeprecated", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-id (input :id)) #:http.request.field{:name "Id", :shape "NotificationId"})) (clojure.core/contains? input :event) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event (input :event)) #:http.request.field{:name "Event", :shape "Event", :deprecated true})) (clojure.core/contains? input :events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-list (input :events)) #:http.request.field{:name "Events", :shape "EventList", :location-name "Event"})) (clojure.core/contains? input :queue) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queue-arn (input :queue)) #:http.request.field{:name "Queue", :shape "QueueArn"}))))

(clojure.core/defn- ser-expires [input] #:http.request.field{:value input, :shape "Expires"})

(clojure.core/defn- ser-max-keys [input] #:http.request.field{:value input, :shape "MaxKeys"})

(clojure.core/defn- ser-lifecycle-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lifecycle-rule coll) #:http.request.field{:shape "LifecycleRule"}))) input), :shape "LifecycleRules", :type "list", :flattened true})

(clojure.core/defn- ser-sses-3 [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SSES3", :type "structure", :location-name "SSE-S3"}))

(clojure.core/defn- ser-max-age-seconds [input] #:http.request.field{:value input, :shape "MaxAgeSeconds"})

(clojure.core/defn- ser-email-address [input] #:http.request.field{:value input, :shape "EmailAddress"})

(clojure.core/defn- ser-object-lock-retain-until-date [input] #:http.request.field{:value input, :shape "ObjectLockRetainUntilDate"})

(clojure.core/defn- ser-bucket-location-constraint [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :apsoutheast-2 "ap-southeast-2", "ap-southeast-2" "ap-southeast-2", "EU" "EU", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :cnnorth-1 "cn-north-1", "eu-central-1" "eu-central-1", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :uswest-2 "us-west-2", :eu "EU"} input), :shape "BucketLocationConstraint"})

(clojure.core/defn- ser-ssekms-key-id [input] #:http.request.field{:value input, :shape "SSEKMSKeyId"})

(clojure.core/defn- ser-allowed-origin [input] #:http.request.field{:value input, :shape "AllowedOrigin"})

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-accelerate-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccelerateConfiguration", :type "structure"} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-accelerate-status (input :status)) #:http.request.field{:name "Status", :shape "BucketAccelerateStatus"}))))

(clojure.core/defn- ser-object-lock-mode [input] #:http.request.field{:value (clojure.core/get {"GOVERNANCE" "GOVERNANCE", :governance "GOVERNANCE", "COMPLIANCE" "COMPLIANCE", :compliance "COMPLIANCE"} input), :shape "ObjectLockMode"})

(clojure.core/defn- ser-lambda-function-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-function-arn (:lambda-function-arn input)) #:http.request.field{:name "LambdaFunctionArn", :shape "LambdaFunctionArn", :location-name "CloudFunction"}) (clojure.core/into (ser-event-list (:events input)) #:http.request.field{:name "Events", :shape "EventList", :location-name "Event"})], :shape "LambdaFunctionConfiguration", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-id (input :id)) #:http.request.field{:name "Id", :shape "NotificationId"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-configuration-filter (input :filter)) #:http.request.field{:name "Filter", :shape "NotificationConfigurationFilter"}))))

(clojure.core/defn- ser-default-retention [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DefaultRetention", :type "structure"} (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-retention-mode (input :mode)) #:http.request.field{:name "Mode", :shape "ObjectLockRetentionMode"})) (clojure.core/contains? input :days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-days (input :days)) #:http.request.field{:name "Days", :shape "Days"})) (clojure.core/contains? input :years) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-years (input :years)) #:http.request.field{:name "Years", :shape "Years"}))))

(clojure.core/defn- ser-csv-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CSVInput", :type "structure"} (clojure.core/contains? input :file-header-info) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-header-info (input :file-header-info)) #:http.request.field{:name "FileHeaderInfo", :shape "FileHeaderInfo"})) (clojure.core/contains? input :comments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comments (input :comments)) #:http.request.field{:name "Comments", :shape "Comments"})) (clojure.core/contains? input :quote-escape-character) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quote-escape-character (input :quote-escape-character)) #:http.request.field{:name "QuoteEscapeCharacter", :shape "QuoteEscapeCharacter"})) (clojure.core/contains? input :record-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-delimiter (input :record-delimiter)) #:http.request.field{:name "RecordDelimiter", :shape "RecordDelimiter"})) (clojure.core/contains? input :field-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-delimiter (input :field-delimiter)) #:http.request.field{:name "FieldDelimiter", :shape "FieldDelimiter"})) (clojure.core/contains? input :quote-character) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quote-character (input :quote-character)) #:http.request.field{:name "QuoteCharacter", :shape "QuoteCharacter"})) (clojure.core/contains? input :allow-quoted-record-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allow-quoted-record-delimiter (input :allow-quoted-record-delimiter)) #:http.request.field{:name "AllowQuotedRecordDelimiter", :shape "AllowQuotedRecordDelimiter"}))))

(clojure.core/defn- ser-noncurrent-version-transition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NoncurrentVersionTransition", :type "structure"} (clojure.core/contains? input :noncurrent-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-days (input :noncurrent-days)) #:http.request.field{:name "NoncurrentDays", :shape "Days"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transition-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "TransitionStorageClass"}))))

(clojure.core/defn- ser-quote-fields [input] #:http.request.field{:value (clojure.core/get {"ALWAYS" "ALWAYS", :always "ALWAYS", "ASNEEDED" "ASNEEDED", :asneeded "ASNEEDED"} input), :shape "QuoteFields"})

(clojure.core/defn- ser-index-document [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-suffix (:suffix input)) #:http.request.field{:name "Suffix", :shape "Suffix"})], :shape "IndexDocument", :type "structure"}))

(clojure.core/defn- ser-key-marker [input] #:http.request.field{:value input, :shape "KeyMarker"})

(clojure.core/defn- ser-parquet-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParquetInput", :type "structure"}))

(clojure.core/defn- ser-analytics-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-analytics-id (:id input)) #:http.request.field{:name "Id", :shape "AnalyticsId"}) (clojure.core/into (ser-storage-class-analysis (:storage-class-analysis input)) #:http.request.field{:name "StorageClassAnalysis", :shape "StorageClassAnalysis"})], :shape "AnalyticsConfiguration", :type "structure"} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analytics-filter (input :filter)) #:http.request.field{:name "Filter", :shape "AnalyticsFilter"}))))

(clojure.core/defn- ser-cloud-function [input] #:http.request.field{:value input, :shape "CloudFunction"})

(clojure.core/defn- ser-request-payer [input] #:http.request.field{:value (clojure.core/get {"requester" "requester", :requester "requester"} input), :shape "RequestPayer"})

(clojure.core/defn- ser-response-cache-control [input] #:http.request.field{:value input, :shape "ResponseCacheControl"})

(clojure.core/defn- ser-sse-kms-encrypted-objects [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sse-kms-encrypted-objects-status (:status input)) #:http.request.field{:name "Status", :shape "SseKmsEncryptedObjectsStatus"})], :shape "SseKmsEncryptedObjects", :type "structure"}))

(clojure.core/defn- ser-object-lock-retention-mode [input] #:http.request.field{:value (clojure.core/get {"GOVERNANCE" "GOVERNANCE", :governance "GOVERNANCE", "COMPLIANCE" "COMPLIANCE", :compliance "COMPLIANCE"} input), :shape "ObjectLockRetentionMode"})

(clojure.core/defn- ser-object-lock-retention [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ObjectLockRetention", :type "structure"} (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-retention-mode (input :mode)) #:http.request.field{:name "Mode", :shape "ObjectLockRetentionMode"})) (clojure.core/contains? input :retain-until-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :retain-until-date)) #:http.request.field{:name "RetainUntilDate", :shape "Date"}))))

(clojure.core/defn- req-delete-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :mfa) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mfa (input :mfa)) #:http.request.field{:name "MFA", :shape "MFA", :location "header", :location-name "x-amz-mfa"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"})) (clojure.core/contains? input :bypass-governance-retention) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bypass-governance-retention (input :bypass-governance-retention)) #:http.request.field{:name "BypassGovernanceRetention", :shape "BypassGovernanceRetention", :location "header", :location-name "x-amz-bypass-governance-retention"}))))

(clojure.core/defn- req-get-bucket-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-encoding (input :content-encoding)) #:http.request.field{:name "ContentEncoding", :shape "ContentEncoding", :location "header", :location-name "Content-Encoding"})) (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-website-redirect-location (input :website-redirect-location)) #:http.request.field{:name "WebsiteRedirectLocation", :shape "WebsiteRedirectLocation", :location "header", :location-name "x-amz-website-redirect-location"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-body (input :body)) #:http.request.field{:name "Body", :shape "Body", :streaming true})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-side-encryption (input :server-side-encryption)) #:http.request.field{:name "ServerSideEncryption", :shape "ServerSideEncryption", :location "header", :location-name "x-amz-server-side-encryption"})) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-disposition (input :content-disposition)) #:http.request.field{:name "ContentDisposition", :shape "ContentDisposition", :location "header", :location-name "Content-Disposition"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType", :location "header", :location-name "Content-Type"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "ObjectCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :content-length) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-length (input :content-length)) #:http.request.field{:name "ContentLength", :shape "ContentLength", :location "header", :location-name "Content-Length"})) (clojure.core/contains? input :object-lock-legal-hold-status) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-legal-hold-status (input :object-lock-legal-hold-status)) #:http.request.field{:name "ObjectLockLegalHoldStatus", :shape "ObjectLockLegalHoldStatus", :location "header", :location-name "x-amz-object-lock-legal-hold"})) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata (input :metadata)) #:http.request.field{:name "Metadata", :shape "Metadata", :location "headers", :location-name "x-amz-meta-"})) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-control (input :cache-control)) #:http.request.field{:name "CacheControl", :shape "CacheControl", :location "header", :location-name "Cache-Control"})) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-language (input :content-language)) #:http.request.field{:name "ContentLanguage", :shape "ContentLanguage", :location "header", :location-name "Content-Language"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"})) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging-header (input :tagging)) #:http.request.field{:name "Tagging", :shape "TaggingHeader", :location "header", :location-name "x-amz-tagging"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass", :location "header", :location-name "x-amz-storage-class"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires (input :expires)) #:http.request.field{:name "Expires", :shape "Expires", :location "header", :location-name "Expires"})) (clojure.core/contains? input :object-lock-retain-until-date) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-retain-until-date (input :object-lock-retain-until-date)) #:http.request.field{:name "ObjectLockRetainUntilDate", :shape "ObjectLockRetainUntilDate", :location "header", :location-name "x-amz-object-lock-retain-until-date"})) (clojure.core/contains? input :ssekms-key-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms-key-id (input :ssekms-key-id)) #:http.request.field{:name "SSEKMSKeyId", :shape "SSEKMSKeyId", :location "header", :location-name "x-amz-server-side-encryption-aws-kms-key-id"})) (clojure.core/contains? input :object-lock-mode) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-mode (input :object-lock-mode)) #:http.request.field{:name "ObjectLockMode", :shape "ObjectLockMode", :location "header", :location-name "x-amz-object-lock-mode"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-lifecycle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-delete-bucket-cors-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-complete-multipart-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :querystring [(clojure.core/into (ser-multipart-upload-id (input :upload-id)) #:http.request.field{:name "UploadId", :shape "MultipartUploadId", :location "querystring", :location-name "uploadId"})]} (clojure.core/contains? input :multipart-upload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-completed-multipart-upload (input :multipart-upload)) #:http.request.field{:name "MultipartUpload", :shape "CompletedMultipartUpload", :location-name "CompleteMultipartUpload", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-notification-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-object-retention-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-put-bucket-lifecycle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :lifecycle-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-configuration (input :lifecycle-configuration)) #:http.request.field{:name "LifecycleConfiguration", :shape "LifecycleConfiguration", :location-name "LifecycleConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}}))))

(clojure.core/defn- req-put-bucket-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-bucket-logging-status (input :bucket-logging-status)) #:http.request.field{:name "BucketLoggingStatus", :shape "BucketLoggingStatus", :location-name "BucketLoggingStatus", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-head-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-bucket-request-payment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-bucket-request-payment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-request-payment-configuration (input :request-payment-configuration)) #:http.request.field{:name "RequestPaymentConfiguration", :shape "RequestPaymentConfiguration", :location-name "RequestPaymentConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-list-parts-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :querystring [(clojure.core/into (ser-multipart-upload-id (input :upload-id)) #:http.request.field{:name "UploadId", :shape "MultipartUploadId", :location "querystring", :location-name "uploadId"})]} (clojure.core/contains? input :max-parts) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-parts (input :max-parts)) #:http.request.field{:name "MaxParts", :shape "MaxParts", :location "querystring", :location-name "max-parts"})) (clojure.core/contains? input :part-number-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-part-number-marker (input :part-number-marker)) #:http.request.field{:name "PartNumberMarker", :shape "PartNumberMarker", :location "querystring", :location-name "part-number-marker"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-object-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"}))))

(clojure.core/defn- req-put-bucket-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-notification-configuration-deprecated (input :notification-configuration)) #:http.request.field{:name "NotificationConfiguration", :shape "NotificationConfigurationDeprecated", :location-name "NotificationConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-get-bucket-versioning-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-object-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :access-control-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-control-policy (input :access-control-policy)) #:http.request.field{:name "AccessControlPolicy", :shape "AccessControlPolicy", :location-name "AccessControlPolicy", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "ObjectCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :grant-write) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write (input :grant-write)) #:http.request.field{:name "GrantWrite", :shape "GrantWrite", :location "header", :location-name "x-amz-grant-write"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-delete-bucket-lifecycle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-bucket-metrics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-metrics-id (input :id)) #:http.request.field{:name "Id", :shape "MetricsId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-put-bucket-versioning-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-versioning-configuration (input :versioning-configuration)) #:http.request.field{:name "VersioningConfiguration", :shape "VersioningConfiguration", :location-name "VersioningConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :mfa) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mfa (input :mfa)) #:http.request.field{:name "MFA", :shape "MFA", :location "header", :location-name "x-amz-mfa"}))))

(clojure.core/defn- req-put-object-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :body [(clojure.core/into (ser-tagging (input :tagging)) #:http.request.field{:name "Tagging", :shape "Tagging", :location-name "Tagging", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-get-bucket-accelerate-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-delete-bucket-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-delete-bucket-replication-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-delete-public-access-block-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-upload-part-copy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :header [(clojure.core/into (ser-copy-source (input :copy-source)) #:http.request.field{:name "CopySource", :shape "CopySource", :location "header", :location-name "x-amz-copy-source"})], :querystring [(clojure.core/into (ser-part-number (input :part-number)) #:http.request.field{:name "PartNumber", :shape "PartNumber", :location "querystring", :location-name "partNumber"}) (clojure.core/into (ser-multipart-upload-id (input :upload-id)) #:http.request.field{:name "UploadId", :shape "MultipartUploadId", :location "querystring", :location-name "uploadId"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :copy-source-sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-key (input :copy-source-sse-customer-key)) #:http.request.field{:name "CopySourceSSECustomerKey", :shape "CopySourceSSECustomerKey", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-key"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :copy-source-if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-match (input :copy-source-if-match)) #:http.request.field{:name "CopySourceIfMatch", :shape "CopySourceIfMatch", :location "header", :location-name "x-amz-copy-source-if-match"})) (clojure.core/contains? input :copy-source-range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-range (input :copy-source-range)) #:http.request.field{:name "CopySourceRange", :shape "CopySourceRange", :location "header", :location-name "x-amz-copy-source-range"})) (clojure.core/contains? input :copy-source-if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-none-match (input :copy-source-if-none-match)) #:http.request.field{:name "CopySourceIfNoneMatch", :shape "CopySourceIfNoneMatch", :location "header", :location-name "x-amz-copy-source-if-none-match"})) (clojure.core/contains? input :copy-source-if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-modified-since (input :copy-source-if-modified-since)) #:http.request.field{:name "CopySourceIfModifiedSince", :shape "CopySourceIfModifiedSince", :location "header", :location-name "x-amz-copy-source-if-modified-since"})) (clojure.core/contains? input :copy-source-if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-unmodified-since (input :copy-source-if-unmodified-since)) #:http.request.field{:name "CopySourceIfUnmodifiedSince", :shape "CopySourceIfUnmodifiedSince", :location "header", :location-name "x-amz-copy-source-if-unmodified-since"})) (clojure.core/contains? input :copy-source-sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-algorithm (input :copy-source-sse-customer-algorithm)) #:http.request.field{:name "CopySourceSSECustomerAlgorithm", :shape "CopySourceSSECustomerAlgorithm", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :copy-source-sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-key-md-5 (input :copy-source-sse-customer-key-md-5)) #:http.request.field{:name "CopySourceSSECustomerKeyMD5", :shape "CopySourceSSECustomerKeyMD5", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-delete-objects-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-delete (input :delete)) #:http.request.field{:name "Delete", :shape "Delete", :location-name "Delete", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :mfa) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mfa (input :mfa)) #:http.request.field{:name "MFA", :shape "MFA", :location "header", :location-name "x-amz-mfa"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"})) (clojure.core/contains? input :bypass-governance-retention) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bypass-governance-retention (input :bypass-governance-retention)) #:http.request.field{:name "BypassGovernanceRetention", :shape "BypassGovernanceRetention", :location "header", :location-name "x-amz-bypass-governance-retention"}))))

(clojure.core/defn- req-copy-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :header [(clojure.core/into (ser-copy-source (input :copy-source)) #:http.request.field{:name "CopySource", :shape "CopySource", :location "header", :location-name "x-amz-copy-source"})]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-encoding (input :content-encoding)) #:http.request.field{:name "ContentEncoding", :shape "ContentEncoding", :location "header", :location-name "Content-Encoding"})) (clojure.core/contains? input :tagging-directive) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging-directive (input :tagging-directive)) #:http.request.field{:name "TaggingDirective", :shape "TaggingDirective", :location "header", :location-name "x-amz-tagging-directive"})) (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :copy-source-sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-key (input :copy-source-sse-customer-key)) #:http.request.field{:name "CopySourceSSECustomerKey", :shape "CopySourceSSECustomerKey", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-key"})) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-website-redirect-location (input :website-redirect-location)) #:http.request.field{:name "WebsiteRedirectLocation", :shape "WebsiteRedirectLocation", :location "header", :location-name "x-amz-website-redirect-location"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :metadata-directive) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata-directive (input :metadata-directive)) #:http.request.field{:name "MetadataDirective", :shape "MetadataDirective", :location "header", :location-name "x-amz-metadata-directive"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-side-encryption (input :server-side-encryption)) #:http.request.field{:name "ServerSideEncryption", :shape "ServerSideEncryption", :location "header", :location-name "x-amz-server-side-encryption"})) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-disposition (input :content-disposition)) #:http.request.field{:name "ContentDisposition", :shape "ContentDisposition", :location "header", :location-name "Content-Disposition"})) (clojure.core/contains? input :copy-source-if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-match (input :copy-source-if-match)) #:http.request.field{:name "CopySourceIfMatch", :shape "CopySourceIfMatch", :location "header", :location-name "x-amz-copy-source-if-match"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType", :location "header", :location-name "Content-Type"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "ObjectCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :copy-source-if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-none-match (input :copy-source-if-none-match)) #:http.request.field{:name "CopySourceIfNoneMatch", :shape "CopySourceIfNoneMatch", :location "header", :location-name "x-amz-copy-source-if-none-match"})) (clojure.core/contains? input :copy-source-if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-modified-since (input :copy-source-if-modified-since)) #:http.request.field{:name "CopySourceIfModifiedSince", :shape "CopySourceIfModifiedSince", :location "header", :location-name "x-amz-copy-source-if-modified-since"})) (clojure.core/contains? input :copy-source-if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-unmodified-since (input :copy-source-if-unmodified-since)) #:http.request.field{:name "CopySourceIfUnmodifiedSince", :shape "CopySourceIfUnmodifiedSince", :location "header", :location-name "x-amz-copy-source-if-unmodified-since"})) (clojure.core/contains? input :copy-source-sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-algorithm (input :copy-source-sse-customer-algorithm)) #:http.request.field{:name "CopySourceSSECustomerAlgorithm", :shape "CopySourceSSECustomerAlgorithm", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :object-lock-legal-hold-status) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-legal-hold-status (input :object-lock-legal-hold-status)) #:http.request.field{:name "ObjectLockLegalHoldStatus", :shape "ObjectLockLegalHoldStatus", :location "header", :location-name "x-amz-object-lock-legal-hold"})) (clojure.core/contains? input :copy-source-sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-key-md-5 (input :copy-source-sse-customer-key-md-5)) #:http.request.field{:name "CopySourceSSECustomerKeyMD5", :shape "CopySourceSSECustomerKeyMD5", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata (input :metadata)) #:http.request.field{:name "Metadata", :shape "Metadata", :location "headers", :location-name "x-amz-meta-"})) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-control (input :cache-control)) #:http.request.field{:name "CacheControl", :shape "CacheControl", :location "header", :location-name "Cache-Control"})) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-language (input :content-language)) #:http.request.field{:name "ContentLanguage", :shape "ContentLanguage", :location "header", :location-name "Content-Language"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"})) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging-header (input :tagging)) #:http.request.field{:name "Tagging", :shape "TaggingHeader", :location "header", :location-name "x-amz-tagging"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass", :location "header", :location-name "x-amz-storage-class"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires (input :expires)) #:http.request.field{:name "Expires", :shape "Expires", :location "header", :location-name "Expires"})) (clojure.core/contains? input :object-lock-retain-until-date) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-retain-until-date (input :object-lock-retain-until-date)) #:http.request.field{:name "ObjectLockRetainUntilDate", :shape "ObjectLockRetainUntilDate", :location "header", :location-name "x-amz-object-lock-retain-until-date"})) (clojure.core/contains? input :ssekms-key-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms-key-id (input :ssekms-key-id)) #:http.request.field{:name "SSEKMSKeyId", :shape "SSEKMSKeyId", :location "header", :location-name "x-amz-server-side-encryption-aws-kms-key-id"})) (clojure.core/contains? input :object-lock-mode) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-mode (input :object-lock-mode)) #:http.request.field{:name "ObjectLockMode", :shape "ObjectLockMode", :location "header", :location-name "x-amz-object-lock-mode"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-object-legal-hold-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :legal-hold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-legal-hold (input :legal-hold)) #:http.request.field{:name "LegalHold", :shape "ObjectLockLegalHold", :location-name "LegalHold", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-restore-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :restore-request) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restore-request (input :restore-request)) #:http.request.field{:name "RestoreRequest", :shape "RestoreRequest", :location-name "RestoreRequest", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-replication-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-create-multipart-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-encoding (input :content-encoding)) #:http.request.field{:name "ContentEncoding", :shape "ContentEncoding", :location "header", :location-name "Content-Encoding"})) (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-website-redirect-location (input :website-redirect-location)) #:http.request.field{:name "WebsiteRedirectLocation", :shape "WebsiteRedirectLocation", :location "header", :location-name "x-amz-website-redirect-location"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-side-encryption (input :server-side-encryption)) #:http.request.field{:name "ServerSideEncryption", :shape "ServerSideEncryption", :location "header", :location-name "x-amz-server-side-encryption"})) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-disposition (input :content-disposition)) #:http.request.field{:name "ContentDisposition", :shape "ContentDisposition", :location "header", :location-name "Content-Disposition"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType", :location "header", :location-name "Content-Type"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "ObjectCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :object-lock-legal-hold-status) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-legal-hold-status (input :object-lock-legal-hold-status)) #:http.request.field{:name "ObjectLockLegalHoldStatus", :shape "ObjectLockLegalHoldStatus", :location "header", :location-name "x-amz-object-lock-legal-hold"})) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata (input :metadata)) #:http.request.field{:name "Metadata", :shape "Metadata", :location "headers", :location-name "x-amz-meta-"})) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-control (input :cache-control)) #:http.request.field{:name "CacheControl", :shape "CacheControl", :location "header", :location-name "Cache-Control"})) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-language (input :content-language)) #:http.request.field{:name "ContentLanguage", :shape "ContentLanguage", :location "header", :location-name "Content-Language"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"})) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging-header (input :tagging)) #:http.request.field{:name "Tagging", :shape "TaggingHeader", :location "header", :location-name "x-amz-tagging"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass", :location "header", :location-name "x-amz-storage-class"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires (input :expires)) #:http.request.field{:name "Expires", :shape "Expires", :location "header", :location-name "Expires"})) (clojure.core/contains? input :object-lock-retain-until-date) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-retain-until-date (input :object-lock-retain-until-date)) #:http.request.field{:name "ObjectLockRetainUntilDate", :shape "ObjectLockRetainUntilDate", :location "header", :location-name "x-amz-object-lock-retain-until-date"})) (clojure.core/contains? input :ssekms-key-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms-key-id (input :ssekms-key-id)) #:http.request.field{:name "SSEKMSKeyId", :shape "SSEKMSKeyId", :location "header", :location-name "x-amz-server-side-encryption-aws-kms-key-id"})) (clojure.core/contains? input :object-lock-mode) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-mode (input :object-lock-mode)) #:http.request.field{:name "ObjectLockMode", :shape "ObjectLockMode", :location "header", :location-name "x-amz-object-lock-mode"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-head-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-unmodified-since (input :if-unmodified-since)) #:http.request.field{:name "IfUnmodifiedSince", :shape "IfUnmodifiedSince", :location "header", :location-name "If-Unmodified-Since"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-modified-since (input :if-modified-since)) #:http.request.field{:name "IfModifiedSince", :shape "IfModifiedSince", :location "header", :location-name "If-Modified-Since"})) (clojure.core/contains? input :part-number) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-part-number (input :part-number)) #:http.request.field{:name "PartNumber", :shape "PartNumber", :location "querystring", :location-name "partNumber"})) (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-range (input :range)) #:http.request.field{:name "Range", :shape "Range", :location "header", :location-name "Range"})) (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-match (input :if-match)) #:http.request.field{:name "IfMatch", :shape "IfMatch", :location "header", :location-name "If-Match"})) (clojure.core/contains? input :if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-none-match (input :if-none-match)) #:http.request.field{:name "IfNoneMatch", :shape "IfNoneMatch", :location "header", :location-name "If-None-Match"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-list-object-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delimiter (input :delimiter)) #:http.request.field{:name "Delimiter", :shape "Delimiter", :location "querystring", :location-name "delimiter"})) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoding-type (input :encoding-type)) #:http.request.field{:name "EncodingType", :shape "EncodingType", :location "querystring", :location-name "encoding-type"})) (clojure.core/contains? input :key-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-marker (input :key-marker)) #:http.request.field{:name "KeyMarker", :shape "KeyMarker", :location "querystring", :location-name "key-marker"})) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-keys (input :max-keys)) #:http.request.field{:name "MaxKeys", :shape "MaxKeys", :location "querystring", :location-name "max-keys"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :location "querystring", :location-name "prefix"})) (clojure.core/contains? input :version-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-id-marker (input :version-id-marker)) #:http.request.field{:name "VersionIdMarker", :shape "VersionIdMarker", :location "querystring", :location-name "version-id-marker"}))))

(clojure.core/defn- req-put-bucket-notification-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-notification-configuration (input :notification-configuration)) #:http.request.field{:name "NotificationConfiguration", :shape "NotificationConfiguration", :location-name "NotificationConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]}))

(clojure.core/defn- req-list-objects-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delimiter (input :delimiter)) #:http.request.field{:name "Delimiter", :shape "Delimiter", :location "querystring", :location-name "delimiter"})) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoding-type (input :encoding-type)) #:http.request.field{:name "EncodingType", :shape "EncodingType", :location "querystring", :location-name "encoding-type"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-keys (input :max-keys)) #:http.request.field{:name "MaxKeys", :shape "MaxKeys", :location "querystring", :location-name "max-keys"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :location "querystring", :location-name "prefix"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-put-bucket-metrics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-metrics-id (input :id)) #:http.request.field{:name "Id", :shape "MetricsId", :location "querystring", :location-name "id"})], :body [(clojure.core/into (ser-metrics-configuration (input :metrics-configuration)) #:http.request.field{:name "MetricsConfiguration", :shape "MetricsConfiguration", :location-name "MetricsConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]}))

(clojure.core/defn- req-delete-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-delete-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-list-bucket-inventory-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "Token", :location "querystring", :location-name "continuation-token"}))))

(clojure.core/defn- req-delete-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-public-access-block-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-bucket-replication-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-replication-configuration (input :replication-configuration)) #:http.request.field{:name "ReplicationConfiguration", :shape "ReplicationConfiguration", :location-name "ReplicationConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-list-multipart-uploads-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delimiter (input :delimiter)) #:http.request.field{:name "Delimiter", :shape "Delimiter", :location "querystring", :location-name "delimiter"})) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoding-type (input :encoding-type)) #:http.request.field{:name "EncodingType", :shape "EncodingType", :location "querystring", :location-name "encoding-type"})) (clojure.core/contains? input :key-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-marker (input :key-marker)) #:http.request.field{:name "KeyMarker", :shape "KeyMarker", :location "querystring", :location-name "key-marker"})) (clojure.core/contains? input :max-uploads) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-uploads (input :max-uploads)) #:http.request.field{:name "MaxUploads", :shape "MaxUploads", :location "querystring", :location-name "max-uploads"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :location "querystring", :location-name "prefix"})) (clojure.core/contains? input :upload-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-upload-id-marker (input :upload-id-marker)) #:http.request.field{:name "UploadIdMarker", :shape "UploadIdMarker", :location "querystring", :location-name "upload-id-marker"}))))

(clojure.core/defn- req-get-bucket-cors-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-abort-multipart-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :querystring [(clojure.core/into (ser-multipart-upload-id (input :upload-id)) #:http.request.field{:name "UploadId", :shape "MultipartUploadId", :location "querystring", :location-name "uploadId"})]} (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-object-torrent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-put-bucket-analytics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-analytics-id (input :id)) #:http.request.field{:name "Id", :shape "AnalyticsId", :location "querystring", :location-name "id"})], :body [(clojure.core/into (ser-analytics-configuration (input :analytics-configuration)) #:http.request.field{:name "AnalyticsConfiguration", :shape "AnalyticsConfiguration", :location-name "AnalyticsConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]}))

(clojure.core/defn- req-get-object-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-delete-bucket-metrics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-metrics-id (input :id)) #:http.request.field{:name "Id", :shape "MetricsId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-get-bucket-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-bucket-location-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-bucket-inventory-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-inventory-id (input :id)) #:http.request.field{:name "Id", :shape "InventoryId", :location "querystring", :location-name "id"})], :body [(clojure.core/into (ser-inventory-configuration (input :inventory-configuration)) #:http.request.field{:name "InventoryConfiguration", :shape "InventoryConfiguration", :location-name "InventoryConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]}))

(clojure.core/defn- req-get-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :response-expires) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-expires (input :response-expires)) #:http.request.field{:name "ResponseExpires", :shape "ResponseExpires", :location "querystring", :location-name "response-expires"})) (clojure.core/contains? input :if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-unmodified-since (input :if-unmodified-since)) #:http.request.field{:name "IfUnmodifiedSince", :shape "IfUnmodifiedSince", :location "header", :location-name "If-Unmodified-Since"})) (clojure.core/contains? input :response-content-disposition) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-content-disposition (input :response-content-disposition)) #:http.request.field{:name "ResponseContentDisposition", :shape "ResponseContentDisposition", :location "querystring", :location-name "response-content-disposition"})) (clojure.core/contains? input :response-content-language) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-content-language (input :response-content-language)) #:http.request.field{:name "ResponseContentLanguage", :shape "ResponseContentLanguage", :location "querystring", :location-name "response-content-language"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :response-content-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-content-type (input :response-content-type)) #:http.request.field{:name "ResponseContentType", :shape "ResponseContentType", :location "querystring", :location-name "response-content-type"})) (clojure.core/contains? input :if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-modified-since (input :if-modified-since)) #:http.request.field{:name "IfModifiedSince", :shape "IfModifiedSince", :location "header", :location-name "If-Modified-Since"})) (clojure.core/contains? input :part-number) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-part-number (input :part-number)) #:http.request.field{:name "PartNumber", :shape "PartNumber", :location "querystring", :location-name "partNumber"})) (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-range (input :range)) #:http.request.field{:name "Range", :shape "Range", :location "header", :location-name "Range"})) (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-match (input :if-match)) #:http.request.field{:name "IfMatch", :shape "IfMatch", :location "header", :location-name "If-Match"})) (clojure.core/contains? input :response-content-encoding) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-content-encoding (input :response-content-encoding)) #:http.request.field{:name "ResponseContentEncoding", :shape "ResponseContentEncoding", :location "querystring", :location-name "response-content-encoding"})) (clojure.core/contains? input :if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-none-match (input :if-none-match)) #:http.request.field{:name "IfNoneMatch", :shape "IfNoneMatch", :location "header", :location-name "If-None-Match"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"})) (clojure.core/contains? input :response-cache-control) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-cache-control (input :response-cache-control)) #:http.request.field{:name "ResponseCacheControl", :shape "ResponseCacheControl", :location "querystring", :location-name "response-cache-control"}))))

(clojure.core/defn- req-get-bucket-lifecycle-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-bucket-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-bucket-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-tagging (input :tagging)) #:http.request.field{:name "Tagging", :shape "Tagging", :location-name "Tagging", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-create-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :create-bucket-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-bucket-configuration (input :create-bucket-configuration)) #:http.request.field{:name "CreateBucketConfiguration", :shape "CreateBucketConfiguration", :location-name "CreateBucketConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "BucketCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :object-lock-enabled-for-bucket) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-enabled-for-bucket (input :object-lock-enabled-for-bucket)) #:http.request.field{:name "ObjectLockEnabledForBucket", :shape "ObjectLockEnabledForBucket", :location "header", :location-name "x-amz-bucket-object-lock-enabled"})) (clojure.core/contains? input :grant-write) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write (input :grant-write)) #:http.request.field{:name "GrantWrite", :shape "GrantWrite", :location "header", :location-name "x-amz-grant-write"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"}))))

(clojure.core/defn- req-delete-bucket-analytics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-analytics-id (input :id)) #:http.request.field{:name "Id", :shape "AnalyticsId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-get-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-public-access-block-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-public-access-block-configuration (input :public-access-block-configuration)) #:http.request.field{:name "PublicAccessBlockConfiguration", :shape "PublicAccessBlockConfiguration", :location-name "PublicAccessBlockConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-put-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-policy (input :policy)) #:http.request.field{:name "Policy", :shape "Policy"})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :confirm-remove-self-bucket-access) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-confirm-remove-self-bucket-access (input :confirm-remove-self-bucket-access)) #:http.request.field{:name "ConfirmRemoveSelfBucketAccess", :shape "ConfirmRemoveSelfBucketAccess", :location "header", :location-name "x-amz-confirm-remove-self-bucket-access"}))))

(clojure.core/defn- req-delete-object-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"}))))

(clojure.core/defn- req-put-bucket-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-server-side-encryption-configuration (input :server-side-encryption-configuration)) #:http.request.field{:name "ServerSideEncryptionConfiguration", :shape "ServerSideEncryptionConfiguration", :location-name "ServerSideEncryptionConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-list-objects-v-2-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :location "querystring", :location-name "prefix"})) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoding-type (input :encoding-type)) #:http.request.field{:name "EncodingType", :shape "EncodingType", :location "querystring", :location-name "encoding-type"})) (clojure.core/contains? input :start-after) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start-after (input :start-after)) #:http.request.field{:name "StartAfter", :shape "StartAfter", :location "querystring", :location-name "start-after"})) (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "Token", :location "querystring", :location-name "continuation-token"})) (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delimiter (input :delimiter)) #:http.request.field{:name "Delimiter", :shape "Delimiter", :location "querystring", :location-name "delimiter"})) (clojure.core/contains? input :fetch-owner) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fetch-owner (input :fetch-owner)) #:http.request.field{:name "FetchOwner", :shape "FetchOwner", :location "querystring", :location-name "fetch-owner"})) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-keys (input :max-keys)) #:http.request.field{:name "MaxKeys", :shape "MaxKeys", :location "querystring", :location-name "max-keys"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-object-lock-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-bucket-cors-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-cors-configuration (input :cors-configuration)) #:http.request.field{:name "CORSConfiguration", :shape "CORSConfiguration", :location-name "CORSConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-get-bucket-policy-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-bucket-accelerate-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-accelerate-configuration (input :accelerate-configuration)) #:http.request.field{:name "AccelerateConfiguration", :shape "AccelerateConfiguration", :location-name "AccelerateConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]}))

(clojure.core/defn- req-delete-bucket-inventory-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-inventory-id (input :id)) #:http.request.field{:name "Id", :shape "InventoryId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-get-bucket-inventory-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-inventory-id (input :id)) #:http.request.field{:name "Id", :shape "InventoryId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-put-bucket-lifecycle-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :lifecycle-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-lifecycle-configuration (input :lifecycle-configuration)) #:http.request.field{:name "LifecycleConfiguration", :shape "BucketLifecycleConfiguration", :location-name "LifecycleConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}}))))

(clojure.core/defn- req-select-object-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :body [(clojure.core/into (ser-expression (input :expression)) #:http.request.field{:name "Expression", :shape "Expression"}) (clojure.core/into (ser-expression-type (input :expression-type)) #:http.request.field{:name "ExpressionType", :shape "ExpressionType"}) (clojure.core/into (ser-input-serialization (input :input-serialization)) #:http.request.field{:name "InputSerialization", :shape "InputSerialization"}) (clojure.core/into (ser-output-serialization (input :output-serialization)) #:http.request.field{:name "OutputSerialization", :shape "OutputSerialization"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :request-progress) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-progress (input :request-progress)) #:http.request.field{:name "RequestProgress", :shape "RequestProgress"}))))

(clojure.core/defn- req-delete-bucket-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-object-legal-hold-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-put-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-website-configuration (input :website-configuration)) #:http.request.field{:name "WebsiteConfiguration", :shape "WebsiteConfiguration", :location-name "WebsiteConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-list-bucket-metrics-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "Token", :location "querystring", :location-name "continuation-token"}))))

(clojure.core/defn- req-get-bucket-analytics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-analytics-id (input :id)) #:http.request.field{:name "Id", :shape "AnalyticsId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-upload-part-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :querystring [(clojure.core/into (ser-part-number (input :part-number)) #:http.request.field{:name "PartNumber", :shape "PartNumber", :location "querystring", :location-name "partNumber"}) (clojure.core/into (ser-multipart-upload-id (input :upload-id)) #:http.request.field{:name "UploadId", :shape "MultipartUploadId", :location "querystring", :location-name "uploadId"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-body (input :body)) #:http.request.field{:name "Body", :shape "Body", :streaming true})) (clojure.core/contains? input :content-length) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-length (input :content-length)) #:http.request.field{:name "ContentLength", :shape "ContentLength", :location "header", :location-name "Content-Length"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-put-bucket-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :access-control-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-control-policy (input :access-control-policy)) #:http.request.field{:name "AccessControlPolicy", :shape "AccessControlPolicy", :location-name "AccessControlPolicy", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "BucketCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :grant-write) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write (input :grant-write)) #:http.request.field{:name "GrantWrite", :shape "GrantWrite", :location "header", :location-name "x-amz-grant-write"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"}))))

(clojure.core/defn- req-list-bucket-analytics-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "Token", :location "querystring", :location-name "continuation-token"}))))

(clojure.core/defn- req-put-object-lock-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :object-lock-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-configuration (input :object-lock-configuration)) #:http.request.field{:name "ObjectLockConfiguration", :shape "ObjectLockConfiguration", :location-name "ObjectLockConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"})) (clojure.core/contains? input :token) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-token (input :token)) #:http.request.field{:name "Token", :shape "ObjectLockToken", :location "header", :location-name "x-amz-bucket-object-lock-token"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-put-object-retention-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :retention) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-lock-retention (input :retention)) #:http.request.field{:name "Retention", :shape "ObjectLockRetention", :location-name "Retention", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :bypass-governance-retention) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bypass-governance-retention (input :bypass-governance-retention)) #:http.request.field{:name "BypassGovernanceRetention", :shape "BypassGovernanceRetention", :location "header", :location-name "x-amz-bypass-governance-retention"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/declare deser-bucket)

(clojure.core/declare deser-metrics-configuration)

(clojure.core/declare deser-missing-meta)

(clojure.core/declare deser-cloud-function-invocation-role)

(clojure.core/declare deser-content-encoding)

(clojure.core/declare deser-setting)

(clojure.core/declare deser-key-count)

(clojure.core/declare deser-multipart-upload-list)

(clojure.core/declare deser-tag-set)

(clojure.core/declare deser-sse-customer-key-md-5)

(clojure.core/declare deser-routing-rules)

(clojure.core/declare deser-expired-object-delete-marker)

(clojure.core/declare deser-replica-kms-key-id)

(clojure.core/declare deser-metrics-configuration-list)

(clojure.core/declare deser-notification-id)

(clojure.core/declare deser-common-prefix-list)

(clojure.core/declare deser-continuation-event)

(clojure.core/declare deser-object-lock-enabled)

(clojure.core/declare deser-mfa-delete-status)

(clojure.core/declare deser-filter-rule-name)

(clojure.core/declare deser-inventory-id)

(clojure.core/declare deser-topic-configuration-list)

(clojure.core/declare deser-access-control-translation)

(clojure.core/declare deser-topic-configuration-deprecated)

(clojure.core/declare deser-object-lock-legal-hold)

(clojure.core/declare deser-website-redirect-location)

(clojure.core/declare deser-prefix)

(clojure.core/declare deser-type)

(clojure.core/declare deser-copy-source-version-id)

(clojure.core/declare deser-storage-class-analysis-schema-version)

(clojure.core/declare deser-encoding-type)

(clojure.core/declare deser-sse-kms-encrypted-objects-status)

(clojure.core/declare deser-next-key-marker)

(clojure.core/declare deser-encryption-configuration)

(clojure.core/declare deser-inventory-filter)

(clojure.core/declare deser-cloud-function-configuration)

(clojure.core/declare deser-inventory-optional-field)

(clojure.core/declare deser-permission)

(clojure.core/declare deser-select-object-content-event-stream)

(clojure.core/declare deser-server-side-encryption-configuration)

(clojure.core/declare deser-target-grant)

(clojure.core/declare deser-replication-configuration)

(clojure.core/declare deser-is-public)

(clojure.core/declare deser-sse-customer-algorithm)

(clojure.core/declare deser-inventory-schedule)

(clojure.core/declare deser-transition)

(clojure.core/declare deser-multipart-upload)

(clojure.core/declare deser-analytics-export-destination)

(clojure.core/declare deser-storage-class-analysis)

(clojure.core/declare deser-expose-header)

(clojure.core/declare deser-body)

(clojure.core/declare deser-delete-marker-replication-status)

(clojure.core/declare deser-object)

(clojure.core/declare deser-grants)

(clojure.core/declare deser-transition-storage-class)

(clojure.core/declare deser-lifecycle-rule-filter)

(clojure.core/declare deser-payer)

(clojure.core/declare deser-metrics-filter)

(clojure.core/declare deser-inventory-destination)

(clojure.core/declare deser-object-version-id)

(clojure.core/declare deser-days-after-initiation)

(clojure.core/declare deser-copy-part-result)

(clojure.core/declare deser-replication-rule-filter)

(clojure.core/declare deser-deleted-objects)

(clojure.core/declare deser-start-after)

(clojure.core/declare deser-inventory-encryption)

(clojure.core/declare deser-replace-key-prefix-with)

(clojure.core/declare deser-content-range)

(clojure.core/declare deser-metrics-and-operator)

(clojure.core/declare deser-object-lock-configuration)

(clojure.core/declare deser-lifecycle-rule)

(clojure.core/declare deser-parts)

(clojure.core/declare deser-abort-date)

(clojure.core/declare deser-accept-ranges)

(clojure.core/declare deser-replication-status)

(clojure.core/declare deser-marker)

(clojure.core/declare deser-analytics-and-operator)

(clojure.core/declare deser-lambda-function-configuration-list)

(clojure.core/declare deser-source-selection-criteria)

(clojure.core/declare deser-destination)

(clojure.core/declare deser-max-parts)

(clojure.core/declare deser-public-access-block-configuration)

(clojure.core/declare deser-expiration-status)

(clojure.core/declare deser-location)

(clojure.core/declare deser-bytes-returned)

(clojure.core/declare deser-object-list)

(clojure.core/declare deser-metadata-key)

(clojure.core/declare deser-filter-rule-value)

(clojure.core/declare deser-filter-rule-list)

(clojure.core/declare deser-analytics-s-3-bucket-destination)

(clojure.core/declare deser-inventory-configuration-list)

(clojure.core/declare deser-next-part-number-marker)

(clojure.core/declare deser-noncurrent-version-transition-list)

(clojure.core/declare deser-event-list)

(clojure.core/declare deser-server-side-encryption)

(clojure.core/declare deser-event)

(clojure.core/declare deser-end-event)

(clojure.core/declare deser-content-disposition)

(clojure.core/declare deser-error-document)

(clojure.core/declare deser-redirect)

(clojure.core/declare deser-progress)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-priority)

(clojure.core/declare deser-bucket-logs-permission)

(clojure.core/declare deser-analytics-id)

(clojure.core/declare deser-http-error-code-returned-equals)

(clojure.core/declare deser-upload-id-marker)

(clojure.core/declare deser-part-number)

(clojure.core/declare deser-logging-enabled)

(clojure.core/declare deser-date)

(clojure.core/declare deser-inventory-configuration)

(clojure.core/declare deser-allowed-methods)

(clojure.core/declare deser-e-tag)

(clojure.core/declare deser-object-storage-class)

(clojure.core/declare deser-max-uploads)

(clojure.core/declare deser-replication-rule-and-operator)

(clojure.core/declare deser-metrics-id)

(clojure.core/declare deser-owner-override)

(clojure.core/declare deser-multipart-upload-id)

(clojure.core/declare deser-metadata-value)

(clojure.core/declare deser-stats-event)

(clojure.core/declare deser-bucket-versioning-status)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-is-truncated)

(clojure.core/declare deser-inventory-included-object-versions)

(clojure.core/declare deser-restore)

(clojure.core/declare deser-tag-count)

(clojure.core/declare deser-role)

(clojure.core/declare deser-server-side-encryption-by-default)

(clojure.core/declare deser-display-name)

(clojure.core/declare deser-records-event)

(clojure.core/declare deser-cors-rule)

(clojure.core/declare deser-grant)

(clojure.core/declare deser-object-lock-rule)

(clojure.core/declare deser-initiated)

(clojure.core/declare deser-content-length)

(clojure.core/declare deser-topic-configuration)

(clojure.core/declare deser-is-enabled)

(clojure.core/declare deser-progress-event)

(clojure.core/declare deser-inventory-s-3-bucket-destination)

(clojure.core/declare deser-copy-object-result)

(clojure.core/declare deser-id)

(clojure.core/declare deser-inventory-frequency)

(clojure.core/declare deser-value)

(clojure.core/declare deser-expose-headers)

(clojure.core/declare deser-transition-list)

(clojure.core/declare deser-analytics-filter)

(clojure.core/declare deser-analytics-s-3-export-file-format)

(clojure.core/declare deser-version-id-marker)

(clojure.core/declare deser-object-key)

(clojure.core/declare deser-allowed-method)

(clojure.core/declare deser-bucket-accelerate-status)

(clojure.core/declare deser-lambda-function-arn)

(clojure.core/declare deser-protocol)

(clojure.core/declare deser-message)

(clojure.core/declare deser-replication-rule)

(clojure.core/declare deser-redirect-all-requests-to)

(clojure.core/declare deser-target-grants)

(clojure.core/declare deser-buckets)

(clojure.core/declare deser-last-modified)

(clojure.core/declare deser-filter-rule)

(clojure.core/declare deser-replication-rules)

(clojure.core/declare deser-s-3-key-filter)

(clojure.core/declare deser-parts-count)

(clojure.core/declare deser-abort-rule-id)

(clojure.core/declare deser-target-bucket)

(clojure.core/declare deser-replace-key-with)

(clojure.core/declare deser-size)

(clojure.core/declare deser-part)

(clojure.core/declare deser-part-number-marker)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-notification-configuration-filter)

(clojure.core/declare deser-topic-arn)

(clojure.core/declare deser-suffix)

(clojure.core/declare deser-lifecycle-rule-and-operator)

(clojure.core/declare deser-allowed-header)

(clojure.core/declare deser-rule)

(clojure.core/declare deser-routing-rule)

(clojure.core/declare deser-noncurrent-version-expiration)

(clojure.core/declare deser-delete-marker-replication)

(clojure.core/declare deser-next-version-id-marker)

(clojure.core/declare deser-ssekms)

(clojure.core/declare deser-deleted-object)

(clojure.core/declare deser-abort-incomplete-multipart-upload)

(clojure.core/declare deser-http-redirect-code)

(clojure.core/declare deser-uri)

(clojure.core/declare deser-inventory-optional-fields)

(clojure.core/declare deser-owner)

(clojure.core/declare deser-replication-rule-status)

(clojure.core/declare deser-next-marker)

(clojure.core/declare deser-days)

(clojure.core/declare deser-storage-class-analysis-data-export)

(clojure.core/declare deser-creation-date)

(clojure.core/declare deser-bytes-scanned)

(clojure.core/declare deser-bytes-processed)

(clojure.core/declare deser-stats)

(clojure.core/declare deser-cors-rules)

(clojure.core/declare deser-object-lock-legal-hold-status)

(clojure.core/declare deser-metadata)

(clojure.core/declare deser-cache-control)

(clojure.core/declare deser-content-language)

(clojure.core/declare deser-object-version-list)

(clojure.core/declare deser-policy)

(clojure.core/declare deser-delimiter)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-condition)

(clojure.core/declare deser-error)

(clojure.core/declare deser-queue-arn)

(clojure.core/declare deser-object-version)

(clojure.core/declare deser-target-prefix)

(clojure.core/declare deser-object-version-storage-class)

(clojure.core/declare deser-delete-marker-entry)

(clojure.core/declare deser-server-side-encryption-rules)

(clojure.core/declare deser-queue-configuration)

(clojure.core/declare deser-code)

(clojure.core/declare deser-policy-status)

(clojure.core/declare deser-host-name)

(clojure.core/declare deser-restore-output-path)

(clojure.core/declare deser-storage-class)

(clojure.core/declare deser-server-side-encryption-rule)

(clojure.core/declare deser-rules)

(clojure.core/declare deser-lifecycle-expiration)

(clojure.core/declare deser-analytics-configuration-list)

(clojure.core/declare deser-inventory-format)

(clojure.core/declare deser-queue-configuration-list)

(clojure.core/declare deser-grantee)

(clojure.core/declare deser-key-prefix-equals)

(clojure.core/declare deser-allowed-headers)

(clojure.core/declare deser-delete-marker)

(clojure.core/declare deser-years)

(clojure.core/declare deser-allowed-origins)

(clojure.core/declare deser-bucket-name)

(clojure.core/declare deser-queue-configuration-deprecated)

(clojure.core/declare deser-request-charged)

(clojure.core/declare deser-expires)

(clojure.core/declare deser-max-keys)

(clojure.core/declare deser-lifecycle-rules)

(clojure.core/declare deser-initiator)

(clojure.core/declare deser-sses-3)

(clojure.core/declare deser-max-age-seconds)

(clojure.core/declare deser-email-address)

(clojure.core/declare deser-object-lock-retain-until-date)

(clojure.core/declare deser-bucket-location-constraint)

(clojure.core/declare deser-ssekms-key-id)

(clojure.core/declare deser-allowed-origin)

(clojure.core/declare deser-token)

(clojure.core/declare deser-object-lock-mode)

(clojure.core/declare deser-lambda-function-configuration)

(clojure.core/declare deser-delete-marker-version-id)

(clojure.core/declare deser-default-retention)

(clojure.core/declare deser-is-latest)

(clojure.core/declare deser-noncurrent-version-transition)

(clojure.core/declare deser-index-document)

(clojure.core/declare deser-key-marker)

(clojure.core/declare deser-common-prefix)

(clojure.core/declare deser-next-upload-id-marker)

(clojure.core/declare deser-analytics-configuration)

(clojure.core/declare deser-expiration)

(clojure.core/declare deser-cloud-function)

(clojure.core/declare deser-delete-markers)

(clojure.core/declare deser-sse-kms-encrypted-objects)

(clojure.core/declare deser-object-lock-retention-mode)

(clojure.core/declare deser-object-lock-retention)

(clojure.core/declare deser-errors)

(clojure.core/defn- deser-bucket [input] (clojure.core/let [letvar1628576 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CreationDate" (portkey.aws/search-for-tag input "CreationDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1628576 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar1628576 ["Name" :content]))) (letvar1628576 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar1628576 ["CreationDate" :content]))))))

(clojure.core/defn- deser-metrics-configuration [input] (clojure.core/let [letvar1628684 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-metrics-id (clojure.core/get-in letvar1628684 ["Id" :content]))} (letvar1628684 "Filter") (clojure.core/assoc :filter (deser-metrics-filter (clojure.core/get-in letvar1628684 ["Filter" :content]))))))

(clojure.core/defn- deser-missing-meta [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cloud-function-invocation-role [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-content-encoding [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-setting [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-key-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-multipart-upload-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-multipart-upload (:content coll)))) input))

(clojure.core/defn- deser-tag-set [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-sse-customer-key-md-5 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-routing-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-routing-rule coll))) input))

(clojure.core/defn- deser-expired-object-delete-marker [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-replica-kms-key-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metrics-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metrics-configuration (:content coll)))) input))

(clojure.core/defn- deser-notification-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-common-prefix-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-common-prefix (:content coll)))) input))

(clojure.core/defn- deser-continuation-event [input] (clojure.core/let [letvar1628910 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-object-lock-enabled [input] (clojure.core/get {"Enabled" :enabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-mfa-delete-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-filter-rule-name [input] (clojure.core/get {"prefix" :prefix, "suffix" :suffix} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-inventory-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-topic-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-topic-configuration (:content coll)))) input))

(clojure.core/defn- deser-access-control-translation [input] (clojure.core/let [letvar1629055 {"Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:owner (deser-owner-override (clojure.core/get-in letvar1629055 ["Owner" :content]))})))

(clojure.core/defn- deser-topic-configuration-deprecated [input] (clojure.core/let [letvar1629163 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? nil :xmlAttribute? nil), "Topic" (portkey.aws/search-for-tag input "Topic" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1629163 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1629163 ["Id" :content]))) (letvar1629163 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar1629163 ["Event"]))) (letvar1629163 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar1629163 ["Event" :content]))) (letvar1629163 "Topic") (clojure.core/assoc :topic (deser-topic-arn (clojure.core/get-in letvar1629163 ["Topic" :content]))))))

(clojure.core/defn- deser-object-lock-legal-hold [input] (clojure.core/let [letvar1629271 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1629271 "Status") (clojure.core/assoc :status (deser-object-lock-legal-hold-status (clojure.core/get-in letvar1629271 ["Status" :content]))))))

(clojure.core/defn- deser-website-redirect-location [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-prefix [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-type [input] (clojure.core/get {"CanonicalUser" :canonical-user, "AmazonCustomerByEmail" :amazon-customer-by-email, "Group" :group} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-copy-source-version-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-storage-class-analysis-schema-version [input] (clojure.core/get {"V_1" :v-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-encoding-type [input] (clojure.core/get {"url" :url} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-sse-kms-encrypted-objects-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-next-key-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-encryption-configuration [input] (clojure.core/let [letvar1629419 {"ReplicaKmsKeyID" (portkey.aws/search-for-tag input "ReplicaKmsKeyID" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1629419 "ReplicaKmsKeyID") (clojure.core/assoc :replica-kms-key-id (deser-replica-kms-key-id (clojure.core/get-in letvar1629419 ["ReplicaKmsKeyID" :content]))))))

(clojure.core/defn- deser-inventory-filter [input] (clojure.core/let [letvar1629527 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:prefix (deser-prefix (clojure.core/get-in letvar1629527 ["Prefix" :content]))})))

(clojure.core/defn- deser-cloud-function-configuration [input] (clojure.core/let [letvar1629635 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "CloudFunction" (portkey.aws/search-for-tag input "CloudFunction" :flattened? nil :xmlAttribute? nil), "InvocationRole" (portkey.aws/search-for-tag input "InvocationRole" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1629635 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1629635 ["Id" :content]))) (letvar1629635 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar1629635 ["Event" :content]))) (letvar1629635 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar1629635 ["Event"]))) (letvar1629635 "CloudFunction") (clojure.core/assoc :cloud-function (deser-cloud-function (clojure.core/get-in letvar1629635 ["CloudFunction" :content]))) (letvar1629635 "InvocationRole") (clojure.core/assoc :invocation-role (deser-cloud-function-invocation-role (clojure.core/get-in letvar1629635 ["InvocationRole" :content]))))))

(clojure.core/defn- deser-inventory-optional-field [input] (clojure.core/get {"LastModifiedDate" :last-modified-date, "ReplicationStatus" :replication-status, "EncryptionStatus" :encryption-status, "ETag" :e-tag, "Size" :size, "ObjectLockLegalHoldStatus" :object-lock-legal-hold-status, "IsMultipartUploaded" :is-multipart-uploaded, "StorageClass" :storage-class, "ObjectLockRetainUntilDate" :object-lock-retain-until-date, "ObjectLockMode" :object-lock-mode} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-permission [input] (clojure.core/get {"FULL_CONTROL" :full-control, "WRITE" :write, "WRITE_ACP" :write-acp, "READ" :read, "READ_ACP" :read-acp} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-select-object-content-event-stream [input] (clojure.core/let [letvar1629753 {"Records" (portkey.aws/search-for-tag input "Records" :flattened? nil :xmlAttribute? nil), "Stats" (portkey.aws/search-for-tag input "Stats" :flattened? nil :xmlAttribute? nil), "Progress" (portkey.aws/search-for-tag input "Progress" :flattened? nil :xmlAttribute? nil), "Cont" (portkey.aws/search-for-tag input "Cont" :flattened? nil :xmlAttribute? nil), "End" (portkey.aws/search-for-tag input "End" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1629753 "Records") (clojure.core/assoc :records (deser-records-event (clojure.core/get-in letvar1629753 ["Records" :content]))) (letvar1629753 "Stats") (clojure.core/assoc :stats (deser-stats-event (clojure.core/get-in letvar1629753 ["Stats" :content]))) (letvar1629753 "Progress") (clojure.core/assoc :progress (deser-progress-event (clojure.core/get-in letvar1629753 ["Progress" :content]))) (letvar1629753 "Cont") (clojure.core/assoc :cont (deser-continuation-event (clojure.core/get-in letvar1629753 ["Cont" :content]))) (letvar1629753 "End") (clojure.core/assoc :end (deser-end-event (clojure.core/get-in letvar1629753 ["End" :content]))))))

(clojure.core/defn- deser-server-side-encryption-configuration [input] (clojure.core/let [letvar1629861 {"Rule" (portkey.aws/search-for-tag input "Rule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:rules (deser-server-side-encryption-rules (clojure.core/get-in letvar1629861 ["Rule"]))})))

(clojure.core/defn- deser-target-grant [input] (clojure.core/let [letvar1629969 {"Grantee" (portkey.aws/search-for-tag input "Grantee" :flattened? nil :xmlAttribute? nil), "Permission" (portkey.aws/search-for-tag input "Permission" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1629969 "Grantee") (clojure.core/assoc :grantee (deser-grantee (clojure.core/get-in letvar1629969 ["Grantee" :content]))) (letvar1629969 "Permission") (clojure.core/assoc :permission (deser-bucket-logs-permission (clojure.core/get-in letvar1629969 ["Permission" :content]))))))

(clojure.core/defn- deser-replication-configuration [input] (clojure.core/let [letvar1630077 {"Role" (portkey.aws/search-for-tag input "Role" :flattened? nil :xmlAttribute? nil), "Rule" (portkey.aws/search-for-tag input "Rule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:role (deser-role (clojure.core/get-in letvar1630077 ["Role" :content])), :rules (deser-replication-rules (clojure.core/get-in letvar1630077 ["Rule"]))})))

(clojure.core/defn- deser-is-public [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-sse-customer-algorithm [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-schedule [input] (clojure.core/let [letvar1630192 {"Frequency" (portkey.aws/search-for-tag input "Frequency" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:frequency (deser-inventory-frequency (clojure.core/get-in letvar1630192 ["Frequency" :content]))})))

(clojure.core/defn- deser-transition [input] (clojure.core/let [letvar1630300 {"Date" (portkey.aws/search-for-tag input "Date" :flattened? nil :xmlAttribute? nil), "Days" (portkey.aws/search-for-tag input "Days" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1630300 "Date") (clojure.core/assoc :date (deser-date (clojure.core/get-in letvar1630300 ["Date" :content]))) (letvar1630300 "Days") (clojure.core/assoc :days (deser-days (clojure.core/get-in letvar1630300 ["Days" :content]))) (letvar1630300 "StorageClass") (clojure.core/assoc :storage-class (deser-transition-storage-class (clojure.core/get-in letvar1630300 ["StorageClass" :content]))))))

(clojure.core/defn- deser-multipart-upload [input] (clojure.core/let [letvar1630408 {"UploadId" (portkey.aws/search-for-tag input "UploadId" :flattened? nil :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Initiated" (portkey.aws/search-for-tag input "Initiated" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil), "Initiator" (portkey.aws/search-for-tag input "Initiator" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1630408 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar1630408 ["UploadId" :content]))) (letvar1630408 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1630408 ["Key" :content]))) (letvar1630408 "Initiated") (clojure.core/assoc :initiated (deser-initiated (clojure.core/get-in letvar1630408 ["Initiated" :content]))) (letvar1630408 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1630408 ["StorageClass" :content]))) (letvar1630408 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1630408 ["Owner" :content]))) (letvar1630408 "Initiator") (clojure.core/assoc :initiator (deser-initiator (clojure.core/get-in letvar1630408 ["Initiator" :content]))))))

(clojure.core/defn- deser-analytics-export-destination [input] (clojure.core/let [letvar1630516 {"S3BucketDestination" (portkey.aws/search-for-tag input "S3BucketDestination" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:s-3-bucket-destination (deser-analytics-s-3-bucket-destination (clojure.core/get-in letvar1630516 ["S3BucketDestination" :content]))})))

(clojure.core/defn- deser-storage-class-analysis [input] (clojure.core/let [letvar1630624 {"DataExport" (portkey.aws/search-for-tag input "DataExport" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1630624 "DataExport") (clojure.core/assoc :data-export (deser-storage-class-analysis-data-export (clojure.core/get-in letvar1630624 ["DataExport" :content]))))))

(clojure.core/defn- deser-expose-header [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-body [input] input)

(clojure.core/defn- deser-delete-marker-replication-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-object [input] (clojure.core/let [letvar1630744 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil), "ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1630744 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1630744 ["Key" :content]))) (letvar1630744 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1630744 ["LastModified" :content]))) (letvar1630744 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1630744 ["ETag" :content]))) (letvar1630744 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar1630744 ["Size" :content]))) (letvar1630744 "StorageClass") (clojure.core/assoc :storage-class (deser-object-storage-class (clojure.core/get-in letvar1630744 ["StorageClass" :content]))) (letvar1630744 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1630744 ["Owner" :content]))))))

(clojure.core/defn- deser-grants [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-grant coll))) input))

(clojure.core/defn- deser-transition-storage-class [input] (clojure.core/get {"GLACIER" :glacier, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia, "INTELLIGENT_TIERING" :intelligent-tiering} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lifecycle-rule-filter [input] (clojure.core/let [letvar1630874 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1630874 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1630874 ["Prefix" :content]))) (letvar1630874 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar1630874 ["Tag" :content]))) (letvar1630874 "And") (clojure.core/assoc :and (deser-lifecycle-rule-and-operator (clojure.core/get-in letvar1630874 ["And" :content]))))))

(clojure.core/defn- deser-payer [input] (clojure.core/get {"Requester" :requester, "BucketOwner" :bucket-owner} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metrics-filter [input] (clojure.core/let [letvar1630987 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1630987 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1630987 ["Prefix" :content]))) (letvar1630987 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar1630987 ["Tag" :content]))) (letvar1630987 "And") (clojure.core/assoc :and (deser-metrics-and-operator (clojure.core/get-in letvar1630987 ["And" :content]))))))

(clojure.core/defn- deser-inventory-destination [input] (clojure.core/let [letvar1631095 {"S3BucketDestination" (portkey.aws/search-for-tag input "S3BucketDestination" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:s-3-bucket-destination (deser-inventory-s-3-bucket-destination (clojure.core/get-in letvar1631095 ["S3BucketDestination" :content]))})))

(clojure.core/defn- deser-object-version-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-days-after-initiation [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-copy-part-result [input] (clojure.core/let [letvar1631210 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1631210 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1631210 ["ETag" :content]))) (letvar1631210 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1631210 ["LastModified" :content]))))))

(clojure.core/defn- deser-replication-rule-filter [input] (clojure.core/let [letvar1631318 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1631318 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1631318 ["Prefix" :content]))) (letvar1631318 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar1631318 ["Tag" :content]))) (letvar1631318 "And") (clojure.core/assoc :and (deser-replication-rule-and-operator (clojure.core/get-in letvar1631318 ["And" :content]))))))

(clojure.core/defn- deser-deleted-objects [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deleted-object (:content coll)))) input))

(clojure.core/defn- deser-start-after [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-encryption [input] (clojure.core/let [letvar1631448 {"SSE-S3" (portkey.aws/search-for-tag input "SSE-S3" :flattened? nil :xmlAttribute? nil), "SSE-KMS" (portkey.aws/search-for-tag input "SSE-KMS" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1631448 "SSE-S3") (clojure.core/assoc :sses-3 (deser-sses-3 (clojure.core/get-in letvar1631448 ["SSE-S3" :content]))) (letvar1631448 "SSE-KMS") (clojure.core/assoc :ssekms (deser-ssekms (clojure.core/get-in letvar1631448 ["SSE-KMS" :content]))))))

(clojure.core/defn- deser-replace-key-prefix-with [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-content-range [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metrics-and-operator [input] (clojure.core/let [letvar1631566 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1631566 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1631566 ["Prefix" :content]))) (letvar1631566 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar1631566 ["Tag" :content]))))))

(clojure.core/defn- deser-object-lock-configuration [input] (clojure.core/let [letvar1631674 {"ObjectLockEnabled" (portkey.aws/search-for-tag input "ObjectLockEnabled" :flattened? nil :xmlAttribute? nil), "Rule" (portkey.aws/search-for-tag input "Rule" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1631674 "ObjectLockEnabled") (clojure.core/assoc :object-lock-enabled (deser-object-lock-enabled (clojure.core/get-in letvar1631674 ["ObjectLockEnabled" :content]))) (letvar1631674 "Rule") (clojure.core/assoc :rule (deser-object-lock-rule (clojure.core/get-in letvar1631674 ["Rule" :content]))))))

(clojure.core/defn- deser-lifecycle-rule [input] (clojure.core/let [letvar1631782 {"Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Transition" (portkey.aws/search-for-tag input "Transition" :flattened? true :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "NoncurrentVersionExpiration" (portkey.aws/search-for-tag input "NoncurrentVersionExpiration" :flattened? nil :xmlAttribute? nil), "AbortIncompleteMultipartUpload" (portkey.aws/search-for-tag input "AbortIncompleteMultipartUpload" :flattened? nil :xmlAttribute? nil), "NoncurrentVersionTransition" (portkey.aws/search-for-tag input "NoncurrentVersionTransition" :flattened? true :xmlAttribute? nil), "Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-expiration-status (clojure.core/get-in letvar1631782 ["Status" :content]))} (letvar1631782 "Filter") (clojure.core/assoc :filter (deser-lifecycle-rule-filter (clojure.core/get-in letvar1631782 ["Filter" :content]))) (letvar1631782 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1631782 ["Prefix" :content]))) (letvar1631782 "Transition") (clojure.core/assoc :transitions (deser-transition-list (clojure.core/get-in letvar1631782 ["Transition"]))) (letvar1631782 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1631782 ["ID" :content]))) (letvar1631782 "NoncurrentVersionExpiration") (clojure.core/assoc :noncurrent-version-expiration (deser-noncurrent-version-expiration (clojure.core/get-in letvar1631782 ["NoncurrentVersionExpiration" :content]))) (letvar1631782 "AbortIncompleteMultipartUpload") (clojure.core/assoc :abort-incomplete-multipart-upload (deser-abort-incomplete-multipart-upload (clojure.core/get-in letvar1631782 ["AbortIncompleteMultipartUpload" :content]))) (letvar1631782 "NoncurrentVersionTransition") (clojure.core/assoc :noncurrent-version-transitions (deser-noncurrent-version-transition-list (clojure.core/get-in letvar1631782 ["NoncurrentVersionTransition"]))) (letvar1631782 "Expiration") (clojure.core/assoc :expiration (deser-lifecycle-expiration (clojure.core/get-in letvar1631782 ["Expiration" :content]))))))

(clojure.core/defn- deser-parts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-part (:content coll)))) input))

(clojure.core/defn- deser-abort-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-accept-ranges [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-replication-status [input] (clojure.core/get {"COMPLETE" :complete, "PENDING" :pending, "FAILED" :failed, "REPLICA" :replica} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-analytics-and-operator [input] (clojure.core/let [letvar1631924 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1631924 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1631924 ["Prefix" :content]))) (letvar1631924 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar1631924 ["Tag" :content]))))))

(clojure.core/defn- deser-lambda-function-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-configuration (:content coll)))) input))

(clojure.core/defn- deser-source-selection-criteria [input] (clojure.core/let [letvar1632049 {"SseKmsEncryptedObjects" (portkey.aws/search-for-tag input "SseKmsEncryptedObjects" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1632049 "SseKmsEncryptedObjects") (clojure.core/assoc :sse-kms-encrypted-objects (deser-sse-kms-encrypted-objects (clojure.core/get-in letvar1632049 ["SseKmsEncryptedObjects" :content]))))))

(clojure.core/defn- deser-destination [input] (clojure.core/let [letvar1632157 {"Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Account" (portkey.aws/search-for-tag input "Account" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil), "AccessControlTranslation" (portkey.aws/search-for-tag input "AccessControlTranslation" :flattened? nil :xmlAttribute? nil), "EncryptionConfiguration" (portkey.aws/search-for-tag input "EncryptionConfiguration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:bucket (deser-bucket-name (clojure.core/get-in letvar1632157 ["Bucket" :content]))} (letvar1632157 "Account") (clojure.core/assoc :account (deser-account-id (clojure.core/get-in letvar1632157 ["Account" :content]))) (letvar1632157 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1632157 ["StorageClass" :content]))) (letvar1632157 "AccessControlTranslation") (clojure.core/assoc :access-control-translation (deser-access-control-translation (clojure.core/get-in letvar1632157 ["AccessControlTranslation" :content]))) (letvar1632157 "EncryptionConfiguration") (clojure.core/assoc :encryption-configuration (deser-encryption-configuration (clojure.core/get-in letvar1632157 ["EncryptionConfiguration" :content]))))))

(clojure.core/defn- deser-max-parts [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-public-access-block-configuration [input] (clojure.core/let [letvar1632267 {"BlockPublicAcls" (portkey.aws/search-for-tag input "BlockPublicAcls" :flattened? nil :xmlAttribute? nil), "IgnorePublicAcls" (portkey.aws/search-for-tag input "IgnorePublicAcls" :flattened? nil :xmlAttribute? nil), "BlockPublicPolicy" (portkey.aws/search-for-tag input "BlockPublicPolicy" :flattened? nil :xmlAttribute? nil), "RestrictPublicBuckets" (portkey.aws/search-for-tag input "RestrictPublicBuckets" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1632267 "BlockPublicAcls") (clojure.core/assoc :block-public-acls (deser-setting (clojure.core/get-in letvar1632267 ["BlockPublicAcls" :content]))) (letvar1632267 "IgnorePublicAcls") (clojure.core/assoc :ignore-public-acls (deser-setting (clojure.core/get-in letvar1632267 ["IgnorePublicAcls" :content]))) (letvar1632267 "BlockPublicPolicy") (clojure.core/assoc :block-public-policy (deser-setting (clojure.core/get-in letvar1632267 ["BlockPublicPolicy" :content]))) (letvar1632267 "RestrictPublicBuckets") (clojure.core/assoc :restrict-public-buckets (deser-setting (clojure.core/get-in letvar1632267 ["RestrictPublicBuckets" :content]))))))

(clojure.core/defn- deser-expiration-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-location [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bytes-returned [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-object-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object (:content coll)))) input))

(clojure.core/defn- deser-metadata-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-filter-rule-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-filter-rule-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-filter-rule (:content coll)))) input))

(clojure.core/defn- deser-analytics-s-3-bucket-destination [input] (clojure.core/let [letvar1632431 {"Format" (portkey.aws/search-for-tag input "Format" :flattened? nil :xmlAttribute? nil), "BucketAccountId" (portkey.aws/search-for-tag input "BucketAccountId" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:format (deser-analytics-s-3-export-file-format (clojure.core/get-in letvar1632431 ["Format" :content])), :bucket (deser-bucket-name (clojure.core/get-in letvar1632431 ["Bucket" :content]))} (letvar1632431 "BucketAccountId") (clojure.core/assoc :bucket-account-id (deser-account-id (clojure.core/get-in letvar1632431 ["BucketAccountId" :content]))) (letvar1632431 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1632431 ["Prefix" :content]))))))

(clojure.core/defn- deser-inventory-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-inventory-configuration (:content coll)))) input))

(clojure.core/defn- deser-next-part-number-marker [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-noncurrent-version-transition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-noncurrent-version-transition (:content coll)))) input))

(clojure.core/defn- deser-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event (:content coll)))) input))

(clojure.core/defn- deser-server-side-encryption [input] (clojure.core/get {"AES256" :aes-256, "aws:kms" :awskms} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-event [input] (clojure.core/get {"s3:ObjectRestore:Completed" :s-3-object-restore-completed, "s3:ObjectCreated:*" :s-3-object-created, "s3:ObjectRemoved:Delete" :s-3-object-removed-delete, "s3:ObjectRemoved:*" :s-3-object-removed, "s3:ObjectRemoved:DeleteMarkerCreated" :s-3-object-removed-delete-marker-created, "s3:ObjectCreated:Copy" :s-3-object-created-copy, "s3:ObjectCreated:Post" :s-3-object-created-post, "s3:ObjectCreated:CompleteMultipartUpload" :s-3-object-created-complete-multipart-upload, "s3:ReducedRedundancyLostObject" :s-3-reduced-redundancy-lost-object, "s3:ObjectRestore:Post" :s-3-object-restore-post, "s3:ObjectCreated:Put" :s-3-object-created-put} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-end-event [input] (clojure.core/let [letvar1632602 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-content-disposition [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-error-document [input] (clojure.core/let [letvar1632715 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-object-key (clojure.core/get-in letvar1632715 ["Key" :content]))})))

(clojure.core/defn- deser-redirect [input] (clojure.core/let [letvar1632823 {"HostName" (portkey.aws/search-for-tag input "HostName" :flattened? nil :xmlAttribute? nil), "HttpRedirectCode" (portkey.aws/search-for-tag input "HttpRedirectCode" :flattened? nil :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "ReplaceKeyPrefixWith" (portkey.aws/search-for-tag input "ReplaceKeyPrefixWith" :flattened? nil :xmlAttribute? nil), "ReplaceKeyWith" (portkey.aws/search-for-tag input "ReplaceKeyWith" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1632823 "HostName") (clojure.core/assoc :host-name (deser-host-name (clojure.core/get-in letvar1632823 ["HostName" :content]))) (letvar1632823 "HttpRedirectCode") (clojure.core/assoc :http-redirect-code (deser-http-redirect-code (clojure.core/get-in letvar1632823 ["HttpRedirectCode" :content]))) (letvar1632823 "Protocol") (clojure.core/assoc :protocol (deser-protocol (clojure.core/get-in letvar1632823 ["Protocol" :content]))) (letvar1632823 "ReplaceKeyPrefixWith") (clojure.core/assoc :replace-key-prefix-with (deser-replace-key-prefix-with (clojure.core/get-in letvar1632823 ["ReplaceKeyPrefixWith" :content]))) (letvar1632823 "ReplaceKeyWith") (clojure.core/assoc :replace-key-with (deser-replace-key-with (clojure.core/get-in letvar1632823 ["ReplaceKeyWith" :content]))))))

(clojure.core/defn- deser-progress [input] (clojure.core/let [letvar1632931 {"BytesScanned" (portkey.aws/search-for-tag input "BytesScanned" :flattened? nil :xmlAttribute? nil), "BytesProcessed" (portkey.aws/search-for-tag input "BytesProcessed" :flattened? nil :xmlAttribute? nil), "BytesReturned" (portkey.aws/search-for-tag input "BytesReturned" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1632931 "BytesScanned") (clojure.core/assoc :bytes-scanned (deser-bytes-scanned (clojure.core/get-in letvar1632931 ["BytesScanned" :content]))) (letvar1632931 "BytesProcessed") (clojure.core/assoc :bytes-processed (deser-bytes-processed (clojure.core/get-in letvar1632931 ["BytesProcessed" :content]))) (letvar1632931 "BytesReturned") (clojure.core/assoc :bytes-returned (deser-bytes-returned (clojure.core/get-in letvar1632931 ["BytesReturned" :content]))))))

(clojure.core/defn- deser-next-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-priority [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-bucket-logs-permission [input] (clojure.core/get {"FULL_CONTROL" :full-control, "READ" :read, "WRITE" :write} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-analytics-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-http-error-code-returned-equals [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-upload-id-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-part-number [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-logging-enabled [input] (clojure.core/let [letvar1633068 {"TargetBucket" (portkey.aws/search-for-tag input "TargetBucket" :flattened? nil :xmlAttribute? nil), "TargetGrants" (portkey.aws/search-for-tag input "TargetGrants" :flattened? nil :xmlAttribute? nil), "TargetPrefix" (portkey.aws/search-for-tag input "TargetPrefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target-bucket (deser-target-bucket (clojure.core/get-in letvar1633068 ["TargetBucket" :content])), :target-prefix (deser-target-prefix (clojure.core/get-in letvar1633068 ["TargetPrefix" :content]))} (letvar1633068 "TargetGrants") (clojure.core/assoc :target-grants (deser-target-grants (clojure.core/get-in letvar1633068 ["TargetGrants" :content]))))))

(clojure.core/defn- deser-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-configuration [input] (clojure.core/let [letvar1633178 {"Destination" (portkey.aws/search-for-tag input "Destination" :flattened? nil :xmlAttribute? nil), "IsEnabled" (portkey.aws/search-for-tag input "IsEnabled" :flattened? nil :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "IncludedObjectVersions" (portkey.aws/search-for-tag input "IncludedObjectVersions" :flattened? nil :xmlAttribute? nil), "OptionalFields" (portkey.aws/search-for-tag input "OptionalFields" :flattened? nil :xmlAttribute? nil), "Schedule" (portkey.aws/search-for-tag input "Schedule" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:destination (deser-inventory-destination (clojure.core/get-in letvar1633178 ["Destination" :content])), :is-enabled (deser-is-enabled (clojure.core/get-in letvar1633178 ["IsEnabled" :content])), :id (deser-inventory-id (clojure.core/get-in letvar1633178 ["Id" :content])), :included-object-versions (deser-inventory-included-object-versions (clojure.core/get-in letvar1633178 ["IncludedObjectVersions" :content])), :schedule (deser-inventory-schedule (clojure.core/get-in letvar1633178 ["Schedule" :content]))} (letvar1633178 "Filter") (clojure.core/assoc :filter (deser-inventory-filter (clojure.core/get-in letvar1633178 ["Filter" :content]))) (letvar1633178 "OptionalFields") (clojure.core/assoc :optional-fields (deser-inventory-optional-fields (clojure.core/get-in letvar1633178 ["OptionalFields" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-method (:content coll)))) input))

(clojure.core/defn- deser-e-tag [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-storage-class [input] (clojure.core/get {"STANDARD" :standard, "REDUCED_REDUNDANCY" :reduced-redundancy, "GLACIER" :glacier, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia, "INTELLIGENT_TIERING" :intelligent-tiering} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-max-uploads [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-replication-rule-and-operator [input] (clojure.core/let [letvar1633315 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1633315 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1633315 ["Prefix" :content]))) (letvar1633315 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar1633315 ["Tag" :content]))))))

(clojure.core/defn- deser-metrics-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-owner-override [input] (clojure.core/get {"Destination" :destination} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-multipart-upload-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metadata-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stats-event [input] (clojure.core/let [letvar1633443 {"Details" (portkey.aws/search-for-tag input "Details" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1633443 "Details") (clojure.core/assoc :details (deser-stats (clojure.core/get-in letvar1633443 ["Details" :content]))))))

(clojure.core/defn- deser-bucket-versioning-status [input] (clojure.core/get {"Enabled" :enabled, "Suspended" :suspended} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-content-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-is-truncated [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-inventory-included-object-versions [input] (clojure.core/get {"All" :all, "Current" :current} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-restore [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-role [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-server-side-encryption-by-default [input] (clojure.core/let [letvar1633580 {"SSEAlgorithm" (portkey.aws/search-for-tag input "SSEAlgorithm" :flattened? nil :xmlAttribute? nil), "KMSMasterKeyID" (portkey.aws/search-for-tag input "KMSMasterKeyID" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:sse-algorithm (deser-server-side-encryption (clojure.core/get-in letvar1633580 ["SSEAlgorithm" :content]))} (letvar1633580 "KMSMasterKeyID") (clojure.core/assoc :kms-master-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1633580 ["KMSMasterKeyID" :content]))))))

(clojure.core/defn- deser-display-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-records-event [input] (clojure.core/let [letvar1633693 {"Payload" (portkey.aws/search-for-tag input "Payload" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1633693 "Payload") (clojure.core/assoc :payload (deser-body (clojure.core/get-in letvar1633693 ["Payload" :content]))))))

(clojure.core/defn- deser-cors-rule [input] (clojure.core/let [letvar1633801 {"AllowedHeader" (portkey.aws/search-for-tag input "AllowedHeader" :flattened? true :xmlAttribute? nil), "AllowedMethod" (portkey.aws/search-for-tag input "AllowedMethod" :flattened? true :xmlAttribute? nil), "AllowedOrigin" (portkey.aws/search-for-tag input "AllowedOrigin" :flattened? true :xmlAttribute? nil), "ExposeHeader" (portkey.aws/search-for-tag input "ExposeHeader" :flattened? true :xmlAttribute? nil), "MaxAgeSeconds" (portkey.aws/search-for-tag input "MaxAgeSeconds" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:allowed-methods (deser-allowed-methods (clojure.core/get-in letvar1633801 ["AllowedMethod"])), :allowed-origins (deser-allowed-origins (clojure.core/get-in letvar1633801 ["AllowedOrigin"]))} (letvar1633801 "AllowedHeader") (clojure.core/assoc :allowed-headers (deser-allowed-headers (clojure.core/get-in letvar1633801 ["AllowedHeader"]))) (letvar1633801 "ExposeHeader") (clojure.core/assoc :expose-headers (deser-expose-headers (clojure.core/get-in letvar1633801 ["ExposeHeader"]))) (letvar1633801 "MaxAgeSeconds") (clojure.core/assoc :max-age-seconds (deser-max-age-seconds (clojure.core/get-in letvar1633801 ["MaxAgeSeconds" :content]))))))

(clojure.core/defn- deser-grant [input] (clojure.core/let [letvar1633909 {"Grantee" (portkey.aws/search-for-tag input "Grantee" :flattened? nil :xmlAttribute? nil), "Permission" (portkey.aws/search-for-tag input "Permission" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1633909 "Grantee") (clojure.core/assoc :grantee (deser-grantee (clojure.core/get-in letvar1633909 ["Grantee" :content]))) (letvar1633909 "Permission") (clojure.core/assoc :permission (deser-permission (clojure.core/get-in letvar1633909 ["Permission" :content]))))))

(clojure.core/defn- deser-object-lock-rule [input] (clojure.core/let [letvar1634017 {"DefaultRetention" (portkey.aws/search-for-tag input "DefaultRetention" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1634017 "DefaultRetention") (clojure.core/assoc :default-retention (deser-default-retention (clojure.core/get-in letvar1634017 ["DefaultRetention" :content]))))))

(clojure.core/defn- deser-initiated [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-content-length [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-topic-configuration [input] (clojure.core/let [letvar1634129 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Topic" (portkey.aws/search-for-tag input "Topic" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:topic-arn (deser-topic-arn (clojure.core/get-in letvar1634129 ["Topic" :content])), :events (deser-event-list (clojure.core/get-in letvar1634129 ["Event"]))} (letvar1634129 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1634129 ["Id" :content]))) (letvar1634129 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar1634129 ["Filter" :content]))))))

(clojure.core/defn- deser-is-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-progress-event [input] (clojure.core/let [letvar1634239 {"Details" (portkey.aws/search-for-tag input "Details" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1634239 "Details") (clojure.core/assoc :details (deser-progress (clojure.core/get-in letvar1634239 ["Details" :content]))))))

(clojure.core/defn- deser-inventory-s-3-bucket-destination [input] (clojure.core/let [letvar1634347 {"AccountId" (portkey.aws/search-for-tag input "AccountId" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Format" (portkey.aws/search-for-tag input "Format" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Encryption" (portkey.aws/search-for-tag input "Encryption" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:bucket (deser-bucket-name (clojure.core/get-in letvar1634347 ["Bucket" :content])), :format (deser-inventory-format (clojure.core/get-in letvar1634347 ["Format" :content]))} (letvar1634347 "AccountId") (clojure.core/assoc :account-id (deser-account-id (clojure.core/get-in letvar1634347 ["AccountId" :content]))) (letvar1634347 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1634347 ["Prefix" :content]))) (letvar1634347 "Encryption") (clojure.core/assoc :encryption (deser-inventory-encryption (clojure.core/get-in letvar1634347 ["Encryption" :content]))))))

(clojure.core/defn- deser-copy-object-result [input] (clojure.core/let [letvar1634455 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1634455 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1634455 ["ETag" :content]))) (letvar1634455 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1634455 ["LastModified" :content]))))))

(clojure.core/defn- deser-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-frequency [input] (clojure.core/get {"Daily" :daily, "Weekly" :weekly} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-expose-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-expose-header (:content coll)))) input))

(clojure.core/defn- deser-transition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transition (:content coll)))) input))

(clojure.core/defn- deser-analytics-filter [input] (clojure.core/let [letvar1634612 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1634612 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1634612 ["Prefix" :content]))) (letvar1634612 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar1634612 ["Tag" :content]))) (letvar1634612 "And") (clojure.core/assoc :and (deser-analytics-and-operator (clojure.core/get-in letvar1634612 ["And" :content]))))))

(clojure.core/defn- deser-analytics-s-3-export-file-format [input] (clojure.core/get {"CSV" :csv} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-version-id-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-method [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bucket-accelerate-status [input] (clojure.core/get {"Enabled" :enabled, "Suspended" :suspended} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lambda-function-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-protocol [input] (clojure.core/get {"http" :http, "https" :https} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-replication-rule [input] (clojure.core/let [letvar1634760 {"ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "Priority" (portkey.aws/search-for-tag input "Priority" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "SourceSelectionCriteria" (portkey.aws/search-for-tag input "SourceSelectionCriteria" :flattened? nil :xmlAttribute? nil), "Destination" (portkey.aws/search-for-tag input "Destination" :flattened? nil :xmlAttribute? nil), "DeleteMarkerReplication" (portkey.aws/search-for-tag input "DeleteMarkerReplication" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-replication-rule-status (clojure.core/get-in letvar1634760 ["Status" :content])), :destination (deser-destination (clojure.core/get-in letvar1634760 ["Destination" :content]))} (letvar1634760 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1634760 ["ID" :content]))) (letvar1634760 "Priority") (clojure.core/assoc :priority (deser-priority (clojure.core/get-in letvar1634760 ["Priority" :content]))) (letvar1634760 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1634760 ["Prefix" :content]))) (letvar1634760 "Filter") (clojure.core/assoc :filter (deser-replication-rule-filter (clojure.core/get-in letvar1634760 ["Filter" :content]))) (letvar1634760 "SourceSelectionCriteria") (clojure.core/assoc :source-selection-criteria (deser-source-selection-criteria (clojure.core/get-in letvar1634760 ["SourceSelectionCriteria" :content]))) (letvar1634760 "DeleteMarkerReplication") (clojure.core/assoc :delete-marker-replication (deser-delete-marker-replication (clojure.core/get-in letvar1634760 ["DeleteMarkerReplication" :content]))))))

(clojure.core/defn- deser-redirect-all-requests-to [input] (clojure.core/let [letvar1634868 {"HostName" (portkey.aws/search-for-tag input "HostName" :flattened? nil :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:host-name (deser-host-name (clojure.core/get-in letvar1634868 ["HostName" :content]))} (letvar1634868 "Protocol") (clojure.core/assoc :protocol (deser-protocol (clojure.core/get-in letvar1634868 ["Protocol" :content]))))))

(clojure.core/defn- deser-target-grants [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-grant coll))) input))

(clojure.core/defn- deser-buckets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bucket coll))) input))

(clojure.core/defn- deser-last-modified [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-filter-rule [input] (clojure.core/let [letvar1635012 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1635012 "Name") (clojure.core/assoc :name (deser-filter-rule-name (clojure.core/get-in letvar1635012 ["Name" :content]))) (letvar1635012 "Value") (clojure.core/assoc :value (deser-filter-rule-value (clojure.core/get-in letvar1635012 ["Value" :content]))))))

(clojure.core/defn- deser-replication-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-rule (:content coll)))) input))

(clojure.core/defn- deser-s-3-key-filter [input] (clojure.core/let [letvar1635137 {"FilterRule" (portkey.aws/search-for-tag input "FilterRule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1635137 "FilterRule") (clojure.core/assoc :filter-rules (deser-filter-rule-list (clojure.core/get-in letvar1635137 ["FilterRule"]))))))

(clojure.core/defn- deser-parts-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-abort-rule-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-target-bucket [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-replace-key-with [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-size [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-part [input] (clojure.core/let [letvar1635264 {"PartNumber" (portkey.aws/search-for-tag input "PartNumber" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil), "ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1635264 "PartNumber") (clojure.core/assoc :part-number (deser-part-number (clojure.core/get-in letvar1635264 ["PartNumber" :content]))) (letvar1635264 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1635264 ["LastModified" :content]))) (letvar1635264 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1635264 ["ETag" :content]))) (letvar1635264 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar1635264 ["Size" :content]))))))

(clojure.core/defn- deser-part-number-marker [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-account-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-notification-configuration-filter [input] (clojure.core/let [letvar1635379 {"S3Key" (portkey.aws/search-for-tag input "S3Key" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1635379 "S3Key") (clojure.core/assoc :key (deser-s-3-key-filter (clojure.core/get-in letvar1635379 ["S3Key" :content]))))))

(clojure.core/defn- deser-topic-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-suffix [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-lifecycle-rule-and-operator [input] (clojure.core/let [letvar1635497 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1635497 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1635497 ["Prefix" :content]))) (letvar1635497 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar1635497 ["Tag" :content]))))))

(clojure.core/defn- deser-allowed-header [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-rule [input] (clojure.core/let [letvar1635610 {"Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? nil :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Transition" (portkey.aws/search-for-tag input "Transition" :flattened? nil :xmlAttribute? nil), "NoncurrentVersionTransition" (portkey.aws/search-for-tag input "NoncurrentVersionTransition" :flattened? nil :xmlAttribute? nil), "NoncurrentVersionExpiration" (portkey.aws/search-for-tag input "NoncurrentVersionExpiration" :flattened? nil :xmlAttribute? nil), "AbortIncompleteMultipartUpload" (portkey.aws/search-for-tag input "AbortIncompleteMultipartUpload" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:prefix (deser-prefix (clojure.core/get-in letvar1635610 ["Prefix" :content])), :status (deser-expiration-status (clojure.core/get-in letvar1635610 ["Status" :content]))} (letvar1635610 "Expiration") (clojure.core/assoc :expiration (deser-lifecycle-expiration (clojure.core/get-in letvar1635610 ["Expiration" :content]))) (letvar1635610 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1635610 ["ID" :content]))) (letvar1635610 "Transition") (clojure.core/assoc :transition (deser-transition (clojure.core/get-in letvar1635610 ["Transition" :content]))) (letvar1635610 "NoncurrentVersionTransition") (clojure.core/assoc :noncurrent-version-transition (deser-noncurrent-version-transition (clojure.core/get-in letvar1635610 ["NoncurrentVersionTransition" :content]))) (letvar1635610 "NoncurrentVersionExpiration") (clojure.core/assoc :noncurrent-version-expiration (deser-noncurrent-version-expiration (clojure.core/get-in letvar1635610 ["NoncurrentVersionExpiration" :content]))) (letvar1635610 "AbortIncompleteMultipartUpload") (clojure.core/assoc :abort-incomplete-multipart-upload (deser-abort-incomplete-multipart-upload (clojure.core/get-in letvar1635610 ["AbortIncompleteMultipartUpload" :content]))))))

(clojure.core/defn- deser-routing-rule [input] (clojure.core/let [letvar1635718 {"Condition" (portkey.aws/search-for-tag input "Condition" :flattened? nil :xmlAttribute? nil), "Redirect" (portkey.aws/search-for-tag input "Redirect" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:redirect (deser-redirect (clojure.core/get-in letvar1635718 ["Redirect" :content]))} (letvar1635718 "Condition") (clojure.core/assoc :condition (deser-condition (clojure.core/get-in letvar1635718 ["Condition" :content]))))))

(clojure.core/defn- deser-noncurrent-version-expiration [input] (clojure.core/let [letvar1635826 {"NoncurrentDays" (portkey.aws/search-for-tag input "NoncurrentDays" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1635826 "NoncurrentDays") (clojure.core/assoc :noncurrent-days (deser-days (clojure.core/get-in letvar1635826 ["NoncurrentDays" :content]))))))

(clojure.core/defn- deser-delete-marker-replication [input] (clojure.core/let [letvar1635934 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1635934 "Status") (clojure.core/assoc :status (deser-delete-marker-replication-status (clojure.core/get-in letvar1635934 ["Status" :content]))))))

(clojure.core/defn- deser-next-version-id-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ssekms [input] (clojure.core/let [letvar1636047 {"KeyId" (portkey.aws/search-for-tag input "KeyId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key-id (deser-ssekms-key-id (clojure.core/get-in letvar1636047 ["KeyId" :content]))})))

(clojure.core/defn- deser-deleted-object [input] (clojure.core/let [letvar1636155 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "DeleteMarker" (portkey.aws/search-for-tag input "DeleteMarker" :flattened? nil :xmlAttribute? nil), "DeleteMarkerVersionId" (portkey.aws/search-for-tag input "DeleteMarkerVersionId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1636155 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1636155 ["Key" :content]))) (letvar1636155 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1636155 ["VersionId" :content]))) (letvar1636155 "DeleteMarker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar1636155 ["DeleteMarker" :content]))) (letvar1636155 "DeleteMarkerVersionId") (clojure.core/assoc :delete-marker-version-id (deser-delete-marker-version-id (clojure.core/get-in letvar1636155 ["DeleteMarkerVersionId" :content]))))))

(clojure.core/defn- deser-abort-incomplete-multipart-upload [input] (clojure.core/let [letvar1636263 {"DaysAfterInitiation" (portkey.aws/search-for-tag input "DaysAfterInitiation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1636263 "DaysAfterInitiation") (clojure.core/assoc :days-after-initiation (deser-days-after-initiation (clojure.core/get-in letvar1636263 ["DaysAfterInitiation" :content]))))))

(clojure.core/defn- deser-http-redirect-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-uri [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-optional-fields [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-inventory-optional-field coll))) input))

(clojure.core/defn- deser-owner [input] (clojure.core/let [letvar1636398 {"DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? nil :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1636398 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1636398 ["DisplayName" :content]))) (letvar1636398 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1636398 ["ID" :content]))))))

(clojure.core/defn- deser-replication-rule-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-next-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-days [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-storage-class-analysis-data-export [input] (clojure.core/let [letvar1636518 {"OutputSchemaVersion" (portkey.aws/search-for-tag input "OutputSchemaVersion" :flattened? nil :xmlAttribute? nil), "Destination" (portkey.aws/search-for-tag input "Destination" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:output-schema-version (deser-storage-class-analysis-schema-version (clojure.core/get-in letvar1636518 ["OutputSchemaVersion" :content])), :destination (deser-analytics-export-destination (clojure.core/get-in letvar1636518 ["Destination" :content]))})))

(clojure.core/defn- deser-creation-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bytes-scanned [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-bytes-processed [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stats [input] (clojure.core/let [letvar1636632 {"BytesScanned" (portkey.aws/search-for-tag input "BytesScanned" :flattened? nil :xmlAttribute? nil), "BytesProcessed" (portkey.aws/search-for-tag input "BytesProcessed" :flattened? nil :xmlAttribute? nil), "BytesReturned" (portkey.aws/search-for-tag input "BytesReturned" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1636632 "BytesScanned") (clojure.core/assoc :bytes-scanned (deser-bytes-scanned (clojure.core/get-in letvar1636632 ["BytesScanned" :content]))) (letvar1636632 "BytesProcessed") (clojure.core/assoc :bytes-processed (deser-bytes-processed (clojure.core/get-in letvar1636632 ["BytesProcessed" :content]))) (letvar1636632 "BytesReturned") (clojure.core/assoc :bytes-returned (deser-bytes-returned (clojure.core/get-in letvar1636632 ["BytesReturned" :content]))))))

(clojure.core/defn- deser-cors-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cors-rule (:content coll)))) input))

(clojure.core/defn- deser-object-lock-legal-hold-status [input] (clojure.core/get {"ON" :on, "OFF" :off} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metadata [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-metadata-key k) (deser-metadata-value v)])) input))

(clojure.core/defn- deser-cache-control [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-content-language [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-version-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object-version (:content coll)))) input))

(clojure.core/defn- deser-policy [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-delimiter [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar1636822 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-object-key (clojure.core/get-in letvar1636822 ["Key" :content])), :value (deser-value (clojure.core/get-in letvar1636822 ["Value" :content]))})))

(clojure.core/defn- deser-condition [input] (clojure.core/let [letvar1636930 {"HttpErrorCodeReturnedEquals" (portkey.aws/search-for-tag input "HttpErrorCodeReturnedEquals" :flattened? nil :xmlAttribute? nil), "KeyPrefixEquals" (portkey.aws/search-for-tag input "KeyPrefixEquals" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1636930 "HttpErrorCodeReturnedEquals") (clojure.core/assoc :http-error-code-returned-equals (deser-http-error-code-returned-equals (clojure.core/get-in letvar1636930 ["HttpErrorCodeReturnedEquals" :content]))) (letvar1636930 "KeyPrefixEquals") (clojure.core/assoc :key-prefix-equals (deser-key-prefix-equals (clojure.core/get-in letvar1636930 ["KeyPrefixEquals" :content]))))))

(clojure.core/defn- deser-error [input] (clojure.core/let [letvar1637038 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "Code" (portkey.aws/search-for-tag input "Code" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1637038 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1637038 ["Key" :content]))) (letvar1637038 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1637038 ["VersionId" :content]))) (letvar1637038 "Code") (clojure.core/assoc :code (deser-code (clojure.core/get-in letvar1637038 ["Code" :content]))) (letvar1637038 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1637038 ["Message" :content]))))))

(clojure.core/defn- deser-queue-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-version [input] (clojure.core/let [letvar1637151 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "IsLatest" (portkey.aws/search-for-tag input "IsLatest" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1637151 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1637151 ["ETag" :content]))) (letvar1637151 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar1637151 ["Size" :content]))) (letvar1637151 "StorageClass") (clojure.core/assoc :storage-class (deser-object-version-storage-class (clojure.core/get-in letvar1637151 ["StorageClass" :content]))) (letvar1637151 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1637151 ["Key" :content]))) (letvar1637151 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1637151 ["VersionId" :content]))) (letvar1637151 "IsLatest") (clojure.core/assoc :is-latest (deser-is-latest (clojure.core/get-in letvar1637151 ["IsLatest" :content]))) (letvar1637151 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1637151 ["LastModified" :content]))) (letvar1637151 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1637151 ["Owner" :content]))))))

(clojure.core/defn- deser-target-prefix [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-version-storage-class [input] (clojure.core/get {"STANDARD" :standard} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-delete-marker-entry [input] (clojure.core/let [letvar1637269 {"Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "IsLatest" (portkey.aws/search-for-tag input "IsLatest" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1637269 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1637269 ["Owner" :content]))) (letvar1637269 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1637269 ["Key" :content]))) (letvar1637269 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1637269 ["VersionId" :content]))) (letvar1637269 "IsLatest") (clojure.core/assoc :is-latest (deser-is-latest (clojure.core/get-in letvar1637269 ["IsLatest" :content]))) (letvar1637269 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1637269 ["LastModified" :content]))))))

(clojure.core/defn- deser-server-side-encryption-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-side-encryption-rule (:content coll)))) input))

(clojure.core/defn- deser-queue-configuration [input] (clojure.core/let [letvar1637394 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Queue" (portkey.aws/search-for-tag input "Queue" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:queue-arn (deser-queue-arn (clojure.core/get-in letvar1637394 ["Queue" :content])), :events (deser-event-list (clojure.core/get-in letvar1637394 ["Event"]))} (letvar1637394 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1637394 ["Id" :content]))) (letvar1637394 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar1637394 ["Filter" :content]))))))

(clojure.core/defn- deser-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-status [input] (clojure.core/let [letvar1637507 {"IsPublic" (portkey.aws/search-for-tag input "IsPublic" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1637507 "IsPublic") (clojure.core/assoc :is-public (deser-is-public (clojure.core/get-in letvar1637507 ["IsPublic" :content]))))))

(clojure.core/defn- deser-host-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-restore-output-path [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-storage-class [input] (clojure.core/get {"STANDARD" :standard, "REDUCED_REDUNDANCY" :reduced-redundancy, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia, "INTELLIGENT_TIERING" :intelligent-tiering, "GLACIER" :glacier} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-server-side-encryption-rule [input] (clojure.core/let [letvar1637630 {"ApplyServerSideEncryptionByDefault" (portkey.aws/search-for-tag input "ApplyServerSideEncryptionByDefault" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1637630 "ApplyServerSideEncryptionByDefault") (clojure.core/assoc :apply-server-side-encryption-by-default (deser-server-side-encryption-by-default (clojure.core/get-in letvar1637630 ["ApplyServerSideEncryptionByDefault" :content]))))))

(clojure.core/defn- deser-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule (:content coll)))) input))

(clojure.core/defn- deser-lifecycle-expiration [input] (clojure.core/let [letvar1637755 {"Date" (portkey.aws/search-for-tag input "Date" :flattened? nil :xmlAttribute? nil), "Days" (portkey.aws/search-for-tag input "Days" :flattened? nil :xmlAttribute? nil), "ExpiredObjectDeleteMarker" (portkey.aws/search-for-tag input "ExpiredObjectDeleteMarker" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1637755 "Date") (clojure.core/assoc :date (deser-date (clojure.core/get-in letvar1637755 ["Date" :content]))) (letvar1637755 "Days") (clojure.core/assoc :days (deser-days (clojure.core/get-in letvar1637755 ["Days" :content]))) (letvar1637755 "ExpiredObjectDeleteMarker") (clojure.core/assoc :expired-object-delete-marker (deser-expired-object-delete-marker (clojure.core/get-in letvar1637755 ["ExpiredObjectDeleteMarker" :content]))))))

(clojure.core/defn- deser-analytics-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-analytics-configuration (:content coll)))) input))

(clojure.core/defn- deser-inventory-format [input] (clojure.core/get {"CSV" :csv, "ORC" :orc, "Parquet" :parquet} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-queue-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-queue-configuration (:content coll)))) input))

(clojure.core/defn- deser-grantee [input] (clojure.core/let [letvar1637902 {"DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? nil :xmlAttribute? nil), "EmailAddress" (portkey.aws/search-for-tag input "EmailAddress" :flattened? nil :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "xsi:type" (portkey.aws/search-for-tag input "xsi:type" :flattened? nil :xmlAttribute? true), "URI" (portkey.aws/search-for-tag input "URI" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-type (clojure.core/get-in letvar1637902 ["xsi:type"]))} (letvar1637902 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1637902 ["DisplayName" :content]))) (letvar1637902 "EmailAddress") (clojure.core/assoc :email-address (deser-email-address (clojure.core/get-in letvar1637902 ["EmailAddress" :content]))) (letvar1637902 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1637902 ["ID" :content]))) (letvar1637902 "URI") (clojure.core/assoc :uri (deser-uri (clojure.core/get-in letvar1637902 ["URI" :content]))))))

(clojure.core/defn- deser-key-prefix-equals [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-header (:content coll)))) input))

(clojure.core/defn- deser-delete-marker [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-years [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-allowed-origins [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-origin (:content coll)))) input))

(clojure.core/defn- deser-bucket-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-queue-configuration-deprecated [input] (clojure.core/let [letvar1638058 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Queue" (portkey.aws/search-for-tag input "Queue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1638058 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1638058 ["Id" :content]))) (letvar1638058 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar1638058 ["Event" :content]))) (letvar1638058 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar1638058 ["Event"]))) (letvar1638058 "Queue") (clojure.core/assoc :queue (deser-queue-arn (clojure.core/get-in letvar1638058 ["Queue" :content]))))))

(clojure.core/defn- deser-request-charged [input] (clojure.core/get {"requester" :requester} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-expires [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-max-keys [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lifecycle-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-rule (:content coll)))) input))

(clojure.core/defn- deser-initiator [input] (clojure.core/let [letvar1638192 {"ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1638192 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1638192 ["ID" :content]))) (letvar1638192 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1638192 ["DisplayName" :content]))))))

(clojure.core/defn- deser-sses-3 [input] (clojure.core/let [letvar1638300 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-max-age-seconds [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-email-address [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-lock-retain-until-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bucket-location-constraint [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-southeast-2" :apsoutheast-2, "EU" :eu, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "eu-central-1" :eucentral-1, "us-west-2" :uswest-2, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-ssekms-key-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-origin [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-lock-mode [input] (clojure.core/get {"GOVERNANCE" :governance, "COMPLIANCE" :compliance} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lambda-function-configuration [input] (clojure.core/let [letvar1638442 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CloudFunction" (portkey.aws/search-for-tag input "CloudFunction" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:lambda-function-arn (deser-lambda-function-arn (clojure.core/get-in letvar1638442 ["CloudFunction" :content])), :events (deser-event-list (clojure.core/get-in letvar1638442 ["Event"]))} (letvar1638442 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1638442 ["Id" :content]))) (letvar1638442 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar1638442 ["Filter" :content]))))))

(clojure.core/defn- deser-delete-marker-version-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-default-retention [input] (clojure.core/let [letvar1638555 {"Mode" (portkey.aws/search-for-tag input "Mode" :flattened? nil :xmlAttribute? nil), "Days" (portkey.aws/search-for-tag input "Days" :flattened? nil :xmlAttribute? nil), "Years" (portkey.aws/search-for-tag input "Years" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1638555 "Mode") (clojure.core/assoc :mode (deser-object-lock-retention-mode (clojure.core/get-in letvar1638555 ["Mode" :content]))) (letvar1638555 "Days") (clojure.core/assoc :days (deser-days (clojure.core/get-in letvar1638555 ["Days" :content]))) (letvar1638555 "Years") (clojure.core/assoc :years (deser-years (clojure.core/get-in letvar1638555 ["Years" :content]))))))

(clojure.core/defn- deser-is-latest [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-noncurrent-version-transition [input] (clojure.core/let [letvar1638665 {"NoncurrentDays" (portkey.aws/search-for-tag input "NoncurrentDays" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1638665 "NoncurrentDays") (clojure.core/assoc :noncurrent-days (deser-days (clojure.core/get-in letvar1638665 ["NoncurrentDays" :content]))) (letvar1638665 "StorageClass") (clojure.core/assoc :storage-class (deser-transition-storage-class (clojure.core/get-in letvar1638665 ["StorageClass" :content]))))))

(clojure.core/defn- deser-index-document [input] (clojure.core/let [letvar1638773 {"Suffix" (portkey.aws/search-for-tag input "Suffix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:suffix (deser-suffix (clojure.core/get-in letvar1638773 ["Suffix" :content]))})))

(clojure.core/defn- deser-key-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-common-prefix [input] (clojure.core/let [letvar1638886 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1638886 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1638886 ["Prefix" :content]))))))

(clojure.core/defn- deser-next-upload-id-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-analytics-configuration [input] (clojure.core/let [letvar1638999 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil), "StorageClassAnalysis" (portkey.aws/search-for-tag input "StorageClassAnalysis" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-analytics-id (clojure.core/get-in letvar1638999 ["Id" :content])), :storage-class-analysis (deser-storage-class-analysis (clojure.core/get-in letvar1638999 ["StorageClassAnalysis" :content]))} (letvar1638999 "Filter") (clojure.core/assoc :filter (deser-analytics-filter (clojure.core/get-in letvar1638999 ["Filter" :content]))))))

(clojure.core/defn- deser-expiration [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cloud-function [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-delete-markers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-delete-marker-entry (:content coll)))) input))

(clojure.core/defn- deser-sse-kms-encrypted-objects [input] (clojure.core/let [letvar1639134 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-sse-kms-encrypted-objects-status (clojure.core/get-in letvar1639134 ["Status" :content]))})))

(clojure.core/defn- deser-object-lock-retention-mode [input] (clojure.core/get {"GOVERNANCE" :governance, "COMPLIANCE" :compliance} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-object-lock-retention [input] (clojure.core/let [letvar1639247 {"Mode" (portkey.aws/search-for-tag input "Mode" :flattened? nil :xmlAttribute? nil), "RetainUntilDate" (portkey.aws/search-for-tag input "RetainUntilDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1639247 "Mode") (clojure.core/assoc :mode (deser-object-lock-retention-mode (clojure.core/get-in letvar1639247 ["Mode" :content]))) (letvar1639247 "RetainUntilDate") (clojure.core/assoc :retain-until-date (deser-date (clojure.core/get-in letvar1639247 ["RetainUntilDate" :content]))))))

(clojure.core/defn- deser-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error (:content coll)))) input))

(clojure.core/defn- response-put-object-tagging-output ([input] (response-put-object-tagging-output nil input)) ([resultWrapper1639266 input] (clojure.core/let [rawinput1639265 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639267 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"])}] (clojure.core/cond-> {} (letvar1639267 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639267 ["x-amz-version-id"])))))))

(clojure.core/defn- response-get-object-tagging-output ([input] (response-get-object-tagging-output nil input)) ([resultWrapper1639269 input] (clojure.core/let [rawinput1639268 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639270 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "TagSet" (portkey.aws/search-for-tag rawinput1639268 "TagSet" :flattened? nil :result-wrapper resultWrapper1639269)}] (clojure.core/cond-> {:tag-set (deser-tag-set (clojure.core/get-in letvar1639270 ["TagSet" :content]))} (letvar1639270 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639270 ["x-amz-version-id"])))))))

(clojure.core/defn- response-list-object-versions-output ([input] (response-list-object-versions-output nil input)) ([resultWrapper1639272 input] (clojure.core/let [rawinput1639271 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639273 {"Prefix" (portkey.aws/search-for-tag rawinput1639271 "Prefix" :flattened? nil :result-wrapper resultWrapper1639272), "EncodingType" (portkey.aws/search-for-tag rawinput1639271 "EncodingType" :flattened? nil :result-wrapper resultWrapper1639272), "NextKeyMarker" (portkey.aws/search-for-tag rawinput1639271 "NextKeyMarker" :flattened? nil :result-wrapper resultWrapper1639272), "IsTruncated" (portkey.aws/search-for-tag rawinput1639271 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1639272), "CommonPrefixes" (portkey.aws/search-for-tag rawinput1639271 "CommonPrefixes" :flattened? true :result-wrapper resultWrapper1639272), "VersionIdMarker" (portkey.aws/search-for-tag rawinput1639271 "VersionIdMarker" :flattened? nil :result-wrapper resultWrapper1639272), "NextVersionIdMarker" (portkey.aws/search-for-tag rawinput1639271 "NextVersionIdMarker" :flattened? nil :result-wrapper resultWrapper1639272), "Delimiter" (portkey.aws/search-for-tag rawinput1639271 "Delimiter" :flattened? nil :result-wrapper resultWrapper1639272), "Version" (portkey.aws/search-for-tag rawinput1639271 "Version" :flattened? true :result-wrapper resultWrapper1639272), "Name" (portkey.aws/search-for-tag rawinput1639271 "Name" :flattened? nil :result-wrapper resultWrapper1639272), "DeleteMarker" (portkey.aws/search-for-tag rawinput1639271 "DeleteMarker" :flattened? true :result-wrapper resultWrapper1639272), "MaxKeys" (portkey.aws/search-for-tag rawinput1639271 "MaxKeys" :flattened? nil :result-wrapper resultWrapper1639272), "KeyMarker" (portkey.aws/search-for-tag rawinput1639271 "KeyMarker" :flattened? nil :result-wrapper resultWrapper1639272)}] (clojure.core/cond-> {} (letvar1639273 "Version") (clojure.core/assoc :versions (deser-object-version-list (clojure.core/get-in letvar1639273 ["Version"]))) (letvar1639273 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1639273 ["Prefix" :content]))) (letvar1639273 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar1639273 ["EncodingType" :content]))) (letvar1639273 "NextKeyMarker") (clojure.core/assoc :next-key-marker (deser-next-key-marker (clojure.core/get-in letvar1639273 ["NextKeyMarker" :content]))) (letvar1639273 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1639273 ["IsTruncated" :content]))) (letvar1639273 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar1639273 ["CommonPrefixes"]))) (letvar1639273 "VersionIdMarker") (clojure.core/assoc :version-id-marker (deser-version-id-marker (clojure.core/get-in letvar1639273 ["VersionIdMarker" :content]))) (letvar1639273 "NextVersionIdMarker") (clojure.core/assoc :next-version-id-marker (deser-next-version-id-marker (clojure.core/get-in letvar1639273 ["NextVersionIdMarker" :content]))) (letvar1639273 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar1639273 ["Delimiter" :content]))) (letvar1639273 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar1639273 ["Name" :content]))) (letvar1639273 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar1639273 ["MaxKeys" :content]))) (letvar1639273 "KeyMarker") (clojure.core/assoc :key-marker (deser-key-marker (clojure.core/get-in letvar1639273 ["KeyMarker" :content]))) (letvar1639273 "DeleteMarker") (clojure.core/assoc :delete-markers (deser-delete-markers (clojure.core/get-in letvar1639273 ["DeleteMarker"])))))))

(clojure.core/defn- response-bucket-already-owned-by-you ([input] (response-bucket-already-owned-by-you nil input)) ([resultWrapper1639275 input] (clojure.core/let [rawinput1639274 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639276 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-object-torrent-output ([input] (response-get-object-torrent-output nil input)) ([resultWrapper1639278 input] (clojure.core/let [rawinput1639277 (:body input) letvar1639279 {"Body" rawinput1639277, "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639279 "Body") (clojure.core/assoc :body (deser-body (clojure.core/get-in letvar1639279 ["Body"]))) (letvar1639279 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639279 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-bucket-analytics-configuration-output ([input] (response-get-bucket-analytics-configuration-output nil input)) ([resultWrapper1639281 input] (clojure.core/let [rawinput1639280 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639282 {"AnalyticsConfiguration" (portkey.aws/search-for-tag rawinput1639280 "AnalyticsConfiguration" :flattened? nil :result-wrapper resultWrapper1639281)}] (clojure.core/cond-> {} (letvar1639282 "AnalyticsConfiguration") (clojure.core/assoc :analytics-configuration (deser-analytics-configuration (clojure.core/get-in letvar1639282 ["AnalyticsConfiguration" :content])))))))

(clojure.core/defn- response-get-bucket-encryption-output ([input] (response-get-bucket-encryption-output nil input)) ([resultWrapper1639284 input] (clojure.core/let [rawinput1639283 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639285 {"ServerSideEncryptionConfiguration" (portkey.aws/search-for-tag rawinput1639283 "ServerSideEncryptionConfiguration" :flattened? nil :result-wrapper resultWrapper1639284)}] (clojure.core/cond-> {} (letvar1639285 "ServerSideEncryptionConfiguration") (clojure.core/assoc :server-side-encryption-configuration (deser-server-side-encryption-configuration (clojure.core/get-in letvar1639285 ["ServerSideEncryptionConfiguration" :content])))))))

(clojure.core/defn- response-get-object-legal-hold-output ([input] (response-get-object-legal-hold-output nil input)) ([resultWrapper1639287 input] (clojure.core/let [rawinput1639286 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639288 {"LegalHold" (portkey.aws/search-for-tag rawinput1639286 "LegalHold" :flattened? nil :result-wrapper resultWrapper1639287)}] (clojure.core/cond-> {} (letvar1639288 "LegalHold") (clojure.core/assoc :legal-hold (deser-object-lock-legal-hold (clojure.core/get-in letvar1639288 ["LegalHold" :content])))))))

(clojure.core/defn- response-get-bucket-lifecycle-output ([input] (response-get-bucket-lifecycle-output nil input)) ([resultWrapper1639290 input] (clojure.core/let [rawinput1639289 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639291 {"Rule" (portkey.aws/search-for-tag rawinput1639289 "Rule" :flattened? true :result-wrapper resultWrapper1639290)}] (clojure.core/cond-> {} (letvar1639291 "Rule") (clojure.core/assoc :rules (deser-rules (clojure.core/get-in letvar1639291 ["Rule"])))))))

(clojure.core/defn- response-get-bucket-logging-output ([input] (response-get-bucket-logging-output nil input)) ([resultWrapper1639293 input] (clojure.core/let [rawinput1639292 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639294 {"LoggingEnabled" (portkey.aws/search-for-tag rawinput1639292 "LoggingEnabled" :flattened? nil :result-wrapper resultWrapper1639293)}] (clojure.core/cond-> {} (letvar1639294 "LoggingEnabled") (clojure.core/assoc :logging-enabled (deser-logging-enabled (clojure.core/get-in letvar1639294 ["LoggingEnabled" :content])))))))

(clojure.core/defn- response-delete-objects-output ([input] (response-delete-objects-output nil input)) ([resultWrapper1639296 input] (clojure.core/let [rawinput1639295 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639297 {"Deleted" (portkey.aws/search-for-tag rawinput1639295 "Deleted" :flattened? true :result-wrapper resultWrapper1639296), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "Error" (portkey.aws/search-for-tag rawinput1639295 "Error" :flattened? true :result-wrapper resultWrapper1639296)}] (clojure.core/cond-> {} (letvar1639297 "Deleted") (clojure.core/assoc :deleted (deser-deleted-objects (clojure.core/get-in letvar1639297 ["Deleted"]))) (letvar1639297 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639297 ["x-amz-request-charged"]))) (letvar1639297 "Error") (clojure.core/assoc :errors (deser-errors (clojure.core/get-in letvar1639297 ["Error"])))))))

(clojure.core/defn- response-create-multipart-upload-output ([input] (response-create-multipart-upload-output nil input)) ([resultWrapper1639299 input] (clojure.core/let [rawinput1639298 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639300 {"Bucket" (portkey.aws/search-for-tag rawinput1639298 "Bucket" :flattened? nil :result-wrapper resultWrapper1639299), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-abort-date" (clojure.core/get-in input [:headers "x-amz-abort-date"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-abort-rule-id" (clojure.core/get-in input [:headers "x-amz-abort-rule-id"]), "Key" (portkey.aws/search-for-tag rawinput1639298 "Key" :flattened? nil :result-wrapper resultWrapper1639299), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "UploadId" (portkey.aws/search-for-tag rawinput1639298 "UploadId" :flattened? nil :result-wrapper resultWrapper1639299)}] (clojure.core/cond-> {} (letvar1639300 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar1639300 ["Bucket" :content]))) (letvar1639300 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1639300 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1639300 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1639300 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1639300 "x-amz-abort-date") (clojure.core/assoc :abort-date (deser-abort-date (clojure.core/get-in letvar1639300 ["x-amz-abort-date"]))) (letvar1639300 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1639300 ["x-amz-server-side-encryption"]))) (letvar1639300 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1639300 ["Key" :content]))) (letvar1639300 "x-amz-abort-rule-id") (clojure.core/assoc :abort-rule-id (deser-abort-rule-id (clojure.core/get-in letvar1639300 ["x-amz-abort-rule-id"]))) (letvar1639300 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar1639300 ["UploadId" :content]))) (letvar1639300 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639300 ["x-amz-request-charged"]))) (letvar1639300 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1639300 ["x-amz-server-side-encryption-aws-kms-key-id"])))))))

(clojure.core/defn- response-list-multipart-uploads-output ([input] (response-list-multipart-uploads-output nil input)) ([resultWrapper1639302 input] (clojure.core/let [rawinput1639301 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639303 {"Bucket" (portkey.aws/search-for-tag rawinput1639301 "Bucket" :flattened? nil :result-wrapper resultWrapper1639302), "Prefix" (portkey.aws/search-for-tag rawinput1639301 "Prefix" :flattened? nil :result-wrapper resultWrapper1639302), "EncodingType" (portkey.aws/search-for-tag rawinput1639301 "EncodingType" :flattened? nil :result-wrapper resultWrapper1639302), "NextKeyMarker" (portkey.aws/search-for-tag rawinput1639301 "NextKeyMarker" :flattened? nil :result-wrapper resultWrapper1639302), "Upload" (portkey.aws/search-for-tag rawinput1639301 "Upload" :flattened? true :result-wrapper resultWrapper1639302), "UploadIdMarker" (portkey.aws/search-for-tag rawinput1639301 "UploadIdMarker" :flattened? nil :result-wrapper resultWrapper1639302), "MaxUploads" (portkey.aws/search-for-tag rawinput1639301 "MaxUploads" :flattened? nil :result-wrapper resultWrapper1639302), "IsTruncated" (portkey.aws/search-for-tag rawinput1639301 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1639302), "CommonPrefixes" (portkey.aws/search-for-tag rawinput1639301 "CommonPrefixes" :flattened? true :result-wrapper resultWrapper1639302), "Delimiter" (portkey.aws/search-for-tag rawinput1639301 "Delimiter" :flattened? nil :result-wrapper resultWrapper1639302), "KeyMarker" (portkey.aws/search-for-tag rawinput1639301 "KeyMarker" :flattened? nil :result-wrapper resultWrapper1639302), "NextUploadIdMarker" (portkey.aws/search-for-tag rawinput1639301 "NextUploadIdMarker" :flattened? nil :result-wrapper resultWrapper1639302)}] (clojure.core/cond-> {} (letvar1639303 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar1639303 ["Bucket" :content]))) (letvar1639303 "Upload") (clojure.core/assoc :uploads (deser-multipart-upload-list (clojure.core/get-in letvar1639303 ["Upload"]))) (letvar1639303 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1639303 ["Prefix" :content]))) (letvar1639303 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar1639303 ["EncodingType" :content]))) (letvar1639303 "NextKeyMarker") (clojure.core/assoc :next-key-marker (deser-next-key-marker (clojure.core/get-in letvar1639303 ["NextKeyMarker" :content]))) (letvar1639303 "UploadIdMarker") (clojure.core/assoc :upload-id-marker (deser-upload-id-marker (clojure.core/get-in letvar1639303 ["UploadIdMarker" :content]))) (letvar1639303 "MaxUploads") (clojure.core/assoc :max-uploads (deser-max-uploads (clojure.core/get-in letvar1639303 ["MaxUploads" :content]))) (letvar1639303 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1639303 ["IsTruncated" :content]))) (letvar1639303 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar1639303 ["CommonPrefixes"]))) (letvar1639303 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar1639303 ["Delimiter" :content]))) (letvar1639303 "KeyMarker") (clojure.core/assoc :key-marker (deser-key-marker (clojure.core/get-in letvar1639303 ["KeyMarker" :content]))) (letvar1639303 "NextUploadIdMarker") (clojure.core/assoc :next-upload-id-marker (deser-next-upload-id-marker (clojure.core/get-in letvar1639303 ["NextUploadIdMarker" :content])))))))

(clojure.core/defn- response-list-bucket-metrics-configurations-output ([input] (response-list-bucket-metrics-configurations-output nil input)) ([resultWrapper1639305 input] (clojure.core/let [rawinput1639304 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639306 {"IsTruncated" (portkey.aws/search-for-tag rawinput1639304 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1639305), "ContinuationToken" (portkey.aws/search-for-tag rawinput1639304 "ContinuationToken" :flattened? nil :result-wrapper resultWrapper1639305), "NextContinuationToken" (portkey.aws/search-for-tag rawinput1639304 "NextContinuationToken" :flattened? nil :result-wrapper resultWrapper1639305), "MetricsConfiguration" (portkey.aws/search-for-tag rawinput1639304 "MetricsConfiguration" :flattened? true :result-wrapper resultWrapper1639305)}] (clojure.core/cond-> {} (letvar1639306 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1639306 ["IsTruncated" :content]))) (letvar1639306 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar1639306 ["ContinuationToken" :content]))) (letvar1639306 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar1639306 ["NextContinuationToken" :content]))) (letvar1639306 "MetricsConfiguration") (clojure.core/assoc :metrics-configuration-list (deser-metrics-configuration-list (clojure.core/get-in letvar1639306 ["MetricsConfiguration"])))))))

(clojure.core/defn- response-create-bucket-output ([input] (response-create-bucket-output nil input)) ([resultWrapper1639308 input] (clojure.core/let [rawinput1639307 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639309 {"Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {} (letvar1639309 "Location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar1639309 ["Location"])))))))

(clojure.core/defn- response-delete-object-output ([input] (response-delete-object-output nil input)) ([resultWrapper1639311 input] (clojure.core/let [rawinput1639310 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639312 {"x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639312 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar1639312 ["x-amz-delete-marker"]))) (letvar1639312 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639312 ["x-amz-version-id"]))) (letvar1639312 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639312 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-object-retention-output ([input] (response-get-object-retention-output nil input)) ([resultWrapper1639314 input] (clojure.core/let [rawinput1639313 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639315 {"Retention" (portkey.aws/search-for-tag rawinput1639313 "Retention" :flattened? nil :result-wrapper resultWrapper1639314)}] (clojure.core/cond-> {} (letvar1639315 "Retention") (clojure.core/assoc :retention (deser-object-lock-retention (clojure.core/get-in letvar1639315 ["Retention" :content])))))))

(clojure.core/defn- response-put-object-lock-configuration-output ([input] (response-put-object-lock-configuration-output nil input)) ([resultWrapper1639317 input] (clojure.core/let [rawinput1639316 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639318 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639318 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639318 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-object-lock-configuration-output ([input] (response-get-object-lock-configuration-output nil input)) ([resultWrapper1639320 input] (clojure.core/let [rawinput1639319 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639321 {"ObjectLockConfiguration" (portkey.aws/search-for-tag rawinput1639319 "ObjectLockConfiguration" :flattened? nil :result-wrapper resultWrapper1639320)}] (clojure.core/cond-> {} (letvar1639321 "ObjectLockConfiguration") (clojure.core/assoc :object-lock-configuration (deser-object-lock-configuration (clojure.core/get-in letvar1639321 ["ObjectLockConfiguration" :content])))))))

(clojure.core/defn- response-list-objects-output ([input] (response-list-objects-output nil input)) ([resultWrapper1639323 input] (clojure.core/let [rawinput1639322 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639324 {"Prefix" (portkey.aws/search-for-tag rawinput1639322 "Prefix" :flattened? nil :result-wrapper resultWrapper1639323), "EncodingType" (portkey.aws/search-for-tag rawinput1639322 "EncodingType" :flattened? nil :result-wrapper resultWrapper1639323), "Marker" (portkey.aws/search-for-tag rawinput1639322 "Marker" :flattened? nil :result-wrapper resultWrapper1639323), "IsTruncated" (portkey.aws/search-for-tag rawinput1639322 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1639323), "CommonPrefixes" (portkey.aws/search-for-tag rawinput1639322 "CommonPrefixes" :flattened? true :result-wrapper resultWrapper1639323), "Contents" (portkey.aws/search-for-tag rawinput1639322 "Contents" :flattened? true :result-wrapper resultWrapper1639323), "NextMarker" (portkey.aws/search-for-tag rawinput1639322 "NextMarker" :flattened? nil :result-wrapper resultWrapper1639323), "Delimiter" (portkey.aws/search-for-tag rawinput1639322 "Delimiter" :flattened? nil :result-wrapper resultWrapper1639323), "Name" (portkey.aws/search-for-tag rawinput1639322 "Name" :flattened? nil :result-wrapper resultWrapper1639323), "MaxKeys" (portkey.aws/search-for-tag rawinput1639322 "MaxKeys" :flattened? nil :result-wrapper resultWrapper1639323)}] (clojure.core/cond-> {} (letvar1639324 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1639324 ["Prefix" :content]))) (letvar1639324 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar1639324 ["EncodingType" :content]))) (letvar1639324 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1639324 ["Marker" :content]))) (letvar1639324 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1639324 ["IsTruncated" :content]))) (letvar1639324 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar1639324 ["CommonPrefixes"]))) (letvar1639324 "Contents") (clojure.core/assoc :contents (deser-object-list (clojure.core/get-in letvar1639324 ["Contents"]))) (letvar1639324 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1639324 ["NextMarker" :content]))) (letvar1639324 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar1639324 ["Delimiter" :content]))) (letvar1639324 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar1639324 ["Name" :content]))) (letvar1639324 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar1639324 ["MaxKeys" :content])))))))

(clojure.core/defn- response-get-bucket-policy-status-output ([input] (response-get-bucket-policy-status-output nil input)) ([resultWrapper1639326 input] (clojure.core/let [rawinput1639325 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639327 {"PolicyStatus" (portkey.aws/search-for-tag rawinput1639325 "PolicyStatus" :flattened? nil :result-wrapper resultWrapper1639326)}] (clojure.core/cond-> {} (letvar1639327 "PolicyStatus") (clojure.core/assoc :policy-status (deser-policy-status (clojure.core/get-in letvar1639327 ["PolicyStatus" :content])))))))

(clojure.core/defn- response-put-object-legal-hold-output ([input] (response-put-object-legal-hold-output nil input)) ([resultWrapper1639329 input] (clojure.core/let [rawinput1639328 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639330 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639330 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639330 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-list-bucket-inventory-configurations-output ([input] (response-list-bucket-inventory-configurations-output nil input)) ([resultWrapper1639332 input] (clojure.core/let [rawinput1639331 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639333 {"ContinuationToken" (portkey.aws/search-for-tag rawinput1639331 "ContinuationToken" :flattened? nil :result-wrapper resultWrapper1639332), "InventoryConfiguration" (portkey.aws/search-for-tag rawinput1639331 "InventoryConfiguration" :flattened? true :result-wrapper resultWrapper1639332), "IsTruncated" (portkey.aws/search-for-tag rawinput1639331 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1639332), "NextContinuationToken" (portkey.aws/search-for-tag rawinput1639331 "NextContinuationToken" :flattened? nil :result-wrapper resultWrapper1639332)}] (clojure.core/cond-> {} (letvar1639333 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar1639333 ["ContinuationToken" :content]))) (letvar1639333 "InventoryConfiguration") (clojure.core/assoc :inventory-configuration-list (deser-inventory-configuration-list (clojure.core/get-in letvar1639333 ["InventoryConfiguration"]))) (letvar1639333 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1639333 ["IsTruncated" :content]))) (letvar1639333 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar1639333 ["NextContinuationToken" :content])))))))

(clojure.core/defn- response-list-parts-output ([input] (response-list-parts-output nil input)) ([resultWrapper1639335 input] (clojure.core/let [rawinput1639334 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639336 {"Bucket" (portkey.aws/search-for-tag rawinput1639334 "Bucket" :flattened? nil :result-wrapper resultWrapper1639335), "MaxParts" (portkey.aws/search-for-tag rawinput1639334 "MaxParts" :flattened? nil :result-wrapper resultWrapper1639335), "x-amz-abort-date" (clojure.core/get-in input [:headers "x-amz-abort-date"]), "NextPartNumberMarker" (portkey.aws/search-for-tag rawinput1639334 "NextPartNumberMarker" :flattened? nil :result-wrapper resultWrapper1639335), "x-amz-abort-rule-id" (clojure.core/get-in input [:headers "x-amz-abort-rule-id"]), "Key" (portkey.aws/search-for-tag rawinput1639334 "Key" :flattened? nil :result-wrapper resultWrapper1639335), "IsTruncated" (portkey.aws/search-for-tag rawinput1639334 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1639335), "Part" (portkey.aws/search-for-tag rawinput1639334 "Part" :flattened? true :result-wrapper resultWrapper1639335), "PartNumberMarker" (portkey.aws/search-for-tag rawinput1639334 "PartNumberMarker" :flattened? nil :result-wrapper resultWrapper1639335), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "Owner" (portkey.aws/search-for-tag rawinput1639334 "Owner" :flattened? nil :result-wrapper resultWrapper1639335), "UploadId" (portkey.aws/search-for-tag rawinput1639334 "UploadId" :flattened? nil :result-wrapper resultWrapper1639335), "StorageClass" (portkey.aws/search-for-tag rawinput1639334 "StorageClass" :flattened? nil :result-wrapper resultWrapper1639335), "Initiator" (portkey.aws/search-for-tag rawinput1639334 "Initiator" :flattened? nil :result-wrapper resultWrapper1639335)}] (clojure.core/cond-> {} (letvar1639336 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar1639336 ["Bucket" :content]))) (letvar1639336 "Part") (clojure.core/assoc :parts (deser-parts (clojure.core/get-in letvar1639336 ["Part"]))) (letvar1639336 "x-amz-abort-date") (clojure.core/assoc :abort-date (deser-abort-date (clojure.core/get-in letvar1639336 ["x-amz-abort-date"]))) (letvar1639336 "MaxParts") (clojure.core/assoc :max-parts (deser-max-parts (clojure.core/get-in letvar1639336 ["MaxParts" :content]))) (letvar1639336 "NextPartNumberMarker") (clojure.core/assoc :next-part-number-marker (deser-next-part-number-marker (clojure.core/get-in letvar1639336 ["NextPartNumberMarker" :content]))) (letvar1639336 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1639336 ["Key" :content]))) (letvar1639336 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1639336 ["IsTruncated" :content]))) (letvar1639336 "x-amz-abort-rule-id") (clojure.core/assoc :abort-rule-id (deser-abort-rule-id (clojure.core/get-in letvar1639336 ["x-amz-abort-rule-id"]))) (letvar1639336 "PartNumberMarker") (clojure.core/assoc :part-number-marker (deser-part-number-marker (clojure.core/get-in letvar1639336 ["PartNumberMarker" :content]))) (letvar1639336 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1639336 ["Owner" :content]))) (letvar1639336 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar1639336 ["UploadId" :content]))) (letvar1639336 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1639336 ["StorageClass" :content]))) (letvar1639336 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639336 ["x-amz-request-charged"]))) (letvar1639336 "Initiator") (clojure.core/assoc :initiator (deser-initiator (clojure.core/get-in letvar1639336 ["Initiator" :content])))))))

(clojure.core/defn- response-abort-multipart-upload-output ([input] (response-abort-multipart-upload-output nil input)) ([resultWrapper1639338 input] (clojure.core/let [rawinput1639337 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639339 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639339 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639339 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-head-object-output ([input] (response-head-object-output nil input)) ([resultWrapper1639341 input] (clojure.core/let [rawinput1639340 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639342 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-object-lock-retain-until-date" (clojure.core/get-in input [:headers "x-amz-object-lock-retain-until-date"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "Last-Modified" (clojure.core/get-in input [:headers "Last-Modified"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-meta-" (clojure.core/get-in input [:headers "x-amz-meta-"]), "x-amz-restore" (clojure.core/get-in input [:headers "x-amz-restore"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-replication-status" (clojure.core/get-in input [:headers "x-amz-replication-status"]), "Content-Disposition" (clojure.core/get-in input [:headers "Content-Disposition"]), "x-amz-missing-meta" (clojure.core/get-in input [:headers "x-amz-missing-meta"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "Cache-Control" (clojure.core/get-in input [:headers "Cache-Control"]), "accept-ranges" (clojure.core/get-in input [:headers "accept-ranges"]), "x-amz-website-redirect-location" (clojure.core/get-in input [:headers "x-amz-website-redirect-location"]), "Content-Length" (clojure.core/get-in input [:headers "Content-Length"]), "Content-Language" (clojure.core/get-in input [:headers "Content-Language"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-object-lock-mode" (clojure.core/get-in input [:headers "x-amz-object-lock-mode"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-mp-parts-count" (clojure.core/get-in input [:headers "x-amz-mp-parts-count"]), "Content-Encoding" (clojure.core/get-in input [:headers "Content-Encoding"]), "x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-storage-class" (clojure.core/get-in input [:headers "x-amz-storage-class"]), "x-amz-object-lock-legal-hold" (clojure.core/get-in input [:headers "x-amz-object-lock-legal-hold"]), "Expires" (clojure.core/get-in input [:headers "Expires"])}] (clojure.core/cond-> {} (letvar1639342 "x-amz-missing-meta") (clojure.core/assoc :missing-meta (deser-missing-meta (clojure.core/get-in letvar1639342 ["x-amz-missing-meta"]))) (letvar1639342 "Content-Encoding") (clojure.core/assoc :content-encoding (deser-content-encoding (clojure.core/get-in letvar1639342 ["Content-Encoding"]))) (letvar1639342 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1639342 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1639342 "x-amz-website-redirect-location") (clojure.core/assoc :website-redirect-location (deser-website-redirect-location (clojure.core/get-in letvar1639342 ["x-amz-website-redirect-location"]))) (letvar1639342 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1639342 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1639342 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639342 ["x-amz-version-id"]))) (letvar1639342 "accept-ranges") (clojure.core/assoc :accept-ranges (deser-accept-ranges (clojure.core/get-in letvar1639342 ["accept-ranges"]))) (letvar1639342 "x-amz-replication-status") (clojure.core/assoc :replication-status (deser-replication-status (clojure.core/get-in letvar1639342 ["x-amz-replication-status"]))) (letvar1639342 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1639342 ["x-amz-server-side-encryption"]))) (letvar1639342 "Content-Disposition") (clojure.core/assoc :content-disposition (deser-content-disposition (clojure.core/get-in letvar1639342 ["Content-Disposition"]))) (letvar1639342 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1639342 ["ETag"]))) (letvar1639342 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar1639342 ["Content-Type"]))) (letvar1639342 "x-amz-restore") (clojure.core/assoc :restore (deser-restore (clojure.core/get-in letvar1639342 ["x-amz-restore"]))) (letvar1639342 "Content-Length") (clojure.core/assoc :content-length (deser-content-length (clojure.core/get-in letvar1639342 ["Content-Length"]))) (letvar1639342 "Last-Modified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1639342 ["Last-Modified"]))) (letvar1639342 "x-amz-mp-parts-count") (clojure.core/assoc :parts-count (deser-parts-count (clojure.core/get-in letvar1639342 ["x-amz-mp-parts-count"]))) (letvar1639342 "x-amz-object-lock-legal-hold") (clojure.core/assoc :object-lock-legal-hold-status (deser-object-lock-legal-hold-status (clojure.core/get-in letvar1639342 ["x-amz-object-lock-legal-hold"]))) (letvar1639342 "x-amz-meta-") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar1639342 ["x-amz-meta-" :content]))) (letvar1639342 "Cache-Control") (clojure.core/assoc :cache-control (deser-cache-control (clojure.core/get-in letvar1639342 ["Cache-Control"]))) (letvar1639342 "Content-Language") (clojure.core/assoc :content-language (deser-content-language (clojure.core/get-in letvar1639342 ["Content-Language"]))) (letvar1639342 "x-amz-storage-class") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1639342 ["x-amz-storage-class"]))) (letvar1639342 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar1639342 ["x-amz-delete-marker"]))) (letvar1639342 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639342 ["x-amz-request-charged"]))) (letvar1639342 "Expires") (clojure.core/assoc :expires (deser-expires (clojure.core/get-in letvar1639342 ["Expires"]))) (letvar1639342 "x-amz-object-lock-retain-until-date") (clojure.core/assoc :object-lock-retain-until-date (deser-object-lock-retain-until-date (clojure.core/get-in letvar1639342 ["x-amz-object-lock-retain-until-date"]))) (letvar1639342 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1639342 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1639342 "x-amz-object-lock-mode") (clojure.core/assoc :object-lock-mode (deser-object-lock-mode (clojure.core/get-in letvar1639342 ["x-amz-object-lock-mode"]))) (letvar1639342 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1639342 ["x-amz-expiration"])))))))

(clojure.core/defn- response-get-bucket-cors-output ([input] (response-get-bucket-cors-output nil input)) ([resultWrapper1639344 input] (clojure.core/let [rawinput1639343 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639345 {"CORSRule" (portkey.aws/search-for-tag rawinput1639343 "CORSRule" :flattened? true :result-wrapper resultWrapper1639344)}] (clojure.core/cond-> {} (letvar1639345 "CORSRule") (clojure.core/assoc :cors-rules (deser-cors-rules (clojure.core/get-in letvar1639345 ["CORSRule"])))))))

(clojure.core/defn- response-get-bucket-website-output ([input] (response-get-bucket-website-output nil input)) ([resultWrapper1639347 input] (clojure.core/let [rawinput1639346 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639348 {"RedirectAllRequestsTo" (portkey.aws/search-for-tag rawinput1639346 "RedirectAllRequestsTo" :flattened? nil :result-wrapper resultWrapper1639347), "IndexDocument" (portkey.aws/search-for-tag rawinput1639346 "IndexDocument" :flattened? nil :result-wrapper resultWrapper1639347), "ErrorDocument" (portkey.aws/search-for-tag rawinput1639346 "ErrorDocument" :flattened? nil :result-wrapper resultWrapper1639347), "RoutingRules" (portkey.aws/search-for-tag rawinput1639346 "RoutingRules" :flattened? nil :result-wrapper resultWrapper1639347)}] (clojure.core/cond-> {} (letvar1639348 "RedirectAllRequestsTo") (clojure.core/assoc :redirect-all-requests-to (deser-redirect-all-requests-to (clojure.core/get-in letvar1639348 ["RedirectAllRequestsTo" :content]))) (letvar1639348 "IndexDocument") (clojure.core/assoc :index-document (deser-index-document (clojure.core/get-in letvar1639348 ["IndexDocument" :content]))) (letvar1639348 "ErrorDocument") (clojure.core/assoc :error-document (deser-error-document (clojure.core/get-in letvar1639348 ["ErrorDocument" :content]))) (letvar1639348 "RoutingRules") (clojure.core/assoc :routing-rules (deser-routing-rules (clojure.core/get-in letvar1639348 ["RoutingRules" :content])))))))

(clojure.core/defn- response-bucket-already-exists ([input] (response-bucket-already-exists nil input)) ([resultWrapper1639350 input] (clojure.core/let [rawinput1639349 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639351 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-objects-v-2-output ([input] (response-list-objects-v-2-output nil input)) ([resultWrapper1639353 input] (clojure.core/let [rawinput1639352 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639354 {"KeyCount" (portkey.aws/search-for-tag rawinput1639352 "KeyCount" :flattened? nil :result-wrapper resultWrapper1639353), "Prefix" (portkey.aws/search-for-tag rawinput1639352 "Prefix" :flattened? nil :result-wrapper resultWrapper1639353), "EncodingType" (portkey.aws/search-for-tag rawinput1639352 "EncodingType" :flattened? nil :result-wrapper resultWrapper1639353), "StartAfter" (portkey.aws/search-for-tag rawinput1639352 "StartAfter" :flattened? nil :result-wrapper resultWrapper1639353), "IsTruncated" (portkey.aws/search-for-tag rawinput1639352 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1639353), "CommonPrefixes" (portkey.aws/search-for-tag rawinput1639352 "CommonPrefixes" :flattened? true :result-wrapper resultWrapper1639353), "Contents" (portkey.aws/search-for-tag rawinput1639352 "Contents" :flattened? true :result-wrapper resultWrapper1639353), "ContinuationToken" (portkey.aws/search-for-tag rawinput1639352 "ContinuationToken" :flattened? nil :result-wrapper resultWrapper1639353), "Delimiter" (portkey.aws/search-for-tag rawinput1639352 "Delimiter" :flattened? nil :result-wrapper resultWrapper1639353), "NextContinuationToken" (portkey.aws/search-for-tag rawinput1639352 "NextContinuationToken" :flattened? nil :result-wrapper resultWrapper1639353), "Name" (portkey.aws/search-for-tag rawinput1639352 "Name" :flattened? nil :result-wrapper resultWrapper1639353), "MaxKeys" (portkey.aws/search-for-tag rawinput1639352 "MaxKeys" :flattened? nil :result-wrapper resultWrapper1639353)}] (clojure.core/cond-> {} (letvar1639354 "KeyCount") (clojure.core/assoc :key-count (deser-key-count (clojure.core/get-in letvar1639354 ["KeyCount" :content]))) (letvar1639354 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1639354 ["Prefix" :content]))) (letvar1639354 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar1639354 ["EncodingType" :content]))) (letvar1639354 "StartAfter") (clojure.core/assoc :start-after (deser-start-after (clojure.core/get-in letvar1639354 ["StartAfter" :content]))) (letvar1639354 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1639354 ["IsTruncated" :content]))) (letvar1639354 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar1639354 ["CommonPrefixes"]))) (letvar1639354 "Contents") (clojure.core/assoc :contents (deser-object-list (clojure.core/get-in letvar1639354 ["Contents"]))) (letvar1639354 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar1639354 ["ContinuationToken" :content]))) (letvar1639354 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar1639354 ["Delimiter" :content]))) (letvar1639354 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar1639354 ["NextContinuationToken" :content]))) (letvar1639354 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar1639354 ["Name" :content]))) (letvar1639354 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar1639354 ["MaxKeys" :content])))))))

(clojure.core/defn- response-select-object-content-output ([input] (response-select-object-content-output nil input)) ([resultWrapper1639356 input] (clojure.core/let [rawinput1639355 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639357 {"Payload" (portkey.aws/search-for-tag rawinput1639355 "Payload" :flattened? nil :result-wrapper resultWrapper1639356)}] (clojure.core/cond-> {} (letvar1639357 "Payload") (clojure.core/assoc :payload (deser-select-object-content-event-stream (clojure.core/get-in letvar1639357 ["Payload" :content])))))))

(clojure.core/defn- response-no-such-upload ([input] (response-no-such-upload nil input)) ([resultWrapper1639359 input] (clojure.core/let [rawinput1639358 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639360 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-no-such-bucket ([input] (response-no-such-bucket nil input)) ([resultWrapper1639362 input] (clojure.core/let [rawinput1639361 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639363 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-bucket-accelerate-configuration-output ([input] (response-get-bucket-accelerate-configuration-output nil input)) ([resultWrapper1639365 input] (clojure.core/let [rawinput1639364 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639366 {"Status" (portkey.aws/search-for-tag rawinput1639364 "Status" :flattened? nil :result-wrapper resultWrapper1639365)}] (clojure.core/cond-> {} (letvar1639366 "Status") (clojure.core/assoc :status (deser-bucket-accelerate-status (clojure.core/get-in letvar1639366 ["Status" :content])))))))

(clojure.core/defn- response-restore-object-output ([input] (response-restore-object-output nil input)) ([resultWrapper1639368 input] (clojure.core/let [rawinput1639367 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639369 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-restore-output-path" (clojure.core/get-in input [:headers "x-amz-restore-output-path"])}] (clojure.core/cond-> {} (letvar1639369 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639369 ["x-amz-request-charged"]))) (letvar1639369 "x-amz-restore-output-path") (clojure.core/assoc :restore-output-path (deser-restore-output-path (clojure.core/get-in letvar1639369 ["x-amz-restore-output-path"])))))))

(clojure.core/defn- response-get-object-output ([input] (response-get-object-output nil input)) ([resultWrapper1639371 input] (clojure.core/let [rawinput1639370 (:body input) letvar1639372 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-object-lock-retain-until-date" (clojure.core/get-in input [:headers "x-amz-object-lock-retain-until-date"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-tagging-count" (clojure.core/get-in input [:headers "x-amz-tagging-count"]), "Body" rawinput1639370, "Content-Range" (clojure.core/get-in input [:headers "Content-Range"]), "Last-Modified" (clojure.core/get-in input [:headers "Last-Modified"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-meta-" (clojure.core/get-in input [:headers "x-amz-meta-"]), "x-amz-restore" (clojure.core/get-in input [:headers "x-amz-restore"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-replication-status" (clojure.core/get-in input [:headers "x-amz-replication-status"]), "Content-Disposition" (clojure.core/get-in input [:headers "Content-Disposition"]), "x-amz-missing-meta" (clojure.core/get-in input [:headers "x-amz-missing-meta"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "Cache-Control" (clojure.core/get-in input [:headers "Cache-Control"]), "accept-ranges" (clojure.core/get-in input [:headers "accept-ranges"]), "x-amz-website-redirect-location" (clojure.core/get-in input [:headers "x-amz-website-redirect-location"]), "Content-Length" (clojure.core/get-in input [:headers "Content-Length"]), "Content-Language" (clojure.core/get-in input [:headers "Content-Language"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-object-lock-mode" (clojure.core/get-in input [:headers "x-amz-object-lock-mode"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-mp-parts-count" (clojure.core/get-in input [:headers "x-amz-mp-parts-count"]), "Content-Encoding" (clojure.core/get-in input [:headers "Content-Encoding"]), "x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-storage-class" (clojure.core/get-in input [:headers "x-amz-storage-class"]), "x-amz-object-lock-legal-hold" (clojure.core/get-in input [:headers "x-amz-object-lock-legal-hold"]), "Expires" (clojure.core/get-in input [:headers "Expires"])}] (clojure.core/cond-> {} (letvar1639372 "x-amz-missing-meta") (clojure.core/assoc :missing-meta (deser-missing-meta (clojure.core/get-in letvar1639372 ["x-amz-missing-meta"]))) (letvar1639372 "Content-Encoding") (clojure.core/assoc :content-encoding (deser-content-encoding (clojure.core/get-in letvar1639372 ["Content-Encoding"]))) (letvar1639372 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1639372 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1639372 "x-amz-website-redirect-location") (clojure.core/assoc :website-redirect-location (deser-website-redirect-location (clojure.core/get-in letvar1639372 ["x-amz-website-redirect-location"]))) (letvar1639372 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1639372 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1639372 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639372 ["x-amz-version-id"]))) (letvar1639372 "Body") (clojure.core/assoc :body (deser-body (clojure.core/get-in letvar1639372 ["Body"]))) (letvar1639372 "Content-Range") (clojure.core/assoc :content-range (deser-content-range (clojure.core/get-in letvar1639372 ["Content-Range"]))) (letvar1639372 "accept-ranges") (clojure.core/assoc :accept-ranges (deser-accept-ranges (clojure.core/get-in letvar1639372 ["accept-ranges"]))) (letvar1639372 "x-amz-replication-status") (clojure.core/assoc :replication-status (deser-replication-status (clojure.core/get-in letvar1639372 ["x-amz-replication-status"]))) (letvar1639372 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1639372 ["x-amz-server-side-encryption"]))) (letvar1639372 "Content-Disposition") (clojure.core/assoc :content-disposition (deser-content-disposition (clojure.core/get-in letvar1639372 ["Content-Disposition"]))) (letvar1639372 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1639372 ["ETag"]))) (letvar1639372 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar1639372 ["Content-Type"]))) (letvar1639372 "x-amz-restore") (clojure.core/assoc :restore (deser-restore (clojure.core/get-in letvar1639372 ["x-amz-restore"]))) (letvar1639372 "x-amz-tagging-count") (clojure.core/assoc :tag-count (deser-tag-count (clojure.core/get-in letvar1639372 ["x-amz-tagging-count"]))) (letvar1639372 "Content-Length") (clojure.core/assoc :content-length (deser-content-length (clojure.core/get-in letvar1639372 ["Content-Length"]))) (letvar1639372 "Last-Modified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1639372 ["Last-Modified"]))) (letvar1639372 "x-amz-mp-parts-count") (clojure.core/assoc :parts-count (deser-parts-count (clojure.core/get-in letvar1639372 ["x-amz-mp-parts-count"]))) (letvar1639372 "x-amz-object-lock-legal-hold") (clojure.core/assoc :object-lock-legal-hold-status (deser-object-lock-legal-hold-status (clojure.core/get-in letvar1639372 ["x-amz-object-lock-legal-hold"]))) (letvar1639372 "x-amz-meta-") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar1639372 ["x-amz-meta-" :content]))) (letvar1639372 "Cache-Control") (clojure.core/assoc :cache-control (deser-cache-control (clojure.core/get-in letvar1639372 ["Cache-Control"]))) (letvar1639372 "Content-Language") (clojure.core/assoc :content-language (deser-content-language (clojure.core/get-in letvar1639372 ["Content-Language"]))) (letvar1639372 "x-amz-storage-class") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1639372 ["x-amz-storage-class"]))) (letvar1639372 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar1639372 ["x-amz-delete-marker"]))) (letvar1639372 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639372 ["x-amz-request-charged"]))) (letvar1639372 "Expires") (clojure.core/assoc :expires (deser-expires (clojure.core/get-in letvar1639372 ["Expires"]))) (letvar1639372 "x-amz-object-lock-retain-until-date") (clojure.core/assoc :object-lock-retain-until-date (deser-object-lock-retain-until-date (clojure.core/get-in letvar1639372 ["x-amz-object-lock-retain-until-date"]))) (letvar1639372 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1639372 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1639372 "x-amz-object-lock-mode") (clojure.core/assoc :object-lock-mode (deser-object-lock-mode (clojure.core/get-in letvar1639372 ["x-amz-object-lock-mode"]))) (letvar1639372 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1639372 ["x-amz-expiration"])))))))

(clojure.core/defn- response-complete-multipart-upload-output ([input] (response-complete-multipart-upload-output nil input)) ([resultWrapper1639374 input] (clojure.core/let [rawinput1639373 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639375 {"Bucket" (portkey.aws/search-for-tag rawinput1639373 "Bucket" :flattened? nil :result-wrapper resultWrapper1639374), "x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "Location" (portkey.aws/search-for-tag rawinput1639373 "Location" :flattened? nil :result-wrapper resultWrapper1639374), "ETag" (portkey.aws/search-for-tag rawinput1639373 "ETag" :flattened? nil :result-wrapper resultWrapper1639374), "Key" (portkey.aws/search-for-tag rawinput1639373 "Key" :flattened? nil :result-wrapper resultWrapper1639374), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639375 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar1639375 ["Bucket" :content]))) (letvar1639375 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639375 ["x-amz-version-id"]))) (letvar1639375 "Location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar1639375 ["Location" :content]))) (letvar1639375 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1639375 ["x-amz-server-side-encryption"]))) (letvar1639375 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1639375 ["ETag" :content]))) (letvar1639375 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1639375 ["Key" :content]))) (letvar1639375 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639375 ["x-amz-request-charged"]))) (letvar1639375 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1639375 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1639375 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1639375 ["x-amz-expiration"])))))))

(clojure.core/defn- response-notification-configuration-deprecated ([input] (response-notification-configuration-deprecated nil input)) ([resultWrapper1639377 input] (clojure.core/let [rawinput1639376 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639378 {"TopicConfiguration" (portkey.aws/search-for-tag rawinput1639376 "TopicConfiguration" :flattened? nil :result-wrapper resultWrapper1639377), "QueueConfiguration" (portkey.aws/search-for-tag rawinput1639376 "QueueConfiguration" :flattened? nil :result-wrapper resultWrapper1639377), "CloudFunctionConfiguration" (portkey.aws/search-for-tag rawinput1639376 "CloudFunctionConfiguration" :flattened? nil :result-wrapper resultWrapper1639377)}] (clojure.core/cond-> {} (letvar1639378 "TopicConfiguration") (clojure.core/assoc :topic-configuration (deser-topic-configuration-deprecated (clojure.core/get-in letvar1639378 ["TopicConfiguration" :content]))) (letvar1639378 "QueueConfiguration") (clojure.core/assoc :queue-configuration (deser-queue-configuration-deprecated (clojure.core/get-in letvar1639378 ["QueueConfiguration" :content]))) (letvar1639378 "CloudFunctionConfiguration") (clojure.core/assoc :cloud-function-configuration (deser-cloud-function-configuration (clojure.core/get-in letvar1639378 ["CloudFunctionConfiguration" :content])))))))

(clojure.core/defn- response-delete-object-tagging-output ([input] (response-delete-object-tagging-output nil input)) ([resultWrapper1639380 input] (clojure.core/let [rawinput1639379 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639381 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"])}] (clojure.core/cond-> {} (letvar1639381 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639381 ["x-amz-version-id"])))))))

(clojure.core/defn- response-upload-part-output ([input] (response-upload-part-output nil input)) ([resultWrapper1639383 input] (clojure.core/let [rawinput1639382 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639384 {"x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639384 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1639384 ["x-amz-server-side-encryption"]))) (letvar1639384 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1639384 ["ETag"]))) (letvar1639384 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1639384 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1639384 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1639384 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1639384 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1639384 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1639384 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639384 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-bucket-acl-output ([input] (response-get-bucket-acl-output nil input)) ([resultWrapper1639386 input] (clojure.core/let [rawinput1639385 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639387 {"Owner" (portkey.aws/search-for-tag rawinput1639385 "Owner" :flattened? nil :result-wrapper resultWrapper1639386), "AccessControlList" (portkey.aws/search-for-tag rawinput1639385 "AccessControlList" :flattened? nil :result-wrapper resultWrapper1639386)}] (clojure.core/cond-> {} (letvar1639387 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1639387 ["Owner" :content]))) (letvar1639387 "AccessControlList") (clojure.core/assoc :grants (deser-grants (clojure.core/get-in letvar1639387 ["AccessControlList" :content])))))))

(clojure.core/defn- response-get-bucket-request-payment-output ([input] (response-get-bucket-request-payment-output nil input)) ([resultWrapper1639389 input] (clojure.core/let [rawinput1639388 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639390 {"Payer" (portkey.aws/search-for-tag rawinput1639388 "Payer" :flattened? nil :result-wrapper resultWrapper1639389)}] (clojure.core/cond-> {} (letvar1639390 "Payer") (clojure.core/assoc :payer (deser-payer (clojure.core/get-in letvar1639390 ["Payer" :content])))))))

(clojure.core/defn- response-get-bucket-tagging-output ([input] (response-get-bucket-tagging-output nil input)) ([resultWrapper1639392 input] (clojure.core/let [rawinput1639391 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639393 {"TagSet" (portkey.aws/search-for-tag rawinput1639391 "TagSet" :flattened? nil :result-wrapper resultWrapper1639392)}] (clojure.core/cond-> {:tag-set (deser-tag-set (clojure.core/get-in letvar1639393 ["TagSet" :content]))}))))

(clojure.core/defn- response-get-bucket-lifecycle-configuration-output ([input] (response-get-bucket-lifecycle-configuration-output nil input)) ([resultWrapper1639395 input] (clojure.core/let [rawinput1639394 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639396 {"Rule" (portkey.aws/search-for-tag rawinput1639394 "Rule" :flattened? true :result-wrapper resultWrapper1639395)}] (clojure.core/cond-> {} (letvar1639396 "Rule") (clojure.core/assoc :rules (deser-lifecycle-rules (clojure.core/get-in letvar1639396 ["Rule"])))))))

(clojure.core/defn- response-get-bucket-location-output ([input] (response-get-bucket-location-output nil input)) ([resultWrapper1639398 input] (clojure.core/let [rawinput1639397 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639399 {"LocationConstraint" (portkey.aws/search-for-tag rawinput1639397 "LocationConstraint" :flattened? nil :result-wrapper resultWrapper1639398)}] (clojure.core/cond-> {} (letvar1639399 "LocationConstraint") (clojure.core/assoc :location-constraint (deser-bucket-location-constraint (clojure.core/get-in letvar1639399 ["LocationConstraint" :content])))))))

(clojure.core/defn- response-get-bucket-inventory-configuration-output ([input] (response-get-bucket-inventory-configuration-output nil input)) ([resultWrapper1639401 input] (clojure.core/let [rawinput1639400 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639402 {"InventoryConfiguration" (portkey.aws/search-for-tag rawinput1639400 "InventoryConfiguration" :flattened? nil :result-wrapper resultWrapper1639401)}] (clojure.core/cond-> {} (letvar1639402 "InventoryConfiguration") (clojure.core/assoc :inventory-configuration (deser-inventory-configuration (clojure.core/get-in letvar1639402 ["InventoryConfiguration" :content])))))))

(clojure.core/defn- response-get-bucket-versioning-output ([input] (response-get-bucket-versioning-output nil input)) ([resultWrapper1639404 input] (clojure.core/let [rawinput1639403 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639405 {"Status" (portkey.aws/search-for-tag rawinput1639403 "Status" :flattened? nil :result-wrapper resultWrapper1639404), "MfaDelete" (portkey.aws/search-for-tag rawinput1639403 "MfaDelete" :flattened? nil :result-wrapper resultWrapper1639404)}] (clojure.core/cond-> {} (letvar1639405 "Status") (clojure.core/assoc :status (deser-bucket-versioning-status (clojure.core/get-in letvar1639405 ["Status" :content]))) (letvar1639405 "MfaDelete") (clojure.core/assoc :mfa-delete (deser-mfa-delete-status (clojure.core/get-in letvar1639405 ["MfaDelete" :content])))))))

(clojure.core/defn- response-put-object-acl-output ([input] (response-put-object-acl-output nil input)) ([resultWrapper1639407 input] (clojure.core/let [rawinput1639406 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639408 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639408 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639408 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-upload-part-copy-output ([input] (response-upload-part-copy-output nil input)) ([resultWrapper1639410 input] (clojure.core/let [rawinput1639409 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639411 {"x-amz-copy-source-version-id" (clojure.core/get-in input [:headers "x-amz-copy-source-version-id"]), "CopyPartResult" (portkey.aws/search-for-tag rawinput1639409 "CopyPartResult" :flattened? nil :result-wrapper resultWrapper1639410), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639411 "x-amz-copy-source-version-id") (clojure.core/assoc :copy-source-version-id (deser-copy-source-version-id (clojure.core/get-in letvar1639411 ["x-amz-copy-source-version-id"]))) (letvar1639411 "CopyPartResult") (clojure.core/assoc :copy-part-result (deser-copy-part-result (clojure.core/get-in letvar1639411 ["CopyPartResult" :content]))) (letvar1639411 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1639411 ["x-amz-server-side-encryption"]))) (letvar1639411 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1639411 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1639411 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1639411 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1639411 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1639411 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1639411 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639411 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-list-buckets-output ([input] (response-list-buckets-output nil input)) ([resultWrapper1639413 input] (clojure.core/let [rawinput1639412 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639414 {"Buckets" (portkey.aws/search-for-tag rawinput1639412 "Buckets" :flattened? nil :result-wrapper resultWrapper1639413), "Owner" (portkey.aws/search-for-tag rawinput1639412 "Owner" :flattened? nil :result-wrapper resultWrapper1639413)}] (clojure.core/cond-> {} (letvar1639414 "Buckets") (clojure.core/assoc :buckets (deser-buckets (clojure.core/get-in letvar1639414 ["Buckets" :content]))) (letvar1639414 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1639414 ["Owner" :content])))))))

(clojure.core/defn- response-put-object-output ([input] (response-put-object-output nil input)) ([resultWrapper1639416 input] (clojure.core/let [rawinput1639415 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639417 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639417 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1639417 ["x-amz-expiration"]))) (letvar1639417 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1639417 ["ETag"]))) (letvar1639417 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1639417 ["x-amz-server-side-encryption"]))) (letvar1639417 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639417 ["x-amz-version-id"]))) (letvar1639417 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1639417 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1639417 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1639417 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1639417 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1639417 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1639417 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639417 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-object-acl-output ([input] (response-get-object-acl-output nil input)) ([resultWrapper1639419 input] (clojure.core/let [rawinput1639418 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639420 {"Owner" (portkey.aws/search-for-tag rawinput1639418 "Owner" :flattened? nil :result-wrapper resultWrapper1639419), "AccessControlList" (portkey.aws/search-for-tag rawinput1639418 "AccessControlList" :flattened? nil :result-wrapper resultWrapper1639419), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639420 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1639420 ["Owner" :content]))) (letvar1639420 "AccessControlList") (clojure.core/assoc :grants (deser-grants (clojure.core/get-in letvar1639420 ["AccessControlList" :content]))) (letvar1639420 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639420 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-list-bucket-analytics-configurations-output ([input] (response-list-bucket-analytics-configurations-output nil input)) ([resultWrapper1639422 input] (clojure.core/let [rawinput1639421 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639423 {"IsTruncated" (portkey.aws/search-for-tag rawinput1639421 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1639422), "ContinuationToken" (portkey.aws/search-for-tag rawinput1639421 "ContinuationToken" :flattened? nil :result-wrapper resultWrapper1639422), "NextContinuationToken" (portkey.aws/search-for-tag rawinput1639421 "NextContinuationToken" :flattened? nil :result-wrapper resultWrapper1639422), "AnalyticsConfiguration" (portkey.aws/search-for-tag rawinput1639421 "AnalyticsConfiguration" :flattened? true :result-wrapper resultWrapper1639422)}] (clojure.core/cond-> {} (letvar1639423 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1639423 ["IsTruncated" :content]))) (letvar1639423 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar1639423 ["ContinuationToken" :content]))) (letvar1639423 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar1639423 ["NextContinuationToken" :content]))) (letvar1639423 "AnalyticsConfiguration") (clojure.core/assoc :analytics-configuration-list (deser-analytics-configuration-list (clojure.core/get-in letvar1639423 ["AnalyticsConfiguration"])))))))

(clojure.core/defn- response-object-already-in-active-tier-error ([input] (response-object-already-in-active-tier-error nil input)) ([resultWrapper1639425 input] (clojure.core/let [rawinput1639424 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639426 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-bucket-policy-output ([input] (response-get-bucket-policy-output nil input)) ([resultWrapper1639428 input] (clojure.core/let [rawinput1639427 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639429 {"Policy" (portkey.aws/search-for-tag rawinput1639427 "Policy" :flattened? nil :result-wrapper resultWrapper1639428)}] (clojure.core/cond-> {} (letvar1639429 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar1639429 ["Policy" :content])))))))

(clojure.core/defn- response-notification-configuration ([input] (response-notification-configuration nil input)) ([resultWrapper1639431 input] (clojure.core/let [rawinput1639430 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639432 {"TopicConfiguration" (portkey.aws/search-for-tag rawinput1639430 "TopicConfiguration" :flattened? true :result-wrapper resultWrapper1639431), "QueueConfiguration" (portkey.aws/search-for-tag rawinput1639430 "QueueConfiguration" :flattened? true :result-wrapper resultWrapper1639431), "CloudFunctionConfiguration" (portkey.aws/search-for-tag rawinput1639430 "CloudFunctionConfiguration" :flattened? true :result-wrapper resultWrapper1639431)}] (clojure.core/cond-> {} (letvar1639432 "TopicConfiguration") (clojure.core/assoc :topic-configurations (deser-topic-configuration-list (clojure.core/get-in letvar1639432 ["TopicConfiguration"]))) (letvar1639432 "QueueConfiguration") (clojure.core/assoc :queue-configurations (deser-queue-configuration-list (clojure.core/get-in letvar1639432 ["QueueConfiguration"]))) (letvar1639432 "CloudFunctionConfiguration") (clojure.core/assoc :lambda-function-configurations (deser-lambda-function-configuration-list (clojure.core/get-in letvar1639432 ["CloudFunctionConfiguration"])))))))

(clojure.core/defn- response-put-object-retention-output ([input] (response-put-object-retention-output nil input)) ([resultWrapper1639434 input] (clojure.core/let [rawinput1639433 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639435 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639435 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639435 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-public-access-block-output ([input] (response-get-public-access-block-output nil input)) ([resultWrapper1639437 input] (clojure.core/let [rawinput1639436 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639438 {"PublicAccessBlockConfiguration" (portkey.aws/search-for-tag rawinput1639436 "PublicAccessBlockConfiguration" :flattened? nil :result-wrapper resultWrapper1639437)}] (clojure.core/cond-> {} (letvar1639438 "PublicAccessBlockConfiguration") (clojure.core/assoc :public-access-block-configuration (deser-public-access-block-configuration (clojure.core/get-in letvar1639438 ["PublicAccessBlockConfiguration" :content])))))))

(clojure.core/defn- response-no-such-key ([input] (response-no-such-key nil input)) ([resultWrapper1639440 input] (clojure.core/let [rawinput1639439 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639441 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-copy-object-output ([input] (response-copy-object-output nil input)) ([resultWrapper1639443 input] (clojure.core/let [rawinput1639442 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639444 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-copy-source-version-id" (clojure.core/get-in input [:headers "x-amz-copy-source-version-id"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "CopyObjectResult" (portkey.aws/search-for-tag rawinput1639442 "CopyObjectResult" :flattened? nil :result-wrapper resultWrapper1639443), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1639444 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1639444 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1639444 "x-amz-copy-source-version-id") (clojure.core/assoc :copy-source-version-id (deser-copy-source-version-id (clojure.core/get-in letvar1639444 ["x-amz-copy-source-version-id"]))) (letvar1639444 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1639444 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1639444 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1639444 ["x-amz-version-id"]))) (letvar1639444 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1639444 ["x-amz-server-side-encryption"]))) (letvar1639444 "CopyObjectResult") (clojure.core/assoc :copy-object-result (deser-copy-object-result (clojure.core/get-in letvar1639444 ["CopyObjectResult" :content]))) (letvar1639444 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1639444 ["x-amz-request-charged"]))) (letvar1639444 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1639444 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1639444 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1639444 ["x-amz-expiration"])))))))

(clojure.core/defn- response-get-bucket-metrics-configuration-output ([input] (response-get-bucket-metrics-configuration-output nil input)) ([resultWrapper1639446 input] (clojure.core/let [rawinput1639445 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639447 {"MetricsConfiguration" (portkey.aws/search-for-tag rawinput1639445 "MetricsConfiguration" :flattened? nil :result-wrapper resultWrapper1639446)}] (clojure.core/cond-> {} (letvar1639447 "MetricsConfiguration") (clojure.core/assoc :metrics-configuration (deser-metrics-configuration (clojure.core/get-in letvar1639447 ["MetricsConfiguration" :content])))))))

(clojure.core/defn- response-object-not-in-active-tier-error ([input] (response-object-not-in-active-tier-error nil input)) ([resultWrapper1639449 input] (clojure.core/let [rawinput1639448 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639450 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-bucket-replication-output ([input] (response-get-bucket-replication-output nil input)) ([resultWrapper1639452 input] (clojure.core/let [rawinput1639451 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1639453 {"ReplicationConfiguration" (portkey.aws/search-for-tag rawinput1639451 "ReplicationConfiguration" :flattened? nil :result-wrapper resultWrapper1639452)}] (clojure.core/cond-> {} (letvar1639453 "ReplicationConfiguration") (clojure.core/assoc :replication-configuration (deser-replication-configuration (clojure.core/get-in letvar1639453 ["ReplicationConfiguration" :content])))))))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/mfa-delete #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-tagging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.put-object-tagging-output/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.bucket/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.bucket/name :portkey.aws.s3.-2006-03-01/creation-date]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-tagging-output (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/tag-set] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-tagging-output/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-object-request/bucket :portkey.aws.s3.-2006-03-01.delete-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/mfa :portkey.aws.s3.-2006-03-01.delete-object-request/version-id :portkey.aws.s3.-2006-03-01/request-payer :portkey.aws.s3.-2006-03-01/bypass-governance-retention]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/versions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-object-versions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-object-versions-output/versions :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/next-key-marker :portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01.list-object-versions-output/common-prefixes :portkey.aws.s3.-2006-03-01/version-id-marker :portkey.aws.s3.-2006-03-01/next-version-id-marker :portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01.list-object-versions-output/name :portkey.aws.s3.-2006-03-01/max-keys :portkey.aws.s3.-2006-03-01/key-marker :portkey.aws.s3.-2006-03-01/delete-markers]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metrics-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metrics-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.metrics-configuration/id] :opt-un [:portkey.aws.s3.-2006-03-01.metrics-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-encryption-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/missing-meta clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-request/tagging (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-request/bucket :portkey.aws.s3.-2006-03-01.put-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/content-md-5 :portkey.aws.s3.-2006-03-01/body :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01.put-object-request/acl :portkey.aws.s3.-2006-03-01/content-length :portkey.aws.s3.-2006-03-01/object-lock-legal-hold-status :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control :portkey.aws.s3.-2006-03-01.put-object-request/tagging :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/object-lock-retain-until-date :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/object-lock-mode :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cloud-function-invocation-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.input-serialization/csv (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/csv-input))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.input-serialization/json (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/json-input))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.input-serialization/parquet (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/parquet-input))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/input-serialization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.input-serialization/csv :portkey.aws.s3.-2006-03-01/compression-type :portkey.aws.s3.-2006-03-01.input-serialization/json :portkey.aws.s3.-2006-03-01.input-serialization/parquet]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tier #{"Expedited" :bulk "Standard" "Bulk" :standard :expedited})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-encoding (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-cors-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/setting clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-already-owned-by-you (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/confirm-remove-self-bucket-access clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/key-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/compression-type #{"GZIP" "NONE" :gzip "BZIP2" :none :bzip-2})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/multipart-upload-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/multipart-upload))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tagging-directive #{:copy :replace "COPY" "REPLACE"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tag-set (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/tag))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/routing-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/routing-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expired-object-delete-marker clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-expires clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replica-kms-key-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/completed-part (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/part-number]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/metrics-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/notification-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-torrent-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/body :portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/common-prefix-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/common-prefix))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/multipart-upload (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/completed-multipart-upload))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/complete-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/bucket :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/key :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/upload-id] :opt-un [:portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/multipart-upload :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/analytics-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-encryption-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/server-side-encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.versioning-configuration/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-versioning-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/versioning-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/mfa-delete :portkey.aws.s3.-2006-03-01.versioning-configuration/status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/continuation-event (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-notification-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-notification-configuration-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-unmodified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-enabled #{"Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-legal-hold-output/legal-hold (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-legal-hold))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-legal-hold-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-legal-hold-output/legal-hold]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-website-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-disposition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/mfa-delete-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-name #{:suffix "prefix" "suffix" :prefix})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-retention-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-retention-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-retention-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-retention-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-retention-request/bucket :portkey.aws.s3.-2006-03-01.get-object-retention-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-retention-request/version-id :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5 :portkey.aws.s3.-2006-03-01/lifecycle-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-logging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-logging-request/bucket :portkey.aws.s3.-2006-03-01/bucket-logging-status] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/topic-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/topic-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/head-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.head-bucket-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.access-control-translation/owner (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/owner-override))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/access-control-translation (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.access-control-translation/owner] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/topic (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/topic-arn))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/topic-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/id :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/events :portkey.aws.s3.-2006-03-01/event :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/topic]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-lock-legal-hold/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-legal-hold-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-legal-hold (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.object-lock-legal-hold/status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/glacier-job-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/tier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/rules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-request-payment-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-request-payment-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/website-redirect-location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-logging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/logging-enabled]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/type #{:group :canonical-user "CanonicalUser" "AmazonCustomerByEmail" "Group" :amazon-customer-by-email})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class-analysis-schema-version #{"V_1" :v-1})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/encoding-type #{"url" :url})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-objects-output/deleted (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/deleted-objects))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-objects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.delete-objects-output/deleted :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/errors]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-bucket-configuration/location-constraint (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-location-constraint))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-bucket-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.create-bucket-configuration/location-constraint]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-key-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.create-multipart-upload-output/bucket :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/abort-date :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/key :portkey.aws.s3.-2006-03-01/abort-rule-id :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/upload-id :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/ssekms-key-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/encryption-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/replica-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.cloud-function-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.cloud-function-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.cloud-function-configuration/invocation-role (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/cloud-function-invocation-role))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cloud-function-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.cloud-function-configuration/id :portkey.aws.s3.-2006-03-01/event :portkey.aws.s3.-2006-03-01.cloud-function-configuration/events :portkey.aws.s3.-2006-03-01/cloud-function :portkey.aws.s3.-2006-03-01.cloud-function-configuration/invocation-role]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/request-payment-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/payer] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-optional-field #{:object-lock-retain-until-date "LastModifiedDate" :storage-class :object-lock-legal-hold-status "ReplicationStatus" "EncryptionStatus" :object-lock-mode "ETag" :size :replication-status "Size" "ObjectLockLegalHoldStatus" "IsMultipartUploaded" "StorageClass" :encryption-status :is-multipart-uploaded :last-modified-date "ObjectLockRetainUntilDate" "ObjectLockMode" :e-tag})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/permission #{"WRITE" "FULL_CONTROL" :read :read-acp "READ_ACP" :write-acp :write "WRITE_ACP" "READ" :full-control})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/uploads (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-multipart-uploads-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/bucket :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/uploads :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/next-key-marker :portkey.aws.s3.-2006-03-01/upload-id-marker :portkey.aws.s3.-2006-03-01/max-uploads :portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/common-prefixes :portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01/key-marker :portkey.aws.s3.-2006-03-01/next-upload-id-marker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/json-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/record-delimiter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/records (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/records-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/stats (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/stats-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/progress (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/progress-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/cont (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/continuation-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/end (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/end-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/select-object-content-event-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.select-object-content-event-stream/records :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/stats :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/progress :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/cont :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/end]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption-rules))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-configuration/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.target-grant/permission (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-logs-permission))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/target-grant (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/grantee :portkey.aws.s3.-2006-03-01.target-grant/permission]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/replication-rules))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/role :portkey.aws.s3.-2006-03-01.replication-configuration/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/completed-part-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/completed-part))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/is-public clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/comments (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sse-customer-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-schedule/frequency (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-frequency))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-schedule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.inventory-schedule/frequency] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.transition/storage-class (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/transition-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/transition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/date :portkey.aws.s3.-2006-03-01/days :portkey.aws.s3.-2006-03-01.transition/storage-class]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata-directive #{:copy :replace "COPY" "REPLACE"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.multipart-upload/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.multipart-upload/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.multipart-upload/upload-id :portkey.aws.s3.-2006-03-01.multipart-upload/key :portkey.aws.s3.-2006-03-01/initiated :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/owner :portkey.aws.s3.-2006-03-01/initiator]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-export-destination/s-3-bucket-destination (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-s-3-bucket-destination))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-export-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.analytics-export-destination/s-3-bucket-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-output/continuation-token :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-output/next-continuation-token :portkey.aws.s3.-2006-03-01/metrics-configuration-list]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sse-customer-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-request-payment-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-request-payment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-request-payment-request/bucket :portkey.aws.s3.-2006-03-01/request-payment-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-parts-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-parts-request/bucket :portkey.aws.s3.-2006-03-01.list-parts-request/key :portkey.aws.s3.-2006-03-01.list-parts-request/upload-id] :opt-un [:portkey.aws.s3.-2006-03-01/max-parts :portkey.aws.s3.-2006-03-01/part-number-marker :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-md-5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.storage-class-analysis/data-export (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/storage-class-analysis-data-export))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class-analysis (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.storage-class-analysis/data-export]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expose-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-tagging-request/bucket :portkey.aws.s3.-2006-03-01.get-object-tagging-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-tagging-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-notification-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-notification-request/notification-configuration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-notification-request/bucket :portkey.aws.s3.-2006-03-01.put-bucket-notification-request/notification-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/body clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-replication-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allow-quoted-record-delimiter clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-versioning-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-versioning-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-versioning-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-bucket-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/location]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object/storage-class (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.object/key :portkey.aws.s3.-2006-03-01/last-modified :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/size :portkey.aws.s3.-2006-03-01.object/storage-class :portkey.aws.s3.-2006-03-01/owner]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grants (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/grant))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/transition-storage-class #{:standard-ia "GLACIER" :glacier "ONEZONE_IA" "STANDARD_IA" :intelligent-tiering "INTELLIGENT_TIERING" :onezone-ia})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule-filter/and (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-rule-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-rule-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/tag :portkey.aws.s3.-2006-03-01.lifecycle-rule-filter/and]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/payer #{"Requester" :requester "BucketOwner" :bucket-owner})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/delete-marker :portkey.aws.s3.-2006-03-01.delete-object-output/version-id :portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metrics-filter/and (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/tag :portkey.aws.s3.-2006-03-01.metrics-filter/and]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-destination/s-3-bucket-destination (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-s-3-bucket-destination))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.inventory-destination/s-3-bucket-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-read-acp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.json-input/type (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/json-type))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/json-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.json-input/type]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-acl-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-acl-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-acl-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-acl-request/bucket :portkey.aws.s3.-2006-03-01.put-object-acl-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.put-object-acl-request/version-id :portkey.aws.s3.-2006-03-01/content-md-5 :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/access-control-policy :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01.put-object-acl-request/acl :portkey.aws.s3.-2006-03-01/grant-write :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/days-after-initiation clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-lifecycle-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-retention-output/retention (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-retention))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-retention-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-retention-output/retention]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-lock-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-part-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/last-modified]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/bucket :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-lock-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/object-lock-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-versioning-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-versioning-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-versioning-request/bucket :portkey.aws.s3.-2006-03-01/versioning-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5 :portkey.aws.s3.-2006-03-01/mfa]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.restore-request/type (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/restore-request-type))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/days :portkey.aws.s3.-2006-03-01/glacier-job-parameters :portkey.aws.s3.-2006-03-01.restore-request/type :portkey.aws.s3.-2006-03-01/tier :portkey.aws.s3.-2006-03-01/description :portkey.aws.s3.-2006-03-01/select-parameters :portkey.aws.s3.-2006-03-01/output-location]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-rule-filter/and (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/replication-rule-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rule-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/tag :portkey.aws.s3.-2006-03-01.replication-rule-filter/and]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/deleted-objects (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/deleted-object))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/start-after (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-output/contents (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-output/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-objects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/marker :portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01.list-objects-output/common-prefixes :portkey.aws.s3.-2006-03-01.list-objects-output/contents :portkey.aws.s3.-2006-03-01/next-marker :portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01.list-objects-output/name :portkey.aws.s3.-2006-03-01/max-keys]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/sses-3 :portkey.aws.s3.-2006-03-01/ssekms]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/record-delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replace-key-prefix-with (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metrics-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01.metrics-and-operator/tags]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-lock-configuration/rule (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-rule))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/object-lock-enabled :portkey.aws.s3.-2006-03-01.object-lock-configuration/rule]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-rule-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/expiration-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/transitions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/transition-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/noncurrent-version-transitions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/noncurrent-version-transition-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/expiration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-expiration))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.lifecycle-rule/status] :opt-un [:portkey.aws.s3.-2006-03-01.lifecycle-rule/filter :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01.lifecycle-rule/transitions :portkey.aws.s3.-2006-03-01/id :portkey.aws.s3.-2006-03-01/noncurrent-version-expiration :portkey.aws.s3.-2006-03-01/abort-incomplete-multipart-upload :portkey.aws.s3.-2006-03-01.lifecycle-rule/noncurrent-version-transitions :portkey.aws.s3.-2006-03-01.lifecycle-rule/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/parts (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/part))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-tagging-request/bucket :portkey.aws.s3.-2006-03-01.put-object-tagging-request/key :portkey.aws.s3.-2006-03-01/tagging] :opt-un [:portkey.aws.s3.-2006-03-01.put-object-tagging-request/version-id :portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/accept-ranges (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-accelerate-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-accelerate-configuration-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-status #{"REPLICA" :pending :replica "PENDING" "COMPLETE" "FAILED" :complete :failed})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-policy-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/policy-status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-encryption-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-replication-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01.analytics-and-operator/tags]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lambda-function-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/lambda-function-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/source-selection-criteria (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/access-control-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/grants :portkey.aws.s3.-2006-03-01/owner]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.destination/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.destination/account (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/account-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.destination/bucket] :opt-un [:portkey.aws.s3.-2006-03-01.destination/account :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/access-control-translation :portkey.aws.s3.-2006-03-01/encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/max-parts clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.public-access-block-configuration/block-public-acls (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/setting))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.public-access-block-configuration/ignore-public-acls (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/setting))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.public-access-block-configuration/block-public-policy (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/setting))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.public-access-block-configuration/restrict-public-buckets (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/setting))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/public-access-block-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.public-access-block-configuration/block-public-acls :portkey.aws.s3.-2006-03-01.public-access-block-configuration/ignore-public-acls :portkey.aws.s3.-2006-03-01.public-access-block-configuration/block-public-policy :portkey.aws.s3.-2006-03-01.public-access-block-configuration/restrict-public-buckets]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-public-access-block-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-public-access-block-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expiration-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bytes-returned clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/object))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-copy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-copy-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-copy-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-part-copy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.upload-part-copy-request/bucket :portkey.aws.s3.-2006-03-01/copy-source :portkey.aws.s3.-2006-03-01.upload-part-copy-request/key :portkey.aws.s3.-2006-03-01/part-number :portkey.aws.s3.-2006-03-01.upload-part-copy-request/upload-id] :opt-un [:portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-key :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/copy-source-if-match :portkey.aws.s3.-2006-03-01/copy-source-range :portkey.aws.s3.-2006-03-01/copy-source-if-none-match :portkey.aws.s3.-2006-03-01/copy-source-if-modified-since :portkey.aws.s3.-2006-03-01/copy-source-if-unmodified-since :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-algorithm :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-objects-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-objects-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-objects-request/bucket :portkey.aws.s3.-2006-03-01/delete] :opt-un [:portkey.aws.s3.-2006-03-01/mfa :portkey.aws.s3.-2006-03-01/request-payer :portkey.aws.s3.-2006-03-01/bypass-governance-retention]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/filter-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-read (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-legal-hold-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-output/continuation-token :portkey.aws.s3.-2006-03-01/inventory-configuration-list :portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-output/next-continuation-token]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-s-3-bucket-destination/format (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-s-3-export-file-format))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-s-3-bucket-destination/bucket-account-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/account-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-s-3-bucket-destination/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-s-3-bucket-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.analytics-s-3-bucket-destination/format :portkey.aws.s3.-2006-03-01.analytics-s-3-bucket-destination/bucket] :opt-un [:portkey.aws.s3.-2006-03-01.analytics-s-3-bucket-destination/bucket-account-id :portkey.aws.s3.-2006-03-01/prefix]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/inventory-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-part-number-marker clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-output/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-output/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-output/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-parts-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-parts-output/bucket :portkey.aws.s3.-2006-03-01/parts :portkey.aws.s3.-2006-03-01/abort-date :portkey.aws.s3.-2006-03-01/max-parts :portkey.aws.s3.-2006-03-01/next-part-number-marker :portkey.aws.s3.-2006-03-01.list-parts-output/key :portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01/abort-rule-id :portkey.aws.s3.-2006-03-01/part-number-marker :portkey.aws.s3.-2006-03-01/owner :portkey.aws.s3.-2006-03-01.list-parts-output/upload-id :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/initiator]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/noncurrent-version-transition-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/noncurrent-version-transition))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/event-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/event))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption #{:awskms :aes-256 "aws:kms" "AES256"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-request/tagging (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.copy-object-request/bucket :portkey.aws.s3.-2006-03-01/copy-source :portkey.aws.s3.-2006-03-01.copy-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/tagging-directive :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-key :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/metadata-directive :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/copy-source-if-match :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01.copy-object-request/acl :portkey.aws.s3.-2006-03-01/copy-source-if-none-match :portkey.aws.s3.-2006-03-01/copy-source-if-modified-since :portkey.aws.s3.-2006-03-01/copy-source-if-unmodified-since :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-algorithm :portkey.aws.s3.-2006-03-01/object-lock-legal-hold-status :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control :portkey.aws.s3.-2006-03-01.copy-object-request/tagging :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/object-lock-retain-until-date :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/object-lock-mode :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-logging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-logging-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-modified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/mfa (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-legal-hold-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-legal-hold-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-legal-hold-request/legal-hold (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-legal-hold))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-legal-hold-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-legal-hold-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-legal-hold-request/bucket :portkey.aws.s3.-2006-03-01.put-object-legal-hold-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.put-object-legal-hold-request/legal-hold :portkey.aws.s3.-2006-03-01/request-payer :portkey.aws.s3.-2006-03-01.put-object-legal-hold-request/version-id :portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/event #{"s3:ObjectRestore:Completed" :s-3-object-removed-delete "s3:ObjectCreated:*" :s-3-object-created-copy :s-3-object-restore-post "s3:ObjectRemoved:Delete" :s-3-object-created-complete-multipart-upload "s3:ObjectRemoved:*" "s3:ObjectRemoved:DeleteMarkerCreated" :s-3-object-created-put :s-3-object-restore-completed "s3:ObjectCreated:Copy" :s-3-object-removed "s3:ObjectCreated:Post" "s3:ObjectCreated:CompleteMultipartUpload" "s3:ReducedRedundancyLostObject" "s3:ObjectRestore:Post" :s-3-object-created "s3:ObjectCreated:Put" :s-3-object-created-post :s-3-object-removed-delete-marker-created :s-3-reduced-redundancy-lost-object})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-canned-acl #{"authenticated-read" "public-read-write" :private "private" :publicread :publicreadwrite "public-read" :authenticatedread})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quote-character (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-request-type #{"SELECT" :select})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/end-event (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quiet clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-disposition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.error-document/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/error-document (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.error-document/key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bypass-governance-retention clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/redirect (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/host-name :portkey.aws.s3.-2006-03-01/http-redirect-code :portkey.aws.s3.-2006-03-01/protocol :portkey.aws.s3.-2006-03-01/replace-key-prefix-with :portkey.aws.s3.-2006-03-01/replace-key-with]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/head-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/missing-meta :portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01.head-object-output/version-id :portkey.aws.s3.-2006-03-01/accept-ranges :portkey.aws.s3.-2006-03-01/replication-status :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01/restore :portkey.aws.s3.-2006-03-01/content-length :portkey.aws.s3.-2006-03-01/last-modified :portkey.aws.s3.-2006-03-01/parts-count :portkey.aws.s3.-2006-03-01/object-lock-legal-hold-status :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/delete-marker :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/object-lock-retain-until-date :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/object-lock-mode :portkey.aws.s3.-2006-03-01/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/bytes-scanned :portkey.aws.s3.-2006-03-01/bytes-processed :portkey.aws.s3.-2006-03-01/bytes-returned]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.output-serialization/csv (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/csv-output))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.output-serialization/json (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/json-output))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/output-serialization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.output-serialization/csv :portkey.aws.s3.-2006-03-01.output-serialization/json]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/priority clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-logs-permission #{"WRITE" "FULL_CONTROL" :read :write "READ" :full-control})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-cors-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/cors-rules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-if-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/http-error-code-returned-equals (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/user-metadata (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/metadata-entry))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-website-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/redirect-all-requests-to :portkey.aws.s3.-2006-03-01/index-document :portkey.aws.s3.-2006-03-01/error-document :portkey.aws.s3.-2006-03-01/routing-rules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/part-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/logging-enabled (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/target-bucket :portkey.aws.s3.-2006-03-01/target-prefix] :opt-un [:portkey.aws.s3.-2006-03-01/target-grants]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/destination (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-destination))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/included-object-versions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-included-object-versions))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/optional-fields (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-optional-fields))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/schedule (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-schedule))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.inventory-configuration/destination :portkey.aws.s3.-2006-03-01/is-enabled :portkey.aws.s3.-2006-03-01.inventory-configuration/id :portkey.aws.s3.-2006-03-01.inventory-configuration/included-object-versions :portkey.aws.s3.-2006-03-01.inventory-configuration/schedule] :opt-un [:portkey.aws.s3.-2006-03-01.inventory-configuration/filter :portkey.aws.s3.-2006-03-01.inventory-configuration/optional-fields]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-methods (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/allowed-method))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/e-tag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.restore-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.restore-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.restore-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.restore-object-request/bucket :portkey.aws.s3.-2006-03-01.restore-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.restore-object-request/version-id :portkey.aws.s3.-2006-03-01/restore-request :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-storage-class #{:standard-ia "GLACIER" :glacier "ONEZONE_IA" :reduced-redundancy "STANDARD_IA" :intelligent-tiering "STANDARD" :standard "INTELLIGENT_TIERING" "REDUCED_REDUNDANCY" :onezone-ia})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/contents (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-objects-v-2-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/key-count :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/start-after :portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/common-prefixes :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/contents :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/continuation-token :portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/next-continuation-token :portkey.aws.s3.-2006-03-01.list-objects-v-2-output/name :portkey.aws.s3.-2006-03-01/max-keys]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/max-uploads clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-rule-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rule-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01.replication-rule-and-operator/tags]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/owner-override #{"Destination" :destination})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/multipart-upload-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-replication-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete/objects (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete/objects] :opt-un [:portkey.aws.s3.-2006-03-01/quiet]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/tagging (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.create-multipart-upload-request/bucket :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/acl :portkey.aws.s3.-2006-03-01/object-lock-legal-hold-status :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/tagging :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/object-lock-retain-until-date :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/object-lock-mode :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-output/payload (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/select-object-content-event-stream))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/select-object-content-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.select-object-content-output/payload]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-logging-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/logging-enabled]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.stats-event/details (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/stats))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/stats-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.stats-event/details]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-versioning-status #{"Suspended" "Enabled" :suspended :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/head-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.head-object-request/bucket :portkey.aws.s3.-2006-03-01.head-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/if-unmodified-since :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01.head-object-request/version-id :portkey.aws.s3.-2006-03-01/if-modified-since :portkey.aws.s3.-2006-03-01/part-number :portkey.aws.s3.-2006-03-01/range :portkey.aws.s3.-2006-03-01/if-match :portkey.aws.s3.-2006-03-01/if-none-match :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/is-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/no-such-upload (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-included-object-versions #{"Current" :all :current "All"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/no-such-bucket (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tag-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-by-default/sse-algorithm (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-by-default/kms-master-key-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/ssekms-key-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-by-default (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-by-default/sse-algorithm] :opt-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-by-default/kms-master-key-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/display-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.records-event/payload (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/body))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/records-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.records-event/payload]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cors-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/allowed-methods :portkey.aws.s3.-2006-03-01/allowed-origins] :opt-un [:portkey.aws.s3.-2006-03-01/allowed-headers :portkey.aws.s3.-2006-03-01/expose-headers :portkey.aws.s3.-2006-03-01/max-age-seconds]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/grantee :portkey.aws.s3.-2006-03-01/permission]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cors-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/cors-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/default-retention]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/initiated clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-accelerate-configuration-output/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-accelerate-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-bucket-accelerate-configuration-output/status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-object-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-object-versions-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/key-marker :portkey.aws.s3.-2006-03-01/max-keys :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/version-id-marker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-notification-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-notification-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-notification-configuration-request/bucket :portkey.aws.s3.-2006-03-01/notification-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-length clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/topic-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/topic-arn :portkey.aws.s3.-2006-03-01.topic-configuration/events] :opt-un [:portkey.aws.s3.-2006-03-01.topic-configuration/id :portkey.aws.s3.-2006-03-01.topic-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/is-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.progress-event/details (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/progress))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/progress-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.progress-event/details]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-objects-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-objects-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/marker :portkey.aws.s3.-2006-03-01/max-keys :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/field-delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-s-3-bucket-destination/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-s-3-bucket-destination/format (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-format))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-s-3-bucket-destination/encryption (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-encryption))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-s-3-bucket-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.inventory-s-3-bucket-destination/bucket :portkey.aws.s3.-2006-03-01.inventory-s-3-bucket-destination/format] :opt-un [:portkey.aws.s3.-2006-03-01/account-id :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01.inventory-s-3-bucket-destination/encryption]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-metrics-configuration-request/bucket :portkey.aws.s3.-2006-03-01.put-bucket-metrics-configuration-request/id :portkey.aws.s3.-2006-03-01/metrics-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/csv-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/quote-fields :portkey.aws.s3.-2006-03-01/quote-escape-character :portkey.aws.s3.-2006-03-01/record-delimiter :portkey.aws.s3.-2006-03-01/field-delimiter :portkey.aws.s3.-2006-03-01/quote-character]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metadata-entry/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metadata-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metadata-entry/value (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metadata-value))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.metadata-entry/name :portkey.aws.s3.-2006-03-01.metadata-entry/value]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-object-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/last-modified]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-if-none-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-website-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-frequency #{"Daily" :daily "Weekly" :weekly})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-request/continuation-token]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expose-headers (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/expose-header))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/transition-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/transition))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-filter/and (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/tag :portkey.aws.s3.-2006-03-01.analytics-filter/and]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/restore-output-path]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-policy-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-s-3-export-file-format #{"CSV" :csv})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/version-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-method (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-accelerate-status #{"Suspended" "Enabled" :suspended :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/protocol #{"https" "http" :http :https})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-public-access-block-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-public-access-block-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-replication-request/bucket :portkey.aws.s3.-2006-03-01/replication-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/missing-meta :portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01.get-object-output/version-id :portkey.aws.s3.-2006-03-01/body :portkey.aws.s3.-2006-03-01/content-range :portkey.aws.s3.-2006-03-01/accept-ranges :portkey.aws.s3.-2006-03-01/replication-status :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01/restore :portkey.aws.s3.-2006-03-01/tag-count :portkey.aws.s3.-2006-03-01/content-length :portkey.aws.s3.-2006-03-01/last-modified :portkey.aws.s3.-2006-03-01/parts-count :portkey.aws.s3.-2006-03-01/object-lock-legal-hold-status :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/delete-marker :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/object-lock-retain-until-date :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/object-lock-mode :portkey.aws.s3.-2006-03-01/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-rule/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/replication-rule-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-rule/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/replication-rule-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.replication-rule/status :portkey.aws.s3.-2006-03-01/destination] :opt-un [:portkey.aws.s3.-2006-03-01/id :portkey.aws.s3.-2006-03-01/priority :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01.replication-rule/filter :portkey.aws.s3.-2006-03-01/source-selection-criteria :portkey.aws.s3.-2006-03-01/delete-marker-replication]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/redirect-all-requests-to (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/host-name] :opt-un [:portkey.aws.s3.-2006-03-01/protocol]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-multipart-uploads-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-multipart-uploads-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-multipart-uploads-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/key-marker :portkey.aws.s3.-2006-03-01/max-uploads :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/upload-id-marker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-cors-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/bucket :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/key :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/upload-id] :opt-un [:portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/target-grants (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/target-grant))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/buckets (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/bucket))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-torrent-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-torrent-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-torrent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-torrent-request/bucket :portkey.aws.s3.-2006-03-01.get-object-torrent-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.completed-multipart-upload/parts (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/completed-part-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/completed-multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.completed-multipart-upload/parts]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/json-type #{"DOCUMENT" :lines :document "LINES"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.filter-rule/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/filter-rule-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.filter-rule/value (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/filter-rule-value))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.filter-rule/name :portkey.aws.s3.-2006-03-01.filter-rule/value]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/replication-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.s-3-key-filter/filter-rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/filter-rule-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/s-3-key-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.s-3-key-filter/filter-rules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/parts-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/complete-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/bucket :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/version-id :portkey.aws.s3.-2006-03-01/location :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/key :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-analytics-configuration-request/bucket :portkey.aws.s3.-2006-03-01.put-bucket-analytics-configuration-request/id :portkey.aws.s3.-2006-03-01/analytics-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-rule-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/target-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-acl-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-acl-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-acl-request/bucket :portkey.aws.s3.-2006-03-01.get-object-acl-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-acl-request/version-id :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration-deprecated/topic-configuration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/topic-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration-deprecated/queue-configuration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/queue-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.notification-configuration-deprecated/topic-configuration :portkey.aws.s3.-2006-03-01.notification-configuration-deprecated/queue-configuration :portkey.aws.s3.-2006-03-01/cloud-function-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-tagging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.delete-object-tagging-output/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-if-modified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-metrics-configuration-request/bucket :portkey.aws.s3.-2006-03-01.delete-bucket-metrics-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replace-key-with (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/kms-context (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-acl-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/part (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/part-number :portkey.aws.s3.-2006-03-01/last-modified :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/size]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/part-number-marker clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration-filter/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/s-3-key-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/notification-configuration-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.notification-configuration-filter/key]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-location-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-location-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-location-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-part-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/owner :portkey.aws.s3.-2006-03-01/grants]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/topic-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/suffix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-rule-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01.lifecycle-rule-and-operator/tags]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-inventory-configuration-request/bucket :portkey.aws.s3.-2006-03-01.put-bucket-inventory-configuration-request/id :portkey.aws.s3.-2006-03-01/inventory-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-request/bucket :portkey.aws.s3.-2006-03-01.get-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/response-expires :portkey.aws.s3.-2006-03-01/if-unmodified-since :portkey.aws.s3.-2006-03-01/response-content-disposition :portkey.aws.s3.-2006-03-01/response-content-language :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01.get-object-request/version-id :portkey.aws.s3.-2006-03-01/response-content-type :portkey.aws.s3.-2006-03-01/if-modified-since :portkey.aws.s3.-2006-03-01/part-number :portkey.aws.s3.-2006-03-01/range :portkey.aws.s3.-2006-03-01/if-match :portkey.aws.s3.-2006-03-01/response-content-encoding :portkey.aws.s3.-2006-03-01/if-none-match :portkey.aws.s3.-2006-03-01/request-payer :portkey.aws.s3.-2006-03-01/response-cache-control]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-configuration-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-tagging-output (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/tag-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-tagging-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-tagging-request/bucket :portkey.aws.s3.-2006-03-01/tagging] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.rule/expiration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-expiration))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.rule/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/expiration-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01.rule/status] :opt-un [:portkey.aws.s3.-2006-03-01.rule/expiration :portkey.aws.s3.-2006-03-01/id :portkey.aws.s3.-2006-03-01/transition :portkey.aws.s3.-2006-03-01/noncurrent-version-transition :portkey.aws.s3.-2006-03-01/noncurrent-version-expiration :portkey.aws.s3.-2006-03-01/abort-incomplete-multipart-upload]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-bucket-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.create-bucket-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01/create-bucket-configuration :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01.create-bucket-request/acl :portkey.aws.s3.-2006-03-01/object-lock-enabled-for-bucket :portkey.aws.s3.-2006-03-01/grant-write :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/routing-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/redirect] :opt-un [:portkey.aws.s3.-2006-03-01/condition]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.noncurrent-version-expiration/noncurrent-days (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/days))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/noncurrent-version-expiration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.noncurrent-version-expiration/noncurrent-days]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-analytics-configuration-request/bucket :portkey.aws.s3.-2006-03-01.delete-bucket-analytics-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/location-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-policy-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-marker-replication/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-marker-replication-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-replication (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.delete-marker-replication/status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/select-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/input-serialization :portkey.aws.s3.-2006-03-01/expression-type :portkey.aws.s3.-2006-03-01/expression :portkey.aws.s3.-2006-03-01/output-serialization] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-enabled-for-bucket clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-configuration-output/rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-rules))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-configuration-output/rules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tagging-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-version-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.ssekms/key-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/ssekms-key-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/ssekms (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.ssekms/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.deleted-object/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.deleted-object/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/deleted-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.deleted-object/key :portkey.aws.s3.-2006-03-01.deleted-object/version-id :portkey.aws.s3.-2006-03-01/delete-marker :portkey.aws.s3.-2006-03-01/delete-marker-version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/enable-request-progress clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-incomplete-multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/days-after-initiation]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-location-output/location-constraint (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-location-constraint))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-location-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-bucket-location-output/location-constraint]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/inventory-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.request-progress/enabled (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/enable-request-progress))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/request-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.request-progress/enabled]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-versioning-output/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-versioning-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-versioning-output/mfa-delete (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/mfa-delete-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-versioning-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-bucket-versioning-output/status :portkey.aws.s3.-2006-03-01.get-bucket-versioning-output/mfa-delete]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.s-3-location/prefix (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/location-prefix))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.s-3-location/canned-acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.s-3-location/access-control-list (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/grants))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/s-3-location (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/bucket-name :portkey.aws.s3.-2006-03-01.s-3-location/prefix] :opt-un [:portkey.aws.s3.-2006-03-01/encryption :portkey.aws.s3.-2006-03-01.s-3-location/canned-acl :portkey.aws.s3.-2006-03-01.s-3-location/access-control-list :portkey.aws.s3.-2006-03-01/tagging :portkey.aws.s3.-2006-03-01/user-metadata :portkey.aws.s3.-2006-03-01/storage-class]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-if-unmodified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-public-access-block-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-public-access-block-request/bucket :portkey.aws.s3.-2006-03-01/public-access-block-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/http-redirect-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/uri (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-canned-acl #{"authenticated-read" :bucketownerfullcontrol "public-read-write" :private "bucket-owner-full-control" "private" :bucketownerread :publicread "aws-exec-read" :publicreadwrite :awsexecread "bucket-owner-read" "public-read" :authenticatedread})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-optional-fields (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/inventory-optional-field))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/owner (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/display-name :portkey.aws.s3.-2006-03-01/id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rule-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/days clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-identifier/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-identifier/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-identifier (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.object-identifier/key] :opt-un [:portkey.aws.s3.-2006-03-01.object-identifier/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-write (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.storage-class-analysis-data-export/output-schema-version (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/storage-class-analysis-schema-version))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.storage-class-analysis-data-export/destination (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-export-destination))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class-analysis-data-export (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.storage-class-analysis-data-export/output-schema-version :portkey.aws.s3.-2006-03-01.storage-class-analysis-data-export/destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bytes-scanned clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-part-copy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/copy-source-version-id :portkey.aws.s3.-2006-03-01/copy-part-result :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-policy-request/bucket :portkey.aws.s3.-2006-03-01/policy] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5 :portkey.aws.s3.-2006-03-01/confirm-remove-self-bucket-access]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-buckets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/buckets :portkey.aws.s3.-2006-03-01/owner]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/expiration :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01.put-object-output/version-id :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bytes-processed clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/owner :portkey.aws.s3.-2006-03-01/grants :portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/stats (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/bytes-scanned :portkey.aws.s3.-2006-03-01/bytes-processed :portkey.aws.s3.-2006-03-01/bytes-returned]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quote-escape-character (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cors-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/cors-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-legal-hold-status #{"ON" :off :on "OFF"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-object-tagging-request/bucket :portkey.aws.s3.-2006-03-01.delete-object-tagging-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.delete-object-tagging-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-key-md-5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata (clojure.spec.alpha/map-of :portkey.aws.s3.-2006-03-01/metadata-key :portkey.aws.s3.-2006-03-01/metadata-value))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cache-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.bucket-lifecycle-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-rules))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-lifecycle-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.bucket-lifecycle-configuration/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-encryption-request/bucket :portkey.aws.s3.-2006-03-01/server-side-encryption-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-output/continuation-token :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-output/next-continuation-token :portkey.aws.s3.-2006-03-01/analytics-configuration-list]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/object-identifier))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-already-in-active-tier-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-version-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/object-version))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/policy]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-v-2-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-v-2-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-objects-v-2-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-objects-v-2-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/start-after :portkey.aws.s3.-2006-03-01.list-objects-v-2-request/continuation-token :portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01/fetch-owner :portkey.aws.s3.-2006-03-01/max-keys :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-lock-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-lock-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-lock-configuration-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-cors-request/bucket :portkey.aws.s3.-2006-03-01/cors-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/policy (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-policy-status-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-policy-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-policy-status-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-accelerate-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-accelerate-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-accelerate-configuration-request/bucket :portkey.aws.s3.-2006-03-01/accelerate-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.encryption/encryption-type (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.encryption/kms-key-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/ssekms-key-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.encryption/encryption-type] :opt-un [:portkey.aws.s3.-2006-03-01.encryption/kms-key-id :portkey.aws.s3.-2006-03-01/kms-context]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-write-acp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.tag/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.tag/key :portkey.aws.s3.-2006-03-01/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/http-error-code-returned-equals :portkey.aws.s3.-2006-03-01/key-prefix-equals]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/fetch-owner clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expression-type #{:sql "SQL"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-full-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.error/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.error/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.error/key :portkey.aws.s3.-2006-03-01.error/version-id :portkey.aws.s3.-2006-03-01/code :portkey.aws.s3.-2006-03-01/message]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-inventory-configuration-request/bucket :portkey.aws.s3.-2006-03-01.delete-bucket-inventory-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-inventory-configuration-request/bucket :portkey.aws.s3.-2006-03-01.get-bucket-inventory-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-encoding (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-version/storage-class (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-version/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-version/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/size :portkey.aws.s3.-2006-03-01.object-version/storage-class :portkey.aws.s3.-2006-03-01.object-version/key :portkey.aws.s3.-2006-03-01.object-version/version-id :portkey.aws.s3.-2006-03-01/is-latest :portkey.aws.s3.-2006-03-01/last-modified :portkey.aws.s3.-2006-03-01/owner]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-configuration-request/lifecycle-configuration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-lifecycle-configuration))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-configuration-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-configuration-request/lifecycle-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/select-object-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.select-object-content-request/bucket :portkey.aws.s3.-2006-03-01.select-object-content-request/key :portkey.aws.s3.-2006-03-01/expression :portkey.aws.s3.-2006-03-01/expression-type :portkey.aws.s3.-2006-03-01/input-serialization :portkey.aws.s3.-2006-03-01/output-serialization] :opt-un [:portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/request-progress]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/target-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-version-storage-class #{"STANDARD" :standard})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/website-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/error-document :portkey.aws.s3.-2006-03-01/index-document :portkey.aws.s3.-2006-03-01/redirect-all-requests-to :portkey.aws.s3.-2006-03-01/routing-rules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-marker-entry/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-marker-entry/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/owner :portkey.aws.s3.-2006-03-01.delete-marker-entry/key :portkey.aws.s3.-2006-03-01.delete-marker-entry/version-id :portkey.aws.s3.-2006-03-01/is-latest :portkey.aws.s3.-2006-03-01/last-modified]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-tagging-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/server-side-encryption-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration/topic-configurations (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/topic-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration/queue-configurations (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/queue-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration/lambda-function-configurations (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lambda-function-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/notification-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.notification-configuration/topic-configurations :portkey.aws.s3.-2006-03-01.notification-configuration/queue-configurations :portkey.aws.s3.-2006-03-01.notification-configuration/lambda-function-configurations]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-retention-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/queue-arn :portkey.aws.s3.-2006-03-01.queue-configuration/events] :opt-un [:portkey.aws.s3.-2006-03-01.queue-configuration/id :portkey.aws.s3.-2006-03-01.queue-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tagging (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/tag-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/policy-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/is-public]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/host-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-none-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-output-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class #{:standard-ia "GLACIER" :glacier "ONEZONE_IA" :reduced-redundancy "STANDARD_IA" :intelligent-tiering "STANDARD" :standard "INTELLIGENT_TIERING" "REDUCED_REDUNDANCY" :onezone-ia})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-rule/apply-server-side-encryption-by-default (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption-by-default))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-rule/apply-server-side-encryption-by-default]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-expiration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/date :portkey.aws.s3.-2006-03-01/days :portkey.aws.s3.-2006-03-01/expired-object-delete-marker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/analytics-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-legal-hold-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-legal-hold-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-legal-hold-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-legal-hold-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-legal-hold-request/bucket :portkey.aws.s3.-2006-03-01.get-object-legal-hold-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-legal-hold-request/version-id :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-public-access-block-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/public-access-block-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-website-request/bucket :portkey.aws.s3.-2006-03-01/website-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-format #{"CSV" :csv :orc "ORC" :parquet "Parquet"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/queue-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/no-such-key (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grantee (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/type] :opt-un [:portkey.aws.s3.-2006-03-01/display-name :portkey.aws.s3.-2006-03-01/email-address :portkey.aws.s3.-2006-03-01/id :portkey.aws.s3.-2006-03-01/uri]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/key-prefix-equals (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/copy-source-version-id :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01.copy-object-output/version-id :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/copy-object-result :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/file-header-info #{"USE" :use :ignore "NONE" "IGNORE" :none})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-request/continuation-token]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.output-location/s-3 (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/s-3-location))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/output-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.output-location/s-3]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-headers (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/allowed-header))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/years clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-origins (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/allowed-origin))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\/.+\/.+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/queue (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/queue-arn))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/id :portkey.aws.s3.-2006-03-01/event :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/events :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/queue]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/request-charged #{"requester" :requester})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/metrics-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expires clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/max-keys clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/lifecycle-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/initiator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/id :portkey.aws.s3.-2006-03-01/display-name]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sses-3 (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/max-age-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/email-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-retain-until-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-location-constraint #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :apsoutheast-2 "ap-southeast-2" "EU" "cn-north-1" "sa-east-1" "ap-southeast-1" :cnnorth-1 "eu-central-1" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-west-1" "ap-south-1" :euwest-1 :uswest-2 :eu})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-analytics-configuration-request/bucket :portkey.aws.s3.-2006-03-01.get-bucket-analytics-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/ssekms-key-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-origin (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-not-in-active-tier-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.accelerate-configuration/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-accelerate-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/accelerate-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.accelerate-configuration/status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-mode #{"GOVERNANCE" :governance "COMPLIANCE" :compliance})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lambda-function-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/lambda-function-arn :portkey.aws.s3.-2006-03-01.lambda-function-configuration/events] :opt-un [:portkey.aws.s3.-2006-03-01.lambda-function-configuration/id :portkey.aws.s3.-2006-03-01.lambda-function-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.default-retention/mode (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-retention-mode))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/default-retention (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.default-retention/mode :portkey.aws.s3.-2006-03-01/days :portkey.aws.s3.-2006-03-01/years]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/csv-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/file-header-info :portkey.aws.s3.-2006-03-01/comments :portkey.aws.s3.-2006-03-01/quote-escape-character :portkey.aws.s3.-2006-03-01/record-delimiter :portkey.aws.s3.-2006-03-01/field-delimiter :portkey.aws.s3.-2006-03-01/quote-character :portkey.aws.s3.-2006-03-01/allow-quoted-record-delimiter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/is-latest clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-part-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.upload-part-request/bucket :portkey.aws.s3.-2006-03-01.upload-part-request/key :portkey.aws.s3.-2006-03-01/part-number :portkey.aws.s3.-2006-03-01.upload-part-request/upload-id] :opt-un [:portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/content-md-5 :portkey.aws.s3.-2006-03-01/body :portkey.aws.s3.-2006-03-01/content-length :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.noncurrent-version-transition/noncurrent-days (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/days))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.noncurrent-version-transition/storage-class (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/transition-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/noncurrent-version-transition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.noncurrent-version-transition/noncurrent-days :portkey.aws.s3.-2006-03-01.noncurrent-version-transition/storage-class]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quote-fields #{:asneeded "ALWAYS" "ASNEEDED" :always})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/index-document (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/suffix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/key-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/common-prefix (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/prefix]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-upload-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/parquet-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.analytics-configuration/id :portkey.aws.s3.-2006-03-01/storage-class-analysis] :opt-un [:portkey.aws.s3.-2006-03-01.analytics-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expiration (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-acl-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-acl-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5 :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/access-control-policy :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01.put-bucket-acl-request/acl :portkey.aws.s3.-2006-03-01/grant-write :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cloud-function (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-request/continuation-token]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/request-payer #{"requester" :requester})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-lock-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-lock-configuration-request/token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-lock-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-lock-configuration-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01/object-lock-configuration :portkey.aws.s3.-2006-03-01/request-payer :portkey.aws.s3.-2006-03-01.put-object-lock-configuration-request/token :portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-cache-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-markers (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/delete-marker-entry))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-replication-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/replication-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.sse-kms-encrypted-objects/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.sse-kms-encrypted-objects/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-retention-mode #{"GOVERNANCE" :governance "COMPLIANCE" :compliance})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-retention-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-retention-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-retention-request/retention (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-retention))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-retention-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-retention-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-retention-request/bucket :portkey.aws.s3.-2006-03-01.put-object-retention-request/key] :opt-un [:portkey.aws.s3.-2006-03-01.put-object-retention-request/retention :portkey.aws.s3.-2006-03-01/request-payer :portkey.aws.s3.-2006-03-01.put-object-retention-request/version-id :portkey.aws.s3.-2006-03-01/bypass-governance-retention :portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-lock-retention/mode (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-lock-retention-mode))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-lock-retention/retain-until-date (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/date))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-lock-retention (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.object-lock-retention/mode :portkey.aws.s3.-2006-03-01.object-lock-retention/retain-until-date]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/errors (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/error))

(clojure.core/defn delete-bucket "Deletes the bucket. All objects (including all object versions and Delete\nMarkers) in the bucket must be deleted before the bucket itself can be deleted." ([delete-bucket-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-request delete-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucket", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-logging "Returns the logging status of a bucket and the permissions users have to view\nand modify that status. To use GET, you must be the bucket owner." ([get-bucket-logging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-logging-request get-bucket-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-logging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?logging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-logging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketLogging", :http.request.configuration/output-deser-fn response-get-bucket-logging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-logging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-logging-output))

(clojure.core/defn list-bucket-metrics-configurations "Lists the metrics configurations for the bucket." ([list-bucket-metrics-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-bucket-metrics-configurations-request list-bucket-metrics-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBucketMetricsConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-metrics-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-metrics-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-output))

(clojure.core/defn delete-bucket-lifecycle "Deletes the lifecycle configuration from the bucket." ([delete-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-lifecycle-request delete-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketLifecycle", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-lifecycle-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-policy "Returns the policy of a specified bucket." ([get-bucket-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-policy-request get-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketPolicy", :http.request.configuration/output-deser-fn response-get-bucket-policy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-policy-output))

(clojure.core/defn put-bucket-versioning "Sets the versioning state of an existing bucket. To set the versioning state,\nyou must be the bucket owner." ([put-bucket-versioning-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-versioning-request put-bucket-versioning-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versioning", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-versioning-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketVersioning", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-versioning :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-versioning-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-policy-status "Retrieves the policy status for an Amazon S3 bucket, indicating whether the\nbucket is public." ([get-bucket-policy-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-policy-status-request get-bucket-policy-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-policy-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policyStatus", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-policy-status-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketPolicyStatus", :http.request.configuration/output-deser-fn response-get-bucket-policy-status-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-policy-status :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-policy-status-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-policy-status-output))

(clojure.core/defn list-object-versions "Returns metadata about all of the versions of objects in a bucket." ([list-object-versions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-object-versions-request list-object-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-object-versions-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versions", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-object-versions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectVersions", :http.request.configuration/output-deser-fn response-list-object-versions-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-object-versions :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-object-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-object-versions-output))

(clojure.core/defn get-bucket-inventory-configuration "Returns an inventory configuration (identified by the inventory ID) from the\nbucket." ([get-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-inventory-configuration-request get-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketInventoryConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-inventory-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-output))

(clojure.core/defn put-bucket-encryption "Creates a new server-side encryption configuration (or replaces an existing one,\nif present)." ([put-bucket-encryption-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-encryption-request put-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketEncryption", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-encryption-request) :ret clojure.core/true?)

(clojure.core/defn delete-object-tagging "Removes the tag-set from an existing object." ([delete-object-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-object-tagging-request delete-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteObjectTagging", :http.request.configuration/output-deser-fn response-delete-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-object-tagging-output))

(clojure.core/defn get-object-tagging "Returns the tag-set of an object." ([get-object-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-tagging-request get-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectTagging", :http.request.configuration/output-deser-fn response-get-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-tagging-output))

(clojure.core/defn get-bucket-replication "Returns the replication configuration of a bucket.\n It can take a while to propagate the put or delete a replication configuration\nto all Amazon S3 systems. Therefore, a get request soon after put or delete can\nreturn a wrong result." ([get-bucket-replication-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-replication-request get-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-replication-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketReplication", :http.request.configuration/output-deser-fn response-get-bucket-replication-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-replication-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-replication-output))

(clojure.core/defn put-bucket-replication " Creates a replication configuration or replaces an existing one. For more\ninformation, see Cross-Region Replication (CRR)\n(https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) in the Amazon S3\nDeveloper Guide." ([put-bucket-replication-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-replication-request put-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketReplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-replication-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-analytics-configuration "Deletes an analytics configuration for the bucket (specified by the analytics\nconfiguration ID)." ([delete-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-analytics-configuration-request delete-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-analytics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-notification-configuration "Returns the notification configuration of a bucket." ([get-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-notification-configuration-request get-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/notification-configuration, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketNotificationConfiguration", :http.request.configuration/output-deser-fn response-notification-configuration, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration))

(clojure.core/defn get-bucket-request-payment "Returns the request payment configuration of a bucket." ([get-bucket-request-payment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-request-payment-request get-bucket-request-payment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?requestPayment", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketRequestPayment", :http.request.configuration/output-deser-fn response-get-bucket-request-payment-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-request-payment :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-output))

(clojure.core/defn put-object-retention "Places an Object Retention configuration on an object." ([put-object-retention-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-retention-request put-object-retention-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-retention-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?retention", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-retention-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectRetention", :http.request.configuration/output-deser-fn response-put-object-retention-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-retention :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-retention-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-retention-output))

(clojure.core/defn get-object-torrent "Return torrent files from a bucket." ([get-object-torrent-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-torrent-request get-object-torrent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-torrent-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?torrent", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-torrent-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectTorrent", :http.request.configuration/output-deser-fn response-get-object-torrent-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-torrent :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-torrent-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-torrent-output))

(clojure.core/defn list-objects "Returns some or all (up to 1000) of the objects in a bucket. You can use the\nrequest parameters as selection criteria to return a subset of the objects in a\nbucket." ([list-objects-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-objects-request list-objects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-objects-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjects", :http.request.configuration/output-deser-fn response-list-objects-output, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef list-objects :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-objects-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-objects-output))

(clojure.core/defn list-objects-v-2 "Returns some or all (up to 1000) of the objects in a bucket. You can use the\nrequest parameters as selection criteria to return a subset of the objects in a\nbucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you\nuse this revised API for new application development." ([list-objects-v-2-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-objects-v-2-request list-objects-v-2-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-objects-v-2-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?list-type=2", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-objects-v-2-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectsV2", :http.request.configuration/output-deser-fn response-list-objects-v-2-output, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef list-objects-v-2 :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-objects-v-2-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-objects-v-2-output))

(clojure.core/defn list-bucket-inventory-configurations "Returns a list of inventory configurations for the bucket." ([list-bucket-inventory-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-bucket-inventory-configurations-request list-bucket-inventory-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBucketInventoryConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-inventory-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-inventory-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-output))

(clojure.core/defn delete-bucket-cors "Deletes the CORS configuration information set for the bucket." ([delete-bucket-cors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-cors-request delete-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketCors", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-cors-request) :ret clojure.core/true?)

(clojure.core/defn put-object "Adds an object to a bucket." ([put-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-request put-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObject", :http.request.configuration/output-deser-fn response-put-object-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-output))

(clojure.core/defn list-multipart-uploads "This operation lists in-progress multipart uploads." ([list-multipart-uploads-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-multipart-uploads-request list-multipart-uploads-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-multipart-uploads-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?uploads", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-multipart-uploads-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMultipartUploads", :http.request.configuration/output-deser-fn response-list-multipart-uploads-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-multipart-uploads :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-multipart-uploads-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-multipart-uploads-output))

(clojure.core/defn put-bucket-lifecycle-configuration "Sets lifecycle configuration for your bucket. If a lifecycle configuration\nexists, it replaces it." ([put-bucket-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-lifecycle-configuration-request put-bucket-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketLifecycleConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-configuration-request) :ret clojure.core/true?)

(clojure.core/defn head-bucket "This operation is useful to determine if a bucket exists and you have permission\nto access it." ([head-bucket-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-head-bucket-request head-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/head-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "HeadBucket", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef head-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/head-bucket-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-inventory-configuration "Adds an inventory configuration (identified by the inventory ID) from the\nbucket." ([put-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-inventory-configuration-request put-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketInventoryConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-inventory-configuration-request) :ret clojure.core/true?)

(clojure.core/defn create-bucket "Creates a new bucket." ([create-bucket-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-bucket-request create-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/create-bucket-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/create-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBucket", :http.request.configuration/output-deser-fn response-create-bucket-output, :http.request.spec/error-spec {"BucketAlreadyExists" :portkey.aws.s3.-2006-03-01/bucket-already-exists, "BucketAlreadyOwnedByYou" :portkey.aws.s3.-2006-03-01/bucket-already-owned-by-you}})))))
(clojure.spec.alpha/fdef create-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/create-bucket-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/create-bucket-output))

(clojure.core/defn put-object-acl "uses the acl subresource to set the access control list (ACL) permissions for an\nobject that already exists in a bucket" ([put-object-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-acl-request put-object-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectAcl", :http.request.configuration/output-deser-fn response-put-object-acl-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef put-object-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-acl-output))

(clojure.core/defn get-object-retention "Retrieves an object's retention settings." ([get-object-retention-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-retention-request get-object-retention-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-retention-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?retention", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-retention-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectRetention", :http.request.configuration/output-deser-fn response-get-object-retention-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-retention :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-retention-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-retention-output))

(clojure.core/defn put-bucket-notification "Deprecated, see the PutBucketNotificationConfiguraiton operation." ([put-bucket-notification-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-notification-request put-bucket-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-notification-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketNotification", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-notification :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-notification-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-analytics-configuration "Gets an analytics configuration for the bucket (specified by the analytics\nconfiguration ID)." ([get-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-analytics-configuration-request get-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-analytics-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-output))

(clojure.core/defn complete-multipart-upload "Completes a multipart upload by assembling previously uploaded parts." ([complete-multipart-upload-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-complete-multipart-upload-request complete-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/complete-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/complete-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CompleteMultipartUpload", :http.request.configuration/output-deser-fn response-complete-multipart-upload-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef complete-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/complete-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/complete-multipart-upload-output))

(clojure.core/defn abort-multipart-upload "Aborts a multipart upload.\n To verify that all parts have been removed, so you don't get charged for the\npart storage, you should call the List Parts operation and ensure the parts list\nis empty." ([abort-multipart-upload-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-abort-multipart-upload-request abort-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/abort-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AbortMultipartUpload", :http.request.configuration/output-deser-fn response-abort-multipart-upload-output, :http.request.spec/error-spec {"NoSuchUpload" :portkey.aws.s3.-2006-03-01/no-such-upload}})))))
(clojure.spec.alpha/fdef abort-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/abort-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output))

(clojure.core/defn put-bucket-request-payment "Sets the request payment configuration for a bucket. By default, the bucket\nowner pays for downloads from the bucket. This configuration parameter enables\nthe bucket owner (only) to specify that the person requesting the download will\nbe charged for the download. Documentation on requester pays buckets can be\nfound at\nhttp://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html" ([put-bucket-request-payment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-request-payment-request put-bucket-request-payment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?requestPayment", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-request-payment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketRequestPayment", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-request-payment :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-request-payment-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-analytics-configuration "Sets an analytics configuration for the bucket (specified by the analytics\nconfiguration ID)." ([put-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-analytics-configuration-request put-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-analytics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn restore-object "Restores an archived copy of an object back into Amazon S3" ([restore-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-restore-object-request restore-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/restore-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?restore", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/restore-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreObject", :http.request.configuration/output-deser-fn response-restore-object-output, :http.request.spec/error-spec {"ObjectAlreadyInActiveTierError" :portkey.aws.s3.-2006-03-01/object-already-in-active-tier-error}})))))
(clojure.spec.alpha/fdef restore-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/restore-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/restore-object-output))

(clojure.core/defn get-bucket-tagging "Returns the tag set associated with the bucket." ([get-bucket-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-tagging-request get-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketTagging", :http.request.configuration/output-deser-fn response-get-bucket-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-tagging-output))

(clojure.core/defn get-bucket-notification "Deprecated, see the GetBucketNotificationConfiguration operation." ([get-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-notification-configuration-request get-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketNotification", :http.request.configuration/output-deser-fn response-notification-configuration-deprecated, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-notification :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated))

(clojure.core/defn head-object "The HEAD operation retrieves metadata from an object without returning the\nobject itself. This operation is useful if you're only interested in an object's\nmetadata. To use HEAD, you must have READ access to the object." ([head-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-head-object-request head-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/head-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/head-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "HeadObject", :http.request.configuration/output-deser-fn response-head-object-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef head-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/head-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/head-object-output))

(clojure.core/defn delete-public-access-block "Removes the PublicAccessBlock configuration from an Amazon S3 bucket." ([delete-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-public-access-block-request delete-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?publicAccessBlock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePublicAccessBlock", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-public-access-block-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-website "This operation removes the website configuration from the bucket." ([delete-bucket-website-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-website-request delete-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketWebsite", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-website-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-website "Returns the website configuration for a bucket." ([get-bucket-website-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-website-request get-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-website-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketWebsite", :http.request.configuration/output-deser-fn response-get-bucket-website-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-website-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-website-output))

(clojure.core/defn delete-bucket-replication " Deletes the replication configuration from the bucket. For information about\nreplication configuration, see Cross-Region Replication (CRR)\n(https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) in the Amazon S3\nDeveloper Guide." ([delete-bucket-replication-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-replication-request delete-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketReplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-replication-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-metrics-configuration "Deletes a metrics configuration (specified by the metrics configuration ID) from\nthe bucket." ([delete-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-metrics-configuration-request delete-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketMetricsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-metrics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn put-object-tagging "Sets the supplied tag-set to an object that already exists in a bucket" ([put-object-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-tagging-request put-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectTagging", :http.request.configuration/output-deser-fn response-put-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-tagging-output))

(clojure.core/defn put-object-legal-hold "Applies a Legal Hold configuration to the specified object." ([put-object-legal-hold-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-legal-hold-request put-object-legal-hold-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-legal-hold-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?legal-hold", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-legal-hold-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectLegalHold", :http.request.configuration/output-deser-fn response-put-object-legal-hold-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-legal-hold :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-legal-hold-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-legal-hold-output))

(clojure.core/defn list-buckets "Returns a list of all buckets owned by the authenticated sender of the request." ([] (list-buckets {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-buckets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec nil, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBuckets", :http.request.configuration/output-deser-fn response-list-buckets-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-buckets :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-buckets-output))

(clojure.core/defn put-bucket-policy "Replaces a policy on a bucket. If the bucket already has a policy, the one in\nthis request completely replaces it." ([put-bucket-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-policy-request put-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-policy-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-accelerate-configuration "Sets the accelerate configuration of an existing bucket." ([put-bucket-accelerate-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-accelerate-configuration-request put-bucket-accelerate-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?accelerate", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-accelerate-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketAccelerateConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-accelerate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-accelerate-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-acl "Gets the access control policy for the bucket." ([get-bucket-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-acl-request get-bucket-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketAcl", :http.request.configuration/output-deser-fn response-get-bucket-acl-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-acl-output))

(clojure.core/defn get-bucket-metrics-configuration "Gets a metrics configuration (specified by the metrics configuration ID) from\nthe bucket." ([get-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-metrics-configuration-request get-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketMetricsConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-metrics-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-output))

(clojure.core/defn get-object-lock-configuration "Gets the Object Lock configuration for a bucket. The rule specified in the\nObject Lock configuration will be applied by default to every new object placed\nin the specified bucket." ([get-object-lock-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-lock-configuration-request get-object-lock-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-lock-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?object-lock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-lock-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectLockConfiguration", :http.request.configuration/output-deser-fn response-get-object-lock-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-lock-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-lock-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-lock-configuration-output))

(clojure.core/defn get-bucket-cors "Returns the CORS configuration for the bucket." ([get-bucket-cors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-cors-request get-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-cors-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketCors", :http.request.configuration/output-deser-fn response-get-bucket-cors-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-cors-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-cors-output))

(clojure.core/defn create-multipart-upload "Initiates a multipart upload and returns an upload ID.\n Note: After you initiate multipart upload and upload one or more parts, you\nmust either complete or abort multipart upload in order to stop getting charged\nfor storage of the uploaded parts. Only after you either complete or abort\nmultipart upload, Amazon S3 frees up the parts storage and stops charging you\nfor the parts storage." ([create-multipart-upload-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-multipart-upload-request create-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/create-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?uploads", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/create-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMultipartUpload", :http.request.configuration/output-deser-fn response-create-multipart-upload-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/create-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/create-multipart-upload-output))

(clojure.core/defn delete-object "Removes the null version (if there is one) of an object and inserts a delete\nmarker, which becomes the latest version of the object. If there isn't a null\nversion, Amazon S3 does not remove any objects." ([delete-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-object-request delete-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteObject", :http.request.configuration/output-deser-fn response-delete-object-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-object-output))

(clojure.core/defn get-public-access-block "Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket." ([get-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-public-access-block-request get-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-public-access-block-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?publicAccessBlock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicAccessBlock", :http.request.configuration/output-deser-fn response-get-public-access-block-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-public-access-block-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-public-access-block-output))

(clojure.core/defn put-bucket-metrics-configuration "Sets a metrics configuration (specified by the metrics configuration ID) for the\nbucket." ([put-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-metrics-configuration-request put-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketMetricsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-metrics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-accelerate-configuration "Returns the accelerate configuration of a bucket." ([get-bucket-accelerate-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-accelerate-configuration-request get-bucket-accelerate-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?accelerate", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketAccelerateConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-accelerate-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-accelerate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-output))

(clojure.core/defn delete-bucket-tagging "Deletes the tags from the bucket." ([delete-bucket-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-tagging-request delete-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketTagging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-tagging-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-tagging "Sets the tags for a bucket." ([put-bucket-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-tagging-request put-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketTagging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-tagging-request) :ret clojure.core/true?)

(clojure.core/defn list-parts "Lists the parts that have been uploaded for a specific multipart upload." ([list-parts-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-parts-request list-parts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-parts-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-parts-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListParts", :http.request.configuration/output-deser-fn response-list-parts-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-parts :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-parts-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-parts-output))

(clojure.core/defn get-object-acl "Returns the access control list (ACL) of an object." ([get-object-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-acl-request get-object-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectAcl", :http.request.configuration/output-deser-fn response-get-object-acl-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef get-object-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-acl-output))

(clojure.core/defn upload-part-copy "Uploads a part by copying data from an existing object as data source." ([upload-part-copy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-upload-part-copy-request upload-part-copy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/upload-part-copy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/upload-part-copy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadPartCopy", :http.request.configuration/output-deser-fn response-upload-part-copy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef upload-part-copy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/upload-part-copy-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/upload-part-copy-output))

(clojure.core/defn get-bucket-lifecycle-configuration "Returns the lifecycle configuration information set on the bucket." ([get-bucket-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-lifecycle-configuration-request get-bucket-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketLifecycleConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-lifecycle-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-output))

(clojure.core/defn delete-objects "This operation enables you to delete multiple objects from a bucket using a\nsingle HTTP request. You may specify up to 1000 keys." ([delete-objects-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-objects-request delete-objects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?delete", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-objects-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteObjects", :http.request.configuration/output-deser-fn response-delete-objects-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-objects :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-objects-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-objects-output))

(clojure.core/defn delete-bucket-inventory-configuration "Deletes an inventory configuration (identified by the inventory ID) from the\nbucket." ([delete-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-inventory-configuration-request delete-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketInventoryConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-inventory-configuration-request) :ret clojure.core/true?)

(clojure.core/defn put-object-lock-configuration "Places an Object Lock configuration on the specified bucket. The rule specified\nin the Object Lock configuration will be applied by default to every new object\nplaced in the specified bucket." ([put-object-lock-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-lock-configuration-request put-object-lock-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-lock-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?object-lock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-lock-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectLockConfiguration", :http.request.configuration/output-deser-fn response-put-object-lock-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-lock-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-lock-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-lock-configuration-output))

(clojure.core/defn put-bucket-website "Set the website configuration for a bucket." ([put-bucket-website-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-website-request put-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketWebsite", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-website-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-location "Returns the region the bucket resides in." ([get-bucket-location-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-location-request get-bucket-location-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-location-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?location", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-location-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketLocation", :http.request.configuration/output-deser-fn response-get-bucket-location-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-location :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-location-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-location-output))

(clojure.core/defn get-bucket-encryption "Returns the server-side encryption configuration of a bucket." ([get-bucket-encryption-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-encryption-request get-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-encryption-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketEncryption", :http.request.configuration/output-deser-fn response-get-bucket-encryption-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-encryption-output))

(clojure.core/defn upload-part "Uploads a part in a multipart upload.\n Note: After you initiate multipart upload and upload one or more parts, you\nmust either complete or abort multipart upload in order to stop getting charged\nfor storage of the uploaded parts. Only after you either complete or abort\nmultipart upload, Amazon S3 frees up the parts storage and stops charging you\nfor the parts storage." ([upload-part-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-upload-part-request upload-part-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/upload-part-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/upload-part-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadPart", :http.request.configuration/output-deser-fn response-upload-part-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef upload-part :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/upload-part-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/upload-part-output))

(clojure.core/defn get-bucket-lifecycle "Deprecated, see the GetBucketLifecycleConfiguration operation." ([get-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-lifecycle-request get-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketLifecycle", :http.request.configuration/output-deser-fn response-get-bucket-lifecycle-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-output))

(clojure.core/defn get-object-legal-hold "Gets an object's current Legal Hold status." ([get-object-legal-hold-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-legal-hold-request get-object-legal-hold-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-legal-hold-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?legal-hold", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-legal-hold-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectLegalHold", :http.request.configuration/output-deser-fn response-get-object-legal-hold-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-legal-hold :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-legal-hold-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-legal-hold-output))

(clojure.core/defn copy-object "Creates a copy of an object that is already stored in Amazon S3." ([copy-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-copy-object-request copy-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/copy-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/copy-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CopyObject", :http.request.configuration/output-deser-fn response-copy-object-output, :http.request.spec/error-spec {"ObjectNotInActiveTierError" :portkey.aws.s3.-2006-03-01/object-not-in-active-tier-error}})))))
(clojure.spec.alpha/fdef copy-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/copy-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/copy-object-output))

(clojure.core/defn put-bucket-lifecycle "Deprecated, see the PutBucketLifecycleConfiguration operation." ([put-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-lifecycle-request put-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketLifecycle", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-notification-configuration "Enables notifications of specified events for a bucket." ([put-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-notification-configuration-request put-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketNotificationConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-notification-configuration-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-policy "Deletes the policy from the bucket." ([delete-bucket-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-policy-request delete-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-bucket-analytics-configurations "Lists the analytics configurations for the bucket." ([list-bucket-analytics-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-bucket-analytics-configurations-request list-bucket-analytics-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBucketAnalyticsConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-analytics-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-analytics-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-output))

(clojure.core/defn get-bucket-versioning "Returns the versioning state of a bucket." ([get-bucket-versioning-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-versioning-request get-bucket-versioning-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-versioning-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versioning", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-versioning-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketVersioning", :http.request.configuration/output-deser-fn response-get-bucket-versioning-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-versioning :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-versioning-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-versioning-output))

(clojure.core/defn put-bucket-cors "Sets the CORS configuration for a bucket." ([put-bucket-cors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-cors-request put-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketCors", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-cors-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-encryption "Deletes the server-side encryption configuration from the bucket." ([delete-bucket-encryption-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-encryption-request delete-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketEncryption", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-encryption-request) :ret clojure.core/true?)

(clojure.core/defn select-object-content "This operation filters the contents of an Amazon S3 object based on a simple\nStructured Query Language (SQL) statement. In the request, along with the SQL\nexpression, you must also specify a data serialization format (JSON or CSV) of\nthe object. Amazon S3 uses this to parse object data into records, and returns\nonly records that match the specified SQL expression. You must also specify the\ndata serialization format for the response." ([select-object-content-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-select-object-content-request select-object-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/select-object-content-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?select&select-type=2", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/select-object-content-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SelectObjectContent", :http.request.configuration/output-deser-fn response-select-object-content-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef select-object-content :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/select-object-content-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/select-object-content-output))

(clojure.core/defn get-object "Retrieves objects from Amazon S3." ([get-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-request get-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObject", :http.request.configuration/output-deser-fn response-get-object-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef get-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-output))

(clojure.core/defn put-public-access-block "Creates or modifies the PublicAccessBlock configuration for an Amazon S3 bucket." ([put-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-public-access-block-request put-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?publicAccessBlock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutPublicAccessBlock", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-public-access-block-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-logging "Set the logging parameters for a bucket and to specify permissions for who can\nview and modify the logging parameters. To set the logging status of a bucket,\nyou must be the bucket owner." ([put-bucket-logging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-logging-request put-bucket-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?logging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-logging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketLogging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-logging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-logging-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-acl "Sets the permissions on a bucket using access control lists (ACL)." ([put-bucket-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-acl-request put-bucket-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketAcl", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-acl-request) :ret clojure.core/true?)
