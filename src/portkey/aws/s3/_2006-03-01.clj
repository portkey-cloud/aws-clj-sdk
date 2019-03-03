(ns portkey.aws.s3.-2006-03-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
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
    :signature-version :s3v4}})

(clojure.core/declare ser-mfa-delete)

(clojure.core/declare ser-metrics-configuration)

(clojure.core/declare ser-cloud-function-invocation-role)

(clojure.core/declare ser-input-serialization)

(clojure.core/declare ser-tier)

(clojure.core/declare ser-content-encoding)

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

(clojure.core/declare ser-response-content-disposition)

(clojure.core/declare ser-filter-rule-name)

(clojure.core/declare ser-inventory-id)

(clojure.core/declare ser-topic-configuration-list)

(clojure.core/declare ser-access-control-translation)

(clojure.core/declare ser-topic-configuration-deprecated)

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

(clojure.core/declare ser-lifecycle-rule)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-analytics-and-operator)

(clojure.core/declare ser-lambda-function-configuration-list)

(clojure.core/declare ser-source-selection-criteria)

(clojure.core/declare ser-access-control-policy)

(clojure.core/declare ser-destination)

(clojure.core/declare ser-max-parts)

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

(clojure.core/declare ser-bucket-location-constraint)

(clojure.core/declare ser-ssekms-key-id)

(clojure.core/declare ser-allowed-origin)

(clojure.core/declare ser-token)

(clojure.core/declare ser-accelerate-configuration)

(clojure.core/declare ser-lambda-function-configuration)

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

(clojure.core/defn- ser-mfa-delete [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "MFADelete"})

(clojure.core/defn- ser-metrics-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metrics-id (:id input)) #:http.request.field{:name "Id", :shape "MetricsId"})], :shape "MetricsConfiguration", :type "structure"} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics-filter (input :filter)) #:http.request.field{:name "Filter", :shape "MetricsFilter"}))))

(clojure.core/defn- ser-cloud-function-invocation-role [input] #:http.request.field{:value input, :shape "CloudFunctionInvocationRole"})

(clojure.core/defn- ser-input-serialization [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputSerialization", :type "structure"} (clojure.core/contains? input :csv) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-csv-input (input :csv)) #:http.request.field{:name "CSV", :shape "CSVInput"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionType"})) (clojure.core/contains? input :json) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-json-input (input :json)) #:http.request.field{:name "JSON", :shape "JSONInput"})) (clojure.core/contains? input :parquet) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parquet-input (input :parquet)) #:http.request.field{:name "Parquet", :shape "ParquetInput"}))))

(clojure.core/defn- ser-tier [input] #:http.request.field{:value (clojure.core/get {"Standard" "Standard", :standard "Standard", "Bulk" "Bulk", :bulk "Bulk", "Expedited" "Expedited", :expedited "Expedited"} input), :shape "Tier"})

(clojure.core/defn- ser-content-encoding [input] #:http.request.field{:value input, :shape "ContentEncoding"})

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

(clojure.core/defn- ser-response-content-disposition [input] #:http.request.field{:value input, :shape "ResponseContentDisposition"})

(clojure.core/defn- ser-filter-rule-name [input] #:http.request.field{:value (clojure.core/get {"prefix" "prefix", :prefix "prefix", "suffix" "suffix", :suffix "suffix"} input), :shape "FilterRuleName"})

(clojure.core/defn- ser-inventory-id [input] #:http.request.field{:value input, :shape "InventoryId"})

(clojure.core/defn- ser-topic-configuration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-topic-configuration coll) #:http.request.field{:shape "TopicConfiguration"}))) input), :shape "TopicConfigurationList", :type "list", :flattened true})

(clojure.core/defn- ser-access-control-translation [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-owner-override (:owner input)) #:http.request.field{:name "Owner", :shape "OwnerOverride"})], :shape "AccessControlTranslation", :type "structure"}))

(clojure.core/defn- ser-topic-configuration-deprecated [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TopicConfigurationDeprecated", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-id (input :id)) #:http.request.field{:name "Id", :shape "NotificationId"})) (clojure.core/contains? input :events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-list (input :events)) #:http.request.field{:name "Events", :shape "EventList", :location-name "Event"})) (clojure.core/contains? input :event) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event (input :event)) #:http.request.field{:name "Event", :shape "Event", :deprecated true})) (clojure.core/contains? input :topic) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic-arn (input :topic)) #:http.request.field{:name "Topic", :shape "TopicArn"}))))

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

(clojure.core/defn- ser-inventory-optional-field [input] #:http.request.field{:value (clojure.core/get {"LastModifiedDate" "LastModifiedDate", :storage-class "StorageClass", "ReplicationStatus" "ReplicationStatus", "EncryptionStatus" "EncryptionStatus", "ETag" "ETag", :size "Size", :replication-status "ReplicationStatus", "Size" "Size", "IsMultipartUploaded" "IsMultipartUploaded", "StorageClass" "StorageClass", :encryption-status "EncryptionStatus", :is-multipart-uploaded "IsMultipartUploaded", :last-modified-date "LastModifiedDate", :e-tag "ETag"} input), :shape "InventoryOptionalField"})

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

(clojure.core/defn- ser-transition-storage-class [input] #:http.request.field{:value (clojure.core/get {"GLACIER" "GLACIER", :glacier "GLACIER", "STANDARD_IA" "STANDARD_IA", :standard-ia "STANDARD_IA", "ONEZONE_IA" "ONEZONE_IA", :onezone-ia "ONEZONE_IA"} input), :shape "TransitionStorageClass"})

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

(clojure.core/defn- ser-lifecycle-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-expiration-status (:status input)) #:http.request.field{:name "Status", :shape "ExpirationStatus"})], :shape "LifecycleRule", :type "structure"} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-rule-filter (input :filter)) #:http.request.field{:name "Filter", :shape "LifecycleRuleFilter"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :deprecated true})) (clojure.core/contains? input :transitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transition-list (input :transitions)) #:http.request.field{:name "Transitions", :shape "TransitionList", :location-name "Transition"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :id)) #:http.request.field{:name "ID", :shape "ID"})) (clojure.core/contains? input :noncurrent-version-expiration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noncurrent-version-expiration (input :noncurrent-version-expiration)) #:http.request.field{:name "NoncurrentVersionExpiration", :shape "NoncurrentVersionExpiration"})) (clojure.core/contains? input :abort-incomplete-multipart-upload) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-abort-incomplete-multipart-upload (input :abort-incomplete-multipart-upload)) #:http.request.field{:name "AbortIncompleteMultipartUpload", :shape "AbortIncompleteMultipartUpload"})) (clojure.core/contains? input :noncurrent-version-transitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noncurrent-version-transition-list (input :noncurrent-version-transitions)) #:http.request.field{:name "NoncurrentVersionTransitions", :shape "NoncurrentVersionTransitionList", :location-name "NoncurrentVersionTransition"})) (clojure.core/contains? input :expiration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-expiration (input :expiration)) #:http.request.field{:name "Expiration", :shape "LifecycleExpiration"}))))

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-analytics-and-operator [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AnalyticsAndOperator", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-set (input :tags)) #:http.request.field{:name "Tags", :shape "TagSet", :flattened true, :location-name "Tag"}))))

(clojure.core/defn- ser-lambda-function-configuration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-function-configuration coll) #:http.request.field{:shape "LambdaFunctionConfiguration"}))) input), :shape "LambdaFunctionConfigurationList", :type "list", :flattened true})

(clojure.core/defn- ser-source-selection-criteria [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SourceSelectionCriteria", :type "structure"} (clojure.core/contains? input :sse-kms-encrypted-objects) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-kms-encrypted-objects (input :sse-kms-encrypted-objects)) #:http.request.field{:name "SseKmsEncryptedObjects", :shape "SseKmsEncryptedObjects"}))))

(clojure.core/defn- ser-access-control-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccessControlPolicy", :type "structure"} (clojure.core/contains? input :grants) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grants (input :grants)) #:http.request.field{:name "Grants", :shape "Grants", :location-name "AccessControlList"})) (clojure.core/contains? input :owner) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-owner (input :owner)) #:http.request.field{:name "Owner", :shape "Owner"}))))

(clojure.core/defn- ser-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket input)) #:http.request.field{:name "Bucket", :shape "BucketName"})], :shape "Destination", :type "structure"} (clojure.core/contains? input :account) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account)) #:http.request.field{:name "Account", :shape "AccountId"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass"})) (clojure.core/contains? input :access-control-translation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-control-translation (input :access-control-translation)) #:http.request.field{:name "AccessControlTranslation", :shape "AccessControlTranslation"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"}))))

(clojure.core/defn- ser-max-parts [input] #:http.request.field{:value input, :shape "MaxParts"})

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

(clojure.core/defn- ser-event [input] #:http.request.field{:value (clojure.core/get {:s-3-object-removed-delete "s3:ObjectRemoved:Delete", "s3:ObjectCreated:*" "s3:ObjectCreated:*", :s-3-object-created-copy "s3:ObjectCreated:Copy", "s3:ObjectRemoved:Delete" "s3:ObjectRemoved:Delete", :s-3-object-created-complete-multipart-upload "s3:ObjectCreated:CompleteMultipartUpload", "s3:ObjectRemoved:*" "s3:ObjectRemoved:*", "s3:ObjectRemoved:DeleteMarkerCreated" "s3:ObjectRemoved:DeleteMarkerCreated", :s-3-object-created-put "s3:ObjectCreated:Put", "s3:ObjectCreated:Copy" "s3:ObjectCreated:Copy", :s-3-object-removed "s3:ObjectRemoved:*", "s3:ObjectCreated:Post" "s3:ObjectCreated:Post", "s3:ObjectCreated:CompleteMultipartUpload" "s3:ObjectCreated:CompleteMultipartUpload", "s3:ReducedRedundancyLostObject" "s3:ReducedRedundancyLostObject", :s-3-object-created "s3:ObjectCreated:*", "s3:ObjectCreated:Put" "s3:ObjectCreated:Put", :s-3-object-created-post "s3:ObjectCreated:Post", :s-3-object-removed-delete-marker-created "s3:ObjectRemoved:DeleteMarkerCreated", :s-3-reduced-redundancy-lost-object "s3:ReducedRedundancyLostObject"} input), :shape "Event"})

(clojure.core/defn- ser-bucket-canned-acl [input] #:http.request.field{:value (clojure.core/get {"private" "private", :private "private", "public-read" "public-read", :publicread "public-read", "public-read-write" "public-read-write", :publicreadwrite "public-read-write", "authenticated-read" "authenticated-read", :authenticatedread "authenticated-read"} input), :shape "BucketCannedACL"})

(clojure.core/defn- ser-quote-character [input] #:http.request.field{:value input, :shape "QuoteCharacter"})

(clojure.core/defn- ser-restore-request-type [input] #:http.request.field{:value (clojure.core/get {"SELECT" "SELECT", :select "SELECT"} input), :shape "RestoreRequestType"})

(clojure.core/defn- ser-quiet [input] #:http.request.field{:value input, :shape "Quiet"})

(clojure.core/defn- ser-content-disposition [input] #:http.request.field{:value input, :shape "ContentDisposition"})

(clojure.core/defn- ser-error-document [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-key (:key input)) #:http.request.field{:name "Key", :shape "ObjectKey"})], :shape "ErrorDocument", :type "structure"}))

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

(clojure.core/defn- ser-storage-class [input] #:http.request.field{:value (clojure.core/get {"STANDARD" "STANDARD", :standard "STANDARD", "REDUCED_REDUNDANCY" "REDUCED_REDUNDANCY", :reduced-redundancy "REDUCED_REDUNDANCY", "STANDARD_IA" "STANDARD_IA", :standard-ia "STANDARD_IA", "ONEZONE_IA" "ONEZONE_IA", :onezone-ia "ONEZONE_IA"} input), :shape "StorageClass"})

(clojure.core/defn- ser-server-side-encryption-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServerSideEncryptionRule", :type "structure"} (clojure.core/contains? input :apply-server-side-encryption-by-default) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-side-encryption-by-default (input :apply-server-side-encryption-by-default)) #:http.request.field{:name "ApplyServerSideEncryptionByDefault", :shape "ServerSideEncryptionByDefault"}))))

(clojure.core/defn- ser-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule coll) #:http.request.field{:shape "Rule"}))) input), :shape "Rules", :type "list", :flattened true})

(clojure.core/defn- ser-lifecycle-expiration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecycleExpiration", :type "structure"} (clojure.core/contains? input :date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :date)) #:http.request.field{:name "Date", :shape "Date"})) (clojure.core/contains? input :days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-days (input :days)) #:http.request.field{:name "Days", :shape "Days"})) (clojure.core/contains? input :expired-object-delete-marker) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expired-object-delete-marker (input :expired-object-delete-marker)) #:http.request.field{:name "ExpiredObjectDeleteMarker", :shape "ExpiredObjectDeleteMarker"}))))

(clojure.core/defn- ser-inventory-format [input] #:http.request.field{:value (clojure.core/get {"CSV" "CSV", :csv "CSV", "ORC" "ORC", :orc "ORC"} input), :shape "InventoryFormat"})

(clojure.core/defn- ser-queue-configuration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-queue-configuration coll) #:http.request.field{:shape "QueueConfiguration"}))) input), :shape "QueueConfigurationList", :type "list", :flattened true})

(clojure.core/defn- ser-grantee [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-type (:type input)) #:http.request.field{:name "Type", :shape "Type", :location-name "xsi:type", :xml-attribute true})], :shape "Grantee", :type "structure", :xml-namespace {"prefix" "xsi", "uri" "http://www.w3.org/2001/XMLSchema-instance"}} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :email-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "EmailAddress"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :id)) #:http.request.field{:name "ID", :shape "ID"})) (clojure.core/contains? input :uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri (input :uri)) #:http.request.field{:name "URI", :shape "URI"}))))

(clojure.core/defn- ser-key-prefix-equals [input] #:http.request.field{:value input, :shape "KeyPrefixEquals"})

(clojure.core/defn- ser-file-header-info [input] #:http.request.field{:value (clojure.core/get {"USE" "USE", :use "USE", "IGNORE" "IGNORE", :ignore "IGNORE", "NONE" "NONE", :none "NONE"} input), :shape "FileHeaderInfo"})

(clojure.core/defn- ser-output-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputLocation", :type "structure"} (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :s-3)) #:http.request.field{:name "S3", :shape "S3Location"}))))

(clojure.core/defn- ser-allowed-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-allowed-header coll) #:http.request.field{:shape "AllowedHeader"}))) input), :shape "AllowedHeaders", :type "list", :flattened true})

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

(clojure.core/defn- ser-bucket-location-constraint [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :apsoutheast-2 "ap-southeast-2", "ap-southeast-2" "ap-southeast-2", "EU" "EU", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :cnnorth-1 "cn-north-1", "eu-central-1" "eu-central-1", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :uswest-2 "us-west-2", :eu "EU"} input), :shape "BucketLocationConstraint"})

(clojure.core/defn- ser-ssekms-key-id [input] #:http.request.field{:value input, :shape "SSEKMSKeyId"})

(clojure.core/defn- ser-allowed-origin [input] #:http.request.field{:value input, :shape "AllowedOrigin"})

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-accelerate-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccelerateConfiguration", :type "structure"} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-accelerate-status (input :status)) #:http.request.field{:name "Status", :shape "BucketAccelerateStatus"}))))

(clojure.core/defn- ser-lambda-function-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-function-arn (:lambda-function-arn input)) #:http.request.field{:name "LambdaFunctionArn", :shape "LambdaFunctionArn", :location-name "CloudFunction"}) (clojure.core/into (ser-event-list (:events input)) #:http.request.field{:name "Events", :shape "EventList", :location-name "Event"})], :shape "LambdaFunctionConfiguration", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-id (input :id)) #:http.request.field{:name "Id", :shape "NotificationId"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-configuration-filter (input :filter)) #:http.request.field{:name "Filter", :shape "NotificationConfigurationFilter"}))))

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

(clojure.core/defn- req-delete-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :mfa) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mfa (input :mfa)) #:http.request.field{:name "MFA", :shape "MFA", :location "header", :location-name "x-amz-mfa"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-encoding (input :content-encoding)) #:http.request.field{:name "ContentEncoding", :shape "ContentEncoding", :location "header", :location-name "Content-Encoding"})) (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-website-redirect-location (input :website-redirect-location)) #:http.request.field{:name "WebsiteRedirectLocation", :shape "WebsiteRedirectLocation", :location "header", :location-name "x-amz-website-redirect-location"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-body (input :body)) #:http.request.field{:name "Body", :shape "Body", :streaming true})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-side-encryption (input :server-side-encryption)) #:http.request.field{:name "ServerSideEncryption", :shape "ServerSideEncryption", :location "header", :location-name "x-amz-server-side-encryption"})) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-disposition (input :content-disposition)) #:http.request.field{:name "ContentDisposition", :shape "ContentDisposition", :location "header", :location-name "Content-Disposition"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType", :location "header", :location-name "Content-Type"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "ObjectCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :content-length) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-length (input :content-length)) #:http.request.field{:name "ContentLength", :shape "ContentLength", :location "header", :location-name "Content-Length"})) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata (input :metadata)) #:http.request.field{:name "Metadata", :shape "Metadata", :location "headers", :location-name "x-amz-meta-"})) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-control (input :cache-control)) #:http.request.field{:name "CacheControl", :shape "CacheControl", :location "header", :location-name "Cache-Control"})) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-language (input :content-language)) #:http.request.field{:name "ContentLanguage", :shape "ContentLanguage", :location "header", :location-name "Content-Language"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"})) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging-header (input :tagging)) #:http.request.field{:name "Tagging", :shape "TaggingHeader", :location "header", :location-name "x-amz-tagging"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass", :location "header", :location-name "x-amz-storage-class"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires (input :expires)) #:http.request.field{:name "Expires", :shape "Expires", :location "header", :location-name "Expires"})) (clojure.core/contains? input :ssekms-key-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms-key-id (input :ssekms-key-id)) #:http.request.field{:name "SSEKMSKeyId", :shape "SSEKMSKeyId", :location "header", :location-name "x-amz-server-side-encryption-aws-kms-key-id"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-lifecycle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-delete-bucket-cors-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-complete-multipart-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :querystring [(clojure.core/into (ser-multipart-upload-id (input :upload-id)) #:http.request.field{:name "UploadId", :shape "MultipartUploadId", :location "querystring", :location-name "uploadId"})]} (clojure.core/contains? input :multipart-upload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-completed-multipart-upload (input :multipart-upload)) #:http.request.field{:name "MultipartUpload", :shape "CompletedMultipartUpload", :location-name "CompleteMultipartUpload", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-notification-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-get-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

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

(clojure.core/defn- req-upload-part-copy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :header [(clojure.core/into (ser-copy-source (input :copy-source)) #:http.request.field{:name "CopySource", :shape "CopySource", :location "header", :location-name "x-amz-copy-source"})], :querystring [(clojure.core/into (ser-part-number (input :part-number)) #:http.request.field{:name "PartNumber", :shape "PartNumber", :location "querystring", :location-name "partNumber"}) (clojure.core/into (ser-multipart-upload-id (input :upload-id)) #:http.request.field{:name "UploadId", :shape "MultipartUploadId", :location "querystring", :location-name "uploadId"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :copy-source-sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-key (input :copy-source-sse-customer-key)) #:http.request.field{:name "CopySourceSSECustomerKey", :shape "CopySourceSSECustomerKey", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-key"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :copy-source-if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-match (input :copy-source-if-match)) #:http.request.field{:name "CopySourceIfMatch", :shape "CopySourceIfMatch", :location "header", :location-name "x-amz-copy-source-if-match"})) (clojure.core/contains? input :copy-source-range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-range (input :copy-source-range)) #:http.request.field{:name "CopySourceRange", :shape "CopySourceRange", :location "header", :location-name "x-amz-copy-source-range"})) (clojure.core/contains? input :copy-source-if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-none-match (input :copy-source-if-none-match)) #:http.request.field{:name "CopySourceIfNoneMatch", :shape "CopySourceIfNoneMatch", :location "header", :location-name "x-amz-copy-source-if-none-match"})) (clojure.core/contains? input :copy-source-if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-modified-since (input :copy-source-if-modified-since)) #:http.request.field{:name "CopySourceIfModifiedSince", :shape "CopySourceIfModifiedSince", :location "header", :location-name "x-amz-copy-source-if-modified-since"})) (clojure.core/contains? input :copy-source-if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-unmodified-since (input :copy-source-if-unmodified-since)) #:http.request.field{:name "CopySourceIfUnmodifiedSince", :shape "CopySourceIfUnmodifiedSince", :location "header", :location-name "x-amz-copy-source-if-unmodified-since"})) (clojure.core/contains? input :copy-source-sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-algorithm (input :copy-source-sse-customer-algorithm)) #:http.request.field{:name "CopySourceSSECustomerAlgorithm", :shape "CopySourceSSECustomerAlgorithm", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :copy-source-sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-key-md-5 (input :copy-source-sse-customer-key-md-5)) #:http.request.field{:name "CopySourceSSECustomerKeyMD5", :shape "CopySourceSSECustomerKeyMD5", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-delete-objects-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-delete (input :delete)) #:http.request.field{:name "Delete", :shape "Delete", :location-name "Delete", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :mfa) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mfa (input :mfa)) #:http.request.field{:name "MFA", :shape "MFA", :location "header", :location-name "x-amz-mfa"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-copy-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :header [(clojure.core/into (ser-copy-source (input :copy-source)) #:http.request.field{:name "CopySource", :shape "CopySource", :location "header", :location-name "x-amz-copy-source"})]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-encoding (input :content-encoding)) #:http.request.field{:name "ContentEncoding", :shape "ContentEncoding", :location "header", :location-name "Content-Encoding"})) (clojure.core/contains? input :tagging-directive) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging-directive (input :tagging-directive)) #:http.request.field{:name "TaggingDirective", :shape "TaggingDirective", :location "header", :location-name "x-amz-tagging-directive"})) (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :copy-source-sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-key (input :copy-source-sse-customer-key)) #:http.request.field{:name "CopySourceSSECustomerKey", :shape "CopySourceSSECustomerKey", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-key"})) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-website-redirect-location (input :website-redirect-location)) #:http.request.field{:name "WebsiteRedirectLocation", :shape "WebsiteRedirectLocation", :location "header", :location-name "x-amz-website-redirect-location"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :metadata-directive) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata-directive (input :metadata-directive)) #:http.request.field{:name "MetadataDirective", :shape "MetadataDirective", :location "header", :location-name "x-amz-metadata-directive"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-side-encryption (input :server-side-encryption)) #:http.request.field{:name "ServerSideEncryption", :shape "ServerSideEncryption", :location "header", :location-name "x-amz-server-side-encryption"})) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-disposition (input :content-disposition)) #:http.request.field{:name "ContentDisposition", :shape "ContentDisposition", :location "header", :location-name "Content-Disposition"})) (clojure.core/contains? input :copy-source-if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-match (input :copy-source-if-match)) #:http.request.field{:name "CopySourceIfMatch", :shape "CopySourceIfMatch", :location "header", :location-name "x-amz-copy-source-if-match"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType", :location "header", :location-name "Content-Type"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "ObjectCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :copy-source-if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-none-match (input :copy-source-if-none-match)) #:http.request.field{:name "CopySourceIfNoneMatch", :shape "CopySourceIfNoneMatch", :location "header", :location-name "x-amz-copy-source-if-none-match"})) (clojure.core/contains? input :copy-source-if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-modified-since (input :copy-source-if-modified-since)) #:http.request.field{:name "CopySourceIfModifiedSince", :shape "CopySourceIfModifiedSince", :location "header", :location-name "x-amz-copy-source-if-modified-since"})) (clojure.core/contains? input :copy-source-if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-if-unmodified-since (input :copy-source-if-unmodified-since)) #:http.request.field{:name "CopySourceIfUnmodifiedSince", :shape "CopySourceIfUnmodifiedSince", :location "header", :location-name "x-amz-copy-source-if-unmodified-since"})) (clojure.core/contains? input :copy-source-sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-algorithm (input :copy-source-sse-customer-algorithm)) #:http.request.field{:name "CopySourceSSECustomerAlgorithm", :shape "CopySourceSSECustomerAlgorithm", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :copy-source-sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-source-sse-customer-key-md-5 (input :copy-source-sse-customer-key-md-5)) #:http.request.field{:name "CopySourceSSECustomerKeyMD5", :shape "CopySourceSSECustomerKeyMD5", :location "header", :location-name "x-amz-copy-source-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata (input :metadata)) #:http.request.field{:name "Metadata", :shape "Metadata", :location "headers", :location-name "x-amz-meta-"})) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-control (input :cache-control)) #:http.request.field{:name "CacheControl", :shape "CacheControl", :location "header", :location-name "Cache-Control"})) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-language (input :content-language)) #:http.request.field{:name "ContentLanguage", :shape "ContentLanguage", :location "header", :location-name "Content-Language"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"})) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging-header (input :tagging)) #:http.request.field{:name "Tagging", :shape "TaggingHeader", :location "header", :location-name "x-amz-tagging"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass", :location "header", :location-name "x-amz-storage-class"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires (input :expires)) #:http.request.field{:name "Expires", :shape "Expires", :location "header", :location-name "Expires"})) (clojure.core/contains? input :ssekms-key-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms-key-id (input :ssekms-key-id)) #:http.request.field{:name "SSEKMSKeyId", :shape "SSEKMSKeyId", :location "header", :location-name "x-amz-server-side-encryption-aws-kms-key-id"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-restore-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :restore-request) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restore-request (input :restore-request)) #:http.request.field{:name "RestoreRequest", :shape "RestoreRequest", :location-name "RestoreRequest", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-get-bucket-replication-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-create-multipart-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-encoding (input :content-encoding)) #:http.request.field{:name "ContentEncoding", :shape "ContentEncoding", :location "header", :location-name "Content-Encoding"})) (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-website-redirect-location (input :website-redirect-location)) #:http.request.field{:name "WebsiteRedirectLocation", :shape "WebsiteRedirectLocation", :location "header", :location-name "x-amz-website-redirect-location"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-side-encryption (input :server-side-encryption)) #:http.request.field{:name "ServerSideEncryption", :shape "ServerSideEncryption", :location "header", :location-name "x-amz-server-side-encryption"})) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-disposition (input :content-disposition)) #:http.request.field{:name "ContentDisposition", :shape "ContentDisposition", :location "header", :location-name "Content-Disposition"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType", :location "header", :location-name "Content-Type"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "ObjectCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metadata (input :metadata)) #:http.request.field{:name "Metadata", :shape "Metadata", :location "headers", :location-name "x-amz-meta-"})) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-control (input :cache-control)) #:http.request.field{:name "CacheControl", :shape "CacheControl", :location "header", :location-name "Cache-Control"})) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-language (input :content-language)) #:http.request.field{:name "ContentLanguage", :shape "ContentLanguage", :location "header", :location-name "Content-Language"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"})) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tagging-header (input :tagging)) #:http.request.field{:name "Tagging", :shape "TaggingHeader", :location "header", :location-name "x-amz-tagging"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass", :location "header", :location-name "x-amz-storage-class"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires (input :expires)) #:http.request.field{:name "Expires", :shape "Expires", :location "header", :location-name "Expires"})) (clojure.core/contains? input :ssekms-key-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssekms-key-id (input :ssekms-key-id)) #:http.request.field{:name "SSEKMSKeyId", :shape "SSEKMSKeyId", :location "header", :location-name "x-amz-server-side-encryption-aws-kms-key-id"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-head-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-unmodified-since (input :if-unmodified-since)) #:http.request.field{:name "IfUnmodifiedSince", :shape "IfUnmodifiedSince", :location "header", :location-name "If-Unmodified-Since"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"})) (clojure.core/contains? input :if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-modified-since (input :if-modified-since)) #:http.request.field{:name "IfModifiedSince", :shape "IfModifiedSince", :location "header", :location-name "If-Modified-Since"})) (clojure.core/contains? input :part-number) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-part-number (input :part-number)) #:http.request.field{:name "PartNumber", :shape "PartNumber", :location "querystring", :location-name "partNumber"})) (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-range (input :range)) #:http.request.field{:name "Range", :shape "Range", :location "header", :location-name "Range"})) (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-match (input :if-match)) #:http.request.field{:name "IfMatch", :shape "IfMatch", :location "header", :location-name "If-Match"})) (clojure.core/contains? input :if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-if-none-match (input :if-none-match)) #:http.request.field{:name "IfNoneMatch", :shape "IfNoneMatch", :location "header", :location-name "If-None-Match"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-list-object-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delimiter (input :delimiter)) #:http.request.field{:name "Delimiter", :shape "Delimiter", :location "querystring", :location-name "delimiter"})) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoding-type (input :encoding-type)) #:http.request.field{:name "EncodingType", :shape "EncodingType", :location "querystring", :location-name "encoding-type"})) (clojure.core/contains? input :key-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-marker (input :key-marker)) #:http.request.field{:name "KeyMarker", :shape "KeyMarker", :location "querystring", :location-name "key-marker"})) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-keys (input :max-keys)) #:http.request.field{:name "MaxKeys", :shape "MaxKeys", :location "querystring", :location-name "max-keys"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :location "querystring", :location-name "prefix"})) (clojure.core/contains? input :version-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-id-marker (input :version-id-marker)) #:http.request.field{:name "VersionIdMarker", :shape "VersionIdMarker", :location "querystring", :location-name "version-id-marker"}))))

(clojure.core/defn- req-put-bucket-notification-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-notification-configuration (input :notification-configuration)) #:http.request.field{:name "NotificationConfiguration", :shape "NotificationConfiguration", :location-name "NotificationConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]}))

(clojure.core/defn- req-list-objects-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delimiter (input :delimiter)) #:http.request.field{:name "Delimiter", :shape "Delimiter", :location "querystring", :location-name "delimiter"})) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoding-type (input :encoding-type)) #:http.request.field{:name "EncodingType", :shape "EncodingType", :location "querystring", :location-name "encoding-type"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-keys (input :max-keys)) #:http.request.field{:name "MaxKeys", :shape "MaxKeys", :location "querystring", :location-name "max-keys"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :location "querystring", :location-name "prefix"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-put-bucket-metrics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-metrics-id (input :id)) #:http.request.field{:name "Id", :shape "MetricsId", :location "querystring", :location-name "id"})], :body [(clojure.core/into (ser-metrics-configuration (input :metrics-configuration)) #:http.request.field{:name "MetricsConfiguration", :shape "MetricsConfiguration", :location-name "MetricsConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]}))

(clojure.core/defn- req-delete-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-delete-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-list-bucket-inventory-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "Token", :location "querystring", :location-name "continuation-token"}))))

(clojure.core/defn- req-delete-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

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

(clojure.core/defn- req-create-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "BucketCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :create-bucket-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-bucket-configuration (input :create-bucket-configuration)) #:http.request.field{:name "CreateBucketConfiguration", :shape "CreateBucketConfiguration", :location-name "CreateBucketConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :grant-write) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write (input :grant-write)) #:http.request.field{:name "GrantWrite", :shape "GrantWrite", :location "header", :location-name "x-amz-grant-write"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"}))))

(clojure.core/defn- req-delete-bucket-analytics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-analytics-id (input :id)) #:http.request.field{:name "Id", :shape "AnalyticsId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-get-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-policy (input :policy)) #:http.request.field{:name "Policy", :shape "Policy"})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :confirm-remove-self-bucket-access) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-confirm-remove-self-bucket-access (input :confirm-remove-self-bucket-access)) #:http.request.field{:name "ConfirmRemoveSelfBucketAccess", :shape "ConfirmRemoveSelfBucketAccess", :location "header", :location-name "x-amz-confirm-remove-self-bucket-access"}))))

(clojure.core/defn- req-delete-object-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-version-id (input :version-id)) #:http.request.field{:name "VersionId", :shape "ObjectVersionId", :location "querystring", :location-name "versionId"}))))

(clojure.core/defn- req-put-bucket-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-server-side-encryption-configuration (input :server-side-encryption-configuration)) #:http.request.field{:name "ServerSideEncryptionConfiguration", :shape "ServerSideEncryptionConfiguration", :location-name "ServerSideEncryptionConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-list-objects-v-2-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix", :location "querystring", :location-name "prefix"})) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoding-type (input :encoding-type)) #:http.request.field{:name "EncodingType", :shape "EncodingType", :location "querystring", :location-name "encoding-type"})) (clojure.core/contains? input :start-after) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start-after (input :start-after)) #:http.request.field{:name "StartAfter", :shape "StartAfter", :location "querystring", :location-name "start-after"})) (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "Token", :location "querystring", :location-name "continuation-token"})) (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delimiter (input :delimiter)) #:http.request.field{:name "Delimiter", :shape "Delimiter", :location "querystring", :location-name "delimiter"})) (clojure.core/contains? input :fetch-owner) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fetch-owner (input :fetch-owner)) #:http.request.field{:name "FetchOwner", :shape "FetchOwner", :location "querystring", :location-name "fetch-owner"})) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-keys (input :max-keys)) #:http.request.field{:name "MaxKeys", :shape "MaxKeys", :location "querystring", :location-name "max-keys"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-put-bucket-cors-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-cors-configuration (input :cors-configuration)) #:http.request.field{:name "CORSConfiguration", :shape "CORSConfiguration", :location-name "CORSConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-put-bucket-accelerate-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-accelerate-configuration (input :accelerate-configuration)) #:http.request.field{:name "AccelerateConfiguration", :shape "AccelerateConfiguration", :location-name "AccelerateConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]}))

(clojure.core/defn- req-delete-bucket-inventory-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-inventory-id (input :id)) #:http.request.field{:name "Id", :shape "InventoryId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-get-bucket-inventory-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-inventory-id (input :id)) #:http.request.field{:name "Id", :shape "InventoryId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-put-bucket-lifecycle-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :lifecycle-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-lifecycle-configuration (input :lifecycle-configuration)) #:http.request.field{:name "LifecycleConfiguration", :shape "BucketLifecycleConfiguration", :location-name "LifecycleConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}}))))

(clojure.core/defn- req-select-object-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :body [(clojure.core/into (ser-expression (input :expression)) #:http.request.field{:name "Expression", :shape "Expression"}) (clojure.core/into (ser-expression-type (input :expression-type)) #:http.request.field{:name "ExpressionType", :shape "ExpressionType"}) (clojure.core/into (ser-input-serialization (input :input-serialization)) #:http.request.field{:name "InputSerialization", :shape "InputSerialization"}) (clojure.core/into (ser-output-serialization (input :output-serialization)) #:http.request.field{:name "OutputSerialization", :shape "OutputSerialization"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :request-progress) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-progress (input :request-progress)) #:http.request.field{:name "RequestProgress", :shape "RequestProgress"}))))

(clojure.core/defn- req-delete-bucket-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]}))

(clojure.core/defn- req-put-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :body [(clojure.core/into (ser-website-configuration (input :website-configuration)) #:http.request.field{:name "WebsiteConfiguration", :shape "WebsiteConfiguration", :location-name "WebsiteConfiguration", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"}))))

(clojure.core/defn- req-list-bucket-metrics-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "Token", :location "querystring", :location-name "continuation-token"}))))

(clojure.core/defn- req-get-bucket-analytics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})], :querystring [(clojure.core/into (ser-analytics-id (input :id)) #:http.request.field{:name "Id", :shape "AnalyticsId", :location "querystring", :location-name "id"})]}))

(clojure.core/defn- req-upload-part-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"}) (clojure.core/into (ser-object-key (input :key)) #:http.request.field{:name "Key", :shape "ObjectKey", :location "uri", :location-name "Key"})], :querystring [(clojure.core/into (ser-part-number (input :part-number)) #:http.request.field{:name "PartNumber", :shape "PartNumber", :location "querystring", :location-name "partNumber"}) (clojure.core/into (ser-multipart-upload-id (input :upload-id)) #:http.request.field{:name "UploadId", :shape "MultipartUploadId", :location "querystring", :location-name "uploadId"})]} (clojure.core/contains? input :sse-customer-key-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key-md-5 (input :sse-customer-key-md-5)) #:http.request.field{:name "SSECustomerKeyMD5", :shape "SSECustomerKeyMD5", :location "header", :location-name "x-amz-server-side-encryption-customer-key-MD5"})) (clojure.core/contains? input :sse-customer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-algorithm (input :sse-customer-algorithm)) #:http.request.field{:name "SSECustomerAlgorithm", :shape "SSECustomerAlgorithm", :location "header", :location-name "x-amz-server-side-encryption-customer-algorithm"})) (clojure.core/contains? input :sse-customer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sse-customer-key (input :sse-customer-key)) #:http.request.field{:name "SSECustomerKey", :shape "SSECustomerKey", :location "header", :location-name "x-amz-server-side-encryption-customer-key"})) (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-body (input :body)) #:http.request.field{:name "Body", :shape "Body", :streaming true})) (clojure.core/contains? input :content-length) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-length (input :content-length)) #:http.request.field{:name "ContentLength", :shape "ContentLength", :location "header", :location-name "Content-Length"})) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-payer (input :request-payer)) #:http.request.field{:name "RequestPayer", :shape "RequestPayer", :location "header", :location-name "x-amz-request-payer"}))))

(clojure.core/defn- req-put-bucket-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :content-md-5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-md-5 (input :content-md-5)) #:http.request.field{:name "ContentMD5", :shape "ContentMD5", :location "header", :location-name "Content-MD5"})) (clojure.core/contains? input :grant-read-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read-acp (input :grant-read-acp)) #:http.request.field{:name "GrantReadACP", :shape "GrantReadACP", :location "header", :location-name "x-amz-grant-read-acp"})) (clojure.core/contains? input :access-control-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-control-policy (input :access-control-policy)) #:http.request.field{:name "AccessControlPolicy", :shape "AccessControlPolicy", :location-name "AccessControlPolicy", :xml-namespace {"uri" "http://s3.amazonaws.com/doc/2006-03-01/"}})) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-read (input :grant-read)) #:http.request.field{:name "GrantRead", :shape "GrantRead", :location "header", :location-name "x-amz-grant-read"})) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-canned-acl (input :acl)) #:http.request.field{:name "ACL", :shape "BucketCannedACL", :location "header", :location-name "x-amz-acl"})) (clojure.core/contains? input :grant-write) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write (input :grant-write)) #:http.request.field{:name "GrantWrite", :shape "GrantWrite", :location "header", :location-name "x-amz-grant-write"})) (clojure.core/contains? input :grant-write-acp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-write-acp (input :grant-write-acp)) #:http.request.field{:name "GrantWriteACP", :shape "GrantWriteACP", :location "header", :location-name "x-amz-grant-write-acp"})) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-full-control (input :grant-full-control)) #:http.request.field{:name "GrantFullControl", :shape "GrantFullControl", :location "header", :location-name "x-amz-grant-full-control"}))))

(clojure.core/defn- req-list-bucket-analytics-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName", :location "uri", :location-name "Bucket"})]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :continuation-token)) #:http.request.field{:name "ContinuationToken", :shape "Token", :location "querystring", :location-name "continuation-token"}))))

(clojure.core/declare deser-bucket)

(clojure.core/declare deser-metrics-configuration)

(clojure.core/declare deser-missing-meta)

(clojure.core/declare deser-cloud-function-invocation-role)

(clojure.core/declare deser-content-encoding)

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

(clojure.core/declare deser-mfa-delete-status)

(clojure.core/declare deser-filter-rule-name)

(clojure.core/declare deser-inventory-id)

(clojure.core/declare deser-topic-configuration-list)

(clojure.core/declare deser-access-control-translation)

(clojure.core/declare deser-topic-configuration-deprecated)

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

(clojure.core/declare deser-bucket-location-constraint)

(clojure.core/declare deser-ssekms-key-id)

(clojure.core/declare deser-allowed-origin)

(clojure.core/declare deser-token)

(clojure.core/declare deser-lambda-function-configuration)

(clojure.core/declare deser-delete-marker-version-id)

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

(clojure.core/declare deser-errors)

(clojure.core/defn- deser-bucket [input] (clojure.core/let [letvar60069 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "CreationDate" (portkey.aws/search-for-tag input "CreationDate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar60069 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar60069 ["Name" :content]))) (letvar60069 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar60069 ["CreationDate" :content]))))))

(clojure.core/defn- deser-metrics-configuration [input] (clojure.core/let [letvar60165 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-metrics-id (clojure.core/get-in letvar60165 ["Id" :content]))} (letvar60165 "Filter") (clojure.core/assoc :filter (deser-metrics-filter (clojure.core/get-in letvar60165 ["Filter" :content]))))))

(clojure.core/defn- deser-missing-meta [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-function-invocation-role [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-content-encoding [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-key-count [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-multipart-upload-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-multipart-upload (:content coll)))) input))

(clojure.core/defn- deser-tag-set [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-sse-customer-key-md-5 [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-routing-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-routing-rule coll))) input))

(clojure.core/defn- deser-expired-object-delete-marker [input] (clojure.core/when-let [boolstr__31777__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__31777__auto__) true (clojure.core/= "false" boolstr__31777__auto__) false)))

(clojure.core/defn- deser-replica-kms-key-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-metrics-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metrics-configuration (:content coll)))) input))

(clojure.core/defn- deser-notification-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-common-prefix-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-common-prefix (:content coll)))) input))

(clojure.core/defn- deser-continuation-event [input] (clojure.core/let [letvar60377 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-mfa-delete-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-filter-rule-name [input] (clojure.core/get {"prefix" :prefix, "suffix" :suffix} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-inventory-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-topic-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-topic-configuration (:content coll)))) input))

(clojure.core/defn- deser-access-control-translation [input] (clojure.core/let [letvar60505 {"Owner" (portkey.aws/search-for-tag input "Owner" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:owner (deser-owner-override (clojure.core/get-in letvar60505 ["Owner" :content]))})))

(clojure.core/defn- deser-topic-configuration-deprecated [input] (clojure.core/let [letvar60601 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? false :xmlAttribute? nil), "Topic" (portkey.aws/search-for-tag input "Topic" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar60601 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar60601 ["Id" :content]))) (letvar60601 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar60601 ["Event"]))) (letvar60601 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar60601 ["Event" :content]))) (letvar60601 "Topic") (clojure.core/assoc :topic (deser-topic-arn (clojure.core/get-in letvar60601 ["Topic" :content]))))))

(clojure.core/defn- deser-website-redirect-location [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-prefix [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-type [input] (clojure.core/get {"CanonicalUser" :canonical-user, "AmazonCustomerByEmail" :amazon-customer-by-email, "Group" :group} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-copy-source-version-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-storage-class-analysis-schema-version [input] (clojure.core/get {"V_1" :v-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-encoding-type [input] (clojure.core/get {"url" :url} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-sse-kms-encrypted-objects-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-next-key-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-encryption-configuration [input] (clojure.core/let [letvar60737 {"ReplicaKmsKeyID" (portkey.aws/search-for-tag input "ReplicaKmsKeyID" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar60737 "ReplicaKmsKeyID") (clojure.core/assoc :replica-kms-key-id (deser-replica-kms-key-id (clojure.core/get-in letvar60737 ["ReplicaKmsKeyID" :content]))))))

(clojure.core/defn- deser-inventory-filter [input] (clojure.core/let [letvar60833 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:prefix (deser-prefix (clojure.core/get-in letvar60833 ["Prefix" :content]))})))

(clojure.core/defn- deser-cloud-function-configuration [input] (clojure.core/let [letvar60929 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "CloudFunction" (portkey.aws/search-for-tag input "CloudFunction" :flattened? false :xmlAttribute? nil), "InvocationRole" (portkey.aws/search-for-tag input "InvocationRole" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar60929 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar60929 ["Id" :content]))) (letvar60929 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar60929 ["Event" :content]))) (letvar60929 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar60929 ["Event"]))) (letvar60929 "CloudFunction") (clojure.core/assoc :cloud-function (deser-cloud-function (clojure.core/get-in letvar60929 ["CloudFunction" :content]))) (letvar60929 "InvocationRole") (clojure.core/assoc :invocation-role (deser-cloud-function-invocation-role (clojure.core/get-in letvar60929 ["InvocationRole" :content]))))))

(clojure.core/defn- deser-inventory-optional-field [input] (clojure.core/get {"Size" :size, "LastModifiedDate" :last-modified-date, "StorageClass" :storage-class, "ETag" :e-tag, "IsMultipartUploaded" :is-multipart-uploaded, "ReplicationStatus" :replication-status, "EncryptionStatus" :encryption-status} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-permission [input] (clojure.core/get {"FULL_CONTROL" :full-control, "WRITE" :write, "WRITE_ACP" :write-acp, "READ" :read, "READ_ACP" :read-acp} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-select-object-content-event-stream [input] (clojure.core/let [letvar61035 {"Records" (portkey.aws/search-for-tag input "Records" :flattened? false :xmlAttribute? nil), "Stats" (portkey.aws/search-for-tag input "Stats" :flattened? false :xmlAttribute? nil), "Progress" (portkey.aws/search-for-tag input "Progress" :flattened? false :xmlAttribute? nil), "Cont" (portkey.aws/search-for-tag input "Cont" :flattened? false :xmlAttribute? nil), "End" (portkey.aws/search-for-tag input "End" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar61035 "Records") (clojure.core/assoc :records (deser-records-event (clojure.core/get-in letvar61035 ["Records" :content]))) (letvar61035 "Stats") (clojure.core/assoc :stats (deser-stats-event (clojure.core/get-in letvar61035 ["Stats" :content]))) (letvar61035 "Progress") (clojure.core/assoc :progress (deser-progress-event (clojure.core/get-in letvar61035 ["Progress" :content]))) (letvar61035 "Cont") (clojure.core/assoc :cont (deser-continuation-event (clojure.core/get-in letvar61035 ["Cont" :content]))) (letvar61035 "End") (clojure.core/assoc :end (deser-end-event (clojure.core/get-in letvar61035 ["End" :content]))))))

(clojure.core/defn- deser-server-side-encryption-configuration [input] (clojure.core/let [letvar61131 {"Rule" (portkey.aws/search-for-tag input "Rule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:rules (deser-server-side-encryption-rules (clojure.core/get-in letvar61131 ["Rule"]))})))

(clojure.core/defn- deser-target-grant [input] (clojure.core/let [letvar61227 {"Grantee" (portkey.aws/search-for-tag input "Grantee" :flattened? false :xmlAttribute? nil), "Permission" (portkey.aws/search-for-tag input "Permission" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar61227 "Grantee") (clojure.core/assoc :grantee (deser-grantee (clojure.core/get-in letvar61227 ["Grantee" :content]))) (letvar61227 "Permission") (clojure.core/assoc :permission (deser-bucket-logs-permission (clojure.core/get-in letvar61227 ["Permission" :content]))))))

(clojure.core/defn- deser-replication-configuration [input] (clojure.core/let [letvar61323 {"Role" (portkey.aws/search-for-tag input "Role" :flattened? false :xmlAttribute? nil), "Rule" (portkey.aws/search-for-tag input "Rule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:role (deser-role (clojure.core/get-in letvar61323 ["Role" :content])), :rules (deser-replication-rules (clojure.core/get-in letvar61323 ["Rule"]))})))

(clojure.core/defn- deser-sse-customer-algorithm [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-inventory-schedule [input] (clojure.core/let [letvar61424 {"Frequency" (portkey.aws/search-for-tag input "Frequency" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:frequency (deser-inventory-frequency (clojure.core/get-in letvar61424 ["Frequency" :content]))})))

(clojure.core/defn- deser-transition [input] (clojure.core/let [letvar61520 {"Date" (portkey.aws/search-for-tag input "Date" :flattened? false :xmlAttribute? nil), "Days" (portkey.aws/search-for-tag input "Days" :flattened? false :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar61520 "Date") (clojure.core/assoc :date (deser-date (clojure.core/get-in letvar61520 ["Date" :content]))) (letvar61520 "Days") (clojure.core/assoc :days (deser-days (clojure.core/get-in letvar61520 ["Days" :content]))) (letvar61520 "StorageClass") (clojure.core/assoc :storage-class (deser-transition-storage-class (clojure.core/get-in letvar61520 ["StorageClass" :content]))))))

(clojure.core/defn- deser-multipart-upload [input] (clojure.core/let [letvar61616 {"UploadId" (portkey.aws/search-for-tag input "UploadId" :flattened? false :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Initiated" (portkey.aws/search-for-tag input "Initiated" :flattened? false :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? false :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? false :xmlAttribute? nil), "Initiator" (portkey.aws/search-for-tag input "Initiator" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar61616 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar61616 ["UploadId" :content]))) (letvar61616 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar61616 ["Key" :content]))) (letvar61616 "Initiated") (clojure.core/assoc :initiated (deser-initiated (clojure.core/get-in letvar61616 ["Initiated" :content]))) (letvar61616 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar61616 ["StorageClass" :content]))) (letvar61616 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar61616 ["Owner" :content]))) (letvar61616 "Initiator") (clojure.core/assoc :initiator (deser-initiator (clojure.core/get-in letvar61616 ["Initiator" :content]))))))

(clojure.core/defn- deser-analytics-export-destination [input] (clojure.core/let [letvar61712 {"S3BucketDestination" (portkey.aws/search-for-tag input "S3BucketDestination" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:s-3-bucket-destination (deser-analytics-s-3-bucket-destination (clojure.core/get-in letvar61712 ["S3BucketDestination" :content]))})))

(clojure.core/defn- deser-storage-class-analysis [input] (clojure.core/let [letvar61808 {"DataExport" (portkey.aws/search-for-tag input "DataExport" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar61808 "DataExport") (clojure.core/assoc :data-export (deser-storage-class-analysis-data-export (clojure.core/get-in letvar61808 ["DataExport" :content]))))))

(clojure.core/defn- deser-expose-header [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-body [input] input)

(clojure.core/defn- deser-delete-marker-replication-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-object [input] (clojure.core/let [letvar61916 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? false :xmlAttribute? nil), "ETag" (portkey.aws/search-for-tag input "ETag" :flattened? false :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? false :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? false :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar61916 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar61916 ["Key" :content]))) (letvar61916 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar61916 ["LastModified" :content]))) (letvar61916 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar61916 ["ETag" :content]))) (letvar61916 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar61916 ["Size" :content]))) (letvar61916 "StorageClass") (clojure.core/assoc :storage-class (deser-object-storage-class (clojure.core/get-in letvar61916 ["StorageClass" :content]))) (letvar61916 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar61916 ["Owner" :content]))))))

(clojure.core/defn- deser-grants [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-grant coll))) input))

(clojure.core/defn- deser-transition-storage-class [input] (clojure.core/get {"GLACIER" :glacier, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-lifecycle-rule-filter [input] (clojure.core/let [letvar62034 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? false :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar62034 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar62034 ["Prefix" :content]))) (letvar62034 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar62034 ["Tag" :content]))) (letvar62034 "And") (clojure.core/assoc :and (deser-lifecycle-rule-and-operator (clojure.core/get-in letvar62034 ["And" :content]))))))

(clojure.core/defn- deser-payer [input] (clojure.core/get {"Requester" :requester, "BucketOwner" :bucket-owner} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-metrics-filter [input] (clojure.core/let [letvar62135 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? false :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar62135 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar62135 ["Prefix" :content]))) (letvar62135 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar62135 ["Tag" :content]))) (letvar62135 "And") (clojure.core/assoc :and (deser-metrics-and-operator (clojure.core/get-in letvar62135 ["And" :content]))))))

(clojure.core/defn- deser-inventory-destination [input] (clojure.core/let [letvar62231 {"S3BucketDestination" (portkey.aws/search-for-tag input "S3BucketDestination" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:s-3-bucket-destination (deser-inventory-s-3-bucket-destination (clojure.core/get-in letvar62231 ["S3BucketDestination" :content]))})))

(clojure.core/defn- deser-object-version-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-days-after-initiation [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-copy-part-result [input] (clojure.core/let [letvar62334 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? false :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar62334 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar62334 ["ETag" :content]))) (letvar62334 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar62334 ["LastModified" :content]))))))

(clojure.core/defn- deser-replication-rule-filter [input] (clojure.core/let [letvar62430 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? false :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar62430 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar62430 ["Prefix" :content]))) (letvar62430 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar62430 ["Tag" :content]))) (letvar62430 "And") (clojure.core/assoc :and (deser-replication-rule-and-operator (clojure.core/get-in letvar62430 ["And" :content]))))))

(clojure.core/defn- deser-deleted-objects [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deleted-object (:content coll)))) input))

(clojure.core/defn- deser-start-after [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-inventory-encryption [input] (clojure.core/let [letvar62548 {"SSE-S3" (portkey.aws/search-for-tag input "SSE-S3" :flattened? false :xmlAttribute? nil), "SSE-KMS" (portkey.aws/search-for-tag input "SSE-KMS" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar62548 "SSE-S3") (clojure.core/assoc :sses-3 (deser-sses-3 (clojure.core/get-in letvar62548 ["SSE-S3" :content]))) (letvar62548 "SSE-KMS") (clojure.core/assoc :ssekms (deser-ssekms (clojure.core/get-in letvar62548 ["SSE-KMS" :content]))))))

(clojure.core/defn- deser-replace-key-prefix-with [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-content-range [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-metrics-and-operator [input] (clojure.core/let [letvar62654 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar62654 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar62654 ["Prefix" :content]))) (letvar62654 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar62654 ["Tag" :content]))))))

(clojure.core/defn- deser-lifecycle-rule [input] (clojure.core/let [letvar62750 {"Filter" (portkey.aws/search-for-tag input "Filter" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Transition" (portkey.aws/search-for-tag input "Transition" :flattened? true :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? false :xmlAttribute? nil), "NoncurrentVersionExpiration" (portkey.aws/search-for-tag input "NoncurrentVersionExpiration" :flattened? false :xmlAttribute? nil), "AbortIncompleteMultipartUpload" (portkey.aws/search-for-tag input "AbortIncompleteMultipartUpload" :flattened? false :xmlAttribute? nil), "NoncurrentVersionTransition" (portkey.aws/search-for-tag input "NoncurrentVersionTransition" :flattened? true :xmlAttribute? nil), "Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-expiration-status (clojure.core/get-in letvar62750 ["Status" :content]))} (letvar62750 "Filter") (clojure.core/assoc :filter (deser-lifecycle-rule-filter (clojure.core/get-in letvar62750 ["Filter" :content]))) (letvar62750 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar62750 ["Prefix" :content]))) (letvar62750 "Transition") (clojure.core/assoc :transitions (deser-transition-list (clojure.core/get-in letvar62750 ["Transition"]))) (letvar62750 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar62750 ["ID" :content]))) (letvar62750 "NoncurrentVersionExpiration") (clojure.core/assoc :noncurrent-version-expiration (deser-noncurrent-version-expiration (clojure.core/get-in letvar62750 ["NoncurrentVersionExpiration" :content]))) (letvar62750 "AbortIncompleteMultipartUpload") (clojure.core/assoc :abort-incomplete-multipart-upload (deser-abort-incomplete-multipart-upload (clojure.core/get-in letvar62750 ["AbortIncompleteMultipartUpload" :content]))) (letvar62750 "NoncurrentVersionTransition") (clojure.core/assoc :noncurrent-version-transitions (deser-noncurrent-version-transition-list (clojure.core/get-in letvar62750 ["NoncurrentVersionTransition"]))) (letvar62750 "Expiration") (clojure.core/assoc :expiration (deser-lifecycle-expiration (clojure.core/get-in letvar62750 ["Expiration" :content]))))))

(clojure.core/defn- deser-parts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-part (:content coll)))) input))

(clojure.core/defn- deser-abort-date [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-accept-ranges [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-replication-status [input] (clojure.core/get {"COMPLETE" :complete, "PENDING" :pending, "FAILED" :failed, "REPLICA" :replica} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-analytics-and-operator [input] (clojure.core/let [letvar62880 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar62880 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar62880 ["Prefix" :content]))) (letvar62880 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar62880 ["Tag" :content]))))))

(clojure.core/defn- deser-lambda-function-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-configuration (:content coll)))) input))

(clojure.core/defn- deser-source-selection-criteria [input] (clojure.core/let [letvar62993 {"SseKmsEncryptedObjects" (portkey.aws/search-for-tag input "SseKmsEncryptedObjects" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar62993 "SseKmsEncryptedObjects") (clojure.core/assoc :sse-kms-encrypted-objects (deser-sse-kms-encrypted-objects (clojure.core/get-in letvar62993 ["SseKmsEncryptedObjects" :content]))))))

(clojure.core/defn- deser-destination [input] (clojure.core/let [letvar63089 {"Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Account" (portkey.aws/search-for-tag input "Account" :flattened? false :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? false :xmlAttribute? nil), "AccessControlTranslation" (portkey.aws/search-for-tag input "AccessControlTranslation" :flattened? false :xmlAttribute? nil), "EncryptionConfiguration" (portkey.aws/search-for-tag input "EncryptionConfiguration" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:bucket (deser-bucket-name (clojure.core/get-in letvar63089 ["Bucket" :content]))} (letvar63089 "Account") (clojure.core/assoc :account (deser-account-id (clojure.core/get-in letvar63089 ["Account" :content]))) (letvar63089 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar63089 ["StorageClass" :content]))) (letvar63089 "AccessControlTranslation") (clojure.core/assoc :access-control-translation (deser-access-control-translation (clojure.core/get-in letvar63089 ["AccessControlTranslation" :content]))) (letvar63089 "EncryptionConfiguration") (clojure.core/assoc :encryption-configuration (deser-encryption-configuration (clojure.core/get-in letvar63089 ["EncryptionConfiguration" :content]))))))

(clojure.core/defn- deser-max-parts [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-expiration-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-bytes-returned [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-object-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object (:content coll)))) input))

(clojure.core/defn- deser-metadata-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-filter-rule-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-filter-rule-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-filter-rule (:content coll)))) input))

(clojure.core/defn- deser-analytics-s-3-bucket-destination [input] (clojure.core/let [letvar63243 {"Format" (portkey.aws/search-for-tag input "Format" :flattened? false :xmlAttribute? nil), "BucketAccountId" (portkey.aws/search-for-tag input "BucketAccountId" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:format (deser-analytics-s-3-export-file-format (clojure.core/get-in letvar63243 ["Format" :content])), :bucket (deser-bucket-name (clojure.core/get-in letvar63243 ["Bucket" :content]))} (letvar63243 "BucketAccountId") (clojure.core/assoc :bucket-account-id (deser-account-id (clojure.core/get-in letvar63243 ["BucketAccountId" :content]))) (letvar63243 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar63243 ["Prefix" :content]))))))

(clojure.core/defn- deser-inventory-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-inventory-configuration (:content coll)))) input))

(clojure.core/defn- deser-next-part-number-marker [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-noncurrent-version-transition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-noncurrent-version-transition (:content coll)))) input))

(clojure.core/defn- deser-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event (:content coll)))) input))

(clojure.core/defn- deser-server-side-encryption [input] (clojure.core/get {"AES256" :aes-256, "aws:kms" :awskms} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-event [input] (clojure.core/get {"s3:ObjectCreated:*" :s-3-object-created, "s3:ObjectRemoved:Delete" :s-3-object-removed-delete, "s3:ObjectRemoved:*" :s-3-object-removed, "s3:ObjectRemoved:DeleteMarkerCreated" :s-3-object-removed-delete-marker-created, "s3:ObjectCreated:Copy" :s-3-object-created-copy, "s3:ObjectCreated:Post" :s-3-object-created-post, "s3:ObjectCreated:CompleteMultipartUpload" :s-3-object-created-complete-multipart-upload, "s3:ReducedRedundancyLostObject" :s-3-reduced-redundancy-lost-object, "s3:ObjectCreated:Put" :s-3-object-created-put} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-end-event [input] (clojure.core/let [letvar63402 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-content-disposition [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-error-document [input] (clojure.core/let [letvar63503 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-object-key (clojure.core/get-in letvar63503 ["Key" :content]))})))

(clojure.core/defn- deser-redirect [input] (clojure.core/let [letvar63599 {"HostName" (portkey.aws/search-for-tag input "HostName" :flattened? false :xmlAttribute? nil), "HttpRedirectCode" (portkey.aws/search-for-tag input "HttpRedirectCode" :flattened? false :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? false :xmlAttribute? nil), "ReplaceKeyPrefixWith" (portkey.aws/search-for-tag input "ReplaceKeyPrefixWith" :flattened? false :xmlAttribute? nil), "ReplaceKeyWith" (portkey.aws/search-for-tag input "ReplaceKeyWith" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar63599 "HostName") (clojure.core/assoc :host-name (deser-host-name (clojure.core/get-in letvar63599 ["HostName" :content]))) (letvar63599 "HttpRedirectCode") (clojure.core/assoc :http-redirect-code (deser-http-redirect-code (clojure.core/get-in letvar63599 ["HttpRedirectCode" :content]))) (letvar63599 "Protocol") (clojure.core/assoc :protocol (deser-protocol (clojure.core/get-in letvar63599 ["Protocol" :content]))) (letvar63599 "ReplaceKeyPrefixWith") (clojure.core/assoc :replace-key-prefix-with (deser-replace-key-prefix-with (clojure.core/get-in letvar63599 ["ReplaceKeyPrefixWith" :content]))) (letvar63599 "ReplaceKeyWith") (clojure.core/assoc :replace-key-with (deser-replace-key-with (clojure.core/get-in letvar63599 ["ReplaceKeyWith" :content]))))))

(clojure.core/defn- deser-progress [input] (clojure.core/let [letvar63695 {"BytesScanned" (portkey.aws/search-for-tag input "BytesScanned" :flattened? false :xmlAttribute? nil), "BytesProcessed" (portkey.aws/search-for-tag input "BytesProcessed" :flattened? false :xmlAttribute? nil), "BytesReturned" (portkey.aws/search-for-tag input "BytesReturned" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar63695 "BytesScanned") (clojure.core/assoc :bytes-scanned (deser-bytes-scanned (clojure.core/get-in letvar63695 ["BytesScanned" :content]))) (letvar63695 "BytesProcessed") (clojure.core/assoc :bytes-processed (deser-bytes-processed (clojure.core/get-in letvar63695 ["BytesProcessed" :content]))) (letvar63695 "BytesReturned") (clojure.core/assoc :bytes-returned (deser-bytes-returned (clojure.core/get-in letvar63695 ["BytesReturned" :content]))))))

(clojure.core/defn- deser-next-token [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-priority [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-bucket-logs-permission [input] (clojure.core/get {"FULL_CONTROL" :full-control, "READ" :read, "WRITE" :write} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-analytics-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-http-error-code-returned-equals [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-upload-id-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-part-number [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-logging-enabled [input] (clojure.core/let [letvar63820 {"TargetBucket" (portkey.aws/search-for-tag input "TargetBucket" :flattened? false :xmlAttribute? nil), "TargetGrants" (portkey.aws/search-for-tag input "TargetGrants" :flattened? false :xmlAttribute? nil), "TargetPrefix" (portkey.aws/search-for-tag input "TargetPrefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-bucket (deser-target-bucket (clojure.core/get-in letvar63820 ["TargetBucket" :content])), :target-prefix (deser-target-prefix (clojure.core/get-in letvar63820 ["TargetPrefix" :content]))} (letvar63820 "TargetGrants") (clojure.core/assoc :target-grants (deser-target-grants (clojure.core/get-in letvar63820 ["TargetGrants" :content]))))))

(clojure.core/defn- deser-date [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-inventory-configuration [input] (clojure.core/let [letvar63918 {"Destination" (portkey.aws/search-for-tag input "Destination" :flattened? false :xmlAttribute? nil), "IsEnabled" (portkey.aws/search-for-tag input "IsEnabled" :flattened? false :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "IncludedObjectVersions" (portkey.aws/search-for-tag input "IncludedObjectVersions" :flattened? false :xmlAttribute? nil), "OptionalFields" (portkey.aws/search-for-tag input "OptionalFields" :flattened? false :xmlAttribute? nil), "Schedule" (portkey.aws/search-for-tag input "Schedule" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:destination (deser-inventory-destination (clojure.core/get-in letvar63918 ["Destination" :content])), :is-enabled (deser-is-enabled (clojure.core/get-in letvar63918 ["IsEnabled" :content])), :id (deser-inventory-id (clojure.core/get-in letvar63918 ["Id" :content])), :included-object-versions (deser-inventory-included-object-versions (clojure.core/get-in letvar63918 ["IncludedObjectVersions" :content])), :schedule (deser-inventory-schedule (clojure.core/get-in letvar63918 ["Schedule" :content]))} (letvar63918 "Filter") (clojure.core/assoc :filter (deser-inventory-filter (clojure.core/get-in letvar63918 ["Filter" :content]))) (letvar63918 "OptionalFields") (clojure.core/assoc :optional-fields (deser-inventory-optional-fields (clojure.core/get-in letvar63918 ["OptionalFields" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-method (:content coll)))) input))

(clojure.core/defn- deser-e-tag [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-object-storage-class [input] (clojure.core/get {"STANDARD" :standard, "REDUCED_REDUNDANCY" :reduced-redundancy, "GLACIER" :glacier, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-max-uploads [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-replication-rule-and-operator [input] (clojure.core/let [letvar64043 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar64043 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar64043 ["Prefix" :content]))) (letvar64043 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar64043 ["Tag" :content]))))))

(clojure.core/defn- deser-metrics-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-owner-override [input] (clojure.core/get {"Destination" :destination} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-multipart-upload-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-metadata-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-stats-event [input] (clojure.core/let [letvar64159 {"Details" (portkey.aws/search-for-tag input "Details" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar64159 "Details") (clojure.core/assoc :details (deser-stats (clojure.core/get-in letvar64159 ["Details" :content]))))))

(clojure.core/defn- deser-bucket-versioning-status [input] (clojure.core/get {"Enabled" :enabled, "Suspended" :suspended} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-content-type [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-is-truncated [input] (clojure.core/when-let [boolstr__31777__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__31777__auto__) true (clojure.core/= "false" boolstr__31777__auto__) false)))

(clojure.core/defn- deser-inventory-included-object-versions [input] (clojure.core/get {"All" :all, "Current" :current} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-restore [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tag-count [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-role [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-server-side-encryption-by-default [input] (clojure.core/let [letvar64284 {"SSEAlgorithm" (portkey.aws/search-for-tag input "SSEAlgorithm" :flattened? false :xmlAttribute? nil), "KMSMasterKeyID" (portkey.aws/search-for-tag input "KMSMasterKeyID" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:sse-algorithm (deser-server-side-encryption (clojure.core/get-in letvar64284 ["SSEAlgorithm" :content]))} (letvar64284 "KMSMasterKeyID") (clojure.core/assoc :kms-master-key-id (deser-ssekms-key-id (clojure.core/get-in letvar64284 ["KMSMasterKeyID" :content]))))))

(clojure.core/defn- deser-display-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-records-event [input] (clojure.core/let [letvar64385 {"Payload" (portkey.aws/search-for-tag input "Payload" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar64385 "Payload") (clojure.core/assoc :payload (deser-body (clojure.core/get-in letvar64385 ["Payload" :content]))))))

(clojure.core/defn- deser-cors-rule [input] (clojure.core/let [letvar64481 {"AllowedHeader" (portkey.aws/search-for-tag input "AllowedHeader" :flattened? true :xmlAttribute? nil), "AllowedMethod" (portkey.aws/search-for-tag input "AllowedMethod" :flattened? true :xmlAttribute? nil), "AllowedOrigin" (portkey.aws/search-for-tag input "AllowedOrigin" :flattened? true :xmlAttribute? nil), "ExposeHeader" (portkey.aws/search-for-tag input "ExposeHeader" :flattened? true :xmlAttribute? nil), "MaxAgeSeconds" (portkey.aws/search-for-tag input "MaxAgeSeconds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:allowed-methods (deser-allowed-methods (clojure.core/get-in letvar64481 ["AllowedMethod"])), :allowed-origins (deser-allowed-origins (clojure.core/get-in letvar64481 ["AllowedOrigin"]))} (letvar64481 "AllowedHeader") (clojure.core/assoc :allowed-headers (deser-allowed-headers (clojure.core/get-in letvar64481 ["AllowedHeader"]))) (letvar64481 "ExposeHeader") (clojure.core/assoc :expose-headers (deser-expose-headers (clojure.core/get-in letvar64481 ["ExposeHeader"]))) (letvar64481 "MaxAgeSeconds") (clojure.core/assoc :max-age-seconds (deser-max-age-seconds (clojure.core/get-in letvar64481 ["MaxAgeSeconds" :content]))))))

(clojure.core/defn- deser-grant [input] (clojure.core/let [letvar64577 {"Grantee" (portkey.aws/search-for-tag input "Grantee" :flattened? false :xmlAttribute? nil), "Permission" (portkey.aws/search-for-tag input "Permission" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar64577 "Grantee") (clojure.core/assoc :grantee (deser-grantee (clojure.core/get-in letvar64577 ["Grantee" :content]))) (letvar64577 "Permission") (clojure.core/assoc :permission (deser-permission (clojure.core/get-in letvar64577 ["Permission" :content]))))))

(clojure.core/defn- deser-initiated [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-content-length [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-topic-configuration [input] (clojure.core/let [letvar64677 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Topic" (portkey.aws/search-for-tag input "Topic" :flattened? false :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:topic-arn (deser-topic-arn (clojure.core/get-in letvar64677 ["Topic" :content])), :events (deser-event-list (clojure.core/get-in letvar64677 ["Event"]))} (letvar64677 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar64677 ["Id" :content]))) (letvar64677 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar64677 ["Filter" :content]))))))

(clojure.core/defn- deser-is-enabled [input] (clojure.core/when-let [boolstr__31777__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__31777__auto__) true (clojure.core/= "false" boolstr__31777__auto__) false)))

(clojure.core/defn- deser-progress-event [input] (clojure.core/let [letvar64775 {"Details" (portkey.aws/search-for-tag input "Details" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar64775 "Details") (clojure.core/assoc :details (deser-progress (clojure.core/get-in letvar64775 ["Details" :content]))))))

(clojure.core/defn- deser-inventory-s-3-bucket-destination [input] (clojure.core/let [letvar64871 {"AccountId" (portkey.aws/search-for-tag input "AccountId" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Format" (portkey.aws/search-for-tag input "Format" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Encryption" (portkey.aws/search-for-tag input "Encryption" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:bucket (deser-bucket-name (clojure.core/get-in letvar64871 ["Bucket" :content])), :format (deser-inventory-format (clojure.core/get-in letvar64871 ["Format" :content]))} (letvar64871 "AccountId") (clojure.core/assoc :account-id (deser-account-id (clojure.core/get-in letvar64871 ["AccountId" :content]))) (letvar64871 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar64871 ["Prefix" :content]))) (letvar64871 "Encryption") (clojure.core/assoc :encryption (deser-inventory-encryption (clojure.core/get-in letvar64871 ["Encryption" :content]))))))

(clojure.core/defn- deser-copy-object-result [input] (clojure.core/let [letvar64967 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? false :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar64967 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar64967 ["ETag" :content]))) (letvar64967 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar64967 ["LastModified" :content]))))))

(clojure.core/defn- deser-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-inventory-frequency [input] (clojure.core/get {"Daily" :daily, "Weekly" :weekly} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-expose-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-expose-header (:content coll)))) input))

(clojure.core/defn- deser-transition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transition (:content coll)))) input))

(clojure.core/defn- deser-analytics-filter [input] (clojure.core/let [letvar65112 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? false :xmlAttribute? nil), "And" (portkey.aws/search-for-tag input "And" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar65112 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar65112 ["Prefix" :content]))) (letvar65112 "Tag") (clojure.core/assoc :tag (deser-tag (clojure.core/get-in letvar65112 ["Tag" :content]))) (letvar65112 "And") (clojure.core/assoc :and (deser-analytics-and-operator (clojure.core/get-in letvar65112 ["And" :content]))))))

(clojure.core/defn- deser-analytics-s-3-export-file-format [input] (clojure.core/get {"CSV" :csv} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-version-id-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-object-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-allowed-method [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-bucket-accelerate-status [input] (clojure.core/get {"Enabled" :enabled, "Suspended" :suspended} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-lambda-function-arn [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-protocol [input] (clojure.core/get {"http" :http, "https" :https} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-message [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-replication-rule [input] (clojure.core/let [letvar65248 {"ID" (portkey.aws/search-for-tag input "ID" :flattened? false :xmlAttribute? nil), "Priority" (portkey.aws/search-for-tag input "Priority" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "SourceSelectionCriteria" (portkey.aws/search-for-tag input "SourceSelectionCriteria" :flattened? false :xmlAttribute? nil), "Destination" (portkey.aws/search-for-tag input "Destination" :flattened? false :xmlAttribute? nil), "DeleteMarkerReplication" (portkey.aws/search-for-tag input "DeleteMarkerReplication" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-replication-rule-status (clojure.core/get-in letvar65248 ["Status" :content])), :destination (deser-destination (clojure.core/get-in letvar65248 ["Destination" :content]))} (letvar65248 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar65248 ["ID" :content]))) (letvar65248 "Priority") (clojure.core/assoc :priority (deser-priority (clojure.core/get-in letvar65248 ["Priority" :content]))) (letvar65248 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar65248 ["Prefix" :content]))) (letvar65248 "Filter") (clojure.core/assoc :filter (deser-replication-rule-filter (clojure.core/get-in letvar65248 ["Filter" :content]))) (letvar65248 "SourceSelectionCriteria") (clojure.core/assoc :source-selection-criteria (deser-source-selection-criteria (clojure.core/get-in letvar65248 ["SourceSelectionCriteria" :content]))) (letvar65248 "DeleteMarkerReplication") (clojure.core/assoc :delete-marker-replication (deser-delete-marker-replication (clojure.core/get-in letvar65248 ["DeleteMarkerReplication" :content]))))))

(clojure.core/defn- deser-redirect-all-requests-to [input] (clojure.core/let [letvar65344 {"HostName" (portkey.aws/search-for-tag input "HostName" :flattened? false :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:host-name (deser-host-name (clojure.core/get-in letvar65344 ["HostName" :content]))} (letvar65344 "Protocol") (clojure.core/assoc :protocol (deser-protocol (clojure.core/get-in letvar65344 ["Protocol" :content]))))))

(clojure.core/defn- deser-target-grants [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-grant coll))) input))

(clojure.core/defn- deser-buckets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bucket coll))) input))

(clojure.core/defn- deser-last-modified [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-filter-rule [input] (clojure.core/let [letvar65476 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar65476 "Name") (clojure.core/assoc :name (deser-filter-rule-name (clojure.core/get-in letvar65476 ["Name" :content]))) (letvar65476 "Value") (clojure.core/assoc :value (deser-filter-rule-value (clojure.core/get-in letvar65476 ["Value" :content]))))))

(clojure.core/defn- deser-replication-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-replication-rule (:content coll)))) input))

(clojure.core/defn- deser-s-3-key-filter [input] (clojure.core/let [letvar65589 {"FilterRule" (portkey.aws/search-for-tag input "FilterRule" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar65589 "FilterRule") (clojure.core/assoc :filter-rules (deser-filter-rule-list (clojure.core/get-in letvar65589 ["FilterRule"]))))))

(clojure.core/defn- deser-parts-count [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-abort-rule-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-target-bucket [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-replace-key-with [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-size [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-part [input] (clojure.core/let [letvar65704 {"PartNumber" (portkey.aws/search-for-tag input "PartNumber" :flattened? false :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? false :xmlAttribute? nil), "ETag" (portkey.aws/search-for-tag input "ETag" :flattened? false :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar65704 "PartNumber") (clojure.core/assoc :part-number (deser-part-number (clojure.core/get-in letvar65704 ["PartNumber" :content]))) (letvar65704 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar65704 ["LastModified" :content]))) (letvar65704 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar65704 ["ETag" :content]))) (letvar65704 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar65704 ["Size" :content]))))))

(clojure.core/defn- deser-part-number-marker [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-account-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-notification-configuration-filter [input] (clojure.core/let [letvar65807 {"S3Key" (portkey.aws/search-for-tag input "S3Key" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar65807 "S3Key") (clojure.core/assoc :key (deser-s-3-key-filter (clojure.core/get-in letvar65807 ["S3Key" :content]))))))

(clojure.core/defn- deser-topic-arn [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-suffix [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-lifecycle-rule-and-operator [input] (clojure.core/let [letvar65913 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Tag" (portkey.aws/search-for-tag input "Tag" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar65913 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar65913 ["Prefix" :content]))) (letvar65913 "Tag") (clojure.core/assoc :tags (deser-tag-set (clojure.core/get-in letvar65913 ["Tag" :content]))))))

(clojure.core/defn- deser-allowed-header [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-rule [input] (clojure.core/let [letvar66014 {"Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? false :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Transition" (portkey.aws/search-for-tag input "Transition" :flattened? false :xmlAttribute? nil), "NoncurrentVersionTransition" (portkey.aws/search-for-tag input "NoncurrentVersionTransition" :flattened? false :xmlAttribute? nil), "NoncurrentVersionExpiration" (portkey.aws/search-for-tag input "NoncurrentVersionExpiration" :flattened? false :xmlAttribute? nil), "AbortIncompleteMultipartUpload" (portkey.aws/search-for-tag input "AbortIncompleteMultipartUpload" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:prefix (deser-prefix (clojure.core/get-in letvar66014 ["Prefix" :content])), :status (deser-expiration-status (clojure.core/get-in letvar66014 ["Status" :content]))} (letvar66014 "Expiration") (clojure.core/assoc :expiration (deser-lifecycle-expiration (clojure.core/get-in letvar66014 ["Expiration" :content]))) (letvar66014 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar66014 ["ID" :content]))) (letvar66014 "Transition") (clojure.core/assoc :transition (deser-transition (clojure.core/get-in letvar66014 ["Transition" :content]))) (letvar66014 "NoncurrentVersionTransition") (clojure.core/assoc :noncurrent-version-transition (deser-noncurrent-version-transition (clojure.core/get-in letvar66014 ["NoncurrentVersionTransition" :content]))) (letvar66014 "NoncurrentVersionExpiration") (clojure.core/assoc :noncurrent-version-expiration (deser-noncurrent-version-expiration (clojure.core/get-in letvar66014 ["NoncurrentVersionExpiration" :content]))) (letvar66014 "AbortIncompleteMultipartUpload") (clojure.core/assoc :abort-incomplete-multipart-upload (deser-abort-incomplete-multipart-upload (clojure.core/get-in letvar66014 ["AbortIncompleteMultipartUpload" :content]))))))

(clojure.core/defn- deser-routing-rule [input] (clojure.core/let [letvar66110 {"Condition" (portkey.aws/search-for-tag input "Condition" :flattened? false :xmlAttribute? nil), "Redirect" (portkey.aws/search-for-tag input "Redirect" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:redirect (deser-redirect (clojure.core/get-in letvar66110 ["Redirect" :content]))} (letvar66110 "Condition") (clojure.core/assoc :condition (deser-condition (clojure.core/get-in letvar66110 ["Condition" :content]))))))

(clojure.core/defn- deser-noncurrent-version-expiration [input] (clojure.core/let [letvar66206 {"NoncurrentDays" (portkey.aws/search-for-tag input "NoncurrentDays" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar66206 "NoncurrentDays") (clojure.core/assoc :noncurrent-days (deser-days (clojure.core/get-in letvar66206 ["NoncurrentDays" :content]))))))

(clojure.core/defn- deser-delete-marker-replication [input] (clojure.core/let [letvar66302 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar66302 "Status") (clojure.core/assoc :status (deser-delete-marker-replication-status (clojure.core/get-in letvar66302 ["Status" :content]))))))

(clojure.core/defn- deser-next-version-id-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-ssekms [input] (clojure.core/let [letvar66403 {"KeyId" (portkey.aws/search-for-tag input "KeyId" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key-id (deser-ssekms-key-id (clojure.core/get-in letvar66403 ["KeyId" :content]))})))

(clojure.core/defn- deser-deleted-object [input] (clojure.core/let [letvar66499 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? false :xmlAttribute? nil), "DeleteMarker" (portkey.aws/search-for-tag input "DeleteMarker" :flattened? false :xmlAttribute? nil), "DeleteMarkerVersionId" (portkey.aws/search-for-tag input "DeleteMarkerVersionId" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar66499 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar66499 ["Key" :content]))) (letvar66499 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar66499 ["VersionId" :content]))) (letvar66499 "DeleteMarker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar66499 ["DeleteMarker" :content]))) (letvar66499 "DeleteMarkerVersionId") (clojure.core/assoc :delete-marker-version-id (deser-delete-marker-version-id (clojure.core/get-in letvar66499 ["DeleteMarkerVersionId" :content]))))))

(clojure.core/defn- deser-abort-incomplete-multipart-upload [input] (clojure.core/let [letvar66595 {"DaysAfterInitiation" (portkey.aws/search-for-tag input "DaysAfterInitiation" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar66595 "DaysAfterInitiation") (clojure.core/assoc :days-after-initiation (deser-days-after-initiation (clojure.core/get-in letvar66595 ["DaysAfterInitiation" :content]))))))

(clojure.core/defn- deser-http-redirect-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-uri [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-inventory-optional-fields [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-inventory-optional-field coll))) input))

(clojure.core/defn- deser-owner [input] (clojure.core/let [letvar66718 {"DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? false :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar66718 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar66718 ["DisplayName" :content]))) (letvar66718 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar66718 ["ID" :content]))))))

(clojure.core/defn- deser-replication-rule-status [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-next-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-days [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-storage-class-analysis-data-export [input] (clojure.core/let [letvar66826 {"OutputSchemaVersion" (portkey.aws/search-for-tag input "OutputSchemaVersion" :flattened? false :xmlAttribute? nil), "Destination" (portkey.aws/search-for-tag input "Destination" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:output-schema-version (deser-storage-class-analysis-schema-version (clojure.core/get-in letvar66826 ["OutputSchemaVersion" :content])), :destination (deser-analytics-export-destination (clojure.core/get-in letvar66826 ["Destination" :content]))})))

(clojure.core/defn- deser-creation-date [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-bytes-scanned [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-bytes-processed [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-stats [input] (clojure.core/let [letvar66928 {"BytesScanned" (portkey.aws/search-for-tag input "BytesScanned" :flattened? false :xmlAttribute? nil), "BytesProcessed" (portkey.aws/search-for-tag input "BytesProcessed" :flattened? false :xmlAttribute? nil), "BytesReturned" (portkey.aws/search-for-tag input "BytesReturned" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar66928 "BytesScanned") (clojure.core/assoc :bytes-scanned (deser-bytes-scanned (clojure.core/get-in letvar66928 ["BytesScanned" :content]))) (letvar66928 "BytesProcessed") (clojure.core/assoc :bytes-processed (deser-bytes-processed (clojure.core/get-in letvar66928 ["BytesProcessed" :content]))) (letvar66928 "BytesReturned") (clojure.core/assoc :bytes-returned (deser-bytes-returned (clojure.core/get-in letvar66928 ["BytesReturned" :content]))))))

(clojure.core/defn- deser-cors-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cors-rule (:content coll)))) input))

(clojure.core/defn- deser-metadata [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-metadata-key k) (deser-metadata-value v)])) input))

(clojure.core/defn- deser-cache-control [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-content-language [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-object-version-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object-version (:content coll)))) input))

(clojure.core/defn- deser-policy [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-delimiter [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar67101 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-object-key (clojure.core/get-in letvar67101 ["Key" :content])), :value (deser-value (clojure.core/get-in letvar67101 ["Value" :content]))})))

(clojure.core/defn- deser-condition [input] (clojure.core/let [letvar67197 {"HttpErrorCodeReturnedEquals" (portkey.aws/search-for-tag input "HttpErrorCodeReturnedEquals" :flattened? false :xmlAttribute? nil), "KeyPrefixEquals" (portkey.aws/search-for-tag input "KeyPrefixEquals" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar67197 "HttpErrorCodeReturnedEquals") (clojure.core/assoc :http-error-code-returned-equals (deser-http-error-code-returned-equals (clojure.core/get-in letvar67197 ["HttpErrorCodeReturnedEquals" :content]))) (letvar67197 "KeyPrefixEquals") (clojure.core/assoc :key-prefix-equals (deser-key-prefix-equals (clojure.core/get-in letvar67197 ["KeyPrefixEquals" :content]))))))

(clojure.core/defn- deser-error [input] (clojure.core/let [letvar67293 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? false :xmlAttribute? nil), "Code" (portkey.aws/search-for-tag input "Code" :flattened? false :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar67293 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar67293 ["Key" :content]))) (letvar67293 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar67293 ["VersionId" :content]))) (letvar67293 "Code") (clojure.core/assoc :code (deser-code (clojure.core/get-in letvar67293 ["Code" :content]))) (letvar67293 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar67293 ["Message" :content]))))))

(clojure.core/defn- deser-queue-arn [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-object-version [input] (clojure.core/let [letvar67394 {"ETag" (portkey.aws/search-for-tag input "ETag" :flattened? false :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? false :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? false :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? false :xmlAttribute? nil), "IsLatest" (portkey.aws/search-for-tag input "IsLatest" :flattened? false :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? false :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar67394 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar67394 ["ETag" :content]))) (letvar67394 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar67394 ["Size" :content]))) (letvar67394 "StorageClass") (clojure.core/assoc :storage-class (deser-object-version-storage-class (clojure.core/get-in letvar67394 ["StorageClass" :content]))) (letvar67394 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar67394 ["Key" :content]))) (letvar67394 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar67394 ["VersionId" :content]))) (letvar67394 "IsLatest") (clojure.core/assoc :is-latest (deser-is-latest (clojure.core/get-in letvar67394 ["IsLatest" :content]))) (letvar67394 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar67394 ["LastModified" :content]))) (letvar67394 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar67394 ["Owner" :content]))))))

(clojure.core/defn- deser-target-prefix [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-object-version-storage-class [input] (clojure.core/get {"STANDARD" :standard} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-delete-marker-entry [input] (clojure.core/let [letvar67500 {"Owner" (portkey.aws/search-for-tag input "Owner" :flattened? false :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? false :xmlAttribute? nil), "IsLatest" (portkey.aws/search-for-tag input "IsLatest" :flattened? false :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar67500 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar67500 ["Owner" :content]))) (letvar67500 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar67500 ["Key" :content]))) (letvar67500 "VersionId") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar67500 ["VersionId" :content]))) (letvar67500 "IsLatest") (clojure.core/assoc :is-latest (deser-is-latest (clojure.core/get-in letvar67500 ["IsLatest" :content]))) (letvar67500 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar67500 ["LastModified" :content]))))))

(clojure.core/defn- deser-server-side-encryption-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-side-encryption-rule (:content coll)))) input))

(clojure.core/defn- deser-queue-configuration [input] (clojure.core/let [letvar67613 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Queue" (portkey.aws/search-for-tag input "Queue" :flattened? false :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:queue-arn (deser-queue-arn (clojure.core/get-in letvar67613 ["Queue" :content])), :events (deser-event-list (clojure.core/get-in letvar67613 ["Event"]))} (letvar67613 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar67613 ["Id" :content]))) (letvar67613 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar67613 ["Filter" :content]))))))

(clojure.core/defn- deser-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-host-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-restore-output-path [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-storage-class [input] (clojure.core/get {"STANDARD" :standard, "REDUCED_REDUNDANCY" :reduced-redundancy, "STANDARD_IA" :standard-ia, "ONEZONE_IA" :onezone-ia} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-server-side-encryption-rule [input] (clojure.core/let [letvar67729 {"ApplyServerSideEncryptionByDefault" (portkey.aws/search-for-tag input "ApplyServerSideEncryptionByDefault" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar67729 "ApplyServerSideEncryptionByDefault") (clojure.core/assoc :apply-server-side-encryption-by-default (deser-server-side-encryption-by-default (clojure.core/get-in letvar67729 ["ApplyServerSideEncryptionByDefault" :content]))))))

(clojure.core/defn- deser-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule (:content coll)))) input))

(clojure.core/defn- deser-lifecycle-expiration [input] (clojure.core/let [letvar67842 {"Date" (portkey.aws/search-for-tag input "Date" :flattened? false :xmlAttribute? nil), "Days" (portkey.aws/search-for-tag input "Days" :flattened? false :xmlAttribute? nil), "ExpiredObjectDeleteMarker" (portkey.aws/search-for-tag input "ExpiredObjectDeleteMarker" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar67842 "Date") (clojure.core/assoc :date (deser-date (clojure.core/get-in letvar67842 ["Date" :content]))) (letvar67842 "Days") (clojure.core/assoc :days (deser-days (clojure.core/get-in letvar67842 ["Days" :content]))) (letvar67842 "ExpiredObjectDeleteMarker") (clojure.core/assoc :expired-object-delete-marker (deser-expired-object-delete-marker (clojure.core/get-in letvar67842 ["ExpiredObjectDeleteMarker" :content]))))))

(clojure.core/defn- deser-analytics-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-analytics-configuration (:content coll)))) input))

(clojure.core/defn- deser-inventory-format [input] (clojure.core/get {"CSV" :csv, "ORC" :orc} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-queue-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-queue-configuration (:content coll)))) input))

(clojure.core/defn- deser-grantee [input] (clojure.core/let [letvar67977 {"DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? false :xmlAttribute? nil), "EmailAddress" (portkey.aws/search-for-tag input "EmailAddress" :flattened? false :xmlAttribute? nil), "ID" (portkey.aws/search-for-tag input "ID" :flattened? false :xmlAttribute? nil), "xsi:type" (portkey.aws/search-for-tag input "xsi:type" :flattened? false :xmlAttribute? true), "URI" (portkey.aws/search-for-tag input "URI" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-type (clojure.core/get-in letvar67977 ["xsi:type"]))} (letvar67977 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar67977 ["DisplayName" :content]))) (letvar67977 "EmailAddress") (clojure.core/assoc :email-address (deser-email-address (clojure.core/get-in letvar67977 ["EmailAddress" :content]))) (letvar67977 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar67977 ["ID" :content]))) (letvar67977 "URI") (clojure.core/assoc :uri (deser-uri (clojure.core/get-in letvar67977 ["URI" :content]))))))

(clojure.core/defn- deser-key-prefix-equals [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-allowed-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-header (:content coll)))) input))

(clojure.core/defn- deser-delete-marker [input] (clojure.core/when-let [boolstr__31777__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__31777__auto__) true (clojure.core/= "false" boolstr__31777__auto__) false)))

(clojure.core/defn- deser-allowed-origins [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-origin (:content coll)))) input))

(clojure.core/defn- deser-bucket-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-queue-configuration-deprecated [input] (clojure.core/let [letvar68119 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Queue" (portkey.aws/search-for-tag input "Queue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar68119 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar68119 ["Id" :content]))) (letvar68119 "Event") (clojure.core/assoc :event (deser-event (clojure.core/get-in letvar68119 ["Event" :content]))) (letvar68119 "Event") (clojure.core/assoc :events (deser-event-list (clojure.core/get-in letvar68119 ["Event"]))) (letvar68119 "Queue") (clojure.core/assoc :queue (deser-queue-arn (clojure.core/get-in letvar68119 ["Queue" :content]))))))

(clojure.core/defn- deser-request-charged [input] (clojure.core/get {"requester" :requester} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-expires [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-max-keys [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-lifecycle-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-rule (:content coll)))) input))

(clojure.core/defn- deser-initiator [input] (clojure.core/let [letvar68241 {"ID" (portkey.aws/search-for-tag input "ID" :flattened? false :xmlAttribute? nil), "DisplayName" (portkey.aws/search-for-tag input "DisplayName" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar68241 "ID") (clojure.core/assoc :id (deser-id (clojure.core/get-in letvar68241 ["ID" :content]))) (letvar68241 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar68241 ["DisplayName" :content]))))))

(clojure.core/defn- deser-sses-3 [input] (clojure.core/let [letvar68337 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-max-age-seconds [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-email-address [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-bucket-location-constraint [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-southeast-2" :apsoutheast-2, "EU" :eu, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "eu-central-1" :eucentral-1, "us-west-2" :uswest-2, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-ssekms-key-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-allowed-origin [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-token [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-lambda-function-configuration [input] (clojure.core/let [letvar68460 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CloudFunction" (portkey.aws/search-for-tag input "CloudFunction" :flattened? false :xmlAttribute? nil), "Event" (portkey.aws/search-for-tag input "Event" :flattened? true :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:lambda-function-arn (deser-lambda-function-arn (clojure.core/get-in letvar68460 ["CloudFunction" :content])), :events (deser-event-list (clojure.core/get-in letvar68460 ["Event"]))} (letvar68460 "Id") (clojure.core/assoc :id (deser-notification-id (clojure.core/get-in letvar68460 ["Id" :content]))) (letvar68460 "Filter") (clojure.core/assoc :filter (deser-notification-configuration-filter (clojure.core/get-in letvar68460 ["Filter" :content]))))))

(clojure.core/defn- deser-delete-marker-version-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-is-latest [input] (clojure.core/when-let [boolstr__31777__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__31777__auto__) true (clojure.core/= "false" boolstr__31777__auto__) false)))

(clojure.core/defn- deser-noncurrent-version-transition [input] (clojure.core/let [letvar68563 {"NoncurrentDays" (portkey.aws/search-for-tag input "NoncurrentDays" :flattened? false :xmlAttribute? nil), "StorageClass" (portkey.aws/search-for-tag input "StorageClass" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar68563 "NoncurrentDays") (clojure.core/assoc :noncurrent-days (deser-days (clojure.core/get-in letvar68563 ["NoncurrentDays" :content]))) (letvar68563 "StorageClass") (clojure.core/assoc :storage-class (deser-transition-storage-class (clojure.core/get-in letvar68563 ["StorageClass" :content]))))))

(clojure.core/defn- deser-index-document [input] (clojure.core/let [letvar68659 {"Suffix" (portkey.aws/search-for-tag input "Suffix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:suffix (deser-suffix (clojure.core/get-in letvar68659 ["Suffix" :content]))})))

(clojure.core/defn- deser-key-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-common-prefix [input] (clojure.core/let [letvar68760 {"Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar68760 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar68760 ["Prefix" :content]))))))

(clojure.core/defn- deser-next-upload-id-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-analytics-configuration [input] (clojure.core/let [letvar68861 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Filter" (portkey.aws/search-for-tag input "Filter" :flattened? false :xmlAttribute? nil), "StorageClassAnalysis" (portkey.aws/search-for-tag input "StorageClassAnalysis" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-analytics-id (clojure.core/get-in letvar68861 ["Id" :content])), :storage-class-analysis (deser-storage-class-analysis (clojure.core/get-in letvar68861 ["StorageClassAnalysis" :content]))} (letvar68861 "Filter") (clojure.core/assoc :filter (deser-analytics-filter (clojure.core/get-in letvar68861 ["Filter" :content]))))))

(clojure.core/defn- deser-expiration [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-cloud-function [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-delete-markers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-delete-marker-entry (:content coll)))) input))

(clojure.core/defn- deser-sse-kms-encrypted-objects [input] (clojure.core/let [letvar68984 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:status (deser-sse-kms-encrypted-objects-status (clojure.core/get-in letvar68984 ["Status" :content]))})))

(clojure.core/defn- deser-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error (:content coll)))) input))

(clojure.core/defn- response-put-object-tagging-output [input] (clojure.core/let [rawinput69002 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69003 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"])}] (clojure.core/cond-> {} (letvar69003 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69003 ["x-amz-version-id"]))))))

(clojure.core/defn- response-get-object-tagging-output [input] (clojure.core/let [rawinput69004 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69005 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "TagSet" (portkey.aws/search-for-tag rawinput69004 "TagSet" :flattened? false)}] (clojure.core/cond-> {:tag-set (deser-tag-set (clojure.core/get-in letvar69005 ["TagSet" :content]))} (letvar69005 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69005 ["x-amz-version-id"]))))))

(clojure.core/defn- response-list-object-versions-output [input] (clojure.core/let [rawinput69006 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69007 {"Prefix" (portkey.aws/search-for-tag rawinput69006 "Prefix" :flattened? false), "EncodingType" (portkey.aws/search-for-tag rawinput69006 "EncodingType" :flattened? false), "NextKeyMarker" (portkey.aws/search-for-tag rawinput69006 "NextKeyMarker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput69006 "IsTruncated" :flattened? false), "CommonPrefixes" (portkey.aws/search-for-tag rawinput69006 "CommonPrefixes" :flattened? true), "VersionIdMarker" (portkey.aws/search-for-tag rawinput69006 "VersionIdMarker" :flattened? false), "NextVersionIdMarker" (portkey.aws/search-for-tag rawinput69006 "NextVersionIdMarker" :flattened? false), "Delimiter" (portkey.aws/search-for-tag rawinput69006 "Delimiter" :flattened? false), "Version" (portkey.aws/search-for-tag rawinput69006 "Version" :flattened? true), "Name" (portkey.aws/search-for-tag rawinput69006 "Name" :flattened? false), "DeleteMarker" (portkey.aws/search-for-tag rawinput69006 "DeleteMarker" :flattened? true), "MaxKeys" (portkey.aws/search-for-tag rawinput69006 "MaxKeys" :flattened? false), "KeyMarker" (portkey.aws/search-for-tag rawinput69006 "KeyMarker" :flattened? false)}] (clojure.core/cond-> {} (letvar69007 "Version") (clojure.core/assoc :versions (deser-object-version-list (clojure.core/get-in letvar69007 ["Version"]))) (letvar69007 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar69007 ["Prefix" :content]))) (letvar69007 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar69007 ["EncodingType" :content]))) (letvar69007 "NextKeyMarker") (clojure.core/assoc :next-key-marker (deser-next-key-marker (clojure.core/get-in letvar69007 ["NextKeyMarker" :content]))) (letvar69007 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar69007 ["IsTruncated" :content]))) (letvar69007 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar69007 ["CommonPrefixes"]))) (letvar69007 "VersionIdMarker") (clojure.core/assoc :version-id-marker (deser-version-id-marker (clojure.core/get-in letvar69007 ["VersionIdMarker" :content]))) (letvar69007 "NextVersionIdMarker") (clojure.core/assoc :next-version-id-marker (deser-next-version-id-marker (clojure.core/get-in letvar69007 ["NextVersionIdMarker" :content]))) (letvar69007 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar69007 ["Delimiter" :content]))) (letvar69007 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar69007 ["Name" :content]))) (letvar69007 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar69007 ["MaxKeys" :content]))) (letvar69007 "KeyMarker") (clojure.core/assoc :key-marker (deser-key-marker (clojure.core/get-in letvar69007 ["KeyMarker" :content]))) (letvar69007 "DeleteMarker") (clojure.core/assoc :delete-markers (deser-delete-markers (clojure.core/get-in letvar69007 ["DeleteMarker"]))))))

(clojure.core/defn- response-bucket-already-owned-by-you [input] (clojure.core/let [rawinput69008 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69009 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-object-torrent-output [input] (clojure.core/let [rawinput69010 (:body input) letvar69011 {"Body" rawinput69010, "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69011 "Body") (clojure.core/assoc :body (deser-body (clojure.core/get-in letvar69011 ["Body"]))) (letvar69011 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69011 ["x-amz-request-charged"]))))))

(clojure.core/defn- response-get-bucket-analytics-configuration-output [input] (clojure.core/let [rawinput69012 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69013 {"AnalyticsConfiguration" (portkey.aws/search-for-tag rawinput69012 "AnalyticsConfiguration" :flattened? false)}] (clojure.core/cond-> {} (letvar69013 "AnalyticsConfiguration") (clojure.core/assoc :analytics-configuration (deser-analytics-configuration (clojure.core/get-in letvar69013 ["AnalyticsConfiguration" :content]))))))

(clojure.core/defn- response-get-bucket-encryption-output [input] (clojure.core/let [rawinput69014 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69015 {"ServerSideEncryptionConfiguration" (portkey.aws/search-for-tag rawinput69014 "ServerSideEncryptionConfiguration" :flattened? false)}] (clojure.core/cond-> {} (letvar69015 "ServerSideEncryptionConfiguration") (clojure.core/assoc :server-side-encryption-configuration (deser-server-side-encryption-configuration (clojure.core/get-in letvar69015 ["ServerSideEncryptionConfiguration" :content]))))))

(clojure.core/defn- response-get-bucket-lifecycle-output [input] (clojure.core/let [rawinput69016 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69017 {"Rule" (portkey.aws/search-for-tag rawinput69016 "Rule" :flattened? true)}] (clojure.core/cond-> {} (letvar69017 "Rule") (clojure.core/assoc :rules (deser-rules (clojure.core/get-in letvar69017 ["Rule"]))))))

(clojure.core/defn- response-get-bucket-logging-output [input] (clojure.core/let [rawinput69018 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69019 {"LoggingEnabled" (portkey.aws/search-for-tag rawinput69018 "LoggingEnabled" :flattened? false)}] (clojure.core/cond-> {} (letvar69019 "LoggingEnabled") (clojure.core/assoc :logging-enabled (deser-logging-enabled (clojure.core/get-in letvar69019 ["LoggingEnabled" :content]))))))

(clojure.core/defn- response-delete-objects-output [input] (clojure.core/let [rawinput69020 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69021 {"Deleted" (portkey.aws/search-for-tag rawinput69020 "Deleted" :flattened? true), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "Error" (portkey.aws/search-for-tag rawinput69020 "Error" :flattened? true)}] (clojure.core/cond-> {} (letvar69021 "Deleted") (clojure.core/assoc :deleted (deser-deleted-objects (clojure.core/get-in letvar69021 ["Deleted"]))) (letvar69021 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69021 ["x-amz-request-charged"]))) (letvar69021 "Error") (clojure.core/assoc :errors (deser-errors (clojure.core/get-in letvar69021 ["Error"]))))))

(clojure.core/defn- response-create-multipart-upload-output [input] (clojure.core/let [rawinput69022 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69023 {"Bucket" (portkey.aws/search-for-tag rawinput69022 "Bucket" :flattened? false), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-abort-date" (clojure.core/get-in input [:headers "x-amz-abort-date"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-abort-rule-id" (clojure.core/get-in input [:headers "x-amz-abort-rule-id"]), "Key" (portkey.aws/search-for-tag rawinput69022 "Key" :flattened? false), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "UploadId" (portkey.aws/search-for-tag rawinput69022 "UploadId" :flattened? false)}] (clojure.core/cond-> {} (letvar69023 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar69023 ["Bucket" :content]))) (letvar69023 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar69023 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar69023 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar69023 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar69023 "x-amz-abort-date") (clojure.core/assoc :abort-date (deser-abort-date (clojure.core/get-in letvar69023 ["x-amz-abort-date"]))) (letvar69023 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar69023 ["x-amz-server-side-encryption"]))) (letvar69023 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar69023 ["Key" :content]))) (letvar69023 "x-amz-abort-rule-id") (clojure.core/assoc :abort-rule-id (deser-abort-rule-id (clojure.core/get-in letvar69023 ["x-amz-abort-rule-id"]))) (letvar69023 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar69023 ["UploadId" :content]))) (letvar69023 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69023 ["x-amz-request-charged"]))) (letvar69023 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar69023 ["x-amz-server-side-encryption-aws-kms-key-id"]))))))

(clojure.core/defn- response-list-multipart-uploads-output [input] (clojure.core/let [rawinput69024 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69025 {"Bucket" (portkey.aws/search-for-tag rawinput69024 "Bucket" :flattened? false), "Prefix" (portkey.aws/search-for-tag rawinput69024 "Prefix" :flattened? false), "EncodingType" (portkey.aws/search-for-tag rawinput69024 "EncodingType" :flattened? false), "NextKeyMarker" (portkey.aws/search-for-tag rawinput69024 "NextKeyMarker" :flattened? false), "Upload" (portkey.aws/search-for-tag rawinput69024 "Upload" :flattened? true), "UploadIdMarker" (portkey.aws/search-for-tag rawinput69024 "UploadIdMarker" :flattened? false), "MaxUploads" (portkey.aws/search-for-tag rawinput69024 "MaxUploads" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput69024 "IsTruncated" :flattened? false), "CommonPrefixes" (portkey.aws/search-for-tag rawinput69024 "CommonPrefixes" :flattened? true), "Delimiter" (portkey.aws/search-for-tag rawinput69024 "Delimiter" :flattened? false), "KeyMarker" (portkey.aws/search-for-tag rawinput69024 "KeyMarker" :flattened? false), "NextUploadIdMarker" (portkey.aws/search-for-tag rawinput69024 "NextUploadIdMarker" :flattened? false)}] (clojure.core/cond-> {} (letvar69025 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar69025 ["Bucket" :content]))) (letvar69025 "Upload") (clojure.core/assoc :uploads (deser-multipart-upload-list (clojure.core/get-in letvar69025 ["Upload"]))) (letvar69025 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar69025 ["Prefix" :content]))) (letvar69025 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar69025 ["EncodingType" :content]))) (letvar69025 "NextKeyMarker") (clojure.core/assoc :next-key-marker (deser-next-key-marker (clojure.core/get-in letvar69025 ["NextKeyMarker" :content]))) (letvar69025 "UploadIdMarker") (clojure.core/assoc :upload-id-marker (deser-upload-id-marker (clojure.core/get-in letvar69025 ["UploadIdMarker" :content]))) (letvar69025 "MaxUploads") (clojure.core/assoc :max-uploads (deser-max-uploads (clojure.core/get-in letvar69025 ["MaxUploads" :content]))) (letvar69025 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar69025 ["IsTruncated" :content]))) (letvar69025 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar69025 ["CommonPrefixes"]))) (letvar69025 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar69025 ["Delimiter" :content]))) (letvar69025 "KeyMarker") (clojure.core/assoc :key-marker (deser-key-marker (clojure.core/get-in letvar69025 ["KeyMarker" :content]))) (letvar69025 "NextUploadIdMarker") (clojure.core/assoc :next-upload-id-marker (deser-next-upload-id-marker (clojure.core/get-in letvar69025 ["NextUploadIdMarker" :content]))))))

(clojure.core/defn- response-list-bucket-metrics-configurations-output [input] (clojure.core/let [rawinput69026 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69027 {"IsTruncated" (portkey.aws/search-for-tag rawinput69026 "IsTruncated" :flattened? false), "ContinuationToken" (portkey.aws/search-for-tag rawinput69026 "ContinuationToken" :flattened? false), "NextContinuationToken" (portkey.aws/search-for-tag rawinput69026 "NextContinuationToken" :flattened? false), "MetricsConfiguration" (portkey.aws/search-for-tag rawinput69026 "MetricsConfiguration" :flattened? true)}] (clojure.core/cond-> {} (letvar69027 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar69027 ["IsTruncated" :content]))) (letvar69027 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar69027 ["ContinuationToken" :content]))) (letvar69027 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar69027 ["NextContinuationToken" :content]))) (letvar69027 "MetricsConfiguration") (clojure.core/assoc :metrics-configuration-list (deser-metrics-configuration-list (clojure.core/get-in letvar69027 ["MetricsConfiguration"]))))))

(clojure.core/defn- response-create-bucket-output [input] (clojure.core/let [rawinput69028 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69029 {"Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {} (letvar69029 "Location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar69029 ["Location"]))))))

(clojure.core/defn- response-delete-object-output [input] (clojure.core/let [rawinput69030 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69031 {"x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69031 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar69031 ["x-amz-delete-marker"]))) (letvar69031 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69031 ["x-amz-version-id"]))) (letvar69031 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69031 ["x-amz-request-charged"]))))))

(clojure.core/defn- response-list-objects-output [input] (clojure.core/let [rawinput69032 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69033 {"Prefix" (portkey.aws/search-for-tag rawinput69032 "Prefix" :flattened? false), "EncodingType" (portkey.aws/search-for-tag rawinput69032 "EncodingType" :flattened? false), "Marker" (portkey.aws/search-for-tag rawinput69032 "Marker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput69032 "IsTruncated" :flattened? false), "CommonPrefixes" (portkey.aws/search-for-tag rawinput69032 "CommonPrefixes" :flattened? true), "Contents" (portkey.aws/search-for-tag rawinput69032 "Contents" :flattened? true), "NextMarker" (portkey.aws/search-for-tag rawinput69032 "NextMarker" :flattened? false), "Delimiter" (portkey.aws/search-for-tag rawinput69032 "Delimiter" :flattened? false), "Name" (portkey.aws/search-for-tag rawinput69032 "Name" :flattened? false), "MaxKeys" (portkey.aws/search-for-tag rawinput69032 "MaxKeys" :flattened? false)}] (clojure.core/cond-> {} (letvar69033 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar69033 ["Prefix" :content]))) (letvar69033 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar69033 ["EncodingType" :content]))) (letvar69033 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar69033 ["Marker" :content]))) (letvar69033 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar69033 ["IsTruncated" :content]))) (letvar69033 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar69033 ["CommonPrefixes"]))) (letvar69033 "Contents") (clojure.core/assoc :contents (deser-object-list (clojure.core/get-in letvar69033 ["Contents"]))) (letvar69033 "NextMarker") (clojure.core/assoc :next-marker (deser-next-marker (clojure.core/get-in letvar69033 ["NextMarker" :content]))) (letvar69033 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar69033 ["Delimiter" :content]))) (letvar69033 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar69033 ["Name" :content]))) (letvar69033 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar69033 ["MaxKeys" :content]))))))

(clojure.core/defn- response-list-bucket-inventory-configurations-output [input] (clojure.core/let [rawinput69034 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69035 {"ContinuationToken" (portkey.aws/search-for-tag rawinput69034 "ContinuationToken" :flattened? false), "InventoryConfiguration" (portkey.aws/search-for-tag rawinput69034 "InventoryConfiguration" :flattened? true), "IsTruncated" (portkey.aws/search-for-tag rawinput69034 "IsTruncated" :flattened? false), "NextContinuationToken" (portkey.aws/search-for-tag rawinput69034 "NextContinuationToken" :flattened? false)}] (clojure.core/cond-> {} (letvar69035 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar69035 ["ContinuationToken" :content]))) (letvar69035 "InventoryConfiguration") (clojure.core/assoc :inventory-configuration-list (deser-inventory-configuration-list (clojure.core/get-in letvar69035 ["InventoryConfiguration"]))) (letvar69035 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar69035 ["IsTruncated" :content]))) (letvar69035 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar69035 ["NextContinuationToken" :content]))))))

(clojure.core/defn- response-list-parts-output [input] (clojure.core/let [rawinput69036 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69037 {"Bucket" (portkey.aws/search-for-tag rawinput69036 "Bucket" :flattened? false), "MaxParts" (portkey.aws/search-for-tag rawinput69036 "MaxParts" :flattened? false), "x-amz-abort-date" (clojure.core/get-in input [:headers "x-amz-abort-date"]), "NextPartNumberMarker" (portkey.aws/search-for-tag rawinput69036 "NextPartNumberMarker" :flattened? false), "x-amz-abort-rule-id" (clojure.core/get-in input [:headers "x-amz-abort-rule-id"]), "Key" (portkey.aws/search-for-tag rawinput69036 "Key" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput69036 "IsTruncated" :flattened? false), "Part" (portkey.aws/search-for-tag rawinput69036 "Part" :flattened? true), "PartNumberMarker" (portkey.aws/search-for-tag rawinput69036 "PartNumberMarker" :flattened? false), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "Owner" (portkey.aws/search-for-tag rawinput69036 "Owner" :flattened? false), "UploadId" (portkey.aws/search-for-tag rawinput69036 "UploadId" :flattened? false), "StorageClass" (portkey.aws/search-for-tag rawinput69036 "StorageClass" :flattened? false), "Initiator" (portkey.aws/search-for-tag rawinput69036 "Initiator" :flattened? false)}] (clojure.core/cond-> {} (letvar69037 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar69037 ["Bucket" :content]))) (letvar69037 "Part") (clojure.core/assoc :parts (deser-parts (clojure.core/get-in letvar69037 ["Part"]))) (letvar69037 "x-amz-abort-date") (clojure.core/assoc :abort-date (deser-abort-date (clojure.core/get-in letvar69037 ["x-amz-abort-date"]))) (letvar69037 "MaxParts") (clojure.core/assoc :max-parts (deser-max-parts (clojure.core/get-in letvar69037 ["MaxParts" :content]))) (letvar69037 "NextPartNumberMarker") (clojure.core/assoc :next-part-number-marker (deser-next-part-number-marker (clojure.core/get-in letvar69037 ["NextPartNumberMarker" :content]))) (letvar69037 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar69037 ["Key" :content]))) (letvar69037 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar69037 ["IsTruncated" :content]))) (letvar69037 "x-amz-abort-rule-id") (clojure.core/assoc :abort-rule-id (deser-abort-rule-id (clojure.core/get-in letvar69037 ["x-amz-abort-rule-id"]))) (letvar69037 "PartNumberMarker") (clojure.core/assoc :part-number-marker (deser-part-number-marker (clojure.core/get-in letvar69037 ["PartNumberMarker" :content]))) (letvar69037 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar69037 ["Owner" :content]))) (letvar69037 "UploadId") (clojure.core/assoc :upload-id (deser-multipart-upload-id (clojure.core/get-in letvar69037 ["UploadId" :content]))) (letvar69037 "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar69037 ["StorageClass" :content]))) (letvar69037 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69037 ["x-amz-request-charged"]))) (letvar69037 "Initiator") (clojure.core/assoc :initiator (deser-initiator (clojure.core/get-in letvar69037 ["Initiator" :content]))))))

(clojure.core/defn- response-abort-multipart-upload-output [input] (clojure.core/let [rawinput69038 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69039 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69039 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69039 ["x-amz-request-charged"]))))))

(clojure.core/defn- response-head-object-output [input] (clojure.core/let [rawinput69040 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69041 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "Last-Modified" (clojure.core/get-in input [:headers "Last-Modified"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-meta-" (clojure.core/get-in input [:headers "x-amz-meta-"]), "x-amz-restore" (clojure.core/get-in input [:headers "x-amz-restore"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-replication-status" (clojure.core/get-in input [:headers "x-amz-replication-status"]), "Content-Disposition" (clojure.core/get-in input [:headers "Content-Disposition"]), "x-amz-missing-meta" (clojure.core/get-in input [:headers "x-amz-missing-meta"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "Cache-Control" (clojure.core/get-in input [:headers "Cache-Control"]), "accept-ranges" (clojure.core/get-in input [:headers "accept-ranges"]), "x-amz-website-redirect-location" (clojure.core/get-in input [:headers "x-amz-website-redirect-location"]), "Content-Length" (clojure.core/get-in input [:headers "Content-Length"]), "Content-Language" (clojure.core/get-in input [:headers "Content-Language"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-mp-parts-count" (clojure.core/get-in input [:headers "x-amz-mp-parts-count"]), "Content-Encoding" (clojure.core/get-in input [:headers "Content-Encoding"]), "x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-storage-class" (clojure.core/get-in input [:headers "x-amz-storage-class"]), "Expires" (clojure.core/get-in input [:headers "Expires"])}] (clojure.core/cond-> {} (letvar69041 "x-amz-missing-meta") (clojure.core/assoc :missing-meta (deser-missing-meta (clojure.core/get-in letvar69041 ["x-amz-missing-meta"]))) (letvar69041 "Content-Encoding") (clojure.core/assoc :content-encoding (deser-content-encoding (clojure.core/get-in letvar69041 ["Content-Encoding"]))) (letvar69041 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar69041 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar69041 "x-amz-website-redirect-location") (clojure.core/assoc :website-redirect-location (deser-website-redirect-location (clojure.core/get-in letvar69041 ["x-amz-website-redirect-location"]))) (letvar69041 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar69041 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar69041 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69041 ["x-amz-version-id"]))) (letvar69041 "accept-ranges") (clojure.core/assoc :accept-ranges (deser-accept-ranges (clojure.core/get-in letvar69041 ["accept-ranges"]))) (letvar69041 "x-amz-replication-status") (clojure.core/assoc :replication-status (deser-replication-status (clojure.core/get-in letvar69041 ["x-amz-replication-status"]))) (letvar69041 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar69041 ["x-amz-server-side-encryption"]))) (letvar69041 "Content-Disposition") (clojure.core/assoc :content-disposition (deser-content-disposition (clojure.core/get-in letvar69041 ["Content-Disposition"]))) (letvar69041 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar69041 ["ETag"]))) (letvar69041 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar69041 ["Content-Type"]))) (letvar69041 "x-amz-restore") (clojure.core/assoc :restore (deser-restore (clojure.core/get-in letvar69041 ["x-amz-restore"]))) (letvar69041 "Content-Length") (clojure.core/assoc :content-length (deser-content-length (clojure.core/get-in letvar69041 ["Content-Length"]))) (letvar69041 "Last-Modified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar69041 ["Last-Modified"]))) (letvar69041 "x-amz-mp-parts-count") (clojure.core/assoc :parts-count (deser-parts-count (clojure.core/get-in letvar69041 ["x-amz-mp-parts-count"]))) (letvar69041 "x-amz-meta-") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar69041 ["x-amz-meta-" :content]))) (letvar69041 "Cache-Control") (clojure.core/assoc :cache-control (deser-cache-control (clojure.core/get-in letvar69041 ["Cache-Control"]))) (letvar69041 "Content-Language") (clojure.core/assoc :content-language (deser-content-language (clojure.core/get-in letvar69041 ["Content-Language"]))) (letvar69041 "x-amz-storage-class") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar69041 ["x-amz-storage-class"]))) (letvar69041 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar69041 ["x-amz-delete-marker"]))) (letvar69041 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69041 ["x-amz-request-charged"]))) (letvar69041 "Expires") (clojure.core/assoc :expires (deser-expires (clojure.core/get-in letvar69041 ["Expires"]))) (letvar69041 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar69041 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar69041 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar69041 ["x-amz-expiration"]))))))

(clojure.core/defn- response-get-bucket-cors-output [input] (clojure.core/let [rawinput69042 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69043 {"CORSRule" (portkey.aws/search-for-tag rawinput69042 "CORSRule" :flattened? true)}] (clojure.core/cond-> {} (letvar69043 "CORSRule") (clojure.core/assoc :cors-rules (deser-cors-rules (clojure.core/get-in letvar69043 ["CORSRule"]))))))

(clojure.core/defn- response-get-bucket-website-output [input] (clojure.core/let [rawinput69044 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69045 {"RedirectAllRequestsTo" (portkey.aws/search-for-tag rawinput69044 "RedirectAllRequestsTo" :flattened? false), "IndexDocument" (portkey.aws/search-for-tag rawinput69044 "IndexDocument" :flattened? false), "ErrorDocument" (portkey.aws/search-for-tag rawinput69044 "ErrorDocument" :flattened? false), "RoutingRules" (portkey.aws/search-for-tag rawinput69044 "RoutingRules" :flattened? false)}] (clojure.core/cond-> {} (letvar69045 "RedirectAllRequestsTo") (clojure.core/assoc :redirect-all-requests-to (deser-redirect-all-requests-to (clojure.core/get-in letvar69045 ["RedirectAllRequestsTo" :content]))) (letvar69045 "IndexDocument") (clojure.core/assoc :index-document (deser-index-document (clojure.core/get-in letvar69045 ["IndexDocument" :content]))) (letvar69045 "ErrorDocument") (clojure.core/assoc :error-document (deser-error-document (clojure.core/get-in letvar69045 ["ErrorDocument" :content]))) (letvar69045 "RoutingRules") (clojure.core/assoc :routing-rules (deser-routing-rules (clojure.core/get-in letvar69045 ["RoutingRules" :content]))))))

(clojure.core/defn- response-bucket-already-exists [input] (clojure.core/let [rawinput69046 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69047 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-list-objects-v-2-output [input] (clojure.core/let [rawinput69048 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69049 {"KeyCount" (portkey.aws/search-for-tag rawinput69048 "KeyCount" :flattened? false), "Prefix" (portkey.aws/search-for-tag rawinput69048 "Prefix" :flattened? false), "EncodingType" (portkey.aws/search-for-tag rawinput69048 "EncodingType" :flattened? false), "StartAfter" (portkey.aws/search-for-tag rawinput69048 "StartAfter" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput69048 "IsTruncated" :flattened? false), "CommonPrefixes" (portkey.aws/search-for-tag rawinput69048 "CommonPrefixes" :flattened? true), "Contents" (portkey.aws/search-for-tag rawinput69048 "Contents" :flattened? true), "ContinuationToken" (portkey.aws/search-for-tag rawinput69048 "ContinuationToken" :flattened? false), "Delimiter" (portkey.aws/search-for-tag rawinput69048 "Delimiter" :flattened? false), "NextContinuationToken" (portkey.aws/search-for-tag rawinput69048 "NextContinuationToken" :flattened? false), "Name" (portkey.aws/search-for-tag rawinput69048 "Name" :flattened? false), "MaxKeys" (portkey.aws/search-for-tag rawinput69048 "MaxKeys" :flattened? false)}] (clojure.core/cond-> {} (letvar69049 "KeyCount") (clojure.core/assoc :key-count (deser-key-count (clojure.core/get-in letvar69049 ["KeyCount" :content]))) (letvar69049 "Prefix") (clojure.core/assoc :prefix (deser-prefix (clojure.core/get-in letvar69049 ["Prefix" :content]))) (letvar69049 "EncodingType") (clojure.core/assoc :encoding-type (deser-encoding-type (clojure.core/get-in letvar69049 ["EncodingType" :content]))) (letvar69049 "StartAfter") (clojure.core/assoc :start-after (deser-start-after (clojure.core/get-in letvar69049 ["StartAfter" :content]))) (letvar69049 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar69049 ["IsTruncated" :content]))) (letvar69049 "CommonPrefixes") (clojure.core/assoc :common-prefixes (deser-common-prefix-list (clojure.core/get-in letvar69049 ["CommonPrefixes"]))) (letvar69049 "Contents") (clojure.core/assoc :contents (deser-object-list (clojure.core/get-in letvar69049 ["Contents"]))) (letvar69049 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar69049 ["ContinuationToken" :content]))) (letvar69049 "Delimiter") (clojure.core/assoc :delimiter (deser-delimiter (clojure.core/get-in letvar69049 ["Delimiter" :content]))) (letvar69049 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar69049 ["NextContinuationToken" :content]))) (letvar69049 "Name") (clojure.core/assoc :name (deser-bucket-name (clojure.core/get-in letvar69049 ["Name" :content]))) (letvar69049 "MaxKeys") (clojure.core/assoc :max-keys (deser-max-keys (clojure.core/get-in letvar69049 ["MaxKeys" :content]))))))

(clojure.core/defn- response-select-object-content-output [input] (clojure.core/let [rawinput69050 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69051 {"Payload" (portkey.aws/search-for-tag rawinput69050 "Payload" :flattened? false)}] (clojure.core/cond-> {} (letvar69051 "Payload") (clojure.core/assoc :payload (deser-select-object-content-event-stream (clojure.core/get-in letvar69051 ["Payload" :content]))))))

(clojure.core/defn- response-no-such-upload [input] (clojure.core/let [rawinput69052 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69053 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-no-such-bucket [input] (clojure.core/let [rawinput69054 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69055 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-bucket-accelerate-configuration-output [input] (clojure.core/let [rawinput69056 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69057 {"Status" (portkey.aws/search-for-tag rawinput69056 "Status" :flattened? false)}] (clojure.core/cond-> {} (letvar69057 "Status") (clojure.core/assoc :status (deser-bucket-accelerate-status (clojure.core/get-in letvar69057 ["Status" :content]))))))

(clojure.core/defn- response-restore-object-output [input] (clojure.core/let [rawinput69058 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69059 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-restore-output-path" (clojure.core/get-in input [:headers "x-amz-restore-output-path"])}] (clojure.core/cond-> {} (letvar69059 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69059 ["x-amz-request-charged"]))) (letvar69059 "x-amz-restore-output-path") (clojure.core/assoc :restore-output-path (deser-restore-output-path (clojure.core/get-in letvar69059 ["x-amz-restore-output-path"]))))))

(clojure.core/defn- response-get-object-output [input] (clojure.core/let [rawinput69060 (:body input) letvar69061 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-tagging-count" (clojure.core/get-in input [:headers "x-amz-tagging-count"]), "Body" rawinput69060, "Content-Range" (clojure.core/get-in input [:headers "Content-Range"]), "Last-Modified" (clojure.core/get-in input [:headers "Last-Modified"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-meta-" (clojure.core/get-in input [:headers "x-amz-meta-"]), "x-amz-restore" (clojure.core/get-in input [:headers "x-amz-restore"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-replication-status" (clojure.core/get-in input [:headers "x-amz-replication-status"]), "Content-Disposition" (clojure.core/get-in input [:headers "Content-Disposition"]), "x-amz-missing-meta" (clojure.core/get-in input [:headers "x-amz-missing-meta"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "Cache-Control" (clojure.core/get-in input [:headers "Cache-Control"]), "accept-ranges" (clojure.core/get-in input [:headers "accept-ranges"]), "x-amz-website-redirect-location" (clojure.core/get-in input [:headers "x-amz-website-redirect-location"]), "Content-Length" (clojure.core/get-in input [:headers "Content-Length"]), "Content-Language" (clojure.core/get-in input [:headers "Content-Language"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"]), "x-amz-mp-parts-count" (clojure.core/get-in input [:headers "x-amz-mp-parts-count"]), "Content-Encoding" (clojure.core/get-in input [:headers "Content-Encoding"]), "x-amz-delete-marker" (clojure.core/get-in input [:headers "x-amz-delete-marker"]), "x-amz-storage-class" (clojure.core/get-in input [:headers "x-amz-storage-class"]), "Expires" (clojure.core/get-in input [:headers "Expires"])}] (clojure.core/cond-> {} (letvar69061 "x-amz-missing-meta") (clojure.core/assoc :missing-meta (deser-missing-meta (clojure.core/get-in letvar69061 ["x-amz-missing-meta"]))) (letvar69061 "Content-Encoding") (clojure.core/assoc :content-encoding (deser-content-encoding (clojure.core/get-in letvar69061 ["Content-Encoding"]))) (letvar69061 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar69061 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar69061 "x-amz-website-redirect-location") (clojure.core/assoc :website-redirect-location (deser-website-redirect-location (clojure.core/get-in letvar69061 ["x-amz-website-redirect-location"]))) (letvar69061 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar69061 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar69061 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69061 ["x-amz-version-id"]))) (letvar69061 "Body") (clojure.core/assoc :body (deser-body (clojure.core/get-in letvar69061 ["Body"]))) (letvar69061 "Content-Range") (clojure.core/assoc :content-range (deser-content-range (clojure.core/get-in letvar69061 ["Content-Range"]))) (letvar69061 "accept-ranges") (clojure.core/assoc :accept-ranges (deser-accept-ranges (clojure.core/get-in letvar69061 ["accept-ranges"]))) (letvar69061 "x-amz-replication-status") (clojure.core/assoc :replication-status (deser-replication-status (clojure.core/get-in letvar69061 ["x-amz-replication-status"]))) (letvar69061 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar69061 ["x-amz-server-side-encryption"]))) (letvar69061 "Content-Disposition") (clojure.core/assoc :content-disposition (deser-content-disposition (clojure.core/get-in letvar69061 ["Content-Disposition"]))) (letvar69061 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar69061 ["ETag"]))) (letvar69061 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar69061 ["Content-Type"]))) (letvar69061 "x-amz-restore") (clojure.core/assoc :restore (deser-restore (clojure.core/get-in letvar69061 ["x-amz-restore"]))) (letvar69061 "x-amz-tagging-count") (clojure.core/assoc :tag-count (deser-tag-count (clojure.core/get-in letvar69061 ["x-amz-tagging-count"]))) (letvar69061 "Content-Length") (clojure.core/assoc :content-length (deser-content-length (clojure.core/get-in letvar69061 ["Content-Length"]))) (letvar69061 "Last-Modified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar69061 ["Last-Modified"]))) (letvar69061 "x-amz-mp-parts-count") (clojure.core/assoc :parts-count (deser-parts-count (clojure.core/get-in letvar69061 ["x-amz-mp-parts-count"]))) (letvar69061 "x-amz-meta-") (clojure.core/assoc :metadata (deser-metadata (clojure.core/get-in letvar69061 ["x-amz-meta-" :content]))) (letvar69061 "Cache-Control") (clojure.core/assoc :cache-control (deser-cache-control (clojure.core/get-in letvar69061 ["Cache-Control"]))) (letvar69061 "Content-Language") (clojure.core/assoc :content-language (deser-content-language (clojure.core/get-in letvar69061 ["Content-Language"]))) (letvar69061 "x-amz-storage-class") (clojure.core/assoc :storage-class (deser-storage-class (clojure.core/get-in letvar69061 ["x-amz-storage-class"]))) (letvar69061 "x-amz-delete-marker") (clojure.core/assoc :delete-marker (deser-delete-marker (clojure.core/get-in letvar69061 ["x-amz-delete-marker"]))) (letvar69061 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69061 ["x-amz-request-charged"]))) (letvar69061 "Expires") (clojure.core/assoc :expires (deser-expires (clojure.core/get-in letvar69061 ["Expires"]))) (letvar69061 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar69061 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar69061 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar69061 ["x-amz-expiration"]))))))

(clojure.core/defn- response-complete-multipart-upload-output [input] (clojure.core/let [rawinput69062 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69063 {"Bucket" (portkey.aws/search-for-tag rawinput69062 "Bucket" :flattened? false), "x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "Location" (portkey.aws/search-for-tag rawinput69062 "Location" :flattened? false), "ETag" (portkey.aws/search-for-tag rawinput69062 "ETag" :flattened? false), "Key" (portkey.aws/search-for-tag rawinput69062 "Key" :flattened? false), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69063 "Bucket") (clojure.core/assoc :bucket (deser-bucket-name (clojure.core/get-in letvar69063 ["Bucket" :content]))) (letvar69063 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69063 ["x-amz-version-id"]))) (letvar69063 "Location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar69063 ["Location" :content]))) (letvar69063 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar69063 ["x-amz-server-side-encryption"]))) (letvar69063 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar69063 ["ETag" :content]))) (letvar69063 "Key") (clojure.core/assoc :key (deser-object-key (clojure.core/get-in letvar69063 ["Key" :content]))) (letvar69063 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69063 ["x-amz-request-charged"]))) (letvar69063 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar69063 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar69063 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar69063 ["x-amz-expiration"]))))))

(clojure.core/defn- response-notification-configuration-deprecated [input] (clojure.core/let [rawinput69064 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69065 {"TopicConfiguration" (portkey.aws/search-for-tag rawinput69064 "TopicConfiguration" :flattened? false), "QueueConfiguration" (portkey.aws/search-for-tag rawinput69064 "QueueConfiguration" :flattened? false), "CloudFunctionConfiguration" (portkey.aws/search-for-tag rawinput69064 "CloudFunctionConfiguration" :flattened? false)}] (clojure.core/cond-> {} (letvar69065 "TopicConfiguration") (clojure.core/assoc :topic-configuration (deser-topic-configuration-deprecated (clojure.core/get-in letvar69065 ["TopicConfiguration" :content]))) (letvar69065 "QueueConfiguration") (clojure.core/assoc :queue-configuration (deser-queue-configuration-deprecated (clojure.core/get-in letvar69065 ["QueueConfiguration" :content]))) (letvar69065 "CloudFunctionConfiguration") (clojure.core/assoc :cloud-function-configuration (deser-cloud-function-configuration (clojure.core/get-in letvar69065 ["CloudFunctionConfiguration" :content]))))))

(clojure.core/defn- response-delete-object-tagging-output [input] (clojure.core/let [rawinput69066 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69067 {"x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"])}] (clojure.core/cond-> {} (letvar69067 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69067 ["x-amz-version-id"]))))))

(clojure.core/defn- response-upload-part-output [input] (clojure.core/let [rawinput69068 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69069 {"x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69069 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar69069 ["x-amz-server-side-encryption"]))) (letvar69069 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar69069 ["ETag"]))) (letvar69069 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar69069 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar69069 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar69069 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar69069 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar69069 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar69069 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69069 ["x-amz-request-charged"]))))))

(clojure.core/defn- response-get-bucket-acl-output [input] (clojure.core/let [rawinput69070 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69071 {"Owner" (portkey.aws/search-for-tag rawinput69070 "Owner" :flattened? false), "AccessControlList" (portkey.aws/search-for-tag rawinput69070 "AccessControlList" :flattened? false)}] (clojure.core/cond-> {} (letvar69071 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar69071 ["Owner" :content]))) (letvar69071 "AccessControlList") (clojure.core/assoc :grants (deser-grants (clojure.core/get-in letvar69071 ["AccessControlList" :content]))))))

(clojure.core/defn- response-get-bucket-request-payment-output [input] (clojure.core/let [rawinput69072 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69073 {"Payer" (portkey.aws/search-for-tag rawinput69072 "Payer" :flattened? false)}] (clojure.core/cond-> {} (letvar69073 "Payer") (clojure.core/assoc :payer (deser-payer (clojure.core/get-in letvar69073 ["Payer" :content]))))))

(clojure.core/defn- response-get-bucket-tagging-output [input] (clojure.core/let [rawinput69074 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69075 {"TagSet" (portkey.aws/search-for-tag rawinput69074 "TagSet" :flattened? false)}] (clojure.core/cond-> {:tag-set (deser-tag-set (clojure.core/get-in letvar69075 ["TagSet" :content]))})))

(clojure.core/defn- response-get-bucket-lifecycle-configuration-output [input] (clojure.core/let [rawinput69076 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69077 {"Rule" (portkey.aws/search-for-tag rawinput69076 "Rule" :flattened? true)}] (clojure.core/cond-> {} (letvar69077 "Rule") (clojure.core/assoc :rules (deser-lifecycle-rules (clojure.core/get-in letvar69077 ["Rule"]))))))

(clojure.core/defn- response-get-bucket-location-output [input] (clojure.core/let [rawinput69078 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69079 {"LocationConstraint" (portkey.aws/search-for-tag rawinput69078 "LocationConstraint" :flattened? false)}] (clojure.core/cond-> {} (letvar69079 "LocationConstraint") (clojure.core/assoc :location-constraint (deser-bucket-location-constraint (clojure.core/get-in letvar69079 ["LocationConstraint" :content]))))))

(clojure.core/defn- response-get-bucket-inventory-configuration-output [input] (clojure.core/let [rawinput69080 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69081 {"InventoryConfiguration" (portkey.aws/search-for-tag rawinput69080 "InventoryConfiguration" :flattened? false)}] (clojure.core/cond-> {} (letvar69081 "InventoryConfiguration") (clojure.core/assoc :inventory-configuration (deser-inventory-configuration (clojure.core/get-in letvar69081 ["InventoryConfiguration" :content]))))))

(clojure.core/defn- response-get-bucket-versioning-output [input] (clojure.core/let [rawinput69082 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69083 {"Status" (portkey.aws/search-for-tag rawinput69082 "Status" :flattened? false), "MfaDelete" (portkey.aws/search-for-tag rawinput69082 "MfaDelete" :flattened? false)}] (clojure.core/cond-> {} (letvar69083 "Status") (clojure.core/assoc :status (deser-bucket-versioning-status (clojure.core/get-in letvar69083 ["Status" :content]))) (letvar69083 "MfaDelete") (clojure.core/assoc :mfa-delete (deser-mfa-delete-status (clojure.core/get-in letvar69083 ["MfaDelete" :content]))))))

(clojure.core/defn- response-put-object-acl-output [input] (clojure.core/let [rawinput69084 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69085 {"x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69085 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69085 ["x-amz-request-charged"]))))))

(clojure.core/defn- response-upload-part-copy-output [input] (clojure.core/let [rawinput69086 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69087 {"x-amz-copy-source-version-id" (clojure.core/get-in input [:headers "x-amz-copy-source-version-id"]), "CopyPartResult" (portkey.aws/search-for-tag rawinput69086 "CopyPartResult" :flattened? false), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69087 "x-amz-copy-source-version-id") (clojure.core/assoc :copy-source-version-id (deser-copy-source-version-id (clojure.core/get-in letvar69087 ["x-amz-copy-source-version-id"]))) (letvar69087 "CopyPartResult") (clojure.core/assoc :copy-part-result (deser-copy-part-result (clojure.core/get-in letvar69087 ["CopyPartResult" :content]))) (letvar69087 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar69087 ["x-amz-server-side-encryption"]))) (letvar69087 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar69087 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar69087 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar69087 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar69087 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar69087 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar69087 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69087 ["x-amz-request-charged"]))))))

(clojure.core/defn- response-list-buckets-output [input] (clojure.core/let [rawinput69088 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69089 {"Buckets" (portkey.aws/search-for-tag rawinput69088 "Buckets" :flattened? false), "Owner" (portkey.aws/search-for-tag rawinput69088 "Owner" :flattened? false)}] (clojure.core/cond-> {} (letvar69089 "Buckets") (clojure.core/assoc :buckets (deser-buckets (clojure.core/get-in letvar69089 ["Buckets" :content]))) (letvar69089 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar69089 ["Owner" :content]))))))

(clojure.core/defn- response-put-object-output [input] (clojure.core/let [rawinput69090 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69091 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "ETag" (clojure.core/get-in input [:headers "ETag"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69091 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar69091 ["x-amz-expiration"]))) (letvar69091 "ETag") (clojure.core/assoc :e-tag (deser-e-tag (clojure.core/get-in letvar69091 ["ETag"]))) (letvar69091 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar69091 ["x-amz-server-side-encryption"]))) (letvar69091 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69091 ["x-amz-version-id"]))) (letvar69091 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar69091 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar69091 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar69091 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar69091 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar69091 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar69091 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69091 ["x-amz-request-charged"]))))))

(clojure.core/defn- response-get-object-acl-output [input] (clojure.core/let [rawinput69092 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69093 {"Owner" (portkey.aws/search-for-tag rawinput69092 "Owner" :flattened? false), "AccessControlList" (portkey.aws/search-for-tag rawinput69092 "AccessControlList" :flattened? false), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69093 "Owner") (clojure.core/assoc :owner (deser-owner (clojure.core/get-in letvar69093 ["Owner" :content]))) (letvar69093 "AccessControlList") (clojure.core/assoc :grants (deser-grants (clojure.core/get-in letvar69093 ["AccessControlList" :content]))) (letvar69093 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69093 ["x-amz-request-charged"]))))))

(clojure.core/defn- response-list-bucket-analytics-configurations-output [input] (clojure.core/let [rawinput69094 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69095 {"IsTruncated" (portkey.aws/search-for-tag rawinput69094 "IsTruncated" :flattened? false), "ContinuationToken" (portkey.aws/search-for-tag rawinput69094 "ContinuationToken" :flattened? false), "NextContinuationToken" (portkey.aws/search-for-tag rawinput69094 "NextContinuationToken" :flattened? false), "AnalyticsConfiguration" (portkey.aws/search-for-tag rawinput69094 "AnalyticsConfiguration" :flattened? true)}] (clojure.core/cond-> {} (letvar69095 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar69095 ["IsTruncated" :content]))) (letvar69095 "ContinuationToken") (clojure.core/assoc :continuation-token (deser-token (clojure.core/get-in letvar69095 ["ContinuationToken" :content]))) (letvar69095 "NextContinuationToken") (clojure.core/assoc :next-continuation-token (deser-next-token (clojure.core/get-in letvar69095 ["NextContinuationToken" :content]))) (letvar69095 "AnalyticsConfiguration") (clojure.core/assoc :analytics-configuration-list (deser-analytics-configuration-list (clojure.core/get-in letvar69095 ["AnalyticsConfiguration"]))))))

(clojure.core/defn- response-object-already-in-active-tier-error [input] (clojure.core/let [rawinput69096 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69097 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-bucket-policy-output [input] (clojure.core/let [rawinput69098 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69099 {"Policy" (portkey.aws/search-for-tag rawinput69098 "Policy" :flattened? false)}] (clojure.core/cond-> {} (letvar69099 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar69099 ["Policy" :content]))))))

(clojure.core/defn- response-notification-configuration [input] (clojure.core/let [rawinput69100 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69101 {"TopicConfiguration" (portkey.aws/search-for-tag rawinput69100 "TopicConfiguration" :flattened? true), "QueueConfiguration" (portkey.aws/search-for-tag rawinput69100 "QueueConfiguration" :flattened? true), "CloudFunctionConfiguration" (portkey.aws/search-for-tag rawinput69100 "CloudFunctionConfiguration" :flattened? true)}] (clojure.core/cond-> {} (letvar69101 "TopicConfiguration") (clojure.core/assoc :topic-configurations (deser-topic-configuration-list (clojure.core/get-in letvar69101 ["TopicConfiguration"]))) (letvar69101 "QueueConfiguration") (clojure.core/assoc :queue-configurations (deser-queue-configuration-list (clojure.core/get-in letvar69101 ["QueueConfiguration"]))) (letvar69101 "CloudFunctionConfiguration") (clojure.core/assoc :lambda-function-configurations (deser-lambda-function-configuration-list (clojure.core/get-in letvar69101 ["CloudFunctionConfiguration"]))))))

(clojure.core/defn- response-no-such-key [input] (clojure.core/let [rawinput69102 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69103 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-copy-object-output [input] (clojure.core/let [rawinput69104 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69105 {"x-amz-expiration" (clojure.core/get-in input [:headers "x-amz-expiration"]), "x-amz-server-side-encryption" (clojure.core/get-in input [:headers "x-amz-server-side-encryption"]), "x-amz-copy-source-version-id" (clojure.core/get-in input [:headers "x-amz-copy-source-version-id"]), "x-amz-version-id" (clojure.core/get-in input [:headers "x-amz-version-id"]), "x-amz-server-side-encryption-aws-kms-key-id" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-aws-kms-key-id"]), "x-amz-server-side-encryption-customer-key-MD5" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-key-MD5"]), "x-amz-server-side-encryption-customer-algorithm" (clojure.core/get-in input [:headers "x-amz-server-side-encryption-customer-algorithm"]), "CopyObjectResult" (portkey.aws/search-for-tag rawinput69104 "CopyObjectResult" :flattened? false), "x-amz-request-charged" (clojure.core/get-in input [:headers "x-amz-request-charged"])}] (clojure.core/cond-> {} (letvar69105 "x-amz-server-side-encryption-customer-key-MD5") (clojure.core/assoc :sse-customer-key-md-5 (deser-sse-customer-key-md-5 (clojure.core/get-in letvar69105 ["x-amz-server-side-encryption-customer-key-MD5"]))) (letvar69105 "x-amz-copy-source-version-id") (clojure.core/assoc :copy-source-version-id (deser-copy-source-version-id (clojure.core/get-in letvar69105 ["x-amz-copy-source-version-id"]))) (letvar69105 "x-amz-server-side-encryption-customer-algorithm") (clojure.core/assoc :sse-customer-algorithm (deser-sse-customer-algorithm (clojure.core/get-in letvar69105 ["x-amz-server-side-encryption-customer-algorithm"]))) (letvar69105 "x-amz-version-id") (clojure.core/assoc :version-id (deser-object-version-id (clojure.core/get-in letvar69105 ["x-amz-version-id"]))) (letvar69105 "x-amz-server-side-encryption") (clojure.core/assoc :server-side-encryption (deser-server-side-encryption (clojure.core/get-in letvar69105 ["x-amz-server-side-encryption"]))) (letvar69105 "CopyObjectResult") (clojure.core/assoc :copy-object-result (deser-copy-object-result (clojure.core/get-in letvar69105 ["CopyObjectResult" :content]))) (letvar69105 "x-amz-request-charged") (clojure.core/assoc :request-charged (deser-request-charged (clojure.core/get-in letvar69105 ["x-amz-request-charged"]))) (letvar69105 "x-amz-server-side-encryption-aws-kms-key-id") (clojure.core/assoc :ssekms-key-id (deser-ssekms-key-id (clojure.core/get-in letvar69105 ["x-amz-server-side-encryption-aws-kms-key-id"]))) (letvar69105 "x-amz-expiration") (clojure.core/assoc :expiration (deser-expiration (clojure.core/get-in letvar69105 ["x-amz-expiration"]))))))

(clojure.core/defn- response-get-bucket-metrics-configuration-output [input] (clojure.core/let [rawinput69106 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69107 {"MetricsConfiguration" (portkey.aws/search-for-tag rawinput69106 "MetricsConfiguration" :flattened? false)}] (clojure.core/cond-> {} (letvar69107 "MetricsConfiguration") (clojure.core/assoc :metrics-configuration (deser-metrics-configuration (clojure.core/get-in letvar69107 ["MetricsConfiguration" :content]))))))

(clojure.core/defn- response-object-not-in-active-tier-error [input] (clojure.core/let [rawinput69108 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69109 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-bucket-replication-output [input] (clojure.core/let [rawinput69110 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar69111 {"ReplicationConfiguration" (portkey.aws/search-for-tag rawinput69110 "ReplicationConfiguration" :flattened? false)}] (clojure.core/cond-> {} (letvar69111 "ReplicationConfiguration") (clojure.core/assoc :replication-configuration (deser-replication-configuration (clojure.core/get-in letvar69111 ["ReplicationConfiguration" :content]))))))

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
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-object-request/bucket :portkey.aws.s3.-2006-03-01.delete-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/mfa :portkey.aws.s3.-2006-03-01.delete-object-request/version-id :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/versions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-object-versions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-object-versions-output/versions :portkey.aws.s3.-2006-03-01/prefix :portkey.aws.s3.-2006-03-01/encoding-type :portkey.aws.s3.-2006-03-01/next-key-marker :portkey.aws.s3.-2006-03-01/is-truncated :portkey.aws.s3.-2006-03-01.list-object-versions-output/common-prefixes :portkey.aws.s3.-2006-03-01/version-id-marker :portkey.aws.s3.-2006-03-01/next-version-id-marker :portkey.aws.s3.-2006-03-01/delimiter :portkey.aws.s3.-2006-03-01.list-object-versions-output/name :portkey.aws.s3.-2006-03-01/max-keys :portkey.aws.s3.-2006-03-01/key-marker :portkey.aws.s3.-2006-03-01/delete-markers]))

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
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-request/bucket :portkey.aws.s3.-2006-03-01.put-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/content-md-5 :portkey.aws.s3.-2006-03-01/body :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01.put-object-request/acl :portkey.aws.s3.-2006-03-01/content-length :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control :portkey.aws.s3.-2006-03-01.put-object-request/tagging :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/request-payer]))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-website-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-disposition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/mfa-delete-status #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-name #{:suffix "prefix" "suffix" :prefix})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-id (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-optional-field #{"LastModifiedDate" :storage-class "ReplicationStatus" "EncryptionStatus" "ETag" :size :replication-status "Size" "IsMultipartUploaded" "StorageClass" :encryption-status :is-multipart-uploaded :last-modified-date :e-tag})

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/transition-storage-class #{:standard-ia "GLACIER" :glacier "ONEZONE_IA" "STANDARD_IA" :onezone-ia})

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-part-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/last-modified]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/bucket :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/id] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-objects-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-objects-request/bucket :portkey.aws.s3.-2006-03-01/delete] :opt-un [:portkey.aws.s3.-2006-03-01/mfa :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/filter-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-read (clojure.spec.alpha/and clojure.core/string?))

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
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.copy-object-request/bucket :portkey.aws.s3.-2006-03-01/copy-source :portkey.aws.s3.-2006-03-01.copy-object-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/tagging-directive :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-key :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/metadata-directive :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/copy-source-if-match :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01.copy-object-request/acl :portkey.aws.s3.-2006-03-01/copy-source-if-none-match :portkey.aws.s3.-2006-03-01/copy-source-if-modified-since :portkey.aws.s3.-2006-03-01/copy-source-if-unmodified-since :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-algorithm :portkey.aws.s3.-2006-03-01/copy-source-sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control :portkey.aws.s3.-2006-03-01.copy-object-request/tagging :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/request-payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-logging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-logging-request/bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-modified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/mfa (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/event #{:s-3-object-removed-delete "s3:ObjectCreated:*" :s-3-object-created-copy "s3:ObjectRemoved:Delete" :s-3-object-created-complete-multipart-upload "s3:ObjectRemoved:*" "s3:ObjectRemoved:DeleteMarkerCreated" :s-3-object-created-put "s3:ObjectCreated:Copy" :s-3-object-removed "s3:ObjectCreated:Post" "s3:ObjectCreated:CompleteMultipartUpload" "s3:ReducedRedundancyLostObject" :s-3-object-created "s3:ObjectCreated:Put" :s-3-object-created-post :s-3-object-removed-delete-marker-created :s-3-reduced-redundancy-lost-object})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-canned-acl #{"authenticated-read" "public-read-write" :private "private" :publicread :publicreadwrite "public-read" :authenticatedread})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quote-character (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-request-type #{"SELECT" :select})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/end-event (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quiet clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-disposition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/request-charged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.error-document/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/error-document (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.error-document/key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/redirect (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/host-name :portkey.aws.s3.-2006-03-01/http-redirect-code :portkey.aws.s3.-2006-03-01/protocol :portkey.aws.s3.-2006-03-01/replace-key-prefix-with :portkey.aws.s3.-2006-03-01/replace-key-with]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/head-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/missing-meta :portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01.head-object-output/version-id :portkey.aws.s3.-2006-03-01/accept-ranges :portkey.aws.s3.-2006-03-01/replication-status :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01/restore :portkey.aws.s3.-2006-03-01/content-length :portkey.aws.s3.-2006-03-01/last-modified :portkey.aws.s3.-2006-03-01/parts-count :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/delete-marker :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/expiration]))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-storage-class #{:standard-ia "GLACIER" :glacier "ONEZONE_IA" :reduced-redundancy "STANDARD_IA" "STANDARD" :standard "REDUCED_REDUNDANCY" :onezone-ia})

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
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.create-multipart-upload-request/bucket :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/key] :opt-un [:portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01/sse-customer-key :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/acl :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/grant-write-acp :portkey.aws.s3.-2006-03-01/grant-full-control :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/tagging :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/request-payer]))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__31262__auto__] (clojure.core/<= 1 (clojure.core/count s__31262__auto__)))))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-method (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-accelerate-status #{"Suspended" "Enabled" :suspended :enabled})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/protocol #{"https" "http" :http :https})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-replication-request/bucket :portkey.aws.s3.-2006-03-01/replication-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/missing-meta :portkey.aws.s3.-2006-03-01/content-encoding :portkey.aws.s3.-2006-03-01/sse-customer-key-md-5 :portkey.aws.s3.-2006-03-01/website-redirect-location :portkey.aws.s3.-2006-03-01/sse-customer-algorithm :portkey.aws.s3.-2006-03-01.get-object-output/version-id :portkey.aws.s3.-2006-03-01/body :portkey.aws.s3.-2006-03-01/content-range :portkey.aws.s3.-2006-03-01/accept-ranges :portkey.aws.s3.-2006-03-01/replication-status :portkey.aws.s3.-2006-03-01/server-side-encryption :portkey.aws.s3.-2006-03-01/content-disposition :portkey.aws.s3.-2006-03-01/e-tag :portkey.aws.s3.-2006-03-01/content-type :portkey.aws.s3.-2006-03-01/restore :portkey.aws.s3.-2006-03-01/tag-count :portkey.aws.s3.-2006-03-01/content-length :portkey.aws.s3.-2006-03-01/last-modified :portkey.aws.s3.-2006-03-01/parts-count :portkey.aws.s3.-2006-03-01/metadata :portkey.aws.s3.-2006-03-01/cache-control :portkey.aws.s3.-2006-03-01/content-language :portkey.aws.s3.-2006-03-01/storage-class :portkey.aws.s3.-2006-03-01/delete-marker :portkey.aws.s3.-2006-03-01/request-charged :portkey.aws.s3.-2006-03-01/expires :portkey.aws.s3.-2006-03-01/ssekms-key-id :portkey.aws.s3.-2006-03-01/expiration]))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-bucket-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-canned-acl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.create-bucket-request/bucket] :opt-un [:portkey.aws.s3.-2006-03-01.create-bucket-request/acl :portkey.aws.s3.-2006-03-01/create-bucket-configuration :portkey.aws.s3.-2006-03-01/grant-full-control :portkey.aws.s3.-2006-03-01/grant-read :portkey.aws.s3.-2006-03-01/grant-read-acp :portkey.aws.s3.-2006-03-01/grant-write :portkey.aws.s3.-2006-03-01/grant-write-acp]))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-cors-request/bucket :portkey.aws.s3.-2006-03-01/cors-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/policy (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delimiter (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/queue-arn :portkey.aws.s3.-2006-03-01.queue-configuration/events] :opt-un [:portkey.aws.s3.-2006-03-01.queue-configuration/id :portkey.aws.s3.-2006-03-01.queue-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tagging (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/tag-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/host-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-none-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-output-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class #{:standard-ia "ONEZONE_IA" :reduced-redundancy "STANDARD_IA" "STANDARD" :standard "REDUCED_REDUNDANCY" :onezone-ia})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-rule/apply-server-side-encryption-by-default (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption-by-default))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-rule/apply-server-side-encryption-by-default]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-expiration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/date :portkey.aws.s3.-2006-03-01/days :portkey.aws.s3.-2006-03-01/expired-object-delete-marker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/analytics-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-website-request/bucket :portkey.aws.s3.-2006-03-01/website-configuration] :opt-un [:portkey.aws.s3.-2006-03-01/content-md-5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-format #{"CSV" :csv :orc "ORC"})

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-origins (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/allowed-origin))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__31264__auto__] (clojure.core/re-matches #"\/.+\/.+" s__31264__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lambda-function-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/lambda-function-arn :portkey.aws.s3.-2006-03-01.lambda-function-configuration/events] :opt-un [:portkey.aws.s3.-2006-03-01.lambda-function-configuration/id :portkey.aws.s3.-2006-03-01.lambda-function-configuration/filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-version-id (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-cache-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-markers (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/delete-marker-entry))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-replication-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/replication-configuration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.sse-kms-encrypted-objects/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.sse-kms-encrypted-objects/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/errors (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/error))

(clojure.core/defn delete-bucket ([delete-bucket-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-request delete-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucket", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-logging ([get-bucket-logging-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-logging-request get-bucket-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-logging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?logging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-logging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketLogging", :http.request.configuration/output-deser-fn response-get-bucket-logging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-logging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-logging-output))

(clojure.core/defn list-bucket-metrics-configurations ([list-bucket-metrics-configurations-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-list-bucket-metrics-configurations-request list-bucket-metrics-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBucketMetricsConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-metrics-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-metrics-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-output))

(clojure.core/defn delete-bucket-lifecycle ([delete-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-lifecycle-request delete-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketLifecycle", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-lifecycle-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-policy ([get-bucket-policy-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-policy-request get-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketPolicy", :http.request.configuration/output-deser-fn response-get-bucket-policy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-policy-output))

(clojure.core/defn put-bucket-versioning ([put-bucket-versioning-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-versioning-request put-bucket-versioning-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versioning", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-versioning-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketVersioning", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-versioning :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-versioning-request) :ret clojure.core/true?)

(clojure.core/defn list-object-versions ([list-object-versions-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-list-object-versions-request list-object-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-object-versions-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versions", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-object-versions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListObjectVersions", :http.request.configuration/output-deser-fn response-list-object-versions-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-object-versions :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-object-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-object-versions-output))

(clojure.core/defn get-bucket-inventory-configuration ([get-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-inventory-configuration-request get-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketInventoryConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-inventory-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-output))

(clojure.core/defn put-bucket-encryption ([put-bucket-encryption-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-encryption-request put-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketEncryption", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-encryption-request) :ret clojure.core/true?)

(clojure.core/defn delete-object-tagging ([delete-object-tagging-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-object-tagging-request delete-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteObjectTagging", :http.request.configuration/output-deser-fn response-delete-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-object-tagging-output))

(clojure.core/defn get-object-tagging ([get-object-tagging-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-object-tagging-request get-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetObjectTagging", :http.request.configuration/output-deser-fn response-get-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-tagging-output))

(clojure.core/defn get-bucket-replication ([get-bucket-replication-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-replication-request get-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-replication-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketReplication", :http.request.configuration/output-deser-fn response-get-bucket-replication-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-replication-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-replication-output))

(clojure.core/defn put-bucket-replication ([put-bucket-replication-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-replication-request put-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketReplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-replication-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-analytics-configuration ([delete-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-analytics-configuration-request delete-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-analytics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-notification-configuration ([get-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-notification-configuration-request get-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/notification-configuration, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketNotificationConfiguration", :http.request.configuration/output-deser-fn response-notification-configuration, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration))

(clojure.core/defn get-bucket-request-payment ([get-bucket-request-payment-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-request-payment-request get-bucket-request-payment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?requestPayment", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketRequestPayment", :http.request.configuration/output-deser-fn response-get-bucket-request-payment-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-request-payment :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-output))

(clojure.core/defn get-object-torrent ([get-object-torrent-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-object-torrent-request get-object-torrent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-torrent-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?torrent", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-torrent-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetObjectTorrent", :http.request.configuration/output-deser-fn response-get-object-torrent-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-torrent :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-torrent-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-torrent-output))

(clojure.core/defn list-objects ([list-objects-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-list-objects-request list-objects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-objects-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListObjects", :http.request.configuration/output-deser-fn response-list-objects-output, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef list-objects :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-objects-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-objects-output))

(clojure.core/defn list-objects-v-2 ([list-objects-v-2-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-list-objects-v-2-request list-objects-v-2-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-objects-v-2-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?list-type=2", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-objects-v-2-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListObjectsV2", :http.request.configuration/output-deser-fn response-list-objects-v-2-output, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef list-objects-v-2 :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-objects-v-2-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-objects-v-2-output))

(clojure.core/defn list-bucket-inventory-configurations ([list-bucket-inventory-configurations-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-list-bucket-inventory-configurations-request list-bucket-inventory-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBucketInventoryConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-inventory-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-inventory-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-output))

(clojure.core/defn delete-bucket-cors ([delete-bucket-cors-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-cors-request delete-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketCors", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-cors-request) :ret clojure.core/true?)

(clojure.core/defn put-object ([put-object-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-object-request put-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutObject", :http.request.configuration/output-deser-fn response-put-object-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-output))

(clojure.core/defn list-multipart-uploads ([list-multipart-uploads-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-list-multipart-uploads-request list-multipart-uploads-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-multipart-uploads-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?uploads", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-multipart-uploads-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListMultipartUploads", :http.request.configuration/output-deser-fn response-list-multipart-uploads-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-multipart-uploads :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-multipart-uploads-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-multipart-uploads-output))

(clojure.core/defn put-bucket-lifecycle-configuration ([put-bucket-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-lifecycle-configuration-request put-bucket-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketLifecycleConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-configuration-request) :ret clojure.core/true?)

(clojure.core/defn head-bucket ([head-bucket-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-head-bucket-request head-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/head-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.configuration/action "HeadBucket", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef head-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/head-bucket-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-inventory-configuration ([put-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-inventory-configuration-request put-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketInventoryConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-inventory-configuration-request) :ret clojure.core/true?)

(clojure.core/defn create-bucket ([create-bucket-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-create-bucket-request create-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/create-bucket-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/create-bucket-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateBucket", :http.request.configuration/output-deser-fn response-create-bucket-output, :http.request.spec/error-spec {"BucketAlreadyExists" :portkey.aws.s3.-2006-03-01/bucket-already-exists, "BucketAlreadyOwnedByYou" :portkey.aws.s3.-2006-03-01/bucket-already-owned-by-you}})))))
(clojure.spec.alpha/fdef create-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/create-bucket-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/create-bucket-output))

(clojure.core/defn put-object-acl ([put-object-acl-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-object-acl-request put-object-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutObjectAcl", :http.request.configuration/output-deser-fn response-put-object-acl-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef put-object-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-acl-output))

(clojure.core/defn put-bucket-notification ([put-bucket-notification-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-notification-request put-bucket-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-notification-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketNotification", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-notification :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-notification-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-analytics-configuration ([get-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-analytics-configuration-request get-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-analytics-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-output))

(clojure.core/defn complete-multipart-upload ([complete-multipart-upload-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-complete-multipart-upload-request complete-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/complete-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/complete-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CompleteMultipartUpload", :http.request.configuration/output-deser-fn response-complete-multipart-upload-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef complete-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/complete-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/complete-multipart-upload-output))

(clojure.core/defn abort-multipart-upload ([abort-multipart-upload-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-abort-multipart-upload-request abort-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/abort-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "AbortMultipartUpload", :http.request.configuration/output-deser-fn response-abort-multipart-upload-output, :http.request.spec/error-spec {"NoSuchUpload" :portkey.aws.s3.-2006-03-01/no-such-upload}})))))
(clojure.spec.alpha/fdef abort-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/abort-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output))

(clojure.core/defn put-bucket-request-payment ([put-bucket-request-payment-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-request-payment-request put-bucket-request-payment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?requestPayment", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-request-payment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketRequestPayment", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-request-payment :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-request-payment-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-analytics-configuration ([put-bucket-analytics-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-analytics-configuration-request put-bucket-analytics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-analytics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketAnalyticsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-analytics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn restore-object ([restore-object-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-restore-object-request restore-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/restore-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?restore", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/restore-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RestoreObject", :http.request.configuration/output-deser-fn response-restore-object-output, :http.request.spec/error-spec {"ObjectAlreadyInActiveTierError" :portkey.aws.s3.-2006-03-01/object-already-in-active-tier-error}})))))
(clojure.spec.alpha/fdef restore-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/restore-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/restore-object-output))

(clojure.core/defn get-bucket-tagging ([get-bucket-tagging-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-tagging-request get-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketTagging", :http.request.configuration/output-deser-fn response-get-bucket-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-tagging-output))

(clojure.core/defn get-bucket-notification ([get-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-notification-configuration-request get-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketNotification", :http.request.configuration/output-deser-fn response-notification-configuration-deprecated, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-notification :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated))

(clojure.core/defn head-object ([head-object-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-head-object-request head-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/head-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/head-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.configuration/action "HeadObject", :http.request.configuration/output-deser-fn response-head-object-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef head-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/head-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/head-object-output))

(clojure.core/defn delete-bucket-website ([delete-bucket-website-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-website-request delete-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketWebsite", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-website-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-website ([get-bucket-website-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-website-request get-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-website-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketWebsite", :http.request.configuration/output-deser-fn response-get-bucket-website-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-website-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-website-output))

(clojure.core/defn delete-bucket-replication ([delete-bucket-replication-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-replication-request delete-bucket-replication-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-replication-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketReplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-replication-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-metrics-configuration ([delete-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-metrics-configuration-request delete-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketMetricsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-metrics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn put-object-tagging ([put-object-tagging-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-object-tagging-request put-object-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutObjectTagging", :http.request.configuration/output-deser-fn response-put-object-tagging-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-tagging-output))

(clojure.core/defn list-buckets ([] (list-buckets {})) ([_] (clojure.core/let [request-function-result__32170__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-buckets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec nil, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBuckets", :http.request.configuration/output-deser-fn response-list-buckets-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-buckets :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-buckets-output))

(clojure.core/defn put-bucket-policy ([put-bucket-policy-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-policy-request put-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-policy-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-accelerate-configuration ([put-bucket-accelerate-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-accelerate-configuration-request put-bucket-accelerate-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?accelerate", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-accelerate-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketAccelerateConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-accelerate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-accelerate-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-acl ([get-bucket-acl-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-acl-request get-bucket-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketAcl", :http.request.configuration/output-deser-fn response-get-bucket-acl-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-acl-output))

(clojure.core/defn get-bucket-metrics-configuration ([get-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-metrics-configuration-request get-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketMetricsConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-metrics-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-output))

(clojure.core/defn get-bucket-cors ([get-bucket-cors-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-cors-request get-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-cors-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketCors", :http.request.configuration/output-deser-fn response-get-bucket-cors-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-cors-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-cors-output))

(clojure.core/defn create-multipart-upload ([create-multipart-upload-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-create-multipart-upload-request create-multipart-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/create-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?uploads", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/create-multipart-upload-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateMultipartUpload", :http.request.configuration/output-deser-fn response-create-multipart-upload-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/create-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/create-multipart-upload-output))

(clojure.core/defn delete-object ([delete-object-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-object-request delete-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteObject", :http.request.configuration/output-deser-fn response-delete-object-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-object-output))

(clojure.core/defn put-bucket-metrics-configuration ([put-bucket-metrics-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-metrics-configuration-request put-bucket-metrics-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-metrics-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketMetricsConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-metrics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-accelerate-configuration ([get-bucket-accelerate-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-accelerate-configuration-request get-bucket-accelerate-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?accelerate", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketAccelerateConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-accelerate-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-accelerate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-output))

(clojure.core/defn delete-bucket-tagging ([delete-bucket-tagging-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-tagging-request delete-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketTagging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-tagging-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-tagging ([put-bucket-tagging-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-tagging-request put-bucket-tagging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-tagging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketTagging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-tagging-request) :ret clojure.core/true?)

(clojure.core/defn list-parts ([list-parts-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-list-parts-request list-parts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-parts-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-parts-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListParts", :http.request.configuration/output-deser-fn response-list-parts-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-parts :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-parts-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-parts-output))

(clojure.core/defn get-object-acl ([get-object-acl-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-object-acl-request get-object-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetObjectAcl", :http.request.configuration/output-deser-fn response-get-object-acl-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef get-object-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-acl-output))

(clojure.core/defn upload-part-copy ([upload-part-copy-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-upload-part-copy-request upload-part-copy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/upload-part-copy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/upload-part-copy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UploadPartCopy", :http.request.configuration/output-deser-fn response-upload-part-copy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef upload-part-copy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/upload-part-copy-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/upload-part-copy-output))

(clojure.core/defn get-bucket-lifecycle-configuration ([get-bucket-lifecycle-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-lifecycle-configuration-request get-bucket-lifecycle-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketLifecycleConfiguration", :http.request.configuration/output-deser-fn response-get-bucket-lifecycle-configuration-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-output))

(clojure.core/defn delete-objects ([delete-objects-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-objects-request delete-objects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?delete", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-objects-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteObjects", :http.request.configuration/output-deser-fn response-delete-objects-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-objects :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-objects-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-objects-output))

(clojure.core/defn delete-bucket-inventory-configuration ([delete-bucket-inventory-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-inventory-configuration-request delete-bucket-inventory-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-inventory-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketInventoryConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-inventory-configuration-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-website ([put-bucket-website-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-website-request put-bucket-website-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-website-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketWebsite", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-website-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-location ([get-bucket-location-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-location-request get-bucket-location-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-location-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?location", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-location-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketLocation", :http.request.configuration/output-deser-fn response-get-bucket-location-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-location :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-location-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-location-output))

(clojure.core/defn get-bucket-encryption ([get-bucket-encryption-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-encryption-request get-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-encryption-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketEncryption", :http.request.configuration/output-deser-fn response-get-bucket-encryption-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-encryption-output))

(clojure.core/defn upload-part ([upload-part-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-upload-part-request upload-part-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/upload-part-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/upload-part-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UploadPart", :http.request.configuration/output-deser-fn response-upload-part-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef upload-part :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/upload-part-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/upload-part-output))

(clojure.core/defn get-bucket-lifecycle ([get-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-lifecycle-request get-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketLifecycle", :http.request.configuration/output-deser-fn response-get-bucket-lifecycle-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-output))

(clojure.core/defn copy-object ([copy-object-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-copy-object-request copy-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/copy-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/copy-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "CopyObject", :http.request.configuration/output-deser-fn response-copy-object-output, :http.request.spec/error-spec {"ObjectNotInActiveTierError" :portkey.aws.s3.-2006-03-01/object-not-in-active-tier-error}})))))
(clojure.spec.alpha/fdef copy-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/copy-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/copy-object-output))

(clojure.core/defn put-bucket-lifecycle ([put-bucket-lifecycle-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-lifecycle-request put-bucket-lifecycle-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketLifecycle", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-notification-configuration ([put-bucket-notification-configuration-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-notification-configuration-request put-bucket-notification-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-notification-configuration-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketNotificationConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-notification-configuration-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-policy ([delete-bucket-policy-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-policy-request delete-bucket-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-bucket-analytics-configurations ([list-bucket-analytics-configurations-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-list-bucket-analytics-configurations-request list-bucket-analytics-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBucketAnalyticsConfigurations", :http.request.configuration/output-deser-fn response-list-bucket-analytics-configurations-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-analytics-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-output))

(clojure.core/defn get-bucket-versioning ([get-bucket-versioning-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-bucket-versioning-request get-bucket-versioning-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-versioning-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versioning", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-versioning-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBucketVersioning", :http.request.configuration/output-deser-fn response-get-bucket-versioning-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-versioning :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-versioning-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-versioning-output))

(clojure.core/defn put-bucket-cors ([put-bucket-cors-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-cors-request put-bucket-cors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-cors-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketCors", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-cors-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-encryption ([delete-bucket-encryption-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-delete-bucket-encryption-request delete-bucket-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBucketEncryption", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-encryption-request) :ret clojure.core/true?)

(clojure.core/defn select-object-content ([select-object-content-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-select-object-content-request select-object-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/select-object-content-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?select&select-type=2", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/select-object-content-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SelectObjectContent", :http.request.configuration/output-deser-fn response-select-object-content-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef select-object-content :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/select-object-content-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/select-object-content-output))

(clojure.core/defn get-object ([get-object-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-get-object-request get-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetObject", :http.request.configuration/output-deser-fn response-get-object-output, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef get-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-output))

(clojure.core/defn put-bucket-logging ([put-bucket-logging-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-logging-request put-bucket-logging-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?logging", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-logging-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketLogging", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-logging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-logging-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-acl ([put-bucket-acl-requestinput] (clojure.core/let [request-function-result__32170__auto__ (req-put-bucket-acl-request put-bucket-acl-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__32170__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?acl", :http.request.configuration/version "2006-03-01", :http.request.configuration/service-id "S3", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-acl-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutBucketAcl", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__32169__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-acl-request) :ret clojure.core/true?)
