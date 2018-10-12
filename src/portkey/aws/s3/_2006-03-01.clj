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

(clojure.core/declare ser-mfadelete)

(clojure.core/declare ser-metrics-configuration)

(clojure.core/declare ser-cloud-function-invocation-role)

(clojure.core/declare ser-input-serialization)

(clojure.core/declare ser-tier)

(clojure.core/declare ser-content-encoding)

(clojure.core/declare ser-confirm-remove-self-bucket-access)

(clojure.core/declare ser-compression-type)

(clojure.core/declare ser-tagging-directive)

(clojure.core/declare ser-tag-set)

(clojure.core/declare ser-ssecustomer-keymd5)

(clojure.core/declare ser-routing-rules)

(clojure.core/declare ser-expired-object-delete-marker)

(clojure.core/declare ser-response-expires)

(clojure.core/declare ser-replica-kms-keyid)

(clojure.core/declare ser-completed-part)

(clojure.core/declare ser-notification-id)

(clojure.core/declare ser-copy-sourcessecustomer-key)

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

(clojure.core/declare ser-jsonoutput)

(clojure.core/declare ser-server-side-encryption-configuration)

(clojure.core/declare ser-target-grant)

(clojure.core/declare ser-replication-configuration)

(clojure.core/declare ser-completed-part-list)

(clojure.core/declare ser-comments)

(clojure.core/declare ser-ssecustomer-algorithm)

(clojure.core/declare ser-inventory-schedule)

(clojure.core/declare ser-transition)

(clojure.core/declare ser-metadata-directive)

(clojure.core/declare ser-analytics-export-destination)

(clojure.core/declare ser-ssecustomer-key)

(clojure.core/declare ser-contentmd5)

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

(clojure.core/declare ser-grant-readacp)

(clojure.core/declare ser-jsoninput)

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

(clojure.core/declare ser-analyticss3-bucket-destination)

(clojure.core/declare ser-noncurrent-version-transition-list)

(clojure.core/declare ser-event-list)

(clojure.core/declare ser-expression)

(clojure.core/declare ser-server-side-encryption)

(clojure.core/declare ser-if-modified-since)

(clojure.core/declare ser-mfa)

(clojure.core/declare ser-event)

(clojure.core/declare ser-bucket-cannedacl)

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

(clojure.core/declare ser-etag)

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

(clojure.core/declare ser-corsrule)

(clojure.core/declare ser-grant)

(clojure.core/declare ser-corsconfiguration)

(clojure.core/declare ser-content-length)

(clojure.core/declare ser-topic-configuration)

(clojure.core/declare ser-is-enabled)

(clojure.core/declare ser-field-delimiter)

(clojure.core/declare ser-inventorys3-bucket-destination)

(clojure.core/declare ser-csvoutput)

(clojure.core/declare ser-metadata-entry)

(clojure.core/declare ser-copy-source-if-none-match)

(clojure.core/declare ser-id)

(clojure.core/declare ser-inventory-frequency)

(clojure.core/declare ser-value)

(clojure.core/declare ser-expose-headers)

(clojure.core/declare ser-transition-list)

(clojure.core/declare ser-analytics-filter)

(clojure.core/declare ser-analyticss3-export-file-format)

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

(clojure.core/declare ser-jsontype)

(clojure.core/declare ser-filter-rule)

(clojure.core/declare ser-replication-rules)

(clojure.core/declare ser-s3-key-filter)

(clojure.core/declare ser-target-bucket)

(clojure.core/declare ser-notification-configuration-deprecated)

(clojure.core/declare ser-copy-source-if-modified-since)

(clojure.core/declare ser-replace-key-with)

(clojure.core/declare ser-kmscontext)

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

(clojure.core/declare ser-s3-location)

(clojure.core/declare ser-copy-source-if-unmodified-since)

(clojure.core/declare ser-http-redirect-code)

(clojure.core/declare ser-uri)

(clojure.core/declare ser-object-cannedacl)

(clojure.core/declare ser-inventory-optional-fields)

(clojure.core/declare ser-owner)

(clojure.core/declare ser-replication-rule-status)

(clojure.core/declare ser-days)

(clojure.core/declare ser-copy-sourcessecustomer-algorithm)

(clojure.core/declare ser-object-identifier)

(clojure.core/declare ser-lifecycle-configuration)

(clojure.core/declare ser-grant-write)

(clojure.core/declare ser-storage-class-analysis-data-export)

(clojure.core/declare ser-quote-escape-character)

(clojure.core/declare ser-corsrules)

(clojure.core/declare ser-copy-sourcessecustomer-keymd5)

(clojure.core/declare ser-metadata)

(clojure.core/declare ser-cache-control)

(clojure.core/declare ser-content-language)

(clojure.core/declare ser-bucket-lifecycle-configuration)

(clojure.core/declare ser-object-identifier-list)

(clojure.core/declare ser-policy)

(clojure.core/declare ser-delimiter)

(clojure.core/declare ser-encryption)

(clojure.core/declare ser-grant-writeacp)

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

(clojure.core/declare ser-sses3)

(clojure.core/declare ser-max-age-seconds)

(clojure.core/declare ser-email-address)

(clojure.core/declare ser-bucket-location-constraint)

(clojure.core/declare ser-ssekmskey-id)

(clojure.core/declare ser-allowed-origin)

(clojure.core/declare ser-token)

(clojure.core/declare ser-accelerate-configuration)

(clojure.core/declare ser-lambda-function-configuration)

(clojure.core/declare ser-csvinput)

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

(clojure.core/defn ser-mfadelete [input] input)

(clojure.core/defn ser-metrics-configuration [input] {"Id" (ser-metrics-id (:id input)), "Filter" (ser-metrics-filter (:filter input))})

(clojure.core/defn ser-cloud-function-invocation-role [input] input)

(clojure.core/defn ser-input-serialization [input] {"CSV" (ser-csvinput (:csv input)), "CompressionType" (ser-compression-type (:compression-type input)), "JSON" (ser-jsoninput (:json input)), "Parquet" (ser-parquet-input (:parquet input))})

(clojure.core/defn ser-tier [input] input)

(clojure.core/defn ser-content-encoding [input] input)

(clojure.core/defn ser-confirm-remove-self-bucket-access [input] input)

(clojure.core/defn ser-compression-type [input] input)

(clojure.core/defn ser-tagging-directive [input] input)

(clojure.core/defn ser-tag-set [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-ssecustomer-keymd5 [input] input)

(clojure.core/defn ser-routing-rules [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-expired-object-delete-marker [input] input)

(clojure.core/defn ser-response-expires [input] input)

(clojure.core/defn ser-replica-kms-keyid [input] input)

(clojure.core/defn ser-completed-part [input] {"ETag" (ser-etag (:etag input)), "PartNumber" (ser-part-number (:part-number input))})

(clojure.core/defn ser-notification-id [input] input)

(clojure.core/defn ser-copy-sourcessecustomer-key [input] input)

(clojure.core/defn ser-versioning-configuration [input] {"MFADelete" (ser-mfadelete (:mfadelete input)), "Status" (ser-bucket-versioning-status (:status input))})

(clojure.core/defn ser-if-unmodified-since [input] input)

(clojure.core/defn ser-response-content-disposition [input] input)

(clojure.core/defn ser-filter-rule-name [input] input)

(clojure.core/defn ser-inventory-id [input] input)

(clojure.core/defn ser-topic-configuration-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-access-control-translation [input] {"Owner" (ser-owner-override (:owner input))})

(clojure.core/defn ser-topic-configuration-deprecated [input] {"Id" (ser-notification-id (:id input)), "Events" (ser-event-list (:events input)), "Event" (ser-event (:event input)), "Topic" (ser-topic-arn (:topic input))})

(clojure.core/defn ser-glacier-job-parameters [input] {"Tier" (ser-tier (:tier input))})

(clojure.core/defn ser-website-redirect-location [input] input)

(clojure.core/defn ser-prefix [input] input)

(clojure.core/defn ser-type [input] input)

(clojure.core/defn ser-storage-class-analysis-schema-version [input] input)

(clojure.core/defn ser-encoding-type [input] input)

(clojure.core/defn ser-sse-kms-encrypted-objects-status [input] input)

(clojure.core/defn ser-create-bucket-configuration [input] {"LocationConstraint" (ser-bucket-location-constraint (:location-constraint input))})

(clojure.core/defn ser-encryption-configuration [input] {"ReplicaKmsKeyID" (ser-replica-kms-keyid (:replica-kms-keyid input))})

(clojure.core/defn ser-inventory-filter [input] {"Prefix" (ser-prefix (:prefix input))})

(clojure.core/defn ser-cloud-function-configuration [input] {"Id" (ser-notification-id (:id input)), "Event" (ser-event (:event input)), "Events" (ser-event-list (:events input)), "CloudFunction" (ser-cloud-function (:cloud-function input)), "InvocationRole" (ser-cloud-function-invocation-role (:invocation-role input))})

(clojure.core/defn ser-request-payment-configuration [input] {"Payer" (ser-payer (:payer input))})

(clojure.core/defn ser-inventory-optional-field [input] input)

(clojure.core/defn ser-permission [input] input)

(clojure.core/defn ser-response-content-language [input] input)

(clojure.core/defn ser-jsonoutput [input] {"RecordDelimiter" (ser-record-delimiter (:record-delimiter input))})

(clojure.core/defn ser-server-side-encryption-configuration [input] {"Rules" (ser-server-side-encryption-rules (:rules input))})

(clojure.core/defn ser-target-grant [input] {"Grantee" (ser-grantee (:grantee input)), "Permission" (ser-bucket-logs-permission (:permission input))})

(clojure.core/defn ser-replication-configuration [input] {"Role" (ser-role (:role input)), "Rules" (ser-replication-rules (:rules input))})

(clojure.core/defn ser-completed-part-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-comments [input] input)

(clojure.core/defn ser-ssecustomer-algorithm [input] input)

(clojure.core/defn ser-inventory-schedule [input] {"Frequency" (ser-inventory-frequency (:frequency input))})

(clojure.core/defn ser-transition [input] {"Date" (ser-date (:date input)), "Days" (ser-days (:days input)), "StorageClass" (ser-transition-storage-class (:storage-class input))})

(clojure.core/defn ser-metadata-directive [input] input)

(clojure.core/defn ser-analytics-export-destination [input] {"S3BucketDestination" (ser-analyticss3-bucket-destination (:s3-bucket-destination input))})

(clojure.core/defn ser-ssecustomer-key [input] input)

(clojure.core/defn ser-contentmd5 [input] input)

(clojure.core/defn ser-storage-class-analysis [input] {"DataExport" (ser-storage-class-analysis-data-export (:data-export input))})

(clojure.core/defn ser-expose-header [input] input)

(clojure.core/defn ser-body [input] input)

(clojure.core/defn ser-delete-marker-replication-status [input] input)

(clojure.core/defn ser-allow-quoted-record-delimiter [input] input)

(clojure.core/defn ser-grants [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-transition-storage-class [input] input)

(clojure.core/defn ser-lifecycle-rule-filter [input] {"Prefix" (ser-prefix (:prefix input)), "Tag" (ser-tag (:tag input)), "And" (ser-lifecycle-rule-and-operator (:and input))})

(clojure.core/defn ser-payer [input] input)

(clojure.core/defn ser-response-content-type [input] input)

(clojure.core/defn ser-metrics-filter [input] {"Prefix" (ser-prefix (:prefix input)), "Tag" (ser-tag (:tag input)), "And" (ser-metrics-and-operator (:and input))})

(clojure.core/defn ser-inventory-destination [input] {"S3BucketDestination" (ser-inventorys3-bucket-destination (:s3-bucket-destination input))})

(clojure.core/defn ser-object-version-id [input] input)

(clojure.core/defn ser-grant-readacp [input] input)

(clojure.core/defn ser-jsoninput [input] {"Type" (ser-jsontype (:type input))})

(clojure.core/defn ser-days-after-initiation [input] input)

(clojure.core/defn ser-restore-request [input] {"Days" (ser-days (:days input)), "GlacierJobParameters" (ser-glacier-job-parameters (:glacier-job-parameters input)), "Type" (ser-restore-request-type (:type input)), "Tier" (ser-tier (:tier input)), "Description" (ser-description (:description input)), "SelectParameters" (ser-select-parameters (:select-parameters input)), "OutputLocation" (ser-output-location (:output-location input))})

(clojure.core/defn ser-replication-rule-filter [input] {"Prefix" (ser-prefix (:prefix input)), "Tag" (ser-tag (:tag input)), "And" (ser-replication-rule-and-operator (:and input))})

(clojure.core/defn ser-start-after [input] input)

(clojure.core/defn ser-inventory-encryption [input] {"SSES3" (ser-sses3 (:sses3 input)), "SSEKMS" (ser-ssekms (:ssekms input))})

(clojure.core/defn ser-record-delimiter [input] input)

(clojure.core/defn ser-replace-key-prefix-with [input] input)

(clojure.core/defn ser-metrics-and-operator [input] {"Prefix" (ser-prefix (:prefix input)), "Tags" (ser-tag-set (:tags input))})

(clojure.core/defn ser-lifecycle-rule [input] {"Filter" (ser-lifecycle-rule-filter (:filter input)), "Prefix" (ser-prefix (:prefix input)), "Status" (ser-expiration-status (:status input)), "Transitions" (ser-transition-list (:transitions input)), "ID" (ser-id (:id input)), "NoncurrentVersionExpiration" (ser-noncurrent-version-expiration (:noncurrent-version-expiration input)), "AbortIncompleteMultipartUpload" (ser-abort-incomplete-multipart-upload (:abort-incomplete-multipart-upload input)), "NoncurrentVersionTransitions" (ser-noncurrent-version-transition-list (:noncurrent-version-transitions input)), "Expiration" (ser-lifecycle-expiration (:expiration input))})

(clojure.core/defn ser-marker [input] input)

(clojure.core/defn ser-analytics-and-operator [input] {"Prefix" (ser-prefix (:prefix input)), "Tags" (ser-tag-set (:tags input))})

(clojure.core/defn ser-lambda-function-configuration-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-source-selection-criteria [input] {"SseKmsEncryptedObjects" (ser-sse-kms-encrypted-objects (:sse-kms-encrypted-objects input))})

(clojure.core/defn ser-access-control-policy [input] {"Grants" (ser-grants (:grants input)), "Owner" (ser-owner (:owner input))})

(clojure.core/defn ser-destination [input] {"Bucket" (ser-bucket-name (:bucket input)), "Account" (ser-account-id (:account input)), "StorageClass" (ser-storage-class (:storage-class input)), "AccessControlTranslation" (ser-access-control-translation (:access-control-translation input)), "EncryptionConfiguration" (ser-encryption-configuration (:encryption-configuration input))})

(clojure.core/defn ser-max-parts [input] input)

(clojure.core/defn ser-expiration-status [input] input)

(clojure.core/defn ser-metadata-key [input] input)

(clojure.core/defn ser-filter-rule-value [input] input)

(clojure.core/defn ser-filter-rule-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-grant-read [input] input)

(clojure.core/defn ser-analyticss3-bucket-destination [input] {"Format" (ser-analyticss3-export-file-format (:format input)), "BucketAccountId" (ser-account-id (:bucket-account-id input)), "Bucket" (ser-bucket-name (:bucket input)), "Prefix" (ser-prefix (:prefix input))})

(clojure.core/defn ser-noncurrent-version-transition-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-event-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-expression [input] input)

(clojure.core/defn ser-server-side-encryption [input] input)

(clojure.core/defn ser-if-modified-since [input] input)

(clojure.core/defn ser-mfa [input] input)

(clojure.core/defn ser-event [input] input)

(clojure.core/defn ser-bucket-cannedacl [input] input)

(clojure.core/defn ser-quote-character [input] input)

(clojure.core/defn ser-restore-request-type [input] input)

(clojure.core/defn ser-quiet [input] input)

(clojure.core/defn ser-content-disposition [input] input)

(clojure.core/defn ser-error-document [input] {"Key" (ser-object-key (:key input))})

(clojure.core/defn ser-redirect [input] {"HostName" (ser-host-name (:host-name input)), "HttpRedirectCode" (ser-http-redirect-code (:http-redirect-code input)), "Protocol" (ser-protocol (:protocol input)), "ReplaceKeyPrefixWith" (ser-replace-key-prefix-with (:replace-key-prefix-with input)), "ReplaceKeyWith" (ser-replace-key-with (:replace-key-with input))})

(clojure.core/defn ser-output-serialization [input] {"CSV" (ser-csvoutput (:csv input)), "JSON" (ser-jsonoutput (:json input))})

(clojure.core/defn ser-priority [input] input)

(clojure.core/defn ser-bucket-logs-permission [input] input)

(clojure.core/defn ser-analytics-id [input] input)

(clojure.core/defn ser-copy-source-if-match [input] input)

(clojure.core/defn ser-http-error-code-returned-equals [input] input)

(clojure.core/defn ser-user-metadata [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-upload-id-marker [input] input)

(clojure.core/defn ser-part-number [input] input)

(clojure.core/defn ser-logging-enabled [input] {"TargetBucket" (ser-target-bucket (:target-bucket input)), "TargetGrants" (ser-target-grants (:target-grants input)), "TargetPrefix" (ser-target-prefix (:target-prefix input))})

(clojure.core/defn ser-date [input] input)

(clojure.core/defn ser-inventory-configuration [input] {"Destination" (ser-inventory-destination (:destination input)), "IsEnabled" (ser-is-enabled (:is-enabled input)), "Filter" (ser-inventory-filter (:filter input)), "Id" (ser-inventory-id (:id input)), "IncludedObjectVersions" (ser-inventory-included-object-versions (:included-object-versions input)), "OptionalFields" (ser-inventory-optional-fields (:optional-fields input)), "Schedule" (ser-inventory-schedule (:schedule input))})

(clojure.core/defn ser-allowed-methods [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-etag [input] input)

(clojure.core/defn ser-copy-source-range [input] input)

(clojure.core/defn ser-max-uploads [input] input)

(clojure.core/defn ser-replication-rule-and-operator [input] {"Prefix" (ser-prefix (:prefix input)), "Tags" (ser-tag-set (:tags input))})

(clojure.core/defn ser-metrics-id [input] input)

(clojure.core/defn ser-owner-override [input] input)

(clojure.core/defn ser-multipart-upload-id [input] input)

(clojure.core/defn ser-delete [input] {"Objects" (ser-object-identifier-list (:objects input)), "Quiet" (ser-quiet (:quiet input))})

(clojure.core/defn ser-metadata-value [input] input)

(clojure.core/defn ser-bucket-logging-status [input] {"LoggingEnabled" (ser-logging-enabled (:logging-enabled input))})

(clojure.core/defn ser-bucket-versioning-status [input] input)

(clojure.core/defn ser-content-type [input] input)

(clojure.core/defn ser-range [input] input)

(clojure.core/defn ser-inventory-included-object-versions [input] input)

(clojure.core/defn ser-if-match [input] input)

(clojure.core/defn ser-role [input] input)

(clojure.core/defn ser-server-side-encryption-by-default [input] {"SSEAlgorithm" (ser-server-side-encryption (:ssealgorithm input)), "KMSMasterKeyID" (ser-ssekmskey-id (:kmsmaster-keyid input))})

(clojure.core/defn ser-display-name [input] input)

(clojure.core/defn ser-corsrule [input] {"AllowedHeaders" (ser-allowed-headers (:allowed-headers input)), "AllowedMethods" (ser-allowed-methods (:allowed-methods input)), "AllowedOrigins" (ser-allowed-origins (:allowed-origins input)), "ExposeHeaders" (ser-expose-headers (:expose-headers input)), "MaxAgeSeconds" (ser-max-age-seconds (:max-age-seconds input))})

(clojure.core/defn ser-grant [input] {"Grantee" (ser-grantee (:grantee input)), "Permission" (ser-permission (:permission input))})

(clojure.core/defn ser-corsconfiguration [input] {"CORSRules" (ser-corsrules (:corsrules input))})

(clojure.core/defn ser-content-length [input] input)

(clojure.core/defn ser-topic-configuration [input] {"Id" (ser-notification-id (:id input)), "TopicArn" (ser-topic-arn (:topic-arn input)), "Events" (ser-event-list (:events input)), "Filter" (ser-notification-configuration-filter (:filter input))})

(clojure.core/defn ser-is-enabled [input] input)

(clojure.core/defn ser-field-delimiter [input] input)

(clojure.core/defn ser-inventorys3-bucket-destination [input] {"AccountId" (ser-account-id (:account-id input)), "Bucket" (ser-bucket-name (:bucket input)), "Format" (ser-inventory-format (:format input)), "Prefix" (ser-prefix (:prefix input)), "Encryption" (ser-inventory-encryption (:encryption input))})

(clojure.core/defn ser-csvoutput [input] {"QuoteFields" (ser-quote-fields (:quote-fields input)), "QuoteEscapeCharacter" (ser-quote-escape-character (:quote-escape-character input)), "RecordDelimiter" (ser-record-delimiter (:record-delimiter input)), "FieldDelimiter" (ser-field-delimiter (:field-delimiter input)), "QuoteCharacter" (ser-quote-character (:quote-character input))})

(clojure.core/defn ser-metadata-entry [input] {"Name" (ser-metadata-key (:name input)), "Value" (ser-metadata-value (:value input))})

(clojure.core/defn ser-copy-source-if-none-match [input] input)

(clojure.core/defn ser-id [input] input)

(clojure.core/defn ser-inventory-frequency [input] input)

(clojure.core/defn ser-value [input] input)

(clojure.core/defn ser-expose-headers [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-transition-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-analytics-filter [input] {"Prefix" (ser-prefix (:prefix input)), "Tag" (ser-tag (:tag input)), "And" (ser-analytics-and-operator (:and input))})

(clojure.core/defn ser-analyticss3-export-file-format [input] input)

(clojure.core/defn ser-version-id-marker [input] input)

(clojure.core/defn ser-description [input] input)

(clojure.core/defn ser-object-key [input] input)

(clojure.core/defn ser-allowed-method [input] input)

(clojure.core/defn ser-bucket-accelerate-status [input] input)

(clojure.core/defn ser-lambda-function-arn [input] input)

(clojure.core/defn ser-protocol [input] input)

(clojure.core/defn ser-replication-rule [input] {"ID" (ser-id (:id input)), "Priority" (ser-priority (:priority input)), "Prefix" (ser-prefix (:prefix input)), "Filter" (ser-replication-rule-filter (:filter input)), "Status" (ser-replication-rule-status (:status input)), "SourceSelectionCriteria" (ser-source-selection-criteria (:source-selection-criteria input)), "Destination" (ser-destination (:destination input)), "DeleteMarkerReplication" (ser-delete-marker-replication (:delete-marker-replication input))})

(clojure.core/defn ser-redirect-all-requests-to [input] {"HostName" (ser-host-name (:host-name input)), "Protocol" (ser-protocol (:protocol input))})

(clojure.core/defn ser-target-grants [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-completed-multipart-upload [input] {"Parts" (ser-completed-part-list (:parts input))})

(clojure.core/defn ser-jsontype [input] input)

(clojure.core/defn ser-filter-rule [input] {"Name" (ser-filter-rule-name (:name input)), "Value" (ser-filter-rule-value (:value input))})

(clojure.core/defn ser-replication-rules [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-s3-key-filter [input] {"FilterRules" (ser-filter-rule-list (:filter-rules input))})

(clojure.core/defn ser-target-bucket [input] input)

(clojure.core/defn ser-notification-configuration-deprecated [input] {"TopicConfiguration" (ser-topic-configuration-deprecated (:topic-configuration input)), "QueueConfiguration" (ser-queue-configuration-deprecated (:queue-configuration input)), "CloudFunctionConfiguration" (ser-cloud-function-configuration (:cloud-function-configuration input))})

(clojure.core/defn ser-copy-source-if-modified-since [input] input)

(clojure.core/defn ser-replace-key-with [input] input)

(clojure.core/defn ser-kmscontext [input] input)

(clojure.core/defn ser-part-number-marker [input] input)

(clojure.core/defn ser-account-id [input] input)

(clojure.core/defn ser-notification-configuration-filter [input] {"Key" (ser-s3-key-filter (:key input))})

(clojure.core/defn ser-topic-arn [input] input)

(clojure.core/defn ser-suffix [input] input)

(clojure.core/defn ser-lifecycle-rule-and-operator [input] {"Prefix" (ser-prefix (:prefix input)), "Tags" (ser-tag-set (:tags input))})

(clojure.core/defn ser-allowed-header [input] input)

(clojure.core/defn ser-rule [input] {"Expiration" (ser-lifecycle-expiration (:expiration input)), "ID" (ser-id (:id input)), "Prefix" (ser-prefix (:prefix input)), "Status" (ser-expiration-status (:status input)), "Transition" (ser-transition (:transition input)), "NoncurrentVersionTransition" (ser-noncurrent-version-transition (:noncurrent-version-transition input)), "NoncurrentVersionExpiration" (ser-noncurrent-version-expiration (:noncurrent-version-expiration input)), "AbortIncompleteMultipartUpload" (ser-abort-incomplete-multipart-upload (:abort-incomplete-multipart-upload input))})

(clojure.core/defn ser-routing-rule [input] {"Condition" (ser-condition (:condition input)), "Redirect" (ser-redirect (:redirect input))})

(clojure.core/defn ser-noncurrent-version-expiration [input] {"NoncurrentDays" (ser-days (:noncurrent-days input))})

(clojure.core/defn ser-location-prefix [input] input)

(clojure.core/defn ser-delete-marker-replication [input] {"Status" (ser-delete-marker-replication-status (:status input))})

(clojure.core/defn ser-select-parameters [input] {"InputSerialization" (ser-input-serialization (:input-serialization input)), "ExpressionType" (ser-expression-type (:expression-type input)), "Expression" (ser-expression (:expression input)), "OutputSerialization" (ser-output-serialization (:output-serialization input))})

(clojure.core/defn ser-tagging-header [input] input)

(clojure.core/defn ser-ssekms [input] {"KeyId" (ser-ssekmskey-id (:key-id input))})

(clojure.core/defn ser-enable-request-progress [input] input)

(clojure.core/defn ser-abort-incomplete-multipart-upload [input] {"DaysAfterInitiation" (ser-days-after-initiation (:days-after-initiation input))})

(clojure.core/defn ser-request-progress [input] {"Enabled" (ser-enable-request-progress (:enabled input))})

(clojure.core/defn ser-s3-location [input] {"BucketName" (ser-bucket-name (:bucket-name input)), "Prefix" (ser-location-prefix (:prefix input)), "Encryption" (ser-encryption (:encryption input)), "CannedACL" (ser-object-cannedacl (:cannedacl input)), "AccessControlList" (ser-grants (:access-control-list input)), "Tagging" (ser-tagging (:tagging input)), "UserMetadata" (ser-user-metadata (:user-metadata input)), "StorageClass" (ser-storage-class (:storage-class input))})

(clojure.core/defn ser-copy-source-if-unmodified-since [input] input)

(clojure.core/defn ser-http-redirect-code [input] input)

(clojure.core/defn ser-uri [input] input)

(clojure.core/defn ser-object-cannedacl [input] input)

(clojure.core/defn ser-inventory-optional-fields [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-owner [input] {"DisplayName" (ser-display-name (:display-name input)), "ID" (ser-id (:id input))})

(clojure.core/defn ser-replication-rule-status [input] input)

(clojure.core/defn ser-days [input] input)

(clojure.core/defn ser-copy-sourcessecustomer-algorithm [input] input)

(clojure.core/defn ser-object-identifier [input] {"Key" (ser-object-key (:key input)), "VersionId" (ser-object-version-id (:version-id input))})

(clojure.core/defn ser-lifecycle-configuration [input] {"Rules" (ser-rules (:rules input))})

(clojure.core/defn ser-grant-write [input] input)

(clojure.core/defn ser-storage-class-analysis-data-export [input] {"OutputSchemaVersion" (ser-storage-class-analysis-schema-version (:output-schema-version input)), "Destination" (ser-analytics-export-destination (:destination input))})

(clojure.core/defn ser-quote-escape-character [input] input)

(clojure.core/defn ser-corsrules [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-copy-sourcessecustomer-keymd5 [input] input)

(clojure.core/defn ser-metadata [input] input)

(clojure.core/defn ser-cache-control [input] input)

(clojure.core/defn ser-content-language [input] input)

(clojure.core/defn ser-bucket-lifecycle-configuration [input] {"Rules" (ser-lifecycle-rules (:rules input))})

(clojure.core/defn ser-object-identifier-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-policy [input] input)

(clojure.core/defn ser-delimiter [input] input)

(clojure.core/defn ser-encryption [input] {"EncryptionType" (ser-server-side-encryption (:encryption-type input)), "KMSKeyId" (ser-ssekmskey-id (:kmskey-id input)), "KMSContext" (ser-kmscontext (:kmscontext input))})

(clojure.core/defn ser-grant-writeacp [input] input)

(clojure.core/defn ser-tag [input] {"Key" (ser-object-key (:key input)), "Value" (ser-value (:value input))})

(clojure.core/defn ser-condition [input] {"HttpErrorCodeReturnedEquals" (ser-http-error-code-returned-equals (:http-error-code-returned-equals input)), "KeyPrefixEquals" (ser-key-prefix-equals (:key-prefix-equals input))})

(clojure.core/defn ser-fetch-owner [input] input)

(clojure.core/defn ser-expression-type [input] input)

(clojure.core/defn ser-grant-full-control [input] input)

(clojure.core/defn ser-queue-arn [input] input)

(clojure.core/defn ser-response-content-encoding [input] input)

(clojure.core/defn ser-target-prefix [input] input)

(clojure.core/defn ser-website-configuration [input] {"ErrorDocument" (ser-error-document (:error-document input)), "IndexDocument" (ser-index-document (:index-document input)), "RedirectAllRequestsTo" (ser-redirect-all-requests-to (:redirect-all-requests-to input)), "RoutingRules" (ser-routing-rules (:routing-rules input))})

(clojure.core/defn ser-server-side-encryption-rules [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-notification-configuration [input] {"TopicConfigurations" (ser-topic-configuration-list (:topic-configurations input)), "QueueConfigurations" (ser-queue-configuration-list (:queue-configurations input)), "LambdaFunctionConfigurations" (ser-lambda-function-configuration-list (:lambda-function-configurations input))})

(clojure.core/defn ser-queue-configuration [input] {"Id" (ser-notification-id (:id input)), "QueueArn" (ser-queue-arn (:queue-arn input)), "Events" (ser-event-list (:events input)), "Filter" (ser-notification-configuration-filter (:filter input))})

(clojure.core/defn ser-tagging [input] {"TagSet" (ser-tag-set (:tag-set input))})

(clojure.core/defn ser-host-name [input] input)

(clojure.core/defn ser-if-none-match [input] input)

(clojure.core/defn ser-storage-class [input] input)

(clojure.core/defn ser-server-side-encryption-rule [input] {"ApplyServerSideEncryptionByDefault" (ser-server-side-encryption-by-default (:apply-server-side-encryption-by-default input))})

(clojure.core/defn ser-rules [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-lifecycle-expiration [input] {"Date" (ser-date (:date input)), "Days" (ser-days (:days input)), "ExpiredObjectDeleteMarker" (ser-expired-object-delete-marker (:expired-object-delete-marker input))})

(clojure.core/defn ser-inventory-format [input] input)

(clojure.core/defn ser-queue-configuration-list [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-grantee [input] {"DisplayName" (ser-display-name (:display-name input)), "EmailAddress" (ser-email-address (:email-address input)), "ID" (ser-id (:id input)), "Type" (ser-type (:type input)), "URI" (ser-uri (:uri input))})

(clojure.core/defn ser-key-prefix-equals [input] input)

(clojure.core/defn ser-file-header-info [input] input)

(clojure.core/defn ser-output-location [input] {"S3" (ser-s3-location (:s3 input))})

(clojure.core/defn ser-allowed-headers [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-allowed-origins [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-bucket-name [input] input)

(clojure.core/defn ser-copy-source [input] input)

(clojure.core/defn ser-queue-configuration-deprecated [input] {"Id" (ser-notification-id (:id input)), "Event" (ser-event (:event input)), "Events" (ser-event-list (:events input)), "Queue" (ser-queue-arn (:queue input))})

(clojure.core/defn ser-expires [input] input)

(clojure.core/defn ser-max-keys [input] input)

(clojure.core/defn ser-lifecycle-rules [input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__99363__auto__ item__99364__auto__] [(clojure.core/str "member." (clojure.core/inc idx__99363__auto__)) item__99364__auto__]) input)))

(clojure.core/defn ser-sses3 [input] {})

(clojure.core/defn ser-max-age-seconds [input] input)

(clojure.core/defn ser-email-address [input] input)

(clojure.core/defn ser-bucket-location-constraint [input] input)

(clojure.core/defn ser-ssekmskey-id [input] input)

(clojure.core/defn ser-allowed-origin [input] input)

(clojure.core/defn ser-token [input] input)

(clojure.core/defn ser-accelerate-configuration [input] {"Status" (ser-bucket-accelerate-status (:status input))})

(clojure.core/defn ser-lambda-function-configuration [input] {"Id" (ser-notification-id (:id input)), "LambdaFunctionArn" (ser-lambda-function-arn (:lambda-function-arn input)), "Events" (ser-event-list (:events input)), "Filter" (ser-notification-configuration-filter (:filter input))})

(clojure.core/defn ser-csvinput [input] {"FileHeaderInfo" (ser-file-header-info (:file-header-info input)), "Comments" (ser-comments (:comments input)), "QuoteEscapeCharacter" (ser-quote-escape-character (:quote-escape-character input)), "RecordDelimiter" (ser-record-delimiter (:record-delimiter input)), "FieldDelimiter" (ser-field-delimiter (:field-delimiter input)), "QuoteCharacter" (ser-quote-character (:quote-character input)), "AllowQuotedRecordDelimiter" (ser-allow-quoted-record-delimiter (:allow-quoted-record-delimiter input))})

(clojure.core/defn ser-noncurrent-version-transition [input] {"NoncurrentDays" (ser-days (:noncurrent-days input)), "StorageClass" (ser-transition-storage-class (:storage-class input))})

(clojure.core/defn ser-quote-fields [input] input)

(clojure.core/defn ser-index-document [input] {"Suffix" (ser-suffix (:suffix input))})

(clojure.core/defn ser-key-marker [input] input)

(clojure.core/defn ser-parquet-input [input] {})

(clojure.core/defn ser-analytics-configuration [input] {"Id" (ser-analytics-id (:id input)), "Filter" (ser-analytics-filter (:filter input)), "StorageClassAnalysis" (ser-storage-class-analysis (:storage-class-analysis input))})

(clojure.core/defn ser-cloud-function [input] input)

(clojure.core/defn ser-request-payer [input] input)

(clojure.core/defn ser-response-cache-control [input] input)

(clojure.core/defn ser-sse-kms-encrypted-objects [input] {"Status" (ser-sse-kms-encrypted-objects-status (:status input))})

(clojure.core/defn req<-delete-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :mfa) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MFA", :location-name "x-amz-mfa", :value (ser-mfa (input :mfa))}) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-get-bucket-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentEncoding", :location-name "Content-Encoding", :value (ser-content-encoding (input :content-encoding))}) (clojure.core/contains? input :ssecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKeyMD5", :location-name "x-amz-server-side-encryption-customer-key-MD5", :value (ser-ssecustomer-keymd5 (input :ssecustomer-keymd5))}) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "WebsiteRedirectLocation", :location-name "x-amz-website-redirect-location", :value (ser-website-redirect-location (input :website-redirect-location))}) (clojure.core/contains? input :ssecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerAlgorithm", :location-name "x-amz-server-side-encryption-customer-algorithm", :value (ser-ssecustomer-algorithm (input :ssecustomer-algorithm))}) (clojure.core/contains? input :ssecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKey", :location-name "x-amz-server-side-encryption-customer-key", :value (ser-ssecustomer-key (input :ssecustomer-key))}) (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))}) (clojure.core/contains? input :body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Body", :location-name nil, :value (ser-body (input :body))}) (clojure.core/contains? input :grant-readacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantReadACP", :location-name "x-amz-grant-read-acp", :value (ser-grant-readacp (input :grant-readacp))}) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantRead", :location-name "x-amz-grant-read", :value (ser-grant-read (input :grant-read))}) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ServerSideEncryption", :location-name "x-amz-server-side-encryption", :value (ser-server-side-encryption (input :server-side-encryption))}) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentDisposition", :location-name "Content-Disposition", :value (ser-content-disposition (input :content-disposition))}) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentType", :location-name "Content-Type", :value (ser-content-type (input :content-type))}) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ACL", :location-name "x-amz-acl", :value (ser-object-cannedacl (input :acl))}) (clojure.core/contains? input :content-length) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentLength", :location-name "Content-Length", :value (ser-content-length (input :content-length))}) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Metadata", :location-name "x-amz-meta-", :value (ser-metadata (input :metadata))}) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CacheControl", :location-name "Cache-Control", :value (ser-cache-control (input :cache-control))}) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentLanguage", :location-name "Content-Language", :value (ser-content-language (input :content-language))}) (clojure.core/contains? input :grant-writeacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWriteACP", :location-name "x-amz-grant-write-acp", :value (ser-grant-writeacp (input :grant-writeacp))}) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantFullControl", :location-name "x-amz-grant-full-control", :value (ser-grant-full-control (input :grant-full-control))}) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Tagging", :location-name "x-amz-tagging", :value (ser-tagging-header (input :tagging))}) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "StorageClass", :location-name "x-amz-storage-class", :value (ser-storage-class (input :storage-class))}) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Expires", :location-name "Expires", :value (ser-expires (input :expires))}) (clojure.core/contains? input :ssekmskey-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSEKMSKeyId", :location-name "x-amz-server-side-encryption-aws-kms-key-id", :value (ser-ssekmskey-id (input :ssekmskey-id))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-get-bucket-lifecycle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-delete-bucket-cors-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-complete-multipart-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}], :querystring [#:http.request.field{:value (ser-multipart-upload-id (input :upload-id)), :location-name "uploadId", :key "UploadId"}]} (clojure.core/contains? input :multipart-upload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MultipartUpload", :location-name "CompleteMultipartUpload", :value (ser-completed-multipart-upload (input :multipart-upload))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-get-bucket-notification-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-get-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-bucket-lifecycle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))}) (clojure.core/contains? input :lifecycle-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "LifecycleConfiguration", :location-name "LifecycleConfiguration", :value (ser-lifecycle-configuration (input :lifecycle-configuration))})))

(clojure.core/defn req<-put-bucket-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-bucket-logging-status (input :bucket-logging-status)), :location-name "BucketLoggingStatus", :key "BucketLoggingStatus"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-head-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-get-bucket-request-payment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-bucket-request-payment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-request-payment-configuration (input :request-payment-configuration)), :location-name "RequestPaymentConfiguration", :key "RequestPaymentConfiguration"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-list-parts-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}], :querystring [#:http.request.field{:value (ser-multipart-upload-id (input :upload-id)), :location-name "uploadId", :key "UploadId"}]} (clojure.core/contains? input :max-parts) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MaxParts", :location-name "max-parts", :value (ser-max-parts (input :max-parts))}) (clojure.core/contains? input :part-number-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "PartNumberMarker", :location-name "part-number-marker", :value (ser-part-number-marker (input :part-number-marker))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-get-object-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))})))

(clojure.core/defn req<-put-bucket-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-notification-configuration-deprecated (input :notification-configuration)), :location-name "NotificationConfiguration", :key "NotificationConfiguration"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-get-bucket-versioning-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-object-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))}) (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))}) (clojure.core/contains? input :grant-readacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantReadACP", :location-name "x-amz-grant-read-acp", :value (ser-grant-readacp (input :grant-readacp))}) (clojure.core/contains? input :access-control-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "AccessControlPolicy", :location-name "AccessControlPolicy", :value (ser-access-control-policy (input :access-control-policy))}) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantRead", :location-name "x-amz-grant-read", :value (ser-grant-read (input :grant-read))}) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ACL", :location-name "x-amz-acl", :value (ser-object-cannedacl (input :acl))}) (clojure.core/contains? input :grant-write) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWrite", :location-name "x-amz-grant-write", :value (ser-grant-write (input :grant-write))}) (clojure.core/contains? input :grant-writeacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWriteACP", :location-name "x-amz-grant-write-acp", :value (ser-grant-writeacp (input :grant-writeacp))}) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantFullControl", :location-name "x-amz-grant-full-control", :value (ser-grant-full-control (input :grant-full-control))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-delete-bucket-lifecycle-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-get-bucket-metrics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-metrics-id (input :id)), :location-name "id", :key "Id"}]}))

(clojure.core/defn req<-put-bucket-versioning-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-versioning-configuration (input :versioning-configuration)), :location-name "VersioningConfiguration", :key "VersioningConfiguration"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))}) (clojure.core/contains? input :mfa) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MFA", :location-name "x-amz-mfa", :value (ser-mfa (input :mfa))})))

(clojure.core/defn req<-put-object-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}], :body [#:http.request.field{:value (ser-tagging (input :tagging)), :location-name "Tagging", :key "Tagging"}]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))}) (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-get-bucket-accelerate-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-delete-bucket-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-delete-bucket-replication-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-upload-part-copy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}], :header [#:http.request.field{:value (ser-copy-source (input :copy-source)), :location-name "x-amz-copy-source", :key "CopySource"}], :querystring [#:http.request.field{:value (ser-part-number (input :part-number)), :location-name "partNumber", :key "PartNumber"} #:http.request.field{:value (ser-multipart-upload-id (input :upload-id)), :location-name "uploadId", :key "UploadId"}]} (clojure.core/contains? input :ssecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKeyMD5", :location-name "x-amz-server-side-encryption-customer-key-MD5", :value (ser-ssecustomer-keymd5 (input :ssecustomer-keymd5))}) (clojure.core/contains? input :copy-sourcessecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceSSECustomerKey", :location-name "x-amz-copy-source-server-side-encryption-customer-key", :value (ser-copy-sourcessecustomer-key (input :copy-sourcessecustomer-key))}) (clojure.core/contains? input :ssecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerAlgorithm", :location-name "x-amz-server-side-encryption-customer-algorithm", :value (ser-ssecustomer-algorithm (input :ssecustomer-algorithm))}) (clojure.core/contains? input :ssecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKey", :location-name "x-amz-server-side-encryption-customer-key", :value (ser-ssecustomer-key (input :ssecustomer-key))}) (clojure.core/contains? input :copy-source-if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceIfMatch", :location-name "x-amz-copy-source-if-match", :value (ser-copy-source-if-match (input :copy-source-if-match))}) (clojure.core/contains? input :copy-source-range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceRange", :location-name "x-amz-copy-source-range", :value (ser-copy-source-range (input :copy-source-range))}) (clojure.core/contains? input :copy-source-if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceIfNoneMatch", :location-name "x-amz-copy-source-if-none-match", :value (ser-copy-source-if-none-match (input :copy-source-if-none-match))}) (clojure.core/contains? input :copy-source-if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceIfModifiedSince", :location-name "x-amz-copy-source-if-modified-since", :value (ser-copy-source-if-modified-since (input :copy-source-if-modified-since))}) (clojure.core/contains? input :copy-source-if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceIfUnmodifiedSince", :location-name "x-amz-copy-source-if-unmodified-since", :value (ser-copy-source-if-unmodified-since (input :copy-source-if-unmodified-since))}) (clojure.core/contains? input :copy-sourcessecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceSSECustomerAlgorithm", :location-name "x-amz-copy-source-server-side-encryption-customer-algorithm", :value (ser-copy-sourcessecustomer-algorithm (input :copy-sourcessecustomer-algorithm))}) (clojure.core/contains? input :copy-sourcessecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceSSECustomerKeyMD5", :location-name "x-amz-copy-source-server-side-encryption-customer-key-MD5", :value (ser-copy-sourcessecustomer-keymd5 (input :copy-sourcessecustomer-keymd5))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-delete-objects-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-delete (input :delete)), :location-name "Delete", :key "Delete"}]} (clojure.core/contains? input :mfa) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MFA", :location-name "x-amz-mfa", :value (ser-mfa (input :mfa))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-copy-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}], :header [#:http.request.field{:value (ser-copy-source (input :copy-source)), :location-name "x-amz-copy-source", :key "CopySource"}]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentEncoding", :location-name "Content-Encoding", :value (ser-content-encoding (input :content-encoding))}) (clojure.core/contains? input :tagging-directive) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "TaggingDirective", :location-name "x-amz-tagging-directive", :value (ser-tagging-directive (input :tagging-directive))}) (clojure.core/contains? input :ssecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKeyMD5", :location-name "x-amz-server-side-encryption-customer-key-MD5", :value (ser-ssecustomer-keymd5 (input :ssecustomer-keymd5))}) (clojure.core/contains? input :copy-sourcessecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceSSECustomerKey", :location-name "x-amz-copy-source-server-side-encryption-customer-key", :value (ser-copy-sourcessecustomer-key (input :copy-sourcessecustomer-key))}) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "WebsiteRedirectLocation", :location-name "x-amz-website-redirect-location", :value (ser-website-redirect-location (input :website-redirect-location))}) (clojure.core/contains? input :ssecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerAlgorithm", :location-name "x-amz-server-side-encryption-customer-algorithm", :value (ser-ssecustomer-algorithm (input :ssecustomer-algorithm))}) (clojure.core/contains? input :metadata-directive) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MetadataDirective", :location-name "x-amz-metadata-directive", :value (ser-metadata-directive (input :metadata-directive))}) (clojure.core/contains? input :ssecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKey", :location-name "x-amz-server-side-encryption-customer-key", :value (ser-ssecustomer-key (input :ssecustomer-key))}) (clojure.core/contains? input :grant-readacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantReadACP", :location-name "x-amz-grant-read-acp", :value (ser-grant-readacp (input :grant-readacp))}) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantRead", :location-name "x-amz-grant-read", :value (ser-grant-read (input :grant-read))}) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ServerSideEncryption", :location-name "x-amz-server-side-encryption", :value (ser-server-side-encryption (input :server-side-encryption))}) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentDisposition", :location-name "Content-Disposition", :value (ser-content-disposition (input :content-disposition))}) (clojure.core/contains? input :copy-source-if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceIfMatch", :location-name "x-amz-copy-source-if-match", :value (ser-copy-source-if-match (input :copy-source-if-match))}) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentType", :location-name "Content-Type", :value (ser-content-type (input :content-type))}) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ACL", :location-name "x-amz-acl", :value (ser-object-cannedacl (input :acl))}) (clojure.core/contains? input :copy-source-if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceIfNoneMatch", :location-name "x-amz-copy-source-if-none-match", :value (ser-copy-source-if-none-match (input :copy-source-if-none-match))}) (clojure.core/contains? input :copy-source-if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceIfModifiedSince", :location-name "x-amz-copy-source-if-modified-since", :value (ser-copy-source-if-modified-since (input :copy-source-if-modified-since))}) (clojure.core/contains? input :copy-source-if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceIfUnmodifiedSince", :location-name "x-amz-copy-source-if-unmodified-since", :value (ser-copy-source-if-unmodified-since (input :copy-source-if-unmodified-since))}) (clojure.core/contains? input :copy-sourcessecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceSSECustomerAlgorithm", :location-name "x-amz-copy-source-server-side-encryption-customer-algorithm", :value (ser-copy-sourcessecustomer-algorithm (input :copy-sourcessecustomer-algorithm))}) (clojure.core/contains? input :copy-sourcessecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CopySourceSSECustomerKeyMD5", :location-name "x-amz-copy-source-server-side-encryption-customer-key-MD5", :value (ser-copy-sourcessecustomer-keymd5 (input :copy-sourcessecustomer-keymd5))}) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Metadata", :location-name "x-amz-meta-", :value (ser-metadata (input :metadata))}) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CacheControl", :location-name "Cache-Control", :value (ser-cache-control (input :cache-control))}) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentLanguage", :location-name "Content-Language", :value (ser-content-language (input :content-language))}) (clojure.core/contains? input :grant-writeacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWriteACP", :location-name "x-amz-grant-write-acp", :value (ser-grant-writeacp (input :grant-writeacp))}) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantFullControl", :location-name "x-amz-grant-full-control", :value (ser-grant-full-control (input :grant-full-control))}) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Tagging", :location-name "x-amz-tagging", :value (ser-tagging-header (input :tagging))}) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "StorageClass", :location-name "x-amz-storage-class", :value (ser-storage-class (input :storage-class))}) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Expires", :location-name "Expires", :value (ser-expires (input :expires))}) (clojure.core/contains? input :ssekmskey-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSEKMSKeyId", :location-name "x-amz-server-side-encryption-aws-kms-key-id", :value (ser-ssekmskey-id (input :ssekmskey-id))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-get-bucket-logging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-restore-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))}) (clojure.core/contains? input :restore-request) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RestoreRequest", :location-name "RestoreRequest", :value (ser-restore-request (input :restore-request))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-get-bucket-replication-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-create-multipart-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :content-encoding) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentEncoding", :location-name "Content-Encoding", :value (ser-content-encoding (input :content-encoding))}) (clojure.core/contains? input :ssecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKeyMD5", :location-name "x-amz-server-side-encryption-customer-key-MD5", :value (ser-ssecustomer-keymd5 (input :ssecustomer-keymd5))}) (clojure.core/contains? input :website-redirect-location) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "WebsiteRedirectLocation", :location-name "x-amz-website-redirect-location", :value (ser-website-redirect-location (input :website-redirect-location))}) (clojure.core/contains? input :ssecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerAlgorithm", :location-name "x-amz-server-side-encryption-customer-algorithm", :value (ser-ssecustomer-algorithm (input :ssecustomer-algorithm))}) (clojure.core/contains? input :ssecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKey", :location-name "x-amz-server-side-encryption-customer-key", :value (ser-ssecustomer-key (input :ssecustomer-key))}) (clojure.core/contains? input :grant-readacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantReadACP", :location-name "x-amz-grant-read-acp", :value (ser-grant-readacp (input :grant-readacp))}) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantRead", :location-name "x-amz-grant-read", :value (ser-grant-read (input :grant-read))}) (clojure.core/contains? input :server-side-encryption) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ServerSideEncryption", :location-name "x-amz-server-side-encryption", :value (ser-server-side-encryption (input :server-side-encryption))}) (clojure.core/contains? input :content-disposition) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentDisposition", :location-name "Content-Disposition", :value (ser-content-disposition (input :content-disposition))}) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentType", :location-name "Content-Type", :value (ser-content-type (input :content-type))}) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ACL", :location-name "x-amz-acl", :value (ser-object-cannedacl (input :acl))}) (clojure.core/contains? input :metadata) (clojure.core/update-in [:http.request.configuration/headers] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Metadata", :location-name "x-amz-meta-", :value (ser-metadata (input :metadata))}) (clojure.core/contains? input :cache-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CacheControl", :location-name "Cache-Control", :value (ser-cache-control (input :cache-control))}) (clojure.core/contains? input :content-language) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentLanguage", :location-name "Content-Language", :value (ser-content-language (input :content-language))}) (clojure.core/contains? input :grant-writeacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWriteACP", :location-name "x-amz-grant-write-acp", :value (ser-grant-writeacp (input :grant-writeacp))}) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantFullControl", :location-name "x-amz-grant-full-control", :value (ser-grant-full-control (input :grant-full-control))}) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Tagging", :location-name "x-amz-tagging", :value (ser-tagging-header (input :tagging))}) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "StorageClass", :location-name "x-amz-storage-class", :value (ser-storage-class (input :storage-class))}) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Expires", :location-name "Expires", :value (ser-expires (input :expires))}) (clojure.core/contains? input :ssekmskey-id) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSEKMSKeyId", :location-name "x-amz-server-side-encryption-aws-kms-key-id", :value (ser-ssekmskey-id (input :ssekmskey-id))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-head-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :ssecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKeyMD5", :location-name "x-amz-server-side-encryption-customer-key-MD5", :value (ser-ssecustomer-keymd5 (input :ssecustomer-keymd5))}) (clojure.core/contains? input :if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "IfUnmodifiedSince", :location-name "If-Unmodified-Since", :value (ser-if-unmodified-since (input :if-unmodified-since))}) (clojure.core/contains? input :ssecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerAlgorithm", :location-name "x-amz-server-side-encryption-customer-algorithm", :value (ser-ssecustomer-algorithm (input :ssecustomer-algorithm))}) (clojure.core/contains? input :ssecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKey", :location-name "x-amz-server-side-encryption-customer-key", :value (ser-ssecustomer-key (input :ssecustomer-key))}) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))}) (clojure.core/contains? input :if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "IfModifiedSince", :location-name "If-Modified-Since", :value (ser-if-modified-since (input :if-modified-since))}) (clojure.core/contains? input :part-number) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "PartNumber", :location-name "partNumber", :value (ser-part-number (input :part-number))}) (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Range", :location-name "Range", :value (ser-range (input :range))}) (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "IfMatch", :location-name "If-Match", :value (ser-if-match (input :if-match))}) (clojure.core/contains? input :if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "IfNoneMatch", :location-name "If-None-Match", :value (ser-if-none-match (input :if-none-match))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-list-object-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Delimiter", :location-name "delimiter", :value (ser-delimiter (input :delimiter))}) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "EncodingType", :location-name "encoding-type", :value (ser-encoding-type (input :encoding-type))}) (clojure.core/contains? input :key-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "KeyMarker", :location-name "key-marker", :value (ser-key-marker (input :key-marker))}) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MaxKeys", :location-name "max-keys", :value (ser-max-keys (input :max-keys))}) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Prefix", :location-name "prefix", :value (ser-prefix (input :prefix))}) (clojure.core/contains? input :version-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionIdMarker", :location-name "version-id-marker", :value (ser-version-id-marker (input :version-id-marker))})))

(clojure.core/defn req<-put-bucket-notification-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-notification-configuration (input :notification-configuration)), :location-name "NotificationConfiguration", :key "NotificationConfiguration"}]}))

(clojure.core/defn req<-list-objects-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Delimiter", :location-name "delimiter", :value (ser-delimiter (input :delimiter))}) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "EncodingType", :location-name "encoding-type", :value (ser-encoding-type (input :encoding-type))}) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Marker", :location-name "marker", :value (ser-marker (input :marker))}) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MaxKeys", :location-name "max-keys", :value (ser-max-keys (input :max-keys))}) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Prefix", :location-name "prefix", :value (ser-prefix (input :prefix))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-put-bucket-metrics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-metrics-id (input :id)), :location-name "id", :key "Id"}], :body [#:http.request.field{:value (ser-metrics-configuration (input :metrics-configuration)), :location-name "MetricsConfiguration", :key "MetricsConfiguration"}]}))

(clojure.core/defn req<-delete-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-delete-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-list-bucket-inventory-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContinuationToken", :location-name "continuation-token", :value (ser-token (input :continuation-token))})))

(clojure.core/defn req<-delete-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-bucket-replication-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-replication-configuration (input :replication-configuration)), :location-name "ReplicationConfiguration", :key "ReplicationConfiguration"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-list-multipart-uploads-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Delimiter", :location-name "delimiter", :value (ser-delimiter (input :delimiter))}) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "EncodingType", :location-name "encoding-type", :value (ser-encoding-type (input :encoding-type))}) (clojure.core/contains? input :key-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "KeyMarker", :location-name "key-marker", :value (ser-key-marker (input :key-marker))}) (clojure.core/contains? input :max-uploads) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MaxUploads", :location-name "max-uploads", :value (ser-max-uploads (input :max-uploads))}) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Prefix", :location-name "prefix", :value (ser-prefix (input :prefix))}) (clojure.core/contains? input :upload-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "UploadIdMarker", :location-name "upload-id-marker", :value (ser-upload-id-marker (input :upload-id-marker))})))

(clojure.core/defn req<-get-bucket-cors-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-abort-multipart-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}], :querystring [#:http.request.field{:value (ser-multipart-upload-id (input :upload-id)), :location-name "uploadId", :key "UploadId"}]} (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-get-object-torrent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-put-bucket-analytics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-analytics-id (input :id)), :location-name "id", :key "Id"}], :body [#:http.request.field{:value (ser-analytics-configuration (input :analytics-configuration)), :location-name "AnalyticsConfiguration", :key "AnalyticsConfiguration"}]}))

(clojure.core/defn req<-get-object-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-delete-bucket-metrics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-metrics-id (input :id)), :location-name "id", :key "Id"}]}))

(clojure.core/defn req<-get-bucket-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-get-bucket-location-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-bucket-inventory-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-inventory-id (input :id)), :location-name "id", :key "Id"}], :body [#:http.request.field{:value (ser-inventory-configuration (input :inventory-configuration)), :location-name "InventoryConfiguration", :key "InventoryConfiguration"}]}))

(clojure.core/defn req<-get-object-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :ssecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKeyMD5", :location-name "x-amz-server-side-encryption-customer-key-MD5", :value (ser-ssecustomer-keymd5 (input :ssecustomer-keymd5))}) (clojure.core/contains? input :response-expires) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ResponseExpires", :location-name "response-expires", :value (ser-response-expires (input :response-expires))}) (clojure.core/contains? input :if-unmodified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "IfUnmodifiedSince", :location-name "If-Unmodified-Since", :value (ser-if-unmodified-since (input :if-unmodified-since))}) (clojure.core/contains? input :response-content-disposition) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ResponseContentDisposition", :location-name "response-content-disposition", :value (ser-response-content-disposition (input :response-content-disposition))}) (clojure.core/contains? input :response-content-language) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ResponseContentLanguage", :location-name "response-content-language", :value (ser-response-content-language (input :response-content-language))}) (clojure.core/contains? input :ssecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerAlgorithm", :location-name "x-amz-server-side-encryption-customer-algorithm", :value (ser-ssecustomer-algorithm (input :ssecustomer-algorithm))}) (clojure.core/contains? input :ssecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKey", :location-name "x-amz-server-side-encryption-customer-key", :value (ser-ssecustomer-key (input :ssecustomer-key))}) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))}) (clojure.core/contains? input :response-content-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ResponseContentType", :location-name "response-content-type", :value (ser-response-content-type (input :response-content-type))}) (clojure.core/contains? input :if-modified-since) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "IfModifiedSince", :location-name "If-Modified-Since", :value (ser-if-modified-since (input :if-modified-since))}) (clojure.core/contains? input :part-number) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "PartNumber", :location-name "partNumber", :value (ser-part-number (input :part-number))}) (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Range", :location-name "Range", :value (ser-range (input :range))}) (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "IfMatch", :location-name "If-Match", :value (ser-if-match (input :if-match))}) (clojure.core/contains? input :response-content-encoding) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ResponseContentEncoding", :location-name "response-content-encoding", :value (ser-response-content-encoding (input :response-content-encoding))}) (clojure.core/contains? input :if-none-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "IfNoneMatch", :location-name "If-None-Match", :value (ser-if-none-match (input :if-none-match))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))}) (clojure.core/contains? input :response-cache-control) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ResponseCacheControl", :location-name "response-cache-control", :value (ser-response-cache-control (input :response-cache-control))})))

(clojure.core/defn req<-get-bucket-lifecycle-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-get-bucket-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-bucket-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-tagging (input :tagging)), :location-name "Tagging", :key "Tagging"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-create-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ACL", :location-name "x-amz-acl", :value (ser-bucket-cannedacl (input :acl))}) (clojure.core/contains? input :create-bucket-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "CreateBucketConfiguration", :location-name "CreateBucketConfiguration", :value (ser-create-bucket-configuration (input :create-bucket-configuration))}) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantFullControl", :location-name "x-amz-grant-full-control", :value (ser-grant-full-control (input :grant-full-control))}) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantRead", :location-name "x-amz-grant-read", :value (ser-grant-read (input :grant-read))}) (clojure.core/contains? input :grant-readacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantReadACP", :location-name "x-amz-grant-read-acp", :value (ser-grant-readacp (input :grant-readacp))}) (clojure.core/contains? input :grant-write) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWrite", :location-name "x-amz-grant-write", :value (ser-grant-write (input :grant-write))}) (clojure.core/contains? input :grant-writeacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWriteACP", :location-name "x-amz-grant-write-acp", :value (ser-grant-writeacp (input :grant-writeacp))})))

(clojure.core/defn req<-delete-bucket-analytics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-analytics-id (input :id)), :location-name "id", :key "Id"}]}))

(clojure.core/defn req<-get-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-bucket-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-policy (input :policy)), :location-name nil, :key "Policy"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))}) (clojure.core/contains? input :confirm-remove-self-bucket-access) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ConfirmRemoveSelfBucketAccess", :location-name "x-amz-confirm-remove-self-bucket-access", :value (ser-confirm-remove-self-bucket-access (input :confirm-remove-self-bucket-access))})))

(clojure.core/defn req<-delete-object-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "VersionId", :location-name "versionId", :value (ser-object-version-id (input :version-id))})))

(clojure.core/defn req<-put-bucket-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-server-side-encryption-configuration (input :server-side-encryption-configuration)), :location-name "ServerSideEncryptionConfiguration", :key "ServerSideEncryptionConfiguration"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-list-objectsv2-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Prefix", :location-name "prefix", :value (ser-prefix (input :prefix))}) (clojure.core/contains? input :encoding-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "EncodingType", :location-name "encoding-type", :value (ser-encoding-type (input :encoding-type))}) (clojure.core/contains? input :start-after) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "StartAfter", :location-name "start-after", :value (ser-start-after (input :start-after))}) (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContinuationToken", :location-name "continuation-token", :value (ser-token (input :continuation-token))}) (clojure.core/contains? input :delimiter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Delimiter", :location-name "delimiter", :value (ser-delimiter (input :delimiter))}) (clojure.core/contains? input :fetch-owner) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "FetchOwner", :location-name "fetch-owner", :value (ser-fetch-owner (input :fetch-owner))}) (clojure.core/contains? input :max-keys) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "MaxKeys", :location-name "max-keys", :value (ser-max-keys (input :max-keys))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-put-bucket-cors-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-corsconfiguration (input :corsconfiguration)), :location-name "CORSConfiguration", :key "CORSConfiguration"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-put-bucket-accelerate-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-accelerate-configuration (input :accelerate-configuration)), :location-name "AccelerateConfiguration", :key "AccelerateConfiguration"}]}))

(clojure.core/defn req<-delete-bucket-inventory-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-inventory-id (input :id)), :location-name "id", :key "Id"}]}))

(clojure.core/defn req<-get-bucket-inventory-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-inventory-id (input :id)), :location-name "id", :key "Id"}]}))

(clojure.core/defn req<-put-bucket-lifecycle-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :lifecycle-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "LifecycleConfiguration", :location-name "LifecycleConfiguration", :value (ser-bucket-lifecycle-configuration (input :lifecycle-configuration))})))

(clojure.core/defn req<-select-object-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}], :body [#:http.request.field{:value (ser-expression (input :expression)), :location-name nil, :key "Expression"} #:http.request.field{:value (ser-expression-type (input :expression-type)), :location-name nil, :key "ExpressionType"} #:http.request.field{:value (ser-input-serialization (input :input-serialization)), :location-name nil, :key "InputSerialization"} #:http.request.field{:value (ser-output-serialization (input :output-serialization)), :location-name nil, :key "OutputSerialization"}]} (clojure.core/contains? input :ssecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKeyMD5", :location-name "x-amz-server-side-encryption-customer-key-MD5", :value (ser-ssecustomer-keymd5 (input :ssecustomer-keymd5))}) (clojure.core/contains? input :ssecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerAlgorithm", :location-name "x-amz-server-side-encryption-customer-algorithm", :value (ser-ssecustomer-algorithm (input :ssecustomer-algorithm))}) (clojure.core/contains? input :ssecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKey", :location-name "x-amz-server-side-encryption-customer-key", :value (ser-ssecustomer-key (input :ssecustomer-key))}) (clojure.core/contains? input :request-progress) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestProgress", :location-name nil, :value (ser-request-progress (input :request-progress))})))

(clojure.core/defn req<-delete-bucket-tagging-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]}))

(clojure.core/defn req<-put-bucket-website-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :body [#:http.request.field{:value (ser-website-configuration (input :website-configuration)), :location-name "WebsiteConfiguration", :key "WebsiteConfiguration"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))})))

(clojure.core/defn req<-list-bucket-metrics-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContinuationToken", :location-name "continuation-token", :value (ser-token (input :continuation-token))})))

(clojure.core/defn req<-get-bucket-analytics-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}], :querystring [#:http.request.field{:value (ser-analytics-id (input :id)), :location-name "id", :key "Id"}]}))

(clojure.core/defn req<-upload-part-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"} #:http.request.field{:value (ser-object-key (input :key)), :location-name "Key", :key "Key"}], :querystring [#:http.request.field{:value (ser-part-number (input :part-number)), :location-name "partNumber", :key "PartNumber"} #:http.request.field{:value (ser-multipart-upload-id (input :upload-id)), :location-name "uploadId", :key "UploadId"}]} (clojure.core/contains? input :ssecustomer-keymd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKeyMD5", :location-name "x-amz-server-side-encryption-customer-key-MD5", :value (ser-ssecustomer-keymd5 (input :ssecustomer-keymd5))}) (clojure.core/contains? input :ssecustomer-algorithm) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerAlgorithm", :location-name "x-amz-server-side-encryption-customer-algorithm", :value (ser-ssecustomer-algorithm (input :ssecustomer-algorithm))}) (clojure.core/contains? input :ssecustomer-key) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "SSECustomerKey", :location-name "x-amz-server-side-encryption-customer-key", :value (ser-ssecustomer-key (input :ssecustomer-key))}) (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))}) (clojure.core/contains? input :body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "Body", :location-name nil, :value (ser-body (input :body))}) (clojure.core/contains? input :content-length) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentLength", :location-name "Content-Length", :value (ser-content-length (input :content-length))}) (clojure.core/contains? input :request-payer) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "RequestPayer", :location-name "x-amz-request-payer", :value (ser-request-payer (input :request-payer))})))

(clojure.core/defn req<-put-bucket-acl-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :contentmd5) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContentMD5", :location-name "Content-MD5", :value (ser-contentmd5 (input :contentmd5))}) (clojure.core/contains? input :grant-readacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantReadACP", :location-name "x-amz-grant-read-acp", :value (ser-grant-readacp (input :grant-readacp))}) (clojure.core/contains? input :access-control-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "AccessControlPolicy", :location-name "AccessControlPolicy", :value (ser-access-control-policy (input :access-control-policy))}) (clojure.core/contains? input :grant-read) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantRead", :location-name "x-amz-grant-read", :value (ser-grant-read (input :grant-read))}) (clojure.core/contains? input :acl) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ACL", :location-name "x-amz-acl", :value (ser-bucket-cannedacl (input :acl))}) (clojure.core/contains? input :grant-write) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWrite", :location-name "x-amz-grant-write", :value (ser-grant-write (input :grant-write))}) (clojure.core/contains? input :grant-writeacp) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantWriteACP", :location-name "x-amz-grant-write-acp", :value (ser-grant-writeacp (input :grant-writeacp))}) (clojure.core/contains? input :grant-full-control) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "GrantFullControl", :location-name "x-amz-grant-full-control", :value (ser-grant-full-control (input :grant-full-control))})))

(clojure.core/defn req<-list-bucket-analytics-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [#:http.request.field{:value (ser-bucket-name (input :bucket)), :location-name "Bucket", :key "Bucket"}]} (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) #:http.request.field{:key "ContinuationToken", :location-name "continuation-token", :value (ser-token (input :continuation-token))})))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/mfadelete {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-tagging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.put-object-tagging-output/VersionId]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.bucket/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.bucket/Name :portkey.aws.s3.-2006-03-01/CreationDate]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-tagging-output (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/TagSet] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-tagging-output/VersionId]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-object-request/Bucket :portkey.aws.s3.-2006-03-01.delete-object-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01/MFA :portkey.aws.s3.-2006-03-01.delete-object-request/VersionId :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/versions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-output/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-object-versions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-object-versions-output/Versions :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/EncodingType :portkey.aws.s3.-2006-03-01/NextKeyMarker :portkey.aws.s3.-2006-03-01/IsTruncated :portkey.aws.s3.-2006-03-01.list-object-versions-output/CommonPrefixes :portkey.aws.s3.-2006-03-01/VersionIdMarker :portkey.aws.s3.-2006-03-01/NextVersionIdMarker :portkey.aws.s3.-2006-03-01/Delimiter :portkey.aws.s3.-2006-03-01.list-object-versions-output/Name :portkey.aws.s3.-2006-03-01/MaxKeys :portkey.aws.s3.-2006-03-01/KeyMarker :portkey.aws.s3.-2006-03-01/DeleteMarkers]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metrics-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metrics-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.metrics-configuration/Id] :opt-un [:portkey.aws.s3.-2006-03-01.metrics-configuration/Filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-encryption-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/missing-meta clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-cannedacl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-request/tagging (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-request/Bucket :portkey.aws.s3.-2006-03-01.put-object-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01/ContentEncoding :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/WebsiteRedirectLocation :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKey :portkey.aws.s3.-2006-03-01/ContentMD5 :portkey.aws.s3.-2006-03-01/Body :portkey.aws.s3.-2006-03-01/GrantReadACP :portkey.aws.s3.-2006-03-01/GrantRead :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/ContentDisposition :portkey.aws.s3.-2006-03-01/ContentType :portkey.aws.s3.-2006-03-01.put-object-request/ACL :portkey.aws.s3.-2006-03-01/ContentLength :portkey.aws.s3.-2006-03-01/Metadata :portkey.aws.s3.-2006-03-01/CacheControl :portkey.aws.s3.-2006-03-01/ContentLanguage :portkey.aws.s3.-2006-03-01/GrantWriteACP :portkey.aws.s3.-2006-03-01/GrantFullControl :portkey.aws.s3.-2006-03-01.put-object-request/Tagging :portkey.aws.s3.-2006-03-01/StorageClass :portkey.aws.s3.-2006-03-01/Expires :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cloud-function-invocation-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.input-serialization/csv (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/csvinput))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.input-serialization/json (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/jsoninput))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.input-serialization/parquet (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/parquet-input))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/input-serialization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.input-serialization/CSV :portkey.aws.s3.-2006-03-01/CompressionType :portkey.aws.s3.-2006-03-01.input-serialization/JSON :portkey.aws.s3.-2006-03-01.input-serialization/Parquet]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tier {"Standard" "Standard", :standard "Standard", "Bulk" "Bulk", :bulk "Bulk", "Expedited" "Expedited", :expedited "Expedited"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-encoding (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-cors-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-already-owned-by-you (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/confirm-remove-self-bucket-access clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/key-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/compression-type {"NONE" "NONE", :none "NONE", "GZIP" "GZIP", :gzip "GZIP", "BZIP2" "BZIP2", :bzip2 "BZIP2"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/multipart-upload-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/multipart-upload))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tagging-directive {"COPY" "COPY", :copy "COPY", "REPLACE" "REPLACE", :replace "REPLACE"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tag-set (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/tag))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/ssecustomer-keymd5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/routing-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/routing-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expired-object-delete-marker clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-expires clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replica-kms-keyid (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/completed-part (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/PartNumber]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/metrics-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/notification-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-sourcessecustomer-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-torrent-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Body :portkey.aws.s3.-2006-03-01/RequestCharged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/common-prefix-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/common-prefix))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/multipart-upload (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/completed-multipart-upload))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/complete-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/Bucket :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/Key :portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/UploadId] :opt-un [:portkey.aws.s3.-2006-03-01.complete-multipart-upload-request/MultipartUpload :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/AnalyticsConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-encryption-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ServerSideEncryptionConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.versioning-configuration/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-versioning-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/versioning-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/MFADelete :portkey.aws.s3.-2006-03-01.versioning-configuration/Status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/continuation-event (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-notification-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-notification-configuration-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-unmodified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-website-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-disposition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/mfadelete-status {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-name {"prefix" "prefix", :prefix "prefix", "suffix" "suffix", :suffix "suffix"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5 :portkey.aws.s3.-2006-03-01/LifecycleConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-logging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-logging-request/Bucket :portkey.aws.s3.-2006-03-01/BucketLoggingStatus] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/topic-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/topic-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/head-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.head-bucket-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.access-control-translation/owner (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/owner-override))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/access-control-translation (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.access-control-translation/Owner] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/topic (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/topic-arn))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/topic-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/Id :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/Events :portkey.aws.s3.-2006-03-01/Event :portkey.aws.s3.-2006-03-01.topic-configuration-deprecated/Topic]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/glacier-job-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Tier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Rules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-request-payment-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-request-payment-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/website-redirect-location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-logging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/LoggingEnabled]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/type {"CanonicalUser" "CanonicalUser", :canonical-user "CanonicalUser", "AmazonCustomerByEmail" "AmazonCustomerByEmail", :amazon-customer-by-email "AmazonCustomerByEmail", "Group" "Group", :group "Group"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class-analysis-schema-version {"V_1" "V_1", :v-1 "V_1"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/encoding-type {"url" "url", :url "url"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-objects-output/deleted (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/deleted-objects))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-objects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.delete-objects-output/Deleted :portkey.aws.s3.-2006-03-01/RequestCharged :portkey.aws.s3.-2006-03-01/Errors]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects-status {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-bucket-configuration/location-constraint (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-location-constraint))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-bucket-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.create-bucket-configuration/LocationConstraint]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-key-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.create-multipart-upload-output/Bucket :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/AbortDate :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/Key :portkey.aws.s3.-2006-03-01/AbortRuleId :portkey.aws.s3.-2006-03-01.create-multipart-upload-output/UploadId :portkey.aws.s3.-2006-03-01/RequestCharged :portkey.aws.s3.-2006-03-01/SSEKMSKeyId]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/encryption-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ReplicaKmsKeyID]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.cloud-function-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.cloud-function-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.cloud-function-configuration/invocation-role (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/cloud-function-invocation-role))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cloud-function-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.cloud-function-configuration/Id :portkey.aws.s3.-2006-03-01/Event :portkey.aws.s3.-2006-03-01.cloud-function-configuration/Events :portkey.aws.s3.-2006-03-01/CloudFunction :portkey.aws.s3.-2006-03-01.cloud-function-configuration/InvocationRole]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/request-payment-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Payer] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-optional-field {"LastModifiedDate" "LastModifiedDate", :storage-class "StorageClass", "ReplicationStatus" "ReplicationStatus", "EncryptionStatus" "EncryptionStatus", :etag "ETag", "ETag" "ETag", :size "Size", :replication-status "ReplicationStatus", "Size" "Size", "IsMultipartUploaded" "IsMultipartUploaded", "StorageClass" "StorageClass", :encryption-status "EncryptionStatus", :is-multipart-uploaded "IsMultipartUploaded", :last-modified-date "LastModifiedDate"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/permission {"WRITE" "WRITE", "FULL_CONTROL" "FULL_CONTROL", :read "READ", :read-acp "READ_ACP", "READ_ACP" "READ_ACP", :write-acp "WRITE_ACP", :write "WRITE", "WRITE_ACP" "WRITE_ACP", "READ" "READ", :full-control "FULL_CONTROL"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/uploads (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-multipart-uploads-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/Bucket :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/Uploads :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/EncodingType :portkey.aws.s3.-2006-03-01/NextKeyMarker :portkey.aws.s3.-2006-03-01/UploadIdMarker :portkey.aws.s3.-2006-03-01/MaxUploads :portkey.aws.s3.-2006-03-01/IsTruncated :portkey.aws.s3.-2006-03-01.list-multipart-uploads-output/CommonPrefixes :portkey.aws.s3.-2006-03-01/Delimiter :portkey.aws.s3.-2006-03-01/KeyMarker :portkey.aws.s3.-2006-03-01/NextUploadIdMarker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/jsonoutput (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/RecordDelimiter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/records (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/records-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/stats (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/stats-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/progress (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/progress-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/cont (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/continuation-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/end (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/end-event))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/select-object-content-event-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.select-object-content-event-stream/Records :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/Stats :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/Progress :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/Cont :portkey.aws.s3.-2006-03-01.select-object-content-event-stream/End]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption-rules))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-configuration/Rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.target-grant/permission (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-logs-permission))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/target-grant (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Grantee :portkey.aws.s3.-2006-03-01.target-grant/Permission]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/replication-rules))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Role :portkey.aws.s3.-2006-03-01.replication-configuration/Rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/completed-part-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/completed-part))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/comments (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/ssecustomer-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-schedule/frequency (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-frequency))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-schedule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.inventory-schedule/Frequency] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.transition/storage-class (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/transition-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/transition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Date :portkey.aws.s3.-2006-03-01/Days :portkey.aws.s3.-2006-03-01.transition/StorageClass]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata-directive {"COPY" "COPY", :copy "COPY", "REPLACE" "REPLACE", :replace "REPLACE"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.multipart-upload/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.multipart-upload/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.multipart-upload/UploadId :portkey.aws.s3.-2006-03-01.multipart-upload/Key :portkey.aws.s3.-2006-03-01/Initiated :portkey.aws.s3.-2006-03-01/StorageClass :portkey.aws.s3.-2006-03-01/Owner :portkey.aws.s3.-2006-03-01/Initiator]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-export-destination/s3-bucket-destination (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analyticss3-bucket-destination))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-export-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.analytics-export-destination/S3BucketDestination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/IsTruncated :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-output/ContinuationToken :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-output/NextContinuationToken :portkey.aws.s3.-2006-03-01/MetricsConfigurationList]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/ssecustomer-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-request-payment-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-request-payment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-request-payment-request/Bucket :portkey.aws.s3.-2006-03-01/RequestPaymentConfiguration] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-parts-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-parts-request/Bucket :portkey.aws.s3.-2006-03-01.list-parts-request/Key :portkey.aws.s3.-2006-03-01.list-parts-request/UploadId] :opt-un [:portkey.aws.s3.-2006-03-01/MaxParts :portkey.aws.s3.-2006-03-01/PartNumberMarker :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/contentmd5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.storage-class-analysis/data-export (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/storage-class-analysis-data-export))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class-analysis (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.storage-class-analysis/DataExport]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expose-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-tagging-request/Bucket :portkey.aws.s3.-2006-03-01.get-object-tagging-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-tagging-request/VersionId]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-notification-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-notification-request/notification-configuration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-notification-request/Bucket :portkey.aws.s3.-2006-03-01.put-bucket-notification-request/NotificationConfiguration] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/body clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-replication-status {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allow-quoted-record-delimiter clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-versioning-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-versioning-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-versioning-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-bucket-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Location]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object/storage-class (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.object/Key :portkey.aws.s3.-2006-03-01/LastModified :portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/Size :portkey.aws.s3.-2006-03-01.object/StorageClass :portkey.aws.s3.-2006-03-01/Owner]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grants (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/grant))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/transition-storage-class {"GLACIER" "GLACIER", :glacier "GLACIER", "STANDARD_IA" "STANDARD_IA", :standard-ia "STANDARD_IA", "ONEZONE_IA" "ONEZONE_IA", :onezone-ia "ONEZONE_IA"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule-filter/and (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-rule-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-rule-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/Tag :portkey.aws.s3.-2006-03-01.lifecycle-rule-filter/And]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/payer {"Requester" "Requester", :requester "Requester", "BucketOwner" "BucketOwner", :bucket-owner "BucketOwner"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/DeleteMarker :portkey.aws.s3.-2006-03-01.delete-object-output/VersionId :portkey.aws.s3.-2006-03-01/RequestCharged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metrics-filter/and (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/Tag :portkey.aws.s3.-2006-03-01.metrics-filter/And]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-destination/s3-bucket-destination (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventorys3-bucket-destination))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.inventory-destination/S3BucketDestination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-readacp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.jsoninput/type (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/jsontype))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/jsoninput (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.jsoninput/Type]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-acl-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-acl-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-acl-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-cannedacl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-acl-request/Bucket :portkey.aws.s3.-2006-03-01.put-object-acl-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01.put-object-acl-request/VersionId :portkey.aws.s3.-2006-03-01/ContentMD5 :portkey.aws.s3.-2006-03-01/GrantReadACP :portkey.aws.s3.-2006-03-01/AccessControlPolicy :portkey.aws.s3.-2006-03-01/GrantRead :portkey.aws.s3.-2006-03-01.put-object-acl-request/ACL :portkey.aws.s3.-2006-03-01/GrantWrite :portkey.aws.s3.-2006-03-01/GrantWriteACP :portkey.aws.s3.-2006-03-01/GrantFullControl :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/days-after-initiation clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-lifecycle-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-lifecycle-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-lifecycle-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-part-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/LastModified]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.get-bucket-metrics-configuration-request/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-versioning-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-versioning-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-versioning-request/Bucket :portkey.aws.s3.-2006-03-01/VersioningConfiguration] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5 :portkey.aws.s3.-2006-03-01/MFA]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.restore-request/type (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/restore-request-type))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Days :portkey.aws.s3.-2006-03-01/GlacierJobParameters :portkey.aws.s3.-2006-03-01.restore-request/Type :portkey.aws.s3.-2006-03-01/Tier :portkey.aws.s3.-2006-03-01/Description :portkey.aws.s3.-2006-03-01/SelectParameters :portkey.aws.s3.-2006-03-01/OutputLocation]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-rule-filter/and (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/replication-rule-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rule-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/Tag :portkey.aws.s3.-2006-03-01.replication-rule-filter/And]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/deleted-objects (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/deleted-object))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/start-after (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-output/contents (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-output/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-objects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/EncodingType :portkey.aws.s3.-2006-03-01/Marker :portkey.aws.s3.-2006-03-01/IsTruncated :portkey.aws.s3.-2006-03-01.list-objects-output/CommonPrefixes :portkey.aws.s3.-2006-03-01.list-objects-output/Contents :portkey.aws.s3.-2006-03-01/NextMarker :portkey.aws.s3.-2006-03-01/Delimiter :portkey.aws.s3.-2006-03-01.list-objects-output/Name :portkey.aws.s3.-2006-03-01/MaxKeys]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/SSES3 :portkey.aws.s3.-2006-03-01/SSEKMS]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/record-delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replace-key-prefix-with (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metrics-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01.metrics-and-operator/Tags]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-rule-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/expiration-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/transitions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/transition-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/noncurrent-version-transitions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/noncurrent-version-transition-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule/expiration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-expiration))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.lifecycle-rule/Status] :opt-un [:portkey.aws.s3.-2006-03-01.lifecycle-rule/Filter :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01.lifecycle-rule/Transitions :portkey.aws.s3.-2006-03-01/ID :portkey.aws.s3.-2006-03-01/NoncurrentVersionExpiration :portkey.aws.s3.-2006-03-01/AbortIncompleteMultipartUpload :portkey.aws.s3.-2006-03-01.lifecycle-rule/NoncurrentVersionTransitions :portkey.aws.s3.-2006-03-01.lifecycle-rule/Expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/parts (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/part))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-object-tagging-request/Bucket :portkey.aws.s3.-2006-03-01.put-object-tagging-request/Key :portkey.aws.s3.-2006-03-01/Tagging] :opt-un [:portkey.aws.s3.-2006-03-01.put-object-tagging-request/VersionId :portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/accept-ranges (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-accelerate-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-accelerate-configuration-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-status {"COMPLETE" "COMPLETE", :complete "COMPLETE", "PENDING" "PENDING", :pending "PENDING", "FAILED" "FAILED", :failed "FAILED", "REPLICA" "REPLICA", :replica "REPLICA"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-encryption-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-replication-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01.analytics-and-operator/Tags]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lambda-function-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/lambda-function-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/source-selection-criteria (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/SseKmsEncryptedObjects]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/access-control-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Grants :portkey.aws.s3.-2006-03-01/Owner]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.destination/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.destination/account (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/account-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.destination/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01.destination/Account :portkey.aws.s3.-2006-03-01/StorageClass :portkey.aws.s3.-2006-03-01/AccessControlTranslation :portkey.aws.s3.-2006-03-01/EncryptionConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/max-parts clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expiration-status {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bytes-returned clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/object))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-copy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-copy-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-copy-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-part-copy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.upload-part-copy-request/Bucket :portkey.aws.s3.-2006-03-01/CopySource :portkey.aws.s3.-2006-03-01.upload-part-copy-request/Key :portkey.aws.s3.-2006-03-01/PartNumber :portkey.aws.s3.-2006-03-01.upload-part-copy-request/UploadId] :opt-un [:portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/CopySourceSSECustomerKey :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKey :portkey.aws.s3.-2006-03-01/CopySourceIfMatch :portkey.aws.s3.-2006-03-01/CopySourceRange :portkey.aws.s3.-2006-03-01/CopySourceIfNoneMatch :portkey.aws.s3.-2006-03-01/CopySourceIfModifiedSince :portkey.aws.s3.-2006-03-01/CopySourceIfUnmodifiedSince :portkey.aws.s3.-2006-03-01/CopySourceSSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/CopySourceSSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-objects-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-objects-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-objects-request/Bucket :portkey.aws.s3.-2006-03-01/Delete] :opt-un [:portkey.aws.s3.-2006-03-01/MFA :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/filter-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-read (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-output/ContinuationToken :portkey.aws.s3.-2006-03-01/InventoryConfigurationList :portkey.aws.s3.-2006-03-01/IsTruncated :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-output/NextContinuationToken]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analyticss3-bucket-destination/format (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analyticss3-export-file-format))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analyticss3-bucket-destination/bucket-account-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/account-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analyticss3-bucket-destination/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analyticss3-bucket-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.analyticss3-bucket-destination/Format :portkey.aws.s3.-2006-03-01.analyticss3-bucket-destination/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01.analyticss3-bucket-destination/BucketAccountId :portkey.aws.s3.-2006-03-01/Prefix]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/inventory-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-part-number-marker clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-output/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-output/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-parts-output/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-parts-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.list-parts-output/Bucket :portkey.aws.s3.-2006-03-01/Parts :portkey.aws.s3.-2006-03-01/AbortDate :portkey.aws.s3.-2006-03-01/MaxParts :portkey.aws.s3.-2006-03-01/NextPartNumberMarker :portkey.aws.s3.-2006-03-01.list-parts-output/Key :portkey.aws.s3.-2006-03-01/IsTruncated :portkey.aws.s3.-2006-03-01/AbortRuleId :portkey.aws.s3.-2006-03-01/PartNumberMarker :portkey.aws.s3.-2006-03-01/Owner :portkey.aws.s3.-2006-03-01.list-parts-output/UploadId :portkey.aws.s3.-2006-03-01/StorageClass :portkey.aws.s3.-2006-03-01/RequestCharged :portkey.aws.s3.-2006-03-01/Initiator]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/noncurrent-version-transition-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/noncurrent-version-transition))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/event-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/event))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expression (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption {"AES256" "AES256", :aes256 "AES256", "aws:kms" "aws:kms", :aws:kms "aws:kms"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-cannedacl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-request/tagging (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.copy-object-request/Bucket :portkey.aws.s3.-2006-03-01/CopySource :portkey.aws.s3.-2006-03-01.copy-object-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01/ContentEncoding :portkey.aws.s3.-2006-03-01/TaggingDirective :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/CopySourceSSECustomerKey :portkey.aws.s3.-2006-03-01/WebsiteRedirectLocation :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/MetadataDirective :portkey.aws.s3.-2006-03-01/SSECustomerKey :portkey.aws.s3.-2006-03-01/GrantReadACP :portkey.aws.s3.-2006-03-01/GrantRead :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/ContentDisposition :portkey.aws.s3.-2006-03-01/CopySourceIfMatch :portkey.aws.s3.-2006-03-01/ContentType :portkey.aws.s3.-2006-03-01.copy-object-request/ACL :portkey.aws.s3.-2006-03-01/CopySourceIfNoneMatch :portkey.aws.s3.-2006-03-01/CopySourceIfModifiedSince :portkey.aws.s3.-2006-03-01/CopySourceIfUnmodifiedSince :portkey.aws.s3.-2006-03-01/CopySourceSSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/CopySourceSSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/Metadata :portkey.aws.s3.-2006-03-01/CacheControl :portkey.aws.s3.-2006-03-01/ContentLanguage :portkey.aws.s3.-2006-03-01/GrantWriteACP :portkey.aws.s3.-2006-03-01/GrantFullControl :portkey.aws.s3.-2006-03-01.copy-object-request/Tagging :portkey.aws.s3.-2006-03-01/StorageClass :portkey.aws.s3.-2006-03-01/Expires :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-logging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-logging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-logging-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-modified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/mfa (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/event {:s3:object-created:post "s3:ObjectCreated:Post", :s3:object-removed:delete-marker-created "s3:ObjectRemoved:DeleteMarkerCreated", "s3:ObjectCreated:*" "s3:ObjectCreated:*", "s3:ObjectRemoved:Delete" "s3:ObjectRemoved:Delete", "s3:ObjectRemoved:*" "s3:ObjectRemoved:*", "s3:ObjectRemoved:DeleteMarkerCreated" "s3:ObjectRemoved:DeleteMarkerCreated", :s3:object-created:put "s3:ObjectCreated:Put", :s3:object-created:copy "s3:ObjectCreated:Copy", :s3:object-created:complete-multipart-upload "s3:ObjectCreated:CompleteMultipartUpload", "s3:ObjectCreated:Copy" "s3:ObjectCreated:Copy", "s3:ObjectCreated:Post" "s3:ObjectCreated:Post", "s3:ObjectCreated:CompleteMultipartUpload" "s3:ObjectCreated:CompleteMultipartUpload", "s3:ReducedRedundancyLostObject" "s3:ReducedRedundancyLostObject", :s3:object-removed:delete "s3:ObjectRemoved:Delete", :s3:object-created:* "s3:ObjectCreated:*", "s3:ObjectCreated:Put" "s3:ObjectCreated:Put", :s3:reduced-redundancy-lost-object "s3:ReducedRedundancyLostObject", :s3:object-removed:* "s3:ObjectRemoved:*"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-cannedacl {"private" "private", :private "private", "public-read" "public-read", :public-read "public-read", "public-read-write" "public-read-write", :public-read-write "public-read-write", "authenticated-read" "authenticated-read", :authenticated-read "authenticated-read"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quote-character (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-request-type {"SELECT" "SELECT", :select "SELECT"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/end-event (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quiet clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-disposition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/RequestCharged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.error-document/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/error-document (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.error-document/Key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/redirect (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/HostName :portkey.aws.s3.-2006-03-01/HttpRedirectCode :portkey.aws.s3.-2006-03-01/Protocol :portkey.aws.s3.-2006-03-01/ReplaceKeyPrefixWith :portkey.aws.s3.-2006-03-01/ReplaceKeyWith]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/head-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/MissingMeta :portkey.aws.s3.-2006-03-01/ContentEncoding :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/WebsiteRedirectLocation :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01.head-object-output/VersionId :portkey.aws.s3.-2006-03-01/AcceptRanges :portkey.aws.s3.-2006-03-01/ReplicationStatus :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/ContentDisposition :portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/ContentType :portkey.aws.s3.-2006-03-01/Restore :portkey.aws.s3.-2006-03-01/ContentLength :portkey.aws.s3.-2006-03-01/LastModified :portkey.aws.s3.-2006-03-01/PartsCount :portkey.aws.s3.-2006-03-01/Metadata :portkey.aws.s3.-2006-03-01/CacheControl :portkey.aws.s3.-2006-03-01/ContentLanguage :portkey.aws.s3.-2006-03-01/StorageClass :portkey.aws.s3.-2006-03-01/DeleteMarker :portkey.aws.s3.-2006-03-01/RequestCharged :portkey.aws.s3.-2006-03-01/Expires :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/Expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/BytesScanned :portkey.aws.s3.-2006-03-01/BytesProcessed :portkey.aws.s3.-2006-03-01/BytesReturned]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.output-serialization/csv (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/csvoutput))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.output-serialization/json (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/jsonoutput))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/output-serialization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.output-serialization/CSV :portkey.aws.s3.-2006-03-01.output-serialization/JSON]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/priority clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-logs-permission {"FULL_CONTROL" "FULL_CONTROL", :full-control "FULL_CONTROL", "READ" "READ", :read "READ", "WRITE" "WRITE", :write "WRITE"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-cors-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/CORSRules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-if-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/http-error-code-returned-equals (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/user-metadata (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/metadata-entry))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-website-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/RedirectAllRequestsTo :portkey.aws.s3.-2006-03-01/IndexDocument :portkey.aws.s3.-2006-03-01/ErrorDocument :portkey.aws.s3.-2006-03-01/RoutingRules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/part-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/logging-enabled (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/TargetBucket :portkey.aws.s3.-2006-03-01/TargetPrefix] :opt-un [:portkey.aws.s3.-2006-03-01/TargetGrants]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/destination (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-destination))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/included-object-versions (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-included-object-versions))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/optional-fields (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-optional-fields))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventory-configuration/schedule (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-schedule))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.inventory-configuration/Destination :portkey.aws.s3.-2006-03-01/IsEnabled :portkey.aws.s3.-2006-03-01.inventory-configuration/Id :portkey.aws.s3.-2006-03-01.inventory-configuration/IncludedObjectVersions :portkey.aws.s3.-2006-03-01.inventory-configuration/Schedule] :opt-un [:portkey.aws.s3.-2006-03-01.inventory-configuration/Filter :portkey.aws.s3.-2006-03-01.inventory-configuration/OptionalFields]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-methods (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/allowed-method))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/etag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.restore-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.restore-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.restore-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.restore-object-request/Bucket :portkey.aws.s3.-2006-03-01.restore-object-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01.restore-object-request/VersionId :portkey.aws.s3.-2006-03-01/RestoreRequest :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-storage-class {:standard-ia "STANDARD_IA", "GLACIER" "GLACIER", :glacier "GLACIER", "ONEZONE_IA" "ONEZONE_IA", :reduced-redundancy "REDUCED_REDUNDANCY", "STANDARD_IA" "STANDARD_IA", "STANDARD" "STANDARD", :standard "STANDARD", "REDUCED_REDUNDANCY" "REDUCED_REDUNDANCY", :onezone-ia "ONEZONE_IA"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objectsv2-output/common-prefixes (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/common-prefix-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objectsv2-output/contents (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objectsv2-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objectsv2-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objectsv2-output/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-objectsv2-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/KeyCount :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/EncodingType :portkey.aws.s3.-2006-03-01/StartAfter :portkey.aws.s3.-2006-03-01/IsTruncated :portkey.aws.s3.-2006-03-01.list-objectsv2-output/CommonPrefixes :portkey.aws.s3.-2006-03-01.list-objectsv2-output/Contents :portkey.aws.s3.-2006-03-01.list-objectsv2-output/ContinuationToken :portkey.aws.s3.-2006-03-01/Delimiter :portkey.aws.s3.-2006-03-01.list-objectsv2-output/NextContinuationToken :portkey.aws.s3.-2006-03-01.list-objectsv2-output/Name :portkey.aws.s3.-2006-03-01/MaxKeys]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/max-uploads clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-rule-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rule-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01.replication-rule-and-operator/Tags]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metrics-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/owner-override {"Destination" "Destination", :destination "Destination"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/multipart-upload-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-replication-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete/objects (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete/Objects] :opt-un [:portkey.aws.s3.-2006-03-01/Quiet]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-cannedacl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/tagging (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tagging-header))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.create-multipart-upload-request/Bucket :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01/ContentEncoding :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/WebsiteRedirectLocation :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKey :portkey.aws.s3.-2006-03-01/GrantReadACP :portkey.aws.s3.-2006-03-01/GrantRead :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/ContentDisposition :portkey.aws.s3.-2006-03-01/ContentType :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/ACL :portkey.aws.s3.-2006-03-01/Metadata :portkey.aws.s3.-2006-03-01/CacheControl :portkey.aws.s3.-2006-03-01/ContentLanguage :portkey.aws.s3.-2006-03-01/GrantWriteACP :portkey.aws.s3.-2006-03-01/GrantFullControl :portkey.aws.s3.-2006-03-01.create-multipart-upload-request/Tagging :portkey.aws.s3.-2006-03-01/StorageClass :portkey.aws.s3.-2006-03-01/Expires :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-output/payload (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/select-object-content-event-stream))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/select-object-content-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.select-object-content-output/Payload]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-logging-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/LoggingEnabled]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.stats-event/details (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/stats))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/stats-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.stats-event/Details]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-versioning-status {"Enabled" "Enabled", :enabled "Enabled", "Suspended" "Suspended", :suspended "Suspended"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.head-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/head-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.head-object-request/Bucket :portkey.aws.s3.-2006-03-01.head-object-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/IfUnmodifiedSince :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKey :portkey.aws.s3.-2006-03-01.head-object-request/VersionId :portkey.aws.s3.-2006-03-01/IfModifiedSince :portkey.aws.s3.-2006-03-01/PartNumber :portkey.aws.s3.-2006-03-01/Range :portkey.aws.s3.-2006-03-01/IfMatch :portkey.aws.s3.-2006-03-01/IfNoneMatch :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/is-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/range (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/no-such-upload (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-included-object-versions {"All" "All", :all "All", "Current" "Current", :current "Current"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/no-such-bucket (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tag-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-by-default/ssealgorithm (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-by-default/kmsmaster-keyid (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/ssekmskey-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-by-default (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-by-default/SSEAlgorithm] :opt-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-by-default/KMSMasterKeyID]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/display-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.records-event/payload (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/body))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/records-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.records-event/Payload]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/corsrule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/AllowedMethods :portkey.aws.s3.-2006-03-01/AllowedOrigins] :opt-un [:portkey.aws.s3.-2006-03-01/AllowedHeaders :portkey.aws.s3.-2006-03-01/ExposeHeaders :portkey.aws.s3.-2006-03-01/MaxAgeSeconds]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Grantee :portkey.aws.s3.-2006-03-01/Permission]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/corsconfiguration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/CORSRules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/initiated clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-accelerate-configuration-output/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-accelerate-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-bucket-accelerate-configuration-output/Status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-object-versions-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-object-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-object-versions-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01/Delimiter :portkey.aws.s3.-2006-03-01/EncodingType :portkey.aws.s3.-2006-03-01/KeyMarker :portkey.aws.s3.-2006-03-01/MaxKeys :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/VersionIdMarker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-notification-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-notification-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-notification-configuration-request/Bucket :portkey.aws.s3.-2006-03-01/NotificationConfiguration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-length clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.topic-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/topic-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/TopicArn :portkey.aws.s3.-2006-03-01.topic-configuration/Events] :opt-un [:portkey.aws.s3.-2006-03-01.topic-configuration/Id :portkey.aws.s3.-2006-03-01.topic-configuration/Filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/is-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.progress-event/details (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/progress))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/progress-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.progress-event/Details]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objects-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-objects-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-objects-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01/Delimiter :portkey.aws.s3.-2006-03-01/EncodingType :portkey.aws.s3.-2006-03-01/Marker :portkey.aws.s3.-2006-03-01/MaxKeys :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/field-delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventorys3-bucket-destination/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventorys3-bucket-destination/format (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-format))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.inventorys3-bucket-destination/encryption (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-encryption))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventorys3-bucket-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.inventorys3-bucket-destination/Bucket :portkey.aws.s3.-2006-03-01.inventorys3-bucket-destination/Format] :opt-un [:portkey.aws.s3.-2006-03-01/AccountId :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01.inventorys3-bucket-destination/Encryption]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-metrics-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.put-bucket-metrics-configuration-request/Id :portkey.aws.s3.-2006-03-01/MetricsConfiguration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/csvoutput (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/QuoteFields :portkey.aws.s3.-2006-03-01/QuoteEscapeCharacter :portkey.aws.s3.-2006-03-01/RecordDelimiter :portkey.aws.s3.-2006-03-01/FieldDelimiter :portkey.aws.s3.-2006-03-01/QuoteCharacter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metadata-entry/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metadata-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.metadata-entry/value (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metadata-value))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.metadata-entry/Name :portkey.aws.s3.-2006-03-01.metadata-entry/Value]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-object-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/LastModified]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-if-none-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-website-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-frequency {"Daily" "Daily", :daily "Daily", "Weekly" "Weekly", :weekly "Weekly"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01.list-bucket-inventory-configurations-request/ContinuationToken]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expose-headers (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/expose-header))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/transition-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/transition))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-filter/and (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-and-operator))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/Tag :portkey.aws.s3.-2006-03-01.analytics-filter/And]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/RequestCharged :portkey.aws.s3.-2006-03-01/RestoreOutputPath]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-policy-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analyticss3-export-file-format {"CSV" "CSV", :csv "CSV"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/version-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__99112__auto__] (clojure.core/<= 1 (clojure.core/count s__99112__auto__)))))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-method (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-accelerate-status {"Enabled" "Enabled", :enabled "Enabled", "Suspended" "Suspended", :suspended "Suspended"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/protocol {"http" "http", :http "http", "https" "https", :https "https"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-replication-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-replication-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-replication-request/Bucket :portkey.aws.s3.-2006-03-01/ReplicationConfiguration] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/MissingMeta :portkey.aws.s3.-2006-03-01/ContentEncoding :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/WebsiteRedirectLocation :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01.get-object-output/VersionId :portkey.aws.s3.-2006-03-01/Body :portkey.aws.s3.-2006-03-01/ContentRange :portkey.aws.s3.-2006-03-01/AcceptRanges :portkey.aws.s3.-2006-03-01/ReplicationStatus :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/ContentDisposition :portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/ContentType :portkey.aws.s3.-2006-03-01/Restore :portkey.aws.s3.-2006-03-01/TagCount :portkey.aws.s3.-2006-03-01/ContentLength :portkey.aws.s3.-2006-03-01/LastModified :portkey.aws.s3.-2006-03-01/PartsCount :portkey.aws.s3.-2006-03-01/Metadata :portkey.aws.s3.-2006-03-01/CacheControl :portkey.aws.s3.-2006-03-01/ContentLanguage :portkey.aws.s3.-2006-03-01/StorageClass :portkey.aws.s3.-2006-03-01/DeleteMarker :portkey.aws.s3.-2006-03-01/RequestCharged :portkey.aws.s3.-2006-03-01/Expires :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/Expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-rule/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/replication-rule-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.replication-rule/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/replication-rule-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.replication-rule/Status :portkey.aws.s3.-2006-03-01/Destination] :opt-un [:portkey.aws.s3.-2006-03-01/ID :portkey.aws.s3.-2006-03-01/Priority :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01.replication-rule/Filter :portkey.aws.s3.-2006-03-01/SourceSelectionCriteria :portkey.aws.s3.-2006-03-01/DeleteMarkerReplication]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/redirect-all-requests-to (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/HostName] :opt-un [:portkey.aws.s3.-2006-03-01/Protocol]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-multipart-uploads-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-multipart-uploads-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-multipart-uploads-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01/Delimiter :portkey.aws.s3.-2006-03-01/EncodingType :portkey.aws.s3.-2006-03-01/KeyMarker :portkey.aws.s3.-2006-03-01/MaxUploads :portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/UploadIdMarker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-cors-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-multipart-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/Bucket :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/Key :portkey.aws.s3.-2006-03-01.abort-multipart-upload-request/UploadId] :opt-un [:portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/target-grants (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/target-grant))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/buckets (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/bucket))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-torrent-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-torrent-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-torrent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-torrent-request/Bucket :portkey.aws.s3.-2006-03-01.get-object-torrent-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.completed-multipart-upload/parts (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/completed-part-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/completed-multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.completed-multipart-upload/Parts]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/jsontype {"DOCUMENT" "DOCUMENT", :document "DOCUMENT", "LINES" "LINES", :lines "LINES"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.filter-rule/name (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/filter-rule-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.filter-rule/value (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/filter-rule-value))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/filter-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.filter-rule/Name :portkey.aws.s3.-2006-03-01.filter-rule/Value]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/replication-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.s3-key-filter/filter-rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/filter-rule-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/s3-key-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.s3-key-filter/FilterRules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/parts-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/complete-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/Bucket :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/VersionId :portkey.aws.s3.-2006-03-01/Location :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01.complete-multipart-upload-output/Key :portkey.aws.s3.-2006-03-01/RequestCharged :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/Expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-analytics-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.put-bucket-analytics-configuration-request/Id :portkey.aws.s3.-2006-03-01/AnalyticsConfiguration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-rule-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/target-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-acl-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-acl-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-acl-request/Bucket :portkey.aws.s3.-2006-03-01.get-object-acl-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01.get-object-acl-request/VersionId :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration-deprecated/topic-configuration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/topic-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration-deprecated/queue-configuration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/queue-configuration-deprecated))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.notification-configuration-deprecated/TopicConfiguration :portkey.aws.s3.-2006-03-01.notification-configuration-deprecated/QueueConfiguration :portkey.aws.s3.-2006-03-01/CloudFunctionConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-tagging-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-tagging-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.delete-object-tagging-output/VersionId]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-if-modified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-metrics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-metrics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/metrics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-metrics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-metrics-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.delete-bucket-metrics-configuration-request/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replace-key-with (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/kmscontext (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-acl-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/part (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/PartNumber :portkey.aws.s3.-2006-03-01/LastModified :portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/Size]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/part-number-marker clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration-filter/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/s3-key-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/notification-configuration-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.notification-configuration-filter/Key]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-location-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-location-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-location-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-part-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/RequestCharged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Owner :portkey.aws.s3.-2006-03-01/Grants]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/topic-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/suffix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lifecycle-rule-and-operator/tags (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/tag-set))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-rule-and-operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01.lifecycle-rule-and-operator/Tags]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-inventory-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.put-bucket-inventory-configuration-request/Id :portkey.aws.s3.-2006-03-01/InventoryConfiguration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-object-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-object-request/Bucket :portkey.aws.s3.-2006-03-01.get-object-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/ResponseExpires :portkey.aws.s3.-2006-03-01/IfUnmodifiedSince :portkey.aws.s3.-2006-03-01/ResponseContentDisposition :portkey.aws.s3.-2006-03-01/ResponseContentLanguage :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKey :portkey.aws.s3.-2006-03-01.get-object-request/VersionId :portkey.aws.s3.-2006-03-01/ResponseContentType :portkey.aws.s3.-2006-03-01/IfModifiedSince :portkey.aws.s3.-2006-03-01/PartNumber :portkey.aws.s3.-2006-03-01/Range :portkey.aws.s3.-2006-03-01/IfMatch :portkey.aws.s3.-2006-03-01/ResponseContentEncoding :portkey.aws.s3.-2006-03-01/IfNoneMatch :portkey.aws.s3.-2006-03-01/RequestPayer :portkey.aws.s3.-2006-03-01/ResponseCacheControl]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Payer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-configuration-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-tagging-output (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/TagSet] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-tagging-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-tagging-request/Bucket :portkey.aws.s3.-2006-03-01/Tagging] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.rule/expiration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-expiration))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.rule/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/expiration-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01.rule/Status] :opt-un [:portkey.aws.s3.-2006-03-01.rule/Expiration :portkey.aws.s3.-2006-03-01/ID :portkey.aws.s3.-2006-03-01/Transition :portkey.aws.s3.-2006-03-01/NoncurrentVersionTransition :portkey.aws.s3.-2006-03-01/NoncurrentVersionExpiration :portkey.aws.s3.-2006-03-01/AbortIncompleteMultipartUpload]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-bucket-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-cannedacl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.create-bucket-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/create-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.create-bucket-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01.create-bucket-request/ACL :portkey.aws.s3.-2006-03-01/CreateBucketConfiguration :portkey.aws.s3.-2006-03-01/GrantFullControl :portkey.aws.s3.-2006-03-01/GrantRead :portkey.aws.s3.-2006-03-01/GrantReadACP :portkey.aws.s3.-2006-03-01/GrantWrite :portkey.aws.s3.-2006-03-01/GrantWriteACP]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/routing-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Redirect] :opt-un [:portkey.aws.s3.-2006-03-01/Condition]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.noncurrent-version-expiration/noncurrent-days (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/days))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/noncurrent-version-expiration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.noncurrent-version-expiration/NoncurrentDays]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-analytics-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.delete-bucket-analytics-configuration-request/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/location-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-policy-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-marker-replication/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-marker-replication-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-replication (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.delete-marker-replication/Status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/select-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/InputSerialization :portkey.aws.s3.-2006-03-01/ExpressionType :portkey.aws.s3.-2006-03-01/Expression :portkey.aws.s3.-2006-03-01/OutputSerialization] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-configuration-output/rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-rules))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-bucket-lifecycle-configuration-output/Rules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tagging-header (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-version-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.ssekms/key-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/ssekmskey-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/ssekms (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.ssekms/KeyId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.deleted-object/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.deleted-object/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/deleted-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.deleted-object/Key :portkey.aws.s3.-2006-03-01.deleted-object/VersionId :portkey.aws.s3.-2006-03-01/DeleteMarker :portkey.aws.s3.-2006-03-01/DeleteMarkerVersionId]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/enable-request-progress clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/abort-incomplete-multipart-upload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/DaysAfterInitiation]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-location-output/location-constraint (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-location-constraint))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-location-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-bucket-location-output/LocationConstraint]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/InventoryConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.request-progress/enabled (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/enable-request-progress))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/request-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.request-progress/Enabled]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-versioning-output/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-versioning-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-versioning-output/mfadelete (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/mfadelete-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-versioning-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.get-bucket-versioning-output/Status :portkey.aws.s3.-2006-03-01.get-bucket-versioning-output/MFADelete]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.s3-location/prefix (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/location-prefix))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.s3-location/cannedacl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-cannedacl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.s3-location/access-control-list (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/grants))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/s3-location (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/BucketName :portkey.aws.s3.-2006-03-01.s3-location/Prefix] :opt-un [:portkey.aws.s3.-2006-03-01/Encryption :portkey.aws.s3.-2006-03-01.s3-location/CannedACL :portkey.aws.s3.-2006-03-01.s3-location/AccessControlList :portkey.aws.s3.-2006-03-01/Tagging :portkey.aws.s3.-2006-03-01/UserMetadata :portkey.aws.s3.-2006-03-01/StorageClass]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source-if-unmodified-since clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/http-redirect-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/uri (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-cannedacl {"authenticated-read" "authenticated-read", "public-read-write" "public-read-write", :bucket-owner-full-control "bucket-owner-full-control", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :authenticated-read "authenticated-read", "aws-exec-read" "aws-exec-read", :aws-exec-read "aws-exec-read", :bucket-owner-read "bucket-owner-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", :public-read-write "public-read-write", :public-read "public-read"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-optional-fields (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/inventory-optional-field))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/owner (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/DisplayName :portkey.aws.s3.-2006-03-01/ID]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/replication-rule-status {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/days clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/RequestCharged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-sourcessecustomer-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-identifier/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-identifier/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-identifier (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.object-identifier/Key] :opt-un [:portkey.aws.s3.-2006-03-01.object-identifier/VersionId]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-write (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.storage-class-analysis-data-export/output-schema-version (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/storage-class-analysis-schema-version))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.storage-class-analysis-data-export/destination (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-export-destination))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class-analysis-data-export (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.storage-class-analysis-data-export/OutputSchemaVersion :portkey.aws.s3.-2006-03-01.storage-class-analysis-data-export/Destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bytes-scanned clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-part-copy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/CopySourceVersionId :portkey.aws.s3.-2006-03-01/CopyPartResult :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/RequestCharged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-policy-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-policy-request/Bucket :portkey.aws.s3.-2006-03-01/Policy] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5 :portkey.aws.s3.-2006-03-01/ConfirmRemoveSelfBucketAccess]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-buckets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Buckets :portkey.aws.s3.-2006-03-01/Owner]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Expiration :portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01.put-object-output/VersionId :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/RequestCharged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bytes-processed clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-object-acl-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Owner :portkey.aws.s3.-2006-03-01/Grants :portkey.aws.s3.-2006-03-01/RequestCharged]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/stats (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/BytesScanned :portkey.aws.s3.-2006-03-01/BytesProcessed :portkey.aws.s3.-2006-03-01/BytesReturned]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quote-escape-character (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/corsrules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/corsrule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-tagging-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-object-tagging-request/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-object-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-object-tagging-request/Bucket :portkey.aws.s3.-2006-03-01.delete-object-tagging-request/Key] :opt-un [:portkey.aws.s3.-2006-03-01.delete-object-tagging-request/VersionId]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-sourcessecustomer-keymd5 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/metadata (clojure.spec.alpha/map-of :portkey.aws.s3.-2006-03-01/metadata-key :portkey.aws.s3.-2006-03-01/metadata-value))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cache-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/content-language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.bucket-lifecycle-configuration/rules (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lifecycle-rules))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-lifecycle-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.bucket-lifecycle-configuration/Rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-encryption-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-encryption-request/Bucket :portkey.aws.s3.-2006-03-01/ServerSideEncryptionConfiguration] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-output/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-output/next-continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/next-token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/IsTruncated :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-output/ContinuationToken :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-output/NextContinuationToken :portkey.aws.s3.-2006-03-01/AnalyticsConfigurationList]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/object-identifier))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-already-in-active-tier-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-version-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/object-version))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Policy]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objectsv2-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-objectsv2-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-objectsv2-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-objectsv2-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix :portkey.aws.s3.-2006-03-01/EncodingType :portkey.aws.s3.-2006-03-01/StartAfter :portkey.aws.s3.-2006-03-01.list-objectsv2-request/ContinuationToken :portkey.aws.s3.-2006-03-01/Delimiter :portkey.aws.s3.-2006-03-01/FetchOwner :portkey.aws.s3.-2006-03-01/MaxKeys :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-cors-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-cors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-cors-request/Bucket :portkey.aws.s3.-2006-03-01/CORSConfiguration] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/policy (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delimiter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-accelerate-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-accelerate-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-accelerate-configuration-request/Bucket :portkey.aws.s3.-2006-03-01/AccelerateConfiguration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.encryption/encryption-type (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.encryption/kmskey-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/ssekmskey-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.encryption/EncryptionType] :opt-un [:portkey.aws.s3.-2006-03-01.encryption/KMSKeyId :portkey.aws.s3.-2006-03-01/KMSContext]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-writeacp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.tag/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.tag/Key :portkey.aws.s3.-2006-03-01/Value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/HttpErrorCodeReturnedEquals :portkey.aws.s3.-2006-03-01/KeyPrefixEquals]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/fetch-owner clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expression-type {"SQL" "SQL", :sql "SQL"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grant-full-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.error/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.error/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.error/Key :portkey.aws.s3.-2006-03-01.error/VersionId :portkey.aws.s3.-2006-03-01/Code :portkey.aws.s3.-2006-03-01/Message]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-inventory-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.delete-bucket-inventory-configuration-request/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-inventory-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-inventory-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/inventory-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-inventory-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.get-bucket-inventory-configuration-request/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-content-encoding (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-version/storage-class (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-version/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.object-version/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ETag :portkey.aws.s3.-2006-03-01/Size :portkey.aws.s3.-2006-03-01.object-version/StorageClass :portkey.aws.s3.-2006-03-01.object-version/Key :portkey.aws.s3.-2006-03-01.object-version/VersionId :portkey.aws.s3.-2006-03-01/IsLatest :portkey.aws.s3.-2006-03-01/LastModified :portkey.aws.s3.-2006-03-01/Owner]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-configuration-request/lifecycle-configuration (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-lifecycle-configuration))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-configuration-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01.put-bucket-lifecycle-configuration-request/LifecycleConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.select-object-content-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/select-object-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.select-object-content-request/Bucket :portkey.aws.s3.-2006-03-01.select-object-content-request/Key :portkey.aws.s3.-2006-03-01/Expression :portkey.aws.s3.-2006-03-01/ExpressionType :portkey.aws.s3.-2006-03-01/InputSerialization :portkey.aws.s3.-2006-03-01/OutputSerialization] :opt-un [:portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKey :portkey.aws.s3.-2006-03-01/RequestProgress]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/target-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-version-storage-class {"STANDARD" "STANDARD", :standard "STANDARD"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/website-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ErrorDocument :portkey.aws.s3.-2006-03-01/IndexDocument :portkey.aws.s3.-2006-03-01/RedirectAllRequestsTo :portkey.aws.s3.-2006-03-01/RoutingRules]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-marker-entry/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-marker-entry/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Owner :portkey.aws.s3.-2006-03-01.delete-marker-entry/Key :portkey.aws.s3.-2006-03-01.delete-marker-entry/VersionId :portkey.aws.s3.-2006-03-01/IsLatest :portkey.aws.s3.-2006-03-01/LastModified]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.delete-bucket-tagging-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-bucket-tagging-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.delete-bucket-tagging-request/Bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/server-side-encryption-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration/topic-configurations (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/topic-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration/queue-configurations (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/queue-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.notification-configuration/lambda-function-configurations (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/lambda-function-configuration-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/notification-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.notification-configuration/TopicConfigurations :portkey.aws.s3.-2006-03-01.notification-configuration/QueueConfigurations :portkey.aws.s3.-2006-03-01.notification-configuration/LambdaFunctionConfigurations]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/QueueArn :portkey.aws.s3.-2006-03-01.queue-configuration/Events] :opt-un [:portkey.aws.s3.-2006-03-01.queue-configuration/Id :portkey.aws.s3.-2006-03-01.queue-configuration/Filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/tagging (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/TagSet] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/host-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/if-none-match (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/restore-output-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/storage-class {"STANDARD" "STANDARD", :standard "STANDARD", "REDUCED_REDUNDANCY" "REDUCED_REDUNDANCY", :reduced-redundancy "REDUCED_REDUNDANCY", "STANDARD_IA" "STANDARD_IA", :standard-ia "STANDARD_IA", "ONEZONE_IA" "ONEZONE_IA", :onezone-ia "ONEZONE_IA"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.server-side-encryption-rule/apply-server-side-encryption-by-default (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/server-side-encryption-by-default))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/server-side-encryption-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.server-side-encryption-rule/ApplyServerSideEncryptionByDefault]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-expiration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Date :portkey.aws.s3.-2006-03-01/Days :portkey.aws.s3.-2006-03-01/ExpiredObjectDeleteMarker]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/analytics-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-website-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-website-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-website-request/Bucket :portkey.aws.s3.-2006-03-01/WebsiteConfiguration] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/inventory-format {"CSV" "CSV", :csv "CSV", "ORC" "ORC", :orc "ORC"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/queue-configuration))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/no-such-key (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/grantee (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Type] :opt-un [:portkey.aws.s3.-2006-03-01/DisplayName :portkey.aws.s3.-2006-03-01/EmailAddress :portkey.aws.s3.-2006-03-01/ID :portkey.aws.s3.-2006-03-01/URI]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/key-prefix-equals (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.copy-object-output/version-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-version-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-object-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/CopySourceVersionId :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01.copy-object-output/VersionId :portkey.aws.s3.-2006-03-01/ServerSideEncryption :portkey.aws.s3.-2006-03-01/CopyObjectResult :portkey.aws.s3.-2006-03-01/RequestCharged :portkey.aws.s3.-2006-03-01/SSEKMSKeyId :portkey.aws.s3.-2006-03-01/Expiration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/file-header-info {"USE" "USE", :use "USE", "IGNORE" "IGNORE", :ignore "IGNORE", "NONE" "NONE", :none "NONE"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01.list-bucket-metrics-configurations-request/ContinuationToken]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.output-location/s3 (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/s3-location))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/output-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.output-location/S3]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-headers (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/allowed-header))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-origins (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/allowed-origin))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/copy-source (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__99114__auto__] (clojure.core/re-matches #"\/.+\/.+" s__99114__auto__))))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/queue (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/queue-arn))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/queue-configuration-deprecated (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/Id :portkey.aws.s3.-2006-03-01/Event :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/Events :portkey.aws.s3.-2006-03-01.queue-configuration-deprecated/Queue]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/request-charged {"requester" "requester", :requester "requester"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/MetricsConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expires clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/max-keys clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lifecycle-rules (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/lifecycle-rule))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/initiator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ID :portkey.aws.s3.-2006-03-01/DisplayName]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sses3 (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/max-age-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/email-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/bucket-location-constraint {:ap-northeast-1 "ap-northeast-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", "ap-southeast-2" "ap-southeast-2", "EU" "EU", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", :us-west-1 "us-west-1", "ap-southeast-1" "ap-southeast-1", :ap-southeast-1 "ap-southeast-1", :us-west-2 "us-west-2", :eu-central-1 "eu-central-1", :eu-west-1 "eu-west-1", "eu-central-1" "eu-central-1", "us-west-2" "us-west-2", "us-west-1" "us-west-1", :ap-southeast-2 "ap-southeast-2", "ap-south-1" "ap-south-1", :ap-south-1 "ap-south-1", :sa-east-1 "sa-east-1", :eu "EU", :cn-north-1 "cn-north-1"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-analytics-configuration-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.get-bucket-analytics-configuration-request/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.get-bucket-analytics-configuration-request/Bucket :portkey.aws.s3.-2006-03-01.get-bucket-analytics-configuration-request/Id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/ssekmskey-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/allowed-origin (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/object-not-in-active-tier-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.accelerate-configuration/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-accelerate-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/accelerate-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.accelerate-configuration/Status]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/events (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/event-list))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.lambda-function-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/lambda-function-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/LambdaFunctionArn :portkey.aws.s3.-2006-03-01.lambda-function-configuration/Events] :opt-un [:portkey.aws.s3.-2006-03-01.lambda-function-configuration/Id :portkey.aws.s3.-2006-03-01.lambda-function-configuration/Filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-marker-version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/csvinput (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/FileHeaderInfo :portkey.aws.s3.-2006-03-01/Comments :portkey.aws.s3.-2006-03-01/QuoteEscapeCharacter :portkey.aws.s3.-2006-03-01/RecordDelimiter :portkey.aws.s3.-2006-03-01/FieldDelimiter :portkey.aws.s3.-2006-03-01/QuoteCharacter :portkey.aws.s3.-2006-03-01/AllowQuotedRecordDelimiter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/is-latest clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-request/key (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/object-key))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.upload-part-request/upload-id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/multipart-upload-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/upload-part-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.upload-part-request/Bucket :portkey.aws.s3.-2006-03-01.upload-part-request/Key :portkey.aws.s3.-2006-03-01/PartNumber :portkey.aws.s3.-2006-03-01.upload-part-request/UploadId] :opt-un [:portkey.aws.s3.-2006-03-01/SSECustomerKeyMD5 :portkey.aws.s3.-2006-03-01/SSECustomerAlgorithm :portkey.aws.s3.-2006-03-01/SSECustomerKey :portkey.aws.s3.-2006-03-01/ContentMD5 :portkey.aws.s3.-2006-03-01/Body :portkey.aws.s3.-2006-03-01/ContentLength :portkey.aws.s3.-2006-03-01/RequestPayer]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.noncurrent-version-transition/noncurrent-days (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/days))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.noncurrent-version-transition/storage-class (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/transition-storage-class))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/noncurrent-version-transition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01.noncurrent-version-transition/NoncurrentDays :portkey.aws.s3.-2006-03-01.noncurrent-version-transition/StorageClass]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/quote-fields {"ALWAYS" "ALWAYS", :always "ALWAYS", "ASNEEDED" "ASNEEDED", :asneeded "ASNEEDED"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/index-document (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01/Suffix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/key-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/common-prefix (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/Prefix]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/next-upload-id-marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/parquet-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-configuration/id (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-id))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.analytics-configuration/filter (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/analytics-filter))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/analytics-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.analytics-configuration/Id :portkey.aws.s3.-2006-03-01/StorageClassAnalysis] :opt-un [:portkey.aws.s3.-2006-03-01.analytics-configuration/Filter]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/expiration (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-acl-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.put-bucket-acl-request/acl (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-cannedacl))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/put-bucket-acl-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.put-bucket-acl-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01/ContentMD5 :portkey.aws.s3.-2006-03-01/GrantReadACP :portkey.aws.s3.-2006-03-01/AccessControlPolicy :portkey.aws.s3.-2006-03-01/GrantRead :portkey.aws.s3.-2006-03-01.put-bucket-acl-request/ACL :portkey.aws.s3.-2006-03-01/GrantWrite :portkey.aws.s3.-2006-03-01/GrantWriteACP :portkey.aws.s3.-2006-03-01/GrantFullControl]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/cloud-function (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-request/bucket (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/bucket-name))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-request/continuation-token (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/token))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-request/Bucket] :opt-un [:portkey.aws.s3.-2006-03-01.list-bucket-analytics-configurations-request/ContinuationToken]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/request-payer {"requester" "requester", :requester "requester"})

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/response-cache-control (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/delete-markers (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/delete-marker-entry))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/get-bucket-replication-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.s3.-2006-03-01/ReplicationConfiguration]))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01.sse-kms-encrypted-objects/status (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects-status))
(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/sse-kms-encrypted-objects (clojure.spec.alpha/keys :req-un [:portkey.aws.s3.-2006-03-01.sse-kms-encrypted-objects/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.s3.-2006-03-01/errors (clojure.spec.alpha/coll-of :portkey.aws.s3.-2006-03-01/error))

(clojure.core/defn delete-bucket ([delete-bucket-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-request delete-bucket-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-logging ([get-bucket-logging-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-logging-request get-bucket-logging-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-logging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?logging", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-logging-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-logging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-logging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-logging-output))

(clojure.core/defn list-bucket-metrics-configurations ([list-bucket-metrics-configurations-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-list-bucket-metrics-configurations-request list-bucket-metrics-configurations-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-metrics-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-metrics-configurations-output))

(clojure.core/defn delete-bucket-lifecycle ([delete-bucket-lifecycle-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-lifecycle-request delete-bucket-lifecycle-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-lifecycle-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-lifecycle-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-policy ([get-bucket-policy-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-policy-request get-bucket-policy-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-policy-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-policy-output))

(clojure.core/defn put-bucket-versioning ([put-bucket-versioning-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-versioning-request put-bucket-versioning-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versioning", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-versioning-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-versioning :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-versioning-request) :ret clojure.core/true?)

(clojure.core/defn list-object-versions ([list-object-versions-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-list-object-versions-request list-object-versions-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-object-versions-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versions", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-object-versions-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-object-versions :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-object-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-object-versions-output))

(clojure.core/defn get-bucket-inventory-configuration ([get-bucket-inventory-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-inventory-configuration-request get-bucket-inventory-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-inventory-configuration-output))

(clojure.core/defn put-bucket-encryption ([put-bucket-encryption-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-encryption-request put-bucket-encryption-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-encryption-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-encryption-request) :ret clojure.core/true?)

(clojure.core/defn delete-object-tagging ([delete-object-tagging-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-object-tagging-request delete-object-tagging-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-object-tagging-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-object-tagging-output))

(clojure.core/defn get-object-tagging ([get-object-tagging-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-object-tagging-request get-object-tagging-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-tagging-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-tagging-output))

(clojure.core/defn get-bucket-replication ([get-bucket-replication-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-replication-request get-bucket-replication-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-replication-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-replication-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-replication-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-replication-output))

(clojure.core/defn put-bucket-replication ([put-bucket-replication-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-replication-request put-bucket-replication-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-replication-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-replication-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-analytics-configuration ([delete-bucket-analytics-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-analytics-configuration-request delete-bucket-analytics-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-analytics-configuration-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-analytics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-notification-configuration ([get-bucket-notification-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-notification-configuration-request get-bucket-notification-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/notification-configuration, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration))

(clojure.core/defn get-bucket-request-payment ([get-bucket-request-payment-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-request-payment-request get-bucket-request-payment-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?requestPayment", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-request-payment :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-request-payment-output))

(clojure.core/defn get-object-torrent ([get-object-torrent-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-object-torrent-request get-object-torrent-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-torrent-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?torrent", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-torrent-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-object-torrent :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-torrent-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-torrent-output))

(clojure.core/defn list-objects ([list-objects-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-list-objects-request list-objects-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-objects-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef list-objects :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-objects-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-objects-output))

(clojure.core/defn list-objectsv2 ([list-objectsv2-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-list-objectsv2-request list-objectsv2-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-objectsv2-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?list-type=2", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-objectsv2-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef list-objectsv2 :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-objectsv2-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-objectsv2-output))

(clojure.core/defn list-bucket-inventory-configurations ([list-bucket-inventory-configurations-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-list-bucket-inventory-configurations-request list-bucket-inventory-configurations-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-inventory-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-inventory-configurations-output))

(clojure.core/defn delete-bucket-cors ([delete-bucket-cors-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-cors-request delete-bucket-cors-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-cors-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-cors-request) :ret clojure.core/true?)

(clojure.core/defn put-object ([put-object-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-object-request put-object-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-output))

(clojure.core/defn list-multipart-uploads ([list-multipart-uploads-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-list-multipart-uploads-request list-multipart-uploads-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-multipart-uploads-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?uploads", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-multipart-uploads-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-multipart-uploads :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-multipart-uploads-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-multipart-uploads-output))

(clojure.core/defn put-bucket-lifecycle-configuration ([put-bucket-lifecycle-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-lifecycle-configuration-request put-bucket-lifecycle-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-configuration-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-configuration-request) :ret clojure.core/true?)

(clojure.core/defn head-bucket ([head-bucket-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-head-bucket-request head-bucket-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/head-bucket-request, :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"NoSuchBucket" :portkey.aws.s3.-2006-03-01/no-such-bucket}})))))
(clojure.spec.alpha/fdef head-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/head-bucket-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-inventory-configuration ([put-bucket-inventory-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-inventory-configuration-request put-bucket-inventory-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-inventory-configuration-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-inventory-configuration-request) :ret clojure.core/true?)

(clojure.core/defn create-bucket ([create-bucket-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-create-bucket-request create-bucket-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/create-bucket-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/create-bucket-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"BucketAlreadyExists" :portkey.aws.s3.-2006-03-01/bucket-already-exists, "BucketAlreadyOwnedByYou" :portkey.aws.s3.-2006-03-01/bucket-already-owned-by-you}})))))
(clojure.spec.alpha/fdef create-bucket :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/create-bucket-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/create-bucket-output))

(clojure.core/defn put-object-acl ([put-object-acl-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-object-acl-request put-object-acl-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?acl", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-acl-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef put-object-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-acl-output))

(clojure.core/defn put-bucket-notification ([put-bucket-notification-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-notification-request put-bucket-notification-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-notification-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-notification :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-notification-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-analytics-configuration ([get-bucket-analytics-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-analytics-configuration-request get-bucket-analytics-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-analytics-configuration-output))

(clojure.core/defn complete-multipart-upload ([complete-multipart-upload-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-complete-multipart-upload-request complete-multipart-upload-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/complete-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/complete-multipart-upload-request, :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef complete-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/complete-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/complete-multipart-upload-output))

(clojure.core/defn abort-multipart-upload ([abort-multipart-upload-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-abort-multipart-upload-request abort-multipart-upload-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/abort-multipart-upload-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"NoSuchUpload" :portkey.aws.s3.-2006-03-01/no-such-upload}})))))
(clojure.spec.alpha/fdef abort-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/abort-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/abort-multipart-upload-output))

(clojure.core/defn put-bucket-request-payment ([put-bucket-request-payment-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-request-payment-request put-bucket-request-payment-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?requestPayment", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-request-payment-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-request-payment :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-request-payment-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-analytics-configuration ([put-bucket-analytics-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-analytics-configuration-request put-bucket-analytics-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-analytics-configuration-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-analytics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-analytics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn restore-object ([restore-object-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-restore-object-request restore-object-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/restore-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?restore", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/restore-object-request, :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"ObjectAlreadyInActiveTierError" :portkey.aws.s3.-2006-03-01/object-already-in-active-tier-error}})))))
(clojure.spec.alpha/fdef restore-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/restore-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/restore-object-output))

(clojure.core/defn get-bucket-tagging ([get-bucket-tagging-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-tagging-request get-bucket-tagging-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-tagging-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-tagging-output))

(clojure.core/defn get-bucket-notification ([get-bucket-notification-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-notification-configuration-request get-bucket-notification-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-notification :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-notification-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/notification-configuration-deprecated))

(clojure.core/defn head-object ([head-object-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-head-object-request head-object-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/head-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/head-object-request, :http.request.configuration/method :head, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef head-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/head-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/head-object-output))

(clojure.core/defn delete-bucket-website ([delete-bucket-website-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-website-request delete-bucket-website-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-website-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-website-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-website ([get-bucket-website-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-website-request get-bucket-website-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-website-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-website-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-website-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-website-output))

(clojure.core/defn delete-bucket-replication ([delete-bucket-replication-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-replication-request delete-bucket-replication-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?replication", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-replication-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-replication :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-replication-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-metrics-configuration ([delete-bucket-metrics-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-metrics-configuration-request delete-bucket-metrics-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-metrics-configuration-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-metrics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn put-object-tagging ([put-object-tagging-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-object-tagging-request put-object-tagging-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/put-object-tagging-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?tagging", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-object-tagging-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-object-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-object-tagging-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/put-object-tagging-output))

(clojure.core/defn list-buckets ([] (list-buckets {})) ([_] (clojure.core/let [request-function-result__99527__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-buckets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.spec/input-spec nil, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-buckets :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-buckets-output))

(clojure.core/defn put-bucket-policy ([put-bucket-policy-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-policy-request put-bucket-policy-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-policy-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-policy-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-accelerate-configuration ([put-bucket-accelerate-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-accelerate-configuration-request put-bucket-accelerate-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?accelerate", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-accelerate-configuration-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-accelerate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-accelerate-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-acl ([get-bucket-acl-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-acl-request get-bucket-acl-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?acl", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-acl-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-acl-output))

(clojure.core/defn get-bucket-metrics-configuration ([get-bucket-metrics-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-metrics-configuration-request get-bucket-metrics-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-metrics-configuration-output))

(clojure.core/defn get-bucket-cors ([get-bucket-cors-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-cors-request get-bucket-cors-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-cors-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-cors-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-cors-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-cors-output))

(clojure.core/defn create-multipart-upload ([create-multipart-upload-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-create-multipart-upload-request create-multipart-upload-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/create-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?uploads", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/create-multipart-upload-request, :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/create-multipart-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/create-multipart-upload-output))

(clojure.core/defn delete-object ([delete-object-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-object-request delete-object-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-object-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-object-output))

(clojure.core/defn put-bucket-metrics-configuration ([put-bucket-metrics-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-metrics-configuration-request put-bucket-metrics-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?metrics", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-metrics-configuration-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-metrics-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-metrics-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-accelerate-configuration ([get-bucket-accelerate-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-accelerate-configuration-request get-bucket-accelerate-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?accelerate", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-accelerate-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-accelerate-configuration-output))

(clojure.core/defn delete-bucket-tagging ([delete-bucket-tagging-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-tagging-request delete-bucket-tagging-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-tagging-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-tagging-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-tagging ([put-bucket-tagging-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-tagging-request put-bucket-tagging-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?tagging", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-tagging-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-tagging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-tagging-request) :ret clojure.core/true?)

(clojure.core/defn list-parts ([list-parts-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-list-parts-request list-parts-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-parts-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-parts-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-parts :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-parts-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-parts-output))

(clojure.core/defn get-object-acl ([get-object-acl-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-object-acl-request get-object-acl-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-acl-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?acl", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-acl-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef get-object-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-acl-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-acl-output))

(clojure.core/defn upload-part-copy ([upload-part-copy-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-upload-part-copy-request upload-part-copy-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/upload-part-copy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/upload-part-copy-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef upload-part-copy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/upload-part-copy-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/upload-part-copy-output))

(clojure.core/defn get-bucket-lifecycle-configuration ([get-bucket-lifecycle-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-lifecycle-configuration-request get-bucket-lifecycle-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-lifecycle-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-configuration-output))

(clojure.core/defn delete-objects ([delete-objects-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-objects-request delete-objects-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/delete-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?delete", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-objects-request, :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-objects :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-objects-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/delete-objects-output))

(clojure.core/defn delete-bucket-inventory-configuration ([delete-bucket-inventory-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-inventory-configuration-request delete-bucket-inventory-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?inventory", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-inventory-configuration-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-inventory-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-inventory-configuration-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-website ([put-bucket-website-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-website-request put-bucket-website-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?website", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-website-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-website :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-website-request) :ret clojure.core/true?)

(clojure.core/defn get-bucket-location ([get-bucket-location-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-location-request get-bucket-location-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-location-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?location", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-location-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-location :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-location-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-location-output))

(clojure.core/defn get-bucket-encryption ([get-bucket-encryption-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-encryption-request get-bucket-encryption-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-encryption-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-encryption-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-encryption-output))

(clojure.core/defn upload-part ([upload-part-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-upload-part-request upload-part-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/upload-part-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/upload-part-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef upload-part :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/upload-part-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/upload-part-output))

(clojure.core/defn get-bucket-lifecycle ([get-bucket-lifecycle-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-lifecycle-request get-bucket-lifecycle-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-lifecycle-output))

(clojure.core/defn copy-object ([copy-object-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-copy-object-request copy-object-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/copy-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/copy-object-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"ObjectNotInActiveTierError" :portkey.aws.s3.-2006-03-01/object-not-in-active-tier-error}})))))
(clojure.spec.alpha/fdef copy-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/copy-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/copy-object-output))

(clojure.core/defn put-bucket-lifecycle ([put-bucket-lifecycle-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-lifecycle-request put-bucket-lifecycle-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?lifecycle", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-lifecycle-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-notification-configuration ([put-bucket-notification-configuration-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-notification-configuration-request put-bucket-notification-configuration-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?notification", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-notification-configuration-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-notification-configuration-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-policy ([delete-bucket-policy-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-policy-request delete-bucket-policy-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?policy", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-policy-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-policy :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-bucket-analytics-configurations ([list-bucket-analytics-configurations-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-list-bucket-analytics-configurations-request list-bucket-analytics-configurations-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?analytics", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-bucket-analytics-configurations :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/list-bucket-analytics-configurations-output))

(clojure.core/defn get-bucket-versioning ([get-bucket-versioning-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-bucket-versioning-request get-bucket-versioning-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-bucket-versioning-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?versioning", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-bucket-versioning-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-bucket-versioning :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-bucket-versioning-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-bucket-versioning-output))

(clojure.core/defn put-bucket-cors ([put-bucket-cors-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-cors-request put-bucket-cors-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?cors", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-cors-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-cors :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-cors-request) :ret clojure.core/true?)

(clojure.core/defn delete-bucket-encryption ([delete-bucket-encryption-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-delete-bucket-encryption-request delete-bucket-encryption-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?encryption", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/delete-bucket-encryption-request, :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-bucket-encryption :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/delete-bucket-encryption-request) :ret clojure.core/true?)

(clojure.core/defn select-object-content ([select-object-content-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-select-object-content-request select-object-content-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/select-object-content-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}?select&select-type=2", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/select-object-content-request, :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef select-object-content :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/select-object-content-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/select-object-content-output))

(clojure.core/defn get-object ([get-object-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-get-object-request get-object-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec :portkey.aws.s3.-2006-03-01/get-object-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}/{Key+}", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/get-object-request, :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.spec/error-spec {"NoSuchKey" :portkey.aws.s3.-2006-03-01/no-such-key}})))))
(clojure.spec.alpha/fdef get-object :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/get-object-request) :ret (clojure.spec.alpha/and :portkey.aws.s3.-2006-03-01/get-object-output))

(clojure.core/defn put-bucket-logging ([put-bucket-logging-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-logging-request put-bucket-logging-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?logging", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-logging-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-logging :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-logging-request) :ret clojure.core/true?)

(clojure.core/defn put-bucket-acl ([put-bucket-acl-request-input] (clojure.core/let [request-function-result__99527__auto__ (req<-put-bucket-acl-request put-bucket-acl-request-input)] (portkey.aws/-call-http (clojure.core/into request-function-result__99527__auto__ {:http.request.configuration/endpoints portkey.aws.s3.-2006-03-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/{Bucket}?acl", :http.request.spec/input-spec :portkey.aws.s3.-2006-03-01/put-bucket-acl-request, :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-bucket-acl :args (clojure.spec.alpha/tuple :portkey.aws.s3.-2006-03-01/put-bucket-acl-request) :ret clojure.core/true?)
