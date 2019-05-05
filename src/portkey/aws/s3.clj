(ns portkey.aws.s3 (:require [portkey.aws]))

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

(clojure.core/defn- deser-bucket [input] (clojure.core/let [letvar1606941 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CreationDate" (portkey.aws/search-for-tag input "CreationDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1606941 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar1606941 ["Name" :content]))) (letvar1606941 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar1606941 ["CreationDate" :content]))))))

(clojure.core/defn- deser-metrics-configuration [input] (clojure.core/let [letvar1607049 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-metrics-id (clojure.core/get-in letvar1607049 ["Id" :content]))} (letvar1607049 "Filter") (clojure.core/assoc :filter (deser-metrics-filter (clojure.core/get-in letvar1607049 ["Filter" :content]))))))

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

(clojure.core/defn- deser-continuation-event [input] (clojure.core/let [letvar1607275 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-object-lock-enabled [input] (clojure.core/get {"Enabled" :enabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-mfa-delete-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-filter-rule-name [input] (clojure.core/get {"prefix" :prefix, "suffix" :suffix} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-inventory-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-topic-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-topic-configuration (:content coll)))) input))

(clojure.core/defn- deser-access-control-translation [input] (clojure.core/let [letvar1607420 {"Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:owner (deser-owner-override (clojure.core/get-in letvar1607420 ["Owner" :content]))})))

(clojure.core/defn- deser-topic-configuration-deprecated [input] (clojure.core/let [letvar1607528 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? nil :xmlAttribute? nil), "Topic" (portkey.aws/search-for-tag input "Topic" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1607528 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1607528 ["Id" :content]))) (letvar1607528 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar1607528 ["Event"]))) (letvar1607528 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar1607528 ["Event" :content]))) (letvar1607528 "Topic") (clojure.core/assoc :topic (deser-topic-arn (clojure.core/get-in letvar1607528 ["Topic" :content]))))))

(clojure.core/defn- deser-object-lock-legal-hold [input] (clojure.core/let [letvar1607636 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1607636 "Status") (clojure.core/assoc :status (deser-object-lock-legal-hold-status (clojure.core/get-in letvar1607636 ["Status" :content]))))))

(clojure.core/defn- deser-website-redirect-location [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-prefix [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-type [input] (clojure.core/get {"CanonicalUser" :canonical-user, "AmazonCustomerByEmail" :amazon-customer-by-email, "Group" :group} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-copy-source-version-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-storage-class-analysis-schema-version [input] (clojure.core/get {"V_1" :v-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-encoding-type [input] (clojure.core/get {"url" :url} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-sse-kms-encrypted-objects-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-next-key-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-encryption-configuration [input] (clojure.core/let [letvar1607784 {"ReplicaKmsKeyID" (portkey.aws/search-for-tag input "ReplicaKmsKeyID" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1607784 "ReplicaKmsKeyID") (clojure.core/assoc :replica-kms-key-id (deser-replica-kms-key-id (clojure.core/get-in letvar1607784 ["ReplicaKmsKeyID" :content]))))))

(clojure.core/defn- deser-inventory-filter [input] (clojure.core/let [letvar1607892 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:prefix (deser-prefix (clojure.core/get-in letvar1607892 ["Prefix" :content]))})))

(clojure.core/defn- deser-cloud-function-configuration [input] (clojure.core/let [letvar1608000 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "CloudFunction" (portkey.aws/search-for-tag input "CloudFunction" :flattened? nil :xmlAttribute? nil), "InvocationRole" (portkey.aws/search-for-tag input "InvocationRole" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1608000 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1608000 ["Id" :content]))) (letvar1608000 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar1608000 ["Event" :content]))) (letvar1608000 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar1608000 ["Event"]))) (letvar1608000 "CloudFunction") (clojure.core/assoc :cloud-function (deser-cloud-function (clojure.core/get-in letvar1608000 ["CloudFunction" :content]))) (letvar1608000 "InvocationRole") (clojure.core/assoc :invocation-role (deser-cloud-function-invocation-role (clojure.core/get-in letvar1608000 ["InvocationRole" :content]))))))

(clojure.core/defn- deser-inventory-optional-field [input] (clojure.core/get {"LastModifiedDate" :last-modified-date, "ReplicationStatus" :replication-status, "EncryptionStatus" :encryption-status, "ETag" :e-tag, "Size" :size, "ObjectLockLegalHoldStatus" :object-lock-legal-hold-status, "IsMultipartUploaded" :is-multipart-uploaded, "StorageClass" :storage-class, "ObjectLockRetainUntilDate" :object-lock-retain-until-date, "ObjectLockMode" :object-lock-mode} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-permission [input] (clojure.core/get {"FULL_CONTROL" :full-control, "WRITE" :write, "WRITE_ACP" :write-acp, "READ" :read, "READ_ACP" :read-acp} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-select-object-content-event-stream [input] (clojure.core/let [letvar1608118 {"Records" (portkey.aws/search-for-tag input "Records" :flattened? nil :xmlAttribute? nil), "Stats" (portkey.aws/search-for-tag input "Stats" :flattened? nil :xmlAttribute? nil), "Progress" (portkey.aws/search-for-tag input "Progress" :flattened? nil :xmlAttribute? nil), "Cont" (portkey.aws/search-for-tag input "Cont" :flattened? nil :xmlAttribute? nil), "End" (portkey.aws/search-for-tag input "End" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1608118 "Records") (clojure.core/assoc :records (deser-records-event (clojure.core/get-in letvar1608118 ["Records" :content]))) (letvar1608118 "Stats") (clojure.core/assoc :stats (deser-stats-event (clojure.core/get-in letvar1608118 ["Stats" :content]))) (letvar1608118 "Progress") (clojure.core/assoc :progress (deser-progress-event (clojure.core/get-in letvar1608118 ["Progress" :content]))) (letvar1608118 "Cont") (clojure.core/assoc :cont (deser-continuation-event (clojure.core/get-in letvar1608118 ["Cont" :content]))) (letvar1608118 "End") (clojure.core/assoc :end (deser-end-event (clojure.core/get-in letvar1608118 ["End" :content]))))))

(clojure.core/defn- deser-server-side-encryption-configuration [input] (clojure.core/let [letvar1608226 {"Rule" (portkey.aws/search-for-tag input "Rule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:rules (deser-server-side-encryption-rules (clojure.core/get-in letvar1608226 ["Rule"]))})))

(clojure.core/defn- deser-target-grant [input] (clojure.core/let [letvar1608334 {"Grantee" (portkey.aws/search-for-tag input "Grantee" :flattened? nil :xmlAttribute? nil), "Permission" (portkey.aws/search-for-tag input "Permission" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1608334 "Grantee") (clojure.core/assoc :grantee (deser-grantee (clojure.core/get-in letvar1608334 ["Grantee" :content]))) (letvar1608334 "Permission") (clojure.core/assoc :permission (deser-bucket-logs-permission (clojure.core/get-in letvar1608334 ["Permission" :content]))))))

(clojure.core/defn- deser-replication-configuration [input] (clojure.core/let [letvar1608442 {"Role" (portkey.aws/search-for-tag input "Role" :flattened? nil :xmlAttribute? nil), "Rule" (portkey.aws/search-for-tag input "Rule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:role (deser-role (clojure.core/get-in letvar1608442 ["Role" :content])), :rules (deser-replication-rules (clojure.core/get-in letvar1608442 ["Rule"]))})))

(clojure.core/defn- deser-is-public [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-sse-customer-algorithm [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-schedule [input] (clojure.core/let [letvar1608557 {"Frequency" (portkey.aws/search-for-tag input "Frequency" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:frequency (deser-inventory-frequency (clojure.core/get-in letvar1608557 ["Frequency" :content]))})))

(clojure.core/defn- deser-transition [input] (clojure.core/let [letvar1608665 {"Date" (portkey.aws/search-for-tag input "Date" :flattened? nil :xmlAttribute? nil), "Days" (portkey.aws/search-for-tag input "Days" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1608665 "Date") (clojure.core/assoc :date (deser-date (clojure.core/get-in letvar1608665 ["Date" :content]))) (letvar1608665 "Days") (clojure.core/assoc :days (deser-days (clojure.core/get-in letvar1608665 ["Days" :content]))) (letvar1608665 "StorageClass") (clojure.core/assoc :storage-class (deser-transition-storage-class (clojure.core/get-in letvar1608665 ["StorageClass" :content]))))))

(clojure.core/defn- deser-multipart-upload [input] (clojure.core/let [letvar1608773 {"UploadId" (portkey.aws/search-for-tag input "UploadId" :flattened? nil :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Initiated" (portkey.aws/search-for-tag input "Initiated" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil), "Initiator" (portkey.aws/search-for-tag input "Initiator" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1608773 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar1608773 ["UploadId" :content]))) (letvar1608773 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1608773 ["Key" :content]))) (letvar1608773 "Initiated") (clojure.core/assoc :initiated (deser-initiated (clojure.core/get-in letvar1608773 ["Initiated" :content]))) (letvar1608773 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1608773 ["StorageClass" :content]))) (letvar1608773 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1608773 ["Owner" :content]))) (letvar1608773 "Initiator") (clojure.core/assoc :initiator (deser-initiator (clojure.core/get-in letvar1608773 ["Initiator" :content]))))))

(clojure.core/defn- deser-analytics-export-destination [input] (clojure.core/let [letvar1608881 {"S3BucketDestination" (portkey.aws/search-for-tag input "S3BucketDestination" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:s-3-bucket-destination (deser-analytics-s-3-bucket-destination (clojure.core/get-in letvar1608881 ["S3BucketDestination" :content]))})))

(clojure.core/defn- deser-storage-class-analysis [input] (clojure.core/let [letvar1608989 {"DataExport" (portkey.aws/search-for-tag input "DataExport" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1608989 "DataExport") (clojure.core/assoc :data-export (deser-storage-class-analysis-data-export (clojure.core/get-in letvar1608989 ["DataExport" :content]))))))

(clojure.core/defn- deser-expose-header [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-body [input] input)

(clojure.core/defn- deser-delete-marker-replication-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-object [input] (clojure.core/let [letvar1609109 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil), "ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1609109 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1609109 ["Key" :content]))) (letvar1609109 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1609109 ["LastModified" :content]))) (letvar1609109 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1609109 ["ETag" :content]))) (letvar1609109 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar1609109 ["Size" :content]))) (letvar1609109 "StorageClass") (clojure.core/assoc :storage-class (deser-object-storage-class (clojure.core/get-in letvar1609109 ["StorageClass" :content]))) (letvar1609109 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1609109 ["Owner" :content]))))))

(clojure.core/defn- deser-grants [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-grant coll))) input))

(clojure.core/defn- deser-transition-storage-class [input] (clojure.core/get {"GLACIER" :glacier, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia, "INTELLIGENT_TIERING" :intelligent-tiering} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lifecycle-rule-filter [input] (clojure.core/let [letvar1609239 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1609239 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1609239 ["Prefix" :content]))) (letvar1609239 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar1609239 ["Tag" :content]))) (letvar1609239 "And") (clojure.core/assoc :and (deser-lifecycle-rule-and-operator (clojure.core/get-in letvar1609239 ["And" :content]))))))

(clojure.core/defn- deser-payer [input] (clojure.core/get {"Requester" :requester, "BucketOwner" :bucket-owner} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metrics-filter [input] (clojure.core/let [letvar1609352 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1609352 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1609352 ["Prefix" :content]))) (letvar1609352 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar1609352 ["Tag" :content]))) (letvar1609352 "And") (clojure.core/assoc :and (deser-metrics-and-operator (clojure.core/get-in letvar1609352 ["And" :content]))))))

(clojure.core/defn- deser-inventory-destination [input] (clojure.core/let [letvar1609460 {"S3BucketDestination" (portkey.aws/search-for-tag input "S3BucketDestination" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:s-3-bucket-destination (deser-inventory-s-3-bucket-destination (clojure.core/get-in letvar1609460 ["S3BucketDestination" :content]))})))

(clojure.core/defn- deser-object-version-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-days-after-initiation [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-copy-part-result [input] (clojure.core/let [letvar1609575 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1609575 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1609575 ["ETag" :content]))) (letvar1609575 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1609575 ["LastModified" :content]))))))

(clojure.core/defn- deser-replication-rule-filter [input] (clojure.core/let [letvar1609683 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1609683 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1609683 ["Prefix" :content]))) (letvar1609683 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar1609683 ["Tag" :content]))) (letvar1609683 "And") (clojure.core/assoc :and (deser-replication-rule-and-operator (clojure.core/get-in letvar1609683 ["And" :content]))))))

(clojure.core/defn- deser-deleted-objects [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deleted-object (:content coll)))) input))

(clojure.core/defn- deser-start-after [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-encryption [input] (clojure.core/let [letvar1609813 {"SSE-S3" (portkey.aws/search-for-tag input "SSE-S3" :flattened? nil :xmlAttribute? nil), "SSE-KMS" (portkey.aws/search-for-tag input "SSE-KMS" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1609813 "SSE-S3") (clojure.core/assoc :sses-3 (deser-sses-3 (clojure.core/get-in letvar1609813 ["SSE-S3" :content]))) (letvar1609813 "SSE-KMS") (clojure.core/assoc :ssekms (deser-ssekms (clojure.core/get-in letvar1609813 ["SSE-KMS" :content]))))))

(clojure.core/defn- deser-replace-key-prefix-with [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-content-range [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metrics-and-operator [input] (clojure.core/let [letvar1609931 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1609931 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1609931 ["Prefix" :content]))) (letvar1609931 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar1609931 ["Tag" :content]))))))

(clojure.core/defn- deser-object-lock-configuration [input] (clojure.core/let [letvar1610039 {"ObjectLockEnabled" (portkey.aws/search-for-tag input "ObjectLockEnabled" :flattened? nil :xmlAttribute? nil), "Rule" (portkey.aws/search-for-tag input "Rule" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1610039 "ObjectLockEnabled") (clojure.core/assoc :object-lock-enabled (deser-object-lock-enabled (clojure.core/get-in letvar1610039 ["ObjectLockEnabled" :content]))) (letvar1610039 "Rule") (clojure.core/assoc :rule (deser-object-lock-rule (clojure.core/get-in letvar1610039 ["Rule" :content]))))))

(clojure.core/defn- deser-lifecycle-rule [input] (clojure.core/let [letvar1610147 {"Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Transition" (portkey.aws/search-for-tag input "Transition" :flattened? true :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "NoncurrentVersionExpiration" (portkey.aws/search-for-tag input "NoncurrentVersionExpiration" :flattened? nil :xmlAttribute? nil), "AbortIncompleteMultipartUpload" (portkey.aws/search-for-tag input "AbortIncompleteMultipartUpload" :flattened? nil :xmlAttribute? nil), "NoncurrentVersionTransition" (portkey.aws/search-for-tag input "NoncurrentVersionTransition" :flattened? true :xmlAttribute? nil), "Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-expiration-status (clojure.core/get-in letvar1610147 ["Status" :content]))} (letvar1610147 "Filter") (clojure.core/assoc :filter (deser-lifecycle-rule-filter (clojure.core/get-in letvar1610147 ["Filter" :content]))) (letvar1610147 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1610147 ["Prefix" :content]))) (letvar1610147 "Transition") (clojure.core/assoc :transitions (deser-transition-list (clojure.core/get-in letvar1610147 ["Transition"]))) (letvar1610147 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1610147 ["ID" :content]))) (letvar1610147 "NoncurrentVersionExpiration") (clojure.core/assoc :noncurrent-version-expiration (deser-noncurrent-version-expiration (clojure.core/get-in letvar1610147 ["NoncurrentVersionExpiration" :content]))) (letvar1610147 "AbortIncompleteMultipartUpload") (clojure.core/assoc :abort-incomplete-multipart-upload (deser-abort-incomplete-multipart-upload (clojure.core/get-in letvar1610147 ["AbortIncompleteMultipartUpload" :content]))) (letvar1610147 "NoncurrentVersionTransition") (clojure.core/assoc :noncurrent-version-transitions (deser-noncurrent-version-transition-list (clojure.core/get-in letvar1610147 ["NoncurrentVersionTransition"]))) (letvar1610147 "Expiration") (clojure.core/assoc :expiration (deser-lifecycle-expiration (clojure.core/get-in letvar1610147 ["Expiration" :content]))))))

(clojure.core/defn- deser-parts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-part (:content coll)))) input))

(clojure.core/defn- deser-abort-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-accept-ranges [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-replication-status [input] (clojure.core/get {"COMPLETE" :complete, "PENDING" :pending, "FAILED" :failed, "REPLICA" :replica} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-analytics-and-operator [input] (clojure.core/let [letvar1610289 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1610289 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1610289 ["Prefix" :content]))) (letvar1610289 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar1610289 ["Tag" :content]))))))

(clojure.core/defn- deser-lambda-function-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-configuration (:content coll)))) input))

(clojure.core/defn- deser-source-selection-criteria [input] (clojure.core/let [letvar1610414 {"SseKmsEncryptedObjects" (portkey.aws/search-for-tag input "SseKmsEncryptedObjects" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1610414 "SseKmsEncryptedObjects") (clojure.core/assoc :sse-kms-encrypted-objects (deser-sse-kms-encrypted-objects (clojure.core/get-in letvar1610414 ["SseKmsEncryptedObjects" :content]))))))

(clojure.core/defn- deser-destination [input] (clojure.core/let [letvar1610522 {"Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Account" (portkey.aws/search-for-tag input "Account" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil), "AccessControlTranslation" (portkey.aws/search-for-tag input "AccessControlTranslation" :flattened? nil :xmlAttribute? nil), "EncryptionConfiguration" (portkey.aws/search-for-tag input "EncryptionConfiguration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:bucket (deser-bucket-name (clojure.core/get-in letvar1610522 ["Bucket" :content]))} (letvar1610522 "Account") (clojure.core/assoc :account (deser-account-id (clojure.core/get-in letvar1610522 ["Account" :content]))) (letvar1610522 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1610522 ["StorageClass" :content]))) (letvar1610522 "AccessControlTranslation") (clojure.core/assoc :access-control-translation (deser-access-control-translation (clojure.core/get-in letvar1610522 ["AccessControlTranslation" :content]))) (letvar1610522 "EncryptionConfiguration") (clojure.core/assoc :encryption-configuration (deser-encryption-configuration (clojure.core/get-in letvar1610522 ["EncryptionConfiguration" :content]))))))

(clojure.core/defn- deser-max-parts [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-public-access-block-configuration [input] (clojure.core/let [letvar1610632 {"BlockPublicAcls" (portkey.aws/search-for-tag input "BlockPublicAcls" :flattened? nil :xmlAttribute? nil), "IgnorePublicAcls" (portkey.aws/search-for-tag input "IgnorePublicAcls" :flattened? nil :xmlAttribute? nil), "BlockPublicPolicy" (portkey.aws/search-for-tag input "BlockPublicPolicy" :flattened? nil :xmlAttribute? nil), "RestrictPublicBuckets" (portkey.aws/search-for-tag input "RestrictPublicBuckets" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1610632 "BlockPublicAcls") (clojure.core/assoc :block-public-acls (deser-setting (clojure.core/get-in letvar1610632 ["BlockPublicAcls" :content]))) (letvar1610632 "IgnorePublicAcls") (clojure.core/assoc :ignore-public-acls (deser-setting (clojure.core/get-in letvar1610632 ["IgnorePublicAcls" :content]))) (letvar1610632 "BlockPublicPolicy") (clojure.core/assoc :block-public-policy (deser-setting (clojure.core/get-in letvar1610632 ["BlockPublicPolicy" :content]))) (letvar1610632 "RestrictPublicBuckets") (clojure.core/assoc :restrict-public-buckets (deser-setting (clojure.core/get-in letvar1610632 ["RestrictPublicBuckets" :content]))))))

(clojure.core/defn- deser-expiration-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-location [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bytes-returned [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-object-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object (:content coll)))) input))

(clojure.core/defn- deser-metadata-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-filter-rule-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-filter-rule-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-filter-rule (:content coll)))) input))

(clojure.core/defn- deser-analytics-s-3-bucket-destination [input] (clojure.core/let [letvar1610796 {"Format" (portkey.aws/search-for-tag input "Format" :flattened? nil :xmlAttribute? nil), "BucketAccountId" (portkey.aws/search-for-tag input "BucketAccountId" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:format (deser-analytics-s-3-export-file-format (clojure.core/get-in letvar1610796 ["Format" :content])), :bucket (deser-bucket-name (clojure.core/get-in letvar1610796 ["Bucket" :content]))} (letvar1610796 "BucketAccountId") (clojure.core/assoc :bucket-account-id (deser-account-id (clojure.core/get-in letvar1610796 ["BucketAccountId" :content]))) (letvar1610796 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1610796 ["Prefix" :content]))))))

(clojure.core/defn- deser-inventory-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-inventory-configuration (:content coll)))) input))

(clojure.core/defn- deser-next-part-number-marker [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-noncurrent-version-transition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-noncurrent-version-transition (:content coll)))) input))

(clojure.core/defn- deser-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event (:content coll)))) input))

(clojure.core/defn- deser-server-side-encryption [input] (clojure.core/get {"AES256" :aes-256, "aws:kms" :awskms} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-event [input] (clojure.core/get {"s3:ObjectRestore:Completed" :s-3-object-restore-completed, "s3:ObjectCreated:*" :s-3-object-created, "s3:ObjectRemoved:Delete" :s-3-object-removed-delete, "s3:ObjectRemoved:*" :s-3-object-removed, "s3:ObjectRemoved:DeleteMarkerCreated" :s-3-object-removed-delete-marker-created, "s3:ObjectCreated:Copy" :s-3-object-created-copy, "s3:ObjectCreated:Post" :s-3-object-created-post, "s3:ObjectCreated:CompleteMultipartUpload" :s-3-object-created-complete-multipart-upload, "s3:ReducedRedundancyLostObject" :s-3-reduced-redundancy-lost-object, "s3:ObjectRestore:Post" :s-3-object-restore-post, "s3:ObjectCreated:Put" :s-3-object-created-put} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-end-event [input] (clojure.core/let [letvar1610967 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-content-disposition [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-error-document [input] (clojure.core/let [letvar1611080 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-object-key (clojure.core/get-in letvar1611080 ["Key" :content]))})))

(clojure.core/defn- deser-redirect [input] (clojure.core/let [letvar1611188 {"HostName" (portkey.aws/search-for-tag input "HostName" :flattened? nil :xmlAttribute? nil), "HttpRedirectCode" (portkey.aws/search-for-tag input "HttpRedirectCode" :flattened? nil :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "ReplaceKeyPrefixWith" (portkey.aws/search-for-tag input "ReplaceKeyPrefixWith" :flattened? nil :xmlAttribute? nil), "ReplaceKeyWith" (portkey.aws/search-for-tag input "ReplaceKeyWith" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1611188 "HostName") (clojure.core/assoc :host-name (deser-host-name (clojure.core/get-in letvar1611188 ["HostName" :content]))) (letvar1611188 "HttpRedirectCode") (clojure.core/assoc :http-redirect-code (deser-http-redirect-code (clojure.core/get-in letvar1611188 ["HttpRedirectCode" :content]))) (letvar1611188 "Protocol") (clojure.core/assoc :protocol (deser-protocol (clojure.core/get-in letvar1611188 ["Protocol" :content]))) (letvar1611188 "ReplaceKeyPrefixWith") (clojure.core/assoc :replace-key-prefix-with (deser-replace-key-prefix-with (clojure.core/get-in letvar1611188 ["ReplaceKeyPrefixWith" :content]))) (letvar1611188 "ReplaceKeyWith") (clojure.core/assoc :replace-key-with (deser-replace-key-with (clojure.core/get-in letvar1611188 ["ReplaceKeyWith" :content]))))))

(clojure.core/defn- deser-progress [input] (clojure.core/let [letvar1611296 {"BytesScanned" (portkey.aws/search-for-tag input "BytesScanned" :flattened? nil :xmlAttribute? nil), "BytesProcessed" (portkey.aws/search-for-tag input "BytesProcessed" :flattened? nil :xmlAttribute? nil), "BytesReturned" (portkey.aws/search-for-tag input "BytesReturned" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1611296 "BytesScanned") (clojure.core/assoc :bytes-scanned (deser-bytes-scanned (clojure.core/get-in letvar1611296 ["BytesScanned" :content]))) (letvar1611296 "BytesProcessed") (clojure.core/assoc :bytes-processed (deser-bytes-processed (clojure.core/get-in letvar1611296 ["BytesProcessed" :content]))) (letvar1611296 "BytesReturned") (clojure.core/assoc :bytes-returned (deser-bytes-returned (clojure.core/get-in letvar1611296 ["BytesReturned" :content]))))))

(clojure.core/defn- deser-next-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-priority [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-bucket-logs-permission [input] (clojure.core/get {"FULL_CONTROL" :full-control, "READ" :read, "WRITE" :write} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-analytics-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-http-error-code-returned-equals [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-upload-id-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-part-number [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-logging-enabled [input] (clojure.core/let [letvar1611433 {"TargetBucket" (portkey.aws/search-for-tag input "TargetBucket" :flattened? nil :xmlAttribute? nil), "TargetGrants" (portkey.aws/search-for-tag input "TargetGrants" :flattened? nil :xmlAttribute? nil), "TargetPrefix" (portkey.aws/search-for-tag input "TargetPrefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target-bucket (deser-target-bucket (clojure.core/get-in letvar1611433 ["TargetBucket" :content])), :target-prefix (deser-target-prefix (clojure.core/get-in letvar1611433 ["TargetPrefix" :content]))} (letvar1611433 "TargetGrants") (clojure.core/assoc :target-grants (deser-target-grants (clojure.core/get-in letvar1611433 ["TargetGrants" :content]))))))

(clojure.core/defn- deser-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-configuration [input] (clojure.core/let [letvar1611543 {"Destination" (portkey.aws/search-for-tag input "Destination" :flattened? nil :xmlAttribute? nil), "IsEnabled" (portkey.aws/search-for-tag input "IsEnabled" :flattened? nil :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "IncludedObjectVersions" (portkey.aws/search-for-tag input "IncludedObjectVersions" :flattened? nil :xmlAttribute? nil), "OptionalFields" (portkey.aws/search-for-tag input "OptionalFields" :flattened? nil :xmlAttribute? nil), "Schedule" (portkey.aws/search-for-tag input "Schedule" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:destination (deser-inventory-destination (clojure.core/get-in letvar1611543 ["Destination" :content])), :is-enabled (deser-is-enabled (clojure.core/get-in letvar1611543 ["IsEnabled" :content])), :id (deser-inventory-id (clojure.core/get-in letvar1611543 ["Id" :content])), :included-object-versions (deser-inventory-included-object-versions (clojure.core/get-in letvar1611543 ["IncludedObjectVersions" :content])), :schedule (deser-inventory-schedule (clojure.core/get-in letvar1611543 ["Schedule" :content]))} (letvar1611543 "Filter") (clojure.core/assoc :filter (deser-inventory-filter (clojure.core/get-in letvar1611543 ["Filter" :content]))) (letvar1611543 "OptionalFields") (clojure.core/assoc :optional-fields (deser-inventory-optional-fields (clojure.core/get-in letvar1611543 ["OptionalFields" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-method (:content coll)))) input))

(clojure.core/defn- deser-e-tag [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-storage-class [input] (clojure.core/get {"STANDARD" :standard, "REDUCED_REDUNDANCY" :reduced-redundancy, "GLACIER" :glacier, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia, "INTELLIGENT_TIERING" :intelligent-tiering} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-max-uploads [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-replication-rule-and-operator [input] (clojure.core/let [letvar1611680 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1611680 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1611680 ["Prefix" :content]))) (letvar1611680 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar1611680 ["Tag" :content]))))))

(clojure.core/defn- deser-metrics-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-owner-override [input] (clojure.core/get {"Destination" :destination} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-multipart-upload-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metadata-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-stats-event [input] (clojure.core/let [letvar1611808 {"Details" (portkey.aws/search-for-tag input "Details" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1611808 "Details") (clojure.core/assoc :details (deser-stats (clojure.core/get-in letvar1611808 ["Details" :content]))))))

(clojure.core/defn- deser-bucket-versioning-status [input] (clojure.core/get {"Enabled" :enabled, "Suspended" :suspended} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-content-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-is-truncated [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-inventory-included-object-versions [input] (clojure.core/get {"All" :all, "Current" :current} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-restore [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-role [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-server-side-encryption-by-default [input] (clojure.core/let [letvar1611945 {"SSEAlgorithm" (portkey.aws/search-for-tag input "SSEAlgorithm" :flattened? nil :xmlAttribute? nil), "KMSMasterKeyID" (portkey.aws/search-for-tag input "KMSMasterKeyID" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:sse-algorithm (deser-server-side-encryption (clojure.core/get-in letvar1611945 ["SSEAlgorithm" :content]))} (letvar1611945 "KMSMasterKeyID") (clojure.core/assoc :kms-master-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1611945 ["KMSMasterKeyID" :content]))))))

(clojure.core/defn- deser-display-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-records-event [input] (clojure.core/let [letvar1612058 {"Payload" (portkey.aws/search-for-tag input "Payload" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1612058 "Payload") (clojure.core/assoc :payload (deser-body (clojure.core/get-in letvar1612058 ["Payload" :content]))))))

(clojure.core/defn- deser-cors-rule [input] (clojure.core/let [letvar1612166 {"AllowedHeader" (portkey.aws/search-for-tag input "AllowedHeader" :flattened? true :xmlAttribute? nil), "AllowedMethod" (portkey.aws/search-for-tag input "AllowedMethod" :flattened? true :xmlAttribute? nil), "AllowedOrigin" (portkey.aws/search-for-tag input "AllowedOrigin" :flattened? true :xmlAttribute? nil), "ExposeHeader" (portkey.aws/search-for-tag input "ExposeHeader" :flattened? true :xmlAttribute? nil), "MaxAgeSeconds" (portkey.aws/search-for-tag input "MaxAgeSeconds" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:allowed-methods (deser-allowed-methods (clojure.core/get-in letvar1612166 ["AllowedMethod"])), :allowed-origins (deser-allowed-origins (clojure.core/get-in letvar1612166 ["AllowedOrigin"]))} (letvar1612166 "AllowedHeader") (clojure.core/assoc :allowed-headers (deser-allowed-headers (clojure.core/get-in letvar1612166 ["AllowedHeader"]))) (letvar1612166 "ExposeHeader") (clojure.core/assoc :expose-headers (deser-expose-headers (clojure.core/get-in letvar1612166 ["ExposeHeader"]))) (letvar1612166 "MaxAgeSeconds") (clojure.core/assoc :max-age-seconds (deser-max-age-seconds (clojure.core/get-in letvar1612166 ["MaxAgeSeconds" :content]))))))

(clojure.core/defn- deser-grant [input] (clojure.core/let [letvar1612274 {"Grantee" (portkey.aws/search-for-tag input "Grantee" :flattened? nil :xmlAttribute? nil), "Permission" (portkey.aws/search-for-tag input "Permission" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1612274 "Grantee") (clojure.core/assoc :grantee (deser-grantee (clojure.core/get-in letvar1612274 ["Grantee" :content]))) (letvar1612274 "Permission") (clojure.core/assoc :permission (deser-permission (clojure.core/get-in letvar1612274 ["Permission" :content]))))))

(clojure.core/defn- deser-object-lock-rule [input] (clojure.core/let [letvar1612382 {"DefaultRetention" (portkey.aws/search-for-tag input "DefaultRetention" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1612382 "DefaultRetention") (clojure.core/assoc :default-retention (deser-default-retention (clojure.core/get-in letvar1612382 ["DefaultRetention" :content]))))))

(clojure.core/defn- deser-initiated [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-content-length [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-topic-configuration [input] (clojure.core/let [letvar1612494 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Topic" (portkey.aws/search-for-tag input "Topic" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:topic-arn (deser-topic-arn (clojure.core/get-in letvar1612494 ["Topic" :content])), :events (deser-event-list (clojure.core/get-in letvar1612494 ["Event"]))} (letvar1612494 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1612494 ["Id" :content]))) (letvar1612494 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar1612494 ["Filter" :content]))))))

(clojure.core/defn- deser-is-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-progress-event [input] (clojure.core/let [letvar1612604 {"Details" (portkey.aws/search-for-tag input "Details" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1612604 "Details") (clojure.core/assoc :details (deser-progress (clojure.core/get-in letvar1612604 ["Details" :content]))))))

(clojure.core/defn- deser-inventory-s-3-bucket-destination [input] (clojure.core/let [letvar1612712 {"AccountId" (portkey.aws/search-for-tag input "AccountId" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Format" (portkey.aws/search-for-tag input "Format" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Encryption" (portkey.aws/search-for-tag input "Encryption" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:bucket (deser-bucket-name (clojure.core/get-in letvar1612712 ["Bucket" :content])), :format (deser-inventory-format (clojure.core/get-in letvar1612712 ["Format" :content]))} (letvar1612712 "AccountId") (clojure.core/assoc :account-id (deser-account-id (clojure.core/get-in letvar1612712 ["AccountId" :content]))) (letvar1612712 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1612712 ["Prefix" :content]))) (letvar1612712 "Encryption") (clojure.core/assoc :encryption (deser-inventory-encryption (clojure.core/get-in letvar1612712 ["Encryption" :content]))))))

(clojure.core/defn- deser-copy-object-result [input] (clojure.core/let [letvar1612820 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1612820 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1612820 ["ETag" :content]))) (letvar1612820 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1612820 ["LastModified" :content]))))))

(clojure.core/defn- deser-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-frequency [input] (clojure.core/get {"Daily" :daily, "Weekly" :weekly} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-expose-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-expose-header (:content coll)))) input))

(clojure.core/defn- deser-transition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transition (:content coll)))) input))

(clojure.core/defn- deser-analytics-filter [input] (clojure.core/let [letvar1612977 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1612977 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1612977 ["Prefix" :content]))) (letvar1612977 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar1612977 ["Tag" :content]))) (letvar1612977 "And") (clojure.core/assoc :and (deser-analytics-and-operator (clojure.core/get-in letvar1612977 ["And" :content]))))))

(clojure.core/defn- deser-analytics-s-3-export-file-format [input] (clojure.core/get {"CSV" :csv} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-version-id-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-method [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bucket-accelerate-status [input] (clojure.core/get {"Enabled" :enabled, "Suspended" :suspended} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lambda-function-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-protocol [input] (clojure.core/get {"http" :http, "https" :https} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-replication-rule [input] (clojure.core/let [letvar1613125 {"ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "Priority" (portkey.aws/search-for-tag input "Priority" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "SourceSelectionCriteria" (portkey.aws/search-for-tag input "SourceSelectionCriteria" :flattened? nil :xmlAttribute? nil), "Destination" (portkey.aws/search-for-tag input "Destination" :flattened? nil :xmlAttribute? nil), "DeleteMarkerReplication" (portkey.aws/search-for-tag input "DeleteMarkerReplication" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-replication-rule-status (clojure.core/get-in letvar1613125 ["Status" :content])), :destination (deser-destination (clojure.core/get-in letvar1613125 ["Destination" :content]))} (letvar1613125 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1613125 ["ID" :content]))) (letvar1613125 "Priority") (clojure.core/assoc :priority (deser-priority (clojure.core/get-in letvar1613125 ["Priority" :content]))) (letvar1613125 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1613125 ["Prefix" :content]))) (letvar1613125 "Filter") (clojure.core/assoc :filter (deser-replication-rule-filter (clojure.core/get-in letvar1613125 ["Filter" :content]))) (letvar1613125 "SourceSelectionCriteria") (clojure.core/assoc :source-selection-criteria (deser-source-selection-criteria (clojure.core/get-in letvar1613125 ["SourceSelectionCriteria" :content]))) (letvar1613125 "DeleteMarkerReplication") (clojure.core/assoc :delete-marker-replication (deser-delete-marker-replication (clojure.core/get-in letvar1613125 ["DeleteMarkerReplication" :content]))))))

(clojure.core/defn- deser-redirect-all-requests-to [input] (clojure.core/let [letvar1613233 {"HostName" (portkey.aws/search-for-tag input "HostName" :flattened? nil :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:host-name (deser-host-name (clojure.core/get-in letvar1613233 ["HostName" :content]))} (letvar1613233 "Protocol") (clojure.core/assoc :protocol (deser-protocol (clojure.core/get-in letvar1613233 ["Protocol" :content]))))))

(clojure.core/defn- deser-target-grants [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-grant coll))) input))

(clojure.core/defn- deser-buckets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bucket coll))) input))

(clojure.core/defn- deser-last-modified [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-filter-rule [input] (clojure.core/let [letvar1613377 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1613377 "Name") (clojure.core/assoc :name (deser-filter-rule-name (clojure.core/get-in letvar1613377 ["Name" :content]))) (letvar1613377 "Value") (clojure.core/assoc :value (deser-filter-rule-value (clojure.core/get-in letvar1613377 ["Value" :content]))))))

(clojure.core/defn- deser-replication-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-rule (:content coll)))) input))

(clojure.core/defn- deser-s-3-key-filter [input] (clojure.core/let [letvar1613502 {"FilterRule" (portkey.aws/search-for-tag input "FilterRule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1613502 "FilterRule") (clojure.core/assoc :filter-rules (deser-filter-rule-list (clojure.core/get-in letvar1613502 ["FilterRule"]))))))

(clojure.core/defn- deser-parts-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-abort-rule-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-target-bucket [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-replace-key-with [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-size [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-part [input] (clojure.core/let [letvar1613629 {"PartNumber" (portkey.aws/search-for-tag input "PartNumber" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil), "ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1613629 "PartNumber") (clojure.core/assoc :part-number (deser-part-number (clojure.core/get-in letvar1613629 ["PartNumber" :content]))) (letvar1613629 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1613629 ["LastModified" :content]))) (letvar1613629 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1613629 ["ETag" :content]))) (letvar1613629 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar1613629 ["Size" :content]))))))

(clojure.core/defn- deser-part-number-marker [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-account-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-notification-configuration-filter [input] (clojure.core/let [letvar1613744 {"S3Key" (portkey.aws/search-for-tag input "S3Key" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1613744 "S3Key") (clojure.core/assoc :key (deser-s-3-key-filter (clojure.core/get-in letvar1613744 ["S3Key" :content]))))))

(clojure.core/defn- deser-topic-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-suffix [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-lifecycle-rule-and-operator [input] (clojure.core/let [letvar1613862 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1613862 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1613862 ["Prefix" :content]))) (letvar1613862 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar1613862 ["Tag" :content]))))))

(clojure.core/defn- deser-allowed-header [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-rule [input] (clojure.core/let [letvar1613975 {"Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? nil :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Transition" (portkey.aws/search-for-tag input "Transition" :flattened? nil :xmlAttribute? nil), "NoncurrentVersionTransition" (portkey.aws/search-for-tag input "NoncurrentVersionTransition" :flattened? nil :xmlAttribute? nil), "NoncurrentVersionExpiration" (portkey.aws/search-for-tag input "NoncurrentVersionExpiration" :flattened? nil :xmlAttribute? nil), "AbortIncompleteMultipartUpload" (portkey.aws/search-for-tag input "AbortIncompleteMultipartUpload" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:prefix (deser-prefix (clojure.core/get-in letvar1613975 ["Prefix" :content])), :status (deser-expiration-status (clojure.core/get-in letvar1613975 ["Status" :content]))} (letvar1613975 "Expiration") (clojure.core/assoc :expiration (deser-lifecycle-expiration (clojure.core/get-in letvar1613975 ["Expiration" :content]))) (letvar1613975 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1613975 ["ID" :content]))) (letvar1613975 "Transition") (clojure.core/assoc :transition (deser-transition (clojure.core/get-in letvar1613975 ["Transition" :content]))) (letvar1613975 "NoncurrentVersionTransition") (clojure.core/assoc :noncurrent-version-transition (deser-noncurrent-version-transition (clojure.core/get-in letvar1613975 ["NoncurrentVersionTransition" :content]))) (letvar1613975 "NoncurrentVersionExpiration") (clojure.core/assoc :noncurrent-version-expiration (deser-noncurrent-version-expiration (clojure.core/get-in letvar1613975 ["NoncurrentVersionExpiration" :content]))) (letvar1613975 "AbortIncompleteMultipartUpload") (clojure.core/assoc :abort-incomplete-multipart-upload (deser-abort-incomplete-multipart-upload (clojure.core/get-in letvar1613975 ["AbortIncompleteMultipartUpload" :content]))))))

(clojure.core/defn- deser-routing-rule [input] (clojure.core/let [letvar1614083 {"Condition" (portkey.aws/search-for-tag input "Condition" :flattened? nil :xmlAttribute? nil), "Redirect" (portkey.aws/search-for-tag input "Redirect" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:redirect (deser-redirect (clojure.core/get-in letvar1614083 ["Redirect" :content]))} (letvar1614083 "Condition") (clojure.core/assoc :condition (deser-condition (clojure.core/get-in letvar1614083 ["Condition" :content]))))))

(clojure.core/defn- deser-noncurrent-version-expiration [input] (clojure.core/let [letvar1614191 {"NoncurrentDays" (portkey.aws/search-for-tag input "NoncurrentDays" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1614191 "NoncurrentDays") (clojure.core/assoc :noncurrent-days (deser-days (clojure.core/get-in letvar1614191 ["NoncurrentDays" :content]))))))

(clojure.core/defn- deser-delete-marker-replication [input] (clojure.core/let [letvar1614299 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1614299 "Status") (clojure.core/assoc :status (deser-delete-marker-replication-status (clojure.core/get-in letvar1614299 ["Status" :content]))))))

(clojure.core/defn- deser-next-version-id-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ssekms [input] (clojure.core/let [letvar1614412 {"KeyId" (portkey.aws/search-for-tag input "KeyId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key-id (deser-ssekms-key-id (clojure.core/get-in letvar1614412 ["KeyId" :content]))})))

(clojure.core/defn- deser-deleted-object [input] (clojure.core/let [letvar1614520 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "DeleteMarker" (portkey.aws/search-for-tag input "DeleteMarker" :flattened? nil :xmlAttribute? nil), "DeleteMarkerVersionId" (portkey.aws/search-for-tag input "DeleteMarkerVersionId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1614520 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1614520 ["Key" :content]))) (letvar1614520 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1614520 ["VersionId" :content]))) (letvar1614520 "DeleteMarker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar1614520 ["DeleteMarker" :content]))) (letvar1614520 "DeleteMarkerVersionId") (clojure.core/assoc :delete-marker-version-id (deser-delete-marker-version-id (clojure.core/get-in letvar1614520 ["DeleteMarkerVersionId" :content]))))))

(clojure.core/defn- deser-abort-incomplete-multipart-upload [input] (clojure.core/let [letvar1614628 {"DaysAfterInitiation" (portkey.aws/search-for-tag input "DaysAfterInitiation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1614628 "DaysAfterInitiation") (clojure.core/assoc :days-after-initiation (deser-days-after-initiation (clojure.core/get-in letvar1614628 ["DaysAfterInitiation" :content]))))))

(clojure.core/defn- deser-http-redirect-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-uri [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inventory-optional-fields [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-inventory-optional-field coll))) input))

(clojure.core/defn- deser-owner [input] (clojure.core/let [letvar1614763 {"DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? nil :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1614763 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1614763 ["DisplayName" :content]))) (letvar1614763 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1614763 ["ID" :content]))))))

(clojure.core/defn- deser-replication-rule-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-next-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-days [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-storage-class-analysis-data-export [input] (clojure.core/let [letvar1614883 {"OutputSchemaVersion" (portkey.aws/search-for-tag input "OutputSchemaVersion" :flattened? nil :xmlAttribute? nil), "Destination" (portkey.aws/search-for-tag input "Destination" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:output-schema-version (deser-storage-class-analysis-schema-version (clojure.core/get-in letvar1614883 ["OutputSchemaVersion" :content])), :destination (deser-analytics-export-destination (clojure.core/get-in letvar1614883 ["Destination" :content]))})))

(clojure.core/defn- deser-creation-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bytes-scanned [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-bytes-processed [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-stats [input] (clojure.core/let [letvar1614997 {"BytesScanned" (portkey.aws/search-for-tag input "BytesScanned" :flattened? nil :xmlAttribute? nil), "BytesProcessed" (portkey.aws/search-for-tag input "BytesProcessed" :flattened? nil :xmlAttribute? nil), "BytesReturned" (portkey.aws/search-for-tag input "BytesReturned" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1614997 "BytesScanned") (clojure.core/assoc :bytes-scanned (deser-bytes-scanned (clojure.core/get-in letvar1614997 ["BytesScanned" :content]))) (letvar1614997 "BytesProcessed") (clojure.core/assoc :bytes-processed (deser-bytes-processed (clojure.core/get-in letvar1614997 ["BytesProcessed" :content]))) (letvar1614997 "BytesReturned") (clojure.core/assoc :bytes-returned (deser-bytes-returned (clojure.core/get-in letvar1614997 ["BytesReturned" :content]))))))

(clojure.core/defn- deser-cors-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cors-rule (:content coll)))) input))

(clojure.core/defn- deser-object-lock-legal-hold-status [input] (clojure.core/get {"ON" :on, "OFF" :off} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metadata [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-metadata-key k) (deser-metadata-value v)])) input))

(clojure.core/defn- deser-cache-control [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-content-language [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-version-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object-version (:content coll)))) input))

(clojure.core/defn- deser-policy [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-delimiter [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar1615187 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-object-key (clojure.core/get-in letvar1615187 ["Key" :content])), :value (deser-value (clojure.core/get-in letvar1615187 ["Value" :content]))})))

(clojure.core/defn- deser-condition [input] (clojure.core/let [letvar1615295 {"HttpErrorCodeReturnedEquals" (portkey.aws/search-for-tag input "HttpErrorCodeReturnedEquals" :flattened? nil :xmlAttribute? nil), "KeyPrefixEquals" (portkey.aws/search-for-tag input "KeyPrefixEquals" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1615295 "HttpErrorCodeReturnedEquals") (clojure.core/assoc :http-error-code-returned-equals (deser-http-error-code-returned-equals (clojure.core/get-in letvar1615295 ["HttpErrorCodeReturnedEquals" :content]))) (letvar1615295 "KeyPrefixEquals") (clojure.core/assoc :key-prefix-equals (deser-key-prefix-equals (clojure.core/get-in letvar1615295 ["KeyPrefixEquals" :content]))))))

(clojure.core/defn- deser-error [input] (clojure.core/let [letvar1615403 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "Code" (portkey.aws/search-for-tag input "Code" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1615403 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1615403 ["Key" :content]))) (letvar1615403 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1615403 ["VersionId" :content]))) (letvar1615403 "Code") (clojure.core/assoc :code (deser-code (clojure.core/get-in letvar1615403 ["Code" :content]))) (letvar1615403 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1615403 ["Message" :content]))))))

(clojure.core/defn- deser-queue-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-version [input] (clojure.core/let [letvar1615516 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? nil :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "IsLatest" (portkey.aws/search-for-tag input "IsLatest" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1615516 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1615516 ["ETag" :content]))) (letvar1615516 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar1615516 ["Size" :content]))) (letvar1615516 "StorageClass") (clojure.core/assoc :storage-class (deser-object-version-storage-class (clojure.core/get-in letvar1615516 ["StorageClass" :content]))) (letvar1615516 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1615516 ["Key" :content]))) (letvar1615516 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1615516 ["VersionId" :content]))) (letvar1615516 "IsLatest") (clojure.core/assoc :is-latest (deser-is-latest (clojure.core/get-in letvar1615516 ["IsLatest" :content]))) (letvar1615516 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1615516 ["LastModified" :content]))) (letvar1615516 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1615516 ["Owner" :content]))))))

(clojure.core/defn- deser-target-prefix [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-version-storage-class [input] (clojure.core/get {"STANDARD" :standard} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-delete-marker-entry [input] (clojure.core/let [letvar1615634 {"Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "IsLatest" (portkey.aws/search-for-tag input "IsLatest" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1615634 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1615634 ["Owner" :content]))) (letvar1615634 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1615634 ["Key" :content]))) (letvar1615634 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1615634 ["VersionId" :content]))) (letvar1615634 "IsLatest") (clojure.core/assoc :is-latest (deser-is-latest (clojure.core/get-in letvar1615634 ["IsLatest" :content]))) (letvar1615634 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1615634 ["LastModified" :content]))))))

(clojure.core/defn- deser-server-side-encryption-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-side-encryption-rule (:content coll)))) input))

(clojure.core/defn- deser-queue-configuration [input] (clojure.core/let [letvar1615759 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Queue" (portkey.aws/search-for-tag input "Queue" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:queue-arn (deser-queue-arn (clojure.core/get-in letvar1615759 ["Queue" :content])), :events (deser-event-list (clojure.core/get-in letvar1615759 ["Event"]))} (letvar1615759 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1615759 ["Id" :content]))) (letvar1615759 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar1615759 ["Filter" :content]))))))

(clojure.core/defn- deser-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-status [input] (clojure.core/let [letvar1615872 {"IsPublic" (portkey.aws/search-for-tag input "IsPublic" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1615872 "IsPublic") (clojure.core/assoc :is-public (deser-is-public (clojure.core/get-in letvar1615872 ["IsPublic" :content]))))))

(clojure.core/defn- deser-host-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-restore-output-path [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-storage-class [input] (clojure.core/get {"STANDARD" :standard, "REDUCED_REDUNDANCY" :reduced-redundancy, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia, "INTELLIGENT_TIERING" :intelligent-tiering, "GLACIER" :glacier} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-server-side-encryption-rule [input] (clojure.core/let [letvar1615995 {"ApplyServerSideEncryptionByDefault" (portkey.aws/search-for-tag input "ApplyServerSideEncryptionByDefault" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1615995 "ApplyServerSideEncryptionByDefault") (clojure.core/assoc :apply-server-side-encryption-by-default (deser-server-side-encryption-by-default (clojure.core/get-in letvar1615995 ["ApplyServerSideEncryptionByDefault" :content]))))))

(clojure.core/defn- deser-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule (:content coll)))) input))

(clojure.core/defn- deser-lifecycle-expiration [input] (clojure.core/let [letvar1616120 {"Date" (portkey.aws/search-for-tag input "Date" :flattened? nil :xmlAttribute? nil), "Days" (portkey.aws/search-for-tag input "Days" :flattened? nil :xmlAttribute? nil), "ExpiredObjectDeleteMarker" (portkey.aws/search-for-tag input "ExpiredObjectDeleteMarker" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1616120 "Date") (clojure.core/assoc :date (deser-date (clojure.core/get-in letvar1616120 ["Date" :content]))) (letvar1616120 "Days") (clojure.core/assoc :days (deser-days (clojure.core/get-in letvar1616120 ["Days" :content]))) (letvar1616120 "ExpiredObjectDeleteMarker") (clojure.core/assoc :expired-object-delete-marker (deser-expired-object-delete-marker (clojure.core/get-in letvar1616120 ["ExpiredObjectDeleteMarker" :content]))))))

(clojure.core/defn- deser-analytics-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-analytics-configuration (:content coll)))) input))

(clojure.core/defn- deser-inventory-format [input] (clojure.core/get {"CSV" :csv, "ORC" :orc, "Parquet" :parquet} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-queue-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-queue-configuration (:content coll)))) input))

(clojure.core/defn- deser-grantee [input] (clojure.core/let [letvar1616267 {"DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? nil :xmlAttribute? nil), "EmailAddress" (portkey.aws/search-for-tag input "EmailAddress" :flattened? nil :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "xsi:type" (portkey.aws/search-for-tag input "xsi:type" :flattened? nil :xmlAttribute? true), "URI" (portkey.aws/search-for-tag input "URI" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-type (clojure.core/get-in letvar1616267 ["xsi:type"]))} (letvar1616267 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1616267 ["DisplayName" :content]))) (letvar1616267 "EmailAddress") (clojure.core/assoc :email-address (deser-email-address (clojure.core/get-in letvar1616267 ["EmailAddress" :content]))) (letvar1616267 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1616267 ["ID" :content]))) (letvar1616267 "URI") (clojure.core/assoc :uri (deser-uri (clojure.core/get-in letvar1616267 ["URI" :content]))))))

(clojure.core/defn- deser-key-prefix-equals [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-header (:content coll)))) input))

(clojure.core/defn- deser-delete-marker [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-years [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-allowed-origins [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-origin (:content coll)))) input))

(clojure.core/defn- deser-bucket-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-queue-configuration-deprecated [input] (clojure.core/let [letvar1616423 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Queue" (portkey.aws/search-for-tag input "Queue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1616423 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1616423 ["Id" :content]))) (letvar1616423 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar1616423 ["Event" :content]))) (letvar1616423 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar1616423 ["Event"]))) (letvar1616423 "Queue") (clojure.core/assoc :queue (deser-queue-arn (clojure.core/get-in letvar1616423 ["Queue" :content]))))))

(clojure.core/defn- deser-request-charged [input] (clojure.core/get {"requester" :requester} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-expires [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-max-keys [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lifecycle-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-rule (:content coll)))) input))

(clojure.core/defn- deser-initiator [input] (clojure.core/let [letvar1616557 {"ID" (portkey.aws/search-for-tag input "ID" :flattened? nil :xmlAttribute? nil), "DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1616557 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar1616557 ["ID" :content]))) (letvar1616557 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1616557 ["DisplayName" :content]))))))

(clojure.core/defn- deser-sses-3 [input] (clojure.core/let [letvar1616665 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-max-age-seconds [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-email-address [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-lock-retain-until-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-bucket-location-constraint [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-southeast-2" :apsoutheast-2, "EU" :eu, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "eu-central-1" :eucentral-1, "us-west-2" :uswest-2, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-ssekms-key-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-origin [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-object-lock-mode [input] (clojure.core/get {"GOVERNANCE" :governance, "COMPLIANCE" :compliance} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lambda-function-configuration [input] (clojure.core/let [letvar1616807 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CloudFunction" (portkey.aws/search-for-tag input "CloudFunction" :flattened? nil :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:lambda-function-arn (deser-lambda-function-arn (clojure.core/get-in letvar1616807 ["CloudFunction" :content])), :events (deser-event-list (clojure.core/get-in letvar1616807 ["Event"]))} (letvar1616807 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar1616807 ["Id" :content]))) (letvar1616807 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar1616807 ["Filter" :content]))))))

(clojure.core/defn- deser-delete-marker-version-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-default-retention [input] (clojure.core/let [letvar1616920 {"Mode" (portkey.aws/search-for-tag input "Mode" :flattened? nil :xmlAttribute? nil), "Days" (portkey.aws/search-for-tag input "Days" :flattened? nil :xmlAttribute? nil), "Years" (portkey.aws/search-for-tag input "Years" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1616920 "Mode") (clojure.core/assoc :mode (deser-object-lock-retention-mode (clojure.core/get-in letvar1616920 ["Mode" :content]))) (letvar1616920 "Days") (clojure.core/assoc :days (deser-days (clojure.core/get-in letvar1616920 ["Days" :content]))) (letvar1616920 "Years") (clojure.core/assoc :years (deser-years (clojure.core/get-in letvar1616920 ["Years" :content]))))))

(clojure.core/defn- deser-is-latest [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-noncurrent-version-transition [input] (clojure.core/let [letvar1617030 {"NoncurrentDays" (portkey.aws/search-for-tag input "NoncurrentDays" :flattened? nil :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1617030 "NoncurrentDays") (clojure.core/assoc :noncurrent-days (deser-days (clojure.core/get-in letvar1617030 ["NoncurrentDays" :content]))) (letvar1617030 "StorageClass") (clojure.core/assoc :storage-class (deser-transition-storage-class (clojure.core/get-in letvar1617030 ["StorageClass" :content]))))))

(clojure.core/defn- deser-index-document [input] (clojure.core/let [letvar1617138 {"Suffix" (portkey.aws/search-for-tag input "Suffix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:suffix (deser-suffix (clojure.core/get-in letvar1617138 ["Suffix" :content]))})))

(clojure.core/defn- deser-key-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-common-prefix [input] (clojure.core/let [letvar1617251 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1617251 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1617251 ["Prefix" :content]))))))

(clojure.core/defn- deser-next-upload-id-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-analytics-configuration [input] (clojure.core/let [letvar1617364 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? nil :xmlAttribute? nil), "StorageClassAnalysis" (portkey.aws/search-for-tag input "StorageClassAnalysis" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-analytics-id (clojure.core/get-in letvar1617364 ["Id" :content])), :storage-class-analysis (deser-storage-class-analysis (clojure.core/get-in letvar1617364 ["StorageClassAnalysis" :content]))} (letvar1617364 "Filter") (clojure.core/assoc :filter (deser-analytics-filter (clojure.core/get-in letvar1617364 ["Filter" :content]))))))

(clojure.core/defn- deser-expiration [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cloud-function [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-delete-markers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-delete-marker-entry (:content coll)))) input))

(clojure.core/defn- deser-sse-kms-encrypted-objects [input] (clojure.core/let [letvar1617499 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-sse-kms-encrypted-objects-status (clojure.core/get-in letvar1617499 ["Status" :content]))})))

(clojure.core/defn- deser-object-lock-retention-mode [input] (clojure.core/get {"GOVERNANCE" :governance, "COMPLIANCE" :compliance} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-object-lock-retention [input] (clojure.core/let [letvar1617612 {"Mode" (portkey.aws/search-for-tag input "Mode" :flattened? nil :xmlAttribute? nil), "RetainUntilDate" (portkey.aws/search-for-tag input "RetainUntilDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1617612 "Mode") (clojure.core/assoc :mode (deser-object-lock-retention-mode (clojure.core/get-in letvar1617612 ["Mode" :content]))) (letvar1617612 "RetainUntilDate") (clojure.core/assoc :retain-until-date (deser-date (clojure.core/get-in letvar1617612 ["RetainUntilDate" :content]))))))

(clojure.core/defn- deser-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error (:content coll)))) input))

(clojure.core/defn- response-put-object-tagging-output ([input] (response-put-object-tagging-output nil input)) ([resultWrapper1617631 input] (clojure.core/let [rawinput1617630 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617632 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"])}] (clojure.core/cond-> {} (letvar1617632 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617632 ["x-amz-version-id"])))))))

(clojure.core/defn- response-get-object-tagging-output ([input] (response-get-object-tagging-output nil input)) ([resultWrapper1617634 input] (clojure.core/let [rawinput1617633 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617635 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "TagSet" (portkey.aws/search-for-tag rawinput1617633 "TagSet" :flattened? nil :result-wrapper resultWrapper1617634)}] (clojure.core/cond-> {:tag-set (deser-tag-set (clojure.core/get-in letvar1617635 ["TagSet" :content]))} (letvar1617635 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617635 ["x-amz-version-id"])))))))

(clojure.core/defn- response-list-object-versions-output ([input] (response-list-object-versions-output nil input)) ([resultWrapper1617637 input] (clojure.core/let [rawinput1617636 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617638 {"Prefix" (portkey.aws/search-for-tag rawinput1617636 "Prefix" :flattened? nil :result-wrapper resultWrapper1617637), "EncodingType" (portkey.aws/search-for-tag rawinput1617636 "EncodingType" :flattened? nil :result-wrapper resultWrapper1617637), "NextKeyMarker" (portkey.aws/search-for-tag rawinput1617636 "NextKeyMarker" :flattened? nil :result-wrapper resultWrapper1617637), "IsTruncated" (portkey.aws/search-for-tag rawinput1617636 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1617637), "CommonPrefixes" (portkey.aws/search-for-tag rawinput1617636 "CommonPrefixes" :flattened? true :result-wrapper resultWrapper1617637), "VersionIdMarker" (portkey.aws/search-for-tag rawinput1617636 "VersionIdMarker" :flattened? nil :result-wrapper resultWrapper1617637), "NextVersionIdMarker" (portkey.aws/search-for-tag rawinput1617636 "NextVersionIdMarker" :flattened? nil :result-wrapper resultWrapper1617637), "Delimiter" (portkey.aws/search-for-tag rawinput1617636 "Delimiter" :flattened? nil :result-wrapper resultWrapper1617637), "Version" (portkey.aws/search-for-tag rawinput1617636 "Version" :flattened? true :result-wrapper resultWrapper1617637), "Name" (portkey.aws/search-for-tag rawinput1617636 "Name" :flattened? nil :result-wrapper resultWrapper1617637), "DeleteMarker" (portkey.aws/search-for-tag rawinput1617636 "DeleteMarker" :flattened? true :result-wrapper resultWrapper1617637), "MaxKeys" (portkey.aws/search-for-tag rawinput1617636 "MaxKeys" :flattened? nil :result-wrapper resultWrapper1617637), "KeyMarker" (portkey.aws/search-for-tag rawinput1617636 "KeyMarker" :flattened? nil :result-wrapper resultWrapper1617637)}] (clojure.core/cond-> {} (letvar1617638 "Version") (clojure.core/assoc :versions (deser-object-version-list (clojure.core/get-in letvar1617638 ["Version"]))) (letvar1617638 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1617638 ["Prefix" :content]))) (letvar1617638 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar1617638 ["EncodingType" :content]))) (letvar1617638 "NextKeyMarker") (clojure.core/assoc :next-key-marker (deser-next-key-marker (clojure.core/get-in letvar1617638 ["NextKeyMarker" :content]))) (letvar1617638 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1617638 ["IsTruncated" :content]))) (letvar1617638 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar1617638 ["CommonPrefixes"]))) (letvar1617638 "VersionIdMarker") (clojure.core/assoc :version-id-marker (deser-version-id-marker (clojure.core/get-in letvar1617638 ["VersionIdMarker" :content]))) (letvar1617638 "NextVersionIdMarker") (clojure.core/assoc :next-version-id-marker (deser-next-version-id-marker (clojure.core/get-in letvar1617638 ["NextVersionIdMarker" :content]))) (letvar1617638 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar1617638 ["Delimiter" :content]))) (letvar1617638 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar1617638 ["Name" :content]))) (letvar1617638 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar1617638 ["MaxKeys" :content]))) (letvar1617638 "KeyMarker") (clojure.core/assoc :key-marker (deser-key-marker (clojure.core/get-in letvar1617638 ["KeyMarker" :content]))) (letvar1617638 "DeleteMarker") (clojure.core/assoc :delete-markers (deser-delete-markers (clojure.core/get-in letvar1617638 ["DeleteMarker"])))))))

(clojure.core/defn- response-bucket-already-owned-by-you ([input] (response-bucket-already-owned-by-you nil input)) ([resultWrapper1617640 input] (clojure.core/let [rawinput1617639 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617641 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-object-torrent-output ([input] (response-get-object-torrent-output nil input)) ([resultWrapper1617643 input] (clojure.core/let [rawinput1617642 (:body input) letvar1617644 {"Body" rawinput1617642, "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617644 "Body") (clojure.core/assoc :body (deser-body (clojure.core/get-in letvar1617644 ["Body"]))) (letvar1617644 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617644 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-bucket-analytics-configuration-output ([input] (response-get-bucket-analytics-configuration-output nil input)) ([resultWrapper1617646 input] (clojure.core/let [rawinput1617645 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617647 {"AnalyticsConfiguration" (portkey.aws/search-for-tag rawinput1617645 "AnalyticsConfiguration" :flattened? nil :result-wrapper resultWrapper1617646)}] (clojure.core/cond-> {} (letvar1617647 "AnalyticsConfiguration") (clojure.core/assoc :analytics-configuration (deser-analytics-configuration (clojure.core/get-in letvar1617647 ["AnalyticsConfiguration" :content])))))))

(clojure.core/defn- response-get-bucket-encryption-output ([input] (response-get-bucket-encryption-output nil input)) ([resultWrapper1617649 input] (clojure.core/let [rawinput1617648 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617650 {"ServerSideEncryptionConfiguration" (portkey.aws/search-for-tag rawinput1617648 "ServerSideEncryptionConfiguration" :flattened? nil :result-wrapper resultWrapper1617649)}] (clojure.core/cond-> {} (letvar1617650 "ServerSideEncryptionConfiguration") (clojure.core/assoc :server-side-encryption-configuration (deser-server-side-encryption-configuration (clojure.core/get-in letvar1617650 ["ServerSideEncryptionConfiguration" :content])))))))

(clojure.core/defn- response-get-object-legal-hold-output ([input] (response-get-object-legal-hold-output nil input)) ([resultWrapper1617652 input] (clojure.core/let [rawinput1617651 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617653 {"LegalHold" (portkey.aws/search-for-tag rawinput1617651 "LegalHold" :flattened? nil :result-wrapper resultWrapper1617652)}] (clojure.core/cond-> {} (letvar1617653 "LegalHold") (clojure.core/assoc :legal-hold (deser-object-lock-legal-hold (clojure.core/get-in letvar1617653 ["LegalHold" :content])))))))

(clojure.core/defn- response-get-bucket-lifecycle-output ([input] (response-get-bucket-lifecycle-output nil input)) ([resultWrapper1617655 input] (clojure.core/let [rawinput1617654 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617656 {"Rule" (portkey.aws/search-for-tag rawinput1617654 "Rule" :flattened? true :result-wrapper resultWrapper1617655)}] (clojure.core/cond-> {} (letvar1617656 "Rule") (clojure.core/assoc :rules (deser-rules (clojure.core/get-in letvar1617656 ["Rule"])))))))

(clojure.core/defn- response-get-bucket-logging-output ([input] (response-get-bucket-logging-output nil input)) ([resultWrapper1617658 input] (clojure.core/let [rawinput1617657 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617659 {"LoggingEnabled" (portkey.aws/search-for-tag rawinput1617657 "LoggingEnabled" :flattened? nil :result-wrapper resultWrapper1617658)}] (clojure.core/cond-> {} (letvar1617659 "LoggingEnabled") (clojure.core/assoc :logging-enabled (deser-logging-enabled (clojure.core/get-in letvar1617659 ["LoggingEnabled" :content])))))))

(clojure.core/defn- response-delete-objects-output ([input] (response-delete-objects-output nil input)) ([resultWrapper1617661 input] (clojure.core/let [rawinput1617660 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617662 {"Deleted" (portkey.aws/search-for-tag rawinput1617660 "Deleted" :flattened? true :result-wrapper resultWrapper1617661), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "Error" (portkey.aws/search-for-tag rawinput1617660 "Error" :flattened? true :result-wrapper resultWrapper1617661)}] (clojure.core/cond-> {} (letvar1617662 "Deleted") (clojure.core/assoc :deleted (deser-deleted-objects (clojure.core/get-in letvar1617662 ["Deleted"]))) (letvar1617662 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617662 ["x-amz-request-charged"]))) (letvar1617662 "Error") (clojure.core/assoc :errors (deser-errors (clojure.core/get-in letvar1617662 ["Error"])))))))

(clojure.core/defn- response-create-multipart-upload-output ([input] (response-create-multipart-upload-output nil input)) ([resultWrapper1617664 input] (clojure.core/let [rawinput1617663 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617665 {"Bucket" (portkey.aws/search-for-tag rawinput1617663 "Bucket" :flattened? nil :result-wrapper resultWrapper1617664), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-abort-date" (clojure.core/get-in input [:headers "x-amz-abort-date"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-abort-rule-id" (clojure.core/get-in input [:headers "x-amz-abort-rule-id"]), "Key" (portkey.aws/search-for-tag rawinput1617663 "Key" :flattened? nil :result-wrapper resultWrapper1617664), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "UploadId" (portkey.aws/search-for-tag rawinput1617663 "UploadId" :flattened? nil :result-wrapper resultWrapper1617664)}] (clojure.core/cond-> {} (letvar1617665 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar1617665 ["Bucket" :content]))) (letvar1617665 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1617665 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1617665 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1617665 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1617665 "x-amz-abort-date") (clojure.core/assoc :abort-date (deser-abort-date (clojure.core/get-in letvar1617665 ["x-amz-abort-date"]))) (letvar1617665 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1617665 ["x-amz-server-side-encryption"]))) (letvar1617665 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1617665 ["Key" :content]))) (letvar1617665 "x-amz-abort-rule-id") (clojure.core/assoc :abort-rule-id (deser-abort-rule-id (clojure.core/get-in letvar1617665 ["x-amz-abort-rule-id"]))) (letvar1617665 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar1617665 ["UploadId" :content]))) (letvar1617665 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617665 ["x-amz-request-charged"]))) (letvar1617665 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1617665 ["x-amz-server-side-encryption-aws-kms-key-id"])))))))

(clojure.core/defn- response-list-multipart-uploads-output ([input] (response-list-multipart-uploads-output nil input)) ([resultWrapper1617667 input] (clojure.core/let [rawinput1617666 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617668 {"Bucket" (portkey.aws/search-for-tag rawinput1617666 "Bucket" :flattened? nil :result-wrapper resultWrapper1617667), "Prefix" (portkey.aws/search-for-tag rawinput1617666 "Prefix" :flattened? nil :result-wrapper resultWrapper1617667), "EncodingType" (portkey.aws/search-for-tag rawinput1617666 "EncodingType" :flattened? nil :result-wrapper resultWrapper1617667), "NextKeyMarker" (portkey.aws/search-for-tag rawinput1617666 "NextKeyMarker" :flattened? nil :result-wrapper resultWrapper1617667), "Upload" (portkey.aws/search-for-tag rawinput1617666 "Upload" :flattened? true :result-wrapper resultWrapper1617667), "UploadIdMarker" (portkey.aws/search-for-tag rawinput1617666 "UploadIdMarker" :flattened? nil :result-wrapper resultWrapper1617667), "MaxUploads" (portkey.aws/search-for-tag rawinput1617666 "MaxUploads" :flattened? nil :result-wrapper resultWrapper1617667), "IsTruncated" (portkey.aws/search-for-tag rawinput1617666 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1617667), "CommonPrefixes" (portkey.aws/search-for-tag rawinput1617666 "CommonPrefixes" :flattened? true :result-wrapper resultWrapper1617667), "Delimiter" (portkey.aws/search-for-tag rawinput1617666 "Delimiter" :flattened? nil :result-wrapper resultWrapper1617667), "KeyMarker" (portkey.aws/search-for-tag rawinput1617666 "KeyMarker" :flattened? nil :result-wrapper resultWrapper1617667), "NextUploadIdMarker" (portkey.aws/search-for-tag rawinput1617666 "NextUploadIdMarker" :flattened? nil :result-wrapper resultWrapper1617667)}] (clojure.core/cond-> {} (letvar1617668 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar1617668 ["Bucket" :content]))) (letvar1617668 "Upload") (clojure.core/assoc :uploads (deser-multipart-upload-list (clojure.core/get-in letvar1617668 ["Upload"]))) (letvar1617668 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1617668 ["Prefix" :content]))) (letvar1617668 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar1617668 ["EncodingType" :content]))) (letvar1617668 "NextKeyMarker") (clojure.core/assoc :next-key-marker (deser-next-key-marker (clojure.core/get-in letvar1617668 ["NextKeyMarker" :content]))) (letvar1617668 "UploadIdMarker") (clojure.core/assoc :upload-id-marker (deser-upload-id-marker (clojure.core/get-in letvar1617668 ["UploadIdMarker" :content]))) (letvar1617668 "MaxUploads") (clojure.core/assoc :max-uploads (deser-max-uploads (clojure.core/get-in letvar1617668 ["MaxUploads" :content]))) (letvar1617668 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1617668 ["IsTruncated" :content]))) (letvar1617668 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar1617668 ["CommonPrefixes"]))) (letvar1617668 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar1617668 ["Delimiter" :content]))) (letvar1617668 "KeyMarker") (clojure.core/assoc :key-marker (deser-key-marker (clojure.core/get-in letvar1617668 ["KeyMarker" :content]))) (letvar1617668 "NextUploadIdMarker") (clojure.core/assoc :next-upload-id-marker (deser-next-upload-id-marker (clojure.core/get-in letvar1617668 ["NextUploadIdMarker" :content])))))))

(clojure.core/defn- response-list-bucket-metrics-configurations-output ([input] (response-list-bucket-metrics-configurations-output nil input)) ([resultWrapper1617670 input] (clojure.core/let [rawinput1617669 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617671 {"IsTruncated" (portkey.aws/search-for-tag rawinput1617669 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1617670), "ContinuationToken" (portkey.aws/search-for-tag rawinput1617669 "ContinuationToken" :flattened? nil :result-wrapper resultWrapper1617670), "NextContinuationToken" (portkey.aws/search-for-tag rawinput1617669 "NextContinuationToken" :flattened? nil :result-wrapper resultWrapper1617670), "MetricsConfiguration" (portkey.aws/search-for-tag rawinput1617669 "MetricsConfiguration" :flattened? true :result-wrapper resultWrapper1617670)}] (clojure.core/cond-> {} (letvar1617671 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1617671 ["IsTruncated" :content]))) (letvar1617671 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar1617671 ["ContinuationToken" :content]))) (letvar1617671 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar1617671 ["NextContinuationToken" :content]))) (letvar1617671 "MetricsConfiguration") (clojure.core/assoc :metrics-configuration-list (deser-metrics-configuration-list (clojure.core/get-in letvar1617671 ["MetricsConfiguration"])))))))

(clojure.core/defn- response-create-bucket-output ([input] (response-create-bucket-output nil input)) ([resultWrapper1617673 input] (clojure.core/let [rawinput1617672 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617674 {"Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {} (letvar1617674 "Location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar1617674 ["Location"])))))))

(clojure.core/defn- response-delete-object-output ([input] (response-delete-object-output nil input)) ([resultWrapper1617676 input] (clojure.core/let [rawinput1617675 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617677 {"x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617677 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar1617677 ["x-amz-delete-marker"]))) (letvar1617677 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617677 ["x-amz-version-id"]))) (letvar1617677 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617677 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-object-retention-output ([input] (response-get-object-retention-output nil input)) ([resultWrapper1617679 input] (clojure.core/let [rawinput1617678 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617680 {"Retention" (portkey.aws/search-for-tag rawinput1617678 "Retention" :flattened? nil :result-wrapper resultWrapper1617679)}] (clojure.core/cond-> {} (letvar1617680 "Retention") (clojure.core/assoc :retention (deser-object-lock-retention (clojure.core/get-in letvar1617680 ["Retention" :content])))))))

(clojure.core/defn- response-put-object-lock-configuration-output ([input] (response-put-object-lock-configuration-output nil input)) ([resultWrapper1617682 input] (clojure.core/let [rawinput1617681 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617683 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617683 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617683 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-object-lock-configuration-output ([input] (response-get-object-lock-configuration-output nil input)) ([resultWrapper1617685 input] (clojure.core/let [rawinput1617684 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617686 {"ObjectLockConfiguration" (portkey.aws/search-for-tag rawinput1617684 "ObjectLockConfiguration" :flattened? nil :result-wrapper resultWrapper1617685)}] (clojure.core/cond-> {} (letvar1617686 "ObjectLockConfiguration") (clojure.core/assoc :object-lock-configuration (deser-object-lock-configuration (clojure.core/get-in letvar1617686 ["ObjectLockConfiguration" :content])))))))

(clojure.core/defn- response-list-objects-output ([input] (response-list-objects-output nil input)) ([resultWrapper1617688 input] (clojure.core/let [rawinput1617687 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617689 {"Prefix" (portkey.aws/search-for-tag rawinput1617687 "Prefix" :flattened? nil :result-wrapper resultWrapper1617688), "EncodingType" (portkey.aws/search-for-tag rawinput1617687 "EncodingType" :flattened? nil :result-wrapper resultWrapper1617688), "Marker" (portkey.aws/search-for-tag rawinput1617687 "Marker" :flattened? nil :result-wrapper resultWrapper1617688), "IsTruncated" (portkey.aws/search-for-tag rawinput1617687 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1617688), "CommonPrefixes" (portkey.aws/search-for-tag rawinput1617687 "CommonPrefixes" :flattened? true :result-wrapper resultWrapper1617688), "Contents" (portkey.aws/search-for-tag rawinput1617687 "Contents" :flattened? true :result-wrapper resultWrapper1617688), "NextMarker" (portkey.aws/search-for-tag rawinput1617687 "NextMarker" :flattened? nil :result-wrapper resultWrapper1617688), "Delimiter" (portkey.aws/search-for-tag rawinput1617687 "Delimiter" :flattened? nil :result-wrapper resultWrapper1617688), "Name" (portkey.aws/search-for-tag rawinput1617687 "Name" :flattened? nil :result-wrapper resultWrapper1617688), "MaxKeys" (portkey.aws/search-for-tag rawinput1617687 "MaxKeys" :flattened? nil :result-wrapper resultWrapper1617688)}] (clojure.core/cond-> {} (letvar1617689 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1617689 ["Prefix" :content]))) (letvar1617689 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar1617689 ["EncodingType" :content]))) (letvar1617689 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1617689 ["Marker" :content]))) (letvar1617689 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1617689 ["IsTruncated" :content]))) (letvar1617689 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar1617689 ["CommonPrefixes"]))) (letvar1617689 "Contents") (clojure.core/assoc :contents (deser-object-list (clojure.core/get-in letvar1617689 ["Contents"]))) (letvar1617689 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar1617689 ["NextMarker" :content]))) (letvar1617689 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar1617689 ["Delimiter" :content]))) (letvar1617689 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar1617689 ["Name" :content]))) (letvar1617689 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar1617689 ["MaxKeys" :content])))))))

(clojure.core/defn- response-get-bucket-policy-status-output ([input] (response-get-bucket-policy-status-output nil input)) ([resultWrapper1617691 input] (clojure.core/let [rawinput1617690 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617692 {"PolicyStatus" (portkey.aws/search-for-tag rawinput1617690 "PolicyStatus" :flattened? nil :result-wrapper resultWrapper1617691)}] (clojure.core/cond-> {} (letvar1617692 "PolicyStatus") (clojure.core/assoc :policy-status (deser-policy-status (clojure.core/get-in letvar1617692 ["PolicyStatus" :content])))))))

(clojure.core/defn- response-put-object-legal-hold-output ([input] (response-put-object-legal-hold-output nil input)) ([resultWrapper1617694 input] (clojure.core/let [rawinput1617693 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617695 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617695 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617695 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-list-bucket-inventory-configurations-output ([input] (response-list-bucket-inventory-configurations-output nil input)) ([resultWrapper1617697 input] (clojure.core/let [rawinput1617696 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617698 {"ContinuationToken" (portkey.aws/search-for-tag rawinput1617696 "ContinuationToken" :flattened? nil :result-wrapper resultWrapper1617697), "InventoryConfiguration" (portkey.aws/search-for-tag rawinput1617696 "InventoryConfiguration" :flattened? true :result-wrapper resultWrapper1617697), "IsTruncated" (portkey.aws/search-for-tag rawinput1617696 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1617697), "NextContinuationToken" (portkey.aws/search-for-tag rawinput1617696 "NextContinuationToken" :flattened? nil :result-wrapper resultWrapper1617697)}] (clojure.core/cond-> {} (letvar1617698 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar1617698 ["ContinuationToken" :content]))) (letvar1617698 "InventoryConfiguration") (clojure.core/assoc :inventory-configuration-list (deser-inventory-configuration-list (clojure.core/get-in letvar1617698 ["InventoryConfiguration"]))) (letvar1617698 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1617698 ["IsTruncated" :content]))) (letvar1617698 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar1617698 ["NextContinuationToken" :content])))))))

(clojure.core/defn- response-list-parts-output ([input] (response-list-parts-output nil input)) ([resultWrapper1617700 input] (clojure.core/let [rawinput1617699 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617701 {"Bucket" (portkey.aws/search-for-tag rawinput1617699 "Bucket" :flattened? nil :result-wrapper resultWrapper1617700), "MaxParts" (portkey.aws/search-for-tag rawinput1617699 "MaxParts" :flattened? nil :result-wrapper resultWrapper1617700), "x-amz-abort-date" (clojure.core/get-in input [:headers "x-amz-abort-date"]), "NextPartNumberMarker" (portkey.aws/search-for-tag rawinput1617699 "NextPartNumberMarker" :flattened? nil :result-wrapper resultWrapper1617700), "x-amz-abort-rule-id" (clojure.core/get-in input [:headers "x-amz-abort-rule-id"]), "Key" (portkey.aws/search-for-tag rawinput1617699 "Key" :flattened? nil :result-wrapper resultWrapper1617700), "IsTruncated" (portkey.aws/search-for-tag rawinput1617699 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1617700), "Part" (portkey.aws/search-for-tag rawinput1617699 "Part" :flattened? true :result-wrapper resultWrapper1617700), "PartNumberMarker" (portkey.aws/search-for-tag rawinput1617699 "PartNumberMarker" :flattened? nil :result-wrapper resultWrapper1617700), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "Owner" (portkey.aws/search-for-tag rawinput1617699 "Owner" :flattened? nil :result-wrapper resultWrapper1617700), "UploadId" (portkey.aws/search-for-tag rawinput1617699 "UploadId" :flattened? nil :result-wrapper resultWrapper1617700), "StorageClass" (portkey.aws/search-for-tag rawinput1617699 "StorageClass" :flattened? nil :result-wrapper resultWrapper1617700), "Initiator" (portkey.aws/search-for-tag rawinput1617699 "Initiator" :flattened? nil :result-wrapper resultWrapper1617700)}] (clojure.core/cond-> {} (letvar1617701 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar1617701 ["Bucket" :content]))) (letvar1617701 "Part") (clojure.core/assoc :parts (deser-parts (clojure.core/get-in letvar1617701 ["Part"]))) (letvar1617701 "x-amz-abort-date") (clojure.core/assoc :abort-date (deser-abort-date (clojure.core/get-in letvar1617701 ["x-amz-abort-date"]))) (letvar1617701 "MaxParts") (clojure.core/assoc :max-parts (deser-max-parts (clojure.core/get-in letvar1617701 ["MaxParts" :content]))) (letvar1617701 "NextPartNumberMarker") (clojure.core/assoc :next-part-number-marker (deser-next-part-number-marker (clojure.core/get-in letvar1617701 ["NextPartNumberMarker" :content]))) (letvar1617701 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1617701 ["Key" :content]))) (letvar1617701 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1617701 ["IsTruncated" :content]))) (letvar1617701 "x-amz-abort-rule-id") (clojure.core/assoc :abort-rule-id (deser-abort-rule-id (clojure.core/get-in letvar1617701 ["x-amz-abort-rule-id"]))) (letvar1617701 "PartNumberMarker") (clojure.core/assoc :part-number-marker (deser-part-number-marker (clojure.core/get-in letvar1617701 ["PartNumberMarker" :content]))) (letvar1617701 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1617701 ["Owner" :content]))) (letvar1617701 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar1617701 ["UploadId" :content]))) (letvar1617701 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1617701 ["StorageClass" :content]))) (letvar1617701 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617701 ["x-amz-request-charged"]))) (letvar1617701 "Initiator") (clojure.core/assoc :initiator (deser-initiator (clojure.core/get-in letvar1617701 ["Initiator" :content])))))))

(clojure.core/defn- response-abort-multipart-upload-output ([input] (response-abort-multipart-upload-output nil input)) ([resultWrapper1617703 input] (clojure.core/let [rawinput1617702 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617704 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617704 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617704 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-head-object-output ([input] (response-head-object-output nil input)) ([resultWrapper1617706 input] (clojure.core/let [rawinput1617705 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617707 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-object-lock-retain-until-date" (clojure.core/get-in input [:headers "x-amz-object-lock-retain-until-date"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "Last-Modified" (clojure.core/get-in input [:headers "Last-Modified"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-meta-" (clojure.core/get-in input [:headers "x-amz-meta-"]), "x-amz-restore" (clojure.core/get-in input [:headers "x-amz-restore"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-replication-status" (clojure.core/get-in input [:headers "x-amz-replication-status"]), "Content-Disposition" (clojure.core/get-in input [:headers "Content-Disposition"]), "x-amz-missing-meta" (clojure.core/get-in input [:headers "x-amz-missing-meta"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "Cache-Control" (clojure.core/get-in input [:headers "Cache-Control"]), "accept-ranges" (clojure.core/get-in input [:headers "accept-ranges"]), "x-amz-website-redirect-location" (clojure.core/get-in input [:headers "x-amz-website-redirect-location"]), "Content-Length" (clojure.core/get-in input [:headers "Content-Length"]), "Content-Language" (clojure.core/get-in input [:headers "Content-Language"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-object-lock-mode" (clojure.core/get-in input [:headers "x-amz-object-lock-mode"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-mp-parts-count" (clojure.core/get-in input [:headers "x-amz-mp-parts-count"]), "Content-Encoding" (clojure.core/get-in input [:headers "Content-Encoding"]), "x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-storage-class" (clojure.core/get-in input [:headers "x-amz-storage-class"]), "x-amz-object-lock-legal-hold" (clojure.core/get-in input [:headers "x-amz-object-lock-legal-hold"]), "Expires" (clojure.core/get-in input [:headers "Expires"])}] (clojure.core/cond-> {} (letvar1617707 "x-amz-missing-meta") (clojure.core/assoc :missing-meta (deser-missing-meta (clojure.core/get-in letvar1617707 ["x-amz-missing-meta"]))) (letvar1617707 "Content-Encoding") (clojure.core/assoc :content-encoding (deser-content-encoding (clojure.core/get-in letvar1617707 ["Content-Encoding"]))) (letvar1617707 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1617707 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1617707 "x-amz-website-redirect-location") (clojure.core/assoc :website-redirect-location (deser-website-redirect-location (clojure.core/get-in letvar1617707 ["x-amz-website-redirect-location"]))) (letvar1617707 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1617707 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1617707 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617707 ["x-amz-version-id"]))) (letvar1617707 "accept-ranges") (clojure.core/assoc :accept-ranges (deser-accept-ranges (clojure.core/get-in letvar1617707 ["accept-ranges"]))) (letvar1617707 "x-amz-replication-status") (clojure.core/assoc :replication-status (deser-replication-status (clojure.core/get-in letvar1617707 ["x-amz-replication-status"]))) (letvar1617707 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1617707 ["x-amz-server-side-encryption"]))) (letvar1617707 "Content-Disposition") (clojure.core/assoc :content-disposition (deser-content-disposition (clojure.core/get-in letvar1617707 ["Content-Disposition"]))) (letvar1617707 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1617707 ["ETag"]))) (letvar1617707 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar1617707 ["Content-Type"]))) (letvar1617707 "x-amz-restore") (clojure.core/assoc :restore (deser-restore (clojure.core/get-in letvar1617707 ["x-amz-restore"]))) (letvar1617707 "Content-Length") (clojure.core/assoc :content-length (deser-content-length (clojure.core/get-in letvar1617707 ["Content-Length"]))) (letvar1617707 "Last-Modified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1617707 ["Last-Modified"]))) (letvar1617707 "x-amz-mp-parts-count") (clojure.core/assoc :parts-count (deser-parts-count (clojure.core/get-in letvar1617707 ["x-amz-mp-parts-count"]))) (letvar1617707 "x-amz-object-lock-legal-hold") (clojure.core/assoc :object-lock-legal-hold-status (deser-object-lock-legal-hold-status (clojure.core/get-in letvar1617707 ["x-amz-object-lock-legal-hold"]))) (letvar1617707 "x-amz-meta-") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar1617707 ["x-amz-meta-" :content]))) (letvar1617707 "Cache-Control") (clojure.core/assoc :cache-control (deser-cache-control (clojure.core/get-in letvar1617707 ["Cache-Control"]))) (letvar1617707 "Content-Language") (clojure.core/assoc :content-language (deser-content-language (clojure.core/get-in letvar1617707 ["Content-Language"]))) (letvar1617707 "x-amz-storage-class") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1617707 ["x-amz-storage-class"]))) (letvar1617707 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar1617707 ["x-amz-delete-marker"]))) (letvar1617707 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617707 ["x-amz-request-charged"]))) (letvar1617707 "Expires") (clojure.core/assoc :expires (deser-expires (clojure.core/get-in letvar1617707 ["Expires"]))) (letvar1617707 "x-amz-object-lock-retain-until-date") (clojure.core/assoc :object-lock-retain-until-date (deser-object-lock-retain-until-date (clojure.core/get-in letvar1617707 ["x-amz-object-lock-retain-until-date"]))) (letvar1617707 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1617707 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1617707 "x-amz-object-lock-mode") (clojure.core/assoc :object-lock-mode (deser-object-lock-mode (clojure.core/get-in letvar1617707 ["x-amz-object-lock-mode"]))) (letvar1617707 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1617707 ["x-amz-expiration"])))))))

(clojure.core/defn- response-get-bucket-cors-output ([input] (response-get-bucket-cors-output nil input)) ([resultWrapper1617709 input] (clojure.core/let [rawinput1617708 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617710 {"CORSRule" (portkey.aws/search-for-tag rawinput1617708 "CORSRule" :flattened? true :result-wrapper resultWrapper1617709)}] (clojure.core/cond-> {} (letvar1617710 "CORSRule") (clojure.core/assoc :cors-rules (deser-cors-rules (clojure.core/get-in letvar1617710 ["CORSRule"])))))))

(clojure.core/defn- response-get-bucket-website-output ([input] (response-get-bucket-website-output nil input)) ([resultWrapper1617712 input] (clojure.core/let [rawinput1617711 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617713 {"RedirectAllRequestsTo" (portkey.aws/search-for-tag rawinput1617711 "RedirectAllRequestsTo" :flattened? nil :result-wrapper resultWrapper1617712), "IndexDocument" (portkey.aws/search-for-tag rawinput1617711 "IndexDocument" :flattened? nil :result-wrapper resultWrapper1617712), "ErrorDocument" (portkey.aws/search-for-tag rawinput1617711 "ErrorDocument" :flattened? nil :result-wrapper resultWrapper1617712), "RoutingRules" (portkey.aws/search-for-tag rawinput1617711 "RoutingRules" :flattened? nil :result-wrapper resultWrapper1617712)}] (clojure.core/cond-> {} (letvar1617713 "RedirectAllRequestsTo") (clojure.core/assoc :redirect-all-requests-to (deser-redirect-all-requests-to (clojure.core/get-in letvar1617713 ["RedirectAllRequestsTo" :content]))) (letvar1617713 "IndexDocument") (clojure.core/assoc :index-document (deser-index-document (clojure.core/get-in letvar1617713 ["IndexDocument" :content]))) (letvar1617713 "ErrorDocument") (clojure.core/assoc :error-document (deser-error-document (clojure.core/get-in letvar1617713 ["ErrorDocument" :content]))) (letvar1617713 "RoutingRules") (clojure.core/assoc :routing-rules (deser-routing-rules (clojure.core/get-in letvar1617713 ["RoutingRules" :content])))))))

(clojure.core/defn- response-bucket-already-exists ([input] (response-bucket-already-exists nil input)) ([resultWrapper1617715 input] (clojure.core/let [rawinput1617714 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617716 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-objects-v-2-output ([input] (response-list-objects-v-2-output nil input)) ([resultWrapper1617718 input] (clojure.core/let [rawinput1617717 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617719 {"KeyCount" (portkey.aws/search-for-tag rawinput1617717 "KeyCount" :flattened? nil :result-wrapper resultWrapper1617718), "Prefix" (portkey.aws/search-for-tag rawinput1617717 "Prefix" :flattened? nil :result-wrapper resultWrapper1617718), "EncodingType" (portkey.aws/search-for-tag rawinput1617717 "EncodingType" :flattened? nil :result-wrapper resultWrapper1617718), "StartAfter" (portkey.aws/search-for-tag rawinput1617717 "StartAfter" :flattened? nil :result-wrapper resultWrapper1617718), "IsTruncated" (portkey.aws/search-for-tag rawinput1617717 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1617718), "CommonPrefixes" (portkey.aws/search-for-tag rawinput1617717 "CommonPrefixes" :flattened? true :result-wrapper resultWrapper1617718), "Contents" (portkey.aws/search-for-tag rawinput1617717 "Contents" :flattened? true :result-wrapper resultWrapper1617718), "ContinuationToken" (portkey.aws/search-for-tag rawinput1617717 "ContinuationToken" :flattened? nil :result-wrapper resultWrapper1617718), "Delimiter" (portkey.aws/search-for-tag rawinput1617717 "Delimiter" :flattened? nil :result-wrapper resultWrapper1617718), "NextContinuationToken" (portkey.aws/search-for-tag rawinput1617717 "NextContinuationToken" :flattened? nil :result-wrapper resultWrapper1617718), "Name" (portkey.aws/search-for-tag rawinput1617717 "Name" :flattened? nil :result-wrapper resultWrapper1617718), "MaxKeys" (portkey.aws/search-for-tag rawinput1617717 "MaxKeys" :flattened? nil :result-wrapper resultWrapper1617718)}] (clojure.core/cond-> {} (letvar1617719 "KeyCount") (clojure.core/assoc :key-count (deser-key-count (clojure.core/get-in letvar1617719 ["KeyCount" :content]))) (letvar1617719 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar1617719 ["Prefix" :content]))) (letvar1617719 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar1617719 ["EncodingType" :content]))) (letvar1617719 "StartAfter") (clojure.core/assoc :start-after (deser-start-after (clojure.core/get-in letvar1617719 ["StartAfter" :content]))) (letvar1617719 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1617719 ["IsTruncated" :content]))) (letvar1617719 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar1617719 ["CommonPrefixes"]))) (letvar1617719 "Contents") (clojure.core/assoc :contents (deser-object-list (clojure.core/get-in letvar1617719 ["Contents"]))) (letvar1617719 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar1617719 ["ContinuationToken" :content]))) (letvar1617719 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar1617719 ["Delimiter" :content]))) (letvar1617719 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar1617719 ["NextContinuationToken" :content]))) (letvar1617719 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar1617719 ["Name" :content]))) (letvar1617719 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar1617719 ["MaxKeys" :content])))))))

(clojure.core/defn- response-select-object-content-output ([input] (response-select-object-content-output nil input)) ([resultWrapper1617721 input] (clojure.core/let [rawinput1617720 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617722 {"Payload" (portkey.aws/search-for-tag rawinput1617720 "Payload" :flattened? nil :result-wrapper resultWrapper1617721)}] (clojure.core/cond-> {} (letvar1617722 "Payload") (clojure.core/assoc :payload (deser-select-object-content-event-stream (clojure.core/get-in letvar1617722 ["Payload" :content])))))))

(clojure.core/defn- response-no-such-upload ([input] (response-no-such-upload nil input)) ([resultWrapper1617724 input] (clojure.core/let [rawinput1617723 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617725 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-no-such-bucket ([input] (response-no-such-bucket nil input)) ([resultWrapper1617727 input] (clojure.core/let [rawinput1617726 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617728 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-bucket-accelerate-configuration-output ([input] (response-get-bucket-accelerate-configuration-output nil input)) ([resultWrapper1617730 input] (clojure.core/let [rawinput1617729 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617731 {"Status" (portkey.aws/search-for-tag rawinput1617729 "Status" :flattened? nil :result-wrapper resultWrapper1617730)}] (clojure.core/cond-> {} (letvar1617731 "Status") (clojure.core/assoc :status (deser-bucket-accelerate-status (clojure.core/get-in letvar1617731 ["Status" :content])))))))

(clojure.core/defn- response-restore-object-output ([input] (response-restore-object-output nil input)) ([resultWrapper1617733 input] (clojure.core/let [rawinput1617732 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617734 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-restore-output-path" (clojure.core/get-in input [:headers "x-amz-restore-output-path"])}] (clojure.core/cond-> {} (letvar1617734 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617734 ["x-amz-request-charged"]))) (letvar1617734 "x-amz-restore-output-path") (clojure.core/assoc :restore-output-path (deser-restore-output-path (clojure.core/get-in letvar1617734 ["x-amz-restore-output-path"])))))))

(clojure.core/defn- response-get-object-output ([input] (response-get-object-output nil input)) ([resultWrapper1617736 input] (clojure.core/let [rawinput1617735 (:body input) letvar1617737 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-object-lock-retain-until-date" (clojure.core/get-in input [:headers "x-amz-object-lock-retain-until-date"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-tagging-count" (clojure.core/get-in input [:headers "x-amz-tagging-count"]), "Body" rawinput1617735, "Content-Range" (clojure.core/get-in input [:headers "Content-Range"]), "Last-Modified" (clojure.core/get-in input [:headers "Last-Modified"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-meta-" (clojure.core/get-in input [:headers "x-amz-meta-"]), "x-amz-restore" (clojure.core/get-in input [:headers "x-amz-restore"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-replication-status" (clojure.core/get-in input [:headers "x-amz-replication-status"]), "Content-Disposition" (clojure.core/get-in input [:headers "Content-Disposition"]), "x-amz-missing-meta" (clojure.core/get-in input [:headers "x-amz-missing-meta"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "Cache-Control" (clojure.core/get-in input [:headers "Cache-Control"]), "accept-ranges" (clojure.core/get-in input [:headers "accept-ranges"]), "x-amz-website-redirect-location" (clojure.core/get-in input [:headers "x-amz-website-redirect-location"]), "Content-Length" (clojure.core/get-in input [:headers "Content-Length"]), "Content-Language" (clojure.core/get-in input [:headers "Content-Language"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-object-lock-mode" (clojure.core/get-in input [:headers "x-amz-object-lock-mode"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-mp-parts-count" (clojure.core/get-in input [:headers "x-amz-mp-parts-count"]), "Content-Encoding" (clojure.core/get-in input [:headers "Content-Encoding"]), "x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-storage-class" (clojure.core/get-in input [:headers "x-amz-storage-class"]), "x-amz-object-lock-legal-hold" (clojure.core/get-in input [:headers "x-amz-object-lock-legal-hold"]), "Expires" (clojure.core/get-in input [:headers "Expires"])}] (clojure.core/cond-> {} (letvar1617737 "x-amz-missing-meta") (clojure.core/assoc :missing-meta (deser-missing-meta (clojure.core/get-in letvar1617737 ["x-amz-missing-meta"]))) (letvar1617737 "Content-Encoding") (clojure.core/assoc :content-encoding (deser-content-encoding (clojure.core/get-in letvar1617737 ["Content-Encoding"]))) (letvar1617737 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1617737 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1617737 "x-amz-website-redirect-location") (clojure.core/assoc :website-redirect-location (deser-website-redirect-location (clojure.core/get-in letvar1617737 ["x-amz-website-redirect-location"]))) (letvar1617737 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1617737 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1617737 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617737 ["x-amz-version-id"]))) (letvar1617737 "Body") (clojure.core/assoc :body (deser-body (clojure.core/get-in letvar1617737 ["Body"]))) (letvar1617737 "Content-Range") (clojure.core/assoc :content-range (deser-content-range (clojure.core/get-in letvar1617737 ["Content-Range"]))) (letvar1617737 "accept-ranges") (clojure.core/assoc :accept-ranges (deser-accept-ranges (clojure.core/get-in letvar1617737 ["accept-ranges"]))) (letvar1617737 "x-amz-replication-status") (clojure.core/assoc :replication-status (deser-replication-status (clojure.core/get-in letvar1617737 ["x-amz-replication-status"]))) (letvar1617737 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1617737 ["x-amz-server-side-encryption"]))) (letvar1617737 "Content-Disposition") (clojure.core/assoc :content-disposition (deser-content-disposition (clojure.core/get-in letvar1617737 ["Content-Disposition"]))) (letvar1617737 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1617737 ["ETag"]))) (letvar1617737 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar1617737 ["Content-Type"]))) (letvar1617737 "x-amz-restore") (clojure.core/assoc :restore (deser-restore (clojure.core/get-in letvar1617737 ["x-amz-restore"]))) (letvar1617737 "x-amz-tagging-count") (clojure.core/assoc :tag-count (deser-tag-count (clojure.core/get-in letvar1617737 ["x-amz-tagging-count"]))) (letvar1617737 "Content-Length") (clojure.core/assoc :content-length (deser-content-length (clojure.core/get-in letvar1617737 ["Content-Length"]))) (letvar1617737 "Last-Modified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar1617737 ["Last-Modified"]))) (letvar1617737 "x-amz-mp-parts-count") (clojure.core/assoc :parts-count (deser-parts-count (clojure.core/get-in letvar1617737 ["x-amz-mp-parts-count"]))) (letvar1617737 "x-amz-object-lock-legal-hold") (clojure.core/assoc :object-lock-legal-hold-status (deser-object-lock-legal-hold-status (clojure.core/get-in letvar1617737 ["x-amz-object-lock-legal-hold"]))) (letvar1617737 "x-amz-meta-") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar1617737 ["x-amz-meta-" :content]))) (letvar1617737 "Cache-Control") (clojure.core/assoc :cache-control (deser-cache-control (clojure.core/get-in letvar1617737 ["Cache-Control"]))) (letvar1617737 "Content-Language") (clojure.core/assoc :content-language (deser-content-language (clojure.core/get-in letvar1617737 ["Content-Language"]))) (letvar1617737 "x-amz-storage-class") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar1617737 ["x-amz-storage-class"]))) (letvar1617737 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar1617737 ["x-amz-delete-marker"]))) (letvar1617737 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617737 ["x-amz-request-charged"]))) (letvar1617737 "Expires") (clojure.core/assoc :expires (deser-expires (clojure.core/get-in letvar1617737 ["Expires"]))) (letvar1617737 "x-amz-object-lock-retain-until-date") (clojure.core/assoc :object-lock-retain-until-date (deser-object-lock-retain-until-date (clojure.core/get-in letvar1617737 ["x-amz-object-lock-retain-until-date"]))) (letvar1617737 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1617737 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1617737 "x-amz-object-lock-mode") (clojure.core/assoc :object-lock-mode (deser-object-lock-mode (clojure.core/get-in letvar1617737 ["x-amz-object-lock-mode"]))) (letvar1617737 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1617737 ["x-amz-expiration"])))))))

(clojure.core/defn- response-complete-multipart-upload-output ([input] (response-complete-multipart-upload-output nil input)) ([resultWrapper1617739 input] (clojure.core/let [rawinput1617738 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617740 {"Bucket" (portkey.aws/search-for-tag rawinput1617738 "Bucket" :flattened? nil :result-wrapper resultWrapper1617739), "x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "Location" (portkey.aws/search-for-tag rawinput1617738 "Location" :flattened? nil :result-wrapper resultWrapper1617739), "ETag" (portkey.aws/search-for-tag rawinput1617738 "ETag" :flattened? nil :result-wrapper resultWrapper1617739), "Key" (portkey.aws/search-for-tag rawinput1617738 "Key" :flattened? nil :result-wrapper resultWrapper1617739), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617740 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar1617740 ["Bucket" :content]))) (letvar1617740 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617740 ["x-amz-version-id"]))) (letvar1617740 "Location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar1617740 ["Location" :content]))) (letvar1617740 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1617740 ["x-amz-server-side-encryption"]))) (letvar1617740 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1617740 ["ETag" :content]))) (letvar1617740 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar1617740 ["Key" :content]))) (letvar1617740 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617740 ["x-amz-request-charged"]))) (letvar1617740 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1617740 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1617740 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1617740 ["x-amz-expiration"])))))))

(clojure.core/defn- response-notification-configuration-deprecated ([input] (response-notification-configuration-deprecated nil input)) ([resultWrapper1617742 input] (clojure.core/let [rawinput1617741 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617743 {"TopicConfiguration" (portkey.aws/search-for-tag rawinput1617741 "TopicConfiguration" :flattened? nil :result-wrapper resultWrapper1617742), "QueueConfiguration" (portkey.aws/search-for-tag rawinput1617741 "QueueConfiguration" :flattened? nil :result-wrapper resultWrapper1617742), "CloudFunctionConfiguration" (portkey.aws/search-for-tag rawinput1617741 "CloudFunctionConfiguration" :flattened? nil :result-wrapper resultWrapper1617742)}] (clojure.core/cond-> {} (letvar1617743 "TopicConfiguration") (clojure.core/assoc :topic-configuration (deser-topic-configuration-deprecated (clojure.core/get-in letvar1617743 ["TopicConfiguration" :content]))) (letvar1617743 "QueueConfiguration") (clojure.core/assoc :queue-configuration (deser-queue-configuration-deprecated (clojure.core/get-in letvar1617743 ["QueueConfiguration" :content]))) (letvar1617743 "CloudFunctionConfiguration") (clojure.core/assoc :cloud-function-configuration (deser-cloud-function-configuration (clojure.core/get-in letvar1617743 ["CloudFunctionConfiguration" :content])))))))

(clojure.core/defn- response-delete-object-tagging-output ([input] (response-delete-object-tagging-output nil input)) ([resultWrapper1617745 input] (clojure.core/let [rawinput1617744 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617746 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"])}] (clojure.core/cond-> {} (letvar1617746 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617746 ["x-amz-version-id"])))))))

(clojure.core/defn- response-upload-part-output ([input] (response-upload-part-output nil input)) ([resultWrapper1617748 input] (clojure.core/let [rawinput1617747 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617749 {"x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617749 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1617749 ["x-amz-server-side-encryption"]))) (letvar1617749 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1617749 ["ETag"]))) (letvar1617749 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1617749 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1617749 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1617749 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1617749 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1617749 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1617749 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617749 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-bucket-acl-output ([input] (response-get-bucket-acl-output nil input)) ([resultWrapper1617751 input] (clojure.core/let [rawinput1617750 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617752 {"Owner" (portkey.aws/search-for-tag rawinput1617750 "Owner" :flattened? nil :result-wrapper resultWrapper1617751), "AccessControlList" (portkey.aws/search-for-tag rawinput1617750 "AccessControlList" :flattened? nil :result-wrapper resultWrapper1617751)}] (clojure.core/cond-> {} (letvar1617752 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1617752 ["Owner" :content]))) (letvar1617752 "AccessControlList") (clojure.core/assoc :grants (deser-grants (clojure.core/get-in letvar1617752 ["AccessControlList" :content])))))))

(clojure.core/defn- response-get-bucket-request-payment-output ([input] (response-get-bucket-request-payment-output nil input)) ([resultWrapper1617754 input] (clojure.core/let [rawinput1617753 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617755 {"Payer" (portkey.aws/search-for-tag rawinput1617753 "Payer" :flattened? nil :result-wrapper resultWrapper1617754)}] (clojure.core/cond-> {} (letvar1617755 "Payer") (clojure.core/assoc :payer (deser-payer (clojure.core/get-in letvar1617755 ["Payer" :content])))))))

(clojure.core/defn- response-get-bucket-tagging-output ([input] (response-get-bucket-tagging-output nil input)) ([resultWrapper1617757 input] (clojure.core/let [rawinput1617756 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617758 {"TagSet" (portkey.aws/search-for-tag rawinput1617756 "TagSet" :flattened? nil :result-wrapper resultWrapper1617757)}] (clojure.core/cond-> {:tag-set (deser-tag-set (clojure.core/get-in letvar1617758 ["TagSet" :content]))}))))

(clojure.core/defn- response-get-bucket-lifecycle-configuration-output ([input] (response-get-bucket-lifecycle-configuration-output nil input)) ([resultWrapper1617760 input] (clojure.core/let [rawinput1617759 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617761 {"Rule" (portkey.aws/search-for-tag rawinput1617759 "Rule" :flattened? true :result-wrapper resultWrapper1617760)}] (clojure.core/cond-> {} (letvar1617761 "Rule") (clojure.core/assoc :rules (deser-lifecycle-rules (clojure.core/get-in letvar1617761 ["Rule"])))))))

(clojure.core/defn- response-get-bucket-location-output ([input] (response-get-bucket-location-output nil input)) ([resultWrapper1617763 input] (clojure.core/let [rawinput1617762 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617764 {"LocationConstraint" (portkey.aws/search-for-tag rawinput1617762 "LocationConstraint" :flattened? nil :result-wrapper resultWrapper1617763)}] (clojure.core/cond-> {} (letvar1617764 "LocationConstraint") (clojure.core/assoc :location-constraint (deser-bucket-location-constraint (clojure.core/get-in letvar1617764 ["LocationConstraint" :content])))))))

(clojure.core/defn- response-get-bucket-inventory-configuration-output ([input] (response-get-bucket-inventory-configuration-output nil input)) ([resultWrapper1617766 input] (clojure.core/let [rawinput1617765 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617767 {"InventoryConfiguration" (portkey.aws/search-for-tag rawinput1617765 "InventoryConfiguration" :flattened? nil :result-wrapper resultWrapper1617766)}] (clojure.core/cond-> {} (letvar1617767 "InventoryConfiguration") (clojure.core/assoc :inventory-configuration (deser-inventory-configuration (clojure.core/get-in letvar1617767 ["InventoryConfiguration" :content])))))))

(clojure.core/defn- response-get-bucket-versioning-output ([input] (response-get-bucket-versioning-output nil input)) ([resultWrapper1617769 input] (clojure.core/let [rawinput1617768 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617770 {"Status" (portkey.aws/search-for-tag rawinput1617768 "Status" :flattened? nil :result-wrapper resultWrapper1617769), "MfaDelete" (portkey.aws/search-for-tag rawinput1617768 "MfaDelete" :flattened? nil :result-wrapper resultWrapper1617769)}] (clojure.core/cond-> {} (letvar1617770 "Status") (clojure.core/assoc :status (deser-bucket-versioning-status (clojure.core/get-in letvar1617770 ["Status" :content]))) (letvar1617770 "MfaDelete") (clojure.core/assoc :mfa-delete (deser-mfa-delete-status (clojure.core/get-in letvar1617770 ["MfaDelete" :content])))))))

(clojure.core/defn- response-put-object-acl-output ([input] (response-put-object-acl-output nil input)) ([resultWrapper1617772 input] (clojure.core/let [rawinput1617771 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617773 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617773 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617773 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-upload-part-copy-output ([input] (response-upload-part-copy-output nil input)) ([resultWrapper1617775 input] (clojure.core/let [rawinput1617774 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617776 {"x-amz-copy-source-version-id" (clojure.core/get-in input [:headers "x-amz-copy-source-version-id"]), "CopyPartResult" (portkey.aws/search-for-tag rawinput1617774 "CopyPartResult" :flattened? nil :result-wrapper resultWrapper1617775), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617776 "x-amz-copy-source-version-id") (clojure.core/assoc :copy-source-version-id (deser-copy-source-version-id (clojure.core/get-in letvar1617776 ["x-amz-copy-source-version-id"]))) (letvar1617776 "CopyPartResult") (clojure.core/assoc :copy-part-result (deser-copy-part-result (clojure.core/get-in letvar1617776 ["CopyPartResult" :content]))) (letvar1617776 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1617776 ["x-amz-server-side-encryption"]))) (letvar1617776 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1617776 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1617776 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1617776 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1617776 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1617776 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1617776 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617776 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-list-buckets-output ([input] (response-list-buckets-output nil input)) ([resultWrapper1617778 input] (clojure.core/let [rawinput1617777 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617779 {"Buckets" (portkey.aws/search-for-tag rawinput1617777 "Buckets" :flattened? nil :result-wrapper resultWrapper1617778), "Owner" (portkey.aws/search-for-tag rawinput1617777 "Owner" :flattened? nil :result-wrapper resultWrapper1617778)}] (clojure.core/cond-> {} (letvar1617779 "Buckets") (clojure.core/assoc :buckets (deser-buckets (clojure.core/get-in letvar1617779 ["Buckets" :content]))) (letvar1617779 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1617779 ["Owner" :content])))))))

(clojure.core/defn- response-put-object-output ([input] (response-put-object-output nil input)) ([resultWrapper1617781 input] (clojure.core/let [rawinput1617780 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617782 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617782 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1617782 ["x-amz-expiration"]))) (letvar1617782 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar1617782 ["ETag"]))) (letvar1617782 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1617782 ["x-amz-server-side-encryption"]))) (letvar1617782 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617782 ["x-amz-version-id"]))) (letvar1617782 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1617782 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1617782 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1617782 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1617782 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1617782 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1617782 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617782 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-object-acl-output ([input] (response-get-object-acl-output nil input)) ([resultWrapper1617784 input] (clojure.core/let [rawinput1617783 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617785 {"Owner" (portkey.aws/search-for-tag rawinput1617783 "Owner" :flattened? nil :result-wrapper resultWrapper1617784), "AccessControlList" (portkey.aws/search-for-tag rawinput1617783 "AccessControlList" :flattened? nil :result-wrapper resultWrapper1617784), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617785 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar1617785 ["Owner" :content]))) (letvar1617785 "AccessControlList") (clojure.core/assoc :grants (deser-grants (clojure.core/get-in letvar1617785 ["AccessControlList" :content]))) (letvar1617785 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617785 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-list-bucket-analytics-configurations-output ([input] (response-list-bucket-analytics-configurations-output nil input)) ([resultWrapper1617787 input] (clojure.core/let [rawinput1617786 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617788 {"IsTruncated" (portkey.aws/search-for-tag rawinput1617786 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1617787), "ContinuationToken" (portkey.aws/search-for-tag rawinput1617786 "ContinuationToken" :flattened? nil :result-wrapper resultWrapper1617787), "NextContinuationToken" (portkey.aws/search-for-tag rawinput1617786 "NextContinuationToken" :flattened? nil :result-wrapper resultWrapper1617787), "AnalyticsConfiguration" (portkey.aws/search-for-tag rawinput1617786 "AnalyticsConfiguration" :flattened? true :result-wrapper resultWrapper1617787)}] (clojure.core/cond-> {} (letvar1617788 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1617788 ["IsTruncated" :content]))) (letvar1617788 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar1617788 ["ContinuationToken" :content]))) (letvar1617788 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar1617788 ["NextContinuationToken" :content]))) (letvar1617788 "AnalyticsConfiguration") (clojure.core/assoc :analytics-configuration-list (deser-analytics-configuration-list (clojure.core/get-in letvar1617788 ["AnalyticsConfiguration"])))))))

(clojure.core/defn- response-object-already-in-active-tier-error ([input] (response-object-already-in-active-tier-error nil input)) ([resultWrapper1617790 input] (clojure.core/let [rawinput1617789 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617791 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-bucket-policy-output ([input] (response-get-bucket-policy-output nil input)) ([resultWrapper1617793 input] (clojure.core/let [rawinput1617792 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617794 {"Policy" (portkey.aws/search-for-tag rawinput1617792 "Policy" :flattened? nil :result-wrapper resultWrapper1617793)}] (clojure.core/cond-> {} (letvar1617794 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar1617794 ["Policy" :content])))))))

(clojure.core/defn- response-notification-configuration ([input] (response-notification-configuration nil input)) ([resultWrapper1617796 input] (clojure.core/let [rawinput1617795 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617797 {"TopicConfiguration" (portkey.aws/search-for-tag rawinput1617795 "TopicConfiguration" :flattened? true :result-wrapper resultWrapper1617796), "QueueConfiguration" (portkey.aws/search-for-tag rawinput1617795 "QueueConfiguration" :flattened? true :result-wrapper resultWrapper1617796), "CloudFunctionConfiguration" (portkey.aws/search-for-tag rawinput1617795 "CloudFunctionConfiguration" :flattened? true :result-wrapper resultWrapper1617796)}] (clojure.core/cond-> {} (letvar1617797 "TopicConfiguration") (clojure.core/assoc :topic-configurations (deser-topic-configuration-list (clojure.core/get-in letvar1617797 ["TopicConfiguration"]))) (letvar1617797 "QueueConfiguration") (clojure.core/assoc :queue-configurations (deser-queue-configuration-list (clojure.core/get-in letvar1617797 ["QueueConfiguration"]))) (letvar1617797 "CloudFunctionConfiguration") (clojure.core/assoc :lambda-function-configurations (deser-lambda-function-configuration-list (clojure.core/get-in letvar1617797 ["CloudFunctionConfiguration"])))))))

(clojure.core/defn- response-put-object-retention-output ([input] (response-put-object-retention-output nil input)) ([resultWrapper1617799 input] (clojure.core/let [rawinput1617798 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617800 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617800 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617800 ["x-amz-request-charged"])))))))

(clojure.core/defn- response-get-public-access-block-output ([input] (response-get-public-access-block-output nil input)) ([resultWrapper1617802 input] (clojure.core/let [rawinput1617801 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617803 {"PublicAccessBlockConfiguration" (portkey.aws/search-for-tag rawinput1617801 "PublicAccessBlockConfiguration" :flattened? nil :result-wrapper resultWrapper1617802)}] (clojure.core/cond-> {} (letvar1617803 "PublicAccessBlockConfiguration") (clojure.core/assoc :public-access-block-configuration (deser-public-access-block-configuration (clojure.core/get-in letvar1617803 ["PublicAccessBlockConfiguration" :content])))))))

(clojure.core/defn- response-no-such-key ([input] (response-no-such-key nil input)) ([resultWrapper1617805 input] (clojure.core/let [rawinput1617804 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617806 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-copy-object-output ([input] (response-copy-object-output nil input)) ([resultWrapper1617808 input] (clojure.core/let [rawinput1617807 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617809 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-copy-source-version-id" (clojure.core/get-in input [:headers "x-amz-copy-source-version-id"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "CopyObjectResult" (portkey.aws/search-for-tag rawinput1617807 "CopyObjectResult" :flattened? nil :result-wrapper resultWrapper1617808), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar1617809 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar1617809 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar1617809 "x-amz-copy-source-version-id") (clojure.core/assoc :copy-source-version-id (deser-copy-source-version-id (clojure.core/get-in letvar1617809 ["x-amz-copy-source-version-id"]))) (letvar1617809 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar1617809 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar1617809 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar1617809 ["x-amz-version-id"]))) (letvar1617809 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar1617809 ["x-amz-server-side-encryption"]))) (letvar1617809 "CopyObjectResult") (clojure.core/assoc :copy-object-result (deser-copy-object-result (clojure.core/get-in letvar1617809 ["CopyObjectResult" :content]))) (letvar1617809 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar1617809 ["x-amz-request-charged"]))) (letvar1617809 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar1617809 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar1617809 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar1617809 ["x-amz-expiration"])))))))

(clojure.core/defn- response-get-bucket-metrics-configuration-output ([input] (response-get-bucket-metrics-configuration-output nil input)) ([resultWrapper1617811 input] (clojure.core/let [rawinput1617810 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617812 {"MetricsConfiguration" (portkey.aws/search-for-tag rawinput1617810 "MetricsConfiguration" :flattened? nil :result-wrapper resultWrapper1617811)}] (clojure.core/cond-> {} (letvar1617812 "MetricsConfiguration") (clojure.core/assoc :metrics-configuration (deser-metrics-configuration (clojure.core/get-in letvar1617812 ["MetricsConfiguration" :content])))))))

(clojure.core/defn- response-object-not-in-active-tier-error ([input] (response-object-not-in-active-tier-error nil input)) ([resultWrapper1617814 input] (clojure.core/let [rawinput1617813 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617815 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-bucket-replication-output ([input] (response-get-bucket-replication-output nil input)) ([resultWrapper1617817 input] (clojure.core/let [rawinput1617816 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1617818 {"ReplicationConfiguration" (portkey.aws/search-for-tag rawinput1617816 "ReplicationConfiguration" :flattened? nil :result-wrapper resultWrapper1617817)}] (clojure.core/cond-> {} (letvar1617818 "ReplicationConfiguration") (clojure.core/assoc :replication-configuration (deser-replication-configuration (clojure.core/get-in letvar1617818 ["ReplicationConfiguration" :content])))))))

(clojure.spec.alpha/def :portkey.aws.s3/mfa-delete #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.put-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/put-object-tagging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.put-object-tagging-output/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.bucket/name (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/bucket (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.bucket/name :portkey.aws.s3/creation-date]))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-tagging-output (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/tag-set] :opt-un [:portkey.aws.s3.get-object-tagging-output/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.delete-object-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.delete-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/delete-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-object-request/bucket :portkey.aws.s3.delete-object-request/key] :opt-un [:portkey.aws.s3/mfa :portkey.aws.s3.delete-object-request/version-id :portkey.aws.s3/request-payer :portkey.aws.s3/bypass-governance-retention]))

(clojure.spec.alpha/def :portkey.aws.s3.list-object-versions-output/versions (clojure.spec.alpha/and :portkey.aws.s3/object-version-list))
(clojure.spec.alpha/def :portkey.aws.s3.list-object-versions-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.list-object-versions-output/name (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/list-object-versions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.list-object-versions-output/versions :portkey.aws.s3/prefix :portkey.aws.s3/encoding-type :portkey.aws.s3/next-key-marker :portkey.aws.s3/is-truncated :portkey.aws.s3.list-object-versions-output/common-prefixes :portkey.aws.s3/version-id-marker :portkey.aws.s3/next-version-id-marker :portkey.aws.s3/delimiter :portkey.aws.s3.list-object-versions-output/name :portkey.aws.s3/max-keys :portkey.aws.s3/key-marker :portkey.aws.s3/delete-markers]))

(clojure.spec.alpha/def :portkey.aws.s3/object-lock-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.metrics-configuration/id (clojure.spec.alpha/and :portkey.aws.s3/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.metrics-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3/metrics-filter))
(clojure.spec.alpha/def :portkey.aws.s3/metrics-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.metrics-configuration/id] :opt-un [:portkey.aws.s3.metrics-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-encryption-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/missing-meta clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.put-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-request/acl (clojure.spec.alpha/and :portkey.aws.s3/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-request/tagging (clojure.spec.alpha/and :portkey.aws.s3/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3/put-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-object-request/bucket :portkey.aws.s3.put-object-request/key] :opt-un [:portkey.aws.s3/content-encoding :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/website-redirect-location :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key :portkey.aws.s3/content-md-5 :portkey.aws.s3/body :portkey.aws.s3/grant-read-acp :portkey.aws.s3/grant-read :portkey.aws.s3/server-side-encryption :portkey.aws.s3/content-disposition :portkey.aws.s3/content-type :portkey.aws.s3.put-object-request/acl :portkey.aws.s3/content-length :portkey.aws.s3/object-lock-legal-hold-status :portkey.aws.s3/metadata :portkey.aws.s3/cache-control :portkey.aws.s3/content-language :portkey.aws.s3/grant-write-acp :portkey.aws.s3/grant-full-control :portkey.aws.s3.put-object-request/tagging :portkey.aws.s3/storage-class :portkey.aws.s3/expires :portkey.aws.s3/object-lock-retain-until-date :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/object-lock-mode :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/cloud-function-invocation-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-lifecycle-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.input-serialization/csv (clojure.spec.alpha/and :portkey.aws.s3/csv-input))
(clojure.spec.alpha/def :portkey.aws.s3.input-serialization/json (clojure.spec.alpha/and :portkey.aws.s3/json-input))
(clojure.spec.alpha/def :portkey.aws.s3.input-serialization/parquet (clojure.spec.alpha/and :portkey.aws.s3/parquet-input))
(clojure.spec.alpha/def :portkey.aws.s3/input-serialization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.input-serialization/csv :portkey.aws.s3/compression-type :portkey.aws.s3.input-serialization/json :portkey.aws.s3.input-serialization/parquet]))

(clojure.spec.alpha/def :portkey.aws.s3/tier #{"Expedited" :bulk "Standard" "Bulk" :standard :expedited})

(clojure.spec.alpha/def :portkey.aws.s3/content-encoding (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-cors-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/setting clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/bucket-already-owned-by-you (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/confirm-remove-self-bucket-access clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/key-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/compression-type #{"GZIP" "NONE" :gzip "BZIP2" :none :bzip-2})

(clojure.spec.alpha/def :portkey.aws.s3/multipart-upload-list (clojure.spec.alpha/coll-of :portkey.aws.s3/multipart-upload))

(clojure.spec.alpha/def :portkey.aws.s3/tagging-directive #{:copy :replace "COPY" "REPLACE"})

(clojure.spec.alpha/def :portkey.aws.s3/tag-set (clojure.spec.alpha/coll-of :portkey.aws.s3/tag))

(clojure.spec.alpha/def :portkey.aws.s3/sse-customer-key-md-5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/routing-rules (clojure.spec.alpha/coll-of :portkey.aws.s3/routing-rule))

(clojure.spec.alpha/def :portkey.aws.s3/expired-object-delete-marker clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/response-expires clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3/replica-kms-key-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/completed-part (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/e-tag :portkey.aws.s3/part-number]))

(clojure.spec.alpha/def :portkey.aws.s3/metrics-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3/metrics-configuration))

(clojure.spec.alpha/def :portkey.aws.s3/notification-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-sse-customer-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/get-object-torrent-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/body :portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3/common-prefix-list (clojure.spec.alpha/coll-of :portkey.aws.s3/common-prefix))

(clojure.spec.alpha/def :portkey.aws.s3.complete-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.complete-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.complete-multipart-upload-request/multipart-upload (clojure.spec.alpha/and :portkey.aws.s3/completed-multipart-upload))
(clojure.spec.alpha/def :portkey.aws.s3.complete-multipart-upload-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3/complete-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.complete-multipart-upload-request/bucket :portkey.aws.s3.complete-multipart-upload-request/key :portkey.aws.s3.complete-multipart-upload-request/upload-id] :opt-un [:portkey.aws.s3.complete-multipart-upload-request/multipart-upload :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-analytics-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/analytics-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-encryption-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/server-side-encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.versioning-configuration/status (clojure.spec.alpha/and :portkey.aws.s3/bucket-versioning-status))
(clojure.spec.alpha/def :portkey.aws.s3/versioning-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/mfa-delete :portkey.aws.s3.versioning-configuration/status]))

(clojure.spec.alpha/def :portkey.aws.s3/continuation-event (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-notification-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-notification-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-notification-configuration-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/if-unmodified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3/object-lock-enabled #{"Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.get-object-legal-hold-output/legal-hold (clojure.spec.alpha/and :portkey.aws.s3/object-lock-legal-hold))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-legal-hold-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.get-object-legal-hold-output/legal-hold]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-website-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/response-content-disposition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/mfa-delete-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3/filter-rule-name #{:suffix "prefix" "suffix" :prefix})

(clojure.spec.alpha/def :portkey.aws.s3/inventory-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-retention-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-retention-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-retention-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-retention-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-object-retention-request/bucket :portkey.aws.s3.get-object-retention-request/key] :opt-un [:portkey.aws.s3.get-object-retention-request/version-id :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-lifecycle-request/bucket] :opt-un [:portkey.aws.s3/content-md-5 :portkey.aws.s3/lifecycle-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-logging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-logging-request/bucket :portkey.aws.s3/bucket-logging-status] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/topic-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3/topic-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.head-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/head-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.head-bucket-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.access-control-translation/owner (clojure.spec.alpha/and :portkey.aws.s3/owner-override))
(clojure.spec.alpha/def :portkey.aws.s3/access-control-translation (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.access-control-translation/owner] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.topic-configuration-deprecated/id (clojure.spec.alpha/and :portkey.aws.s3/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.topic-configuration-deprecated/events (clojure.spec.alpha/and :portkey.aws.s3/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.topic-configuration-deprecated/topic (clojure.spec.alpha/and :portkey.aws.s3/topic-arn))
(clojure.spec.alpha/def :portkey.aws.s3/topic-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.topic-configuration-deprecated/id :portkey.aws.s3.topic-configuration-deprecated/events :portkey.aws.s3/event :portkey.aws.s3.topic-configuration-deprecated/topic]))

(clojure.spec.alpha/def :portkey.aws.s3.object-lock-legal-hold/status (clojure.spec.alpha/and :portkey.aws.s3/object-lock-legal-hold-status))
(clojure.spec.alpha/def :portkey.aws.s3/object-lock-legal-hold (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.object-lock-legal-hold/status]))

(clojure.spec.alpha/def :portkey.aws.s3/glacier-job-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/tier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-lifecycle-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/rules]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-request-payment-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-request-payment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-request-payment-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/website-redirect-location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-logging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/logging-enabled]))

(clojure.spec.alpha/def :portkey.aws.s3/type #{:group :canonical-user "CanonicalUser" "AmazonCustomerByEmail" "Group" :amazon-customer-by-email})

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/storage-class-analysis-schema-version #{"V_1" :v-1})

(clojure.spec.alpha/def :portkey.aws.s3/encoding-type #{"url" :url})

(clojure.spec.alpha/def :portkey.aws.s3.delete-objects-output/deleted (clojure.spec.alpha/and :portkey.aws.s3/deleted-objects))
(clojure.spec.alpha/def :portkey.aws.s3/delete-objects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.delete-objects-output/deleted :portkey.aws.s3/request-charged :portkey.aws.s3/errors]))

(clojure.spec.alpha/def :portkey.aws.s3/sse-kms-encrypted-objects-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.create-bucket-configuration/location-constraint (clojure.spec.alpha/and :portkey.aws.s3/bucket-location-constraint))
(clojure.spec.alpha/def :portkey.aws.s3/create-bucket-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.create-bucket-configuration/location-constraint]))

(clojure.spec.alpha/def :portkey.aws.s3/next-key-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.create-multipart-upload-output/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.create-multipart-upload-output/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.create-multipart-upload-output/upload-id (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3/create-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.create-multipart-upload-output/bucket :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/abort-date :portkey.aws.s3/server-side-encryption :portkey.aws.s3.create-multipart-upload-output/key :portkey.aws.s3/abort-rule-id :portkey.aws.s3.create-multipart-upload-output/upload-id :portkey.aws.s3/request-charged :portkey.aws.s3/ssekms-key-id]))

(clojure.spec.alpha/def :portkey.aws.s3/encryption-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/replica-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.s3/inventory-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.cloud-function-configuration/id (clojure.spec.alpha/and :portkey.aws.s3/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.cloud-function-configuration/events (clojure.spec.alpha/and :portkey.aws.s3/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.cloud-function-configuration/invocation-role (clojure.spec.alpha/and :portkey.aws.s3/cloud-function-invocation-role))
(clojure.spec.alpha/def :portkey.aws.s3/cloud-function-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.cloud-function-configuration/id :portkey.aws.s3/event :portkey.aws.s3.cloud-function-configuration/events :portkey.aws.s3/cloud-function :portkey.aws.s3.cloud-function-configuration/invocation-role]))

(clojure.spec.alpha/def :portkey.aws.s3/request-payment-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/payer] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/inventory-optional-field #{:object-lock-retain-until-date "LastModifiedDate" :storage-class :object-lock-legal-hold-status "ReplicationStatus" "EncryptionStatus" :object-lock-mode "ETag" :size :replication-status "Size" "ObjectLockLegalHoldStatus" "IsMultipartUploaded" "StorageClass" :encryption-status :is-multipart-uploaded :last-modified-date "ObjectLockRetainUntilDate" "ObjectLockMode" :e-tag})

(clojure.spec.alpha/def :portkey.aws.s3/permission #{"WRITE" "FULL_CONTROL" :read :read-acp "READ_ACP" :write-acp :write "WRITE_ACP" "READ" :full-control})

(clojure.spec.alpha/def :portkey.aws.s3/response-content-language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.list-multipart-uploads-output/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.list-multipart-uploads-output/uploads (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-list))
(clojure.spec.alpha/def :portkey.aws.s3.list-multipart-uploads-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3/list-multipart-uploads-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.list-multipart-uploads-output/bucket :portkey.aws.s3.list-multipart-uploads-output/uploads :portkey.aws.s3/prefix :portkey.aws.s3/encoding-type :portkey.aws.s3/next-key-marker :portkey.aws.s3/upload-id-marker :portkey.aws.s3/max-uploads :portkey.aws.s3/is-truncated :portkey.aws.s3.list-multipart-uploads-output/common-prefixes :portkey.aws.s3/delimiter :portkey.aws.s3/key-marker :portkey.aws.s3/next-upload-id-marker]))

(clojure.spec.alpha/def :portkey.aws.s3/json-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/record-delimiter]))

(clojure.spec.alpha/def :portkey.aws.s3.select-object-content-event-stream/records (clojure.spec.alpha/and :portkey.aws.s3/records-event))
(clojure.spec.alpha/def :portkey.aws.s3.select-object-content-event-stream/stats (clojure.spec.alpha/and :portkey.aws.s3/stats-event))
(clojure.spec.alpha/def :portkey.aws.s3.select-object-content-event-stream/progress (clojure.spec.alpha/and :portkey.aws.s3/progress-event))
(clojure.spec.alpha/def :portkey.aws.s3.select-object-content-event-stream/cont (clojure.spec.alpha/and :portkey.aws.s3/continuation-event))
(clojure.spec.alpha/def :portkey.aws.s3.select-object-content-event-stream/end (clojure.spec.alpha/and :portkey.aws.s3/end-event))
(clojure.spec.alpha/def :portkey.aws.s3/select-object-content-event-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.select-object-content-event-stream/records :portkey.aws.s3.select-object-content-event-stream/stats :portkey.aws.s3.select-object-content-event-stream/progress :portkey.aws.s3.select-object-content-event-stream/cont :portkey.aws.s3.select-object-content-event-stream/end]))

(clojure.spec.alpha/def :portkey.aws.s3.server-side-encryption-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3/server-side-encryption-rules))
(clojure.spec.alpha/def :portkey.aws.s3/server-side-encryption-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.server-side-encryption-configuration/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.target-grant/permission (clojure.spec.alpha/and :portkey.aws.s3/bucket-logs-permission))
(clojure.spec.alpha/def :portkey.aws.s3/target-grant (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/grantee :portkey.aws.s3.target-grant/permission]))

(clojure.spec.alpha/def :portkey.aws.s3.replication-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3/replication-rules))
(clojure.spec.alpha/def :portkey.aws.s3/replication-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/role :portkey.aws.s3.replication-configuration/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/completed-part-list (clojure.spec.alpha/coll-of :portkey.aws.s3/completed-part))

(clojure.spec.alpha/def :portkey.aws.s3/is-public clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/comments (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/sse-customer-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.inventory-schedule/frequency (clojure.spec.alpha/and :portkey.aws.s3/inventory-frequency))
(clojure.spec.alpha/def :portkey.aws.s3/inventory-schedule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.inventory-schedule/frequency] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.transition/storage-class (clojure.spec.alpha/and :portkey.aws.s3/transition-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3/transition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/date :portkey.aws.s3/days :portkey.aws.s3.transition/storage-class]))

(clojure.spec.alpha/def :portkey.aws.s3/metadata-directive #{:copy :replace "COPY" "REPLACE"})

(clojure.spec.alpha/def :portkey.aws.s3.multipart-upload/upload-id (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.multipart-upload/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3/multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.multipart-upload/upload-id :portkey.aws.s3.multipart-upload/key :portkey.aws.s3/initiated :portkey.aws.s3/storage-class :portkey.aws.s3/owner :portkey.aws.s3/initiator]))

(clojure.spec.alpha/def :portkey.aws.s3.analytics-export-destination/s-3-bucket-destination (clojure.spec.alpha/and :portkey.aws.s3/analytics-s-3-bucket-destination))
(clojure.spec.alpha/def :portkey.aws.s3/analytics-export-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.analytics-export-destination/s-3-bucket-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-metrics-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3/token))
(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-metrics-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3/next-token))
(clojure.spec.alpha/def :portkey.aws.s3/list-bucket-metrics-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/is-truncated :portkey.aws.s3.list-bucket-metrics-configurations-output/continuation-token :portkey.aws.s3.list-bucket-metrics-configurations-output/next-continuation-token :portkey.aws.s3/metrics-configuration-list]))

(clojure.spec.alpha/def :portkey.aws.s3/sse-customer-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-request-payment-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-request-payment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-request-payment-request/bucket :portkey.aws.s3/request-payment-configuration] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.list-parts-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.list-parts-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.list-parts-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3/list-parts-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.list-parts-request/bucket :portkey.aws.s3.list-parts-request/key :portkey.aws.s3.list-parts-request/upload-id] :opt-un [:portkey.aws.s3/max-parts :portkey.aws.s3/part-number-marker :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/content-md-5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.storage-class-analysis/data-export (clojure.spec.alpha/and :portkey.aws.s3/storage-class-analysis-data-export))
(clojure.spec.alpha/def :portkey.aws.s3/storage-class-analysis (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.storage-class-analysis/data-export]))

(clojure.spec.alpha/def :portkey.aws.s3/expose-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-object-tagging-request/bucket :portkey.aws.s3.get-object-tagging-request/key] :opt-un [:portkey.aws.s3.get-object-tagging-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-notification-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-notification-request/notification-configuration (clojure.spec.alpha/and :portkey.aws.s3/notification-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-notification-request/bucket :portkey.aws.s3.put-bucket-notification-request/notification-configuration] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/body clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.s3/delete-marker-replication-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3/allow-quoted-record-delimiter clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-versioning-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-versioning-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-versioning-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/create-bucket-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/location]))

(clojure.spec.alpha/def :portkey.aws.s3.object/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.object/storage-class (clojure.spec.alpha/and :portkey.aws.s3/object-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3/object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.object/key :portkey.aws.s3/last-modified :portkey.aws.s3/e-tag :portkey.aws.s3/size :portkey.aws.s3.object/storage-class :portkey.aws.s3/owner]))

(clojure.spec.alpha/def :portkey.aws.s3/grants (clojure.spec.alpha/coll-of :portkey.aws.s3/grant))

(clojure.spec.alpha/def :portkey.aws.s3/transition-storage-class #{:standard-ia "GLACIER" :glacier "ONEZONE_IA" "STANDARD_IA" :intelligent-tiering "INTELLIGENT_TIERING" :onezone-ia})

(clojure.spec.alpha/def :portkey.aws.s3.lifecycle-rule-filter/and (clojure.spec.alpha/and :portkey.aws.s3/lifecycle-rule-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3/lifecycle-rule-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3/tag :portkey.aws.s3.lifecycle-rule-filter/and]))

(clojure.spec.alpha/def :portkey.aws.s3/payer #{"Requester" :requester "BucketOwner" :bucket-owner})

(clojure.spec.alpha/def :portkey.aws.s3.delete-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/delete-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/delete-marker :portkey.aws.s3.delete-object-output/version-id :portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3/response-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.metrics-filter/and (clojure.spec.alpha/and :portkey.aws.s3/metrics-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3/metrics-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3/tag :portkey.aws.s3.metrics-filter/and]))

(clojure.spec.alpha/def :portkey.aws.s3.inventory-destination/s-3-bucket-destination (clojure.spec.alpha/and :portkey.aws.s3/inventory-s-3-bucket-destination))
(clojure.spec.alpha/def :portkey.aws.s3/inventory-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.inventory-destination/s-3-bucket-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/object-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/grant-read-acp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.json-input/type (clojure.spec.alpha/and :portkey.aws.s3/json-type))
(clojure.spec.alpha/def :portkey.aws.s3/json-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.json-input/type]))

(clojure.spec.alpha/def :portkey.aws.s3.put-object-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-acl-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-acl-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-acl-request/acl (clojure.spec.alpha/and :portkey.aws.s3/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3/put-object-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-object-acl-request/bucket :portkey.aws.s3.put-object-acl-request/key] :opt-un [:portkey.aws.s3.put-object-acl-request/version-id :portkey.aws.s3/content-md-5 :portkey.aws.s3/grant-read-acp :portkey.aws.s3/access-control-policy :portkey.aws.s3/grant-read :portkey.aws.s3.put-object-acl-request/acl :portkey.aws.s3/grant-write :portkey.aws.s3/grant-write-acp :portkey.aws.s3/grant-full-control :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/days-after-initiation clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-lifecycle-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-retention-output/retention (clojure.spec.alpha/and :portkey.aws.s3/object-lock-retention))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-retention-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.get-object-retention-output/retention]))

(clojure.spec.alpha/def :portkey.aws.s3/put-object-lock-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3/copy-part-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/e-tag :portkey.aws.s3/last-modified]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-metrics-configuration-request/bucket :portkey.aws.s3.get-bucket-metrics-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/get-object-lock-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/object-lock-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-versioning-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-versioning-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-versioning-request/bucket :portkey.aws.s3/versioning-configuration] :opt-un [:portkey.aws.s3/content-md-5 :portkey.aws.s3/mfa]))

(clojure.spec.alpha/def :portkey.aws.s3.restore-request/type (clojure.spec.alpha/and :portkey.aws.s3/restore-request-type))
(clojure.spec.alpha/def :portkey.aws.s3/restore-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/days :portkey.aws.s3/glacier-job-parameters :portkey.aws.s3.restore-request/type :portkey.aws.s3/tier :portkey.aws.s3/description :portkey.aws.s3/select-parameters :portkey.aws.s3/output-location]))

(clojure.spec.alpha/def :portkey.aws.s3.replication-rule-filter/and (clojure.spec.alpha/and :portkey.aws.s3/replication-rule-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3/replication-rule-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3/tag :portkey.aws.s3.replication-rule-filter/and]))

(clojure.spec.alpha/def :portkey.aws.s3/deleted-objects (clojure.spec.alpha/coll-of :portkey.aws.s3/deleted-object))

(clojure.spec.alpha/def :portkey.aws.s3/start-after (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.list-objects-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.list-objects-output/contents (clojure.spec.alpha/and :portkey.aws.s3/object-list))
(clojure.spec.alpha/def :portkey.aws.s3.list-objects-output/name (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/list-objects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3/encoding-type :portkey.aws.s3/marker :portkey.aws.s3/is-truncated :portkey.aws.s3.list-objects-output/common-prefixes :portkey.aws.s3.list-objects-output/contents :portkey.aws.s3/next-marker :portkey.aws.s3/delimiter :portkey.aws.s3.list-objects-output/name :portkey.aws.s3/max-keys]))

(clojure.spec.alpha/def :portkey.aws.s3/inventory-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/sses-3 :portkey.aws.s3/ssekms]))

(clojure.spec.alpha/def :portkey.aws.s3/record-delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/replace-key-prefix-with (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/content-range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.metrics-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3/metrics-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3.metrics-and-operator/tags]))

(clojure.spec.alpha/def :portkey.aws.s3.object-lock-configuration/rule (clojure.spec.alpha/and :portkey.aws.s3/object-lock-rule))
(clojure.spec.alpha/def :portkey.aws.s3/object-lock-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/object-lock-enabled :portkey.aws.s3.object-lock-configuration/rule]))

(clojure.spec.alpha/def :portkey.aws.s3.lifecycle-rule/filter (clojure.spec.alpha/and :portkey.aws.s3/lifecycle-rule-filter))
(clojure.spec.alpha/def :portkey.aws.s3.lifecycle-rule/status (clojure.spec.alpha/and :portkey.aws.s3/expiration-status))
(clojure.spec.alpha/def :portkey.aws.s3.lifecycle-rule/transitions (clojure.spec.alpha/and :portkey.aws.s3/transition-list))
(clojure.spec.alpha/def :portkey.aws.s3.lifecycle-rule/noncurrent-version-transitions (clojure.spec.alpha/and :portkey.aws.s3/noncurrent-version-transition-list))
(clojure.spec.alpha/def :portkey.aws.s3.lifecycle-rule/expiration (clojure.spec.alpha/and :portkey.aws.s3/lifecycle-expiration))
(clojure.spec.alpha/def :portkey.aws.s3/lifecycle-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.lifecycle-rule/status] :opt-un [:portkey.aws.s3.lifecycle-rule/filter :portkey.aws.s3/prefix :portkey.aws.s3.lifecycle-rule/transitions :portkey.aws.s3/id :portkey.aws.s3/noncurrent-version-expiration :portkey.aws.s3/abort-incomplete-multipart-upload :portkey.aws.s3.lifecycle-rule/noncurrent-version-transitions :portkey.aws.s3.lifecycle-rule/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3/parts (clojure.spec.alpha/coll-of :portkey.aws.s3/part))

(clojure.spec.alpha/def :portkey.aws.s3.put-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/put-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-object-tagging-request/bucket :portkey.aws.s3.put-object-tagging-request/key :portkey.aws.s3/tagging] :opt-un [:portkey.aws.s3.put-object-tagging-request/version-id :portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/abort-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3/accept-ranges (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-accelerate-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-accelerate-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-accelerate-configuration-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/replication-status #{"REPLICA" :pending :replica "PENDING" "COMPLETE" "FAILED" :complete :failed})

(clojure.spec.alpha/def :portkey.aws.s3/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-policy-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/policy-status]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-encryption-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-replication-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.analytics-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3/analytics-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3.analytics-and-operator/tags]))

(clojure.spec.alpha/def :portkey.aws.s3/lambda-function-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3/lambda-function-configuration))

(clojure.spec.alpha/def :portkey.aws.s3/source-selection-criteria (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/sse-kms-encrypted-objects]))

(clojure.spec.alpha/def :portkey.aws.s3/access-control-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/grants :portkey.aws.s3/owner]))

(clojure.spec.alpha/def :portkey.aws.s3.destination/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.destination/account (clojure.spec.alpha/and :portkey.aws.s3/account-id))
(clojure.spec.alpha/def :portkey.aws.s3/destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.destination/bucket] :opt-un [:portkey.aws.s3.destination/account :portkey.aws.s3/storage-class :portkey.aws.s3/access-control-translation :portkey.aws.s3/encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3/max-parts clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.public-access-block-configuration/block-public-acls (clojure.spec.alpha/and :portkey.aws.s3/setting))
(clojure.spec.alpha/def :portkey.aws.s3.public-access-block-configuration/ignore-public-acls (clojure.spec.alpha/and :portkey.aws.s3/setting))
(clojure.spec.alpha/def :portkey.aws.s3.public-access-block-configuration/block-public-policy (clojure.spec.alpha/and :portkey.aws.s3/setting))
(clojure.spec.alpha/def :portkey.aws.s3.public-access-block-configuration/restrict-public-buckets (clojure.spec.alpha/and :portkey.aws.s3/setting))
(clojure.spec.alpha/def :portkey.aws.s3/public-access-block-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.public-access-block-configuration/block-public-acls :portkey.aws.s3.public-access-block-configuration/ignore-public-acls :portkey.aws.s3.public-access-block-configuration/block-public-policy :portkey.aws.s3.public-access-block-configuration/restrict-public-buckets]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-public-access-block-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-public-access-block-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/expiration-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3/location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/bytes-returned clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/object-list (clojure.spec.alpha/coll-of :portkey.aws.s3/object))

(clojure.spec.alpha/def :portkey.aws.s3/metadata-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.upload-part-copy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.upload-part-copy-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.upload-part-copy-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3/upload-part-copy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.upload-part-copy-request/bucket :portkey.aws.s3/copy-source :portkey.aws.s3.upload-part-copy-request/key :portkey.aws.s3/part-number :portkey.aws.s3.upload-part-copy-request/upload-id] :opt-un [:portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/copy-source-sse-customer-key :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key :portkey.aws.s3/copy-source-if-match :portkey.aws.s3/copy-source-range :portkey.aws.s3/copy-source-if-none-match :portkey.aws.s3/copy-source-if-modified-since :portkey.aws.s3/copy-source-if-unmodified-since :portkey.aws.s3/copy-source-sse-customer-algorithm :portkey.aws.s3/copy-source-sse-customer-key-md-5 :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-objects-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-objects-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-objects-request/bucket :portkey.aws.s3/delete] :opt-un [:portkey.aws.s3/mfa :portkey.aws.s3/request-payer :portkey.aws.s3/bypass-governance-retention]))

(clojure.spec.alpha/def :portkey.aws.s3/filter-rule-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/filter-rule-list (clojure.spec.alpha/coll-of :portkey.aws.s3/filter-rule))

(clojure.spec.alpha/def :portkey.aws.s3/grant-read (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/put-object-legal-hold-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-inventory-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3/token))
(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-inventory-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3/next-token))
(clojure.spec.alpha/def :portkey.aws.s3/list-bucket-inventory-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.list-bucket-inventory-configurations-output/continuation-token :portkey.aws.s3/inventory-configuration-list :portkey.aws.s3/is-truncated :portkey.aws.s3.list-bucket-inventory-configurations-output/next-continuation-token]))

(clojure.spec.alpha/def :portkey.aws.s3.analytics-s-3-bucket-destination/format (clojure.spec.alpha/and :portkey.aws.s3/analytics-s-3-export-file-format))
(clojure.spec.alpha/def :portkey.aws.s3.analytics-s-3-bucket-destination/bucket-account-id (clojure.spec.alpha/and :portkey.aws.s3/account-id))
(clojure.spec.alpha/def :portkey.aws.s3.analytics-s-3-bucket-destination/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/analytics-s-3-bucket-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.analytics-s-3-bucket-destination/format :portkey.aws.s3.analytics-s-3-bucket-destination/bucket] :opt-un [:portkey.aws.s3.analytics-s-3-bucket-destination/bucket-account-id :portkey.aws.s3/prefix]))

(clojure.spec.alpha/def :portkey.aws.s3/inventory-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3/inventory-configuration))

(clojure.spec.alpha/def :portkey.aws.s3/next-part-number-marker clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.list-parts-output/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.list-parts-output/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.list-parts-output/upload-id (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3/list-parts-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.list-parts-output/bucket :portkey.aws.s3/parts :portkey.aws.s3/abort-date :portkey.aws.s3/max-parts :portkey.aws.s3/next-part-number-marker :portkey.aws.s3.list-parts-output/key :portkey.aws.s3/is-truncated :portkey.aws.s3/abort-rule-id :portkey.aws.s3/part-number-marker :portkey.aws.s3/owner :portkey.aws.s3.list-parts-output/upload-id :portkey.aws.s3/storage-class :portkey.aws.s3/request-charged :portkey.aws.s3/initiator]))

(clojure.spec.alpha/def :portkey.aws.s3/noncurrent-version-transition-list (clojure.spec.alpha/coll-of :portkey.aws.s3/noncurrent-version-transition))

(clojure.spec.alpha/def :portkey.aws.s3/event-list (clojure.spec.alpha/coll-of :portkey.aws.s3/event))

(clojure.spec.alpha/def :portkey.aws.s3/expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/server-side-encryption #{:awskms :aes-256 "aws:kms" "AES256"})

(clojure.spec.alpha/def :portkey.aws.s3.copy-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.copy-object-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.copy-object-request/acl (clojure.spec.alpha/and :portkey.aws.s3/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.copy-object-request/tagging (clojure.spec.alpha/and :portkey.aws.s3/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3/copy-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.copy-object-request/bucket :portkey.aws.s3/copy-source :portkey.aws.s3.copy-object-request/key] :opt-un [:portkey.aws.s3/content-encoding :portkey.aws.s3/tagging-directive :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/copy-source-sse-customer-key :portkey.aws.s3/website-redirect-location :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/metadata-directive :portkey.aws.s3/sse-customer-key :portkey.aws.s3/grant-read-acp :portkey.aws.s3/grant-read :portkey.aws.s3/server-side-encryption :portkey.aws.s3/content-disposition :portkey.aws.s3/copy-source-if-match :portkey.aws.s3/content-type :portkey.aws.s3.copy-object-request/acl :portkey.aws.s3/copy-source-if-none-match :portkey.aws.s3/copy-source-if-modified-since :portkey.aws.s3/copy-source-if-unmodified-since :portkey.aws.s3/copy-source-sse-customer-algorithm :portkey.aws.s3/object-lock-legal-hold-status :portkey.aws.s3/copy-source-sse-customer-key-md-5 :portkey.aws.s3/metadata :portkey.aws.s3/cache-control :portkey.aws.s3/content-language :portkey.aws.s3/grant-write-acp :portkey.aws.s3/grant-full-control :portkey.aws.s3.copy-object-request/tagging :portkey.aws.s3/storage-class :portkey.aws.s3/expires :portkey.aws.s3/object-lock-retain-until-date :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/object-lock-mode :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-logging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-logging-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/if-modified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3/mfa (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.put-object-legal-hold-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-legal-hold-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-legal-hold-request/legal-hold (clojure.spec.alpha/and :portkey.aws.s3/object-lock-legal-hold))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-legal-hold-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/put-object-legal-hold-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-object-legal-hold-request/bucket :portkey.aws.s3.put-object-legal-hold-request/key] :opt-un [:portkey.aws.s3.put-object-legal-hold-request/legal-hold :portkey.aws.s3/request-payer :portkey.aws.s3.put-object-legal-hold-request/version-id :portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/event #{"s3:ObjectRestore:Completed" :s-3-object-removed-delete "s3:ObjectCreated:*" :s-3-object-created-copy :s-3-object-restore-post "s3:ObjectRemoved:Delete" :s-3-object-created-complete-multipart-upload "s3:ObjectRemoved:*" "s3:ObjectRemoved:DeleteMarkerCreated" :s-3-object-created-put :s-3-object-restore-completed "s3:ObjectCreated:Copy" :s-3-object-removed "s3:ObjectCreated:Post" "s3:ObjectCreated:CompleteMultipartUpload" "s3:ReducedRedundancyLostObject" "s3:ObjectRestore:Post" :s-3-object-created "s3:ObjectCreated:Put" :s-3-object-created-post :s-3-object-removed-delete-marker-created :s-3-reduced-redundancy-lost-object})

(clojure.spec.alpha/def :portkey.aws.s3/bucket-canned-acl #{"authenticated-read" "public-read-write" :private "private" :publicread :publicreadwrite "public-read" :authenticatedread})

(clojure.spec.alpha/def :portkey.aws.s3/quote-character (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/restore-request-type #{"SELECT" :select})

(clojure.spec.alpha/def :portkey.aws.s3/end-event (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/quiet clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/content-disposition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/abort-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.error-document/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3/error-document (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.error-document/key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/bypass-governance-retention clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/redirect (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/host-name :portkey.aws.s3/http-redirect-code :portkey.aws.s3/protocol :portkey.aws.s3/replace-key-prefix-with :portkey.aws.s3/replace-key-with]))

(clojure.spec.alpha/def :portkey.aws.s3.head-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/head-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/missing-meta :portkey.aws.s3/content-encoding :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/website-redirect-location :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3.head-object-output/version-id :portkey.aws.s3/accept-ranges :portkey.aws.s3/replication-status :portkey.aws.s3/server-side-encryption :portkey.aws.s3/content-disposition :portkey.aws.s3/e-tag :portkey.aws.s3/content-type :portkey.aws.s3/restore :portkey.aws.s3/content-length :portkey.aws.s3/last-modified :portkey.aws.s3/parts-count :portkey.aws.s3/object-lock-legal-hold-status :portkey.aws.s3/metadata :portkey.aws.s3/cache-control :portkey.aws.s3/content-language :portkey.aws.s3/storage-class :portkey.aws.s3/delete-marker :portkey.aws.s3/request-charged :portkey.aws.s3/expires :portkey.aws.s3/object-lock-retain-until-date :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/object-lock-mode :portkey.aws.s3/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3/progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/bytes-scanned :portkey.aws.s3/bytes-processed :portkey.aws.s3/bytes-returned]))

(clojure.spec.alpha/def :portkey.aws.s3.output-serialization/csv (clojure.spec.alpha/and :portkey.aws.s3/csv-output))
(clojure.spec.alpha/def :portkey.aws.s3.output-serialization/json (clojure.spec.alpha/and :portkey.aws.s3/json-output))
(clojure.spec.alpha/def :portkey.aws.s3/output-serialization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.output-serialization/csv :portkey.aws.s3.output-serialization/json]))

(clojure.spec.alpha/def :portkey.aws.s3/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/priority clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/bucket-logs-permission #{"WRITE" "FULL_CONTROL" :read :write "READ" :full-control})

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-cors-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/cors-rules]))

(clojure.spec.alpha/def :portkey.aws.s3/analytics-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-if-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/http-error-code-returned-equals (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/user-metadata (clojure.spec.alpha/coll-of :portkey.aws.s3/metadata-entry))

(clojure.spec.alpha/def :portkey.aws.s3/upload-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-website-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/redirect-all-requests-to :portkey.aws.s3/index-document :portkey.aws.s3/error-document :portkey.aws.s3/routing-rules]))

(clojure.spec.alpha/def :portkey.aws.s3/part-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/logging-enabled (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/target-bucket :portkey.aws.s3/target-prefix] :opt-un [:portkey.aws.s3/target-grants]))

(clojure.spec.alpha/def :portkey.aws.s3/bucket-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.inventory-configuration/destination (clojure.spec.alpha/and :portkey.aws.s3/inventory-destination))
(clojure.spec.alpha/def :portkey.aws.s3.inventory-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3/inventory-filter))
(clojure.spec.alpha/def :portkey.aws.s3.inventory-configuration/id (clojure.spec.alpha/and :portkey.aws.s3/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.inventory-configuration/included-object-versions (clojure.spec.alpha/and :portkey.aws.s3/inventory-included-object-versions))
(clojure.spec.alpha/def :portkey.aws.s3.inventory-configuration/optional-fields (clojure.spec.alpha/and :portkey.aws.s3/inventory-optional-fields))
(clojure.spec.alpha/def :portkey.aws.s3.inventory-configuration/schedule (clojure.spec.alpha/and :portkey.aws.s3/inventory-schedule))
(clojure.spec.alpha/def :portkey.aws.s3/inventory-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.inventory-configuration/destination :portkey.aws.s3/is-enabled :portkey.aws.s3.inventory-configuration/id :portkey.aws.s3.inventory-configuration/included-object-versions :portkey.aws.s3.inventory-configuration/schedule] :opt-un [:portkey.aws.s3.inventory-configuration/filter :portkey.aws.s3.inventory-configuration/optional-fields]))

(clojure.spec.alpha/def :portkey.aws.s3/allowed-methods (clojure.spec.alpha/coll-of :portkey.aws.s3/allowed-method))

(clojure.spec.alpha/def :portkey.aws.s3/e-tag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.restore-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.restore-object-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.restore-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/restore-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.restore-object-request/bucket :portkey.aws.s3.restore-object-request/key] :opt-un [:portkey.aws.s3.restore-object-request/version-id :portkey.aws.s3/restore-request :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/object-storage-class #{:standard-ia "GLACIER" :glacier "ONEZONE_IA" :reduced-redundancy "STANDARD_IA" :intelligent-tiering "STANDARD" :standard "INTELLIGENT_TIERING" "REDUCED_REDUNDANCY" :onezone-ia})

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.list-objects-v-2-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.list-objects-v-2-output/contents (clojure.spec.alpha/and :portkey.aws.s3/object-list))
(clojure.spec.alpha/def :portkey.aws.s3.list-objects-v-2-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3/token))
(clojure.spec.alpha/def :portkey.aws.s3.list-objects-v-2-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.list-objects-v-2-output/name (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/list-objects-v-2-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/key-count :portkey.aws.s3/prefix :portkey.aws.s3/encoding-type :portkey.aws.s3/start-after :portkey.aws.s3/is-truncated :portkey.aws.s3.list-objects-v-2-output/common-prefixes :portkey.aws.s3.list-objects-v-2-output/contents :portkey.aws.s3.list-objects-v-2-output/continuation-token :portkey.aws.s3/delimiter :portkey.aws.s3.list-objects-v-2-output/next-continuation-token :portkey.aws.s3.list-objects-v-2-output/name :portkey.aws.s3/max-keys]))

(clojure.spec.alpha/def :portkey.aws.s3/max-uploads clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.replication-rule-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3/replication-rule-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3.replication-rule-and-operator/tags]))

(clojure.spec.alpha/def :portkey.aws.s3/metrics-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/owner-override #{"Destination" :destination})

(clojure.spec.alpha/def :portkey.aws.s3/multipart-upload-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-replication-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.delete/objects (clojure.spec.alpha/and :portkey.aws.s3/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.s3/delete (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete/objects] :opt-un [:portkey.aws.s3/quiet]))

(clojure.spec.alpha/def :portkey.aws.s3.create-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.create-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.create-multipart-upload-request/acl (clojure.spec.alpha/and :portkey.aws.s3/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.create-multipart-upload-request/tagging (clojure.spec.alpha/and :portkey.aws.s3/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3/create-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.create-multipart-upload-request/bucket :portkey.aws.s3.create-multipart-upload-request/key] :opt-un [:portkey.aws.s3/content-encoding :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/website-redirect-location :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key :portkey.aws.s3/grant-read-acp :portkey.aws.s3/grant-read :portkey.aws.s3/server-side-encryption :portkey.aws.s3/content-disposition :portkey.aws.s3/content-type :portkey.aws.s3.create-multipart-upload-request/acl :portkey.aws.s3/object-lock-legal-hold-status :portkey.aws.s3/metadata :portkey.aws.s3/cache-control :portkey.aws.s3/content-language :portkey.aws.s3/grant-write-acp :portkey.aws.s3/grant-full-control :portkey.aws.s3.create-multipart-upload-request/tagging :portkey.aws.s3/storage-class :portkey.aws.s3/expires :portkey.aws.s3/object-lock-retain-until-date :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/object-lock-mode :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.select-object-content-output/payload (clojure.spec.alpha/and :portkey.aws.s3/select-object-content-event-stream))
(clojure.spec.alpha/def :portkey.aws.s3/select-object-content-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.select-object-content-output/payload]))

(clojure.spec.alpha/def :portkey.aws.s3/metadata-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/bucket-logging-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/logging-enabled]))

(clojure.spec.alpha/def :portkey.aws.s3.stats-event/details (clojure.spec.alpha/and :portkey.aws.s3/stats))
(clojure.spec.alpha/def :portkey.aws.s3/stats-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.stats-event/details]))

(clojure.spec.alpha/def :portkey.aws.s3/bucket-versioning-status #{"Suspended" "Enabled" :suspended :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.head-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.head-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.head-object-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3/head-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.head-object-request/bucket :portkey.aws.s3.head-object-request/key] :opt-un [:portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/if-unmodified-since :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key :portkey.aws.s3.head-object-request/version-id :portkey.aws.s3/if-modified-since :portkey.aws.s3/part-number :portkey.aws.s3/range :portkey.aws.s3/if-match :portkey.aws.s3/if-none-match :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/is-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/no-such-upload (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/inventory-included-object-versions #{"Current" :all :current "All"})

(clojure.spec.alpha/def :portkey.aws.s3/no-such-bucket (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/if-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/restore (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/tag-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.server-side-encryption-by-default/sse-algorithm (clojure.spec.alpha/and :portkey.aws.s3/server-side-encryption))
(clojure.spec.alpha/def :portkey.aws.s3.server-side-encryption-by-default/kms-master-key-id (clojure.spec.alpha/and :portkey.aws.s3/ssekms-key-id))
(clojure.spec.alpha/def :portkey.aws.s3/server-side-encryption-by-default (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.server-side-encryption-by-default/sse-algorithm] :opt-un [:portkey.aws.s3.server-side-encryption-by-default/kms-master-key-id]))

(clojure.spec.alpha/def :portkey.aws.s3/display-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.records-event/payload (clojure.spec.alpha/and :portkey.aws.s3/body))
(clojure.spec.alpha/def :portkey.aws.s3/records-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.records-event/payload]))

(clojure.spec.alpha/def :portkey.aws.s3/cors-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/allowed-methods :portkey.aws.s3/allowed-origins] :opt-un [:portkey.aws.s3/allowed-headers :portkey.aws.s3/expose-headers :portkey.aws.s3/max-age-seconds]))

(clojure.spec.alpha/def :portkey.aws.s3/grant (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/grantee :portkey.aws.s3/permission]))

(clojure.spec.alpha/def :portkey.aws.s3/cors-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/cors-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/object-lock-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/default-retention]))

(clojure.spec.alpha/def :portkey.aws.s3/initiated clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-accelerate-configuration-output/status (clojure.spec.alpha/and :portkey.aws.s3/bucket-accelerate-status))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-accelerate-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.get-bucket-accelerate-configuration-output/status]))

(clojure.spec.alpha/def :portkey.aws.s3.list-object-versions-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/list-object-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.list-object-versions-request/bucket] :opt-un [:portkey.aws.s3/delimiter :portkey.aws.s3/encoding-type :portkey.aws.s3/key-marker :portkey.aws.s3/max-keys :portkey.aws.s3/prefix :portkey.aws.s3/version-id-marker]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-notification-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-notification-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-notification-configuration-request/bucket :portkey.aws.s3/notification-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/content-length clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.topic-configuration/id (clojure.spec.alpha/and :portkey.aws.s3/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.topic-configuration/events (clojure.spec.alpha/and :portkey.aws.s3/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.topic-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3/topic-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/topic-arn :portkey.aws.s3.topic-configuration/events] :opt-un [:portkey.aws.s3.topic-configuration/id :portkey.aws.s3.topic-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3/is-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.progress-event/details (clojure.spec.alpha/and :portkey.aws.s3/progress))
(clojure.spec.alpha/def :portkey.aws.s3/progress-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.progress-event/details]))

(clojure.spec.alpha/def :portkey.aws.s3.list-objects-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/list-objects-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.list-objects-request/bucket] :opt-un [:portkey.aws.s3/delimiter :portkey.aws.s3/encoding-type :portkey.aws.s3/marker :portkey.aws.s3/max-keys :portkey.aws.s3/prefix :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/field-delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.inventory-s-3-bucket-destination/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.inventory-s-3-bucket-destination/format (clojure.spec.alpha/and :portkey.aws.s3/inventory-format))
(clojure.spec.alpha/def :portkey.aws.s3.inventory-s-3-bucket-destination/encryption (clojure.spec.alpha/and :portkey.aws.s3/inventory-encryption))
(clojure.spec.alpha/def :portkey.aws.s3/inventory-s-3-bucket-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.inventory-s-3-bucket-destination/bucket :portkey.aws.s3.inventory-s-3-bucket-destination/format] :opt-un [:portkey.aws.s3/account-id :portkey.aws.s3/prefix :portkey.aws.s3.inventory-s-3-bucket-destination/encryption]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-metrics-configuration-request/bucket :portkey.aws.s3.put-bucket-metrics-configuration-request/id :portkey.aws.s3/metrics-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/csv-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/quote-fields :portkey.aws.s3/quote-escape-character :portkey.aws.s3/record-delimiter :portkey.aws.s3/field-delimiter :portkey.aws.s3/quote-character]))

(clojure.spec.alpha/def :portkey.aws.s3.metadata-entry/name (clojure.spec.alpha/and :portkey.aws.s3/metadata-key))
(clojure.spec.alpha/def :portkey.aws.s3.metadata-entry/value (clojure.spec.alpha/and :portkey.aws.s3/metadata-value))
(clojure.spec.alpha/def :portkey.aws.s3/metadata-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.metadata-entry/name :portkey.aws.s3.metadata-entry/value]))

(clojure.spec.alpha/def :portkey.aws.s3/copy-object-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/e-tag :portkey.aws.s3/last-modified]))

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-if-none-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-website-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/inventory-frequency #{"Daily" :daily "Weekly" :weekly})

(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-inventory-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-inventory-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3/token))
(clojure.spec.alpha/def :portkey.aws.s3/list-bucket-inventory-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.list-bucket-inventory-configurations-request/bucket] :opt-un [:portkey.aws.s3.list-bucket-inventory-configurations-request/continuation-token]))

(clojure.spec.alpha/def :portkey.aws.s3/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/expose-headers (clojure.spec.alpha/coll-of :portkey.aws.s3/expose-header))

(clojure.spec.alpha/def :portkey.aws.s3/transition-list (clojure.spec.alpha/coll-of :portkey.aws.s3/transition))

(clojure.spec.alpha/def :portkey.aws.s3.analytics-filter/and (clojure.spec.alpha/and :portkey.aws.s3/analytics-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3/analytics-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3/tag :portkey.aws.s3.analytics-filter/and]))

(clojure.spec.alpha/def :portkey.aws.s3/restore-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/request-charged :portkey.aws.s3/restore-output-path]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-policy-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/analytics-s-3-export-file-format #{"CSV" :csv})

(clojure.spec.alpha/def :portkey.aws.s3/version-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/object-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.s3/allowed-method (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/bucket-accelerate-status #{"Suspended" "Enabled" :suspended :enabled})

(clojure.spec.alpha/def :portkey.aws.s3/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/protocol #{"https" "http" :http :https})

(clojure.spec.alpha/def :portkey.aws.s3.get-public-access-block-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-public-access-block-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-replication-request/bucket :portkey.aws.s3/replication-configuration] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/missing-meta :portkey.aws.s3/content-encoding :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/website-redirect-location :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3.get-object-output/version-id :portkey.aws.s3/body :portkey.aws.s3/content-range :portkey.aws.s3/accept-ranges :portkey.aws.s3/replication-status :portkey.aws.s3/server-side-encryption :portkey.aws.s3/content-disposition :portkey.aws.s3/e-tag :portkey.aws.s3/content-type :portkey.aws.s3/restore :portkey.aws.s3/tag-count :portkey.aws.s3/content-length :portkey.aws.s3/last-modified :portkey.aws.s3/parts-count :portkey.aws.s3/object-lock-legal-hold-status :portkey.aws.s3/metadata :portkey.aws.s3/cache-control :portkey.aws.s3/content-language :portkey.aws.s3/storage-class :portkey.aws.s3/delete-marker :portkey.aws.s3/request-charged :portkey.aws.s3/expires :portkey.aws.s3/object-lock-retain-until-date :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/object-lock-mode :portkey.aws.s3/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.replication-rule/filter (clojure.spec.alpha/and :portkey.aws.s3/replication-rule-filter))
(clojure.spec.alpha/def :portkey.aws.s3.replication-rule/status (clojure.spec.alpha/and :portkey.aws.s3/replication-rule-status))
(clojure.spec.alpha/def :portkey.aws.s3/replication-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.replication-rule/status :portkey.aws.s3/destination] :opt-un [:portkey.aws.s3/id :portkey.aws.s3/priority :portkey.aws.s3/prefix :portkey.aws.s3.replication-rule/filter :portkey.aws.s3/source-selection-criteria :portkey.aws.s3/delete-marker-replication]))

(clojure.spec.alpha/def :portkey.aws.s3/redirect-all-requests-to (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/host-name] :opt-un [:portkey.aws.s3/protocol]))

(clojure.spec.alpha/def :portkey.aws.s3.list-multipart-uploads-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/list-multipart-uploads-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.list-multipart-uploads-request/bucket] :opt-un [:portkey.aws.s3/delimiter :portkey.aws.s3/encoding-type :portkey.aws.s3/key-marker :portkey.aws.s3/max-uploads :portkey.aws.s3/prefix :portkey.aws.s3/upload-id-marker]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-cors-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.abort-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.abort-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.abort-multipart-upload-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3/abort-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.abort-multipart-upload-request/bucket :portkey.aws.s3.abort-multipart-upload-request/key :portkey.aws.s3.abort-multipart-upload-request/upload-id] :opt-un [:portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/target-grants (clojure.spec.alpha/coll-of :portkey.aws.s3/target-grant))

(clojure.spec.alpha/def :portkey.aws.s3/buckets (clojure.spec.alpha/coll-of :portkey.aws.s3/bucket))

(clojure.spec.alpha/def :portkey.aws.s3/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.get-object-torrent-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-torrent-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-torrent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-object-torrent-request/bucket :portkey.aws.s3.get-object-torrent-request/key] :opt-un [:portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.completed-multipart-upload/parts (clojure.spec.alpha/and :portkey.aws.s3/completed-part-list))
(clojure.spec.alpha/def :portkey.aws.s3/completed-multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.completed-multipart-upload/parts]))

(clojure.spec.alpha/def :portkey.aws.s3/json-type #{"DOCUMENT" :lines :document "LINES"})

(clojure.spec.alpha/def :portkey.aws.s3.filter-rule/name (clojure.spec.alpha/and :portkey.aws.s3/filter-rule-name))
(clojure.spec.alpha/def :portkey.aws.s3.filter-rule/value (clojure.spec.alpha/and :portkey.aws.s3/filter-rule-value))
(clojure.spec.alpha/def :portkey.aws.s3/filter-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.filter-rule/name :portkey.aws.s3.filter-rule/value]))

(clojure.spec.alpha/def :portkey.aws.s3/replication-rules (clojure.spec.alpha/coll-of :portkey.aws.s3/replication-rule))

(clojure.spec.alpha/def :portkey.aws.s3.s-3-key-filter/filter-rules (clojure.spec.alpha/and :portkey.aws.s3/filter-rule-list))
(clojure.spec.alpha/def :portkey.aws.s3/s-3-key-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.s-3-key-filter/filter-rules]))

(clojure.spec.alpha/def :portkey.aws.s3/parts-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.complete-multipart-upload-output/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.complete-multipart-upload-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.complete-multipart-upload-output/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3/complete-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.complete-multipart-upload-output/bucket :portkey.aws.s3.complete-multipart-upload-output/version-id :portkey.aws.s3/location :portkey.aws.s3/server-side-encryption :portkey.aws.s3/e-tag :portkey.aws.s3.complete-multipart-upload-output/key :portkey.aws.s3/request-charged :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-analytics-configuration-request/bucket :portkey.aws.s3.put-bucket-analytics-configuration-request/id :portkey.aws.s3/analytics-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/abort-rule-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/target-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-acl-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-acl-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-object-acl-request/bucket :portkey.aws.s3.get-object-acl-request/key] :opt-un [:portkey.aws.s3.get-object-acl-request/version-id :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.notification-configuration-deprecated/topic-configuration (clojure.spec.alpha/and :portkey.aws.s3/topic-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3.notification-configuration-deprecated/queue-configuration (clojure.spec.alpha/and :portkey.aws.s3/queue-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3/notification-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.notification-configuration-deprecated/topic-configuration :portkey.aws.s3.notification-configuration-deprecated/queue-configuration :portkey.aws.s3/cloud-function-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/delete-object-tagging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.delete-object-tagging-output/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-if-modified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-metrics-configuration-request/bucket :portkey.aws.s3.delete-bucket-metrics-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/replace-key-with (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/kms-context (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-acl-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/part (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/part-number :portkey.aws.s3/last-modified :portkey.aws.s3/e-tag :portkey.aws.s3/size]))

(clojure.spec.alpha/def :portkey.aws.s3/part-number-marker clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.notification-configuration-filter/key (clojure.spec.alpha/and :portkey.aws.s3/s-3-key-filter))
(clojure.spec.alpha/def :portkey.aws.s3/notification-configuration-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.notification-configuration-filter/key]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-location-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-location-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-location-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/upload-part-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/server-side-encryption :portkey.aws.s3/e-tag :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/owner :portkey.aws.s3/grants]))

(clojure.spec.alpha/def :portkey.aws.s3/topic-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/suffix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.lifecycle-rule-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3/lifecycle-rule-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3.lifecycle-rule-and-operator/tags]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-inventory-configuration-request/bucket :portkey.aws.s3.put-bucket-inventory-configuration-request/id :portkey.aws.s3/inventory-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-object-request/bucket :portkey.aws.s3.get-object-request/key] :opt-un [:portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/response-expires :portkey.aws.s3/if-unmodified-since :portkey.aws.s3/response-content-disposition :portkey.aws.s3/response-content-language :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key :portkey.aws.s3.get-object-request/version-id :portkey.aws.s3/response-content-type :portkey.aws.s3/if-modified-since :portkey.aws.s3/part-number :portkey.aws.s3/range :portkey.aws.s3/if-match :portkey.aws.s3/response-content-encoding :portkey.aws.s3/if-none-match :portkey.aws.s3/request-payer :portkey.aws.s3/response-cache-control]))

(clojure.spec.alpha/def :portkey.aws.s3/allowed-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-request-payment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/payer]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-lifecycle-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-lifecycle-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-lifecycle-configuration-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-tagging-output (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/tag-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-tagging-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-tagging-request/bucket :portkey.aws.s3/tagging] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.rule/expiration (clojure.spec.alpha/and :portkey.aws.s3/lifecycle-expiration))
(clojure.spec.alpha/def :portkey.aws.s3.rule/status (clojure.spec.alpha/and :portkey.aws.s3/expiration-status))
(clojure.spec.alpha/def :portkey.aws.s3/rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/prefix :portkey.aws.s3.rule/status] :opt-un [:portkey.aws.s3.rule/expiration :portkey.aws.s3/id :portkey.aws.s3/transition :portkey.aws.s3/noncurrent-version-transition :portkey.aws.s3/noncurrent-version-expiration :portkey.aws.s3/abort-incomplete-multipart-upload]))

(clojure.spec.alpha/def :portkey.aws.s3.create-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.create-bucket-request/acl (clojure.spec.alpha/and :portkey.aws.s3/bucket-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3/create-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.create-bucket-request/bucket] :opt-un [:portkey.aws.s3/create-bucket-configuration :portkey.aws.s3/grant-read-acp :portkey.aws.s3/grant-read :portkey.aws.s3.create-bucket-request/acl :portkey.aws.s3/object-lock-enabled-for-bucket :portkey.aws.s3/grant-write :portkey.aws.s3/grant-write-acp :portkey.aws.s3/grant-full-control]))

(clojure.spec.alpha/def :portkey.aws.s3/routing-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/redirect] :opt-un [:portkey.aws.s3/condition]))

(clojure.spec.alpha/def :portkey.aws.s3.noncurrent-version-expiration/noncurrent-days (clojure.spec.alpha/and :portkey.aws.s3/days))
(clojure.spec.alpha/def :portkey.aws.s3/noncurrent-version-expiration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.noncurrent-version-expiration/noncurrent-days]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-analytics-configuration-request/bucket :portkey.aws.s3.delete-bucket-analytics-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/location-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-policy-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.delete-marker-replication/status (clojure.spec.alpha/and :portkey.aws.s3/delete-marker-replication-status))
(clojure.spec.alpha/def :portkey.aws.s3/delete-marker-replication (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.delete-marker-replication/status]))

(clojure.spec.alpha/def :portkey.aws.s3/select-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/input-serialization :portkey.aws.s3/expression-type :portkey.aws.s3/expression :portkey.aws.s3/output-serialization] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/object-lock-enabled-for-bucket clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-lifecycle-configuration-output/rules (clojure.spec.alpha/and :portkey.aws.s3/lifecycle-rules))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-lifecycle-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.get-bucket-lifecycle-configuration-output/rules]))

(clojure.spec.alpha/def :portkey.aws.s3/tagging-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/next-version-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.ssekms/key-id (clojure.spec.alpha/and :portkey.aws.s3/ssekms-key-id))
(clojure.spec.alpha/def :portkey.aws.s3/ssekms (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.ssekms/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.deleted-object/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.deleted-object/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/deleted-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.deleted-object/key :portkey.aws.s3.deleted-object/version-id :portkey.aws.s3/delete-marker :portkey.aws.s3/delete-marker-version-id]))

(clojure.spec.alpha/def :portkey.aws.s3/enable-request-progress clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/abort-incomplete-multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/days-after-initiation]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-location-output/location-constraint (clojure.spec.alpha/and :portkey.aws.s3/bucket-location-constraint))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-location-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.get-bucket-location-output/location-constraint]))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-inventory-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/inventory-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.request-progress/enabled (clojure.spec.alpha/and :portkey.aws.s3/enable-request-progress))
(clojure.spec.alpha/def :portkey.aws.s3/request-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.request-progress/enabled]))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-versioning-output/status (clojure.spec.alpha/and :portkey.aws.s3/bucket-versioning-status))
(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-versioning-output/mfa-delete (clojure.spec.alpha/and :portkey.aws.s3/mfa-delete-status))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-versioning-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.get-bucket-versioning-output/status :portkey.aws.s3.get-bucket-versioning-output/mfa-delete]))

(clojure.spec.alpha/def :portkey.aws.s3.s-3-location/prefix (clojure.spec.alpha/and :portkey.aws.s3/location-prefix))
(clojure.spec.alpha/def :portkey.aws.s3.s-3-location/canned-acl (clojure.spec.alpha/and :portkey.aws.s3/object-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.s-3-location/access-control-list (clojure.spec.alpha/and :portkey.aws.s3/grants))
(clojure.spec.alpha/def :portkey.aws.s3/s-3-location (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/bucket-name :portkey.aws.s3.s-3-location/prefix] :opt-un [:portkey.aws.s3/encryption :portkey.aws.s3.s-3-location/canned-acl :portkey.aws.s3.s-3-location/access-control-list :portkey.aws.s3/tagging :portkey.aws.s3/user-metadata :portkey.aws.s3/storage-class]))

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-if-unmodified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.put-public-access-block-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-public-access-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-public-access-block-request/bucket :portkey.aws.s3/public-access-block-configuration] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/http-redirect-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/uri (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/object-canned-acl #{"authenticated-read" :bucketownerfullcontrol "public-read-write" :private "bucket-owner-full-control" "private" :bucketownerread :publicread "aws-exec-read" :publicreadwrite :awsexecread "bucket-owner-read" "public-read" :authenticatedread})

(clojure.spec.alpha/def :portkey.aws.s3/inventory-optional-fields (clojure.spec.alpha/coll-of :portkey.aws.s3/inventory-optional-field))

(clojure.spec.alpha/def :portkey.aws.s3/owner (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/display-name :portkey.aws.s3/id]))

(clojure.spec.alpha/def :portkey.aws.s3/replication-rule-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3/next-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/days clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/put-object-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-sse-customer-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.object-identifier/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.object-identifier/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/object-identifier (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.object-identifier/key] :opt-un [:portkey.aws.s3.object-identifier/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3/lifecycle-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/grant-write (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.storage-class-analysis-data-export/output-schema-version (clojure.spec.alpha/and :portkey.aws.s3/storage-class-analysis-schema-version))
(clojure.spec.alpha/def :portkey.aws.s3.storage-class-analysis-data-export/destination (clojure.spec.alpha/and :portkey.aws.s3/analytics-export-destination))
(clojure.spec.alpha/def :portkey.aws.s3/storage-class-analysis-data-export (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.storage-class-analysis-data-export/output-schema-version :portkey.aws.s3.storage-class-analysis-data-export/destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3/bytes-scanned clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/upload-part-copy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/copy-source-version-id :portkey.aws.s3/copy-part-result :portkey.aws.s3/server-side-encryption :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-policy-request/bucket :portkey.aws.s3/policy] :opt-un [:portkey.aws.s3/content-md-5 :portkey.aws.s3/confirm-remove-self-bucket-access]))

(clojure.spec.alpha/def :portkey.aws.s3/list-buckets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/buckets :portkey.aws.s3/owner]))

(clojure.spec.alpha/def :portkey.aws.s3.put-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/put-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/expiration :portkey.aws.s3/e-tag :portkey.aws.s3/server-side-encryption :portkey.aws.s3.put-object-output/version-id :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3/bytes-processed clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/get-object-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/owner :portkey.aws.s3/grants :portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3/stats (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/bytes-scanned :portkey.aws.s3/bytes-processed :portkey.aws.s3/bytes-returned]))

(clojure.spec.alpha/def :portkey.aws.s3/quote-escape-character (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/cors-rules (clojure.spec.alpha/coll-of :portkey.aws.s3/cors-rule))

(clojure.spec.alpha/def :portkey.aws.s3/object-lock-legal-hold-status #{"ON" :off :on "OFF"})

(clojure.spec.alpha/def :portkey.aws.s3.delete-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.delete-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.delete-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/delete-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-object-tagging-request/bucket :portkey.aws.s3.delete-object-tagging-request/key] :opt-un [:portkey.aws.s3.delete-object-tagging-request/version-id]))

(clojure.spec.alpha/def :portkey.aws.s3/copy-source-sse-customer-key-md-5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/metadata (clojure.spec.alpha/map-of :portkey.aws.s3/metadata-key :portkey.aws.s3/metadata-value))

(clojure.spec.alpha/def :portkey.aws.s3/cache-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/content-language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.bucket-lifecycle-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3/lifecycle-rules))
(clojure.spec.alpha/def :portkey.aws.s3/bucket-lifecycle-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.bucket-lifecycle-configuration/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-encryption-request/bucket :portkey.aws.s3/server-side-encryption-configuration] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-analytics-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3/token))
(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-analytics-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3/next-token))
(clojure.spec.alpha/def :portkey.aws.s3/list-bucket-analytics-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/is-truncated :portkey.aws.s3.list-bucket-analytics-configurations-output/continuation-token :portkey.aws.s3.list-bucket-analytics-configurations-output/next-continuation-token :portkey.aws.s3/analytics-configuration-list]))

(clojure.spec.alpha/def :portkey.aws.s3/object-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.s3/object-identifier))

(clojure.spec.alpha/def :portkey.aws.s3/object-already-in-active-tier-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/object-version-list (clojure.spec.alpha/coll-of :portkey.aws.s3/object-version))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/policy]))

(clojure.spec.alpha/def :portkey.aws.s3.list-objects-v-2-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.list-objects-v-2-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3/token))
(clojure.spec.alpha/def :portkey.aws.s3/list-objects-v-2-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.list-objects-v-2-request/bucket] :opt-un [:portkey.aws.s3/prefix :portkey.aws.s3/encoding-type :portkey.aws.s3/start-after :portkey.aws.s3.list-objects-v-2-request/continuation-token :portkey.aws.s3/delimiter :portkey.aws.s3/fetch-owner :portkey.aws.s3/max-keys :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-lock-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-lock-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-object-lock-configuration-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-cors-request/bucket :portkey.aws.s3/cors-configuration] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/policy (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-policy-status-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-policy-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-policy-status-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-accelerate-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-accelerate-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-accelerate-configuration-request/bucket :portkey.aws.s3/accelerate-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.encryption/encryption-type (clojure.spec.alpha/and :portkey.aws.s3/server-side-encryption))
(clojure.spec.alpha/def :portkey.aws.s3.encryption/kms-key-id (clojure.spec.alpha/and :portkey.aws.s3/ssekms-key-id))
(clojure.spec.alpha/def :portkey.aws.s3/encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.encryption/encryption-type] :opt-un [:portkey.aws.s3.encryption/kms-key-id :portkey.aws.s3/kms-context]))

(clojure.spec.alpha/def :portkey.aws.s3/grant-write-acp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.tag/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.tag/key :portkey.aws.s3/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/http-error-code-returned-equals :portkey.aws.s3/key-prefix-equals]))

(clojure.spec.alpha/def :portkey.aws.s3/fetch-owner clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/expression-type #{:sql "SQL"})

(clojure.spec.alpha/def :portkey.aws.s3/grant-full-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.error/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.error/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.error/key :portkey.aws.s3.error/version-id :portkey.aws.s3/code :portkey.aws.s3/message]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-inventory-configuration-request/bucket :portkey.aws.s3.delete-bucket-inventory-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/queue-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-inventory-configuration-request/bucket :portkey.aws.s3.get-bucket-inventory-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/response-content-encoding (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.object-version/storage-class (clojure.spec.alpha/and :portkey.aws.s3/object-version-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.object-version/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.object-version/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/object-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/e-tag :portkey.aws.s3/size :portkey.aws.s3.object-version/storage-class :portkey.aws.s3.object-version/key :portkey.aws.s3.object-version/version-id :portkey.aws.s3/is-latest :portkey.aws.s3/last-modified :portkey.aws.s3/owner]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-lifecycle-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-lifecycle-configuration-request/lifecycle-configuration (clojure.spec.alpha/and :portkey.aws.s3/bucket-lifecycle-configuration))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-lifecycle-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-lifecycle-configuration-request/bucket] :opt-un [:portkey.aws.s3.put-bucket-lifecycle-configuration-request/lifecycle-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.select-object-content-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.select-object-content-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3/select-object-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.select-object-content-request/bucket :portkey.aws.s3.select-object-content-request/key :portkey.aws.s3/expression :portkey.aws.s3/expression-type :portkey.aws.s3/input-serialization :portkey.aws.s3/output-serialization] :opt-un [:portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key :portkey.aws.s3/request-progress]))

(clojure.spec.alpha/def :portkey.aws.s3/target-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/object-version-storage-class #{"STANDARD" :standard})

(clojure.spec.alpha/def :portkey.aws.s3/website-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/error-document :portkey.aws.s3/index-document :portkey.aws.s3/redirect-all-requests-to :portkey.aws.s3/routing-rules]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-marker-entry/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.delete-marker-entry/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/delete-marker-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/owner :portkey.aws.s3.delete-marker-entry/key :portkey.aws.s3.delete-marker-entry/version-id :portkey.aws.s3/is-latest :portkey.aws.s3/last-modified]))

(clojure.spec.alpha/def :portkey.aws.s3.delete-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/delete-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.delete-bucket-tagging-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/server-side-encryption-rules (clojure.spec.alpha/coll-of :portkey.aws.s3/server-side-encryption-rule))

(clojure.spec.alpha/def :portkey.aws.s3.notification-configuration/topic-configurations (clojure.spec.alpha/and :portkey.aws.s3/topic-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3.notification-configuration/queue-configurations (clojure.spec.alpha/and :portkey.aws.s3/queue-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3.notification-configuration/lambda-function-configurations (clojure.spec.alpha/and :portkey.aws.s3/lambda-function-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3/notification-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.notification-configuration/topic-configurations :portkey.aws.s3.notification-configuration/queue-configurations :portkey.aws.s3.notification-configuration/lambda-function-configurations]))

(clojure.spec.alpha/def :portkey.aws.s3/put-object-retention-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.queue-configuration/id (clojure.spec.alpha/and :portkey.aws.s3/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.queue-configuration/events (clojure.spec.alpha/and :portkey.aws.s3/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.queue-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3/queue-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/queue-arn :portkey.aws.s3.queue-configuration/events] :opt-un [:portkey.aws.s3.queue-configuration/id :portkey.aws.s3.queue-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3/tagging (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/tag-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/policy-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/is-public]))

(clojure.spec.alpha/def :portkey.aws.s3/host-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/if-none-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/restore-output-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/storage-class #{:standard-ia "GLACIER" :glacier "ONEZONE_IA" :reduced-redundancy "STANDARD_IA" :intelligent-tiering "STANDARD" :standard "INTELLIGENT_TIERING" "REDUCED_REDUNDANCY" :onezone-ia})

(clojure.spec.alpha/def :portkey.aws.s3.server-side-encryption-rule/apply-server-side-encryption-by-default (clojure.spec.alpha/and :portkey.aws.s3/server-side-encryption-by-default))
(clojure.spec.alpha/def :portkey.aws.s3/server-side-encryption-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.server-side-encryption-rule/apply-server-side-encryption-by-default]))

(clojure.spec.alpha/def :portkey.aws.s3/rules (clojure.spec.alpha/coll-of :portkey.aws.s3/rule))

(clojure.spec.alpha/def :portkey.aws.s3/lifecycle-expiration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/date :portkey.aws.s3/days :portkey.aws.s3/expired-object-delete-marker]))

(clojure.spec.alpha/def :portkey.aws.s3/analytics-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3/analytics-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.get-object-legal-hold-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-legal-hold-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.get-object-legal-hold-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-object-legal-hold-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-object-legal-hold-request/bucket :portkey.aws.s3.get-object-legal-hold-request/key] :opt-un [:portkey.aws.s3.get-object-legal-hold-request/version-id :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3/get-public-access-block-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/public-access-block-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-website-request/bucket :portkey.aws.s3/website-configuration] :opt-un [:portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/inventory-format #{"CSV" :csv :orc "ORC" :parquet "Parquet"})

(clojure.spec.alpha/def :portkey.aws.s3/queue-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3/queue-configuration))

(clojure.spec.alpha/def :portkey.aws.s3/no-such-key (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/grantee (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/type] :opt-un [:portkey.aws.s3/display-name :portkey.aws.s3/email-address :portkey.aws.s3/id :portkey.aws.s3/uri]))

(clojure.spec.alpha/def :portkey.aws.s3/key-prefix-equals (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.copy-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/copy-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/copy-source-version-id :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3.copy-object-output/version-id :portkey.aws.s3/server-side-encryption :portkey.aws.s3/copy-object-result :portkey.aws.s3/request-charged :portkey.aws.s3/ssekms-key-id :portkey.aws.s3/expiration]))

(clojure.spec.alpha/def :portkey.aws.s3/file-header-info #{"USE" :use :ignore "NONE" "IGNORE" :none})

(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-metrics-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-metrics-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3/token))
(clojure.spec.alpha/def :portkey.aws.s3/list-bucket-metrics-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.list-bucket-metrics-configurations-request/bucket] :opt-un [:portkey.aws.s3.list-bucket-metrics-configurations-request/continuation-token]))

(clojure.spec.alpha/def :portkey.aws.s3.output-location/s-3 (clojure.spec.alpha/and :portkey.aws.s3/s-3-location))
(clojure.spec.alpha/def :portkey.aws.s3/output-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.output-location/s-3]))

(clojure.spec.alpha/def :portkey.aws.s3/allowed-headers (clojure.spec.alpha/coll-of :portkey.aws.s3/allowed-header))

(clojure.spec.alpha/def :portkey.aws.s3/delete-marker clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3/years clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/allowed-origins (clojure.spec.alpha/coll-of :portkey.aws.s3/allowed-origin))

(clojure.spec.alpha/def :portkey.aws.s3/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/copy-source (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\/.+\/.+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.s3.queue-configuration-deprecated/id (clojure.spec.alpha/and :portkey.aws.s3/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.queue-configuration-deprecated/events (clojure.spec.alpha/and :portkey.aws.s3/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.queue-configuration-deprecated/queue (clojure.spec.alpha/and :portkey.aws.s3/queue-arn))
(clojure.spec.alpha/def :portkey.aws.s3/queue-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.queue-configuration-deprecated/id :portkey.aws.s3/event :portkey.aws.s3.queue-configuration-deprecated/events :portkey.aws.s3.queue-configuration-deprecated/queue]))

(clojure.spec.alpha/def :portkey.aws.s3/request-charged #{"requester" :requester})

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-metrics-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/metrics-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3/expires clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3/max-keys clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/lifecycle-rules (clojure.spec.alpha/coll-of :portkey.aws.s3/lifecycle-rule))

(clojure.spec.alpha/def :portkey.aws.s3/initiator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/id :portkey.aws.s3/display-name]))

(clojure.spec.alpha/def :portkey.aws.s3/sses-3 (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/max-age-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3/email-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/object-lock-retain-until-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3/bucket-location-constraint #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :apsoutheast-2 "ap-southeast-2" "EU" "cn-north-1" "sa-east-1" "ap-southeast-1" :cnnorth-1 "eu-central-1" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-west-1" "ap-south-1" :euwest-1 :uswest-2 :eu})

(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.get-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.get-bucket-analytics-configuration-request/bucket :portkey.aws.s3.get-bucket-analytics-configuration-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/ssekms-key-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/allowed-origin (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/object-not-in-active-tier-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.accelerate-configuration/status (clojure.spec.alpha/and :portkey.aws.s3/bucket-accelerate-status))
(clojure.spec.alpha/def :portkey.aws.s3/accelerate-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.accelerate-configuration/status]))

(clojure.spec.alpha/def :portkey.aws.s3/object-lock-mode #{"GOVERNANCE" :governance "COMPLIANCE" :compliance})

(clojure.spec.alpha/def :portkey.aws.s3.lambda-function-configuration/id (clojure.spec.alpha/and :portkey.aws.s3/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.lambda-function-configuration/events (clojure.spec.alpha/and :portkey.aws.s3/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.lambda-function-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3/lambda-function-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/lambda-function-arn :portkey.aws.s3.lambda-function-configuration/events] :opt-un [:portkey.aws.s3.lambda-function-configuration/id :portkey.aws.s3.lambda-function-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3/delete-marker-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.default-retention/mode (clojure.spec.alpha/and :portkey.aws.s3/object-lock-retention-mode))
(clojure.spec.alpha/def :portkey.aws.s3/default-retention (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.default-retention/mode :portkey.aws.s3/days :portkey.aws.s3/years]))

(clojure.spec.alpha/def :portkey.aws.s3/csv-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/file-header-info :portkey.aws.s3/comments :portkey.aws.s3/quote-escape-character :portkey.aws.s3/record-delimiter :portkey.aws.s3/field-delimiter :portkey.aws.s3/quote-character :portkey.aws.s3/allow-quoted-record-delimiter]))

(clojure.spec.alpha/def :portkey.aws.s3/is-latest clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.upload-part-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.upload-part-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.upload-part-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3/upload-part-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.upload-part-request/bucket :portkey.aws.s3.upload-part-request/key :portkey.aws.s3/part-number :portkey.aws.s3.upload-part-request/upload-id] :opt-un [:portkey.aws.s3/sse-customer-key-md-5 :portkey.aws.s3/sse-customer-algorithm :portkey.aws.s3/sse-customer-key :portkey.aws.s3/content-md-5 :portkey.aws.s3/body :portkey.aws.s3/content-length :portkey.aws.s3/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.noncurrent-version-transition/noncurrent-days (clojure.spec.alpha/and :portkey.aws.s3/days))
(clojure.spec.alpha/def :portkey.aws.s3.noncurrent-version-transition/storage-class (clojure.spec.alpha/and :portkey.aws.s3/transition-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3/noncurrent-version-transition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.noncurrent-version-transition/noncurrent-days :portkey.aws.s3.noncurrent-version-transition/storage-class]))

(clojure.spec.alpha/def :portkey.aws.s3/quote-fields #{:asneeded "ALWAYS" "ASNEEDED" :always})

(clojure.spec.alpha/def :portkey.aws.s3/index-document (clojure.spec.alpha/keys :req-un [:portkey.aws.s3/suffix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/key-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/common-prefix (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/prefix]))

(clojure.spec.alpha/def :portkey.aws.s3/next-upload-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/parquet-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.analytics-configuration/id (clojure.spec.alpha/and :portkey.aws.s3/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.analytics-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3/analytics-filter))
(clojure.spec.alpha/def :portkey.aws.s3/analytics-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.analytics-configuration/id :portkey.aws.s3/storage-class-analysis] :opt-un [:portkey.aws.s3.analytics-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3/expiration (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-bucket-acl-request/acl (clojure.spec.alpha/and :portkey.aws.s3/bucket-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3/put-bucket-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-bucket-acl-request/bucket] :opt-un [:portkey.aws.s3/content-md-5 :portkey.aws.s3/grant-read-acp :portkey.aws.s3/access-control-policy :portkey.aws.s3/grant-read :portkey.aws.s3.put-bucket-acl-request/acl :portkey.aws.s3/grant-write :portkey.aws.s3/grant-write-acp :portkey.aws.s3/grant-full-control]))

(clojure.spec.alpha/def :portkey.aws.s3/cloud-function (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-analytics-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.list-bucket-analytics-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3/token))
(clojure.spec.alpha/def :portkey.aws.s3/list-bucket-analytics-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.list-bucket-analytics-configurations-request/bucket] :opt-un [:portkey.aws.s3.list-bucket-analytics-configurations-request/continuation-token]))

(clojure.spec.alpha/def :portkey.aws.s3/request-payer #{"requester" :requester})

(clojure.spec.alpha/def :portkey.aws.s3.put-object-lock-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-lock-configuration-request/token (clojure.spec.alpha/and :portkey.aws.s3/object-lock-token))
(clojure.spec.alpha/def :portkey.aws.s3/put-object-lock-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-object-lock-configuration-request/bucket] :opt-un [:portkey.aws.s3/object-lock-configuration :portkey.aws.s3/request-payer :portkey.aws.s3.put-object-lock-configuration-request/token :portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3/response-cache-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3/delete-markers (clojure.spec.alpha/coll-of :portkey.aws.s3/delete-marker-entry))

(clojure.spec.alpha/def :portkey.aws.s3/get-bucket-replication-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3/replication-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.sse-kms-encrypted-objects/status (clojure.spec.alpha/and :portkey.aws.s3/sse-kms-encrypted-objects-status))
(clojure.spec.alpha/def :portkey.aws.s3/sse-kms-encrypted-objects (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.sse-kms-encrypted-objects/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3/object-lock-retention-mode #{"GOVERNANCE" :governance "COMPLIANCE" :compliance})

(clojure.spec.alpha/def :portkey.aws.s3.put-object-retention-request/bucket (clojure.spec.alpha/and :portkey.aws.s3/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-retention-request/key (clojure.spec.alpha/and :portkey.aws.s3/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-retention-request/retention (clojure.spec.alpha/and :portkey.aws.s3/object-lock-retention))
(clojure.spec.alpha/def :portkey.aws.s3.put-object-retention-request/version-id (clojure.spec.alpha/and :portkey.aws.s3/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3/put-object-retention-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.put-object-retention-request/bucket :portkey.aws.s3.put-object-retention-request/key] :opt-un [:portkey.aws.s3.put-object-retention-request/retention :portkey.aws.s3/request-payer :portkey.aws.s3.put-object-retention-request/version-id :portkey.aws.s3/bypass-governance-retention :portkey.aws.s3/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.object-lock-retention/mode (clojure.spec.alpha/and :portkey.aws.s3/object-lock-retention-mode))
(clojure.spec.alpha/def :portkey.aws.s3.object-lock-retention/retain-until-date (clojure.spec.alpha/and :portkey.aws.s3/date))
(clojure.spec.alpha/def :portkey.aws.s3/object-lock-retention (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.object-lock-retention/mode :portkey.aws.s3.object-lock-retention/retain-until-date]))

(clojure.spec.alpha/def :portkey.aws.s3/errors (clojure.spec.alpha/coll-of :portkey.aws.s3/error))

(clojure.core/defn delete-bucket "Deletes the bucket. All objects (including all object versions and Delete\nMarkers) in the bucket must be deleted before the bucket itself can be deleted." ([delete-bucket-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-request delete-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucket", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-logging "Returns the logging status of a bucket and the permissions users have to view\nand modify that status. To use GET, you must be the bucket owner." ([get-bucket-logging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-logging-request get-bucket-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-logging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?logging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-logging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketLogging", :http.request.configuration/output-deser-fn response-get-bucket-logging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-logging :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-logging-output))

(clojure.core/defn list-bucket-metrics-configurations "Lists the metrics configurations for the bucket." ([list-bucket-metrics-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-bucket-metrics-configurations-request list-bucket-metrics-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-bucket-metrics-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/list-bucket-metrics-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBucketMetricsConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-metrics-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-metrics-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3/list-bucket-metrics-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/list-bucket-metrics-configurations-output))

(clojure.core/defn delete-bucket-lifecycle "Deletes the lifecycle configuration from the bucket." ([delete-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-lifecycle-request delete-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketLifecycle", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-lifecycle-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-policy "Returns the policy of a specified bucket." ([get-bucket-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-policy-request get-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketPolicy", :http.request.configuration/output-deser-fn response-get-bucket-policy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-policy-output))

(clojure.core/defn put-bucket-versioning "Sets the versioning state of an existing bucket. To set the versioning state,\nyou must be the bucket owner." ([put-bucket-versioning-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-versioning-request put-bucket-versioning-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versioning", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-versioning-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketVersioning", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-versioning :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-versioning-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-policy-status "Retrieves the policy status for an Amazon S3 bucket, indicating whether the\nbucket is public." ([get-bucket-policy-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-policy-status-request get-bucket-policy-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-policy-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policyStatus", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-policy-status-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketPolicyStatus", :http.request.configuration/output-deser-fn response-get-bucket-policy-status-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-policy-status :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-policy-status-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-policy-status-output))

(clojure.core/defn list-object-versions "Returns metadata about all of the versions of objects in a bucket." ([list-object-versions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-object-versions-request list-object-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-object-versions-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versions", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/list-object-versions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectVersions", :http.request.configuration/output-deser-fn response-list-object-versions-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-object-versions :args (clojure.spec.alpha/tuple :portkey.aws.s3/list-object-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/list-object-versions-output))

(clojure.core/defn get-bucket-inventory-configuration "Returns an inventory configuration (identified by the inventory ID) from the\nbucket." ([get-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-inventory-configuration-request get-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-inventory-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketInventoryConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-inventory-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-inventory-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-inventory-configuration-output))

(clojure.core/defn put-bucket-encryption "Creates a new server-side encryption configuration (or replaces an existing one,\nif present)." ([put-bucket-encryption-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-encryption-request put-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketEncryption", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-encryption-request) :ret clojure.core/true?)

(clojure.core/defn delete-object-tagging "Removes the tag-set from an existing object." ([delete-object-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-object-tagging-request delete-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/delete-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteObjectTagging", :http.request.configuration/output-deser-fn response-delete-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/delete-object-tagging-output))

(clojure.core/defn get-object-tagging "Returns the tag-set of an object." ([get-object-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-tagging-request get-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectTagging", :http.request.configuration/output-deser-fn response-get-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-object-tagging-output))

(clojure.core/defn get-bucket-replication "Returns the replication configuration of a bucket.\n It can take a while to propagate the put or delete a replication configuration\nto all Amazon S3 systems. Therefore, a get request soon after put or delete can\nreturn a wrong result." ([get-bucket-replication-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-replication-request get-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-replication-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketReplication", :http.request.configuration/output-deser-fn response-get-bucket-replication-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-replication-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-replication-output))

(clojure.core/defn put-bucket-replication " Creates a replication configuration or replaces an existing one. For more\ninformation, see Cross-Region Replication (CRR)\n(https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) in the Amazon S3\nDeveloper Guide." ([put-bucket-replication-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-replication-request put-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketReplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-replication-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-analytics-configuration "Deletes an analytics configuration for the bucket (specified by the analytics\nconfiguration ID)." ([delete-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-analytics-configuration-request delete-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-analytics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-notification-configuration "Returns the notification configuration of a bucket." ([get-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-notification-configuration-request get-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/notification-configuration, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketNotificationConfiguration", :http.request.configuration/output-deser-fn response-notification-configuration, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-notification-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/notification-configuration))

(clojure.core/defn get-bucket-request-payment "Returns the request payment configuration of a bucket." ([get-bucket-request-payment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-request-payment-request get-bucket-request-payment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-request-payment-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?requestPayment", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-request-payment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketRequestPayment", :http.request.configuration/output-deser-fn response-get-bucket-request-payment-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-request-payment :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-request-payment-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-request-payment-output))

(clojure.core/defn put-object-retention "Places an Object Retention configuration on an object." ([put-object-retention-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-retention-request put-object-retention-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/put-object-retention-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?retention", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-object-retention-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectRetention", :http.request.configuration/output-deser-fn response-put-object-retention-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-retention :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-object-retention-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/put-object-retention-output))

(clojure.core/defn get-object-torrent "Return torrent files from a bucket." ([get-object-torrent-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-torrent-request get-object-torrent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-object-torrent-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?torrent", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-object-torrent-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectTorrent", :http.request.configuration/output-deser-fn response-get-object-torrent-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-torrent :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-object-torrent-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-object-torrent-output))

(clojure.core/defn list-objects "Returns some or all (up to 1000) of the objects in a bucket. You can use the\nrequest parameters as selection criteria to return a subset of the objects in a\nbucket." ([list-objects-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-objects-request list-objects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/list-objects-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjects", :http.request.configuration/output-deser-fn response-list-objects-output, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3/no-such-bucket}})))))
(clojure.spec.alpha/fdef list-objects :args (clojure.spec.alpha/tuple :portkey.aws.s3/list-objects-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/list-objects-output))

(clojure.core/defn list-objects-v-2 "Returns some or all (up to 1000) of the objects in a bucket. You can use the\nrequest parameters as selection criteria to return a subset of the objects in a\nbucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you\nuse this revised API for new application development." ([list-objects-v-2-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-objects-v-2-request list-objects-v-2-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-objects-v-2-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?list-type=2", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/list-objects-v-2-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectsV2", :http.request.configuration/output-deser-fn response-list-objects-v-2-output, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3/no-such-bucket}})))))
(clojure.spec.alpha/fdef list-objects-v-2 :args (clojure.spec.alpha/tuple :portkey.aws.s3/list-objects-v-2-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/list-objects-v-2-output))

(clojure.core/defn list-bucket-inventory-configurations "Returns a list of inventory configurations for the bucket." ([list-bucket-inventory-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-bucket-inventory-configurations-request list-bucket-inventory-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-bucket-inventory-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/list-bucket-inventory-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBucketInventoryConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-inventory-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-inventory-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3/list-bucket-inventory-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/list-bucket-inventory-configurations-output))

(clojure.core/defn delete-bucket-cors "Deletes the CORS configuration information set for the bucket." ([delete-bucket-cors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-cors-request delete-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketCors", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-cors-request) :ret clojure.core/true?)

(clojure.core/defn put-object "Adds an object to a bucket." ([put-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-request put-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/put-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObject", :http.request.configuration/output-deser-fn response-put-object-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/put-object-output))

(clojure.core/defn list-multipart-uploads "This operation lists in-progress multipart uploads." ([list-multipart-uploads-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-multipart-uploads-request list-multipart-uploads-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-multipart-uploads-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?uploads", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/list-multipart-uploads-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMultipartUploads", :http.request.configuration/output-deser-fn response-list-multipart-uploads-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-multipart-uploads :args (clojure.spec.alpha/tuple :portkey.aws.s3/list-multipart-uploads-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/list-multipart-uploads-output))

(clojure.core/defn put-bucket-lifecycle-configuration "Sets lifecycle configuration for your bucket. If a lifecycle configuration\nexists, it replaces it." ([put-bucket-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-lifecycle-configuration-request put-bucket-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-lifecycle-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketLifecycleConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-lifecycle-configuration-request) :ret clojure.core/true?)

(clojure.core/defn head-bucket "This operation is useful to determine if a bucket exists and you have permission\nto access it." ([head-bucket-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-head-bucket-request head-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/head-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "HeadBucket", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3/no-such-bucket}})))))
(clojure.spec.alpha/fdef head-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3/head-bucket-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-inventory-configuration "Adds an inventory configuration (identified by the inventory ID) from the\nbucket." ([put-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-inventory-configuration-request put-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketInventoryConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-inventory-configuration-request) :ret clojure.core/true?)

(clojure.core/defn create-bucket "Creates a new bucket." ([create-bucket-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-bucket-request create-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/create-bucket-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/create-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBucket", :http.request.configuration/output-deser-fn response-create-bucket-output, :http.request.spec/error-spec {"BucketAlreadyExists" :portkey.aws.s3/bucket-already-exists, "BucketAlreadyOwnedByYou" :portkey.aws.s3/bucket-already-owned-by-you}})))))
(clojure.spec.alpha/fdef create-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3/create-bucket-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/create-bucket-output))

(clojure.core/defn put-object-acl "uses the acl subresource to set the access control list (ACL) permissions for an\nobject that already exists in a bucket" ([put-object-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-acl-request put-object-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/put-object-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-object-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectAcl", :http.request.configuration/output-deser-fn response-put-object-acl-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3/no-such-key}})))))
(clojure.spec.alpha/fdef put-object-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-object-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/put-object-acl-output))

(clojure.core/defn get-object-retention "Retrieves an object's retention settings." ([get-object-retention-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-retention-request get-object-retention-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-object-retention-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?retention", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-object-retention-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectRetention", :http.request.configuration/output-deser-fn response-get-object-retention-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-retention :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-object-retention-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-object-retention-output))

(clojure.core/defn put-bucket-notification "Deprecated, see the PutBucketNotificationConfiguraiton operation." ([put-bucket-notification-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-notification-request put-bucket-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-notification-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketNotification", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-notification :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-notification-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-analytics-configuration "Gets an analytics configuration for the bucket (specified by the analytics\nconfiguration ID)." ([get-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-analytics-configuration-request get-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-analytics-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-analytics-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-analytics-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-analytics-configuration-output))

(clojure.core/defn complete-multipart-upload "Completes a multipart upload by assembling previously uploaded parts." ([complete-multipart-upload-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-complete-multipart-upload-request complete-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/complete-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/complete-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CompleteMultipartUpload", :http.request.configuration/output-deser-fn response-complete-multipart-upload-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef complete-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3/complete-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/complete-multipart-upload-output))

(clojure.core/defn abort-multipart-upload "Aborts a multipart upload.\n To verify that all parts have been removed, so you don't get charged for the\npart storage, you should call the List Parts operation and ensure the parts list\nis empty." ([abort-multipart-upload-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-abort-multipart-upload-request abort-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/abort-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/abort-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AbortMultipartUpload", :http.request.configuration/output-deser-fn response-abort-multipart-upload-output, :http.request.spec/error-spec {"NoSuchUpload" :portkey.aws.s3/no-such-upload}})))))
(clojure.spec.alpha/fdef abort-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3/abort-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/abort-multipart-upload-output))

(clojure.core/defn put-bucket-request-payment "Sets the request payment configuration for a bucket. By default, the bucket\nowner pays for downloads from the bucket. This configuration parameter enables\nthe bucket owner (only) to specify that the person requesting the download will\nbe charged for the download. Documentation on requester pays buckets can be\nfound at\nhttp://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html" ([put-bucket-request-payment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-request-payment-request put-bucket-request-payment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?requestPayment", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-request-payment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketRequestPayment", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-request-payment :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-request-payment-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-analytics-configuration "Sets an analytics configuration for the bucket (specified by the analytics\nconfiguration ID)." ([put-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-analytics-configuration-request put-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-analytics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn restore-object "Restores an archived copy of an object back into Amazon S3" ([restore-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-restore-object-request restore-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/restore-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?restore", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/restore-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreObject", :http.request.configuration/output-deser-fn response-restore-object-output, :http.request.spec/error-spec {"ObjectAlreadyInActiveTierError" :portkey.aws.s3/object-already-in-active-tier-error}})))))
(clojure.spec.alpha/fdef restore-object :args (clojure.spec.alpha/tuple :portkey.aws.s3/restore-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/restore-object-output))

(clojure.core/defn get-bucket-tagging "Returns the tag set associated with the bucket." ([get-bucket-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-tagging-request get-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketTagging", :http.request.configuration/output-deser-fn response-get-bucket-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-tagging-output))

(clojure.core/defn get-bucket-notification "Deprecated, see the GetBucketNotificationConfiguration operation." ([get-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-notification-configuration-request get-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/notification-configuration-deprecated, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketNotification", :http.request.configuration/output-deser-fn response-notification-configuration-deprecated, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-notification :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-notification-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/notification-configuration-deprecated))

(clojure.core/defn head-object "The HEAD operation retrieves metadata from an object without returning the\nobject itself. This operation is useful if you're only interested in an object's\nmetadata. To use HEAD, you must have READ access to the object." ([head-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-head-object-request head-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/head-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/head-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "HeadObject", :http.request.configuration/output-deser-fn response-head-object-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3/no-such-key}})))))
(clojure.spec.alpha/fdef head-object :args (clojure.spec.alpha/tuple :portkey.aws.s3/head-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/head-object-output))

(clojure.core/defn delete-public-access-block "Removes the PublicAccessBlock configuration from an Amazon S3 bucket." ([delete-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-public-access-block-request delete-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?publicAccessBlock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePublicAccessBlock", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-public-access-block-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-website "This operation removes the website configuration from the bucket." ([delete-bucket-website-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-website-request delete-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketWebsite", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-website-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-website "Returns the website configuration for a bucket." ([get-bucket-website-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-website-request get-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-website-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketWebsite", :http.request.configuration/output-deser-fn response-get-bucket-website-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-website-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-website-output))

(clojure.core/defn delete-bucket-replication " Deletes the replication configuration from the bucket. For information about\nreplication configuration, see Cross-Region Replication (CRR)\n(https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) in the Amazon S3\nDeveloper Guide." ([delete-bucket-replication-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-replication-request delete-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketReplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-replication-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-metrics-configuration "Deletes a metrics configuration (specified by the metrics configuration ID) from\nthe bucket." ([delete-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-metrics-configuration-request delete-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketMetricsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-metrics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn put-object-tagging "Sets the supplied tag-set to an object that already exists in a bucket" ([put-object-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-tagging-request put-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/put-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectTagging", :http.request.configuration/output-deser-fn response-put-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/put-object-tagging-output))

(clojure.core/defn put-object-legal-hold "Applies a Legal Hold configuration to the specified object." ([put-object-legal-hold-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-legal-hold-request put-object-legal-hold-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/put-object-legal-hold-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?legal-hold", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-object-legal-hold-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectLegalHold", :http.request.configuration/output-deser-fn response-put-object-legal-hold-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-legal-hold :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-object-legal-hold-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/put-object-legal-hold-output))

(clojure.core/defn list-buckets "Returns a list of all buckets owned by the authenticated sender of the request." ([] (list-buckets {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-buckets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec nil, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBuckets", :http.request.configuration/output-deser-fn response-list-buckets-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-buckets :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.s3/list-buckets-output))

(clojure.core/defn put-bucket-policy "Replaces a policy on a bucket. If the bucket already has a policy, the one in\nthis request completely replaces it." ([put-bucket-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-policy-request put-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-policy-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-accelerate-configuration "Sets the accelerate configuration of an existing bucket." ([put-bucket-accelerate-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-accelerate-configuration-request put-bucket-accelerate-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?accelerate", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-accelerate-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketAccelerateConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-accelerate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-accelerate-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-acl "Gets the access control policy for the bucket." ([get-bucket-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-acl-request get-bucket-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketAcl", :http.request.configuration/output-deser-fn response-get-bucket-acl-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-acl-output))

(clojure.core/defn get-bucket-metrics-configuration "Gets a metrics configuration (specified by the metrics configuration ID) from\nthe bucket." ([get-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-metrics-configuration-request get-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-metrics-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketMetricsConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-metrics-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-metrics-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-metrics-configuration-output))

(clojure.core/defn get-object-lock-configuration "Gets the Object Lock configuration for a bucket. The rule specified in the\nObject Lock configuration will be applied by default to every new object placed\nin the specified bucket." ([get-object-lock-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-lock-configuration-request get-object-lock-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-object-lock-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?object-lock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-object-lock-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectLockConfiguration", :http.request.configuration/output-deser-fn response-get-object-lock-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-lock-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-object-lock-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-object-lock-configuration-output))

(clojure.core/defn get-bucket-cors "Returns the CORS configuration for the bucket." ([get-bucket-cors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-cors-request get-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-cors-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketCors", :http.request.configuration/output-deser-fn response-get-bucket-cors-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-cors-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-cors-output))

(clojure.core/defn create-multipart-upload "Initiates a multipart upload and returns an upload ID.\n Note: After you initiate multipart upload and upload one or more parts, you\nmust either complete or abort multipart upload in order to stop getting charged\nfor storage of the uploaded parts. Only after you either complete or abort\nmultipart upload, Amazon S3 frees up the parts storage and stops charging you\nfor the parts storage." ([create-multipart-upload-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-multipart-upload-request create-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/create-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?uploads", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/create-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMultipartUpload", :http.request.configuration/output-deser-fn response-create-multipart-upload-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3/create-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/create-multipart-upload-output))

(clojure.core/defn delete-object "Removes the null version (if there is one) of an object and inserts a delete\nmarker, which becomes the latest version of the object. If there isn't a null\nversion, Amazon S3 does not remove any objects." ([delete-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-object-request delete-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/delete-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteObject", :http.request.configuration/output-deser-fn response-delete-object-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/delete-object-output))

(clojure.core/defn get-public-access-block "Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket." ([get-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-public-access-block-request get-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-public-access-block-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?publicAccessBlock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicAccessBlock", :http.request.configuration/output-deser-fn response-get-public-access-block-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-public-access-block-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-public-access-block-output))

(clojure.core/defn put-bucket-metrics-configuration "Sets a metrics configuration (specified by the metrics configuration ID) for the\nbucket." ([put-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-metrics-configuration-request put-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketMetricsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-metrics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-accelerate-configuration "Returns the accelerate configuration of a bucket." ([get-bucket-accelerate-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-accelerate-configuration-request get-bucket-accelerate-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-accelerate-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?accelerate", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-accelerate-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketAccelerateConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-accelerate-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-accelerate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-accelerate-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-accelerate-configuration-output))

(clojure.core/defn delete-bucket-tagging "Deletes the tags from the bucket." ([delete-bucket-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-tagging-request delete-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketTagging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-tagging-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-tagging "Sets the tags for a bucket." ([put-bucket-tagging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-tagging-request put-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketTagging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-tagging-request) :ret clojure.core/true?)

(clojure.core/defn list-parts "Lists the parts that have been uploaded for a specific multipart upload." ([list-parts-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-parts-request list-parts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-parts-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/list-parts-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListParts", :http.request.configuration/output-deser-fn response-list-parts-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-parts :args (clojure.spec.alpha/tuple :portkey.aws.s3/list-parts-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/list-parts-output))

(clojure.core/defn get-object-acl "Returns the access control list (ACL) of an object." ([get-object-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-acl-request get-object-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-object-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-object-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectAcl", :http.request.configuration/output-deser-fn response-get-object-acl-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3/no-such-key}})))))
(clojure.spec.alpha/fdef get-object-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-object-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-object-acl-output))

(clojure.core/defn upload-part-copy "Uploads a part by copying data from an existing object as data source." ([upload-part-copy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-upload-part-copy-request upload-part-copy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/upload-part-copy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/upload-part-copy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadPartCopy", :http.request.configuration/output-deser-fn response-upload-part-copy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef upload-part-copy :args (clojure.spec.alpha/tuple :portkey.aws.s3/upload-part-copy-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/upload-part-copy-output))

(clojure.core/defn get-bucket-lifecycle-configuration "Returns the lifecycle configuration information set on the bucket." ([get-bucket-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-lifecycle-configuration-request get-bucket-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-lifecycle-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-lifecycle-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketLifecycleConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-lifecycle-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-lifecycle-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-lifecycle-configuration-output))

(clojure.core/defn delete-objects "This operation enables you to delete multiple objects from a bucket using a\nsingle HTTP request. You may specify up to 1000 keys." ([delete-objects-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-objects-request delete-objects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/delete-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?delete", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-objects-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteObjects", :http.request.configuration/output-deser-fn response-delete-objects-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-objects :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-objects-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/delete-objects-output))

(clojure.core/defn delete-bucket-inventory-configuration "Deletes an inventory configuration (identified by the inventory ID) from the\nbucket." ([delete-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-inventory-configuration-request delete-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketInventoryConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-inventory-configuration-request) :ret clojure.core/true?)

(clojure.core/defn put-object-lock-configuration "Places an Object Lock configuration on the specified bucket. The rule specified\nin the Object Lock configuration will be applied by default to every new object\nplaced in the specified bucket." ([put-object-lock-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-object-lock-configuration-request put-object-lock-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/put-object-lock-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?object-lock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-object-lock-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutObjectLockConfiguration", :http.request.configuration/output-deser-fn response-put-object-lock-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-lock-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-object-lock-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/put-object-lock-configuration-output))

(clojure.core/defn put-bucket-website "Set the website configuration for a bucket." ([put-bucket-website-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-website-request put-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketWebsite", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-website-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-location "Returns the region the bucket resides in." ([get-bucket-location-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-location-request get-bucket-location-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-location-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?location", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-location-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketLocation", :http.request.configuration/output-deser-fn response-get-bucket-location-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-location :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-location-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-location-output))

(clojure.core/defn get-bucket-encryption "Returns the server-side encryption configuration of a bucket." ([get-bucket-encryption-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-encryption-request get-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-encryption-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketEncryption", :http.request.configuration/output-deser-fn response-get-bucket-encryption-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-encryption-output))

(clojure.core/defn upload-part "Uploads a part in a multipart upload.\n Note: After you initiate multipart upload and upload one or more parts, you\nmust either complete or abort multipart upload in order to stop getting charged\nfor storage of the uploaded parts. Only after you either complete or abort\nmultipart upload, Amazon S3 frees up the parts storage and stops charging you\nfor the parts storage." ([upload-part-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-upload-part-request upload-part-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/upload-part-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/upload-part-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadPart", :http.request.configuration/output-deser-fn response-upload-part-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef upload-part :args (clojure.spec.alpha/tuple :portkey.aws.s3/upload-part-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/upload-part-output))

(clojure.core/defn get-bucket-lifecycle "Deprecated, see the GetBucketLifecycleConfiguration operation." ([get-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-lifecycle-request get-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-lifecycle-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketLifecycle", :http.request.configuration/output-deser-fn response-get-bucket-lifecycle-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-lifecycle-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-lifecycle-output))

(clojure.core/defn get-object-legal-hold "Gets an object's current Legal Hold status." ([get-object-legal-hold-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-legal-hold-request get-object-legal-hold-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-object-legal-hold-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?legal-hold", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-object-legal-hold-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectLegalHold", :http.request.configuration/output-deser-fn response-get-object-legal-hold-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-legal-hold :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-object-legal-hold-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-object-legal-hold-output))

(clojure.core/defn copy-object "Creates a copy of an object that is already stored in Amazon S3." ([copy-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-copy-object-request copy-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/copy-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/copy-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CopyObject", :http.request.configuration/output-deser-fn response-copy-object-output, :http.request.spec/error-spec {"ObjectNotInActiveTierError" :portkey.aws.s3/object-not-in-active-tier-error}})))))
(clojure.spec.alpha/fdef copy-object :args (clojure.spec.alpha/tuple :portkey.aws.s3/copy-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/copy-object-output))

(clojure.core/defn put-bucket-lifecycle "Deprecated, see the PutBucketLifecycleConfiguration operation." ([put-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-lifecycle-request put-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketLifecycle", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-lifecycle-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-notification-configuration "Enables notifications of specified events for a bucket." ([put-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-notification-configuration-request put-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketNotificationConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-notification-configuration-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-policy "Deletes the policy from the bucket." ([delete-bucket-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-policy-request delete-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-bucket-analytics-configurations "Lists the analytics configurations for the bucket." ([list-bucket-analytics-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-bucket-analytics-configurations-request list-bucket-analytics-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/list-bucket-analytics-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/list-bucket-analytics-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBucketAnalyticsConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-analytics-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-analytics-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3/list-bucket-analytics-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/list-bucket-analytics-configurations-output))

(clojure.core/defn get-bucket-versioning "Returns the versioning state of a bucket." ([get-bucket-versioning-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-bucket-versioning-request get-bucket-versioning-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-bucket-versioning-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versioning", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-bucket-versioning-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBucketVersioning", :http.request.configuration/output-deser-fn response-get-bucket-versioning-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-versioning :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-bucket-versioning-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-bucket-versioning-output))

(clojure.core/defn put-bucket-cors "Sets the CORS configuration for a bucket." ([put-bucket-cors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-cors-request put-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketCors", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-cors-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-encryption "Deletes the server-side encryption configuration from the bucket." ([delete-bucket-encryption-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bucket-encryption-request delete-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/delete-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBucketEncryption", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3/delete-bucket-encryption-request) :ret clojure.core/true?)

(clojure.core/defn select-object-content "This operation filters the contents of an Amazon S3 object based on a simple\nStructured Query Language (SQL) statement. In the request, along with the SQL\nexpression, you must also specify a data serialization format (JSON or CSV) of\nthe object. Amazon S3 uses this to parse object data into records, and returns\nonly records that match the specified SQL expression. You must also specify the\ndata serialization format for the response." ([select-object-content-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-select-object-content-request select-object-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/select-object-content-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?select&select-type=2", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/select-object-content-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SelectObjectContent", :http.request.configuration/output-deser-fn response-select-object-content-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef select-object-content :args (clojure.spec.alpha/tuple :portkey.aws.s3/select-object-content-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/select-object-content-output))

(clojure.core/defn get-object "Retrieves objects from Amazon S3." ([get-object-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-object-request get-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3/get-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/get-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObject", :http.request.configuration/output-deser-fn response-get-object-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3/no-such-key}})))))
(clojure.spec.alpha/fdef get-object :args (clojure.spec.alpha/tuple :portkey.aws.s3/get-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3/get-object-output))

(clojure.core/defn put-public-access-block "Creates or modifies the PublicAccessBlock configuration for an Amazon S3 bucket." ([put-public-access-block-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-public-access-block-request put-public-access-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?publicAccessBlock", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-public-access-block-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutPublicAccessBlock", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-public-access-block :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-public-access-block-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-logging "Set the logging parameters for a bucket and to specify permissions for who can\nview and modify the logging parameters. To set the logging status of a bucket,\nyou must be the bucket owner." ([put-bucket-logging-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-logging-request put-bucket-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?logging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-logging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketLogging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-logging :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-logging-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-acl "Sets the permissions on a bucket using access control lists (ACL)." ([put-bucket-acl-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-bucket-acl-request put-bucket-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.s3/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3/put-bucket-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBucketAcl", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3/put-bucket-acl-request) :ret clojure.core/true?)
